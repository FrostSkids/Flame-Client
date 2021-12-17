// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockDoor;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class ItemDoor extends Item
{
    private /* synthetic */ Block block;
    private static final /* synthetic */ int[] lIlIIIllIllIlI;
    
    public static void placeDoor(final World lllllllllllllIIIllllIIIIlIlIIllI, final BlockPos lllllllllllllIIIllllIIIIlIlIIlIl, final EnumFacing lllllllllllllIIIllllIIIIlIllIIIl, final Block lllllllllllllIIIllllIIIIlIllIIII) {
        final BlockPos lllllllllllllIIIllllIIIIlIlIllll = lllllllllllllIIIllllIIIIlIlIIlIl.offset(lllllllllllllIIIllllIIIIlIllIIIl.rotateY());
        final BlockPos lllllllllllllIIIllllIIIIlIlIlllI = lllllllllllllIIIllllIIIIlIlIIlIl.offset(lllllllllllllIIIllllIIIIlIllIIIl.rotateYCCW());
        int n;
        if (lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIlllI).getBlock().isNormalCube() ? 1 : 0)) {
            n = ItemDoor.lIlIIIllIllIlI[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = ItemDoor.lIlIIIllIllIlI[0];
        }
        int n2;
        if (lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIlllI.up()).getBlock().isNormalCube() ? 1 : 0)) {
            n2 = ItemDoor.lIlIIIllIllIlI[1];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            n2 = ItemDoor.lIlIIIllIllIlI[0];
        }
        final int lllllllllllllIIIllllIIIIlIlIllIl = n + n2;
        int n3;
        if (lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIllll).getBlock().isNormalCube() ? 1 : 0)) {
            n3 = ItemDoor.lIlIIIllIllIlI[1];
            "".length();
            if (-(0x1F ^ 0x1B) >= 0) {
                return;
            }
        }
        else {
            n3 = ItemDoor.lIlIIIllIllIlI[0];
        }
        int n4;
        if (lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIllll.up()).getBlock().isNormalCube() ? 1 : 0)) {
            n4 = ItemDoor.lIlIIIllIllIlI[1];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            n4 = ItemDoor.lIlIIIllIllIlI[0];
        }
        final int lllllllllllllIIIllllIIIIlIlIllII = n3 + n4;
        int n5;
        if (lllIIIlllllIIlI(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIlllI).getBlock(), lllllllllllllIIIllllIIIIlIllIIII) && lllIIIlllllIIlI(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIlllI.up()).getBlock(), lllllllllllllIIIllllIIIIlIllIIII)) {
            n5 = ItemDoor.lIlIIIllIllIlI[0];
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        else {
            n5 = ItemDoor.lIlIIIllIllIlI[1];
        }
        final boolean lllllllllllllIIIllllIIIIlIlIlIll = n5 != 0;
        int n6;
        if (lllIIIlllllIIlI(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIllll).getBlock(), lllllllllllllIIIllllIIIIlIllIIII) && lllIIIlllllIIlI(lllllllllllllIIIllllIIIIlIlIIllI.getBlockState(lllllllllllllIIIllllIIIIlIlIllll.up()).getBlock(), lllllllllllllIIIllllIIIIlIllIIII)) {
            n6 = ItemDoor.lIlIIIllIllIlI[0];
            "".length();
            if ((102 + 21 - 89 + 112 ^ 64 + 124 - 89 + 51) != (165 + 16 - 180 + 183 ^ 12 + 4 + 145 + 27)) {
                return;
            }
        }
        else {
            n6 = ItemDoor.lIlIIIllIllIlI[1];
        }
        final boolean lllllllllllllIIIllllIIIIlIlIlIlI = n6 != 0;
        boolean lllllllllllllIIIllllIIIIlIlIlIIl = ItemDoor.lIlIIIllIllIlI[0] != 0;
        if ((lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIlIll ? 1 : 0) && !lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIlIlI ? 1 : 0)) || lllIIIlllllIlIl(lllllllllllllIIIllllIIIIlIlIllII, lllllllllllllIIIllllIIIIlIlIllIl)) {
            lllllllllllllIIIllllIIIIlIlIlIIl = (ItemDoor.lIlIIIllIllIlI[1] != 0);
        }
        final BlockPos lllllllllllllIIIllllIIIIlIlIlIII = lllllllllllllIIIllllIIIIlIlIIlIl.up();
        final IBlockState withProperty = lllllllllllllIIIllllIIIIlIllIIII.getDefaultState().withProperty((IProperty<Comparable>)BlockDoor.FACING, lllllllllllllIIIllllIIIIlIllIIIl);
        final PropertyEnum<BlockDoor.EnumHingePosition> hinge = BlockDoor.HINGE;
        BlockDoor.EnumHingePosition enumHingePosition;
        if (lllIIIlllllIlII(lllllllllllllIIIllllIIIIlIlIlIIl ? 1 : 0)) {
            enumHingePosition = BlockDoor.EnumHingePosition.RIGHT;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            enumHingePosition = BlockDoor.EnumHingePosition.LEFT;
        }
        final IBlockState lllllllllllllIIIllllIIIIlIlIIlll = withProperty.withProperty((IProperty<Comparable>)hinge, enumHingePosition);
        lllllllllllllIIIllllIIIIlIlIIllI.setBlockState(lllllllllllllIIIllllIIIIlIlIIlIl, lllllllllllllIIIllllIIIIlIlIIlll.withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.LOWER), ItemDoor.lIlIIIllIllIlI[2]);
        "".length();
        lllllllllllllIIIllllIIIIlIlIIllI.setBlockState(lllllllllllllIIIllllIIIIlIlIlIII, lllllllllllllIIIllllIIIIlIlIIlll.withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.UPPER), ItemDoor.lIlIIIllIllIlI[2]);
        "".length();
        lllllllllllllIIIllllIIIIlIlIIllI.notifyNeighborsOfStateChange(lllllllllllllIIIllllIIIIlIlIIlIl, lllllllllllllIIIllllIIIIlIllIIII);
        lllllllllllllIIIllllIIIIlIlIIllI.notifyNeighborsOfStateChange(lllllllllllllIIIllllIIIIlIlIlIII, lllllllllllllIIIllllIIIIlIllIIII);
    }
    
    private static boolean lllIIIlllllIlII(final int lllllllllllllIIIllllIIIIlIIlIIII) {
        return lllllllllllllIIIllllIIIIlIIlIIII != 0;
    }
    
    public ItemDoor(final Block lllllllllllllIIIllllIIIIllIllllI) {
        this.block = lllllllllllllIIIllllIIIIllIllllI;
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    private static boolean lllIIIlllllIlIl(final int lllllllllllllIIIllllIIIIlIIlIlll, final int lllllllllllllIIIllllIIIIlIIlIllI) {
        return lllllllllllllIIIllllIIIIlIIlIlll > lllllllllllllIIIllllIIIIlIIlIllI;
    }
    
    private static boolean lllIIIlllllIIlI(final Object lllllllllllllIIIllllIIIIlIIlIIll, final Object lllllllllllllIIIllllIIIIlIIlIIlI) {
        return lllllllllllllIIIllllIIIIlIIlIIll != lllllllllllllIIIllllIIIIlIIlIIlI;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIIllllIIIIllIlIIlI, final EntityPlayer lllllllllllllIIIllllIIIIllIlIIIl, final World lllllllllllllIIIllllIIIIllIIIlIl, BlockPos lllllllllllllIIIllllIIIIllIIIlII, final EnumFacing lllllllllllllIIIllllIIIIllIIIIll, final float lllllllllllllIIIllllIIIIllIIllIl, final float lllllllllllllIIIllllIIIIllIIllII, final float lllllllllllllIIIllllIIIIllIIlIll) {
        if (lllIIIlllllIIlI(lllllllllllllIIIllllIIIIllIIIIll, EnumFacing.UP)) {
            return ItemDoor.lIlIIIllIllIlI[0] != 0;
        }
        final IBlockState lllllllllllllIIIllllIIIIllIIlIlI = lllllllllllllIIIllllIIIIllIIIlIl.getBlockState(lllllllllllllIIIllllIIIIllIIIlII);
        final Block lllllllllllllIIIllllIIIIllIIlIIl = lllllllllllllIIIllllIIIIllIIlIlI.getBlock();
        if (lllIIIlllllIIll(lllllllllllllIIIllllIIIIllIIlIIl.isReplaceable(lllllllllllllIIIllllIIIIllIIIlIl, lllllllllllllIIIllllIIIIllIIIlII) ? 1 : 0)) {
            lllllllllllllIIIllllIIIIllIIIlII = lllllllllllllIIIllllIIIIllIIIlII.offset(lllllllllllllIIIllllIIIIllIIIIll);
        }
        if (lllIIIlllllIIll(lllllllllllllIIIllllIIIIllIlIIIl.canPlayerEdit(lllllllllllllIIIllllIIIIllIIIlII, lllllllllllllIIIllllIIIIllIIIIll, lllllllllllllIIIllllIIIIllIlIIlI) ? 1 : 0)) {
            return ItemDoor.lIlIIIllIllIlI[0] != 0;
        }
        if (lllIIIlllllIIll(this.block.canPlaceBlockAt(lllllllllllllIIIllllIIIIllIIIlIl, lllllllllllllIIIllllIIIIllIIIlII) ? 1 : 0)) {
            return ItemDoor.lIlIIIllIllIlI[0] != 0;
        }
        placeDoor(lllllllllllllIIIllllIIIIllIIIlIl, lllllllllllllIIIllllIIIIllIIIlII, EnumFacing.fromAngle(lllllllllllllIIIllllIIIIllIlIIIl.rotationYaw), this.block);
        lllllllllllllIIIllllIIIIllIlIIlI.stackSize -= ItemDoor.lIlIIIllIllIlI[1];
        return ItemDoor.lIlIIIllIllIlI[1] != 0;
    }
    
    static {
        lllIIIlllllIIIl();
    }
    
    private static boolean lllIIIlllllIIll(final int lllllllllllllIIIllllIIIIlIIIlllI) {
        return lllllllllllllIIIllllIIIIlIIIlllI == 0;
    }
    
    private static void lllIIIlllllIIIl() {
        (lIlIIIllIllIlI = new int[3])[0] = ((70 + 101 - 6 + 86 ^ 58 + 60 - 98 + 146) & (0x35 ^ 0x21 ^ (0xCC ^ 0x85) ^ -" ".length()));
        ItemDoor.lIlIIIllIllIlI[1] = " ".length();
        ItemDoor.lIlIIIllIllIlI[2] = "  ".length();
    }
}
