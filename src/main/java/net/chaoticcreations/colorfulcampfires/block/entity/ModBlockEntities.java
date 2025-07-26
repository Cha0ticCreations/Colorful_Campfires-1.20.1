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
    public static final RegistryObject<BlockEntityType<SpruceCampfireBlockEntity>> SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("spruce_campfire_be", () -> {
                return BlockEntityType.Builder.of(SpruceCampfireBlockEntity::new,
                        ModBlocks.SPRUCE_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedSpruceCampfireBlockEntity>> STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(StrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BirchCampfireBlockEntity>> BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("birch_campfire_be", () -> {
                return BlockEntityType.Builder.of(BirchCampfireBlockEntity::new,
                        ModBlocks.BIRCH_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedBirchCampfireBlockEntity>> STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.of(StrippedBirchCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_BIRCH_CAMPFIRE.get()).build(null));

//SPRUCE CAMPFIRE VARIANTS

// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackSpruceCampfireBlockEntity>> BLACK_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BlackSpruceCampfireBlockEntity::new,
                        ModBlocks.BLACK_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackSpruceDarkCampfireBlockEntity>> BLACK_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlackSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedSpruceCampfireBlockEntity>> BLACK_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BlackStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedSpruceDarkCampfireBlockEntity>> BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlackStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueSpruceCampfireBlockEntity>> BLUE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BlueSpruceCampfireBlockEntity::new,
                        ModBlocks.BLUE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueSpruceDarkCampfireBlockEntity>> BLUE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlueSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedSpruceCampfireBlockEntity>> BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BlueStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedSpruceDarkCampfireBlockEntity>> BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BlueStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownSpruceCampfireBlockEntity>> BROWN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BrownSpruceCampfireBlockEntity::new,
                        ModBlocks.BROWN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownSpruceDarkCampfireBlockEntity>> BROWN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BrownSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedSpruceCampfireBlockEntity>> BROWN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(BrownStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedSpruceDarkCampfireBlockEntity>> BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(BrownStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanSpruceCampfireBlockEntity>> CYAN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(CyanSpruceCampfireBlockEntity::new,
                        ModBlocks.CYAN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanSpruceDarkCampfireBlockEntity>> CYAN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(CyanSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedSpruceCampfireBlockEntity>> CYAN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(CyanStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedSpruceDarkCampfireBlockEntity>> CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(CyanStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GraySpruceCampfireBlockEntity>> GRAY_SPRUCE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_spruce_campfire_be", () ->
                        BlockEntityType.Builder.of(GraySpruceCampfireBlockEntity::new,
                                ModBlocks.GRAY_SPRUCE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GraySpruceDarkCampfireBlockEntity>> GRAY_SPRUCE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_spruce_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(GraySpruceDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_SPRUCE_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedSpruceCampfireBlockEntity>> GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_spruce_campfire_be", () ->        
                        BlockEntityType.Builder.of(GrayStrippedSpruceCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedSpruceDarkCampfireBlockEntity>> GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_spruce_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(GrayStrippedSpruceDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenSpruceCampfireBlockEntity>> GREEN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(GreenSpruceCampfireBlockEntity::new,
                        ModBlocks.GREEN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenSpruceDarkCampfireBlockEntity>> GREEN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(GreenSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedSpruceCampfireBlockEntity>> GREEN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(GreenStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedSpruceDarkCampfireBlockEntity>> GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(GreenStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueSpruceCampfireBlockEntity>> LIGHT_BLUE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueSpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueSpruceDarkCampfireBlockEntity>> LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedSpruceCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedSpruceDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LightBlueStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGraySpruceCampfireBlockEntity>> LIGHT_GRAY_SPRUCE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_spruce_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGraySpruceCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_SPRUCE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGraySpruceDarkCampfireBlockEntity>> LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_spruce_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGraySpruceDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedSpruceCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_spruce_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayStrippedSpruceCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedSpruceDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_spruce_dark_campfire_be", () ->
                        BlockEntityType.Builder.of(LightGrayStrippedSpruceDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeSpruceCampfireBlockEntity>> LIME_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(LimeSpruceCampfireBlockEntity::new,
                        ModBlocks.LIME_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeSpruceDarkCampfireBlockEntity>> LIME_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LimeSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedSpruceCampfireBlockEntity>> LIME_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(LimeStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedSpruceDarkCampfireBlockEntity>> LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(LimeStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaSpruceCampfireBlockEntity>> MAGENTA_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaSpruceCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaSpruceDarkCampfireBlockEntity>> MAGENTA_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedSpruceCampfireBlockEntity>> MAGENTA_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedSpruceDarkCampfireBlockEntity>> MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(MagentaStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeSpruceCampfireBlockEntity>> ORANGE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeSpruceCampfireBlockEntity::new,
                        ModBlocks.ORANGE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeSpruceDarkCampfireBlockEntity>> ORANGE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedSpruceCampfireBlockEntity>> ORANGE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedSpruceDarkCampfireBlockEntity>> ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkSpruceCampfireBlockEntity>> PINK_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(PinkSpruceCampfireBlockEntity::new,
                        ModBlocks.PINK_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkSpruceDarkCampfireBlockEntity>> PINK_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PinkSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedSpruceCampfireBlockEntity>> PINK_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(PinkStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedSpruceDarkCampfireBlockEntity>> PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PinkStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleSpruceCampfireBlockEntity>> PURPLE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleSpruceCampfireBlockEntity::new,
                        ModBlocks.PURPLE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleSpruceDarkCampfireBlockEntity>> PURPLE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedSpruceCampfireBlockEntity>> PURPLE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedSpruceDarkCampfireBlockEntity>> PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(PurpleStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedSpruceCampfireBlockEntity>> RED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(RedSpruceCampfireBlockEntity::new,
                        ModBlocks.RED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedSpruceDarkCampfireBlockEntity>> RED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(RedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.RED_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedSpruceCampfireBlockEntity>> RED_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(RedStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedSpruceDarkCampfireBlockEntity>> RED_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(RedStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteSpruceCampfireBlockEntity>> WHITE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteSpruceCampfireBlockEntity::new,
                        ModBlocks.WHITE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteSpruceDarkCampfireBlockEntity>> WHITE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedSpruceCampfireBlockEntity>> WHITE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedSpruceDarkCampfireBlockEntity>> WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowSpruceCampfireBlockEntity>> YELLOW_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(YellowSpruceCampfireBlockEntity::new,
                        ModBlocks.YELLOW_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowSpruceDarkCampfireBlockEntity>> YELLOW_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(YellowSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedSpruceCampfireBlockEntity>> YELLOW_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.of(YellowStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedSpruceDarkCampfireBlockEntity>> YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.of(YellowStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

//BIRCH CAMPFIRE VARIANTS                        

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
