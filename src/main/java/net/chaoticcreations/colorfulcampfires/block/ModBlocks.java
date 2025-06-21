package net.chaoticcreations.colorfulcampfires.block;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;

//import net.chaoticcreations.colorfulcampfires.block.custom.ModCampfireBlock;
import net.chaoticcreations.colorfulcampfires.block.custom.ModCampfireBlock;
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

import static net.minecraft.world.item.Items.registerBlock;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorfulCampfires.MOD_ID);

//start registry
//    public static final RegistryObject<CampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
//
//    public static final RegistryObject<CampfireBlock> WHITE_BIRCH_CAMPFIRE = registerBlock("white_birch_campfire",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));
//
//    public static final RegistryObject<CampfireBlock> WHITE_BIRCH_CAMPFIRE_DARK = registerBlock("white_birch_campfire_dark",
//            ()->new CampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

//    public static final RegistryObject<ModCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
//            ()->new ModCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));

    public static final RegistryObject<ModCampfireBlock> BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            ()->new ModCampfireBlock(true,1, BlockBehaviour.Properties.copy(Blocks.CAMPFIRE)));



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
