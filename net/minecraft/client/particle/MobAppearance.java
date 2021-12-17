// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.EntityLivingBase;

public class MobAppearance extends EntityFX
{
    private static final /* synthetic */ int[] llllIIIllllII;
    private /* synthetic */ EntityLivingBase entity;
    
    @Override
    public int getFXLayer() {
        return MobAppearance.llllIIIllllII[1];
    }
    
    private static boolean lIlIlIIIIIIlIlI(final Object lllllllllllllIlIlllIlIlIlIIlllII) {
        return lllllllllllllIlIlllIlIlIlIIlllII != null;
    }
    
    static {
        lIlIlIIIIIIlIII();
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIlIlllIlIlIlIllIIlI, final Entity lllllllllllllIlIlllIlIlIlIlIIlII, final float lllllllllllllIlIlllIlIlIlIlIIIll, final float lllllllllllllIlIlllIlIlIlIlIllll, final float lllllllllllllIlIlllIlIlIlIlIlllI, final float lllllllllllllIlIlllIlIlIlIlIllIl, final float lllllllllllllIlIlllIlIlIlIlIllII, final float lllllllllllllIlIlllIlIlIlIlIlIll) {
        if (lIlIlIIIIIIlIlI(this.entity)) {
            final RenderManager lllllllllllllIlIlllIlIlIlIlIlIlI = Minecraft.getMinecraft().getRenderManager();
            lllllllllllllIlIlllIlIlIlIlIlIlI.setRenderPosition(EntityFX.interpPosX, EntityFX.interpPosY, EntityFX.interpPosZ);
            final float lllllllllllllIlIlllIlIlIlIlIlIIl = 0.42553192f;
            final float lllllllllllllIlIlllIlIlIlIlIlIII = (this.particleAge + lllllllllllllIlIlllIlIlIlIlIIIll) / this.particleMaxAge;
            GlStateManager.depthMask((boolean)(MobAppearance.llllIIIllllII[2] != 0));
            GlStateManager.enableBlend();
            GlStateManager.enableDepth();
            GlStateManager.blendFunc(MobAppearance.llllIIIllllII[3], MobAppearance.llllIIIllllII[4]);
            final float lllllllllllllIlIlllIlIlIlIlIIlll = 240.0f;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIlIlllIlIlIlIlIIlll, lllllllllllllIlIlllIlIlIlIlIIlll);
            GlStateManager.pushMatrix();
            final float lllllllllllllIlIlllIlIlIlIlIIllI = 0.05f + 0.5f * MathHelper.sin(lllllllllllllIlIlllIlIlIlIlIlIII * 3.1415927f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, lllllllllllllIlIlllIlIlIlIlIIllI);
            GlStateManager.translate(0.0f, 1.8f, 0.0f);
            GlStateManager.rotate(180.0f - lllllllllllllIlIlllIlIlIlIlIIlII.rotationYaw, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(60.0f - 150.0f * lllllllllllllIlIlllIlIlIlIlIlIII - lllllllllllllIlIlllIlIlIlIlIIlII.rotationPitch, 1.0f, 0.0f, 0.0f);
            GlStateManager.translate(0.0f, -0.4f, -1.5f);
            GlStateManager.scale(lllllllllllllIlIlllIlIlIlIlIlIIl, lllllllllllllIlIlllIlIlIlIlIlIIl, lllllllllllllIlIlllIlIlIlIlIlIIl);
            final EntityLivingBase entity = this.entity;
            final EntityLivingBase entity2 = this.entity;
            final float n = 0.0f;
            entity2.prevRotationYaw = n;
            entity.rotationYaw = n;
            final EntityLivingBase entity3 = this.entity;
            final EntityLivingBase entity4 = this.entity;
            final float n2 = 0.0f;
            entity4.prevRotationYawHead = n2;
            entity3.rotationYawHead = n2;
            lllllllllllllIlIlllIlIlIlIlIlIlI.renderEntityWithPosYaw(this.entity, 0.0, 0.0, 0.0, 0.0f, lllllllllllllIlIlllIlIlIlIlIIIll);
            "".length();
            GlStateManager.popMatrix();
            GlStateManager.enableDepth();
        }
    }
    
    private static void lIlIlIIIIIIlIII() {
        (llllIIIllllII = new int[5])[0] = (0xF2 ^ 0x89 ^ (0xF0 ^ 0x95));
        MobAppearance.llllIIIllllII[1] = "   ".length();
        MobAppearance.llllIIIllllII[2] = " ".length();
        MobAppearance.llllIIIllllII[3] = (-(0xFFFFFA5E & 0x35FF) & (0xFFFFBF7F & 0x73DF));
        MobAppearance.llllIIIllllII[4] = (0xFFFF8F3F & 0x73C3);
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIlIlIIIIIIlIIl(this.entity)) {
            final EntityGuardian lllllllllllllIlIlllIlIlIlIlllllI = new EntityGuardian(this.worldObj);
            lllllllllllllIlIlllIlIlIlIlllllI.setElder();
            this.entity = lllllllllllllIlIlllIlIlIlIlllllI;
        }
    }
    
    protected MobAppearance(final World lllllllllllllIlIlllIlIlIllIIlIll, final double lllllllllllllIlIlllIlIlIllIIlIlI, final double lllllllllllllIlIlllIlIlIllIIIlII, final double lllllllllllllIlIlllIlIlIllIIlIII) {
        super(lllllllllllllIlIlllIlIlIllIIlIll, lllllllllllllIlIlllIlIlIllIIlIlI, lllllllllllllIlIlllIlIlIllIIIlII, lllllllllllllIlIlllIlIlIllIIlIII, 0.0, 0.0, 0.0);
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        this.particleGravity = 0.0f;
        this.particleMaxAge = MobAppearance.llllIIIllllII[0];
    }
    
    private static boolean lIlIlIIIIIIlIIl(final Object lllllllllllllIlIlllIlIlIlIIllIlI) {
        return lllllllllllllIlIlllIlIlIlIIllIlI == null;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIlIIIlllIlIllIIlIll, final World lllllllllllllIlIIIlllIlIllIIlIlI, final double lllllllllllllIlIIIlllIlIllIIIIIl, final double lllllllllllllIlIIIlllIlIllIIlIII, final double lllllllllllllIlIIIlllIlIllIIIlll, final double lllllllllllllIlIIIlllIlIllIIIllI, final double lllllllllllllIlIIIlllIlIllIIIlIl, final double lllllllllllllIlIIIlllIlIllIIIlII, final int... lllllllllllllIlIIIlllIlIllIIIIll) {
            return new MobAppearance(lllllllllllllIlIIIlllIlIllIIlIlI, lllllllllllllIlIIIlllIlIllIIIIIl, lllllllllllllIlIIIlllIlIllIIlIII, lllllllllllllIlIIIlllIlIllIIIlll);
        }
    }
}
