// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.entity.Entity;
import java.util.Iterator;
import net.minecraft.entity.EnumCreatureAttribute;
import java.util.Map;
import net.minecraft.util.StatCollector;
import net.minecraft.init.Items;
import net.minecraft.util.EnumChatFormatting;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.enchantment.EnchantmentDurability;
import net.minecraft.enchantment.EnchantmentHelper;
import java.util.Random;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.HashMultimap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import com.google.common.collect.Multimap;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.block.Block;
import java.text.DecimalFormat;
import net.minecraft.nbt.NBTTagCompound;

public final class ItemStack
{
    private /* synthetic */ NBTTagCompound stackTagCompound;
    public static final /* synthetic */ DecimalFormat DECIMALFORMAT;
    private static final /* synthetic */ int[] lIIlIIIIllIIll;
    private /* synthetic */ Block canDestroyCacheBlock;
    private /* synthetic */ boolean canDestroyCacheResult;
    private /* synthetic */ EntityItemFrame itemFrame;
    private /* synthetic */ Block canPlaceOnCacheBlock;
    private /* synthetic */ int itemDamage;
    public /* synthetic */ int stackSize;
    private static final /* synthetic */ String[] lIIlIIIIlIllIl;
    private /* synthetic */ Item item;
    public /* synthetic */ int animationsToGo;
    private /* synthetic */ boolean canPlaceOnCacheResult;
    
    public boolean isStackable() {
        if (llIIlIIlllllllI(this.getMaxStackSize(), ItemStack.lIIlIIIIllIIll[1]) && (!llIIlIIllllllII(this.isItemStackDamageable() ? 1 : 0) || llIIlIIllllllll(this.isItemDamaged() ? 1 : 0))) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public NBTTagList getEnchantmentTagList() {
        NBTTagList tagList;
        if (llIIlIIllllllIl(this.stackTagCompound)) {
            tagList = null;
            "".length();
            if (((0xFD ^ 0xAF) & ~(0xD2 ^ 0x80)) < 0) {
                return null;
            }
        }
        else {
            tagList = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[16]], ItemStack.lIIlIIIIllIIll[10]);
        }
        return tagList;
    }
    
    private static void llIIlIIlllllIIl() {
        (lIIlIIIIllIIll = new int[91])[0] = ((0xC7 ^ 0xAA ^ (0x77 ^ 0x16)) & (37 + 146 - 126 + 111 ^ 0 + 65 + 71 + 28 ^ -" ".length()));
        ItemStack.lIIlIIIIllIIll[1] = " ".length();
        ItemStack.lIIlIIIIllIIll[2] = "  ".length();
        ItemStack.lIIlIIIIllIIll[3] = "   ".length();
        ItemStack.lIIlIIIIllIIll[4] = (0x94 ^ 0x90);
        ItemStack.lIIlIIIIllIIll[5] = (0xBE ^ 0xBB);
        ItemStack.lIIlIIIIllIIll[6] = (0x52 ^ 0x54);
        ItemStack.lIIlIIIIllIIll[7] = (85 + 89 - 122 + 117 ^ 4 + 37 + 28 + 92);
        ItemStack.lIIlIIIIllIIll[8] = (0x2A ^ 0x2D);
        ItemStack.lIIlIIIIllIIll[9] = (67 + 4 + 2 + 63 ^ 72 + 48 - 22 + 31);
        ItemStack.lIIlIIIIllIIll[10] = (0xB5 ^ 0xBF);
        ItemStack.lIIlIIIIllIIll[11] = (69 + 17 + 69 + 4 ^ 122 + 122 - 215 + 119);
        ItemStack.lIIlIIIIllIIll[12] = (0x2F ^ 0x23);
        ItemStack.lIIlIIIIllIIll[13] = (0 + 66 - 16 + 80 ^ 47 + 46 - 75 + 125);
        ItemStack.lIIlIIIIllIIll[14] = (0xBD ^ 0xB3);
        ItemStack.lIIlIIIIllIIll[15] = (10 + 55 + 33 + 44 ^ 41 + 113 - 35 + 10);
        ItemStack.lIIlIIIIllIIll[16] = (0x43 ^ 0xB ^ (0x51 ^ 0x9));
        ItemStack.lIIlIIIIllIIll[17] = (0x9 ^ 0xD ^ (0x8C ^ 0x99));
        ItemStack.lIIlIIIIllIIll[18] = (0x8 ^ 0x1A);
        ItemStack.lIIlIIIIllIIll[19] = (0x4E ^ 0x7C ^ (0x3 ^ 0x22));
        ItemStack.lIIlIIIIllIIll[20] = (0x2A ^ 0x3E);
        ItemStack.lIIlIIIIllIIll[21] = (0xB0 ^ 0xA5);
        ItemStack.lIIlIIIIllIIll[22] = (0xF5 ^ 0xA0 ^ (0x1A ^ 0x59));
        ItemStack.lIIlIIIIllIIll[23] = (0x4B ^ 0x5C);
        ItemStack.lIIlIIIIllIIll[24] = (0x30 ^ 0x28);
        ItemStack.lIIlIIIIllIIll[25] = (95 + 93 - 90 + 53 ^ 41 + 48 - 39 + 92);
        ItemStack.lIIlIIIIllIIll[26] = ("   ".length() ^ (0x64 ^ 0x7D));
        ItemStack.lIIlIIIIllIIll[27] = (170 + 170 - 253 + 89 ^ 59 + 87 - 42 + 67);
        ItemStack.lIIlIIIIllIIll[28] = (0x42 ^ 0x5E);
        ItemStack.lIIlIIIIllIIll[29] = (0x13 ^ 0xE);
        ItemStack.lIIlIIIIllIIll[30] = (131 + 23 - 83 + 98 ^ 154 + 176 - 282 + 135);
        ItemStack.lIIlIIIIllIIll[31] = (145 + 131 - 145 + 18 ^ 89 + 20 - 55 + 84);
        ItemStack.lIIlIIIIllIIll[32] = (0x6B ^ 0x7B ^ (0x54 ^ 0x64));
        ItemStack.lIIlIIIIllIIll[33] = (0x0 ^ 0x21);
        ItemStack.lIIlIIIIllIIll[34] = (0x29 ^ 0xB);
        ItemStack.lIIlIIIIllIIll[35] = (0x3A ^ 0x16 ^ (0xB6 ^ 0xB9));
        ItemStack.lIIlIIIIllIIll[36] = (0x5B ^ 0x46 ^ (0x64 ^ 0x5D));
        ItemStack.lIIlIIIIllIIll[37] = (0x6B ^ 0x20 ^ (0xAD ^ 0xC3));
        ItemStack.lIIlIIIIllIIll[38] = (0x5C ^ 0x2C ^ (0x43 ^ 0x15));
        ItemStack.lIIlIIIIllIIll[39] = (0xF2 ^ 0x91);
        ItemStack.lIIlIIIIllIIll[40] = (0x3D ^ 0x1A);
        ItemStack.lIIlIIIIllIIll[41] = (39 + 35 + 54 + 14 ^ 4 + 20 + 107 + 35);
        ItemStack.lIIlIIIIllIIll[42] = (0x32 ^ 0x1B);
        ItemStack.lIIlIIIIllIIll[43] = (0x69 ^ 0x17 ^ (0xDB ^ 0x8F));
        ItemStack.lIIlIIIIllIIll[44] = (0xEC ^ 0xC7);
        ItemStack.lIIlIIIIllIIll[45] = (0xD5 ^ 0xAF ^ (0x47 ^ 0x11));
        ItemStack.lIIlIIIIllIIll[46] = (117 + 28 - 104 + 99 ^ 107 + 151 - 148 + 51);
        ItemStack.lIIlIIIIllIIll[47] = (0x4A ^ 0x34 ^ (0x2A ^ 0x7A));
        ItemStack.lIIlIIIIllIIll[48] = (0xA0 ^ 0x8F);
        ItemStack.lIIlIIIIllIIll[49] = (0x73 ^ 0x43);
        ItemStack.lIIlIIIIllIIll[50] = (0x40 ^ 0x71);
        ItemStack.lIIlIIIIllIIll[51] = (0x51 ^ 0x63);
        ItemStack.lIIlIIIIllIIll[52] = (0x2F ^ 0x1C);
        ItemStack.lIIlIIIIllIIll[53] = (0xC3 ^ 0xAE ^ (0xE3 ^ 0xBA));
        ItemStack.lIIlIIIIllIIll[54] = (0x49 ^ 0x73 ^ (0x80 ^ 0x8F));
        ItemStack.lIIlIIIIllIIll[55] = (0x98 ^ 0xAE);
        ItemStack.lIIlIIIIllIIll[56] = (0xB5 ^ 0x82);
        ItemStack.lIIlIIIIllIIll[57] = (0xC ^ 0x34);
        ItemStack.lIIlIIIIllIIll[58] = (0x8F ^ 0xB6);
        ItemStack.lIIlIIIIllIIll[59] = (75 + 103 - 81 + 53 ^ 160 + 34 - 148 + 126);
        ItemStack.lIIlIIIIllIIll[60] = (0x97 ^ 0xAC);
        ItemStack.lIIlIIIIllIIll[61] = (64 + 18 + 51 + 17 ^ 63 + 112 - 73 + 68);
        ItemStack.lIIlIIIIllIIll[62] = (0x6F ^ 0x19 ^ (0x8D ^ 0xC6));
        ItemStack.lIIlIIIIllIIll[63] = (11 + 12 + 83 + 37 ^ 68 + 13 - 67 + 163);
        ItemStack.lIIlIIIIllIIll[64] = (0x61 ^ 0x32 ^ (0xC0 ^ 0xAC));
        ItemStack.lIIlIIIIllIIll[65] = (0xF7 ^ 0xB7);
        ItemStack.lIIlIIIIllIIll[66] = (102 + 139 - 216 + 179 ^ 110 + 38 - 137 + 130);
        ItemStack.lIIlIIIIllIIll[67] = (0x7D ^ 0x3F);
        ItemStack.lIIlIIIIllIIll[68] = (0x46 ^ 0x5);
        ItemStack.lIIlIIIIllIIll[69] = (0x7B ^ 0x3F);
        ItemStack.lIIlIIIIllIIll[70] = (0x7E ^ 0x5D ^ (0x59 ^ 0x3F));
        ItemStack.lIIlIIIIllIIll[71] = (0x16 ^ 0x37 ^ (0x14 ^ 0x73));
        ItemStack.lIIlIIIIllIIll[72] = (50 + 57 + 116 + 22 ^ 69 + 130 - 119 + 98);
        ItemStack.lIIlIIIIllIIll[73] = (0x1 ^ 0x5F ^ (0x69 ^ 0x7F));
        ItemStack.lIIlIIIIllIIll[74] = (0xD1 ^ 0x98);
        ItemStack.lIIlIIIIllIIll[75] = (0x43 ^ 0x76 ^ 85 + 4 + 16 + 22);
        ItemStack.lIIlIIIIllIIll[76] = (0xF6 ^ 0xBD);
        ItemStack.lIIlIIIIllIIll[77] = (0x3C ^ 0x70);
        ItemStack.lIIlIIIIllIIll[78] = (21 + 163 - 6 + 40 ^ 62 + 69 - 81 + 101);
        ItemStack.lIIlIIIIllIIll[79] = (0x73 ^ 0x74 ^ (0xE8 ^ 0xA1));
        ItemStack.lIIlIIIIllIIll[80] = (0xFE ^ 0xB1);
        ItemStack.lIIlIIIIllIIll[81] = (0x7B ^ 0x2B);
        ItemStack.lIIlIIIIllIIll[82] = (0xE0 ^ 0xC7 ^ (0x4F ^ 0x39));
        ItemStack.lIIlIIIIllIIll[83] = (0x61 ^ 0x33);
        ItemStack.lIIlIIIIllIIll[84] = (0xC2 ^ 0x91);
        ItemStack.lIIlIIIIllIIll[85] = (0x26 ^ 0x72);
        ItemStack.lIIlIIIIllIIll[86] = (0x1C ^ 0x18 ^ (0x5C ^ 0xD));
        ItemStack.lIIlIIIIllIIll[87] = (98 + 166 - 206 + 169 ^ 179 + 155 - 265 + 112);
        ItemStack.lIIlIIIIllIIll[88] = (0x8C ^ 0x97 ^ (0x33 ^ 0x7F));
        ItemStack.lIIlIIIIllIIll[89] = (0x9F ^ 0xC7);
        ItemStack.lIIlIIIIllIIll[90] = (0xC1 ^ 0x98);
    }
    
    public ItemStack(final Item lllllllllllllIIlllIllIIIllIlIlII) {
        this(lllllllllllllIIlllIllIIIllIlIlII, ItemStack.lIIlIIIIllIIll[1]);
    }
    
    private static int llIIlIlIIIIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String llIIlIIllIlllII(final String lllllllllllllIIlllIlIllIlIIlIllI, final String lllllllllllllIIlllIlIllIlIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIllIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), ItemStack.lIIlIIIIllIIll[7]), "DES");
            final Cipher lllllllllllllIIlllIlIllIlIIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIlllIlIllIlIIllIlI.init(ItemStack.lIIlIIIIllIIll[2], lllllllllllllIIlllIlIllIlIIllIll);
            return new String(lllllllllllllIIlllIlIllIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIllIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIllIlIIllIIl) {
            lllllllllllllIIlllIlIllIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    public boolean onItemUse(final EntityPlayer lllllllllllllIIlllIllIIIlIIlllIl, final World lllllllllllllIIlllIllIIIlIIlIIll, final BlockPos lllllllllllllIIlllIllIIIlIIllIll, final EnumFacing lllllllllllllIIlllIllIIIlIIlIIIl, final float lllllllllllllIIlllIllIIIlIIllIIl, final float lllllllllllllIIlllIllIIIlIIIllll, final float lllllllllllllIIlllIllIIIlIIIlllI) {
        final boolean lllllllllllllIIlllIllIIIlIIlIllI = this.getItem().onItemUse(this, lllllllllllllIIlllIllIIIlIIlllIl, lllllllllllllIIlllIllIIIlIIlIIll, lllllllllllllIIlllIllIIIlIIllIll, lllllllllllllIIlllIllIIIlIIlIIIl, lllllllllllllIIlllIllIIIlIIllIIl, lllllllllllllIIlllIllIIIlIIIllll, lllllllllllllIIlllIllIIIlIIIlllI);
        if (llIIlIIllllllII(lllllllllllllIIlllIllIIIlIIlIllI ? 1 : 0)) {
            lllllllllllllIIlllIllIIIlIIlllIl.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this.item)]);
        }
        return lllllllllllllIIlllIllIIIlIIlIllI;
    }
    
    public int getMaxStackSize() {
        return this.getItem().getItemStackLimit();
    }
    
    public int getMetadata() {
        return this.itemDamage;
    }
    
    public boolean isOnItemFrame() {
        if (llIIlIIlllllIll(this.itemFrame)) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound lllllllllllllIIlllIllIIIIllIllIl) {
        final ResourceLocation lllllllllllllIIlllIllIIIIllIllll = Item.itemRegistry.getNameForObject(this.item);
        final String lllllllllllllIIIIIlIIIlIIIIIIllI = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[1]];
        String string;
        if (llIIlIIllllllIl(lllllllllllllIIlllIllIIIIllIllll)) {
            string = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[2]];
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        else {
            string = lllllllllllllIIlllIllIIIIllIllll.toString();
        }
        lllllllllllllIIlllIllIIIIllIllIl.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
        lllllllllllllIIlllIllIIIIllIllIl.setByte(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[3]], (byte)this.stackSize);
        lllllllllllllIIlllIllIIIIllIllIl.setShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[4]], (short)this.itemDamage);
        if (llIIlIIlllllIll(this.stackTagCompound)) {
            lllllllllllllIIlllIllIIIIllIllIl.setTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[5]], this.stackTagCompound);
        }
        return lllllllllllllIIlllIllIIIIllIllIl;
    }
    
    public void setRepairCost(final int lllllllllllllIIlllIlIllIllllllIl) {
        if (llIIlIIllllllll(this.hasTagCompound() ? 1 : 0)) {
            this.stackTagCompound = new NBTTagCompound();
        }
        this.stackTagCompound.setInteger(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[80]], lllllllllllllIIlllIlIllIllllllIl);
    }
    
    public IChatComponent getChatComponent() {
        final ChatComponentText lllllllllllllIIlllIlIllIllIlllII = new ChatComponentText(this.getDisplayName());
        if (llIIlIIllllllII(this.hasDisplayName() ? 1 : 0)) {
            lllllllllllllIIlllIlIllIllIlllII.getChatStyle().setItalic((boolean)(ItemStack.lIIlIIIIllIIll[1] != 0));
            "".length();
        }
        final IChatComponent lllllllllllllIIlllIlIllIllIllIll = new ChatComponentText(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[84]]).appendSibling(lllllllllllllIIlllIlIllIllIlllII).appendText(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[85]]);
        if (llIIlIIlllllIll(this.item)) {
            final NBTTagCompound lllllllllllllIIlllIlIllIllIllIlI = new NBTTagCompound();
            this.writeToNBT(lllllllllllllIIlllIlIllIllIllIlI);
            "".length();
            lllllllllllllIIlllIlIllIllIllIll.getChatStyle().setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new ChatComponentText(lllllllllllllIIlllIlIllIllIllIlI.toString())));
            "".length();
            lllllllllllllIIlllIlIllIllIllIll.getChatStyle().setColor(this.getRarity().rarityColor);
            "".length();
        }
        return lllllllllllllIIlllIlIllIllIllIll;
    }
    
    public void onCrafting(final World lllllllllllllIIlllIlIllllIlllIll, final EntityPlayer lllllllllllllIIlllIlIllllIllIllI, final int lllllllllllllIIlllIlIllllIlllIIl) {
        lllllllllllllIIlllIlIllllIllIllI.addStat(StatList.objectCraftStats[Item.getIdFromItem(this.item)], lllllllllllllIIlllIlIllllIlllIIl);
        this.item.onCreated(this, lllllllllllllIIlllIlIllllIlllIll, lllllllllllllIIlllIlIllllIllIllI);
    }
    
    public boolean hasDisplayName() {
        int hasKey;
        if (llIIlIIllllllIl(this.stackTagCompound)) {
            hasKey = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (null != null) {
                return ((0xFC ^ 0xB1 ^ (0x8A ^ 0x93)) & (0x27 ^ 0x30 ^ (0xE3 ^ 0xA0) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIllllllll(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[29]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            hasKey = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0x2C ^ 0x27 ^ (0xDB ^ 0xC0)) & (0x76 ^ 0x41 ^ (0x99 ^ 0xBE) ^ -" ".length())) != 0x0;
            }
        }
        else {
            hasKey = (this.stackTagCompound.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[30]]).hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[31]], ItemStack.lIIlIIIIllIIll[7]) ? 1 : 0);
        }
        return hasKey != 0;
    }
    
    public ItemStack(final Block lllllllllllllIIlllIllIIIlllIlIII, final int lllllllllllllIIlllIllIIIlllIIlII) {
        this(lllllllllllllIIlllIllIIIlllIlIII, lllllllllllllIIlllIllIIIlllIIlII, ItemStack.lIIlIIIIllIIll[0]);
    }
    
    public ItemStack(final Item lllllllllllllIIlllIllIIIlIllllll, final int lllllllllllllIIlllIllIIIlIlllllI, final int lllllllllllllIIlllIllIIIlIllllIl) {
        this.canDestroyCacheBlock = null;
        this.canDestroyCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
        this.canPlaceOnCacheBlock = null;
        this.canPlaceOnCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
        this.item = lllllllllllllIIlllIllIIIlIllllll;
        this.stackSize = lllllllllllllIIlllIllIIIlIlllllI;
        this.itemDamage = lllllllllllllIIlllIllIIIlIllllIl;
        if (llIIlIIlllllIlI(this.itemDamage)) {
            this.itemDamage = ItemStack.lIIlIIIIllIIll[0];
        }
    }
    
    public NBTTagCompound getTagCompound() {
        return this.stackTagCompound;
    }
    
    private static boolean llIIlIIllllllIl(final Object lllllllllllllIIlllIlIllIIllIlIlI) {
        return lllllllllllllIIlllIlIllIIllIlIlI == null;
    }
    
    private static boolean llIIlIIllllllII(final int lllllllllllllIIlllIlIllIIllIlIII) {
        return lllllllllllllIIlllIlIllIIllIlIII != 0;
    }
    
    public ItemStack setStackDisplayName(final String lllllllllllllIIlllIlIlllIlllIIll) {
        if (llIIlIIllllllIl(this.stackTagCompound)) {
            this.stackTagCompound = new NBTTagCompound();
        }
        if (llIIlIIllllllll(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[21]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            this.stackTagCompound.setTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[22]], new NBTTagCompound());
        }
        this.stackTagCompound.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[23]]).setString(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[24]], lllllllllllllIIlllIlIlllIlllIIll);
        return this;
    }
    
    public boolean canDestroy(final Block lllllllllllllIIlllIlIllIllIIlIlI) {
        if (llIIlIlIIIIIlIl(lllllllllllllIIlllIlIllIllIIlIlI, this.canDestroyCacheBlock)) {
            return this.canDestroyCacheResult;
        }
        this.canDestroyCacheBlock = lllllllllllllIIlllIlIllIllIIlIlI;
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[86]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllIlIllIllIIlllI = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[87]], ItemStack.lIIlIIIIllIIll[7]);
            int lllllllllllllIIlllIlIllIllIIllIl = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (-" ".length() > 0) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
            while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIllIllIIllIl, lllllllllllllIIlllIlIllIllIIlllI.tagCount())) {
                final Block lllllllllllllIIlllIlIllIllIIllII = Block.getBlockFromName(lllllllllllllIIlllIlIllIllIIlllI.getStringTagAt(lllllllllllllIIlllIlIllIllIIllIl));
                if (llIIlIlIIIIIlIl(lllllllllllllIIlllIlIllIllIIllII, lllllllllllllIIlllIlIllIllIIlIlI)) {
                    this.canDestroyCacheResult = (ItemStack.lIIlIIIIllIIll[1] != 0);
                    return ItemStack.lIIlIIIIllIIll[1] != 0;
                }
                ++lllllllllllllIIlllIlIllIllIIllIl;
            }
        }
        this.canDestroyCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public EntityItemFrame getItemFrame() {
        return this.itemFrame;
    }
    
    public boolean interactWithEntity(final EntityPlayer lllllllllllllIIlllIlIllllllllllI, final EntityLivingBase lllllllllllllIIlllIllIIIIIIIIIII) {
        return this.item.itemInteractionForEntity(this, lllllllllllllIIlllIlIllllllllllI, lllllllllllllIIlllIllIIIIIIIIIII);
    }
    
    private static boolean llIIlIIlllllllI(final int lllllllllllllIIlllIlIllIIlllIlll, final int lllllllllllllIIlllIlIllIIlllIllI) {
        return lllllllllllllIIlllIlIllIIlllIlll > lllllllllllllIIlllIlIllIIlllIllI;
    }
    
    public boolean hasEffect() {
        return this.getItem().hasEffect(this);
    }
    
    public void addEnchantment(final Enchantment lllllllllllllIIlllIlIlllIIlIIIlI, final int lllllllllllllIIlllIlIlllIIlIIllI) {
        if (llIIlIIllllllIl(this.stackTagCompound)) {
            this.setTagCompound(new NBTTagCompound());
        }
        if (llIIlIIllllllll(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[72]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0)) {
            this.stackTagCompound.setTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[73]], new NBTTagList());
        }
        final NBTTagList lllllllllllllIIlllIlIlllIIlIIlIl = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[74]], ItemStack.lIIlIIIIllIIll[10]);
        final NBTTagCompound lllllllllllllIIlllIlIlllIIlIIlII = new NBTTagCompound();
        lllllllllllllIIlllIlIlllIIlIIlII.setShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[75]], (short)lllllllllllllIIlllIlIlllIIlIIIlI.effectId);
        lllllllllllllIIlllIlIlllIIlIIlII.setShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[76]], (byte)lllllllllllllIIlllIlIlllIIlIIllI);
        lllllllllllllIIlllIlIlllIIlIIlIl.appendTag(lllllllllllllIIlllIlIlllIIlIIlII);
    }
    
    public ItemStack copy() {
        final ItemStack lllllllllllllIIlllIlIllllllllIIl = new ItemStack(this.item, this.stackSize, this.itemDamage);
        if (llIIlIIlllllIll(this.stackTagCompound)) {
            lllllllllllllIIlllIlIllllllllIIl.stackTagCompound = (NBTTagCompound)this.stackTagCompound.copy();
        }
        return lllllllllllllIIlllIlIllllllllIIl;
    }
    
    public NBTTagCompound getSubCompound(final String lllllllllllllIIlllIlIllllIIIllIl, final boolean lllllllllllllIIlllIlIllllIIIllII) {
        if (llIIlIIlllllIll(this.stackTagCompound) && llIIlIIllllllII(this.stackTagCompound.hasKey(lllllllllllllIIlllIlIllllIIIllIl, ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            return this.stackTagCompound.getCompoundTag(lllllllllllllIIlllIlIllllIIIllIl);
        }
        if (llIIlIIllllllII(lllllllllllllIIlllIlIllllIIIllII ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIlllIlIllllIIIllll = new NBTTagCompound();
            this.setTagInfo(lllllllllllllIIlllIlIllllIIIllIl, lllllllllllllIIlllIlIllllIIIllll);
            return lllllllllllllIIlllIlIllllIIIllll;
        }
        return null;
    }
    
    public boolean canEditBlocks() {
        return this.getItem().canItemEditBlocks();
    }
    
    public Multimap<String, AttributeModifier> getAttributeModifiers() {
        Multimap<String, AttributeModifier> lllllllllllllIIlllIlIllIllllIIlI = null;
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[81]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0)) {
            final Multimap<String, AttributeModifier> lllllllllllllIIlllIlIllIllllIIll = (Multimap<String, AttributeModifier>)HashMultimap.create();
            final NBTTagList lllllllllllllIIlllIlIllIllllIIIl = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[82]], ItemStack.lIIlIIIIllIIll[10]);
            int lllllllllllllIIlllIlIllIllllIIII = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
            while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIllIllllIIII, lllllllllllllIIlllIlIllIllllIIIl.tagCount())) {
                final NBTTagCompound lllllllllllllIIlllIlIllIlllIllll = lllllllllllllIIlllIlIllIllllIIIl.getCompoundTagAt(lllllllllllllIIlllIlIllIllllIIII);
                final AttributeModifier lllllllllllllIIlllIlIllIlllIlllI = SharedMonsterAttributes.readAttributeModifierFromNBT(lllllllllllllIIlllIlIllIlllIllll);
                if (llIIlIIlllllIll(lllllllllllllIIlllIlIllIlllIlllI) && llIIlIIllllllII(llIIlIlIIIIlIIl(lllllllllllllIIlllIlIllIlllIlllI.getID().getLeastSignificantBits(), 0L)) && llIIlIIllllllII(llIIlIlIIIIlIIl(lllllllllllllIIlllIlIllIlllIlllI.getID().getMostSignificantBits(), 0L))) {
                    lllllllllllllIIlllIlIllIllllIIll.put((Object)lllllllllllllIIlllIlIllIlllIllll.getString(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[83]]), (Object)lllllllllllllIIlllIlIllIlllIlllI);
                    "".length();
                }
                ++lllllllllllllIIlllIlIllIllllIIII;
            }
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIlllIlIllIllllIIlI = this.getItem().getItemAttributeModifiers();
        }
        return lllllllllllllIIlllIlIllIllllIIlI;
    }
    
    public void setTagInfo(final String lllllllllllllIIlllIlIlllIIIlIlll, final NBTBase lllllllllllllIIlllIlIlllIIIlIIll) {
        if (llIIlIIllllllIl(this.stackTagCompound)) {
            this.setTagCompound(new NBTTagCompound());
        }
        this.stackTagCompound.setTag(lllllllllllllIIlllIlIlllIIIlIlll, lllllllllllllIIlllIlIlllIIIlIIll);
    }
    
    public boolean isItemEnchanted() {
        if (llIIlIIlllllIll(this.stackTagCompound) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[77]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0)) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public void setTagCompound(final NBTTagCompound lllllllllllllIIlllIlIllllIIIIlII) {
        this.stackTagCompound = lllllllllllllIIlllIlIllllIIIIlII;
    }
    
    private static int llIIlIlIIIIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public boolean isItemEqual(final ItemStack lllllllllllllIIlllIlIlllllIllIIl) {
        if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllllIllIIl) && llIIlIlIIIIIlIl(this.item, lllllllllllllIIlllIlIlllllIllIIl.item) && llIIlIlIIIIIllI(this.itemDamage, lllllllllllllIIlllIlIlllllIllIIl.itemDamage)) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public void onPlayerStoppedUsing(final World lllllllllllllIIlllIlIllllIlIIIll, final EntityPlayer lllllllllllllIIlllIlIllllIIllllI, final int lllllllllllllIIlllIlIllllIIlllIl) {
        this.getItem().onPlayerStoppedUsing(this, lllllllllllllIIlllIlIllllIlIIIll, lllllllllllllIIlllIlIllllIIllllI, lllllllllllllIIlllIlIllllIIlllIl);
    }
    
    public String getDisplayName() {
        String lllllllllllllIIlllIlIlllIlllllIl = this.getItem().getItemStackDisplayName(this);
        if (llIIlIIlllllIll(this.stackTagCompound) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[17]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIlllIlIlllIlllllII = this.stackTagCompound.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[18]]);
            if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIlllllII.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[19]], ItemStack.lIIlIIIIllIIll[7]) ? 1 : 0)) {
                lllllllllllllIIlllIlIlllIlllllIl = lllllllllllllIIlllIlIlllIlllllII.getString(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[20]]);
            }
        }
        return lllllllllllllIIlllIlIlllIlllllIl;
    }
    
    public ItemStack(final Block lllllllllllllIIlllIllIIIllIllIlI, final int lllllllllllllIIlllIllIIIllIllIIl, final int lllllllllllllIIlllIllIIIllIllIII) {
        this(Item.getItemFromBlock(lllllllllllllIIlllIllIIIllIllIlI), lllllllllllllIIlllIllIIIllIllIIl, lllllllllllllIIlllIllIIIllIllIII);
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public boolean isItemStackDamageable() {
        int n;
        if (llIIlIIllllllIl(this.item)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ("  ".length() < -" ".length()) {
                return ((0xC1 ^ 0x81) & ~(0x1F ^ 0x5F)) != 0x0;
            }
        }
        else if (llIIlIlIIIIIIII(this.item.getMaxDamage())) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x4F ^ 0x2D) & ~(0xA ^ 0x68)) != 0x0;
            }
        }
        else if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.getTagCompound().getBoolean(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[13]]) ? 1 : 0)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ((19 + 37 + 45 + 29 ^ 66 + 22 + 8 + 38) == 0x0) {
                return ((35 + 89 - 112 + 140 ^ 148 + 140 - 194 + 66) & (0xCA ^ 0xBC ^ (0x21 ^ 0x6F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ItemStack.lIIlIIIIllIIll[1];
        }
        return n != 0;
    }
    
    public float getStrVsBlock(final Block lllllllllllllIIlllIllIIIlIIIlIIl) {
        return this.getItem().getStrVsBlock(this, lllllllllllllIIlllIllIIIlIIIlIIl);
    }
    
    public boolean isItemDamaged() {
        if (llIIlIIllllllII(this.isItemStackDamageable() ? 1 : 0) && llIIlIlIIIIIIIl(this.itemDamage)) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    private boolean isItemStackEqual(final ItemStack lllllllllllllIIlllIlIllllllIIlIl) {
        int n;
        if (llIIlIlIIIIIIll(this.stackSize, lllllllllllllIIlllIlIllllllIIlIl.stackSize)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((0x10 ^ 0x5D ^ (0xC3 ^ 0x9C)) & (0x49 ^ 0x77 ^ (0xA1 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIlIIIIIlII(this.item, lllllllllllllIIlllIlIllllllIIlIl.item)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (" ".length() == (0x5E ^ 0x5A)) {
                return ((0x40 ^ 0x3) & ~(0xED ^ 0xAE)) != 0x0;
            }
        }
        else if (llIIlIlIIIIIIll(this.itemDamage, lllllllllllllIIlllIlIllllllIIlIl.itemDamage)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ((0x23 ^ 0x26) <= 0) {
                return ((0xBC ^ 0xAB) & ~(0x18 ^ 0xF)) != 0x0;
            }
        }
        else if (llIIlIIllllllIl(this.stackTagCompound) && llIIlIIlllllIll(lllllllllllllIIlllIlIllllllIIlIl.stackTagCompound)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (((0x6D ^ 0x20 ^ (0x8C ^ 0x95)) & (0xA8 ^ 0x88 ^ (0x25 ^ 0x51) ^ -" ".length())) > 0) {
                return ((0x56 ^ 0x12 ^ (0x44 ^ 0x3E)) & (0x24 ^ 0x2C ^ (0xF0 ^ 0xC6) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIlllllIll(this.stackTagCompound) && llIIlIIllllllll(this.stackTagCompound.equals(lllllllllllllIIlllIlIllllllIIlIl.stackTagCompound) ? 1 : 0)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (((0xF2 ^ 0xB1) & ~(0x10 ^ 0x53)) != 0x0) {
                return ((0x84 ^ 0xA0) & ~(0xAC ^ 0x88)) != 0x0;
            }
        }
        else {
            n = ItemStack.lIIlIIIIllIIll[1];
        }
        return n != 0;
    }
    
    public boolean isItemEnchantable() {
        int n;
        if (llIIlIIllllllll(this.getItem().isItemTool(this) ? 1 : 0)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if ((41 + 111 - 52 + 35 ^ 114 + 96 - 170 + 91) <= "  ".length()) {
                return ((0x77 ^ 0x1A ^ (0x2E ^ 0x4A)) & (0x29 ^ 0x5 ^ (0x85 ^ 0xA0) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIllllllII(this.isItemEnchanted() ? 1 : 0)) {
            n = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (" ".length() < 0) {
                return ((0x2E ^ 0x37) & ~(0xA8 ^ 0xB1)) != 0x0;
            }
        }
        else {
            n = ItemStack.lIIlIIIIllIIll[1];
        }
        return n != 0;
    }
    
    public boolean getHasSubtypes() {
        return this.item.getHasSubtypes();
    }
    
    public static boolean areItemStacksEqual(final ItemStack lllllllllllllIIlllIlIllllllIllII, final ItemStack lllllllllllllIIlllIlIllllllIlIll) {
        int itemStackEqual;
        if (llIIlIIllllllIl(lllllllllllllIIlllIlIllllllIllII) && llIIlIIllllllIl(lllllllllllllIIlllIlIllllllIlIll)) {
            itemStackEqual = ItemStack.lIIlIIIIllIIll[1];
            "".length();
            if (null != null) {
                return ((0xEC ^ 0xA5 ^ (0xA5 ^ 0x8D)) & (76 + 86 - 30 + 102 ^ 134 + 67 - 164 + 102 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIlllllIll(lllllllllllllIIlllIlIllllllIllII) && llIIlIIlllllIll(lllllllllllllIIlllIlIllllllIlIll)) {
            itemStackEqual = (lllllllllllllIIlllIlIllllllIllII.isItemStackEqual(lllllllllllllIIlllIlIllllllIlIll) ? 1 : 0);
            "".length();
            if (-(0xC6 ^ 0xC2) >= 0) {
                return ((0x82 ^ 0x9E) & ~(0xAD ^ 0xB1)) != 0x0;
            }
        }
        else {
            itemStackEqual = ItemStack.lIIlIIIIllIIll[0];
        }
        return itemStackEqual != 0;
    }
    
    private static boolean llIIlIlIIIIlIll(final int lllllllllllllIIlllIlIllIIllllIll, final int lllllllllllllIIlllIlIllIIllllIlI) {
        return lllllllllllllIIlllIlIllIIllllIll < lllllllllllllIIlllIlIllIIllllIlI;
    }
    
    private static boolean llIIlIlIIIIIIll(final int lllllllllllllIIlllIlIllIIlIlllIl, final int lllllllllllllIIlllIlIllIIlIlllII) {
        return lllllllllllllIIlllIlIllIIlIlllIl != lllllllllllllIIlllIlIllIIlIlllII;
    }
    
    public void setItem(final Item lllllllllllllIIlllIlIllIlllIIIlI) {
        this.item = lllllllllllllIIlllIlIllIlllIIIlI;
    }
    
    public static ItemStack copyItemStack(final ItemStack lllllllllllllIIlllIlIlllllIlIlII) {
        ItemStack copy;
        if (llIIlIIllllllIl(lllllllllllllIIlllIlIlllllIlIlII)) {
            copy = null;
            "".length();
            if (-(0x62 ^ 0x66) > 0) {
                return null;
            }
        }
        else {
            copy = lllllllllllllIIlllIlIlllllIlIlII.copy();
        }
        return copy;
    }
    
    private ItemStack() {
        this.canDestroyCacheBlock = null;
        this.canDestroyCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
        this.canPlaceOnCacheBlock = null;
        this.canPlaceOnCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
    }
    
    public ItemStack useItemRightClick(final World lllllllllllllIIlllIllIIIlIIIIIlI, final EntityPlayer lllllllllllllIIlllIllIIIIllllllI) {
        return this.getItem().onItemRightClick(this, lllllllllllllIIlllIllIIIlIIIIIlI, lllllllllllllIIlllIllIIIIllllllI);
    }
    
    public void setItemFrame(final EntityItemFrame lllllllllllllIIlllIlIlllIIIIIlll) {
        this.itemFrame = lllllllllllllIIlllIlIlllIIIIIlll;
    }
    
    public int getItemDamage() {
        return this.itemDamage;
    }
    
    private static boolean llIIlIlIIIIIIII(final int lllllllllllllIIlllIlIllIIllIIIlI) {
        return lllllllllllllIIlllIlIllIIllIIIlI <= 0;
    }
    
    private static String llIIlIIllIllIll(final String lllllllllllllIIlllIlIllIlIIIlIll, final String lllllllllllllIIlllIlIllIlIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIllIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIllIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlIllIlIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlIllIlIIIllIl.init(ItemStack.lIIlIIIIllIIll[2], lllllllllllllIIlllIlIllIlIIIlllI);
            return new String(lllllllllllllIIlllIlIllIlIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIllIlIIIllII) {
            lllllllllllllIIlllIlIllIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    public boolean getIsItemStackEqual(final ItemStack lllllllllllllIIlllIlIllllIllIIIl) {
        return this.isItemStackEqual(lllllllllllllIIlllIlIllllIllIIIl);
    }
    
    static {
        llIIlIIlllllIIl();
        llIIlIIlllIlIll();
        DECIMALFORMAT = new DecimalFormat(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[0]]);
    }
    
    private static boolean llIIlIIlllllIll(final Object lllllllllllllIIlllIlIllIIlllIIII) {
        return lllllllllllllIIlllIlIllIIlllIIII != null;
    }
    
    private static boolean llIIlIlIIIIIllI(final int lllllllllllllIIlllIlIllIlIIIIIll, final int lllllllllllllIIlllIlIllIlIIIIIlI) {
        return lllllllllllllIIlllIlIllIlIIIIIll == lllllllllllllIIlllIlIllIlIIIIIlI;
    }
    
    public static boolean areItemsEqual(final ItemStack lllllllllllllIIlllIlIllllllIIIlI, final ItemStack lllllllllllllIIlllIlIllllllIIIIl) {
        int itemEqual;
        if (llIIlIIllllllIl(lllllllllllllIIlllIlIllllllIIIlI) && llIIlIIllllllIl(lllllllllllllIIlllIlIllllllIIIIl)) {
            itemEqual = ItemStack.lIIlIIIIllIIll[1];
            "".length();
            if (null != null) {
                return ((46 + 4 + 114 + 65 ^ 71 + 12 - 60 + 160) & (0x6A ^ 0x4C ^ (0x40 ^ 0x34) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIlllllIll(lllllllllllllIIlllIlIllllllIIIlI) && llIIlIIlllllIll(lllllllllllllIIlllIlIllllllIIIIl)) {
            itemEqual = (lllllllllllllIIlllIlIllllllIIIlI.isItemEqual(lllllllllllllIIlllIlIllllllIIIIl) ? 1 : 0);
            "".length();
            if ((0x2B ^ 0x2F) < 0) {
                return ((0xC8 ^ 0x9E) & ~(0xDE ^ 0x88)) != 0x0;
            }
        }
        else {
            itemEqual = ItemStack.lIIlIIIIllIIll[0];
        }
        return itemEqual != 0;
    }
    
    public ItemStack splitStack(final int lllllllllllllIIlllIllIIIlIlIllll) {
        final ItemStack lllllllllllllIIlllIllIIIlIlIlllI = new ItemStack(this.item, lllllllllllllIIlllIllIIIlIlIllll, this.itemDamage);
        if (llIIlIIlllllIll(this.stackTagCompound)) {
            lllllllllllllIIlllIllIIIlIlIlllI.stackTagCompound = (NBTTagCompound)this.stackTagCompound.copy();
        }
        this.stackSize -= lllllllllllllIIlllIllIIIlIlIllll;
        return lllllllllllllIIlllIllIIIlIlIlllI;
    }
    
    public boolean canHarvestBlock(final Block lllllllllllllIIlllIllIIIIIIIlIII) {
        return this.item.canHarvestBlock(lllllllllllllIIlllIllIIIIIIIlIII);
    }
    
    public void hitEntity(final EntityLivingBase lllllllllllllIIlllIllIIIIIlIIIII, final EntityPlayer lllllllllllllIIlllIllIIIIIIlllll) {
        final boolean lllllllllllllIIlllIllIIIIIlIIIlI = this.item.hitEntity(this, lllllllllllllIIlllIllIIIIIlIIIII, lllllllllllllIIlllIllIIIIIIlllll);
        if (llIIlIIllllllII(lllllllllllllIIlllIllIIIIIlIIIlI ? 1 : 0)) {
            lllllllllllllIIlllIllIIIIIIlllll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this.item)]);
        }
    }
    
    public void onBlockDestroyed(final World lllllllllllllIIlllIllIIIIIIlIllI, final Block lllllllllllllIIlllIllIIIIIIIllll, final BlockPos lllllllllllllIIlllIllIIIIIIlIlII, final EntityPlayer lllllllllllllIIlllIllIIIIIIlIIll) {
        final boolean lllllllllllllIIlllIllIIIIIIlIIlI = this.item.onBlockDestroyed(this, lllllllllllllIIlllIllIIIIIIlIllI, lllllllllllllIIlllIllIIIIIIIllll, lllllllllllllIIlllIllIIIIIIlIlII, lllllllllllllIIlllIllIIIIIIlIIll);
        if (llIIlIIllllllII(lllllllllllllIIlllIllIIIIIIlIIlI ? 1 : 0)) {
            lllllllllllllIIlllIllIIIIIIlIIll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this.item)]);
        }
    }
    
    public void clearCustomName() {
        if (llIIlIIlllllIll(this.stackTagCompound) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[25]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIlllIlIlllIllIllll = this.stackTagCompound.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[26]]);
            lllllllllllllIIlllIlIlllIllIllll.removeTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[27]]);
            if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIllIllll.hasNoTags() ? 1 : 0)) {
                this.stackTagCompound.removeTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[28]]);
                if (llIIlIIllllllII(this.stackTagCompound.hasNoTags() ? 1 : 0)) {
                    this.setTagCompound(null);
                }
            }
        }
    }
    
    private static boolean llIIlIlIIIIIlII(final Object lllllllllllllIIlllIlIllIIlllIIll, final Object lllllllllllllIIlllIlIllIIlllIIlI) {
        return lllllllllllllIIlllIlIllIIlllIIll != lllllllllllllIIlllIlIllIIlllIIlI;
    }
    
    private static boolean llIIlIlIIIIIlIl(final Object lllllllllllllIIlllIlIllIIllIllIl, final Object lllllllllllllIIlllIlIllIIllIllII) {
        return lllllllllllllIIlllIlIllIIllIllIl == lllllllllllllIIlllIlIllIIllIllII;
    }
    
    public boolean attemptDamageItem(int lllllllllllllIIlllIllIIIIIlllIlI, final Random lllllllllllllIIlllIllIIIIIlllIIl) {
        if (llIIlIIllllllll(this.isItemStackDamageable() ? 1 : 0)) {
            return ItemStack.lIIlIIIIllIIll[0] != 0;
        }
        if (llIIlIlIIIIIIIl(lllllllllllllIIlllIllIIIIIlllIlI)) {
            final int lllllllllllllIIlllIllIIIIIlllllI = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, this);
            int lllllllllllllIIlllIllIIIIIllllIl = ItemStack.lIIlIIIIllIIll[0];
            int lllllllllllllIIlllIllIIIIIllllII = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (((0xC2 ^ 0x82) & ~(0x77 ^ 0x37)) > (0x94 ^ 0x90)) {
                return ((0x85 ^ 0xA8) & ~(0x39 ^ 0x14)) != 0x0;
            }
            while (llIIlIlIIIIIIIl(lllllllllllllIIlllIllIIIIIlllllI) && !llIIlIlIIIIIIlI(lllllllllllllIIlllIllIIIIIllllII, lllllllllllllIIlllIllIIIIIlllIlI)) {
                if (llIIlIIllllllII(EnchantmentDurability.negateDamage(this, lllllllllllllIIlllIllIIIIIlllllI, lllllllllllllIIlllIllIIIIIlllIIl) ? 1 : 0)) {
                    ++lllllllllllllIIlllIllIIIIIllllIl;
                }
                ++lllllllllllllIIlllIllIIIIIllllII;
            }
            lllllllllllllIIlllIllIIIIIlllIlI -= lllllllllllllIIlllIllIIIIIllllIl;
            if (llIIlIlIIIIIIII(lllllllllllllIIlllIllIIIIIlllIlI)) {
                return ItemStack.lIIlIIIIllIIll[0] != 0;
            }
        }
        this.itemDamage += lllllllllllllIIlllIllIIIIIlllIlI;
        if (llIIlIIlllllllI(this.itemDamage, this.getMaxDamage())) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public ItemStack onItemUseFinish(final World lllllllllllllIIlllIllIIIIlllIllI, final EntityPlayer lllllllllllllIIlllIllIIIIllllIII) {
        return this.getItem().onItemUseFinish(this, lllllllllllllIIlllIllIIIIlllIllI, lllllllllllllIIlllIllIIIIllllIII);
    }
    
    public ItemStack(final Item lllllllllllllIIlllIllIIIllIIllIl, final int lllllllllllllIIlllIllIIIllIIlIIl) {
        this(lllllllllllllIIlllIllIIIllIIllIl, lllllllllllllIIlllIllIIIllIIlIIl, ItemStack.lIIlIIIIllIIll[0]);
    }
    
    public EnumAction getItemUseAction() {
        return this.getItem().getItemUseAction(this);
    }
    
    private static int llIIlIlIIIIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIIlIlIIIIIIlI(final int lllllllllllllIIlllIlIllIIlllllll, final int lllllllllllllIIlllIlIllIIllllllI) {
        return lllllllllllllIIlllIlIllIIlllllll >= lllllllllllllIIlllIlIllIIllllllI;
    }
    
    public int getRepairCost() {
        int integer;
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[78]], ItemStack.lIIlIIIIllIIll[3]) ? 1 : 0)) {
            integer = this.stackTagCompound.getInteger(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[79]]);
            "".length();
            if ("  ".length() == ((0xF ^ 0x41) & ~(0x71 ^ 0x3F))) {
                return (0x29 ^ 0x2C) & ~(0x27 ^ 0x22);
            }
        }
        else {
            integer = ItemStack.lIIlIIIIllIIll[0];
        }
        return integer;
    }
    
    public boolean canPlaceOn(final Block lllllllllllllIIlllIlIllIlIlllIll) {
        if (llIIlIlIIIIIlIl(lllllllllllllIIlllIlIllIlIlllIll, this.canPlaceOnCacheBlock)) {
            return this.canPlaceOnCacheResult;
        }
        this.canPlaceOnCacheBlock = lllllllllllllIIlllIlIllIlIlllIll;
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[88]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllIlIllIlIllllll = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[89]], ItemStack.lIIlIIIIllIIll[7]);
            int lllllllllllllIIlllIlIllIlIlllllI = ItemStack.lIIlIIIIllIIll[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((0xE8 ^ 0x9B ^ (0x15 ^ 0x71)) & (37 + 85 - 120 + 135 ^ 119 + 111 - 197 + 125 ^ -" ".length())) != 0x0;
            }
            while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIllIlIlllllI, lllllllllllllIIlllIlIllIlIllllll.tagCount())) {
                final Block lllllllllllllIIlllIlIllIlIllllIl = Block.getBlockFromName(lllllllllllllIIlllIlIllIlIllllll.getStringTagAt(lllllllllllllIIlllIlIllIlIlllllI));
                if (llIIlIlIIIIIlIl(lllllllllllllIIlllIlIllIlIllllIl, lllllllllllllIIlllIlIllIlIlllIll)) {
                    this.canPlaceOnCacheResult = (ItemStack.lIIlIIIIllIIll[1] != 0);
                    return ItemStack.lIIlIIIIllIIll[1] != 0;
                }
                ++lllllllllllllIIlllIlIllIlIlllllI;
            }
        }
        this.canPlaceOnCacheResult = (ItemStack.lIIlIIIIllIIll[0] != 0);
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public ItemStack(final Block lllllllllllllIIlllIllIIIlllIllIl) {
        this(lllllllllllllIIlllIllIIIlllIllIl, ItemStack.lIIlIIIIllIIll[1]);
    }
    
    public static boolean areItemStackTagsEqual(final ItemStack lllllllllllllIIlllIlIlllllllIlII, final ItemStack lllllllllllllIIlllIlIlllllllIIll) {
        int n;
        if (llIIlIIllllllIl(lllllllllllllIIlllIlIlllllllIlII) && llIIlIIllllllIl(lllllllllllllIIlllIlIlllllllIIll)) {
            n = ItemStack.lIIlIIIIllIIll[1];
            "".length();
            if (-(0x36 ^ 0x66 ^ (0x76 ^ 0x23)) >= 0) {
                return (("   ".length() ^ (0x7E ^ 0x5F)) & (0x35 ^ 0x63 ^ (0x25 ^ 0x51) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllllllIlII) && llIIlIIlllllIll(lllllllllllllIIlllIlIlllllllIIll)) {
            if (llIIlIIllllllIl(lllllllllllllIIlllIlIlllllllIlII.stackTagCompound) && llIIlIIlllllIll(lllllllllllllIIlllIlIlllllllIIll.stackTagCompound)) {
                n = ItemStack.lIIlIIIIllIIll[0];
                "".length();
                if (null != null) {
                    return ((0xDE ^ 0x8A) & ~(0x50 ^ 0x4)) != 0x0;
                }
            }
            else if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllllllIlII.stackTagCompound) && llIIlIIllllllll(lllllllllllllIIlllIlIlllllllIlII.stackTagCompound.equals(lllllllllllllIIlllIlIlllllllIIll.stackTagCompound) ? 1 : 0)) {
                n = ItemStack.lIIlIIIIllIIll[0];
                "".length();
                if (-" ".length() >= (0x6A ^ 0xC ^ (0x39 ^ 0x5B))) {
                    return ((74 + 54 - 85 + 98 ^ 93 + 44 - 46 + 45) & (0x78 ^ 0x40 ^ (0x4F ^ 0x72) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = ItemStack.lIIlIIIIllIIll[1];
                "".length();
                if ("   ".length() <= 0) {
                    return ((51 + 89 - 25 + 20 ^ 82 + 10 + 40 + 55) & (109 + 23 - 37 + 54 ^ 57 + 164 - 161 + 109 ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n = ItemStack.lIIlIIIIllIIll[0];
        }
        return n != 0;
    }
    
    private static boolean llIIlIIlllllIlI(final int lllllllllllllIIlllIlIllIIllIIlII) {
        return lllllllllllllIIlllIlIllIIllIIlII < 0;
    }
    
    public List<String> getTooltip(final EntityPlayer lllllllllllllIIlllIlIlllIlIIIIIl, final boolean lllllllllllllIIlllIlIlllIlIIIIII) {
        final List<String> lllllllllllllIIlllIlIlllIlIllIlI = (List<String>)Lists.newArrayList();
        String lllllllllllllIIlllIlIlllIlIllIIl = this.getDisplayName();
        if (llIIlIIllllllII(this.hasDisplayName() ? 1 : 0)) {
            lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(new StringBuilder().append(EnumChatFormatting.ITALIC).append(lllllllllllllIIlllIlIlllIlIllIIl));
        }
        lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlllIlIlllIlIllIIl)).append(EnumChatFormatting.RESET));
        if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIlIIIIII ? 1 : 0)) {
            String lllllllllllllIIlllIlIlllIlIllIII = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[32]];
            if (llIIlIlIIIIIIIl(lllllllllllllIIlllIlIlllIlIllIIl.length())) {
                lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlllIlIlllIlIllIIl)).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[33]]));
                lllllllllllllIIlllIlIlllIlIllIII = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[34]];
            }
            final int lllllllllllllIIlllIlIlllIlIlIlll = Item.getIdFromItem(this.item);
            if (llIIlIIllllllII(this.getHasSubtypes() ? 1 : 0)) {
                final StringBuilder sb = new StringBuilder(String.valueOf(lllllllllllllIIlllIlIlllIlIllIIl));
                final String format = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[35]];
                final Object[] args = new Object[ItemStack.lIIlIIIIllIIll[3]];
                args[ItemStack.lIIlIIIIllIIll[0]] = lllllllllllllIIlllIlIlllIlIlIlll;
                args[ItemStack.lIIlIIIIllIIll[1]] = this.itemDamage;
                args[ItemStack.lIIlIIIIllIIll[2]] = lllllllllllllIIlllIlIlllIlIllIII;
                lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(sb.append(String.format(format, args)));
                "".length();
                if ((0xF8 ^ 0xB1 ^ (0x42 ^ 0xF)) <= "   ".length()) {
                    return null;
                }
            }
            else {
                final StringBuilder sb2 = new StringBuilder(String.valueOf(lllllllllllllIIlllIlIlllIlIllIIl));
                final String format2 = ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[36]];
                final Object[] args2 = new Object[ItemStack.lIIlIIIIllIIll[2]];
                args2[ItemStack.lIIlIIIIllIIll[0]] = lllllllllllllIIlllIlIlllIlIlIlll;
                args2[ItemStack.lIIlIIIIllIIll[1]] = lllllllllllllIIlllIlIlllIlIllIII;
                lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(sb2.append(String.format(format2, args2)));
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else if (llIIlIIllllllll(this.hasDisplayName() ? 1 : 0) && llIIlIlIIIIIlIl(this.item, Items.filled_map)) {
            lllllllllllllIIlllIlIlllIlIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlllIlIlllIlIllIIl)).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[37]]).append(this.itemDamage));
        }
        lllllllllllllIIlllIlIlllIlIllIlI.add(lllllllllllllIIlllIlIlllIlIllIIl);
        "".length();
        int lllllllllllllIIlllIlIlllIlIlIllI = ItemStack.lIIlIIIIllIIll[0];
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[38]], ItemStack.lIIlIIIIllIIll[39]) ? 1 : 0)) {
            lllllllllllllIIlllIlIlllIlIlIllI = this.stackTagCompound.getInteger(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[40]]);
        }
        if (llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[32])) {
            this.item.addInformation(this, lllllllllllllIIlllIlIlllIlIIIIIl, lllllllllllllIIlllIlIlllIlIllIlI, lllllllllllllIIlllIlIlllIlIIIIII);
        }
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0)) {
            if (llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[1])) {
                final NBTTagList lllllllllllllIIlllIlIlllIlIlIlIl = this.getEnchantmentTagList();
                if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllIlIlIlIl)) {
                    int lllllllllllllIIlllIlIlllIlIlIlII = ItemStack.lIIlIIIIllIIll[0];
                    "".length();
                    if (((54 + 194 - 100 + 62 ^ 151 + 128 - 172 + 45) & (0xA4 ^ 0x84 ^ (0x74 ^ 0x1E) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIlllIlIlIlII, lllllllllllllIIlllIlIlllIlIlIlIl.tagCount())) {
                        final int lllllllllllllIIlllIlIlllIlIlIIll = lllllllllllllIIlllIlIlllIlIlIlIl.getCompoundTagAt(lllllllllllllIIlllIlIlllIlIlIlII).getShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[41]]);
                        final int lllllllllllllIIlllIlIlllIlIlIIlI = lllllllllllllIIlllIlIlllIlIlIlIl.getCompoundTagAt(lllllllllllllIIlllIlIlllIlIlIlII).getShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[42]]);
                        if (llIIlIIlllllIll(Enchantment.getEnchantmentById(lllllllllllllIIlllIlIlllIlIlIIll))) {
                            lllllllllllllIIlllIlIlllIlIllIlI.add(Enchantment.getEnchantmentById(lllllllllllllIIlllIlIlllIlIlIIll).getTranslatedName(lllllllllllllIIlllIlIlllIlIlIIlI));
                            "".length();
                        }
                        ++lllllllllllllIIlllIlIlllIlIlIlII;
                    }
                }
            }
            if (llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[43]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
                final NBTTagCompound lllllllllllllIIlllIlIlllIlIlIIIl = this.stackTagCompound.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[44]]);
                if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIlIlIIIl.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[45]], ItemStack.lIIlIIIIllIIll[3]) ? 1 : 0)) {
                    if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIlIIIIII ? 1 : 0)) {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[46]]).append(Integer.toHexString(lllllllllllllIIlllIlIlllIlIlIIIl.getInteger(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[47]])).toUpperCase())));
                        "".length();
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.ITALIC).append(StatCollector.translateToLocal(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[48]]))));
                        "".length();
                    }
                }
                if (llIIlIlIIIIIllI(lllllllllllllIIlllIlIlllIlIlIIIl.getTagId(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[49]]), ItemStack.lIIlIIIIllIIll[9])) {
                    final NBTTagList lllllllllllllIIlllIlIlllIlIlIIII = lllllllllllllIIlllIlIlllIlIlIIIl.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[50]], ItemStack.lIIlIIIIllIIll[7]);
                    if (llIIlIlIIIIIIIl(lllllllllllllIIlllIlIlllIlIlIIII.tagCount())) {
                        int lllllllllllllIIlllIlIlllIlIIllll = ItemStack.lIIlIIIIllIIll[0];
                        "".length();
                        if (-" ".length() >= "   ".length()) {
                            return null;
                        }
                        while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIlllIlIIllll, lllllllllllllIIlllIlIlllIlIlIIII.tagCount())) {
                            lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_PURPLE).append(EnumChatFormatting.ITALIC).append(lllllllllllllIIlllIlIlllIlIlIIII.getStringTagAt(lllllllllllllIIlllIlIlllIlIIllll))));
                            "".length();
                            ++lllllllllllllIIlllIlIlllIlIIllll;
                        }
                    }
                }
            }
        }
        final Multimap<String, AttributeModifier> lllllllllllllIIlllIlIlllIlIIlllI = this.getAttributeModifiers();
        if (llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIIlllI.isEmpty() ? 1 : 0) && llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[2])) {
            lllllllllllllIIlllIlIlllIlIllIlI.add(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[51]]);
            "".length();
            final Iterator iterator = lllllllllllllIIlllIlIlllIlIIlllI.entries().iterator();
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
            while (!llIIlIIllllllll(iterator.hasNext() ? 1 : 0)) {
                final Map.Entry<String, AttributeModifier> lllllllllllllIIlllIlIlllIlIIllIl = iterator.next();
                final AttributeModifier lllllllllllllIIlllIlIlllIlIIllII = lllllllllllllIIlllIlIlllIlIIllIl.getValue();
                double lllllllllllllIIlllIlIlllIlIIlIll = lllllllllllllIIlllIlIlllIlIIllII.getAmount();
                if (llIIlIlIIIIIlIl(lllllllllllllIIlllIlIlllIlIIllII.getID(), Item.itemModifierUUID)) {
                    lllllllllllllIIlllIlIlllIlIIlIll += EnchantmentHelper.func_152377_a(this, EnumCreatureAttribute.UNDEFINED);
                }
                double lllllllllllllIIlllIlIlllIlIIlIIl;
                if (llIIlIlIIIIIIll(lllllllllllllIIlllIlIlllIlIIllII.getOperation(), ItemStack.lIIlIIIIllIIll[1]) && llIIlIlIIIIIIll(lllllllllllllIIlllIlIlllIlIIllII.getOperation(), ItemStack.lIIlIIIIllIIll[2])) {
                    final double lllllllllllllIIlllIlIlllIlIIlIlI = lllllllllllllIIlllIlIlllIlIIlIll;
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlllIlIIlIIl = lllllllllllllIIlllIlIlllIlIIlIll * 100.0;
                }
                if (llIIlIlIIIIIIIl(llIIlIlIIIIIlll(lllllllllllllIIlllIlIlllIlIIlIll, 0.0))) {
                    final List<String> list = lllllllllllllIIlllIlIlllIlIllIlI;
                    final StringBuilder append = new StringBuilder().append(EnumChatFormatting.BLUE);
                    final String value = String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[52]]).append(lllllllllllllIIlllIlIlllIlIIllII.getOperation()));
                    final Object[] lllllllllllllIIIllIlllIIlIlIlllI = new Object[ItemStack.lIIlIIIIllIIll[2]];
                    lllllllllllllIIIllIlllIIlIlIlllI[ItemStack.lIIlIIIIllIIll[0]] = ItemStack.DECIMALFORMAT.format(lllllllllllllIIlllIlIlllIlIIlIIl);
                    lllllllllllllIIIllIlllIIlIlIlllI[ItemStack.lIIlIIIIllIIll[1]] = StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[53]]).append(lllllllllllllIIlllIlIlllIlIIllIl.getKey())));
                    list.add(String.valueOf(append.append(StatCollector.translateToLocalFormatted(value, lllllllllllllIIIllIlllIIlIlIlllI))));
                    "".length();
                    "".length();
                    if (-(0x9 ^ 0xD) >= 0) {
                        return null;
                    }
                    continue;
                }
                else {
                    if (!llIIlIIlllllIlI(llIIlIlIIIIlIII(lllllllllllllIIlllIlIlllIlIIlIll, 0.0))) {
                        continue;
                    }
                    lllllllllllllIIlllIlIlllIlIIlIIl *= -1.0;
                    final List<String> list2 = lllllllllllllIIlllIlIlllIlIllIlI;
                    final StringBuilder append2 = new StringBuilder().append(EnumChatFormatting.RED);
                    final String value2 = String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[54]]).append(lllllllllllllIIlllIlIlllIlIIllII.getOperation()));
                    final Object[] lllllllllllllIIIllIlllIIlIlIlllI2 = new Object[ItemStack.lIIlIIIIllIIll[2]];
                    lllllllllllllIIIllIlllIIlIlIlllI2[ItemStack.lIIlIIIIllIIll[0]] = ItemStack.DECIMALFORMAT.format(lllllllllllllIIlllIlIlllIlIIlIIl);
                    lllllllllllllIIIllIlllIIlIlIlllI2[ItemStack.lIIlIIIIllIIll[1]] = StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[55]]).append(lllllllllllllIIlllIlIlllIlIIllIl.getKey())));
                    list2.add(String.valueOf(append2.append(StatCollector.translateToLocalFormatted(value2, lllllllllllllIIIllIlllIIlIlIlllI2))));
                    "".length();
                }
            }
        }
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.getTagCompound().getBoolean(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[56]]) ? 1 : 0) && llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[4])) {
            lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.BLUE).append(StatCollector.translateToLocal(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[57]]))));
            "".length();
        }
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[58]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0) && llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[7])) {
            final NBTTagList lllllllllllllIIlllIlIlllIlIIlIII = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[59]], ItemStack.lIIlIIIIllIIll[7]);
            if (llIIlIlIIIIIIIl(lllllllllllllIIlllIlIlllIlIIlIII.tagCount())) {
                lllllllllllllIIlllIlIlllIlIllIlI.add(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[60]]);
                "".length();
                lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(StatCollector.translateToLocal(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[61]]))));
                "".length();
                int lllllllllllllIIlllIlIlllIlIIIlll = ItemStack.lIIlIIIIllIIll[0];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
                while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIlllIlIIIlll, lllllllllllllIIlllIlIlllIlIIlIII.tagCount())) {
                    final Block lllllllllllllIIlllIlIlllIlIIIllI = Block.getBlockFromName(lllllllllllllIIlllIlIlllIlIIlIII.getStringTagAt(lllllllllllllIIlllIlIlllIlIIIlll));
                    if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllIlIIIllI)) {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(lllllllllllllIIlllIlIlllIlIIIllI.getLocalizedName())));
                        "".length();
                        "".length();
                        if ((0x31 ^ 0x2E ^ (0x69 ^ 0x73)) == 0x0) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[62]])));
                        "".length();
                    }
                    ++lllllllllllllIIlllIlIlllIlIIIlll;
                }
            }
        }
        if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0) && llIIlIIllllllII(this.stackTagCompound.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[63]], ItemStack.lIIlIIIIllIIll[9]) ? 1 : 0) && llIIlIIllllllll(lllllllllllllIIlllIlIlllIlIlIllI & ItemStack.lIIlIIIIllIIll[16])) {
            final NBTTagList lllllllllllllIIlllIlIlllIlIIIlIl = this.stackTagCompound.getTagList(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[64]], ItemStack.lIIlIIIIllIIll[7]);
            if (llIIlIlIIIIIIIl(lllllllllllllIIlllIlIlllIlIIIlIl.tagCount())) {
                lllllllllllllIIlllIlIlllIlIllIlI.add(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[65]]);
                "".length();
                lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(StatCollector.translateToLocal(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[66]]))));
                "".length();
                int lllllllllllllIIlllIlIlllIlIIIlII = ItemStack.lIIlIIIIllIIll[0];
                "".length();
                if ((0x3C ^ 0x38) == "  ".length()) {
                    return null;
                }
                while (!llIIlIlIIIIIIlI(lllllllllllllIIlllIlIlllIlIIIlII, lllllllllllllIIlllIlIlllIlIIIlIl.tagCount())) {
                    final Block lllllllllllllIIlllIlIlllIlIIIIll = Block.getBlockFromName(lllllllllllllIIlllIlIlllIlIIIlIl.getStringTagAt(lllllllllllllIIlllIlIlllIlIIIlII));
                    if (llIIlIIlllllIll(lllllllllllllIIlllIlIlllIlIIIIll)) {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(lllllllllllllIIlllIlIlllIlIIIIll.getLocalizedName())));
                        "".length();
                        "".length();
                        if (-" ".length() == (0x50 ^ 0x44 ^ (0x33 ^ 0x23))) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[67]])));
                        "".length();
                    }
                    ++lllllllllllllIIlllIlIlllIlIIIlII;
                }
            }
        }
        if (llIIlIIllllllII(lllllllllllllIIlllIlIlllIlIIIIII ? 1 : 0)) {
            if (llIIlIIllllllII(this.isItemDamaged() ? 1 : 0)) {
                lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[68]]).append(this.getMaxDamage() - this.getItemDamage()).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[69]]).append(this.getMaxDamage())));
                "".length();
            }
            lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(Item.itemRegistry.getNameForObject(this.item).toString())));
            "".length();
            if (llIIlIIllllllII(this.hasTagCompound() ? 1 : 0)) {
                lllllllllllllIIlllIlIlllIlIllIlI.add(String.valueOf(new StringBuilder().append(EnumChatFormatting.DARK_GRAY).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[70]]).append(this.getTagCompound().getKeySet().size()).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[71]])));
                "".length();
            }
        }
        return lllllllllllllIIlllIlIlllIlIllIlI;
    }
    
    public void damageItem(final int lllllllllllllIIlllIllIIIIIllIIII, final EntityLivingBase lllllllllllllIIlllIllIIIIIlIllll) {
        if ((!llIIlIIllllllII((lllllllllllllIIlllIllIIIIIlIllll instanceof EntityPlayer) ? 1 : 0) || llIIlIIllllllll(((EntityPlayer)lllllllllllllIIlllIllIIIIIlIllll).capabilities.isCreativeMode ? 1 : 0)) && llIIlIIllllllII(this.isItemStackDamageable() ? 1 : 0) && llIIlIIllllllII(this.attemptDamageItem(lllllllllllllIIlllIllIIIIIllIIII, lllllllllllllIIlllIllIIIIIlIllll.getRNG()) ? 1 : 0)) {
            lllllllllllllIIlllIllIIIIIlIllll.renderBrokenItemStack(this);
            this.stackSize -= ItemStack.lIIlIIIIllIIll[1];
            if (llIIlIIllllllII((lllllllllllllIIlllIllIIIIIlIllll instanceof EntityPlayer) ? 1 : 0)) {
                final EntityPlayer lllllllllllllIIlllIllIIIIIlIlllI = (EntityPlayer)lllllllllllllIIlllIllIIIIIlIllll;
                lllllllllllllIIlllIllIIIIIlIlllI.triggerAchievement(StatList.objectBreakStats[Item.getIdFromItem(this.item)]);
                if (llIIlIIllllllll(this.stackSize) && llIIlIIllllllII((this.getItem() instanceof ItemBow) ? 1 : 0)) {
                    lllllllllllllIIlllIllIIIIIlIlllI.destroyCurrentEquippedItem();
                }
            }
            if (llIIlIIlllllIlI(this.stackSize)) {
                this.stackSize = ItemStack.lIIlIIIIllIIll[0];
            }
            this.itemDamage = ItemStack.lIIlIIIIllIIll[0];
        }
    }
    
    public static ItemStack loadItemStackFromNBT(final NBTTagCompound lllllllllllllIIlllIllIIIlIlllIII) {
        final ItemStack lllllllllllllIIlllIllIIIlIlllIIl = new ItemStack();
        lllllllllllllIIlllIllIIIlIlllIIl.readFromNBT(lllllllllllllIIlllIllIIIlIlllIII);
        ItemStack itemStack;
        if (llIIlIIlllllIll(lllllllllllllIIlllIllIIIlIlllIIl.getItem())) {
            itemStack = lllllllllllllIIlllIllIIIlIlllIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            itemStack = null;
        }
        return itemStack;
    }
    
    public String getUnlocalizedName() {
        return this.item.getUnlocalizedName(this);
    }
    
    public EnumRarity getRarity() {
        return this.getItem().getRarity(this);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(this.stackSize)).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[14]]).append(this.item.getUnlocalizedName()).append(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[15]]).append(this.itemDamage));
    }
    
    private static boolean llIIlIIllllllll(final int lllllllllllllIIlllIlIllIIllIIllI) {
        return lllllllllllllIIlllIlIllIIllIIllI == 0;
    }
    
    public void updateAnimation(final World lllllllllllllIIlllIlIlllllIIlIIl, final Entity lllllllllllllIIlllIlIlllllIIlIII, final int lllllllllllllIIlllIlIlllllIIIlll, final boolean lllllllllllllIIlllIlIlllllIIIllI) {
        if (llIIlIlIIIIIIIl(this.animationsToGo)) {
            this.animationsToGo -= ItemStack.lIIlIIIIllIIll[1];
        }
        this.item.onUpdate(this, lllllllllllllIIlllIlIlllllIIlIIl, lllllllllllllIIlllIlIlllllIIlIII, lllllllllllllIIlllIlIlllllIIIlll, lllllllllllllIIlllIlIlllllIIIllI);
    }
    
    private static String llIIlIIllIllIlI(String lllllllllllllIIlllIlIllIlIlIlIII, final String lllllllllllllIIlllIlIllIlIlIllII) {
        lllllllllllllIIlllIlIllIlIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlIllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlIllIlIlIlIll = new StringBuilder();
        final char[] lllllllllllllIIlllIlIllIlIlIlIlI = lllllllllllllIIlllIlIllIlIlIllII.toCharArray();
        int lllllllllllllIIlllIlIllIlIlIlIIl = ItemStack.lIIlIIIIllIIll[0];
        final String lllllllllllllIIlllIlIllIlIlIIIll = (Object)lllllllllllllIIlllIlIllIlIlIlIII.toCharArray();
        final double lllllllllllllIIlllIlIllIlIlIIIlI = lllllllllllllIIlllIlIllIlIlIIIll.length;
        Exception lllllllllllllIIlllIlIllIlIlIIIIl = (Exception)ItemStack.lIIlIIIIllIIll[0];
        while (llIIlIlIIIIlIll((int)lllllllllllllIIlllIlIllIlIlIIIIl, (int)lllllllllllllIIlllIlIllIlIlIIIlI)) {
            final char lllllllllllllIIlllIlIllIlIlIlllI = lllllllllllllIIlllIlIllIlIlIIIll[lllllllllllllIIlllIlIllIlIlIIIIl];
            lllllllllllllIIlllIlIllIlIlIlIll.append((char)(lllllllllllllIIlllIlIllIlIlIlllI ^ lllllllllllllIIlllIlIllIlIlIlIlI[lllllllllllllIIlllIlIllIlIlIlIIl % lllllllllllllIIlllIlIllIlIlIlIlI.length]));
            "".length();
            ++lllllllllllllIIlllIlIllIlIlIlIIl;
            ++lllllllllllllIIlllIlIllIlIlIIIIl;
            "".length();
            if (-(0xF7 ^ 0xAB ^ (0x4E ^ 0x16)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlIllIlIlIlIll);
    }
    
    public boolean hasTagCompound() {
        if (llIIlIIlllllIll(this.stackTagCompound)) {
            return ItemStack.lIIlIIIIllIIll[1] != 0;
        }
        return ItemStack.lIIlIIIIllIIll[0] != 0;
    }
    
    public int getMaxDamage() {
        return this.item.getMaxDamage();
    }
    
    public void readFromNBT(final NBTTagCompound lllllllllllllIIlllIllIIIIllIlIII) {
        if (llIIlIIllllllII(lllllllllllllIIlllIllIIIIllIlIII.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[6]], ItemStack.lIIlIIIIllIIll[7]) ? 1 : 0)) {
            this.item = Item.getByNameOrId(lllllllllllllIIlllIllIIIIllIlIII.getString(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[8]]));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.item = Item.getItemById(lllllllllllllIIlllIllIIIIllIlIII.getShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[7]]));
        }
        this.stackSize = lllllllllllllIIlllIllIIIIllIlIII.getByte(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[9]]);
        this.itemDamage = lllllllllllllIIlllIllIIIIllIlIII.getShort(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[10]]);
        if (llIIlIIlllllIlI(this.itemDamage)) {
            this.itemDamage = ItemStack.lIIlIIIIllIIll[0];
        }
        if (llIIlIIllllllII(lllllllllllllIIlllIllIIIIllIlIII.hasKey(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[11]], ItemStack.lIIlIIIIllIIll[10]) ? 1 : 0)) {
            this.stackTagCompound = lllllllllllllIIlllIllIIIIllIlIII.getCompoundTag(ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[12]]);
            if (llIIlIIlllllIll(this.item)) {
                this.item.updateItemStackNBT(this.stackTagCompound);
                "".length();
            }
        }
    }
    
    public int getMaxItemUseDuration() {
        return this.getItem().getMaxItemUseDuration(this);
    }
    
    private static boolean llIIlIlIIIIIIIl(final int lllllllllllllIIlllIlIllIIllIIIII) {
        return lllllllllllllIIlllIlIllIIllIIIII > 0;
    }
    
    public void setItemDamage(final int lllllllllllllIIlllIllIIIIlIIlIll) {
        this.itemDamage = lllllllllllllIIlllIllIIIIlIIlIll;
        if (llIIlIIlllllIlI(this.itemDamage)) {
            this.itemDamage = ItemStack.lIIlIIIIllIIll[0];
        }
    }
    
    private static void llIIlIIlllIlIll() {
        (lIIlIIIIlIllIl = new String[ItemStack.lIIlIIIIllIIll[90]])[ItemStack.lIIlIIIIllIIll[0]] = llIIlIIllIllIlI("SHdhSEA=", "kYBkc");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[1]] = llIIlIIllIllIlI("CCw=", "aHgyj");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[2]] = llIIlIIllIllIll("1L44Gj9uweQOV+ncLOSRFg==", "LRLEU");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[3]] = llIIlIIllIlllII("MtNfU4Q+A8s=", "RkTOn");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[4]] = llIIlIIllIlllII("mn0KPuDs9MQ=", "yEZQy");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[5]] = llIIlIIllIlllII("MjOi06F1oZw=", "sCCIw");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[6]] = llIIlIIllIllIlI("Mxc=", "ZsakQ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[8]] = llIIlIIllIllIlI("MT4=", "XZXHp");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[7]] = llIIlIIllIllIll("sTVDq6NTgU8=", "GdJJk");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[9]] = llIIlIIllIlllII("RlQmkdErD0s=", "pPeqH");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[10]] = llIIlIIllIllIlI("DiYIBywv", "JGefK");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[11]] = llIIlIIllIllIll("7m4itUP5uuU=", "rqAND");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[12]] = llIIlIIllIllIll("vGLTv+u01DU=", "IOJhQ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[13]] = llIIlIIllIlllII("DXWGICFZVAg5pCUWaud62Q==", "rjkqM");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[14]] = llIIlIIllIllIlI("LA==", "TDppg");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[15]] = llIIlIIllIllIlI("IQ==", "aQjtp");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[16]] = llIIlIIllIlllII("AVPPk/ZbB30=", "ZKMCo");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[17]] = llIIlIIllIlllII("FG0mbQ+PY2A=", "LIRiO");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[18]] = llIIlIIllIllIlI("DxE9ACQKAQ==", "kxNpH");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[19]] = llIIlIIllIlllII("2hT58O2bBRg=", "ORmbP");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[20]] = llIIlIIllIlllII("NVNSpk3rktg=", "ZUomA");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[21]] = llIIlIIllIlllII("a1V+haQYFNM=", "WqycI");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[22]] = llIIlIIllIlllII("M5Yq/QPUcfs=", "blBvD");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[23]] = llIIlIIllIllIlI("ESIVHS8UMg==", "uKfmC");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[24]] = llIIlIIllIlllII("8CkcIegrmBA=", "VbRQB");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[25]] = llIIlIIllIlllII("+mm19HTfnRk=", "xWnAB");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[26]] = llIIlIIllIllIll("zp4D+2IKovc=", "JtICs");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[27]] = llIIlIIllIlllII("Xdcev50UZ2A=", "prAGR");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[28]] = llIIlIIllIllIlI("AzAYGT4GIA==", "gYkiR");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[29]] = llIIlIIllIllIlI("IgAeMw8nEA==", "FimCc");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[30]] = llIIlIIllIlllII("5TNhOl1dXbc=", "lhkbW");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[31]] = llIIlIIllIlllII("GSaWDF3KjS4=", "safOb");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[32]] = llIIlIIllIllIll("xfGc5rwr6s0=", "eQFgZ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[33]] = llIIlIIllIllIll("vRXBSnSi0vY=", "uCNtn");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[34]] = llIIlIIllIllIll("LImA34SsBH8=", "dnIRo");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[35]] = llIIlIIllIllIll("j51XLDZzv+LjEuPDjLLnOw==", "idJES");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[36]] = llIIlIIllIllIlI("VVFxTgVTBw==", "vtAza");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[37]] = llIIlIIllIllIll("0+d+IEROeSE=", "mgxWD");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[38]] = llIIlIIllIlllII("/BAnoHDQ8LJxLBsKKScaIA==", "KGBWO");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[40]] = llIIlIIllIlllII("G7l4EJpU+NyAPUb/fQiC5w==", "LPrpE");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[41]] = llIIlIIllIllIll("mmVMZtqPDXE=", "kvzyc");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[42]] = llIIlIIllIllIll("h175ZJjGAcU=", "DXkCX");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[43]] = llIIlIIllIllIlI("EzAAICEWIA==", "wYsPM");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[44]] = llIIlIIllIlllII("xDGk2UL2lNo=", "TTCGl");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[45]] = llIIlIIllIlllII("LRSjlJCf2ck=", "iLyKu");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[46]] = llIIlIIllIlllII("LXCxb23sbcBEvoDofCESfA==", "lrIMA");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[47]] = llIIlIIllIllIlI("MQwCHjw=", "RcnqN");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[48]] = llIIlIIllIlllII("qkKFbZs1xMrRhZmQIdDv9Q==", "UsNPn");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[49]] = llIIlIIllIllIlI("DRoiMw==", "AuPVx");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[50]] = llIIlIIllIllIll("hxrzxpLI2WU=", "qHbdO");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[51]] = llIIlIIllIllIlI("", "VzQEI");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[52]] = llIIlIIllIllIll("rQzF4gtlyHAbKqcGWjHMJsHi86my7KCzi0LycntibC0=", "Zietk");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[53]] = llIIlIIllIlllII("ZTkGoh4GXJNGwnheubMUvA==", "inBEp");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[54]] = llIIlIIllIlllII("+wpiY/+qbR0pQfjxsugnnFRLLwrGz8LnK+apSJ8sNco=", "MCiiK");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[55]] = llIIlIIllIllIlI("NA4ZOC83DxkvaDsbAC9o", "UzmJF");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[56]] = llIIlIIllIllIlI("HxgmGD0rHSUINC8=", "JvDjX");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[57]] = llIIlIIllIllIlI("CwMqAnQXGS0dPwMcLg02Bw==", "bwOoZ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[58]] = llIIlIIllIllIlI("KDQ/NRIYISMeDg==", "kUQqw");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[59]] = llIIlIIllIllIll("PmFjQxFq4elCVDwBY1V3eA==", "UHyUB");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[60]] = llIIlIIllIllIlI("", "xVcvj");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[61]] = llIIlIIllIllIll("w3uyCa/TPAa6b85alivhvQ==", "wLfgY");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[62]] = llIIlIIllIlllII("DEKaAktjvQtO6YcRqY6vmg==", "rvzqj");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[63]] = llIIlIIllIllIll("u456Sb/VWj/nGXAdzwPUMw==", "DEqTl");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[64]] = llIIlIIllIllIll("0R2oGeA+BDkZqxSBTlqvRw==", "OEGGQ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[65]] = llIIlIIllIlllII("Mnr1jcY99x8=", "AZrcg");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[66]] = llIIlIIllIlllII("C1rS22ZrQznc+fiUkFdupw==", "cfrdJ");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[67]] = llIIlIIllIlllII("YuqZmqjLSaYDcymxXv/6FA==", "kvNNk");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[68]] = llIIlIIllIllIll("e+/ZaOtXuJUhwn6lkeDsJA==", "YuXdD");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[69]] = llIIlIIllIlllII("iyLLli3j/J8=", "DAfcG");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[70]] = llIIlIIllIllIlI("NA0mVHM=", "zOrnS");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[71]] = llIIlIIllIlllII("jRVPMFia+8g=", "LhbLk");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[72]] = llIIlIIllIllIll("YLppGgz8gN0=", "lQacV");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[73]] = llIIlIIllIllIlI("HDsaLQ==", "yUyEf");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[74]] = llIIlIIllIllIlI("Ig0oLQ==", "GcKEb");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[75]] = llIIlIIllIllIlI("DBM=", "ewqpV");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[76]] = llIIlIIllIllIll("JabalMEr2Ss=", "epesX");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[77]] = llIIlIIllIlllII("V6jOUaPRa8U=", "IfXJc");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[78]] = llIIlIIllIlllII("pFIoNikpnrMZ/BEuIgrmdQ==", "AYlGo");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[79]] = llIIlIIllIlllII("L70tSpHfvw4g7NGTURdzBA==", "jrALp");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[80]] = llIIlIIllIllIll("oH4tkArzJ3vFpdb9yzqovA==", "wAbty");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[81]] = llIIlIIllIllIlI("LDwHHwcPPQcIIwIsGgsHCDoA", "mHsmn");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[82]] = llIIlIIllIllIll("FALXj0OO0vsQ/XZoLdVCEVfC8iBmD4IR", "xveXw");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[83]] = llIIlIIllIllIlI("GSIWNR06IxYiOjk7Bw==", "XVbGt");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[84]] = llIIlIIllIllIlI("EA==", "KnzYd");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[85]] = llIIlIIllIllIll("1PeGTbu42Ws=", "kNstW");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[86]] = llIIlIIllIlllII("Xm1dELoQfjqn83q8VOx8Cw==", "BVlic");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[87]] = llIIlIIllIlllII("z0z0P4iOK8TGDMSzI5z8sQ==", "xCDvr");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[88]] = llIIlIIllIllIll("EK4in8ax6tmwpjgC3rmZhg==", "hXhdj");
        ItemStack.lIIlIIIIlIllIl[ItemStack.lIIlIIIIllIIll[89]] = llIIlIIllIllIlI("Aio0EhwgKD8NHg==", "AKZBp");
    }
}
