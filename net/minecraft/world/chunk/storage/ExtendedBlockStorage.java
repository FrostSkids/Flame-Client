// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.world.chunk.NibbleArray;

public class ExtendedBlockStorage
{
    private /* synthetic */ NibbleArray skylightArray;
    private /* synthetic */ int tickRefCount;
    private static final /* synthetic */ int[] lIlllIIllIIIII;
    private /* synthetic */ int yBase;
    private /* synthetic */ NibbleArray blocklightArray;
    private /* synthetic */ char[] data;
    private /* synthetic */ int blockRefCount;
    
    public void setBlocklightArray(final NibbleArray llllllllllllIlllllIIlllIIlIlIIIl) {
        this.blocklightArray = llllllllllllIlllllIIlllIIlIlIIIl;
    }
    
    public int getExtBlocklightValue(final int llllllllllllIlllllIIlllIIllllIIl, final int llllllllllllIlllllIIlllIIlllIlII, final int llllllllllllIlllllIIlllIIlllIlll) {
        return this.blocklightArray.get(llllllllllllIlllllIIlllIIllllIIl, llllllllllllIlllllIIlllIIlllIlII, llllllllllllIlllllIIlllIIlllIlll);
    }
    
    public boolean isEmpty() {
        if (lIIIIIIlllllIIlI(this.blockRefCount)) {
            return ExtendedBlockStorage.lIlllIIllIIIII[3] != 0;
        }
        return ExtendedBlockStorage.lIlllIIllIIIII[4] != 0;
    }
    
    private static boolean lIIIIIIllllIllll(final int llllllllllllIlllllIIlllIIIllllIl) {
        return llllllllllllIlllllIIlllIIIllllIl != 0;
    }
    
    public int getYLocation() {
        return this.yBase;
    }
    
    public void setData(final char[] llllllllllllIlllllIIlllIIlIllIll) {
        this.data = llllllllllllIlllllIIlllIIlIllIll;
    }
    
    public Block getBlockByExtId(final int llllllllllllIlllllIIlllIllIIIIll, final int llllllllllllIlllllIIlllIllIIIIlI, final int llllllllllllIlllllIIlllIllIIIIIl) {
        return this.get(llllllllllllIlllllIIlllIllIIIIll, llllllllllllIlllllIIlllIllIIIIlI, llllllllllllIlllllIIlllIllIIIIIl).getBlock();
    }
    
    public void setExtBlocklightValue(final int llllllllllllIlllllIIlllIlIIIIlll, final int llllllllllllIlllllIIlllIlIIIIllI, final int llllllllllllIlllllIIlllIlIIIIlIl, final int llllllllllllIlllllIIlllIIlllllll) {
        this.blocklightArray.set(llllllllllllIlllllIIlllIlIIIIlll, llllllllllllIlllllIIlllIlIIIIllI, llllllllllllIlllllIIlllIlIIIIlIl, llllllllllllIlllllIIlllIIlllllll);
    }
    
    private static boolean lIIIIIIlllllIIII(final Object llllllllllllIlllllIIlllIIIllllll) {
        return llllllllllllIlllllIIlllIIIllllll != null;
    }
    
    public IBlockState get(final int llllllllllllIlllllIIlllIlllIlIII, final int llllllllllllIlllllIIlllIlllIIlll, final int llllllllllllIlllllIIlllIlllIIllI) {
        final IBlockState llllllllllllIlllllIIlllIlllIlIlI = Block.BLOCK_STATE_IDS.getByValue(this.data[llllllllllllIlllllIIlllIlllIIlll << ExtendedBlockStorage.lIlllIIllIIIII[1] | llllllllllllIlllllIIlllIlllIIllI << ExtendedBlockStorage.lIlllIIllIIIII[2] | llllllllllllIlllllIIlllIlllIlIII]);
        IBlockState defaultState;
        if (lIIIIIIlllllIIII(llllllllllllIlllllIIlllIlllIlIlI)) {
            defaultState = llllllllllllIlllllIIlllIlllIlIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            defaultState = Blocks.air.getDefaultState();
        }
        return defaultState;
    }
    
    public boolean getNeedsRandomTick() {
        if (lIIIIIIlllllIIll(this.tickRefCount)) {
            return ExtendedBlockStorage.lIlllIIllIIIII[3] != 0;
        }
        return ExtendedBlockStorage.lIlllIIllIIIII[4] != 0;
    }
    
    public NibbleArray getBlocklightArray() {
        return this.blocklightArray;
    }
    
    public ExtendedBlockStorage(final int llllllllllllIlllllIIlllIllllIlIl, final boolean llllllllllllIlllllIIlllIllllIlll) {
        this.yBase = llllllllllllIlllllIIlllIllllIlIl;
        this.data = new char[ExtendedBlockStorage.lIlllIIllIIIII[0]];
        this.blocklightArray = new NibbleArray();
        if (lIIIIIIllllIllll(llllllllllllIlllllIIlllIllllIlll ? 1 : 0)) {
            this.skylightArray = new NibbleArray();
        }
    }
    
    private static boolean lIIIIIIlllllIlII(final int llllllllllllIlllllIIlllIIlIIIllI, final int llllllllllllIlllllIIlllIIlIIIlIl) {
        return llllllllllllIlllllIIlllIIlIIIllI >= llllllllllllIlllllIIlllIIlIIIlIl;
    }
    
    private static boolean lIIIIIIlllllIIlI(final int llllllllllllIlllllIIlllIIIlllIll) {
        return llllllllllllIlllllIIlllIIIlllIll == 0;
    }
    
    public char[] getData() {
        return this.data;
    }
    
    public void set(final int llllllllllllIlllllIIlllIllIlIIll, final int llllllllllllIlllllIIlllIllIllIlI, final int llllllllllllIlllllIIlllIllIlIIIl, final IBlockState llllllllllllIlllllIIlllIllIlIIII) {
        final IBlockState llllllllllllIlllllIIlllIllIlIlll = this.get(llllllllllllIlllllIIlllIllIlIIll, llllllllllllIlllllIIlllIllIllIlI, llllllllllllIlllllIIlllIllIlIIIl);
        final Block llllllllllllIlllllIIlllIllIlIllI = llllllllllllIlllllIIlllIllIlIlll.getBlock();
        final Block llllllllllllIlllllIIlllIllIlIlIl = llllllllllllIlllllIIlllIllIlIIII.getBlock();
        if (lIIIIIIlllllIIIl(llllllllllllIlllllIIlllIllIlIllI, Blocks.air)) {
            this.blockRefCount -= ExtendedBlockStorage.lIlllIIllIIIII[3];
            if (lIIIIIIllllIllll(llllllllllllIlllllIIlllIllIlIllI.getTickRandomly() ? 1 : 0)) {
                this.tickRefCount -= ExtendedBlockStorage.lIlllIIllIIIII[3];
            }
        }
        if (lIIIIIIlllllIIIl(llllllllllllIlllllIIlllIllIlIlIl, Blocks.air)) {
            this.blockRefCount += ExtendedBlockStorage.lIlllIIllIIIII[3];
            if (lIIIIIIllllIllll(llllllllllllIlllllIIlllIllIlIlIl.getTickRandomly() ? 1 : 0)) {
                this.tickRefCount += ExtendedBlockStorage.lIlllIIllIIIII[3];
            }
        }
        this.data[llllllllllllIlllllIIlllIllIllIlI << ExtendedBlockStorage.lIlllIIllIIIII[1] | llllllllllllIlllllIIlllIllIlIIIl << ExtendedBlockStorage.lIlllIIllIIIII[2] | llllllllllllIlllllIIlllIllIlIIll] = (char)Block.BLOCK_STATE_IDS.get(llllllllllllIlllllIIlllIllIlIIII);
    }
    
    private static boolean lIIIIIIlllllIIll(final int llllllllllllIlllllIIlllIIIlllIIl) {
        return llllllllllllIlllllIIlllIIIlllIIl > 0;
    }
    
    public int getExtBlockMetadata(final int llllllllllllIlllllIIlllIlIllIlIl, final int llllllllllllIlllllIIlllIlIlllIIl, final int llllllllllllIlllllIIlllIlIlllIII) {
        final IBlockState llllllllllllIlllllIIlllIlIllIlll = this.get(llllllllllllIlllllIIlllIlIllIlIl, llllllllllllIlllllIIlllIlIlllIIl, llllllllllllIlllllIIlllIlIlllIII);
        return llllllllllllIlllllIIlllIlIllIlll.getBlock().getMetaFromState(llllllllllllIlllllIIlllIlIllIlll);
    }
    
    public int getExtSkylightValue(final int llllllllllllIlllllIIlllIlIIlIIII, final int llllllllllllIlllllIIlllIlIIlIIll, final int llllllllllllIlllllIIlllIlIIlIIlI) {
        return this.skylightArray.get(llllllllllllIlllllIIlllIlIIlIIII, llllllllllllIlllllIIlllIlIIlIIll, llllllllllllIlllllIIlllIlIIlIIlI);
    }
    
    public void setSkylightArray(final NibbleArray llllllllllllIlllllIIlllIIlIIlIIl) {
        this.skylightArray = llllllllllllIlllllIIlllIIlIIlIIl;
    }
    
    static {
        lIIIIIIllllIlllI();
    }
    
    private static void lIIIIIIllllIlllI() {
        (lIlllIIllIIIII = new int[6])[0] = (-(0xFFFFEF5F & 0x1DED) & (0xFFFFFD6F & 0x1FDC));
        ExtendedBlockStorage.lIlllIIllIIIII[1] = (0x9A ^ 0x92);
        ExtendedBlockStorage.lIlllIIllIIIII[2] = (0x76 ^ 0x72);
        ExtendedBlockStorage.lIlllIIllIIIII[3] = " ".length();
        ExtendedBlockStorage.lIlllIIllIIIII[4] = ((195 + 171 - 324 + 158 ^ 175 + 107 - 249 + 159) & (0x7D ^ 0x2A ^ (0x24 ^ 0x7B) ^ -" ".length()));
        ExtendedBlockStorage.lIlllIIllIIIII[5] = (0x1 ^ 0x11);
    }
    
    private static boolean lIIIIIIlllllIIIl(final Object llllllllllllIlllllIIlllIIlIIIIlI, final Object llllllllllllIlllllIIlllIIlIIIIIl) {
        return llllllllllllIlllllIIlllIIlIIIIlI != llllllllllllIlllllIIlllIIlIIIIIl;
    }
    
    public void setExtSkylightValue(final int llllllllllllIlllllIIlllIlIlIIIlI, final int llllllllllllIlllllIIlllIlIlIIIIl, final int llllllllllllIlllllIIlllIlIIllIll, final int llllllllllllIlllllIIlllIlIIllIlI) {
        this.skylightArray.set(llllllllllllIlllllIIlllIlIlIIIlI, llllllllllllIlllllIIlllIlIlIIIIl, llllllllllllIlllllIIlllIlIIllIll, llllllllllllIlllllIIlllIlIIllIlI);
    }
    
    public void removeInvalidBlocks() {
        this.blockRefCount = ExtendedBlockStorage.lIlllIIllIIIII[4];
        this.tickRefCount = ExtendedBlockStorage.lIlllIIllIIIII[4];
        int llllllllllllIlllllIIlllIIllIllII = ExtendedBlockStorage.lIlllIIllIIIII[4];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIIIIIlllllIlII(llllllllllllIlllllIIlllIIllIllII, ExtendedBlockStorage.lIlllIIllIIIII[5])) {
            int llllllllllllIlllllIIlllIIllIlIll = ExtendedBlockStorage.lIlllIIllIIIII[4];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!lIIIIIIlllllIlII(llllllllllllIlllllIIlllIIllIlIll, ExtendedBlockStorage.lIlllIIllIIIII[5])) {
                int llllllllllllIlllllIIlllIIllIlIlI = ExtendedBlockStorage.lIlllIIllIIIII[4];
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
                while (!lIIIIIIlllllIlII(llllllllllllIlllllIIlllIIllIlIlI, ExtendedBlockStorage.lIlllIIllIIIII[5])) {
                    final Block llllllllllllIlllllIIlllIIllIlIIl = this.getBlockByExtId(llllllllllllIlllllIIlllIIllIllII, llllllllllllIlllllIIlllIIllIlIll, llllllllllllIlllllIIlllIIllIlIlI);
                    if (lIIIIIIlllllIIIl(llllllllllllIlllllIIlllIIllIlIIl, Blocks.air)) {
                        this.blockRefCount += ExtendedBlockStorage.lIlllIIllIIIII[3];
                        if (lIIIIIIllllIllll(llllllllllllIlllllIIlllIIllIlIIl.getTickRandomly() ? 1 : 0)) {
                            this.tickRefCount += ExtendedBlockStorage.lIlllIIllIIIII[3];
                        }
                    }
                    ++llllllllllllIlllllIIlllIIllIlIlI;
                }
                ++llllllllllllIlllllIIlllIIllIlIll;
            }
            ++llllllllllllIlllllIIlllIIllIllII;
        }
    }
    
    public NibbleArray getSkylightArray() {
        return this.skylightArray;
    }
}
