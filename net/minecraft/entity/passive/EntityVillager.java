// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.util.MathHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Tuple;
import java.util.Random;
import net.minecraft.world.DifficultyInstance;
import java.util.Arrays;
import net.minecraft.stats.StatList;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIVillagerInteract;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.EntityLivingBase;
import java.util.Iterator;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.village.MerchantRecipe;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHarvestFarmland;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.entity.INpc;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.EntityAgeable;

public class EntityVillager extends EntityAgeable implements IMerchant, INpc
{
    private /* synthetic */ int randomTickDivider;
    private /* synthetic */ boolean areAdditionalTasksSet;
    private /* synthetic */ InventoryBasic villagerInventory;
    /* synthetic */ Village villageObj;
    private /* synthetic */ int wealth;
    private /* synthetic */ boolean isPlaying;
    private /* synthetic */ int careerId;
    private /* synthetic */ MerchantRecipeList buyingList;
    private /* synthetic */ boolean isWillingToMate;
    private static final /* synthetic */ ITradeList[][][][] DEFAULT_TRADE_LIST_MAP;
    private /* synthetic */ EntityPlayer buyingPlayer;
    private /* synthetic */ String lastBuyingPlayer;
    private /* synthetic */ boolean isMating;
    private /* synthetic */ int timeUntilReset;
    private static final /* synthetic */ int[] lIlIlIIIIlllIl;
    private /* synthetic */ int careerLevel;
    private /* synthetic */ boolean needsInitilization;
    private static final /* synthetic */ String[] lIlIlIIIIllIll;
    private /* synthetic */ boolean isLookingForHome;
    
    private static boolean lllIlIllIIlIlll(final int lllllllllllllIIIlIlIllIIllIlIIll, final int lllllllllllllIIIlIlIllIIllIlIIlI) {
        return lllllllllllllIIIlIlIllIIllIlIIll != lllllllllllllIIIlIlIllIIllIlIIlI;
    }
    
    public boolean func_175557_cr() {
        int n;
        if (lllIlIllIIIlllI(this.getProfession())) {
            n = EntityVillager.lIlIlIIIIlllIl[5];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x8D ^ 0x9F ^ (0x3F ^ 0x5)) & (0xE3 ^ 0xB4 ^ 29 + 15 + 76 + 7 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityVillager.lIlIlIIIIlllIl[1];
        }
        final boolean lllllllllllllIIIlIlIllIlIlIllIII = n != 0;
        int n2;
        if (lllIlIllIIIllll(lllllllllllllIIIlIlIllIlIlIllIII ? 1 : 0)) {
            if (lllIlIllIIIllll(this.hasEnoughItems(EntityVillager.lIlIlIIIIlllIl[0]) ? 1 : 0)) {
                n2 = EntityVillager.lIlIlIIIIlllIl[1];
                "".length();
                if (null != null) {
                    return ((0xB5 ^ 0x96 ^ (0x6E ^ 0x17)) & (0xA7 ^ 0xAC ^ (0x40 ^ 0x11) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = EntityVillager.lIlIlIIIIlllIl[5];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0xB7 ^ 0x96 ^ (0x18 ^ 0x3E)) & (0x22 ^ 0xB ^ (0xA3 ^ 0x8D) ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lllIlIllIIIllll(this.hasEnoughItems(EntityVillager.lIlIlIIIIlllIl[5]) ? 1 : 0)) {
            n2 = EntityVillager.lIlIlIIIIlllIl[1];
            "".length();
            if (((0x79 ^ 0x37) & ~(0x69 ^ 0x27)) <= -" ".length()) {
                return ((0x2A ^ 0x68) & ~(0x75 ^ 0x37)) != 0x0;
            }
        }
        else {
            n2 = EntityVillager.lIlIlIIIIlllIl[5];
        }
        return n2 != 0;
    }
    
    @Override
    protected void onGrowingAdult() {
        if (lllIlIllIIIlllI(this.getProfession())) {
            this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[12], new EntityAIHarvestFarmland(this, 0.6));
        }
        super.onGrowingAdult();
    }
    
    @Override
    protected void updateEquipmentIfNeeded(final EntityItem lllllllllllllIIIlIlIllIlIllIlllI) {
        final ItemStack lllllllllllllIIIlIlIllIlIllIllIl = lllllllllllllIIIlIlIllIlIllIlllI.getEntityItem();
        final Item lllllllllllllIIIlIlIllIlIllIllII = lllllllllllllIIIlIlIllIlIllIllIl.getItem();
        if (lllIlIllIIIllll(this.canVillagerPickupItem(lllllllllllllIIIlIlIllIlIllIllII) ? 1 : 0)) {
            final ItemStack lllllllllllllIIIlIlIllIlIllIlIll = this.villagerInventory.func_174894_a(lllllllllllllIIIlIlIllIlIllIllIl);
            if (lllIlIllIIlIIIl(lllllllllllllIIIlIlIllIlIllIlIll)) {
                lllllllllllllIIIlIlIllIlIllIlllI.setDead();
                "".length();
                if (((141 + 112 - 138 + 42 ^ 139 + 131 - 226 + 104) & (0xC2 ^ 0xA1 ^ (0xE6 ^ 0x8C) ^ -" ".length())) > 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlIlIllIlIllIllIl.stackSize = lllllllllllllIIIlIlIllIlIllIlIll.stackSize;
            }
        }
    }
    
    public boolean func_175553_cp() {
        return this.hasEnoughItems(EntityVillager.lIlIlIIIIlllIl[5]);
    }
    
    private static boolean lllIlIllIIlIlII(final Object lllllllllllllIIIlIlIllIIlllIIIll, final Object lllllllllllllIIIlIlIllIIlllIIIlI) {
        return lllllllllllllIIIlIlIllIIlllIIIll == lllllllllllllIIIlIlIllIIlllIIIlI;
    }
    
    private boolean canVillagerPickupItem(final Item lllllllllllllIIIlIlIllIlIllIIIlI) {
        if (lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIllIIIlI, Items.bread) && lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIllIIIlI, Items.potato) && lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIllIIIlI, Items.carrot) && lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIllIIIlI, Items.wheat) && lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIllIIIlI, Items.wheat_seeds)) {
            return EntityVillager.lIlIlIIIIlllIl[1] != 0;
        }
        return EntityVillager.lIlIlIIIIlllIl[5] != 0;
    }
    
    private static boolean lllIlIllIIlIIll(final Object lllllllllllllIIIlIlIllIIlllIIllI) {
        return lllllllllllllIIIlIlIllIIlllIIllI != null;
    }
    
    private static String lllIlIlIlllIlII(String lllllllllllllIIIlIlIllIlIIIllllI, final String lllllllllllllIIIlIlIllIlIIlIIIlI) {
        lllllllllllllIIIlIlIllIlIIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIllIlIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIllIlIIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIIIlIlIllIlIIlIIIII = lllllllllllllIIIlIlIllIlIIlIIIlI.toCharArray();
        int lllllllllllllIIIlIlIllIlIIIlllll = EntityVillager.lIlIlIIIIlllIl[1];
        final float lllllllllllllIIIlIlIllIlIIIllIIl = (Object)lllllllllllllIIIlIlIllIlIIIllllI.toCharArray();
        final String lllllllllllllIIIlIlIllIlIIIllIII = (String)lllllllllllllIIIlIlIllIlIIIllIIl.length;
        boolean lllllllllllllIIIlIlIllIlIIIlIlll = EntityVillager.lIlIlIIIIlllIl[1] != 0;
        while (lllIlIllIIllIlI(lllllllllllllIIIlIlIllIlIIIlIlll ? 1 : 0, (int)lllllllllllllIIIlIlIllIlIIIllIII)) {
            final char lllllllllllllIIIlIlIllIlIIlIIlII = lllllllllllllIIIlIlIllIlIIIllIIl[lllllllllllllIIIlIlIllIlIIIlIlll];
            lllllllllllllIIIlIlIllIlIIlIIIIl.append((char)(lllllllllllllIIIlIlIllIlIIlIIlII ^ lllllllllllllIIIlIlIllIlIIlIIIII[lllllllllllllIIIlIlIllIlIIIlllll % lllllllllllllIIIlIlIllIlIIlIIIII.length]));
            "".length();
            ++lllllllllllllIIIlIlIllIlIIIlllll;
            ++lllllllllllllIIIlIlIllIlIIIlIlll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIllIlIIlIIIIl);
    }
    
    private static void lllIlIllIIIllIl() {
        (lIlIlIIIIlllIl = new int[52])[0] = (0x1B ^ 0x1E);
        EntityVillager.lIlIlIIIIlllIl[1] = ((3 + 37 + 12 + 117 ^ 153 + 128 - 274 + 151) & (0x60 ^ 0x9 ^ (0xF ^ 0x51) ^ -" ".length()));
        EntityVillager.lIlIlIIIIlllIl[2] = (131 + 48 - 98 + 78 ^ 0 + 110 - 53 + 98);
        EntityVillager.lIlIlIIIIlllIl[3] = (16 + 103 - 81 + 101 ^ 102 + 57 - 137 + 131);
        EntityVillager.lIlIlIIIIlllIl[4] = (64 + 66 - 26 + 29 ^ 87 + 63 - 17 + 14);
        EntityVillager.lIlIlIIIIlllIl[5] = " ".length();
        EntityVillager.lIlIlIIIIlllIl[6] = (0x12 ^ 0x27 ^ (0x9E ^ 0xA4));
        EntityVillager.lIlIlIIIIlllIl[7] = (((0xBC ^ 0x93) & ~(0x68 ^ 0x47)) ^ (0x41 ^ 0x52));
        EntityVillager.lIlIlIIIIlllIl[8] = "  ".length();
        EntityVillager.lIlIlIIIIlllIl[9] = "   ".length();
        EntityVillager.lIlIlIIIIlllIl[10] = -(0x13 ^ 0x47 ^ (0xCC ^ 0x9C));
        EntityVillager.lIlIlIIIIlllIl[11] = -"  ".length();
        EntityVillager.lIlIlIIIIlllIl[12] = (0x36 ^ 0x3E);
        EntityVillager.lIlIlIIIIlllIl[13] = (0x5F ^ 0x52);
        EntityVillager.lIlIlIIIIlllIl[14] = -"   ".length();
        EntityVillager.lIlIlIIIIlllIl[15] = (0x1F ^ 0x18);
        EntityVillager.lIlIlIIIIlllIl[16] = (0x38 ^ 0x53 ^ (0x15 ^ 0x72));
        EntityVillager.lIlIlIIIIlllIl[17] = -(0xC1 ^ 0xC4);
        EntityVillager.lIlIlIIIIlllIl[18] = -(0x16 ^ 0x1D ^ (0xAF ^ 0xA3));
        EntityVillager.lIlIlIIIIlllIl[19] = -(0x88 ^ 0x8E);
        EntityVillager.lIlIlIIIIlllIl[20] = -(0x66 ^ 0x31 ^ (0xD5 ^ 0x88));
        EntityVillager.lIlIlIIIIlllIl[21] = (0xBF ^ 0xAB);
        EntityVillager.lIlIlIIIIlllIl[22] = (0x8A ^ 0x9A);
        EntityVillager.lIlIlIIIIlllIl[23] = (0x29 ^ 0x31);
        EntityVillager.lIlIlIIIIlllIl[24] = (0x1D ^ 0x1B);
        EntityVillager.lIlIlIIIIlllIl[25] = (0xB2 ^ 0xBB);
        EntityVillager.lIlIlIIIIlllIl[26] = (0x3B ^ 0x31);
        EntityVillager.lIlIlIIIIlllIl[27] = (0x1 ^ 0xA);
        EntityVillager.lIlIlIIIIlllIl[28] = (0xB0 ^ 0xA7 ^ (0x33 ^ 0x2A));
        EntityVillager.lIlIlIIIIlllIl[29] = -(0x78 ^ 0x74);
        EntityVillager.lIlIlIIIIlllIl[30] = -(8 + 65 + 16 + 42 ^ 54 + 122 - 154 + 117);
        EntityVillager.lIlIlIIIIlllIl[31] = (0x24 ^ 0x4 ^ (0x5F ^ 0x5B));
        EntityVillager.lIlIlIIIIlllIl[32] = (189 + 163 - 259 + 146 ^ 36 + 16 - 30 + 177);
        EntityVillager.lIlIlIIIIlllIl[33] = -" ".length();
        EntityVillager.lIlIlIIIIlllIl[34] = (0x81 ^ 0xC1 ^ (0x4F ^ 0x49));
        EntityVillager.lIlIlIIIIlllIl[35] = (0x7D ^ 0x23 ^ (0x4E ^ 0x22));
        EntityVillager.lIlIlIIIIlllIl[36] = (0x3E ^ 0x1E);
        EntityVillager.lIlIlIIIIlllIl[37] = 161 + 96 - 188 + 96 + (0x4A ^ 0x45) - (0xB6 ^ 0x93) + (0xE ^ 0x37);
        EntityVillager.lIlIlIIIIlllIl[38] = (16 + 77 + 16 + 45 ^ 132 + 6 - 16 + 17);
        EntityVillager.lIlIlIIIIlllIl[39] = (0x8 ^ 0x1D);
        EntityVillager.lIlIlIIIIlllIl[40] = (0x64 ^ 0x73);
        EntityVillager.lIlIlIIIIlllIl[41] = (115 + 61 - 95 + 77 ^ 17 + 111 - 124 + 131);
        EntityVillager.lIlIlIIIIlllIl[42] = (0x90 ^ 0x8A);
        EntityVillager.lIlIlIIIIlllIl[43] = (8 + 177 - 76 + 76 ^ 45 + 18 - 31 + 130);
        EntityVillager.lIlIlIIIIlllIl[44] = (0x1E ^ 0x77 ^ (0x6F ^ 0x1A));
        EntityVillager.lIlIlIIIIlllIl[45] = (23 + 143 - 52 + 46 ^ 166 + 18 - 19 + 24);
        EntityVillager.lIlIlIIIIlllIl[46] = (0x8D ^ 0xBF ^ (0x49 ^ 0x65));
        EntityVillager.lIlIlIIIIlllIl[47] = (0x23 ^ 0x3C);
        EntityVillager.lIlIlIIIIlllIl[48] = (0xBA ^ 0x9B);
        EntityVillager.lIlIlIIIIlllIl[49] = (135 + 28 - 45 + 110 ^ 80 + 21 - 60 + 157);
        EntityVillager.lIlIlIIIIlllIl[50] = (-(0xFFFFCDFF & 0x3ED2) & (0xFFFFADFF & 0x5FFD));
        EntityVillager.lIlIlIIIIlllIl[51] = (0xBB ^ 0x83 ^ (0xDD ^ 0xC6));
    }
    
    public boolean isFarmItemInInventory() {
        int lllllllllllllIIIlIlIllIlIlIIIIlI = EntityVillager.lIlIlIIIIlllIl[1];
        "".length();
        if ("   ".length() <= -" ".length()) {
            return ((0x47 ^ 0x74 ^ (0x5E ^ 0x45)) & (0x59 ^ 0x22 ^ (0xDE ^ 0x8D) ^ -" ".length())) != 0x0;
        }
        while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIlIlIIIIlI, this.villagerInventory.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIllIlIlIIIIIl = this.villagerInventory.getStackInSlot(lllllllllllllIIIlIlIllIlIlIIIIlI);
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIlIlIIIIIl) && (!lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIlIIIIIl.getItem(), Items.wheat_seeds) || !lllIlIllIIlIllI(lllllllllllllIIIlIlIllIlIlIIIIIl.getItem(), Items.potato) || lllIlIllIIlIlII(lllllllllllllIIIlIlIllIlIlIIIIIl.getItem(), Items.carrot))) {
                return EntityVillager.lIlIlIIIIlllIl[5] != 0;
            }
            ++lllllllllllllIIIlIlIllIlIlIIIIlI;
        }
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIlIlIlllIIlIlllIl) {
        super.writeEntityToNBT(lllllllllllllIIIlIlIlllIIlIlllIl);
        lllllllllllllIIIlIlIlllIIlIlllIl.setInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[5]], this.getProfession());
        lllllllllllllIIIlIlIlllIIlIlllIl.setInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[8]], this.wealth);
        lllllllllllllIIIlIlIlllIIlIlllIl.setInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[9]], this.careerId);
        lllllllllllllIIIlIlIlllIIlIlllIl.setInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[2]], this.careerLevel);
        lllllllllllllIIIlIlIlllIIlIlllIl.setBoolean(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[0]], this.isWillingToMate);
        if (lllIlIllIIlIIll(this.buyingList)) {
            lllllllllllllIIIlIlIlllIIlIlllIl.setTag(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[24]], this.buyingList.getRecipiesAsTags());
        }
        final NBTTagList lllllllllllllIIIlIlIlllIIlIlllII = new NBTTagList();
        int lllllllllllllIIIlIlIlllIIlIllIll = EntityVillager.lIlIlIIIIlllIl[1];
        "".length();
        if ((143 + 142 - 231 + 96 ^ 21 + 88 - 76 + 113) != (0xFA ^ 0x84 ^ (0xCB ^ 0xB1))) {
            return;
        }
        while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIlllIIlIllIll, this.villagerInventory.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIlllIIlIllIlI = this.villagerInventory.getStackInSlot(lllllllllllllIIIlIlIlllIIlIllIll);
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIlIllIlI)) {
                lllllllllllllIIIlIlIlllIIlIlllII.appendTag(lllllllllllllIIIlIlIlllIIlIllIlI.writeToNBT(new NBTTagCompound()));
            }
            ++lllllllllllllIIIlIlIlllIIlIllIll;
        }
        lllllllllllllIIIlIlIlllIIlIlllIl.setTag(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[15]], lllllllllllllIIIlIlIlllIIlIlllII);
    }
    
    private static boolean lllIlIllIIllIlI(final int lllllllllllllIIIlIlIllIIllllIIIl, final int lllllllllllllIIIlIlIllIIllllIIII) {
        return lllllllllllllIIIlIlIllIIllllIIIl < lllllllllllllIIIlIlIllIIllllIIII;
    }
    
    @Override
    public void onStruckByLightning(final EntityLightningBolt lllllllllllllIIIlIlIllIlIllllIll) {
        if (lllIlIllIIIlllI(this.worldObj.isRemote ? 1 : 0) && lllIlIllIIIlllI(this.isDead ? 1 : 0)) {
            final EntityWitch lllllllllllllIIIlIlIllIlIllllIlI = new EntityWitch(this.worldObj);
            lllllllllllllIIIlIlIllIlIllllIlI.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            lllllllllllllIIIlIlIllIlIllllIlI.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(lllllllllllllIIIlIlIllIlIllllIlI)), null);
            "".length();
            lllllllllllllIIIlIlIllIlIllllIlI.setNoAI(this.isAIDisabled());
            if (lllIlIllIIIllll(this.hasCustomName() ? 1 : 0)) {
                lllllllllllllIIIlIlIllIlIllllIlI.setCustomNameTag(this.getCustomNameTag());
                lllllllllllllIIIlIlIllIlIllllIlI.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
            }
            this.worldObj.spawnEntityInWorld(lllllllllllllIIIlIlIllIlIllllIlI);
            "".length();
            this.setDead();
        }
    }
    
    @Override
    public IChatComponent getDisplayName() {
        final String lllllllllllllIIIlIlIllIllIlllIII = this.getCustomNameTag();
        if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIllIlllIII) && lllIlIllIIlIIlI(lllllllllllllIIIlIlIllIllIlllIII.length())) {
            final ChatComponentText lllllllllllllIIIlIlIllIllIllIlll = new ChatComponentText(lllllllllllllIIIlIlIllIllIlllIII);
            lllllllllllllIIIlIlIllIllIllIlll.getChatStyle().setChatHoverEvent(this.getHoverEvent());
            "".length();
            lllllllllllllIIIlIlIllIllIllIlll.getChatStyle().setInsertion(this.getUniqueID().toString());
            "".length();
            return lllllllllllllIIIlIlIllIllIllIlll;
        }
        if (lllIlIllIIlIIIl(this.buyingList)) {
            this.populateBuyingList();
        }
        String lllllllllllllIIIlIlIllIllIllIllI = null;
        switch (this.getProfession()) {
            case 0: {
                if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[5])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[40]];
                    "".length();
                    if ("   ".length() == " ".length()) {
                        return null;
                    }
                    break;
                }
                else if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[8])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[23]];
                    "".length();
                    if (" ".length() < 0) {
                        return null;
                    }
                    break;
                }
                else if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[9])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[41]];
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                else {
                    if (!lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[2])) {
                        break;
                    }
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[42]];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                    break;
                }
                break;
            }
            case 1: {
                lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[43]];
                "".length();
                if (((0x66 ^ 0x33) & ~(0xED ^ 0xB8)) != 0x0) {
                    return null;
                }
                break;
            }
            case 2: {
                lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[44]];
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            case 3: {
                if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[5])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[45]];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                    break;
                }
                else if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[8])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[46]];
                    "".length();
                    if ("  ".length() < ((0x5B ^ 0x6F ^ (0x1A ^ 0x4E)) & (0xCB ^ 0x9F ^ (0xB7 ^ 0x83) ^ -" ".length()))) {
                        return null;
                    }
                    break;
                }
                else {
                    if (!lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[9])) {
                        break;
                    }
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[47]];
                    "".length();
                    if ((110 + 48 + 7 + 23 ^ 18 + 83 - 74 + 158) == 0x0) {
                        return null;
                    }
                    break;
                }
                break;
            }
            case 4: {
                if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[5])) {
                    lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[36]];
                    "".length();
                    if (((56 + 181 - 233 + 185 ^ 59 + 10 + 57 + 27) & (((0xB4 ^ 0xB3) & ~(0xB6 ^ 0xB1)) ^ (0xE6 ^ 0xC2) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    break;
                }
                else {
                    if (lllIlIllIIllIll(this.careerId, EntityVillager.lIlIlIIIIlllIl[8])) {
                        lllllllllllllIIIlIlIllIllIllIllI = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[48]];
                        break;
                    }
                    break;
                }
                break;
            }
        }
        if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIllIllIllI)) {
            final ChatComponentTranslation lllllllllllllIIIlIlIllIllIllIlIl = new ChatComponentTranslation(String.valueOf(new StringBuilder(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[49]]).append(lllllllllllllIIIlIlIllIllIllIllI)), new Object[EntityVillager.lIlIlIIIIlllIl[1]]);
            lllllllllllllIIIlIlIllIllIllIlIl.getChatStyle().setChatHoverEvent(this.getHoverEvent());
            "".length();
            lllllllllllllIIIlIlIllIllIllIlIl.getChatStyle().setInsertion(this.getUniqueID().toString());
            "".length();
            return lllllllllllllIIIlIlIllIllIllIlIl;
        }
        return super.getDisplayName();
    }
    
    private static String lllIlIlIlllIllI(final String lllllllllllllIIIlIlIllIIllllllll, final String lllllllllllllIIIlIlIllIIlllllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIllIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIllIIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIllIlIIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIllIlIIIIIIll.init(EntityVillager.lIlIlIIIIlllIl[8], lllllllllllllIIIlIlIllIlIIIIIlII);
            return new String(lllllllllllllIIIlIlIllIlIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIllIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIllIlIIIIIIlI) {
            lllllllllllllIIIlIlIllIlIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void updateAITasks() {
        final int n = this.randomTickDivider - EntityVillager.lIlIlIIIIlllIl[5];
        this.randomTickDivider = n;
        if (lllIlIllIIlIIII(n)) {
            final BlockPos lllllllllllllIIIlIlIlllIIllllIII = new BlockPos(this);
            this.worldObj.getVillageCollection().addToVillagerPositionList(lllllllllllllIIIlIlIlllIIllllIII);
            this.randomTickDivider = EntityVillager.lIlIlIIIIlllIl[34] + this.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[35]);
            this.villageObj = this.worldObj.getVillageCollection().getNearestVillage(lllllllllllllIIIlIlIlllIIllllIII, EntityVillager.lIlIlIIIIlllIl[36]);
            if (lllIlIllIIlIIIl(this.villageObj)) {
                this.detachHome();
                "".length();
                if (((0x5E ^ 0x1A ^ (0xF ^ 0x6F)) & (41 + 59 - 96 + 131 ^ 127 + 109 - 111 + 38 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                final BlockPos lllllllllllllIIIlIlIlllIIlllIlll = this.villageObj.getCenter();
                this.setHomePosAndDistance(lllllllllllllIIIlIlIlllIIlllIlll, (int)(this.villageObj.getVillageRadius() * 1.0f));
                if (lllIlIllIIIllll(this.isLookingForHome ? 1 : 0)) {
                    this.isLookingForHome = (EntityVillager.lIlIlIIIIlllIl[1] != 0);
                    this.villageObj.setDefaultPlayerReputation(EntityVillager.lIlIlIIIIlllIl[0]);
                }
            }
        }
        if (lllIlIllIIIlllI(this.isTrading() ? 1 : 0) && lllIlIllIIlIIlI(this.timeUntilReset)) {
            this.timeUntilReset -= EntityVillager.lIlIlIIIIlllIl[5];
            if (lllIlIllIIlIIII(this.timeUntilReset)) {
                if (lllIlIllIIIllll(this.needsInitilization ? 1 : 0)) {
                    final Iterator<MerchantRecipe> iterator = this.buyingList.iterator();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    while (!lllIlIllIIIlllI(iterator.hasNext() ? 1 : 0)) {
                        final MerchantRecipe lllllllllllllIIIlIlIlllIIlllIllI = iterator.next();
                        if (lllIlIllIIIllll(lllllllllllllIIIlIlIlllIIlllIllI.isRecipeDisabled() ? 1 : 0)) {
                            lllllllllllllIIIlIlIlllIIlllIllI.increaseMaxTradeUses(this.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[24]) + this.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[24]) + EntityVillager.lIlIlIIIIlllIl[8]);
                        }
                    }
                    this.populateBuyingList();
                    this.needsInitilization = (EntityVillager.lIlIlIIIIlllIl[1] != 0);
                    if (lllIlIllIIlIIll(this.villageObj) && lllIlIllIIlIIll(this.lastBuyingPlayer)) {
                        this.worldObj.setEntityState(this, (byte)EntityVillager.lIlIlIIIIlllIl[28]);
                        this.villageObj.setReputationForPlayer(this.lastBuyingPlayer, EntityVillager.lIlIlIIIIlllIl[5]);
                        "".length();
                    }
                }
                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, EntityVillager.lIlIlIIIIlllIl[37], EntityVillager.lIlIlIIIIlllIl[1]));
            }
        }
        super.updateAITasks();
    }
    
    private static boolean lllIlIllIIlIllI(final Object lllllllllllllIIIlIlIllIIlllIlIIl, final Object lllllllllllllIIIlIlIllIIlllIlIII) {
        return lllllllllllllIIIlIlIllIIlllIlIIl != lllllllllllllIIIlIlIllIIlllIlIII;
    }
    
    @Override
    public boolean replaceItemInInventory(final int lllllllllllllIIIlIlIllIlIIlllIII, final ItemStack lllllllllllllIIIlIlIllIlIIllIIll) {
        if (lllIlIllIIIllll(super.replaceItemInInventory(lllllllllllllIIIlIlIllIlIIlllIII, lllllllllllllIIIlIlIllIlIIllIIll) ? 1 : 0)) {
            return EntityVillager.lIlIlIIIIlllIl[5] != 0;
        }
        final int lllllllllllllIIIlIlIllIlIIllIllI = lllllllllllllIIIlIlIllIlIIlllIII - EntityVillager.lIlIlIIIIlllIl[50];
        if (lllIlIllIIllIIl(lllllllllllllIIIlIlIllIlIIllIllI) && lllIlIllIIllIlI(lllllllllllllIIIlIlIllIlIIllIllI, this.villagerInventory.getSizeInventory())) {
            this.villagerInventory.setInventorySlotContents(lllllllllllllIIIlIlIllIlIIllIllI, lllllllllllllIIIlIlIllIlIIllIIll);
            return EntityVillager.lIlIlIIIIlllIl[5] != 0;
        }
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    @Override
    public void setRevengeTarget(final EntityLivingBase lllllllllllllIIIlIlIlllIIIIlllll) {
        super.setRevengeTarget(lllllllllllllIIIlIlIlllIIIIlllll);
        if (lllIlIllIIlIIll(this.villageObj) && lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIIIlllll)) {
            this.villageObj.addOrRenewAgressor(lllllllllllllIIIlIlIlllIIIIlllll);
            if (lllIlIllIIIllll((lllllllllllllIIIlIlIlllIIIIlllll instanceof EntityPlayer) ? 1 : 0)) {
                int lllllllllllllIIIlIlIlllIIIIllllI = EntityVillager.lIlIlIIIIlllIl[33];
                if (lllIlIllIIIllll(this.isChild() ? 1 : 0)) {
                    lllllllllllllIIIlIlIlllIIIIllllI = EntityVillager.lIlIlIIIIlllIl[14];
                }
                this.villageObj.setReputationForPlayer(lllllllllllllIIIlIlIlllIIIIlllll.getName(), lllllllllllllIIIlIlIlllIIIIllllI);
                "".length();
                if (lllIlIllIIIllll(this.isEntityAlive() ? 1 : 0)) {
                    this.worldObj.setEntityState(this, (byte)EntityVillager.lIlIlIIIIlllIl[13]);
                }
            }
        }
    }
    
    private static boolean lllIlIllIIlIIII(final int lllllllllllllIIIlIlIllIIllIllIII) {
        return lllllllllllllIIIlIlIllIIllIllIII <= 0;
    }
    
    public int getProfession() {
        return Math.max(this.dataWatcher.getWatchableObjectInt(EntityVillager.lIlIlIIIIlllIl[22]) % EntityVillager.lIlIlIIIIlllIl[0], EntityVillager.lIlIlIIIIlllIl[1]);
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIIlIlIllIllIlIIlIl) {
        if (lllIlIllIIllIll(lllllllllllllIIIlIlIllIllIlIIlIl, EntityVillager.lIlIlIIIIlllIl[16])) {
            this.spawnParticles(EnumParticleTypes.HEART);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIlIllIIllIll(lllllllllllllIIIlIlIllIllIlIIlIl, EntityVillager.lIlIlIIIIlllIl[13])) {
            this.spawnParticles(EnumParticleTypes.VILLAGER_ANGRY);
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else if (lllIlIllIIllIll(lllllllllllllIIIlIlIllIllIlIIlIl, EntityVillager.lIlIlIIIIlllIl[28])) {
            this.spawnParticles(EnumParticleTypes.VILLAGER_HAPPY);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIIlIlIllIllIlIIlIl);
        }
    }
    
    @Override
    public void useRecipe(final MerchantRecipe lllllllllllllIIIlIlIllIllllIIllI) {
        lllllllllllllIIIlIlIllIllllIIllI.incrementToolUses();
        this.livingSoundTime = -this.getTalkInterval();
        this.playSound(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[21]], this.getSoundVolume(), this.getSoundPitch());
        int lllllllllllllIIIlIlIllIllllIlIII = EntityVillager.lIlIlIIIIlllIl[9] + this.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[2]);
        if (!lllIlIllIIlIlll(lllllllllllllIIIlIlIllIllllIIllI.getToolUses(), EntityVillager.lIlIlIIIIlllIl[5]) || lllIlIllIIIlllI(this.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[0]))) {
            this.timeUntilReset = EntityVillager.lIlIlIIIIlllIl[32];
            this.needsInitilization = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
            this.isWillingToMate = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
            if (lllIlIllIIlIIll(this.buyingPlayer)) {
                this.lastBuyingPlayer = this.buyingPlayer.getName();
                "".length();
                if (((0x53 ^ 0x38 ^ (0xD ^ 0x34)) & (0xA9 ^ 0xC1 ^ (0x1B ^ 0x21) ^ -" ".length())) < ((0x67 ^ 0x36 ^ (0x4B ^ 0x25)) & (0xFB ^ 0x80 ^ (0x23 ^ 0x67) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.lastBuyingPlayer = null;
            }
            lllllllllllllIIIlIlIllIllllIlIII += 5;
        }
        if (lllIlIllIIlIlII(lllllllllllllIIIlIlIllIllllIIllI.getItemToBuy().getItem(), Items.emerald)) {
            this.wealth += lllllllllllllIIIlIlIllIllllIIllI.getItemToBuy().stackSize;
        }
        if (lllIlIllIIIllll(lllllllllllllIIIlIlIllIllllIIllI.getRewardsExp() ? 1 : 0)) {
            this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY + 0.5, this.posZ, lllllllllllllIIIlIlIllIllllIlIII));
            "".length();
        }
    }
    
    @Override
    public void setRecipes(final MerchantRecipeList lllllllllllllIIIlIlIllIllIlllllI) {
    }
    
    @Override
    public EntityPlayer getCustomer() {
        return this.buyingPlayer;
    }
    
    private boolean hasEnoughItems(final int lllllllllllllIIIlIlIllIlIlIIllll) {
        int n;
        if (lllIlIllIIIlllI(this.getProfession())) {
            n = EntityVillager.lIlIlIIIIlllIl[5];
            "".length();
            if (-" ".length() > 0) {
                return ((0x32 ^ 0x24) & ~(0x51 ^ 0x47) & ~((0x31 ^ 0x2C) & ~(0x44 ^ 0x59))) != 0x0;
            }
        }
        else {
            n = EntityVillager.lIlIlIIIIlllIl[1];
        }
        final boolean lllllllllllllIIIlIlIllIlIlIIlllI = n != 0;
        int lllllllllllllIIIlIlIllIlIlIIllIl = EntityVillager.lIlIlIIIIlllIl[1];
        "".length();
        if ("  ".length() <= 0) {
            return ((161 + 40 - 153 + 169 ^ 126 + 131 - 143 + 33) & (23 + 180 + 45 + 0 ^ 157 + 120 - 240 + 141 ^ -" ".length())) != 0x0;
        }
        while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIlIlIIllIl, this.villagerInventory.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIllIlIlIIllII = this.villagerInventory.getStackInSlot(lllllllllllllIIIlIlIllIlIlIIllIl);
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIlIlIIllII)) {
                if ((lllIlIllIIlIlII(lllllllllllllIIIlIlIllIlIlIIllII.getItem(), Items.bread) && !lllIlIllIIllIlI(lllllllllllllIIIlIlIllIlIlIIllII.stackSize, EntityVillager.lIlIlIIIIlllIl[9] * lllllllllllllIIIlIlIllIlIlIIllll)) || (lllIlIllIIlIlII(lllllllllllllIIIlIlIllIlIlIIllII.getItem(), Items.potato) && !lllIlIllIIllIlI(lllllllllllllIIIlIlIllIlIlIIllII.stackSize, EntityVillager.lIlIlIIIIlllIl[16] * lllllllllllllIIIlIlIllIlIlIIllll)) || (lllIlIllIIlIlII(lllllllllllllIIIlIlIllIlIlIIllII.getItem(), Items.carrot) && lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIlIlIIllII.stackSize, EntityVillager.lIlIlIIIIlllIl[16] * lllllllllllllIIIlIlIllIlIlIIllll))) {
                    return EntityVillager.lIlIlIIIIlllIl[5] != 0;
                }
                if (lllIlIllIIIllll(lllllllllllllIIIlIlIllIlIlIIlllI ? 1 : 0) && lllIlIllIIlIlII(lllllllllllllIIIlIlIllIlIlIIllII.getItem(), Items.wheat) && lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIlIlIIllII.stackSize, EntityVillager.lIlIlIIIIlllIl[25] * lllllllllllllIIIlIlIllIlIlIIllll)) {
                    return EntityVillager.lIlIlIIIIlllIl[5] != 0;
                }
            }
            ++lllllllllllllIIIlIlIllIlIlIIllIl;
        }
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    private static void lllIlIlIllllllI() {
        (lIlIlIIIIllIll = new String[EntityVillager.lIlIlIIIIlllIl[51]])[EntityVillager.lIlIlIIIIlllIl[1]] = lllIlIlIlllIlII("LxIvOis=", "ffJWX");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[5]] = lllIlIlIlllIlIl("nfuwnnauYGtVWphmtLox/Q==", "kTBGS");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[8]] = lllIlIlIlllIllI("lWg9WqCpguQ=", "vlpYa");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[9]] = lllIlIlIlllIllI("RGLs7WTkgRk=", "IPfTh");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[2]] = lllIlIlIlllIlII("MSwHAhEAARARER4=", "rMugt");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[0]] = lllIlIlIlllIlII("NhwkKB8PEg==", "auHDv");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[24]] = lllIlIlIlllIlIl("f61RWr3MQn8=", "LodmN");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[15]] = lllIlIlIlllIlIl("B/u1n51Maq4NaNS0+N3IkQ==", "xulzh");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[12]] = lllIlIlIlllIllI("4wxIYw1XkNg6o4WYXU7BbA==", "fEwwV");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[25]] = lllIlIlIlllIlII("IAsmCj8B", "rbEbZ");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[26]] = lllIlIlIlllIllI("auVJCIPA/xY=", "nLUHR");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[27]] = lllIlIlIlllIllI("11PdtJ3vbJAmUiG3m+oD2A==", "IDvHP");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[16]] = lllIlIlIlllIllI("JZS9/1klArA=", "mRCgE");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[13]] = lllIlIlIlllIllI("xhcrigJHLVY=", "JbfeU");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[28]] = lllIlIlIlllIlII("HC4tHAUg", "SHKyw");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[6]] = lllIlIlIlllIllI("gTlD1fHvdJ8qWH7Cdc7nQA==", "TULbg");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[22]] = lllIlIlIlllIlII("FyI7bBwTITUjDR8/dyoLHSo1Jw==", "zMYBj");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[38]] = lllIlIlIlllIlII("CgUOezMOBgA0IgIYQjwhCw8=", "gjlUE");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[3]] = lllIlIlIlllIllI("6+0bO9A1AsJrXvTTtSki+8g6eUkW3otP", "qQhDx");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[7]] = lllIlIlIlllIlIl("VASOLZbQQBDEEZ5XRZUWhNkpT1BdDrjk", "hDFfw");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[21]] = lllIlIlIlllIlIl("wdDGnJUtxhsJa5s8+/kFNu5AxpYkp2sm", "ZCiYo");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[39]] = lllIlIlIlllIllI("f/iDPi/FEWyydlzQ1Qtxjr5UT8s6vyE6", "jNevI");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[4]] = lllIlIlIlllIllI("bEsrsVriZcVnCtHnBELfVA==", "TagBU");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[40]] = lllIlIlIlllIlIl("k8ugdpg06MY=", "qLskZ");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[23]] = lllIlIlIlllIllI("mvLGTIUT6qJWMBsyqL+xqg==", "dtsUd");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[41]] = lllIlIlIlllIlIl("y6yfYvRns1W7jzeKY+DcYw==", "iWsjc");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[42]] = lllIlIlIlllIllI("YbGskHBuxpZgEljDDL8BEg==", "hheiN");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[43]] = lllIlIlIlllIlII("IRoaAhE/Ghke", "Msxpp");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[44]] = lllIlIlIlllIlII("EwAMAAIT", "plirk");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[45]] = lllIlIlIlllIlIl("7y6hi0gHaVc=", "ktQah");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[46]] = lllIlIlIlllIlII("DjMFPgQX", "yVdNk");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[47]] = lllIlIlIlllIlIl("8aVH+vxq164=", "buewN");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[36]] = lllIlIlIlllIlIl("C3WHGb4jwnI=", "UTqqk");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[48]] = lllIlIlIlllIlII("KTUYOzwgIg==", "EPyOT");
        EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[49]] = lllIlIlIlllIlII("JwYAESY7RiIRPi4JEx0gbA==", "BhtxR");
    }
    
    @Override
    public float getEyeHeight() {
        float lllllllllllllIIIlIlIllIllIlIllIl = 1.62f;
        if (lllIlIllIIIllll(this.isChild() ? 1 : 0)) {
            lllllllllllllIIIlIlIllIllIlIllIl -= (float)0.81;
        }
        return lllllllllllllIIIlIlIllIllIlIllIl;
    }
    
    public InventoryBasic getVillagerInventory() {
        return this.villagerInventory;
    }
    
    @Override
    public void setCustomer(final EntityPlayer lllllllllllllIIIlIlIlllIIIIIlIll) {
        this.buyingPlayer = lllllllllllllIIIlIlIlllIIIIIlIll;
    }
    
    public void setProfession(final int lllllllllllllIIIlIlIlllIIIlllIll) {
        this.dataWatcher.updateObject(EntityVillager.lIlIlIIIIlllIl[22], lllllllllllllIIIlIlIlllIIIlllIll);
    }
    
    private static boolean lllIlIllIIllIIl(final int lllllllllllllIIIlIlIllIIllIllIlI) {
        return lllllllllllllIIIlIlIllIIllIllIlI >= 0;
    }
    
    static {
        lllIlIllIIIllIl();
        lllIlIlIllllllI();
        final ITradeList[][][][] default_TRADE_LIST_MAP = new ITradeList[EntityVillager.lIlIlIIIIlllIl[0]][][][];
        final int n = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][][] array = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]][][];
        final int n2 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][] array2 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]][];
        final int n3 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array3 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]];
        array3[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.wheat, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[3], EntityVillager.lIlIlIIIIlllIl[4]));
        array3[EntityVillager.lIlIlIIIIlllIl[5]] = new EmeraldForItems(Items.potato, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[6], EntityVillager.lIlIlIIIIlllIl[7]));
        array3[EntityVillager.lIlIlIIIIlllIl[8]] = new EmeraldForItems(Items.carrot, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[6], EntityVillager.lIlIlIIIIlllIl[7]));
        array3[EntityVillager.lIlIlIIIIlllIl[9]] = new ListItemForEmeralds(Items.bread, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[10], EntityVillager.lIlIlIIIIlllIl[11]));
        array2[n3] = array3;
        final int n4 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array4 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array4[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Item.getItemFromBlock(Blocks.pumpkin), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[12], EntityVillager.lIlIlIIIIlllIl[13]));
        array4[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.pumpkin_pie, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[14], EntityVillager.lIlIlIIIIlllIl[11]));
        array2[n4] = array4;
        final int n5 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array5 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array5[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Item.getItemFromBlock(Blocks.melon_block), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[16]));
        array5[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.apple, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[17], EntityVillager.lIlIlIIIIlllIl[18]));
        array2[n5] = array5;
        final int n6 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[] array6 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array6[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.cookie, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[19], EntityVillager.lIlIlIIIIlllIl[20]));
        array6[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.cake, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[5]));
        array2[n6] = array6;
        array[n2] = array2;
        final int n7 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[][] array7 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]][];
        final int n8 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array8 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]];
        array8[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.string, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[6], EntityVillager.lIlIlIIIIlllIl[21]));
        array8[EntityVillager.lIlIlIIIIlllIl[5]] = new EmeraldForItems(Items.coal, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[23]));
        array8[EntityVillager.lIlIlIIIIlllIl[8]] = new ItemAndEmeraldToItem(Items.fish, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[24], EntityVillager.lIlIlIIIIlllIl[24]), Items.cooked_fish, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[24], EntityVillager.lIlIlIIIIlllIl[24]));
        array7[n8] = array8;
        final int n9 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array9 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array9[EntityVillager.lIlIlIIIIlllIl[1]] = new ListEnchantedItemForEmeralds(Items.fishing_rod, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[12]));
        array7[n9] = array9;
        array[n7] = array7;
        final int n10 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[][] array10 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]][];
        final int n11 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array11 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array11[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Item.getItemFromBlock(Blocks.wool), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[4]));
        array11[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.shears, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[2]));
        array10[n11] = array11;
        final int n12 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array12 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[22]];
        array12[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[1]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[5]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[8]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[9]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[9]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[2]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[2]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[0]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[0]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[24]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[24]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[15]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[15]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[12]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[12]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[25]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[25]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[26]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[26]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[27]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[27]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[16]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[16]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[13]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[13]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[28]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[28]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array12[EntityVillager.lIlIlIIIIlllIl[6]] = new ListItemForEmeralds(new ItemStack(Item.getItemFromBlock(Blocks.wool), EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[6]), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[5], EntityVillager.lIlIlIIIIlllIl[8]));
        array10[n12] = array12;
        array[n10] = array10;
        final int n13 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[][] array13 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]][];
        final int n14 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array14 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array14[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.string, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[6], EntityVillager.lIlIlIIIIlllIl[21]));
        array14[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.arrow, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[29], EntityVillager.lIlIlIIIIlllIl[30]));
        array13[n14] = array14;
        final int n15 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array15 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array15[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.bow, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[8], EntityVillager.lIlIlIIIIlllIl[9]));
        array15[EntityVillager.lIlIlIIIIlllIl[5]] = new ItemAndEmeraldToItem(Item.getItemFromBlock(Blocks.gravel), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[26], EntityVillager.lIlIlIIIIlllIl[26]), Items.flint, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[24], EntityVillager.lIlIlIIIIlllIl[26]));
        array13[n15] = array15;
        array[n13] = array13;
        default_TRADE_LIST_MAP[n] = array;
        final int n16 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[][][] array16 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]][][];
        final int n17 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][] array17 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[24]][];
        final int n18 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array18 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array18[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.paper, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[23], EntityVillager.lIlIlIIIIlllIl[31]));
        array18[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedBookForEmeralds();
        array17[n18] = array18;
        final int n19 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array19 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]];
        array19[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.book, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[12], EntityVillager.lIlIlIIIIlllIl[26]));
        array19[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.compass, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[26], EntityVillager.lIlIlIIIIlllIl[16]));
        array19[EntityVillager.lIlIlIIIIlllIl[8]] = new ListItemForEmeralds(Item.getItemFromBlock(Blocks.bookshelf), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[2]));
        array17[n19] = array19;
        final int n20 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array20 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]];
        array20[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.written_book, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[8], EntityVillager.lIlIlIIIIlllIl[8]));
        array20[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.clock, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[26], EntityVillager.lIlIlIIIIlllIl[16]));
        array20[EntityVillager.lIlIlIIIIlllIl[8]] = new ListItemForEmeralds(Item.getItemFromBlock(Blocks.glass), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[17], EntityVillager.lIlIlIIIIlllIl[14]));
        array17[n20] = array20;
        final int n21 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[] array21 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array21[EntityVillager.lIlIlIIIIlllIl[1]] = new ListEnchantedBookForEmeralds();
        array17[n21] = array21;
        final int n22 = EntityVillager.lIlIlIIIIlllIl[2];
        final ITradeList[] array22 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array22[EntityVillager.lIlIlIIIIlllIl[1]] = new ListEnchantedBookForEmeralds();
        array17[n22] = array22;
        final int n23 = EntityVillager.lIlIlIIIIlllIl[0];
        final ITradeList[] array23 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array23[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.name_tag, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[21], EntityVillager.lIlIlIIIIlllIl[4]));
        array17[n23] = array23;
        array16[n17] = array17;
        default_TRADE_LIST_MAP[n16] = array16;
        final int n24 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[][][] array24 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]][][];
        final int n25 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][] array25 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]][];
        final int n26 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array26 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array26[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.rotten_flesh, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[31], EntityVillager.lIlIlIIIIlllIl[32]));
        array26[EntityVillager.lIlIlIIIIlllIl[5]] = new EmeraldForItems(Items.gold_ingot, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[12], EntityVillager.lIlIlIIIIlllIl[26]));
        array25[n26] = array26;
        final int n27 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array27 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array27[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.redstone, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[10], EntityVillager.lIlIlIIIIlllIl[33]));
        array27[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(new ItemStack(Items.dye, EntityVillager.lIlIlIIIIlllIl[5], EnumDyeColor.BLUE.getDyeDamage()), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[11], EntityVillager.lIlIlIIIIlllIl[33]));
        array25[n27] = array27;
        final int n28 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array28 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array28[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.ender_eye, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[27]));
        array28[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Item.getItemFromBlock(Blocks.glowstone), new PriceInfo(EntityVillager.lIlIlIIIIlllIl[14], EntityVillager.lIlIlIIIIlllIl[33]));
        array25[n28] = array28;
        final int n29 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[] array29 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array29[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.experience_bottle, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[27]));
        array25[n29] = array29;
        array24[n25] = array25;
        default_TRADE_LIST_MAP[n24] = array24;
        final int n30 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[][][] array30 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]][][];
        final int n31 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][] array31 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]][];
        final int n32 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array32 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array32[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.coal, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[23]));
        array32[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.iron_helmet, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[2], EntityVillager.lIlIlIIIIlllIl[24]));
        array31[n32] = array32;
        final int n33 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array33 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array33[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.iron_ingot, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[25]));
        array33[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.iron_chestplate, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[26], EntityVillager.lIlIlIIIIlllIl[28]));
        array31[n33] = array33;
        final int n34 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array34 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array34[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.diamond, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[2]));
        array34[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.diamond_chestplate, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[7]));
        array31[n34] = array34;
        final int n35 = EntityVillager.lIlIlIIIIlllIl[9];
        final ITradeList[] array35 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[2]];
        array35[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.chainmail_boots, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[0], EntityVillager.lIlIlIIIIlllIl[15]));
        array35[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.chainmail_leggings, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[25], EntityVillager.lIlIlIIIIlllIl[27]));
        array35[EntityVillager.lIlIlIIIIlllIl[8]] = new ListItemForEmeralds(Items.chainmail_helmet, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[0], EntityVillager.lIlIlIIIIlllIl[15]));
        array35[EntityVillager.lIlIlIIIIlllIl[9]] = new ListItemForEmeralds(Items.chainmail_chestplate, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[27], EntityVillager.lIlIlIIIIlllIl[6]));
        array31[n35] = array35;
        array30[n31] = array31;
        final int n36 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[][] array36 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]][];
        final int n37 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array37 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array37[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.coal, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[23]));
        array37[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.iron_axe, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[24], EntityVillager.lIlIlIIIIlllIl[12]));
        array36[n37] = array37;
        final int n38 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array38 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array38[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.iron_ingot, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[25]));
        array38[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.iron_sword, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[25], EntityVillager.lIlIlIIIIlllIl[26]));
        array36[n38] = array38;
        final int n39 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array39 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]];
        array39[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.diamond, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[2]));
        array39[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.diamond_sword, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[16], EntityVillager.lIlIlIIIIlllIl[6]));
        array39[EntityVillager.lIlIlIIIIlllIl[8]] = new ListEnchantedItemForEmeralds(Items.diamond_axe, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[25], EntityVillager.lIlIlIIIIlllIl[16]));
        array36[n39] = array39;
        array30[n36] = array36;
        final int n40 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[][] array40 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]][];
        final int n41 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array41 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array41[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.coal, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[23]));
        array41[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.iron_shovel, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[0], EntityVillager.lIlIlIIIIlllIl[15]));
        array40[n41] = array41;
        final int n42 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array42 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array42[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.iron_ingot, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[25]));
        array42[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.iron_pickaxe, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[25], EntityVillager.lIlIlIIIIlllIl[27]));
        array40[n42] = array42;
        final int n43 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array43 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array43[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.diamond, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[9], EntityVillager.lIlIlIIIIlllIl[2]));
        array43[EntityVillager.lIlIlIIIIlllIl[5]] = new ListEnchantedItemForEmeralds(Items.diamond_pickaxe, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[16], EntityVillager.lIlIlIIIIlllIl[6]));
        array40[n43] = array43;
        array30[n40] = array40;
        default_TRADE_LIST_MAP[n30] = array30;
        final int n44 = EntityVillager.lIlIlIIIIlllIl[2];
        final ITradeList[][][] array44 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]][][];
        final int n45 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[][] array45 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]][];
        final int n46 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array46 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array46[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.porkchop, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[28], EntityVillager.lIlIlIIIIlllIl[3]));
        array46[EntityVillager.lIlIlIIIIlllIl[5]] = new EmeraldForItems(Items.chicken, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[28], EntityVillager.lIlIlIIIIlllIl[3]));
        array45[n46] = array46;
        final int n47 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array47 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]];
        array47[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.coal, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[23]));
        array47[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.cooked_porkchop, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[18], EntityVillager.lIlIlIIIIlllIl[17]));
        array47[EntityVillager.lIlIlIIIIlllIl[8]] = new ListItemForEmeralds(Items.cooked_chicken, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[30], EntityVillager.lIlIlIIIIlllIl[19]));
        array45[n47] = array47;
        array44[n45] = array45;
        final int n48 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[][] array48 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[9]][];
        final int n49 = EntityVillager.lIlIlIIIIlllIl[1];
        final ITradeList[] array49 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[8]];
        array49[EntityVillager.lIlIlIIIIlllIl[1]] = new EmeraldForItems(Items.leather, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[25], EntityVillager.lIlIlIIIIlllIl[16]));
        array49[EntityVillager.lIlIlIIIIlllIl[5]] = new ListItemForEmeralds(Items.leather_leggings, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[8], EntityVillager.lIlIlIIIIlllIl[2]));
        array48[n49] = array49;
        final int n50 = EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[] array50 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array50[EntityVillager.lIlIlIIIIlllIl[1]] = new ListEnchantedItemForEmeralds(Items.leather_chestplate, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[15], EntityVillager.lIlIlIIIIlllIl[16]));
        array48[n50] = array50;
        final int n51 = EntityVillager.lIlIlIIIIlllIl[8];
        final ITradeList[] array51 = new ITradeList[EntityVillager.lIlIlIIIIlllIl[5]];
        array51[EntityVillager.lIlIlIIIIlllIl[1]] = new ListItemForEmeralds(Items.saddle, new PriceInfo(EntityVillager.lIlIlIIIIlllIl[12], EntityVillager.lIlIlIIIIlllIl[26]));
        array48[n51] = array51;
        array44[n48] = array48;
        default_TRADE_LIST_MAP[n44] = array44;
        DEFAULT_TRADE_LIST_MAP = default_TRADE_LIST_MAP;
    }
    
    public void setIsWillingToMate(final boolean lllllllllllllIIIlIlIllIlllllIIII) {
        this.isWillingToMate = lllllllllllllIIIlIlIllIlllllIIII;
    }
    
    public EntityVillager(final World lllllllllllllIIIlIlIlllIlIIIllll) {
        this(lllllllllllllIIIlIlIlllIlIIIllll, EntityVillager.lIlIlIIIIlllIl[1]);
    }
    
    @Override
    public EntityVillager createChild(final EntityAgeable lllllllllllllIIIlIlIllIllIIIIIll) {
        final EntityVillager lllllllllllllIIIlIlIllIllIIIIIlI = new EntityVillager(this.worldObj);
        lllllllllllllIIIlIlIllIllIIIIIlI.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(lllllllllllllIIIlIlIllIllIIIIIlI)), null);
        "".length();
        return lllllllllllllIIIlIlIllIllIIIIIlI;
    }
    
    public EntityVillager(final World lllllllllllllIIIlIlIlllIlIIIIlll, final int lllllllllllllIIIlIlIlllIlIIIlIIl) {
        super(lllllllllllllIIIlIlIlllIlIIIIlll);
        this.villagerInventory = new InventoryBasic(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[1]], (boolean)(EntityVillager.lIlIlIIIIlllIl[1] != 0), EntityVillager.lIlIlIIIIlllIl[12]);
        this.setProfession(lllllllllllllIIIlIlIlllIlIIIlIIl);
        this.setSize(0.6f, 1.8f);
        ((PathNavigateGround)this.getNavigator()).setBreakDoors((boolean)(EntityVillager.lIlIlIIIIlllIl[5] != 0));
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityVillager.lIlIlIIIIlllIl[5] != 0));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[5], new EntityAIAvoidEntity<Object>(this, EntityZombie.class, 8.0f, 0.6, 0.6));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[5], new EntityAITradePlayer(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[5], new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[8], new EntityAIMoveIndoors(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[9], new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[2], new EntityAIOpenDoor(this, (boolean)(EntityVillager.lIlIlIIIIlllIl[5] != 0)));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[0], new EntityAIMoveTowardsRestriction(this, 0.6));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[24], new EntityAIVillagerMate(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[15], new EntityAIFollowGolem(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[25], new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0f, 1.0f));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[25], new EntityAIVillagerInteract(this));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[25], new EntityAIWander(this, 0.6));
        this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[26], new EntityAIWatchClosest(this, EntityLiving.class, 8.0f));
        this.setCanPickUpLoot((boolean)(EntityVillager.lIlIlIIIIlllIl[5] != 0));
    }
    
    @Override
    public void verifySellingItem(final ItemStack lllllllllllllIIIlIlIllIlllIlllll) {
        if (lllIlIllIIIlllI(this.worldObj.isRemote ? 1 : 0) && lllIlIllIIllIII(this.livingSoundTime, -this.getTalkInterval() + EntityVillager.lIlIlIIIIlllIl[21])) {
            this.livingSoundTime = -this.getTalkInterval();
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIlllIlllll)) {
                this.playSound(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[39]], this.getSoundVolume(), this.getSoundPitch());
                "".length();
                if ((0x89 ^ 0x8D) < "  ".length()) {
                    return;
                }
            }
            else {
                this.playSound(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[4]], this.getSoundVolume(), this.getSoundPitch());
            }
        }
    }
    
    private static boolean lllIlIllIIlIIlI(final int lllllllllllllIIIlIlIllIIllIlIllI) {
        return lllllllllllllIIIlIlIllIIllIlIllI > 0;
    }
    
    public boolean getIsWillingToMate(final boolean lllllllllllllIIIlIlIllIlllllllII) {
        if (lllIlIllIIIlllI(this.isWillingToMate ? 1 : 0) && lllIlIllIIIllll(lllllllllllllIIIlIlIllIlllllllII ? 1 : 0) && lllIlIllIIIllll(this.func_175553_cp() ? 1 : 0)) {
            boolean lllllllllllllIIIlIlIllIllllllIll = EntityVillager.lIlIlIIIIlllIl[1] != 0;
            int lllllllllllllIIIlIlIllIllllllIlI = EntityVillager.lIlIlIIIIlllIl[1];
            "".length();
            if ("  ".length() <= 0) {
                return ((0x9A ^ 0x9E) & ~(0x67 ^ 0x63)) != 0x0;
            }
            while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIllllllIlI, this.villagerInventory.getSizeInventory())) {
                final ItemStack lllllllllllllIIIlIlIllIllllllIIl = this.villagerInventory.getStackInSlot(lllllllllllllIIIlIlIllIllllllIlI);
                if (lllIlIllIIlIIll(lllllllllllllIIIlIlIllIllllllIIl)) {
                    if (lllIlIllIIlIlII(lllllllllllllIIIlIlIllIllllllIIl.getItem(), Items.bread) && lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIllllllIIl.stackSize, EntityVillager.lIlIlIIIIlllIl[9])) {
                        lllllllllllllIIIlIlIllIllllllIll = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
                        this.villagerInventory.decrStackSize(lllllllllllllIIIlIlIllIllllllIlI, EntityVillager.lIlIlIIIIlllIl[9]);
                        "".length();
                        "".length();
                        if (" ".length() > " ".length()) {
                            return ((0x97 ^ 0xAA) & ~(0x3C ^ 0x1)) != 0x0;
                        }
                    }
                    else if ((!lllIlIllIIlIllI(lllllllllllllIIIlIlIllIllllllIIl.getItem(), Items.potato) || lllIlIllIIlIlII(lllllllllllllIIIlIlIllIllllllIIl.getItem(), Items.carrot)) && lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIllllllIIl.stackSize, EntityVillager.lIlIlIIIIlllIl[16])) {
                        lllllllllllllIIIlIlIllIllllllIll = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
                        this.villagerInventory.decrStackSize(lllllllllllllIIIlIlIllIllllllIlI, EntityVillager.lIlIlIIIIlllIl[16]);
                        "".length();
                    }
                }
                if (lllIlIllIIIllll(lllllllllllllIIIlIlIllIllllllIll ? 1 : 0)) {
                    this.worldObj.setEntityState(this, (byte)EntityVillager.lIlIlIIIIlllIl[3]);
                    this.isWillingToMate = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
                    "".length();
                    if (((0x8 ^ 0x12) & ~(0x83 ^ 0x99)) != 0x0) {
                        return ((0x2C ^ 0x3E) & ~(0xD4 ^ 0xC6)) != 0x0;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIlIlIllIllllllIlI;
                }
            }
        }
        return this.isWillingToMate;
    }
    
    public boolean isMating() {
        return this.isMating;
    }
    
    private static boolean lllIlIllIIIlllI(final int lllllllllllllIIIlIlIllIIllIlllII) {
        return lllllllllllllIIIlIlIllIIllIlllII == 0;
    }
    
    private void populateBuyingList() {
        final ITradeList[][][] lllllllllllllIIIlIlIllIlllIIllll = EntityVillager.DEFAULT_TRADE_LIST_MAP[this.getProfession()];
        if (lllIlIllIIIllll(this.careerId) && lllIlIllIIIllll(this.careerLevel)) {
            this.careerLevel += EntityVillager.lIlIlIIIIlllIl[5];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            this.careerId = this.rand.nextInt(lllllllllllllIIIlIlIllIlllIIllll.length) + EntityVillager.lIlIlIIIIlllIl[5];
            this.careerLevel = EntityVillager.lIlIlIIIIlllIl[5];
        }
        if (lllIlIllIIlIIIl(this.buyingList)) {
            this.buyingList = new MerchantRecipeList();
        }
        final int lllllllllllllIIIlIlIllIlllIIlllI = this.careerId - EntityVillager.lIlIlIIIIlllIl[5];
        final int lllllllllllllIIIlIlIllIlllIIllIl = this.careerLevel - EntityVillager.lIlIlIIIIlllIl[5];
        final ITradeList[][] lllllllllllllIIIlIlIllIlllIIllII = lllllllllllllIIIlIlIllIlllIIllll[lllllllllllllIIIlIlIllIlllIIlllI];
        if (lllIlIllIIllIIl(lllllllllllllIIIlIlIllIlllIIllIl) && lllIlIllIIllIlI(lllllllllllllIIIlIlIllIlllIIllIl, lllllllllllllIIIlIlIllIlllIIllII.length)) {
            final ITradeList[] lllllllllllllIIIlIlIllIlllIIlIll = lllllllllllllIIIlIlIllIlllIIllII[lllllllllllllIIIlIlIllIlllIIllIl];
            final String lllllllllllllIIIlIlIllIlllIIIIII;
            final char lllllllllllllIIIlIlIllIlllIIIIIl = (char)((ITradeList[])(Object)(lllllllllllllIIIlIlIllIlllIIIIII = (String)(Object)lllllllllllllIIIlIlIllIlllIIlIll)).length;
            String lllllllllllllIIIlIlIllIlllIIIIlI = (String)EntityVillager.lIlIlIIIIlllIl[1];
            "".length();
            if (((100 + 10 - 45 + 178 ^ 42 + 148 - 23 + 17) & (0x6C ^ 0x7A ^ (0x71 ^ 0x2C) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lllIlIllIIlIlIl((int)lllllllllllllIIIlIlIllIlllIIIIlI, lllllllllllllIIIlIlIllIlllIIIIIl)) {
                final ITradeList lllllllllllllIIIlIlIllIlllIIlIlI = lllllllllllllIIIlIlIllIlllIIIIII[lllllllllllllIIIlIlIllIlllIIIIlI];
                lllllllllllllIIIlIlIllIlllIIlIlI.modifyMerchantRecipeList(this.buyingList, this.rand);
                ++lllllllllllllIIIlIlIllIlllIIIIlI;
            }
        }
    }
    
    public void setPlaying(final boolean lllllllllllllIIIlIlIlllIIIlIIlll) {
        this.isPlaying = lllllllllllllIIIlIlIlllIIIlIIlll;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[3]];
    }
    
    public void setMating(final boolean lllllllllllllIIIlIlIlllIIIlIllll) {
        this.isMating = lllllllllllllIIIlIlIlllIIIlIllll;
    }
    
    private static boolean lllIlIllIIlIIIl(final Object lllllllllllllIIIlIlIllIIlllIIIII) {
        return lllllllllllllIIIlIlIllIIlllIIIII == null;
    }
    
    public boolean isTrading() {
        if (lllIlIllIIlIIll(this.buyingPlayer)) {
            return EntityVillager.lIlIlIIIIlllIl[5] != 0;
        }
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIIIlIlIlllIIIIlIIIl) {
        if (lllIlIllIIlIIll(this.villageObj)) {
            final Entity lllllllllllllIIIlIlIlllIIIIlIlII = lllllllllllllIIIlIlIlllIIIIlIIIl.getEntity();
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIIIlIlII)) {
                if (lllIlIllIIIllll((lllllllllllllIIIlIlIlllIIIIlIlII instanceof EntityPlayer) ? 1 : 0)) {
                    this.villageObj.setReputationForPlayer(lllllllllllllIIIlIlIlllIIIIlIlII.getName(), EntityVillager.lIlIlIIIIlllIl[11]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lllIlIllIIIllll((lllllllllllllIIIlIlIlllIIIIlIlII instanceof IMob) ? 1 : 0)) {
                    this.villageObj.endMatingSeason();
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
            }
            else {
                final EntityPlayer lllllllllllllIIIlIlIlllIIIIlIIll = this.worldObj.getClosestPlayerToEntity(this, 16.0);
                if (lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIIIlIIll)) {
                    this.villageObj.endMatingSeason();
                }
            }
        }
        super.onDeath(lllllllllllllIIIlIlIlllIIIIlIIIl);
    }
    
    public boolean canAbondonItems() {
        return this.hasEnoughItems(EntityVillager.lIlIlIIIIlllIl[8]);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
    }
    
    public void setLookingForHome() {
        this.isLookingForHome = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
    }
    
    private static boolean lllIlIllIIIllll(final int lllllllllllllIIIlIlIllIIllIllllI) {
        return lllllllllllllIIIlIlIllIIllIllllI != 0;
    }
    
    private void spawnParticles(final EnumParticleTypes lllllllllllllIIIlIlIllIllIIlllIl) {
        int lllllllllllllIIIlIlIllIllIIlllII = EntityVillager.lIlIlIIIIlllIl[1];
        "".length();
        if ("  ".length() == " ".length()) {
            return;
        }
        while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIllIllIIlllII, EntityVillager.lIlIlIIIIlllIl[0])) {
            final double lllllllllllllIIIlIlIllIllIIllIll = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIIIlIlIllIllIIllIlI = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIIIlIlIllIllIIllIIl = this.rand.nextGaussian() * 0.02;
            this.worldObj.spawnParticle(lllllllllllllIIIlIlIllIllIIlllIl, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 1.0 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, lllllllllllllIIIlIlIllIllIIllIll, lllllllllllllIIIlIlIllIllIIllIlI, lllllllllllllIIIlIlIllIllIIllIIl, new int[EntityVillager.lIlIlIIIIlllIl[1]]);
            ++lllllllllllllIIIlIlIllIllIIlllII;
        }
    }
    
    private static boolean lllIlIllIIllIll(final int lllllllllllllIIIlIlIllIIlllllIIl, final int lllllllllllllIIIlIlIllIIlllllIII) {
        return lllllllllllllIIIlIlIllIIlllllIIl == lllllllllllllIIIlIlIllIIlllllIII;
    }
    
    private static boolean lllIlIllIIlIlIl(final int lllllllllllllIIIlIlIllIIllllIlIl, final int lllllllllllllIIIlIlIllIIllllIlII) {
        return lllllllllllllIIIlIlIllIIllllIlIl >= lllllllllllllIIIlIlIllIIllllIlII;
    }
    
    @Override
    public MerchantRecipeList getRecipes(final EntityPlayer lllllllllllllIIIlIlIllIlllIlllII) {
        if (lllIlIllIIlIIIl(this.buyingList)) {
            this.populateBuyingList();
        }
        return this.buyingList;
    }
    
    @Override
    protected boolean canDespawn() {
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[7]];
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityVillager.lIlIlIIIIlllIl[22], EntityVillager.lIlIlIIIIlllIl[1]);
    }
    
    private static boolean lllIlIllIIllIII(final int lllllllllllllIIIlIlIllIIlllIllIl, final int lllllllllllllIIIlIlIllIIlllIllII) {
        return lllllllllllllIIIlIlIllIIlllIllIl > lllllllllllllIIIlIlIllIIlllIllII;
    }
    
    private void setAdditionalAItasks() {
        if (lllIlIllIIIlllI(this.areAdditionalTasksSet ? 1 : 0)) {
            this.areAdditionalTasksSet = (EntityVillager.lIlIlIIIIlllIl[5] != 0);
            if (lllIlIllIIIllll(this.isChild() ? 1 : 0)) {
                this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[12], new EntityAIPlay(this, 0.32));
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (lllIlIllIIIlllI(this.getProfession())) {
                this.tasks.addTask(EntityVillager.lIlIlIIIIlllIl[24], new EntityAIHarvestFarmland(this, 0.6));
            }
        }
    }
    
    @Override
    public boolean interact(final EntityPlayer lllllllllllllIIIlIlIlllIIllIllIl) {
        final ItemStack lllllllllllllIIIlIlIlllIIllIllII = lllllllllllllIIIlIlIlllIIllIllIl.inventory.getCurrentItem();
        int n;
        if (lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIllIllII) && lllIlIllIIlIlII(lllllllllllllIIIlIlIlllIIllIllII.getItem(), Items.spawn_egg)) {
            n = EntityVillager.lIlIlIIIIlllIl[5];
            "".length();
            if ("   ".length() < 0) {
                return ((0x33 ^ 0x6) & ~(0x91 ^ 0xA4)) != 0x0;
            }
        }
        else {
            n = EntityVillager.lIlIlIIIIlllIl[1];
        }
        final boolean lllllllllllllIIIlIlIlllIIllIlIll = n != 0;
        if (lllIlIllIIIlllI(lllllllllllllIIIlIlIlllIIllIlIll ? 1 : 0) && lllIlIllIIIllll(this.isEntityAlive() ? 1 : 0) && lllIlIllIIIlllI(this.isTrading() ? 1 : 0) && lllIlIllIIIlllI(this.isChild() ? 1 : 0)) {
            if (lllIlIllIIIlllI(this.worldObj.isRemote ? 1 : 0) && (!lllIlIllIIlIIll(this.buyingList) || lllIlIllIIlIIlI(this.buyingList.size()))) {
                this.setCustomer(lllllllllllllIIIlIlIlllIIllIllIl);
                lllllllllllllIIIlIlIlllIIllIllIl.displayVillagerTradeGui(this);
            }
            lllllllllllllIIIlIlIlllIIllIllIl.triggerAchievement(StatList.timesTalkedToVillagerStat);
            return EntityVillager.lIlIlIIIIlllIl[5] != 0;
        }
        return super.interact(lllllllllllllIIIlIlIlllIIllIllIl);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIlIlIlllIIlIIlllI) {
        super.readEntityFromNBT(lllllllllllllIIIlIlIlllIIlIIlllI);
        this.setProfession(lllllllllllllIIIlIlIlllIIlIIlllI.getInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[12]]));
        this.wealth = lllllllllllllIIIlIlIlllIIlIIlllI.getInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[25]]);
        this.careerId = lllllllllllllIIIlIlIlllIIlIIlllI.getInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[26]]);
        this.careerLevel = lllllllllllllIIIlIlIlllIIlIIlllI.getInteger(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[27]]);
        this.isWillingToMate = lllllllllllllIIIlIlIlllIIlIIlllI.getBoolean(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[16]]);
        if (lllIlIllIIIllll(lllllllllllllIIIlIlIlllIIlIIlllI.hasKey(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[13]], EntityVillager.lIlIlIIIIlllIl[26]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIIlIlIlllIIlIIllIl = lllllllllllllIIIlIlIlllIIlIIlllI.getCompoundTag(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[28]]);
            this.buyingList = new MerchantRecipeList(lllllllllllllIIIlIlIlllIIlIIllIl);
        }
        final NBTTagList lllllllllllllIIIlIlIlllIIlIIllII = lllllllllllllIIIlIlIlllIIlIIlllI.getTagList(EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[6]], EntityVillager.lIlIlIIIIlllIl[26]);
        int lllllllllllllIIIlIlIlllIIlIIlIll = EntityVillager.lIlIlIIIIlllIl[1];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lllIlIllIIlIlIl(lllllllllllllIIIlIlIlllIIlIIlIll, lllllllllllllIIIlIlIlllIIlIIllII.tagCount())) {
            final ItemStack lllllllllllllIIIlIlIlllIIlIIlIlI = ItemStack.loadItemStackFromNBT(lllllllllllllIIIlIlIlllIIlIIllII.getCompoundTagAt(lllllllllllllIIIlIlIlllIIlIIlIll));
            if (lllIlIllIIlIIll(lllllllllllllIIIlIlIlllIIlIIlIlI)) {
                this.villagerInventory.func_174894_a(lllllllllllllIIIlIlIlllIIlIIlIlI);
                "".length();
            }
            ++lllllllllllllIIIlIlIlllIIlIIlIll;
        }
        this.setCanPickUpLoot((boolean)(EntityVillager.lIlIlIIIIlllIl[5] != 0));
        this.setAdditionalAItasks();
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (lllIlIllIIIllll(this.isTrading() ? 1 : 0)) {
            s = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[22]];
            "".length();
            if ((0x5 ^ 0x1) == ((0x6C ^ 0x62) & ~(0x23 ^ 0x2D))) {
                return null;
            }
        }
        else {
            s = EntityVillager.lIlIlIIIIllIll[EntityVillager.lIlIlIIIIlllIl[38]];
        }
        return s;
    }
    
    public boolean isPlaying() {
        return this.isPlaying;
    }
    
    @Override
    public boolean allowLeashing() {
        return EntityVillager.lIlIlIIIIlllIl[1] != 0;
    }
    
    private static String lllIlIlIlllIlIl(final String lllllllllllllIIIlIlIllIlIIIIlllI, final String lllllllllllllIIIlIlIllIlIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIllIlIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIllIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), EntityVillager.lIlIlIIIIlllIl[12]), "DES");
            final Cipher lllllllllllllIIIlIlIllIlIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIllIlIIIlIIII.init(EntityVillager.lIlIlIIIIlllIl[8], lllllllllllllIIIlIlIllIlIIIlIIIl);
            return new String(lllllllllllllIIIlIlIllIlIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIllIlIIIIllll) {
            lllllllllllllIIIlIlIllIlIIIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIIlIlIllIllIIIlllI, IEntityLivingData lllllllllllllIIIlIlIllIllIIIlIlI) {
        lllllllllllllIIIlIlIllIllIIIlIlI = (float)super.onInitialSpawn(lllllllllllllIIIlIlIllIllIIIlllI, (IEntityLivingData)lllllllllllllIIIlIlIllIllIIIlIlI);
        this.setProfession(this.worldObj.rand.nextInt(EntityVillager.lIlIlIIIIlllIl[0]));
        this.setAdditionalAItasks();
        return (IEntityLivingData)lllllllllllllIIIlIlIllIllIIIlIlI;
    }
    
    static class EmeraldForItems implements ITradeList
    {
        public /* synthetic */ Item sellItem;
        private static final /* synthetic */ int[] llIlIIIlIIIlII;
        public /* synthetic */ PriceInfo price;
        
        public EmeraldForItems(final Item llllllllllllIllIllIlIIlIlIIIIIll, final PriceInfo llllllllllllIllIllIlIIlIlIIIIlIl) {
            this.sellItem = llllllllllllIllIllIlIIlIlIIIIIll;
            this.price = llllllllllllIllIllIlIIlIlIIIIlIl;
        }
        
        static {
            lIIlIIIllIlIIlll();
        }
        
        @Override
        public void modifyMerchantRecipeList(final MerchantRecipeList llllllllllllIllIllIlIIlIIllllIII, final Random llllllllllllIllIllIlIIlIIlllIlll) {
            int llllllllllllIllIllIlIIlIIllllIlI = EmeraldForItems.llIlIIIlIIIlII[0];
            if (lIIlIIIllIlIlIII(this.price)) {
                llllllllllllIllIllIlIIlIIllllIlI = this.price.getPrice(llllllllllllIllIllIlIIlIIlllIlll);
            }
            llllllllllllIllIllIlIIlIIllllIII.add(new MerchantRecipe(new ItemStack(this.sellItem, llllllllllllIllIllIlIIlIIllllIlI, EmeraldForItems.llIlIIIlIIIlII[1]), Items.emerald));
            "".length();
        }
        
        private static void lIIlIIIllIlIIlll() {
            (llIlIIIlIIIlII = new int[2])[0] = " ".length();
            EmeraldForItems.llIlIIIlIIIlII[1] = ((0x7E ^ 0x3B) & ~(0x35 ^ 0x70));
        }
        
        private static boolean lIIlIIIllIlIlIII(final Object llllllllllllIllIllIlIIlIIlllIlII) {
            return llllllllllllIllIllIlIIlIIlllIlII != null;
        }
    }
    
    interface ITradeList
    {
        void modifyMerchantRecipeList(final MerchantRecipeList p0, final Random p1);
    }
    
    static class PriceInfo extends Tuple<Integer, Integer>
    {
        private static final /* synthetic */ int[] llIIlllllIlIIl;
        
        public PriceInfo(final int llllllllllllIllIlllIIlIlIIlIlIll, final int llllllllllllIllIlllIIlIlIIlIlIlI) {
            super(llllllllllllIllIlllIIlIlIIlIlIll, llllllllllllIllIlllIIlIlIIlIlIlI);
        }
        
        public int getPrice(final Random llllllllllllIllIlllIIlIlIIlIIIll) {
            int intValue;
            if (lIIlIIIIlIIllllI(((Tuple<Integer, B>)this).getFirst(), ((Tuple<A, Integer>)this).getSecond())) {
                intValue = ((Tuple<Integer, B>)this).getFirst();
                "".length();
                if (-"   ".length() >= 0) {
                    return (110 + 101 - 198 + 166 ^ 21 + 37 + 74 + 2) & (0xF8 ^ 0xA5 ^ (0x2E ^ 0x46) ^ -" ".length());
                }
            }
            else {
                intValue = ((Tuple<Integer, B>)this).getFirst() + llllllllllllIllIlllIIlIlIIlIIIll.nextInt(((Tuple<A, Integer>)this).getSecond() - ((Tuple<Integer, B>)this).getFirst() + PriceInfo.llIIlllllIlIIl[0]);
            }
            return intValue;
        }
        
        private static void lIIlIIIIlIIlllIl() {
            (llIIlllllIlIIl = new int[1])[0] = " ".length();
        }
        
        static {
            lIIlIIIIlIIlllIl();
        }
        
        private static boolean lIIlIIIIlIIllllI(final int llllllllllllIllIlllIIlIlIIIllllI, final int llllllllllllIllIlllIIlIlIIIlllIl) {
            return llllllllllllIllIlllIIlIlIIIllllI >= llllllllllllIllIlllIIlIlIIIlllIl;
        }
    }
    
    static class ListEnchantedBookForEmeralds implements ITradeList
    {
        private static final /* synthetic */ int[] lllIlllIlIIIII;
        
        @Override
        public void modifyMerchantRecipeList(final MerchantRecipeList llllllllllllIlIllIIIIlIlIllIIIll, final Random llllllllllllIlIllIIIIlIlIllIlIII) {
            final Enchantment llllllllllllIlIllIIIIlIlIllIIlll = Enchantment.enchantmentsBookList[llllllllllllIlIllIIIIlIlIllIlIII.nextInt(Enchantment.enchantmentsBookList.length)];
            final int llllllllllllIlIllIIIIlIlIllIIllI = MathHelper.getRandomIntegerInRange(llllllllllllIlIllIIIIlIlIllIlIII, llllllllllllIlIllIIIIlIlIllIIlll.getMinLevel(), llllllllllllIlIllIIIIlIlIllIIlll.getMaxLevel());
            final ItemStack llllllllllllIlIllIIIIlIlIllIIlIl = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(llllllllllllIlIllIIIIlIlIllIIlll, llllllllllllIlIllIIIIlIlIllIIllI));
            int llllllllllllIlIllIIIIlIlIllIIlII = ListEnchantedBookForEmeralds.lllIlllIlIIIII[0] + llllllllllllIlIllIIIIlIlIllIlIII.nextInt(ListEnchantedBookForEmeralds.lllIlllIlIIIII[1] + llllllllllllIlIllIIIIlIlIllIIllI * ListEnchantedBookForEmeralds.lllIlllIlIIIII[2]) + ListEnchantedBookForEmeralds.lllIlllIlIIIII[3] * llllllllllllIlIllIIIIlIlIllIIllI;
            if (lIlIIlIllIlIIIlI(llllllllllllIlIllIIIIlIlIllIIlII, ListEnchantedBookForEmeralds.lllIlllIlIIIII[4])) {
                llllllllllllIlIllIIIIlIlIllIIlII = ListEnchantedBookForEmeralds.lllIlllIlIIIII[4];
            }
            llllllllllllIlIllIIIIlIlIllIIIll.add(new MerchantRecipe(new ItemStack(Items.book), new ItemStack(Items.emerald, llllllllllllIlIllIIIIlIlIllIIlII), llllllllllllIlIllIIIIlIlIllIIlIl));
            "".length();
        }
        
        static {
            lIlIIlIllIlIIIIl();
        }
        
        private static void lIlIIlIllIlIIIIl() {
            (lllIlllIlIIIII = new int[5])[0] = "  ".length();
            ListEnchantedBookForEmeralds.lllIlllIlIIIII[1] = (0xC0 ^ 0xC5);
            ListEnchantedBookForEmeralds.lllIlllIlIIIII[2] = (0x8E ^ 0x84);
            ListEnchantedBookForEmeralds.lllIlllIlIIIII[3] = "   ".length();
            ListEnchantedBookForEmeralds.lllIlllIlIIIII[4] = (0x52 ^ 0x12);
        }
        
        private static boolean lIlIIlIllIlIIIlI(final int llllllllllllIlIllIIIIlIlIlIllIll, final int llllllllllllIlIllIIIIlIlIlIllIlI) {
            return llllllllllllIlIllIIIIlIlIlIllIll > llllllllllllIlIllIIIIlIlIlIllIlI;
        }
    }
    
    static class ItemAndEmeraldToItem implements ITradeList
    {
        public /* synthetic */ ItemStack field_179411_a;
        public /* synthetic */ PriceInfo field_179409_b;
        public /* synthetic */ ItemStack field_179410_c;
        private static final /* synthetic */ int[] llIlIIIIllIllI;
        public /* synthetic */ PriceInfo field_179408_d;
        
        private static boolean lIIlIIIlIllllIIl(final Object llllllllllllIllIllIlIllIIIlllIIl) {
            return llllllllllllIllIllIlIllIIIlllIIl != null;
        }
        
        @Override
        public void modifyMerchantRecipeList(final MerchantRecipeList llllllllllllIllIllIlIllIIlIIIIll, final Random llllllllllllIllIllIlIllIIIllllIl) {
            int llllllllllllIllIllIlIllIIlIIIIIl = ItemAndEmeraldToItem.llIlIIIIllIllI[0];
            if (lIIlIIIlIllllIIl(this.field_179409_b)) {
                llllllllllllIllIllIlIllIIlIIIIIl = this.field_179409_b.getPrice(llllllllllllIllIllIlIllIIIllllIl);
            }
            int llllllllllllIllIllIlIllIIlIIIIII = ItemAndEmeraldToItem.llIlIIIIllIllI[0];
            if (lIIlIIIlIllllIIl(this.field_179408_d)) {
                llllllllllllIllIllIlIllIIlIIIIII = this.field_179408_d.getPrice(llllllllllllIllIllIlIllIIIllllIl);
            }
            llllllllllllIllIllIlIllIIlIIIIll.add(new MerchantRecipe(new ItemStack(this.field_179411_a.getItem(), llllllllllllIllIllIlIllIIlIIIIIl, this.field_179411_a.getMetadata()), new ItemStack(Items.emerald), new ItemStack(this.field_179410_c.getItem(), llllllllllllIllIllIlIllIIlIIIIII, this.field_179410_c.getMetadata())));
            "".length();
        }
        
        private static void lIIlIIIlIllllIII() {
            (llIlIIIIllIllI = new int[1])[0] = " ".length();
        }
        
        public ItemAndEmeraldToItem(final Item llllllllllllIllIllIlIllIIlIIllIl, final PriceInfo llllllllllllIllIllIlIllIIlIlIIIl, final Item llllllllllllIllIllIlIllIIlIIlIll, final PriceInfo llllllllllllIllIllIlIllIIlIIlIlI) {
            this.field_179411_a = new ItemStack(llllllllllllIllIllIlIllIIlIIllIl);
            this.field_179409_b = llllllllllllIllIllIlIllIIlIlIIIl;
            this.field_179410_c = new ItemStack(llllllllllllIllIllIlIllIIlIIlIll);
            this.field_179408_d = llllllllllllIllIllIlIllIIlIIlIlI;
        }
        
        static {
            lIIlIIIlIllllIII();
        }
    }
    
    static class ListEnchantedItemForEmeralds implements ITradeList
    {
        public /* synthetic */ ItemStack field_179407_a;
        public /* synthetic */ PriceInfo field_179406_b;
        private static final /* synthetic */ int[] llIlIIlIIIIIII;
        
        static {
            lIIlIIlIIIllllII();
        }
        
        private static void lIIlIIlIIIllllII() {
            (llIlIIlIIIIIII = new int[4])[0] = " ".length();
            ListEnchantedItemForEmeralds.llIlIIlIIIIIII[1] = ((0x40 ^ 0x3 ^ " ".length()) & (0x30 ^ 0x1F ^ (0xD ^ 0x60) ^ -" ".length()));
            ListEnchantedItemForEmeralds.llIlIIlIIIIIII[2] = (0x4 ^ 0x1);
            ListEnchantedItemForEmeralds.llIlIIlIIIIIII[3] = (137 + 148 - 156 + 56 ^ 57 + 169 - 212 + 168);
        }
        
        @Override
        public void modifyMerchantRecipeList(final MerchantRecipeList llllllllllllIllIllIIlIIllIllllII, final Random llllllllllllIllIllIIlIIllIlllIll) {
            int llllllllllllIllIllIIlIIlllIIIIII = ListEnchantedItemForEmeralds.llIlIIlIIIIIII[0];
            if (lIIlIIlIIIllllIl(this.field_179406_b)) {
                llllllllllllIllIllIIlIIlllIIIIII = this.field_179406_b.getPrice(llllllllllllIllIllIIlIIllIlllIll);
            }
            final ItemStack llllllllllllIllIllIIlIIllIllllll = new ItemStack(Items.emerald, llllllllllllIllIllIIlIIlllIIIIII, ListEnchantedItemForEmeralds.llIlIIlIIIIIII[1]);
            ItemStack llllllllllllIllIllIIlIIllIlllllI = new ItemStack(this.field_179407_a.getItem(), ListEnchantedItemForEmeralds.llIlIIlIIIIIII[0], this.field_179407_a.getMetadata());
            llllllllllllIllIllIIlIIllIlllllI = EnchantmentHelper.addRandomEnchantment(llllllllllllIllIllIIlIIllIlllIll, llllllllllllIllIllIIlIIllIlllllI, ListEnchantedItemForEmeralds.llIlIIlIIIIIII[2] + llllllllllllIllIllIIlIIllIlllIll.nextInt(ListEnchantedItemForEmeralds.llIlIIlIIIIIII[3]));
            llllllllllllIllIllIIlIIllIllllII.add(new MerchantRecipe(llllllllllllIllIllIIlIIllIllllll, llllllllllllIllIllIIlIIllIlllllI));
            "".length();
        }
        
        public ListEnchantedItemForEmeralds(final Item llllllllllllIllIllIIlIIlllIIlllI, final PriceInfo llllllllllllIllIllIIlIIlllIIlIlI) {
            this.field_179407_a = new ItemStack(llllllllllllIllIllIIlIIlllIIlllI);
            this.field_179406_b = llllllllllllIllIllIIlIIlllIIlIlI;
        }
        
        private static boolean lIIlIIlIIIllllIl(final Object llllllllllllIllIllIIlIIllIllIllI) {
            return llllllllllllIllIllIIlIIllIllIllI != null;
        }
    }
    
    static class ListItemForEmeralds implements ITradeList
    {
        public /* synthetic */ PriceInfo field_179402_b;
        private static final /* synthetic */ int[] lIlIIIlllIllll;
        public /* synthetic */ ItemStack field_179403_a;
        
        private static void lllIIlIIIIlIlII() {
            (lIlIIIlllIllll = new int[2])[0] = " ".length();
            ListItemForEmeralds.lIlIIIlllIllll[1] = ((0x77 ^ 0x44) & ~(0xB2 ^ 0x81));
        }
        
        private static boolean lllIIlIIIIlIllI(final int lllllllllllllIIIlllIlllIlIllllll) {
            return lllllllllllllIIIlllIlllIlIllllll < 0;
        }
        
        static {
            lllIIlIIIIlIlII();
        }
        
        @Override
        public void modifyMerchantRecipeList(final MerchantRecipeList lllllllllllllIIIlllIlllIllIIIlll, final Random lllllllllllllIIIlllIlllIllIIIllI) {
            int lllllllllllllIIIlllIlllIllIIllIl = ListItemForEmeralds.lIlIIIlllIllll[0];
            if (lllIIlIIIIlIlIl(this.field_179402_b)) {
                lllllllllllllIIIlllIlllIllIIllIl = this.field_179402_b.getPrice(lllllllllllllIIIlllIlllIllIIIllI);
            }
            ItemStack lllllllllllllIIIlllIlllIllIIlIll = null;
            ItemStack lllllllllllllIIIlllIlllIllIIlIIl = null;
            if (lllIIlIIIIlIllI(lllllllllllllIIIlllIlllIllIIllIl)) {
                final ItemStack lllllllllllllIIIlllIlllIllIIllII = new ItemStack(Items.emerald, ListItemForEmeralds.lIlIIIlllIllll[0], ListItemForEmeralds.lIlIIIlllIllll[1]);
                final ItemStack lllllllllllllIIIlllIlllIllIIlIlI = new ItemStack(this.field_179403_a.getItem(), -lllllllllllllIIIlllIlllIllIIllIl, this.field_179403_a.getMetadata());
                "".length();
                if (((0xB8 ^ 0xC2 ^ (0xE4 ^ 0xA6)) & (0xD0 ^ 0xC6 ^ (0xA1 ^ 0x8F) ^ -" ".length())) == (0x79 ^ 0x26 ^ (0x3E ^ 0x65))) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIlllIllIIlIll = new ItemStack(Items.emerald, lllllllllllllIIIlllIlllIllIIllIl, ListItemForEmeralds.lIlIIIlllIllll[1]);
                lllllllllllllIIIlllIlllIllIIlIIl = new ItemStack(this.field_179403_a.getItem(), ListItemForEmeralds.lIlIIIlllIllll[0], this.field_179403_a.getMetadata());
            }
            lllllllllllllIIIlllIlllIllIIIlll.add(new MerchantRecipe(lllllllllllllIIIlllIlllIllIIlIll, lllllllllllllIIIlllIlllIllIIlIIl));
            "".length();
        }
        
        private static boolean lllIIlIIIIlIlIl(final Object lllllllllllllIIIlllIlllIllIIIIIl) {
            return lllllllllllllIIIlllIlllIllIIIIIl != null;
        }
        
        public ListItemForEmeralds(final Item lllllllllllllIIIlllIlllIlllIIIIl, final PriceInfo lllllllllllllIIIlllIlllIlllIIIII) {
            this.field_179403_a = new ItemStack(lllllllllllllIIIlllIlllIlllIIIIl);
            this.field_179402_b = lllllllllllllIIIlllIlllIlllIIIII;
        }
        
        public ListItemForEmeralds(final ItemStack lllllllllllllIIIlllIlllIllIllIll, final PriceInfo lllllllllllllIIIlllIlllIllIllIlI) {
            this.field_179403_a = lllllllllllllIIIlllIlllIllIllIll;
            this.field_179402_b = lllllllllllllIIIlllIlllIllIllIlI;
        }
    }
}
