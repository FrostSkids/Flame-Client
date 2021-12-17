// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public enum EnumChatFormatting
{
    BOLD(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[51]], EnumChatFormatting.lIlIllIIIIlIlI[25], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[52]], (char)EnumChatFormatting.lIlIllIIIIlIlI[53], (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[1] != 0)), 
    GRAY(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[21]], EnumChatFormatting.lIlIllIIIIlIlI[10], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[22]], (char)EnumChatFormatting.lIlIllIIIIlIlI[23], EnumChatFormatting.lIlIllIIIIlIlI[10]), 
    DARK_GREEN(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[6]], EnumChatFormatting.lIlIllIIIIlIlI[3], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[7]], (char)EnumChatFormatting.lIlIllIIIIlIlI[8], EnumChatFormatting.lIlIllIIIIlIlI[3]);
    
    private final /* synthetic */ int colorIndex;
    private static final /* synthetic */ int[] lIlIllIIIIlIlI;
    private final /* synthetic */ String name;
    
    OBFUSCATED(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[48]], EnumChatFormatting.lIlIllIIIIlIlI[24], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[49]], (char)EnumChatFormatting.lIlIllIIIIlIlI[50], (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[1] != 0)), 
    BLACK(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[0]], EnumChatFormatting.lIlIllIIIIlIlI[0], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[1]], (char)EnumChatFormatting.lIlIllIIIIlIlI[2], EnumChatFormatting.lIlIllIIIIlIlI[0]);
    
    private static final /* synthetic */ Pattern formattingCodePattern;
    private static final /* synthetic */ String[] lIlIllIIIIlIIl;
    
    LIGHT_PURPLE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[39]], EnumChatFormatting.lIlIllIIIIlIlI[19], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[40]], (char)EnumChatFormatting.lIlIllIIIIlIlI[41], EnumChatFormatting.lIlIllIIIIlIlI[19]), 
    DARK_BLUE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[3]], EnumChatFormatting.lIlIllIIIIlIlI[1], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[4]], (char)EnumChatFormatting.lIlIllIIIIlIlI[5], EnumChatFormatting.lIlIllIIIIlIlI[1]), 
    DARK_RED(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[12]], EnumChatFormatting.lIlIllIIIIlIlI[6], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[13]], (char)EnumChatFormatting.lIlIllIIIIlIlI[14], EnumChatFormatting.lIlIllIIIIlIlI[6]), 
    DARK_GRAY(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[24]], EnumChatFormatting.lIlIllIIIIlIlI[12], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[25]], (char)EnumChatFormatting.lIlIllIIIIlIlI[26], EnumChatFormatting.lIlIllIIIIlIlI[12]), 
    UNDERLINE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[57]], EnumChatFormatting.lIlIllIIIIlIlI[28], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[58]], (char)EnumChatFormatting.lIlIllIIIIlIlI[59], (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[1] != 0)), 
    YELLOW(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[42]], EnumChatFormatting.lIlIllIIIIlIlI[21], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[43]], (char)EnumChatFormatting.lIlIllIIIIlIlI[44], EnumChatFormatting.lIlIllIIIIlIlI[21]), 
    RED(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[36]], EnumChatFormatting.lIlIllIIIIlIlI[18], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[37]], (char)EnumChatFormatting.lIlIllIIIIlIlI[38], EnumChatFormatting.lIlIllIIIIlIlI[18]), 
    WHITE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[45]], EnumChatFormatting.lIlIllIIIIlIlI[22], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[46]], (char)EnumChatFormatting.lIlIllIIIIlIlI[47], EnumChatFormatting.lIlIllIIIIlIlI[22]), 
    DARK_AQUA(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[9]], EnumChatFormatting.lIlIllIIIIlIlI[4], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[10]], (char)EnumChatFormatting.lIlIllIIIIlIlI[11], EnumChatFormatting.lIlIllIIIIlIlI[4]), 
    RESET(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[63]], EnumChatFormatting.lIlIllIIIIlIlI[31], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[64]], (char)EnumChatFormatting.lIlIllIIIIlIlI[65], EnumChatFormatting.lIlIllIIIIlIlI[66]), 
    BLUE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[27]], EnumChatFormatting.lIlIllIIIIlIlI[13], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[28]], (char)EnumChatFormatting.lIlIllIIIIlIlI[29], EnumChatFormatting.lIlIllIIIIlIlI[13]);
    
    private final /* synthetic */ boolean fancyStyling;
    
    DARK_PURPLE(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[15]], EnumChatFormatting.lIlIllIIIIlIlI[7], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[16]], (char)EnumChatFormatting.lIlIllIIIIlIlI[17], EnumChatFormatting.lIlIllIIIIlIlI[7]);
    
    private final /* synthetic */ char formattingCode;
    
    STRIKETHROUGH(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[54]], EnumChatFormatting.lIlIllIIIIlIlI[27], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[55]], (char)EnumChatFormatting.lIlIllIIIIlIlI[56], (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[1] != 0)), 
    AQUA(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[33]], EnumChatFormatting.lIlIllIIIIlIlI[16], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[34]], (char)EnumChatFormatting.lIlIllIIIIlIlI[35], EnumChatFormatting.lIlIllIIIIlIlI[16]), 
    ITALIC(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[60]], EnumChatFormatting.lIlIllIIIIlIlI[30], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[61]], (char)EnumChatFormatting.lIlIllIIIIlIlI[62], (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[1] != 0));
    
    private final /* synthetic */ String controlString;
    
    GOLD(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[18]], EnumChatFormatting.lIlIllIIIIlIlI[9], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[19]], (char)EnumChatFormatting.lIlIllIIIIlIlI[20], EnumChatFormatting.lIlIllIIIIlIlI[9]);
    
    private static final /* synthetic */ Map<String, EnumChatFormatting> nameMapping;
    
    GREEN(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[30]], EnumChatFormatting.lIlIllIIIIlIlI[15], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[31]], (char)EnumChatFormatting.lIlIllIIIIlIlI[32], EnumChatFormatting.lIlIllIIIIlIlI[15]);
    
    private static boolean llllIIIIIlIIlIl(final int lllllllllllllIIIIlllIllIIIlIIIll) {
        return lllllllllllllIIIIlllIllIIIlIIIll < 0;
    }
    
    private static boolean llllIIIIIlIIllI(final int lllllllllllllIIIIlllIllIIIlllIII, final int lllllllllllllIIIIlllIllIIIllIlll) {
        return lllllllllllllIIIIlllIllIIIlllIII == lllllllllllllIIIIlllIllIIIllIlll;
    }
    
    public static EnumChatFormatting func_175744_a(final int lllllllllllllIIIIlllIllIlIIIllIl) {
        if (llllIIIIIlIIlIl(lllllllllllllIIIIlllIllIlIIIllIl)) {
            return EnumChatFormatting.RESET;
        }
        final Exception lllllllllllllIIIIlllIllIlIIIIlll;
        final double lllllllllllllIIIIlllIllIlIIIlIII = ((EnumChatFormatting[])(Object)(lllllllllllllIIIIlllIllIlIIIIlll = (Exception)(Object)values())).length;
        char lllllllllllllIIIIlllIllIlIIIlIIl = (char)EnumChatFormatting.lIlIllIIIIlIlI[0];
        "".length();
        if (((0x26 ^ 0x1C) & ~(0x3A ^ 0x0)) != 0x0) {
            return null;
        }
        while (!llllIIIIIlIIIIl(lllllllllllllIIIIlllIllIlIIIlIIl, (int)lllllllllllllIIIIlllIllIlIIIlIII)) {
            final EnumChatFormatting lllllllllllllIIIIlllIllIlIIIllII = lllllllllllllIIIIlllIllIlIIIIlll[lllllllllllllIIIIlllIllIlIIIlIIl];
            if (llllIIIIIlIIllI(lllllllllllllIIIIlllIllIlIIIllII.getColorIndex(), lllllllllllllIIIIlllIllIlIIIllIl)) {
                return lllllllllllllIIIIlllIllIlIIIllII;
            }
            ++lllllllllllllIIIIlllIllIlIIIlIIl;
        }
        return null;
    }
    
    public boolean isColor() {
        if (llllIIIIIlIIIlI(this.fancyStyling ? 1 : 0) && llllIIIIIlIIIll(this, EnumChatFormatting.RESET)) {
            return EnumChatFormatting.lIlIllIIIIlIlI[1] != 0;
        }
        return EnumChatFormatting.lIlIllIIIIlIlI[0] != 0;
    }
    
    public String getFriendlyName() {
        return this.name().toLowerCase();
    }
    
    public static Collection<String> getValidValues(final boolean lllllllllllllIIIIlllIllIIlllllll, final boolean lllllllllllllIIIIlllIllIIllllIlI) {
        final List<String> lllllllllllllIIIIlllIllIIlllllIl = (List<String>)Lists.newArrayList();
        final boolean lllllllllllllIIIIlllIllIIlllIlIl;
        final byte lllllllllllllIIIIlllIllIIlllIllI = (byte)((EnumChatFormatting[])(Object)(lllllllllllllIIIIlllIllIIlllIlIl = (boolean)(Object)values())).length;
        char lllllllllllllIIIIlllIllIIlllIlll = (char)EnumChatFormatting.lIlIllIIIIlIlI[0];
        "".length();
        if (-(0x2F ^ 0x2B) > 0) {
            return null;
        }
        while (!llllIIIIIlIIIIl(lllllllllllllIIIIlllIllIIlllIlll, lllllllllllllIIIIlllIllIIlllIllI)) {
            final EnumChatFormatting lllllllllllllIIIIlllIllIIlllllII = lllllllllllllIIIIlllIllIIlllIlIl[lllllllllllllIIIIlllIllIIlllIlll];
            if ((!llllIIIIIlIIlll(lllllllllllllIIIIlllIllIIlllllII.isColor() ? 1 : 0) || llllIIIIIlIIlll(lllllllllllllIIIIlllIllIIlllllll ? 1 : 0)) && (!llllIIIIIlIIlll(lllllllllllllIIIIlllIllIIlllllII.isFancyStyling() ? 1 : 0) || llllIIIIIlIIlll(lllllllllllllIIIIlllIllIIllllIlI ? 1 : 0))) {
                lllllllllllllIIIIlllIllIIlllllIl.add(lllllllllllllIIIIlllIllIIlllllII.getFriendlyName());
                "".length();
            }
            ++lllllllllllllIIIIlllIllIIlllIlll;
        }
        return lllllllllllllIIIIlllIllIIlllllIl;
    }
    
    private static boolean llllIIIIIlIIIlI(final int lllllllllllllIIIIlllIllIIIlIIlIl) {
        return lllllllllllllIIIIlllIllIIIlIIlIl == 0;
    }
    
    public boolean isFancyStyling() {
        return this.fancyStyling;
    }
    
    private static String func_175745_c(final String lllllllllllllIIIIlllIllIllIllIll) {
        return lllllllllllllIIIIlllIllIllIllIll.toLowerCase().replaceAll(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[70]], EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[71]]);
    }
    
    private EnumChatFormatting(final String lllllllllllllIIIIlllIllIlIllllll, final int lllllllllllllIIIIlllIllIlIlllllI, final String lllllllllllllIIIIlllIllIlIllllIl, final char lllllllllllllIIIIlllIllIllIIIIlI, final boolean lllllllllllllIIIIlllIllIllIIIIIl) {
        this(lllllllllllllIIIIlllIllIlIllllll, lllllllllllllIIIIlllIllIlIlllllI, lllllllllllllIIIIlllIllIlIllllIl, lllllllllllllIIIIlllIllIllIIIIlI, lllllllllllllIIIIlllIllIllIIIIIl, EnumChatFormatting.lIlIllIIIIlIlI[66]);
    }
    
    private EnumChatFormatting(final String lllllllllllllIIIIlllIllIllIIllll, final int lllllllllllllIIIIlllIllIllIIlllI, final String lllllllllllllIIIIlllIllIllIIllIl, final char lllllllllllllIIIIlllIllIllIIllII, final int lllllllllllllIIIIlllIllIllIlIIIl) {
        this(lllllllllllllIIIIlllIllIllIIllll, lllllllllllllIIIIlllIllIllIIlllI, lllllllllllllIIIIlllIllIllIIllIl, lllllllllllllIIIIlllIllIllIIllII, (boolean)(EnumChatFormatting.lIlIllIIIIlIlI[0] != 0), lllllllllllllIIIIlllIllIllIlIIIl);
    }
    
    private static boolean llllIIIIIlIIIIl(final int lllllllllllllIIIIlllIllIIIllIlII, final int lllllllllllllIIIIlllIllIIIllIIll) {
        return lllllllllllllIIIIlllIllIIIllIlII >= lllllllllllllIIIIlllIllIIIllIIll;
    }
    
    private static void llllIIIIIIlllll() {
        (lIlIllIIIIlIIl = new String[EnumChatFormatting.lIlIllIIIIlIlI[8]])[EnumChatFormatting.lIlIllIIIIlIlI[0]] = llllIIIIIIlllII("Kn2A/tM3Vsk=", "OAImI");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[1]] = llllIIIIIIlllIl("ET0jMi4=", "Sqbqe");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[3]] = llllIIIIIIlllIl("EjMHBhwUPgAI", "VrUMC");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[4]] = llllIIIIIIllllI("s0aY2v4bh+YsZYEdPwc1/w==", "KAqkA");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[6]] = llllIIIIIIllllI("L7K0NiTa5PDRsKHrsAA+rg==", "ujLsI");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[7]] = llllIIIIIIllllI("A58Gv4TbEVE04Bgw5i7cXQ==", "HpWbC");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[9]] = llllIIIIIIlllIl("BxcwDBQCBzcG", "CVbGK");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[10]] = llllIIIIIIllllI("7rUQJ3rSuSOh3QXnIWQZvw==", "qVLZf");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[12]] = llllIIIIIIlllII("h39jBVh986JppJ7aYLsi5g==", "fymAk");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[13]] = llllIIIIIIlllIl("KTUWPAs/MQA=", "mtDwT");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[15]] = llllIIIIIIllllI("55QaWgavHw16faQ5X8P8Mw==", "IQwSt");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[16]] = llllIIIIIIlllII("X8zv71Is6Bm00oAPuXRKaw==", "sKzzg");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[18]] = llllIIIIIIlllII("gGt6nKP2tmE=", "keuad");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[19]] = llllIIIIIIllllI("nKSORWYHiFk=", "gQTOp");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[21]] = llllIIIIIIlllIl("NhcMDQ==", "qEMTN");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[22]] = llllIIIIIIlllII("VthJVrSHBqg=", "arlzu");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[24]] = llllIIIIIIlllII("sIqhUgC0DiCSfFYwYY5wQw==", "DXuDp");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[25]] = llllIIIIIIlllIl("HSsgDA0eODMe", "YjrGR");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[27]] = llllIIIIIIlllIl("BhocIQ==", "DVIdo");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[28]] = llllIIIIIIllllI("GZNl7nvwkCo=", "EWpXZ");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[30]] = llllIIIIIIlllIl("NQo/DgI=", "rXzKL");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[31]] = llllIIIIIIllllI("zclKUIRMSNM=", "AEvWW");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[33]] = llllIIIIIIlllII("FvFq9ZAt73E=", "Vweka");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[34]] = llllIIIIIIlllIl("KTc7LA==", "hfnmC");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[36]] = llllIIIIIIlllIl("AQ0Q", "SHTOk");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[37]] = llllIIIIIIllllI("xKJUcV6Zdks=", "sjOFb");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[39]] = llllIIIIIIllllI("vT80qZRizFNVU1CTwk//VA==", "Rolhx");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[40]] = llllIIIIIIlllII("0JDT315XD4S2CB0jbUUhCw==", "SJmRm");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[42]] = llllIIIIIIlllIl("Oxw6DSs1", "bYvAd");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[43]] = llllIIIIIIllllI("X5T5WbKEsH8=", "PQadR");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[45]] = llllIIIIIIlllII("Tj7jYzIb/0Y=", "CYzbW");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[46]] = llllIIIIIIlllII("lH931htXbj8=", "DfKUx");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[48]] = llllIIIIIIlllII("zSmHgZsxk+aP7LJJ3jB93w==", "pIwUH");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[49]] = llllIIIIIIlllII("44YVi6ZXcZOn7lfGmn9lLA==", "grUSx");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[51]] = llllIIIIIIllllI("Jz3fpVkAOFo=", "bHZbY");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[52]] = llllIIIIIIlllIl("JyAEEQ==", "eoHUK");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[54]] = llllIIIIIIlllII("QoB36KbEJYnpAjuL1IENPQ==", "RRmuV");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[55]] = llllIIIIIIlllII("3tiLu/2SGAtIxMnYfWT45A==", "NUlFA");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[57]] = llllIIIIIIllllI("HJ8/NwiRV6Clzqnqyd3JsA==", "SQzVD");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[58]] = llllIIIIIIlllII("4oXw7viHFCkuToSjNfo32A==", "RROHv");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[60]] = llllIIIIIIlllIl("IBk4GyUq", "iMyWl");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[61]] = llllIIIIIIlllII("DS4T/xhCjho=", "ghfma");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[63]] = llllIIIIIIlllII("RDBdAUECQjo=", "fpXIL");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[64]] = llllIIIIIIlllIl("AzY9CyE=", "QsnNu");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[67]] = llllIIIIIIlllII("3/xVxGD0o2E=", "PcrQE");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[69]] = llllIIIIIIlllIl("NntLXhtADS1KFT8W", "mKfgZ");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[70]] = llllIIIIIIlllIl("CD0VWR8O", "Sctte");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[71]] = llllIIIIIIlllIl("", "HKZKj");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[2]] = llllIIIIIIlllIl("w4s=", "lOnrf");
        EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[5]] = llllIIIIIIllllI("rJcwailjrPo=", "wZUcT");
    }
    
    private static boolean llllIIIIIlIIlll(final int lllllllllllllIIIIlllIllIIIlIIlll) {
        return lllllllllllllIIIIlllIllIIIlIIlll != 0;
    }
    
    private static boolean llllIIIIIlIlIII(final int lllllllllllllIIIIlllIllIIIllIIII, final int lllllllllllllIIIIlllIllIIIlIllll) {
        return lllllllllllllIIIIlllIllIIIllIIII < lllllllllllllIIIIlllIllIIIlIllll;
    }
    
    private static String llllIIIIIIlllII(final String lllllllllllllIIIIlllIllIIllIIlIl, final String lllllllllllllIIIIlllIllIIllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIllIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIllIIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllIllIIllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllIllIIllIIlll.init(EnumChatFormatting.lIlIllIIIIlIlI[3], lllllllllllllIIIIlllIllIIllIlIII);
            return new String(lllllllllllllIIIIlllIllIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIllIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIllIIllIIllI) {
            lllllllllllllIIIIlllIllIIllIIllI.printStackTrace();
            return null;
        }
    }
    
    private EnumChatFormatting(final String lllllllllllllIIIIlllIllIlIlIllIl, final int lllllllllllllIIIIlllIllIlIlIllII, final String lllllllllllllIIIIlllIllIlIllIIlI, final char lllllllllllllIIIIlllIllIlIlIlIlI, final boolean lllllllllllllIIIIlllIllIlIlIlIIl, final int lllllllllllllIIIIlllIllIlIlIllll) {
        this.name = lllllllllllllIIIIlllIllIlIllIIlI;
        this.formattingCode = lllllllllllllIIIIlllIllIlIlIlIlI;
        this.fancyStyling = lllllllllllllIIIIlllIllIlIlIlIIl;
        this.colorIndex = lllllllllllllIIIIlllIllIlIlIllll;
        this.controlString = String.valueOf(new StringBuilder(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[2]]).append(lllllllllllllIIIIlllIllIlIlIlIlI));
    }
    
    private static boolean llllIIIIIlIIlII(final Object lllllllllllllIIIIlllIllIIIlIlIIl) {
        return lllllllllllllIIIIlllIllIIIlIlIIl == null;
    }
    
    private static String llllIIIIIIllllI(final String lllllllllllllIIIIlllIllIIlIllIII, final String lllllllllllllIIIIlllIllIIlIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIllIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIllIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), EnumChatFormatting.lIlIllIIIIlIlI[12]), "DES");
            final Cipher lllllllllllllIIIIlllIllIIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIllIIlIllIlI.init(EnumChatFormatting.lIlIllIIIIlIlI[3], lllllllllllllIIIIlllIllIIlIllIll);
            return new String(lllllllllllllIIIIlllIllIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIllIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIllIIlIllIIl) {
            lllllllllllllIIIIlllIllIIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIIIIlIIIll(final Object lllllllllllllIIIIlllIllIIIlIllII, final Object lllllllllllllIIIIlllIllIIIlIlIll) {
        return lllllllllllllIIIIlllIllIIIlIllII != lllllllllllllIIIIlllIllIIIlIlIll;
    }
    
    @Override
    public String toString() {
        return this.controlString;
    }
    
    public static String getTextWithoutFormattingCodes(final String lllllllllllllIIIIlllIllIlIIlIllI) {
        String replaceAll;
        if (llllIIIIIlIIlII(lllllllllllllIIIIlllIllIlIIlIllI)) {
            replaceAll = null;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            replaceAll = EnumChatFormatting.formattingCodePattern.matcher(lllllllllllllIIIIlllIllIlIIlIllI).replaceAll(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[5]]);
        }
        return replaceAll;
    }
    
    public static EnumChatFormatting getValueByName(final String lllllllllllllIIIIlllIllIlIIlIIll) {
        EnumChatFormatting enumChatFormatting;
        if (llllIIIIIlIIlII(lllllllllllllIIIIlllIllIlIIlIIll)) {
            enumChatFormatting = null;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            enumChatFormatting = EnumChatFormatting.nameMapping.get(func_175745_c(lllllllllllllIIIIlllIllIlIIlIIll));
        }
        return enumChatFormatting;
    }
    
    private static String llllIIIIIIlllIl(String lllllllllllllIIIIlllIllIIlIIIIll, final String lllllllllllllIIIIlllIllIIlIIIlll) {
        lllllllllllllIIIIlllIllIIlIIIIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlllIllIIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllIllIIlIIIllI = new StringBuilder();
        final char[] lllllllllllllIIIIlllIllIIlIIIlIl = lllllllllllllIIIIlllIllIIlIIIlll.toCharArray();
        int lllllllllllllIIIIlllIllIIlIIIlII = EnumChatFormatting.lIlIllIIIIlIlI[0];
        final double lllllllllllllIIIIlllIllIIIlllllI = (Object)((String)lllllllllllllIIIIlllIllIIlIIIIll).toCharArray();
        final char lllllllllllllIIIIlllIllIIIllllIl = (char)lllllllllllllIIIIlllIllIIIlllllI.length;
        double lllllllllllllIIIIlllIllIIIllllII = EnumChatFormatting.lIlIllIIIIlIlI[0];
        while (llllIIIIIlIlIII((int)lllllllllllllIIIIlllIllIIIllllII, lllllllllllllIIIIlllIllIIIllllIl)) {
            final char lllllllllllllIIIIlllIllIIlIIlIIl = lllllllllllllIIIIlllIllIIIlllllI[lllllllllllllIIIIlllIllIIIllllII];
            lllllllllllllIIIIlllIllIIlIIIllI.append((char)(lllllllllllllIIIIlllIllIIlIIlIIl ^ lllllllllllllIIIIlllIllIIlIIIlIl[lllllllllllllIIIIlllIllIIlIIIlII % lllllllllllllIIIIlllIllIIlIIIlIl.length]));
            "".length();
            ++lllllllllllllIIIIlllIllIIlIIIlII;
            ++lllllllllllllIIIIlllIllIIIllllII;
            "".length();
            if (-(0xAD ^ 0xA9) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllIllIIlIIIllI);
    }
    
    private static void llllIIIIIlIIIII() {
        (lIlIllIIIIlIlI = new int[72])[0] = ((0x71 ^ 0x3E) & ~(0x39 ^ 0x76));
        EnumChatFormatting.lIlIllIIIIlIlI[1] = " ".length();
        EnumChatFormatting.lIlIllIIIIlIlI[2] = (27 + 31 - 21 + 99 ^ 54 + 156 - 132 + 106);
        EnumChatFormatting.lIlIllIIIIlIlI[3] = "  ".length();
        EnumChatFormatting.lIlIllIIIIlIlI[4] = "   ".length();
        EnumChatFormatting.lIlIllIIIIlIlI[5] = (0xC9 ^ 0xC2 ^ (0x31 ^ 0xB));
        EnumChatFormatting.lIlIllIIIIlIlI[6] = (0x3E ^ 0x3A);
        EnumChatFormatting.lIlIllIIIIlIlI[7] = (73 + 114 - 64 + 5 ^ 45 + 8 - 41 + 121);
        EnumChatFormatting.lIlIllIIIIlIlI[8] = (0x64 ^ 0x56);
        EnumChatFormatting.lIlIllIIIIlIlI[9] = (0xA5 ^ 0xA3);
        EnumChatFormatting.lIlIllIIIIlIlI[10] = (0xD9 ^ 0xB9 ^ (0x60 ^ 0x7));
        EnumChatFormatting.lIlIllIIIIlIlI[11] = (0x4A ^ 0x6B ^ (0x82 ^ 0x90));
        EnumChatFormatting.lIlIllIIIIlIlI[12] = (0x6D ^ 0x77 ^ (0x41 ^ 0x53));
        EnumChatFormatting.lIlIllIIIIlIlI[13] = (0x32 ^ 0x63 ^ (0x37 ^ 0x6F));
        EnumChatFormatting.lIlIllIIIIlIlI[14] = (0x6B ^ 0x5F);
        EnumChatFormatting.lIlIllIIIIlIlI[15] = (0xDB ^ 0x88 ^ (0x32 ^ 0x6B));
        EnumChatFormatting.lIlIllIIIIlIlI[16] = (0x46 ^ 0x4D);
        EnumChatFormatting.lIlIllIIIIlIlI[17] = (0x7 ^ 0x29 ^ (0xD ^ 0x16));
        EnumChatFormatting.lIlIllIIIIlIlI[18] = (0x61 ^ 0x6D);
        EnumChatFormatting.lIlIllIIIIlIlI[19] = (0x71 ^ 0x6A ^ (0x26 ^ 0x30));
        EnumChatFormatting.lIlIllIIIIlIlI[20] = (13 + 149 - 17 + 99 ^ 131 + 140 - 182 + 105);
        EnumChatFormatting.lIlIllIIIIlIlI[21] = (201 + 100 - 106 + 8 ^ 118 + 100 - 189 + 168);
        EnumChatFormatting.lIlIllIIIIlIlI[22] = (0x71 ^ 0x64 ^ (0xA6 ^ 0xBC));
        EnumChatFormatting.lIlIllIIIIlIlI[23] = (0x4E ^ 0x79);
        EnumChatFormatting.lIlIllIIIIlIlI[24] = (92 + 112 - 152 + 94 ^ 71 + 4 + 24 + 31);
        EnumChatFormatting.lIlIllIIIIlIlI[25] = (0xAF ^ 0xBE);
        EnumChatFormatting.lIlIllIIIIlIlI[26] = (0x39 ^ 0x1);
        EnumChatFormatting.lIlIllIIIIlIlI[27] = (0x1F ^ 0xD);
        EnumChatFormatting.lIlIllIIIIlIlI[28] = (0x1 ^ 0x12);
        EnumChatFormatting.lIlIllIIIIlIlI[29] = (0x63 ^ 0x5A);
        EnumChatFormatting.lIlIllIIIIlIlI[30] = (0x7 ^ 0x13);
        EnumChatFormatting.lIlIllIIIIlIlI[31] = (0xD ^ 0x18);
        EnumChatFormatting.lIlIllIIIIlIlI[32] = (0x6E ^ 0x52 ^ (0x19 ^ 0x44));
        EnumChatFormatting.lIlIllIIIIlIlI[33] = (0x4E ^ 0x58);
        EnumChatFormatting.lIlIllIIIIlIlI[34] = (0xC ^ 0x67 ^ (0x74 ^ 0x8));
        EnumChatFormatting.lIlIllIIIIlIlI[35] = (140 + 118 - 115 + 100 ^ 28 + 141 - 31 + 7);
        EnumChatFormatting.lIlIllIIIIlIlI[36] = (0xAE ^ 0xB3 ^ (0x5A ^ 0x5F));
        EnumChatFormatting.lIlIllIIIIlIlI[37] = (0x37 ^ 0x2E);
        EnumChatFormatting.lIlIllIIIIlIlI[38] = (0xB8 ^ 0x98 ^ (0x55 ^ 0x16));
        EnumChatFormatting.lIlIllIIIIlIlI[39] = (0x20 ^ 0x3A);
        EnumChatFormatting.lIlIllIIIIlIlI[40] = (0x8A ^ 0x91);
        EnumChatFormatting.lIlIllIIIIlIlI[41] = (238 + 157 - 273 + 128 ^ 148 + 22 - 121 + 109);
        EnumChatFormatting.lIlIllIIIIlIlI[42] = (0x2 ^ 0x13 ^ (0x81 ^ 0x8C));
        EnumChatFormatting.lIlIllIIIIlIlI[43] = (100 + 164 - 244 + 148 ^ 99 + 39 - 125 + 168);
        EnumChatFormatting.lIlIllIIIIlIlI[44] = (114 + 19 - 54 + 48 ^ (0x47 ^ 0x5D));
        EnumChatFormatting.lIlIllIIIIlIlI[45] = (0x39 ^ 0x27);
        EnumChatFormatting.lIlIllIIIIlIlI[46] = (11 + 53 - 8 + 89 ^ 105 + 54 - 88 + 71);
        EnumChatFormatting.lIlIllIIIIlIlI[47] = (0x2F ^ 0x27 ^ (0xF ^ 0x61));
        EnumChatFormatting.lIlIllIIIIlIlI[48] = (88 + 130 - 116 + 38 ^ 153 + 12 - 152 + 159);
        EnumChatFormatting.lIlIllIIIIlIlI[49] = (0x8C ^ 0xAD);
        EnumChatFormatting.lIlIllIIIIlIlI[50] = (9 + 124 - 8 + 83 ^ 160 + 164 - 206 + 69);
        EnumChatFormatting.lIlIllIIIIlIlI[51] = (0x71 ^ 0x53);
        EnumChatFormatting.lIlIllIIIIlIlI[52] = (0xD6 ^ 0x86 ^ (0xC2 ^ 0xB1));
        EnumChatFormatting.lIlIllIIIIlIlI[53] = (0x94 ^ 0xB0 ^ (0xC5 ^ 0x8D));
        EnumChatFormatting.lIlIllIIIIlIlI[54] = (0x91 ^ 0xB5);
        EnumChatFormatting.lIlIllIIIIlIlI[55] = (0x62 ^ 0x9 ^ (0x44 ^ 0xA));
        EnumChatFormatting.lIlIllIIIIlIlI[56] = (97 + 150 - 71 + 78 ^ 114 + 139 - 202 + 96);
        EnumChatFormatting.lIlIllIIIIlIlI[57] = (0xAD ^ 0x8B);
        EnumChatFormatting.lIlIllIIIIlIlI[58] = (10 + 96 - 48 + 123 ^ 83 + 123 - 98 + 38);
        EnumChatFormatting.lIlIllIIIIlIlI[59] = (0x4A ^ 0x24);
        EnumChatFormatting.lIlIllIIIIlIlI[60] = (0x28 ^ 0x0);
        EnumChatFormatting.lIlIllIIIIlIlI[61] = (0xA0 ^ 0x89);
        EnumChatFormatting.lIlIllIIIIlIlI[62] = (0x7B ^ 0x14);
        EnumChatFormatting.lIlIllIIIIlIlI[63] = (0x18 ^ 0x32);
        EnumChatFormatting.lIlIllIIIIlIlI[64] = (0x71 ^ 0x5A);
        EnumChatFormatting.lIlIllIIIIlIlI[65] = (0x43 ^ 0x31);
        EnumChatFormatting.lIlIllIIIIlIlI[66] = -" ".length();
        EnumChatFormatting.lIlIllIIIIlIlI[67] = (0xEC ^ 0xC0);
        EnumChatFormatting.lIlIllIIIIlIlI[68] = (0x8 ^ 0x5F) + (88 + 28 + 16 + 25) - (68 + 148 + 2 + 8) + (51 + 53 + 31 + 14);
        EnumChatFormatting.lIlIllIIIIlIlI[69] = (0xE4 ^ 0x9F ^ (0x7 ^ 0x51));
        EnumChatFormatting.lIlIllIIIIlIlI[70] = (0x44 ^ 0xF ^ (0xF ^ 0x6A));
        EnumChatFormatting.lIlIllIIIIlIlI[71] = (0x77 ^ 0x62 ^ (0xBF ^ 0x85));
    }
    
    static {
        llllIIIIIlIIIII();
        llllIIIIIIlllll();
        final EnumChatFormatting[] enum$VALUES = new EnumChatFormatting[EnumChatFormatting.lIlIllIIIIlIlI[33]];
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[0]] = EnumChatFormatting.BLACK;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[1]] = EnumChatFormatting.DARK_BLUE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[3]] = EnumChatFormatting.DARK_GREEN;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[4]] = EnumChatFormatting.DARK_AQUA;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[6]] = EnumChatFormatting.DARK_RED;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[7]] = EnumChatFormatting.DARK_PURPLE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[9]] = EnumChatFormatting.GOLD;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[10]] = EnumChatFormatting.GRAY;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[12]] = EnumChatFormatting.DARK_GRAY;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[13]] = EnumChatFormatting.BLUE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[15]] = EnumChatFormatting.GREEN;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[16]] = EnumChatFormatting.AQUA;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[18]] = EnumChatFormatting.RED;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[19]] = EnumChatFormatting.LIGHT_PURPLE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[21]] = EnumChatFormatting.YELLOW;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[22]] = EnumChatFormatting.WHITE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[24]] = EnumChatFormatting.OBFUSCATED;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[25]] = EnumChatFormatting.BOLD;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[27]] = EnumChatFormatting.STRIKETHROUGH;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[28]] = EnumChatFormatting.UNDERLINE;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[30]] = EnumChatFormatting.ITALIC;
        enum$VALUES[EnumChatFormatting.lIlIllIIIIlIlI[31]] = EnumChatFormatting.RESET;
        ENUM$VALUES = enum$VALUES;
        nameMapping = Maps.newHashMap();
        formattingCodePattern = Pattern.compile(String.valueOf(new StringBuilder(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[67]]).append(String.valueOf((char)EnumChatFormatting.lIlIllIIIIlIlI[68])).append(EnumChatFormatting.lIlIllIIIIlIIl[EnumChatFormatting.lIlIllIIIIlIlI[69]])));
        final char lllllllllllllIIIIlllIllIllIllllI;
        final byte lllllllllllllIIIIlllIllIllIlllll = (byte)((EnumChatFormatting[])(Object)(lllllllllllllIIIIlllIllIllIllllI = (char)(Object)values())).length;
        boolean lllllllllllllIIIIlllIllIlllIIIII = EnumChatFormatting.lIlIllIIIIlIlI[0] != 0;
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIIIIIlIIIIl(lllllllllllllIIIIlllIllIlllIIIII ? 1 : 0, lllllllllllllIIIIlllIllIllIlllll)) {
            final EnumChatFormatting lllllllllllllIIIIlllIllIlllIIIlI = lllllllllllllIIIIlllIllIllIllllI[lllllllllllllIIIIlllIllIlllIIIII];
            EnumChatFormatting.nameMapping.put(func_175745_c(lllllllllllllIIIIlllIllIlllIIIlI.name), lllllllllllllIIIIlllIllIlllIIIlI);
            "".length();
            ++lllllllllllllIIIIlllIllIlllIIIII;
        }
    }
    
    public int getColorIndex() {
        return this.colorIndex;
    }
}
