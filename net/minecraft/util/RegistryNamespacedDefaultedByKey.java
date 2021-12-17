// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import org.apache.commons.lang3.Validate;

public class RegistryNamespacedDefaultedByKey<K, V> extends RegistryNamespaced<K, V>
{
    private /* synthetic */ V defaultValue;
    private final /* synthetic */ K defaultValueKey;
    
    public RegistryNamespacedDefaultedByKey(final K llllllllllllIllIIlIIlIlllIlIlIIl) {
        this.defaultValueKey = llllllllllllIllIIlIIlIlllIlIlIIl;
    }
    
    @Override
    public V getObject(final K llllllllllllIllIIlIIlIlllIIlIlIl) {
        final V llllllllllllIllIIlIIlIlllIIlIlII = super.getObject(llllllllllllIllIIlIIlIlllIIlIlIl);
        V defaultValue;
        if (lIIllIIllIIlIIlI(llllllllllllIllIIlIIlIlllIIlIlII)) {
            defaultValue = this.defaultValue;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            defaultValue = llllllllllllIllIIlIIlIlllIIlIlII;
        }
        return defaultValue;
    }
    
    @Override
    public void register(final int llllllllllllIllIIlIIlIlllIIlllll, final K llllllllllllIllIIlIIlIlllIlIIIlI, final V llllllllllllIllIIlIIlIlllIlIIIIl) {
        if (lIIllIIllIIlIIIl(this.defaultValueKey.equals(llllllllllllIllIIlIIlIlllIlIIIlI) ? 1 : 0)) {
            this.defaultValue = llllllllllllIllIIlIIlIlllIlIIIIl;
        }
        super.register(llllllllllllIllIIlIIlIlllIIlllll, llllllllllllIllIIlIIlIlllIlIIIlI, llllllllllllIllIIlIIlIlllIlIIIIl);
    }
    
    private static boolean lIIllIIllIIlIIIl(final int llllllllllllIllIIlIIlIlllIIIIlII) {
        return llllllllllllIllIIlIIlIlllIIIIlII != 0;
    }
    
    public void validateKey() {
        Validate.notNull((Object)this.defaultValueKey);
        "".length();
    }
    
    @Override
    public V getObjectById(final int llllllllllllIllIIlIIlIlllIIIlIIl) {
        final V llllllllllllIllIIlIIlIlllIIIlIll = super.getObjectById(llllllllllllIllIIlIIlIlllIIIlIIl);
        V defaultValue;
        if (lIIllIIllIIlIIlI(llllllllllllIllIIlIIlIlllIIIlIll)) {
            defaultValue = this.defaultValue;
            "".length();
            if ((29 + 143 - 105 + 111 ^ 7 + 32 + 124 + 19) < "   ".length()) {
                return null;
            }
        }
        else {
            defaultValue = llllllllllllIllIIlIIlIlllIIIlIll;
        }
        return defaultValue;
    }
    
    private static boolean lIIllIIllIIlIIlI(final Object llllllllllllIllIIlIIlIlllIIIIllI) {
        return llllllllllllIllIIlIIlIlllIIIIllI == null;
    }
}
