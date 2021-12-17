// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.EntityLivingBase;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.IRangedAttackMob;

public class EntitySnowman extends EntityGolem implements IRangedAttackMob
{
    private static final /* synthetic */ int[] lIIllIllllIlIl;
    private static final /* synthetic */ String[] lIIllIllllIlII;
    
    private static String llIllIlIIlIIIIl(final String lllllllllllllIIlIlIIlIIllIIIlIIl, final String lllllllllllllIIlIlIIlIIllIIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIIllIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), EntitySnowman.lIIllIllllIlIl[8]), "DES");
            final Cipher lllllllllllllIIlIlIIlIIllIIIllIl = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIlIIllIIIllIl.init(EntitySnowman.lIIllIllllIlIl[2], lllllllllllllIIlIlIIlIIllIIIlllI);
            return new String(lllllllllllllIIlIlIIlIIllIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIIllIIIllII) {
            lllllllllllllIIlIlIIlIIllIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIlIIlIlIll(final Object lllllllllllllIIlIlIIlIIlIlllllll, final Object lllllllllllllIIlIlIIlIIlIllllllI) {
        return lllllllllllllIIlIlIIlIIlIlllllll == lllllllllllllIIlIlIIlIIlIllllllI;
    }
    
    private static boolean llIllIlIIlIlIIl(final int lllllllllllllIIlIlIIlIIlIlllllII) {
        return lllllllllllllIIlIlIIlIIlIlllllII != 0;
    }
    
    private static boolean llIllIlIIlIllIl(final int lllllllllllllIIlIlIIlIIllIIIIIll, final int lllllllllllllIIlIlIIlIIllIIIIIlI) {
        return lllllllllllllIIlIlIIlIIllIIIIIll >= lllllllllllllIIlIlIIlIIllIIIIIlI;
    }
    
    private static boolean llIllIlIIlIlIII(final int lllllllllllllIIlIlIIlIIlIllllIlI) {
        return lllllllllllllIIlIlIIlIIlIllllIlI == 0;
    }
    
    public EntitySnowman(final World lllllllllllllIIlIlIIlIIlllIIlllI) {
        super(lllllllllllllIIlIlIIlIIlllIIlllI);
        this.setSize(0.7f, 1.9f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntitySnowman.lIIllIllllIlIl[0] != 0));
        this.tasks.addTask(EntitySnowman.lIIllIllllIlIl[0], new EntityAIArrowAttack(this, 1.25, EntitySnowman.lIIllIllllIlIl[1], 10.0f));
        this.tasks.addTask(EntitySnowman.lIIllIllllIlIl[2], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntitySnowman.lIIllIllllIlIl[3], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntitySnowman.lIIllIllllIlIl[4], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntitySnowman.lIIllIllllIlIl[0], new EntityAINearestAttackableTarget<Object>(this, EntityLiving.class, EntitySnowman.lIIllIllllIlIl[5], (boolean)(EntitySnowman.lIIllIllllIlIl[0] != 0), (boolean)(EntitySnowman.lIIllIllllIlIl[6] != 0), IMob.mobSelector));
    }
    
    private static boolean llIllIlIIlIllII(final int lllllllllllllIIlIlIIlIIlIllllIII) {
        return lllllllllllllIIlIlIIlIIlIllllIII < 0;
    }
    
    @Override
    public void attackEntityWithRangedAttack(final EntityLivingBase lllllllllllllIIlIlIIlIIllIIllIlI, final float lllllllllllllIIlIlIIlIIllIlIIIlI) {
        final EntitySnowball lllllllllllllIIlIlIIlIIllIlIIIIl = new EntitySnowball(this.worldObj, this);
        final double lllllllllllllIIlIlIIlIIllIlIIIII = lllllllllllllIIlIlIIlIIllIIllIlI.posY + lllllllllllllIIlIlIIlIIllIIllIlI.getEyeHeight() - 1.100000023841858;
        final double lllllllllllllIIlIlIIlIIllIIlllll = lllllllllllllIIlIlIIlIIllIIllIlI.posX - this.posX;
        final double lllllllllllllIIlIlIIlIIllIIllllI = lllllllllllllIIlIlIIlIIllIlIIIII - lllllllllllllIIlIlIIlIIllIlIIIIl.posY;
        final double lllllllllllllIIlIlIIlIIllIIlllIl = lllllllllllllIIlIlIIlIIllIIllIlI.posZ - this.posZ;
        final float lllllllllllllIIlIlIIlIIllIIlllII = MathHelper.sqrt_double(lllllllllllllIIlIlIIlIIllIIlllll * lllllllllllllIIlIlIIlIIllIIlllll + lllllllllllllIIlIlIIlIIllIIlllIl * lllllllllllllIIlIlIIlIIllIIlllIl) * 0.2f;
        lllllllllllllIIlIlIIlIIllIlIIIIl.setThrowableHeading(lllllllllllllIIlIlIIlIIllIIlllll, lllllllllllllIIlIlIIlIIllIIllllI + lllllllllllllIIlIlIIlIIllIIlllII, lllllllllllllIIlIlIIlIIllIIlllIl, 1.6f, 12.0f);
        this.playSound(EntitySnowman.lIIllIllllIlII[EntitySnowman.lIIllIllllIlIl[6]], 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
        this.worldObj.spawnEntityInWorld(lllllllllllllIIlIlIIlIIllIlIIIIl);
        "".length();
    }
    
    private static int llIllIlIIlIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public float getEyeHeight() {
        return 1.7f;
    }
    
    @Override
    protected Item getDropItem() {
        return Items.snowball;
    }
    
    private static void llIllIlIIlIIIll() {
        (lIIllIllllIlII = new String[EntitySnowman.lIIllIllllIlIl[0]])[EntitySnowman.lIIllIllllIlIl[6]] = llIllIlIIlIIIIl("34CXwDoRWRroqsFnkXPz5g==", "CCAQS");
    }
    
    private static boolean llIllIlIIlIlIlI(final int lllllllllllllIIlIlIIlIIlIlllIllI) {
        return lllllllllllllIIlIlIIlIIlIlllIllI > 0;
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIlIlIIlIIllIllIIll, final int lllllllllllllIIlIlIIlIIllIllIIlI) {
        final int lllllllllllllIIlIlIIlIIllIllIIIl = this.rand.nextInt(EntitySnowman.lIIllIllllIlIl[7]);
        int lllllllllllllIIlIlIIlIIllIllIIII = EntitySnowman.lIIllIllllIlIl[6];
        "".length();
        if (-" ".length() > (0x39 ^ 0x43 ^ (0x7F ^ 0x1))) {
            return;
        }
        while (!llIllIlIIlIllIl(lllllllllllllIIlIlIIlIIllIllIIII, lllllllllllllIIlIlIIlIIllIllIIIl)) {
            this.dropItem(Items.snowball, EntitySnowman.lIIllIllllIlIl[0]);
            "".length();
            ++lllllllllllllIIlIlIIlIIllIllIIII;
        }
    }
    
    private static int llIllIlIIlIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (llIllIlIIlIlIII(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIlIlIIlIIlllIIIIll = MathHelper.floor_double(this.posX);
            int lllllllllllllIIlIlIIlIIlllIIIIlI = MathHelper.floor_double(this.posY);
            int lllllllllllllIIlIlIIlIIlllIIIIIl = MathHelper.floor_double(this.posZ);
            if (llIllIlIIlIlIIl(this.isWet() ? 1 : 0)) {
                this.attackEntityFrom(DamageSource.drown, 1.0f);
                "".length();
            }
            if (llIllIlIIlIlIlI(llIllIlIIlIIllI(this.worldObj.getBiomeGenForCoords(new BlockPos(lllllllllllllIIlIlIIlIIlllIIIIll, EntitySnowman.lIIllIllllIlIl[6], lllllllllllllIIlIlIIlIIlllIIIIIl)).getFloatTemperature(new BlockPos(lllllllllllllIIlIlIIlIIlllIIIIll, lllllllllllllIIlIlIIlIIlllIIIIlI, lllllllllllllIIlIlIIlIIlllIIIIIl)), 1.0f))) {
                this.attackEntityFrom(DamageSource.onFire, 1.0f);
                "".length();
            }
            int lllllllllllllIIlIlIIlIIlllIIIIII = EntitySnowman.lIIllIllllIlIl[6];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllIlIIlIllIl(lllllllllllllIIlIlIIlIIlllIIIIII, EntitySnowman.lIIllIllllIlIl[4])) {
                lllllllllllllIIlIlIIlIIlllIIIIll = MathHelper.floor_double(this.posX + (lllllllllllllIIlIlIIlIIlllIIIIII % EntitySnowman.lIIllIllllIlIl[2] * EntitySnowman.lIIllIllllIlIl[2] - EntitySnowman.lIIllIllllIlIl[0]) * 0.25f);
                lllllllllllllIIlIlIIlIIlllIIIIlI = MathHelper.floor_double(this.posY);
                lllllllllllllIIlIlIIlIIlllIIIIIl = MathHelper.floor_double(this.posZ + (lllllllllllllIIlIlIIlIIlllIIIIII / EntitySnowman.lIIllIllllIlIl[2] % EntitySnowman.lIIllIllllIlIl[2] * EntitySnowman.lIIllIllllIlIl[2] - EntitySnowman.lIIllIllllIlIl[0]) * 0.25f);
                final BlockPos lllllllllllllIIlIlIIlIIllIllllll = new BlockPos(lllllllllllllIIlIlIIlIIlllIIIIll, lllllllllllllIIlIlIIlIIlllIIIIlI, lllllllllllllIIlIlIIlIIlllIIIIIl);
                if (llIllIlIIlIlIll(this.worldObj.getBlockState(lllllllllllllIIlIlIIlIIllIllllll).getBlock().getMaterial(), Material.air) && llIllIlIIlIllII(llIllIlIIlIIlll(this.worldObj.getBiomeGenForCoords(new BlockPos(lllllllllllllIIlIlIIlIIlllIIIIll, EntitySnowman.lIIllIllllIlIl[6], lllllllllllllIIlIlIIlIIlllIIIIIl)).getFloatTemperature(lllllllllllllIIlIlIIlIIllIllllll), 0.8f)) && llIllIlIIlIlIIl(Blocks.snow_layer.canPlaceBlockAt(this.worldObj, lllllllllllllIIlIlIIlIIllIllllll) ? 1 : 0)) {
                    this.worldObj.setBlockState(lllllllllllllIIlIlIIlIIllIllllll, Blocks.snow_layer.getDefaultState());
                    "".length();
                }
                ++lllllllllllllIIlIlIIlIIlllIIIIII;
            }
        }
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224);
    }
    
    private static void llIllIlIIlIIlIl() {
        (lIIllIllllIlIl = new int[9])[0] = " ".length();
        EntitySnowman.lIIllIllllIlIl[1] = (0x42 ^ 0x5E ^ (0x89 ^ 0x81));
        EntitySnowman.lIIllIllllIlIl[2] = "  ".length();
        EntitySnowman.lIIllIllllIlIl[3] = "   ".length();
        EntitySnowman.lIIllIllllIlIl[4] = (0xFC ^ 0xAA ^ (0xC0 ^ 0x92));
        EntitySnowman.lIIllIllllIlIl[5] = (0xBA ^ 0xB0);
        EntitySnowman.lIIllIllllIlIl[6] = ((100 + 96 - 125 + 56 ^ (0x2A ^ 0x75)) & (0x3 ^ 0x10 ^ (0x8B ^ 0xB8) ^ -" ".length()));
        EntitySnowman.lIIllIllllIlIl[7] = (0x76 ^ 0x66);
        EntitySnowman.lIIllIllllIlIl[8] = (0x28 ^ 0x21 ^ " ".length());
    }
    
    static {
        llIllIlIIlIIlIl();
        llIllIlIIlIIIll();
    }
}
