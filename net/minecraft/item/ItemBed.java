// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockBed;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBed extends Item
{
    private static final /* synthetic */ int[] llIlIIllIllIIl;
    
    private static boolean lIIlIIlIllllllII(final int llllllllllllIllIlIllllIllIIlllIl) {
        return llllllllllllIllIlIllllIllIIlllIl != 0;
    }
    
    private static boolean lIIlIIlIlllllllI(final int llllllllllllIllIlIllllIllIIllIll) {
        return llllllllllllIllIlIllllIllIIllIll == 0;
    }
    
    public ItemBed() {
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static void lIIlIIlIlllllIll() {
        (llIlIIllIllIIl = new int[3])[0] = " ".length();
        ItemBed.llIlIIllIllIIl[1] = ((48 + 80 - 105 + 136 ^ 79 + 25 + 10 + 16) & (61 + 32 - 36 + 133 ^ 107 + 61 - 74 + 69 ^ -" ".length()));
        ItemBed.llIlIIllIllIIl[2] = "   ".length();
    }
    
    private static boolean lIIlIIlIllllllIl(final Object llllllllllllIllIlIllllIllIlIIIlI, final Object llllllllllllIllIlIllllIllIlIIIII) {
        return llllllllllllIllIlIllllIllIlIIIlI != llllllllllllIllIlIllllIllIlIIIII;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIlIllllIllllIIIll, final EntityPlayer llllllllllllIllIlIllllIlllIIIllI, final World llllllllllllIllIlIllllIlllIIIlII, BlockPos llllllllllllIllIlIllllIlllIIIIlI, final EnumFacing llllllllllllIllIlIllllIlllIIIIII, final float llllllllllllIllIlIllllIlllIllIlI, final float llllllllllllIllIlIllllIlllIllIII, final float llllllllllllIllIlIllllIlllIlIllI) {
        if (lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIIlII.isRemote ? 1 : 0)) {
            return ItemBed.llIlIIllIllIIl[0] != 0;
        }
        if (lIIlIIlIllllllIl(llllllllllllIllIlIllllIlllIIIIII, EnumFacing.UP)) {
            return ItemBed.llIlIIllIllIIl[1] != 0;
        }
        final IBlockState llllllllllllIllIlIllllIlllIlIlII = llllllllllllIllIlIllllIlllIIIlII.getBlockState((BlockPos)llllllllllllIllIlIllllIlllIIIIlI);
        final Block llllllllllllIllIlIllllIlllIlIIlI = llllllllllllIllIlIllllIlllIlIlII.getBlock();
        final boolean llllllllllllIllIlIllllIlllIlIIIl = llllllllllllIllIlIllllIlllIlIIlI.isReplaceable(llllllllllllIllIlIllllIlllIIIlII, (BlockPos)llllllllllllIllIlIllllIlllIIIIlI);
        if (lIIlIIlIlllllllI(llllllllllllIllIlIllllIlllIlIIIl ? 1 : 0)) {
            llllllllllllIllIlIllllIlllIIIIlI = ((BlockPos)llllllllllllIllIlIllllIlllIIIIlI).up();
        }
        final int llllllllllllIllIlIllllIlllIlIIII = MathHelper.floor_double(llllllllllllIllIlIllllIlllIIIllI.rotationYaw * 4.0f / 360.0f + 0.5) & ItemBed.llIlIIllIllIIl[2];
        final EnumFacing llllllllllllIllIlIllllIlllIIllll = EnumFacing.getHorizontal(llllllllllllIllIlIllllIlllIlIIII);
        final BlockPos llllllllllllIllIlIllllIlllIIlllI = ((BlockPos)llllllllllllIllIlIllllIlllIIIIlI).offset(llllllllllllIllIlIllllIlllIIllll);
        if (!lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIIllI.canPlayerEdit((BlockPos)llllllllllllIllIlIllllIlllIIIIlI, llllllllllllIllIlIllllIlllIIIIII, llllllllllllIllIlIllllIllllIIIll) ? 1 : 0) || !lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIIllI.canPlayerEdit(llllllllllllIllIlIllllIlllIIlllI, llllllllllllIllIlIllllIlllIIIIII, llllllllllllIllIlIllllIllllIIIll) ? 1 : 0)) {
            return ItemBed.llIlIIllIllIIl[1] != 0;
        }
        final boolean llllllllllllIllIlIllllIlllIIllIl = llllllllllllIllIlIllllIlllIIIlII.getBlockState(llllllllllllIllIlIllllIlllIIlllI).getBlock().isReplaceable(llllllllllllIllIlIllllIlllIIIlII, llllllllllllIllIlIllllIlllIIlllI);
        int n;
        if (lIIlIIlIlllllllI(llllllllllllIllIlIllllIlllIlIIIl ? 1 : 0) && lIIlIIlIlllllllI(llllllllllllIllIlIllllIlllIIIlII.isAirBlock((BlockPos)llllllllllllIllIlIllllIlllIIIIlI) ? 1 : 0)) {
            n = ItemBed.llIlIIllIllIIl[1];
            "".length();
            if (null != null) {
                return ((0x9 ^ 0x5B ^ (0x73 ^ 0x79)) & (0xDE ^ 0x8F ^ (0x5 ^ 0xC) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ItemBed.llIlIIllIllIIl[0];
        }
        final boolean llllllllllllIllIlIllllIlllIIllII = n != 0;
        int n2;
        if (lIIlIIlIlllllllI(llllllllllllIllIlIllllIlllIIllIl ? 1 : 0) && lIIlIIlIlllllllI(llllllllllllIllIlIllllIlllIIIlII.isAirBlock(llllllllllllIllIlIllllIlllIIlllI) ? 1 : 0)) {
            n2 = ItemBed.llIlIIllIllIIl[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x5 ^ 0x4A) & ~(0x50 ^ 0x1F)) != 0x0;
            }
        }
        else {
            n2 = ItemBed.llIlIIllIllIIl[0];
        }
        final boolean llllllllllllIllIlIllllIlllIIlIll = n2 != 0;
        if (lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIllII ? 1 : 0) && lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIlIll ? 1 : 0) && lIIlIIlIllllllII(World.doesBlockHaveSolidTopSurface(llllllllllllIllIlIllllIlllIIIlII, ((BlockPos)llllllllllllIllIlIllllIlllIIIIlI).down()) ? 1 : 0) && lIIlIIlIllllllII(World.doesBlockHaveSolidTopSurface(llllllllllllIllIlIllllIlllIIIlII, llllllllllllIllIlIllllIlllIIlllI.down()) ? 1 : 0)) {
            final IBlockState llllllllllllIllIlIllllIlllIIlIlI = Blocks.bed.getDefaultState().withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, (boolean)(ItemBed.llIlIIllIllIIl[1] != 0)).withProperty((IProperty<Comparable>)BlockBed.FACING, llllllllllllIllIlIllllIlllIIllll).withProperty(BlockBed.PART, BlockBed.EnumPartType.FOOT);
            if (lIIlIIlIllllllII(llllllllllllIllIlIllllIlllIIIlII.setBlockState((BlockPos)llllllllllllIllIlIllllIlllIIIIlI, llllllllllllIllIlIllllIlllIIlIlI, ItemBed.llIlIIllIllIIl[2]) ? 1 : 0)) {
                final IBlockState llllllllllllIllIlIllllIlllIIlIII = llllllllllllIllIlIllllIlllIIlIlI.withProperty(BlockBed.PART, BlockBed.EnumPartType.HEAD);
                llllllllllllIllIlIllllIlllIIIlII.setBlockState(llllllllllllIllIlIllllIlllIIlllI, llllllllllllIllIlIllllIlllIIlIII, ItemBed.llIlIIllIllIIl[2]);
                "".length();
            }
            llllllllllllIllIlIllllIllllIIIll.stackSize -= ItemBed.llIlIIllIllIIl[0];
            return ItemBed.llIlIIllIllIIl[0] != 0;
        }
        return ItemBed.llIlIIllIllIIl[1] != 0;
    }
    
    static {
        lIIlIIlIlllllIll();
    }
}
