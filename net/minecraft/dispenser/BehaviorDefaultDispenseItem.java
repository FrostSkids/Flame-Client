// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.dispenser;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

public class BehaviorDefaultDispenseItem implements IBehaviorDispenseItem
{
    private static final /* synthetic */ int[] lIIIlIIIIIlIlI;
    
    private static boolean lIllllIllIlIIll(final Object lllllllllllllIlIIIllIllIIIIIlllI, final Object lllllllllllllIlIIIllIllIIIIIllIl) {
        return lllllllllllllIlIIIllIllIIIIIlllI == lllllllllllllIlIIIllIllIIIIIllIl;
    }
    
    protected ItemStack dispenseStack(final IBlockSource lllllllllllllIlIIIllIllIIlIIIlII, final ItemStack lllllllllllllIlIIIllIllIIlIIIIll) {
        final EnumFacing lllllllllllllIlIIIllIllIIlIIIlll = BlockDispenser.getFacing(lllllllllllllIlIIIllIllIIlIIIlII.getBlockMetadata());
        final IPosition lllllllllllllIlIIIllIllIIlIIIllI = BlockDispenser.getDispensePosition(lllllllllllllIlIIIllIllIIlIIIlII);
        final ItemStack lllllllllllllIlIIIllIllIIlIIIlIl = lllllllllllllIlIIIllIllIIlIIIIll.splitStack(BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[0]);
        doDispense(lllllllllllllIlIIIllIllIIlIIIlII.getWorld(), lllllllllllllIlIIIllIllIIlIIIlIl, BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[1], lllllllllllllIlIIIllIllIIlIIIlll, lllllllllllllIlIIIllIllIIlIIIllI);
        return lllllllllllllIlIIIllIllIIlIIIIll;
    }
    
    protected void spawnDispenseParticles(final IBlockSource lllllllllllllIlIIIllIllIIIIllIIl, final EnumFacing lllllllllllllIlIIIllIllIIIIlIlIl) {
        lllllllllllllIlIIIllIllIIIIllIIl.getWorld().playAuxSFX(BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[4], lllllllllllllIlIIIllIllIIIIllIIl.getBlockPos(), this.func_82488_a(lllllllllllllIlIIIllIllIIIIlIlIl));
    }
    
    @Override
    public final ItemStack dispense(final IBlockSource lllllllllllllIlIIIllIllIIlIlIIlI, final ItemStack lllllllllllllIlIIIllIllIIlIlIIIl) {
        final ItemStack lllllllllllllIlIIIllIllIIlIlIlII = this.dispenseStack(lllllllllllllIlIIIllIllIIlIlIIlI, lllllllllllllIlIIIllIllIIlIlIIIl);
        this.playDispenseSound(lllllllllllllIlIIIllIllIIlIlIIlI);
        this.spawnDispenseParticles(lllllllllllllIlIIIllIllIIlIlIIlI, BlockDispenser.getFacing(lllllllllllllIlIIIllIllIIlIlIIlI.getBlockMetadata()));
        return lllllllllllllIlIIIllIllIIlIlIlII;
    }
    
    public static void doDispense(final World lllllllllllllIlIIIllIllIIIlIlIll, final ItemStack lllllllllllllIlIIIllIllIIIllIlII, final int lllllllllllllIlIIIllIllIIIlIlIIl, final EnumFacing lllllllllllllIlIIIllIllIIIllIIlI, final IPosition lllllllllllllIlIIIllIllIIIlIIlll) {
        final double lllllllllllllIlIIIllIllIIIllIIII = lllllllllllllIlIIIllIllIIIlIIlll.getX();
        double lllllllllllllIlIIIllIllIIIlIllll = lllllllllllllIlIIIllIllIIIlIIlll.getY();
        final double lllllllllllllIlIIIllIllIIIlIlllI = lllllllllllllIlIIIllIllIIIlIIlll.getZ();
        if (lIllllIllIlIIll(lllllllllllllIlIIIllIllIIIllIIlI.getAxis(), EnumFacing.Axis.Y)) {
            lllllllllllllIlIIIllIllIIIlIllll -= 0.125;
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIllIllIIIlIllll -= 0.15625;
        }
        final EntityItem lllllllllllllIlIIIllIllIIIlIllIl = new EntityItem(lllllllllllllIlIIIllIllIIIlIlIll, lllllllllllllIlIIIllIllIIIllIIII, lllllllllllllIlIIIllIllIIIlIllll, lllllllllllllIlIIIllIllIIIlIlllI, lllllllllllllIlIIIllIllIIIllIlII);
        final double lllllllllllllIlIIIllIllIIIlIllII = lllllllllllllIlIIIllIllIIIlIlIll.rand.nextDouble() * 0.1 + 0.2;
        lllllllllllllIlIIIllIllIIIlIllIl.motionX = lllllllllllllIlIIIllIllIIIllIIlI.getFrontOffsetX() * lllllllllllllIlIIIllIllIIIlIllII;
        lllllllllllllIlIIIllIllIIIlIllIl.motionY = 0.20000000298023224;
        lllllllllllllIlIIIllIllIIIlIllIl.motionZ = lllllllllllllIlIIIllIllIIIllIIlI.getFrontOffsetZ() * lllllllllllllIlIIIllIllIIIlIllII;
        final EntityItem entityItem = lllllllllllllIlIIIllIllIIIlIllIl;
        entityItem.motionX += lllllllllllllIlIIIllIllIIIlIlIll.rand.nextGaussian() * 0.007499999832361937 * lllllllllllllIlIIIllIllIIIlIlIIl;
        final EntityItem entityItem2 = lllllllllllllIlIIIllIllIIIlIllIl;
        entityItem2.motionY += lllllllllllllIlIIIllIllIIIlIlIll.rand.nextGaussian() * 0.007499999832361937 * lllllllllllllIlIIIllIllIIIlIlIIl;
        final EntityItem entityItem3 = lllllllllllllIlIIIllIllIIIlIllIl;
        entityItem3.motionZ += lllllllllllllIlIIIllIllIIIlIlIll.rand.nextGaussian() * 0.007499999832361937 * lllllllllllllIlIIIllIllIIIlIlIIl;
        lllllllllllllIlIIIllIllIIIlIlIll.spawnEntityInWorld(lllllllllllllIlIIIllIllIIIlIllIl);
        "".length();
    }
    
    protected void playDispenseSound(final IBlockSource lllllllllllllIlIIIllIllIIIIlllll) {
        lllllllllllllIlIIIllIllIIIIlllll.getWorld().playAuxSFX(BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[2], lllllllllllllIlIIIllIllIIIIlllll.getBlockPos(), BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[3]);
    }
    
    static {
        lIllllIllIlIIlI();
    }
    
    private int func_82488_a(final EnumFacing lllllllllllllIlIIIllIllIIIIlIIIl) {
        return lllllllllllllIlIIIllIllIIIIlIIIl.getFrontOffsetX() + BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[0] + (lllllllllllllIlIIIllIllIIIIlIIIl.getFrontOffsetZ() + BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[0]) * BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[5];
    }
    
    private static void lIllllIllIlIIlI() {
        (lIIIlIIIIIlIlI = new int[6])[0] = " ".length();
        BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[1] = (0x1D ^ 0x7C ^ (0xD5 ^ 0xB2));
        BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[2] = (-(0xFFFFD95B & 0x6EB7) & (0xFFFFEFFA & 0x5BFF));
        BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[3] = ((0x5E ^ 0x52) & ~(0xB2 ^ 0xBE));
        BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[4] = (-(0xFFFFFB17 & 0x74EF) & (0xFFFFFFFE & 0x77D7));
        BehaviorDefaultDispenseItem.lIIIlIIIIIlIlI[5] = "   ".length();
    }
}
