// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class Vec4b
{
    private /* synthetic */ byte field_176114_d;
    private /* synthetic */ byte field_176117_a;
    private /* synthetic */ byte field_176116_c;
    private static final /* synthetic */ int[] llIIIlIlIIllll;
    private /* synthetic */ byte field_176115_b;
    
    @Override
    public boolean equals(final Object llllllllllllIlllIlIllIllIIllllII) {
        if (lIIIlIIlIlIIlIll(this, llllllllllllIlllIlIllIllIIllllII)) {
            return Vec4b.llIIIlIlIIllll[0] != 0;
        }
        if (lIIIlIIlIlIIllII((llllllllllllIlllIlIllIllIIllllII instanceof Vec4b) ? 1 : 0)) {
            return Vec4b.llIIIlIlIIllll[1] != 0;
        }
        final Vec4b llllllllllllIlllIlIllIllIIlllIll = (Vec4b)llllllllllllIlllIlIllIllIIllllII;
        int n;
        if (lIIIlIIlIlIIllIl(this.field_176117_a, llllllllllllIlllIlIllIllIIlllIll.field_176117_a)) {
            n = Vec4b.llIIIlIlIIllll[1];
            "".length();
            if ((0x66 ^ 0x24 ^ (0xD9 ^ 0x9E)) == 0x0) {
                return ((159 + 48 - 94 + 67 ^ 10 + 17 - 7 + 120) & (0x4E ^ 0x71 ^ (0x1B ^ 0x1C) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIIlIlIIllIl(this.field_176114_d, llllllllllllIlllIlIllIllIIlllIll.field_176114_d)) {
            n = Vec4b.llIIIlIlIIllll[1];
            "".length();
            if (-(0x4D ^ 0x67 ^ (0x78 ^ 0x57)) >= 0) {
                return ((0x9B ^ 0xC0 ^ (0xE2 ^ 0xAE)) & (85 + 114 - 71 + 23 ^ 18 + 13 + 58 + 39 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIIlIlIIllIl(this.field_176115_b, llllllllllllIlllIlIllIllIIlllIll.field_176115_b)) {
            n = Vec4b.llIIIlIlIIllll[1];
            "".length();
            if ((0x7E ^ 0x9 ^ (0x32 ^ 0x41)) == -" ".length()) {
                return ((0xE5 ^ 0xBC ^ (0x1 ^ 0x1A)) & (218 + 63 - 255 + 196 ^ 130 + 91 - 107 + 42 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIIlIlIIlllI(this.field_176116_c, llllllllllllIlllIlIllIllIIlllIll.field_176116_c)) {
            n = Vec4b.llIIIlIlIIllll[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0x4D ^ 0x49) & ~(0x4C ^ 0x48)) != 0x0;
            }
        }
        else {
            n = Vec4b.llIIIlIlIIllll[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIIlIlIIllIl(final int llllllllllllIlllIlIllIllIIlIIlIl, final int llllllllllllIlllIlIllIllIIlIIlII) {
        return llllllllllllIlllIlIllIllIIlIIlIl != llllllllllllIlllIlIllIllIIlIIlII;
    }
    
    public byte func_176110_a() {
        return this.field_176117_a;
    }
    
    private static void lIIIlIIlIlIIlIlI() {
        (llIIIlIlIIllll = new int[3])[0] = " ".length();
        Vec4b.llIIIlIlIIllll[1] = ((0x4 ^ 0x34) & ~(0xB0 ^ 0x80));
        Vec4b.llIIIlIlIIllll[2] = (179 + 65 - 127 + 71 ^ 141 + 11 - 109 + 120);
    }
    
    public byte func_176112_b() {
        return this.field_176115_b;
    }
    
    static {
        lIIIlIIlIlIIlIlI();
    }
    
    public byte func_176111_d() {
        return this.field_176114_d;
    }
    
    private static boolean lIIIlIIlIlIIlIll(final Object llllllllllllIlllIlIllIllIIlIlIll, final Object llllllllllllIlllIlIllIllIIlIlIlI) {
        return llllllllllllIlllIlIllIllIIlIlIll == llllllllllllIlllIlIllIllIIlIlIlI;
    }
    
    public Vec4b(final byte llllllllllllIlllIlIllIllIlIlIllI, final byte llllllllllllIlllIlIllIllIlIllIlI, final byte llllllllllllIlllIlIllIllIlIllIIl, final byte llllllllllllIlllIlIllIllIlIlIIll) {
        this.field_176117_a = llllllllllllIlllIlIllIllIlIlIllI;
        this.field_176115_b = llllllllllllIlllIlIllIllIlIllIlI;
        this.field_176116_c = llllllllllllIlllIlIllIllIlIllIIl;
        this.field_176114_d = llllllllllllIlllIlIllIllIlIlIIll;
    }
    
    private static boolean lIIIlIIlIlIIlllI(final int llllllllllllIlllIlIllIllIIlIllll, final int llllllllllllIlllIlIllIllIIlIlllI) {
        return llllllllllllIlllIlIllIllIIlIllll == llllllllllllIlllIlIllIllIIlIlllI;
    }
    
    public byte func_176113_c() {
        return this.field_176116_c;
    }
    
    public Vec4b(final Vec4b llllllllllllIlllIlIllIllIlIIllll) {
        this.field_176117_a = llllllllllllIlllIlIllIllIlIIllll.field_176117_a;
        this.field_176115_b = llllllllllllIlllIlIllIllIlIIllll.field_176115_b;
        this.field_176116_c = llllllllllllIlllIlIllIllIlIIllll.field_176116_c;
        this.field_176114_d = llllllllllllIlllIlIllIllIlIIllll.field_176114_d;
    }
    
    @Override
    public int hashCode() {
        int llllllllllllIlllIlIllIllIIllIlII = this.field_176117_a;
        llllllllllllIlllIlIllIllIIllIlII = Vec4b.llIIIlIlIIllll[2] * llllllllllllIlllIlIllIllIIllIlII + this.field_176115_b;
        llllllllllllIlllIlIllIllIIllIlII = Vec4b.llIIIlIlIIllll[2] * llllllllllllIlllIlIllIllIIllIlII + this.field_176116_c;
        llllllllllllIlllIlIllIllIIllIlII = Vec4b.llIIIlIlIIllll[2] * llllllllllllIlllIlIllIllIIllIlII + this.field_176114_d;
        return llllllllllllIlllIlIllIllIIllIlII;
    }
    
    private static boolean lIIIlIIlIlIIllII(final int llllllllllllIlllIlIllIllIIlIlIII) {
        return llllllllllllIlllIlIllIllIIlIlIII == 0;
    }
}
