// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.Item;
import net.minecraft.block.material.MapColor;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockDragonEgg extends Block
{
    private static final /* synthetic */ int[] lIIlllIlIIIIll;
    
    private static boolean llIllIllIllIIIl(final Object lllllllllllllIIlIlIIIIIIIlIIIIlI, final Object lllllllllllllIIlIlIIIIIIIlIIIIIl) {
        return lllllllllllllIIlIlIIIIIIIlIIIIlI == lllllllllllllIIlIlIIIIIIIlIIIIIl;
    }
    
    private static boolean llIllIllIlIlIlI(final int lllllllllllllIIlIlIIIIIIIIlllIll) {
        return lllllllllllllIIlIlIIIIIIIIlllIll >= 0;
    }
    
    private void teleport(final World lllllllllllllIIlIlIIIIIIIllIIIll, final BlockPos lllllllllllllIIlIlIIIIIIIllIIIlI) {
        final IBlockState lllllllllllllIIlIlIIIIIIIllIllll = lllllllllllllIIlIlIIIIIIIllIIIll.getBlockState(lllllllllllllIIlIlIIIIIIIllIIIlI);
        if (llIllIllIllIIIl(lllllllllllllIIlIlIIIIIIIllIllll.getBlock(), this)) {
            int lllllllllllllIIlIlIIIIIIIllIlllI = BlockDragonEgg.lIIlllIlIIIIll[3];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!llIllIllIllIIlI(lllllllllllllIIlIlIIIIIIIllIlllI, BlockDragonEgg.lIIlllIlIIIIll[7])) {
                final BlockPos lllllllllllllIIlIlIIIIIIIllIllIl = lllllllllllllIIlIlIIIIIIIllIIIlI.add(lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[4]) - lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[4]), lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[5]) - lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[5]), lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[4]) - lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextInt(BlockDragonEgg.lIIlllIlIIIIll[4]));
                if (llIllIllIllIIIl(lllllllllllllIIlIlIIIIIIIllIIIll.getBlockState(lllllllllllllIIlIlIIIIIIIllIllIl).getBlock().blockMaterial, Material.air)) {
                    if (llIllIllIlIlIIl(lllllllllllllIIlIlIIIIIIIllIIIll.isRemote ? 1 : 0)) {
                        int lllllllllllllIIlIlIIIIIIIllIllII = BlockDragonEgg.lIIlllIlIIIIll[3];
                        "".length();
                        if ((0x2A ^ 0x2E) < -" ".length()) {
                            return;
                        }
                        while (!llIllIllIllIIlI(lllllllllllllIIlIlIIIIIIIllIllII, BlockDragonEgg.lIIlllIlIIIIll[6])) {
                            final double lllllllllllllIIlIlIIIIIIIllIlIll = lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextDouble();
                            final float lllllllllllllIIlIlIIIIIIIllIlIlI = (lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextFloat() - 0.5f) * 0.2f;
                            final float lllllllllllllIIlIlIIIIIIIllIlIIl = (lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextFloat() - 0.5f) * 0.2f;
                            final float lllllllllllllIIlIlIIIIIIIllIlIII = (lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextFloat() - 0.5f) * 0.2f;
                            final double lllllllllllllIIlIlIIIIIIIllIIlll = lllllllllllllIIlIlIIIIIIIllIllIl.getX() + (lllllllllllllIIlIlIIIIIIIllIIIlI.getX() - lllllllllllllIIlIlIIIIIIIllIllIl.getX()) * lllllllllllllIIlIlIIIIIIIllIlIll + (lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextDouble() - 0.5) * 1.0 + 0.5;
                            final double lllllllllllllIIlIlIIIIIIIllIIllI = lllllllllllllIIlIlIIIIIIIllIllIl.getY() + (lllllllllllllIIlIlIIIIIIIllIIIlI.getY() - lllllllllllllIIlIlIIIIIIIllIllIl.getY()) * lllllllllllllIIlIlIIIIIIIllIlIll + lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextDouble() * 1.0 - 0.5;
                            final double lllllllllllllIIlIlIIIIIIIllIIlIl = lllllllllllllIIlIlIIIIIIIllIllIl.getZ() + (lllllllllllllIIlIlIIIIIIIllIIIlI.getZ() - lllllllllllllIIlIlIIIIIIIllIllIl.getZ()) * lllllllllllllIIlIlIIIIIIIllIlIll + (lllllllllllllIIlIlIIIIIIIllIIIll.rand.nextDouble() - 0.5) * 1.0 + 0.5;
                            lllllllllllllIIlIlIIIIIIIllIIIll.spawnParticle(EnumParticleTypes.PORTAL, lllllllllllllIIlIlIIIIIIIllIIlll, lllllllllllllIIlIlIIIIIIIllIIllI, lllllllllllllIIlIlIIIIIIIllIIlIl, lllllllllllllIIlIlIIIIIIIllIlIlI, lllllllllllllIIlIlIIIIIIIllIlIIl, lllllllllllllIIlIlIIIIIIIllIlIII, new int[BlockDragonEgg.lIIlllIlIIIIll[3]]);
                            ++lllllllllllllIIlIlIIIIIIIllIllII;
                        }
                        "".length();
                        if (((0x3B ^ 0x1B) & ~(0x86 ^ 0xA6)) != 0x0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIlIIIIIIIllIIIll.setBlockState(lllllllllllllIIlIlIIIIIIIllIllIl, lllllllllllllIIlIlIIIIIIIllIllll, BlockDragonEgg.lIIlllIlIIIIll[1]);
                        "".length();
                        lllllllllllllIIlIlIIIIIIIllIIIll.setBlockToAir(lllllllllllllIIlIlIIIIIIIllIIIlI);
                        "".length();
                    }
                    return;
                }
                ++lllllllllllllIIlIlIIIIIIIllIlllI;
            }
        }
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockDragonEgg.lIIlllIlIIIIll[3] != 0;
    }
    
    private static void llIllIllIlIlIII() {
        (lIIlllIlIIIIll = new int[9])[0] = (60 + 55 - 13 + 27 ^ 29 + 112 - 72 + 92);
        BlockDragonEgg.lIIlllIlIIIIll[1] = "  ".length();
        BlockDragonEgg.lIIlllIlIIIIll[2] = " ".length();
        BlockDragonEgg.lIIlllIlIIIIll[3] = ((0x4F ^ 0x71 ^ (0xBA ^ 0x8C)) & ("  ".length() ^ (0xA6 ^ 0xAC) ^ -" ".length()));
        BlockDragonEgg.lIIlllIlIIIIll[4] = (0xB ^ 0x1B);
        BlockDragonEgg.lIIlllIlIIIIll[5] = (0xB3 ^ 0xB9 ^ "  ".length());
        BlockDragonEgg.lIIlllIlIIIIll[6] = 89 + 21 - 60 + 78;
        BlockDragonEgg.lIIlllIlIIIIll[7] = (0xFFFFCBEA & 0x37FD);
        BlockDragonEgg.lIIlllIlIIIIll[8] = (0x40 ^ 0x45);
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIlIlIIIIIIIlIlIIIl, final BlockPos lllllllllllllIIlIlIIIIIIIlIlIIII, final EnumFacing lllllllllllllIIlIlIIIIIIIlIIllll) {
        return BlockDragonEgg.lIIlllIlIIIIll[2] != 0;
    }
    
    private static boolean llIllIllIlIllII(final int lllllllllllllIIlIlIIIIIIIIllllIl) {
        return lllllllllllllIIlIlIIIIIIIIllllIl == 0;
    }
    
    private static boolean llIllIllIlIllIl(final int lllllllllllllIIlIlIIIIIIIIlllIIl) {
        return lllllllllllllIIlIlIIIIIIIIlllIIl <= 0;
    }
    
    @Override
    public int tickRate(final World lllllllllllllIIlIlIIIIIIIlIlIlIl) {
        return BlockDragonEgg.lIIlllIlIIIIll[8];
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIlIlIIIIIIlIllIlIl, final BlockPos lllllllllllllIIlIlIIIIIIlIllIlII, final IBlockState lllllllllllllIIlIlIIIIIIlIlllIII, final Block lllllllllllllIIlIlIIIIIIlIllIlll) {
        lllllllllllllIIlIlIIIIIIlIllIlIl.scheduleUpdate(lllllllllllllIIlIlIIIIIIlIllIlII, this, this.tickRate(lllllllllllllIIlIlIIIIIIlIllIlIl));
    }
    
    private static boolean llIllIllIlIlIIl(final int lllllllllllllIIlIlIIIIIIIIllllll) {
        return lllllllllllllIIlIlIIIIIIIIllllll != 0;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIlIlIIIIIIlIIIllII, final BlockPos lllllllllllllIIlIlIIIIIIlIIlIlII, final IBlockState lllllllllllllIIlIlIIIIIIlIIlIIll, final EntityPlayer lllllllllllllIIlIlIIIIIIlIIlIIlI, final EnumFacing lllllllllllllIIlIlIIIIIIlIIlIIIl, final float lllllllllllllIIlIlIIIIIIlIIlIIII, final float lllllllllllllIIlIlIIIIIIlIIIllll, final float lllllllllllllIIlIlIIIIIIlIIIlllI) {
        this.teleport(lllllllllllllIIlIlIIIIIIlIIIllII, lllllllllllllIIlIlIIIIIIlIIlIlII);
        return BlockDragonEgg.lIIlllIlIIIIll[2] != 0;
    }
    
    private void checkFall(final World lllllllllllllIIlIlIIIIIIlIlIIIlI, final BlockPos lllllllllllllIIlIlIIIIIIlIIlllII) {
        if (llIllIllIlIlIIl(BlockFalling.canFallInto(lllllllllllllIIlIlIIIIIIlIlIIIlI, lllllllllllllIIlIlIIIIIIlIIlllII.down()) ? 1 : 0) && llIllIllIlIlIlI(lllllllllllllIIlIlIIIIIIlIIlllII.getY())) {
            final int lllllllllllllIIlIlIIIIIIlIlIIIII = BlockDragonEgg.lIIlllIlIIIIll[0];
            if (llIllIllIlIllII(BlockFalling.fallInstantly ? 1 : 0) && llIllIllIlIlIIl(lllllllllllllIIlIlIIIIIIlIlIIIlI.isAreaLoaded(lllllllllllllIIlIlIIIIIIlIIlllII.add(-lllllllllllllIIlIlIIIIIIlIlIIIII, -lllllllllllllIIlIlIIIIIIlIlIIIII, -lllllllllllllIIlIlIIIIIIlIlIIIII), lllllllllllllIIlIlIIIIIIlIIlllII.add(lllllllllllllIIlIlIIIIIIlIlIIIII, lllllllllllllIIlIlIIIIIIlIlIIIII, lllllllllllllIIlIlIIIIIIlIlIIIII)) ? 1 : 0)) {
                lllllllllllllIIlIlIIIIIIlIlIIIlI.spawnEntityInWorld(new EntityFallingBlock(lllllllllllllIIlIlIIIIIIlIlIIIlI, lllllllllllllIIlIlIIIIIIlIIlllII.getX() + 0.5f, lllllllllllllIIlIlIIIIIIlIIlllII.getY(), lllllllllllllIIlIlIIIIIIlIIlllII.getZ() + 0.5f, this.getDefaultState()));
                "".length();
                "".length();
                if (-(0x35 ^ 0x57 ^ (0xD6 ^ 0xB1)) >= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIlIIIIIIlIlIIIlI.setBlockToAir(lllllllllllllIIlIlIIIIIIlIIlllII);
                "".length();
                BlockPos lllllllllllllIIlIlIIIIIIlIIlllll = lllllllllllllIIlIlIIIIIIlIIlllII;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (llIllIllIlIlIIl(BlockFalling.canFallInto(lllllllllllllIIlIlIIIIIIlIlIIIlI, lllllllllllllIIlIlIIIIIIlIIlllll) ? 1 : 0) && !llIllIllIlIllIl(lllllllllllllIIlIlIIIIIIlIIlllll.getY())) {
                    lllllllllllllIIlIlIIIIIIlIIlllll = lllllllllllllIIlIlIIIIIIlIIlllll.down();
                }
                if (llIllIllIlIlllI(lllllllllllllIIlIlIIIIIIlIIlllll.getY())) {
                    lllllllllllllIIlIlIIIIIIlIlIIIlI.setBlockState(lllllllllllllIIlIlIIIIIIlIIlllll, this.getDefaultState(), BlockDragonEgg.lIIlllIlIIIIll[1]);
                    "".length();
                }
            }
        }
    }
    
    private static boolean llIllIllIllIIlI(final int lllllllllllllIIlIlIIIIIIIlIIIllI, final int lllllllllllllIIlIlIIIIIIIlIIIlIl) {
        return lllllllllllllIIlIlIIIIIIIlIIIllI >= lllllllllllllIIlIlIIIIIIIlIIIlIl;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockDragonEgg.lIIlllIlIIIIll[3] != 0;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIlIlIIIIIIllIIIlII, final BlockPos lllllllllllllIIlIlIIIIIIllIIIIll, final IBlockState lllllllllllllIIlIlIIIIIIllIIIIlI) {
        lllllllllllllIIlIlIIIIIIllIIIlII.scheduleUpdate(lllllllllllllIIlIlIIIIIIllIIIIll, this, this.tickRate(lllllllllllllIIlIlIIIIIIllIIIlII));
    }
    
    @Override
    public void updateTick(final World lllllllllllllIIlIlIIIIIIlIlIllll, final BlockPos lllllllllllllIIlIlIIIIIIlIlIlIIl, final IBlockState lllllllllllllIIlIlIIIIIIlIlIllIl, final Random lllllllllllllIIlIlIIIIIIlIlIllII) {
        this.checkFall(lllllllllllllIIlIlIIIIIIlIlIllll, lllllllllllllIIlIlIIIIIIlIlIlIIl);
    }
    
    public BlockDragonEgg() {
        super(Material.dragonEgg, MapColor.blackColor);
        this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }
    
    private static boolean llIllIllIlIlllI(final int lllllllllllllIIlIlIIIIIIIIllIlll) {
        return lllllllllllllIIlIlIIIIIIIIllIlll > 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIlIlIIIIIIIlIIllII, final BlockPos lllllllllllllIIlIlIIIIIIIlIIlIll) {
        return null;
    }
    
    @Override
    public void onBlockClicked(final World lllllllllllllIIlIlIIIIIIlIIIIIlI, final BlockPos lllllllllllllIIlIlIIIIIIlIIIIIIl, final EntityPlayer lllllllllllllIIlIlIIIIIIlIIIIlII) {
        this.teleport(lllllllllllllIIlIlIIIIIIlIIIIIlI, lllllllllllllIIlIlIIIIIIlIIIIIIl);
    }
    
    static {
        llIllIllIlIlIII();
    }
}
