// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Random;

public class NoiseGeneratorImproved extends NoiseGenerator
{
    private static final /* synthetic */ double[] field_152383_g;
    private /* synthetic */ int[] permutations;
    public /* synthetic */ double xCoord;
    private static final /* synthetic */ int[] llllIlIlIIIll;
    private static final /* synthetic */ double[] field_152384_h;
    public /* synthetic */ double yCoord;
    private static final /* synthetic */ double[] field_152385_i;
    public /* synthetic */ double zCoord;
    private static final /* synthetic */ double[] field_152381_e;
    private static final /* synthetic */ double[] field_152382_f;
    
    private static void lIlIlIlIIllIIll() {
        (llllIlIlIIIll = new int[21])[0] = (94 + 136 - 120 + 70 ^ 17 + 41 + 90 + 16);
        NoiseGeneratorImproved.llllIlIlIIIll[1] = ((0xAE ^ 0xA3) & ~(0x78 ^ 0x75));
        NoiseGeneratorImproved.llllIlIlIIIll[2] = " ".length();
        NoiseGeneratorImproved.llllIlIlIIIll[3] = "  ".length();
        NoiseGeneratorImproved.llllIlIlIIIll[4] = "   ".length();
        NoiseGeneratorImproved.llllIlIlIIIll[5] = (0x6E ^ 0x6A);
        NoiseGeneratorImproved.llllIlIlIIIll[6] = (0x16 ^ 0x13);
        NoiseGeneratorImproved.llllIlIlIIIll[7] = (0x1A ^ 0x1C);
        NoiseGeneratorImproved.llllIlIlIIIll[8] = (25 + 29 + 99 + 23 ^ 127 + 61 - 12 + 7);
        NoiseGeneratorImproved.llllIlIlIIIll[9] = (0x24 ^ 0x5F ^ (0x4D ^ 0x3E));
        NoiseGeneratorImproved.llllIlIlIIIll[10] = (0x5C ^ 0x55);
        NoiseGeneratorImproved.llllIlIlIIIll[11] = (0x6C ^ 0x66);
        NoiseGeneratorImproved.llllIlIlIIIll[12] = (0x7 ^ 0x36 ^ (0x23 ^ 0x19));
        NoiseGeneratorImproved.llllIlIlIIIll[13] = (0x3A ^ 0x36);
        NoiseGeneratorImproved.llllIlIlIIIll[14] = (0x8D ^ 0xB1 ^ (0x7B ^ 0x4A));
        NoiseGeneratorImproved.llllIlIlIIIll[15] = (0xA9 ^ 0xA7);
        NoiseGeneratorImproved.llllIlIlIIIll[16] = (0x87 ^ 0x88);
        NoiseGeneratorImproved.llllIlIlIIIll[17] = (0xFFFFF7D3 & 0xA2C);
        NoiseGeneratorImproved.llllIlIlIIIll[18] = (0xFFFFCD9A & 0x3365);
        NoiseGeneratorImproved.llllIlIlIIIll[19] = 162 + 132 - 72 + 33;
        NoiseGeneratorImproved.llllIlIlIIIll[20] = -" ".length();
    }
    
    public NoiseGeneratorImproved(final Random lllllllllllllIlIllIllIIlllllIllI) {
        this.permutations = new int[NoiseGeneratorImproved.llllIlIlIIIll[17]];
        this.xCoord = lllllllllllllIlIllIllIIlllllIllI.nextDouble() * 256.0;
        this.yCoord = lllllllllllllIlIllIllIIlllllIllI.nextDouble() * 256.0;
        this.zCoord = lllllllllllllIlIllIllIIlllllIllI.nextDouble() * 256.0;
        int lllllllllllllIlIllIllIIlllllIlIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
        "".length();
        if ((("   ".length() ^ (0x64 ^ 0x7B)) & (216 + 132 - 155 + 24 ^ 66 + 194 - 245 + 182 ^ -" ".length())) > ("  ".length() ^ (0x19 ^ 0x1F))) {
            throw null;
        }
        while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlllllIlIl, NoiseGeneratorImproved.llllIlIlIIIll[18])) {
            this.permutations[lllllllllllllIlIllIllIIlllllIlIl] = lllllllllllllIlIllIllIIlllllIlIl++;
        }
        int lllllllllllllIlIllIllIIlllllIlII = NoiseGeneratorImproved.llllIlIlIIIll[1];
        "".length();
        if (-" ".length() != -" ".length()) {
            throw null;
        }
        while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlllllIlII, NoiseGeneratorImproved.llllIlIlIIIll[18])) {
            final int lllllllllllllIlIllIllIIlllllIIll = lllllllllllllIlIllIllIIlllllIllI.nextInt(NoiseGeneratorImproved.llllIlIlIIIll[18] - lllllllllllllIlIllIllIIlllllIlII) + lllllllllllllIlIllIllIIlllllIlII;
            final int lllllllllllllIlIllIllIIlllllIIlI = this.permutations[lllllllllllllIlIllIllIIlllllIlII];
            this.permutations[lllllllllllllIlIllIllIIlllllIlII] = this.permutations[lllllllllllllIlIllIllIIlllllIIll];
            this.permutations[lllllllllllllIlIllIllIIlllllIIll] = lllllllllllllIlIllIllIIlllllIIlI;
            this.permutations[lllllllllllllIlIllIllIIlllllIlII + NoiseGeneratorImproved.llllIlIlIIIll[18]] = this.permutations[lllllllllllllIlIllIllIIlllllIlII];
            ++lllllllllllllIlIllIllIIlllllIlII;
        }
    }
    
    public void populateNoiseArray(final double[] lllllllllllllIlIllIllIIlIlIlIIll, final double lllllllllllllIlIllIllIIllIIlIIll, final double lllllllllllllIlIllIllIIlIlIlIIIl, final double lllllllllllllIlIllIllIIlIlIlIIII, final int lllllllllllllIlIllIllIIlIlIIllll, final int lllllllllllllIlIllIllIIllIIIllll, final int lllllllllllllIlIllIllIIllIIIlllI, final double lllllllllllllIlIllIllIIllIIIllIl, final double lllllllllllllIlIllIllIIlIlIIlIll, final double lllllllllllllIlIllIllIIlIlIIlIlI, final double lllllllllllllIlIllIllIIlIlIIlIIl) {
        if (lIlIlIlIIllIllI(lllllllllllllIlIllIllIIllIIIllll, NoiseGeneratorImproved.llllIlIlIIIll[2])) {
            int lllllllllllllIlIllIllIIllIIIlIIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIllIIIlIII = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIllIIIIlll = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIllIIIIllI = NoiseGeneratorImproved.llllIlIlIIIll[1];
            double lllllllllllllIlIllIllIIllIIIIlIl = 0.0;
            double lllllllllllllIlIllIllIIllIIIIlII = 0.0;
            int lllllllllllllIlIllIllIIllIIIIIll = NoiseGeneratorImproved.llllIlIlIIIll[1];
            final double lllllllllllllIlIllIllIIllIIIIIlI = 1.0 / lllllllllllllIlIllIllIIlIlIIlIIl;
            int lllllllllllllIlIllIllIIllIIIIIIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIllIIIIIIl, lllllllllllllIlIllIllIIlIlIIllll)) {
                double lllllllllllllIlIllIllIIllIIIIIII = lllllllllllllIlIllIllIIllIIlIIll + lllllllllllllIlIllIllIIllIIIIIIl * lllllllllllllIlIllIllIIllIIIllIl + this.xCoord;
                int lllllllllllllIlIllIllIIlIlllllll = (int)lllllllllllllIlIllIllIIllIIIIIII;
                if (lIlIlIlIIllIlll(lIlIlIlIIllIlIl(lllllllllllllIlIllIllIIllIIIIIII, lllllllllllllIlIllIllIIlIlllllll))) {
                    --lllllllllllllIlIllIllIIlIlllllll;
                }
                final int lllllllllllllIlIllIllIIlIllllllI = lllllllllllllIlIllIllIIlIlllllll & NoiseGeneratorImproved.llllIlIlIIIll[19];
                lllllllllllllIlIllIllIIllIIIIIII -= lllllllllllllIlIllIllIIlIlllllll;
                final double lllllllllllllIlIllIllIIlIlllllIl = lllllllllllllIlIllIllIIllIIIIIII * lllllllllllllIlIllIllIIllIIIIIII * lllllllllllllIlIllIllIIllIIIIIII * (lllllllllllllIlIllIllIIllIIIIIII * (lllllllllllllIlIllIllIIllIIIIIII * 6.0 - 15.0) + 10.0);
                int lllllllllllllIlIllIllIIlIlllllII = NoiseGeneratorImproved.llllIlIlIIIll[1];
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
                while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlIlllllII, lllllllllllllIlIllIllIIllIIIlllI)) {
                    double lllllllllllllIlIllIllIIlIllllIll = lllllllllllllIlIllIllIIlIlIlIIII + lllllllllllllIlIllIllIIlIlllllII * lllllllllllllIlIllIllIIlIlIIlIlI + this.zCoord;
                    int lllllllllllllIlIllIllIIlIllllIlI = (int)lllllllllllllIlIllIllIIlIllllIll;
                    if (lIlIlIlIIllIlll(lIlIlIlIIllIlIl(lllllllllllllIlIllIllIIlIllllIll, lllllllllllllIlIllIllIIlIllllIlI))) {
                        --lllllllllllllIlIllIllIIlIllllIlI;
                    }
                    final int lllllllllllllIlIllIllIIlIllllIIl = lllllllllllllIlIllIllIIlIllllIlI & NoiseGeneratorImproved.llllIlIlIIIll[19];
                    lllllllllllllIlIllIllIIlIllllIll -= lllllllllllllIlIllIllIIlIllllIlI;
                    final double lllllllllllllIlIllIllIIlIllllIII = lllllllllllllIlIllIllIIlIllllIll * lllllllllllllIlIllIllIIlIllllIll * lllllllllllllIlIllIllIIlIllllIll * (lllllllllllllIlIllIllIIlIllllIll * (lllllllllllllIlIllIllIIlIllllIll * 6.0 - 15.0) + 10.0);
                    lllllllllllllIlIllIllIIllIIIlIIl = this.permutations[lllllllllllllIlIllIllIIlIllllllI] + NoiseGeneratorImproved.llllIlIlIIIll[1];
                    lllllllllllllIlIllIllIIllIIIlIII = this.permutations[lllllllllllllIlIllIllIIllIIIlIIl] + lllllllllllllIlIllIllIIlIllllIIl;
                    lllllllllllllIlIllIllIIllIIIIlll = this.permutations[lllllllllllllIlIllIllIIlIllllllI + NoiseGeneratorImproved.llllIlIlIIIll[2]] + NoiseGeneratorImproved.llllIlIlIIIll[1];
                    lllllllllllllIlIllIllIIllIIIIllI = this.permutations[lllllllllllllIlIllIllIIllIIIIlll] + lllllllllllllIlIllIllIIlIllllIIl;
                    lllllllllllllIlIllIllIIllIIIIlIl = this.lerp(lllllllllllllIlIllIllIIlIlllllIl, this.func_76309_a(this.permutations[lllllllllllllIlIllIllIIllIIIlIII], lllllllllllllIlIllIllIIllIIIIIII, lllllllllllllIlIllIllIIlIllllIll), this.grad(this.permutations[lllllllllllllIlIllIllIIllIIIIllI], lllllllllllllIlIllIllIIllIIIIIII - 1.0, 0.0, lllllllllllllIlIllIllIIlIllllIll));
                    lllllllllllllIlIllIllIIllIIIIlII = this.lerp(lllllllllllllIlIllIllIIlIlllllIl, this.grad(this.permutations[lllllllllllllIlIllIllIIllIIIlIII + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIllIIIIIII, 0.0, lllllllllllllIlIllIllIIlIllllIll - 1.0), this.grad(this.permutations[lllllllllllllIlIllIllIIllIIIIllI + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIllIIIIIII - 1.0, 0.0, lllllllllllllIlIllIllIIlIllllIll - 1.0));
                    final double lllllllllllllIlIllIllIIlIlllIlll = this.lerp(lllllllllllllIlIllIllIIlIllllIII, lllllllllllllIlIllIllIIllIIIIlIl, lllllllllllllIlIllIllIIllIIIIlII);
                    final int n;
                    final int lllllllllllllIlIllIllIIlIlllIllI = n = lllllllllllllIlIllIllIIllIIIIIll++;
                    lllllllllllllIlIllIllIIlIlIlIIll[n] += lllllllllllllIlIllIllIIlIlllIlll * lllllllllllllIlIllIllIIllIIIIIlI;
                    ++lllllllllllllIlIllIllIIlIlllllII;
                }
                ++lllllllllllllIlIllIllIIllIIIIIIl;
            }
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            int lllllllllllllIlIllIllIIlIlllIlIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
            final double lllllllllllllIlIllIllIIlIlllIlII = 1.0 / lllllllllllllIlIllIllIIlIlIIlIIl;
            int lllllllllllllIlIllIllIIlIlllIIll = NoiseGeneratorImproved.llllIlIlIIIll[20];
            int lllllllllllllIlIllIllIIlIlllIIlI = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIlIlllIIIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIlIlllIIII = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIlIllIllll = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIlIllIlllI = NoiseGeneratorImproved.llllIlIlIIIll[1];
            int lllllllllllllIlIllIllIIlIllIllIl = NoiseGeneratorImproved.llllIlIlIIIll[1];
            double lllllllllllllIlIllIllIIlIllIllII = 0.0;
            double lllllllllllllIlIllIllIIlIllIlIll = 0.0;
            double lllllllllllllIlIllIllIIlIllIlIlI = 0.0;
            double lllllllllllllIlIllIllIIlIllIlIIl = 0.0;
            int lllllllllllllIlIllIllIIlIllIlIII = NoiseGeneratorImproved.llllIlIlIIIll[1];
            "".length();
            if ((0xA6 ^ 0xA2) <= " ".length()) {
                return;
            }
            while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlIllIlIII, lllllllllllllIlIllIllIIlIlIIllll)) {
                double lllllllllllllIlIllIllIIlIllIIlll = lllllllllllllIlIllIllIIllIIlIIll + lllllllllllllIlIllIllIIlIllIlIII * lllllllllllllIlIllIllIIllIIIllIl + this.xCoord;
                int lllllllllllllIlIllIllIIlIllIIllI = (int)lllllllllllllIlIllIllIIlIllIIlll;
                if (lIlIlIlIIllIlll(lIlIlIlIIllIlIl(lllllllllllllIlIllIllIIlIllIIlll, lllllllllllllIlIllIllIIlIllIIllI))) {
                    --lllllllllllllIlIllIllIIlIllIIllI;
                }
                final int lllllllllllllIlIllIllIIlIllIIlIl = lllllllllllllIlIllIllIIlIllIIllI & NoiseGeneratorImproved.llllIlIlIIIll[19];
                lllllllllllllIlIllIllIIlIllIIlll -= lllllllllllllIlIllIllIIlIllIIllI;
                final double lllllllllllllIlIllIllIIlIllIIlII = lllllllllllllIlIllIllIIlIllIIlll * lllllllllllllIlIllIllIIlIllIIlll * lllllllllllllIlIllIllIIlIllIIlll * (lllllllllllllIlIllIllIIlIllIIlll * (lllllllllllllIlIllIllIIlIllIIlll * 6.0 - 15.0) + 10.0);
                int lllllllllllllIlIllIllIIlIllIIIll = NoiseGeneratorImproved.llllIlIlIIIll[1];
                "".length();
                if (((0x5F ^ 0x4F) & ~(0xA8 ^ 0xB8)) != 0x0) {
                    return;
                }
                while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlIllIIIll, lllllllllllllIlIllIllIIllIIIlllI)) {
                    double lllllllllllllIlIllIllIIlIllIIIlI = lllllllllllllIlIllIllIIlIlIlIIII + lllllllllllllIlIllIllIIlIllIIIll * lllllllllllllIlIllIllIIlIlIIlIlI + this.zCoord;
                    int lllllllllllllIlIllIllIIlIllIIIIl = (int)lllllllllllllIlIllIllIIlIllIIIlI;
                    if (lIlIlIlIIllIlll(lIlIlIlIIllIlIl(lllllllllllllIlIllIllIIlIllIIIlI, lllllllllllllIlIllIllIIlIllIIIIl))) {
                        --lllllllllllllIlIllIllIIlIllIIIIl;
                    }
                    final int lllllllllllllIlIllIllIIlIllIIIII = lllllllllllllIlIllIllIIlIllIIIIl & NoiseGeneratorImproved.llllIlIlIIIll[19];
                    lllllllllllllIlIllIllIIlIllIIIlI -= lllllllllllllIlIllIllIIlIllIIIIl;
                    final double lllllllllllllIlIllIllIIlIlIlllll = lllllllllllllIlIllIllIIlIllIIIlI * lllllllllllllIlIllIllIIlIllIIIlI * lllllllllllllIlIllIllIIlIllIIIlI * (lllllllllllllIlIllIllIIlIllIIIlI * (lllllllllllllIlIllIllIIlIllIIIlI * 6.0 - 15.0) + 10.0);
                    int lllllllllllllIlIllIllIIlIlIllllI = NoiseGeneratorImproved.llllIlIlIIIll[1];
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    while (!lIlIlIlIIllIlII(lllllllllllllIlIllIllIIlIlIllllI, lllllllllllllIlIllIllIIllIIIllll)) {
                        double lllllllllllllIlIllIllIIlIlIlllIl = lllllllllllllIlIllIllIIlIlIlIIIl + lllllllllllllIlIllIllIIlIlIllllI * lllllllllllllIlIllIllIIlIlIIlIll + this.yCoord;
                        int lllllllllllllIlIllIllIIlIlIlllII = (int)lllllllllllllIlIllIllIIlIlIlllIl;
                        if (lIlIlIlIIllIlll(lIlIlIlIIllIlIl(lllllllllllllIlIllIllIIlIlIlllIl, lllllllllllllIlIllIllIIlIlIlllII))) {
                            --lllllllllllllIlIllIllIIlIlIlllII;
                        }
                        final int lllllllllllllIlIllIllIIlIlIllIll = lllllllllllllIlIllIllIIlIlIlllII & NoiseGeneratorImproved.llllIlIlIIIll[19];
                        lllllllllllllIlIllIllIIlIlIlllIl -= lllllllllllllIlIllIllIIlIlIlllII;
                        final double lllllllllllllIlIllIllIIlIlIllIlI = lllllllllllllIlIllIllIIlIlIlllIl * lllllllllllllIlIllIllIIlIlIlllIl * lllllllllllllIlIllIllIIlIlIlllIl * (lllllllllllllIlIllIllIIlIlIlllIl * (lllllllllllllIlIllIllIIlIlIlllIl * 6.0 - 15.0) + 10.0);
                        if (!lIlIlIlIIlllIII(lllllllllllllIlIllIllIIlIlIllllI) || lIlIlIlIIlllIIl(lllllllllllllIlIllIllIIlIlIllIll, lllllllllllllIlIllIllIIlIlllIIll)) {
                            lllllllllllllIlIllIllIIlIlllIIll = lllllllllllllIlIllIllIIlIlIllIll;
                            lllllllllllllIlIllIllIIlIlllIIlI = this.permutations[lllllllllllllIlIllIllIIlIllIIlIl] + lllllllllllllIlIllIllIIlIlIllIll;
                            lllllllllllllIlIllIllIIlIlllIIIl = this.permutations[lllllllllllllIlIllIllIIlIlllIIlI] + lllllllllllllIlIllIllIIlIllIIIII;
                            lllllllllllllIlIllIllIIlIlllIIII = this.permutations[lllllllllllllIlIllIllIIlIlllIIlI + NoiseGeneratorImproved.llllIlIlIIIll[2]] + lllllllllllllIlIllIllIIlIllIIIII;
                            lllllllllllllIlIllIllIIlIllIllll = this.permutations[lllllllllllllIlIllIllIIlIllIIlIl + NoiseGeneratorImproved.llllIlIlIIIll[2]] + lllllllllllllIlIllIllIIlIlIllIll;
                            lllllllllllllIlIllIllIIlIllIlllI = this.permutations[lllllllllllllIlIllIllIIlIllIllll] + lllllllllllllIlIllIllIIlIllIIIII;
                            lllllllllllllIlIllIllIIlIllIllIl = this.permutations[lllllllllllllIlIllIllIIlIllIllll + NoiseGeneratorImproved.llllIlIlIIIll[2]] + lllllllllllllIlIllIllIIlIllIIIII;
                            lllllllllllllIlIllIllIIlIllIllII = this.lerp(lllllllllllllIlIllIllIIlIllIIlII, this.grad(this.permutations[lllllllllllllIlIllIllIIlIlllIIIl], lllllllllllllIlIllIllIIlIllIIlll, lllllllllllllIlIllIllIIlIlIlllIl, lllllllllllllIlIllIllIIlIllIIIlI), this.grad(this.permutations[lllllllllllllIlIllIllIIlIllIlllI], lllllllllllllIlIllIllIIlIllIIlll - 1.0, lllllllllllllIlIllIllIIlIlIlllIl, lllllllllllllIlIllIllIIlIllIIIlI));
                            lllllllllllllIlIllIllIIlIllIlIll = this.lerp(lllllllllllllIlIllIllIIlIllIIlII, this.grad(this.permutations[lllllllllllllIlIllIllIIlIlllIIII], lllllllllllllIlIllIllIIlIllIIlll, lllllllllllllIlIllIllIIlIlIlllIl - 1.0, lllllllllllllIlIllIllIIlIllIIIlI), this.grad(this.permutations[lllllllllllllIlIllIllIIlIllIllIl], lllllllllllllIlIllIllIIlIllIIlll - 1.0, lllllllllllllIlIllIllIIlIlIlllIl - 1.0, lllllllllllllIlIllIllIIlIllIIIlI));
                            lllllllllllllIlIllIllIIlIllIlIlI = this.lerp(lllllllllllllIlIllIllIIlIllIIlII, this.grad(this.permutations[lllllllllllllIlIllIllIIlIlllIIIl + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIlIllIIlll, lllllllllllllIlIllIllIIlIlIlllIl, lllllllllllllIlIllIllIIlIllIIIlI - 1.0), this.grad(this.permutations[lllllllllllllIlIllIllIIlIllIlllI + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIlIllIIlll - 1.0, lllllllllllllIlIllIllIIlIlIlllIl, lllllllllllllIlIllIllIIlIllIIIlI - 1.0));
                            lllllllllllllIlIllIllIIlIllIlIIl = this.lerp(lllllllllllllIlIllIllIIlIllIIlII, this.grad(this.permutations[lllllllllllllIlIllIllIIlIlllIIII + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIlIllIIlll, lllllllllllllIlIllIllIIlIlIlllIl - 1.0, lllllllllllllIlIllIllIIlIllIIIlI - 1.0), this.grad(this.permutations[lllllllllllllIlIllIllIIlIllIllIl + NoiseGeneratorImproved.llllIlIlIIIll[2]], lllllllllllllIlIllIllIIlIllIIlll - 1.0, lllllllllllllIlIllIllIIlIlIlllIl - 1.0, lllllllllllllIlIllIllIIlIllIIIlI - 1.0));
                        }
                        final double lllllllllllllIlIllIllIIlIlIllIIl = this.lerp(lllllllllllllIlIllIllIIlIlIllIlI, lllllllllllllIlIllIllIIlIllIllII, lllllllllllllIlIllIllIIlIllIlIll);
                        final double lllllllllllllIlIllIllIIlIlIllIII = this.lerp(lllllllllllllIlIllIllIIlIlIllIlI, lllllllllllllIlIllIllIIlIllIlIlI, lllllllllllllIlIllIllIIlIllIlIIl);
                        final double lllllllllllllIlIllIllIIlIlIlIlll = this.lerp(lllllllllllllIlIllIllIIlIlIlllll, lllllllllllllIlIllIllIIlIlIllIIl, lllllllllllllIlIllIllIIlIlIllIII);
                        final int n2;
                        final int lllllllllllllIlIllIllIIlIlIlIllI = n2 = lllllllllllllIlIllIllIIlIlllIlIl++;
                        lllllllllllllIlIllIllIIlIlIlIIll[n2] += lllllllllllllIlIllIllIIlIlIlIlll * lllllllllllllIlIllIllIIlIlllIlII;
                        ++lllllllllllllIlIllIllIIlIlIllllI;
                    }
                    ++lllllllllllllIlIllIllIIlIllIIIll;
                }
                ++lllllllllllllIlIllIllIIlIllIlIII;
            }
        }
    }
    
    public NoiseGeneratorImproved() {
        this(new Random());
    }
    
    public final double lerp(final double lllllllllllllIlIllIllIIllllIIlIl, final double lllllllllllllIlIllIllIIllllIIlII, final double lllllllllllllIlIllIllIIllllIIIll) {
        return lllllllllllllIlIllIllIIllllIIlII + lllllllllllllIlIllIllIIllllIIlIl * (lllllllllllllIlIllIllIIllllIIIll - lllllllllllllIlIllIllIIllllIIlII);
    }
    
    public final double func_76309_a(final int lllllllllllllIlIllIllIIlllIlllIl, final double lllllllllllllIlIllIllIIlllIlllII, final double lllllllllllllIlIllIllIIlllIllIll) {
        final int lllllllllllllIlIllIllIIlllIllIlI = lllllllllllllIlIllIllIIlllIlllIl & NoiseGeneratorImproved.llllIlIlIIIll[16];
        return NoiseGeneratorImproved.field_152384_h[lllllllllllllIlIllIllIIlllIllIlI] * lllllllllllllIlIllIllIIlllIlllII + NoiseGeneratorImproved.field_152385_i[lllllllllllllIlIllIllIIlllIllIlI] * lllllllllllllIlIllIllIIlllIllIll;
    }
    
    private static boolean lIlIlIlIIlllIIl(final int lllllllllllllIlIllIllIIlIIIlIlll, final int lllllllllllllIlIllIllIIlIIIlIllI) {
        return lllllllllllllIlIllIllIIlIIIlIlll != lllllllllllllIlIllIllIIlIIIlIllI;
    }
    
    private static int lIlIlIlIIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        lIlIlIlIIllIIll();
        final double[] field_152381_e2 = new double[NoiseGeneratorImproved.llllIlIlIIIll[0]];
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[1]] = 1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[2]] = -1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[3]] = 1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[4]] = -1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[5]] = 1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[6]] = -1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[7]] = 1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[8]] = -1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[9]] = 0.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[10]] = 0.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[11]] = 0.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[12]] = 0.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[13]] = 1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[14]] = 0.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[15]] = -1.0;
        field_152381_e2[NoiseGeneratorImproved.llllIlIlIIIll[16]] = 0.0;
        field_152381_e = field_152381_e2;
        final double[] field_152382_f2 = new double[NoiseGeneratorImproved.llllIlIlIIIll[0]];
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[1]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[2]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[3]] = -1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[4]] = -1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[5]] = 0.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[6]] = 0.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[7]] = 0.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[8]] = 0.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[9]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[10]] = -1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[11]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[12]] = -1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[13]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[14]] = -1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[15]] = 1.0;
        field_152382_f2[NoiseGeneratorImproved.llllIlIlIIIll[16]] = -1.0;
        field_152382_f = field_152382_f2;
        final double[] field_152383_g2 = new double[NoiseGeneratorImproved.llllIlIlIIIll[0]];
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[1]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[2]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[3]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[4]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[5]] = 1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[6]] = 1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[7]] = -1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[8]] = -1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[9]] = 1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[10]] = 1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[11]] = -1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[12]] = -1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[13]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[14]] = 1.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[15]] = 0.0;
        field_152383_g2[NoiseGeneratorImproved.llllIlIlIIIll[16]] = -1.0;
        field_152383_g = field_152383_g2;
        final double[] field_152384_h2 = new double[NoiseGeneratorImproved.llllIlIlIIIll[0]];
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[1]] = 1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[2]] = -1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[3]] = 1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[4]] = -1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[5]] = 1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[6]] = -1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[7]] = 1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[8]] = -1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[9]] = 0.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[10]] = 0.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[11]] = 0.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[12]] = 0.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[13]] = 1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[14]] = 0.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[15]] = -1.0;
        field_152384_h2[NoiseGeneratorImproved.llllIlIlIIIll[16]] = 0.0;
        field_152384_h = field_152384_h2;
        final double[] field_152385_i2 = new double[NoiseGeneratorImproved.llllIlIlIIIll[0]];
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[1]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[2]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[3]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[4]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[5]] = 1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[6]] = 1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[7]] = -1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[8]] = -1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[9]] = 1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[10]] = 1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[11]] = -1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[12]] = -1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[13]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[14]] = 1.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[15]] = 0.0;
        field_152385_i2[NoiseGeneratorImproved.llllIlIlIIIll[16]] = -1.0;
        field_152385_i = field_152385_i2;
    }
    
    private static boolean lIlIlIlIIllIlII(final int lllllllllllllIlIllIllIIlIIIlllll, final int lllllllllllllIlIllIllIIlIIIllllI) {
        return lllllllllllllIlIllIllIIlIIIlllll >= lllllllllllllIlIllIllIIlIIIllllI;
    }
    
    private static boolean lIlIlIlIIllIlll(final int lllllllllllllIlIllIllIIlIIIllIlI) {
        return lllllllllllllIlIllIllIIlIIIllIlI < 0;
    }
    
    public final double grad(final int lllllllllllllIlIllIllIIlllIIlIlI, final double lllllllllllllIlIllIllIIlllIIlllI, final double lllllllllllllIlIllIllIIlllIIlIII, final double lllllllllllllIlIllIllIIlllIIIlll) {
        final int lllllllllllllIlIllIllIIlllIIlIll = lllllllllllllIlIllIllIIlllIIlIlI & NoiseGeneratorImproved.llllIlIlIIIll[16];
        return NoiseGeneratorImproved.field_152381_e[lllllllllllllIlIllIllIIlllIIlIll] * lllllllllllllIlIllIllIIlllIIlllI + NoiseGeneratorImproved.field_152382_f[lllllllllllllIlIllIllIIlllIIlIll] * lllllllllllllIlIllIllIIlllIIlIII + NoiseGeneratorImproved.field_152383_g[lllllllllllllIlIllIllIIlllIIlIll] * lllllllllllllIlIllIllIIlllIIIlll;
    }
    
    private static boolean lIlIlIlIIlllIII(final int lllllllllllllIlIllIllIIlIIIlllII) {
        return lllllllllllllIlIllIllIIlIIIlllII != 0;
    }
    
    private static boolean lIlIlIlIIllIllI(final int lllllllllllllIlIllIllIIlIIlIIIll, final int lllllllllllllIlIllIllIIlIIlIIIlI) {
        return lllllllllllllIlIllIllIIlIIlIIIll == lllllllllllllIlIllIllIIlIIlIIIlI;
    }
}
