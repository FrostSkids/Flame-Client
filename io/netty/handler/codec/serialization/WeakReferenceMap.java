// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.util.Map;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;

final class WeakReferenceMap<K, V> extends ReferenceMap<K, V>
{
    @Override
    Reference<V> fold(final V lllllllllllllIlIIIIIIIlllIllllll) {
        return new WeakReference<V>(lllllllllllllIlIIIIIIIlllIllllll);
    }
    
    WeakReferenceMap(final Map<K, Reference<V>> lllllllllllllIlIIIIIIIllllIIIIll) {
        super(lllllllllllllIlIIIIIIIllllIIIIll);
    }
}
