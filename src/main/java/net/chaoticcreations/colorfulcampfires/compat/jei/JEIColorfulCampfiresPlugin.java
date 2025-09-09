package net.chaoticcreations.colorfulcampfires.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIColorfulCampfiresPlugin implements IModPlugin {
    
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(ColorfulCampfires.MOD_ID, "jei_plugin");
    }
    
    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        // JEI automatically detects and registers crafting recipes from the recipe manager
        // Our campfire recipes are loaded as standard shaped crafting recipes
        // No additional registration needed - JEI handles this automatically
    }
}
