// 
// Decompiled by Procyon v0.5.36
// 

package client.event;

import java.util.Iterator;

public class ArrayHelper<T> implements Iterable<T>
{
    private /* synthetic */ T[] elements;
    private static final /* synthetic */ int[] lllIIIIIllIllI;
    
    public void clear() {
        this.elements = (T[])new Object[ArrayHelper.lllIIIIIllIllI[0]];
    }
    
    public T get(final int llllllllllllIllIIIIllIlIIllIIllI) {
        return this.array()[llllllllllllIllIIIIllIlIIllIIllI];
    }
    
    private static boolean lIIlllIIIlIIIlll(final int llllllllllllIllIIIIllIlIIlIlIlII, final int llllllllllllIllIIIIllIlIIlIlIIll) {
        return llllllllllllIllIIIIllIlIIlIlIlII < llllllllllllIllIIIIllIlIIlIlIIll;
    }
    
    public boolean contains(final T llllllllllllIllIIIIllIlIlIIIllll) {
        final Object[] llllllllllllIllIIIIllIlIlIIIlllI;
        final int llllllllllllIllIIIIllIlIlIIIllIl = (llllllllllllIllIIIIllIlIlIIIlllI = this.array()).length;
        int llllllllllllIllIIIIllIlIlIIIllII = ArrayHelper.lllIIIIIllIllI[0];
        "".length();
        if (((0x71 ^ 0x43 ^ (0x7B ^ 0x41)) & (0xBE ^ 0xC3 ^ (0x18 ^ 0x6D) ^ -" ".length())) < ((134 + 3 - 74 + 126 ^ 77 + 56 + 6 + 23) & ("   ".length() ^ (0x1D ^ 0x1) ^ -" ".length()))) {
            return ((0xCA ^ 0xBF ^ (0xEB ^ 0xC1)) & (200 + 1 - 79 + 104 ^ 13 + 131 + 35 + 10 ^ -" ".length())) != 0x0;
        }
        while (!lIIlllIIIlIIlIII(llllllllllllIllIIIIllIlIlIIIllII, llllllllllllIllIIIIllIlIlIIIllIl)) {
            final T llllllllllllIllIIIIllIlIlIIIlIll = (T)llllllllllllIllIIIIllIlIlIIIlllI[llllllllllllIllIIIIllIlIlIIIllII];
            if (lIIlllIIIlIIlIIl(llllllllllllIllIIIIllIlIlIIIlIll.equals(llllllllllllIllIIIIllIlIlIIIllll) ? 1 : 0)) {
                return ArrayHelper.lllIIIIIllIllI[1] != 0;
            }
            ++llllllllllllIllIIIIllIlIlIIIllII;
        }
        return ArrayHelper.lllIIIIIllIllI[0] != 0;
    }
    
    private static boolean lIIlllIIIlIIlIlI(final int llllllllllllIllIIIIllIlIIlIIllIl) {
        return llllllllllllIllIIIIllIlIIlIIllIl == 0;
    }
    
    private static boolean lIIlllIIIlIIIllI(final Object llllllllllllIllIIIIllIlIIlIlIIIl) {
        return llllllllllllIllIIIIllIlIIlIlIIIl != null;
    }
    
    public T[] array() {
        return this.elements;
    }
    
    public void add(final T llllllllllllIllIIIIllIlIlIIllIIl) {
        if (lIIlllIIIlIIIllI(llllllllllllIllIIIIllIlIlIIllIIl)) {
            final Object[] llllllllllllIllIIIIllIlIlIIlllII = new Object[this.size() + ArrayHelper.lllIIIIIllIllI[1]];
            int llllllllllllIllIIIIllIlIlIIllIll = ArrayHelper.lllIIIIIllIllI[0];
            "".length();
            if ((0x6B ^ 0x6F) == ((0x23 ^ 0x73) & ~(0x9 ^ 0x59))) {
                return;
            }
            while (!lIIlllIIIlIIlIII(llllllllllllIllIIIIllIlIlIIllIll, llllllllllllIllIIIIllIlIlIIlllII.length)) {
                if (lIIlllIIIlIIIlll(llllllllllllIllIIIIllIlIlIIllIll, this.size())) {
                    llllllllllllIllIIIIllIlIlIIlllII[llllllllllllIllIIIIllIlIlIIllIll] = this.get(llllllllllllIllIIIIllIlIlIIllIll);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIIIllIlIlIIlllII[llllllllllllIllIIIIllIlIlIIllIll] = llllllllllllIllIIIIllIlIlIIllIIl;
                }
                ++llllllllllllIllIIIIllIlIlIIllIll;
            }
            this.set(llllllllllllIllIIIIllIlIlIIlllII);
        }
    }
    
    private static boolean lIIlllIIIlIIlIIl(final int llllllllllllIllIIIIllIlIIlIIllll) {
        return llllllllllllIllIIIIllIlIIlIIllll != 0;
    }
    
    public ArrayHelper() {
        this.elements = (T[])new Object[ArrayHelper.lllIIIIIllIllI[0]];
    }
    
    public int size() {
        return this.array().length;
    }
    
    public void remove(final T llllllllllllIllIIIIllIlIIllllllI) {
        if (lIIlllIIIlIIlIIl(this.contains(llllllllllllIllIIIIllIlIIllllllI) ? 1 : 0)) {
            final Object[] llllllllllllIllIIIIllIlIIlllllIl = new Object[this.size() - ArrayHelper.lllIIIIIllIllI[1]];
            boolean llllllllllllIllIIIIllIlIIlllllII = ArrayHelper.lllIIIIIllIllI[1] != 0;
            int llllllllllllIllIIIIllIlIIllllIll = ArrayHelper.lllIIIIIllIllI[0];
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
            while (!lIIlllIIIlIIlIII(llllllllllllIllIIIIllIlIIllllIll, this.size())) {
                if (lIIlllIIIlIIlIIl(llllllllllllIllIIIIllIlIIlllllII ? 1 : 0) && lIIlllIIIlIIlIIl(this.get(llllllllllllIllIIIIllIlIIllllIll).equals(llllllllllllIllIIIIllIlIIllllllI) ? 1 : 0)) {
                    llllllllllllIllIIIIllIlIIlllllII = (ArrayHelper.lllIIIIIllIllI[0] != 0);
                    "".length();
                    if (((0x8C ^ 0xB7) & ~(0x2 ^ 0x39)) != 0x0) {
                        return;
                    }
                }
                else {
                    final Object[] array = llllllllllllIllIIIIllIlIIlllllIl;
                    int n;
                    if (lIIlllIIIlIIlIIl(llllllllllllIllIIIIllIlIIlllllII ? 1 : 0)) {
                        n = llllllllllllIllIIIIllIlIIllllIll;
                        "".length();
                        if ((0x6C ^ 0x69) == 0x0) {
                            return;
                        }
                    }
                    else {
                        n = llllllllllllIllIIIIllIlIIllllIll - ArrayHelper.lllIIIIIllIllI[1];
                    }
                    array[n] = this.get(llllllllllllIllIIIIllIlIIllllIll);
                }
                ++llllllllllllIllIIIIllIlIIllllIll;
            }
            this.set(llllllllllllIllIIIIllIlIIlllllIl);
        }
    }
    
    static {
        lIIlllIIIlIIIlIl();
    }
    
    private static boolean lIIlllIIIlIIlIII(final int llllllllllllIllIIIIllIlIIlIllIII, final int llllllllllllIllIIIIllIlIIlIlIlll) {
        return llllllllllllIllIIIIllIlIIlIllIII >= llllllllllllIllIIIIllIlIIlIlIlll;
    }
    
    public void set(final T[] llllllllllllIllIIIIllIlIIllIlIlI) {
        this.elements = llllllllllllIllIIIIllIlIIllIlIlI;
    }
    
    private static void lIIlllIIIlIIIlIl() {
        (lllIIIIIllIllI = new int[2])[0] = ((0x2F ^ 0x14) & ~(0x30 ^ 0xB));
        ArrayHelper.lllIIIIIllIllI[1] = " ".length();
    }
    
    public boolean isEmpty() {
        if (lIIlllIIIlIIlIlI(this.size())) {
            return ArrayHelper.lllIIIIIllIllI[1] != 0;
        }
        return ArrayHelper.lllIIIIIllIllI[0] != 0;
    }
    
    public ArrayHelper(final T[] llllllllllllIllIIIIllIlIlIlIlIII) {
        this.elements = llllllllllllIllIIIIllIlIlIlIlIII;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private /* synthetic */ int index = ArrayHelper$1.llllIIlIlIlIl[0];
            private static final /* synthetic */ int[] llllIIlIlIlIl;
            
            static {
                lIlIlIIIlIIlIIl();
            }
            
            private static boolean lIlIlIIIlIIlIlI(final int lllllllllllllIlIlllIIlIlllIlllll, final int lllllllllllllIlIlllIIlIlllIllllI) {
                return lllllllllllllIlIlllIIlIlllIlllll < lllllllllllllIlIlllIIlIlllIllllI;
            }
            
            @Override
            public void remove() {
                ArrayHelper.this.remove(ArrayHelper.this.get(this.index));
            }
            
            private static boolean lIlIlIIIlIIlIll(final Object lllllllllllllIlIlllIIlIlllIlllII) {
                return lllllllllllllIlIlllIIlIlllIlllII != null;
            }
            
            private static void lIlIlIIIlIIlIIl() {
                (llllIIlIlIlIl = new int[2])[0] = ((0xEA ^ 0xC3 ^ (0xBC ^ 0x90)) & (58 + 150 - 189 + 172 ^ 3 + 81 + 38 + 64 ^ -" ".length()));
                ArrayHelper$1.llllIIlIlIlIl[1] = " ".length();
            }
            
            @Override
            public T next() {
                final ArrayHelper this$0 = ArrayHelper.this;
                final int index = this.index;
                this.index = index + ArrayHelper$1.llllIIlIlIlIl[1];
                return this$0.get(index);
            }
            
            @Override
            public boolean hasNext() {
                if (lIlIlIIIlIIlIlI(this.index, ArrayHelper.this.size()) && lIlIlIIIlIIlIll(ArrayHelper.this.get(this.index))) {
                    return ArrayHelper$1.llllIIlIlIlIl[1] != 0;
                }
                return ArrayHelper$1.llllIIlIlIlIl[0] != 0;
            }
        };
    }
}
