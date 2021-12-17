// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class ChunkPrimer
{
    private static final /* synthetic */ String[] lIllIIIIIIIIll;
    private final /* synthetic */ short[] data;
    private static final /* synthetic */ int[] lIllIIIIIIIlII;
    private final /* synthetic */ IBlockState defaultState;
    
    public IBlockState getBlockState(final int lllllllllllllIIIIlIIlIIllIlllIIl) {
        if (llllIlIlllIIlIl(lllllllllllllIIIIlIIlIIllIlllIIl) && llllIlIlllIIllI(lllllllllllllIIIIlIIlIIllIlllIIl, this.data.length)) {
            final IBlockState lllllllllllllIIIIlIIlIIllIlllIll = Block.BLOCK_STATE_IDS.getByValue(this.data[lllllllllllllIIIIlIIlIIllIlllIIl]);
            IBlockState defaultState;
            if (llllIlIlllIIlll(lllllllllllllIIIIlIIlIIllIlllIll)) {
                defaultState = lllllllllllllIIIIlIIlIIllIlllIll;
                "".length();
                if ("   ".length() < "  ".length()) {
                    return null;
                }
            }
            else {
                defaultState = this.defaultState;
            }
            return defaultState;
        }
        throw new IndexOutOfBoundsException(ChunkPrimer.lIllIIIIIIIIll[ChunkPrimer.lIllIIIIIIIlII[3]]);
    }
    
    private static void llllIlIlllIIlII() {
        (lIllIIIIIIIlII = new int[6])[0] = (0xFFFFDAC1 & 0x1253E);
        ChunkPrimer.lIllIIIIIIIlII[1] = (0x5B ^ 0x57);
        ChunkPrimer.lIllIIIIIIIlII[2] = (0x79 ^ 0x71);
        ChunkPrimer.lIllIIIIIIIlII[3] = ((57 + 125 - 90 + 76 ^ 20 + 115 - 16 + 18) & (180 + 95 - 143 + 59 ^ 62 + 152 - 91 + 35 ^ -" ".length()));
        ChunkPrimer.lIllIIIIIIIlII[4] = " ".length();
        ChunkPrimer.lIllIIIIIIIlII[5] = "  ".length();
    }
    
    public void setBlockState(final int lllllllllllllIIIIlIIlIIllIIllllI, final IBlockState lllllllllllllIIIIlIIlIIllIIlllIl) {
        if (!llllIlIlllIIlIl(lllllllllllllIIIIlIIlIIllIIllllI) || !llllIlIlllIIllI(lllllllllllllIIIIlIIlIIllIIllllI, this.data.length)) {
            throw new IndexOutOfBoundsException(ChunkPrimer.lIllIIIIIIIIll[ChunkPrimer.lIllIIIIIIIlII[4]]);
        }
        this.data[lllllllllllllIIIIlIIlIIllIIllllI] = (short)Block.BLOCK_STATE_IDS.get(lllllllllllllIIIIlIIlIIllIIlllIl);
        "".length();
        if ((0x38 ^ 0x2 ^ (0x2E ^ 0x10)) <= -" ".length()) {
            return;
        }
    }
    
    private static void llllIlIlllIIIll() {
        (lIllIIIIIIIIll = new String[ChunkPrimer.lIllIIIIIIIlII[5]])[ChunkPrimer.lIllIIIIIIIlII[3]] = llllIlIlllIIIlI("HRsMVi0mHBsSJycSHRNuIABJGTs9UwYQbjsSBxEr", "IsivN");
        ChunkPrimer.lIllIIIIIIIIll[ChunkPrimer.lIllIIIIIIIlII[4]] = llllIlIlllIIIlI("Mx49QgsIGSoGAQkXLAdIDgV4DR0TVjcESBUXNgUN", "gvXbh");
    }
    
    private static boolean llllIlIlllIIllI(final int lllllllllllllIIIIlIIlIIllIIIIIlI, final int lllllllllllllIIIIlIIlIIllIIIIIIl) {
        return lllllllllllllIIIIlIIlIIllIIIIIlI < lllllllllllllIIIIlIIlIIllIIIIIIl;
    }
    
    public IBlockState getBlockState(final int lllllllllllllIIIIlIIlIIlllIIlIIl, final int lllllllllllllIIIIlIIlIIlllIIIIll, final int lllllllllllllIIIIlIIlIIlllIIIIlI) {
        final int lllllllllllllIIIIlIIlIIlllIIIllI = lllllllllllllIIIIlIIlIIlllIIlIIl << ChunkPrimer.lIllIIIIIIIlII[1] | lllllllllllllIIIIlIIlIIlllIIIIlI << ChunkPrimer.lIllIIIIIIIlII[2] | lllllllllllllIIIIlIIlIIlllIIIIll;
        return this.getBlockState(lllllllllllllIIIIlIIlIIlllIIIllI);
    }
    
    public ChunkPrimer() {
        this.data = new short[ChunkPrimer.lIllIIIIIIIlII[0]];
        this.defaultState = Blocks.air.getDefaultState();
    }
    
    private static String llllIlIlllIIIlI(String lllllllllllllIIIIlIIlIIllIIIllIl, final String lllllllllllllIIIIlIIlIIllIIIllII) {
        lllllllllllllIIIIlIIlIIllIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIIllIIlIIII = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIIllIIIllll = lllllllllllllIIIIlIIlIIllIIIllII.toCharArray();
        int lllllllllllllIIIIlIIlIIllIIIlllI = ChunkPrimer.lIllIIIIIIIlII[3];
        final boolean lllllllllllllIIIIlIIlIIllIIIlIII = (Object)lllllllllllllIIIIlIIlIIllIIIllIl.toCharArray();
        final long lllllllllllllIIIIlIIlIIllIIIIlll = lllllllllllllIIIIlIIlIIllIIIlIII.length;
        int lllllllllllllIIIIlIIlIIllIIIIllI = ChunkPrimer.lIllIIIIIIIlII[3];
        while (llllIlIlllIIllI(lllllllllllllIIIIlIIlIIllIIIIllI, (int)lllllllllllllIIIIlIIlIIllIIIIlll)) {
            final char lllllllllllllIIIIlIIlIIllIIlIIll = lllllllllllllIIIIlIIlIIllIIIlIII[lllllllllllllIIIIlIIlIIllIIIIllI];
            lllllllllllllIIIIlIIlIIllIIlIIII.append((char)(lllllllllllllIIIIlIIlIIllIIlIIll ^ lllllllllllllIIIIlIIlIIllIIIllll[lllllllllllllIIIIlIIlIIllIIIlllI % lllllllllllllIIIIlIIlIIllIIIllll.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIIllIIIlllI;
            ++lllllllllllllIIIIlIIlIIllIIIIllI;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIIllIIlIIII);
    }
    
    private static boolean llllIlIlllIIlll(final Object lllllllllllllIIIIlIIlIIlIlllllll) {
        return lllllllllllllIIIIlIIlIIlIlllllll != null;
    }
    
    static {
        llllIlIlllIIlII();
        llllIlIlllIIIll();
    }
    
    private static boolean llllIlIlllIIlIl(final int lllllllllllllIIIIlIIlIIlIlllllIl) {
        return lllllllllllllIIIIlIIlIIlIlllllIl >= 0;
    }
    
    public void setBlockState(final int lllllllllllllIIIIlIIlIIllIllIIII, final int lllllllllllllIIIIlIIlIIllIlIlIIl, final int lllllllllllllIIIIlIIlIIllIlIlllI, final IBlockState lllllllllllllIIIIlIIlIIllIlIllIl) {
        final int lllllllllllllIIIIlIIlIIllIlIllII = lllllllllllllIIIIlIIlIIllIllIIII << ChunkPrimer.lIllIIIIIIIlII[1] | lllllllllllllIIIIlIIlIIllIlIlllI << ChunkPrimer.lIllIIIIIIIlII[2] | lllllllllllllIIIIlIIlIIllIlIlIIl;
        this.setBlockState(lllllllllllllIIIIlIIlIIllIlIllII, lllllllllllllIIIIlIIlIIllIlIllIl);
    }
}
