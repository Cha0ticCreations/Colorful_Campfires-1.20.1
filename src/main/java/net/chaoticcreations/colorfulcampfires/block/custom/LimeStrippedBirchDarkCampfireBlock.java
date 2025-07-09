package net.chaoticcreations.colorfulcampfires.block.custom;

import net.chaoticcreations.colorfulcampfires.block.entity.ModBlockEntities;
import net.chaoticcreations.colorfulcampfires.block.entity.LimeStrippedBirchDarkCampfireBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.phys.BlockHitResult;
import java.util.Optional;

public class LimeStrippedBirchDarkCampfireBlock extends CampfireBlock {
    public LimeStrippedBirchDarkCampfireBlock(boolean spawnParticles, int fireDamage, Properties properties) {
        super(spawnParticles, fireDamage, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LimeStrippedBirchDarkCampfireBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack held = player.getItemInHand(hand);
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof LimeStrippedBirchDarkCampfireBlockEntity campfire && !held.isEmpty()) {
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

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide) {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), LimeStrippedBirchDarkCampfireBlockEntity::clientTick) : null;
        } else {
            return state.getValue(LIT) ? createTickerHelper(blockEntityType, ModBlockEntities.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), LimeStrippedBirchDarkCampfireBlockEntity::cookTick) : createTickerHelper(blockEntityType, ModBlockEntities.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), LimeStrippedBirchDarkCampfireBlockEntity::cooldownTick);
        }
    }
}
