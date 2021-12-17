// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

class ClassLoaderClassResolver implements ClassResolver
{
    private final /* synthetic */ ClassLoader classLoader;
    private static final /* synthetic */ int[] llIIIIIllIlIIl;
    
    static {
        lIIIIlllIlIllIII();
    }
    
    private static void lIIIIlllIlIllIII() {
        (llIIIIIllIlIIl = new int[1])[0] = ((0x30 ^ 0x0 ^ (0x4F ^ 0x3D)) & (39 + 108 + 47 + 41 ^ 2 + 5 + 70 + 92 ^ -" ".length()));
    }
    
    @Override
    public Class<?> resolve(final String llllllllllllIlllIlllIllllIIllIIl) throws ClassNotFoundException {
        try {
            return this.classLoader.loadClass(llllllllllllIlllIlllIllllIIllIIl);
        }
        catch (ClassNotFoundException llllllllllllIlllIlllIllllIIlllIl) {
            return Class.forName(llllllllllllIlllIlllIllllIIllIIl, (boolean)(ClassLoaderClassResolver.llIIIIIllIlIIl[0] != 0), this.classLoader);
        }
    }
    
    ClassLoaderClassResolver(final ClassLoader llllllllllllIlllIlllIllllIlIIIIl) {
        this.classLoader = llllllllllllIlllIlllIllllIlIIIIl;
    }
}
