// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.Maps;
import java.util.Map;

public class LowerStringMap<V> implements Map<String, V>
{
    private final /* synthetic */ Map<String, V> internalMap;
    
    @Override
    public boolean containsValue(final Object lllllllllllllIlIIIIllIIlIlIlIlIl) {
        return this.internalMap.containsKey(lllllllllllllIlIIIIllIIlIlIlIlIl);
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends V> lllllllllllllIlIIIIllIIlIIlllIII) {
        final short lllllllllllllIlIIIIllIIlIIllIIll = (short)lllllllllllllIlIIIIllIIlIIlllIII.entrySet().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIIIIlIllIlIl(((Iterator)lllllllllllllIlIIIIllIIlIIllIIll).hasNext() ? 1 : 0)) {
            final Entry<? extends String, ? extends V> lllllllllllllIlIIIIllIIlIIllIlll = ((Iterator<Entry<? extends String, ? extends V>>)lllllllllllllIlIIIIllIIlIIllIIll).next();
            this.put((String)lllllllllllllIlIIIIllIIlIIllIlll.getKey(), lllllllllllllIlIIIIllIIlIIllIlll.getValue());
            "".length();
        }
    }
    
    @Override
    public boolean containsKey(final Object lllllllllllllIlIIIIllIIlIlIllIIl) {
        return this.internalMap.containsKey(lllllllllllllIlIIIIllIIlIlIllIIl.toString().toLowerCase());
    }
    
    @Override
    public V get(final Object lllllllllllllIlIIIIllIIlIlIIllll) {
        return this.internalMap.get(lllllllllllllIlIIIIllIIlIlIIllll.toString().toLowerCase());
    }
    
    @Override
    public void clear() {
        this.internalMap.clear();
    }
    
    private static boolean llIIIIIlIllIlIl(final int lllllllllllllIlIIIIllIIlIIIlllll) {
        return lllllllllllllIlIIIIllIIlIIIlllll == 0;
    }
    
    @Override
    public V remove(final Object lllllllllllllIlIIIIllIIlIIlllllI) {
        return this.internalMap.remove(lllllllllllllIlIIIIllIIlIIlllllI.toString().toLowerCase());
    }
    
    public LowerStringMap() {
        this.internalMap = (Map<String, V>)Maps.newLinkedHashMap();
    }
    
    @Override
    public int size() {
        return this.internalMap.size();
    }
    
    @Override
    public Collection<V> values() {
        return this.internalMap.values();
    }
    
    @Override
    public V put(final String lllllllllllllIlIIIIllIIlIlIIIlIl, final V lllllllllllllIlIIIIllIIlIlIIIlll) {
        return this.internalMap.put(lllllllllllllIlIIIIllIIlIlIIIlIl.toLowerCase(), lllllllllllllIlIIIIllIIlIlIIIlll);
    }
    
    @Override
    public Set<Entry<String, V>> entrySet() {
        return this.internalMap.entrySet();
    }
    
    @Override
    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }
    
    @Override
    public Set<String> keySet() {
        return this.internalMap.keySet();
    }
}
