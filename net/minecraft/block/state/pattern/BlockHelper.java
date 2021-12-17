// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state.pattern;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import com.google.common.base.Predicate;

public class BlockHelper implements Predicate<IBlockState>
{
    private static final /* synthetic */ int[] llIllIllIIIlIl;
    private final /* synthetic */ Block block;
    
    private static boolean lIIllIIIIIlIllll(final Object llllllllllllIllIIllIIllIIIIlIIII) {
        return llllllllllllIllIIllIIllIIIIlIIII != null;
    }
    
    public static BlockHelper forBlock(final Block llllllllllllIllIIllIIllIIIIlllIl) {
        return new BlockHelper(llllllllllllIllIIllIIllIIIIlllIl);
    }
    
    static {
        lIIllIIIIIlIlllI();
    }
    
    private static void lIIllIIIIIlIlllI() {
        (llIllIllIIIlIl = new int[2])[0] = " ".length();
        BlockHelper.llIllIllIIIlIl[1] = ((0x2B ^ 0x13 ^ (0x48 ^ 0x12)) & (0x99 ^ 0x9E ^ (0x31 ^ 0x54) ^ -" ".length()));
    }
    
    public boolean apply(final IBlockState llllllllllllIllIIllIIllIIIIlIllI) {
        if (lIIllIIIIIlIllll(llllllllllllIllIIllIIllIIIIlIllI) && lIIllIIIIIllIIII(llllllllllllIllIIllIIllIIIIlIllI.getBlock(), this.block)) {
            return BlockHelper.llIllIllIIIlIl[0] != 0;
        }
        return BlockHelper.llIllIllIIIlIl[1] != 0;
    }
    
    private BlockHelper(final Block llllllllllllIllIIllIIllIIIlIIIIl) {
        this.block = llllllllllllIllIIllIIllIIIlIIIIl;
    }
    
    private static boolean lIIllIIIIIllIIII(final Object llllllllllllIllIIllIIllIIIIIllIl, final Object llllllllllllIllIIllIIllIIIIIllII) {
        return llllllllllllIllIIllIIllIIIIIllIl == llllllllllllIllIIllIIllIIIIIllII;
    }
}
