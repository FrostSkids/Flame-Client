// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.block.BlockWallSign;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;

public class ItemSign extends Item
{
    private static final /* synthetic */ int[] llIIIlIlIIlIlI;
    
    public ItemSign() {
        this.maxStackSize = ItemSign.llIIIlIlIIlIlI[0];
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static void lIIIlIIlIlIIIIIl() {
        (llIIIlIlIIlIlI = new int[5])[0] = (0xE1 ^ 0xA4 ^ (0x39 ^ 0x6C));
        ItemSign.llIIIlIlIIlIlI[1] = ((0xF7 ^ 0xC7) & ~(0x40 ^ 0x70));
        ItemSign.llIIIlIlIIlIlI[2] = " ".length();
        ItemSign.llIIIlIlIIlIlI[3] = (0x6A ^ 0x16 ^ (0xDC ^ 0xAF));
        ItemSign.llIIIlIlIIlIlI[4] = "   ".length();
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlllIlIlllIlIIIIIIIl, final EntityPlayer llllllllllllIlllIlIlllIlIIIIIIII, final World llllllllllllIlllIlIlllIIllllIlIl, BlockPos llllllllllllIlllIlIlllIIlllllllI, final EnumFacing llllllllllllIlllIlIlllIIllllllIl, final float llllllllllllIlllIlIlllIIllllllII, final float llllllllllllIlllIlIlllIIlllllIll, final float llllllllllllIlllIlIlllIIlllllIlI) {
        if (lIIIlIIlIlIIIIlI(llllllllllllIlllIlIlllIIllllllIl, EnumFacing.DOWN)) {
            return ItemSign.llIIIlIlIIlIlI[1] != 0;
        }
        if (lIIIlIIlIlIIIIll(llllllllllllIlllIlIlllIIllllIlIl.getBlockState(llllllllllllIlllIlIlllIIlllllllI).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            return ItemSign.llIIIlIlIIlIlI[1] != 0;
        }
        llllllllllllIlllIlIlllIIlllllllI = llllllllllllIlllIlIlllIIlllllllI.offset(llllllllllllIlllIlIlllIIllllllIl);
        if (lIIIlIIlIlIIIIll(llllllllllllIlllIlIlllIlIIIIIIII.canPlayerEdit(llllllllllllIlllIlIlllIIlllllllI, llllllllllllIlllIlIlllIIllllllIl, llllllllllllIlllIlIlllIlIIIIIIIl) ? 1 : 0)) {
            return ItemSign.llIIIlIlIIlIlI[1] != 0;
        }
        if (lIIIlIIlIlIIIIll(Blocks.standing_sign.canPlaceBlockAt(llllllllllllIlllIlIlllIIllllIlIl, llllllllllllIlllIlIlllIIlllllllI) ? 1 : 0)) {
            return ItemSign.llIIIlIlIIlIlI[1] != 0;
        }
        if (lIIIlIIlIlIIIlII(llllllllllllIlllIlIlllIIllllIlIl.isRemote ? 1 : 0)) {
            return ItemSign.llIIIlIlIIlIlI[2] != 0;
        }
        if (lIIIlIIlIlIIIIlI(llllllllllllIlllIlIlllIIllllllIl, EnumFacing.UP)) {
            final int llllllllllllIlllIlIlllIIlllllIIl = MathHelper.floor_double((llllllllllllIlllIlIlllIlIIIIIIII.rotationYaw + 180.0f) * 16.0f / 360.0f + 0.5) & ItemSign.llIIIlIlIIlIlI[3];
            llllllllllllIlllIlIlllIIllllIlIl.setBlockState(llllllllllllIlllIlIlllIIlllllllI, Blocks.standing_sign.getDefaultState().withProperty((IProperty<Comparable>)BlockStandingSign.ROTATION, llllllllllllIlllIlIlllIIlllllIIl), ItemSign.llIIIlIlIIlIlI[4]);
            "".length();
            "".length();
            if (((104 + 53 - 74 + 47 ^ 83 + 133 - 46 + 16) & (20 + 25 - 3 + 85 ^ (0xC5 ^ 0x82) ^ -" ".length())) != 0x0) {
                return ((0x8 ^ 0x7E ^ (0x78 ^ 0x19)) & (0x16 ^ 0x0 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIlllIlIlllIIllllIlIl.setBlockState(llllllllllllIlllIlIlllIIlllllllI, Blocks.wall_sign.getDefaultState().withProperty((IProperty<Comparable>)BlockWallSign.FACING, llllllllllllIlllIlIlllIIllllllIl), ItemSign.llIIIlIlIIlIlI[4]);
            "".length();
        }
        llllllllllllIlllIlIlllIlIIIIIIIl.stackSize -= ItemSign.llIIIlIlIIlIlI[2];
        final TileEntity llllllllllllIlllIlIlllIIlllllIII = llllllllllllIlllIlIlllIIllllIlIl.getTileEntity(llllllllllllIlllIlIlllIIlllllllI);
        if (lIIIlIIlIlIIIlII((llllllllllllIlllIlIlllIIlllllIII instanceof TileEntitySign) ? 1 : 0) && lIIIlIIlIlIIIIll(ItemBlock.setTileEntityNBT(llllllllllllIlllIlIlllIIllllIlIl, llllllllllllIlllIlIlllIlIIIIIIII, llllllllllllIlllIlIlllIIlllllllI, llllllllllllIlllIlIlllIlIIIIIIIl) ? 1 : 0)) {
            llllllllllllIlllIlIlllIlIIIIIIII.openEditSign((TileEntitySign)llllllllllllIlllIlIlllIIlllllIII);
        }
        return ItemSign.llIIIlIlIIlIlI[2] != 0;
    }
    
    static {
        lIIIlIIlIlIIIIIl();
    }
    
    private static boolean lIIIlIIlIlIIIIll(final int llllllllllllIlllIlIlllIIlllIIlll) {
        return llllllllllllIlllIlIlllIIlllIIlll == 0;
    }
    
    private static boolean lIIIlIIlIlIIIlII(final int llllllllllllIlllIlIlllIIlllIlIlI) {
        return llllllllllllIlllIlIlllIIlllIlIlI != 0;
    }
    
    private static boolean lIIIlIIlIlIIIIlI(final Object llllllllllllIlllIlIlllIIlllIlllI, final Object llllllllllllIlllIlIlllIIlllIllIl) {
        return llllllllllllIlllIlIlllIIlllIlllI == llllllllllllIlllIlIlllIIlllIllIl;
    }
}
