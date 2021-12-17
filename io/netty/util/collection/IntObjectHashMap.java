// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.collection;

import java.util.NoSuchElementException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;

public class IntObjectHashMap<V> implements IntObjectMap<V>, Iterable<Entry<V>>
{
    private /* synthetic */ int[] keys;
    private static final /* synthetic */ Object NULL_VALUE;
    private static final /* synthetic */ int[] lIlllIlIlllIlI;
    private /* synthetic */ V[] values;
    private /* synthetic */ int size;
    private /* synthetic */ int maxSize;
    private static final /* synthetic */ String[] lIlllIlIllIlIl;
    private final /* synthetic */ float loadFactor;
    
    @Override
    public int size() {
        return this.size;
    }
    
    @Override
    public void putAll(final IntObjectMap<V> llllllllllllIllllIlllllIIIIIllll) {
        if (lIIIIIlIlllllIll((llllllllllllIllllIlllllIIIIIllll instanceof IntObjectHashMap) ? 1 : 0)) {
            final IntObjectHashMap<V> llllllllllllIllllIlllllIIIIlIIll = (IntObjectHashMap)llllllllllllIllllIlllllIIIIIllll;
            int llllllllllllIllllIlllllIIIIlIlII = IntObjectHashMap.lIlllIlIlllIlI[2];
            while (lIIIIIlIllllIllI(llllllllllllIllllIlllllIIIIlIlII, llllllllllllIllllIlllllIIIIlIIll.values.length)) {
                final V llllllllllllIllllIlllllIIIIlIlIl = llllllllllllIllllIlllllIIIIlIIll.values[llllllllllllIllllIlllllIIIIlIlII];
                if (lIIIIIlIllllllII(llllllllllllIllllIlllllIIIIlIlIl)) {
                    this.put(llllllllllllIllllIlllllIIIIlIIll.keys[llllllllllllIllllIlllllIIIIlIlII], llllllllllllIllllIlllllIIIIlIlIl);
                    "".length();
                }
                ++llllllllllllIllllIlllllIIIIlIlII;
                "".length();
                if (null != null) {
                    return;
                }
            }
            return;
        }
        final Iterator llllllllllllIllllIlllllIIIIlIIIl = llllllllllllIllllIlllllIIIIIllll.entries().iterator();
        while (lIIIIIlIlllllIll(llllllllllllIllllIlllllIIIIlIIIl.hasNext() ? 1 : 0)) {
            final Entry<V> llllllllllllIllllIlllllIIIIlIIlI = llllllllllllIllllIlllllIIIIlIIIl.next();
            this.put(llllllllllllIllllIlllllIIIIlIIlI.key(), llllllllllllIllllIlllllIIIIlIIlI.value());
            "".length();
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
    }
    
    private static boolean lIIIIIlIllllllIl(final int llllllllllllIllllIllllIIlIIIIIlI) {
        return llllllllllllIllllIllllIIlIIIIIlI == 0;
    }
    
    @Override
    public Iterable<Entry<V>> entries() {
        return this;
    }
    
    private void rehash(final int llllllllllllIllllIllllIlIlIIllII) {
        final int[] llllllllllllIllllIllllIlIlIIlIlI = this.keys;
        final V[] llllllllllllIllllIllllIlIlIIlIII = this.values;
        this.keys = new int[llllllllllllIllllIllllIlIlIIllII];
        final V[] llllllllllllIllllIllllIlIlIIIlll = (V[])new Object[llllllllllllIllllIllllIlIlIIllII];
        this.values = llllllllllllIllllIllllIlIlIIIlll;
        this.maxSize = this.calcMaxSize(llllllllllllIllllIllllIlIlIIllII);
        int llllllllllllIllllIllllIlIlIlIIII = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIlIlIlIIII, llllllllllllIllllIllllIlIlIIlIII.length)) {
            final V llllllllllllIllllIllllIlIlIlIIlI = llllllllllllIllllIllllIlIlIIlIII[llllllllllllIllllIllllIlIlIlIIII];
            if (lIIIIIlIllllllII(llllllllllllIllllIllllIlIlIlIIlI)) {
                final int llllllllllllIllllIllllIlIlIllIII = llllllllllllIllllIllllIlIlIIlIlI[llllllllllllIllllIllllIlIlIlIIII];
                int llllllllllllIllllIllllIlIlIlIlII;
                final int llllllllllllIllllIllllIlIlIlIllI = llllllllllllIllllIllllIlIlIlIlII = this.hashIndex(llllllllllllIllllIllllIlIlIllIII);
                while (!lIIIIIlIlllllIIl(this.values[llllllllllllIllllIllllIlIlIlIlII])) {
                    llllllllllllIllllIllllIlIlIlIlII = this.probeNext(llllllllllllIllllIllllIlIlIlIlII);
                    "".length();
                    if ((0x4C ^ 0x2D ^ (0xE0 ^ 0x85)) < (0xC2 ^ 0x90 ^ (0x76 ^ 0x20))) {
                        return;
                    }
                }
                this.keys[llllllllllllIllllIllllIlIlIlIlII] = llllllllllllIllllIllllIlIlIllIII;
                this.values[llllllllllllIllllIllllIlIlIlIlII] = toInternal(llllllllllllIllllIllllIlIlIlIIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            ++llllllllllllIllllIllllIlIlIlIIII;
            "".length();
            if (((0x38 ^ 0x4F ^ (0x42 ^ 0x54)) & (0xF7 ^ 0x9A ^ (0x11 ^ 0x1D) ^ -" ".length())) > (0x2F ^ 0x27 ^ (0x30 ^ 0x3C))) {
                return;
            }
        }
    }
    
    private static int adjustCapacity(final int llllllllllllIllllIllllIllIIIIlIl) {
        return llllllllllllIllllIllllIllIIIIlIl | IntObjectHashMap.lIlllIlIlllIlI[1];
    }
    
    private void growSize() {
        this.size += IntObjectHashMap.lIlllIlIlllIlI[1];
        if (lIIIIIllIIIIIIII(this.size, this.maxSize)) {
            this.rehash(adjustCapacity((int)Math.min(this.keys.length * 2.0, 2.147483639E9)));
            "".length();
            if (((0x9A ^ 0xB5) & ~(0x8F ^ 0xA0)) > ((0x3F ^ 0x30) & ~(0x7F ^ 0x70))) {
                return;
            }
        }
        else if (lIIIIIlIlllllIlI(this.size, this.keys.length)) {
            this.rehash(this.keys.length);
        }
    }
    
    private static boolean lIIIIIlIlllllIII(final Object llllllllllllIllllIllllIIlIIlIllI, final Object llllllllllllIllllIllllIIlIIlIlII) {
        return llllllllllllIllllIllllIIlIIlIllI == llllllllllllIllllIllllIIlIIlIlII;
    }
    
    public IntObjectHashMap(final int llllllllllllIllllIlllllIIlIIIlIl, final float llllllllllllIllllIlllllIIlIIlIIl) {
        if (lIIIIIlIllllIllI(llllllllllllIllllIlllllIIlIIIlIl, IntObjectHashMap.lIlllIlIlllIlI[1])) {
            throw new IllegalArgumentException(IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[2]]);
        }
        if (!lIIIIIlIllllIlll(lIIIIIlIllllIlII(llllllllllllIllllIlllllIIlIIlIIl, 0.0f)) || lIIIIIlIllllIlll(lIIIIIlIllllIlIl(llllllllllllIllllIlllllIIlIIlIIl, 1.0f))) {
            throw new IllegalArgumentException(IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[1]]);
        }
        this.loadFactor = llllllllllllIllllIlllllIIlIIlIIl;
        final int llllllllllllIllllIlllllIIlIIlIII = adjustCapacity(llllllllllllIllllIlllllIIlIIIlIl);
        this.keys = new int[llllllllllllIllllIlllllIIlIIlIII];
        final V[] llllllllllllIllllIlllllIIlIIIlll = (V[])new Object[llllllllllllIllllIlllllIIlIIlIII];
        this.values = llllllllllllIllllIlllllIIlIIIlll;
        this.maxSize = this.calcMaxSize(llllllllllllIllllIlllllIIlIIlIII);
    }
    
    private static boolean lIIIIIllIIIIIIIl(final int llllllllllllIllllIllllIIlIlIIlII, final int llllllllllllIllllIllllIIlIlIIIlI) {
        return llllllllllllIllllIllllIIlIlIIlII <= llllllllllllIllllIllllIIlIlIIIlI;
    }
    
    private int hashIndex(final int llllllllllllIllllIllllIllIIlIIIl) {
        return llllllllllllIllllIllllIllIIlIIIl % this.keys.length;
    }
    
    @Override
    public Iterator<Entry<V>> iterator() {
        return new IteratorImpl();
    }
    
    private static boolean lIIIIIlIllllIllI(final int llllllllllllIllllIllllIIlIlIllIl, final int llllllllllllIllllIllllIIlIlIlIll) {
        return llllllllllllIllllIllllIIlIlIllIl < llllllllllllIllllIllllIIlIlIlIll;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllIllllIllIlIlIIl) {
        if (lIIIIIlIlllllIII(this, llllllllllllIllllIllllIllIlIlIIl)) {
            return IntObjectHashMap.lIlllIlIlllIlI[1] != 0;
        }
        if (lIIIIIlIllllllIl((llllllllllllIllllIllllIllIlIlIIl instanceof IntObjectMap) ? 1 : 0)) {
            return IntObjectHashMap.lIlllIlIlllIlI[2] != 0;
        }
        final IntObjectMap llllllllllllIllllIllllIllIlIlIll = (IntObjectMap)llllllllllllIllllIllllIllIlIlIIl;
        if (lIIIIIlIllllllll(this.size, llllllllllllIllllIllllIllIlIlIll.size())) {
            return IntObjectHashMap.lIlllIlIlllIlI[2] != 0;
        }
        int llllllllllllIllllIllllIllIlIlllI = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIllIlIlllI, this.values.length)) {
            final V llllllllllllIllllIllllIllIlIllll = this.values[llllllllllllIllllIllllIllIlIlllI];
            if (lIIIIIlIllllllII(llllllllllllIllllIllllIllIlIllll)) {
                final int llllllllllllIllllIllllIllIllIIIl = this.keys[llllllllllllIllllIllllIllIlIlllI];
                final Object llllllllllllIllllIllllIllIllIIII = llllllllllllIllllIllllIllIlIlIll.get(llllllllllllIllllIllllIllIllIIIl);
                if (lIIIIIlIlllllIII(llllllllllllIllllIllllIllIlIllll, IntObjectHashMap.NULL_VALUE)) {
                    if (lIIIIIlIllllllII(llllllllllllIllllIllllIllIllIIII)) {
                        return IntObjectHashMap.lIlllIlIlllIlI[2] != 0;
                    }
                }
                else if (lIIIIIlIllllllIl(llllllllllllIllllIllllIllIlIllll.equals(llllllllllllIllllIllllIllIllIIII) ? 1 : 0)) {
                    return IntObjectHashMap.lIlllIlIlllIlI[2] != 0;
                }
            }
            ++llllllllllllIllllIllllIllIlIlllI;
            "".length();
            if (null != null) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
            }
        }
        return IntObjectHashMap.lIlllIlIlllIlI[1] != 0;
    }
    
    @Override
    public int[] keys() {
        final int[] llllllllllllIllllIllllIlllIlIllI = new int[this.size()];
        int llllllllllllIllllIllllIlllIlIlIl = IntObjectHashMap.lIlllIlIlllIlI[2];
        int llllllllllllIllllIllllIlllIllIII = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIlllIllIII, this.values.length)) {
            if (lIIIIIlIllllllII(this.values[llllllllllllIllllIllllIlllIllIII])) {
                llllllllllllIllllIllllIlllIlIllI[llllllllllllIllllIllllIlllIlIlIl++] = this.keys[llllllllllllIllllIllllIlllIllIII];
            }
            ++llllllllllllIllllIllllIlllIllIII;
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        return llllllllllllIllllIllllIlllIlIllI;
    }
    
    @Override
    public V[] values(final Class<V> llllllllllllIllllIllllIlllIIIlIl) {
        final V[] llllllllllllIllllIllllIlllIIlIII = (V[])Array.newInstance(llllllllllllIllllIllllIlllIIIlIl, this.size());
        int llllllllllllIllllIllllIlllIIIlll = IntObjectHashMap.lIlllIlIlllIlI[2];
        int llllllllllllIllllIllllIlllIIlIll = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIlllIIlIll, this.values.length)) {
            if (lIIIIIlIllllllII(this.values[llllllllllllIllllIllllIlllIIlIll])) {
                llllllllllllIllllIllllIlllIIlIII[llllllllllllIllllIllllIlllIIIlll++] = this.values[llllllllllllIllllIllllIlllIIlIll];
            }
            ++llllllllllllIllllIllllIlllIIlIll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return llllllllllllIllllIllllIlllIIlIII;
    }
    
    private int indexOf(final int llllllllllllIllllIllllIllIIllIlI) {
        int llllllllllllIllllIllllIllIIlllII;
        final int llllllllllllIllllIllllIllIIlllIl = llllllllllllIllllIllllIllIIlllII = this.hashIndex(llllllllllllIllllIllllIllIIllIlI);
        while (!lIIIIIlIlllllIIl(this.values[llllllllllllIllllIllllIllIIlllII])) {
            if (lIIIIIlIlllllIlI(llllllllllllIllllIllllIllIIllIlI, this.keys[llllllllllllIllllIllllIllIIlllII])) {
                return llllllllllllIllllIllllIllIIlllII;
            }
            if (lIIIIIlIlllllIlI(llllllllllllIllllIllllIllIIlllII = this.probeNext(llllllllllllIllllIllllIllIIlllII), llllllllllllIllllIllllIllIIlllIl)) {
                return IntObjectHashMap.lIlllIlIlllIlI[3];
            }
        }
        return IntObjectHashMap.lIlllIlIlllIlI[3];
    }
    
    public IntObjectHashMap(final int llllllllllllIllllIlllllIIlIlIIIl) {
        this(llllllllllllIllllIlllllIIlIlIIIl, 0.5f);
    }
    
    private static int lIIIIIlIllllIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void clear() {
        Arrays.fill(this.keys, IntObjectHashMap.lIlllIlIlllIlI[2]);
        Arrays.fill(this.values, null);
        this.size = IntObjectHashMap.lIlllIlIlllIlI[2];
    }
    
    private static void lIIIIIlIllllIIll() {
        (lIlllIlIlllIlI = new int[13])[0] = (0xAF ^ 0xA4);
        IntObjectHashMap.lIlllIlIlllIlI[1] = " ".length();
        IntObjectHashMap.lIlllIlIlllIlI[2] = ((0x9F ^ 0x88) & ~(0x5B ^ 0x4C));
        IntObjectHashMap.lIlllIlIlllIlI[3] = -" ".length();
        IntObjectHashMap.lIlllIlIlllIlI[4] = "  ".length();
        IntObjectHashMap.lIlllIlIlllIlI[5] = "   ".length();
        IntObjectHashMap.lIlllIlIlllIlI[6] = (0xAE ^ 0xAA);
        IntObjectHashMap.lIlllIlIlllIlI[7] = (0xB3 ^ 0xB6);
        IntObjectHashMap.lIlllIlIlllIlI[8] = (0x10 ^ 0x2D);
        IntObjectHashMap.lIlllIlIlllIlI[9] = (46 + 151 - 118 + 87 ^ 25 + 125 - 139 + 149);
        IntObjectHashMap.lIlllIlIlllIlI[10] = (0x39 ^ 0x44);
        IntObjectHashMap.lIlllIlIlllIlI[11] = (0x51 ^ 0x56);
        IntObjectHashMap.lIlllIlIlllIlI[12] = (54 + 18 - 37 + 113 ^ 18 + 146 - 41 + 33);
    }
    
    public IntObjectHashMap() {
        this(IntObjectHashMap.lIlllIlIlllIlI[0], 0.5f);
    }
    
    private static void lIIIIIlIlllIlllI() {
        (lIlllIlIllIlIl = new String[IntObjectHashMap.lIlllIlIlllIlI[11]])[IntObjectHashMap.lIlllIlIlllIlI[2]] = lIIIIIlIlllIlIlI("Q8HL+5ohXw3d/Hb/9TQdeuh5QdPPryjo3bSy/CirLzI=", "KytoT");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[1]] = lIIIIIlIlllIlIll("LzwMNgsiMBk9P2M+GCE5YzEIcnNjY00zIydzUW9tcg==", "CSmRM");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[4]] = lIIIIIlIlllIlIlI("4Bk8QjatqpXvdI3Ey+bsf7OuDOuW8npa", "cTizP");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[5]] = lIIIIIlIlllIlIlI("E5mP+vtDiAo=", "irNlV");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[6]] = lIIIIIlIlllIlIll("Hg==", "eWoUj");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[7]] = lIIIIIlIlllIllIl("Um10NT81RP4=", "IDrvQ");
        IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[9]] = lIIIIIlIlllIlIll("TC4EESpEFw0IcA==", "dZlxY");
    }
    
    private static String lIIIIIlIlllIlIll(String llllllllllllIllllIllllIIllIllllI, final String llllllllllllIllllIllllIIlllIIIlI) {
        llllllllllllIllllIllllIIllIllllI = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllllIIllIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllllIIlllIIIIl = new StringBuilder();
        final char[] llllllllllllIllllIllllIIlllIIIII = llllllllllllIllllIllllIIlllIIIlI.toCharArray();
        int llllllllllllIllllIllllIIllIlllll = IntObjectHashMap.lIlllIlIlllIlI[2];
        final boolean llllllllllllIllllIllllIIllIllIII = (Object)((String)llllllllllllIllllIllllIIllIllllI).toCharArray();
        final long llllllllllllIllllIllllIIllIlIllI = llllllllllllIllllIllllIIllIllIII.length;
        double llllllllllllIllllIllllIIllIlIlIl = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI((int)llllllllllllIllllIllllIIllIlIlIl, (int)llllllllllllIllllIllllIIllIlIllI)) {
            final char llllllllllllIllllIllllIIlllIIlII = llllllllllllIllllIllllIIllIllIII[llllllllllllIllllIllllIIllIlIlIl];
            llllllllllllIllllIllllIIlllIIIIl.append((char)(llllllllllllIllllIllllIIlllIIlII ^ llllllllllllIllllIllllIIlllIIIII[llllllllllllIllllIllllIIllIlllll % llllllllllllIllllIllllIIlllIIIII.length]));
            "".length();
            ++llllllllllllIllllIllllIIllIlllll;
            ++llllllllllllIllllIllllIIllIlIlIl;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllllIIlllIIIIl);
    }
    
    private static boolean lIIIIIlIllllIlll(final int llllllllllllIllllIllllIIIllllllI) {
        return llllllllllllIllllIllllIIIllllllI > 0;
    }
    
    private static boolean lIIIIIllIIIIIIII(final int llllllllllllIllllIllllIIlIIllIlI, final int llllllllllllIllllIllllIIlIIllIIl) {
        return llllllllllllIllllIllllIIlIIllIlI > llllllllllllIllllIllllIIlIIllIIl;
    }
    
    @Override
    public V get(final int llllllllllllIllllIlllllIIIllIlII) {
        final int llllllllllllIllllIlllllIIIllIllI = this.indexOf(llllllllllllIllllIlllllIIIllIlII);
        V external;
        if (lIIIIIlIlllllIlI(llllllllllllIllllIlllllIIIllIllI, IntObjectHashMap.lIlllIlIlllIlI[3])) {
            external = null;
            "".length();
            if ((0x46 ^ 0x42) <= 0) {
                return null;
            }
        }
        else {
            external = toExternal(this.values[llllllllllllIllllIlllllIIIllIllI]);
        }
        return external;
    }
    
    @Override
    public V put(final int llllllllllllIllllIlllllIIIlIIlIl, final V llllllllllllIllllIlllllIIIlIlIIl) {
        int llllllllllllIllllIlllllIIIlIIlll;
        final int llllllllllllIllllIlllllIIIlIlIII = llllllllllllIllllIlllllIIIlIIlll = this.hashIndex(llllllllllllIllllIlllllIIIlIIlIl);
        while (!lIIIIIlIlllllIIl(this.values[llllllllllllIllllIlllllIIIlIIlll])) {
            if (lIIIIIlIlllllIlI(this.keys[llllllllllllIllllIlllllIIIlIIlll], llllllllllllIllllIlllllIIIlIIlIl)) {
                final V llllllllllllIllllIlllllIIIlIllII = this.values[llllllllllllIllllIlllllIIIlIIlll];
                this.values[llllllllllllIllllIlllllIIIlIIlll] = toInternal(llllllllllllIllllIlllllIIIlIlIIl);
                return toExternal(llllllllllllIllllIlllllIIIlIllII);
            }
            if (lIIIIIlIlllllIlI(llllllllllllIllllIlllllIIIlIIlll = this.probeNext(llllllllllllIllllIlllllIIIlIIlll), llllllllllllIllllIlllllIIIlIlIII)) {
                throw new IllegalStateException(IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[4]]);
            }
        }
        this.keys[llllllllllllIllllIlllllIIIlIIlll] = llllllllllllIllllIlllllIIIlIIlIl;
        this.values[llllllllllllIllllIlllllIIIlIIlll] = toInternal(llllllllllllIllllIlllllIIIlIlIIl);
        this.growSize();
        return null;
    }
    
    @Override
    public int hashCode() {
        int llllllllllllIllllIllllIllIllllII = this.size;
        int llllllllllllIllllIllllIllIlllllI = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIllIlllllI, this.keys.length)) {
            llllllllllllIllllIllllIllIllllII ^= this.keys[llllllllllllIllllIllllIllIlllllI];
            ++llllllllllllIllllIllllIllIlllllI;
            "".length();
            if (((0x66 ^ 0x5B) & ~(0x39 ^ 0x4)) != 0x0) {
                return (0xC3 ^ 0xA3) & ~(0x2A ^ 0x4A);
            }
        }
        return llllllllllllIllllIllllIllIllllII;
    }
    
    private static String lIIIIIlIlllIllIl(final String llllllllllllIllllIllllIIllllllII, final String llllllllllllIllllIllllIIlllllIll) {
        try {
            final SecretKeySpec llllllllllllIllllIllllIlIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllllIIlllllIll.getBytes(StandardCharsets.UTF_8)), IntObjectHashMap.lIlllIlIlllIlI[12]), "DES");
            final Cipher llllllllllllIllllIllllIlIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllllIllllIlIIIIIIlI.init(IntObjectHashMap.lIlllIlIlllIlI[4], llllllllllllIllllIllllIlIIIIIlII);
            return new String(llllllllllllIllllIllllIlIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllllIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllllIlIIIIIIII) {
            llllllllllllIllllIllllIlIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private void removeAt(final int llllllllllllIllllIllllIlIllllIIl) {
        this.size -= IntObjectHashMap.lIlllIlIlllIlI[1];
        this.keys[llllllllllllIllllIllllIlIllllIIl] = IntObjectHashMap.lIlllIlIlllIlI[2];
        this.values[llllllllllllIllllIllllIlIllllIIl] = null;
        int llllllllllllIllllIllllIlIllllIll = llllllllllllIllllIllllIlIllllIIl;
        int llllllllllllIllllIllllIlIllllllI = this.probeNext(llllllllllllIllllIllllIlIllllIIl);
        while (lIIIIIlIllllllII(this.values[llllllllllllIllllIllllIlIllllllI])) {
            final int llllllllllllIllllIllllIlIlllllll = this.hashIndex(this.keys[llllllllllllIllllIllllIlIllllllI]);
            if ((lIIIIIlIllllIllI(llllllllllllIllllIllllIlIllllllI, llllllllllllIllllIllllIlIlllllll) && (!lIIIIIllIIIIIIII(llllllllllllIllllIllllIlIlllllll, llllllllllllIllllIllllIlIllllIll) || !lIIIIIllIIIIIIII(llllllllllllIllllIllllIlIllllIll, llllllllllllIllllIllllIlIllllllI))) || (lIIIIIllIIIIIIIl(llllllllllllIllllIllllIlIlllllll, llllllllllllIllllIllllIlIllllIll) && lIIIIIllIIIIIIIl(llllllllllllIllllIllllIlIllllIll, llllllllllllIllllIllllIlIllllllI))) {
                this.keys[llllllllllllIllllIllllIlIllllIll] = this.keys[llllllllllllIllllIllllIlIllllllI];
                this.values[llllllllllllIllllIllllIlIllllIll] = this.values[llllllllllllIllllIllllIlIllllllI];
                this.keys[llllllllllllIllllIllllIlIllllllI] = IntObjectHashMap.lIlllIlIlllIlI[2];
                this.values[llllllllllllIllllIllllIlIllllllI] = null;
                llllllllllllIllllIllllIlIllllIll = llllllllllllIllllIllllIlIllllllI;
            }
            llllllllllllIllllIllllIlIllllllI = this.probeNext(llllllllllllIllllIllllIlIllllllI);
            "".length();
            if (-(66 + 143 - 85 + 20 ^ 92 + 5 - 38 + 90) >= 0) {
                return;
            }
        }
    }
    
    private static boolean lIIIIIlIlllllllI(final int llllllllllllIllllIllllIIlIIIIIII) {
        return llllllllllllIllllIllllIIlIIIIIII >= 0;
    }
    
    private int calcMaxSize(final int llllllllllllIllllIllllIlIllIlllI) {
        final int llllllllllllIllllIllllIlIlllIIII = llllllllllllIllllIllllIlIllIlllI - IntObjectHashMap.lIlllIlIlllIlI[1];
        return Math.min(llllllllllllIllllIllllIlIlllIIII, (int)(llllllllllllIllllIllllIlIllIlllI * this.loadFactor));
    }
    
    private static boolean lIIIIIlIllllllII(final Object llllllllllllIllllIllllIIlIIIllll) {
        return llllllllllllIllllIllllIIlIIIllll != null;
    }
    
    private static int lIIIIIlIllllIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static <T> T toExternal(final T llllllllllllIllllIlllllIIIllllll) {
        T t;
        if (lIIIIIlIlllllIII(llllllllllllIllllIlllllIIIllllll, IntObjectHashMap.NULL_VALUE)) {
            t = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            t = llllllllllllIllllIlllllIIIllllll;
        }
        return t;
    }
    
    private static boolean lIIIIIlIlllllIlI(final int llllllllllllIllllIllllIIlIllIllI, final int llllllllllllIllllIllllIIlIllIlII) {
        return llllllllllllIllllIllllIIlIllIllI == llllllllllllIllllIllllIIlIllIlII;
    }
    
    private int probeNext(final int llllllllllllIllllIlllllIIIIlllIl) {
        int n;
        if (lIIIIIlIlllllIlI(llllllllllllIllllIlllllIIIIlllIl, this.values.length - IntObjectHashMap.lIlllIlIlllIlI[1])) {
            n = IntObjectHashMap.lIlllIlIlllIlI[2];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (0x8D ^ 0xC6) & ~(0xE6 ^ 0xAD);
            }
        }
        else {
            n = llllllllllllIllllIlllllIIIIlllIl + IntObjectHashMap.lIlllIlIlllIlI[1];
        }
        return n;
    }
    
    static {
        lIIIIIlIllllIIll();
        lIIIIIlIlllIlllI();
        DEFAULT_CAPACITY = IntObjectHashMap.lIlllIlIlllIlI[0];
        NULL_VALUE = new Object();
    }
    
    @Override
    public V remove(final int llllllllllllIllllIlllllIIIIIIlII) {
        final int llllllllllllIllllIlllllIIIIIIIll = this.indexOf(llllllllllllIllllIlllllIIIIIIlII);
        if (lIIIIIlIlllllIlI(llllllllllllIllllIlllllIIIIIIIll, IntObjectHashMap.lIlllIlIlllIlI[3])) {
            return null;
        }
        final V llllllllllllIllllIlllllIIIIIIIlI = this.values[llllllllllllIllllIlllllIIIIIIIll];
        this.removeAt(llllllllllllIllllIlllllIIIIIIIll);
        return toExternal(llllllllllllIllllIlllllIIIIIIIlI);
    }
    
    @Override
    public String toString() {
        if (lIIIIIlIllllllIl(this.size)) {
            return IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[5]];
        }
        final StringBuilder llllllllllllIllllIllllIlIIlIllIl = new StringBuilder(IntObjectHashMap.lIlllIlIlllIlI[6] * this.size);
        int llllllllllllIllllIllllIlIIlIllll = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIlIIlIllll, this.values.length)) {
            final V llllllllllllIllllIllllIlIIllIIII = this.values[llllllllllllIllllIllllIlIIlIllll];
            if (lIIIIIlIllllllII(llllllllllllIllllIllllIlIIllIIII)) {
                final StringBuilder sb = llllllllllllIllllIllllIlIIlIllIl;
                String str;
                if (lIIIIIlIllllllIl(llllllllllllIllllIllllIlIIlIllIl.length())) {
                    str = IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[6]];
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return null;
                    }
                }
                else {
                    str = IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[7]];
                }
                sb.append(str);
                "".length();
                final StringBuilder append = llllllllllllIllllIllllIlIIlIllIl.append(this.keys[llllllllllllIllllIllllIlIIlIllll]).append((char)IntObjectHashMap.lIlllIlIlllIlI[8]);
                Object obj;
                if (lIIIIIlIlllllIII(llllllllllllIllllIllllIlIIllIIII, this)) {
                    obj = IntObjectHashMap.lIlllIlIllIlIl[IntObjectHashMap.lIlllIlIlllIlI[9]];
                    "".length();
                    if (-(0x97 ^ 0x92) >= 0) {
                        return null;
                    }
                }
                else {
                    obj = llllllllllllIllllIllllIlIIllIIII;
                }
                append.append(obj);
                "".length();
            }
            ++llllllllllllIllllIllllIlIIlIllll;
            "".length();
            if (((0x7C ^ 0x33 ^ (0x18 ^ 0x7)) & (0x2E ^ 0x71 ^ (0x80 ^ 0x8F) ^ -" ".length())) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllllIlIIlIllIl.append((char)IntObjectHashMap.lIlllIlIlllIlI[10]));
    }
    
    private static boolean lIIIIIlIlllllIIl(final Object llllllllllllIllllIllllIIlIIIlIlI) {
        return llllllllllllIllllIllllIIlIIIlIlI == null;
    }
    
    @Override
    public boolean containsValue(final V llllllllllllIllllIllllIllllIlIII) {
        final V llllllllllllIllllIllllIllllIIlll = toInternal(llllllllllllIllllIllllIllllIlIII);
        int llllllllllllIllllIllllIllllIlIlI = IntObjectHashMap.lIlllIlIlllIlI[2];
        while (lIIIIIlIllllIllI(llllllllllllIllllIllllIllllIlIlI, this.values.length)) {
            if (lIIIIIlIllllllII(this.values[llllllllllllIllllIllllIllllIlIlI]) && lIIIIIlIlllllIll(this.values[llllllllllllIllllIllllIllllIlIlI].equals(llllllllllllIllllIllllIllllIIlll) ? 1 : 0)) {
                return IntObjectHashMap.lIlllIlIlllIlI[1] != 0;
            }
            ++llllllllllllIllllIllllIllllIlIlI;
            "".length();
            if ("   ".length() < 0) {
                return ((50 + 60 - 105 + 133 ^ 105 + 132 - 88 + 1) & (88 + 94 - 177 + 128 ^ 111 + 24 - 61 + 79 ^ -" ".length())) != 0x0;
            }
        }
        return IntObjectHashMap.lIlllIlIlllIlI[2] != 0;
    }
    
    @Override
    public boolean containsKey(final int llllllllllllIllllIllllIlllllIIIl) {
        int n;
        if (lIIIIIlIlllllllI(this.indexOf(llllllllllllIllllIllllIlllllIIIl))) {
            n = IntObjectHashMap.lIlllIlIlllIlI[1];
            "".length();
            if (((0x7E ^ 0x4B) & ~(0x2B ^ 0x1E)) != ((0x4C ^ 0x2F) & ~(0xC2 ^ 0xA1))) {
                return ((0x12 ^ 0x2E) & ~(0x2F ^ 0x13)) != 0x0;
            }
        }
        else {
            n = IntObjectHashMap.lIlllIlIlllIlI[2];
        }
        return n != 0;
    }
    
    private static <T> T toInternal(final T llllllllllllIllllIlllllIIIllllIl) {
        Object null_VALUE;
        if (lIIIIIlIlllllIIl(llllllllllllIllllIlllllIIIllllIl)) {
            null_VALUE = IntObjectHashMap.NULL_VALUE;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            null_VALUE = llllllllllllIllllIlllllIIIllllIl;
        }
        return (T)null_VALUE;
    }
    
    @Override
    public boolean isEmpty() {
        int n;
        if (lIIIIIlIllllllIl(this.size)) {
            n = IntObjectHashMap.lIlllIlIlllIlI[1];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = IntObjectHashMap.lIlllIlIlllIlI[2];
        }
        return n != 0;
    }
    
    private static boolean lIIIIIlIlllllIll(final int llllllllllllIllllIllllIIlIIIIlIl) {
        return llllllllllllIllllIllllIIlIIIIlIl != 0;
    }
    
    private static boolean lIIIIIlIllllllll(final int llllllllllllIllllIllllIIIllllIll, final int llllllllllllIllllIllllIIIllllIlI) {
        return llllllllllllIllllIllllIIIllllIll != llllllllllllIllllIllllIIIllllIlI;
    }
    
    private static String lIIIIIlIlllIlIlI(final String llllllllllllIllllIllllIIllIIIIll, final String llllllllllllIllllIllllIIllIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllllIllllIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllllIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllllIIllIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllllIIllIIIlll.init(IntObjectHashMap.lIlllIlIlllIlI[4], llllllllllllIllllIllllIIllIIlIII);
            return new String(llllllllllllIllllIllllIIllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllllIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllllIIllIIIllI) {
            llllllllllllIllllIllllIIllIIIllI.printStackTrace();
            return null;
        }
    }
    
    private final class IteratorImpl implements Iterator<Entry<V>>, Entry<V>
    {
        private static final /* synthetic */ int[] lllIIlIlIIIlll;
        private static final /* synthetic */ String[] lllIIlIlIIIIlI;
        private /* synthetic */ int prevIndex;
        private /* synthetic */ int entryIndex;
        private /* synthetic */ int nextIndex;
        
        private static void lIIllllllIIlIlIl() {
            (lllIIlIlIIIIlI = new String[IteratorImpl.lllIIlIlIIIlll[1]])[IteratorImpl.lllIIlIlIIIlll[2]] = lIIllllllIIlIIll("D70B2hHGft91/VVcU1MZb+jJBommRKwbjpWhMDdADgH0mSNIR8gfUw==", "kKgrA");
        }
        
        private static boolean lIIllllllIIllIlI(final int llllllllllllIlIllllIlIIIlIllllIl, final int llllllllllllIlIllllIlIIIlIllllII) {
            return llllllllllllIlIllllIlIIIlIllllIl == llllllllllllIlIllllIlIIIlIllllII;
        }
        
        @Override
        public void setValue(final V llllllllllllIlIllllIlIIIlllIIlII) {
            IntObjectHashMap.this.values[this.entryIndex] = (V)toInternal(llllllllllllIlIllllIlIIIlllIIlII);
        }
        
        private static boolean lIIllllllIIllIII(final int llllllllllllIlIllllIlIIIlIlIllll, final int llllllllllllIlIllllIlIIIlIlIlllI) {
            return llllllllllllIlIllllIlIIIlIlIllll != llllllllllllIlIllllIlIIIlIlIlllI;
        }
        
        @Override
        public void remove() {
            if (lIIllllllIIlllIl(this.prevIndex)) {
                throw new IllegalStateException(IteratorImpl.lllIIlIlIIIIlI[IteratorImpl.lllIIlIlIIIlll[2]]);
            }
            IntObjectHashMap.this.removeAt(this.prevIndex);
            this.prevIndex = IteratorImpl.lllIIlIlIIIlll[0];
        }
        
        static {
            lIIllllllIIlIlll();
            lIIllllllIIlIlIl();
        }
        
        private static boolean lIIllllllIIllIIl(final Object llllllllllllIlIllllIlIIIlIllIllI) {
            return llllllllllllIlIllllIlIIIlIllIllI != null;
        }
        
        @Override
        public boolean hasNext() {
            if (lIIllllllIIllIlI(this.nextIndex, IteratorImpl.lllIIlIlIIIlll[0])) {
                this.scanNext();
            }
            int n;
            if (lIIllllllIIllIll(this.nextIndex, IntObjectHashMap.this.keys.length)) {
                n = IteratorImpl.lllIIlIlIIIlll[1];
                "".length();
                if (-" ".length() >= ((0x13 ^ 0x73 ^ (0xBB ^ 0xC6)) & (0x61 ^ 0x3D ^ (0x40 ^ 0x1) ^ -" ".length()))) {
                    return ((0x48 ^ 0x66 ^ (0x95 ^ 0x8C)) & (44 + 3 + 17 + 82 ^ 140 + 110 - 127 + 42 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = IteratorImpl.lllIIlIlIIIlll[2];
            }
            return n != 0;
        }
        
        private static boolean lIIllllllIIlllIl(final int llllllllllllIlIllllIlIIIlIllIIlI) {
            return llllllllllllIlIllllIlIIIlIllIIlI < 0;
        }
        
        @Override
        public int key() {
            return IntObjectHashMap.this.keys[this.entryIndex];
        }
        
        private static void lIIllllllIIlIlll() {
            (lllIIlIlIIIlll = new int[5])[0] = -" ".length();
            IteratorImpl.lllIIlIlIIIlll[1] = " ".length();
            IteratorImpl.lllIIlIlIIIlll[2] = ((0x79 ^ 0x37) & ~(0x8E ^ 0xC0));
            IteratorImpl.lllIIlIlIIIlll[3] = (0x46 ^ 0x4E);
            IteratorImpl.lllIIlIlIIIlll[4] = "  ".length();
        }
        
        @Override
        public Entry<V> next() {
            if (lIIllllllIIlllII(this.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            this.prevIndex = this.nextIndex;
            this.scanNext();
            this.entryIndex = this.prevIndex;
            return this;
        }
        
        private static boolean lIIllllllIIllIll(final int llllllllllllIlIllllIlIIIlIlllIIl, final int llllllllllllIlIllllIlIIIlIlllIII) {
            return llllllllllllIlIllllIlIIIlIlllIIl < llllllllllllIlIllllIlIIIlIlllIII;
        }
        
        @Override
        public V value() {
            return (V)toExternal(IntObjectHashMap.this.values[this.entryIndex]);
        }
        
        private static boolean lIIllllllIIlllII(final int llllllllllllIlIllllIlIIIlIllIlII) {
            return llllllllllllIlIllllIlIIIlIllIlII == 0;
        }
        
        private IteratorImpl() {
            this.prevIndex = IteratorImpl.lllIIlIlIIIlll[0];
            this.nextIndex = IteratorImpl.lllIIlIlIIIlll[0];
            this.entryIndex = IteratorImpl.lllIIlIlIIIlll[0];
        }
        
        private static String lIIllllllIIlIIll(final String llllllllllllIlIllllIlIIIllIIlIlI, final String llllllllllllIlIllllIlIIIllIIlIII) {
            try {
                final SecretKeySpec llllllllllllIlIllllIlIIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), IteratorImpl.lllIIlIlIIIlll[3]), "DES");
                final Cipher llllllllllllIlIllllIlIIIllIIllIl = Cipher.getInstance("DES");
                llllllllllllIlIllllIlIIIllIIllIl.init(IteratorImpl.lllIIlIlIIIlll[4], llllllllllllIlIllllIlIIIllIIllll);
                return new String(llllllllllllIlIllllIlIIIllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIIIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllIlIIIllIIllII) {
                llllllllllllIlIllllIlIIIllIIllII.printStackTrace();
                return null;
            }
        }
        
        private void scanNext() {
            do {
                final int n = this.nextIndex + IteratorImpl.lllIIlIlIIIlll[1];
                this.nextIndex = n;
                if (lIIllllllIIllIII(n, IntObjectHashMap.this.values.length)) {
                    continue;
                }
                return;
            } while (!lIIllllllIIllIIl(IntObjectHashMap.this.values[this.nextIndex]));
            "".length();
            if (((0xC2 ^ 0x96) & ~(0x6C ^ 0x38)) > 0) {
                return;
            }
        }
    }
}
