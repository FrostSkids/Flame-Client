// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTBase;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.util.EntitySelectors;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.block.BlockDispenser;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.dispenser.IBehaviorDispenseItem;

public class ItemArmor extends Item
{
    private static final /* synthetic */ int[] maxDamageArray;
    public final /* synthetic */ int damageReduceAmount;
    private static final /* synthetic */ String[] lIIllIIIlIIIII;
    private static final /* synthetic */ int[] lIIllIIIlIlllI;
    public final /* synthetic */ int armorType;
    private final /* synthetic */ ArmorMaterial material;
    private static final /* synthetic */ IBehaviorDispenseItem dispenserBehavior;
    public final /* synthetic */ int renderIndex;
    
    private static boolean llIlIllIIlllIIl(final Object lllllllllllllIIlIllIIlllIlIllllI) {
        return lllllllllllllIIlIllIIlllIlIllllI != null;
    }
    
    private static boolean llIlIllIIlllIll(final Object lllllllllllllIIlIllIIlllIlIllIll, final Object lllllllllllllIIlIllIIlllIlIllIlI) {
        return lllllllllllllIIlIllIIlllIlIllIll == lllllllllllllIIlIllIIlllIlIllIlI;
    }
    
    private static boolean llIlIllIIllIllI(final int lllllllllllllIIlIllIIlllIlIlIIlI) {
        return lllllllllllllIIlIllIIlllIlIlIIlI < 0;
    }
    
    @Override
    public int getItemEnchantability() {
        return this.material.getEnchantability();
    }
    
    private static String llIlIllIIIIlIll(final String lllllllllllllIIlIllIIlllIllllIII, final String lllllllllllllIIlIllIIlllIlllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIlllIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIlllIlllIlll.getBytes(StandardCharsets.UTF_8)), ItemArmor.lIIllIIIlIlllI[15]), "DES");
            final Cipher lllllllllllllIIlIllIIlllIlllllII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIlllIlllllII.init(ItemArmor.lIIllIIIlIlllI[5], lllllllllllllIIlIllIIlllIlllllIl);
            return new String(lllllllllllllIIlIllIIlllIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIlllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIlllIllllIll) {
            lllllllllllllIIlIllIIlllIllllIll.printStackTrace();
            return null;
        }
    }
    
    public ArmorMaterial getArmorMaterial() {
        return this.material;
    }
    
    private static boolean llIlIllIIllIlIl(final int lllllllllllllIIlIllIIlllIlIlIIII) {
        return lllllllllllllIIlIllIIlllIlIlIIII > 0;
    }
    
    private static boolean llIlIllIIlllllI(final int lllllllllllllIIlIllIIlllIllIIlIl, final int lllllllllllllIIlIllIIlllIllIIlII) {
        return lllllllllllllIIlIllIIlllIllIIlIl < lllllllllllllIIlIllIIlllIllIIlII;
    }
    
    public void removeColor(final ItemStack lllllllllllllIIlIllIIlllllIIIIlI) {
        if (llIlIllIIlllIll(this.material, ArmorMaterial.LEATHER)) {
            final NBTTagCompound lllllllllllllIIlIllIIlllllIIIlIl = lllllllllllllIIlIllIIlllllIIIIlI.getTagCompound();
            if (llIlIllIIlllIIl(lllllllllllllIIlIllIIlllllIIIlIl)) {
                final NBTTagCompound lllllllllllllIIlIllIIlllllIIIlII = lllllllllllllIIlIllIIlllllIIIlIl.getCompoundTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[10]]);
                if (llIlIllIIlllIlI(lllllllllllllIIlIllIIlllllIIIlII.hasKey(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[2]]) ? 1 : 0)) {
                    lllllllllllllIIlIllIIlllllIIIlII.removeTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[18]]);
                }
            }
        }
    }
    
    public ItemArmor(final ArmorMaterial lllllllllllllIIlIllIIlllllllIllI, final int lllllllllllllIIlIllIIlllllllIIIl, final int lllllllllllllIIlIllIIlllllllIlII) {
        this.material = lllllllllllllIIlIllIIlllllllIllI;
        this.armorType = lllllllllllllIIlIllIIlllllllIlII;
        this.renderIndex = lllllllllllllIIlIllIIlllllllIIIl;
        this.damageReduceAmount = lllllllllllllIIlIllIIlllllllIllI.getDamageReductionAmount(lllllllllllllIIlIllIIlllllllIlII);
        this.setMaxDamage(lllllllllllllIIlIllIIlllllllIllI.getDurability(lllllllllllllIIlIllIIlllllllIlII));
        "".length();
        this.maxStackSize = ItemArmor.lIIllIIIlIlllI[3];
        this.setCreativeTab(CreativeTabs.tabCombat);
        "".length();
        BlockDispenser.dispenseBehaviorRegistry.putObject(this, ItemArmor.dispenserBehavior);
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIIlIllIIllllllIIllI, final int lllllllllllllIIlIllIIllllllIlIIl) {
        if (llIlIllIIllIlIl(lllllllllllllIIlIllIIllllllIlIIl)) {
            return ItemArmor.lIIllIIIlIlllI[9];
        }
        int lllllllllllllIIlIllIIllllllIlIII = this.getColor(lllllllllllllIIlIllIIllllllIIllI);
        if (llIlIllIIllIllI(lllllllllllllIIlIllIIllllllIlIII)) {
            lllllllllllllIIlIllIIllllllIlIII = ItemArmor.lIIllIIIlIlllI[9];
        }
        return lllllllllllllIIlIllIIllllllIlIII;
    }
    
    private static void llIlIllIIllIlII() {
        (lIIllIIIlIlllI = new int[22])[0] = (0x29 ^ 0x2D);
        ItemArmor.lIIllIIIlIlllI[1] = ((70 + 120 - 156 + 172 ^ 115 + 66 - 121 + 78) & (0x57 ^ 0x29 ^ (0x1E ^ 0x24) ^ -" ".length()));
        ItemArmor.lIIllIIIlIlllI[2] = (114 + 136 - 111 + 14 ^ 7 + 61 + 20 + 58);
        ItemArmor.lIIllIIIlIlllI[3] = " ".length();
        ItemArmor.lIIllIIIlIlllI[4] = (0x88 ^ 0x98);
        ItemArmor.lIIllIIIlIlllI[5] = "  ".length();
        ItemArmor.lIIllIIIlIlllI[6] = (0x40 ^ 0x4F);
        ItemArmor.lIIllIIIlIlllI[7] = "   ".length();
        ItemArmor.lIIllIIIlIlllI[8] = (0x40 ^ 0x4D);
        ItemArmor.lIIllIIIlIlllI[9] = (-" ".length() & (-1 & 0xFFFFFF));
        ItemArmor.lIIllIIIlIlllI[10] = (0xC ^ 0x6);
        ItemArmor.lIIllIIIlIlllI[11] = (0x93 ^ 0x9F ^ (0x42 ^ 0x4B));
        ItemArmor.lIIllIIIlIlllI[12] = (0x97 ^ 0x91);
        ItemArmor.lIIllIIIlIlllI[13] = -" ".length();
        ItemArmor.lIIllIIIlIlllI[14] = (0x58 ^ 0x5F);
        ItemArmor.lIIllIIIlIlllI[15] = (0xB3 ^ 0xBB);
        ItemArmor.lIIllIIIlIlllI[16] = (83 + 66 - 34 + 14 ^ 14 + 86 + 28 + 8);
        ItemArmor.lIIllIIIlIlllI[17] = (-(0xFFFF8B87 & 0x767B) & (0xFFFFFFE6 & 0xA0675B));
        ItemArmor.lIIllIIIlIlllI[18] = (0xB5 ^ 0xB9);
        ItemArmor.lIIllIIIlIlllI[19] = (0x69 ^ 0x67);
        ItemArmor.lIIllIIIlIlllI[20] = (0x74 ^ 0x65);
        ItemArmor.lIIllIIIlIlllI[21] = (172 + 71 - 84 + 14 ^ 61 + 151 - 153 + 132);
    }
    
    private static boolean llIlIllIIlllIlI(final int lllllllllllllIIlIllIIlllIlIlIllI) {
        return lllllllllllllIIlIllIIlllIlIlIllI != 0;
    }
    
    public boolean hasColor(final ItemStack lllllllllllllIIlIllIIlllllIllIII) {
        int hasKey;
        if (llIlIllIIllIlll(this.material, ArmorMaterial.LEATHER)) {
            hasKey = ItemArmor.lIIllIIIlIlllI[1];
            "".length();
            if (" ".length() == (23 + 22 + 83 + 45 ^ 77 + 95 - 143 + 140)) {
                return ((0x2A ^ 0x22 ^ "   ".length()) & (105 + 46 - 118 + 123 ^ 100 + 24 - 50 + 77 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlIllIIlllIII(lllllllllllllIIlIllIIlllllIllIII.hasTagCompound() ? 1 : 0)) {
            hasKey = ItemArmor.lIIllIIIlIlllI[1];
            "".length();
            if (-(0x31 ^ 0x36 ^ "   ".length()) >= 0) {
                return ((68 + 78 - 112 + 111 ^ 118 + 136 - 217 + 160) & (86 + 187 - 125 + 101 ^ 30 + 96 - 28 + 75 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlIllIIlllIII(lllllllllllllIIlIllIIlllllIllIII.getTagCompound().hasKey(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[0]], ItemArmor.lIIllIIIlIlllI[10]) ? 1 : 0)) {
            hasKey = ItemArmor.lIIllIIIlIlllI[1];
            "".length();
            if (null != null) {
                return ((0xED ^ 0xC0) & ~(0x31 ^ 0x1C)) != 0x0;
            }
        }
        else {
            hasKey = (lllllllllllllIIlIllIIlllllIllIII.getTagCompound().getCompoundTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[11]]).hasKey(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[12]], ItemArmor.lIIllIIIlIlllI[7]) ? 1 : 0);
        }
        return hasKey != 0;
    }
    
    private static void llIlIllIIIllIII() {
        (lIIllIIIlIIIII = new String[ItemArmor.lIIllIIIlIlllI[21]])[ItemArmor.lIIllIIIlIlllI[1]] = llIlIllIIIIlIII("rhMEMJs5WBX9yM0IC2tzFtaJpGpr3fUkwtwMDFmov7Z9xaS2TUFfiQ==", "zMuqj");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[3]] = llIlIllIIIIlIll("HYMlxkvErQysmRjh7WKCajPLnYhuGJAFztk8ihCjxW48zf/sxur+zTBLCu81Ey0y", "BEBPv");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[5]] = llIlIllIIIIlIII("792pwnC5x+qP8qu+YEz/HQV5lvwDEA/k1YED6A5ionZkL3Q6RUE7jmdru61C+PSv", "Kgwrl");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[7]] = llIlIllIIIlIllI("KxksEiU0ESQDfC8EJxo1aRUvBzI/LyMFKykCHQQqKQQdFSkpBDE=", "FpBwF");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[0]] = llIlIllIIIIlIII("e7wLLMTQMVw=", "ydNbp");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[11]] = llIlIllIIIIlIII("7c7tt5LcTwg=", "TXnLQ");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[12]] = llIlIllIIIlIllI("MwM6OBE=", "PlVWc");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[14]] = llIlIllIIIIlIll("VKWLYHdNNRQ=", "BldDQ");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[15]] = llIlIllIIIIlIII("mktIE66PSLs=", "BZUtH");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[16]] = llIlIllIIIIlIII("WlXTSj7fp5U=", "ciUIh");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[10]] = llIlIllIIIlIllI("FSQ4NyQQNA==", "qMKGH");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[2]] = llIlIllIIIIlIII("WA6U5dvvNMk=", "YyHal");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[18]] = llIlIllIIIIlIll("1GjudD1vHhc=", "YHaQg");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[8]] = llIlIllIIIIlIll("bnLqvn7y/bzml5sCtInK6036KpzcLQtQ", "syepB");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[19]] = llIlIllIIIIlIll("U2uISzp0mT8=", "csDTS");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[6]] = llIlIllIIIIlIII("OyFEXm5gQk8=", "ohykT");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[4]] = llIlIllIIIIlIII("QzXPkQ1x8hw=", "GdBbj");
        ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[20]] = llIlIllIIIIlIll("FP9hAVmHi44=", "VZZuz");
    }
    
    private static boolean llIlIllIIllIlll(final Object lllllllllllllIIlIllIIlllIllIIIIl, final Object lllllllllllllIIlIllIIlllIllIIIII) {
        return lllllllllllllIIlIllIIlllIllIIIIl != lllllllllllllIIlIllIIlllIllIIIII;
    }
    
    static {
        llIlIllIIllIlII();
        llIlIllIIIllIII();
        final int[] maxDamageArray2 = new int[ItemArmor.lIIllIIIlIlllI[0]];
        maxDamageArray2[ItemArmor.lIIllIIIlIlllI[1]] = ItemArmor.lIIllIIIlIlllI[2];
        maxDamageArray2[ItemArmor.lIIllIIIlIlllI[3]] = ItemArmor.lIIllIIIlIlllI[4];
        maxDamageArray2[ItemArmor.lIIllIIIlIlllI[5]] = ItemArmor.lIIllIIIlIlllI[6];
        maxDamageArray2[ItemArmor.lIIllIIIlIlllI[7]] = ItemArmor.lIIllIIIlIlllI[8];
        maxDamageArray = maxDamageArray2;
        final String[] empty_SLOT_NAMES = new String[ItemArmor.lIIllIIIlIlllI[0]];
        empty_SLOT_NAMES[ItemArmor.lIIllIIIlIlllI[1]] = ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[1]];
        empty_SLOT_NAMES[ItemArmor.lIIllIIIlIlllI[3]] = ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[3]];
        empty_SLOT_NAMES[ItemArmor.lIIllIIIlIlllI[5]] = ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[5]];
        empty_SLOT_NAMES[ItemArmor.lIIllIIIlIlllI[7]] = ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[7]];
        EMPTY_SLOT_NAMES = empty_SLOT_NAMES;
        dispenserBehavior = new BehaviorDefaultDispenseItem() {
            private static final /* synthetic */ int[] lIIIlllIllllll;
            
            static {
                llIIIlllIlIlIII();
            }
            
            private static boolean llIIIlllIlIlIIl(final int lllllllllllllIIllllIlIlllIIlIlll) {
                return lllllllllllllIIllllIlIlllIIlIlll > 0;
            }
            
            private static boolean llIIIlllIlIlIlI(final int lllllllllllllIIllllIlIlllIIllIIl) {
                return lllllllllllllIIllllIlIlllIIllIIl != 0;
            }
            
            @Override
            protected ItemStack dispenseStack(final IBlockSource lllllllllllllIIllllIlIlllIlIIllI, final ItemStack lllllllllllllIIllllIlIlllIllIIlI) {
                final BlockPos lllllllllllllIIllllIlIlllIllIIIl = lllllllllllllIIllllIlIlllIlIIllI.getBlockPos().offset(BlockDispenser.getFacing(lllllllllllllIIllllIlIlllIlIIllI.getBlockMetadata()));
                final int lllllllllllllIIllllIlIlllIllIIII = lllllllllllllIIllllIlIlllIllIIIl.getX();
                final int lllllllllllllIIllllIlIlllIlIllll = lllllllllllllIIllllIlIlllIllIIIl.getY();
                final int lllllllllllllIIllllIlIlllIlIlllI = lllllllllllllIIllllIlIlllIllIIIl.getZ();
                final AxisAlignedBB lllllllllllllIIllllIlIlllIlIllIl = new AxisAlignedBB(lllllllllllllIIllllIlIlllIllIIII, lllllllllllllIIllllIlIlllIlIllll, lllllllllllllIIllllIlIlllIlIlllI, lllllllllllllIIllllIlIlllIllIIII + ItemArmor$1.lIIIlllIllllll[0], lllllllllllllIIllllIlIlllIlIllll + ItemArmor$1.lIIIlllIllllll[0], lllllllllllllIIllllIlIlllIlIlllI + ItemArmor$1.lIIIlllIllllll[0]);
                final List<EntityLivingBase> lllllllllllllIIllllIlIlllIlIllII = lllllllllllllIIllllIlIlllIlIIllI.getWorld().getEntitiesWithinAABB((Class<? extends EntityLivingBase>)EntityLivingBase.class, lllllllllllllIIllllIlIlllIlIllIl, (com.google.common.base.Predicate<? super EntityLivingBase>)Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, (Predicate)new EntitySelectors.ArmoredMob(lllllllllllllIIllllIlIlllIllIIlI)));
                if (llIIIlllIlIlIIl(lllllllllllllIIllllIlIlllIlIllII.size())) {
                    final EntityLivingBase lllllllllllllIIllllIlIlllIlIlIll = lllllllllllllIIllllIlIlllIlIllII.get(ItemArmor$1.lIIIlllIllllll[1]);
                    int n;
                    if (llIIIlllIlIlIlI((lllllllllllllIIllllIlIlllIlIlIll instanceof EntityPlayer) ? 1 : 0)) {
                        n = ItemArmor$1.lIIIlllIllllll[0];
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        n = ItemArmor$1.lIIIlllIllllll[1];
                    }
                    final int lllllllllllllIIllllIlIlllIlIlIlI = n;
                    final int lllllllllllllIIllllIlIlllIlIlIIl = EntityLiving.getArmorPosition(lllllllllllllIIllllIlIlllIllIIlI);
                    final ItemStack lllllllllllllIIllllIlIlllIlIlIII = lllllllllllllIIllllIlIlllIllIIlI.copy();
                    lllllllllllllIIllllIlIlllIlIlIII.stackSize = ItemArmor$1.lIIIlllIllllll[0];
                    lllllllllllllIIllllIlIlllIlIlIll.setCurrentItemOrArmor(lllllllllllllIIllllIlIlllIlIlIIl - lllllllllllllIIllllIlIlllIlIlIlI, lllllllllllllIIllllIlIlllIlIlIII);
                    if (llIIIlllIlIlIlI((lllllllllllllIIllllIlIlllIlIlIll instanceof EntityLiving) ? 1 : 0)) {
                        ((EntityLiving)lllllllllllllIIllllIlIlllIlIlIll).setEquipmentDropChance(lllllllllllllIIllllIlIlllIlIlIIl, 2.0f);
                    }
                    lllllllllllllIIllllIlIlllIllIIlI.stackSize -= ItemArmor$1.lIIIlllIllllll[0];
                    return lllllllllllllIIllllIlIlllIllIIlI;
                }
                return super.dispenseStack(lllllllllllllIIllllIlIlllIlIIllI, lllllllllllllIIllllIlIlllIllIIlI);
            }
            
            private static void llIIIlllIlIlIII() {
                (lIIIlllIllllll = new int[2])[0] = " ".length();
                ItemArmor$1.lIIIlllIllllll[1] = ((34 + 48 - 48 + 135 ^ 62 + 72 - 37 + 43) & (69 + 88 - 136 + 118 ^ 137 + 74 - 200 + 163 ^ -" ".length()));
            }
        };
    }
    
    public void setColor(final ItemStack lllllllllllllIIlIllIIllllIllIlII, final int lllllllllllllIIlIllIIllllIlllIII) {
        if (llIlIllIIllIlll(this.material, ArmorMaterial.LEATHER)) {
            throw new UnsupportedOperationException(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[8]]);
        }
        NBTTagCompound lllllllllllllIIlIllIIllllIllIlll = lllllllllllllIIlIllIIllllIllIlII.getTagCompound();
        if (llIlIllIIllllII(lllllllllllllIIlIllIIllllIllIlll)) {
            lllllllllllllIIlIllIIllllIllIlll = new NBTTagCompound();
            lllllllllllllIIlIllIIllllIllIlII.setTagCompound(lllllllllllllIIlIllIIllllIllIlll);
        }
        final NBTTagCompound lllllllllllllIIlIllIIllllIllIllI = lllllllllllllIIlIllIIllllIllIlll.getCompoundTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[19]]);
        if (llIlIllIIlllIII(lllllllllllllIIlIllIIllllIllIlll.hasKey(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[6]], ItemArmor.lIIllIIIlIlllI[10]) ? 1 : 0)) {
            lllllllllllllIIlIllIIllllIllIlll.setTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[4]], lllllllllllllIIlIllIIllllIllIllI);
        }
        lllllllllllllIIlIllIIllllIllIllI.setInteger(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[20]], lllllllllllllIIlIllIIllllIlllIII);
    }
    
    private static String llIlIllIIIlIllI(String lllllllllllllIIlIllIIllllIIIlIlI, final String lllllllllllllIIlIllIIllllIIIlllI) {
        lllllllllllllIIlIllIIllllIIIlIlI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIllIIllllIIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIllllIIIllIl = new StringBuilder();
        final char[] lllllllllllllIIlIllIIllllIIIllII = lllllllllllllIIlIllIIllllIIIlllI.toCharArray();
        int lllllllllllllIIlIllIIllllIIIlIll = ItemArmor.lIIllIIIlIlllI[1];
        final short lllllllllllllIIlIllIIllllIIIIlIl = (Object)((String)lllllllllllllIIlIllIIllllIIIlIlI).toCharArray();
        final byte lllllllllllllIIlIllIIllllIIIIlII = (byte)lllllllllllllIIlIllIIllllIIIIlIl.length;
        char lllllllllllllIIlIllIIllllIIIIIll = (char)ItemArmor.lIIllIIIlIlllI[1];
        while (llIlIllIIlllllI(lllllllllllllIIlIllIIllllIIIIIll, lllllllllllllIIlIllIIllllIIIIlII)) {
            final char lllllllllllllIIlIllIIllllIIlIIII = lllllllllllllIIlIllIIllllIIIIlIl[lllllllllllllIIlIllIIllllIIIIIll];
            lllllllllllllIIlIllIIllllIIIllIl.append((char)(lllllllllllllIIlIllIIllllIIlIIII ^ lllllllllllllIIlIllIIllllIIIllII[lllllllllllllIIlIllIIllllIIIlIll % lllllllllllllIIlIllIIllllIIIllII.length]));
            "".length();
            ++lllllllllllllIIlIllIIllllIIIlIll;
            ++lllllllllllllIIlIllIIllllIIIIIll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIllllIIIllIl);
    }
    
    @Override
    public boolean getIsRepairable(final ItemStack lllllllllllllIIlIllIIllllIlIllII, final ItemStack lllllllllllllIIlIllIIllllIlIlIll) {
        int isRepairable;
        if (llIlIllIIlllIll(this.material.getRepairItem(), lllllllllllllIIlIllIIllllIlIlIll.getItem())) {
            isRepairable = ItemArmor.lIIllIIIlIlllI[3];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x50 ^ 0x4A) & ~(0xB7 ^ 0xAD)) != 0x0;
            }
        }
        else {
            isRepairable = (super.getIsRepairable(lllllllllllllIIlIllIIllllIlIllII, lllllllllllllIIlIllIIllllIlIlIll) ? 1 : 0);
        }
        return isRepairable != 0;
    }
    
    private static boolean llIlIllIIlllIII(final int lllllllllllllIIlIllIIlllIlIlIlII) {
        return lllllllllllllIIlIllIIlllIlIlIlII == 0;
    }
    
    private static boolean llIlIllIIllllII(final Object lllllllllllllIIlIllIIlllIlIllIII) {
        return lllllllllllllIIlIllIIlllIlIllIII == null;
    }
    
    private static String llIlIllIIIIlIII(final String lllllllllllllIIlIllIIlllIllIllIl, final String lllllllllllllIIlIllIIlllIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIlllIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIlllIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIlllIllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIlllIllIllll.init(ItemArmor.lIIllIIIlIlllI[5], lllllllllllllIIlIllIIlllIlllIIII);
            return new String(lllllllllllllIIlIllIIlllIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIlllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIlllIllIlllI) {
            lllllllllllllIIlIllIIlllIllIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIlIllIIllllIlIIIlI, final World lllllllllllllIIlIllIIllllIlIIIIl, final EntityPlayer lllllllllllllIIlIllIIllllIIlllII) {
        final int lllllllllllllIIlIllIIllllIIlllll = EntityLiving.getArmorPosition(lllllllllllllIIlIllIIllllIlIIIlI) - ItemArmor.lIIllIIIlIlllI[3];
        final ItemStack lllllllllllllIIlIllIIllllIIllllI = lllllllllllllIIlIllIIllllIIlllII.getCurrentArmor(lllllllllllllIIlIllIIllllIIlllll);
        if (llIlIllIIllllII(lllllllllllllIIlIllIIllllIIllllI)) {
            lllllllllllllIIlIllIIllllIIlllII.setCurrentItemOrArmor(lllllllllllllIIlIllIIllllIIlllll, lllllllllllllIIlIllIIllllIlIIIlI.copy());
            lllllllllllllIIlIllIIllllIlIIIlI.stackSize = ItemArmor.lIIllIIIlIlllI[1];
        }
        return lllllllllllllIIlIllIIllllIlIIIlI;
    }
    
    public int getColor(final ItemStack lllllllllllllIIlIllIIlllllIlIIlI) {
        if (llIlIllIIllIlll(this.material, ArmorMaterial.LEATHER)) {
            return ItemArmor.lIIllIIIlIlllI[13];
        }
        final NBTTagCompound lllllllllllllIIlIllIIlllllIlIIIl = lllllllllllllIIlIllIIlllllIlIIlI.getTagCompound();
        if (llIlIllIIlllIIl(lllllllllllllIIlIllIIlllllIlIIIl)) {
            final NBTTagCompound lllllllllllllIIlIllIIlllllIlIIII = lllllllllllllIIlIllIIlllllIlIIIl.getCompoundTag(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[14]]);
            if (llIlIllIIlllIIl(lllllllllllllIIlIllIIlllllIlIIII) && llIlIllIIlllIlI(lllllllllllllIIlIllIIlllllIlIIII.hasKey(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[15]], ItemArmor.lIIllIIIlIlllI[7]) ? 1 : 0)) {
                return lllllllllllllIIlIllIIlllllIlIIII.getInteger(ItemArmor.lIIllIIIlIIIII[ItemArmor.lIIllIIIlIlllI[16]]);
            }
        }
        return ItemArmor.lIIllIIIlIlllI[17];
    }
    
    public enum ArmorMaterial
    {
        private final /* synthetic */ int[] damageReductionAmountArray;
        private final /* synthetic */ int enchantability;
        
        DIAMOND(llllllllllllIllIIlllllllIIIllIII5, llllllllllllIllIIlllllllIIIlIlll5, llllllllllllIllIIlllllllIIIlIllI5, llllllllllllIllIIlllllllIIIlIlIl5, llllllllllllIllIIlllllllIIIllIll5, ArmorMaterial.llIllIIlIIIIIl[14]), 
        LEATHER(llllllllllllIllIIlllllllIIIllIII, llllllllllllIllIIlllllllIIIlIlll, llllllllllllIllIIlllllllIIIlIllI, llllllllllllIllIIlllllllIIIlIlIl, llllllllllllIllIIlllllllIIIllIll, ArmorMaterial.llIllIIlIIIIIl[6]);
        
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] llIllIIlIIIIIl;
        
        CHAIN(llllllllllllIllIIlllllllIIIllIII2, llllllllllllIllIIlllllllIIIlIlll2, llllllllllllIllIIlllllllIIIlIllI2, llllllllllllIllIIlllllllIIIlIlIl2, llllllllllllIllIIlllllllIIIllIll2, ArmorMaterial.llIllIIlIIIIIl[7]), 
        IRON(llllllllllllIllIIlllllllIIIllIII3, llllllllllllIllIIlllllllIIIlIlll3, llllllllllllIllIIlllllllIIIlIllI3, llllllllllllIllIIlllllllIIIlIlIl3, llllllllllllIllIIlllllllIIIllIll3, ArmorMaterial.llIllIIlIIIIIl[9]);
        
        private final /* synthetic */ int maxDamageFactor;
        
        GOLD(llllllllllllIllIIlllllllIIIllIII4, llllllllllllIllIIlllllllIIIlIlll4, llllllllllllIllIIlllllllIIIlIllI4, llllllllllllIllIIlllllllIIIlIlIl4, llllllllllllIllIIlllllllIIIllIll4, ArmorMaterial.llIllIIlIIIIIl[11]);
        
        private static final /* synthetic */ String[] llIllIIIllllll;
        
        public String getName() {
            return this.name;
        }
        
        public Item getRepairItem() {
            Item item;
            if (lIIlIllIlIllIIIl(this, ArmorMaterial.LEATHER)) {
                item = Items.leather;
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            else if (lIIlIllIlIllIIIl(this, ArmorMaterial.CHAIN)) {
                item = Items.iron_ingot;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            else if (lIIlIllIlIllIIIl(this, ArmorMaterial.GOLD)) {
                item = Items.gold_ingot;
                "".length();
                if (((0x34 ^ 0x41 ^ (0x9D ^ 0xBE)) & (78 + 101 - 32 + 57 ^ 112 + 53 - 26 + 15 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else if (lIIlIllIlIllIIIl(this, ArmorMaterial.IRON)) {
                item = Items.iron_ingot;
                "".length();
                if (((0x50 ^ 0x6B ^ (0x35 ^ 0x1C)) & (0x9D ^ 0xBC ^ (0x31 ^ 0x2) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else if (lIIlIllIlIllIIIl(this, ArmorMaterial.DIAMOND)) {
                item = Items.diamond;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                item = null;
            }
            return item;
        }
        
        public int getDamageReductionAmount(final int llllllllllllIllIIlllllllIIIIIlll) {
            return this.damageReductionAmountArray[llllllllllllIllIIlllllllIIIIIlll];
        }
        
        public int getDurability(final int llllllllllllIllIIlllllllIIIIllIl) {
            return ItemArmor.maxDamageArray[llllllllllllIllIIlllllllIIIIllIl] * this.maxDamageFactor;
        }
        
        private ArmorMaterial(final String llllllllllllIllIIlllllllIIIllIII, final int llllllllllllIllIIlllllllIIIlIlll, final String llllllllllllIllIIlllllllIIIlIllI, final int llllllllllllIllIIlllllllIIIlIlIl, final int[] llllllllllllIllIIlllllllIIIllIll, final int llllllllllllIllIIlllllllIIIlIIll) {
            this.name = llllllllllllIllIIlllllllIIIlIllI;
            this.maxDamageFactor = llllllllllllIllIIlllllllIIIlIlIl;
            this.damageReductionAmountArray = llllllllllllIllIIlllllllIIIllIll;
            this.enchantability = llllllllllllIllIIlllllllIIIlIIll;
        }
        
        private static void lIIlIllIlIlIlllI() {
            (llIllIIIllllll = new String[ArmorMaterial.llIllIIlIIIIIl[14]])[ArmorMaterial.llIllIIlIIIIIl[0]] = lIIlIllIlIlIlIII("KDEzIxshJg==", "dtrwS");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[1]] = lIIlIllIlIlIlIIl("dvno8SWAniU=", "kIqDt");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[5]] = lIIlIllIlIlIlIII("MiQzOBY=", "qlrqX");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[4]] = lIIlIllIlIlIlIIl("GRLQp2/63E63R/r7HJw+cw==", "ffIyU");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[3]] = lIIlIllIlIlIlIlI("kkT4nf8mLdw=", "knhmB");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[2]] = lIIlIllIlIlIlIIl("z9Ch+aYFe8I=", "ahlol");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[8]] = lIIlIllIlIlIlIIl("zHPuRn9L4cU=", "ggTmD");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[10]] = lIIlIllIlIlIlIlI("rhdCTf1EEks=", "LPiSK");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[12]] = lIIlIllIlIlIlIII("CQU4OzYDCA==", "MLyvy");
            ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[9]] = lIIlIllIlIlIlIII("IiU2Bz4oKA==", "FLWjQ");
        }
        
        static {
            lIIlIllIlIllIIII();
            lIIlIllIlIlIlllI();
            final String llllllllllllIllIIlllllllIIIllIII = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[0]];
            final int llllllllllllIllIIlllllllIIIlIlll = ArmorMaterial.llIllIIlIIIIIl[0];
            final String llllllllllllIllIIlllllllIIIlIllI = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[1]];
            final int llllllllllllIllIIlllllllIIIlIlIl = ArmorMaterial.llIllIIlIIIIIl[2];
            final int[] llllllllllllIllIIlllllllIIIllIll = new int[ArmorMaterial.llIllIIlIIIIIl[3]];
            llllllllllllIllIIlllllllIIIllIll[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.llIllIIlIIIIIl[1];
            llllllllllllIllIIlllllllIIIllIll[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.llIllIIlIIIIIl[4];
            llllllllllllIllIIlllllllIIIllIll[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.llIllIIlIIIIIl[5];
            llllllllllllIllIIlllllllIIIllIll[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.llIllIIlIIIIIl[1];
            final String llllllllllllIllIIlllllllIIIllIII2 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[5]];
            final int llllllllllllIllIIlllllllIIIlIlll2 = ArmorMaterial.llIllIIlIIIIIl[1];
            final String llllllllllllIllIIlllllllIIIlIllI2 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[4]];
            final int llllllllllllIllIIlllllllIIIlIlIl2 = ArmorMaterial.llIllIIlIIIIIl[6];
            final int[] llllllllllllIllIIlllllllIIIllIll2 = new int[ArmorMaterial.llIllIIlIIIIIl[3]];
            llllllllllllIllIIlllllllIIIllIll2[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.llIllIIlIIIIIl[5];
            llllllllllllIllIIlllllllIIIllIll2[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.llIllIIlIIIIIl[2];
            llllllllllllIllIIlllllllIIIllIll2[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.llIllIIlIIIIIl[3];
            llllllllllllIllIIlllllllIIIllIll2[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.llIllIIlIIIIIl[1];
            final String llllllllllllIllIIlllllllIIIllIII3 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[3]];
            final int llllllllllllIllIIlllllllIIIlIlll3 = ArmorMaterial.llIllIIlIIIIIl[5];
            final String llllllllllllIllIIlllllllIIIlIllI3 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[2]];
            final int llllllllllllIllIIlllllllIIIlIlIl3 = ArmorMaterial.llIllIIlIIIIIl[6];
            final int[] llllllllllllIllIIlllllllIIIllIll3 = new int[ArmorMaterial.llIllIIlIIIIIl[3]];
            llllllllllllIllIIlllllllIIIllIll3[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.llIllIIlIIIIIl[5];
            llllllllllllIllIIlllllllIIIllIll3[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.llIllIIlIIIIIl[8];
            llllllllllllIllIIlllllllIIIllIll3[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.llIllIIlIIIIIl[2];
            llllllllllllIllIIlllllllIIIllIll3[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.llIllIIlIIIIIl[5];
            final String llllllllllllIllIIlllllllIIIllIII4 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[8]];
            final int llllllllllllIllIIlllllllIIIlIlll4 = ArmorMaterial.llIllIIlIIIIIl[4];
            final String llllllllllllIllIIlllllllIIIlIllI4 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[10]];
            final int llllllllllllIllIIlllllllIIIlIlIl4 = ArmorMaterial.llIllIIlIIIIIl[10];
            final int[] llllllllllllIllIIlllllllIIIllIll4 = new int[ArmorMaterial.llIllIIlIIIIIl[3]];
            llllllllllllIllIIlllllllIIIllIll4[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.llIllIIlIIIIIl[5];
            llllllllllllIllIIlllllllIIIllIll4[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.llIllIIlIIIIIl[2];
            llllllllllllIllIIlllllllIIIllIll4[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.llIllIIlIIIIIl[4];
            llllllllllllIllIIlllllllIIIllIll4[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.llIllIIlIIIIIl[1];
            final String llllllllllllIllIIlllllllIIIllIII5 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[12]];
            final int llllllllllllIllIIlllllllIIIlIlll5 = ArmorMaterial.llIllIIlIIIIIl[3];
            final String llllllllllllIllIIlllllllIIIlIllI5 = ArmorMaterial.llIllIIIllllll[ArmorMaterial.llIllIIlIIIIIl[9]];
            final int llllllllllllIllIIlllllllIIIlIlIl5 = ArmorMaterial.llIllIIlIIIIIl[13];
            final int[] llllllllllllIllIIlllllllIIIllIll5 = new int[ArmorMaterial.llIllIIlIIIIIl[3]];
            llllllllllllIllIIlllllllIIIllIll5[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.llIllIIlIIIIIl[4];
            llllllllllllIllIIlllllllIIIllIll5[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.llIllIIlIIIIIl[12];
            llllllllllllIllIIlllllllIIIllIll5[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.llIllIIlIIIIIl[8];
            llllllllllllIllIIlllllllIIIllIll5[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.llIllIIlIIIIIl[4];
            final ArmorMaterial[] enum$VALUES = new ArmorMaterial[ArmorMaterial.llIllIIlIIIIIl[2]];
            enum$VALUES[ArmorMaterial.llIllIIlIIIIIl[0]] = ArmorMaterial.LEATHER;
            enum$VALUES[ArmorMaterial.llIllIIlIIIIIl[1]] = ArmorMaterial.CHAIN;
            enum$VALUES[ArmorMaterial.llIllIIlIIIIIl[5]] = ArmorMaterial.IRON;
            enum$VALUES[ArmorMaterial.llIllIIlIIIIIl[4]] = ArmorMaterial.GOLD;
            enum$VALUES[ArmorMaterial.llIllIIlIIIIIl[3]] = ArmorMaterial.DIAMOND;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lIIlIllIlIlIlIIl(final String llllllllllllIllIIllllllIlllIlllI, final String llllllllllllIllIIllllllIlllIllIl) {
            try {
                final SecretKeySpec llllllllllllIllIIllllllIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllllIlllIllIl.getBytes(StandardCharsets.UTF_8)), ArmorMaterial.llIllIIlIIIIIl[12]), "DES");
                final Cipher llllllllllllIllIIllllllIllllIIII = Cipher.getInstance("DES");
                llllllllllllIllIIllllllIllllIIII.init(ArmorMaterial.llIllIIlIIIIIl[5], llllllllllllIllIIllllllIllllIIIl);
                return new String(llllllllllllIllIIllllllIllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIllllllIlllIllll) {
                llllllllllllIllIIllllllIlllIllll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIllIlIlIlIlI(final String llllllllllllIllIIllllllIllIlllll, final String llllllllllllIllIIllllllIllIllllI) {
            try {
                final SecretKeySpec llllllllllllIllIIllllllIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllllIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIllllllIlllIIIll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIllllllIlllIIIll.init(ArmorMaterial.llIllIIlIIIIIl[5], llllllllllllIllIIllllllIlllIIlII);
                return new String(llllllllllllIllIIllllllIlllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllllIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIllllllIlllIIIlI) {
                llllllllllllIllIIllllllIlllIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIllIlIlIlIII(String llllllllllllIllIIllllllIllIIllII, final String llllllllllllIllIIllllllIllIIlIll) {
            llllllllllllIllIIllllllIllIIllII = new String(Base64.getDecoder().decode(llllllllllllIllIIllllllIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIllllllIllIIllll = new StringBuilder();
            final char[] llllllllllllIllIIllllllIllIIlllI = llllllllllllIllIIllllllIllIIlIll.toCharArray();
            int llllllllllllIllIIllllllIllIIllIl = ArmorMaterial.llIllIIlIIIIIl[0];
            final short llllllllllllIllIIllllllIllIIIlll = (Object)llllllllllllIllIIllllllIllIIllII.toCharArray();
            final String llllllllllllIllIIllllllIllIIIllI = (String)llllllllllllIllIIllllllIllIIIlll.length;
            byte llllllllllllIllIIllllllIllIIIlIl = (byte)ArmorMaterial.llIllIIlIIIIIl[0];
            while (lIIlIllIlIllIIlI(llllllllllllIllIIllllllIllIIIlIl, (int)llllllllllllIllIIllllllIllIIIllI)) {
                final char llllllllllllIllIIllllllIllIlIIlI = llllllllllllIllIIllllllIllIIIlll[llllllllllllIllIIllllllIllIIIlIl];
                llllllllllllIllIIllllllIllIIllll.append((char)(llllllllllllIllIIllllllIllIlIIlI ^ llllllllllllIllIIllllllIllIIlllI[llllllllllllIllIIllllllIllIIllIl % llllllllllllIllIIllllllIllIIlllI.length]));
                "".length();
                ++llllllllllllIllIIllllllIllIIllIl;
                ++llllllllllllIllIIllllllIllIIIlIl;
                "".length();
                if (((((0x6E ^ 0x7B) & ~(0x8D ^ 0x98)) ^ (0x2A ^ 0x1F)) & (68 + 79 - 37 + 18 ^ 126 + 78 - 104 + 81 ^ -" ".length())) > 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIllllllIllIIllll);
        }
        
        public int getEnchantability() {
            return this.enchantability;
        }
        
        private static boolean lIIlIllIlIllIIlI(final int llllllllllllIllIIllllllIllIIIIIl, final int llllllllllllIllIIllllllIllIIIIII) {
            return llllllllllllIllIIllllllIllIIIIIl < llllllllllllIllIIllllllIllIIIIII;
        }
        
        private static boolean lIIlIllIlIllIIIl(final Object llllllllllllIllIIllllllIlIllllIl, final Object llllllllllllIllIIllllllIlIllllII) {
            return llllllllllllIllIIllllllIlIllllIl == llllllllllllIllIIllllllIlIllllII;
        }
        
        private static void lIIlIllIlIllIIII() {
            (llIllIIlIIIIIl = new int[15])[0] = ((104 + 143 - 165 + 79 ^ 176 + 5 - 48 + 47) & (46 + 86 - 129 + 129 ^ 17 + 133 - 61 + 56 ^ -" ".length()));
            ArmorMaterial.llIllIIlIIIIIl[1] = " ".length();
            ArmorMaterial.llIllIIlIIIIIl[2] = (0x9F ^ 0x9A);
            ArmorMaterial.llIllIIlIIIIIl[3] = (0x30 ^ 0x29 ^ (0xB6 ^ 0xAB));
            ArmorMaterial.llIllIIlIIIIIl[4] = "   ".length();
            ArmorMaterial.llIllIIlIIIIIl[5] = "  ".length();
            ArmorMaterial.llIllIIlIIIIIl[6] = (0x79 ^ 0x76);
            ArmorMaterial.llIllIIlIIIIIl[7] = (0x81 ^ 0x8D);
            ArmorMaterial.llIllIIlIIIIIl[8] = (0xB8 ^ 0xBE);
            ArmorMaterial.llIllIIlIIIIIl[9] = (0x13 ^ 0x1A);
            ArmorMaterial.llIllIIlIIIIIl[10] = (0x3D ^ 0x6 ^ (0x33 ^ 0xF));
            ArmorMaterial.llIllIIlIIIIIl[11] = (0x2A ^ 0x9 ^ (0x69 ^ 0x53));
            ArmorMaterial.llIllIIlIIIIIl[12] = (0x8 ^ 0x0);
            ArmorMaterial.llIllIIlIIIIIl[13] = (0x6F ^ 0x78 ^ (0xB ^ 0x3D));
            ArmorMaterial.llIllIIlIIIIIl[14] = (0xA8 ^ 0xB1 ^ (0x56 ^ 0x45));
        }
    }
}
