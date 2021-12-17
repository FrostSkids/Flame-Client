// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

public class FastTrig
{
    private static int lllIIIlIlIIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static double cos(final double lllllllllllllIIIlllllIllIlllllIl) {
        return sin(lllllllllllllIIIlllllIllIlllllIl + 1.5707963267948966);
    }
    
    private static boolean lllIIIlIlIIlIll(final int lllllllllllllIIIlllllIllIllllIlI) {
        return lllllllllllllIIIlllllIllIllllIlI <= 0;
    }
    
    private static boolean lllIIIlIlIIlIIl(final int lllllllllllllIIIlllllIllIllllIII) {
        return lllllllllllllIIIlllllIllIllllIII > 0;
    }
    
    public static double sin(double lllllllllllllIIIlllllIllIlllllll) {
        lllllllllllllIIIlllllIllIlllllll = reduceSinAngle(lllllllllllllIIIlllllIllIlllllll);
        if (lllIIIlIlIIlIll(lllIIIlIlIIlIlI(Math.abs(lllllllllllllIIIlllllIllIlllllll), 0.7853981633974483))) {
            return Math.sin(lllllllllllllIIIlllllIllIlllllll);
        }
        return Math.cos(1.5707963267948966 - lllllllllllllIIIlllllIllIlllllll);
    }
    
    private static int lllIIIlIlIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static double reduceSinAngle(double lllllllllllllIIIlllllIlllIIIIlIl) {
        final double lllllllllllllIIIlllllIlllIIIIlII = lllllllllllllIIIlllllIlllIIIIlIl;
        lllllllllllllIIIlllllIlllIIIIlIl %= 6.283185307179586;
        if (lllIIIlIlIIlIIl(lllIIIlIlIIlIII(Math.abs(lllllllllllllIIIlllllIlllIIIIlIl), 3.141592653589793))) {
            lllllllllllllIIIlllllIlllIIIIlIl -= 6.283185307179586;
        }
        if (lllIIIlIlIIlIIl(lllIIIlIlIIlIII(Math.abs(lllllllllllllIIIlllllIlllIIIIlIl), 1.5707963267948966))) {
            lllllllllllllIIIlllllIlllIIIIlIl = 3.141592653589793 - lllllllllllllIIIlllllIlllIIIIlIl;
        }
        return lllllllllllllIIIlllllIlllIIIIlIl;
    }
}
