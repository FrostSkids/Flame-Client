// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;

public class NextTickListEntry implements Comparable<NextTickListEntry>
{
    private final /* synthetic */ Block block;
    private /* synthetic */ long tickEntryID;
    private static final /* synthetic */ String[] lIIlIllIIlIllI;
    private static /* synthetic */ long nextTickEntryID;
    private static final /* synthetic */ int[] lIIlIllIIlIlll;
    public /* synthetic */ long scheduledTime;
    public final /* synthetic */ BlockPos position;
    public /* synthetic */ int priority;
    
    private static boolean llIlIIlIIIIlIll(final int lllllllllllllIIllIIlIlIIIIIlIlll) {
        return lllllllllllllIIllIIlIlIIIIIlIlll < 0;
    }
    
    private static String llIlIIlIIIIIlII(final String lllllllllllllIIllIIlIlIIIIlIIlII, final String lllllllllllllIIllIIlIlIIIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIlIIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIlIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIlIIIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIlIIIIlIlIII.init(NextTickListEntry.lIIlIllIIlIlll[3], lllllllllllllIIllIIlIlIIIIlIlIIl);
            return new String(lllllllllllllIIllIIlIlIIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIlIIIIlIIlll) {
            lllllllllllllIIllIIlIlIIIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    public Block getBlock() {
        return this.block;
    }
    
    private static boolean llIlIIlIIIIllII(final int lllllllllllllIIllIIlIlIIIIIlIlIl) {
        return lllllllllllllIIllIIlIlIIIIIlIlIl > 0;
    }
    
    public void setPriority(final int lllllllllllllIIllIIlIlIIIlIlIllI) {
        this.priority = lllllllllllllIIllIIlIlIIIlIlIllI;
    }
    
    private static boolean llIlIIlIIIIlIIl(final int lllllllllllllIIllIIlIlIIIIIllIll) {
        return lllllllllllllIIllIIlIlIIIIIllIll != 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(Block.getIdFromBlock(this.block))).append(NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[0]]).append(this.position).append(NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[1]]).append(this.scheduledTime).append(NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[3]]).append(this.priority).append(NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[4]]).append(this.tickEntryID));
    }
    
    public NextTickListEntry(final BlockPos lllllllllllllIIllIIlIlIIIlllIIlI, final Block lllllllllllllIIllIIlIlIIIlllIIIl) {
        this.tickEntryID = NextTickListEntry.nextTickEntryID++;
        this.position = lllllllllllllIIllIIlIlIIIlllIIlI;
        this.block = lllllllllllllIIllIIlIlIIIlllIIIl;
    }
    
    private static String llIlIIlIIIIIlIl(String lllllllllllllIIllIIlIlIIIIllIllI, final String lllllllllllllIIllIIlIlIIIIlllIlI) {
        lllllllllllllIIllIIlIlIIIIllIllI = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIIIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIlIIIIlllIIl = new StringBuilder();
        final char[] lllllllllllllIIllIIlIlIIIIlllIII = lllllllllllllIIllIIlIlIIIIlllIlI.toCharArray();
        int lllllllllllllIIllIIlIlIIIIllIlll = NextTickListEntry.lIIlIllIIlIlll[0];
        final boolean lllllllllllllIIllIIlIlIIIIllIIIl = (Object)lllllllllllllIIllIIlIlIIIIllIllI.toCharArray();
        final float lllllllllllllIIllIIlIlIIIIllIIII = lllllllllllllIIllIIlIlIIIIllIIIl.length;
        long lllllllllllllIIllIIlIlIIIIlIllll = NextTickListEntry.lIIlIllIIlIlll[0];
        while (llIlIIlIIIIlllI((int)lllllllllllllIIllIIlIlIIIIlIllll, (int)lllllllllllllIIllIIlIlIIIIllIIII)) {
            final char lllllllllllllIIllIIlIlIIIIllllII = lllllllllllllIIllIIlIlIIIIllIIIl[lllllllllllllIIllIIlIlIIIIlIllll];
            lllllllllllllIIllIIlIlIIIIlllIIl.append((char)(lllllllllllllIIllIIlIlIIIIllllII ^ lllllllllllllIIllIIlIlIIIIlllIII[lllllllllllllIIllIIlIlIIIIllIlll % lllllllllllllIIllIIlIlIIIIlllIII.length]));
            "".length();
            ++lllllllllllllIIllIIlIlIIIIllIlll;
            ++lllllllllllllIIllIIlIlIIIIlIllll;
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIlIIIIlllIIl);
    }
    
    private static boolean llIlIIlIIIIllIl(final int lllllllllllllIIllIIlIlIIIIIlIIlI, final int lllllllllllllIIllIIlIlIIIIIlIIIl) {
        return lllllllllllllIIllIIlIlIIIIIlIIlI != lllllllllllllIIllIIlIlIIIIIlIIIl;
    }
    
    @Override
    public int compareTo(final NextTickListEntry lllllllllllllIIllIIlIlIIIlIlIIII) {
        int n;
        if (llIlIIlIIIIlIll(llIlIIlIIIIlIlI(this.scheduledTime, lllllllllllllIIllIIlIlIIIlIlIIII.scheduledTime))) {
            n = NextTickListEntry.lIIlIllIIlIlll[2];
            "".length();
            if (null != null) {
                return (0x76 ^ 0x57) & ~(0xBB ^ 0x9A);
            }
        }
        else if (llIlIIlIIIIllII(llIlIIlIIIIlIlI(this.scheduledTime, lllllllllllllIIllIIlIlIIIlIlIIII.scheduledTime))) {
            n = NextTickListEntry.lIIlIllIIlIlll[1];
            "".length();
            if (" ".length() == 0) {
                return (78 + 36 - 95 + 164 ^ 100 + 8 + 16 + 49) & (0xF9 ^ 0xA8 ^ (0x39 ^ 0x72) ^ -" ".length());
            }
        }
        else if (llIlIIlIIIIllIl(this.priority, lllllllllllllIIllIIlIlIIIlIlIIII.priority)) {
            n = this.priority - lllllllllllllIIllIIlIlIIIlIlIIII.priority;
            "".length();
            if ((0x4C ^ 0x48) <= 0) {
                return (0x2 ^ 0x60) & ~(0xF1 ^ 0x93);
            }
        }
        else if (llIlIIlIIIIlIll(llIlIIlIIIIlIlI(this.tickEntryID, lllllllllllllIIllIIlIlIIIlIlIIII.tickEntryID))) {
            n = NextTickListEntry.lIIlIllIIlIlll[2];
            "".length();
            if (" ".length() > ("   ".length() ^ (0x60 ^ 0x67))) {
                return (0x3A ^ 0x6E ^ " ".length()) & (0x2C ^ 0x44 ^ (0xAA ^ 0x97) ^ -" ".length());
            }
        }
        else if (llIlIIlIIIIllII(llIlIIlIIIIlIlI(this.tickEntryID, lllllllllllllIIllIIlIlIIIlIlIIII.tickEntryID))) {
            n = NextTickListEntry.lIIlIllIIlIlll[1];
            "".length();
            if (" ".length() < 0) {
                return (0x50 ^ 0x1F) & ~(0xE7 ^ 0xA8);
            }
        }
        else {
            n = NextTickListEntry.lIIlIllIIlIlll[0];
        }
        return n;
    }
    
    static {
        llIlIIlIIIIIlll();
        llIlIIlIIIIIllI();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIllIIlIlIIIllIlIIl) {
        if (llIlIIlIIIIlIII((lllllllllllllIIllIIlIlIIIllIlIIl instanceof NextTickListEntry) ? 1 : 0)) {
            return NextTickListEntry.lIIlIllIIlIlll[0] != 0;
        }
        final NextTickListEntry lllllllllllllIIllIIlIlIIIllIlIII = (NextTickListEntry)lllllllllllllIIllIIlIlIIIllIlIIl;
        if (llIlIIlIIIIlIIl(this.position.equals(lllllllllllllIIllIIlIlIIIllIlIII.position) ? 1 : 0) && llIlIIlIIIIlIIl(Block.isEqualTo(this.block, lllllllllllllIIllIIlIlIIIllIlIII.block) ? 1 : 0)) {
            return NextTickListEntry.lIIlIllIIlIlll[1] != 0;
        }
        return NextTickListEntry.lIIlIllIIlIlll[0] != 0;
    }
    
    private static void llIlIIlIIIIIllI() {
        (lIIlIllIIlIllI = new String[NextTickListEntry.lIIlIllIIlIlll[5]])[NextTickListEntry.lIIlIllIIlIlll[0]] = llIlIIlIIIIIlII("gF1gcgeEJw8=", "VZcSS");
        NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[1]] = llIlIIlIIIIIlIl("Y0s=", "Okcmr");
        NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[3]] = llIlIIlIIIIIlII("13rnRsBYAzM=", "hFTNd");
        NextTickListEntry.lIIlIllIIlIllI[NextTickListEntry.lIIlIllIIlIlll[4]] = llIlIIlIIIIIlIl("Z0I=", "KbOlb");
    }
    
    private static int llIlIIlIIIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIIlIIIIlIII(final int lllllllllllllIIllIIlIlIIIIIllIIl) {
        return lllllllllllllIIllIIlIlIIIIIllIIl == 0;
    }
    
    @Override
    public int hashCode() {
        return this.position.hashCode();
    }
    
    private static void llIlIIlIIIIIlll() {
        (lIIlIllIIlIlll = new int[6])[0] = ((0x0 ^ 0x3F) & ~(0xFF ^ 0xC0));
        NextTickListEntry.lIIlIllIIlIlll[1] = " ".length();
        NextTickListEntry.lIIlIllIIlIlll[2] = -" ".length();
        NextTickListEntry.lIIlIllIIlIlll[3] = "  ".length();
        NextTickListEntry.lIIlIllIIlIlll[4] = "   ".length();
        NextTickListEntry.lIIlIllIIlIlll[5] = (124 + 60 - 52 + 9 ^ 69 + 19 + 17 + 32);
    }
    
    public NextTickListEntry setScheduledTime(final long lllllllllllllIIllIIlIlIIIlIllllI) {
        this.scheduledTime = lllllllllllllIIllIIlIlIIIlIllllI;
        return this;
    }
    
    private static boolean llIlIIlIIIIlllI(final int lllllllllllllIIllIIlIlIIIIIllllI, final int lllllllllllllIIllIIlIlIIIIIlllIl) {
        return lllllllllllllIIllIIlIlIIIIIllllI < lllllllllllllIIllIIlIlIIIIIlllIl;
    }
}
