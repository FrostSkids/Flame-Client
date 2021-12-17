// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import net.minecraft.util.DamageSource;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;

public abstract class EntityFireball extends Entity
{
    private /* synthetic */ int ticksInAir;
    private /* synthetic */ Block inTile;
    private /* synthetic */ int xTile;
    private static final /* synthetic */ String[] llIlIIIlIIIlll;
    public /* synthetic */ double accelerationZ;
    private static final /* synthetic */ int[] llIlIIIlIIllIl;
    public /* synthetic */ double accelerationX;
    private /* synthetic */ int yTile;
    public /* synthetic */ EntityLivingBase shootingEntity;
    private /* synthetic */ boolean inGround;
    private /* synthetic */ int zTile;
    public /* synthetic */ double accelerationY;
    private /* synthetic */ int ticksAlive;
    
    @Override
    public void onUpdate() {
        if (!lIIlIIIlllIIllIl(this.worldObj.isRemote ? 1 : 0) || ((!lIIlIIIlllIIlllI(this.shootingEntity) || lIIlIIIlllIIllIl(this.shootingEntity.isDead ? 1 : 0)) && lIIlIIIlllIIIllI(this.worldObj.isBlockLoaded(new BlockPos(this)) ? 1 : 0))) {
            super.onUpdate();
            this.setFire(EntityFireball.llIlIIIlIIllIl[1]);
            if (lIIlIIIlllIIIllI(this.inGround ? 1 : 0)) {
                if (lIIlIIIlllIIllll(this.worldObj.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock(), this.inTile)) {
                    this.ticksAlive += EntityFireball.llIlIIIlIIllIl[1];
                    if (lIIlIIIlllIlIIII(this.ticksAlive, EntityFireball.llIlIIIlIIllIl[3])) {
                        this.setDead();
                    }
                    return;
                }
                this.inGround = (EntityFireball.llIlIIIlIIllIl[2] != 0);
                this.motionX *= this.rand.nextFloat() * 0.2f;
                this.motionY *= this.rand.nextFloat() * 0.2f;
                this.motionZ *= this.rand.nextFloat() * 0.2f;
                this.ticksAlive = EntityFireball.llIlIIIlIIllIl[2];
                this.ticksInAir = EntityFireball.llIlIIIlIIllIl[2];
                "".length();
                if ((0x97 ^ 0x93) == 0x0) {
                    return;
                }
            }
            else {
                this.ticksInAir += EntityFireball.llIlIIIlIIllIl[1];
            }
            Vec3 llllllllllllIllIllIlIIIIllIlIIlI = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 llllllllllllIllIllIlIIIIllIlIIIl = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition llllllllllllIllIllIlIIIIllIlIIII = this.worldObj.rayTraceBlocks(llllllllllllIllIllIlIIIIllIlIIlI, llllllllllllIllIllIlIIIIllIlIIIl);
            llllllllllllIllIllIlIIIIllIlIIlI = new Vec3(this.posX, this.posY, this.posZ);
            llllllllllllIllIllIlIIIIllIlIIIl = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIllIlIIII)) {
                llllllllllllIllIllIlIIIIllIlIIIl = new Vec3(llllllllllllIllIllIlIIIIllIlIIII.hitVec.xCoord, llllllllllllIllIllIlIIIIllIlIIII.hitVec.yCoord, llllllllllllIllIllIlIIIIllIlIIII.hitVec.zCoord);
            }
            Entity llllllllllllIllIllIlIIIIllIIllll = null;
            final List<Entity> llllllllllllIllIllIlIIIIllIIlllI = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0, 1.0, 1.0));
            double llllllllllllIllIllIlIIIIllIIllIl = 0.0;
            int llllllllllllIllIllIlIIIIllIIllII = EntityFireball.llIlIIIlIIllIl[2];
            "".length();
            if ("   ".length() < ((0x6F ^ 0x2B) & ~(0x72 ^ 0x36))) {
                return;
            }
            while (!lIIlIIIlllIlIIIl(llllllllllllIllIllIlIIIIllIIllII, llllllllllllIllIllIlIIIIllIIlllI.size())) {
                final Entity llllllllllllIllIllIlIIIIllIIlIll = llllllllllllIllIllIlIIIIllIIlllI.get(llllllllllllIllIllIlIIIIllIIllII);
                if (lIIlIIIlllIIIllI(llllllllllllIllIllIlIIIIllIIlIll.canBeCollidedWith() ? 1 : 0) && (!lIIlIIIlllIIIllI(llllllllllllIllIllIlIIIIllIIlIll.isEntityEqual(this.shootingEntity) ? 1 : 0) || lIIlIIIlllIlIIIl(this.ticksInAir, EntityFireball.llIlIIIlIIllIl[4]))) {
                    final float llllllllllllIllIllIlIIIIllIIlIlI = 0.3f;
                    final AxisAlignedBB llllllllllllIllIllIlIIIIllIIlIIl = llllllllllllIllIllIlIIIIllIIlIll.getEntityBoundingBox().expand(llllllllllllIllIllIlIIIIllIIlIlI, llllllllllllIllIllIlIIIIllIIlIlI, llllllllllllIllIllIlIIIIllIIlIlI);
                    final MovingObjectPosition llllllllllllIllIllIlIIIIllIIlIII = llllllllllllIllIllIlIIIIllIIlIIl.calculateIntercept(llllllllllllIllIllIlIIIIllIlIIlI, llllllllllllIllIllIlIIIIllIlIIIl);
                    if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIllIIlIII)) {
                        final double llllllllllllIllIllIlIIIIllIIIlll = llllllllllllIllIllIlIIIIllIlIIlI.squareDistanceTo(llllllllllllIllIllIlIIIIllIIlIII.hitVec);
                        if (!lIIlIIIlllIlIIlI(lIIlIIIlllIIlIII(llllllllllllIllIllIlIIIIllIIIlll, llllllllllllIllIllIlIIIIllIIllIl)) || lIIlIIIlllIIllIl(lIIlIIIlllIIlIIl(llllllllllllIllIllIlIIIIllIIllIl, 0.0))) {
                            llllllllllllIllIllIlIIIIllIIllll = llllllllllllIllIllIlIIIIllIIlIll;
                            llllllllllllIllIllIlIIIIllIIllIl = llllllllllllIllIllIlIIIIllIIIlll;
                        }
                    }
                }
                ++llllllllllllIllIllIlIIIIllIIllII;
            }
            if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIllIIllll)) {
                llllllllllllIllIllIlIIIIllIlIIII = new MovingObjectPosition(llllllllllllIllIllIlIIIIllIIllll);
            }
            if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIllIlIIII)) {
                this.onImpact(llllllllllllIllIllIlIIIIllIlIIII);
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            final float llllllllllllIllIllIlIIIIllIIIllI = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(MathHelper.func_181159_b(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) + 90.0f;
            this.rotationPitch = (float)(MathHelper.func_181159_b(llllllllllllIllIllIlIIIIllIIIllI, this.motionY) * 180.0 / 3.141592653589793) - 90.0f;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
            while (!lIIlIIIlllIlIIlI(lIIlIIIlllIIlIlI(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
                this.prevRotationPitch -= 360.0f;
            }
            "".length();
            if (((0x25 ^ 0x57 ^ (0xEE ^ 0x88)) & (0xBB ^ 0xA4 ^ (0x7 ^ 0xC) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIIIlllIIIlll(lIIlIIIlllIIlIll(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
                this.prevRotationPitch += 360.0f;
            }
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lIIlIIIlllIlIIlI(lIIlIIIlllIIlIlI(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
                this.prevRotationYaw -= 360.0f;
            }
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIIIlllIIIlll(lIIlIIIlllIIlIll(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
                this.prevRotationYaw += 360.0f;
            }
            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
            float llllllllllllIllIllIlIIIIllIIIlIl = this.getMotionFactor();
            if (lIIlIIIlllIIIllI(this.isInWater() ? 1 : 0)) {
                int llllllllllllIllIllIlIIIIllIIIlII = EntityFireball.llIlIIIlIIllIl[2];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIIlIIIlllIlIIIl(llllllllllllIllIllIlIIIIllIIIlII, EntityFireball.llIlIIIlIIllIl[5])) {
                    final float llllllllllllIllIllIlIIIIllIIIIll = 0.25f;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * llllllllllllIllIllIlIIIIllIIIIll, this.posY - this.motionY * llllllllllllIllIllIlIIIIllIIIIll, this.posZ - this.motionZ * llllllllllllIllIllIlIIIIllIIIIll, this.motionX, this.motionY, this.motionZ, new int[EntityFireball.llIlIIIlIIllIl[2]]);
                    ++llllllllllllIllIllIlIIIIllIIIlII;
                }
                llllllllllllIllIllIlIIIIllIIIlIl = 0.8f;
            }
            this.motionX += this.accelerationX;
            this.motionY += this.accelerationY;
            this.motionZ += this.accelerationZ;
            this.motionX *= llllllllllllIllIllIlIIIIllIIIlIl;
            this.motionY *= llllllllllllIllIllIlIIIIllIIIlIl;
            this.motionZ *= llllllllllllIllIllIlIIIIllIIIlIl;
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[EntityFireball.llIlIIIlIIllIl[2]]);
            this.setPosition(this.posX, this.posY, this.posZ);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.setDead();
        }
    }
    
    private static boolean lIIlIIIlllIIIlll(final int llllllllllllIllIllIlIIIIIlIIIlIl) {
        return llllllllllllIllIllIlIIIIIlIIIlIl < 0;
    }
    
    protected abstract void onImpact(final MovingObjectPosition p0);
    
    public EntityFireball(final World llllllllllllIllIllIlIIIlIIIIIllI, final double llllllllllllIllIllIlIIIlIIIIIlIl, final double llllllllllllIllIllIlIIIIlllllIll, final double llllllllllllIllIllIlIIIIlllllIlI, final double llllllllllllIllIllIlIIIlIIIIIIlI, final double llllllllllllIllIllIlIIIlIIIIIIIl, final double llllllllllllIllIllIlIIIIllllIlll) {
        super(llllllllllllIllIllIlIIIlIIIIIllI);
        this.xTile = EntityFireball.llIlIIIlIIllIl[0];
        this.yTile = EntityFireball.llIlIIIlIIllIl[0];
        this.zTile = EntityFireball.llIlIIIlIIllIl[0];
        this.setSize(1.0f, 1.0f);
        this.setLocationAndAngles(llllllllllllIllIllIlIIIlIIIIIlIl, llllllllllllIllIllIlIIIIlllllIll, llllllllllllIllIllIlIIIIlllllIlI, this.rotationYaw, this.rotationPitch);
        this.setPosition(llllllllllllIllIllIlIIIlIIIIIlIl, llllllllllllIllIllIlIIIIlllllIll, llllllllllllIllIllIlIIIIlllllIlI);
        final double llllllllllllIllIllIlIIIIllllllll = MathHelper.sqrt_double(llllllllllllIllIllIlIIIlIIIIIIlI * llllllllllllIllIllIlIIIlIIIIIIlI + llllllllllllIllIllIlIIIlIIIIIIIl * llllllllllllIllIllIlIIIlIIIIIIIl + llllllllllllIllIllIlIIIIllllIlll * llllllllllllIllIllIlIIIIllllIlll);
        this.accelerationX = llllllllllllIllIllIlIIIlIIIIIIlI / llllllllllllIllIllIlIIIIllllllll * 0.1;
        this.accelerationY = llllllllllllIllIllIlIIIlIIIIIIIl / llllllllllllIllIllIlIIIIllllllll * 0.1;
        this.accelerationZ = llllllllllllIllIllIlIIIIllllIlll / llllllllllllIllIllIlIIIIllllllll * 0.1;
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static boolean lIIlIIIlllIIIllI(final int llllllllllllIllIllIlIIIIIlIIlIll) {
        return llllllllllllIllIllIlIIIIIlIIlIll != 0;
    }
    
    private static boolean lIIlIIIlllIlIIIl(final int llllllllllllIllIllIlIIIIIlIllIlI, final int llllllllllllIllIllIlIIIIIlIllIIl) {
        return llllllllllllIllIllIlIIIIIlIllIlI >= llllllllllllIllIllIlIIIIIlIllIIl;
    }
    
    private static boolean lIIlIIIlllIlIIII(final int llllllllllllIllIllIlIIIIIlIllllI, final int llllllllllllIllIllIlIIIIIlIlllIl) {
        return llllllllllllIllIllIlIIIIIlIllllI == llllllllllllIllIllIlIIIIIlIlllIl;
    }
    
    private static String lIIlIIIllIlIllII(final String llllllllllllIllIllIlIIIIIllIIllI, final String llllllllllllIllIllIlIIIIIllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIIIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlIIIIIllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlIIIIIllIlIII.init(EntityFireball.llIlIIIlIIllIl[6], llllllllllllIllIllIlIIIIIllIlIIl);
            return new String(llllllllllllIllIllIlIIIIIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIIIIllIIlll) {
            llllllllllllIllIllIlIIIIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIIllIlIlIll(String llllllllllllIllIllIlIIIIlIIIIIll, final String llllllllllllIllIllIlIIIIlIIIIIlI) {
        llllllllllllIllIllIlIIIIlIIIIIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIlIIIIlIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIlIIIIlIIIIllI = new StringBuilder();
        final char[] llllllllllllIllIllIlIIIIlIIIIlIl = llllllllllllIllIllIlIIIIlIIIIIlI.toCharArray();
        int llllllllllllIllIllIlIIIIlIIIIlII = EntityFireball.llIlIIIlIIllIl[2];
        final boolean llllllllllllIllIllIlIIIIIllllllI = (Object)((String)llllllllllllIllIllIlIIIIlIIIIIll).toCharArray();
        final long llllllllllllIllIllIlIIIIIlllllIl = llllllllllllIllIllIlIIIIIllllllI.length;
        Exception llllllllllllIllIllIlIIIIIlllllII = (Exception)EntityFireball.llIlIIIlIIllIl[2];
        while (lIIlIIIlllIlIlII((int)llllllllllllIllIllIlIIIIIlllllII, (int)llllllllllllIllIllIlIIIIIlllllIl)) {
            final char llllllllllllIllIllIlIIIIlIIIlIIl = llllllllllllIllIllIlIIIIIllllllI[llllllllllllIllIllIlIIIIIlllllII];
            llllllllllllIllIllIlIIIIlIIIIllI.append((char)(llllllllllllIllIllIlIIIIlIIIlIIl ^ llllllllllllIllIllIlIIIIlIIIIlIl[llllllllllllIllIllIlIIIIlIIIIlII % llllllllllllIllIllIlIIIIlIIIIlIl.length]));
            "".length();
            ++llllllllllllIllIllIlIIIIlIIIIlII;
            ++llllllllllllIllIllIlIIIIIlllllII;
            "".length();
            if ((0x6A ^ 0x6F) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIlIIIIlIIIIllI);
    }
    
    private static void lIIlIIIlllIIIlII() {
        (llIlIIIlIIllIl = new int[22])[0] = -" ".length();
        EntityFireball.llIlIIIlIIllIl[1] = " ".length();
        EntityFireball.llIlIIIlIIllIl[2] = ((0x4A ^ 0x71) & ~(0x1A ^ 0x21));
        EntityFireball.llIlIIIlIIllIl[3] = (-(0xFFFFFDF7 & 0x7229) & (0xFFFFF379 & 0x7EFE));
        EntityFireball.llIlIIIlIIllIl[4] = (0xB6 ^ 0xC2 ^ (0xFA ^ 0x97));
        EntityFireball.llIlIIIlIIllIl[5] = (0x47 ^ 0x53 ^ (0x5A ^ 0x4A));
        EntityFireball.llIlIIIlIIllIl[6] = "  ".length();
        EntityFireball.llIlIIIlIIllIl[7] = "   ".length();
        EntityFireball.llIlIIIlIIllIl[8] = (0x44 ^ 0x41);
        EntityFireball.llIlIIIlIIllIl[9] = (0x78 ^ 0x7E);
        EntityFireball.llIlIIIlIIllIl[10] = (0x76 ^ 0x71);
        EntityFireball.llIlIIIlIIllIl[11] = (128 + 126 - 203 + 107 ^ 127 + 127 - 228 + 124);
        EntityFireball.llIlIIIlIIllIl[12] = (0x92 ^ 0x9B);
        EntityFireball.llIlIIIlIIllIl[13] = (0x34 ^ 0x3E);
        EntityFireball.llIlIIIlIIllIl[14] = (41 + 179 - 205 + 192 ^ 193 + 188 - 345 + 160);
        EntityFireball.llIlIIIlIIllIl[15] = (78 + 154 - 111 + 47 ^ 82 + 131 - 130 + 81);
        EntityFireball.llIlIIIlIIllIl[16] = (0x4E ^ 0x75) + (210 + 192 - 292 + 138) - (0x12 ^ 0x61) + (0x4C ^ 0x73);
        EntityFireball.llIlIIIlIIllIl[17] = (0xEC ^ 0x9F ^ (0x41 ^ 0x3F));
        EntityFireball.llIlIIIlIIllIl[18] = (0x34 ^ 0xC ^ (0x68 ^ 0x5E));
        EntityFireball.llIlIIIlIIllIl[19] = (0x78 ^ 0x77);
        EntityFireball.llIlIIIlIIllIl[20] = (0xFFFFCDF3 & 0xF032FC);
        EntityFireball.llIlIIIlIIllIl[21] = (0x1F ^ 0x16 ^ (0x7C ^ 0x65));
    }
    
    private static String lIIlIIIllIlIllIl(final String llllllllllllIllIllIlIIIIIlllIIll, final String llllllllllllIllIllIlIIIIIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), EntityFireball.llIlIIIlIIllIl[11]), "DES");
            final Cipher llllllllllllIllIllIlIIIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllIllIllIlIIIIIlllIlIl.init(EntityFireball.llIlIIIlIIllIl[6], llllllllllllIllIllIlIIIIIlllIllI);
            return new String(llllllllllllIllIllIlIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIIIIlllIlII) {
            llllllllllllIllIllIlIIIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public float getBrightness(final float llllllllllllIllIllIlIIIIlIIlIlIl) {
        return 1.0f;
    }
    
    private static boolean lIIlIIIlllIIllIl(final int llllllllllllIllIllIlIIIIIlIIlIIl) {
        return llllllllllllIllIllIlIIIIIlIIlIIl == 0;
    }
    
    private static int lIIlIIIlllIIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIllIlIIIIlIlIIlII) {
        this.xTile = llllllllllllIllIllIlIIIIlIlIIlII.getShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[10]]);
        this.yTile = llllllllllllIllIllIlIIIIlIlIIlII.getShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[11]]);
        this.zTile = llllllllllllIllIllIlIIIIlIlIIlII.getShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[12]]);
        if (lIIlIIIlllIIIllI(llllllllllllIllIllIlIIIIlIlIIlII.hasKey(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[13]], EntityFireball.llIlIIIlIIllIl[11]) ? 1 : 0)) {
            this.inTile = Block.getBlockFromName(llllllllllllIllIllIlIIIIlIlIIlII.getString(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[14]]));
            "".length();
            if (((0xC9 ^ 0xBD ^ (0x45 ^ 0x4)) & (0xE0 ^ 0xBD ^ (0x53 ^ 0x3B) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.inTile = Block.getBlockById(llllllllllllIllIllIlIIIIlIlIIlII.getByte(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[15]]) & EntityFireball.llIlIIIlIIllIl[16]);
        }
        int inGround;
        if (lIIlIIIlllIlIIII(llllllllllllIllIllIlIIIIlIlIIlII.getByte(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[17]]), EntityFireball.llIlIIIlIIllIl[1])) {
            inGround = EntityFireball.llIlIIIlIIllIl[1];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            inGround = EntityFireball.llIlIIIlIIllIl[2];
        }
        this.inGround = (inGround != 0);
        if (lIIlIIIlllIIIllI(llllllllllllIllIllIlIIIIlIlIIlII.hasKey(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[18]], EntityFireball.llIlIIIlIIllIl[12]) ? 1 : 0)) {
            final NBTTagList llllllllllllIllIllIlIIIIlIlIIllI = llllllllllllIllIllIlIIIIlIlIIlII.getTagList(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[19]], EntityFireball.llIlIIIlIIllIl[9]);
            this.motionX = llllllllllllIllIllIlIIIIlIlIIllI.getDoubleAt(EntityFireball.llIlIIIlIIllIl[2]);
            this.motionY = llllllllllllIllIllIlIIIIlIlIIllI.getDoubleAt(EntityFireball.llIlIIIlIIllIl[1]);
            this.motionZ = llllllllllllIllIllIlIIIIlIlIIllI.getDoubleAt(EntityFireball.llIlIIIlIIllIl[6]);
            "".length();
            if ((0x4A ^ 0x4F) == 0x0) {
                return;
            }
        }
        else {
            this.setDead();
        }
    }
    
    private static int lIIlIIIlllIIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected float getMotionFactor() {
        return 0.95f;
    }
    
    static {
        lIIlIIIlllIIIlII();
        lIIlIIIlllIIIIIl();
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIllIllIlIIIlIIIlIlIl) {
        double llllllllllllIllIllIlIIIlIIIlIlII = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0;
        if (lIIlIIIlllIIIllI(Double.isNaN(llllllllllllIllIllIlIIIlIIIlIlII) ? 1 : 0)) {
            llllllllllllIllIllIlIIIlIIIlIlII = 4.0;
        }
        llllllllllllIllIllIlIIIlIIIlIlII *= 64.0;
        if (lIIlIIIlllIIIlll(lIIlIIIlllIIIlIl(llllllllllllIllIllIlIIIlIIIlIlIl, llllllllllllIllIllIlIIIlIIIlIlII * llllllllllllIllIllIlIIIlIIIlIlII))) {
            return EntityFireball.llIlIIIlIIllIl[1] != 0;
        }
        return EntityFireball.llIlIIIlIIllIl[2] != 0;
    }
    
    private static boolean lIIlIIIlllIlIIll(final Object llllllllllllIllIllIlIIIIIlIIllIl) {
        return llllllllllllIllIllIlIIIIIlIIllIl == null;
    }
    
    @Override
    public float getCollisionBorderSize() {
        return 1.0f;
    }
    
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIllIlIIIIlIllIIII) {
        llllllllllllIllIllIlIIIIlIllIIII.setShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[2]], (short)this.xTile);
        llllllllllllIllIllIlIIIIlIllIIII.setShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[1]], (short)this.yTile);
        llllllllllllIllIllIlIIIIlIllIIII.setShort(EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[6]], (short)this.zTile);
        final ResourceLocation llllllllllllIllIllIlIIIIlIlIllll = Block.blockRegistry.getNameForObject(this.inTile);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[7]];
        String string;
        if (lIIlIIIlllIlIIll(llllllllllllIllIllIlIIIIlIlIllll)) {
            string = EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[5]];
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            string = llllllllllllIllIllIlIIIIlIlIllll.toString();
        }
        llllllllllllIllIllIlIIIIlIllIIII.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        final String lllllllllllllIIIIIlIIIlIIllIIlll = EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[8]];
        int n;
        if (lIIlIIIlllIIIllI(this.inGround ? 1 : 0)) {
            n = EntityFireball.llIlIIIlIIllIl[1];
            "".length();
            if (((0x15 ^ 0x4B) & ~(0x44 ^ 0x1A)) < ((0xC ^ 0x35) & ~(0xF8 ^ 0xC1))) {
                return;
            }
        }
        else {
            n = EntityFireball.llIlIIIlIIllIl[2];
        }
        llllllllllllIllIllIlIIIIlIllIIII.setByte(lllllllllllllIIIIIlIIIlIIllIIlll, (byte)n);
        final String lllllllllllllIIIIIlIIIlIIllllIlI = EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[9]];
        final double[] lllllllllllllIIlIlllIlIIIIIllIII = new double[EntityFireball.llIlIIIlIIllIl[7]];
        lllllllllllllIIlIlllIlIIIIIllIII[EntityFireball.llIlIIIlIIllIl[2]] = this.motionX;
        lllllllllllllIIlIlllIlIIIIIllIII[EntityFireball.llIlIIIlIIllIl[1]] = this.motionY;
        lllllllllllllIIlIlllIlIIIIIllIII[EntityFireball.llIlIIIlIIllIl[6]] = this.motionZ;
        llllllllllllIllIllIlIIIIlIllIIII.setTag(lllllllllllllIIIIIlIIIlIIllllIlI, this.newDoubleNBTList(lllllllllllllIIlIlllIlIIIIIllIII));
    }
    
    private static boolean lIIlIIIlllIlIlII(final int llllllllllllIllIllIlIIIIIlIlIllI, final int llllllllllllIllIllIlIIIIIlIlIlIl) {
        return llllllllllllIllIllIlIIIIIlIlIllI < llllllllllllIllIllIlIIIIIlIlIlIl;
    }
    
    public EntityFireball(final World llllllllllllIllIllIlIIIlIIIlllIl) {
        super(llllllllllllIllIllIlIIIlIIIlllIl);
        this.xTile = EntityFireball.llIlIIIlIIllIl[0];
        this.yTile = EntityFireball.llIlIIIlIIllIl[0];
        this.zTile = EntityFireball.llIlIIIlIIllIl[0];
        this.setSize(1.0f, 1.0f);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityFireball.llIlIIIlIIllIl[1] != 0;
    }
    
    private static boolean lIIlIIIlllIlIIlI(final int llllllllllllIllIllIlIIIIIlIIIlll) {
        return llllllllllllIllIllIlIIIIIlIIIlll >= 0;
    }
    
    private static void lIIlIIIlllIIIIIl() {
        (llIlIIIlIIIlll = new String[EntityFireball.llIlIIIlIIllIl[21]])[EntityFireball.llIlIIIlIIllIl[2]] = lIIlIIIllIlIlIll("MSc7BCw=", "IsRhI");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[1]] = lIIlIIIllIlIllII("vLy7ayNeiyo=", "DQlzo");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[6]] = lIIlIIIllIlIllII("G4C0gvArGtM=", "tJGrT");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[7]] = lIIlIIIllIlIllIl("31k7yxhBUDU=", "wlfSg");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[5]] = lIIlIIIllIlIllIl("mCxk9+YWIZA=", "wFYEV");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[8]] = lIIlIIIllIlIllII("GrswbmX5nKyNZK/v9OG2QA==", "xeiow");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[9]] = lIIlIIIllIlIllIl("r6iyPL8F5V5CCUgp3RuuGw==", "NJtbx");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[10]] = lIIlIIIllIlIlIll("ChAbOy0=", "rDrWH");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[11]] = lIIlIIIllIlIlIll("KgMqJQ4=", "SWCIk");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[12]] = lIIlIIIllIlIllIl("M+CD6o97Wxc=", "qXVKd");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[13]] = lIIlIIIllIlIllII("bA8lW1WXhKQ=", "xgWaV");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[14]] = lIIlIIIllIlIllIl("a3uVUwHZOTk=", "KtKRY");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[15]] = lIIlIIIllIlIllII("mPW/uutV8Pk=", "dOVyo");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[17]] = lIIlIIIllIlIllIl("RZXLXqDPJm/8eVX3fXdKzg==", "tXWUO");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[18]] = lIIlIIIllIlIllII("DJhdr/EWFOGNafko9+dTyg==", "PogKp");
        EntityFireball.llIlIIIlIIIlll[EntityFireball.llIlIIIlIIllIl[19]] = lIIlIIIllIlIllII("zMCFwW1apnBjYb/7zPlKjw==", "PRQzr");
    }
    
    public EntityFireball(final World llllllllllllIllIllIlIIIIlllIllIl, final EntityLivingBase llllllllllllIllIllIlIIIIlllIIlIl, double llllllllllllIllIllIlIIIIlllIIlII, double llllllllllllIllIllIlIIIIlllIIIll, double llllllllllllIllIllIlIIIIlllIIIlI) {
        super(llllllllllllIllIllIlIIIIlllIllIl);
        this.xTile = EntityFireball.llIlIIIlIIllIl[0];
        this.yTile = EntityFireball.llIlIIIlIIllIl[0];
        this.zTile = EntityFireball.llIlIIIlIIllIl[0];
        this.shootingEntity = llllllllllllIllIllIlIIIIlllIIlIl;
        this.setSize(1.0f, 1.0f);
        this.setLocationAndAngles(llllllllllllIllIllIlIIIIlllIIlIl.posX, llllllllllllIllIllIlIIIIlllIIlIl.posY, llllllllllllIllIllIlIIIIlllIIlIl.posZ, llllllllllllIllIllIlIIIIlllIIlIl.rotationYaw, llllllllllllIllIllIlIIIIlllIIlIl.rotationPitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        llllllllllllIllIllIlIIIIlllIIlII += this.rand.nextGaussian() * 0.4;
        llllllllllllIllIllIlIIIIlllIIIll += this.rand.nextGaussian() * 0.4;
        llllllllllllIllIllIlIIIIlllIIIlI += (byte)(this.rand.nextGaussian() * 0.4);
        final double llllllllllllIllIllIlIIIIlllIlIII = MathHelper.sqrt_double(llllllllllllIllIllIlIIIIlllIIlII * llllllllllllIllIllIlIIIIlllIIlII + llllllllllllIllIllIlIIIIlllIIIll * llllllllllllIllIllIlIIIIlllIIIll + llllllllllllIllIllIlIIIIlllIIIlI * llllllllllllIllIllIlIIIIlllIIIlI);
        this.accelerationX = llllllllllllIllIllIlIIIIlllIIlII / llllllllllllIllIllIlIIIIlllIlIII * 0.1;
        this.accelerationY = llllllllllllIllIllIlIIIIlllIIIll / llllllllllllIllIllIlIIIIlllIlIII * 0.1;
        this.accelerationZ = llllllllllllIllIllIlIIIIlllIIIlI / llllllllllllIllIllIlIIIIlllIlIII * 0.1;
    }
    
    private static boolean lIIlIIIlllIIlllI(final Object llllllllllllIllIllIlIIIIIlIlIIll) {
        return llllllllllllIllIllIlIIIIIlIlIIll != null;
    }
    
    private static int lIIlIIIlllIIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public int getBrightnessForRender(final float llllllllllllIllIllIlIIIIlIIlIIll) {
        return EntityFireball.llIlIIIlIIllIl[20];
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllIllIlIIIIlIIllIII, final float llllllllllllIllIllIlIIIIlIIllIll) {
        if (lIIlIIIlllIIIllI(this.isEntityInvulnerable(llllllllllllIllIllIlIIIIlIIllIII) ? 1 : 0)) {
            return EntityFireball.llIlIIIlIIllIl[2] != 0;
        }
        this.setBeenAttacked();
        if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIlIIllIII.getEntity())) {
            final Vec3 llllllllllllIllIllIlIIIIlIIllIlI = llllllllllllIllIllIlIIIIlIIllIII.getEntity().getLookVec();
            if (lIIlIIIlllIIlllI(llllllllllllIllIllIlIIIIlIIllIlI)) {
                this.motionX = llllllllllllIllIllIlIIIIlIIllIlI.xCoord;
                this.motionY = llllllllllllIllIllIlIIIIlIIllIlI.yCoord;
                this.motionZ = llllllllllllIllIllIlIIIIlIIllIlI.zCoord;
                this.accelerationX = this.motionX * 0.1;
                this.accelerationY = this.motionY * 0.1;
                this.accelerationZ = this.motionZ * 0.1;
            }
            if (lIIlIIIlllIIIllI((llllllllllllIllIllIlIIIIlIIllIII.getEntity() instanceof EntityLivingBase) ? 1 : 0)) {
                this.shootingEntity = (EntityLivingBase)llllllllllllIllIllIlIIIIlIIllIII.getEntity();
            }
            return EntityFireball.llIlIIIlIIllIl[1] != 0;
        }
        return EntityFireball.llIlIIIlIIllIl[2] != 0;
    }
    
    private static int lIIlIIIlllIIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIIlIIIlllIIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlIIIlllIIllll(final Object llllllllllllIllIllIlIIIIIlIlIIII, final Object llllllllllllIllIllIlIIIIIlIIllll) {
        return llllllllllllIllIllIlIIIIIlIlIIII == llllllllllllIllIllIlIIIIIlIIllll;
    }
}
