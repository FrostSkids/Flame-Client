// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;

public class Barrier extends EntityFX
{
    private static final /* synthetic */ int[] llIIIIIllllIll;
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIlllIlllIlIlIIIIIlII, final Entity llllllllllllIlllIlllIlIlIIIIIIll, final float llllllllllllIlllIlllIlIIlllIllll, final float llllllllllllIlllIlllIlIIlllIlllI, final float llllllllllllIlllIlllIlIlIIIIIIII, final float llllllllllllIlllIlllIlIIllllllll, final float llllllllllllIlllIlllIlIIlllllllI, final float llllllllllllIlllIlllIlIIllllllIl) {
        final float llllllllllllIlllIlllIlIIllllllII = this.particleIcon.getMinU();
        final float llllllllllllIlllIlllIlIIlllllIll = this.particleIcon.getMaxU();
        final float llllllllllllIlllIlllIlIIlllllIlI = this.particleIcon.getMinV();
        final float llllllllllllIlllIlllIlIIlllllIIl = this.particleIcon.getMaxV();
        final float llllllllllllIlllIlllIlIIlllllIII = 0.5f;
        final float llllllllllllIlllIlllIlIIllllIlll = (float)(this.prevPosX + (this.posX - this.prevPosX) * llllllllllllIlllIlllIlIIlllIllll - Barrier.interpPosX);
        final float llllllllllllIlllIlllIlIIllllIllI = (float)(this.prevPosY + (this.posY - this.prevPosY) * llllllllllllIlllIlllIlIIlllIllll - Barrier.interpPosY);
        final float llllllllllllIlllIlllIlIIllllIlIl = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * llllllllllllIlllIlllIlIIlllIllll - Barrier.interpPosZ);
        final int llllllllllllIlllIlllIlIIllllIlII = this.getBrightnessForRender(llllllllllllIlllIlllIlIIlllIllll);
        final int llllllllllllIlllIlllIlIIllllIIll = llllllllllllIlllIlllIlIIllllIlII >> Barrier.llIIIIIllllIll[2] & Barrier.llIIIIIllllIll[3];
        final int llllllllllllIlllIlllIlIIllllIIlI = llllllllllllIlllIlllIlIIllllIlII & Barrier.llIIIIIllllIll[3];
        llllllllllllIlllIlllIlIlIIIIIlII.pos(llllllllllllIlllIlllIlIIllllIlll - llllllllllllIlllIlllIlIIlllIlllI * 0.5f - llllllllllllIlllIlllIlIIlllllllI * 0.5f, llllllllllllIlllIlllIlIIllllIllI - llllllllllllIlllIlllIlIlIIIIIIII * 0.5f, llllllllllllIlllIlllIlIIllllIlIl - llllllllllllIlllIlllIlIIllllllll * 0.5f - llllllllllllIlllIlllIlIIllllllIl * 0.5f).tex(llllllllllllIlllIlllIlIIlllllIll, llllllllllllIlllIlllIlIIlllllIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(llllllllllllIlllIlllIlIIllllIIll, llllllllllllIlllIlllIlIIllllIIlI).endVertex();
        llllllllllllIlllIlllIlIlIIIIIlII.pos(llllllllllllIlllIlllIlIIllllIlll - llllllllllllIlllIlllIlIIlllIlllI * 0.5f + llllllllllllIlllIlllIlIIlllllllI * 0.5f, llllllllllllIlllIlllIlIIllllIllI + llllllllllllIlllIlllIlIlIIIIIIII * 0.5f, llllllllllllIlllIlllIlIIllllIlIl - llllllllllllIlllIlllIlIIllllllll * 0.5f + llllllllllllIlllIlllIlIIllllllIl * 0.5f).tex(llllllllllllIlllIlllIlIIlllllIll, llllllllllllIlllIlllIlIIlllllIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(llllllllllllIlllIlllIlIIllllIIll, llllllllllllIlllIlllIlIIllllIIlI).endVertex();
        llllllllllllIlllIlllIlIlIIIIIlII.pos(llllllllllllIlllIlllIlIIllllIlll + llllllllllllIlllIlllIlIIlllIlllI * 0.5f + llllllllllllIlllIlllIlIIlllllllI * 0.5f, llllllllllllIlllIlllIlIIllllIllI + llllllllllllIlllIlllIlIlIIIIIIII * 0.5f, llllllllllllIlllIlllIlIIllllIlIl + llllllllllllIlllIlllIlIIllllllll * 0.5f + llllllllllllIlllIlllIlIIllllllIl * 0.5f).tex(llllllllllllIlllIlllIlIIllllllII, llllllllllllIlllIlllIlIIlllllIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(llllllllllllIlllIlllIlIIllllIIll, llllllllllllIlllIlllIlIIllllIIlI).endVertex();
        llllllllllllIlllIlllIlIlIIIIIlII.pos(llllllllllllIlllIlllIlIIllllIlll + llllllllllllIlllIlllIlIIlllIlllI * 0.5f - llllllllllllIlllIlllIlIIlllllllI * 0.5f, llllllllllllIlllIlllIlIIllllIllI - llllllllllllIlllIlllIlIlIIIIIIII * 0.5f, llllllllllllIlllIlllIlIIllllIlIl + llllllllllllIlllIlllIlIIllllllll * 0.5f - llllllllllllIlllIlllIlIIllllllIl * 0.5f).tex(llllllllllllIlllIlllIlIIllllllII, llllllllllllIlllIlllIlIIlllllIIl).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(llllllllllllIlllIlllIlIIllllIIll, llllllllllllIlllIlllIlIIllllIIlI).endVertex();
    }
    
    static {
        lIIIIllllIIIIIlI();
    }
    
    private static void lIIIIllllIIIIIlI() {
        (llIIIIIllllIll = new int[4])[0] = (0xE0 ^ 0xAA ^ (0x27 ^ 0x3D));
        Barrier.llIIIIIllllIll[1] = " ".length();
        Barrier.llIIIIIllllIll[2] = (0x29 ^ 0x39);
        Barrier.llIIIIIllllIll[3] = (-1 & 0xFFFF);
    }
    
    protected Barrier(final World llllllllllllIlllIlllIlIlIIIllllI, final double llllllllllllIlllIlllIlIlIIIlllIl, final double llllllllllllIlllIlllIlIlIIIlllII, final double llllllllllllIlllIlllIlIlIIlIIIIl, final Item llllllllllllIlllIlllIlIlIIIllIlI) {
        super(llllllllllllIlllIlllIlIlIIIllllI, llllllllllllIlllIlllIlIlIIIlllIl, llllllllllllIlllIlllIlIlIIIlllII, llllllllllllIlllIlllIlIlIIlIIIIl, 0.0, 0.0, 0.0);
        this.setParticleIcon(Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getParticleIcon(llllllllllllIlllIlllIlIlIIIllIlI));
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        this.particleGravity = 0.0f;
        this.particleMaxAge = Barrier.llIIIIIllllIll[0];
    }
    
    @Override
    public int getFXLayer() {
        return Barrier.llIIIIIllllIll[1];
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIlIllIllIIlIlIllI, final World lllllllllllllIIIlIllIllIIlIlIlIl, final double lllllllllllllIIIlIllIllIIlIlIlII, final double lllllllllllllIIIlIllIllIIlIlIIll, final double lllllllllllllIIIlIllIllIIlIIlIlI, final double lllllllllllllIIIlIllIllIIlIlIIIl, final double lllllllllllllIIIlIllIllIIlIlIIII, final double lllllllllllllIIIlIllIllIIlIIllll, final int... lllllllllllllIIIlIllIllIIlIIlllI) {
            return new Barrier(lllllllllllllIIIlIllIllIIlIlIlIl, lllllllllllllIIIlIllIllIIlIlIlII, lllllllllllllIIIlIllIllIIlIlIIll, lllllllllllllIIIlIllIllIIlIIlIlI, Item.getItemFromBlock(Blocks.barrier));
        }
    }
}
