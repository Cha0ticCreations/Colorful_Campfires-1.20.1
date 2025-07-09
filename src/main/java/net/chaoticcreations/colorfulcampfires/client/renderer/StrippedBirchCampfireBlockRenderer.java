package net.chaoticcreations.colorfulcampfires.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.chaoticcreations.colorfulcampfires.block.entity.StrippedBirchCampfireBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.CampfireBlock;

public class StrippedBirchCampfireBlockRenderer implements BlockEntityRenderer<StrippedBirchCampfireBlockEntity> {
    public StrippedBirchCampfireBlockRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(StrippedBirchCampfireBlockEntity entity, float partialTick, PoseStack poseStack, MultiBufferSource buffer,
                       int combinedLight, int combinedOverlay) {
        Direction direction = entity.getBlockState().getValue(CampfireBlock.FACING);
        NonNullList<ItemStack> items = entity.getItems();

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
                net.minecraft.client.Minecraft.getInstance().getItemRenderer().renderStatic(itemstack, ItemDisplayContext.FIXED, combinedLight, combinedOverlay, poseStack, buffer, entity.getLevel(), i + j);
                poseStack.popPose();
            }
        }
    }
}
