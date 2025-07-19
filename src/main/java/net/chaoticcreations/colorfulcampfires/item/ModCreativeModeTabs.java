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

                        pOutput.accept(ModItems.BIRCH_CAMPFIRE_ITEM.get());

                        // CAMPFIRES ORGANIZED BY COLOR VARIANT
                        // Birch Variants

                        // === BASE VARIANT ===
                        pOutput.accept(ModBlocks.BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.STRIPPED_BIRCH_CAMPFIRE.get());

                        // === BLACK VARIANTS ===
                        pOutput.accept(ModBlocks.BLACK_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // === BLUE VARIANTS ===
                        pOutput.accept(ModBlocks.BLUE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());
                        
                        // === GRAY VARIANTS ===
                        pOutput.accept(ModBlocks.GRAY_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // === LIME VARIANTS ===
                        pOutput.accept(ModBlocks.LIME_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // === ORANGE VARIANTS ===
                        pOutput.accept(ModBlocks.ORANGE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // === PINK VARIANTS ===
                        pOutput.accept(ModBlocks.PINK_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.PINK_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                        // === WHITE VARIANTS ===
                        pOutput.accept(ModBlocks.WHITE_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.WHITE_BIRCH_DARK_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_BIRCH_CAMPFIRE.get());
                        pOutput.accept(ModBlocks.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
