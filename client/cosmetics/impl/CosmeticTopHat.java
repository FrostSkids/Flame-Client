// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import client.cosmetics.CosmeticModelBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import client.cosmetics.CosmeticController;
import net.minecraft.client.entity.AbstractClientPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import client.cosmetics.CosmeticBase;

public class CosmeticTopHat extends CosmeticBase
{
    private static final /* synthetic */ ResourceLocation TEXTURE;
    private final /* synthetic */ ModelTopHat modelTopHat;
    private static final /* synthetic */ int[] llIlIIllIIIIIl;
    private static final /* synthetic */ String[] llIlIIlIllllIl;
    
    private static String lIIlIIlIllIIIIIl(String llllllllllllIllIllIIIIIIIllIIlIl, final String llllllllllllIllIllIIIIIIIllIlIIl) {
        llllllllllllIllIllIIIIIIIllIIlIl = new String(Base64.getDecoder().decode(llllllllllllIllIllIIIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIIIIIllIlIII = new StringBuilder();
        final char[] llllllllllllIllIllIIIIIIIllIIlll = llllllllllllIllIllIIIIIIIllIlIIl.toCharArray();
        int llllllllllllIllIllIIIIIIIllIIllI = CosmeticTopHat.llIlIIllIIIIIl[0];
        final int llllllllllllIllIllIIIIIIIllIIIII = (Object)llllllllllllIllIllIIIIIIIllIIlIl.toCharArray();
        final boolean llllllllllllIllIllIIIIIIIlIlllll = llllllllllllIllIllIIIIIIIllIIIII.length != 0;
        int llllllllllllIllIllIIIIIIIlIllllI = CosmeticTopHat.llIlIIllIIIIIl[0];
        while (lIIlIIlIllIIllIl(llllllllllllIllIllIIIIIIIlIllllI, llllllllllllIllIllIIIIIIIlIlllll ? 1 : 0)) {
            final char llllllllllllIllIllIIIIIIIllIlIll = llllllllllllIllIllIIIIIIIllIIIII[llllllllllllIllIllIIIIIIIlIllllI];
            llllllllllllIllIllIIIIIIIllIlIII.append((char)(llllllllllllIllIllIIIIIIIllIlIll ^ llllllllllllIllIllIIIIIIIllIIlll[llllllllllllIllIllIIIIIIIllIIllI % llllllllllllIllIllIIIIIIIllIIlll.length]));
            "".length();
            ++llllllllllllIllIllIIIIIIIllIIllI;
            ++llllllllllllIllIllIIIIIIIlIllllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIIIIIllIlIII);
    }
    
    private static void lIIlIIlIllIIIIll() {
        (llIlIIlIllllIl = new String[CosmeticTopHat.llIlIIllIIIIIl[2]])[CosmeticTopHat.llIlIIllIIIIIl[0]] = lIIlIIlIllIIIIIl("Cy4LExcDMBkRBhFsHhsCCiIeWgIMJA==", "bCjtr");
        CosmeticTopHat.llIlIIlIllllIl[CosmeticTopHat.llIlIIllIIIIIl[1]] = lIIlIIlIllIIIIlI("kI9DxRO8WRgrPIHwjaKMCw==", "rVSRG");
    }
    
    private static boolean lIIlIIlIllIIlIll(final int llllllllllllIllIllIIIIIIIlIlIlIl) {
        return llllllllllllIllIllIIIIIIIlIlIlIl == 0;
    }
    
    @Override
    public void render(final AbstractClientPlayer llllllllllllIllIllIIIIIIlIIIlIIl, final float llllllllllllIllIllIIIIIIlIIIlIII, final float llllllllllllIllIllIIIIIIlIIlIIIl, final float llllllllllllIllIllIIIIIIlIIlIIII, final float llllllllllllIllIllIIIIIIlIIIIllI, final float llllllllllllIllIllIIIIIIlIIIlllI, final float llllllllllllIllIllIIIIIIlIIIllIl, final float llllllllllllIllIllIIIIIIlIIIIIll) {
        if (lIIlIIlIllIIlIll(llllllllllllIllIllIIIIIIlIIIlIIl.getName().equals(CosmeticTopHat.llIlIIlIllllIl[CosmeticTopHat.llIlIIllIIIIIl[1]]) ? 1 : 0)) {
            return;
        }
        if (lIIlIIlIllIIllII(CosmeticController.shouldRenderTopHat(llllllllllllIllIllIIIIIIlIIIlIIl) ? 1 : 0)) {
            GlStateManager.pushMatrix();
            this.playerRenderer.bindTexture(CosmeticTopHat.TEXTURE);
            if (lIIlIIlIllIIllII(llllllllllllIllIllIIIIIIlIIIlIIl.isSneaking() ? 1 : 0)) {
                GL11.glTranslated(0.0, 0.255, 0.0);
            }
            final float[] llllllllllllIllIllIIIIIIlIIIlIll = CosmeticController.getTopHatColor(llllllllllllIllIllIIIIIIlIIIlIIl);
            GL11.glColor3f(llllllllllllIllIllIIIIIIlIIIlIll[CosmeticTopHat.llIlIIllIIIIIl[0]], llllllllllllIllIllIIIIIIlIIIlIll[CosmeticTopHat.llIlIIllIIIIIl[1]], llllllllllllIllIllIIIIIIlIIIlIll[CosmeticTopHat.llIlIIllIIIIIl[2]]);
            this.modelTopHat.render(llllllllllllIllIllIIIIIIlIIIlIIl, llllllllllllIllIllIIIIIIlIIIlIII, llllllllllllIllIllIIIIIIlIIlIIIl, llllllllllllIllIllIIIIIIlIIIIllI, llllllllllllIllIllIIIIIIlIIIlllI, llllllllllllIllIllIIIIIIlIIIllIl, llllllllllllIllIllIIIIIIlIIIIIll);
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            GL11.glPopMatrix();
        }
    }
    
    static {
        lIIlIIlIllIIlIlI();
        lIIlIIlIllIIIIll();
        TEXTURE = new ResourceLocation(CosmeticTopHat.llIlIIlIllllIl[CosmeticTopHat.llIlIIllIIIIIl[0]]);
    }
    
    private static String lIIlIIlIllIIIIlI(final String llllllllllllIllIllIIIIIIIllllIlI, final String llllllllllllIllIllIIIIIIIllllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIIIIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIIIIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIIIIIlllllII.init(CosmeticTopHat.llIlIIllIIIIIl[2], llllllllllllIllIllIIIIIIIlllllIl);
            return new String(llllllllllllIllIllIIIIIIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIIIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIIIIIllllIll) {
            llllllllllllIllIllIIIIIIIllllIll.printStackTrace();
            return null;
        }
    }
    
    public CosmeticTopHat(final RenderPlayer llllllllllllIllIllIIIIIIlIlIIIII) {
        super(llllllllllllIllIllIIIIIIlIlIIIII);
        this.modelTopHat = new ModelTopHat(llllllllllllIllIllIIIIIIlIlIIIII);
    }
    
    private static boolean lIIlIIlIllIIllIl(final int llllllllllllIllIllIIIIIIIlIllIlI, final int llllllllllllIllIllIIIIIIIlIllIIl) {
        return llllllllllllIllIllIIIIIIIlIllIlI < llllllllllllIllIllIIIIIIIlIllIIl;
    }
    
    private static boolean lIIlIIlIllIIllII(final int llllllllllllIllIllIIIIIIIlIlIlll) {
        return llllllllllllIllIllIIIIIIIlIlIlll != 0;
    }
    
    private static void lIIlIIlIllIIlIlI() {
        (llIlIIllIIIIIl = new int[3])[0] = ((194 + 75 - 215 + 163 ^ 32 + 70 - 92 + 147) & (0xF ^ 0x36 ^ (0x60 ^ 0x1D) ^ -" ".length()));
        CosmeticTopHat.llIlIIllIIIIIl[1] = " ".length();
        CosmeticTopHat.llIlIIllIIIIIl[2] = "  ".length();
    }
    
    private class ModelTopHat extends CosmeticModelBase
    {
        private /* synthetic */ ModelRenderer rim;
        private /* synthetic */ ModelRenderer pointy;
        private static final /* synthetic */ int[] lIlIIIlllIlIlI;
        
        public ModelTopHat(final RenderPlayer lllllllllllllIIIlllIllllIllIlIII) {
            super(lllllllllllllIIIlllIllllIllIlIII);
            this.rim = new ModelRenderer(this.playerModel, ModelTopHat.lIlIIIlllIlIlI[0], ModelTopHat.lIlIIIlllIlIlI[0]);
            this.rim.addBox(-5.5f, -9.0f, -5.5f, ModelTopHat.lIlIIIlllIlIlI[1], ModelTopHat.lIlIIIlllIlIlI[2], ModelTopHat.lIlIIIlllIlIlI[1]);
            "".length();
            this.pointy = new ModelRenderer(this.playerModel, ModelTopHat.lIlIIIlllIlIlI[0], ModelTopHat.lIlIIIlllIlIlI[3]);
            this.pointy.addBox(-3.5f, -17.0f, -3.5f, ModelTopHat.lIlIIIlllIlIlI[4], ModelTopHat.lIlIIIlllIlIlI[5], ModelTopHat.lIlIIIlllIlIlI[4]);
            "".length();
        }
        
        static {
            lllIIlIIIIIllII();
        }
        
        private static void lllIIlIIIIIllII() {
            (lIlIIIlllIlIlI = new int[6])[0] = ((0xB ^ 0x1F) & ~(0xAA ^ 0xBE));
            ModelTopHat.lIlIIIlllIlIlI[1] = (0x2C ^ 0x27);
            ModelTopHat.lIlIIIlllIlIlI[2] = "  ".length();
            ModelTopHat.lIlIIIlllIlIlI[3] = (62 + 21 - 22 + 84 ^ 6 + 89 - 45 + 106);
            ModelTopHat.lIlIIIlllIlIlI[4] = (0xB ^ 0xC);
            ModelTopHat.lIlIIIlllIlIlI[5] = (155 + 13 - 71 + 73 ^ 97 + 62 - 70 + 73);
        }
        
        @Override
        public void render(final Entity lllllllllllllIIIlllIllllIllIIlII, final float lllllllllllllIIIlllIllllIllIIIll, final float lllllllllllllIIIlllIllllIllIIIlI, final float lllllllllllllIIIlllIllllIllIIIIl, final float lllllllllllllIIIlllIllllIllIIIII, final float lllllllllllllIIIlllIllllIlIlllll, final float lllllllllllllIIIlllIllllIlIllllI) {
            this.rim.rotateAngleX = this.playerModel.bipedHead.rotateAngleX;
            this.rim.rotateAngleY = this.playerModel.bipedHead.rotateAngleY;
            this.rim.rotationPointX = 0.0f;
            this.rim.rotationPointY = 0.0f;
            this.rim.render(lllllllllllllIIIlllIllllIlIllllI);
            this.pointy.rotateAngleX = this.playerModel.bipedHead.rotateAngleX;
            this.pointy.rotateAngleY = this.playerModel.bipedHead.rotateAngleY;
            this.pointy.rotationPointX = 0.0f;
            this.pointy.rotationPointY = 0.0f;
            this.pointy.render(lllllllllllllIIIlllIllllIlIllllI);
        }
    }
}
