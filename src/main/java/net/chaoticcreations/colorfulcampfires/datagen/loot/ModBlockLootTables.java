package net.chaoticcreations.colorfulcampfires.datagen.loot;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

//public class ModBlockLootTables extends BlockStateProvider {
//    public ModBlockLootTables(PackOutput output, ExistingFileHelper exFileHelper) {
//        super(output, ColorfulCampfires.MOD_ID, exFileHelper);
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//
//
//    }
//
//    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
//        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
//    }
//}

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(){
        super(Set.of(),FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //drop itself
        this.dropSelf(ModBlocks.BIRCH_CAMPFIRE.get());
//        this.dropSelf(ModBlocks.WHITE_BIRCH_CAMPFIRE.get());
//        this.dropSelf(ModBlocks.WHITE_BIRCH_CAMPFIRE_DARK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}