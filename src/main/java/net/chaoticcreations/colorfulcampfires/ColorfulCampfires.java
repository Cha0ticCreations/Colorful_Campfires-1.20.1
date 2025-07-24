package net.chaoticcreations.colorfulcampfires;

import com.mojang.logging.LogUtils;
import net.chaoticcreations.colorfulcampfires.block.ModBlocks;
import net.chaoticcreations.colorfulcampfires.block.entity.ModBlockEntities;
import net.chaoticcreations.colorfulcampfires.item.ModCreativeModeTabs;
import net.chaoticcreations.colorfulcampfires.item.ModItems;
import net.chaoticcreations.colorfulcampfires.particle.*;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ColorfulCampfires.MOD_ID)
public class ColorfulCampfires
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "colorfulcampfires";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ColorfulCampfires(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModParticles.register(modEventBus);


        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey()== CreativeModeTabs.FUNCTIONAL_BLOCKS)
        {
            //event.accept(ModItems.BIRCH_CAMPFIRE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
        @SubscribeEvent
        public static void registerParticleProvider(RegisterParticleProvidersEvent event){

            //EMBER PARTICLES (sorted by color)

            // Base (if any)
            // (No base ember particles defined in provided code)

            // Black
            event.registerSpriteSet(ModParticles.BLACK_FIRE_EMBERS.get(), BlackFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.BLACK_DARK_FIRE_EMBERS.get(), BlackFireEmberParticles.Provider::new);

            // Blue
            event.registerSpriteSet(ModParticles.BLUE_FIRE_EMBERS.get(), BlueFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.BLUE_DARK_FIRE_EMBERS.get(), BlueFireEmberParticles.Provider::new);

            // Brown
            event.registerSpriteSet(ModParticles.BROWN_FIRE_EMBERS.get(), BrownFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.BROWN_DARK_FIRE_EMBERS.get(), BrownFireEmberParticles.Provider::new);

            // Cyan
            event.registerSpriteSet(ModParticles.CYAN_FIRE_EMBERS.get(), CyanFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.CYAN_DARK_FIRE_EMBERS.get(), CyanFireEmberParticles.Provider::new);

            // Gray
            event.registerSpriteSet(ModParticles.GRAY_FIRE_EMBERS.get(), GrayFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.GRAY_DARK_FIRE_EMBERS.get(), GrayFireEmberParticles.Provider::new);

            // Green
            event.registerSpriteSet(ModParticles.GREEN_FIRE_EMBERS.get(), GreenFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.GREEN_DARK_FIRE_EMBERS.get(), GreenFireEmberParticles.Provider::new);

            // Light Blue
            event.registerSpriteSet(ModParticles.LIGHT_BLUE_FIRE_EMBERS.get(), LightBlueFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.LIGHT_BLUE_DARK_FIRE_EMBERS.get(), LightBlueFireEmberParticles.Provider::new);

            // Light Gray
            event.registerSpriteSet(ModParticles.LIGHT_GRAY_FIRE_EMBERS.get(), LightGrayFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.LIGHT_GRAY_DARK_FIRE_EMBERS.get(), LightGrayFireEmberParticles.Provider::new);

            // Lime
            event.registerSpriteSet(ModParticles.LIME_FIRE_EMBERS.get(), LimeFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.LIME_DARK_FIRE_EMBERS.get(), LimeFireEmberParticles.Provider::new);

            // Magenta
            event.registerSpriteSet(ModParticles.MAGENTA_FIRE_EMBERS.get(), MagentaFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.MAGENTA_DARK_FIRE_EMBERS.get(), MagentaFireEmberParticles.Provider::new);

            // Orange
            event.registerSpriteSet(ModParticles.ORANGE_FIRE_EMBERS.get(), OrangeFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.ORANGE_DARK_FIRE_EMBERS.get(), OrangeFireEmberParticles.Provider::new);

            // Pink
            event.registerSpriteSet(ModParticles.PINK_FIRE_EMBERS.get(), PinkFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.PINK_DARK_FIRE_EMBERS.get(), PinkFireEmberParticles.Provider::new);

            // Purple
            event.registerSpriteSet(ModParticles.PURPLE_FIRE_EMBERS.get(), PurpleFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.PURPLE_DARK_FIRE_EMBERS.get(), PurpleFireEmberParticles.Provider::new);

            // Red
            event.registerSpriteSet(ModParticles.RED_FIRE_EMBERS.get(), RedFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.RED_DARK_FIRE_EMBERS.get(), RedFireEmberParticles.Provider::new);

            // White
            event.registerSpriteSet(ModParticles.WHITE_FIRE_EMBERS.get(), WhiteFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.WHITE_DARK_FIRE_EMBERS.get(), WhiteFireEmberParticles.Provider::new);

            // Yellow
            event.registerSpriteSet(ModParticles.YELLOW_FIRE_EMBERS.get(), YellowFireEmberParticles.Provider::new);
            event.registerSpriteSet(ModParticles.YELLOW_DARK_FIRE_EMBERS.get(), YellowFireEmberParticles.Provider::new);

        }
    }
}
