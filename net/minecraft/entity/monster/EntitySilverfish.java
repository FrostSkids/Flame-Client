// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.item.Item;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.Blocks;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.SharedMonsterAttributes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntitySilverfish extends EntityMob
{
    private static final /* synthetic */ int[] lllIllIIIlIlIl;
    private static final /* synthetic */ String[] lllIllIIIlIlII;
    private /* synthetic */ AISummonSilverfish summonSilverfish;
    
    @Override
    public void onUpdate() {
        this.renderYawOffset = this.rotationYaw;
        super.onUpdate();
    }
    
    private static boolean lIlIIlIIIIIlIIII(final Object llllllllllllIlIllIIllllIIlIlIIll) {
        return llllllllllllIlIllIIllllIIlIlIIll == null;
    }
    
    private static String lIlIIlIIIIIIlIIl(final String llllllllllllIlIllIIllllIIlIllllI, final String llllllllllllIlIllIIllllIIlIllIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllllIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), EntitySilverfish.lllIllIIIlIlIl[6]), "DES");
            final Cipher llllllllllllIlIllIIllllIIllIIIII = Cipher.getInstance("DES");
            llllllllllllIlIllIIllllIIllIIIII.init(EntitySilverfish.lllIllIIIlIlIl[5], llllllllllllIlIllIIllllIIllIIIIl);
            return new String(llllllllllllIlIllIIllllIIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllllIIlIlllll) {
            llllllllllllIlIllIIllllIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0);
    }
    
    @Override
    protected String getHurtSound() {
        return EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[0]];
    }
    
    @Override
    public float getEyeHeight() {
        return 0.1f;
    }
    
    @Override
    protected boolean isValidLightLevel() {
        return EntitySilverfish.lllIllIIIlIlIl[0] != 0;
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIlIllIIllllIlIIIIlll, final Block llllllllllllIlIllIIllllIlIIIIllI) {
        this.playSound(EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[1]], 0.15f, 1.0f);
    }
    
    public EntitySilverfish(final World llllllllllllIlIllIIllllIlIIllllI) {
        super(llllllllllllIlIllIIllllIlIIllllI);
        this.setSize(0.4f, 0.3f);
        this.tasks.addTask(EntitySilverfish.lllIllIIIlIlIl[0], new EntityAISwimming(this));
        final EntityAITasks tasks = this.tasks;
        final int llllllllllllIlllIIllllIlIlIIIIll = EntitySilverfish.lllIllIIIlIlIl[1];
        final AISummonSilverfish aiSummonSilverfish = new AISummonSilverfish(this);
        this.summonSilverfish = aiSummonSilverfish;
        tasks.addTask(llllllllllllIlllIIllllIlIlIIIIll, aiSummonSilverfish);
        this.tasks.addTask(EntitySilverfish.lllIllIIIlIlIl[2], new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0, (boolean)(EntitySilverfish.lllIllIIIlIlIl[3] != 0)));
        this.tasks.addTask(EntitySilverfish.lllIllIIIlIlIl[4], new AIHideInStone(this));
        this.targetTasks.addTask(EntitySilverfish.lllIllIIIlIlIl[0], new EntityAIHurtByTarget(this, (boolean)(EntitySilverfish.lllIllIIIlIlIl[0] != 0), new Class[EntitySilverfish.lllIllIIIlIlIl[3]]));
        this.targetTasks.addTask(EntitySilverfish.lllIllIIIlIlIl[5], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntitySilverfish.lllIllIIIlIlIl[0] != 0)));
    }
    
    private static boolean lIlIIlIIIIIIlllI(final int llllllllllllIlIllIIllllIIlIIllll) {
        return llllllllllllIlIllIIllllIIlIIllll == 0;
    }
    
    @Override
    public double getYOffset() {
        return 0.2;
    }
    
    static {
        lIlIIlIIIIIIllII();
        lIlIIlIIIIIIlIll();
    }
    
    @Override
    public float getBlockPathWeight(final BlockPos llllllllllllIlIllIIllllIIllllIll) {
        float blockPathWeight;
        if (lIlIIlIIIIIIllll(this.worldObj.getBlockState(llllllllllllIlIllIIllllIIllllIll.down()).getBlock(), Blocks.stone)) {
            blockPathWeight = 10.0f;
            "".length();
            if (((0x5B ^ 0x28 ^ (0x76 ^ 0x4C)) & (23 + 178 - 32 + 41 ^ 37 + 111 - 25 + 32 ^ -" ".length())) < 0) {
                return 0.0f;
            }
        }
        else {
            blockPathWeight = super.getBlockPathWeight(llllllllllllIlIllIIllllIIllllIll);
        }
        return blockPathWeight;
    }
    
    private static void lIlIIlIIIIIIlIll() {
        (lllIllIIIlIlII = new String[EntitySilverfish.lllIllIIIlIlIl[2]])[EntitySilverfish.lllIllIIIlIlIl[3]] = lIlIIlIIIIIIlIIl("Bz00I2sfr0SGebrOfShNDK3rrm2i04MV", "TuXWY");
        EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[0]] = lIlIIlIIIIIIlIlI("2p/XuUdbYxobjKWNL5tFtMenWsdjTCGO", "EnQPc");
        EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[5]] = lIlIIlIIIIIIlIlI("J/FI8IZDN5TTWFJ62YYQkC+aYJI0zECG", "ujwpo");
        EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[1]] = lIlIIlIIIIIIlIlI("5j/Zc3c0j+dFFf3xMP4NiRpdUEccFxDM", "tLgnH");
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    @Override
    protected String getLivingSound() {
        return EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[3]];
    }
    
    private static boolean lIlIIlIIIIIIllll(final Object llllllllllllIlIllIIllllIIlIlIllI, final Object llllllllllllIlIllIIllllIIlIlIlIl) {
        return llllllllllllIlIllIIllllIIlIlIllI == llllllllllllIlIllIIllllIIlIlIlIl;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlIllIIllllIlIIIlIll, final float llllllllllllIlIllIIllllIlIIIllIl) {
        if (lIlIIlIIIIIIllIl(this.isEntityInvulnerable(llllllllllllIlIllIIllllIlIIIlIll) ? 1 : 0)) {
            return EntitySilverfish.lllIllIIIlIlIl[3] != 0;
        }
        if (!lIlIIlIIIIIIlllI((llllllllllllIlIllIIllllIlIIIlIll instanceof EntityDamageSource) ? 1 : 0) || lIlIIlIIIIIIllll(llllllllllllIlIllIIllllIlIIIlIll, DamageSource.magic)) {
            this.summonSilverfish.func_179462_f();
        }
        return super.attackEntityFrom(llllllllllllIlIllIIllllIlIIIlIll, llllllllllllIlIllIIllllIlIIIllIl);
    }
    
    private static void lIlIIlIIIIIIllII() {
        (lllIllIIIlIlIl = new int[7])[0] = " ".length();
        EntitySilverfish.lllIllIIIlIlIl[1] = "   ".length();
        EntitySilverfish.lllIllIIIlIlIl[2] = (148 + 2 - 101 + 106 ^ 86 + 132 - 93 + 34);
        EntitySilverfish.lllIllIIIlIlIl[3] = ((0x1D ^ 0x51) & ~(0x55 ^ 0x19));
        EntitySilverfish.lllIllIIIlIlIl[4] = (0xA2 ^ 0xA9 ^ (0x68 ^ 0x66));
        EntitySilverfish.lllIllIIIlIlIl[5] = "  ".length();
        EntitySilverfish.lllIllIIIlIlIl[6] = (0xF9 ^ 0x92 ^ (0x74 ^ 0x17));
    }
    
    @Override
    protected Item getDropItem() {
        return null;
    }
    
    @Override
    protected String getDeathSound() {
        return EntitySilverfish.lllIllIIIlIlII[EntitySilverfish.lllIllIIIlIlIl[5]];
    }
    
    private static boolean lIlIIlIIIIIIllIl(final int llllllllllllIlIllIIllllIIlIlIIIl) {
        return llllllllllllIlIllIIllllIIlIlIIIl != 0;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntitySilverfish.lllIllIIIlIlIl[3] != 0;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (!lIlIIlIIIIIIllIl(super.getCanSpawnHere() ? 1 : 0)) {
            return EntitySilverfish.lllIllIIIlIlIl[3] != 0;
        }
        final EntityPlayer llllllllllllIlIllIIllllIIlllIllI = this.worldObj.getClosestPlayerToEntity(this, 5.0);
        if (lIlIIlIIIIIlIIII(llllllllllllIlIllIIllllIIlllIllI)) {
            return EntitySilverfish.lllIllIIIlIlIl[0] != 0;
        }
        return EntitySilverfish.lllIllIIIlIlIl[3] != 0;
    }
    
    private static String lIlIIlIIIIIIlIlI(final String llllllllllllIlIllIIllllIIllIlIIl, final String llllllllllllIlIllIIllllIIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllllIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllllIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIllllIIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIllllIIllIllIl.init(EntitySilverfish.lllIllIIIlIlIl[5], llllllllllllIlIllIIllllIIllIlllI);
            return new String(llllllllllllIlIllIIllllIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllllIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllllIIllIllII) {
            llllllllllllIlIllIIllllIIllIllII.printStackTrace();
            return null;
        }
    }
    
    static class AIHideInStone extends EntityAIWander
    {
        private final /* synthetic */ EntitySilverfish field_179485_a;
        private static final /* synthetic */ int[] lIlllIlIlIIlll;
        private /* synthetic */ boolean field_179484_c;
        private /* synthetic */ EnumFacing facing;
        
        static {
            lIIIIIlIllIIIIll();
        }
        
        private static boolean lIIIIIlIllIIIlII(final Object llllllllllllIlllllIIIIIIllIIIllI) {
            return llllllllllllIlllllIIIIIIllIIIllI != null;
        }
        
        private static boolean lIIIIIlIllIIIllI(final int llllllllllllIlllllIIIIIIllIIIlII) {
            return llllllllllllIlllllIIIIIIllIIIlII != 0;
        }
        
        @Override
        public void startExecuting() {
            if (lIIIIIlIllIIIlIl(this.field_179484_c ? 1 : 0)) {
                super.startExecuting();
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                final World llllllllllllIlllllIIIIIIllIIlllI = this.field_179485_a.worldObj;
                final BlockPos llllllllllllIlllllIIIIIIllIIllIl = new BlockPos(this.field_179485_a.posX, this.field_179485_a.posY + 0.5, this.field_179485_a.posZ).offset(this.facing);
                final IBlockState llllllllllllIlllllIIIIIIllIIllII = llllllllllllIlllllIIIIIIllIIlllI.getBlockState(llllllllllllIlllllIIIIIIllIIllIl);
                if (lIIIIIlIllIIIllI(BlockSilverfish.canContainSilverfish(llllllllllllIlllllIIIIIIllIIllII) ? 1 : 0)) {
                    llllllllllllIlllllIIIIIIllIIlllI.setBlockState(llllllllllllIlllllIIIIIIllIIllIl, Blocks.monster_egg.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.forModelBlock(llllllllllllIlllllIIIIIIllIIllII)), AIHideInStone.lIlllIlIlIIlll[3]);
                    "".length();
                    this.field_179485_a.spawnExplosionParticle();
                    this.field_179485_a.setDead();
                }
            }
        }
        
        private static void lIIIIIlIllIIIIll() {
            (lIlllIlIlIIlll = new int[4])[0] = (0x10 ^ 0x20 ^ (0xF9 ^ 0xC3));
            AIHideInStone.lIlllIlIlIIlll[1] = " ".length();
            AIHideInStone.lIlllIlIlIIlll[2] = ((0x77 ^ 0x52 ^ (0x11 ^ 0x3A)) & (22 + 48 + 34 + 31 ^ 109 + 128 - 201 + 101 ^ -" ".length()));
            AIHideInStone.lIlllIlIlIIlll[3] = "   ".length();
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIIIIIlIllIIIlII(this.field_179485_a.getAttackTarget())) {
                return AIHideInStone.lIlllIlIlIIlll[2] != 0;
            }
            if (lIIIIIlIllIIIlIl(this.field_179485_a.getNavigator().noPath() ? 1 : 0)) {
                return AIHideInStone.lIlllIlIlIIlll[2] != 0;
            }
            final Random llllllllllllIlllllIIIIIIllIlllIl = this.field_179485_a.getRNG();
            if (lIIIIIlIllIIIlIl(llllllllllllIlllllIIIIIIllIlllIl.nextInt(AIHideInStone.lIlllIlIlIIlll[0]))) {
                this.facing = EnumFacing.random(llllllllllllIlllllIIIIIIllIlllIl);
                final BlockPos llllllllllllIlllllIIIIIIllIlllII = new BlockPos(this.field_179485_a.posX, this.field_179485_a.posY + 0.5, this.field_179485_a.posZ).offset(this.facing);
                final IBlockState llllllllllllIlllllIIIIIIllIllIll = this.field_179485_a.worldObj.getBlockState(llllllllllllIlllllIIIIIIllIlllII);
                if (lIIIIIlIllIIIllI(BlockSilverfish.canContainSilverfish(llllllllllllIlllllIIIIIIllIllIll) ? 1 : 0)) {
                    this.field_179484_c = (AIHideInStone.lIlllIlIlIIlll[1] != 0);
                    return AIHideInStone.lIlllIlIlIIlll[1] != 0;
                }
            }
            this.field_179484_c = (AIHideInStone.lIlllIlIlIIlll[2] != 0);
            return super.shouldExecute();
        }
        
        private static boolean lIIIIIlIllIIIlIl(final int llllllllllllIlllllIIIIIIllIIIIlI) {
            return llllllllllllIlllllIIIIIIllIIIIlI == 0;
        }
        
        @Override
        public boolean continueExecuting() {
            int continueExecuting;
            if (lIIIIIlIllIIIllI(this.field_179484_c ? 1 : 0)) {
                continueExecuting = AIHideInStone.lIlllIlIlIIlll[2];
                "".length();
                if ("   ".length() <= ((0x5E ^ 0x3 ^ (0xC ^ 0x0)) & (0x87 ^ 0xAD ^ (0x22 ^ 0x59) ^ -" ".length()))) {
                    return ((7 + 47 - 14 + 135 ^ 24 + 68 - 49 + 92) & (77 + 112 - 137 + 76 ^ 125 + 137 - 211 + 117 ^ -" ".length())) != 0x0;
                }
            }
            else {
                continueExecuting = (super.continueExecuting() ? 1 : 0);
            }
            return continueExecuting != 0;
        }
        
        public AIHideInStone() {
            super(EntitySilverfish.this, 1.0, AIHideInStone.lIlllIlIlIIlll[0]);
            this.setMutexBits(AIHideInStone.lIlllIlIlIIlll[1]);
        }
    }
    
    static class AISummonSilverfish extends EntityAIBase
    {
        private /* synthetic */ int field_179463_b;
        private static final /* synthetic */ int[] lllIIIllIlIIll;
        private /* synthetic */ EntitySilverfish silverfish;
        private static final /* synthetic */ String[] lllIIIllIIllII;
        
        private static boolean lIIllllIIIIIllII(final int llllllllllllIlIllllllllIlIlllIll, final int llllllllllllIlIllllllllIlIlllIlI) {
            return llllllllllllIlIllllllllIlIlllIll <= llllllllllllIlIllllllllIlIlllIlI;
        }
        
        private static boolean lIIllllIIIIIlIll(final int llllllllllllIlIllllllllIlIllIlII) {
            return llllllllllllIlIllllllllIlIllIlII != 0;
        }
        
        public AISummonSilverfish() {
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIIllllIIIIIlIII(this.field_179463_b)) {
                return AISummonSilverfish.lllIIIllIlIIll[1] != 0;
            }
            return AISummonSilverfish.lllIIIllIlIIll[2] != 0;
        }
        
        @Override
        public void updateTask() {
            this.field_179463_b -= AISummonSilverfish.lllIIIllIlIIll[1];
            if (lIIllllIIIIIlIIl(this.field_179463_b)) {
                final World llllllllllllIlIllllllllIllIlllll = this.silverfish.worldObj;
                final Random llllllllllllIlIllllllllIllIllllI = this.silverfish.getRNG();
                final BlockPos llllllllllllIlIllllllllIllIlllIl = new BlockPos(this.silverfish);
                int llllllllllllIlIllllllllIllIlllII = AISummonSilverfish.lllIIIllIlIIll[2];
                "".length();
                if (null != null) {
                    return;
                }
                while (lIIllllIIIIIllII(llllllllllllIlIllllllllIllIlllII, AISummonSilverfish.lllIIIllIlIIll[6]) && !lIIllllIIIIIllIl(llllllllllllIlIllllllllIllIlllII, AISummonSilverfish.lllIIIllIlIIll[7])) {
                    int llllllllllllIlIllllllllIllIllIll = AISummonSilverfish.lllIIIllIlIIll[2];
                    "".length();
                    if (((0x58 ^ 0x39 ^ (0x63 ^ 0x5)) & (0x8C ^ 0xA9 ^ (0x12 ^ 0x30) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    while (lIIllllIIIIIllII(llllllllllllIlIllllllllIllIllIll, AISummonSilverfish.lllIIIllIlIIll[4]) && !lIIllllIIIIIllIl(llllllllllllIlIllllllllIllIllIll, AISummonSilverfish.lllIIIllIlIIll[5])) {
                        int llllllllllllIlIllllllllIllIllIlI = AISummonSilverfish.lllIIIllIlIIll[2];
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (lIIllllIIIIIllII(llllllllllllIlIllllllllIllIllIlI, AISummonSilverfish.lllIIIllIlIIll[4]) && !lIIllllIIIIIllIl(llllllllllllIlIllllllllIllIllIlI, AISummonSilverfish.lllIIIllIlIIll[5])) {
                            final BlockPos llllllllllllIlIllllllllIllIllIIl = llllllllllllIlIllllllllIllIlllIl.add(llllllllllllIlIllllllllIllIllIll, llllllllllllIlIllllllllIllIlllII, llllllllllllIlIllllllllIllIllIlI);
                            final IBlockState llllllllllllIlIllllllllIllIllIII = llllllllllllIlIllllllllIllIlllll.getBlockState(llllllllllllIlIllllllllIllIllIIl);
                            if (lIIllllIIIIIlIlI(llllllllllllIlIllllllllIllIllIII.getBlock(), Blocks.monster_egg)) {
                                if (lIIllllIIIIIlIll(llllllllllllIlIllllllllIllIlllll.getGameRules().getBoolean(AISummonSilverfish.lllIIIllIIllII[AISummonSilverfish.lllIIIllIlIIll[2]]) ? 1 : 0)) {
                                    llllllllllllIlIllllllllIllIlllll.destroyBlock(llllllllllllIlIllllllllIllIllIIl, (boolean)(AISummonSilverfish.lllIIIllIlIIll[1] != 0));
                                    "".length();
                                    "".length();
                                    if ("   ".length() == " ".length()) {
                                        return;
                                    }
                                }
                                else {
                                    llllllllllllIlIllllllllIllIlllll.setBlockState(llllllllllllIlIllllllllIllIllIIl, llllllllllllIlIllllllllIllIllIII.getValue(BlockSilverfish.VARIANT).getModelBlock(), AISummonSilverfish.lllIIIllIlIIll[3]);
                                    "".length();
                                }
                                if (lIIllllIIIIIlIll(llllllllllllIlIllllllllIllIllllI.nextBoolean() ? 1 : 0)) {
                                    return;
                                }
                            }
                            int n;
                            if (lIIllllIIIIIlIIl(llllllllllllIlIllllllllIllIllIlI)) {
                                n = AISummonSilverfish.lllIIIllIlIIll[1] - llllllllllllIlIllllllllIllIllIlI;
                                "".length();
                                if ((0xB5 ^ 0xB1) < 0) {
                                    return;
                                }
                            }
                            else {
                                n = AISummonSilverfish.lllIIIllIlIIll[2] - llllllllllllIlIllllllllIllIllIlI;
                            }
                            llllllllllllIlIllllllllIllIllIlI = n;
                        }
                        int n2;
                        if (lIIllllIIIIIlIIl(llllllllllllIlIllllllllIllIllIll)) {
                            n2 = AISummonSilverfish.lllIIIllIlIIll[1] - llllllllllllIlIllllllllIllIllIll;
                            "".length();
                            if (((0x74 ^ 0x36 ^ (0x50 ^ 0x3)) & (171 + 8 - 141 + 152 ^ 6 + 124 - 80 + 125 ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                        else {
                            n2 = AISummonSilverfish.lllIIIllIlIIll[2] - llllllllllllIlIllllllllIllIllIll;
                        }
                        llllllllllllIlIllllllllIllIllIll = n2;
                    }
                    int n3;
                    if (lIIllllIIIIIlIIl(llllllllllllIlIllllllllIllIlllII)) {
                        n3 = AISummonSilverfish.lllIIIllIlIIll[1] - llllllllllllIlIllllllllIllIlllII;
                        "".length();
                        if ("  ".length() > "  ".length()) {
                            return;
                        }
                    }
                    else {
                        n3 = AISummonSilverfish.lllIIIllIlIIll[2] - llllllllllllIlIllllllllIllIlllII;
                    }
                    llllllllllllIlIllllllllIllIlllII = n3;
                }
            }
        }
        
        private static boolean lIIllllIIIIIlIIl(final int llllllllllllIlIllllllllIlIllIIII) {
            return llllllllllllIlIllllllllIlIllIIII <= 0;
        }
        
        private static boolean lIIllllIIIIIIlll(final int llllllllllllIlIllllllllIlIllIIlI) {
            return llllllllllllIlIllllllllIlIllIIlI == 0;
        }
        
        public void func_179462_f() {
            if (lIIllllIIIIIIlll(this.field_179463_b)) {
                this.field_179463_b = AISummonSilverfish.lllIIIllIlIIll[0];
            }
        }
        
        static {
            lIIllllIIIIIIllI();
            lIIlllIllllIlIll();
        }
        
        private static void lIIlllIllllIlIll() {
            (lllIIIllIIllII = new String[AISummonSilverfish.lllIIIllIlIIll[1]])[AISummonSilverfish.lllIIIllIlIIll[2]] = lIIlllIllllIlIlI("XjZtNAtNUHkJqYYDjjzf/A==", "eMSMx");
        }
        
        private static boolean lIIllllIIIIIllIl(final int llllllllllllIlIllllllllIlIllllll, final int llllllllllllIlIllllllllIlIlllllI) {
            return llllllllllllIlIllllllllIlIllllll < llllllllllllIlIllllllllIlIlllllI;
        }
        
        private static boolean lIIllllIIIIIlIlI(final Object llllllllllllIlIllllllllIlIllIlll, final Object llllllllllllIlIllllllllIlIllIllI) {
            return llllllllllllIlIllllllllIlIllIlll == llllllllllllIlIllllllllIlIllIllI;
        }
        
        private static String lIIlllIllllIlIlI(final String llllllllllllIlIllllllllIllIIIlll, final String llllllllllllIlIllllllllIllIIIllI) {
            try {
                final SecretKeySpec llllllllllllIlIllllllllIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllllIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllllllllIllIIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIlIllllllllIllIIlIIl.init(AISummonSilverfish.lllIIIllIlIIll[8], llllllllllllIlIllllllllIllIIlIlI);
                return new String(llllllllllllIlIllllllllIllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllllIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllllllllIllIIlIII) {
                llllllllllllIlIllllllllIllIIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllllIIIIIIllI() {
            (lllIIIllIlIIll = new int[9])[0] = (0x6C ^ 0x78);
            AISummonSilverfish.lllIIIllIlIIll[1] = " ".length();
            AISummonSilverfish.lllIIIllIlIIll[2] = ((0xA8 ^ 0xA1) & ~(0x19 ^ 0x10));
            AISummonSilverfish.lllIIIllIlIIll[3] = "   ".length();
            AISummonSilverfish.lllIIIllIlIIll[4] = (0x7B ^ 0x71);
            AISummonSilverfish.lllIIIllIlIIll[5] = -(45 + 112 - 73 + 71 ^ 44 + 35 - 12 + 78);
            AISummonSilverfish.lllIIIllIlIIll[6] = (0x78 ^ 0x7D);
            AISummonSilverfish.lllIIIllIlIIll[7] = -(0xC3 ^ 0xB0 ^ (0x56 ^ 0x20));
            AISummonSilverfish.lllIIIllIlIIll[8] = "  ".length();
        }
        
        private static boolean lIIllllIIIIIlIII(final int llllllllllllIlIllllllllIlIlIlllI) {
            return llllllllllllIlIllllllllIlIlIlllI > 0;
        }
    }
}
