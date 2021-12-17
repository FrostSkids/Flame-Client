// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Queue;

final class MpscLinkedQueue<E> extends MpscLinkedQueueTailRef<E> implements Queue<E>
{
    private static final /* synthetic */ String[] llllIIIllllIl;
    private static final /* synthetic */ int[] llllIlIIIIlIl;
    
    @Override
    public Object[] toArray() {
        final Object[] lllllllllllllIlIlllIIIIIIIlIIlll = new Object[this.size()];
        final Iterator<E> lllllllllllllIlIlllIIIIIIIlIIlIl = this.iterator();
        int lllllllllllllIlIlllIIIIIIIlIlIll = MpscLinkedQueue.llllIlIIIIlIl[0];
        while (lIlIlIIllIIllII(lllllllllllllIlIlllIIIIIIIlIlIll, lllllllllllllIlIlllIIIIIIIlIIlll.length)) {
            if (!lIlIlIIllIIlIlI(lllllllllllllIlIlllIIIIIIIlIIlIl.hasNext() ? 1 : 0)) {
                return Arrays.copyOf(lllllllllllllIlIlllIIIIIIIlIIlll, lllllllllllllIlIlllIIIIIIIlIlIll);
            }
            lllllllllllllIlIlllIIIIIIIlIIlll[lllllllllllllIlIlllIIIIIIIlIlIll] = lllllllllllllIlIlllIIIIIIIlIIlIl.next();
            "".length();
            if ("   ".length() > (0x29 ^ 0x2D)) {
                return null;
            }
            ++lllllllllllllIlIlllIIIIIIIlIlIll;
            "".length();
            if ((0xD2 ^ 0xA4 ^ (0xF7 ^ 0x85)) <= -" ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIlllIIIIIIIlIIlll;
    }
    
    @Override
    public void clear() {
        while (lIlIlIIllIIIlll(this.poll())) {
            "".length();
            if (" ".length() == ("   ".length() & ~"   ".length())) {
                return;
            }
        }
    }
    
    private static boolean lIlIlIIllIIlIIl(final Object lllllllllllllIlIllIlllllIlllllII) {
        return lllllllllllllIlIllIlllllIlllllII == null;
    }
    
    private static boolean lIlIlIIllIlIIII(final int lllllllllllllIlIllIllllllIIIIlIl, final int lllllllllllllIlIllIllllllIIIIlII) {
        return lllllllllllllIlIllIllllllIIIIlIl > lllllllllllllIlIllIllllllIIIIlII;
    }
    
    @Override
    public boolean isEmpty() {
        int n;
        if (lIlIlIIllIIlIIl(this.peekNode())) {
            n = MpscLinkedQueue.llllIlIIIIlIl[1];
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((0x52 ^ 0x1C) & ~(0x15 ^ 0x5B)) != 0x0;
            }
        }
        else {
            n = MpscLinkedQueue.llllIlIIIIlIl[0];
        }
        return n != 0;
    }
    
    @Override
    public int size() {
        int lllllllllllllIlIlllIIIIIIllllllI = MpscLinkedQueue.llllIlIIIIlIl[0];
        MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIIllllIll = this.peekNode();
        while (!lIlIlIIllIIlIIl(lllllllllllllIlIlllIIIIIIllllIll)) {
            ++lllllllllllllIlIlllIIIIIIllllllI;
            lllllllllllllIlIlllIIIIIIllllIll = lllllllllllllIlIlllIIIIIIllllIll.next();
            "".length();
            if (" ".length() >= "   ".length()) {
                return (0xC3 ^ 0x93) & ~(0x96 ^ 0xC6);
            }
        }
        "".length();
        if (-"   ".length() >= 0) {
            return (109 + 109 - 149 + 93 ^ 23 + 48 + 9 + 67) & ("  ".length() ^ (0x9 ^ 0x3A) ^ -" ".length());
        }
        return lllllllllllllIlIlllIIIIIIllllllI;
    }
    
    MpscLinkedQueue() {
        final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIllIlIIll = new DefaultNode<E>(null);
        this.setHeadRef(lllllllllllllIlIlllIIIIIllIlIIll);
        this.setTailRef(lllllllllllllIlIlllIIIIIllIlIIll);
    }
    
    private static boolean lIlIlIIllIIlIII(final Object lllllllllllllIlIllIlllllIlllllll, final Object lllllllllllllIlIllIlllllIllllllI) {
        return lllllllllllllIlIllIlllllIlllllll == lllllllllllllIlIllIlllllIllllllI;
    }
    
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private static final /* synthetic */ int[] lllIIIlIlIIIII;
            private /* synthetic */ MpscLinkedQueueNode<E> node = MpscLinkedQueue.this.peekNode();
            
            @Override
            public E next() {
                final MpscLinkedQueueNode<E> llllllllllllIllIIIIIlIlIIllIlllI = this.node;
                if (lIIlllIlIlIlIlll(llllllllllllIllIIIIIlIlIIllIlllI)) {
                    throw new NoSuchElementException();
                }
                final E llllllllllllIllIIIIIlIlIIllIllIl = llllllllllllIllIIIIIlIlIIllIlllI.value();
                this.node = llllllllllllIllIIIIIlIlIIllIlllI.next();
                return llllllllllllIllIIIIIlIlIIllIllIl;
            }
            
            @Override
            public boolean hasNext() {
                int n;
                if (lIIlllIlIlIlIllI(this.node)) {
                    n = MpscLinkedQueue$1.lllIIIlIlIIIII[0];
                    "".length();
                    if (" ".length() <= ((0xD7 ^ 0xB7) & ~(0x35 ^ 0x55))) {
                        return ((0xB1 ^ 0x80) & ~(0x60 ^ 0x51)) != 0x0;
                    }
                }
                else {
                    n = MpscLinkedQueue$1.lllIIIlIlIIIII[1];
                }
                return n != 0;
            }
            
            static {
                lIIlllIlIlIlIlIl();
            }
            
            private static boolean lIIlllIlIlIlIllI(final Object llllllllllllIllIIIIIlIlIIllIIlll) {
                return llllllllllllIllIIIIIlIlIIllIIlll != null;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
            
            private static boolean lIIlllIlIlIlIlll(final Object llllllllllllIllIIIIIlIlIIllIIlIl) {
                return llllllllllllIllIIIIIlIlIIllIIlIl == null;
            }
            
            private static void lIIlllIlIlIlIlIl() {
                (lllIIIlIlIIIII = new int[2])[0] = " ".length();
                MpscLinkedQueue$1.lllIIIlIlIIIII[1] = ((0xFE ^ 0xBD ^ (0x45 ^ 0x38)) & (109 + 28 - 60 + 60 ^ 38 + 17 + 98 + 30 ^ -" ".length()));
            }
        };
    }
    
    @Override
    public E element() {
        final E lllllllllllllIlIlllIIIIIIIlllIll = this.peek();
        if (lIlIlIIllIIIlll(lllllllllllllIlIlllIIIIIIIlllIll)) {
            return lllllllllllllIlIlllIIIIIIIlllIll;
        }
        throw new NoSuchElementException();
    }
    
    private void writeObject(final ObjectOutputStream lllllllllllllIlIllIlllllllIlIIll) throws IOException {
        lllllllllllllIlIllIlllllllIlIIll.defaultWriteObject();
        final Iterator lllllllllllllIlIllIlllllllIlIlll = this.iterator();
        while (lIlIlIIllIIlIlI(lllllllllllllIlIllIlllllllIlIlll.hasNext() ? 1 : 0)) {
            final E lllllllllllllIlIllIlllllllIllIII = lllllllllllllIlIllIlllllllIlIlll.next();
            lllllllllllllIlIllIlllllllIlIIll.writeObject(lllllllllllllIlIllIlllllllIllIII);
            "".length();
            if (null != null) {
                return;
            }
        }
        lllllllllllllIlIllIlllllllIlIIll.writeObject(null);
    }
    
    @Override
    public E peek() {
        final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIIIllll = this.peekNode();
        if (lIlIlIIllIIlIIl(lllllllllllllIlIlllIIIIIlIIIllll)) {
            return null;
        }
        return lllllllllllllIlIlllIIIIIlIIIllll.value();
    }
    
    @Override
    public E poll() {
        final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIIlllll = this.peekNode();
        if (lIlIlIIllIIlIIl(lllllllllllllIlIlllIIIIIlIIlllll)) {
            return null;
        }
        final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIIlllIl = this.headRef();
        this.lazySetHeadRef(lllllllllllllIlIlllIIIIIlIIlllll);
        lllllllllllllIlIlllIIIIIlIIlllIl.unlink();
        return lllllllllllllIlIlllIIIIIlIIlllll.clearMaybe();
    }
    
    @Override
    public boolean contains(final Object lllllllllllllIlIlllIIIIIIllIIllI) {
        MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIIllIIlII = this.peekNode();
        while (!lIlIlIIllIIlIIl(lllllllllllllIlIlllIIIIIIllIIlII)) {
            if (lIlIlIIllIIlIII(lllllllllllllIlIlllIIIIIIllIIlII.value(), lllllllllllllIlIlllIIIIIIllIIllI)) {
                return MpscLinkedQueue.llllIlIIIIlIl[1] != 0;
            }
            lllllllllllllIlIlllIIIIIIllIIlII = lllllllllllllIlIlllIIIIIIllIIlII.next();
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((0xE6 ^ 0x90 ^ (0xFE ^ 0x96)) & (15 + 97 - 47 + 158 ^ 178 + 192 - 221 + 44 ^ -" ".length())) != 0x0;
            }
        }
        "".length();
        if (-" ".length() > -" ".length()) {
            return ((0xF3 ^ 0x90) & ~(0xCF ^ 0xAC)) != 0x0;
        }
        return MpscLinkedQueue.llllIlIIIIlIl[0] != 0;
    }
    
    private static String lIlIlIIIIIIllll(final String lllllllllllllIlIllIllllllIlllIII, final String lllllllllllllIlIllIllllllIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllllllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllllllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIllllllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIllllllIllllII.init(MpscLinkedQueue.llllIlIIIIlIl[2], lllllllllllllIlIllIllllllIllllIl);
            return new String(lllllllllllllIlIllIllllllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllllllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllllllIlllIll) {
            lllllllllllllIlIllIllllllIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIIllIIlllI(final int lllllllllllllIlIllIllllllIIIllIl, final int lllllllllllllIlIllIllllllIIIllII) {
        return lllllllllllllIlIllIllllllIIIllIl >= lllllllllllllIlIllIllllllIIIllII;
    }
    
    @Override
    public boolean retainAll(final Collection<?> lllllllllllllIlIllIllllllllIIIII) {
        throw new UnsupportedOperationException();
    }
    
    private static boolean lIlIlIIllIIlIlI(final int lllllllllllllIlIllIlllllIllllIlI) {
        return lllllllllllllIlIllIlllllIllllIlI != 0;
    }
    
    private static void lIlIlIIllIIIllI() {
        (llllIlIIIIlIl = new int[6])[0] = ((0xB0 ^ 0xAA ^ (0x18 ^ 0x38)) & (23 + 53 - 65 + 146 ^ 37 + 78 - 10 + 62 ^ -" ".length()));
        MpscLinkedQueue.llllIlIIIIlIl[1] = " ".length();
        MpscLinkedQueue.llllIlIIIIlIl[2] = "  ".length();
        MpscLinkedQueue.llllIlIIIIlIl[3] = "   ".length();
        MpscLinkedQueue.llllIlIIIIlIl[4] = (0xDD ^ 0x96 ^ (0xC9 ^ 0x86));
        MpscLinkedQueue.llllIlIIIIlIl[5] = (0x68 ^ 0x54 ^ (0x29 ^ 0x1D));
    }
    
    @Override
    public <T> T[] toArray(final T[] lllllllllllllIlIlllIIIIIIIIIIlIl) {
        final int lllllllllllllIlIlllIIIIIIIIIlIIl = this.size();
        T[] lllllllllllllIlIlllIIIIIIIIIlIII;
        if (lIlIlIIllIIlllI(lllllllllllllIlIlllIIIIIIIIIIlIl.length, lllllllllllllIlIlllIIIIIIIIIlIIl)) {
            final T[] lllllllllllllIlIlllIIIIIIIIIllll = lllllllllllllIlIlllIIIIIIIIIIlIl;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIlllIIIIIIIIIlIII = (T[])Array.newInstance(lllllllllllllIlIlllIIIIIIIIIIlIl.getClass().getComponentType(), lllllllllllllIlIlllIIIIIIIIIlIIl);
        }
        final Iterator<E> lllllllllllllIlIlllIIIIIIIIIIlll = this.iterator();
        int lllllllllllllIlIlllIIIIIIIIIllIl = MpscLinkedQueue.llllIlIIIIlIl[0];
        while (lIlIlIIllIIllII(lllllllllllllIlIlllIIIIIIIIIllIl, lllllllllllllIlIlllIIIIIIIIIlIII.length)) {
            if (lIlIlIIllIIlIlI(lllllllllllllIlIlllIIIIIIIIIIlll.hasNext() ? 1 : 0)) {
                lllllllllllllIlIlllIIIIIIIIIlIII[lllllllllllllIlIlllIIIIIIIIIllIl] = (T)lllllllllllllIlIlllIIIIIIIIIIlll.next();
                "".length();
                if (null != null) {
                    return null;
                }
                ++lllllllllllllIlIlllIIIIIIIIIllIl;
                "".length();
                if (" ".length() > " ".length()) {
                    return null;
                }
                continue;
            }
            else {
                if (lIlIlIIllIIlIII(lllllllllllllIlIlllIIIIIIIIIIlIl, lllllllllllllIlIlllIIIIIIIIIlIII)) {
                    lllllllllllllIlIlllIIIIIIIIIlIII[lllllllllllllIlIlllIIIIIIIIIllIl] = null;
                    return lllllllllllllIlIlllIIIIIIIIIlIII;
                }
                if (lIlIlIIllIIllII(lllllllllllllIlIlllIIIIIIIIIIlIl.length, lllllllllllllIlIlllIIIIIIIIIllIl)) {
                    return Arrays.copyOf(lllllllllllllIlIlllIIIIIIIIIlIII, lllllllllllllIlIlllIIIIIIIIIllIl);
                }
                System.arraycopy(lllllllllllllIlIlllIIIIIIIIIlIII, MpscLinkedQueue.llllIlIIIIlIl[0], lllllllllllllIlIlllIIIIIIIIIIlIl, MpscLinkedQueue.llllIlIIIIlIl[0], lllllllllllllIlIlllIIIIIIIIIllIl);
                if (lIlIlIIllIlIIII(lllllllllllllIlIlllIIIIIIIIIIlIl.length, lllllllllllllIlIlllIIIIIIIIIllIl)) {
                    lllllllllllllIlIlllIIIIIIIIIIlIl[lllllllllllllIlIlllIIIIIIIIIllIl] = null;
                }
                return lllllllllllllIlIlllIIIIIIIIIIlIl;
            }
        }
        return lllllllllllllIlIlllIIIIIIIIIlIII;
    }
    
    private static boolean lIlIlIIllIlIIlI(final int lllllllllllllIlIllIlllllIllllIII) {
        return lllllllllllllIlIllIlllllIllllIII == 0;
    }
    
    @Override
    public boolean remove(final Object lllllllllllllIlIllIlllllllllllll) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(final Collection<? extends E> lllllllllllllIlIllIllllllllIlIlI) {
        if (lIlIlIIllIIlIIl(lllllllllllllIlIllIllllllllIlIlI)) {
            throw new NullPointerException(MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[2]]);
        }
        if (lIlIlIIllIIlIII(lllllllllllllIlIllIllllllllIlIlI, this)) {
            throw new IllegalArgumentException(MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[3]]);
        }
        boolean lllllllllllllIlIllIllllllllIlIIl = MpscLinkedQueue.llllIlIIIIlIl[0] != 0;
        final Iterator lllllllllllllIlIllIllllllllIllII = lllllllllllllIlIllIllllllllIlIlI.iterator();
        while (lIlIlIIllIIlIlI(lllllllllllllIlIllIllllllllIllII.hasNext() ? 1 : 0)) {
            final E lllllllllllllIlIllIllllllllIllIl = lllllllllllllIlIllIllllllllIllII.next();
            this.add(lllllllllllllIlIllIllllllllIllIl);
            "".length();
            lllllllllllllIlIllIllllllllIlIIl = (MpscLinkedQueue.llllIlIIIIlIl[1] != 0);
            "".length();
            if (-"  ".length() > 0) {
                return ((0xA5 ^ 0xA2) & ~(0x89 ^ 0x8E)) != 0x0;
            }
        }
        return lllllllllllllIlIllIllllllllIlIIl;
    }
    
    private static void lIlIlIIIIIlIIII() {
        (llllIIIllllIl = new String[MpscLinkedQueue.llllIlIIIIlIl[4]])[MpscLinkedQueue.llllIlIIIIlIl[0]] = lIlIlIIIIIIllIl("1hYVMDdBCVc=", "avhir");
        MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[1]] = lIlIlIIIIIIllIl("GypCjDowdL8rskFE9UU6Yw==", "XEOKC");
        MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[2]] = lIlIlIIIIIIlllI("Cw==", "hgEID");
        MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[3]] = lIlIlIIIIIIllll("C5slfc9xjUojg1gVaLW1Pg==", "XivzW");
    }
    
    private static String lIlIlIIIIIIlllI(String lllllllllllllIlIllIllllllIIllIII, final String lllllllllllllIlIllIllllllIIlllII) {
        lllllllllllllIlIllIllllllIIllIII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIllllllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIllllllIIllIll = new StringBuilder();
        final char[] lllllllllllllIlIllIllllllIIllIlI = lllllllllllllIlIllIllllllIIlllII.toCharArray();
        int lllllllllllllIlIllIllllllIIllIIl = MpscLinkedQueue.llllIlIIIIlIl[0];
        final String lllllllllllllIlIllIllllllIIlIIll = (Object)lllllllllllllIlIllIllllllIIllIII.toCharArray();
        final short lllllllllllllIlIllIllllllIIlIIlI = (short)lllllllllllllIlIllIllllllIIlIIll.length;
        int lllllllllllllIlIllIllllllIIlIIIl = MpscLinkedQueue.llllIlIIIIlIl[0];
        while (lIlIlIIllIIllII(lllllllllllllIlIllIllllllIIlIIIl, lllllllllllllIlIllIllllllIIlIIlI)) {
            final char lllllllllllllIlIllIllllllIIllllI = lllllllllllllIlIllIllllllIIlIIll[lllllllllllllIlIllIllllllIIlIIIl];
            lllllllllllllIlIllIllllllIIllIll.append((char)(lllllllllllllIlIllIllllllIIllllI ^ lllllllllllllIlIllIllllllIIllIlI[lllllllllllllIlIllIllllllIIllIIl % lllllllllllllIlIllIllllllIIllIlI.length]));
            "".length();
            ++lllllllllllllIlIllIllllllIIllIIl;
            ++lllllllllllllIlIllIllllllIIlIIIl;
            "".length();
            if (" ".length() >= (0x90 ^ 0x94)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIllllllIIllIll);
    }
    
    @Override
    public boolean containsAll(final Collection<?> lllllllllllllIlIllIlllllllllIlll) {
        final Iterator lllllllllllllIlIllIllllllllllIIl = lllllllllllllIlIllIlllllllllIlll.iterator();
        while (lIlIlIIllIIlIlI(lllllllllllllIlIllIllllllllllIIl.hasNext() ? 1 : 0)) {
            final Object lllllllllllllIlIllIllllllllllIlI = lllllllllllllIlIllIllllllllllIIl.next();
            if (lIlIlIIllIlIIlI(this.contains(lllllllllllllIlIllIllllllllllIlI) ? 1 : 0)) {
                return MpscLinkedQueue.llllIlIIIIlIl[0] != 0;
            }
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((0x49 ^ 0x29) & ~(0x61 ^ 0x1)) != 0x0;
            }
        }
        return MpscLinkedQueue.llllIlIIIIlIl[1] != 0;
    }
    
    private static String lIlIlIIIIIIllIl(final String lllllllllllllIlIllIllllllIlIlIll, final String lllllllllllllIlIllIllllllIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllllllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllllllIlIlIlI.getBytes(StandardCharsets.UTF_8)), MpscLinkedQueue.llllIlIIIIlIl[5]), "DES");
            final Cipher lllllllllllllIlIllIllllllIlIllll = Cipher.getInstance("DES");
            lllllllllllllIlIllIllllllIlIllll.init(MpscLinkedQueue.llllIlIIIIlIl[2], lllllllllllllIlIllIllllllIllIIII);
            return new String(lllllllllllllIlIllIllllllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllllllIlIlllI) {
            lllllllllllllIlIllIllllllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean add(final E lllllllllllllIlIlllIIIIIIlIlIIII) {
        if (lIlIlIIllIIlIlI(this.offer(lllllllllllllIlIlllIIIIIIlIlIIII) ? 1 : 0)) {
            return MpscLinkedQueue.llllIlIIIIlIl[1] != 0;
        }
        throw new IllegalStateException(MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[1]]);
    }
    
    @Override
    public E remove() {
        final E lllllllllllllIlIlllIIIIIIlIIlIII = this.poll();
        if (lIlIlIIllIIIlll(lllllllllllllIlIlllIIIIIIlIIlIII)) {
            return lllllllllllllIlIlllIIIIIIlIIlIII;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public boolean offer(final E lllllllllllllIlIlllIIIIIlIllIllI) {
        if (lIlIlIIllIIlIIl(lllllllllllllIlIlllIIIIIlIllIllI)) {
            throw new NullPointerException(MpscLinkedQueue.llllIIIllllIl[MpscLinkedQueue.llllIlIIIIlIl[0]]);
        }
        MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIllIlII = null;
        if (lIlIlIIllIIlIlI((lllllllllllllIlIlllIIIIIlIllIllI instanceof MpscLinkedQueueNode) ? 1 : 0)) {
            final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIlllIll = (MpscLinkedQueueNode<E>)lllllllllllllIlIlllIIIIIlIllIllI;
            lllllllllllllIlIlllIIIIIlIlllIll.setNext(null);
            "".length();
            if (((0x4 ^ 0x15 ^ (0x3F ^ 0x6F)) & (0x8E ^ 0x9E ^ (0x1F ^ 0x4E) ^ -" ".length())) < ((126 + 80 - 82 + 45 ^ 102 + 138 - 233 + 176) & (0xDB ^ 0xA2 ^ (0x23 ^ 0x44) ^ -" ".length()))) {
                return ((" ".length() ^ (0x72 ^ 0x5A)) & (0xAA ^ 0x91 ^ (0x73 ^ 0x61) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIlIlllIIIIIlIllIlII = new DefaultNode<E>(lllllllllllllIlIlllIIIIIlIllIllI);
        }
        final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIlIllIIlI = this.getAndSetTailRef(lllllllllllllIlIlllIIIIIlIllIlII);
        lllllllllllllIlIlllIIIIIlIllIIlI.setNext(lllllllllllllIlIlllIIIIIlIllIlII);
        return MpscLinkedQueue.llllIlIIIIlIl[1] != 0;
    }
    
    static {
        lIlIlIIllIIIllI();
        lIlIlIIIIIlIIII();
    }
    
    private MpscLinkedQueueNode<E> peekNode() {
        do {
            final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIllIIlIll = this.headRef();
            final MpscLinkedQueueNode<E> lllllllllllllIlIlllIIIIIllIIlIlI = lllllllllllllIlIlllIIIIIllIIlIll.next();
            if (lIlIlIIllIIIlll(lllllllllllllIlIlllIIIIIllIIlIlI)) {
                return lllllllllllllIlIlllIIIIIllIIlIlI;
            }
            if (lIlIlIIllIIlIII(lllllllllllllIlIlllIIIIIllIIlIll, this.tailRef())) {
                return null;
            }
            "".length();
        } while (" ".length() > 0);
        return null;
    }
    
    private static boolean lIlIlIIllIIIlll(final Object lllllllllllllIlIllIllllllIIIIIlI) {
        return lllllllllllllIlIllIllllllIIIIIlI != null;
    }
    
    private void readObject(final ObjectInputStream lllllllllllllIlIllIlllllllIIIlll) throws IOException, ClassNotFoundException {
        lllllllllllllIlIllIlllllllIIIlll.defaultReadObject();
        final MpscLinkedQueueNode<E> lllllllllllllIlIllIlllllllIIlIIl = new DefaultNode<E>(null);
        this.setHeadRef(lllllllllllllIlIllIlllllllIIlIIl);
        this.setTailRef(lllllllllllllIlIllIlllllllIIlIIl);
        do {
            final E lllllllllllllIlIllIlllllllIIllII = (E)lllllllllllllIlIllIlllllllIIIlll.readObject();
            if (lIlIlIIllIIlIIl(lllllllllllllIlIllIlllllllIIllII)) {
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.add(lllllllllllllIlIllIlllllllIIllII);
                "".length();
                "".length();
            }
        } while ((0x32 ^ 0x36) > ((0x4F ^ 0x9) & ~(0x0 ^ 0x46)));
    }
    
    @Override
    public boolean removeAll(final Collection<?> lllllllllllllIlIllIllllllllIIIlI) {
        throw new UnsupportedOperationException();
    }
    
    private static boolean lIlIlIIllIIllII(final int lllllllllllllIlIllIllllllIIIlIIl, final int lllllllllllllIlIllIllllllIIIlIII) {
        return lllllllllllllIlIllIllllllIIIlIIl < lllllllllllllIlIllIllllllIIIlIII;
    }
    
    private static final class DefaultNode<T> extends MpscLinkedQueueNode<T>
    {
        private /* synthetic */ T value;
        
        @Override
        public T value() {
            return this.value;
        }
        
        @Override
        protected T clearMaybe() {
            final T llllllllllllIlllIIIIIIllIIIllIll = this.value;
            this.value = null;
            return llllllllllllIlllIIIIIIllIIIllIll;
        }
        
        DefaultNode(final T llllllllllllIlllIIIIIIllIIlIIIlI) {
            this.value = llllllllllllIlllIIIIIIllIIlIIIlI;
        }
    }
}
