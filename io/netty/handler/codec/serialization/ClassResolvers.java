// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import io.netty.util.internal.PlatformDependent;
import java.util.Map;
import java.lang.ref.Reference;
import java.util.HashMap;

public final class ClassResolvers
{
    private static boolean llIIllIlIIIlIll(final Object lllllllllllllIIllIlllIllIIIIIIlI) {
        return lllllllllllllIIllIlllIllIIIIIIlI != null;
    }
    
    public static ClassResolver softCachingResolver(final ClassLoader lllllllllllllIIllIlllIllIIIlIIll) {
        return new CachingClassResolver(new ClassLoaderClassResolver(defaultClassLoader(lllllllllllllIIllIlllIllIIIlIIll)), new SoftReferenceMap<String, Class<?>>(new HashMap<String, Reference<Class<?>>>()));
    }
    
    static ClassLoader defaultClassLoader(final ClassLoader lllllllllllllIIllIlllIllIIIIlIII) {
        if (llIIllIlIIIlIll(lllllllllllllIIllIlllIllIIIIlIII)) {
            return lllllllllllllIIllIlllIllIIIIlIII;
        }
        final ClassLoader lllllllllllllIIllIlllIllIIIIlIIl = PlatformDependent.getContextClassLoader();
        if (llIIllIlIIIlIll(lllllllllllllIIllIlllIllIIIIlIIl)) {
            return lllllllllllllIIllIlllIllIIIIlIIl;
        }
        return PlatformDependent.getClassLoader(ClassResolvers.class);
    }
    
    public static ClassResolver weakCachingResolver(final ClassLoader lllllllllllllIIllIlllIllIIIlIlll) {
        return new CachingClassResolver(new ClassLoaderClassResolver(defaultClassLoader(lllllllllllllIIllIlllIllIIIlIlll)), new WeakReferenceMap<String, Class<?>>(new HashMap<String, Reference<Class<?>>>()));
    }
    
    public static ClassResolver softCachingConcurrentResolver(final ClassLoader lllllllllllllIIllIlllIllIIIIllIl) {
        return new CachingClassResolver(new ClassLoaderClassResolver(defaultClassLoader(lllllllllllllIIllIlllIllIIIIllIl)), new SoftReferenceMap<String, Class<?>>((Map<String, Reference<Class<?>>>)PlatformDependent.newConcurrentHashMap()));
    }
    
    private ClassResolvers() {
    }
    
    public static ClassResolver weakCachingConcurrentResolver(final ClassLoader lllllllllllllIIllIlllIllIIIlIIIl) {
        return new CachingClassResolver(new ClassLoaderClassResolver(defaultClassLoader(lllllllllllllIIllIlllIllIIIlIIIl)), new WeakReferenceMap<String, Class<?>>((Map<String, Reference<Class<?>>>)PlatformDependent.newConcurrentHashMap()));
    }
    
    public static ClassResolver cacheDisabled(final ClassLoader lllllllllllllIIllIlllIllIIIllIIl) {
        return new ClassLoaderClassResolver(defaultClassLoader(lllllllllllllIIllIlllIllIIIllIIl));
    }
}
