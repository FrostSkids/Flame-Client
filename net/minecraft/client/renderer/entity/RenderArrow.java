// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.projectile.EntityArrow;

public class RenderArrow extends Render<EntityArrow>
{
    private static final /* synthetic */ int[] llIlIllIIIIIlI;
    private static final /* synthetic */ String[] llIlIllIIIIIIl;
    private static final /* synthetic */ ResourceLocation arrowTextures;
    
    static {
        lIIlIlIIllIllIlI();
        lIIlIlIIllIllIIl();
        arrowTextures = new ResourceLocation(RenderArrow.llIlIllIIIIIIl[RenderArrow.llIlIllIIIIIlI[0]]);
    }
    
    private static boolean lIIlIlIIllIlllII(final int llllllllllllIllIlIIllllIIlIllIll) {
        return llllllllllllIllIlIIllllIIlIllIll > 0;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityArrow llllllllllllIllIlIIllllIlIIIIIII) {
        return RenderArrow.arrowTextures;
    }
    
    public RenderArrow(final RenderManager llllllllllllIllIlIIllllIllIIIIlI) {
        super(llllllllllllIllIlIIllllIllIIIIlI);
    }
    
    private static boolean lIIlIlIIllIlllIl(final int llllllllllllIllIlIIllllIIlIllllI, final int llllllllllllIllIlIIllllIIlIlllIl) {
        return llllllllllllIllIlIIllllIIlIllllI >= llllllllllllIllIlIIllllIIlIlllIl;
    }
    
    private static void lIIlIlIIllIllIlI() {
        (llIlIllIIIIIlI = new int[8])[0] = ((0xC3 ^ 0xC6) & ~(0xA4 ^ 0xA1));
        RenderArrow.llIlIllIIIIIlI[1] = (0x89 ^ 0x83);
        RenderArrow.llIlIllIIIIIlI[2] = (0x2C ^ 0x29);
        RenderArrow.llIlIllIIIIIlI[3] = (0x39 ^ 0x7B ^ (0x6B ^ 0x2E));
        RenderArrow.llIlIllIIIIIlI[4] = (0x39 ^ 0x3D);
        RenderArrow.llIlIllIIIIIlI[5] = " ".length();
        RenderArrow.llIlIllIIIIIlI[6] = (0x78 ^ 0x70);
        RenderArrow.llIlIllIIIIIlI[7] = "  ".length();
    }
    
    private static String lIIlIlIIllIllIII(final String llllllllllllIllIlIIllllIIllIIlII, final String llllllllllllIllIlIIllllIIllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllllIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllllIIllIIIll.getBytes(StandardCharsets.UTF_8)), RenderArrow.llIlIllIIIIIlI[6]), "DES");
            final Cipher llllllllllllIllIlIIllllIIllIlIII = Cipher.getInstance("DES");
            llllllllllllIllIlIIllllIIllIlIII.init(RenderArrow.llIlIllIIIIIlI[7], llllllllllllIllIlIIllllIIllIlIIl);
            return new String(llllllllllllIllIlIIllllIIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllllIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllllIIllIIlll) {
            llllllllllllIllIlIIllllIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void doRender(final EntityArrow llllllllllllIllIlIIllllIlIIlIlIl, final double llllllllllllIllIlIIllllIlIIlIlII, final double llllllllllllIllIlIIllllIlIlIlIIl, final double llllllllllllIllIlIIllllIlIlIlIII, final float llllllllllllIllIlIIllllIlIIlIIIl, final float llllllllllllIllIlIIllllIlIIlIIII) {
        this.bindEntityTexture(llllllllllllIllIlIIllllIlIIlIlIl);
        "".length();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIllIlIIllllIlIIlIlII, (float)llllllllllllIllIlIIllllIlIlIlIIl, (float)llllllllllllIllIlIIllllIlIlIlIII);
        GlStateManager.rotate(llllllllllllIllIlIIllllIlIIlIlIl.prevRotationYaw + (llllllllllllIllIlIIllllIlIIlIlIl.rotationYaw - llllllllllllIllIlIIllllIlIIlIlIl.prevRotationYaw) * llllllllllllIllIlIIllllIlIIlIIII - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(llllllllllllIllIlIIllllIlIIlIlIl.prevRotationPitch + (llllllllllllIllIlIIllllIlIIlIlIl.rotationPitch - llllllllllllIllIlIIllllIlIIlIlIl.prevRotationPitch) * llllllllllllIllIlIIllllIlIIlIIII, 0.0f, 0.0f, 1.0f);
        final Tessellator llllllllllllIllIlIIllllIlIlIIlIl = Tessellator.getInstance();
        final WorldRenderer llllllllllllIllIlIIllllIlIlIIlII = llllllllllllIllIlIIllllIlIlIIlIl.getWorldRenderer();
        final int llllllllllllIllIlIIllllIlIlIIIll = RenderArrow.llIlIllIIIIIlI[0];
        final float llllllllllllIllIlIIllllIlIlIIIlI = 0.0f;
        final float llllllllllllIllIlIIllllIlIlIIIIl = 0.5f;
        final float llllllllllllIllIlIIllllIlIlIIIII = (RenderArrow.llIlIllIIIIIlI[0] + llllllllllllIllIlIIllllIlIlIIIll * RenderArrow.llIlIllIIIIIlI[1]) / 32.0f;
        final float llllllllllllIllIlIIllllIlIIlllll = (RenderArrow.llIlIllIIIIIlI[2] + llllllllllllIllIlIIllllIlIlIIIll * RenderArrow.llIlIllIIIIIlI[1]) / 32.0f;
        final float llllllllllllIllIlIIllllIlIIllllI = 0.0f;
        final float llllllllllllIllIlIIllllIlIIlllIl = 0.15625f;
        final float llllllllllllIllIlIIllllIlIIlllII = (RenderArrow.llIlIllIIIIIlI[2] + llllllllllllIllIlIIllllIlIlIIIll * RenderArrow.llIlIllIIIIIlI[1]) / 32.0f;
        final float llllllllllllIllIlIIllllIlIIllIll = (RenderArrow.llIlIllIIIIIlI[1] + llllllllllllIllIlIIllllIlIlIIIll * RenderArrow.llIlIllIIIIIlI[1]) / 32.0f;
        final float llllllllllllIllIlIIllllIlIIllIlI = 0.05625f;
        GlStateManager.enableRescaleNormal();
        final float llllllllllllIllIlIIllllIlIIllIIl = llllllllllllIllIlIIllllIlIIlIlIl.arrowShake - llllllllllllIllIlIIllllIlIIlIIII;
        if (lIIlIlIIllIlllII(lIIlIlIIllIllIll(llllllllllllIllIlIIllllIlIIllIIl, 0.0f))) {
            final float llllllllllllIllIlIIllllIlIIllIII = -MathHelper.sin(llllllllllllIllIlIIllllIlIIllIIl * 3.0f) * llllllllllllIllIlIIllllIlIIllIIl;
            GlStateManager.rotate(llllllllllllIllIlIIllllIlIIllIII, 0.0f, 0.0f, 1.0f);
        }
        GlStateManager.rotate(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(llllllllllllIllIlIIllllIlIIllIlI, llllllllllllIllIlIIllllIlIIllIlI, llllllllllllIllIlIIllllIlIIllIlI);
        GlStateManager.translate(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f(llllllllllllIllIlIIllllIlIIllIlI, 0.0f, 0.0f);
        llllllllllllIllIlIIllllIlIlIIlII.begin(RenderArrow.llIlIllIIIIIlI[3], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, -2.0, -2.0).tex(llllllllllllIllIlIIllllIlIIllllI, llllllllllllIllIlIIllllIlIIlllII).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, -2.0, 2.0).tex(llllllllllllIllIlIIllllIlIIlllIl, llllllllllllIllIlIIllllIlIIlllII).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, 2.0, 2.0).tex(llllllllllllIllIlIIllllIlIIlllIl, llllllllllllIllIlIIllllIlIIllIll).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, 2.0, -2.0).tex(llllllllllllIllIlIIllllIlIIllllI, llllllllllllIllIlIIllllIlIIllIll).endVertex();
        llllllllllllIllIlIIllllIlIlIIlIl.draw();
        GL11.glNormal3f(-llllllllllllIllIlIIllllIlIIllIlI, 0.0f, 0.0f);
        llllllllllllIllIlIIllllIlIlIIlII.begin(RenderArrow.llIlIllIIIIIlI[3], DefaultVertexFormats.POSITION_TEX);
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, 2.0, -2.0).tex(llllllllllllIllIlIIllllIlIIllllI, llllllllllllIllIlIIllllIlIIlllII).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, 2.0, 2.0).tex(llllllllllllIllIlIIllllIlIIlllIl, llllllllllllIllIlIIllllIlIIlllII).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, -2.0, 2.0).tex(llllllllllllIllIlIIllllIlIIlllIl, llllllllllllIllIlIIllllIlIIllIll).endVertex();
        llllllllllllIllIlIIllllIlIlIIlII.pos(-7.0, -2.0, -2.0).tex(llllllllllllIllIlIIllllIlIIllllI, llllllllllllIllIlIIllllIlIIllIll).endVertex();
        llllllllllllIllIlIIllllIlIlIIlIl.draw();
        int llllllllllllIllIlIIllllIlIIlIlll = RenderArrow.llIlIllIIIIIlI[0];
        "".length();
        if (" ".length() >= (160 + 102 - 113 + 30 ^ 14 + 133 + 13 + 23)) {
            return;
        }
        while (!lIIlIlIIllIlllIl(llllllllllllIllIlIIllllIlIIlIlll, RenderArrow.llIlIllIIIIIlI[4])) {
            GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f(0.0f, 0.0f, llllllllllllIllIlIIllllIlIIllIlI);
            llllllllllllIllIlIIllllIlIlIIlII.begin(RenderArrow.llIlIllIIIIIlI[3], DefaultVertexFormats.POSITION_TEX);
            llllllllllllIllIlIIllllIlIlIIlII.pos(-8.0, -2.0, 0.0).tex(llllllllllllIllIlIIllllIlIlIIIlI, llllllllllllIllIlIIllllIlIlIIIII).endVertex();
            llllllllllllIllIlIIllllIlIlIIlII.pos(8.0, -2.0, 0.0).tex(llllllllllllIllIlIIllllIlIlIIIIl, llllllllllllIllIlIIllllIlIlIIIII).endVertex();
            llllllllllllIllIlIIllllIlIlIIlII.pos(8.0, 2.0, 0.0).tex(llllllllllllIllIlIIllllIlIlIIIIl, llllllllllllIllIlIIllllIlIIlllll).endVertex();
            llllllllllllIllIlIIllllIlIlIIlII.pos(-8.0, 2.0, 0.0).tex(llllllllllllIllIlIIllllIlIlIIIlI, llllllllllllIllIlIIllllIlIIlllll).endVertex();
            llllllllllllIllIlIIllllIlIlIIlIl.draw();
            ++llllllllllllIllIlIIllllIlIIlIlll;
        }
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIllIlIIllllIlIIlIlIl, llllllllllllIllIlIIllllIlIIlIlII, llllllllllllIllIlIIllllIlIlIlIIl, llllllllllllIllIlIIllllIlIlIlIII, llllllllllllIllIlIIllllIlIIlIIIl, llllllllllllIllIlIIllllIlIIlIIII);
    }
    
    private static int lIIlIlIIllIllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIlIlIIllIllIIl() {
        (llIlIllIIIIIIl = new String[RenderArrow.llIlIllIIIIIlI[5]])[RenderArrow.llIlIllIIIIIlI[0]] = lIIlIlIIllIllIII("HHUPy/073IuXbkT+DPpqyJcWDnt4EHLBxHOnIFmXMKU=", "aLNei");
    }
}
