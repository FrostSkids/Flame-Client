// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.shader;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Framebuffer
{
    private static final /* synthetic */ int[] lIIIIlIIlIlIll;
    public /* synthetic */ int framebufferTexture;
    public /* synthetic */ int framebufferTextureHeight;
    private static final /* synthetic */ String[] lIIIIlIIlIIlII;
    public /* synthetic */ int framebufferTextureWidth;
    public /* synthetic */ int framebufferObject;
    public /* synthetic */ int depthBuffer;
    public /* synthetic */ int framebufferFilter;
    public /* synthetic */ int framebufferHeight;
    public /* synthetic */ boolean useDepth;
    public /* synthetic */ float[] framebufferColor;
    public /* synthetic */ int framebufferWidth;
    
    private static boolean lIlllIIIlIllIII(final int lllllllllllllIlIIllIIIIlIllIlllI) {
        return lllllllllllllIlIIllIIIIlIllIlllI == 0;
    }
    
    private static boolean lIlllIIIlIllIll(final int lllllllllllllIlIIllIIIIlIlllIIll, final int lllllllllllllIlIIllIIIIlIlllIIlI) {
        return lllllllllllllIlIIllIIIIlIlllIIll > lllllllllllllIlIIllIIIIlIlllIIlI;
    }
    
    static {
        lIlllIIIlIlIlll();
        lIlllIIIlIlIIII();
    }
    
    private static String lIlllIIIlIIllll(final String lllllllllllllIlIIllIIIIllIIlIIII, final String lllllllllllllIlIIllIIIIllIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIIllIIIllll.getBytes(StandardCharsets.UTF_8)), Framebuffer.lIIIIlIIlIlIll[23]), "DES");
            final Cipher lllllllllllllIlIIllIIIIllIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIllIIIIllIIlIIlI.init(Framebuffer.lIIIIlIIlIlIll[4], lllllllllllllIlIIllIIIIllIIlIIll);
            return new String(lllllllllllllIlIIllIIIIllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIIllIIlIIIl) {
            lllllllllllllIlIIllIIIIllIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public void bindFramebufferTexture() {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            GlStateManager.bindTexture(this.framebufferTexture);
        }
    }
    
    public void setFramebufferFilter(final int lllllllllllllIlIIllIIIIlllllllIl) {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            this.framebufferFilter = lllllllllllllIlIIllIIIIlllllllIl;
            GlStateManager.bindTexture(this.framebufferTexture);
            GL11.glTexParameterf(Framebuffer.lIIIIlIIlIlIll[7], Framebuffer.lIIIIlIIlIlIll[12], (float)lllllllllllllIlIIllIIIIlllllllIl);
            GL11.glTexParameterf(Framebuffer.lIIIIlIIlIlIll[7], Framebuffer.lIIIIlIIlIlIll[13], (float)lllllllllllllIlIIllIIIIlllllllIl);
            GL11.glTexParameterf(Framebuffer.lIIIIlIIlIlIll[7], Framebuffer.lIIIIlIIlIlIll[14], 10496.0f);
            GL11.glTexParameterf(Framebuffer.lIIIIlIIlIlIll[7], Framebuffer.lIIIIlIIlIlIll[15], 10496.0f);
            GlStateManager.bindTexture(Framebuffer.lIIIIlIIlIlIll[2]);
        }
    }
    
    public void framebufferClear() {
        this.bindFramebuffer((boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0));
        GlStateManager.clearColor(this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[2]], this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[3]], this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[4]], this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[5]]);
        int lllllllllllllIlIIllIIIIllIllIIlI = Framebuffer.lIIIIlIIlIlIll[20];
        if (lIlllIIIlIllIlI(this.useDepth ? 1 : 0)) {
            GlStateManager.clearDepth(1.0);
            lllllllllllllIlIIllIIIIllIllIIlI |= Framebuffer.lIIIIlIIlIlIll[21];
        }
        GlStateManager.clear(lllllllllllllIlIIllIIIIllIllIIlI);
        this.unbindFramebuffer();
    }
    
    private static void lIlllIIIlIlIlll() {
        (lIIIIlIIlIlIll = new int[24])[0] = -" ".length();
        Framebuffer.lIIIIlIIlIlIll[1] = (0xBE ^ 0xBA);
        Framebuffer.lIIIIlIIlIlIll[2] = ((84 + 53 - 61 + 51 ^ (0x99 ^ 0x86)) & (4 + 217 - 132 + 165 ^ 32 + 103 + 4 + 19 ^ -" ".length()));
        Framebuffer.lIIIIlIIlIlIll[3] = " ".length();
        Framebuffer.lIIIIlIIlIlIll[4] = "  ".length();
        Framebuffer.lIIIIlIIlIlIll[5] = "   ".length();
        Framebuffer.lIIIIlIIlIlIll[6] = (0xFFFFE78E & 0x3E71);
        Framebuffer.lIIIIlIIlIlIll[7] = (-(0xFFFFEA2D & 0x37DF) & (0xFFFFBFEF & 0x6FFD));
        Framebuffer.lIIIIlIIlIlIll[8] = (-(0xFFFFFD88 & 0x26FF) & (0xFFFFB5DF & 0xEEFF));
        Framebuffer.lIIIIlIIlIlIll[9] = (-(0xFFFFAFDB & 0x56B7) & (0xFFFFBFFA & 0x5F9F));
        Framebuffer.lIIIIlIIlIlIll[10] = (0xFFFF9633 & 0x7DCD);
        Framebuffer.lIIIIlIIlIlIll[11] = (-(0xFFFFFEFF & 0x7F11) & (0xFFFFFFFE & 0xFFB7));
        Framebuffer.lIIIIlIIlIlIll[12] = (0xFFFFBA4D & 0x6DB3);
        Framebuffer.lIIIIlIIlIlIll[13] = (0xFFFFBC17 & 0x6BE8);
        Framebuffer.lIIIIlIIlIlIll[14] = (0xFFFFBCD7 & 0x6B2A);
        Framebuffer.lIIIIlIIlIlIll[15] = (0xFFFFBF03 & 0x68FF);
        Framebuffer.lIIIIlIIlIlIll[16] = (0xFFFFFFF7 & 0x1709);
        Framebuffer.lIIIIlIIlIlIll[17] = (-(0xFFFFEDF7 & 0x3AAD) & (0xFFFFBFB7 & 0x7FEC));
        Framebuffer.lIIIIlIIlIlIll[18] = (0x44 ^ 0x43);
        Framebuffer.lIIIIlIIlIlIll[19] = (0x48 ^ 0x7E) + (95 + 64 - 112 + 156) - (0x6D ^ 0x19) + (0x27 ^ 0x55);
        Framebuffer.lIIIIlIIlIlIll[20] = (0xFFFFD32F & 0x6CD0);
        Framebuffer.lIIIIlIIlIlIll[21] = (0xFFFFB3E8 & 0x4D17);
        Framebuffer.lIIIIlIIlIlIll[22] = (0xC3 ^ 0x87 ^ (0xC5 ^ 0x84));
        Framebuffer.lIIIIlIIlIlIll[23] = (0x52 ^ 0x5A);
    }
    
    private static boolean lIlllIIIlIllIlI(final int lllllllllllllIlIIllIIIIlIlllIIII) {
        return lllllllllllllIlIIllIIIIlIlllIIII != 0;
    }
    
    public void createBindFramebuffer(final int lllllllllllllIlIIllIIIlIIIIlIIIl, final int lllllllllllllIlIIllIIIlIIIIIllIl) {
        if (lIlllIIIlIllIII(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            this.framebufferWidth = lllllllllllllIlIIllIIIlIIIIlIIIl;
            this.framebufferHeight = lllllllllllllIlIIllIIIlIIIIIllIl;
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            GlStateManager.enableDepth();
            if (lIlllIIIlIllIIl(this.framebufferObject)) {
                this.deleteFramebuffer();
            }
            this.createFramebuffer(lllllllllllllIlIIllIIIlIIIIlIIIl, lllllllllllllIlIIllIIIlIIIIIllIl);
            this.checkFramebufferComplete();
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, Framebuffer.lIIIIlIIlIlIll[2]);
        }
    }
    
    private static String lIlllIIIlIIIlII(String lllllllllllllIlIIllIIIIllIlIIlIl, final String lllllllllllllIlIIllIIIIllIlIIlII) {
        lllllllllllllIlIIllIIIIllIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIIIllIlIIIll = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIIllIlIIIlI = lllllllllllllIlIIllIIIIllIlIIlII.toCharArray();
        int lllllllllllllIlIIllIIIIllIlIIIIl = Framebuffer.lIIIIlIIlIlIll[2];
        final char lllllllllllllIlIIllIIIIllIIllIll = (Object)lllllllllllllIlIIllIIIIllIlIIlIl.toCharArray();
        final boolean lllllllllllllIlIIllIIIIllIIllIlI = lllllllllllllIlIIllIIIIllIIllIll.length != 0;
        Exception lllllllllllllIlIIllIIIIllIIllIIl = (Exception)Framebuffer.lIIIIlIIlIlIll[2];
        while (lIlllIIIlIllllI((int)lllllllllllllIlIIllIIIIllIIllIIl, lllllllllllllIlIIllIIIIllIIllIlI ? 1 : 0)) {
            final char lllllllllllllIlIIllIIIIllIlIIllI = lllllllllllllIlIIllIIIIllIIllIll[lllllllllllllIlIIllIIIIllIIllIIl];
            lllllllllllllIlIIllIIIIllIlIIIll.append((char)(lllllllllllllIlIIllIIIIllIlIIllI ^ lllllllllllllIlIIllIIIIllIlIIIlI[lllllllllllllIlIIllIIIIllIlIIIIl % lllllllllllllIlIIllIIIIllIlIIIlI.length]));
            "".length();
            ++lllllllllllllIlIIllIIIIllIlIIIIl;
            ++lllllllllllllIlIIllIIIIllIIllIIl;
            "".length();
            if (((0xBC ^ 0x84) & ~(0x78 ^ 0x40)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIIIllIlIIIll);
    }
    
    public void framebufferRender(final int lllllllllllllIlIIllIIIIlllIllIII, final int lllllllllllllIlIIllIIIIlllIlIlll) {
        this.framebufferRenderExt(lllllllllllllIlIIllIIIIlllIllIII, lllllllllllllIlIIllIIIIlllIlIlll, (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0));
    }
    
    public void createFramebuffer(final int lllllllllllllIlIIllIIIlIIIIIIlIl, final int lllllllllllllIlIIllIIIlIIIIIIlII) {
        this.framebufferWidth = lllllllllllllIlIIllIIIlIIIIIIlIl;
        this.framebufferHeight = lllllllllllllIlIIllIIIlIIIIIIlII;
        this.framebufferTextureWidth = lllllllllllllIlIIllIIIlIIIIIIlIl;
        this.framebufferTextureHeight = lllllllllllllIlIIllIIIlIIIIIIlII;
        if (lIlllIIIlIllIII(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            this.framebufferClear();
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            this.framebufferObject = OpenGlHelper.glGenFramebuffers();
            this.framebufferTexture = TextureUtil.glGenTextures();
            if (lIlllIIIlIllIlI(this.useDepth ? 1 : 0)) {
                this.depthBuffer = OpenGlHelper.glGenRenderbuffers();
            }
            this.setFramebufferFilter(Framebuffer.lIIIIlIIlIlIll[6]);
            GlStateManager.bindTexture(this.framebufferTexture);
            GL11.glTexImage2D(Framebuffer.lIIIIlIIlIlIll[7], Framebuffer.lIIIIlIIlIlIll[2], Framebuffer.lIIIIlIIlIlIll[8], this.framebufferTextureWidth, this.framebufferTextureHeight, Framebuffer.lIIIIlIIlIlIll[2], Framebuffer.lIIIIlIIlIlIll[9], Framebuffer.lIIIIlIIlIlIll[10], (ByteBuffer)null);
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, this.framebufferObject);
            OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, Framebuffer.lIIIIlIIlIlIll[7], this.framebufferTexture, Framebuffer.lIIIIlIIlIlIll[2]);
            if (lIlllIIIlIllIlI(this.useDepth ? 1 : 0)) {
                OpenGlHelper.glBindRenderbuffer(OpenGlHelper.GL_RENDERBUFFER, this.depthBuffer);
                OpenGlHelper.glRenderbufferStorage(OpenGlHelper.GL_RENDERBUFFER, Framebuffer.lIIIIlIIlIlIll[11], this.framebufferTextureWidth, this.framebufferTextureHeight);
                OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, OpenGlHelper.GL_RENDERBUFFER, this.depthBuffer);
            }
            this.framebufferClear();
            this.unbindFramebufferTexture();
        }
    }
    
    public void unbindFramebufferTexture() {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            GlStateManager.bindTexture(Framebuffer.lIIIIlIIlIlIll[2]);
        }
    }
    
    public void bindFramebuffer(final boolean lllllllllllllIlIIllIIIIllllIllIl) {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, this.framebufferObject);
            if (lIlllIIIlIllIlI(lllllllllllllIlIIllIIIIllllIllIl ? 1 : 0)) {
                GlStateManager.viewport(Framebuffer.lIIIIlIIlIlIll[2], Framebuffer.lIIIIlIIlIlIll[2], this.framebufferWidth, this.framebufferHeight);
            }
        }
    }
    
    public Framebuffer(final int lllllllllllllIlIIllIIIlIIIIlllII, final int lllllllllllllIlIIllIIIlIIIIlIlll, final boolean lllllllllllllIlIIllIIIlIIIIllIlI) {
        this.useDepth = lllllllllllllIlIIllIIIlIIIIllIlI;
        this.framebufferObject = Framebuffer.lIIIIlIIlIlIll[0];
        this.framebufferTexture = Framebuffer.lIIIIlIIlIlIll[0];
        this.depthBuffer = Framebuffer.lIIIIlIIlIlIll[0];
        this.framebufferColor = new float[Framebuffer.lIIIIlIIlIlIll[1]];
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[2]] = 1.0f;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[3]] = 1.0f;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[4]] = 1.0f;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[5]] = 0.0f;
        this.createBindFramebuffer(lllllllllllllIlIIllIIIlIIIIlllII, lllllllllllllIlIIllIIIlIIIIlIlll);
    }
    
    private static String lIlllIIIlIIIlIl(final String lllllllllllllIlIIllIIIIllIIIIIll, final String lllllllllllllIlIIllIIIIllIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIIllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIIIIllIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIIIIllIIIIlIl.init(Framebuffer.lIIIIlIIlIlIll[4], lllllllllllllIlIIllIIIIllIIIIllI);
            return new String(lllllllllllllIlIIllIIIIllIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIIllIIIIlII) {
            lllllllllllllIlIIllIIIIllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIIIlIlllII(final int lllllllllllllIlIIllIIIIlIllIlIIl, final int lllllllllllllIlIIllIIIIlIllIlIII) {
        return lllllllllllllIlIIllIIIIlIllIlIIl != lllllllllllllIlIIllIIIIlIllIlIII;
    }
    
    private static void lIlllIIIlIlIIII() {
        (lIIIIlIIlIIlII = new String[Framebuffer.lIIIIlIIlIlIll[22]])[Framebuffer.lIIIIlIIlIlIll[2]] = lIlllIIIlIIIlII("CC0mDDoOLDwIPQknPBg3Bi86BSUfLTweLRAgLR4pDCk0DyYb", "OayJh");
        Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[3]] = lIlllIIIlIIIlIl("M3gBbl17X2hYoYOxsKVMlavybCZqVtmziMUL5EYKrqnA2X8ifInV3f/vUyKPMv8y", "BddNR");
        Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[4]] = lIlllIIIlIIllll("bjI1EvXY17+dd9ZWej04DWtpKNzx6iBwnyNvNbLy4a+AsoDUf0RIbQ==", "sfucz");
        Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[5]] = lIlllIIIlIIIlII("HTsvMzgbOjU3PxwxNSc1EzkzOicKOzUhLwUlNTQuBTUlMywfJQ==", "Zwpuj");
        Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[1]] = lIlllIIIlIIIlII("EiA3PAkWJzImDRgpFiEKEykGBxgUOAEnTAcpACEeGykQdBkbJxo7GxtsByANATkHbg==", "uLtTl");
    }
    
    public void framebufferRenderExt(final int lllllllllllllIlIIllIIIIllIlllllI, final int lllllllllllllIlIIllIIIIlllIIIlll, final boolean lllllllllllllIlIIllIIIIllIllllII) {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            GlStateManager.colorMask((boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[2] != 0));
            GlStateManager.disableDepth();
            GlStateManager.depthMask((boolean)(Framebuffer.lIIIIlIIlIlIll[2] != 0));
            GlStateManager.matrixMode(Framebuffer.lIIIIlIIlIlIll[16]);
            GlStateManager.loadIdentity();
            GlStateManager.ortho(0.0, lllllllllllllIlIIllIIIIllIlllllI, lllllllllllllIlIIllIIIIlllIIIlll, 0.0, 1000.0, 3000.0);
            GlStateManager.matrixMode(Framebuffer.lIIIIlIIlIlIll[17]);
            GlStateManager.loadIdentity();
            GlStateManager.translate(0.0f, 0.0f, -2000.0f);
            GlStateManager.viewport(Framebuffer.lIIIIlIIlIlIll[2], Framebuffer.lIIIIlIIlIlIll[2], lllllllllllllIlIIllIIIIllIlllllI, lllllllllllllIlIIllIIIIlllIIIlll);
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableAlpha();
            if (lIlllIIIlIllIlI(lllllllllllllIlIIllIIIIllIllllII ? 1 : 0)) {
                GlStateManager.disableBlend();
                GlStateManager.enableColorMaterial();
            }
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.bindFramebufferTexture();
            final float lllllllllllllIlIIllIIIIlllIIIlIl = (float)lllllllllllllIlIIllIIIIllIlllllI;
            final float lllllllllllllIlIIllIIIIlllIIIlII = (float)lllllllllllllIlIIllIIIIlllIIIlll;
            final float lllllllllllllIlIIllIIIIlllIIIIll = this.framebufferWidth / (float)this.framebufferTextureWidth;
            final float lllllllllllllIlIIllIIIIlllIIIIlI = this.framebufferHeight / (float)this.framebufferTextureHeight;
            final Tessellator lllllllllllllIlIIllIIIIlllIIIIIl = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIlIIllIIIIlllIIIIII = lllllllllllllIlIIllIIIIlllIIIIIl.getWorldRenderer();
            lllllllllllllIlIIllIIIIlllIIIIII.begin(Framebuffer.lIIIIlIIlIlIll[18], DefaultVertexFormats.POSITION_TEX_COLOR);
            lllllllllllllIlIIllIIIIlllIIIIII.pos(0.0, lllllllllllllIlIIllIIIIlllIIIlII, 0.0).tex(0.0, 0.0).color(Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19]).endVertex();
            lllllllllllllIlIIllIIIIlllIIIIII.pos(lllllllllllllIlIIllIIIIlllIIIlIl, lllllllllllllIlIIllIIIIlllIIIlII, 0.0).tex(lllllllllllllIlIIllIIIIlllIIIIll, 0.0).color(Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19]).endVertex();
            lllllllllllllIlIIllIIIIlllIIIIII.pos(lllllllllllllIlIIllIIIIlllIIIlIl, 0.0, 0.0).tex(lllllllllllllIlIIllIIIIlllIIIIll, lllllllllllllIlIIllIIIIlllIIIIlI).color(Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19]).endVertex();
            lllllllllllllIlIIllIIIIlllIIIIII.pos(0.0, 0.0, 0.0).tex(0.0, lllllllllllllIlIIllIIIIlllIIIIlI).color(Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19], Framebuffer.lIIIIlIIlIlIll[19]).endVertex();
            lllllllllllllIlIIllIIIIlllIIIIIl.draw();
            this.unbindFramebufferTexture();
            GlStateManager.depthMask((boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0));
            GlStateManager.colorMask((boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0), (boolean)(Framebuffer.lIIIIlIIlIlIll[3] != 0));
        }
    }
    
    private static boolean lIlllIIIlIlllIl(final int lllllllllllllIlIIllIIIIlIllllIll, final int lllllllllllllIlIIllIIIIlIllllIlI) {
        return lllllllllllllIlIIllIIIIlIllllIll == lllllllllllllIlIIllIIIIlIllllIlI;
    }
    
    private static boolean lIlllIIIlIllllI(final int lllllllllllllIlIIllIIIIlIlllIlll, final int lllllllllllllIlIIllIIIIlIlllIllI) {
        return lllllllllllllIlIIllIIIIlIlllIlll < lllllllllllllIlIIllIIIIlIlllIllI;
    }
    
    public void deleteFramebuffer() {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            this.unbindFramebufferTexture();
            this.unbindFramebuffer();
            if (lIlllIIIlIllIll(this.depthBuffer, Framebuffer.lIIIIlIIlIlIll[0])) {
                OpenGlHelper.glDeleteRenderbuffers(this.depthBuffer);
                this.depthBuffer = Framebuffer.lIIIIlIIlIlIll[0];
            }
            if (lIlllIIIlIllIll(this.framebufferTexture, Framebuffer.lIIIIlIIlIlIll[0])) {
                TextureUtil.deleteTexture(this.framebufferTexture);
                this.framebufferTexture = Framebuffer.lIIIIlIIlIlIll[0];
            }
            if (lIlllIIIlIllIll(this.framebufferObject, Framebuffer.lIIIIlIIlIlIll[0])) {
                OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, Framebuffer.lIIIIlIIlIlIll[2]);
                OpenGlHelper.glDeleteFramebuffers(this.framebufferObject);
                this.framebufferObject = Framebuffer.lIIIIlIIlIlIll[0];
            }
        }
    }
    
    public void checkFramebufferComplete() {
        final int lllllllllllllIlIIllIIIIllllllIII = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);
        if (!lIlllIIIlIlllII(lllllllllllllIlIIllIIIIllllllIII, OpenGlHelper.GL_FRAMEBUFFER_COMPLETE)) {
            return;
        }
        if (lIlllIIIlIlllIl(lllllllllllllIlIIllIIIIllllllIII, OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT)) {
            throw new RuntimeException(Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[2]]);
        }
        if (lIlllIIIlIlllIl(lllllllllllllIlIIllIIIIllllllIII, OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH)) {
            throw new RuntimeException(Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[3]]);
        }
        if (lIlllIIIlIlllIl(lllllllllllllIlIIllIIIIllllllIII, OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER)) {
            throw new RuntimeException(Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[4]]);
        }
        if (lIlllIIIlIlllIl(lllllllllllllIlIIllIIIIllllllIII, OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER)) {
            throw new RuntimeException(Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[5]]);
        }
        throw new RuntimeException(String.valueOf(new StringBuilder(Framebuffer.lIIIIlIIlIIlII[Framebuffer.lIIIIlIIlIlIll[1]]).append(lllllllllllllIlIIllIIIIllllllIII)));
    }
    
    public void unbindFramebuffer() {
        if (lIlllIIIlIllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, Framebuffer.lIIIIlIIlIlIll[2]);
        }
    }
    
    public void setFramebufferColor(final float lllllllllllllIlIIllIIIIllllIIlIl, final float lllllllllllllIlIIllIIIIlllIlllll, final float lllllllllllllIlIIllIIIIlllIllllI, final float lllllllllllllIlIIllIIIIlllIlllIl) {
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[2]] = lllllllllllllIlIIllIIIIllllIIlIl;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[3]] = lllllllllllllIlIIllIIIIlllIlllll;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[4]] = lllllllllllllIlIIllIIIIlllIllllI;
        this.framebufferColor[Framebuffer.lIIIIlIIlIlIll[5]] = lllllllllllllIlIIllIIIIlllIlllIl;
    }
    
    private static boolean lIlllIIIlIllIIl(final int lllllllllllllIlIIllIIIIlIllIllII) {
        return lllllllllllllIlIIllIIIIlIllIllII >= 0;
    }
}
