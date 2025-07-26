package net.chaoticcreations.colorfulcampfires.block.custom;

import net.chaoticcreations.colorfulcampfires.block.entity.ModBlockEntities;
import net.chaoticcreations.colorfulcampfires.block.entity.CyanStrippedSpruceDarkCampfireBlockEntity;
import net.chaoticcreations.colorfulcampfires.particle.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.particles.ParticleTypes;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

public class CyanStrippedSpruceDarkCampfireBlock extends CampfireBlock {

    public CyanStrippedSpruceDarkCampfireBlock(boolean spawnParticles, int fireDamage, Properties properties) {
        super(spawnParticles, fireDamage, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CyanStrippedSpruceDarkCampfireBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof CyanStrippedSpruceDarkCampfireBlockEntity campfire && !held.isEmpty()) {
            Optional<CampfireCookingRecipe> recipe = campfire.getCookableRecipe(held);
            if (recipe.isPresent() && campfire.placeFood(held, recipe.get().getCookingTime())) {
                if (!level.isClientSide) {
                    player.setItemInHand(hand, held);
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (state.getValue(LIT) && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entity)) {
            entity.hurt(level.damageSources().inFire(), (float)this.getFireDamage());
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            if (blockentity instanceof CyanStrippedSpruceDarkCampfireBlockEntity) {
                Containers.dropContents(level, pos, ((CyanStrippedSpruceDarkCampfireBlockEntity)blockentity).getItems());
            }
            super.onRemove(state, level, pos, newState, isMoving);
        }
    }

    @Override
    public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        BlockPos blockpos = hit.getBlockPos();
        if (!level.isClientSide && projectile.isOnFire() && projectile.mayInteract(level, blockpos) && !state.getValue(LIT) && !state.getValue(WATERLOGGED)) {
            level.setBlock(blockpos, state.setValue(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (state.getValue(LIT)) {
            if (random.nextInt(10) == 0) {
                level.playLocalSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.CAMPFIRE_CRACKLE, SoundSource.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
            }

            if (this.shouldSpawnParticles() && random.nextInt(5) == 0) {
                for(int i = 0; i < random.nextInt(1) + 1; ++i) {
                    level.addParticle(ModParticles.CYAN_DARK_FIRE_EMBERS.get(), (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D,
                            (double)pos.getZ() + 0.5D, (double)(random.nextFloat() / 2.0F), 5.0E-5D, (double)(random.nextFloat() / 2.0F));
                }
            }
        }
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide) {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), CyanStrippedSpruceDarkCampfireBlockEntity::clientTick) : null;
        } else {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), CyanStrippedSpruceDarkCampfireBlockEntity::cookTick) : createTickerHelper(blockEntityType, ModBlockEntities.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), CyanStrippedSpruceDarkCampfireBlockEntity::cooldownTick);
        }
    }

    // Helper methods 
    private int getFireDamage() {
        return 1; // Default campfire damage, adjust as needed
    }

    private boolean shouldSpawnParticles() {
        return true; // Default behavior, adjust as needed
    }
}
