// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.lang.ref.Reference;
import java.util.Map;

abstract class ReferenceMap<K, V> implements Map<K, V>
{
    private final /* synthetic */ Map<K, Reference<V>> delegate;
    
    @Override
    public V remove(final Object lllllllllllllIlIIIIlIlIlIlIlIIlI) {
        return this.unfold(this.delegate.remove(lllllllllllllIlIIIIlIlIlIlIlIIlI));
    }
    
    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public V put(final K lllllllllllllIlIIIIlIlIlIlIlllII, final V lllllllllllllIlIIIIlIlIlIlIllIll) {
        return this.unfold(this.delegate.put(lllllllllllllIlIIIIlIlIlIlIlllII, this.fold(lllllllllllllIlIIIIlIlIlIlIllIll)));
    }
    
    private static boolean llIIIIIllllIlII(final int lllllllllllllIlIIIIlIlIlIIlllIlI) {
        return lllllllllllllIlIIIIlIlIlIIlllIlI != 0;
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> lllllllllllllIlIIIIlIlIlIlIIlIlI) {
        final Iterator lllllllllllllIlIIIIlIlIlIlIIllII = lllllllllllllIlIIIIlIlIlIlIIlIlI.entrySet().iterator();
        while (llIIIIIllllIlII(lllllllllllllIlIIIIlIlIlIlIIllII.hasNext() ? 1 : 0)) {
            final Entry<? extends K, ? extends V> lllllllllllllIlIIIIlIlIlIlIIllIl = lllllllllllllIlIIIIlIlIlIlIIllII.next();
            this.delegate.put((K)lllllllllllllIlIIIIlIlIlIlIIllIl.getKey(), (Reference<V>)this.fold(lllllllllllllIlIIIIlIlIlIlIIllIl.getValue()));
            "".length();
            "".length();
            if ((0xC6 ^ 0xBB ^ (0xD1 ^ 0xA8)) == "  ".length()) {
                return;
            }
        }
    }
    
    abstract Reference<V> fold(final V p0);
    
    @Override
    public int size() {
        return this.delegate.size();
    }
    
    protected ReferenceMap(final Map<K, Reference<V>> lllllllllllllIlIIIIlIlIlIllllIIl) {
        this.delegate = lllllllllllllIlIIIIlIlIlIllllIIl;
    }
    
    @Override
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }
    
    @Override
    public void clear() {
        this.delegate.clear();
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }
    
    private static boolean llIIIIIllllIIll(final Object lllllllllllllIlIIIIlIlIlIIllllII) {
        return lllllllllllllIlIIIIlIlIlIIllllII == null;
    }
    
    @Override
    public boolean containsValue(final Object lllllllllllllIlIIIIlIlIlIllIIlll) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public V get(final Object lllllllllllllIlIIIIlIlIlIllIIIll) {
        return this.unfold(this.delegate.get(lllllllllllllIlIIIIlIlIlIllIIIll));
    }
    
    @Override
    public boolean containsKey(final Object lllllllllllllIlIIIIlIlIlIllIlIIl) {
        return this.delegate.containsKey(lllllllllllllIlIIIIlIlIlIllIlIIl);
    }
    
    @Override
    public Set<K> keySet() {
        return this.delegate.keySet();
    }
    
    private V unfold(final Reference<V> lllllllllllllIlIIIIlIlIlIlllIlIl) {
        if (llIIIIIllllIIll(lllllllllllllIlIIIIlIlIlIlllIlIl)) {
            return null;
        }
        return lllllllllllllIlIIIIlIlIlIlllIlIl.get();
    }
}
