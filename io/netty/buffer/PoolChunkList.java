// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;

final class PoolChunkList<T>
{
    private final /* synthetic */ PoolChunkList<T> nextList;
    private static final /* synthetic */ String[] lIlIlllllIIlII;
    private final /* synthetic */ int maxUsage;
    private /* synthetic */ PoolChunk<T> head;
    /* synthetic */ PoolChunkList<T> prevList;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ int minUsage;
    private static final /* synthetic */ int[] lIllIIIlIlIIlI;
    private final /* synthetic */ PoolArena<T> arena;
    
    private static boolean llllIlllllllllI(final Object lllllllllllllIIIIIllIIlIIlIlllll) {
        return lllllllllllllIIIIIllIIlIIlIlllll == null;
    }
    
    private static void llllIlIlIIIIlII() {
        (lIlIlllllIIlII = new String[PoolChunkList.lIllIIIlIlIIlI[1]])[PoolChunkList.lIllIIIlIlIIlI[0]] = llllIlIlIIIIIll("gmM8aic2czI=", "DLLrb");
    }
    
    private static boolean lllllIIIIIIIIII(final int lllllllllllllIIIIIllIIlIIllIllII, final int lllllllllllllIIIIIllIIlIIllIlIll) {
        return lllllllllllllIIIIIllIIlIIllIllII >= lllllllllllllIIIIIllIIlIIllIlIll;
    }
    
    private static boolean lllllIIIIIIIIll(final int lllllllllllllIIIIIllIIlIIlIlllIl) {
        return lllllllllllllIIIIIllIIlIIlIlllIl != 0;
    }
    
    private static boolean lllllIIIIIIIlIl(final Object lllllllllllllIIIIIllIIlIIllIIIIl) {
        return lllllllllllllIIIIIllIIlIIllIIIIl != null;
    }
    
    static {
        llllIllllllllII();
        llllIlIlIIIIlII();
        int $assertionsDisabled2;
        if (lllllIIIIIIIIlI(PoolChunkList.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PoolChunkList.lIllIIIlIlIIlI[1];
            "".length();
            if (((0x6 ^ 0x24) & ~(0x23 ^ 0x1)) != 0x0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PoolChunkList.lIllIIIlIlIIlI[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    void add(final PoolChunk<T> lllllllllllllIIIIIllIIlIlIIIlllI) {
        if (lllllIIIIIIIIII(lllllllllllllIIIIIllIIlIlIIIlllI.usage(), this.maxUsage)) {
            this.nextList.add(lllllllllllllIIIIIllIIlIlIIIlllI);
            return;
        }
        lllllllllllllIIIIIllIIlIlIIIlllI.parent = this;
        if (llllIlllllllllI(this.head)) {
            this.head = lllllllllllllIIIIIllIIlIlIIIlllI;
            lllllllllllllIIIIIllIIlIlIIIlllI.prev = null;
            lllllllllllllIIIIIllIIlIlIIIlllI.next = null;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIllIIlIlIIIlllI.prev = null;
            lllllllllllllIIIIIllIIlIlIIIlllI.next = this.head;
            this.head.prev = lllllllllllllIIIIIllIIlIlIIIlllI;
            this.head = lllllllllllllIIIIIllIIlIlIIIlllI;
        }
    }
    
    PoolChunkList(final PoolArena<T> lllllllllllllIIIIIllIIlIlIllIIlI, final PoolChunkList<T> lllllllllllllIIIIIllIIlIlIllIllI, final int lllllllllllllIIIIIllIIlIlIllIlIl, final int lllllllllllllIIIIIllIIlIlIlIllll) {
        this.arena = lllllllllllllIIIIIllIIlIlIllIIlI;
        this.nextList = lllllllllllllIIIIIllIIlIlIllIllI;
        this.minUsage = lllllllllllllIIIIIllIIlIlIllIlIl;
        this.maxUsage = lllllllllllllIIIIIllIIlIlIlIllll;
    }
    
    void free(final PoolChunk<T> lllllllllllllIIIIIllIIlIlIIlIlIl, final long lllllllllllllIIIIIllIIlIlIIlIlll) {
        lllllllllllllIIIIIllIIlIlIIlIlIl.free(lllllllllllllIIIIIllIIlIlIIlIlll);
        if (lllllIIIIIIIIIl(lllllllllllllIIIIIllIIlIlIIlIlIl.usage(), this.minUsage)) {
            this.remove(lllllllllllllIIIIIllIIlIlIIlIlIl);
            if (llllIlllllllllI(this.prevList)) {
                if (lllllIIIIIIIIlI(PoolChunkList.$assertionsDisabled ? 1 : 0) && lllllIIIIIIIIll(lllllllllllllIIIIIllIIlIlIIlIlIl.usage())) {
                    throw new AssertionError();
                }
                this.arena.destroyChunk(lllllllllllllIIIIIllIIlIlIIlIlIl);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.prevList.add(lllllllllllllIIIIIllIIlIlIIlIlIl);
            }
        }
    }
    
    private static int llllIllllllllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void remove(final PoolChunk<T> lllllllllllllIIIIIllIIlIlIIIlIII) {
        if (lllllIIIIIIIlII(lllllllllllllIIIIIllIIlIlIIIlIII, this.head)) {
            this.head = lllllllllllllIIIIIllIIlIlIIIlIII.next;
            if (lllllIIIIIIIlIl(this.head)) {
                this.head.prev = null;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
        }
        else {
            final PoolChunk<T> lllllllllllllIIIIIllIIlIlIIIlIlI = lllllllllllllIIIIIllIIlIlIIIlIII.next;
            lllllllllllllIIIIIllIIlIlIIIlIII.prev.next = lllllllllllllIIIIIllIIlIlIIIlIlI;
            if (lllllIIIIIIIlIl(lllllllllllllIIIIIllIIlIlIIIlIlI)) {
                lllllllllllllIIIIIllIIlIlIIIlIlI.prev = lllllllllllllIIIIIllIIlIlIIIlIII.prev;
            }
        }
    }
    
    @Override
    public String toString() {
        if (llllIlllllllllI(this.head)) {
            return PoolChunkList.lIlIlllllIIlII[PoolChunkList.lIllIIIlIlIIlI[0]];
        }
        final StringBuilder lllllllllllllIIIIIllIIlIIlllllll = new StringBuilder();
        PoolChunk<T> lllllllllllllIIIIIllIIlIlIIIIIIl = this.head;
        do {
            lllllllllllllIIIIIllIIlIIlllllll.append(lllllllllllllIIIIIllIIlIlIIIIIIl);
            "".length();
            lllllllllllllIIIIIllIIlIlIIIIIIl = lllllllllllllIIIIIllIIlIlIIIIIIl.next;
            if (llllIlllllllllI(lllllllllllllIIIIIllIIlIlIIIIIIl)) {
                "".length();
                if ("   ".length() <= ((0x2B ^ 0x75 ^ (0xC ^ 0x0)) & (39 + 64 + 9 + 32 ^ 173 + 136 - 247 + 132 ^ -" ".length()))) {
                    return null;
                }
                return String.valueOf(lllllllllllllIIIIIllIIlIIlllllll);
            }
            else {
                lllllllllllllIIIIIllIIlIIlllllll.append(StringUtil.NEWLINE);
                "".length();
                "".length();
            }
        } while ("  ".length() >= 0);
        return null;
    }
    
    private static String llllIlIlIIIIIll(final String lllllllllllllIIIIIllIIlIIlllIlII, final String lllllllllllllIIIIIllIIlIIlllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIlIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIlIIlllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIlIIlllIllI.init(PoolChunkList.lIllIIIlIlIIlI[2], lllllllllllllIIIIIllIIlIIlllIlll);
            return new String(lllllllllllllIIIIIllIIlIIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIlIIlllIlIl) {
            lllllllllllllIIIIIllIIlIIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIIIIIIIlII(final Object lllllllllllllIIIIIllIIlIIllIIlII, final Object lllllllllllllIIIIIllIIlIIllIIIll) {
        return lllllllllllllIIIIIllIIlIIllIIlII == lllllllllllllIIIIIllIIlIIllIIIll;
    }
    
    private static boolean lllllIIIIIIIIIl(final int lllllllllllllIIIIIllIIlIIllIlIII, final int lllllllllllllIIIIIllIIlIIllIIlll) {
        return lllllllllllllIIIIIllIIlIIllIlIII < lllllllllllllIIIIIllIIlIIllIIlll;
    }
    
    private static boolean lllllIIIIIIIIlI(final int lllllllllllllIIIIIllIIlIIlIllIll) {
        return lllllllllllllIIIIIllIIlIIlIllIll == 0;
    }
    
    boolean allocate(final PooledByteBuf<T> lllllllllllllIIIIIllIIlIlIlIIlIl, final int lllllllllllllIIIIIllIIlIlIlIIlII, final int lllllllllllllIIIIIllIIlIlIlIIIll) {
        if (llllIlllllllllI(this.head)) {
            return PoolChunkList.lIllIIIlIlIIlI[0] != 0;
        }
        PoolChunk<T> lllllllllllllIIIIIllIIlIlIlIIlll = this.head;
        do {
            final long lllllllllllllIIIIIllIIlIlIlIlIII = lllllllllllllIIIIIllIIlIlIlIIlll.allocate(lllllllllllllIIIIIllIIlIlIlIIIll);
            if (!llllIllllllllll(llllIllllllllIl(lllllllllllllIIIIIllIIlIlIlIlIII, 0L))) {
                lllllllllllllIIIIIllIIlIlIlIIlll.initBuf(lllllllllllllIIIIIllIIlIlIlIIlIl, lllllllllllllIIIIIllIIlIlIlIlIII, lllllllllllllIIIIIllIIlIlIlIIlII);
                if (lllllIIIIIIIIII(lllllllllllllIIIIIllIIlIlIlIIlll.usage(), this.maxUsage)) {
                    this.remove(lllllllllllllIIIIIllIIlIlIlIIlll);
                    this.nextList.add(lllllllllllllIIIIIllIIlIlIlIIlll);
                }
                return PoolChunkList.lIllIIIlIlIIlI[1] != 0;
            }
            lllllllllllllIIIIIllIIlIlIlIIlll = lllllllllllllIIIIIllIIlIlIlIIlll.next;
            if (llllIlllllllllI(lllllllllllllIIIIIllIIlIlIlIIlll)) {
                return PoolChunkList.lIllIIIlIlIIlI[0] != 0;
            }
            "".length();
        } while ("  ".length() >= 0);
        return ((153 + 76 - 84 + 43 ^ 31 + 123 - 125 + 110) & (54 + 63 - 49 + 81 ^ 37 + 15 + 45 + 65 ^ -" ".length())) != 0x0;
    }
    
    private static boolean llllIllllllllll(final int lllllllllllllIIIIIllIIlIIlIllIIl) {
        return lllllllllllllIIIIIllIIlIIlIllIIl < 0;
    }
    
    private static void llllIllllllllII() {
        (lIllIIIlIlIIlI = new int[3])[0] = ((0xBD ^ 0xA4) & ~(0xB ^ 0x12));
        PoolChunkList.lIllIIIlIlIIlI[1] = " ".length();
        PoolChunkList.lIllIIIlIlIIlI[2] = "  ".length();
    }
}
