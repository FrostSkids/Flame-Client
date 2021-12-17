// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.World;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;

public class EntityFootStepFX extends EntityFX
{
    private /* synthetic */ int footstepMaxAge;
    private /* synthetic */ int footstepAge;
    private /* synthetic */ TextureManager currentFootSteps;
    private static final /* synthetic */ String[] lIlIlIIlIllIII;
    private static final /* synthetic */ int[] lIlIlIIlIllIIl;
    private static final /* synthetic */ ResourceLocation FOOTPRINT_TEXTURE;
    
    private static void lllIllIIlIlIlll() {
        (lIlIlIIlIllIII = new String[EntityFootStepFX.lIlIlIIlIllIIl[5]])[EntityFootStepFX.lIlIlIIlIllIIl[0]] = lllIllIIlIlIllI("HCwSDSMaLBlWJgk7HhA1BCxFHzkHPRoLPwY9RAk4Dw==", "hIjyV");
    }
    
    private static boolean lllIllIIllIIIIl(final int lllllllllllllIIIlIlIIIIllIlIIIlI, final int lllllllllllllIIIlIlIIIIllIlIIIIl) {
        return lllllllllllllIIIlIlIIIIllIlIIIlI < lllllllllllllIIIlIlIIIIllIlIIIIl;
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIlIlIIIIlllIIllIl, final Entity lllllllllllllIIIlIlIIIIlllIlllII, final float lllllllllllllIIIlIlIIIIlllIllIll, final float lllllllllllllIIIlIlIIIIlllIllIlI, final float lllllllllllllIIIlIlIIIIlllIllIIl, final float lllllllllllllIIIlIlIIIIlllIllIII, final float lllllllllllllIIIlIlIIIIlllIlIlll, final float lllllllllllllIIIlIlIIIIlllIlIllI) {
        float lllllllllllllIIIlIlIIIIlllIlIlIl = (this.footstepAge + lllllllllllllIIIlIlIIIIlllIllIll) / this.footstepMaxAge;
        lllllllllllllIIIlIlIIIIlllIlIlIl *= lllllllllllllIIIlIlIIIIlllIlIlIl;
        float lllllllllllllIIIlIlIIIIlllIlIlII = 2.0f - lllllllllllllIIIlIlIIIIlllIlIlIl * 2.0f;
        if (lllIllIIlIlllll(lllIllIIlIlllIl(lllllllllllllIIIlIlIIIIlllIlIlII, 1.0f))) {
            lllllllllllllIIIlIlIIIIlllIlIlII = 1.0f;
        }
        lllllllllllllIIIlIlIIIIlllIlIlII *= 0.2f;
        GlStateManager.disableLighting();
        final float lllllllllllllIIIlIlIIIIlllIlIIll = 0.125f;
        final float lllllllllllllIIIlIlIIIIlllIlIIlI = (float)(this.posX - EntityFootStepFX.interpPosX);
        final float lllllllllllllIIIlIlIIIIlllIlIIIl = (float)(this.posY - EntityFootStepFX.interpPosY);
        final float lllllllllllllIIIlIlIIIIlllIlIIII = (float)(this.posZ - EntityFootStepFX.interpPosZ);
        final float lllllllllllllIIIlIlIIIIlllIIllll = this.worldObj.getLightBrightness(new BlockPos(this));
        this.currentFootSteps.bindTexture(EntityFootStepFX.FOOTPRINT_TEXTURE);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(EntityFootStepFX.lIlIlIIlIllIIl[2], EntityFootStepFX.lIlIlIIlIllIIl[3]);
        lllllllllllllIIIlIlIIIIlllIIllIl.begin(EntityFootStepFX.lIlIlIIlIllIIl[4], DefaultVertexFormats.POSITION_TEX_COLOR);
        lllllllllllllIIIlIlIIIIlllIIllIl.pos(lllllllllllllIIIlIlIIIIlllIlIIlI - 0.125f, lllllllllllllIIIlIlIIIIlllIlIIIl, lllllllllllllIIIlIlIIIIlllIlIIII + 0.125f).tex(0.0, 1.0).color(lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIlIlII).endVertex();
        lllllllllllllIIIlIlIIIIlllIIllIl.pos(lllllllllllllIIIlIlIIIIlllIlIIlI + 0.125f, lllllllllllllIIIlIlIIIIlllIlIIIl, lllllllllllllIIIlIlIIIIlllIlIIII + 0.125f).tex(1.0, 1.0).color(lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIlIlII).endVertex();
        lllllllllllllIIIlIlIIIIlllIIllIl.pos(lllllllllllllIIIlIlIIIIlllIlIIlI + 0.125f, lllllllllllllIIIlIlIIIIlllIlIIIl, lllllllllllllIIIlIlIIIIlllIlIIII - 0.125f).tex(1.0, 0.0).color(lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIlIlII).endVertex();
        lllllllllllllIIIlIlIIIIlllIIllIl.pos(lllllllllllllIIIlIlIIIIlllIlIIlI - 0.125f, lllllllllllllIIIlIlIIIIlllIlIIIl, lllllllllllllIIIlIlIIIIlllIlIIII - 0.125f).tex(0.0, 0.0).color(lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIIllll, lllllllllllllIIIlIlIIIIlllIlIlII).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
    }
    
    protected EntityFootStepFX(final TextureManager lllllllllllllIIIlIlIIIIllllIllIl, final World lllllllllllllIIIlIlIIIIllllIllII, final double lllllllllllllIIIlIlIIIIlllllIIIl, final double lllllllllllllIIIlIlIIIIllllIlIlI, final double lllllllllllllIIIlIlIIIIllllIllll) {
        super(lllllllllllllIIIlIlIIIIllllIllII, lllllllllllllIIIlIlIIIIlllllIIIl, lllllllllllllIIIlIlIIIIllllIlIlI, lllllllllllllIIIlIlIIIIllllIllll, 0.0, 0.0, 0.0);
        this.currentFootSteps = lllllllllllllIIIlIlIIIIllllIllIl;
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        this.footstepMaxAge = EntityFootStepFX.lIlIlIIlIllIIl[1];
    }
    
    private static boolean lllIllIIlIlllll(final int lllllllllllllIIIlIlIIIIllIIlllll) {
        return lllllllllllllIIIlIlIIIIllIIlllll > 0;
    }
    
    private static int lllIllIIlIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lllIllIIlIlIllI(String lllllllllllllIIIlIlIIIIllIllIIIl, final String lllllllllllllIIIlIlIIIIllIllIIII) {
        lllllllllllllIIIlIlIIIIllIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIIllIllIlII = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIIllIllIIll = lllllllllllllIIIlIlIIIIllIllIIII.toCharArray();
        int lllllllllllllIIIlIlIIIIllIllIIlI = EntityFootStepFX.lIlIlIIlIllIIl[0];
        final double lllllllllllllIIIlIlIIIIllIlIllII = (Object)lllllllllllllIIIlIlIIIIllIllIIIl.toCharArray();
        final String lllllllllllllIIIlIlIIIIllIlIlIll = (String)lllllllllllllIIIlIlIIIIllIlIllII.length;
        double lllllllllllllIIIlIlIIIIllIlIlIlI = EntityFootStepFX.lIlIlIIlIllIIl[0];
        while (lllIllIIllIIIIl((int)lllllllllllllIIIlIlIIIIllIlIlIlI, (int)lllllllllllllIIIlIlIIIIllIlIlIll)) {
            final char lllllllllllllIIIlIlIIIIllIllIlll = lllllllllllllIIIlIlIIIIllIlIllII[lllllllllllllIIIlIlIIIIllIlIlIlI];
            lllllllllllllIIIlIlIIIIllIllIlII.append((char)(lllllllllllllIIIlIlIIIIllIllIlll ^ lllllllllllllIIIlIlIIIIllIllIIll[lllllllllllllIIIlIlIIIIllIllIIlI % lllllllllllllIIIlIlIIIIllIllIIll.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIIllIllIIlI;
            ++lllllllllllllIIIlIlIIIIllIlIlIlI;
            "".length();
            if ("   ".length() == ((0x47 ^ 0x3) & ~(0x9 ^ 0x4D))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIIllIllIlII);
    }
    
    private static void lllIllIIlIlllII() {
        (lIlIlIIlIllIIl = new int[7])[0] = ((0xAE ^ 0x8B) & ~(0xA0 ^ 0x85));
        EntityFootStepFX.lIlIlIIlIllIIl[1] = (0x7 ^ 0x24) + (63 + 68 - 87 + 153) - (61 + 108 - 54 + 69) + (135 + 0 - 121 + 138);
        EntityFootStepFX.lIlIlIIlIllIIl[2] = (0xFFFFD7D2 & 0x2B2F);
        EntityFootStepFX.lIlIlIIlIllIIl[3] = (-(0xFFFFD67D & 0x79BB) & (0xFFFFD33B & 0x7FFF));
        EntityFootStepFX.lIlIlIIlIllIIl[4] = (0x31 ^ 0x27 ^ (0x86 ^ 0x97));
        EntityFootStepFX.lIlIlIIlIllIIl[5] = " ".length();
        EntityFootStepFX.lIlIlIIlIllIIl[6] = "   ".length();
    }
    
    @Override
    public int getFXLayer() {
        return EntityFootStepFX.lIlIlIIlIllIIl[6];
    }
    
    static {
        lllIllIIlIlllII();
        lllIllIIlIlIlll();
        FOOTPRINT_TEXTURE = new ResourceLocation(EntityFootStepFX.lIlIlIIlIllIII[EntityFootStepFX.lIlIlIIlIllIIl[0]]);
    }
    
    private static boolean lllIllIIllIIIII(final int lllllllllllllIIIlIlIIIIllIlIIllI, final int lllllllllllllIIIlIlIIIIllIlIIlIl) {
        return lllllllllllllIIIlIlIIIIllIlIIllI == lllllllllllllIIIlIlIIIIllIlIIlIl;
    }
    
    @Override
    public void onUpdate() {
        this.footstepAge += EntityFootStepFX.lIlIlIIlIllIIl[5];
        if (lllIllIIllIIIII(this.footstepAge, this.footstepMaxAge)) {
            this.setDead();
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllIllIIIIllIlIIll, final World llllllllllllIlIllIllIIIIllIIlIlI, final double llllllllllllIlIllIllIIIIllIIlIIl, final double llllllllllllIlIllIllIIIIllIIlIII, final double llllllllllllIlIllIllIIIIllIIllll, final double llllllllllllIlIllIllIIIIllIIlllI, final double llllllllllllIlIllIllIIIIllIIllIl, final double llllllllllllIlIllIllIIIIllIIllII, final int... llllllllllllIlIllIllIIIIllIIlIll) {
            return new EntityFootStepFX(Minecraft.getMinecraft().getTextureManager(), llllllllllllIlIllIllIIIIllIIlIlI, llllllllllllIlIllIllIIIIllIIlIIl, llllllllllllIlIllIllIIIIllIIlIII, llllllllllllIlIllIllIIIIllIIllll);
        }
    }
}
