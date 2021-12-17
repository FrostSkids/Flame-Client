// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBreakingFX extends EntityFX
{
    private static final /* synthetic */ int[] lIIlllIllIIllI;
    
    protected EntityBreakingFX(final World lllllllllllllIIlIIlllIIllIIIllll, final double lllllllllllllIIlIIlllIIllIIllIII, final double lllllllllllllIIlIIlllIIllIIIllIl, final double lllllllllllllIIlIIlllIIllIIIllII, final double lllllllllllllIIlIIlllIIllIIIlIll, final double lllllllllllllIIlIIlllIIllIIIlIlI, final double lllllllllllllIIlIIlllIIllIIIlIIl, final Item lllllllllllllIIlIIlllIIllIIlIIlI, final int lllllllllllllIIlIIlllIIllIIIIlll) {
        this(lllllllllllllIIlIIlllIIllIIIllll, lllllllllllllIIlIIlllIIllIIllIII, lllllllllllllIIlIIlllIIllIIIllIl, lllllllllllllIIlIIlllIIllIIIllII, lllllllllllllIIlIIlllIIllIIlIIlI, lllllllllllllIIlIIlllIIllIIIIlll);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        this.motionX += lllllllllllllIIlIIlllIIllIIIlIll;
        this.motionY += lllllllllllllIIlIIlllIIllIIIlIlI;
        this.motionZ += lllllllllllllIIlIIlllIIllIIIlIIl;
    }
    
    protected EntityBreakingFX(final World lllllllllllllIIlIIlllIIllIlIlIIl, final double lllllllllllllIIlIIlllIIllIlIlIII, final double lllllllllllllIIlIIlllIIllIlIIlll, final double lllllllllllllIIlIIlllIIllIlIllII, final Item lllllllllllllIIlIIlllIIllIlIIlIl) {
        this(lllllllllllllIIlIIlllIIllIlIlIIl, lllllllllllllIIlIIlllIIllIlIlIII, lllllllllllllIIlIIlllIIllIlIIlll, lllllllllllllIIlIIlllIIllIlIllII, lllllllllllllIIlIIlllIIllIlIIlIl, EntityBreakingFX.lIIlllIllIIllI[0]);
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIlIIlllIIlIlIIlIII, final Entity lllllllllllllIIlIIlllIIlIlIllIll, final float lllllllllllllIIlIIlllIIlIlIIIlll, final float lllllllllllllIIlIIlllIIlIlIllIIl, final float lllllllllllllIIlIIlllIIlIlIllIII, final float lllllllllllllIIlIIlllIIlIlIlIlll, final float lllllllllllllIIlIIlllIIlIlIIIIll, final float lllllllllllllIIlIIlllIIlIlIlIlIl) {
        float lllllllllllllIIlIIlllIIlIlIlIlII = (this.particleTextureIndexX + this.particleTextureJitterX / 4.0f) / 16.0f;
        float lllllllllllllIIlIIlllIIlIlIlIIll = lllllllllllllIIlIIlllIIlIlIlIlII + 0.015609375f;
        float lllllllllllllIIlIIlllIIlIlIlIIlI = (this.particleTextureIndexY + this.particleTextureJitterY / 4.0f) / 16.0f;
        float lllllllllllllIIlIIlllIIlIlIlIIIl = lllllllllllllIIlIIlllIIlIlIlIIlI + 0.015609375f;
        final float lllllllllllllIIlIIlllIIlIlIlIIII = 0.1f * this.particleScale;
        if (llIlllIIIIIlIlI(this.particleIcon)) {
            lllllllllllllIIlIIlllIIlIlIlIlII = this.particleIcon.getInterpolatedU(this.particleTextureJitterX / 4.0f * 16.0f);
            lllllllllllllIIlIIlllIIlIlIlIIll = this.particleIcon.getInterpolatedU((this.particleTextureJitterX + 1.0f) / 4.0f * 16.0f);
            lllllllllllllIIlIIlllIIlIlIlIIlI = this.particleIcon.getInterpolatedV(this.particleTextureJitterY / 4.0f * 16.0f);
            lllllllllllllIIlIIlllIIlIlIlIIIl = this.particleIcon.getInterpolatedV((this.particleTextureJitterY + 1.0f) / 4.0f * 16.0f);
        }
        final float lllllllllllllIIlIIlllIIlIlIIllll = (float)(this.prevPosX + (this.posX - this.prevPosX) * lllllllllllllIIlIIlllIIlIlIIIlll - EntityBreakingFX.interpPosX);
        final float lllllllllllllIIlIIlllIIlIlIIlllI = (float)(this.prevPosY + (this.posY - this.prevPosY) * lllllllllllllIIlIIlllIIlIlIIIlll - EntityBreakingFX.interpPosY);
        final float lllllllllllllIIlIIlllIIlIlIIllIl = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * lllllllllllllIIlIIlllIIlIlIIIlll - EntityBreakingFX.interpPosZ);
        final int lllllllllllllIIlIIlllIIlIlIIllII = this.getBrightnessForRender(lllllllllllllIIlIIlllIIlIlIIIlll);
        final int lllllllllllllIIlIIlllIIlIlIIlIll = lllllllllllllIIlIIlllIIlIlIIllII >> EntityBreakingFX.lIIlllIllIIllI[2] & EntityBreakingFX.lIIlllIllIIllI[3];
        final int lllllllllllllIIlIIlllIIlIlIIlIlI = lllllllllllllIIlIIlllIIlIlIIllII & EntityBreakingFX.lIIlllIllIIllI[3];
        lllllllllllllIIlIIlllIIlIlIIlIII.pos(lllllllllllllIIlIIlllIIlIlIIllll - lllllllllllllIIlIIlllIIlIlIllIIl * lllllllllllllIIlIIlllIIlIlIlIIII - lllllllllllllIIlIIlllIIlIlIIIIll * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIlllI - lllllllllllllIIlIIlllIIlIlIllIII * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIllIl - lllllllllllllIIlIIlllIIlIlIlIlll * lllllllllllllIIlIIlllIIlIlIlIIII - lllllllllllllIIlIIlllIIlIlIlIlIl * lllllllllllllIIlIIlllIIlIlIlIIII).tex(lllllllllllllIIlIIlllIIlIlIlIlII, lllllllllllllIIlIIlllIIlIlIlIIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIIlIIlllIIlIlIIlIll, lllllllllllllIIlIIlllIIlIlIIlIlI).endVertex();
        lllllllllllllIIlIIlllIIlIlIIlIII.pos(lllllllllllllIIlIIlllIIlIlIIllll - lllllllllllllIIlIIlllIIlIlIllIIl * lllllllllllllIIlIIlllIIlIlIlIIII + lllllllllllllIIlIIlllIIlIlIIIIll * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIlllI + lllllllllllllIIlIIlllIIlIlIllIII * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIllIl - lllllllllllllIIlIIlllIIlIlIlIlll * lllllllllllllIIlIIlllIIlIlIlIIII + lllllllllllllIIlIIlllIIlIlIlIlIl * lllllllllllllIIlIIlllIIlIlIlIIII).tex(lllllllllllllIIlIIlllIIlIlIlIlII, lllllllllllllIIlIIlllIIlIlIlIIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIIlIIlllIIlIlIIlIll, lllllllllllllIIlIIlllIIlIlIIlIlI).endVertex();
        lllllllllllllIIlIIlllIIlIlIIlIII.pos(lllllllllllllIIlIIlllIIlIlIIllll + lllllllllllllIIlIIlllIIlIlIllIIl * lllllllllllllIIlIIlllIIlIlIlIIII + lllllllllllllIIlIIlllIIlIlIIIIll * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIlllI + lllllllllllllIIlIIlllIIlIlIllIII * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIllIl + lllllllllllllIIlIIlllIIlIlIlIlll * lllllllllllllIIlIIlllIIlIlIlIIII + lllllllllllllIIlIIlllIIlIlIlIlIl * lllllllllllllIIlIIlllIIlIlIlIIII).tex(lllllllllllllIIlIIlllIIlIlIlIIll, lllllllllllllIIlIIlllIIlIlIlIIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIIlIIlllIIlIlIIlIll, lllllllllllllIIlIIlllIIlIlIIlIlI).endVertex();
        lllllllllllllIIlIIlllIIlIlIIlIII.pos(lllllllllllllIIlIIlllIIlIlIIllll + lllllllllllllIIlIIlllIIlIlIllIIl * lllllllllllllIIlIIlllIIlIlIlIIII - lllllllllllllIIlIIlllIIlIlIIIIll * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIlllI - lllllllllllllIIlIIlllIIlIlIllIII * lllllllllllllIIlIIlllIIlIlIlIIII, lllllllllllllIIlIIlllIIlIlIIllIl + lllllllllllllIIlIIlllIIlIlIlIlll * lllllllllllllIIlIIlllIIlIlIlIIII - lllllllllllllIIlIIlllIIlIlIlIlIl * lllllllllllllIIlIIlllIIlIlIlIIII).tex(lllllllllllllIIlIIlllIIlIlIlIIll, lllllllllllllIIlIIlllIIlIlIlIIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIIlIIlllIIlIlIIlIll, lllllllllllllIIlIIlllIIlIlIIlIlI).endVertex();
    }
    
    private static void llIlllIIIIIlIIl() {
        (lIIlllIllIIllI = new int[4])[0] = ((0x67 ^ 0x77) & ~(0x47 ^ 0x57));
        EntityBreakingFX.lIIlllIllIIllI[1] = " ".length();
        EntityBreakingFX.lIIlllIllIIllI[2] = (11 + 103 - 60 + 87 ^ 103 + 138 - 130 + 46);
        EntityBreakingFX.lIIlllIllIIllI[3] = (-" ".length() & (-1 & 0xFFFF));
    }
    
    private static boolean llIlllIIIIIlIlI(final Object lllllllllllllIIlIIlllIIlIIllIlIl) {
        return lllllllllllllIIlIIlllIIlIIllIlIl != null;
    }
    
    protected EntityBreakingFX(final World lllllllllllllIIlIIlllIIlIllllllI, final double lllllllllllllIIlIIlllIIlIlllIllI, final double lllllllllllllIIlIIlllIIlIlllIlIl, final double lllllllllllllIIlIIlllIIlIlllIlII, final Item lllllllllllllIIlIIlllIIlIllllIlI, final int lllllllllllllIIlIIlllIIlIlllIIlI) {
        super(lllllllllllllIIlIIlllIIlIllllllI, lllllllllllllIIlIIlllIIlIlllIllI, lllllllllllllIIlIIlllIIlIlllIlIl, lllllllllllllIIlIIlllIIlIlllIlII, 0.0, 0.0, 0.0);
        this.setParticleIcon(Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getParticleIcon(lllllllllllllIIlIIlllIIlIllllIlI, lllllllllllllIIlIIlllIIlIlllIIlI));
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleGravity = Blocks.snow.blockParticleGravity;
        this.particleScale /= 2.0f;
    }
    
    static {
        llIlllIIIIIlIIl();
    }
    
    @Override
    public int getFXLayer() {
        return EntityBreakingFX.lIIlllIllIIllI[1];
    }
    
    public static class SnowballFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIIlIllIIllIlIllI, final World lllllllllllllIIlIIlIllIIllIlIlIl, final double lllllllllllllIIlIIlIllIIllIIllII, final double lllllllllllllIIlIIlIllIIllIlIIll, final double lllllllllllllIIlIIlIllIIllIlIIlI, final double lllllllllllllIIlIIlIllIIllIlIIIl, final double lllllllllllllIIlIIlIllIIllIlIIII, final double lllllllllllllIIlIIlIllIIllIIllll, final int... lllllllllllllIIlIIlIllIIllIIlllI) {
            return new EntityBreakingFX(lllllllllllllIIlIIlIllIIllIlIlIl, lllllllllllllIIlIIlIllIIllIIllII, lllllllllllllIIlIIlIllIIllIlIIll, lllllllllllllIIlIIlIllIIllIlIIlI, Items.snowball);
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lIlIIIllIlllIl;
        
        private static boolean lllIIIlllllllII(final int lllllllllllllIIIlllIlllllllIllIl, final int lllllllllllllIIIlllIlllllllIllII) {
            return lllllllllllllIIIlllIlllllllIllIl > lllllllllllllIIIlllIlllllllIllII;
        }
        
        static {
            lllIIIllllllIll();
        }
        
        private static void lllIIIllllllIll() {
            (lIlIIIllIlllIl = new int[2])[0] = " ".length();
            Factory.lIlIIIllIlllIl[1] = ((19 + 36 + 33 + 77 ^ 123 + 154 - 130 + 30) & (0x61 ^ 0x1A ^ (0x4E ^ 0x21) ^ -" ".length()));
        }
        
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIllllIIIIIIIIIIlI, final World lllllllllllllIIIllllIIIIIIIIIIIl, final double lllllllllllllIIIllllIIIIIIIIIIII, final double lllllllllllllIIIlllIllllllllllll, final double lllllllllllllIIIlllIllllllllIlII, final double lllllllllllllIIIlllIllllllllllIl, final double lllllllllllllIIIlllIllllllllIIlI, final double lllllllllllllIIIlllIllllllllIIIl, final int... lllllllllllllIIIlllIllllllllIIII) {
            int n;
            if (lllIIIlllllllII(lllllllllllllIIIlllIllllllllIIII.length, Factory.lIlIIIllIlllIl[0])) {
                n = lllllllllllllIIIlllIllllllllIIII[Factory.lIlIIIllIlllIl[0]];
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            else {
                n = Factory.lIlIIIllIlllIl[1];
            }
            final int lllllllllllllIIIlllIlllllllllIIl = n;
            return new EntityBreakingFX(lllllllllllllIIIllllIIIIIIIIIIIl, lllllllllllllIIIllllIIIIIIIIIIII, lllllllllllllIIIlllIllllllllllll, lllllllllllllIIIlllIllllllllIlII, lllllllllllllIIIlllIllllllllllIl, lllllllllllllIIIlllIllllllllIIlI, lllllllllllllIIIlllIllllllllIIIl, Item.getItemById(lllllllllllllIIIlllIllllllllIIII[Factory.lIlIIIllIlllIl[1]]), lllllllllllllIIIlllIlllllllllIIl);
        }
    }
    
    public static class SlimeFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIIIIIlIIllIIIIII, final World lllllllllllllIIlIIIIIlIIlIllIlll, final double lllllllllllllIIlIIIIIlIIlIlllllI, final double lllllllllllllIIlIIIIIlIIlIllllIl, final double lllllllllllllIIlIIIIIlIIlIllIlII, final double lllllllllllllIIlIIIIIlIIlIlllIll, final double lllllllllllllIIlIIIIIlIIlIlllIlI, final double lllllllllllllIIlIIIIIlIIlIlllIIl, final int... lllllllllllllIIlIIIIIlIIlIlllIII) {
            return new EntityBreakingFX(lllllllllllllIIlIIIIIlIIlIllIlll, lllllllllllllIIlIIIIIlIIlIlllllI, lllllllllllllIIlIIIIIlIIlIllllIl, lllllllllllllIIlIIIIIlIIlIllIlII, Items.slime_ball);
        }
    }
}
