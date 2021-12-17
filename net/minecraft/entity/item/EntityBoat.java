// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.Entity;

public class EntityBoat extends Entity
{
    private /* synthetic */ double boatZ;
    private /* synthetic */ double velocityZ;
    private /* synthetic */ double boatPitch;
    private static final /* synthetic */ String[] lllIIlIIlllIIl;
    private /* synthetic */ double boatX;
    private static final /* synthetic */ int[] lllIIlIIlllIll;
    private /* synthetic */ double velocityX;
    private /* synthetic */ double velocityY;
    private /* synthetic */ double boatY;
    private /* synthetic */ int boatPosRotationIncrements;
    private /* synthetic */ boolean isBoatEmpty;
    private /* synthetic */ double speedMultiplier;
    private /* synthetic */ double boatYaw;
    
    private static boolean lIIlllllIllllIll(final Object llllllllllllIlIllllIlIlIlIIIIIIl, final Object llllllllllllIlIllllIlIlIlIIIIIII) {
        return llllllllllllIlIllllIlIlIlIIIIIIl != llllllllllllIlIllllIlIlIlIIIIIII;
    }
    
    private static int lIIlllllIlllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setForwardDirection(final int llllllllllllIlIllllIlIlIlIllllII) {
        this.dataWatcher.updateObject(EntityBoat.lllIIlIIlllIll[3], llllllllllllIlIllllIlIlIlIllllII);
    }
    
    private static boolean lIIlllllIlllIIII(final Object llllllllllllIlIllllIlIlIIllllllI) {
        return llllllllllllIlIllllIlIlIIllllllI != null;
    }
    
    private static int lIIlllllIlllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlllllIllIlllI(final int llllllllllllIlIllllIlIlIIllllIII) {
        return llllllllllllIlIllllIlIlIIllllIII != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBox(final Entity llllllllllllIlIllllIlIlllIIllIll) {
        return llllllllllllIlIllllIlIlllIIllIll.getEntityBoundingBox();
    }
    
    @Override
    public void performHurtAnimation() {
        this.setForwardDirection(-this.getForwardDirection());
        this.setTimeSinceHit(EntityBoat.lllIIlIIlllIll[5]);
        this.setDamageTaken(this.getDamageTaken() * 11.0f);
    }
    
    private static boolean lIIlllllIllllIII(final int llllllllllllIlIllllIlIlIlIIIlIIl, final int llllllllllllIlIllllIlIlIlIIIlIII) {
        return llllllllllllIlIllllIlIlIlIIIlIIl >= llllllllllllIlIllllIlIlIlIIIlIII;
    }
    
    public EntityBoat(final World llllllllllllIlIllllIlIlllIlIIlIl) {
        super(llllllllllllIlIllllIlIlllIlIIlIl);
        this.isBoatEmpty = (EntityBoat.lllIIlIIlllIll[0] != 0);
        this.speedMultiplier = 0.07;
        this.preventEntitySpawning = (EntityBoat.lllIIlIIlllIll[0] != 0);
        this.setSize(1.5f, 0.6f);
    }
    
    private static boolean lIIlllllIllIllll(final int llllllllllllIlIllllIlIlIIlllIllI) {
        return llllllllllllIlIllllIlIlIIlllIllI == 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIlllllIlllIIlI(this.getTimeSinceHit())) {
            this.setTimeSinceHit(this.getTimeSinceHit() - EntityBoat.lllIIlIIlllIll[0]);
        }
        if (lIIlllllIlllIIlI(lIIlllllIlllIlIl(this.getDamageTaken(), 0.0f))) {
            this.setDamageTaken(this.getDamageTaken() - 1.0f);
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int llllllllllllIlIllllIlIllIIllIIIl = EntityBoat.lllIIlIIlllIll[6];
        double llllllllllllIlIllllIlIllIIllIIII = 0.0;
        int llllllllllllIlIllllIlIllIIlIllll = EntityBoat.lllIIlIIlllIll[1];
        "".length();
        if ((92 + 155 - 151 + 61 ^ 96 + 79 - 129 + 107) <= 0) {
            return;
        }
        while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIlIllll, llllllllllllIlIllllIlIllIIllIIIl)) {
            final double llllllllllllIlIllllIlIllIIlIlllI = this.getEntityBoundingBox().minY + (this.getEntityBoundingBox().maxY - this.getEntityBoundingBox().minY) * (llllllllllllIlIllllIlIllIIlIllll + EntityBoat.lllIIlIIlllIll[1]) / llllllllllllIlIllllIlIllIIllIIIl - 0.125;
            final double llllllllllllIlIllllIlIllIIlIllIl = this.getEntityBoundingBox().minY + (this.getEntityBoundingBox().maxY - this.getEntityBoundingBox().minY) * (llllllllllllIlIllllIlIllIIlIllll + EntityBoat.lllIIlIIlllIll[0]) / llllllllllllIlIllllIlIllIIllIIIl - 0.125;
            final AxisAlignedBB llllllllllllIlIllllIlIllIIlIllII = new AxisAlignedBB(this.getEntityBoundingBox().minX, llllllllllllIlIllllIlIllIIlIlllI, this.getEntityBoundingBox().minZ, this.getEntityBoundingBox().maxX, llllllllllllIlIllllIlIllIIlIllIl, this.getEntityBoundingBox().maxZ);
            if (lIIlllllIllIlllI(this.worldObj.isAABBInMaterial(llllllllllllIlIllllIlIllIIlIllII, Material.water) ? 1 : 0)) {
                llllllllllllIlIllllIlIllIIllIIII += 1.0 / llllllllllllIlIllllIlIllIIllIIIl;
            }
            ++llllllllllllIlIllllIlIllIIlIllll;
        }
        final double llllllllllllIlIllllIlIllIIlIlIll = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        if (lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIlIlIll, 0.2975))) {
            final double llllllllllllIlIllllIlIllIIlIlIlI = Math.cos(this.rotationYaw * 3.141592653589793 / 180.0);
            final double llllllllllllIlIllllIlIllIIlIlIIl = Math.sin(this.rotationYaw * 3.141592653589793 / 180.0);
            int llllllllllllIlIllllIlIllIIlIlIII = EntityBoat.lllIIlIIlllIll[1];
            "".length();
            if (" ".length() <= ((0x58 ^ 0x57) & ~(0xAE ^ 0xA1))) {
                return;
            }
            while (!lIIlllllIllllIIl(lIIlllllIlllIlll(llllllllllllIlIllllIlIllIIlIlIII, 1.0 + llllllllllllIlIllllIlIllIIlIlIll * 60.0))) {
                final double llllllllllllIlIllllIlIllIIlIIlll = this.rand.nextFloat() * 2.0f - 1.0f;
                final double llllllllllllIlIllllIlIllIIlIIllI = (this.rand.nextInt(EntityBoat.lllIIlIIlllIll[8]) * EntityBoat.lllIIlIIlllIll[8] - EntityBoat.lllIIlIIlllIll[0]) * 0.7;
                if (lIIlllllIllIlllI(this.rand.nextBoolean() ? 1 : 0)) {
                    final double llllllllllllIlIllllIlIllIIlIIlIl = this.posX - llllllllllllIlIllllIlIllIIlIlIlI * llllllllllllIlIllllIlIllIIlIIlll * 0.8 + llllllllllllIlIllllIlIllIIlIlIIl * llllllllllllIlIllllIlIllIIlIIllI;
                    final double llllllllllllIlIllllIlIllIIlIIlII = this.posZ - llllllllllllIlIllllIlIllIIlIlIIl * llllllllllllIlIllllIlIllIIlIIlll * 0.8 - llllllllllllIlIllllIlIllIIlIlIlI * llllllllllllIlIllllIlIllIIlIIllI;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, llllllllllllIlIllllIlIllIIlIIlIl, this.posY - 0.125, llllllllllllIlIllllIlIllIIlIIlII, this.motionX, this.motionY, this.motionZ, new int[EntityBoat.lllIIlIIlllIll[1]]);
                    "".length();
                    if (((0x4 ^ 0x4E) & ~(0x55 ^ 0x1F)) != 0x0) {
                        return;
                    }
                }
                else {
                    final double llllllllllllIlIllllIlIllIIlIIIll = this.posX + llllllllllllIlIllllIlIllIIlIlIlI + llllllllllllIlIllllIlIllIIlIlIIl * llllllllllllIlIllllIlIllIIlIIlll * 0.7;
                    final double llllllllllllIlIllllIlIllIIlIIIlI = this.posZ + llllllllllllIlIllllIlIllIIlIlIIl - llllllllllllIlIllllIlIllIIlIlIlI * llllllllllllIlIllllIlIllIIlIIlll * 0.7;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, llllllllllllIlIllllIlIllIIlIIIll, this.posY - 0.125, llllllllllllIlIllllIlIllIIlIIIlI, this.motionX, this.motionY, this.motionZ, new int[EntityBoat.lllIIlIIlllIll[1]]);
                }
                ++llllllllllllIlIllllIlIllIIlIlIII;
            }
        }
        if (lIIlllllIllIlllI(this.worldObj.isRemote ? 1 : 0) && lIIlllllIllIlllI(this.isBoatEmpty ? 1 : 0)) {
            if (lIIlllllIlllIIlI(this.boatPosRotationIncrements)) {
                final double llllllllllllIlIllllIlIllIIlIIIIl = this.posX + (this.boatX - this.posX) / this.boatPosRotationIncrements;
                final double llllllllllllIlIllllIlIllIIlIIIII = this.posY + (this.boatY - this.posY) / this.boatPosRotationIncrements;
                final double llllllllllllIlIllllIlIllIIIlllll = this.posZ + (this.boatZ - this.posZ) / this.boatPosRotationIncrements;
                final double llllllllllllIlIllllIlIllIIIllllI = MathHelper.wrapAngleTo180_double(this.boatYaw - this.rotationYaw);
                this.rotationYaw += (float)(llllllllllllIlIllllIlIllIIIllllI / this.boatPosRotationIncrements);
                this.rotationPitch += (float)((this.boatPitch - this.rotationPitch) / this.boatPosRotationIncrements);
                this.boatPosRotationIncrements -= EntityBoat.lllIIlIIlllIll[0];
                this.setPosition(llllllllllllIlIllllIlIllIIlIIIIl, llllllllllllIlIllllIlIllIIlIIIII, llllllllllllIlIllllIlIllIIIlllll);
                this.setRotation(this.rotationYaw, this.rotationPitch);
                "".length();
                if ("   ".length() < ((0x87 ^ 0x90 ^ ((0x10 ^ 0x20) & ~(0x73 ^ 0x43))) & (10 + 85 - 48 + 129 ^ 59 + 59 + 29 + 20 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                final double llllllllllllIlIllllIlIllIIIlllIl = this.posX + this.motionX;
                final double llllllllllllIlIllllIlIllIIIlllII = this.posY + this.motionY;
                final double llllllllllllIlIllllIlIllIIIllIll = this.posZ + this.motionZ;
                this.setPosition(llllllllllllIlIllllIlIllIIIlllIl, llllllllllllIlIllllIlIllIIIlllII, llllllllllllIlIllllIlIllIIIllIll);
                if (lIIlllllIllIlllI(this.onGround ? 1 : 0)) {
                    this.motionX *= 0.5;
                    this.motionY *= 0.5;
                    this.motionZ *= 0.5;
                }
                this.motionX *= 0.9900000095367432;
                this.motionY *= 0.949999988079071;
                this.motionZ *= 0.9900000095367432;
                "".length();
                if ((0x9 ^ 0xD) <= 0) {
                    return;
                }
            }
        }
        else {
            if (lIIlllllIllllIlI(lIIlllllIlllIlll(llllllllllllIlIllllIlIllIIllIIII, 1.0))) {
                final double llllllllllllIlIllllIlIllIIIllIlI = llllllllllllIlIllllIlIllIIllIIII * 2.0 - 1.0;
                this.motionY += 0.03999999910593033 * llllllllllllIlIllllIlIllIIIllIlI;
                "".length();
                if ((95 + 34 - 102 + 140 ^ 97 + 69 - 136 + 132) <= 0) {
                    return;
                }
            }
            else {
                if (lIIlllllIllllIlI(lIIlllllIlllIlll(this.motionY, 0.0))) {
                    this.motionY /= 2.0;
                }
                this.motionY += 0.007000000216066837;
            }
            if (lIIlllllIllIlllI((this.riddenByEntity instanceof EntityLivingBase) ? 1 : 0)) {
                final EntityLivingBase llllllllllllIlIllllIlIllIIIllIIl = (EntityLivingBase)this.riddenByEntity;
                final float llllllllllllIlIllllIlIllIIIllIII = this.riddenByEntity.rotationYaw + -llllllllllllIlIllllIlIllIIIllIIl.moveStrafing * 90.0f;
                this.motionX += -Math.sin(llllllllllllIlIllllIlIllIIIllIII * 3.1415927f / 180.0f) * this.speedMultiplier * llllllllllllIlIllllIlIllIIIllIIl.moveForward * 0.05000000074505806;
                this.motionZ += Math.cos(llllllllllllIlIllllIlIllIIIllIII * 3.1415927f / 180.0f) * this.speedMultiplier * llllllllllllIlIllllIlIllIIIllIIl.moveForward * 0.05000000074505806;
            }
            double llllllllllllIlIllllIlIllIIIlIlll = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            if (lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIIlIlll, 0.35))) {
                final double llllllllllllIlIllllIlIllIIIlIllI = 0.35 / llllllllllllIlIllllIlIllIIIlIlll;
                this.motionX *= llllllllllllIlIllllIlIllIIIlIllI;
                this.motionZ *= llllllllllllIlIllllIlIllIIIlIllI;
                llllllllllllIlIllllIlIllIIIlIlll = 0.35;
            }
            if (lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIIlIlll, llllllllllllIlIllllIlIllIIlIlIll)) && lIIlllllIllllIlI(lIIlllllIlllIlll(this.speedMultiplier, 0.35))) {
                this.speedMultiplier += (0.35 - this.speedMultiplier) / 35.0;
                if (lIIlllllIlllIIlI(lIIlllllIlllIllI(this.speedMultiplier, 0.35))) {
                    this.speedMultiplier = 0.35;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
            }
            else {
                this.speedMultiplier -= (this.speedMultiplier - 0.07) / 35.0;
                if (lIIlllllIllllIlI(lIIlllllIlllIlll(this.speedMultiplier, 0.07))) {
                    this.speedMultiplier = 0.07;
                }
            }
            int llllllllllllIlIllllIlIllIIIlIlIl = EntityBoat.lllIIlIIlllIll[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIIlIlIl, EntityBoat.lllIIlIIlllIll[9])) {
                final int llllllllllllIlIllllIlIllIIIlIlII = MathHelper.floor_double(this.posX + (llllllllllllIlIllllIlIllIIIlIlIl % EntityBoat.lllIIlIIlllIll[8] - 0.5) * 0.8);
                final int llllllllllllIlIllllIlIllIIIlIIll = MathHelper.floor_double(this.posZ + (llllllllllllIlIllllIlIllIIIlIlIl / EntityBoat.lllIIlIIlllIll[8] - 0.5) * 0.8);
                int llllllllllllIlIllllIlIllIIIlIIlI = EntityBoat.lllIIlIIlllIll[1];
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIIlIIlI, EntityBoat.lllIIlIIlllIll[8])) {
                    final int llllllllllllIlIllllIlIllIIIlIIIl = MathHelper.floor_double(this.posY) + llllllllllllIlIllllIlIllIIIlIIlI;
                    final BlockPos llllllllllllIlIllllIlIllIIIlIIII = new BlockPos(llllllllllllIlIllllIlIllIIIlIlII, llllllllllllIlIllllIlIllIIIlIIIl, llllllllllllIlIllllIlIllIIIlIIll);
                    final Block llllllllllllIlIllllIlIllIIIIllll = this.worldObj.getBlockState(llllllllllllIlIllllIlIllIIIlIIII).getBlock();
                    if (lIIlllllIlllIIIl(llllllllllllIlIllllIlIllIIIIllll, Blocks.snow_layer)) {
                        this.worldObj.setBlockToAir(llllllllllllIlIllllIlIllIIIlIIII);
                        "".length();
                        this.isCollidedHorizontally = (EntityBoat.lllIIlIIlllIll[1] != 0);
                        "".length();
                        if (" ".length() == -" ".length()) {
                            return;
                        }
                    }
                    else if (lIIlllllIlllIIIl(llllllllllllIlIllllIlIllIIIIllll, Blocks.waterlily)) {
                        this.worldObj.destroyBlock(llllllllllllIlIllllIlIllIIIlIIII, (boolean)(EntityBoat.lllIIlIIlllIll[0] != 0));
                        "".length();
                        this.isCollidedHorizontally = (EntityBoat.lllIIlIIlllIll[1] != 0);
                    }
                    ++llllllllllllIlIllllIlIllIIIlIIlI;
                }
                ++llllllllllllIlIllllIlIllIIIlIlIl;
            }
            if (lIIlllllIllIlllI(this.onGround ? 1 : 0)) {
                this.motionX *= 0.5;
                this.motionY *= 0.5;
                this.motionZ *= 0.5;
            }
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            if (lIIlllllIllIlllI(this.isCollidedHorizontally ? 1 : 0) && lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIlIlIll, 0.2975))) {
                if (lIIlllllIllIllll(this.worldObj.isRemote ? 1 : 0) && lIIlllllIllIllll(this.isDead ? 1 : 0)) {
                    this.setDead();
                    if (lIIlllllIllIlllI(this.worldObj.getGameRules().getBoolean(EntityBoat.lllIIlIIlllIIl[EntityBoat.lllIIlIIlllIll[0]]) ? 1 : 0)) {
                        int llllllllllllIlIllllIlIllIIIIlllI = EntityBoat.lllIIlIIlllIll[1];
                        "".length();
                        if ("   ".length() < -" ".length()) {
                            return;
                        }
                        while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIIIlllI, EntityBoat.lllIIlIIlllIll[7])) {
                            this.dropItemWithOffset(Item.getItemFromBlock(Blocks.planks), EntityBoat.lllIIlIIlllIll[0], 0.0f);
                            "".length();
                            ++llllllllllllIlIllllIlIllIIIIlllI;
                        }
                        int llllllllllllIlIllllIlIllIIIIllIl = EntityBoat.lllIIlIIlllIll[1];
                        "".length();
                        if (((0x72 ^ 0x55 ^ (0xC5 ^ 0xB4)) & (0x12 ^ 0x6A ^ (0x22 ^ 0xC) ^ -" ".length())) != ((46 + 154 - 69 + 70 ^ 101 + 24 - 49 + 77) & (82 + 216 - 221 + 163 ^ 41 + 140 - 82 + 61 ^ -" ".length()))) {
                            return;
                        }
                        while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIIIllIl, EntityBoat.lllIIlIIlllIll[8])) {
                            this.dropItemWithOffset(Items.stick, EntityBoat.lllIIlIIlllIll[0], 0.0f);
                            "".length();
                            ++llllllllllllIlIllllIlIllIIIIllIl;
                        }
                        "".length();
                        if ((0x4 ^ 0x0) < 0) {
                            return;
                        }
                    }
                }
            }
            else {
                this.motionX *= 0.9900000095367432;
                this.motionY *= 0.949999988079071;
                this.motionZ *= 0.9900000095367432;
            }
            this.rotationPitch = 0.0f;
            double llllllllllllIlIllllIlIllIIIIllII = this.rotationYaw;
            final double llllllllllllIlIllllIlIllIIIIlIll = this.prevPosX - this.posX;
            final double llllllllllllIlIllllIlIllIIIIlIlI = this.prevPosZ - this.posZ;
            if (lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIIIlIll * llllllllllllIlIllllIlIllIIIIlIll + llllllllllllIlIllllIlIllIIIIlIlI * llllllllllllIlIllllIlIllIIIIlIlI, 0.001))) {
                llllllllllllIlIllllIlIllIIIIllII = (float)(MathHelper.func_181159_b(llllllllllllIlIllllIlIllIIIIlIlI, llllllllllllIlIllllIlIllIIIIlIll) * 180.0 / 3.141592653589793);
            }
            double llllllllllllIlIllllIlIllIIIIlIIl = MathHelper.wrapAngleTo180_double(llllllllllllIlIllllIlIllIIIIllII - this.rotationYaw);
            if (lIIlllllIlllIIlI(lIIlllllIlllIllI(llllllllllllIlIllllIlIllIIIIlIIl, 20.0))) {
                llllllllllllIlIllllIlIllIIIIlIIl = 20.0;
            }
            if (lIIlllllIllllIlI(lIIlllllIlllIlll(llllllllllllIlIllllIlIllIIIIlIIl, -20.0))) {
                llllllllllllIlIllllIlIllIIIIlIIl = -20.0;
            }
            this.rotationYaw += (float)llllllllllllIlIllllIlIllIIIIlIIl;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            if (lIIlllllIllIllll(this.worldObj.isRemote ? 1 : 0)) {
                final List<Entity> llllllllllllIlIllllIlIllIIIIlIII = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().expand(0.20000000298023224, 0.0, 0.20000000298023224));
                if (lIIlllllIlllIIII(llllllllllllIlIllllIlIllIIIIlIII) && lIIlllllIllIllll(llllllllllllIlIllllIlIllIIIIlIII.isEmpty() ? 1 : 0)) {
                    int llllllllllllIlIllllIlIllIIIIIlll = EntityBoat.lllIIlIIlllIll[1];
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                    while (!lIIlllllIllllIII(llllllllllllIlIllllIlIllIIIIIlll, llllllllllllIlIllllIlIllIIIIlIII.size())) {
                        final Entity llllllllllllIlIllllIlIllIIIIIllI = llllllllllllIlIllllIlIllIIIIlIII.get(llllllllllllIlIllllIlIllIIIIIlll);
                        if (lIIlllllIllllIll(llllllllllllIlIllllIlIllIIIIIllI, this.riddenByEntity) && lIIlllllIllIlllI(llllllllllllIlIllllIlIllIIIIIllI.canBePushed() ? 1 : 0) && lIIlllllIllIlllI((llllllllllllIlIllllIlIllIIIIIllI instanceof EntityBoat) ? 1 : 0)) {
                            llllllllllllIlIllllIlIllIIIIIllI.applyEntityCollision(this);
                        }
                        ++llllllllllllIlIllllIlIllIIIIIlll;
                    }
                }
                if (lIIlllllIlllIIII(this.riddenByEntity) && lIIlllllIllIlllI(this.riddenByEntity.isDead ? 1 : 0)) {
                    this.riddenByEntity = null;
                }
            }
        }
    }
    
    private static String lIIlllllIllIlIII(String llllllllllllIlIllllIlIlIlIIlIlII, final String llllllllllllIlIllllIlIlIlIIllIII) {
        llllllllllllIlIllllIlIlIlIIlIlII = new String(Base64.getDecoder().decode(llllllllllllIlIllllIlIlIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIlIlIlIIlIlll = new StringBuilder();
        final char[] llllllllllllIlIllllIlIlIlIIlIllI = llllllllllllIlIllllIlIlIlIIllIII.toCharArray();
        int llllllllllllIlIllllIlIlIlIIlIlIl = EntityBoat.lllIIlIIlllIll[1];
        final long llllllllllllIlIllllIlIlIlIIIllll = (Object)llllllllllllIlIllllIlIlIlIIlIlII.toCharArray();
        final char llllllllllllIlIllllIlIlIlIIIlllI = (char)llllllllllllIlIllllIlIlIlIIIllll.length;
        char llllllllllllIlIllllIlIlIlIIIllIl = (char)EntityBoat.lllIIlIIlllIll[1];
        while (lIIlllllIllllllI(llllllllllllIlIllllIlIlIlIIIllIl, llllllllllllIlIllllIlIlIlIIIlllI)) {
            final char llllllllllllIlIllllIlIlIlIIllIlI = llllllllllllIlIllllIlIlIlIIIllll[llllllllllllIlIllllIlIlIlIIIllIl];
            llllllllllllIlIllllIlIlIlIIlIlll.append((char)(llllllllllllIlIllllIlIlIlIIllIlI ^ llllllllllllIlIllllIlIlIlIIlIllI[llllllllllllIlIllllIlIlIlIIlIlIl % llllllllllllIlIllllIlIlIlIIlIllI.length]));
            "".length();
            ++llllllllllllIlIllllIlIlIlIIlIlIl;
            ++llllllllllllIlIllllIlIlIlIIIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIlIlIlIIlIlll);
    }
    
    private static String lIIlllllIllIIlIl(final String llllllllllllIlIllllIlIlIlIlIlIIl, final String llllllllllllIlIllllIlIlIlIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIlIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIlIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIlIlIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIlIlIlIlIlIll.init(EntityBoat.lllIIlIIlllIll[8], llllllllllllIlIllllIlIlIlIlIllII);
            return new String(llllllllllllIlIllllIlIlIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIlIlIlIlIlI) {
            llllllllllllIlIllllIlIlIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static int lIIlllllIlllIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setDamageTaken(final float llllllllllllIlIllllIlIlIllIIllII) {
        this.dataWatcher.updateObject(EntityBoat.lllIIlIIlllIll[4], llllllllllllIlIllllIlIlIllIIllII);
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityBoat.lllIIlIIlllIll[2], new Integer(EntityBoat.lllIIlIIlllIll[1]));
        this.dataWatcher.addObject(EntityBoat.lllIIlIIlllIll[3], new Integer(EntityBoat.lllIIlIIlllIll[0]));
        this.dataWatcher.addObject(EntityBoat.lllIIlIIlllIll[4], new Float(0.0f));
    }
    
    public int getTimeSinceHit() {
        return this.dataWatcher.getWatchableObjectInt(EntityBoat.lllIIlIIlllIll[2]);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
        return this.getEntityBoundingBox();
    }
    
    private static int lIIlllllIlllIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        int n;
        if (lIIlllllIllIlllI(this.isDead ? 1 : 0)) {
            n = EntityBoat.lllIIlIIlllIll[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((56 + 58 - 53 + 77 ^ 76 + 131 - 203 + 163) & (0x19 ^ 0x17 ^ (0x60 ^ 0x43) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityBoat.lllIIlIIlllIll[0];
        }
        return n != 0;
    }
    
    private static boolean lIIlllllIllllllI(final int llllllllllllIlIllllIlIlIlIIIIlIl, final int llllllllllllIlIllllIlIlIlIIIIlII) {
        return llllllllllllIlIllllIlIlIlIIIIlIl < llllllllllllIlIllllIlIlIlIIIIlII;
    }
    
    static {
        lIIlllllIllIllII();
        lIIlllllIllIlIIl();
    }
    
    public int getForwardDirection() {
        return this.dataWatcher.getWatchableObjectInt(EntityBoat.lllIIlIIlllIll[3]);
    }
    
    private static int lIIlllllIlllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIlIllllIlIlIlllIIlll) {
    }
    
    private static boolean lIIlllllIllllIlI(final int llllllllllllIlIllllIlIlIIlllIIlI) {
        return llllllllllllIlIllllIlIlIIlllIIlI < 0;
    }
    
    public void setTimeSinceHit(final int llllllllllllIlIllllIlIlIllIIIIll) {
        this.dataWatcher.updateObject(EntityBoat.lllIIlIIlllIll[2], llllllllllllIlIllllIlIlIllIIIIll);
    }
    
    private static boolean lIIlllllIllllIIl(final int llllllllllllIlIllllIlIlIIlllIlII) {
        return llllllllllllIlIllllIlIlIIlllIlII >= 0;
    }
    
    @Override
    public boolean canBePushed() {
        return EntityBoat.lllIIlIIlllIll[0] != 0;
    }
    
    @Override
    public void setPositionAndRotation2(final double llllllllllllIlIllllIlIllIllIIlll, final double llllllllllllIlIllllIlIllIlIllIIl, final double llllllllllllIlIllllIlIllIlIllIII, final float llllllllllllIlIllllIlIllIllIIlII, final float llllllllllllIlIllllIlIllIlIlIllI, final int llllllllllllIlIllllIlIllIlIlIlIl, final boolean llllllllllllIlIllllIlIllIlIlIlII) {
        if (lIIlllllIllIlllI(llllllllllllIlIllllIlIllIlIlIlII ? 1 : 0) && lIIlllllIlllIIII(this.riddenByEntity)) {
            this.posX = llllllllllllIlIllllIlIllIllIIlll;
            this.prevPosX = llllllllllllIlIllllIlIllIllIIlll;
            this.posY = llllllllllllIlIllllIlIllIlIllIIl;
            this.prevPosY = llllllllllllIlIllllIlIllIlIllIIl;
            this.posZ = llllllllllllIlIllllIlIllIlIllIII;
            this.prevPosZ = llllllllllllIlIllllIlIllIlIllIII;
            this.rotationYaw = llllllllllllIlIllllIlIllIllIIlII;
            this.rotationPitch = llllllllllllIlIllllIlIllIlIlIllI;
            this.boatPosRotationIncrements = EntityBoat.lllIIlIIlllIll[1];
            this.setPosition(llllllllllllIlIllllIlIllIllIIlll, llllllllllllIlIllllIlIllIlIllIIl, llllllllllllIlIllllIlIllIlIllIII);
            final double n = 0.0;
            this.velocityX = n;
            this.motionX = n;
            final double n2 = 0.0;
            this.velocityY = n2;
            this.motionY = n2;
            final double n3 = 0.0;
            this.velocityZ = n3;
            this.motionZ = n3;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (lIIlllllIllIlllI(this.isBoatEmpty ? 1 : 0)) {
                this.boatPosRotationIncrements = llllllllllllIlIllllIlIllIlIlIlIl + EntityBoat.lllIIlIIlllIll[6];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final double llllllllllllIlIllllIlIllIllIIIII = llllllllllllIlIllllIlIllIllIIlll - this.posX;
                final double llllllllllllIlIllllIlIllIlIlllll = llllllllllllIlIllllIlIllIlIllIIl - this.posY;
                final double llllllllllllIlIllllIlIllIlIllllI = llllllllllllIlIllllIlIllIlIllIII - this.posZ;
                final double llllllllllllIlIllllIlIllIlIlllIl = llllllllllllIlIllllIlIllIllIIIII * llllllllllllIlIllllIlIllIllIIIII + llllllllllllIlIllllIlIllIlIlllll * llllllllllllIlIllllIlIllIlIlllll + llllllllllllIlIllllIlIllIlIllllI * llllllllllllIlIllllIlIllIlIllllI;
                if (lIIlllllIlllIlII(lIIlllllIlllIIll(llllllllllllIlIllllIlIllIlIlllIl, 1.0))) {
                    return;
                }
                this.boatPosRotationIncrements = EntityBoat.lllIIlIIlllIll[7];
            }
            this.boatX = llllllllllllIlIllllIlIllIllIIlll;
            this.boatY = llllllllllllIlIllllIlIllIlIllIIl;
            this.boatZ = llllllllllllIlIllllIlIllIlIllIII;
            this.boatYaw = llllllllllllIlIllllIlIllIllIIlII;
            this.boatPitch = llllllllllllIlIllllIlIllIlIlIllI;
            this.motionX = this.velocityX;
            this.motionY = this.velocityY;
            this.motionZ = this.velocityZ;
        }
    }
    
    private static void lIIlllllIllIlIIl() {
        (lllIIlIIlllIIl = new String[EntityBoat.lllIIlIIlllIll[7]])[EntityBoat.lllIIlIIlllIll[1]] = lIIlllllIllIIlIl("20cIH2z3NG7RtfWR+td72A==", "NVuzA");
        EntityBoat.lllIIlIIlllIIl[EntityBoat.lllIIlIIlllIll[0]] = lIIlllllIllIIlIl("RA7LWPKzLXcAi/VLPyuB9A==", "qLCLE");
        EntityBoat.lllIIlIIlllIIl[EntityBoat.lllIIlIIlllIll[8]] = lIIlllllIllIlIII("CgEfBiYHGiMsIAEeKQ==", "nnZhR");
    }
    
    @Override
    public void updateRiderPosition() {
        if (lIIlllllIlllIIII(this.riddenByEntity)) {
            final double llllllllllllIlIllllIlIlIlllIllll = Math.cos(this.rotationYaw * 3.141592653589793 / 180.0) * 0.4;
            final double llllllllllllIlIllllIlIlIlllIlllI = Math.sin(this.rotationYaw * 3.141592653589793 / 180.0) * 0.4;
            this.riddenByEntity.setPosition(this.posX + llllllllllllIlIllllIlIlIlllIllll, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ + llllllllllllIlIllllIlIlIlllIlllI);
        }
    }
    
    @Override
    public void setVelocity(final double llllllllllllIlIllllIlIllIlIIlIll, final double llllllllllllIlIllllIlIllIlIIlIlI, final double llllllllllllIlIllllIlIllIlIIIlIl) {
        this.motionX = llllllllllllIlIllllIlIllIlIIlIll;
        this.velocityX = llllllllllllIlIllllIlIllIlIIlIll;
        this.motionY = llllllllllllIlIllllIlIllIlIIlIlI;
        this.velocityY = llllllllllllIlIllllIlIllIlIIlIlI;
        this.motionZ = llllllllllllIlIllllIlIllIlIIIlIl;
        this.velocityZ = llllllllllllIlIllllIlIllIlIIIlIl;
    }
    
    public float getDamageTaken() {
        return this.dataWatcher.getWatchableObjectFloat(EntityBoat.lllIIlIIlllIll[4]);
    }
    
    public void setIsBoatEmpty(final boolean llllllllllllIlIllllIlIlIlIllIIIl) {
        this.isBoatEmpty = llllllllllllIlIllllIlIlIlIllIIIl;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlIllllIlIlIlllIIIIl) {
        if (lIIlllllIlllIIII(this.riddenByEntity) && lIIlllllIllIlllI((this.riddenByEntity instanceof EntityPlayer) ? 1 : 0) && lIIlllllIllllIll(this.riddenByEntity, llllllllllllIlIllllIlIlIlllIIIIl)) {
            return EntityBoat.lllIIlIIlllIll[0] != 0;
        }
        if (lIIlllllIllIllll(this.worldObj.isRemote ? 1 : 0)) {
            llllllllllllIlIllllIlIlIlllIIIIl.mountEntity(this);
        }
        return EntityBoat.lllIIlIIlllIll[0] != 0;
    }
    
    private static boolean lIIlllllIlllIIlI(final int llllllllllllIlIllllIlIlIIllIlllI) {
        return llllllllllllIlIllllIlIlIIllIlllI > 0;
    }
    
    @Override
    public double getMountedYOffset() {
        return -0.3;
    }
    
    private static void lIIlllllIllIllII() {
        (lllIIlIIlllIll = new int[10])[0] = " ".length();
        EntityBoat.lllIIlIIlllIll[1] = (" ".length() & ~" ".length());
        EntityBoat.lllIIlIIlllIll[2] = (103 + 35 - 1 + 13 ^ 76 + 99 - 143 + 103);
        EntityBoat.lllIIlIIlllIll[3] = (0xA9 ^ 0xBB);
        EntityBoat.lllIIlIIlllIll[4] = (0xD3 ^ 0xC0);
        EntityBoat.lllIIlIIlllIll[5] = (0x16 ^ 0x5 ^ (0x92 ^ 0x8B));
        EntityBoat.lllIIlIIlllIll[6] = (8 + 40 + 5 + 83 ^ 96 + 72 - 158 + 131);
        EntityBoat.lllIIlIIlllIll[7] = "   ".length();
        EntityBoat.lllIIlIIlllIll[8] = "  ".length();
        EntityBoat.lllIIlIIlllIll[9] = (0x9F ^ 0x9B);
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityBoat.lllIIlIIlllIll[1] != 0;
    }
    
    @Override
    protected void updateFallState(final double llllllllllllIlIllllIlIlIllIlIlII, final boolean llllllllllllIlIllllIlIlIllIlIIll, final Block llllllllllllIlIllllIlIlIllIllIIl, final BlockPos llllllllllllIlIllllIlIlIllIllIII) {
        if (lIIlllllIllIlllI(llllllllllllIlIllllIlIlIllIlIIll ? 1 : 0)) {
            if (lIIlllllIlllIIlI(lIIlllllIlllllII(this.fallDistance, 3.0f))) {
                this.fall(this.fallDistance, 1.0f);
                if (lIIlllllIllIllll(this.worldObj.isRemote ? 1 : 0) && lIIlllllIllIllll(this.isDead ? 1 : 0)) {
                    this.setDead();
                    if (lIIlllllIllIlllI(this.worldObj.getGameRules().getBoolean(EntityBoat.lllIIlIIlllIIl[EntityBoat.lllIIlIIlllIll[8]]) ? 1 : 0)) {
                        int llllllllllllIlIllllIlIlIllIlIlll = EntityBoat.lllIIlIIlllIll[1];
                        "".length();
                        if ((0x53 ^ 0x57) == 0x0) {
                            return;
                        }
                        while (!lIIlllllIllllIII(llllllllllllIlIllllIlIlIllIlIlll, EntityBoat.lllIIlIIlllIll[7])) {
                            this.dropItemWithOffset(Item.getItemFromBlock(Blocks.planks), EntityBoat.lllIIlIIlllIll[0], 0.0f);
                            "".length();
                            ++llllllllllllIlIllllIlIlIllIlIlll;
                        }
                        int llllllllllllIlIllllIlIlIllIlIllI = EntityBoat.lllIIlIIlllIll[1];
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                        while (!lIIlllllIllllIII(llllllllllllIlIllllIlIlIllIlIllI, EntityBoat.lllIIlIIlllIll[8])) {
                            this.dropItemWithOffset(Items.stick, EntityBoat.lllIIlIIlllIll[0], 0.0f);
                            "".length();
                            ++llllllllllllIlIllllIlIlIllIlIllI;
                        }
                    }
                }
                this.fallDistance = 0.0f;
                "".length();
                if ((126 + 129 - 158 + 59 ^ 80 + 72 - 87 + 87) < "  ".length()) {
                    return;
                }
            }
        }
        else if (lIIlllllIllllIll(this.worldObj.getBlockState(new BlockPos(this).down()).getBlock().getMaterial(), Material.water) && lIIlllllIllllIlI(lIIlllllIlllllIl(llllllllllllIlIllllIlIlIllIlIlII, 0.0))) {
            this.fallDistance -= (float)llllllllllllIlIllllIlIlIllIlIlII;
        }
    }
    
    private static int lIIlllllIllIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlllllIlllIIIl(final Object llllllllllllIlIllllIlIlIIllllIll, final Object llllllllllllIlIllllIlIlIIllllIlI) {
        return llllllllllllIlIllllIlIlIIllllIll == llllllllllllIlIllllIlIlIIllllIlI;
    }
    
    private static int lIIlllllIlllIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlllllIlllIlII(final int llllllllllllIlIllllIlIlIIlllIIII) {
        return llllllllllllIlIllllIlIlIIlllIIII <= 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlIllllIlIlllIIIIIIl, final float llllllllllllIlIllllIlIllIlllllII) {
        if (lIIlllllIllIlllI(this.isEntityInvulnerable(llllllllllllIlIllllIlIlllIIIIIIl) ? 1 : 0)) {
            return EntityBoat.lllIIlIIlllIll[1] != 0;
        }
        if (!lIIlllllIllIllll(this.worldObj.isRemote ? 1 : 0) || !lIIlllllIllIllll(this.isDead ? 1 : 0)) {
            return EntityBoat.lllIIlIIlllIll[0] != 0;
        }
        if (lIIlllllIlllIIII(this.riddenByEntity) && lIIlllllIlllIIIl(this.riddenByEntity, llllllllllllIlIllllIlIlllIIIIIIl.getEntity()) && lIIlllllIllIlllI((llllllllllllIlIllllIlIlllIIIIIIl instanceof EntityDamageSourceIndirect) ? 1 : 0)) {
            return EntityBoat.lllIIlIIlllIll[1] != 0;
        }
        this.setForwardDirection(-this.getForwardDirection());
        this.setTimeSinceHit(EntityBoat.lllIIlIIlllIll[5]);
        this.setDamageTaken(this.getDamageTaken() + llllllllllllIlIllllIlIllIlllllII * 10.0f);
        this.setBeenAttacked();
        int n;
        if (lIIlllllIllIlllI((llllllllllllIlIllllIlIlllIIIIIIl.getEntity() instanceof EntityPlayer) ? 1 : 0) && lIIlllllIllIlllI(((EntityPlayer)llllllllllllIlIllllIlIlllIIIIIIl.getEntity()).capabilities.isCreativeMode ? 1 : 0)) {
            n = EntityBoat.lllIIlIIlllIll[0];
            "".length();
            if (null != null) {
                return ((0x43 ^ 0x58) & ~(0xDF ^ 0xC4)) != 0x0;
            }
        }
        else {
            n = EntityBoat.lllIIlIIlllIll[1];
        }
        final boolean llllllllllllIlIllllIlIllIlllllll = n != 0;
        if (!lIIlllllIllIllll(llllllllllllIlIllllIlIllIlllllll ? 1 : 0) || lIIlllllIlllIIlI(lIIlllllIllIllIl(this.getDamageTaken(), 40.0f))) {
            if (lIIlllllIlllIIII(this.riddenByEntity)) {
                this.riddenByEntity.mountEntity(this);
            }
            if (lIIlllllIllIllll(llllllllllllIlIllllIlIllIlllllll ? 1 : 0) && lIIlllllIllIlllI(this.worldObj.getGameRules().getBoolean(EntityBoat.lllIIlIIlllIIl[EntityBoat.lllIIlIIlllIll[1]]) ? 1 : 0)) {
                this.dropItemWithOffset(Items.boat, EntityBoat.lllIIlIIlllIll[0], 0.0f);
                "".length();
            }
            this.setDead();
        }
        return EntityBoat.lllIIlIIlllIll[0] != 0;
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIlIllllIlIlIlllIlIIl) {
    }
    
    public EntityBoat(final World llllllllllllIlIllllIlIlllIIIlIll, final double llllllllllllIlIllllIlIlllIIIllll, final double llllllllllllIlIllllIlIlllIIIlIIl, final double llllllllllllIlIllllIlIlllIIIllIl) {
        this(llllllllllllIlIllllIlIlllIIIlIll);
        this.setPosition(llllllllllllIlIllllIlIlllIIIllll, llllllllllllIlIllllIlIlllIIIlIIl, llllllllllllIlIllllIlIlllIIIllIl);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = llllllllllllIlIllllIlIlllIIIllll;
        this.prevPosY = llllllllllllIlIllllIlIlllIIIlIIl;
        this.prevPosZ = llllllllllllIlIllllIlIlllIIIllIl;
    }
}
