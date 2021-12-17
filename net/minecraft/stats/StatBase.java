// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import java.util.Locale;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import java.text.NumberFormat;
import net.minecraft.util.IChatComponent;
import java.text.DecimalFormat;
import net.minecraft.util.IJsonSerializable;

public class StatBase
{
    public static /* synthetic */ IStatType field_111202_k;
    public static /* synthetic */ IStatType simpleStatType;
    private /* synthetic */ Class<? extends IJsonSerializable> field_150956_d;
    public final /* synthetic */ String statId;
    public /* synthetic */ boolean isIndependent;
    private static /* synthetic */ DecimalFormat decimalFormat;
    private final /* synthetic */ IChatComponent statName;
    private static final /* synthetic */ String[] lIIIlllIlIIlII;
    private static /* synthetic */ NumberFormat numberFormat;
    private final /* synthetic */ IScoreObjectiveCriteria field_150957_c;
    public static /* synthetic */ IStatType timeStatType;
    public static /* synthetic */ IStatType distanceStatType;
    private static final /* synthetic */ int[] lIIIllllIlllII;
    private final /* synthetic */ IStatType type;
    
    public IChatComponent getStatName() {
        final IChatComponent lllllllllllllIIllllIIlIllIlIllII = this.statName.createCopy();
        lllllllllllllIIllllIIlIllIlIllII.getChatStyle().setColor(EnumChatFormatting.GRAY);
        "".length();
        lllllllllllllIIllllIIlIllIlIllII.getChatStyle().setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ACHIEVEMENT, new ChatComponentText(this.statId)));
        "".length();
        return lllllllllllllIIllllIIlIllIlIllII;
    }
    
    public IScoreObjectiveCriteria func_150952_k() {
        return this.field_150957_c;
    }
    
    private static String llIIIllIlIIIlIl(final String lllllllllllllIIllllIIlIlIlIlIlll, final String lllllllllllllIIllllIIlIlIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlIlIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIlIlIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIlIlIlIllIll.init(StatBase.lIIIllllIlllII[2], lllllllllllllIIllllIIlIlIlIlllII);
            return new String(lllllllllllllIIllllIIlIlIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlIlIlIllIlI) {
            lllllllllllllIIllllIIlIlIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIllIlIIIlII(String lllllllllllllIIllllIIlIlIllIlIIl, final String lllllllllllllIIllllIIlIlIllIlIII) {
        lllllllllllllIIllllIIlIlIllIlIIl = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIlIlIllIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIlIlIllIllII = new StringBuilder();
        final char[] lllllllllllllIIllllIIlIlIllIlIll = lllllllllllllIIllllIIlIlIllIlIII.toCharArray();
        int lllllllllllllIIllllIIlIlIllIlIlI = StatBase.lIIIllllIlllII[0];
        final char lllllllllllllIIllllIIlIlIllIIlII = (Object)((String)lllllllllllllIIllllIIlIlIllIlIIl).toCharArray();
        final short lllllllllllllIIllllIIlIlIllIIIll = (short)lllllllllllllIIllllIIlIlIllIIlII.length;
        String lllllllllllllIIllllIIlIlIllIIIlI = (String)StatBase.lIIIllllIlllII[0];
        while (llIIlIIIIIlIIII((int)lllllllllllllIIllllIIlIlIllIIIlI, lllllllllllllIIllllIIlIlIllIIIll)) {
            final char lllllllllllllIIllllIIlIlIllIllll = lllllllllllllIIllllIIlIlIllIIlII[lllllllllllllIIllllIIlIlIllIIIlI];
            lllllllllllllIIllllIIlIlIllIllII.append((char)(lllllllllllllIIllllIIlIlIllIllll ^ lllllllllllllIIllllIIlIlIllIlIll[lllllllllllllIIllllIIlIlIllIlIlI % lllllllllllllIIllllIIlIlIllIlIll.length]));
            "".length();
            ++lllllllllllllIIllllIIlIlIllIlIlI;
            ++lllllllllllllIIllllIIlIlIllIIIlI;
            "".length();
            if (((0xF1 ^ 0x99 ^ (0xD9 ^ 0xA7)) & (0x5A ^ 0x7 ^ (0x44 ^ 0xF) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIlIlIllIllII);
    }
    
    public StatBase initIndependentStat() {
        this.isIndependent = (StatBase.lIIIllllIlllII[1] != 0);
        return this;
    }
    
    public StatBase(final String lllllllllllllIIllllIIlIlllIIIIIl, final IChatComponent lllllllllllllIIllllIIlIlllIIIIII) {
        this(lllllllllllllIIllllIIlIlllIIIIIl, lllllllllllllIIllllIIlIlllIIIIII, StatBase.simpleStatType);
    }
    
    private static boolean llIIlIIIIIIllIl(final int lllllllllllllIIllllIIlIlIlIIlIII) {
        return lllllllllllllIIllllIIlIlIlIIlIII != 0;
    }
    
    public StatBase(final String lllllllllllllIIllllIIlIlllIIllII, final IChatComponent lllllllllllllIIllllIIlIlllIIIlll, final IStatType lllllllllllllIIllllIIlIlllIIIllI) {
        this.statId = lllllllllllllIIllllIIlIlllIIllII;
        this.statName = lllllllllllllIIllllIIlIlllIIIlll;
        this.type = lllllllllllllIIllllIIlIlllIIIllI;
        this.field_150957_c = new ObjectiveStat(this);
        IScoreObjectiveCriteria.INSTANCES.put(this.field_150957_c.getName(), this.field_150957_c);
        "".length();
    }
    
    public StatBase func_150953_b(final Class<? extends IJsonSerializable> lllllllllllllIIllllIIlIllIIIIllI) {
        this.field_150956_d = lllllllllllllIIllllIIlIllIIIIllI;
        return this;
    }
    
    private static void llIIlIIIIIIllII() {
        (lIIIllllIlllII = new int[13])[0] = ((0xB4 ^ 0xB3) & ~(0x33 ^ 0x34));
        StatBase.lIIIllllIlllII[1] = " ".length();
        StatBase.lIIIllllIlllII[2] = "  ".length();
        StatBase.lIIIllllIlllII[3] = "   ".length();
        StatBase.lIIIllllIlllII[4] = (0xC2 ^ 0xC6);
        StatBase.lIIIllllIlllII[5] = (0x7 ^ 0x2);
        StatBase.lIIIllllIlllII[6] = (0x5 ^ 0x3);
        StatBase.lIIIllllIlllII[7] = (0xA1 ^ 0xA6);
        StatBase.lIIIllllIlllII[8] = (0x68 ^ 0x2F ^ (0x40 ^ 0xF));
        StatBase.lIIIllllIlllII[9] = (0x9 ^ 0x0);
        StatBase.lIIIllllIlllII[10] = (0x3F ^ 0x35);
        StatBase.lIIIllllIlllII[11] = (0x19 ^ 0x64);
        StatBase.lIIIllllIlllII[12] = (0x88 ^ 0x83);
    }
    
    private static String llIIIllIlIIIIll(final String lllllllllllllIIllllIIlIlIllllllI, final String lllllllllllllIIllllIIlIlIlllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlIllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIlIlllllIl.getBytes(StandardCharsets.UTF_8)), StatBase.lIIIllllIlllII[8]), "DES");
            final Cipher lllllllllllllIIllllIIlIllIIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllllIIlIllIIIIIII.init(StatBase.lIIIllllIlllII[2], lllllllllllllIIllllIIlIllIIIIIIl);
            return new String(lllllllllllllIIllllIIlIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlIlIlllllll) {
            lllllllllllllIIllllIIlIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[6]]).append(this.statId).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[7]]).append(this.statName).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[8]]).append(this.isIndependent).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[9]]).append(this.type).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[10]]).append(this.field_150957_c).append((char)StatBase.lIIIllllIlllII[11]));
    }
    
    @Override
    public int hashCode() {
        return this.statId.hashCode();
    }
    
    public IChatComponent func_150955_j() {
        final IChatComponent lllllllllllllIIllllIIlIllIlIIlIl = this.getStatName();
        final IChatComponent lllllllllllllIIllllIIlIllIlIIlII = new ChatComponentText(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[4]]).appendSibling(lllllllllllllIIllllIIlIllIlIIlIl).appendText(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[5]]);
        lllllllllllllIIllllIIlIllIlIIlII.setChatStyle(lllllllllllllIIllllIIlIllIlIIlIl.getChatStyle());
        "".length();
        return lllllllllllllIIllllIIlIllIlIIlII;
    }
    
    private static void llIIIllIlIIIllI() {
        (lIIIlllIlIIlII = new String[StatBase.lIIIllllIlllII[12]])[StatBase.lIIIllllIlllII[0]] = llIIIllIlIIIIll("M4W5GGbk1BwqW66lJxZqfw==", "WgCpm");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[1]] = llIIIllIlIIIlII("MwAXKygUFBMiYQQBBjNhHhFdZ2M=", "wugGA");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[2]] = llIIIllIlIIIlII("T3EnOhdNcw==", "mQFTs");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[3]] = llIIIllIlIIIlIl("SF8lfAru71EMOOpEOBT9EQ==", "AioPg");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[4]] = llIIIllIlIIIlIl("WYcj22gKwk0=", "iFCvs");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[5]] = llIIIllIlIIIlIl("PPc3an7q3x8=", "WhjZg");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[6]] = llIIIllIlIIIlII("AxAEATY5AFg=", "PdeuM");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[7]] = llIIIllIlIIIlII("SnkcLQ4DEBZx", "fYrLc");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[8]] = llIIIllIlIIIlIl("+PZtgq7LuU19hXKnuuppuuPu5jk0DSEG", "Hwtuv");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[9]] = llIIIllIlIIIIll("48ZnRfo7fPklo43idDYzMQ==", "JmzzL");
        StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[10]] = llIIIllIlIIIlIl("PApUZDLpg3yAxMCwNJkQcM4rrDT+WlKd", "UejYe");
    }
    
    public boolean isAchievement() {
        return StatBase.lIIIllllIlllII[0] != 0;
    }
    
    private static boolean llIIlIIIIIlIIII(final int lllllllllllllIIllllIIlIlIlIlIIIl, final int lllllllllllllIIllllIIlIlIlIlIIII) {
        return lllllllllllllIIllllIIlIlIlIlIIIl < lllllllllllllIIllllIIlIlIlIlIIII;
    }
    
    public StatBase registerStat() {
        if (llIIlIIIIIIllIl(StatList.oneShotStats.containsKey(this.statId) ? 1 : 0)) {
            throw new RuntimeException(String.valueOf(new StringBuilder(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[1]]).append(StatList.oneShotStats.get(this.statId).statName).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[2]]).append(this.statName).append(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[3]]).append(this.statId)));
        }
        StatList.allStats.add(this);
        "".length();
        StatList.oneShotStats.put(this.statId, this);
        "".length();
        return this;
    }
    
    public Class<? extends IJsonSerializable> func_150954_l() {
        return this.field_150956_d;
    }
    
    private static boolean llIIlIIIIIIlllI(final Object lllllllllllllIIllllIIlIlIlIIllIl, final Object lllllllllllllIIllllIIlIlIlIIllII) {
        return lllllllllllllIIllllIIlIlIlIIllIl == lllllllllllllIIllllIIlIlIlIIllII;
    }
    
    private static boolean llIIlIIIIIIllll(final Object lllllllllllllIIllllIIlIlIlIIlIlI) {
        return lllllllllllllIIllllIIlIlIlIIlIlI != null;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIllllIIlIllIIllIIl) {
        if (llIIlIIIIIIlllI(this, lllllllllllllIIllllIIlIllIIllIIl)) {
            return StatBase.lIIIllllIlllII[1] != 0;
        }
        if (llIIlIIIIIIllll(lllllllllllllIIllllIIlIllIIllIIl) && llIIlIIIIIIlllI(this.getClass(), lllllllllllllIIllllIIlIllIIllIIl.getClass())) {
            final StatBase lllllllllllllIIllllIIlIllIIllIll = (StatBase)lllllllllllllIIllllIIlIllIIllIIl;
            return this.statId.equals(lllllllllllllIIllllIIlIllIIllIll.statId);
        }
        return StatBase.lIIIllllIlllII[0] != 0;
    }
    
    static {
        llIIlIIIIIIllII();
        llIIIllIlIIIllI();
        StatBase.numberFormat = NumberFormat.getIntegerInstance(Locale.US);
        StatBase.simpleStatType = new IStatType() {
            @Override
            public String format(final int llllllllllllIllllIlIIlllIIIlIIlI) {
                return StatBase.numberFormat.format(llllllllllllIllllIlIIlllIIIlIIlI);
            }
        };
        StatBase.decimalFormat = new DecimalFormat(StatBase.lIIIlllIlIIlII[StatBase.lIIIllllIlllII[0]]);
        StatBase.timeStatType = new IStatType() {
            private static final /* synthetic */ int[] lIIllIIlIllIll;
            private static final /* synthetic */ String[] lIIllIIlIllIII;
            
            private static int llIlIlllIllIIll(final double n, final double n2) {
                return dcmpl(n, n2);
            }
            
            private static boolean llIlIlllIllIlII(final int lllllllllllllIIlIllIIIIIlIlIllIl) {
                return lllllllllllllIIlIllIIIIIlIlIllIl > 0;
            }
            
            private static String llIlIlllIlIIIll(final String lllllllllllllIIlIllIIIIIllIllIll, final String lllllllllllllIIlIllIIIIIllIllIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIIIIIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), StatBase$2.lIIllIIlIllIll[6]), "DES");
                    final Cipher lllllllllllllIIlIllIIIIIllIlllll = Cipher.getInstance("DES");
                    lllllllllllllIIlIllIIIIIllIlllll.init(StatBase$2.lIIllIIlIllIll[2], lllllllllllllIIlIllIIIIIlllIIIII);
                    return new String(lllllllllllllIIlIllIIIIIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIIIIIllIllllI) {
                    lllllllllllllIIlIllIIIIIllIllllI.printStackTrace();
                    return null;
                }
            }
            
            private static void llIlIlllIllIIlI() {
                (lIIllIIlIllIll = new int[7])[0] = ((0xF9 ^ 0xB2 ^ (0xFE ^ 0x98)) & (31 + 161 - 188 + 160 ^ 1 + 131 - 58 + 63 ^ -" ".length()));
                StatBase$2.lIIllIIlIllIll[1] = " ".length();
                StatBase$2.lIIllIIlIllIll[2] = "  ".length();
                StatBase$2.lIIllIIlIllIll[3] = "   ".length();
                StatBase$2.lIIllIIlIllIll[4] = (86 + 66 - 40 + 26 ^ 23 + 55 + 49 + 15);
                StatBase$2.lIIllIIlIllIll[5] = (0x47 ^ 0x42);
                StatBase$2.lIIllIIlIllIll[6] = (0xC7 ^ 0x99 ^ (0x9 ^ 0x5F));
            }
            
            private static String llIlIlllIlIllIl(String lllllllllllllIIlIllIIIIIlIlllIll, final String lllllllllllllIIlIllIIIIIlIlllIlI) {
                lllllllllllllIIlIllIIIIIlIlllIll = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIllIIIIIlIlllllI = new StringBuilder();
                final char[] lllllllllllllIIlIllIIIIIlIllllIl = lllllllllllllIIlIllIIIIIlIlllIlI.toCharArray();
                int lllllllllllllIIlIllIIIIIlIllllII = StatBase$2.lIIllIIlIllIll[0];
                final int lllllllllllllIIlIllIIIIIlIllIllI = (Object)lllllllllllllIIlIllIIIIIlIlllIll.toCharArray();
                final float lllllllllllllIIlIllIIIIIlIllIlIl = lllllllllllllIIlIllIIIIIlIllIllI.length;
                boolean lllllllllllllIIlIllIIIIIlIllIlII = StatBase$2.lIIllIIlIllIll[0] != 0;
                while (llIlIlllIllIlIl(lllllllllllllIIlIllIIIIIlIllIlII ? 1 : 0, (int)lllllllllllllIIlIllIIIIIlIllIlIl)) {
                    final char lllllllllllllIIlIllIIIIIllIIIIIl = lllllllllllllIIlIllIIIIIlIllIllI[lllllllllllllIIlIllIIIIIlIllIlII];
                    lllllllllllllIIlIllIIIIIlIlllllI.append((char)(lllllllllllllIIlIllIIIIIllIIIIIl ^ lllllllllllllIIlIllIIIIIlIllllIl[lllllllllllllIIlIllIIIIIlIllllII % lllllllllllllIIlIllIIIIIlIllllIl.length]));
                    "".length();
                    ++lllllllllllllIIlIllIIIIIlIllllII;
                    ++lllllllllllllIIlIllIIIIIlIllIlII;
                    "".length();
                    if ((0xD7 ^ 0xBA ^ (0xF7 ^ 0x9E)) <= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIllIIIIIlIlllllI);
            }
            
            static {
                llIlIlllIllIIlI();
                llIlIlllIlIlllI();
            }
            
            private static void llIlIlllIlIlllI() {
                (lIIllIIlIllIII = new String[StatBase$2.lIIllIIlIllIll[5]])[StatBase$2.lIIllIIlIllIll[0]] = llIlIlllIlIIIll("Kq0s+GGwITg=", "kkPnU");
                StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[1]] = llIlIlllIlIIllI("AKaR1eGos7M=", "znKiM");
                StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[2]] = llIlIlllIlIllIl("Vwk=", "waVkk");
                StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[3]] = llIlIlllIlIIllI("5aIDGAlw5kw=", "EItBy");
                StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[4]] = llIlIlllIlIllIl("bCA=", "LSxri");
            }
            
            private static String llIlIlllIlIIllI(final String lllllllllllllIIlIllIIIIIllIlIIII, final String lllllllllllllIIlIllIIIIIllIIllll) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIIIIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIllIIIIIllIlIIlI = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIllIIIIIllIlIIlI.init(StatBase$2.lIIllIIlIllIll[2], lllllllllllllIIlIllIIIIIllIlIIll);
                    return new String(lllllllllllllIIlIllIIIIIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIIIIIllIlIIIl) {
                    lllllllllllllIIlIllIIIIIllIlIIIl.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String format(final int lllllllllllllIIlIllIIIIIllllIIII) {
                final double lllllllllllllIIlIllIIIIIlllIllll = lllllllllllllIIlIllIIIIIllllIIII / 20.0;
                final double lllllllllllllIIlIllIIIIIlllIlllI = lllllllllllllIIlIllIIIIIlllIllll / 60.0;
                final double lllllllllllllIIlIllIIIIIlllIllIl = lllllllllllllIIlIllIIIIIlllIlllI / 60.0;
                final double lllllllllllllIIlIllIIIIIlllIllII = lllllllllllllIIlIllIIIIIlllIllIl / 24.0;
                final double lllllllllllllIIlIllIIIIIlllIlIll = lllllllllllllIIlIllIIIIIlllIllII / 365.0;
                String s;
                if (llIlIlllIllIlII(llIlIlllIllIIll(lllllllllllllIIlIllIIIIIlllIlIll, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIIlIllIIIIIlllIlIll))).append(StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[0]]));
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                else if (llIlIlllIllIlII(llIlIlllIllIIll(lllllllllllllIIlIllIIIIIlllIllII, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIIlIllIIIIIlllIllII))).append(StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[1]]));
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (llIlIlllIllIlII(llIlIlllIllIIll(lllllllllllllIIlIllIIIIIlllIllIl, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIIlIllIIIIIlllIllIl))).append(StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[2]]));
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return null;
                    }
                }
                else if (llIlIlllIllIlII(llIlIlllIllIIll(lllllllllllllIIlIllIIIIIlllIlllI, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIIlIllIIIIIlllIlllI))).append(StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[3]]));
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIllIIIIIlllIllll)).append(StatBase$2.lIIllIIlIllIII[StatBase$2.lIIllIIlIllIll[4]]));
                }
                return s;
            }
            
            private static boolean llIlIlllIllIlIl(final int lllllllllllllIIlIllIIIIIlIllIIII, final int lllllllllllllIIlIllIIIIIlIlIllll) {
                return lllllllllllllIIlIllIIIIIlIllIIII < lllllllllllllIIlIllIIIIIlIlIllll;
            }
        };
        StatBase.distanceStatType = new IStatType() {
            private static final /* synthetic */ int[] llllllIllllll;
            private static final /* synthetic */ String[] llllllIlllllI;
            
            static {
                lIllIIIIlIIllIl();
                lIllIIIIlIIllII();
            }
            
            @Override
            public String format(final int lllllllllllllIlIlIlIIllIIIllIIII) {
                final double lllllllllllllIlIlIlIIllIIIlIllll = lllllllllllllIlIlIlIIllIIIllIIII / 100.0;
                final double lllllllllllllIlIlIlIIllIIIlIlllI = lllllllllllllIlIlIlIIllIIIlIllll / 1000.0;
                String s;
                if (lIllIIIIlIIllll(lIllIIIIlIIlllI(lllllllllllllIlIlIlIIllIIIlIlllI, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIlIlIlIIllIIIlIlllI))).append(StatBase$3.llllllIlllllI[StatBase$3.llllllIllllll[0]]));
                    "".length();
                    if (((0x82 ^ 0x9A) & ~(0xDE ^ 0xC6)) < ((0xB4 ^ 0x86) & ~(0xB4 ^ 0x86))) {
                        return null;
                    }
                }
                else if (lIllIIIIlIIllll(lIllIIIIlIIlllI(lllllllllllllIlIlIlIIllIIIlIllll, 0.5))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(StatBase.decimalFormat.format(lllllllllllllIlIlIlIIllIIIlIllll))).append(StatBase$3.llllllIlllllI[StatBase$3.llllllIllllll[1]]));
                    "".length();
                    if (((0xD9 ^ 0x88) & ~(0xF0 ^ 0xA1)) < 0) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIlIIllIIIllIIII)).append(StatBase$3.llllllIlllllI[StatBase$3.llllllIllllll[2]]));
                }
                return s;
            }
            
            private static void lIllIIIIlIIllII() {
                (llllllIlllllI = new String[StatBase$3.llllllIllllll[3]])[StatBase$3.llllllIllllll[0]] = lIllIIIIlIIlIll("CvWoDbspC/Q=", "DtDQp");
                StatBase$3.llllllIlllllI[StatBase$3.llllllIllllll[1]] = lIllIIIIlIIlIll("Y8Qs5Kr5OKk=", "zsyov");
                StatBase$3.llllllIlllllI[StatBase$3.llllllIllllll[2]] = lIllIIIIlIIlIll("TCJZoV80vZ4=", "cGIMS");
            }
            
            private static String lIllIIIIlIIlIll(final String lllllllllllllIlIlIlIIllIIIlIIIIl, final String lllllllllllllIlIlIlIIllIIIlIIIlI) {
                try {
                    final SecretKeySpec lllllllllllllIlIlIlIIllIIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StatBase$3.llllllIllllll[4]), "DES");
                    final Cipher lllllllllllllIlIlIlIIllIIIlIIlIl = Cipher.getInstance("DES");
                    lllllllllllllIlIlIlIIllIIIlIIlIl.init(StatBase$3.llllllIllllll[2], lllllllllllllIlIlIlIIllIIIlIIllI);
                    return new String(lllllllllllllIlIlIlIIllIIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlIlIIllIIIlIIlII) {
                    lllllllllllllIlIlIlIIllIIIlIIlII.printStackTrace();
                    return null;
                }
            }
            
            private static void lIllIIIIlIIllIl() {
                (llllllIllllll = new int[5])[0] = ((0xC ^ 0x6 ^ (0x54 ^ 0x7F)) & (0x44 ^ 0x69 ^ (0x86 ^ 0x8A) ^ -" ".length()));
                StatBase$3.llllllIllllll[1] = " ".length();
                StatBase$3.llllllIllllll[2] = "  ".length();
                StatBase$3.llllllIllllll[3] = "   ".length();
                StatBase$3.llllllIllllll[4] = (0x40 ^ 0x48);
            }
            
            private static int lIllIIIIlIIlllI(final double n, final double n2) {
                return dcmpl(n, n2);
            }
            
            private static boolean lIllIIIIlIIllll(final int lllllllllllllIlIlIlIIllIIIIlllII) {
                return lllllllllllllIlIlIlIIllIIIIlllII > 0;
            }
        };
        StatBase.field_111202_k = new IStatType() {
            @Override
            public String format(final int lllllllllllllIIlllllIIIlllllllIl) {
                return StatBase.decimalFormat.format(lllllllllllllIIlllllIIIlllllllIl * 0.1);
            }
        };
    }
    
    public String format(final int lllllllllllllIIllllIIlIllIllIIlI) {
        return this.type.format(lllllllllllllIIllllIIlIllIllIIlI);
    }
}
