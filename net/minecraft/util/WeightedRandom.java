// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.util.Random;
import java.util.Collection;

public class WeightedRandom
{
    private static final /* synthetic */ int[] lIIlIIIIIIIIll;
    
    public static <T extends Item> T getRandomItem(final Collection<T> lllllllllllllIIlllIllllllIIlIIII, int lllllllllllllIIlllIllllllIIIllII) {
        final int lllllllllllllIIlllIllllllIIIlIlI = (int)lllllllllllllIIlllIllllllIIlIIII.iterator();
        "".length();
        if (-" ".length() >= " ".length()) {
            return null;
        }
        while (!llIIlIIIllIllll(((Iterator)lllllllllllllIIlllIllllllIIIlIlI).hasNext() ? 1 : 0)) {
            final T lllllllllllllIIlllIllllllIIIlllI = ((Iterator<T>)lllllllllllllIIlllIllllllIIIlIlI).next();
            lllllllllllllIIlllIllllllIIIllII -= lllllllllllllIIlllIllllllIIIlllI.itemWeight;
            if (llIIlIIIlllIIIl(lllllllllllllIIlllIllllllIIIllII)) {
                return lllllllllllllIIlllIllllllIIIlllI;
            }
        }
        return null;
    }
    
    private static boolean llIIlIIIlllIIIl(final int lllllllllllllIIlllIllllllIIIIIII) {
        return lllllllllllllIIlllIllllllIIIIIII < 0;
    }
    
    public static <T extends Item> T getRandomItem(final Random lllllllllllllIIlllIllllllIIllIII, final Collection<T> lllllllllllllIIlllIllllllIIllIll, final int lllllllllllllIIlllIllllllIIlIllI) {
        if (llIIlIIIlllIIII(lllllllllllllIIlllIllllllIIlIllI)) {
            throw new IllegalArgumentException();
        }
        final int lllllllllllllIIlllIllllllIIllIIl = lllllllllllllIIlllIllllllIIllIII.nextInt(lllllllllllllIIlllIllllllIIlIllI);
        return getRandomItem(lllllllllllllIIlllIllllllIIllIll, lllllllllllllIIlllIllllllIIllIIl);
    }
    
    private static boolean llIIlIIIllIllll(final int lllllllllllllIIlllIllllllIIIIIlI) {
        return lllllllllllllIIlllIllllllIIIIIlI == 0;
    }
    
    private static void llIIlIIIllIlllI() {
        (lIIlIIIIIIIIll = new int[1])[0] = ((0xA8 ^ 0x95) & ~(0x2A ^ 0x17));
    }
    
    public static int getTotalWeight(final Collection<? extends Item> lllllllllllllIIlllIllllllIlIIlll) {
        int lllllllllllllIIlllIllllllIlIIllI = WeightedRandom.lIIlIIIIIIIIll[0];
        final Exception lllllllllllllIIlllIllllllIlIIIIl = (Exception)lllllllllllllIIlllIllllllIlIIlll.iterator();
        "".length();
        if (-" ".length() > ((0xCB ^ 0x83) & ~(0x7E ^ 0x36))) {
            return (0x79 ^ 0x73) & ~(0x8B ^ 0x81);
        }
        while (!llIIlIIIllIllll(((Iterator)lllllllllllllIIlllIllllllIlIIIIl).hasNext() ? 1 : 0)) {
            final Item lllllllllllllIIlllIllllllIlIIlIl = ((Iterator<Item>)lllllllllllllIIlllIllllllIlIIIIl).next();
            lllllllllllllIIlllIllllllIlIIllI += lllllllllllllIIlllIllllllIlIIlIl.itemWeight;
        }
        return lllllllllllllIIlllIllllllIlIIllI;
    }
    
    public static <T extends Item> T getRandomItem(final Random lllllllllllllIIlllIllllllIIIIlll, final Collection<T> lllllllllllllIIlllIllllllIIIIlII) {
        return getRandomItem(lllllllllllllIIlllIllllllIIIIlll, lllllllllllllIIlllIllllllIIIIlII, getTotalWeight(lllllllllllllIIlllIllllllIIIIlII));
    }
    
    static {
        llIIlIIIllIlllI();
    }
    
    private static boolean llIIlIIIlllIIII(final int lllllllllllllIIlllIlllllIllllllI) {
        return lllllllllllllIIlllIlllllIllllllI <= 0;
    }
    
    public static class Item
    {
        protected /* synthetic */ int itemWeight;
        
        public Item(final int lllllllllllllIIllIllIIIllIllllIl) {
            this.itemWeight = lllllllllllllIIllIllIIIllIllllIl;
        }
    }
}
