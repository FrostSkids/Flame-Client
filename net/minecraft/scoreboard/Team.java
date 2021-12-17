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
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Collection;

public abstract class Team
{
    private static final /* synthetic */ int[] llllIIlIlIlll;
    
    public abstract Collection<String> getMembershipCollection();
    
    public boolean isSameTeam(final Team lllllllllllllIlIlllIIlIlllIlIlIl) {
        int n;
        if (lIlIlIIIlIIllIl(lllllllllllllIlIlllIIlIlllIlIlIl)) {
            n = Team.llllIIlIlIlll[0];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x3F ^ 0x1D) & ~(0xA5 ^ 0x87)) != 0x0;
            }
        }
        else if (lIlIlIIIlIIlllI(this, lllllllllllllIlIlllIIlIlllIlIlIl)) {
            n = Team.llllIIlIlIlll[1];
            "".length();
            if (((0xF6 ^ 0xAF ^ (0xCA ^ 0x9C)) & (31 + 64 + 49 + 27 ^ 126 + 140 - 171 + 69 ^ -" ".length())) >= "  ".length()) {
                return ((0x38 ^ 0x2C ^ (0x92 ^ 0xB0)) & (133 + 3 - 82 + 94 ^ 2 + 59 + 44 + 57 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Team.llllIIlIlIlll[0];
        }
        return n != 0;
    }
    
    public abstract boolean getSeeFriendlyInvisiblesEnabled();
    
    public abstract String formatString(final String p0);
    
    private static boolean lIlIlIIIlIIllIl(final Object lllllllllllllIlIlllIIlIlllIIllIl) {
        return lllllllllllllIlIlllIIlIlllIIllIl == null;
    }
    
    public abstract EnumVisible getDeathMessageVisibility();
    
    private static boolean lIlIlIIIlIIlllI(final Object lllllllllllllIlIlllIIlIlllIlIIII, final Object lllllllllllllIlIlllIIlIlllIIllll) {
        return lllllllllllllIlIlllIIlIlllIlIIII == lllllllllllllIlIlllIIlIlllIIllll;
    }
    
    public abstract boolean getAllowFriendlyFire();
    
    public abstract EnumVisible getNameTagVisibility();
    
    private static void lIlIlIIIlIIllII() {
        (llllIIlIlIlll = new int[2])[0] = ((0x22 ^ 0x0) & ~(0x5 ^ 0x27));
        Team.llllIIlIlIlll[1] = " ".length();
    }
    
    static {
        lIlIlIIIlIIllII();
    }
    
    public abstract String getRegisteredName();
    
    public enum EnumVisible
    {
        private static final /* synthetic */ String[] lIIIIlIlIIllll;
        private static /* synthetic */ Map<String, EnumVisible> field_178828_g;
        
        HIDE_FOR_OWN_TEAM(EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[6]], EnumVisible.lIIIIlIllIlIII[3], EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[7]], EnumVisible.lIIIIlIllIlIII[3]), 
        NEVER(EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[2]], EnumVisible.lIIIIlIllIlIII[1], EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[3]], EnumVisible.lIIIIlIllIlIII[1]), 
        HIDE_FOR_OTHER_TEAMS(EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[4]], EnumVisible.lIIIIlIllIlIII[2], EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[5]], EnumVisible.lIIIIlIllIlIII[2]), 
        ALWAYS(EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[0]], EnumVisible.lIIIIlIllIlIII[0], EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[1]], EnumVisible.lIIIIlIllIlIII[0]);
        
        private static final /* synthetic */ int[] lIIIIlIllIlIII;
        public final /* synthetic */ int field_178827_f;
        public final /* synthetic */ String field_178830_e;
        
        static {
            lIlllIlIlIIIIII();
            lIlllIIlllIlIII();
            final EnumVisible[] enum$VALUES = new EnumVisible[EnumVisible.lIIIIlIllIlIII[4]];
            enum$VALUES[EnumVisible.lIIIIlIllIlIII[0]] = EnumVisible.ALWAYS;
            enum$VALUES[EnumVisible.lIIIIlIllIlIII[1]] = EnumVisible.NEVER;
            enum$VALUES[EnumVisible.lIIIIlIllIlIII[2]] = EnumVisible.HIDE_FOR_OTHER_TEAMS;
            enum$VALUES[EnumVisible.lIIIIlIllIlIII[3]] = EnumVisible.HIDE_FOR_OWN_TEAM;
            ENUM$VALUES = enum$VALUES;
            EnumVisible.field_178828_g = (Map<String, EnumVisible>)Maps.newHashMap();
            final Exception lllllllllllllIlIIlIlIlIIIIlIIlIl;
            final long lllllllllllllIlIIlIlIlIIIIlIIllI = ((EnumVisible[])(Object)(lllllllllllllIlIIlIlIlIIIIlIIlIl = (Exception)(Object)values())).length;
            double lllllllllllllIlIIlIlIlIIIIlIIlll = EnumVisible.lIIIIlIllIlIII[0];
            "".length();
            if ((0x37 ^ 0x33) != (0x94 ^ 0x90)) {
                return;
            }
            while (!lIlllIlIlIIIIIl((int)lllllllllllllIlIIlIlIlIIIIlIIlll, (int)lllllllllllllIlIIlIlIlIIIIlIIllI)) {
                final EnumVisible lllllllllllllIlIIlIlIlIIIIlIlIIl = lllllllllllllIlIIlIlIlIIIIlIIlIl[lllllllllllllIlIIlIlIlIIIIlIIlll];
                EnumVisible.field_178828_g.put(lllllllllllllIlIIlIlIlIIIIlIlIIl.field_178830_e, lllllllllllllIlIIlIlIlIIIIlIlIIl);
                "".length();
                ++lllllllllllllIlIIlIlIlIIIIlIIlll;
            }
        }
        
        private EnumVisible(final String lllllllllllllIlIIlIlIlIIIIIlIlIl, final int lllllllllllllIlIIlIlIlIIIIIlIlII, final String lllllllllllllIlIIlIlIlIIIIIlIIll, final int lllllllllllllIlIIlIlIlIIIIIllIII) {
            this.field_178830_e = lllllllllllllIlIIlIlIlIIIIIlIIll;
            this.field_178827_f = lllllllllllllIlIIlIlIlIIIIIllIII;
        }
        
        private static void lIlllIlIlIIIIII() {
            (lIIIIlIllIlIII = new int[9])[0] = ((0x93 ^ 0x8B) & ~(0xB4 ^ 0xAC));
            EnumVisible.lIIIIlIllIlIII[1] = " ".length();
            EnumVisible.lIIIIlIllIlIII[2] = "  ".length();
            EnumVisible.lIIIIlIllIlIII[3] = "   ".length();
            EnumVisible.lIIIIlIllIlIII[4] = (102 + 153 - 252 + 157 ^ 43 + 35 - 1 + 87);
            EnumVisible.lIIIIlIllIlIII[5] = (0x79 ^ 0x7C);
            EnumVisible.lIIIIlIllIlIII[6] = (0xA2 ^ 0xA4);
            EnumVisible.lIIIIlIllIlIII[7] = (0x12 ^ 0x15);
            EnumVisible.lIIIIlIllIlIII[8] = (0x21 ^ 0x29);
        }
        
        private static String lIlllIIlllIIlIl(final String lllllllllllllIlIIlIlIIllllIllIIl, final String lllllllllllllIlIIlIlIIllllIllIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIlIIlllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIllllIllIlI.getBytes(StandardCharsets.UTF_8)), EnumVisible.lIIIIlIllIlIII[8]), "DES");
                final Cipher lllllllllllllIlIIlIlIIllllIlllll = Cipher.getInstance("DES");
                lllllllllllllIlIIlIlIIllllIlllll.init(EnumVisible.lIIIIlIllIlIII[2], lllllllllllllIlIIlIlIIlllllIIIIl);
                return new String(lllllllllllllIlIIlIlIIllllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIlIIllllIlllIl) {
                lllllllllllllIlIIlIlIIllllIlllIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllIIlllIlIII() {
            (lIIIIlIlIIllll = new String[EnumVisible.lIIIIlIllIlIII[8]])[EnumVisible.lIIIIlIllIlIII[0]] = lIlllIIlllIIlIl("nRPIJs9ypdo=", "DYzfi");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[1]] = lIlllIIlllIIllI("KS/r3E02uLE=", "bhGpR");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[2]] = lIlllIIlllIIllI("gobj9LUiaWU=", "pdNBM");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[3]] = lIlllIIlllIIllI("pi+4E8AOnFs=", "EdauJ");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[4]] = lIlllIIlllIIllI("jvNrUZkHZ6dgGbtQ83jg7iZFyJJrESL5", "tFqet");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[5]] = lIlllIIlllIIlIl("X0qu7Jo/wY/xHsYHgi/9DkJ4kEvYaKkD", "Ljzaf");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[6]] = lIlllIIlllIIlll("MS03Mg4/KyEoHi4qLCMUOCk=", "ydswQ");
            EnumVisible.lIIIIlIlIIllll[EnumVisible.lIIIIlIllIlIII[7]] = lIlllIIlllIIlll("IzkqHz4kIgENFh81Lxc=", "KPNzx");
        }
        
        private static String lIlllIIlllIIllI(final String lllllllllllllIlIIlIlIIllllllIlll, final String lllllllllllllIlIIlIlIIllllllIlIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIlIIlllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlIlIIlllllllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlIlIIlllllllIIl.init(EnumVisible.lIIIIlIllIlIII[2], lllllllllllllIlIIlIlIIlllllllIlI);
                return new String(lllllllllllllIlIIlIlIIlllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIlIIlllllllIII) {
                lllllllllllllIlIIlIlIIlllllllIII.printStackTrace();
                return null;
            }
        }
        
        public static String[] func_178825_a() {
            return EnumVisible.field_178828_g.keySet().toArray(new String[EnumVisible.field_178828_g.size()]);
        }
        
        private static boolean lIlllIlIlIIIIIl(final int lllllllllllllIlIIlIlIIlllIIllIll, final int lllllllllllllIlIIlIlIIlllIIllIIl) {
            return lllllllllllllIlIIlIlIIlllIIllIll >= lllllllllllllIlIIlIlIIlllIIllIIl;
        }
        
        private static String lIlllIIlllIIlll(String lllllllllllllIlIIlIlIIlllIllIIIl, final String lllllllllllllIlIIlIlIIlllIlllIlI) {
            lllllllllllllIlIIlIlIIlllIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIlIIlllIlllIII = new StringBuilder();
            final char[] lllllllllllllIlIIlIlIIlllIllIlIl = lllllllllllllIlIIlIlIIlllIlllIlI.toCharArray();
            int lllllllllllllIlIIlIlIIlllIllIIll = EnumVisible.lIIIIlIllIlIII[0];
            final short lllllllllllllIlIIlIlIIlllIlIlIIl = (Object)lllllllllllllIlIIlIlIIlllIllIIIl.toCharArray();
            final int lllllllllllllIlIIlIlIIlllIlIIlll = lllllllllllllIlIIlIlIIlllIlIlIIl.length;
            double lllllllllllllIlIIlIlIIlllIlIIlIl = EnumVisible.lIIIIlIllIlIII[0];
            while (lIlllIlIlIIIIll((int)lllllllllllllIlIIlIlIIlllIlIIlIl, lllllllllllllIlIIlIlIIlllIlIIlll)) {
                final char lllllllllllllIlIIlIlIIlllIllllIl = lllllllllllllIlIIlIlIIlllIlIlIIl[lllllllllllllIlIIlIlIIlllIlIIlIl];
                lllllllllllllIlIIlIlIIlllIlllIII.append((char)(lllllllllllllIlIIlIlIIlllIllllIl ^ lllllllllllllIlIIlIlIIlllIllIlIl[lllllllllllllIlIIlIlIIlllIllIIll % lllllllllllllIlIIlIlIIlllIllIlIl.length]));
                "".length();
                ++lllllllllllllIlIIlIlIIlllIllIIll;
                ++lllllllllllllIlIIlIlIIlllIlIIlIl;
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIlIIlllIlllIII);
        }
        
        private static boolean lIlllIlIlIIIIll(final int lllllllllllllIlIIlIlIIlllIIlIlIl, final int lllllllllllllIlIIlIlIIlllIIlIlII) {
            return lllllllllllllIlIIlIlIIlllIIlIlIl < lllllllllllllIlIIlIlIIlllIIlIlII;
        }
        
        public static EnumVisible func_178824_a(final String lllllllllllllIlIIlIlIlIIIIlIIIlI) {
            return EnumVisible.field_178828_g.get(lllllllllllllIlIIlIlIlIIIIlIIIlI);
        }
    }
}
