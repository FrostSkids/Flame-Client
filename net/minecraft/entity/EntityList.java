// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import net.minecraft.stats.StatList;
import net.minecraft.stats.StatBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import java.lang.reflect.Constructor;
import net.minecraft.world.World;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityMinecartMobSpawner;
import net.minecraft.entity.item.EntityMinecartHopper;
import net.minecraft.entity.item.EntityMinecartTNT;
import net.minecraft.entity.item.EntityMinecartFurnace;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecartEmpty;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class EntityList
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ Map<Class<? extends Entity>, Integer> classToIDMapping;
    public static final /* synthetic */ Map<Integer, EntityEggInfo> entityEggs;
    private static final /* synthetic */ Map<Class<? extends Entity>, String> classToStringMapping;
    private static final /* synthetic */ int[] lIIlIllIIllIlI;
    private static final /* synthetic */ Map<Integer, Class<? extends Entity>> idToClassMapping;
    private static final /* synthetic */ Map<String, Class<? extends Entity>> stringToClassMapping;
    private static final /* synthetic */ String[] lIIlIllIIIlllI;
    private static final /* synthetic */ Map<String, Integer> stringToIDMapping;
    
    public static List<String> getEntityNameList() {
        final Set<String> lllllllllllllIIllIIlIIlIlIlIIIll = EntityList.stringToClassMapping.keySet();
        final List<String> lllllllllllllIIllIIlIIlIlIlIIIlI = (List<String>)Lists.newArrayList();
        final int lllllllllllllIIllIIlIIlIlIIlllII = (int)lllllllllllllIIllIIlIIlIlIlIIIll.iterator();
        "".length();
        if (((0xF4 ^ 0xBF) & ~(0x1 ^ 0x4A)) >= " ".length()) {
            return null;
        }
        while (!llIlIIlIIlIIIll(((Iterator)lllllllllllllIIllIIlIIlIlIIlllII).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIllIIlIIlIlIlIIIIl = ((Iterator<String>)lllllllllllllIIllIIlIIlIlIIlllII).next();
            final Class<? extends Entity> lllllllllllllIIllIIlIIlIlIlIIIII = EntityList.stringToClassMapping.get(lllllllllllllIIllIIlIIlIlIlIIIIl);
            if (llIlIIlIIlIIllI(lllllllllllllIIllIIlIIlIlIlIIIII.getModifiers() & EntityList.lIIlIllIIllIlI[129], EntityList.lIIlIllIIllIlI[129])) {
                lllllllllllllIIllIIlIIlIlIlIIIlI.add(lllllllllllllIIllIIlIIlIlIlIIIIl);
                "".length();
            }
        }
        lllllllllllllIIllIIlIIlIlIlIIIlI.add(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[91]]);
        "".length();
        return lllllllllllllIIllIIlIIlIlIlIIIlI;
    }
    
    private static String llIlIIIllllIIII(final String lllllllllllllIIllIIlIIlIlIIIIlll, final String lllllllllllllIIllIIlIIlIlIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIlIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), EntityList.lIIlIllIIllIlI[5]), "DES");
            final Cipher lllllllllllllIIllIIlIIlIlIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIIlIlIIIlIIl.init(EntityList.lIIlIllIIllIlI[2], lllllllllllllIIllIIlIIlIlIIIlIlI);
            return new String(lllllllllllllIIllIIlIIlIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIlIlIIIlIII) {
            lllllllllllllIIllIIlIIlIlIIIlIII.printStackTrace();
            return null;
        }
    }
    
    public static String getEntityString(final Entity lllllllllllllIIllIIlIIlIlIllIIll) {
        return EntityList.classToStringMapping.get(lllllllllllllIIllIIlIIlIlIllIIll.getClass());
    }
    
    private static void addMapping(final Class<? extends Entity> lllllllllllllIIllIIlIIlIllllIllI, final String lllllllllllllIIllIIlIIlIlllllIII, final int lllllllllllllIIllIIlIIlIllllIlll) {
        if (llIlIIlIIlIIIlI(EntityList.stringToClassMapping.containsKey(lllllllllllllIIllIIlIIlIlllllIII) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[51]]).append(lllllllllllllIIllIIlIIlIlllllIII)));
        }
        if (llIlIIlIIlIIIlI(EntityList.idToClassMapping.containsKey(lllllllllllllIIllIIlIIlIllllIlll) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[55]]).append(lllllllllllllIIllIIlIIlIllllIlll)));
        }
        if (llIlIIlIIlIIIll(lllllllllllllIIllIIlIIlIllllIlll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[59]]).append(lllllllllllllIIllIIlIIlIllllIlll)));
        }
        if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIllllIllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[62]]).append(lllllllllllllIIllIIlIIlIllllIlll)));
        }
        EntityList.stringToClassMapping.put(lllllllllllllIIllIIlIIlIlllllIII, lllllllllllllIIllIIlIIlIllllIllI);
        "".length();
        EntityList.classToStringMapping.put(lllllllllllllIIllIIlIIlIllllIllI, lllllllllllllIIllIIlIIlIlllllIII);
        "".length();
        EntityList.idToClassMapping.put(lllllllllllllIIllIIlIIlIllllIlll, lllllllllllllIIllIIlIIlIllllIllI);
        "".length();
        EntityList.classToIDMapping.put(lllllllllllllIIllIIlIIlIllllIllI, lllllllllllllIIllIIlIIlIllllIlll);
        "".length();
        EntityList.stringToIDMapping.put(lllllllllllllIIllIIlIIlIlllllIII, lllllllllllllIIllIIlIIlIllllIlll);
        "".length();
    }
    
    public static String getStringFromID(final int lllllllllllllIIllIIlIIlIlIlIlIlI) {
        return EntityList.classToStringMapping.get(getClassFromID(lllllllllllllIIllIIlIIlIlIlIlIlI));
    }
    
    private static boolean llIlIIlIIlIlIIl(final int lllllllllllllIIllIIlIIlIIlIllIlI, final int lllllllllllllIIllIIlIIlIIlIllIIl) {
        return lllllllllllllIIllIIlIIlIIlIllIlI < lllllllllllllIIllIIlIIlIIlIllIIl;
    }
    
    private static void llIlIIlIIlIIIIl() {
        (lIIlIllIIllIlI = new int[134])[0] = ((0x54 ^ 0x50) & ~(0x5C ^ 0x58));
        EntityList.lIIlIllIIllIlI[1] = " ".length();
        EntityList.lIIlIllIIllIlI[2] = "  ".length();
        EntityList.lIIlIllIIllIlI[3] = (0x8F ^ 0x88);
        EntityList.lIIlIllIIllIlI[4] = "   ".length();
        EntityList.lIIlIllIIllIlI[5] = (0x6C ^ 0x26 ^ (0xFB ^ 0xB9));
        EntityList.lIIlIllIIllIlI[6] = (0xA5 ^ 0xA1);
        EntityList.lIIlIllIIllIlI[7] = (0x66 ^ 0x6F);
        EntityList.lIIlIllIIllIlI[8] = (0x6D ^ 0x68);
        EntityList.lIIlIllIIllIlI[9] = (89 + 83 - 128 + 105 ^ 10 + 78 + 34 + 37);
        EntityList.lIIlIllIIllIlI[10] = (0x2 ^ 0x29 ^ (0xB ^ 0x26));
        EntityList.lIIlIllIIllIlI[11] = (0xC9 ^ 0xC2);
        EntityList.lIIlIllIIllIlI[12] = (0x7 ^ 0x3F ^ (0x6F ^ 0x5B));
        EntityList.lIIlIllIIllIlI[13] = (0x4D ^ 0x49 ^ (0x31 ^ 0x38));
        EntityList.lIIlIllIIllIlI[14] = (0xBA ^ 0xB4);
        EntityList.lIIlIllIIllIlI[15] = (0xCB ^ 0xC4);
        EntityList.lIIlIllIIllIlI[16] = (0x33 ^ 0x23);
        EntityList.lIIlIllIIllIlI[17] = (0x39 ^ 0x28);
        EntityList.lIIlIllIIllIlI[18] = (0xF0 ^ 0xC2 ^ (0x33 ^ 0x13));
        EntityList.lIIlIllIIllIlI[19] = (0x46 ^ 0x55);
        EntityList.lIIlIllIIllIlI[20] = (0x78 ^ 0x6C);
        EntityList.lIIlIllIIllIlI[21] = (0x73 ^ 0x66);
        EntityList.lIIlIllIIllIlI[22] = (0xE8 ^ 0x98 ^ (0xC ^ 0x6A));
        EntityList.lIIlIllIIllIlI[23] = (40 + 45 + 14 + 117 ^ 38 + 91 + 66 + 3);
        EntityList.lIIlIllIIllIlI[24] = (121 + 136 - 136 + 52 ^ 28 + 67 + 31 + 6);
        EntityList.lIIlIllIIllIlI[25] = (0x1B ^ 0x1D ^ (0x2B ^ 0x7));
        EntityList.lIIlIllIIllIlI[26] = (0x4 ^ 0x7A ^ (0xCE ^ 0x9B));
        EntityList.lIIlIllIIllIlI[27] = (0x9 ^ 0x33 ^ (0x4 ^ 0x12));
        EntityList.lIIlIllIIllIlI[28] = (0x2C ^ 0x1);
        EntityList.lIIlIllIIllIlI[29] = (0x3F ^ 0x11);
        EntityList.lIIlIllIIllIlI[30] = (0x4F ^ 0x57 ^ (0x90 ^ 0xA7));
        EntityList.lIIlIllIIllIlI[31] = (140 + 186 - 194 + 56 ^ 38 + 8 - 27 + 129);
        EntityList.lIIlIllIIllIlI[32] = (0x38 ^ 0x58 ^ (0x65 ^ 0x35));
        EntityList.lIIlIllIIllIlI[33] = (0x87 ^ 0xB6);
        EntityList.lIIlIllIIllIlI[34] = (0xAB ^ 0x99);
        EntityList.lIIlIllIIllIlI[35] = (-(0xFFFFDCF1 & 0x6B3F) & (0xFFFFEF3F & 0xDFFFB));
        EntityList.lIIlIllIIllIlI[36] = (146 + 92 - 164 + 112 ^ 136 + 5 - 38 + 70);
        EntityList.lIIlIllIIllIlI[37] = (0xA3 ^ 0x90);
        EntityList.lIIlIllIIllIlI[38] = (0xFFFFE9D7 & 0xC1D7E9);
        EntityList.lIIlIllIIllIlI[39] = (0xFFFFDF7F & 0x4969C9);
        EntityList.lIIlIllIIllIlI[40] = (0x8F ^ 0xA6 ^ (0x64 ^ 0x55));
        EntityList.lIIlIllIIllIlI[41] = (0x20 ^ 0x14);
        EntityList.lIIlIllIIllIlI[42] = (0xFFFFFD2F & 0x342FF7);
        EntityList.lIIlIllIIllIlI[43] = (-(0xFFFFF286 & 0x5DFB) & (0xFFFFDEFF & 0xA87F8F));
        EntityList.lIIlIllIIllIlI[44] = (44 + 135 - 169 + 153 ^ 71 + 11 - 4 + 108);
        EntityList.lIIlIllIIllIlI[45] = (0x1B ^ 0x2E);
        EntityList.lIIlIllIIllIlI[46] = (0x94 ^ 0x8E);
        EntityList.lIIlIllIIllIlI[47] = ("  ".length() ^ (0xD ^ 0x39));
        EntityList.lIIlIllIIllIlI[48] = (-(0xFFFFCE73 & 0x71DD) & (0xFFFFEFFF & 0xFFFF));
        EntityList.lIIlIllIIllIlI[49] = (-(0xFFFFFABB & 0x67DF) & (-1 & 0x79FEFF));
        EntityList.lIIlIllIIllIlI[50] = (0xD ^ 0x16);
        EntityList.lIIlIllIIllIlI[51] = (0x75 ^ 0x42);
        EntityList.lIIlIllIIllIlI[52] = (0xFFFFB3BE & 0x51EC7F);
        EntityList.lIIlIllIIllIlI[53] = (-(65 + 86 - 52 + 46) & (0xFFFFBFFE & 0x7EFFFF));
        EntityList.lIIlIllIIllIlI[54] = (0x0 ^ 0x2D ^ (0xBF ^ 0x8E));
        EntityList.lIIlIllIIllIlI[55] = (75 + 101 - 157 + 146 ^ 103 + 146 - 115 + 23);
        EntityList.lIIlIllIIllIlI[56] = (-(0x3C ^ 0x3B) & (0xFFFFFBFF & 0xF9FDFF));
        EntityList.lIIlIllIIllIlI[57] = (0xFFFFFCBF & 0xBCBFFC);
        EntityList.lIIlIllIIllIlI[58] = (0x90 ^ 0x8D);
        EntityList.lIIlIllIIllIlI[59] = (0x6 ^ 0x3F);
        EntityList.lIIlIllIIllIlI[60] = (0xFFFF9BF3 & 0xEAF79F);
        EntityList.lIIlIllIIllIlI[61] = (0xFFFFF97B & 0x4C77AD);
        EntityList.lIIlIllIIllIlI[62] = (0x4E ^ 0x74);
        EntityList.lIIlIllIIllIlI[63] = (-(0xFFFFDDFA & 0x632F) & (0xFFFFF7BF & 0x165F7F));
        EntityList.lIIlIllIIllIlI[64] = (0x43 ^ 0x51 ^ (0xBF ^ 0xB2));
        EntityList.lIIlIllIIllIlI[65] = (0x7B ^ 0x40);
        EntityList.lIIlIllIIllIlI[66] = (0xFFFFD2FE & 0xC6F4F);
        EntityList.lIIlIllIIllIlI[67] = (0x5A ^ 0x2 ^ (0xE3 ^ 0x9B));
        EntityList.lIIlIllIIllIlI[68] = (101 + 86 - 126 + 87 ^ 57 + 4 + 6 + 101);
        EntityList.lIIlIllIIllIlI[69] = (-(0xFFFFB67D & 0x5983) & (0xFFFFFEFF & 0x6E7F6E));
        EntityList.lIIlIllIIllIlI[70] = (0xFFFFB273 & 0x307DBC);
        EntityList.lIIlIllIIllIlI[71] = (147 + 72 - 201 + 207 ^ 124 + 15 - 34 + 87);
        EntityList.lIIlIllIIllIlI[72] = (10 + 144 - 98 + 98 ^ 112 + 92 - 73 + 36);
        EntityList.lIIlIllIIllIlI[73] = (0xFFFFF369 & 0xF6BE97);
        EntityList.lIIlIllIIllIlI[74] = (0xFFFFFDFF & 0xFFFA7E);
        EntityList.lIIlIllIIllIlI[75] = (0x4A ^ 0x68);
        EntityList.lIIlIllIIllIlI[76] = (0x3A ^ 0x4);
        EntityList.lIIlIllIIllIlI[77] = (-(0xFFFFDD9A & 0x6FFD) & (0xFFFFCFF7 & 0x347D9F));
        EntityList.lIIlIllIIllIlI[78] = (0xFFFFFCE5 & 0xFCFF1A);
        EntityList.lIIlIllIIllIlI[79] = (0x64 ^ 0x6 ^ (0xE0 ^ 0xA1));
        EntityList.lIIlIllIIllIlI[80] = (76 + 67 - 13 + 33 ^ 79 + 12 - 73 + 138);
        EntityList.lIIlIllIIllIlI[81] = (0x8A ^ 0xAE);
        EntityList.lIIlIllIIllIlI[82] = (0xD ^ 0x4D);
        EntityList.lIIlIllIIllIlI[83] = (0x28 ^ 0xD);
        EntityList.lIIlIllIIllIlI[84] = (0x47 ^ 0x6);
        EntityList.lIIlIllIIllIlI[85] = (-(0x5 ^ 0x4F) & (0xFFFFFEF9 & 0x4C3F7F));
        EntityList.lIIlIllIIllIlI[86] = (0xFFFF9FBF & 0xF6F4F);
        EntityList.lIIlIllIIllIlI[87] = (0xA5 ^ 0x83);
        EntityList.lIIlIllIIllIlI[88] = (0xDD ^ 0x9F);
        EntityList.lIIlIllIIllIlI[89] = (0x40 ^ 0x67);
        EntityList.lIIlIllIIllIlI[90] = ("   ".length() ^ (0x5C ^ 0x1C));
        EntityList.lIIlIllIIllIlI[91] = (0xED ^ 0xA9);
        EntityList.lIIlIllIIllIlI[92] = (-(0xFFFFBD87 & 0x6EFA) & (0xFFFFAEFF & 0x5AFFF3));
        EntityList.lIIlIllIIllIlI[93] = (-(0xFFFFEF74 & 0x12DB) & (0xFFFFFF7F & 0xF17FFF));
        EntityList.lIIlIllIIllIlI[94] = (0x1 ^ 0x5B);
        EntityList.lIIlIllIIllIlI[95] = (-(0xFFFFDC97 & 0x7B7A) & (0xFFFFFDF7 & 0xF0FFBB));
        EntityList.lIIlIllIIllIlI[96] = (0xFFFFE3FF & 0xDB7F5F);
        EntityList.lIIlIllIIllIlI[97] = (0x27 ^ 0x1B ^ (0x74 ^ 0x13));
        EntityList.lIIlIllIIllIlI[98] = (0xFFFFF7E7 & 0xE7EFFF);
        EntityList.lIIlIllIIllIlI[99] = (0xFFFFBFFF & 0xFFF5B5);
        EntityList.lIIlIllIIllIlI[100] = (0x1C ^ 0x0 ^ (0x4B ^ 0xB));
        EntityList.lIIlIllIIllIlI[101] = (-(0xFFFFF8FB & 0xFDD) & (0xFFFFBFFE & 0x447EFF));
        EntityList.lIIlIllIIllIlI[102] = (-(0xFFFFD6DD & 0x7F2F) & (0xFFFFFFEF & 0xA1F7BD));
        EntityList.lIIlIllIIllIlI[103] = (0x6F ^ 0x57 ^ (0xF2 ^ 0x97));
        EntityList.lIIlIllIIllIlI[104] = (0xFFFFD857 & 0xFF27A8);
        EntityList.lIIlIllIIllIlI[105] = (0x6E ^ 0x30);
        EntityList.lIIlIllIIllIlI[106] = (0xFFFFFFDF & 0x223B6D);
        EntityList.lIIlIllIIllIlI[107] = (-(0xFFFFB7F7 & 0x7D4F) & (0xFFFFFDFF & 0x70BFDF));
        EntityList.lIIlIllIIllIlI[108] = (0x7A ^ 0x25);
        EntityList.lIIlIllIIllIlI[109] = (0xFFFFDFDB & 0xD7F3F7);
        EntityList.lIIlIllIIllIlI[110] = (0xFFFFBF97 & 0xCEEFFE);
        EntityList.lIIlIllIIllIlI[111] = (26 + 237 - 35 + 21 ^ 41 + 90 - 7 + 29);
        EntityList.lIIlIllIIllIlI[112] = (-(0xFFFFFD7D & 0x52E6) & (0xFFFFDF73 & 0xA07FFF));
        EntityList.lIIlIllIIllIlI[113] = (-(0x8 ^ 0x1) & (0xFFFFF7FF & 0xB7BFBF));
        EntityList.lIIlIllIIllIlI[114] = (0x48 ^ 0x29);
        EntityList.lIIlIllIIllIlI[115] = (137 + 36 - 14 + 90 ^ 5 + 78 - 39 + 111);
        EntityList.lIIlIllIIllIlI[116] = (-(0xFFFFB5B7 & 0x6B4B) & (0xFFFFFF7F & 0xEFFFFF));
        EntityList.lIIlIllIIllIlI[117] = (-(0xFFFFF39D & 0x2E66) & (0xFFFFEFB7 & 0x56767F));
        EntityList.lIIlIllIIllIlI[118] = (0xFE ^ 0x9D);
        EntityList.lIIlIllIIllIlI[119] = (0x6B ^ 0xF);
        EntityList.lIIlIllIIllIlI[120] = (0xFFFF9F7F & 0xC0FEFD);
        EntityList.lIIlIllIIllIlI[121] = (-(0xFFFF9AEB & 0x7FDF) & (0xFFFFFFCB & 0xEEFFFE));
        EntityList.lIIlIllIIllIlI[122] = (0xD ^ 0x68);
        EntityList.lIIlIllIIllIlI[123] = (0xFFFFFFCD & 0x995F72);
        EntityList.lIIlIllIIllIlI[124] = (-(0xFFFFDEE9 & 0x35DF) & (0xFFFFFCFF & 0x735FF9));
        EntityList.lIIlIllIIllIlI[125] = (13 + 41 + 182 + 9 ^ 6 + 123 - 33 + 45);
        EntityList.lIIlIllIIllIlI[126] = (0xFFFFBD33 & 0x567EFF);
        EntityList.lIIlIllIIllIlI[127] = (0xFFFFDBFF & 0xBDAF72);
        EntityList.lIIlIllIIllIlI[128] = 92 + 129 - 119 + 98;
        EntityList.lIIlIllIIllIlI[129] = (-(0xFFFFDCEB & 0x7B3D) & (0xFFFFDC38 & 0x7FEF));
        EntityList.lIIlIllIIllIlI[130] = (154 + 77 - 217 + 218 ^ 165 + 146 - 142 + 4);
        EntityList.lIIlIllIIllIlI[131] = (0xB1 ^ 0xA8 ^ (0x5C ^ 0x3));
        EntityList.lIIlIllIIllIlI[132] = (0x61 ^ 0x73 ^ (0x14 ^ 0x41));
        EntityList.lIIlIllIIllIlI[133] = (0xD2 ^ 0x90 ^ (0xB9 ^ 0xB3));
    }
    
    public static int getEntityID(final Entity lllllllllllllIIllIIlIIlIlIlllIIl) {
        final Integer lllllllllllllIIllIIlIIlIlIlllIlI = EntityList.classToIDMapping.get(lllllllllllllIIllIIlIIlIlIlllIIl.getClass());
        int intValue;
        if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIlIlllIlI)) {
            intValue = EntityList.lIIlIllIIllIlI[0];
            "".length();
            if ((135 + 144 - 148 + 28 ^ 16 + 60 + 42 + 37) < 0) {
                return (83 + 142 - 78 + 55 ^ 167 + 111 - 113 + 29) & (0xDE ^ 0x8E ^ (0x40 ^ 0x18) ^ -" ".length());
            }
        }
        else {
            intValue = lllllllllllllIIllIIlIIlIlIlllIlI;
        }
        return intValue;
    }
    
    public static boolean isStringValidEntityName(final String lllllllllllllIIllIIlIIlIlIIlIIII) {
        if (llIlIIlIIlIIIll(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[132]].equals(lllllllllllllIIllIIlIIlIlIIlIIII) ? 1 : 0) && llIlIIlIIlIIIll(getEntityNameList().contains(lllllllllllllIIllIIlIIlIlIIlIIII) ? 1 : 0)) {
            return EntityList.lIIlIllIIllIlI[0] != 0;
        }
        return EntityList.lIIlIllIIllIlI[1] != 0;
    }
    
    private static void addMapping(final Class<? extends Entity> lllllllllllllIIllIIlIIlIlllIlllI, final String lllllllllllllIIllIIlIIlIlllIlIII, final int lllllllllllllIIllIIlIIlIlllIllII, final int lllllllllllllIIllIIlIIlIlllIlIll, final int lllllllllllllIIllIIlIIlIlllIIlIl) {
        addMapping(lllllllllllllIIllIIlIIlIlllIlllI, lllllllllllllIIllIIlIIlIlllIlIII, lllllllllllllIIllIIlIIlIlllIllII);
        EntityList.entityEggs.put(lllllllllllllIIllIIlIIlIlllIllII, new EntityEggInfo(lllllllllllllIIllIIlIIlIlllIllII, lllllllllllllIIllIIlIIlIlllIlIll, lllllllllllllIIllIIlIIlIlllIIlIl));
        "".length();
    }
    
    static {
        llIlIIlIIlIIIIl();
        llIlIIlIIIlIIll();
        logger = LogManager.getLogger();
        stringToClassMapping = Maps.newHashMap();
        classToStringMapping = Maps.newHashMap();
        idToClassMapping = Maps.newHashMap();
        classToIDMapping = Maps.newHashMap();
        stringToIDMapping = Maps.newHashMap();
        entityEggs = Maps.newLinkedHashMap();
        addMapping(EntityItem.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[0]], EntityList.lIIlIllIIllIlI[1]);
        addMapping(EntityXPOrb.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[1]], EntityList.lIIlIllIIllIlI[2]);
        addMapping(EntityEgg.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[2]], EntityList.lIIlIllIIllIlI[3]);
        addMapping(EntityLeashKnot.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[4]], EntityList.lIIlIllIIllIlI[5]);
        addMapping(EntityPainting.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[6]], EntityList.lIIlIllIIllIlI[7]);
        addMapping(EntityArrow.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[8]], EntityList.lIIlIllIIllIlI[9]);
        addMapping(EntitySnowball.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[10]], EntityList.lIIlIllIIllIlI[11]);
        addMapping(EntityLargeFireball.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[3]], EntityList.lIIlIllIIllIlI[12]);
        addMapping(EntitySmallFireball.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[5]], EntityList.lIIlIllIIllIlI[13]);
        addMapping(EntityEnderPearl.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[7]], EntityList.lIIlIllIIllIlI[14]);
        addMapping(EntityEnderEye.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[9]], EntityList.lIIlIllIIllIlI[15]);
        addMapping(EntityPotion.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[11]], EntityList.lIIlIllIIllIlI[16]);
        addMapping(EntityExpBottle.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[12]], EntityList.lIIlIllIIllIlI[17]);
        addMapping(EntityItemFrame.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[13]], EntityList.lIIlIllIIllIlI[18]);
        addMapping(EntityWitherSkull.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[14]], EntityList.lIIlIllIIllIlI[19]);
        addMapping(EntityTNTPrimed.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[15]], EntityList.lIIlIllIIllIlI[20]);
        addMapping(EntityFallingBlock.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[16]], EntityList.lIIlIllIIllIlI[21]);
        addMapping(EntityFireworkRocket.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[17]], EntityList.lIIlIllIIllIlI[22]);
        addMapping(EntityArmorStand.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[18]], EntityList.lIIlIllIIllIlI[23]);
        addMapping(EntityBoat.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[19]], EntityList.lIIlIllIIllIlI[24]);
        addMapping(EntityMinecartEmpty.class, EntityMinecart.EnumMinecartType.RIDEABLE.getName(), EntityList.lIIlIllIIllIlI[25]);
        addMapping(EntityMinecartChest.class, EntityMinecart.EnumMinecartType.CHEST.getName(), EntityList.lIIlIllIIllIlI[26]);
        addMapping(EntityMinecartFurnace.class, EntityMinecart.EnumMinecartType.FURNACE.getName(), EntityList.lIIlIllIIllIlI[27]);
        addMapping(EntityMinecartTNT.class, EntityMinecart.EnumMinecartType.TNT.getName(), EntityList.lIIlIllIIllIlI[28]);
        addMapping(EntityMinecartHopper.class, EntityMinecart.EnumMinecartType.HOPPER.getName(), EntityList.lIIlIllIIllIlI[29]);
        addMapping(EntityMinecartMobSpawner.class, EntityMinecart.EnumMinecartType.SPAWNER.getName(), EntityList.lIIlIllIIllIlI[30]);
        addMapping(EntityMinecartCommandBlock.class, EntityMinecart.EnumMinecartType.COMMAND_BLOCK.getName(), EntityList.lIIlIllIIllIlI[31]);
        addMapping(EntityLiving.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[20]], EntityList.lIIlIllIIllIlI[32]);
        addMapping(EntityMob.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[21]], EntityList.lIIlIllIIllIlI[33]);
        addMapping(EntityCreeper.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[22]], EntityList.lIIlIllIIllIlI[34], EntityList.lIIlIllIIllIlI[35], EntityList.lIIlIllIIllIlI[0]);
        addMapping(EntitySkeleton.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[36]], EntityList.lIIlIllIIllIlI[37], EntityList.lIIlIllIIllIlI[38], EntityList.lIIlIllIIllIlI[39]);
        addMapping(EntitySpider.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[40]], EntityList.lIIlIllIIllIlI[41], EntityList.lIIlIllIIllIlI[42], EntityList.lIIlIllIIllIlI[43]);
        addMapping(EntityGiantZombie.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[44]], EntityList.lIIlIllIIllIlI[45]);
        addMapping(EntityZombie.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[46]], EntityList.lIIlIllIIllIlI[47], EntityList.lIIlIllIIllIlI[48], EntityList.lIIlIllIIllIlI[49]);
        addMapping(EntitySlime.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[50]], EntityList.lIIlIllIIllIlI[51], EntityList.lIIlIllIIllIlI[52], EntityList.lIIlIllIIllIlI[53]);
        addMapping(EntityGhast.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[54]], EntityList.lIIlIllIIllIlI[55], EntityList.lIIlIllIIllIlI[56], EntityList.lIIlIllIIllIlI[57]);
        addMapping(EntityPigZombie.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[58]], EntityList.lIIlIllIIllIlI[59], EntityList.lIIlIllIIllIlI[60], EntityList.lIIlIllIIllIlI[61]);
        addMapping(EntityEnderman.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[23]], EntityList.lIIlIllIIllIlI[62], EntityList.lIIlIllIIllIlI[63], EntityList.lIIlIllIIllIlI[0]);
        addMapping(EntityCaveSpider.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[64]], EntityList.lIIlIllIIllIlI[65], EntityList.lIIlIllIIllIlI[66], EntityList.lIIlIllIIllIlI[43]);
        addMapping(EntitySilverfish.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[67]], EntityList.lIIlIllIIllIlI[68], EntityList.lIIlIllIIllIlI[69], EntityList.lIIlIllIIllIlI[70]);
        addMapping(EntityBlaze.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[71]], EntityList.lIIlIllIIllIlI[72], EntityList.lIIlIllIIllIlI[73], EntityList.lIIlIllIIllIlI[74]);
        addMapping(EntityMagmaCube.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[75]], EntityList.lIIlIllIIllIlI[76], EntityList.lIIlIllIIllIlI[77], EntityList.lIIlIllIIllIlI[78]);
        addMapping(EntityDragon.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[79]], EntityList.lIIlIllIIllIlI[80]);
        addMapping(EntityWither.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[81]], EntityList.lIIlIllIIllIlI[82]);
        addMapping(EntityBat.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[83]], EntityList.lIIlIllIIllIlI[84], EntityList.lIIlIllIIllIlI[85], EntityList.lIIlIllIIllIlI[86]);
        addMapping(EntityWitch.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[87]], EntityList.lIIlIllIIllIlI[88], EntityList.lIIlIllIIllIlI[77], EntityList.lIIlIllIIllIlI[52]);
        addMapping(EntityEndermite.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[89]], EntityList.lIIlIllIIllIlI[90], EntityList.lIIlIllIIllIlI[63], EntityList.lIIlIllIIllIlI[69]);
        addMapping(EntityGuardian.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[31]], EntityList.lIIlIllIIllIlI[91], EntityList.lIIlIllIIllIlI[92], EntityList.lIIlIllIIllIlI[93]);
        addMapping(EntityPig.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[24]], EntityList.lIIlIllIIllIlI[94], EntityList.lIIlIllIIllIlI[95], EntityList.lIIlIllIIllIlI[96]);
        addMapping(EntitySheep.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[25]], EntityList.lIIlIllIIllIlI[97], EntityList.lIIlIllIIllIlI[98], EntityList.lIIlIllIIllIlI[99]);
        addMapping(EntityCow.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[26]], EntityList.lIIlIllIIllIlI[100], EntityList.lIIlIllIIllIlI[101], EntityList.lIIlIllIIllIlI[102]);
        addMapping(EntityChicken.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[27]], EntityList.lIIlIllIIllIlI[103], EntityList.lIIlIllIIllIlI[102], EntityList.lIIlIllIIllIlI[104]);
        addMapping(EntitySquid.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[28]], EntityList.lIIlIllIIllIlI[105], EntityList.lIIlIllIIllIlI[106], EntityList.lIIlIllIIllIlI[107]);
        addMapping(EntityWolf.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[29]], EntityList.lIIlIllIIllIlI[108], EntityList.lIIlIllIIllIlI[109], EntityList.lIIlIllIIllIlI[110]);
        addMapping(EntityMooshroom.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[30]], EntityList.lIIlIllIIllIlI[111], EntityList.lIIlIllIIllIlI[112], EntityList.lIIlIllIIllIlI[113]);
        addMapping(EntitySnowman.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[32]], EntityList.lIIlIllIIllIlI[114]);
        addMapping(EntityOcelot.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[33]], EntityList.lIIlIllIIllIlI[115], EntityList.lIIlIllIIllIlI[116], EntityList.lIIlIllIIllIlI[117]);
        addMapping(EntityIronGolem.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[34]], EntityList.lIIlIllIIllIlI[118]);
        addMapping(EntityHorse.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[37]], EntityList.lIIlIllIIllIlI[119], EntityList.lIIlIllIIllIlI[120], EntityList.lIIlIllIIllIlI[121]);
        addMapping(EntityRabbit.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[41]], EntityList.lIIlIllIIllIlI[122], EntityList.lIIlIllIIllIlI[123], EntityList.lIIlIllIIllIlI[124]);
        addMapping(EntityVillager.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[45]], EntityList.lIIlIllIIllIlI[125], EntityList.lIIlIllIIllIlI[126], EntityList.lIIlIllIIllIlI[127]);
        addMapping(EntityEnderCrystal.class, EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[47]], EntityList.lIIlIllIIllIlI[128]);
    }
    
    public static Entity createEntityByID(final int lllllllllllllIIllIIlIIlIllIIIIIl, final World lllllllllllllIIllIIlIIlIllIIIlIl) {
        Entity lllllllllllllIIllIIlIIlIllIIIlII = null;
        try {
            final Class<? extends Entity> lllllllllllllIIllIIlIIlIllIIIIll = getClassFromID(lllllllllllllIIllIIlIIlIllIIIIIl);
            if (llIlIIlIIlIIlIl(lllllllllllllIIllIIlIIlIllIIIIll)) {
                final Class<? extends Entity> clazz = lllllllllllllIIllIIlIIlIllIIIIll;
                final Class[] parameterTypes = new Class[EntityList.lIIlIllIIllIlI[1]];
                parameterTypes[EntityList.lIIlIllIIllIlI[0]] = World.class;
                final Constructor<? extends Entity> constructor = clazz.getConstructor((Class<?>[])parameterTypes);
                final Object[] initargs = new Object[EntityList.lIIlIllIIllIlI[1]];
                initargs[EntityList.lIIlIllIIllIlI[0]] = lllllllllllllIIllIIlIIlIllIIIlIl;
                lllllllllllllIIllIIlIIlIllIIIlII = (Entity)constructor.newInstance(initargs);
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            }
        }
        catch (Exception lllllllllllllIIllIIlIIlIllIIIIlI) {
            lllllllllllllIIllIIlIIlIllIIIIlI.printStackTrace();
        }
        if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIllIIIlII)) {
            EntityList.logger.warn(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[90]]).append(lllllllllllllIIllIIlIIlIllIIIIIl)));
        }
        return lllllllllllllIIllIIlIIlIllIIIlII;
    }
    
    public static Entity createEntityByName(final String lllllllllllllIIllIIlIIlIllIllIll, final World lllllllllllllIIllIIlIIlIllIllIlI) {
        Entity lllllllllllllIIllIIlIIlIllIllllI = null;
        try {
            final Class<? extends Entity> lllllllllllllIIllIIlIIlIllIlllIl = EntityList.stringToClassMapping.get(lllllllllllllIIllIIlIIlIllIllIll);
            if (llIlIIlIIlIIlIl(lllllllllllllIIllIIlIIlIllIlllIl)) {
                final Class<? extends Entity> clazz = lllllllllllllIIllIIlIIlIllIlllIl;
                final Class[] parameterTypes = new Class[EntityList.lIIlIllIIllIlI[1]];
                parameterTypes[EntityList.lIIlIllIIllIlI[0]] = World.class;
                final Constructor<? extends Entity> constructor = clazz.getConstructor((Class<?>[])parameterTypes);
                final Object[] initargs = new Object[EntityList.lIIlIllIIllIlI[1]];
                initargs[EntityList.lIIlIllIIllIlI[0]] = lllllllllllllIIllIIlIIlIllIllIlI;
                lllllllllllllIIllIIlIIlIllIllllI = (Entity)constructor.newInstance(initargs);
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
        }
        catch (Exception lllllllllllllIIllIIlIIlIllIlllII) {
            lllllllllllllIIllIIlIIlIllIlllII.printStackTrace();
        }
        return lllllllllllllIIllIIlIIlIllIllllI;
    }
    
    private static boolean llIlIIlIIlIIIlI(final int lllllllllllllIIllIIlIIlIIlIlIIll) {
        return lllllllllllllIIllIIlIIlIIlIlIIll != 0;
    }
    
    private static void llIlIIlIIIlIIll() {
        (lIIlIllIIIlllI = new String[EntityList.lIIlIllIIllIlI[133]])[EntityList.lIIlIllIIllIlI[0]] = llIlIIIllllIIII("/7f3G3QBc+M=", "nyFsu");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[1]] = llIlIIIllllIIIl("LTMVIiM=", "ucZPA");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[2]] = llIlIIIllllIIlI("EyLJdzaWqc9KMKNj9/dSyg==", "ngHGE");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[4]] = llIlIIIllllIIIl("CwYNAwMMDQME", "Gclpk");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[6]] = llIlIIIllllIIlI("5oQL3CbsHdfzXplM+d7BdQ==", "YNoNB");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[8]] = llIlIIIllllIIII("Er2svoJr4u4=", "udvDX");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[10]] = llIlIIIllllIIlI("OXpnwKd08vZmXXxjSKmw5w==", "tajBF");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[3]] = llIlIIIllllIIlI("IhgiPswvsUthtyFHbgqZ+w==", "UHjhf");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[5]] = llIlIIIllllIIIl("Cx0lLgEeGTYnDzkcKA==", "XpDBm");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[7]] = llIlIIIllllIIlI("UxYG0lqm85vDJrquArwjIQyS2neiR5Kt", "HJnPI");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[9]] = llIlIIIllllIIIl("DggpCiAOHyggNBgYKysnJw==", "KqLEF");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[11]] = llIlIIIllllIIII("NJNEKkiyPAaFoytvLal5xA==", "WEInc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[12]] = llIlIIIllllIIII("4wkUzi50ubqBs34iVh325w==", "dBbgx");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[13]] = llIlIIIllllIIlI("Y11kFHm6DQ/sZF8qhoMWCg==", "MtkKs");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[14]] = llIlIIIllllIIII("KddrZZbSotvjO30edebFJQ==", "gtahJ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[15]] = llIlIIIllllIIlI("u0ZLCxMSVphegk7ULXUkIQ==", "wsOMc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[16]] = llIlIIIllllIIlI("i11mlwy2ouYHGC/gxtpUpA==", "ZUiGH");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[17]] = llIlIIIllllIIII("psRbG7WrnewqFLyAYFbkxvnbxJDrrhj0", "emJgY");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[18]] = llIlIIIllllIIII("/jErjW6nSDKyc+Eh43dnDQ==", "hiMfR");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[19]] = llIlIIIllllIIlI("w5x8Knkshqk=", "VEGJm");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[20]] = llIlIIIllllIIIl("FSIm", "XMDiD");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[21]] = llIlIIIllllIIII("xhvdr0yh7bc=", "eZhxc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[22]] = llIlIIIllllIIII("fDKZ4+Y0CeQ=", "SpeoY");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[36]] = llIlIIIllllIIlI("tDZRbEYaJJNMOALyu9Uhxw==", "OqoVu");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[40]] = llIlIIIllllIIII("wp/GfDtiKQo=", "AmvXg");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[44]] = llIlIIIllllIIII("V9YYjiYkNKA=", "BTcNO");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[46]] = llIlIIIllllIIIl("KD0YEgoX", "rRupc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[50]] = llIlIIIllllIIII("2I/wmoomapo=", "PrCOU");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[54]] = llIlIIIllllIIII("1ZUlU9j4VcE=", "xoJzc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[58]] = llIlIIIllllIIIl("OQgPNzUEAwEI", "iahmZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[23]] = llIlIIIllllIIlI("M3426Yg7FWxSNYiDuQBHTg==", "xJYep");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[64]] = llIlIIIllllIIIl("FxUSKwckHQArJg==", "TtdNT");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[67]] = llIlIIIllllIIII("PLkInMEaqj44eNBsWvLGWA==", "LbYJy");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[71]] = llIlIIIllllIIlI("rI5xgCHHIPA=", "pGgTU");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[75]] = llIlIIIllllIIIl("Jgs+OSkGAyU9", "jjHXz");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[79]] = llIlIIIllllIIII("ck9anBuT8k3wF38ZUx+FRQ==", "EXrks");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[81]] = llIlIIIllllIIII("c97MIZRyvVbXs/Vv6jw19Q==", "eeCSZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[83]] = llIlIIIllllIIIl("LSg7", "oIOUf");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[87]] = llIlIIIllllIIII("Bymihs6CXow=", "BExRE");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[89]] = llIlIIIllllIIlI("nW8GBI0cwyhBy2s3qy1y3A==", "DfDwZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[31]] = llIlIIIllllIIII("Ban5wgRh941R7TUUlfYZjw==", "TrHag");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[24]] = llIlIIIllllIIIl("KAoq", "xcMLT");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[25]] = llIlIIIllllIIlI("/8UfmPtsT44=", "LZxvB");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[26]] = llIlIIIllllIIlI("3sbTjCIT/R4=", "bUnDK");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[27]] = llIlIIIllllIIIl("AiQxMTEkIg==", "ALXRZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[28]] = llIlIIIllllIIII("2EKrMmca2Tw=", "YdGlw");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[29]] = llIlIIIllllIIII("n9Q2kh7mOJc=", "lsnPz");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[30]] = llIlIIIllllIIlI("I039IsxdycdmCIYD3YTxYA==", "onZVo");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[32]] = llIlIIIllllIIIl("BAsDPTc2Cw==", "WelJz");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[33]] = llIlIIIllllIIIl("OQItGxsC", "vxHwt");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[34]] = llIlIIIllllIIII("LZTLX1xOUVVuJn6fCVvk4w==", "ofzoX");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[37]] = llIlIIIllllIIlI("iK/7irww9OT54rKlJ5UwQQ==", "IMXqz");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[41]] = llIlIIIllllIIIl("BxIhNSQh", "UsCWM");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[45]] = llIlIIIllllIIIl("OS4+LQIIIiA=", "oGRAc");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[47]] = llIlIIIllllIIII("3fdYR4jdOEl/rReo2kfg0g==", "CBrdA");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[51]] = llIlIIIllllIIlI("BtqcSfzjxDhBAR+zR1pkBWMjlZKDc2zuhyV3VAAqxJ0=", "ggKvZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[55]] = llIlIIIllllIIlI("EwcQtesY4lzfFnCOWOG4y4DB7NlwfWV9FOGS7xRRRxs=", "reTgW");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[59]] = llIlIIIllllIIlI("Obt923RvBQ0yRdSsN6RgKgS1sm3dRbbdd8Wy9/6ikiYFjOrgpQu9jw==", "CGjMd");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[62]] = llIlIIIllllIIII("Ynfe+FEojmWcGfU6b60yhHhbuOsk3tL20zbQguyy9g6Dw1txS49PpQ==", "SSkuL");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[65]] = llIlIIIllllIIlI("uxlFhCLypooouSLzzQoJTg==", "PAZJt");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[68]] = llIlIIIllllIIII("R/DMwVbSi8k=", "mqlLX");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[72]] = llIlIIIllllIIlI("K/st/L1Rwx0=", "xkdfO");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[76]] = llIlIIIllllIIlI("cgomMwnHCUE=", "BgdGV");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[80]] = llIlIIIllllIIII("dQUpFkkVibY=", "ZCjXW");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[82]] = llIlIIIllllIIlI("JHA9IrN0Suo=", "NbBnz");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[84]] = llIlIIIllllIIIl("IjoxPDsYPz9sDh8lMTgyUSYxOCNRODxs", "qQXLK");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[88]] = llIlIIIllllIIlI("XKs1/2ehX28=", "irNHh");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[90]] = llIlIIIllllIIlI("kiL85HNYmgzH8hKKb1x2socWYUoXAOnpjx1+X5dCSKg=", "SRoVZ");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[91]] = llIlIIIllllIIII("7JT8alNABzSl3sPadxrFRA==", "MAFCB");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[130]] = llIlIIIllllIIlI("crZu+FOF9ZI=", "bqhuD");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[131]] = llIlIIIllllIIIl("AD0UOTEiPR02ByM4Bw==", "LTsQE");
        EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[132]] = llIlIIIllllIIII("cRv4NIu4RXc=", "LusWA");
    }
    
    private static boolean llIlIIlIIlIIllI(final int lllllllllllllIIllIIlIIlIIlIIlllI, final int lllllllllllllIIllIIlIIlIIlIIllIl) {
        return lllllllllllllIIllIIlIIlIIlIIlllI != lllllllllllllIIllIIlIIlIIlIIllIl;
    }
    
    public static void func_151514_a() {
    }
    
    public static Entity createEntityFromNBT(final NBTTagCompound lllllllllllllIIllIIlIIlIllIlIIll, final World lllllllllllllIIllIIlIIlIllIlIIlI) {
        Entity lllllllllllllIIllIIlIIlIllIlIIIl = null;
        if (llIlIIlIIlIIIlI(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[65]].equals(lllllllllllllIIllIIlIIlIllIlIIll.getString(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[68]])) ? 1 : 0)) {
            lllllllllllllIIllIIlIIlIllIlIIll.setString(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[72]], EntityMinecart.EnumMinecartType.byNetworkID(lllllllllllllIIllIIlIIlIllIlIIll.getInteger(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[76]])).getName());
            lllllllllllllIIllIIlIIlIllIlIIll.removeTag(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[80]]);
        }
        try {
            final Class<? extends Entity> lllllllllllllIIllIIlIIlIllIlIIII = EntityList.stringToClassMapping.get(lllllllllllllIIllIIlIIlIllIlIIll.getString(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[82]]));
            if (llIlIIlIIlIIlIl(lllllllllllllIIllIIlIIlIllIlIIII)) {
                final Class<? extends Entity> clazz = lllllllllllllIIllIIlIIlIllIlIIII;
                final Class[] parameterTypes = new Class[EntityList.lIIlIllIIllIlI[1]];
                parameterTypes[EntityList.lIIlIllIIllIlI[0]] = World.class;
                final Constructor<? extends Entity> constructor = clazz.getConstructor((Class<?>[])parameterTypes);
                final Object[] initargs = new Object[EntityList.lIIlIllIIllIlI[1]];
                initargs[EntityList.lIIlIllIIllIlI[0]] = lllllllllllllIIllIIlIIlIllIlIIlI;
                lllllllllllllIIllIIlIIlIllIlIIIl = (Entity)constructor.newInstance(initargs);
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        catch (Exception lllllllllllllIIllIIlIIlIllIIllll) {
            lllllllllllllIIllIIlIIlIllIIllll.printStackTrace();
        }
        if (llIlIIlIIlIIlIl(lllllllllllllIIllIIlIIlIllIlIIIl)) {
            lllllllllllllIIllIIlIIlIllIlIIIl.readFromNBT(lllllllllllllIIllIIlIIlIllIlIIll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            EntityList.logger.warn(String.valueOf(new StringBuilder(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[84]]).append(lllllllllllllIIllIIlIIlIllIlIIll.getString(EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[88]]))));
        }
        return lllllllllllllIIllIIlIIlIllIlIIIl;
    }
    
    private static boolean llIlIIlIIlIIlIl(final Object lllllllllllllIIllIIlIIlIIlIlIlll) {
        return lllllllllllllIIllIIlIIlIIlIlIlll != null;
    }
    
    private static String llIlIIIllllIIlI(final String lllllllllllllIIllIIlIIlIIllllIlI, final String lllllllllllllIIllIIlIIlIIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIlIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIIlIIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIIlIIlllllII.init(EntityList.lIIlIllIIllIlI[2], lllllllllllllIIllIIlIIlIIlllllIl);
            return new String(lllllllllllllIIllIIlIIlIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIlIIllllIll) {
            lllllllllllllIIllIIlIIlIIllllIll.printStackTrace();
            return null;
        }
    }
    
    public static Class<? extends Entity> getClassFromID(final int lllllllllllllIIllIIlIIlIlIllIllI) {
        return EntityList.idToClassMapping.get(lllllllllllllIIllIIlIIlIlIllIllI);
    }
    
    public static int getIDFromString(final String lllllllllllllIIllIIlIIlIlIlIllll) {
        final Integer lllllllllllllIIllIIlIIlIlIlIlllI = EntityList.stringToIDMapping.get(lllllllllllllIIllIIlIIlIlIlIllll);
        int intValue;
        if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIlIlIlllI)) {
            intValue = EntityList.lIIlIllIIllIlI[94];
            "".length();
            if (" ".length() > (0x16 ^ 0xA ^ (0x58 ^ 0x40))) {
                return (0x6C ^ 0x4E ^ (0xBC ^ 0x89)) & (0x60 ^ 0x4D ^ (0x40 ^ 0x7A) ^ -" ".length());
            }
        }
        else {
            intValue = lllllllllllllIIllIIlIIlIlIlIlllI;
        }
        return intValue;
    }
    
    private static boolean llIlIIlIIlIIIll(final int lllllllllllllIIllIIlIIlIIlIlIIIl) {
        return lllllllllllllIIllIIlIIlIIlIlIIIl == 0;
    }
    
    private static boolean llIlIIlIIlIIlII(final Object lllllllllllllIIllIIlIIlIIlIlIlIl) {
        return lllllllllllllIIllIIlIIlIIlIlIlIl == null;
    }
    
    public static boolean isStringEntityName(final Entity lllllllllllllIIllIIlIIlIlIIlIlll, final String lllllllllllllIIllIIlIIlIlIIlIIll) {
        String lllllllllllllIIllIIlIIlIlIIlIlIl = getEntityString(lllllllllllllIIllIIlIIlIlIIlIlll);
        if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIlIIlIlIl) && llIlIIlIIlIIIlI((lllllllllllllIIllIIlIIlIlIIlIlll instanceof EntityPlayer) ? 1 : 0)) {
            lllllllllllllIIllIIlIIlIlIIlIlIl = EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[130]];
            "".length();
            if (((0xE5 ^ 0x8E ^ (0xAA ^ 0x94)) & (9 + 36 + 81 + 18 ^ 37 + 194 - 228 + 194 ^ -" ".length())) == "   ".length()) {
                return ((85 + 11 + 103 + 40 ^ 88 + 140 - 172 + 114) & (195 + 6 - 189 + 193 ^ 113 + 35 - 47 + 35 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlIIlIIlIIlII(lllllllllllllIIllIIlIIlIlIIlIlIl) && llIlIIlIIlIIIlI((lllllllllllllIIllIIlIIlIlIIlIlll instanceof EntityLightningBolt) ? 1 : 0)) {
            lllllllllllllIIllIIlIIlIlIIlIlIl = EntityList.lIIlIllIIIlllI[EntityList.lIIlIllIIllIlI[131]];
        }
        return lllllllllllllIIllIIlIIlIlIIlIIll.equals(lllllllllllllIIllIIlIIlIlIIlIlIl);
    }
    
    private static String llIlIIIllllIIIl(String lllllllllllllIIllIIlIIlIIllIIlIl, final String lllllllllllllIIllIIlIIlIIllIIlII) {
        lllllllllllllIIllIIlIIlIIllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIIlIIllIlIII = new StringBuilder();
        final char[] lllllllllllllIIllIIlIIlIIllIIlll = lllllllllllllIIllIIlIIlIIllIIlII.toCharArray();
        int lllllllllllllIIllIIlIIlIIllIIllI = EntityList.lIIlIllIIllIlI[0];
        final int lllllllllllllIIllIIlIIlIIllIIIII = (Object)lllllllllllllIIllIIlIIlIIllIIlIl.toCharArray();
        final float lllllllllllllIIllIIlIIlIIlIlllll = lllllllllllllIIllIIlIIlIIllIIIII.length;
        float lllllllllllllIIllIIlIIlIIlIllllI = EntityList.lIIlIllIIllIlI[0];
        while (llIlIIlIIlIlIIl((int)lllllllllllllIIllIIlIIlIIlIllllI, (int)lllllllllllllIIllIIlIIlIIlIlllll)) {
            final char lllllllllllllIIllIIlIIlIIllIlIll = lllllllllllllIIllIIlIIlIIllIIIII[lllllllllllllIIllIIlIIlIIlIllllI];
            lllllllllllllIIllIIlIIlIIllIlIII.append((char)(lllllllllllllIIllIIlIIlIIllIlIll ^ lllllllllllllIIllIIlIIlIIllIIlll[lllllllllllllIIllIIlIIlIIllIIllI % lllllllllllllIIllIIlIIlIIllIIlll.length]));
            "".length();
            ++lllllllllllllIIllIIlIIlIIllIIllI;
            ++lllllllllllllIIllIIlIIlIIlIllllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIIlIIllIlIII);
    }
    
    public static class EntityEggInfo
    {
        public final /* synthetic */ int primaryColor;
        public final /* synthetic */ int spawnedID;
        public final /* synthetic */ int secondaryColor;
        public final /* synthetic */ StatBase field_151512_d;
        public final /* synthetic */ StatBase field_151513_e;
        
        public EntityEggInfo(final int llllllllllllIllIllIlIllIIIllIIll, final int llllllllllllIllIllIlIllIIIllIIlI, final int llllllllllllIllIllIlIllIIIlIllIl) {
            this.spawnedID = llllllllllllIllIllIlIllIIIllIIll;
            this.primaryColor = llllllllllllIllIllIlIllIIIllIIlI;
            this.secondaryColor = llllllllllllIllIllIlIllIIIlIllIl;
            this.field_151512_d = StatList.getStatKillEntity(this);
            this.field_151513_e = StatList.getStatEntityKilledBy(this);
        }
    }
}
