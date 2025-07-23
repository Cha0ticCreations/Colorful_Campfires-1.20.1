package net.chaoticcreations.colorfulcampfires.particle;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ColorfulCampfires.MOD_ID);

    //REMEMBER TO REGISTER PARTICLE TYPES HERE



    //EMBERS (sorted by color)

    // Black
    public static final RegistryObject<SimpleParticleType> BLACK_FIRE_EMBERS =
            PARTICLE_TYPES.register("black_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> BLACK_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("black_dark_fire_embers", () -> new SimpleParticleType(true));

    // Blue
    public static final RegistryObject<SimpleParticleType> BLUE_FIRE_EMBERS =
            PARTICLE_TYPES.register("blue_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> BLUE_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("blue_dark_fire_embers", () -> new SimpleParticleType(true));

    // Cyan
    public static final RegistryObject<SimpleParticleType> CYAN_FIRE_EMBERS =
            PARTICLE_TYPES.register("cyan_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> CYAN_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("cyan_dark_fire_embers", () -> new SimpleParticleType(true));

    // Gray
    public static final RegistryObject<SimpleParticleType> GRAY_FIRE_EMBERS =
            PARTICLE_TYPES.register("gray_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> GRAY_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("gray_dark_fire_embers", () -> new SimpleParticleType(true));

    // Light Gray
    public static final RegistryObject<SimpleParticleType> LIGHT_GRAY_FIRE_EMBERS =
            PARTICLE_TYPES.register("light_gray_fire_embers", () -> new SimpleParticleType(true));
        public static final RegistryObject<SimpleParticleType> LIGHT_GRAY_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("light_gray_dark_fire_embers", () -> new SimpleParticleType(true));

    // Lime
    public static final RegistryObject<SimpleParticleType> LIME_FIRE_EMBERS =
            PARTICLE_TYPES.register("lime_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> LIME_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("lime_dark_fire_embers", () -> new SimpleParticleType(true));

    // Orange
    public static final RegistryObject<SimpleParticleType> ORANGE_FIRE_EMBERS =
            PARTICLE_TYPES.register("orange_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> ORANGE_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("orange_dark_fire_embers", () -> new SimpleParticleType(true));

    // Pink
    public static final RegistryObject<SimpleParticleType> PINK_FIRE_EMBERS =
            PARTICLE_TYPES.register("pink_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> PINK_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("pink_dark_fire_embers", () -> new SimpleParticleType(true));

   // Purple
    public static final RegistryObject<SimpleParticleType> PURPLE_FIRE_EMBERS =
            PARTICLE_TYPES.register("purple_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> PURPLE_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("purple_dark_fire_embers", () -> new SimpleParticleType(true));

    // White
    public static final RegistryObject<SimpleParticleType> WHITE_FIRE_EMBERS =
            PARTICLE_TYPES.register("white_fire_embers", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> WHITE_DARK_FIRE_EMBERS =
            PARTICLE_TYPES.register("white_dark_fire_embers", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus){
        PARTICLE_TYPES.register(eventBus);
    }
}
