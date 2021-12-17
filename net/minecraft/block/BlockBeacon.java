// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatList;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.world.WorldServer;
import net.minecraft.init.Blocks;
import net.minecraft.util.HttpUtil;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockBeacon extends BlockContainer
{
    private static final /* synthetic */ int[] llIlIlIlIlIlII;
    
    public static void updateColorAsync(final World llllllllllllIllIlIlIIlIIlllIIIII, final BlockPos llllllllllllIllIlIlIIlIIllIlllll) {
        HttpUtil.field_180193_a.submit((Runnable)new Runnable() {
            private static final /* synthetic */ int[] lllIIlIIlIlIll;
            
            private static boolean lIIlllllIIlllIIl(final int llllllllllllIlIllllIlllIIIlIlIII) {
                return llllllllllllIlIllllIlllIIIlIlIII < 0;
            }
            
            static {
                lIIlllllIIllIllI();
            }
            
            private static void lIIlllllIIllIllI() {
                (lllIIlIIlIlIll = new int[1])[0] = " ".length();
            }
            
            private static boolean lIIlllllIIlllIII(final Object llllllllllllIlIllllIlllIIIlIllIl, final Object llllllllllllIlIllllIlllIIIlIllII) {
                return llllllllllllIlIllllIlllIIIlIllIl == llllllllllllIlIllllIlllIIIlIllII;
            }
            
            @Override
            public void run() {
                final Chunk llllllllllllIlIllllIlllIIIlllIII = llllllllllllIllIlIlIIlIIlllIIIII.getChunkFromBlockCoords(llllllllllllIllIlIlIIlIIllIlllll);
                int llllllllllllIlIllllIlllIIIllIlll = llllllllllllIllIlIlIIlIIllIlllll.getY() - BlockBeacon$1.lllIIlIIlIlIll[0];
                "".length();
                if ((63 + 131 - 48 + 44 ^ 97 + 103 - 119 + 105) != (0x20 ^ 0x41 ^ (0xC8 ^ 0xAD))) {
                    return;
                }
                while (!lIIlllllIIlllIIl(llllllllllllIlIllllIlllIIIllIlll)) {
                    final BlockPos llllllllllllIlIllllIlllIIIllIllI = new BlockPos(llllllllllllIllIlIlIIlIIllIlllll.getX(), llllllllllllIlIllllIlllIIIllIlll, llllllllllllIllIlIlIIlIIllIlllll.getZ());
                    if (lIIlllllIIllIlll(llllllllllllIlIllllIlllIIIlllIII.canSeeSky(llllllllllllIlIllllIlllIIIllIllI) ? 1 : 0)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        final IBlockState llllllllllllIlIllllIlllIIIllIlIl = llllllllllllIllIlIlIIlIIlllIIIII.getBlockState(llllllllllllIlIllllIlllIIIllIllI);
                        if (lIIlllllIIlllIII(llllllllllllIlIllllIlllIIIllIlIl.getBlock(), Blocks.beacon)) {
                            ((WorldServer)llllllllllllIllIlIlIIlIIlllIIIII).addScheduledTask(new Runnable() {
                                private static final /* synthetic */ int[] lllllIIIIlllI;
                                
                                private static boolean lIlIllIIllIIlIl(final int lllllllllllllIlIllIIIlIIlIIlIlIl) {
                                    return lllllllllllllIlIllIIIlIIlIIlIlIl != 0;
                                }
                                
                                @Override
                                public void run() {
                                    final TileEntity lllllllllllllIlIllIIIlIIlIIllIIl = llllllllllllIllIlIlIIlIIlllIIIII.getTileEntity(llllllllllllIlIllllIlllIIIllIllI);
                                    if (lIlIllIIllIIlIl((lllllllllllllIlIllIIIlIIlIIllIIl instanceof TileEntityBeacon) ? 1 : 0)) {
                                        ((TileEntityBeacon)lllllllllllllIlIllIIIlIIlIIllIIl).updateBeacon();
                                        llllllllllllIllIlIlIIlIIlllIIIII.addBlockEvent(llllllllllllIlIllllIlllIIIllIllI, Blocks.beacon, BlockBeacon$1$1.lllllIIIIlllI[0], BlockBeacon$1$1.lllllIIIIlllI[1]);
                                    }
                                }
                                
                                static {
                                    lIlIllIIllIIIll();
                                }
                                
                                private static void lIlIllIIllIIIll() {
                                    (lllllIIIIlllI = new int[2])[0] = " ".length();
                                    BlockBeacon$1$1.lllllIIIIlllI[1] = ((72 + 122 - 21 + 74 ^ 32 + 38 - 37 + 131) & (61 + 149 + 27 + 12 ^ 151 + 114 - 220 + 125 ^ -" ".length()));
                                }
                            });
                            "".length();
                        }
                        --llllllllllllIlIllllIlllIIIllIlll;
                    }
                }
            }
            
            private static boolean lIIlllllIIllIlll(final int llllllllllllIlIllllIlllIIIlIlIlI) {
                return llllllllllllIlIllllIlllIIIlIlIlI == 0;
            }
        });
        "".length();
    }
    
    private static void lIIlIlIIIllIIlll() {
        (llIlIlIlIlIlII = new int[3])[0] = " ".length();
        BlockBeacon.llIlIlIlIlIlII[1] = ((0x3 ^ 0x5C) & ~(0x75 ^ 0x2A));
        BlockBeacon.llIlIlIlIlIlII[2] = "   ".length();
    }
    
    static {
        lIIlIlIIIllIIlll();
    }
    
    private static boolean lIIlIlIIIllIlIII(final int llllllllllllIllIlIlIIlIIllIlllIl) {
        return llllllllllllIllIlIlIIlIIllIlllIl != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBeacon.llIlIlIlIlIlII[1] != 0;
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIlIlIIlIlIIIllIII, final BlockPos llllllllllllIllIlIlIIlIlIIIIlllI, final IBlockState llllllllllllIllIlIlIIlIlIIIlIllI, final EntityPlayer llllllllllllIllIlIlIIlIlIIIIllIl, final EnumFacing llllllllllllIllIlIlIIlIlIIIlIlII, final float llllllllllllIllIlIlIIlIlIIIlIIll, final float llllllllllllIllIlIlIIlIlIIIlIIlI, final float llllllllllllIllIlIlIIlIlIIIlIIIl) {
        if (lIIlIlIIIllIlIII(llllllllllllIllIlIlIIlIlIIIllIII.isRemote ? 1 : 0)) {
            return BlockBeacon.llIlIlIlIlIlII[0] != 0;
        }
        final TileEntity llllllllllllIllIlIlIIlIlIIIlIIII = llllllllllllIllIlIlIIlIlIIIllIII.getTileEntity(llllllllllllIllIlIlIIlIlIIIIlllI);
        if (lIIlIlIIIllIlIII((llllllllllllIllIlIlIIlIlIIIlIIII instanceof TileEntityBeacon) ? 1 : 0)) {
            llllllllllllIllIlIlIIlIlIIIIllIl.displayGUIChest((IInventory)llllllllllllIllIlIlIIlIlIIIlIIII);
            llllllllllllIllIlIlIIlIlIIIIllIl.triggerAchievement(StatList.field_181730_N);
        }
        return BlockBeacon.llIlIlIlIlIlII[0] != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBeacon.llIlIlIlIlIlII[1] != 0;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIlIlIIlIlIIIlllll, final int llllllllllllIllIlIlIIlIlIIIllllI) {
        return new TileEntityBeacon();
    }
    
    @Override
    public int getRenderType() {
        return BlockBeacon.llIlIlIlIlIlII[2];
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIllIlIlIIlIlIIIIIIII, final BlockPos llllllllllllIllIlIlIIlIIllllllll, final IBlockState llllllllllllIllIlIlIIlIIlllllllI, final EntityLivingBase llllllllllllIllIlIlIIlIIllllIllI, final ItemStack llllllllllllIllIlIlIIlIIllllllII) {
        super.onBlockPlacedBy(llllllllllllIllIlIlIIlIlIIIIIIII, llllllllllllIllIlIlIIlIIllllllll, llllllllllllIllIlIlIIlIIlllllllI, llllllllllllIllIlIlIIlIIllllIllI, llllllllllllIllIlIlIIlIIllllllII);
        if (lIIlIlIIIllIlIII(llllllllllllIllIlIlIIlIIllllllII.hasDisplayName() ? 1 : 0)) {
            final TileEntity llllllllllllIllIlIlIIlIIlllllIll = llllllllllllIllIlIlIIlIlIIIIIIII.getTileEntity(llllllllllllIllIlIlIIlIIllllllll);
            if (lIIlIlIIIllIlIII((llllllllllllIllIlIlIIlIIlllllIll instanceof TileEntityBeacon) ? 1 : 0)) {
                ((TileEntityBeacon)llllllllllllIllIlIlIIlIIlllllIll).setName(llllllllllllIllIlIlIIlIIllllllII.getDisplayName());
            }
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIlIlIIlIIlllIlIII, final BlockPos llllllllllllIllIlIlIIlIIlllIllIl, final IBlockState llllllllllllIllIlIlIIlIIlllIllII, final Block llllllllllllIllIlIlIIlIIlllIlIll) {
        final TileEntity llllllllllllIllIlIlIIlIIlllIlIlI = llllllllllllIllIlIlIIlIIlllIlIII.getTileEntity(llllllllllllIllIlIlIIlIIlllIllIl);
        if (lIIlIlIIIllIlIII((llllllllllllIllIlIlIIlIIlllIlIlI instanceof TileEntityBeacon) ? 1 : 0)) {
            ((TileEntityBeacon)llllllllllllIllIlIlIIlIIlllIlIlI).updateBeacon();
            llllllllllllIllIlIlIIlIIlllIlIII.addBlockEvent(llllllllllllIllIlIlIIlIIlllIllIl, this, BlockBeacon.llIlIlIlIlIlII[0], BlockBeacon.llIlIlIlIlIlII[1]);
        }
    }
    
    public BlockBeacon() {
        super(Material.glass, MapColor.diamondColor);
        this.setHardness(3.0f);
        "".length();
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
}
