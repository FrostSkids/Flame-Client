// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AxisAlignedBB
{
    private static final /* synthetic */ String[] lIIllllIIIIlII;
    public final /* synthetic */ double maxZ;
    public final /* synthetic */ double minX;
    public final /* synthetic */ double maxX;
    public final /* synthetic */ double minZ;
    public final /* synthetic */ double minY;
    public final /* synthetic */ double maxY;
    private static final /* synthetic */ int[] lIIllllIIIIlll;
    
    private static boolean llIlllIIllllIII(final int lllllllllllllIIlIIllIIIIlIllllll) {
        return lllllllllllllIIlIIllIIIIlIllllll < 0;
    }
    
    private static boolean llIlllIlIIIlIIl(final Object lllllllllllllIIlIIllIIIIllIIIlIl) {
        return lllllllllllllIIlIIllIIIIllIIIlIl == null;
    }
    
    public double calculateZOffset(final AxisAlignedBB lllllllllllllIIlIIllIIIlIlllIlII, double lllllllllllllIIlIIllIIIlIlllIIll) {
        if (llIlllIIllllIIl(llIlllIlIIIIIII(lllllllllllllIIlIIllIIIlIlllIlII.maxX, this.minX)) && llIlllIIllllIII(llIlllIlIIIIIIl(lllllllllllllIIlIIllIIIlIlllIlII.minX, this.maxX)) && llIlllIIllllIIl(llIlllIlIIIIIII(lllllllllllllIIlIIllIIIlIlllIlII.maxY, this.minY)) && llIlllIIllllIII(llIlllIlIIIIIIl(lllllllllllllIIlIIllIIIlIlllIlII.minY, this.maxY))) {
            if (llIlllIIllllIIl(llIlllIlIIIIIII(lllllllllllllIIlIIllIIIlIlllIIll, 0.0)) && llIlllIIlllllII(llIlllIlIIIIIIl(lllllllllllllIIlIIllIIIlIlllIlII.maxZ, this.minZ))) {
                final double lllllllllllllIIlIIllIIIlIlllIlll = this.minZ - lllllllllllllIIlIIllIIIlIlllIlII.maxZ;
                if (llIlllIIllllIII(llIlllIlIIIIIIl(lllllllllllllIIlIIllIIIlIlllIlll, lllllllllllllIIlIIllIIIlIlllIIll))) {
                    lllllllllllllIIlIIllIIIlIlllIIll = lllllllllllllIIlIIllIIIlIlllIlll;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return 0.0;
                    }
                }
            }
            else if (llIlllIIllllIII(llIlllIlIIIIIIl(lllllllllllllIIlIIllIIIlIlllIIll, 0.0)) && llIlllIIlllllIl(llIlllIlIIIIIII(lllllllllllllIIlIIllIIIlIlllIlII.minZ, this.maxZ))) {
                final double lllllllllllllIIlIIllIIIlIlllIllI = this.maxZ - lllllllllllllIIlIIllIIIlIlllIlII.minZ;
                if (llIlllIIllllIIl(llIlllIlIIIIIII(lllllllllllllIIlIIllIIIlIlllIllI, lllllllllllllIIlIIllIIIlIlllIIll))) {
                    lllllllllllllIIlIIllIIIlIlllIIll = lllllllllllllIIlIIllIIIlIlllIllI;
                }
            }
            return lllllllllllllIIlIIllIIIlIlllIIll;
        }
        return lllllllllllllIIlIIllIIIlIlllIIll;
    }
    
    private static void llIlllIIlllIlIl() {
        (lIIllllIIIIlll = new int[9])[0] = " ".length();
        AxisAlignedBB.lIIllllIIIIlll[1] = ((0xCD ^ 0xC1) & ~(0x9B ^ 0x97));
        AxisAlignedBB.lIIllllIIIIlll[2] = "  ".length();
        AxisAlignedBB.lIIllllIIIIlll[3] = "   ".length();
        AxisAlignedBB.lIIllllIIIIlll[4] = (0x59 ^ 0x5D);
        AxisAlignedBB.lIIllllIIIIlll[5] = (0x19 ^ 0x1C);
        AxisAlignedBB.lIIllllIIIIlll[6] = (0x72 ^ 0x21 ^ (0xEC ^ 0xB9));
        AxisAlignedBB.lIIllllIIIIlll[7] = (0x78 ^ 0x77 ^ (0x69 ^ 0x61));
        AxisAlignedBB.lIIllllIIIIlll[8] = (0xC ^ 0x4);
    }
    
    public MovingObjectPosition calculateIntercept(final Vec3 lllllllllllllIIlIIllIIIlIIlIIlII, final Vec3 lllllllllllllIIlIIllIIIlIIlIlllI) {
        Vec3 lllllllllllllIIlIIllIIIlIIlIllIl = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithXValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.minX);
        Vec3 lllllllllllllIIlIIllIIIlIIlIllII = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithXValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.maxX);
        Vec3 lllllllllllllIIlIIllIIIlIIlIlIll = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithYValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.minY);
        Vec3 lllllllllllllIIlIIllIIIlIIlIlIlI = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithYValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.maxY);
        Vec3 lllllllllllllIIlIIllIIIlIIlIlIIl = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithZValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.minZ);
        Vec3 lllllllllllllIIlIIllIIIlIIlIlIII = lllllllllllllIIlIIllIIIlIIlIIlII.getIntermediateWithZValue(lllllllllllllIIlIIllIIIlIIlIlllI, this.maxZ);
        if (llIlllIlIIIIlll(this.isVecInYZ(lllllllllllllIIlIIllIIIlIIlIllIl) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIllIl = null;
        }
        if (llIlllIlIIIIlll(this.isVecInYZ(lllllllllllllIIlIIllIIIlIIlIllII) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIllII = null;
        }
        if (llIlllIlIIIIlll(this.isVecInXZ(lllllllllllllIIlIIllIIIlIIlIlIll) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIlIll = null;
        }
        if (llIlllIlIIIIlll(this.isVecInXZ(lllllllllllllIIlIIllIIIlIIlIlIlI) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIlIlI = null;
        }
        if (llIlllIlIIIIlll(this.isVecInXY(lllllllllllllIIlIIllIIIlIIlIlIIl) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIlIIl = null;
        }
        if (llIlllIlIIIIlll(this.isVecInXY(lllllllllllllIIlIIllIIIlIIlIlIII) ? 1 : 0)) {
            lllllllllllllIIlIIllIIIlIIlIlIII = null;
        }
        Vec3 lllllllllllllIIlIIllIIIlIIlIIlll = null;
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIllIl)) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIllIl;
        }
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIllII) && (!llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIIlll) || llIlllIIllllIII(llIlllIlIIIIllI(lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIllII), lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIIlll))))) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIllII;
        }
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIlIll) && (!llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIIlll) || llIlllIIllllIII(llIlllIlIIIIllI(lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIlIll), lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIIlll))))) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIlIll;
        }
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIlIlI) && (!llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIIlll) || llIlllIIllllIII(llIlllIlIIIIllI(lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIlIlI), lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIIlll))))) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIlIlI;
        }
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIlIIl) && (!llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIIlll) || llIlllIIllllIII(llIlllIlIIIIllI(lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIlIIl), lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIIlll))))) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIlIIl;
        }
        if (llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIlIII) && (!llIlllIlIIIlIII(lllllllllllllIIlIIllIIIlIIlIIlll) || llIlllIIllllIII(llIlllIlIIIIllI(lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIlIII), lllllllllllllIIlIIllIIIlIIlIIlII.squareDistanceTo(lllllllllllllIIlIIllIIIlIIlIIlll))))) {
            lllllllllllllIIlIIllIIIlIIlIIlll = lllllllllllllIIlIIllIIIlIIlIlIII;
        }
        if (llIlllIlIIIlIIl(lllllllllllllIIlIIllIIIlIIlIIlll)) {
            return null;
        }
        EnumFacing lllllllllllllIIlIIllIIIlIIlIIllI = null;
        if (llIlllIlIIIlIlI(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIllIl)) {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.WEST;
            "".length();
            if (((36 + 157 - 165 + 157 ^ 99 + 112 - 138 + 55) & (0x3A ^ 0x6A ^ (0x75 ^ 0x1C) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else if (llIlllIlIIIlIlI(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIllII)) {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.EAST;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (llIlllIlIIIlIlI(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIlIll)) {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.DOWN;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (llIlllIlIIIlIlI(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIlIlI)) {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.UP;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else if (llIlllIlIIIlIlI(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIlIIl)) {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.NORTH;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            lllllllllllllIIlIIllIIIlIIlIIllI = EnumFacing.SOUTH;
        }
        return new MovingObjectPosition(lllllllllllllIIlIIllIIIlIIlIIlll, lllllllllllllIIlIIllIIIlIIlIIllI);
    }
    
    private static boolean llIlllIlIIIlIlI(final Object lllllllllllllIIlIIllIIIIllIIlIII, final Object lllllllllllllIIlIIllIIIIllIIIlll) {
        return lllllllllllllIIlIIllIIIIllIIlIII == lllllllllllllIIlIIllIIIIllIIIlll;
    }
    
    public double getAverageEdgeLength() {
        final double lllllllllllllIIlIIllIIIlIllIIIII = this.maxX - this.minX;
        final double lllllllllllllIIlIIllIIIlIlIlllll = this.maxY - this.minY;
        final double lllllllllllllIIlIIllIIIlIlIllllI = this.maxZ - this.minZ;
        return (lllllllllllllIIlIIllIIIlIllIIIII + lllllllllllllIIlIIllIIIlIlIlllll + lllllllllllllIIlIIllIIIlIlIllllI) / 3.0;
    }
    
    private static int llIlllIIlllllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIlIIIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlllIlIIIIlll(final int lllllllllllllIIlIIllIIIIllIIIIll) {
        return lllllllllllllIIlIIllIIIIllIIIIll == 0;
    }
    
    public AxisAlignedBB addCoord(final double lllllllllllllIIlIIllIIlIIIIlIIIl, final double lllllllllllllIIlIIllIIlIIIIlIIII, final double lllllllllllllIIlIIllIIlIIIIIIlII) {
        double lllllllllllllIIlIIllIIlIIIIIlllI = this.minX;
        double lllllllllllllIIlIIllIIlIIIIIllIl = this.minY;
        double lllllllllllllIIlIIllIIlIIIIIllII = this.minZ;
        double lllllllllllllIIlIIllIIlIIIIIlIll = this.maxX;
        double lllllllllllllIIlIIllIIlIIIIIlIlI = this.maxY;
        double lllllllllllllIIlIIllIIlIIIIIlIIl = this.maxZ;
        if (llIlllIIllllIII(llIlllIIlllIllI(lllllllllllllIIlIIllIIlIIIIlIIIl, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIlllI += lllllllllllllIIlIIllIIlIIIIlIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIlllIIllllIIl(llIlllIIlllIlll(lllllllllllllIIlIIllIIlIIIIlIIIl, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIlIll += lllllllllllllIIlIIllIIlIIIIlIIIl;
        }
        if (llIlllIIllllIII(llIlllIIlllIllI(lllllllllllllIIlIIllIIlIIIIlIIII, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIllIl += lllllllllllllIIlIIllIIlIIIIlIIII;
            "".length();
            if ("  ".length() >= (0x75 ^ 0x64 ^ (0x38 ^ 0x2D))) {
                return null;
            }
        }
        else if (llIlllIIllllIIl(llIlllIIlllIlll(lllllllllllllIIlIIllIIlIIIIlIIII, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIlIlI += lllllllllllllIIlIIllIIlIIIIlIIII;
        }
        if (llIlllIIllllIII(llIlllIIlllIllI(lllllllllllllIIlIIllIIlIIIIIIlII, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIllII += lllllllllllllIIlIIllIIlIIIIIIlII;
            "".length();
            if ((0x30 ^ 0x5B ^ (0xF3 ^ 0x9D)) <= 0) {
                return null;
            }
        }
        else if (llIlllIIllllIIl(llIlllIIlllIlll(lllllllllllllIIlIIllIIlIIIIIIlII, 0.0))) {
            lllllllllllllIIlIIllIIlIIIIIlIIl += lllllllllllllIIlIIllIIlIIIIIIlII;
        }
        return new AxisAlignedBB(lllllllllllllIIlIIllIIlIIIIIlllI, lllllllllllllIIlIIllIIlIIIIIllIl, lllllllllllllIIlIIllIIlIIIIIllII, lllllllllllllIIlIIllIIlIIIIIlIll, lllllllllllllIIlIIllIIlIIIIIlIlI, lllllllllllllIIlIIllIIlIIIIIlIIl);
    }
    
    public AxisAlignedBB expand(final double lllllllllllllIIlIIllIIIlllllIIll, final double lllllllllllllIIlIIllIIIlllllIIlI, final double lllllllllllllIIlIIllIIIllllIIllI) {
        final double lllllllllllllIIlIIllIIIlllllIIII = this.minX - lllllllllllllIIlIIllIIIlllllIIll;
        final double lllllllllllllIIlIIllIIIllllIllll = this.minY - lllllllllllllIIlIIllIIIlllllIIlI;
        final double lllllllllllllIIlIIllIIIllllIlllI = this.minZ - lllllllllllllIIlIIllIIIllllIIllI;
        final double lllllllllllllIIlIIllIIIllllIllIl = this.maxX + lllllllllllllIIlIIllIIIlllllIIll;
        final double lllllllllllllIIlIIllIIIllllIllII = this.maxY + lllllllllllllIIlIIllIIIlllllIIlI;
        final double lllllllllllllIIlIIllIIIllllIlIll = this.maxZ + lllllllllllllIIlIIllIIIllllIIllI;
        return new AxisAlignedBB(lllllllllllllIIlIIllIIIlllllIIII, lllllllllllllIIlIIllIIIllllIllll, lllllllllllllIIlIIllIIIllllIlllI, lllllllllllllIIlIIllIIIllllIllIl, lllllllllllllIIlIIllIIIllllIllII, lllllllllllllIIlIIllIIIllllIlIll);
    }
    
    public AxisAlignedBB(final double lllllllllllllIIlIIllIIlIIIlIlIll, final double lllllllllllllIIlIIllIIlIIIlIlIlI, final double lllllllllllllIIlIIllIIlIIIlIlIIl, final double lllllllllllllIIlIIllIIlIIIlIllll, final double lllllllllllllIIlIIllIIlIIIlIlllI, final double lllllllllllllIIlIIllIIlIIIlIllIl) {
        this.minX = Math.min(lllllllllllllIIlIIllIIlIIIlIlIll, lllllllllllllIIlIIllIIlIIIlIllll);
        this.minY = Math.min(lllllllllllllIIlIIllIIlIIIlIlIlI, lllllllllllllIIlIIllIIlIIIlIlllI);
        this.minZ = Math.min(lllllllllllllIIlIIllIIlIIIlIlIIl, lllllllllllllIIlIIllIIlIIIlIllIl);
        this.maxX = Math.max(lllllllllllllIIlIIllIIlIIIlIlIll, lllllllllllllIIlIIllIIlIIIlIllll);
        this.maxY = Math.max(lllllllllllllIIlIIllIIlIIIlIlIlI, lllllllllllllIIlIIllIIlIIIlIlllI);
        this.maxZ = Math.max(lllllllllllllIIlIIllIIlIIIlIlIIl, lllllllllllllIIlIIllIIlIIIlIllIl);
    }
    
    public double calculateXOffset(final AxisAlignedBB lllllllllllllIIlIIllIIIllIIIlllI, double lllllllllllllIIlIIllIIIllIIlIIlI) {
        if (llIlllIIllllIIl(llIlllIIllllIlI(lllllllllllllIIlIIllIIIllIIIlllI.maxY, this.minY)) && llIlllIIllllIII(llIlllIIllllIll(lllllllllllllIIlIIllIIIllIIIlllI.minY, this.maxY)) && llIlllIIllllIIl(llIlllIIllllIlI(lllllllllllllIIlIIllIIIllIIIlllI.maxZ, this.minZ)) && llIlllIIllllIII(llIlllIIllllIll(lllllllllllllIIlIIllIIIllIIIlllI.minZ, this.maxZ))) {
            if (llIlllIIllllIIl(llIlllIIllllIlI(lllllllllllllIIlIIllIIIllIIlIIlI, 0.0)) && llIlllIIlllllII(llIlllIIllllIll(lllllllllllllIIlIIllIIIllIIIlllI.maxX, this.minX))) {
                final double lllllllllllllIIlIIllIIIllIIlIIIl = this.minX - lllllllllllllIIlIIllIIIllIIIlllI.maxX;
                if (llIlllIIllllIII(llIlllIIllllIll(lllllllllllllIIlIIllIIIllIIlIIIl, lllllllllllllIIlIIllIIIllIIlIIlI))) {
                    lllllllllllllIIlIIllIIIllIIlIIlI = lllllllllllllIIlIIllIIIllIIlIIIl;
                    "".length();
                    if ((0x8C ^ 0x88) <= -" ".length()) {
                        return 0.0;
                    }
                }
            }
            else if (llIlllIIllllIII(llIlllIIllllIll(lllllllllllllIIlIIllIIIllIIlIIlI, 0.0)) && llIlllIIlllllIl(llIlllIIllllIlI(lllllllllllllIIlIIllIIIllIIIlllI.minX, this.maxX))) {
                final double lllllllllllllIIlIIllIIIllIIlIIII = this.maxX - lllllllllllllIIlIIllIIIllIIIlllI.minX;
                if (llIlllIIllllIIl(llIlllIIllllIlI(lllllllllllllIIlIIllIIIllIIlIIII, lllllllllllllIIlIIllIIIllIIlIIlI))) {
                    lllllllllllllIIlIIllIIIllIIlIIlI = lllllllllllllIIlIIllIIIllIIlIIII;
                }
            }
            return lllllllllllllIIlIIllIIIllIIlIIlI;
        }
        return lllllllllllllIIlIIllIIIllIIlIIlI;
    }
    
    private static int llIlllIIlllIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private boolean isVecInXY(final Vec3 lllllllllllllIIlIIllIIIlIIIIlIIl) {
        int n;
        if (llIlllIlIIIlIIl(lllllllllllllIIlIIllIIIlIIIIlIIl)) {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x52 ^ 0x75 ^ (0x36 ^ 0x32)) & (175 + 7 - 74 + 68 ^ 1 + 46 - 45 + 145 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlllIIlllllIl(llIlllIlIIIllll(lllllllllllllIIlIIllIIIlIIIIlIIl.xCoord, this.minX)) && llIlllIIlllllII(llIlllIlIIlIIII(lllllllllllllIIlIIllIIIlIIIIlIIl.xCoord, this.maxX)) && llIlllIIlllllIl(llIlllIlIIIllll(lllllllllllllIIlIIllIIIlIIIIlIIl.yCoord, this.minY)) && llIlllIIlllllII(llIlllIlIIlIIII(lllllllllllllIIlIIllIIIlIIIIlIIl.yCoord, this.maxY))) {
            n = AxisAlignedBB.lIIllllIIIIlll[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0xA0 ^ 0x96) & ~(0x3A ^ 0xC)) != 0x0;
            }
        }
        else {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
        }
        return n != 0;
    }
    
    private static int llIlllIIllllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIlIIIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlllIlIIlIIIl(final int lllllllllllllIIlIIllIIIIllIIlllI, final int lllllllllllllIIlIIllIIIIllIIllIl) {
        return lllllllllllllIIlIIllIIIIllIIlllI < lllllllllllllIIlIIllIIIIllIIllIl;
    }
    
    private static int llIlllIlIIlIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static AxisAlignedBB fromBounds(final double lllllllllllllIIlIIllIIIllIllIIII, final double lllllllllllllIIlIIllIIIllIlIlllI, final double lllllllllllllIIlIIllIIIllIlIllII, final double lllllllllllllIIlIIllIIIllIlllIIl, final double lllllllllllllIIlIIllIIIllIlllIII, final double lllllllllllllIIlIIllIIIllIlIIlll) {
        final double lllllllllllllIIlIIllIIIllIllIllI = Math.min(lllllllllllllIIlIIllIIIllIllIIII, lllllllllllllIIlIIllIIIllIlllIIl);
        final double lllllllllllllIIlIIllIIIllIllIlIl = Math.min(lllllllllllllIIlIIllIIIllIlIlllI, lllllllllllllIIlIIllIIIllIlllIII);
        final double lllllllllllllIIlIIllIIIllIllIlII = Math.min(lllllllllllllIIlIIllIIIllIlIllII, lllllllllllllIIlIIllIIIllIlIIlll);
        final double lllllllllllllIIlIIllIIIllIllIIll = Math.max(lllllllllllllIIlIIllIIIllIllIIII, lllllllllllllIIlIIllIIIllIlllIIl);
        final double lllllllllllllIIlIIllIIIllIllIIlI = Math.max(lllllllllllllIIlIIllIIIllIlIlllI, lllllllllllllIIlIIllIIIllIlllIII);
        final double lllllllllllllIIlIIllIIIllIllIIIl = Math.max(lllllllllllllIIlIIllIIIllIlIllII, lllllllllllllIIlIIllIIIllIlIIlll);
        return new AxisAlignedBB(lllllllllllllIIlIIllIIIllIllIllI, lllllllllllllIIlIIllIIIllIllIlIl, lllllllllllllIIlIIllIIIllIllIlII, lllllllllllllIIlIIllIIIllIllIIll, lllllllllllllIIlIIllIIIllIllIIlI, lllllllllllllIIlIIllIIIllIllIIIl);
    }
    
    public boolean func_181656_b() {
        if (llIlllIlIIIIlll(Double.isNaN(this.minX) ? 1 : 0) && llIlllIlIIIIlll(Double.isNaN(this.minY) ? 1 : 0) && llIlllIlIIIIlll(Double.isNaN(this.minZ) ? 1 : 0) && llIlllIlIIIIlll(Double.isNaN(this.maxX) ? 1 : 0) && llIlllIlIIIIlll(Double.isNaN(this.maxY) ? 1 : 0) && llIlllIlIIIIlll(Double.isNaN(this.maxZ) ? 1 : 0)) {
            return AxisAlignedBB.lIIllllIIIIlll[1] != 0;
        }
        return AxisAlignedBB.lIIllllIIIIlll[0] != 0;
    }
    
    private boolean isVecInYZ(final Vec3 lllllllllllllIIlIIllIIIlIIIlIlIl) {
        int n;
        if (llIlllIlIIIlIIl(lllllllllllllIIlIIllIIIlIIIlIlIl)) {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x25 ^ 0x40 ^ (0x9E ^ 0xA1)) & (0x8A ^ 0x94 ^ (0xD9 ^ 0x9D) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlllIIlllllIl(llIlllIlIIIlIll(lllllllllllllIIlIIllIIIlIIIlIlIl.yCoord, this.minY)) && llIlllIIlllllII(llIlllIlIIIllII(lllllllllllllIIlIIllIIIlIIIlIlIl.yCoord, this.maxY)) && llIlllIIlllllIl(llIlllIlIIIlIll(lllllllllllllIIlIIllIIIlIIIlIlIl.zCoord, this.minZ)) && llIlllIIlllllII(llIlllIlIIIllII(lllllllllllllIIlIIllIIIlIIIlIlIl.zCoord, this.maxZ))) {
            n = AxisAlignedBB.lIIllllIIIIlll[0];
            "".length();
            if ("  ".length() <= 0) {
                return ((65 + 73 - 55 + 167 ^ 164 + 85 - 172 + 102) & (0xB ^ 0x35 ^ (0xB7 ^ 0xC0) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
        }
        return n != 0;
    }
    
    private static String llIlllIIlllIIII(String lllllllllllllIIlIIllIIIIllIllllI, final String lllllllllllllIIlIIllIIIIllIlllIl) {
        lllllllllllllIIlIIllIIIIllIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIllIIIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllIIIIllIlllII = new StringBuilder();
        final char[] lllllllllllllIIlIIllIIIIllIllIll = lllllllllllllIIlIIllIIIIllIlllIl.toCharArray();
        int lllllllllllllIIlIIllIIIIllIllIlI = AxisAlignedBB.lIIllllIIIIlll[1];
        final Exception lllllllllllllIIlIIllIIIIllIlIlII = (Object)lllllllllllllIIlIIllIIIIllIllllI.toCharArray();
        final short lllllllllllllIIlIIllIIIIllIlIIll = (short)lllllllllllllIIlIIllIIIIllIlIlII.length;
        float lllllllllllllIIlIIllIIIIllIlIIlI = AxisAlignedBB.lIIllllIIIIlll[1];
        while (llIlllIlIIlIIIl((int)lllllllllllllIIlIIllIIIIllIlIIlI, lllllllllllllIIlIIllIIIIllIlIIll)) {
            final char lllllllllllllIIlIIllIIIIllIlllll = lllllllllllllIIlIIllIIIIllIlIlII[lllllllllllllIIlIIllIIIIllIlIIlI];
            lllllllllllllIIlIIllIIIIllIlllII.append((char)(lllllllllllllIIlIIllIIIIllIlllll ^ lllllllllllllIIlIIllIIIIllIllIll[lllllllllllllIIlIIllIIIIllIllIlI % lllllllllllllIIlIIllIIIIllIllIll.length]));
            "".length();
            ++lllllllllllllIIlIIllIIIIllIllIlI;
            ++lllllllllllllIIlIIllIIIIllIlIIlI;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllIIIIllIlllII);
    }
    
    private static int llIlllIlIIIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private boolean isVecInXZ(final Vec3 lllllllllllllIIlIIllIIIlIIIlIIIl) {
        int n;
        if (llIlllIlIIIlIIl(lllllllllllllIIlIIllIIIlIIIlIIIl)) {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
            "".length();
            if ((0x9A ^ 0x9E) == 0x0) {
                return ((0xAB ^ 0xB3) & ~(0xDE ^ 0xC6)) != 0x0;
            }
        }
        else if (llIlllIIlllllIl(llIlllIlIIIllIl(lllllllllllllIIlIIllIIIlIIIlIIIl.xCoord, this.minX)) && llIlllIIlllllII(llIlllIlIIIlllI(lllllllllllllIIlIIllIIIlIIIlIIIl.xCoord, this.maxX)) && llIlllIIlllllIl(llIlllIlIIIllIl(lllllllllllllIIlIIllIIIlIIIlIIIl.zCoord, this.minZ)) && llIlllIIlllllII(llIlllIlIIIlllI(lllllllllllllIIlIIllIIIlIIIlIIIl.zCoord, this.maxZ))) {
            n = AxisAlignedBB.lIIllllIIIIlll[0];
            "".length();
            if (((0x5 ^ 0x29) & ~(0x56 ^ 0x7A)) < 0) {
                return ((0x63 ^ 0x33) & ~(0x3D ^ 0x6D)) != 0x0;
            }
        }
        else {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
        }
        return n != 0;
    }
    
    private static int llIlllIlIIIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIIllllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public AxisAlignedBB union(final AxisAlignedBB lllllllllllllIIlIIllIIIlllIlIlll) {
        final double lllllllllllllIIlIIllIIIlllIlIllI = Math.min(this.minX, lllllllllllllIIlIIllIIIlllIlIlll.minX);
        final double lllllllllllllIIlIIllIIIlllIlIlIl = Math.min(this.minY, lllllllllllllIIlIIllIIIlllIlIlll.minY);
        final double lllllllllllllIIlIIllIIIlllIlIlII = Math.min(this.minZ, lllllllllllllIIlIIllIIIlllIlIlll.minZ);
        final double lllllllllllllIIlIIllIIIlllIlIIll = Math.max(this.maxX, lllllllllllllIIlIIllIIIlllIlIlll.maxX);
        final double lllllllllllllIIlIIllIIIlllIlIIlI = Math.max(this.maxY, lllllllllllllIIlIIllIIIlllIlIlll.maxY);
        final double lllllllllllllIIlIIllIIIlllIlIIIl = Math.max(this.maxZ, lllllllllllllIIlIIllIIIlllIlIlll.maxZ);
        return new AxisAlignedBB(lllllllllllllIIlIIllIIIlllIlIllI, lllllllllllllIIlIIllIIIlllIlIlIl, lllllllllllllIIlIIllIIIlllIlIlII, lllllllllllllIIlIIllIIIlllIlIIll, lllllllllllllIIlIIllIIIlllIlIIlI, lllllllllllllIIlIIllIIIlllIlIIIl);
    }
    
    private static int llIlllIlIIIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean isVecInside(final Vec3 lllllllllllllIIlIIllIIIlIllIIllI) {
        int n;
        if (llIlllIIllllIIl(llIlllIlIIIIlII(lllllllllllllIIlIIllIIIlIllIIllI.xCoord, this.minX)) && llIlllIIllllIII(llIlllIlIIIIlIl(lllllllllllllIIlIIllIIIlIllIIllI.xCoord, this.maxX))) {
            if (llIlllIIllllIIl(llIlllIlIIIIlII(lllllllllllllIIlIIllIIIlIllIIllI.yCoord, this.minY)) && llIlllIIllllIII(llIlllIlIIIIlIl(lllllllllllllIIlIIllIIIlIllIIllI.yCoord, this.maxY))) {
                if (llIlllIIllllIIl(llIlllIlIIIIlII(lllllllllllllIIlIIllIIIlIllIIllI.zCoord, this.minZ)) && llIlllIIllllIII(llIlllIlIIIIlIl(lllllllllllllIIlIIllIIIlIllIIllI.zCoord, this.maxZ))) {
                    n = AxisAlignedBB.lIIllllIIIIlll[0];
                    "".length();
                    if (((0x8D ^ 0xB6) & ~(0xFE ^ 0xC5)) != 0x0) {
                        return ((0x48 ^ 0x4E) & ~(0xA0 ^ 0xA6)) != 0x0;
                    }
                }
                else {
                    n = AxisAlignedBB.lIIllllIIIIlll[1];
                    "".length();
                    if ((0x76 ^ 0x73) == 0x0) {
                        return ((0x49 ^ 0x1F) & ~(0xC3 ^ 0x95)) != 0x0;
                    }
                }
            }
            else {
                n = AxisAlignedBB.lIIllllIIIIlll[1];
                "".length();
                if (((0x2D ^ 0x23 ^ (0x9C ^ 0xB5)) & (0xC9 ^ 0xB8 ^ (0x3D ^ 0x6B) ^ -" ".length())) < -" ".length()) {
                    return ((0xA2 ^ 0xAA ^ (0x34 ^ 0x74)) & (15 + 228 - 235 + 233 ^ 2 + 162 - 144 + 165 ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
        }
        return n != 0;
    }
    
    private static int llIlllIlIIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIlIIIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIlIIIIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public AxisAlignedBB contract(final double lllllllllllllIIlIIllIIIlIlIIIlII, final double lllllllllllllIIlIIllIIIlIlIIllIl, final double lllllllllllllIIlIIllIIIlIlIIIIIl) {
        final double lllllllllllllIIlIIllIIIlIlIIlIll = this.minX + lllllllllllllIIlIIllIIIlIlIIIlII;
        final double lllllllllllllIIlIIllIIIlIlIIlIlI = this.minY + lllllllllllllIIlIIllIIIlIlIIllIl;
        final double lllllllllllllIIlIIllIIIlIlIIlIIl = this.minZ + lllllllllllllIIlIIllIIIlIlIIIIIl;
        final double lllllllllllllIIlIIllIIIlIlIIlIII = this.maxX - lllllllllllllIIlIIllIIIlIlIIIlII;
        final double lllllllllllllIIlIIllIIIlIlIIIlll = this.maxY - lllllllllllllIIlIIllIIIlIlIIllIl;
        final double lllllllllllllIIlIIllIIIlIlIIIllI = this.maxZ - lllllllllllllIIlIIllIIIlIlIIIIIl;
        return new AxisAlignedBB(lllllllllllllIIlIIllIIIlIlIIlIll, lllllllllllllIIlIIllIIIlIlIIlIlI, lllllllllllllIIlIIllIIIlIlIIlIIl, lllllllllllllIIlIIllIIIlIlIIlIII, lllllllllllllIIlIIllIIIlIlIIIlll, lllllllllllllIIlIIllIIIlIlIIIllI);
    }
    
    public AxisAlignedBB offset(final double lllllllllllllIIlIIllIIIllIIllIll, final double lllllllllllllIIlIIllIIIllIIllIlI, final double lllllllllllllIIlIIllIIIllIIllIIl) {
        return new AxisAlignedBB(this.minX + lllllllllllllIIlIIllIIIllIIllIll, this.minY + lllllllllllllIIlIIllIIIllIIllIlI, this.minZ + lllllllllllllIIlIIllIIIllIIllIIl, this.maxX + lllllllllllllIIlIIllIIIllIIllIll, this.maxY + lllllllllllllIIlIIllIIIllIIllIlI, this.maxZ + lllllllllllllIIlIIllIIIllIIllIIl);
    }
    
    private static int llIlllIlIIIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[1]]).append(this.minX).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[0]]).append(this.minY).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[2]]).append(this.minZ).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[3]]).append(this.maxX).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[4]]).append(this.maxY).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[5]]).append(this.maxZ).append(AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[6]]));
    }
    
    public AxisAlignedBB(final BlockPos lllllllllllllIIlIIllIIlIIIlIIIIl, final BlockPos lllllllllllllIIlIIllIIlIIIIlllIl) {
        this.minX = lllllllllllllIIlIIllIIlIIIlIIIIl.getX();
        this.minY = lllllllllllllIIlIIllIIlIIIlIIIIl.getY();
        this.minZ = lllllllllllllIIlIIllIIlIIIlIIIIl.getZ();
        this.maxX = lllllllllllllIIlIIllIIlIIIIlllIl.getX();
        this.maxY = lllllllllllllIIlIIllIIlIIIIlllIl.getY();
        this.maxZ = lllllllllllllIIlIIllIIlIIIIlllIl.getZ();
    }
    
    private static boolean llIlllIIllllIIl(final int lllllllllllllIIlIIllIIIIlIlllIll) {
        return lllllllllllllIIlIIllIIIIlIlllIll > 0;
    }
    
    public double calculateYOffset(final AxisAlignedBB lllllllllllllIIlIIllIIIllIIIIllI, double lllllllllllllIIlIIllIIIllIIIIIII) {
        if (llIlllIIllllIIl(llIlllIIllllllI(lllllllllllllIIlIIllIIIllIIIIllI.maxX, this.minX)) && llIlllIIllllIII(llIlllIIlllllll(lllllllllllllIIlIIllIIIllIIIIllI.minX, this.maxX)) && llIlllIIllllIIl(llIlllIIllllllI(lllllllllllllIIlIIllIIIllIIIIllI.maxZ, this.minZ)) && llIlllIIllllIII(llIlllIIlllllll(lllllllllllllIIlIIllIIIllIIIIllI.minZ, this.maxZ))) {
            if (llIlllIIllllIIl(llIlllIIllllllI(lllllllllllllIIlIIllIIIllIIIIIII, 0.0)) && llIlllIIlllllII(llIlllIIlllllll(lllllllllllllIIlIIllIIIllIIIIllI.maxY, this.minY))) {
                final double lllllllllllllIIlIIllIIIllIIIIlII = this.minY - lllllllllllllIIlIIllIIIllIIIIllI.maxY;
                if (llIlllIIllllIII(llIlllIIlllllll(lllllllllllllIIlIIllIIIllIIIIlII, lllllllllllllIIlIIllIIIllIIIIIII))) {
                    lllllllllllllIIlIIllIIIllIIIIIII = lllllllllllllIIlIIllIIIllIIIIlII;
                    "".length();
                    if ((0xF ^ 0xA) == 0x0) {
                        return 0.0;
                    }
                }
            }
            else if (llIlllIIllllIII(llIlllIIlllllll(lllllllllllllIIlIIllIIIllIIIIIII, 0.0)) && llIlllIIlllllIl(llIlllIIllllllI(lllllllllllllIIlIIllIIIllIIIIllI.minY, this.maxY))) {
                final double lllllllllllllIIlIIllIIIllIIIIIll = this.maxY - lllllllllllllIIlIIllIIIllIIIIllI.minY;
                if (llIlllIIllllIIl(llIlllIIllllllI(lllllllllllllIIlIIllIIIllIIIIIll, lllllllllllllIIlIIllIIIllIIIIIII))) {
                    lllllllllllllIIlIIllIIIllIIIIIII = lllllllllllllIIlIIllIIIllIIIIIll;
                }
            }
            return lllllllllllllIIlIIllIIIllIIIIIII;
        }
        return lllllllllllllIIlIIllIIIllIIIIIII;
    }
    
    private static int llIlllIlIIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlllIIlllIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlllIIlllllIl(final int lllllllllllllIIlIIllIIIIllIIIIIl) {
        return lllllllllllllIIlIIllIIIIllIIIIIl >= 0;
    }
    
    private static int llIlllIIllllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String llIlllIIllIllIl(final String lllllllllllllIIlIIllIIIIlllIlllI, final String lllllllllllllIIlIIllIIIIlllIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIIIIllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllIIIIllllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllIIIIllllIIII.init(AxisAlignedBB.lIIllllIIIIlll[2], lllllllllllllIIlIIllIIIIllllIIIl);
            return new String(lllllllllllllIIlIIllIIIIllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIIIIlllIllll) {
            lllllllllllllIIlIIllIIIIlllIllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIlllIIllIlIll(final String lllllllllllllIIlIIllIIIIlllllIIl, final String lllllllllllllIIlIIllIIIIlllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIIIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIIIIlllllIlI.getBytes(StandardCharsets.UTF_8)), AxisAlignedBB.lIIllllIIIIlll[8]), "DES");
            final Cipher lllllllllllllIIlIIllIIIIllllllIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIllIIIIllllllIl.init(AxisAlignedBB.lIIllllIIIIlll[2], lllllllllllllIIlIIllIIIIlllllllI);
            return new String(lllllllllllllIIlIIllIIIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIIIIllllllII) {
            lllllllllllllIIlIIllIIIIllllllII.printStackTrace();
            return null;
        }
    }
    
    private static int llIlllIlIIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlllIlIIIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        llIlllIIlllIlIl();
        llIlllIIlllIIlI();
    }
    
    private static boolean llIlllIIlllllII(final int lllllllllllllIIlIIllIIIIlIllllIl) {
        return lllllllllllllIIlIIllIIIIlIllllIl <= 0;
    }
    
    public boolean intersectsWith(final AxisAlignedBB lllllllllllllIIlIIllIIIlIllIllII) {
        int n;
        if (llIlllIIllllIIl(llIlllIlIIIIIlI(lllllllllllllIIlIIllIIIlIllIllII.maxX, this.minX)) && llIlllIIllllIII(llIlllIlIIIIIll(lllllllllllllIIlIIllIIIlIllIllII.minX, this.maxX))) {
            if (llIlllIIllllIIl(llIlllIlIIIIIlI(lllllllllllllIIlIIllIIIlIllIllII.maxY, this.minY)) && llIlllIIllllIII(llIlllIlIIIIIll(lllllllllllllIIlIIllIIIlIllIllII.minY, this.maxY))) {
                if (llIlllIIllllIIl(llIlllIlIIIIIlI(lllllllllllllIIlIIllIIIlIllIllII.maxZ, this.minZ)) && llIlllIIllllIII(llIlllIlIIIIIll(lllllllllllllIIlIIllIIIlIllIllII.minZ, this.maxZ))) {
                    n = AxisAlignedBB.lIIllllIIIIlll[0];
                    "".length();
                    if ((0x26 ^ 0x23) <= 0) {
                        return ((0x21 ^ 0x6D) & ~(0x39 ^ 0x75)) != 0x0;
                    }
                }
                else {
                    n = AxisAlignedBB.lIIllllIIIIlll[1];
                    "".length();
                    if (null != null) {
                        return ((0xCB ^ 0x8C) & ~(0xF8 ^ 0xBF)) != 0x0;
                    }
                }
            }
            else {
                n = AxisAlignedBB.lIIllllIIIIlll[1];
                "".length();
                if ((0xD7 ^ 0x91 ^ (0xC5 ^ 0x87)) <= 0) {
                    return ((0x71 ^ 0x1 ^ (0x44 ^ 0x7C)) & (0x44 ^ 0x16 ^ (0x3 ^ 0x19) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = AxisAlignedBB.lIIllllIIIIlll[1];
        }
        return n != 0;
    }
    
    private static boolean llIlllIlIIIlIII(final Object lllllllllllllIIlIIllIIIIllIIlIll) {
        return lllllllllllllIIlIIllIIIIllIIlIll != null;
    }
    
    private static void llIlllIIlllIIlI() {
        (lIIllllIIIIlII = new String[AxisAlignedBB.lIIllllIIIIlll[7]])[AxisAlignedBB.lIIllllIIIIlll[1]] = llIlllIIllIlIll("DyeI0Ay6ADE=", "ENgcG");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[0]] = llIlllIIllIllIl("F0ObwdgJ/6s=", "oCcrm");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[2]] = llIlllIIllIllIl("UfwW1kP02Hk=", "HzFOo");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[3]] = llIlllIIllIllIl("tPO3B3ezobo=", "bYXYj");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[4]] = llIlllIIlllIIII("WEw=", "tlsmX");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[5]] = llIlllIIllIlIll("Li6HoM5fBMs=", "czusn");
        AxisAlignedBB.lIIllllIIIIlII[AxisAlignedBB.lIIllllIIIIlll[6]] = llIlllIIllIllIl("yjxOQXPDeJo=", "YRFSn");
    }
}
