// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.block.state.IBlockState;

public class EntityDiggingFX extends EntityFX
{
    private /* synthetic */ IBlockState field_174847_a;
    private /* synthetic */ BlockPos field_181019_az;
    private static final /* synthetic */ int[] llllIlIlIlIlI;
    
    private static boolean lIlIlIlIlIIIIlI(final int lllllllllllllIlIllIllIIIIllllIlI) {
        return lllllllllllllIlIllIllIIIIllllIlI == 0;
    }
    
    public EntityDiggingFX func_174845_l() {
        this.field_181019_az = new BlockPos(this.posX, this.posY, this.posZ);
        final Block lllllllllllllIlIllIllIIIllIIllll = this.field_174847_a.getBlock();
        if (lIlIlIlIIllllll(lllllllllllllIlIllIllIIIllIIllll, Blocks.grass)) {
            return this;
        }
        final int lllllllllllllIlIllIllIIIllIIlllI = lllllllllllllIlIllIllIIIllIIllll.getRenderColor(this.field_174847_a);
        this.particleRed *= (lllllllllllllIlIllIllIIIllIIlllI >> EntityDiggingFX.llllIlIlIlIlI[0] & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        this.particleGreen *= (lllllllllllllIlIllIllIIIllIIlllI >> EntityDiggingFX.llllIlIlIlIlI[2] & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        this.particleBlue *= (lllllllllllllIlIllIllIIIllIIlllI & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        return this;
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIlIllIllIIIlIlIIIIl, final Entity lllllllllllllIlIllIllIIIlIllIlII, final float lllllllllllllIlIllIllIIIlIllIIll, final float lllllllllllllIlIllIllIIIlIIlllll, final float lllllllllllllIlIllIllIIIlIllIIIl, final float lllllllllllllIlIllIllIIIlIllIIII, final float lllllllllllllIlIllIllIIIlIIlllII, final float lllllllllllllIlIllIllIIIlIlIlllI) {
        float lllllllllllllIlIllIllIIIlIlIllIl = (this.particleTextureIndexX + this.particleTextureJitterX / 4.0f) / 16.0f;
        float lllllllllllllIlIllIllIIIlIlIllII = lllllllllllllIlIllIllIIIlIlIllIl + 0.015609375f;
        float lllllllllllllIlIllIllIIIlIlIlIll = (this.particleTextureIndexY + this.particleTextureJitterY / 4.0f) / 16.0f;
        float lllllllllllllIlIllIllIIIlIlIlIlI = lllllllllllllIlIllIllIIIlIlIlIll + 0.015609375f;
        final float lllllllllllllIlIllIllIIIlIlIlIIl = 0.1f * this.particleScale;
        if (lIlIlIlIlIIIIII(this.particleIcon)) {
            lllllllllllllIlIllIllIIIlIlIllIl = this.particleIcon.getInterpolatedU(this.particleTextureJitterX / 4.0f * 16.0f);
            lllllllllllllIlIllIllIIIlIlIllII = this.particleIcon.getInterpolatedU((this.particleTextureJitterX + 1.0f) / 4.0f * 16.0f);
            lllllllllllllIlIllIllIIIlIlIlIll = this.particleIcon.getInterpolatedV(this.particleTextureJitterY / 4.0f * 16.0f);
            lllllllllllllIlIllIllIIIlIlIlIlI = this.particleIcon.getInterpolatedV((this.particleTextureJitterY + 1.0f) / 4.0f * 16.0f);
        }
        final float lllllllllllllIlIllIllIIIlIlIlIII = (float)(this.prevPosX + (this.posX - this.prevPosX) * lllllllllllllIlIllIllIIIlIllIIll - EntityDiggingFX.interpPosX);
        final float lllllllllllllIlIllIllIIIlIlIIlll = (float)(this.prevPosY + (this.posY - this.prevPosY) * lllllllllllllIlIllIllIIIlIllIIll - EntityDiggingFX.interpPosY);
        final float lllllllllllllIlIllIllIIIlIlIIllI = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * lllllllllllllIlIllIllIIIlIllIIll - EntityDiggingFX.interpPosZ);
        final int lllllllllllllIlIllIllIIIlIlIIlIl = this.getBrightnessForRender(lllllllllllllIlIllIllIIIlIllIIll);
        final int lllllllllllllIlIllIllIIIlIlIIlII = lllllllllllllIlIllIllIIIlIlIIlIl >> EntityDiggingFX.llllIlIlIlIlI[0] & EntityDiggingFX.llllIlIlIlIlI[4];
        final int lllllllllllllIlIllIllIIIlIlIIIll = lllllllllllllIlIllIllIIIlIlIIlIl & EntityDiggingFX.llllIlIlIlIlI[4];
        lllllllllllllIlIllIllIIIlIlIIIIl.pos(lllllllllllllIlIllIllIIIlIlIlIII - lllllllllllllIlIllIllIIIlIIlllll * lllllllllllllIlIllIllIIIlIlIlIIl - lllllllllllllIlIllIllIIIlIIlllII * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIlll - lllllllllllllIlIllIllIIIlIllIIIl * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIllI - lllllllllllllIlIllIllIIIlIllIIII * lllllllllllllIlIllIllIIIlIlIlIIl - lllllllllllllIlIllIllIIIlIlIlllI * lllllllllllllIlIllIllIIIlIlIlIIl).tex(lllllllllllllIlIllIllIIIlIlIllIl, lllllllllllllIlIllIllIIIlIlIlIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIlIllIllIIIlIlIIlII, lllllllllllllIlIllIllIIIlIlIIIll).endVertex();
        lllllllllllllIlIllIllIIIlIlIIIIl.pos(lllllllllllllIlIllIllIIIlIlIlIII - lllllllllllllIlIllIllIIIlIIlllll * lllllllllllllIlIllIllIIIlIlIlIIl + lllllllllllllIlIllIllIIIlIIlllII * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIlll + lllllllllllllIlIllIllIIIlIllIIIl * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIllI - lllllllllllllIlIllIllIIIlIllIIII * lllllllllllllIlIllIllIIIlIlIlIIl + lllllllllllllIlIllIllIIIlIlIlllI * lllllllllllllIlIllIllIIIlIlIlIIl).tex(lllllllllllllIlIllIllIIIlIlIllIl, lllllllllllllIlIllIllIIIlIlIlIll).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIlIllIllIIIlIlIIlII, lllllllllllllIlIllIllIIIlIlIIIll).endVertex();
        lllllllllllllIlIllIllIIIlIlIIIIl.pos(lllllllllllllIlIllIllIIIlIlIlIII + lllllllllllllIlIllIllIIIlIIlllll * lllllllllllllIlIllIllIIIlIlIlIIl + lllllllllllllIlIllIllIIIlIIlllII * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIlll + lllllllllllllIlIllIllIIIlIllIIIl * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIllI + lllllllllllllIlIllIllIIIlIllIIII * lllllllllllllIlIllIllIIIlIlIlIIl + lllllllllllllIlIllIllIIIlIlIlllI * lllllllllllllIlIllIllIIIlIlIlIIl).tex(lllllllllllllIlIllIllIIIlIlIllII, lllllllllllllIlIllIllIIIlIlIlIll).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIlIllIllIIIlIlIIlII, lllllllllllllIlIllIllIIIlIlIIIll).endVertex();
        lllllllllllllIlIllIllIIIlIlIIIIl.pos(lllllllllllllIlIllIllIIIlIlIlIII + lllllllllllllIlIllIllIIIlIIlllll * lllllllllllllIlIllIllIIIlIlIlIIl - lllllllllllllIlIllIllIIIlIIlllII * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIlll - lllllllllllllIlIllIllIIIlIllIIIl * lllllllllllllIlIllIllIIIlIlIlIIl, lllllllllllllIlIllIllIIIlIlIIllI + lllllllllllllIlIllIllIIIlIllIIII * lllllllllllllIlIllIllIIIlIlIlIIl - lllllllllllllIlIllIllIIIlIlIlllI * lllllllllllllIlIllIllIIIlIlIlIIl).tex(lllllllllllllIlIllIllIIIlIlIllII, lllllllllllllIlIllIllIIIlIlIlIlI).color(this.particleRed, this.particleGreen, this.particleBlue, 1.0f).lightmap(lllllllllllllIlIllIllIIIlIlIIlII, lllllllllllllIlIllIllIIIlIlIIIll).endVertex();
    }
    
    private static boolean lIlIlIlIlIIIIIl(final int lllllllllllllIlIllIllIIIIlllllII) {
        return lllllllllllllIlIllIllIIIIlllllII != 0;
    }
    
    private static boolean lIlIlIlIIllllll(final Object lllllllllllllIlIllIllIIIlIIIIIIl, final Object lllllllllllllIlIllIllIIIlIIIIIII) {
        return lllllllllllllIlIllIllIIIlIIIIIIl == lllllllllllllIlIllIllIIIlIIIIIII;
    }
    
    @Override
    public int getFXLayer() {
        return EntityDiggingFX.llllIlIlIlIlI[3];
    }
    
    private static boolean lIlIlIlIlIIIIII(final Object lllllllllllllIlIllIllIIIIllllllI) {
        return lllllllllllllIlIllIllIIIIllllllI != null;
    }
    
    static {
        lIlIlIlIIlllllI();
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIlIllIllIIIlIIIIllI) {
        final int lllllllllllllIlIllIllIIIlIIIlIIl = super.getBrightnessForRender(lllllllllllllIlIllIllIIIlIIIIllI);
        int lllllllllllllIlIllIllIIIlIIIlIII = EntityDiggingFX.llllIlIlIlIlI[5];
        if (lIlIlIlIlIIIIIl(this.worldObj.isBlockLoaded(this.field_181019_az) ? 1 : 0)) {
            lllllllllllllIlIllIllIIIlIIIlIII = this.worldObj.getCombinedLight(this.field_181019_az, EntityDiggingFX.llllIlIlIlIlI[5]);
        }
        int n;
        if (lIlIlIlIlIIIIlI(lllllllllllllIlIllIllIIIlIIIlIIl)) {
            n = lllllllllllllIlIllIllIIIlIIIlIII;
            "".length();
            if (((0x66 ^ 0x2A) & ~(0xF ^ 0x43)) >= "  ".length()) {
                return (0x3C ^ 0x34) & ~(0x3D ^ 0x35);
            }
        }
        else {
            n = lllllllllllllIlIllIllIIIlIIIlIIl;
        }
        return n;
    }
    
    public EntityDiggingFX func_174846_a(final BlockPos lllllllllllllIlIllIllIIIllIlIlIl) {
        this.field_181019_az = lllllllllllllIlIllIllIIIllIlIlIl;
        if (lIlIlIlIIllllll(this.field_174847_a.getBlock(), Blocks.grass)) {
            return this;
        }
        final int lllllllllllllIlIllIllIIIllIlIlll = this.field_174847_a.getBlock().colorMultiplier(this.worldObj, lllllllllllllIlIllIllIIIllIlIlIl);
        this.particleRed *= (lllllllllllllIlIllIllIIIllIlIlll >> EntityDiggingFX.llllIlIlIlIlI[0] & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        this.particleGreen *= (lllllllllllllIlIllIllIIIllIlIlll >> EntityDiggingFX.llllIlIlIlIlI[2] & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        this.particleBlue *= (lllllllllllllIlIllIllIIIllIlIlll & EntityDiggingFX.llllIlIlIlIlI[1]) / 255.0f;
        return this;
    }
    
    private static void lIlIlIlIIlllllI() {
        (llllIlIlIlIlI = new int[6])[0] = (0x6D ^ 0x7D);
        EntityDiggingFX.llllIlIlIlIlI[1] = (0xBC ^ 0xC6) + (128 + 95 - 14 + 16) - (0xFFFFD7AC & 0x2973) + (146 + 23 + 2 + 25);
        EntityDiggingFX.llllIlIlIlIlI[2] = (0xBF ^ 0xB7);
        EntityDiggingFX.llllIlIlIlIlI[3] = " ".length();
        EntityDiggingFX.llllIlIlIlIlI[4] = (-" ".length() & (-1 & 0xFFFF));
        EntityDiggingFX.llllIlIlIlIlI[5] = ((0xCC ^ 0x90) & ~(0x70 ^ 0x2C));
    }
    
    protected EntityDiggingFX(final World lllllllllllllIlIllIllIIIlllIIlII, final double lllllllllllllIlIllIllIIIlllIllII, final double lllllllllllllIlIllIllIIIlllIlIll, final double lllllllllllllIlIllIllIIIlllIIIIl, final double lllllllllllllIlIllIllIIIlllIIIII, final double lllllllllllllIlIllIllIIIllIlllll, final double lllllllllllllIlIllIllIIIlllIIlll, final IBlockState lllllllllllllIlIllIllIIIlllIIllI) {
        super(lllllllllllllIlIllIllIIIlllIIlII, lllllllllllllIlIllIllIIIlllIllII, lllllllllllllIlIllIllIIIlllIlIll, lllllllllllllIlIllIllIIIlllIIIIl, lllllllllllllIlIllIllIIIlllIIIII, lllllllllllllIlIllIllIIIllIlllll, lllllllllllllIlIllIllIIIlllIIlll);
        this.field_174847_a = lllllllllllllIlIllIllIIIlllIIllI;
        this.setParticleIcon(Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelShapes().getTexture(lllllllllllllIlIllIllIIIlllIIllI));
        this.particleGravity = lllllllllllllIlIllIllIIIlllIIllI.getBlock().blockParticleGravity;
        final float particleRed = 0.6f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale /= 2.0f;
    }
    
    public static class Factory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lIIIIIlIIllIIl;
        
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIlIIllllIIIllllIlIl, final World lllllllllllllIlIIllllIIIlllIllII, final double lllllllllllllIlIIllllIIIlllIlIll, final double lllllllllllllIlIIllllIIIllllIIlI, final double lllllllllllllIlIIllllIIIllllIIIl, final double lllllllllllllIlIIllllIIIlllIlIII, final double lllllllllllllIlIIllllIIIlllIIlll, final double lllllllllllllIlIIllllIIIlllIlllI, final int... lllllllllllllIlIIllllIIIlllIllIl) {
            return new EntityDiggingFX(lllllllllllllIlIIllllIIIlllIllII, lllllllllllllIlIIllllIIIlllIlIll, lllllllllllllIlIIllllIIIllllIIlI, lllllllllllllIlIIllllIIIllllIIIl, lllllllllllllIlIIllllIIIlllIlIII, lllllllllllllIlIIllllIIIlllIIlll, lllllllllllllIlIIllllIIIlllIlllI, Block.getStateById(lllllllllllllIlIIllllIIIlllIllIl[Factory.lIIIIIlIIllIIl[0]])).func_174845_l();
        }
        
        private static void lIllIlIllllIlll() {
            (lIIIIIlIIllIIl = new int[1])[0] = ((0x46 ^ 0x11) & ~(0xE7 ^ 0xB0));
        }
        
        static {
            lIllIlIllllIlll();
        }
    }
}
