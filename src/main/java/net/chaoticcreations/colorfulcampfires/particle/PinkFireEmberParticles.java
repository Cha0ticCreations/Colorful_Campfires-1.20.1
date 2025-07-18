package net.chaoticcreations.colorfulcampfires.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class PinkFireEmberParticles extends TextureSheetParticle {
    protected PinkFireEmberParticles(ClientLevel pLevel, double pX, double pY, double pZ,
                                     SpriteSet spriteSet, double pXSpeed, double pYSpeed, double pZSpeed) {
        super(pLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed);
        this.gravity = 0.75F;
        this.friction = 0.999F;
        this.xd *= (double)0.8F;
        this.yd *= (double)0.8F;
        this.zd *= (double)0.8F;
        this.yd = (double)(this.random.nextFloat() * 0.4F + 0.05F);
        this.quadSize *= this.random.nextFloat() * 2.0F + 0.2F;
        this.lifetime = (int)(16.0D / (Math.random() * 0.8D + 0.2D));

        this.setSpriteFromAge(spriteSet);
        this.rCol = 1f;
        this.gCol = 1f;
        this.bCol = 1f;



    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public int getLightColor(float pPartialTick) {
        int i = super.getLightColor(pPartialTick);
        int j = 240;
        int k = i >> 16 & 255;
        return 240 | k << 16;
    }

    public float getQuadSize(float pScaleFactor) {
        float f = ((float)this.age + pScaleFactor) / (float)this.lifetime;
        return this.quadSize * (1.0F - f * f);
    }

    public void tick() {
        super.tick();
        if (!this.removed) {
            float f = (float)this.age / (float)this.lifetime;
            if (this.random.nextFloat() > f) {
                this.level.addParticle(ParticleTypes.SMOKE, this.x, this.y, this.z, this.xd, this.yd, this.zd);
            }
        }

    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet pSprites) {
            this.sprite = pSprites;
        }

        public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
//            LavaParticle lavaparticle = new LavaParticle(pLevel, pX, pY, pZ);
//            lavaparticle.pickSprite(this.sprite);
//            return lavaparticle;
            PinkFireEmberParticles blueFireEmberParticles = new PinkFireEmberParticles(pLevel, pX, pY, pZ, this.sprite, pXSpeed, pYSpeed, pZSpeed);
            blueFireEmberParticles.pickSprite(this.sprite);
            return blueFireEmberParticles;
        }
    }




//    public  static class Provider implements ParticleProvider<SimpleParticleType> {
//        private final SpriteSet spriteSet;
//
//        public Provider(SpriteSet spriteSet) {
//            this.spriteSet = spriteSet;
//        }
//
//        @Nullable
//        @Override
//        public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ,
//                                       double pXSpeed, double pYSpeed, double pZSpeed) {
//            return new PinkFireEmberParticles(pLevel,pX,pY,pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
//        }
//
//
//    }
}
