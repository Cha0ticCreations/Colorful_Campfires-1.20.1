package net.chaoticcreations.colorfulcampfires.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.chaoticcreations.colorfulcampfires.block.entity.BirchCampfireBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.CampfireBlock;

public class BirchCampfireBlockRenderer implements BlockEntityRenderer<BirchCampfireBlockEntity> {
    public BirchCampfireBlockRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(BirchCampfireBlockEntity entity, float partialTick, PoseStack poseStack, MultiBufferSource buffer,
                       int combinedLight, int combinedOverlay) {
        Direction direction = entity.getBlockState().getValue(CampfireBlock.FACING);
        NonNullList<ItemStack> items = entity.getItems();

//        for (int i = 0; i < items.size(); ++i) {
//            ItemStack stack = items.get(i);
//            if (!stack.isEmpty()) {
//                poseStack.pushPose();
//                // Positioning logic similar to vanilla
//                float x = (float) (i % 2) * 0.5F + 0.3F;
//                float z = (float) (i / 2) * 0.5F + 0.3F;
//                poseStack.translate(x, 0.44921875F, z);
//                // Lay item flat (horizontal)
//                poseStack.mulPose(com.mojang.math.Axis.XP.rotationDegrees(-90.0F));
//                // Optional: rotate for variety
//                float yRot = (float) (i * 90);
//
//                poseStack.scale(0.375F, 0.375F, 0.375F);
//                net.minecraft.client.Minecraft.getInstance().getItemRenderer().renderStatic(
//                        stack, ItemDisplayContext.FIXED, combinedLight, combinedOverlay, poseStack, buffer, entity.getLevel(), 0);
//                poseStack.popPose();
//            }
//        }
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
                net.minecraft.client.Minecraft.getInstance().getItemRenderer().renderStatic(itemstack, ItemDisplayContext.FIXED, combinedLight, combinedOverlay,
                        poseStack, buffer, entity.getLevel(), i + j);
                poseStack.popPose();
            }
        }
    }
}

