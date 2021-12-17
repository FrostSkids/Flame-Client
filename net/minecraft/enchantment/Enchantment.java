// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import java.util.Arrays;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.StatCollector;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import java.util.Map;

public abstract class Enchantment
{
    private static final /* synthetic */ Map<ResourceLocation, Enchantment> locationEnchantments;
    private static final /* synthetic */ Enchantment[] enchantmentsList;
    public final /* synthetic */ int effectId;
    private static final /* synthetic */ String[] lIIIIIllllIlII;
    public /* synthetic */ EnumEnchantmentType type;
    private static final /* synthetic */ int[] lIIIIlIIIIIlII;
    private final /* synthetic */ int weight;
    protected /* synthetic */ String name;
    
    public int getMaxEnchantability(final int lllllllllllllIlIIllIlIIlIlIlIIll) {
        return this.getMinEnchantability(lllllllllllllIlIIllIlIIlIlIlIIll) + Enchantment.lIIIIlIIIIIlII[4];
    }
    
    private static String lIllIllllIlllII(final String lllllllllllllIlIIllIlIIlIIIlllIl, final String lllllllllllllIlIIllIlIIlIIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIlIIlIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIlIIlIIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIlIIlIIIlllll.init(Enchantment.lIIIIlIIIIIlII[5], lllllllllllllIlIIllIlIIlIIlIIIII);
            return new String(lllllllllllllIlIIllIlIIlIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIlIIlIIIllllI) {
            lllllllllllllIlIIllIlIIlIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public static Enchantment getEnchantmentByLocation(final String lllllllllllllIlIIllIlIIlIllIIIIl) {
        return Enchantment.locationEnchantments.get(new ResourceLocation(lllllllllllllIlIIllIlIIlIllIIIIl));
    }
    
    public boolean canApplyTogether(final Enchantment lllllllllllllIlIIllIlIIlIlIIIlll) {
        if (lIllIlllllllllI(this, lllllllllllllIlIIllIlIIlIlIIIlll)) {
            return Enchantment.lIIIIlIIIIIlII[3] != 0;
        }
        return Enchantment.lIIIIlIIIIIlII[1] != 0;
    }
    
    public float calcDamageByCreature(final int lllllllllllllIlIIllIlIIlIlIIllII, final EnumCreatureAttribute lllllllllllllIlIIllIlIIlIlIIlIll) {
        return 0.0f;
    }
    
    private static boolean lIllIllllllllII(final int lllllllllllllIlIIllIlIIIlllIIIll) {
        return lllllllllllllIlIIllIlIIIlllIIIll >= 0;
    }
    
    private static void lIllIlllllllIIl() {
        (lIIIIlIIIIIlII = new int[41])[0] = (0xFFFFD95F & 0x27A0);
        Enchantment.lIIIIlIIIIIlII[1] = ((0xD7 ^ 0x86) & ~(0xEC ^ 0xBD));
        Enchantment.lIIIIlIIIIIlII[2] = (130 + 15 - 108 + 149 ^ 104 + 129 - 89 + 32);
        Enchantment.lIIIIlIIIIIlII[3] = " ".length();
        Enchantment.lIIIIlIIIIIlII[4] = (2 + 6 + 52 + 67 ^ (0x58 ^ 0x22));
        Enchantment.lIIIIlIIIIIlII[5] = "  ".length();
        Enchantment.lIIIIlIIIIIlII[6] = "   ".length();
        Enchantment.lIIIIlIIIIIlII[7] = (0xA4 ^ 0xA0);
        Enchantment.lIIIIlIIIIIlII[8] = (63 + 33 + 73 + 4 ^ 160 + 120 - 129 + 20);
        Enchantment.lIIIIlIIIIIlII[9] = (0xC4 ^ 0xC3);
        Enchantment.lIIIIlIIIIIlII[10] = (0x83 ^ 0x8B);
        Enchantment.lIIIIlIIIIIlII[11] = (0xA4 ^ 0xB4);
        Enchantment.lIIIIlIIIIIlII[12] = (0x8 ^ 0x1);
        Enchantment.lIIIIlIIIIIlII[13] = (0x94 ^ 0x85);
        Enchantment.lIIIIlIIIIIlII[14] = (0x34 ^ 0x41 ^ (0x32 ^ 0x55));
        Enchantment.lIIIIlIIIIIlII[15] = (0x70 ^ 0x7B);
        Enchantment.lIIIIlIIIIIlII[16] = (81 + 126 - 101 + 106 ^ 8 + 105 - 6 + 92);
        Enchantment.lIIIIlIIIIIlII[17] = (0xCB ^ 0xC7);
        Enchantment.lIIIIlIIIIIlII[18] = (90 + 28 - 65 + 134 ^ 129 + 159 - 116 + 3);
        Enchantment.lIIIIlIIIIIlII[19] = (92 + 60 - 52 + 34 ^ 49 + 127 - 101 + 64);
        Enchantment.lIIIIlIIIIIlII[20] = (0x9B ^ 0x8E);
        Enchantment.lIIIIlIIIIIlII[21] = (0x80 ^ 0xBB ^ (0x81 ^ 0xB4));
        Enchantment.lIIIIlIIIIIlII[22] = (155 + 76 - 160 + 95 ^ 5 + 73 - 0 + 56);
        Enchantment.lIIIIlIIIIIlII[23] = (0x5D ^ 0x52);
        Enchantment.lIIIIlIIIIIlII[24] = (133 + 21 - 36 + 62 ^ 105 + 148 - 139 + 35);
        Enchantment.lIIIIlIIIIIlII[25] = (0xF5 ^ 0xBC ^ (0xA9 ^ 0xC2));
        Enchantment.lIIIIlIIIIIlII[26] = (0x33 ^ 0x5 ^ (0x7D ^ 0x68));
        Enchantment.lIIIIlIIIIIlII[27] = (117 + 72 - 65 + 21 ^ 89 + 138 - 174 + 108);
        Enchantment.lIIIIlIIIIIlII[28] = (0x49 ^ 0x78);
        Enchantment.lIIIIlIIIIIlII[29] = (0x85 ^ 0xB7);
        Enchantment.lIIIIlIIIIIlII[30] = (0xC5 ^ 0x90 ^ (0xCE ^ 0xA8));
        Enchantment.lIIIIlIIIIIlII[31] = (0x29 ^ 0x14 ^ (0x21 ^ 0xA));
        Enchantment.lIIIIlIIIIIlII[32] = (0x34 ^ 0x40 ^ (0x4A ^ 0x3));
        Enchantment.lIIIIlIIIIIlII[33] = (0xCD ^ 0xAA ^ (0x7E ^ 0xE));
        Enchantment.lIIIIlIIIIIlII[34] = (0x37 ^ 0x9);
        Enchantment.lIIIIlIIIIIlII[35] = (0xA7 ^ 0xBF);
        Enchantment.lIIIIlIIIIIlII[36] = (0x80 ^ 0x8C ^ (0xBE ^ 0xAB));
        Enchantment.lIIIIlIIIIIlII[37] = (0x1B ^ 0x5A ^ (0x24 ^ 0x7F));
        Enchantment.lIIIIlIIIIIlII[38] = (0x75 ^ 0x10 ^ (0x12 ^ 0x6C));
        Enchantment.lIIIIlIIIIIlII[39] = (0x19 ^ 0x7A ^ 4 + 114 - 104 + 113);
        Enchantment.lIIIIlIIIIIlII[40] = (0xDC ^ 0xBD ^ (0xF7 ^ 0x8B));
    }
    
    public int getMaxLevel() {
        return Enchantment.lIIIIlIIIIIlII[3];
    }
    
    public void onUserHurt(final EntityLivingBase lllllllllllllIlIIllIlIIlIIlIIlll, final Entity lllllllllllllIlIIllIlIIlIIlIIllI, final int lllllllllllllIlIIllIlIIlIIlIIlIl) {
    }
    
    private static void lIllIlllllIllII() {
        (lIIIIIllllIlII = new String[Enchantment.lIIIIlIIIIIlII[40]])[Enchantment.lIIIIlIIIIIlII[1]] = lIllIllllIllIll("EjoIEg4BPA4JBQ==", "bHgfk");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[3]] = lIllIllllIllIll("PCQ0ExwqPykCJjk5Lxkt", "ZMFvC");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[5]] = lIllIllllIlllII("XGC8TXH3mMpTU26D3xXkLw==", "HNhbC");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[6]] = lIllIllllIlllIl("q+7RRy6nI8bwx9jaGPDI20TPLwh1Q7mp", "MPabP");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[7]] = lIllIllllIlllII("9lJOD50kXrQHFRBJ8Ed5oB7R16NRYVLK", "wKnTz");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[4]] = lIllIllllIllIll("BDQLCiwEMAwTKhg=", "vQxzE");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[8]] = lIllIllllIlllII("llycBpuHXTyNpJkuIdkGng==", "fPbHM");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[9]] = lIllIllllIlllIl("n1AiPKj99no=", "GTIct");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[10]] = lIllIllllIlllII("WujtcqV+l3CE7okK3WiEmA==", "pfDTt");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[12]] = lIllIllllIllIll("OQ8SHQMkAgAc", "Jgsos");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[2]] = lIllIllllIlllIl("eSjlGtRyhyU=", "rqWpu");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[15]] = lIllIllllIlllII("Sz5mdUtZdkb7CIfzovc+GPrz3kRV+ou+", "gFlnb");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[17]] = lIllIllllIlllII("sDdhnJpOt+8cHwICZaf8Eg==", "RSHgW");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[19]] = lIllIllllIllIll("NSEzIzEyOzEjDSc=", "SHAFn");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[21]] = lIllIllllIlllII("mGafyLElNlg=", "zKmXN");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[23]] = lIllIllllIlllII("9+cDD7DcSOGg2owI+egNrQ==", "yxEWX");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[11]] = lIllIllllIllIll("PD4DPAY7OBo0MQ==", "OWoWY");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[13]] = lIllIllllIllIll("Ag8uOD8WCiUkPQ==", "waLJZ");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[14]] = lIllIllllIlllII("4Y6cy6VOnkE=", "WoXyk");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[16]] = lIllIllllIlllIl("PO/kF+ZiuiM=", "mWwBR");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[18]] = lIllIllllIllIll("Jx0XKgM=", "WhyIk");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[20]] = lIllIllllIllIll("HyosGhw=", "yFMwy");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[31]] = lIllIllllIlllIl("BJN9i/Cn4i26IuGltASbaA==", "ejSVb");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[33]] = lIllIllllIlllIl("utOHsbKQgDuKndokoxDWPA==", "yQuxU");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[35]] = lIllIllllIlllII("XFGV+C2B4BQ=", "osgng");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[36]] = lIllIllllIllIll("JSAZCDsCNB0BcgQ7CgwzDyEEATwVdQAAcw==", "aUidR");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[37]] = lIllIllllIlllII("c5MhRAKzAaFxCM/Aq4qOVw==", "bXFeC");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[38]] = lIllIllllIllIll("eQ==", "YSrWm");
        Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[39]] = lIllIllllIlllII("Qf7NZ1LTcW/k///uN0e09Wkrdj/yOeGX", "ldthO");
    }
    
    public String getName() {
        return String.valueOf(new StringBuilder(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[37]]).append(this.name));
    }
    
    public static Set<ResourceLocation> func_181077_c() {
        return Enchantment.locationEnchantments.keySet();
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public int getMinLevel() {
        return Enchantment.lIIIIlIIIIIlII[3];
    }
    
    private static boolean lIllIlllllllllI(final Object lllllllllllllIlIIllIlIIIlllIlIII, final Object lllllllllllllIlIIllIlIIIlllIIlll) {
        return lllllllllllllIlIIllIlIIIlllIlIII != lllllllllllllIlIIllIlIIIlllIIlll;
    }
    
    public String getTranslatedName(final int lllllllllllllIlIIllIlIIlIIllIlII) {
        final String lllllllllllllIlIIllIlIIlIIllIllI = StatCollector.translateToLocal(this.getName());
        return String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIllIlIIlIIllIllI)).append(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[38]]).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[39]]).append(lllllllllllllIlIIllIlIIlIIllIlII)))));
    }
    
    private static boolean lIllIllllllllIl(final int lllllllllllllIlIIllIlIIIlllIllII, final int lllllllllllllIlIIllIlIIIlllIlIll) {
        return lllllllllllllIlIIllIlIIIlllIllII < lllllllllllllIlIIllIlIIIlllIlIll;
    }
    
    private static String lIllIllllIllIll(String lllllllllllllIlIIllIlIIIlllllIll, final String lllllllllllllIlIIllIlIIIllllllll) {
        lllllllllllllIlIIllIlIIIlllllIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllIlIIIlllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIlIIIlllllllI = new StringBuilder();
        final char[] lllllllllllllIlIIllIlIIIllllllIl = lllllllllllllIlIIllIlIIIllllllll.toCharArray();
        int lllllllllllllIlIIllIlIIIllllllII = Enchantment.lIIIIlIIIIIlII[1];
        final short lllllllllllllIlIIllIlIIIllllIllI = (Object)((String)lllllllllllllIlIIllIlIIIlllllIll).toCharArray();
        final byte lllllllllllllIlIIllIlIIIllllIlIl = (byte)lllllllllllllIlIIllIlIIIllllIllI.length;
        Exception lllllllllllllIlIIllIlIIIllllIlII = (Exception)Enchantment.lIIIIlIIIIIlII[1];
        while (lIllIllllllllIl((int)lllllllllllllIlIIllIlIIIllllIlII, lllllllllllllIlIIllIlIIIllllIlIl)) {
            final char lllllllllllllIlIIllIlIIlIIIIIIIl = lllllllllllllIlIIllIlIIIllllIllI[lllllllllllllIlIIllIlIIIllllIlII];
            lllllllllllllIlIIllIlIIIlllllllI.append((char)(lllllllllllllIlIIllIlIIlIIIIIIIl ^ lllllllllllllIlIIllIlIIIllllllIl[lllllllllllllIlIIllIlIIIllllllII % lllllllllllllIlIIllIlIIIllllllIl.length]));
            "".length();
            ++lllllllllllllIlIIllIlIIIllllllII;
            ++lllllllllllllIlIIllIlIIIllllIlII;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIlIIIlllllllI);
    }
    
    public int calcModifierDamage(final int lllllllllllllIlIIllIlIIlIlIIllll, final DamageSource lllllllllllllIlIIllIlIIlIlIIlllI) {
        return Enchantment.lIIIIlIIIIIlII[1];
    }
    
    private static boolean lIllIlllllllIlI(final Object lllllllllllllIlIIllIlIIIlllIIlIl) {
        return lllllllllllllIlIIllIlIIIlllIIlIl != null;
    }
    
    public void onEntityDamaged(final EntityLivingBase lllllllllllllIlIIllIlIIlIIlIlIll, final Entity lllllllllllllIlIIllIlIIlIIlIlIlI, final int lllllllllllllIlIIllIlIIlIIlIlIIl) {
    }
    
    public boolean canApply(final ItemStack lllllllllllllIlIIllIlIIlIIlIllIl) {
        return this.type.canEnchantItem(lllllllllllllIlIIllIlIIlIIlIllIl.getItem());
    }
    
    public Enchantment setName(final String lllllllllllllIlIIllIlIIlIIllllll) {
        this.name = lllllllllllllIlIIllIlIIlIIllllll;
        return this;
    }
    
    public int getMinEnchantability(final int lllllllllllllIlIIllIlIIlIlIllIII) {
        return Enchantment.lIIIIlIIIIIlII[3] + lllllllllllllIlIIllIlIIlIlIllIII * Enchantment.lIIIIlIIIIIlII[2];
    }
    
    public static Enchantment getEnchantmentById(final int lllllllllllllIlIIllIlIIlIlllIIlI) {
        Enchantment enchantment;
        if (lIllIllllllllII(lllllllllllllIlIIllIlIIlIlllIIlI) && lIllIllllllllIl(lllllllllllllIlIIllIlIIlIlllIIlI, Enchantment.enchantmentsList.length)) {
            enchantment = Enchantment.enchantmentsList[lllllllllllllIlIIllIlIIlIlllIIlI];
            "".length();
            if (((0x84 ^ 0xBD) & ~(0x25 ^ 0x1C)) != 0x0) {
                return null;
            }
        }
        else {
            enchantment = null;
        }
        return enchantment;
    }
    
    static {
        lIllIlllllllIIl();
        lIllIlllllIllII();
        enchantmentsList = new Enchantment[Enchantment.lIIIIlIIIIIlII[0]];
        locationEnchantments = Maps.newHashMap();
        protection = new EnchantmentProtection(Enchantment.lIIIIlIIIIIlII[1], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[1]]), Enchantment.lIIIIlIIIIIlII[2], Enchantment.lIIIIlIIIIIlII[1]);
        fireProtection = new EnchantmentProtection(Enchantment.lIIIIlIIIIIlII[3], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[3]]), Enchantment.lIIIIlIIIIIlII[4], Enchantment.lIIIIlIIIIIlII[3]);
        featherFalling = new EnchantmentProtection(Enchantment.lIIIIlIIIIIlII[5], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[5]]), Enchantment.lIIIIlIIIIIlII[4], Enchantment.lIIIIlIIIIIlII[5]);
        blastProtection = new EnchantmentProtection(Enchantment.lIIIIlIIIIIlII[6], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[6]]), Enchantment.lIIIIlIIIIIlII[5], Enchantment.lIIIIlIIIIIlII[6]);
        projectileProtection = new EnchantmentProtection(Enchantment.lIIIIlIIIIIlII[7], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[7]]), Enchantment.lIIIIlIIIIIlII[4], Enchantment.lIIIIlIIIIIlII[7]);
        respiration = new EnchantmentOxygen(Enchantment.lIIIIlIIIIIlII[4], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[4]]), Enchantment.lIIIIlIIIIIlII[5]);
        aquaAffinity = new EnchantmentWaterWorker(Enchantment.lIIIIlIIIIIlII[8], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[8]]), Enchantment.lIIIIlIIIIIlII[5]);
        thorns = new EnchantmentThorns(Enchantment.lIIIIlIIIIIlII[9], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[9]]), Enchantment.lIIIIlIIIIIlII[3]);
        depthStrider = new EnchantmentWaterWalker(Enchantment.lIIIIlIIIIIlII[10], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[10]]), Enchantment.lIIIIlIIIIIlII[5]);
        sharpness = new EnchantmentDamage(Enchantment.lIIIIlIIIIIlII[11], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[12]]), Enchantment.lIIIIlIIIIIlII[2], Enchantment.lIIIIlIIIIIlII[1]);
        smite = new EnchantmentDamage(Enchantment.lIIIIlIIIIIlII[13], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[2]]), Enchantment.lIIIIlIIIIIlII[4], Enchantment.lIIIIlIIIIIlII[3]);
        baneOfArthropods = new EnchantmentDamage(Enchantment.lIIIIlIIIIIlII[14], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[15]]), Enchantment.lIIIIlIIIIIlII[4], Enchantment.lIIIIlIIIIIlII[5]);
        knockback = new EnchantmentKnockback(Enchantment.lIIIIlIIIIIlII[16], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[17]]), Enchantment.lIIIIlIIIIIlII[4]);
        fireAspect = new EnchantmentFireAspect(Enchantment.lIIIIlIIIIIlII[18], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[19]]), Enchantment.lIIIIlIIIIIlII[5]);
        looting = new EnchantmentLootBonus(Enchantment.lIIIIlIIIIIlII[20], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[21]]), Enchantment.lIIIIlIIIIIlII[5], EnumEnchantmentType.WEAPON);
        efficiency = new EnchantmentDigging(Enchantment.lIIIIlIIIIIlII[22], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[23]]), Enchantment.lIIIIlIIIIIlII[2]);
        silkTouch = new EnchantmentUntouching(Enchantment.lIIIIlIIIIIlII[24], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[11]]), Enchantment.lIIIIlIIIIIlII[3]);
        unbreaking = new EnchantmentDurability(Enchantment.lIIIIlIIIIIlII[25], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[13]]), Enchantment.lIIIIlIIIIIlII[4]);
        fortune = new EnchantmentLootBonus(Enchantment.lIIIIlIIIIIlII[26], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[14]]), Enchantment.lIIIIlIIIIIlII[5], EnumEnchantmentType.DIGGER);
        power = new EnchantmentArrowDamage(Enchantment.lIIIIlIIIIIlII[27], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[16]]), Enchantment.lIIIIlIIIIIlII[2]);
        punch = new EnchantmentArrowKnockback(Enchantment.lIIIIlIIIIIlII[28], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[18]]), Enchantment.lIIIIlIIIIIlII[5]);
        flame = new EnchantmentArrowFire(Enchantment.lIIIIlIIIIIlII[29], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[20]]), Enchantment.lIIIIlIIIIIlII[5]);
        infinity = new EnchantmentArrowInfinite(Enchantment.lIIIIlIIIIIlII[30], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[31]]), Enchantment.lIIIIlIIIIIlII[3]);
        luckOfTheSea = new EnchantmentLootBonus(Enchantment.lIIIIlIIIIIlII[32], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[33]]), Enchantment.lIIIIlIIIIIlII[5], EnumEnchantmentType.FISHING_ROD);
        lure = new EnchantmentFishingSpeed(Enchantment.lIIIIlIIIIIlII[34], new ResourceLocation(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[35]]), Enchantment.lIIIIlIIIIIlII[5], EnumEnchantmentType.FISHING_ROD);
        final List<Enchantment> lllllllllllllIlIIllIlIIlIllllllI = (List<Enchantment>)Lists.newArrayList();
        final int lllllllllllllIlIIllIlIIlIlllIlIl;
        final boolean lllllllllllllIlIIllIlIIlIlllIllI = ((Enchantment[])(Object)(lllllllllllllIlIIllIlIIlIlllIlIl = (int)(Object)Enchantment.enchantmentsList)).length != 0;
        double lllllllllllllIlIIllIlIIlIlllIlll = Enchantment.lIIIIlIIIIIlII[1];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIllIlllllllIll((int)lllllllllllllIlIIllIlIIlIlllIlll, lllllllllllllIlIIllIlIIlIlllIllI ? 1 : 0)) {
            final Enchantment lllllllllllllIlIIllIlIIlIllllIll = lllllllllllllIlIIllIlIIlIlllIlIl[lllllllllllllIlIIllIlIIlIlllIlll];
            if (lIllIlllllllIlI(lllllllllllllIlIIllIlIIlIllllIll)) {
                lllllllllllllIlIIllIlIIlIllllllI.add(lllllllllllllIlIIllIlIIlIllllIll);
                "".length();
            }
            ++lllllllllllllIlIIllIlIIlIlllIlll;
        }
        enchantmentsBookList = lllllllllllllIlIIllIlIIlIllllllI.toArray(new Enchantment[lllllllllllllIlIIllIlIIlIllllllI.size()]);
    }
    
    private static boolean lIllIlllllllIll(final int lllllllllllllIlIIllIlIIIllllIIII, final int lllllllllllllIlIIllIlIIIlllIllll) {
        return lllllllllllllIlIIllIlIIIllllIIII >= lllllllllllllIlIIllIlIIIlllIllll;
    }
    
    protected Enchantment(final int lllllllllllllIlIIllIlIIlIllIIllI, final ResourceLocation lllllllllllllIlIIllIlIIlIllIlIlI, final int lllllllllllllIlIIllIlIIlIllIlIIl, final EnumEnchantmentType lllllllllllllIlIIllIlIIlIllIIIll) {
        this.effectId = lllllllllllllIlIIllIlIIlIllIIllI;
        this.weight = lllllllllllllIlIIllIlIIlIllIlIIl;
        this.type = lllllllllllllIlIIllIlIIlIllIIIll;
        if (lIllIlllllllIlI(Enchantment.enchantmentsList[lllllllllllllIlIIllIlIIlIllIIllI])) {
            throw new IllegalArgumentException(Enchantment.lIIIIIllllIlII[Enchantment.lIIIIlIIIIIlII[36]]);
        }
        Enchantment.enchantmentsList[lllllllllllllIlIIllIlIIlIllIIllI] = this;
        Enchantment.locationEnchantments.put(lllllllllllllIlIIllIlIIlIllIlIlI, this);
        "".length();
    }
    
    private static String lIllIllllIlllIl(final String lllllllllllllIlIIllIlIIlIIIIlllI, final String lllllllllllllIlIIllIlIIlIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIlIIlIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), Enchantment.lIIIIlIIIIIlII[10]), "DES");
            final Cipher lllllllllllllIlIIllIlIIlIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIllIlIIlIIIlIIlI.init(Enchantment.lIIIIlIIIIIlII[5], lllllllllllllIlIIllIlIIlIIIlIIll);
            return new String(lllllllllllllIlIIllIlIIlIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIlIIlIIIlIIIl) {
            lllllllllllllIlIIllIlIIlIIIlIIIl.printStackTrace();
            return null;
        }
    }
}
