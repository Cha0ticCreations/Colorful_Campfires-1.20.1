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

        // === BASE VARIANT ===
        event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

 // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

    }
}