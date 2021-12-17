// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Collection;
import net.minecraft.util.IntegerCache;
import com.google.common.collect.Lists;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

public class PotionHelper
{
    private static final /* synthetic */ Map<Integer, String> potionAmplifiers;
    private static final /* synthetic */ String[] lllIlIlllIIIlI;
    private static final /* synthetic */ String[] potionPrefixes;
    private static final /* synthetic */ Map<Integer, String> potionRequirements;
    private static final /* synthetic */ Map<Integer, Integer> DATAVALUE_COLORS;
    private static final /* synthetic */ int[] lllIlIllllIIIl;
    
    private static String lIlIIIllIllIllll(String llllllllllllIlIllIlIIIlllIllIllI, final String llllllllllllIlIllIlIIIlllIlllIlI) {
        llllllllllllIlIllIlIIIlllIllIllI = new String(Base64.getDecoder().decode(llllllllllllIlIllIlIIIlllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIIlllIlllIIl = new StringBuilder();
        final char[] llllllllllllIlIllIlIIIlllIlllIII = llllllllllllIlIllIlIIIlllIlllIlI.toCharArray();
        int llllllllllllIlIllIlIIIlllIllIlll = PotionHelper.lllIlIllllIIIl[0];
        final byte llllllllllllIlIllIlIIIlllIllIIIl = (Object)llllllllllllIlIllIlIIIlllIllIllI.toCharArray();
        final char llllllllllllIlIllIlIIIlllIllIIII = (char)llllllllllllIlIllIlIIIlllIllIIIl.length;
        double llllllllllllIlIllIlIIIlllIlIllll = PotionHelper.lllIlIllllIIIl[0];
        while (lIlIIIlllIlIIIIl((int)llllllllllllIlIllIlIIIlllIlIllll, llllllllllllIlIllIlIIIlllIllIIII)) {
            final char llllllllllllIlIllIlIIIlllIllllII = llllllllllllIlIllIlIIIlllIllIIIl[llllllllllllIlIllIlIIIlllIlIllll];
            llllllllllllIlIllIlIIIlllIlllIIl.append((char)(llllllllllllIlIllIlIIIlllIllllII ^ llllllllllllIlIllIlIIIlllIlllIII[llllllllllllIlIllIlIIIlllIllIlll % llllllllllllIlIllIlIIIlllIlllIII.length]));
            "".length();
            ++llllllllllllIlIllIlIIIlllIllIlll;
            ++llllllllllllIlIllIlIIIlllIlIllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIIlllIlllIIl);
    }
    
    private static boolean lIlIIIlllIlIIIlI(final int llllllllllllIlIllIlIIIlllIIIllII) {
        return llllllllllllIlIllIlIIIlllIIIllII <= 0;
    }
    
    private static boolean lIlIIIlllIlIIIIl(final int llllllllllllIlIllIlIIIlllIlIIIll, final int llllllllllllIlIllIlIIIlllIlIIIlI) {
        return llllllllllllIlIllIlIIIlllIlIIIll < llllllllllllIlIllIlIIIlllIlIIIlI;
    }
    
    public static List<PotionEffect> getPotionEffects(final int llllllllllllIlIllIlIIlIIIIlIllIl, final boolean llllllllllllIlIllIlIIlIIIIllIlIl) {
        List<PotionEffect> llllllllllllIlIllIlIIlIIIIllIlII = null;
        final Exception llllllllllllIlIllIlIIlIIIIlIIlll;
        final short llllllllllllIlIllIlIIlIIIIlIlIII = (short)((Potion[])(Object)(llllllllllllIlIllIlIIlIIIIlIIlll = (Exception)(Object)Potion.potionTypes)).length;
        char llllllllllllIlIllIlIIlIIIIlIlIIl = (char)PotionHelper.lllIlIllllIIIl[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIIlllIlIIlIl(llllllllllllIlIllIlIIlIIIIlIlIIl, llllllllllllIlIllIlIIlIIIIlIlIII)) {
            final Potion llllllllllllIlIllIlIIlIIIIllIIll = llllllllllllIlIllIlIIlIIIIlIIlll[llllllllllllIlIllIlIIlIIIIlIlIIl];
            if (lIlIIIlllIIlllII(llllllllllllIlIllIlIIlIIIIllIIll) && (!lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIllIIll.isUsable() ? 1 : 0) || lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIllIlIl ? 1 : 0))) {
                final String llllllllllllIlIllIlIIlIIIIllIIlI = PotionHelper.potionRequirements.get(llllllllllllIlIllIlIIlIIIIllIIll.getId());
                if (lIlIIIlllIIlllII(llllllllllllIlIllIlIIlIIIIllIIlI)) {
                    int llllllllllllIlIllIlIIlIIIIllIIIl = parsePotionEffects(llllllllllllIlIllIlIIlIIIIllIIlI, PotionHelper.lllIlIllllIIIl[0], llllllllllllIlIllIlIIlIIIIllIIlI.length(), llllllllllllIlIllIlIIlIIIIlIllIl);
                    if (lIlIIIlllIlIIlII(llllllllllllIlIllIlIIlIIIIllIIIl)) {
                        int llllllllllllIlIllIlIIlIIIIllIIII = PotionHelper.lllIlIllllIIIl[0];
                        final String llllllllllllIlIllIlIIlIIIIlIllll = PotionHelper.potionAmplifiers.get(llllllllllllIlIllIlIIlIIIIllIIll.getId());
                        if (lIlIIIlllIIlllII(llllllllllllIlIllIlIIlIIIIlIllll)) {
                            llllllllllllIlIllIlIIlIIIIllIIII = parsePotionEffects(llllllllllllIlIllIlIIlIIIIlIllll, PotionHelper.lllIlIllllIIIl[0], llllllllllllIlIllIlIIlIIIIlIllll.length(), llllllllllllIlIllIlIIlIIIIlIllIl);
                            if (lIlIIIlllIlIIlll(llllllllllllIlIllIlIIlIIIIllIIII)) {
                                llllllllllllIlIllIlIIlIIIIllIIII = PotionHelper.lllIlIllllIIIl[0];
                            }
                        }
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIllIIll.isInstant() ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIIllIIIl = PotionHelper.lllIlIllllIIIl[1];
                            "".length();
                            if (((0x50 ^ 0x17 ^ (0x4E ^ 0x1C)) & (119 + 81 - 76 + 57 ^ 150 + 136 - 184 + 58 ^ -" ".length())) < 0) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllIlIIlIIIIllIIIl = PotionHelper.lllIlIllllIIIl[71] * (llllllllllllIlIllIlIIlIIIIllIIIl * PotionHelper.lllIlIllllIIIl[3] + (llllllllllllIlIllIlIIlIIIIllIIIl - PotionHelper.lllIlIllllIIIl[1]) * PotionHelper.lllIlIllllIIIl[2]);
                            llllllllllllIlIllIlIIlIIIIllIIIl >>= llllllllllllIlIllIlIIlIIIIllIIII;
                            llllllllllllIlIllIlIIlIIIIllIIIl = (int)Math.round(llllllllllllIlIllIlIIlIIIIllIIIl * llllllllllllIlIllIlIIlIIIIllIIll.getEffectiveness());
                            if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIlIllIl & PotionHelper.lllIlIllllIIIl[72])) {
                                llllllllllllIlIllIlIIlIIIIllIIIl = (int)Math.round(llllllllllllIlIllIlIIlIIIIllIIIl * 0.75 + 0.5);
                            }
                        }
                        if (lIlIIIlllIlIlIII(llllllllllllIlIllIlIIlIIIIllIlII)) {
                            llllllllllllIlIllIlIIlIIIIllIlII = (List<PotionEffect>)Lists.newArrayList();
                        }
                        final PotionEffect llllllllllllIlIllIlIIlIIIIlIlllI = new PotionEffect(llllllllllllIlIllIlIIlIIIIllIIll.getId(), llllllllllllIlIllIlIIlIIIIllIIIl, llllllllllllIlIllIlIIlIIIIllIIII);
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIlIllIl & PotionHelper.lllIlIllllIIIl[72])) {
                            llllllllllllIlIllIlIIlIIIIlIlllI.setSplashPotion((boolean)(PotionHelper.lllIlIllllIIIl[1] != 0));
                        }
                        llllllllllllIlIllIlIIlIIIIllIlII.add(llllllllllllIlIllIlIIlIIIIlIlllI);
                        "".length();
                    }
                }
            }
            ++llllllllllllIlIllIlIIlIIIIlIlIIl;
        }
        return llllllllllllIlIllIlIIlIIIIllIlII;
    }
    
    public static int getPotionPrefixIndex(final int llllllllllllIlIllIlIIlIIllIlIlIl) {
        return func_77908_a(llllllllllllIlIllIlIIlIIllIlIlIl, PotionHelper.lllIlIllllIIIl[5], PotionHelper.lllIlIllllIIIl[4], PotionHelper.lllIlIllllIIIl[3], PotionHelper.lllIlIllllIIIl[2], PotionHelper.lllIlIllllIIIl[1]);
    }
    
    private static int func_77904_a(final boolean llllllllllllIlIllIlIIlIIlIIIllll, final boolean llllllllllllIlIllIlIIlIIlIIIIllI, final boolean llllllllllllIlIllIlIIlIIlIIIIlIl, final int llllllllllllIlIllIlIIlIIlIIIllII, final int llllllllllllIlIllIlIIlIIlIIIIIll, final int llllllllllllIlIllIlIIlIIlIIIIIlI, final int llllllllllllIlIllIlIIlIIlIIIlIIl) {
        int llllllllllllIlIllIlIIlIIlIIIlIII = PotionHelper.lllIlIllllIIIl[0];
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIlIIIllll ? 1 : 0)) {
            llllllllllllIlIllIlIIlIIlIIIlIII = isFlagUnset(llllllllllllIlIllIlIIlIIlIIIlIIl, llllllllllllIlIllIlIIlIIlIIIIIll);
            "".length();
            if ((0x8F ^ 0x8B) <= "   ".length()) {
                return (0x8B ^ 0xC6) & ~(0x39 ^ 0x74);
            }
        }
        else if (lIlIIIlllIIlllll(llllllllllllIlIllIlIIlIIlIIIllII, PotionHelper.lllIlIllllIIIl[69])) {
            if (lIlIIIlllIIlllIl(llllllllllllIlIllIlIIlIIlIIIllII) && lIlIIIlllIlIIIII(countSetFlags(llllllllllllIlIllIlIIlIIlIIIlIIl), llllllllllllIlIllIlIIlIIlIIIIIll)) {
                llllllllllllIlIllIlIIlIIlIIIlIII = PotionHelper.lllIlIllllIIIl[1];
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return (0x7E ^ 0x45 ^ (0x48 ^ 0x59)) & (0xD4 ^ 0x88 ^ (0x63 ^ 0x15) ^ -" ".length());
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIlIIIllII, PotionHelper.lllIlIllllIIIl[1]) && lIlIIIlllIIllllI(countSetFlags(llllllllllllIlIllIlIIlIIlIIIlIIl), llllllllllllIlIllIlIIlIIlIIIIIll)) {
                llllllllllllIlIllIlIIlIIlIIIlIII = PotionHelper.lllIlIllllIIIl[1];
                "".length();
                if (((5 + 58 + 105 + 6 ^ 86 + 7 - 47 + 125) & (151 + 66 - 133 + 112 ^ 71 + 142 - 200 + 180 ^ -" ".length())) == "  ".length()) {
                    return (0xD ^ 0x44 ^ (0x48 ^ 0x30)) & (73 + 98 - 126 + 91 ^ 135 + 44 - 93 + 99 ^ -" ".length());
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIlIIIllII, PotionHelper.lllIlIllllIIIl[2]) && lIlIIIlllIlIIIIl(countSetFlags(llllllllllllIlIllIlIIlIIlIIIlIIl), llllllllllllIlIllIlIIlIIlIIIIIll)) {
                llllllllllllIlIllIlIIlIIlIIIlIII = PotionHelper.lllIlIllllIIIl[1];
                "".length();
                if (" ".length() == "  ".length()) {
                    return (118 + 175 - 248 + 160 ^ 176 + 58 - 58 + 22) & (0xD0 ^ 0xBF ^ (0xE5 ^ 0x81) ^ -" ".length());
                }
            }
        }
        else {
            llllllllllllIlIllIlIIlIIlIIIlIII = isFlagSet(llllllllllllIlIllIlIIlIIlIIIlIIl, llllllllllllIlIllIlIIlIIlIIIIIll);
        }
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIlIIIIllI ? 1 : 0)) {
            llllllllllllIlIllIlIIlIIlIIIlIII *= llllllllllllIlIllIlIIlIIlIIIIIlI;
        }
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIlIIIIlIl ? 1 : 0)) {
            llllllllllllIlIllIlIIlIIlIIIlIII *= PotionHelper.lllIlIllllIIIl[69];
        }
        return llllllllllllIlIllIlIIlIIlIIIlIII;
    }
    
    public static int getLiquidColor(final int llllllllllllIlIllIlIIlIIlIlIIIIl, final boolean llllllllllllIlIllIlIIlIIlIlIIIII) {
        final Integer llllllllllllIlIllIlIIlIIlIlIIIll = IntegerCache.func_181756_a(llllllllllllIlIllIlIIlIIlIlIIIIl);
        if (!lIlIIIlllIIlllIl(llllllllllllIlIllIlIIlIIlIlIIIII ? 1 : 0)) {
            return calcPotionLiquidColor(getPotionEffects(llllllllllllIlIllIlIIlIIlIlIIIll, (boolean)(PotionHelper.lllIlIllllIIIl[1] != 0)));
        }
        if (lIlIIIlllIIllIlI(PotionHelper.DATAVALUE_COLORS.containsKey(llllllllllllIlIllIlIIlIIlIlIIIll) ? 1 : 0)) {
            return PotionHelper.DATAVALUE_COLORS.get(llllllllllllIlIllIlIIlIIlIlIIIll);
        }
        final int llllllllllllIlIllIlIIlIIlIlIIIlI = calcPotionLiquidColor(getPotionEffects(llllllllllllIlIllIlIIlIIlIlIIIll, (boolean)(PotionHelper.lllIlIllllIIIl[0] != 0)));
        PotionHelper.DATAVALUE_COLORS.put(llllllllllllIlIllIlIIlIIlIlIIIll, llllllllllllIlIllIlIIlIIlIlIIIlI);
        "".length();
        return llllllllllllIlIllIlIIlIIlIlIIIlI;
    }
    
    public static int func_77908_a(final int llllllllllllIlIllIlIIIlllllIIlIl, final int llllllllllllIlIllIlIIIlllllIlIlI, final int llllllllllllIlIllIlIIIlllllIIIll, final int llllllllllllIlIllIlIIIlllllIlIII, final int llllllllllllIlIllIlIIIlllllIIlll, final int llllllllllllIlIllIlIIIlllllIIIII) {
        int n;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIIlllllIIlIl, llllllllllllIlIllIlIIIlllllIlIlI) ? 1 : 0)) {
            n = PotionHelper.lllIlIllllIIIl[17];
            "".length();
            if (-" ".length() >= " ".length()) {
                return (0xB6 ^ 0xB0) & ~(0xA6 ^ 0xA0);
            }
        }
        else {
            n = PotionHelper.lllIlIllllIIIl[0];
        }
        int n2;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIIlllllIIlIl, llllllllllllIlIllIlIIIlllllIIIll) ? 1 : 0)) {
            n2 = PotionHelper.lllIlIllllIIIl[8];
            "".length();
            if (" ".length() < 0) {
                return (0xF ^ 0x6B ^ (0xCA ^ 0x8F)) & (40 + 57 + 30 + 40 ^ 108 + 72 - 171 + 125 ^ -" ".length());
            }
        }
        else {
            n2 = PotionHelper.lllIlIllllIIIl[0];
        }
        final int n3 = n | n2;
        int n4;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIIlllllIIlIl, llllllllllllIlIllIlIIIlllllIlIII) ? 1 : 0)) {
            n4 = PotionHelper.lllIlIllllIIIl[4];
            "".length();
            if (((111 + 33 - 40 + 23 ^ (0xF0 ^ 0x86)) & (0x80 ^ 0x92 ^ (0x29 ^ 0x32) ^ -" ".length())) <= -" ".length()) {
                return (0xD0 ^ 0xB9 ^ (0x5B ^ 0x27)) & (0x76 ^ 0x78 ^ (0xDF ^ 0xC4) ^ -" ".length());
            }
        }
        else {
            n4 = PotionHelper.lllIlIllllIIIl[0];
        }
        final int n5 = n3 | n4;
        int n6;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIIlllllIIlIl, llllllllllllIlIllIlIIIlllllIIlll) ? 1 : 0)) {
            n6 = PotionHelper.lllIlIllllIIIl[2];
            "".length();
            if (((0x61 ^ 0x76) & ~(0xD5 ^ 0xC2)) != 0x0) {
                return (0x82 ^ 0x85) & ~(0x5D ^ 0x5A);
            }
        }
        else {
            n6 = PotionHelper.lllIlIllllIIIl[0];
        }
        final int n7 = n5 | n6;
        int n8;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIIlllllIIlIl, llllllllllllIlIllIlIIIlllllIIIII) ? 1 : 0)) {
            n8 = PotionHelper.lllIlIllllIIIl[1];
            "".length();
            if ((0x17 ^ 0x46 ^ (0x60 ^ 0x35)) <= "   ".length()) {
                return (4 + 51 + 44 + 118 ^ 144 + 57 - 102 + 50) & (0x59 ^ 0x5F ^ (0xD7 ^ 0x9D) ^ -" ".length());
            }
        }
        else {
            n8 = PotionHelper.lllIlIllllIIIl[0];
        }
        return n7 | n8;
    }
    
    private static int isFlagSet(final int llllllllllllIlIllIlIIlIIlllIlIII, final int llllllllllllIlIllIlIIlIIlllIIllI) {
        int n;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIlIIlllIlIII, llllllllllllIlIllIlIIlIIlllIIllI) ? 1 : 0)) {
            n = PotionHelper.lllIlIllllIIIl[1];
            "".length();
            if (((0xAF ^ 0x99) & ~(0x94 ^ 0xA2)) != 0x0) {
                return (0x16 ^ 0x42) & ~(0xE9 ^ 0xBD);
            }
        }
        else {
            n = PotionHelper.lllIlIllllIIIl[0];
        }
        return n;
    }
    
    private static boolean lIlIIIlllIlIIIII(final int llllllllllllIlIllIlIIIlllIlIlIll, final int llllllllllllIlIllIlIIIlllIlIlIlI) {
        return llllllllllllIlIllIlIIIlllIlIlIll == llllllllllllIlIllIlIIIlllIlIlIlI;
    }
    
    private static boolean lIlIIIlllIIlllII(final Object llllllllllllIlIllIlIIIlllIIllIII) {
        return llllllllllllIlIllIlIIIlllIIllIII != null;
    }
    
    private static boolean lIlIIIlllIlIlIII(final Object llllllllllllIlIllIlIIIlllIIlIllI) {
        return llllllllllllIlIllIlIIIlllIIlIllI == null;
    }
    
    private static boolean lIlIIIlllIIlllIl(final int llllllllllllIlIllIlIIIlllIIlIIlI) {
        return llllllllllllIlIllIlIIIlllIIlIIlI == 0;
    }
    
    private static boolean lIlIIIlllIlIIllI(final int llllllllllllIlIllIlIIIlllIIlllll, final int llllllllllllIlIllIlIIIlllIIllllI) {
        return llllllllllllIlIllIlIIIlllIIlllll <= llllllllllllIlIllIlIIIlllIIllllI;
    }
    
    public static int applyIngredient(int llllllllllllIlIllIlIIIllllllllII, final String llllllllllllIlIllIlIIIlllllllIll) {
        final int llllllllllllIlIllIlIIlIIIIIIIlIl = PotionHelper.lllIlIllllIIIl[0];
        final int llllllllllllIlIllIlIIlIIIIIIIlII = llllllllllllIlIllIlIIIlllllllIll.length();
        boolean llllllllllllIlIllIlIIlIIIIIIIIll = PotionHelper.lllIlIllllIIIl[0] != 0;
        boolean llllllllllllIlIllIlIIlIIIIIIIIlI = PotionHelper.lllIlIllllIIIl[0] != 0;
        boolean llllllllllllIlIllIlIIlIIIIIIIIIl = PotionHelper.lllIlIllllIIIl[0] != 0;
        boolean llllllllllllIlIllIlIIlIIIIIIIIII = PotionHelper.lllIlIllllIIIl[0] != 0;
        int llllllllllllIlIllIlIIIllllllllll = PotionHelper.lllIlIllllIIIl[0];
        int llllllllllllIlIllIlIIIlllllllllI = llllllllllllIlIllIlIIlIIIIIIIlIl;
        "".length();
        if (-"   ".length() >= 0) {
            return (0xAB ^ 0x81) & ~(0x85 ^ 0xAF);
        }
        while (!lIlIIIlllIlIIlIl(llllllllllllIlIllIlIIIlllllllllI, llllllllllllIlIllIlIIlIIIIIIIlII)) {
            final char llllllllllllIlIllIlIIIllllllllIl = llllllllllllIlIllIlIIIlllllllIll.charAt(llllllllllllIlIllIlIIIlllllllllI);
            if (lIlIIIlllIlIIlIl(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[48]) && lIlIIIlllIlIIllI(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[57])) {
                llllllllllllIlIllIlIIIllllllllll *= PotionHelper.lllIlIllllIIIl[10];
                llllllllllllIlIllIlIIIllllllllll += llllllllllllIlIllIlIIIllllllllIl - PotionHelper.lllIlIllllIIIl[48];
                llllllllllllIlIllIlIIlIIIIIIIIll = (PotionHelper.lllIlIllllIIIl[1] != 0);
                "".length();
                if ("  ".length() == -" ".length()) {
                    return "  ".length() & ~"  ".length();
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[33])) {
                if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIIIIll ? 1 : 0)) {
                    llllllllllllIlIllIlIIIllllllllII = brewBitOperations(llllllllllllIlIllIlIIIllllllllII, llllllllllllIlIllIlIIIllllllllll, llllllllllllIlIllIlIIlIIIIIIIIIl, llllllllllllIlIllIlIIlIIIIIIIIlI, llllllllllllIlIllIlIIlIIIIIIIIII);
                    llllllllllllIlIllIlIIlIIIIIIIIII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIIllllllllll = PotionHelper.lllIlIllllIIIl[0];
                }
                llllllllllllIlIllIlIIlIIIIIIIIlI = (PotionHelper.lllIlIllllIIIl[1] != 0);
                "".length();
                if ((73 + 103 - 85 + 51 ^ 2 + 52 - 11 + 95) <= " ".length()) {
                    return (66 + 121 - 169 + 169 ^ 67 + 62 + 36 + 12) & (81 + 21 - 96 + 136 ^ 9 + 107 + 15 + 1 ^ -" ".length());
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[45])) {
                if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIIIIll ? 1 : 0)) {
                    llllllllllllIlIllIlIIIllllllllII = brewBitOperations(llllllllllllIlIllIlIIIllllllllII, llllllllllllIlIllIlIIIllllllllll, llllllllllllIlIllIlIIlIIIIIIIIIl, llllllllllllIlIllIlIIlIIIIIIIIlI, llllllllllllIlIllIlIIlIIIIIIIIII);
                    llllllllllllIlIllIlIIlIIIIIIIIII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIIllllllllll = PotionHelper.lllIlIllllIIIl[0];
                }
                llllllllllllIlIllIlIIlIIIIIIIIIl = (PotionHelper.lllIlIllllIIIl[1] != 0);
                "".length();
                if (null != null) {
                    return (0xBE ^ 0xB5) & ~(0x7F ^ 0x74);
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[43])) {
                if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIIIIll ? 1 : 0)) {
                    llllllllllllIlIllIlIIIllllllllII = brewBitOperations(llllllllllllIlIllIlIIIllllllllII, llllllllllllIlIllIlIIIllllllllll, llllllllllllIlIllIlIIlIIIIIIIIIl, llllllllllllIlIllIlIIlIIIIIIIIlI, llllllllllllIlIllIlIIlIIIIIIIIII);
                    llllllllllllIlIllIlIIlIIIIIIIIII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIIllllllllll = PotionHelper.lllIlIllllIIIl[0];
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return (0x59 ^ 0x8) & ~(0x6 ^ 0x57);
                    }
                }
            }
            else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIIllllllllIl, PotionHelper.lllIlIllllIIIl[38])) {
                if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIIIIll ? 1 : 0)) {
                    llllllllllllIlIllIlIIIllllllllII = brewBitOperations(llllllllllllIlIllIlIIIllllllllII, llllllllllllIlIllIlIIIllllllllll, llllllllllllIlIllIlIIlIIIIIIIIIl, llllllllllllIlIllIlIIlIIIIIIIIlI, llllllllllllIlIllIlIIlIIIIIIIIII);
                    llllllllllllIlIllIlIIlIIIIIIIIII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIlIIIIIIIIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                    llllllllllllIlIllIlIIIllllllllll = PotionHelper.lllIlIllllIIIl[0];
                }
                llllllllllllIlIllIlIIlIIIIIIIIII = (PotionHelper.lllIlIllllIIIl[1] != 0);
            }
            ++llllllllllllIlIllIlIIIlllllllllI;
        }
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIIIIll ? 1 : 0)) {
            llllllllllllIlIllIlIIIllllllllII = brewBitOperations(llllllllllllIlIllIlIIIllllllllII, llllllllllllIlIllIlIIIllllllllll, llllllllllllIlIllIlIIlIIIIIIIIIl, llllllllllllIlIllIlIIlIIIIIIIIlI, llllllllllllIlIllIlIIlIIIIIIIIII);
        }
        return llllllllllllIlIllIlIIIllllllllII & PotionHelper.lllIlIllllIIIl[73];
    }
    
    private static int brewBitOperations(int llllllllllllIlIllIlIIlIIIIIlIlll, final int llllllllllllIlIllIlIIlIIIIIllIll, final boolean llllllllllllIlIllIlIIlIIIIIllIlI, final boolean llllllllllllIlIllIlIIlIIIIIlIlII, final boolean llllllllllllIlIllIlIIlIIIIIlIIll) {
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIlIIll ? 1 : 0)) {
            if (lIlIIIlllIIlllIl(checkFlag(llllllllllllIlIllIlIIlIIIIIlIlll, llllllllllllIlIllIlIIlIIIIIllIll) ? 1 : 0)) {
                return PotionHelper.lllIlIllllIIIl[0];
            }
        }
        else if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIllIlI ? 1 : 0)) {
            llllllllllllIlIllIlIIlIIIIIlIlll &= (PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIIIIllIll ^ PotionHelper.lllIlIllllIIIl[69]);
            "".length();
            if (((0x41 ^ 0x5) & ~(0xCC ^ 0x88)) != 0x0) {
                return (0x45 ^ 0x6D) & ~(0xBB ^ 0x93);
            }
        }
        else if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIIIlIlII ? 1 : 0)) {
            if (lIlIIIlllIIlllIl(llllllllllllIlIllIlIIlIIIIIlIlll & PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIIIIllIll)) {
                llllllllllllIlIllIlIIlIIIIIlIlll |= PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIIIIllIll;
                "".length();
                if (((0x53 ^ 0x71) & ~(0x98 ^ 0xBA)) == "  ".length()) {
                    return (0x5 ^ 0x12) & ~(0xB ^ 0x1C);
                }
            }
            else {
                llllllllllllIlIllIlIIlIIIIIlIlll &= (PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIIIIllIll ^ PotionHelper.lllIlIllllIIIl[69]);
                "".length();
                if (-" ".length() > 0) {
                    return (0x78 ^ 0x57) & ~(0xB7 ^ 0x98);
                }
            }
        }
        else {
            llllllllllllIlIllIlIIlIIIIIlIlll |= PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIIIIllIll;
        }
        return llllllllllllIlIllIlIIlIIIIIlIlll;
    }
    
    private static int parsePotionEffects(final String llllllllllllIlIllIlIIlIIIllIlIII, final int llllllllllllIlIllIlIIlIIIllIIlll, final int llllllllllllIlIllIlIIlIIIlIlIIIl, final int llllllllllllIlIllIlIIlIIIlIlIIII) {
        if (!lIlIIIlllIlIIIIl(llllllllllllIlIllIlIIlIIIllIIlll, llllllllllllIlIllIlIIlIIIllIlIII.length()) || !lIlIIIlllIlIIIll(llllllllllllIlIllIlIIlIIIlIlIIIl) || !lIlIIIlllIlIIIIl(llllllllllllIlIllIlIIlIIIllIIlll, llllllllllllIlIllIlIIlIIIlIlIIIl)) {
            return PotionHelper.lllIlIllllIIIl[0];
        }
        final int llllllllllllIlIllIlIIlIIIllIIlII = llllllllllllIlIllIlIIlIIIllIlIII.indexOf(PotionHelper.lllIlIllllIIIl[70], llllllllllllIlIllIlIIlIIIllIIlll);
        if (lIlIIIlllIlIIIll(llllllllllllIlIllIlIIlIIIllIIlII) && lIlIIIlllIlIIIIl(llllllllllllIlIllIlIIlIIIllIIlII, llllllllllllIlIllIlIIlIIIlIlIIIl)) {
            final int llllllllllllIlIllIlIIlIIIllIIIll = parsePotionEffects(llllllllllllIlIllIlIIlIIIllIlIII, llllllllllllIlIllIlIIlIIIllIIlll, llllllllllllIlIllIlIIlIIIllIIlII - PotionHelper.lllIlIllllIIIl[1], llllllllllllIlIllIlIIlIIIlIlIIII);
            if (lIlIIIlllIlIIlII(llllllllllllIlIllIlIIlIIIllIIIll)) {
                return llllllllllllIlIllIlIIlIIIllIIIll;
            }
            final int llllllllllllIlIllIlIIlIIIllIIIlI = parsePotionEffects(llllllllllllIlIllIlIIlIIIllIlIII, llllllllllllIlIllIlIIlIIIllIIlII + PotionHelper.lllIlIllllIIIl[1], llllllllllllIlIllIlIIlIIIlIlIIIl, llllllllllllIlIllIlIIlIIIlIlIIII);
            int n;
            if (lIlIIIlllIlIIlII(llllllllllllIlIllIlIIlIIIllIIIlI)) {
                n = llllllllllllIlIllIlIIlIIIllIIIlI;
                "".length();
                if ((0x3D ^ 0x63 ^ (0x2E ^ 0x74)) == 0x0) {
                    return (0xE5 ^ 0xAD ^ (0x5E ^ 0x49)) & (0xF9 ^ 0x9E ^ (0xFF ^ 0xC7) ^ -" ".length());
                }
            }
            else {
                n = PotionHelper.lllIlIllllIIIl[0];
            }
            return n;
        }
        else {
            final int llllllllllllIlIllIlIIlIIIllIIIIl = llllllllllllIlIllIlIIlIIIllIlIII.indexOf(PotionHelper.lllIlIllllIIIl[38], llllllllllllIlIllIlIIlIIIllIIlll);
            if (lIlIIIlllIlIIIll(llllllllllllIlIllIlIIlIIIllIIIIl) && lIlIIIlllIlIIIIl(llllllllllllIlIllIlIIlIIIllIIIIl, llllllllllllIlIllIlIIlIIIlIlIIIl)) {
                final int llllllllllllIlIllIlIIlIIIllIIIII = parsePotionEffects(llllllllllllIlIllIlIIlIIIllIlIII, llllllllllllIlIllIlIIlIIIllIIlll, llllllllllllIlIllIlIIlIIIllIIIIl - PotionHelper.lllIlIllllIIIl[1], llllllllllllIlIllIlIIlIIIlIlIIII);
                if (lIlIIIlllIlIIIlI(llllllllllllIlIllIlIIlIIIllIIIII)) {
                    return PotionHelper.lllIlIllllIIIl[0];
                }
                final int llllllllllllIlIllIlIIlIIIlIlllll = parsePotionEffects(llllllllllllIlIllIlIIlIIIllIlIII, llllllllllllIlIllIlIIlIIIllIIIIl + PotionHelper.lllIlIllllIIIl[1], llllllllllllIlIllIlIIlIIIlIlIIIl, llllllllllllIlIllIlIIlIIIlIlIIII);
                int n2;
                if (lIlIIIlllIlIIIlI(llllllllllllIlIllIlIIlIIIlIlllll)) {
                    n2 = PotionHelper.lllIlIllllIIIl[0];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return (146 + 76 - 161 + 112 ^ 77 + 135 - 206 + 136) & (0x42 ^ 0xB ^ (0x43 ^ 0x29) ^ -" ".length());
                    }
                }
                else if (lIlIIIlllIIllllI(llllllllllllIlIllIlIIlIIIllIIIII, llllllllllllIlIllIlIIlIIIlIlllll)) {
                    n2 = llllllllllllIlIllIlIIlIIIllIIIII;
                    "".length();
                    if ((142 + 118 - 196 + 123 ^ 25 + 16 + 74 + 76) < (168 + 196 - 320 + 155 ^ 124 + 9 + 51 + 11)) {
                        return (0xC7 ^ 0xBE ^ (0x81 ^ 0xC1)) & (0x7B ^ 0x6C ^ (0x5 ^ 0x2B) ^ -" ".length()) & (((0x63 ^ 0x68 ^ (0x79 ^ 0x54)) & (0xE3 ^ 0xAF ^ (0x3B ^ 0x51) ^ -" ".length())) ^ -" ".length());
                    }
                }
                else {
                    n2 = llllllllllllIlIllIlIIlIIIlIlllll;
                }
                return n2;
            }
            else {
                boolean llllllllllllIlIllIlIIlIIIlIllllI = PotionHelper.lllIlIllllIIIl[0] != 0;
                boolean llllllllllllIlIllIlIIlIIIlIlllIl = PotionHelper.lllIlIllllIIIl[0] != 0;
                boolean llllllllllllIlIllIlIIlIIIlIlllII = PotionHelper.lllIlIllllIIIl[0] != 0;
                boolean llllllllllllIlIllIlIIlIIIlIllIll = PotionHelper.lllIlIllllIIIl[0] != 0;
                boolean llllllllllllIlIllIlIIlIIIlIllIlI = PotionHelper.lllIlIllllIIIl[0] != 0;
                int llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[69];
                int llllllllllllIlIllIlIIlIIIlIllIII = PotionHelper.lllIlIllllIIIl[0];
                int llllllllllllIlIllIlIIlIIIlIlIlll = PotionHelper.lllIlIllllIIIl[0];
                int llllllllllllIlIllIlIIlIIIlIlIllI = PotionHelper.lllIlIllllIIIl[0];
                int llllllllllllIlIllIlIIlIIIlIlIlIl = llllllllllllIlIllIlIIlIIIllIIlll;
                "".length();
                if ("  ".length() < 0) {
                    return (0x8A ^ 0xB6) & ~(0xD ^ 0x31);
                }
                while (!lIlIIIlllIlIIlIl(llllllllllllIlIllIlIIlIIIlIlIlIl, llllllllllllIlIllIlIIlIIIlIlIIIl)) {
                    final char llllllllllllIlIllIlIIlIIIlIlIlII = llllllllllllIlIllIlIIlIIIllIlIII.charAt(llllllllllllIlIllIlIIlIIIlIlIlIl);
                    if (lIlIIIlllIlIIlIl(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[48]) && lIlIIIlllIlIIllI(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[57])) {
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIllllI ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIlIlIlll = llllllllllllIlIllIlIIlIIIlIlIlII - PotionHelper.lllIlIllllIIIl[48];
                            llllllllllllIlIllIlIIlIIIlIlllIl = (PotionHelper.lllIlIllllIIIl[1] != 0);
                            "".length();
                            if ((0x59 ^ 0x5D) == "  ".length()) {
                                return (0x12 ^ 0x51) & ~(0x87 ^ 0xC4);
                            }
                        }
                        else {
                            llllllllllllIlIllIlIIlIIIlIllIII *= PotionHelper.lllIlIllllIIIl[10];
                            llllllllllllIlIllIlIIlIIIlIllIII += llllllllllllIlIllIlIIlIIIlIlIlII - PotionHelper.lllIlIllllIIIl[48];
                            llllllllllllIlIllIlIIlIIIlIlllII = (PotionHelper.lllIlIllllIIIl[1] != 0);
                            "".length();
                            if (-(0x31 ^ 0x34) >= 0) {
                                return (0xDD ^ 0x86) & ~(0x78 ^ 0x23);
                            }
                        }
                    }
                    else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[42])) {
                        llllllllllllIlIllIlIIlIIIlIllllI = (PotionHelper.lllIlIllllIIIl[1] != 0);
                        "".length();
                        if (-" ".length() >= (0xE4 ^ 0x8C ^ (0x27 ^ 0x4B))) {
                            return (169 + 139 - 159 + 72 ^ 21 + 44 - 9 + 134) & (0xA6 ^ 0xA9 ^ (0x77 ^ 0x1B) ^ -" ".length());
                        }
                    }
                    else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[33])) {
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIlllII ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIlIlIllI += func_77904_a(llllllllllllIlIllIlIIlIIIlIllIll, llllllllllllIlIllIlIIlIIIlIlllIl, llllllllllllIlIllIlIIlIIIlIllIlI, llllllllllllIlIllIlIIlIIIlIllIIl, llllllllllllIlIllIlIIlIIIlIllIII, llllllllllllIlIllIlIIlIIIlIlIlll, llllllllllllIlIllIlIIlIIIlIlIIII);
                            llllllllllllIlIllIlIIlIIIlIllIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllllI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlIlll = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIII = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[69];
                        }
                        llllllllllllIlIllIlIIlIIIlIllIll = (PotionHelper.lllIlIllllIIIl[1] != 0);
                        "".length();
                        if (" ".length() < " ".length()) {
                            return (0x71 ^ 0xD ^ (0xCF ^ 0xBE)) & (136 + 96 - 182 + 114 ^ 60 + 129 - 127 + 107 ^ -" ".length());
                        }
                    }
                    else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[45])) {
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIlllII ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIlIlIllI += func_77904_a(llllllllllllIlIllIlIIlIIIlIllIll, llllllllllllIlIllIlIIlIIIlIlllIl, llllllllllllIlIllIlIIlIIIlIllIlI, llllllllllllIlIllIlIIlIIIlIllIIl, llllllllllllIlIllIlIIlIIIlIllIII, llllllllllllIlIllIlIIlIIIlIlIlll, llllllllllllIlIllIlIIlIIIlIlIIII);
                            llllllllllllIlIllIlIIlIIIlIllIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllllI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlIlll = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIII = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[69];
                        }
                        llllllllllllIlIllIlIIlIIIlIllIlI = (PotionHelper.lllIlIllllIIIl[1] != 0);
                        "".length();
                        if (("   ".length() & ("   ".length() ^ -" ".length())) != 0x0) {
                            return (0x53 ^ 0x44 ^ (0x82 ^ 0xB8)) & (13 + 127 - 88 + 96 ^ 177 + 42 - 93 + 59 ^ -" ".length());
                        }
                    }
                    else if (lIlIIIlllIIlllll(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[61]) && lIlIIIlllIIlllll(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[60]) && lIlIIIlllIIlllll(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[62])) {
                        if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[43]) && lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIlllII ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIlIlIllI += func_77904_a(llllllllllllIlIllIlIIlIIIlIllIll, llllllllllllIlIllIlIIlIIIlIlllIl, llllllllllllIlIllIlIIlIIIlIllIlI, llllllllllllIlIllIlIIlIIIlIllIIl, llllllllllllIlIllIlIIlIIIlIllIII, llllllllllllIlIllIlIIlIIIlIlIlll, llllllllllllIlIllIlIIlIIIlIlIIII);
                            llllllllllllIlIllIlIIlIIIlIllIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllllI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlIlll = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIII = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[69];
                            "".length();
                            if (((0x50 ^ 0x5F ^ (0xD ^ 0x16)) & (0x32 ^ 0x4A ^ (0xD2 ^ 0xBE) ^ -" ".length())) != ((0x16 ^ 0x22 ^ (0x30 ^ 0x1B)) & (0xAC ^ 0xC2 ^ (0x2F ^ 0x5E) ^ -" ".length()))) {
                                return (0xED ^ 0x9F ^ (0xD8 ^ 0xBF)) & (59 + 56 - 15 + 44 ^ 37 + 38 - 16 + 74 ^ -" ".length());
                            }
                        }
                    }
                    else {
                        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIlllII ? 1 : 0)) {
                            llllllllllllIlIllIlIIlIIIlIlIllI += func_77904_a(llllllllllllIlIllIlIIlIIIlIllIll, llllllllllllIlIllIlIIlIIIlIlllIl, llllllllllllIlIllIlIIlIIIlIllIlI, llllllllllllIlIllIlIIlIIIlIllIIl, llllllllllllIlIllIlIIlIIIlIllIII, llllllllllllIlIllIlIIlIIIlIlIlll, llllllllllllIlIllIlIIlIIIlIlIIII);
                            llllllllllllIlIllIlIIlIIIlIllIll = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllIlI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIllllI = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllIl = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlllII = (PotionHelper.lllIlIllllIIIl[0] != 0);
                            llllllllllllIlIllIlIIlIIIlIlIlll = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIII = PotionHelper.lllIlIllllIIIl[0];
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[69];
                        }
                        if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[61])) {
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[0];
                            "".length();
                            if (((138 + 121 - 239 + 208 ^ 157 + 83 - 190 + 120) & (211 + 202 - 313 + 124 ^ 80 + 160 - 75 + 9 ^ -" ".length())) != 0x0) {
                                return (0x48 ^ 0x31 ^ (0x80 ^ 0xB7)) & (0xFB ^ 0xBB ^ (0xA6 ^ 0xA8) ^ -" ".length());
                            }
                        }
                        else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[60])) {
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[2];
                            "".length();
                            if ("  ".length() <= 0) {
                                return (0x2D ^ 0x6C ^ (0x9A ^ 0xC3)) & (0x53 ^ 0x7E ^ (0x7B ^ 0x4E) ^ -" ".length());
                            }
                        }
                        else if (lIlIIIlllIlIIIII(llllllllllllIlIllIlIIlIIIlIlIlII, PotionHelper.lllIlIllllIIIl[62])) {
                            llllllllllllIlIllIlIIlIIIlIllIIl = PotionHelper.lllIlIllllIIIl[1];
                        }
                    }
                    ++llllllllllllIlIllIlIIlIIIlIlIlIl;
                }
                if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIIlIlllII ? 1 : 0)) {
                    llllllllllllIlIllIlIIlIIIlIlIllI += func_77904_a(llllllllllllIlIllIlIIlIIIlIllIll, llllllllllllIlIllIlIIlIIIlIlllIl, llllllllllllIlIllIlIIlIIIlIllIlI, llllllllllllIlIllIlIIlIIIlIllIIl, llllllllllllIlIllIlIIlIIIlIllIII, llllllllllllIlIllIlIIlIIIlIlIlll, llllllllllllIlIllIlIIlIIIlIlIIII);
                }
                return llllllllllllIlIllIlIIlIIIlIlIllI;
            }
        }
    }
    
    private static boolean lIlIIIlllIlIIIll(final int llllllllllllIlIllIlIIIlllIIlIIII) {
        return llllllllllllIlIllIlIIIlllIIlIIII >= 0;
    }
    
    private static boolean lIlIIIlllIlIIlll(final int llllllllllllIlIllIlIIIlllIIIlllI) {
        return llllllllllllIlIllIlIIIlllIIIlllI < 0;
    }
    
    private static String lIlIIIllIllIllIl(final String llllllllllllIlIllIlIIIllllIIlIIl, final String llllllllllllIlIllIlIIIllllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), PotionHelper.lllIlIllllIIIl[8]), "DES");
            final Cipher llllllllllllIlIllIlIIIllllIIllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIIllllIIllIl.init(PotionHelper.lllIlIllllIIIl[2], llllllllllllIlIllIlIIIllllIIlllI);
            return new String(llllllllllllIlIllIlIIIllllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIllllIIllII) {
            llllllllllllIlIllIlIIIllllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIlllIlIIlII(final int llllllllllllIlIllIlIIIlllIIIlIlI) {
        return llllllllllllIlIllIlIIIlllIIIlIlI > 0;
    }
    
    public static String getPotionPrefix(final int llllllllllllIlIllIlIIlIIlIIllIll) {
        final int llllllllllllIlIllIlIIlIIlIIllIlI = getPotionPrefixIndex(llllllllllllIlIllIlIIlIIlIIllIll);
        return PotionHelper.potionPrefixes[llllllllllllIlIllIlIIlIIlIIllIlI];
    }
    
    private static boolean lIlIIIlllIIllllI(final int llllllllllllIlIllIlIIIlllIIllIll, final int llllllllllllIlIllIlIIIlllIIllIlI) {
        return llllllllllllIlIllIlIIIlllIIllIll > llllllllllllIlIllIlIIIlllIIllIlI;
    }
    
    private static boolean lIlIIIlllIIlllll(final int llllllllllllIlIllIlIIIlllIIIIlll, final int llllllllllllIlIllIlIIIlllIIIIllI) {
        return llllllllllllIlIllIlIIIlllIIIIlll != llllllllllllIlIllIlIIIlllIIIIllI;
    }
    
    private static boolean lIlIIIlllIlIIlIl(final int llllllllllllIlIllIlIIIlllIlIIlll, final int llllllllllllIlIllIlIIIlllIlIIllI) {
        return llllllllllllIlIllIlIIIlllIlIIlll >= llllllllllllIlIllIlIIIlllIlIIllI;
    }
    
    private static int lIlIIIlllIIllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIlIIIllIllIlllI(final String llllllllllllIlIllIlIIIllllIllIII, final String llllllllllllIlIllIlIIIllllIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIIllllIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIIllllIllIlI.init(PotionHelper.lllIlIllllIIIl[2], llllllllllllIlIllIlIIIllllIllIll);
            return new String(llllllllllllIlIllIlIIIllllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIllllIllIIl) {
            llllllllllllIlIllIlIIIllllIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static int isFlagUnset(final int llllllllllllIlIllIlIIlIIllIlllII, final int llllllllllllIlIllIlIIlIIllIllIlI) {
        int n;
        if (lIlIIIlllIIllIlI(checkFlag(llllllllllllIlIllIlIIlIIllIlllII, llllllllllllIlIllIlIIlIIllIllIlI) ? 1 : 0)) {
            n = PotionHelper.lllIlIllllIIIl[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return (0xBD ^ 0xA7) & ~(0x19 ^ 0x3);
            }
        }
        else {
            n = PotionHelper.lllIlIllllIIIl[1];
        }
        return n;
    }
    
    private static boolean lIlIIIlllIIllIlI(final int llllllllllllIlIllIlIIIlllIIlIlII) {
        return llllllllllllIlIllIlIIIlllIIlIlII != 0;
    }
    
    private static void lIlIIIlllIIllIIl() {
        (lllIlIllllIIIl = new int[75])[0] = ((1 + 46 + 113 + 6 ^ 123 + 47 - 77 + 65) & (0xB5 ^ 0x81 ^ (0x86 ^ 0x8A) ^ -" ".length()));
        PotionHelper.lllIlIllllIIIl[1] = " ".length();
        PotionHelper.lllIlIllllIIIl[2] = "  ".length();
        PotionHelper.lllIlIllllIIIl[3] = "   ".length();
        PotionHelper.lllIlIllllIIIl[4] = (87 + 38 - 117 + 168 ^ 150 + 63 - 115 + 82);
        PotionHelper.lllIlIllllIIIl[5] = (0x54 ^ 0x26 ^ (0x76 ^ 0x1));
        PotionHelper.lllIlIllllIIIl[6] = (0x83 ^ 0x85);
        PotionHelper.lllIlIllllIIIl[7] = (0x77 ^ 0x70);
        PotionHelper.lllIlIllllIIIl[8] = (0x4A ^ 0x38 ^ (0x6B ^ 0x11));
        PotionHelper.lllIlIllllIIIl[9] = (4 + 163 - 122 + 123 ^ 102 + 93 - 103 + 69);
        PotionHelper.lllIlIllllIIIl[10] = (7 + 99 - 2 + 41 ^ 86 + 46 - 89 + 112);
        PotionHelper.lllIlIllllIIIl[11] = (91 + 46 - 65 + 73 ^ 114 + 130 - 222 + 132);
        PotionHelper.lllIlIllllIIIl[12] = (0x15 ^ 0x19);
        PotionHelper.lllIlIllllIIIl[13] = (0x9A ^ 0xBA);
        PotionHelper.lllIlIllllIIIl[14] = (0xAB ^ 0xB4 ^ (0xB1 ^ 0xA3));
        PotionHelper.lllIlIllllIIIl[15] = (0x5F ^ 0x51);
        PotionHelper.lllIlIllllIIIl[16] = (44 + 146 - 41 + 14 ^ 164 + 98 - 187 + 97);
        PotionHelper.lllIlIllllIIIl[17] = (91 + 112 - 156 + 124 ^ 73 + 182 - 183 + 115);
        PotionHelper.lllIlIllllIIIl[18] = (0x91 ^ 0x80);
        PotionHelper.lllIlIllllIIIl[19] = (0xE ^ 0x1C);
        PotionHelper.lllIlIllllIIIl[20] = (0xBA ^ 0xA9);
        PotionHelper.lllIlIllllIIIl[21] = (0xF9 ^ 0xAB ^ (0xCD ^ 0x8B));
        PotionHelper.lllIlIllllIIIl[22] = (0x67 ^ 0x72);
        PotionHelper.lllIlIllllIIIl[23] = (0x41 ^ 0x57);
        PotionHelper.lllIlIllllIIIl[24] = (0xBE ^ 0xA9);
        PotionHelper.lllIlIllllIIIl[25] = (101 + 176 - 263 + 163 ^ 163 + 20 - 54 + 40);
        PotionHelper.lllIlIllllIIIl[26] = (0xB1 ^ 0xA8);
        PotionHelper.lllIlIllllIIIl[27] = (0xB3 ^ 0x81 ^ (0x94 ^ 0xBC));
        PotionHelper.lllIlIllllIIIl[28] = (148 + 88 - 91 + 12 ^ 69 + 122 - 66 + 9);
        PotionHelper.lllIlIllllIIIl[29] = (0xC1 ^ 0x97 ^ (0x3A ^ 0x70));
        PotionHelper.lllIlIllllIIIl[30] = (0xDB ^ 0xC6);
        PotionHelper.lllIlIllllIIIl[31] = (81 + 135 - 75 + 15 ^ 100 + 90 - 109 + 49);
        PotionHelper.lllIlIllllIIIl[32] = (5 + 85 + 111 + 15 ^ 105 + 84 - 129 + 139);
        PotionHelper.lllIlIllllIIIl[33] = (0x5B ^ 0x7A);
        PotionHelper.lllIlIllllIIIl[34] = (0x20 ^ 0x3B ^ (0x93 ^ 0xAA));
        PotionHelper.lllIlIllllIIIl[35] = (50 + 8 - 38 + 153 ^ 140 + 36 - 74 + 40);
        PotionHelper.lllIlIllllIIIl[36] = (58 + 18 + 21 + 54 ^ 123 + 107 - 196 + 145);
        PotionHelper.lllIlIllllIIIl[37] = (0x70 ^ 0x55);
        PotionHelper.lllIlIllllIIIl[38] = (0x75 ^ 0x18 ^ (0x88 ^ 0xC3));
        PotionHelper.lllIlIllllIIIl[39] = (0xEB ^ 0xC4 ^ (0x5E ^ 0x56));
        PotionHelper.lllIlIllllIIIl[40] = (0x3C ^ 0x14);
        PotionHelper.lllIlIllllIIIl[41] = (0xB4 ^ 0x9D);
        PotionHelper.lllIlIllllIIIl[42] = (0x26 ^ 0xC);
        PotionHelper.lllIlIllllIIIl[43] = (0xB7 ^ 0x9C);
        PotionHelper.lllIlIllllIIIl[44] = (2 + 119 - 21 + 48 ^ 176 + 104 - 276 + 180);
        PotionHelper.lllIlIllllIIIl[45] = (0x99 ^ 0xB4);
        PotionHelper.lllIlIllllIIIl[46] = (0x2F ^ 0x39 ^ (0xB9 ^ 0x81));
        PotionHelper.lllIlIllllIIIl[47] = (0x9C ^ 0x95 ^ (0xE5 ^ 0xC3));
        PotionHelper.lllIlIllllIIIl[48] = (0x29 ^ 0x19);
        PotionHelper.lllIlIllllIIIl[49] = (0xBD ^ 0x8C);
        PotionHelper.lllIlIllllIIIl[50] = (0x7 ^ 0x40 ^ (0x2 ^ 0x77));
        PotionHelper.lllIlIllllIIIl[51] = (0x2 ^ 0xF ^ (0x27 ^ 0x19));
        PotionHelper.lllIlIllllIIIl[52] = (0x31 ^ 0x5);
        PotionHelper.lllIlIllllIIIl[53] = (0x20 ^ 0x15);
        PotionHelper.lllIlIllllIIIl[54] = (0xB2 ^ 0x9C ^ (0x1A ^ 0x2));
        PotionHelper.lllIlIllllIIIl[55] = (0x32 ^ 0x5);
        PotionHelper.lllIlIllllIIIl[56] = (0x54 ^ 0x6C);
        PotionHelper.lllIlIllllIIIl[57] = (0xBA ^ 0x83);
        PotionHelper.lllIlIllllIIIl[58] = (16 + 58 + 88 + 7 ^ 65 + 133 - 115 + 64);
        PotionHelper.lllIlIllllIIIl[59] = (0x57 ^ 0x15 ^ (0x47 ^ 0x3E));
        PotionHelper.lllIlIllllIIIl[60] = (0x63 ^ 0x5F);
        PotionHelper.lllIlIllllIIIl[61] = (0x91 ^ 0xA4 ^ (0x85 ^ 0x8D));
        PotionHelper.lllIlIllllIIIl[62] = (0x38 ^ 0x6);
        PotionHelper.lllIlIllllIIIl[63] = (83 + 27 - 11 + 80 ^ 96 + 133 - 112 + 23);
        PotionHelper.lllIlIllllIIIl[64] = (0x4F ^ 0x66 ^ (0x68 ^ 0x1));
        PotionHelper.lllIlIllllIIIl[65] = (0xCC ^ 0xC3 ^ (0xB ^ 0x45));
        PotionHelper.lllIlIllllIIIl[66] = (0xD5 ^ 0x97);
        PotionHelper.lllIlIllllIIIl[67] = (-(0xFFFFEF7B & 0x32B5) & (0xFFFFFFF6 & 0x387FFF));
        PotionHelper.lllIlIllllIIIl[68] = 166 + 192 - 330 + 227;
        PotionHelper.lllIlIllllIIIl[69] = -" ".length();
        PotionHelper.lllIlIllllIIIl[70] = (147 + 180 - 256 + 164 ^ 133 + 128 - 127 + 17);
        PotionHelper.lllIlIllllIIIl[71] = (-(0xFFFFD35F & 0x7FA5) & (0xFFFFD7B6 & 0x7FFD));
        PotionHelper.lllIlIllllIIIl[72] = (0xFFFFD5BF & 0x6A40);
        PotionHelper.lllIlIllllIIIl[73] = (-1 & 0x7FFF);
        PotionHelper.lllIlIllllIIIl[74] = (0x4B ^ 0x8);
    }
    
    private static void lIlIIIlllIIlIIlI() {
        (lllIlIlllIIIlI = new String[PotionHelper.lllIlIllllIIIl[74]])[PotionHelper.lllIlIllllIIIl[0]] = lIlIIIllIllIllIl("8e+DS6pSMTXhba7AMpq3Hg==", "ZKrFz");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[1]] = lIlIIIllIllIlllI("+L0rOiSEV+E=", "mBTwB");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[2]] = lIlIIIllIllIllll("aHV+cHF3aGBnbmhxeHBp", "EESAZ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[3]] = lIlIIIllIllIlllI("rhTZfWhBaYKKd1CuL5ZzJA==", "BOPfD");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[4]] = lIlIIIllIllIlllI("kIfQ3rrfP6ywWAdzlCOQcQ==", "vSBEt");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[5]] = lIlIIIllIllIllll("fkVPeHJnWFFvbXhBSXhq", "UubIY");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[6]] = lIlIIIllIllIlllI("tx6faJxKg2kljD9saw8s5Q==", "aOkpL");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[7]] = lIlIIIllIllIlllI("+nTH+lAIvJ1ICWW4uyoKJA==", "ptRvq");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[8]] = lIlIIIllIllIllIl("683tigc9DbX9O6qhtOUHeA==", "oqpvd");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[9]] = lIlIIIllIllIllIl("O8q5JIWvkhvBhrgMN/+GYg==", "mYoFZ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[10]] = lIlIIIllIllIllll("eWNFfUpgeF99", "TSnNg");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[11]] = lIlIIIllIllIllIl("VAXa/Rq0Zws=", "JGOgn");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[12]] = lIlIIIllIllIlllI("t3cVGFcWUWS/cre+PiplXw==", "OUXqY");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[14]] = lIlIIIllIllIlllI("ZZnR+EpSipj28+H0AB4UBiXqfg3uK/w2", "GpsZp");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[15]] = lIlIIIllIllIllll("ISUeJj8/ZBo9NTcjEmElPyMEOzUjLxk7OT8t", "QJjOP");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[16]] = lIlIIIllIllIllll("OxkEDhclWAAVHS0fCEkaJxceAw==", "Kvpgx");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[17]] = lIlIIIllIllIlllI("uHpw7ExGtefHyeewgpZTDoEW1XJ+ZG5L", "HLxSQ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[18]] = lIlIIIllIllIllll("JwwYHik5TRwFIzEKFFkrPg8HDg==", "WclwF");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[19]] = lIlIIIllIllIllIl("kw/ug7OsE80tRw+Q8/UhysKX/2rzFR2x", "hBdLr");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[20]] = lIlIIIllIllIlllI("O6h4/Y6UKy5DPiKUfoivLXSHoUx8tHaN", "JOVDW");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[21]] = lIlIIIllIllIllIl("BrxsDOeDhvKw9OldYexsDjtukhxSQlln", "gVZCp");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[22]] = lIlIIIllIllIlllI("dXRLDC7hZ90yB5FBJ3GllOm70gDFj3y9", "RcgFF");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[23]] = lIlIIIllIllIllIl("AZ+Wix/N9zhtNUUpfSOIVdkmHJSv9maV", "EYJdE");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[24]] = lIlIIIllIllIllll("JykSEAE5aBYLCzEvHlcMIioNAA==", "WFfyn");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[25]] = lIlIIIllIllIlllI("kUsCGrhwAGz9A7TiU2RSRmXCVVlXbdxt", "Dlcdy");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[26]] = lIlIIIllIllIllIl("U3dAZNDk84a4sOul1iH7CFMgWb1GB6l/", "uldKv");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[27]] = lIlIIIllIllIllll("PSwcCDkjbRgTMysqEE8lICwHFT4=", "MChaV");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[28]] = lIlIIIllIllIllll("Fh4wBRsIXzQeEQAYPEIHExAyCQ==", "fqDlt");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[29]] = lIlIIIllIllIlllI("yW3weAx0icgXcVhK9jyPwKvCgz9CVMG7", "mclxM");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[30]] = lIlIIIllIllIllll("HggaISUASR46LwgOFmY+Bg4NIw==", "ngnHJ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[31]] = lIlIIIllIllIllIl("Kx5y/aE6yAmPPLJyuAKBssK4pB6xhmmT", "OZfSA");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[32]] = lIlIIIllIllIlllI("jejGGOdVoq5tKQ2KuHhm65obRKH553Id", "BoltI");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[13]] = lIlIIIllIllIllIl("rSgH/wK/qD2OXzE+6Y9mKbynaPE4YRo1", "rTUwg");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[33]] = lIlIIIllIllIllIl("1tZlCv1j+uezAXa59z3MaiR6FXgW8r3H", "KmCbK");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[34]] = lIlIIIllIllIllIl("jH5vT0GmfkGQERfn9GutPe3qsY3ILcBG", "krbhj");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[35]] = lIlIIIllIllIlllI("yGGw5tK0AFXMhAiA1hn+9UEMZhAEeJXl", "gTXJD");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[36]] = lIlIIIllIllIllll("CjUzHyUUdDcELxwzP1g5Cjs1HSYTNCA=", "zZGvJ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[37]] = lIlIIIllIllIlllI("eoLUS+A1uUCItqbZJSb/ye0ADzacKDCq", "EpsUn");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[38]] = lIlIIIllIllIllIl("NXBpyByxEHaTymU6fU5im9kdnAEAlUgQ", "dmSeY");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[39]] = lIlIIIllIllIllll("JxsVCzU5WhEQPzEdGUw1MxsTDj8kBw==", "WtabZ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[40]] = lIlIIIllIllIllll("KCozHCg2azcHIj4sP1s1OSss", "XEGuG");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[41]] = lIlIIIllIllIllIl("j9FhFVX8YTZRKds0Wf5RlR6axcJs+EBi", "dTPqt");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[42]] = lIlIIIllIllIllll("FTUYDBsLdBwXEQMzFEsVBigFAQ==", "eZlet");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[43]] = lIlIIIllIllIllIl("v9X2dAi5qy6bHhL+ln9Q6Ppza+pemw2/", "QSZrJ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[44]] = lIlIIIllIllIlllI("Oet69ww820SDqG9L7K9ZjUPsMSNMCNcQ", "RXapt");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[45]] = lIlIIIllIllIllIl("vkVnjcs5OuNLTSXQ21gKaWLNv8Qec98l", "ATDbD");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[46]] = lIlIIIllIllIllll("blJsS1F+QmpNUH1Cak1QfEJqTUBkVA==", "ObLmq");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[47]] = lIlIIIllIllIllll("YUdRSmFxQVdLYnFBV0tjcUFXWntn", "QgwjP");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[48]] = lIlIIIllIllIllll("UWlETG1QaURMfkFvQk1/", "aIblL");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[49]] = lIlIIIllIllIllll("VmFrUHFWYGtQcUVxbVZwRHFtVmNcZw==", "wQKvQ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[50]] = lIlIIIllIllIlllI("dH5NjXebTVGto6+IhBq8fDxgF/oXNG7L", "ksgKT");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[51]] = lIlIIIllIllIllIl("Wq/JaTOg1D59xBToOUNf3g==", "Uejmz");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[52]] = lIlIIIllIllIlllI("XvbcEFm7p5KnKWlSOU5B2MAsht8SKMJP", "KXtyi");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[53]] = lIlIIIllIllIllIl("RiPpu17RInLeFnZk+GUdw04MK3dSr/nk", "GCMBz");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[54]] = lIlIIIllIllIllll("RFVUYmpURVJkeEVDVGV5RUNUdmFT", "eetDJ");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[55]] = lIlIIIllIllIlllI("Ukh5QJOBuMWvomRnh8b24KerlJZxQmWT", "iFzmn");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[56]] = lIlIIIllIllIllll("YmtobVJja2htQXJtbn5TdGt8ZkU=", "RKNMs");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[57]] = lIlIIIllIllIllIl("LaYawIz6e1Nu3NofjsTkh4gX80hme520", "qEnse");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[58]] = lIlIIIllIllIllIl("QphC2PRyJp0=", "VSzWy");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[59]] = lIlIIIllIllIllll("cg==", "GzDwR");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[60]] = lIlIIIllIllIllIl("ZKSZOWTzIGo=", "pxKqf");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[61]] = lIlIIIllIllIlllI("OcblkxZ3h1A=", "XOjuT");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[62]] = lIlIIIllIllIllIl("tW4HlHTScuY=", "uHunY");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[63]] = lIlIIIllIllIlllI("bO3Y9Xvz/H4=", "axMoq");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[64]] = lIlIIIllIllIlllI("srw/LjtmFDo=", "vtUwp");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[65]] = lIlIIIllIllIlllI("7sn6KXN2dIY=", "pwaFC");
        PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[66]] = lIlIIIllIllIllIl("Q7JCAJSK66c=", "HdDtk");
    }
    
    private static int countSetFlags(int llllllllllllIlIllIlIIlIIIllllIll) {
        int llllllllllllIlIllIlIIlIIIlllllII = PotionHelper.lllIlIllllIIIl[0];
        "".length();
        if (((176 + 150 - 143 + 56 ^ 126 + 18 - 58 + 95) & (0x8 ^ 0x3E ^ (0xDE ^ 0xB2) ^ -" ".length())) != 0x0) {
            return (0xC4 ^ 0x9D ^ (0x52 ^ 0x34)) & (" ".length() ^ (0x5B ^ 0x65) ^ -" ".length());
        }
        while (!lIlIIIlllIlIIIlI(llllllllllllIlIllIlIIlIIIllllIll)) {
            llllllllllllIlIllIlIIlIIIllllIll &= llllllllllllIlIllIlIIlIIIllllIll - PotionHelper.lllIlIllllIIIl[1];
            ++llllllllllllIlIllIlIIlIIIlllllII;
        }
        return llllllllllllIlIllIlIIlIIIlllllII;
    }
    
    public static int calcPotionLiquidColor(final Collection<PotionEffect> llllllllllllIlIllIlIIlIIllIIIlII) {
        final int llllllllllllIlIllIlIIlIIllIIIIll = PotionHelper.lllIlIllllIIIl[67];
        if (!lIlIIIlllIIlllII(llllllllllllIlIllIlIIlIIllIIIlII) || !lIlIIIlllIIlllIl(llllllllllllIlIllIlIIlIIllIIIlII.isEmpty() ? 1 : 0)) {
            return llllllllllllIlIllIlIIlIIllIIIIll;
        }
        float llllllllllllIlIllIlIIlIIllIIIIlI = 0.0f;
        float llllllllllllIlIllIlIIlIIllIIIIIl = 0.0f;
        float llllllllllllIlIllIlIIlIIllIIIIII = 0.0f;
        float llllllllllllIlIllIlIIlIIlIllllll = 0.0f;
        final long llllllllllllIlIllIlIIlIIlIllIlII = (long)llllllllllllIlIllIlIIlIIllIIIlII.iterator();
        "".length();
        if (((0x4E ^ 0x10) & ~(0xC1 ^ 0x9F)) != 0x0) {
            return (0x29 ^ 0x1C) & ~(0x52 ^ 0x67);
        }
        while (!lIlIIIlllIIlllIl(((Iterator)llllllllllllIlIllIlIIlIIlIllIlII).hasNext() ? 1 : 0)) {
            final PotionEffect llllllllllllIlIllIlIIlIIlIlllllI = ((Iterator<PotionEffect>)llllllllllllIlIllIlIIlIIlIllIlII).next();
            if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIlIlllllI.getIsShowParticles() ? 1 : 0)) {
                final int llllllllllllIlIllIlIIlIIlIllllIl = Potion.potionTypes[llllllllllllIlIllIlIIlIIlIlllllI.getPotionID()].getLiquidColor();
                int llllllllllllIlIllIlIIlIIlIllllII = PotionHelper.lllIlIllllIIIl[0];
                "".length();
                if ((0xB1 ^ 0xB5) == " ".length()) {
                    return (0x79 ^ 0x4A) & ~(0xD ^ 0x3E);
                }
                while (!lIlIIIlllIIllllI(llllllllllllIlIllIlIIlIIlIllllII, llllllllllllIlIllIlIIlIIlIlllllI.getAmplifier())) {
                    llllllllllllIlIllIlIIlIIllIIIIlI += (llllllllllllIlIllIlIIlIIlIllllIl >> PotionHelper.lllIlIllllIIIl[17] & PotionHelper.lllIlIllllIIIl[68]) / 255.0f;
                    llllllllllllIlIllIlIIlIIllIIIIIl += (llllllllllllIlIllIlIIlIIlIllllIl >> PotionHelper.lllIlIllllIIIl[8] & PotionHelper.lllIlIllllIIIl[68]) / 255.0f;
                    llllllllllllIlIllIlIIlIIllIIIIII += (llllllllllllIlIllIlIIlIIlIllllIl >> PotionHelper.lllIlIllllIIIl[0] & PotionHelper.lllIlIllllIIIl[68]) / 255.0f;
                    ++llllllllllllIlIllIlIIlIIlIllllll;
                    ++llllllllllllIlIllIlIIlIIlIllllII;
                }
            }
        }
        if (lIlIIIlllIIlllIl(lIlIIIlllIIllIll(llllllllllllIlIllIlIIlIIlIllllll, 0.0f))) {
            return PotionHelper.lllIlIllllIIIl[0];
        }
        llllllllllllIlIllIlIIlIIllIIIIlI = llllllllllllIlIllIlIIlIIllIIIIlI / llllllllllllIlIllIlIIlIIlIllllll * 255.0f;
        llllllllllllIlIllIlIIlIIllIIIIIl = llllllllllllIlIllIlIIlIIllIIIIIl / llllllllllllIlIllIlIIlIIlIllllll * 255.0f;
        llllllllllllIlIllIlIIlIIllIIIIII = llllllllllllIlIllIlIIlIIllIIIIII / llllllllllllIlIllIlIIlIIlIllllll * 255.0f;
        return (int)llllllllllllIlIllIlIIlIIllIIIIlI << PotionHelper.lllIlIllllIIIl[17] | (int)llllllllllllIlIllIlIIlIIllIIIIIl << PotionHelper.lllIlIllllIIIl[8] | (int)llllllllllllIlIllIlIIlIIllIIIIII;
    }
    
    public static boolean getAreAmbient(final Collection<PotionEffect> llllllllllllIlIllIlIIlIIlIlIllII) {
        final String llllllllllllIlIllIlIIlIIlIlIlIlI = (String)llllllllllllIlIllIlIIlIIlIlIllII.iterator();
        "".length();
        if ("  ".length() >= (0x48 ^ 0x4C)) {
            return ((0x93 ^ 0x8F) & ~(0x28 ^ 0x34)) != 0x0;
        }
        while (!lIlIIIlllIIlllIl(((Iterator)llllllllllllIlIllIlIIlIIlIlIlIlI).hasNext() ? 1 : 0)) {
            final PotionEffect llllllllllllIlIllIlIIlIIlIlIllIl = ((Iterator<PotionEffect>)llllllllllllIlIllIlIIlIIlIlIlIlI).next();
            if (lIlIIIlllIIlllIl(llllllllllllIlIllIlIIlIIlIlIllIl.getIsAmbient() ? 1 : 0)) {
                return PotionHelper.lllIlIllllIIIl[0] != 0;
            }
        }
        return PotionHelper.lllIlIllllIIIl[1] != 0;
    }
    
    static {
        lIlIIIlllIIllIIl();
        lIlIIIlllIIlIIlI();
        magmaCreamEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[0]];
        glowstoneEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[1]];
        spiderEyeEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[2]];
        goldenCarrotEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[3]];
        pufferfishEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[4]];
        speckledMelonEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[5]];
        gunpowderEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[6]];
        sugarEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[7]];
        ghastTearEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[8]];
        blazePowderEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[9]];
        fermentedSpiderEyeEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[10]];
        redstoneEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[11]];
        rabbitFootEffect = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[12]];
        field_77924_a = null;
        potionRequirements = Maps.newHashMap();
        potionAmplifiers = Maps.newHashMap();
        DATAVALUE_COLORS = Maps.newHashMap();
        final String[] potionPrefixes2 = new String[PotionHelper.lllIlIllllIIIl[13]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[0]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[14]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[1]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[15]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[2]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[16]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[3]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[17]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[4]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[18]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[5]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[19]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[6]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[20]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[7]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[21]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[8]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[22]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[9]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[23]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[10]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[24]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[11]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[25]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[12]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[26]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[14]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[27]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[15]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[28]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[16]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[29]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[17]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[30]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[18]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[31]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[19]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[32]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[20]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[13]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[21]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[33]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[22]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[34]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[23]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[35]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[24]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[36]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[25]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[37]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[26]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[38]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[27]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[39]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[28]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[40]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[29]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[41]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[30]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[42]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[31]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[43]];
        potionPrefixes2[PotionHelper.lllIlIllllIIIl[32]] = PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[44]];
        potionPrefixes = potionPrefixes2;
        PotionHelper.potionRequirements.put(Potion.regeneration.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[45]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.moveSpeed.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[46]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.fireResistance.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[47]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.heal.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[48]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.poison.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[49]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.weakness.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[50]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.harm.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[51]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.moveSlowdown.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[52]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.damageBoost.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[53]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.nightVision.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[54]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.invisibility.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[55]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.waterBreathing.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[56]]);
        "".length();
        PotionHelper.potionRequirements.put(Potion.jump.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[57]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.moveSpeed.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[58]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.digSpeed.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[59]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.damageBoost.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[60]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.regeneration.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[61]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.harm.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[62]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.heal.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[63]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.resistance.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[64]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.poison.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[65]]);
        "".length();
        PotionHelper.potionAmplifiers.put(Potion.jump.getId(), PotionHelper.lllIlIlllIIIlI[PotionHelper.lllIlIllllIIIl[66]]);
        "".length();
    }
    
    public static boolean checkFlag(final int llllllllllllIlIllIlIIlIIlllIllII, final int llllllllllllIlIllIlIIlIIlllIllIl) {
        if (lIlIIIlllIIllIlI(llllllllllllIlIllIlIIlIIlllIllII & PotionHelper.lllIlIllllIIIl[1] << llllllllllllIlIllIlIIlIIlllIllIl)) {
            return PotionHelper.lllIlIllllIIIl[1] != 0;
        }
        return PotionHelper.lllIlIllllIIIl[0] != 0;
    }
}
