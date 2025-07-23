package net.chaoticcreations.colorfulcampfires.block;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;

//import net.chaoticcreations.colorfulcampfires.block.custom.ModCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.WhiteBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.WhiteBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.OrangeBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.OrangeBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LimeBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LimeBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.StrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LimeStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LimeStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.WhiteStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.WhiteStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.OrangeStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.OrangeStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlueBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlueBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlueStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlueStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PinkBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PinkBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PinkStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PinkStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlackBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlackBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlackStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.BlackStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.GrayBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.GrayBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.GrayStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.GrayStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LightGrayBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LightGrayBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LightGrayStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.LightGrayStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PurpleBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PurpleBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PurpleStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.PurpleStrippedBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.CyanBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.CyanBirchDarkCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.CyanStrippedBirchCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.CyanStrippedBirchDarkCampfireBlock;

import net.chaoticcreations.colorfulcampfires.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorfulCampfires.MOD_ID);

//start registry
//    public static final RegistryObject<CampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
//
//    public static final RegistryObject<CampfireBlock> WHITE_BIRCH_CAMPFIRE = registerBlock("white_birch_campfire",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
//
//    public static final RegistryObject<CampfireBlock> WHITE_BIRCH_DARK_CAMPFIRE = registerBlock("white_birch_dark_campfire",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

//    public static final RegistryObject<ModCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
//            ()->new ModCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    //REMEMBER TO REGISTER CAMPFIRE BLOCK


    // === BASE VARIANT ===
    public static final RegistryObject<BirchCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            ()->new BirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<StrippedBirchCampfireBlock> STRIPPED_BIRCH_CAMPFIRE = registerBlock("stripped_birch_campfire",
            ()->new StrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLACK VARIANTS ===
    public static final RegistryObject<BlackBirchCampfireBlock> BLACK_BIRCH_CAMPFIRE = registerBlock("black_birch_campfire",
            ()->new BlackBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackBirchDarkCampfireBlock> BLACK_BIRCH_DARK_CAMPFIRE = registerBlock("black_birch_dark_campfire",
            ()->new BlackBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedBirchCampfireBlock> BLACK_STRIPPED_BIRCH_CAMPFIRE = registerBlock("black_stripped_birch_campfire",
            ()->new BlackStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedBirchDarkCampfireBlock> BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("black_stripped_birch_dark_campfire",
            ()->new BlackStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueBirchCampfireBlock> BLUE_BIRCH_CAMPFIRE = registerBlock("blue_birch_campfire",
            ()->new BlueBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueBirchDarkCampfireBlock> BLUE_BIRCH_DARK_CAMPFIRE = registerBlock("blue_birch_dark_campfire",
            ()->new BlueBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedBirchCampfireBlock> BLUE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("blue_stripped_birch_campfire",
            ()->new BlueStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedBirchDarkCampfireBlock> BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("blue_stripped_birch_dark_campfire",
            ()->new BlueStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanBirchCampfireBlock> CYAN_BIRCH_CAMPFIRE = registerBlock("cyan_birch_campfire",
            ()->new CyanBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanBirchDarkCampfireBlock> CYAN_BIRCH_DARK_CAMPFIRE = registerBlock("cyan_birch_dark_campfire",
            ()->new CyanBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedBirchCampfireBlock> CYAN_STRIPPED_BIRCH_CAMPFIRE = registerBlock("cyan_stripped_birch_campfire",
            ()->new CyanStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedBirchDarkCampfireBlock> CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("cyan_stripped_birch_dark_campfire",
            ()->new CyanStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

  // === GRAY VARIANTS ===
    public static final RegistryObject<GrayBirchCampfireBlock> GRAY_BIRCH_CAMPFIRE = registerBlock("gray_birch_campfire",
            ()->new GrayBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayBirchDarkCampfireBlock> GRAY_BIRCH_DARK_CAMPFIRE = registerBlock("gray_birch_dark_campfire",
            ()->new GrayBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedBirchCampfireBlock> GRAY_STRIPPED_BIRCH_CAMPFIRE = registerBlock("gray_stripped_birch_campfire",
            ()->new GrayStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedBirchDarkCampfireBlock> GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("gray_stripped_birch_dark_campfire",
            ()->new GrayStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

// === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayBirchCampfireBlock> LIGHT_GRAY_BIRCH_CAMPFIRE = registerBlock("light_gray_birch_campfire",
            ()->new LightGrayBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayBirchDarkCampfireBlock> LIGHT_GRAY_BIRCH_DARK_CAMPFIRE = registerBlock("light_gray_birch_dark_campfire",
            ()->new LightGrayBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedBirchCampfireBlock> LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE = registerBlock("light_gray_stripped_birch_campfire",
                ()->new LightGrayStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedBirchDarkCampfireBlock> LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("light_gray_stripped_birch_dark_campfire",
                ()->new LightGrayStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeBirchCampfireBlock> LIME_BIRCH_CAMPFIRE = registerBlock("lime_birch_campfire",
            ()->new LimeBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeBirchDarkCampfireBlock> LIME_BIRCH_DARK_CAMPFIRE = registerBlock("lime_birch_dark_campfire",
            ()->new LimeBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedBirchCampfireBlock> LIME_STRIPPED_BIRCH_CAMPFIRE = registerBlock("lime_stripped_birch_campfire",
            ()->new LimeStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedBirchDarkCampfireBlock> LIME_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("lime_stripped_birch_dark_campfire",
            ()->new LimeStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeBirchCampfireBlock> ORANGE_BIRCH_CAMPFIRE = registerBlock("orange_birch_campfire",
            ()->new OrangeBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeBirchDarkCampfireBlock> ORANGE_BIRCH_DARK_CAMPFIRE = registerBlock("orange_birch_dark_campfire",
            ()->new OrangeBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedBirchCampfireBlock> ORANGE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("orange_stripped_birch_campfire",
            ()->new OrangeStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedBirchDarkCampfireBlock> ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("orange_stripped_birch_dark_campfire",
            ()->new OrangeStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkBirchCampfireBlock> PINK_BIRCH_CAMPFIRE = registerBlock("pink_birch_campfire",
            ()->new PinkBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkBirchDarkCampfireBlock> PINK_BIRCH_DARK_CAMPFIRE = registerBlock("pink_birch_dark_campfire",
            ()->new PinkBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedBirchCampfireBlock> PINK_STRIPPED_BIRCH_CAMPFIRE = registerBlock("pink_stripped_birch_campfire",
            ()->new PinkStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedBirchDarkCampfireBlock> PINK_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("pink_stripped_birch_dark_campfire",
            ()->new PinkStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleBirchCampfireBlock> PURPLE_BIRCH_CAMPFIRE = registerBlock("purple_birch_campfire",
            ()->new PurpleBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleBirchDarkCampfireBlock> PURPLE_BIRCH_DARK_CAMPFIRE = registerBlock("purple_birch_dark_campfire",
            ()->new PurpleBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedBirchCampfireBlock> PURPLE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("purple_stripped_birch_campfire",
            ()->new PurpleStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedBirchDarkCampfireBlock> PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("purple_stripped_birch_dark_campfire",
            ()->new PurpleStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteBirchCampfireBlock> WHITE_BIRCH_CAMPFIRE = registerBlock("white_birch_campfire",
            ()->new WhiteBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteBirchDarkCampfireBlock> WHITE_BIRCH_DARK_CAMPFIRE = registerBlock("white_birch_dark_campfire",
            ()->new WhiteBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedBirchCampfireBlock> WHITE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("white_stripped_birch_campfire",
            ()->new WhiteStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedBirchDarkCampfireBlock> WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("white_stripped_birch_dark_campfire",
            ()->new WhiteStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

       
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }


    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
