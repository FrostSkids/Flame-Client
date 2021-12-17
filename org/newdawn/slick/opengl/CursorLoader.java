// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import org.newdawn.slick.util.ResourceLoader;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.util.Log;
import java.nio.IntBuffer;
import org.lwjgl.input.Cursor;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CursorLoader
{
    private static final /* synthetic */ String[] lIllIlIlllIlIl;
    private static /* synthetic */ CursorLoader single;
    private static final /* synthetic */ int[] lIllIlIlllIlll;
    
    private static String lllllllIIllIlII(String llllllllllllIlllllllIllllIIlllII, final String llllllllllllIlllllllIllllIIllIll) {
        llllllllllllIlllllllIllllIIlllII = new String(Base64.getDecoder().decode(llllllllllllIlllllllIllllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllIllllIIlllll = new StringBuilder();
        final char[] llllllllllllIlllllllIllllIIllllI = llllllllllllIlllllllIllllIIllIll.toCharArray();
        int llllllllllllIlllllllIllllIIlllIl = CursorLoader.lIllIlIlllIlll[0];
        final long llllllllllllIlllllllIllllIIlIlll = (Object)llllllllllllIlllllllIllllIIlllII.toCharArray();
        final Exception llllllllllllIlllllllIllllIIlIllI = (Exception)llllllllllllIlllllllIllllIIlIlll.length;
        Exception llllllllllllIlllllllIllllIIlIlIl = (Exception)CursorLoader.lIllIlIlllIlll[0];
        while (lllllllIlIIIIll((int)llllllllllllIlllllllIllllIIlIlIl, (int)llllllllllllIlllllllIllllIIlIllI)) {
            final char llllllllllllIlllllllIllllIlIIIlI = llllllllllllIlllllllIllllIIlIlll[llllllllllllIlllllllIllllIIlIlIl];
            llllllllllllIlllllllIllllIIlllll.append((char)(llllllllllllIlllllllIllllIlIIIlI ^ llllllllllllIlllllllIllllIIllllI[llllllllllllIlllllllIllllIIlllIl % llllllllllllIlllllllIllllIIllllI.length]));
            "".length();
            ++llllllllllllIlllllllIllllIIlllIl;
            ++llllllllllllIlllllllIllllIIlIlIl;
            "".length();
            if (((205 + 209 - 272 + 69 ^ 69 + 58 - 16 + 17) & (124 + 148 - 192 + 147 ^ 128 + 152 - 124 + 20 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllIllllIIlllll);
    }
    
    private static void lllllllIlIIIIlI() {
        (lIllIlIlllIlll = new int[6])[0] = ((0x89 ^ 0x8D) & ~(0x4A ^ 0x4E));
        CursorLoader.lIllIlIlllIlll[1] = " ".length();
        CursorLoader.lIllIlIlllIlll[2] = "  ".length();
        CursorLoader.lIllIlIlllIlll[3] = "   ".length();
        CursorLoader.lIllIlIlllIlll[4] = (0x33 ^ 0x37);
        CursorLoader.lIllIlIlllIlll[5] = (96 + 36 - 128 + 162 ^ 61 + 89 - 147 + 171);
    }
    
    private CursorLoader() {
    }
    
    public Cursor getCursor(final ImageData llllllllllllIlllllllIlllllIllllI, final int llllllllllllIlllllllIlllllIlllIl, final int llllllllllllIlllllllIlllllIlllII) throws LWJGLException, IOException {
        final ByteBuffer llllllllllllIlllllllIlllllIlllll = llllllllllllIlllllllIlllllIllllI.getImageBufferData();
        int llllllllllllIlllllllIllllllIIllI = CursorLoader.lIllIlIlllIlll[0];
        while (lllllllIlIIIIll(llllllllllllIlllllllIllllllIIllI, llllllllllllIlllllllIlllllIlllll.limit())) {
            final byte llllllllllllIlllllllIllllllIlIlI = llllllllllllIlllllllIlllllIlllll.get(llllllllllllIlllllllIllllllIIllI);
            final byte llllllllllllIlllllllIllllllIlIIl = llllllllllllIlllllllIlllllIlllll.get(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[1]);
            final byte llllllllllllIlllllllIllllllIlIII = llllllllllllIlllllllIlllllIlllll.get(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[2]);
            final byte llllllllllllIlllllllIllllllIIlll = llllllllllllIlllllllIlllllIlllll.get(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[3]);
            llllllllllllIlllllllIlllllIlllll.put(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[2], llllllllllllIlllllllIllllllIlIlI);
            "".length();
            llllllllllllIlllllllIlllllIlllll.put(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[1], llllllllllllIlllllllIllllllIlIIl);
            "".length();
            llllllllllllIlllllllIlllllIlllll.put(llllllllllllIlllllllIllllllIIllI, llllllllllllIlllllllIllllllIlIII);
            "".length();
            llllllllllllIlllllllIlllllIlllll.put(llllllllllllIlllllllIllllllIIllI + CursorLoader.lIllIlIlllIlll[3], llllllllllllIlllllllIllllllIIlll);
            "".length();
            llllllllllllIlllllllIllllllIIllI += 4;
            "".length();
            if ((0x7F ^ 0x7B) == ((0xE6 ^ 0xAD) & ~(0x8C ^ 0xC7))) {
                return null;
            }
        }
        try {
            int llllllllllllIlllllllIllllllIIlIl = llllllllllllIlllllllIlllllIllllI.getHeight() - llllllllllllIlllllllIlllllIlllII - CursorLoader.lIllIlIlllIlll[1];
            if (lllllllIlIIIlII(llllllllllllIlllllllIllllllIIlIl)) {
                llllllllllllIlllllllIllllllIIlIl = CursorLoader.lIllIlIlllIlll[0];
            }
            return new Cursor(llllllllllllIlllllllIlllllIllllI.getTexWidth(), llllllllllllIlllllllIlllllIllllI.getTexHeight(), llllllllllllIlllllllIlllllIlllIl, llllllllllllIlllllllIllllllIIlIl, CursorLoader.lIllIlIlllIlll[1], llllllllllllIlllllllIlllllIlllll.asIntBuffer(), (IntBuffer)null);
        }
        catch (Throwable llllllllllllIlllllllIllllllIIlII) {
            Log.info(CursorLoader.lIllIlIlllIlIl[CursorLoader.lIllIlIlllIlll[2]]);
            throw new LWJGLException(llllllllllllIlllllllIllllllIIlII);
        }
    }
    
    private static boolean lllllllIlIIIlII(final int llllllllllllIlllllllIllllIIIlllI) {
        return llllllllllllIlllllllIllllIIIlllI < 0;
    }
    
    private static boolean lllllllIlIIIIll(final int llllllllllllIlllllllIllllIIlIIIl, final int llllllllllllIlllllllIllllIIlIIII) {
        return llllllllllllIlllllllIllllIIlIIIl < llllllllllllIlllllllIllllIIlIIII;
    }
    
    public static CursorLoader get() {
        return CursorLoader.single;
    }
    
    public Cursor getCursor(final ByteBuffer llllllllllllIlllllllIlllllllllIl, final int llllllllllllIlllllllIlllllllllII, final int llllllllllllIlllllllIllllllllIll, final int llllllllllllIlllllllIllllllllIlI, final int llllllllllllIlllllllIllllllllllI) throws IOException, LWJGLException {
        int llllllllllllIllllllllIIIIIIIIllI = CursorLoader.lIllIlIlllIlll[0];
        while (lllllllIlIIIIll(llllllllllllIllllllllIIIIIIIIllI, llllllllllllIlllllllIlllllllllIl.limit())) {
            final byte llllllllllllIllllllllIIIIIIIlIlI = llllllllllllIlllllllIlllllllllIl.get(llllllllllllIllllllllIIIIIIIIllI);
            final byte llllllllllllIllllllllIIIIIIIlIIl = llllllllllllIlllllllIlllllllllIl.get(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[1]);
            final byte llllllllllllIllllllllIIIIIIIlIII = llllllllllllIlllllllIlllllllllIl.get(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[2]);
            final byte llllllllllllIllllllllIIIIIIIIlll = llllllllllllIlllllllIlllllllllIl.get(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[3]);
            llllllllllllIlllllllIlllllllllIl.put(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[2], llllllllllllIllllllllIIIIIIIlIlI);
            "".length();
            llllllllllllIlllllllIlllllllllIl.put(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[1], llllllllllllIllllllllIIIIIIIlIIl);
            "".length();
            llllllllllllIlllllllIlllllllllIl.put(llllllllllllIllllllllIIIIIIIIllI, llllllllllllIllllllllIIIIIIIlIII);
            "".length();
            llllllllllllIlllllllIlllllllllIl.put(llllllllllllIllllllllIIIIIIIIllI + CursorLoader.lIllIlIlllIlll[3], llllllllllllIllllllllIIIIIIIIlll);
            "".length();
            llllllllllllIllllllllIIIIIIIIllI += 4;
            "".length();
            if ((0x87 ^ 0x83) <= 0) {
                return null;
            }
        }
        try {
            int llllllllllllIllllllllIIIIIIIIlIl = llllllllllllIlllllllIllllllllllI - llllllllllllIlllllllIllllllllIll - CursorLoader.lIllIlIlllIlll[1];
            if (lllllllIlIIIlII(llllllllllllIllllllllIIIIIIIIlIl)) {
                llllllllllllIllllllllIIIIIIIIlIl = CursorLoader.lIllIlIlllIlll[0];
            }
            return new Cursor(llllllllllllIlllllllIllllllllIlI, llllllllllllIlllllllIllllllllllI, llllllllllllIlllllllIlllllllllII, llllllllllllIllllllllIIIIIIIIlIl, CursorLoader.lIllIlIlllIlll[1], llllllllllllIlllllllIlllllllllIl.asIntBuffer(), (IntBuffer)null);
        }
        catch (Throwable llllllllllllIllllllllIIIIIIIIlII) {
            Log.info(CursorLoader.lIllIlIlllIlIl[CursorLoader.lIllIlIlllIlll[1]]);
            throw new LWJGLException(llllllllllllIllllllllIIIIIIIIlII);
        }
    }
    
    public Cursor getCursor(final String llllllllllllIllllllllIIIIIlIIIll, final int llllllllllllIllllllllIIIIIIlllIl, final int llllllllllllIllllllllIIIIIlIIIIl) throws IOException, LWJGLException {
        LoadableImageData llllllllllllIllllllllIIIIIlIIIII = null;
        llllllllllllIllllllllIIIIIlIIIII = ImageDataFactory.getImageDataFor(llllllllllllIllllllllIIIIIlIIIll);
        llllllllllllIllllllllIIIIIlIIIII.configureEdging((boolean)(CursorLoader.lIllIlIlllIlll[0] != 0));
        final ByteBuffer llllllllllllIllllllllIIIIIIlllll = llllllllllllIllllllllIIIIIlIIIII.loadImage(ResourceLoader.getResourceAsStream(llllllllllllIllllllllIIIIIlIIIll), (boolean)(CursorLoader.lIllIlIlllIlll[1] != 0), (boolean)(CursorLoader.lIllIlIlllIlll[1] != 0), null);
        int llllllllllllIllllllllIIIIIlIIlll = CursorLoader.lIllIlIlllIlll[0];
        while (lllllllIlIIIIll(llllllllllllIllllllllIIIIIlIIlll, llllllllllllIllllllllIIIIIIlllll.limit())) {
            final byte llllllllllllIllllllllIIIIIlIlIll = llllllllllllIllllllllIIIIIIlllll.get(llllllllllllIllllllllIIIIIlIIlll);
            final byte llllllllllllIllllllllIIIIIlIlIlI = llllllllllllIllllllllIIIIIIlllll.get(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[1]);
            final byte llllllllllllIllllllllIIIIIlIlIIl = llllllllllllIllllllllIIIIIIlllll.get(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[2]);
            final byte llllllllllllIllllllllIIIIIlIlIII = llllllllllllIllllllllIIIIIIlllll.get(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[3]);
            llllllllllllIllllllllIIIIIIlllll.put(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[2], llllllllllllIllllllllIIIIIlIlIll);
            "".length();
            llllllllllllIllllllllIIIIIIlllll.put(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[1], llllllllllllIllllllllIIIIIlIlIlI);
            "".length();
            llllllllllllIllllllllIIIIIIlllll.put(llllllllllllIllllllllIIIIIlIIlll, llllllllllllIllllllllIIIIIlIlIIl);
            "".length();
            llllllllllllIllllllllIIIIIIlllll.put(llllllllllllIllllllllIIIIIlIIlll + CursorLoader.lIllIlIlllIlll[3], llllllllllllIllllllllIIIIIlIlIII);
            "".length();
            llllllllllllIllllllllIIIIIlIIlll += 4;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        try {
            int llllllllllllIllllllllIIIIIlIIllI = llllllllllllIllllllllIIIIIlIIIII.getHeight() - llllllllllllIllllllllIIIIIlIIIIl - CursorLoader.lIllIlIlllIlll[1];
            if (lllllllIlIIIlII(llllllllllllIllllllllIIIIIlIIllI)) {
                llllllllllllIllllllllIIIIIlIIllI = CursorLoader.lIllIlIlllIlll[0];
            }
            return new Cursor(llllllllllllIllllllllIIIIIlIIIII.getTexWidth(), llllllllllllIllllllllIIIIIlIIIII.getTexHeight(), llllllllllllIllllllllIIIIIIlllIl, llllllllllllIllllllllIIIIIlIIllI, CursorLoader.lIllIlIlllIlll[1], llllllllllllIllllllllIIIIIIlllll.asIntBuffer(), (IntBuffer)null);
        }
        catch (Throwable llllllllllllIllllllllIIIIIlIIlIl) {
            Log.info(CursorLoader.lIllIlIlllIlIl[CursorLoader.lIllIlIlllIlll[0]]);
            throw new LWJGLException(llllllllllllIllllllllIIIIIlIIlIl);
        }
    }
    
    private static void lllllllIIllIlIl() {
        (lIllIlIlllIlIl = new String[CursorLoader.lIllIlIlllIlll[3]])[CursorLoader.lIllIlIlllIlll[0]] = lllllllIIllIIll("c8i19qTnQIU/YCb9mqcGh3gF0TnnqQ6O/vtkAzY8dF/OUmILOH3QdcQakyF9qYI31Ln6Vf66dyA=", "WkYEF");
        CursorLoader.lIllIlIlllIlIl[CursorLoader.lIllIlIlllIlll[1]] = lllllllIIllIIll("FmqPP06iHtbhW7eQnxDYjG+B/AMlPqj8G1w20oVLQJm6e4fCwOmNoOzTVOJhftri8I0u7yxDzm4=", "fYuGu");
        CursorLoader.lIllIlIlllIlIl[CursorLoader.lIllIlIlllIlll[2]] = lllllllIIllIlII("NQ0qOS4TFms2PxNFMjg4VgY+JT4ZF2s+PlYRJDhtBQgqOyFWAyQlbQINIiRtBgkqIysZFyY=", "veKWM");
    }
    
    public Cursor getAnimatedCursor(final String llllllllllllIlllllllIlllllIIIIIl, final int llllllllllllIlllllllIlllllIIlIIl, final int llllllllllllIlllllllIlllllIIlIII, final int llllllllllllIlllllllIllllIlllllI, final int llllllllllllIlllllllIlllllIIIllI, final int[] llllllllllllIlllllllIllllIllllII) throws LWJGLException, IOException {
        final IntBuffer llllllllllllIlllllllIlllllIIIlII = ByteBuffer.allocateDirect(llllllllllllIlllllllIllllIllllII.length * CursorLoader.lIllIlIlllIlll[4]).order(ByteOrder.nativeOrder()).asIntBuffer();
        int llllllllllllIlllllllIlllllIIllII = CursorLoader.lIllIlIlllIlll[0];
        while (lllllllIlIIIIll(llllllllllllIlllllllIlllllIIllII, llllllllllllIlllllllIllllIllllII.length)) {
            llllllllllllIlllllllIlllllIIIlII.put(llllllllllllIlllllllIllllIllllII[llllllllllllIlllllllIlllllIIllII]);
            "".length();
            ++llllllllllllIlllllllIlllllIIllII;
            "".length();
            if ("  ".length() >= (0x54 ^ 0x50)) {
                return null;
            }
        }
        llllllllllllIlllllllIlllllIIIlII.flip();
        "".length();
        final LoadableImageData llllllllllllIlllllllIlllllIIIIll = new TGAImageData();
        final ByteBuffer llllllllllllIlllllllIlllllIIIIlI = llllllllllllIlllllllIlllllIIIIll.loadImage(ResourceLoader.getResourceAsStream(llllllllllllIlllllllIlllllIIIIIl), (boolean)(CursorLoader.lIllIlIlllIlll[0] != 0), null);
        return new Cursor(llllllllllllIlllllllIllllIlllllI, llllllllllllIlllllllIlllllIIIllI, llllllllllllIlllllllIlllllIIlIIl, llllllllllllIlllllllIlllllIIlIII, llllllllllllIlllllllIllllIllllII.length, llllllllllllIlllllllIlllllIIIIlI.asIntBuffer(), llllllllllllIlllllllIlllllIIIlII);
    }
    
    private static String lllllllIIllIIll(final String llllllllllllIlllllllIllllIlIllll, final String llllllllllllIlllllllIllllIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllllIllllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIllllIlIlllI.getBytes(StandardCharsets.UTF_8)), CursorLoader.lIllIlIlllIlll[5]), "DES");
            final Cipher llllllllllllIlllllllIllllIllIIll = Cipher.getInstance("DES");
            llllllllllllIlllllllIllllIllIIll.init(CursorLoader.lIllIlIlllIlll[2], llllllllllllIlllllllIllllIllIlII);
            return new String(llllllllllllIlllllllIllllIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIllllIllIIlI) {
            llllllllllllIlllllllIllllIllIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllllIlIIIIlI();
        lllllllIIllIlIl();
        CursorLoader.single = new CursorLoader();
    }
}
