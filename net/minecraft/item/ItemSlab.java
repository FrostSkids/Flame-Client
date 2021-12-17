// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.BlockSlab;

public class ItemSlab extends ItemBlock
{
    private static final /* synthetic */ int[] lIIIlllllIlIII;
    private final /* synthetic */ BlockSlab doubleSlab;
    private final /* synthetic */ BlockSlab singleSlab;
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIllllIIIllIIIIlIlI, final EntityPlayer lllllllllllllIIllllIIIllIIIllIII, final World lllllllllllllIIllllIIIllIIIlIlll, final BlockPos lllllllllllllIIllllIIIllIIIlIllI, final EnumFacing lllllllllllllIIllllIIIllIIIIIllI, final float lllllllllllllIIllllIIIllIIIIIlIl, final float lllllllllllllIIllllIIIllIIIIIlII, final float lllllllllllllIIllllIIIllIIIlIIlI) {
        if (llIIlIIIIlllIIl(lllllllllllllIIllllIIIllIIIIlIlI.stackSize)) {
            return ItemSlab.lIIIlllllIlIII[0] != 0;
        }
        if (llIIlIIIIlllIIl(lllllllllllllIIllllIIIllIIIllIII.canPlayerEdit(lllllllllllllIIllllIIIllIIIlIllI.offset(lllllllllllllIIllllIIIllIIIIIllI), lllllllllllllIIllllIIIllIIIIIllI, lllllllllllllIIllllIIIllIIIIlIlI) ? 1 : 0)) {
            return ItemSlab.lIIIlllllIlIII[0] != 0;
        }
        final Object lllllllllllllIIllllIIIllIIIlIIIl = this.singleSlab.getVariant(lllllllllllllIIllllIIIllIIIIlIlI);
        final IBlockState lllllllllllllIIllllIIIllIIIlIIII = lllllllllllllIIllllIIIllIIIlIlll.getBlockState(lllllllllllllIIllllIIIllIIIlIllI);
        if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIllIIIlIIII.getBlock(), this.singleSlab)) {
            final IProperty lllllllllllllIIllllIIIllIIIIllll = this.singleSlab.getVariantProperty();
            final Comparable lllllllllllllIIllllIIIllIIIIlllI = lllllllllllllIIllllIIIllIIIlIIII.getValue((IProperty<Comparable>)lllllllllllllIIllllIIIllIIIIllll);
            final BlockSlab.EnumBlockHalf lllllllllllllIIllllIIIllIIIIllIl = lllllllllllllIIllllIIIllIIIlIIII.getValue(BlockSlab.HALF);
            if (((llIIlIIIIlllIlI(lllllllllllllIIllllIIIllIIIIIllI, EnumFacing.UP) && !llIIlIIIIlllIll(lllllllllllllIIllllIIIllIIIIllIl, BlockSlab.EnumBlockHalf.BOTTOM)) || (llIIlIIIIlllIlI(lllllllllllllIIllllIIIllIIIIIllI, EnumFacing.DOWN) && llIIlIIIIlllIlI(lllllllllllllIIllllIIIllIIIIllIl, BlockSlab.EnumBlockHalf.TOP))) && llIIlIIIIlllIlI(lllllllllllllIIllllIIIllIIIIlllI, lllllllllllllIIllllIIIllIIIlIIIl)) {
                final IBlockState lllllllllllllIIllllIIIllIIIIllII = this.doubleSlab.getDefaultState().withProperty((IProperty<Comparable>)lllllllllllllIIllllIIIllIIIIllll, lllllllllllllIIllllIIIllIIIIlllI);
                if (llIIlIIIIllllII(lllllllllllllIIllllIIIllIIIlIlll.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBox(lllllllllllllIIllllIIIllIIIlIlll, lllllllllllllIIllllIIIllIIIlIllI, lllllllllllllIIllllIIIllIIIIllII)) ? 1 : 0) && llIIlIIIIllllII(lllllllllllllIIllllIIIllIIIlIlll.setBlockState(lllllllllllllIIllllIIIllIIIlIllI, lllllllllllllIIllllIIIllIIIIllII, ItemSlab.lIIIlllllIlIII[2]) ? 1 : 0)) {
                    lllllllllllllIIllllIIIllIIIlIlll.playSoundEffect(lllllllllllllIIllllIIIllIIIlIllI.getX() + 0.5f, lllllllllllllIIllllIIIllIIIlIllI.getY() + 0.5f, lllllllllllllIIllllIIIllIIIlIllI.getZ() + 0.5f, this.doubleSlab.stepSound.getPlaceSound(), (this.doubleSlab.stepSound.getVolume() + 1.0f) / 2.0f, this.doubleSlab.stepSound.getFrequency() * 0.8f);
                    lllllllllllllIIllllIIIllIIIIlIlI.stackSize -= ItemSlab.lIIIlllllIlIII[1];
                }
                return ItemSlab.lIIIlllllIlIII[1] != 0;
            }
        }
        int onItemUse;
        if (llIIlIIIIllllII(this.tryPlace(lllllllllllllIIllllIIIllIIIIlIlI, lllllllllllllIIllllIIIllIIIlIlll, lllllllllllllIIllllIIIllIIIlIllI.offset(lllllllllllllIIllllIIIllIIIIIllI), lllllllllllllIIllllIIIllIIIlIIIl) ? 1 : 0)) {
            onItemUse = ItemSlab.lIIIlllllIlIII[1];
            "".length();
            if (-" ".length() >= (0x58 ^ 0x5C)) {
                return ((0x30 ^ 0x23) & ~(0x2 ^ 0x11)) != 0x0;
            }
        }
        else {
            onItemUse = (super.onItemUse(lllllllllllllIIllllIIIllIIIIlIlI, lllllllllllllIIllllIIIllIIIllIII, lllllllllllllIIllllIIIllIIIlIlll, lllllllllllllIIllllIIIllIIIlIllI, lllllllllllllIIllllIIIllIIIIIllI, lllllllllllllIIllllIIIllIIIIIlIl, lllllllllllllIIllllIIIllIIIIIlII, lllllllllllllIIllllIIIllIIIlIIlI) ? 1 : 0);
        }
        return onItemUse != 0;
    }
    
    private static boolean llIIlIIIIlllIIl(final int lllllllllllllIIllllIIIlIlIllIlll) {
        return lllllllllllllIIllllIIIlIlIllIlll == 0;
    }
    
    public ItemSlab(final Block lllllllllllllIIllllIIIllIIllIllI, final BlockSlab lllllllllllllIIllllIIIllIIlllIIl, final BlockSlab lllllllllllllIIllllIIIllIIllIlII) {
        super(lllllllllllllIIllllIIIllIIllIllI);
        this.singleSlab = lllllllllllllIIllllIIIllIIlllIIl;
        this.doubleSlab = lllllllllllllIIllllIIIllIIllIlII;
        this.setMaxDamage(ItemSlab.lIIIlllllIlIII[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemSlab.lIIIlllllIlIII[1] != 0));
        "".length();
    }
    
    private boolean tryPlace(final ItemStack lllllllllllllIIllllIIIlIllIlIIIl, final World lllllllllllllIIllllIIIlIllIlIIII, final BlockPos lllllllllllllIIllllIIIlIllIIIlll, final Object lllllllllllllIIllllIIIlIllIIlllI) {
        final IBlockState lllllllllllllIIllllIIIlIllIIllIl = lllllllllllllIIllllIIIlIllIlIIII.getBlockState(lllllllllllllIIllllIIIlIllIIIlll);
        if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIllIIllIl.getBlock(), this.singleSlab)) {
            final Comparable lllllllllllllIIllllIIIlIllIIllII = (Comparable)lllllllllllllIIllllIIIlIllIIllIl.getValue(this.singleSlab.getVariantProperty());
            if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIllIIllII, lllllllllllllIIllllIIIlIllIIlllI)) {
                final IBlockState lllllllllllllIIllllIIIlIllIIlIll = this.doubleSlab.getDefaultState().withProperty(this.singleSlab.getVariantProperty(), lllllllllllllIIllllIIIlIllIIllII);
                if (llIIlIIIIllllII(lllllllllllllIIllllIIIlIllIlIIII.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBox(lllllllllllllIIllllIIIlIllIlIIII, lllllllllllllIIllllIIIlIllIIIlll, lllllllllllllIIllllIIIlIllIIlIll)) ? 1 : 0) && llIIlIIIIllllII(lllllllllllllIIllllIIIlIllIlIIII.setBlockState(lllllllllllllIIllllIIIlIllIIIlll, lllllllllllllIIllllIIIlIllIIlIll, ItemSlab.lIIIlllllIlIII[2]) ? 1 : 0)) {
                    lllllllllllllIIllllIIIlIllIlIIII.playSoundEffect(lllllllllllllIIllllIIIlIllIIIlll.getX() + 0.5f, lllllllllllllIIllllIIIlIllIIIlll.getY() + 0.5f, lllllllllllllIIllllIIIlIllIIIlll.getZ() + 0.5f, this.doubleSlab.stepSound.getPlaceSound(), (this.doubleSlab.stepSound.getVolume() + 1.0f) / 2.0f, this.doubleSlab.stepSound.getFrequency() * 0.8f);
                    lllllllllllllIIllllIIIlIllIlIIIl.stackSize -= ItemSlab.lIIIlllllIlIII[1];
                }
                return ItemSlab.lIIIlllllIlIII[1] != 0;
            }
        }
        return ItemSlab.lIIIlllllIlIII[0] != 0;
    }
    
    static {
        llIIlIIIIlllIII();
    }
    
    private static boolean llIIlIIIIlllIlI(final Object lllllllllllllIIllllIIIlIlIllllII, final Object lllllllllllllIIllllIIIlIlIlllIll) {
        return lllllllllllllIIllllIIIlIlIllllII == lllllllllllllIIllllIIIlIlIlllIll;
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIIllllIIIlIllllIIII, BlockPos lllllllllllllIIllllIIIlIlllIIIll, final EnumFacing lllllllllllllIIllllIIIlIlllIlllI, final EntityPlayer lllllllllllllIIllllIIIlIlllIllIl, final ItemStack lllllllllllllIIllllIIIlIlllIllII) {
        final BlockPos lllllllllllllIIllllIIIlIlllIlIll = lllllllllllllIIllllIIIlIlllIIIll;
        final IProperty lllllllllllllIIllllIIIlIlllIlIlI = this.singleSlab.getVariantProperty();
        final Object lllllllllllllIIllllIIIlIlllIlIIl = this.singleSlab.getVariant(lllllllllllllIIllllIIIlIlllIllII);
        final IBlockState lllllllllllllIIllllIIIlIlllIlIII = lllllllllllllIIllllIIIlIllllIIII.getBlockState(lllllllllllllIIllllIIIlIlllIIIll);
        if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlIII.getBlock(), this.singleSlab)) {
            int n;
            if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlIII.getValue(BlockSlab.HALF), BlockSlab.EnumBlockHalf.TOP)) {
                n = ItemSlab.lIIIlllllIlIII[1];
                "".length();
                if (((0x3 ^ 0x38) & ~(0x7E ^ 0x45)) != ((0x94 ^ 0x88) & ~(0x77 ^ 0x6B))) {
                    return ((0x43 ^ 0x4B) & ~(0xB3 ^ 0xBB)) != 0x0;
                }
            }
            else {
                n = ItemSlab.lIIIlllllIlIII[0];
            }
            final boolean lllllllllllllIIllllIIIlIlllIIlll = n != 0;
            if (((llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlllI, EnumFacing.UP) && !llIIlIIIIllllII(lllllllllllllIIllllIIIlIlllIIlll ? 1 : 0)) || (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlllI, EnumFacing.DOWN) && llIIlIIIIllllII(lllllllllllllIIllllIIIlIlllIIlll ? 1 : 0))) && llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlIIl, lllllllllllllIIllllIIIlIlllIlIII.getValue((IProperty<Object>)lllllllllllllIIllllIIIlIlllIlIlI))) {
                return ItemSlab.lIIIlllllIlIII[1] != 0;
            }
        }
        lllllllllllllIIllllIIIlIlllIIIll = lllllllllllllIIllllIIIlIlllIIIll.offset(lllllllllllllIIllllIIIlIlllIlllI);
        final IBlockState lllllllllllllIIllllIIIlIlllIIllI = lllllllllllllIIllllIIIlIllllIIII.getBlockState(lllllllllllllIIllllIIIlIlllIIIll);
        int canPlaceBlockOnSide;
        if (llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIIllI.getBlock(), this.singleSlab) && llIIlIIIIlllIlI(lllllllllllllIIllllIIIlIlllIlIIl, lllllllllllllIIllllIIIlIlllIIllI.getValue((IProperty<Object>)lllllllllllllIIllllIIIlIlllIlIlI))) {
            canPlaceBlockOnSide = ItemSlab.lIIIlllllIlIII[1];
            "".length();
            if ((0x3D ^ 0x39) == "   ".length()) {
                return ((0x67 ^ 0x22) & ~(0x29 ^ 0x6C)) != 0x0;
            }
        }
        else {
            canPlaceBlockOnSide = (super.canPlaceBlockOnSide(lllllllllllllIIllllIIIlIllllIIII, lllllllllllllIIllllIIIlIlllIlIll, lllllllllllllIIllllIIIlIlllIlllI, lllllllllllllIIllllIIIlIlllIllIl, lllllllllllllIIllllIIIlIlllIllII) ? 1 : 0);
        }
        return canPlaceBlockOnSide != 0;
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIIllllIIIllIIlIllII) {
        return this.singleSlab.getUnlocalizedName(lllllllllllllIIllllIIIllIIlIllII.getMetadata());
    }
    
    private static boolean llIIlIIIIlllIll(final Object lllllllllllllIIllllIIIlIllIIIIII, final Object lllllllllllllIIllllIIIlIlIllllll) {
        return lllllllllllllIIllllIIIlIllIIIIII != lllllllllllllIIllllIIIlIlIllllll;
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIIllllIIIllIIllIIIl) {
        return lllllllllllllIIllllIIIllIIllIIIl;
    }
    
    private static boolean llIIlIIIIllllII(final int lllllllllllllIIllllIIIlIlIlllIIl) {
        return lllllllllllllIIllllIIIlIlIlllIIl != 0;
    }
    
    private static void llIIlIIIIlllIII() {
        (lIIIlllllIlIII = new int[3])[0] = ("   ".length() & ~"   ".length());
        ItemSlab.lIIIlllllIlIII[1] = " ".length();
        ItemSlab.lIIIlllllIlIII[2] = "   ".length();
    }
}
