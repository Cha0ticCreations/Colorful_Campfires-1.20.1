package net.chaoticcreations.colorfulcampfires.item;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ColorfulCampfires.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COLORFUL_CAMPFIRES_TAB = CREATIVE_MODE_TABS.register("colorful_campfires_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BIRCH_CAMPFIRE_ITEM.get()))
                    .title(Component.translatable("creativetab.colorful_campfires_tab"))
                    .displayItems((pParameters, pOutput)->{

                        //pOutput.accept(ModItems.BIRCH_CAMPFIRE_ITEM.get());

                        // CAMPFIRES ORGANIZED BY COLOR VARIANT (MINECRAFT ORDER)
                        // Birch Variants

                        // === BASE VARIANT ===
                        pOutput.accept(ModBlocks.SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_CRIMSON_STEM_CAMPFIRE.get());

                        //OAK CAMPFIRE VARIANTS

                        //SPRUCE CAMPFIRE VARIANTS
                        // === NON-STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_SPRUCE_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_SPRUCE_DARK_CAMPFIRE.get());

                        // === STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_SPRUCE_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_SPRUCE_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get());

                        //BIRCH CAMPFIRE VARIANTS
                        // === NON-STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_BIRCH_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_BIRCH_DARK_CAMPFIRE.get());

                        // === STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_BIRCH_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // JUNGLE CAMPFIRE VARIANTS

                        // ACACIA CAMPFIRE VARIANTS

// === NON-STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_ACACIA_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_ACACIA_DARK_CAMPFIRE.get());

                        // === STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_ACACIA_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_ACACIA_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_ACACIA_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_ACACIA_DARK_CAMPFIRE.get());


                        // DARK OAK CAMPFIRE VARIANTS

                        // MANGROVE CAMPFIRE VARIANTS

                        // CHERRY CAMPFIRE VARIANTS

                        // CRIMSON CAMPFIRE VARIANTS
                        // === NON-STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_CRIMSON_STEM_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_CRIMSON_STEM_DARK_CAMPFIRE.get());

                        // === STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_CRIMSON_STEM_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get());


                        // WARPED CAMPFIRE VARIANTS
                        
// === NON-STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_WARPED_STEM_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_WARPED_STEM_DARK_CAMPFIRE.get());

                        // === STRIPPED CAMPFIRES ===
                        // regular (non-dark)
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_WARPED_STEM_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_WARPED_STEM_CAMPFIRE.get());

                        // dark
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BROWN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.RED_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.YELLOW_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GREEN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.CYAN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PURPLE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.MAGENTA_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get());



                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
