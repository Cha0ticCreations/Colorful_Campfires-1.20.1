package net.chaoticcreations.colorfulcampfires.item;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ColorfulCampfires.MOD_ID);
    public static final RegistryObject<Item> BIRCH_CAMPFIRE_ITEM = ITEMS.register("birch_campfire_item",()-> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
