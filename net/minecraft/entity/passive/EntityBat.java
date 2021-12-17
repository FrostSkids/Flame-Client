// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import java.util.Arrays;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.util.Calendar;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.Block;
import net.minecraft.util.DamageSource;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;

public class EntityBat extends EntityAmbientCreature
{
    private static final /* synthetic */ String[] lIIIIlIllIllll;
    private static final /* synthetic */ int[] lIIIIllIIlIlIl;
    private /* synthetic */ BlockPos spawnPosition;
    
    private static String lIlllIlIlIIllIl(final String lllllllllllllIlIIlIIlllIIIIllllI, final String lllllllllllllIlIIlIIlllIIIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlllIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIlllIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIlllIIIlIIIII.init(EntityBat.lIIIIllIIlIlIl[4], lllllllllllllIlIIlIIlllIIIlIIIIl);
            return new String(lllllllllllllIlIIlIIlllIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlllIIIIlllll) {
            lllllllllllllIlIIlIIlllIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.1f;
    }
    
    @Override
    public void fall(final float lllllllllllllIlIIlIIlllIIlIlIlIl, final float lllllllllllllIlIIlIIlllIIlIlIlII) {
    }
    
    private static boolean lIlllIllIIllIII(final Object lllllllllllllIlIIlIIllIllllllIlI) {
        return lllllllllllllIlIIlIIllIllllllIlI != null;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIlIIlllIIlIIIllI, final float lllllllllllllIlIIlIIlllIIlIIIlIl) {
        if (lIlllIllIIlIlIl(this.isEntityInvulnerable(lllllllllllllIlIIlIIlllIIlIIIllI) ? 1 : 0)) {
            return EntityBat.lIIIIllIIlIlIl[2] != 0;
        }
        if (lIlllIllIIlIlll(this.worldObj.isRemote ? 1 : 0) && lIlllIllIIlIlIl(this.getIsBatHanging() ? 1 : 0)) {
            this.setIsBatHanging((boolean)(EntityBat.lIIIIllIIlIlIl[2] != 0));
        }
        return super.attackEntityFrom(lllllllllllllIlIIlIIlllIIlIIIllI, lllllllllllllIlIIlIIlllIIlIIIlIl);
    }
    
    private static boolean lIlllIllIIlIlll(final int lllllllllllllIlIIlIIllIlllllIllI) {
        return lllllllllllllIlIIlIIllIlllllIllI == 0;
    }
    
    private static void lIlllIllIIlIlII() {
        (lIIIIllIIlIlIl = new int[19])[0] = " ".length();
        EntityBat.lIIIIllIIlIlIl[1] = (0xE1 ^ 0xC0 ^ (0xF5 ^ 0xC4));
        EntityBat.lIIIIllIIlIlIl[2] = ((95 + 72 - 164 + 199 ^ 5 + 50 + 34 + 41) & (83 + 150 - 60 + 37 ^ 110 + 39 - 40 + 45 ^ -" ".length()));
        EntityBat.lIIIIllIIlIlIl[3] = (0x89 ^ 0x8D);
        EntityBat.lIIIIllIIlIlIl[4] = "  ".length();
        EntityBat.lIIIIllIIlIlIl[5] = -"  ".length();
        EntityBat.lIIIIllIIlIlIl[6] = (0xFFFFD7FF & 0x2BF7);
        EntityBat.lIIIIllIIlIlIl[7] = (0xD0 ^ 0x8B) + (0x7 ^ 0x6D) - (0xFC ^ 0x99) + (0xE8 ^ 0x80);
        EntityBat.lIIIIllIIlIlIl[8] = (0xFFFFDBED & 0x257A);
        EntityBat.lIIIIllIIlIlIl[9] = (0x43 ^ 0x5D);
        EntityBat.lIIIIllIIlIlIl[10] = (0x75 ^ 0x72);
        EntityBat.lIIIIllIIlIlIl[11] = (0xC2 ^ 0xC4);
        EntityBat.lIIIIllIIlIlIl[12] = (0xDD ^ 0xB9);
        EntityBat.lIIIIllIIlIlIl[13] = "   ".length();
        EntityBat.lIIIIllIIlIlIl[14] = (0x33 ^ 0x39);
        EntityBat.lIIIIllIIlIlIl[15] = (0x60 ^ 0x65);
        EntityBat.lIIIIllIIlIlIl[16] = (0x75 ^ 0x27 ^ (0x4B ^ 0xD));
        EntityBat.lIIIIllIIlIlIl[17] = (43 + 47 - 62 + 148 ^ 45 + 61 + 36 + 45);
        EntityBat.lIIIIllIIlIlIl[18] = (0x18 ^ 0x10);
    }
    
    @Override
    protected void updateFallState(final double lllllllllllllIlIIlIIlllIIlIlIIlI, final boolean lllllllllllllIlIIlIIlllIIlIlIIIl, final Block lllllllllllllIlIIlIIlllIIlIlIIII, final BlockPos lllllllllllllIlIIlIIlllIIlIIllll) {
    }
    
    @Override
    protected String getHurtSound() {
        return EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[0]];
    }
    
    private static boolean lIlllIllIIlIlIl(final int lllllllllllllIlIIlIIllIllllllIII) {
        return lllllllllllllIlIIlIIllIllllllIII != 0;
    }
    
    public boolean getIsBatHanging() {
        if (lIlllIllIIlIlIl(this.dataWatcher.getWatchableObjectByte(EntityBat.lIIIIllIIlIlIl[1]) & EntityBat.lIIIIllIIlIlIl[0])) {
            return EntityBat.lIIIIllIIlIlIl[0] != 0;
        }
        return EntityBat.lIIIIllIIlIlIl[2] != 0;
    }
    
    @Override
    public boolean canBePushed() {
        return EntityBat.lIIIIllIIlIlIl[2] != 0;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIlIIlllIIlIIIIIl) {
        super.readEntityFromNBT(lllllllllllllIlIIlIIlllIIlIIIIIl);
        this.dataWatcher.updateObject(EntityBat.lIIIIllIIlIlIl[1], lllllllllllllIlIIlIIlllIIlIIIIIl.getByte(EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[13]]));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIlIIlllIIIlllIIl) {
        super.writeEntityToNBT(lllllllllllllIlIIlIIlllIIIlllIIl);
        lllllllllllllIlIIlIIlllIIIlllIIl.setByte(EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[3]], this.dataWatcher.getWatchableObjectByte(EntityBat.lIIIIllIIlIlIl[1]));
    }
    
    static {
        lIlllIllIIlIlII();
        lIlllIlIlIlIIll();
    }
    
    public EntityBat(final World lllllllllllllIlIIlIIlllIlIIlIlII) {
        super(lllllllllllllIlIIlIIlllIlIIlIlII);
        this.setSize(0.5f, 0.9f);
        this.setIsBatHanging((boolean)(EntityBat.lIIIIllIIlIlIl[0] != 0));
    }
    
    private static boolean lIlllIllIIllIIl(final int lllllllllllllIlIIlIIlllIIIIIIIIl, final int lllllllllllllIlIIlIIlllIIIIIIIII) {
        return lllllllllllllIlIIlIIlllIIIIIIIIl < lllllllllllllIlIIlIIlllIIIIIIIII;
    }
    
    @Override
    protected void collideWithNearbyEntities() {
    }
    
    private static boolean lIlllIllIIlllIl(final int lllllllllllllIlIIlIIlllIIIIIlIIl, final int lllllllllllllIlIIlIIlllIIIIIlIII) {
        return lllllllllllllIlIIlIIlllIIIIIlIIl == lllllllllllllIlIIlIIlllIIIIIlIII;
    }
    
    private static void lIlllIlIlIlIIll() {
        (lIIIIlIllIllll = new String[EntityBat.lIIIIllIIlIlIl[15]])[EntityBat.lIIIIllIIlIlIl[2]] = lIlllIlIlIIllIl("kpj832rEbmC+GqiRIYDb3Q==", "yMFUl");
        EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[0]] = lIlllIlIlIIlllI("dc9kHjwe8yp6NQmHFg9x3A==", "qsKKx");
        EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[4]] = lIlllIlIlIIllIl("AQ+48TrKuicScvADQfEf9g==", "tNDDZ");
        EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[13]] = lIlllIlIlIIllIl("F+r4c/gY89tCKIXwYUoP8Q==", "jMPoF");
        EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[3]] = lIlllIlIlIIlllI("qaqonLgZl3yoMFIJli6ZLg==", "PPQNL");
    }
    
    @Override
    public float getEyeHeight() {
        return this.height / 2.0f;
    }
    
    private static boolean lIlllIllIIlllII(final int lllllllllllllIlIIlIIllIlllllllIl, final int lllllllllllllIlIIlIIllIlllllllII) {
        return lllllllllllllIlIIlIIllIlllllllIl > lllllllllllllIlIIlIIllIlllllllII;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(6.0);
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIlllIllIIlIlIl(this.getIsBatHanging() ? 1 : 0)) {
            final double motionX = 0.0;
            this.motionZ = motionX;
            this.motionY = motionX;
            this.motionX = motionX;
            this.posY = MathHelper.floor_double(this.posY) + 1.0 - this.height;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            this.motionY *= 0.6000000238418579;
        }
    }
    
    @Override
    protected float getSoundPitch() {
        return super.getSoundPitch() * 0.95f;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityBat.lIIIIllIIlIlIl[1], new Byte((byte)EntityBat.lIIIIllIIlIlIl[2]));
    }
    
    private boolean isDateAroundHalloween(final Calendar lllllllllllllIlIIlIIlllIIIlIlIlI) {
        if ((!lIlllIllIIlllIl(lllllllllllllIlIIlIIlllIIIlIlIlI.get(EntityBat.lIIIIllIIlIlIl[4]) + EntityBat.lIIIIllIIlIlIl[0], EntityBat.lIIIIllIIlIlIl[14]) || lIlllIllIIllIIl(lllllllllllllIlIIlIIlllIIIlIlIlI.get(EntityBat.lIIIIllIIlIlIl[15]), EntityBat.lIIIIllIIlIlIl[16])) && (!lIlllIllIIlllIl(lllllllllllllIlIIlIIlllIIIlIlIlI.get(EntityBat.lIIIIllIIlIlIl[4]) + EntityBat.lIIIIllIIlIlIl[0], EntityBat.lIIIIllIIlIlIl[17]) || lIlllIllIIlllII(lllllllllllllIlIIlIIlllIIIlIlIlI.get(EntityBat.lIIIIllIIlIlIl[15]), EntityBat.lIIIIllIIlIlIl[13]))) {
            return EntityBat.lIIIIllIIlIlIl[2] != 0;
        }
        return EntityBat.lIIIIllIIlIlIl[0] != 0;
    }
    
    @Override
    public boolean doesEntityNotTriggerPressurePlate() {
        return EntityBat.lIIIIllIIlIlIl[0] != 0;
    }
    
    @Override
    protected void updateAITasks() {
        super.updateAITasks();
        final BlockPos lllllllllllllIlIIlIIlllIIllIIllI = new BlockPos(this);
        final BlockPos lllllllllllllIlIIlIIlllIIllIIlIl = lllllllllllllIlIIlIIlllIIllIIllI.up();
        if (lIlllIllIIlIlIl(this.getIsBatHanging() ? 1 : 0)) {
            if (lIlllIllIIlIlll(this.worldObj.getBlockState(lllllllllllllIlIIlIIlllIIllIIlIl).getBlock().isNormalCube() ? 1 : 0)) {
                this.setIsBatHanging((boolean)(EntityBat.lIIIIllIIlIlIl[2] != 0));
                this.worldObj.playAuxSFXAtEntity(null, EntityBat.lIIIIllIIlIlIl[6], lllllllllllllIlIIlIIlllIIllIIllI, EntityBat.lIIIIllIIlIlIl[2]);
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
            }
            else {
                if (lIlllIllIIlIlll(this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[7]))) {
                    this.rotationYawHead = (float)this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[8]);
                }
                if (lIlllIllIIllIII(this.worldObj.getClosestPlayerToEntity(this, 4.0))) {
                    this.setIsBatHanging((boolean)(EntityBat.lIIIIllIIlIlIl[2] != 0));
                    this.worldObj.playAuxSFXAtEntity(null, EntityBat.lIIIIllIIlIlIl[6], lllllllllllllIlIIlIIlllIIllIIllI, EntityBat.lIIIIllIIlIlIl[2]);
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
            }
        }
        else {
            if (lIlllIllIIllIII(this.spawnPosition) && (!lIlllIllIIlIlIl(this.worldObj.isAirBlock(this.spawnPosition) ? 1 : 0) || lIlllIllIIllIIl(this.spawnPosition.getY(), EntityBat.lIIIIllIIlIlIl[0]))) {
                this.spawnPosition = null;
            }
            if (!lIlllIllIIllIII(this.spawnPosition) || !lIlllIllIIlIlIl(this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[9])) || lIlllIllIIllIlI(lIlllIllIIlIllI(this.spawnPosition.distanceSq((int)this.posX, (int)this.posY, (int)this.posZ), 4.0))) {
                this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[10]) - this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[10]), (int)this.posY + this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[11]) - EntityBat.lIIIIllIIlIlIl[4], (int)this.posZ + this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[10]) - this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[10]));
            }
            final double lllllllllllllIlIIlIIlllIIllIIlII = this.spawnPosition.getX() + 0.5 - this.posX;
            final double lllllllllllllIlIIlIIlllIIllIIIll = this.spawnPosition.getY() + 0.1 - this.posY;
            final double lllllllllllllIlIIlIIlllIIllIIIlI = this.spawnPosition.getZ() + 0.5 - this.posZ;
            this.motionX += (Math.signum(lllllllllllllIlIIlIIlllIIllIIlII) * 0.5 - this.motionX) * 0.10000000149011612;
            this.motionY += (Math.signum(lllllllllllllIlIIlIIlllIIllIIIll) * 0.699999988079071 - this.motionY) * 0.10000000149011612;
            this.motionZ += (Math.signum(lllllllllllllIlIIlIIlllIIllIIIlI) * 0.5 - this.motionZ) * 0.10000000149011612;
            final float lllllllllllllIlIIlIIlllIIllIIIIl = (float)(MathHelper.func_181159_b(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
            final float lllllllllllllIlIIlIIlllIIllIIIII = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIlIIlllIIllIIIIl - this.rotationYaw);
            this.moveForward = 0.5f;
            this.rotationYaw += lllllllllllllIlIIlIIlllIIllIIIII;
            if (lIlllIllIIlIlll(this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[12])) && lIlllIllIIlIlIl(this.worldObj.getBlockState(lllllllllllllIlIIlIIlllIIllIIlIl).getBlock().isNormalCube() ? 1 : 0)) {
                this.setIsBatHanging((boolean)(EntityBat.lIIIIllIIlIlIl[0] != 0));
            }
        }
    }
    
    private static int lIlllIllIIlIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlllIllIIllIlI(final int lllllllllllllIlIIlIIllIlllllIlII) {
        return lllllllllllllIlIIlIIllIlllllIlII < 0;
    }
    
    @Override
    protected void collideWithEntity(final Entity lllllllllllllIlIIlIIlllIlIIIIIll) {
    }
    
    private static boolean lIlllIllIIllIll(final int lllllllllllllIlIIlIIlllIIIIIIlIl, final int lllllllllllllIlIIlIIlllIIIIIIlII) {
        return lllllllllllllIlIIlIIlllIIIIIIlIl >= lllllllllllllIlIIlIIlllIIIIIIlII;
    }
    
    public void setIsBatHanging(final boolean lllllllllllllIlIIlIIlllIIlllIlII) {
        final byte lllllllllllllIlIIlIIlllIIlllIllI = this.dataWatcher.getWatchableObjectByte(EntityBat.lIIIIllIIlIlIl[1]);
        if (lIlllIllIIlIlIl(lllllllllllllIlIIlIIlllIIlllIlII ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityBat.lIIIIllIIlIlIl[1], (byte)(lllllllllllllIlIIlIIlllIIlllIllI | EntityBat.lIIIIllIIlIlIl[0]));
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityBat.lIIIIllIIlIlIl[1], (byte)(lllllllllllllIlIIlIIlllIIlllIllI & EntityBat.lIIIIllIIlIlIl[5]));
        }
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityBat.lIIIIllIIlIlIl[2] != 0;
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (lIlllIllIIlIlIl(this.getIsBatHanging() ? 1 : 0) && lIlllIllIIlIlIl(this.rand.nextInt(EntityBat.lIIIIllIIlIlIl[3]))) {
            s = null;
            "".length();
            if (((0x31 ^ 0x2F ^ (0x91 ^ 0x95)) & (8 + 49 - 52 + 134 ^ 84 + 88 - 56 + 29 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            s = EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[2]];
        }
        return s;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        final BlockPos lllllllllllllIlIIlIIlllIIIllIIll = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
        if (lIlllIllIIllIll(lllllllllllllIlIIlIIlllIIIllIIll.getY(), this.worldObj.func_181545_F())) {
            return EntityBat.lIIIIllIIlIlIl[2] != 0;
        }
        final int lllllllllllllIlIIlIIlllIIIllIIlI = this.worldObj.getLightFromNeighbors(lllllllllllllIlIIlIIlllIIIllIIll);
        int lllllllllllllIlIIlIIlllIIIllIIIl = EntityBat.lIIIIllIIlIlIl[3];
        if (lIlllIllIIlIlIl(this.isDateAroundHalloween(this.worldObj.getCurrentDate()) ? 1 : 0)) {
            lllllllllllllIlIIlIIlllIIIllIIIl = EntityBat.lIIIIllIIlIlIl[10];
            "".length();
            if ((0x98 ^ 0xA6 ^ (0x75 ^ 0x4F)) < (0x13 ^ 0x3C ^ (0x4D ^ 0x66))) {
                return ((0xBF ^ 0x82 ^ (0x9 ^ 0x30)) & (99 + 41 - 98 + 87 ^ 10 + 87 + 3 + 33 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlllIllIIlIlIl(this.rand.nextBoolean() ? 1 : 0)) {
            return EntityBat.lIIIIllIIlIlIl[2] != 0;
        }
        int canSpawnHere;
        if (lIlllIllIIlllII(lllllllllllllIlIIlIIlllIIIllIIlI, this.rand.nextInt(lllllllllllllIlIIlIIlllIIIllIIIl))) {
            canSpawnHere = EntityBat.lIIIIllIIlIlIl[2];
            "".length();
            if (((0x4C ^ 0x78 ^ (0x3C ^ 0xF)) & (0xD9 ^ 0x89 ^ (0x39 ^ 0x6E) ^ -" ".length())) != 0x0) {
                return ((85 + 85 - 31 + 3 ^ 157 + 187 - 242 + 88) & (0x26 ^ 0x68 ^ (0x59 ^ 0x27) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canSpawnHere = (super.getCanSpawnHere() ? 1 : 0);
        }
        return canSpawnHere != 0;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityBat.lIIIIlIllIllll[EntityBat.lIIIIllIIlIlIl[4]];
    }
    
    private static String lIlllIlIlIIlllI(final String lllllllllllllIlIIlIIlllIIIIIllll, final String lllllllllllllIlIIlIIlllIIIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlllIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), EntityBat.lIIIIllIIlIlIl[18]), "DES");
            final Cipher lllllllllllllIlIIlIIlllIIIIlIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlllIIIIlIIll.init(EntityBat.lIIIIllIIlIlIl[4], lllllllllllllIlIIlIIlllIIIIlIlII);
            return new String(lllllllllllllIlIIlIIlllIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlllIIIIlIIlI) {
            lllllllllllllIlIIlIIlllIIIIlIIlI.printStackTrace();
            return null;
        }
    }
}
