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


// REMEMBER TO REGISTER CAMPFIRE BLOCK ENTITY
    public static final RegistryObject<BlockEntityType<BirchCampfireBlockEntity>> BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("birch_campfire_be", () -> {
                return BlockEntityType.Builder.of(BirchCampfireBlockEntity::new,
                        ModBlocks.BIRCH_CAMPFIRE.get()).build(null);
            });

    public static final RegistryObject<BlockEntityType<WhiteBirchCampfireBlockEntity>> WHITE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteBirchCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<WhiteBirchDarkCampfireBlockEntity>> WHITE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("white_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(WhiteBirchDarkCampfireBlockEntity::new,
                        ModBlocks.WHITE_BIRCH_DARK_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeBirchCampfireBlockEntity>> ORANGE_BIRCH_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeBirchCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_CAMPFIRE.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeBirchDarkCampfireBlockEntity>> ORANGE_BIRCH_DARK_CAMPFIRE_BE =
            BLOCK_ENTITIES.register("orange_birch_dark_campfire_be", () ->
                BlockEntityType.Builder.of(OrangeBirchDarkCampfireBlockEntity::new,
                        ModBlocks.ORANGE_BIRCH_DARK_CAMPFIRE.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
