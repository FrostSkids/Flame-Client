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
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;

public class LayerDeadmau5Head implements LayerRenderer<AbstractClientPlayer>
{
    private final /* synthetic */ RenderPlayer playerRenderer;
    private static final /* synthetic */ int[] llIIllllIIlllI;
    private static final /* synthetic */ String[] llIIllllIIllIl;
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerDeadmau5Head.llIIllllIIlllI[2] != 0;
    }
    
    static {
        lIIlIIIIIIlIIlll();
        lIIlIIIIIIlIIllI();
    }
    
    private static boolean lIIlIIIIIIlIlIIl(final int llllllllllllIllIlllIllIIlllIlIll) {
        return llllllllllllIllIlllIllIIlllIlIll == 0;
    }
    
    private static void lIIlIIIIIIlIIlll() {
        (llIIllllIIlllI = new int[3])[0] = ((0x70 ^ 0x41 ^ (0x4 ^ 0x14)) & (51 + 26 - 24 + 86 ^ 74 + 100 - 120 + 116 ^ -" ".length()));
        LayerDeadmau5Head.llIIllllIIlllI[1] = "  ".length();
        LayerDeadmau5Head.llIIllllIIlllI[2] = " ".length();
    }
    
    private static boolean lIIlIIIIIIlIlIlI(final int llllllllllllIllIlllIllIIllllIIII, final int llllllllllllIllIlllIllIIlllIllll) {
        return llllllllllllIllIlllIllIIllllIIII >= llllllllllllIllIlllIllIIlllIllll;
    }
    
    private static boolean lIIlIIIIIIlIlIII(final int llllllllllllIllIlllIllIIlllIllIl) {
        return llllllllllllIllIlllIllIIlllIllIl != 0;
    }
    
    @Override
    public void doRenderLayer(final AbstractClientPlayer llllllllllllIllIlllIllIlIIIllIII, final float llllllllllllIllIlllIllIlIIlIIlII, final float llllllllllllIllIlllIllIlIIlIIIll, final float llllllllllllIllIlllIllIlIIlIIIlI, final float llllllllllllIllIlllIllIlIIlIIIIl, final float llllllllllllIllIlllIllIlIIlIIIII, final float llllllllllllIllIlllIllIlIIIlllll, final float llllllllllllIllIlllIllIlIIIllllI) {
        if (lIIlIIIIIIlIlIII(llllllllllllIllIlllIllIlIIIllIII.getName().equals(LayerDeadmau5Head.llIIllllIIllIl[LayerDeadmau5Head.llIIllllIIlllI[0]]) ? 1 : 0) && lIIlIIIIIIlIlIII(llllllllllllIllIlllIllIlIIIllIII.hasSkin() ? 1 : 0) && lIIlIIIIIIlIlIIl(llllllllllllIllIlllIllIlIIIllIII.isInvisible() ? 1 : 0)) {
            this.playerRenderer.bindTexture(llllllllllllIllIlllIllIlIIIllIII.getLocationSkin());
            int llllllllllllIllIlllIllIlIIIlllIl = LayerDeadmau5Head.llIIllllIIlllI[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIIlIIIIIIlIlIlI(llllllllllllIllIlllIllIlIIIlllIl, LayerDeadmau5Head.llIIllllIIlllI[1])) {
                final float llllllllllllIllIlllIllIlIIIlllII = llllllllllllIllIlllIllIlIIIllIII.prevRotationYaw + (llllllllllllIllIlllIllIlIIIllIII.rotationYaw - llllllllllllIllIlllIllIlIIIllIII.prevRotationYaw) * llllllllllllIllIlllIllIlIIlIIIlI - (llllllllllllIllIlllIllIlIIIllIII.prevRenderYawOffset + (llllllllllllIllIlllIllIlIIIllIII.renderYawOffset - llllllllllllIllIlllIllIlIIIllIII.prevRenderYawOffset) * llllllllllllIllIlllIllIlIIlIIIlI);
                final float llllllllllllIllIlllIllIlIIIllIll = llllllllllllIllIlllIllIlIIIllIII.prevRotationPitch + (llllllllllllIllIlllIllIlIIIllIII.rotationPitch - llllllllllllIllIlllIllIlIIIllIII.prevRotationPitch) * llllllllllllIllIlllIllIlIIlIIIlI;
                GlStateManager.pushMatrix();
                GlStateManager.rotate(llllllllllllIllIlllIllIlIIIlllII, 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(llllllllllllIllIlllIllIlIIIllIll, 1.0f, 0.0f, 0.0f);
                GlStateManager.translate(0.375f * (llllllllllllIllIlllIllIlIIIlllIl * LayerDeadmau5Head.llIIllllIIlllI[1] - LayerDeadmau5Head.llIIllllIIlllI[2]), 0.0f, 0.0f);
                GlStateManager.translate(0.0f, -0.375f, 0.0f);
                GlStateManager.rotate(-llllllllllllIllIlllIllIlIIIllIll, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(-llllllllllllIllIlllIllIlIIIlllII, 0.0f, 1.0f, 0.0f);
                final float llllllllllllIllIlllIllIlIIIllIlI = 1.3333334f;
                GlStateManager.scale(llllllllllllIllIlllIllIlIIIllIlI, llllllllllllIllIlllIllIlIIIllIlI, llllllllllllIllIlllIllIlIIIllIlI);
                this.playerRenderer.getMainModel().renderDeadmau5Head(0.0625f);
                GlStateManager.popMatrix();
                ++llllllllllllIllIlllIllIlIIIlllIl;
            }
        }
    }
    
    private static void lIIlIIIIIIlIIllI() {
        (llIIllllIIllIl = new String[LayerDeadmau5Head.llIIllllIIlllI[2]])[LayerDeadmau5Head.llIIllllIIlllI[0]] = lIIlIIIIIIlIIlIl("+hawyx6eGYcEAniAT1hDTw==", "MUyJv");
    }
    
    private static String lIIlIIIIIIlIIlIl(final String llllllllllllIllIlllIllIIlllllIII, final String llllllllllllIllIlllIllIIllllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlllIllIIlllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIllIIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIllIIlllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIllIIlllllIlI.init(LayerDeadmau5Head.llIIllllIIlllI[1], llllllllllllIllIlllIllIIlllllIll);
            return new String(llllllllllllIllIlllIllIIlllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIllIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIllIIlllllIIl) {
            llllllllllllIllIlllIllIIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    public LayerDeadmau5Head(final RenderPlayer llllllllllllIllIlllIllIlIIlIlllI) {
        this.playerRenderer = llllllllllllIllIlllIllIlIIlIlllI;
    }
}
