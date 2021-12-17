// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import java.util.Iterator;
import java.util.Set;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.CraftingManager;
import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.entity.EntityList;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import java.util.List;

public class StatList
{
    public static final /* synthetic */ StatBase[] objectUseStats;
    public static final /* synthetic */ StatBase[] objectCraftStats;
    public static /* synthetic */ StatBase field_181723_aa;
    public static /* synthetic */ StatBase treasureFishedStat;
    public static /* synthetic */ StatBase timesTalkedToVillagerStat;
    public static /* synthetic */ StatBase jumpStat;
    public static /* synthetic */ StatBase distanceByHorseStat;
    public static /* synthetic */ StatBase deathsStat;
    public static /* synthetic */ StatBase distanceByPigStat;
    public static /* synthetic */ StatBase fishCaughtStat;
    public static /* synthetic */ List<StatBase> generalStats;
    public static /* synthetic */ StatBase distanceWalkedStat;
    public static /* synthetic */ StatBase field_181735_S;
    public static /* synthetic */ StatBase playerKillsStat;
    public static /* synthetic */ StatBase distanceSprintedStat;
    public static /* synthetic */ StatBase damageDealtStat;
    public static /* synthetic */ StatBase leaveGameStat;
    public static /* synthetic */ StatBase minutesPlayedStat;
    public static /* synthetic */ StatBase field_181730_N;
    public static /* synthetic */ StatBase field_181727_K;
    protected static /* synthetic */ Map<String, StatBase> oneShotStats;
    public static /* synthetic */ StatBase distanceByMinecartStat;
    public static /* synthetic */ StatBase distanceCrouchedStat;
    public static /* synthetic */ List<StatBase> allStats;
    public static /* synthetic */ StatBase field_181728_L;
    private static final /* synthetic */ String[] lIlllllIlIIIII;
    public static /* synthetic */ StatBase field_181731_O;
    public static final /* synthetic */ StatBase[] objectBreakStats;
    public static /* synthetic */ List<StatCrafting> itemStats;
    public static /* synthetic */ StatBase field_181724_H;
    public static /* synthetic */ StatBase distanceFlownStat;
    public static /* synthetic */ StatBase distanceDoveStat;
    public static /* synthetic */ StatBase field_181733_Q;
    public static /* synthetic */ StatBase field_181725_I;
    public static /* synthetic */ StatBase field_181729_M;
    public static /* synthetic */ StatBase junkFishedStat;
    public static /* synthetic */ StatBase damageTakenStat;
    public static /* synthetic */ StatBase field_181726_J;
    public static /* synthetic */ StatBase mobKillsStat;
    public static /* synthetic */ StatBase field_181737_U;
    public static /* synthetic */ StatBase field_181732_P;
    public static /* synthetic */ StatBase animalsBredStat;
    public static /* synthetic */ StatBase distanceFallenStat;
    public static /* synthetic */ StatBase distanceByBoatStat;
    public static /* synthetic */ StatBase dropStat;
    public static /* synthetic */ StatBase field_181740_X;
    public static /* synthetic */ StatBase timesTradedWithVillagerStat;
    public static /* synthetic */ StatBase field_181736_T;
    public static /* synthetic */ StatBase distanceClimbedStat;
    public static /* synthetic */ List<StatCrafting> objectMineStats;
    private static final /* synthetic */ int[] lIlllllIlIlIll;
    public static /* synthetic */ StatBase timeSinceDeathStat;
    public static /* synthetic */ StatBase field_181742_Z;
    public static /* synthetic */ StatBase field_181738_V;
    public static /* synthetic */ StatBase distanceSwumStat;
    public static final /* synthetic */ StatBase[] mineBlockStatArray;
    public static /* synthetic */ StatBase field_181734_R;
    public static /* synthetic */ StatBase field_181739_W;
    public static /* synthetic */ StatBase field_181741_Y;
    
    private static boolean lIIIIlIlIlllllIl(final Object llllllllllllIllllIIllIIIlIlIllll) {
        return llllllllllllIllllIIllIIIlIlIllll == null;
    }
    
    private static String lIIIIlIlIlIlllll(final String llllllllllllIllllIIllIIIlIllllII, final String llllllllllllIllllIIllIIIlIlllIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIllIIIlIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIllIIIlIlllllI.init(StatList.lIlllllIlIlIll[2], llllllllllllIllllIIllIIIlIllllll);
            return new String(llllllllllllIllllIIllIIIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIIlIllllIl) {
            llllllllllllIllllIIllIIIlIllllIl.printStackTrace();
            return null;
        }
    }
    
    private static void initStats() {
        final float llllllllllllIllllIIllIIlIIIlllIl = (float)Item.itemRegistry.iterator();
        "".length();
        if ("   ".length() >= (0x8 ^ 0x38 ^ (0x1E ^ 0x2A))) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIIlllIl).hasNext() ? 1 : 0)) {
            final Item llllllllllllIllllIIllIIlIIlIIIIl = ((Iterator<Item>)llllllllllllIllllIIllIIlIIIlllIl).next();
            if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIlIIIIl)) {
                final int llllllllllllIllllIIllIIlIIlIIIII = Item.getIdFromItem(llllllllllllIllllIIllIIlIIlIIIIl);
                final String llllllllllllIllllIIllIIlIIIlllll = func_180204_a(llllllllllllIllllIIllIIlIIlIIIIl);
                if (!lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIIlllll)) {
                    continue;
                }
                final StatBase[] objectUseStats = StatList.objectUseStats;
                final int n = llllllllllllIllllIIllIIlIIlIIIII;
                final String lllllllllllllIIIlIllIlIIllllIIIl = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[102]];
                final String lllllllllllllIIIlIllIlIIllllIIII = llllllllllllIllllIIllIIlIIIlllll;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[103]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ItemStack(llllllllllllIllllIIllIIlIIlIIIIl).getChatComponent();
                objectUseStats[n] = new StatCrafting(lllllllllllllIIIlIllIlIIllllIIIl, lllllllllllllIIIlIllIlIIllllIIII, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl), llllllllllllIllllIIllIIlIIlIIIIl).registerStat();
                if (!lIIIIlIlIllllIll((llllllllllllIllllIIllIIlIIlIIIIl instanceof ItemBlock) ? 1 : 0)) {
                    continue;
                }
                StatList.itemStats.add((StatCrafting)StatList.objectUseStats[llllllllllllIllllIIllIIlIIlIIIII]);
                "".length();
            }
        }
        replaceAllSimilarBlocks(StatList.objectUseStats);
    }
    
    private static String lIIIIlIlIllIIIIl(String llllllllllllIllllIIllIIIllIllIIl, final String llllllllllllIllllIIllIIIllIlllIl) {
        llllllllllllIllllIIllIIIllIllIIl = new String(Base64.getDecoder().decode(llllllllllllIllllIIllIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIllIIIllIlllII = new StringBuilder();
        final char[] llllllllllllIllllIIllIIIllIllIll = llllllllllllIllllIIllIIIllIlllIl.toCharArray();
        int llllllllllllIllllIIllIIIllIllIlI = StatList.lIlllllIlIlIll[0];
        final double llllllllllllIllllIIllIIIllIlIlII = (Object)llllllllllllIllllIIllIIIllIllIIl.toCharArray();
        final double llllllllllllIllllIIllIIIllIlIIll = llllllllllllIllllIIllIIIllIlIlII.length;
        byte llllllllllllIllllIIllIIIllIlIIlI = (byte)StatList.lIlllllIlIlIll[0];
        while (lIIIIlIlIllllllI(llllllllllllIllllIIllIIIllIlIIlI, (int)llllllllllllIllllIIllIIIllIlIIll)) {
            final char llllllllllllIllllIIllIIIllIlllll = llllllllllllIllllIIllIIIllIlIlII[llllllllllllIllllIIllIIIllIlIIlI];
            llllllllllllIllllIIllIIIllIlllII.append((char)(llllllllllllIllllIIllIIIllIlllll ^ llllllllllllIllllIIllIIIllIllIll[llllllllllllIllllIIllIIIllIllIlI % llllllllllllIllllIIllIIIllIllIll.length]));
            "".length();
            ++llllllllllllIllllIIllIIIllIllIlI;
            ++llllllllllllIllllIIllIIIllIlIIlI;
            "".length();
            if (((0x6A ^ 0x20) & ~(0x7A ^ 0x30)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIllIIIllIlllII);
    }
    
    private static String lIIIIlIlIllIIIII(final String llllllllllllIllllIIllIIIllIIlIIl, final String llllllllllllIllllIIllIIIllIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIIIllIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), StatList.lIlllllIlIlIll[8]), "DES");
            final Cipher llllllllllllIllllIIllIIIllIIlIll = Cipher.getInstance("DES");
            llllllllllllIllllIIllIIIllIIlIll.init(StatList.lIlllllIlIlIll[2], llllllllllllIllllIIllIIIllIIllII);
            return new String(llllllllllllIllllIIllIIIllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIIIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIIIllIIlIlI) {
            llllllllllllIllllIIllIIIllIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void replaceAllSimilarBlocks(final StatBase[] llllllllllllIllllIIllIIlIIIIIlll) {
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.water, Blocks.flowing_water);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.lava, Blocks.flowing_lava);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.lit_pumpkin, Blocks.pumpkin);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.lit_furnace, Blocks.furnace);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.lit_redstone_ore, Blocks.redstone_ore);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.powered_repeater, Blocks.unpowered_repeater);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.powered_comparator, Blocks.unpowered_comparator);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.redstone_torch, Blocks.unlit_redstone_torch);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.lit_redstone_lamp, Blocks.redstone_lamp);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.double_stone_slab, Blocks.stone_slab);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.double_wooden_slab, Blocks.wooden_slab);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.double_stone_slab2, Blocks.stone_slab2);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.grass, Blocks.dirt);
        mergeStatBases(llllllllllllIllllIIllIIlIIIIIlll, Blocks.farmland, Blocks.dirt);
    }
    
    private static void lIIIIlIlIlllIllI() {
        (lIlllllIlIlIll = new int[115])[0] = ((13 + 115 - 62 + 70 ^ 4 + 127 - 65 + 116) & (30 + 79 - 27 + 71 ^ 109 + 15 - 10 + 53 ^ -" ".length()));
        StatList.lIlllllIlIlIll[1] = " ".length();
        StatList.lIlllllIlIlIll[2] = "  ".length();
        StatList.lIlllllIlIlIll[3] = "   ".length();
        StatList.lIlllllIlIlIll[4] = (0x9D ^ 0x99);
        StatList.lIlllllIlIlIll[5] = (0x8D ^ 0xAA ^ (0xE4 ^ 0xC6));
        StatList.lIlllllIlIlIll[6] = (0x4A ^ 0x4C);
        StatList.lIlllllIlIlIll[7] = (93 + 73 - 134 + 103 ^ 61 + 89 - 96 + 74);
        StatList.lIlllllIlIlIll[8] = (0xCA ^ 0xC2);
        StatList.lIlllllIlIlIll[9] = (0x53 ^ 0x5A);
        StatList.lIlllllIlIlIll[10] = (0xDE ^ 0x85 ^ (0xE5 ^ 0xB4));
        StatList.lIlllllIlIlIll[11] = (((0x79 ^ 0x24) & ~(0x9F ^ 0xC2)) ^ (0x14 ^ 0x1F));
        StatList.lIlllllIlIlIll[12] = (5 + 97 - 95 + 198 ^ 58 + 63 + 57 + 15);
        StatList.lIlllllIlIlIll[13] = (0x7F ^ 0x25 ^ (0xF ^ 0x58));
        StatList.lIlllllIlIlIll[14] = (0x66 ^ 0x57 ^ (0xBE ^ 0x81));
        StatList.lIlllllIlIlIll[15] = (0x51 ^ 0x5E);
        StatList.lIlllllIlIlIll[16] = (0x70 ^ 0x60);
        StatList.lIlllllIlIlIll[17] = (0x60 ^ 0x71);
        StatList.lIlllllIlIlIll[18] = (0xEC ^ 0xB2 ^ (0x8D ^ 0xC1));
        StatList.lIlllllIlIlIll[19] = (0x5C ^ 0x7 ^ (0x26 ^ 0x6E));
        StatList.lIlllllIlIlIll[20] = (0xE3 ^ 0xA8 ^ (0x7A ^ 0x25));
        StatList.lIlllllIlIlIll[21] = (0x72 ^ 0x67);
        StatList.lIlllllIlIlIll[22] = (0xAB ^ 0x84 ^ (0xD ^ 0x34));
        StatList.lIlllllIlIlIll[23] = (0x6F ^ 0x78);
        StatList.lIlllllIlIlIll[24] = (0x8C ^ 0x94);
        StatList.lIlllllIlIlIll[25] = (123 + 19 - 77 + 84 ^ 90 + 123 - 126 + 53);
        StatList.lIlllllIlIlIll[26] = (0x6D ^ 0x77);
        StatList.lIlllllIlIlIll[27] = (10 + 77 - 16 + 108 ^ 29 + 75 - 7 + 71);
        StatList.lIlllllIlIlIll[28] = (0xD ^ 0x2A ^ (0x7A ^ 0x41));
        StatList.lIlllllIlIlIll[29] = (0xC ^ 0x2 ^ (0x6B ^ 0x78));
        StatList.lIlllllIlIlIll[30] = (0x3D ^ 0x23);
        StatList.lIlllllIlIlIll[31] = (0xAF ^ 0xA2 ^ (0xB8 ^ 0xAA));
        StatList.lIlllllIlIlIll[32] = (0x83 ^ 0xA3);
        StatList.lIlllllIlIlIll[33] = (0x2E ^ 0x3D ^ (0x9A ^ 0xA8));
        StatList.lIlllllIlIlIll[34] = (0xA8 ^ 0xC1 ^ (0x4B ^ 0x0));
        StatList.lIlllllIlIlIll[35] = (0x40 ^ 0x63);
        StatList.lIlllllIlIlIll[36] = (1 + 104 - 34 + 116 ^ 90 + 39 - 114 + 144);
        StatList.lIlllllIlIlIll[37] = (0x4F ^ 0x6A);
        StatList.lIlllllIlIlIll[38] = (0x52 ^ 0x74);
        StatList.lIlllllIlIlIll[39] = (0x3C ^ 0x7F ^ (0x5F ^ 0x3B));
        StatList.lIlllllIlIlIll[40] = (0x64 ^ 0x7E ^ (0xE ^ 0x3C));
        StatList.lIlllllIlIlIll[41] = (52 + 148 - 6 + 39 ^ 133 + 28 - 128 + 159);
        StatList.lIlllllIlIlIll[42] = (56 + 150 - 166 + 123 ^ 78 + 61 - 79 + 77);
        StatList.lIlllllIlIlIll[43] = (0x1 ^ 0x2A);
        StatList.lIlllllIlIlIll[44] = (0x91 ^ 0xBD);
        StatList.lIlllllIlIlIll[45] = (97 + 123 - 157 + 98 ^ 101 + 99 - 87 + 27);
        StatList.lIlllllIlIlIll[46] = (114 + 18 + 25 + 24 ^ 128 + 31 - 98 + 94);
        StatList.lIlllllIlIlIll[47] = (0xBB ^ 0x94);
        StatList.lIlllllIlIlIll[48] = (0x59 ^ 0x65 ^ (0xA0 ^ 0xAC));
        StatList.lIlllllIlIlIll[49] = (0x99 ^ 0x9C ^ (0xA6 ^ 0x92));
        StatList.lIlllllIlIlIll[50] = (0x38 ^ 0xA);
        StatList.lIlllllIlIlIll[51] = (0xF9 ^ 0xB9 ^ (0x18 ^ 0x6B));
        StatList.lIlllllIlIlIll[52] = (0xE ^ 0x3A);
        StatList.lIlllllIlIlIll[53] = (0x60 ^ 0x65 ^ (0x94 ^ 0xA4));
        StatList.lIlllllIlIlIll[54] = (0x15 ^ 0x23);
        StatList.lIlllllIlIlIll[55] = (0x55 ^ 0x62);
        StatList.lIlllllIlIlIll[56] = (0x4E ^ 0x76);
        StatList.lIlllllIlIlIll[57] = (0xD2 ^ 0x9F ^ (0x23 ^ 0x57));
        StatList.lIlllllIlIlIll[58] = (0x8 ^ 0x32);
        StatList.lIlllllIlIlIll[59] = (0x6C ^ 0x57);
        StatList.lIlllllIlIlIll[60] = (117 + 94 - 209 + 160 ^ 123 + 89 - 208 + 154);
        StatList.lIlllllIlIlIll[61] = (64 + 116 - 6 + 2 ^ 26 + 63 - 40 + 92);
        StatList.lIlllllIlIlIll[62] = (117 + 114 - 176 + 82 ^ 66 + 129 - 80 + 68);
        StatList.lIlllllIlIlIll[63] = (0xA4 ^ 0x9B);
        StatList.lIlllllIlIlIll[64] = (0xFB ^ 0xBB);
        StatList.lIlllllIlIlIll[65] = (0xD0 ^ 0xAB ^ (0x1F ^ 0x25));
        StatList.lIlllllIlIlIll[66] = (" ".length() ^ (0xEB ^ 0xA8));
        StatList.lIlllllIlIlIll[67] = (0x2A ^ 0x69);
        StatList.lIlllllIlIlIll[68] = (0x2D ^ 0x4 ^ (0xD1 ^ 0xBC));
        StatList.lIlllllIlIlIll[69] = (0x72 ^ 0x37);
        StatList.lIlllllIlIlIll[70] = (0x16 ^ 0x74 ^ (0xA1 ^ 0x85));
        StatList.lIlllllIlIlIll[71] = (109 + 61 - 8 + 44 ^ 101 + 13 - 104 + 127);
        StatList.lIlllllIlIlIll[72] = (0x5C ^ 0x14);
        StatList.lIlllllIlIlIll[73] = (104 + 53 - 94 + 185 ^ 137 + 151 - 196 + 85);
        StatList.lIlllllIlIlIll[74] = (0xD5 ^ 0x9F);
        StatList.lIlllllIlIlIll[75] = (27 + 9 + 72 + 129 ^ 53 + 124 - 145 + 134);
        StatList.lIlllllIlIlIll[76] = (159 + 63 - 32 + 58 ^ 73 + 100 - 132 + 139);
        StatList.lIlllllIlIlIll[77] = (0xF1 ^ 0xBC);
        StatList.lIlllllIlIlIll[78] = (0x8B ^ 0xC5);
        StatList.lIlllllIlIlIll[79] = (0x6B ^ 0x24);
        StatList.lIlllllIlIlIll[80] = (0x60 ^ 0x30);
        StatList.lIlllllIlIlIll[81] = (0x7A ^ 0x2B);
        StatList.lIlllllIlIlIll[82] = (0x29 ^ 0x17 ^ (0x4C ^ 0x20));
        StatList.lIlllllIlIlIll[83] = (0x97 ^ 0xC4);
        StatList.lIlllllIlIlIll[84] = (0xE ^ 0x5A);
        StatList.lIlllllIlIlIll[85] = (0x66 ^ 0x33);
        StatList.lIlllllIlIlIll[86] = (0x71 ^ 0x27);
        StatList.lIlllllIlIlIll[87] = (0x94 ^ 0x9E ^ (0x5C ^ 0x1));
        StatList.lIlllllIlIlIll[88] = (0xB0 ^ 0x84 ^ (0xF2 ^ 0x9E));
        StatList.lIlllllIlIlIll[89] = (0x46 ^ 0x1F);
        StatList.lIlllllIlIlIll[90] = (0x40 ^ 0x1A);
        StatList.lIlllllIlIlIll[91] = (0xE4 ^ 0xBF);
        StatList.lIlllllIlIlIll[92] = (0x19 ^ 0x45);
        StatList.lIlllllIlIlIll[93] = (0xF1 ^ 0xBC ^ (0x65 ^ 0x75));
        StatList.lIlllllIlIlIll[94] = (0xB2 ^ 0xBF ^ (0xE8 ^ 0xBB));
        StatList.lIlllllIlIlIll[95] = (0xAA ^ 0xA4 ^ (0x9 ^ 0x58));
        StatList.lIlllllIlIlIll[96] = (-(0xFFFFCF7F & 0x3EBF) & (0xFFFF9FBE & 0x7E7F));
        StatList.lIlllllIlIlIll[97] = (-(0xFFFFBBFF & 0x4659) & (0xFFFFFFFB & 0x7F5C));
        StatList.lIlllllIlIlIll[98] = (0xF ^ 0x6F);
        StatList.lIlllllIlIlIll[99] = (0x5C ^ 0x46 ^ (0xC3 ^ 0xB8));
        StatList.lIlllllIlIlIll[100] = (181 + 86 - 59 + 7 ^ 167 + 140 - 258 + 132);
        StatList.lIlllllIlIlIll[101] = (0x41 ^ 0x28 ^ (0xB2 ^ 0xB8));
        StatList.lIlllllIlIlIll[102] = (48 + 138 - 112 + 91 ^ 12 + 131 - 5 + 55);
        StatList.lIlllllIlIlIll[103] = (0x34 ^ 0x2B ^ (0x20 ^ 0x5A));
        StatList.lIlllllIlIlIll[104] = (0xD ^ 0x74 ^ (0x8 ^ 0x17));
        StatList.lIlllllIlIlIll[105] = (0x6B ^ 0xD ^ " ".length());
        StatList.lIlllllIlIlIll[106] = (0x13 ^ 0x7B);
        StatList.lIlllllIlIlIll[107] = (0xDC ^ 0xB5);
        StatList.lIlllllIlIlIll[108] = (0xFA ^ 0x90);
        StatList.lIlllllIlIlIll[109] = (0x65 ^ 0x5D ^ (0x28 ^ 0x7B));
        StatList.lIlllllIlIlIll[110] = (0xA8 ^ 0x95 ^ (0xC5 ^ 0x94));
        StatList.lIlllllIlIlIll[111] = (31 + 60 + 62 + 83 ^ 61 + 50 + 13 + 5);
        StatList.lIlllllIlIlIll[112] = (0xE0 ^ 0x8E);
        StatList.lIlllllIlIlIll[113] = (0x27 ^ 0x4C ^ (0x3B ^ 0x3F));
        StatList.lIlllllIlIlIll[114] = (0x9 ^ 0x79);
    }
    
    private static boolean lIIIIlIlIllllIlI(final Object llllllllllllIllllIIllIIIlIllIIIl) {
        return llllllllllllIllllIIllIIIlIllIIIl != null;
    }
    
    public static StatBase getStatKillEntity(final EntityList.EntityEggInfo llllllllllllIllllIIllIIIllllIlIl) {
        final String llllllllllllIllllIIllIIIllllIlII = EntityList.getStringFromID(llllllllllllIllllIIllIIIllllIlIl.spawnedID);
        StatBase registerStat;
        if (lIIIIlIlIlllllIl(llllllllllllIllllIIllIIIllllIlII)) {
            registerStat = null;
            "".length();
            if ((0x26 ^ 0x22) <= 0) {
                return null;
            }
        }
        else {
            final String value = String.valueOf(new StringBuilder(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[106]]).append(llllllllllllIllllIIllIIIllllIlII));
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[107]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ChatComponentTranslation(String.valueOf(new StringBuilder(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[108]]).append(llllllllllllIllllIIllIIIllllIlII).append(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[109]])), new Object[StatList.lIlllllIlIlIll[0]]);
            registerStat = new StatBase(value, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl)).registerStat();
        }
        return registerStat;
    }
    
    public static void init() {
        initMiningStats();
        initStats();
        initItemDepleteStats();
        initCraftableStats();
        AchievementList.init();
        EntityList.func_151514_a();
    }
    
    public static StatBase getOneShotStat(final String llllllllllllIllllIIllIIIlllIlIlI) {
        return StatList.oneShotStats.get(llllllllllllIllllIIllIIIlllIlIlI);
    }
    
    private static void lIIIIlIlIlllIlII() {
        (lIlllllIlIIIII = new String[StatList.lIlllllIlIlIll[114]])[StatList.lIlllllIlIlIll[0]] = lIIIIlIlIlIlllll("CJg19BNU+XOIrCDGzFL1BA==", "BqHHc");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[1]] = lIIIIlIlIllIIIII("Hyo70Mar11T8XLXQT6mBSg==", "wgCpI");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[2]] = lIIIIlIlIlIlllll("b0WiYKBMptvDYZ47xZ0XndG7TCLULeZR", "RMkxl");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[3]] = lIIIIlIlIllIIIII("y4fgYbXS1TsO5hKr1Do5gajmcFO5wFGb", "oXQsL");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[4]] = lIIIIlIlIllIIIIl("KgwwDl4tETwfIzAWMh80PBklEg==", "YxQzp");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[5]] = lIIIIlIlIllIIIII("SscU0/fpp9c9048kRO3i9rTNqsUdMJjh", "YGKSE");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[6]] = lIIIIlIlIlIlllll("YBNVHbzFXUB1OUebjUdTKA==", "HduEz");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[7]] = lIIIIlIlIllIIIIl("JAQQIGsgER0/CjkVMjk=", "WpqTE");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[8]] = lIIIIlIlIllIIIII("52qVVJ8jVPLSmLRt2e/KG+APNFQe3GMp", "fJziC");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[9]] = lIIIIlIlIllIIIII("txc3Q6Ie3Yd0jywsgjXQUj0tGUilzJfS", "frDnJ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[10]] = lIIIIlIlIlIlllll("dJYxBT0x76WM17uQ1AVz+zNSYvEJjH6D", "DhOjG");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[11]] = lIIIIlIlIllIIIII("d+VhZ9AuA8HRWlwoOSjHSBZtsOT8mYvR", "bXTcV");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[12]] = lIIIIlIlIllIIIII("tkvhABITjBCGzpL49myRhA==", "NchEm");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[13]] = lIIIIlIlIllIIIIl("OScwDWg5JDgUCSQ2EhQ=", "JSQyF");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[14]] = lIIIIlIlIllIIIIl("HTEFHl8IJAgGPgAgJwc=", "nEdjq");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[15]] = lIIIIlIlIllIIIII("VxARVfQYiI5qf68Tb/JKgg==", "MInOQ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[16]] = lIIIIlIlIllIIIII("tn1Ok6LzfVGQIvJuckHG6w==", "oqQwK");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[17]] = lIIIIlIlIllIIIII("ornEK+5ESzGGx6OcqpdAzQ==", "kIkmY");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[18]] = lIIIIlIlIlIlllll("SzogmiccPVCYlzgksA53Dw==", "SzbKG");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[19]] = lIIIIlIlIllIIIIl("IQAwGX00GCgiPTc3PA==", "RtQmS");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[20]] = lIIIIlIlIllIIIII("QWFz+yl0oIdD7EvGaf3UyQ==", "eGvtL");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[21]] = lIIIIlIlIllIIIII("B+TTcNpEOo/7E96hdpXF3A==", "xuOuj");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[22]] = lIIIIlIlIllIIIIl("HQAqGFQDHSUJGQ8GPyMUCzcm", "ntKlz");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[23]] = lIIIIlIlIllIIIII("kDB9tuTglR0zQ+b+ibzP0AMWlya0IpLJ", "RnVMM");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[24]] = lIIIIlIlIlIlllll("rN9sbvX/zfjpe7IL3kS8CQ==", "YHebH");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[25]] = lIIIIlIlIllIIIIl("GD0qDWIJJioNAwUsCBQ=", "kIKyL");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[26]] = lIIIIlIlIllIIIII("OuA13ExjMfN5j9D7ZbhWng==", "JPpRT");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[27]] = lIIIIlIlIllIIIIl("CxALA0YIDQ04Bh0nBw==", "xdjwh");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[28]] = lIIIIlIlIlIlllll("+0Yoj1StmnGkPZdOlrz7Fw==", "FhVoE");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[29]] = lIIIIlIlIllIIIII("Co84s18ZNU53q0SXxYCs+g==", "FoLhe");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[30]] = lIIIIlIlIllIIIIl("IDUHMnQ5NAs2", "SAfFZ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[31]] = lIIIIlIlIlIlllll("WdcVClaxRwkmXIXl5a56IQ==", "adPEJ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[32]] = lIIIIlIlIllIIIII("6g+glbxgROWvMhcx4z+aOQ==", "TxRrX");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[33]] = lIIIIlIlIllIIIII("EQWfBkr1pNyAAYSmR1UT1Q==", "BEfCl");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[34]] = lIIIIlIlIlIlllll("EhJtlTC5UWtxFSAgeAFUCzaY6Ie9jbLN", "eJHqN");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[35]] = lIIIIlIlIllIIIII("4Ik9vnlm1QR+c7l1LxWCL/vp3p59KK+h", "avSbm");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[36]] = lIIIIlIlIlIlllll("Rtx3IQn08oaJCGkfGWhANVlPZ77ED+hv", "AjLos");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[37]] = lIIIIlIlIlIlllll("Z4nM/TqHvBTYHLHWEv/2sVsCl0vuXTo/", "UTbpr");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[38]] = lIIIIlIlIlIlllll("kCUT77+XdZdIOy0v5N7Qnw==", "QIWTI");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[39]] = lIIIIlIlIlIlllll("hAgVdcwbM7wjwmVfItG7lA==", "LZuWq");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[40]] = lIIIIlIlIllIIIIl("KgIjF2o0GSAoLTUaMQ==", "YvBcD");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[41]] = lIIIIlIlIllIIIIl("MR0OFlYvBg0pES4FHA==", "Biobx");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[42]] = lIIIIlIlIllIIIII("r95EwlpcmjtO22TcLWLkf1VJMnLruiMB", "JfFvS");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[43]] = lIIIIlIlIlIlllll("liXMhZvisdPj0gGVEwwwMu1NG3REXpgq", "giGcr");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[44]] = lIIIIlIlIllIIIII("GJC1otxovIFWaaI78jcffopJPAXQ4hB5", "YXEIv");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[45]] = lIIIIlIlIllIIIIl("OzUmDWE4LSYAKjoKLhUjOw==", "HAGyO");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[46]] = lIIIIlIlIlIlllll("k9OcrGJOxOTCm/OG+WfBxA==", "MwJFl");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[47]] = lIIIIlIlIllIIIIl("KgU5Lk0/GCsyIDgEPzIX", "YqXZc");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[48]] = lIIIIlIlIllIIIIl("NjksBVQvOCMaPCw+JRQe", "EMMqz");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[49]] = lIIIIlIlIlIlllll("hSRNE+xGQzcFKCOitY0CYA==", "jAovy");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[50]] = lIIIIlIlIllIIIII("EMAqR4v4HlDu8+UkE3tfvRdZd2wCKtWe", "Nolsj");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[51]] = lIIIIlIlIllIIIIl("Hx8bA3gYGR8WJRkZHzE/HwMfEw==", "lkzwV");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[52]] = lIIIIlIlIlIlllll("KFVst4ZMTNp0pEArSspV+kWC6rOk2PnB", "eLLLW");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[53]] = lIIIIlIlIllIIIIl("GBIvBX8fByIaNA8yISc4BwovFjQZ", "kfNqQ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[54]] = lIIIIlIlIllIIIIl("BhIzOnwBFDMqNxExOzo6Iw8+IjMSAyA=", "ufRNR");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[55]] = lIIIIlIlIllIIIII("u5k88KXCtpYbCA30dRduYs5N9ts99i7q", "NiGVI");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[56]] = lIIIIlIlIllIIIIl("FzESHEUHJBgNOAgsEA0YISQHDQU=", "dEshk");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[57]] = lIIIIlIlIlIlllll("mJ7pHUX7A+xsyd1Du3Cxk2mp7+e3ZIUL", "ZWvTZ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[58]] = lIIIIlIlIlIlllll("NQm5tDu93hb9yQ2dtUIUHps5OiVTTTKV", "XTZuy");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[59]] = lIIIIlIlIllIIIIl("PQEUNnktFAAuMzwaGwQ+IhkQJg==", "NuuBW");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[60]] = lIIIIlIlIllIIIII("LZu6vDvP2t1GnPXpGzRCgejSj4/qxtQm", "VfMlb");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[61]] = lIIIIlIlIllIIIIl("Jy0LOEo3OB8gACY2BBkXMT0=", "TYjLd");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[62]] = lIIIIlIlIlIlllll("NsDWz7j6mFfTdUsomePwvr8MIv76amJl", "MkhQG");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[63]] = lIIIIlIlIllIIIII("viR8l9ItTG4T8pveVWwxlpfJPV7lAg5z", "tbDsE");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[64]] = lIIIIlIlIlIlllll("9LNTCNdZbEkWFAgv/OeNhMChRjitckG7", "GuALV");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[65]] = lIIIIlIlIllIIIII("LoCjvN63g7Ry+2y5IU8RqsTFoKOJr0qQ", "wvOpb");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[66]] = lIIIIlIlIllIIIIl("HwEQEEYOBxQTAQISAhAJAhE4ChwJBxAHHAUaHw==", "luqdh");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[67]] = lIIIIlIlIlIlllll("+qJHthCihq8YrteZAqOJdwCZtu36qCfq4KZhCbW2EI0=", "RUpbn");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[68]] = lIIIIlIlIllIIIII("QYoN0CQCHa5nGKnGZusYENPVCKU4SVmi", "nQEGu");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[69]] = lIIIIlIlIllIIIIl("OAEUJUgpEBQyCSU8GyUDORQWJQ8kGw==", "KuuQf");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[70]] = lIIIIlIlIllIIIII("6U4XCgBNsoeq4y6NQiC8a28IzpwxjClj", "xKQeV");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[71]] = lIIIIlIlIllIIIII("4thDzlSKA8uvExMJJDWJ8Qyyo/Azge8p", "TAFNa");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[72]] = lIIIIlIlIllIIIII("5ZymCGYwUY8HDrHiobDXxhodJpnqeJ6u", "WspGO");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[73]] = lIIIIlIlIllIIIIl("KRA0I2QyCyUnLygtOyQ6PwchMi4=", "ZdUWJ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[74]] = lIIIIlIlIllIIIIl("ATgXIU0WJQUlBhw/EycqHD8GMAAGKRI=", "rLvUc");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[75]] = lIIIIlIlIlIlllll("whyDTDrUvybbBlC3aw/MvTwYTWRdOZLB", "sSvKC");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[76]] = lIIIIlIlIllIIIII("YfBz+Acutsd91RpXd1pq6fIUpa+Ufszt", "RvBnM");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[77]] = lIIIIlIlIlIlllll("LNPG0eNjThgUdeKZOaOVam7odqF2y2yS", "PQjzO");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[78]] = lIIIIlIlIlIlllll("EQkWIkl1bu1heQEcHy163/VT+kWx67n8", "WnajQ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[79]] = lIIIIlIlIllIIIII("5LfvM8fAZmXMGTdrAGfBm8dHmt+F+BSO", "nSMCU");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[80]] = lIIIIlIlIlIlllll("AmQyEBDqFI5nCoanx0uuOXvyzkQY7VmH", "QqItT");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[81]] = lIIIIlIlIllIIIIl("HQwMPWYIFAI+LRwoAj08Cxw=", "nxmIH");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[82]] = lIIIIlIlIllIIIII("xjDv4B7U0lUX70O1T9fuxtWzaA0sWBWmHDUEhivD9wA=", "DxQKV");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[83]] = lIIIIlIlIllIIIII("TCzvhPSGjFCOMQgC8sav4c0s+4w6Rvf53+bWsjbU2LE=", "tquhW");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[84]] = lIIIIlIlIlIlllll("Zcwt/nXHDcbLkBNct4DFLbkrT6uzd09a", "LTSGn");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[85]] = lIIIIlIlIllIIIII("cCrhuedCw3lqYIld9cz1CQDjIktu9cDz", "bkuqK");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[86]] = lIIIIlIlIllIIIIl("HiU4MmUEJTwrDgMyMSclGTQ9", "mQYFK");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[87]] = lIIIIlIlIllIIIIl("GAUIOWQCBQwgDwUSASwkHxQN", "kqiMJ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[88]] = lIIIIlIlIlIlllll("t3QguYy3fN9BDP5dcX8R/MJB8dPmcLX3", "ljxma");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[89]] = lIIIIlIlIllIIIII("QlPUOsJWNV/vi+3NMyMUyCmP98S28lMR", "NfCZE");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[90]] = lIIIIlIlIllIIIIl("HxwoEWoKHTsLJQ8NAAswCRooBjAFByc=", "lhIeD");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[91]] = lIIIIlIlIlIlllll("/QrB5fyvqDlFfbPjMCrnZQxmDYoE7MHI", "ZgoQK");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[92]] = lIIIIlIlIlIlllll("fmebBYejFPeT9lHU6Wkp09vA7FHjStW6OYrp1/EmCgE=", "eouqT");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[93]] = lIIIIlIlIllIIIII("gbFUOKNSXA/N3s7hHm1FB+uCTJZKVsFCXubC0SCDX3I=", "hJpRS");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[94]] = lIIIIlIlIllIIIIl("BxsTEncXBxcVLTsfFwg8EA==", "torfY");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[95]] = lIIIIlIlIllIIIIl("MQwmHWIhECIaOA0IIgcpJg==", "BxGiL");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[98]] = lIIIIlIlIlIlllll("H66FXYGoqoHpuj6q96EJig==", "RdHsj");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[99]] = lIIIIlIlIllIIIIl("HTkMBl8NPwwUBSc5CB8=", "nMmrq");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[100]] = lIIIIlIlIllIIIIl("Kj8CHGk0Ig0NBTUkAANp", "YKchG");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[101]] = lIIIIlIlIlIlllll("b8QVUPG25oDehr9j9jxtZg==", "sZMDP");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[102]] = lIIIIlIlIllIIIIl("HxgMLXQZHwgQLgkBQw==", "llmYZ");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[103]] = lIIIIlIlIlIlllll("IyKU84bSbxc5QDt5tV2iLg==", "dNvRI");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[104]] = lIIIIlIlIllIIIII("Hc/PKM8g0VWfy/zRsShYXA==", "kVPPa");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[105]] = lIIIIlIlIlIlllll("IBryHqMg1BYr6tezg0NVsA==", "JCBLo");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[106]] = lIIIIlIlIllIIIII("7VaIeJqfCCOmQW0us8wzB/LcyvIvmtmc", "kjRLM");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[107]] = lIIIIlIlIlIlllll("Y4UyY7luxGf9hjIohncyEw==", "NnbjW");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[108]] = lIIIIlIlIlIlllll("QokUfcJmqeU=", "evvSI");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[109]] = lIIIIlIlIlIlllll("ktueN+8xDy4=", "SjQYN");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[110]] = lIIIIlIlIllIIIIl("CwUWFUMdHwMIGQE6Hg0BHRU1GEM=", "xqwam");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[111]] = lIIIIlIlIllIIIIl("GDsxBWEOISQYOxIEOR0jDisSCA==", "kOPqO");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[112]] = lIIIIlIlIllIIIII("+qYZ2xikp8g=", "dEdhA");
        StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[113]] = lIIIIlIlIllIIIIl("WCAUByw=", "vNujI");
    }
    
    static {
        lIIIIlIlIlllIllI();
        lIIIIlIlIlllIlII();
        StatList.oneShotStats = (Map<String, StatBase>)Maps.newHashMap();
        StatList.allStats = (List<StatBase>)Lists.newArrayList();
        StatList.generalStats = (List<StatBase>)Lists.newArrayList();
        StatList.itemStats = (List<StatCrafting>)Lists.newArrayList();
        StatList.objectMineStats = (List<StatCrafting>)Lists.newArrayList();
        StatList.leaveGameStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[0]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[1]], new Object[StatList.lIlllllIlIlIll[0]])).initIndependentStat().registerStat();
        StatList.minutesPlayedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[2]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[3]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.timeStatType).initIndependentStat().registerStat();
        StatList.timeSinceDeathStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[4]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[5]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.timeStatType).initIndependentStat().registerStat();
        StatList.distanceWalkedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[6]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[7]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceCrouchedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[8]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[9]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceSprintedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[10]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[11]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceSwumStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[12]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[13]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceFallenStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[14]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[15]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceClimbedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[16]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[17]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceFlownStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[18]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[19]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceDoveStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[20]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[21]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceByMinecartStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[22]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[23]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceByBoatStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[24]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[25]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceByPigStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[26]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[27]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.distanceByHorseStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[28]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[29]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.distanceStatType).initIndependentStat().registerStat();
        StatList.jumpStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[30]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[31]], new Object[StatList.lIlllllIlIlIll[0]])).initIndependentStat().registerStat();
        StatList.dropStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[32]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[33]], new Object[StatList.lIlllllIlIlIll[0]])).initIndependentStat().registerStat();
        StatList.damageDealtStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[34]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[35]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.field_111202_k).registerStat();
        StatList.damageTakenStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[36]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[37]], new Object[StatList.lIlllllIlIlIll[0]]), StatBase.field_111202_k).registerStat();
        StatList.deathsStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[38]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[39]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.mobKillsStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[40]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[41]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.animalsBredStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[42]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[43]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.playerKillsStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[44]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[45]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.fishCaughtStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[46]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[47]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.junkFishedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[48]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[49]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.treasureFishedStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[50]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[51]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.timesTalkedToVillagerStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[52]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[53]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.timesTradedWithVillagerStat = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[54]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[55]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181724_H = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[56]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[57]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181725_I = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[58]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[59]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181726_J = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[60]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[61]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181727_K = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[62]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[63]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181728_L = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[64]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[65]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181729_M = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[66]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[67]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181730_N = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[68]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[69]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181731_O = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[70]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[71]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181732_P = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[72]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[73]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181733_Q = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[74]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[75]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181734_R = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[76]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[77]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181735_S = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[78]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[79]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181736_T = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[80]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[81]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181737_U = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[82]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[83]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181738_V = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[84]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[85]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181739_W = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[86]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[87]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181740_X = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[88]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[89]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181741_Y = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[90]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[91]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181742_Z = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[92]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[93]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        StatList.field_181723_aa = new StatBasic(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[94]], new ChatComponentTranslation(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[95]], new Object[StatList.lIlllllIlIlIll[0]])).registerStat();
        mineBlockStatArray = new StatBase[StatList.lIlllllIlIlIll[96]];
        objectCraftStats = new StatBase[StatList.lIlllllIlIlIll[97]];
        objectUseStats = new StatBase[StatList.lIlllllIlIlIll[97]];
        objectBreakStats = new StatBase[StatList.lIlllllIlIlIll[97]];
    }
    
    private static void initItemDepleteStats() {
        final Exception llllllllllllIllllIIllIIlIIIlIIlI = (Exception)Item.itemRegistry.iterator();
        "".length();
        if (((0x1A ^ 0x54) & ~(0x2E ^ 0x60)) != 0x0) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIIlIIlI).hasNext() ? 1 : 0)) {
            final Item llllllllllllIllllIIllIIlIIIlIllI = ((Iterator<Item>)llllllllllllIllllIIllIIlIIIlIIlI).next();
            if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIIlIllI)) {
                final int llllllllllllIllllIIllIIlIIIlIlIl = Item.getIdFromItem(llllllllllllIllllIIllIIlIIIlIllI);
                final String llllllllllllIllllIIllIIlIIIlIlII = func_180204_a(llllllllllllIllllIIllIIlIIIlIllI);
                if (!lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIIlIlII) || !lIIIIlIlIlllllII(llllllllllllIllllIIllIIlIIIlIllI.isDamageable() ? 1 : 0)) {
                    continue;
                }
                final StatBase[] objectBreakStats = StatList.objectBreakStats;
                final int n = llllllllllllIllllIIllIIlIIIlIlIl;
                final String lllllllllllllIIIlIllIlIIllllIIIl = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[104]];
                final String lllllllllllllIIIlIllIlIIllllIIII = llllllllllllIllllIIllIIlIIIlIlII;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[105]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ItemStack(llllllllllllIllllIIllIIlIIIlIllI).getChatComponent();
                objectBreakStats[n] = new StatCrafting(lllllllllllllIIIlIllIlIIllllIIIl, lllllllllllllIIIlIllIlIIllllIIII, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl), llllllllllllIllllIIllIIlIIIlIllI).registerStat();
            }
        }
        replaceAllSimilarBlocks(StatList.objectBreakStats);
    }
    
    private static boolean lIIIIlIlIlllllII(final int llllllllllllIllllIIllIIIlIlIllIl) {
        return llllllllllllIllllIIllIIIlIlIllIl != 0;
    }
    
    private static boolean lIIIIlIlIllllIll(final int llllllllllllIllllIIllIIIlIlIlIll) {
        return llllllllllllIllllIIllIIIlIlIlIll == 0;
    }
    
    private static void mergeStatBases(final StatBase[] llllllllllllIllllIIllIIlIIIIIIIl, final Block llllllllllllIllllIIllIIIlllllIll, final Block llllllllllllIllllIIllIIIllllllll) {
        final int llllllllllllIllllIIllIIIlllllllI = Block.getIdFromBlock(llllllllllllIllllIIllIIIlllllIll);
        final int llllllllllllIllllIIllIIIllllllIl = Block.getIdFromBlock(llllllllllllIllllIIllIIIllllllll);
        if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI]) && lIIIIlIlIlllllIl(llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIllllllIl])) {
            llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIllllllIl] = llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI];
            "".length();
            if (" ".length() >= (122 + 151 - 181 + 67 ^ 132 + 63 - 96 + 56)) {
                return;
            }
        }
        else {
            StatList.allStats.remove(llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI]);
            "".length();
            StatList.objectMineStats.remove(llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI]);
            "".length();
            StatList.generalStats.remove(llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI]);
            "".length();
            llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIlllllllI] = llllllllllllIllllIIllIIlIIIIIIIl[llllllllllllIllllIIllIIIllllllIl];
        }
    }
    
    private static boolean lIIIIlIlIllllllI(final int llllllllllllIllllIIllIIIlIllIlII, final int llllllllllllIllllIIllIIIlIllIIll) {
        return llllllllllllIllllIIllIIIlIllIlII < llllllllllllIllllIIllIIIlIllIIll;
    }
    
    public static StatBase getStatEntityKilledBy(final EntityList.EntityEggInfo llllllllllllIllllIIllIIIlllIllIl) {
        final String llllllllllllIllllIIllIIIlllIlllI = EntityList.getStringFromID(llllllllllllIllllIIllIIIlllIllIl.spawnedID);
        StatBase registerStat;
        if (lIIIIlIlIlllllIl(llllllllllllIllllIIllIIIlllIlllI)) {
            registerStat = null;
            "".length();
            if ("  ".length() >= (0xAE ^ 0xAA)) {
                return null;
            }
        }
        else {
            final String value = String.valueOf(new StringBuilder(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[110]]).append(llllllllllllIllllIIllIIIlllIlllI));
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[111]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ChatComponentTranslation(String.valueOf(new StringBuilder(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[112]]).append(llllllllllllIllllIIllIIIlllIlllI).append(StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[113]])), new Object[StatList.lIlllllIlIlIll[0]]);
            registerStat = new StatBase(value, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl)).registerStat();
        }
        return registerStat;
    }
    
    private static String func_180204_a(final Item llllllllllllIllllIIllIIlIIIIlIll) {
        final ResourceLocation llllllllllllIllllIIllIIlIIIIllII = Item.itemRegistry.getNameForObject(llllllllllllIllllIIllIIlIIIIlIll);
        String replace;
        if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIIIllII)) {
            replace = llllllllllllIllllIIllIIlIIIIllII.toString().replace((char)StatList.lIlllllIlIlIll[58], (char)StatList.lIlllllIlIlIll[46]);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            replace = null;
        }
        return replace;
    }
    
    private static void initCraftableStats() {
        final Set<Item> llllllllllllIllllIIllIIlIIlllllI = (Set<Item>)Sets.newHashSet();
        int llllllllllllIllllIIllIIlIIllIllI = (int)CraftingManager.getInstance().getRecipeList().iterator();
        "".length();
        if (((0x2E ^ 0x3E ^ (0xF7 ^ 0xBF)) & (0x24 ^ 0x76 ^ (0x6D ^ 0x67) ^ -" ".length())) < 0) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIllIllI).hasNext() ? 1 : 0)) {
            final IRecipe llllllllllllIllllIIllIIlIIllllIl = ((Iterator<IRecipe>)llllllllllllIllllIIllIIlIIllIllI).next();
            if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIllllIl.getRecipeOutput())) {
                llllllllllllIllllIIllIIlIIlllllI.add(llllllllllllIllllIIllIIlIIllllIl.getRecipeOutput().getItem());
                "".length();
            }
        }
        llllllllllllIllllIIllIIlIIllIllI = (int)FurnaceRecipes.instance().getSmeltingList().values().iterator();
        "".length();
        if ("  ".length() == "   ".length()) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIllIllI).hasNext() ? 1 : 0)) {
            final ItemStack llllllllllllIllllIIllIIlIIllllII = ((Iterator<ItemStack>)llllllllllllIllllIIllIIlIIllIllI).next();
            llllllllllllIllllIIllIIlIIlllllI.add(llllllllllllIllllIIllIIlIIllllII.getItem());
            "".length();
        }
        llllllllllllIllllIIllIIlIIllIllI = (int)llllllllllllIllllIIllIIlIIlllllI.iterator();
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIllIllI).hasNext() ? 1 : 0)) {
            final Item llllllllllllIllllIIllIIlIIlllIll = ((Iterator<Item>)llllllllllllIllllIIllIIlIIllIllI).next();
            if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIlllIll)) {
                final int llllllllllllIllllIIllIIlIIlllIlI = Item.getIdFromItem(llllllllllllIllllIIllIIlIIlllIll);
                final String llllllllllllIllllIIllIIlIIlllIIl = func_180204_a(llllllllllllIllllIIllIIlIIlllIll);
                if (!lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIlllIIl)) {
                    continue;
                }
                final StatBase[] objectCraftStats = StatList.objectCraftStats;
                final int n = llllllllllllIllllIIllIIlIIlllIlI;
                final String lllllllllllllIIIlIllIlIIllllIIIl = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[98]];
                final String lllllllllllllIIIlIllIlIIllllIIII = llllllllllllIllllIIllIIlIIlllIIl;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[99]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ItemStack(llllllllllllIllllIIllIIlIIlllIll).getChatComponent();
                objectCraftStats[n] = new StatCrafting(lllllllllllllIIIlIllIlIIllllIIIl, lllllllllllllIIIlIllIlIIllllIIII, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl), llllllllllllIllllIIllIIlIIlllIll).registerStat();
            }
        }
        replaceAllSimilarBlocks(StatList.objectCraftStats);
    }
    
    private static void initMiningStats() {
        final byte llllllllllllIllllIIllIIlIIlIlIIl = (byte)Block.blockRegistry.iterator();
        "".length();
        if (((0xDE ^ 0x8D ^ (0x4E ^ 0x38)) & (0x6E ^ 0x54 ^ (0xAE ^ 0xB1) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIIlIlIllllIll(((Iterator)llllllllllllIllllIIllIIlIIlIlIIl).hasNext() ? 1 : 0)) {
            final Block llllllllllllIllllIIllIIlIIlIlllI = ((Iterator<Block>)llllllllllllIllllIIllIIlIIlIlIIl).next();
            final Item llllllllllllIllllIIllIIlIIlIllIl = Item.getItemFromBlock(llllllllllllIllllIIllIIlIIlIlllI);
            if (lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIlIllIl)) {
                final int llllllllllllIllllIIllIIlIIlIllII = Block.getIdFromBlock(llllllllllllIllllIIllIIlIIlIlllI);
                final String llllllllllllIllllIIllIIlIIlIlIll = func_180204_a(llllllllllllIllllIIllIIlIIlIllIl);
                if (!lIIIIlIlIllllIlI(llllllllllllIllllIIllIIlIIlIlIll) || !lIIIIlIlIlllllII(llllllllllllIllllIIllIIlIIlIlllI.getEnableStats() ? 1 : 0)) {
                    continue;
                }
                final StatBase[] mineBlockStatArray = StatList.mineBlockStatArray;
                final int n = llllllllllllIllllIIllIIlIIlIllII;
                final String lllllllllllllIIIlIllIlIIllllIIIl = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[100]];
                final String lllllllllllllIIIlIllIlIIllllIIII = llllllllllllIllllIIllIIlIIlIlIll;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = StatList.lIlllllIlIIIII[StatList.lIlllllIlIlIll[101]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[StatList.lIlllllIlIlIll[1]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[StatList.lIlllllIlIlIll[0]] = new ItemStack(llllllllllllIllllIIllIIlIIlIlllI).getChatComponent();
                mineBlockStatArray[n] = new StatCrafting(lllllllllllllIIIlIllIlIIllllIIIl, lllllllllllllIIIlIllIlIIllllIIII, new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl), llllllllllllIllllIIllIIlIIlIllIl).registerStat();
                StatList.objectMineStats.add((StatCrafting)StatList.mineBlockStatArray[llllllllllllIllllIIllIIlIIlIllII]);
                "".length();
            }
        }
        replaceAllSimilarBlocks(StatList.mineBlockStatArray);
    }
}
