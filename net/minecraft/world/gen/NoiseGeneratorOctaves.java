// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Random;
import net.minecraft.util.MathHelper;

public class NoiseGeneratorOctaves extends NoiseGenerator
{
    private /* synthetic */ NoiseGeneratorImproved[] generatorCollection;
    private static final /* synthetic */ int[] llIlIIlllIllIl;
    private /* synthetic */ int octaves;
    
    static {
        lIIlIIllIlIIIIII();
    }
    
    private static void lIIlIIllIlIIIIII() {
        (llIlIIlllIllIl = new int[3])[0] = ((0xB1 ^ 0x83) & ~(0xB4 ^ 0x86));
        NoiseGeneratorOctaves.llIlIIlllIllIl[1] = (0x53 ^ 0x59);
        NoiseGeneratorOctaves.llIlIIlllIllIl[2] = " ".length();
    }
    
    public double[] generateNoiseOctaves(double[] llllllllllllIllIlIllIlllllIllIIl, final int llllllllllllIllIlIllIlllllIllIII, final int llllllllllllIllIlIllIlllllIlIlll, final int llllllllllllIllIlIllIlllllIlIllI, final int llllllllllllIllIlIllIlllllIlIlIl, final int llllllllllllIllIlIllIlllllIlIlII, final int llllllllllllIllIlIllIlllllIlIIll, final double llllllllllllIllIlIllIllllllIIlIl, final double llllllllllllIllIlIllIllllllIIlII, final double llllllllllllIllIlIllIllllllIIIll) {
        if (lIIlIIllIlIIIIlI(llllllllllllIllIlIllIlllllIllIIl)) {
            llllllllllllIllIlIllIlllllIllIIl = new double[llllllllllllIllIlIllIlllllIlIlIl * llllllllllllIllIlIllIlllllIlIlII * llllllllllllIllIlIllIlllllIlIIll];
            "".length();
            if (((0x5 ^ 0x1D) & ~(0x21 ^ 0x39)) > 0) {
                return null;
            }
        }
        else {
            int llllllllllllIllIlIllIllllllIIIlI = NoiseGeneratorOctaves.llIlIIlllIllIl[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
            while (!lIIlIIllIlIIIIIl(llllllllllllIllIlIllIllllllIIIlI, llllllllllllIllIlIllIlllllIllIIl.length)) {
                llllllllllllIllIlIllIlllllIllIIl[llllllllllllIllIlIllIllllllIIIlI] = 0.0;
                ++llllllllllllIllIlIllIllllllIIIlI;
            }
        }
        double llllllllllllIllIlIllIllllllIIIIl = 1.0;
        int llllllllllllIllIlIllIllllllIIIII = NoiseGeneratorOctaves.llIlIIlllIllIl[0];
        "".length();
        if (" ".length() < " ".length()) {
            return null;
        }
        while (!lIIlIIllIlIIIIIl(llllllllllllIllIlIllIllllllIIIII, this.octaves)) {
            double llllllllllllIllIlIllIlllllIlllll = llllllllllllIllIlIllIlllllIllIII * llllllllllllIllIlIllIllllllIIIIl * llllllllllllIllIlIllIllllllIIlIl;
            final double llllllllllllIllIlIllIlllllIllllI = llllllllllllIllIlIllIlllllIlIlll * llllllllllllIllIlIllIllllllIIIIl * llllllllllllIllIlIllIllllllIIlII;
            double llllllllllllIllIlIllIlllllIlllIl = llllllllllllIllIlIllIlllllIlIllI * llllllllllllIllIlIllIllllllIIIIl * llllllllllllIllIlIllIllllllIIIll;
            long llllllllllllIllIlIllIlllllIlllII = MathHelper.floor_double_long(llllllllllllIllIlIllIlllllIlllll);
            long llllllllllllIllIlIllIlllllIllIll = MathHelper.floor_double_long(llllllllllllIllIlIllIlllllIlllIl);
            llllllllllllIllIlIllIlllllIlllll -= llllllllllllIllIlIllIlllllIlllII;
            llllllllllllIllIlIllIlllllIlllIl -= llllllllllllIllIlIllIlllllIllIll;
            llllllllllllIllIlIllIlllllIlllII %= 16777216L;
            llllllllllllIllIlIllIlllllIllIll %= 16777216L;
            llllllllllllIllIlIllIlllllIlllll += llllllllllllIllIlIllIlllllIlllII;
            llllllllllllIllIlIllIlllllIlllIl += llllllllllllIllIlIllIlllllIllIll;
            this.generatorCollection[llllllllllllIllIlIllIllllllIIIII].populateNoiseArray((double[])llllllllllllIllIlIllIlllllIllIIl, llllllllllllIllIlIllIlllllIlllll, llllllllllllIllIlIllIlllllIllllI, llllllllllllIllIlIllIlllllIlllIl, llllllllllllIllIlIllIlllllIlIlIl, llllllllllllIllIlIllIlllllIlIlII, llllllllllllIllIlIllIlllllIlIIll, llllllllllllIllIlIllIllllllIIlIl * llllllllllllIllIlIllIllllllIIIIl, llllllllllllIllIlIllIllllllIIlII * llllllllllllIllIlIllIllllllIIIIl, llllllllllllIllIlIllIllllllIIIll * llllllllllllIllIlIllIllllllIIIIl, llllllllllllIllIlIllIllllllIIIIl);
            llllllllllllIllIlIllIllllllIIIIl /= 2.0;
            ++llllllllllllIllIlIllIllllllIIIII;
        }
        return (double[])llllllllllllIllIlIllIlllllIllIIl;
    }
    
    private static boolean lIIlIIllIlIIIIIl(final int llllllllllllIllIlIllIllllIlIllIl, final int llllllllllllIllIlIllIllllIlIllII) {
        return llllllllllllIllIlIllIllllIlIllIl >= llllllllllllIllIlIllIllllIlIllII;
    }
    
    private static boolean lIIlIIllIlIIIIlI(final Object llllllllllllIllIlIllIllllIlIlIlI) {
        return llllllllllllIllIlIllIllllIlIlIlI == null;
    }
    
    public NoiseGeneratorOctaves(final Random llllllllllllIllIlIlllIIIIIIIIllI, final int llllllllllllIllIlIlllIIIIIIIIIIl) {
        this.octaves = llllllllllllIllIlIlllIIIIIIIIIIl;
        this.generatorCollection = new NoiseGeneratorImproved[llllllllllllIllIlIlllIIIIIIIIIIl];
        int llllllllllllIllIlIlllIIIIIIIIlII = NoiseGeneratorOctaves.llIlIIlllIllIl[0];
        "".length();
        if (((0x2C ^ 0x17 ^ (0x50 ^ 0x2B)) & (0x3E ^ 0x6A ^ (0x67 ^ 0x73) ^ -" ".length())) <= -" ".length()) {
            throw null;
        }
        while (!lIIlIIllIlIIIIIl(llllllllllllIllIlIlllIIIIIIIIlII, llllllllllllIllIlIlllIIIIIIIIIIl)) {
            this.generatorCollection[llllllllllllIllIlIlllIIIIIIIIlII] = new NoiseGeneratorImproved(llllllllllllIllIlIlllIIIIIIIIllI);
            ++llllllllllllIllIlIlllIIIIIIIIlII;
        }
    }
    
    public double[] generateNoiseOctaves(final double[] llllllllllllIllIlIllIllllIllllll, final int llllllllllllIllIlIllIllllIlllllI, final int llllllllllllIllIlIllIllllIllIlII, final int llllllllllllIllIlIllIllllIllllII, final int llllllllllllIllIlIllIllllIllIIlI, final double llllllllllllIllIlIllIllllIllIIIl, final double llllllllllllIllIlIllIllllIlllIIl, final double llllllllllllIllIlIllIllllIlllIII) {
        return this.generateNoiseOctaves(llllllllllllIllIlIllIllllIllllll, llllllllllllIllIlIllIllllIlllllI, NoiseGeneratorOctaves.llIlIIlllIllIl[1], llllllllllllIllIlIllIllllIllIlII, llllllllllllIllIlIllIllllIllllII, NoiseGeneratorOctaves.llIlIIlllIllIl[2], llllllllllllIllIlIllIllllIllIIlI, llllllllllllIllIlIllIllllIllIIIl, 1.0, llllllllllllIllIlIllIllllIlllIIl);
    }
}
