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
                return BlockEntityType.Builder.<SpruceCampfireBlockEntity>of(SpruceCampfireBlockEntity::new,
                        ModBlocks.SPRUCE_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedSpruceCampfireBlockEntity>> STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<StrippedSpruceCampfireBlockEntity>of(StrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<BirchCampfireBlockEntity>> BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("birch_campfire_be", () -> {
                return BlockEntityType.Builder.<BirchCampfireBlockEntity>of(BirchCampfireBlockEntity::new,
                        ModBlocks.BIRCH_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedBirchCampfireBlockEntity>> STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<StrippedBirchCampfireBlockEntity>of(StrippedBirchCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_BIRCH_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<AcaciaCampfireBlockEntity>> ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("acacia_campfire_be", () -> {
                return BlockEntityType.Builder.<AcaciaCampfireBlockEntity>of(AcaciaCampfireBlockEntity::new,
                        ModBlocks.ACACIA_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedAcaciaCampfireBlockEntity>> STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<StrippedAcaciaCampfireBlockEntity>of(StrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_ACACIA_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<WarpedStemCampfireBlockEntity>> WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("warped_stem_campfire_be", () -> {
                return BlockEntityType.Builder.<WarpedStemCampfireBlockEntity>of(WarpedStemCampfireBlockEntity::new,
                        ModBlocks.WARPED_STEM_CAMPFIRE.get()).build(null);
            });
    public static final RegistryObject<BlockEntityType<StrippedWarpedStemCampfireBlockEntity>> STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<StrippedWarpedStemCampfireBlockEntity>of(StrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<CrimsonStemCampfireBlockEntity>> CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("crimson_stem_campfire_be", () -> {
                return BlockEntityType.Builder.<CrimsonStemCampfireBlockEntity>of(CrimsonStemCampfireBlockEntity::new,
                        ModBlocks.CRIMSON_STEM_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedCrimsonStemCampfireBlockEntity>> STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<StrippedCrimsonStemCampfireBlockEntity>of(StrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<JungleCampfireBlockEntity>> JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("jungle_campfire_be", () -> {
                return BlockEntityType.Builder.<JungleCampfireBlockEntity>of(JungleCampfireBlockEntity::new,
                        ModBlocks.JUNGLE_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedJungleCampfireBlockEntity>> STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<StrippedJungleCampfireBlockEntity>of(StrippedJungleCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<MangroveCampfireBlockEntity>> MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("mangrove_campfire_be", () -> {
                return BlockEntityType.Builder.<MangroveCampfireBlockEntity>of(MangroveCampfireBlockEntity::new,
                        ModBlocks.MANGROVE_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedMangroveCampfireBlockEntity>> STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<StrippedMangroveCampfireBlockEntity>of(StrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<CherryCampfireBlockEntity>> CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cherry_campfire_be", () -> {
                return BlockEntityType.Builder.<CherryCampfireBlockEntity>of(CherryCampfireBlockEntity::new,
                        ModBlocks.CHERRY_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedCherryCampfireBlockEntity>> STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<StrippedCherryCampfireBlockEntity>of(StrippedCherryCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<DarkOakCampfireBlockEntity>> DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("dark_oak_campfire_be", () -> {
                return BlockEntityType.Builder.<DarkOakCampfireBlockEntity>of(DarkOakCampfireBlockEntity::new,
                        ModBlocks.DARK_OAK_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedDarkOakCampfireBlockEntity>> STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<StrippedDarkOakCampfireBlockEntity>of(StrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<OakCampfireBlockEntity>> OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("oak_campfire_be", () -> {
                return BlockEntityType.Builder.<OakCampfireBlockEntity>of(OakCampfireBlockEntity::new,
                        ModBlocks.OAK_CAMPFIRE.get()).build(null);
            });
        public static final RegistryObject<BlockEntityType<StrippedOakCampfireBlockEntity>> STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<StrippedOakCampfireBlockEntity>of(StrippedOakCampfireBlockEntity::new,
                        ModBlocks.STRIPPED_OAK_CAMPFIRE.get()).build(null));
        



//OAK CAMPFIRE VARIANTS
// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackOakCampfireBlockEntity>> BLACK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlackOakCampfireBlockEntity>of(BlackOakCampfireBlockEntity::new,
                        ModBlocks.BLACK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackOakDarkCampfireBlockEntity>> BLACK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackOakDarkCampfireBlockEntity>of(BlackOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedOakCampfireBlockEntity>> BLACK_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedOakCampfireBlockEntity>of(BlackStrippedOakCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedOakDarkCampfireBlockEntity>> BLACK_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedOakDarkCampfireBlockEntity>of(BlackStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueOakCampfireBlockEntity>> BLUE_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlueOakCampfireBlockEntity>of(BlueOakCampfireBlockEntity::new,
                        ModBlocks.BLUE_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueOakDarkCampfireBlockEntity>> BLUE_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueOakDarkCampfireBlockEntity>of(BlueOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedOakCampfireBlockEntity>> BLUE_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedOakCampfireBlockEntity>of(BlueStrippedOakCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedOakDarkCampfireBlockEntity>> BLUE_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedOakDarkCampfireBlockEntity>of(BlueStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownOakCampfireBlockEntity>> BROWN_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_oak_campfire_be", () ->
                BlockEntityType.Builder.<BrownOakCampfireBlockEntity>of(BrownOakCampfireBlockEntity::new,
                        ModBlocks.BROWN_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownOakDarkCampfireBlockEntity>> BROWN_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownOakDarkCampfireBlockEntity>of(BrownOakDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedOakCampfireBlockEntity>> BROWN_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedOakCampfireBlockEntity>of(BrownStrippedOakCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedOakDarkCampfireBlockEntity>> BROWN_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedOakDarkCampfireBlockEntity>of(BrownStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanOakCampfireBlockEntity>> CYAN_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_oak_campfire_be", () ->
                BlockEntityType.Builder.<CyanOakCampfireBlockEntity>of(CyanOakCampfireBlockEntity::new,
                        ModBlocks.CYAN_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanOakDarkCampfireBlockEntity>> CYAN_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanOakDarkCampfireBlockEntity>of(CyanOakDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedOakCampfireBlockEntity>> CYAN_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedOakCampfireBlockEntity>of(CyanStrippedOakCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedOakDarkCampfireBlockEntity>> CYAN_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedOakDarkCampfireBlockEntity>of(CyanStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayOakCampfireBlockEntity>> GRAY_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_oak_campfire_be", () ->
                        BlockEntityType.Builder.<GrayOakCampfireBlockEntity>of(GrayOakCampfireBlockEntity::new,
                                ModBlocks.GRAY_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayOakDarkCampfireBlockEntity>> GRAY_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayOakDarkCampfireBlockEntity>of(GrayOakDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_OAK_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedOakCampfireBlockEntity>> GRAY_STRIPPED_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_oak_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedOakCampfireBlockEntity>of(GrayStrippedOakCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedOakDarkCampfireBlockEntity>> GRAY_STRIPPED_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedOakDarkCampfireBlockEntity>of(GrayStrippedOakDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenOakCampfireBlockEntity>> GREEN_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_oak_campfire_be", () ->
                BlockEntityType.Builder.<GreenOakCampfireBlockEntity>of(GreenOakCampfireBlockEntity::new,
                        ModBlocks.GREEN_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenOakDarkCampfireBlockEntity>> GREEN_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenOakDarkCampfireBlockEntity>of(GreenOakDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedOakCampfireBlockEntity>> GREEN_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedOakCampfireBlockEntity>of(GreenStrippedOakCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedOakDarkCampfireBlockEntity>> GREEN_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedOakDarkCampfireBlockEntity>of(GreenStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueOakCampfireBlockEntity>> LIGHT_BLUE_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_oak_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueOakCampfireBlockEntity>of(LightBlueOakCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueOakDarkCampfireBlockEntity>> LIGHT_BLUE_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueOakDarkCampfireBlockEntity>of(LightBlueOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedOakCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedOakCampfireBlockEntity>of(LightBlueStrippedOakCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedOakDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedOakDarkCampfireBlockEntity>of(LightBlueStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayOakCampfireBlockEntity>> LIGHT_GRAY_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_oak_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayOakCampfireBlockEntity>of(LightGrayOakCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayOakDarkCampfireBlockEntity>> LIGHT_GRAY_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayOakDarkCampfireBlockEntity>of(LightGrayOakDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_OAK_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedOakCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_oak_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedOakCampfireBlockEntity>of(LightGrayStrippedOakCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedOakDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedOakDarkCampfireBlockEntity>of(LightGrayStrippedOakDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeOakCampfireBlockEntity>> LIME_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_oak_campfire_be", () ->
                BlockEntityType.Builder.<LimeOakCampfireBlockEntity>of(LimeOakCampfireBlockEntity::new,
                        ModBlocks.LIME_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeOakDarkCampfireBlockEntity>> LIME_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeOakDarkCampfireBlockEntity>of(LimeOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedOakCampfireBlockEntity>> LIME_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedOakCampfireBlockEntity>of(LimeStrippedOakCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedOakDarkCampfireBlockEntity>> LIME_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedOakDarkCampfireBlockEntity>of(LimeStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaOakCampfireBlockEntity>> MAGENTA_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_oak_campfire_be", () ->
                BlockEntityType.Builder.<MagentaOakCampfireBlockEntity>of(MagentaOakCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaOakDarkCampfireBlockEntity>> MAGENTA_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaOakDarkCampfireBlockEntity>of(MagentaOakDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedOakCampfireBlockEntity>> MAGENTA_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedOakCampfireBlockEntity>of(MagentaStrippedOakCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedOakDarkCampfireBlockEntity>> MAGENTA_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedOakDarkCampfireBlockEntity>of(MagentaStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeOakCampfireBlockEntity>> ORANGE_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_oak_campfire_be", () ->
                BlockEntityType.Builder.<OrangeOakCampfireBlockEntity>of(OrangeOakCampfireBlockEntity::new,
                        ModBlocks.ORANGE_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeOakDarkCampfireBlockEntity>> ORANGE_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeOakDarkCampfireBlockEntity>of(OrangeOakDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedOakCampfireBlockEntity>> ORANGE_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedOakCampfireBlockEntity>of(OrangeStrippedOakCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedOakDarkCampfireBlockEntity>> ORANGE_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedOakDarkCampfireBlockEntity>of(OrangeStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkOakCampfireBlockEntity>> PINK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_oak_campfire_be", () ->
                BlockEntityType.Builder.<PinkOakCampfireBlockEntity>of(PinkOakCampfireBlockEntity::new,
                        ModBlocks.PINK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkOakDarkCampfireBlockEntity>> PINK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkOakDarkCampfireBlockEntity>of(PinkOakDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedOakCampfireBlockEntity>> PINK_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedOakCampfireBlockEntity>of(PinkStrippedOakCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedOakDarkCampfireBlockEntity>> PINK_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedOakDarkCampfireBlockEntity>of(PinkStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleOakCampfireBlockEntity>> PURPLE_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_oak_campfire_be", () ->
                BlockEntityType.Builder.<PurpleOakCampfireBlockEntity>of(PurpleOakCampfireBlockEntity::new,
                        ModBlocks.PURPLE_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleOakDarkCampfireBlockEntity>> PURPLE_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleOakDarkCampfireBlockEntity>of(PurpleOakDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedOakCampfireBlockEntity>> PURPLE_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedOakCampfireBlockEntity>of(PurpleStrippedOakCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedOakDarkCampfireBlockEntity>> PURPLE_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedOakDarkCampfireBlockEntity>of(PurpleStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedOakCampfireBlockEntity>> RED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_oak_campfire_be", () ->
                BlockEntityType.Builder.<RedOakCampfireBlockEntity>of(RedOakCampfireBlockEntity::new,
                        ModBlocks.RED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedOakDarkCampfireBlockEntity>> RED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedOakDarkCampfireBlockEntity>of(RedOakDarkCampfireBlockEntity::new,
                        ModBlocks.RED_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedOakCampfireBlockEntity>> RED_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedOakCampfireBlockEntity>of(RedStrippedOakCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedOakDarkCampfireBlockEntity>> RED_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedOakDarkCampfireBlockEntity>of(RedStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteOakCampfireBlockEntity>> WHITE_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_oak_campfire_be", () ->
                BlockEntityType.Builder.<WhiteOakCampfireBlockEntity>of(WhiteOakCampfireBlockEntity::new,
                        ModBlocks.WHITE_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteOakDarkCampfireBlockEntity>> WHITE_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteOakDarkCampfireBlockEntity>of(WhiteOakDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedOakCampfireBlockEntity>> WHITE_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedOakCampfireBlockEntity>of(WhiteStrippedOakCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedOakDarkCampfireBlockEntity>> WHITE_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedOakDarkCampfireBlockEntity>of(WhiteStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowOakCampfireBlockEntity>> YELLOW_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_oak_campfire_be", () ->
                BlockEntityType.Builder.<YellowOakCampfireBlockEntity>of(YellowOakCampfireBlockEntity::new,
                        ModBlocks.YELLOW_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowOakDarkCampfireBlockEntity>> YELLOW_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowOakDarkCampfireBlockEntity>of(YellowOakDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedOakCampfireBlockEntity>> YELLOW_STRIPPED_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_oak_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedOakCampfireBlockEntity>of(YellowStrippedOakCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedOakDarkCampfireBlockEntity>> YELLOW_STRIPPED_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedOakDarkCampfireBlockEntity>of(YellowStrippedOakDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_OAK_DARK_CAMPFIRE.get()).build(null));

//SPRUCE CAMPFIRE VARIANTS

// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackSpruceCampfireBlockEntity>> BLACK_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BlackSpruceCampfireBlockEntity>of(BlackSpruceCampfireBlockEntity::new,
                        ModBlocks.BLACK_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackSpruceDarkCampfireBlockEntity>> BLACK_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackSpruceDarkCampfireBlockEntity>of(BlackSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedSpruceCampfireBlockEntity>> BLACK_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedSpruceCampfireBlockEntity>of(BlackStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedSpruceDarkCampfireBlockEntity>> BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedSpruceDarkCampfireBlockEntity>of(BlackStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueSpruceCampfireBlockEntity>> BLUE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BlueSpruceCampfireBlockEntity>of(BlueSpruceCampfireBlockEntity::new,
                        ModBlocks.BLUE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueSpruceDarkCampfireBlockEntity>> BLUE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueSpruceDarkCampfireBlockEntity>of(BlueSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedSpruceCampfireBlockEntity>> BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedSpruceCampfireBlockEntity>of(BlueStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedSpruceDarkCampfireBlockEntity>> BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedSpruceDarkCampfireBlockEntity>of(BlueStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownSpruceCampfireBlockEntity>> BROWN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BrownSpruceCampfireBlockEntity>of(BrownSpruceCampfireBlockEntity::new,
                        ModBlocks.BROWN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownSpruceDarkCampfireBlockEntity>> BROWN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownSpruceDarkCampfireBlockEntity>of(BrownSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedSpruceCampfireBlockEntity>> BROWN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedSpruceCampfireBlockEntity>of(BrownStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedSpruceDarkCampfireBlockEntity>> BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedSpruceDarkCampfireBlockEntity>of(BrownStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanSpruceCampfireBlockEntity>> CYAN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_spruce_campfire_be", () ->
                BlockEntityType.Builder.<CyanSpruceCampfireBlockEntity>of(CyanSpruceCampfireBlockEntity::new,
                        ModBlocks.CYAN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanSpruceDarkCampfireBlockEntity>> CYAN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanSpruceDarkCampfireBlockEntity>of(CyanSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedSpruceCampfireBlockEntity>> CYAN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedSpruceCampfireBlockEntity>of(CyanStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedSpruceDarkCampfireBlockEntity>> CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedSpruceDarkCampfireBlockEntity>of(CyanStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<GraySpruceCampfireBlockEntity>> GRAY_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_spruce_campfire_be", () ->
                BlockEntityType.Builder.<GraySpruceCampfireBlockEntity>of(GraySpruceCampfireBlockEntity::new,
                        ModBlocks.GRAY_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GraySpruceDarkCampfireBlockEntity>> GRAY_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<GraySpruceDarkCampfireBlockEntity>of(GraySpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedSpruceCampfireBlockEntity>> GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_spruce_campfire_be", () ->        
                BlockEntityType.Builder.<GrayStrippedSpruceCampfireBlockEntity>of(GrayStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedSpruceDarkCampfireBlockEntity>> GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<GrayStrippedSpruceDarkCampfireBlockEntity>of(GrayStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenSpruceCampfireBlockEntity>> GREEN_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_spruce_campfire_be", () ->
                BlockEntityType.Builder.<GreenSpruceCampfireBlockEntity>of(GreenSpruceCampfireBlockEntity::new,
                        ModBlocks.GREEN_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenSpruceDarkCampfireBlockEntity>> GREEN_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenSpruceDarkCampfireBlockEntity>of(GreenSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedSpruceCampfireBlockEntity>> GREEN_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedSpruceCampfireBlockEntity>of(GreenStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedSpruceDarkCampfireBlockEntity>> GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedSpruceDarkCampfireBlockEntity>of(GreenStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueSpruceCampfireBlockEntity>> LIGHT_BLUE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueSpruceCampfireBlockEntity>of(LightBlueSpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueSpruceDarkCampfireBlockEntity>> LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueSpruceDarkCampfireBlockEntity>of(LightBlueSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedSpruceCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedSpruceCampfireBlockEntity>of(LightBlueStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedSpruceDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedSpruceDarkCampfireBlockEntity>of(LightBlueStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightGraySpruceCampfireBlockEntity>> LIGHT_GRAY_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LightGraySpruceCampfireBlockEntity>of(LightGraySpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGraySpruceDarkCampfireBlockEntity>> LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGraySpruceDarkCampfireBlockEntity>of(LightGraySpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedSpruceCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedSpruceCampfireBlockEntity>of(LightGrayStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedSpruceDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedSpruceDarkCampfireBlockEntity>of(LightGrayStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeSpruceCampfireBlockEntity>> LIME_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LimeSpruceCampfireBlockEntity>of(LimeSpruceCampfireBlockEntity::new,
                        ModBlocks.LIME_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeSpruceDarkCampfireBlockEntity>> LIME_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeSpruceDarkCampfireBlockEntity>of(LimeSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedSpruceCampfireBlockEntity>> LIME_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedSpruceCampfireBlockEntity>of(LimeStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedSpruceDarkCampfireBlockEntity>> LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedSpruceDarkCampfireBlockEntity>of(LimeStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaSpruceCampfireBlockEntity>> MAGENTA_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_spruce_campfire_be", () ->
                BlockEntityType.Builder.<MagentaSpruceCampfireBlockEntity>of(MagentaSpruceCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaSpruceDarkCampfireBlockEntity>> MAGENTA_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaSpruceDarkCampfireBlockEntity>of(MagentaSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedSpruceCampfireBlockEntity>> MAGENTA_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedSpruceCampfireBlockEntity>of(MagentaStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedSpruceDarkCampfireBlockEntity>> MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedSpruceDarkCampfireBlockEntity>of(MagentaStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeSpruceCampfireBlockEntity>> ORANGE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_spruce_campfire_be", () ->
                BlockEntityType.Builder.<OrangeSpruceCampfireBlockEntity>of(OrangeSpruceCampfireBlockEntity::new,
                        ModBlocks.ORANGE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeSpruceDarkCampfireBlockEntity>> ORANGE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeSpruceDarkCampfireBlockEntity>of(OrangeSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedSpruceCampfireBlockEntity>> ORANGE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedSpruceCampfireBlockEntity>of(OrangeStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedSpruceDarkCampfireBlockEntity>> ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedSpruceDarkCampfireBlockEntity>of(OrangeStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkSpruceCampfireBlockEntity>> PINK_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_spruce_campfire_be", () ->
                BlockEntityType.Builder.<PinkSpruceCampfireBlockEntity>of(PinkSpruceCampfireBlockEntity::new,
                        ModBlocks.PINK_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkSpruceDarkCampfireBlockEntity>> PINK_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkSpruceDarkCampfireBlockEntity>of(PinkSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedSpruceCampfireBlockEntity>> PINK_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedSpruceCampfireBlockEntity>of(PinkStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedSpruceDarkCampfireBlockEntity>> PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedSpruceDarkCampfireBlockEntity>of(PinkStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleSpruceCampfireBlockEntity>> PURPLE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_spruce_campfire_be", () ->
                BlockEntityType.Builder.<PurpleSpruceCampfireBlockEntity>of(PurpleSpruceCampfireBlockEntity::new,
                        ModBlocks.PURPLE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleSpruceDarkCampfireBlockEntity>> PURPLE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleSpruceDarkCampfireBlockEntity>of(PurpleSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedSpruceCampfireBlockEntity>> PURPLE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedSpruceCampfireBlockEntity>of(PurpleStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedSpruceDarkCampfireBlockEntity>> PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedSpruceDarkCampfireBlockEntity>of(PurpleStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedSpruceCampfireBlockEntity>> RED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_spruce_campfire_be", () ->
                BlockEntityType.Builder.<RedSpruceCampfireBlockEntity>of(RedSpruceCampfireBlockEntity::new,
                        ModBlocks.RED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedSpruceDarkCampfireBlockEntity>> RED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedSpruceDarkCampfireBlockEntity>of(RedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.RED_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedSpruceCampfireBlockEntity>> RED_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedSpruceCampfireBlockEntity>of(RedStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedSpruceDarkCampfireBlockEntity>> RED_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedSpruceDarkCampfireBlockEntity>of(RedStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteSpruceCampfireBlockEntity>> WHITE_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_spruce_campfire_be", () ->
                BlockEntityType.Builder.<WhiteSpruceCampfireBlockEntity>of(WhiteSpruceCampfireBlockEntity::new,
                        ModBlocks.WHITE_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteSpruceDarkCampfireBlockEntity>> WHITE_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteSpruceDarkCampfireBlockEntity>of(WhiteSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedSpruceCampfireBlockEntity>> WHITE_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedSpruceCampfireBlockEntity>of(WhiteStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedSpruceDarkCampfireBlockEntity>> WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedSpruceDarkCampfireBlockEntity>of(WhiteStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowSpruceCampfireBlockEntity>> YELLOW_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_spruce_campfire_be", () ->
                BlockEntityType.Builder.<YellowSpruceCampfireBlockEntity>of(YellowSpruceCampfireBlockEntity::new,
                        ModBlocks.YELLOW_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowSpruceDarkCampfireBlockEntity>> YELLOW_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowSpruceDarkCampfireBlockEntity>of(YellowSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_SPRUCE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedSpruceCampfireBlockEntity>> YELLOW_STRIPPED_SPRUCE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_spruce_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedSpruceCampfireBlockEntity>of(YellowStrippedSpruceCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_SPRUCE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedSpruceDarkCampfireBlockEntity>> YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_spruce_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedSpruceDarkCampfireBlockEntity>of(YellowStrippedSpruceDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_SPRUCE_DARK_CAMPFIRE.get()).build(null));

//BIRCH CAMPFIRE VARIANTS                        

    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackBirchCampfireBlockEntity>> BLACK_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_birch_campfire_be", () ->
                BlockEntityType.Builder.<BlackBirchCampfireBlockEntity>of(BlackBirchCampfireBlockEntity::new,
                        ModBlocks.BLACK_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackBirchDarkCampfireBlockEntity>> BLACK_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackBirchDarkCampfireBlockEntity>of(BlackBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedBirchCampfireBlockEntity>> BLACK_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedBirchCampfireBlockEntity>of(BlackStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedBirchDarkCampfireBlockEntity>> BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedBirchDarkCampfireBlockEntity>of(BlackStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueBirchCampfireBlockEntity>> BLUE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_birch_campfire_be", () ->
                BlockEntityType.Builder.<BlueBirchCampfireBlockEntity>of(BlueBirchCampfireBlockEntity::new,
                        ModBlocks.BLUE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueBirchDarkCampfireBlockEntity>> BLUE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueBirchDarkCampfireBlockEntity>of(BlueBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedBirchCampfireBlockEntity>> BLUE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedBirchCampfireBlockEntity>of(BlueStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedBirchDarkCampfireBlockEntity>> BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedBirchDarkCampfireBlockEntity>of(BlueStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownBirchCampfireBlockEntity>> BROWN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_birch_campfire_be", () ->
                BlockEntityType.Builder.<BrownBirchCampfireBlockEntity>of(BrownBirchCampfireBlockEntity::new,
                        ModBlocks.BROWN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownBirchDarkCampfireBlockEntity>> BROWN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownBirchDarkCampfireBlockEntity>of(BrownBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedBirchCampfireBlockEntity>> BROWN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedBirchCampfireBlockEntity>of(BrownStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedBirchDarkCampfireBlockEntity>> BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedBirchDarkCampfireBlockEntity>of(BrownStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanBirchCampfireBlockEntity>> CYAN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_birch_campfire_be", () ->
                BlockEntityType.Builder.<CyanBirchCampfireBlockEntity>of(CyanBirchCampfireBlockEntity::new,
                        ModBlocks.CYAN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanBirchDarkCampfireBlockEntity>> CYAN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanBirchDarkCampfireBlockEntity>of(CyanBirchDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedBirchCampfireBlockEntity>> CYAN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedBirchCampfireBlockEntity>of(CyanStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedBirchDarkCampfireBlockEntity>> CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedBirchDarkCampfireBlockEntity>of(CyanStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<GrayBirchCampfireBlockEntity>> GRAY_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_birch_campfire_be", () ->
                BlockEntityType.Builder.<GrayBirchCampfireBlockEntity>of(GrayBirchCampfireBlockEntity::new,
                        ModBlocks.GRAY_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayBirchDarkCampfireBlockEntity>> GRAY_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<GrayBirchDarkCampfireBlockEntity>of(GrayBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedBirchCampfireBlockEntity>> GRAY_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_birch_campfire_be", () ->        
                BlockEntityType.Builder.<GrayStrippedBirchCampfireBlockEntity>of(GrayStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedBirchDarkCampfireBlockEntity>> GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<GrayStrippedBirchDarkCampfireBlockEntity>of(GrayStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenBirchCampfireBlockEntity>> GREEN_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_birch_campfire_be", () ->
                BlockEntityType.Builder.<GreenBirchCampfireBlockEntity>of(GreenBirchCampfireBlockEntity::new,
                        ModBlocks.GREEN_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenBirchDarkCampfireBlockEntity>> GREEN_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenBirchDarkCampfireBlockEntity>of(GreenBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedBirchCampfireBlockEntity>> GREEN_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedBirchCampfireBlockEntity>of(GreenStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedBirchDarkCampfireBlockEntity>> GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedBirchDarkCampfireBlockEntity>of(GreenStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueBirchCampfireBlockEntity>> LIGHT_BLUE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_birch_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueBirchCampfireBlockEntity>of(LightBlueBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueBirchDarkCampfireBlockEntity>> LIGHT_BLUE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueBirchDarkCampfireBlockEntity>of(LightBlueBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedBirchCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedBirchCampfireBlockEntity>of(LightBlueStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedBirchDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedBirchDarkCampfireBlockEntity>of(LightBlueStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightGrayBirchCampfireBlockEntity>> LIGHT_GRAY_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_birch_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayBirchCampfireBlockEntity>of(LightGrayBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayBirchDarkCampfireBlockEntity>> LIGHT_GRAY_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayBirchDarkCampfireBlockEntity>of(LightGrayBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedBirchCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedBirchCampfireBlockEntity>of(LightGrayStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedBirchDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedBirchDarkCampfireBlockEntity>of(LightGrayStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeBirchCampfireBlockEntity>> LIME_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_birch_campfire_be", () ->
                BlockEntityType.Builder.<LimeBirchCampfireBlockEntity>of(LimeBirchCampfireBlockEntity::new,
                        ModBlocks.LIME_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeBirchDarkCampfireBlockEntity>> LIME_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeBirchDarkCampfireBlockEntity>of(LimeBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedBirchCampfireBlockEntity>> LIME_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedBirchCampfireBlockEntity>of(LimeStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedBirchDarkCampfireBlockEntity>> LIME_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedBirchDarkCampfireBlockEntity>of(LimeStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaBirchCampfireBlockEntity>> MAGENTA_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_birch_campfire_be", () ->
                BlockEntityType.Builder.<MagentaBirchCampfireBlockEntity>of(MagentaBirchCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaBirchDarkCampfireBlockEntity>> MAGENTA_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaBirchDarkCampfireBlockEntity>of(MagentaBirchDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedBirchCampfireBlockEntity>> MAGENTA_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedBirchCampfireBlockEntity>of(MagentaStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedBirchDarkCampfireBlockEntity>> MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedBirchDarkCampfireBlockEntity>of(MagentaStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeBirchCampfireBlockEntity>> ORANGE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_campfire_be", () ->
                BlockEntityType.Builder.<OrangeBirchCampfireBlockEntity>of(OrangeBirchCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeBirchDarkCampfireBlockEntity>> ORANGE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeBirchDarkCampfireBlockEntity>of(OrangeBirchDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedBirchCampfireBlockEntity>> ORANGE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedBirchCampfireBlockEntity>of(OrangeStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedBirchDarkCampfireBlockEntity>> ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedBirchDarkCampfireBlockEntity>of(OrangeStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkBirchCampfireBlockEntity>> PINK_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_birch_campfire_be", () ->
                BlockEntityType.Builder.<PinkBirchCampfireBlockEntity>of(PinkBirchCampfireBlockEntity::new,
                        ModBlocks.PINK_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkBirchDarkCampfireBlockEntity>> PINK_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkBirchDarkCampfireBlockEntity>of(PinkBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedBirchCampfireBlockEntity>> PINK_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedBirchCampfireBlockEntity>of(PinkStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedBirchDarkCampfireBlockEntity>> PINK_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedBirchDarkCampfireBlockEntity>of(PinkStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleBirchCampfireBlockEntity>> PURPLE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_birch_campfire_be", () ->
                BlockEntityType.Builder.<PurpleBirchCampfireBlockEntity>of(PurpleBirchCampfireBlockEntity::new,
                        ModBlocks.PURPLE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleBirchDarkCampfireBlockEntity>> PURPLE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleBirchDarkCampfireBlockEntity>of(PurpleBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedBirchCampfireBlockEntity>> PURPLE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedBirchCampfireBlockEntity>of(PurpleStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedBirchDarkCampfireBlockEntity>> PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedBirchDarkCampfireBlockEntity>of(PurpleStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedBirchCampfireBlockEntity>> RED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_birch_campfire_be", () ->
                BlockEntityType.Builder.<RedBirchCampfireBlockEntity>of(RedBirchCampfireBlockEntity::new,
                        ModBlocks.RED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedBirchDarkCampfireBlockEntity>> RED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedBirchDarkCampfireBlockEntity>of(RedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.RED_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedBirchCampfireBlockEntity>> RED_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedBirchCampfireBlockEntity>of(RedStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedBirchDarkCampfireBlockEntity>> RED_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedBirchDarkCampfireBlockEntity>of(RedStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteBirchCampfireBlockEntity>> WHITE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_campfire_be", () ->
                BlockEntityType.Builder.<WhiteBirchCampfireBlockEntity>of(WhiteBirchCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteBirchDarkCampfireBlockEntity>> WHITE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteBirchDarkCampfireBlockEntity>of(WhiteBirchDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedBirchCampfireBlockEntity>> WHITE_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedBirchCampfireBlockEntity>of(WhiteStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedBirchDarkCampfireBlockEntity>> WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedBirchDarkCampfireBlockEntity>of(WhiteStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowBirchCampfireBlockEntity>> YELLOW_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_birch_campfire_be", () ->
                BlockEntityType.Builder.<YellowBirchCampfireBlockEntity>of(YellowBirchCampfireBlockEntity::new,
                        ModBlocks.YELLOW_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowBirchDarkCampfireBlockEntity>> YELLOW_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowBirchDarkCampfireBlockEntity>of(YellowBirchDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_BIRCH_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedBirchCampfireBlockEntity>> YELLOW_STRIPPED_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_birch_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedBirchCampfireBlockEntity>of(YellowStrippedBirchCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_BIRCH_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedBirchDarkCampfireBlockEntity>> YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedBirchDarkCampfireBlockEntity>of(YellowStrippedBirchDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_BIRCH_DARK_CAMPFIRE.get()).build(null));

// JUNGLE CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackJungleCampfireBlockEntity>> BLACK_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BlackJungleCampfireBlockEntity>of(BlackJungleCampfireBlockEntity::new,
                        ModBlocks.BLACK_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackJungleDarkCampfireBlockEntity>> BLACK_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackJungleDarkCampfireBlockEntity>of(BlackJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedJungleCampfireBlockEntity>> BLACK_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedJungleCampfireBlockEntity>of(BlackStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedJungleDarkCampfireBlockEntity>> BLACK_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedJungleDarkCampfireBlockEntity>of(BlackStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueJungleCampfireBlockEntity>> BLUE_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BlueJungleCampfireBlockEntity>of(BlueJungleCampfireBlockEntity::new,
                        ModBlocks.BLUE_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueJungleDarkCampfireBlockEntity>> BLUE_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueJungleDarkCampfireBlockEntity>of(BlueJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedJungleCampfireBlockEntity>> BLUE_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedJungleCampfireBlockEntity>of(BlueStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedJungleDarkCampfireBlockEntity>> BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedJungleDarkCampfireBlockEntity>of(BlueStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownJungleCampfireBlockEntity>> BROWN_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BrownJungleCampfireBlockEntity>of(BrownJungleCampfireBlockEntity::new,
                        ModBlocks.BROWN_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownJungleDarkCampfireBlockEntity>> BROWN_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownJungleDarkCampfireBlockEntity>of(BrownJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedJungleCampfireBlockEntity>> BROWN_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedJungleCampfireBlockEntity>of(BrownStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedJungleDarkCampfireBlockEntity>> BROWN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedJungleDarkCampfireBlockEntity>of(BrownStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanJungleCampfireBlockEntity>> CYAN_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_jungle_campfire_be", () ->
                BlockEntityType.Builder.<CyanJungleCampfireBlockEntity>of(CyanJungleCampfireBlockEntity::new,
                        ModBlocks.CYAN_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanJungleDarkCampfireBlockEntity>> CYAN_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanJungleDarkCampfireBlockEntity>of(CyanJungleDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedJungleCampfireBlockEntity>> CYAN_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedJungleCampfireBlockEntity>of(CyanStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedJungleDarkCampfireBlockEntity>> CYAN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedJungleDarkCampfireBlockEntity>of(CyanStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayJungleCampfireBlockEntity>> GRAY_JUNGLE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_jungle_campfire_be", () ->
                        BlockEntityType.Builder.<GrayJungleCampfireBlockEntity>of(GrayJungleCampfireBlockEntity::new,
                                ModBlocks.GRAY_JUNGLE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayJungleDarkCampfireBlockEntity>> GRAY_JUNGLE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_jungle_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayJungleDarkCampfireBlockEntity>of(GrayJungleDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_JUNGLE_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedJungleCampfireBlockEntity>> GRAY_STRIPPED_JUNGLE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_jungle_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedJungleCampfireBlockEntity>of(GrayStrippedJungleCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedJungleDarkCampfireBlockEntity>> GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_jungle_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedJungleDarkCampfireBlockEntity>of(GrayStrippedJungleDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenJungleCampfireBlockEntity>> GREEN_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_jungle_campfire_be", () ->
                BlockEntityType.Builder.<GreenJungleCampfireBlockEntity>of(GreenJungleCampfireBlockEntity::new,
                        ModBlocks.GREEN_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenJungleDarkCampfireBlockEntity>> GREEN_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenJungleDarkCampfireBlockEntity>of(GreenJungleDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedJungleCampfireBlockEntity>> GREEN_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedJungleCampfireBlockEntity>of(GreenStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedJungleDarkCampfireBlockEntity>> GREEN_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedJungleDarkCampfireBlockEntity>of(GreenStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueJungleCampfireBlockEntity>> LIGHT_BLUE_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_jungle_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueJungleCampfireBlockEntity>of(LightBlueJungleCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueJungleDarkCampfireBlockEntity>> LIGHT_BLUE_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueJungleDarkCampfireBlockEntity>of(LightBlueJungleDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedJungleCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedJungleCampfireBlockEntity>of(LightBlueStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedJungleDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedJungleDarkCampfireBlockEntity>of(LightBlueStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayJungleCampfireBlockEntity>> LIGHT_GRAY_JUNGLE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_jungle_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayJungleCampfireBlockEntity>of(LightGrayJungleCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_JUNGLE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayJungleDarkCampfireBlockEntity>> LIGHT_GRAY_JUNGLE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_jungle_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayJungleDarkCampfireBlockEntity>of(LightGrayJungleDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_JUNGLE_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedJungleCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_JUNGLE_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_jungle_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedJungleCampfireBlockEntity>of(LightGrayStrippedJungleCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedJungleDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_jungle_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedJungleDarkCampfireBlockEntity>of(LightGrayStrippedJungleDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeJungleCampfireBlockEntity>> LIME_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_jungle_campfire_be", () ->
                BlockEntityType.Builder.<LimeJungleCampfireBlockEntity>of(LimeJungleCampfireBlockEntity::new,
                        ModBlocks.LIME_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeJungleDarkCampfireBlockEntity>> LIME_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeJungleDarkCampfireBlockEntity>of(LimeJungleDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedJungleCampfireBlockEntity>> LIME_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedJungleCampfireBlockEntity>of(LimeStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedJungleDarkCampfireBlockEntity>> LIME_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedJungleDarkCampfireBlockEntity>of(LimeStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaJungleCampfireBlockEntity>> MAGENTA_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_jungle_campfire_be", () ->
                BlockEntityType.Builder.<MagentaJungleCampfireBlockEntity>of(MagentaJungleCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaJungleDarkCampfireBlockEntity>> MAGENTA_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaJungleDarkCampfireBlockEntity>of(MagentaJungleDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedJungleCampfireBlockEntity>> MAGENTA_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedJungleCampfireBlockEntity>of(MagentaStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedJungleDarkCampfireBlockEntity>> MAGENTA_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedJungleDarkCampfireBlockEntity>of(MagentaStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeJungleCampfireBlockEntity>> ORANGE_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_jungle_campfire_be", () ->
                BlockEntityType.Builder.<OrangeJungleCampfireBlockEntity>of(OrangeJungleCampfireBlockEntity::new,
                        ModBlocks.ORANGE_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeJungleDarkCampfireBlockEntity>> ORANGE_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeJungleDarkCampfireBlockEntity>of(OrangeJungleDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedJungleCampfireBlockEntity>> ORANGE_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedJungleCampfireBlockEntity>of(OrangeStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedJungleDarkCampfireBlockEntity>> ORANGE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedJungleDarkCampfireBlockEntity>of(OrangeStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkJungleCampfireBlockEntity>> PINK_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_jungle_campfire_be", () ->
                BlockEntityType.Builder.<PinkJungleCampfireBlockEntity>of(PinkJungleCampfireBlockEntity::new,
                        ModBlocks.PINK_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkJungleDarkCampfireBlockEntity>> PINK_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkJungleDarkCampfireBlockEntity>of(PinkJungleDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedJungleCampfireBlockEntity>> PINK_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedJungleCampfireBlockEntity>of(PinkStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedJungleDarkCampfireBlockEntity>> PINK_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedJungleDarkCampfireBlockEntity>of(PinkStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleJungleCampfireBlockEntity>> PURPLE_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_jungle_campfire_be", () ->
                BlockEntityType.Builder.<PurpleJungleCampfireBlockEntity>of(PurpleJungleCampfireBlockEntity::new,
                        ModBlocks.PURPLE_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleJungleDarkCampfireBlockEntity>> PURPLE_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleJungleDarkCampfireBlockEntity>of(PurpleJungleDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedJungleCampfireBlockEntity>> PURPLE_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedJungleCampfireBlockEntity>of(PurpleStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedJungleDarkCampfireBlockEntity>> PURPLE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedJungleDarkCampfireBlockEntity>of(PurpleStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedJungleCampfireBlockEntity>> RED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_jungle_campfire_be", () ->
                BlockEntityType.Builder.<RedJungleCampfireBlockEntity>of(RedJungleCampfireBlockEntity::new,
                        ModBlocks.RED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedJungleDarkCampfireBlockEntity>> RED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedJungleDarkCampfireBlockEntity>of(RedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.RED_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedJungleCampfireBlockEntity>> RED_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedJungleCampfireBlockEntity>of(RedStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedJungleDarkCampfireBlockEntity>> RED_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedJungleDarkCampfireBlockEntity>of(RedStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteJungleCampfireBlockEntity>> WHITE_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_jungle_campfire_be", () ->
                BlockEntityType.Builder.<WhiteJungleCampfireBlockEntity>of(WhiteJungleCampfireBlockEntity::new,
                        ModBlocks.WHITE_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteJungleDarkCampfireBlockEntity>> WHITE_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteJungleDarkCampfireBlockEntity>of(WhiteJungleDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedJungleCampfireBlockEntity>> WHITE_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedJungleCampfireBlockEntity>of(WhiteStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedJungleDarkCampfireBlockEntity>> WHITE_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedJungleDarkCampfireBlockEntity>of(WhiteStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowJungleCampfireBlockEntity>> YELLOW_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_jungle_campfire_be", () ->
                BlockEntityType.Builder.<YellowJungleCampfireBlockEntity>of(YellowJungleCampfireBlockEntity::new,
                        ModBlocks.YELLOW_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowJungleDarkCampfireBlockEntity>> YELLOW_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowJungleDarkCampfireBlockEntity>of(YellowJungleDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_JUNGLE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedJungleCampfireBlockEntity>> YELLOW_STRIPPED_JUNGLE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_jungle_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedJungleCampfireBlockEntity>of(YellowStrippedJungleCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_JUNGLE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedJungleDarkCampfireBlockEntity>> YELLOW_STRIPPED_JUNGLE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_jungle_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedJungleDarkCampfireBlockEntity>of(YellowStrippedJungleDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_JUNGLE_DARK_CAMPFIRE.get()).build(null));


// ACACIA CAMPFIRE VARIANTS

    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackAcaciaCampfireBlockEntity>> BLACK_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BlackAcaciaCampfireBlockEntity>of(BlackAcaciaCampfireBlockEntity::new,
                        ModBlocks.BLACK_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackAcaciaDarkCampfireBlockEntity>> BLACK_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackAcaciaDarkCampfireBlockEntity>of(BlackAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedAcaciaCampfireBlockEntity>> BLACK_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedAcaciaCampfireBlockEntity>of(BlackStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedAcaciaDarkCampfireBlockEntity>> BLACK_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedAcaciaDarkCampfireBlockEntity>of(BlackStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueAcaciaCampfireBlockEntity>> BLUE_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BlueAcaciaCampfireBlockEntity>of(BlueAcaciaCampfireBlockEntity::new,
                        ModBlocks.BLUE_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueAcaciaDarkCampfireBlockEntity>> BLUE_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueAcaciaDarkCampfireBlockEntity>of(BlueAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedAcaciaCampfireBlockEntity>> BLUE_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedAcaciaCampfireBlockEntity>of(BlueStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedAcaciaDarkCampfireBlockEntity>> BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedAcaciaDarkCampfireBlockEntity>of(BlueStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownAcaciaCampfireBlockEntity>> BROWN_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BrownAcaciaCampfireBlockEntity>of(BrownAcaciaCampfireBlockEntity::new,
                        ModBlocks.BROWN_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownAcaciaDarkCampfireBlockEntity>> BROWN_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownAcaciaDarkCampfireBlockEntity>of(BrownAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedAcaciaCampfireBlockEntity>> BROWN_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedAcaciaCampfireBlockEntity>of(BrownStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedAcaciaDarkCampfireBlockEntity>> BROWN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedAcaciaDarkCampfireBlockEntity>of(BrownStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanAcaciaCampfireBlockEntity>> CYAN_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_acacia_campfire_be", () ->
                BlockEntityType.Builder.<CyanAcaciaCampfireBlockEntity>of(CyanAcaciaCampfireBlockEntity::new,
                        ModBlocks.CYAN_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanAcaciaDarkCampfireBlockEntity>> CYAN_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanAcaciaDarkCampfireBlockEntity>of(CyanAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedAcaciaCampfireBlockEntity>> CYAN_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedAcaciaCampfireBlockEntity>of(CyanStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedAcaciaDarkCampfireBlockEntity>> CYAN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedAcaciaDarkCampfireBlockEntity>of(CyanStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayAcaciaCampfireBlockEntity>> GRAY_ACACIA_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_acacia_campfire_be", () ->
                        BlockEntityType.Builder.<GrayAcaciaCampfireBlockEntity>of(GrayAcaciaCampfireBlockEntity::new,
                                ModBlocks.GRAY_ACACIA_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayAcaciaDarkCampfireBlockEntity>> GRAY_ACACIA_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_acacia_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayAcaciaDarkCampfireBlockEntity>of(GrayAcaciaDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_ACACIA_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedAcaciaCampfireBlockEntity>> GRAY_STRIPPED_ACACIA_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_acacia_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedAcaciaCampfireBlockEntity>of(GrayStrippedAcaciaCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedAcaciaDarkCampfireBlockEntity>> GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_acacia_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedAcaciaDarkCampfireBlockEntity>of(GrayStrippedAcaciaDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenAcaciaCampfireBlockEntity>> GREEN_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_acacia_campfire_be", () ->
                BlockEntityType.Builder.<GreenAcaciaCampfireBlockEntity>of(GreenAcaciaCampfireBlockEntity::new,
                        ModBlocks.GREEN_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenAcaciaDarkCampfireBlockEntity>> GREEN_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenAcaciaDarkCampfireBlockEntity>of(GreenAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedAcaciaCampfireBlockEntity>> GREEN_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedAcaciaCampfireBlockEntity>of(GreenStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedAcaciaDarkCampfireBlockEntity>> GREEN_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedAcaciaDarkCampfireBlockEntity>of(GreenStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueAcaciaCampfireBlockEntity>> LIGHT_BLUE_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_acacia_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueAcaciaCampfireBlockEntity>of(LightBlueAcaciaCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueAcaciaDarkCampfireBlockEntity>> LIGHT_BLUE_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueAcaciaDarkCampfireBlockEntity>of(LightBlueAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedAcaciaCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedAcaciaCampfireBlockEntity>of(LightBlueStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedAcaciaDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedAcaciaDarkCampfireBlockEntity>of(LightBlueStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayAcaciaCampfireBlockEntity>> LIGHT_GRAY_ACACIA_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_acacia_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayAcaciaCampfireBlockEntity>of(LightGrayAcaciaCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_ACACIA_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayAcaciaDarkCampfireBlockEntity>> LIGHT_GRAY_ACACIA_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_acacia_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayAcaciaDarkCampfireBlockEntity>of(LightGrayAcaciaDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_ACACIA_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedAcaciaCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_ACACIA_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_acacia_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedAcaciaCampfireBlockEntity>of(LightGrayStrippedAcaciaCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedAcaciaDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_acacia_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedAcaciaDarkCampfireBlockEntity>of(LightGrayStrippedAcaciaDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeAcaciaCampfireBlockEntity>> LIME_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_acacia_campfire_be", () ->
                BlockEntityType.Builder.<LimeAcaciaCampfireBlockEntity>of(LimeAcaciaCampfireBlockEntity::new,
                        ModBlocks.LIME_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeAcaciaDarkCampfireBlockEntity>> LIME_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeAcaciaDarkCampfireBlockEntity>of(LimeAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedAcaciaCampfireBlockEntity>> LIME_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedAcaciaCampfireBlockEntity>of(LimeStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedAcaciaDarkCampfireBlockEntity>> LIME_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedAcaciaDarkCampfireBlockEntity>of(LimeStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaAcaciaCampfireBlockEntity>> MAGENTA_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_acacia_campfire_be", () ->
                BlockEntityType.Builder.<MagentaAcaciaCampfireBlockEntity>of(MagentaAcaciaCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaAcaciaDarkCampfireBlockEntity>> MAGENTA_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaAcaciaDarkCampfireBlockEntity>of(MagentaAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedAcaciaCampfireBlockEntity>> MAGENTA_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedAcaciaCampfireBlockEntity>of(MagentaStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedAcaciaDarkCampfireBlockEntity>> MAGENTA_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedAcaciaDarkCampfireBlockEntity>of(MagentaStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeAcaciaCampfireBlockEntity>> ORANGE_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_acacia_campfire_be", () ->
                BlockEntityType.Builder.<OrangeAcaciaCampfireBlockEntity>of(OrangeAcaciaCampfireBlockEntity::new,
                        ModBlocks.ORANGE_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeAcaciaDarkCampfireBlockEntity>> ORANGE_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeAcaciaDarkCampfireBlockEntity>of(OrangeAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedAcaciaCampfireBlockEntity>> ORANGE_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedAcaciaCampfireBlockEntity>of(OrangeStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedAcaciaDarkCampfireBlockEntity>> ORANGE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedAcaciaDarkCampfireBlockEntity>of(OrangeStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkAcaciaCampfireBlockEntity>> PINK_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_acacia_campfire_be", () ->
                BlockEntityType.Builder.<PinkAcaciaCampfireBlockEntity>of(PinkAcaciaCampfireBlockEntity::new,
                        ModBlocks.PINK_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkAcaciaDarkCampfireBlockEntity>> PINK_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkAcaciaDarkCampfireBlockEntity>of(PinkAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedAcaciaCampfireBlockEntity>> PINK_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedAcaciaCampfireBlockEntity>of(PinkStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedAcaciaDarkCampfireBlockEntity>> PINK_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedAcaciaDarkCampfireBlockEntity>of(PinkStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleAcaciaCampfireBlockEntity>> PURPLE_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_acacia_campfire_be", () ->
                BlockEntityType.Builder.<PurpleAcaciaCampfireBlockEntity>of(PurpleAcaciaCampfireBlockEntity::new,
                        ModBlocks.PURPLE_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleAcaciaDarkCampfireBlockEntity>> PURPLE_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleAcaciaDarkCampfireBlockEntity>of(PurpleAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedAcaciaCampfireBlockEntity>> PURPLE_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedAcaciaCampfireBlockEntity>of(PurpleStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedAcaciaDarkCampfireBlockEntity>> PURPLE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedAcaciaDarkCampfireBlockEntity>of(PurpleStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedAcaciaCampfireBlockEntity>> RED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_acacia_campfire_be", () ->
                BlockEntityType.Builder.<RedAcaciaCampfireBlockEntity>of(RedAcaciaCampfireBlockEntity::new,
                        ModBlocks.RED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedAcaciaDarkCampfireBlockEntity>> RED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedAcaciaDarkCampfireBlockEntity>of(RedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.RED_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedAcaciaCampfireBlockEntity>> RED_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedAcaciaCampfireBlockEntity>of(RedStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedAcaciaDarkCampfireBlockEntity>> RED_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedAcaciaDarkCampfireBlockEntity>of(RedStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteAcaciaCampfireBlockEntity>> WHITE_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_acacia_campfire_be", () ->
                BlockEntityType.Builder.<WhiteAcaciaCampfireBlockEntity>of(WhiteAcaciaCampfireBlockEntity::new,
                        ModBlocks.WHITE_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteAcaciaDarkCampfireBlockEntity>> WHITE_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteAcaciaDarkCampfireBlockEntity>of(WhiteAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedAcaciaCampfireBlockEntity>> WHITE_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedAcaciaCampfireBlockEntity>of(WhiteStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedAcaciaDarkCampfireBlockEntity>> WHITE_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedAcaciaDarkCampfireBlockEntity>of(WhiteStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowAcaciaCampfireBlockEntity>> YELLOW_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_acacia_campfire_be", () ->
                BlockEntityType.Builder.<YellowAcaciaCampfireBlockEntity>of(YellowAcaciaCampfireBlockEntity::new,
                        ModBlocks.YELLOW_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowAcaciaDarkCampfireBlockEntity>> YELLOW_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowAcaciaDarkCampfireBlockEntity>of(YellowAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_ACACIA_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedAcaciaCampfireBlockEntity>> YELLOW_STRIPPED_ACACIA_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_acacia_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedAcaciaCampfireBlockEntity>of(YellowStrippedAcaciaCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_ACACIA_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedAcaciaDarkCampfireBlockEntity>> YELLOW_STRIPPED_ACACIA_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_acacia_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedAcaciaDarkCampfireBlockEntity>of(YellowStrippedAcaciaDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_ACACIA_DARK_CAMPFIRE.get()).build(null));

// DARK OAK CAMPFIRE VARIANTS
// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackDarkOakCampfireBlockEntity>> BLACK_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlackDarkOakCampfireBlockEntity>of(BlackDarkOakCampfireBlockEntity::new,
                        ModBlocks.BLACK_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackDarkOakDarkCampfireBlockEntity>> BLACK_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackDarkOakDarkCampfireBlockEntity>of(BlackDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedDarkOakCampfireBlockEntity>> BLACK_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedDarkOakCampfireBlockEntity>of(BlackStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedDarkOakDarkCampfireBlockEntity>> BLACK_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedDarkOakDarkCampfireBlockEntity>of(BlackStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueDarkOakCampfireBlockEntity>> BLUE_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlueDarkOakCampfireBlockEntity>of(BlueDarkOakCampfireBlockEntity::new,
                        ModBlocks.BLUE_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueDarkOakDarkCampfireBlockEntity>> BLUE_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueDarkOakDarkCampfireBlockEntity>of(BlueDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedDarkOakCampfireBlockEntity>> BLUE_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedDarkOakCampfireBlockEntity>of(BlueStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedDarkOakDarkCampfireBlockEntity>> BLUE_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedDarkOakDarkCampfireBlockEntity>of(BlueStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownDarkOakCampfireBlockEntity>> BROWN_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BrownDarkOakCampfireBlockEntity>of(BrownDarkOakCampfireBlockEntity::new,
                        ModBlocks.BROWN_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownDarkOakDarkCampfireBlockEntity>> BROWN_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownDarkOakDarkCampfireBlockEntity>of(BrownDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedDarkOakCampfireBlockEntity>> BROWN_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedDarkOakCampfireBlockEntity>of(BrownStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedDarkOakDarkCampfireBlockEntity>> BROWN_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedDarkOakDarkCampfireBlockEntity>of(BrownStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanDarkOakCampfireBlockEntity>> CYAN_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<CyanDarkOakCampfireBlockEntity>of(CyanDarkOakCampfireBlockEntity::new,
                        ModBlocks.CYAN_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanDarkOakDarkCampfireBlockEntity>> CYAN_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanDarkOakDarkCampfireBlockEntity>of(CyanDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedDarkOakCampfireBlockEntity>> CYAN_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedDarkOakCampfireBlockEntity>of(CyanStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedDarkOakDarkCampfireBlockEntity>> CYAN_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedDarkOakDarkCampfireBlockEntity>of(CyanStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayDarkOakCampfireBlockEntity>> GRAY_DARK_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_dark_oak_campfire_be", () ->
                        BlockEntityType.Builder.<GrayDarkOakCampfireBlockEntity>of(GrayDarkOakCampfireBlockEntity::new,
                                ModBlocks.GRAY_DARK_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayDarkOakDarkCampfireBlockEntity>> GRAY_DARK_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_dark_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayDarkOakDarkCampfireBlockEntity>of(GrayDarkOakDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedDarkOakCampfireBlockEntity>> GRAY_STRIPPED_DARK_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_dark_oak_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedDarkOakCampfireBlockEntity>of(GrayStrippedDarkOakCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedDarkOakDarkCampfireBlockEntity>> GRAY_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_dark_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedDarkOakDarkCampfireBlockEntity>of(GrayStrippedDarkOakDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenDarkOakCampfireBlockEntity>> GREEN_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<GreenDarkOakCampfireBlockEntity>of(GreenDarkOakCampfireBlockEntity::new,
                        ModBlocks.GREEN_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenDarkOakDarkCampfireBlockEntity>> GREEN_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenDarkOakDarkCampfireBlockEntity>of(GreenDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedDarkOakCampfireBlockEntity>> GREEN_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedDarkOakCampfireBlockEntity>of(GreenStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedDarkOakDarkCampfireBlockEntity>> GREEN_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedDarkOakDarkCampfireBlockEntity>of(GreenStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueDarkOakCampfireBlockEntity>> LIGHT_BLUE_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueDarkOakCampfireBlockEntity>of(LightBlueDarkOakCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueDarkOakDarkCampfireBlockEntity>> LIGHT_BLUE_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueDarkOakDarkCampfireBlockEntity>of(LightBlueDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedDarkOakCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedDarkOakCampfireBlockEntity>of(LightBlueStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedDarkOakDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedDarkOakDarkCampfireBlockEntity>of(LightBlueStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayDarkOakCampfireBlockEntity>> LIGHT_GRAY_DARK_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_dark_oak_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayDarkOakCampfireBlockEntity>of(LightGrayDarkOakCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_DARK_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayDarkOakDarkCampfireBlockEntity>> LIGHT_GRAY_DARK_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_dark_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayDarkOakDarkCampfireBlockEntity>of(LightGrayDarkOakDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedDarkOakCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_DARK_OAK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_dark_oak_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedDarkOakCampfireBlockEntity>of(LightGrayStrippedDarkOakCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedDarkOakDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_dark_oak_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedDarkOakDarkCampfireBlockEntity>of(LightGrayStrippedDarkOakDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeDarkOakCampfireBlockEntity>> LIME_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<LimeDarkOakCampfireBlockEntity>of(LimeDarkOakCampfireBlockEntity::new,
                        ModBlocks.LIME_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeDarkOakDarkCampfireBlockEntity>> LIME_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeDarkOakDarkCampfireBlockEntity>of(LimeDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedDarkOakCampfireBlockEntity>> LIME_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedDarkOakCampfireBlockEntity>of(LimeStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedDarkOakDarkCampfireBlockEntity>> LIME_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedDarkOakDarkCampfireBlockEntity>of(LimeStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaDarkOakCampfireBlockEntity>> MAGENTA_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<MagentaDarkOakCampfireBlockEntity>of(MagentaDarkOakCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaDarkOakDarkCampfireBlockEntity>> MAGENTA_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaDarkOakDarkCampfireBlockEntity>of(MagentaDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedDarkOakCampfireBlockEntity>> MAGENTA_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedDarkOakCampfireBlockEntity>of(MagentaStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedDarkOakDarkCampfireBlockEntity>> MAGENTA_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedDarkOakDarkCampfireBlockEntity>of(MagentaStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeDarkOakCampfireBlockEntity>> ORANGE_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<OrangeDarkOakCampfireBlockEntity>of(OrangeDarkOakCampfireBlockEntity::new,
                        ModBlocks.ORANGE_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeDarkOakDarkCampfireBlockEntity>> ORANGE_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeDarkOakDarkCampfireBlockEntity>of(OrangeDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedDarkOakCampfireBlockEntity>> ORANGE_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedDarkOakCampfireBlockEntity>of(OrangeStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedDarkOakDarkCampfireBlockEntity>> ORANGE_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedDarkOakDarkCampfireBlockEntity>of(OrangeStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkDarkOakCampfireBlockEntity>> PINK_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<PinkDarkOakCampfireBlockEntity>of(PinkDarkOakCampfireBlockEntity::new,
                        ModBlocks.PINK_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkDarkOakDarkCampfireBlockEntity>> PINK_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkDarkOakDarkCampfireBlockEntity>of(PinkDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedDarkOakCampfireBlockEntity>> PINK_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedDarkOakCampfireBlockEntity>of(PinkStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedDarkOakDarkCampfireBlockEntity>> PINK_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedDarkOakDarkCampfireBlockEntity>of(PinkStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleDarkOakCampfireBlockEntity>> PURPLE_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<PurpleDarkOakCampfireBlockEntity>of(PurpleDarkOakCampfireBlockEntity::new,
                        ModBlocks.PURPLE_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleDarkOakDarkCampfireBlockEntity>> PURPLE_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleDarkOakDarkCampfireBlockEntity>of(PurpleDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedDarkOakCampfireBlockEntity>> PURPLE_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedDarkOakCampfireBlockEntity>of(PurpleStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedDarkOakDarkCampfireBlockEntity>> PURPLE_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedDarkOakDarkCampfireBlockEntity>of(PurpleStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedDarkOakCampfireBlockEntity>> RED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<RedDarkOakCampfireBlockEntity>of(RedDarkOakCampfireBlockEntity::new,
                        ModBlocks.RED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedDarkOakDarkCampfireBlockEntity>> RED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedDarkOakDarkCampfireBlockEntity>of(RedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.RED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedDarkOakCampfireBlockEntity>> RED_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedDarkOakCampfireBlockEntity>of(RedStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedDarkOakDarkCampfireBlockEntity>> RED_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedDarkOakDarkCampfireBlockEntity>of(RedStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteDarkOakCampfireBlockEntity>> WHITE_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<WhiteDarkOakCampfireBlockEntity>of(WhiteDarkOakCampfireBlockEntity::new,
                        ModBlocks.WHITE_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteDarkOakDarkCampfireBlockEntity>> WHITE_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteDarkOakDarkCampfireBlockEntity>of(WhiteDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedDarkOakCampfireBlockEntity>> WHITE_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedDarkOakCampfireBlockEntity>of(WhiteStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedDarkOakDarkCampfireBlockEntity>> WHITE_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedDarkOakDarkCampfireBlockEntity>of(WhiteStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowDarkOakCampfireBlockEntity>> YELLOW_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<YellowDarkOakCampfireBlockEntity>of(YellowDarkOakCampfireBlockEntity::new,
                        ModBlocks.YELLOW_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowDarkOakDarkCampfireBlockEntity>> YELLOW_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowDarkOakDarkCampfireBlockEntity>of(YellowDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedDarkOakCampfireBlockEntity>> YELLOW_STRIPPED_DARK_OAK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_dark_oak_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedDarkOakCampfireBlockEntity>of(YellowStrippedDarkOakCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_DARK_OAK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedDarkOakDarkCampfireBlockEntity>> YELLOW_STRIPPED_DARK_OAK_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_dark_oak_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedDarkOakDarkCampfireBlockEntity>of(YellowStrippedDarkOakDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_DARK_OAK_DARK_CAMPFIRE.get()).build(null));
// WARPED STEM CAMPFIRE VARIANTS



// CHERRY CAMPFIRE VARIANTS
// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackCherryCampfireBlockEntity>> BLACK_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BlackCherryCampfireBlockEntity>of(BlackCherryCampfireBlockEntity::new,
                        ModBlocks.BLACK_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackCherryDarkCampfireBlockEntity>> BLACK_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackCherryDarkCampfireBlockEntity>of(BlackCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedCherryCampfireBlockEntity>> BLACK_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedCherryCampfireBlockEntity>of(BlackStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedCherryDarkCampfireBlockEntity>> BLACK_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedCherryDarkCampfireBlockEntity>of(BlackStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueCherryCampfireBlockEntity>> BLUE_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BlueCherryCampfireBlockEntity>of(BlueCherryCampfireBlockEntity::new,
                        ModBlocks.BLUE_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueCherryDarkCampfireBlockEntity>> BLUE_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueCherryDarkCampfireBlockEntity>of(BlueCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedCherryCampfireBlockEntity>> BLUE_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedCherryCampfireBlockEntity>of(BlueStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedCherryDarkCampfireBlockEntity>> BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedCherryDarkCampfireBlockEntity>of(BlueStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownCherryCampfireBlockEntity>> BROWN_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BrownCherryCampfireBlockEntity>of(BrownCherryCampfireBlockEntity::new,
                        ModBlocks.BROWN_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownCherryDarkCampfireBlockEntity>> BROWN_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownCherryDarkCampfireBlockEntity>of(BrownCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedCherryCampfireBlockEntity>> BROWN_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedCherryCampfireBlockEntity>of(BrownStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedCherryDarkCampfireBlockEntity>> BROWN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedCherryDarkCampfireBlockEntity>of(BrownStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanCherryCampfireBlockEntity>> CYAN_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_cherry_campfire_be", () ->
                BlockEntityType.Builder.<CyanCherryCampfireBlockEntity>of(CyanCherryCampfireBlockEntity::new,
                        ModBlocks.CYAN_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanCherryDarkCampfireBlockEntity>> CYAN_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanCherryDarkCampfireBlockEntity>of(CyanCherryDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedCherryCampfireBlockEntity>> CYAN_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedCherryCampfireBlockEntity>of(CyanStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedCherryDarkCampfireBlockEntity>> CYAN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedCherryDarkCampfireBlockEntity>of(CyanStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayCherryCampfireBlockEntity>> GRAY_CHERRY_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_cherry_campfire_be", () ->
                        BlockEntityType.Builder.<GrayCherryCampfireBlockEntity>of(GrayCherryCampfireBlockEntity::new,
                                ModBlocks.GRAY_CHERRY_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayCherryDarkCampfireBlockEntity>> GRAY_CHERRY_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_cherry_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayCherryDarkCampfireBlockEntity>of(GrayCherryDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_CHERRY_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedCherryCampfireBlockEntity>> GRAY_STRIPPED_CHERRY_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_cherry_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedCherryCampfireBlockEntity>of(GrayStrippedCherryCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedCherryDarkCampfireBlockEntity>> GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_cherry_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedCherryDarkCampfireBlockEntity>of(GrayStrippedCherryDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenCherryCampfireBlockEntity>> GREEN_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_cherry_campfire_be", () ->
                BlockEntityType.Builder.<GreenCherryCampfireBlockEntity>of(GreenCherryCampfireBlockEntity::new,
                        ModBlocks.GREEN_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenCherryDarkCampfireBlockEntity>> GREEN_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenCherryDarkCampfireBlockEntity>of(GreenCherryDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedCherryCampfireBlockEntity>> GREEN_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedCherryCampfireBlockEntity>of(GreenStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedCherryDarkCampfireBlockEntity>> GREEN_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedCherryDarkCampfireBlockEntity>of(GreenStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueCherryCampfireBlockEntity>> LIGHT_BLUE_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_cherry_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueCherryCampfireBlockEntity>of(LightBlueCherryCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueCherryDarkCampfireBlockEntity>> LIGHT_BLUE_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueCherryDarkCampfireBlockEntity>of(LightBlueCherryDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedCherryCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedCherryCampfireBlockEntity>of(LightBlueStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedCherryDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedCherryDarkCampfireBlockEntity>of(LightBlueStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayCherryCampfireBlockEntity>> LIGHT_GRAY_CHERRY_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_cherry_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayCherryCampfireBlockEntity>of(LightGrayCherryCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_CHERRY_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayCherryDarkCampfireBlockEntity>> LIGHT_GRAY_CHERRY_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_cherry_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayCherryDarkCampfireBlockEntity>of(LightGrayCherryDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_CHERRY_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedCherryCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_CHERRY_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_cherry_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedCherryCampfireBlockEntity>of(LightGrayStrippedCherryCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedCherryDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_cherry_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedCherryDarkCampfireBlockEntity>of(LightGrayStrippedCherryDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeCherryCampfireBlockEntity>> LIME_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_cherry_campfire_be", () ->
                BlockEntityType.Builder.<LimeCherryCampfireBlockEntity>of(LimeCherryCampfireBlockEntity::new,
                        ModBlocks.LIME_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeCherryDarkCampfireBlockEntity>> LIME_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeCherryDarkCampfireBlockEntity>of(LimeCherryDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedCherryCampfireBlockEntity>> LIME_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedCherryCampfireBlockEntity>of(LimeStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedCherryDarkCampfireBlockEntity>> LIME_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedCherryDarkCampfireBlockEntity>of(LimeStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaCherryCampfireBlockEntity>> MAGENTA_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_cherry_campfire_be", () ->
                BlockEntityType.Builder.<MagentaCherryCampfireBlockEntity>of(MagentaCherryCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaCherryDarkCampfireBlockEntity>> MAGENTA_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaCherryDarkCampfireBlockEntity>of(MagentaCherryDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedCherryCampfireBlockEntity>> MAGENTA_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedCherryCampfireBlockEntity>of(MagentaStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedCherryDarkCampfireBlockEntity>> MAGENTA_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedCherryDarkCampfireBlockEntity>of(MagentaStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeCherryCampfireBlockEntity>> ORANGE_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_cherry_campfire_be", () ->
                BlockEntityType.Builder.<OrangeCherryCampfireBlockEntity>of(OrangeCherryCampfireBlockEntity::new,
                        ModBlocks.ORANGE_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeCherryDarkCampfireBlockEntity>> ORANGE_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeCherryDarkCampfireBlockEntity>of(OrangeCherryDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedCherryCampfireBlockEntity>> ORANGE_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedCherryCampfireBlockEntity>of(OrangeStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedCherryDarkCampfireBlockEntity>> ORANGE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedCherryDarkCampfireBlockEntity>of(OrangeStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkCherryCampfireBlockEntity>> PINK_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_cherry_campfire_be", () ->
                BlockEntityType.Builder.<PinkCherryCampfireBlockEntity>of(PinkCherryCampfireBlockEntity::new,
                        ModBlocks.PINK_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkCherryDarkCampfireBlockEntity>> PINK_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkCherryDarkCampfireBlockEntity>of(PinkCherryDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedCherryCampfireBlockEntity>> PINK_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedCherryCampfireBlockEntity>of(PinkStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedCherryDarkCampfireBlockEntity>> PINK_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedCherryDarkCampfireBlockEntity>of(PinkStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleCherryCampfireBlockEntity>> PURPLE_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_cherry_campfire_be", () ->
                BlockEntityType.Builder.<PurpleCherryCampfireBlockEntity>of(PurpleCherryCampfireBlockEntity::new,
                        ModBlocks.PURPLE_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleCherryDarkCampfireBlockEntity>> PURPLE_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleCherryDarkCampfireBlockEntity>of(PurpleCherryDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedCherryCampfireBlockEntity>> PURPLE_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedCherryCampfireBlockEntity>of(PurpleStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedCherryDarkCampfireBlockEntity>> PURPLE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedCherryDarkCampfireBlockEntity>of(PurpleStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedCherryCampfireBlockEntity>> RED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_cherry_campfire_be", () ->
                BlockEntityType.Builder.<RedCherryCampfireBlockEntity>of(RedCherryCampfireBlockEntity::new,
                        ModBlocks.RED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedCherryDarkCampfireBlockEntity>> RED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedCherryDarkCampfireBlockEntity>of(RedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.RED_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedCherryCampfireBlockEntity>> RED_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedCherryCampfireBlockEntity>of(RedStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedCherryDarkCampfireBlockEntity>> RED_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedCherryDarkCampfireBlockEntity>of(RedStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteCherryCampfireBlockEntity>> WHITE_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_cherry_campfire_be", () ->
                BlockEntityType.Builder.<WhiteCherryCampfireBlockEntity>of(WhiteCherryCampfireBlockEntity::new,
                        ModBlocks.WHITE_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteCherryDarkCampfireBlockEntity>> WHITE_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteCherryDarkCampfireBlockEntity>of(WhiteCherryDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedCherryCampfireBlockEntity>> WHITE_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedCherryCampfireBlockEntity>of(WhiteStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedCherryDarkCampfireBlockEntity>> WHITE_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedCherryDarkCampfireBlockEntity>of(WhiteStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowCherryCampfireBlockEntity>> YELLOW_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_cherry_campfire_be", () ->
                BlockEntityType.Builder.<YellowCherryCampfireBlockEntity>of(YellowCherryCampfireBlockEntity::new,
                        ModBlocks.YELLOW_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowCherryDarkCampfireBlockEntity>> YELLOW_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowCherryDarkCampfireBlockEntity>of(YellowCherryDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_CHERRY_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedCherryCampfireBlockEntity>> YELLOW_STRIPPED_CHERRY_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_cherry_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedCherryCampfireBlockEntity>of(YellowStrippedCherryCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_CHERRY_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedCherryDarkCampfireBlockEntity>> YELLOW_STRIPPED_CHERRY_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_cherry_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedCherryDarkCampfireBlockEntity>of(YellowStrippedCherryDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_CHERRY_DARK_CAMPFIRE.get()).build(null));

// CRIMSON CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackCrimsonStemCampfireBlockEntity>> BLACK_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlackCrimsonStemCampfireBlockEntity>of(BlackCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BLACK_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackCrimsonStemDarkCampfireBlockEntity>> BLACK_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackCrimsonStemDarkCampfireBlockEntity>of(BlackCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedCrimsonStemCampfireBlockEntity>> BLACK_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedCrimsonStemCampfireBlockEntity>of(BlackStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedCrimsonStemDarkCampfireBlockEntity>> BLACK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedCrimsonStemDarkCampfireBlockEntity>of(BlackStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueCrimsonStemCampfireBlockEntity>> BLUE_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlueCrimsonStemCampfireBlockEntity>of(BlueCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BLUE_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueCrimsonStemDarkCampfireBlockEntity>> BLUE_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueCrimsonStemDarkCampfireBlockEntity>of(BlueCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedCrimsonStemCampfireBlockEntity>> BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedCrimsonStemCampfireBlockEntity>of(BlueStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedCrimsonStemDarkCampfireBlockEntity>> BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedCrimsonStemDarkCampfireBlockEntity>of(BlueStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownCrimsonStemCampfireBlockEntity>> BROWN_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BrownCrimsonStemCampfireBlockEntity>of(BrownCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BROWN_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownCrimsonStemDarkCampfireBlockEntity>> BROWN_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownCrimsonStemDarkCampfireBlockEntity>of(BrownCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedCrimsonStemCampfireBlockEntity>> BROWN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedCrimsonStemCampfireBlockEntity>of(BrownStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedCrimsonStemDarkCampfireBlockEntity>> BROWN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedCrimsonStemDarkCampfireBlockEntity>of(BrownStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanCrimsonStemCampfireBlockEntity>> CYAN_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<CyanCrimsonStemCampfireBlockEntity>of(CyanCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.CYAN_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanCrimsonStemDarkCampfireBlockEntity>> CYAN_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanCrimsonStemDarkCampfireBlockEntity>of(CyanCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedCrimsonStemCampfireBlockEntity>> CYAN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedCrimsonStemCampfireBlockEntity>of(CyanStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedCrimsonStemDarkCampfireBlockEntity>> CYAN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedCrimsonStemDarkCampfireBlockEntity>of(CyanStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayCrimsonStemCampfireBlockEntity>> GRAY_CRIMSON_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_crimson_stem_campfire_be", () ->
                        BlockEntityType.Builder.<GrayCrimsonStemCampfireBlockEntity>of(GrayCrimsonStemCampfireBlockEntity::new,
                                ModBlocks.GRAY_CRIMSON_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayCrimsonStemDarkCampfireBlockEntity>> GRAY_CRIMSON_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_crimson_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayCrimsonStemDarkCampfireBlockEntity>of(GrayCrimsonStemDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedCrimsonStemCampfireBlockEntity>> GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_crimson_stem_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedCrimsonStemCampfireBlockEntity>of(GrayStrippedCrimsonStemCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedCrimsonStemDarkCampfireBlockEntity>> GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_crimson_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedCrimsonStemDarkCampfireBlockEntity>of(GrayStrippedCrimsonStemDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenCrimsonStemCampfireBlockEntity>> GREEN_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<GreenCrimsonStemCampfireBlockEntity>of(GreenCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.GREEN_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenCrimsonStemDarkCampfireBlockEntity>> GREEN_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenCrimsonStemDarkCampfireBlockEntity>of(GreenCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedCrimsonStemCampfireBlockEntity>> GREEN_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedCrimsonStemCampfireBlockEntity>of(GreenStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedCrimsonStemDarkCampfireBlockEntity>> GREEN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedCrimsonStemDarkCampfireBlockEntity>of(GreenStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueCrimsonStemCampfireBlockEntity>> LIGHT_BLUE_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueCrimsonStemCampfireBlockEntity>of(LightBlueCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueCrimsonStemDarkCampfireBlockEntity>> LIGHT_BLUE_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueCrimsonStemDarkCampfireBlockEntity>of(LightBlueCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedCrimsonStemCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedCrimsonStemCampfireBlockEntity>of(LightBlueStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedCrimsonStemDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedCrimsonStemDarkCampfireBlockEntity>of(LightBlueStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayCrimsonStemCampfireBlockEntity>> LIGHT_GRAY_CRIMSON_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_crimson_stem_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayCrimsonStemCampfireBlockEntity>of(LightGrayCrimsonStemCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_CRIMSON_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayCrimsonStemDarkCampfireBlockEntity>> LIGHT_GRAY_CRIMSON_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_crimson_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayCrimsonStemDarkCampfireBlockEntity>of(LightGrayCrimsonStemDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedCrimsonStemCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_crimson_stem_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedCrimsonStemCampfireBlockEntity>of(LightGrayStrippedCrimsonStemCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedCrimsonStemDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_crimson_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedCrimsonStemDarkCampfireBlockEntity>of(LightGrayStrippedCrimsonStemDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeCrimsonStemCampfireBlockEntity>> LIME_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<LimeCrimsonStemCampfireBlockEntity>of(LimeCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.LIME_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeCrimsonStemDarkCampfireBlockEntity>> LIME_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeCrimsonStemDarkCampfireBlockEntity>of(LimeCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedCrimsonStemCampfireBlockEntity>> LIME_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedCrimsonStemCampfireBlockEntity>of(LimeStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedCrimsonStemDarkCampfireBlockEntity>> LIME_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedCrimsonStemDarkCampfireBlockEntity>of(LimeStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaCrimsonStemCampfireBlockEntity>> MAGENTA_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<MagentaCrimsonStemCampfireBlockEntity>of(MagentaCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaCrimsonStemDarkCampfireBlockEntity>> MAGENTA_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaCrimsonStemDarkCampfireBlockEntity>of(MagentaCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedCrimsonStemCampfireBlockEntity>> MAGENTA_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedCrimsonStemCampfireBlockEntity>of(MagentaStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedCrimsonStemDarkCampfireBlockEntity>> MAGENTA_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedCrimsonStemDarkCampfireBlockEntity>of(MagentaStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeCrimsonStemCampfireBlockEntity>> ORANGE_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<OrangeCrimsonStemCampfireBlockEntity>of(OrangeCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.ORANGE_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeCrimsonStemDarkCampfireBlockEntity>> ORANGE_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeCrimsonStemDarkCampfireBlockEntity>of(OrangeCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedCrimsonStemCampfireBlockEntity>> ORANGE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedCrimsonStemCampfireBlockEntity>of(OrangeStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedCrimsonStemDarkCampfireBlockEntity>> ORANGE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedCrimsonStemDarkCampfireBlockEntity>of(OrangeStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkCrimsonStemCampfireBlockEntity>> PINK_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<PinkCrimsonStemCampfireBlockEntity>of(PinkCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.PINK_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkCrimsonStemDarkCampfireBlockEntity>> PINK_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkCrimsonStemDarkCampfireBlockEntity>of(PinkCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedCrimsonStemCampfireBlockEntity>> PINK_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedCrimsonStemCampfireBlockEntity>of(PinkStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedCrimsonStemDarkCampfireBlockEntity>> PINK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedCrimsonStemDarkCampfireBlockEntity>of(PinkStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleCrimsonStemCampfireBlockEntity>> PURPLE_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<PurpleCrimsonStemCampfireBlockEntity>of(PurpleCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.PURPLE_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleCrimsonStemDarkCampfireBlockEntity>> PURPLE_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleCrimsonStemDarkCampfireBlockEntity>of(PurpleCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedCrimsonStemCampfireBlockEntity>> PURPLE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedCrimsonStemCampfireBlockEntity>of(PurpleStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedCrimsonStemDarkCampfireBlockEntity>> PURPLE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedCrimsonStemDarkCampfireBlockEntity>of(PurpleStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedCrimsonStemCampfireBlockEntity>> RED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<RedCrimsonStemCampfireBlockEntity>of(RedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.RED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedCrimsonStemDarkCampfireBlockEntity>> RED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedCrimsonStemDarkCampfireBlockEntity>of(RedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.RED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedCrimsonStemCampfireBlockEntity>> RED_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedCrimsonStemCampfireBlockEntity>of(RedStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedCrimsonStemDarkCampfireBlockEntity>> RED_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedCrimsonStemDarkCampfireBlockEntity>of(RedStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteCrimsonStemCampfireBlockEntity>> WHITE_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<WhiteCrimsonStemCampfireBlockEntity>of(WhiteCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.WHITE_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteCrimsonStemDarkCampfireBlockEntity>> WHITE_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteCrimsonStemDarkCampfireBlockEntity>of(WhiteCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedCrimsonStemCampfireBlockEntity>> WHITE_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedCrimsonStemCampfireBlockEntity>of(WhiteStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedCrimsonStemDarkCampfireBlockEntity>> WHITE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedCrimsonStemDarkCampfireBlockEntity>of(WhiteStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowCrimsonStemCampfireBlockEntity>> YELLOW_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<YellowCrimsonStemCampfireBlockEntity>of(YellowCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.YELLOW_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowCrimsonStemDarkCampfireBlockEntity>> YELLOW_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowCrimsonStemDarkCampfireBlockEntity>of(YellowCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedCrimsonStemCampfireBlockEntity>> YELLOW_STRIPPED_CRIMSON_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_crimson_stem_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedCrimsonStemCampfireBlockEntity>of(YellowStrippedCrimsonStemCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_CRIMSON_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedCrimsonStemDarkCampfireBlockEntity>> YELLOW_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_crimson_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedCrimsonStemDarkCampfireBlockEntity>of(YellowStrippedCrimsonStemDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_CRIMSON_STEM_DARK_CAMPFIRE.get()).build(null));

// WARPED CAMPFIRE VARIANTS
    // === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackWarpedStemCampfireBlockEntity>> BLACK_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlackWarpedStemCampfireBlockEntity>of(BlackWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BLACK_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackWarpedStemDarkCampfireBlockEntity>> BLACK_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackWarpedStemDarkCampfireBlockEntity>of(BlackWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedWarpedStemCampfireBlockEntity>> BLACK_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedWarpedStemCampfireBlockEntity>of(BlackStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedWarpedStemDarkCampfireBlockEntity>> BLACK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedWarpedStemDarkCampfireBlockEntity>of(BlackStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueWarpedStemCampfireBlockEntity>> BLUE_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlueWarpedStemCampfireBlockEntity>of(BlueWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BLUE_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueWarpedStemDarkCampfireBlockEntity>> BLUE_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueWarpedStemDarkCampfireBlockEntity>of(BlueWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedWarpedStemCampfireBlockEntity>> BLUE_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedWarpedStemCampfireBlockEntity>of(BlueStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedWarpedStemDarkCampfireBlockEntity>> BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedWarpedStemDarkCampfireBlockEntity>of(BlueStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownWarpedStemCampfireBlockEntity>> BROWN_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BrownWarpedStemCampfireBlockEntity>of(BrownWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BROWN_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownWarpedStemDarkCampfireBlockEntity>> BROWN_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownWarpedStemDarkCampfireBlockEntity>of(BrownWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedWarpedStemCampfireBlockEntity>> BROWN_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedWarpedStemCampfireBlockEntity>of(BrownStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedWarpedStemDarkCampfireBlockEntity>> BROWN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedWarpedStemDarkCampfireBlockEntity>of(BrownStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanWarpedStemCampfireBlockEntity>> CYAN_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<CyanWarpedStemCampfireBlockEntity>of(CyanWarpedStemCampfireBlockEntity::new,
                        ModBlocks.CYAN_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanWarpedStemDarkCampfireBlockEntity>> CYAN_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanWarpedStemDarkCampfireBlockEntity>of(CyanWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedWarpedStemCampfireBlockEntity>> CYAN_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedWarpedStemCampfireBlockEntity>of(CyanStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedWarpedStemDarkCampfireBlockEntity>> CYAN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedWarpedStemDarkCampfireBlockEntity>of(CyanStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

        // === GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<GrayWarpedStemCampfireBlockEntity>> GRAY_WARPED_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_warped_stem_campfire_be", () ->
                        BlockEntityType.Builder.<GrayWarpedStemCampfireBlockEntity>of(GrayWarpedStemCampfireBlockEntity::new,
                                ModBlocks.GRAY_WARPED_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayWarpedStemDarkCampfireBlockEntity>> GRAY_WARPED_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_warped_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayWarpedStemDarkCampfireBlockEntity>of(GrayWarpedStemDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedWarpedStemCampfireBlockEntity>> GRAY_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_warped_stem_campfire_be", () ->        
                        BlockEntityType.Builder.<GrayStrippedWarpedStemCampfireBlockEntity>of(GrayStrippedWarpedStemCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<GrayStrippedWarpedStemDarkCampfireBlockEntity>> GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("gray_stripped_warped_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<GrayStrippedWarpedStemDarkCampfireBlockEntity>of(GrayStrippedWarpedStemDarkCampfireBlockEntity::new,
                                ModBlocks.GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenWarpedStemCampfireBlockEntity>> GREEN_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<GreenWarpedStemCampfireBlockEntity>of(GreenWarpedStemCampfireBlockEntity::new,
                        ModBlocks.GREEN_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenWarpedStemDarkCampfireBlockEntity>> GREEN_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenWarpedStemDarkCampfireBlockEntity>of(GreenWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedWarpedStemCampfireBlockEntity>> GREEN_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedWarpedStemCampfireBlockEntity>of(GreenStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedWarpedStemDarkCampfireBlockEntity>> GREEN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedWarpedStemDarkCampfireBlockEntity>of(GreenStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueWarpedStemCampfireBlockEntity>> LIGHT_BLUE_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueWarpedStemCampfireBlockEntity>of(LightBlueWarpedStemCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueWarpedStemDarkCampfireBlockEntity>> LIGHT_BLUE_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueWarpedStemDarkCampfireBlockEntity>of(LightBlueWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedWarpedStemCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedWarpedStemCampfireBlockEntity>of(LightBlueStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedWarpedStemDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedWarpedStemDarkCampfireBlockEntity>of(LightBlueStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
        public static final RegistryObject<BlockEntityType<LightGrayWarpedStemCampfireBlockEntity>> LIGHT_GRAY_WARPED_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_warped_stem_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayWarpedStemCampfireBlockEntity>of(LightGrayWarpedStemCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_WARPED_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayWarpedStemDarkCampfireBlockEntity>> LIGHT_GRAY_WARPED_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_warped_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayWarpedStemDarkCampfireBlockEntity>of(LightGrayWarpedStemDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedWarpedStemCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_warped_stem_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedWarpedStemCampfireBlockEntity>of(LightGrayStrippedWarpedStemCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
        public static final RegistryObject<BlockEntityType<LightGrayStrippedWarpedStemDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
                BLOCK_ENTITIES.register("light_gray_stripped_warped_stem_dark_campfire_be", () ->
                        BlockEntityType.Builder.<LightGrayStrippedWarpedStemDarkCampfireBlockEntity>of(LightGrayStrippedWarpedStemDarkCampfireBlockEntity::new,
                                ModBlocks.LIGHT_GRAY_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeWarpedStemCampfireBlockEntity>> LIME_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<LimeWarpedStemCampfireBlockEntity>of(LimeWarpedStemCampfireBlockEntity::new,
                        ModBlocks.LIME_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeWarpedStemDarkCampfireBlockEntity>> LIME_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeWarpedStemDarkCampfireBlockEntity>of(LimeWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedWarpedStemCampfireBlockEntity>> LIME_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedWarpedStemCampfireBlockEntity>of(LimeStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedWarpedStemDarkCampfireBlockEntity>> LIME_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedWarpedStemDarkCampfireBlockEntity>of(LimeStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaWarpedStemCampfireBlockEntity>> MAGENTA_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<MagentaWarpedStemCampfireBlockEntity>of(MagentaWarpedStemCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaWarpedStemDarkCampfireBlockEntity>> MAGENTA_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaWarpedStemDarkCampfireBlockEntity>of(MagentaWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedWarpedStemCampfireBlockEntity>> MAGENTA_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedWarpedStemCampfireBlockEntity>of(MagentaStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedWarpedStemDarkCampfireBlockEntity>> MAGENTA_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedWarpedStemDarkCampfireBlockEntity>of(MagentaStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeWarpedStemCampfireBlockEntity>> ORANGE_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<OrangeWarpedStemCampfireBlockEntity>of(OrangeWarpedStemCampfireBlockEntity::new,
                        ModBlocks.ORANGE_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeWarpedStemDarkCampfireBlockEntity>> ORANGE_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeWarpedStemDarkCampfireBlockEntity>of(OrangeWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedWarpedStemCampfireBlockEntity>> ORANGE_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedWarpedStemCampfireBlockEntity>of(OrangeStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedWarpedStemDarkCampfireBlockEntity>> ORANGE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedWarpedStemDarkCampfireBlockEntity>of(OrangeStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkWarpedStemCampfireBlockEntity>> PINK_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<PinkWarpedStemCampfireBlockEntity>of(PinkWarpedStemCampfireBlockEntity::new,
                        ModBlocks.PINK_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkWarpedStemDarkCampfireBlockEntity>> PINK_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkWarpedStemDarkCampfireBlockEntity>of(PinkWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedWarpedStemCampfireBlockEntity>> PINK_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedWarpedStemCampfireBlockEntity>of(PinkStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedWarpedStemDarkCampfireBlockEntity>> PINK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedWarpedStemDarkCampfireBlockEntity>of(PinkStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleWarpedStemCampfireBlockEntity>> PURPLE_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<PurpleWarpedStemCampfireBlockEntity>of(PurpleWarpedStemCampfireBlockEntity::new,
                        ModBlocks.PURPLE_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleWarpedStemDarkCampfireBlockEntity>> PURPLE_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleWarpedStemDarkCampfireBlockEntity>of(PurpleWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedWarpedStemCampfireBlockEntity>> PURPLE_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedWarpedStemCampfireBlockEntity>of(PurpleStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedWarpedStemDarkCampfireBlockEntity>> PURPLE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedWarpedStemDarkCampfireBlockEntity>of(PurpleStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedWarpedStemCampfireBlockEntity>> RED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<RedWarpedStemCampfireBlockEntity>of(RedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.RED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedWarpedStemDarkCampfireBlockEntity>> RED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedWarpedStemDarkCampfireBlockEntity>of(RedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.RED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedWarpedStemCampfireBlockEntity>> RED_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedWarpedStemCampfireBlockEntity>of(RedStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedWarpedStemDarkCampfireBlockEntity>> RED_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedWarpedStemDarkCampfireBlockEntity>of(RedStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteWarpedStemCampfireBlockEntity>> WHITE_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<WhiteWarpedStemCampfireBlockEntity>of(WhiteWarpedStemCampfireBlockEntity::new,
                        ModBlocks.WHITE_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteWarpedStemDarkCampfireBlockEntity>> WHITE_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteWarpedStemDarkCampfireBlockEntity>of(WhiteWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedWarpedStemCampfireBlockEntity>> WHITE_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedWarpedStemCampfireBlockEntity>of(WhiteStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedWarpedStemDarkCampfireBlockEntity>> WHITE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedWarpedStemDarkCampfireBlockEntity>of(WhiteStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowWarpedStemCampfireBlockEntity>> YELLOW_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<YellowWarpedStemCampfireBlockEntity>of(YellowWarpedStemCampfireBlockEntity::new,
                        ModBlocks.YELLOW_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowWarpedStemDarkCampfireBlockEntity>> YELLOW_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowWarpedStemDarkCampfireBlockEntity>of(YellowWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedWarpedStemCampfireBlockEntity>> YELLOW_STRIPPED_WARPED_STEM_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_warped_stem_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedWarpedStemCampfireBlockEntity>of(YellowStrippedWarpedStemCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_WARPED_STEM_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedWarpedStemDarkCampfireBlockEntity>> YELLOW_STRIPPED_WARPED_STEM_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_warped_stem_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedWarpedStemDarkCampfireBlockEntity>of(YellowStrippedWarpedStemDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_WARPED_STEM_DARK_CAMPFIRE.get()).build(null));

// MANGROVE CAMPFIRE VARIANTS
// === BLACK VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlackMangroveCampfireBlockEntity>> BLACK_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BlackMangroveCampfireBlockEntity>of(BlackMangroveCampfireBlockEntity::new,
                        ModBlocks.BLACK_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackMangroveDarkCampfireBlockEntity>> BLACK_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackMangroveDarkCampfireBlockEntity>of(BlackMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedMangroveCampfireBlockEntity>> BLACK_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedMangroveCampfireBlockEntity>of(BlackStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackStrippedMangroveDarkCampfireBlockEntity>> BLACK_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("black_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlackStrippedMangroveDarkCampfireBlockEntity>of(BlackStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BLACK_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<BlueMangroveCampfireBlockEntity>> BLUE_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BlueMangroveCampfireBlockEntity>of(BlueMangroveCampfireBlockEntity::new,
                        ModBlocks.BLUE_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueMangroveDarkCampfireBlockEntity>> BLUE_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueMangroveDarkCampfireBlockEntity>of(BlueMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedMangroveCampfireBlockEntity>> BLUE_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedMangroveCampfireBlockEntity>of(BlueStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueStrippedMangroveDarkCampfireBlockEntity>> BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("blue_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BlueStrippedMangroveDarkCampfireBlockEntity>of(BlueStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === BROWN VARIANTS ===
    public static final RegistryObject<BlockEntityType<BrownMangroveCampfireBlockEntity>> BROWN_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BrownMangroveCampfireBlockEntity>of(BrownMangroveCampfireBlockEntity::new,
                        ModBlocks.BROWN_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownMangroveDarkCampfireBlockEntity>> BROWN_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownMangroveDarkCampfireBlockEntity>of(BrownMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedMangroveCampfireBlockEntity>> BROWN_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedMangroveCampfireBlockEntity>of(BrownStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownStrippedMangroveDarkCampfireBlockEntity>> BROWN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("brown_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<BrownStrippedMangroveDarkCampfireBlockEntity>of(BrownStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.BROWN_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === CYAN VARIANTS ===
    public static final RegistryObject<BlockEntityType<CyanMangroveCampfireBlockEntity>> CYAN_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<CyanMangroveCampfireBlockEntity>of(CyanMangroveCampfireBlockEntity::new,
                        ModBlocks.CYAN_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanMangroveDarkCampfireBlockEntity>> CYAN_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanMangroveDarkCampfireBlockEntity>of(CyanMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedMangroveCampfireBlockEntity>> CYAN_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedMangroveCampfireBlockEntity>of(CyanStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanStrippedMangroveDarkCampfireBlockEntity>> CYAN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("cyan_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<CyanStrippedMangroveDarkCampfireBlockEntity>of(CyanStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.CYAN_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<GrayMangroveCampfireBlockEntity>> GRAY_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<GrayMangroveCampfireBlockEntity>of(GrayMangroveCampfireBlockEntity::new,
                        ModBlocks.GRAY_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayMangroveDarkCampfireBlockEntity>> GRAY_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<GrayMangroveDarkCampfireBlockEntity>of(GrayMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedMangroveCampfireBlockEntity>> GRAY_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<GrayStrippedMangroveCampfireBlockEntity>of(GrayStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayStrippedMangroveDarkCampfireBlockEntity>> GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("gray_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<GrayStrippedMangroveDarkCampfireBlockEntity>of(GrayStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === GREEN VARIANTS ===
    public static final RegistryObject<BlockEntityType<GreenMangroveCampfireBlockEntity>> GREEN_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<GreenMangroveCampfireBlockEntity>of(GreenMangroveCampfireBlockEntity::new,
                        ModBlocks.GREEN_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenMangroveDarkCampfireBlockEntity>> GREEN_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenMangroveDarkCampfireBlockEntity>of(GreenMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedMangroveCampfireBlockEntity>> GREEN_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedMangroveCampfireBlockEntity>of(GreenStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenStrippedMangroveDarkCampfireBlockEntity>> GREEN_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("green_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<GreenStrippedMangroveDarkCampfireBlockEntity>of(GreenStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.GREEN_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT BLUE VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightBlueMangroveCampfireBlockEntity>> LIGHT_BLUE_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueMangroveCampfireBlockEntity>of(LightBlueMangroveCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueMangroveDarkCampfireBlockEntity>> LIGHT_BLUE_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueMangroveDarkCampfireBlockEntity>of(LightBlueMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedMangroveCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedMangroveCampfireBlockEntity>of(LightBlueStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueStrippedMangroveDarkCampfireBlockEntity>> LIGHT_BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_blue_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightBlueStrippedMangroveDarkCampfireBlockEntity>of(LightBlueStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_BLUE_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === LIGHT GRAY VARIANTS ===
    public static final RegistryObject<BlockEntityType<LightGrayMangroveCampfireBlockEntity>> LIGHT_GRAY_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayMangroveCampfireBlockEntity>of(LightGrayMangroveCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayMangroveDarkCampfireBlockEntity>> LIGHT_GRAY_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayMangroveDarkCampfireBlockEntity>of(LightGrayMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedMangroveCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedMangroveCampfireBlockEntity>of(LightGrayStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayStrippedMangroveDarkCampfireBlockEntity>> LIGHT_GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("light_gray_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LightGrayStrippedMangroveDarkCampfireBlockEntity>of(LightGrayStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIGHT_GRAY_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === LIME VARIANTS ===
    public static final RegistryObject<BlockEntityType<LimeMangroveCampfireBlockEntity>> LIME_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LimeMangroveCampfireBlockEntity>of(LimeMangroveCampfireBlockEntity::new,
                        ModBlocks.LIME_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeMangroveDarkCampfireBlockEntity>> LIME_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeMangroveDarkCampfireBlockEntity>of(LimeMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedMangroveCampfireBlockEntity>> LIME_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedMangroveCampfireBlockEntity>of(LimeStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeStrippedMangroveDarkCampfireBlockEntity>> LIME_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("lime_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<LimeStrippedMangroveDarkCampfireBlockEntity>of(LimeStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.LIME_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === MAGENTA VARIANTS ===
    public static final RegistryObject<BlockEntityType<MagentaMangroveCampfireBlockEntity>> MAGENTA_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<MagentaMangroveCampfireBlockEntity>of(MagentaMangroveCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaMangroveDarkCampfireBlockEntity>> MAGENTA_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaMangroveDarkCampfireBlockEntity>of(MagentaMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedMangroveCampfireBlockEntity>> MAGENTA_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedMangroveCampfireBlockEntity>of(MagentaStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaStrippedMangroveDarkCampfireBlockEntity>> MAGENTA_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("magenta_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<MagentaStrippedMangroveDarkCampfireBlockEntity>of(MagentaStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.MAGENTA_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === ORANGE VARIANTS ===
    public static final RegistryObject<BlockEntityType<OrangeMangroveCampfireBlockEntity>> ORANGE_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<OrangeMangroveCampfireBlockEntity>of(OrangeMangroveCampfireBlockEntity::new,
                        ModBlocks.ORANGE_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeMangroveDarkCampfireBlockEntity>> ORANGE_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeMangroveDarkCampfireBlockEntity>of(OrangeMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedMangroveCampfireBlockEntity>> ORANGE_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedMangroveCampfireBlockEntity>of(OrangeStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeStrippedMangroveDarkCampfireBlockEntity>> ORANGE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<OrangeStrippedMangroveDarkCampfireBlockEntity>of(OrangeStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === PINK VARIANTS ===
    public static final RegistryObject<BlockEntityType<PinkMangroveCampfireBlockEntity>> PINK_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<PinkMangroveCampfireBlockEntity>of(PinkMangroveCampfireBlockEntity::new,
                        ModBlocks.PINK_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkMangroveDarkCampfireBlockEntity>> PINK_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkMangroveDarkCampfireBlockEntity>of(PinkMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedMangroveCampfireBlockEntity>> PINK_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedMangroveCampfireBlockEntity>of(PinkStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkStrippedMangroveDarkCampfireBlockEntity>> PINK_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("pink_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<PinkStrippedMangroveDarkCampfireBlockEntity>of(PinkStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.PINK_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === PURPLE VARIANTS ===
    public static final RegistryObject<BlockEntityType<PurpleMangroveCampfireBlockEntity>> PURPLE_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<PurpleMangroveCampfireBlockEntity>of(PurpleMangroveCampfireBlockEntity::new,
                        ModBlocks.PURPLE_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleMangroveDarkCampfireBlockEntity>> PURPLE_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleMangroveDarkCampfireBlockEntity>of(PurpleMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedMangroveCampfireBlockEntity>> PURPLE_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedMangroveCampfireBlockEntity>of(PurpleStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleStrippedMangroveDarkCampfireBlockEntity>> PURPLE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("purple_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<PurpleStrippedMangroveDarkCampfireBlockEntity>of(PurpleStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.PURPLE_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === RED VARIANTS ===
    public static final RegistryObject<BlockEntityType<RedMangroveCampfireBlockEntity>> RED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<RedMangroveCampfireBlockEntity>of(RedMangroveCampfireBlockEntity::new,
                        ModBlocks.RED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedMangroveDarkCampfireBlockEntity>> RED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedMangroveDarkCampfireBlockEntity>of(RedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.RED_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedMangroveCampfireBlockEntity>> RED_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedMangroveCampfireBlockEntity>of(RedStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedStrippedMangroveDarkCampfireBlockEntity>> RED_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("red_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<RedStrippedMangroveDarkCampfireBlockEntity>of(RedStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.RED_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === WHITE VARIANTS ===
    public static final RegistryObject<BlockEntityType<WhiteMangroveCampfireBlockEntity>> WHITE_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<WhiteMangroveCampfireBlockEntity>of(WhiteMangroveCampfireBlockEntity::new,
                        ModBlocks.WHITE_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteMangroveDarkCampfireBlockEntity>> WHITE_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteMangroveDarkCampfireBlockEntity>of(WhiteMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedMangroveCampfireBlockEntity>> WHITE_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedMangroveCampfireBlockEntity>of(WhiteStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteStrippedMangroveDarkCampfireBlockEntity>> WHITE_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<WhiteStrippedMangroveDarkCampfireBlockEntity>of(WhiteStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));

    // === YELLOW VARIANTS ===
    public static final RegistryObject<BlockEntityType<YellowMangroveCampfireBlockEntity>> YELLOW_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<YellowMangroveCampfireBlockEntity>of(YellowMangroveCampfireBlockEntity::new,
                        ModBlocks.YELLOW_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowMangroveDarkCampfireBlockEntity>> YELLOW_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowMangroveDarkCampfireBlockEntity>of(YellowMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_MANGROVE_DARK_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedMangroveCampfireBlockEntity>> YELLOW_STRIPPED_MANGROVE_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_mangrove_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedMangroveCampfireBlockEntity>of(YellowStrippedMangroveCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_MANGROVE_CAMPFIRE.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowStrippedMangroveDarkCampfireBlockEntity>> YELLOW_STRIPPED_MANGROVE_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("yellow_stripped_mangrove_dark_campfire_be", () ->
                BlockEntityType.Builder.<YellowStrippedMangroveDarkCampfireBlockEntity>of(YellowStrippedMangroveDarkCampfireBlockEntity::new,
                        ModBlocks.YELLOW_STRIPPED_MANGROVE_DARK_CAMPFIRE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
