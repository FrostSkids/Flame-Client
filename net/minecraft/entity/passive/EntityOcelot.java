// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.entity.ai.EntityAITasks;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOcelotAttack;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIOcelotSit;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import java.util.Arrays;
import net.minecraft.util.StatCollector;
import net.minecraft.util.DamageSource;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIAvoidEntity;

public class EntityOcelot extends EntityTameable
{
    private static final /* synthetic */ String[] lIlIllIllIllll;
    private /* synthetic */ EntityAIAvoidEntity<EntityPlayer> avoidEntity;
    private /* synthetic */ EntityAITempt aiTempt;
    private static final /* synthetic */ int[] lIlIllIlllIlIl;
    
    private static void llllIIlIIllIIII() {
        (lIlIllIlllIlIl = new int[15])[0] = " ".length();
        EntityOcelot.lIlIllIlllIlIl[1] = "  ".length();
        EntityOcelot.lIlIllIlllIlIl[2] = "   ".length();
        EntityOcelot.lIlIllIlllIlIl[3] = (120 + 144 - 236 + 156 ^ 110 + 101 - 152 + 130);
        EntityOcelot.lIlIllIlllIlIl[4] = (144 + 29 - 125 + 118 ^ 51 + 21 + 76 + 12);
        EntityOcelot.lIlIllIlllIlIl[5] = (0x63 ^ 0x64);
        EntityOcelot.lIlIllIlllIlIl[6] = (0x8E ^ 0xB6 ^ (0x96 ^ 0xA6));
        EntityOcelot.lIlIllIlllIlIl[7] = (0x59 ^ 0x50);
        EntityOcelot.lIlIllIlllIlIl[8] = (0xCA ^ 0xC0);
        EntityOcelot.lIlIllIlllIlIl[9] = (0x19 ^ 0x12);
        EntityOcelot.lIlIllIlllIlIl[10] = ((0x63 ^ 0x43 ^ (0x2C ^ 0x1E)) & (0x48 ^ 0x71 ^ (0x68 ^ 0x43) ^ -" ".length()));
        EntityOcelot.lIlIllIlllIlIl[11] = (117 + 81 - 173 + 119 ^ 47 + 99 - 100 + 84);
        EntityOcelot.lIlIllIlllIlIl[12] = (-(0xFFFF9EDE & 0x71BF) & (0xFFFFD9FF & 0x3FFD));
        EntityOcelot.lIlIllIlllIlIl[13] = (0xAA ^ 0xB2 ^ (0x58 ^ 0x44));
        EntityOcelot.lIlIllIlllIlIl[14] = -(0xFFFFFDF5 & 0x5FCA);
    }
    
    private static boolean llllIIlIIlllIll(final int lllllllllllllIIIIllIIlIIlIlIlIIl, final int lllllllllllllIIIIllIIlIIlIlIlIII) {
        return lllllllllllllIIIIllIIlIIlIlIlIIl < lllllllllllllIIIIllIIlIIlIlIlIII;
    }
    
    private static boolean llllIIlIIllllII(final Object lllllllllllllIIIIllIIlIIlIlIIIIl, final Object lllllllllllllIIIIllIIlIIlIlIIIII) {
        return lllllllllllllIIIIllIIlIIlIlIIIIl != lllllllllllllIIIIllIIlIIlIlIIIII;
    }
    
    @Override
    public boolean interact(final EntityPlayer lllllllllllllIIIIllIIlIlIIlIlllI) {
        final ItemStack lllllllllllllIIIIllIIlIlIIlIllIl = lllllllllllllIIIIllIIlIlIIlIlllI.inventory.getCurrentItem();
        if (llllIIlIIllIIlI(this.isTamed() ? 1 : 0)) {
            if (llllIIlIIllIIlI(this.isOwner(lllllllllllllIIIIllIIlIlIIlIlllI) ? 1 : 0) && llllIIlIIllIIll(this.worldObj.isRemote ? 1 : 0) && llllIIlIIllIIll(this.isBreedingItem(lllllllllllllIIIIllIIlIlIIlIllIl) ? 1 : 0)) {
                final EntityAISit aiSit = this.aiSit;
                int sitting;
                if (llllIIlIIllIIlI(this.isSitting() ? 1 : 0)) {
                    sitting = EntityOcelot.lIlIllIlllIlIl[10];
                    "".length();
                    if (((16 + 90 - 91 + 216 ^ 139 + 13 - 118 + 145) & (29 + 47 - 12 + 85 ^ 76 + 111 - 68 + 74 ^ -" ".length())) > 0) {
                        return ((0xB7 ^ 0xC2 ^ (0x2D ^ 0xA)) & (0x5 ^ 0x18 ^ (0xCA ^ 0x85) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    sitting = EntityOcelot.lIlIllIlllIlIl[0];
                }
                aiSit.setSitting((boolean)(sitting != 0));
                "".length();
                if (-(0x7 ^ 0x2) >= 0) {
                    return ((0xF2 ^ 0xAC) & ~(0xF7 ^ 0xA9)) != 0x0;
                }
            }
        }
        else if (llllIIlIIllIIlI(this.aiTempt.isRunning() ? 1 : 0) && llllIIlIIllIlll(lllllllllllllIIIIllIIlIlIIlIllIl) && llllIIlIIlllIII(lllllllllllllIIIIllIIlIlIIlIllIl.getItem(), Items.fish) && llllIIlIIlllIIl(llllIIlIIllIlIl(lllllllllllllIIIIllIIlIlIIlIlllI.getDistanceSqToEntity(this), 9.0))) {
            if (llllIIlIIllIIll(lllllllllllllIIIIllIIlIlIIlIlllI.capabilities.isCreativeMode ? 1 : 0)) {
                final ItemStack itemStack = lllllllllllllIIIIllIIlIlIIlIllIl;
                itemStack.stackSize -= EntityOcelot.lIlIllIlllIlIl[0];
            }
            if (llllIIlIIlllIlI(lllllllllllllIIIIllIIlIlIIlIllIl.stackSize)) {
                lllllllllllllIIIIllIIlIlIIlIlllI.inventory.setInventorySlotContents(lllllllllllllIIIIllIIlIlIIlIlllI.inventory.currentItem, null);
            }
            if (llllIIlIIllIIll(this.worldObj.isRemote ? 1 : 0)) {
                if (llllIIlIIllIIll(this.rand.nextInt(EntityOcelot.lIlIllIlllIlIl[2]))) {
                    this.setTamed((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
                    this.setTameSkin(EntityOcelot.lIlIllIlllIlIl[0] + this.worldObj.rand.nextInt(EntityOcelot.lIlIllIlllIlIl[2]));
                    this.setOwnerId(lllllllllllllIIIIllIIlIlIIlIlllI.getUniqueID().toString());
                    this.playTameEffect((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
                    this.aiSit.setSitting((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
                    this.worldObj.setEntityState(this, (byte)EntityOcelot.lIlIllIlllIlIl[5]);
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0x70 ^ 0x17 ^ (0xEA ^ 0xAD)) & (0x44 ^ 0x6B ^ (0xB4 ^ 0xBB) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.playTameEffect((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
                    this.worldObj.setEntityState(this, (byte)EntityOcelot.lIlIllIlllIlIl[4]);
                }
            }
            return EntityOcelot.lIlIllIlllIlIl[0] != 0;
        }
        return super.interact(lllllllllllllIIIIllIIlIlIIlIlllI);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIIllIIlIlIlIIlllI) {
        super.readEntityFromNBT(lllllllllllllIIIIllIIlIlIlIIlllI);
        this.setTameSkin(lllllllllllllIIIIllIIlIlIlIIlllI.getInteger(EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[0]]));
    }
    
    private static boolean llllIIlIIllllIl(final Object lllllllllllllIIIIllIIlIIlIIllIII) {
        return lllllllllllllIIIIllIIlIIlIIllIII == null;
    }
    
    private static boolean llllIIlIIllIIll(final int lllllllllllllIIIIllIIlIIlIIlIlII) {
        return lllllllllllllIIIIllIIlIIlIIlIlII == 0;
    }
    
    @Override
    protected void setupTamedAI() {
        if (llllIIlIIllllIl(this.avoidEntity)) {
            this.avoidEntity = new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 16.0f, 0.8, 1.33);
        }
        this.tasks.removeTask(this.avoidEntity);
        if (llllIIlIIllIIll(this.isTamed() ? 1 : 0)) {
            this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[13], this.avoidEntity);
        }
    }
    
    @Override
    protected String getHurtSound() {
        return EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[4]];
    }
    
    public void updateAITasks() {
        if (llllIIlIIllIIlI(this.getMoveHelper().isUpdating() ? 1 : 0)) {
            final double lllllllllllllIIIIllIIlIlIllIIIll = this.getMoveHelper().getSpeed();
            if (llllIIlIIllIIll(llllIIlIIllIIIl(lllllllllllllIIIIllIIlIlIllIIIll, 0.6))) {
                this.setSneaking((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
                this.setSprinting((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
                "".length();
                if (-" ".length() >= ((0x61 ^ 0x36) & ~(0x67 ^ 0x30))) {
                    return;
                }
            }
            else if (llllIIlIIllIIll(llllIIlIIllIIIl(lllllllllllllIIIIllIIlIlIllIIIll, 1.33))) {
                this.setSneaking((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
                this.setSprinting((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
                "".length();
                if ((0xC ^ 0x46 ^ (0xCE ^ 0x81)) == 0x0) {
                    return;
                }
            }
            else {
                this.setSneaking((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
                this.setSprinting((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
                "".length();
                if ((0x2B ^ 0x2E) <= 0) {
                    return;
                }
            }
        }
        else {
            this.setSneaking((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
            this.setSprinting((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
        }
    }
    
    private static void llllIIlIIlIllIl() {
        (lIlIllIllIllll = new String[EntityOcelot.lIlIllIlllIlIl[7]])[EntityOcelot.lIlIllIlllIlIl[10]] = llllIIlIIIlllII("iilBi6qHqfU=", "FJhzf");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[0]] = llllIIlIIIllllI("ByApbiqZkwk=", "vDNYw");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[1]] = llllIIlIIIlllll("JjsEYQEqIEg/Fzkm", "KTfOb");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[2]] = llllIIlIIIllllI("BB4uZuPxSCwiN6prespJSA==", "epYSE");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[13]] = llllIIlIIIlllII("fU4zVscci1QR1pPWObn3Sw==", "KQDus");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[3]] = llllIIlIIIllllI("nug1XHaVILM=", "xgZkL");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[4]] = llllIIlIIIlllll("OCsoYiE0MGQkKyEw", "UDJLB");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[5]] = llllIIlIIIlllll("PgwpZCcyF2UiLScX", "ScKJD");
        EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[6]] = llllIIlIIIlllll("DDoSATUQeiUJNUc6BwUk", "iTfhA");
    }
    
    @Override
    public EntityOcelot createChild(final EntityAgeable lllllllllllllIIIIllIIlIlIIlIIllI) {
        final EntityOcelot lllllllllllllIIIIllIIlIlIIlIIlIl = new EntityOcelot(this.worldObj);
        if (llllIIlIIllIIlI(this.isTamed() ? 1 : 0)) {
            lllllllllllllIIIIllIIlIlIIlIIlIl.setOwnerId(this.getOwnerId());
            lllllllllllllIIIIllIIlIlIIlIIlIl.setTamed((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
            lllllllllllllIIIIllIIlIlIIlIIlIl.setTameSkin(this.getTameSkin());
        }
        return lllllllllllllIIIIllIIlIlIIlIIlIl;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (llllIIlIIllIIlI(this.worldObj.rand.nextInt(EntityOcelot.lIlIllIlllIlIl[2]))) {
            return EntityOcelot.lIlIllIlllIlIl[0] != 0;
        }
        return EntityOcelot.lIlIllIlllIlIl[10] != 0;
    }
    
    private static int llllIIlIIllIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected Item getDropItem() {
        return Items.leather;
    }
    
    @Override
    public boolean isNotColliding() {
        if (llllIIlIIllIIlI(this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this) ? 1 : 0) && llllIIlIIllIIlI(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && llllIIlIIllIIll(this.worldObj.isAnyLiquid(this.getEntityBoundingBox()) ? 1 : 0)) {
            final BlockPos lllllllllllllIIIIllIIlIlIIIIIlIl = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);
            if (llllIIlIIlllIll(lllllllllllllIIIIllIIlIlIIIIIlIl.getY(), this.worldObj.func_181545_F())) {
                return EntityOcelot.lIlIllIlllIlIl[10] != 0;
            }
            final Block lllllllllllllIIIIllIIlIlIIIIIlII = this.worldObj.getBlockState(lllllllllllllIIIIllIIlIlIIIIIlIl.down()).getBlock();
            if (!llllIIlIIllllII(lllllllllllllIIIIllIIlIlIIIIIlII, Blocks.grass) || llllIIlIIlllIII(lllllllllllllIIIIllIIlIlIIIIIlII.getMaterial(), Material.leaves)) {
                return EntityOcelot.lIlIllIlllIlIl[0] != 0;
            }
        }
        return EntityOcelot.lIlIllIlllIlIl[10] != 0;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[5]];
    }
    
    private static boolean llllIIlIIlllllI(final int lllllllllllllIIIIllIIlIIlIlIllIl, final int lllllllllllllIIIIllIIlIIlIlIllII) {
        return lllllllllllllIIIIllIIlIIlIlIllIl >= lllllllllllllIIIIllIIlIIlIlIllII;
    }
    
    private static String llllIIlIIIllllI(final String lllllllllllllIIIIllIIlIIllIllIlI, final String lllllllllllllIIIIllIIlIIllIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIlIIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIlIIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIlIIllIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIlIIllIlllII.init(EntityOcelot.lIlIllIlllIlIl[1], lllllllllllllIIIIllIIlIIllIlllIl);
            return new String(lllllllllllllIIIIllIIlIIllIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIlIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIlIIllIllIll) {
            lllllllllllllIIIIllIIlIIllIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void fall(final float lllllllllllllIIIIllIIlIlIlIllIIl, final float lllllllllllllIIIIllIIlIlIlIllIII) {
    }
    
    private static boolean llllIIlIIlllIlI(final int lllllllllllllIIIIllIIlIIlIIlIIII) {
        return lllllllllllllIIIIllIIlIIlIIlIIII <= 0;
    }
    
    @Override
    public boolean canMateWith(final EntityAnimal lllllllllllllIIIIllIIlIlIIIllIlI) {
        if (llllIIlIIlllIII(lllllllllllllIIIIllIIlIlIIIllIlI, this)) {
            return EntityOcelot.lIlIllIlllIlIl[10] != 0;
        }
        if (llllIIlIIllIIll(this.isTamed() ? 1 : 0)) {
            return EntityOcelot.lIlIllIlllIlIl[10] != 0;
        }
        if (llllIIlIIllIIll((lllllllllllllIIIIllIIlIlIIIllIlI instanceof EntityOcelot) ? 1 : 0)) {
            return EntityOcelot.lIlIllIlllIlIl[10] != 0;
        }
        final EntityOcelot lllllllllllllIIIIllIIlIlIIIllIIl = (EntityOcelot)lllllllllllllIIIIllIIlIlIIIllIlI;
        int n;
        if (llllIIlIIllIIll(lllllllllllllIIIIllIIlIlIIIllIIl.isTamed() ? 1 : 0)) {
            n = EntityOcelot.lIlIllIlllIlIl[10];
            "".length();
            if ("   ".length() < "  ".length()) {
                return ((0x7C ^ 0x73) & ~(0x7B ^ 0x74)) != 0x0;
            }
        }
        else if (llllIIlIIllIIlI(this.isInLove() ? 1 : 0) && llllIIlIIllIIlI(lllllllllllllIIIIllIIlIlIIIllIIl.isInLove() ? 1 : 0)) {
            n = EntityOcelot.lIlIllIlllIlIl[0];
            "".length();
            if (-" ".length() >= ((0x4F ^ 0xE) & ~(0x4D ^ 0xC))) {
                return ((0xEB ^ 0xAE) & ~(0x2C ^ 0x69)) != 0x0;
            }
        }
        else {
            n = EntityOcelot.lIlIllIlllIlIl[10];
        }
        return n != 0;
    }
    
    private static int llllIIlIIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setTameSkin(final int lllllllllllllIIIIllIIlIlIIIIllIl) {
        this.dataWatcher.updateObject(EntityOcelot.lIlIllIlllIlIl[11], (byte)lllllllllllllIIIIllIIlIlIIIIllIl);
    }
    
    @Override
    public void setTamed(final boolean lllllllllllllIIIIllIIlIIlllllIlI) {
        super.setTamed(lllllllllllllIIIIllIIlIIlllllIlI);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIIIllIIlIlIIllIlll, final float lllllllllllllIIIIllIIlIlIIlllIIl) {
        if (llllIIlIIllIIlI(this.isEntityInvulnerable(lllllllllllllIIIIllIIlIlIIllIlll) ? 1 : 0)) {
            return EntityOcelot.lIlIllIlllIlIl[10] != 0;
        }
        this.aiSit.setSitting((boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0));
        return super.attackEntityFrom(lllllllllllllIIIIllIIlIlIIllIlll, lllllllllllllIIIIllIIlIlIIlllIIl);
    }
    
    private static boolean llllIIlIIlllIII(final Object lllllllllllllIIIIllIIlIIlIIllIll, final Object lllllllllllllIIIIllIIlIIlIIllIlI) {
        return lllllllllllllIIIIllIIlIIlIIllIll == lllllllllllllIIIIllIIlIIlIIllIlI;
    }
    
    @Override
    protected boolean canDespawn() {
        if (llllIIlIIllIIll(this.isTamed() ? 1 : 0) && llllIIlIIllIlII(this.ticksExisted, EntityOcelot.lIlIllIlllIlIl[12])) {
            return EntityOcelot.lIlIllIlllIlIl[0] != 0;
        }
        return EntityOcelot.lIlIllIlllIlIl[10] != 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityOcelot.lIlIllIlllIlIl[11], (byte)EntityOcelot.lIlIllIlllIlIl[10]);
    }
    
    @Override
    public String getName() {
        String s;
        if (llllIIlIIllIIlI(this.hasCustomName() ? 1 : 0)) {
            s = this.getCustomNameTag();
            "".length();
            if ((0x17 ^ 0x13) > (0xB5 ^ 0xB1)) {
                return null;
            }
        }
        else if (llllIIlIIllIIlI(this.isTamed() ? 1 : 0)) {
            s = StatCollector.translateToLocal(EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[6]]);
            "".length();
            if ("  ".length() >= (117 + 57 - 96 + 49 ^ (0xE9 ^ 0x92))) {
                return null;
            }
        }
        else {
            s = super.getName();
        }
        return s;
    }
    
    private static String llllIIlIIIlllII(final String lllllllllllllIIIIllIIlIIllIIlIll, final String lllllllllllllIIIIllIIlIIllIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIlIIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIlIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), EntityOcelot.lIlIllIlllIlIl[6]), "DES");
            final Cipher lllllllllllllIIIIllIIlIIllIIllll = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIlIIllIIllll.init(EntityOcelot.lIlIllIlllIlIl[1], lllllllllllllIIIIllIIlIIllIlIIII);
            return new String(lllllllllllllIIIIllIIlIIllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIlIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIlIIllIIlllI) {
            lllllllllllllIIIIllIIlIIllIIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (llllIIlIIllIIlI(this.isTamed() ? 1 : 0)) {
            if (llllIIlIIllIIlI(this.isInLove() ? 1 : 0)) {
                s = EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[1]];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else if (llllIIlIIllIIll(this.rand.nextInt(EntityOcelot.lIlIllIlllIlIl[13]))) {
                s = EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[2]];
                "".length();
                if (-(0x0 ^ 0x5A ^ (0x2A ^ 0x74)) >= 0) {
                    return null;
                }
            }
            else {
                s = EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[13]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else {
            s = EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[3]];
        }
        return s;
    }
    
    public EntityOcelot(final World lllllllllllllIIIIllIIlIlIllIlIlI) {
        super(lllllllllllllIIIIllIIlIlIllIlIlI);
        this.setSize(0.6f, 0.7f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[0], new EntityAISwimming(this));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[1], this.aiSit);
        final EntityAITasks tasks = this.tasks;
        final int llllllllllllIlllIIllllIlIlIIIIll = EntityOcelot.lIlIllIlllIlIl[2];
        final EntityAITempt entityAITempt = new EntityAITempt(this, 0.6, Items.fish, (boolean)(EntityOcelot.lIlIllIlllIlIl[0] != 0));
        this.aiTempt = entityAITempt;
        tasks.addTask(llllllllllllIlllIIllllIlIlIIIIll, entityAITempt);
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[3], new EntityAIFollowOwner(this, 1.0, 10.0f, 5.0f));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[4], new EntityAIOcelotSit(this, 0.8));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[5], new EntityAILeapAtTarget(this, 0.3f));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[6], new EntityAIOcelotAttack(this));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[7], new EntityAIMate(this, 0.8));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[8], new EntityAIWander(this, 0.8));
        this.tasks.addTask(EntityOcelot.lIlIllIlllIlIl[9], new EntityAIWatchClosest(this, EntityPlayer.class, 10.0f));
        this.targetTasks.addTask(EntityOcelot.lIlIllIlllIlIl[0], new EntityAITargetNonTamed<Object>(this, EntityChicken.class, (boolean)(EntityOcelot.lIlIllIlllIlIl[10] != 0), null));
    }
    
    private static boolean llllIIlIIllIlll(final Object lllllllllllllIIIIllIIlIIlIIllllI) {
        return lllllllllllllIIIIllIIlIIlIIllllI != null;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIIllIIlIlIlIlIIlI) {
        super.writeEntityToNBT(lllllllllllllIIIIllIIlIlIlIlIIlI);
        lllllllllllllIIIIllIIlIlIlIlIIlI.setInteger(EntityOcelot.lIlIllIllIllll[EntityOcelot.lIlIllIlllIlIl[10]], this.getTameSkin());
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIIIllIIlIIlllIlllI, IEntityLivingData lllllllllllllIIIIllIIlIIlllIlIII) {
        lllllllllllllIIIIllIIlIIlllIlIII = super.onInitialSpawn(lllllllllllllIIIIllIIlIIlllIlllI, lllllllllllllIIIIllIIlIIlllIlIII);
        if (llllIIlIIllIIll(this.worldObj.rand.nextInt(EntityOcelot.lIlIllIlllIlIl[5]))) {
            int lllllllllllllIIIIllIIlIIlllIllII = EntityOcelot.lIlIllIlllIlIl[10];
            "".length();
            if (-(0x65 ^ 0x61) >= 0) {
                return null;
            }
            while (!llllIIlIIlllllI(lllllllllllllIIIIllIIlIIlllIllII, EntityOcelot.lIlIllIlllIlIl[1])) {
                final EntityOcelot lllllllllllllIIIIllIIlIIlllIlIll = new EntityOcelot(this.worldObj);
                lllllllllllllIIIIllIIlIIlllIlIll.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                lllllllllllllIIIIllIIlIIlllIlIll.setGrowingAge(EntityOcelot.lIlIllIlllIlIl[14]);
                this.worldObj.spawnEntityInWorld(lllllllllllllIIIIllIIlIIlllIlIll);
                "".length();
                ++lllllllllllllIIIIllIIlIIlllIllII;
            }
        }
        return lllllllllllllIIIIllIIlIIlllIlIII;
    }
    
    private static boolean llllIIlIIlllIIl(final int lllllllllllllIIIIllIIlIIlIIlIIlI) {
        return lllllllllllllIIIIllIIlIIlIIlIIlI < 0;
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack lllllllllllllIIIIllIIlIlIIlIIIII) {
        if (llllIIlIIllIlll(lllllllllllllIIIIllIIlIlIIlIIIII) && llllIIlIIlllIII(lllllllllllllIIIIllIIlIlIIlIIIII.getItem(), Items.fish)) {
            return EntityOcelot.lIlIllIlllIlIl[0] != 0;
        }
        return EntityOcelot.lIlIllIlllIlIl[10] != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    private static boolean llllIIlIIllIIlI(final int lllllllllllllIIIIllIIlIIlIIlIllI) {
        return lllllllllllllIIIIllIIlIIlIIlIllI != 0;
    }
    
    private static boolean llllIIlIIllIlII(final int lllllllllllllIIIIllIIlIIlIlIIlIl, final int lllllllllllllIIIIllIIlIIlIlIIlII) {
        return lllllllllllllIIIIllIIlIIlIlIIlIl > lllllllllllllIIIIllIIlIIlIlIIlII;
    }
    
    public int getTameSkin() {
        return this.dataWatcher.getWatchableObjectByte(EntityOcelot.lIlIllIlllIlIl[11]);
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIIIllIIlIlIIllIlII, final int lllllllllllllIIIIllIIlIlIIllIIll) {
    }
    
    private static String llllIIlIIIlllll(String lllllllllllllIIIIllIIlIIlIlllIII, final String lllllllllllllIIIIllIIlIIlIllIlll) {
        lllllllllllllIIIIllIIlIIlIlllIII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIIlIIlIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIlIIlIlllIll = new StringBuilder();
        final char[] lllllllllllllIIIIllIIlIIlIlllIlI = lllllllllllllIIIIllIIlIIlIllIlll.toCharArray();
        int lllllllllllllIIIIllIIlIIlIlllIIl = EntityOcelot.lIlIllIlllIlIl[10];
        final double lllllllllllllIIIIllIIlIIlIllIIll = (Object)((String)lllllllllllllIIIIllIIlIIlIlllIII).toCharArray();
        final short lllllllllllllIIIIllIIlIIlIllIIlI = (short)lllllllllllllIIIIllIIlIIlIllIIll.length;
        boolean lllllllllllllIIIIllIIlIIlIllIIIl = EntityOcelot.lIlIllIlllIlIl[10] != 0;
        while (llllIIlIIlllIll(lllllllllllllIIIIllIIlIIlIllIIIl ? 1 : 0, lllllllllllllIIIIllIIlIIlIllIIlI)) {
            final char lllllllllllllIIIIllIIlIIlIlllllI = lllllllllllllIIIIllIIlIIlIllIIll[lllllllllllllIIIIllIIlIIlIllIIIl];
            lllllllllllllIIIIllIIlIIlIlllIll.append((char)(lllllllllllllIIIIllIIlIIlIlllllI ^ lllllllllllllIIIIllIIlIIlIlllIlI[lllllllllllllIIIIllIIlIIlIlllIIl % lllllllllllllIIIIllIIlIIlIlllIlI.length]));
            "".length();
            ++lllllllllllllIIIIllIIlIIlIlllIIl;
            ++lllllllllllllIIIIllIIlIIlIllIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIlIIlIlllIll);
    }
    
    static {
        llllIIlIIllIIII();
        llllIIlIIlIllIl();
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIIIIllIIlIlIlIIIIIl) {
        return lllllllllllllIIIIllIIlIlIlIIIIIl.attackEntityFrom(DamageSource.causeMobDamage(this), 3.0f);
    }
}
