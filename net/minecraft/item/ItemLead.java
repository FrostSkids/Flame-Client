// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;

public class ItemLead extends Item
{
    private static final /* synthetic */ int[] lIIIIIIlIIIIIl;
    
    static {
        lIllIIlllIIlIlI();
    }
    
    private static boolean lIllIIlllIIllII(final Object lllllllllllllIlIlIIIllIIIIIIlllI, final Object lllllllllllllIlIlIIIllIIIIIIllIl) {
        return lllllllllllllIlIlIIIllIIIIIIlllI == lllllllllllllIlIlIIIllIIIIIIllIl;
    }
    
    private static void lIllIIlllIIlIlI() {
        (lIIIIIIlIIIIIl = new int[2])[0] = " ".length();
        ItemLead.lIIIIIIlIIIIIl[1] = ((120 + 7 - 24 + 141 ^ 46 + 177 - 178 + 143) & (0x3E ^ 0x8 ^ (0xDA ^ 0xA4) ^ -" ".length()));
    }
    
    private static boolean lIllIIlllIIlllI(final int lllllllllllllIlIlIIIllIIIIIIIlll) {
        return lllllllllllllIlIlIIIllIIIIIIIlll == 0;
    }
    
    private static boolean lIllIIlllIIllIl(final Object lllllllllllllIlIlIIIllIIIIIIlIll) {
        return lllllllllllllIlIlIIIllIIIIIIlIll == null;
    }
    
    private static boolean lIllIIlllIIlIll(final int lllllllllllllIlIlIIIllIIIIIIlIIl) {
        return lllllllllllllIlIlIIIllIIIIIIlIIl != 0;
    }
    
    public ItemLead() {
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIlIlIIIllIIIIllllIl, final EntityPlayer lllllllllllllIlIlIIIllIIIIllllII, final World lllllllllllllIlIlIIIllIIIIlllIll, final BlockPos lllllllllllllIlIlIIIllIIIIlllIlI, final EnumFacing lllllllllllllIlIlIIIllIIIIlllIIl, final float lllllllllllllIlIlIIIllIIIIlllIII, final float lllllllllllllIlIlIIIllIIIIllIlll, final float lllllllllllllIlIlIIIllIIIIllIllI) {
        final Block lllllllllllllIlIlIIIllIIIIllIlIl = lllllllllllllIlIlIIIllIIIIlllIll.getBlockState(lllllllllllllIlIlIIIllIIIIlllIlI).getBlock();
        if (!lIllIIlllIIlIll((lllllllllllllIlIlIIIllIIIIllIlIl instanceof BlockFence) ? 1 : 0)) {
            return ItemLead.lIIIIIIlIIIIIl[1] != 0;
        }
        if (lIllIIlllIIlIll(lllllllllllllIlIlIIIllIIIIlllIll.isRemote ? 1 : 0)) {
            return ItemLead.lIIIIIIlIIIIIl[0] != 0;
        }
        attachToFence(lllllllllllllIlIlIIIllIIIIllllII, lllllllllllllIlIlIIIllIIIIlllIll, lllllllllllllIlIlIIIllIIIIlllIlI);
        "".length();
        return ItemLead.lIIIIIIlIIIIIl[0] != 0;
    }
    
    public static boolean attachToFence(final EntityPlayer lllllllllllllIlIlIIIllIIIIlIIlIl, final World lllllllllllllIlIlIIIllIIIIlIIlII, final BlockPos lllllllllllllIlIlIIIllIIIIIllIIl) {
        EntityLeashKnot lllllllllllllIlIlIIIllIIIIlIIIlI = EntityLeashKnot.getKnotForPosition(lllllllllllllIlIlIIIllIIIIlIIlII, lllllllllllllIlIlIIIllIIIIIllIIl);
        boolean lllllllllllllIlIlIIIllIIIIlIIIIl = ItemLead.lIIIIIIlIIIIIl[1] != 0;
        final double lllllllllllllIlIlIIIllIIIIlIIIII = 7.0;
        final int lllllllllllllIlIlIIIllIIIIIlllll = lllllllllllllIlIlIIIllIIIIIllIIl.getX();
        final int lllllllllllllIlIlIIIllIIIIIllllI = lllllllllllllIlIlIIIllIIIIIllIIl.getY();
        final int lllllllllllllIlIlIIIllIIIIIlllIl = lllllllllllllIlIlIIIllIIIIIllIIl.getZ();
        final byte lllllllllllllIlIlIIIllIIIIIlIIIl = (byte)lllllllllllllIlIlIIIllIIIIlIIlII.getEntitiesWithinAABB((Class<? extends Entity>)EntityLiving.class, new AxisAlignedBB(lllllllllllllIlIlIIIllIIIIIlllll - lllllllllllllIlIlIIIllIIIIlIIIII, lllllllllllllIlIlIIIllIIIIIllllI - lllllllllllllIlIlIIIllIIIIlIIIII, lllllllllllllIlIlIIIllIIIIIlllIl - lllllllllllllIlIlIIIllIIIIlIIIII, lllllllllllllIlIlIIIllIIIIIlllll + lllllllllllllIlIlIIIllIIIIlIIIII, lllllllllllllIlIlIIIllIIIIIllllI + lllllllllllllIlIlIIIllIIIIlIIIII, lllllllllllllIlIlIIIllIIIIIlllIl + lllllllllllllIlIlIIIllIIIIlIIIII)).iterator();
        "".length();
        if (-" ".length() >= "   ".length()) {
            return ((0xB6 ^ 0xA4) & ~(0x21 ^ 0x33)) != 0x0;
        }
        while (!lIllIIlllIIlllI(((Iterator)lllllllllllllIlIlIIIllIIIIIlIIIl).hasNext() ? 1 : 0)) {
            final EntityLiving lllllllllllllIlIlIIIllIIIIIlllII = ((Iterator<EntityLiving>)lllllllllllllIlIlIIIllIIIIIlIIIl).next();
            if (lIllIIlllIIlIll(lllllllllllllIlIlIIIllIIIIIlllII.getLeashed() ? 1 : 0) && lIllIIlllIIllII(lllllllllllllIlIlIIIllIIIIIlllII.getLeashedToEntity(), lllllllllllllIlIlIIIllIIIIlIIlIl)) {
                if (lIllIIlllIIllIl(lllllllllllllIlIlIIIllIIIIlIIIlI)) {
                    lllllllllllllIlIlIIIllIIIIlIIIlI = EntityLeashKnot.createKnot(lllllllllllllIlIlIIIllIIIIlIIlII, lllllllllllllIlIlIIIllIIIIIllIIl);
                }
                lllllllllllllIlIlIIIllIIIIIlllII.setLeashedToEntity(lllllllllllllIlIlIIIllIIIIlIIIlI, (boolean)(ItemLead.lIIIIIIlIIIIIl[0] != 0));
                lllllllllllllIlIlIIIllIIIIlIIIIl = (ItemLead.lIIIIIIlIIIIIl[0] != 0);
            }
        }
        return lllllllllllllIlIlIIIllIIIIlIIIIl;
    }
}
