// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class NBTSizeTracker
{
    private static final /* synthetic */ int[] lIlIlIlIlIlIlI;
    private final /* synthetic */ long max;
    private static final /* synthetic */ String[] lIlIlIlIlIlIII;
    private /* synthetic */ long read;
    
    private static String lllIlllIIllIIll(String lllllllllllllIIIlIIIIIlllllllIll, final String lllllllllllllIIIlIIIIIllllllllll) {
        lllllllllllllIIIlIIIIIlllllllIll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIIlllllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIIlllllllllI = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIIllllllllIl = lllllllllllllIIIlIIIIIllllllllll.toCharArray();
        int lllllllllllllIIIlIIIIIllllllllII = NBTSizeTracker.lIlIlIlIlIlIlI[0];
        final long lllllllllllllIIIlIIIIIllllllIllI = (Object)((String)lllllllllllllIIIlIIIIIlllllllIll).toCharArray();
        final float lllllllllllllIIIlIIIIIllllllIlIl = lllllllllllllIIIlIIIIIllllllIllI.length;
        char lllllllllllllIIIlIIIIIllllllIlII = (char)NBTSizeTracker.lIlIlIlIlIlIlI[0];
        while (lllIlllIIlllIIl(lllllllllllllIIIlIIIIIllllllIlII, (int)lllllllllllllIIIlIIIIIllllllIlIl)) {
            final char lllllllllllllIIIlIIIIlIIIIIIIIIl = lllllllllllllIIIlIIIIIllllllIllI[lllllllllllllIIIlIIIIIllllllIlII];
            lllllllllllllIIIlIIIIIlllllllllI.append((char)(lllllllllllllIIIlIIIIlIIIIIIIIIl ^ lllllllllllllIIIlIIIIIllllllllIl[lllllllllllllIIIlIIIIIllllllllII % lllllllllllllIIIlIIIIIllllllllIl.length]));
            "".length();
            ++lllllllllllllIIIlIIIIIllllllllII;
            ++lllllllllllllIIIlIIIIIllllllIlII;
            "".length();
            if ((0x14 ^ 0x10) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIIlllllllllI);
    }
    
    private static int lllIlllIIllIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lllIlllIIllIllI();
        lllIlllIIllIlII();
        INFINITE = new NBTSizeTracker() {
            @Override
            public void read(final long llllllllllllIlllIIlIIIIlIIllIIll) {
            }
        };
    }
    
    private static boolean lllIlllIIlllIIl(final int lllllllllllllIIIlIIIIIllllllIIII, final int lllllllllllllIIIlIIIIIlllllIllll) {
        return lllllllllllllIIIlIIIIIllllllIIII < lllllllllllllIIIlIIIIIlllllIllll;
    }
    
    public NBTSizeTracker(final long lllllllllllllIIIlIIIIlIIIIIlIIll) {
        this.max = lllllllllllllIIIlIIIIlIIIIIlIIll;
    }
    
    private static void lllIlllIIllIlII() {
        (lIlIlIlIlIlIII = new String[NBTSizeTracker.lIlIlIlIlIlIlI[2]])[NBTSizeTracker.lIlIlIlIlIlIlI[0]] = lllIlllIIllIIll("AjcYLAF2MR5pFzMkFWkrFBFRPQQxZQUhBCJlBigWdjEeJkU0LBZyRSI3GCwBdjEeaQQ6KR4qBCIgS2k=", "VEqIe");
        NBTSizeTracker.lIlIlIlIlIlIII[NBTSizeTracker.lIlIlIlIlIlIlI[1]] = lllIlllIIllIIll("FzodIQFVNAEhABBjBCUKVSIFKB0CJg1+Ug==", "uCiDr");
    }
    
    private static void lllIlllIIllIllI() {
        (lIlIlIlIlIlIlI = new int[3])[0] = ((219 + 68 - 224 + 178 ^ 61 + 147 - 173 + 149) & (0x64 ^ 0x7D ^ (0xD7 ^ 0x87) ^ -" ".length()));
        NBTSizeTracker.lIlIlIlIlIlIlI[1] = " ".length();
        NBTSizeTracker.lIlIlIlIlIlIlI[2] = "  ".length();
    }
    
    public void read(final long lllllllllllllIIIlIIIIlIIIIIIlIll) {
        this.read += lllllllllllllIIIlIIIIlIIIIIIlIll / 8L;
        if (lllIlllIIlllIII(lllIlllIIllIlll(this.read, this.max))) {
            throw new RuntimeException(String.valueOf(new StringBuilder(NBTSizeTracker.lIlIlIlIlIlIII[NBTSizeTracker.lIlIlIlIlIlIlI[0]]).append(this.read).append(NBTSizeTracker.lIlIlIlIlIlIII[NBTSizeTracker.lIlIlIlIlIlIlI[1]]).append(this.max)));
        }
    }
    
    private static boolean lllIlllIIlllIII(final int lllllllllllllIIIlIIIIIlllllIllIl) {
        return lllllllllllllIIIlIIIIIlllllIllIl > 0;
    }
}
