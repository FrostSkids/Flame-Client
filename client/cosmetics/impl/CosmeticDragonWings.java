// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import client.cosmetics.CosmeticModelBase;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.entity.AbstractClientPlayer;
import java.util.Arrays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import client.cosmetics.CosmeticBase;

public class CosmeticDragonWings extends CosmeticBase
{
    private static final /* synthetic */ String[] llllIllIlIlII;
    /* synthetic */ boolean flying;
    private final /* synthetic */ ModelDragonWings modelDragonWings;
    private static /* synthetic */ ModelRenderer wing;
    private static final /* synthetic */ int[] llllIllIlIllI;
    private static /* synthetic */ ModelRenderer wingTip;
    
    public void setRotationAngles(final float lllllllllllllIlIllIlIIIIllIIIlII, final float lllllllllllllIlIllIlIIIIllIIIIll, final float lllllllllllllIlIllIlIIIIllIIIIlI, final float lllllllllllllIlIllIlIIIIllIIIIIl, final float lllllllllllllIlIllIlIIIIllIIIIII, final float lllllllllllllIlIllIlIIIIlIllllll, final Entity lllllllllllllIlIllIlIIIIlIlllllI) {
    }
    
    private static void lIlIlIllIlIllll() {
        (llllIllIlIlII = new String[CosmeticDragonWings.llllIllIlIllI[18]])[CosmeticDragonWings.llllIllIlIllI[0]] = lIlIlIllIlIlIIl("bREVhwMUAmzLQKK8U7uMJA==", "vfyik");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[3]] = lIlIlIllIlIlIIl("i/o3RgI+npWER+ZrlLcGVQ==", "egawv");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[6]] = lIlIlIllIlIlIll("OW3E9fqZ5UVaHmdCUUwxOw==", "EvpkP");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[7]] = lIlIlIllIlIllII("DQUIDAUTHEgYOhMC", "zlfkQ");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[10]] = lIlIlIllIlIlIll("onnSJs0ia+A=", "JscuV");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[11]] = lIlIlIllIlIlIIl("ew8uuvykJJ8=", "grjwn");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[14]] = lIlIlIllIlIlIIl("ar2McnmEZuY=", "FvcaQ");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[15]] = lIlIlIllIlIllII("LTAMMxgzKQ==", "ZYbTL");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[13]] = lIlIlIllIlIlIIl("kfETgaLI7pM=", "HEbLS");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[16]] = lIlIlIllIlIlIll("FyHflfjYYmY=", "TzGzC");
        CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[17]] = lIlIlIllIlIlIll("/JVnHkPYMzA6iTp1bVmPVA==", "bHjCJ");
    }
    
    private static void lIlIlIllIllIIIl() {
        (llllIllIlIllI = new int[19])[0] = ((0x97 ^ 0xB7) & ~(0xAD ^ 0x8D));
        CosmeticDragonWings.llllIllIlIllI[1] = (0xE ^ 0x26 ^ (0xD ^ 0x55));
        CosmeticDragonWings.llllIllIlIllI[2] = (0x45 ^ 0x7A) + (0x4B ^ 0x66) - " ".length() + (0x12 ^ 0xF);
        CosmeticDragonWings.llllIllIlIllI[3] = " ".length();
        CosmeticDragonWings.llllIllIlIllI[4] = -(59 + 74 - 88 + 85 ^ 101 + 143 - 97 + 39);
        CosmeticDragonWings.llllIllIlIllI[5] = (0x1B ^ 0x43);
        CosmeticDragonWings.llllIllIlIllI[6] = "  ".length();
        CosmeticDragonWings.llllIllIlIllI[7] = "   ".length();
        CosmeticDragonWings.llllIllIlIllI[8] = (0x91 ^ 0x8B) + (0x69 ^ 0x2F) - (0x43 ^ 0x70) + (0x19 ^ 0x7A);
        CosmeticDragonWings.llllIllIlIllI[9] = (0xFFFFFDCA & 0x335);
        CosmeticDragonWings.llllIllIlIllI[10] = (0x54 ^ 0x50);
        CosmeticDragonWings.llllIllIlIllI[11] = (0x19 ^ 0x1C);
        CosmeticDragonWings.llllIllIlIllI[12] = (0x9C ^ 0xA4);
        CosmeticDragonWings.llllIllIlIllI[13] = (0x5D ^ 0x55);
        CosmeticDragonWings.llllIllIlIllI[14] = (0x22 ^ 0x24);
        CosmeticDragonWings.llllIllIlIllI[15] = (0xB2 ^ 0xB5);
        CosmeticDragonWings.llllIllIlIllI[16] = (0x1E ^ 0x40 ^ (0xCB ^ 0x9C));
        CosmeticDragonWings.llllIllIlIllI[17] = (0x5D ^ 0x45 ^ (0x39 ^ 0x2B));
        CosmeticDragonWings.llllIllIlIllI[18] = (0x2D ^ 0x4D ^ (0xD6 ^ 0xBD));
    }
    
    static {
        lIlIlIllIllIIIl();
        lIlIlIllIlIllll();
    }
    
    private static String lIlIlIllIlIlIIl(final String lllllllllllllIlIllIlIIIIlIlIlIIl, final String lllllllllllllIlIllIlIIIIlIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIIIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIIIlIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIIIlIlIlIll.init(CosmeticDragonWings.llllIllIlIllI[6], lllllllllllllIlIllIlIIIIlIlIllII);
            return new String(lllllllllllllIlIllIlIIIIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIIIlIlIlIlI) {
            lllllllllllllIlIllIlIIIIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    public CosmeticDragonWings(final RenderPlayer lllllllllllllIlIllIlIIIIlllIIIIl) {
        super(lllllllllllllIlIllIlIIIIlllIIIIl);
        this.flying = (CosmeticDragonWings.llllIllIlIllI[0] != 0);
        this.modelDragonWings = new ModelDragonWings(lllllllllllllIlIllIlIIIIlllIIIIl);
        this.modelDragonWings.setTextureOffset(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[0]], CosmeticDragonWings.llllIllIlIllI[1], CosmeticDragonWings.llllIllIlIllI[2]);
        this.modelDragonWings.setTextureOffset(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[3]], CosmeticDragonWings.llllIllIlIllI[4], CosmeticDragonWings.llllIllIlIllI[5]);
        this.modelDragonWings.setTextureOffset(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[6]], CosmeticDragonWings.llllIllIlIllI[1], CosmeticDragonWings.llllIllIlIllI[5]);
        this.modelDragonWings.setTextureOffset(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[7]], CosmeticDragonWings.llllIllIlIllI[4], CosmeticDragonWings.llllIllIlIllI[8]);
        final int lllllllllllllIlIllIlIIIIlllIIlII = this.modelDragonWings.textureWidth;
        final int lllllllllllllIlIllIlIIIIlllIIIll = this.modelDragonWings.textureHeight;
        this.modelDragonWings.textureWidth = CosmeticDragonWings.llllIllIlIllI[9];
        this.modelDragonWings.textureHeight = CosmeticDragonWings.llllIllIlIllI[9];
        (CosmeticDragonWings.wing = new ModelRenderer(this.modelDragonWings, CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[10]])).setRotationPoint(-12.0f, 5.0f, 2.0f);
        CosmeticDragonWings.wing.addBox(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[11]], -56.0f, -4.0f, -4.0f, CosmeticDragonWings.llllIllIlIllI[12], CosmeticDragonWings.llllIllIlIllI[13], CosmeticDragonWings.llllIllIlIllI[13]);
        "".length();
        CosmeticDragonWings.wing.addBox(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[14]], -56.0f, 0.0f, 2.0f, CosmeticDragonWings.llllIllIlIllI[12], CosmeticDragonWings.llllIllIlIllI[0], CosmeticDragonWings.llllIllIlIllI[12]);
        "".length();
        CosmeticDragonWings.wing.isHidden = (CosmeticDragonWings.llllIllIlIllI[3] != 0);
        (CosmeticDragonWings.wingTip = new ModelRenderer(this.modelDragonWings, CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[15]])).setRotationPoint(-56.0f, 0.0f, 0.0f);
        CosmeticDragonWings.wingTip.isHidden = (CosmeticDragonWings.llllIllIlIllI[3] != 0);
        CosmeticDragonWings.wingTip.addBox(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[13]], -56.0f, -2.0f, -2.0f, CosmeticDragonWings.llllIllIlIllI[12], CosmeticDragonWings.llllIllIlIllI[10], CosmeticDragonWings.llllIllIlIllI[10]);
        "".length();
        CosmeticDragonWings.wingTip.addBox(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[16]], -56.0f, 0.0f, 2.0f, CosmeticDragonWings.llllIllIlIllI[12], CosmeticDragonWings.llllIllIlIllI[0], CosmeticDragonWings.llllIllIlIllI[12]);
        "".length();
        CosmeticDragonWings.wing.addChild(CosmeticDragonWings.wingTip);
        this.modelDragonWings.textureWidth = lllllllllllllIlIllIlIIIIlllIIlII;
        this.modelDragonWings.textureWidth = lllllllllllllIlIllIlIIIIlllIIIll;
    }
    
    private static boolean lIlIlIllIllIIlI(final int lllllllllllllIlIllIlIIIIlIIIIllI) {
        return lllllllllllllIlIllIlIIIIlIIIIllI == 0;
    }
    
    private static String lIlIlIllIlIlIll(final String lllllllllllllIlIllIlIIIIlIllIlII, final String lllllllllllllIlIllIlIIIIlIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIIIlIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), CosmeticDragonWings.llllIllIlIllI[13]), "DES");
            final Cipher lllllllllllllIlIllIlIIIIlIlllIII = Cipher.getInstance("DES");
            lllllllllllllIlIllIlIIIIlIlllIII.init(CosmeticDragonWings.llllIllIlIllI[6], lllllllllllllIlIllIlIIIIlIlllIIl);
            return new String(lllllllllllllIlIllIlIIIIlIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIIIlIllIlll) {
            lllllllllllllIlIllIlIIIIlIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIlIllIlIllII(String lllllllllllllIlIllIlIIIIlIIlIlII, final String lllllllllllllIlIllIlIIIIlIIlIIll) {
        lllllllllllllIlIllIlIIIIlIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIIIIlIIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIllIlIIIIlIIlIllI = lllllllllllllIlIllIlIIIIlIIlIIll.toCharArray();
        int lllllllllllllIlIllIlIIIIlIIlIlIl = CosmeticDragonWings.llllIllIlIllI[0];
        final double lllllllllllllIlIllIlIIIIlIIIllll = (Object)lllllllllllllIlIllIlIIIIlIIlIlII.toCharArray();
        final short lllllllllllllIlIllIlIIIIlIIIlllI = (short)lllllllllllllIlIllIlIIIIlIIIllll.length;
        float lllllllllllllIlIllIlIIIIlIIIllIl = CosmeticDragonWings.llllIllIlIllI[0];
        while (lIlIlIllIllIIll((int)lllllllllllllIlIllIlIIIIlIIIllIl, lllllllllllllIlIllIlIIIIlIIIlllI)) {
            final char lllllllllllllIlIllIlIIIIlIIllIlI = lllllllllllllIlIllIlIIIIlIIIllll[lllllllllllllIlIllIlIIIIlIIIllIl];
            lllllllllllllIlIllIlIIIIlIIlIlll.append((char)(lllllllllllllIlIllIlIIIIlIIllIlI ^ lllllllllllllIlIllIlIIIIlIIlIllI[lllllllllllllIlIllIlIIIIlIIlIlIl % lllllllllllllIlIllIlIIIIlIIlIllI.length]));
            "".length();
            ++lllllllllllllIlIllIlIIIIlIIlIlIl;
            ++lllllllllllllIlIllIlIIIIlIIIllIl;
            "".length();
            if (((0x3C ^ 0x15) & ~(0x2B ^ 0x2)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIIIIlIIlIlll);
    }
    
    @Override
    public void render(final AbstractClientPlayer lllllllllllllIlIllIlIIIIllIIllII, final float lllllllllllllIlIllIlIIIIllIIlIll, final float lllllllllllllIlIllIlIIIIllIIlIlI, final float lllllllllllllIlIllIlIIIIllIlIIlI, final float lllllllllllllIlIllIlIIIIllIlIIIl, final float lllllllllllllIlIllIlIIIIllIIlIII, final float lllllllllllllIlIllIlIIIIllIIllll, final float lllllllllllllIlIllIlIIIIllIIIllI) {
        if (lIlIlIllIllIIlI(lllllllllllllIlIllIlIIIIllIIllII.getName().equals(CosmeticDragonWings.llllIllIlIlII[CosmeticDragonWings.llllIllIlIllI[17]]) ? 1 : 0)) {
            return;
        }
        GlStateManager.pushMatrix();
        this.modelDragonWings.render(lllllllllllllIlIllIlIIIIllIIllII, lllllllllllllIlIllIlIIIIllIIlIll, lllllllllllllIlIllIlIIIIllIIlIlI, lllllllllllllIlIllIlIIIIllIlIIIl, lllllllllllllIlIllIlIIIIllIIlIII, lllllllllllllIlIllIlIIIIllIIllll, lllllllllllllIlIllIlIIIIllIIIllI);
        this.modelDragonWings.setRotationAngles(lllllllllllllIlIllIlIIIIllIIIllI, lllllllllllllIlIllIlIIIIllIIlIll, lllllllllllllIlIllIlIIIIllIIlIlI, lllllllllllllIlIllIlIIIIllIlIIIl, lllllllllllllIlIllIlIIIIllIIlIII, lllllllllllllIlIllIlIIIIllIIllll, lllllllllllllIlIllIlIIIIllIIllII);
        GL11.glPopMatrix();
    }
    
    private static boolean lIlIlIllIllIIll(final int lllllllllllllIlIllIlIIIIlIIIlIIl, final int lllllllllllllIlIllIlIIIIlIIIlIII) {
        return lllllllllllllIlIllIlIIIIlIIIlIIl < lllllllllllllIlIllIlIIIIlIIIlIII;
    }
    
    private class ModelDragonWings extends CosmeticModelBase
    {
        private static final /* synthetic */ int[] lllIIlIIlIIIII;
        private static final /* synthetic */ String[] lllIIlIIIlllll;
        
        private static void lIIlllllIIIlllIl() {
            (lllIIlIIlIIIII = new int[4])[0] = ((0x19 ^ 0x56) & ~(0x1A ^ 0x55));
            ModelDragonWings.lllIIlIIlIIIII[1] = " ".length();
            ModelDragonWings.lllIIlIIlIIIII[2] = "  ".length();
            ModelDragonWings.lllIIlIIlIIIII[3] = (0x29 ^ 0x21);
        }
        
        static {
            lIIlllllIIIlllIl();
            lIIlllllIIIlllII();
        }
        
        @Override
        public void render(final Entity llllllllllllIlIllllIllllIlIlIlII, final float llllllllllllIlIllllIllllIllIIIIl, final float llllllllllllIlIllllIllllIlIlIIlI, final float llllllllllllIlIllllIllllIlIlllll, final float llllllllllllIlIllllIllllIlIlIIII, final float llllllllllllIlIllllIllllIlIIllll, final float llllllllllllIlIllllIllllIlIIlllI) {
            super.render(llllllllllllIlIllllIllllIlIlIlII, llllllllllllIlIllllIllllIllIIIIl, llllllllllllIlIllllIllllIlIlIIlI, llllllllllllIlIllllIllllIlIlllll, llllllllllllIlIllllIllllIlIlIIII, llllllllllllIlIllllIllllIlIIllll, llllllllllllIlIllllIllllIlIIlllI);
            GlStateManager.pushMatrix();
            float llllllllllllIlIllllIllllIlIllIll = 0.0f;
            if (lIIlllllIIIllllI(Minecraft.getMinecraft().thePlayer.capabilities.isFlying ? 1 : 0)) {
                llllllllllllIlIllllIllllIlIllIll = llllllllllllIlIllllIllllIlIlllll / 200.0f;
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlIllllIllllIlIllIll = llllllllllllIlIllllIllllIlIlllll / 80.0f;
            }
            Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(ModelDragonWings.lllIIlIIIlllll[ModelDragonWings.lllIIlIIlIIIII[0]]));
            float llllllllllllIlIllllIllllIlIllIlI = 100.0f;
            if (!lIIlllllIIIllllI(llllllllllllIlIllllIllllIlIlIlII.onGround ? 1 : 0) || lIIlllllIIIllllI(CosmeticDragonWings.this.flying ? 1 : 0)) {
                llllllllllllIlIllllIllllIlIllIlI = 50.0f;
                CosmeticDragonWings.this.flying = (ModelDragonWings.lllIIlIIlIIIII[1] != 0);
            }
            GlStateManager.scale(0.15, 0.15, 0.15);
            GlStateManager.translate(0.0, -0.3, 1.1);
            GlStateManager.rotate(50.0f, -50.0f, 0.0f, 0.0f);
            final int llllllllllllIlIllllIllllIlIllIIl = ModelDragonWings.lllIIlIIlIIIII[0];
            final int llllllllllllIlIllllIllllIlIllIII = ModelDragonWings.lllIIlIIlIIIII[0];
            int llllllllllllIlIllllIllllIlIlIlll = ModelDragonWings.lllIIlIIlIIIII[0];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIIlllllIIlIIIII(llllllllllllIlIllllIllllIlIlIlll, ModelDragonWings.lllIIlIIlIIIII[2])) {
                final float llllllllllllIlIllllIllllIlIlIllI = llllllllllllIlIllllIllllIlIllIll * 9.141593f * 2.0f;
                CosmeticDragonWings.wing.rotateAngleX = 0.125f - (float)Math.cos(llllllllllllIlIllllIllllIlIlIllI) * 0.2f;
                CosmeticDragonWings.wing.rotateAngleY = 0.25f;
                CosmeticDragonWings.wing.rotateAngleZ = (float)(Math.sin(llllllllllllIlIllllIllllIlIlIllI) + 1.225) * 0.3f;
                CosmeticDragonWings.wingTip.rotateAngleZ = -(float)(Math.sin(llllllllllllIlIllllIllllIlIlIllI + 2.0f) + 0.5) * 0.75f;
                CosmeticDragonWings.wing.isHidden = (ModelDragonWings.lllIIlIIlIIIII[0] != 0);
                CosmeticDragonWings.wingTip.isHidden = (ModelDragonWings.lllIIlIIlIIIII[0] != 0);
                if (lIIlllllIIIlllll(llllllllllllIlIllllIllllIlIlIlII.isInvisible() ? 1 : 0)) {
                    GlStateManager.pushMatrix();
                    GlStateManager.disableLighting();
                    CosmeticDragonWings.wing.render(llllllllllllIlIllllIllllIlIIlllI);
                    GlStateManager.blendFunc(ModelDragonWings.lllIIlIIlIIIII[1], ModelDragonWings.lllIIlIIlIIIII[1]);
                    GlStateManager.enableLighting();
                    GlStateManager.popMatrix();
                }
                CosmeticDragonWings.wing.isHidden = (ModelDragonWings.lllIIlIIlIIIII[0] != 0);
                CosmeticDragonWings.wingTip.isHidden = (ModelDragonWings.lllIIlIIlIIIII[0] != 0);
                if (lIIlllllIIIlllll(llllllllllllIlIllllIllllIlIlIlll)) {
                    GlStateManager.scale(-1.0f, 1.0f, 1.0f);
                }
                ++llllllllllllIlIllllIllllIlIlIlll;
            }
            GlStateManager.popMatrix();
        }
        
        private static boolean lIIlllllIIIllllI(final int llllllllllllIlIllllIllllIIllIlIl) {
            return llllllllllllIlIllllIllllIIllIlIl != 0;
        }
        
        public ModelDragonWings(final RenderPlayer llllllllllllIlIllllIllllIlllIlIl) {
            super(llllllllllllIlIllllIllllIlllIlIl);
        }
        
        private static String lIIlllllIIIllIll(final String llllllllllllIlIllllIllllIlIIIIII, final String llllllllllllIlIllllIllllIIllllll) {
            try {
                final SecretKeySpec llllllllllllIlIllllIllllIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIllllIIllllll.getBytes(StandardCharsets.UTF_8)), ModelDragonWings.lllIIlIIlIIIII[3]), "DES");
                final Cipher llllllllllllIlIllllIllllIlIIIIlI = Cipher.getInstance("DES");
                llllllllllllIlIllllIllllIlIIIIlI.init(ModelDragonWings.lllIIlIIlIIIII[2], llllllllllllIlIllllIllllIlIIIIll);
                return new String(llllllllllllIlIllllIllllIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIllllIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllIllllIlIIIIIl) {
                llllllllllllIlIllllIllllIlIIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlllllIIIlllII() {
            (lllIIlIIIlllll = new String[ModelDragonWings.lllIIlIIlIIIII[1]])[ModelDragonWings.lllIIlIIlIIIII[0]] = lIIlllllIIIllIll("j2rFX6n5ud/rnPE94Hx/Gt5+v69mqPeobcxmQte3ZU3977GNuGS2ug==", "LSEwF");
        }
        
        private static boolean lIIlllllIIlIIIII(final int llllllllllllIlIllllIllllIIlllIII, final int llllllllllllIlIllllIllllIIllIlll) {
            return llllllllllllIlIllllIllllIIlllIII >= llllllllllllIlIllllIllllIIllIlll;
        }
        
        private static boolean lIIlllllIIIlllll(final int llllllllllllIlIllllIllllIIllIIll) {
            return llllllllllllIlIllllIllllIIllIIll == 0;
        }
    }
}
