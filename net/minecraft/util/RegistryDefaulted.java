// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class RegistryDefaulted<K, V> extends RegistrySimple<K, V>
{
    private final /* synthetic */ V defaultObject;
    
    private static boolean lIlIIlIlIlIlllIl(final Object llllllllllllIlIllIIIlIlIIlIlIIll) {
        return llllllllllllIlIllIIIlIlIIlIlIIll == null;
    }
    
    @Override
    public V getObject(final K llllllllllllIlIllIIIlIlIIlIlllII) {
        final V llllllllllllIlIllIIIlIlIIlIllIlI = super.getObject(llllllllllllIlIllIIIlIlIIlIlllII);
        V defaultObject;
        if (lIlIIlIlIlIlllIl(llllllllllllIlIllIIIlIlIIlIllIlI)) {
            defaultObject = this.defaultObject;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            defaultObject = llllllllllllIlIllIIIlIlIIlIllIlI;
        }
        return defaultObject;
    }
    
    public RegistryDefaulted(final V llllllllllllIlIllIIIlIlIIllIlIIl) {
        this.defaultObject = llllllllllllIlIllIIIlIlIIllIlIIl;
    }
}
