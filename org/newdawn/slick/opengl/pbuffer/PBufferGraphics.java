// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.pbuffer;

import org.newdawn.slick.opengl.Texture;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.RenderTexture;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.SlickCallable;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.util.Log;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Image;
import org.lwjgl.opengl.Pbuffer;
import org.newdawn.slick.Graphics;

public class PBufferGraphics extends Graphics
{
    private /* synthetic */ Pbuffer pbuffer;
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] lIIlIIlIIlIllI;
    private static final /* synthetic */ String[] lIIlIIlIIlIlIl;
    
    @Override
    public void destroy() {
        super.destroy();
        this.pbuffer.destroy();
    }
    
    private static String llIIllIIlIlIIlI(String lllllllllllllIIllIllllIlllIlIlll, final String lllllllllllllIIllIllllIlllIlIllI) {
        lllllllllllllIIllIllllIlllIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIIllIllllIlllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllllIlllIllIlI = new StringBuilder();
        final char[] lllllllllllllIIllIllllIlllIllIIl = lllllllllllllIIllIllllIlllIlIllI.toCharArray();
        int lllllllllllllIIllIllllIlllIllIII = PBufferGraphics.lIIlIIlIIlIllI[0];
        final boolean lllllllllllllIIllIllllIlllIlIIlI = (Object)lllllllllllllIIllIllllIlllIlIlll.toCharArray();
        final long lllllllllllllIIllIllllIlllIlIIIl = lllllllllllllIIllIllllIlllIlIIlI.length;
        String lllllllllllllIIllIllllIlllIlIIII = (String)PBufferGraphics.lIIlIIlIIlIllI[0];
        while (llIIllIIlIllIIl((int)lllllllllllllIIllIllllIlllIlIIII, (int)lllllllllllllIIllIllllIlllIlIIIl)) {
            final char lllllllllllllIIllIllllIlllIlllIl = lllllllllllllIIllIllllIlllIlIIlI[lllllllllllllIIllIllllIlllIlIIII];
            lllllllllllllIIllIllllIlllIllIlI.append((char)(lllllllllllllIIllIllllIlllIlllIl ^ lllllllllllllIIllIllllIlllIllIIl[lllllllllllllIIllIllllIlllIllIII % lllllllllllllIIllIllllIlllIllIIl.length]));
            "".length();
            ++lllllllllllllIIllIllllIlllIllIII;
            ++lllllllllllllIIllIllllIlllIlIIII;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllllIlllIllIlI);
    }
    
    private static String llIIllIIlIlIlII(final String lllllllllllllIIllIllllIlllIIIlIl, final String lllllllllllllIIllIllllIlllIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIlllIIIllI.getBytes(StandardCharsets.UTF_8)), PBufferGraphics.lIIlIIlIIlIllI[5]), "DES");
            final Cipher lllllllllllllIIllIllllIlllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIllllIlllIIlIIl.init(PBufferGraphics.lIIlIIlIIlIllI[2], lllllllllllllIIllIllllIlllIIlIlI);
            return new String(lllllllllllllIIllIllllIlllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIlllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIlllIIlIII) {
            lllllllllllllIIllIllllIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllIIlIlIIll(final String lllllllllllllIIllIllllIllllIllII, final String lllllllllllllIIllIllllIllllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllllIllllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllllIllllIlllI.init(PBufferGraphics.lIIlIIlIIlIllI[2], lllllllllllllIIllIllllIllllIllll);
            return new String(lllllllllllllIIllIllllIllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIllllIllIl) {
            lllllllllllllIIllIllllIllllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllIIlIlIllI() {
        (lIIlIIlIIlIllI = new int[19])[0] = ((0x42 ^ 0x55) & ~(0x5F ^ 0x48));
        PBufferGraphics.lIIlIIlIIlIllI[1] = " ".length();
        PBufferGraphics.lIIlIIlIIlIllI[2] = "  ".length();
        PBufferGraphics.lIIlIIlIIlIllI[3] = "   ".length();
        PBufferGraphics.lIIlIIlIIlIllI[4] = (0xFFFFE37B & 0x3CFE);
        PBufferGraphics.lIIlIIlIIlIllI[5] = (0xB6 ^ 0xBE);
        PBufferGraphics.lIIlIIlIIlIllI[6] = (-(0xFFFFDB93 & 0x767D) & (0xFFFFDFF7 & 0x7FF9));
        PBufferGraphics.lIIlIIlIIlIllI[7] = (0xFFFFF783 & 0x28FF);
        PBufferGraphics.lIIlIIlIIlIllI[8] = (0x59 ^ 0x5D);
        PBufferGraphics.lIIlIIlIIlIllI[9] = (0x19 ^ 0x58 ^ (0x37 ^ 0x73));
        PBufferGraphics.lIIlIIlIIlIllI[10] = (0xFFFFBF85 & 0x5D7B);
        PBufferGraphics.lIIlIIlIIlIllI[11] = (0xFFFFDF79 & 0x2BF7);
        PBufferGraphics.lIIlIIlIIlIllI[12] = (-(17 + 144 - 51 + 60) & (0xFFFFEFFD & 0x1BFB));
        PBufferGraphics.lIIlIIlIIlIllI[13] = (-(0xD1 ^ 0xC4) & (0xFFFFEBFF & 0x1FF6));
        PBufferGraphics.lIIlIIlIIlIllI[14] = (-(0xFFFFB0CF & 0x7F79) & (0xFFFFB75E & 0x7BEB));
        PBufferGraphics.lIIlIIlIIlIllI[15] = (-(0xFFFFD6D7 & 0x79ED) & (-1 & 0x53C7));
        PBufferGraphics.lIIlIIlIIlIllI[16] = (0xFFFF9749 & 0x7FB6);
        PBufferGraphics.lIIlIIlIIlIllI[17] = (0xFFFFD77F & 0x3F81);
        PBufferGraphics.lIIlIIlIIlIllI[18] = (22 + 41 + 71 + 46 ^ 117 + 75 - 161 + 147);
    }
    
    private static boolean llIIllIIlIlIlll(final int lllllllllllllIIllIllllIllIlllIlI) {
        return lllllllllllllIIllIllllIllIlllIlI == 0;
    }
    
    protected void enterOrtho() {
        GL11.glMatrixMode(PBufferGraphics.lIIlIIlIIlIllI[17]);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.screenWidth, 0.0, (double)this.screenHeight, 1.0, -1.0);
        GL11.glMatrixMode(PBufferGraphics.lIIlIIlIIlIllI[16]);
    }
    
    @Override
    protected void disable() {
        PBufferGraphics.GL.flush();
        PBufferGraphics.GL.glBindTexture(PBufferGraphics.lIIlIIlIIlIllI[6], this.image.getTexture().getTextureID());
        this.pbuffer.bindTexImage(PBufferGraphics.lIIlIIlIIlIllI[7]);
        try {
            Display.makeCurrent();
            "".length();
            if (((0x63 ^ 0x45) & ~(0x39 ^ 0x1F)) <= -" ".length()) {
                return;
            }
        }
        catch (LWJGLException lllllllllllllIIllIlllllIIIIIlIIl) {
            Log.error((Throwable)lllllllllllllIIllIlllllIIIIIlIIl);
        }
        SlickCallable.leaveSafeBlock();
    }
    
    static {
        llIIllIIlIlIllI();
        llIIllIIlIlIlIl();
    }
    
    private static boolean llIIllIIlIllIIl(final int lllllllllllllIIllIllllIllIllllll, final int lllllllllllllIIllIllllIllIlllllI) {
        return lllllllllllllIIllIllllIllIllllll < lllllllllllllIIllIllllIllIlllllI;
    }
    
    public PBufferGraphics(final Image lllllllllllllIIllIlllllIIIIllIII) throws SlickException {
        super(lllllllllllllIIllIlllllIIIIllIII.getTexture().getTextureWidth(), lllllllllllllIIllIlllllIIIIllIII.getTexture().getTextureHeight());
        this.image = lllllllllllllIIllIlllllIIIIllIII;
        Log.debug(String.valueOf(new StringBuilder().append(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[0]]).append(lllllllllllllIIllIlllllIIIIllIII.getWidth()).append(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[1]]).append(lllllllllllllIIllIlllllIIIIllIII.getHeight())));
        if (llIIllIIlIlIlll(Pbuffer.getCapabilities() & PBufferGraphics.lIIlIIlIIlIllI[1])) {
            throw new SlickException(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[2]]);
        }
        if (llIIllIIlIlIlll(Pbuffer.getCapabilities() & PBufferGraphics.lIIlIIlIIlIllI[2])) {
            throw new SlickException(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[3]]);
        }
        this.init();
    }
    
    private static void llIIllIIlIlIlIl() {
        (lIIlIIlIIlIlIl = new String[PBufferGraphics.lIIlIIlIIlIllI[18]])[PBufferGraphics.lIIlIIlIIlIllI[0]] = llIIllIIlIlIIlI("FxczNAw9CzF1CDYQMDMdJk0kIQx9RQ==", "TeVUx");
        PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[1]] = llIIllIIlIlIIlI("Mg==", "JFbNY");
        PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[2]] = llIIllIIlIlIIll("EEGqjP4oUGVk7HmmOxcylDqK19Fe///+Rke1EKWNygs6W2GwOO3n20FUId17KWe6EVFSIzCmZWvQ135NHv9VQMEf88GkZtBnyHkYUjf1TjPv3kCSKsXYftFxLX+NFDkDfiw94Go3iKGUOM6YlEWa2H6ix0yvZDd8", "FDuBC");
        PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[3]] = llIIllIIlIlIIlI("LT4nF087ITcLKDhxMQQdEHE2CgoHcTwKG1QiJxUfGyMmRT0RPzYAHVkFPUg7ESkmEB0RcTMLC1Q5NwsMEXExBAFTJXINDho1PgBPADk3RQsNPzMIBhdxOwgOEzQhRR0RICcMHRE1cgMABnEmDQYHcTMVHxg4MQQbHT48Sw==", "tQReo");
        PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[8]] = llIIllIIlIlIIlI("FwsMHQs1ShEeTjIYABAaNEo1Mxs3DAADTjcFF1EKKAQEHAcySgwcDzYPS1EhIQ8LNiJxDhcYGDQYRRcPOAYQAwtu", "Qjeqn");
        PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[9]] = llIIllIIlIlIlII("cWnnbCebtYDtF0pyDggfOk/otIXo9DcR8/pM8meAdxw=", "PDCXZ");
    }
    
    @Override
    protected void enable() {
        SlickCallable.enterSafeBlock();
        try {
            if (llIIllIIlIllIII(this.pbuffer.isBufferLost() ? 1 : 0)) {
                this.pbuffer.destroy();
                this.init();
            }
            this.pbuffer.makeCurrent();
            "".length();
            if ((0x28 ^ 0x2C) != (0xA2 ^ 0xA6)) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIlllllIIIIIIIll) {
            Log.error(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[9]]);
            throw new RuntimeException(lllllllllllllIIllIlllllIIIIIIIll);
        }
        PBufferGraphics.GL.glBindTexture(PBufferGraphics.lIIlIIlIIlIllI[6], this.image.getTexture().getTextureID());
        this.pbuffer.releaseTexImage(PBufferGraphics.lIIlIIlIIlIllI[7]);
        TextureImpl.unbind();
        this.initGL();
    }
    
    private void init() throws SlickException {
        try {
            final Texture lllllllllllllIIllIlllllIIIIlIIlI = InternalTextureLoader.get().createTexture(this.image.getWidth(), this.image.getHeight(), this.image.getFilter());
            final RenderTexture lllllllllllllIIllIlllllIIIIlIIIl = new RenderTexture((boolean)(PBufferGraphics.lIIlIIlIIlIllI[0] != 0), (boolean)(PBufferGraphics.lIIlIIlIIlIllI[1] != 0), (boolean)(PBufferGraphics.lIIlIIlIIlIllI[0] != 0), (boolean)(PBufferGraphics.lIIlIIlIIlIllI[0] != 0), PBufferGraphics.lIIlIIlIIlIllI[4], PBufferGraphics.lIIlIIlIIlIllI[0]);
            this.pbuffer = new Pbuffer(this.screenWidth, this.screenHeight, new PixelFormat(PBufferGraphics.lIIlIIlIIlIllI[5], PBufferGraphics.lIIlIIlIIlIllI[0], PBufferGraphics.lIIlIIlIIlIllI[0]), lllllllllllllIIllIlllllIIIIlIIIl, (Drawable)null);
            this.pbuffer.makeCurrent();
            this.initGL();
            PBufferGraphics.GL.glBindTexture(PBufferGraphics.lIIlIIlIIlIllI[6], lllllllllllllIIllIlllllIIIIlIIlI.getTextureID());
            this.pbuffer.releaseTexImage(PBufferGraphics.lIIlIIlIIlIllI[7]);
            this.image.draw(0.0f, 0.0f);
            this.image.setTexture(lllllllllllllIIllIlllllIIIIlIIlI);
            Display.makeCurrent();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIlllllIIIIlIIII) {
            Log.error(lllllllllllllIIllIlllllIIIIlIIII);
            throw new SlickException(PBufferGraphics.lIIlIIlIIlIlIl[PBufferGraphics.lIIlIIlIIlIllI[8]]);
        }
    }
    
    private static boolean llIIllIIlIllIII(final int lllllllllllllIIllIllllIllIllllII) {
        return lllllllllllllIIllIllllIllIllllII != 0;
    }
    
    @Override
    public void flush() {
        super.flush();
        this.image.flushPixelData();
    }
    
    protected void initGL() {
        GL11.glEnable(PBufferGraphics.lIIlIIlIIlIllI[6]);
        GL11.glShadeModel(PBufferGraphics.lIIlIIlIIlIllI[10]);
        GL11.glDisable(PBufferGraphics.lIIlIIlIIlIllI[11]);
        GL11.glDisable(PBufferGraphics.lIIlIIlIIlIllI[12]);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(PBufferGraphics.lIIlIIlIIlIllI[13]);
        GL11.glBlendFunc(PBufferGraphics.lIIlIIlIIlIllI[14], PBufferGraphics.lIIlIIlIIlIllI[15]);
        GL11.glViewport(PBufferGraphics.lIIlIIlIIlIllI[0], PBufferGraphics.lIIlIIlIIlIllI[0], this.screenWidth, this.screenHeight);
        GL11.glMatrixMode(PBufferGraphics.lIIlIIlIIlIllI[16]);
        GL11.glLoadIdentity();
        this.enterOrtho();
    }
}
