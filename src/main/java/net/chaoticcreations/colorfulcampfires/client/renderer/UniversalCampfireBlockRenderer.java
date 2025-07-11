package net.chaoticcreations.colorfulcampfires.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.Clearable;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;

/**
 * Universal campfire renderer that can work with any campfire block entity
 * that implements Clearable and has a getItems() method
 */
public class UniversalCampfireBlockRenderer<T extends BlockEntity & Clearable> implements BlockEntityRenderer<T> {
    
    public UniversalCampfireBlockRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(T entity, float partialTick, PoseStack poseStack, MultiBufferSource buffer,
                       int combinedLight, int combinedOverlay) {
        Direction direction = entity.getBlockState().getValue(CampfireBlock.FACING);
        
        // Get items using reflection or interface method
        NonNullList<ItemStack> items = getItemsFromEntity(entity);
        if (items == null) return;

        int i = (int)entity.getBlockPos().asLong();

        for(int j = 0; j < items.size(); ++j) {
            ItemStack itemstack = items.get(j);
            if (itemstack != ItemStack.EMPTY) {
                poseStack.pushPose();
                poseStack.translate(0.5F, 0.44921875F, 0.5F);
                Direction direction1 = Direction.from2DDataValue((j + direction.get2DDataValue()) % 4);
                float f = -direction1.toYRot();
                poseStack.mulPose(Axis.YP.rotationDegrees(f));
                poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));
                poseStack.translate(-0.3125F, -0.3125F, 0.0F);
                poseStack.scale(0.375F, 0.375F, 0.375F);
                net.minecraft.client.Minecraft.getInstance().getItemRenderer().renderStatic(
                    itemstack, ItemDisplayContext.FIXED, combinedLight, combinedOverlay,
                    poseStack, buffer, entity.getLevel(), i + j);
                poseStack.popPose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private NonNullList<ItemStack> getItemsFromEntity(T entity) {
        try {
            // Try to get items using reflection
            var getItemsMethod = entity.getClass().getMethod("getItems");
            return (NonNullList<ItemStack>) getItemsMethod.invoke(entity);
        } catch (Exception e) {
            // If reflection fails, return empty list
            return NonNullList.create();
        }
    }
}
