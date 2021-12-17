// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.base.Objects;

public class Vec3i implements Comparable<Vec3i>
{
    private final /* synthetic */ int y;
    private final /* synthetic */ int x;
    private static final /* synthetic */ String[] lIIIlIIIIlIIII;
    private final /* synthetic */ int z;
    private static final /* synthetic */ int[] lIIIlIIIIlIlII;
    
    public int getY() {
        return this.y;
    }
    
    public double distanceSq(final double lllllllllllllIlIIIllIIlllllIlIIl, final double lllllllllllllIlIIIllIIlllllIlIII, final double lllllllllllllIlIIIllIIlllllIIIII) {
        final double lllllllllllllIlIIIllIIlllllIIllI = this.getX() - lllllllllllllIlIIIllIIlllllIlIIl;
        final double lllllllllllllIlIIIllIIlllllIIlIl = this.getY() - lllllllllllllIlIIIllIIlllllIlIII;
        final double lllllllllllllIlIIIllIIlllllIIlII = this.getZ() - lllllllllllllIlIIIllIIlllllIIIII;
        return lllllllllllllIlIIIllIIlllllIIllI * lllllllllllllIlIIIllIIlllllIIllI + lllllllllllllIlIIIllIIlllllIIlIl * lllllllllllllIlIIIllIIlllllIIlIl + lllllllllllllIlIIIllIIlllllIIlII * lllllllllllllIlIIIllIIlllllIIlII;
    }
    
    private static boolean lIlllllIIIIllIl(final int lllllllllllllIlIIIllIIlllIIlIlll) {
        return lllllllllllllIlIIIllIIlllIIlIlll == 0;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(Vec3i.lIIIlIIIIlIIII[Vec3i.lIIIlIIIIlIlII[0]], this.getX()).add(Vec3i.lIIIlIIIIlIIII[Vec3i.lIIIlIIIIlIlII[1]], this.getY()).add(Vec3i.lIIIlIIIIlIIII[Vec3i.lIIIlIIIIlIlII[3]], this.getZ()).toString();
    }
    
    @Override
    public int compareTo(final Vec3i lllllllllllllIlIIIllIlIIIIIIIIIl) {
        int n;
        if (lIlllllIIIIllll(this.getY(), lllllllllllllIlIIIllIlIIIIIIIIIl.getY())) {
            if (lIlllllIIIIllll(this.getZ(), lllllllllllllIlIIIllIlIIIIIIIIIl.getZ())) {
                n = this.getX() - lllllllllllllIlIIIllIlIIIIIIIIIl.getX();
                "".length();
                if ((0x7C ^ 0x3A ^ (0x59 ^ 0x1A)) <= 0) {
                    return (0x24 ^ 0x47 ^ (0x44 ^ 0x20)) & (75 + 50 - 37 + 56 ^ 112 + 137 - 182 + 84 ^ -" ".length());
                }
            }
            else {
                n = this.getZ() - lllllllllllllIlIIIllIlIIIIIIIIIl.getZ();
                "".length();
                if (-" ".length() >= " ".length()) {
                    return (0x90 ^ 0x96) & ~(0x25 ^ 0x23);
                }
            }
        }
        else {
            n = this.getY() - lllllllllllllIlIIIllIlIIIIIIIIIl.getY();
        }
        return n;
    }
    
    public int getZ() {
        return this.z;
    }
    
    public double distanceSq(final Vec3i lllllllllllllIlIIIllIIllllIIIIlI) {
        return this.distanceSq(lllllllllllllIlIIIllIIllllIIIIlI.getX(), lllllllllllllIlIIIllIIllllIIIIlI.getY(), lllllllllllllIlIIIllIIllllIIIIlI.getZ());
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIIllIlIIIIIIlllI) {
        if (lIlllllIIIIllII(this, lllllllllllllIlIIIllIlIIIIIIlllI)) {
            return Vec3i.lIIIlIIIIlIlII[1] != 0;
        }
        if (lIlllllIIIIllIl((lllllllllllllIlIIIllIlIIIIIIlllI instanceof Vec3i) ? 1 : 0)) {
            return Vec3i.lIIIlIIIIlIlII[0] != 0;
        }
        final Vec3i lllllllllllllIlIIIllIlIIIIIIllIl = (Vec3i)lllllllllllllIlIIIllIlIIIIIIlllI;
        int n;
        if (lIlllllIIIIlllI(this.getX(), lllllllllllllIlIIIllIlIIIIIIllIl.getX())) {
            n = Vec3i.lIIIlIIIIlIlII[0];
            "".length();
            if ("  ".length() == -" ".length()) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlllllIIIIlllI(this.getY(), lllllllllllllIlIIIllIlIIIIIIllIl.getY())) {
            n = Vec3i.lIIIlIIIIlIlII[0];
            "".length();
            if (" ".length() <= ((0x21 ^ 0x71) & ~(0xD3 ^ 0x83))) {
                return ((0xF ^ 0x3B) & ~(0x2 ^ 0x36)) != 0x0;
            }
        }
        else if (lIlllllIIIIllll(this.getZ(), lllllllllllllIlIIIllIlIIIIIIllIl.getZ())) {
            n = Vec3i.lIIIlIIIIlIlII[1];
            "".length();
            if (-(0x1E ^ 0x38 ^ (0x98 ^ 0xBA)) >= 0) {
                return ((0x3E ^ 0x27 ^ (0xC1 ^ 0x83)) & (0x60 ^ 0x65 ^ (0x1A ^ 0x44) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Vec3i.lIIIlIIIIlIlII[0];
        }
        return n != 0;
    }
    
    public int getX() {
        return this.x;
    }
    
    private static boolean lIlllllIIIIllll(final int lllllllllllllIlIIIllIIlllIIllllI, final int lllllllllllllIlIIIllIIlllIIlllIl) {
        return lllllllllllllIlIIIllIIlllIIllllI == lllllllllllllIlIIIllIIlllIIlllIl;
    }
    
    private static boolean lIlllllIIIIlllI(final int lllllllllllllIlIIIllIIlllIIlIlII, final int lllllllllllllIlIIIllIIlllIIlIIll) {
        return lllllllllllllIlIIIllIIlllIIlIlII != lllllllllllllIlIIIllIIlllIIlIIll;
    }
    
    @Override
    public int hashCode() {
        return (this.getY() + this.getZ() * Vec3i.lIIIlIIIIlIlII[2]) * Vec3i.lIIIlIIIIlIlII[2] + this.getX();
    }
    
    private static boolean lIlllllIIIIllII(final Object lllllllllllllIlIIIllIIlllIIllIlI, final Object lllllllllllllIlIIIllIIlllIIllIIl) {
        return lllllllllllllIlIIIllIIlllIIllIlI == lllllllllllllIlIIIllIIlllIIllIIl;
    }
    
    public double distanceSqToCenter(final double lllllllllllllIlIIIllIIllllIIllIl, final double lllllllllllllIlIIIllIIllllIIllII, final double lllllllllllllIlIIIllIIllllIIlIll) {
        final double lllllllllllllIlIIIllIIllllIlIIIl = this.getX() + 0.5 - lllllllllllllIlIIIllIIllllIIllIl;
        final double lllllllllllllIlIIIllIIllllIlIIII = this.getY() + 0.5 - lllllllllllllIlIIIllIIllllIIllII;
        final double lllllllllllllIlIIIllIIllllIIllll = this.getZ() + 0.5 - lllllllllllllIlIIIllIIllllIIlIll;
        return lllllllllllllIlIIIllIIllllIlIIIl * lllllllllllllIlIIIllIIllllIlIIIl + lllllllllllllIlIIIllIIllllIlIIII * lllllllllllllIlIIIllIIllllIlIIII + lllllllllllllIlIIIllIIllllIIllll * lllllllllllllIlIIIllIIllllIIllll;
    }
    
    private static void lIlllllIIIIlIll() {
        (lIIIlIIIIlIlII = new int[6])[0] = ((9 + 148 - 73 + 87 ^ 54 + 35 - 86 + 126) & (0xCE ^ 0xA8 ^ (0x35 ^ 0x79) ^ -" ".length()));
        Vec3i.lIIIlIIIIlIlII[1] = " ".length();
        Vec3i.lIIIlIIIIlIlII[2] = (0x5C ^ 0x19 ^ (0x1C ^ 0x46));
        Vec3i.lIIIlIIIIlIlII[3] = "  ".length();
        Vec3i.lIIIlIIIIlIlII[4] = "   ".length();
        Vec3i.lIIIlIIIIlIlII[5] = (0xE ^ 0x4A ^ (0x15 ^ 0x59));
    }
    
    public Vec3i(final int lllllllllllllIlIIIllIlIIIIlIIIIl, final int lllllllllllllIlIIIllIlIIIIlIIIII, final int lllllllllllllIlIIIllIlIIIIIlllll) {
        this.x = lllllllllllllIlIIIllIlIIIIlIIIIl;
        this.y = lllllllllllllIlIIIllIlIIIIlIIIII;
        this.z = lllllllllllllIlIIIllIlIIIIIlllll;
    }
    
    private static String lIllllIlllllllI(final String lllllllllllllIlIIIllIIlllIlIIlII, final String lllllllllllllIlIIIllIIlllIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIIlllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), Vec3i.lIIIlIIIIlIlII[5]), "DES");
            final Cipher lllllllllllllIlIIIllIIlllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIIlllIlIlIII.init(Vec3i.lIIIlIIIIlIlII[3], lllllllllllllIlIIIllIIlllIlIlIIl);
            return new String(lllllllllllllIlIIIllIIlllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIIlllIlIIlll) {
            lllllllllllllIlIIIllIIlllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    public Vec3i crossProduct(final Vec3i lllllllllllllIlIIIllIIllllllIlII) {
        return new Vec3i(this.getY() * lllllllllllllIlIIIllIIllllllIlII.getZ() - this.getZ() * lllllllllllllIlIIIllIIllllllIlII.getY(), this.getZ() * lllllllllllllIlIIIllIIllllllIlII.getX() - this.getX() * lllllllllllllIlIIIllIIllllllIlII.getZ(), this.getX() * lllllllllllllIlIIIllIIllllllIlII.getY() - this.getY() * lllllllllllllIlIIIllIIllllllIlII.getX());
    }
    
    static {
        lIlllllIIIIlIll();
        lIlllllIIIIIIIl();
        NULL_VECTOR = new Vec3i(Vec3i.lIIIlIIIIlIlII[0], Vec3i.lIIIlIIIIlIlII[0], Vec3i.lIIIlIIIIlIlII[0]);
    }
    
    public Vec3i(final double lllllllllllllIlIIIllIlIIIIIllIIl, final double lllllllllllllIlIIIllIlIIIIIlIlII, final double lllllllllllllIlIIIllIlIIIIIlIIll) {
        this(MathHelper.floor_double(lllllllllllllIlIIIllIlIIIIIllIIl), MathHelper.floor_double(lllllllllllllIlIIIllIlIIIIIlIlII), MathHelper.floor_double(lllllllllllllIlIIIllIlIIIIIlIIll));
    }
    
    private static String lIllllIllllllIl(final String lllllllllllllIlIIIllIIlllIllIIll, final String lllllllllllllIlIIIllIIlllIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIIlllIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIlllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllIIlllIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllIIlllIllIlIl.init(Vec3i.lIIIlIIIIlIlII[3], lllllllllllllIlIIIllIIlllIllIllI);
            return new String(lllllllllllllIlIIIllIIlllIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIlllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIIlllIllIlII) {
            lllllllllllllIlIIIllIIlllIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllllIIIIIIIl() {
        (lIIIlIIIIlIIII = new String[Vec3i.lIIIlIIIIlIlII[4]])[Vec3i.lIIIlIIIIlIlII[0]] = lIllllIllllllIl("LdfkQTXyi2w=", "zZQwA");
        Vec3i.lIIIlIIIIlIIII[Vec3i.lIIIlIIIIlIlII[1]] = lIllllIlllllllI("BwIhcUlfn6o=", "dKsVW");
        Vec3i.lIIIlIIIIlIIII[Vec3i.lIIIlIIIIlIlII[3]] = lIllllIllllllIl("3vNWy1sDGpE=", "EYTgy");
    }
}
