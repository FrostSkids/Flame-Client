// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class IntegerCache
{
    private static final /* synthetic */ int[] lIIllllIlllIll;
    private static final /* synthetic */ Integer[] field_181757_a;
    
    private static void llIllllIIlIIlIl() {
        (lIIllllIlllIll = new int[2])[0] = (-" ".length() & (-1 & 0xFFFF));
        IntegerCache.lIIllllIlllIll[1] = ((0xB ^ 0x3B ^ (0xBB ^ 0xA6)) & (0x2D ^ 0x36 ^ (0x71 ^ 0x47) ^ -" ".length()));
    }
    
    static {
        llIllllIIlIIlIl();
        field_181757_a = new Integer[IntegerCache.lIIllllIlllIll[0]];
        int lllllllllllllIIlIIlIIllIIIlIIlll = IntegerCache.lIIllllIlllIll[1];
        final int lllllllllllllIIlIIlIIllIIIlIIllI = IntegerCache.field_181757_a.length;
        "".length();
        if (((0x6A ^ 0x1D ^ (0xE3 ^ 0xB9)) & (46 + 129 - 119 + 87 ^ 36 + 61 + 29 + 36 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llIllllIIlIIllI(lllllllllllllIIlIIlIIllIIIlIIlll, lllllllllllllIIlIIlIIllIIIlIIllI)) {
            IntegerCache.field_181757_a[lllllllllllllIIlIIlIIllIIIlIIlll] = lllllllllllllIIlIIlIIllIIIlIIlll;
            ++lllllllllllllIIlIIlIIllIIIlIIlll;
        }
    }
    
    private static boolean llIllllIIlIIlll(final int lllllllllllllIIlIIlIIllIIIIlIlII) {
        return lllllllllllllIIlIIlIIllIIIIlIlII > 0;
    }
    
    public static Integer func_181756_a(final int lllllllllllllIIlIIlIIllIIIIllllI) {
        Integer value;
        if (llIllllIIlIIlll(lllllllllllllIIlIIlIIllIIIIllllI) && llIllllIIlIlIII(lllllllllllllIIlIIlIIllIIIIllllI, IntegerCache.field_181757_a.length)) {
            value = IntegerCache.field_181757_a[lllllllllllllIIlIIlIIllIIIIllllI];
            "".length();
            if ((0x5E ^ 0x41 ^ (0x24 ^ 0x3F)) <= -" ".length()) {
                return null;
            }
        }
        else {
            value = lllllllllllllIIlIIlIIllIIIIllllI;
        }
        return value;
    }
    
    private static boolean llIllllIIlIIllI(final int lllllllllllllIIlIIlIIllIIIIllIll, final int lllllllllllllIIlIIlIIllIIIIllIlI) {
        return lllllllllllllIIlIIlIIllIIIIllIll >= lllllllllllllIIlIIlIIllIIIIllIlI;
    }
    
    private static boolean llIllllIIlIlIII(final int lllllllllllllIIlIIlIIllIIIIlIlll, final int lllllllllllllIIlIIlIIllIIIIlIllI) {
        return lllllllllllllIIlIIlIIllIIIIlIlll < lllllllllllllIIlIIlIIllIIIIlIllI;
    }
}
