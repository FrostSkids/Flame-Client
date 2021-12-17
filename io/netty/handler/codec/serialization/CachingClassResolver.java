// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.util.Map;

class CachingClassResolver implements ClassResolver
{
    private final /* synthetic */ Map<String, Class<?>> classCache;
    private final /* synthetic */ ClassResolver delegate;
    
    private static boolean lllIIIIlIllIIll(final Object lllllllllllllIIlIIIIlIIlIlllllII) {
        return lllllllllllllIIlIIIIlIIlIlllllII != null;
    }
    
    CachingClassResolver(final ClassResolver lllllllllllllIIlIIIIlIIllIIIlIll, final Map<String, Class<?>> lllllllllllllIIlIIIIlIIllIIIlIlI) {
        this.delegate = lllllllllllllIIlIIIIlIIllIIIlIll;
        this.classCache = lllllllllllllIIlIIIIlIIllIIIlIlI;
    }
    
    @Override
    public Class<?> resolve(final String lllllllllllllIIlIIIIlIIllIIIIIlI) throws ClassNotFoundException {
        Class<?> lllllllllllllIIlIIIIlIIllIIIIIIl = this.classCache.get(lllllllllllllIIlIIIIlIIllIIIIIlI);
        if (lllIIIIlIllIIll(lllllllllllllIIlIIIIlIIllIIIIIIl)) {
            return lllllllllllllIIlIIIIlIIllIIIIIIl;
        }
        lllllllllllllIIlIIIIlIIllIIIIIIl = this.delegate.resolve(lllllllllllllIIlIIIIlIIllIIIIIlI);
        this.classCache.put(lllllllllllllIIlIIIIlIIllIIIIIlI, lllllllllllllIIlIIIIlIIllIIIIIIl);
        "".length();
        return lllllllllllllIIlIIIIlIIllIIIIIIl;
    }
}
