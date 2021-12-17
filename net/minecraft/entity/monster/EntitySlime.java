// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.ai.EntityMoveHelper;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearest;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.entity.Entity;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldType;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;

public class EntitySlime extends EntityLiving implements IMob
{
    private /* synthetic */ boolean wasOnGround;
    private static final /* synthetic */ String[] lIIlIllllllIlI;
    public /* synthetic */ float prevSquishFactor;
    private static final /* synthetic */ int[] lIIlIlllllllIl;
    public /* synthetic */ float squishAmount;
    public /* synthetic */ float squishFactor;
    
    private static boolean llIlIlIIlllIIII(final int lllllllllllllIIlIllllIllllllllII, final int lllllllllllllIIlIllllIlllllllIll) {
        return lllllllllllllIIlIllllIllllllllII > lllllllllllllIIlIllllIlllllllIll;
    }
    
    protected int getJumpDelay() {
        return this.rand.nextInt(EntitySlime.lIIlIlllllllIl[9]) + EntitySlime.lIIlIlllllllIl[10];
    }
    
    private static boolean llIlIlIIlllIIlI(final Object lllllllllllllIIlIllllIllllllIlII, final Object lllllllllllllIIlIllllIllllllIIll) {
        return lllllllllllllIIlIllllIllllllIlII == lllllllllllllIIlIllllIllllllIIll;
    }
    
    private static boolean llIlIlIIlllllIl(final int lllllllllllllIIlIllllIlllllIIllI, final int lllllllllllllIIlIllllIlllllIIlIl) {
        return lllllllllllllIIlIllllIlllllIIllI != lllllllllllllIIlIllllIlllllIIlIl;
    }
    
    @Override
    protected String getDeathSound() {
        final StringBuilder sb = new StringBuilder(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[13]]);
        String str;
        if (llIlIlIIlllIIII(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[0])) {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[14]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[15]];
        }
        return String.valueOf(sb.append(str));
    }
    
    private static int llIlIlIIllllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean getCanSpawnHere() {
        final BlockPos lllllllllllllIIlIlllllIIIllIlIII = new BlockPos(MathHelper.floor_double(this.posX), EntitySlime.lIIlIlllllllIl[5], MathHelper.floor_double(this.posZ));
        final Chunk lllllllllllllIIlIlllllIIIllIIlll = this.worldObj.getChunkFromBlockCoords(lllllllllllllIIlIlllllIIIllIlIII);
        if (llIlIlIIlllIIlI(this.worldObj.getWorldInfo().getTerrainType(), WorldType.FLAT) && llIlIlIIlllllIl(this.rand.nextInt(EntitySlime.lIIlIlllllllIl[6]), EntitySlime.lIIlIlllllllIl[0])) {
            return EntitySlime.lIIlIlllllllIl[5] != 0;
        }
        if (llIlIlIIllllllI(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            final BiomeGenBase lllllllllllllIIlIlllllIIIllIIllI = this.worldObj.getBiomeGenForCoords(lllllllllllllIIlIlllllIIIllIlIII);
            if (llIlIlIIlllIIlI(lllllllllllllIIlIlllllIIIllIIllI, BiomeGenBase.swampland) && llIlIlIIlllIIll(llIlIlIIllllIlI(this.posY, 50.0)) && llIlIlIIllIllll(llIlIlIIllllIll(this.posY, 70.0)) && llIlIlIIllIllll(llIlIlIIlllllII(this.rand.nextFloat(), 0.5f)) && llIlIlIIllIllll(llIlIlIIlllllII(this.rand.nextFloat(), this.worldObj.getCurrentMoonPhaseFactor())) && llIlIlIIlllllll(this.worldObj.getLightFromNeighbors(new BlockPos(this)), this.rand.nextInt(EntitySlime.lIIlIlllllllIl[8]))) {
                return super.getCanSpawnHere();
            }
            if (llIlIlIIlllIIIl(this.rand.nextInt(EntitySlime.lIIlIlllllllIl[10])) && llIlIlIIlllIIIl(lllllllllllllIIlIlllllIIIllIIlll.getRandomWithSeed(987234911L).nextInt(EntitySlime.lIIlIlllllllIl[10])) && llIlIlIIllIllll(llIlIlIIllllIll(this.posY, 40.0))) {
                return super.getCanSpawnHere();
            }
        }
        return EntitySlime.lIIlIlllllllIl[5] != 0;
    }
    
    @Override
    public void onUpdate() {
        if (llIlIlIIlllIIIl(this.worldObj.isRemote ? 1 : 0) && llIlIlIIlllIIlI(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL) && llIlIlIIlllIIll(this.getSlimeSize())) {
            this.isDead = (EntitySlime.lIIlIlllllllIl[0] != 0);
        }
        this.squishFactor += (this.squishAmount - this.squishFactor) * 0.5f;
        this.prevSquishFactor = this.squishFactor;
        super.onUpdate();
        if (llIlIlIIlllIlII(this.onGround ? 1 : 0) && llIlIlIIlllIIIl(this.wasOnGround ? 1 : 0)) {
            final int lllllllllllllIIlIlllllIIllIllIll = this.getSlimeSize();
            int lllllllllllllIIlIlllllIIllIllIlI = EntitySlime.lIIlIlllllllIl[5];
            "".length();
            if ((0x79 ^ 0x1B ^ (0x3E ^ 0x58)) != (0x18 ^ 0x57 ^ (0x37 ^ 0x7C))) {
                return;
            }
            while (!llIlIlIIlllIlIl(lllllllllllllIIlIlllllIIllIllIlI, lllllllllllllIIlIlllllIIllIllIll * EntitySlime.lIIlIlllllllIl[8])) {
                final float lllllllllllllIIlIlllllIIllIllIIl = this.rand.nextFloat() * 3.1415927f * 2.0f;
                final float lllllllllllllIIlIlllllIIllIllIII = this.rand.nextFloat() * 0.5f + 0.5f;
                final float lllllllllllllIIlIlllllIIllIlIlll = MathHelper.sin(lllllllllllllIIlIlllllIIllIllIIl) * lllllllllllllIIlIlllllIIllIllIll * 0.5f * lllllllllllllIIlIlllllIIllIllIII;
                final float lllllllllllllIIlIlllllIIllIlIllI = MathHelper.cos(lllllllllllllIIlIlllllIIllIllIIl) * lllllllllllllIIlIlllllIIllIllIll * 0.5f * lllllllllllllIIlIlllllIIllIllIII;
                final World lllllllllllllIIlIlllllIIllIlIlIl = this.worldObj;
                final EnumParticleTypes lllllllllllllIIlIlllllIIllIlIlII = this.getParticleType();
                final double lllllllllllllIIlIlllllIIllIlIIll = this.posX + lllllllllllllIIlIlllllIIllIlIlll;
                final double lllllllllllllIIlIlllllIIllIlIIlI = this.posZ + lllllllllllllIIlIlllllIIllIlIllI;
                lllllllllllllIIlIlllllIIllIlIlIl.spawnParticle(lllllllllllllIIlIlllllIIllIlIlII, lllllllllllllIIlIlllllIIllIlIIll, this.getEntityBoundingBox().minY, lllllllllllllIIlIlllllIIllIlIIlI, 0.0, 0.0, 0.0, new int[EntitySlime.lIIlIlllllllIl[5]]);
                ++lllllllllllllIIlIlllllIIllIllIlI;
            }
            if (llIlIlIIlllIlII(this.makesSoundOnLand() ? 1 : 0)) {
                this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.squishAmount = -0.5f;
            "".length();
            if (-" ".length() == "   ".length()) {
                return;
            }
        }
        else if (llIlIlIIlllIIIl(this.onGround ? 1 : 0) && llIlIlIIlllIlII(this.wasOnGround ? 1 : 0)) {
            this.squishAmount = 1.0f;
        }
        this.wasOnGround = this.onGround;
        this.alterSquishAmount();
    }
    
    protected int getAttackStrength() {
        return this.getSlimeSize();
    }
    
    public EntitySlime(final World lllllllllllllIIlIlllllIlIIIIlIIl) {
        super(lllllllllllllIIlIlllllIlIIIIlIIl);
        this.moveHelper = new SlimeMoveHelper(this);
        this.tasks.addTask(EntitySlime.lIIlIlllllllIl[0], new AISlimeFloat(this));
        this.tasks.addTask(EntitySlime.lIIlIlllllllIl[1], new AISlimeAttack(this));
        this.tasks.addTask(EntitySlime.lIIlIlllllllIl[2], new AISlimeFaceRandom(this));
        this.tasks.addTask(EntitySlime.lIIlIlllllllIl[3], new AISlimeHop(this));
        this.targetTasks.addTask(EntitySlime.lIIlIlllllllIl[0], new EntityAIFindEntityNearestPlayer(this));
        this.targetTasks.addTask(EntitySlime.lIIlIlllllllIl[2], new EntityAIFindEntityNearest(this, EntityIronGolem.class));
    }
    
    @Override
    protected void jump() {
        this.motionY = 0.41999998688697815;
        this.isAirBorne = (EntitySlime.lIIlIlllllllIl[0] != 0);
    }
    
    private static void llIlIlIIllIlllI() {
        (lIIlIlllllllIl = new int[17])[0] = " ".length();
        EntitySlime.lIIlIlllllllIl[1] = "  ".length();
        EntitySlime.lIIlIlllllllIl[2] = "   ".length();
        EntitySlime.lIIlIlllllllIl[3] = (0x76 ^ 0x73);
        EntitySlime.lIIlIlllllllIl[4] = (0x19 ^ 0x2 ^ (0x43 ^ 0x48));
        EntitySlime.lIIlIlllllllIl[5] = ((0x87 ^ 0xB3 ^ (0x37 ^ 0x1F)) & (206 + 166 - 357 + 205 ^ 127 + 108 - 178 + 135 ^ -" ".length()));
        EntitySlime.lIIlIlllllllIl[6] = (0x34 ^ 0x30);
        EntitySlime.lIIlIlllllllIl[7] = (0x2F ^ 0x29);
        EntitySlime.lIIlIlllllllIl[8] = (0x14 ^ 0x30 ^ (0x1 ^ 0x2D));
        EntitySlime.lIIlIlllllllIl[9] = (0xEC ^ 0x8B ^ (0x58 ^ 0x2B));
        EntitySlime.lIIlIlllllllIl[10] = (24 + 87 - 82 + 126 ^ 104 + 44 - 13 + 10);
        EntitySlime.lIIlIlllllllIl[11] = (0xA0 ^ 0x9C ^ (0x37 ^ 0xC));
        EntitySlime.lIIlIlllllllIl[12] = (0x6D ^ 0x64);
        EntitySlime.lIIlIlllllllIl[13] = (0x8E ^ 0x85);
        EntitySlime.lIIlIlllllllIl[14] = (0x14 ^ 0x36 ^ (0x0 ^ 0x2E));
        EntitySlime.lIIlIlllllllIl[15] = (0xCF ^ 0xAC ^ (0x14 ^ 0x7A));
        EntitySlime.lIIlIlllllllIl[16] = (0x25 ^ 0x2B);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntitySlime.lIIlIlllllllIl[4], (byte)EntitySlime.lIIlIlllllllIl[0]);
    }
    
    private static int llIlIlIlIIIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String llIlIlIIlIlllIl(String lllllllllllllIIlIlllllIIIIIlllII, final String lllllllllllllIIlIlllllIIIIlIIIII) {
        lllllllllllllIIlIlllllIIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlllllIIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlllllIIIIIlllll = new StringBuilder();
        final char[] lllllllllllllIIlIlllllIIIIIllllI = lllllllllllllIIlIlllllIIIIlIIIII.toCharArray();
        int lllllllllllllIIlIlllllIIIIIlllIl = EntitySlime.lIIlIlllllllIl[5];
        final double lllllllllllllIIlIlllllIIIIIlIllI = (Object)lllllllllllllIIlIlllllIIIIIlllII.toCharArray();
        final byte lllllllllllllIIlIlllllIIIIIlIlII = (byte)lllllllllllllIIlIlllllIIIIIlIllI.length;
        String lllllllllllllIIlIlllllIIIIIlIIll = (String)EntitySlime.lIIlIlllllllIl[5];
        while (llIlIlIlIIIIIIl((int)lllllllllllllIIlIlllllIIIIIlIIll, lllllllllllllIIlIlllllIIIIIlIlII)) {
            final char lllllllllllllIIlIlllllIIIIlIIIlI = lllllllllllllIIlIlllllIIIIIlIllI[lllllllllllllIIlIlllllIIIIIlIIll];
            lllllllllllllIIlIlllllIIIIIlllll.append((char)(lllllllllllllIIlIlllllIIIIlIIIlI ^ lllllllllllllIIlIlllllIIIIIllllI[lllllllllllllIIlIlllllIIIIIlllIl % lllllllllllllIIlIlllllIIIIIllllI.length]));
            "".length();
            ++lllllllllllllIIlIlllllIIIIIlllIl;
            ++lllllllllllllIIlIlllllIIIIIlIIll;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlllllIIIIIlllll);
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.4f * this.getSlimeSize();
    }
    
    private static int llIlIlIIllllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIlIIlllIlIl(final int lllllllllllllIIlIlllllIIIIIIlIII, final int lllllllllllllIIlIlllllIIIIIIIlll) {
        return lllllllllllllIIlIlllllIIIIIIlIII >= lllllllllllllIIlIlllllIIIIIIIlll;
    }
    
    protected boolean canDamagePlayer() {
        if (llIlIlIIlllIIII(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[0])) {
            return EntitySlime.lIIlIlllllllIl[0] != 0;
        }
        return EntitySlime.lIIlIlllllllIl[5] != 0;
    }
    
    private static boolean llIlIlIIlllIlII(final int lllllllllllllIIlIllllIllllllIIIl) {
        return lllllllllllllIIlIllllIllllllIIIl != 0;
    }
    
    @Override
    protected Item getDropItem() {
        Item slime_ball;
        if (llIlIlIIlllIllI(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[0])) {
            slime_ball = Items.slime_ball;
            "".length();
            if (-(128 + 160 - 286 + 173 ^ 10 + 161 - 122 + 121) >= 0) {
                return null;
            }
        }
        else {
            slime_ball = null;
        }
        return slime_ball;
    }
    
    protected boolean makesSoundOnLand() {
        if (llIlIlIIlllIIII(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[1])) {
            return EntitySlime.lIIlIlllllllIl[0] != 0;
        }
        return EntitySlime.lIIlIlllllllIl[5] != 0;
    }
    
    @Override
    public void setDead() {
        final int lllllllllllllIIlIlllllIIlIlIllII = this.getSlimeSize();
        if (llIlIlIIlllIIIl(this.worldObj.isRemote ? 1 : 0) && llIlIlIIlllIIII(lllllllllllllIIlIlllllIIlIlIllII, EntitySlime.lIIlIlllllllIl[0]) && llIlIlIIllllIII(llIlIlIIlllIlll(this.getHealth(), 0.0f))) {
            final int lllllllllllllIIlIlllllIIlIlIlIll = EntitySlime.lIIlIlllllllIl[1] + this.rand.nextInt(EntitySlime.lIIlIlllllllIl[2]);
            int lllllllllllllIIlIlllllIIlIlIlIlI = EntitySlime.lIIlIlllllllIl[5];
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
            while (!llIlIlIIlllIlIl(lllllllllllllIIlIlllllIIlIlIlIlI, lllllllllllllIIlIlllllIIlIlIlIll)) {
                final float lllllllllllllIIlIlllllIIlIlIlIIl = (lllllllllllllIIlIlllllIIlIlIlIlI % EntitySlime.lIIlIlllllllIl[1] - 0.5f) * lllllllllllllIIlIlllllIIlIlIllII / 4.0f;
                final float lllllllllllllIIlIlllllIIlIlIlIII = (lllllllllllllIIlIlllllIIlIlIlIlI / EntitySlime.lIIlIlllllllIl[1] - 0.5f) * lllllllllllllIIlIlllllIIlIlIllII / 4.0f;
                final EntitySlime lllllllllllllIIlIlllllIIlIlIIlll = this.createInstance();
                if (llIlIlIIlllIlII(this.hasCustomName() ? 1 : 0)) {
                    lllllllllllllIIlIlllllIIlIlIIlll.setCustomNameTag(this.getCustomNameTag());
                }
                if (llIlIlIIlllIlII(this.isNoDespawnRequired() ? 1 : 0)) {
                    lllllllllllllIIlIlllllIIlIlIIlll.enablePersistence();
                }
                lllllllllllllIIlIlllllIIlIlIIlll.setSlimeSize(lllllllllllllIIlIlllllIIlIlIllII / EntitySlime.lIIlIlllllllIl[1]);
                lllllllllllllIIlIlllllIIlIlIIlll.setLocationAndAngles(this.posX + lllllllllllllIIlIlllllIIlIlIlIIl, this.posY + 0.5, this.posZ + lllllllllllllIIlIlllllIIlIlIlIII, this.rand.nextFloat() * 360.0f, 0.0f);
                this.worldObj.spawnEntityInWorld(lllllllllllllIIlIlllllIIlIlIIlll);
                "".length();
                ++lllllllllllllIIlIlllllIIlIlIlIlI;
            }
        }
        super.setDead();
    }
    
    private static int llIlIlIIlllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected boolean makesSoundOnJump() {
        if (llIlIlIIlllIIll(this.getSlimeSize())) {
            return EntitySlime.lIIlIlllllllIl[0] != 0;
        }
        return EntitySlime.lIIlIlllllllIl[5] != 0;
    }
    
    private static int llIlIlIIllllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected EnumParticleTypes getParticleType() {
        return EnumParticleTypes.SLIME;
    }
    
    private static boolean llIlIlIIlllIIll(final int lllllllllllllIIlIllllIlllllIlIIl) {
        return lllllllllllllIIlIllllIlllllIlIIl > 0;
    }
    
    private static boolean llIlIlIIllllIII(final int lllllllllllllIIlIllllIlllllIlIll) {
        return lllllllllllllIIlIllllIlllllIlIll <= 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIlllllIIllllIlll) {
        super.writeEntityToNBT(lllllllllllllIIlIlllllIIllllIlll);
        lllllllllllllIIlIlllllIIllllIlll.setInteger(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[5]], this.getSlimeSize() - EntitySlime.lIIlIlllllllIl[0]);
        lllllllllllllIIlIlllllIIllllIlll.setBoolean(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[0]], this.wasOnGround);
    }
    
    @Override
    public float getEyeHeight() {
        return 0.625f * this.height;
    }
    
    private static boolean llIlIlIIllllllI(final Object lllllllllllllIIlIllllIlllllllIII, final Object lllllllllllllIIlIllllIllllllIlll) {
        return lllllllllllllIIlIllllIlllllllIII != lllllllllllllIIlIllllIllllllIlll;
    }
    
    @Override
    public void onDataWatcherUpdate(final int lllllllllllllIIlIlllllIIlIlllIIl) {
        if (llIlIlIIlllIllI(lllllllllllllIIlIlllllIIlIlllIIl, EntitySlime.lIIlIlllllllIl[4])) {
            final int lllllllllllllIIlIlllllIIlIlllIII = this.getSlimeSize();
            this.setSize(0.51000005f * lllllllllllllIIlIlllllIIlIlllIII, 0.51000005f * lllllllllllllIIlIlllllIIlIlllIII);
            this.rotationYaw = this.rotationYawHead;
            this.renderYawOffset = this.rotationYawHead;
            if (llIlIlIIlllIlII(this.isInWater() ? 1 : 0) && llIlIlIIlllIIIl(this.rand.nextInt(EntitySlime.lIIlIlllllllIl[9]))) {
                this.resetHeight();
            }
        }
        super.onDataWatcherUpdate(lllllllllllllIIlIlllllIIlIlllIIl);
    }
    
    private static void llIlIlIIllIlIIl() {
        (lIIlIllllllIlI = new String[EntitySlime.lIIlIlllllllIl[16]])[EntitySlime.lIIlIlllllllIl[5]] = llIlIlIIlIlllIl("JCw8KQ==", "wEFLm");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[0]] = llIlIlIIlIllllI("eDm+t1lD4VF5ywBpH8L32g==", "qoKEu");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[1]] = llIlIlIIlIlllIl("CxAYLg==", "XybKP");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[2]] = llIlIlIIlIllllI("AJo9u/JXdaDcD0gs3hAIkQ==", "pEqiy");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[6]] = llIlIlIIlIlllIl("KDUzVgMpMzwdXg==", "EZQxp");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[3]] = llIlIlIIlIlllll("vZhLa5XIfck=", "fyqFq");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[7]] = llIlIlIIlIlllIl("HywkBDg=", "lAEhT");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[11]] = llIlIlIIlIlllll("aW2LpTAiMZ/gYihpzybUWg==", "vbfff");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[8]] = llIlIlIIlIlllll("kTAQARqJUxyNFOPsQ8mvDg==", "EIrcG");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[12]] = llIlIlIIlIlllIl("KQsV", "Kbrrz");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[10]] = llIlIlIIlIllllI("4hRNLZbI2F4=", "UTBLf");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[13]] = llIlIlIIlIllllI("Xu97eL9CFMLDqW1mT1/CkQ==", "cySRF");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[14]] = llIlIlIIlIlllIl("JQc+", "GnYBT");
        EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[15]] = llIlIlIIlIlllIl("HDgNCBg=", "oUldt");
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIlIlllllIIIlIIlllI, final IEntityLivingData lllllllllllllIIlIlllllIIIlIIllIl) {
        int lllllllllllllIIlIlllllIIIlIIllII = this.rand.nextInt(EntitySlime.lIIlIlllllllIl[2]);
        if (llIlIlIlIIIIIIl(lllllllllllllIIlIlllllIIIlIIllII, EntitySlime.lIIlIlllllllIl[1]) && llIlIlIIllIllll(llIlIlIlIIIIIII(this.rand.nextFloat(), 0.5f * lllllllllllllIIlIlllllIIIlIIlllI.getClampedAdditionalDifficulty()))) {
            ++lllllllllllllIIlIlllllIIIlIIllII;
        }
        final int lllllllllllllIIlIlllllIIIlIIlIll = EntitySlime.lIIlIlllllllIl[0] << lllllllllllllIIlIlllllIIIlIIllII;
        this.setSlimeSize(lllllllllllllIIlIlllllIIIlIIlIll);
        return super.onInitialSpawn(lllllllllllllIIlIlllllIIIlIIlllI, lllllllllllllIIlIlllllIIIlIIllIl);
    }
    
    @Override
    public void applyEntityCollision(final Entity lllllllllllllIIlIlllllIIlIIllIIl) {
        super.applyEntityCollision(lllllllllllllIIlIlllllIIlIIllIIl);
        if (llIlIlIIlllIlII((lllllllllllllIIlIlllllIIlIIllIIl instanceof EntityIronGolem) ? 1 : 0) && llIlIlIIlllIlII(this.canDamagePlayer() ? 1 : 0)) {
            this.func_175451_e((EntityLivingBase)lllllllllllllIIlIlllllIIlIIllIIl);
        }
    }
    
    protected void func_175451_e(final EntityLivingBase lllllllllllllIIlIlllllIIlIIIIIIl) {
        final int lllllllllllllIIlIlllllIIlIIIIIll = this.getSlimeSize();
        if (llIlIlIIlllIlII(this.canEntityBeSeen(lllllllllllllIIlIlllllIIlIIIIIIl) ? 1 : 0) && llIlIlIIllIllll(llIlIlIIllllIIl(this.getDistanceSqToEntity(lllllllllllllIIlIlllllIIlIIIIIIl), 0.6 * lllllllllllllIIlIlllllIIlIIIIIll * 0.6 * lllllllllllllIIlIlllllIIlIIIIIll)) && llIlIlIIlllIlII(lllllllllllllIIlIlllllIIlIIIIIIl.attackEntityFrom(DamageSource.causeMobDamage(this), (float)this.getAttackStrength()) ? 1 : 0)) {
            this.playSound(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[11]], 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            this.applyEnchantments(this, lllllllllllllIIlIlllllIIlIIIIIIl);
        }
    }
    
    protected EntitySlime createInstance() {
        return new EntitySlime(this.worldObj);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIlllllIIlllIllIl) {
        super.readEntityFromNBT(lllllllllllllIIlIlllllIIlllIllIl);
        int lllllllllllllIIlIlllllIIlllIllll = lllllllllllllIIlIlllllIIlllIllIl.getInteger(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[1]]);
        if (llIlIlIIllIllll(lllllllllllllIIlIlllllIIlllIllll)) {
            lllllllllllllIIlIlllllIIlllIllll = EntitySlime.lIIlIlllllllIl[5];
        }
        this.setSlimeSize(lllllllllllllIIlIlllllIIlllIllll + EntitySlime.lIIlIlllllllIl[0]);
        this.wasOnGround = lllllllllllllIIlIlllllIIlllIllIl.getBoolean(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[2]]);
    }
    
    static {
        llIlIlIIllIlllI();
        llIlIlIIllIlIIl();
    }
    
    protected String getJumpSound() {
        final StringBuilder sb = new StringBuilder(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[6]]);
        String str;
        if (llIlIlIIlllIIII(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[0])) {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[3]];
            "".length();
            if (((0x1F ^ 0x7E) & ~(0x35 ^ 0x54)) != ((0xF0 ^ 0x91) & ~(0x3F ^ 0x5E))) {
                return null;
            }
        }
        else {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[7]];
        }
        return String.valueOf(sb.append(str));
    }
    
    protected void alterSquishAmount() {
        this.squishAmount *= 0.6f;
    }
    
    @Override
    public void onCollideWithPlayer(final EntityPlayer lllllllllllllIIlIlllllIIlIIIlIIl) {
        if (llIlIlIIlllIlII(this.canDamagePlayer() ? 1 : 0)) {
            this.func_175451_e(lllllllllllllIIlIlllllIIlIIIlIIl);
        }
    }
    
    @Override
    public int getVerticalFaceSpeed() {
        return EntitySlime.lIIlIlllllllIl[5];
    }
    
    private static boolean llIlIlIIlllllll(final int lllllllllllllIIlIlllllIIIIIIIIII, final int lllllllllllllIIlIllllIllllllllll) {
        return lllllllllllllIIlIlllllIIIIIIIIII <= lllllllllllllIIlIllllIllllllllll;
    }
    
    private static boolean llIlIlIIlllIIIl(final int lllllllllllllIIlIllllIlllllIllll) {
        return lllllllllllllIIlIllllIlllllIllll == 0;
    }
    
    protected void setSlimeSize(final int lllllllllllllIIlIlllllIIlllllllI) {
        this.dataWatcher.updateObject(EntitySlime.lIIlIlllllllIl[4], (byte)lllllllllllllIIlIlllllIIlllllllI);
        this.setSize(0.51000005f * lllllllllllllIIlIlllllIIlllllllI, 0.51000005f * lllllllllllllIIlIlllllIIlllllllI);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(lllllllllllllIIlIlllllIIlllllllI * lllllllllllllIIlIlllllIIlllllllI);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2f + 0.1f * lllllllllllllIIlIlllllIIlllllllI);
        this.setHealth(this.getMaxHealth());
        this.experienceValue = lllllllllllllIIlIlllllIIlllllllI;
    }
    
    private static boolean llIlIlIIllIllll(final int lllllllllllllIIlIllllIlllllIllIl) {
        return lllllllllllllIIlIllllIlllllIllIl < 0;
    }
    
    @Override
    protected String getHurtSound() {
        final StringBuilder sb = new StringBuilder(EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[8]]);
        String str;
        if (llIlIlIIlllIIII(this.getSlimeSize(), EntitySlime.lIIlIlllllllIl[0])) {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[12]];
            "".length();
            if (((0xA ^ 0x1F) & ~(0x4 ^ 0x11)) < 0) {
                return null;
            }
        }
        else {
            str = EntitySlime.lIIlIllllllIlI[EntitySlime.lIIlIlllllllIl[10]];
        }
        return String.valueOf(sb.append(str));
    }
    
    private static int llIlIlIIlllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String llIlIlIIlIllllI(final String lllllllllllllIIlIlllllIIIIlIllll, final String lllllllllllllIIlIlllllIIIIllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllIIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllIIIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlllllIIIIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlllllIIIIllIIll.init(EntitySlime.lIIlIlllllllIl[1], lllllllllllllIIlIlllllIIIIllIlII);
            return new String(lllllllllllllIIlIlllllIIIIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllIIIIllIIlI) {
            lllllllllllllIIlIlllllIIIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlIIlllIllI(final int lllllllllllllIIlIlllllIIIIIIllII, final int lllllllllllllIIlIlllllIIIIIIlIll) {
        return lllllllllllllIIlIlllllIIIIIIllII == lllllllllllllIIlIlllllIIIIIIlIll;
    }
    
    private static boolean llIlIlIlIIIIIIl(final int lllllllllllllIIlIlllllIIIIIIIlII, final int lllllllllllllIIlIlllllIIIIIIIIll) {
        return lllllllllllllIIlIlllllIIIIIIIlII < lllllllllllllIIlIlllllIIIIIIIIll;
    }
    
    private static String llIlIlIIlIlllll(final String lllllllllllllIIlIlllllIIIIlllllI, final String lllllllllllllIIlIlllllIIIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlllllIIIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlllllIIIIllllIl.getBytes(StandardCharsets.UTF_8)), EntitySlime.lIIlIlllllllIl[8]), "DES");
            final Cipher lllllllllllllIIlIlllllIIIlIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlllllIIIlIIIIII.init(EntitySlime.lIIlIlllllllIl[1], lllllllllllllIIlIlllllIIIlIIIIIl);
            return new String(lllllllllllllIIlIlllllIIIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlllllIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlllllIIIIllllll) {
            lllllllllllllIIlIlllllIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    public int getSlimeSize() {
        return this.dataWatcher.getWatchableObjectByte(EntitySlime.lIIlIlllllllIl[4]);
    }
    
    static class AISlimeAttack extends EntityAIBase
    {
        private static final /* synthetic */ int[] lllIIIIIlIllII;
        private /* synthetic */ EntitySlime slime;
        private /* synthetic */ int field_179465_b;
        
        private static boolean lIIlllIIIIlIIllI(final int llllllllllllIllIIIIlllIlllIlIIIl) {
            return llllllllllllIllIIIIlllIlllIlIIIl > 0;
        }
        
        static {
            lIIlllIIIIlIIIlI();
        }
        
        @Override
        public boolean continueExecuting() {
            final EntityLivingBase llllllllllllIllIIIIlllIlllIllllI = this.slime.getAttackTarget();
            int n;
            if (lIIlllIIIIlIIIll(llllllllllllIllIIIIlllIlllIllllI)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if (null != null) {
                    return ((6 + 120 - 12 + 24 ^ 42 + 43 - 84 + 127) & (93 + 118 - 168 + 90 ^ 109 + 59 - 109 + 84 ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIlllIIIIlIIlII(llllllllllllIllIIIIlllIlllIllllI.isEntityAlive() ? 1 : 0)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if (((0xCB ^ 0x81) & ~(0x3C ^ 0x76)) != 0x0) {
                    return ((0xFD ^ 0xA5) & ~(0x5E ^ 0x6)) != 0x0;
                }
            }
            else if (lIIlllIIIIlIIlIl((llllllllllllIllIIIIlllIlllIllllI instanceof EntityPlayer) ? 1 : 0) && lIIlllIIIIlIIlIl(((EntityPlayer)llllllllllllIllIIIIlllIlllIllllI).capabilities.disableDamage ? 1 : 0)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if (((0x8E ^ 0x83 ^ (0x78 ^ 0x66)) & (0x7E ^ 0x2B ^ (0x4 ^ 0x42) ^ -" ".length())) != ((0x4F ^ 0x5B ^ (0x88 ^ 0xA4)) & (0xD ^ 0x55 ^ (0xCA ^ 0xAA) ^ -" ".length()))) {
                    return ((107 + 43 + 21 + 66 ^ 34 + 103 - 117 + 158) & (0x48 ^ 0x15 ^ "  ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                final int n2 = this.field_179465_b - AISlimeAttack.lllIIIIIlIllII[2];
                this.field_179465_b = n2;
                if (lIIlllIIIIlIIllI(n2)) {
                    n = AISlimeAttack.lllIIIIIlIllII[2];
                    "".length();
                    if ((0x32 ^ 0x36 ^ " ".length()) <= 0) {
                        return ((0x4D ^ 0x37 ^ (0x7F ^ 0x2C)) & (0x2E ^ 0x49 ^ (0xC7 ^ 0x89) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = AISlimeAttack.lllIIIIIlIllII[1];
                }
            }
            return n != 0;
        }
        
        private static void lIIlllIIIIlIIIlI() {
            (lllIIIIIlIllII = new int[4])[0] = "  ".length();
            AISlimeAttack.lllIIIIIlIllII[1] = ((0xCB ^ 0x9C ^ (0xA5 ^ 0xC1)) & (0x52 ^ 0x9 ^ (0x14 ^ 0x7C) ^ -" ".length()));
            AISlimeAttack.lllIIIIIlIllII[2] = " ".length();
            AISlimeAttack.lllIIIIIlIllII[3] = (-(0xFFFFD267 & 0x3DDB) & (0xFFFFF3EF & 0x1D7E));
        }
        
        private static boolean lIIlllIIIIlIIIll(final Object llllllllllllIllIIIIlllIlllIlIlll) {
            return llllllllllllIllIIIIlllIlllIlIlll == null;
        }
        
        private static boolean lIIlllIIIIlIIlIl(final int llllllllllllIllIIIIlllIlllIlIlIl) {
            return llllllllllllIllIIIIlllIlllIlIlIl != 0;
        }
        
        @Override
        public void startExecuting() {
            this.field_179465_b = AISlimeAttack.lllIIIIIlIllII[3];
            super.startExecuting();
        }
        
        private static boolean lIIlllIIIIlIIlII(final int llllllllllllIllIIIIlllIlllIlIIll) {
            return llllllllllllIllIIIIlllIlllIlIIll == 0;
        }
        
        public AISlimeAttack() {
            this.setMutexBits(AISlimeAttack.lllIIIIIlIllII[0]);
        }
        
        @Override
        public boolean shouldExecute() {
            final EntityLivingBase llllllllllllIllIIIIlllIllllIIlll = this.slime.getAttackTarget();
            int n;
            if (lIIlllIIIIlIIIll(llllllllllllIllIIIIlllIllllIIlll)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if (((0xC5 ^ 0x8C) & ~(0xF3 ^ 0xBA)) == "   ".length()) {
                    return ((0xDC ^ 0x8F) & ~(0x40 ^ 0x13)) != 0x0;
                }
            }
            else if (lIIlllIIIIlIIlII(llllllllllllIllIIIIlllIllllIIlll.isEntityAlive() ? 1 : 0)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if ((0x50 ^ 0x54) < ((0xCA ^ 0x9E) & ~(0x42 ^ 0x16))) {
                    return ("  ".length() & ~"  ".length()) != 0x0;
                }
            }
            else if (lIIlllIIIIlIIlIl((llllllllllllIllIIIIlllIllllIIlll instanceof EntityPlayer) ? 1 : 0) && lIIlllIIIIlIIlIl(((EntityPlayer)llllllllllllIllIIIIlllIllllIIlll).capabilities.disableDamage ? 1 : 0)) {
                n = AISlimeAttack.lllIIIIIlIllII[1];
                "".length();
                if (null != null) {
                    return ((15 + 79 + 24 + 27 ^ 33 + 107 - 22 + 31) & (35 + 60 + 36 + 48 ^ 18 + 43 + 24 + 98 ^ -" ".length()) & (((0x62 ^ 0x7D ^ (0x15 ^ 0x39)) & (11 + 109 + 41 + 30 ^ 126 + 113 - 110 + 11 ^ -" ".length())) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = AISlimeAttack.lllIIIIIlIllII[2];
            }
            return n != 0;
        }
        
        @Override
        public void updateTask() {
            this.slime.faceEntity(this.slime.getAttackTarget(), 10.0f, 10.0f);
            ((SlimeMoveHelper)this.slime.getMoveHelper()).func_179920_a(this.slime.rotationYaw, this.slime.canDamagePlayer());
        }
    }
    
    static class SlimeMoveHelper extends EntityMoveHelper
    {
        private /* synthetic */ EntitySlime slime;
        private static final /* synthetic */ int[] lIlIIIIllIllII;
        private /* synthetic */ float field_179922_g;
        private /* synthetic */ boolean field_179923_j;
        private /* synthetic */ int field_179924_h;
        
        public void setSpeed(final double lllllllllllllIIlIIIIIlIIlIIIIIIl) {
            this.speed = lllllllllllllIIlIIIIIlIIlIIIIIIl;
            this.update = (SlimeMoveHelper.lIlIIIIllIllII[0] != 0);
        }
        
        private static boolean lllIIIIllllIIlI(final int lllllllllllllIIlIIIIIlIIIlllIllI) {
            return lllllllllllllIIlIIIIIlIIIlllIllI <= 0;
        }
        
        public void func_179920_a(final float lllllllllllllIIlIIIIIlIIlIIIlIIl, final boolean lllllllllllllIIlIIIIIlIIlIIIlIII) {
            this.field_179922_g = lllllllllllllIIlIIIIIlIIlIIIlIIl;
            this.field_179923_j = lllllllllllllIIlIIIIIlIIlIIIlIII;
        }
        
        private static void lllIIIIlllIllll() {
            (lIlIIIIllIllII = new int[3])[0] = " ".length();
            SlimeMoveHelper.lIlIIIIllIllII[1] = ((0xD3 ^ 0xA9 ^ (0x35 ^ 0x63)) & (0xBC ^ 0x89 ^ (0x80 ^ 0x99) ^ -" ".length()));
            SlimeMoveHelper.lIlIIIIllIllII[2] = "   ".length();
        }
        
        public SlimeMoveHelper() {
            super(EntitySlime.this);
        }
        
        private static boolean lllIIIIllllIIIl(final int lllllllllllllIIlIIIIIlIIIllllIlI) {
            return lllllllllllllIIlIIIIIlIIIllllIlI != 0;
        }
        
        static {
            lllIIIIlllIllll();
        }
        
        @Override
        public void onUpdateMoveHelper() {
            this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, this.field_179922_g, 30.0f);
            this.entity.rotationYawHead = this.entity.rotationYaw;
            this.entity.renderYawOffset = this.entity.rotationYaw;
            if (lllIIIIllllIIII(this.update ? 1 : 0)) {
                this.entity.setMoveForward(0.0f);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                this.update = (SlimeMoveHelper.lIlIIIIllIllII[1] != 0);
                if (lllIIIIllllIIIl(this.entity.onGround ? 1 : 0)) {
                    this.entity.setAIMoveSpeed((float)(this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
                    final int field_179924_h = this.field_179924_h;
                    this.field_179924_h = field_179924_h - SlimeMoveHelper.lIlIIIIllIllII[0];
                    if (lllIIIIllllIIlI(field_179924_h)) {
                        this.field_179924_h = this.slime.getJumpDelay();
                        if (lllIIIIllllIIIl(this.field_179923_j ? 1 : 0)) {
                            this.field_179924_h /= SlimeMoveHelper.lIlIIIIllIllII[2];
                        }
                        this.slime.getJumpHelper().setJumping();
                        if (lllIIIIllllIIIl(this.slime.makesSoundOnJump() ? 1 : 0)) {
                            this.slime.playSound(this.slime.getJumpSound(), this.slime.getSoundVolume(), ((this.slime.getRNG().nextFloat() - this.slime.getRNG().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                            "".length();
                            if (-" ".length() > "   ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        final EntitySlime slime = this.slime;
                        final EntitySlime slime2 = this.slime;
                        final float n = 0.0f;
                        slime2.moveForward = n;
                        slime.moveStrafing = n;
                        this.entity.setAIMoveSpeed(0.0f);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                else {
                    this.entity.setAIMoveSpeed((float)(this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
                }
            }
        }
        
        private static boolean lllIIIIllllIIII(final int lllllllllllllIIlIIIIIlIIIllllIII) {
            return lllllllllllllIIlIIIIIlIIIllllIII == 0;
        }
    }
    
    static class AISlimeHop extends EntityAIBase
    {
        private static final /* synthetic */ int[] lIlIIIIIllIIll;
        private /* synthetic */ EntitySlime slime;
        
        private static void lllIIIIIllIIllI() {
            (lIlIIIIIllIIll = new int[2])[0] = (0x15 ^ 0x10);
            AISlimeHop.lIlIIIIIllIIll[1] = " ".length();
        }
        
        @Override
        public void updateTask() {
            ((SlimeMoveHelper)this.slime.getMoveHelper()).setSpeed(1.0);
        }
        
        @Override
        public boolean shouldExecute() {
            return AISlimeHop.lIlIIIIIllIIll[1] != 0;
        }
        
        static {
            lllIIIIIllIIllI();
        }
        
        public AISlimeHop() {
            this.setMutexBits(AISlimeHop.lIlIIIIIllIIll[0]);
        }
    }
    
    static class AISlimeFloat extends EntityAIBase
    {
        private /* synthetic */ EntitySlime slime;
        private static final /* synthetic */ int[] lIIIlIIllllIIl;
        
        private static int llIIIIIIIIIIIII(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        @Override
        public void updateTask() {
            if (llIIIIIIIIIIIIl(llIIIIIIIIIIIII(this.slime.getRNG().nextFloat(), 0.8f))) {
                this.slime.getJumpHelper().setJumping();
            }
            ((SlimeMoveHelper)this.slime.getMoveHelper()).setSpeed(1.2);
        }
        
        private static boolean lIlllllllllllll(final int lllllllllllllIlIIIlIIIlllIllllll) {
            return lllllllllllllIlIIIlIIIlllIllllll == 0;
        }
        
        static {
            lIllllllllllllI();
        }
        
        private static void lIllllllllllllI() {
            (lIIIlIIllllIIl = new int[3])[0] = (0x8 ^ 0x35 ^ (0xA4 ^ 0x9C));
            AISlimeFloat.lIIIlIIllllIIl[1] = " ".length();
            AISlimeFloat.lIIIlIIllllIIl[2] = ((129 + 104 - 176 + 85 ^ 94 + 36 - 57 + 91) & (0x22 ^ 0x16 ^ (0xB0 ^ 0xAE) ^ -" ".length()));
        }
        
        private static boolean llIIIIIIIIIIIIl(final int lllllllllllllIlIIIlIIIlllIllllIl) {
            return lllllllllllllIlIIIlIIIlllIllllIl < 0;
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIlllllllllllll(this.slime.isInWater() ? 1 : 0) && lIlllllllllllll(this.slime.isInLava() ? 1 : 0)) {
                return AISlimeFloat.lIIIlIIllllIIl[2] != 0;
            }
            return AISlimeFloat.lIIIlIIllllIIl[1] != 0;
        }
        
        public AISlimeFloat() {
            this.setMutexBits(AISlimeFloat.lIIIlIIllllIIl[0]);
            ((PathNavigateGround)EntitySlime.this.getNavigator()).setCanSwim((boolean)(AISlimeFloat.lIIIlIIllllIIl[1] != 0));
        }
    }
    
    static class AISlimeFaceRandom extends EntityAIBase
    {
        private /* synthetic */ int field_179460_c;
        private static final /* synthetic */ int[] lIIIlIlIIlllIl;
        private /* synthetic */ EntitySlime slime;
        private /* synthetic */ float field_179459_b;
        
        private static void llIIIIIIllIIlII() {
            (lIIIlIlIIlllIl = new int[6])[0] = "  ".length();
            AISlimeFaceRandom.lIIIlIlIIlllIl[1] = " ".length();
            AISlimeFaceRandom.lIIIlIlIIlllIl[2] = ((157 + 204 - 291 + 162 ^ 99 + 100 - 192 + 129) & (0x66 ^ 0x78 ^ (0xF2 ^ 0x8C) ^ -" ".length()));
            AISlimeFaceRandom.lIIIlIlIIlllIl[3] = (160 + 178 - 102 + 1 ^ 38 + 20 - 13 + 152);
            AISlimeFaceRandom.lIIIlIlIIlllIl[4] = (0x88 ^ 0x95 ^ (0x9F ^ 0xBE));
            AISlimeFaceRandom.lIIIlIlIIlllIl[5] = (0xFFFFF56F & 0xBF8);
        }
        
        @Override
        public boolean shouldExecute() {
            if (llIIIIIIllIIlIl(this.slime.getAttackTarget()) && (!llIIIIIIllIIllI(this.slime.onGround ? 1 : 0) || !llIIIIIIllIIllI(this.slime.isInWater() ? 1 : 0) || llIIIIIIllIIlll(this.slime.isInLava() ? 1 : 0))) {
                return AISlimeFaceRandom.lIIIlIlIIlllIl[1] != 0;
            }
            return AISlimeFaceRandom.lIIIlIlIIlllIl[2] != 0;
        }
        
        @Override
        public void updateTask() {
            final int n = this.field_179460_c - AISlimeFaceRandom.lIIIlIlIIlllIl[1];
            this.field_179460_c = n;
            if (llIIIIIIllIlIII(n)) {
                this.field_179460_c = AISlimeFaceRandom.lIIIlIlIIlllIl[3] + this.slime.getRNG().nextInt(AISlimeFaceRandom.lIIIlIlIIlllIl[4]);
                this.field_179459_b = (float)this.slime.getRNG().nextInt(AISlimeFaceRandom.lIIIlIlIIlllIl[5]);
            }
            ((SlimeMoveHelper)this.slime.getMoveHelper()).func_179920_a(this.field_179459_b, (boolean)(AISlimeFaceRandom.lIIIlIlIIlllIl[2] != 0));
        }
        
        private static boolean llIIIIIIllIlIII(final int lllllllllllllIlIIIIlllIllIIlIllI) {
            return lllllllllllllIlIIIIlllIllIIlIllI <= 0;
        }
        
        private static boolean llIIIIIIllIIlIl(final Object lllllllllllllIlIIIIlllIllIIlllII) {
            return lllllllllllllIlIIIIlllIllIIlllII == null;
        }
        
        private static boolean llIIIIIIllIIlll(final int lllllllllllllIlIIIIlllIllIIllIlI) {
            return lllllllllllllIlIIIIlllIllIIllIlI != 0;
        }
        
        public AISlimeFaceRandom() {
            this.setMutexBits(AISlimeFaceRandom.lIIIlIlIIlllIl[0]);
        }
        
        static {
            llIIIIIIllIIlII();
        }
        
        private static boolean llIIIIIIllIIllI(final int lllllllllllllIlIIIIlllIllIIllIII) {
            return lllllllllllllIlIIIIlllIllIIllIII == 0;
        }
    }
}
