package net.chaoticcreations.colorfulcampfires.particle;

import net.chaoticcreations.colorfulcampfires.ColorfulCampfires;
import net.minecraft.client.particle.Particle;
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
    public static final RegistryObject<SimpleParticleType> BLUE_FIRE_EMBERS =
            PARTICLE_TYPES.register("blue_fire_embers", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> LIME_FIRE_EMBERS =
            PARTICLE_TYPES.register("lime_fire_embers", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> ORANGE_FIRE_EMBERS =
            PARTICLE_TYPES.register("orange_fire_embers", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> WHITE_FIRE_EMBERS =
            PARTICLE_TYPES.register("white_fire_embers", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus){
        PARTICLE_TYPES.register(eventBus);
    }
}
