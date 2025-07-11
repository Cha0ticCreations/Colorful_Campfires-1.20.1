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

    public static final RegistryObject<BirchCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            ()->new BirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<WhiteBirchCampfireBlock> WHITE_BIRCH_CAMPFIRE = registerBlock("white_birch_campfire",
            ()->new WhiteBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<WhiteBirchDarkCampfireBlock> WHITE_BIRCH_DARK_CAMPFIRE = registerBlock("white_birch_dark_campfire",
            ()->new WhiteBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<OrangeBirchCampfireBlock> ORANGE_BIRCH_CAMPFIRE = registerBlock("orange_birch_campfire",
            ()->new OrangeBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<OrangeBirchDarkCampfireBlock> ORANGE_BIRCH_DARK_CAMPFIRE = registerBlock("orange_birch_dark_campfire",
            ()->new OrangeBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<LimeBirchCampfireBlock> LIME_BIRCH_CAMPFIRE = registerBlock("lime_birch_campfire",
            ()->new LimeBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<LimeBirchDarkCampfireBlock> LIME_BIRCH_DARK_CAMPFIRE = registerBlock("lime_birch_dark_campfire",
            ()->new LimeBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // Stripped variants
    public static final RegistryObject<StrippedBirchCampfireBlock> STRIPPED_BIRCH_CAMPFIRE = registerBlock("stripped_birch_campfire",
            ()->new StrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    // Colored stripped variants
    public static final RegistryObject<WhiteStrippedBirchCampfireBlock> WHITE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("white_stripped_birch_campfire",
            ()->new WhiteStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<WhiteStrippedBirchDarkCampfireBlock> WHITE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("white_stripped_birch_dark_campfire",
            ()->new WhiteStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<OrangeStrippedBirchCampfireBlock> ORANGE_STRIPPED_BIRCH_CAMPFIRE = registerBlock("orange_stripped_birch_campfire",
            ()->new OrangeStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<OrangeStrippedBirchDarkCampfireBlock> ORANGE_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("orange_stripped_birch_dark_campfire",
            ()->new OrangeStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<LimeStrippedBirchCampfireBlock> LIME_STRIPPED_BIRCH_CAMPFIRE = registerBlock("lime_stripped_birch_campfire",
            ()->new LimeStrippedBirchCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<LimeStrippedBirchDarkCampfireBlock> LIME_STRIPPED_BIRCH_DARK_CAMPFIRE = registerBlock("lime_stripped_birch_dark_campfire",
            ()->new LimeStrippedBirchDarkCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));


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
