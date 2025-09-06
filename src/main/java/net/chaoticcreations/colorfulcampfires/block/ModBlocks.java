package net.chaoticcreations.colorfulcampfires.block;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;

//import net.chaoticcreations.colorfulcampfires.block.custom.ModCampfireBlock;

//Acacia Campfire Imports
//Spruce Campfire Imports
//Birch Campfire Imports
//Warped Campfire Imports
import net.chaoticcreations.colorfulcampfires.block.custom.*;
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


    // === BASE VARIANTS ===
    public static final RegistryObject<SpruceCampfireBlock> SPRUCE_CAMPFIRE = registerBlock("spruce_campfire",
            ()->new SpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<StrippedSpruceCampfireBlock> STRIPPED_SPRUCE_CAMPFIRE = registerBlock("stripped_spruce_campfire",
            ()->new StrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BirchCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            ()->new BirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<StrippedBirchCampfireBlock> STRIPPED_BIRCH_CAMPFIRE = registerBlock("stripped_birch_campfire",
            ()->new StrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<AcaciaCampfireBlock> ACACIA_CAMPFIRE = registerBlock("acacia_campfire",
                ()->new AcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<StrippedAcaciaCampfireBlock> STRIPPED_ACACIA_CAMPFIRE = registerBlock("stripped_acacia_campfire",
                ()->new StrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<WarpedStemCampfireBlock> WARPED_STEM_CAMPFIRE = registerBlock("warped_stem_campfire",
                ()->new WarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<StrippedWarpedStemCampfireBlock> STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("stripped_warped_stem_campfire",
                ()->new StrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<CrimsonStemCampfireBlock> CRIMSON_STEM_CAMPFIRE = registerBlock("crimson_stem_campfire",
                ()->new CrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<StrippedCrimsonStemCampfireBlock> STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("stripped_crimson_stem_campfire",
                ()->new StrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<MangroveCampfireBlock> MANGROVE_CAMPFIRE = registerBlock("mangrove_campfire",
                ()->new MangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<StrippedMangroveCampfireBlock> STRIPPED_MANGROVE_CAMPFIRE = registerBlock("stripped_mangrove_campfire",
                ()->new StrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<JungleCampfireBlock> JUNGLE_CAMPFIRE = registerBlock("jungle_campfire",
                ()->new JungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<StrippedJungleCampfireBlock> STRIPPED_JUNGLE_CAMPFIRE = registerBlock("stripped_jungle_campfire",
                ()->new StrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));



//OAK CAMPFIRE VARIANTS

//SPRUCE CAMPFIRE VARIANTS

 // === BLACK VARIANTS ===
    public static final RegistryObject<BlackSpruceCampfireBlock> BLACK_SPRUCE_CAMPFIRE = registerBlock("black_spruce_campfire",
            ()->new BlackSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackSpruceDarkCampfireBlock> BLACK_SPRUCE_DARK_CAMPFIRE = registerBlock("black_spruce_dark_campfire",
            ()->new BlackSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedSpruceCampfireBlock> BLACK_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("black_stripped_spruce_campfire",
            ()->new BlackStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedSpruceDarkCampfireBlock> BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("black_stripped_spruce_dark_campfire",
            ()->new BlackStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueSpruceCampfireBlock> BLUE_SPRUCE_CAMPFIRE = registerBlock("blue_spruce_campfire",
            ()->new BlueSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueSpruceDarkCampfireBlock> BLUE_SPRUCE_DARK_CAMPFIRE = registerBlock("blue_spruce_dark_campfire",
            ()->new BlueSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedSpruceCampfireBlock> BLUE_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("blue_stripped_spruce_campfire",
            ()->new BlueStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedSpruceDarkCampfireBlock> BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("blue_stripped_spruce_dark_campfire",
            ()->new BlueStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownSpruceCampfireBlock> BROWN_SPRUCE_CAMPFIRE = registerBlock("brown_spruce_campfire",
            ()->new BrownSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownSpruceDarkCampfireBlock> BROWN_SPRUCE_DARK_CAMPFIRE = registerBlock("brown_spruce_dark_campfire",
            ()->new BrownSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedSpruceCampfireBlock> BROWN_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("brown_stripped_spruce_campfire",
            ()->new BrownStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedSpruceDarkCampfireBlock> BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("brown_stripped_spruce_dark_campfire",
            ()->new BrownStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanSpruceCampfireBlock> CYAN_SPRUCE_CAMPFIRE = registerBlock("cyan_spruce_campfire",
            ()->new CyanSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanSpruceDarkCampfireBlock> CYAN_SPRUCE_DARK_CAMPFIRE = registerBlock("cyan_spruce_dark_campfire",
            ()->new CyanSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedSpruceCampfireBlock> CYAN_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("cyan_stripped_spruce_campfire",
            ()->new CyanStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedSpruceDarkCampfireBlock> CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("cyan_stripped_spruce_dark_campfire",
            ()->new CyanStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

  // === GRAY VARIANTS ===
    public static final RegistryObject<GraySpruceCampfireBlock> GRAY_SPRUCE_CAMPFIRE = registerBlock("gray_spruce_campfire",
            ()->new GraySpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GraySpruceDarkCampfireBlock> GRAY_SPRUCE_DARK_CAMPFIRE = registerBlock("gray_spruce_dark_campfire",
            ()->new GraySpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedSpruceCampfireBlock> GRAY_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("gray_stripped_spruce_campfire",
            ()->new GrayStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedSpruceDarkCampfireBlock> GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("gray_stripped_spruce_dark_campfire",
            ()->new GrayStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenSpruceCampfireBlock> GREEN_SPRUCE_CAMPFIRE = registerBlock("green_spruce_campfire",
            ()->new GreenSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenSpruceDarkCampfireBlock> GREEN_SPRUCE_DARK_CAMPFIRE = registerBlock("green_spruce_dark_campfire",
            ()->new GreenSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedSpruceCampfireBlock> GREEN_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("green_stripped_spruce_campfire",
            ()->new GreenStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedSpruceDarkCampfireBlock> GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("green_stripped_spruce_dark_campfire",
            ()->new GreenStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueSpruceCampfireBlock> LIGHT_BLUE_SPRUCE_CAMPFIRE = registerBlock("light_blue_spruce_campfire",
            ()->new LightBlueSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueSpruceDarkCampfireBlock> LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE = registerBlock("light_blue_spruce_dark_campfire",
            ()->new LightBlueSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedSpruceCampfireBlock> LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("light_blue_stripped_spruce_campfire",
            ()->new LightBlueStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedSpruceDarkCampfireBlock> LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("light_blue_stripped_spruce_dark_campfire",
            ()->new LightBlueStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGraySpruceCampfireBlock> LIGHT_GRAY_SPRUCE_CAMPFIRE = registerBlock("light_gray_spruce_campfire",
            ()->new LightGraySpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGraySpruceDarkCampfireBlock> LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE = registerBlock("light_gray_spruce_dark_campfire",
            ()->new LightGraySpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedSpruceCampfireBlock> LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("light_gray_stripped_spruce_campfire",
                ()->new LightGrayStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedSpruceDarkCampfireBlock> LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("light_gray_stripped_spruce_dark_campfire",
                ()->new LightGrayStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeSpruceCampfireBlock> LIME_SPRUCE_CAMPFIRE = registerBlock("lime_spruce_campfire",
            ()->new LimeSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeSpruceDarkCampfireBlock> LIME_SPRUCE_DARK_CAMPFIRE = registerBlock("lime_spruce_dark_campfire",
            ()->new LimeSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedSpruceCampfireBlock> LIME_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("lime_stripped_spruce_campfire",
            ()->new LimeStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedSpruceDarkCampfireBlock> LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("lime_stripped_spruce_dark_campfire",
            ()->new LimeStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaSpruceCampfireBlock> MAGENTA_SPRUCE_CAMPFIRE = registerBlock("magenta_spruce_campfire",
            ()->new MagentaSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaSpruceDarkCampfireBlock> MAGENTA_SPRUCE_DARK_CAMPFIRE = registerBlock("magenta_spruce_dark_campfire",
            ()->new MagentaSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedSpruceCampfireBlock> MAGENTA_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("magenta_stripped_spruce_campfire",
            ()->new MagentaStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedSpruceDarkCampfireBlock> MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("magenta_stripped_spruce_dark_campfire",
            ()->new MagentaStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeSpruceCampfireBlock> ORANGE_SPRUCE_CAMPFIRE = registerBlock("orange_spruce_campfire",
            ()->new OrangeSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeSpruceDarkCampfireBlock> ORANGE_SPRUCE_DARK_CAMPFIRE = registerBlock("orange_spruce_dark_campfire",
            ()->new OrangeSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedSpruceCampfireBlock> ORANGE_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("orange_stripped_spruce_campfire",
            ()->new OrangeStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedSpruceDarkCampfireBlock> ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("orange_stripped_spruce_dark_campfire",
            ()->new OrangeStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkSpruceCampfireBlock> PINK_SPRUCE_CAMPFIRE = registerBlock("pink_spruce_campfire",
            ()->new PinkSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkSpruceDarkCampfireBlock> PINK_SPRUCE_DARK_CAMPFIRE = registerBlock("pink_spruce_dark_campfire",
            ()->new PinkSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedSpruceCampfireBlock> PINK_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("pink_stripped_spruce_campfire",
            ()->new PinkStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedSpruceDarkCampfireBlock> PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("pink_stripped_spruce_dark_campfire",
            ()->new PinkStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleSpruceCampfireBlock> PURPLE_SPRUCE_CAMPFIRE = registerBlock("purple_spruce_campfire",
            ()->new PurpleSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleSpruceDarkCampfireBlock> PURPLE_SPRUCE_DARK_CAMPFIRE = registerBlock("purple_spruce_dark_campfire",
            ()->new PurpleSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedSpruceCampfireBlock> PURPLE_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("purple_stripped_spruce_campfire",
            ()->new PurpleStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedSpruceDarkCampfireBlock> PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("purple_stripped_spruce_dark_campfire",
            ()->new PurpleStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedSpruceCampfireBlock> RED_SPRUCE_CAMPFIRE = registerBlock("red_spruce_campfire",
            ()->new RedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedSpruceDarkCampfireBlock> RED_SPRUCE_DARK_CAMPFIRE = registerBlock("red_spruce_dark_campfire",
            ()->new RedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedSpruceCampfireBlock> RED_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("red_stripped_spruce_campfire",
            ()->new RedStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedSpruceDarkCampfireBlock> RED_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("red_stripped_spruce_dark_campfire",
            ()->new RedStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteSpruceCampfireBlock> WHITE_SPRUCE_CAMPFIRE = registerBlock("white_spruce_campfire",
            ()->new WhiteSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteSpruceDarkCampfireBlock> WHITE_SPRUCE_DARK_CAMPFIRE = registerBlock("white_spruce_dark_campfire",
            ()->new WhiteSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedSpruceCampfireBlock> WHITE_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("white_stripped_spruce_campfire",
            ()->new WhiteStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedSpruceDarkCampfireBlock> WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("white_stripped_spruce_dark_campfire",
            ()->new WhiteStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowSpruceCampfireBlock> YELLOW_SPRUCE_CAMPFIRE = registerBlock("yellow_spruce_campfire",
            ()->new YellowSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowSpruceDarkCampfireBlock> YELLOW_SPRUCE_DARK_CAMPFIRE = registerBlock("yellow_spruce_dark_campfire",
            ()->new YellowSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedSpruceCampfireBlock> YELLOW_STRIPPED_SPRUCE_CAMPFIRE = registerBlock("yellow_stripped_spruce_campfire",
            ()->new YellowStrippedSpruceCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedSpruceDarkCampfireBlock> YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE = registerBlock("yellow_stripped_spruce_dark_campfire",
            ()->new YellowStrippedSpruceDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

// BIRCH CAMPFIRE VARIANTS

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

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownBirchCampfireBlock> BROWN_BIRCH_CAMPFIRE = registerBlock("brown_birch_campfire",
            ()->new BrownBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownBirchDarkCampfireBlock> BROWN_BIRCH_DARK_CAMPFIRE = registerBlock("brown_birch_dark_campfire",
            ()->new BrownBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedBirchCampfireBlock> BROWN_STRIPPED_BIRCH_CAMPFIRE = registerBlock("brown_stripped_birch_campfire",
            ()->new BrownStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedBirchDarkCampfireBlock> BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("brown_stripped_birch_dark_campfire",
            ()->new BrownStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


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

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenBirchCampfireBlock> GREEN_BIRCH_CAMPFIRE = registerBlock("green_birch_campfire",
            ()->new GreenBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenBirchDarkCampfireBlock> GREEN_BIRCH_DARK_CAMPFIRE = registerBlock("green_birch_dark_campfire",
            ()->new GreenBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedBirchCampfireBlock> GREEN_STRIPPED_BIRCH_CAMPFIRE = registerBlock("green_stripped_birch_campfire",
            ()->new GreenStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedBirchDarkCampfireBlock> GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("green_stripped_birch_dark_campfire",
            ()->new GreenStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueBirchCampfireBlock> LIGHT_BLUE_BIRCH_CAMPFIRE = registerBlock("light_blue_birch_campfire",
            ()->new LightBlueBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueBirchDarkCampfireBlock> LIGHT_BLUE_BIRCH_DARK_CAMPFIRE = registerBlock("light_blue_birch_dark_campfire",
            ()->new LightBlueBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedBirchCampfireBlock> LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("light_blue_stripped_birch_campfire",
            ()->new LightBlueStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedBirchDarkCampfireBlock> LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("light_blue_stripped_birch_dark_campfire",
            ()->new LightBlueStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


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

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaBirchCampfireBlock> MAGENTA_BIRCH_CAMPFIRE = registerBlock("magenta_birch_campfire",
            ()->new MagentaBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaBirchDarkCampfireBlock> MAGENTA_BIRCH_DARK_CAMPFIRE = registerBlock("magenta_birch_dark_campfire",
            ()->new MagentaBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedBirchCampfireBlock> MAGENTA_STRIPPED_BIRCH_CAMPFIRE = registerBlock("magenta_stripped_birch_campfire",
            ()->new MagentaStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedBirchDarkCampfireBlock> MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("magenta_stripped_birch_dark_campfire",
            ()->new MagentaStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

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

    // === RED VARIANTS ===
    public static final RegistryObject<RedBirchCampfireBlock> RED_BIRCH_CAMPFIRE = registerBlock("red_birch_campfire",
            ()->new RedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedBirchDarkCampfireBlock> RED_BIRCH_DARK_CAMPFIRE = registerBlock("red_birch_dark_campfire",
            ()->new RedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedBirchCampfireBlock> RED_STRIPPED_BIRCH_CAMPFIRE = registerBlock("red_stripped_birch_campfire",
            ()->new RedStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedBirchDarkCampfireBlock> RED_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("red_stripped_birch_dark_campfire",
            ()->new RedStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteBirchCampfireBlock> WHITE_BIRCH_CAMPFIRE = registerBlock("white_birch_campfire",
            ()->new WhiteBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteBirchDarkCampfireBlock> WHITE_BIRCH_DARK_CAMPFIRE = registerBlock("white_birch_dark_campfire",
            ()->new WhiteBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedBirchCampfireBlock> WHITE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("white_stripped_birch_campfire",
            ()->new WhiteStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedBirchDarkCampfireBlock> WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("white_stripped_birch_dark_campfire",
            ()->new WhiteStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowBirchCampfireBlock> YELLOW_BIRCH_CAMPFIRE = registerBlock("yellow_birch_campfire",
            ()->new YellowBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowBirchDarkCampfireBlock> YELLOW_BIRCH_DARK_CAMPFIRE = registerBlock("yellow_birch_dark_campfire",
            ()->new YellowBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedBirchCampfireBlock> YELLOW_STRIPPED_BIRCH_CAMPFIRE = registerBlock("yellow_stripped_birch_campfire",
            ()->new YellowStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedBirchDarkCampfireBlock> YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("yellow_stripped_birch_dark_campfire",
            ()->new YellowStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // JUNGLE CAMPFIRE VARIANTS
// === BLACK VARIANTS ===
    public static final RegistryObject<BlackJungleCampfireBlock> BLACK_JUNGLE_CAMPFIRE = registerBlock("black_jungle_campfire",
            ()->new BlackJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackJungleDarkCampfireBlock> BLACK_JUNGLE_DARK_CAMPFIRE = registerBlock("black_jungle_dark_campfire",
            ()->new BlackJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedJungleCampfireBlock> BLACK_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("black_stripped_jungle_campfire",
            ()->new BlackStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedJungleDarkCampfireBlock> BLACK_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("black_stripped_jungle_dark_campfire",
            ()->new BlackStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueJungleCampfireBlock> BLUE_JUNGLE_CAMPFIRE = registerBlock("blue_jungle_campfire",
            ()->new BlueJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueJungleDarkCampfireBlock> BLUE_JUNGLE_DARK_CAMPFIRE = registerBlock("blue_jungle_dark_campfire",
            ()->new BlueJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedJungleCampfireBlock> BLUE_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("blue_stripped_jungle_campfire",
            ()->new BlueStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedJungleDarkCampfireBlock> BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("blue_stripped_jungle_dark_campfire",
            ()->new BlueStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownJungleCampfireBlock> BROWN_JUNGLE_CAMPFIRE = registerBlock("brown_jungle_campfire",
            ()->new BrownJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownJungleDarkCampfireBlock> BROWN_JUNGLE_DARK_CAMPFIRE = registerBlock("brown_jungle_dark_campfire",
            ()->new BrownJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedJungleCampfireBlock> BROWN_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("brown_stripped_jungle_campfire",
            ()->new BrownStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedJungleDarkCampfireBlock> BROWN_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("brown_stripped_jungle_dark_campfire",
            ()->new BrownStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanJungleCampfireBlock> CYAN_JUNGLE_CAMPFIRE = registerBlock("cyan_jungle_campfire",
            ()->new CyanJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanJungleDarkCampfireBlock> CYAN_JUNGLE_DARK_CAMPFIRE = registerBlock("cyan_jungle_dark_campfire",
            ()->new CyanJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedJungleCampfireBlock> CYAN_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("cyan_stripped_jungle_campfire",
            ()->new CyanStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedJungleDarkCampfireBlock> CYAN_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("cyan_stripped_jungle_dark_campfire",
            ()->new CyanStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

  // === GRAY VARIANTS ===
    public static final RegistryObject<GrayJungleCampfireBlock> GRAY_JUNGLE_CAMPFIRE = registerBlock("gray_jungle_campfire",
            ()->new GrayJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayJungleDarkCampfireBlock> GRAY_JUNGLE_DARK_CAMPFIRE = registerBlock("gray_jungle_dark_campfire",
            ()->new GrayJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedJungleCampfireBlock> GRAY_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("gray_stripped_jungle_campfire",
            ()->new GrayStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedJungleDarkCampfireBlock> GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("gray_stripped_jungle_dark_campfire",
            ()->new GrayStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenJungleCampfireBlock> GREEN_JUNGLE_CAMPFIRE = registerBlock("green_jungle_campfire",
            ()->new GreenJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenJungleDarkCampfireBlock> GREEN_JUNGLE_DARK_CAMPFIRE = registerBlock("green_jungle_dark_campfire",
            ()->new GreenJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedJungleCampfireBlock> GREEN_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("green_stripped_jungle_campfire",
            ()->new GreenStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedJungleDarkCampfireBlock> GREEN_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("green_stripped_jungle_dark_campfire",
            ()->new GreenStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueJungleCampfireBlock> LIGHT_BLUE_JUNGLE_CAMPFIRE = registerBlock("light_blue_jungle_campfire",
            ()->new LightBlueJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueJungleDarkCampfireBlock> LIGHT_BLUE_JUNGLE_DARK_CAMPFIRE = registerBlock("light_blue_jungle_dark_campfire",
            ()->new LightBlueJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedJungleCampfireBlock> LIGHT_BLUE_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("light_blue_stripped_jungle_campfire",
            ()->new LightBlueStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedJungleDarkCampfireBlock> LIGHT_BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("light_blue_stripped_jungle_dark_campfire",
            ()->new LightBlueStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayJungleCampfireBlock> LIGHT_GRAY_JUNGLE_CAMPFIRE = registerBlock("light_gray_jungle_campfire",
            ()->new LightGrayJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayJungleDarkCampfireBlock> LIGHT_GRAY_JUNGLE_DARK_CAMPFIRE = registerBlock("light_gray_jungle_dark_campfire",
            ()->new LightGrayJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedJungleCampfireBlock> LIGHT_GRAY_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("light_gray_stripped_jungle_campfire",
                ()->new LightGrayStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedJungleDarkCampfireBlock> LIGHT_GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("light_gray_stripped_jungle_dark_campfire",
                ()->new LightGrayStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeJungleCampfireBlock> LIME_JUNGLE_CAMPFIRE = registerBlock("lime_jungle_campfire",
            ()->new LimeJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeJungleDarkCampfireBlock> LIME_JUNGLE_DARK_CAMPFIRE = registerBlock("lime_jungle_dark_campfire",
            ()->new LimeJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedJungleCampfireBlock> LIME_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("lime_stripped_jungle_campfire",
            ()->new LimeStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedJungleDarkCampfireBlock> LIME_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("lime_stripped_jungle_dark_campfire",
            ()->new LimeStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaJungleCampfireBlock> MAGENTA_JUNGLE_CAMPFIRE = registerBlock("magenta_jungle_campfire",
            ()->new MagentaJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaJungleDarkCampfireBlock> MAGENTA_JUNGLE_DARK_CAMPFIRE = registerBlock("magenta_jungle_dark_campfire",
            ()->new MagentaJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedJungleCampfireBlock> MAGENTA_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("magenta_stripped_jungle_campfire",
            ()->new MagentaStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedJungleDarkCampfireBlock> MAGENTA_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("magenta_stripped_jungle_dark_campfire",
            ()->new MagentaStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeJungleCampfireBlock> ORANGE_JUNGLE_CAMPFIRE = registerBlock("orange_jungle_campfire",
            ()->new OrangeJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeJungleDarkCampfireBlock> ORANGE_JUNGLE_DARK_CAMPFIRE = registerBlock("orange_jungle_dark_campfire",
            ()->new OrangeJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedJungleCampfireBlock> ORANGE_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("orange_stripped_jungle_campfire",
            ()->new OrangeStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedJungleDarkCampfireBlock> ORANGE_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("orange_stripped_jungle_dark_campfire",
            ()->new OrangeStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkJungleCampfireBlock> PINK_JUNGLE_CAMPFIRE = registerBlock("pink_jungle_campfire",
            ()->new PinkJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkJungleDarkCampfireBlock> PINK_JUNGLE_DARK_CAMPFIRE = registerBlock("pink_jungle_dark_campfire",
            ()->new PinkJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedJungleCampfireBlock> PINK_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("pink_stripped_jungle_campfire",
            ()->new PinkStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedJungleDarkCampfireBlock> PINK_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("pink_stripped_jungle_dark_campfire",
            ()->new PinkStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleJungleCampfireBlock> PURPLE_JUNGLE_CAMPFIRE = registerBlock("purple_jungle_campfire",
            ()->new PurpleJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleJungleDarkCampfireBlock> PURPLE_JUNGLE_DARK_CAMPFIRE = registerBlock("purple_jungle_dark_campfire",
            ()->new PurpleJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedJungleCampfireBlock> PURPLE_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("purple_stripped_jungle_campfire",
            ()->new PurpleStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedJungleDarkCampfireBlock> PURPLE_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("purple_stripped_jungle_dark_campfire",
            ()->new PurpleStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedJungleCampfireBlock> RED_JUNGLE_CAMPFIRE = registerBlock("red_jungle_campfire",
            ()->new RedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedJungleDarkCampfireBlock> RED_JUNGLE_DARK_CAMPFIRE = registerBlock("red_jungle_dark_campfire",
            ()->new RedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedJungleCampfireBlock> RED_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("red_stripped_jungle_campfire",
            ()->new RedStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedJungleDarkCampfireBlock> RED_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("red_stripped_jungle_dark_campfire",
            ()->new RedStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteJungleCampfireBlock> WHITE_JUNGLE_CAMPFIRE = registerBlock("white_jungle_campfire",
            ()->new WhiteJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteJungleDarkCampfireBlock> WHITE_JUNGLE_DARK_CAMPFIRE = registerBlock("white_jungle_dark_campfire",
            ()->new WhiteJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedJungleCampfireBlock> WHITE_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("white_stripped_jungle_campfire",
            ()->new WhiteStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedJungleDarkCampfireBlock> WHITE_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("white_stripped_jungle_dark_campfire",
            ()->new WhiteStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowJungleCampfireBlock> YELLOW_JUNGLE_CAMPFIRE = registerBlock("yellow_jungle_campfire",
            ()->new YellowJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowJungleDarkCampfireBlock> YELLOW_JUNGLE_DARK_CAMPFIRE = registerBlock("yellow_jungle_dark_campfire",
            ()->new YellowJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedJungleCampfireBlock> YELLOW_STRIPPED_JUNGLE_CAMPFIRE = registerBlock("yellow_stripped_jungle_campfire",
            ()->new YellowStrippedJungleCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedJungleDarkCampfireBlock> YELLOW_STRIPPED_JUNGLE_DARK_CAMPFIRE = registerBlock("yellow_stripped_jungle_dark_campfire",
            ()->new YellowStrippedJungleDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

// ACACIA CAMPFIRE VARIANTS

    // === BLACK VARIANTS ===
    public static final RegistryObject<BlackAcaciaCampfireBlock> BLACK_ACACIA_CAMPFIRE = registerBlock("black_acacia_campfire",
            ()->new BlackAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackAcaciaDarkCampfireBlock> BLACK_ACACIA_DARK_CAMPFIRE = registerBlock("black_acacia_dark_campfire",
            ()->new BlackAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedAcaciaCampfireBlock> BLACK_STRIPPED_ACACIA_CAMPFIRE = registerBlock("black_stripped_acacia_campfire",
            ()->new BlackStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedAcaciaDarkCampfireBlock> BLACK_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("black_stripped_acacia_dark_campfire",
            ()->new BlackStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueAcaciaCampfireBlock> BLUE_ACACIA_CAMPFIRE = registerBlock("blue_acacia_campfire",
            ()->new BlueAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueAcaciaDarkCampfireBlock> BLUE_ACACIA_DARK_CAMPFIRE = registerBlock("blue_acacia_dark_campfire",
            ()->new BlueAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedAcaciaCampfireBlock> BLUE_STRIPPED_ACACIA_CAMPFIRE = registerBlock("blue_stripped_acacia_campfire",
            ()->new BlueStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedAcaciaDarkCampfireBlock> BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("blue_stripped_acacia_dark_campfire",
            ()->new BlueStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownAcaciaCampfireBlock> BROWN_ACACIA_CAMPFIRE = registerBlock("brown_acacia_campfire",
            ()->new BrownAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownAcaciaDarkCampfireBlock> BROWN_ACACIA_DARK_CAMPFIRE = registerBlock("brown_acacia_dark_campfire",
            ()->new BrownAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedAcaciaCampfireBlock> BROWN_STRIPPED_ACACIA_CAMPFIRE = registerBlock("brown_stripped_acacia_campfire",
            ()->new BrownStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedAcaciaDarkCampfireBlock> BROWN_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("brown_stripped_acacia_dark_campfire",
            ()->new BrownStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanAcaciaCampfireBlock> CYAN_ACACIA_CAMPFIRE = registerBlock("cyan_acacia_campfire",
            ()->new CyanAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanAcaciaDarkCampfireBlock> CYAN_ACACIA_DARK_CAMPFIRE = registerBlock("cyan_acacia_dark_campfire",
            ()->new CyanAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedAcaciaCampfireBlock> CYAN_STRIPPED_ACACIA_CAMPFIRE = registerBlock("cyan_stripped_acacia_campfire",
            ()->new CyanStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedAcaciaDarkCampfireBlock> CYAN_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("cyan_stripped_acacia_dark_campfire",
            ()->new CyanStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GRAY VARIANTS ===
    public static final RegistryObject<GrayAcaciaCampfireBlock> GRAY_ACACIA_CAMPFIRE = registerBlock("gray_acacia_campfire",
            ()->new GrayAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayAcaciaDarkCampfireBlock> GRAY_ACACIA_DARK_CAMPFIRE = registerBlock("gray_acacia_dark_campfire",
            ()->new GrayAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedAcaciaCampfireBlock> GRAY_STRIPPED_ACACIA_CAMPFIRE = registerBlock("gray_stripped_acacia_campfire",
            ()->new GrayStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedAcaciaDarkCampfireBlock> GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("gray_stripped_acacia_dark_campfire",
            ()->new GrayStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenAcaciaCampfireBlock> GREEN_ACACIA_CAMPFIRE = registerBlock("green_acacia_campfire",
            ()->new GreenAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenAcaciaDarkCampfireBlock> GREEN_ACACIA_DARK_CAMPFIRE = registerBlock("green_acacia_dark_campfire",
            ()->new GreenAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedAcaciaCampfireBlock> GREEN_STRIPPED_ACACIA_CAMPFIRE = registerBlock("green_stripped_acacia_campfire",
            ()->new GreenStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedAcaciaDarkCampfireBlock> GREEN_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("green_stripped_acacia_dark_campfire",
            ()->new GreenStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueAcaciaCampfireBlock> LIGHT_BLUE_ACACIA_CAMPFIRE = registerBlock("light_blue_acacia_campfire",
            ()->new LightBlueAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueAcaciaDarkCampfireBlock> LIGHT_BLUE_ACACIA_DARK_CAMPFIRE = registerBlock("light_blue_acacia_dark_campfire",
            ()->new LightBlueAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedAcaciaCampfireBlock> LIGHT_BLUE_STRIPPED_ACACIA_CAMPFIRE = registerBlock("light_blue_stripped_acacia_campfire",
            ()->new LightBlueStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedAcaciaDarkCampfireBlock> LIGHT_BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("light_blue_stripped_acacia_dark_campfire",
            ()->new LightBlueStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayAcaciaCampfireBlock> LIGHT_GRAY_ACACIA_CAMPFIRE = registerBlock("light_gray_acacia_campfire",
            ()->new LightGrayAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayAcaciaDarkCampfireBlock> LIGHT_GRAY_ACACIA_DARK_CAMPFIRE = registerBlock("light_gray_acacia_dark_campfire",
            ()->new LightGrayAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedAcaciaCampfireBlock> LIGHT_GRAY_STRIPPED_ACACIA_CAMPFIRE = registerBlock("light_gray_stripped_acacia_campfire",
                ()->new LightGrayStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
        public static final RegistryObject<LightGrayStrippedAcaciaDarkCampfireBlock> LIGHT_GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("light_gray_stripped_acacia_dark_campfire",
                ()->new LightGrayStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeAcaciaCampfireBlock> LIME_ACACIA_CAMPFIRE = registerBlock("lime_acacia_campfire",
            ()->new LimeAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeAcaciaDarkCampfireBlock> LIME_ACACIA_DARK_CAMPFIRE = registerBlock("lime_acacia_dark_campfire",
            ()->new LimeAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedAcaciaCampfireBlock> LIME_STRIPPED_ACACIA_CAMPFIRE = registerBlock("lime_stripped_acacia_campfire",
            ()->new LimeStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedAcaciaDarkCampfireBlock> LIME_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("lime_stripped_acacia_dark_campfire",
            ()->new LimeStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaAcaciaCampfireBlock> MAGENTA_ACACIA_CAMPFIRE = registerBlock("magenta_acacia_campfire",
            ()->new MagentaAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaAcaciaDarkCampfireBlock> MAGENTA_ACACIA_DARK_CAMPFIRE = registerBlock("magenta_acacia_dark_campfire",
            ()->new MagentaAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedAcaciaCampfireBlock> MAGENTA_STRIPPED_ACACIA_CAMPFIRE = registerBlock("magenta_stripped_acacia_campfire",
            ()->new MagentaStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedAcaciaDarkCampfireBlock> MAGENTA_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("magenta_stripped_acacia_dark_campfire",
            ()->new MagentaStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeAcaciaCampfireBlock> ORANGE_ACACIA_CAMPFIRE = registerBlock("orange_acacia_campfire",
            ()->new OrangeAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeAcaciaDarkCampfireBlock> ORANGE_ACACIA_DARK_CAMPFIRE = registerBlock("orange_acacia_dark_campfire",
            ()->new OrangeAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedAcaciaCampfireBlock> ORANGE_STRIPPED_ACACIA_CAMPFIRE = registerBlock("orange_stripped_acacia_campfire",
            ()->new OrangeStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedAcaciaDarkCampfireBlock> ORANGE_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("orange_stripped_acacia_dark_campfire",
            ()->new OrangeStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkAcaciaCampfireBlock> PINK_ACACIA_CAMPFIRE = registerBlock("pink_acacia_campfire",
            ()->new PinkAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkAcaciaDarkCampfireBlock> PINK_ACACIA_DARK_CAMPFIRE = registerBlock("pink_acacia_dark_campfire",
            ()->new PinkAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedAcaciaCampfireBlock> PINK_STRIPPED_ACACIA_CAMPFIRE = registerBlock("pink_stripped_acacia_campfire",
            ()->new PinkStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedAcaciaDarkCampfireBlock> PINK_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("pink_stripped_acacia_dark_campfire",
            ()->new PinkStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleAcaciaCampfireBlock> PURPLE_ACACIA_CAMPFIRE = registerBlock("purple_acacia_campfire",
            ()->new PurpleAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleAcaciaDarkCampfireBlock> PURPLE_ACACIA_DARK_CAMPFIRE = registerBlock("purple_acacia_dark_campfire",
            ()->new PurpleAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedAcaciaCampfireBlock> PURPLE_STRIPPED_ACACIA_CAMPFIRE = registerBlock("purple_stripped_acacia_campfire",
            ()->new PurpleStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedAcaciaDarkCampfireBlock> PURPLE_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("purple_stripped_acacia_dark_campfire",
            ()->new PurpleStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedAcaciaCampfireBlock> RED_ACACIA_CAMPFIRE = registerBlock("red_acacia_campfire",
            ()->new RedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedAcaciaDarkCampfireBlock> RED_ACACIA_DARK_CAMPFIRE = registerBlock("red_acacia_dark_campfire",
            ()->new RedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedAcaciaCampfireBlock> RED_STRIPPED_ACACIA_CAMPFIRE = registerBlock("red_stripped_acacia_campfire",
            ()->new RedStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedAcaciaDarkCampfireBlock> RED_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("red_stripped_acacia_dark_campfire",
            ()->new RedStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteAcaciaCampfireBlock> WHITE_ACACIA_CAMPFIRE = registerBlock("white_acacia_campfire",
            ()->new WhiteAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteAcaciaDarkCampfireBlock> WHITE_ACACIA_DARK_CAMPFIRE = registerBlock("white_acacia_dark_campfire",
            ()->new WhiteAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedAcaciaCampfireBlock> WHITE_STRIPPED_ACACIA_CAMPFIRE = registerBlock("white_stripped_acacia_campfire",
            ()->new WhiteStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedAcaciaDarkCampfireBlock> WHITE_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("white_stripped_acacia_dark_campfire",
            ()->new WhiteStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowAcaciaCampfireBlock> YELLOW_ACACIA_CAMPFIRE = registerBlock("yellow_acacia_campfire",
            ()->new YellowAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowAcaciaDarkCampfireBlock> YELLOW_ACACIA_DARK_CAMPFIRE = registerBlock("yellow_acacia_dark_campfire",
            ()->new YellowAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedAcaciaCampfireBlock> YELLOW_STRIPPED_ACACIA_CAMPFIRE = registerBlock("yellow_stripped_acacia_campfire",
            ()->new YellowStrippedAcaciaCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedAcaciaDarkCampfireBlock> YELLOW_STRIPPED_ACACIA_DARK_CAMPFIRE = registerBlock("yellow_stripped_acacia_dark_campfire",
            ()->new YellowStrippedAcaciaDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // MANGROVE CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlackMangroveCampfireBlock> BLACK_MANGROVE_CAMPFIRE = registerBlock("black_mangrove_campfire",
            ()->new BlackMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackMangroveDarkCampfireBlock> BLACK_MANGROVE_DARK_CAMPFIRE = registerBlock("black_mangrove_dark_campfire",
            ()->new BlackMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedMangroveCampfireBlock> BLACK_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("black_stripped_mangrove_campfire",
            ()->new BlackStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedMangroveDarkCampfireBlock> BLACK_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("black_stripped_mangrove_dark_campfire",
            ()->new BlackStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueMangroveCampfireBlock> BLUE_MANGROVE_CAMPFIRE = registerBlock("blue_mangrove_campfire",
            ()->new BlueMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueMangroveDarkCampfireBlock> BLUE_MANGROVE_DARK_CAMPFIRE = registerBlock("blue_mangrove_dark_campfire",
            ()->new BlueMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedMangroveCampfireBlock> BLUE_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("blue_stripped_mangrove_campfire",
            ()->new BlueStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedMangroveDarkCampfireBlock> BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("blue_stripped_mangrove_dark_campfire",
            ()->new BlueStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownMangroveCampfireBlock> BROWN_MANGROVE_CAMPFIRE = registerBlock("brown_mangrove_campfire",
            ()->new BrownMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownMangroveDarkCampfireBlock> BROWN_MANGROVE_DARK_CAMPFIRE = registerBlock("brown_mangrove_dark_campfire",
            ()->new BrownMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedMangroveCampfireBlock> BROWN_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("brown_stripped_mangrove_campfire",
            ()->new BrownStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedMangroveDarkCampfireBlock> BROWN_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("brown_stripped_mangrove_dark_campfire",
            ()->new BrownStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanMangroveCampfireBlock> CYAN_MANGROVE_CAMPFIRE = registerBlock("cyan_mangrove_campfire",
            ()->new CyanMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanMangroveDarkCampfireBlock> CYAN_MANGROVE_DARK_CAMPFIRE = registerBlock("cyan_mangrove_dark_campfire",
            ()->new CyanMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedMangroveCampfireBlock> CYAN_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("cyan_stripped_mangrove_campfire",
            ()->new CyanStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedMangroveDarkCampfireBlock> CYAN_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("cyan_stripped_mangrove_dark_campfire",
            ()->new CyanStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GRAY VARIANTS ===
    public static final RegistryObject<GrayMangroveCampfireBlock> GRAY_MANGROVE_CAMPFIRE = registerBlock("gray_mangrove_campfire",
            ()->new GrayMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayMangroveDarkCampfireBlock> GRAY_MANGROVE_DARK_CAMPFIRE = registerBlock("gray_mangrove_dark_campfire",
            ()->new GrayMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedMangroveCampfireBlock> GRAY_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("gray_stripped_mangrove_campfire",
            ()->new GrayStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedMangroveDarkCampfireBlock> GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("gray_stripped_mangrove_dark_campfire",
            ()->new GrayStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenMangroveCampfireBlock> GREEN_MANGROVE_CAMPFIRE = registerBlock("green_mangrove_campfire",
            ()->new GreenMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenMangroveDarkCampfireBlock> GREEN_MANGROVE_DARK_CAMPFIRE = registerBlock("green_mangrove_dark_campfire",
            ()->new GreenMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedMangroveCampfireBlock> GREEN_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("green_stripped_mangrove_campfire",
            ()->new GreenStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedMangroveDarkCampfireBlock> GREEN_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("green_stripped_mangrove_dark_campfire",
            ()->new GreenStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueMangroveCampfireBlock> LIGHT_BLUE_MANGROVE_CAMPFIRE = registerBlock("light_blue_mangrove_campfire",
            ()->new LightBlueMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueMangroveDarkCampfireBlock> LIGHT_BLUE_MANGROVE_DARK_CAMPFIRE = registerBlock("light_blue_mangrove_dark_campfire",
            ()->new LightBlueMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedMangroveCampfireBlock> LIGHT_BLUE_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("light_blue_stripped_mangrove_campfire",
            ()->new LightBlueStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedMangroveDarkCampfireBlock> LIGHT_BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("light_blue_stripped_mangrove_dark_campfire",
            ()->new LightBlueStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayMangroveCampfireBlock> LIGHT_GRAY_MANGROVE_CAMPFIRE = registerBlock("light_gray_mangrove_campfire",
            ()->new LightGrayMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayMangroveDarkCampfireBlock> LIGHT_GRAY_MANGROVE_DARK_CAMPFIRE = registerBlock("light_gray_mangrove_dark_campfire",
            ()->new LightGrayMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedMangroveCampfireBlock> LIGHT_GRAY_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("light_gray_stripped_mangrove_campfire",
            ()->new LightGrayStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedMangroveDarkCampfireBlock> LIGHT_GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("light_gray_stripped_mangrove_dark_campfire",
            ()->new LightGrayStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeMangroveCampfireBlock> LIME_MANGROVE_CAMPFIRE = registerBlock("lime_mangrove_campfire",
            ()->new LimeMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeMangroveDarkCampfireBlock> LIME_MANGROVE_DARK_CAMPFIRE = registerBlock("lime_mangrove_dark_campfire",
            ()->new LimeMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedMangroveCampfireBlock> LIME_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("lime_stripped_mangrove_campfire",
            ()->new LimeStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedMangroveDarkCampfireBlock> LIME_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("lime_stripped_mangrove_dark_campfire",
            ()->new LimeStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaMangroveCampfireBlock> MAGENTA_MANGROVE_CAMPFIRE = registerBlock("magenta_mangrove_campfire",
            ()->new MagentaMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaMangroveDarkCampfireBlock> MAGENTA_MANGROVE_DARK_CAMPFIRE = registerBlock("magenta_mangrove_dark_campfire",
            ()->new MagentaMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedMangroveCampfireBlock> MAGENTA_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("magenta_stripped_mangrove_campfire",
            ()->new MagentaStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedMangroveDarkCampfireBlock> MAGENTA_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("magenta_stripped_mangrove_dark_campfire",
            ()->new MagentaStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeMangroveCampfireBlock> ORANGE_MANGROVE_CAMPFIRE = registerBlock("orange_mangrove_campfire",
            ()->new OrangeMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeMangroveDarkCampfireBlock> ORANGE_MANGROVE_DARK_CAMPFIRE = registerBlock("orange_mangrove_dark_campfire",
            ()->new OrangeMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedMangroveCampfireBlock> ORANGE_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("orange_stripped_mangrove_campfire",
            ()->new OrangeStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedMangroveDarkCampfireBlock> ORANGE_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("orange_stripped_mangrove_dark_campfire",
            ()->new OrangeStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkMangroveCampfireBlock> PINK_MANGROVE_CAMPFIRE = registerBlock("pink_mangrove_campfire",
            ()->new PinkMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkMangroveDarkCampfireBlock> PINK_MANGROVE_DARK_CAMPFIRE = registerBlock("pink_mangrove_dark_campfire",
            ()->new PinkMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedMangroveCampfireBlock> PINK_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("pink_stripped_mangrove_campfire",
            ()->new PinkStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedMangroveDarkCampfireBlock> PINK_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("pink_stripped_mangrove_dark_campfire",
            ()->new PinkStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleMangroveCampfireBlock> PURPLE_MANGROVE_CAMPFIRE = registerBlock("purple_mangrove_campfire",
            ()->new PurpleMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleMangroveDarkCampfireBlock> PURPLE_MANGROVE_DARK_CAMPFIRE = registerBlock("purple_mangrove_dark_campfire",
            ()->new PurpleMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedMangroveCampfireBlock> PURPLE_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("purple_stripped_mangrove_campfire",
            ()->new PurpleStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedMangroveDarkCampfireBlock> PURPLE_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("purple_stripped_mangrove_dark_campfire",
            ()->new PurpleStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedMangroveCampfireBlock> RED_MANGROVE_CAMPFIRE = registerBlock("red_mangrove_campfire",
            ()->new RedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedMangroveDarkCampfireBlock> RED_MANGROVE_DARK_CAMPFIRE = registerBlock("red_mangrove_dark_campfire",
            ()->new RedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedMangroveCampfireBlock> RED_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("red_stripped_mangrove_campfire",
            ()->new RedStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedMangroveDarkCampfireBlock> RED_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("red_stripped_mangrove_dark_campfire",
            ()->new RedStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteMangroveCampfireBlock> WHITE_MANGROVE_CAMPFIRE = registerBlock("white_mangrove_campfire",
            ()->new WhiteMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteMangroveDarkCampfireBlock> WHITE_MANGROVE_DARK_CAMPFIRE = registerBlock("white_mangrove_dark_campfire",
            ()->new WhiteMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedMangroveCampfireBlock> WHITE_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("white_stripped_mangrove_campfire",
            ()->new WhiteStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedMangroveDarkCampfireBlock> WHITE_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("white_stripped_mangrove_dark_campfire",
            ()->new WhiteStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowMangroveCampfireBlock> YELLOW_MANGROVE_CAMPFIRE = registerBlock("yellow_mangrove_campfire",
            ()->new YellowMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowMangroveDarkCampfireBlock> YELLOW_MANGROVE_DARK_CAMPFIRE = registerBlock("yellow_mangrove_dark_campfire",
            ()->new YellowMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedMangroveCampfireBlock> YELLOW_STRIPPED_MANGROVE_CAMPFIRE = registerBlock("yellow_stripped_mangrove_campfire",
            ()->new YellowStrippedMangroveCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedMangroveDarkCampfireBlock> YELLOW_STRIPPED_MANGROVE_DARK_CAMPFIRE = registerBlock("yellow_stripped_mangrove_dark_campfire",
            ()->new YellowStrippedMangroveDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // CRIMSON STEM CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlackCrimsonStemCampfireBlock> BLACK_CRIMSON_STEM_CAMPFIRE = registerBlock("black_crimson_stem_campfire",
            ()->new BlackCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackCrimsonStemDarkCampfireBlock> BLACK_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("black_crimson_stem_dark_campfire",
            ()->new BlackCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedCrimsonStemCampfireBlock> BLACK_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("black_stripped_crimson_stem_campfire",
            ()->new BlackStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedCrimsonStemDarkCampfireBlock> BLACK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("black_stripped_crimson_stem_dark_campfire",
            ()->new BlackStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueCrimsonStemCampfireBlock> BLUE_CRIMSON_STEM_CAMPFIRE = registerBlock("blue_crimson_stem_campfire",
            ()->new BlueCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueCrimsonStemDarkCampfireBlock> BLUE_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("blue_crimson_stem_dark_campfire",
            ()->new BlueCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedCrimsonStemCampfireBlock> BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("blue_stripped_crimson_stem_campfire",
            ()->new BlueStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedCrimsonStemDarkCampfireBlock> BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("blue_stripped_crimson_stem_dark_campfire",
            ()->new BlueStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownCrimsonStemCampfireBlock> BROWN_CRIMSON_STEM_CAMPFIRE = registerBlock("brown_crimson_stem_campfire",
            ()->new BrownCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownCrimsonStemDarkCampfireBlock> BROWN_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("brown_crimson_stem_dark_campfire",
            ()->new BrownCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedCrimsonStemCampfireBlock> BROWN_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("brown_stripped_crimson_stem_campfire",
            ()->new BrownStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedCrimsonStemDarkCampfireBlock> BROWN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("brown_stripped_crimson_stem_dark_campfire",
            ()->new BrownStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanCrimsonStemCampfireBlock> CYAN_CRIMSON_STEM_CAMPFIRE = registerBlock("cyan_crimson_stem_campfire",
            ()->new CyanCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanCrimsonStemDarkCampfireBlock> CYAN_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("cyan_crimson_stem_dark_campfire",
            ()->new CyanCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedCrimsonStemCampfireBlock> CYAN_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("cyan_stripped_crimson_stem_campfire",
            ()->new CyanStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedCrimsonStemDarkCampfireBlock> CYAN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("cyan_stripped_crimson_stem_dark_campfire",
            ()->new CyanStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GRAY VARIANTS ===
    public static final RegistryObject<GrayCrimsonStemCampfireBlock> GRAY_CRIMSON_STEM_CAMPFIRE = registerBlock("gray_crimson_stem_campfire",
            ()->new GrayCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayCrimsonStemDarkCampfireBlock> GRAY_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("gray_crimson_stem_dark_campfire",
            ()->new GrayCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedCrimsonStemCampfireBlock> GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("gray_stripped_crimson_stem_campfire",
            ()->new GrayStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedCrimsonStemDarkCampfireBlock> GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("gray_stripped_crimson_stem_dark_campfire",
            ()->new GrayStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenCrimsonStemCampfireBlock> GREEN_CRIMSON_STEM_CAMPFIRE = registerBlock("green_crimson_stem_campfire",
            ()->new GreenCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenCrimsonStemDarkCampfireBlock> GREEN_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("green_crimson_stem_dark_campfire",
            ()->new GreenCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedCrimsonStemCampfireBlock> GREEN_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("green_stripped_crimson_stem_campfire",
            ()->new GreenStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedCrimsonStemDarkCampfireBlock> GREEN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("green_stripped_crimson_stem_dark_campfire",
            ()->new GreenStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueCrimsonStemCampfireBlock> LIGHT_BLUE_CRIMSON_STEM_CAMPFIRE = registerBlock("light_blue_crimson_stem_campfire",
            ()->new LightBlueCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueCrimsonStemDarkCampfireBlock> LIGHT_BLUE_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("light_blue_crimson_stem_dark_campfire",
            ()->new LightBlueCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedCrimsonStemCampfireBlock> LIGHT_BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("light_blue_stripped_crimson_stem_campfire",
            ()->new LightBlueStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedCrimsonStemDarkCampfireBlock> LIGHT_BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("light_blue_stripped_crimson_stem_dark_campfire",
            ()->new LightBlueStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayCrimsonStemCampfireBlock> LIGHT_GRAY_CRIMSON_STEM_CAMPFIRE = registerBlock("light_gray_crimson_stem_campfire",
            ()->new LightGrayCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayCrimsonStemDarkCampfireBlock> LIGHT_GRAY_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("light_gray_crimson_stem_dark_campfire",
            ()->new LightGrayCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedCrimsonStemCampfireBlock> LIGHT_GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("light_gray_stripped_crimson_stem_campfire",
            ()->new LightGrayStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedCrimsonStemDarkCampfireBlock> LIGHT_GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("light_gray_stripped_crimson_stem_dark_campfire",
            ()->new LightGrayStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeCrimsonStemCampfireBlock> LIME_CRIMSON_STEM_CAMPFIRE = registerBlock("lime_crimson_stem_campfire",
            ()->new LimeCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeCrimsonStemDarkCampfireBlock> LIME_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("lime_crimson_stem_dark_campfire",
            ()->new LimeCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedCrimsonStemCampfireBlock> LIME_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("lime_stripped_crimson_stem_campfire",
            ()->new LimeStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedCrimsonStemDarkCampfireBlock> LIME_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("lime_stripped_crimson_stem_dark_campfire",
            ()->new LimeStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaCrimsonStemCampfireBlock> MAGENTA_CRIMSON_STEM_CAMPFIRE = registerBlock("magenta_crimson_stem_campfire",
            ()->new MagentaCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaCrimsonStemDarkCampfireBlock> MAGENTA_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("magenta_crimson_stem_dark_campfire",
            ()->new MagentaCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedCrimsonStemCampfireBlock> MAGENTA_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("magenta_stripped_crimson_stem_campfire",
            ()->new MagentaStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedCrimsonStemDarkCampfireBlock> MAGENTA_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("magenta_stripped_crimson_stem_dark_campfire",
            ()->new MagentaStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeCrimsonStemCampfireBlock> ORANGE_CRIMSON_STEM_CAMPFIRE = registerBlock("orange_crimson_stem_campfire",
            ()->new OrangeCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeCrimsonStemDarkCampfireBlock> ORANGE_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("orange_crimson_stem_dark_campfire",
            ()->new OrangeCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedCrimsonStemCampfireBlock> ORANGE_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("orange_stripped_crimson_stem_campfire",
            ()->new OrangeStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedCrimsonStemDarkCampfireBlock> ORANGE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("orange_stripped_crimson_stem_dark_campfire",
            ()->new OrangeStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkCrimsonStemCampfireBlock> PINK_CRIMSON_STEM_CAMPFIRE = registerBlock("pink_crimson_stem_campfire",
            ()->new PinkCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkCrimsonStemDarkCampfireBlock> PINK_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("pink_crimson_stem_dark_campfire",
            ()->new PinkCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedCrimsonStemCampfireBlock> PINK_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("pink_stripped_crimson_stem_campfire",
            ()->new PinkStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedCrimsonStemDarkCampfireBlock> PINK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("pink_stripped_crimson_stem_dark_campfire",
            ()->new PinkStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleCrimsonStemCampfireBlock> PURPLE_CRIMSON_STEM_CAMPFIRE = registerBlock("purple_crimson_stem_campfire",
            ()->new PurpleCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleCrimsonStemDarkCampfireBlock> PURPLE_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("purple_crimson_stem_dark_campfire",
            ()->new PurpleCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedCrimsonStemCampfireBlock> PURPLE_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("purple_stripped_crimson_stem_campfire",
            ()->new PurpleStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedCrimsonStemDarkCampfireBlock> PURPLE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("purple_stripped_crimson_stem_dark_campfire",
            ()->new PurpleStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedCrimsonStemCampfireBlock> RED_CRIMSON_STEM_CAMPFIRE = registerBlock("red_crimson_stem_campfire",
            ()->new RedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedCrimsonStemDarkCampfireBlock> RED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("red_crimson_stem_dark_campfire",
            ()->new RedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedCrimsonStemCampfireBlock> RED_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("red_stripped_crimson_stem_campfire",
            ()->new RedStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedCrimsonStemDarkCampfireBlock> RED_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("red_stripped_crimson_stem_dark_campfire",
            ()->new RedStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteCrimsonStemCampfireBlock> WHITE_CRIMSON_STEM_CAMPFIRE = registerBlock("white_crimson_stem_campfire",
            ()->new WhiteCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteCrimsonStemDarkCampfireBlock> WHITE_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("white_crimson_stem_dark_campfire",
            ()->new WhiteCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedCrimsonStemCampfireBlock> WHITE_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("white_stripped_crimson_stem_campfire",
            ()->new WhiteStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedCrimsonStemDarkCampfireBlock> WHITE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("white_stripped_crimson_stem_dark_campfire",
            ()->new WhiteStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowCrimsonStemCampfireBlock> YELLOW_CRIMSON_STEM_CAMPFIRE = registerBlock("yellow_crimson_stem_campfire",
            ()->new YellowCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowCrimsonStemDarkCampfireBlock> YELLOW_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("yellow_crimson_stem_dark_campfire",
            ()->new YellowCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedCrimsonStemCampfireBlock> YELLOW_STRIPPED_CRIMSON_STEM_CAMPFIRE = registerBlock("yellow_stripped_crimson_stem_campfire",
            ()->new YellowStrippedCrimsonStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedCrimsonStemDarkCampfireBlock> YELLOW_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE = registerBlock("yellow_stripped_crimson_stem_dark_campfire",
            ()->new YellowStrippedCrimsonStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // WARPED STEM CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlackWarpedStemCampfireBlock> BLACK_WARPED_STEM_CAMPFIRE = registerBlock("black_warped_stem_campfire",
            ()->new BlackWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackWarpedStemDarkCampfireBlock> BLACK_WARPED_STEM_DARK_CAMPFIRE = registerBlock("black_warped_stem_dark_campfire",
            ()->new BlackWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedWarpedStemCampfireBlock> BLACK_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("black_stripped_warped_stem_campfire",
            ()->new BlackStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlackStrippedWarpedStemDarkCampfireBlock> BLACK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("black_stripped_warped_stem_dark_campfire",
            ()->new BlackStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlueWarpedStemCampfireBlock> BLUE_WARPED_STEM_CAMPFIRE = registerBlock("blue_warped_stem_campfire",
            ()->new BlueWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueWarpedStemDarkCampfireBlock> BLUE_WARPED_STEM_DARK_CAMPFIRE = registerBlock("blue_warped_stem_dark_campfire",
            ()->new BlueWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedWarpedStemCampfireBlock> BLUE_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("blue_stripped_warped_stem_campfire",
            ()->new BlueStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BlueStrippedWarpedStemDarkCampfireBlock> BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("blue_stripped_warped_stem_dark_campfire",
            ()->new BlueStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BrownWarpedStemCampfireBlock> BROWN_WARPED_STEM_CAMPFIRE = registerBlock("brown_warped_stem_campfire",
            ()->new BrownWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownWarpedStemDarkCampfireBlock> BROWN_WARPED_STEM_DARK_CAMPFIRE = registerBlock("brown_warped_stem_dark_campfire",
            ()->new BrownWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedWarpedStemCampfireBlock> BROWN_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("brown_stripped_warped_stem_campfire",
            ()->new BrownStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<BrownStrippedWarpedStemDarkCampfireBlock> BROWN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("brown_stripped_warped_stem_dark_campfire",
            ()->new BrownStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === CYAN VARIANTS ===
    public static final RegistryObject<CyanWarpedStemCampfireBlock> CYAN_WARPED_STEM_CAMPFIRE = registerBlock("cyan_warped_stem_campfire",
            ()->new CyanWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanWarpedStemDarkCampfireBlock> CYAN_WARPED_STEM_DARK_CAMPFIRE = registerBlock("cyan_warped_stem_dark_campfire",
            ()->new CyanWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedWarpedStemCampfireBlock> CYAN_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("cyan_stripped_warped_stem_campfire",
            ()->new CyanStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<CyanStrippedWarpedStemDarkCampfireBlock> CYAN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("cyan_stripped_warped_stem_dark_campfire",
            ()->new CyanStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GRAY VARIANTS ===
    public static final RegistryObject<GrayWarpedStemCampfireBlock> GRAY_WARPED_STEM_CAMPFIRE = registerBlock("gray_warped_stem_campfire",
            ()->new GrayWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayWarpedStemDarkCampfireBlock> GRAY_WARPED_STEM_DARK_CAMPFIRE = registerBlock("gray_warped_stem_dark_campfire",
            ()->new GrayWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedWarpedStemCampfireBlock> GRAY_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("gray_stripped_warped_stem_campfire",
            ()->new GrayStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GrayStrippedWarpedStemDarkCampfireBlock> GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("gray_stripped_warped_stem_dark_campfire",
            ()->new GrayStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === GREEN VARIANTS ===
    public static final RegistryObject<GreenWarpedStemCampfireBlock> GREEN_WARPED_STEM_CAMPFIRE = registerBlock("green_warped_stem_campfire",
            ()->new GreenWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenWarpedStemDarkCampfireBlock> GREEN_WARPED_STEM_DARK_CAMPFIRE = registerBlock("green_warped_stem_dark_campfire",
            ()->new GreenWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedWarpedStemCampfireBlock> GREEN_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("green_stripped_warped_stem_campfire",
            ()->new GreenStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<GreenStrippedWarpedStemDarkCampfireBlock> GREEN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("green_stripped_warped_stem_dark_campfire",
            ()->new GreenStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<LightBlueWarpedStemCampfireBlock> LIGHT_BLUE_WARPED_STEM_CAMPFIRE = registerBlock("light_blue_warped_stem_campfire",
            ()->new LightBlueWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueWarpedStemDarkCampfireBlock> LIGHT_BLUE_WARPED_STEM_DARK_CAMPFIRE = registerBlock("light_blue_warped_stem_dark_campfire",
            ()->new LightBlueWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedWarpedStemCampfireBlock> LIGHT_BLUE_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("light_blue_stripped_warped_stem_campfire",
            ()->new LightBlueStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightBlueStrippedWarpedStemDarkCampfireBlock> LIGHT_BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("light_blue_stripped_warped_stem_dark_campfire",
            ()->new LightBlueStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<LightGrayWarpedStemCampfireBlock> LIGHT_GRAY_WARPED_STEM_CAMPFIRE = registerBlock("light_gray_warped_stem_campfire",
            ()->new LightGrayWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayWarpedStemDarkCampfireBlock> LIGHT_GRAY_WARPED_STEM_DARK_CAMPFIRE = registerBlock("light_gray_warped_stem_dark_campfire",
            ()->new LightGrayWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedWarpedStemCampfireBlock> LIGHT_GRAY_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("light_gray_stripped_warped_stem_campfire",
            ()->new LightGrayStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LightGrayStrippedWarpedStemDarkCampfireBlock> LIGHT_GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("light_gray_stripped_warped_stem_dark_campfire",
            ()->new LightGrayStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === LIME VARIANTS ===
    public static final RegistryObject<LimeWarpedStemCampfireBlock> LIME_WARPED_STEM_CAMPFIRE = registerBlock("lime_warped_stem_campfire",
            ()->new LimeWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeWarpedStemDarkCampfireBlock> LIME_WARPED_STEM_DARK_CAMPFIRE = registerBlock("lime_warped_stem_dark_campfire",
            ()->new LimeWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedWarpedStemCampfireBlock> LIME_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("lime_stripped_warped_stem_campfire",
            ()->new LimeStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<LimeStrippedWarpedStemDarkCampfireBlock> LIME_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("lime_stripped_warped_stem_dark_campfire",
            ()->new LimeStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<MagentaWarpedStemCampfireBlock> MAGENTA_WARPED_STEM_CAMPFIRE = registerBlock("magenta_warped_stem_campfire",
            ()->new MagentaWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaWarpedStemDarkCampfireBlock> MAGENTA_WARPED_STEM_DARK_CAMPFIRE = registerBlock("magenta_warped_stem_dark_campfire",
            ()->new MagentaWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedWarpedStemCampfireBlock> MAGENTA_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("magenta_stripped_warped_stem_campfire",
            ()->new MagentaStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<MagentaStrippedWarpedStemDarkCampfireBlock> MAGENTA_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("magenta_stripped_warped_stem_dark_campfire",
            ()->new MagentaStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<OrangeWarpedStemCampfireBlock> ORANGE_WARPED_STEM_CAMPFIRE = registerBlock("orange_warped_stem_campfire",
            ()->new OrangeWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeWarpedStemDarkCampfireBlock> ORANGE_WARPED_STEM_DARK_CAMPFIRE = registerBlock("orange_warped_stem_dark_campfire",
            ()->new OrangeWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedWarpedStemCampfireBlock> ORANGE_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("orange_stripped_warped_stem_campfire",
            ()->new OrangeStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<OrangeStrippedWarpedStemDarkCampfireBlock> ORANGE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("orange_stripped_warped_stem_dark_campfire",
            ()->new OrangeStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PINK VARIANTS ===
    public static final RegistryObject<PinkWarpedStemCampfireBlock> PINK_WARPED_STEM_CAMPFIRE = registerBlock("pink_warped_stem_campfire",
            ()->new PinkWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkWarpedStemDarkCampfireBlock> PINK_WARPED_STEM_DARK_CAMPFIRE = registerBlock("pink_warped_stem_dark_campfire",
            ()->new PinkWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedWarpedStemCampfireBlock> PINK_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("pink_stripped_warped_stem_campfire",
            ()->new PinkStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PinkStrippedWarpedStemDarkCampfireBlock> PINK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("pink_stripped_warped_stem_dark_campfire",
            ()->new PinkStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<PurpleWarpedStemCampfireBlock> PURPLE_WARPED_STEM_CAMPFIRE = registerBlock("purple_warped_stem_campfire",
            ()->new PurpleWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleWarpedStemDarkCampfireBlock> PURPLE_WARPED_STEM_DARK_CAMPFIRE = registerBlock("purple_warped_stem_dark_campfire",
            ()->new PurpleWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedWarpedStemCampfireBlock> PURPLE_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("purple_stripped_warped_stem_campfire",
            ()->new PurpleStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<PurpleStrippedWarpedStemDarkCampfireBlock> PURPLE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("purple_stripped_warped_stem_dark_campfire",
            ()->new PurpleStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === RED VARIANTS ===
    public static final RegistryObject<RedWarpedStemCampfireBlock> RED_WARPED_STEM_CAMPFIRE = registerBlock("red_warped_stem_campfire",
            ()->new RedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedWarpedStemDarkCampfireBlock> RED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("red_warped_stem_dark_campfire",
            ()->new RedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedWarpedStemCampfireBlock> RED_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("red_stripped_warped_stem_campfire",
            ()->new RedStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<RedStrippedWarpedStemDarkCampfireBlock> RED_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("red_stripped_warped_stem_dark_campfire",
            ()->new RedStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === WHITE VARIANTS ===
    public static final RegistryObject<WhiteWarpedStemCampfireBlock> WHITE_WARPED_STEM_CAMPFIRE = registerBlock("white_warped_stem_campfire",
            ()->new WhiteWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteWarpedStemDarkCampfireBlock> WHITE_WARPED_STEM_DARK_CAMPFIRE = registerBlock("white_warped_stem_dark_campfire",
            ()->new WhiteWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedWarpedStemCampfireBlock> WHITE_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("white_stripped_warped_stem_campfire",
            ()->new WhiteStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<WhiteStrippedWarpedStemDarkCampfireBlock> WHITE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("white_stripped_warped_stem_dark_campfire",
            ()->new WhiteStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<YellowWarpedStemCampfireBlock> YELLOW_WARPED_STEM_CAMPFIRE = registerBlock("yellow_warped_stem_campfire",
            ()->new YellowWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowWarpedStemDarkCampfireBlock> YELLOW_WARPED_STEM_DARK_CAMPFIRE = registerBlock("yellow_warped_stem_dark_campfire",
            ()->new YellowWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedWarpedStemCampfireBlock> YELLOW_STRIPPED_WARPED_STEM_CAMPFIRE = registerBlock("yellow_stripped_warped_stem_campfire",
            ()->new YellowStrippedWarpedStemCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
    public static final RegistryObject<YellowStrippedWarpedStemDarkCampfireBlock> YELLOW_STRIPPED_WARPED_STEM_DARK_CAMPFIRE = registerBlock("yellow_stripped_warped_stem_dark_campfire",
            ()->new YellowStrippedWarpedStemDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // Additional wood types can be added here

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
