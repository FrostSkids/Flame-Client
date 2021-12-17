// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.Iterators;
import com.google.common.base.Predicates;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.IdentityHashMap;

public class ObjectIntIdentityMap<T> implements IObjectIntIterable<T>
{
    private static final /* synthetic */ int[] lIIlIIIIIIlIll;
    private final /* synthetic */ IdentityHashMap<T, Integer> identityMap;
    private final /* synthetic */ List<T> objectList;
    
    private static boolean llIIlIIlIIIIIlI(final int lllllllllllllIIlllIllllIlIIlIIll) {
        return lllllllllllllIIlllIllllIlIIlIIll >= 0;
    }
    
    public ObjectIntIdentityMap() {
        this.identityMap = new IdentityHashMap<T, Integer>(ObjectIntIdentityMap.lIIlIIIIIIlIll[0]);
        this.objectList = (List<T>)Lists.newArrayList();
    }
    
    private static boolean llIIlIIlIIIIIII(final int lllllllllllllIIlllIllllIlIIllIII, final int lllllllllllllIIlllIllllIlIIlIlll) {
        return lllllllllllllIIlllIllllIlIIllIII > lllllllllllllIIlllIllllIlIIlIlll;
    }
    
    public int get(final T lllllllllllllIIlllIllllIlIlIlIIl) {
        final Integer lllllllllllllIIlllIllllIlIlIlIll = this.identityMap.get(lllllllllllllIIlllIllllIlIlIlIIl);
        int intValue;
        if (llIIlIIlIIIIIIl(lllllllllllllIIlllIllllIlIlIlIll)) {
            intValue = ObjectIntIdentityMap.lIIlIIIIIIlIll[1];
            "".length();
            if ("   ".length() < 0) {
                return (136 + 61 - 98 + 91 ^ 58 + 134 - 69 + 44) & (130 + 40 - 70 + 50 ^ 11 + 130 - 10 + 12 ^ -" ".length());
            }
        }
        else {
            intValue = lllllllllllllIIlllIllllIlIlIlIll;
        }
        return intValue;
    }
    
    private static boolean llIIlIIlIIIIIll(final int lllllllllllllIIlllIllllIlIIlllII, final int lllllllllllllIIlllIllllIlIIllIll) {
        return lllllllllllllIIlllIllllIlIIlllII < lllllllllllllIIlllIllllIlIIllIll;
    }
    
    public final T getByValue(final int lllllllllllllIIlllIllllIlIlIIIlI) {
        T value;
        if (llIIlIIlIIIIIlI(lllllllllllllIIlllIllllIlIlIIIlI) && llIIlIIlIIIIIll(lllllllllllllIIlllIllllIlIlIIIlI, this.objectList.size())) {
            value = this.objectList.get(lllllllllllllIIlllIllllIlIlIIIlI);
            "".length();
            if (((0xC ^ 0x6C) & ~(0xE5 ^ 0x85)) == "   ".length()) {
                return null;
            }
        }
        else {
            value = null;
        }
        return value;
    }
    
    private static void llIIlIIIlllllll() {
        (lIIlIIIIIIlIll = new int[2])[0] = (-(0xFFFFB59D & 0x7E6F) & (0xFFFFFF0D & 0x36FE));
        ObjectIntIdentityMap.lIIlIIIIIIlIll[1] = -" ".length();
    }
    
    private static boolean llIIlIIlIIIIIIl(final Object lllllllllllllIIlllIllllIlIIlIlIl) {
        return lllllllllllllIIlllIllllIlIIlIlIl == null;
    }
    
    static {
        llIIlIIIlllllll();
    }
    
    public void put(final T lllllllllllllIIlllIllllIlIllIlIl, final int lllllllllllllIIlllIllllIlIllIIIl) {
        this.identityMap.put(lllllllllllllIIlllIllllIlIllIlIl, lllllllllllllIIlllIllllIlIllIIIl);
        "".length();
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llIIlIIlIIIIIII(this.objectList.size(), lllllllllllllIIlllIllllIlIllIIIl)) {
            this.objectList.add(null);
            "".length();
        }
        this.objectList.set(lllllllllllllIIlllIllllIlIllIIIl, lllllllllllllIIlllIllllIlIllIlIl);
        "".length();
    }
    
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)Iterators.filter((Iterator)this.objectList.iterator(), Predicates.notNull());
    }
}
