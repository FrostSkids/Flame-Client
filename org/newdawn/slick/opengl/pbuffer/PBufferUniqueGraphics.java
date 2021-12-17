// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.pbuffer;

import org.newdawn.slick.opengl.Texture;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.RenderTexture;
import org.lwjgl.opengl.PixelFormat;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.opengl.SlickCallable;
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

public class PBufferUniqueGraphics extends Graphics
{
    private static final /* synthetic */ String[] lIllIlIlIlllIl;
    private /* synthetic */ Pbuffer pbuffer;
    private static final /* synthetic */ int[] lIllIlIllIIIIl;
    private /* synthetic */ Image image;
    
    @Override
    public void flush() {
        super.flush();
        this.image.flushPixelData();
    }
    
    private static String llllllIllIlIllI(String llllllllllllIlllllllllIIlIlIIIll, final String llllllllllllIlllllllllIIlIlIIIlI) {
        llllllllllllIlllllllllIIlIlIIIll = new String(Base64.getDecoder().decode(llllllllllllIlllllllllIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllllIIlIlIIllI = new StringBuilder();
        final char[] llllllllllllIlllllllllIIlIlIIlIl = llllllllllllIlllllllllIIlIlIIIlI.toCharArray();
        int llllllllllllIlllllllllIIlIlIIlII = PBufferUniqueGraphics.lIllIlIllIIIIl[0];
        final boolean llllllllllllIlllllllllIIlIIllllI = (Object)llllllllllllIlllllllllIIlIlIIIll.toCharArray();
        final float llllllllllllIlllllllllIIlIIlllIl = llllllllllllIlllllllllIIlIIllllI.length;
        int llllllllllllIlllllllllIIlIIlllII = PBufferUniqueGraphics.lIllIlIllIIIIl[0];
        while (llllllIlllIlIlI(llllllllllllIlllllllllIIlIIlllII, (int)llllllllllllIlllllllllIIlIIlllIl)) {
            final char llllllllllllIlllllllllIIlIlIlIIl = llllllllllllIlllllllllIIlIIllllI[llllllllllllIlllllllllIIlIIlllII];
            llllllllllllIlllllllllIIlIlIIllI.append((char)(llllllllllllIlllllllllIIlIlIlIIl ^ llllllllllllIlllllllllIIlIlIIlIl[llllllllllllIlllllllllIIlIlIIlII % llllllllllllIlllllllllIIlIlIIlIl.length]));
            "".length();
            ++llllllllllllIlllllllllIIlIlIIlII;
            ++llllllllllllIlllllllllIIlIIlllII;
            "".length();
            if (((96 + 52 - 142 + 145 ^ 45 + 80 + 1 + 51) & (0x64 ^ 0x3B ^ (0x69 ^ 0x10) ^ -" ".length())) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllllIIlIlIIllI);
    }
    
    private static void llllllIllIlllll() {
        (lIllIlIlIlllIl = new String[PBufferUniqueGraphics.lIllIlIllIIIIl[16]])[PBufferUniqueGraphics.lIllIlIllIIIIl[0]] = llllllIllIlIllI("DR40Gx0nAjZaGSwZNxwMPEQkFAA/GTRTSQ==", "NlQzi");
        PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[1]] = llllllIllIlIlll("Xs5KzxqIE8o=", "BSlvq");
        PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[2]] = llllllIllIlIllI("PjYXJ0soKQc7LCt5ATQZA3kGOg4UeQw6H0cqFyUbCCsWdTslLAQzDhUqQjQFA3kKMAUEPEI2Cgl+FnUDBjcGOQ5HLQowSwMgDDQGDjpCPAYGPgcmSxU8EyACFTwGdQ0IK0IhAw4qQjQbFzULNgoTMA07RQ==", "gYbUk");
        PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[6]] = llllllIllIlIlll("B/0LHW2eO22gx/JTRk4S0v9azaC9nhUBS1hRpckwvyRjMdYPgbfsramuy7CtxCMpuRMkn5V89hiz9N2RZmFcu39uR5YUgAOq", "vNmzI");
        PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[7]] = llllllIllIllIll("voXzNhOwL31MmCpiqr6Esd0fKVFV9GSF6xhSrK1smUs=", "ixYSH");
    }
    
    private static String llllllIllIllIll(final String llllllllllllIlllllllllIIlIlllIII, final String llllllllllllIlllllllllIIlIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), PBufferUniqueGraphics.lIllIlIllIIIIl[3]), "DES");
            final Cipher llllllllllllIlllllllllIIlIlllIlI = Cipher.getInstance("DES");
            llllllllllllIlllllllllIIlIlllIlI.init(PBufferUniqueGraphics.lIllIlIllIIIIl[2], llllllllllllIlllllllllIIlIlllIll);
            return new String(llllllllllllIlllllllllIIlIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIlIlllIIl) {
            llllllllllllIlllllllllIIlIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllIlllIlIlI(final int llllllllllllIlllllllllIIlIIIlIll, final int llllllllllllIlllllllllIIlIIIlIlI) {
        return llllllllllllIlllllllllIIlIIIlIll < llllllllllllIlllllllllIIlIIIlIlI;
    }
    
    @Override
    protected void enable() {
        SlickCallable.enterSafeBlock();
        try {
            if (llllllIlllIlIIl(this.pbuffer.isBufferLost() ? 1 : 0)) {
                this.pbuffer.destroy();
                this.init();
            }
            this.pbuffer.makeCurrent();
            "".length();
            if ((0x61 ^ 0x65) == 0x0) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllllllIIllIIllll) {
            Log.error(PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[7]]);
            Log.error(llllllllllllIlllllllllIIllIIllll);
            throw new RuntimeException(llllllllllllIlllllllllIIllIIllll);
        }
        TextureImpl.unbind();
        this.initGL();
    }
    
    private static boolean llllllIlllIlIIl(final int llllllllllllIlllllllllIIlIIIlIII) {
        return llllllllllllIlllllllllIIlIIIlIII != 0;
    }
    
    private static String llllllIllIlIlll(final String llllllllllllIlllllllllIIlIIlIIIl, final String llllllllllllIlllllllllIIlIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllllIIlIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllllIIlIIlIlIl.init(PBufferUniqueGraphics.lIllIlIllIIIIl[2], llllllllllllIlllllllllIIlIIlIllI);
            return new String(llllllllllllIlllllllllIIlIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIlIIlIlII) {
            llllllllllllIlllllllllIIlIIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void destroy() {
        super.destroy();
        this.pbuffer.destroy();
    }
    
    static {
        llllllIlllIIlll();
        llllllIllIlllll();
    }
    
    public PBufferUniqueGraphics(final Image llllllllllllIlllllllllIIllIlllll) throws SlickException {
        super(llllllllllllIlllllllllIIllIlllll.getTexture().getTextureWidth(), llllllllllllIlllllllllIIllIlllll.getTexture().getTextureHeight());
        this.image = llllllllllllIlllllllllIIllIlllll;
        Log.debug(String.valueOf(new StringBuilder().append(PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[0]]).append(llllllllllllIlllllllllIIllIlllll.getWidth()).append(PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[1]]).append(llllllllllllIlllllllllIIllIlllll.getHeight())));
        if (llllllIlllIlIII(Pbuffer.getCapabilities() & PBufferUniqueGraphics.lIllIlIllIIIIl[1])) {
            throw new SlickException(PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[2]]);
        }
        this.init();
    }
    
    @Override
    protected void disable() {
        GL11.glBindTexture(PBufferUniqueGraphics.lIllIlIllIIIIl[4], this.image.getTexture().getTextureID());
        GL11.glCopyTexImage2D(PBufferUniqueGraphics.lIllIlIllIIIIl[4], PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[5], PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[0], this.image.getTexture().getTextureWidth(), this.image.getTexture().getTextureHeight(), PBufferUniqueGraphics.lIllIlIllIIIIl[0]);
        try {
            Display.makeCurrent();
            "".length();
            if (" ".length() == (21 + 23 + 5 + 115 ^ 106 + 54 - 30 + 30)) {
                return;
            }
        }
        catch (LWJGLException llllllllllllIlllllllllIIllIlIlIl) {
            Log.error((Throwable)llllllllllllIlllllllllIIllIlIlIl);
        }
        SlickCallable.leaveSafeBlock();
    }
    
    private static boolean llllllIlllIlIII(final int llllllllllllIlllllllllIIlIIIIllI) {
        return llllllllllllIlllllllllIIlIIIIllI == 0;
    }
    
    protected void enterOrtho() {
        GL11.glMatrixMode(PBufferUniqueGraphics.lIllIlIllIIIIl[15]);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.screenWidth, 0.0, (double)this.screenHeight, 1.0, -1.0);
        GL11.glMatrixMode(PBufferUniqueGraphics.lIllIlIllIIIIl[14]);
    }
    
    private void init() throws SlickException {
        try {
            final Texture llllllllllllIlllllllllIIllIlllII = InternalTextureLoader.get().createTexture(this.image.getWidth(), this.image.getHeight(), this.image.getFilter());
            this.pbuffer = new Pbuffer(this.screenWidth, this.screenHeight, new PixelFormat(PBufferUniqueGraphics.lIllIlIllIIIIl[3], PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[0]), (RenderTexture)null, (Drawable)null);
            this.pbuffer.makeCurrent();
            this.initGL();
            this.image.draw(0.0f, 0.0f);
            GL11.glBindTexture(PBufferUniqueGraphics.lIllIlIllIIIIl[4], llllllllllllIlllllllllIIllIlllII.getTextureID());
            GL11.glCopyTexImage2D(PBufferUniqueGraphics.lIllIlIllIIIIl[4], PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[5], PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[0], llllllllllllIlllllllllIIllIlllII.getTextureWidth(), llllllllllllIlllllllllIIllIlllII.getTextureHeight(), PBufferUniqueGraphics.lIllIlIllIIIIl[0]);
            this.image.setTexture(llllllllllllIlllllllllIIllIlllII);
            Display.makeCurrent();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllllllIIllIllIll) {
            Log.error(llllllllllllIlllllllllIIllIllIll);
            throw new SlickException(PBufferUniqueGraphics.lIllIlIlIlllIl[PBufferUniqueGraphics.lIllIlIllIIIIl[6]]);
        }
    }
    
    protected void initGL() {
        GL11.glEnable(PBufferUniqueGraphics.lIllIlIllIIIIl[4]);
        GL11.glShadeModel(PBufferUniqueGraphics.lIllIlIllIIIIl[8]);
        GL11.glDisable(PBufferUniqueGraphics.lIllIlIllIIIIl[9]);
        GL11.glDisable(PBufferUniqueGraphics.lIllIlIllIIIIl[10]);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(PBufferUniqueGraphics.lIllIlIllIIIIl[11]);
        GL11.glBlendFunc(PBufferUniqueGraphics.lIllIlIllIIIIl[12], PBufferUniqueGraphics.lIllIlIllIIIIl[13]);
        GL11.glViewport(PBufferUniqueGraphics.lIllIlIllIIIIl[0], PBufferUniqueGraphics.lIllIlIllIIIIl[0], this.screenWidth, this.screenHeight);
        GL11.glMatrixMode(PBufferUniqueGraphics.lIllIlIllIIIIl[14]);
        GL11.glLoadIdentity();
        this.enterOrtho();
    }
    
    private static void llllllIlllIIlll() {
        (lIllIlIllIIIIl = new int[17])[0] = ((0xC0 ^ 0x98 ^ (0xD4 ^ 0xB9)) & (0x80 ^ 0xC1 ^ (0x4B ^ 0x3F) ^ -" ".length()));
        PBufferUniqueGraphics.lIllIlIllIIIIl[1] = " ".length();
        PBufferUniqueGraphics.lIllIlIllIIIIl[2] = "  ".length();
        PBufferUniqueGraphics.lIllIlIllIIIIl[3] = (0x2A ^ 0x22);
        PBufferUniqueGraphics.lIllIlIllIIIIl[4] = (0xFFFFDFE3 & 0x2DFD);
        PBufferUniqueGraphics.lIllIlIllIIIIl[5] = (0xFFFFBDBC & 0x5B4B);
        PBufferUniqueGraphics.lIllIlIllIIIIl[6] = "   ".length();
        PBufferUniqueGraphics.lIllIlIllIIIIl[7] = (0x8D ^ 0x89);
        PBufferUniqueGraphics.lIllIlIllIIIIl[8] = (0xFFFFDF0F & 0x3DF1);
        PBufferUniqueGraphics.lIllIlIllIIIIl[9] = (-(0xFFFFF8F7 & 0x178B) & (0xFFFF9BFB & 0x7FF7));
        PBufferUniqueGraphics.lIllIlIllIIIIl[10] = (0xFFFF9FD8 & 0x6B77);
        PBufferUniqueGraphics.lIllIlIllIIIIl[11] = (0xFFFFEFEF & 0x1BF2);
        PBufferUniqueGraphics.lIllIlIllIIIIl[12] = (0xFFFFB353 & 0x4FAE);
        PBufferUniqueGraphics.lIllIlIllIIIIl[13] = (0xFFFFAF8B & 0x5377);
        PBufferUniqueGraphics.lIllIlIllIIIIl[14] = (0xFFFFDFAD & 0x3752);
        PBufferUniqueGraphics.lIllIlIllIIIIl[15] = (-(0xFFFFBEFD & 0x69DF) & (0xFFFFBFDD & 0x7FFF));
        PBufferUniqueGraphics.lIllIlIllIIIIl[16] = (0xD ^ 0x8);
    }
}
