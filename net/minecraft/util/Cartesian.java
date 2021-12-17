// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.NoSuchElementException;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import java.util.List;

public class Cartesian
{
    private static <T> Iterable<List<T>> arraysAsLists(final Iterable<Object[]> lllllllllllllIIlIlIIllIIIlllIlll) {
        return (Iterable<List<T>>)Iterables.transform((Iterable)lllllllllllllIIlIlIIllIIIlllIlll, (Function)new GetList(null));
    }
    
    private static boolean llIllIIllllIllI(final int lllllllllllllIIlIlIIllIIIlIlllIl) {
        return lllllllllllllIIlIlIIllIIIlIlllIl == 0;
    }
    
    public static <T> Iterable<T[]> cartesianProduct(final Class<T> lllllllllllllIIlIlIIllIIlIIIIIII, final Iterable<? extends Iterable<? extends T>> lllllllllllllIIlIlIIllIIIlllllll) {
        return new Product<T>(lllllllllllllIIlIlIIllIIlIIIIIII, toArray((Class<? super Iterable>)Iterable.class, (Iterable<? extends Iterable>)lllllllllllllIIlIlIIllIIIlllllll), null);
    }
    
    public static <T> Iterable<List<T>> cartesianProduct(final Iterable<? extends Iterable<? extends T>> lllllllllllllIIlIlIIllIIIllllIlI) {
        return (Iterable<List<T>>)arraysAsLists(cartesianProduct(Object.class, lllllllllllllIIlIlIIllIIIllllIlI));
    }
    
    private static <T> T[] createArray(final Class<? super T> lllllllllllllIIlIlIIllIIIllIIllI, final int lllllllllllllIIlIlIIllIIIllIIIll) {
        return (T[])Array.newInstance(lllllllllllllIIlIlIIllIIIllIIllI, lllllllllllllIIlIlIIllIIIllIIIll);
    }
    
    private static <T> T[] toArray(final Class<? super T> lllllllllllllIIlIlIIllIIIllIllIl, final Iterable<? extends T> lllllllllllllIIlIlIIllIIIllIllII) {
        final List<T> lllllllllllllIIlIlIIllIIIllIllll = (List<T>)Lists.newArrayList();
        final char lllllllllllllIIlIlIIllIIIllIlIIl = (char)lllllllllllllIIlIlIIllIIIllIllII.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIllIIllllIllI(((Iterator)lllllllllllllIIlIlIIllIIIllIlIIl).hasNext() ? 1 : 0)) {
            final T lllllllllllllIIlIlIIllIIIllIlllI = ((Iterator<T>)lllllllllllllIIlIlIIllIIIllIlIIl).next();
            lllllllllllllIIlIlIIllIIIllIllll.add(lllllllllllllIIlIlIIllIIIllIlllI);
            "".length();
        }
        return lllllllllllllIIlIlIIllIIIllIllll.toArray(createArray(lllllllllllllIIlIlIIllIIIllIllIl, lllllllllllllIIlIlIIllIIIllIllll.size()));
    }
    
    static class GetList<T> implements Function<Object[], List<T>>
    {
        public List<T> apply(final Object[] llllllllllllIlllIIlIlIlIllIlIllI) {
            return Arrays.asList((T[])llllllllllllIlllIIlIlIlIllIlIllI);
        }
        
        private GetList() {
        }
    }
    
    static class Product<T> implements Iterable<T[]>
    {
        private static final /* synthetic */ int[] lIIlIIlllIllll;
        private final /* synthetic */ Iterable<? extends T>[] iterables;
        private final /* synthetic */ Class<T> clazz;
        
        private static boolean llIIlllIlIllIII(final int lllllllllllllIIllIlIllllIlIlIlll) {
            return lllllllllllllIIllIlIllllIlIlIlll <= 0;
        }
        
        private static void llIIlllIlIlIlll() {
            (lIIlIIlllIllll = new int[1])[0] = ((0x25 ^ 0x58 ^ (0x43 ^ 0x25)) & (0x25 ^ 0x6B ^ (0x6A ^ 0x3F) ^ -" ".length()));
        }
        
        static {
            llIIlllIlIlIlll();
        }
        
        private Product(final Class<T> lllllllllllllIIllIlIllllIllIIllI, final Iterable<? extends T>[] lllllllllllllIIllIlIllllIllIIlIl) {
            this.clazz = lllllllllllllIIllIlIllllIllIIllI;
            this.iterables = lllllllllllllIIllIlIllllIllIIlIl;
        }
        
        @Override
        public Iterator<T[]> iterator() {
            Object iterator;
            if (llIIlllIlIllIII(this.iterables.length)) {
                iterator = Collections.singletonList(createArray(this.clazz, Product.lIIlIIlllIllll[0])).iterator();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                iterator = new ProductIterator(this.clazz, this.iterables, null);
            }
            return (Iterator<T[]>)iterator;
        }
        
        static class ProductIterator<T> extends UnmodifiableIterator<T[]>
        {
            private final /* synthetic */ Iterator<? extends T>[] iterators;
            private final /* synthetic */ Iterable<? extends T>[] iterables;
            private final /* synthetic */ T[] results;
            private static final /* synthetic */ int[] llIIIIIllIllll;
            private /* synthetic */ int index;
            
            private static boolean lIIIIlllIllIIIll(final int llllllllllllIlllIlllIllIlllIllll) {
                return llllllllllllIlllIlllIllIlllIllll == 0;
            }
            
            private static boolean lIIIIlllIllIIllI(final int llllllllllllIlllIlllIllIlllIllIl) {
                return llllllllllllIlllIlllIllIlllIllIl >= 0;
            }
            
            public boolean hasNext() {
                if (lIIIIlllIllIIIlI(this.index, ProductIterator.llIIIIIllIllll[0])) {
                    this.index = ProductIterator.llIIIIIllIllll[1];
                    final int llllllllllllIlllIlllIlllIIIIIllI;
                    final char llllllllllllIlllIlllIlllIIIIIlll = (char)((Iterator<? extends T>[])(Object)(llllllllllllIlllIlllIlllIIIIIllI = (int)(Object)this.iterators)).length;
                    short llllllllllllIlllIlllIlllIIIIlIII = (short)ProductIterator.llIIIIIllIllll[1];
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return ((0x40 ^ 0x6C) & ~(0xB5 ^ 0x99)) != 0x0;
                    }
                    while (!lIIIIlllIllIIIIl(llllllllllllIlllIlllIlllIIIIlIII, llllllllllllIlllIlllIlllIIIIIlll)) {
                        final Iterator<? extends T> llllllllllllIlllIlllIlllIIIIllII = llllllllllllIlllIlllIlllIIIIIllI[llllllllllllIlllIlllIlllIIIIlIII];
                        if (lIIIIlllIllIIIll(llllllllllllIlllIlllIlllIIIIllII.hasNext() ? 1 : 0)) {
                            this.endOfData();
                            "".length();
                            if (null != null) {
                                return ((0x31 ^ 0x74 ^ (0x15 ^ 0x30)) & (219 + 192 - 334 + 154 ^ 66 + 9 - 73 + 133 ^ -" ".length())) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIlllIlllIlllIIIIlIII;
                        }
                    }
                    return ProductIterator.llIIIIIllIllll[3] != 0;
                }
                else {
                    if (lIIIIlllIllIIIIl(this.index, this.iterators.length)) {
                        this.index = this.iterators.length - ProductIterator.llIIIIIllIllll[3];
                        "".length();
                        if ((0x8 ^ 0x18 ^ (0x70 ^ 0x64)) < 0) {
                            return ((176 + 186 - 266 + 101 ^ 20 + 23 - 32 + 126) & (0x8 ^ 0x73 ^ (0xBE ^ 0x89) ^ -" ".length())) != 0x0;
                        }
                        while (!lIIIIlllIllIIlIl(this.index)) {
                            Iterator<? extends T> llllllllllllIlllIlllIlllIIIIlIll = this.iterators[this.index];
                            if (lIIIIlllIllIIlII(llllllllllllIlllIlllIlllIIIIlIll.hasNext() ? 1 : 0)) {
                                "".length();
                                if (" ".length() == 0) {
                                    return ((0x7B ^ 0x3E ^ (0x10 ^ 0x34)) & (0x77 ^ 0x43 ^ (0xDD ^ 0x88) ^ -" ".length())) != 0x0;
                                }
                                break;
                            }
                            else if (lIIIIlllIllIIIll(this.index)) {
                                this.endOfData();
                                "".length();
                                if (-" ".length() > 0) {
                                    return ((0x2F ^ 0x1D ^ (0xBE ^ 0xA3)) & (111 + 93 - 181 + 117 ^ 147 + 162 - 165 + 19 ^ -" ".length())) != 0x0;
                                }
                                break;
                            }
                            else {
                                llllllllllllIlllIlllIlllIIIIlIll = this.iterables[this.index].iterator();
                                this.iterators[this.index] = llllllllllllIlllIlllIlllIIIIlIll;
                                if (lIIIIlllIllIIIll(llllllllllllIlllIlllIlllIIIIlIll.hasNext() ? 1 : 0)) {
                                    this.endOfData();
                                    "".length();
                                    if (null != null) {
                                        return ((0xC5 ^ 0x82) & ~(0x79 ^ 0x3E)) != 0x0;
                                    }
                                    break;
                                }
                                else {
                                    this.index -= ProductIterator.llIIIIIllIllll[3];
                                }
                            }
                        }
                    }
                    if (lIIIIlllIllIIllI(this.index)) {
                        return ProductIterator.llIIIIIllIllll[3] != 0;
                    }
                    return ProductIterator.llIIIIIllIllll[1] != 0;
                }
            }
            
            private static boolean lIIIIlllIllIIlII(final int llllllllllllIlllIlllIllIllllIIIl) {
                return llllllllllllIlllIlllIllIllllIIIl != 0;
            }
            
            static {
                lIIIIlllIllIIIII();
            }
            
            private static boolean lIIIIlllIllIIlIl(final int llllllllllllIlllIlllIllIlllIlIll) {
                return llllllllllllIlllIlllIllIlllIlIll < 0;
            }
            
            private static void lIIIIlllIllIIIII() {
                (llIIIIIllIllll = new int[4])[0] = -"  ".length();
                ProductIterator.llIIIIIllIllll[1] = ((112 + 73 - 81 + 35 ^ 86 + 51 - 9 + 22) & (154 + 156 - 236 + 148 ^ 33 + 24 + 2 + 136 ^ -" ".length()) & (((0xE2 ^ 0xAA ^ (0x6C ^ 0x5)) & (0x2 ^ 0x70 ^ (0xE9 ^ 0xBA) ^ -" ".length())) ^ -" ".length()));
                ProductIterator.llIIIIIllIllll[2] = -" ".length();
                ProductIterator.llIIIIIllIllll[3] = " ".length();
            }
            
            public T[] next() {
                if (lIIIIlllIllIIIll(this.hasNext() ? 1 : 0)) {
                    throw new NoSuchElementException();
                }
                while (!lIIIIlllIllIIIIl(this.index, this.iterators.length)) {
                    this.results[this.index] = (T)this.iterators[this.index].next();
                    this.index += ProductIterator.llIIIIIllIllll[3];
                }
                return this.results.clone();
            }
            
            private ProductIterator(final Class<T> llllllllllllIlllIlllIlllIIIlllII, final Iterable<? extends T>[] llllllllllllIlllIlllIlllIIIllIll) {
                this.index = ProductIterator.llIIIIIllIllll[0];
                this.iterables = llllllllllllIlllIlllIlllIIIllIll;
                this.iterators = (Iterator<? extends T>[])createArray(Iterator.class, this.iterables.length);
                int llllllllllllIlllIlllIlllIIIllIlI = ProductIterator.llIIIIIllIllll[1];
                "".length();
                if ((0x9 ^ 0xD) == 0x0) {
                    throw null;
                }
                while (!lIIIIlllIllIIIIl(llllllllllllIlllIlllIlllIIIllIlI, this.iterables.length)) {
                    this.iterators[llllllllllllIlllIlllIlllIIIllIlI] = llllllllllllIlllIlllIlllIIIllIll[llllllllllllIlllIlllIlllIIIllIlI].iterator();
                    ++llllllllllllIlllIlllIlllIIIllIlI;
                }
                this.results = (T[])createArray(llllllllllllIlllIlllIlllIIIlllII, this.iterators.length);
            }
            
            private static boolean lIIIIlllIllIIIIl(final int llllllllllllIlllIlllIllIllllIlII, final int llllllllllllIlllIlllIllIllllIIll) {
                return llllllllllllIlllIlllIllIllllIlII >= llllllllllllIlllIlllIllIllllIIll;
            }
            
            private void endOfData() {
                this.index = ProductIterator.llIIIIIllIllll[2];
                Arrays.fill(this.iterators, null);
                Arrays.fill(this.results, null);
            }
            
            private static boolean lIIIIlllIllIIIlI(final int llllllllllllIlllIlllIllIlllllIII, final int llllllllllllIlllIlllIllIllllIlll) {
                return llllllllllllIlllIlllIllIlllllIII == llllllllllllIlllIlllIllIllllIlll;
            }
        }
    }
}
