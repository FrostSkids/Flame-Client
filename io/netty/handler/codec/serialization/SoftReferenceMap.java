// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.lang.ref.SoftReference;
import java.lang.ref.Reference;
import java.util.Map;

final class SoftReferenceMap<K, V> extends ReferenceMap<K, V>
{
    SoftReferenceMap(final Map<K, Reference<V>> llllllllllllIlllIlIllIIIIIIlllll) {
        super(llllllllllllIlllIlIllIIIIIIlllll);
    }
    
    @Override
    Reference<V> fold(final V llllllllllllIlllIlIllIIIIIIllIIl) {
        return new SoftReference<V>(llllllllllllIlllIlIllIIIIIIllIIl);
    }
}
