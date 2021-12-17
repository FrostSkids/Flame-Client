// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumChatFormatting;
import com.google.common.collect.Maps;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import java.util.Map;

public interface IScoreObjectiveCriteria
{
    boolean isReadOnly();
    
    int func_96635_a(final List<EntityPlayer> p0);
    
    EnumRenderType getRenderType();
    
    default static {
        final IScoreObjectiveCriteria[] field_178792_h2 = new IScoreObjectiveCriteria[0x75 ^ 0x65];
        field_178792_h2[(0x2F ^ 0x3F) & ~(0x9 ^ 0x19)] = new GoalColor("teamkill.", EnumChatFormatting.BLACK);
        field_178792_h2[" ".length()] = new GoalColor("teamkill.", EnumChatFormatting.DARK_BLUE);
        field_178792_h2["  ".length()] = new GoalColor("teamkill.", EnumChatFormatting.DARK_GREEN);
        field_178792_h2["   ".length()] = new GoalColor("teamkill.", EnumChatFormatting.DARK_AQUA);
        field_178792_h2[0x5F ^ 0x5B] = new GoalColor("teamkill.", EnumChatFormatting.DARK_RED);
        field_178792_h2[0xDB ^ 0xC2 ^ (0x8C ^ 0x90)] = new GoalColor("teamkill.", EnumChatFormatting.DARK_PURPLE);
        field_178792_h2[0x5C ^ 0x5A] = new GoalColor("teamkill.", EnumChatFormatting.GOLD);
        field_178792_h2[0xD ^ 0x48 ^ (0xE ^ 0x4C)] = new GoalColor("teamkill.", EnumChatFormatting.GRAY);
        field_178792_h2[0xF8 ^ 0xC1 ^ (0xAD ^ 0x9C)] = new GoalColor("teamkill.", EnumChatFormatting.DARK_GRAY);
        field_178792_h2[0xB2 ^ 0xBB] = new GoalColor("teamkill.", EnumChatFormatting.BLUE);
        field_178792_h2[0x7D ^ 0x6D ^ (0x2D ^ 0x37)] = new GoalColor("teamkill.", EnumChatFormatting.GREEN);
        field_178792_h2[0xF ^ 0x4] = new GoalColor("teamkill.", EnumChatFormatting.AQUA);
        field_178792_h2[0x34 ^ 0x38] = new GoalColor("teamkill.", EnumChatFormatting.RED);
        field_178792_h2[0xAB ^ 0xA6] = new GoalColor("teamkill.", EnumChatFormatting.LIGHT_PURPLE);
        field_178792_h2[0x24 ^ 0x2A] = new GoalColor("teamkill.", EnumChatFormatting.YELLOW);
        field_178792_h2[0x40 ^ 0x4F] = new GoalColor("teamkill.", EnumChatFormatting.WHITE);
        final IScoreObjectiveCriteria[] field_178793_i2 = new IScoreObjectiveCriteria[0xAC ^ 0xBC];
        field_178793_i2[(0x13 ^ 0xF) & ~(0x6E ^ 0x72)] = new GoalColor("killedByTeam.", EnumChatFormatting.BLACK);
        field_178793_i2[" ".length()] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_BLUE);
        field_178793_i2["  ".length()] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_GREEN);
        field_178793_i2["   ".length()] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_AQUA);
        field_178793_i2[0xB ^ 0xF] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_RED);
        field_178793_i2[0x53 ^ 0x56] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_PURPLE);
        field_178793_i2[0x74 ^ 0x39 ^ (0xEF ^ 0xA4)] = new GoalColor("killedByTeam.", EnumChatFormatting.GOLD);
        field_178793_i2[0x48 ^ 0x4F] = new GoalColor("killedByTeam.", EnumChatFormatting.GRAY);
        field_178793_i2[0x41 ^ 0x49] = new GoalColor("killedByTeam.", EnumChatFormatting.DARK_GRAY);
        field_178793_i2[0xCB ^ 0xC2] = new GoalColor("killedByTeam.", EnumChatFormatting.BLUE);
        field_178793_i2[0x5C ^ 0x11 ^ (0x4C ^ 0xB)] = new GoalColor("killedByTeam.", EnumChatFormatting.GREEN);
        field_178793_i2[0x53 ^ 0x6E ^ (0x8F ^ 0xB9)] = new GoalColor("killedByTeam.", EnumChatFormatting.AQUA);
        field_178793_i2[0x34 ^ 0x9 ^ (0x32 ^ 0x3)] = new GoalColor("killedByTeam.", EnumChatFormatting.RED);
        field_178793_i2[91 + 180 - 91 + 11 ^ 68 + 36 - 18 + 92] = new GoalColor("killedByTeam.", EnumChatFormatting.LIGHT_PURPLE);
        field_178793_i2[0xC9 ^ 0xC7] = new GoalColor("killedByTeam.", EnumChatFormatting.YELLOW);
        field_178793_i2[0x65 ^ 0x6A] = new GoalColor("killedByTeam.", EnumChatFormatting.WHITE);
    }
    
    String getName();
    
    public enum EnumRenderType
    {
        INTEGER(EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[0]], EnumRenderType.llIlIlllllIllI[0], EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[1]]);
        
        private final /* synthetic */ String field_178798_d;
        private static final /* synthetic */ Map<String, EnumRenderType> field_178801_c;
        
        HEARTS(EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[2]], EnumRenderType.llIlIlllllIllI[1], EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[3]]);
        
        private static final /* synthetic */ String[] llIlIlllllIIll;
        private static final /* synthetic */ int[] llIlIlllllIllI;
        
        private static boolean lIIlIllIIIIlIIll(final int llllllllllllIllIlIIIlIIlIlllIIll, final int llllllllllllIllIlIIIlIIlIlllIIlI) {
            return llllllllllllIllIlIIIlIIlIlllIIll < llllllllllllIllIlIIIlIIlIlllIIlI;
        }
        
        public String func_178796_a() {
            return this.field_178798_d;
        }
        
        static {
            lIIlIllIIIIlIIII();
            lIIlIllIIIIIllII();
            final EnumRenderType[] enum$VALUES = new EnumRenderType[EnumRenderType.llIlIlllllIllI[2]];
            enum$VALUES[EnumRenderType.llIlIlllllIllI[0]] = EnumRenderType.INTEGER;
            enum$VALUES[EnumRenderType.llIlIlllllIllI[1]] = EnumRenderType.HEARTS;
            ENUM$VALUES = enum$VALUES;
            field_178801_c = Maps.newHashMap();
            final byte llllllllllllIllIlIIIlIIlllIIIlll;
            final int llllllllllllIllIlIIIlIIlllIIlIII = ((EnumRenderType[])(Object)(llllllllllllIllIlIIIlIIlllIIIlll = (byte)(Object)values())).length;
            byte llllllllllllIllIlIIIlIIlllIIlIIl = (byte)EnumRenderType.llIlIlllllIllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIllIIIIlIIIl(llllllllllllIllIlIIIlIIlllIIlIIl, llllllllllllIllIlIIIlIIlllIIlIII)) {
                final EnumRenderType llllllllllllIllIlIIIlIIlllIIlIll = llllllllllllIllIlIIIlIIlllIIIlll[llllllllllllIllIlIIIlIIlllIIlIIl];
                EnumRenderType.field_178801_c.put(llllllllllllIllIlIIIlIIlllIIlIll.func_178796_a(), llllllllllllIllIlIIIlIIlllIIlIll);
                "".length();
                ++llllllllllllIllIlIIIlIIlllIIlIIl;
            }
        }
        
        private static boolean lIIlIllIIIIlIIIl(final int llllllllllllIllIlIIIlIIlIlllIlll, final int llllllllllllIllIlIIIlIIlIlllIllI) {
            return llllllllllllIllIlIIIlIIlIlllIlll >= llllllllllllIllIlIIIlIIlIlllIllI;
        }
        
        private static String lIIlIllIIIIIlIlI(final String llllllllllllIllIlIIIlIIllIlIIIlI, final String llllllllllllIllIlIIIlIIllIlIIIll) {
            try {
                final SecretKeySpec llllllllllllIllIlIIIlIIllIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), EnumRenderType.llIlIlllllIllI[5]), "DES");
                final Cipher llllllllllllIllIlIIIlIIllIlIIllI = Cipher.getInstance("DES");
                llllllllllllIllIlIIIlIIllIlIIllI.init(EnumRenderType.llIlIlllllIllI[2], llllllllllllIllIlIIIlIIllIlIIlll);
                return new String(llllllllllllIllIlIIIlIIllIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIIllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIIlIIllIlIIlIl) {
                llllllllllllIllIlIIIlIIllIlIIlIl.printStackTrace();
                return null;
            }
        }
        
        private EnumRenderType(final String llllllllllllIllIlIIIlIIllIllllll, final int llllllllllllIllIlIIIlIIllIlllllI, final String llllllllllllIllIlIIIlIIllIllllIl) {
            this.field_178798_d = llllllllllllIllIlIIIlIIllIllllIl;
        }
        
        private static boolean lIIlIllIIIIlIIlI(final Object llllllllllllIllIlIIIlIIlIlllIIII) {
            return llllllllllllIllIlIIIlIIlIlllIIII == null;
        }
        
        private static void lIIlIllIIIIlIIII() {
            (llIlIlllllIllI = new int[6])[0] = ((0x2 ^ 0x14 ^ (0x1D ^ 0x56)) & (0x8 ^ 0x7 ^ (0x4F ^ 0x1D) ^ -" ".length()));
            EnumRenderType.llIlIlllllIllI[1] = " ".length();
            EnumRenderType.llIlIlllllIllI[2] = "  ".length();
            EnumRenderType.llIlIlllllIllI[3] = "   ".length();
            EnumRenderType.llIlIlllllIllI[4] = (0x6A ^ 0x6E);
            EnumRenderType.llIlIlllllIllI[5] = (121 + 149 - 256 + 138 ^ 47 + 106 - 93 + 84);
        }
        
        public static EnumRenderType func_178795_a(final String llllllllllllIllIlIIIlIIllIllIlll) {
            final EnumRenderType llllllllllllIllIlIIIlIIllIllIllI = EnumRenderType.field_178801_c.get(llllllllllllIllIlIIIlIIllIllIlll);
            EnumRenderType integer;
            if (lIIlIllIIIIlIIlI(llllllllllllIllIlIIIlIIllIllIllI)) {
                integer = EnumRenderType.INTEGER;
                "".length();
                if ((0x96 ^ 0x92) == 0x0) {
                    return null;
                }
            }
            else {
                integer = llllllllllllIllIlIIIlIIllIllIllI;
            }
            return integer;
        }
        
        private static void lIIlIllIIIIIllII() {
            (llIlIlllllIIll = new String[EnumRenderType.llIlIlllllIllI[4]])[EnumRenderType.llIlIlllllIllI[0]] = lIIlIllIIIIIlIIl("U6Vht2dAIfQ=", "ADTEl");
            EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[1]] = lIIlIllIIIIIlIlI("pe0evZyHDfw=", "hfYDW");
            EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[2]] = lIIlIllIIIIIlIll("LAEPOCE3", "dDNju");
            EnumRenderType.llIlIlllllIIll[EnumRenderType.llIlIlllllIllI[3]] = lIIlIllIIIIIlIlI("N2nnvTehy/M=", "UfNlp");
        }
        
        private static String lIIlIllIIIIIlIll(String llllllllllllIllIlIIIlIIllIIIIIlI, final String llllllllllllIllIlIIIlIIllIIIIllI) {
            llllllllllllIllIlIIIlIIllIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIlIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIIlIIllIIIIlIl = new StringBuilder();
            final char[] llllllllllllIllIlIIIlIIllIIIIlII = llllllllllllIllIlIIIlIIllIIIIllI.toCharArray();
            int llllllllllllIllIlIIIlIIllIIIIIll = EnumRenderType.llIlIlllllIllI[0];
            final byte llllllllllllIllIlIIIlIIlIlllllIl = (Object)llllllllllllIllIlIIIlIIllIIIIIlI.toCharArray();
            final byte llllllllllllIllIlIIIlIIlIlllllII = (byte)llllllllllllIllIlIIIlIIlIlllllIl.length;
            double llllllllllllIllIlIIIlIIlIllllIll = EnumRenderType.llIlIlllllIllI[0];
            while (lIIlIllIIIIlIIll((int)llllllllllllIllIlIIIlIIlIllllIll, llllllllllllIllIlIIIlIIlIlllllII)) {
                final char llllllllllllIllIlIIIlIIllIIIlIII = llllllllllllIllIlIIIlIIlIlllllIl[llllllllllllIllIlIIIlIIlIllllIll];
                llllllllllllIllIlIIIlIIllIIIIlIl.append((char)(llllllllllllIllIlIIIlIIllIIIlIII ^ llllllllllllIllIlIIIlIIllIIIIlII[llllllllllllIllIlIIIlIIllIIIIIll % llllllllllllIllIlIIIlIIllIIIIlII.length]));
                "".length();
                ++llllllllllllIllIlIIIlIIllIIIIIll;
                ++llllllllllllIllIlIIIlIIlIllllIll;
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIIlIIllIIIIlIl);
        }
        
        private static String lIIlIllIIIIIlIIl(final String llllllllllllIllIlIIIlIIllIIlIlIl, final String llllllllllllIllIlIIIlIIllIIlIlII) {
            try {
                final SecretKeySpec llllllllllllIllIlIIIlIIllIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlIIIlIIllIIllIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIlIIIlIIllIIllIIl.init(EnumRenderType.llIlIlllllIllI[2], llllllllllllIllIlIIIlIIllIIllIlI);
                return new String(llllllllllllIllIlIIIlIIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlIIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlIIIlIIllIIllIII) {
                llllllllllllIllIlIIIlIIllIIllIII.printStackTrace();
                return null;
            }
        }
    }
}
