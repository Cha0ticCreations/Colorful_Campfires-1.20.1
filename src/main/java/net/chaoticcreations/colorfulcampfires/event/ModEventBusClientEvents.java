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
        event.registerBlockEntityRenderer(ModBlockEntities.SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_BIRCH_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // OAK CAMPFIRE VARIANTS

        // SPRUCE CAMPFIRE VARIANTS
        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_SPRUCE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        

        // BIRCH CAMPFIRE VARIANTS
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

        // JUNGLE CAMPFIRE VARIANTS
                // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_JUNGLE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);


        // ACACIA CAMPFIRE VARIANTS

        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_ACACIA_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_ACACIA_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // DARK OAK CAMPFIRE VARIANTS

        // MANGROVE CAMPFIRE VARIANTS
        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_MANGROVE_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // CHERRY CAMPFIRE VARIANTS
        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_CHERRY_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_CHERRY_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // CRIMSON CAMPFIRE VARIANTS
        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // WARPED CAMPFIRE VARIANTS
        // === BLACK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLACK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === BROWN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.BROWN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === CYAN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.CYAN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
       
        // === GREEN VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GREEN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT BLUE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIGHT GRAY VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === LIME VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.LIME_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === MAGENTA VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === ORANGE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PINK VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PINK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === PURPLE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === RED VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.RED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.RED_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === WHITE VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.WHITE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);

        // === YELLOW VARIANTS ===
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_WARPED_STEM_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE.get(), UniversalCampfireBlockRenderer::new);
    }
}