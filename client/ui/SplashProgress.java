// 
// Decompiled by Procyon v0.5.36
// 

package client.ui;

import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;

public class SplashProgress
{
    private static final /* synthetic */ int[] llIllIlllIIllI;
    private static /* synthetic */ int PROGRESS;
    private static /* synthetic */ String CURRENT;
    private static /* synthetic */ ResourceLocation splash;
    private static /* synthetic */ UnicodeFontRenderer ufr;
    private static final /* synthetic */ String[] llIllIlIllIlIl;
    
    private static boolean lIIllIIIIlllIIll(final int llllllllllllIllIIllIIIIllIlllllI, final int llllllllllllIllIIllIIIIllIllllIl) {
        return llllllllllllIllIIllIIIIllIlllllI < llllllllllllIllIIllIIIIllIllllIl;
    }
    
    private static void lIIllIIIIlllIIII() {
        (llIllIlllIIllI = new int[22])[0] = (0xC0 ^ 0xC7);
        SplashProgress.llIllIlllIIllI[1] = ((0x2B ^ 0x74 ^ (0x4B ^ 0x5A)) & (0x1D ^ 0x6B ^ (0x70 ^ 0x48) ^ -" ".length()));
        SplashProgress.llIllIlllIIllI[2] = " ".length();
        SplashProgress.llIllIlllIIllI[3] = (-(0xFFFFADFD & 0x7ABF) & (0xFFFFBFFF & 0x7FBD));
        SplashProgress.llIllIlllIIllI[4] = (0xFFFF9FBC & 0x7743);
        SplashProgress.llIllIlllIIllI[5] = (0xFFFFDFED & 0x2792);
        SplashProgress.llIllIlllIIllI[6] = (0xFFFFDDBB & 0x267C);
        SplashProgress.llIllIlllIIllI[7] = (-(0xFFFFF3BB & 0x3DF6) & (0xFFFFBFB5 & 0x73FF));
        SplashProgress.llIllIlllIIllI[8] = "  ".length();
        SplashProgress.llIllIlllIIllI[9] = (0x1C ^ 0x8);
        SplashProgress.llIllIlllIIllI[10] = (0x92 ^ 0xC2 ^ (0xEC ^ 0x9F));
        SplashProgress.llIllIlllIIllI[11] = (0x9E ^ 0xAC);
        SplashProgress.llIllIlllIIllI[12] = (0x10 ^ 0x9);
        SplashProgress.llIllIlllIIllI[13] = -" ".length();
        SplashProgress.llIllIlllIIllI[14] = "   ".length();
        SplashProgress.llIllIlllIIllI[15] = -(-(0xFFFFD19F & 0x2F6F) & (0xFFFFFF5F & 0x1E1E1FAF));
        SplashProgress.llIllIlllIIllI[16] = 12 + 140 - 24 + 21;
        SplashProgress.llIllIlllIIllI[17] = (0xC4 ^ 0xB6) + (14 + 18 + 115 + 21) - (0x23 ^ 0x77) + "   ".length();
        SplashProgress.llIllIlllIIllI[18] = 54 + 97 - 149 + 142;
        SplashProgress.llIllIlllIIllI[19] = (0x54 ^ 0x1A ^ (0x3B ^ 0x7F));
        SplashProgress.llIllIlllIIllI[20] = (0x3 ^ 0x7);
        SplashProgress.llIllIlllIIllI[21] = (6 + 186 - 121 + 132 ^ 48 + 142 - 51 + 56);
    }
    
    private static String lIIlIlllllllIlIl(final String llllllllllllIllIIllIIIIlllIlIIIl, final String llllllllllllIllIIllIIIIlllIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIIlllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIIlllIlIIII.getBytes(StandardCharsets.UTF_8)), SplashProgress.llIllIlllIIllI[21]), "DES");
            final Cipher llllllllllllIllIIllIIIIlllIlIlIl = Cipher.getInstance("DES");
            llllllllllllIllIIllIIIIlllIlIlIl.init(SplashProgress.llIllIlllIIllI[8], llllllllllllIllIIllIIIIlllIlIllI);
            return new String(llllllllllllIllIIllIIIIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIIlllIlIlII) {
            llllllllllllIllIIllIIIIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIIIIlllIIII();
        lIIlIlllllllIllI();
        MAX = SplashProgress.llIllIlllIIllI[0];
        SplashProgress.PROGRESS = SplashProgress.llIllIlllIIllI[1];
        SplashProgress.CURRENT = SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[1]];
    }
    
    private static String lIIlIlllllllIlII(String llllllllllllIllIIllIIIIllllIIIll, final String llllllllllllIllIIllIIIIllllIIlll) {
        llllllllllllIllIIllIIIIllllIIIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllIIIIllllIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIIIllllIIllI = new StringBuilder();
        final char[] llllllllllllIllIIllIIIIllllIIlIl = llllllllllllIllIIllIIIIllllIIlll.toCharArray();
        int llllllllllllIllIIllIIIIllllIIlII = SplashProgress.llIllIlllIIllI[1];
        final short llllllllllllIllIIllIIIIlllIllllI = (Object)((String)llllllllllllIllIIllIIIIllllIIIll).toCharArray();
        final long llllllllllllIllIIllIIIIlllIlllIl = llllllllllllIllIIllIIIIlllIllllI.length;
        byte llllllllllllIllIIllIIIIlllIlllII = (byte)SplashProgress.llIllIlllIIllI[1];
        while (lIIllIIIIlllIIll(llllllllllllIllIIllIIIIlllIlllII, (int)llllllllllllIllIIllIIIIlllIlllIl)) {
            final char llllllllllllIllIIllIIIIllllIlIIl = llllllllllllIllIIllIIIIlllIllllI[llllllllllllIllIIllIIIIlllIlllII];
            llllllllllllIllIIllIIIIllllIIllI.append((char)(llllllllllllIllIIllIIIIllllIlIIl ^ llllllllllllIllIIllIIIIllllIIlIl[llllllllllllIllIIllIIIIllllIIlII % llllllllllllIllIIllIIIIllllIIlIl.length]));
            "".length();
            ++llllllllllllIllIIllIIIIllllIIlII;
            ++llllllllllllIllIIllIIIIlllIlllII;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIIIllllIIllI);
    }
    
    private static void lIIlIlllllllIllI() {
        (llIllIlIllIlIl = new String[SplashProgress.llIllIlllIIllI[20]])[SplashProgress.llIllIlllIIllI[1]] = lIIlIlllllllIIll("1djXu/YEWCI=", "IazZZ");
        SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[2]] = lIIlIlllllllIlII("JBQAJjAsChIkIT5WEjE5LAoJMjY/HAQvez0XBg==", "MyaAU");
        SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[8]] = lIIlIlllllllIlIl("+s83mW9kh9s=", "gxMED");
        SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[14]] = lIIlIlllllllIlII("Zw==", "HAkrM");
    }
    
    private static boolean lIIllIIIIlllIIIl(final Object llllllllllllIllIIllIIIIllIlllIll) {
        return llllllllllllIllIIllIIIIllIlllIll != null;
    }
    
    private static String lIIlIlllllllIIll(final String llllllllllllIllIIllIIIIlllIIIlII, final String llllllllllllIllIIllIIIIlllIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIIIlllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIIIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIIIlllIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIIIlllIIlIII.init(SplashProgress.llIllIlllIIllI[8], llllllllllllIllIIllIIIIlllIIlIIl);
            return new String(llllllllllllIllIIllIIIIlllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIIIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIIIlllIIIlll) {
            llllllllllllIllIIllIIIIlllIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIIIlllIIlI(final Object llllllllllllIllIIllIIIIllIlllIIl) {
        return llllllllllllIllIIllIIIIllIlllIIl == null;
    }
    
    private static void drawProgress() {
        if (!lIIllIIIIlllIIIl(Minecraft.getMinecraft().gameSettings) || lIIllIIIIlllIIlI(Minecraft.getMinecraft().getTextureManager())) {
            return;
        }
        if (lIIllIIIIlllIIlI(SplashProgress.ufr)) {
            SplashProgress.ufr = UnicodeFontRenderer.getFontOnPC(SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[8]], SplashProgress.llIllIlllIIllI[9]);
        }
        final ScaledResolution llllllllllllIllIIllIIIIllllllIlI = new ScaledResolution(Minecraft.getMinecraft());
        final double llllllllllllIllIIllIIIIllllllIIl = SplashProgress.PROGRESS;
        final double llllllllllllIllIIllIIIIllllllIII = llllllllllllIllIIllIIIIllllllIIl / 7.0 * llllllllllllIllIIllIIIIllllllIlI.getScaledWidth();
        Gui.drawRect(SplashProgress.llIllIlllIIllI[1], llllllllllllIllIIllIIIIllllllIlI.getScaledHeight() - SplashProgress.llIllIlllIIllI[10], llllllllllllIllIIllIIIIllllllIlI.getScaledWidth(), llllllllllllIllIIllIIIIllllllIlI.getScaledHeight(), new Color(SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[11]).getRGB());
        GlStateManager.resetColor();
        resetTexutreState();
        SplashProgress.ufr.drawString(SplashProgress.CURRENT, 20.0f, (float)(llllllllllllIllIIllIIIIllllllIlI.getScaledHeight() - SplashProgress.llIllIlllIIllI[12]), SplashProgress.llIllIlllIIllI[13]);
        "".length();
        final String llllllllllllIllIIllIIIIlllllIlll = String.valueOf(new StringBuilder(String.valueOf(SplashProgress.PROGRESS)).append(SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[14]]).append(SplashProgress.llIllIlllIIllI[0]));
        SplashProgress.ufr.drawString(llllllllllllIllIIllIIIIlllllIlll, (float)(llllllllllllIllIIllIIIIllllllIlI.getScaledWidth() - SplashProgress.llIllIlllIIllI[9] - SplashProgress.ufr.getStringWidth(llllllllllllIllIIllIIIIlllllIlll)), (float)(llllllllllllIllIIllIIIIllllllIlI.getScaledHeight() - SplashProgress.llIllIlllIIllI[12]), SplashProgress.llIllIlllIIllI[15]);
        "".length();
        GlStateManager.resetColor();
        resetTexutreState();
        Gui.drawRect(SplashProgress.llIllIlllIIllI[1], llllllllllllIllIIllIIIIllllllIlI.getScaledHeight() - SplashProgress.llIllIlllIIllI[8], (int)llllllllllllIllIIllIIIIllllllIII, llllllllllllIllIIllIIIIllllllIlI.getScaledHeight(), new Color(SplashProgress.llIllIlllIIllI[16], SplashProgress.llIllIlllIIllI[17], SplashProgress.llIllIlllIIllI[18]).getRGB());
        Gui.drawRect(SplashProgress.llIllIlllIIllI[1], llllllllllllIllIIllIIIIllllllIlI.getScaledHeight() - SplashProgress.llIllIlllIIllI[8], llllllllllllIllIIllIIIIllllllIlI.getScaledWidth(), llllllllllllIllIIllIIIIllllllIlI.getScaledHeight(), new Color(SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[19]).getRGB());
    }
    
    public static void drawSplash(final TextureManager llllllllllllIllIIllIIIlIIIIIIllI) {
        final ScaledResolution llllllllllllIllIIllIIIlIIIIIIlIl = new ScaledResolution(Minecraft.getMinecraft());
        final int llllllllllllIllIIllIIIlIIIIIIlII = llllllllllllIllIIllIIIlIIIIIIlIl.getScaleFactor();
        final Framebuffer llllllllllllIllIIllIIIlIIIIIIIll = new Framebuffer(llllllllllllIllIIllIIIlIIIIIIlIl.getScaledWidth() * llllllllllllIllIIllIIIlIIIIIIlII, llllllllllllIllIIllIIIlIIIIIIlIl.getScaledHeight() * llllllllllllIllIIllIIIlIIIIIIlII, (boolean)(SplashProgress.llIllIlllIIllI[2] != 0));
        llllllllllllIllIIllIIIlIIIIIIIll.bindFramebuffer((boolean)(SplashProgress.llIllIlllIIllI[1] != 0));
        GlStateManager.matrixMode(SplashProgress.llIllIlllIIllI[3]);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0, llllllllllllIllIIllIIIlIIIIIIlIl.getScaledWidth(), llllllllllllIllIIllIIIlIIIIIIlIl.getScaledHeight(), 0.0, 1000.0, 3000.0);
        GlStateManager.matrixMode(SplashProgress.llIllIlllIIllI[4]);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0f, 0.0f, -2000.0f);
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.disableDepth();
        GlStateManager.enableTexture2D();
        if (lIIllIIIIlllIIlI(SplashProgress.splash)) {
            SplashProgress.splash = new ResourceLocation(SplashProgress.llIllIlIllIlIl[SplashProgress.llIllIlllIIllI[2]]);
        }
        llllllllllllIllIIllIIIlIIIIIIllI.bindTexture(SplashProgress.splash);
        GlStateManager.resetColor();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        Gui.drawScaledCustomSizeModalRect(SplashProgress.llIllIlllIIllI[1], SplashProgress.llIllIlllIIllI[1], 0.0f, 0.0f, SplashProgress.llIllIlllIIllI[5], SplashProgress.llIllIlllIIllI[6], llllllllllllIllIIllIIIlIIIIIIlIl.getScaledWidth(), llllllllllllIllIIllIIIlIIIIIIlIl.getScaledHeight(), 1920.0f, 1080.0f);
        drawProgress();
        llllllllllllIllIIllIIIlIIIIIIIll.unbindFramebuffer();
        llllllllllllIllIIllIIIlIIIIIIIll.framebufferRender(llllllllllllIllIIllIIIlIIIIIIlIl.getScaledWidth() * llllllllllllIllIIllIIIlIIIIIIlII, llllllllllllIllIIllIIIlIIIIIIlIl.getScaledHeight() * llllllllllllIllIIllIIIlIIIIIIlII);
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(SplashProgress.llIllIlllIIllI[7], 0.1f);
        Minecraft.getMinecraft().updateDisplay();
    }
    
    public static void update() {
        if (!lIIllIIIIlllIIIl(Minecraft.getMinecraft()) || lIIllIIIIlllIIlI(Minecraft.getMinecraft().getLanguageManager())) {
            return;
        }
        drawSplash(Minecraft.getMinecraft().getTextureManager());
    }
    
    public static void setProgresss(final int llllllllllllIllIIllIIIlIIIIIlllI, final String llllllllllllIllIIllIIIlIIIIIllIl) {
        SplashProgress.PROGRESS = llllllllllllIllIIllIIIlIIIIIlllI;
        SplashProgress.CURRENT = llllllllllllIllIIllIIIlIIIIIllIl;
        update();
    }
    
    private static void resetTexutreState() {
        GlStateManager.textureState[GlStateManager.activeTextureUnit].textureName = SplashProgress.llIllIlllIIllI[13];
    }
}
