// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Path
{
    private /* synthetic */ int count;
    private /* synthetic */ PathPoint[] pathPoints;
    private static final /* synthetic */ String[] lIIIIIllIlllIl;
    private static final /* synthetic */ int[] lIIIIIlllIIIIl;
    
    private static String lIllIlllIlIIllI(final String lllllllllllllIlIIllIllIIllIlllll, final String lllllllllllllIlIIllIllIIlllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllIIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIllIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIllIIlllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIllIIlllIIIll.init(Path.lIIIIIlllIIIIl[4], lllllllllllllIlIIllIllIIlllIIlII);
            return new String(lllllllllllllIlIIllIllIIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIllIIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllIIlllIIIlI) {
            lllllllllllllIlIIllIllIIlllIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlllIllIlIl(final int lllllllllllllIlIIllIllIIllIllIIl, final int lllllllllllllIlIIllIllIIllIllIII) {
        return lllllllllllllIlIIllIllIIllIllIIl == lllllllllllllIlIIllIllIIllIllIII;
    }
    
    private static void lIllIlllIllIIIl() {
        (lIIIIIllIlllIl = new String[Path.lIIIIIlllIIIIl[2]])[Path.lIIIIIlllIIIIl[1]] = lIllIlllIlIIllI("cIUSEk9GiU4drwwJihMILA==", "mQKgZ");
    }
    
    private static void lIllIlllIllIIlI() {
        (lIIIIIlllIIIIl = new int[5])[0] = (0xFFFFE7E3 & 0x1C1C);
        Path.lIIIIIlllIIIIl[1] = ((0x73 ^ 0x41) & ~(0x2A ^ 0x18));
        Path.lIIIIIlllIIIIl[2] = " ".length();
        Path.lIIIIIlllIIIIl[3] = -" ".length();
        Path.lIIIIIlllIIIIl[4] = "  ".length();
    }
    
    public PathPoint addPoint(final PathPoint lllllllllllllIlIIllIllIlIIllIlII) {
        if (lIllIlllIllIlII(lllllllllllllIlIIllIllIlIIllIlII.index)) {
            throw new IllegalStateException(Path.lIIIIIllIlllIl[Path.lIIIIIlllIIIIl[1]]);
        }
        if (lIllIlllIllIlIl(this.count, this.pathPoints.length)) {
            final PathPoint[] lllllllllllllIlIIllIllIlIIllIllI = new PathPoint[this.count << Path.lIIIIIlllIIIIl[2]];
            System.arraycopy(this.pathPoints, Path.lIIIIIlllIIIIl[1], lllllllllllllIlIIllIllIlIIllIllI, Path.lIIIIIlllIIIIl[1], this.count);
            this.pathPoints = lllllllllllllIlIIllIllIlIIllIllI;
        }
        this.pathPoints[this.count] = lllllllllllllIlIIllIllIlIIllIlII;
        lllllllllllllIlIIllIllIlIIllIlII.index = this.count;
        final int count = this.count;
        this.count = count + Path.lIIIIIlllIIIIl[2];
        this.sortBack(count);
        return lllllllllllllIlIIllIllIlIIllIlII;
    }
    
    private void sortBack(int lllllllllllllIlIIllIllIlIIIlIIII) {
        final PathPoint lllllllllllllIlIIllIllIlIIIlIlIl = this.pathPoints[lllllllllllllIlIIllIllIlIIIlIIII];
        final float lllllllllllllIlIIllIllIlIIIlIIll = lllllllllllllIlIIllIllIlIIIlIlIl.distanceToTarget;
        "".length();
        if (((34 + 10 + 80 + 21 ^ 123 + 147 - 173 + 90) & (0x60 ^ 0x53 ^ (0x77 ^ 0x6E) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIllIlllIlllIlI(lllllllllllllIlIIllIllIlIIIlIIII)) {
            final int lllllllllllllIlIIllIllIlIIIlIlII = lllllllllllllIlIIllIllIlIIIlIIII - Path.lIIIIIlllIIIIl[2] >> Path.lIIIIIlllIIIIl[2];
            final PathPoint lllllllllllllIlIIllIllIlIIIlIIlI = this.pathPoints[lllllllllllllIlIIllIllIlIIIlIlII];
            if (lIllIlllIllIlII(lIllIlllIlllIIl(lllllllllllllIlIIllIllIlIIIlIIll, lllllllllllllIlIIllIllIlIIIlIIlI.distanceToTarget))) {
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
                break;
            }
            else {
                this.pathPoints[lllllllllllllIlIIllIllIlIIIlIIII] = lllllllllllllIlIIllIllIlIIIlIIlI;
                lllllllllllllIlIIllIllIlIIIlIIlI.index = lllllllllllllIlIIllIllIlIIIlIIII;
                lllllllllllllIlIIllIllIlIIIlIIII = lllllllllllllIlIIllIllIlIIIlIlII;
            }
        }
        this.pathPoints[lllllllllllllIlIIllIllIlIIIlIIII] = lllllllllllllIlIIllIllIlIIIlIlIl;
        lllllllllllllIlIIllIllIlIIIlIlIl.index = lllllllllllllIlIIllIllIlIIIlIIII;
    }
    
    private static boolean lIllIlllIllIllI(final int lllllllllllllIlIIllIllIIllIIlIlI) {
        return lllllllllllllIlIIllIllIIllIIlIlI > 0;
    }
    
    private static int lIllIlllIllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIllIlllIllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIllIlllIllIlII(final int lllllllllllllIlIIllIllIIllIlIIII) {
        return lllllllllllllIlIIllIllIIllIlIIII >= 0;
    }
    
    public PathPoint dequeue() {
        final PathPoint lllllllllllllIlIIllIllIlIIlIllII = this.pathPoints[Path.lIIIIIlllIIIIl[1]];
        final PathPoint[] pathPoints = this.pathPoints;
        final int n = Path.lIIIIIlllIIIIl[1];
        final PathPoint[] pathPoints2 = this.pathPoints;
        final int count = this.count - Path.lIIIIIlllIIIIl[2];
        this.count = count;
        pathPoints[n] = pathPoints2[count];
        this.pathPoints[this.count] = null;
        if (lIllIlllIllIllI(this.count)) {
            this.sortForward(Path.lIIIIIlllIIIIl[1]);
        }
        lllllllllllllIlIIllIllIlIIlIllII.index = Path.lIIIIIlllIIIIl[3];
        return lllllllllllllIlIIllIllIlIIlIllII;
    }
    
    public void clearPath() {
        this.count = Path.lIIIIIlllIIIIl[1];
    }
    
    private static boolean lIllIlllIlllIII(final int lllllllllllllIlIIllIllIIllIIlllI) {
        return lllllllllllllIlIIllIllIIllIIlllI < 0;
    }
    
    private void sortForward(int lllllllllllllIlIIllIllIIllllIlII) {
        final PathPoint lllllllllllllIlIIllIllIIllllllll = this.pathPoints[lllllllllllllIlIIllIllIIllllIlII];
        final float lllllllllllllIlIIllIllIIlllllllI = lllllllllllllIlIIllIllIIllllllll.distanceToTarget;
        while (true) {
            final int lllllllllllllIlIIllIllIIllllllIl = Path.lIIIIIlllIIIIl[2] + (lllllllllllllIlIIllIllIIllllIlII << Path.lIIIIIlllIIIIl[2]);
            final int lllllllllllllIlIIllIllIIllllllII = lllllllllllllIlIIllIllIIllllllIl + Path.lIIIIIlllIIIIl[2];
            if (lIllIlllIllllIl(lllllllllllllIlIIllIllIIllllllIl, this.count)) {
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                break;
            }
            else {
                final PathPoint lllllllllllllIlIIllIllIIlllllIll = this.pathPoints[lllllllllllllIlIIllIllIIllllllIl];
                final float lllllllllllllIlIIllIllIIlllllIlI = lllllllllllllIlIIllIllIIlllllIll.distanceToTarget;
                PathPoint lllllllllllllIlIIllIllIIlllllIII;
                float lllllllllllllIlIIllIllIIllllIllI = 0.0f;
                if (lIllIlllIllllIl(lllllllllllllIlIIllIllIIllllllII, this.count)) {
                    final PathPoint lllllllllllllIlIIllIllIIlllllIIl = null;
                    final float lllllllllllllIlIIllIllIIllllIlll = Float.POSITIVE_INFINITY;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIllIllIIlllllIII = this.pathPoints[lllllllllllllIlIIllIllIIllllllII];
                    lllllllllllllIlIIllIllIIllllIllI = lllllllllllllIlIIllIllIIlllllIII.distanceToTarget;
                }
                if (lIllIlllIlllIII(lIllIlllIlllIll(lllllllllllllIlIIllIllIIlllllIlI, lllllllllllllIlIIllIllIIllllIllI))) {
                    if (lIllIlllIllIlII(lIllIlllIllllII(lllllllllllllIlIIllIllIIlllllIlI, lllllllllllllIlIIllIllIIlllllllI))) {
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.pathPoints[lllllllllllllIlIIllIllIIllllIlII] = lllllllllllllIlIIllIllIIlllllIll;
                        lllllllllllllIlIIllIllIIlllllIll.index = lllllllllllllIlIIllIllIIllllIlII;
                        lllllllllllllIlIIllIllIIllllIlII = lllllllllllllIlIIllIllIIllllllIl;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                }
                else if (lIllIlllIllIlII(lIllIlllIllllII(lllllllllllllIlIIllIllIIllllIllI, lllllllllllllIlIIllIllIIlllllllI))) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    this.pathPoints[lllllllllllllIlIIllIllIIllllIlII] = lllllllllllllIlIIllIllIIlllllIII;
                    lllllllllllllIlIIllIllIIlllllIII.index = lllllllllllllIlIIllIllIIllllIlII;
                    lllllllllllllIlIIllIllIIllllIlII = lllllllllllllIlIIllIllIIllllllII;
                    "".length();
                    if (-(0x67 ^ 0x62) >= 0) {
                        return;
                    }
                    continue;
                }
            }
        }
        this.pathPoints[lllllllllllllIlIIllIllIIllllIlII] = lllllllllllllIlIIllIllIIllllllll;
        lllllllllllllIlIIllIllIIllllllll.index = lllllllllllllIlIIllIllIIllllIlII;
    }
    
    private static boolean lIllIlllIllllIl(final int lllllllllllllIlIIllIllIIllIlIlIl, final int lllllllllllllIlIIllIllIIllIlIlII) {
        return lllllllllllllIlIIllIllIIllIlIlIl >= lllllllllllllIlIIllIllIIllIlIlII;
    }
    
    private static int lIllIlllIlllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIllIlllIlllIlI(final int lllllllllllllIlIIllIllIIllIIllII) {
        return lllllllllllllIlIIllIllIIllIIllII <= 0;
    }
    
    public boolean isPathEmpty() {
        if (lIllIlllIllllll(this.count)) {
            return Path.lIIIIIlllIIIIl[2] != 0;
        }
        return Path.lIIIIIlllIIIIl[1] != 0;
    }
    
    private static int lIllIlllIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIllIlllIllllll(final int lllllllllllllIlIIllIllIIllIlIIlI) {
        return lllllllllllllIlIIllIllIIllIlIIlI == 0;
    }
    
    static {
        lIllIlllIllIIlI();
        lIllIlllIllIIIl();
    }
    
    public Path() {
        this.pathPoints = new PathPoint[Path.lIIIIIlllIIIIl[0]];
    }
    
    public void changeDistance(final PathPoint lllllllllllllIlIIllIllIlIIlIIIII, final float lllllllllllllIlIIllIllIlIIlIIIll) {
        final float lllllllllllllIlIIllIllIlIIlIIIlI = lllllllllllllIlIIllIllIlIIlIIIII.distanceToTarget;
        lllllllllllllIlIIllIllIlIIlIIIII.distanceToTarget = lllllllllllllIlIIllIllIlIIlIIIll;
        if (lIllIlllIlllIII(lIllIlllIllIlll(lllllllllllllIlIIllIllIlIIlIIIll, lllllllllllllIlIIllIllIlIIlIIIlI))) {
            this.sortBack(lllllllllllllIlIIllIllIlIIlIIIII.index);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            this.sortForward(lllllllllllllIlIIllIllIlIIlIIIII.index);
        }
    }
}
