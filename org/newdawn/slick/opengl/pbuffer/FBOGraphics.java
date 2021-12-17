// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.pbuffer;

import org.lwjgl.opengl.GLContext;
import org.newdawn.slick.util.Log;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.SlickCallable;
import org.newdawn.slick.opengl.Texture;
import java.nio.IntBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Image;
import org.newdawn.slick.Graphics;

public class FBOGraphics extends Graphics
{
    private static final /* synthetic */ String[] lIIlIlIlllIIIl;
    private /* synthetic */ Image image;
    private /* synthetic */ int FBO;
    private /* synthetic */ boolean valid;
    private static final /* synthetic */ int[] lIIlIlIllllIII;
    
    static {
        llIlIIIlIllllIl();
        llIlIIIlIllIIll();
    }
    
    protected void enterOrtho() {
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[22]);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.screenWidth, 0.0, (double)this.screenHeight, 1.0, -1.0);
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[21]);
    }
    
    private static boolean llIlIIIlIllllll(final int lllllllllllllIIllIIllIIIIlllIlII, final int lllllllllllllIIllIIllIIIIlllIIll) {
        return lllllllllllllIIllIIllIIIIlllIlII < lllllllllllllIIllIIllIIIIlllIIll;
    }
    
    private void init() throws SlickException {
        final IntBuffer lllllllllllllIIllIIllIIIllIIIlIl = BufferUtils.createIntBuffer(FBOGraphics.lIIlIlIllllIII[0]);
        EXTFramebufferObject.glGenFramebuffersEXT(lllllllllllllIIllIIllIIIllIIIlIl);
        this.FBO = lllllllllllllIIllIIllIIIllIIIlIl.get();
        try {
            final Texture lllllllllllllIIllIIllIIIllIIlIII = InternalTextureLoader.get().createTexture(this.image.getWidth(), this.image.getHeight(), this.image.getFilter());
            EXTFramebufferObject.glBindFramebufferEXT(FBOGraphics.lIIlIlIllllIII[3], this.FBO);
            EXTFramebufferObject.glFramebufferTexture2DEXT(FBOGraphics.lIIlIlIllllIII[3], FBOGraphics.lIIlIlIllllIII[17], FBOGraphics.lIIlIlIllllIII[18], lllllllllllllIIllIIllIIIllIIlIII.getTextureID(), FBOGraphics.lIIlIlIllllIII[1]);
            this.completeCheck();
            this.unbind();
            this.clear();
            this.flush();
            this.drawImage(this.image, 0.0f, 0.0f);
            this.image.setTexture(lllllllllllllIIllIIllIIIllIIlIII);
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIIllIIIllIIIlll) {
            throw new SlickException(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[19]]);
        }
    }
    
    @Override
    protected void enable() {
        if (llIlIIIlIlllllI(this.valid ? 1 : 0)) {
            throw new RuntimeException(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[23]]);
        }
        SlickCallable.enterSafeBlock();
        GL11.glPushAttrib(FBOGraphics.lIIlIlIllllIII[24]);
        GL11.glPushClientAttrib(FBOGraphics.lIIlIlIllllIII[25]);
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[22]);
        GL11.glPushMatrix();
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[21]);
        GL11.glPushMatrix();
        this.bind();
        this.initGL();
    }
    
    @Override
    protected void disable() {
        FBOGraphics.GL.flush();
        this.unbind();
        GL11.glPopClientAttrib();
        GL11.glPopAttrib();
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[21]);
        GL11.glPopMatrix();
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[22]);
        GL11.glPopMatrix();
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[21]);
        SlickCallable.leaveSafeBlock();
    }
    
    private static String llIlIIIlIlIIIIl(final String lllllllllllllIIllIIllIIIlIIlIlII, final String lllllllllllllIIllIIllIIIlIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllIIIlIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), FBOGraphics.lIIlIlIllllIII[9]), "DES");
            final Cipher lllllllllllllIIllIIllIIIlIIlIllI = Cipher.getInstance("DES");
            lllllllllllllIIllIIllIIIlIIlIllI.init(FBOGraphics.lIIlIlIllllIII[2], lllllllllllllIIllIIllIIIlIIlIlll);
            return new String(lllllllllllllIIllIIllIIIlIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllIIIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllIIIlIIlIlIl) {
            lllllllllllllIIllIIllIIIlIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIlIIIlIllIIII(String lllllllllllllIIllIIllIIIlIIIIlII, final String lllllllllllllIIllIIllIIIlIIIIIll) {
        lllllllllllllIIllIIllIIIlIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIllIIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIllIIIlIIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllIIllIIIlIIIIIIl = lllllllllllllIIllIIllIIIlIIIIIll.toCharArray();
        int lllllllllllllIIllIIllIIIlIIIIIII = FBOGraphics.lIIlIlIllllIII[1];
        final int lllllllllllllIIllIIllIIIIllllIlI = (Object)lllllllllllllIIllIIllIIIlIIIIlII.toCharArray();
        final Exception lllllllllllllIIllIIllIIIIllllIIl = (Exception)lllllllllllllIIllIIllIIIIllllIlI.length;
        double lllllllllllllIIllIIllIIIIllllIII = FBOGraphics.lIIlIlIllllIII[1];
        while (llIlIIIlIllllll((int)lllllllllllllIIllIIllIIIIllllIII, (int)lllllllllllllIIllIIllIIIIllllIIl)) {
            final char lllllllllllllIIllIIllIIIlIIIIlIl = lllllllllllllIIllIIllIIIIllllIlI[lllllllllllllIIllIIllIIIIllllIII];
            lllllllllllllIIllIIllIIIlIIIIIlI.append((char)(lllllllllllllIIllIIllIIIlIIIIlIl ^ lllllllllllllIIllIIllIIIlIIIIIIl[lllllllllllllIIllIIllIIIlIIIIIII % lllllllllllllIIllIIllIIIlIIIIIIl.length]));
            "".length();
            ++lllllllllllllIIllIIllIIIlIIIIIII;
            ++lllllllllllllIIllIIllIIIIllllIII;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIllIIIlIIIIIlI);
    }
    
    public FBOGraphics(final Image lllllllllllllIIllIIllIIIllIlIIll) throws SlickException {
        super(lllllllllllllIIllIIllIIIllIlIIll.getTexture().getTextureWidth(), lllllllllllllIIllIIllIIIllIlIIll.getTexture().getTextureHeight());
        this.valid = (FBOGraphics.lIIlIlIllllIII[0] != 0);
        this.image = lllllllllllllIIllIIllIIIllIlIIll;
        Log.debug(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[1]]).append(lllllllllllllIIllIIllIIIllIlIIll.getWidth()).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[0]]).append(lllllllllllllIIllIIllIIIllIlIIll.getHeight())));
        final boolean lllllllllllllIIllIIllIIIllIlIlIl = GLContext.getCapabilities().GL_EXT_framebuffer_object;
        if (llIlIIIlIlllllI(lllllllllllllIIllIIllIIIllIlIlIl ? 1 : 0)) {
            throw new SlickException(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[2]]);
        }
        this.init();
    }
    
    private static void llIlIIIlIllIIll() {
        (lIIlIlIlllIIIl = new String[FBOGraphics.lIIlIlIllllIII[32]])[FBOGraphics.lIIlIlIllllIII[1]] = llIlIIIlIlIIIIl("r0SOrzKPVyJbb/og4f6igA==", "TvkGs");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[0]] = llIlIIIlIlIllll("VXrav/nNc00=", "IUAWN");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[2]] = llIlIIIlIllIIII("Eh8SFWcEAAIJAAdQBAY1L1ADCCI4UAkIM2sDEhc3JAITRwEJP0cGKS9QDwIpKBVHBCYlVxNHLyoeAwsiawQPAmcvCQkGKiITRw4qKhcCFGc5FRYSLjkVA0chJAJHEy8iA0cGNzscDgQmPxkICWk=", "KpggG");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[4]] = llIlIIIlIlIIIIl("XS+XP5mZy/ct/H6lsXRg4w==", "iJXAu");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[5]] = llIlIIIlIlIIIIl("vSo/SU0gq3tQPXwvqZiPbWR0B7pcUK1J5CflMpaw+2tSmMCMY62R22DVZeUnau7s9PVoNqjSQaEhbFQT0R/sq+V96BAEaERu", "dYdxV");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[6]] = llIlIIIlIlIIIIl("cnTkegKv1tdapn5M1qhBFw==", "Eixoc");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[7]] = llIlIIIlIlIIIIl("Tw+OzRfNCKYYE0n60ZBT2+3COZS3ZyhsYPmwJnFOcjexpYzVWpfpt2XBhz5K2wg8/FYba1+RNzhd3K8YtDQpsKXaJcnMSgXIC4ixtDUYPf4=", "ONaGq");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[8]] = llIlIIIlIlIIIIl("xvm0iP6iVVtky3O9g18HPw==", "pLKsr");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[9]] = llIlIIIlIlIIIIl("BVbLtRYrtCFQi4JTVPAskf3yzF6tKULTt3+Giw6qmPvF0NhsUNhXDAZnsajFllID5EBU6TkUH/hjqhX3sy8/4I5LZcVctg+C", "mxWvs");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[10]] = llIlIIIlIlIIIIl("PO5oRyay44ONR0n2cEU2FA==", "vZGtN");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[11]] = llIlIIIlIlIIIIl("KaoGPTe6ynjFOtVIIItq9BMWjc3usTogzdezNVLDxne0RoMtlstMKW3BzG5Fa+RvnQbGr6+FvXoWR5IEEW96T/rcOqweH9gx", "yKGOM");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[12]] = llIlIIIlIlIIIIl("sIAHJ+vba7UwCZcJMrNRMQ==", "PADgp");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[13]] = llIlIIIlIlIIIIl("UWnS7myNzT9HyHLAqZRCVMZdX3DlWc4WUz9lAJtqiBa98lo7tY580+tK8/uDrWTAeZ+zIIxnGJvpgjo+d9WCbw==", "EunRQ");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[14]] = llIlIIIlIlIIIIl("OAEXGFEMLqqrJqcpQ3FXFg==", "wiGnY");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[15]] = llIlIIIlIlIllll("J4lSU9+X+++J/nw0h68xYs8wKa04jIHwqRUS6apWYvQVJfF3knVgivoQLV13pZp6WSvsqkhHMONCak8/my6ry4dU2liWCK+h", "shZMZ");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[16]] = llIlIIIlIlIIIIl("pgxMv3PnnUJKvQjNM3RAHsAL+h+ccwhftqwbnjnLJwdmRIt1CPI2AuFRk5CZIoIImbCRxNtas0I=", "KGKea");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[19]] = llIlIIIlIlIllll("7dfKI80e9m66KisvWCYvw0KByudx/pRlbfYv4wqx/GlOLmHhaD82dQ==", "SAdlJ");
        FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[23]] = llIlIIIlIllIIII("Ex06ICgiHW4xKnIcPSBlM0kqIDYmGyE8bXsMKmUqNA89Jjc3DCBlIiAIPi0sMRpuJio8HSs9MXw=", "RiNEE");
    }
    
    private void completeCheck() throws SlickException {
        final int lllllllllllllIIllIIllIIIllIIlllI = EXTFramebufferObject.glCheckFramebufferStatusEXT(FBOGraphics.lIIlIlIllllIII[3]);
        switch (lllllllllllllIIllIIllIIIllIIlllI) {
            case 36053: {
                "".length();
                if ((0x14 ^ 0x8 ^ (0x17 ^ 0xF)) != (0x32 ^ 0x4E ^ (0xF8 ^ 0x80))) {
                    return;
                }
            }
            case 36054: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[4]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[5]])));
            }
            case 36055: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[6]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[7]])));
            }
            case 36057: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[8]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[9]])));
            }
            case 36059: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[10]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[11]])));
            }
            case 36058: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[12]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[13]])));
            }
            case 36060: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[14]]).append(this.FBO).append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[15]])));
            }
            default: {
                throw new SlickException(String.valueOf(new StringBuilder().append(FBOGraphics.lIIlIlIlllIIIl[FBOGraphics.lIIlIlIllllIII[16]]).append(lllllllllllllIIllIIllIIIllIIlllI)));
            }
        }
    }
    
    private static String llIlIIIlIlIllll(final String lllllllllllllIIllIIllIIIlIlIIIIl, final String lllllllllllllIIllIIllIIIlIIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllIIIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIllIIIlIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIllIIIlIlIIIll.init(FBOGraphics.lIIlIlIllllIII[2], lllllllllllllIIllIIllIIIlIlIIlII);
            return new String(lllllllllllllIIllIIllIIIlIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllIIIlIlIIIlI) {
            lllllllllllllIIllIIllIIIlIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private void unbind() {
        EXTFramebufferObject.glBindFramebufferEXT(FBOGraphics.lIIlIlIllllIII[3], FBOGraphics.lIIlIlIllllIII[1]);
        GL11.glReadBuffer(FBOGraphics.lIIlIlIllllIII[20]);
    }
    
    @Override
    public void destroy() {
        super.destroy();
        final IntBuffer lllllllllllllIIllIIllIIIlIlIlllI = BufferUtils.createIntBuffer(FBOGraphics.lIIlIlIllllIII[0]);
        lllllllllllllIIllIIllIIIlIlIlllI.put(this.FBO);
        "".length();
        lllllllllllllIIllIIllIIIlIlIlllI.flip();
        "".length();
        EXTFramebufferObject.glDeleteFramebuffersEXT(lllllllllllllIIllIIllIIIlIlIlllI);
        this.valid = (FBOGraphics.lIIlIlIllllIII[1] != 0);
    }
    
    private static void llIlIIIlIllllIl() {
        (lIIlIlIllllIII = new int[33])[0] = " ".length();
        FBOGraphics.lIIlIlIllllIII[1] = ((0xE1 ^ 0xAD) & ~(0x8 ^ 0x44));
        FBOGraphics.lIIlIlIllllIII[2] = "  ".length();
        FBOGraphics.lIIlIlIllllIII[3] = (-(0xFFFFF73F & 0x78F9) & (0xFFFFFD79 & 0xFFFE));
        FBOGraphics.lIIlIlIllllIII[4] = "   ".length();
        FBOGraphics.lIIlIlIllllIII[5] = (54 + 86 - 116 + 115 ^ 40 + 72 - 82 + 113);
        FBOGraphics.lIIlIlIllllIII[6] = (0x84 ^ 0x81);
        FBOGraphics.lIIlIlIllllIII[7] = (0x26 ^ 0x20);
        FBOGraphics.lIIlIlIllllIII[8] = (179 + 6 - 85 + 91 ^ 70 + 118 - 14 + 10);
        FBOGraphics.lIIlIlIllllIII[9] = (0x2B ^ 0x23);
        FBOGraphics.lIIlIlIllllIII[10] = (0x15 ^ 0x1C);
        FBOGraphics.lIIlIlIllllIII[11] = (0x68 ^ 0x57 ^ (0x4F ^ 0x7A));
        FBOGraphics.lIIlIlIllllIII[12] = (0x27 ^ 0x2C);
        FBOGraphics.lIIlIlIllllIII[13] = (0x4B ^ 0x3C ^ (0x5 ^ 0x7E));
        FBOGraphics.lIIlIlIllllIII[14] = (0x7C ^ 0x4F ^ (0x54 ^ 0x6A));
        FBOGraphics.lIIlIlIllllIII[15] = (0x96 ^ 0x98);
        FBOGraphics.lIIlIlIllllIII[16] = (0x2D ^ 0x71 ^ (0x67 ^ 0x34));
        FBOGraphics.lIIlIlIllllIII[17] = (-(0xFFFF93AF & 0x7F5F) & (0xFFFFFFFE & 0x9FEF));
        FBOGraphics.lIIlIlIllllIII[18] = (-(0xFFFFF90F & 0x76F1) & (0xFFFFFDE3 & 0x7FFD));
        FBOGraphics.lIIlIlIllllIII[19] = (0xF5 ^ 0xBC ^ (0x4D ^ 0x14));
        FBOGraphics.lIIlIlIllllIII[20] = (0xFFFFD42F & 0x2FD5);
        FBOGraphics.lIIlIlIllllIII[21] = (0xFFFFD764 & 0x3F9B);
        FBOGraphics.lIIlIlIllllIII[22] = (-(0xFFFFF9BF & 0x6E67) & (0xFFFFFF37 & 0x7FEF));
        FBOGraphics.lIIlIlIllllIII[23] = (63 + 2 - 43 + 165 ^ 4 + 137 + 14 + 15);
        FBOGraphics.lIIlIlIllllIII[24] = (-" ".length() & (-1 & 0xFFFFF));
        FBOGraphics.lIIlIlIllllIII[25] = -" ".length();
        FBOGraphics.lIIlIlIllllIII[26] = (0xFFFFBD3F & 0x5FC1);
        FBOGraphics.lIIlIlIllllIII[27] = (0xFFFF9B77 & 0x6FF9);
        FBOGraphics.lIIlIlIllllIII[28] = (0xFFFFBB7D & 0x4FD2);
        FBOGraphics.lIIlIlIllllIII[29] = (0xFFFF9BEE & 0x6FF3);
        FBOGraphics.lIIlIlIllllIII[30] = (-(0xFFFFF9BA & 0x6E77) & (0xFFFFFB37 & 0x6FFB));
        FBOGraphics.lIIlIlIllllIII[31] = (-(0xFFFFE59F & 0x1EFD) & (0xFFFFE7FF & 0x1F9F));
        FBOGraphics.lIIlIlIllllIII[32] = (0xB0 ^ 0xA2);
    }
    
    private void bind() {
        EXTFramebufferObject.glBindFramebufferEXT(FBOGraphics.lIIlIlIllllIII[3], this.FBO);
        GL11.glReadBuffer(FBOGraphics.lIIlIlIllllIII[17]);
    }
    
    protected void initGL() {
        GL11.glEnable(FBOGraphics.lIIlIlIllllIII[18]);
        GL11.glShadeModel(FBOGraphics.lIIlIlIllllIII[26]);
        GL11.glDisable(FBOGraphics.lIIlIlIllllIII[27]);
        GL11.glDisable(FBOGraphics.lIIlIlIllllIII[28]);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(FBOGraphics.lIIlIlIllllIII[29]);
        GL11.glBlendFunc(FBOGraphics.lIIlIlIllllIII[30], FBOGraphics.lIIlIlIllllIII[31]);
        GL11.glViewport(FBOGraphics.lIIlIlIllllIII[1], FBOGraphics.lIIlIlIllllIII[1], this.screenWidth, this.screenHeight);
        GL11.glMatrixMode(FBOGraphics.lIIlIlIllllIII[21]);
        GL11.glLoadIdentity();
        this.enterOrtho();
    }
    
    @Override
    public void flush() {
        super.flush();
        this.image.flushPixelData();
    }
    
    private static boolean llIlIIIlIlllllI(final int lllllllllllllIIllIIllIIIIlllIIIl) {
        return lllllllllllllIIllIIllIIIIlllIIIl == 0;
    }
}
