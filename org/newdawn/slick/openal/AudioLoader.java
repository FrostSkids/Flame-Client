// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class AudioLoader
{
    private static final /* synthetic */ int[] lIIlllIllllIII;
    private static final /* synthetic */ String[] lIIlllIlllIllI;
    private static /* synthetic */ boolean inited;
    
    private static String llIlllIIlIIlIII(final String lllllllllllllIIlIIllIlIlIlIlIlII, final String lllllllllllllIIlIIllIlIlIlIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIlIlIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), AudioLoader.lIIlllIllllIII[8]), "DES");
            final Cipher lllllllllllllIIlIIllIlIlIlIllIII = Cipher.getInstance("DES");
            lllllllllllllIIlIIllIlIlIlIllIII.init(AudioLoader.lIIlllIllllIII[2], lllllllllllllIIlIIllIlIlIlIllIIl);
            return new String(lllllllllllllIIlIIllIlIlIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIlIlIlIlIlll) {
            lllllllllllllIIlIIllIlIlIlIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllIIlIlIIII(final int lllllllllllllIIlIIllIlIlIIIIlIIl) {
        return lllllllllllllIIlIIllIlIlIIIIlIIl == 0;
    }
    
    private static boolean llIlllIIlIlIIIl(final int lllllllllllllIIlIIllIlIlIIIIllIl) {
        return lllllllllllllIIlIIllIlIlIIIIllIl != 0;
    }
    
    private static void init() {
        if (llIlllIIlIlIIII(AudioLoader.inited ? 1 : 0)) {
            SoundStore.get().init();
            AudioLoader.inited = (AudioLoader.lIIlllIllllIII[0] != 0);
        }
    }
    
    private static void llIlllIIlIIllII() {
        (lIIlllIlllIllI = new String[AudioLoader.lIIlllIllllIII[13]])[AudioLoader.lIIlllIllllIII[1]] = llIlllIIlIIIlll("g2Cc4gQh79M=", "otQHj");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[0]] = llIlllIIlIIlIII("W6w+HNChFqU=", "qLJgD");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[2]] = llIlllIIlIIlIII("G5FJv1/yfkw=", "uPAXE");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[3]] = llIlllIIlIIlIIl("ADspAB0lOigBCDF1PBofODQuVQs6J3obAjt4KQEfMDQ3HAMydRsACTw6YFU=", "UUZum");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[4]] = llIlllIIlIIlIIl("OjAF", "uwBiZ");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[5]] = llIlllIIlIIlIII("cbQ6by5VIgI=", "LFehR");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[6]] = llIlllIIlIIlIII("T/9pdHW1fFg=", "AEobo");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[7]] = llIlllIIlIIlIIl("Hzg3Mxo6OTYyDy52IikYJzcwZgwlJGQ1HjgzJSsDJDFkBx8uPyt8Sg==", "JVDFj");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[8]] = llIlllIIlIIIlll("2oA7KbQdzhY=", "cxPvu");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[9]] = llIlllIIlIIlIIl("NSM=", "mnWlB");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[10]] = llIlllIIlIIlIIl("IjAs", "cyjMX");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[11]] = llIlllIIlIIIlll("gKLKLSHQJv8=", "IsdsA");
        AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[12]] = llIlllIIlIIlIIl("LyYq", "binQe");
    }
    
    public static Audio getStreamingAudio(final String lllllllllllllIIlIIllIlIlIlIlllll, final URL lllllllllllllIIlIIllIlIlIlIllllI) throws IOException {
        init();
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIlIlllll.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[4]]) ? 1 : 0)) {
            return SoundStore.get().getOggStream(lllllllllllllIIlIIllIlIlIlIllllI);
        }
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIlIlllll.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[5]]) ? 1 : 0)) {
            return SoundStore.get().getMOD(lllllllllllllIIlIIllIlIlIlIllllI.openStream());
        }
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIlIlllll.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[6]]) ? 1 : 0)) {
            return SoundStore.get().getMOD(lllllllllllllIIlIIllIlIlIlIllllI.openStream());
        }
        throw new IOException(String.valueOf(new StringBuilder().append(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[7]]).append(lllllllllllllIIlIIllIlIlIlIlllll)));
    }
    
    private static String llIlllIIlIIIlll(final String lllllllllllllIIlIIllIlIlIlIIlIIl, final String lllllllllllllIIlIIllIlIlIlIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIlIlIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllIlIlIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllIlIlIlIIlIll.init(AudioLoader.lIIlllIllllIII[2], lllllllllllllIIlIIllIlIlIlIIllII);
            return new String(lllllllllllllIIlIIllIlIlIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIlIlIlIIlIlI) {
            lllllllllllllIIlIIllIlIlIlIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllIIlIlIIlI(final int lllllllllllllIIlIIllIlIlIIIlIlIl, final int lllllllllllllIIlIIllIlIlIIIlIIll) {
        return lllllllllllllIIlIIllIlIlIIIlIlIl < lllllllllllllIIlIIllIlIlIIIlIIll;
    }
    
    public static void update() {
        init();
        SoundStore.get().poll(AudioLoader.lIIlllIllllIII[1]);
    }
    
    static {
        llIlllIIlIIllll();
        llIlllIIlIIllII();
        OGG = AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[8]];
        XM = AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[9]];
        AIF = AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[10]];
        WAV = AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[11]];
        MOD = AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[12]];
        AudioLoader.inited = (AudioLoader.lIIlllIllllIII[1] != 0);
    }
    
    private static void llIlllIIlIIllll() {
        (lIIlllIllllIII = new int[14])[0] = " ".length();
        AudioLoader.lIIlllIllllIII[1] = ((0xA7 ^ 0xC2 ^ (0x4A ^ 0x10)) & (0x43 ^ 0x14 ^ (0x78 ^ 0x10) ^ -" ".length()));
        AudioLoader.lIIlllIllllIII[2] = "  ".length();
        AudioLoader.lIIlllIllllIII[3] = "   ".length();
        AudioLoader.lIIlllIllllIII[4] = (0x7 ^ 0x48 ^ (0xF3 ^ 0xB8));
        AudioLoader.lIIlllIllllIII[5] = (0x62 ^ 0x67);
        AudioLoader.lIIlllIllllIII[6] = (0x11 ^ 0x17);
        AudioLoader.lIIlllIllllIII[7] = (0x5F ^ 0x58);
        AudioLoader.lIIlllIllllIII[8] = (66 + 92 - 16 + 17 ^ 50 + 36 - 46 + 111);
        AudioLoader.lIIlllIllllIII[9] = (0xC9 ^ 0xA0 ^ (0x4E ^ 0x2E));
        AudioLoader.lIIlllIllllIII[10] = (0x33 ^ 0x39);
        AudioLoader.lIIlllIllllIII[11] = (0x8C ^ 0x87);
        AudioLoader.lIIlllIllllIII[12] = (0xD1 ^ 0xB4 ^ (0x1A ^ 0x73));
        AudioLoader.lIIlllIllllIII[13] = ("   ".length() ^ (0x7 ^ 0x9));
    }
    
    public static Audio getAudio(final String lllllllllllllIIlIIllIlIlIllIIlIl, final InputStream lllllllllllllIIlIIllIlIlIllIIlII) throws IOException {
        init();
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIllIIlIl.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[1]]) ? 1 : 0)) {
            return SoundStore.get().getAIF(lllllllllllllIIlIIllIlIlIllIIlII);
        }
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIllIIlIl.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[0]]) ? 1 : 0)) {
            return SoundStore.get().getWAV(lllllllllllllIIlIIllIlIlIllIIlII);
        }
        if (llIlllIIlIlIIIl(lllllllllllllIIlIIllIlIlIllIIlIl.equals(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[2]]) ? 1 : 0)) {
            return SoundStore.get().getOgg(lllllllllllllIIlIIllIlIlIllIIlII);
        }
        throw new IOException(String.valueOf(new StringBuilder().append(AudioLoader.lIIlllIlllIllI[AudioLoader.lIIlllIllllIII[3]]).append(lllllllllllllIIlIIllIlIlIllIIlIl)));
    }
    
    private static String llIlllIIlIIlIIl(String lllllllllllllIIlIIllIlIlIIlIlIll, final String lllllllllllllIIlIIllIlIlIIllIIII) {
        lllllllllllllIIlIIllIlIlIIlIlIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllIlIlIIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllIlIlIIlIlllI = new StringBuilder();
        final char[] lllllllllllllIIlIIllIlIlIIlIllIl = lllllllllllllIIlIIllIlIlIIllIIII.toCharArray();
        int lllllllllllllIIlIIllIlIlIIlIllII = AudioLoader.lIIlllIllllIII[1];
        final boolean lllllllllllllIIlIIllIlIlIIlIIIll = (Object)((String)lllllllllllllIIlIIllIlIlIIlIlIll).toCharArray();
        final short lllllllllllllIIlIIllIlIlIIlIIIlI = (short)lllllllllllllIIlIIllIlIlIIlIIIll.length;
        double lllllllllllllIIlIIllIlIlIIlIIIIl = AudioLoader.lIIlllIllllIII[1];
        while (llIlllIIlIlIIlI((int)lllllllllllllIIlIIllIlIlIIlIIIIl, lllllllllllllIIlIIllIlIlIIlIIIlI)) {
            final char lllllllllllllIIlIIllIlIlIIllIlII = lllllllllllllIIlIIllIlIlIIlIIIll[lllllllllllllIIlIIllIlIlIIlIIIIl];
            lllllllllllllIIlIIllIlIlIIlIlllI.append((char)(lllllllllllllIIlIIllIlIlIIllIlII ^ lllllllllllllIIlIIllIlIlIIlIllIl[lllllllllllllIIlIIllIlIlIIlIllII % lllllllllllllIIlIIllIlIlIIlIllIl.length]));
            "".length();
            ++lllllllllllllIIlIIllIlIlIIlIllII;
            ++lllllllllllllIIlIIllIlIlIIlIIIIl;
            "".length();
            if (" ".length() < ((0x54 ^ 0x6D) & ~(0x60 ^ 0x59))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllIlIlIIlIlllI);
    }
}
