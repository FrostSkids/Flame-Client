// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import org.lwjgl.util.glu.GLU;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.nio.IntBuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GLAllocation
{
    private static final /* synthetic */ int[] lIlIlIIlIIlIlI;
    private static final /* synthetic */ String[] lIlIlIIlIIIlll;
    
    private static String lllIllIIIIIlllI(final String lllllllllllllIIIlIlIIIlllIIIIlIl, final String lllllllllllllIIIlIlIIIlllIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIIlllIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIIlllIIIIlll.init(GLAllocation.lIlIlIIlIIlIlI[2], lllllllllllllIIIlIlIIIlllIIIlIII);
            return new String(lllllllllllllIIIlIlIIIlllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlllIIIIllI) {
            lllllllllllllIIIlIlIIIlllIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public static IntBuffer createDirectIntBuffer(final int lllllllllllllIIIlIlIIIlllIllIllI) {
        return createDirectByteBuffer(lllllllllllllIIIlIlIIIlllIllIllI << GLAllocation.lIlIlIIlIIlIlI[2]).asIntBuffer();
    }
    
    private static String lllIllIIIIIllII(final String lllllllllllllIIIlIlIIIlllIIlIIII, final String lllllllllllllIIIlIlIIIlllIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), GLAllocation.lIlIlIIlIIlIlI[5]), "DES");
            final Cipher lllllllllllllIIIlIlIIIlllIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIIIlllIIlIlII.init(GLAllocation.lIlIlIIlIIlIlI[2], lllllllllllllIIIlIlIIIlllIIlIlIl);
            return new String(lllllllllllllIIIlIlIIIlllIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIIlllIIlIIll) {
            lllllllllllllIIIlIlIIIlllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    public static synchronized ByteBuffer createDirectByteBuffer(final int lllllllllllllIIIlIlIIIlllIlllIII) {
        return ByteBuffer.allocateDirect(lllllllllllllIIIlIlIIIlllIlllIII).order(ByteOrder.nativeOrder());
    }
    
    private static boolean lllIllIIIIlllIl(final int lllllllllllllIIIlIlIIIllIlllllIl, final int lllllllllllllIIIlIlIIIllIlllllII) {
        return lllllllllllllIIIlIlIIIllIlllllIl < lllllllllllllIIIlIlIIIllIlllllII;
    }
    
    public static synchronized void deleteDisplayLists(final int lllllllllllllIIIlIlIIIlllIllllll, final int lllllllllllllIIIlIlIIIllllIIIIII) {
        GL11.glDeleteLists(lllllllllllllIIIlIlIIIlllIllllll, lllllllllllllIIIlIlIIIllllIIIIII);
    }
    
    private static String lllIllIIIIIllIl(String lllllllllllllIIIlIlIIIlllIlIIIlI, final String lllllllllllllIIIlIlIIIlllIlIIllI) {
        lllllllllllllIIIlIlIIIlllIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIlllIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIlllIlIIlII = lllllllllllllIIIlIlIIIlllIlIIllI.toCharArray();
        int lllllllllllllIIIlIlIIIlllIlIIIll = GLAllocation.lIlIlIIlIIlIlI[0];
        final byte lllllllllllllIIIlIlIIIlllIIlllIl = (Object)lllllllllllllIIIlIlIIIlllIlIIIlI.toCharArray();
        final boolean lllllllllllllIIIlIlIIIlllIIlllII = lllllllllllllIIIlIlIIIlllIIlllIl.length != 0;
        Exception lllllllllllllIIIlIlIIIlllIIllIll = (Exception)GLAllocation.lIlIlIIlIIlIlI[0];
        while (lllIllIIIIlllIl((int)lllllllllllllIIIlIlIIIlllIIllIll, lllllllllllllIIIlIlIIIlllIIlllII ? 1 : 0)) {
            final char lllllllllllllIIIlIlIIIlllIlIlIII = lllllllllllllIIIlIlIIIlllIIlllIl[lllllllllllllIIIlIlIIIlllIIllIll];
            lllllllllllllIIIlIlIIIlllIlIIlIl.append((char)(lllllllllllllIIIlIlIIIlllIlIlIII ^ lllllllllllllIIIlIlIIIlllIlIIlII[lllllllllllllIIIlIlIIIlllIlIIIll % lllllllllllllIIIlIlIIIlllIlIIlII.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIlllIlIIIll;
            ++lllllllllllllIIIlIlIIIlllIIllIll;
            "".length();
            if ((0xC2 ^ 0xC6) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIlllIlIIlIl);
    }
    
    private static boolean lllIllIIIIlllII(final int lllllllllllllIIIlIlIIIllIllllIlI) {
        return lllllllllllllIIIlIlIIIllIllllIlI != 0;
    }
    
    public static synchronized void deleteDisplayLists(final int lllllllllllllIIIlIlIIIlllIllllII) {
        GL11.glDeleteLists(lllllllllllllIIIlIlIIIlllIllllII, GLAllocation.lIlIlIIlIIlIlI[1]);
    }
    
    static {
        lllIllIIIIllIlI();
        lllIllIIIIlIIIl();
    }
    
    public static FloatBuffer createDirectFloatBuffer(final int lllllllllllllIIIlIlIIIlllIllIIll) {
        return createDirectByteBuffer(lllllllllllllIIIlIlIIIlllIllIIll << GLAllocation.lIlIlIIlIIlIlI[2]).asFloatBuffer();
    }
    
    private static boolean lllIllIIIIllIll(final int lllllllllllllIIIlIlIIIllIllllIII) {
        return lllllllllllllIIIlIlIIIllIllllIII == 0;
    }
    
    public static synchronized int generateDisplayLists(final int lllllllllllllIIIlIlIIIllllIIIlll) {
        final int lllllllllllllIIIlIlIIIllllIIlIlI = GL11.glGenLists(lllllllllllllIIIlIlIIIllllIIIlll);
        if (lllIllIIIIllIll(lllllllllllllIIIlIlIIIllllIIlIlI)) {
            final int lllllllllllllIIIlIlIIIllllIIlIIl = GL11.glGetError();
            String lllllllllllllIIIlIlIIIllllIIlIII = GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[0]];
            if (lllIllIIIIlllII(lllllllllllllIIIlIlIIIllllIIlIIl)) {
                lllllllllllllIIIlIlIIIllllIIlIII = GLU.gluErrorString(lllllllllllllIIIlIlIIIllllIIlIIl);
            }
            throw new IllegalStateException(String.valueOf(new StringBuilder(GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[1]]).append(lllllllllllllIIIlIlIIIllllIIIlll).append(GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[2]]).append(lllllllllllllIIIlIlIIIllllIIlIIl).append(GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[3]]).append(lllllllllllllIIIlIlIIIllllIIlIII)));
        }
        return lllllllllllllIIIlIlIIIllllIIlIlI;
    }
    
    private static void lllIllIIIIlIIIl() {
        (lIlIlIIlIIIlll = new String[GLAllocation.lIlIlIIlIIlIlI[4]])[GLAllocation.lIlIlIIlIIlIlI[0]] = lllIllIIIIIllII("tHMO+W557VwNugcui1RB50LqUy1G+vFc", "frbXS");
        GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[1]] = lllIllIIIIIllIl("NR8TBx8eGicWAnIBMRYEIB0xBlEzHXQrNXIcMkJBchU7EFEzUzcNBDwHdA0Xcg==", "RsTbq");
        GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[2]] = lllIllIIIIIllIl("YXADP0UoIjYcF214", "MPDse");
        GLAllocation.lIlIlIIlIIIlll[GLAllocation.lIlIlIIlIIlIlI[3]] = lllIllIIIIIlllI("w+XPQYCxd74=", "SYxoM");
    }
    
    private static void lllIllIIIIllIlI() {
        (lIlIlIIlIIlIlI = new int[6])[0] = ((0x3C ^ 0x60) & ~(0xD7 ^ 0x8B));
        GLAllocation.lIlIlIIlIIlIlI[1] = " ".length();
        GLAllocation.lIlIlIIlIIlIlI[2] = "  ".length();
        GLAllocation.lIlIlIIlIIlIlI[3] = "   ".length();
        GLAllocation.lIlIlIIlIIlIlI[4] = (0x45 ^ 0x41);
        GLAllocation.lIlIlIIlIIlIlI[5] = (0x55 ^ 0x5D);
    }
}
