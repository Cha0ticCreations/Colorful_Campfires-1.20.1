package net.chaoticcreations.colorfulcampfires.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.Mth;
import net.minecraft.world.Clearable;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec2;

import java.util.Optional;

public class MangroveCampfireBlockEntity extends BlockEntity implements Clearable {
    private static final Vec2[] ITEM_SMOKE_OFFSETS = new Vec2[]{
            new Vec2(0.0F, 0.0F),
            new Vec2(0.4F, 0.0F),
            new Vec2(0.0F, 0.4F),
            new Vec2(0.4F, 0.4F)
    };

    private final NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);
    private final int[] cookingProgress = new int[4];
    private final int[] cookingTime = new int[4];
    private final RecipeManager.CachedCheck<Container, CampfireCookingRecipe> quickCheck = RecipeManager.createCheck(RecipeType.CAMPFIRE_COOKING);

    public MangroveCampfireBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MANGROVE_CAMPFIRE_BE.get(), pos, state);
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, MangroveCampfireBlockEntity blockEntity) {
        if (level.random.nextFloat() < 0.11F) {
            for (int i = 0; i < level.random.nextInt(2) + 2; ++i) {
                CampfireBlock.makeParticles(level, pos, state.getValue(CampfireBlock.SIGNAL_FIRE), false);
            }
        }

        NonNullList<ItemStack> nonnulllist = blockEntity.getItems();
        for (int j = 0; j < nonnulllist.size(); ++j) {
            if (!nonnulllist.get(j).isEmpty() && level.random.nextFloat() < 0.2F) {
                Direction direction = state.getValue(CampfireBlock.FACING);
                Vec2 vec2 = ITEM_SMOKE_OFFSETS[j];
                double d0 = (double) pos.getX() + 0.5 - (double) ((float) direction.getStepX() * 0.35F) + (double) ((float) direction.getClockWise().getStepX() * vec2.x);
                double d1 = (double) pos.getY() + 1.0;
                double d2 = (double) pos.getZ() + 0.5 - (double) ((float) direction.getStepZ() * 0.35F) + (double) ((float) direction.getClockWise().getStepZ() * vec2.x);
                level.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0, 0.1, 0.0);
            }
        }
    }

    public static void cookTick(Level level, BlockPos pos, BlockState state, MangroveCampfireBlockEntity blockEntity) {
        boolean flag = false;

        for (int i = 0; i < blockEntity.items.size(); ++i) {
            ItemStack itemstack = blockEntity.items.get(i);
            if (!itemstack.isEmpty()) {
                flag = true;
                blockEntity.cookingProgress[i]++;
                if (blockEntity.cookingProgress[i] >= blockEntity.cookingTime[i]) {
                    SimpleContainer simplecontainer = new SimpleContainer(itemstack);
                    ItemStack result = blockEntity.quickCheck.getRecipeFor(simplecontainer, level)
                            .map(recipe -> recipe.assemble(simplecontainer, level.registryAccess()))
                            .orElse(itemstack);
                    if (result.isItemEnabled(level.enabledFeatures())) {
                        net.minecraft.world.Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), result);
                        blockEntity.items.set(i, ItemStack.EMPTY);
                        level.sendBlockUpdated(pos, state, state, 3);
                    }
                }
            }
        }

        if (flag) {
            setChanged(level, pos, state);
        }
    }

    public static void cooldownTick(Level level, BlockPos pos, BlockState state, MangroveCampfireBlockEntity blockEntity) {
        boolean flag = false;

        for (int i = 0; i < blockEntity.items.size(); ++i) {
            if (blockEntity.cookingProgress[i] > 0) {
                flag = true;
                blockEntity.cookingProgress[i] = Mth.clamp(blockEntity.cookingProgress[i] - 2, 0, blockEntity.cookingTime[i]);
            }
        }

        if (flag) {
            setChanged(level, pos, state);
        }
    }

    public NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.items.clear();
        ListTag listtag = tag.getList("Items", 10);
        for (int i = 0; i < listtag.size(); ++i) {
            this.items.set(i, ItemStack.of(listtag.getCompound(i)));
        }
        if (tag.contains("CookingTimes", 11)) {
            int[] aint = tag.getIntArray("CookingTimes");
            System.arraycopy(aint, 0, this.cookingTime, 0, Math.min(this.cookingTime.length, aint.length));
        }

        if (tag.contains("CookingTotalTimes", 11)) {
            int[] aint1 = tag.getIntArray("CookingTotalTimes");
            System.arraycopy(aint1, 0, this.cookingProgress, 0, Math.min(this.cookingProgress.length, aint1.length));
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        ListTag listtag = new ListTag();
        for (ItemStack stack : this.items) {
            listtag.add(stack.save(new CompoundTag()));
        }
        tag.put("Items", listtag);
        tag.putIntArray("CookingTimes", this.cookingTime);
        tag.putIntArray("CookingTotalTimes", this.cookingProgress);
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag compoundtag = new CompoundTag();
        ListTag listtag = new ListTag();
        for (ItemStack stack : this.items) {
            listtag.add(stack.save(new CompoundTag()));
        }
        compoundtag.put("Items", listtag);
        return compoundtag;
    }

    public Optional<CampfireCookingRecipe> getCookableRecipe(ItemStack itemStack) {
        return this.quickCheck.getRecipeFor(new SimpleContainer(itemStack), this.level);
    }

    public boolean placeFood(ItemStack itemStack, int cookTime) {
        for (int i = 0; i < this.items.size(); ++i) {
            if (this.items.get(i).isEmpty()) {
                this.cookingTime[i] = cookTime;
                this.cookingProgress[i] = 0;
                this.items.set(i, itemStack.split(1));
                this.markUpdated();
                return true;
            }
        }
        return false;
    }

    private void markUpdated() {
        if (this.level != null) {
            this.setChanged();
            this.level.sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
        }
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }
}
