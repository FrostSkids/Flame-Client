// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import com.google.common.collect.BiMap;
import java.util.Map;

public class RegistryNamespaced<K, V> extends RegistrySimple<K, V> implements IObjectIntIterable<V>
{
    protected final /* synthetic */ ObjectIntIdentityMap<V> underlyingIntegerMap;
    protected final /* synthetic */ Map<V, K> inverseObjectRegistry;
    
    public K getNameForObject(final V lllllllllllllIlIIlIlIIIIlIIllIlI) {
        return this.inverseObjectRegistry.get(lllllllllllllIlIIlIlIIIIlIIllIlI);
    }
    
    public RegistryNamespaced() {
        this.underlyingIntegerMap = new ObjectIntIdentityMap<V>();
        this.inverseObjectRegistry = (Map<V, K>)((BiMap)this.registryObjects).inverse();
    }
    
    @Override
    public boolean containsKey(final K lllllllllllllIlIIlIlIIIIlIIlIIlI) {
        return super.containsKey(lllllllllllllIlIIlIlIIIIlIIlIIlI);
    }
    
    @Override
    public V getObject(final K lllllllllllllIlIIlIlIIIIlIIllllI) {
        return super.getObject(lllllllllllllIlIIlIlIIIIlIIllllI);
    }
    
    public int getIDForObject(final V lllllllllllllIlIIlIlIIIIlIIIllII) {
        return this.underlyingIntegerMap.get(lllllllllllllIlIIlIlIIIIlIIIllII);
    }
    
    @Override
    public Iterator<V> iterator() {
        return this.underlyingIntegerMap.iterator();
    }
    
    public V getObjectById(final int lllllllllllllIlIIlIlIIIIlIIIIllI) {
        return this.underlyingIntegerMap.getByValue(lllllllllllllIlIIlIlIIIIlIIIIllI);
    }
    
    public void register(final int lllllllllllllIlIIlIlIIIIlIlIlIll, final K lllllllllllllIlIIlIlIIIIlIlIIllI, final V lllllllllllllIlIIlIlIIIIlIlIIlIl) {
        this.underlyingIntegerMap.put(lllllllllllllIlIIlIlIIIIlIlIIlIl, lllllllllllllIlIIlIlIIIIlIlIlIll);
        this.putObject(lllllllllllllIlIIlIlIIIIlIlIIllI, lllllllllllllIlIIlIlIIIIlIlIIlIl);
    }
    
    @Override
    protected Map<K, V> createUnderlyingMap() {
        return (Map<K, V>)HashBiMap.create();
    }
}
