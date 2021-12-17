// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.util.AbstractSet;

public final class ConcurrentSet<E> extends AbstractSet<E> implements Serializable
{
    private static final /* synthetic */ int[] llIIIlllllllll;
    private final /* synthetic */ ConcurrentMap<E, Boolean> map;
    
    private static boolean lIIIlIllIllIllll(final Object llllllllllllIlllIIlllIlIIlIIIlIl) {
        return llllllllllllIlllIIlllIlIIlIIIlIl == null;
    }
    
    @Override
    public void clear() {
        this.map.clear();
    }
    
    static {
        lIIIlIllIllIlllI();
    }
    
    @Override
    public boolean contains(final Object llllllllllllIlllIIlllIlIIlIlllIl) {
        return this.map.containsKey(llllllllllllIlllIIlllIlIIlIlllIl);
    }
    
    @Override
    public int size() {
        return this.map.size();
    }
    
    @Override
    public boolean add(final E llllllllllllIlllIIlllIlIIlIlIlIl) {
        int n;
        if (lIIIlIllIllIllll(this.map.putIfAbsent(llllllllllllIlllIIlllIlIIlIlIlIl, Boolean.TRUE))) {
            n = ConcurrentSet.llIIIlllllllll[0];
            "".length();
            if ("   ".length() <= ((0xCC ^ 0x91) & ~(0x99 ^ 0xC4))) {
                return ((0x90 ^ 0xA9) & ~(0x13 ^ 0x2A)) != 0x0;
            }
        }
        else {
            n = ConcurrentSet.llIIIlllllllll[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIllIlllIIII(final Object llllllllllllIlllIIlllIlIIlIIIlll) {
        return llllllllllllIlllIIlllIlIIlIIIlll != null;
    }
    
    @Override
    public boolean remove(final Object llllllllllllIlllIIlllIlIIlIIllll) {
        int n;
        if (lIIIlIllIlllIIII(this.map.remove(llllllllllllIlllIIlllIlIIlIIllll))) {
            n = ConcurrentSet.llIIIlllllllll[0];
            "".length();
            if ("  ".length() < 0) {
                return ((0x8F ^ 0xA8) & ~(0x41 ^ 0x66)) != 0x0;
            }
        }
        else {
            n = ConcurrentSet.llIIIlllllllll[1];
        }
        return n != 0;
    }
    
    public ConcurrentSet() {
        this.map = PlatformDependent.newConcurrentHashMap();
    }
    
    @Override
    public Iterator<E> iterator() {
        return this.map.keySet().iterator();
    }
    
    private static void lIIIlIllIllIlllI() {
        (llIIIlllllllll = new int[2])[0] = " ".length();
        ConcurrentSet.llIIIlllllllll[1] = ((0x59 ^ 0x11) & ~(0x10 ^ 0x58));
    }
}
