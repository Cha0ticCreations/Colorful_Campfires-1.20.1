package net.chaoticcreations.colorfulcampfires.datagen;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.chaoticcreations.colorfulcampfires.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ColorfulCampfires.MOD_ID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(ModItems.BIRCH_CAMPFIRE_ITEM);
        //simpleItem(ModItems.BIRCH_CAMPFIRE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ColorfulCampfires.MOD_ID,"item/" + item.getId().getPath()));
    }
}
