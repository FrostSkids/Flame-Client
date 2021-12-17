// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.Serializable;
import java.util.UUID;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;

public class MathHelper
{
    private static final /* synthetic */ double[] field_181165_f;
    private static final /* synthetic */ double field_181163_d;
    private static final /* synthetic */ int[] multiplyDeBruijnBitPosition;
    private static final /* synthetic */ int[] lIIlllIlllIIll;
    private static final /* synthetic */ float[] SIN_TABLE;
    private static final /* synthetic */ String[] lIIlllIlllIIlI;
    private static final /* synthetic */ double[] field_181164_e;
    
    public static float randomFloatClamp(final Random lllllllllllllIIlIIllIllIllllIlIl, final float lllllllllllllIIlIIllIllIllllIlII, final float lllllllllllllIIlIIllIllIllllIllI) {
        float n;
        if (llIlllIIIlIlIlI(llIlllIIIlllIIl(lllllllllllllIIlIIllIllIllllIlII, lllllllllllllIIlIIllIllIllllIllI))) {
            n = lllllllllllllIIlIIllIllIllllIlII;
            "".length();
            if (((100 + 41 - 11 + 1 ^ 138 + 144 - 110 + 2) & (156 + 100 - 236 + 152 ^ 54 + 76 - 121 + 120 ^ -" ".length())) != 0x0) {
                return 0.0f;
            }
        }
        else {
            n = lllllllllllllIIlIIllIllIllllIlIl.nextFloat() * (lllllllllllllIIlIIllIllIllllIllI - lllllllllllllIIlIIllIllIllllIlII) + lllllllllllllIIlIIllIllIllllIlII;
        }
        return n;
    }
    
    public static float abs(final float lllllllllllllIIlIIllIlllIlIIIlII) {
        float n;
        if (llIlllIIIlIlIlI(llIlllIIIlIlIll(lllllllllllllIIlIIllIlllIlIIIlII, 0.0f))) {
            n = lllllllllllllIIlIIllIlllIlIIIlII;
            "".length();
            if ("  ".length() < 0) {
                return 0.0f;
            }
        }
        else {
            n = -lllllllllllllIIlIIllIlllIlIIIlII;
        }
        return n;
    }
    
    public static float sqrt_double(final double lllllllllllllIIlIIllIlllIlIlllll) {
        return (float)Math.sqrt(lllllllllllllIIlIIllIlllIlIlllll);
    }
    
    public static int func_181758_c(final float lllllllllllllIIlIIllIlIllllIllIl, final float lllllllllllllIIlIIllIlIllllIllII, final float lllllllllllllIIlIIllIlIllllIlIll) {
        final int lllllllllllllIIlIIllIlIllllIlIlI = (int)(lllllllllllllIIlIIllIlIllllIllIl * 6.0f) % MathHelper.lIIlllIlllIIll[11];
        final float lllllllllllllIIlIIllIlIllllIlIIl = lllllllllllllIIlIIllIlIllllIllIl * 6.0f - lllllllllllllIIlIIllIlIllllIlIlI;
        final float lllllllllllllIIlIIllIlIllllIlIII = lllllllllllllIIlIIllIlIllllIlIll * (1.0f - lllllllllllllIIlIIllIlIllllIllII);
        final float lllllllllllllIIlIIllIlIllllIIlll = lllllllllllllIIlIIllIlIllllIlIll * (1.0f - lllllllllllllIIlIIllIlIllllIlIIl * lllllllllllllIIlIIllIlIllllIllII);
        final float lllllllllllllIIlIIllIlIllllIIllI = lllllllllllllIIlIIllIlIllllIlIll * (1.0f - (1.0f - lllllllllllllIIlIIllIlIllllIlIIl) * lllllllllllllIIlIIllIlIllllIllII);
        switch (lllllllllllllIIlIIllIlIllllIlIlI) {
            case 0: {
                final float lllllllllllllIIlIIllIlIllllIIlIl = lllllllllllllIIlIIllIlIllllIlIll;
                final float lllllllllllllIIlIIllIlIlllIllllI = lllllllllllllIIlIIllIlIllllIIllI;
                final float lllllllllllllIIlIIllIlIlllIlIlll = lllllllllllllIIlIIllIlIllllIlIII;
                "".length();
                if ("   ".length() > (0xF ^ 0x5A ^ (0x4F ^ 0x1E))) {
                    return (143 + 8 - 19 + 103 ^ 148 + 110 - 181 + 109) & (0x47 ^ 0x26 ^ (0x28 ^ 0x18) ^ -" ".length());
                }
                break;
            }
            case 1: {
                final float lllllllllllllIIlIIllIlIllllIIlII = lllllllllllllIIlIIllIlIllllIIlll;
                final float lllllllllllllIIlIIllIlIlllIlllIl = lllllllllllllIIlIIllIlIllllIlIll;
                final float lllllllllllllIIlIIllIlIlllIlIllI = lllllllllllllIIlIIllIlIllllIlIII;
                "".length();
                if (-"  ".length() > 0) {
                    return (" ".length() ^ (0x2F ^ 0x79)) & (0xBB ^ 0x9A ^ (0x27 ^ 0x51) ^ -" ".length());
                }
                break;
            }
            case 2: {
                final float lllllllllllllIIlIIllIlIllllIIIll = lllllllllllllIIlIIllIlIllllIlIII;
                final float lllllllllllllIIlIIllIlIlllIlllII = lllllllllllllIIlIIllIlIllllIlIll;
                final float lllllllllllllIIlIIllIlIlllIlIlIl = lllllllllllllIIlIIllIlIllllIIllI;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return (0x8F ^ 0x87) & ~(0xBD ^ 0xB5);
                }
                break;
            }
            case 3: {
                final float lllllllllllllIIlIIllIlIllllIIIlI = lllllllllllllIIlIIllIlIllllIlIII;
                final float lllllllllllllIIlIIllIlIlllIllIll = lllllllllllllIIlIIllIlIllllIIlll;
                final float lllllllllllllIIlIIllIlIlllIlIlII = lllllllllllllIIlIIllIlIllllIlIll;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return (0x64 ^ 0x73) & ~(0x1 ^ 0x16);
                }
                break;
            }
            case 4: {
                final float lllllllllllllIIlIIllIlIllllIIIIl = lllllllllllllIIlIIllIlIllllIIllI;
                final float lllllllllllllIIlIIllIlIlllIllIlI = lllllllllllllIIlIIllIlIllllIlIII;
                final float lllllllllllllIIlIIllIlIlllIlIIll = lllllllllllllIIlIIllIlIllllIlIll;
                "".length();
                if (((0x6 ^ 0x45) & ~(0x3A ^ 0x79)) < 0) {
                    return (0x91 ^ 0x86) & ~(0xD1 ^ 0xC6);
                }
                break;
            }
            case 5: {
                final float lllllllllllllIIlIIllIlIllllIIIII = lllllllllllllIIlIIllIlIllllIlIll;
                final float lllllllllllllIIlIIllIlIlllIllIIl = lllllllllllllIIlIIllIlIllllIlIII;
                final float lllllllllllllIIlIIllIlIlllIlIIlI = lllllllllllllIIlIIllIlIllllIIlll;
                "".length();
                if (" ".length() != " ".length()) {
                    return (75 + 71 - 116 + 101 ^ 56 + 110 - 93 + 64) & (106 + 182 - 230 + 142 ^ 63 + 186 - 96 + 41 ^ -" ".length());
                }
                break;
            }
            default: {
                throw new RuntimeException(String.valueOf(new StringBuilder(MathHelper.lIIlllIlllIIlI[MathHelper.lIIlllIlllIIll[1]]).append(lllllllllllllIIlIIllIlIllllIllIl).append(MathHelper.lIIlllIlllIIlI[MathHelper.lIIlllIlllIIll[3]]).append(lllllllllllllIIlIIllIlIllllIllII).append(MathHelper.lIIlllIlllIIlI[MathHelper.lIIlllIlllIIll[4]]).append(lllllllllllllIIlIIllIlIllllIlIll)));
            }
        }
        final float lllllllllllllIIlIIllIlIlllIlllll;
        final int lllllllllllllIIlIIllIlIlllIlIIII = clamp_int((int)(lllllllllllllIIlIIllIlIlllIlllll * 255.0f), MathHelper.lIIlllIlllIIll[1], MathHelper.lIIlllIlllIIll[40]);
        final float lllllllllllllIIlIIllIlIlllIllIII;
        final int lllllllllllllIIlIIllIlIlllIIllll = clamp_int((int)(lllllllllllllIIlIIllIlIlllIllIII * 255.0f), MathHelper.lIIlllIlllIIll[1], MathHelper.lIIlllIlllIIll[40]);
        final float lllllllllllllIIlIIllIlIlllIlIIIl;
        final int lllllllllllllIIlIIllIlIlllIIlllI = clamp_int((int)(lllllllllllllIIlIIllIlIlllIlIIIl * 255.0f), MathHelper.lIIlllIlllIIll[1], MathHelper.lIIlllIlllIIll[40]);
        return lllllllllllllIIlIIllIlIlllIlIIII << MathHelper.lIIlllIlllIIll[26] | lllllllllllllIIlIIllIlIlllIIllll << MathHelper.lIIlllIlllIIll[14] | lllllllllllllIIlIIllIlIlllIIlllI;
    }
    
    private static boolean isPowerOfTwo(final int lllllllllllllIIlIIllIllIlIIlllIl) {
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIlIIlllIl) && llIlllIIlIIIIIl(lllllllllllllIIlIIllIllIlIIlllIl & lllllllllllllIIlIIllIllIlIIlllIl - MathHelper.lIIlllIlllIIll[3])) {
            return MathHelper.lIIlllIlllIIll[3] != 0;
        }
        return MathHelper.lIIlllIlllIIll[1] != 0;
    }
    
    private static int llIlllIIIlIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String llIlllIIIlIIIII(String lllllllllllllIIlIIllIlIllIlIIIll, final String lllllllllllllIIlIIllIlIllIlIIlll) {
        lllllllllllllIIlIIllIlIllIlIIIll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllIlIllIlIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllIlIllIlIIllI = new StringBuilder();
        final char[] lllllllllllllIIlIIllIlIllIlIIlIl = lllllllllllllIIlIIllIlIllIlIIlll.toCharArray();
        int lllllllllllllIIlIIllIlIllIlIIlII = MathHelper.lIIlllIlllIIll[1];
        final long lllllllllllllIIlIIllIlIllIIllllI = (Object)((String)lllllllllllllIIlIIllIlIllIlIIIll).toCharArray();
        final int lllllllllllllIIlIIllIlIllIIlllIl = lllllllllllllIIlIIllIlIllIIllllI.length;
        char lllllllllllllIIlIIllIlIllIIlllII = (char)MathHelper.lIIlllIlllIIll[1];
        while (llIlllIIIlIllll(lllllllllllllIIlIIllIlIllIIlllII, lllllllllllllIIlIIllIlIllIIlllIl)) {
            final char lllllllllllllIIlIIllIlIllIlIlIIl = lllllllllllllIIlIIllIlIllIIllllI[lllllllllllllIIlIIllIlIllIIlllII];
            lllllllllllllIIlIIllIlIllIlIIllI.append((char)(lllllllllllllIIlIIllIlIllIlIlIIl ^ lllllllllllllIIlIIllIlIllIlIIlIl[lllllllllllllIIlIIllIlIllIlIIlII % lllllllllllllIIlIIllIlIllIlIIlIl.length]));
            "".length();
            ++lllllllllllllIIlIIllIlIllIlIIlII;
            ++lllllllllllllIIlIIllIlIllIIlllII;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllIlIllIlIIllI);
    }
    
    private static int llIlllIIlIIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIIIllllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIlllIIIlIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int llIlllIIIllIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int llIlllIIIllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static int ceiling_float_int(final float lllllllllllllIIlIIllIlllIIllllII) {
        final int lllllllllllllIIlIIllIlllIIllllIl = (int)lllllllllllllIIlIIllIlllIIllllII;
        int n;
        if (llIlllIIIlIllIl(llIlllIIIlIllII(lllllllllllllIIlIIllIlllIIllllII, (float)lllllllllllllIIlIIllIlllIIllllIl))) {
            n = lllllllllllllIIlIIllIlllIIllllIl + MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (((0x2A ^ 0x4A) & ~(0xFA ^ 0x9A)) > "  ".length()) {
                return (0x20 ^ 0x69) & ~(0xEE ^ 0xA7);
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIllllIl;
        }
        return n;
    }
    
    public static UUID getRandomUuid(final Random lllllllllllllIIlIIllIllIIlIIIIIl) {
        final long lllllllllllllIIlIIllIllIIlIIIIII = (lllllllllllllIIlIIllIllIIlIIIIIl.nextLong() & 0xFFFFFFFFFFFF0FFFL) | 0x4000L;
        final long lllllllllllllIIlIIllIllIIIllllll = (lllllllllllllIIlIIllIllIIlIIIIIl.nextLong() & 0x3FFFFFFFFFFFFFFFL) | Long.MIN_VALUE;
        return new UUID(lllllllllllllIIlIIllIllIIlIIIIII, lllllllllllllIIlIIllIllIIIllllll);
    }
    
    public static double getRandomDoubleInRange(final Random lllllllllllllIIlIIllIllIlllIllll, final double lllllllllllllIIlIIllIllIlllIlllI, final double lllllllllllllIIlIIllIllIlllIllIl) {
        double n;
        if (llIlllIIIlIlIlI(llIlllIIIlllIlI(lllllllllllllIIlIIllIllIlllIlllI, lllllllllllllIIlIIllIllIlllIllIl))) {
            n = lllllllllllllIIlIIllIllIlllIlllI;
            "".length();
            if (null != null) {
                return 0.0;
            }
        }
        else {
            n = lllllllllllllIIlIIllIllIlllIllll.nextDouble() * (lllllllllllllIIlIIllIllIlllIllIl - lllllllllllllIIlIIllIllIlllIlllI) + lllllllllllllIIlIIllIllIlllIlllI;
        }
        return n;
    }
    
    public static int func_180183_b(final float lllllllllllllIIlIIllIllIlIIIIllI, final float lllllllllllllIIlIIllIllIlIIIIlIl, final float lllllllllllllIIlIIllIllIlIIIIlII) {
        return func_180181_b(floor_float(lllllllllllllIIlIIllIllIlIIIIllI * 255.0f), floor_float(lllllllllllllIIlIIllIllIlIIIIlIl * 255.0f), floor_float(lllllllllllllIIlIIllIllIlIIIIlII * 255.0f));
    }
    
    public static int floor_float(final float lllllllllllllIIlIIllIlllIlIllIlI) {
        final int lllllllllllllIIlIIllIlllIlIllIll = (int)lllllllllllllIIlIIllIlllIlIllIlI;
        int n;
        if (llIlllIIIlIIllI(llIlllIIIlIIlIl(lllllllllllllIIlIIllIlllIlIllIlI, (float)lllllllllllllIIlIIllIlllIlIllIll))) {
            n = lllllllllllllIIlIIllIlllIlIllIll - MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (" ".length() >= (0xAF ^ 0xAB)) {
                return (0x7E ^ 0x61) & ~(0x3B ^ 0x24);
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIlIllIll;
        }
        return n;
    }
    
    private static int llIlllIIIlIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlllIIIlIllIl(final int lllllllllllllIIlIIllIlIllIIIIlIl) {
        return lllllllllllllIIlIIllIlIllIIIIlIl > 0;
    }
    
    private static int llIlllIIIlIlllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIIIlIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static int floor_double(final double lllllllllllllIIlIIllIlllIlIlIIIl) {
        final int lllllllllllllIIlIIllIlllIlIlIIlI = (int)lllllllllllllIIlIIllIlllIlIlIIIl;
        int n;
        if (llIlllIIIlIIllI(llIlllIIIlIIlll(lllllllllllllIIlIIllIlllIlIlIIIl, lllllllllllllIIlIIllIlllIlIlIIlI))) {
            n = lllllllllllllIIlIIllIlllIlIlIIlI - MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (-"   ".length() >= 0) {
                return (0x4C ^ 0x13 ^ (0x96 ^ 0x8C)) & (0xE1 ^ 0xC3 ^ (0x1E ^ 0x79) ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIlIlIIlI;
        }
        return n;
    }
    
    public static double func_181161_i(double lllllllllllllIIlIIllIlIllllllllI) {
        final double lllllllllllllIIlIIllIllIIIIIIIII = 0.5 * lllllllllllllIIlIIllIlIllllllllI;
        long lllllllllllllIIlIIllIlIlllllllll = Double.doubleToRawLongBits(lllllllllllllIIlIIllIlIllllllllI);
        lllllllllllllIIlIIllIlIlllllllll = 6910469410427058090L - (lllllllllllllIIlIIllIlIlllllllll >> MathHelper.lIIlllIlllIIll[3]);
        lllllllllllllIIlIIllIlIllllllllI = Double.longBitsToDouble(lllllllllllllIIlIIllIlIlllllllll);
        lllllllllllllIIlIIllIlIllllllllI *= 1.5 - lllllllllllllIIlIIllIllIIIIIIIII * lllllllllllllIIlIIllIlIllllllllI * lllllllllllllIIlIIllIlIllllllllI;
        return lllllllllllllIIlIIllIlIllllllllI;
    }
    
    public static int abs_int(final int lllllllllllllIIlIIllIlllIlIIIIIl) {
        int n;
        if (llIlllIIIlIlIlI(lllllllllllllIIlIIllIlllIlIIIIIl)) {
            n = lllllllllllllIIlIIllIlllIlIIIIIl;
            "".length();
            if (null != null) {
                return (0x51 ^ 0x6A ^ (0xFC ^ 0x81)) & (0xE2 ^ 0xC2 ^ (0xDA ^ 0xBC) ^ -" ".length());
            }
        }
        else {
            n = -lllllllllllllIIlIIllIlllIlIIIIIl;
        }
        return n;
    }
    
    public static double func_181162_h(final double lllllllllllllIIlIIllIllIIlIlIlIl) {
        return lllllllllllllIIlIIllIllIIlIlIlIl - Math.floor(lllllllllllllIIlIIllIllIIlIlIlIl);
    }
    
    public static double average(final long[] lllllllllllllIIlIIllIllIlllIIIll) {
        long lllllllllllllIIlIIllIllIlllIIIlI = 0L;
        final float lllllllllllllIIlIIllIllIllIllIll = (Object)lllllllllllllIIlIIllIllIlllIIIll;
        final float lllllllllllllIIlIIllIllIllIlllII = lllllllllllllIIlIIllIllIlllIIIll.length;
        byte lllllllllllllIIlIIllIllIllIlllIl = (byte)MathHelper.lIIlllIlllIIll[1];
        "".length();
        if (null != null) {
            return 0.0;
        }
        while (!llIlllIIIlIIlII(lllllllllllllIIlIIllIllIllIlllIl, (int)lllllllllllllIIlIIllIllIllIlllII)) {
            final long lllllllllllllIIlIIllIllIlllIIIIl = lllllllllllllIIlIIllIllIllIllIll[lllllllllllllIIlIIllIllIllIlllIl];
            lllllllllllllIIlIIllIllIlllIIIlI += lllllllllllllIIlIIllIllIlllIIIIl;
            ++lllllllllllllIIlIIllIllIllIlllIl;
        }
        return lllllllllllllIIlIIllIllIlllIIIlI / (double)lllllllllllllIIlIIllIllIlllIIIll.length;
    }
    
    public static int func_154353_e(final double lllllllllllllIIlIIllIlllIlIIIlll) {
        double n;
        if (llIlllIIIlIlIlI(llIlllIIIlIlIIl(lllllllllllllIIlIIllIlllIlIIIlll, 0.0))) {
            n = lllllllllllllIIlIIllIlllIlIIIlll;
            "".length();
            if (((0xE0 ^ 0x96 ^ (0x20 ^ 0x3)) & (0x18 ^ 0x5F ^ (0xB3 ^ 0xA1) ^ -" ".length())) >= (0x42 ^ 0x2F ^ (0x45 ^ 0x2C))) {
                return (158 + 196 - 331 + 204 ^ 97 + 66 - 37 + 37) & (0x58 ^ 0x4E ^ (0x60 ^ 0x36) ^ -" ".length());
            }
        }
        else {
            n = -lllllllllllllIIlIIllIlllIlIIIlll + 1.0;
        }
        return (int)n;
    }
    
    public static long getPositionRandom(final Vec3i lllllllllllllIIlIIllIllIIlIlIIlI) {
        return getCoordinateRandom(lllllllllllllIIlIIllIllIIlIlIIlI.getX(), lllllllllllllIIlIIllIllIIlIlIIlI.getY(), lllllllllllllIIlIIllIllIIlIlIIlI.getZ());
    }
    
    private static boolean llIlllIIIlIIlII(final int lllllllllllllIIlIIllIlIllIIllIII, final int lllllllllllllIIlIIllIlIllIIlIlll) {
        return lllllllllllllIIlIIllIlIllIIllIII >= lllllllllllllIIlIIllIlIllIIlIlll;
    }
    
    public static double clamp_double(final double lllllllllllllIIlIIllIlllIIIlllII, final double lllllllllllllIIlIIllIlllIIIllIll, final double lllllllllllllIIlIIllIlllIIIlllIl) {
        double n;
        if (llIlllIIIlIIllI(llIlllIIIllIIll(lllllllllllllIIlIIllIlllIIIlllII, lllllllllllllIIlIIllIlllIIIllIll))) {
            n = lllllllllllllIIlIIllIlllIIIllIll;
            "".length();
            if ((0xB ^ 0xE) <= 0) {
                return 0.0;
            }
        }
        else if (llIlllIIIlIllIl(llIlllIIIllIlII(lllllllllllllIIlIIllIlllIIIlllII, lllllllllllllIIlIIllIlllIIIlllIl))) {
            n = lllllllllllllIIlIIllIlllIIIlllIl;
            "".length();
            if (null != null) {
                return 0.0;
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIIlllII;
        }
        return n;
    }
    
    public static double parseDoubleWithDefault(final String lllllllllllllIIlIIllIllIlIllIIII, final double lllllllllllllIIlIIllIllIlIllIIlI) {
        try {
            return Double.parseDouble(lllllllllllllIIlIIllIllIlIllIIII);
        }
        catch (Throwable lllllllllllllIIlIIllIllIlIllIIIl) {
            return lllllllllllllIIlIIllIllIlIllIIlI;
        }
    }
    
    private static boolean llIlllIIIlIlIlI(final int lllllllllllllIIlIIllIlIllIIIlIIl) {
        return lllllllllllllIIlIIllIlIllIIIlIIl >= 0;
    }
    
    public static double abs_max(double lllllllllllllIIlIIllIlllIIIIllII, double lllllllllllllIIlIIllIlllIIIIlIll) {
        if (llIlllIIIlIIllI(llIlllIIIllIlll((double)lllllllllllllIIlIIllIlllIIIIllII, 0.0))) {
            lllllllllllllIIlIIllIlllIIIIllII = -lllllllllllllIIlIIllIlllIIIIllII;
        }
        if (llIlllIIIlIIllI(llIlllIIIllIlll(lllllllllllllIIlIIllIlllIIIIlIll, 0.0))) {
            lllllllllllllIIlIIllIlllIIIIlIll = -lllllllllllllIIlIIllIlllIIIIlIll;
        }
        Serializable s;
        if (llIlllIIIlIllIl(llIlllIIIlllIII((double)lllllllllllllIIlIIllIlllIIIIllII, lllllllllllllIIlIIllIlllIIIIlIll))) {
            s = lllllllllllllIIlIIllIlllIIIIllII;
            "".length();
            if ("  ".length() < 0) {
                return 0.0;
            }
        }
        else {
            s = lllllllllllllIIlIIllIlllIIIIlIll;
        }
        return (double)s;
    }
    
    public static int parseIntWithDefaultAndMax(final String lllllllllllllIIlIIllIllIlIlllIIl, final int lllllllllllllIIlIIllIllIlIlllIll, final int lllllllllllllIIlIIllIllIlIlllIlI) {
        return Math.max(lllllllllllllIIlIIllIllIlIlllIlI, parseIntWithDefault(lllllllllllllIIlIIllIllIlIlllIIl, lllllllllllllIIlIIllIllIlIlllIll));
    }
    
    public static int getRandomIntegerInRange(final Random lllllllllllllIIlIIllIllIlllllllI, final int lllllllllllllIIlIIllIlllIIIIIIII, final int lllllllllllllIIlIIllIllIllllllII) {
        int n;
        if (llIlllIIIlIIlII(lllllllllllllIIlIIllIlllIIIIIIII, lllllllllllllIIlIIllIllIllllllII)) {
            n = lllllllllllllIIlIIllIlllIIIIIIII;
            "".length();
            if ("  ".length() <= " ".length()) {
                return (0x11 ^ 0x1B) & ~(0xB1 ^ 0xBB);
            }
        }
        else {
            n = lllllllllllllIIlIIllIllIlllllllI.nextInt(lllllllllllllIIlIIllIllIllllllII - lllllllllllllIIlIIllIlllIIIIIIII + MathHelper.lIIlllIlllIIll[3]) + lllllllllllllIIlIIllIlllIIIIIIII;
        }
        return n;
    }
    
    private static int llIlllIIIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIIIlllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static int truncateDoubleToInt(final double lllllllllllllIIlIIllIlllIlIlIllI) {
        return (int)(lllllllllllllIIlIIllIlllIlIlIllI + 1024.0) - MathHelper.lIIlllIlllIIll[36];
    }
    
    private static boolean llIlllIIIlIIllI(final int lllllllllllllIIlIIllIlIllIIIIlll) {
        return lllllllllllllIIlIIllIlIllIIIIlll < 0;
    }
    
    private static int llIlllIIIllllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static double wrapAngleTo180_double(double lllllllllllllIIlIIllIllIllIIlIIl) {
        lllllllllllllIIlIIllIllIllIIlIIl %= (String)360.0;
        if (llIlllIIIlIlIlI(llIlllIIIlllllI((double)lllllllllllllIIlIIllIllIllIIlIIl, 180.0))) {
            lllllllllllllIIlIIllIllIllIIlIIl -= (String)360.0;
        }
        if (llIlllIIIlIIllI(llIlllIIIllllll((double)lllllllllllllIIlIIllIllIllIIlIIl, -180.0))) {
            lllllllllllllIIlIIllIllIllIIlIIl += (String)360.0;
        }
        return (double)lllllllllllllIIlIIllIllIllIIlIIl;
    }
    
    public static long getCoordinateRandom(final int lllllllllllllIIlIIllIllIIlIIlIII, final int lllllllllllllIIlIIllIllIIlIIIlll, final int lllllllllllllIIlIIllIllIIlIIlIlI) {
        long lllllllllllllIIlIIllIllIIlIIlIIl = (long)(lllllllllllllIIlIIllIllIIlIIlIII * MathHelper.lIIlllIlllIIll[42]) ^ lllllllllllllIIlIIllIllIIlIIlIlI * 116129781L ^ (long)lllllllllllllIIlIIllIllIIlIIIlll;
        lllllllllllllIIlIIllIllIIlIIlIIl = lllllllllllllIIlIIllIllIIlIIlIIl * lllllllllllllIIlIIllIllIIlIIlIIl * 42317861L + lllllllllllllIIlIIllIllIIlIIlIIl * 11L;
        return lllllllllllllIIlIIllIllIIlIIlIIl;
    }
    
    public static boolean epsilonEquals(final float lllllllllllllIIlIIllIllIllIllIII, final float lllllllllllllIIlIIllIllIllIlIlIl) {
        if (llIlllIIIlIIllI(llIlllIIIlllIll(abs(lllllllllllllIIlIIllIllIllIlIlIl - lllllllllllllIIlIIllIllIllIllIII), 1.0E-5f))) {
            return MathHelper.lIIlllIlllIIll[3] != 0;
        }
        return MathHelper.lIIlllIlllIIll[1] != 0;
    }
    
    public static int clamp_int(final int lllllllllllllIIlIIllIlllIIllIIIl, final int lllllllllllllIIlIIllIlllIIlIllIl, final int lllllllllllllIIlIIllIlllIIlIllll) {
        int n;
        if (llIlllIIIlIllll(lllllllllllllIIlIIllIlllIIllIIIl, lllllllllllllIIlIIllIlllIIlIllIl)) {
            n = lllllllllllllIIlIIllIlllIIlIllIl;
            "".length();
            if (" ".length() <= 0) {
                return (0x3B ^ 0x68) & ~(0xF5 ^ 0xA6);
            }
        }
        else if (llIlllIIIllIIII(lllllllllllllIIlIIllIlllIIllIIIl, lllllllllllllIIlIIllIlllIIlIllll)) {
            n = lllllllllllllIIlIIllIlllIIlIllll;
            "".length();
            if (null != null) {
                return (100 + 84 - 89 + 42 ^ 123 + 66 - 56 + 45) & (43 + 6 + 102 + 12 ^ 119 + 18 + 8 + 7 ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIllIIIl;
        }
        return n;
    }
    
    public static double denormalizeClamp(final double lllllllllllllIIlIIllIlllIIIlIllI, final double lllllllllllllIIlIIllIlllIIIlIIlI, final double lllllllllllllIIlIIllIlllIIIlIlII) {
        double n;
        if (llIlllIIIlIIllI(llIlllIIIllIlIl(lllllllllllllIIlIIllIlllIIIlIlII, 0.0))) {
            n = lllllllllllllIIlIIllIlllIIIlIllI;
            "".length();
            if (((0x29 ^ 0x3 ^ (0x33 ^ 0x55)) & (23 + 42 - 50 + 124 ^ 17 + 175 - 161 + 168 ^ -" ".length())) == -" ".length()) {
                return 0.0;
            }
        }
        else if (llIlllIIIlIllIl(llIlllIIIllIllI(lllllllllllllIIlIIllIlllIIIlIlII, 1.0))) {
            n = lllllllllllllIIlIIllIlllIIIlIIlI;
            "".length();
            if (((131 + 98 - 153 + 90 ^ 125 + 28 - 7 + 31) & (0x81 ^ 0xC2 ^ (0xD1 ^ 0x85) ^ -" ".length())) > "  ".length()) {
                return 0.0;
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIIlIllI + (lllllllllllllIIlIIllIlllIIIlIIlI - lllllllllllllIIlIIllIlllIIIlIllI) * lllllllllllllIIlIIllIlllIIIlIlII;
        }
        return n;
    }
    
    private static void llIlllIIIlIIIlI() {
        (lIIlllIlllIIlI = new String[MathHelper.lIIlllIlllIIll[6]])[MathHelper.lIIlllIlllIIll[1]] = llIlllIIIlIIIII("IjksJjEZPy8kZQYzLzdlBiQuLSJRISkmK1E1Li0zFCQ1KisWdicxKhx2CRATUSIuYxc2FG9jDB8mNDdlBjcyYw==", "qVACE");
        MathHelper.lIIlllIlllIIlI[MathHelper.lIIlllIlllIIll[3]] = llIlllIIIlIIIIl("K55XAyU2Ces=", "krmte");
        MathHelper.lIIlllIlllIIlI[MathHelper.lIIlllIlllIIll[4]] = llIlllIIIlIIIIl("8dQGAL/M9vw=", "KClaB");
    }
    
    private static int llIlllIIIllIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static int func_180188_d(final int lllllllllllllIIlIIllIllIIllIIIIl, final int lllllllllllllIIlIIllIllIIllIlIll) {
        final int lllllllllllllIIlIIllIllIIllIlIlI = (lllllllllllllIIlIIllIllIIllIIIIl & MathHelper.lIIlllIlllIIll[38]) >> MathHelper.lIIlllIlllIIll[26];
        final int lllllllllllllIIlIIllIllIIllIlIIl = (lllllllllllllIIlIIllIllIIllIlIll & MathHelper.lIIlllIlllIIll[38]) >> MathHelper.lIIlllIlllIIll[26];
        final int lllllllllllllIIlIIllIllIIllIlIII = (lllllllllllllIIlIIllIllIIllIIIIl & MathHelper.lIIlllIlllIIll[39]) >> MathHelper.lIIlllIlllIIll[14];
        final int lllllllllllllIIlIIllIllIIllIIlll = (lllllllllllllIIlIIllIllIIllIlIll & MathHelper.lIIlllIlllIIll[39]) >> MathHelper.lIIlllIlllIIll[14];
        final int lllllllllllllIIlIIllIllIIllIIllI = (lllllllllllllIIlIIllIllIIllIIIIl & MathHelper.lIIlllIlllIIll[40]) >> MathHelper.lIIlllIlllIIll[1];
        final int lllllllllllllIIlIIllIllIIllIIlIl = (lllllllllllllIIlIIllIllIIllIlIll & MathHelper.lIIlllIlllIIll[40]) >> MathHelper.lIIlllIlllIIll[1];
        final int lllllllllllllIIlIIllIllIIllIIlII = (int)(lllllllllllllIIlIIllIllIIllIlIlI * (float)lllllllllllllIIlIIllIllIIllIlIIl / 255.0f);
        final int lllllllllllllIIlIIllIllIIllIIIll = (int)(lllllllllllllIIlIIllIllIIllIlIII * (float)lllllllllllllIIlIIllIllIIllIIlll / 255.0f);
        final int lllllllllllllIIlIIllIllIIllIIIlI = (int)(lllllllllllllIIlIIllIllIIllIIllI * (float)lllllllllllllIIlIIllIllIIllIIlIl / 255.0f);
        return (lllllllllllllIIlIIllIllIIllIIIIl & MathHelper.lIIlllIlllIIll[41]) | lllllllllllllIIlIIllIllIIllIIlII << MathHelper.lIIlllIlllIIll[26] | lllllllllllllIIlIIllIllIIllIIIll << MathHelper.lIIlllIlllIIll[14] | lllllllllllllIIlIIllIllIIllIIIlI;
    }
    
    private static int calculateLogBaseTwoDeBruijn(int lllllllllllllIIlIIllIllIlIIllIlI) {
        int roundUpToPowerOfTwo;
        if (llIlllIIlIIIIII(isPowerOfTwo(lllllllllllllIIlIIllIllIlIIllIlI) ? 1 : 0)) {
            roundUpToPowerOfTwo = lllllllllllllIIlIIllIllIlIIllIlI;
            "".length();
            if ((111 + 100 - 84 + 7 ^ 32 + 104 - 27 + 22) == 0x0) {
                return "  ".length() & ("  ".length() ^ -" ".length());
            }
        }
        else {
            roundUpToPowerOfTwo = roundUpToPowerOfTwo(lllllllllllllIIlIIllIllIlIIllIlI);
        }
        lllllllllllllIIlIIllIllIlIIllIlI = roundUpToPowerOfTwo;
        return MathHelper.multiplyDeBruijnBitPosition[(int)(lllllllllllllIIlIIllIllIlIIllIlI * 125613361L >> MathHelper.lIIlllIlllIIll[28]) & MathHelper.lIIlllIlllIIll[27]];
    }
    
    static {
        llIlllIIIlIIIll();
        llIlllIIIlIIIlI();
        SQRT_2 = sqrt_float(2.0f);
        SIN_TABLE = new float[MathHelper.lIIlllIlllIIll[0]];
        int lllllllllllllIIlIIllIlllIlllIlII = MathHelper.lIIlllIlllIIll[1];
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!llIlllIIIlIIlII(lllllllllllllIIlIIllIlllIlllIlII, MathHelper.lIIlllIlllIIll[0])) {
            MathHelper.SIN_TABLE[lllllllllllllIIlIIllIlllIlllIlII] = (float)Math.sin(lllllllllllllIIlIIllIlllIlllIlII * 3.141592653589793 * 2.0 / 65536.0);
            ++lllllllllllllIIlIIllIlllIlllIlII;
        }
        final int[] multiplyDeBruijnBitPosition2 = new int[MathHelper.lIIlllIlllIIll[2]];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[3]] = MathHelper.lIIlllIlllIIll[3];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[4]] = MathHelper.lIIlllIlllIIll[5];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[6]] = MathHelper.lIIlllIlllIIll[4];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[7]] = MathHelper.lIIlllIlllIIll[8];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[9]] = MathHelper.lIIlllIlllIIll[10];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[11]] = MathHelper.lIIlllIlllIIll[12];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[13]] = MathHelper.lIIlllIlllIIll[6];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[14]] = MathHelper.lIIlllIlllIIll[15];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[16]] = MathHelper.lIIlllIlllIIll[17];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[18]] = MathHelper.lIIlllIlllIIll[19];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[20]] = MathHelper.lIIlllIlllIIll[21];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[22]] = MathHelper.lIIlllIlllIIll[23];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[24]] = MathHelper.lIIlllIlllIIll[25];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[10]] = MathHelper.lIIlllIlllIIll[7];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[21]] = MathHelper.lIIlllIlllIIll[14];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[26]] = MathHelper.lIIlllIlllIIll[27];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[25]] = MathHelper.lIIlllIlllIIll[28];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[29]] = MathHelper.lIIlllIlllIIll[24];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[30]] = MathHelper.lIIlllIlllIIll[31];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[19]] = MathHelper.lIIlllIlllIIll[32];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[32]] = MathHelper.lIIlllIlllIIll[30];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[17]] = MathHelper.lIIlllIlllIIll[26];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[31]] = MathHelper.lIIlllIlllIIll[13];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[12]] = MathHelper.lIIlllIlllIIll[33];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[23]] = MathHelper.lIIlllIlllIIll[22];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[33]] = MathHelper.lIIlllIlllIIll[29];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[28]] = MathHelper.lIIlllIlllIIll[11];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[5]] = MathHelper.lIIlllIlllIIll[20];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[8]] = MathHelper.lIIlllIlllIIll[9];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[15]] = MathHelper.lIIlllIlllIIll[18];
        multiplyDeBruijnBitPosition2[MathHelper.lIIlllIlllIIll[27]] = MathHelper.lIIlllIlllIIll[16];
        multiplyDeBruijnBitPosition = multiplyDeBruijnBitPosition2;
        field_181163_d = Double.longBitsToDouble(4805340802404319232L);
        field_181164_e = new double[MathHelper.lIIlllIlllIIll[34]];
        field_181165_f = new double[MathHelper.lIIlllIlllIIll[34]];
        int lllllllllllllIIlIIllIlllIlllIIll = MathHelper.lIIlllIlllIIll[1];
        "".length();
        if (((0x3E ^ 0x10) & ~(0x87 ^ 0xA9)) != 0x0) {
            return;
        }
        while (!llIlllIIIlIIlII(lllllllllllllIIlIIllIlllIlllIIll, MathHelper.lIIlllIlllIIll[34])) {
            final double lllllllllllllIIlIIllIlllIlllIIlI = lllllllllllllIIlIIllIlllIlllIIll / 256.0;
            final double lllllllllllllIIlIIllIlllIlllIIIl = Math.asin(lllllllllllllIIlIIllIlllIlllIIlI);
            MathHelper.field_181165_f[lllllllllllllIIlIIllIlllIlllIIll] = Math.cos(lllllllllllllIIlIIllIlllIlllIIIl);
            MathHelper.field_181164_e[lllllllllllllIIlIIllIlllIlllIIll] = lllllllllllllIIlIIllIlllIlllIIIl;
            ++lllllllllllllIIlIIllIlllIlllIIll;
        }
    }
    
    private static int llIlllIIIllIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void llIlllIIIlIIIll() {
        (lIIlllIlllIIll = new int[43])[0] = (0xFFFFF1F2 & 0x10E0D);
        MathHelper.lIIlllIlllIIll[1] = ((0x47 ^ 0x5D ^ (0x7D ^ 0x2F)) & (163 + 189 - 213 + 63 ^ 120 + 56 - 120 + 74 ^ -" ".length()));
        MathHelper.lIIlllIlllIIll[2] = (0x8D ^ 0x86 ^ (0x19 ^ 0x32));
        MathHelper.lIIlllIlllIIll[3] = " ".length();
        MathHelper.lIIlllIlllIIll[4] = "  ".length();
        MathHelper.lIIlllIlllIIll[5] = (0x2E ^ 0x5E ^ (0x7B ^ 0x17));
        MathHelper.lIIlllIlllIIll[6] = "   ".length();
        MathHelper.lIIlllIlllIIll[7] = (0x3 ^ 0x7);
        MathHelper.lIIlllIlllIIll[8] = (0x58 ^ 0x37 ^ (0x41 ^ 0x33));
        MathHelper.lIIlllIlllIIll[9] = (0x65 ^ 0x60);
        MathHelper.lIIlllIlllIIll[10] = (0x94 ^ 0x9A);
        MathHelper.lIIlllIlllIIll[11] = (0x32 ^ 0x34);
        MathHelper.lIIlllIlllIIll[12] = (0x36 ^ 0x4F ^ (0xE6 ^ 0x87));
        MathHelper.lIIlllIlllIIll[13] = (125 + 86 - 166 + 88 ^ 16 + 12 + 54 + 48);
        MathHelper.lIIlllIlllIIll[14] = (0x2C ^ 0x24);
        MathHelper.lIIlllIlllIIll[15] = (0x3C ^ 0x1 ^ (0x44 ^ 0x67));
        MathHelper.lIIlllIlllIIll[16] = (0x1A ^ 0x13);
        MathHelper.lIIlllIlllIIll[17] = (0x63 ^ 0x75);
        MathHelper.lIIlllIlllIIll[18] = (0xBB ^ 0xB1);
        MathHelper.lIIlllIlllIIll[19] = (0x4E ^ 0x5A);
        MathHelper.lIIlllIlllIIll[20] = (0x8 ^ 0x3);
        MathHelper.lIIlllIlllIIll[21] = (0x71 ^ 0x7A ^ (0xA1 ^ 0xA5));
        MathHelper.lIIlllIlllIIll[22] = (0x6 ^ 0x2E ^ (0x9A ^ 0xBE));
        MathHelper.lIIlllIlllIIll[23] = (0x11 ^ 0x62 ^ (0x50 ^ 0x3A));
        MathHelper.lIIlllIlllIIll[24] = (0x61 ^ 0x6C);
        MathHelper.lIIlllIlllIIll[25] = (((0x13 ^ 0x2) & ~(0x8F ^ 0x9E)) ^ (0xAA ^ 0xBB));
        MathHelper.lIIlllIlllIIll[26] = (0xAF ^ 0xBE ^ " ".length());
        MathHelper.lIIlllIlllIIll[27] = (139 + 106 - 199 + 120 ^ 92 + 76 - 3 + 20);
        MathHelper.lIIlllIlllIIll[28] = (68 + 99 - 107 + 75 ^ 63 + 134 - 109 + 68);
        MathHelper.lIIlllIlllIIll[29] = (0x13 ^ 0x4B ^ (0x6D ^ 0x27));
        MathHelper.lIIlllIlllIIll[30] = (0x44 ^ 0x57);
        MathHelper.lIIlllIlllIIll[31] = (0xCA ^ 0x8D ^ (0x43 ^ 0x13));
        MathHelper.lIIlllIlllIIll[32] = (0x24 ^ 0x39 ^ (0x38 ^ 0x30));
        MathHelper.lIIlllIlllIIll[33] = (0x8E ^ 0x94);
        MathHelper.lIIlllIlllIIll[34] = (-(0xFFFF9EF5 & 0x7BFF) & (0xFFFFDFF5 & 0x3BFF));
        MathHelper.lIIlllIlllIIll[35] = (-" ".length() & (-1 & 0xFFFF));
        MathHelper.lIIlllIlllIIll[36] = (-(0xFFFF9EFF & 0x69F7) & (0xFFFFAFFF & 0x5CF6));
        MathHelper.lIIlllIlllIIll[37] = -" ".length();
        MathHelper.lIIlllIlllIIll[38] = (-(0xFFFFDF6B & 0x3795) & (0xFFFFD73E & 0xFF3FC1));
        MathHelper.lIIlllIlllIIll[39] = (-(0xCC ^ 0x9A) & (0xFFFFFFDD & 0xFF77));
        MathHelper.lIIlllIlllIIll[40] = (0x74 ^ 0x4F) + (12 + 137 - 129 + 186) - (95 + 163 - 172 + 130) + (63 + 136 - 78 + 85);
        MathHelper.lIIlllIlllIIll[41] = -(0xFFFFE388 & 0x1001C77);
        MathHelper.lIIlllIlllIIll[42] = (0xFFFFCBFF & 0x2FF60F);
    }
    
    public static float cos(final float lllllllllllllIIlIIllIlllIllIIlIl) {
        return MathHelper.SIN_TABLE[(int)(lllllllllllllIIlIIllIlllIllIIlIl * 10430.378f + 16384.0f) & MathHelper.lIIlllIlllIIll[35]];
    }
    
    public static double func_181160_c(final double lllllllllllllIIlIIllIllIIIllIlIl, final double lllllllllllllIIlIIllIllIIIllIlII, final double lllllllllllllIIlIIllIllIIIllIIll) {
        return (lllllllllllllIIlIIllIllIIIllIlIl - lllllllllllllIIlIIllIllIIIllIlII) / (lllllllllllllIIlIIllIllIIIllIIll - lllllllllllllIIlIIllIllIIIllIlII);
    }
    
    private static int llIlllIIIllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static int parseIntWithDefault(final String lllllllllllllIIlIIllIllIllIIIIlI, final int lllllllllllllIIlIIllIllIllIIIlII) {
        try {
            return Integer.parseInt(lllllllllllllIIlIIllIllIllIIIIlI);
        }
        catch (Throwable lllllllllllllIIlIIllIllIllIIIIll) {
            return lllllllllllllIIlIIllIllIllIIIlII;
        }
    }
    
    private static boolean llIlllIIlIIIIIl(final int lllllllllllllIIlIIllIlIllIIIlIll) {
        return lllllllllllllIIlIIllIlIllIIIlIll == 0;
    }
    
    public static int func_180181_b(final int lllllllllllllIIlIIllIllIIllllIll, final int lllllllllllllIIlIIllIllIIllllIlI, final int lllllllllllllIIlIIllIllIIlllllIl) {
        int lllllllllllllIIlIIllIllIIlllllII = (lllllllllllllIIlIIllIllIIllllIll << MathHelper.lIIlllIlllIIll[14]) + lllllllllllllIIlIIllIllIIllllIlI;
        lllllllllllllIIlIIllIllIIlllllII = (lllllllllllllIIlIIllIllIIlllllII << MathHelper.lIIlllIlllIIll[14]) + lllllllllllllIIlIIllIllIIlllllIl;
        return lllllllllllllIIlIIllIllIIlllllII;
    }
    
    public static double func_181159_b(double lllllllllllllIIlIIllIllIIIIlIIll, double lllllllllllllIIlIIllIllIIIIlIIlI) {
        final double lllllllllllllIIlIIllIllIIIlIIIIl = lllllllllllllIIlIIllIllIIIIlIIlI * lllllllllllllIIlIIllIllIIIIlIIlI + lllllllllllllIIlIIllIllIIIIlIIll * lllllllllllllIIlIIllIllIIIIlIIll;
        if (llIlllIIlIIIIII(Double.isNaN(lllllllllllllIIlIIllIllIIIlIIIIl) ? 1 : 0)) {
            return Double.NaN;
        }
        int n;
        if (llIlllIIIlIIllI(llIlllIIlIIIIlI(lllllllllllllIIlIIllIllIIIIlIIll, 0.0))) {
            n = MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (" ".length() <= 0) {
                return 0.0;
            }
        }
        else {
            n = MathHelper.lIIlllIlllIIll[1];
        }
        final boolean lllllllllllllIIlIIllIllIIIlIIIII = n != 0;
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIlIIIII ? 1 : 0)) {
            lllllllllllllIIlIIllIllIIIIlIIll = -lllllllllllllIIlIIllIllIIIIlIIll;
        }
        int n2;
        if (llIlllIIIlIIllI(llIlllIIlIIIIlI(lllllllllllllIIlIIllIllIIIIlIIlI, 0.0))) {
            n2 = MathHelper.lIIlllIlllIIll[3];
            "".length();
            if ("  ".length() <= 0) {
                return 0.0;
            }
        }
        else {
            n2 = MathHelper.lIIlllIlllIIll[1];
        }
        final boolean lllllllllllllIIlIIllIllIIIIlllll = n2 != 0;
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIIlllll ? 1 : 0)) {
            lllllllllllllIIlIIllIllIIIIlIIlI = -lllllllllllllIIlIIllIllIIIIlIIlI;
        }
        int n3;
        if (llIlllIIIlIllIl(llIlllIIlIIIIll(lllllllllllllIIlIIllIllIIIIlIIll, lllllllllllllIIlIIllIllIIIIlIIlI))) {
            n3 = MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (((0x25 ^ 0x7E) & ~(0xC7 ^ 0x9C)) >= (0x42 ^ 0x46)) {
                return 0.0;
            }
        }
        else {
            n3 = MathHelper.lIIlllIlllIIll[1];
        }
        final boolean lllllllllllllIIlIIllIllIIIIllllI = n3 != 0;
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIIllllI ? 1 : 0)) {
            final double lllllllllllllIIlIIllIllIIIIlllIl = lllllllllllllIIlIIllIllIIIIlIIlI;
            lllllllllllllIIlIIllIllIIIIlIIlI = lllllllllllllIIlIIllIllIIIIlIIll;
            lllllllllllllIIlIIllIllIIIIlIIll = lllllllllllllIIlIIllIllIIIIlllIl;
        }
        final double lllllllllllllIIlIIllIllIIIIlllII = func_181161_i(lllllllllllllIIlIIllIllIIIlIIIIl);
        lllllllllllllIIlIIllIllIIIIlIIlI *= lllllllllllllIIlIIllIllIIIIlllII;
        lllllllllllllIIlIIllIllIIIIlIIll *= lllllllllllllIIlIIllIllIIIIlllII;
        final double lllllllllllllIIlIIllIllIIIIllIll = MathHelper.field_181163_d + lllllllllllllIIlIIllIllIIIIlIIll;
        final int lllllllllllllIIlIIllIllIIIIllIlI = (int)Double.doubleToRawLongBits(lllllllllllllIIlIIllIllIIIIllIll);
        final double lllllllllllllIIlIIllIllIIIIllIIl = MathHelper.field_181164_e[lllllllllllllIIlIIllIllIIIIllIlI];
        final double lllllllllllllIIlIIllIllIIIIllIII = MathHelper.field_181165_f[lllllllllllllIIlIIllIllIIIIllIlI];
        final double lllllllllllllIIlIIllIllIIIIlIlll = lllllllllllllIIlIIllIllIIIIllIll - MathHelper.field_181163_d;
        final double lllllllllllllIIlIIllIllIIIIlIllI = lllllllllllllIIlIIllIllIIIIlIIll * lllllllllllllIIlIIllIllIIIIllIII - lllllllllllllIIlIIllIllIIIIlIIlI * lllllllllllllIIlIIllIllIIIIlIlll;
        final double lllllllllllllIIlIIllIllIIIIlIlIl = (6.0 + lllllllllllllIIlIIllIllIIIIlIllI * lllllllllllllIIlIIllIllIIIIlIllI) * lllllllllllllIIlIIllIllIIIIlIllI * 0.16666666666666666;
        double lllllllllllllIIlIIllIllIIIIlIlII = lllllllllllllIIlIIllIllIIIIllIIl + lllllllllllllIIlIIllIllIIIIlIlIl;
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIIllllI ? 1 : 0)) {
            lllllllllllllIIlIIllIllIIIIlIlII = 1.5707963267948966 - lllllllllllllIIlIIllIllIIIIlIlII;
        }
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIIlllll ? 1 : 0)) {
            lllllllllllllIIlIIllIllIIIIlIlII = 3.141592653589793 - lllllllllllllIIlIIllIllIIIIlIlII;
        }
        if (llIlllIIlIIIIII(lllllllllllllIIlIIllIllIIIlIIIII ? 1 : 0)) {
            lllllllllllllIIlIIllIllIIIIlIlII = -lllllllllllllIIlIIllIllIIIIlIlII;
        }
        return lllllllllllllIIlIIllIllIIIIlIlII;
    }
    
    private static boolean llIlllIIlIIIIII(final int lllllllllllllIIlIIllIlIllIIIllIl) {
        return lllllllllllllIIlIIllIlIllIIIllIl != 0;
    }
    
    private static int llIlllIIIlllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public static float sin(final float lllllllllllllIIlIIllIlllIllIlIII) {
        return MathHelper.SIN_TABLE[(int)(lllllllllllllIIlIIllIlllIllIlIII * 10430.378f) & MathHelper.lIIlllIlllIIll[35]];
    }
    
    private static int llIlllIIIllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static int func_154354_b(final int lllllllllllllIIlIIllIllIlIIIllll, int lllllllllllllIIlIIllIllIlIIIlllI) {
        if (llIlllIIlIIIIIl((int)lllllllllllllIIlIIllIllIlIIIlllI)) {
            return MathHelper.lIIlllIlllIIll[1];
        }
        if (llIlllIIlIIIIIl(lllllllllllllIIlIIllIllIlIIIllll)) {
            return (int)lllllllllllllIIlIIllIllIlIIIlllI;
        }
        if (llIlllIIIlIIllI(lllllllllllllIIlIIllIllIlIIIllll)) {
            lllllllllllllIIlIIllIllIlIIIlllI *= MathHelper.lIIlllIlllIIll[37];
        }
        final int lllllllllllllIIlIIllIllIlIIlIIII = (int)(lllllllllllllIIlIIllIllIlIIIllll % lllllllllllllIIlIIllIllIlIIIlllI);
        double n;
        if (llIlllIIlIIIIIl(lllllllllllllIIlIIllIllIlIIlIIII)) {
            n = lllllllllllllIIlIIllIllIlIIIllll;
            "".length();
            if (((0x65 ^ 0x11 ^ (0xA3 ^ 0x9D)) & (0xB3 ^ 0xAF ^ (0x49 ^ 0x1F) ^ -" ".length())) > 0) {
                return (171 + 33 - 200 + 217 ^ 41 + 65 - 64 + 100) & (12 + 159 - 162 + 212 ^ 39 + 99 + 3 + 1 ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIIllIllIlIIIllll + lllllllllllllIIlIIllIllIlIIIlllI - lllllllllllllIIlIIllIllIlIIlIIII;
        }
        return (int)n;
    }
    
    public static int normalizeAngle(final int lllllllllllllIIlIIllIllIllIlIIlI, final int lllllllllllllIIlIIllIllIllIlIIIl) {
        return (lllllllllllllIIlIIllIllIllIlIIlI % lllllllllllllIIlIIllIllIllIlIIIl + lllllllllllllIIlIIllIllIllIlIIIl) % lllllllllllllIIlIIllIllIllIlIIIl;
    }
    
    public static float wrapAngleTo180_float(float lllllllllllllIIlIIllIllIllIIllII) {
        lllllllllllllIIlIIllIllIllIIllII %= 360.0f;
        if (llIlllIIIlIlIlI(llIlllIIIllllII(lllllllllllllIIlIIllIllIllIIllII, 180.0f))) {
            lllllllllllllIIlIIllIllIllIIllII -= 360.0f;
        }
        if (llIlllIIIlIIllI(llIlllIIIllllIl(lllllllllllllIIlIIllIllIllIIllII, -180.0f))) {
            lllllllllllllIIlIIllIllIllIIllII += 360.0f;
        }
        return lllllllllllllIIlIIllIllIllIIllII;
    }
    
    public static int bucketInt(final int lllllllllllllIIlIIllIlllIIIIIllI, final int lllllllllllllIIlIIllIlllIIIIIlll) {
        int n;
        if (llIlllIIIlIIllI(lllllllllllllIIlIIllIlllIIIIIllI)) {
            n = -((-lllllllllllllIIlIIllIlllIIIIIllI - MathHelper.lIIlllIlllIIll[3]) / lllllllllllllIIlIIllIlllIIIIIlll) - MathHelper.lIIlllIlllIIll[3];
            "".length();
            if (" ".length() <= 0) {
                return (0xF5 ^ 0xB0) & ~(0xE3 ^ 0xA6);
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIIIIllI / lllllllllllllIIlIIllIlllIIIIIlll;
        }
        return n;
    }
    
    public static float clamp_float(final float lllllllllllllIIlIIllIlllIIlIlIII, final float lllllllllllllIIlIIllIlllIIlIIlII, final float lllllllllllllIIlIIllIlllIIlIIIll) {
        float n;
        if (llIlllIIIlIIllI(llIlllIIIllIIIl(lllllllllllllIIlIIllIlllIIlIlIII, lllllllllllllIIlIIllIlllIIlIIlII))) {
            n = lllllllllllllIIlIIllIlllIIlIIlII;
            "".length();
            if (" ".length() == "  ".length()) {
                return 0.0f;
            }
        }
        else if (llIlllIIIlIllIl(llIlllIIIllIIlI(lllllllllllllIIlIIllIlllIIlIlIII, lllllllllllllIIlIIllIlllIIlIIIll))) {
            n = lllllllllllllIIlIIllIlllIIlIIIll;
            "".length();
            if ("  ".length() != "  ".length()) {
                return 0.0f;
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIlIlIII;
        }
        return n;
    }
    
    public static int calculateLogBaseTwo(final int lllllllllllllIIlIIllIllIlIIlIllI) {
        final int calculateLogBaseTwoDeBruijn = calculateLogBaseTwoDeBruijn(lllllllllllllIIlIIllIllIlIIlIllI);
        int n;
        if (llIlllIIlIIIIII(isPowerOfTwo(lllllllllllllIIlIIllIllIlIIlIllI) ? 1 : 0)) {
            n = MathHelper.lIIlllIlllIIll[1];
            "".length();
            if (" ".length() <= ((0x3D ^ 0x2) & ~(0x26 ^ 0x19))) {
                return (0x33 ^ 0x23) & ~(0x46 ^ 0x56);
            }
        }
        else {
            n = MathHelper.lIIlllIlllIIll[3];
        }
        return calculateLogBaseTwoDeBruijn - n;
    }
    
    public static int roundUpToPowerOfTwo(final int lllllllllllllIIlIIllIllIlIlIIIlI) {
        int lllllllllllllIIlIIllIllIlIlIIIIl = lllllllllllllIIlIIllIllIlIlIIIlI - MathHelper.lIIlllIlllIIll[3];
        lllllllllllllIIlIIllIllIlIlIIIIl |= lllllllllllllIIlIIllIllIlIlIIIIl >> MathHelper.lIIlllIlllIIll[3];
        lllllllllllllIIlIIllIllIlIlIIIIl |= lllllllllllllIIlIIllIllIlIlIIIIl >> MathHelper.lIIlllIlllIIll[4];
        lllllllllllllIIlIIllIllIlIlIIIIl |= lllllllllllllIIlIIllIllIlIlIIIIl >> MathHelper.lIIlllIlllIIll[7];
        lllllllllllllIIlIIllIllIlIlIIIIl |= lllllllllllllIIlIIllIllIlIlIIIIl >> MathHelper.lIIlllIlllIIll[14];
        lllllllllllllIIlIIllIllIlIlIIIIl |= lllllllllllllIIlIIllIllIlIlIIIIl >> MathHelper.lIIlllIlllIIll[26];
        return lllllllllllllIIlIIllIllIlIlIIIIl + MathHelper.lIIlllIlllIIll[3];
    }
    
    public static float sqrt_float(final float lllllllllllllIIlIIllIlllIllIIIlI) {
        return (float)Math.sqrt(lllllllllllllIIlIIllIlllIllIIIlI);
    }
    
    public static double parseDoubleWithDefaultAndMax(final String lllllllllllllIIlIIllIllIlIlIIlll, final double lllllllllllllIIlIIllIllIlIlIlIIl, final double lllllllllllllIIlIIllIllIlIlIIlIl) {
        return Math.max(lllllllllllllIIlIIllIllIlIlIIlIl, parseDoubleWithDefault(lllllllllllllIIlIIllIllIlIlIIlll, lllllllllllllIIlIIllIllIlIlIlIIl));
    }
    
    private static boolean llIlllIIIlIllll(final int lllllllllllllIIlIIllIlIllIIlIlII, final int lllllllllllllIIlIIllIlIllIIlIIll) {
        return lllllllllllllIIlIIllIlIllIIlIlII < lllllllllllllIIlIIllIlIllIIlIIll;
    }
    
    public static int ceiling_double_int(final double lllllllllllllIIlIIllIlllIIlllIII) {
        final int lllllllllllllIIlIIllIlllIIllIlll = (int)lllllllllllllIIlIIllIlllIIlllIII;
        int n;
        if (llIlllIIIlIllIl(llIlllIIIlIlllI(lllllllllllllIIlIIllIlllIIlllIII, lllllllllllllIIlIIllIlllIIllIlll))) {
            n = lllllllllllllIIlIIllIlllIIllIlll + MathHelper.lIIlllIlllIIll[3];
            "".length();
            if ("   ".length() > (27 + 118 - 45 + 40 ^ 90 + 1 + 40 + 5)) {
                return (2 + 43 + 85 + 69 ^ 137 + 63 - 91 + 58) & (141 + 83 - 167 + 165 ^ 149 + 39 - 82 + 84 ^ -" ".length());
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIIllIlll;
        }
        return n;
    }
    
    public static long floor_double_long(final double lllllllllllllIIlIIllIlllIlIIlIll) {
        final long lllllllllllllIIlIIllIlllIlIIllII = (long)lllllllllllllIIlIIllIlllIlIIlIll;
        long n;
        if (llIlllIIIlIIllI(llIlllIIIlIlIII(lllllllllllllIIlIIllIlllIlIIlIll, (double)lllllllllllllIIlIIllIlllIlIIllII))) {
            n = lllllllllllllIIlIIllIlllIlIIllII - 1L;
            "".length();
            if ("  ".length() <= 0) {
                return 0L;
            }
        }
        else {
            n = lllllllllllllIIlIIllIlllIlIIllII;
        }
        return n;
    }
    
    private static int llIlllIIIlIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String llIlllIIIlIIIIl(final String lllllllllllllIIlIIllIlIllIllIllI, final String lllllllllllllIIlIIllIlIllIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIlIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIlIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllIlIllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllIlIllIlllIlI.init(MathHelper.lIIlllIlllIIll[4], lllllllllllllIIlIIllIlIllIlllIll);
            return new String(lllllllllllllIIlIIllIlIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIlIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIlIllIlllIIl) {
            lllllllllllllIIlIIllIlIllIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static int llIlllIIIlllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIIlIIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIIIllIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIIIlIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIlllIIIlllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIIIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlllIIIllIIII(final int lllllllllllllIIlIIllIlIllIIlIIII, final int lllllllllllllIIlIIllIlIllIIIllll) {
        return lllllllllllllIIlIIllIlIllIIlIIII > lllllllllllllIIlIIllIlIllIIIllll;
    }
}
