// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.stats.StatList;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockDeadBush extends BlockBush
{
    private static final /* synthetic */ int[] lllIlIIlIllllI;
    
    @Override
    public void harvestBlock(final World llllllllllllIlIllIllllIIlIIIlllI, final EntityPlayer llllllllllllIlIllIllllIIlIIIllIl, final BlockPos llllllllllllIlIllIllllIIlIIlIIlI, final IBlockState llllllllllllIlIllIllllIIlIIlIIIl, final TileEntity llllllllllllIlIllIllllIIlIIIlIlI) {
        if (lIlIIIlIIlIIlIll(llllllllllllIlIllIllllIIlIIIlllI.isRemote ? 1 : 0) && lIlIIIlIIlIIllII(llllllllllllIlIllIllllIIlIIIllIl.getCurrentEquippedItem()) && lIlIIIlIIlIIllIl(llllllllllllIlIllIllllIIlIIIllIl.getCurrentEquippedItem().getItem(), Items.shears)) {
            llllllllllllIlIllIllllIIlIIIllIl.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
            Block.spawnAsEntity(llllllllllllIlIllIllllIIlIIIlllI, llllllllllllIlIllIllllIIlIIlIIlI, new ItemStack(Blocks.deadbush, BlockDeadBush.lllIlIIlIllllI[1], BlockDeadBush.lllIlIIlIllllI[0]));
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            super.harvestBlock(llllllllllllIlIllIllllIIlIIIlllI, llllllllllllIlIllIllllIIlIIIllIl, llllllllllllIlIllIllllIIlIIlIIlI, llllllllllllIlIllIllllIIlIIlIIIl, llllllllllllIlIllIllllIIlIIIlIlI);
        }
    }
    
    private static boolean lIlIIIlIIlIIlIlI(final Object llllllllllllIlIllIllllIIlIIIIlll, final Object llllllllllllIlIllIllllIIlIIIIllI) {
        return llllllllllllIlIllIllllIIlIIIIlll != llllllllllllIlIllIllllIIlIIIIllI;
    }
    
    @Override
    public boolean isReplaceable(final World llllllllllllIlIllIllllIIlIlIIIIl, final BlockPos llllllllllllIlIllIllllIIlIlIIIII) {
        return BlockDeadBush.lllIlIIlIllllI[1] != 0;
    }
    
    protected BlockDeadBush() {
        super(Material.vine);
        final float llllllllllllIlIllIllllIIlIlIlIll = 0.4f;
        this.setBlockBounds(0.5f - llllllllllllIlIllIllllIIlIlIlIll, 0.0f, 0.5f - llllllllllllIlIllIllllIIlIlIlIll, 0.5f + llllllllllllIlIllIllllIIlIlIlIll, 0.8f, 0.5f + llllllllllllIlIllIllllIIlIlIlIll);
    }
    
    private static void lIlIIIlIIlIIlIIl() {
        (lllIlIIlIllllI = new int[2])[0] = ((0x14 ^ 0x5F) & ~(0x1C ^ 0x57));
        BlockDeadBush.lllIlIIlIllllI[1] = " ".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIlIllIllllIIlIlIIlll) {
        return MapColor.woodColor;
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block llllllllllllIlIllIllllIIlIlIIIll) {
        if (lIlIIIlIIlIIlIlI(llllllllllllIlIllIllllIIlIlIIIll, Blocks.sand) && lIlIIIlIIlIIlIlI(llllllllllllIlIllIllllIIlIlIIIll, Blocks.hardened_clay) && lIlIIIlIIlIIlIlI(llllllllllllIlIllIllllIIlIlIIIll, Blocks.stained_hardened_clay) && lIlIIIlIIlIIlIlI(llllllllllllIlIllIllllIIlIlIIIll, Blocks.dirt)) {
            return BlockDeadBush.lllIlIIlIllllI[0] != 0;
        }
        return BlockDeadBush.lllIlIIlIllllI[1] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIllIllllIIlIIllllI, final Random llllllllllllIlIllIllllIIlIIlllIl, final int llllllllllllIlIllIllllIIlIIlllII) {
        return null;
    }
    
    private static boolean lIlIIIlIIlIIlIll(final int llllllllllllIlIllIllllIIIllllllI) {
        return llllllllllllIlIllIllllIIIllllllI == 0;
    }
    
    private static boolean lIlIIIlIIlIIllII(final Object llllllllllllIlIllIllllIIlIIIIlII) {
        return llllllllllllIlIllIllllIIlIIIIlII != null;
    }
    
    static {
        lIlIIIlIIlIIlIIl();
    }
    
    private static boolean lIlIIIlIIlIIllIl(final Object llllllllllllIlIllIllllIIlIIIIIIl, final Object llllllllllllIlIllIllllIIlIIIIIII) {
        return llllllllllllIlIllIllllIIlIIIIIIl == llllllllllllIlIllIllllIIlIIIIIII;
    }
}
