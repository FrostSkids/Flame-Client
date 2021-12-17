// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

public final class NoOpTypeParameterMatcher extends TypeParameterMatcher
{
    private static final /* synthetic */ int[] lIlllIIlIlIlIl;
    
    @Override
    public boolean match(final Object llllllllllllIlllllIlIIIIIIIIlllI) {
        return NoOpTypeParameterMatcher.lIlllIIlIlIlIl[0] != 0;
    }
    
    private static void lIIIIIIlllIlIllI() {
        (lIlllIIlIlIlIl = new int[1])[0] = " ".length();
    }
    
    static {
        lIIIIIIlllIlIllI();
    }
}
