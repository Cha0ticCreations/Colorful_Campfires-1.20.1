package net.chaoticcreations.colorfulcampfires.event;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.block.entity.ModBlockEntities;
import net.chaoticcreations.colorfulcampfires.client.renderer.UniversalCampfireBlockRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ColorfulCampfires.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        
        // REGISTER Block Entity Renderers for Campfires using Universal Renderer

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BASE VARIANT ===
        event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
    }
}