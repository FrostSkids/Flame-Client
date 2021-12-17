// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class DefaultAttributeMap implements AttributeMap
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> updater;
    private static final /* synthetic */ String[] lllIIlllIIIlIl;
    private volatile /* synthetic */ AtomicReferenceArray<DefaultAttribute<?>> attributes;
    private static final /* synthetic */ int[] lllIIlllIIIllI;
    
    private static void lIlIIIIIlIlIlIlI() {
        (lllIIlllIIIlIl = new String[DefaultAttributeMap.lllIIlllIIIllI[2]])[DefaultAttributeMap.lllIIlllIIIllI[0]] = lIlIIIIIlIlIIlll("Bgo2", "moOjN");
        DefaultAttributeMap.lllIIlllIIIlIl[DefaultAttributeMap.lllIIlllIIIllI[3]] = lIlIIIIIlIlIlIII("trG33OkswRIzfPox8sTgAg==", "mqOVB");
        DefaultAttributeMap.lllIIlllIIIlIl[DefaultAttributeMap.lllIIlllIIIllI[4]] = lIlIIIIIlIlIlIIl("uwq0+o/UelKFLrI8SVTQ+g==", "sojBe");
    }
    
    private static void lIlIIIIIlIlIllII() {
        (lllIIlllIIIllI = new int[6])[0] = ((" ".length() ^ (0x24 ^ 0x33)) & (0x14 ^ 0x27 ^ (0x60 ^ 0x45) ^ -" ".length()));
        DefaultAttributeMap.lllIIlllIIIllI[1] = (0x97 ^ 0x89 ^ (0xA5 ^ 0xBF));
        DefaultAttributeMap.lllIIlllIIIllI[2] = "   ".length();
        DefaultAttributeMap.lllIIlllIIIllI[3] = " ".length();
        DefaultAttributeMap.lllIIlllIIIllI[4] = "  ".length();
        DefaultAttributeMap.lllIIlllIIIllI[5] = (0xE4 ^ 0xBE ^ (0x1D ^ 0x4F));
    }
    
    private static boolean lIlIIIIIlIllIIII(final Object llllllllllllIlIlllIllIlllllIIIII, final Object llllllllllllIlIlllIllIllllIlllll) {
        return llllllllllllIlIlllIllIlllllIIIII == llllllllllllIlIlllIllIllllIlllll;
    }
    
    private static String lIlIIIIIlIlIIlll(String llllllllllllIlIlllIlllIIIIIIlIIl, final String llllllllllllIlIlllIlllIIIIIIlIII) {
        llllllllllllIlIlllIlllIIIIIIlIIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIlllIIIIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlllIIIIIIllII = new StringBuilder();
        final char[] llllllllllllIlIlllIlllIIIIIIlIll = llllllllllllIlIlllIlllIIIIIIlIII.toCharArray();
        int llllllllllllIlIlllIlllIIIIIIlIlI = DefaultAttributeMap.lllIIlllIIIllI[0];
        final int llllllllllllIlIlllIlllIIIIIIIlII = (Object)((String)llllllllllllIlIlllIlllIIIIIIlIIl).toCharArray();
        final Exception llllllllllllIlIlllIlllIIIIIIIIll = (Exception)llllllllllllIlIlllIlllIIIIIIIlII.length;
        short llllllllllllIlIlllIlllIIIIIIIIlI = (short)DefaultAttributeMap.lllIIlllIIIllI[0];
        while (lIlIIIIIlIllIIIl(llllllllllllIlIlllIlllIIIIIIIIlI, (int)llllllllllllIlIlllIlllIIIIIIIIll)) {
            final char llllllllllllIlIlllIlllIIIIIIllll = llllllllllllIlIlllIlllIIIIIIIlII[llllllllllllIlIlllIlllIIIIIIIIlI];
            llllllllllllIlIlllIlllIIIIIIllII.append((char)(llllllllllllIlIlllIlllIIIIIIllll ^ llllllllllllIlIlllIlllIIIIIIlIll[llllllllllllIlIlllIlllIIIIIIlIlI % llllllllllllIlIlllIlllIIIIIIlIll.length]));
            "".length();
            ++llllllllllllIlIlllIlllIIIIIIlIlI;
            ++llllllllllllIlIlllIlllIIIIIIIIlI;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlllIIIIIIllII);
    }
    
    private static boolean lIlIIIIIlIlIlllI(final int llllllllllllIlIlllIllIllllIllIIl) {
        return llllllllllllIlIlllIllIllllIllIIl == 0;
    }
    
    @Override
    public <T> Attribute<T> attr(final AttributeKey<T> llllllllllllIlIlllIlllIIIIlIIlll) {
        if (lIlIIIIIlIlIllIl(llllllllllllIlIlllIlllIIIIlIIlll)) {
            throw new NullPointerException(DefaultAttributeMap.lllIIlllIIIlIl[DefaultAttributeMap.lllIIlllIIIllI[0]]);
        }
        AtomicReferenceArray<DefaultAttribute<?>> llllllllllllIlIlllIlllIIIIlIlIll = this.attributes;
        if (lIlIIIIIlIlIllIl(llllllllllllIlIlllIlllIIIIlIlIll)) {
            llllllllllllIlIlllIlllIIIIlIlIll = new AtomicReferenceArray<DefaultAttribute<?>>(DefaultAttributeMap.lllIIlllIIIllI[1]);
            if (lIlIIIIIlIlIlllI(DefaultAttributeMap.updater.compareAndSet(this, null, llllllllllllIlIlllIlllIIIIlIlIll) ? 1 : 0)) {
                llllllllllllIlIlllIlllIIIIlIlIll = this.attributes;
            }
        }
        final int llllllllllllIlIlllIlllIIIIlIlIlI = index(llllllllllllIlIlllIlllIIIIlIIlll);
        DefaultAttribute<?> llllllllllllIlIlllIlllIIIIlIlIIl = llllllllllllIlIlllIlllIIIIlIlIll.get(llllllllllllIlIlllIlllIIIIlIlIlI);
        if (lIlIIIIIlIlIllIl(llllllllllllIlIlllIlllIIIIlIlIIl)) {
            llllllllllllIlIlllIlllIIIIlIlIIl = new DefaultAttribute<Object>(llllllllllllIlIlllIlllIIIIlIIlll);
            if (lIlIIIIIlIlIllll(llllllllllllIlIlllIlllIIIIlIlIll.compareAndSet(llllllllllllIlIlllIlllIIIIlIlIlI, null, llllllllllllIlIlllIlllIIIIlIlIIl) ? 1 : 0)) {
                return (Attribute<T>)llllllllllllIlIlllIlllIIIIlIlIIl;
            }
            llllllllllllIlIlllIlllIIIIlIlIIl = llllllllllllIlIlllIlllIIIIlIlIll.get(llllllllllllIlIlllIlllIIIIlIlIlI);
        }
        synchronized (llllllllllllIlIlllIlllIIIIlIlIIl) {
            DefaultAttribute<?> llllllllllllIlIlllIlllIIIIlIlllI = llllllllllllIlIlllIlllIIIIlIlIIl;
            while (!lIlIIIIIlIlIlllI(((DefaultAttribute<Object>)llllllllllllIlIlllIlllIIIIlIlIIl).removed ? 1 : 0) || !lIlIIIIIlIllIIII(((DefaultAttribute<Object>)llllllllllllIlIlllIlllIIIIlIlIIl).key, llllllllllllIlIlllIlllIIIIlIIlll)) {
                final DefaultAttribute<?> llllllllllllIlIlllIlllIIIIlIllll = ((DefaultAttribute<Object>)llllllllllllIlIlllIlllIIIIlIlIIl).next;
                if (lIlIIIIIlIlIllIl(llllllllllllIlIlllIlllIIIIlIllll)) {
                    final DefaultAttribute<T> llllllllllllIlIlllIlllIIIIllIIII = new DefaultAttribute<T>(llllllllllllIlIlllIlllIIIIlIlIIl, llllllllllllIlIlllIlllIIIIlIIlll);
                    ((DefaultAttribute<Object>)llllllllllllIlIlllIlllIIIIlIlIIl).next = llllllllllllIlIlllIlllIIIIllIIII;
                    "".length();
                    ((DefaultAttribute<Object>)llllllllllllIlIlllIlllIIIIllIIII).prev = llllllllllllIlIlllIlllIIIIlIlIIl;
                    "".length();
                    return llllllllllllIlIlllIlllIIIIllIIII;
                }
                llllllllllllIlIlllIlllIIIIlIlllI = llllllllllllIlIlllIlllIIIIlIllll;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            return (Attribute<T>)llllllllllllIlIlllIlllIIIIlIlIIl;
        }
    }
    
    private static boolean lIlIIIIIlIlIllIl(final Object llllllllllllIlIlllIllIllllIlllIl) {
        return llllllllllllIlIlllIllIllllIlllIl == null;
    }
    
    static {
        lIlIIIIIlIlIllII();
        lIlIIIIIlIlIlIlI();
        MASK = DefaultAttributeMap.lllIIlllIIIllI[2];
        BUCKET_SIZE = DefaultAttributeMap.lllIIlllIIIllI[1];
        AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> llllllllllllIlIlllIlllIIIIIllIlI = (AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray>)PlatformDependent.newAtomicReferenceFieldUpdater(DefaultAttributeMap.class, DefaultAttributeMap.lllIIlllIIIlIl[DefaultAttributeMap.lllIIlllIIIllI[3]]);
        if (lIlIIIIIlIlIllIl(llllllllllllIlIlllIlllIIIIIllIlI)) {
            llllllllllllIlIlllIlllIIIIIllIlI = (AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray>)AtomicReferenceFieldUpdater.newUpdater(DefaultAttributeMap.class, AtomicReferenceArray.class, DefaultAttributeMap.lllIIlllIIIlIl[DefaultAttributeMap.lllIIlllIIIllI[4]]);
        }
        updater = llllllllllllIlIlllIlllIIIIIllIlI;
    }
    
    private static int index(final AttributeKey<?> llllllllllllIlIlllIlllIIIIIlllII) {
        return llllllllllllIlIlllIlllIIIIIlllII.id() & DefaultAttributeMap.lllIIlllIIIllI[2];
    }
    
    private static boolean lIlIIIIIlIlIllll(final int llllllllllllIlIlllIllIllllIllIll) {
        return llllllllllllIlIlllIllIllllIllIll != 0;
    }
    
    private static String lIlIIIIIlIlIlIIl(final String llllllllllllIlIlllIllIlllllIllII, final String llllllllllllIlIlllIllIlllllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIlllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllIlllllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllIlllllIlllI.init(DefaultAttributeMap.lllIIlllIIIllI[4], llllllllllllIlIlllIllIlllllIllll);
            return new String(llllllllllllIlIlllIllIlllllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIlllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIlllllIllIl) {
            llllllllllllIlIlllIllIlllllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIIlIlIlIII(final String llllllllllllIlIlllIllIllllllIlll, final String llllllllllllIlIlllIllIllllllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIllllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIllllllIllI.getBytes(StandardCharsets.UTF_8)), DefaultAttributeMap.lllIIlllIIIllI[5]), "DES");
            final Cipher llllllllllllIlIlllIllIlllllllIll = Cipher.getInstance("DES");
            llllllllllllIlIlllIllIlllllllIll.init(DefaultAttributeMap.lllIIlllIIIllI[4], llllllllllllIlIlllIllIllllllllII);
            return new String(llllllllllllIlIlllIllIlllllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIlllllllIlI) {
            llllllllllllIlIlllIllIlllllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIlIllIIIl(final int llllllllllllIlIlllIllIlllllIIlII, final int llllllllllllIlIlllIllIlllllIIIll) {
        return llllllllllllIlIlllIllIlllllIIlII < llllllllllllIlIlllIllIlllllIIIll;
    }
    
    private static final class DefaultAttribute<T> extends AtomicReference<T> implements Attribute<T>
    {
        private final /* synthetic */ AttributeKey<T> key;
        private static final /* synthetic */ int[] llIIIllIIlllll;
        private /* synthetic */ DefaultAttribute<?> prev;
        private final /* synthetic */ DefaultAttribute<?> head;
        private /* synthetic */ DefaultAttribute<?> next;
        private volatile /* synthetic */ boolean removed;
        
        private static boolean lIIIlIlIIlIllIIl(final int llllllllllllIlllIlIIlIlIIllllIIl) {
            return llllllllllllIlllIlIIlIlIIllllIIl == 0;
        }
        
        @Override
        public void remove() {
            this.removed = (DefaultAttribute.llIIIllIIlllll[0] != 0);
            this.set(null);
            this.remove0();
        }
        
        @Override
        public T setIfAbsent(final T llllllllllllIlllIlIIlIlIlIlIllII) {
            while (lIIIlIlIIlIllIIl(this.compareAndSet(null, llllllllllllIlllIlIIlIlIlIlIllII) ? 1 : 0)) {
                final T llllllllllllIlllIlIIlIlIlIllIIll = this.get();
                if (lIIIlIlIIlIllIlI(llllllllllllIlllIlIIlIlIlIllIIll)) {
                    return llllllllllllIlllIlIIlIlIlIllIIll;
                }
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            return null;
        }
        
        private static boolean lIIIlIlIIlIllIlI(final Object llllllllllllIlllIlIIlIlIIllllIll) {
            return llllllllllllIlllIlIIlIlIIllllIll != null;
        }
        
        DefaultAttribute(final DefaultAttribute<?> llllllllllllIlllIlIIlIlIllIIIIIl, final AttributeKey<T> llllllllllllIlllIlIIlIlIllIIIIII) {
            this.head = llllllllllllIlllIlIIlIlIllIIIIIl;
            this.key = llllllllllllIlllIlIIlIlIllIIIIII;
        }
        
        static {
            lIIIlIlIIlIllIII();
        }
        
        private void remove0() {
            synchronized (this.head) {
                if (lIIIlIlIIlIllIlI(this.prev)) {
                    this.prev.next = this.next;
                    if (lIIIlIlIIlIllIlI(this.next)) {
                        this.next.prev = this.prev;
                    }
                }
                // monitorexit(this.head)
                "".length();
                if (-" ".length() == ((0x3D ^ 0x20) & ~(0x95 ^ 0x88))) {
                    return;
                }
            }
        }
        
        private static void lIIIlIlIIlIllIII() {
            (llIIIllIIlllll = new int[1])[0] = " ".length();
        }
        
        @Override
        public T getAndRemove() {
            this.removed = (DefaultAttribute.llIIIllIIlllll[0] != 0);
            final T llllllllllllIlllIlIIlIlIlIlIIIll = this.getAndSet(null);
            this.remove0();
            return llllllllllllIlllIlIIlIlIlIlIIIll;
        }
        
        @Override
        public AttributeKey<T> key() {
            return this.key;
        }
        
        DefaultAttribute(final AttributeKey<T> llllllllllllIlllIlIIlIlIlIlllIlI) {
            this.head = this;
            this.key = llllllllllllIlllIlIIlIlIlIlllIlI;
        }
    }
}
