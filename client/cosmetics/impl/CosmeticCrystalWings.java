// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import client.cosmetics.CosmeticModelBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import client.cosmetics.CosmeticBase;

public class CosmeticCrystalWings extends CosmeticBase
{
    private static final /* synthetic */ int[] llIIlllIIlIlII;
    private static final /* synthetic */ String[] llIIlllIIlIIll;
    private /* synthetic */ CrytsalWingsModel crytsalWingsModel;
    
    public CosmeticCrystalWings(final RenderPlayer llllllllllllIllIlllllIIIllllIlII) {
        super(llllllllllllIllIlllllIIIllllIlII);
        this.crytsalWingsModel = new CrytsalWingsModel(llllllllllllIllIlllllIIIllllIlII);
    }
    
    static {
        lIIIllllIllllIIl();
        lIIIllllIllllIII();
    }
    
    private static void lIIIllllIllllIIl() {
        (llIIlllIIlIlII = new int[4])[0] = ((0x3 ^ 0x5D ^ (0x2F ^ 0x7B)) & (0x7B ^ 0x2C ^ (0xF0 ^ 0xAD) ^ -" ".length()));
        CosmeticCrystalWings.llIIlllIIlIlII[1] = " ".length();
        CosmeticCrystalWings.llIIlllIIlIlII[2] = (0xB8 ^ 0xA0 ^ (0xD6 ^ 0xC6));
        CosmeticCrystalWings.llIIlllIIlIlII[3] = "  ".length();
    }
    
    @Override
    public void render(final AbstractClientPlayer llllllllllllIllIlllllIIIlllIlIll, final float llllllllllllIllIlllllIIIlllIlIlI, final float llllllllllllIllIlllllIIIlllIIIII, final float llllllllllllIllIlllllIIIlllIlIII, final float llllllllllllIllIlllllIIIlllIIlll, final float llllllllllllIllIlllllIIIlllIIllI, final float llllllllllllIllIlllllIIIlllIIlIl, final float llllllllllllIllIlllllIIIlllIIlII) {
        if (lIIIllllIllllIlI(llllllllllllIllIlllllIIIlllIlIll.getName().equals(CosmeticCrystalWings.llIIlllIIlIIll[CosmeticCrystalWings.llIIlllIIlIlII[0]]) ? 1 : 0)) {
            return;
        }
        this.crytsalWingsModel.render(llllllllllllIllIlllllIIIlllIlIll, llllllllllllIllIlllllIIIlllIlIlI, llllllllllllIllIlllllIIIlllIIIII, llllllllllllIllIlllllIIIlllIIlll, llllllllllllIllIlllllIIIlllIIlIl, llllllllllllIllIlllllIIIlllIIlIl, llllllllllllIllIlllllIIIlllIIlII);
    }
    
    private static void lIIIllllIllllIII() {
        (llIIlllIIlIIll = new String[CosmeticCrystalWings.llIIlllIIlIlII[1]])[CosmeticCrystalWings.llIIlllIIlIlII[0]] = lIIIllllIlllIlll("RZvhgqxsGGBecQ1aDoW1PQ==", "XFeqr");
    }
    
    private static boolean lIIIllllIllllIlI(final int llllllllllllIllIlllllIIIllIIlllI) {
        return llllllllllllIllIlllllIIIllIIlllI == 0;
    }
    
    private static String lIIIllllIlllIlll(final String llllllllllllIllIlllllIIIllIlIlIl, final String llllllllllllIllIlllllIIIllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), CosmeticCrystalWings.llIIlllIIlIlII[2]), "DES");
            final Cipher llllllllllllIllIlllllIIIllIlIlll = Cipher.getInstance("DES");
            llllllllllllIllIlllllIIIllIlIlll.init(CosmeticCrystalWings.llIIlllIIlIlII[3], llllllllllllIllIlllllIIIllIllIII);
            return new String(llllllllllllIllIlllllIIIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIIIllIlIllI) {
            llllllllllllIllIlllllIIIllIlIllI.printStackTrace();
            return null;
        }
    }
    
    public class CrytsalWingsModel extends CosmeticModelBase
    {
        private static final /* synthetic */ int[] lllllIIlIIIII;
        /* synthetic */ ResourceLocation resourceLocation;
        private static final /* synthetic */ String[] lllllIIIlllll;
        private /* synthetic */ ModelRenderer model;
        
        private static boolean lIlIllIlIlllIIl(final Object lllllllllllllIlIllIIIIIIIIlIlllI) {
            return lllllllllllllIlIllIIIIIIIIlIlllI != null;
        }
        
        private static boolean lIlIllIlIlllIII(final int lllllllllllllIlIllIIIIIIIIlIllII) {
            return lllllllllllllIlIllIIIIIIIIlIllII != 0;
        }
        
        public CrytsalWingsModel(final RenderPlayer lllllllllllllIlIllIIIIIIIllIlIII) {
            super(lllllllllllllIlIllIIIIIIIllIlIII);
            this.resourceLocation = new ResourceLocation(CrytsalWingsModel.lllllIIIlllll[CrytsalWingsModel.lllllIIlIIIII[0]]);
            final int lllllllllllllIlIllIIIIIIIllIlllI = CrytsalWingsModel.lllllIIlIIIII[1];
            final int lllllllllllllIlIllIIIIIIIllIllIl = CrytsalWingsModel.lllllIIlIIIII[2];
            this.model = new ModelRenderer(this).setTextureSize(lllllllllllllIlIllIIIIIIIllIlllI, lllllllllllllIlIllIIIIIIIllIllIl).setTextureOffset(CrytsalWingsModel.lllllIIlIIIII[0], CrytsalWingsModel.lllllIIlIIIII[3]);
            this.model.setRotationPoint(-0.0f, 1.0f, 0.0f);
            this.model.addBox(0.0f, -3.0f, 0.0f, CrytsalWingsModel.lllllIIlIIIII[4], CrytsalWingsModel.lllllIIlIIIII[5], CrytsalWingsModel.lllllIIlIIIII[6]);
            "".length();
            this.model.isHidden = (CrytsalWingsModel.lllllIIlIIIII[6] != 0);
            final ModelRenderer lllllllllllllIlIllIIIIIIIllIllII = new ModelRenderer(this).setTextureSize(lllllllllllllIlIllIIIIIIIllIlllI, lllllllllllllIlIllIIIIIIIllIllIl).setTextureOffset(CrytsalWingsModel.lllllIIlIIIII[0], CrytsalWingsModel.lllllIIlIIIII[7]);
            lllllllllllllIlIllIIIIIIIllIllII.setRotationPoint(-0.0f, 0.0f, 0.2f);
            lllllllllllllIlIllIIIIIIIllIllII.addBox(0.0f, -3.0f, 0.0f, CrytsalWingsModel.lllllIIlIIIII[4], CrytsalWingsModel.lllllIIlIIIII[5], CrytsalWingsModel.lllllIIlIIIII[6]);
            "".length();
            this.model.addChild(lllllllllllllIlIllIIIIIIIllIllII);
            final ModelRenderer lllllllllllllIlIllIIIIIIIllIlIll = new ModelRenderer(this).setTextureSize(lllllllllllllIlIllIIIIIIIllIlllI, lllllllllllllIlIllIIIIIIIllIllIl).setTextureOffset(CrytsalWingsModel.lllllIIlIIIII[0], CrytsalWingsModel.lllllIIlIIIII[0]);
            lllllllllllllIlIllIIIIIIIllIlIll.setRotationPoint(-0.0f, 0.0f, 0.2f);
            lllllllllllllIlIllIIIIIIIllIlIll.addBox(0.0f, -3.0f, 0.0f, CrytsalWingsModel.lllllIIlIIIII[4], CrytsalWingsModel.lllllIIlIIIII[5], CrytsalWingsModel.lllllIIlIIIII[6]);
            "".length();
            lllllllllllllIlIllIIIIIIIllIllII.addChild(lllllllllllllIlIllIIIIIIIllIlIll);
        }
        
        @Override
        public void render(final Entity lllllllllllllIlIllIIIIIIIlIllIIl, final float lllllllllllllIlIllIIIIIIIlIllIII, final float lllllllllllllIlIllIIIIIIIlIIlIll, final float lllllllllllllIlIllIIIIIIIlIlIllI, final float lllllllllllllIlIllIIIIIIIlIlIlIl, final float lllllllllllllIlIllIIIIIIIlIlIlII, final float lllllllllllllIlIllIIIIIIIlIIlIIl) {
            final float lllllllllllllIlIllIIIIIIIlIlIIlI = (float)Math.cos(lllllllllllllIlIllIIIIIIIlIlIllI / 10.0f) / 20.0f - 0.03f - lllllllllllllIlIllIIIIIIIlIIlIll / 20.0f;
            final ModelRenderer lllllllllllllIlIllIIIIIIIlIlIIIl = this.model.childModels.get(CrytsalWingsModel.lllllIIlIIIII[0]);
            final ModelRenderer lllllllllllllIlIllIIIIIIIlIlIIII = lllllllllllllIlIllIIIIIIIlIlIIIl.childModels.get(CrytsalWingsModel.lllllIIlIIIII[0]);
            this.model.rotateAngleZ = lllllllllllllIlIllIIIIIIIlIlIIlI * 3.0f;
            lllllllllllllIlIllIIIIIIIlIlIIIl.rotateAngleZ = lllllllllllllIlIllIIIIIIIlIlIIlI / 2.0f;
            lllllllllllllIlIllIIIIIIIlIlIIII.rotateAngleZ = lllllllllllllIlIllIIIIIIIlIlIIlI / 2.0f;
            this.model.rotateAngleY = -0.3f - lllllllllllllIlIllIIIIIIIlIIlIll / 3.0f;
            this.model.rotateAngleX = 0.3f;
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.6, 1.6, 1.0);
            GlStateManager.translate(0.0, 0.05000000074505806, 0.05000000074505806);
            if (lIlIllIlIlllIII(lllllllllllllIlIllIIIIIIIlIllIIl.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0, 0.07999999821186066, 0.029999999329447746);
                GlStateManager.rotate(20.0f, 1.0f, 0.0f, 0.0f);
                this.model.rotateAngleZ = 0.8f;
                lllllllllllllIlIllIIIIIIIlIlIIIl.rotateAngleZ = 0.0f;
                lllllllllllllIlIllIIIIIIIlIlIIII.rotateAngleZ = 0.0f;
                "".length();
                if (((62 + 0 + 19 + 107 ^ 111 + 99 - 148 + 112) & (82 + 4 - 41 + 107 ^ 115 + 127 - 224 + 120 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                final RenderManager lllllllllllllIlIllIIIIIIIlIIllll = Minecraft.getMinecraft().getRenderManager();
                if (lIlIllIlIlllIIl(lllllllllllllIlIllIIIIIIIlIIllll)) {
                    GlStateManager.rotate(lllllllllllllIlIllIIIIIIIlIIllll.playerViewX / 3.0f, 1.0f, 0.0f, 0.0f);
                }
            }
            this.model.isHidden = (CrytsalWingsModel.lllllIIlIIIII[0] != 0);
            int lllllllllllllIlIllIIIIIIIlIIlllI = CrytsalWingsModel.lllllIIlIIIII[8];
            "".length();
            if (((165 + 231 - 299 + 150 ^ 57 + 75 - 8 + 42) & (((0x67 ^ 0x53) & ~(0x50 ^ 0x64)) ^ (0xF1 ^ 0xA0) ^ -" ".length())) > 0) {
                return;
            }
            while (!lIlIllIlIlllIll(lllllllllllllIlIllIIIIIIIlIIlllI, CrytsalWingsModel.lllllIIlIIIII[6])) {
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0f, 1.0f, 1.0f, 0.3f);
                GlStateManager.depthMask((boolean)(CrytsalWingsModel.lllllIIlIIIII[0] != 0));
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(CrytsalWingsModel.lllllIIlIIIII[9], CrytsalWingsModel.lllllIIlIIIII[10]);
                GlStateManager.alphaFunc(CrytsalWingsModel.lllllIIlIIIII[11], 0.003921569f);
                GlStateManager.disableLighting();
                GlStateManager.color(0.0f, 0.0f, 0.0f);
                Minecraft.getMinecraft().getTextureManager().bindTexture(this.resourceLocation);
                if (lIlIllIlIlllIlI(lllllllllllllIlIllIIIIIIIlIIlllI, CrytsalWingsModel.lllllIIlIIIII[6])) {
                    GlStateManager.scale(-1.0f, 1.0f, 1.0f);
                }
                GlStateManager.translate(0.05, 0.0, 0.0);
                this.model.render(lllllllllllllIlIllIIIIIIIlIIlIIl);
                GlStateManager.disableBlend();
                GlStateManager.alphaFunc(CrytsalWingsModel.lllllIIlIIIII[11], 0.1f);
                GlStateManager.popMatrix();
                GlStateManager.depthMask((boolean)(CrytsalWingsModel.lllllIIlIIIII[6] != 0));
                lllllllllllllIlIllIIIIIIIlIIlllI += 2;
            }
            this.model.isHidden = (CrytsalWingsModel.lllllIIlIIIII[6] != 0);
            GlStateManager.popMatrix();
        }
        
        private static String lIlIllIlIllIlIl(final String lllllllllllllIlIllIIIIIIIIlllIll, final String lllllllllllllIlIllIIIIIIIIlllIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), CrytsalWingsModel.lllllIIlIIIII[3]), "DES");
                final Cipher lllllllllllllIlIllIIIIIIIIllllll = Cipher.getInstance("DES");
                lllllllllllllIlIllIIIIIIIIllllll.init(CrytsalWingsModel.lllllIIlIIIII[12], lllllllllllllIlIllIIIIIIIlIIIIII);
                return new String(lllllllllllllIlIllIIIIIIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIIIIIlllllI) {
                lllllllllllllIlIllIIIIIIIIlllllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIllIlIllIllI() {
            (lllllIIIlllll = new String[CrytsalWingsModel.lllllIIlIIIII[6]])[CrytsalWingsModel.lllllIIlIIIII[0]] = lIlIllIlIllIlIl("/p/qR58hL5ZFoiXYF0ezSqtOMIl2oTGZ", "cZlRh");
        }
        
        private static void lIlIllIlIllIlll() {
            (lllllIIlIIIII = new int[13])[0] = ((0x63 ^ 0x4F ^ (0x81 ^ 0xA5)) & (177 + 48 - 135 + 114 ^ 149 + 22 - 96 + 121 ^ -" ".length()));
            CrytsalWingsModel.lllllIIlIIIII[1] = (0x14 ^ 0xE ^ (0xA4 ^ 0xA0));
            CrytsalWingsModel.lllllIIlIIIII[2] = (0x72 ^ 0x6A);
            CrytsalWingsModel.lllllIIlIIIII[3] = (0xB8 ^ 0xB0);
            CrytsalWingsModel.lllllIIlIIIII[4] = (26 + 81 + 9 + 28 ^ 24 + 87 - 99 + 146);
            CrytsalWingsModel.lllllIIlIIIII[5] = (0x5A ^ 0x5C ^ " ".length());
            CrytsalWingsModel.lllllIIlIIIII[6] = " ".length();
            CrytsalWingsModel.lllllIIlIIIII[7] = (0xBE ^ 0xAE);
            CrytsalWingsModel.lllllIIlIIIII[8] = -" ".length();
            CrytsalWingsModel.lllllIIlIIIII[9] = (0xFFFFAB9B & 0x5766);
            CrytsalWingsModel.lllllIIlIIIII[10] = (-(36 + 77 + 80 + 16) & (0xFFFFF7DF & 0xBF3));
            CrytsalWingsModel.lllllIIlIIIII[11] = (-(0xFFFFA9BD & 0x7FFB) & (0xFFFFBFFD & 0x6BBE));
            CrytsalWingsModel.lllllIIlIIIII[12] = "  ".length();
        }
        
        private static boolean lIlIllIlIlllIlI(final int lllllllllllllIlIllIIIIIIIIllIlIl, final int lllllllllllllIlIllIIIIIIIIllIlII) {
            return lllllllllllllIlIllIIIIIIIIllIlIl == lllllllllllllIlIllIIIIIIIIllIlII;
        }
        
        private static boolean lIlIllIlIlllIll(final int lllllllllllllIlIllIIIIIIIIllIIIl, final int lllllllllllllIlIllIIIIIIIIllIIII) {
            return lllllllllllllIlIllIIIIIIIIllIIIl > lllllllllllllIlIllIIIIIIIIllIIII;
        }
        
        static {
            lIlIllIlIllIlll();
            lIlIllIlIllIllI();
        }
    }
}
