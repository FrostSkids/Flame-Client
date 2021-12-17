// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.stats.StatList;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemBoat extends Item
{
    private static final /* synthetic */ int[] llIlIIIlIIlIIl;
    
    static {
        lIIlIIIllIlIlllI();
    }
    
    private static boolean lIIlIIIllIllIIIl(final int llllllllllllIllIllIlIIIlllIIIlIl, final int llllllllllllIllIllIlIIIlllIIIlII) {
        return llllllllllllIllIllIlIIIlllIIIlIl >= llllllllllllIllIllIlIIIlllIIIlII;
    }
    
    private static boolean lIIlIIIllIlIllll(final Object llllllllllllIllIllIlIIIllIlllllI) {
        return llllllllllllIllIllIlIIIllIlllllI == null;
    }
    
    private static boolean lIIlIIIllIllIIlI(final Object llllllllllllIllIllIlIIIlllIIIIIl, final Object llllllllllllIllIllIlIIIlllIIIIII) {
        return llllllllllllIllIllIlIIIlllIIIIIl == llllllllllllIllIllIlIIIlllIIIIII;
    }
    
    private static boolean lIIlIIIllIllIIll(final int llllllllllllIllIllIlIIIllIlllIlI) {
        return llllllllllllIllIllIlIIIllIlllIlI == 0;
    }
    
    private static void lIIlIIIllIlIlllI() {
        (llIlIIIlIIlIIl = new int[4])[0] = " ".length();
        ItemBoat.llIlIIIlIIlIIl[1] = ((0xAD ^ 0x89 ^ (0x17 ^ 0x8)) & (0xCA ^ 0xA2 ^ (0x0 ^ 0x53) ^ -" ".length()));
        ItemBoat.llIlIIIlIIlIIl[2] = "   ".length();
        ItemBoat.llIlIIIlIIlIIl[3] = (" ".length() ^ (0x4E ^ 0x15));
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIllIlIIIllllIIIlI, final World llllllllllllIllIllIlIIIlllllllll, final EntityPlayer llllllllllllIllIllIlIIIllllIIIII) {
        final float llllllllllllIllIllIlIIIlllllllIl = 1.0f;
        final float llllllllllllIllIllIlIIIlllllllII = llllllllllllIllIllIlIIIllllIIIII.prevRotationPitch + (llllllllllllIllIllIlIIIllllIIIII.rotationPitch - llllllllllllIllIllIlIIIllllIIIII.prevRotationPitch) * llllllllllllIllIllIlIIIlllllllIl;
        final float llllllllllllIllIllIlIIIllllllIll = llllllllllllIllIllIlIIIllllIIIII.prevRotationYaw + (llllllllllllIllIllIlIIIllllIIIII.rotationYaw - llllllllllllIllIllIlIIIllllIIIII.prevRotationYaw) * llllllllllllIllIllIlIIIlllllllIl;
        final double llllllllllllIllIllIlIIIllllllIlI = llllllllllllIllIllIlIIIllllIIIII.prevPosX + (llllllllllllIllIllIlIIIllllIIIII.posX - llllllllllllIllIllIlIIIllllIIIII.prevPosX) * llllllllllllIllIllIlIIIlllllllIl;
        final double llllllllllllIllIllIlIIIllllllIIl = llllllllllllIllIllIlIIIllllIIIII.prevPosY + (llllllllllllIllIllIlIIIllllIIIII.posY - llllllllllllIllIllIlIIIllllIIIII.prevPosY) * llllllllllllIllIllIlIIIlllllllIl + llllllllllllIllIllIlIIIllllIIIII.getEyeHeight();
        final double llllllllllllIllIllIlIIIllllllIII = llllllllllllIllIllIlIIIllllIIIII.prevPosZ + (llllllllllllIllIllIlIIIllllIIIII.posZ - llllllllllllIllIllIlIIIllllIIIII.prevPosZ) * llllllllllllIllIllIlIIIlllllllIl;
        final Vec3 llllllllllllIllIllIlIIIlllllIlll = new Vec3(llllllllllllIllIllIlIIIllllllIlI, llllllllllllIllIllIlIIIllllllIIl, llllllllllllIllIllIlIIIllllllIII);
        final float llllllllllllIllIllIlIIIlllllIllI = MathHelper.cos(-llllllllllllIllIllIlIIIllllllIll * 0.017453292f - 3.1415927f);
        final float llllllllllllIllIllIlIIIlllllIlIl = MathHelper.sin(-llllllllllllIllIllIlIIIllllllIll * 0.017453292f - 3.1415927f);
        final float llllllllllllIllIllIlIIIlllllIlII = -MathHelper.cos(-llllllllllllIllIllIlIIIlllllllII * 0.017453292f);
        final float llllllllllllIllIllIlIIIlllllIIll = MathHelper.sin(-llllllllllllIllIllIlIIIlllllllII * 0.017453292f);
        final float llllllllllllIllIllIlIIIlllllIIlI = llllllllllllIllIllIlIIIlllllIlIl * llllllllllllIllIllIlIIIlllllIlII;
        final float llllllllllllIllIllIlIIIlllllIIIl = llllllllllllIllIllIlIIIlllllIllI * llllllllllllIllIllIlIIIlllllIlII;
        final double llllllllllllIllIllIlIIIlllllIIII = 5.0;
        final Vec3 llllllllllllIllIllIlIIIllllIllll = llllllllllllIllIllIlIIIlllllIlll.addVector(llllllllllllIllIllIlIIIlllllIIlI * llllllllllllIllIllIlIIIlllllIIII, llllllllllllIllIllIlIIIlllllIIll * llllllllllllIllIllIlIIIlllllIIII, llllllllllllIllIllIlIIIlllllIIIl * llllllllllllIllIllIlIIIlllllIIII);
        final MovingObjectPosition llllllllllllIllIllIlIIIllllIlllI = llllllllllllIllIllIlIIIlllllllll.rayTraceBlocks(llllllllllllIllIllIlIIIlllllIlll, llllllllllllIllIllIlIIIllllIllll, (boolean)(ItemBoat.llIlIIIlIIlIIl[0] != 0));
        if (lIIlIIIllIlIllll(llllllllllllIllIllIlIIIllllIlllI)) {
            return llllllllllllIllIllIlIIIllllIIIlI;
        }
        final Vec3 llllllllllllIllIllIlIIIllllIllIl = llllllllllllIllIllIlIIIllllIIIII.getLook(llllllllllllIllIllIlIIIlllllllIl);
        boolean llllllllllllIllIllIlIIIllllIllII = ItemBoat.llIlIIIlIIlIIl[1] != 0;
        final float llllllllllllIllIllIlIIIllllIlIll = 1.0f;
        final List<Entity> llllllllllllIllIllIlIIIllllIlIlI = llllllllllllIllIllIlIIIlllllllll.getEntitiesWithinAABBExcludingEntity(llllllllllllIllIllIlIIIllllIIIII, llllllllllllIllIllIlIIIllllIIIII.getEntityBoundingBox().addCoord(llllllllllllIllIllIlIIIllllIllIl.xCoord * llllllllllllIllIllIlIIIlllllIIII, llllllllllllIllIllIlIIIllllIllIl.yCoord * llllllllllllIllIllIlIIIlllllIIII, llllllllllllIllIllIlIIIllllIllIl.zCoord * llllllllllllIllIllIlIIIlllllIIII).expand(llllllllllllIllIllIlIIIllllIlIll, llllllllllllIllIllIlIIIllllIlIll, llllllllllllIllIllIlIIIllllIlIll));
        int llllllllllllIllIllIlIIIllllIlIIl = ItemBoat.llIlIIIlIIlIIl[1];
        "".length();
        if (((0x6A ^ 0x64) & ~(0x9 ^ 0x7)) >= "   ".length()) {
            return null;
        }
        while (!lIIlIIIllIllIIIl(llllllllllllIllIllIlIIIllllIlIIl, llllllllllllIllIllIlIIIllllIlIlI.size())) {
            final Entity llllllllllllIllIllIlIIIllllIlIII = llllllllllllIllIllIlIIIllllIlIlI.get(llllllllllllIllIllIlIIIllllIlIIl);
            if (lIIlIIIllIllIIII(llllllllllllIllIllIlIIIllllIlIII.canBeCollidedWith() ? 1 : 0)) {
                final float llllllllllllIllIllIlIIIllllIIlll = llllllllllllIllIllIlIIIllllIlIII.getCollisionBorderSize();
                final AxisAlignedBB llllllllllllIllIllIlIIIllllIIllI = llllllllllllIllIllIlIIIllllIlIII.getEntityBoundingBox().expand(llllllllllllIllIllIlIIIllllIIlll, llllllllllllIllIllIlIIIllllIIlll, llllllllllllIllIllIlIIIllllIIlll);
                if (lIIlIIIllIllIIII(llllllllllllIllIllIlIIIllllIIllI.isVecInside(llllllllllllIllIllIlIIIlllllIlll) ? 1 : 0)) {
                    llllllllllllIllIllIlIIIllllIllII = (ItemBoat.llIlIIIlIIlIIl[0] != 0);
                }
            }
            ++llllllllllllIllIllIlIIIllllIlIIl;
        }
        if (lIIlIIIllIllIIII(llllllllllllIllIllIlIIIllllIllII ? 1 : 0)) {
            return llllllllllllIllIllIlIIIllllIIIlI;
        }
        if (lIIlIIIllIllIIlI(llllllllllllIllIllIlIIIllllIlllI.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            BlockPos llllllllllllIllIllIlIIIllllIIlIl = llllllllllllIllIllIlIIIllllIlllI.getBlockPos();
            if (lIIlIIIllIllIIlI(llllllllllllIllIllIlIIIlllllllll.getBlockState(llllllllllllIllIllIlIIIllllIIlIl).getBlock(), Blocks.snow_layer)) {
                llllllllllllIllIllIlIIIllllIIlIl = llllllllllllIllIllIlIIIllllIIlIl.down();
            }
            final EntityBoat llllllllllllIllIllIlIIIllllIIlII = new EntityBoat(llllllllllllIllIllIlIIIlllllllll, llllllllllllIllIllIlIIIllllIIlIl.getX() + 0.5f, llllllllllllIllIllIlIIIllllIIlIl.getY() + 1.0f, llllllllllllIllIllIlIIIllllIIlIl.getZ() + 0.5f);
            llllllllllllIllIllIlIIIllllIIlII.rotationYaw = (float)(((MathHelper.floor_double(llllllllllllIllIllIlIIIllllIIIII.rotationYaw * 4.0f / 360.0f + 0.5) & ItemBoat.llIlIIIlIIlIIl[2]) - ItemBoat.llIlIIIlIIlIIl[0]) * ItemBoat.llIlIIIlIIlIIl[3]);
            if (lIIlIIIllIllIIll(llllllllllllIllIllIlIIIlllllllll.getCollidingBoundingBoxes(llllllllllllIllIllIlIIIllllIIlII, llllllllllllIllIllIlIIIllllIIlII.getEntityBoundingBox().expand(-0.1, -0.1, -0.1)).isEmpty() ? 1 : 0)) {
                return llllllllllllIllIllIlIIIllllIIIlI;
            }
            if (lIIlIIIllIllIIll(llllllllllllIllIllIlIIIlllllllll.isRemote ? 1 : 0)) {
                llllllllllllIllIllIlIIIlllllllll.spawnEntityInWorld(llllllllllllIllIllIlIIIllllIIlII);
                "".length();
            }
            if (lIIlIIIllIllIIll(llllllllllllIllIllIlIIIllllIIIII.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIllIllIlIIIllllIIIlI.stackSize -= ItemBoat.llIlIIIlIIlIIl[0];
            }
            llllllllllllIllIllIlIIIllllIIIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        }
        return llllllllllllIllIllIlIIIllllIIIlI;
    }
    
    public ItemBoat() {
        this.maxStackSize = ItemBoat.llIlIIIlIIlIIl[0];
        this.setCreativeTab(CreativeTabs.tabTransport);
        "".length();
    }
    
    private static boolean lIIlIIIllIllIIII(final int llllllllllllIllIllIlIIIllIllllII) {
        return llllllllllllIllIllIlIIIllIllllII != 0;
    }
}
