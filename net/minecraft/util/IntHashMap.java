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

public class IntHashMap<V>
{
    private transient /* synthetic */ Entry<V>[] slots;
    private static final /* synthetic */ int[] llIIllIIIIIlIl;
    private transient /* synthetic */ int count;
    private /* synthetic */ int threshold;
    
    private void insert(final int llllllllllllIlllIIIIlIlIIlIllIIl, final int llllllllllllIlllIIIIlIlIIlIllIII, final V llllllllllllIlllIIIIlIlIIlIlIlll, final int llllllllllllIlllIIIIlIlIIlIlllII) {
        final Entry<V> llllllllllllIlllIIIIlIlIIlIllIll = this.slots[llllllllllllIlllIIIIlIlIIlIlllII];
        this.slots[llllllllllllIlllIIIIlIlIIlIlllII] = new Entry<V>(llllllllllllIlllIIIIlIlIIlIllIIl, llllllllllllIlllIIIIlIlIIlIllIII, llllllllllllIlllIIIIlIlIIlIlIlll, llllllllllllIlllIIIIlIlIIlIllIll);
        final int count = this.count;
        this.count = count + IntHashMap.llIIllIIIIIlIl[5];
        if (lIIIlllIIlIIllII(count, this.threshold)) {
            this.grow(IntHashMap.llIIllIIIIIlIl[9] * this.slots.length);
        }
    }
    
    private void grow(final int llllllllllllIlllIIIIlIlIlIlIlIIl) {
        final Entry[] llllllllllllIlllIIIIlIlIlIlIllIl = this.slots;
        final int llllllllllllIlllIIIIlIlIlIlIllII = llllllllllllIlllIIIIlIlIlIlIllIl.length;
        if (lIIIlllIIlIIlIIl(llllllllllllIlllIIIIlIlIlIlIllII, IntHashMap.llIIllIIIIIlIl[7])) {
            this.threshold = IntHashMap.llIIllIIIIIlIl[8];
            "".length();
            if (-(0x49 ^ 0x4D) > 0) {
                return;
            }
        }
        else {
            final Entry[] llllllllllllIlllIIIIlIlIlIlIlIll = new Entry[llllllllllllIlllIIIIlIlIlIlIlIIl];
            this.copyTo(llllllllllllIlllIIIIlIlIlIlIlIll);
            this.slots = (Entry<V>[])llllllllllllIlllIIIIlIlIlIlIlIll;
            this.threshold = (int)(llllllllllllIlllIIIIlIlIlIlIlIIl * 0.75f);
        }
    }
    
    private void copyTo(final Entry<V>[] llllllllllllIlllIIIIlIlIlIIlIlII) {
        final Entry[] llllllllllllIlllIIIIlIlIlIIllIll = this.slots;
        final int llllllllllllIlllIIIIlIlIlIIllIlI = llllllllllllIlllIIIIlIlIlIIlIlII.length;
        int llllllllllllIlllIIIIlIlIlIIllIIl = IntHashMap.llIIllIIIIIlIl[6];
        "".length();
        if (-" ".length() == ((0x7C ^ 0x59) & ~(0x5C ^ 0x79))) {
            return;
        }
        while (!lIIIlllIIlIIllII(llllllllllllIlllIIIIlIlIlIIllIIl, llllllllllllIlllIIIIlIlIlIIllIll.length)) {
            Entry<V> llllllllllllIlllIIIIlIlIlIIllIII = (Entry<V>)llllllllllllIlllIIIIlIlIlIIllIll[llllllllllllIlllIIIIlIlIlIIllIIl];
            if (lIIIlllIIlIIlIll(llllllllllllIlllIIIIlIlIlIIllIII)) {
                llllllllllllIlllIIIIlIlIlIIllIll[llllllllllllIlllIIIIlIlIlIIllIIl] = null;
                Entry<V> llllllllllllIlllIIIIlIlIlIIlIlll;
                do {
                    llllllllllllIlllIIIIlIlIlIIlIlll = llllllllllllIlllIIIIlIlIlIIllIII.nextEntry;
                    final int llllllllllllIlllIIIIlIlIlIIlIllI = getSlotIndex(llllllllllllIlllIIIIlIlIlIIllIII.slotHash, llllllllllllIlllIIIIlIlIlIIllIlI);
                    llllllllllllIlllIIIIlIlIlIIllIII.nextEntry = llllllllllllIlllIIIIlIlIlIIlIlII[llllllllllllIlllIIIIlIlIlIIlIllI];
                    llllllllllllIlllIIIIlIlIlIIlIlII[llllllllllllIlllIIIIlIlIlIIlIllI] = llllllllllllIlllIIIIlIlIlIIllIII;
                    llllllllllllIlllIIIIlIlIlIIllIII = llllllllllllIlllIIIIlIlIlIIlIlll;
                } while (!lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIlIIlIlll));
            }
            ++llllllllllllIlllIIIIlIlIlIIllIIl;
        }
    }
    
    private static int getSlotIndex(final int llllllllllllIlllIIIIlIlIlllIlIII, final int llllllllllllIlllIIIIlIlIlllIIlll) {
        return llllllllllllIlllIIIIlIlIlllIlIII & llllllllllllIlllIIIIlIlIlllIIlll - IntHashMap.llIIllIIIIIlIl[5];
    }
    
    private static boolean lIIIlllIIlIIlIlI(final Object llllllllllllIlllIIIIlIlIIlIIIIll) {
        return llllllllllllIlllIIIIlIlIIlIIIIll == null;
    }
    
    private static boolean lIIIlllIIlIIllII(final int llllllllllllIlllIIIIlIlIIlIIllII, final int llllllllllllIlllIIIIlIlIIlIIlIll) {
        return llllllllllllIlllIIIIlIlIIlIIllII >= llllllllllllIlllIIIIlIlIIlIIlIll;
    }
    
    private static boolean lIIIlllIIlIIlIIl(final int llllllllllllIlllIIIIlIlIIlIlIIII, final int llllllllllllIlllIIIIlIlIIlIIllll) {
        return llllllllllllIlllIIIIlIlIIlIlIIII == llllllllllllIlllIIIIlIlIIlIIllll;
    }
    
    public V removeObject(final int llllllllllllIlllIIIIlIlIlIIIlIIl) {
        final Entry<V> llllllllllllIlllIIIIlIlIlIIIlIII = this.removeEntry(llllllllllllIlllIIIIlIlIlIIIlIIl);
        V valueEntry;
        if (lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIlIIIlIII)) {
            valueEntry = null;
            "".length();
            if (((0x3B ^ 0x3E ^ (0xD8 ^ 0xC6)) & (0x8 ^ 0x3C ^ (0x54 ^ 0x7B) ^ -" ".length())) == (0x57 ^ 0x2A ^ (0x18 ^ 0x61))) {
                return null;
            }
        }
        else {
            valueEntry = llllllllllllIlllIIIIlIlIlIIIlIII.valueEntry;
        }
        return valueEntry;
    }
    
    public void addKey(final int llllllllllllIlllIIIIlIlIlIllllll, final V llllllllllllIlllIIIIlIlIlIlllllI) {
        final int llllllllllllIlllIIIIlIlIlIllllIl = computeHash(llllllllllllIlllIIIIlIlIlIllllll);
        final int llllllllllllIlllIIIIlIlIlIllllII = getSlotIndex(llllllllllllIlllIIIIlIlIlIllllIl, this.slots.length);
        Entry<V> llllllllllllIlllIIIIlIlIlIlllIll = this.slots[llllllllllllIlllIIIIlIlIlIllllII];
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIlIlllIll)) {
            if (lIIIlllIIlIIlIIl(llllllllllllIlllIIIIlIlIlIlllIll.hashEntry, llllllllllllIlllIIIIlIlIlIllllll)) {
                llllllllllllIlllIIIIlIlIlIlllIll.valueEntry = llllllllllllIlllIIIIlIlIlIlllllI;
                return;
            }
            llllllllllllIlllIIIIlIlIlIlllIll = llllllllllllIlllIIIIlIlIlIlllIll.nextEntry;
        }
        this.insert(llllllllllllIlllIIIIlIlIlIllllIl, llllllllllllIlllIIIIlIlIlIllllll, llllllllllllIlllIIIIlIlIlIlllllI, llllllllllllIlllIIIIlIlIlIllllII);
    }
    
    public IntHashMap() {
        this.slots = (Entry<V>[])new Entry[IntHashMap.llIIllIIIIIlIl[0]];
        this.threshold = IntHashMap.llIIllIIIIIlIl[1];
    }
    
    private static boolean lIIIlllIIlIIlIll(final Object llllllllllllIlllIIIIlIlIIlIIlIIl) {
        return llllllllllllIlllIIIIlIlIIlIIlIIl != null;
    }
    
    public boolean containsItem(final int llllllllllllIlllIIIIlIlIllIlIlIl) {
        if (lIIIlllIIlIIlIll(this.lookupEntry(llllllllllllIlllIIIIlIlIllIlIlIl))) {
            return IntHashMap.llIIllIIIIIlIl[5] != 0;
        }
        return IntHashMap.llIIllIIIIIlIl[6] != 0;
    }
    
    private static int computeHash(int llllllllllllIlllIIIIlIlIlllIlIll) {
        llllllllllllIlllIIIIlIlIlllIlIll = (llllllllllllIlllIIIIlIlIlllIlIll ^ llllllllllllIlllIIIIlIlIlllIlIll >>> IntHashMap.llIIllIIIIIlIl[2] ^ llllllllllllIlllIIIIlIlIlllIlIll >>> IntHashMap.llIIllIIIIIlIl[1]);
        return llllllllllllIlllIIIIlIlIlllIlIll ^ llllllllllllIlllIIIIlIlIlllIlIll >>> IntHashMap.llIIllIIIIIlIl[3] ^ llllllllllllIlllIIIIlIlIlllIlIll >>> IntHashMap.llIIllIIIIIlIl[4];
    }
    
    public void clearMap() {
        final Entry[] llllllllllllIlllIIIIlIlIIllIlIll = this.slots;
        int llllllllllllIlllIIIIlIlIIllIlIlI = IntHashMap.llIIllIIIIIlIl[6];
        "".length();
        if (-" ".length() == (0x39 ^ 0x3D)) {
            return;
        }
        while (!lIIIlllIIlIIllII(llllllllllllIlllIIIIlIlIIllIlIlI, llllllllllllIlllIIIIlIlIIllIlIll.length)) {
            llllllllllllIlllIIIIlIlIIllIlIll[llllllllllllIlllIIIIlIlIIllIlIlI] = null;
            ++llllllllllllIlllIIIIlIlIIllIlIlI;
        }
        this.count = IntHashMap.llIIllIIIIIlIl[6];
    }
    
    private static boolean lIIIlllIIlIIllIl(final Object llllllllllllIlllIIIIlIlIIlIIIllI, final Object llllllllllllIlllIIIIlIlIIlIIIlIl) {
        return llllllllllllIlllIIIIlIlIIlIIIllI == llllllllllllIlllIIIIlIlIIlIIIlIl;
    }
    
    static {
        lIIIlllIIlIIlIII();
    }
    
    private static void lIIIlllIIlIIlIII() {
        (llIIllIIIIIlIl = new int[10])[0] = (0x94 ^ 0x84);
        IntHashMap.llIIllIIIIIlIl[1] = (0xAE ^ 0x92 ^ (0x45 ^ 0x75));
        IntHashMap.llIIllIIIIIlIl[2] = (0x4B ^ 0x2E ^ (0xD2 ^ 0xA3));
        IntHashMap.llIIllIIIIIlIl[3] = (0x46 ^ 0x5F ^ (0xBC ^ 0xA2));
        IntHashMap.llIIllIIIIIlIl[4] = (0x49 ^ 0x4D);
        IntHashMap.llIIllIIIIIlIl[5] = " ".length();
        IntHashMap.llIIllIIIIIlIl[6] = ((79 + 100 - 62 + 54 ^ 94 + 87 - 84 + 58) & (78 + 146 - 187 + 143 ^ 4 + 88 - 81 + 121 ^ -" ".length()));
        IntHashMap.llIIllIIIIIlIl[7] = (-(0xFFFFCEFF & 0x3D97) & (0xFFFF8D97 & 0x40007EFE));
        IntHashMap.llIIllIIIIIlIl[8] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        IntHashMap.llIIllIIIIIlIl[9] = "  ".length();
    }
    
    final Entry<V> removeEntry(final int llllllllllllIlllIIIIlIlIIlllllII) {
        final int llllllllllllIlllIIIIlIlIIllllIll = computeHash(llllllllllllIlllIIIIlIlIIlllllII);
        final int llllllllllllIlllIIIIlIlIIllllIlI = getSlotIndex(llllllllllllIlllIIIIlIlIIllllIll, this.slots.length);
        Entry<V> llllllllllllIlllIIIIlIlIIllllIII;
        Entry<V> llllllllllllIlllIIIIlIlIIllllIIl = llllllllllllIlllIIIIlIlIIllllIII = this.slots[llllllllllllIlllIIIIlIlIIllllIlI];
        "".length();
        if (-"  ".length() >= 0) {
            return null;
        }
        while (!lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIIllllIII)) {
            final Entry<V> llllllllllllIlllIIIIlIlIIlllIlll = llllllllllllIlllIIIIlIlIIllllIII.nextEntry;
            if (lIIIlllIIlIIlIIl(llllllllllllIlllIIIIlIlIIllllIII.hashEntry, llllllllllllIlllIIIIlIlIIlllllII)) {
                this.count -= IntHashMap.llIIllIIIIIlIl[5];
                if (lIIIlllIIlIIllIl(llllllllllllIlllIIIIlIlIIllllIIl, llllllllllllIlllIIIIlIlIIllllIII)) {
                    this.slots[llllllllllllIlllIIIIlIlIIllllIlI] = llllllllllllIlllIIIIlIlIIlllIlll;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlllIIIIlIlIIllllIIl.nextEntry = llllllllllllIlllIIIIlIlIIlllIlll;
                }
                return llllllllllllIlllIIIIlIlIIllllIII;
            }
            llllllllllllIlllIIIIlIlIIllllIIl = llllllllllllIlllIIIIlIlIIllllIII;
            llllllllllllIlllIIIIlIlIIllllIII = llllllllllllIlllIIIIlIlIIlllIlll;
        }
        return llllllllllllIlllIIIIlIlIIllllIII;
    }
    
    public V lookup(final int llllllllllllIlllIIIIlIlIllIlllll) {
        final int llllllllllllIlllIIIIlIlIllIllllI = computeHash(llllllllllllIlllIIIIlIlIllIlllll);
        Entry<V> llllllllllllIlllIIIIlIlIllIlllIl = this.slots[getSlotIndex(llllllllllllIlllIIIIlIlIllIllllI, this.slots.length)];
        "".length();
        if ("   ".length() == 0) {
            return null;
        }
        while (!lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIllIlllIl)) {
            if (lIIIlllIIlIIlIIl(llllllllllllIlllIIIIlIlIllIlllIl.hashEntry, llllllllllllIlllIIIIlIlIllIlllll)) {
                return llllllllllllIlllIIIIlIlIllIlllIl.valueEntry;
            }
            llllllllllllIlllIIIIlIlIllIlllIl = llllllllllllIlllIIIIlIlIllIlllIl.nextEntry;
        }
        return null;
    }
    
    final Entry<V> lookupEntry(final int llllllllllllIlllIIIIlIlIllIIlIIl) {
        final int llllllllllllIlllIIIIlIlIllIIllII = computeHash(llllllllllllIlllIIIIlIlIllIIlIIl);
        Entry<V> llllllllllllIlllIIIIlIlIllIIlIll = this.slots[getSlotIndex(llllllllllllIlllIIIIlIlIllIIllII, this.slots.length)];
        "".length();
        if (-"  ".length() >= 0) {
            return null;
        }
        while (!lIIIlllIIlIIlIlI(llllllllllllIlllIIIIlIlIllIIlIll)) {
            if (lIIIlllIIlIIlIIl(llllllllllllIlllIIIIlIlIllIIlIll.hashEntry, llllllllllllIlllIIIIlIlIllIIlIIl)) {
                return llllllllllllIlllIIIIlIlIllIIlIll;
            }
            llllllllllllIlllIIIIlIlIllIIlIll = llllllllllllIlllIIIIlIlIllIIlIll.nextEntry;
        }
        return null;
    }
    
    static class Entry<V>
    {
        /* synthetic */ Entry<V> nextEntry;
        final /* synthetic */ int hashEntry;
        private static final /* synthetic */ int[] lIIlllllIIIIlI;
        /* synthetic */ V valueEntry;
        private static final /* synthetic */ String[] lIIllllIlllllI;
        final /* synthetic */ int slotHash;
        
        Entry(final int lllllllllllllIIlIIlIIlIllllIIIII, final int lllllllllllllIIlIIlIIlIlllIlllll, final V lllllllllllllIIlIIlIIlIlllIllllI, final Entry<V> lllllllllllllIIlIIlIIlIlllIlllIl) {
            this.valueEntry = lllllllllllllIIlIIlIIlIlllIllllI;
            this.nextEntry = lllllllllllllIIlIIlIIlIlllIlllIl;
            this.hashEntry = lllllllllllllIIlIIlIIlIlllIlllll;
            this.slotHash = lllllllllllllIIlIIlIIlIllllIIIII;
        }
        
        private static boolean llIllllIIllIIIl(final Object lllllllllllllIIlIIlIIlIllIlIllII, final Object lllllllllllllIIlIIlIIlIllIlIlIll) {
            return lllllllllllllIIlIIlIIlIllIlIllII != lllllllllllllIIlIIlIIlIllIlIlIll;
        }
        
        public final int getHash() {
            return this.hashEntry;
        }
        
        private static boolean llIllllIIllIIll(final int lllllllllllllIIlIIlIIlIllIlIIlll) {
            return lllllllllllllIIlIIlIIlIllIlIIlll != 0;
        }
        
        private static boolean llIllllIIllIIII(final int lllllllllllllIIlIIlIIlIllIlIIlIl) {
            return lllllllllllllIIlIIlIIlIllIlIIlIl == 0;
        }
        
        private static void llIllllIIlIllll() {
            (lIIlllllIIIIlI = new int[3])[0] = ((0x1 ^ 0x48) & ~(0xCC ^ 0x85));
            Entry.lIIlllllIIIIlI[1] = " ".length();
            Entry.lIIlllllIIIIlI[2] = "  ".length();
        }
        
        @Override
        public final int hashCode() {
            return computeHash(this.hashEntry);
        }
        
        @Override
        public final String toString() {
            return String.valueOf(new StringBuilder(String.valueOf(this.getHash())).append(Entry.lIIllllIlllllI[Entry.lIIlllllIIIIlI[0]]).append(this.getValue()));
        }
        
        public final V getValue() {
            return this.valueEntry;
        }
        
        private static void llIllllIIlIllII() {
            (lIIllllIlllllI = new String[Entry.lIIlllllIIIIlI[1]])[Entry.lIIlllllIIIIlI[0]] = llIllllIIlIlIIl("8gPDmDpzGPU=", "TXcFA");
        }
        
        private static String llIllllIIlIlIIl(final String lllllllllllllIIlIIlIIlIllIllIlII, final String lllllllllllllIIlIIlIIlIllIllIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlIIlIllIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIIlIllIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIlIIlIllIllIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIlIIlIllIllIllI.init(Entry.lIIlllllIIIIlI[2], lllllllllllllIIlIIlIIlIllIllIlll);
                return new String(lllllllllllllIIlIIlIIlIllIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIIlIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlIIlIllIllIlIl) {
                lllllllllllllIIlIIlIIlIllIllIlIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIllllIIllIIlI(final Object lllllllllllllIIlIIlIIlIllIlIlIIl) {
            return lllllllllllllIIlIIlIIlIllIlIlIIl != null;
        }
        
        @Override
        public final boolean equals(final Object lllllllllllllIIlIIlIIlIlllIIlllI) {
            if (llIllllIIllIIII((lllllllllllllIIlIIlIIlIlllIIlllI instanceof Entry) ? 1 : 0)) {
                return Entry.lIIlllllIIIIlI[0] != 0;
            }
            final Entry<V> lllllllllllllIIlIIlIIlIlllIIllIl = (Entry<V>)lllllllllllllIIlIIlIIlIlllIIlllI;
            final Object lllllllllllllIIlIIlIIlIlllIIllII = this.getHash();
            final Object lllllllllllllIIlIIlIIlIlllIIlIll = lllllllllllllIIlIIlIIlIlllIIllIl.getHash();
            if (!llIllllIIllIIIl(lllllllllllllIIlIIlIIlIlllIIllII, lllllllllllllIIlIIlIIlIlllIIlIll) || (llIllllIIllIIlI(lllllllllllllIIlIIlIIlIlllIIllII) && llIllllIIllIIll(lllllllllllllIIlIIlIIlIlllIIllII.equals(lllllllllllllIIlIIlIIlIlllIIlIll) ? 1 : 0))) {
                final Object lllllllllllllIIlIIlIIlIlllIIlIlI = this.getValue();
                final Object lllllllllllllIIlIIlIIlIlllIIlIIl = lllllllllllllIIlIIlIIlIlllIIllIl.getValue();
                if (!llIllllIIllIIIl(lllllllllllllIIlIIlIIlIlllIIlIlI, lllllllllllllIIlIIlIIlIlllIIlIIl) || (llIllllIIllIIlI(lllllllllllllIIlIIlIIlIlllIIlIlI) && llIllllIIllIIll(lllllllllllllIIlIIlIIlIlllIIlIlI.equals(lllllllllllllIIlIIlIIlIlllIIlIIl) ? 1 : 0))) {
                    return Entry.lIIlllllIIIIlI[1] != 0;
                }
            }
            return Entry.lIIlllllIIIIlI[0] != 0;
        }
        
        static {
            llIllllIIlIllll();
            llIllllIIlIllII();
        }
    }
}
