// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import java.util.UUID;
import net.minecraft.world.WorldServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import java.util.Arrays;
import net.minecraft.nbt.NBTTagCompound;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.Block;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.Entity;

public abstract class EntityThrowable extends Entity implements IProjectile
{
    private static final /* synthetic */ String[] lllIllIIIIIllI;
    private /* synthetic */ String throwerName;
    protected /* synthetic */ boolean inGround;
    private static final /* synthetic */ int[] lllIllIIIIIlll;
    private /* synthetic */ int yTile;
    private /* synthetic */ Block inTile;
    private /* synthetic */ EntityLivingBase thrower;
    private /* synthetic */ int zTile;
    private /* synthetic */ int ticksInGround;
    private /* synthetic */ int ticksInAir;
    private /* synthetic */ int xTile;
    public /* synthetic */ int throwableShake;
    
    protected float getInaccuracy() {
        return 0.0f;
    }
    
    public EntityThrowable(final World llllllllllllIlIllIlIIIIIllIllIlI) {
        super(llllllllllllIlIllIlIIIIIllIllIlI);
        this.xTile = EntityThrowable.lllIllIIIIIlll[0];
        this.yTile = EntityThrowable.lllIllIIIIIlll[0];
        this.zTile = EntityThrowable.lllIllIIIIIlll[0];
        this.setSize(0.25f, 0.25f);
    }
    
    private static int lIlIIIllllIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIIllllIllIll(final int llllllllllllIlIllIIllllllllllIII) {
        return llllllllllllIlIllIIllllllllllIII == 0;
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static int lIlIIIllllIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIIIlllllIIIlI(final int llllllllllllIlIllIlIIIIIIIIIllIl, final int llllllllllllIlIllIlIIIIIIIIIllII) {
        return llllllllllllIlIllIlIIIIIIIIIllIl == llllllllllllIlIllIlIIIIIIIIIllII;
    }
    
    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        if (lIlIIIlllllIIIII(this.throwableShake)) {
            this.throwableShake -= EntityThrowable.lllIllIIIIIlll[1];
        }
        if (lIlIIIllllIllIII(this.inGround ? 1 : 0)) {
            if (lIlIIIlllllIIIIl(this.worldObj.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock(), this.inTile)) {
                this.ticksInGround += EntityThrowable.lllIllIIIIIlll[1];
                if (lIlIIIlllllIIIlI(this.ticksInGround, EntityThrowable.lllIllIIIIIlll[3])) {
                    this.setDead();
                }
                return;
            }
            this.inGround = (EntityThrowable.lllIllIIIIIlll[2] != 0);
            this.motionX *= this.rand.nextFloat() * 0.2f;
            this.motionY *= this.rand.nextFloat() * 0.2f;
            this.motionZ *= this.rand.nextFloat() * 0.2f;
            this.ticksInGround = EntityThrowable.lllIllIIIIIlll[2];
            this.ticksInAir = EntityThrowable.lllIllIIIIIlll[2];
            "".length();
            if ((0xB5 ^ 0xB1) < (0x7 ^ 0x3)) {
                return;
            }
        }
        else {
            this.ticksInAir += EntityThrowable.lllIllIIIIIlll[1];
        }
        Vec3 llllllllllllIlIllIlIIIIIIllllIIl = new Vec3(this.posX, this.posY, this.posZ);
        Vec3 llllllllllllIlIllIlIIIIIIllllIII = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition llllllllllllIlIllIlIIIIIIlllIlll = this.worldObj.rayTraceBlocks(llllllllllllIlIllIlIIIIIIllllIIl, llllllllllllIlIllIlIIIIIIllllIII);
        llllllllllllIlIllIlIIIIIIllllIIl = new Vec3(this.posX, this.posY, this.posZ);
        llllllllllllIlIllIlIIIIIIllllIII = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        if (lIlIIIlllllIIIll(llllllllllllIlIllIlIIIIIIlllIlll)) {
            llllllllllllIlIllIlIIIIIIllllIII = new Vec3(llllllllllllIlIllIlIIIIIIlllIlll.hitVec.xCoord, llllllllllllIlIllIlIIIIIIlllIlll.hitVec.yCoord, llllllllllllIlIllIlIIIIIIlllIlll.hitVec.zCoord);
        }
        if (lIlIIIllllIllIll(this.worldObj.isRemote ? 1 : 0)) {
            Entity llllllllllllIlIllIlIIIIIIlllIllI = null;
            final List<Entity> llllllllllllIlIllIlIIIIIIlllIlIl = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
            double llllllllllllIlIllIlIIIIIIlllIlII = 0.0;
            final EntityLivingBase llllllllllllIlIllIlIIIIIIlllIIll = this.getThrower();
            int llllllllllllIlIllIlIIIIIIlllIIlI = EntityThrowable.lllIllIIIIIlll[2];
            "".length();
            if (((0xB ^ 0x2E) & ~(0x6E ^ 0x4B)) < -" ".length()) {
                return;
            }
            while (!lIlIIIlllllIIlII(llllllllllllIlIllIlIIIIIIlllIIlI, llllllllllllIlIllIlIIIIIIlllIlIl.size())) {
                final Entity llllllllllllIlIllIlIIIIIIlllIIIl = llllllllllllIlIllIlIIIIIIlllIlIl.get(llllllllllllIlIllIlIIIIIIlllIIlI);
                if (lIlIIIllllIllIII(llllllllllllIlIllIlIIIIIIlllIIIl.canBeCollidedWith() ? 1 : 0) && (!lIlIIIlllllIIIIl(llllllllllllIlIllIlIIIIIIlllIIIl, llllllllllllIlIllIlIIIIIIlllIIll) || lIlIIIlllllIIlII(this.ticksInAir, EntityThrowable.lllIllIIIIIlll[4]))) {
                    final float llllllllllllIlIllIlIIIIIIlllIIII = 0.3f;
                    final AxisAlignedBB llllllllllllIlIllIlIIIIIIllIllll = llllllllllllIlIllIlIIIIIIlllIIIl.getEntityBoundingBox().expand(llllllllllllIlIllIlIIIIIIlllIIII, llllllllllllIlIllIlIIIIIIlllIIII, llllllllllllIlIllIlIIIIIIlllIIII);
                    final MovingObjectPosition llllllllllllIlIllIlIIIIIIllIlllI = llllllllllllIlIllIlIIIIIIllIllll.calculateIntercept(llllllllllllIlIllIlIIIIIIllllIIl, llllllllllllIlIllIlIIIIIIllllIII);
                    if (lIlIIIlllllIIIll(llllllllllllIlIllIlIIIIIIllIlllI)) {
                        final double llllllllllllIlIllIlIIIIIIllIllIl = llllllllllllIlIllIlIIIIIIllllIIl.squareDistanceTo(llllllllllllIlIllIlIIIIIIllIlllI.hitVec);
                        if (!lIlIIIlllllIIlIl(lIlIIIllllIlllII(llllllllllllIlIllIlIIIIIIllIllIl, llllllllllllIlIllIlIIIIIIlllIlII)) || lIlIIIllllIllIll(lIlIIIllllIlllIl(llllllllllllIlIllIlIIIIIIlllIlII, 0.0))) {
                            llllllllllllIlIllIlIIIIIIlllIllI = llllllllllllIlIllIlIIIIIIlllIIIl;
                            llllllllllllIlIllIlIIIIIIlllIlII = llllllllllllIlIllIlIIIIIIllIllIl;
                        }
                    }
                }
                ++llllllllllllIlIllIlIIIIIIlllIIlI;
            }
            if (lIlIIIlllllIIIll(llllllllllllIlIllIlIIIIIIlllIllI)) {
                llllllllllllIlIllIlIIIIIIlllIlll = new MovingObjectPosition(llllllllllllIlIllIlIIIIIIlllIllI);
            }
        }
        if (lIlIIIlllllIIIll(llllllllllllIlIllIlIIIIIIlllIlll)) {
            if (lIlIIIlllllIIIIl(llllllllllllIlIllIlIIIIIIlllIlll.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK) && lIlIIIlllllIIIIl(this.worldObj.getBlockState(llllllllllllIlIllIlIIIIIIlllIlll.getBlockPos()).getBlock(), Blocks.portal)) {
                this.func_181015_d(llllllllllllIlIllIlIIIIIIlllIlll.getBlockPos());
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.onImpact(llllllllllllIlIllIlIIIIIIlllIlll);
            }
        }
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        final float llllllllllllIlIllIlIIIIIIllIllII = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionX, this.motionZ) * 180.0 / 3.141592653589793);
        this.rotationPitch = (float)(MathHelper.func_181159_b(this.motionY, llllllllllllIlIllIlIIIIIIllIllII) * 180.0 / 3.141592653589793);
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIlIIIlllllIIlIl(lIlIIIllllIllllI(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
            this.prevRotationPitch -= 360.0f;
        }
        "".length();
        if (" ".length() > (0x88 ^ 0x8C)) {
            return;
        }
        while (!lIlIIIllllIllIIl(lIlIIIllllIlllll(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
            this.prevRotationPitch += 360.0f;
        }
        "".length();
        if (-(110 + 119 - 180 + 131 ^ 137 + 93 - 72 + 18) >= 0) {
            return;
        }
        while (!lIlIIIlllllIIlIl(lIlIIIllllIllllI(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
            this.prevRotationYaw -= 360.0f;
        }
        "".length();
        if (((0xFE ^ 0xA5 ^ (0x52 ^ 0x20)) & (28 + 129 - 136 + 166 ^ 45 + 53 + 24 + 24 ^ -" ".length())) != ((0x53 ^ 0x71 ^ (0x24 ^ 0x3D)) & (0x5D ^ 0x1C ^ (0x2 ^ 0x78) ^ -" ".length()))) {
            return;
        }
        while (!lIlIIIllllIllIIl(lIlIIIllllIlllll(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
        float llllllllllllIlIllIlIIIIIIllIlIll = 0.99f;
        final float llllllllllllIlIllIlIIIIIIllIlIlI = this.getGravityVelocity();
        if (lIlIIIllllIllIII(this.isInWater() ? 1 : 0)) {
            int llllllllllllIlIllIlIIIIIIllIlIIl = EntityThrowable.lllIllIIIIIlll[2];
            "".length();
            if (((0xD ^ 0x3B) & ~(0xAD ^ 0x9B)) < ((0xC8 ^ 0xC2) & ~(0x93 ^ 0x99))) {
                return;
            }
            while (!lIlIIIlllllIIlII(llllllllllllIlIllIlIIIIIIllIlIIl, EntityThrowable.lllIllIIIIIlll[5])) {
                final float llllllllllllIlIllIlIIIIIIllIlIII = 0.25f;
                this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * llllllllllllIlIllIlIIIIIIllIlIII, this.posY - this.motionY * llllllllllllIlIllIlIIIIIIllIlIII, this.posZ - this.motionZ * llllllllllllIlIllIlIIIIIIllIlIII, this.motionX, this.motionY, this.motionZ, new int[EntityThrowable.lllIllIIIIIlll[2]]);
                ++llllllllllllIlIllIlIIIIIIllIlIIl;
            }
            llllllllllllIlIllIlIIIIIIllIlIll = 0.8f;
        }
        this.motionX *= llllllllllllIlIllIlIIIIIIllIlIll;
        this.motionY *= llllllllllllIlIllIlIIIIIIllIlIll;
        this.motionZ *= llllllllllllIlIllIlIIIIIIllIlIll;
        this.motionY -= llllllllllllIlIllIlIIIIIIllIlIlI;
        this.setPosition(this.posX, this.posY, this.posZ);
    }
    
    private static boolean lIlIIIllllIllIII(final int llllllllllllIlIllIIllllllllllIlI) {
        return llllllllllllIlIllIIllllllllllIlI != 0;
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIlIllIlIIIIIllIlIIlI) {
        double llllllllllllIlIllIlIIIIIllIlIIIl = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0;
        if (lIlIIIllllIllIII(Double.isNaN(llllllllllllIlIllIlIIIIIllIlIIIl) ? 1 : 0)) {
            llllllllllllIlIllIlIIIIIllIlIIIl = 4.0;
        }
        llllllllllllIlIllIlIIIIIllIlIIIl *= 64.0;
        if (lIlIIIllllIllIIl(lIlIIIllllIlIlll(llllllllllllIlIllIlIIIIIllIlIIlI, llllllllllllIlIllIlIIIIIllIlIIIl * llllllllllllIlIllIlIIIIIllIlIIIl))) {
            return EntityThrowable.lllIllIIIIIlll[1] != 0;
        }
        return EntityThrowable.lllIllIIIIIlll[2] != 0;
    }
    
    @Override
    public void setThrowableHeading(double llllllllllllIlIllIlIIIIIlIlIIlll, double llllllllllllIlIllIlIIIIIlIIllllI, double llllllllllllIlIllIlIIIIIlIIlllIl, final float llllllllllllIlIllIlIIIIIlIIlllII, final float llllllllllllIlIllIlIIIIIlIlIIIll) {
        final float llllllllllllIlIllIlIIIIIlIlIIIlI = MathHelper.sqrt_double(llllllllllllIlIllIlIIIIIlIlIIlll * llllllllllllIlIllIlIIIIIlIlIIlll + llllllllllllIlIllIlIIIIIlIIllllI * llllllllllllIlIllIlIIIIIlIIllllI + llllllllllllIlIllIlIIIIIlIIlllIl * llllllllllllIlIllIlIIIIIlIIlllIl);
        llllllllllllIlIllIlIIIIIlIlIIlll /= llllllllllllIlIllIlIIIIIlIlIIIlI;
        llllllllllllIlIllIlIIIIIlIIllllI /= llllllllllllIlIllIlIIIIIlIlIIIlI;
        llllllllllllIlIllIlIIIIIlIIlllIl /= llllllllllllIlIllIlIIIIIlIlIIIlI;
        llllllllllllIlIllIlIIIIIlIlIIlll += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIlIllIlIIIIIlIlIIIll;
        llllllllllllIlIllIlIIIIIlIIllllI += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIlIllIlIIIIIlIlIIIll;
        llllllllllllIlIllIlIIIIIlIIlllIl += this.rand.nextGaussian() * 0.007499999832361937 * llllllllllllIlIllIlIIIIIlIlIIIll;
        llllllllllllIlIllIlIIIIIlIlIIlll *= llllllllllllIlIllIlIIIIIlIIlllII;
        llllllllllllIlIllIlIIIIIlIIllllI *= llllllllllllIlIllIlIIIIIlIIlllII;
        llllllllllllIlIllIlIIIIIlIIlllIl *= llllllllllllIlIllIlIIIIIlIIlllII;
        this.motionX = llllllllllllIlIllIlIIIIIlIlIIlll;
        this.motionY = llllllllllllIlIllIlIIIIIlIIllllI;
        this.motionZ = llllllllllllIlIllIlIIIIIlIIlllIl;
        final float llllllllllllIlIllIlIIIIIlIlIIIIl = MathHelper.sqrt_double(llllllllllllIlIllIlIIIIIlIlIIlll * llllllllllllIlIllIlIIIIIlIlIIlll + llllllllllllIlIllIlIIIIIlIIlllIl * llllllllllllIlIllIlIIIIIlIIlllIl);
        final float n = (float)(MathHelper.func_181159_b(llllllllllllIlIllIlIIIIIlIlIIlll, llllllllllllIlIllIlIIIIIlIIlllIl) * 180.0 / 3.141592653589793);
        this.rotationYaw = n;
        this.prevRotationYaw = n;
        final float n2 = (float)(MathHelper.func_181159_b(llllllllllllIlIllIlIIIIIlIIllllI, llllllllllllIlIllIlIIIIIlIlIIIIl) * 180.0 / 3.141592653589793);
        this.rotationPitch = n2;
        this.prevRotationPitch = n2;
        this.ticksInGround = EntityThrowable.lllIllIIIIIlll[2];
    }
    
    private static boolean lIlIIIlllllIIlll(final int llllllllllllIlIllIlIIIIIIIIIIlIl, final int llllllllllllIlIllIlIIIIIIIIIIlII) {
        return llllllllllllIlIllIlIIIIIIIIIIlIl < llllllllllllIlIllIlIIIIIIIIIIlII;
    }
    
    protected abstract void onImpact(final MovingObjectPosition p0);
    
    private static int lIlIIIllllIlIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIllllIllIIl(final int llllllllllllIlIllIIlllllllllIlII) {
        return llllllllllllIlIllIIlllllllllIlII < 0;
    }
    
    protected float getGravityVelocity() {
        return 0.03f;
    }
    
    private static boolean lIlIIIlllllIIlIl(final int llllllllllllIlIllIIlllllllllIllI) {
        return llllllllllllIlIllIIlllllllllIllI >= 0;
    }
    
    private static int lIlIIIllllIlllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIIIlllllIIlII(final int llllllllllllIlIllIlIIIIIIIIIlIIl, final int llllllllllllIlIllIlIIIIIIIIIlIII) {
        return llllllllllllIlIllIlIIIIIIIIIlIIl >= llllllllllllIlIllIlIIIIIIIIIlIII;
    }
    
    private static boolean lIlIIIlllllIIIII(final int llllllllllllIlIllIIlllllllllIIlI) {
        return llllllllllllIlIllIIlllllllllIIlI > 0;
    }
    
    static {
        lIlIIIllllIlIllI();
        lIlIIIllllIlIlIl();
    }
    
    protected float getVelocity() {
        return 1.5f;
    }
    
    private static String lIlIIIllllIlIIll(String llllllllllllIlIllIlIIIIIIIllIIlI, final String llllllllllllIlIllIlIIIIIIIllIllI) {
        llllllllllllIlIllIlIIIIIIIllIIlI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlIIIIIIIllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIIIIIIllIlIl = new StringBuilder();
        final char[] llllllllllllIlIllIlIIIIIIIllIlII = llllllllllllIlIllIlIIIIIIIllIllI.toCharArray();
        int llllllllllllIlIllIlIIIIIIIllIIll = EntityThrowable.lllIllIIIIIlll[2];
        final byte llllllllllllIlIllIlIIIIIIIlIllIl = (Object)((String)llllllllllllIlIllIlIIIIIIIllIIlI).toCharArray();
        final long llllllllllllIlIllIlIIIIIIIlIllII = llllllllllllIlIllIlIIIIIIIlIllIl.length;
        short llllllllllllIlIllIlIIIIIIIlIlIll = (short)EntityThrowable.lllIllIIIIIlll[2];
        while (lIlIIIlllllIIlll(llllllllllllIlIllIlIIIIIIIlIlIll, (int)llllllllllllIlIllIlIIIIIIIlIllII)) {
            final char llllllllllllIlIllIlIIIIIIIlllIII = llllllllllllIlIllIlIIIIIIIlIllIl[llllllllllllIlIllIlIIIIIIIlIlIll];
            llllllllllllIlIllIlIIIIIIIllIlIl.append((char)(llllllllllllIlIllIlIIIIIIIlllIII ^ llllllllllllIlIllIlIIIIIIIllIlII[llllllllllllIlIllIlIIIIIIIllIIll % llllllllllllIlIllIlIIIIIIIllIlII.length]));
            "".length();
            ++llllllllllllIlIllIlIIIIIIIllIIll;
            ++llllllllllllIlIllIlIIIIIIIlIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIIIIIIllIlIl);
    }
    
    private static int lIlIIIllllIlllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityThrowable(final World llllllllllllIlIllIlIIIIIllIIIlII, final EntityLivingBase llllllllllllIlIllIlIIIIIllIIIIll) {
        super(llllllllllllIlIllIlIIIIIllIIIlII);
        this.xTile = EntityThrowable.lllIllIIIIIlll[0];
        this.yTile = EntityThrowable.lllIllIIIIIlll[0];
        this.zTile = EntityThrowable.lllIllIIIIIlll[0];
        this.thrower = llllllllllllIlIllIlIIIIIllIIIIll;
        this.setSize(0.25f, 0.25f);
        this.setLocationAndAngles(llllllllllllIlIllIlIIIIIllIIIIll.posX, llllllllllllIlIllIlIIIIIllIIIIll.posY + llllllllllllIlIllIlIIIIIllIIIIll.getEyeHeight(), llllllllllllIlIllIlIIIIIllIIIIll.posZ, llllllllllllIlIllIlIIIIIllIIIIll.rotationYaw, llllllllllllIlIllIlIIIIIllIIIIll.rotationPitch);
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.posY -= 0.10000000149011612;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * 0.16f;
        this.setPosition(this.posX, this.posY, this.posZ);
        final float llllllllllllIlIllIlIIIIIllIIIllI = 0.4f;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIlIllIlIIIIIllIIIllI;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIlIllIlIIIIIllIIIllI;
        this.motionY = -MathHelper.sin((this.rotationPitch + this.getInaccuracy()) / 180.0f * 3.1415927f) * llllllllllllIlIllIlIIIIIllIIIllI;
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.getVelocity(), 1.0f);
    }
    
    private static String lIlIIIllllIlIIlI(final String llllllllllllIlIllIlIIIIIIIIlIlIl, final String llllllllllllIlIllIlIIIIIIIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIIIIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIIIIIIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIIIIIIIlIlll.init(EntityThrowable.lllIllIIIIIlll[6], llllllllllllIlIllIlIIIIIIIIllIII);
            return new String(llllllllllllIlIllIlIIIIIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIIIIIIlIllI) {
            llllllllllllIlIllIlIIIIIIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIllllIlIlIl() {
        (lllIllIIIIIllI = new String[EntityThrowable.lllIllIIIIIlll[21]])[EntityThrowable.lllIllIIIIIlll[2]] = lIlIIIllllIlIIlI("FADShkur3/0=", "mBoWv");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[1]] = lIlIIIllllIlIIlI("LGquw3Bi8gg=", "HtjLa");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[6]] = lIlIIIllllIlIIll("PTAsJSY=", "GdEIC");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[7]] = lIlIIIllllIlIIll("Cy86BSsH", "bAnlG");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[5]] = lIlIIIllllIlIIlI("1qVKEck9BT4=", "wggPG");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[4]] = lIlIIIllllIlIIlI("w0dVeAo2DNM=", "xmsCg");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[8]] = lIlIIIllllIlIlII("HB4HUJOA9okKqrGs1Nx2ZQ==", "pGAQN");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[9]] = lIlIIIllllIlIIlI("e3mHeyMbX9jyPSP+w4Yq4g==", "YjKYE");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[10]] = lIlIIIllllIlIIlI("nXOX5T0D2Pg=", "GIjLc");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[11]] = lIlIIIllllIlIIll("HSAlPwg=", "etLSm");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[12]] = lIlIIIllllIlIIlI("HBthHF2R0q0=", "WFCNH");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[13]] = lIlIIIllllIlIIll("PS48Lhc=", "GzUBr");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[14]] = lIlIIIllllIlIIll("IAs2Hggs", "Iebwd");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[15]] = lIlIIIllllIlIIlI("NJIZns//nDs=", "wiRFf");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[16]] = lIlIIIllllIlIIll("DzgHBDUD", "fVSmY");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[18]] = lIlIIIllllIlIIll("GCElKQE=", "kIDBd");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[19]] = lIlIIIllllIlIIlI("q9M+UisCN+Thfa/jwWWOfw==", "VEzxF");
        EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[20]] = lIlIIIllllIlIIlI("4vDnme21KP8W7nd6b+FgGA==", "rsymB");
    }
    
    private static boolean lIlIIIlllllIIIIl(final Object llllllllllllIlIllIlIIIIIIIIIIIIl, final Object llllllllllllIlIllIlIIIIIIIIIIIII) {
        return llllllllllllIlIllIlIIIIIIIIIIIIl == llllllllllllIlIllIlIIIIIIIIIIIII;
    }
    
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlIllIlIIIIIIlIIlIIl) {
        this.xTile = llllllllllllIlIllIlIIIIIIlIIlIIl.getShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[11]]);
        this.yTile = llllllllllllIlIllIlIIIIIIlIIlIIl.getShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[12]]);
        this.zTile = llllllllllllIlIllIlIIIIIIlIIlIIl.getShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[13]]);
        if (lIlIIIllllIllIII(llllllllllllIlIllIlIIIIIIlIIlIIl.hasKey(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[14]], EntityThrowable.lllIllIIIIIlll[10]) ? 1 : 0)) {
            this.inTile = Block.getBlockFromName(llllllllllllIlIllIlIIIIIIlIIlIIl.getString(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[15]]));
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            this.inTile = Block.getBlockById(llllllllllllIlIllIlIIIIIIlIIlIIl.getByte(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[16]]) & EntityThrowable.lllIllIIIIIlll[17]);
        }
        this.throwableShake = (llllllllllllIlIllIlIIIIIIlIIlIIl.getByte(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[18]]) & EntityThrowable.lllIllIIIIIlll[17]);
        int inGround;
        if (lIlIIIlllllIIIlI(llllllllllllIlIllIlIIIIIIlIIlIIl.getByte(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[19]]), EntityThrowable.lllIllIIIIIlll[1])) {
            inGround = EntityThrowable.lllIllIIIIIlll[1];
            "".length();
            if ("  ".length() >= (31 + 72 - 42 + 74 ^ 118 + 63 - 155 + 105)) {
                return;
            }
        }
        else {
            inGround = EntityThrowable.lllIllIIIIIlll[2];
        }
        this.inGround = (inGround != 0);
        this.thrower = null;
        this.throwerName = llllllllllllIlIllIlIIIIIIlIIlIIl.getString(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[20]]);
        if (lIlIIIlllllIIIll(this.throwerName) && lIlIIIllllIllIll(this.throwerName.length())) {
            this.throwerName = null;
        }
        this.thrower = this.getThrower();
    }
    
    private static String lIlIIIllllIlIlII(final String llllllllllllIlIllIlIIIIIIIlIIIII, final String llllllllllllIlIllIlIIIIIIIlIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), EntityThrowable.lllIllIIIIIlll[10]), "DES");
            final Cipher llllllllllllIlIllIlIIIIIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIIIIIIlIIlII.init(EntityThrowable.lllIllIIIIIlll[6], llllllllllllIlIllIlIIIIIIIlIIlIl);
            return new String(llllllllllllIlIllIlIIIIIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIIIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIIIIIlIIIll) {
            llllllllllllIlIllIlIIIIIIIlIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setVelocity(final double llllllllllllIlIllIlIIIIIlIIIllIl, final double llllllllllllIlIllIlIIIIIlIIIllII, final double llllllllllllIlIllIlIIIIIlIIIlIll) {
        this.motionX = llllllllllllIlIllIlIIIIIlIIIllIl;
        this.motionY = llllllllllllIlIllIlIIIIIlIIIllII;
        this.motionZ = llllllllllllIlIllIlIIIIIlIIIlIll;
        if (lIlIIIllllIllIll(lIlIIIllllIllIlI(this.prevRotationPitch, 0.0f)) && lIlIIIllllIllIll(lIlIIIllllIllIlI(this.prevRotationYaw, 0.0f))) {
            final float llllllllllllIlIllIlIIIIIlIIIllll = MathHelper.sqrt_double(llllllllllllIlIllIlIIIIIlIIIllIl * llllllllllllIlIllIlIIIIIlIIIllIl + llllllllllllIlIllIlIIIIIlIIIlIll * llllllllllllIlIllIlIIIIIlIIIlIll);
            final float n = (float)(MathHelper.func_181159_b(llllllllllllIlIllIlIIIIIlIIIllIl, llllllllllllIlIllIlIIIIIlIIIlIll) * 180.0 / 3.141592653589793);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(MathHelper.func_181159_b(llllllllllllIlIllIlIIIIIlIIIllII, llllllllllllIlIllIlIIIIIlIIIllll) * 180.0 / 3.141592653589793);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlIllIlIIIIIIlIlIIII) {
        llllllllllllIlIllIlIIIIIIlIlIIII.setShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[2]], (short)this.xTile);
        llllllllllllIlIllIlIIIIIIlIlIIII.setShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[1]], (short)this.yTile);
        llllllllllllIlIllIlIIIIIIlIlIIII.setShort(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[6]], (short)this.zTile);
        final ResourceLocation llllllllllllIlIllIlIIIIIIlIlIIlI = Block.blockRegistry.getNameForObject(this.inTile);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[7]];
        String string;
        if (lIlIIIlllllIIllI(llllllllllllIlIllIlIIIIIIlIlIIlI)) {
            string = EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[5]];
            "".length();
            if (-" ".length() > ((0xFA ^ 0xC0 ^ (0x46 ^ 0x37)) & (0x8A ^ 0x81 ^ (0x68 ^ 0x28) ^ -" ".length()))) {
                return;
            }
        }
        else {
            string = llllllllllllIlIllIlIIIIIIlIlIIlI.toString();
        }
        llllllllllllIlIllIlIIIIIIlIlIIII.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        llllllllllllIlIllIlIIIIIIlIlIIII.setByte(EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[4]], (byte)this.throwableShake);
        final String lllllllllllllIIIIIlIIIlIIllIIlll = EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[8]];
        int n;
        if (lIlIIIllllIllIII(this.inGround ? 1 : 0)) {
            n = EntityThrowable.lllIllIIIIIlll[1];
            "".length();
            if ((0xC5 ^ 0xC1) <= 0) {
                return;
            }
        }
        else {
            n = EntityThrowable.lllIllIIIIIlll[2];
        }
        llllllllllllIlIllIlIIIIIIlIlIIII.setByte(lllllllllllllIIIIIlIIIlIIllIIlll, (byte)n);
        if ((!lIlIIIlllllIIIll(this.throwerName) || lIlIIIllllIllIll(this.throwerName.length())) && lIlIIIllllIllIII((this.thrower instanceof EntityPlayer) ? 1 : 0)) {
            this.throwerName = this.thrower.getName();
        }
        final String lllllllllllllIIIIIlIIIlIIIIIIllI2 = EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[9]];
        String throwerName;
        if (lIlIIIlllllIIllI(this.throwerName)) {
            throwerName = EntityThrowable.lllIllIIIIIllI[EntityThrowable.lllIllIIIIIlll[10]];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            throwerName = this.throwerName;
        }
        llllllllllllIlIllIlIIIIIIlIlIIII.setString(lllllllllllllIIIIIlIIIlIIIIIIllI2, throwerName);
    }
    
    private static boolean lIlIIIlllllIIllI(final Object llllllllllllIlIllIIlllllllllllII) {
        return llllllllllllIlIllIIlllllllllllII == null;
    }
    
    public EntityLivingBase getThrower() {
        if (lIlIIIlllllIIllI(this.thrower) && lIlIIIlllllIIIll(this.throwerName) && lIlIIIlllllIIIII(this.throwerName.length())) {
            this.thrower = this.worldObj.getPlayerEntityByName(this.throwerName);
            if (lIlIIIlllllIIllI(this.thrower) && lIlIIIllllIllIII((this.worldObj instanceof WorldServer) ? 1 : 0)) {
                try {
                    final Entity llllllllllllIlIllIlIIIIIIlIIIlIl = ((WorldServer)this.worldObj).getEntityFromUuid(UUID.fromString(this.throwerName));
                    if (lIlIIIllllIllIII((llllllllllllIlIllIlIIIIIIlIIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                        this.thrower = (EntityLivingBase)llllllllllllIlIllIlIIIIIIlIIIlIl;
                        "".length();
                        if (((0x71 ^ 0x2B) & ~(0x73 ^ 0x29)) < ((0x1B ^ 0x36) & ~(0xA5 ^ 0x88))) {
                            return null;
                        }
                    }
                }
                catch (Throwable llllllllllllIlIllIlIIIIIIlIIIlII) {
                    this.thrower = null;
                }
            }
        }
        return this.thrower;
    }
    
    private static void lIlIIIllllIlIllI() {
        (lllIllIIIIIlll = new int[22])[0] = -" ".length();
        EntityThrowable.lllIllIIIIIlll[1] = " ".length();
        EntityThrowable.lllIllIIIIIlll[2] = ((0x3 ^ 0x52) & ~(0x19 ^ 0x48));
        EntityThrowable.lllIllIIIIIlll[3] = (0xFFFFACB3 & 0x57FC);
        EntityThrowable.lllIllIIIIIlll[4] = (0x82 ^ 0x87);
        EntityThrowable.lllIllIIIIIlll[5] = (0x18 ^ 0x1C);
        EntityThrowable.lllIllIIIIIlll[6] = "  ".length();
        EntityThrowable.lllIllIIIIIlll[7] = "   ".length();
        EntityThrowable.lllIllIIIIIlll[8] = (0x6 ^ 0x0);
        EntityThrowable.lllIllIIIIIlll[9] = (0x18 ^ 0x1F);
        EntityThrowable.lllIllIIIIIlll[10] = (0x63 ^ 0x6B);
        EntityThrowable.lllIllIIIIIlll[11] = (0xCD ^ 0xC4);
        EntityThrowable.lllIllIIIIIlll[12] = (0xB5 ^ 0xBF);
        EntityThrowable.lllIllIIIIIlll[13] = (0x73 ^ 0x31 ^ (0xE8 ^ 0xA1));
        EntityThrowable.lllIllIIIIIlll[14] = (0x53 ^ 0x5F);
        EntityThrowable.lllIllIIIIIlll[15] = (66 + 57 + 25 + 53 ^ 26 + 79 + 44 + 47);
        EntityThrowable.lllIllIIIIIlll[16] = (0xAB ^ 0x97 ^ (0x98 ^ 0xAA));
        EntityThrowable.lllIllIIIIIlll[17] = (0x1A ^ 0x8) + (121 + 94 - 149 + 72) - (0xE0 ^ 0xB3) + (86 + 9 + 18 + 69);
        EntityThrowable.lllIllIIIIIlll[18] = (45 + 19 + 39 + 76 ^ 15 + 117 - 99 + 155);
        EntityThrowable.lllIllIIIIIlll[19] = (37 + 119 - 52 + 43 ^ 129 + 54 - 71 + 19);
        EntityThrowable.lllIllIIIIIlll[20] = (0x9B ^ 0xA0 ^ (0x80 ^ 0xAA));
        EntityThrowable.lllIllIIIIIlll[21] = (0xD ^ 0x2B ^ (0x71 ^ 0x45));
    }
    
    private static boolean lIlIIIlllllIIIll(final Object llllllllllllIlIllIIllllllllllllI) {
        return llllllllllllIlIllIIllllllllllllI != null;
    }
    
    public EntityThrowable(final World llllllllllllIlIllIlIIIIIlIlllIll, final double llllllllllllIlIllIlIIIIIlIllIlIl, final double llllllllllllIlIllIlIIIIIlIllIlII, final double llllllllllllIlIllIlIIIIIlIllIIll) {
        super(llllllllllllIlIllIlIIIIIlIlllIll);
        this.xTile = EntityThrowable.lllIllIIIIIlll[0];
        this.yTile = EntityThrowable.lllIllIIIIIlll[0];
        this.zTile = EntityThrowable.lllIllIIIIIlll[0];
        this.ticksInGround = EntityThrowable.lllIllIIIIIlll[2];
        this.setSize(0.25f, 0.25f);
        this.setPosition(llllllllllllIlIllIlIIIIIlIllIlIl, llllllllllllIlIllIlIIIIIlIllIlII, llllllllllllIlIllIlIIIIIlIllIIll);
    }
    
    private static int lIlIIIllllIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
}
