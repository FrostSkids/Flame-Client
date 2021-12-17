// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntitySpider;

public class LayerSpiderEyes implements LayerRenderer<EntitySpider>
{
    private static final /* synthetic */ ResourceLocation SPIDER_EYES;
    private static final /* synthetic */ int[] llIIIlIlIllllI;
    private static final /* synthetic */ String[] llIIIlIlIlllIl;
    private final /* synthetic */ RenderSpider spiderRenderer;
    
    @Override
    public void doRenderLayer(final EntitySpider llllllllllllIlllIlIllIIIIlIllIll, final float llllllllllllIlllIlIllIIIIlIllIlI, final float llllllllllllIlllIlIllIIIIlIIllIl, final float llllllllllllIlllIlIllIIIIlIIllII, final float llllllllllllIlllIlIllIIIIlIIlIll, final float llllllllllllIlllIlIllIIIIlIIlIlI, final float llllllllllllIlllIlIllIIIIlIIlIIl, final float llllllllllllIlllIlIllIIIIlIIlIII) {
        this.spiderRenderer.bindTexture(LayerSpiderEyes.SPIDER_EYES);
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.blendFunc(LayerSpiderEyes.llIIIlIlIllllI[1], LayerSpiderEyes.llIIIlIlIllllI[1]);
        if (lIIIlIIllIIIIIlI(llllllllllllIlllIlIllIIIIlIllIll.isInvisible() ? 1 : 0)) {
            GlStateManager.depthMask((boolean)(LayerSpiderEyes.llIIIlIlIllllI[0] != 0));
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            GlStateManager.depthMask((boolean)(LayerSpiderEyes.llIIIlIlIllllI[1] != 0));
        }
        int llllllllllllIlllIlIllIIIIlIlIIll = LayerSpiderEyes.llIIIlIlIllllI[2];
        int llllllllllllIlllIlIllIIIIlIlIIlI = llllllllllllIlllIlIllIIIIlIlIIll % LayerSpiderEyes.llIIIlIlIllllI[3];
        int llllllllllllIlllIlIllIIIIlIlIIIl = llllllllllllIlllIlIllIIIIlIlIIll / LayerSpiderEyes.llIIIlIlIllllI[3];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIlllIlIllIIIIlIlIIlI / 1.0f, llllllllllllIlllIlIllIIIIlIlIIIl / 1.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.spiderRenderer.getMainModel().render(llllllllllllIlllIlIllIIIIlIllIll, llllllllllllIlllIlIllIIIIlIllIlI, llllllllllllIlllIlIllIIIIlIIllIl, llllllllllllIlllIlIllIIIIlIIlIll, llllllllllllIlllIlIllIIIIlIIlIlI, llllllllllllIlllIlIllIIIIlIIlIIl, llllllllllllIlllIlIllIIIIlIIlIII);
        llllllllllllIlllIlIllIIIIlIlIIll = llllllllllllIlllIlIllIIIIlIllIll.getBrightnessForRender(llllllllllllIlllIlIllIIIIlIIllII);
        llllllllllllIlllIlIllIIIIlIlIIlI = llllllllllllIlllIlIllIIIIlIlIIll % LayerSpiderEyes.llIIIlIlIllllI[3];
        llllllllllllIlllIlIllIIIIlIlIIIl = llllllllllllIlllIlIllIIIIlIlIIll / LayerSpiderEyes.llIIIlIlIllllI[3];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIlllIlIllIIIIlIlIIlI / 1.0f, llllllllllllIlllIlIllIIIIlIlIIIl / 1.0f);
        this.spiderRenderer.func_177105_a(llllllllllllIlllIlIllIIIIlIllIll, llllllllllllIlllIlIllIIIIlIIllII);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerSpiderEyes.llIIIlIlIllllI[0] != 0;
    }
    
    private static String lIIIlIIlIllllIIl(final String llllllllllllIlllIlIllIIIIIlIlIlI, final String llllllllllllIlllIlIllIIIIIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIIIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIllIIIIIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIllIIIIIlIllII.init(LayerSpiderEyes.llIIIlIlIllllI[4], llllllllllllIlllIlIllIIIIIlIllIl);
            return new String(llllllllllllIlllIlIllIIIIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIIIIIlIlIll) {
            llllllllllllIlllIlIllIIIIIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIllIIIIIII() {
        (llIIIlIlIlllIl = new String[LayerSpiderEyes.llIIIlIlIllllI[1]])[LayerSpiderEyes.llIIIlIlIllllI[0]] = lIIIlIIlIllllIIl("iVch7x1UyuUBsPirCGTttEc/Shf87InDhEnwQAhqQ/I=", "UpOFZ");
    }
    
    static {
        lIIIlIIllIIIIIIl();
        lIIIlIIllIIIIIII();
        SPIDER_EYES = new ResourceLocation(LayerSpiderEyes.llIIIlIlIlllIl[LayerSpiderEyes.llIIIlIlIllllI[0]]);
    }
    
    private static void lIIIlIIllIIIIIIl() {
        (llIIIlIlIllllI = new int[5])[0] = ((0x74 ^ 0x55) & ~(0xBD ^ 0x9C));
        LayerSpiderEyes.llIIIlIlIllllI[1] = " ".length();
        LayerSpiderEyes.llIIIlIlIllllI[2] = (0xFFFFF1F9 & 0xFEF6);
        LayerSpiderEyes.llIIIlIlIllllI[3] = (0xFFFFCECC & 0x13133);
        LayerSpiderEyes.llIIIlIlIllllI[4] = "  ".length();
    }
    
    public LayerSpiderEyes(final RenderSpider llllllllllllIlllIlIllIIIIllIlIll) {
        this.spiderRenderer = llllllllllllIlllIlIllIIIIllIlIll;
    }
    
    private static boolean lIIIlIIllIIIIIlI(final int llllllllllllIlllIlIllIIIIIlIIIll) {
        return llllllllllllIlllIlIllIIIIIlIIIll != 0;
    }
}
