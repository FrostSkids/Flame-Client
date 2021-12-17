// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Arrays;
import java.lang.reflect.Field;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import sun.misc.Cleaner;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;

final class Cleaner0
{
    private static final /* synthetic */ int[] llIlIlIIlIlIII;
    private static final /* synthetic */ long CLEANER_FIELD_OFFSET;
    private static final /* synthetic */ String[] llIlIlIIlIIlll;
    private static final /* synthetic */ InternalLogger logger;
    
    private static int lIIlIIllllIllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIlIIllllIlIIIl() {
        (llIlIlIIlIIlll = new String[Cleaner0.llIlIlIIlIlIII[4]])[Cleaner0.llIlIlIIlIlIII[1]] = lIIlIIllllIIlllI("MhQVMyY0Cg==", "QxpRH");
        Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[0]] = lIIlIIllllIIllll("iaHCsGls05srSZjFZmc/6YKlSfVWWGwu+fiuEunmTxgOeezMdHgVQQ==", "qMxPY");
        Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[2]] = lIIlIIllllIIlllI("Myc4CzYzMzUH", "RQYbZ");
        Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[3]] = lIIlIIllllIlIIII("hz/E7Ay2Apn3AKj2hN7vRA==", "weKMf");
    }
    
    private static boolean lIIlIIllllIllIIl(final int llllllllllllIllIlIlIllIlIllIIIII, final int llllllllllllIllIlIlIllIlIlIlllll) {
        return llllllllllllIllIlIlIllIlIllIIIII < llllllllllllIllIlIlIllIlIlIlllll;
    }
    
    private static boolean lIIlIIllllIlIlIl(final int llllllllllllIllIlIlIllIlIlIllIll) {
        return llllllllllllIllIlIlIllIlIlIllIll != 0;
    }
    
    private Cleaner0() {
    }
    
    private static int lIIlIIllllIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIlIIllllIlIIlI() {
        (llIlIlIIlIlIII = new int[6])[0] = " ".length();
        Cleaner0.llIlIlIIlIlIII[1] = ((113 + 126 - 153 + 108 ^ 136 + 11 - 61 + 110) & (0x39 ^ 0x0 ^ (0x58 ^ 0x67) ^ -" ".length()));
        Cleaner0.llIlIlIIlIlIII[2] = "  ".length();
        Cleaner0.llIlIlIIlIlIII[3] = "   ".length();
        Cleaner0.llIlIlIIlIlIII[4] = (0xAC ^ 0xB8 ^ (0x5F ^ 0x4F));
        Cleaner0.llIlIlIIlIlIII[5] = (0x8E ^ 0x86);
    }
    
    private static String lIIlIIllllIIlllI(String llllllllllllIllIlIlIllIlIllllIII, final String llllllllllllIllIlIlIllIlIlllllII) {
        llllllllllllIllIlIlIllIlIllllIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIllIlIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIllIlIllllIll = new StringBuilder();
        final char[] llllllllllllIllIlIlIllIlIllllIlI = llllllllllllIllIlIlIllIlIlllllII.toCharArray();
        int llllllllllllIllIlIlIllIlIllllIIl = Cleaner0.llIlIlIIlIlIII[1];
        final String llllllllllllIllIlIlIllIlIlllIIll = (Object)llllllllllllIllIlIlIllIlIllllIII.toCharArray();
        final byte llllllllllllIllIlIlIllIlIlllIIlI = (byte)llllllllllllIllIlIlIllIlIlllIIll.length;
        float llllllllllllIllIlIlIllIlIlllIIIl = Cleaner0.llIlIlIIlIlIII[1];
        while (lIIlIIllllIllIIl((int)llllllllllllIllIlIlIllIlIlllIIIl, llllllllllllIllIlIlIllIlIlllIIlI)) {
            final char llllllllllllIllIlIlIllIlIllllllI = llllllllllllIllIlIlIllIlIlllIIll[llllllllllllIllIlIlIllIlIlllIIIl];
            llllllllllllIllIlIlIllIlIllllIll.append((char)(llllllllllllIllIlIlIllIlIllllllI ^ llllllllllllIllIlIlIllIlIllllIlI[llllllllllllIllIlIlIllIlIllllIIl % llllllllllllIllIlIlIllIlIllllIlI.length]));
            "".length();
            ++llllllllllllIllIlIlIllIlIllllIIl;
            ++llllllllllllIllIlIlIllIlIlllIIIl;
            "".length();
            if ((0x92 ^ 0x96) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIllIlIllllIll);
    }
    
    static void freeDirectBuffer(final ByteBuffer llllllllllllIllIlIlIllIllIlIIlll) {
        if (!lIIlIIllllIlIlIl(lIIlIIllllIlIIll(Cleaner0.CLEANER_FIELD_OFFSET, -1L)) || lIIlIIllllIlIllI(llllllllllllIllIlIlIllIllIlIIlll.isDirect() ? 1 : 0)) {
            return;
        }
        try {
            final Cleaner llllllllllllIllIlIlIllIllIlIlIIl = (Cleaner)PlatformDependent0.getObject(llllllllllllIllIlIlIllIllIlIIlll, Cleaner0.CLEANER_FIELD_OFFSET);
            if (lIIlIIllllIlIlll(llllllllllllIllIlIlIllIllIlIlIIl)) {
                llllllllllllIllIlIlIllIllIlIlIIl.clean();
            }
            "".length();
            if (-" ".length() >= (0xB6 ^ 0xB2)) {
                return;
            }
        }
        catch (Throwable t) {}
    }
    
    private static String lIIlIIllllIlIIII(final String llllllllllllIllIlIlIllIlIllIlIII, final String llllllllllllIllIlIlIllIlIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIlIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIllIlIllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIllIlIllIlIlI.init(Cleaner0.llIlIlIIlIlIII[2], llllllllllllIllIlIlIllIlIllIlIll);
            return new String(llllllllllllIllIlIlIllIlIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIlIllIlIIl) {
            llllllllllllIllIlIlIllIlIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIllllIlIIlI();
        lIIlIIllllIlIIIl();
        logger = InternalLoggerFactory.getInstance(Cleaner0.class);
        final ByteBuffer llllllllllllIllIlIlIllIllIIllIll = ByteBuffer.allocateDirect(Cleaner0.llIlIlIIlIlIII[0]);
        long llllllllllllIllIlIlIllIllIIllIIl = -1L;
        if (lIIlIIllllIlIlIl(PlatformDependent0.hasUnsafe() ? 1 : 0)) {
            try {
                final Field llllllllllllIllIlIlIllIllIIllIlI = llllllllllllIllIlIlIllIllIIllIll.getClass().getDeclaredField(Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[1]]);
                llllllllllllIllIlIlIllIllIIllIlI.setAccessible((boolean)(Cleaner0.llIlIlIIlIlIII[0] != 0));
                final Cleaner llllllllllllIllIlIlIllIllIIlllIl = (Cleaner)llllllllllllIllIlIlIllIllIIllIlI.get(llllllllllllIllIlIlIllIllIIllIll);
                llllllllllllIllIlIlIllIllIIlllIl.clean();
                llllllllllllIllIlIlIllIllIIllIIl = PlatformDependent0.objectFieldOffset(llllllllllllIllIlIlIllIllIIllIlI);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIlIlIllIllIIlllII) {
                llllllllllllIllIlIlIllIllIIllIIl = -1L;
            }
        }
        final InternalLogger logger2 = Cleaner0.logger;
        final String s = Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[0]];
        String s2;
        if (lIIlIIllllIlIlIl(lIIlIIllllIllIII(llllllllllllIllIlIlIllIllIIllIIl, -1L))) {
            s2 = Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[2]];
            "".length();
            if (((0x8F ^ 0xC4 ^ (0xF1 ^ 0xAB)) & (19 + 4 + 116 + 13 ^ 54 + 64 - 98 + 117 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            s2 = Cleaner0.llIlIlIIlIIlll[Cleaner0.llIlIlIIlIlIII[3]];
        }
        logger2.debug(s, s2);
        CLEANER_FIELD_OFFSET = llllllllllllIllIlIlIllIllIIllIIl;
        freeDirectBuffer(llllllllllllIllIlIlIllIllIIllIll);
    }
    
    private static boolean lIIlIIllllIlIllI(final int llllllllllllIllIlIlIllIlIlIllIIl) {
        return llllllllllllIllIlIlIllIlIlIllIIl == 0;
    }
    
    private static boolean lIIlIIllllIlIlll(final Object llllllllllllIllIlIlIllIlIlIlllIl) {
        return llllllllllllIllIlIlIllIlIlIlllIl != null;
    }
    
    private static String lIIlIIllllIIllll(final String llllllllllllIllIlIlIllIllIIIlIll, final String llllllllllllIllIlIlIllIllIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIllIllIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIllIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), Cleaner0.llIlIlIIlIlIII[5]), "DES");
            final Cipher llllllllllllIllIlIlIllIllIIIllll = Cipher.getInstance("DES");
            llllllllllllIllIlIlIllIllIIIllll.init(Cleaner0.llIlIlIIlIlIII[2], llllllllllllIllIlIlIllIllIIlIIII);
            return new String(llllllllllllIllIlIlIllIllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIllIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIllIllIIIlllI) {
            llllllllllllIllIlIlIllIllIIIlllI.printStackTrace();
            return null;
        }
    }
}
