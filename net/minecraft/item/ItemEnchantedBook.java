// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.nbt.NBTBase;
import net.minecraft.enchantment.EnchantmentData;
import java.util.Arrays;
import net.minecraft.enchantment.Enchantment;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.Random;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ItemEnchantedBook extends Item
{
    private static final /* synthetic */ int[] llIllllllIlIIl;
    private static final /* synthetic */ String[] llIllllllIIIll;
    
    private static boolean lIIllIlllIIIIIII(final int llllllllllllIllIIIlIlIlIllIlIIll, final int llllllllllllIllIIIlIlIlIllIlIIlI) {
        return llllllllllllIllIIIlIlIlIllIlIIll >= llllllllllllIllIIIlIlIlIllIlIIlI;
    }
    
    @Override
    public boolean isItemTool(final ItemStack llllllllllllIllIIIlIlIllIlllIlIl) {
        return ItemEnchantedBook.llIllllllIlIIl[1] != 0;
    }
    
    private static String lIIllIllIllIlIII(final String llllllllllllIllIIIlIlIlIllIlllIl, final String llllllllllllIllIIIlIlIlIllIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIlIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIlIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlIlIlllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlIlIlllIIIIl.init(ItemEnchantedBook.llIllllllIlIIl[3], llllllllllllIllIIIlIlIlIlllIIIlI);
            return new String(llllllllllllIllIIIlIlIlIlllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIlIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIlIlllIIIII) {
            llllllllllllIllIIIlIlIlIlllIIIII.printStackTrace();
            return null;
        }
    }
    
    public NBTTagList getEnchantments(final ItemStack llllllllllllIllIIIlIlIllIllIlIll) {
        final NBTTagCompound llllllllllllIllIIIlIlIllIllIlIlI = llllllllllllIllIIIlIlIllIllIlIll.getTagCompound();
        NBTTagList list;
        if (lIIllIllIllllllI(llllllllllllIllIIIlIlIllIllIlIlI) && lIIllIllIlllllll(llllllllllllIllIIIlIlIllIllIlIlI.hasKey(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[1]], ItemEnchantedBook.llIllllllIlIIl[2]) ? 1 : 0)) {
            list = (NBTTagList)llllllllllllIllIIIlIlIllIllIlIlI.getTag(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[0]]);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            list = new NBTTagList();
        }
        return list;
    }
    
    public WeightedRandomChestContent getRandom(final Random llllllllllllIllIIIlIlIllIIIlIIII, final int llllllllllllIllIIIlIlIllIIIlIlII, final int llllllllllllIllIIIlIlIllIIIlIIll, final int llllllllllllIllIIIlIlIllIIIlIIlI) {
        final ItemStack llllllllllllIllIIIlIlIllIIIlIIIl = new ItemStack(Items.book, ItemEnchantedBook.llIllllllIlIIl[0], ItemEnchantedBook.llIllllllIlIIl[1]);
        EnchantmentHelper.addRandomEnchantment(llllllllllllIllIIIlIlIllIIIlIIII, llllllllllllIllIIIlIlIllIIIlIIIl, ItemEnchantedBook.llIllllllIlIIl[10]);
        "".length();
        return new WeightedRandomChestContent(llllllllllllIllIIIlIlIllIIIlIIIl, llllllllllllIllIIIlIlIllIIIlIlII, llllllllllllIllIIIlIlIllIIIlIIll, llllllllllllIllIIIlIlIllIIIlIIlI);
    }
    
    private static String lIIllIllIllIIlll(String llllllllllllIllIIIlIlIlIlllIllll, final String llllllllllllIllIIIlIlIlIllllIIll) {
        llllllllllllIllIIIlIlIlIlllIllll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIlIlIlllIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlIlIllllIIlI = new StringBuilder();
        final char[] llllllllllllIllIIIlIlIlIllllIIIl = llllllllllllIllIIIlIlIlIllllIIll.toCharArray();
        int llllllllllllIllIIIlIlIlIllllIIII = ItemEnchantedBook.llIllllllIlIIl[1];
        final String llllllllllllIllIIIlIlIlIlllIlIlI = (Object)((String)llllllllllllIllIIIlIlIlIlllIllll).toCharArray();
        final short llllllllllllIllIIIlIlIlIlllIlIIl = (short)llllllllllllIllIIIlIlIlIlllIlIlI.length;
        byte llllllllllllIllIIIlIlIlIlllIlIII = (byte)ItemEnchantedBook.llIllllllIlIIl[1];
        while (lIIllIlllIIIIIlI(llllllllllllIllIIIlIlIlIlllIlIII, llllllllllllIllIIIlIlIlIlllIlIIl)) {
            final char llllllllllllIllIIIlIlIlIllllIlIl = llllllllllllIllIIIlIlIlIlllIlIlI[llllllllllllIllIIIlIlIlIlllIlIII];
            llllllllllllIllIIIlIlIlIllllIIlI.append((char)(llllllllllllIllIIIlIlIlIllllIlIl ^ llllllllllllIllIIIlIlIlIllllIIIl[llllllllllllIllIIIlIlIlIllllIIII % llllllllllllIllIIIlIlIlIllllIIIl.length]));
            "".length();
            ++llllllllllllIllIIIlIlIlIllllIIII;
            ++llllllllllllIllIIIlIlIlIlllIlIII;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlIlIllllIIlI);
    }
    
    private static boolean lIIllIlllIIIIIll(final int llllllllllllIllIIIlIlIlIllIIIlII) {
        return llllllllllllIllIIIlIlIlIllIIIlII == 0;
    }
    
    static {
        lIIllIllIlllllII();
        lIIllIllIlllIIlI();
    }
    
    public WeightedRandomChestContent getRandom(final Random llllllllllllIllIIIlIlIllIIIlllII) {
        return this.getRandom(llllllllllllIllIIIlIlIllIIIlllII, ItemEnchantedBook.llIllllllIlIIl[0], ItemEnchantedBook.llIllllllIlIIl[0], ItemEnchantedBook.llIllllllIlIIl[0]);
    }
    
    private static boolean lIIllIlllIIIIIlI(final int llllllllllllIllIIIlIlIlIllIIllll, final int llllllllllllIllIIIlIlIlIllIIlllI) {
        return llllllllllllIllIIIlIlIlIllIIllll < llllllllllllIllIIIlIlIlIllIIlllI;
    }
    
    private static boolean lIIllIlllIIIIIIl(final int llllllllllllIllIIIlIlIlIllIlIlll, final int llllllllllllIllIIIlIlIlIllIlIllI) {
        return llllllllllllIllIIIlIlIlIllIlIlll == llllllllllllIllIIIlIlIlIllIlIllI;
    }
    
    private static void lIIllIllIlllllII() {
        (llIllllllIlIIl = new int[12])[0] = " ".length();
        ItemEnchantedBook.llIllllllIlIIl[1] = ((0x59 ^ 0xA) & ~(0x70 ^ 0x23));
        ItemEnchantedBook.llIllllllIlIIl[2] = (0xB5 ^ 0xBC);
        ItemEnchantedBook.llIllllllIlIIl[3] = "  ".length();
        ItemEnchantedBook.llIllllllIlIIl[4] = "   ".length();
        ItemEnchantedBook.llIllllllIlIIl[5] = (52 + 101 - 113 + 106 ^ 128 + 133 - 139 + 28);
        ItemEnchantedBook.llIllllllIlIIl[6] = (0x6A ^ 0x6F);
        ItemEnchantedBook.llIllllllIlIIl[7] = (0x11 ^ 0x17);
        ItemEnchantedBook.llIllllllIlIIl[8] = (105 + 144 - 71 + 0 ^ 157 + 135 - 277 + 166);
        ItemEnchantedBook.llIllllllIlIIl[9] = (0xB9 ^ 0xB1);
        ItemEnchantedBook.llIllllllIlIIl[10] = (0x62 ^ 0x5B ^ (0x3 ^ 0x24));
        ItemEnchantedBook.llIllllllIlIIl[11] = (0x3A ^ 0x30);
    }
    
    private static boolean lIIllIlllIIIIlII(final int llllllllllllIllIIIlIlIlIllIIlIll, final int llllllllllllIllIIIlIlIlIllIIlIlI) {
        return llllllllllllIllIIIlIlIlIllIIlIll > llllllllllllIllIIIlIlIlIllIIlIlI;
    }
    
    private static void lIIllIllIlllIIlI() {
        (llIllllllIIIll = new String[ItemEnchantedBook.llIllllllIlIIl[11]])[ItemEnchantedBook.llIllllllIlIIl[1]] = lIIllIllIllIIlll("FS0tJg4iHCw3Ayc3NjkOKC0x", "FYBTk");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[0]] = lIIllIllIllIlIII("aOZ+tGPYbB4LeTywxC+PFU0wQrM3xOzs", "lcSZA");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[3]] = lIIllIllIllIIlll("GxQ=", "rpJvW");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[4]] = lIIllIllIllIlIII("o2M3XHenHOM=", "EVABs");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[5]] = lIIllIllIllIlIII("Y9KJ4n2mrRM=", "zicPs");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[6]] = lIIllIllIllIlIII("K+3UkwogPb4=", "HjTAL");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[7]] = lIIllIllIlllIIIl("hos4np1wewI=", "MmiAm");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[8]] = lIIllIllIlllIIIl("RuA6LMzmMF8=", "GOdUx");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[9]] = lIIllIllIllIlIII("7UKvp2LnqOk=", "Myzcf");
        ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[2]] = lIIllIllIlllIIIl("OtTOxeT7D6DuEvBlJlgNWRVkdPcHmoCy", "OhqMw");
    }
    
    @Override
    public EnumRarity getRarity(final ItemStack llllllllllllIllIIIlIlIllIllIllll) {
        EnumRarity enumRarity;
        if (lIIllIllIlllllIl(this.getEnchantments(llllllllllllIllIIIlIlIllIllIllll).tagCount())) {
            enumRarity = EnumRarity.UNCOMMON;
            "".length();
            if ((0xAE ^ 0xAB) <= 0) {
                return null;
            }
        }
        else {
            enumRarity = super.getRarity(llllllllllllIllIIIlIlIllIllIllll);
        }
        return enumRarity;
    }
    
    private static boolean lIIllIllIlllllll(final int llllllllllllIllIIIlIlIlIllIIIllI) {
        return llllllllllllIllIIIlIlIlIllIIIllI != 0;
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIllIIIlIlIllIlIlllIl, final EntityPlayer llllllllllllIllIIIlIlIllIlIlIIll, final List<String> llllllllllllIllIIIlIlIllIlIllIll, final boolean llllllllllllIllIIIlIlIllIlIllIlI) {
        super.addInformation(llllllllllllIllIIIlIlIllIlIlllIl, llllllllllllIllIIIlIlIllIlIlIIll, llllllllllllIllIIIlIlIllIlIllIll, llllllllllllIllIIIlIlIllIlIllIlI);
        final NBTTagList llllllllllllIllIIIlIlIllIlIllIIl = this.getEnchantments(llllllllllllIllIIIlIlIllIlIlllIl);
        if (lIIllIllIllllllI(llllllllllllIllIIIlIlIllIlIllIIl)) {
            int llllllllllllIllIIIlIlIllIlIllIII = ItemEnchantedBook.llIllllllIlIIl[1];
            "".length();
            if (" ".length() >= (155 + 119 - 244 + 163 ^ 184 + 70 - 79 + 22)) {
                return;
            }
            while (!lIIllIlllIIIIIII(llllllllllllIllIIIlIlIllIlIllIII, llllllllllllIllIIIlIlIllIlIllIIl.tagCount())) {
                final int llllllllllllIllIIIlIlIllIlIlIlll = llllllllllllIllIIIlIlIllIlIllIIl.getCompoundTagAt(llllllllllllIllIIIlIlIllIlIllIII).getShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[3]]);
                final int llllllllllllIllIIIlIlIllIlIlIllI = llllllllllllIllIIIlIlIllIlIllIIl.getCompoundTagAt(llllllllllllIllIIIlIlIllIlIllIII).getShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[4]]);
                if (lIIllIllIllllllI(Enchantment.getEnchantmentById(llllllllllllIllIIIlIlIllIlIlIlll))) {
                    llllllllllllIllIIIlIlIllIlIllIll.add(Enchantment.getEnchantmentById(llllllllllllIllIIIlIlIllIlIlIlll).getTranslatedName(llllllllllllIllIIIlIlIllIlIlIllI));
                    "".length();
                }
                ++llllllllllllIllIIIlIlIllIlIllIII;
            }
        }
    }
    
    private static String lIIllIllIlllIIIl(final String llllllllllllIllIIIlIlIllIIIIIIlI, final String llllllllllllIllIIIlIlIllIIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIllIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), ItemEnchantedBook.llIllllllIlIIl[9]), "DES");
            final Cipher llllllllllllIllIIIlIlIllIIIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIIlIlIllIIIIIllI.init(ItemEnchantedBook.llIllllllIlIIl[3], llllllllllllIllIIIlIlIllIIIIIlll);
            return new String(llllllllllllIllIIIlIlIllIIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIllIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIllIIIIIlIl) {
            llllllllllllIllIIIlIlIllIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    public void getAll(final Enchantment llllllllllllIllIIIlIlIllIIlIlIII, final List<ItemStack> llllllllllllIllIIIlIlIllIIlIIIll) {
        int llllllllllllIllIIIlIlIllIIlIIllI = llllllllllllIllIIIlIlIllIIlIlIII.getMinLevel();
        "".length();
        if (((0xF4 ^ 0xBA ^ (0x63 ^ 0x4E)) & (0x5C ^ 0x6 ^ (0x4B ^ 0x72) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIllIlllIIIIlII(llllllllllllIllIIIlIlIllIIlIIllI, llllllllllllIllIIIlIlIllIIlIlIII.getMaxLevel())) {
            llllllllllllIllIIIlIlIllIIlIIIll.add(this.getEnchantedItemStack(new EnchantmentData(llllllllllllIllIIIlIlIllIIlIlIII, llllllllllllIllIIIlIlIllIIlIIllI)));
            "".length();
            ++llllllllllllIllIIIlIlIllIIlIIllI;
        }
    }
    
    @Override
    public boolean hasEffect(final ItemStack llllllllllllIllIIIlIlIllIlllIlll) {
        return ItemEnchantedBook.llIllllllIlIIl[0] != 0;
    }
    
    public void addEnchantment(final ItemStack llllllllllllIllIIIlIlIllIlIIIlII, final EnchantmentData llllllllllllIllIIIlIlIllIIlllIll) {
        final NBTTagList llllllllllllIllIIIlIlIllIlIIIIlI = this.getEnchantments(llllllllllllIllIIIlIlIllIlIIIlII);
        boolean llllllllllllIllIIIlIlIllIlIIIIIl = ItemEnchantedBook.llIllllllIlIIl[0] != 0;
        int llllllllllllIllIIIlIlIllIlIIIIII = ItemEnchantedBook.llIllllllIlIIl[1];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIIllIlllIIIIIII(llllllllllllIllIIIlIlIllIlIIIIII, llllllllllllIllIIIlIlIllIlIIIIlI.tagCount())) {
            final NBTTagCompound llllllllllllIllIIIlIlIllIIllllll = llllllllllllIllIIIlIlIllIlIIIIlI.getCompoundTagAt(llllllllllllIllIIIlIlIllIlIIIIII);
            if (lIIllIlllIIIIIIl(llllllllllllIllIIIlIlIllIIllllll.getShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[5]]), llllllllllllIllIIIlIlIllIIlllIll.enchantmentobj.effectId)) {
                if (lIIllIlllIIIIIlI(llllllllllllIllIIIlIlIllIIllllll.getShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[6]]), llllllllllllIllIIIlIlIllIIlllIll.enchantmentLevel)) {
                    llllllllllllIllIIIlIlIllIIllllll.setShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[7]], (short)llllllllllllIllIIIlIlIllIIlllIll.enchantmentLevel);
                }
                llllllllllllIllIIIlIlIllIlIIIIIl = (ItemEnchantedBook.llIllllllIlIIl[1] != 0);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllIIIlIlIllIlIIIIII;
            }
        }
        if (lIIllIllIlllllll(llllllllllllIllIIIlIlIllIlIIIIIl ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllIIIlIlIllIIlllllI = new NBTTagCompound();
            llllllllllllIllIIIlIlIllIIlllllI.setShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[8]], (short)llllllllllllIllIIIlIlIllIIlllIll.enchantmentobj.effectId);
            llllllllllllIllIIIlIlIllIIlllllI.setShort(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[9]], (short)llllllllllllIllIIIlIlIllIIlllIll.enchantmentLevel);
            llllllllllllIllIIIlIlIllIlIIIIlI.appendTag(llllllllllllIllIIIlIlIllIIlllllI);
        }
        if (lIIllIlllIIIIIll(llllllllllllIllIIIlIlIllIlIIIlII.hasTagCompound() ? 1 : 0)) {
            llllllllllllIllIIIlIlIllIlIIIlII.setTagCompound(new NBTTagCompound());
        }
        llllllllllllIllIIIlIlIllIlIIIlII.getTagCompound().setTag(ItemEnchantedBook.llIllllllIIIll[ItemEnchantedBook.llIllllllIlIIl[2]], llllllllllllIllIIIlIlIllIlIIIIlI);
    }
    
    private static boolean lIIllIllIlllllIl(final int llllllllllllIllIIIlIlIlIllIIIIlI) {
        return llllllllllllIllIIIlIlIlIllIIIIlI > 0;
    }
    
    private static boolean lIIllIllIllllllI(final Object llllllllllllIllIIIlIlIlIllIIlIII) {
        return llllllllllllIllIIIlIlIlIllIIlIII != null;
    }
    
    public ItemStack getEnchantedItemStack(final EnchantmentData llllllllllllIllIIIlIlIllIIllIIlI) {
        final ItemStack llllllllllllIllIIIlIlIllIIllIIIl = new ItemStack(this);
        this.addEnchantment(llllllllllllIllIIIlIlIllIIllIIIl, llllllllllllIllIIIlIlIllIIllIIlI);
        return llllllllllllIllIIIlIlIllIIllIIIl;
    }
}
