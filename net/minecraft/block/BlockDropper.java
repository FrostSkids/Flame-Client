// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.inventory.IInventory;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.BlockPos;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.dispenser.IBehaviorDispenseItem;

public class BlockDropper extends BlockDispenser
{
    private final /* synthetic */ IBehaviorDispenseItem dropBehavior;
    private static final /* synthetic */ int[] llIllIIlIIIlII;
    
    private static boolean lIIlIllIlIlllIIl(final int llllllllllllIllIIllllllIlIIIlIII) {
        return llllllllllllIllIIllllllIlIIIlIII <= 0;
    }
    
    @Override
    protected IBehaviorDispenseItem getBehavior(final ItemStack llllllllllllIllIIllllllIlIllIllI) {
        return this.dropBehavior;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIIllllllIlIllIIll, final int llllllllllllIllIIllllllIlIllIIlI) {
        return new TileEntityDropper();
    }
    
    public BlockDropper() {
        this.dropBehavior = new BehaviorDefaultDispenseItem();
    }
    
    private static boolean lIIlIllIlIllIlIl(final Object llllllllllllIllIIllllllIlIIIlllI) {
        return llllllllllllIllIIllllllIlIIIlllI != null;
    }
    
    private static boolean lIIlIllIlIllIllI(final int llllllllllllIllIIllllllIlIIIlIlI) {
        return llllllllllllIllIIllllllIlIIIlIlI < 0;
    }
    
    private static boolean lIIlIllIlIlllIII(final Object llllllllllllIllIIllllllIlIIIllII) {
        return llllllllllllIllIIllllllIlIIIllII == null;
    }
    
    static {
        lIIlIllIlIllIIll();
    }
    
    private static void lIIlIllIlIllIIll() {
        (llIllIIlIIIlII = new int[3])[0] = (-(0xFFFFF915 & 0x7EEB) & (0xFFFFFFFB & 0x7BED));
        BlockDropper.llIllIIlIIIlII[1] = ((48 + 110 - 23 + 72 ^ 14 + 4 - 1 + 115) & (0xFA ^ 0xAB ^ (0x6E ^ 0x74) ^ -" ".length()));
        BlockDropper.llIllIIlIIIlII[2] = " ".length();
    }
    
    @Override
    protected void dispense(final World llllllllllllIllIIllllllIlIlIIlIl, final BlockPos llllllllllllIllIIllllllIlIlIIlII) {
        final BlockSourceImpl llllllllllllIllIIllllllIlIlIIIll = new BlockSourceImpl(llllllllllllIllIIllllllIlIlIIlIl, llllllllllllIllIIllllllIlIlIIlII);
        final TileEntityDispenser llllllllllllIllIIllllllIlIlIIIlI = llllllllllllIllIIllllllIlIlIIIll.getBlockTileEntity();
        if (lIIlIllIlIllIlIl(llllllllllllIllIIllllllIlIlIIIlI)) {
            final int llllllllllllIllIIllllllIlIlIIIIl = llllllllllllIllIIllllllIlIlIIIlI.getDispenseSlot();
            if (lIIlIllIlIllIllI(llllllllllllIllIIllllllIlIlIIIIl)) {
                llllllllllllIllIIllllllIlIlIIlIl.playAuxSFX(BlockDropper.llIllIIlIIIlII[0], llllllllllllIllIIllllllIlIlIIlII, BlockDropper.llIllIIlIIIlII[1]);
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                final ItemStack llllllllllllIllIIllllllIlIlIIIII = llllllllllllIllIIllllllIlIlIIIlI.getStackInSlot(llllllllllllIllIIllllllIlIlIIIIl);
                if (lIIlIllIlIllIlIl(llllllllllllIllIIllllllIlIlIIIII)) {
                    final EnumFacing llllllllllllIllIIllllllIlIIlllll = llllllllllllIllIIllllllIlIlIIlIl.getBlockState(llllllllllllIllIIllllllIlIlIIlII).getValue((IProperty<EnumFacing>)BlockDropper.FACING);
                    final BlockPos llllllllllllIllIIllllllIlIIllllI = llllllllllllIllIIllllllIlIlIIlII.offset(llllllllllllIllIIllllllIlIIlllll);
                    final IInventory llllllllllllIllIIllllllIlIIlllIl = TileEntityHopper.getInventoryAtPosition(llllllllllllIllIIllllllIlIlIIlIl, llllllllllllIllIIllllllIlIIllllI.getX(), llllllllllllIllIIllllllIlIIllllI.getY(), llllllllllllIllIIllllllIlIIllllI.getZ());
                    ItemStack llllllllllllIllIIllllllIlIIllIll = null;
                    if (lIIlIllIlIlllIII(llllllllllllIllIIllllllIlIIlllIl)) {
                        ItemStack llllllllllllIllIIllllllIlIIlllII = this.dropBehavior.dispense(llllllllllllIllIIllllllIlIlIIIll, llllllllllllIllIIllllllIlIlIIIII);
                        if (lIIlIllIlIllIlIl(llllllllllllIllIIllllllIlIIlllII) && lIIlIllIlIlllIIl(llllllllllllIllIIllllllIlIIlllII.stackSize)) {
                            llllllllllllIllIIllllllIlIIlllII = null;
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIIllllllIlIIllIll = TileEntityHopper.putStackInInventoryAllSlots(llllllllllllIllIIllllllIlIIlllIl, llllllllllllIllIIllllllIlIlIIIII.copy().splitStack(BlockDropper.llIllIIlIIIlII[2]), llllllllllllIllIIllllllIlIIlllll.getOpposite());
                        if (lIIlIllIlIlllIII(llllllllllllIllIIllllllIlIIllIll)) {
                            final ItemStack copy;
                            llllllllllllIllIIllllllIlIIllIll = (copy = llllllllllllIllIIllllllIlIlIIIII.copy());
                            final int n = copy.stackSize - BlockDropper.llIllIIlIIIlII[2];
                            copy.stackSize = n;
                            if (lIIlIllIlIlllIIl(n)) {
                                llllllllllllIllIIllllllIlIIllIll = null;
                                "".length();
                                if (((0x48 ^ 0x62) & ~(0x22 ^ 0x8)) >= "   ".length()) {
                                    return;
                                }
                            }
                        }
                        else {
                            llllllllllllIllIIllllllIlIIllIll = llllllllllllIllIIllllllIlIlIIIII.copy();
                        }
                    }
                    llllllllllllIllIIllllllIlIlIIIlI.setInventorySlotContents(llllllllllllIllIIllllllIlIlIIIIl, llllllllllllIllIIllllllIlIIllIll);
                }
            }
        }
    }
}
