// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.io.Serializable;
import java.util.Comparator;

final class CaseIgnoringComparator implements Comparator<CharSequence>, Serializable
{
    private static final /* synthetic */ int[] lIIlIlIlIlllll;
    static final /* synthetic */ CaseIgnoringComparator INSTANCE;
    
    private static boolean llIlIIIIlllIIll(final int lllllllllllllIIllIIlllIllIllIlIl, final int lllllllllllllIIllIIlllIllIllIlII) {
        return lllllllllllllIIllIIlllIllIllIlIl < lllllllllllllIIllIIlllIllIllIlII;
    }
    
    @Override
    public int compare(final CharSequence lllllllllllllIIllIIlllIlllIIlIIl, final CharSequence lllllllllllllIIllIIlllIlllIIlIII) {
        final int lllllllllllllIIllIIlllIlllIIllII = lllllllllllllIIllIIlllIlllIIlIIl.length();
        final int lllllllllllllIIllIIlllIlllIIlIll = lllllllllllllIIllIIlllIlllIIlIII.length();
        final int lllllllllllllIIllIIlllIlllIIlIlI = Math.min(lllllllllllllIIllIIlllIlllIIllII, lllllllllllllIIllIIlllIlllIIlIll);
        int lllllllllllllIIllIIlllIlllIlIIII = CaseIgnoringComparator.lIIlIlIlIlllll[0];
        while (llIlIIIIlllIIll(lllllllllllllIIllIIlllIlllIlIIII, lllllllllllllIIllIIlllIlllIIlIlI)) {
            char lllllllllllllIIllIIlllIlllIlIIlI = lllllllllllllIIllIIlllIlllIIlIIl.charAt(lllllllllllllIIllIIlllIlllIlIIII);
            char lllllllllllllIIllIIlllIlllIlIIIl = lllllllllllllIIllIIlllIlllIIlIII.charAt(lllllllllllllIIllIIlllIlllIlIIII);
            if (llIlIIIIlllIlII(lllllllllllllIIllIIlllIlllIlIIlI, lllllllllllllIIllIIlllIlllIlIIIl)) {
                lllllllllllllIIllIIlllIlllIlIIlI = Character.toUpperCase(lllllllllllllIIllIIlllIlllIlIIlI);
                lllllllllllllIIllIIlllIlllIlIIIl = Character.toUpperCase(lllllllllllllIIllIIlllIlllIlIIIl);
                if (llIlIIIIlllIlII(lllllllllllllIIllIIlllIlllIlIIlI, lllllllllllllIIllIIlllIlllIlIIIl)) {
                    lllllllllllllIIllIIlllIlllIlIIlI = Character.toLowerCase(lllllllllllllIIllIIlllIlllIlIIlI);
                    lllllllllllllIIllIIlllIlllIlIIIl = Character.toLowerCase(lllllllllllllIIllIIlllIlllIlIIIl);
                    if (llIlIIIIlllIlII(lllllllllllllIIllIIlllIlllIlIIlI, lllllllllllllIIllIIlllIlllIlIIIl)) {
                        return lllllllllllllIIllIIlllIlllIlIIlI - lllllllllllllIIllIIlllIlllIlIIIl;
                    }
                }
            }
            ++lllllllllllllIIllIIlllIlllIlIIII;
            "".length();
            if (-" ".length() > ((0x4 ^ 0x3D) & ~(0x55 ^ 0x6C))) {
                return (0x10 ^ 0x21) & ~(0x78 ^ 0x49);
            }
        }
        return lllllllllllllIIllIIlllIlllIIllII - lllllllllllllIIllIIlllIlllIIlIll;
    }
    
    private static void llIlIIIIlllIIlI() {
        (lIIlIlIlIlllll = new int[1])[0] = ((0x67 ^ 0x5A) & ~(0xBB ^ 0x86));
    }
    
    private static boolean llIlIIIIlllIlII(final int lllllllllllllIIllIIlllIllIllIIIl, final int lllllllllllllIIllIIlllIllIllIIII) {
        return lllllllllllllIIllIIlllIllIllIIIl != lllllllllllllIIllIIlllIllIllIIII;
    }
    
    private CaseIgnoringComparator() {
    }
    
    static {
        llIlIIIIlllIIlI();
        INSTANCE = new CaseIgnoringComparator();
    }
    
    private Object readResolve() {
        return CaseIgnoringComparator.INSTANCE;
    }
}
