// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.player;

import java.util.Iterator;
import net.minecraft.scoreboard.Score;
import com.google.common.collect.Lists;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import java.util.Collection;
import com.google.common.base.Charsets;
import net.minecraft.world.LockCode;
import net.minecraft.entity.IMerchant;
import java.util.UUID;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.IChatComponent;
import java.util.List;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockDirectional;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.block.BlockBed;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Vec3;
import net.minecraft.item.EnumAction;
import net.minecraft.scoreboard.Team;
import net.minecraft.world.WorldSettings;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Potion;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemArmor;
import net.minecraft.world.IInteractionObject;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.util.EnumFacing;
import net.minecraft.stats.StatBase;
import net.minecraft.init.Blocks;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryEnderChest;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.FoodStats;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;

public abstract class EntityPlayer extends EntityLivingBase
{
    private /* synthetic */ int itemInUseCount;
    public /* synthetic */ double chasingPosY;
    public /* synthetic */ float renderOffsetX;
    private /* synthetic */ BlockPos spawnChunk;
    private /* synthetic */ boolean spawnForced;
    private /* synthetic */ int lastXPSound;
    public /* synthetic */ int experienceTotal;
    private /* synthetic */ int sleepTimer;
    protected /* synthetic */ FoodStats foodStats;
    protected /* synthetic */ float speedOnGround;
    private static final /* synthetic */ int[] llIlllIIIIIlII;
    public /* synthetic */ int experienceLevel;
    public /* synthetic */ int xpCooldown;
    public /* synthetic */ float prevCameraYaw;
    public /* synthetic */ double prevChasingPosZ;
    public /* synthetic */ PlayerCapabilities capabilities;
    private final /* synthetic */ GameProfile gameProfile;
    private /* synthetic */ InventoryEnderChest theInventoryEnderChest;
    protected /* synthetic */ float speedInAir;
    protected /* synthetic */ boolean sleeping;
    public /* synthetic */ double chasingPosZ;
    public /* synthetic */ Container openContainer;
    public /* synthetic */ float experience;
    public /* synthetic */ double prevChasingPosX;
    public /* synthetic */ Container inventoryContainer;
    protected /* synthetic */ int flyToggleTimer;
    private static final /* synthetic */ String[] llIlllIIIIIIll;
    private /* synthetic */ BlockPos startMinecartRidingCoordinate;
    public /* synthetic */ InventoryPlayer inventory;
    public /* synthetic */ double chasingPosX;
    public /* synthetic */ float cameraYaw;
    private /* synthetic */ int xpSeed;
    private /* synthetic */ ItemStack itemInUse;
    public /* synthetic */ double prevChasingPosY;
    public /* synthetic */ float renderOffsetZ;
    public /* synthetic */ BlockPos playerLocation;
    private /* synthetic */ boolean hasReducedDebug;
    
    private static String lIIllIIIllIIllIl(final String llllllllllllIllIIlIlIllIIlIIIIII, final String llllllllllllIllIIlIlIllIIIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIllIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIllIIIllllll.getBytes(StandardCharsets.UTF_8)), EntityPlayer.llIlllIIIIIlII[21]), "DES");
            final Cipher llllllllllllIllIIlIlIllIIlIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIlIllIIlIIIIlI.init(EntityPlayer.llIlllIIIIIlII[14], llllllllllllIllIIlIlIllIIlIIIIll);
            return new String(llllllllllllIllIIlIlIllIIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIllIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIllIIlIIIIIl) {
            llllllllllllIllIIlIlIllIIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIIIllIllIll() {
        (llIlllIIIIIlII = new int[60])[0] = ((0x9F ^ 0xB7) & ~(0x4B ^ 0x63));
        EntityPlayer.llIlllIIIIIlII[1] = " ".length();
        EntityPlayer.llIlllIIIIIlII[2] = (0x91 ^ 0xA6 ^ (0x8 ^ 0x2B));
        EntityPlayer.llIlllIIIIIlII[3] = (0x82 ^ 0x92);
        EntityPlayer.llIlllIIIIIlII[4] = (0xF6 ^ 0xB0 ^ (0xD1 ^ 0x86));
        EntityPlayer.llIlllIIIIIlII[5] = (0xB ^ 0x56 ^ (0x25 ^ 0x6A));
        EntityPlayer.llIlllIIIIIlII[6] = (79 + 0 + 48 + 35 ^ 95 + 104 - 131 + 100);
        EntityPlayer.llIlllIIIIIlII[7] = (0x87 ^ 0x9E);
        EntityPlayer.llIlllIIIIIlII[8] = (109 + 154 - 109 + 9 ^ 65 + 126 - 190 + 166);
        EntityPlayer.llIlllIIIIIlII[9] = (0x1 ^ 0x4);
        EntityPlayer.llIlllIIIIIlII[10] = (42 + 16 + 53 + 97 ^ 28 + 2 - 28 + 178);
        EntityPlayer.llIlllIIIIIlII[11] = (0xA0 ^ 0x88 ^ (0x36 ^ 0x70));
        EntityPlayer.llIlllIIIIIlII[12] = (-(0xFFFFFD15 & 0x2EEB) & (0xFFFFEFFF & 0x1C9FF7F));
        EntityPlayer.llIlllIIIIIlII[13] = (0x6F ^ 0x7A ^ (0x4B ^ 0xE));
        EntityPlayer.llIlllIIIIIlII[14] = "  ".length();
        EntityPlayer.llIlllIIIIIlII[15] = "   ".length();
        EntityPlayer.llIlllIIIIIlII[16] = (97 + 53 + 18 + 34 ^ 44 + 89 - 4 + 66);
        EntityPlayer.llIlllIIIIIlII[17] = (0x18 ^ 0xF);
        EntityPlayer.llIlllIIIIIlII[18] = (0x9D ^ 0x8B);
        EntityPlayer.llIlllIIIIIlII[19] = (0xB6 ^ 0x92 ^ (0x74 ^ 0x56));
        EntityPlayer.llIlllIIIIIlII[20] = (0x1 ^ 0x5 ^ "   ".length());
        EntityPlayer.llIlllIIIIIlII[21] = (31 + 3 + 95 + 39 ^ 63 + 8 + 39 + 50);
        EntityPlayer.llIlllIIIIIlII[22] = (0xAC ^ 0x8D ^ (0xB4 ^ 0xBD));
        EntityPlayer.llIlllIIIIIlII[23] = (0x21 ^ 0x2A);
        EntityPlayer.llIlllIIIIIlII[24] = (0x65 ^ 0x69);
        EntityPlayer.llIlllIIIIIlII[25] = (58 + 66 - 1 + 12 ^ 66 + 68 - 59 + 63);
        EntityPlayer.llIlllIIIIIlII[26] = (0xA7 ^ 0xA9);
        EntityPlayer.llIlllIIIIIlII[27] = (80 + 145 - 157 + 111 ^ 118 + 152 - 98 + 16);
        EntityPlayer.llIlllIIIIIlII[28] = (0xF ^ 0x51 ^ (0x9C ^ 0xA1));
        EntityPlayer.llIlllIIIIIlII[29] = (0x3C ^ 0x14 ^ (0x79 ^ 0x42));
        EntityPlayer.llIlllIIIIIlII[30] = (0x8F ^ 0x9A);
        EntityPlayer.llIlllIIIIIlII[31] = (0xD9 ^ 0xB1 ^ (0xFC ^ 0x8C));
        EntityPlayer.llIlllIIIIIlII[32] = (0x16 ^ 0xC);
        EntityPlayer.llIlllIIIIIlII[33] = (0x67 ^ 0x7C);
        EntityPlayer.llIlllIIIIIlII[34] = (0xA4 ^ 0xB8);
        EntityPlayer.llIlllIIIIIlII[35] = (0x5E ^ 0x43);
        EntityPlayer.llIlllIIIIIlII[36] = (79 + 17 - 81 + 171 ^ 81 + 87 - 133 + 129);
        EntityPlayer.llIlllIIIIIlII[37] = (0x22 ^ 0x3D);
        EntityPlayer.llIlllIIIIIlII[38] = (0x95 ^ 0xB5);
        EntityPlayer.llIlllIIIIIlII[39] = (0x44 ^ 0x65);
        EntityPlayer.llIlllIIIIIlII[40] = (0xF ^ 0x46 ^ (0x52 ^ 0x39));
        EntityPlayer.llIlllIIIIIlII[41] = (0x9E ^ 0xBD);
        EntityPlayer.llIlllIIIIIlII[42] = (0x17 ^ 0x5B ^ (0xC7 ^ 0xAF));
        EntityPlayer.llIlllIIIIIlII[43] = (108 + 101 - 87 + 22 ^ 47 + 150 - 155 + 139);
        EntityPlayer.llIlllIIIIIlII[44] = (222 + 49 - 113 + 72 ^ 88 + 25 - 106 + 185);
        EntityPlayer.llIlllIIIIIlII[45] = (0xA4 ^ 0x83);
        EntityPlayer.llIlllIIIIIlII[46] = (0x66 ^ 0x4F);
        EntityPlayer.llIlllIIIIIlII[47] = (0x32 ^ 0x15 ^ (0x20 ^ 0x2D));
        EntityPlayer.llIlllIIIIIlII[48] = (0x3B ^ 0x11 ^ " ".length());
        EntityPlayer.llIlllIIIIIlII[49] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        EntityPlayer.llIlllIIIIIlII[50] = (138 + 220 - 297 + 173 ^ 121 + 170 - 261 + 168);
        EntityPlayer.llIlllIIIIIlII[51] = (0x20 ^ 0x50);
        EntityPlayer.llIlllIIIIIlII[52] = (0x33 ^ 0x1E);
        EntityPlayer.llIlllIIIIIlII[53] = (0x4 ^ 0x32 ^ (0x77 ^ 0x6F));
        EntityPlayer.llIlllIIIIIlII[54] = (0xA4 ^ 0x8B);
        EntityPlayer.llIlllIIIIIlII[55] = (0x9D ^ 0xB8 ^ (0x8A ^ 0x9F));
        EntityPlayer.llIlllIIIIIlII[56] = (0x7E ^ 0x4F);
        EntityPlayer.llIlllIIIIIlII[57] = (0xC ^ 0x68 ^ (0xD6 ^ 0x80));
        EntityPlayer.llIlllIIIIIlII[58] = 152 + 190 - 334 + 192;
        EntityPlayer.llIlllIIIIIlII[59] = (5 + 24 - 15 + 161 ^ 90 + 78 - 146 + 134);
    }
    
    @Override
    protected void damageEntity(final DamageSource llllllllllllIllIIlIllIIIIllIllll, float llllllllllllIllIIlIllIIIIllIlIIl) {
        if (lIIllIIIllIllllI(this.isEntityInvulnerable(llllllllllllIllIIlIllIIIIllIllll) ? 1 : 0)) {
            if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIIIllIllll.isUnblockable() ? 1 : 0) && lIIllIIIllIlllII(this.isBlocking() ? 1 : 0) && lIIllIIIlllIIIll(lIIllIIIllllIIll(llllllllllllIllIIlIllIIIIllIlIIl, 0.0f))) {
                llllllllllllIllIIlIllIIIIllIlIIl = (1.0f + llllllllllllIllIIlIllIIIIllIlIIl) * 0.5f;
            }
            llllllllllllIllIIlIllIIIIllIlIIl = this.applyArmorCalculations(llllllllllllIllIIlIllIIIIllIllll, llllllllllllIllIIlIllIIIIllIlIIl);
            final float llllllllllllIllIIlIllIIIIllIllIl;
            llllllllllllIllIIlIllIIIIllIlIIl = (llllllllllllIllIIlIllIIIIllIllIl = this.applyPotionDamageCalculations(llllllllllllIllIIlIllIIIIllIllll, llllllllllllIllIIlIllIIIIllIlIIl));
            llllllllllllIllIIlIllIIIIllIlIIl = Math.max(llllllllllllIllIIlIllIIIIllIlIIl - this.getAbsorptionAmount(), 0.0f);
            this.setAbsorptionAmount(this.getAbsorptionAmount() - (llllllllllllIllIIlIllIIIIllIllIl - llllllllllllIllIIlIllIIIIllIlIIl));
            if (lIIllIIIllIlllII(lIIllIIIllllIIll(llllllllllllIllIIlIllIIIIllIlIIl, 0.0f))) {
                this.addExhaustion(llllllllllllIllIIlIllIIIIllIllll.getHungerDamage());
                final float llllllllllllIllIIlIllIIIIllIllII = this.getHealth();
                this.setHealth(this.getHealth() - llllllllllllIllIIlIllIIIIllIlIIl);
                this.getCombatTracker().trackDamage(llllllllllllIllIIlIllIIIIllIllll, llllllllllllIllIIlIllIIIIllIllII, llllllllllllIllIIlIllIIIIllIlIIl);
                if (lIIllIIIlllIIllI(lIIllIIIllllIlII(llllllllllllIllIIlIllIIIIllIlIIl, 3.4028235E37f))) {
                    this.addStat(StatList.damageTakenStat, Math.round(llllllllllllIllIIlIllIIIIllIlIIl * 10.0f));
                }
            }
        }
    }
    
    public void setReducedDebug(final boolean llllllllllllIllIIlIlIllIIllIIlII) {
        this.hasReducedDebug = llllllllllllIllIIlIlIllIIllIIlII;
    }
    
    private static int lIIllIIIllllIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private boolean isInBed() {
        if (lIIllIIIllIlllll(this.worldObj.getBlockState(this.playerLocation).getBlock(), Blocks.bed)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    public void triggerAchievement(final StatBase llllllllllllIllIIlIlIllllIlIIlII) {
        this.addStat(llllllllllllIllIIlIlIllllIlIIlII, EntityPlayer.llIlllIIIIIlII[1]);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = EntityPlayer.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIIllIIIllIlllIl($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final int llllllllllllIllIIlIlIllIIllIIIII = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.DOWN.ordinal()] = EntityPlayer.llIlllIIIIIlII[1];
            "".length();
            if ((0x2E ^ 0x2A) < "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.EAST.ordinal()] = EntityPlayer.llIlllIIIIIlII[19];
            "".length();
            if (((151 + 85 - 84 + 49 ^ 26 + 46 - 7 + 74) & (0xF ^ 0x5D ^ (0xD4 ^ 0xC4) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.NORTH.ordinal()] = EntityPlayer.llIlllIIIIIlII[15];
            "".length();
            if (-(0xC ^ 0x8) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.SOUTH.ordinal()] = EntityPlayer.llIlllIIIIIlII[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.UP.ordinal()] = EntityPlayer.llIlllIIIIIlII[14];
            "".length();
            if (((0x30 ^ 0x68 ^ (0x16 ^ 0x7E)) & (0xB7 ^ 0x83 ^ (0xC3 ^ 0xC7) ^ -" ".length())) > ((0x80 ^ 0x88 ^ (0xCA ^ 0x89)) & (0xAD ^ 0x8D ^ (0x1C ^ 0x77) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIIlIlIllIIllIIIII[EnumFacing.WEST.ordinal()] = EntityPlayer.llIlllIIIIIlII[9];
            "".length();
            if (((0x22 ^ 0x19 ^ (0x81 ^ 0x9B)) & (36 + 100 - 18 + 44 ^ 32 + 10 + 24 + 65 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return EntityPlayer.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllIIlIlIllIIllIIIII;
    }
    
    @Override
    protected String getFallSoundString(final int llllllllllllIllIIlIlIlllIlIIlllI) {
        String s;
        if (lIIllIIIlllIIlII(llllllllllllIllIIlIlIlllIlIIlllI, EntityPlayer.llIlllIIIIIlII[8])) {
            s = EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[47]];
            "".length();
            if (-(0x74 ^ 0x70) >= 0) {
                return null;
            }
        }
        else {
            s = EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[48]];
        }
        return s;
    }
    
    private static int lIIllIIIlllllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void fall(final float llllllllllllIllIIlIlIlllIlIlIllI, final float llllllllllllIllIIlIlIlllIlIlIlIl) {
        if (lIIllIIIllIllllI(this.capabilities.allowFlying ? 1 : 0)) {
            if (lIIllIIIlllIlllI(lIIllIIIlllllIlI(llllllllllllIllIIlIlIlllIlIlIllI, 2.0f))) {
                this.addStat(StatList.distanceFallenStat, (int)Math.round(llllllllllllIllIIlIlIlllIlIlIllI * 100.0));
            }
            super.fall(llllllllllllIllIIlIlIlllIlIlIllI, llllllllllllIllIIlIlIlllIlIlIlIl);
        }
    }
    
    public boolean canEat(final boolean llllllllllllIllIIlIlIlllIIIIllll) {
        if ((!lIIllIIIllIllllI(llllllllllllIllIIlIlIlllIIIIllll ? 1 : 0) || lIIllIIIllIlllII(this.foodStats.needFood() ? 1 : 0)) && lIIllIIIllIllllI(this.capabilities.disableDamage ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    private static boolean lIIllIIIlllIIlII(final int llllllllllllIllIIlIlIllIIIIllIll, final int llllllllllllIllIIlIlIllIIIIllIlI) {
        return llllllllllllIllIIlIlIllIIIIllIll > llllllllllllIllIIlIlIllIIIIllIlI;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllIIlIllIIIlIIlllII, float llllllllllllIllIIlIllIIIlIIllIll) {
        if (lIIllIIIllIlllII(this.isEntityInvulnerable(llllllllllllIllIIlIllIIIlIIlllII) ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        if (lIIllIIIllIlllII(this.capabilities.disableDamage ? 1 : 0) && lIIllIIIllIllllI(llllllllllllIllIIlIllIIIlIIlllII.canHarmInCreative() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        this.entityAge = EntityPlayer.llIlllIIIIIlII[0];
        if (lIIllIIIlllIllIl(lIIllIIIllllIIIl(this.getHealth(), 0.0f))) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        if (lIIllIIIllIlllII(this.isPlayerSleeping() ? 1 : 0) && lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            this.wakeUpPlayer((boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
        }
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlIIlllII.isDifficultyScaled() ? 1 : 0)) {
            if (lIIllIIIllIlllll(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
                llllllllllllIllIIlIllIIIlIIllIll = 0.0f;
            }
            if (lIIllIIIllIlllll(this.worldObj.getDifficulty(), EnumDifficulty.EASY)) {
                llllllllllllIllIIlIllIIIlIIllIll = llllllllllllIllIIlIllIIIlIIllIll / 2.0f + 1.0f;
            }
            if (lIIllIIIllIlllll(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                llllllllllllIllIIlIllIIIlIIllIll = llllllllllllIllIIlIllIIIlIIllIll * 3.0f / 2.0f;
            }
        }
        if (lIIllIIIllIllllI(lIIllIIIllllIIlI(llllllllllllIllIIlIllIIIlIIllIll, 0.0f))) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        Entity llllllllllllIllIIlIllIIIlIIllllI = llllllllllllIllIIlIllIIIlIIlllII.getEntity();
        if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIlIIllllI instanceof EntityArrow) ? 1 : 0) && lIIllIIIllIlllIl(((EntityArrow)llllllllllllIllIIlIllIIIlIIllllI).shootingEntity)) {
            llllllllllllIllIIlIllIIIlIIllllI = ((EntityArrow)llllllllllllIllIIlIllIIIlIIllllI).shootingEntity;
        }
        return super.attackEntityFrom(llllllllllllIllIIlIllIIIlIIlllII, llllllllllllIllIIlIllIIIlIIllIll);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[20]];
    }
    
    @Override
    public float getAbsorptionAmount() {
        return this.getDataWatcher().getWatchableObjectFloat(EntityPlayer.llIlllIIIIIlII[4]);
    }
    
    @Override
    public ItemStack getCurrentArmor(final int llllllllllllIllIIlIlIlllIIllllII) {
        return this.inventory.armorItemInSlot(llllllllllllIllIIlIlIlllIIllllII);
    }
    
    @Override
    public void onUpdate() {
        this.noClip = this.isSpectator();
        if (lIIllIIIllIlllII(this.isSpectator() ? 1 : 0)) {
            this.onGround = (EntityPlayer.llIlllIIIIIlII[0] != 0);
        }
        if (lIIllIIIllIlllIl(this.itemInUse)) {
            final ItemStack llllllllllllIllIIlIllIIlllIIIIll = this.inventory.getCurrentItem();
            if (lIIllIIIllIlllll(llllllllllllIllIIlIllIIlllIIIIll, this.itemInUse)) {
                if (lIIllIIIlllIIIlI(this.itemInUseCount, EntityPlayer.llIlllIIIIIlII[7]) && lIIllIIIllIllllI(this.itemInUseCount % EntityPlayer.llIlllIIIIIlII[8])) {
                    this.updateItemUse(llllllllllllIllIIlIllIIlllIIIIll, EntityPlayer.llIlllIIIIIlII[9]);
                }
                final int n = this.itemInUseCount - EntityPlayer.llIlllIIIIIlII[1];
                this.itemInUseCount = n;
                if (lIIllIIIllIllllI(n) && lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
                    this.onItemUseFinish();
                    "".length();
                    if (("   ".length() & ("   ".length() ^ -" ".length())) != ((0xC ^ 0x28 ^ (0x9D ^ 0xB4)) & (0x8F ^ 0x88 ^ (0x4F ^ 0x45) ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else {
                this.clearItemInUse();
            }
        }
        if (lIIllIIIlllIIIll(this.xpCooldown)) {
            this.xpCooldown -= EntityPlayer.llIlllIIIIIlII[1];
        }
        if (lIIllIIIllIlllII(this.isPlayerSleeping() ? 1 : 0)) {
            this.sleepTimer += EntityPlayer.llIlllIIIIIlII[1];
            if (lIIllIIIlllIIlII(this.sleepTimer, EntityPlayer.llIlllIIIIIlII[10])) {
                this.sleepTimer = EntityPlayer.llIlllIIIIIlII[10];
            }
            if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
                if (lIIllIIIllIllllI(this.isInBed() ? 1 : 0)) {
                    this.wakeUpPlayer((boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
                    "".length();
                    if (-(0xB ^ 0xF) > 0) {
                        return;
                    }
                }
                else if (lIIllIIIllIlllII(this.worldObj.isDaytime() ? 1 : 0)) {
                    this.wakeUpPlayer((boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0));
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
            }
        }
        else if (lIIllIIIlllIIIll(this.sleepTimer)) {
            this.sleepTimer += EntityPlayer.llIlllIIIIIlII[1];
            if (lIIllIIIlllIIlIl(this.sleepTimer, EntityPlayer.llIlllIIIIIlII[11])) {
                this.sleepTimer = EntityPlayer.llIlllIIIIIlII[0];
            }
        }
        super.onUpdate();
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0) && lIIllIIIllIlllIl(this.openContainer) && lIIllIIIllIllllI(this.openContainer.canInteractWith(this) ? 1 : 0)) {
            this.closeScreen();
            this.openContainer = this.inventoryContainer;
        }
        if (lIIllIIIllIlllII(this.isBurning() ? 1 : 0) && lIIllIIIllIlllII(this.capabilities.disableDamage ? 1 : 0)) {
            this.extinguish();
        }
        this.prevChasingPosX = this.chasingPosX;
        this.prevChasingPosY = this.chasingPosY;
        this.prevChasingPosZ = this.chasingPosZ;
        final double llllllllllllIllIIlIllIIlllIIIIlI = this.posX - this.chasingPosX;
        final double llllllllllllIllIIlIllIIlllIIIIIl = this.posY - this.chasingPosY;
        final double llllllllllllIllIIlIllIIlllIIIIII = this.posZ - this.chasingPosZ;
        final double llllllllllllIllIIlIllIIllIllllll = 10.0;
        if (lIIllIIIlllIIIll(lIIllIIIlllIIIII(llllllllllllIllIIlIllIIlllIIIIlI, llllllllllllIllIIlIllIIllIllllll))) {
            final double posX = this.posX;
            this.chasingPosX = posX;
            this.prevChasingPosX = posX;
        }
        if (lIIllIIIlllIIIll(lIIllIIIlllIIIII(llllllllllllIllIIlIllIIlllIIIIII, llllllllllllIllIIlIllIIllIllllll))) {
            final double posZ = this.posZ;
            this.chasingPosZ = posZ;
            this.prevChasingPosZ = posZ;
        }
        if (lIIllIIIlllIIIll(lIIllIIIlllIIIII(llllllllllllIllIIlIllIIlllIIIIIl, llllllllllllIllIIlIllIIllIllllll))) {
            final double posY = this.posY;
            this.chasingPosY = posY;
            this.prevChasingPosY = posY;
        }
        if (lIIllIIIlllIIllI(lIIllIIIlllIIIIl(llllllllllllIllIIlIllIIlllIIIIlI, -llllllllllllIllIIlIllIIllIllllll))) {
            final double posX2 = this.posX;
            this.chasingPosX = posX2;
            this.prevChasingPosX = posX2;
        }
        if (lIIllIIIlllIIllI(lIIllIIIlllIIIIl(llllllllllllIllIIlIllIIlllIIIIII, -llllllllllllIllIIlIllIIllIllllll))) {
            final double posZ2 = this.posZ;
            this.chasingPosZ = posZ2;
            this.prevChasingPosZ = posZ2;
        }
        if (lIIllIIIlllIIllI(lIIllIIIlllIIIIl(llllllllllllIllIIlIllIIlllIIIIIl, -llllllllllllIllIIlIllIIllIllllll))) {
            final double posY2 = this.posY;
            this.chasingPosY = posY2;
            this.prevChasingPosY = posY2;
        }
        this.chasingPosX += llllllllllllIllIIlIllIIlllIIIIlI * 0.25;
        this.chasingPosZ += llllllllllllIllIIlIllIIlllIIIIII * 0.25;
        this.chasingPosY += llllllllllllIllIIlIllIIlllIIIIIl * 0.25;
        if (lIIllIIIlllIIlll(this.ridingEntity)) {
            this.startMinecartRidingCoordinate = null;
        }
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            this.foodStats.onUpdate(this);
            this.triggerAchievement(StatList.minutesPlayedStat);
            if (lIIllIIIllIlllII(this.isEntityAlive() ? 1 : 0)) {
                this.triggerAchievement(StatList.timeSinceDeathStat);
            }
        }
        final int llllllllllllIllIIlIllIIllIlllllI = EntityPlayer.llIlllIIIIIlII[12];
        final double llllllllllllIllIIlIllIIllIllllIl = MathHelper.clamp_double(this.posX, -2.9999999E7, 2.9999999E7);
        final double llllllllllllIllIIlIllIIllIllllII = MathHelper.clamp_double(this.posZ, -2.9999999E7, 2.9999999E7);
        if (!lIIllIIIllIllllI(lIIllIIIlllIIIII(llllllllllllIllIIlIllIIllIllllIl, this.posX)) || lIIllIIIllIlllII(lIIllIIIlllIIIII(llllllllllllIllIIlIllIIllIllllII, this.posZ))) {
            this.setPosition(llllllllllllIllIIlIllIIllIllllIl, this.posY, llllllllllllIllIIlIllIIllIllllII);
        }
    }
    
    public boolean isAllowEdit() {
        return this.capabilities.allowEdit;
    }
    
    private static boolean lIIllIIIlllIllll(final int llllllllllllIllIIlIlIllIIIlIIIll, final int llllllllllllIllIIlIlIllIIIlIIIlI) {
        return llllllllllllIllIIlIlIllIIIlIIIll < llllllllllllIllIIlIlIllIIIlIIIlI;
    }
    
    private void addMountedMovementStat(final double llllllllllllIllIIlIlIlllIllIIIIl, final double llllllllllllIllIIlIlIlllIllIIIII, final double llllllllllllIllIIlIlIlllIlIlllll) {
        if (lIIllIIIllIlllIl(this.ridingEntity)) {
            final int llllllllllllIllIIlIlIlllIllIIIll = Math.round(MathHelper.sqrt_double(llllllllllllIllIIlIlIlllIllIIIIl * llllllllllllIllIIlIlIlllIllIIIIl + llllllllllllIllIIlIlIlllIllIIIII * llllllllllllIllIIlIlIlllIllIIIII + llllllllllllIllIIlIlIlllIlIlllll * llllllllllllIllIIlIlIlllIlIlllll) * 100.0f);
            if (lIIllIIIlllIIIll(llllllllllllIllIIlIlIlllIllIIIll)) {
                if (lIIllIIIllIlllII((this.ridingEntity instanceof EntityMinecart) ? 1 : 0)) {
                    this.addStat(StatList.distanceByMinecartStat, llllllllllllIllIIlIlIlllIllIIIll);
                    if (lIIllIIIlllIIlll(this.startMinecartRidingCoordinate)) {
                        this.startMinecartRidingCoordinate = new BlockPos(this);
                        "".length();
                        if ("   ".length() <= ((0x8D ^ 0x89) & ~(0x4A ^ 0x4E))) {
                            return;
                        }
                    }
                    else if (lIIllIIIlllIlllI(lIIllIIIlllllIIl(this.startMinecartRidingCoordinate.distanceSq(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)), 1000000.0))) {
                        this.triggerAchievement(AchievementList.onARail);
                        "".length();
                        if (((0x73 ^ 0x4E) & ~(0x9F ^ 0xA2)) != 0x0) {
                            return;
                        }
                    }
                }
                else if (lIIllIIIllIlllII((this.ridingEntity instanceof EntityBoat) ? 1 : 0)) {
                    this.addStat(StatList.distanceByBoatStat, llllllllllllIllIIlIlIlllIllIIIll);
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return;
                    }
                }
                else if (lIIllIIIllIlllII((this.ridingEntity instanceof EntityPig) ? 1 : 0)) {
                    this.addStat(StatList.distanceByPigStat, llllllllllllIllIIlIlIlllIllIIIll);
                    "".length();
                    if (((0x65 ^ 0x3D) & ~(0xD3 ^ 0x8B)) != 0x0) {
                        return;
                    }
                }
                else if (lIIllIIIllIlllII((this.ridingEntity instanceof EntityHorse) ? 1 : 0)) {
                    this.addStat(StatList.distanceByHorseStat, llllllllllllIllIIlIlIlllIllIIIll);
                }
            }
        }
    }
    
    private static boolean lIIllIIIlllIIlll(final Object llllllllllllIllIIlIlIllIIIIIlllI) {
        return llllllllllllIllIIlIlIllIIIIIlllI == null;
    }
    
    public void preparePlayerToSpawn() {
        this.setSize(0.6f, 1.8f);
        super.preparePlayerToSpawn();
        this.setHealth(this.getMaxHealth());
        this.deathTime = EntityPlayer.llIlllIIIIIlII[0];
    }
    
    private static int lIIllIIIlllllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void sendPlayerAbilities() {
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer llllllllllllIllIIlIlIllIlllIlIlI) {
        if (lIIllIIIllIlllII(this.worldObj.getGameRules().getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[52]]) ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0];
        }
        final int llllllllllllIllIIlIlIllIlllIlIIl = this.experienceLevel * EntityPlayer.llIlllIIIIIlII[20];
        int n;
        if (lIIllIIIlllIIlII(llllllllllllIllIIlIlIllIlllIlIIl, EntityPlayer.llIlllIIIIIlII[10])) {
            n = EntityPlayer.llIlllIIIIIlII[10];
            "".length();
            if (-" ".length() >= ((0x7F ^ 0x49) & ~(0x57 ^ 0x61))) {
                return (0x57 ^ 0x6D) & ~(0x3A ^ 0x0);
            }
        }
        else {
            n = llllllllllllIllIIlIlIllIlllIlIIl;
        }
        return n;
    }
    
    @Override
    public void setCurrentItemOrArmor(final int llllllllllllIllIIlIlIllIllIIIIlI, final ItemStack llllllllllllIllIIlIlIllIlIlllllI) {
        this.inventory.armorInventory[llllllllllllIllIIlIlIllIllIIIIlI] = llllllllllllIllIIlIlIllIlIlllllI;
    }
    
    public Scoreboard getWorldScoreboard() {
        return this.worldObj.getScoreboard();
    }
    
    public EntityItem dropPlayerItemWithRandomChoice(final ItemStack llllllllllllIllIIlIllIIIllllIlII, final boolean llllllllllllIllIIlIllIIIllllIIll) {
        return this.dropItem(llllllllllllIllIIlIllIIIllllIlII, (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
    }
    
    public void displayGui(final IInteractionObject llllllllllllIllIIlIllIIIIlIllIlI) {
    }
    
    public boolean isUser() {
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    @Override
    public boolean replaceItemInInventory(final int llllllllllllIllIIlIlIllIIlllIlII, final ItemStack llllllllllllIllIIlIlIllIIlllIIll) {
        if (lIIllIIIlllIlllI(llllllllllllIllIIlIlIllIIlllIlII) && lIIllIIIlllIllll(llllllllllllIllIIlIlIllIIlllIlII, this.inventory.mainInventory.length)) {
            this.inventory.setInventorySlotContents(llllllllllllIllIIlIlIllIIlllIlII, llllllllllllIllIIlIlIllIIlllIIll);
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        final int llllllllllllIllIIlIlIllIIlllIIlI = llllllllllllIllIIlIlIllIIlllIlII - EntityPlayer.llIlllIIIIIlII[10];
        if (lIIllIIIlllIlllI(llllllllllllIllIIlIlIllIIlllIIlI) && lIIllIIIlllIllll(llllllllllllIllIIlIlIllIIlllIIlI, this.inventory.armorInventory.length)) {
            final int llllllllllllIllIIlIlIllIIlllIIIl = llllllllllllIllIIlIlIllIIlllIIlI + EntityPlayer.llIlllIIIIIlII[1];
            if (lIIllIIIllIlllIl(llllllllllllIllIIlIlIllIIlllIIll) && lIIllIIIllIlllIl(llllllllllllIllIIlIlIllIIlllIIll.getItem())) {
                if (lIIllIIIllIlllII((llllllllllllIllIIlIlIllIIlllIIll.getItem() instanceof ItemArmor) ? 1 : 0)) {
                    if (lIIllIIIlllIlIII(EntityLiving.getArmorPosition(llllllllllllIllIIlIlIllIIlllIIll), llllllllllllIllIIlIlIllIIlllIIIl)) {
                        return EntityPlayer.llIlllIIIIIlII[0] != 0;
                    }
                }
                else if (!lIIllIIIlllIlIIl(llllllllllllIllIIlIlIllIIlllIIIl, EntityPlayer.llIlllIIIIIlII[8]) || (lIIllIIIllllIlll(llllllllllllIllIIlIlIllIIlllIIll.getItem(), Items.skull) && lIIllIIIllIllllI((llllllllllllIllIIlIlIllIIlllIIll.getItem() instanceof ItemBlock) ? 1 : 0))) {
                    return EntityPlayer.llIlllIIIIIlII[0] != 0;
                }
            }
            this.inventory.setInventorySlotContents(llllllllllllIllIIlIlIllIIlllIIlI + this.inventory.mainInventory.length, llllllllllllIllIIlIlIllIIlllIIll);
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        final int llllllllllllIllIIlIlIllIIlllIIII = llllllllllllIllIIlIlIllIIlllIlII - EntityPlayer.llIlllIIIIIlII[58];
        if (lIIllIIIlllIlllI(llllllllllllIllIIlIlIllIIlllIIII) && lIIllIIIlllIllll(llllllllllllIllIIlIlIllIIlllIIII, this.theInventoryEnderChest.getSizeInventory())) {
            this.theInventoryEnderChest.setInventorySlotContents(llllllllllllIllIIlIlIllIIlllIIII, llllllllllllIllIIlIlIllIIlllIIll);
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    private static String lIIllIIIllIIllII(String llllllllllllIllIIlIlIllIIlIlIIII, final String llllllllllllIllIIlIlIllIIlIIllll) {
        llllllllllllIllIIlIlIllIIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIlIlIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIlIllIIlIlIIll = new StringBuilder();
        final char[] llllllllllllIllIIlIlIllIIlIlIIlI = llllllllllllIllIIlIlIllIIlIIllll.toCharArray();
        int llllllllllllIllIIlIlIllIIlIlIIIl = EntityPlayer.llIlllIIIIIlII[0];
        final char llllllllllllIllIIlIlIllIIlIIlIll = (Object)llllllllllllIllIIlIlIllIIlIlIIII.toCharArray();
        final float llllllllllllIllIIlIlIllIIlIIlIlI = llllllllllllIllIIlIlIllIIlIIlIll.length;
        long llllllllllllIllIIlIlIllIIlIIlIIl = EntityPlayer.llIlllIIIIIlII[0];
        while (lIIllIIIlllIllll((int)llllllllllllIllIIlIlIllIIlIIlIIl, (int)llllllllllllIllIIlIlIllIIlIIlIlI)) {
            final char llllllllllllIllIIlIlIllIIlIlIllI = llllllllllllIllIIlIlIllIIlIIlIll[llllllllllllIllIIlIlIllIIlIIlIIl];
            llllllllllllIllIIlIlIllIIlIlIIll.append((char)(llllllllllllIllIIlIlIllIIlIlIllI ^ llllllllllllIllIIlIlIllIIlIlIIlI[llllllllllllIllIIlIlIllIIlIlIIIl % llllllllllllIllIIlIlIllIIlIlIIlI.length]));
            "".length();
            ++llllllllllllIllIIlIlIllIIlIlIIIl;
            ++llllllllllllIllIIlIlIllIIlIIlIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIlIllIIlIlIIll);
    }
    
    public void onCriticalHit(final Entity llllllllllllIllIIlIllIIIIIIlIllI) {
    }
    
    public float getToolDigEfficiency(final Block llllllllllllIllIIlIllIIIllIIIlII) {
        float llllllllllllIllIIlIllIIIllIIlIIl = this.inventory.getStrVsBlock(llllllllllllIllIIlIllIIIllIIIlII);
        if (lIIllIIIlllIIIll(lIIllIIIllllIIII(llllllllllllIllIIlIllIIIllIIlIIl, 1.0f))) {
            final int llllllllllllIllIIlIllIIIllIIlIII = EnchantmentHelper.getEfficiencyModifier(this);
            final ItemStack llllllllllllIllIIlIllIIIllIIIlll = this.inventory.getCurrentItem();
            if (lIIllIIIlllIIIll(llllllllllllIllIIlIllIIIllIIlIII) && lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIllIIIlll)) {
                llllllllllllIllIIlIllIIIllIIlIIl += llllllllllllIllIIlIllIIIllIIlIII * llllllllllllIllIIlIllIIIllIIlIII + EntityPlayer.llIlllIIIIIlII[1];
            }
        }
        if (lIIllIIIllIlllII(this.isPotionActive(Potion.digSpeed) ? 1 : 0)) {
            llllllllllllIllIIlIllIIIllIIlIIl *= 1.0f + (this.getActivePotionEffect(Potion.digSpeed).getAmplifier() + EntityPlayer.llIlllIIIIIlII[1]) * 0.2f;
        }
        if (lIIllIIIllIlllII(this.isPotionActive(Potion.digSlowdown) ? 1 : 0)) {
            float llllllllllllIllIIlIllIIIllIIIllI = 1.0f;
            switch (this.getActivePotionEffect(Potion.digSlowdown).getAmplifier()) {
                case 0: {
                    llllllllllllIllIIlIllIIIllIIIllI = 0.3f;
                    "".length();
                    if (((0xB2 ^ 0xA8) & ~(0x5B ^ 0x41)) != 0x0) {
                        return 0.0f;
                    }
                    break;
                }
                case 1: {
                    llllllllllllIllIIlIllIIIllIIIllI = 0.09f;
                    "".length();
                    if (((0x53 ^ 0x4) & ~(0x29 ^ 0x7E)) != 0x0) {
                        return 0.0f;
                    }
                    break;
                }
                case 2: {
                    llllllllllllIllIIlIllIIIllIIIllI = 0.0027f;
                    "".length();
                    if ((" ".length() & ~" ".length()) != 0x0) {
                        return 0.0f;
                    }
                    break;
                }
                default: {
                    llllllllllllIllIIlIllIIIllIIIllI = 8.1E-4f;
                    break;
                }
            }
            llllllllllllIllIIlIllIIIllIIlIIl *= llllllllllllIllIIlIllIIIllIIIllI;
        }
        if (lIIllIIIllIlllII(this.isInsideOfMaterial(Material.water) ? 1 : 0) && lIIllIIIllIllllI(EnchantmentHelper.getAquaAffinityModifier(this) ? 1 : 0)) {
            llllllllllllIllIIlIllIIIllIIlIIl /= 5.0f;
        }
        if (lIIllIIIllIllllI(this.onGround ? 1 : 0)) {
            llllllllllllIllIIlIllIIIllIIlIIl /= 5.0f;
        }
        return llllllllllllIllIIlIllIIIllIIlIIl;
    }
    
    @Override
    public boolean isPushedByWater() {
        int n;
        if (lIIllIIIllIlllII(this.capabilities.isFlying ? 1 : 0)) {
            n = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (null != null) {
                return ((0x1B ^ 0x5E) & ~(0x7B ^ 0x3E)) != 0x0;
            }
        }
        else {
            n = EntityPlayer.llIlllIIIIIlII[1];
        }
        return n != 0;
    }
    
    public int getXPSeed() {
        return this.xpSeed;
    }
    
    public void openEditCommandBlock(final CommandBlockLogic llllllllllllIllIIlIllIIIIllIIIll) {
    }
    
    private static boolean lIIllIIIllIllllI(final int llllllllllllIllIIlIlIllIIIIIlIlI) {
        return llllllllllllIllIIlIlIllIIIIIlIlI == 0;
    }
    
    private static boolean lIIllIIIllIlllII(final int llllllllllllIllIIlIlIllIIIIIllII) {
        return llllllllllllIllIIlIlIllIIIIIllII != 0;
    }
    
    public void setSpawnPoint(final BlockPos llllllllllllIllIIlIlIllllIlIllII, final boolean llllllllllllIllIIlIlIllllIlIlIII) {
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIlIllllIlIllII)) {
            this.spawnChunk = llllllllllllIllIIlIlIllllIlIllII;
            this.spawnForced = llllllllllllIllIIlIlIllllIlIlIII;
            "".length();
            if (" ".length() < ((153 + 22 - 40 + 19 ^ 35 + 54 - 0 + 42) & (0x4A ^ 0x33 ^ (0xD8 ^ 0xB8) ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.spawnChunk = null;
            this.spawnForced = (EntityPlayer.llIlllIIIIIlII[0] != 0);
        }
    }
    
    @Override
    protected String getDeathSound() {
        return EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[21]];
    }
    
    @Override
    public void setDead() {
        super.setDead();
        this.inventoryContainer.onContainerClosed(this);
        if (lIIllIIIllIlllIl(this.openContainer)) {
            this.openContainer.onContainerClosed(this);
        }
    }
    
    @Override
    public int getMaxInPortalTime() {
        int n;
        if (lIIllIIIllIlllII(this.capabilities.disableDamage ? 1 : 0)) {
            n = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (-(0x69 ^ 0x6D) > 0) {
                return (0xB9 ^ 0x9F) & ~(0x6E ^ 0x48);
            }
        }
        else {
            n = EntityPlayer.llIlllIIIIIlII[13];
        }
        return n;
    }
    
    private static void lIIllIIIllIlIIII() {
        (llIlllIIIIIIll = new String[EntityPlayer.llIlllIIIIIlII[59]])[EntityPlayer.llIlllIIIIIlII[0]] = lIIllIIIllIIllII("MDAVKlknPRk2EiV/CzgeOg==", "WQxOw");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[1]] = lIIllIIIllIIllIl("H3A7jE/VIQRC1Yi6tnU0k/Kb5zuHHFFS", "LAiMA");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[14]] = lIIllIIIllIIllIl("XhO39fjCbnO4j9H6zz3/YQ==", "QFryx");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[15]] = lIIllIIIllIIllIl("0OxS9GflqaVOvgcTE5ayOA==", "rjmJS");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[8]] = lIIllIIIllIIllll("/Hh7XIxZh5rEBYMg0TiNYTngNcUSiyyA", "MrVKr");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[9]] = lIIllIIIllIIllll("VnbC4VCFU1U=", "nNsQR");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[19]] = lIIllIIIllIIllll("dLBtRFo4SFUffR2yE8RHwA==", "yNMlC");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[20]] = lIIllIIIllIIllIl("xCUMwoHJ4rcFmnuC+o49S7bUnMgMdzW7", "PpFce");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[21]] = lIIllIIIllIIllll("R1bPMyeEa0VfAmdPo8nmzw==", "eSLIu");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[16]] = lIIllIIIllIIllIl("bHYhIDXKPl7mhfzQYvIaEg==", "UHLEj");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[6]] = lIIllIIIllIIllII("FykqCTkwKSIlLiEhFQA1MA==", "DLFlZ");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[23]] = lIIllIIIllIIllIl("agqKK/0akObHf+BcOOCJYw==", "cHxvf");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[24]] = lIIllIIIllIIllIl("BsgVdsOrO14DgcCwU7vkvQ==", "KPGAV");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[25]] = lIIllIIIllIIllll("qxlD4LKeETw=", "sCNbp");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[26]] = lIIllIIIllIIllII("OTMrBAcELw==", "aCgaq");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[27]] = lIIllIIIllIIllll("lhsqiAKR2gI=", "NfsDO");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[3]] = lIIllIIIllIIllll("ScwIRf1c+Rk=", "aYyPt");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[4]] = lIIllIIIllIIllII("Hik1ES8=", "MJZcJ");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[5]] = lIIllIIIllIIllIl("uSM3eq92bsU=", "fyUvX");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[29]] = lIIllIIIllIIllIl("ERrO2RTkvx0=", "IpUtA");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[2]] = lIIllIIIllIIllIl("Ok7TS1iNX8Y=", "GTVpB");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[30]] = lIIllIIIllIIllIl("RqZrFaf2g+4=", "BMIXz");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[18]] = lIIllIIIllIIllll("Zy2hCKDoQTY=", "dPAsB");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[17]] = lIIllIIIllIIllll("E9SzU/OHCJs=", "icPcZ");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[31]] = lIIllIIIllIIllIl("IHUlhjdj5SrB0YY5cCyG9A==", "mEVBi");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[7]] = lIIllIIIllIIllIl("M8i0izEmcTk52hsfy+I3Pg==", "PUUzh");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[32]] = lIIllIIIllIIllIl("7cY/qoPkOmKUh67yMZco4w==", "mMWMN");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[33]] = lIIllIIIllIIllIl("Mq1Qx1mnnkhKC08Qts9q4g==", "wOLzM");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[34]] = lIIllIIIllIIllII("BQwNACsiDAUsPDMEMgknIg==", "ViaeH");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[35]] = lIIllIIIllIIllII("FgULHB0sBwk=", "Einym");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[36]] = lIIllIIIllIIllll("GWrClZfq3B81mb+cctteEg==", "fpnhl");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[37]] = lIIllIIIllIIllII("GRwk", "AltGs");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[38]] = lIIllIIIllIIllII("PxcmKC4CCw==", "ggjMX");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[39]] = lIIllIIIllIIllll("0AV4Cs4Sa3s=", "CDhzL");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[40]] = lIIllIIIllIIllIl("mAAe2qFVbfk=", "laBLZ");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[41]] = lIIllIIIllIIllll("k1ecjKVn9os=", "ofzzD");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[42]] = lIIllIIIllIIllIl("wqD/Z58Sjrk=", "YBhop");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[43]] = lIIllIIIllIIllII("KjgDBQAg", "yHbrn");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[44]] = lIIllIIIllIIllIl("uDhn0E/gdXE=", "nIjRq");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[45]] = lIIllIIIllIIllll("GjThhZUhj0WeggTvhx9lEw==", "RyWKP");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[22]] = lIIllIIIllIIllll("suw2+dYQo1iseDocI5gRuw==", "POkqD");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[46]] = lIIllIIIllIIllIl("qZbsP/IbLu2mzeL0l5eGNQ==", "ETgzu");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[47]] = lIIllIIIllIIllII("FhAaC20BHRYXJgNfHxsxBV8RDy8dXxUHJA==", "qqwnC");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[48]] = lIIllIIIllIIllII("KCs1BEY/JjkYDT1kMBQaO2Q+AAQjZCsMCSMm", "OJXah");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[50]] = lIIllIIIllIIllII("NSUXCAYqahUJHyIoDBw=", "GDyli");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[52]] = lIIllIIIllIIllIl("SvVrfnbPrssodrM9iALHOQ==", "HFvOF");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[53]] = lIIllIIIllIIllII("HQQLHjwYFwsAARkTFw==", "vannu");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[54]] = lIIllIIIllIIllII("aikRCUE=", "EDbna");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[55]] = lIIllIIIllIIllII("UA==", "pBBcs");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[56]] = lIIllIIIllIIllIl("H84j7wmYj+v8EeRru65bpA==", "mLXWh");
        EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[57]] = lIIllIIIllIIllIl("VwFzPEWAu0vnZ49xlrVyrUNb33cgZk+E", "cfcPN");
    }
    
    public void attackTargetEntityWithCurrentItem(final Entity llllllllllllIllIIlIllIIIIIlIIlIl) {
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIlIIlIl.canAttackWithItem() ? 1 : 0) && lIIllIIIllIllllI(llllllllllllIllIIlIllIIIIIlIIlIl.hitByEntity(this) ? 1 : 0)) {
            float llllllllllllIllIIlIllIIIIIllIIll = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
            int llllllllllllIllIIlIllIIIIIllIIlI = EntityPlayer.llIlllIIIIIlII[0];
            float llllllllllllIllIIlIllIIIIIllIIIl = 0.0f;
            this.onCriticalHit(llllllllllllIllIIlIllIIIIIlIIlIl);
            this.onEnchantmentCritical(llllllllllllIllIIlIllIIIIIlIIlIl);
            if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                llllllllllllIllIIlIllIIIIIllIIIl = EnchantmentHelper.func_152377_a(this.getHeldItem(), ((EntityLivingBase)llllllllllllIllIIlIllIIIIIlIIlIl).getCreatureAttribute());
                "".length();
                if ((0x11 ^ 0x59 ^ (0x2E ^ 0x62)) < "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlIllIIIIIllIIIl = EnchantmentHelper.func_152377_a(this.getHeldItem(), EnumCreatureAttribute.UNDEFINED);
            }
            llllllllllllIllIIlIllIIIIIllIIlI += EnchantmentHelper.getKnockbackModifier(this);
            if (lIIllIIIllIlllII(this.isSprinting() ? 1 : 0)) {
                ++llllllllllllIllIIlIllIIIIIllIIlI;
            }
            if (!lIIllIIIlllIllIl(lIIllIIIllllIlIl(llllllllllllIllIIlIllIIIIIllIIll, 0.0f)) || lIIllIIIlllIIIll(lIIllIIIllllIlIl(llllllllllllIllIIlIllIIIIIllIIIl, 0.0f))) {
                int n;
                if (lIIllIIIlllIIIll(lIIllIIIllllIlIl(this.fallDistance, 0.0f)) && lIIllIIIllIllllI(this.onGround ? 1 : 0) && lIIllIIIllIllllI(this.isOnLadder() ? 1 : 0) && lIIllIIIllIllllI(this.isInWater() ? 1 : 0) && lIIllIIIllIllllI(this.isPotionActive(Potion.blindness) ? 1 : 0) && lIIllIIIlllIIlll(this.ridingEntity) && lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                    n = EntityPlayer.llIlllIIIIIlII[1];
                    "".length();
                    if ((143 + 180 - 271 + 147 ^ 16 + 79 + 10 + 90) != (0x37 ^ 0x30 ^ "   ".length())) {
                        return;
                    }
                }
                else {
                    n = EntityPlayer.llIlllIIIIIlII[0];
                }
                final boolean llllllllllllIllIIlIllIIIIIllIIII = n != 0;
                if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIllIIII ? 1 : 0) && lIIllIIIlllIIIll(lIIllIIIllllIlIl(llllllllllllIllIIlIllIIIIIllIIll, 0.0f))) {
                    llllllllllllIllIIlIllIIIIIllIIll *= 1.5f;
                }
                llllllllllllIllIIlIllIIIIIllIIll += llllllllllllIllIIlIllIIIIIllIIIl;
                boolean llllllllllllIllIIlIllIIIIIlIllll = EntityPlayer.llIlllIIIIIlII[0] != 0;
                final int llllllllllllIllIIlIllIIIIIlIlllI = EnchantmentHelper.getFireAspectModifier(this);
                if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityLivingBase) ? 1 : 0) && lIIllIIIlllIIIll(llllllllllllIllIIlIllIIIIIlIlllI) && lIIllIIIllIllllI(llllllllllllIllIIlIllIIIIIlIIlIl.isBurning() ? 1 : 0)) {
                    llllllllllllIllIIlIllIIIIIlIllll = (EntityPlayer.llIlllIIIIIlII[1] != 0);
                    llllllllllllIllIIlIllIIIIIlIIlIl.setFire(EntityPlayer.llIlllIIIIIlII[1]);
                }
                final double llllllllllllIllIIlIllIIIIIlIllIl = llllllllllllIllIIlIllIIIIIlIIlIl.motionX;
                final double llllllllllllIllIIlIllIIIIIlIllII = llllllllllllIllIIlIllIIIIIlIIlIl.motionY;
                final double llllllllllllIllIIlIllIIIIIlIlIll = llllllllllllIllIIlIllIIIIIlIIlIl.motionZ;
                final boolean llllllllllllIllIIlIllIIIIIlIlIlI = llllllllllllIllIIlIllIIIIIlIIlIl.attackEntityFrom(DamageSource.causePlayerDamage(this), llllllllllllIllIIlIllIIIIIllIIll);
                if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIlIlIlI ? 1 : 0)) {
                    if (lIIllIIIlllIIIll(llllllllllllIllIIlIllIIIIIllIIlI)) {
                        llllllllllllIllIIlIllIIIIIlIIlIl.addVelocity(-MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f) * llllllllllllIllIIlIllIIIIIllIIlI * 0.5f, 0.1, MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f) * llllllllllllIllIIlIllIIIIIllIIlI * 0.5f);
                        this.motionX *= 0.6;
                        this.motionZ *= 0.6;
                        this.setSprinting((boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
                    }
                    if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityPlayerMP) ? 1 : 0) && lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIlIIlIl.velocityChanged ? 1 : 0)) {
                        ((EntityPlayerMP)llllllllllllIllIIlIllIIIIIlIIlIl).playerNetServerHandler.sendPacket(new S12PacketEntityVelocity(llllllllllllIllIIlIllIIIIIlIIlIl));
                        llllllllllllIllIIlIllIIIIIlIIlIl.velocityChanged = (EntityPlayer.llIlllIIIIIlII[0] != 0);
                        llllllllllllIllIIlIllIIIIIlIIlIl.motionX = llllllllllllIllIIlIllIIIIIlIllIl;
                        llllllllllllIllIIlIllIIIIIlIIlIl.motionY = llllllllllllIllIIlIllIIIIIlIllII;
                        llllllllllllIllIIlIllIIIIIlIIlIl.motionZ = llllllllllllIllIIlIllIIIIIlIlIll;
                    }
                    if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIllIIII ? 1 : 0)) {
                        this.onCriticalHit(llllllllllllIllIIlIllIIIIIlIIlIl);
                    }
                    if (lIIllIIIlllIIIll(lIIllIIIllllIlIl(llllllllllllIllIIlIllIIIIIllIIIl, 0.0f))) {
                        this.onEnchantmentCritical(llllllllllllIllIIlIllIIIIIlIIlIl);
                    }
                    if (lIIllIIIlllIlllI(lIIllIIIllllIlIl(llllllllllllIllIIlIllIIIIIllIIll, 18.0f))) {
                        this.triggerAchievement(AchievementList.overkill);
                    }
                    this.setLastAttacker(llllllllllllIllIIlIllIIIIIlIIlIl);
                    if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                        EnchantmentHelper.applyThornEnchantments((EntityLivingBase)llllllllllllIllIIlIllIIIIIlIIlIl, this);
                    }
                    EnchantmentHelper.applyArthropodEnchantments(this, llllllllllllIllIIlIllIIIIIlIIlIl);
                    final ItemStack llllllllllllIllIIlIllIIIIIlIlIIl = this.getCurrentEquippedItem();
                    Entity llllllllllllIllIIlIllIIIIIlIlIII = llllllllllllIllIIlIllIIIIIlIIlIl;
                    if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityDragonPart) ? 1 : 0)) {
                        final IEntityMultiPart llllllllllllIllIIlIllIIIIIlIIlll = ((EntityDragonPart)llllllllllllIllIIlIllIIIIIlIIlIl).entityDragonObj;
                        if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlll instanceof EntityLivingBase) ? 1 : 0)) {
                            llllllllllllIllIIlIllIIIIIlIlIII = (EntityLivingBase)llllllllllllIllIIlIllIIIIIlIIlll;
                        }
                    }
                    if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIIIlIlIIl) && lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIlIII instanceof EntityLivingBase) ? 1 : 0)) {
                        llllllllllllIllIIlIllIIIIIlIlIIl.hitEntity((EntityLivingBase)llllllllllllIllIIlIllIIIIIlIlIII, this);
                        if (lIIllIIIlllIllIl(llllllllllllIllIIlIllIIIIIlIlIIl.stackSize)) {
                            this.destroyCurrentEquippedItem();
                        }
                    }
                    if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                        this.addStat(StatList.damageDealtStat, Math.round(llllllllllllIllIIlIllIIIIIllIIll * 10.0f));
                        if (lIIllIIIlllIIIll(llllllllllllIllIIlIllIIIIIlIlllI)) {
                            llllllllllllIllIIlIllIIIIIlIIlIl.setFire(llllllllllllIllIIlIllIIIIIlIlllI * EntityPlayer.llIlllIIIIIlII[8]);
                        }
                    }
                    this.addExhaustion(0.3f);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIIlIllll ? 1 : 0)) {
                    llllllllllllIllIIlIllIIIIIlIIlIl.extinguish();
                }
            }
        }
    }
    
    @Override
    public boolean getAlwaysRenderNameTagForRender() {
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    private static boolean lIIllIIIlllIlIIl(final int llllllllllllIllIIlIlIllIIIlIlIll, final int llllllllllllIllIIlIlIllIIIlIlIlI) {
        return llllllllllllIllIIlIlIllIIIlIlIll == llllllllllllIllIIlIlIllIIIlIlIlI;
    }
    
    public int getItemInUseDuration() {
        int n;
        if (lIIllIIIllIlllII(this.isUsingItem() ? 1 : 0)) {
            n = this.itemInUse.getMaxItemUseDuration() - this.itemInUseCount;
            "".length();
            if ((0x3C ^ 0x39) == 0x0) {
                return (0x4C ^ 0x1) & ~(0x30 ^ 0x7D);
            }
        }
        else {
            n = EntityPlayer.llIlllIIIIIlII[0];
        }
        return n;
    }
    
    public void stopUsingItem() {
        if (lIIllIIIllIlllIl(this.itemInUse)) {
            this.itemInUse.onPlayerStoppedUsing(this.worldObj, this, this.itemInUseCount);
        }
        this.clearItemInUse();
    }
    
    @Override
    public void onKillEntity(final EntityLivingBase llllllllllllIllIIlIlIlllIlIIIllI) {
        if (lIIllIIIllIlllII((llllllllllllIllIIlIlIlllIlIIIllI instanceof IMob) ? 1 : 0)) {
            this.triggerAchievement(AchievementList.killEnemy);
        }
        final EntityList.EntityEggInfo llllllllllllIllIIlIlIlllIlIIlIII = EntityList.entityEggs.get(EntityList.getEntityID(llllllllllllIllIIlIlIlllIlIIIllI));
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIlIlllIlIIlIII)) {
            this.triggerAchievement(llllllllllllIllIIlIlIlllIlIIlIII.field_151512_d);
        }
    }
    
    @Override
    public int getPortalCooldown() {
        return EntityPlayer.llIlllIIIIIlII[6];
    }
    
    @Override
    protected String getSplashSound() {
        return EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[1]];
    }
    
    public void setGameType(final WorldSettings.GameType llllllllllllIllIIlIlIllIllIlIllI) {
    }
    
    @Override
    public void playSound(final String llllllllllllIllIIlIllIIllIlIlIII, final float llllllllllllIllIIlIllIIllIlIIIll, final float llllllllllllIllIIlIllIIllIlIIIlI) {
        this.worldObj.playSoundToNearExcept(this, llllllllllllIllIIlIllIIllIlIlIII, llllllllllllIllIIlIllIIllIlIIIll, llllllllllllIllIIlIllIIllIlIIIlI);
    }
    
    public void addExhaustion(final float llllllllllllIllIIlIlIlllIIIllIII) {
        if (lIIllIIIllIllllI(this.capabilities.disableDamage ? 1 : 0) && lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            this.foodStats.addExhaustion(llllllllllllIllIIlIlIlllIIIllIII);
        }
    }
    
    private static int lIIllIIIllllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected boolean canTriggerWalking() {
        int n;
        if (lIIllIIIllIlllII(this.capabilities.isFlying ? 1 : 0)) {
            n = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (null != null) {
                return ((0x3F ^ 0x18) & ~(0x4 ^ 0x23)) != 0x0;
            }
        }
        else {
            n = EntityPlayer.llIlllIIIIIlII[1];
        }
        return n != 0;
    }
    
    @Override
    public boolean isInvisibleToPlayer(final EntityPlayer llllllllllllIllIIlIlIllIlIllIllI) {
        if (lIIllIIIllIllllI(this.isInvisible() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIllIlIllIllI.isSpectator() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        final Team llllllllllllIllIIlIlIllIlIlllIII = this.getTeam();
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIlIllIlIlllIII) && lIIllIIIllIlllIl(llllllllllllIllIIlIlIllIlIllIllI) && lIIllIIIllIlllll(llllllllllllIllIIlIlIllIlIllIllI.getTeam(), llllllllllllIllIIlIlIllIlIlllIII) && lIIllIIIllIlllII(llllllllllllIllIIlIlIllIlIlllIII.getSeeFriendlyInvisiblesEnabled() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    @Override
    protected void updateEntityActionState() {
        super.updateEntityActionState();
        this.updateArmSwingProgress();
        this.rotationYawHead = this.rotationYaw;
    }
    
    protected void updateItemUse(final ItemStack llllllllllllIllIIlIllIIllIIllIIl, final int llllllllllllIllIIlIllIIllIIlIIIl) {
        if (lIIllIIIllIlllll(llllllllllllIllIIlIllIIllIIllIIl.getItemUseAction(), EnumAction.DRINK)) {
            this.playSound(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[14]], 0.5f, this.worldObj.rand.nextFloat() * 0.1f + 0.9f);
        }
        if (lIIllIIIllIlllll(llllllllllllIllIIlIllIIllIIllIIl.getItemUseAction(), EnumAction.EAT)) {
            int llllllllllllIllIIlIllIIllIIlIlll = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
            while (!lIIllIIIlllIIlIl(llllllllllllIllIIlIllIIllIIlIlll, llllllllllllIllIIlIllIIllIIlIIIl)) {
                Vec3 llllllllllllIllIIlIllIIllIIlIllI = new Vec3((this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                llllllllllllIllIIlIllIIllIIlIllI = llllllllllllIllIIlIllIIllIIlIllI.rotatePitch(-this.rotationPitch * 3.1415927f / 180.0f);
                llllllllllllIllIIlIllIIllIIlIllI = llllllllllllIllIIlIllIIllIIlIllI.rotateYaw(-this.rotationYaw * 3.1415927f / 180.0f);
                final double llllllllllllIllIIlIllIIllIIlIlIl = -this.rand.nextFloat() * 0.6 - 0.3;
                Vec3 llllllllllllIllIIlIllIIllIIlIlII = new Vec3((this.rand.nextFloat() - 0.5) * 0.3, llllllllllllIllIIlIllIIllIIlIlIl, 0.6);
                llllllllllllIllIIlIllIIllIIlIlII = llllllllllllIllIIlIllIIllIIlIlII.rotatePitch(-this.rotationPitch * 3.1415927f / 180.0f);
                llllllllllllIllIIlIllIIllIIlIlII = llllllllllllIllIIlIllIIllIIlIlII.rotateYaw(-this.rotationYaw * 3.1415927f / 180.0f);
                llllllllllllIllIIlIllIIllIIlIlII = llllllllllllIllIIlIllIIllIIlIlII.addVector(this.posX, this.posY + this.getEyeHeight(), this.posZ);
                if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIllIIllIIl.getHasSubtypes() ? 1 : 0)) {
                    final World worldObj = this.worldObj;
                    final EnumParticleTypes item_CRACK = EnumParticleTypes.ITEM_CRACK;
                    final double xCoord = llllllllllllIllIIlIllIIllIIlIlII.xCoord;
                    final double yCoord = llllllllllllIllIIlIllIIllIIlIlII.yCoord;
                    final double zCoord = llllllllllllIllIIlIllIIllIIlIlII.zCoord;
                    final double xCoord2 = llllllllllllIllIIlIllIIllIIlIllI.xCoord;
                    final double lllllllllllllIIIlIIllllIIllIIlII = llllllllllllIllIIlIllIIllIIlIllI.yCoord + 0.05;
                    final double zCoord2 = llllllllllllIllIIlIllIIllIIlIllI.zCoord;
                    final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[EntityPlayer.llIlllIIIIIlII[14]];
                    lllllllllllllIIIlIIllllIIlIllIIl[EntityPlayer.llIlllIIIIIlII[0]] = Item.getIdFromItem(llllllllllllIllIIlIllIIllIIllIIl.getItem());
                    lllllllllllllIIIlIIllllIIlIllIIl[EntityPlayer.llIlllIIIIIlII[1]] = llllllllllllIllIIlIllIIllIIllIIl.getMetadata();
                    worldObj.spawnParticle(item_CRACK, xCoord, yCoord, zCoord, xCoord2, lllllllllllllIIIlIIllllIIllIIlII, zCoord2, lllllllllllllIIIlIIllllIIlIllIIl);
                    "".length();
                    if (((87 + 168 - 253 + 176 ^ 18 + 16 + 102 + 6) & (0xD2 ^ 0xC2 ^ (0x83 ^ 0xAF) ^ -" ".length())) > ((76 + 113 - 78 + 124 ^ 31 + 55 + 25 + 87) & (43 + 139 - 134 + 101 ^ 142 + 180 - 305 + 167 ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    final World worldObj2 = this.worldObj;
                    final EnumParticleTypes item_CRACK2 = EnumParticleTypes.ITEM_CRACK;
                    final double xCoord3 = llllllllllllIllIIlIllIIllIIlIlII.xCoord;
                    final double yCoord2 = llllllllllllIllIIlIllIIllIIlIlII.yCoord;
                    final double zCoord3 = llllllllllllIllIIlIllIIllIIlIlII.zCoord;
                    final double xCoord4 = llllllllllllIllIIlIllIIllIIlIllI.xCoord;
                    final double lllllllllllllIIIlIIllllIIllIIlII2 = llllllllllllIllIIlIllIIllIIlIllI.yCoord + 0.05;
                    final double zCoord4 = llllllllllllIllIIlIllIIllIIlIllI.zCoord;
                    final int[] lllllllllllllIIIlIIllllIIlIllIIl2 = new int[EntityPlayer.llIlllIIIIIlII[1]];
                    lllllllllllllIIIlIIllllIIlIllIIl2[EntityPlayer.llIlllIIIIIlII[0]] = Item.getIdFromItem(llllllllllllIllIIlIllIIllIIllIIl.getItem());
                    worldObj2.spawnParticle(item_CRACK2, xCoord3, yCoord2, zCoord3, xCoord4, lllllllllllllIIIlIIllllIIllIIlII2, zCoord4, lllllllllllllIIIlIIllllIIlIllIIl2);
                }
                ++llllllllllllIllIIlIllIIllIIlIlll;
            }
            this.playSound(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[15]], 0.5f + 0.5f * this.rand.nextInt(EntityPlayer.llIlllIIIIIlII[14]), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
        }
    }
    
    @Override
    protected void resetHeight() {
        if (lIIllIIIllIllllI(this.isSpectator() ? 1 : 0)) {
            super.resetHeight();
        }
    }
    
    private static int lIIllIIIlllIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIllIIIlllIlllI(final int llllllllllllIllIIlIlIllIIIIIlIII) {
        return llllllllllllIllIIlIlIllIIIIIlIII >= 0;
    }
    
    @Override
    public void setAbsorptionAmount(float llllllllllllIllIIlIlIllIlIIlIlll) {
        if (lIIllIIIlllIIllI(lIIllIIIllllllll(llllllllllllIllIIlIlIllIlIIlIlll, 0.0f))) {
            llllllllllllIllIIlIlIllIlIIlIlll = 0.0f;
        }
        this.getDataWatcher().updateObject(EntityPlayer.llIlllIIIIIlII[4], llllllllllllIllIIlIlIllIlIIlIlll);
    }
    
    protected void joinEntityItemWithWorld(final EntityItem llllllllllllIllIIlIllIIIllIlIIll) {
        this.worldObj.spawnEntityInWorld(llllllllllllIllIIlIllIIIllIlIIll);
        "".length();
    }
    
    protected void closeScreen() {
        this.openContainer = this.inventoryContainer;
    }
    
    public void destroyCurrentEquippedItem() {
        this.inventory.setInventorySlotContents(this.inventory.currentItem, null);
    }
    
    private void collideWithPlayer(final Entity llllllllllllIllIIlIllIIlIlIIIlII) {
        llllllllllllIllIIlIllIIlIlIIIlII.onCollideWithPlayer(this);
    }
    
    private static boolean lIIllIIIllIlllll(final Object llllllllllllIllIIlIlIllIIIIlIIIl, final Object llllllllllllIllIIlIlIllIIIIlIIII) {
        return llllllllllllIllIIlIlIllIIIIlIIIl == llllllllllllIllIIlIlIllIIIIlIIII;
    }
    
    public void displayGUIChest(final IInventory llllllllllllIllIIlIllIIIIlIlllll) {
    }
    
    public void addStat(final StatBase llllllllllllIllIIlIlIllllIlIIIII, final int llllllllllllIllIIlIlIllllIIlllll) {
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIlIllIIIlIlIIlll) {
        super.writeEntityToNBT(llllllllllllIllIIlIllIIIlIlIIlll);
        llllllllllllIllIIlIllIIIlIlIIlll.setTag(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[33]], this.inventory.writeToNBT(new NBTTagList()));
        llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[34]], this.inventory.currentItem);
        llllllllllllIllIIlIllIIIlIlIIlll.setBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[35]], this.sleeping);
        llllllllllllIllIIlIllIIIlIlIIlll.setShort(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[36]], (short)this.sleepTimer);
        llllllllllllIllIIlIllIIIlIlIIlll.setFloat(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[37]], this.experience);
        llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[38]], this.experienceLevel);
        llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[39]], this.experienceTotal);
        llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[40]], this.xpSeed);
        llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[41]], this.getScore());
        if (lIIllIIIllIlllIl(this.spawnChunk)) {
            llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[42]], this.spawnChunk.getX());
            llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[43]], this.spawnChunk.getY());
            llllllllllllIllIIlIllIIIlIlIIlll.setInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[44]], this.spawnChunk.getZ());
            llllllllllllIllIIlIllIIIlIlIIlll.setBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[45]], this.spawnForced);
        }
        this.foodStats.writeNBT(llllllllllllIllIIlIllIIIlIlIIlll);
        this.capabilities.writeCapabilitiesToNBT(llllllllllllIllIIlIllIIIlIlIIlll);
        llllllllllllIllIIlIllIIIlIlIIlll.setTag(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[22]], this.theInventoryEnderChest.saveInventoryToNBT());
        final ItemStack llllllllllllIllIIlIllIIIlIlIlIIl = this.inventory.getCurrentItem();
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIlIlIlIIl) && lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIlIlIlIIl.getItem())) {
            llllllllllllIllIIlIllIIIlIlIIlll.setTag(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[46]], llllllllllllIllIIlIllIIIlIlIlIIl.writeToNBT(new NBTTagCompound()));
        }
    }
    
    @Override
    public float getAIMoveSpeed() {
        return (float)this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
    }
    
    public void jump() {
        super.jump();
        this.triggerAchievement(StatList.jumpStat);
        if (lIIllIIIllIlllII(this.isSprinting() ? 1 : 0)) {
            this.addExhaustion(0.8f);
            "".length();
            if (((121 + 82 - 137 + 179 ^ 164 + 164 - 191 + 33) & (0x39 ^ 0x14 ^ (0xC ^ 0x7E) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.addExhaustion(0.2f);
        }
    }
    
    public static BlockPos getBedSpawnLocation(final World llllllllllllIllIIlIlIlllllIIllIl, final BlockPos llllllllllllIllIIlIlIlllllIIllII, final boolean llllllllllllIllIIlIlIlllllIlIIIl) {
        final Block llllllllllllIllIIlIlIlllllIlIIII = llllllllllllIllIIlIlIlllllIIllIl.getBlockState(llllllllllllIllIIlIlIlllllIIllII).getBlock();
        if (!lIIllIIIllllIlll(llllllllllllIllIIlIlIlllllIlIIII, Blocks.bed)) {
            return BlockBed.getSafeExitLocation(llllllllllllIllIIlIlIlllllIIllIl, llllllllllllIllIIlIlIlllllIIllII, EntityPlayer.llIlllIIIIIlII[0]);
        }
        if (lIIllIIIllIllllI(llllllllllllIllIIlIlIlllllIlIIIl ? 1 : 0)) {
            return null;
        }
        final boolean llllllllllllIllIIlIlIlllllIIllll = llllllllllllIllIIlIlIlllllIlIIII.func_181623_g();
        final boolean llllllllllllIllIIlIlIlllllIIlllI = llllllllllllIllIIlIlIlllllIIllIl.getBlockState(llllllllllllIllIIlIlIlllllIIllII.up()).getBlock().func_181623_g();
        BlockPos blockPos;
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIlllllIIllll ? 1 : 0) && lIIllIIIllIlllII(llllllllllllIllIIlIlIlllllIIlllI ? 1 : 0)) {
            blockPos = llllllllllllIllIIlIlIlllllIIllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            blockPos = null;
        }
        return blockPos;
    }
    
    public void func_175145_a(final StatBase llllllllllllIllIIlIlIllllIIlllIl) {
    }
    
    public void addScore(final int llllllllllllIllIIlIllIIlIIllIlII) {
        final int llllllllllllIllIIlIllIIlIIllIIll = this.getScore();
        this.dataWatcher.updateObject(EntityPlayer.llIlllIIIIIlII[5], llllllllllllIllIIlIllIIlIIllIIll + llllllllllllIllIIlIllIIlIIllIlII);
    }
    
    @Override
    public double getYOffset() {
        return -0.35;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityPlayer.llIlllIIIIIlII[3], (byte)EntityPlayer.llIlllIIIIIlII[0]);
        this.dataWatcher.addObject(EntityPlayer.llIlllIIIIIlII[4], 0.0f);
        this.dataWatcher.addObject(EntityPlayer.llIlllIIIIIlII[5], EntityPlayer.llIlllIIIIIlII[0]);
        this.dataWatcher.addObject(EntityPlayer.llIlllIIIIIlII[6], (byte)EntityPlayer.llIlllIIIIIlII[0]);
    }
    
    public boolean canPlayerEdit(final BlockPos llllllllllllIllIIlIlIllIllllIIlI, final EnumFacing llllllllllllIllIIlIlIllIllllIlll, final ItemStack llllllllllllIllIIlIlIllIllllIllI) {
        if (lIIllIIIllIlllII(this.capabilities.allowEdit ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        if (lIIllIIIlllIIlll(llllllllllllIllIIlIlIllIllllIllI)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        final BlockPos llllllllllllIllIIlIlIllIllllIlIl = llllllllllllIllIIlIlIllIllllIIlI.offset(llllllllllllIllIIlIlIllIllllIlll.getOpposite());
        final Block llllllllllllIllIIlIlIllIllllIlII = this.worldObj.getBlockState(llllllllllllIllIIlIlIllIllllIlIl).getBlock();
        if (lIIllIIIllIllllI(llllllllllllIllIIlIlIllIllllIllI.canPlaceOn(llllllllllllIllIIlIlIllIllllIlII) ? 1 : 0) && lIIllIIIllIllllI(llllllllllllIllIIlIlIllIllllIllI.canEditBlocks() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    public EnumStatus trySleep(final BlockPos llllllllllllIllIIlIllIIIIIIIIIIl) {
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            if (!lIIllIIIllIllllI(this.isPlayerSleeping() ? 1 : 0) || lIIllIIIllIllllI(this.isEntityAlive() ? 1 : 0)) {
                return EnumStatus.OTHER_PROBLEM;
            }
            if (lIIllIIIllIllllI(this.worldObj.provider.isSurfaceWorld() ? 1 : 0)) {
                return EnumStatus.NOT_POSSIBLE_HERE;
            }
            if (lIIllIIIllIlllII(this.worldObj.isDaytime() ? 1 : 0)) {
                return EnumStatus.NOT_POSSIBLE_NOW;
            }
            if (!lIIllIIIlllIllIl(lIIllIIIllllIllI(Math.abs(this.posX - llllllllllllIllIIlIllIIIIIIIIIIl.getX()), 3.0)) || !lIIllIIIlllIllIl(lIIllIIIllllIllI(Math.abs(this.posY - llllllllllllIllIIlIllIIIIIIIIIIl.getY()), 2.0)) || lIIllIIIlllIIIll(lIIllIIIllllIllI(Math.abs(this.posZ - llllllllllllIllIIlIllIIIIIIIIIIl.getZ()), 3.0))) {
                return EnumStatus.TOO_FAR_AWAY;
            }
            final double llllllllllllIllIIlIllIIIIIIIIIII = 8.0;
            final double llllllllllllIllIIlIlIlllllllllll = 5.0;
            final List<EntityMob> llllllllllllIllIIlIlIllllllllllI = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityMob>)EntityMob.class, new AxisAlignedBB(llllllllllllIllIIlIllIIIIIIIIIIl.getX() - llllllllllllIllIIlIllIIIIIIIIIII, llllllllllllIllIIlIllIIIIIIIIIIl.getY() - llllllllllllIllIIlIlIlllllllllll, llllllllllllIllIIlIllIIIIIIIIIIl.getZ() - llllllllllllIllIIlIllIIIIIIIIIII, llllllllllllIllIIlIllIIIIIIIIIIl.getX() + llllllllllllIllIIlIllIIIIIIIIIII, llllllllllllIllIIlIllIIIIIIIIIIl.getY() + llllllllllllIllIIlIlIlllllllllll, llllllllllllIllIIlIllIIIIIIIIIIl.getZ() + llllllllllllIllIIlIllIIIIIIIIIII));
            if (lIIllIIIllIllllI(llllllllllllIllIIlIlIllllllllllI.isEmpty() ? 1 : 0)) {
                return EnumStatus.NOT_SAFE;
            }
        }
        if (lIIllIIIllIlllII(this.isRiding() ? 1 : 0)) {
            this.mountEntity(null);
        }
        this.setSize(0.2f, 0.2f);
        if (lIIllIIIllIlllII(this.worldObj.isBlockLoaded(llllllllllllIllIIlIllIIIIIIIIIIl) ? 1 : 0)) {
            final EnumFacing llllllllllllIllIIlIlIlllllllllIl = this.worldObj.getBlockState(llllllllllllIllIIlIllIIIIIIIIIIl).getValue((IProperty<EnumFacing>)BlockDirectional.FACING);
            float llllllllllllIllIIlIlIlllllllllII = 0.5f;
            float llllllllllllIllIIlIlIllllllllIll = 0.5f;
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIIlIlIlllllllllIl.ordinal()]) {
                case 4: {
                    llllllllllllIllIIlIlIllllllllIll = 0.9f;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                    break;
                }
                case 3: {
                    llllllllllllIllIIlIlIllllllllIll = 0.1f;
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return null;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIIlIlIlllllllllII = 0.1f;
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                    break;
                }
                case 6: {
                    llllllllllllIllIIlIlIlllllllllII = 0.9f;
                    break;
                }
            }
            this.func_175139_a(llllllllllllIllIIlIlIlllllllllIl);
            this.setPosition(llllllllllllIllIIlIllIIIIIIIIIIl.getX() + llllllllllllIllIIlIlIlllllllllII, llllllllllllIllIIlIllIIIIIIIIIIl.getY() + 0.6875f, llllllllllllIllIIlIllIIIIIIIIIIl.getZ() + llllllllllllIllIIlIlIllllllllIll);
            "".length();
            if (((0x62 ^ 0x42 ^ (0xCB ^ 0xB3)) & (0x49 ^ 0x67 ^ (0x4A ^ 0x3C) ^ -" ".length())) > "  ".length()) {
                return null;
            }
        }
        else {
            this.setPosition(llllllllllllIllIIlIllIIIIIIIIIIl.getX() + 0.5f, llllllllllllIllIIlIllIIIIIIIIIIl.getY() + 0.6875f, llllllllllllIllIIlIllIIIIIIIIIIl.getZ() + 0.5f);
        }
        this.sleeping = (EntityPlayer.llIlllIIIIIlII[1] != 0);
        this.sleepTimer = EntityPlayer.llIlllIIIIIlII[0];
        this.playerLocation = llllllllllllIllIIlIllIIIIIIIIIIl;
        final double motionX = 0.0;
        this.motionY = motionX;
        this.motionZ = motionX;
        this.motionX = motionX;
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            this.worldObj.updateAllPlayersSleepingFlag();
        }
        return EnumStatus.OK;
    }
    
    public void respawnPlayer() {
    }
    
    private static String lIIllIIIllIIllll(final String llllllllllllIllIIlIlIllIIIllIIIl, final String llllllllllllIllIIlIlIllIIIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIllIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIllIIIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIllIIIllIlIl.init(EntityPlayer.llIlllIIIIIlII[14], llllllllllllIllIIlIlIllIIIllIllI);
            return new String(llllllllllllIllIIlIlIllIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIllIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIllIIIllIlII) {
            llllllllllllIllIIlIlIllIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    public FoodStats getFoodStats() {
        return this.foodStats;
    }
    
    public boolean canHarvestBlock(final Block llllllllllllIllIIlIllIIIlIllllIl) {
        return this.inventory.canHeldItemHarvest(llllllllllllIllIIlIllIIIlIllllIl);
    }
    
    private static boolean lIIllIIIlllIIllI(final int llllllllllllIllIIlIlIllIIIIIIllI) {
        return llllllllllllIllIIlIlIllIIIIIIllI < 0;
    }
    
    public InventoryEnderChest getInventoryEnderChest() {
        return this.theInventoryEnderChest;
    }
    
    public EntityItem dropOneItem(final boolean llllllllllllIllIIlIllIIIlllllIII) {
        final InventoryPlayer inventory = this.inventory;
        final int currentItem = this.inventory.currentItem;
        int stackSize;
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlllllIII ? 1 : 0) && lIIllIIIllIlllIl(this.inventory.getCurrentItem())) {
            stackSize = this.inventory.getCurrentItem().stackSize;
            "".length();
            if (" ".length() > (42 + 125 - 55 + 19 ^ 117 + 29 - 89 + 78)) {
                return null;
            }
        }
        else {
            stackSize = EntityPlayer.llIlllIIIIIlII[1];
        }
        return this.dropItem(inventory.decrStackSize(currentItem, stackSize), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0));
    }
    
    private static boolean lIIllIIIllIlllIl(final Object llllllllllllIllIIlIlIllIIIIlIlII) {
        return llllllllllllIllIIlIlIllIIIIlIlII != null;
    }
    
    private static boolean lIIllIIIlllIIlIl(final int llllllllllllIllIIlIlIllIIIlIIlll, final int llllllllllllIllIIlIlIllIIIlIIllI) {
        return llllllllllllIllIIlIlIllIIIlIIlll >= llllllllllllIllIIlIlIllIIIlIIllI;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIlIllIIIlIllIIIl) {
        super.readEntityFromNBT(llllllllllllIllIIlIllIIIlIllIIIl);
        this.entityUniqueID = getUUID(this.gameProfile);
        final NBTTagList llllllllllllIllIIlIllIIIlIllIlII = llllllllllllIllIIlIllIIIlIllIIIl.getTagList(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[16]], EntityPlayer.llIlllIIIIIlII[6]);
        this.inventory.readFromNBT(llllllllllllIllIIlIllIIIlIllIlII);
        this.inventory.currentItem = llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[6]]);
        this.sleeping = llllllllllllIllIIlIllIIIlIllIIIl.getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[23]]);
        this.sleepTimer = llllllllllllIllIIlIllIIIlIllIIIl.getShort(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[24]]);
        this.experience = llllllllllllIllIIlIllIIIlIllIIIl.getFloat(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[25]]);
        this.experienceLevel = llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[26]]);
        this.experienceTotal = llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[27]]);
        this.xpSeed = llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[3]]);
        if (lIIllIIIllIllllI(this.xpSeed)) {
            this.xpSeed = this.rand.nextInt();
        }
        this.setScore(llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[4]]));
        if (lIIllIIIllIlllII(this.sleeping ? 1 : 0)) {
            this.playerLocation = new BlockPos(this);
            this.wakeUpPlayer((boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
        }
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlIllIIIl.hasKey(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[5]], EntityPlayer.llIlllIIIIIlII[28]) ? 1 : 0) && lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlIllIIIl.hasKey(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[29]], EntityPlayer.llIlllIIIIIlII[28]) ? 1 : 0) && lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlIllIIIl.hasKey(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[2]], EntityPlayer.llIlllIIIIIlII[28]) ? 1 : 0)) {
            this.spawnChunk = new BlockPos(llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[30]]), llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[18]]), llllllllllllIllIIlIllIIIlIllIIIl.getInteger(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[17]]));
            this.spawnForced = llllllllllllIllIIlIllIIIlIllIIIl.getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[31]]);
        }
        this.foodStats.readNBT(llllllllllllIllIIlIllIIIlIllIIIl);
        this.capabilities.readCapabilitiesFromNBT(llllllllllllIllIIlIllIIIlIllIIIl);
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIlIllIIIl.hasKey(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[7]], EntityPlayer.llIlllIIIIIlII[16]) ? 1 : 0)) {
            final NBTTagList llllllllllllIllIIlIllIIIlIllIIll = llllllllllllIllIIlIllIIIlIllIIIl.getTagList(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[32]], EntityPlayer.llIlllIIIIIlII[6]);
            this.theInventoryEnderChest.loadInventoryFromNBT(llllllllllllIllIIlIllIIIlIllIIll);
        }
    }
    
    public float getBedOrientationInDegrees() {
        if (lIIllIIIllIlllIl(this.playerLocation)) {
            final EnumFacing llllllllllllIllIIlIlIlllllIIIlII = this.worldObj.getBlockState(this.playerLocation).getValue((IProperty<EnumFacing>)BlockDirectional.FACING);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIIlIlIlllllIIIlII.ordinal()]) {
                case 4: {
                    return 90.0f;
                }
                case 3: {
                    return 270.0f;
                }
                case 5: {
                    return 0.0f;
                }
                case 6: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }
    
    private static int lIIllIIIllllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isWearing(final EnumPlayerModelParts llllllllllllIllIIlIlIllIIlllllII) {
        if (lIIllIIIlllIlIIl(this.getDataWatcher().getWatchableObjectByte(EntityPlayer.llIlllIIIIIlII[6]) & llllllllllllIllIIlIlIllIIlllllII.getPartMask(), llllllllllllIllIIlIlIllIIlllllII.getPartMask())) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    public ItemStack getItemInUse() {
        return this.itemInUse;
    }
    
    public void addMovementStat(final double llllllllllllIllIIlIlIlllIlllIIII, final double llllllllllllIllIIlIlIlllIlllIlll, final double llllllllllllIllIIlIlIlllIlllIllI) {
        if (lIIllIIIlllIIlll(this.ridingEntity)) {
            if (lIIllIIIllIlllII(this.isInsideOfMaterial(Material.water) ? 1 : 0)) {
                final int llllllllllllIllIIlIlIlllIlllIlIl = Math.round(MathHelper.sqrt_double(llllllllllllIllIIlIlIlllIlllIIII * llllllllllllIllIIlIlIlllIlllIIII + llllllllllllIllIIlIlIlllIlllIlll * llllllllllllIllIIlIlIlllIlllIlll + llllllllllllIllIIlIlIlllIlllIllI * llllllllllllIllIIlIlIlllIlllIllI) * 100.0f);
                if (lIIllIIIlllIIIll(llllllllllllIllIIlIlIlllIlllIlIl)) {
                    this.addStat(StatList.distanceDoveStat, llllllllllllIllIIlIlIlllIlllIlIl);
                    this.addExhaustion(0.015f * llllllllllllIllIIlIlIlllIlllIlIl * 0.01f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (lIIllIIIllIlllII(this.isInWater() ? 1 : 0)) {
                final int llllllllllllIllIIlIlIlllIlllIlII = Math.round(MathHelper.sqrt_double(llllllllllllIllIIlIlIlllIlllIIII * llllllllllllIllIIlIlIlllIlllIIII + llllllllllllIllIIlIlIlllIlllIllI * llllllllllllIllIIlIlIlllIlllIllI) * 100.0f);
                if (lIIllIIIlllIIIll(llllllllllllIllIIlIlIlllIlllIlII)) {
                    this.addStat(StatList.distanceSwumStat, llllllllllllIllIIlIlIlllIlllIlII);
                    this.addExhaustion(0.015f * llllllllllllIllIIlIlIlllIlllIlII * 0.01f);
                    "".length();
                    if (" ".length() > (0xA5 ^ 0xA1)) {
                        return;
                    }
                }
            }
            else if (lIIllIIIllIlllII(this.isOnLadder() ? 1 : 0)) {
                if (lIIllIIIlllIIIll(lIIllIIIlllllIII(llllllllllllIllIIlIlIlllIlllIlll, 0.0))) {
                    this.addStat(StatList.distanceClimbedStat, (int)Math.round(llllllllllllIllIIlIlIlllIlllIlll * 100.0));
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return;
                    }
                }
            }
            else if (lIIllIIIllIlllII(this.onGround ? 1 : 0)) {
                final int llllllllllllIllIIlIlIlllIlllIIll = Math.round(MathHelper.sqrt_double(llllllllllllIllIIlIlIlllIlllIIII * llllllllllllIllIIlIlIlllIlllIIII + llllllllllllIllIIlIlIlllIlllIllI * llllllllllllIllIIlIlIlllIlllIllI) * 100.0f);
                if (lIIllIIIlllIIIll(llllllllllllIllIIlIlIlllIlllIIll)) {
                    this.addStat(StatList.distanceWalkedStat, llllllllllllIllIIlIlIlllIlllIIll);
                    if (lIIllIIIllIlllII(this.isSprinting() ? 1 : 0)) {
                        this.addStat(StatList.distanceSprintedStat, llllllllllllIllIIlIlIlllIlllIIll);
                        this.addExhaustion(0.099999994f * llllllllllllIllIIlIlIlllIlllIIll * 0.01f);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        if (lIIllIIIllIlllII(this.isSneaking() ? 1 : 0)) {
                            this.addStat(StatList.distanceCrouchedStat, llllllllllllIllIIlIlIlllIlllIIll);
                        }
                        this.addExhaustion(0.01f * llllllllllllIllIIlIlIlllIlllIIll * 0.01f);
                        "".length();
                        if (-" ".length() < -" ".length()) {
                            return;
                        }
                    }
                }
            }
            else {
                final int llllllllllllIllIIlIlIlllIlllIIlI = Math.round(MathHelper.sqrt_double(llllllllllllIllIIlIlIlllIlllIIII * llllllllllllIllIIlIlIlllIlllIIII + llllllllllllIllIIlIlIlllIlllIllI * llllllllllllIllIIlIlIlllIlllIllI) * 100.0f);
                if (lIIllIIIlllIIlII(llllllllllllIllIIlIlIlllIlllIIlI, EntityPlayer.llIlllIIIIIlII[7])) {
                    this.addStat(StatList.distanceFlownStat, llllllllllllIllIIlIlIlllIlllIIlI);
                }
            }
        }
    }
    
    public void onEnchantmentCritical(final Entity llllllllllllIllIIlIllIIIIIIlIlII) {
    }
    
    @Override
    public IChatComponent getDisplayName() {
        final IChatComponent llllllllllllIllIIlIlIllIlIlIIlIl = new ChatComponentText(ScorePlayerTeam.formatPlayerName(this.getTeam(), this.getName()));
        llllllllllllIllIIlIlIllIlIlIIlIl.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, String.valueOf(new StringBuilder(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[54]]).append(this.getName()).append(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[55]]))));
        "".length();
        llllllllllllIllIIlIlIllIlIlIIlIl.getChatStyle().setChatHoverEvent(this.getHoverEvent());
        "".length();
        llllllllllllIllIIlIlIllIlIlIIlIl.getChatStyle().setInsertion(this.getName());
        "".length();
        return llllllllllllIllIIlIlIllIlIlIIlIl;
    }
    
    public abstract boolean isSpectator();
    
    private static int lIIllIIIllllIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIllIIIllllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void displayGUIBook(final ItemStack llllllllllllIllIIlIllIIIIlIllIII) {
    }
    
    private static int lIIllIIIlllllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIllIIIllllIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public ItemStack[] getInventory() {
        return this.inventory.armorInventory;
    }
    
    public EntityItem dropItem(final ItemStack llllllllllllIllIIlIllIIIlllIIlll, final boolean llllllllllllIllIIlIllIIIllIlllII, final boolean llllllllllllIllIIlIllIIIllIllIll) {
        if (lIIllIIIlllIIlll(llllllllllllIllIIlIllIIIlllIIlll)) {
            return null;
        }
        if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIIlllIIlll.stackSize)) {
            return null;
        }
        final double llllllllllllIllIIlIllIIIlllIIlII = this.posY - 0.30000001192092896 + this.getEyeHeight();
        final EntityItem llllllllllllIllIIlIllIIIlllIIIll = new EntityItem(this.worldObj, this.posX, llllllllllllIllIIlIllIIIlllIIlII, this.posZ, llllllllllllIllIIlIllIIIlllIIlll);
        llllllllllllIllIIlIllIIIlllIIIll.setPickupDelay(EntityPlayer.llIlllIIIIIlII[22]);
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIllIllIll ? 1 : 0)) {
            llllllllllllIllIIlIllIIIlllIIIll.setThrower(this.getName());
        }
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIllIlllII ? 1 : 0)) {
            final float llllllllllllIllIIlIllIIIlllIIIlI = this.rand.nextFloat() * 0.5f;
            final float llllllllllllIllIIlIllIIIlllIIIIl = this.rand.nextFloat() * 3.1415927f * 2.0f;
            llllllllllllIllIIlIllIIIlllIIIll.motionX = -MathHelper.sin(llllllllllllIllIIlIllIIIlllIIIIl) * llllllllllllIllIIlIllIIIlllIIIlI;
            llllllllllllIllIIlIllIIIlllIIIll.motionZ = MathHelper.cos(llllllllllllIllIIlIllIIIlllIIIIl) * llllllllllllIllIIlIllIIIlllIIIlI;
            llllllllllllIllIIlIllIIIlllIIIll.motionY = 0.20000000298023224;
            "".length();
            if ((93 + 12 - 99 + 136 ^ 54 + 100 - 90 + 75) == 0x0) {
                return null;
            }
        }
        else {
            float llllllllllllIllIIlIllIIIlllIIIII = 0.3f;
            llllllllllllIllIIlIllIIIlllIIIll.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIlIllIIIlllIIIII;
            llllllllllllIllIIlIllIIIlllIIIll.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIlIllIIIlllIIIII;
            llllllllllllIllIIlIllIIIlllIIIll.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.1415927f) * llllllllllllIllIIlIllIIIlllIIIII + 0.1f;
            final float llllllllllllIllIIlIllIIIllIlllll = this.rand.nextFloat() * 3.1415927f * 2.0f;
            llllllllllllIllIIlIllIIIlllIIIII = 0.02f * this.rand.nextFloat();
            final EntityItem entityItem = llllllllllllIllIIlIllIIIlllIIIll;
            entityItem.motionX += Math.cos(llllllllllllIllIIlIllIIIllIlllll) * llllllllllllIllIIlIllIIIlllIIIII;
            final EntityItem entityItem2 = llllllllllllIllIIlIllIIIlllIIIll;
            entityItem2.motionY += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.1f;
            final EntityItem entityItem3 = llllllllllllIllIIlIllIIIlllIIIll;
            entityItem3.motionZ += Math.sin(llllllllllllIllIIlIllIIIllIlllll) * llllllllllllIllIIlIllIIIlllIIIII;
        }
        this.joinEntityItemWithWorld(llllllllllllIllIIlIllIIIlllIIIll);
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIllIllIll ? 1 : 0)) {
            this.triggerAchievement(StatList.dropStat);
        }
        return llllllllllllIllIIlIllIIIlllIIIll;
    }
    
    @Override
    public void onDeath(final DamageSource llllllllllllIllIIlIllIIlIIlIllII) {
        super.onDeath(llllllllllllIllIIlIllIIlIIlIllII);
        this.setSize(0.2f, 0.2f);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.motionY = 0.10000000149011612;
        if (lIIllIIIllIlllII(this.getName().equals(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[9]]) ? 1 : 0)) {
            this.dropItem(new ItemStack(Items.apple, EntityPlayer.llIlllIIIIIlII[1]), (boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0), (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
            "".length();
        }
        if (lIIllIIIllIllllI(this.worldObj.getGameRules().getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[19]]) ? 1 : 0)) {
            this.inventory.dropAllItems();
        }
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIlIIlIllII)) {
            this.motionX = -MathHelper.cos((this.attackedAtYaw + this.rotationYaw) * 3.1415927f / 180.0f) * 0.1f;
            this.motionZ = -MathHelper.sin((this.attackedAtYaw + this.rotationYaw) * 3.1415927f / 180.0f) * 0.1f;
            "".length();
            if ((0x53 ^ 0x57) != (0x17 ^ 0x13)) {
                return;
            }
        }
        else {
            final double n = 0.0;
            this.motionZ = n;
            this.motionX = n;
        }
        this.triggerAchievement(StatList.deathsStat);
        this.func_175145_a(StatList.timeSinceDeathStat);
    }
    
    private static int lIIllIIIlllllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIIllIIIllllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIIllIIIlllIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean isSpawnForced() {
        return this.spawnForced;
    }
    
    public int getScore() {
        return this.dataWatcher.getWatchableObjectInt(EntityPlayer.llIlllIIIIIlII[5]);
    }
    
    public EntityPlayer(final World llllllllllllIllIIlIllIIllllIlllI, final GameProfile llllllllllllIllIIlIllIIllllIllIl) {
        super(llllllllllllIllIIlIllIIllllIlllI);
        this.inventory = new InventoryPlayer(this);
        this.theInventoryEnderChest = new InventoryEnderChest();
        this.foodStats = new FoodStats();
        this.capabilities = new PlayerCapabilities();
        this.speedOnGround = 0.1f;
        this.speedInAir = 0.02f;
        this.hasReducedDebug = (EntityPlayer.llIlllIIIIIlII[0] != 0);
        this.entityUniqueID = getUUID(llllllllllllIllIIlIllIIllllIllIl);
        this.gameProfile = llllllllllllIllIIlIllIIllllIllIl;
        final InventoryPlayer inventory = this.inventory;
        int lllllllllllllIIllIIllllIlIlllIII;
        if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIllllIlllI.isRemote ? 1 : 0)) {
            lllllllllllllIIllIIllllIlIlllIII = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (((73 + 103 - 60 + 34 ^ 20 + 22 + 2 + 102) & (0x5E ^ 0x6 ^ (0x4 ^ 0x58) ^ -" ".length())) != 0x0) {
                throw null;
            }
        }
        else {
            lllllllllllllIIllIIllllIlIlllIII = EntityPlayer.llIlllIIIIIlII[1];
        }
        this.inventoryContainer = new ContainerPlayer(inventory, (boolean)(lllllllllllllIIllIIllllIlIlllIII != 0), this);
        this.openContainer = this.inventoryContainer;
        final BlockPos llllllllllllIllIIlIllIIllllIllII = llllllllllllIllIIlIllIIllllIlllI.getSpawnPoint();
        this.setLocationAndAngles(llllllllllllIllIIlIllIIllllIllII.getX() + 0.5, llllllllllllIllIIlIllIIllllIllII.getY() + EntityPlayer.llIlllIIIIIlII[1], llllllllllllIllIIlIllIIllllIllII.getZ() + 0.5, 0.0f, 0.0f);
        this.field_70741_aB = 180.0f;
        this.fireResistance = EntityPlayer.llIlllIIIIIlII[2];
    }
    
    public void addExperience(int llllllllllllIllIIlIlIlllIIllIlII) {
        this.addScore(llllllllllllIllIIlIlIlllIIllIlII);
        final int llllllllllllIllIIlIlIlllIIllIllI = EntityPlayer.llIlllIIIIIlII[49] - this.experienceTotal;
        if (lIIllIIIlllIIlII(llllllllllllIllIIlIlIlllIIllIlII, llllllllllllIllIIlIlIlllIIllIllI)) {
            llllllllllllIllIIlIlIlllIIllIlII = llllllllllllIllIIlIlIlllIIllIllI;
        }
        this.experience += llllllllllllIllIIlIlIlllIIllIlII / (float)this.xpBarCap();
        this.experienceTotal += llllllllllllIllIIlIlIlllIIllIlII;
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIllIIIlllIIllI(lIIllIIIlllllIll(this.experience, 1.0f))) {
            this.experience = (this.experience - 1.0f) * this.xpBarCap();
            this.addExperienceLevel(EntityPlayer.llIlllIIIIIlII[1]);
            this.experience /= this.xpBarCap();
        }
    }
    
    @Override
    public float getEyeHeight() {
        float llllllllllllIllIIlIlIllIlIIlllll = 1.62f;
        if (lIIllIIIllIlllII(this.isPlayerSleeping() ? 1 : 0)) {
            llllllllllllIllIIlIlIllIlIIlllll = 0.2f;
        }
        if (lIIllIIIllIlllII(this.isSneaking() ? 1 : 0)) {
            llllllllllllIllIIlIlIllIlIIlllll -= 0.08f;
        }
        return llllllllllllIllIIlIlIllIlIIlllll;
    }
    
    @Override
    public int getTotalArmorValue() {
        return this.inventory.getTotalArmorValue();
    }
    
    @Override
    protected boolean isMovementBlocked() {
        if (lIIllIIIlllIIIll(lIIllIIIlllIlIlI(this.getHealth(), 0.0f)) && lIIllIIIllIllllI(this.isPlayerSleeping() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    private static boolean lIIllIIIllllIlll(final Object llllllllllllIllIIlIlIllIIIIlIlll, final Object llllllllllllIllIIlIlIllIIIIlIllI) {
        return llllllllllllIllIIlIlIllIIIIlIlll != llllllllllllIllIIlIlIllIIIIlIllI;
    }
    
    private static int lIIllIIIlllllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIllIIIllllllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean sendCommandFeedback() {
        return MinecraftServer.getServer().worldServers[EntityPlayer.llIlllIIIIIlII[0]].getGameRules().getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[57]]);
    }
    
    public int getSleepTimer() {
        return this.sleepTimer;
    }
    
    public boolean isPlayerFullyAsleep() {
        if (lIIllIIIllIlllII(this.sleeping ? 1 : 0) && lIIllIIIlllIIlIl(this.sleepTimer, EntityPlayer.llIlllIIIIIlII[10])) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    public void displayGUIHorse(final EntityHorse llllllllllllIllIIlIllIIIIlIlllIl, final IInventory llllllllllllIllIIlIllIIIIlIlllII) {
    }
    
    protected void onItemUseFinish() {
        if (lIIllIIIllIlllIl(this.itemInUse)) {
            this.updateItemUse(this.itemInUse, EntityPlayer.llIlllIIIIIlII[3]);
            final int llllllllllllIllIIlIllIIllIIIlIII = this.itemInUse.stackSize;
            final ItemStack llllllllllllIllIIlIllIIllIIIIlll = this.itemInUse.onItemUseFinish(this.worldObj, this);
            if (!lIIllIIIllIlllll(llllllllllllIllIIlIllIIllIIIIlll, this.itemInUse) || (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIllIIIIlll) && lIIllIIIlllIlIII(llllllllllllIllIIlIllIIllIIIIlll.stackSize, llllllllllllIllIIlIllIIllIIIlIII))) {
                this.inventory.mainInventory[this.inventory.currentItem] = llllllllllllIllIIlIllIIllIIIIlll;
                if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIllIIIIlll.stackSize)) {
                    this.inventory.mainInventory[this.inventory.currentItem] = null;
                }
            }
            this.clearItemInUse();
        }
    }
    
    public boolean canAttackPlayer(final EntityPlayer llllllllllllIllIIlIllIIIlIIlIIII) {
        final Team llllllllllllIllIIlIllIIIlIIlIIll = this.getTeam();
        final Team llllllllllllIllIIlIllIIIlIIlIIlI = llllllllllllIllIIlIllIIIlIIlIIII.getTeam();
        int allowFriendlyFire;
        if (lIIllIIIlllIIlll(llllllllllllIllIIlIllIIIlIIlIIll)) {
            allowFriendlyFire = EntityPlayer.llIlllIIIIIlII[1];
            "".length();
            if (" ".length() < ((0x1A ^ 0x57) & ~(0xEA ^ 0xA7))) {
                return ((0x47 ^ 0x1C) & ~(0x48 ^ 0x13)) != 0x0;
            }
        }
        else if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIIlIIlIIll.isSameTeam(llllllllllllIllIIlIllIIIlIIlIIlI) ? 1 : 0)) {
            allowFriendlyFire = EntityPlayer.llIlllIIIIIlII[1];
            "".length();
            if ("   ".length() < -" ".length()) {
                return ((0x11 ^ 0x2D ^ (0x9B ^ 0xAB)) & (0x26 ^ 0x0 ^ (0xA1 ^ 0x8B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            allowFriendlyFire = (llllllllllllIllIIlIllIIIlIIlIIll.getAllowFriendlyFire() ? 1 : 0);
        }
        return allowFriendlyFire != 0;
    }
    
    public void wakeUpPlayer(final boolean llllllllllllIllIIlIlIllllllIIIIl, final boolean llllllllllllIllIIlIlIllllllIIllI, final boolean llllllllllllIllIIlIlIlllllIlllll) {
        this.setSize(0.6f, 1.8f);
        final IBlockState llllllllllllIllIIlIlIllllllIIlII = this.worldObj.getBlockState(this.playerLocation);
        if (lIIllIIIllIlllIl(this.playerLocation) && lIIllIIIllIlllll(llllllllllllIllIIlIlIllllllIIlII.getBlock(), Blocks.bed)) {
            this.worldObj.setBlockState(this.playerLocation, llllllllllllIllIIlIlIllllllIIlII.withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0)), EntityPlayer.llIlllIIIIIlII[8]);
            "".length();
            BlockPos llllllllllllIllIIlIlIllllllIIIll = BlockBed.getSafeExitLocation(this.worldObj, this.playerLocation, EntityPlayer.llIlllIIIIIlII[0]);
            if (lIIllIIIlllIIlll(llllllllllllIllIIlIlIllllllIIIll)) {
                llllllllllllIllIIlIlIllllllIIIll = this.playerLocation.up();
            }
            this.setPosition(llllllllllllIllIIlIlIllllllIIIll.getX() + 0.5f, llllllllllllIllIIlIlIllllllIIIll.getY() + 0.1f, llllllllllllIllIIlIlIllllllIIIll.getZ() + 0.5f);
        }
        this.sleeping = (EntityPlayer.llIlllIIIIIlII[0] != 0);
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0) && lIIllIIIllIlllII(llllllllllllIllIIlIlIllllllIIllI ? 1 : 0)) {
            this.worldObj.updateAllPlayersSleepingFlag();
        }
        int sleepTimer;
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIllllllIIIIl ? 1 : 0)) {
            sleepTimer = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            sleepTimer = EntityPlayer.llIlllIIIIIlII[10];
        }
        this.sleepTimer = sleepTimer;
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIlllllIlllll ? 1 : 0)) {
            this.setSpawnPoint(this.playerLocation, (boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
        }
    }
    
    @Override
    protected boolean isPlayer() {
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    static {
        lIIllIIIllIllIll();
        lIIllIIIllIlIIII();
    }
    
    @Override
    public Team getTeam() {
        return this.getWorldScoreboard().getPlayersTeam(this.getName());
    }
    
    public void addChatComponentMessage(final IChatComponent llllllllllllIllIIlIlIllllIllIlll) {
    }
    
    @Override
    protected void damageArmor(final float llllllllllllIllIIlIllIIIlIIIlIII) {
        this.inventory.damageArmor(llllllllllllIllIIlIllIIIlIIIlIII);
    }
    
    public boolean shouldHeal() {
        if (lIIllIIIlllIIIll(lIIllIIIllllllIl(this.getHealth(), 0.0f)) && lIIllIIIlllIIllI(lIIllIIIlllllllI(this.getHealth(), this.getMaxHealth()))) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    public void setScore(final int llllllllllllIllIIlIllIIlIIlllIll) {
        this.dataWatcher.updateObject(EntityPlayer.llIlllIIIIIlII[5], llllllllllllIllIIlIllIIlIIlllIll);
    }
    
    public void removeExperienceLevel(final int llllllllllllIllIIlIlIlllIIlIllII) {
        this.experienceLevel -= llllllllllllIllIIlIlIlllIIlIllII;
        if (lIIllIIIlllIIllI(this.experienceLevel)) {
            this.experienceLevel = EntityPlayer.llIlllIIIIIlII[0];
            this.experience = 0.0f;
            this.experienceTotal = EntityPlayer.llIlllIIIIIlII[0];
        }
        this.xpSeed = this.rand.nextInt();
    }
    
    private void func_175139_a(final EnumFacing llllllllllllIllIIlIlIlllllllIIIl) {
        this.renderOffsetX = 0.0f;
        this.renderOffsetZ = 0.0f;
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIllIIlIlIlllllllIIIl.ordinal()]) {
            case 4: {
                this.renderOffsetZ = -1.8f;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.renderOffsetZ = 1.8f;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                this.renderOffsetX = 1.8f;
                "".length();
                if (((0xB9 ^ 0xAB) & ~(0x5 ^ 0x17)) > ((0x92 ^ 0x98) & ~(0x7E ^ 0x74))) {
                    return;
                }
                break;
            }
            case 6: {
                this.renderOffsetX = -1.8f;
                break;
            }
        }
    }
    
    private static int lIIllIIIlllIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIllIIIlllIIIll(final int llllllllllllIllIIlIlIllIIIIIIIlI) {
        return llllllllllllIllIIlIlIllIIIIIIIlI > 0;
    }
    
    private static int lIIllIIIllllIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public String getName() {
        return this.gameProfile.getName();
    }
    
    @Override
    public void updateRidden() {
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0) && lIIllIIIllIlllII(this.isSneaking() ? 1 : 0)) {
            this.mountEntity(null);
            this.setSneaking((boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
            "".length();
            if ((0x69 ^ 0x6C) <= 0) {
                return;
            }
        }
        else {
            final double llllllllllllIllIIlIllIIlIlllIIII = this.posX;
            final double llllllllllllIllIIlIllIIlIllIllll = this.posY;
            final double llllllllllllIllIIlIllIIlIllIlllI = this.posZ;
            final float llllllllllllIllIIlIllIIlIllIllIl = this.rotationYaw;
            final float llllllllllllIllIIlIllIIlIllIllII = this.rotationPitch;
            super.updateRidden();
            this.prevCameraYaw = this.cameraYaw;
            this.cameraYaw = 0.0f;
            this.addMountedMovementStat(this.posX - llllllllllllIllIIlIllIIlIlllIIII, this.posY - llllllllllllIllIIlIllIIlIllIllll, this.posZ - llllllllllllIllIIlIllIIlIllIlllI);
            if (lIIllIIIllIlllII((this.ridingEntity instanceof EntityPig) ? 1 : 0)) {
                this.rotationPitch = llllllllllllIllIIlIllIIlIllIllII;
                this.rotationYaw = llllllllllllIllIIlIllIIlIllIllIl;
                this.renderYawOffset = ((EntityPig)this.ridingEntity).renderYawOffset;
            }
        }
    }
    
    private static boolean lIIllIIIlllIllIl(final int llllllllllllIllIIlIlIllIIIIIIlII) {
        return llllllllllllIllIIlIlIllIIIIIIlII <= 0;
    }
    
    public int getItemInUseCount() {
        return this.itemInUseCount;
    }
    
    private static int lIIllIIIlllIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isUsingItem() {
        if (lIIllIIIllIlllIl(this.itemInUse)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    @Override
    public boolean isEntityInsideOpaqueBlock() {
        if (lIIllIIIllIllllI(this.sleeping ? 1 : 0) && lIIllIIIllIlllII(super.isEntityInsideOpaqueBlock() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllIIlIllIIllIIIIIII) {
        if (lIIllIIIlllIlIIl(llllllllllllIllIIlIllIIllIIIIIII, EntityPlayer.llIlllIIIIIlII[16])) {
            this.onItemUseFinish();
            "".length();
            if (((0xF ^ 0x50) & ~(0x26 ^ 0x79)) >= "   ".length()) {
                return;
            }
        }
        else if (lIIllIIIlllIlIIl(llllllllllllIllIIlIllIIllIIIIIII, EntityPlayer.llIlllIIIIIlII[17])) {
            this.hasReducedDebug = (EntityPlayer.llIlllIIIIIlII[0] != 0);
            "".length();
            if ((0x6B ^ 0x6F) != (0xB0 ^ 0xB4)) {
                return;
            }
        }
        else if (lIIllIIIlllIlIIl(llllllllllllIllIIlIllIIllIIIIIII, EntityPlayer.llIlllIIIIIlII[18])) {
            this.hasReducedDebug = (EntityPlayer.llIlllIIIIIlII[1] != 0);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(llllllllllllIllIIlIllIIllIIIIIII);
        }
    }
    
    public boolean hasReducedDebug() {
        return this.hasReducedDebug;
    }
    
    public ItemStack getCurrentEquippedItem() {
        return this.inventory.getCurrentItem();
    }
    
    @Override
    public void moveEntityWithHeading(final float llllllllllllIllIIlIlIllllIIlIIII, final float llllllllllllIllIIlIlIllllIIIllll) {
        final double llllllllllllIllIIlIlIllllIIIlllI = this.posX;
        final double llllllllllllIllIIlIlIllllIIIllIl = this.posY;
        final double llllllllllllIllIIlIlIllllIIIllII = this.posZ;
        if (lIIllIIIllIlllII(this.capabilities.isFlying ? 1 : 0) && lIIllIIIlllIIlll(this.ridingEntity)) {
            final double llllllllllllIllIIlIlIllllIIIlIll = this.motionY;
            final float llllllllllllIllIIlIlIllllIIIlIlI = this.jumpMovementFactor;
            final float flySpeed = this.capabilities.getFlySpeed();
            int n;
            if (lIIllIIIllIlllII(this.isSprinting() ? 1 : 0)) {
                n = EntityPlayer.llIlllIIIIIlII[14];
                "".length();
                if (((123 + 29 - 62 + 37 ^ (0x1A ^ 0x26)) & (0x6 ^ 0x26 ^ (0xD3 ^ 0xB0) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                n = EntityPlayer.llIlllIIIIIlII[1];
            }
            this.jumpMovementFactor = flySpeed * n;
            super.moveEntityWithHeading(llllllllllllIllIIlIlIllllIIlIIII, llllllllllllIllIIlIlIllllIIIllll);
            this.motionY = llllllllllllIllIIlIlIllllIIIlIll * 0.6;
            this.jumpMovementFactor = llllllllllllIllIIlIlIllllIIIlIlI;
            "".length();
            if ((79 + 142 - 188 + 166 ^ 41 + 178 - 180 + 156) <= "   ".length()) {
                return;
            }
        }
        else {
            super.moveEntityWithHeading(llllllllllllIllIIlIlIllllIIlIIII, llllllllllllIllIIlIlIllllIIIllll);
        }
        this.addMovementStat(this.posX - llllllllllllIllIIlIlIllllIIIlllI, this.posY - llllllllllllIllIIlIlIllllIIIllIl, this.posZ - llllllllllllIllIIlIlIllllIIIllII);
    }
    
    public int xpBarCap() {
        int n;
        if (lIIllIIIlllIIlIl(this.experienceLevel, EntityPlayer.llIlllIIIIIlII[36])) {
            n = EntityPlayer.llIlllIIIIIlII[51] + (this.experienceLevel - EntityPlayer.llIlllIIIIIlII[36]) * EntityPlayer.llIlllIIIIIlII[16];
            "".length();
            if ("   ".length() == 0) {
                return (0xFA ^ 0xB2 ^ (0x12 ^ 0x6B)) & (0x53 ^ 0x56 ^ (0x6C ^ 0x58) ^ -" ".length());
            }
        }
        else if (lIIllIIIlllIIlIl(this.experienceLevel, EntityPlayer.llIlllIIIIIlII[27])) {
            n = EntityPlayer.llIlllIIIIIlII[43] + (this.experienceLevel - EntityPlayer.llIlllIIIIIlII[27]) * EntityPlayer.llIlllIIIIIlII[9];
            "".length();
            if (((0x89 ^ 0x99 ^ (0x64 ^ 0x21)) & (60 + 68 - 14 + 113 ^ 161 + 86 - 112 + 47 ^ -" ".length())) < 0) {
                return (137 + 118 - 77 + 13 ^ 79 + 94 - 152 + 156) & (0x50 ^ 0x60 ^ (0x26 ^ 0x18) ^ -" ".length());
            }
        }
        else {
            n = EntityPlayer.llIlllIIIIIlII[20] + this.experienceLevel * EntityPlayer.llIlllIIIIIlII[14];
        }
        return n;
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIllIIIlllIIIll(this.flyToggleTimer)) {
            this.flyToggleTimer -= EntityPlayer.llIlllIIIIIlII[1];
        }
        if (lIIllIIIllIlllll(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL) && lIIllIIIllIlllII(this.worldObj.getGameRules().getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[8]]) ? 1 : 0)) {
            if (lIIllIIIlllIIllI(lIIllIIIlllIlIll(this.getHealth(), this.getMaxHealth())) && lIIllIIIllIllllI(this.ticksExisted % EntityPlayer.llIlllIIIIIlII[2])) {
                this.heal(1.0f);
            }
            if (lIIllIIIllIlllII(this.foodStats.needFood() ? 1 : 0) && lIIllIIIllIllllI(this.ticksExisted % EntityPlayer.llIlllIIIIIlII[6])) {
                this.foodStats.setFoodLevel(this.foodStats.getFoodLevel() + EntityPlayer.llIlllIIIIIlII[1]);
            }
        }
        this.inventory.decrementAnimations();
        this.prevCameraYaw = this.cameraYaw;
        super.onLivingUpdate();
        final IAttributeInstance llllllllllllIllIIlIllIIlIlIlIllI = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            llllllllllllIllIIlIllIIlIlIlIllI.setBaseValue(this.capabilities.getWalkSpeed());
        }
        this.jumpMovementFactor = this.speedInAir;
        if (lIIllIIIllIlllII(this.isSprinting() ? 1 : 0)) {
            this.jumpMovementFactor += (float)(this.speedInAir * 0.3);
        }
        this.setAIMoveSpeed((float)llllllllllllIllIIlIllIIlIlIlIllI.getAttributeValue());
        float llllllllllllIllIIlIllIIlIlIlIlIl = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        float llllllllllllIllIIlIllIIlIlIlIlII = (float)(Math.atan(-this.motionY * 0.20000000298023224) * 15.0);
        if (lIIllIIIlllIIIll(lIIllIIIlllIllII(llllllllllllIllIIlIllIIlIlIlIlIl, 0.1f))) {
            llllllllllllIllIIlIllIIlIlIlIlIl = 0.1f;
        }
        if (!lIIllIIIllIlllII(this.onGround ? 1 : 0) || lIIllIIIlllIllIl(lIIllIIIlllIlIll(this.getHealth(), 0.0f))) {
            llllllllllllIllIIlIllIIlIlIlIlIl = 0.0f;
        }
        if (!lIIllIIIllIllllI(this.onGround ? 1 : 0) || lIIllIIIlllIllIl(lIIllIIIlllIlIll(this.getHealth(), 0.0f))) {
            llllllllllllIllIIlIllIIlIlIlIlII = 0.0f;
        }
        this.cameraYaw += (llllllllllllIllIIlIllIIlIlIlIlIl - this.cameraYaw) * 0.4f;
        this.cameraPitch += (llllllllllllIllIIlIllIIlIlIlIlII - this.cameraPitch) * 0.8f;
        if (lIIllIIIlllIIIll(lIIllIIIlllIllII(this.getHealth(), 0.0f)) && lIIllIIIllIllllI(this.isSpectator() ? 1 : 0)) {
            AxisAlignedBB llllllllllllIllIIlIllIIlIlIlIIll = null;
            if (lIIllIIIllIlllIl(this.ridingEntity) && lIIllIIIllIllllI(this.ridingEntity.isDead ? 1 : 0)) {
                llllllllllllIllIIlIllIIlIlIlIIll = this.getEntityBoundingBox().union(this.ridingEntity.getEntityBoundingBox()).expand(1.0, 0.0, 1.0);
                "".length();
                if ((0xB6 ^ 0xB2) <= 0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlIllIIlIlIlIIll = this.getEntityBoundingBox().expand(1.0, 0.5, 1.0);
            }
            final List<Entity> llllllllllllIllIIlIllIIlIlIlIIlI = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, llllllllllllIllIIlIllIIlIlIlIIll);
            int llllllllllllIllIIlIllIIlIlIlIIIl = EntityPlayer.llIlllIIIIIlII[0];
            "".length();
            if (((0x37 ^ 0x14) & ~(0xA3 ^ 0x80)) >= (0xA0 ^ 0xA4)) {
                return;
            }
            while (!lIIllIIIlllIIlIl(llllllllllllIllIIlIllIIlIlIlIIIl, llllllllllllIllIIlIllIIlIlIlIIlI.size())) {
                final Entity llllllllllllIllIIlIllIIlIlIlIIII = llllllllllllIllIIlIllIIlIlIlIIlI.get(llllllllllllIllIIlIllIIlIlIlIIIl);
                if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIlIlIlIIII.isDead ? 1 : 0)) {
                    this.collideWithPlayer(llllllllllllIllIIlIllIIlIlIlIIII);
                }
                ++llllllllllllIllIIlIllIIlIlIlIIIl;
            }
        }
    }
    
    private static boolean lIIllIIIlllIIIlI(final int llllllllllllIllIIlIlIllIIIIlllll, final int llllllllllllIllIIlIlIllIIIIllllI) {
        return llllllllllllIllIIlIlIllIIIIlllll <= llllllllllllIllIIlIlIllIIIIllllI;
    }
    
    public float getArmorVisibility() {
        int llllllllllllIllIIlIllIIIIlllllIl = EntityPlayer.llIlllIIIIIlII[0];
        final int llllllllllllIllIIlIllIIIIlllIllI;
        final String llllllllllllIllIIlIllIIIIlllIlll = (String)((ItemStack[])(Object)(llllllllllllIllIIlIllIIIIlllIllI = (int)(Object)this.inventory.armorInventory)).length;
        boolean llllllllllllIllIIlIllIIIIllllIII = EntityPlayer.llIlllIIIIIlII[0] != 0;
        "".length();
        if (-" ".length() > " ".length()) {
            return 0.0f;
        }
        while (!lIIllIIIlllIIlIl(llllllllllllIllIIlIllIIIIllllIII ? 1 : 0, (int)llllllllllllIllIIlIllIIIIlllIlll)) {
            final ItemStack llllllllllllIllIIlIllIIIIlllllII = llllllllllllIllIIlIllIIIIlllIllI[llllllllllllIllIIlIllIIIIllllIII];
            if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIIlllllII)) {
                ++llllllllllllIllIIlIllIIIIlllllIl;
            }
            ++llllllllllllIllIIlIllIIIIllllIII;
        }
        return llllllllllllIllIIlIllIIIIlllllIl / (float)this.inventory.armorInventory.length;
    }
    
    public void openEditSign(final TileEntitySign llllllllllllIllIIlIllIIIIllIIlIl) {
    }
    
    public static UUID getUUID(final GameProfile llllllllllllIllIIlIlIllIlIIIllll) {
        UUID llllllllllllIllIIlIlIllIlIIlIIII = llllllllllllIllIIlIlIllIlIIIllll.getId();
        if (lIIllIIIlllIIlll(llllllllllllIllIIlIlIllIlIIlIIII)) {
            llllllllllllIllIIlIlIllIlIIlIIII = getOfflineUUID(llllllllllllIllIIlIlIllIlIIIllll.getName());
        }
        return llllllllllllIllIIlIlIllIlIIlIIII;
    }
    
    public void clearItemInUse() {
        this.itemInUse = null;
        this.itemInUseCount = EntityPlayer.llIlllIIIIIlII[0];
        if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            this.setEating((boolean)(EntityPlayer.llIlllIIIIIlII[0] != 0));
        }
    }
    
    public boolean isBlocking() {
        if (lIIllIIIllIlllII(this.isUsingItem() ? 1 : 0) && lIIllIIIllIlllll(this.itemInUse.getItem().getItemUseAction(this.itemInUse), EnumAction.BLOCK)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        return EntityPlayer.llIlllIIIIIlII[0] != 0;
    }
    
    public void clonePlayer(final EntityPlayer llllllllllllIllIIlIlIllIlllIIIII, final boolean llllllllllllIllIIlIlIllIllIlllII) {
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIllIllIlllII ? 1 : 0)) {
            this.inventory.copyInventory(llllllllllllIllIIlIlIllIlllIIIII.inventory);
            this.setHealth(llllllllllllIllIIlIlIllIlllIIIII.getHealth());
            this.foodStats = llllllllllllIllIIlIlIllIlllIIIII.foodStats;
            this.experienceLevel = llllllllllllIllIIlIlIllIlllIIIII.experienceLevel;
            this.experienceTotal = llllllllllllIllIIlIlIllIlllIIIII.experienceTotal;
            this.experience = llllllllllllIllIIlIlIllIlllIIIII.experience;
            this.setScore(llllllllllllIllIIlIlIllIlllIIIII.getScore());
            this.field_181016_an = llllllllllllIllIIlIlIllIlllIIIII.field_181016_an;
            this.field_181017_ao = llllllllllllIllIIlIlIllIlllIIIII.field_181017_ao;
            this.field_181018_ap = llllllllllllIllIIlIlIllIlllIIIII.field_181018_ap;
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else if (lIIllIIIllIlllII(this.worldObj.getGameRules().getBoolean(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[53]]) ? 1 : 0)) {
            this.inventory.copyInventory(llllllllllllIllIIlIlIllIlllIIIII.inventory);
            this.experienceLevel = llllllllllllIllIIlIlIllIlllIIIII.experienceLevel;
            this.experienceTotal = llllllllllllIllIIlIlIllIlllIIIII.experienceTotal;
            this.experience = llllllllllllIllIIlIlIllIlllIIIII.experience;
            this.setScore(llllllllllllIllIIlIlIllIlllIIIII.getScore());
        }
        this.xpSeed = llllllllllllIllIIlIlIllIlllIIIII.xpSeed;
        this.theInventoryEnderChest = llllllllllllIllIIlIlIllIlllIIIII.theInventoryEnderChest;
        this.getDataWatcher().updateObject(EntityPlayer.llIlllIIIIIlII[6], llllllllllllIllIIlIlIllIlllIIIII.getDataWatcher().getWatchableObjectByte(EntityPlayer.llIlllIIIIIlII[6]));
    }
    
    @Override
    public ItemStack getEquipmentInSlot(final int llllllllllllIllIIlIlIllIllIIllII) {
        ItemStack currentItem;
        if (lIIllIIIllIllllI(llllllllllllIllIIlIlIllIllIIllII)) {
            currentItem = this.inventory.getCurrentItem();
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            currentItem = this.inventory.armorInventory[llllllllllllIllIIlIlIllIllIIllII - EntityPlayer.llIlllIIIIIlII[1]];
        }
        return currentItem;
    }
    
    private static boolean lIIllIIIlllIlIII(final int llllllllllllIllIIlIlIlIlllllllll, final int llllllllllllIllIIlIlIlIllllllllI) {
        return llllllllllllIllIIlIlIlIlllllllll != llllllllllllIllIIlIlIlIllllllllI;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.10000000149011612);
    }
    
    private static int lIIllIIIlllIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public ItemStack getHeldItem() {
        return this.inventory.getCurrentItem();
    }
    
    public void displayVillagerTradeGui(final IMerchant llllllllllllIllIIlIllIIIIllIIIIl) {
    }
    
    public boolean canOpen(final LockCode llllllllllllIllIIlIlIllIlIIIIllI) {
        if (lIIllIIIllIlllII(llllllllllllIllIIlIlIllIlIIIIllI.isEmpty() ? 1 : 0)) {
            return EntityPlayer.llIlllIIIIIlII[1] != 0;
        }
        final ItemStack llllllllllllIllIIlIlIllIlIIIIlIl = this.getCurrentEquippedItem();
        int equals;
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIlIllIlIIIIlIl) && lIIllIIIllIlllII(llllllllllllIllIIlIlIllIlIIIIlIl.hasDisplayName() ? 1 : 0)) {
            equals = (llllllllllllIllIIlIlIllIlIIIIlIl.getDisplayName().equals(llllllllllllIllIIlIlIllIlIIIIllI.getLock()) ? 1 : 0);
            "".length();
            if ((0xC5 ^ 0xC1) < 0) {
                return ((0xD2 ^ 0x8C) & ~(0x52 ^ 0xC)) != 0x0;
            }
        }
        else {
            equals = EntityPlayer.llIlllIIIIIlII[0];
        }
        return equals != 0;
    }
    
    public GameProfile getGameProfile() {
        return this.gameProfile;
    }
    
    @Override
    public boolean isPlayerSleeping() {
        return this.sleeping;
    }
    
    public boolean interactWith(final Entity llllllllllllIllIIlIllIIIIlIIlllI) {
        if (lIIllIIIllIlllII(this.isSpectator() ? 1 : 0)) {
            if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIlIIlllI instanceof IInventory) ? 1 : 0)) {
                this.displayGUIChest((IInventory)llllllllllllIllIIlIllIIIIlIIlllI);
            }
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        ItemStack llllllllllllIllIIlIllIIIIlIlIIIl = this.getCurrentEquippedItem();
        ItemStack copy;
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIIlIlIIIl)) {
            copy = llllllllllllIllIIlIllIIIIlIlIIIl.copy();
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x68 ^ 0x5A) & ~(0x26 ^ 0x14)) != 0x0;
            }
        }
        else {
            copy = null;
        }
        final ItemStack llllllllllllIllIIlIllIIIIlIlIIII = copy;
        if (lIIllIIIllIllllI(llllllllllllIllIIlIllIIIIlIIlllI.interactFirst(this) ? 1 : 0)) {
            if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIIlIlIIIl) && lIIllIIIllIlllII((llllllllllllIllIIlIllIIIIlIIlllI instanceof EntityLivingBase) ? 1 : 0)) {
                if (lIIllIIIllIlllII(this.capabilities.isCreativeMode ? 1 : 0)) {
                    llllllllllllIllIIlIllIIIIlIlIIIl = llllllllllllIllIIlIllIIIIlIlIIII;
                }
                if (lIIllIIIllIlllII(llllllllllllIllIIlIllIIIIlIlIIIl.interactWithEntity(this, (EntityLivingBase)llllllllllllIllIIlIllIIIIlIIlllI) ? 1 : 0)) {
                    if (lIIllIIIlllIllIl(llllllllllllIllIIlIllIIIIlIlIIIl.stackSize) && lIIllIIIllIllllI(this.capabilities.isCreativeMode ? 1 : 0)) {
                        this.destroyCurrentEquippedItem();
                    }
                    return EntityPlayer.llIlllIIIIIlII[1] != 0;
                }
            }
            return EntityPlayer.llIlllIIIIIlII[0] != 0;
        }
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIIIlIlIIIl) && lIIllIIIllIlllll(llllllllllllIllIIlIllIIIIlIlIIIl, this.getCurrentEquippedItem())) {
            if (lIIllIIIlllIllIl(llllllllllllIllIIlIllIIIIlIlIIIl.stackSize) && lIIllIIIllIllllI(this.capabilities.isCreativeMode ? 1 : 0)) {
                this.destroyCurrentEquippedItem();
                "".length();
                if ("  ".length() < " ".length()) {
                    return ((132 + 20 - 116 + 112 ^ 89 + 105 - 74 + 11) & (0x45 ^ 0x7A ^ (0x86 ^ 0xAE) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIllIIIlllIllll(llllllllllllIllIIlIllIIIIlIlIIIl.stackSize, llllllllllllIllIIlIllIIIIlIlIIII.stackSize) && lIIllIIIllIlllII(this.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIllIIlIllIIIIlIlIIIl.stackSize = llllllllllllIllIIlIllIIIIlIlIIII.stackSize;
            }
        }
        return EntityPlayer.llIlllIIIIIlII[1] != 0;
    }
    
    public void addExperienceLevel(final int llllllllllllIllIIlIlIlllIIlIIIlI) {
        this.experienceLevel += llllllllllllIllIIlIlIlllIIlIIIlI;
        if (lIIllIIIlllIIllI(this.experienceLevel)) {
            this.experienceLevel = EntityPlayer.llIlllIIIIIlII[0];
            this.experience = 0.0f;
            this.experienceTotal = EntityPlayer.llIlllIIIIIlII[0];
        }
        if (lIIllIIIlllIIIll(llllllllllllIllIIlIlIlllIIlIIIlI) && lIIllIIIllIllllI(this.experienceLevel % EntityPlayer.llIlllIIIIIlII[9]) && lIIllIIIlllIIllI(lIIllIIIllllllII((float)this.lastXPSound, this.ticksExisted - 100.0f))) {
            float n;
            if (lIIllIIIlllIIlII(this.experienceLevel, EntityPlayer.llIlllIIIIIlII[36])) {
                n = 1.0f;
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
            }
            else {
                n = this.experienceLevel / 30.0f;
            }
            final float llllllllllllIllIIlIlIlllIIlIIlII = n;
            this.worldObj.playSoundAtEntity(this, EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[50]], llllllllllllIllIIlIlIlllIIlIIlII * 0.75f, 1.0f);
            this.lastXPSound = this.ticksExisted;
        }
    }
    
    public BlockPos getBedLocation() {
        return this.spawnChunk;
    }
    
    public void setItemInUse(final ItemStack llllllllllllIllIIlIlIlllIIIIIlII, final int llllllllllllIllIIlIlIlllIIIIIIll) {
        if (lIIllIIIllllIlll(llllllllllllIllIIlIlIlllIIIIIlII, this.itemInUse)) {
            this.itemInUse = llllllllllllIllIIlIlIlllIIIIIlII;
            this.itemInUseCount = llllllllllllIllIIlIlIlllIIIIIIll;
            if (lIIllIIIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
                this.setEating((boolean)(EntityPlayer.llIlllIIIIIlII[1] != 0));
            }
        }
    }
    
    public static UUID getOfflineUUID(final String llllllllllllIllIIlIlIllIlIIIllII) {
        return UUID.nameUUIDFromBytes(String.valueOf(new StringBuilder(EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[56]]).append(llllllllllllIllIIlIlIllIlIIIllII)).getBytes(Charsets.UTF_8));
    }
    
    private Collection<ScoreObjective> func_175137_e(final Entity llllllllllllIllIIlIllIIlIIIIlIll) {
        final ScorePlayerTeam llllllllllllIllIIlIllIIlIIIIlIlI = this.getWorldScoreboard().getPlayersTeam(this.getName());
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIlIIIIlIlI)) {
            final int llllllllllllIllIIlIllIIlIIIIlIIl = llllllllllllIllIIlIllIIlIIIIlIlI.getChatFormat().getColorIndex();
            if (lIIllIIIlllIlllI(llllllllllllIllIIlIllIIlIIIIlIIl) && lIIllIIIlllIllll(llllllllllllIllIIlIllIIlIIIIlIIl, IScoreObjectiveCriteria.field_178793_i.length)) {
                final byte llllllllllllIllIIlIllIIIllllllll = (byte)this.getWorldScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.field_178793_i[llllllllllllIllIIlIllIIlIIIIlIIl]).iterator();
                "".length();
                if (((8 + 131 + 46 + 2 ^ 115 + 45 - 87 + 77) & (0xA7 ^ 0xA8 ^ (0x8F ^ 0xAD) ^ -" ".length())) > 0) {
                    return null;
                }
                while (!lIIllIIIllIllllI(((Iterator)llllllllllllIllIIlIllIIIllllllll).hasNext() ? 1 : 0)) {
                    final ScoreObjective llllllllllllIllIIlIllIIlIIIIlIII = ((Iterator<ScoreObjective>)llllllllllllIllIIlIllIIIllllllll).next();
                    final Score llllllllllllIllIIlIllIIlIIIIIlll = this.getWorldScoreboard().getValueFromObjective(llllllllllllIllIIlIllIIlIIIIlIll.getName(), llllllllllllIllIIlIllIIlIIIIlIII);
                    llllllllllllIllIIlIllIIlIIIIIlll.func_96648_a();
                }
            }
        }
        final ScorePlayerTeam llllllllllllIllIIlIllIIlIIIIIllI = this.getWorldScoreboard().getPlayersTeam(llllllllllllIllIIlIllIIlIIIIlIll.getName());
        if (lIIllIIIllIlllIl(llllllllllllIllIIlIllIIlIIIIIllI)) {
            final int llllllllllllIllIIlIllIIlIIIIIlIl = llllllllllllIllIIlIllIIlIIIIIllI.getChatFormat().getColorIndex();
            if (lIIllIIIlllIlllI(llllllllllllIllIIlIllIIlIIIIIlIl) && lIIllIIIlllIllll(llllllllllllIllIIlIllIIlIIIIIlIl, IScoreObjectiveCriteria.field_178792_h.length)) {
                return this.getWorldScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.field_178792_h[llllllllllllIllIIlIllIIlIIIIIlIl]);
            }
        }
        return (Collection<ScoreObjective>)Lists.newArrayList();
    }
    
    @Override
    public void addToPlayerScore(final Entity llllllllllllIllIIlIllIIlIIIlllll, final int llllllllllllIllIIlIllIIlIIIllllI) {
        this.addScore(llllllllllllIllIIlIllIIlIIIllllI);
        final Collection<ScoreObjective> llllllllllllIllIIlIllIIlIIIlllIl = this.getWorldScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.totalKillCount);
        if (lIIllIIIllIlllII((llllllllllllIllIIlIllIIlIIIlllll instanceof EntityPlayer) ? 1 : 0)) {
            this.triggerAchievement(StatList.playerKillsStat);
            llllllllllllIllIIlIllIIlIIIlllIl.addAll(this.getWorldScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.playerKillCount));
            "".length();
            llllllllllllIllIIlIllIIlIIIlllIl.addAll(this.func_175137_e(llllllllllllIllIIlIllIIlIIIlllll));
            "".length();
            "".length();
            if ((0x43 ^ 0x7D ^ (0xFC ^ 0xC6)) < 0) {
                return;
            }
        }
        else {
            this.triggerAchievement(StatList.mobKillsStat);
        }
        final short llllllllllllIllIIlIllIIlIIIlIlIl = (short)llllllllllllIllIIlIllIIlIIIlllIl.iterator();
        "".length();
        if (((0x5 ^ 0x66) & ~(0xD1 ^ 0xB2)) < 0) {
            return;
        }
        while (!lIIllIIIllIllllI(((Iterator)llllllllllllIllIIlIllIIlIIIlIlIl).hasNext() ? 1 : 0)) {
            final ScoreObjective llllllllllllIllIIlIllIIlIIIlllII = ((Iterator<ScoreObjective>)llllllllllllIllIIlIllIIlIIIlIlIl).next();
            final Score llllllllllllIllIIlIllIIlIIIllIll = this.getWorldScoreboard().getValueFromObjective(this.getName(), llllllllllllIllIIlIllIIlIIIlllII);
            llllllllllllIllIIlIllIIlIIIllIll.func_96648_a();
        }
    }
    
    @Override
    public void setInWeb() {
        if (lIIllIIIllIllllI(this.capabilities.isFlying ? 1 : 0)) {
            super.setInWeb();
        }
    }
    
    @Override
    protected String getSwimSound() {
        return EntityPlayer.llIlllIIIIIIll[EntityPlayer.llIlllIIIIIlII[0]];
    }
    
    private static int lIIllIIIllllllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public enum EnumStatus
    {
        NOT_SAFE(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[5]], EnumStatus.lIllllIIlIIIII[5]), 
        NOT_POSSIBLE_HERE(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[1]], EnumStatus.lIllllIIlIIIII[1]), 
        OK(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[0]], EnumStatus.lIllllIIlIIIII[0]), 
        NOT_POSSIBLE_NOW(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[2]], EnumStatus.lIllllIIlIIIII[2]), 
        TOO_FAR_AWAY(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[3]], EnumStatus.lIllllIIlIIIII[3]), 
        OTHER_PROBLEM(EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[4]], EnumStatus.lIllllIIlIIIII[4]);
        
        private static final /* synthetic */ String[] lIllllIIIllllI;
        private static final /* synthetic */ int[] lIllllIIlIIIII;
        
        private static void lIIIIlIIIIIIIlll() {
            (lIllllIIlIIIII = new int[8])[0] = ((0xD8 ^ 0xB0 ^ (0xC4 ^ 0x85)) & (0x5E ^ 0x34 ^ (0xDC ^ 0x9F) ^ -" ".length()));
            EnumStatus.lIllllIIlIIIII[1] = " ".length();
            EnumStatus.lIllllIIlIIIII[2] = "  ".length();
            EnumStatus.lIllllIIlIIIII[3] = "   ".length();
            EnumStatus.lIllllIIlIIIII[4] = (0x94 ^ 0x90);
            EnumStatus.lIllllIIlIIIII[5] = (5 + 145 - 17 + 42 ^ 82 + 124 - 83 + 47);
            EnumStatus.lIllllIIlIIIII[6] = (0x73 ^ 0x63 ^ (0x90 ^ 0x86));
            EnumStatus.lIllllIIlIIIII[7] = (0x5A ^ 0x52);
        }
        
        static {
            lIIIIlIIIIIIIlll();
            lIIIIlIIIIIIIIlI();
            final EnumStatus[] enum$VALUES = new EnumStatus[EnumStatus.lIllllIIlIIIII[6]];
            enum$VALUES[EnumStatus.lIllllIIlIIIII[0]] = EnumStatus.OK;
            enum$VALUES[EnumStatus.lIllllIIlIIIII[1]] = EnumStatus.NOT_POSSIBLE_HERE;
            enum$VALUES[EnumStatus.lIllllIIlIIIII[2]] = EnumStatus.NOT_POSSIBLE_NOW;
            enum$VALUES[EnumStatus.lIllllIIlIIIII[3]] = EnumStatus.TOO_FAR_AWAY;
            enum$VALUES[EnumStatus.lIllllIIlIIIII[4]] = EnumStatus.OTHER_PROBLEM;
            enum$VALUES[EnumStatus.lIllllIIlIIIII[5]] = EnumStatus.NOT_SAFE;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIIIIlIIIIIIIIlI() {
            (lIllllIIIllllI = new String[EnumStatus.lIllllIIlIIIII[6]])[EnumStatus.lIllllIIlIIIII[0]] = lIIIIIllllllllll("BwI=", "HISnZ");
            EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[1]] = lIIIIlIIIIIIIIII("d/EH09Xia2cO/njNea+38hHroZVfANXP", "ZbvsW");
            EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[2]] = lIIIIIllllllllll("KwkYNxkqFR8hCykDEyYGMg==", "eFLhI");
            EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[3]] = lIIIIlIIIIIIIIIl("WbmQHQsW3vmdvm7TeRTgNg==", "ThyMi");
            EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[4]] = lIIIIIllllllllll("FzkNAiUHPRcINRQoCA==", "XmEGw");
            EnumStatus.lIllllIIIllllI[EnumStatus.lIllllIIlIIIII[5]] = lIIIIIllllllllll("IxgnGh4sETY=", "mWsEM");
        }
        
        private static boolean lIIIIlIIIIIIlIII(final int llllllllllllIllllIlIllIIllllIlll, final int llllllllllllIllllIlIllIIllllIllI) {
            return llllllllllllIllllIlIllIIllllIlll < llllllllllllIllllIlIllIIllllIllI;
        }
        
        private EnumStatus(final String llllllllllllIllllIlIllIlIIllIlIl, final int llllllllllllIllllIlIllIlIIllIlII) {
        }
        
        private static String lIIIIlIIIIIIIIII(final String llllllllllllIllllIlIllIIllllllIl, final String llllllllllllIllllIlIllIIlllllllI) {
            try {
                final SecretKeySpec llllllllllllIllllIlIllIlIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIllIlIIIIIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIllIlIIIIIIIl.init(EnumStatus.lIllllIIlIIIII[2], llllllllllllIllllIlIllIlIIIIIIlI);
                return new String(llllllllllllIllllIlIllIlIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIllIlIIIIIIII) {
                llllllllllllIllllIlIllIlIIIIIIII.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIIllllllllll(String llllllllllllIllllIlIllIlIIIIllll, final String llllllllllllIllllIlIllIlIIIIlllI) {
            llllllllllllIllllIlIllIlIIIIllll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIllIlIIIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIlIllIlIIIlIIlI = new StringBuilder();
            final char[] llllllllllllIllllIlIllIlIIIlIIIl = llllllllllllIllllIlIllIlIIIIlllI.toCharArray();
            int llllllllllllIllllIlIllIlIIIlIIII = EnumStatus.lIllllIIlIIIII[0];
            final boolean llllllllllllIllllIlIllIlIIIIlIlI = (Object)((String)llllllllllllIllllIlIllIlIIIIllll).toCharArray();
            final int llllllllllllIllllIlIllIlIIIIlIIl = llllllllllllIllllIlIllIlIIIIlIlI.length;
            char llllllllllllIllllIlIllIlIIIIlIII = (char)EnumStatus.lIllllIIlIIIII[0];
            while (lIIIIlIIIIIIlIII(llllllllllllIllllIlIllIlIIIIlIII, llllllllllllIllllIlIllIlIIIIlIIl)) {
                final char llllllllllllIllllIlIllIlIIIlIlIl = llllllllllllIllllIlIllIlIIIIlIlI[llllllllllllIllllIlIllIlIIIIlIII];
                llllllllllllIllllIlIllIlIIIlIIlI.append((char)(llllllllllllIllllIlIllIlIIIlIlIl ^ llllllllllllIllllIlIllIlIIIlIIIl[llllllllllllIllllIlIllIlIIIlIIII % llllllllllllIllllIlIllIlIIIlIIIl.length]));
                "".length();
                ++llllllllllllIllllIlIllIlIIIlIIII;
                ++llllllllllllIllllIlIllIlIIIIlIII;
                "".length();
                if ((0x5 ^ 0x0) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIlIllIlIIIlIIlI);
        }
        
        private static String lIIIIlIIIIIIIIIl(final String llllllllllllIllllIlIllIlIIlIIIlI, final String llllllllllllIllllIlIllIlIIlIIIIl) {
            try {
                final SecretKeySpec llllllllllllIllllIlIllIlIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), EnumStatus.lIllllIIlIIIII[7]), "DES");
                final Cipher llllllllllllIllllIlIllIlIIlIIllI = Cipher.getInstance("DES");
                llllllllllllIllllIlIllIlIIlIIllI.init(EnumStatus.lIllllIIlIIIII[2], llllllllllllIllllIlIllIlIIlIIlll);
                return new String(llllllllllllIllllIlIllIlIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIllIlIIlIIlIl) {
                llllllllllllIllllIlIllIlIIlIIlIl.printStackTrace();
                return null;
            }
        }
    }
    
    public enum EnumChatVisibility
    {
        private static final /* synthetic */ EnumChatVisibility[] ID_LOOKUP;
        
        HIDDEN(EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[4]], EnumChatVisibility.llIIlIlIIIllll[2], EnumChatVisibility.llIIlIlIIIllll[2], EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[5]]), 
        SYSTEM(EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[2]], EnumChatVisibility.llIIlIlIIIllll[1], EnumChatVisibility.llIIlIlIIIllll[1], EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[3]]), 
        FULL(EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[0]], EnumChatVisibility.llIIlIlIIIllll[0], EnumChatVisibility.llIIlIlIIIllll[0], EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[1]]);
        
        private static final /* synthetic */ String[] llIIlIlIIIlllI;
        private final /* synthetic */ String resourceKey;
        private static final /* synthetic */ int[] llIIlIlIIIllll;
        private final /* synthetic */ int chatVisibility;
        
        private static String lIIIllIIlllIIlll(final String llllllllllllIlllIIIllllllIIIIIII, final String llllllllllllIlllIIIlllllIlllllll) {
            try {
                final SecretKeySpec llllllllllllIlllIIIllllllIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllllIlllllll.getBytes(StandardCharsets.UTF_8)), EnumChatVisibility.llIIlIlIIIllll[7]), "DES");
                final Cipher llllllllllllIlllIIIllllllIIIIIlI = Cipher.getInstance("DES");
                llllllllllllIlllIIIllllllIIIIIlI.init(EnumChatVisibility.llIIlIlIIIllll[2], llllllllllllIlllIIIllllllIIIIIll);
                return new String(llllllllllllIlllIIIllllllIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllllllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIllllllIIIIIIl) {
                llllllllllllIlllIIIllllllIIIIIIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIIllIIlllIlIlI();
            lIIIllIIlllIlIIl();
            final EnumChatVisibility[] enum$VALUES = new EnumChatVisibility[EnumChatVisibility.llIIlIlIIIllll[3]];
            enum$VALUES[EnumChatVisibility.llIIlIlIIIllll[0]] = EnumChatVisibility.FULL;
            enum$VALUES[EnumChatVisibility.llIIlIlIIIllll[1]] = EnumChatVisibility.SYSTEM;
            enum$VALUES[EnumChatVisibility.llIIlIlIIIllll[2]] = EnumChatVisibility.HIDDEN;
            ENUM$VALUES = enum$VALUES;
            ID_LOOKUP = new EnumChatVisibility[values().length];
            final Exception llllllllllllIlllIIIllllllIlIIllI;
            final float llllllllllllIlllIIIllllllIlIIlll = ((EnumChatVisibility[])(Object)(llllllllllllIlllIIIllllllIlIIllI = (Exception)(Object)values())).length;
            boolean llllllllllllIlllIIIllllllIlIlIII = EnumChatVisibility.llIIlIlIIIllll[0] != 0;
            "".length();
            if ("   ".length() == (0xF ^ 0xB)) {
                return;
            }
            while (!lIIIllIIlllIlIll(llllllllllllIlllIIIllllllIlIlIII ? 1 : 0, (int)llllllllllllIlllIIIllllllIlIIlll)) {
                final EnumChatVisibility llllllllllllIlllIIIllllllIlIlIlI = llllllllllllIlllIIIllllllIlIIllI[llllllllllllIlllIIIllllllIlIlIII];
                EnumChatVisibility.ID_LOOKUP[llllllllllllIlllIIIllllllIlIlIlI.chatVisibility] = llllllllllllIlllIIIllllllIlIlIlI;
                ++llllllllllllIlllIIIllllllIlIlIII;
            }
        }
        
        private EnumChatVisibility(final String llllllllllllIlllIIIllllllIIlllII, final int llllllllllllIlllIIIllllllIIllIll, final int llllllllllllIlllIIIllllllIIlllll, final String llllllllllllIlllIIIllllllIIllIIl) {
            this.chatVisibility = llllllllllllIlllIIIllllllIIlllll;
            this.resourceKey = llllllllllllIlllIIIllllllIIllIIl;
        }
        
        private static boolean lIIIllIIlllIlIll(final int llllllllllllIlllIIIlllllIlIlIIll, final int llllllllllllIlllIIIlllllIlIlIIlI) {
            return llllllllllllIlllIIIlllllIlIlIIll >= llllllllllllIlllIIIlllllIlIlIIlI;
        }
        
        public int getChatVisibility() {
            return this.chatVisibility;
        }
        
        public static EnumChatVisibility getEnumChatVisibility(final int llllllllllllIlllIIIllllllIIlIIll) {
            return EnumChatVisibility.ID_LOOKUP[llllllllllllIlllIIIllllllIIlIIll % EnumChatVisibility.ID_LOOKUP.length];
        }
        
        private static boolean lIIIllIIlllIllII(final int llllllllllllIlllIIIlllllIlIIllll, final int llllllllllllIlllIIIlllllIlIIlllI) {
            return llllllllllllIlllIIIlllllIlIIllll < llllllllllllIlllIIIlllllIlIIlllI;
        }
        
        private static void lIIIllIIlllIlIIl() {
            (llIIlIlIIIlllI = new String[EnumChatVisibility.llIIlIlIIIllll[6]])[EnumChatVisibility.llIIlIlIIIllll[0]] = lIIIllIIlllIIllI("JQAPJg==", "cUCjO");
            EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[1]] = lIIIllIIlllIIllI("AhsiIQIDGHgrBQwfeD4EHgI0IQEEHy9mCxgHOg==", "mkVHm");
            EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[2]] = lIIIllIIlllIIlll("76Ff9AIrdu0=", "OSKKC");
            EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[3]] = lIIIllIIlllIIlll("J+kE8mROSlURFZ+z6JFhl//Ge63wAfQvKUHDWSWBrl8=", "Ssrah");
            EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[4]] = lIIIllIIlllIlIII("FPBAj6alRQg=", "fKgTU");
            EnumChatVisibility.llIIlIlIIIlllI[EnumChatVisibility.llIIlIlIIIllll[5]] = lIIIllIIlllIIllI("NT08HgE0PmYUBjs5ZgEHKSQqHgIzOTFZBjMpLBIA", "ZMHwn");
        }
        
        private static String lIIIllIIlllIIllI(String llllllllllllIlllIIIlllllIlIllllI, final String llllllllllllIlllIIIlllllIllIIIlI) {
            llllllllllllIlllIIIlllllIlIllllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlllllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIIlllllIllIIIIl = new StringBuilder();
            final char[] llllllllllllIlllIIIlllllIllIIIII = llllllllllllIlllIIIlllllIllIIIlI.toCharArray();
            int llllllllllllIlllIIIlllllIlIlllll = EnumChatVisibility.llIIlIlIIIllll[0];
            final double llllllllllllIlllIIIlllllIlIllIIl = (Object)llllllllllllIlllIIIlllllIlIllllI.toCharArray();
            final int llllllllllllIlllIIIlllllIlIllIII = llllllllllllIlllIIIlllllIlIllIIl.length;
            float llllllllllllIlllIIIlllllIlIlIlll = EnumChatVisibility.llIIlIlIIIllll[0];
            while (lIIIllIIlllIllII((int)llllllllllllIlllIIIlllllIlIlIlll, llllllllllllIlllIIIlllllIlIllIII)) {
                final char llllllllllllIlllIIIlllllIllIIlII = llllllllllllIlllIIIlllllIlIllIIl[llllllllllllIlllIIIlllllIlIlIlll];
                llllllllllllIlllIIIlllllIllIIIIl.append((char)(llllllllllllIlllIIIlllllIllIIlII ^ llllllllllllIlllIIIlllllIllIIIII[llllllllllllIlllIIIlllllIlIlllll % llllllllllllIlllIIIlllllIllIIIII.length]));
                "".length();
                ++llllllllllllIlllIIIlllllIlIlllll;
                ++llllllllllllIlllIIIlllllIlIlIlll;
                "".length();
                if (-(0x5C ^ 0x58) > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIIlllllIllIIIIl);
        }
        
        public String getResourceKey() {
            return this.resourceKey;
        }
        
        private static String lIIIllIIlllIlIII(final String llllllllllllIlllIIIlllllIlllIIIl, final String llllllllllllIlllIIIlllllIlllIIlI) {
            try {
                final SecretKeySpec llllllllllllIlllIIIlllllIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllllIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIIlllllIlllIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIIlllllIlllIlIl.init(EnumChatVisibility.llIIlIlIIIllll[2], llllllllllllIlllIIIlllllIlllIllI);
                return new String(llllllllllllIlllIIIlllllIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIlllllIlllIlII) {
                llllllllllllIlllIIIlllllIlllIlII.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIllIIlllIlIlI() {
            (llIIlIlIIIllll = new int[8])[0] = ((0xE ^ 0x11) & ~(0x1D ^ 0x2));
            EnumChatVisibility.llIIlIlIIIllll[1] = " ".length();
            EnumChatVisibility.llIIlIlIIIllll[2] = "  ".length();
            EnumChatVisibility.llIIlIlIIIllll[3] = "   ".length();
            EnumChatVisibility.llIIlIlIIIllll[4] = (0x2 ^ 0x6);
            EnumChatVisibility.llIIlIlIIIllll[5] = (0x45 ^ 0x40);
            EnumChatVisibility.llIIlIlIIIllll[6] = (142 + 84 - 213 + 155 ^ 93 + 88 - 49 + 42);
            EnumChatVisibility.llIIlIlIIIllll[7] = (0x5D ^ 0xD ^ (0xC7 ^ 0x9F));
        }
    }
}
