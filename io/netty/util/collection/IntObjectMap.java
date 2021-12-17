// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.collection;

public interface IntObjectMap<V>
{
    boolean containsValue(final V p0);
    
    void clear();
    
    Iterable<Entry<V>> entries();
    
    void putAll(final IntObjectMap<V> p0);
    
    V get(final int p0);
    
    int size();
    
    V remove(final int p0);
    
    V[] values(final Class<V> p0);
    
    boolean containsKey(final int p0);
    
    V put(final int p0, final V p1);
    
    int[] keys();
    
    boolean isEmpty();
    
    public interface Entry<V>
    {
        void setValue(final V p0);
        
        V value();
        
        int key();
    }
}
