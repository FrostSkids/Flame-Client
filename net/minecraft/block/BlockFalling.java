// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockFalling extends Block
{
    private static final /* synthetic */ int[] lIIIIIllIIlIIl;
    public static /* synthetic */ boolean fallInstantly;
    
    private static boolean lIllIllIlllllIl(final int lllllllllllllIlIIllIlllllIIlIIlI) {
        return lllllllllllllIlIIllIlllllIIlIIlI != 0;
    }
    
    private static boolean lIllIllIlllllll(final int lllllllllllllIlIIllIlllllIIIllII) {
        return lllllllllllllIlIIllIlllllIIIllII <= 0;
    }
    
    private static boolean lIllIlllIIIIIII(final int lllllllllllllIlIIllIlllllIIIlIlI) {
        return lllllllllllllIlIIllIlllllIIIlIlI > 0;
    }
    
    private static void lIllIllIllllIll() {
        (lIIIIIllIIlIIl = new int[4])[0] = (0x1A ^ 0x3A);
        BlockFalling.lIIIIIllIIlIIl[1] = "  ".length();
        BlockFalling.lIIIIIllIIlIIl[2] = ((0x21 ^ 0x55 ^ (0xFD ^ 0xB5)) & (56 + 61 - 24 + 80 ^ 71 + 68 - 28 + 34 ^ -" ".length()));
        BlockFalling.lIIIIIllIIlIIl[3] = " ".length();
    }
    
    static {
        lIllIllIllllIll();
    }
    
    private void checkFallable(final World lllllllllllllIlIIllIlllllIllIlII, final BlockPos lllllllllllllIlIIllIlllllIlIllIl) {
        if (lIllIllIlllllIl(canFallInto(lllllllllllllIlIIllIlllllIllIlII, lllllllllllllIlIIllIlllllIlIllIl.down()) ? 1 : 0) && lIllIllIllllllI(lllllllllllllIlIIllIlllllIlIllIl.getY())) {
            final int lllllllllllllIlIIllIlllllIllIIlI = BlockFalling.lIIIIIllIIlIIl[0];
            if (lIllIllIlllllII(BlockFalling.fallInstantly ? 1 : 0) && lIllIllIlllllIl(lllllllllllllIlIIllIlllllIllIlII.isAreaLoaded(lllllllllllllIlIIllIlllllIlIllIl.add(-lllllllllllllIlIIllIlllllIllIIlI, -lllllllllllllIlIIllIlllllIllIIlI, -lllllllllllllIlIIllIlllllIllIIlI), lllllllllllllIlIIllIlllllIlIllIl.add(lllllllllllllIlIIllIlllllIllIIlI, lllllllllllllIlIIllIlllllIllIIlI, lllllllllllllIlIIllIlllllIllIIlI)) ? 1 : 0)) {
                if (lIllIllIlllllII(lllllllllllllIlIIllIlllllIllIlII.isRemote ? 1 : 0)) {
                    final EntityFallingBlock lllllllllllllIlIIllIlllllIllIIIl = new EntityFallingBlock(lllllllllllllIlIIllIlllllIllIlII, lllllllllllllIlIIllIlllllIlIllIl.getX() + 0.5, lllllllllllllIlIIllIlllllIlIllIl.getY(), lllllllllllllIlIIllIlllllIlIllIl.getZ() + 0.5, lllllllllllllIlIIllIlllllIllIlII.getBlockState(lllllllllllllIlIIllIlllllIlIllIl));
                    this.onStartFalling(lllllllllllllIlIIllIlllllIllIIIl);
                    lllllllllllllIlIIllIlllllIllIlII.spawnEntityInWorld(lllllllllllllIlIIllIlllllIllIIIl);
                    "".length();
                    "".length();
                    if ((0x2C ^ 0x58 ^ (0xB0 ^ 0xC0)) <= ((0x10 ^ 0x3B ^ (0x63 ^ 0x6F)) & (0x6A ^ 0x6D ^ (0x3B ^ 0x1B) ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else {
                lllllllllllllIlIIllIlllllIllIlII.setBlockToAir(lllllllllllllIlIIllIlllllIlIllIl);
                "".length();
                BlockPos lllllllllllllIlIIllIlllllIllIIII = lllllllllllllIlIIllIlllllIlIllIl.down();
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                while (lIllIllIlllllIl(canFallInto(lllllllllllllIlIIllIlllllIllIlII, lllllllllllllIlIIllIlllllIllIIII) ? 1 : 0) && !lIllIllIlllllll(lllllllllllllIlIIllIlllllIllIIII.getY())) {
                    lllllllllllllIlIIllIlllllIllIIII = lllllllllllllIlIIllIlllllIllIIII.down();
                }
                if (lIllIlllIIIIIII(lllllllllllllIlIIllIlllllIllIIII.getY())) {
                    lllllllllllllIlIIllIlllllIllIlII.setBlockState(lllllllllllllIlIIllIlllllIllIIII.up(), this.getDefaultState());
                    "".length();
                }
            }
        }
    }
    
    private static boolean lIllIllIllllllI(final int lllllllllllllIlIIllIlllllIIIlllI) {
        return lllllllllllllIlIIllIlllllIIIlllI >= 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIIllIllllllIIllII, final BlockPos lllllllllllllIlIIllIllllllIIIllI, final IBlockState lllllllllllllIlIIllIllllllIIlIlI, final Block lllllllllllllIlIIllIllllllIIlIIl) {
        lllllllllllllIlIIllIllllllIIllII.scheduleUpdate(lllllllllllllIlIIllIllllllIIIllI, this, this.tickRate(lllllllllllllIlIIllIllllllIIllII));
    }
    
    public static boolean canFallInto(final World lllllllllllllIlIIllIlllllIIllllI, final BlockPos lllllllllllllIlIIllIlllllIlIIIIl) {
        final Block lllllllllllllIlIIllIlllllIlIIIII = lllllllllllllIlIIllIlllllIIllllI.getBlockState(lllllllllllllIlIIllIlllllIlIIIIl).getBlock();
        final Material lllllllllllllIlIIllIlllllIIlllll = lllllllllllllIlIIllIlllllIlIIIII.blockMaterial;
        if (lIllIlllIIIIIIl(lllllllllllllIlIIllIlllllIlIIIII, Blocks.fire) && lIllIlllIIIIIIl(lllllllllllllIlIIllIlllllIIlllll, Material.air) && lIllIlllIIIIIIl(lllllllllllllIlIIllIlllllIIlllll, Material.water) && lIllIlllIIIIIIl(lllllllllllllIlIIllIlllllIIlllll, Material.lava)) {
            return BlockFalling.lIIIIIllIIlIIl[2] != 0;
        }
        return BlockFalling.lIIIIIllIIlIIl[3] != 0;
    }
    
    public void onEndFalling(final World lllllllllllllIlIIllIlllllIIllIIl, final BlockPos lllllllllllllIlIIllIlllllIIllIII) {
    }
    
    private static boolean lIllIlllIIIIIIl(final Object lllllllllllllIlIIllIlllllIIlIlIl, final Object lllllllllllllIlIIllIlllllIIlIlII) {
        return lllllllllllllIlIIllIlllllIIlIlIl != lllllllllllllIlIIllIlllllIIlIlII;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIlIIllIllllllIlIllI, final BlockPos lllllllllllllIlIIllIllllllIlIIIl, final IBlockState lllllllllllllIlIIllIllllllIlIlII) {
        lllllllllllllIlIIllIllllllIlIllI.scheduleUpdate(lllllllllllllIlIIllIllllllIlIIIl, this, this.tickRate(lllllllllllllIlIIllIllllllIlIllI));
    }
    
    public BlockFalling() {
        super(Material.sand);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static boolean lIllIllIlllllII(final int lllllllllllllIlIIllIlllllIIlIIII) {
        return lllllllllllllIlIIllIlllllIIlIIII == 0;
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIIllIlllllIlIIlll) {
        return BlockFalling.lIIIIIllIIlIIl[1];
    }
    
    public BlockFalling(final Material lllllllllllllIlIIllIllllllIlllIl) {
        super(lllllllllllllIlIIllIllllllIlllIl);
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIIllIlllllIllllII, final BlockPos lllllllllllllIlIIllIlllllIlllIll, final IBlockState lllllllllllllIlIIllIlllllIllllll, final Random lllllllllllllIlIIllIlllllIlllllI) {
        if (lIllIllIlllllII(lllllllllllllIlIIllIlllllIllllII.isRemote ? 1 : 0)) {
            this.checkFallable(lllllllllllllIlIIllIlllllIllllII, lllllllllllllIlIIllIlllllIlllIll);
        }
    }
    
    protected void onStartFalling(final EntityFallingBlock lllllllllllllIlIIllIlllllIlIlIIl) {
    }
}
