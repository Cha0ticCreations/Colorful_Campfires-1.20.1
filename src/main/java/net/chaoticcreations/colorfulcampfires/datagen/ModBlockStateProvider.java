package net.chaoticcreations.colorfulcampfires.datagen;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.block.ModBlocks;
import net.chaoticcreations.colorfulcampfires.block.custom.ModCampfireBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ColorfulCampfires.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleCampfireBlock(ModBlocks.BIRCH_CAMPFIRE,"birch");

        //simpleCampfireVariant(ModBlocks.BIRCH_CAMPFIRE);
    }

//    private void campfireBlockWithItem(RegistryObject<ModCampfireBlock> blockRegistryObject, String woodType){
//        simpleBlockWithItem(simpleCampfireBlock(blockRegistryObject.get(),woodType),cubeAll(blockRegistryObject.get()));
//    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }

    private BlockModelBuilder simpleCampfireBlock(RegistryObject<ModCampfireBlock> campfireBlock, String woodType){
        //noinspection removal
        return models().withExistingParent(campfireBlock.getId().getPath(),
                new ResourceLocation("minecraft","block/template_campfire")).renderType("minecraft:cutout")
                .texture("fire",new ResourceLocation(ColorfulCampfires.MOD_ID,"block/test_campfire_fire"))
                .texture("lit_log",new ResourceLocation(ColorfulCampfires.MOD_ID,"block/"+woodType+"_campfire_log_lit"))
                .texture("log",new ResourceLocation(ColorfulCampfires.MOD_ID,"block/"+woodType+"_campfire_log"))
                .texture("particle",new ResourceLocation(ColorfulCampfires.MOD_ID,"block/"+woodType+"_campfire_log_lit"));
        //new ResourceLocation(ColorfulCampfires.MOD_ID,"block/"+woodType+"_campfire_log_lit").
//                .texture("fire", new ResourceLocation("minecraft", "block/campfire_fire"))
//                .texture("lit_log",modLoc("block/"+woodType+"_campfire_log_lit"))
//                .texture("log",modLoc("block/"+woodType+"_campfire_log"))
//                .texture("particle",modLoc("block/"+woodType+"_campfire_log_lit"));

    }


}
