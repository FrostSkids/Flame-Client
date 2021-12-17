// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Vec3
{
    public final /* synthetic */ double xCoord;
    public final /* synthetic */ double yCoord;
    private static final /* synthetic */ int[] lIllIlIlllIIIl;
    private static final /* synthetic */ String[] lIllIlIllIlllI;
    public final /* synthetic */ double zCoord;
    
    private static int lllllllIIlIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllllllIIlIlllI(final int llllllllllllIllllllllIIlIlIIIlII, final int llllllllllllIllllllllIIlIlIIIIll) {
        return llllllllllllIllllllllIIlIlIIIlII < llllllllllllIllllllllIIlIlIIIIll;
    }
    
    public Vec3 getIntermediateWithYValue(final Vec3 llllllllllllIllllllllIIllIlllIlI, final double llllllllllllIllllllllIIllIllIIlI) {
        final double llllllllllllIllllllllIIllIlllIII = llllllllllllIllllllllIIllIlllIlI.xCoord - this.xCoord;
        final double llllllllllllIllllllllIIllIllIlll = llllllllllllIllllllllIIllIlllIlI.yCoord - this.yCoord;
        final double llllllllllllIllllllllIIllIllIllI = llllllllllllIllllllllIIllIlllIlI.zCoord - this.zCoord;
        if (lllllllIIlIIlIl(lllllllIIlIlIlI(llllllllllllIllllllllIIllIllIlll * llllllllllllIllllllllIIllIllIlll, 1.0000000116860974E-7))) {
            return null;
        }
        final double llllllllllllIllllllllIIllIllIlIl = (llllllllllllIllllllllIIllIllIIlI - this.yCoord) / llllllllllllIllllllllIIllIllIlll;
        Vec3 vec3;
        if (lllllllIIlIlIII(lllllllIIlIlIll(llllllllllllIllllllllIIllIllIlIl, 0.0)) && lllllllIIlIlIIl(lllllllIIlIlIlI(llllllllllllIllllllllIIllIllIlIl, 1.0))) {
            vec3 = new Vec3(this.xCoord + llllllllllllIllllllllIIllIlllIII * llllllllllllIllllllllIIllIllIlIl, this.yCoord + llllllllllllIllllllllIIllIllIlll * llllllllllllIllllllllIIllIllIlIl, this.zCoord + llllllllllllIllllllllIIllIllIllI * llllllllllllIllllllllIIllIllIlIl);
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else {
            vec3 = null;
        }
        return vec3;
    }
    
    public Vec3(final Vec3i llllllllllllIllllllllIlIIIllIlll) {
        this(llllllllllllIllllllllIlIIIllIlll.getX(), llllllllllllIllllllllIlIIIllIlll.getY(), llllllllllllIllllllllIlIIIllIlll.getZ());
    }
    
    private static String lllllllIIIlIIII(final String llllllllllllIllllllllIIlIlIIlIlI, final String llllllllllllIllllllllIIlIlIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllllllllIIlIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIIlIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllllIIlIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllllIIlIlIIlllI.init(Vec3.lIllIlIlllIIIl[2], llllllllllllIllllllllIIlIlIIllll);
            return new String(llllllllllllIllllllllIIlIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIIlIlIIllIl) {
            llllllllllllIllllllllIIlIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllllIIlIlIII(final int llllllllllllIllllllllIIlIIllllll) {
        return llllllllllllIllllllllIIlIIllllll >= 0;
    }
    
    private static int lllllllIIlIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public Vec3 subtractReverse(final Vec3 llllllllllllIllllllllIlIIIllIIIl) {
        return new Vec3(llllllllllllIllllllllIlIIIllIIIl.xCoord - this.xCoord, llllllllllllIllllllllIlIIIllIIIl.yCoord - this.yCoord, llllllllllllIllllllllIlIIIllIIIl.zCoord - this.zCoord);
    }
    
    private static int lllllllIIlIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lllllllIIlIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public Vec3 subtract(final Vec3 llllllllllllIllllllllIlIIIIlIlll) {
        return this.subtract(llllllllllllIllllllllIlIIIIlIlll.xCoord, llllllllllllIllllllllIlIIIIlIlll.yCoord, llllllllllllIllllllllIlIIIIlIlll.zCoord);
    }
    
    public Vec3 subtract(final double llllllllllllIllllllllIlIIIIlIIIl, final double llllllllllllIllllllllIlIIIIIllII, final double llllllllllllIllllllllIlIIIIIllll) {
        return this.addVector(-llllllllllllIllllllllIlIIIIlIIIl, -llllllllllllIllllllllIlIIIIIllII, -llllllllllllIllllllllIlIIIIIllll);
    }
    
    public Vec3 rotateYaw(final float llllllllllllIllllllllIIlIlllIIIl) {
        final float llllllllllllIllllllllIIlIlllIlll = MathHelper.cos(llllllllllllIllllllllIIlIlllIIIl);
        final float llllllllllllIllllllllIIlIlllIllI = MathHelper.sin(llllllllllllIllllllllIIlIlllIIIl);
        final double llllllllllllIllllllllIIlIlllIlIl = this.xCoord * llllllllllllIllllllllIIlIlllIlll + this.zCoord * llllllllllllIllllllllIIlIlllIllI;
        final double llllllllllllIllllllllIIlIlllIlII = this.yCoord;
        final double llllllllllllIllllllllIIlIlllIIll = this.zCoord * llllllllllllIllllllllIIlIlllIlll - this.xCoord * llllllllllllIllllllllIIlIlllIllI;
        return new Vec3(llllllllllllIllllllllIIlIlllIlIl, llllllllllllIllllllllIIlIlllIlII, llllllllllllIllllllllIIlIlllIIll);
    }
    
    private static int lllllllIIlIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public double lengthVector() {
        return MathHelper.sqrt_double(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
    }
    
    public Vec3 getIntermediateWithXValue(final Vec3 llllllllllllIllllllllIIlllIIlIII, final double llllllllllllIllllllllIIlllIIlllI) {
        final double llllllllllllIllllllllIIlllIIllIl = llllllllllllIllllllllIIlllIIlIII.xCoord - this.xCoord;
        final double llllllllllllIllllllllIIlllIIllII = llllllllllllIllllllllIIlllIIlIII.yCoord - this.yCoord;
        final double llllllllllllIllllllllIIlllIIlIll = llllllllllllIllllllllIIlllIIlIII.zCoord - this.zCoord;
        if (lllllllIIlIIlIl(lllllllIIlIIllI(llllllllllllIllllllllIIlllIIllIl * llllllllllllIllllllllIIlllIIllIl, 1.0000000116860974E-7))) {
            return null;
        }
        final double llllllllllllIllllllllIIlllIIlIlI = (llllllllllllIllllllllIIlllIIlllI - this.xCoord) / llllllllllllIllllllllIIlllIIllIl;
        Vec3 vec3;
        if (lllllllIIlIlIII(lllllllIIlIIlll(llllllllllllIllllllllIIlllIIlIlI, 0.0)) && lllllllIIlIlIIl(lllllllIIlIIllI(llllllllllllIllllllllIIlllIIlIlI, 1.0))) {
            vec3 = new Vec3(this.xCoord + llllllllllllIllllllllIIlllIIllIl * llllllllllllIllllllllIIlllIIlIlI, this.yCoord + llllllllllllIllllllllIIlllIIllII * llllllllllllIllllllllIIlllIIlIlI, this.zCoord + llllllllllllIllllllllIIlllIIlIll * llllllllllllIllllllllIIlllIIlIlI);
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            vec3 = null;
        }
        return vec3;
    }
    
    static {
        lllllllIIlIIIIl();
        lllllllIIIlIlIl();
    }
    
    private static int lllllllIIlIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllllllIIlIIIll(final int llllllllllllIllllllllIIlIlIIIIIl) {
        return llllllllllllIllllllllIIlIlIIIIIl == 0;
    }
    
    private static String lllllllIIIlIlII(String llllllllllllIllllllllIIlIlIlllII, final String llllllllllllIllllllllIIlIllIIIII) {
        llllllllllllIllllllllIIlIlIlllII = new String(Base64.getDecoder().decode(llllllllllllIllllllllIIlIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllllIIlIlIlllll = new StringBuilder();
        final char[] llllllllllllIllllllllIIlIlIllllI = llllllllllllIllllllllIIlIllIIIII.toCharArray();
        int llllllllllllIllllllllIIlIlIlllIl = Vec3.lIllIlIlllIIIl[0];
        final byte llllllllllllIllllllllIIlIlIlIlll = (Object)llllllllllllIllllllllIIlIlIlllII.toCharArray();
        final double llllllllllllIllllllllIIlIlIlIllI = llllllllllllIllllllllIIlIlIlIlll.length;
        int llllllllllllIllllllllIIlIlIlIlIl = Vec3.lIllIlIlllIIIl[0];
        while (lllllllIIlIlllI(llllllllllllIllllllllIIlIlIlIlIl, (int)llllllllllllIllllllllIIlIlIlIllI)) {
            final char llllllllllllIllllllllIIlIllIIIlI = llllllllllllIllllllllIIlIlIlIlll[llllllllllllIllllllllIIlIlIlIlIl];
            llllllllllllIllllllllIIlIlIlllll.append((char)(llllllllllllIllllllllIIlIllIIIlI ^ llllllllllllIllllllllIIlIlIllllI[llllllllllllIllllllllIIlIlIlllIl % llllllllllllIllllllllIIlIlIllllI.length]));
            "".length();
            ++llllllllllllIllllllllIIlIlIlllIl;
            ++llllllllllllIllllllllIIlIlIlIlIl;
            "".length();
            if ((0x3A ^ 0x3E) <= ((0x1B ^ 0x50) & ~(0xCC ^ 0x87))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllllIIlIlIlllll);
    }
    
    public Vec3 rotatePitch(final float llllllllllllIllllllllIIllIIIIllI) {
        final float llllllllllllIllllllllIIllIIIllII = MathHelper.cos(llllllllllllIllllllllIIllIIIIllI);
        final float llllllllllllIllllllllIIllIIIlIll = MathHelper.sin(llllllllllllIllllllllIIllIIIIllI);
        final double llllllllllllIllllllllIIllIIIlIlI = this.xCoord;
        final double llllllllllllIllllllllIIllIIIlIIl = this.yCoord * llllllllllllIllllllllIIllIIIllII + this.zCoord * llllllllllllIllllllllIIllIIIlIll;
        final double llllllllllllIllllllllIIllIIIlIII = this.zCoord * llllllllllllIllllllllIIllIIIllII - this.yCoord * llllllllllllIllllllllIIllIIIlIll;
        return new Vec3(llllllllllllIllllllllIIllIIIlIlI, llllllllllllIllllllllIIllIIIlIIl, llllllllllllIllllllllIIllIIIlIII);
    }
    
    public Vec3(double llllllllllllIllllllllIlIIIllllIl, double llllllllllllIllllllllIlIIIllllII, double llllllllllllIllllllllIlIIIlllIll) {
        if (lllllllIIlIIIll(lllllllIIlIIIlI(llllllllllllIllllllllIlIIIllllIl, -0.0))) {
            llllllllllllIllllllllIlIIIllllIl = 0.0;
        }
        if (lllllllIIlIIIll(lllllllIIlIIIlI(llllllllllllIllllllllIlIIIllllII, -0.0))) {
            llllllllllllIllllllllIlIIIllllII = 0.0;
        }
        if (lllllllIIlIIIll(lllllllIIlIIIlI(llllllllllllIllllllllIlIIIlllIll, -0.0))) {
            llllllllllllIllllllllIlIIIlllIll = 0.0;
        }
        this.xCoord = llllllllllllIllllllllIlIIIllllIl;
        this.yCoord = llllllllllllIllllllllIlIIIllllII;
        this.zCoord = llllllllllllIllllllllIlIIIlllIll;
    }
    
    public Vec3 addVector(final double llllllllllllIllllllllIIlllllllll, final double llllllllllllIllllllllIIllllllllI, final double llllllllllllIllllllllIIllllllIIl) {
        return new Vec3(this.xCoord + llllllllllllIllllllllIIlllllllll, this.yCoord + llllllllllllIllllllllIIllllllllI, this.zCoord + llllllllllllIllllllllIIllllllIIl);
    }
    
    private static int lllllllIIlIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double distanceTo(final Vec3 llllllllllllIllllllllIIlllllIIlI) {
        final double llllllllllllIllllllllIIlllllIIIl = llllllllllllIllllllllIIlllllIIlI.xCoord - this.xCoord;
        final double llllllllllllIllllllllIIlllllIIII = llllllllllllIllllllllIIlllllIIlI.yCoord - this.yCoord;
        final double llllllllllllIllllllllIIllllIllll = llllllllllllIllllllllIIlllllIIlI.zCoord - this.zCoord;
        return MathHelper.sqrt_double(llllllllllllIllllllllIIlllllIIIl * llllllllllllIllllllllIIlllllIIIl + llllllllllllIllllllllIIlllllIIII * llllllllllllIllllllllIIlllllIIII + llllllllllllIllllllllIIllllIllll * llllllllllllIllllllllIIllllIllll);
    }
    
    private static boolean lllllllIIlIIlIl(final int llllllllllllIllllllllIIlIIllllIl) {
        return llllllllllllIllllllllIIlIIllllIl < 0;
    }
    
    public double squareDistanceTo(final Vec3 llllllllllllIllllllllIIlllIllllI) {
        final double llllllllllllIllllllllIIllllIIIlI = llllllllllllIllllllllIIlllIllllI.xCoord - this.xCoord;
        final double llllllllllllIllllllllIIllllIIIIl = llllllllllllIllllllllIIlllIllllI.yCoord - this.yCoord;
        final double llllllllllllIllllllllIIllllIIIII = llllllllllllIllllllllIIlllIllllI.zCoord - this.zCoord;
        return llllllllllllIllllllllIIllllIIIlI * llllllllllllIllllllllIIllllIIIlI + llllllllllllIllllllllIIllllIIIIl * llllllllllllIllllllllIIllllIIIIl + llllllllllllIllllllllIIllllIIIII * llllllllllllIllllllllIIllllIIIII;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[0]]).append(this.xCoord).append(Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[1]]).append(this.yCoord).append(Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[2]]).append(this.zCoord).append(Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[3]]));
    }
    
    public Vec3 getIntermediateWithZValue(final Vec3 llllllllllllIllllllllIIllIlIIlIl, final double llllllllllllIllllllllIIllIIlllIl) {
        final double llllllllllllIllllllllIIllIlIIIll = llllllllllllIllllllllIIllIlIIlIl.xCoord - this.xCoord;
        final double llllllllllllIllllllllIIllIlIIIlI = llllllllllllIllllllllIIllIlIIlIl.yCoord - this.yCoord;
        final double llllllllllllIllllllllIIllIlIIIIl = llllllllllllIllllllllIIllIlIIlIl.zCoord - this.zCoord;
        if (lllllllIIlIIlIl(lllllllIIlIllII(llllllllllllIllllllllIIllIlIIIIl * llllllllllllIllllllllIIllIlIIIIl, 1.0000000116860974E-7))) {
            return null;
        }
        final double llllllllllllIllllllllIIllIlIIIII = (llllllllllllIllllllllIIllIIlllIl - this.zCoord) / llllllllllllIllllllllIIllIlIIIIl;
        Vec3 vec3;
        if (lllllllIIlIlIII(lllllllIIlIllIl(llllllllllllIllllllllIIllIlIIIII, 0.0)) && lllllllIIlIlIIl(lllllllIIlIllII(llllllllllllIllllllllIIllIlIIIII, 1.0))) {
            vec3 = new Vec3(this.xCoord + llllllllllllIllllllllIIllIlIIIll * llllllllllllIllllllllIIllIlIIIII, this.yCoord + llllllllllllIllllllllIIllIlIIIlI * llllllllllllIllllllllIIllIlIIIII, this.zCoord + llllllllllllIllllllllIIllIlIIIIl * llllllllllllIllllllllIIllIlIIIII);
            "".length();
            if (" ".length() <= ((0xE7 ^ 0xA0) & ~(0xFB ^ 0xBC))) {
                return null;
            }
        }
        else {
            vec3 = null;
        }
        return vec3;
    }
    
    public Vec3 normalize() {
        final double llllllllllllIllllllllIlIIIlIlIll = MathHelper.sqrt_double(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
        Vec3 vec3;
        if (lllllllIIlIIlIl(lllllllIIlIIlII(llllllllllllIllllllllIlIIIlIlIll, 1.0E-4))) {
            vec3 = new Vec3(0.0, 0.0, 0.0);
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            vec3 = new Vec3(this.xCoord / llllllllllllIllllllllIlIIIlIlIll, this.yCoord / llllllllllllIllllllllIlIIIlIlIll, this.zCoord / llllllllllllIllllllllIlIIIlIlIll);
        }
        return vec3;
    }
    
    public double dotProduct(final Vec3 llllllllllllIllllllllIlIIIlIIlIl) {
        return this.xCoord * llllllllllllIllllllllIlIIIlIIlIl.xCoord + this.yCoord * llllllllllllIllllllllIlIIIlIIlIl.yCoord + this.zCoord * llllllllllllIllllllllIlIIIlIIlIl.zCoord;
    }
    
    public Vec3 crossProduct(final Vec3 llllllllllllIllllllllIlIIIIlllll) {
        return new Vec3(this.yCoord * llllllllllllIllllllllIlIIIIlllll.zCoord - this.zCoord * llllllllllllIllllllllIlIIIIlllll.yCoord, this.zCoord * llllllllllllIllllllllIlIIIIlllll.xCoord - this.xCoord * llllllllllllIllllllllIlIIIIlllll.zCoord, this.xCoord * llllllllllllIllllllllIlIIIIlllll.yCoord - this.yCoord * llllllllllllIllllllllIlIIIIlllll.xCoord);
    }
    
    private static int lllllllIIlIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lllllllIIlIlIIl(final int llllllllllllIllllllllIIlIIlllIll) {
        return llllllllllllIllllllllIIlIIlllIll <= 0;
    }
    
    private static void lllllllIIlIIIIl() {
        (lIllIlIlllIIIl = new int[5])[0] = ((0x41 ^ 0x23 ^ (0x44 ^ 0x66)) & (10 + 61 - 23 + 184 ^ 119 + 64 - 140 + 125 ^ -" ".length()));
        Vec3.lIllIlIlllIIIl[1] = " ".length();
        Vec3.lIllIlIlllIIIl[2] = "  ".length();
        Vec3.lIllIlIlllIIIl[3] = "   ".length();
        Vec3.lIllIlIlllIIIl[4] = (0x13 ^ 0x17);
    }
    
    private static void lllllllIIIlIlIl() {
        (lIllIlIllIlllI = new String[Vec3.lIllIlIlllIIIl[4]])[Vec3.lIllIlIlllIIIl[0]] = lllllllIIIlIIII("sCNgdTfSnbA=", "VdWcN");
        Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[1]] = lllllllIIIlIIII("aeeb82kJjnc=", "KLVET");
        Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[2]] = lllllllIIIlIIII("/3CuUdpAapg=", "hwZqR");
        Vec3.lIllIlIllIlllI[Vec3.lIllIlIlllIIIl[3]] = lllllllIIIlIlII("cw==", "ZXZpr");
    }
    
    public Vec3 add(final Vec3 llllllllllllIllllllllIlIIIIIIlIl) {
        return this.addVector(llllllllllllIllllllllIlIIIIIIlIl.xCoord, llllllllllllIllllllllIlIIIIIIlIl.yCoord, llllllllllllIllllllllIlIIIIIIlIl.zCoord);
    }
}
