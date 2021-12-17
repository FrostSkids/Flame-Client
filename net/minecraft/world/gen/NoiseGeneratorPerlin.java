// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Random;

public class NoiseGeneratorPerlin extends NoiseGenerator
{
    private static final /* synthetic */ int[] llIlIlllllIIII;
    private /* synthetic */ int field_151602_b;
    private /* synthetic */ NoiseGeneratorSimplex[] field_151603_a;
    
    private static boolean lIIlIllIIIIIIllI(final int llllllllllllIllIlIIIlIlIlllllllI, final int llllllllllllIllIlIIIlIlIllllllIl) {
        return llllllllllllIllIlIIIlIlIlllllllI >= llllllllllllIllIlIIIlIlIllllllIl;
    }
    
    public double[] func_151600_a(double[] llllllllllllIllIlIIIlIllIIIIllII, final double llllllllllllIllIlIIIlIllIIIllIIl, final double llllllllllllIllIlIIIlIllIIIIlIlI, final int llllllllllllIllIlIIIlIllIIIIlIIl, final int llllllllllllIllIlIIIlIllIIIIlIII, final double llllllllllllIllIlIIIlIllIIIIIlll, final double llllllllllllIllIlIIIlIllIIIlIlII, final double llllllllllllIllIlIIIlIllIIIIIlIl, final double llllllllllllIllIlIIIlIllIIIIIlII) {
        if (lIIlIllIIIIIIlll(llllllllllllIllIlIIIlIllIIIIllII) && lIIlIllIIIIIIllI(llllllllllllIllIlIIIlIllIIIIllII.length, llllllllllllIllIlIIIlIllIIIIlIIl * llllllllllllIllIlIIIlIllIIIIlIII)) {
            int llllllllllllIllIlIIIlIllIIIlIIIl = NoiseGeneratorPerlin.llIlIlllllIIII[0];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
            while (!lIIlIllIIIIIIllI(llllllllllllIllIlIIIlIllIIIlIIIl, llllllllllllIllIlIIIlIllIIIIllII.length)) {
                llllllllllllIllIlIIIlIllIIIIllII[llllllllllllIllIlIIIlIllIIIlIIIl] = 0.0;
                ++llllllllllllIllIlIIIlIllIIIlIIIl;
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIllIlIIIlIllIIIIllII = new double[llllllllllllIllIlIIIlIllIIIIlIIl * llllllllllllIllIlIIIlIllIIIIlIII];
        }
        double llllllllllllIllIlIIIlIllIIIlIIII = 1.0;
        double llllllllllllIllIlIIIlIllIIIIllll = 1.0;
        int llllllllllllIllIlIIIlIllIIIIlllI = NoiseGeneratorPerlin.llIlIlllllIIII[0];
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!lIIlIllIIIIIIllI(llllllllllllIllIlIIIlIllIIIIlllI, this.field_151602_b)) {
            this.field_151603_a[llllllllllllIllIlIIIlIllIIIIlllI].func_151606_a((double[])llllllllllllIllIlIIIlIllIIIIllII, llllllllllllIllIlIIIlIllIIIllIIl, llllllllllllIllIlIIIlIllIIIIlIlI, llllllllllllIllIlIIIlIllIIIIlIIl, llllllllllllIllIlIIIlIllIIIIlIII, llllllllllllIllIlIIIlIllIIIIIlll * llllllllllllIllIlIIIlIllIIIIllll * llllllllllllIllIlIIIlIllIIIlIIII, llllllllllllIllIlIIIlIllIIIlIlII * llllllllllllIllIlIIIlIllIIIIllll * llllllllllllIllIlIIIlIllIIIlIIII, 0.55 / llllllllllllIllIlIIIlIllIIIlIIII);
            llllllllllllIllIlIIIlIllIIIIllll *= llllllllllllIllIlIIIlIllIIIIIlIl;
            llllllllllllIllIlIIIlIllIIIlIIII *= llllllllllllIllIlIIIlIllIIIIIlII;
            ++llllllllllllIllIlIIIlIllIIIIlllI;
        }
        return (double[])llllllllllllIllIlIIIlIllIIIIllII;
    }
    
    public double[] func_151599_a(final double[] llllllllllllIllIlIIIlIllIIllIIII, final double llllllllllllIllIlIIIlIllIIlIllll, final double llllllllllllIllIlIIIlIllIIllIlll, final int llllllllllllIllIlIIIlIllIIllIllI, final int llllllllllllIllIlIIIlIllIIllIlIl, final double llllllllllllIllIlIIIlIllIIllIlII, final double llllllllllllIllIlIIIlIllIIllIIll, final double llllllllllllIllIlIIIlIllIIllIIlI) {
        return this.func_151600_a(llllllllllllIllIlIIIlIllIIllIIII, llllllllllllIllIlIIIlIllIIlIllll, llllllllllllIllIlIIIlIllIIllIlll, llllllllllllIllIlIIIlIllIIllIllI, llllllllllllIllIlIIIlIllIIllIlIl, llllllllllllIllIlIIIlIllIIllIlII, llllllllllllIllIlIIIlIllIIllIIll, llllllllllllIllIlIIIlIllIIllIIlI, 0.5);
    }
    
    public NoiseGeneratorPerlin(final Random llllllllllllIllIlIIIlIllIlIllIII, final int llllllllllllIllIlIIIlIllIlIllIll) {
        this.field_151602_b = llllllllllllIllIlIIIlIllIlIllIll;
        this.field_151603_a = new NoiseGeneratorSimplex[llllllllllllIllIlIIIlIllIlIllIll];
        int llllllllllllIllIlIIIlIllIlIllIlI = NoiseGeneratorPerlin.llIlIlllllIIII[0];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIlIllIIIIIIllI(llllllllllllIllIlIIIlIllIlIllIlI, llllllllllllIllIlIIIlIllIlIllIll)) {
            this.field_151603_a[llllllllllllIllIlIIIlIllIlIllIlI] = new NoiseGeneratorSimplex(llllllllllllIllIlIIIlIllIlIllIII);
            ++llllllllllllIllIlIIIlIllIlIllIlI;
        }
    }
    
    private static void lIIlIllIIIIIIlIl() {
        (llIlIlllllIIII = new int[1])[0] = ((0x49 ^ 0x4D) & ~(0xC4 ^ 0xC0));
    }
    
    static {
        lIIlIllIIIIIIlIl();
    }
    
    public double func_151601_a(final double llllllllllllIllIlIIIlIllIlIIlllI, final double llllllllllllIllIlIIIlIllIlIIllIl) {
        double llllllllllllIllIlIIIlIllIlIIllII = 0.0;
        double llllllllllllIllIlIIIlIllIlIIlIll = 1.0;
        int llllllllllllIllIlIIIlIllIlIIlIlI = NoiseGeneratorPerlin.llIlIlllllIIII[0];
        "".length();
        if ("   ".length() != "   ".length()) {
            return 0.0;
        }
        while (!lIIlIllIIIIIIllI(llllllllllllIllIlIIIlIllIlIIlIlI, this.field_151602_b)) {
            llllllllllllIllIlIIIlIllIlIIllII += this.field_151603_a[llllllllllllIllIlIIIlIllIlIIlIlI].func_151605_a(llllllllllllIllIlIIIlIllIlIIlllI * llllllllllllIllIlIIIlIllIlIIlIll, llllllllllllIllIlIIIlIllIlIIllIl * llllllllllllIllIlIIIlIllIlIIlIll) / llllllllllllIllIlIIIlIllIlIIlIll;
            llllllllllllIllIlIIIlIllIlIIlIll /= 2.0;
            ++llllllllllllIllIlIIIlIllIlIIlIlI;
        }
        return llllllllllllIllIlIIIlIllIlIIllII;
    }
    
    private static boolean lIIlIllIIIIIIlll(final Object llllllllllllIllIlIIIlIlIlllllIll) {
        return llllllllllllIllIlIIIlIlIlllllIll != null;
    }
}
