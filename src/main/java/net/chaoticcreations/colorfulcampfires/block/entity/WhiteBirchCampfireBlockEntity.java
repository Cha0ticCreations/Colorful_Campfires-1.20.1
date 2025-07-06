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

public class WhiteBirchCampfireBlockEntity extends BlockEntity implements Clearable {
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

    public WhiteBirchCampfireBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WHITE_BIRCH_CAMPFIRE_BE.get(), pos, state);
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, WhiteBirchCampfireBlockEntity blockEntity) {
        if (level.random.nextFloat() < 0.11F) {
            for (int i = 0; i < level.random.nextInt(2) + 2; ++i) {
                CampfireBlock.makeParticles(level, pos, state.getValue(CampfireBlock.SIGNAL_FIRE), false);
            }
        }

        NonNullList<ItemStack> nonnulllist = blockEntity.getItems();

        for (int j = 0; j < nonnulllist.size(); ++j) {
            ItemStack itemstack = nonnulllist.get(j);
            if (!itemstack.isEmpty()) {
                level.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.5D + level.random.nextGaussian() * 0.13D, (double)pos.getY() + 0.5D + level.random.nextGaussian() * 0.13D, (double)pos.getZ() + 0.5D + level.random.nextGaussian() * 0.13D, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public static void cookTick(Level level, BlockPos pos, BlockState state, WhiteBirchCampfireBlockEntity blockEntity) {
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

    public static void cooldownTick(Level level, BlockPos pos, BlockState state, WhiteBirchCampfireBlockEntity blockEntity) {
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
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        ListTag listtag = new ListTag();

        for (int i = 0; i < this.items.size(); ++i) {
            ItemStack itemstack = this.items.get(i);
            if (!itemstack.isEmpty()) {
                CompoundTag compoundtag = new CompoundTag();
                compoundtag.putByte("Slot", (byte)i);
                itemstack.save(compoundtag);
                listtag.add(compoundtag);
            }
        }

        tag.put("Items", listtag);
        int[] aint = new int[this.cookingTime.length];
        int[] aint1 = new int[this.cookingProgress.length];

        for (int j = 0; j < this.cookingTime.length; ++j) {
            aint[j] = this.cookingTime[j];
            aint1[j] = this.cookingProgress[j];
        }

        tag.putIntArray("CookingTimes", aint);
        tag.putIntArray("CookingTotalTimes", aint1);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.items.clear();
        ListTag listtag = tag.getList("Items", 10);

        for (int i = 0; i < listtag.size(); ++i) {
            CompoundTag compoundtag = listtag.getCompound(i);
            int j = compoundtag.getByte("Slot") & 255;
            if (j >= 0 && j < this.items.size()) {
                this.items.set(j, ItemStack.of(compoundtag));
            }
        }

        int[] aint = tag.getIntArray("CookingTimes");
        int[] aint1 = tag.getIntArray("CookingTotalTimes");

        for (int k = 0; k < Math.min(this.cookingTime.length, aint.length); ++k) {
            this.cookingTime[k] = aint[k];
            this.cookingProgress[k] = aint1[k];
        }
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag compoundtag = new CompoundTag();
        ListTag listtag = new ListTag();

        for (int i = 0; i < this.items.size(); ++i) {
            ItemStack itemstack = this.items.get(i);
            if (!itemstack.isEmpty()) {
                CompoundTag compoundtag1 = new CompoundTag();
                compoundtag1.putByte("Slot", (byte)i);
                itemstack.save(compoundtag1);
                listtag.add(compoundtag1);
            }
        }

        compoundtag.put("Items", listtag);
        return compoundtag;
    }

    public Optional<CampfireCookingRecipe> getCookableRecipe(ItemStack itemStack) {
        return this.items.stream().noneMatch(ItemStack::isEmpty) ? Optional.empty() : this.quickCheck.getRecipeFor(new SimpleContainer(itemStack), this.level);
    }

    public boolean placeFood(ItemStack itemStack, int cookTime) {
        for (int i = 0; i < this.items.size(); ++i) {
            ItemStack itemstack = this.items.get(i);
            if (itemstack.isEmpty()) {
                this.cookingTime[i] = cookTime;
                this.cookingProgress[i] = 0;
                this.items.set(i, itemStack.split(1));
                this.setChanged();
                return true;
            }
        }

        return false;
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }
}