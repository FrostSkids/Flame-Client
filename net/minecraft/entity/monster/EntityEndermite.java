// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Arrays;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.SharedMonsterAttributes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.EnumCreatureAttribute;

public class EntityEndermite extends EntityMob
{
    private /* synthetic */ boolean playerSpawned;
    private static final /* synthetic */ int[] lIIllIIIlIIIlI;
    private static final /* synthetic */ String[] lIIllIIIIlllII;
    private /* synthetic */ int lifetime;
    
    private static boolean llIlIllIIIlllII(final int lllllllllllllIIlIllIlIIlIIIIllII) {
        return lllllllllllllIIlIllIlIIlIIIIllII == 0;
    }
    
    private static void llIlIlIlllllIll() {
        (lIIllIIIIlllII = new String[EntityEndermite.lIIllIIIlIIIlI[5]])[EntityEndermite.lIIllIIIlIIIlI[0]] = llIlIlIlllllIII("KTUMfSctNhg2JiIzHTt6NzsX", "DZnST");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[2]] = llIlIlIlllllIIl("qjcSq1f1PvsjRfVI9yLDca2lKFVcedAc", "cLdpW");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[3]] = llIlIlIlllllIlI("BkinNraT1hVuB1vqdlv/CgMcKr0urTlY", "nWNLa");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[1]] = llIlIlIlllllIlI("1GYC4qd/zQMZ9D2DqDnR00+VspERYLzU", "gFBeW");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[6]] = llIlIlIlllllIIl("9AB/Js80U/b8PFSieBmsog==", "DyFDS");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[7]] = llIlIlIlllllIlI("jQleZTPuclV6mS6xdyf5zw==", "qriyM");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[8]] = llIlIlIlllllIlI("PRyTIJrzgXcx929pwqQ/uA==", "rPOzj");
        EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[4]] = llIlIlIlllllIII("IQEYDwgDPgkXGh8IHQ==", "qmyvm");
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    static {
        llIlIllIIIllIIl();
        llIlIlIlllllIll();
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (llIlIllIIIllIlI(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIlIllIlIIlIlIlIllI = EntityEndermite.lIIllIIIlIIIlI[0];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
            while (!llIlIllIIIllIll(lllllllllllllIIlIllIlIIlIlIlIllI, EntityEndermite.lIIllIIIlIIIlI[3])) {
                this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, this.posX + (this.rand.nextDouble() - 0.5) * this.width, this.posY + this.rand.nextDouble() * this.height, this.posZ + (this.rand.nextDouble() - 0.5) * this.width, (this.rand.nextDouble() - 0.5) * 2.0, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5) * 2.0, new int[EntityEndermite.lIIllIIIlIIIlI[0]]);
                ++lllllllllllllIIlIllIlIIlIlIlIllI;
            }
            "".length();
            if ((0x46 ^ 0x43) == 0x0) {
                return;
            }
        }
        else {
            if (llIlIllIIIlllII(this.isNoDespawnRequired() ? 1 : 0)) {
                this.lifetime += EntityEndermite.lIIllIIIlIIIlI[2];
            }
            if (llIlIllIIIllIll(this.lifetime, EntityEndermite.lIIllIIIlIIIlI[9])) {
                this.setDead();
            }
        }
    }
    
    public EntityEndermite(final World lllllllllllllIIlIllIlIIllIIIIIII) {
        super(lllllllllllllIIlIllIlIIllIIIIIII);
        this.lifetime = EntityEndermite.lIIllIIIlIIIlI[0];
        this.playerSpawned = (EntityEndermite.lIIllIIIlIIIlI[0] != 0);
        this.experienceValue = EntityEndermite.lIIllIIIlIIIlI[1];
        this.setSize(0.4f, 0.3f);
        this.tasks.addTask(EntityEndermite.lIIllIIIlIIIlI[2], new EntityAISwimming(this));
        this.tasks.addTask(EntityEndermite.lIIllIIIlIIIlI[3], new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0, (boolean)(EntityEndermite.lIIllIIIlIIIlI[0] != 0)));
        this.tasks.addTask(EntityEndermite.lIIllIIIlIIIlI[1], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityEndermite.lIIllIIIlIIIlI[4], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityEndermite.lIIllIIIlIIIlI[5], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityEndermite.lIIllIIIlIIIlI[2], new EntityAIHurtByTarget(this, (boolean)(EntityEndermite.lIIllIIIlIIIlI[2] != 0), new Class[EntityEndermite.lIIllIIIlIIIlI[0]]));
        this.targetTasks.addTask(EntityEndermite.lIIllIIIlIIIlI[3], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityEndermite.lIIllIIIlIIIlI[2] != 0)));
    }
    
    private static String llIlIlIlllllIlI(final String lllllllllllllIIlIllIlIIlIlIIIIlI, final String lllllllllllllIIlIllIlIIlIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIlIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlIIlIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlIIlIlIIIllI.init(EntityEndermite.lIIllIIIlIIIlI[3], lllllllllllllIIlIllIlIIlIlIIIlll);
            return new String(lllllllllllllIIlIllIlIIlIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIlIlIIIlIl) {
            lllllllllllllIIlIllIlIIlIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityEndermite.lIIllIIIlIIIlI[0] != 0;
    }
    
    private static boolean llIlIllIIIllllI(final int lllllllllllllIIlIllIlIIlIIIlIIll, final int lllllllllllllIIlIllIlIIlIIIlIIlI) {
        return lllllllllllllIIlIllIlIIlIIIlIIll < lllllllllllllIIlIllIlIIlIIIlIIlI;
    }
    
    public boolean isSpawnedByPlayer() {
        return this.playerSpawned;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (!llIlIllIIIllIlI(super.getCanSpawnHere() ? 1 : 0)) {
            return EntityEndermite.lIIllIIIlIIIlI[0] != 0;
        }
        final EntityPlayer lllllllllllllIIlIllIlIIlIlIIllll = this.worldObj.getClosestPlayerToEntity(this, 5.0);
        if (llIlIllIIIlllIl(lllllllllllllIIlIllIlIIlIlIIllll)) {
            return EntityEndermite.lIIllIIIlIIIlI[2] != 0;
        }
        return EntityEndermite.lIIllIIIlIIIlI[0] != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0);
    }
    
    @Override
    public float getEyeHeight() {
        return 0.1f;
    }
    
    @Override
    protected String getLivingSound() {
        return EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[0]];
    }
    
    public void setSpawnedByPlayer(final boolean lllllllllllllIIlIllIlIIlIlIllIlI) {
        this.playerSpawned = lllllllllllllIIlIllIlIIlIlIllIlI;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[2]];
    }
    
    private static String llIlIlIlllllIII(String lllllllllllllIIlIllIlIIlIIlIIIlI, final String lllllllllllllIIlIllIlIIlIIlIIIIl) {
        lllllllllllllIIlIllIlIIlIIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIlIIlIIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIlIllIlIIlIIlIIlII = lllllllllllllIIlIllIlIIlIIlIIIIl.toCharArray();
        int lllllllllllllIIlIllIlIIlIIlIIIll = EntityEndermite.lIIllIIIlIIIlI[0];
        final int lllllllllllllIIlIllIlIIlIIIlllIl = (Object)lllllllllllllIIlIllIlIIlIIlIIIlI.toCharArray();
        final String lllllllllllllIIlIllIlIIlIIIlllII = (String)lllllllllllllIIlIllIlIIlIIIlllIl.length;
        boolean lllllllllllllIIlIllIlIIlIIIllIll = EntityEndermite.lIIllIIIlIIIlI[0] != 0;
        while (llIlIllIIIllllI(lllllllllllllIIlIllIlIIlIIIllIll ? 1 : 0, (int)lllllllllllllIIlIllIlIIlIIIlllII)) {
            final char lllllllllllllIIlIllIlIIlIIlIlIII = lllllllllllllIIlIllIlIIlIIIlllIl[lllllllllllllIIlIllIlIIlIIIllIll];
            lllllllllllllIIlIllIlIIlIIlIIlIl.append((char)(lllllllllllllIIlIllIlIIlIIlIlIII ^ lllllllllllllIIlIllIlIIlIIlIIlII[lllllllllllllIIlIllIlIIlIIlIIIll % lllllllllllllIIlIllIlIIlIIlIIlII.length]));
            "".length();
            ++lllllllllllllIIlIllIlIIlIIlIIIll;
            ++lllllllllllllIIlIllIlIIlIIIllIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIlIIlIIlIIlIl);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIllIlIIlIllIlllI) {
        super.readEntityFromNBT(lllllllllllllIIlIllIlIIlIllIlllI);
        this.lifetime = lllllllllllllIIlIllIlIIlIllIlllI.getInteger(EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[6]]);
        this.playerSpawned = lllllllllllllIIlIllIlIIlIllIlllI.getBoolean(EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[7]]);
    }
    
    @Override
    public void onUpdate() {
        this.renderYawOffset = this.rotationYaw;
        super.onUpdate();
    }
    
    private static void llIlIllIIIllIIl() {
        (lIIllIIIlIIIlI = new int[10])[0] = ((0xC5 ^ 0xA6) & ~(0xE8 ^ 0x8B) & ~((0xC9 ^ 0x90) & ~(0x7B ^ 0x22)) & ~((0x3E ^ 0x7B) & ~(0x3C ^ 0x79)));
        EntityEndermite.lIIllIIIlIIIlI[1] = "   ".length();
        EntityEndermite.lIIllIIIlIIIlI[2] = " ".length();
        EntityEndermite.lIIllIIIlIIIlI[3] = "  ".length();
        EntityEndermite.lIIllIIIlIIIlI[4] = (0x63 ^ 0x64);
        EntityEndermite.lIIllIIIlIIIlI[5] = (0x94 ^ 0x9C);
        EntityEndermite.lIIllIIIlIIIlI[6] = (0x4D ^ 0x49);
        EntityEndermite.lIIllIIIlIIIlI[7] = (20 + 50 - 20 + 77 ^ (0x27 ^ 0x5D));
        EntityEndermite.lIIllIIIlIIIlI[8] = (0x12 ^ 0x14);
        EntityEndermite.lIIllIIIlIIIlI[9] = (0xFFFFAB7C & 0x5DE3);
    }
    
    @Override
    protected boolean isValidLightLevel() {
        return EntityEndermite.lIIllIIIlIIIlI[2] != 0;
    }
    
    private static boolean llIlIllIIIllIll(final int lllllllllllllIIlIllIlIIlIIIlIlll, final int lllllllllllllIIlIllIlIIlIIIlIllI) {
        return lllllllllllllIIlIllIlIIlIIIlIlll >= lllllllllllllIIlIllIlIIlIIIlIllI;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIllIlIIlIllIlIII) {
        super.writeEntityToNBT(lllllllllllllIIlIllIlIIlIllIlIII);
        lllllllllllllIIlIllIlIIlIllIlIII.setInteger(EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[8]], this.lifetime);
        lllllllllllllIIlIllIlIIlIllIlIII.setBoolean(EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[4]], this.playerSpawned);
    }
    
    private static boolean llIlIllIIIlllIl(final Object lllllllllllllIIlIllIlIIlIIIlIIII) {
        return lllllllllllllIIlIllIlIIlIIIlIIII == null;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[3]];
    }
    
    @Override
    protected void playStepSound(final BlockPos lllllllllllllIIlIllIlIIlIlllIlIl, final Block lllllllllllllIIlIllIlIIlIlllIlII) {
        this.playSound(EntityEndermite.lIIllIIIIlllII[EntityEndermite.lIIllIIIlIIIlI[1]], 0.15f, 1.0f);
    }
    
    @Override
    protected Item getDropItem() {
        return null;
    }
    
    private static String llIlIlIlllllIIl(final String lllllllllllllIIlIllIlIIlIIllIlIl, final String lllllllllllllIIlIllIlIIlIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIlIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), EntityEndermite.lIIllIIIlIIIlI[5]), "DES");
            final Cipher lllllllllllllIIlIllIlIIlIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIIlIIlllIIl.init(EntityEndermite.lIIllIIIlIIIlI[3], lllllllllllllIIlIllIlIIlIIlllIlI);
            return new String(lllllllllllllIIlIllIlIIlIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIlIIlllIII) {
            lllllllllllllIIlIllIlIIlIIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIIIllIlI(final int lllllllllllllIIlIllIlIIlIIIIlllI) {
        return lllllllllllllIIlIllIlIIlIIIIlllI != 0;
    }
}
