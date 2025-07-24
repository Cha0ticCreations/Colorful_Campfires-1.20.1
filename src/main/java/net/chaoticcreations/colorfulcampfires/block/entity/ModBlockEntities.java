package net.chaoticcreations.colorfulcampfires.block.entity;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ColorfulCampfires.MOD_ID);



    // === BASE VARIANT ===
    public static final RegistryObject<BlockEntityType<BirchCampfireBlockEntity>> BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("birch_campfire_be", () -> {
                return BlockEntityType.Builder.of(BirchCampfireBlockEntity::new,
                        ModBlocks.BIRCH_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedBirchCampfireBlockEntity>> STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(StrippedBirchCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_BIRCH_CAMPFIRE.get()).build(null));

    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackBirchCampfireBlockEntity>> BLACK_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BlackBirchCampfireBlockEntity::new,
                        ModBlocks.BLACK_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackBirchDarkCampfireBlockEntity>> BLACK_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlackBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedBirchCampfireBlockEntity>> BLACK_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BlackStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedBirchDarkCampfireBlockEntity>> BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlackStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueBirchCampfireBlockEntity>> BLUE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BlueBirchCampfireBlockEntity::new,
                        ModBlocks.BLUE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueBirchDarkCampfireBlockEntity>> BLUE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlueBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedBirchCampfireBlockEntity>> BLUE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BlueStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedBirchDarkCampfireBlockEntity>> BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlueStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownBirchCampfireBlockEntity>> BROWN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BrownBirchCampfireBlockEntity::new,
                        ModBlocks.BROWN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownBirchDarkCampfireBlockEntity>> BROWN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BrownBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedBirchCampfireBlockEntity>> BROWN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(BrownStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedBirchDarkCampfireBlockEntity>> BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BrownStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanBirchCampfireBlockEntity>> CYAN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_birch_campfire_be", () ->
                BlockEntityType.Builder.of(CyanBirchCampfireBlockEntity::new,
                        ModBlocks.CYAN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanBirchDarkCampfireBlockEntity>> CYAN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(CyanBirchDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedBirchCampfireBlockEntity>> CYAN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(CyanStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedBirchDarkCampfireBlockEntity>> CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(CyanStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayBirchCampfireBlockEntity>> GRAY_BIRCH_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_birch_campfire_be", () ->
                        BlockEntityType.Builder.of(GrayBirchCampfireBlockEntity::new,
                                ModBlocks.GRAY_BIRCH_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayBirchDarkCampfireBlockEntity>> GRAY_BIRCH_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_birch_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(GrayBirchDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_BIRCH_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedBirchCampfireBlockEntity>> GRAY_STRIPPED_BIRCH_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_birch_campfire_be", () ->        
                        BlockEntityType.Builder.of(GrayStrippedBirchCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedBirchDarkCampfireBlockEntity>> GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_birch_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(GrayStrippedBirchDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenBirchCampfireBlockEntity>> GREEN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_birch_campfire_be", () ->
                BlockEntityType.Builder.of(GreenBirchCampfireBlockEntity::new,
                        ModBlocks.GREEN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenBirchDarkCampfireBlockEntity>> GREEN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(GreenBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedBirchCampfireBlockEntity>> GREEN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(GreenStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedBirchDarkCampfireBlockEntity>> GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(GreenStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueBirchCampfireBlockEntity>> LIGHT_BLUE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_birch_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueBirchDarkCampfireBlockEntity>> LIGHT_BLUE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedBirchCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedBirchDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayBirchCampfireBlockEntity>> LIGHT_GRAY_BIRCH_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_birch_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayBirchCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_BIRCH_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayBirchDarkCampfireBlockEntity>> LIGHT_GRAY_BIRCH_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_birch_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayBirchDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_BIRCH_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedBirchCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_birch_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayStrippedBirchCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedBirchDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_birch_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayStrippedBirchDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeBirchCampfireBlockEntity>> LIME_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_birch_campfire_be", () ->
                BlockEntityType.Builder.of(LimeBirchCampfireBlockEntity::new,
                        ModBlocks.LIME_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeBirchDarkCampfireBlockEntity>> LIME_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LimeBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedBirchCampfireBlockEntity>> LIME_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(LimeStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedBirchDarkCampfireBlockEntity>> LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LimeStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaBirchCampfireBlockEntity>> MAGENTA_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_birch_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaBirchCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaBirchDarkCampfireBlockEntity>> MAGENTA_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaBirchDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedBirchCampfireBlockEntity>> MAGENTA_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedBirchDarkCampfireBlockEntity>> MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeBirchCampfireBlockEntity>> ORANGE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeBirchCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeBirchDarkCampfireBlockEntity>> ORANGE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeBirchDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedBirchCampfireBlockEntity>> ORANGE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedBirchDarkCampfireBlockEntity>> ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkBirchCampfireBlockEntity>> PINK_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_birch_campfire_be", () ->
                BlockEntityType.Builder.of(PinkBirchCampfireBlockEntity::new,
                        ModBlocks.PINK_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkBirchDarkCampfireBlockEntity>> PINK_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PinkBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedBirchCampfireBlockEntity>> PINK_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(PinkStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedBirchDarkCampfireBlockEntity>> PINK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PinkStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleBirchCampfireBlockEntity>> PURPLE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_birch_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleBirchCampfireBlockEntity::new,
                        ModBlocks.PURPLE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleBirchDarkCampfireBlockEntity>> PURPLE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedBirchCampfireBlockEntity>> PURPLE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedBirchDarkCampfireBlockEntity>> PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedBirchCampfireBlockEntity>> RED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_birch_campfire_be", () ->
                BlockEntityType.Builder.of(RedBirchCampfireBlockEntity::new,
                        ModBlocks.RED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedBirchDarkCampfireBlockEntity>> RED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(RedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.RED_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedBirchCampfireBlockEntity>> RED_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(RedStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedBirchDarkCampfireBlockEntity>> RED_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(RedStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteBirchCampfireBlockEntity>> WHITE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteBirchCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteBirchDarkCampfireBlockEntity>> WHITE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteBirchDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedBirchCampfireBlockEntity>> WHITE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedBirchDarkCampfireBlockEntity>> WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowBirchCampfireBlockEntity>> YELLOW_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_birch_campfire_be", () ->
                BlockEntityType.Builder.of(YellowBirchCampfireBlockEntity::new,
                        ModBlocks.YELLOW_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowBirchDarkCampfireBlockEntity>> YELLOW_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(YellowBirchDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedBirchCampfireBlockEntity>> YELLOW_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(YellowStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedBirchDarkCampfireBlockEntity>> YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(YellowStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));


    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
