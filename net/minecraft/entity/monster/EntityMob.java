// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.world.EnumDifficulty;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityCreature;

public abstract class EntityMob extends EntityCreature implements IMob
{
    private static final /* synthetic */ String[] llIIIlllIIIIlI;
    private static final /* synthetic */ int[] llIIIlllIIlIII;
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        "".length();
    }
    
    public EntityMob(final World llllllllllllIlllIlIIIlIIllIlIIII) {
        super(llllllllllllIlllIlIIIlIIllIlIIII);
        this.experienceValue = EntityMob.llIIIlllIIlIII[0];
    }
    
    private static boolean lIIIlIlIllIIIIII(final int llllllllllllIlllIlIIIlIIIlIllIlI) {
        return llllllllllllIlllIlIIIlIIIlIllIlI == 0;
    }
    
    protected boolean isValidLightLevel() {
        final BlockPos llllllllllllIlllIlIIIlIIlIIlIlIl = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
        if (lIIIlIlIllIIIlII(this.worldObj.getLightFor(EnumSkyBlock.SKY, llllllllllllIlllIlIIIlIIlIIlIlIl), this.rand.nextInt(EntityMob.llIIIlllIIlIII[6]))) {
            return EntityMob.llIIIlllIIlIII[2] != 0;
        }
        int llllllllllllIlllIlIIIlIIlIIlIlII = this.worldObj.getLightFromNeighbors(llllllllllllIlllIlIIIlIIlIIlIlIl);
        if (lIIIlIlIllIIIIlI(this.worldObj.isThundering() ? 1 : 0)) {
            final int llllllllllllIlllIlIIIlIIlIIlIIll = this.worldObj.getSkylightSubtracted();
            this.worldObj.setSkylightSubtracted(EntityMob.llIIIlllIIlIII[7]);
            llllllllllllIlllIlIIIlIIlIIlIlII = this.worldObj.getLightFromNeighbors(llllllllllllIlllIlIIIlIIlIIlIlIl);
            this.worldObj.setSkylightSubtracted(llllllllllllIlllIlIIIlIIlIIlIIll);
        }
        if (lIIIlIlIllIIIlIl(llllllllllllIlllIlIIIlIIlIIlIlII, this.rand.nextInt(EntityMob.llIIIlllIIlIII[8]))) {
            return EntityMob.llIIIlllIIlIII[3] != 0;
        }
        return EntityMob.llIIIlllIIlIII[2] != 0;
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity llllllllllllIlllIlIIIlIIlIlIIlIl) {
        float llllllllllllIlllIlIIIlIIlIlIlIlI = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        int llllllllllllIlllIlIIIlIIlIlIlIIl = EntityMob.llIIIlllIIlIII[2];
        if (lIIIlIlIllIIIIlI((llllllllllllIlllIlIIIlIIlIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
            llllllllllllIlllIlIIIlIIlIlIlIlI += EnchantmentHelper.func_152377_a(this.getHeldItem(), ((EntityLivingBase)llllllllllllIlllIlIIIlIIlIlIIlIl).getCreatureAttribute());
            llllllllllllIlllIlIIIlIIlIlIlIIl += EnchantmentHelper.getKnockbackModifier(this);
        }
        final boolean llllllllllllIlllIlIIIlIIlIlIlIII = llllllllllllIlllIlIIIlIIlIlIIlIl.attackEntityFrom(DamageSource.causeMobDamage(this), llllllllllllIlllIlIIIlIIlIlIlIlI);
        if (lIIIlIlIllIIIIlI(llllllllllllIlllIlIIIlIIlIlIlIII ? 1 : 0)) {
            if (lIIIlIlIlIllllll(llllllllllllIlllIlIIIlIIlIlIlIIl)) {
                llllllllllllIlllIlIIIlIIlIlIIlIl.addVelocity(-MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f) * llllllllllllIlllIlIIIlIIlIlIlIIl * 0.5f, 0.1, MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f) * llllllllllllIlllIlIIIlIIlIlIlIIl * 0.5f);
                this.motionX *= 0.6;
                this.motionZ *= 0.6;
            }
            final int llllllllllllIlllIlIIIlIIlIlIIlll = EnchantmentHelper.getFireAspectModifier(this);
            if (lIIIlIlIlIllllll(llllllllllllIlllIlIIIlIIlIlIIlll)) {
                llllllllllllIlllIlIIIlIIlIlIIlIl.setFire(llllllllllllIlllIlIIIlIIlIlIIlll * EntityMob.llIIIlllIIlIII[5]);
            }
            this.applyEnchantments(this, llllllllllllIlllIlIIIlIIlIlIIlIl);
        }
        return llllllllllllIlllIlIIIlIIlIlIlIII;
    }
    
    @Override
    protected String getFallSoundString(final int llllllllllllIlllIlIIIlIIlIllIIll) {
        String s;
        if (lIIIlIlIllIIIlII(llllllllllllIlllIlIIIlIIlIllIIll, EntityMob.llIIIlllIIlIII[5])) {
            s = EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[5]];
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        else {
            s = EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[0]];
        }
        return s;
    }
    
    @Override
    protected boolean canDropLoot() {
        return EntityMob.llIIIlllIIlIII[3] != 0;
    }
    
    private static boolean lIIIlIlIlIllllll(final int llllllllllllIlllIlIIIlIIIlIllIII) {
        return llllllllllllIlllIlIIIlIIIlIllIII > 0;
    }
    
    private static boolean lIIIlIlIllIIIlIl(final int llllllllllllIlllIlIIIlIIIllIlIll, final int llllllllllllIlllIlIIIlIIIllIlIlI) {
        return llllllllllllIlllIlIIIlIIIllIlIll <= llllllllllllIlllIlIIIlIIIllIlIlI;
    }
    
    private static void lIIIlIlIlIlllIIl() {
        (llIIIlllIIIIlI = new String[EntityMob.llIIIlllIIlIII[9]])[EntityMob.llIIIlllIIlIII[2]] = lIIIlIlIlIllIIlI("z8J4qsqRiKYyCzwEUQ+bBkWaglq7mYAz", "mtddh");
        EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[3]] = lIIIlIlIlIllIIlI("Z5CUx4KFk06otsYRegIrUZuf1ztLshrftnxm4qbmDc8=", "vpsWe");
        EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[1]] = lIIIlIlIlIllIIlI("+FV8GrEY/UKTPQ4X2IhgrqeCHYOXccJ9", "jMgcH");
        EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[4]] = lIIIlIlIlIllIIlI("S5cUmjHGkZI5IzTZxnpGj4EGm10Cu6Fq", "ggOBf");
        EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[5]] = lIIIlIlIlIllIIlI("TG986LWc5BJBTOPs2Xy1gz2veWxmrF88LDCw5k7LXK8=", "wrqQg");
        EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[0]] = lIIIlIlIlIlllIII("E6pMzuXxQkQK3V/GlL3XohE43yx8DgyGrFlA3vV8HLw=", "dbOAa");
    }
    
    private static String lIIIlIlIlIllIIlI(final String llllllllllllIlllIlIIIlIIIlllIIll, final String llllllllllllIlllIlIIIlIIIlllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIlIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIlIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), EntityMob.llIIIlllIIlIII[8]), "DES");
            final Cipher llllllllllllIlllIlIIIlIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIIIlIIIlllIlIl.init(EntityMob.llIIIlllIIlIII[1], llllllllllllIlllIlIIIlIIIlllIllI);
            return new String(llllllllllllIlllIlIIIlIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIlIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIlIIIlllIlII) {
            llllllllllllIlllIlIIIlIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected String getDeathSound() {
        return EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[4]];
    }
    
    private static boolean lIIIlIlIllIIIIlI(final int llllllllllllIlllIlIIIlIIIlIlllII) {
        return llllllllllllIlllIlIIIlIIIlIlllII != 0;
    }
    
    @Override
    public float getBlockPathWeight(final BlockPos llllllllllllIlllIlIIIlIIlIIllIll) {
        return 0.5f - this.worldObj.getLightBrightness(llllllllllllIlllIlIIIlIIlIIllIll);
    }
    
    @Override
    protected String getSwimSound() {
        return EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[2]];
    }
    
    private static boolean lIIIlIlIllIIIIll(final Object llllllllllllIlllIlIIIlIIIllIIIll, final Object llllllllllllIlllIlIIIlIIIllIIIlI) {
        return llllllllllllIlllIlIIIlIIIllIIIll != llllllllllllIlllIlIIIlIIIllIIIlI;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[1]];
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (lIIIlIlIllIIIIll(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL) && lIIIlIlIllIIIIlI(this.isValidLightLevel() ? 1 : 0) && lIIIlIlIllIIIIlI(super.getCanSpawnHere() ? 1 : 0)) {
            return EntityMob.llIIIlllIIlIII[3] != 0;
        }
        return EntityMob.llIIIlllIIlIII[2] != 0;
    }
    
    static {
        lIIIlIlIlIllllIl();
        lIIIlIlIlIlllIIl();
    }
    
    private static boolean lIIIlIlIllIIIIIl(final Object llllllllllllIlllIlIIIlIIIlIlllll, final Object llllllllllllIlllIlIIIlIIIlIllllI) {
        return llllllllllllIlllIlIIIlIIIlIlllll == llllllllllllIlllIlIIIlIIIlIllllI;
    }
    
    private static String lIIIlIlIlIlllIII(final String llllllllllllIlllIlIIIlIIlIIIIIII, final String llllllllllllIlllIlIIIlIIIlllllll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIlIIlIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIlIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIIlIIlIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIIlIIlIIIIIlI.init(EntityMob.llIIIlllIIlIII[1], llllllllllllIlllIlIIIlIIlIIIIIll);
            return new String(llllllllllllIlllIlIIIlIIlIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIlIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIlIIlIIIIIIl) {
            llllllllllllIlllIlIIIlIIlIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static int lIIIlIlIlIlllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIIlIlIlIllllIl() {
        (llIIIlllIIlIII = new int[10])[0] = (0xB1 ^ 0x8E ^ (0x5D ^ 0x67));
        EntityMob.llIIIlllIIlIII[1] = "  ".length();
        EntityMob.llIIIlllIIlIII[2] = ((0x8A ^ 0xAF) & ~(0x94 ^ 0xB1));
        EntityMob.llIIIlllIIlIII[3] = " ".length();
        EntityMob.llIIIlllIIlIII[4] = "   ".length();
        EntityMob.llIIIlllIIlIII[5] = (0x4E ^ 0x4A);
        EntityMob.llIIIlllIIlIII[6] = (0x72 ^ 0x3C ^ (0x39 ^ 0x57));
        EntityMob.llIIIlllIIlIII[7] = (0x3E ^ 0x34);
        EntityMob.llIIIlllIIlIII[8] = (61 + 141 - 159 + 111 ^ 106 + 141 - 231 + 130);
        EntityMob.llIIIlllIIlIII[9] = (0xAE ^ 0xA8);
    }
    
    private static boolean lIIIlIlIllIIIlII(final int llllllllllllIlllIlIIIlIIIllIIlll, final int llllllllllllIlllIlIIIlIIIllIIllI) {
        return llllllllllllIlllIlIIIlIIIllIIlll > llllllllllllIlllIlIIIlIIIllIIllI;
    }
    
    @Override
    protected String getSplashSound() {
        return EntityMob.llIIIlllIIIIlI[EntityMob.llIIIlllIIlIII[3]];
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllIlIIIlIIlIlllIll, final float llllllllllllIlllIlIIIlIIlIlllIlI) {
        if (lIIIlIlIllIIIIlI(this.isEntityInvulnerable(llllllllllllIlllIlIIIlIIlIlllIll) ? 1 : 0)) {
            return EntityMob.llIIIlllIIlIII[2] != 0;
        }
        if (lIIIlIlIllIIIIlI(super.attackEntityFrom(llllllllllllIlllIlIIIlIIlIlllIll, llllllllllllIlllIlIIIlIIlIlllIlI) ? 1 : 0)) {
            final Entity llllllllllllIlllIlIIIlIIlIllllIl = llllllllllllIlllIlIIIlIIlIlllIll.getEntity();
            int n;
            if (lIIIlIlIllIIIIll(this.riddenByEntity, llllllllllllIlllIlIIIlIIlIllllIl) && lIIIlIlIllIIIIll(this.ridingEntity, llllllllllllIlllIlIIIlIIlIllllIl)) {
                n = EntityMob.llIIIlllIIlIII[3];
                "".length();
                if (" ".length() < 0) {
                    return ((0x3A ^ 0x64) & ~(0x68 ^ 0x36)) != 0x0;
                }
            }
            else {
                n = EntityMob.llIIIlllIIlIII[3];
            }
            return n != 0;
        }
        return EntityMob.llIIIlllIIlIII[2] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIIlIlIllIIIIII(this.worldObj.isRemote ? 1 : 0) && lIIIlIlIllIIIIIl(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            this.setDead();
        }
    }
    
    @Override
    public void onLivingUpdate() {
        this.updateArmSwingProgress();
        final float llllllllllllIlllIlIIIlIIllIIllII = this.getBrightness(1.0f);
        if (lIIIlIlIlIllllll(lIIIlIlIlIlllllI(llllllllllllIlllIlIIIlIIllIIllII, 0.5f))) {
            this.entityAge += EntityMob.llIIIlllIIlIII[1];
        }
        super.onLivingUpdate();
    }
}
