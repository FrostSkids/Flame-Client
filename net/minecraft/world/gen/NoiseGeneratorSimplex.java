// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Random;

public class NoiseGeneratorSimplex
{
    private static /* synthetic */ int[][] field_151611_e;
    public /* synthetic */ double field_151610_d;
    private static final /* synthetic */ int[] lIIlIIIIlllIIl;
    public /* synthetic */ double field_151612_b;
    private static final /* synthetic */ double field_151615_h;
    private /* synthetic */ int[] field_151608_f;
    private static final /* synthetic */ double field_151609_g;
    public static final /* synthetic */ double field_151614_a;
    public /* synthetic */ double field_151613_c;
    
    private static int func_151607_a(final double lllllllllllllIIlllIlIllIIIIlIIII) {
        int n;
        if (llIIlIlIIIlIIll(llIIlIlIIIlIIlI(lllllllllllllIIlllIlIllIIIIlIIII, 0.0))) {
            n = (int)lllllllllllllIIlllIlIllIIIIlIIII;
            "".length();
            if (null != null) {
                return (0x86 ^ 0x9E ^ (0x72 ^ 0x6F)) & (0x1C ^ 0x0 ^ (0xAA ^ 0xB3) ^ -" ".length());
            }
        }
        else {
            n = (int)lllllllllllllIIlllIlIllIIIIlIIII - NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        }
        return n;
    }
    
    private static int llIIlIlIIIlIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIIlIlIIIlIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIIlIlIIIllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void llIIlIlIIIlIIII() {
        (lIIlIIIIlllIIl = new int[17])[0] = (20 + 143 - 140 + 164 ^ 182 + 127 - 234 + 108);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[1] = ((0x38 ^ 0xA ^ (0xE ^ 0x19)) & (0xAE ^ 0xB8 ^ (0x5B ^ 0x68) ^ -" ".length()));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[2] = "   ".length();
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[3] = " ".length();
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[4] = -" ".length();
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[5] = "  ".length();
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[6] = (0x44 ^ 0x40);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[7] = (0x4 ^ 0xC ^ (0xAC ^ 0xA1));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[8] = (0x7A ^ 0x7C);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[9] = (0x63 ^ 0x5E ^ (0x12 ^ 0x28));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[10] = (0xB7 ^ 0x9F ^ (0x7A ^ 0x5A));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[11] = (165 + 152 - 241 + 99 ^ 134 + 149 - 215 + 98);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[12] = (0x7E ^ 0x74);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[13] = (0x4F ^ 0x44);
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[14] = (-(0xFFFFA5B5 & 0x7FFF) & (0xFFFFF7FF & 0x2FB4));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[15] = (-(0xFFFFEE3F & 0x3DD7) & (0xFFFFEF17 & 0x3DFE));
        NoiseGeneratorSimplex.lIIlIIIIlllIIl[16] = 99 + 128 + 15 + 13;
    }
    
    public double func_151605_a(final double lllllllllllllIIlllIlIlIllllIIllI, final double lllllllllllllIIlllIlIlIllllIIlIl) {
        final double lllllllllllllIIlllIlIlIllllIIlII = 0.5 * (NoiseGeneratorSimplex.field_151614_a - 1.0);
        final double lllllllllllllIIlllIlIlIllllIIIll = (lllllllllllllIIlllIlIlIllllIIllI + lllllllllllllIIlllIlIlIllllIIlIl) * lllllllllllllIIlllIlIlIllllIIlII;
        final int lllllllllllllIIlllIlIlIllllIIIlI = func_151607_a(lllllllllllllIIlllIlIlIllllIIllI + lllllllllllllIIlllIlIlIllllIIIll);
        final int lllllllllllllIIlllIlIlIllllIIIIl = func_151607_a(lllllllllllllIIlllIlIlIllllIIlIl + lllllllllllllIIlllIlIlIllllIIIll);
        final double lllllllllllllIIlllIlIlIllllIIIII = (3.0 - NoiseGeneratorSimplex.field_151614_a) / 6.0;
        final double lllllllllllllIIlllIlIlIlllIlllll = (lllllllllllllIIlllIlIlIllllIIIlI + lllllllllllllIIlllIlIlIllllIIIIl) * lllllllllllllIIlllIlIlIllllIIIII;
        final double lllllllllllllIIlllIlIlIlllIllllI = lllllllllllllIIlllIlIlIllllIIIlI - lllllllllllllIIlllIlIlIlllIlllll;
        final double lllllllllllllIIlllIlIlIlllIlllIl = lllllllllllllIIlllIlIlIllllIIIIl - lllllllllllllIIlllIlIlIlllIlllll;
        final double lllllllllllllIIlllIlIlIlllIlllII = lllllllllllllIIlllIlIlIllllIIllI - lllllllllllllIIlllIlIlIlllIllllI;
        final double lllllllllllllIIlllIlIlIlllIllIll = lllllllllllllIIlllIlIlIllllIIlIl - lllllllllllllIIlllIlIlIlllIlllIl;
        int lllllllllllllIIlllIlIlIlllIllIIl = 0;
        int lllllllllllllIIlllIlIlIlllIlIlll;
        if (llIIlIlIIIlIIll(llIIlIlIIIlIlII(lllllllllllllIIlllIlIlIlllIlllII, lllllllllllllIIlllIlIlIlllIllIll))) {
            final int lllllllllllllIIlllIlIlIlllIllIlI = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
            final int lllllllllllllIIlllIlIlIlllIllIII = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
            "".length();
            if (null != null) {
                return 0.0;
            }
        }
        else {
            lllllllllllllIIlllIlIlIlllIllIIl = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
            lllllllllllllIIlllIlIlIlllIlIlll = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        }
        final double lllllllllllllIIlllIlIlIlllIlIllI = lllllllllllllIIlllIlIlIlllIlllII - lllllllllllllIIlllIlIlIlllIllIIl + lllllllllllllIIlllIlIlIllllIIIII;
        final double lllllllllllllIIlllIlIlIlllIlIlIl = lllllllllllllIIlllIlIlIlllIllIll - lllllllllllllIIlllIlIlIlllIlIlll + lllllllllllllIIlllIlIlIllllIIIII;
        final double lllllllllllllIIlllIlIlIlllIlIlII = lllllllllllllIIlllIlIlIlllIlllII - 1.0 + 2.0 * lllllllllllllIIlllIlIlIllllIIIII;
        final double lllllllllllllIIlllIlIlIlllIlIIll = lllllllllllllIIlllIlIlIlllIllIll - 1.0 + 2.0 * lllllllllllllIIlllIlIlIllllIIIII;
        final int lllllllllllllIIlllIlIlIlllIlIIlI = lllllllllllllIIlllIlIlIllllIIIlI & NoiseGeneratorSimplex.lIIlIIIIlllIIl[16];
        final int lllllllllllllIIlllIlIlIlllIlIIIl = lllllllllllllIIlllIlIlIllllIIIIl & NoiseGeneratorSimplex.lIIlIIIIlllIIl[16];
        final int lllllllllllllIIlllIlIlIlllIlIIII = this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIlI + this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIIl]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
        final int lllllllllllllIIlllIlIlIlllIIllll = this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIlI + lllllllllllllIIlllIlIlIlllIllIIl + this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIIl + lllllllllllllIIlllIlIlIlllIlIlll]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
        final int lllllllllllllIIlllIlIlIlllIIlllI = this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIlI + NoiseGeneratorSimplex.lIIlIIIIlllIIl[3] + this.field_151608_f[lllllllllllllIIlllIlIlIlllIlIIIl + NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
        double lllllllllllllIIlllIlIlIlllIIllIl = 0.5 - lllllllllllllIIlllIlIlIlllIlllII * lllllllllllllIIlllIlIlIlllIlllII - lllllllllllllIIlllIlIlIlllIllIll * lllllllllllllIIlllIlIlIlllIllIll;
        double lllllllllllllIIlllIlIlIlllIIlIll = 0.0;
        if (llIIlIlIIIlIllI(llIIlIlIIIlIlIl(lllllllllllllIIlllIlIlIlllIIllIl, 0.0))) {
            final double lllllllllllllIIlllIlIlIlllIIllII = 0.0;
            "".length();
            if (-" ".length() >= (0xA6 ^ 0xA2)) {
                return 0.0;
            }
        }
        else {
            lllllllllllllIIlllIlIlIlllIIllIl *= lllllllllllllIIlllIlIlIlllIIllIl;
            lllllllllllllIIlllIlIlIlllIIlIll = lllllllllllllIIlllIlIlIlllIIllIl * lllllllllllllIIlllIlIlIlllIIllIl * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlllIlIIII], lllllllllllllIIlllIlIlIlllIlllII, lllllllllllllIIlllIlIlIlllIllIll);
        }
        double lllllllllllllIIlllIlIlIlllIIlIlI = 0.5 - lllllllllllllIIlllIlIlIlllIlIllI * lllllllllllllIIlllIlIlIlllIlIllI - lllllllllllllIIlllIlIlIlllIlIlIl * lllllllllllllIIlllIlIlIlllIlIlIl;
        double lllllllllllllIIlllIlIlIlllIIlIII = 0.0;
        if (llIIlIlIIIlIllI(llIIlIlIIIlIlIl(lllllllllllllIIlllIlIlIlllIIlIlI, 0.0))) {
            final double lllllllllllllIIlllIlIlIlllIIlIIl = 0.0;
            "".length();
            if (-(0x21 ^ 0x25) > 0) {
                return 0.0;
            }
        }
        else {
            lllllllllllllIIlllIlIlIlllIIlIlI *= lllllllllllllIIlllIlIlIlllIIlIlI;
            lllllllllllllIIlllIlIlIlllIIlIII = lllllllllllllIIlllIlIlIlllIIlIlI * lllllllllllllIIlllIlIlIlllIIlIlI * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlllIIllll], lllllllllllllIIlllIlIlIlllIlIllI, lllllllllllllIIlllIlIlIlllIlIlIl);
        }
        double lllllllllllllIIlllIlIlIlllIIIlll = 0.5 - lllllllllllllIIlllIlIlIlllIlIlII * lllllllllllllIIlllIlIlIlllIlIlII - lllllllllllllIIlllIlIlIlllIlIIll * lllllllllllllIIlllIlIlIlllIlIIll;
        double lllllllllllllIIlllIlIlIlllIIIlIl = 0.0;
        if (llIIlIlIIIlIllI(llIIlIlIIIlIlIl(lllllllllllllIIlllIlIlIlllIIIlll, 0.0))) {
            final double lllllllllllllIIlllIlIlIlllIIIllI = 0.0;
            "".length();
            if (((0x7A ^ 0x55) & ~(0x1D ^ 0x32)) > 0) {
                return 0.0;
            }
        }
        else {
            lllllllllllllIIlllIlIlIlllIIIlll *= lllllllllllllIIlllIlIlIlllIIIlll;
            lllllllllllllIIlllIlIlIlllIIIlIl = lllllllllllllIIlllIlIlIlllIIIlll * lllllllllllllIIlllIlIlIlllIIIlll * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlllIIlllI], lllllllllllllIIlllIlIlIlllIlIlII, lllllllllllllIIlllIlIlIlllIlIIll);
        }
        return 70.0 * (lllllllllllllIIlllIlIlIlllIIlIll + lllllllllllllIIlllIlIlIlllIIlIII + lllllllllllllIIlllIlIlIlllIIIlIl);
    }
    
    private static double func_151604_a(final int[] lllllllllllllIIlllIlIllIIIIIlIII, final double lllllllllllllIIlllIlIllIIIIIIlll, final double lllllllllllllIIlllIlIllIIIIIlIIl) {
        return lllllllllllllIIlllIlIllIIIIIlIII[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] * lllllllllllllIIlllIlIllIIIIIIlll + lllllllllllllIIlllIlIllIIIIIlIII[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] * lllllllllllllIIlllIlIllIIIIIlIIl;
    }
    
    static {
        llIIlIlIIIlIIII();
        final int[][] field_151611_e = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[0]][];
        final int n = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
        final int[] array = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n] = array;
        final int n2 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        final int[] array2 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array2[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array2[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n2] = array2;
        final int n3 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[5];
        final int[] array3 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array3[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array3[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n3] = array3;
        final int n4 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[2];
        final int[] array4 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array4[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array4[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n4] = array4;
        final int n5 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[6];
        final int[] array5 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array5[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array5[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n5] = array5;
        final int n6 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[7];
        final int[] array6 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array6[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array6[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n6] = array6;
        final int n7 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[8];
        final int[] array7 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array7[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array7[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n7] = array7;
        final int n8 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[9];
        final int[] array8 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array8[NoiseGeneratorSimplex.lIIlIIIIlllIIl[1]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array8[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n8] = array8;
        final int n9 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[10];
        final int[] array9 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array9[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array9[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n9] = array9;
        final int n10 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[11];
        final int[] array10 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array10[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array10[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        field_151611_e[n10] = array10;
        final int n11 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[12];
        final int[] array11 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array11[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
        array11[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n11] = array11;
        final int n12 = NoiseGeneratorSimplex.lIIlIIIIlllIIl[13];
        final int[] array12 = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[2]];
        array12[NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        array12[NoiseGeneratorSimplex.lIIlIIIIlllIIl[5]] = NoiseGeneratorSimplex.lIIlIIIIlllIIl[4];
        field_151611_e[n12] = array12;
        NoiseGeneratorSimplex.field_151611_e = field_151611_e;
        field_151614_a = Math.sqrt(3.0);
        field_151609_g = 0.5 * (NoiseGeneratorSimplex.field_151614_a - 1.0);
        field_151615_h = (3.0 - NoiseGeneratorSimplex.field_151614_a) / 6.0;
    }
    
    public NoiseGeneratorSimplex() {
        this(new Random());
    }
    
    public NoiseGeneratorSimplex(final Random lllllllllllllIIlllIlIllIIIIlIlIl) {
        this.field_151608_f = new int[NoiseGeneratorSimplex.lIIlIIIIlllIIl[14]];
        this.field_151612_b = lllllllllllllIIlllIlIllIIIIlIlIl.nextDouble() * 256.0;
        this.field_151613_c = lllllllllllllIIlllIlIllIIIIlIlIl.nextDouble() * 256.0;
        this.field_151610_d = lllllllllllllIIlllIlIllIIIIlIlIl.nextDouble() * 256.0;
        int lllllllllllllIIlllIlIllIIIIllIlI = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
        "".length();
        if (-" ".length() > "  ".length()) {
            throw null;
        }
        while (!llIIlIlIIIlIIIl(lllllllllllllIIlllIlIllIIIIllIlI, NoiseGeneratorSimplex.lIIlIIIIlllIIl[15])) {
            this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIlI] = lllllllllllllIIlllIlIllIIIIllIlI++;
        }
        int lllllllllllllIIlllIlIllIIIIllIIl = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
        "".length();
        if (" ".length() >= "  ".length()) {
            throw null;
        }
        while (!llIIlIlIIIlIIIl(lllllllllllllIIlllIlIllIIIIllIIl, NoiseGeneratorSimplex.lIIlIIIIlllIIl[15])) {
            final int lllllllllllllIIlllIlIllIIIIllIII = lllllllllllllIIlllIlIllIIIIlIlIl.nextInt(NoiseGeneratorSimplex.lIIlIIIIlllIIl[15] - lllllllllllllIIlllIlIllIIIIllIIl) + lllllllllllllIIlllIlIllIIIIllIIl;
            final int lllllllllllllIIlllIlIllIIIIlIlll = this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIIl];
            this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIIl] = this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIII];
            this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIII] = lllllllllllllIIlllIlIllIIIIlIlll;
            this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIIl + NoiseGeneratorSimplex.lIIlIIIIlllIIl[15]] = this.field_151608_f[lllllllllllllIIlllIlIllIIIIllIIl];
            ++lllllllllllllIIlllIlIllIIIIllIIl;
        }
    }
    
    private static boolean llIIlIlIIIlIIll(final int lllllllllllllIIlllIlIlIlIIlIIIlI) {
        return lllllllllllllIIlllIlIlIlIIlIIIlI > 0;
    }
    
    private static int llIIlIlIIIlIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void func_151606_a(final double[] lllllllllllllIIlllIlIlIlIlIlIIII, final double lllllllllllllIIlllIlIlIlIlIIllll, final double lllllllllllllIIlllIlIlIlIlIIlllI, final int lllllllllllllIIlllIlIlIlIlIIllIl, final int lllllllllllllIIlllIlIlIlIlIIllII, final double lllllllllllllIIlllIlIlIlIlIIlIll, final double lllllllllllllIIlllIlIlIlIlllIlll, final double lllllllllllllIIlllIlIlIlIlIIlIIl) {
        int lllllllllllllIIlllIlIlIlIlllIlIl = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
        int lllllllllllllIIlllIlIlIlIlllIlII = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
        "".length();
        if (((0x3B ^ 0x9) & ~(0x2D ^ 0x1F)) == (0x72 ^ 0x76)) {
            return;
        }
        while (!llIIlIlIIIlIIIl(lllllllllllllIIlllIlIlIlIlllIlII, lllllllllllllIIlllIlIlIlIlIIllII)) {
            final double lllllllllllllIIlllIlIlIlIlllIIll = (lllllllllllllIIlllIlIlIlIlIIlllI + lllllllllllllIIlllIlIlIlIlllIlII) * lllllllllllllIIlllIlIlIlIlllIlll + this.field_151613_c;
            int lllllllllllllIIlllIlIlIlIlllIIlI = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
            "".length();
            if ((0x5E ^ 0x5A) <= 0) {
                return;
            }
            while (!llIIlIlIIIlIIIl(lllllllllllllIIlllIlIlIlIlllIIlI, lllllllllllllIIlllIlIlIlIlIIllIl)) {
                final double lllllllllllllIIlllIlIlIlIlllIIIl = (lllllllllllllIIlllIlIlIlIlIIllll + lllllllllllllIIlllIlIlIlIlllIIlI) * lllllllllllllIIlllIlIlIlIlIIlIll + this.field_151612_b;
                final double lllllllllllllIIlllIlIlIlIlllIIII = (lllllllllllllIIlllIlIlIlIlllIIIl + lllllllllllllIIlllIlIlIlIlllIIll) * NoiseGeneratorSimplex.field_151609_g;
                final int lllllllllllllIIlllIlIlIlIllIllll = func_151607_a(lllllllllllllIIlllIlIlIlIlllIIIl + lllllllllllllIIlllIlIlIlIlllIIII);
                final int lllllllllllllIIlllIlIlIlIllIlllI = func_151607_a(lllllllllllllIIlllIlIlIlIlllIIll + lllllllllllllIIlllIlIlIlIlllIIII);
                final double lllllllllllllIIlllIlIlIlIllIllIl = (lllllllllllllIIlllIlIlIlIllIllll + lllllllllllllIIlllIlIlIlIllIlllI) * NoiseGeneratorSimplex.field_151615_h;
                final double lllllllllllllIIlllIlIlIlIllIllII = lllllllllllllIIlllIlIlIlIllIllll - lllllllllllllIIlllIlIlIlIllIllIl;
                final double lllllllllllllIIlllIlIlIlIllIlIll = lllllllllllllIIlllIlIlIlIllIlllI - lllllllllllllIIlllIlIlIlIllIllIl;
                final double lllllllllllllIIlllIlIlIlIllIlIlI = lllllllllllllIIlllIlIlIlIlllIIIl - lllllllllllllIIlllIlIlIlIllIllII;
                final double lllllllllllllIIlllIlIlIlIllIlIIl = lllllllllllllIIlllIlIlIlIlllIIll - lllllllllllllIIlllIlIlIlIllIlIll;
                int lllllllllllllIIlllIlIlIlIllIIlll = 0;
                int lllllllllllllIIlllIlIlIlIllIIlIl;
                if (llIIlIlIIIlIIll(llIIlIlIIIlIlll(lllllllllllllIIlllIlIlIlIllIlIlI, lllllllllllllIIlllIlIlIlIllIlIIl))) {
                    final int lllllllllllllIIlllIlIlIlIllIlIII = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
                    final int lllllllllllllIIlllIlIlIlIllIIllI = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
                    "".length();
                    if (((0x9F ^ 0xB6) & ~(0x9 ^ 0x20)) > 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlIlIllIIlll = NoiseGeneratorSimplex.lIIlIIIIlllIIl[1];
                    lllllllllllllIIlllIlIlIlIllIIlIl = NoiseGeneratorSimplex.lIIlIIIIlllIIl[3];
                }
                final double lllllllllllllIIlllIlIlIlIllIIlII = lllllllllllllIIlllIlIlIlIllIlIlI - lllllllllllllIIlllIlIlIlIllIIlll + NoiseGeneratorSimplex.field_151615_h;
                final double lllllllllllllIIlllIlIlIlIllIIIll = lllllllllllllIIlllIlIlIlIllIlIIl - lllllllllllllIIlllIlIlIlIllIIlIl + NoiseGeneratorSimplex.field_151615_h;
                final double lllllllllllllIIlllIlIlIlIllIIIlI = lllllllllllllIIlllIlIlIlIllIlIlI - 1.0 + 2.0 * NoiseGeneratorSimplex.field_151615_h;
                final double lllllllllllllIIlllIlIlIlIllIIIIl = lllllllllllllIIlllIlIlIlIllIlIIl - 1.0 + 2.0 * NoiseGeneratorSimplex.field_151615_h;
                final int lllllllllllllIIlllIlIlIlIllIIIII = lllllllllllllIIlllIlIlIlIllIllll & NoiseGeneratorSimplex.lIIlIIIIlllIIl[16];
                final int lllllllllllllIIlllIlIlIlIlIlllll = lllllllllllllIIlllIlIlIlIllIlllI & NoiseGeneratorSimplex.lIIlIIIIlllIIl[16];
                final int lllllllllllllIIlllIlIlIlIlIllllI = this.field_151608_f[lllllllllllllIIlllIlIlIlIllIIIII + this.field_151608_f[lllllllllllllIIlllIlIlIlIlIlllll]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
                final int lllllllllllllIIlllIlIlIlIlIlllIl = this.field_151608_f[lllllllllllllIIlllIlIlIlIllIIIII + lllllllllllllIIlllIlIlIlIllIIlll + this.field_151608_f[lllllllllllllIIlllIlIlIlIlIlllll + lllllllllllllIIlllIlIlIlIllIIlIl]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
                final int lllllllllllllIIlllIlIlIlIlIlllII = this.field_151608_f[lllllllllllllIIlllIlIlIlIllIIIII + NoiseGeneratorSimplex.lIIlIIIIlllIIl[3] + this.field_151608_f[lllllllllllllIIlllIlIlIlIlIlllll + NoiseGeneratorSimplex.lIIlIIIIlllIIl[3]]] % NoiseGeneratorSimplex.lIIlIIIIlllIIl[0];
                double lllllllllllllIIlllIlIlIlIlIllIll = 0.5 - lllllllllllllIIlllIlIlIlIllIlIlI * lllllllllllllIIlllIlIlIlIllIlIlI - lllllllllllllIIlllIlIlIlIllIlIIl * lllllllllllllIIlllIlIlIlIllIlIIl;
                double lllllllllllllIIlllIlIlIlIlIllIIl = 0.0;
                if (llIIlIlIIIlIllI(llIIlIlIIIllIII(lllllllllllllIIlllIlIlIlIlIllIll, 0.0))) {
                    final double lllllllllllllIIlllIlIlIlIlIllIlI = 0.0;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlIlIlIllIll *= lllllllllllllIIlllIlIlIlIlIllIll;
                    lllllllllllllIIlllIlIlIlIlIllIIl = lllllllllllllIIlllIlIlIlIlIllIll * lllllllllllllIIlllIlIlIlIlIllIll * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlIlIllllI], lllllllllllllIIlllIlIlIlIllIlIlI, lllllllllllllIIlllIlIlIlIllIlIIl);
                }
                double lllllllllllllIIlllIlIlIlIlIllIII = 0.5 - lllllllllllllIIlllIlIlIlIllIIlII * lllllllllllllIIlllIlIlIlIllIIlII - lllllllllllllIIlllIlIlIlIllIIIll * lllllllllllllIIlllIlIlIlIllIIIll;
                double lllllllllllllIIlllIlIlIlIlIlIllI = 0.0;
                if (llIIlIlIIIlIllI(llIIlIlIIIllIII(lllllllllllllIIlllIlIlIlIlIllIII, 0.0))) {
                    final double lllllllllllllIIlllIlIlIlIlIlIlll = 0.0;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlIlIlIllIII *= lllllllllllllIIlllIlIlIlIlIllIII;
                    lllllllllllllIIlllIlIlIlIlIlIllI = lllllllllllllIIlllIlIlIlIlIllIII * lllllllllllllIIlllIlIlIlIlIllIII * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlIlIlllIl], lllllllllllllIIlllIlIlIlIllIIlII, lllllllllllllIIlllIlIlIlIllIIIll);
                }
                double lllllllllllllIIlllIlIlIlIlIlIlIl = 0.5 - lllllllllllllIIlllIlIlIlIllIIIlI * lllllllllllllIIlllIlIlIlIllIIIlI - lllllllllllllIIlllIlIlIlIllIIIIl * lllllllllllllIIlllIlIlIlIllIIIIl;
                double lllllllllllllIIlllIlIlIlIlIlIIll = 0.0;
                if (llIIlIlIIIlIllI(llIIlIlIIIllIII(lllllllllllllIIlllIlIlIlIlIlIlIl, 0.0))) {
                    final double lllllllllllllIIlllIlIlIlIlIlIlII = 0.0;
                    "".length();
                    if (-(0xA8 ^ 0xAC) > 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlIlIlIlIlIl *= lllllllllllllIIlllIlIlIlIlIlIlIl;
                    lllllllllllllIIlllIlIlIlIlIlIIll = lllllllllllllIIlllIlIlIlIlIlIlIl * lllllllllllllIIlllIlIlIlIlIlIlIl * func_151604_a(NoiseGeneratorSimplex.field_151611_e[lllllllllllllIIlllIlIlIlIlIlllII], lllllllllllllIIlllIlIlIlIllIIIlI, lllllllllllllIIlllIlIlIlIllIIIIl);
                }
                final int n;
                final int lllllllllllllIIlllIlIlIlIlIlIIlI = n = lllllllllllllIIlllIlIlIlIlllIlIl++;
                lllllllllllllIIlllIlIlIlIlIlIIII[n] += 70.0 * (lllllllllllllIIlllIlIlIlIlIllIIl + lllllllllllllIIlllIlIlIlIlIlIllI + lllllllllllllIIlllIlIlIlIlIlIIll) * lllllllllllllIIlllIlIlIlIlIIlIIl;
                ++lllllllllllllIIlllIlIlIlIlllIIlI;
            }
            ++lllllllllllllIIlllIlIlIlIlllIlII;
        }
    }
    
    private static int llIIlIlIIIlIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIIlIlIIIlIIIl(final int lllllllllllllIIlllIlIlIlIIlIIlll, final int lllllllllllllIIlllIlIlIlIIlIIllI) {
        return lllllllllllllIIlllIlIlIlIIlIIlll >= lllllllllllllIIlllIlIlIlIIlIIllI;
    }
    
    private static boolean llIIlIlIIIlIllI(final int lllllllllllllIIlllIlIlIlIIlIIlII) {
        return lllllllllllllIIlllIlIlIlIIlIIlII < 0;
    }
}
