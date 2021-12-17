// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.AbstractSet;

public class ClassInheritanceMultiMap<T> extends AbstractSet<T>
{
    private static final /* synthetic */ Set<Class<?>> field_181158_a;
    private static final /* synthetic */ int[] llIIlllIllIIlI;
    private final /* synthetic */ List<T> field_181745_e;
    private final /* synthetic */ Class<T> baseClass;
    private static final /* synthetic */ String[] llIIlllIllIIIl;
    private final /* synthetic */ Map<Class<?>, List<T>> map;
    private final /* synthetic */ Set<Class<?>> knownKeys;
    
    protected Class<?> func_181157_b(final Class<?> llllllllllllIllIllllIIlIIllllIIl) {
        if (lIIIllllllIIlIlI(this.baseClass.isAssignableFrom(llllllllllllIllIllllIIlIIllllIIl) ? 1 : 0)) {
            if (lIIIllllllIIlIIl(this.knownKeys.contains(llllllllllllIllIllllIIlIIllllIIl) ? 1 : 0)) {
                this.createLookup(llllllllllllIllIllllIIlIIllllIIl);
            }
            return llllllllllllIllIllllIIlIIllllIIl;
        }
        throw new IllegalArgumentException(String.valueOf(new StringBuilder(ClassInheritanceMultiMap.llIIlllIllIIIl[ClassInheritanceMultiMap.llIIlllIllIIlI[0]]).append(llllllllllllIllIllllIIlIIllllIIl)));
    }
    
    private static boolean lIIIllllllIIlIIl(final int llllllllllllIllIllllIIlIIIlIIlIl) {
        return llllllllllllIllIllllIIlIIIlIIlIl == 0;
    }
    
    public ClassInheritanceMultiMap(final Class<T> llllllllllllIllIllllIIlIlIIIllll) {
        this.map = (Map<Class<?>, List<T>>)Maps.newHashMap();
        this.knownKeys = (Set<Class<?>>)Sets.newIdentityHashSet();
        this.field_181745_e = (List<T>)Lists.newArrayList();
        this.baseClass = llllllllllllIllIllllIIlIlIIIllll;
        this.knownKeys.add(llllllllllllIllIllllIIlIlIIIllll);
        "".length();
        this.map.put((Class<?>)llllllllllllIllIllllIIlIlIIIllll, (List<?>)this.field_181745_e);
        "".length();
        final String llllllllllllIllIllllIIlIlIIIlIlI = (String)ClassInheritanceMultiMap.field_181158_a.iterator();
        "".length();
        if (-" ".length() >= 0) {
            throw null;
        }
        while (!lIIIllllllIIlIIl(((Iterator)llllllllllllIllIllllIIlIlIIIlIlI).hasNext() ? 1 : 0)) {
            final Class<?> llllllllllllIllIllllIIlIlIIIlllI = ((Iterator<Class<?>>)llllllllllllIllIllllIIlIlIIIlIlI).next();
            this.createLookup(llllllllllllIllIllllIIlIlIIIlllI);
        }
    }
    
    private static boolean lIIIllllllIIllII(final Object llllllllllllIllIllllIIlIIIlIlIll) {
        return llllllllllllIllIllllIIlIIIlIlIll != null;
    }
    
    private static boolean lIIIllllllIIlIll(final Object llllllllllllIllIllllIIlIIIlIlIIl) {
        return llllllllllllIllIllllIIlIIIlIlIIl == null;
    }
    
    private static boolean lIIIllllllIIlIlI(final int llllllllllllIllIllllIIlIIIlIIlll) {
        return llllllllllllIllIllllIIlIIIlIIlll != 0;
    }
    
    @Override
    public boolean remove(final Object llllllllllllIllIllllIIlIIlIllIIl) {
        final T llllllllllllIllIllllIIlIIlIllIII = (T)llllllllllllIllIllllIIlIIlIllIIl;
        boolean llllllllllllIllIllllIIlIIlIlIlll = ClassInheritanceMultiMap.llIIlllIllIIlI[0] != 0;
        final String llllllllllllIllIllllIIlIIlIIllll = (String)this.knownKeys.iterator();
        "".length();
        if (null != null) {
            return ((0xD9 ^ 0x9B) & ~(0xF2 ^ 0xB0)) != 0x0;
        }
        while (!lIIIllllllIIlIIl(((Iterator)llllllllllllIllIllllIIlIIlIIllll).hasNext() ? 1 : 0)) {
            final Class<?> llllllllllllIllIllllIIlIIlIlIllI = ((Iterator<Class<?>>)llllllllllllIllIllllIIlIIlIIllll).next();
            if (lIIIllllllIIlIlI(llllllllllllIllIllllIIlIIlIlIllI.isAssignableFrom(llllllllllllIllIllllIIlIIlIllIII.getClass()) ? 1 : 0)) {
                final List<T> llllllllllllIllIllllIIlIIlIlIlIl = this.map.get(llllllllllllIllIllllIIlIIlIlIllI);
                if (!lIIIllllllIIllII(llllllllllllIllIllllIIlIIlIlIlIl) || !lIIIllllllIIlIlI(llllllllllllIllIllllIIlIIlIlIlIl.remove(llllllllllllIllIllllIIlIIlIllIII) ? 1 : 0)) {
                    continue;
                }
                llllllllllllIllIllllIIlIIlIlIlll = (ClassInheritanceMultiMap.llIIlllIllIIlI[1] != 0);
            }
        }
        return llllllllllllIllIllllIIlIIlIlIlll;
    }
    
    @Override
    public boolean add(final T llllllllllllIllIllllIIlIIlllIIII) {
        final short llllllllllllIllIllllIIlIIllIlllI = (short)this.knownKeys.iterator();
        "".length();
        if (((27 + 42 - 5 + 144 ^ 104 + 133 - 233 + 195) & (0x39 ^ 0x4C ^ (0xD4 ^ 0xB6) ^ -" ".length())) == -" ".length()) {
            return ((0x14 ^ 0x13 ^ (0x92 ^ 0x88)) & (0x9A ^ 0x91 ^ (0xA2 ^ 0xB4) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllllllIIlIIl(((Iterator)llllllllllllIllIllllIIlIIllIlllI).hasNext() ? 1 : 0)) {
            final Class<?> llllllllllllIllIllllIIlIIlllIIlI = ((Iterator<Class<?>>)llllllllllllIllIllllIIlIIllIlllI).next();
            if (lIIIllllllIIlIlI(llllllllllllIllIllllIIlIIlllIIlI.isAssignableFrom(llllllllllllIllIllllIIlIIlllIIII.getClass()) ? 1 : 0)) {
                this.func_181743_a(llllllllllllIllIllllIIlIIlllIIII, llllllllllllIllIllllIIlIIlllIIlI);
            }
        }
        return ClassInheritanceMultiMap.llIIlllIllIIlI[1] != 0;
    }
    
    private void func_181743_a(final T llllllllllllIllIllllIIlIIllIlIII, final Class<?> llllllllllllIllIllllIIlIIllIIIll) {
        final List<T> llllllllllllIllIllllIIlIIllIIllI = this.map.get(llllllllllllIllIllllIIlIIllIIIll);
        if (lIIIllllllIIlIll(llllllllllllIllIllllIIlIIllIIllI)) {
            final Map<Class<?>, List<T>> map = this.map;
            final Object[] array = new Object[ClassInheritanceMultiMap.llIIlllIllIIlI[1]];
            array[ClassInheritanceMultiMap.llIIlllIllIIlI[0]] = llllllllllllIllIllllIIlIIllIlIII;
            map.put(llllllllllllIllIllllIIlIIllIIIll, Lists.newArrayList(array));
            "".length();
            "".length();
            if (((0x25 ^ 0x75 ^ "   ".length()) & (129 + 195 - 300 + 229 ^ 42 + 136 - 161 + 157 ^ -" ".length())) == (37 + 122 - 38 + 20 ^ 26 + 88 - 81 + 104)) {
                return;
            }
        }
        else {
            llllllllllllIllIllllIIlIIllIIllI.add(llllllllllllIllIllllIIlIIllIlIII);
            "".length();
        }
    }
    
    @Override
    public Iterator<T> iterator() {
        UnmodifiableIterator unmodifiableIterator;
        if (lIIIllllllIIlIlI(this.field_181745_e.isEmpty() ? 1 : 0)) {
            unmodifiableIterator = Iterators.emptyIterator();
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            unmodifiableIterator = Iterators.unmodifiableIterator((Iterator)this.field_181745_e.iterator());
        }
        return (Iterator<T>)unmodifiableIterator;
    }
    
    private static String lIIIllllllIIIlIl(final String llllllllllllIllIllllIIlIIIllIIlI, final String llllllllllllIllIllllIIlIIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIllllIIlIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIlIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIIlIIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIIlIIIllIlII.init(ClassInheritanceMultiMap.llIIlllIllIIlI[2], llllllllllllIllIllllIIlIIIllIlIl);
            return new String(llllllllllllIllIllllIIlIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIIlIIIllIIll) {
            llllllllllllIllIllllIIlIIIllIIll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllllllIIlIII();
        lIIIllllllIIIllI();
        field_181158_a = Sets.newHashSet();
    }
    
    @Override
    public boolean contains(final Object llllllllllllIllIllllIIlIIlIIlIII) {
        return Iterators.contains((Iterator)this.getByClass(llllllllllllIllIllllIIlIIlIIlIII.getClass()).iterator(), llllllllllllIllIllllIIlIIlIIlIII);
    }
    
    protected void createLookup(final Class<?> llllllllllllIllIllllIIlIlIIIIlII) {
        ClassInheritanceMultiMap.field_181158_a.add(llllllllllllIllIllllIIlIlIIIIlII);
        "".length();
        final boolean llllllllllllIllIllllIIlIIlllllll = (boolean)this.field_181745_e.iterator();
        "".length();
        if (((0x5D ^ 0x57) & ~(0x42 ^ 0x48)) == -" ".length()) {
            return;
        }
        while (!lIIIllllllIIlIIl(((Iterator)llllllllllllIllIllllIIlIIlllllll).hasNext() ? 1 : 0)) {
            final T llllllllllllIllIllllIIlIlIIIIIll = ((Iterator<T>)llllllllllllIllIllllIIlIIlllllll).next();
            if (lIIIllllllIIlIlI(llllllllllllIllIllllIIlIlIIIIlII.isAssignableFrom(llllllllllllIllIllllIIlIlIIIIIll.getClass()) ? 1 : 0)) {
                this.func_181743_a(llllllllllllIllIllllIIlIlIIIIIll, llllllllllllIllIllllIIlIlIIIIlII);
            }
        }
        this.knownKeys.add(llllllllllllIllIllllIIlIlIIIIlII);
        "".length();
    }
    
    private static void lIIIllllllIIIllI() {
        (llIIlllIllIIIl = new String[ClassInheritanceMultiMap.llIIlllIllIIlI[1]])[ClassInheritanceMultiMap.llIIlllIllIIlI[0]] = lIIIllllllIIIlIl("9LHlJVk/M0GWzpNoxKsS06uuM6Mu3G5K1guRTo1S4gM=", "YwbHp");
    }
    
    @Override
    public int size() {
        return this.field_181745_e.size();
    }
    
    public <S> Iterable<S> getByClass(final Class<S> llllllllllllIllIllllIIlIIlIIIIlI) {
        return new Iterable<S>() {
            @Override
            public Iterator<S> iterator() {
                final List<T> llllllllllllIllIlIlllllIIllIllII = ClassInheritanceMultiMap.this.map.get(ClassInheritanceMultiMap.this.func_181157_b(llllllllllllIllIllllIIlIIlIIIIlI));
                if (lIIlIIlIllllIIlI(llllllllllllIllIlIlllllIIllIllII)) {
                    return (Iterator<S>)Iterators.emptyIterator();
                }
                final Iterator<T> llllllllllllIllIlIlllllIIllIlIll = llllllllllllIllIlIlllllIIllIllII.iterator();
                return (Iterator<S>)Iterators.filter((Iterator)llllllllllllIllIlIlllllIIllIlIll, llllllllllllIllIllllIIlIIlIIIIlI);
            }
            
            private static boolean lIIlIIlIllllIIlI(final Object llllllllllllIllIlIlllllIIllIIllI) {
                return llllllllllllIllIlIlllllIIllIIllI == null;
            }
        };
    }
    
    private static void lIIIllllllIIlIII() {
        (llIIlllIllIIlI = new int[3])[0] = ((0x8 ^ 0x2D ^ (0x42 ^ 0x5)) & (0x20 ^ 0x69 ^ (0x48 ^ 0x63) ^ -" ".length()));
        ClassInheritanceMultiMap.llIIlllIllIIlI[1] = " ".length();
        ClassInheritanceMultiMap.llIIlllIllIIlI[2] = "  ".length();
    }
}
