// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import java.util.Collection;
import net.minecraft.util.WeightedRandom;
import net.minecraft.stats.StatList;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.WorldServer;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.WeightedRandomFishable;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;

public class EntityFishHook extends Entity
{
    private /* synthetic */ int xTile;
    private /* synthetic */ double clientMotionZ;
    private /* synthetic */ int ticksInAir;
    private /* synthetic */ double fishYaw;
    public /* synthetic */ Entity caughtEntity;
    private /* synthetic */ int fishPosRotationIncrements;
    private /* synthetic */ int ticksInGround;
    private /* synthetic */ Block inTile;
    private /* synthetic */ int ticksCatchableDelay;
    private /* synthetic */ int ticksCatchable;
    private /* synthetic */ float fishApproachAngle;
    private /* synthetic */ double fishPitch;
    private static final /* synthetic */ List<WeightedRandomFishable> JUNK;
    private /* synthetic */ int ticksCaughtDelay;
    private static final /* synthetic */ int[] llIllllIIlIIII;
    private static final /* synthetic */ List<WeightedRandomFishable> FISH;
    private /* synthetic */ boolean inGround;
    public /* synthetic */ int shake;
    private /* synthetic */ double fishZ;
    private /* synthetic */ double fishY;
    public /* synthetic */ EntityPlayer angler;
    private static final /* synthetic */ List<WeightedRandomFishable> TREASURE;
    private /* synthetic */ double fishX;
    private /* synthetic */ double clientMotionX;
    private static final /* synthetic */ String[] llIllllIIIllIl;
    private /* synthetic */ int yTile;
    private /* synthetic */ int zTile;
    private /* synthetic */ double clientMotionY;
    
    private static String lIIllIlIIlIlIlII(final String llllllllllllIllIIIllIllIIIIllIlI, final String llllllllllllIllIIIllIllIIIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIllIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIllIIIIlIlll.getBytes(StandardCharsets.UTF_8)), EntityFishHook.llIllllIIlIIII[10]), "DES");
            final Cipher llllllllllllIllIIIllIllIIIIlllII = Cipher.getInstance("DES");
            llllllllllllIllIIIllIllIIIIlllII.init(EntityFishHook.llIllllIIlIIII[4], llllllllllllIllIIIllIllIIIIlllIl);
            return new String(llllllllllllIllIIIllIllIIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIllIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIllIIIIllIll) {
            llllllllllllIllIIIllIllIIIIllIll.printStackTrace();
            return null;
        }
    }
    
    private static int lIIllIlIIllIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIllIlIIllIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIllIlIIlllIIII(final int llllllllllllIllIIIllIlIlllIllIll, final int llllllllllllIllIIIllIlIlllIllIIl) {
        return llllllllllllIllIIIllIlIlllIllIll < llllllllllllIllIIIllIlIlllIllIIl;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIllIlIIllIIlll(this.fishPosRotationIncrements)) {
            final double llllllllllllIllIIIllIllIlIllIlll = this.posX + (this.fishX - this.posX) / this.fishPosRotationIncrements;
            final double llllllllllllIllIIIllIllIlIllIllI = this.posY + (this.fishY - this.posY) / this.fishPosRotationIncrements;
            final double llllllllllllIllIIIllIllIlIllIlIl = this.posZ + (this.fishZ - this.posZ) / this.fishPosRotationIncrements;
            final double llllllllllllIllIIIllIllIlIllIlII = MathHelper.wrapAngleTo180_double(this.fishYaw - this.rotationYaw);
            this.rotationYaw += (float)(llllllllllllIllIIIllIllIlIllIlII / this.fishPosRotationIncrements);
            this.rotationPitch += (float)((this.fishPitch - this.rotationPitch) / this.fishPosRotationIncrements);
            this.fishPosRotationIncrements -= EntityFishHook.llIllllIIlIIII[3];
            this.setPosition(llllllllllllIllIIIllIllIlIllIlll, llllllllllllIllIIIllIllIlIllIllI, llllllllllllIllIIIllIllIlIllIlIl);
            this.setRotation(this.rotationYaw, this.rotationPitch);
            "".length();
            if ((0x70 ^ 0x75) == 0x0) {
                return;
            }
        }
        else {
            if (lIIllIlIIllIlIII(this.worldObj.isRemote ? 1 : 0)) {
                final ItemStack llllllllllllIllIIIllIllIlIllIIll = this.angler.getCurrentEquippedItem();
                if (!lIIllIlIIllIlIII(this.angler.isDead ? 1 : 0) || !lIIllIlIIllIIIIl(this.angler.isEntityAlive() ? 1 : 0) || !lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIllIIll) || !lIIllIlIIllIlIlI(llllllllllllIllIIIllIllIlIllIIll.getItem(), Items.fishing_rod) || lIIllIlIIllIIlll(lIIllIlIIllIIIll(this.getDistanceSqToEntity(this.angler), 1024.0))) {
                    this.setDead();
                    this.angler.fishEntity = null;
                    return;
                }
                if (lIIllIlIIllIlIIl(this.caughtEntity)) {
                    if (lIIllIlIIllIlIII(this.caughtEntity.isDead ? 1 : 0)) {
                        this.posX = this.caughtEntity.posX;
                        final double llllllllllllIllIIIllIllIlIllIIlI = this.caughtEntity.height;
                        this.posY = this.caughtEntity.getEntityBoundingBox().minY + llllllllllllIllIIIllIllIlIllIIlI * 0.8;
                        this.posZ = this.caughtEntity.posZ;
                        return;
                    }
                    this.caughtEntity = null;
                }
            }
            if (lIIllIlIIllIIlll(this.shake)) {
                this.shake -= EntityFishHook.llIllllIIlIIII[3];
            }
            if (lIIllIlIIllIIIIl(this.inGround ? 1 : 0)) {
                if (lIIllIlIIllIlIlI(this.worldObj.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock(), this.inTile)) {
                    this.ticksInGround += EntityFishHook.llIllllIIlIIII[3];
                    if (lIIllIlIIllIlIll(this.ticksInGround, EntityFishHook.llIllllIIlIIII[16])) {
                        this.setDead();
                    }
                    return;
                }
                this.inGround = (EntityFishHook.llIllllIIlIIII[1] != 0);
                this.motionX *= this.rand.nextFloat() * 0.2f;
                this.motionY *= this.rand.nextFloat() * 0.2f;
                this.motionZ *= this.rand.nextFloat() * 0.2f;
                this.ticksInGround = EntityFishHook.llIllllIIlIIII[1];
                this.ticksInAir = EntityFishHook.llIllllIIlIIII[1];
                "".length();
                if (((0x9 ^ 0x59) & ~(0x1E ^ 0x4E)) != 0x0) {
                    return;
                }
            }
            else {
                this.ticksInAir += EntityFishHook.llIllllIIlIIII[3];
            }
            Vec3 llllllllllllIllIIIllIllIlIllIIIl = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 llllllllllllIllIIIllIllIlIllIIII = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition llllllllllllIllIIIllIllIlIlIllll = this.worldObj.rayTraceBlocks(llllllllllllIllIIIllIllIlIllIIIl, llllllllllllIllIIIllIllIlIllIIII);
            llllllllllllIllIIIllIllIlIllIIIl = new Vec3(this.posX, this.posY, this.posZ);
            llllllllllllIllIIIllIllIlIllIIII = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIlIllll)) {
                llllllllllllIllIIIllIllIlIllIIII = new Vec3(llllllllllllIllIIIllIllIlIlIllll.hitVec.xCoord, llllllllllllIllIIIllIllIlIlIllll.hitVec.yCoord, llllllllllllIllIIIllIllIlIlIllll.hitVec.zCoord);
            }
            Entity llllllllllllIllIIIllIllIlIlIlllI = null;
            final List<Entity> llllllllllllIllIIIllIllIlIlIllIl = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
            double llllllllllllIllIIIllIllIlIlIllII = 0.0;
            int llllllllllllIllIIIllIllIlIlIlIll = EntityFishHook.llIllllIIlIIII[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIlIIllIllII(llllllllllllIllIIIllIllIlIlIlIll, llllllllllllIllIIIllIllIlIlIllIl.size())) {
                final Entity llllllllllllIllIIIllIllIlIlIlIlI = llllllllllllIllIIIllIllIlIlIllIl.get(llllllllllllIllIIIllIllIlIlIlIll);
                if (lIIllIlIIllIIIIl(llllllllllllIllIIIllIllIlIlIlIlI.canBeCollidedWith() ? 1 : 0) && (!lIIllIlIIllIlIlI(llllllllllllIllIIIllIllIlIlIlIlI, this.angler) || lIIllIlIIllIllII(this.ticksInAir, EntityFishHook.llIllllIIlIIII[7]))) {
                    final float llllllllllllIllIIIllIllIlIlIlIIl = 0.3f;
                    final AxisAlignedBB llllllllllllIllIIIllIllIlIlIlIII = llllllllllllIllIIIllIllIlIlIlIlI.getEntityBoundingBox().expand(llllllllllllIllIIIllIllIlIlIlIIl, llllllllllllIllIIIllIllIlIlIlIIl, llllllllllllIllIIIllIllIlIlIlIIl);
                    final MovingObjectPosition llllllllllllIllIIIllIllIlIlIIlll = llllllllllllIllIIIllIllIlIlIlIII.calculateIntercept(llllllllllllIllIIIllIllIlIllIIIl, llllllllllllIllIIIllIllIlIllIIII);
                    if (lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIlIIlll)) {
                        final double llllllllllllIllIIIllIllIlIlIIllI = llllllllllllIllIIIllIllIlIllIIIl.squareDistanceTo(llllllllllllIllIIIllIllIlIlIIlll.hitVec);
                        if (!lIIllIlIIllIllIl(lIIllIlIIllIIlII(llllllllllllIllIIIllIllIlIlIIllI, llllllllllllIllIIIllIllIlIlIllII)) || lIIllIlIIllIlIII(lIIllIlIIllIIIll(llllllllllllIllIIIllIllIlIlIllII, 0.0))) {
                            llllllllllllIllIIIllIllIlIlIlllI = llllllllllllIllIIIllIllIlIlIlIlI;
                            llllllllllllIllIIIllIllIlIlIllII = llllllllllllIllIIIllIllIlIlIIllI;
                        }
                    }
                }
                ++llllllllllllIllIIIllIllIlIlIlIll;
            }
            if (lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIlIlllI)) {
                llllllllllllIllIIIllIllIlIlIllll = new MovingObjectPosition(llllllllllllIllIIIllIllIlIlIlllI);
            }
            if (lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIlIllll)) {
                if (lIIllIlIIllIlIIl(llllllllllllIllIIIllIllIlIlIllll.entityHit)) {
                    if (lIIllIlIIllIIIIl(llllllllllllIllIIIllIllIlIlIllll.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.angler), 0.0f) ? 1 : 0)) {
                        this.caughtEntity = llllllllllllIllIIIllIllIlIlIllll.entityHit;
                        "".length();
                        if ((0x67 ^ 0x63) <= -" ".length()) {
                            return;
                        }
                    }
                }
                else {
                    this.inGround = (EntityFishHook.llIllllIIlIIII[3] != 0);
                }
            }
            if (lIIllIlIIllIlIII(this.inGround ? 1 : 0)) {
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                final float llllllllllllIllIIIllIllIlIlIIlIl = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
                this.rotationPitch = (float)(MathHelper.func_181159_b(this.motionY, llllllllllllIllIIIllIllIlIlIIlIl) * 180.0 / 3.141592653589793);
                "".length();
                if ("   ".length() > (0x4 ^ 0x0)) {
                    return;
                }
                while (!lIIllIlIIllIllIl(lIIllIlIIllIIlIl(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
                    this.prevRotationPitch -= 360.0f;
                }
                "".length();
                if ((0x6E ^ 0x6A) == 0x0) {
                    return;
                }
                while (!lIIllIlIIllIIIlI(lIIllIlIIllIIllI(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
                    this.prevRotationPitch += 360.0f;
                }
                "".length();
                if (((0x40 ^ 0x6F) & ~(0x76 ^ 0x59)) != 0x0) {
                    return;
                }
                while (!lIIllIlIIllIllIl(lIIllIlIIllIIlIl(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
                    this.prevRotationYaw -= 360.0f;
                }
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIllIlIIllIIIlI(lIIllIlIIllIIllI(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
                    this.prevRotationYaw += 360.0f;
                }
                this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
                this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
                float llllllllllllIllIIIllIllIlIlIIlII = 0.92f;
                if (!lIIllIlIIllIlIII(this.onGround ? 1 : 0) || lIIllIlIIllIIIIl(this.isCollidedHorizontally ? 1 : 0)) {
                    llllllllllllIllIIIllIllIlIlIIlII = 0.5f;
                }
                final int llllllllllllIllIIIllIllIlIlIIIll = EntityFishHook.llIllllIIlIIII[7];
                double llllllllllllIllIIIllIllIlIlIIIlI = 0.0;
                int llllllllllllIllIIIllIllIlIlIIIIl = EntityFishHook.llIllllIIlIIII[1];
                "".length();
                if (((0xF1 ^ 0xA6) & ~(0x3A ^ 0x6D)) > "   ".length()) {
                    return;
                }
                while (!lIIllIlIIllIllII(llllllllllllIllIIIllIllIlIlIIIIl, llllllllllllIllIIIllIllIlIlIIIll)) {
                    final AxisAlignedBB llllllllllllIllIIIllIllIlIlIIIII = this.getEntityBoundingBox();
                    final double llllllllllllIllIIIllIllIlIIlllll = llllllllllllIllIIIllIllIlIlIIIII.maxY - llllllllllllIllIIIllIllIlIlIIIII.minY;
                    final double llllllllllllIllIIIllIllIlIIllllI = llllllllllllIllIIIllIllIlIlIIIII.minY + llllllllllllIllIIIllIllIlIIlllll * llllllllllllIllIIIllIllIlIlIIIIl / llllllllllllIllIIIllIllIlIlIIIll;
                    final double llllllllllllIllIIIllIllIlIIlllIl = llllllllllllIllIIIllIllIlIlIIIII.minY + llllllllllllIllIIIllIllIlIIlllll * (llllllllllllIllIIIllIllIlIlIIIIl + EntityFishHook.llIllllIIlIIII[3]) / llllllllllllIllIIIllIllIlIlIIIll;
                    final AxisAlignedBB llllllllllllIllIIIllIllIlIIlllII = new AxisAlignedBB(llllllllllllIllIIIllIllIlIlIIIII.minX, llllllllllllIllIIIllIllIlIIllllI, llllllllllllIllIIIllIllIlIlIIIII.minZ, llllllllllllIllIIIllIllIlIlIIIII.maxX, llllllllllllIllIIIllIllIlIIlllIl, llllllllllllIllIIIllIllIlIlIIIII.maxZ);
                    if (lIIllIlIIllIIIIl(this.worldObj.isAABBInMaterial(llllllllllllIllIIIllIllIlIIlllII, Material.water) ? 1 : 0)) {
                        llllllllllllIllIIIllIllIlIlIIIlI += 1.0 / llllllllllllIllIIIllIllIlIlIIIll;
                    }
                    ++llllllllllllIllIIIllIllIlIlIIIIl;
                }
                if (lIIllIlIIllIlIII(this.worldObj.isRemote ? 1 : 0) && lIIllIlIIllIIlll(lIIllIlIIllIIIll(llllllllllllIllIIIllIllIlIlIIIlI, 0.0))) {
                    final WorldServer llllllllllllIllIIIllIllIlIIllIll = (WorldServer)this.worldObj;
                    int llllllllllllIllIIIllIllIlIIllIlI = EntityFishHook.llIllllIIlIIII[3];
                    final BlockPos llllllllllllIllIIIllIllIlIIllIIl = new BlockPos(this).up();
                    if (lIIllIlIIllIIIlI(lIIllIlIIllIIlIl(this.rand.nextFloat(), 0.25f)) && lIIllIlIIllIIIIl(this.worldObj.canLightningStrike(llllllllllllIllIIIllIllIlIIllIIl) ? 1 : 0)) {
                        llllllllllllIllIIIllIllIlIIllIlI = EntityFishHook.llIllllIIlIIII[4];
                    }
                    if (lIIllIlIIllIIIlI(lIIllIlIIllIIlIl(this.rand.nextFloat(), 0.5f)) && lIIllIlIIllIlIII(this.worldObj.canSeeSky(llllllllllllIllIIIllIllIlIIllIIl) ? 1 : 0)) {
                        --llllllllllllIllIIIllIllIlIIllIlI;
                    }
                    if (lIIllIlIIllIIlll(this.ticksCatchable)) {
                        this.ticksCatchable -= EntityFishHook.llIllllIIlIIII[3];
                        if (lIIllIlIIllIlllI(this.ticksCatchable)) {
                            this.ticksCaughtDelay = EntityFishHook.llIllllIIlIIII[1];
                            this.ticksCatchableDelay = EntityFishHook.llIllllIIlIIII[1];
                            "".length();
                            if ((0x1 ^ 0x5) == "   ".length()) {
                                return;
                            }
                        }
                    }
                    else if (lIIllIlIIllIIlll(this.ticksCatchableDelay)) {
                        this.ticksCatchableDelay -= llllllllllllIllIIIllIllIlIIllIlI;
                        if (lIIllIlIIllIlllI(this.ticksCatchableDelay)) {
                            this.motionY -= 0.20000000298023224;
                            this.playSound(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[1]], 0.25f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
                            final float llllllllllllIllIIIllIllIlIIllIII = (float)MathHelper.floor_double(this.getEntityBoundingBox().minY);
                            llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX, llllllllllllIllIIIllIllIlIIllIII + 1.0f, this.posZ, (int)(1.0f + this.width * 20.0f), this.width, 0.0, this.width, 0.20000000298023224, new int[EntityFishHook.llIllllIIlIIII[1]]);
                            llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_WAKE, this.posX, llllllllllllIllIIIllIllIlIIllIII + 1.0f, this.posZ, (int)(1.0f + this.width * 20.0f), this.width, 0.0, this.width, 0.20000000298023224, new int[EntityFishHook.llIllllIIlIIII[1]]);
                            this.ticksCatchable = MathHelper.getRandomIntegerInRange(this.rand, EntityFishHook.llIllllIIlIIII[2], EntityFishHook.llIllllIIlIIII[17]);
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        }
                        else {
                            this.fishApproachAngle += (float)(this.rand.nextGaussian() * 4.0);
                            final float llllllllllllIllIIIllIllIlIIlIlll = this.fishApproachAngle * 0.017453292f;
                            final float llllllllllllIllIIIllIllIlIIlIllI = MathHelper.sin(llllllllllllIllIIIllIllIlIIlIlll);
                            final float llllllllllllIllIIIllIllIlIIlIlIl = MathHelper.cos(llllllllllllIllIIIllIllIlIIlIlll);
                            final double llllllllllllIllIIIllIllIlIIlIlII = this.posX + llllllllllllIllIIIllIllIlIIlIllI * this.ticksCatchableDelay * 0.1f;
                            final double llllllllllllIllIIIllIllIlIIlIIll = MathHelper.floor_double(this.getEntityBoundingBox().minY) + 1.0f;
                            final double llllllllllllIllIIIllIllIlIIlIIlI = this.posZ + llllllllllllIllIIIllIllIlIIlIlIl * this.ticksCatchableDelay * 0.1f;
                            final Block llllllllllllIllIIIllIllIlIIlIIIl = llllllllllllIllIIIllIllIlIIllIll.getBlockState(new BlockPos((int)llllllllllllIllIIIllIllIlIIlIlII, (int)llllllllllllIllIIIllIllIlIIlIIll - EntityFishHook.llIllllIIlIIII[3], (int)llllllllllllIllIIIllIllIlIIlIIlI)).getBlock();
                            if (!lIIllIlIIllIllll(llllllllllllIllIIIllIllIlIIlIIIl, Blocks.water) || lIIllIlIIllIlIlI(llllllllllllIllIIIllIllIlIIlIIIl, Blocks.flowing_water)) {
                                if (lIIllIlIIllIIIlI(lIIllIlIIllIIlIl(this.rand.nextFloat(), 0.15f))) {
                                    llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_BUBBLE, llllllllllllIllIIIllIllIlIIlIlII, llllllllllllIllIIIllIllIlIIlIIll - 0.10000000149011612, llllllllllllIllIIIllIllIlIIlIIlI, EntityFishHook.llIllllIIlIIII[3], llllllllllllIllIIIllIllIlIIlIllI, 0.1, llllllllllllIllIIIllIllIlIIlIlIl, 0.0, new int[EntityFishHook.llIllllIIlIIII[1]]);
                                }
                                final float llllllllllllIllIIIllIllIlIIlIIII = llllllllllllIllIIIllIllIlIIlIllI * 0.04f;
                                final float llllllllllllIllIIIllIllIlIIIllll = llllllllllllIllIIIllIllIlIIlIlIl * 0.04f;
                                llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_WAKE, llllllllllllIllIIIllIllIlIIlIlII, llllllllllllIllIIIllIllIlIIlIIll, llllllllllllIllIIIllIllIlIIlIIlI, EntityFishHook.llIllllIIlIIII[1], llllllllllllIllIIIllIllIlIIIllll, 0.01, -llllllllllllIllIIIllIllIlIIlIIII, 1.0, new int[EntityFishHook.llIllllIIlIIII[1]]);
                                llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_WAKE, llllllllllllIllIIIllIllIlIIlIlII, llllllllllllIllIIIllIllIlIIlIIll, llllllllllllIllIIIllIllIlIIlIIlI, EntityFishHook.llIllllIIlIIII[1], -llllllllllllIllIIIllIllIlIIIllll, 0.01, llllllllllllIllIIIllIllIlIIlIIII, 1.0, new int[EntityFishHook.llIllllIIlIIII[1]]);
                                "".length();
                                if ("   ".length() <= "  ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                    else if (lIIllIlIIllIIlll(this.ticksCaughtDelay)) {
                        this.ticksCaughtDelay -= llllllllllllIllIIIllIllIlIIllIlI;
                        float llllllllllllIllIIIllIllIlIIIlllI = 0.15f;
                        if (lIIllIlIIlllIIII(this.ticksCaughtDelay, EntityFishHook.llIllllIIlIIII[18])) {
                            llllllllllllIllIIIllIllIlIIIlllI += (float)((EntityFishHook.llIllllIIlIIII[18] - this.ticksCaughtDelay) * 0.05);
                            "".length();
                            if ((0x96 ^ 0x92) == 0x0) {
                                return;
                            }
                        }
                        else if (lIIllIlIIlllIIII(this.ticksCaughtDelay, EntityFishHook.llIllllIIlIIII[19])) {
                            llllllllllllIllIIIllIllIlIIIlllI += (float)((EntityFishHook.llIllllIIlIIII[19] - this.ticksCaughtDelay) * 0.02);
                            "".length();
                            if ("   ".length() == " ".length()) {
                                return;
                            }
                        }
                        else if (lIIllIlIIlllIIII(this.ticksCaughtDelay, EntityFishHook.llIllllIIlIIII[12])) {
                            llllllllllllIllIIIllIllIlIIIlllI += (float)((EntityFishHook.llIllllIIlIIII[12] - this.ticksCaughtDelay) * 0.01);
                        }
                        if (lIIllIlIIllIIIlI(lIIllIlIIllIIlIl(this.rand.nextFloat(), llllllllllllIllIIIllIllIlIIIlllI))) {
                            final float llllllllllllIllIIIllIllIlIIIllIl = MathHelper.randomFloatClamp(this.rand, 0.0f, 360.0f) * 0.017453292f;
                            final float llllllllllllIllIIIllIllIlIIIllII = MathHelper.randomFloatClamp(this.rand, 25.0f, 60.0f);
                            final double llllllllllllIllIIIllIllIlIIIlIll = this.posX + MathHelper.sin(llllllllllllIllIIIllIllIlIIIllIl) * llllllllllllIllIIIllIllIlIIIllII * 0.1f;
                            final double llllllllllllIllIIIllIllIlIIIlIlI = MathHelper.floor_double(this.getEntityBoundingBox().minY) + 1.0f;
                            final double llllllllllllIllIIIllIllIlIIIlIIl = this.posZ + MathHelper.cos(llllllllllllIllIIIllIllIlIIIllIl) * llllllllllllIllIIIllIllIlIIIllII * 0.1f;
                            final Block llllllllllllIllIIIllIllIlIIIlIII = llllllllllllIllIIIllIllIlIIllIll.getBlockState(new BlockPos((int)llllllllllllIllIIIllIllIlIIIlIll, (int)llllllllllllIllIIIllIllIlIIIlIlI - EntityFishHook.llIllllIIlIIII[3], (int)llllllllllllIllIIIllIllIlIIIlIIl)).getBlock();
                            if (!lIIllIlIIllIllll(llllllllllllIllIIIllIllIlIIIlIII, Blocks.water) || lIIllIlIIllIlIlI(llllllllllllIllIIIllIllIlIIIlIII, Blocks.flowing_water)) {
                                llllllllllllIllIIIllIllIlIIllIll.spawnParticle(EnumParticleTypes.WATER_SPLASH, llllllllllllIllIIIllIllIlIIIlIll, llllllllllllIllIIIllIllIlIIIlIlI, llllllllllllIllIIIllIllIlIIIlIIl, EntityFishHook.llIllllIIlIIII[4] + this.rand.nextInt(EntityFishHook.llIllllIIlIIII[4]), 0.10000000149011612, 0.0, 0.10000000149011612, 0.0, new int[EntityFishHook.llIllllIIlIIII[1]]);
                            }
                        }
                        if (lIIllIlIIllIlllI(this.ticksCaughtDelay)) {
                            this.fishApproachAngle = MathHelper.randomFloatClamp(this.rand, 0.0f, 360.0f);
                            this.ticksCatchableDelay = MathHelper.getRandomIntegerInRange(this.rand, EntityFishHook.llIllllIIlIIII[18], EntityFishHook.llIllllIIlIIII[20]);
                            "".length();
                            if ((0xC0 ^ 0x99 ^ (0xE3 ^ 0xBE)) != (0x15 ^ 0xD ^ (0x7E ^ 0x62))) {
                                return;
                            }
                        }
                    }
                    else {
                        this.ticksCaughtDelay = MathHelper.getRandomIntegerInRange(this.rand, EntityFishHook.llIllllIIlIIII[21], EntityFishHook.llIllllIIlIIII[22]);
                        this.ticksCaughtDelay -= EnchantmentHelper.getLureModifier(this.angler) * EntityFishHook.llIllllIIlIIII[18] * EntityFishHook.llIllllIIlIIII[7];
                    }
                    if (lIIllIlIIllIIlll(this.ticksCatchable)) {
                        this.motionY -= this.rand.nextFloat() * this.rand.nextFloat() * this.rand.nextFloat() * 0.2;
                    }
                }
                final double llllllllllllIllIIIllIllIlIIIIlll = llllllllllllIllIIIllIllIlIlIIIlI * 2.0 - 1.0;
                this.motionY += 0.03999999910593033 * llllllllllllIllIIIllIllIlIIIIlll;
                if (lIIllIlIIllIIlll(lIIllIlIIllIIIll(llllllllllllIllIIIllIllIlIlIIIlI, 0.0))) {
                    llllllllllllIllIIIllIllIlIlIIlII *= (float)0.9;
                    this.motionY *= 0.8;
                }
                this.motionX *= llllllllllllIllIIIllIllIlIlIIlII;
                this.motionY *= llllllllllllIllIIIllIllIlIlIIlII;
                this.motionZ *= llllllllllllIllIIIllIllIlIlIIlII;
                this.setPosition(this.posX, this.posY, this.posZ);
            }
        }
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static void lIIllIlIIlIlIllI() {
        (llIllllIIIllIl = new String[EntityFishHook.llIllllIIlIIII[27]])[EntityFishHook.llIllllIIlIIII[1]] = lIIllIlIIlIlIIlI("e/nqcEDgAMkJTEYtNec9Iw==", "lkZNk");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[3]] = lIIllIlIIlIlIlII("vXxZiR8lm8Q=", "DuTOe");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[4]] = lIIllIlIIlIlIlII("Ez+wuoxlBBY=", "bHjHz");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[5]] = lIIllIlIIlIlIlII("rgTwixB6tvI=", "vaeYu");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[6]] = lIIllIlIIlIlIlII("zN24ra92O8g=", "xXawc");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[7]] = lIIllIlIIlIlIlIl("", "BfowM");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[8]] = lIIllIlIIlIlIIlI("bxvwaQQ4Ya0=", "wYHyt");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[9]] = lIIllIlIIlIlIIlI("cHWt54bV5qmlHOoQf3Irfw==", "yHrIA");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[10]] = lIIllIlIIlIlIlII("q9nbRAFubFs=", "aBlqO");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[11]] = lIIllIlIIlIlIIlI("o/JWYa8FnOo=", "nNtvG");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[2]] = lIIllIlIIlIlIIlI("PswNYfM0tLI=", "djKvi");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[0]] = lIIllIlIIlIlIlIl("OSYnGxY1", "PHsrz");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[23]] = lIIllIlIIlIlIlIl("GxYEDiEX", "rxPgM");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[14]] = lIIllIlIIlIlIlII("qsM55HT/j74=", "vifPH");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[25]] = lIIllIlIIlIlIlIl("ChA7Hhc=", "yxZur");
        EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[26]] = lIIllIlIIlIlIlIl("LikNBR0yKS4=", "GGJwr");
    }
    
    private static boolean lIIllIlIIllIlIll(final int llllllllllllIllIIIllIlIllllIlIIl, final int llllllllllllIllIIIllIlIllllIIlll) {
        return llllllllllllIllIIIllIlIllllIlIIl == llllllllllllIllIIIllIlIllllIIlll;
    }
    
    private static int lIIllIlIIllIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityFishHook(final World llllllllllllIllIIIllllllIIIlIIII, final EntityPlayer llllllllllllIllIIIllllllIIIlIIll) {
        super(llllllllllllIllIIIllllllIIIlIIII);
        this.xTile = EntityFishHook.llIllllIIlIIII[15];
        this.yTile = EntityFishHook.llIllllIIlIIII[15];
        this.zTile = EntityFishHook.llIllllIIlIIII[15];
        this.ignoreFrustumCheck = (EntityFishHook.llIllllIIlIIII[3] != 0);
        this.angler = llllllllllllIllIIIllllllIIIlIIll;
        this.angler.fishEntity = this;
        this.setSize(0.25f, 0.25f);
        this.setLocationAndAngles(llllllllllllIllIIIllllllIIIlIIll.posX, llllllllllllIllIIIllllllIIIlIIll.posY + llllllllllllIllIIIllllllIIIlIIll.getEyeHeight(), llllllllllllIllIIIllllllIIIlIIll.posZ, llllllllllllIllIIIllllllIIIlIIll.rotationYaw, llllllllllllIllIIIllllllIIIlIIll.rotationPitch);
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.posY -= 0.10000000149011612;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.setPosition(this.posX, this.posY, this.posZ);
        final float llllllllllllIllIIIllllllIIIlIIlI = 0.4f;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIIllllllIIIlIIlI;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIIllllllIIIlIIlI;
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIIllllllIIIlIIlI;
        this.handleHookCasting(this.motionX, this.motionY, this.motionZ, 1.5f, 1.0f);
    }
    
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIIllIllIIllIIllI) {
        llllllllllllIllIIIllIllIIllIIllI.setShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[3]], (short)this.xTile);
        llllllllllllIllIIIllIllIIllIIllI.setShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[4]], (short)this.yTile);
        llllllllllllIllIIIllIllIIllIIllI.setShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[5]], (short)this.zTile);
        final ResourceLocation llllllllllllIllIIIllIllIIllIlIII = Block.blockRegistry.getNameForObject(this.inTile);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[6]];
        String string;
        if (lIIllIlIIlllIIIl(llllllllllllIllIIIllIllIIllIlIII)) {
            string = EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[7]];
            "".length();
            if (((39 + 19 - 16 + 119 ^ 152 + 21 - 156 + 137) & (73 + 108 - 59 + 23 ^ 30 + 64 + 31 + 45 ^ -" ".length())) > " ".length()) {
                return;
            }
        }
        else {
            string = llllllllllllIllIIIllIllIIllIlIII.toString();
        }
        llllllllllllIllIIIllIllIIllIIllI.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        llllllllllllIllIIIllIllIIllIIllI.setByte(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[8]], (byte)this.shake);
        final String lllllllllllllIIIIIlIIIlIIllIIlll = EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[9]];
        int n;
        if (lIIllIlIIllIIIIl(this.inGround ? 1 : 0)) {
            n = EntityFishHook.llIllllIIlIIII[3];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            n = EntityFishHook.llIllllIIlIIII[1];
        }
        llllllllllllIllIIIllIllIIllIIllI.setByte(lllllllllllllIIIIIlIIIlIIllIIlll, (byte)n);
    }
    
    private static int lIIllIlIIllIIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIllIlIIllIlIlI(final Object llllllllllllIllIIIllIlIlllIIIlll, final Object llllllllllllIllIIIllIlIlllIIIlIl) {
        return llllllllllllIllIIIllIlIlllIIIlll == llllllllllllIllIIIllIlIlllIIIlIl;
    }
    
    private static boolean lIIllIlIIllIlIII(final int llllllllllllIllIIIllIlIllIlllIlI) {
        return llllllllllllIllIIIllIlIllIlllIlI == 0;
    }
    
    private static int lIIllIlIIlllIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void lIIllIlIIlIlllll() {
        (llIllllIIlIIII = new int[28])[0] = (0x50 ^ 0x5B);
        EntityFishHook.llIllllIIlIIII[1] = ((70 + 12 - 6 + 76 ^ 148 + 7 - 63 + 82) & (0x46 ^ 0x2 ^ (0x4B ^ 0x39) ^ -" ".length()));
        EntityFishHook.llIllllIIlIIII[2] = (0x1 ^ 0xB);
        EntityFishHook.llIllllIIlIIII[3] = " ".length();
        EntityFishHook.llIllllIIlIIII[4] = "  ".length();
        EntityFishHook.llIllllIIlIIII[5] = "   ".length();
        EntityFishHook.llIllllIIlIIII[6] = (0x9A ^ 0x9E);
        EntityFishHook.llIllllIIlIIII[7] = (0x54 ^ 0x51);
        EntityFishHook.llIllllIIlIIII[8] = (0x2 ^ 0x6C ^ (0xF3 ^ 0x9B));
        EntityFishHook.llIllllIIlIIII[9] = (0x57 ^ 0x50);
        EntityFishHook.llIllllIIlIIII[10] = (141 + 19 - 9 + 35 ^ 69 + 122 - 150 + 137);
        EntityFishHook.llIllllIIlIIII[11] = (" ".length() ^ (0x3C ^ 0x34));
        EntityFishHook.llIllllIIlIIII[12] = (0x46 ^ 0x7A);
        EntityFishHook.llIllllIIlIIII[13] = (0x45 ^ 0x5C);
        EntityFishHook.llIllllIIlIIII[14] = (0x95 ^ 0x98);
        EntityFishHook.llIllllIIlIIII[15] = -" ".length();
        EntityFishHook.llIllllIIlIIII[16] = (-(0xFFFFBE87 & 0x6B7B) & (0xFFFFEEFA & 0x3FB7));
        EntityFishHook.llIllllIIlIIII[17] = (0x19 ^ 0x2D ^ (0x2E ^ 0x4));
        EntityFishHook.llIllllIIlIIII[18] = (0x97 ^ 0x83);
        EntityFishHook.llIllllIIlIIII[19] = (0x2B ^ 0x3);
        EntityFishHook.llIllllIIlIIII[20] = (0xFB ^ 0xAB);
        EntityFishHook.llIllllIIlIIII[21] = (0xD8 ^ 0xBC);
        EntityFishHook.llIllllIIlIIII[22] = (-(0xFFFFDED7 & 0x7D7C) & (0xFFFFFFDF & 0x5FF7));
        EntityFishHook.llIllllIIlIIII[23] = (0x2C ^ 0x6F ^ (0xF2 ^ 0xBD));
        EntityFishHook.llIllllIIlIIII[24] = (0x46 ^ 0x10) + (67 + 26 - 0 + 49) - (0xA7 ^ 0x88) + (0x30 ^ 0x7A);
        EntityFishHook.llIllllIIlIIII[25] = (0x60 ^ 0x6E);
        EntityFishHook.llIllllIIlIIII[26] = (0x60 ^ 0x6F);
        EntityFishHook.llIllllIIlIIII[27] = (51 + 48 - 98 + 139 ^ 121 + 140 - 209 + 104);
    }
    
    @Override
    public void setDead() {
        super.setDead();
        if (lIIllIlIIllIlIIl(this.angler)) {
            this.angler.fishEntity = null;
        }
    }
    
    public int handleHookRetraction() {
        if (lIIllIlIIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            return EntityFishHook.llIllllIIlIIII[1];
        }
        int llllllllllllIllIIIllIllIIlIlIIIl = EntityFishHook.llIllllIIlIIII[1];
        if (lIIllIlIIllIlIIl(this.caughtEntity)) {
            final double llllllllllllIllIIIllIllIIlIlIIII = this.angler.posX - this.posX;
            final double llllllllllllIllIIIllIllIIlIIllll = this.angler.posY - this.posY;
            final double llllllllllllIllIIIllIllIIlIIlllI = this.angler.posZ - this.posZ;
            final double llllllllllllIllIIIllIllIIlIIllIl = MathHelper.sqrt_double(llllllllllllIllIIIllIllIIlIlIIII * llllllllllllIllIIIllIllIIlIlIIII + llllllllllllIllIIIllIllIIlIIllll * llllllllllllIllIIIllIllIIlIIllll + llllllllllllIllIIIllIllIIlIIlllI * llllllllllllIllIIIllIllIIlIIlllI);
            final double llllllllllllIllIIIllIllIIlIIllII = 0.1;
            final Entity caughtEntity = this.caughtEntity;
            caughtEntity.motionX += llllllllllllIllIIIllIllIIlIlIIII * llllllllllllIllIIIllIllIIlIIllII;
            final Entity caughtEntity2 = this.caughtEntity;
            caughtEntity2.motionY += llllllllllllIllIIIllIllIIlIIllll * llllllllllllIllIIIllIllIIlIIllII + MathHelper.sqrt_double(llllllllllllIllIIIllIllIIlIIllIl) * 0.08;
            final Entity caughtEntity3 = this.caughtEntity;
            caughtEntity3.motionZ += llllllllllllIllIIIllIllIIlIIlllI * llllllllllllIllIIIllIllIIlIIllII;
            llllllllllllIllIIIllIllIIlIlIIIl = EntityFishHook.llIllllIIlIIII[5];
            "".length();
            if (null != null) {
                return (0xA8 ^ 0x9C) & ~(0x33 ^ 0x7);
            }
        }
        else if (lIIllIlIIllIIlll(this.ticksCatchable)) {
            final EntityItem llllllllllllIllIIIllIllIIlIIlIll = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, this.getFishingResult());
            final double llllllllllllIllIIIllIllIIlIIlIlI = this.angler.posX - this.posX;
            final double llllllllllllIllIIIllIllIIlIIlIIl = this.angler.posY - this.posY;
            final double llllllllllllIllIIIllIllIIlIIlIII = this.angler.posZ - this.posZ;
            final double llllllllllllIllIIIllIllIIlIIIlll = MathHelper.sqrt_double(llllllllllllIllIIIllIllIIlIIlIlI * llllllllllllIllIIIllIllIIlIIlIlI + llllllllllllIllIIIllIllIIlIIlIIl * llllllllllllIllIIIllIllIIlIIlIIl + llllllllllllIllIIIllIllIIlIIlIII * llllllllllllIllIIIllIllIIlIIlIII);
            final double llllllllllllIllIIIllIllIIlIIIllI = 0.1;
            llllllllllllIllIIIllIllIIlIIlIll.motionX = llllllllllllIllIIIllIllIIlIIlIlI * llllllllllllIllIIIllIllIIlIIIllI;
            llllllllllllIllIIIllIllIIlIIlIll.motionY = llllllllllllIllIIIllIllIIlIIlIIl * llllllllllllIllIIIllIllIIlIIIllI + MathHelper.sqrt_double(llllllllllllIllIIIllIllIIlIIIlll) * 0.08;
            llllllllllllIllIIIllIllIIlIIlIll.motionZ = llllllllllllIllIIIllIllIIlIIlIII * llllllllllllIllIIIllIllIIlIIIllI;
            this.worldObj.spawnEntityInWorld(llllllllllllIllIIIllIllIIlIIlIll);
            "".length();
            this.angler.worldObj.spawnEntityInWorld(new EntityXPOrb(this.angler.worldObj, this.angler.posX, this.angler.posY + 0.5, this.angler.posZ + 0.5, this.rand.nextInt(EntityFishHook.llIllllIIlIIII[8]) + EntityFishHook.llIllllIIlIIII[3]));
            "".length();
            llllllllllllIllIIIllIllIIlIlIIIl = EntityFishHook.llIllllIIlIIII[3];
        }
        if (lIIllIlIIllIIIIl(this.inGround ? 1 : 0)) {
            llllllllllllIllIIIllIllIIlIlIIIl = EntityFishHook.llIllllIIlIIII[4];
        }
        this.setDead();
        this.angler.fishEntity = null;
        return llllllllllllIllIIIllIllIIlIlIIIl;
    }
    
    @Override
    public void setPositionAndRotation2(final double llllllllllllIllIIIlllllIlllIIIll, final double llllllllllllIllIIIlllllIllIllIlI, final double llllllllllllIllIIIlllllIllIllIIl, final float llllllllllllIllIIIlllllIlllIIIII, final float llllllllllllIllIIIlllllIllIlllll, final int llllllllllllIllIIIlllllIllIllllI, final boolean llllllllllllIllIIIlllllIllIlllIl) {
        this.fishX = llllllllllllIllIIIlllllIlllIIIll;
        this.fishY = llllllllllllIllIIIlllllIllIllIlI;
        this.fishZ = llllllllllllIllIIIlllllIllIllIIl;
        this.fishYaw = llllllllllllIllIIIlllllIlllIIIII;
        this.fishPitch = llllllllllllIllIIIlllllIllIlllll;
        this.fishPosRotationIncrements = llllllllllllIllIIIlllllIllIllllI;
        this.motionX = this.clientMotionX;
        this.motionY = this.clientMotionY;
        this.motionZ = this.clientMotionZ;
    }
    
    private static boolean lIIllIlIIllIlIIl(final Object llllllllllllIllIIIllIlIlllIIlllI) {
        return llllllllllllIllIIIllIlIlllIIlllI != null;
    }
    
    private static String lIIllIlIIlIlIIlI(final String llllllllllllIllIIIllIllIIIIIlIll, final String llllllllllllIllIIIllIllIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIllIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIllIIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIllIIIIIllll.init(EntityFishHook.llIllllIIlIIII[4], llllllllllllIllIIIllIllIIIIlIIII);
            return new String(llllllllllllIllIIIllIllIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIllIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIllIIIIIlllI) {
            llllllllllllIllIIIllIllIIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIlIIllIllll(final Object llllllllllllIllIIIllIlIlllIlIIll, final Object llllllllllllIllIIIllIlIlllIlIIlI) {
        return llllllllllllIllIIIllIlIlllIlIIll != llllllllllllIllIIIllIlIlllIlIIlI;
    }
    
    private static boolean lIIllIlIIllIIIIl(final int llllllllllllIllIIIllIlIllIllllIl) {
        return llllllllllllIllIIIllIlIllIllllIl != 0;
    }
    
    private static boolean lIIllIlIIlllIIIl(final Object llllllllllllIllIIIllIlIlllIIIIII) {
        return llllllllllllIllIIIllIlIlllIIIIII == null;
    }
    
    public static List<WeightedRandomFishable> func_174855_j() {
        return EntityFishHook.FISH;
    }
    
    private static boolean lIIllIlIIllIlllI(final int llllllllllllIllIIIllIlIllIlIlIlI) {
        return llllllllllllIllIIIllIlIllIlIlIlI <= 0;
    }
    
    static {
        lIIllIlIIlIlllll();
        lIIllIlIIlIlIllI();
        final WeightedRandomFishable[] a = new WeightedRandomFishable[EntityFishHook.llIllllIIlIIII[0]];
        a[EntityFishHook.llIllllIIlIIII[1]] = new WeightedRandomFishable(new ItemStack(Items.leather_boots), EntityFishHook.llIllllIIlIIII[2]).setMaxDamagePercent(0.9f);
        a[EntityFishHook.llIllllIIlIIII[3]] = new WeightedRandomFishable(new ItemStack(Items.leather), EntityFishHook.llIllllIIlIIII[2]);
        a[EntityFishHook.llIllllIIlIIII[4]] = new WeightedRandomFishable(new ItemStack(Items.bone), EntityFishHook.llIllllIIlIIII[2]);
        a[EntityFishHook.llIllllIIlIIII[5]] = new WeightedRandomFishable(new ItemStack(Items.potionitem), EntityFishHook.llIllllIIlIIII[2]);
        a[EntityFishHook.llIllllIIlIIII[6]] = new WeightedRandomFishable(new ItemStack(Items.string), EntityFishHook.llIllllIIlIIII[7]);
        a[EntityFishHook.llIllllIIlIIII[7]] = new WeightedRandomFishable(new ItemStack(Items.fishing_rod), EntityFishHook.llIllllIIlIIII[4]).setMaxDamagePercent(0.9f);
        a[EntityFishHook.llIllllIIlIIII[8]] = new WeightedRandomFishable(new ItemStack(Items.bowl), EntityFishHook.llIllllIIlIIII[2]);
        a[EntityFishHook.llIllllIIlIIII[9]] = new WeightedRandomFishable(new ItemStack(Items.stick), EntityFishHook.llIllllIIlIIII[7]);
        a[EntityFishHook.llIllllIIlIIII[10]] = new WeightedRandomFishable(new ItemStack(Items.dye, EntityFishHook.llIllllIIlIIII[2], EnumDyeColor.BLACK.getDyeDamage()), EntityFishHook.llIllllIIlIIII[3]);
        a[EntityFishHook.llIllllIIlIIII[11]] = new WeightedRandomFishable(new ItemStack(Blocks.tripwire_hook), EntityFishHook.llIllllIIlIIII[2]);
        a[EntityFishHook.llIllllIIlIIII[2]] = new WeightedRandomFishable(new ItemStack(Items.rotten_flesh), EntityFishHook.llIllllIIlIIII[2]);
        JUNK = Arrays.asList(a);
        final WeightedRandomFishable[] a2 = new WeightedRandomFishable[EntityFishHook.llIllllIIlIIII[8]];
        a2[EntityFishHook.llIllllIIlIIII[1]] = new WeightedRandomFishable(new ItemStack(Blocks.waterlily), EntityFishHook.llIllllIIlIIII[3]);
        a2[EntityFishHook.llIllllIIlIIII[3]] = new WeightedRandomFishable(new ItemStack(Items.name_tag), EntityFishHook.llIllllIIlIIII[3]);
        a2[EntityFishHook.llIllllIIlIIII[4]] = new WeightedRandomFishable(new ItemStack(Items.saddle), EntityFishHook.llIllllIIlIIII[3]);
        a2[EntityFishHook.llIllllIIlIIII[5]] = new WeightedRandomFishable(new ItemStack(Items.bow), EntityFishHook.llIllllIIlIIII[3]).setMaxDamagePercent(0.25f).setEnchantable();
        a2[EntityFishHook.llIllllIIlIIII[6]] = new WeightedRandomFishable(new ItemStack(Items.fishing_rod), EntityFishHook.llIllllIIlIIII[3]).setMaxDamagePercent(0.25f).setEnchantable();
        a2[EntityFishHook.llIllllIIlIIII[7]] = new WeightedRandomFishable(new ItemStack(Items.book), EntityFishHook.llIllllIIlIIII[3]).setEnchantable();
        TREASURE = Arrays.asList(a2);
        final WeightedRandomFishable[] a3 = new WeightedRandomFishable[EntityFishHook.llIllllIIlIIII[6]];
        a3[EntityFishHook.llIllllIIlIIII[1]] = new WeightedRandomFishable(new ItemStack(Items.fish, EntityFishHook.llIllllIIlIIII[3], ItemFishFood.FishType.COD.getMetadata()), EntityFishHook.llIllllIIlIIII[12]);
        a3[EntityFishHook.llIllllIIlIIII[3]] = new WeightedRandomFishable(new ItemStack(Items.fish, EntityFishHook.llIllllIIlIIII[3], ItemFishFood.FishType.SALMON.getMetadata()), EntityFishHook.llIllllIIlIIII[13]);
        a3[EntityFishHook.llIllllIIlIIII[4]] = new WeightedRandomFishable(new ItemStack(Items.fish, EntityFishHook.llIllllIIlIIII[3], ItemFishFood.FishType.CLOWNFISH.getMetadata()), EntityFishHook.llIllllIIlIIII[4]);
        a3[EntityFishHook.llIllllIIlIIII[5]] = new WeightedRandomFishable(new ItemStack(Items.fish, EntityFishHook.llIllllIIlIIII[3], ItemFishFood.FishType.PUFFERFISH.getMetadata()), EntityFishHook.llIllllIIlIIII[14]);
        FISH = Arrays.asList(a3);
    }
    
    public EntityFishHook(final World llllllllllllIllIIIllllllIIlIIlII, final double llllllllllllIllIIIllllllIIIlllIl, final double llllllllllllIllIIIllllllIIlIIIlI, final double llllllllllllIllIIIllllllIIIllIll, final EntityPlayer llllllllllllIllIIIllllllIIIllIlI) {
        this(llllllllllllIllIIIllllllIIlIIlII);
        this.setPosition(llllllllllllIllIIIllllllIIIlllIl, llllllllllllIllIIIllllllIIlIIIlI, llllllllllllIllIIIllllllIIIllIll);
        this.ignoreFrustumCheck = (EntityFishHook.llIllllIIlIIII[3] != 0);
        this.angler = llllllllllllIllIIIllllllIIIllIlI;
        llllllllllllIllIIIllllllIIIllIlI.fishEntity = this;
    }
    
    public EntityFishHook(final World llllllllllllIllIIIllllllIIlIlllI) {
        super(llllllllllllIllIIIllllllIIlIlllI);
        this.xTile = EntityFishHook.llIllllIIlIIII[15];
        this.yTile = EntityFishHook.llIllllIIlIIII[15];
        this.zTile = EntityFishHook.llIllllIIlIIII[15];
        this.setSize(0.25f, 0.25f);
        this.ignoreFrustumCheck = (EntityFishHook.llIllllIIlIIII[3] != 0);
    }
    
    private static boolean lIIllIlIIllIIlll(final int llllllllllllIllIIIllIlIllIlIIllI) {
        return llllllllllllIllIIIllIlIllIlIIllI > 0;
    }
    
    public void handleHookCasting(double llllllllllllIllIIIlllllIlllllIlI, double llllllllllllIllIIIlllllIllllIIIl, double llllllllllllIllIIIlllllIlllllIII, final float llllllllllllIllIIIlllllIllllIlll, final float llllllllllllIllIIIlllllIllllIllI) {
        final float llllllllllllIllIIIlllllIllllIlIl = MathHelper.sqrt_double(llllllllllllIllIIIlllllIlllllIlI * llllllllllllIllIIIlllllIlllllIlI + llllllllllllIllIIIlllllIllllIIIl * llllllllllllIllIIIlllllIllllIIIl + llllllllllllIllIIIlllllIlllllIII * llllllllllllIllIIIlllllIlllllIII);
        llllllllllllIllIIIlllllIlllllIlI /= llllllllllllIllIIIlllllIllllIlIl;
        llllllllllllIllIIIlllllIllllIIIl /= llllllllllllIllIIIlllllIllllIlIl;
        llllllllllllIllIIIlllllIlllllIII /= llllllllllllIllIIIlllllIllllIlIl;
        llllllllllllIllIIIlllllIlllllIlI += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIllIIIlllllIllllIllI;
        llllllllllllIllIIIlllllIllllIIIl += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIllIIIlllllIllllIllI;
        llllllllllllIllIIIlllllIlllllIII += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIllIIIlllllIllllIllI;
        llllllllllllIllIIIlllllIlllllIlI *= llllllllllllIllIIIlllllIllllIlll;
        llllllllllllIllIIIlllllIllllIIIl *= llllllllllllIllIIIlllllIllllIlll;
        llllllllllllIllIIIlllllIlllllIII *= llllllllllllIllIIIlllllIllllIlll;
        this.motionX = llllllllllllIllIIIlllllIlllllIlI;
        this.motionY = llllllllllllIllIIIlllllIllllIIIl;
        this.motionZ = llllllllllllIllIIIlllllIlllllIII;
        final float llllllllllllIllIIIlllllIllllIlII = MathHelper.sqrt_double(llllllllllllIllIIIlllllIlllllIlI * llllllllllllIllIIIlllllIlllllIlI + llllllllllllIllIIIlllllIlllllIII * llllllllllllIllIIIlllllIlllllIII);
        final float n = (float)(MathHelper.func_181159_b(llllllllllllIllIIIlllllIlllllIlI, llllllllllllIllIIIlllllIlllllIII) * 180.0 / 3.141592653589793);
        this.rotationYaw = n;
        this.prevRotationYaw = n;
        final float n2 = (float)(MathHelper.func_181159_b(llllllllllllIllIIIlllllIllllIIIl, llllllllllllIllIIIlllllIllllIlII) * 180.0 / 3.141592653589793);
        this.rotationPitch = n2;
        this.prevRotationPitch = n2;
        this.ticksInGround = EntityFishHook.llIllllIIlIIII[1];
    }
    
    private static String lIIllIlIIlIlIlIl(String llllllllllllIllIIIllIlIllllllIII, final String llllllllllllIllIIIllIlIlllllllII) {
        llllllllllllIllIIIllIlIllllllIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllIlIllllllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIlIllllllIll = new StringBuilder();
        final char[] llllllllllllIllIIIllIlIllllllIlI = llllllllllllIllIIIllIlIlllllllII.toCharArray();
        int llllllllllllIllIIIllIlIllllllIIl = EntityFishHook.llIllllIIlIIII[1];
        final Exception llllllllllllIllIIIllIlIlllllIIll = (Object)((String)llllllllllllIllIIIllIlIllllllIII).toCharArray();
        final Exception llllllllllllIllIIIllIlIlllllIIlI = (Exception)llllllllllllIllIIIllIlIlllllIIll.length;
        short llllllllllllIllIIIllIlIlllllIIIl = (short)EntityFishHook.llIllllIIlIIII[1];
        while (lIIllIlIIlllIIII(llllllllllllIllIIIllIlIlllllIIIl, (int)llllllllllllIllIIIllIlIlllllIIlI)) {
            final char llllllllllllIllIIIllIlIllllllllI = llllllllllllIllIIIllIlIlllllIIll[llllllllllllIllIIIllIlIlllllIIIl];
            llllllllllllIllIIIllIlIllllllIll.append((char)(llllllllllllIllIIIllIlIllllllllI ^ llllllllllllIllIIIllIlIllllllIlI[llllllllllllIllIIIllIlIllllllIIl % llllllllllllIllIIIllIlIllllllIlI.length]));
            "".length();
            ++llllllllllllIllIIIllIlIllllllIIl;
            ++llllllllllllIllIIIllIlIlllllIIIl;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIlIllllllIll);
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIllIIIllllllIIIIlIII) {
        double llllllllllllIllIIIllllllIIIIIlll = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0;
        if (lIIllIlIIllIIIIl(Double.isNaN(llllllllllllIllIIIllllllIIIIIlll) ? 1 : 0)) {
            llllllllllllIllIIIllllllIIIIIlll = 4.0;
        }
        llllllllllllIllIIIllllllIIIIIlll *= 64.0;
        if (lIIllIlIIllIIIlI(lIIllIlIIllIIIII(llllllllllllIllIIIllllllIIIIlIII, llllllllllllIllIIIllllllIIIIIlll * llllllllllllIllIIIllllllIIIIIlll))) {
            return EntityFishHook.llIllllIIlIIII[3] != 0;
        }
        return EntityFishHook.llIllllIIlIIII[1] != 0;
    }
    
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIIllIllIIllIIIIl) {
        this.xTile = llllllllllllIllIIIllIllIIllIIIIl.getShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[10]]);
        this.yTile = llllllllllllIllIIIllIllIIllIIIIl.getShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[11]]);
        this.zTile = llllllllllllIllIIIllIllIIllIIIIl.getShort(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[2]]);
        if (lIIllIlIIllIIIIl(llllllllllllIllIIIllIllIIllIIIIl.hasKey(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[0]], EntityFishHook.llIllllIIlIIII[10]) ? 1 : 0)) {
            this.inTile = Block.getBlockFromName(llllllllllllIllIIIllIllIIllIIIIl.getString(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[23]]));
            "".length();
            if ((50 + 138 - 109 + 87 ^ 156 + 76 - 92 + 23) <= 0) {
                return;
            }
        }
        else {
            this.inTile = Block.getBlockById(llllllllllllIllIIIllIllIIllIIIIl.getByte(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[14]]) & EntityFishHook.llIllllIIlIIII[24]);
        }
        this.shake = (llllllllllllIllIIIllIllIIllIIIIl.getByte(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[25]]) & EntityFishHook.llIllllIIlIIII[24]);
        int inGround;
        if (lIIllIlIIllIlIll(llllllllllllIllIIIllIllIIllIIIIl.getByte(EntityFishHook.llIllllIIIllIl[EntityFishHook.llIllllIIlIIII[26]]), EntityFishHook.llIllllIIlIIII[3])) {
            inGround = EntityFishHook.llIllllIIlIIII[3];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            inGround = EntityFishHook.llIllllIIlIIII[1];
        }
        this.inGround = (inGround != 0);
    }
    
    private ItemStack getFishingResult() {
        float llllllllllllIllIIIllIllIIIllIIIl = this.worldObj.rand.nextFloat();
        final int llllllllllllIllIIIllIllIIIllIIII = EnchantmentHelper.getLuckOfSeaModifier(this.angler);
        final int llllllllllllIllIIIllIllIIIlIllll = EnchantmentHelper.getLureModifier(this.angler);
        float llllllllllllIllIIIllIllIIIlIlllI = 0.1f - llllllllllllIllIIIllIllIIIllIIII * 0.025f - llllllllllllIllIIIllIllIIIlIllll * 0.01f;
        float llllllllllllIllIIIllIllIIIlIllIl = 0.05f + llllllllllllIllIIIllIllIIIllIIII * 0.01f - llllllllllllIllIIIllIllIIIlIllll * 0.01f;
        llllllllllllIllIIIllIllIIIlIlllI = MathHelper.clamp_float(llllllllllllIllIIIllIllIIIlIlllI, 0.0f, 1.0f);
        llllllllllllIllIIIllIllIIIlIllIl = MathHelper.clamp_float(llllllllllllIllIIIllIllIIIlIllIl, 0.0f, 1.0f);
        if (lIIllIlIIllIIIlI(lIIllIlIIlllIIlI(llllllllllllIllIIIllIllIIIllIIIl, llllllllllllIllIIIllIllIIIlIlllI))) {
            this.angler.triggerAchievement(StatList.junkFishedStat);
            return WeightedRandom.getRandomItem(this.rand, EntityFishHook.JUNK).getItemStack(this.rand);
        }
        llllllllllllIllIIIllIllIIIllIIIl -= llllllllllllIllIIIllIllIIIlIlllI;
        if (lIIllIlIIllIIIlI(lIIllIlIIlllIIlI(llllllllllllIllIIIllIllIIIllIIIl, llllllllllllIllIIIllIllIIIlIllIl))) {
            this.angler.triggerAchievement(StatList.treasureFishedStat);
            return WeightedRandom.getRandomItem(this.rand, EntityFishHook.TREASURE).getItemStack(this.rand);
        }
        final float llllllllllllIllIIIllIllIIIlIllII = llllllllllllIllIIIllIllIIIllIIIl - llllllllllllIllIIIllIllIIIlIllIl;
        this.angler.triggerAchievement(StatList.fishCaughtStat);
        return WeightedRandom.getRandomItem(this.rand, EntityFishHook.FISH).getItemStack(this.rand);
    }
    
    private static boolean lIIllIlIIllIllIl(final int llllllllllllIllIIIllIlIllIllIlIl) {
        return llllllllllllIllIIIllIlIllIllIlIl >= 0;
    }
    
    private static boolean lIIllIlIIllIIIlI(final int llllllllllllIllIIIllIlIllIlIllll) {
        return llllllllllllIllIIIllIlIllIlIllll < 0;
    }
    
    private static int lIIllIlIIllIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void setVelocity(final double llllllllllllIllIIIlllllIllIlIIII, final double llllllllllllIllIIIllIllIllIlIIll, final double llllllllllllIllIIIllIllIllIlIIlI) {
        this.motionX = llllllllllllIllIIIlllllIllIlIIII;
        this.clientMotionX = llllllllllllIllIIIlllllIllIlIIII;
        this.motionY = llllllllllllIllIIIllIllIllIlIIll;
        this.clientMotionY = llllllllllllIllIIIllIllIllIlIIll;
        this.motionZ = llllllllllllIllIIIllIllIllIlIIlI;
        this.clientMotionZ = llllllllllllIllIIIllIllIllIlIIlI;
    }
    
    private static boolean lIIllIlIIllIllII(final int llllllllllllIllIIIllIlIllllIIIll, final int llllllllllllIllIIIllIlIllllIIIlI) {
        return llllllllllllIllIIIllIlIllllIIIll >= llllllllllllIllIIIllIlIllllIIIlI;
    }
}
