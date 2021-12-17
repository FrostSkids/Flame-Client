// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class LongHashMap<V>
{
    private static final /* synthetic */ int[] lIlllIIIlIIIII;
    private /* synthetic */ int capacity;
    private transient /* synthetic */ Entry<V>[] hashArray;
    private transient volatile /* synthetic */ int modCount;
    private /* synthetic */ int mask;
    private transient /* synthetic */ int numHashElements;
    
    public LongHashMap() {
        this.hashArray = (Entry<V>[])new Entry[LongHashMap.lIlllIIIlIIIII[0]];
        this.capacity = LongHashMap.lIlllIIIlIIIII[1];
        this.mask = this.hashArray.length - LongHashMap.lIlllIIIlIIIII[2];
    }
    
    private void copyHashTableTo(final Entry<V>[] llllllllllllIlllllIlllIIIIlIlllI) {
        final Entry[] llllllllllllIlllllIlllIIIIllIlIl = this.hashArray;
        final int llllllllllllIlllllIlllIIIIllIlII = llllllllllllIlllllIlllIIIIlIlllI.length;
        int llllllllllllIlllllIlllIIIIllIIll = LongHashMap.lIlllIIIlIIIII[8];
        "".length();
        if (-(0xAB ^ 0x97 ^ (0x32 ^ 0xA)) > 0) {
            return;
        }
        while (!lIIIIIIlIIIllIII(llllllllllllIlllllIlllIIIIllIIll, llllllllllllIlllllIlllIIIIllIlIl.length)) {
            Entry<V> llllllllllllIlllllIlllIIIIllIIlI = (Entry<V>)llllllllllllIlllllIlllIIIIllIlIl[llllllllllllIlllllIlllIIIIllIIll];
            if (lIIIIIIlIIIlIlII(llllllllllllIlllllIlllIIIIllIIlI)) {
                llllllllllllIlllllIlllIIIIllIlIl[llllllllllllIlllllIlllIIIIllIIll] = null;
                Entry<V> llllllllllllIlllllIlllIIIIllIIIl;
                do {
                    llllllllllllIlllllIlllIIIIllIIIl = llllllllllllIlllllIlllIIIIllIIlI.nextEntry;
                    final int llllllllllllIlllllIlllIIIIllIIII = getHashIndex(llllllllllllIlllllIlllIIIIllIIlI.hash, llllllllllllIlllllIlllIIIIllIlII - LongHashMap.lIlllIIIlIIIII[2]);
                    llllllllllllIlllllIlllIIIIllIIlI.nextEntry = llllllllllllIlllllIlllIIIIlIlllI[llllllllllllIlllllIlllIIIIllIIII];
                    llllllllllllIlllllIlllIIIIlIlllI[llllllllllllIlllllIlllIIIIllIIII] = llllllllllllIlllllIlllIIIIllIIlI;
                    llllllllllllIlllllIlllIIIIllIIlI = llllllllllllIlllllIlllIIIIllIIIl;
                } while (!lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIIllIIIl));
            }
            ++llllllllllllIlllllIlllIIIIllIIll;
        }
    }
    
    private static int lIIIIIIlIIIlIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIIIIlIIIllIII(final int llllllllllllIlllllIllIlllllIllll, final int llllllllllllIlllllIllIlllllIlllI) {
        return llllllllllllIlllllIllIlllllIllll >= llllllllllllIlllllIllIlllllIlllI;
    }
    
    final Entry<V> getEntry(final long llllllllllllIlllllIlllIIIllIIIll) {
        final int llllllllllllIlllllIlllIIIllIIllI = getHashedKey(llllllllllllIlllllIlllIIIllIIIll);
        Entry<V> llllllllllllIlllllIlllIIIllIIlIl = this.hashArray[getHashIndex(llllllllllllIlllllIlllIIIllIIllI, this.mask)];
        "".length();
        if (-" ".length() >= "  ".length()) {
            return null;
        }
        while (!lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIllIIlIl)) {
            if (lIIIIIIlIIIlIIlI(lIIIIIIlIIIlIlIl(llllllllllllIlllllIlllIIIllIIlIl.key, llllllllllllIlllllIlllIIIllIIIll))) {
                return llllllllllllIlllllIlllIIIllIIlIl;
            }
            llllllllllllIlllllIlllIIIllIIlIl = llllllllllllIlllllIlllIIIllIIlIl.nextEntry;
        }
        return null;
    }
    
    public int getNumHashElements() {
        return this.numHashElements;
    }
    
    public V remove(final long llllllllllllIlllllIlllIIIIlIIIll) {
        final Entry<V> llllllllllllIlllllIlllIIIIlIIIlI = this.removeKey(llllllllllllIlllllIlllIIIIlIIIll);
        V value;
        if (lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIIlIIIlI)) {
            value = null;
            "".length();
            if (-" ".length() >= (0x63 ^ 0x4B ^ (0x1D ^ 0x31))) {
                return null;
            }
        }
        else {
            value = llllllllllllIlllllIlllIIIIlIIIlI.value;
        }
        return value;
    }
    
    private static int lIIIIIIlIIIllIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIIIIIIlIIIlIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIIIIIIlIIIlIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIIIIIlIIIlIIII() {
        (lIlllIIIlIIIII = new int[12])[0] = (-(0xFFFFF17B & 0x6FAF) & (0xFFFFFDEA & 0x733F));
        LongHashMap.lIlllIIIlIIIII[1] = (0xFFFFFDC8 & 0xE37);
        LongHashMap.lIlllIIIlIIIII[2] = " ".length();
        LongHashMap.lIlllIIIlIIIII[3] = (0x2F ^ 0x4F ^ (0x41 ^ 0x1));
        LongHashMap.lIlllIIIlIIIII[4] = (115 + 12 - 119 + 172 ^ 48 + 15 + 19 + 78);
        LongHashMap.lIlllIIIlIIIII[5] = (3 + 31 + 133 + 17 ^ 83 + 3 + 29 + 65);
        LongHashMap.lIlllIIIlIIIII[6] = (0x8D ^ 0x8A);
        LongHashMap.lIlllIIIlIIIII[7] = (0x26 ^ 0x22);
        LongHashMap.lIlllIIIlIIIII[8] = ((0x7A ^ 0x37 ^ (0x1F ^ 0x76)) & (0xD1 ^ 0x95 ^ (0xD2 ^ 0xB2) ^ -" ".length()));
        LongHashMap.lIlllIIIlIIIII[9] = (-(0xFFFFDC7B & 0x2BFC) & (0xFFFFC8FF & 0x40003F77));
        LongHashMap.lIlllIIIlIIIII[10] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        LongHashMap.lIlllIIIlIIIII[11] = "  ".length();
    }
    
    private static int getHashIndex(final int llllllllllllIlllllIlllIIlIIIIIll, final int llllllllllllIlllllIlllIIlIIIIIlI) {
        return llllllllllllIlllllIlllIIlIIIIIll & llllllllllllIlllllIlllIIlIIIIIlI;
    }
    
    private static boolean lIIIIIIlIIIlIIlI(final int llllllllllllIlllllIllIlllllIIlII) {
        return llllllllllllIlllllIllIlllllIIlII == 0;
    }
    
    private static int getHashedKey(final long llllllllllllIlllllIlllIIlIIIllII) {
        return hash((int)(llllllllllllIlllllIlllIIlIIIllII ^ llllllllllllIlllllIlllIIlIIIllII >>> LongHashMap.lIlllIIIlIIIII[3]));
    }
    
    public void add(final long llllllllllllIlllllIlllIIIlIllIIl, final V llllllllllllIlllllIlllIIIlIlIIlI) {
        final int llllllllllllIlllllIlllIIIlIlIlll = getHashedKey(llllllllllllIlllllIlllIIIlIllIIl);
        final int llllllllllllIlllllIlllIIIlIlIllI = getHashIndex(llllllllllllIlllllIlllIIIlIlIlll, this.mask);
        Entry<V> llllllllllllIlllllIlllIIIlIlIlIl = this.hashArray[llllllllllllIlllllIlllIIIlIlIllI];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIlIlIlIl)) {
            if (lIIIIIIlIIIlIIlI(lIIIIIIlIIIlIllI(llllllllllllIlllllIlllIIIlIlIlIl.key, llllllllllllIlllllIlllIIIlIllIIl))) {
                llllllllllllIlllllIlllIIIlIlIlIl.value = llllllllllllIlllllIlllIIIlIlIIlI;
                return;
            }
            llllllllllllIlllllIlllIIIlIlIlIl = llllllllllllIlllllIlllIIIlIlIlIl.nextEntry;
        }
        this.modCount += LongHashMap.lIlllIIIlIIIII[2];
        this.createKey(llllllllllllIlllllIlllIIIlIlIlll, llllllllllllIlllllIlllIIIlIllIIl, llllllllllllIlllllIlllIIIlIlIIlI, llllllllllllIlllllIlllIIIlIlIllI);
    }
    
    private void createKey(final int llllllllllllIlllllIllIllllllllII, final long llllllllllllIlllllIlllIIIIIIIIIl, final V llllllllllllIlllllIlllIIIIIIIIII, final int llllllllllllIlllllIllIlllllllIIl) {
        final Entry<V> llllllllllllIlllllIllIlllllllllI = this.hashArray[llllllllllllIlllllIllIlllllllIIl];
        this.hashArray[llllllllllllIlllllIllIlllllllIIl] = new Entry<V>(llllllllllllIlllllIllIllllllllII, llllllllllllIlllllIlllIIIIIIIIIl, llllllllllllIlllllIlllIIIIIIIIII, llllllllllllIlllllIllIlllllllllI);
        final int numHashElements = this.numHashElements;
        this.numHashElements = numHashElements + LongHashMap.lIlllIIIlIIIII[2];
        if (lIIIIIIlIIIllIII(numHashElements, this.capacity)) {
            this.resizeTable(LongHashMap.lIlllIIIlIIIII[11] * this.hashArray.length);
        }
    }
    
    public V getValueByKey(final long llllllllllllIlllllIlllIIIllllIIl) {
        final int llllllllllllIlllllIlllIIIllllIII = getHashedKey(llllllllllllIlllllIlllIIIllllIIl);
        Entry<V> llllllllllllIlllllIlllIIIlllIlll = this.hashArray[getHashIndex(llllllllllllIlllllIlllIIIllllIII, this.mask)];
        "".length();
        if (((0x56 ^ 0x46) & ~(0x2F ^ 0x3F)) > 0) {
            return null;
        }
        while (!lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIlllIlll)) {
            if (lIIIIIIlIIIlIIlI(lIIIIIIlIIIlIIIl(llllllllllllIlllllIlllIIIlllIlll.key, llllllllllllIlllllIlllIIIllllIIl))) {
                return llllllllllllIlllllIlllIIIlllIlll.value;
            }
            llllllllllllIlllllIlllIIIlllIlll = llllllllllllIlllllIlllIIIlllIlll.nextEntry;
        }
        return null;
    }
    
    static {
        lIIIIIIlIIIlIIII();
    }
    
    public boolean containsItem(final long llllllllllllIlllllIlllIIIllIllIl) {
        if (lIIIIIIlIIIlIlII(this.getEntry(llllllllllllIlllllIlllIIIllIllIl))) {
            return LongHashMap.lIlllIIIlIIIII[2] != 0;
        }
        return LongHashMap.lIlllIIIlIIIII[8] != 0;
    }
    
    private void resizeTable(final int llllllllllllIlllllIlllIIIlIIlIII) {
        final Entry[] llllllllllllIlllllIlllIIIlIIIlll = this.hashArray;
        final int llllllllllllIlllllIlllIIIlIIIllI = llllllllllllIlllllIlllIIIlIIIlll.length;
        if (lIIIIIIlIIIlIlll(llllllllllllIlllllIlllIIIlIIIllI, LongHashMap.lIlllIIIlIIIII[9])) {
            this.capacity = LongHashMap.lIlllIIIlIIIII[10];
            "".length();
            if ("  ".length() > (0x56 ^ 0x76 ^ (0x90 ^ 0xB4))) {
                return;
            }
        }
        else {
            final Entry[] llllllllllllIlllllIlllIIIlIIIlIl = new Entry[llllllllllllIlllllIlllIIIlIIlIII];
            this.copyHashTableTo(llllllllllllIlllllIlllIIIlIIIlIl);
            this.hashArray = (Entry<V>[])llllllllllllIlllllIlllIIIlIIIlIl;
            this.mask = this.hashArray.length - LongHashMap.lIlllIIIlIIIII[2];
            this.capacity = (int)(llllllllllllIlllllIlllIIIlIIlIII * 0.75f);
        }
    }
    
    private static boolean lIIIIIIlIIIlIlII(final Object llllllllllllIlllllIllIlllllIllII) {
        return llllllllllllIlllllIllIlllllIllII != null;
    }
    
    private static int hash(int llllllllllllIlllllIlllIIlIIIlIII) {
        llllllllllllIlllllIlllIIlIIIlIII = (short)(llllllllllllIlllllIlllIIlIIIlIII ^ llllllllllllIlllllIlllIIlIIIlIII >>> LongHashMap.lIlllIIIlIIIII[4] ^ llllllllllllIlllllIlllIIlIIIlIII >>> LongHashMap.lIlllIIIlIIIII[5]);
        return llllllllllllIlllllIlllIIlIIIlIII ^ llllllllllllIlllllIlllIIlIIIlIII >>> LongHashMap.lIlllIIIlIIIII[6] ^ llllllllllllIlllllIlllIIlIIIlIII >>> LongHashMap.lIlllIIIlIIIII[7];
    }
    
    private static boolean lIIIIIIlIIIlIlll(final int llllllllllllIlllllIllIllllllIIll, final int llllllllllllIlllllIllIllllllIIlI) {
        return llllllllllllIlllllIllIllllllIIll == llllllllllllIlllllIllIllllllIIlI;
    }
    
    private static boolean lIIIIIIlIIIllIlI(final Object llllllllllllIlllllIllIlllllIlIIl, final Object llllllllllllIlllllIllIlllllIlIII) {
        return llllllllllllIlllllIllIlllllIlIIl == llllllllllllIlllllIllIlllllIlIII;
    }
    
    final Entry<V> removeKey(final long llllllllllllIlllllIlllIIIIIIllll) {
        final int llllllllllllIlllllIlllIIIIIlIlIl = getHashedKey(llllllllllllIlllllIlllIIIIIIllll);
        final int llllllllllllIlllllIlllIIIIIlIlII = getHashIndex(llllllllllllIlllllIlllIIIIIlIlIl, this.mask);
        Entry<V> llllllllllllIlllllIlllIIIIIlIIlI;
        Entry<V> llllllllllllIlllllIlllIIIIIlIIll = llllllllllllIlllllIlllIIIIIlIIlI = this.hashArray[llllllllllllIlllllIlllIIIIIlIlII];
        "".length();
        if (" ".length() <= 0) {
            return null;
        }
        while (!lIIIIIIlIIIlIIll(llllllllllllIlllllIlllIIIIIlIIlI)) {
            final Entry<V> llllllllllllIlllllIlllIIIIIlIIIl = llllllllllllIlllllIlllIIIIIlIIlI.nextEntry;
            if (lIIIIIIlIIIlIIlI(lIIIIIIlIIIllIIl(llllllllllllIlllllIlllIIIIIlIIlI.key, llllllllllllIlllllIlllIIIIIIllll))) {
                this.modCount += LongHashMap.lIlllIIIlIIIII[2];
                this.numHashElements -= LongHashMap.lIlllIIIlIIIII[2];
                if (lIIIIIIlIIIllIlI(llllllllllllIlllllIlllIIIIIlIIll, llllllllllllIlllllIlllIIIIIlIIlI)) {
                    this.hashArray[llllllllllllIlllllIlllIIIIIlIlII] = llllllllllllIlllllIlllIIIIIlIIIl;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlllllIlllIIIIIlIIll.nextEntry = llllllllllllIlllllIlllIIIIIlIIIl;
                }
                return llllllllllllIlllllIlllIIIIIlIIlI;
            }
            llllllllllllIlllllIlllIIIIIlIIll = llllllllllllIlllllIlllIIIIIlIIlI;
            llllllllllllIlllllIlllIIIIIlIIlI = llllllllllllIlllllIlllIIIIIlIIIl;
        }
        return llllllllllllIlllllIlllIIIIIlIIlI;
    }
    
    private static boolean lIIIIIIlIIIlIIll(final Object llllllllllllIlllllIllIlllllIIllI) {
        return llllllllllllIlllllIllIlllllIIllI == null;
    }
    
    static class Entry<V>
    {
        final /* synthetic */ int hash;
        /* synthetic */ V value;
        private static final /* synthetic */ int[] lIlIIlIlIIIIlI;
        final /* synthetic */ long key;
        private static final /* synthetic */ String[] lIlIIlIlIIIIIl;
        /* synthetic */ Entry<V> nextEntry;
        
        private static boolean lllIIlIlllllIlI(final Object lllllllllllllIIIllIlllIlIIIIllII) {
            return lllllllllllllIIIllIlllIlIIIIllII != null;
        }
        
        @Override
        public final int hashCode() {
            return getHashedKey(this.key);
        }
        
        private static boolean lllIIlIlllllIll(final int lllllllllllllIIIllIlllIlIIIIlIlI) {
            return lllllllllllllIIIllIlllIlIIIIlIlI != 0;
        }
        
        public final long getKey() {
            return this.key;
        }
        
        private static boolean lllIIlIlllllIII(final int lllllllllllllIIIllIlllIlIIIIlIII) {
            return lllllllllllllIIIllIlllIlIIIIlIII == 0;
        }
        
        public final V getValue() {
            return this.value;
        }
        
        Entry(final int lllllllllllllIIIllIlllIlIlIIIIll, final long lllllllllllllIIIllIlllIlIlIIIlll, final V lllllllllllllIIIllIlllIlIlIIIllI, final Entry<V> lllllllllllllIIIllIlllIlIlIIIIII) {
            this.value = lllllllllllllIIIllIlllIlIlIIIllI;
            this.nextEntry = lllllllllllllIIIllIlllIlIlIIIIII;
            this.key = lllllllllllllIIIllIlllIlIlIIIlll;
            this.hash = lllllllllllllIIIllIlllIlIlIIIIll;
        }
        
        private static boolean lllIIlIlllllIIl(final Object lllllllllllllIIIllIlllIlIIIIllll, final Object lllllllllllllIIIllIlllIlIIIIlllI) {
            return lllllllllllllIIIllIlllIlIIIIllll != lllllllllllllIIIllIlllIlIIIIlllI;
        }
        
        @Override
        public final String toString() {
            return String.valueOf(new StringBuilder(String.valueOf(this.getKey())).append(Entry.lIlIIlIlIIIIIl[Entry.lIlIIlIlIIIIlI[0]]).append(this.getValue()));
        }
        
        private static String lllIIlIllllIlIl(final String lllllllllllllIIIllIlllIlIIIlIlIl, final String lllllllllllllIIIllIlllIlIIIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIllIlllIlIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlllIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), Entry.lIlIIlIlIIIIlI[2]), "DES");
                final Cipher lllllllllllllIIIllIlllIlIIIllIIl = Cipher.getInstance("DES");
                lllllllllllllIIIllIlllIlIIIllIIl.init(Entry.lIlIIlIlIIIIlI[3], lllllllllllllIIIllIlllIlIIIllIlI);
                return new String(lllllllllllllIIIllIlllIlIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlllIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIlllIlIIIllIII) {
                lllllllllllllIIIllIlllIlIIIllIII.printStackTrace();
                return null;
            }
        }
        
        static {
            lllIIlIllllIlll();
            lllIIlIllllIllI();
        }
        
        @Override
        public final boolean equals(final Object lllllllllllllIIIllIlllIlIIlIlIlI) {
            if (lllIIlIlllllIII((lllllllllllllIIIllIlllIlIIlIlIlI instanceof Entry) ? 1 : 0)) {
                return Entry.lIlIIlIlIIIIlI[0] != 0;
            }
            final Entry<V> lllllllllllllIIIllIlllIlIIllIIII = (Entry<V>)lllllllllllllIIIllIlllIlIIlIlIlI;
            final Object lllllllllllllIIIllIlllIlIIlIllll = this.getKey();
            final Object lllllllllllllIIIllIlllIlIIlIlllI = lllllllllllllIIIllIlllIlIIllIIII.getKey();
            if (!lllIIlIlllllIIl(lllllllllllllIIIllIlllIlIIlIllll, lllllllllllllIIIllIlllIlIIlIlllI) || (lllIIlIlllllIlI(lllllllllllllIIIllIlllIlIIlIllll) && lllIIlIlllllIll(lllllllllllllIIIllIlllIlIIlIllll.equals(lllllllllllllIIIllIlllIlIIlIlllI) ? 1 : 0))) {
                final Object lllllllllllllIIIllIlllIlIIlIllIl = this.getValue();
                final Object lllllllllllllIIIllIlllIlIIlIllII = lllllllllllllIIIllIlllIlIIllIIII.getValue();
                if (!lllIIlIlllllIIl(lllllllllllllIIIllIlllIlIIlIllIl, lllllllllllllIIIllIlllIlIIlIllII) || (lllIIlIlllllIlI(lllllllllllllIIIllIlllIlIIlIllIl) && lllIIlIlllllIll(lllllllllllllIIIllIlllIlIIlIllIl.equals(lllllllllllllIIIllIlllIlIIlIllII) ? 1 : 0))) {
                    return Entry.lIlIIlIlIIIIlI[1] != 0;
                }
            }
            return Entry.lIlIIlIlIIIIlI[0] != 0;
        }
        
        private static void lllIIlIllllIlll() {
            (lIlIIlIlIIIIlI = new int[4])[0] = ((0xD ^ 0x8) & ~(0x87 ^ 0x82));
            Entry.lIlIIlIlIIIIlI[1] = " ".length();
            Entry.lIlIIlIlIIIIlI[2] = (0x7D ^ 0x75);
            Entry.lIlIIlIlIIIIlI[3] = "  ".length();
        }
        
        private static void lllIIlIllllIllI() {
            (lIlIIlIlIIIIIl = new String[Entry.lIlIIlIlIIIIlI[1]])[Entry.lIlIIlIlIIIIlI[0]] = lllIIlIllllIlIl("jRYXfr1/nxQ=", "ARhou");
        }
    }
}
