// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.pathfinder.WalkNodeProcessor;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLiving;

public class EntityAIControlledByPlayer extends EntityAIBase
{
    private static final /* synthetic */ int[] lIlIlIlllllllI;
    private /* synthetic */ int speedBoostTime;
    private /* synthetic */ float currentSpeed;
    private /* synthetic */ int maxSpeedBoostTime;
    private final /* synthetic */ float maxSpeed;
    private /* synthetic */ boolean speedBoosted;
    private final /* synthetic */ EntityLiving thisEntity;
    
    private static boolean llllIIIIIIIIIlI(final int lllllllllllllIIIIllllIIIlllIlIII, final int lllllllllllllIIIIllllIIIlllIIlll) {
        return lllllllllllllIIIIllllIIIlllIlIII > lllllllllllllIIIIllllIIIlllIIlll;
    }
    
    @Override
    public void resetTask() {
        this.speedBoosted = (EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0);
        this.currentSpeed = 0.0f;
    }
    
    private static boolean lllIlllllllllII(final Object lllllllllllllIIIIllllIIIlllIIlIl) {
        return lllllllllllllIIIIllllIIIlllIIlIl != null;
    }
    
    private static int lllIlllllllllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void updateTask() {
        final EntityPlayer lllllllllllllIIIIllllIIlIIlIllII = (EntityPlayer)this.thisEntity.riddenByEntity;
        final EntityCreature lllllllllllllIIIIllllIIlIIlIlIll = (EntityCreature)this.thisEntity;
        float lllllllllllllIIIIllllIIlIIlIlIlI = MathHelper.wrapAngleTo180_float(lllllllllllllIIIIllllIIlIIlIllII.rotationYaw - this.thisEntity.rotationYaw) * 0.5f;
        if (llllIIIIIIIIIII(lllIllllllllllI(lllllllllllllIIIIllllIIlIIlIlIlI, 5.0f))) {
            lllllllllllllIIIIllllIIlIIlIlIlI = 5.0f;
        }
        if (llllIIIIIIIIIIl(lllIlllllllllll(lllllllllllllIIIIllllIIlIIlIlIlI, -5.0f))) {
            lllllllllllllIIIIllllIIlIIlIlIlI = -5.0f;
        }
        this.thisEntity.rotationYaw = MathHelper.wrapAngleTo180_float(this.thisEntity.rotationYaw + lllllllllllllIIIIllllIIlIIlIlIlI);
        if (llllIIIIIIIIIIl(lllIlllllllllll(this.currentSpeed, this.maxSpeed))) {
            this.currentSpeed += (this.maxSpeed - this.currentSpeed) * 0.01f;
        }
        if (llllIIIIIIIIIII(lllIllllllllllI(this.currentSpeed, this.maxSpeed))) {
            this.currentSpeed = this.maxSpeed;
        }
        final int lllllllllllllIIIIllllIIlIIlIlIIl = MathHelper.floor_double(this.thisEntity.posX);
        final int lllllllllllllIIIIllllIIlIIlIlIII = MathHelper.floor_double(this.thisEntity.posY);
        final int lllllllllllllIIIIllllIIlIIlIIlll = MathHelper.floor_double(this.thisEntity.posZ);
        float lllllllllllllIIIIllllIIlIIlIIllI = this.currentSpeed;
        if (lllIllllllllIll(this.speedBoosted ? 1 : 0)) {
            final int speedBoostTime = this.speedBoostTime;
            this.speedBoostTime = speedBoostTime + EntityAIControlledByPlayer.lIlIlIlllllllI[2];
            if (llllIIIIIIIIIlI(speedBoostTime, this.maxSpeedBoostTime)) {
                this.speedBoosted = (EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0);
            }
            lllllllllllllIIIIllllIIlIIlIIllI += lllllllllllllIIIIllllIIlIIlIIllI * 1.15f * MathHelper.sin(this.speedBoostTime / (float)this.maxSpeedBoostTime * 3.1415927f);
        }
        float lllllllllllllIIIIllllIIlIIlIIlIl = 0.91f;
        if (lllIllllllllIll(this.thisEntity.onGround ? 1 : 0)) {
            lllllllllllllIIIIllllIIlIIlIIlIl = this.thisEntity.worldObj.getBlockState(new BlockPos(MathHelper.floor_float((float)lllllllllllllIIIIllllIIlIIlIlIIl), MathHelper.floor_float((float)lllllllllllllIIIIllllIIlIIlIlIII) - EntityAIControlledByPlayer.lIlIlIlllllllI[2], MathHelper.floor_float((float)lllllllllllllIIIIllllIIlIIlIIlll))).getBlock().slipperiness * 0.91f;
        }
        final float lllllllllllllIIIIllllIIlIIlIIlII = 0.16277136f / (lllllllllllllIIIIllllIIlIIlIIlIl * lllllllllllllIIIIllllIIlIIlIIlIl * lllllllllllllIIIIllllIIlIIlIIlIl);
        final float lllllllllllllIIIIllllIIlIIlIIIll = MathHelper.sin(lllllllllllllIIIIllllIIlIIlIlIll.rotationYaw * 3.1415927f / 180.0f);
        final float lllllllllllllIIIIllllIIlIIlIIIlI = MathHelper.cos(lllllllllllllIIIIllllIIlIIlIlIll.rotationYaw * 3.1415927f / 180.0f);
        final float lllllllllllllIIIIllllIIlIIlIIIIl = lllllllllllllIIIIllllIIlIIlIlIll.getAIMoveSpeed() * lllllllllllllIIIIllllIIlIIlIIlII;
        float lllllllllllllIIIIllllIIlIIlIIIII = Math.max(lllllllllllllIIIIllllIIlIIlIIllI, 1.0f);
        lllllllllllllIIIIllllIIlIIlIIIII = lllllllllllllIIIIllllIIlIIlIIIIl / lllllllllllllIIIIllllIIlIIlIIIII;
        final float lllllllllllllIIIIllllIIlIIIlllll = lllllllllllllIIIIllllIIlIIlIIllI * lllllllllllllIIIIllllIIlIIlIIIII;
        float lllllllllllllIIIIllllIIlIIIllllI = -(lllllllllllllIIIIllllIIlIIIlllll * lllllllllllllIIIIllllIIlIIlIIIll);
        float lllllllllllllIIIIllllIIlIIIlllIl = lllllllllllllIIIIllllIIlIIIlllll * lllllllllllllIIIIllllIIlIIlIIIlI;
        if (llllIIIIIIIIIII(lllIllllllllllI(MathHelper.abs(lllllllllllllIIIIllllIIlIIIllllI), MathHelper.abs(lllllllllllllIIIIllllIIlIIIlllIl)))) {
            if (llllIIIIIIIIIIl(lllIlllllllllll(lllllllllllllIIIIllllIIlIIIllllI, 0.0f))) {
                lllllllllllllIIIIllllIIlIIIllllI -= this.thisEntity.width / 2.0f;
            }
            if (llllIIIIIIIIIII(lllIllllllllllI(lllllllllllllIIIIllllIIlIIIllllI, 0.0f))) {
                lllllllllllllIIIIllllIIlIIIllllI += this.thisEntity.width / 2.0f;
            }
            lllllllllllllIIIIllllIIlIIIlllIl = 0.0f;
            "".length();
            if ((0x7 ^ 0x11 ^ (0x94 ^ 0x87)) <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllllIIlIIIllllI = 0.0f;
            if (llllIIIIIIIIIIl(lllIlllllllllll(lllllllllllllIIIIllllIIlIIIlllIl, 0.0f))) {
                lllllllllllllIIIIllllIIlIIIlllIl -= this.thisEntity.width / 2.0f;
            }
            if (llllIIIIIIIIIII(lllIllllllllllI(lllllllllllllIIIIllllIIlIIIlllIl, 0.0f))) {
                lllllllllllllIIIIllllIIlIIIlllIl += this.thisEntity.width / 2.0f;
            }
        }
        final int lllllllllllllIIIIllllIIlIIIlllII = MathHelper.floor_double(this.thisEntity.posX + lllllllllllllIIIIllllIIlIIIllllI);
        final int lllllllllllllIIIIllllIIlIIIllIll = MathHelper.floor_double(this.thisEntity.posZ + lllllllllllllIIIIllllIIlIIIlllIl);
        final int lllllllllllllIIIIllllIIlIIIllIlI = MathHelper.floor_float(this.thisEntity.width + 1.0f);
        final int lllllllllllllIIIIllllIIlIIIllIIl = MathHelper.floor_float(this.thisEntity.height + lllllllllllllIIIIllllIIlIIlIllII.height + 1.0f);
        final int lllllllllllllIIIIllllIIlIIIllIII = MathHelper.floor_float(this.thisEntity.width + 1.0f);
        if (!llllIIIIIIIIIll(lllllllllllllIIIIllllIIlIIlIlIIl, lllllllllllllIIIIllllIIlIIIlllII) || llllIIIIIIIIlII(lllllllllllllIIIIllllIIlIIlIIlll, lllllllllllllIIIIllllIIlIIIllIll)) {
            final Block lllllllllllllIIIIllllIIlIIIlIlll = this.thisEntity.worldObj.getBlockState(new BlockPos(lllllllllllllIIIIllllIIlIIlIlIIl, lllllllllllllIIIIllllIIlIIlIlIII, lllllllllllllIIIIllllIIlIIlIIlll)).getBlock();
            int n;
            if (lllIlllllllllIl(this.isStairOrSlab(lllllllllllllIIIIllllIIlIIIlIlll) ? 1 : 0) && (!llllIIIIIIIIlIl(lllllllllllllIIIIllllIIlIIIlIlll.getMaterial(), Material.air) || lllIlllllllllIl(this.isStairOrSlab(this.thisEntity.worldObj.getBlockState(new BlockPos(lllllllllllllIIIIllllIIlIIlIlIIl, lllllllllllllIIIIllllIIlIIlIlIII - EntityAIControlledByPlayer.lIlIlIlllllllI[2], lllllllllllllIIIIllllIIlIIlIIlll)).getBlock()) ? 1 : 0))) {
                n = EntityAIControlledByPlayer.lIlIlIlllllllI[2];
                "".length();
                if ((" ".length() ^ (0x83 ^ 0x87)) == 0x0) {
                    return;
                }
            }
            else {
                n = EntityAIControlledByPlayer.lIlIlIlllllllI[1];
            }
            final boolean lllllllllllllIIIIllllIIlIIIlIllI = n != 0;
            if (lllIllllllllIll(lllllllllllllIIIIllllIIlIIIlIllI ? 1 : 0) && lllIlllllllllIl(WalkNodeProcessor.func_176170_a(this.thisEntity.worldObj, this.thisEntity, lllllllllllllIIIIllllIIlIIIlllII, lllllllllllllIIIIllllIIlIIlIlIII, lllllllllllllIIIIllllIIlIIIllIll, lllllllllllllIIIIllllIIlIIIllIlI, lllllllllllllIIIIllllIIlIIIllIIl, lllllllllllllIIIIllllIIlIIIllIII, (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0))) && llllIIIIIIIIIll(EntityAIControlledByPlayer.lIlIlIlllllllI[2], WalkNodeProcessor.func_176170_a(this.thisEntity.worldObj, this.thisEntity, lllllllllllllIIIIllllIIlIIlIlIIl, lllllllllllllIIIIllllIIlIIlIlIII + EntityAIControlledByPlayer.lIlIlIlllllllI[2], lllllllllllllIIIIllllIIlIIlIIlll, lllllllllllllIIIIllllIIlIIIllIlI, lllllllllllllIIIIllllIIlIIIllIIl, lllllllllllllIIIIllllIIlIIIllIII, (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0))) && llllIIIIIIIIIll(EntityAIControlledByPlayer.lIlIlIlllllllI[2], WalkNodeProcessor.func_176170_a(this.thisEntity.worldObj, this.thisEntity, lllllllllllllIIIIllllIIlIIIlllII, lllllllllllllIIIIllllIIlIIlIlIII + EntityAIControlledByPlayer.lIlIlIlllllllI[2], lllllllllllllIIIIllllIIlIIIllIll, lllllllllllllIIIIllllIIlIIIllIlI, lllllllllllllIIIIllllIIlIIIllIIl, lllllllllllllIIIIllllIIlIIIllIII, (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0), (boolean)(EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0)))) {
                lllllllllllllIIIIllllIIlIIlIlIll.getJumpHelper().setJumping();
            }
        }
        if (lllIlllllllllIl(lllllllllllllIIIIllllIIlIIlIllII.capabilities.isCreativeMode ? 1 : 0) && llllIIIIIIIIllI(lllIllllllllllI(this.currentSpeed, this.maxSpeed * 0.5f)) && llllIIIIIIIIIIl(lllIlllllllllll(this.thisEntity.getRNG().nextFloat(), 0.006f)) && lllIlllllllllIl(this.speedBoosted ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIllllIIlIIIlIlIl = lllllllllllllIIIIllllIIlIIlIllII.getHeldItem();
            if (lllIlllllllllII(lllllllllllllIIIIllllIIlIIIlIlIl) && llllIIIIIIIIlIl(lllllllllllllIIIIllllIIlIIIlIlIl.getItem(), Items.carrot_on_a_stick)) {
                lllllllllllllIIIIllllIIlIIIlIlIl.damageItem(EntityAIControlledByPlayer.lIlIlIlllllllI[2], lllllllllllllIIIIllllIIlIIlIllII);
                if (lllIlllllllllIl(lllllllllllllIIIIllllIIlIIIlIlIl.stackSize)) {
                    final ItemStack lllllllllllllIIIIllllIIlIIIlIlII = new ItemStack(Items.fishing_rod);
                    lllllllllllllIIIIllllIIlIIIlIlII.setTagCompound(lllllllllllllIIIIllllIIlIIIlIlIl.getTagCompound());
                    lllllllllllllIIIIllllIIlIIlIllII.inventory.mainInventory[lllllllllllllIIIIllllIIlIIlIllII.inventory.currentItem] = lllllllllllllIIIIllllIIlIIIlIlII;
                }
            }
        }
        this.thisEntity.moveEntityWithHeading(0.0f, lllllllllllllIIIIllllIIlIIlIIllI);
    }
    
    private static boolean lllIlllllllllIl(final int lllllllllllllIIIIllllIIIllIlllIl) {
        return lllllllllllllIIIIllllIIIllIlllIl == 0;
    }
    
    private static boolean lllIllllllllIll(final int lllllllllllllIIIIllllIIIllIlllll) {
        return lllllllllllllIIIIllllIIIllIlllll != 0;
    }
    
    public EntityAIControlledByPlayer(final EntityLiving lllllllllllllIIIIllllIIlIlIlIIII, final float lllllllllllllIIIIllllIIlIlIIllll) {
        this.thisEntity = lllllllllllllIIIIllllIIlIlIlIIII;
        this.maxSpeed = lllllllllllllIIIIllllIIlIlIIllll;
        this.setMutexBits(EntityAIControlledByPlayer.lIlIlIlllllllI[0]);
    }
    
    private static boolean llllIIIIIIIIIII(final int lllllllllllllIIIIllllIIIllIlIlll) {
        return lllllllllllllIIIIllllIIIllIlIlll > 0;
    }
    
    private static boolean llllIIIIIIIIlII(final int lllllllllllllIIIIllllIIIllIlIlII, final int lllllllllllllIIIIllllIIIllIlIIll) {
        return lllllllllllllIIIIllllIIIllIlIlII != lllllllllllllIIIIllllIIIllIlIIll;
    }
    
    public void boostSpeed() {
        this.speedBoosted = (EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0);
        this.speedBoostTime = EntityAIControlledByPlayer.lIlIlIlllllllI[1];
        this.maxSpeedBoostTime = this.thisEntity.getRNG().nextInt(EntityAIControlledByPlayer.lIlIlIlllllllI[3]) + EntityAIControlledByPlayer.lIlIlIlllllllI[4];
    }
    
    private static int lllIllllllllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllIIIIIIIIIll(final int lllllllllllllIIIIllllIIIlllIllII, final int lllllllllllllIIIIllllIIIlllIlIll) {
        return lllllllllllllIIIIllllIIIlllIllII == lllllllllllllIIIIllllIIIlllIlIll;
    }
    
    public boolean isSpeedBoosted() {
        return this.speedBoosted;
    }
    
    @Override
    public void startExecuting() {
        this.currentSpeed = 0.0f;
    }
    
    private static boolean llllIIIIIIIIllI(final int lllllllllllllIIIIllllIIIllIllIll) {
        return lllllllllllllIIIIllllIIIllIllIll >= 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lllIllllllllIll(this.thisEntity.isEntityAlive() ? 1 : 0) && lllIlllllllllII(this.thisEntity.riddenByEntity) && lllIllllllllIll((this.thisEntity.riddenByEntity instanceof EntityPlayer) ? 1 : 0) && (!lllIlllllllllIl(this.speedBoosted ? 1 : 0) || lllIllllllllIll(this.thisEntity.canBeSteered() ? 1 : 0))) {
            return EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0;
        }
        return EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0;
    }
    
    private static void lllIllllllllIlI() {
        (lIlIlIlllllllI = new int[5])[0] = (0xCF ^ 0x9C ^ (0xD0 ^ 0x84));
        EntityAIControlledByPlayer.lIlIlIlllllllI[1] = ((0x6C ^ 0x72) & ~(0xB4 ^ 0xAA));
        EntityAIControlledByPlayer.lIlIlIlllllllI[2] = " ".length();
        EntityAIControlledByPlayer.lIlIlIlllllllI[3] = (0xFFFFF3FB & 0xF4D);
        EntityAIControlledByPlayer.lIlIlIlllllllI[4] = 5 + 11 + 54 + 70;
    }
    
    static {
        lllIllllllllIlI();
    }
    
    private static int llllIIIIIIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllIIIIIIIIlIl(final Object lllllllllllllIIIIllllIIIlllIIIlI, final Object lllllllllllllIIIIllllIIIlllIIIIl) {
        return lllllllllllllIIIIllllIIIlllIIIlI == lllllllllllllIIIIllllIIIlllIIIIl;
    }
    
    public boolean isControlledByPlayer() {
        if (lllIlllllllllIl(this.isSpeedBoosted() ? 1 : 0) && llllIIIIIIIIIII(llllIIIIIIIIlll(this.currentSpeed, this.maxSpeed * 0.3f))) {
            return EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0;
        }
        return EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0;
    }
    
    private static boolean llllIIIIIIIIIIl(final int lllllllllllllIIIIllllIIIllIllIIl) {
        return lllllllllllllIIIIllllIIIllIllIIl < 0;
    }
    
    private boolean isStairOrSlab(final Block lllllllllllllIIIIllllIIIlllllIII) {
        if (lllIlllllllllIl((lllllllllllllIIIIllllIIIlllllIII instanceof BlockStairs) ? 1 : 0) && lllIlllllllllIl((lllllllllllllIIIIllllIIIlllllIII instanceof BlockSlab) ? 1 : 0)) {
            return EntityAIControlledByPlayer.lIlIlIlllllllI[1] != 0;
        }
        return EntityAIControlledByPlayer.lIlIlIlllllllI[2] != 0;
    }
}
