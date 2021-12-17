// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEnderCrystal extends ModelBase
{
    private static final /* synthetic */ String[] lIlllllIlIlIII;
    private static final /* synthetic */ int[] lIlllllIlIlIIl;
    private /* synthetic */ ModelRenderer glass;
    private /* synthetic */ ModelRenderer cube;
    private /* synthetic */ ModelRenderer base;
    
    private static void lIIIIlIlIllIllII() {
        (lIlllllIlIlIIl = new int[9])[0] = ("   ".length() & ~"   ".length());
        ModelEnderCrystal.lIlllllIlIlIIl[1] = (0xC8 ^ 0xC0);
        ModelEnderCrystal.lIlllllIlIlIIl[2] = " ".length();
        ModelEnderCrystal.lIlllllIlIlIIl[3] = (0x45 ^ 0x65);
        ModelEnderCrystal.lIlllllIlIlIIl[4] = "  ".length();
        ModelEnderCrystal.lIlllllIlIlIIl[5] = (0x73 ^ 0x4C ^ (0xC ^ 0x23));
        ModelEnderCrystal.lIlllllIlIlIIl[6] = (133 + 3 - 114 + 141 ^ 121 + 96 - 149 + 107);
        ModelEnderCrystal.lIlllllIlIlIIl[7] = (0x7F ^ 0x9 ^ (0x21 ^ 0x53));
        ModelEnderCrystal.lIlllllIlIlIIl[8] = "   ".length();
    }
    
    @Override
    public void render(final Entity llllllllllllIllllIIllIIllllIIlll, final float llllllllllllIllllIIllIIllllIIllI, final float llllllllllllIllllIIllIIlllIllllI, final float llllllllllllIllllIIllIIlllIlllIl, final float llllllllllllIllllIIllIIllllIIIll, final float llllllllllllIllllIIllIIllllIIIlI, final float llllllllllllIllllIIllIIlllIlllII) {
        GlStateManager.pushMatrix();
        GlStateManager.scale(2.0f, 2.0f, 2.0f);
        GlStateManager.translate(0.0f, -0.5f, 0.0f);
        if (lIIIIlIlIllIlllI(this.base)) {
            this.base.render(llllllllllllIllllIIllIIlllIlllII);
        }
        GlStateManager.rotate(llllllllllllIllllIIllIIlllIllllI, 0.0f, 1.0f, 0.0f);
        GlStateManager.translate(0.0f, 0.8f + llllllllllllIllllIIllIIlllIlllIl, 0.0f);
        GlStateManager.rotate(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.glass.render(llllllllllllIllllIIllIIlllIlllII);
        final float llllllllllllIllllIIllIIllllIIIII = 0.875f;
        GlStateManager.scale(llllllllllllIllllIIllIIllllIIIII, llllllllllllIllllIIllIIllllIIIII, llllllllllllIllllIIllIIllllIIIII);
        GlStateManager.rotate(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManager.rotate(llllllllllllIllllIIllIIlllIllllI, 0.0f, 1.0f, 0.0f);
        this.glass.render(llllllllllllIllllIIllIIlllIlllII);
        GlStateManager.scale(llllllllllllIllllIIllIIllllIIIII, llllllllllllIllllIIllIIllllIIIII, llllllllllllIllllIIllIIllllIIIII);
        GlStateManager.rotate(60.0f, 0.7071f, 0.0f, 0.7071f);
        GlStateManager.rotate(llllllllllllIllllIIllIIlllIllllI, 0.0f, 1.0f, 0.0f);
        this.cube.render(llllllllllllIllllIIllIIlllIlllII);
        GlStateManager.popMatrix();
    }
    
    private static boolean lIIIIlIlIllIllIl(final int llllllllllllIllllIIllIIllIlIIIIl) {
        return llllllllllllIllllIIllIIllIlIIIIl != 0;
    }
    
    private static String lIIIIlIlIllIlIII(final String llllllllllllIllllIIllIIlllIlIIIl, final String llllllllllllIllllIIllIIlllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIlllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllIIlllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllIIlllIlIlIl.init(ModelEnderCrystal.lIlllllIlIlIIl[4], llllllllllllIllllIIllIIlllIlIllI);
            return new String(llllllllllllIllllIIllIIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIlllIlIlII) {
            llllllllllllIllllIIllIIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    public ModelEnderCrystal(final float llllllllllllIllllIIllIIlllllIIIl, final boolean llllllllllllIllllIIllIIllllIlllI) {
        this.glass = new ModelRenderer(this, ModelEnderCrystal.lIlllllIlIlIII[ModelEnderCrystal.lIlllllIlIlIIl[0]]);
        this.glass.setTextureOffset(ModelEnderCrystal.lIlllllIlIlIIl[0], ModelEnderCrystal.lIlllllIlIlIIl[0]).addBox(-4.0f, -4.0f, -4.0f, ModelEnderCrystal.lIlllllIlIlIIl[1], ModelEnderCrystal.lIlllllIlIlIIl[1], ModelEnderCrystal.lIlllllIlIlIIl[1]);
        "".length();
        this.cube = new ModelRenderer(this, ModelEnderCrystal.lIlllllIlIlIII[ModelEnderCrystal.lIlllllIlIlIIl[2]]);
        this.cube.setTextureOffset(ModelEnderCrystal.lIlllllIlIlIIl[3], ModelEnderCrystal.lIlllllIlIlIIl[0]).addBox(-4.0f, -4.0f, -4.0f, ModelEnderCrystal.lIlllllIlIlIIl[1], ModelEnderCrystal.lIlllllIlIlIIl[1], ModelEnderCrystal.lIlllllIlIlIIl[1]);
        "".length();
        if (lIIIIlIlIllIllIl(llllllllllllIllllIIllIIllllIlllI ? 1 : 0)) {
            this.base = new ModelRenderer(this, ModelEnderCrystal.lIlllllIlIlIII[ModelEnderCrystal.lIlllllIlIlIIl[4]]);
            this.base.setTextureOffset(ModelEnderCrystal.lIlllllIlIlIIl[0], ModelEnderCrystal.lIlllllIlIlIIl[5]).addBox(-6.0f, 0.0f, -6.0f, ModelEnderCrystal.lIlllllIlIlIIl[6], ModelEnderCrystal.lIlllllIlIlIIl[7], ModelEnderCrystal.lIlllllIlIlIIl[6]);
            "".length();
        }
    }
    
    private static boolean lIIIIlIlIllIllll(final int llllllllllllIllllIIllIIllIlIIllI, final int llllllllllllIllllIIllIIllIlIIlIl) {
        return llllllllllllIllllIIllIIllIlIIllI < llllllllllllIllllIIllIIllIlIIlIl;
    }
    
    private static boolean lIIIIlIlIllIlllI(final Object llllllllllllIllllIIllIIllIlIIIll) {
        return llllllllllllIllllIIllIIllIlIIIll != null;
    }
    
    static {
        lIIIIlIlIllIllII();
        lIIIIlIlIllIlIll();
    }
    
    private static String lIIIIlIlIllIlIlI(String llllllllllllIllllIIllIIllIlllllI, final String llllllllllllIllllIIllIIlllIIIIlI) {
        llllllllllllIllllIIllIIllIlllllI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIllIIllIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIllIIlllIIIIIl = new StringBuilder();
        final char[] llllllllllllIllllIIllIIlllIIIIII = llllllllllllIllllIIllIIlllIIIIlI.toCharArray();
        int llllllllllllIllllIIllIIllIllllll = ModelEnderCrystal.lIlllllIlIlIIl[0];
        final byte llllllllllllIllllIIllIIllIlllIIl = (Object)((String)llllllllllllIllllIIllIIllIlllllI).toCharArray();
        final long llllllllllllIllllIIllIIllIlllIII = llllllllllllIllllIIllIIllIlllIIl.length;
        short llllllllllllIllllIIllIIllIllIlll = (short)ModelEnderCrystal.lIlllllIlIlIIl[0];
        while (lIIIIlIlIllIllll(llllllllllllIllllIIllIIllIllIlll, (int)llllllllllllIllllIIllIIllIlllIII)) {
            final char llllllllllllIllllIIllIIlllIIIlII = llllllllllllIllllIIllIIllIlllIIl[llllllllllllIllllIIllIIllIllIlll];
            llllllllllllIllllIIllIIlllIIIIIl.append((char)(llllllllllllIllllIIllIIlllIIIlII ^ llllllllllllIllllIIllIIlllIIIIII[llllllllllllIllllIIllIIllIllllll % llllllllllllIllllIIllIIlllIIIIII.length]));
            "".length();
            ++llllllllllllIllllIIllIIllIllllll;
            ++llllllllllllIllllIIllIIllIllIlll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIllIIlllIIIIIl);
    }
    
    private static String lIIIIlIlIllIlIIl(final String llllllllllllIllllIIllIIllIlIlllI, final String llllllllllllIllllIIllIIllIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIllIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), ModelEnderCrystal.lIlllllIlIlIIl[1]), "DES");
            final Cipher llllllllllllIllllIIllIIllIllIIII = Cipher.getInstance("DES");
            llllllllllllIllllIIllIIllIllIIII.init(ModelEnderCrystal.lIlllllIlIlIIl[4], llllllllllllIllllIIllIIllIllIIIl);
            return new String(llllllllllllIllllIIllIIllIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIllIlIllll) {
            llllllllllllIllllIIllIIllIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIlIllIlIll() {
        (lIlllllIlIlIII = new String[ModelEnderCrystal.lIlllllIlIlIIl[8]])[ModelEnderCrystal.lIlllllIlIlIIl[0]] = lIIIIlIlIllIlIII("xDDksfO1Gzo=", "nDlrQ");
        ModelEnderCrystal.lIlllllIlIlIII[ModelEnderCrystal.lIlllllIlIlIIl[2]] = lIIIIlIlIllIlIIl("307N0AtHtJ8=", "MYfki");
        ModelEnderCrystal.lIlllllIlIlIII[ModelEnderCrystal.lIlllllIlIlIIl[4]] = lIIIIlIlIllIlIlI("JxYmCw==", "EwUnx");
    }
}
