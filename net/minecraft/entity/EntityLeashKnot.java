// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import net.minecraft.block.BlockFence;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityLeashKnot extends EntityHanging
{
    private static final /* synthetic */ int[] llIIllIlIlIlIl;
    
    private static boolean lIIIlllIlllIllII(final int llllllllllllIlllIIIIIIIllIIIllIl) {
        return llllllllllllIlllIIIIIIIllIIIllIl != 0;
    }
    
    public EntityLeashKnot(final World llllllllllllIlllIIIIIIIllllIlIIl, final BlockPos llllllllllllIlllIIIIIIIllllIlIII) {
        super(llllllllllllIlllIIIIIIIllllIlIIl, llllllllllllIlllIIIIIIIllllIlIII);
        this.setPosition(llllllllllllIlllIIIIIIIllllIlIII.getX() + 0.5, llllllllllllIlllIIIIIIIllllIlIII.getY() + 0.5, llllllllllllIlllIIIIIIIllllIlIII.getZ() + 0.5);
        final float llllllllllllIlllIIIIIIIllllIIlll = 0.125f;
        final float llllllllllllIlllIIIIIIIllllIIllI = 0.1875f;
        final float llllllllllllIlllIIIIIIIllllIIlIl = 0.25f;
        this.setEntityBoundingBox(new AxisAlignedBB(this.posX - 0.1875, this.posY - 0.25 + 0.125, this.posZ - 0.1875, this.posX + 0.1875, this.posY + 0.25 + 0.125, this.posZ + 0.1875));
    }
    
    @Override
    public float getEyeHeight() {
        return -0.0625f;
    }
    
    public void updateFacingWithBoundingBox(final EnumFacing llllllllllllIlllIIIIIIIlllIllIlI) {
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllIIIIIIIlllIIlIll) {
    }
    
    private static boolean lIIIlllIlllIlIIl(final Object llllllllllllIlllIIIIIIIllIIlIIll) {
        return llllllllllllIlllIIIIIIIllIIlIIll != null;
    }
    
    private static boolean lIIIlllIlllIlIll(final int llllllllllllIlllIIIIIIIllIIIlIll) {
        return llllllllllllIlllIIIIIIIllIIIlIll == 0;
    }
    
    private static boolean lIIIlllIlllIlIII(final int llllllllllllIlllIIIIIIIllIIIlIIl) {
        return llllllllllllIlllIIIIIIIllIIIlIIl < 0;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlllIIIIIIIlllIIIIlI) {
        final ItemStack llllllllllllIlllIIIIIIIlllIIIIIl = llllllllllllIlllIIIIIIIlllIIIIlI.getHeldItem();
        boolean llllllllllllIlllIIIIIIIlllIIIIII = EntityLeashKnot.llIIllIlIlIlIl[2] != 0;
        if (lIIIlllIlllIlIIl(llllllllllllIlllIIIIIIIlllIIIIIl) && lIIIlllIlllIlIlI(llllllllllllIlllIIIIIIIlllIIIIIl.getItem(), Items.lead) && lIIIlllIlllIlIll(this.worldObj.isRemote ? 1 : 0)) {
            final double llllllllllllIlllIIIIIIIllIllllll = 7.0;
            final long llllllllllllIlllIIIIIIIllIllIlIl = (long)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityLiving.class, new AxisAlignedBB(this.posX - llllllllllllIlllIIIIIIIllIllllll, this.posY - llllllllllllIlllIIIIIIIllIllllll, this.posZ - llllllllllllIlllIIIIIIIllIllllll, this.posX + llllllllllllIlllIIIIIIIllIllllll, this.posY + llllllllllllIlllIIIIIIIllIllllll, this.posZ + llllllllllllIlllIIIIIIIllIllllll)).iterator();
            "".length();
            if (null != null) {
                return ((0x55 ^ 0x4B) & ~(0x4 ^ 0x1A)) != 0x0;
            }
            while (!lIIIlllIlllIlIll(((Iterator)llllllllllllIlllIIIIIIIllIllIlIl).hasNext() ? 1 : 0)) {
                final EntityLiving llllllllllllIlllIIIIIIIllIlllllI = ((Iterator<EntityLiving>)llllllllllllIlllIIIIIIIllIllIlIl).next();
                if (lIIIlllIlllIllII(llllllllllllIlllIIIIIIIllIlllllI.getLeashed() ? 1 : 0) && lIIIlllIlllIlIlI(llllllllllllIlllIIIIIIIllIlllllI.getLeashedToEntity(), llllllllllllIlllIIIIIIIlllIIIIlI)) {
                    llllllllllllIlllIIIIIIIllIlllllI.setLeashedToEntity(this, (boolean)(EntityLeashKnot.llIIllIlIlIlIl[1] != 0));
                    llllllllllllIlllIIIIIIIlllIIIIII = (EntityLeashKnot.llIIllIlIlIlIl[1] != 0);
                }
            }
        }
        if (lIIIlllIlllIlIll(this.worldObj.isRemote ? 1 : 0) && lIIIlllIlllIlIll(llllllllllllIlllIIIIIIIlllIIIIII ? 1 : 0)) {
            this.setDead();
            if (lIIIlllIlllIllII(llllllllllllIlllIIIIIIIlllIIIIlI.capabilities.isCreativeMode ? 1 : 0)) {
                final double llllllllllllIlllIIIIIIIllIllllIl = 7.0;
                final long llllllllllllIlllIIIIIIIllIllIlIl = (long)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityLiving.class, new AxisAlignedBB(this.posX - llllllllllllIlllIIIIIIIllIllllIl, this.posY - llllllllllllIlllIIIIIIIllIllllIl, this.posZ - llllllllllllIlllIIIIIIIllIllllIl, this.posX + llllllllllllIlllIIIIIIIllIllllIl, this.posY + llllllllllllIlllIIIIIIIllIllllIl, this.posZ + llllllllllllIlllIIIIIIIllIllllIl)).iterator();
                "".length();
                if ("  ".length() >= (150 + 41 - 83 + 47 ^ 124 + 132 - 233 + 136)) {
                    return ((95 + 27 + 64 + 41 ^ 177 + 0 - 123 + 145) & (63 + 14 - 8 + 70 ^ 112 + 56 - 160 + 167 ^ -" ".length())) != 0x0;
                }
                while (!lIIIlllIlllIlIll(((Iterator)llllllllllllIlllIIIIIIIllIllIlIl).hasNext() ? 1 : 0)) {
                    final EntityLiving llllllllllllIlllIIIIIIIllIllllII = ((Iterator<EntityLiving>)llllllllllllIlllIIIIIIIllIllIlIl).next();
                    if (lIIIlllIlllIllII(llllllllllllIlllIIIIIIIllIllllII.getLeashed() ? 1 : 0) && lIIIlllIlllIlIlI(llllllllllllIlllIIIIIIIllIllllII.getLeashedToEntity(), this)) {
                        llllllllllllIlllIIIIIIIllIllllII.clearLeashed((boolean)(EntityLeashKnot.llIIllIlIlIlIl[1] != 0), (boolean)(EntityLeashKnot.llIIllIlIlIlIl[2] != 0));
                    }
                }
            }
        }
        return EntityLeashKnot.llIIllIlIlIlIl[1] != 0;
    }
    
    @Override
    public void onBroken(final Entity llllllllllllIlllIIIIIIIlllIlIIIl) {
    }
    
    private static void lIIIlllIlllIIllI() {
        (llIIllIlIlIlIl = new int[3])[0] = (0x66 ^ 0x6F);
        EntityLeashKnot.llIIllIlIlIlIl[1] = " ".length();
        EntityLeashKnot.llIIllIlIlIlIl[2] = ((0x91 ^ 0x9E) & ~(0x56 ^ 0x59));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllIIIIIIIlllIIllIl) {
    }
    
    public static EntityLeashKnot getKnotForPosition(final World llllllllllllIlllIIIIIIIllIlIIIIl, final BlockPos llllllllllllIlllIIIIIIIllIIllIlI) {
        final int llllllllllllIlllIIIIIIIllIIlllll = llllllllllllIlllIIIIIIIllIIllIlI.getX();
        final int llllllllllllIlllIIIIIIIllIIllllI = llllllllllllIlllIIIIIIIllIIllIlI.getY();
        final int llllllllllllIlllIIIIIIIllIIlllIl = llllllllllllIlllIIIIIIIllIIllIlI.getZ();
        final byte llllllllllllIlllIIIIIIIllIIlIlIl = (byte)llllllllllllIlllIIIIIIIllIlIIIIl.getEntitiesWithinAABB((Class<? extends Entity>)EntityLeashKnot.class, new AxisAlignedBB(llllllllllllIlllIIIIIIIllIIlllll - 1.0, llllllllllllIlllIIIIIIIllIIllllI - 1.0, llllllllllllIlllIIIIIIIllIIlllIl - 1.0, llllllllllllIlllIIIIIIIllIIlllll + 1.0, llllllllllllIlllIIIIIIIllIIllllI + 1.0, llllllllllllIlllIIIIIIIllIIlllIl + 1.0)).iterator();
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lIIIlllIlllIlIll(((Iterator)llllllllllllIlllIIIIIIIllIIlIlIl).hasNext() ? 1 : 0)) {
            final EntityLeashKnot llllllllllllIlllIIIIIIIllIIlllII = ((Iterator<EntityLeashKnot>)llllllllllllIlllIIIIIIIllIIlIlIl).next();
            if (lIIIlllIlllIllII(llllllllllllIlllIIIIIIIllIIlllII.getHangingPosition().equals(llllllllllllIlllIIIIIIIllIIllIlI) ? 1 : 0)) {
                return llllllllllllIlllIIIIIIIllIIlllII;
            }
        }
        return null;
    }
    
    public static EntityLeashKnot createKnot(final World llllllllllllIlllIIIIIIIllIlIlIll, final BlockPos llllllllllllIlllIIIIIIIllIlIllIl) {
        final EntityLeashKnot llllllllllllIlllIIIIIIIllIlIllII = new EntityLeashKnot(llllllllllllIlllIIIIIIIllIlIlIll, llllllllllllIlllIIIIIIIllIlIllIl);
        llllllllllllIlllIIIIIIIllIlIllII.forceSpawn = (EntityLeashKnot.llIIllIlIlIlIl[1] != 0);
        llllllllllllIlllIIIIIIIllIlIlIll.spawnEntityInWorld(llllllllllllIlllIIIIIIIllIlIllII);
        "".length();
        return llllllllllllIlllIIIIIIIllIlIllII;
    }
    
    @Override
    public int getWidthPixels() {
        return EntityLeashKnot.llIIllIlIlIlIl[0];
    }
    
    private static int lIIIlllIlllIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIlllIIIIIIIlllIlIIll) {
        if (lIIIlllIlllIlIII(lIIIlllIlllIIlll(llllllllllllIlllIIIIIIIlllIlIIll, 1024.0))) {
            return EntityLeashKnot.llIIllIlIlIlIl[1] != 0;
        }
        return EntityLeashKnot.llIIllIlIlIlIl[2] != 0;
    }
    
    static {
        lIIIlllIlllIIllI();
    }
    
    @Override
    public boolean writeToNBTOptional(final NBTTagCompound llllllllllllIlllIIIIIIIlllIIllll) {
        return EntityLeashKnot.llIIllIlIlIlIl[2] != 0;
    }
    
    private static boolean lIIIlllIlllIlIlI(final Object llllllllllllIlllIIIIIIIllIIlIIII, final Object llllllllllllIlllIIIIIIIllIIIllll) {
        return llllllllllllIlllIIIIIIIllIIlIIII == llllllllllllIlllIIIIIIIllIIIllll;
    }
    
    @Override
    public boolean onValidSurface() {
        return this.worldObj.getBlockState(this.hangingPosition).getBlock() instanceof BlockFence;
    }
    
    @Override
    public int getHeightPixels() {
        return EntityLeashKnot.llIIllIlIlIlIl[0];
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    }
    
    public EntityLeashKnot(final World llllllllllllIlllIIIIIIIlllllIIll) {
        super(llllllllllllIlllIIIIIIIlllllIIll);
    }
}
