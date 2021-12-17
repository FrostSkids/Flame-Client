// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import net.minecraft.util.MathHelper;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PathPoint
{
    public final /* synthetic */ int xCoord;
    /* synthetic */ int index;
    private static final /* synthetic */ String[] lIIIIIIlIllllI;
    private static final /* synthetic */ int[] lIIIIIIlIlllll;
    public final /* synthetic */ int zCoord;
    public final /* synthetic */ int yCoord;
    private final /* synthetic */ int hash;
    
    public boolean isAssigned() {
        if (lIllIlIIIllIlll(this.index)) {
            return PathPoint.lIIIIIIlIlllll[7] != 0;
        }
        return PathPoint.lIIIIIIlIlllll[5] != 0;
    }
    
    private static void lIllIlIIIllIIlI() {
        (lIIIIIIlIllllI = new String[PathPoint.lIIIIIIlIlllll[8]])[PathPoint.lIIIIIIlIlllll[5]] = lIllIlIIIllIIII("en8gg78Uqd0=", "Wlgdx");
        PathPoint.lIIIIIIlIllllI[PathPoint.lIIIIIIlIlllll[7]] = lIllIlIIIllIIIl("eEE=", "TaaAn");
    }
    
    private static void lIllIlIIIllIIll() {
        (lIIIIIIlIlllll = new int[9])[0] = -" ".length();
        PathPoint.lIIIIIIlIlllll[1] = 220 + 25 - 236 + 246;
        PathPoint.lIIIIIIlIlllll[2] = (-1 & 0x7FFF);
        PathPoint.lIIIIIIlIlllll[3] = (18 + 78 + 3 + 33 ^ 79 + 7 + 44 + 10);
        PathPoint.lIIIIIIlIlllll[4] = (0x86 ^ 0xAF ^ (0x9B ^ 0xAA));
        PathPoint.lIIIIIIlIlllll[5] = ((0x4B ^ 0x42) & ~(0x81 ^ 0x88));
        PathPoint.lIIIIIIlIlllll[6] = (0xFFFFD1E9 & 0xAE16);
        PathPoint.lIIIIIIlIlllll[7] = " ".length();
        PathPoint.lIIIIIIlIlllll[8] = "  ".length();
    }
    
    @Override
    public int hashCode() {
        return this.hash;
    }
    
    public static int makeHash(final int lllllllllllllIlIlIIIIlIIIlIIIlll, final int lllllllllllllIlIlIIIIlIIIlIIIllI, final int lllllllllllllIlIlIIIIlIIIlIIIIlI) {
        final int n = (lllllllllllllIlIlIIIIlIIIlIIIllI & PathPoint.lIIIIIIlIlllll[1]) | (lllllllllllllIlIlIIIIlIIIlIIIlll & PathPoint.lIIIIIIlIlllll[2]) << PathPoint.lIIIIIIlIlllll[3] | (lllllllllllllIlIlIIIIlIIIlIIIIlI & PathPoint.lIIIIIIlIlllll[2]) << PathPoint.lIIIIIIlIlllll[4];
        int n2;
        if (lIllIlIIIllIlII(lllllllllllllIlIlIIIIlIIIlIIIlll)) {
            n2 = Integer.MIN_VALUE;
            "".length();
            if ("  ".length() <= " ".length()) {
                return (0xAB ^ 0xB1) & ~(0x1D ^ 0x7);
            }
        }
        else {
            n2 = PathPoint.lIIIIIIlIlllll[5];
        }
        final int n3 = n | n2;
        int n4;
        if (lIllIlIIIllIlII(lllllllllllllIlIlIIIIlIIIlIIIIlI)) {
            n4 = PathPoint.lIIIIIIlIlllll[6];
            "".length();
            if (((0xEB ^ 0xB2 ^ (0x31 ^ 0x78)) & (0xCB ^ 0x84 ^ (0xED ^ 0xB2) ^ -" ".length())) != ((0xD2 ^ 0x8D ^ (0x37 ^ 0x75)) & (70 + 51 - 76 + 84 ^ 30 + 109 - 119 + 136 ^ -" ".length()))) {
                return (123 + 19 - 40 + 42 ^ 133 + 53 - 106 + 57) & (55 + 0 + 125 + 7 ^ 145 + 7 - 28 + 38 ^ -" ".length());
            }
        }
        else {
            n4 = PathPoint.lIIIIIIlIlllll[5];
        }
        return n3 | n4;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(this.xCoord)).append(PathPoint.lIIIIIIlIllllI[PathPoint.lIIIIIIlIlllll[5]]).append(this.yCoord).append(PathPoint.lIIIIIIlIllllI[PathPoint.lIIIIIIlIlllll[7]]).append(this.zCoord));
    }
    
    public float distanceToSquared(final PathPoint lllllllllllllIlIlIIIIlIIIIlIIlll) {
        final float lllllllllllllIlIlIIIIlIIIIlIlIll = (float)(lllllllllllllIlIlIIIIlIIIIlIIlll.xCoord - this.xCoord);
        final float lllllllllllllIlIlIIIIlIIIIlIlIlI = (float)(lllllllllllllIlIlIIIIlIIIIlIIlll.yCoord - this.yCoord);
        final float lllllllllllllIlIlIIIIlIIIIlIlIIl = (float)(lllllllllllllIlIlIIIIlIIIIlIIlll.zCoord - this.zCoord);
        return lllllllllllllIlIlIIIIlIIIIlIlIll * lllllllllllllIlIlIIIIlIIIIlIlIll + lllllllllllllIlIlIIIIlIIIIlIlIlI * lllllllllllllIlIlIIIIlIIIIlIlIlI + lllllllllllllIlIlIIIIlIIIIlIlIIl * lllllllllllllIlIlIIIIlIIIIlIlIIl;
    }
    
    static {
        lIllIlIIIllIIll();
        lIllIlIIIllIIlI();
    }
    
    private static String lIllIlIIIllIIIl(String lllllllllllllIlIlIIIIIllllllIlIl, final String lllllllllllllIlIlIIIIIlllllllIIl) {
        lllllllllllllIlIlIIIIIllllllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIIIllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIIlllllllIII = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIIllllllIlll = lllllllllllllIlIlIIIIIlllllllIIl.toCharArray();
        int lllllllllllllIlIlIIIIIllllllIllI = PathPoint.lIIIIIIlIlllll[5];
        final byte lllllllllllllIlIlIIIIIllllllIIII = (Object)lllllllllllllIlIlIIIIIllllllIlIl.toCharArray();
        final int lllllllllllllIlIlIIIIIlllllIllll = lllllllllllllIlIlIIIIIllllllIIII.length;
        long lllllllllllllIlIlIIIIIlllllIlllI = PathPoint.lIIIIIIlIlllll[5];
        while (lIllIlIIIlllIII((int)lllllllllllllIlIlIIIIIlllllIlllI, lllllllllllllIlIlIIIIIlllllIllll)) {
            final char lllllllllllllIlIlIIIIIlllllllIll = lllllllllllllIlIlIIIIIllllllIIII[lllllllllllllIlIlIIIIIlllllIlllI];
            lllllllllllllIlIlIIIIIlllllllIII.append((char)(lllllllllllllIlIlIIIIIlllllllIll ^ lllllllllllllIlIlIIIIIllllllIlll[lllllllllllllIlIlIIIIIllllllIllI % lllllllllllllIlIlIIIIIllllllIlll.length]));
            "".length();
            ++lllllllllllllIlIlIIIIIllllllIllI;
            ++lllllllllllllIlIlIIIIIlllllIlllI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIIlllllllIII);
    }
    
    private static boolean lIllIlIIIllIlIl(final int lllllllllllllIlIlIIIIIlllllIIIll) {
        return lllllllllllllIlIlIIIIIlllllIIIll == 0;
    }
    
    private static boolean lIllIlIIIllIllI(final int lllllllllllllIlIlIIIIIlllllIlIlI, final int lllllllllllllIlIlIIIIIlllllIlIIl) {
        return lllllllllllllIlIlIIIIIlllllIlIlI == lllllllllllllIlIlIIIIIlllllIlIIl;
    }
    
    public PathPoint(final int lllllllllllllIlIlIIIIlIIIlIIllIl, final int lllllllllllllIlIlIIIIlIIIlIIllII, final int lllllllllllllIlIlIIIIlIIIlIIlIll) {
        this.index = PathPoint.lIIIIIIlIlllll[0];
        this.xCoord = lllllllllllllIlIlIIIIlIIIlIIllIl;
        this.yCoord = lllllllllllllIlIlIIIIlIIIlIIllII;
        this.zCoord = lllllllllllllIlIlIIIIlIIIlIIlIll;
        this.hash = makeHash(lllllllllllllIlIlIIIIlIIIlIIllIl, lllllllllllllIlIlIIIIlIIIlIIllII, lllllllllllllIlIlIIIIlIIIlIIlIll);
    }
    
    private static boolean lIllIlIIIllIlll(final int lllllllllllllIlIlIIIIIlllllIIIIl) {
        return lllllllllllllIlIlIIIIIlllllIIIIl >= 0;
    }
    
    private static String lIllIlIIIllIIII(final String lllllllllllllIlIlIIIIlIIIIIIlIlI, final String lllllllllllllIlIlIIIIlIIIIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIlIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIIlIIIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIIlIIIIIIllII.init(PathPoint.lIIIIIIlIlllll[8], lllllllllllllIlIlIIIIlIIIIIIllIl);
            return new String(lllllllllllllIlIlIIIIlIIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIlIIIIIIlIll) {
            lllllllllllllIlIlIIIIlIIIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIIIllIlII(final int lllllllllllllIlIlIIIIIllllIlllll) {
        return lllllllllllllIlIlIIIIIllllIlllll < 0;
    }
    
    private static boolean lIllIlIIIlllIII(final int lllllllllllllIlIlIIIIIlllllIIllI, final int lllllllllllllIlIlIIIIIlllllIIlIl) {
        return lllllllllllllIlIlIIIIIlllllIIllI < lllllllllllllIlIlIIIIIlllllIIlIl;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIlIIIIlIIIIIlllll) {
        if (lIllIlIIIllIlIl((lllllllllllllIlIlIIIIlIIIIIlllll instanceof PathPoint) ? 1 : 0)) {
            return PathPoint.lIIIIIIlIlllll[5] != 0;
        }
        final PathPoint lllllllllllllIlIlIIIIlIIIIIllllI = (PathPoint)lllllllllllllIlIlIIIIlIIIIIlllll;
        if (lIllIlIIIllIllI(this.hash, lllllllllllllIlIlIIIIlIIIIIllllI.hash) && lIllIlIIIllIllI(this.xCoord, lllllllllllllIlIlIIIIlIIIIIllllI.xCoord) && lIllIlIIIllIllI(this.yCoord, lllllllllllllIlIlIIIIlIIIIIllllI.yCoord) && lIllIlIIIllIllI(this.zCoord, lllllllllllllIlIlIIIIlIIIIIllllI.zCoord)) {
            return PathPoint.lIIIIIIlIlllll[7] != 0;
        }
        return PathPoint.lIIIIIIlIlllll[5] != 0;
    }
    
    public float distanceTo(final PathPoint lllllllllllllIlIlIIIIlIIIIllIllI) {
        final float lllllllllllllIlIlIIIIlIIIIlllIlI = (float)(lllllllllllllIlIlIIIIlIIIIllIllI.xCoord - this.xCoord);
        final float lllllllllllllIlIlIIIIlIIIIlllIIl = (float)(lllllllllllllIlIlIIIIlIIIIllIllI.yCoord - this.yCoord);
        final float lllllllllllllIlIlIIIIlIIIIlllIII = (float)(lllllllllllllIlIlIIIIlIIIIllIllI.zCoord - this.zCoord);
        return MathHelper.sqrt_float(lllllllllllllIlIlIIIIlIIIIlllIlI * lllllllllllllIlIlIIIIlIIIIlllIlI + lllllllllllllIlIlIIIIlIIIIlllIIl * lllllllllllllIlIlIIIIlIIIIlllIIl + lllllllllllllIlIlIIIIlIIIIlllIII * lllllllllllllIlIlIIIIlIIIIlllIII);
    }
}
