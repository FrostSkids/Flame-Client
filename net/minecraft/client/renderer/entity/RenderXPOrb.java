// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityXPOrb;

public class RenderXPOrb extends Render<EntityXPOrb>
{
    private static final /* synthetic */ ResourceLocation experienceOrbTextures;
    private static final /* synthetic */ int[] lIlIlIIllIIIIl;
    private static final /* synthetic */ String[] lIlIlIIllIIIII;
    
    @Override
    public void doRender(final EntityXPOrb lllllllllllllIIIlIIllIIIlIlIIIlI, final double lllllllllllllIIIlIIllIIIlIlIIIII, final double lllllllllllllIIIlIIllIIIllIIlllI, final double lllllllllllllIIIlIIllIIIlIIlllII, final float lllllllllllllIIIlIIllIIIllIIlIlI, final float lllllllllllllIIIlIIllIIIllIIlIII) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIIlIIllIIIlIlIIIII, (float)lllllllllllllIIIlIIllIIIllIIlllI, (float)lllllllllllllIIIlIIllIIIlIIlllII);
        this.bindEntityTexture(lllllllllllllIIIlIIllIIIlIlIIIlI);
        "".length();
        final int lllllllllllllIIIlIIllIIIllIIIllI = lllllllllllllIIIlIIllIIIlIlIIIlI.getTextureByXP();
        final float lllllllllllllIIIlIIllIIIllIIIlII = (lllllllllllllIIIlIIllIIIllIIIllI % RenderXPOrb.lIlIlIIllIIIIl[1] * RenderXPOrb.lIlIlIIllIIIIl[2] + RenderXPOrb.lIlIlIIllIIIIl[0]) / 64.0f;
        final float lllllllllllllIIIlIIllIIIllIIIIlI = (lllllllllllllIIIlIIllIIIllIIIllI % RenderXPOrb.lIlIlIIllIIIIl[1] * RenderXPOrb.lIlIlIIllIIIIl[2] + RenderXPOrb.lIlIlIIllIIIIl[2]) / 64.0f;
        final float lllllllllllllIIIlIIllIIIllIIIIII = (lllllllllllllIIIlIIllIIIllIIIllI / RenderXPOrb.lIlIlIIllIIIIl[1] * RenderXPOrb.lIlIlIIllIIIIl[2] + RenderXPOrb.lIlIlIIllIIIIl[0]) / 64.0f;
        final float lllllllllllllIIIlIIllIIIlIlllllI = (lllllllllllllIIIlIIllIIIllIIIllI / RenderXPOrb.lIlIlIIllIIIIl[1] * RenderXPOrb.lIlIlIIllIIIIl[2] + RenderXPOrb.lIlIlIIllIIIIl[2]) / 64.0f;
        final float lllllllllllllIIIlIIllIIIlIllllII = 1.0f;
        final float lllllllllllllIIIlIIllIIIlIlllIlI = 0.5f;
        final float lllllllllllllIIIlIIllIIIlIlllIII = 0.25f;
        final int lllllllllllllIIIlIIllIIIlIllIllI = lllllllllllllIIIlIIllIIIlIlIIIlI.getBrightnessForRender(lllllllllllllIIIlIIllIIIllIIlIII);
        final int lllllllllllllIIIlIIllIIIlIllIlII = lllllllllllllIIIlIIllIIIlIllIllI % RenderXPOrb.lIlIlIIllIIIIl[3];
        int lllllllllllllIIIlIIllIIIlIllIIll = lllllllllllllIIIlIIllIIIlIllIllI / RenderXPOrb.lIlIlIIllIIIIl[3];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIIIlIIllIIIlIllIlII / 1.0f, lllllllllllllIIIlIIllIIIlIllIIll / 1.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final float lllllllllllllIIIlIIllIIIlIllIIIl = 255.0f;
        final float lllllllllllllIIIlIIllIIIlIlIllll = (lllllllllllllIIIlIIllIIIlIlIIIlI.xpColor + lllllllllllllIIIlIIllIIIllIIlIII) / 2.0f;
        lllllllllllllIIIlIIllIIIlIllIIll = (int)((MathHelper.sin(lllllllllllllIIIlIIllIIIlIlIllll + 0.0f) + 1.0f) * 0.5f * 255.0f);
        final int lllllllllllllIIIlIIllIIIlIlIllIl = RenderXPOrb.lIlIlIIllIIIIl[4];
        final int lllllllllllllIIIlIIllIIIlIlIllII = (int)((MathHelper.sin(lllllllllllllIIIlIIllIIIlIlIllll + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        GlStateManager.rotate(180.0f - this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        final float lllllllllllllIIIlIIllIIIlIlIlIlI = 0.3f;
        GlStateManager.scale(0.3f, 0.3f, 0.3f);
        final Tessellator lllllllllllllIIIlIIllIIIlIlIlIII = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIlIIllIIIlIlIIllI = lllllllllllllIIIlIIllIIIlIlIlIII.getWorldRenderer();
        lllllllllllllIIIlIIllIIIlIlIIllI.begin(RenderXPOrb.lIlIlIIllIIIIl[5], DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
        lllllllllllllIIIlIIllIIIlIlIIllI.pos(0.0f - lllllllllllllIIIlIIllIIIlIlllIlI, 0.0f - lllllllllllllIIIlIIllIIIlIlllIII, 0.0).tex(lllllllllllllIIIlIIllIIIllIIIlII, lllllllllllllIIIlIIllIIIlIlllllI).color(lllllllllllllIIIlIIllIIIlIllIIll, RenderXPOrb.lIlIlIIllIIIIl[4], lllllllllllllIIIlIIllIIIlIlIllII, RenderXPOrb.lIlIlIIllIIIIl[6]).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIlIIllIIIlIlIIllI.pos(lllllllllllllIIIlIIllIIIlIllllII - lllllllllllllIIIlIIllIIIlIlllIlI, 0.0f - lllllllllllllIIIlIIllIIIlIlllIII, 0.0).tex(lllllllllllllIIIlIIllIIIllIIIIlI, lllllllllllllIIIlIIllIIIlIlllllI).color(lllllllllllllIIIlIIllIIIlIllIIll, RenderXPOrb.lIlIlIIllIIIIl[4], lllllllllllllIIIlIIllIIIlIlIllII, RenderXPOrb.lIlIlIIllIIIIl[6]).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIlIIllIIIlIlIIllI.pos(lllllllllllllIIIlIIllIIIlIllllII - lllllllllllllIIIlIIllIIIlIlllIlI, 1.0f - lllllllllllllIIIlIIllIIIlIlllIII, 0.0).tex(lllllllllllllIIIlIIllIIIllIIIIlI, lllllllllllllIIIlIIllIIIllIIIIII).color(lllllllllllllIIIlIIllIIIlIllIIll, RenderXPOrb.lIlIlIIllIIIIl[4], lllllllllllllIIIlIIllIIIlIlIllII, RenderXPOrb.lIlIlIIllIIIIl[6]).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIlIIllIIIlIlIIllI.pos(0.0f - lllllllllllllIIIlIIllIIIlIlllIlI, 1.0f - lllllllllllllIIIlIIllIIIlIlllIII, 0.0).tex(lllllllllllllIIIlIIllIIIllIIIlII, lllllllllllllIIIlIIllIIIllIIIIII).color(lllllllllllllIIIlIIllIIIlIllIIll, RenderXPOrb.lIlIlIIllIIIIl[4], lllllllllllllIIIlIIllIIIlIlIllII, RenderXPOrb.lIlIlIIllIIIIl[6]).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIlIIllIIIlIlIlIII.draw();
        GlStateManager.disableBlend();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIIIlIIllIIIlIlIIIlI, lllllllllllllIIIlIIllIIIlIlIIIII, lllllllllllllIIIlIIllIIIllIIlllI, lllllllllllllIIIlIIllIIIlIIlllII, lllllllllllllIIIlIIllIIIllIIlIlI, lllllllllllllIIIlIIllIIIllIIlIII);
    }
    
    static {
        lllIllIIllllllI();
        lllIllIIlllllIl();
        experienceOrbTextures = new ResourceLocation(RenderXPOrb.lIlIlIIllIIIII[RenderXPOrb.lIlIlIIllIIIIl[0]]);
    }
    
    private static String lllIllIIlllllII(String lllllllllllllIIIlIIllIIIIIllIIIl, final String lllllllllllllIIIlIIllIIIIIllIIII) {
        lllllllllllllIIIlIIllIIIIIllIIIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIllIIIIIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIllIIIIIllIlII = new StringBuilder();
        final char[] lllllllllllllIIIlIIllIIIIIllIIll = lllllllllllllIIIlIIllIIIIIllIIII.toCharArray();
        int lllllllllllllIIIlIIllIIIIIllIIlI = RenderXPOrb.lIlIlIIllIIIIl[0];
        final long lllllllllllllIIIlIIllIIIIIlIllII = (Object)((String)lllllllllllllIIIlIIllIIIIIllIIIl).toCharArray();
        final short lllllllllllllIIIlIIllIIIIIlIlIlI = (short)lllllllllllllIIIlIIllIIIIIlIllII.length;
        Exception lllllllllllllIIIlIIllIIIIIlIlIIl = (Exception)RenderXPOrb.lIlIlIIllIIIIl[0];
        while (lllIllIIlllllll((int)lllllllllllllIIIlIIllIIIIIlIlIIl, lllllllllllllIIIlIIllIIIIIlIlIlI)) {
            final char lllllllllllllIIIlIIllIIIIIllIlll = lllllllllllllIIIlIIllIIIIIlIllII[lllllllllllllIIIlIIllIIIIIlIlIIl];
            lllllllllllllIIIlIIllIIIIIllIlII.append((char)(lllllllllllllIIIlIIllIIIIIllIlll ^ lllllllllllllIIIlIIllIIIIIllIIll[lllllllllllllIIIlIIllIIIIIllIIlI % lllllllllllllIIIlIIllIIIIIllIIll.length]));
            "".length();
            ++lllllllllllllIIIlIIllIIIIIllIIlI;
            ++lllllllllllllIIIlIIllIIIIIlIlIIl;
            "".length();
            if (((0xA8 ^ 0x84) & ~(0x7A ^ 0x56)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIllIIIIIllIlII);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityXPOrb lllllllllllllIIIlIIllIIIIlllIIIl) {
        return RenderXPOrb.experienceOrbTextures;
    }
    
    private static void lllIllIIlllllIl() {
        (lIlIlIIllIIIII = new String[RenderXPOrb.lIlIlIIllIIIIl[7]])[RenderXPOrb.lIlIlIIllIIIIl[0]] = lllIllIIlllllII("Fz0bJj0RPRB9LQ0sCiYxTD0bIi0RMQY8KwYHDCAqTSgNNQ==", "cXcRH");
    }
    
    public RenderXPOrb(final RenderManager lllllllllllllIIIlIIllIIlIIIIIlII) {
        super(lllllllllllllIIIlIIllIIlIIIIIlII);
        this.shadowSize = 0.15f;
        this.shadowOpaque = 0.75f;
    }
    
    private static void lllIllIIllllllI() {
        (lIlIlIIllIIIIl = new int[8])[0] = ((24 + 96 - 82 + 110 ^ 109 + 32 - 39 + 37) & (0x58 ^ 0x39 ^ (0x79 ^ 0x7) ^ -" ".length()));
        RenderXPOrb.lIlIlIIllIIIIl[1] = (0x51 ^ 0x55);
        RenderXPOrb.lIlIlIIllIIIIl[2] = (96 + 39 - 9 + 60 ^ 153 + 18 - 11 + 10);
        RenderXPOrb.lIlIlIIllIIIIl[3] = (0xFFFFD36D & 0x12C92);
        RenderXPOrb.lIlIlIIllIIIIl[4] = (0xA5 ^ 0x9C) + (0x75 ^ 0x3C) - "   ".length() + (30 + 84 - 88 + 102);
        RenderXPOrb.lIlIlIIllIIIIl[5] = (0x5E ^ 0x59);
        RenderXPOrb.lIlIlIIllIIIIl[6] = (0xFB ^ 0x85) + (0x40 ^ 0x67) - (0xEE ^ 0xBB) + (0x24 ^ 0x14);
        RenderXPOrb.lIlIlIIllIIIIl[7] = " ".length();
    }
    
    private static boolean lllIllIIlllllll(final int lllllllllllllIIIlIIllIIIIIIlllIl, final int lllllllllllllIIIlIIllIIIIIIlllII) {
        return lllllllllllllIIIlIIllIIIIIIlllIl < lllllllllllllIIIlIIllIIIIIIlllII;
    }
}
