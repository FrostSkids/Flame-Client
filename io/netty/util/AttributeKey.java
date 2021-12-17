// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.ConcurrentMap;

public final class AttributeKey<T> extends UniqueName
{
    private static final /* synthetic */ ConcurrentMap<String, Boolean> names;
    private static final /* synthetic */ int[] lllIIIllIlIlll;
    
    static {
        lIIllllIIIIlIlll();
        names = PlatformDependent.newConcurrentHashMap();
    }
    
    @Deprecated
    public AttributeKey(final String llllllllllllIlIlllllllIllllIlIlI) {
        super(AttributeKey.names, llllllllllllIlIlllllllIllllIlIlI, new Object[AttributeKey.lllIIIllIlIlll[0]]);
    }
    
    private static void lIIllllIIIIlIlll() {
        (lllIIIllIlIlll = new int[1])[0] = ((0x2A ^ 0x76) & ~(0xFD ^ 0xA1));
    }
    
    public static <T> AttributeKey<T> valueOf(final String llllllllllllIlIlllllllIllllIlllI) {
        return new AttributeKey<T>(llllllllllllIlIlllllllIllllIlllI);
    }
}
