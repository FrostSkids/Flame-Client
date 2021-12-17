// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.io.ByteArrayInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import java.nio.ShortBuffer;
import java.nio.ByteOrder;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.LWJGLUtil;
import java.io.InputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.net.URL;
import java.nio.ByteBuffer;

public class AiffData
{
    public final /* synthetic */ int samplerate;
    private static final /* synthetic */ int[] lIIlIllIlIlllI;
    public final /* synthetic */ int format;
    private static final /* synthetic */ String[] lIIlIllIlIllIl;
    public final /* synthetic */ ByteBuffer data;
    
    public static AiffData create(final URL lllllllllllllIIllIIIllIllIlIlllI) {
        try {
            return create(AudioSystem.getAudioInputStream(new BufferedInputStream(lllllllllllllIIllIIIllIllIlIlllI.openStream())));
        }
        catch (Exception lllllllllllllIIllIIIllIllIllIIII) {
            LWJGLUtil.log((CharSequence)String.valueOf(new StringBuilder().append(AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[0]]).append(lllllllllllllIIllIIIllIllIlIlllI)));
            lllllllllllllIIllIIIllIllIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static ByteBuffer convertAudioBytes(final AudioFormat lllllllllllllIIllIIIllIlIllIlIll, final byte[] lllllllllllllIIllIIIllIlIllIlIlI, final boolean lllllllllllllIIllIIIllIlIllIlllI) {
        final ByteBuffer lllllllllllllIIllIIIllIlIllIllIl = ByteBuffer.allocateDirect(lllllllllllllIIllIIIllIlIllIlIlI.length);
        lllllllllllllIIllIIIllIlIllIllIl.order(ByteOrder.nativeOrder());
        "".length();
        final ByteBuffer lllllllllllllIIllIIIllIlIllIllII = ByteBuffer.wrap(lllllllllllllIIllIIIllIlIllIlIlI);
        lllllllllllllIIllIIIllIlIllIllII.order(ByteOrder.BIG_ENDIAN);
        "".length();
        if (llIlIIlIllllIll(lllllllllllllIIllIIIllIlIllIlllI ? 1 : 0)) {
            final ShortBuffer lllllllllllllIIllIIIllIlIlllIIll = lllllllllllllIIllIIIllIlIllIllIl.asShortBuffer();
            final ShortBuffer lllllllllllllIIllIIIllIlIlllIIlI = lllllllllllllIIllIIIllIlIllIllII.asShortBuffer();
            while (llIlIIlIllllIll(lllllllllllllIIllIIIllIlIlllIIlI.hasRemaining() ? 1 : 0)) {
                lllllllllllllIIllIIIllIlIlllIIll.put(lllllllllllllIIllIIIllIlIlllIIlI.get());
                "".length();
                "".length();
                if (((0x81 ^ 0xC1) & ~(0x62 ^ 0x22)) >= " ".length()) {
                    return null;
                }
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            while (llIlIIlIllllIll(lllllllllllllIIllIIIllIlIllIllII.hasRemaining() ? 1 : 0)) {
                byte lllllllllllllIIllIIIllIlIlllIIIl = lllllllllllllIIllIIIllIlIllIllII.get();
                if (llIlIIlIlllllll(lllllllllllllIIllIIIllIlIllIlIll.getEncoding(), AudioFormat.Encoding.PCM_SIGNED)) {
                    lllllllllllllIIllIIIllIlIlllIIIl += (byte)AiffData.lIIlIllIlIlllI[12];
                }
                lllllllllllllIIllIIIllIlIllIllIl.put(lllllllllllllIIllIIIllIlIlllIIIl);
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
        }
        lllllllllllllIIllIIIllIlIllIllIl.rewind();
        "".length();
        return lllllllllllllIIllIIIllIlIllIllIl;
    }
    
    public static AiffData create(final AudioInputStream lllllllllllllIIllIIIllIllIIIlIll) {
        final AudioFormat lllllllllllllIIllIIIllIllIIIlIlI = lllllllllllllIIllIIIllIllIIIlIll.getFormat();
        int lllllllllllllIIllIIIllIllIIIlIIl = AiffData.lIIlIllIlIlllI[0];
        if (llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getChannels(), AiffData.lIIlIllIlIlllI[1])) {
            if (llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits(), AiffData.lIIlIllIlIlllI[2])) {
                lllllllllllllIIllIIIllIllIIIlIIl = AiffData.lIIlIllIlIlllI[3];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                if (!llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits(), AiffData.lIIlIllIlIlllI[4])) {
                    throw new RuntimeException(AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[6]]);
                }
                lllllllllllllIIllIIIllIllIIIlIIl = AiffData.lIIlIllIlIlllI[5];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return null;
                }
            }
        }
        else {
            if (!llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getChannels(), AiffData.lIIlIllIlIlllI[6])) {
                throw new RuntimeException(AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[10]]);
            }
            if (llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits(), AiffData.lIIlIllIlIlllI[2])) {
                lllllllllllllIIllIIIllIllIIIlIIl = AiffData.lIIlIllIlIlllI[7];
                "".length();
                if ((0x88 ^ 0xBC ^ (0xB6 ^ 0x87)) == 0x0) {
                    return null;
                }
            }
            else {
                if (!llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits(), AiffData.lIIlIllIlIlllI[4])) {
                    throw new RuntimeException(AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[9]]);
                }
                lllllllllllllIIllIIIllIllIIIlIIl = AiffData.lIIlIllIlIlllI[8];
                "".length();
                if (((0x40 ^ 0x64) & ~(0x22 ^ 0x6)) > 0) {
                    return null;
                }
            }
        }
        final byte[] lllllllllllllIIllIIIllIllIIIlIII = new byte[lllllllllllllIIllIIIllIllIIIlIlI.getChannels() * (int)lllllllllllllIIllIIIllIllIIIlIll.getFrameLength() * lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits() / AiffData.lIIlIllIlIlllI[2]];
        int lllllllllllllIIllIIIllIllIIIIlll = AiffData.lIIlIllIlIlllI[0];
        int lllllllllllllIIllIIIllIllIIIIllI = AiffData.lIIlIllIlIlllI[0];
        try {
            while (llIlIIlIlllllIl(lllllllllllllIIllIIIllIllIIIIlll = lllllllllllllIIllIIIllIllIIIlIll.read(lllllllllllllIIllIIIllIllIIIlIII, lllllllllllllIIllIIIllIllIIIIllI, lllllllllllllIIllIIIllIllIIIlIII.length - lllllllllllllIIllIIIllIllIIIIllI), AiffData.lIIlIllIlIlllI[11]) && llIlIIlIllllllI(lllllllllllllIIllIIIllIllIIIIllI, lllllllllllllIIllIIIllIllIIIlIII.length)) {
                lllllllllllllIIllIIIllIllIIIIllI += lllllllllllllIIllIIIllIllIIIIlll;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIllIIIllIllIIIllIl) {
            return null;
        }
        final AudioFormat lllllllllllllIIllIIIllIlIllIlIll = lllllllllllllIIllIIIllIllIIIlIlI;
        final byte[] lllllllllllllIIllIIIllIlIllIlIlI = lllllllllllllIIllIIIllIllIIIlIII;
        int lllllllllllllIIllIIIllIlIllIlllI;
        if (llIlIIlIlllllII(lllllllllllllIIllIIIllIllIIIlIlI.getSampleSizeInBits(), AiffData.lIIlIllIlIlllI[4])) {
            lllllllllllllIIllIIIllIlIllIlllI = AiffData.lIIlIllIlIlllI[1];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIllIIIllIlIllIlllI = AiffData.lIIlIllIlIlllI[0];
        }
        final ByteBuffer lllllllllllllIIllIIIllIllIIIIlIl = convertAudioBytes(lllllllllllllIIllIIIllIlIllIlIll, lllllllllllllIIllIIIllIlIllIlIlI, (boolean)(lllllllllllllIIllIIIllIlIllIlllI != 0));
        final AiffData lllllllllllllIIllIIIllIllIIIIlII = new AiffData(lllllllllllllIIllIIIllIllIIIIlIl, lllllllllllllIIllIIIllIllIIIlIIl, (int)lllllllllllllIIllIIIllIllIIIlIlI.getSampleRate());
        try {
            lllllllllllllIIllIIIllIllIIIlIll.close();
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        catch (IOException ex) {}
        return lllllllllllllIIllIIIllIllIIIIlII;
    }
    
    private static void llIlIIlIllllIlI() {
        (lIIlIllIlIlllI = new int[14])[0] = ((0x53 ^ 0x12) & ~(0x1D ^ 0x5C));
        AiffData.lIIlIllIlIlllI[1] = " ".length();
        AiffData.lIIlIllIlIlllI[2] = (0x15 ^ 0x1D);
        AiffData.lIIlIllIlIlllI[3] = (0xFFFFBF94 & 0x516B);
        AiffData.lIIlIllIlIlllI[4] = (108 + 56 - 44 + 20 ^ 135 + 0 - 125 + 146);
        AiffData.lIIlIllIlIlllI[5] = (0xFFFF9F07 & 0x71F9);
        AiffData.lIIlIllIlIlllI[6] = "  ".length();
        AiffData.lIIlIllIlIlllI[7] = (0xFFFF99C3 & 0x773E);
        AiffData.lIIlIllIlIlllI[8] = (0xFFFF9B7F & 0x7583);
        AiffData.lIIlIllIlIlllI[9] = "   ".length();
        AiffData.lIIlIllIlIlllI[10] = (131 + 117 - 133 + 51 ^ 13 + 24 + 77 + 48);
        AiffData.lIIlIllIlIlllI[11] = -" ".length();
        AiffData.lIIlIllIlIlllI[12] = 119 + 94 - 207 + 121;
        AiffData.lIIlIllIlIlllI[13] = (0xAA ^ 0xAF);
    }
    
    private static boolean llIlIIlIllllllI(final int lllllllllllllIIllIIIllIlIIlllIIl, final int lllllllllllllIIllIIIllIlIIlllIII) {
        return lllllllllllllIIllIIIllIlIIlllIIl < lllllllllllllIIllIIIllIlIIlllIII;
    }
    
    private static String llIlIIlIllllIII(final String lllllllllllllIIllIIIllIlIlIlllIl, final String lllllllllllllIIllIIIllIlIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIllIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIllIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), AiffData.lIIlIllIlIlllI[2]), "DES");
            final Cipher lllllllllllllIIllIIIllIlIlIlllll = Cipher.getInstance("DES");
            lllllllllllllIIllIIIllIlIlIlllll.init(AiffData.lIIlIllIlIlllI[6], lllllllllllllIIllIIIllIlIllIIIII);
            return new String(lllllllllllllIIllIIIllIlIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIllIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIllIlIlIllllI) {
            lllllllllllllIIllIIIllIlIlIllllI.printStackTrace();
            return null;
        }
    }
    
    public static AiffData create(final String lllllllllllllIIllIIIllIllIlIlIll) {
        return create(AiffData.class.getClassLoader().getResource(lllllllllllllIIllIIIllIllIlIlIll));
    }
    
    static {
        llIlIIlIllllIlI();
        llIlIIlIllllIIl();
    }
    
    private static void llIlIIlIllllIIl() {
        (lIIlIllIlIllIl = new String[AiffData.lIIlIllIlIlllI[13]])[AiffData.lIIlIllIlIlllI[0]] = llIlIIlIlllIlll("Jh0RFgsWUwQbRxABFRUTFlMWBggeSVA=", "ssptg");
        AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[1]] = llIlIIlIlllIlll("DQcpIRU9STwsWTsbLSINPUkuMRY1SSEtCS0dOzcLPQgl", "XiHCy");
        AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[6]] = llIlIIlIllllIII("aWePNLAlbZXi8UMMWY6GwSrDH+8Z8p2a", "JjTEj");
        AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[9]] = llIlIIlIlllIlll("EyMYCQw7I1QfCjc/GAlLKSYOCQ==", "ZOtlk");
        AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[10]] = llIlIIlIlllIlll("ISUDDmcDJAEYZwE5TwQzCzkKGGcHOE8EMh47AAUzCy8=", "nKowG");
    }
    
    private AiffData(final ByteBuffer lllllllllllllIIllIIIllIllIllllII, final int lllllllllllllIIllIIIllIllIllIlll, final int lllllllllllllIIllIIIllIllIllIllI) {
        this.data = lllllllllllllIIllIIIllIllIllllII;
        this.format = lllllllllllllIIllIIIllIllIllIlll;
        this.samplerate = lllllllllllllIIllIIIllIllIllIllI;
    }
    
    public static AiffData create(final byte[] lllllllllllllIIllIIIllIllIIlllll) {
        try {
            return create(AudioSystem.getAudioInputStream(new BufferedInputStream(new ByteArrayInputStream(lllllllllllllIIllIIIllIllIIlllll))));
        }
        catch (Exception lllllllllllllIIllIIIllIllIlIIIIl) {
            lllllllllllllIIllIIIllIllIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIlllllII(final int lllllllllllllIIllIIIllIlIIllllIl, final int lllllllllllllIIllIIIllIlIIllllII) {
        return lllllllllllllIIllIIIllIlIIllllIl == lllllllllllllIIllIIIllIlIIllllII;
    }
    
    public static AiffData create(final InputStream lllllllllllllIIllIIIllIllIlIIlIl) {
        try {
            return create(AudioSystem.getAudioInputStream(lllllllllllllIIllIIIllIllIlIIlIl));
        }
        catch (Exception lllllllllllllIIllIIIllIllIlIIlll) {
            LWJGLUtil.log((CharSequence)AiffData.lIIlIllIlIllIl[AiffData.lIIlIllIlIlllI[1]]);
            lllllllllllllIIllIIIllIllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIlllllIl(final int lllllllllllllIIllIIIllIlIIlIllll, final int lllllllllllllIIllIIIllIlIIlIlllI) {
        return lllllllllllllIIllIIIllIlIIlIllll != lllllllllllllIIllIIIllIlIIlIlllI;
    }
    
    private static boolean llIlIIlIlllllll(final Object lllllllllllllIIllIIIllIlIIllIlIl, final Object lllllllllllllIIllIIIllIlIIllIlII) {
        return lllllllllllllIIllIIIllIlIIllIlIl == lllllllllllllIIllIIIllIlIIllIlII;
    }
    
    private static boolean llIlIIlIllllIll(final int lllllllllllllIIllIIIllIlIIllIIlI) {
        return lllllllllllllIIllIIIllIlIIllIIlI != 0;
    }
    
    public void dispose() {
        this.data.clear();
        "".length();
    }
    
    private static String llIlIIlIlllIlll(String lllllllllllllIIllIIIllIlIlIIlIII, final String lllllllllllllIIllIIIllIlIlIIIlll) {
        lllllllllllllIIllIIIllIlIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIllIlIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIllIlIlIIlIll = new StringBuilder();
        final char[] lllllllllllllIIllIIIllIlIlIIlIlI = lllllllllllllIIllIIIllIlIlIIIlll.toCharArray();
        int lllllllllllllIIllIIIllIlIlIIlIIl = AiffData.lIIlIllIlIlllI[0];
        final double lllllllllllllIIllIIIllIlIlIIIIll = (Object)lllllllllllllIIllIIIllIlIlIIlIII.toCharArray();
        final Exception lllllllllllllIIllIIIllIlIlIIIIlI = (Exception)lllllllllllllIIllIIIllIlIlIIIIll.length;
        short lllllllllllllIIllIIIllIlIlIIIIIl = (short)AiffData.lIIlIllIlIlllI[0];
        while (llIlIIlIllllllI(lllllllllllllIIllIIIllIlIlIIIIIl, (int)lllllllllllllIIllIIIllIlIlIIIIlI)) {
            final char lllllllllllllIIllIIIllIlIlIIlllI = lllllllllllllIIllIIIllIlIlIIIIll[lllllllllllllIIllIIIllIlIlIIIIIl];
            lllllllllllllIIllIIIllIlIlIIlIll.append((char)(lllllllllllllIIllIIIllIlIlIIlllI ^ lllllllllllllIIllIIIllIlIlIIlIlI[lllllllllllllIIllIIIllIlIlIIlIIl % lllllllllllllIIllIIIllIlIlIIlIlI.length]));
            "".length();
            ++lllllllllllllIIllIIIllIlIlIIlIIl;
            ++lllllllllllllIIllIIIllIlIlIIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIllIlIlIIlIll);
    }
    
    public static AiffData create(final ByteBuffer lllllllllllllIIllIIIllIllIIllIII) {
        try {
            byte[] lllllllllllllIIllIIIllIllIIllIll = null;
            if (llIlIIlIllllIll(lllllllllllllIIllIIIllIllIIllIII.hasArray() ? 1 : 0)) {
                lllllllllllllIIllIIIllIllIIllIll = lllllllllllllIIllIIIllIllIIllIII.array();
                "".length();
                if ("  ".length() == " ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIIIllIllIIllIll = new byte[lllllllllllllIIllIIIllIllIIllIII.capacity()];
                lllllllllllllIIllIIIllIllIIllIII.get(lllllllllllllIIllIIIllIllIIllIll);
                "".length();
            }
            return create(lllllllllllllIIllIIIllIllIIllIll);
        }
        catch (Exception lllllllllllllIIllIIIllIllIIllIlI) {
            lllllllllllllIIllIIIllIllIIllIlI.printStackTrace();
            return null;
        }
    }
}
