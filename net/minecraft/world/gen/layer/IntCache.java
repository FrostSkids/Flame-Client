// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class IntCache
{
    private static /* synthetic */ List<int[]> freeSmallArrays;
    private static /* synthetic */ int intCacheSize;
    private static final /* synthetic */ int[] lllIIllIlIIllI;
    private static /* synthetic */ List<int[]> freeLargeArrays;
    private static /* synthetic */ List<int[]> inUseSmallArrays;
    private static final /* synthetic */ String[] lllIIllIlIIIll;
    private static /* synthetic */ List<int[]> inUseLargeArrays;
    
    private static boolean lIlIIIIIIllIIIIl(final int llllllllllllIlIlllIllllllIIIIllI, final int llllllllllllIlIlllIllllllIIIIlIl) {
        return llllllllllllIlIlllIllllllIIIIllI <= llllllllllllIlIlllIllllllIIIIlIl;
    }
    
    private static boolean lIlIIIIIIllIIIlI(final int llllllllllllIlIlllIlllllIlllllII) {
        return llllllllllllIlIlllIlllllIlllllII != 0;
    }
    
    private static String lIlIIIIIIlIIllll(String llllllllllllIlIlllIlllllllIIIIlI, final String llllllllllllIlIlllIlllllllIIIIII) {
        llllllllllllIlIlllIlllllllIIIIlI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIlllllllIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlllllllIIIlll = new StringBuilder();
        final char[] llllllllllllIlIlllIlllllllIIIllI = llllllllllllIlIlllIlllllllIIIIII.toCharArray();
        int llllllllllllIlIlllIlllllllIIIlII = IntCache.lllIIllIlIIllI[2];
        final Exception llllllllllllIlIlllIllllllIlllIII = (Object)((String)llllllllllllIlIlllIlllllllIIIIlI).toCharArray();
        final char llllllllllllIlIlllIllllllIllIllI = (char)llllllllllllIlIlllIllllllIlllIII.length;
        byte llllllllllllIlIlllIllllllIllIlII = (byte)IntCache.lllIIllIlIIllI[2];
        while (lIlIIIIIIllIIlIl(llllllllllllIlIlllIllllllIllIlII, llllllllllllIlIlllIllllllIllIllI)) {
            final char llllllllllllIlIlllIlllllllIIlIll = llllllllllllIlIlllIllllllIlllIII[llllllllllllIlIlllIllllllIllIlII];
            llllllllllllIlIlllIlllllllIIIlll.append((char)(llllllllllllIlIlllIlllllllIIlIll ^ llllllllllllIlIlllIlllllllIIIllI[llllllllllllIlIlllIlllllllIIIlII % llllllllllllIlIlllIlllllllIIIllI.length]));
            "".length();
            ++llllllllllllIlIlllIlllllllIIIlII;
            ++llllllllllllIlIlllIllllllIllIlII;
            "".length();
            if (" ".length() >= (0xC2 ^ 0xC6)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlllllllIIIlll);
    }
    
    public static synchronized String getCacheSizes() {
        return String.valueOf(new StringBuilder(IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[2]]).append(IntCache.freeLargeArrays.size()).append(IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[1]]).append(IntCache.freeSmallArrays.size()).append(IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[3]]).append(IntCache.inUseLargeArrays.size()).append(IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[4]]).append(IntCache.inUseSmallArrays.size()));
    }
    
    private static boolean lIlIIIIIIllIIIll(final int llllllllllllIlIlllIllllllIIIIIlI, final int llllllllllllIlIlllIllllllIIIIIII) {
        return llllllllllllIlIlllIllllllIIIIIlI > llllllllllllIlIlllIllllllIIIIIII;
    }
    
    private static boolean lIlIIIIIIllIIlIl(final int llllllllllllIlIlllIllllllIIIlIlI, final int llllllllllllIlIlllIllllllIIIlIIl) {
        return llllllllllllIlIlllIllllllIIIlIlI < llllllllllllIlIlllIllllllIIIlIIl;
    }
    
    public static synchronized int[] getIntCache(final int llllllllllllIlIlllIllllllllIllll) {
        if (lIlIIIIIIllIIIIl(llllllllllllIlIlllIllllllllIllll, IntCache.lllIIllIlIIllI[0])) {
            if (lIlIIIIIIllIIIlI(IntCache.freeSmallArrays.isEmpty() ? 1 : 0)) {
                final int[] llllllllllllIlIlllIllllllllllIIl = new int[IntCache.lllIIllIlIIllI[0]];
                IntCache.inUseSmallArrays.add(llllllllllllIlIlllIllllllllllIIl);
                "".length();
                return llllllllllllIlIlllIllllllllllIIl;
            }
            final int[] llllllllllllIlIlllIlllllllllIlll = IntCache.freeSmallArrays.remove(IntCache.freeSmallArrays.size() - IntCache.lllIIllIlIIllI[1]);
            IntCache.inUseSmallArrays.add(llllllllllllIlIlllIlllllllllIlll);
            "".length();
            return llllllllllllIlIlllIlllllllllIlll;
        }
        else {
            if (lIlIIIIIIllIIIll(llllllllllllIlIlllIllllllllIllll, IntCache.intCacheSize)) {
                IntCache.intCacheSize = llllllllllllIlIlllIllllllllIllll;
                IntCache.freeLargeArrays.clear();
                IntCache.inUseLargeArrays.clear();
                final int[] llllllllllllIlIlllIlllllllllIlIl = new int[IntCache.intCacheSize];
                IntCache.inUseLargeArrays.add(llllllllllllIlIlllIlllllllllIlIl);
                "".length();
                return llllllllllllIlIlllIlllllllllIlIl;
            }
            if (lIlIIIIIIllIIIlI(IntCache.freeLargeArrays.isEmpty() ? 1 : 0)) {
                final int[] llllllllllllIlIlllIlllllllllIIll = new int[IntCache.intCacheSize];
                IntCache.inUseLargeArrays.add(llllllllllllIlIlllIlllllllllIIll);
                "".length();
                return llllllllllllIlIlllIlllllllllIIll;
            }
            final int[] llllllllllllIlIlllIlllllllllIIIl = IntCache.freeLargeArrays.remove(IntCache.freeLargeArrays.size() - IntCache.lllIIllIlIIllI[1]);
            IntCache.inUseLargeArrays.add(llllllllllllIlIlllIlllllllllIIIl);
            "".length();
            return llllllllllllIlIlllIlllllllllIIIl;
        }
    }
    
    private static void lIlIIIIIIllIIIII() {
        (lllIIllIlIIllI = new int[7])[0] = (0xFFFF89F9 & 0x7706);
        IntCache.lllIIllIlIIllI[1] = " ".length();
        IntCache.lllIIllIlIIllI[2] = ((0x3B ^ 0xA ^ (0x4F ^ 0x61)) & (116 + 109 - 83 + 23 ^ 177 + 142 - 246 + 113 ^ -" ".length()));
        IntCache.lllIIllIlIIllI[3] = "  ".length();
        IntCache.lllIIllIlIIllI[4] = "   ".length();
        IntCache.lllIIllIlIIllI[5] = (0xF ^ 0x69 ^ (0x2E ^ 0x4C));
        IntCache.lllIIllIlIIllI[6] = (0x1C ^ 0x58 ^ (0x6 ^ 0x4A));
    }
    
    public static synchronized void resetIntCache() {
        if (lIlIIIIIIllIIlII(IntCache.freeLargeArrays.isEmpty() ? 1 : 0)) {
            IntCache.freeLargeArrays.remove(IntCache.freeLargeArrays.size() - IntCache.lllIIllIlIIllI[1]);
            "".length();
        }
        if (lIlIIIIIIllIIlII(IntCache.freeSmallArrays.isEmpty() ? 1 : 0)) {
            IntCache.freeSmallArrays.remove(IntCache.freeSmallArrays.size() - IntCache.lllIIllIlIIllI[1]);
            "".length();
        }
        IntCache.freeLargeArrays.addAll(IntCache.inUseLargeArrays);
        "".length();
        IntCache.freeSmallArrays.addAll(IntCache.inUseSmallArrays);
        "".length();
        IntCache.inUseLargeArrays.clear();
        IntCache.inUseSmallArrays.clear();
    }
    
    static {
        lIlIIIIIIllIIIII();
        lIlIIIIIIlIlIIIl();
        IntCache.intCacheSize = IntCache.lllIIllIlIIllI[0];
        IntCache.freeSmallArrays = (List<int[]>)Lists.newArrayList();
        IntCache.inUseSmallArrays = (List<int[]>)Lists.newArrayList();
        IntCache.freeLargeArrays = (List<int[]>)Lists.newArrayList();
        IntCache.inUseLargeArrays = (List<int[]>)Lists.newArrayList();
    }
    
    private static String lIlIIIIIIlIlIIII(final String llllllllllllIlIlllIllllllIIllIII, final String llllllllllllIlIlllIllllllIIlIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllllIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllllIIlIllI.getBytes(StandardCharsets.UTF_8)), IntCache.lllIIllIlIIllI[6]), "DES");
            final Cipher llllllllllllIlIlllIllllllIlIIIII = Cipher.getInstance("DES");
            llllllllllllIlIlllIllllllIlIIIII.init(IntCache.lllIIllIlIIllI[3], llllllllllllIlIlllIllllllIlIIIlI);
            return new String(llllllllllllIlIlllIllllllIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllllIIllllI) {
            llllllllllllIlIlllIllllllIIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIIllIIlII(final int llllllllllllIlIlllIlllllIllllIII) {
        return llllllllllllIlIlllIlllllIllllIII == 0;
    }
    
    private static void lIlIIIIIIlIlIIIl() {
        (lllIIllIlIIIll = new String[IntCache.lllIIllIlIIllI[5]])[IntCache.lllIIllIlIIllI[2]] = lIlIIIIIIlIIllll("NTI6ITZscw==", "VSYIS");
        IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[1]] = lIlIIIIIIlIlIIII("KcN7jtV4ycGePIUTpgs3zg==", "IIKyQ");
        IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[3]] = lIlIIIIIIlIlIIII("46Bw4SI4XV8kPQcV6CCzvA==", "yArbh");
        IntCache.lllIIllIlIIIll[IntCache.lllIIllIlIIllI[4]] = lIlIIIIIIlIIllll("Z0QeIC0nCwkgNS4AUGE=", "KdjAA");
    }
}
