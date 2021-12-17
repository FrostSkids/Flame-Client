// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import com.google.common.collect.Maps;
import java.util.Map;

public class MapPopulator
{
    public static <K, V> Map<K, V> createMap(final Iterable<K> llllllllllllIllIlIIIllIIIlIIIIlI, final Iterable<V> llllllllllllIllIlIIIllIIIlIIIIll) {
        return populateMap(llllllllllllIllIlIIIllIIIlIIIIlI, llllllllllllIllIlIIIllIIIlIIIIll, Maps.newLinkedHashMap());
    }
    
    private static boolean lIIlIlIllllllIII(final int llllllllllllIllIlIIIllIIIIlIllII) {
        return llllllllllllIllIlIIIllIIIIlIllII == 0;
    }
    
    private static boolean lIIlIlIllllllIIl(final int llllllllllllIllIlIIIllIIIIlIlllI) {
        return llllllllllllIllIlIIIllIIIIlIlllI != 0;
    }
    
    public static <K, V> Map<K, V> populateMap(final Iterable<K> llllllllllllIllIlIIIllIIIIlllIlI, final Iterable<V> llllllllllllIllIlIIIllIIIIlllIIl, final Map<K, V> llllllllllllIllIlIIIllIIIIlllIII) {
        final Iterator<V> llllllllllllIllIlIIIllIIIIllIlll = llllllllllllIllIlIIIllIIIIlllIIl.iterator();
        final short llllllllllllIllIlIIIllIIIIllIIII = (short)llllllllllllIllIlIIIllIIIIlllIlI.iterator();
        "".length();
        if (-"  ".length() >= 0) {
            return null;
        }
        while (!lIIlIlIllllllIII(((Iterator)llllllllllllIllIlIIIllIIIIllIIII).hasNext() ? 1 : 0)) {
            final K llllllllllllIllIlIIIllIIIIllIllI = ((Iterator<K>)llllllllllllIllIlIIIllIIIIllIIII).next();
            llllllllllllIllIlIIIllIIIIlllIII.put(llllllllllllIllIlIIIllIIIIllIllI, llllllllllllIllIlIIIllIIIIllIlll.next());
            "".length();
        }
        if (lIIlIlIllllllIIl(llllllllllllIllIlIIIllIIIIllIlll.hasNext() ? 1 : 0)) {
            throw new NoSuchElementException();
        }
        return llllllllllllIllIlIIIllIIIIlllIII;
    }
}
