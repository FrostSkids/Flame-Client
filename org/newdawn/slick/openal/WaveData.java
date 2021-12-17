// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.nio.ShortBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.URL;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import org.lwjgl.LWJGLUtil;
import javax.sound.sampled.AudioSystem;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import java.nio.ByteBuffer;

public class WaveData
{
    private static final /* synthetic */ String[] lIlllIIllllIll;
    public final /* synthetic */ int samplerate;
    public final /* synthetic */ int format;
    public final /* synthetic */ ByteBuffer data;
    private static final /* synthetic */ int[] lIlllIIlllllII;
    
    public static WaveData create(final AudioInputStream llllllllllllIlllllIIIllIllIIlllI) {
        final AudioFormat llllllllllllIlllllIIIllIllIIllIl = llllllllllllIlllllIIIllIllIIlllI.getFormat();
        int llllllllllllIlllllIIIllIllIIllII = WaveData.lIlllIIlllllII[0];
        if (lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getChannels(), WaveData.lIlllIIlllllII[1])) {
            if (lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits(), WaveData.lIlllIIlllllII[2])) {
                llllllllllllIlllllIIIllIllIIllII = WaveData.lIlllIIlllllII[3];
                "".length();
                if (" ".length() >= (0x78 ^ 0x7C)) {
                    return null;
                }
            }
            else {
                if (!lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits(), WaveData.lIlllIIlllllII[4])) {
                    throw new RuntimeException(WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[6]]);
                }
                llllllllllllIlllllIIIllIllIIllII = WaveData.lIlllIIlllllII[5];
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else {
            if (!lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getChannels(), WaveData.lIlllIIlllllII[6])) {
                throw new RuntimeException(WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[10]]);
            }
            if (lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits(), WaveData.lIlllIIlllllII[2])) {
                llllllllllllIlllllIIIllIllIIllII = WaveData.lIlllIIlllllII[7];
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            else {
                if (!lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits(), WaveData.lIlllIIlllllII[4])) {
                    throw new RuntimeException(WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[9]]);
                }
                llllllllllllIlllllIIIllIllIIllII = WaveData.lIlllIIlllllII[8];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
        }
        final byte[] llllllllllllIlllllIIIllIllIIlIll = new byte[llllllllllllIlllllIIIllIllIIllIl.getChannels() * (int)llllllllllllIlllllIIIllIllIIlllI.getFrameLength() * llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits() / WaveData.lIlllIIlllllII[2]];
        int llllllllllllIlllllIIIllIllIIlIlI = WaveData.lIlllIIlllllII[0];
        int llllllllllllIlllllIIIllIllIIlIIl = WaveData.lIlllIIlllllII[0];
        try {
            while (lIIIIIlIIlIlllll(llllllllllllIlllllIIIllIllIIlIlI = llllllllllllIlllllIIIllIllIIlllI.read(llllllllllllIlllllIIIllIllIIlIll, llllllllllllIlllllIIIllIllIIlIIl, llllllllllllIlllllIIIllIllIIlIll.length - llllllllllllIlllllIIIllIllIIlIIl), WaveData.lIlllIIlllllII[11]) && lIIIIIlIIllIIIII(llllllllllllIlllllIIIllIllIIlIIl, llllllllllllIlllllIIIllIllIIlIll.length)) {
                llllllllllllIlllllIIIllIllIIlIIl += llllllllllllIlllllIIIllIllIIlIlI;
                "".length();
                if ((0x41 ^ 0x3A ^ 63 + 21 - 11 + 54) == -" ".length()) {
                    return null;
                }
            }
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (IOException llllllllllllIlllllIIIllIllIlIIII) {
            return null;
        }
        final byte[] llllllllllllIlllllIIIllIlIllIlIl = llllllllllllIlllllIIIllIllIIlIll;
        int llllllllllllIlllllIIIllIlIllIIII;
        if (lIIIIIlIIlIllllI(llllllllllllIlllllIIIllIllIIllIl.getSampleSizeInBits(), WaveData.lIlllIIlllllII[4])) {
            llllllllllllIlllllIIIllIlIllIIII = WaveData.lIlllIIlllllII[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIIIllIlIllIIII = WaveData.lIlllIIlllllII[0];
        }
        final ByteBuffer llllllllllllIlllllIIIllIllIIlIII = convertAudioBytes(llllllllllllIlllllIIIllIlIllIlIl, (boolean)(llllllllllllIlllllIIIllIlIllIIII != 0));
        final WaveData llllllllllllIlllllIIIllIllIIIlll = new WaveData(llllllllllllIlllllIIIllIllIIlIII, llllllllllllIlllllIIIllIllIIllII, (int)llllllllllllIlllllIIIllIllIIllIl.getSampleRate());
        try {
            llllllllllllIlllllIIIllIllIIlllI.close();
            "".length();
            if ("   ".length() < -" ".length()) {
                return null;
            }
        }
        catch (IOException ex) {}
        return llllllllllllIlllllIIIllIllIIIlll;
    }
    
    public static WaveData create(final InputStream llllllllllllIlllllIIIllIlllIlIII) {
        try {
            return create(AudioSystem.getAudioInputStream(llllllllllllIlllllIIIllIlllIlIII));
        }
        catch (Exception llllllllllllIlllllIIIllIlllIlIlI) {
            LWJGLUtil.log((CharSequence)WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[1]]);
            llllllllllllIlllllIIIllIlllIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIIllIIIII(final int llllllllllllIlllllIIIllIIlllIIll, final int llllllllllllIlllllIIIllIIlllIIlI) {
        return llllllllllllIlllllIIIllIIlllIIll < llllllllllllIlllllIIIllIIlllIIlI;
    }
    
    private static void lIIIIIlIIlIlllII() {
        (lIlllIIlllllII = new int[13])[0] = ("   ".length() & ~"   ".length());
        WaveData.lIlllIIlllllII[1] = " ".length();
        WaveData.lIlllIIlllllII[2] = (0x1C ^ 0x61 ^ (0x7B ^ 0xE));
        WaveData.lIlllIIlllllII[3] = (0xFFFFF7CB & 0x1934);
        WaveData.lIlllIIlllllII[4] = (0x4F ^ 0x5F);
        WaveData.lIlllIIlllllII[5] = (0xFFFFF9FF & 0x1701);
        WaveData.lIlllIIlllllII[6] = "  ".length();
        WaveData.lIlllIIlllllII[7] = (-(0xFFFFEEDE & 0x3FB7) & (0xFFFFBFB7 & 0x7FDF));
        WaveData.lIlllIIlllllII[8] = (0xFFFFFB8F & 0x1573);
        WaveData.lIlllIIlllllII[9] = "   ".length();
        WaveData.lIlllIIlllllII[10] = (0x1 ^ 0x5);
        WaveData.lIlllIIlllllII[11] = -" ".length();
        WaveData.lIlllIIlllllII[12] = (140 + 95 - 156 + 64 ^ 88 + 111 - 198 + 137);
    }
    
    private static void lIIIIIlIIlIllIll() {
        (lIlllIIllllIll = new String[WaveData.lIlllIIlllllII[12]])[WaveData.lIlllIIlllllII[0]] = lIIIIIlIIlIllIII("LQkbAxgdRw4OVBsVHwAAHUccExsVXVo=", "xgzat");
        WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[1]] = lIIIIIlIIlIllIII("HwkzFR0vRyYYUSkVNxYFL0c0BR4nRzsZAT8TIQMDLwY/", "JgRwq");
        WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[6]] = lIIIIIlIIlIllIII("KAcBIzUAB001MwwbASNyEgIXIw==", "akmFR");
        WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[9]] = lIIIIIlIIlIllIIl("8bnw8JfVPx2178ryJPqhReNUZdiWC/t1", "Ixunn");
        WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[10]] = lIIIIIlIIlIllIlI("SBkczOKxPBf4gSmmBSQmBoN8Wpy+VaIbQrPG1ZVtqTyipALYMV2hpQ==", "qIkHX");
    }
    
    public static WaveData create(final byte[] llllllllllllIlllllIIIllIlllIIIll) {
        try {
            return create(AudioSystem.getAudioInputStream(new BufferedInputStream(new ByteArrayInputStream(llllllllllllIlllllIIIllIlllIIIll))));
        }
        catch (Exception llllllllllllIlllllIIIllIlllIIlII) {
            llllllllllllIlllllIIIllIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIIlIIlIlllII();
        lIIIIIlIIlIllIll();
    }
    
    public static WaveData create(final URL llllllllllllIlllllIIIllIllllIIIl) {
        try {
            return create(AudioSystem.getAudioInputStream(new BufferedInputStream(llllllllllllIlllllIIIllIllllIIIl.openStream())));
        }
        catch (Exception llllllllllllIlllllIIIllIllllIIll) {
            LWJGLUtil.log((CharSequence)String.valueOf(new StringBuilder().append(WaveData.lIlllIIllllIll[WaveData.lIlllIIlllllII[0]]).append(llllllllllllIlllllIIIllIllllIIIl)));
            llllllllllllIlllllIIIllIllllIIll.printStackTrace();
            return null;
        }
    }
    
    public static WaveData create(final ByteBuffer llllllllllllIlllllIIIllIllIllIll) {
        try {
            byte[] llllllllllllIlllllIIIllIllIllllI = null;
            if (lIIIIIlIIlIlllIl(llllllllllllIlllllIIIllIllIllIll.hasArray() ? 1 : 0)) {
                llllllllllllIlllllIIIllIllIllllI = llllllllllllIlllllIIIllIllIllIll.array();
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else {
                llllllllllllIlllllIIIllIllIllllI = new byte[llllllllllllIlllllIIIllIllIllIll.capacity()];
                llllllllllllIlllllIIIllIllIllIll.get(llllllllllllIlllllIIIllIllIllllI);
                "".length();
            }
            return create(llllllllllllIlllllIIIllIllIllllI);
        }
        catch (Exception llllllllllllIlllllIIIllIllIlllIl) {
            llllllllllllIlllllIIIllIllIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIIlIllllI(final int llllllllllllIlllllIIIllIIlllIlll, final int llllllllllllIlllllIIIllIIlllIllI) {
        return llllllllllllIlllllIIIllIIlllIlll == llllllllllllIlllllIIIllIIlllIllI;
    }
    
    private static String lIIIIIlIIlIllIIl(final String llllllllllllIlllllIIIllIlIIIllII, final String llllllllllllIlllllIIIllIlIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIllIlIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIllIlIIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIllIlIIIlllI.init(WaveData.lIlllIIlllllII[6], llllllllllllIlllllIIIllIlIIIllll);
            return new String(llllllllllllIlllllIIIllIlIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIllIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIllIlIIIllIl) {
            llllllllllllIlllllIIIllIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public void dispose() {
        this.data.clear();
        "".length();
    }
    
    private static String lIIIIIlIIlIllIlI(final String llllllllllllIlllllIIIllIIlllllIl, final String llllllllllllIlllllIIIllIIllllllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIllIlIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIllIIllllllI.getBytes(StandardCharsets.UTF_8)), WaveData.lIlllIIlllllII[2]), "DES");
            final Cipher llllllllllllIlllllIIIllIlIIIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIIllIlIIIIIIl.init(WaveData.lIlllIIlllllII[6], llllllllllllIlllllIIIllIlIIIIIlI);
            return new String(llllllllllllIlllllIIIllIlIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIllIlIIIIIII) {
            llllllllllllIlllllIIIllIlIIIIIII.printStackTrace();
            return null;
        }
    }
    
    public static WaveData create(final String llllllllllllIlllllIIIllIlllIlllI) {
        return create(WaveData.class.getClassLoader().getResource(llllllllllllIlllllIIIllIlllIlllI));
    }
    
    private static ByteBuffer convertAudioBytes(final byte[] llllllllllllIlllllIIIllIlIllIlIl, final boolean llllllllllllIlllllIIIllIlIllIIII) {
        final ByteBuffer llllllllllllIlllllIIIllIlIllIIll = ByteBuffer.allocateDirect(llllllllllllIlllllIIIllIlIllIlIl.length);
        llllllllllllIlllllIIIllIlIllIIll.order(ByteOrder.nativeOrder());
        "".length();
        final ByteBuffer llllllllllllIlllllIIIllIlIllIIlI = ByteBuffer.wrap(llllllllllllIlllllIIIllIlIllIlIl);
        llllllllllllIlllllIIIllIlIllIIlI.order(ByteOrder.LITTLE_ENDIAN);
        "".length();
        if (lIIIIIlIIlIlllIl(llllllllllllIlllllIIIllIlIllIIII ? 1 : 0)) {
            final ShortBuffer llllllllllllIlllllIIIllIlIllIlll = llllllllllllIlllllIIIllIlIllIIll.asShortBuffer();
            final ShortBuffer llllllllllllIlllllIIIllIlIllIllI = llllllllllllIlllllIIIllIlIllIIlI.asShortBuffer();
            while (lIIIIIlIIlIlllIl(llllllllllllIlllllIIIllIlIllIllI.hasRemaining() ? 1 : 0)) {
                llllllllllllIlllllIIIllIlIllIlll.put(llllllllllllIlllllIIIllIlIllIllI.get());
                "".length();
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
            }
            "".length();
            if ("   ".length() == (0xD1 ^ 0xC7 ^ (0xD6 ^ 0xC4))) {
                return null;
            }
        }
        else {
            while (lIIIIIlIIlIlllIl(llllllllllllIlllllIIIllIlIllIIlI.hasRemaining() ? 1 : 0)) {
                llllllllllllIlllllIIIllIlIllIIll.put(llllllllllllIlllllIIIllIlIllIIlI.get());
                "".length();
                "".length();
                if (((108 + 100 - 146 + 83 ^ 190 + 150 - 269 + 123) & (0x6B ^ 0x9 ^ (0xF2 ^ 0xC3) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
        }
        llllllllllllIlllllIIIllIlIllIIll.rewind();
        "".length();
        return llllllllllllIlllllIIIllIlIllIIll;
    }
    
    private static String lIIIIIlIIlIllIII(String llllllllllllIlllllIIIllIlIIlllII, final String llllllllllllIlllllIIIllIlIIllIll) {
        llllllllllllIlllllIIIllIlIIlllII = new String(Base64.getDecoder().decode(llllllllllllIlllllIIIllIlIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIIllIlIIlllll = new StringBuilder();
        final char[] llllllllllllIlllllIIIllIlIIllllI = llllllllllllIlllllIIIllIlIIllIll.toCharArray();
        int llllllllllllIlllllIIIllIlIIlllIl = WaveData.lIlllIIlllllII[0];
        final int llllllllllllIlllllIIIllIlIIlIlll = (Object)llllllllllllIlllllIIIllIlIIlllII.toCharArray();
        final byte llllllllllllIlllllIIIllIlIIlIllI = (byte)llllllllllllIlllllIIIllIlIIlIlll.length;
        double llllllllllllIlllllIIIllIlIIlIlIl = WaveData.lIlllIIlllllII[0];
        while (lIIIIIlIIllIIIII((int)llllllllllllIlllllIIIllIlIIlIlIl, llllllllllllIlllllIIIllIlIIlIllI)) {
            final char llllllllllllIlllllIIIllIlIlIIIlI = llllllllllllIlllllIIIllIlIIlIlll[llllllllllllIlllllIIIllIlIIlIlIl];
            llllllllllllIlllllIIIllIlIIlllll.append((char)(llllllllllllIlllllIIIllIlIlIIIlI ^ llllllllllllIlllllIIIllIlIIllllI[llllllllllllIlllllIIIllIlIIlllIl % llllllllllllIlllllIIIllIlIIllllI.length]));
            "".length();
            ++llllllllllllIlllllIIIllIlIIlllIl;
            ++llllllllllllIlllllIIIllIlIIlIlIl;
            "".length();
            if (" ".length() >= (0xF0 ^ 0x8B ^ 36 + 51 - 37 + 77)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIIllIlIIlllll);
    }
    
    private WaveData(final ByteBuffer llllllllllllIlllllIIIllIllllllll, final int llllllllllllIlllllIIIllIlllllllI, final int llllllllllllIlllllIIIllIlllllIIl) {
        this.data = llllllllllllIlllllIIIllIllllllll;
        this.format = llllllllllllIlllllIIIllIlllllllI;
        this.samplerate = llllllllllllIlllllIIIllIlllllIIl;
    }
    
    private static boolean lIIIIIlIIlIlllIl(final int llllllllllllIlllllIIIllIIlllIIII) {
        return llllllllllllIlllllIIIllIIlllIIII != 0;
    }
    
    private static boolean lIIIIIlIIlIlllll(final int llllllllllllIlllllIIIllIIllIllIl, final int llllllllllllIlllllIIIllIIllIllII) {
        return llllllllllllIlllllIIIllIIllIllIl != llllllllllllIlllllIIIllIIllIllII;
    }
}
