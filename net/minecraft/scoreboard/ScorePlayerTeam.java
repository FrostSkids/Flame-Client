// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumChatFormatting;
import java.util.Set;

public class ScorePlayerTeam extends Team
{
    private final /* synthetic */ String registeredName;
    private /* synthetic */ EnumVisible nameTagVisibility;
    private static final /* synthetic */ int[] lIIIlllllIIIlI;
    private final /* synthetic */ Set<String> membershipSet;
    private /* synthetic */ EnumChatFormatting chatFormat;
    private /* synthetic */ String colorSuffix;
    private static final /* synthetic */ String[] lIIIllllIllIlI;
    private final /* synthetic */ Scoreboard theScoreboard;
    private /* synthetic */ EnumVisible deathMessageVisibility;
    private /* synthetic */ boolean allowFriendlyFire;
    private /* synthetic */ boolean canSeeFriendlyInvisibles;
    private /* synthetic */ String namePrefixSPT;
    private /* synthetic */ String teamNameSPT;
    
    private static boolean llIIlIIIIIlllll(final int lllllllllllllIIllllIIlIIIIlIllIl) {
        return lllllllllllllIIllllIIlIIIIlIllIl > 0;
    }
    
    private static boolean llIIlIIIIIlllIl(final Object lllllllllllllIIllllIIlIIIIllIIIl) {
        return lllllllllllllIIllllIIlIIIIllIIIl == null;
    }
    
    public void setSeeFriendlyInvisiblesEnabled(final boolean lllllllllllllIIllllIIlIIlIIlIIII) {
        this.canSeeFriendlyInvisibles = lllllllllllllIIllllIIlIIlIIlIIII;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    public static String formatPlayerName(final Team lllllllllllllIIllllIIlIIlIlIIIll, final String lllllllllllllIIllllIIlIIlIlIIlII) {
        String formatString;
        if (llIIlIIIIIlllIl(lllllllllllllIIllllIIlIIlIlIIIll)) {
            formatString = lllllllllllllIIllllIIlIIlIlIIlII;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            formatString = lllllllllllllIIllllIIlIIlIlIIIll.formatString(lllllllllllllIIllllIIlIIlIlIIlII);
        }
        return formatString;
    }
    
    public String getColorSuffix() {
        return this.colorSuffix;
    }
    
    private static boolean llIIlIIIIIllllI(final int lllllllllllllIIllllIIlIIIIlIllll) {
        return lllllllllllllIIllllIIlIIIIlIllll != 0;
    }
    
    public void func_98298_a(final int lllllllllllllIIllllIIlIIIlllIIlI) {
        int allowFriendlyFire;
        if (llIIlIIIIIlllll(lllllllllllllIIllllIIlIIIlllIIlI & ScorePlayerTeam.lIIIlllllIIIlI[1])) {
            allowFriendlyFire = ScorePlayerTeam.lIIIlllllIIIlI[1];
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            allowFriendlyFire = ScorePlayerTeam.lIIIlllllIIIlI[0];
        }
        this.setAllowFriendlyFire((boolean)(allowFriendlyFire != 0));
        int seeFriendlyInvisiblesEnabled;
        if (llIIlIIIIIlllll(lllllllllllllIIllllIIlIIIlllIIlI & ScorePlayerTeam.lIIIlllllIIIlI[2])) {
            seeFriendlyInvisiblesEnabled = ScorePlayerTeam.lIIIlllllIIIlI[1];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            seeFriendlyInvisiblesEnabled = ScorePlayerTeam.lIIIlllllIIIlI[0];
        }
        this.setSeeFriendlyInvisiblesEnabled((boolean)(seeFriendlyInvisiblesEnabled != 0));
    }
    
    public String getColorPrefix() {
        return this.namePrefixSPT;
    }
    
    private static String llIIIlllllllIII(final String lllllllllllllIIllllIIlIIIlIlIlII, final String lllllllllllllIIllllIIlIIIlIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlIIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIlIIIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIlIIIlIlIllI.init(ScorePlayerTeam.lIIIlllllIIIlI[2], lllllllllllllIIllllIIlIIIlIlIlll);
            return new String(lllllllllllllIIllllIIlIIIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlIIIlIlIlIl) {
            lllllllllllllIIllllIIlIIIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIlllllllIlI(String lllllllllllllIIllllIIlIIIIllllll, final String lllllllllllllIIllllIIlIIIlIIIIll) {
        lllllllllllllIIllllIIlIIIIllllll = new String(Base64.getDecoder().decode(lllllllllllllIIllllIIlIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIlIIIlIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllllIIlIIIlIIIIIl = lllllllllllllIIllllIIlIIIlIIIIll.toCharArray();
        int lllllllllllllIIllllIIlIIIlIIIIII = ScorePlayerTeam.lIIIlllllIIIlI[0];
        final int lllllllllllllIIllllIIlIIIIlllIlI = (Object)lllllllllllllIIllllIIlIIIIllllll.toCharArray();
        final byte lllllllllllllIIllllIIlIIIIlllIIl = (byte)lllllllllllllIIllllIIlIIIIlllIlI.length;
        byte lllllllllllllIIllllIIlIIIIlllIII = (byte)ScorePlayerTeam.lIIIlllllIIIlI[0];
        while (llIIlIIIIlIIIII(lllllllllllllIIllllIIlIIIIlllIII, lllllllllllllIIllllIIlIIIIlllIIl)) {
            final char lllllllllllllIIllllIIlIIIlIIIlIl = lllllllllllllIIllllIIlIIIIlllIlI[lllllllllllllIIllllIIlIIIIlllIII];
            lllllllllllllIIllllIIlIIIlIIIIlI.append((char)(lllllllllllllIIllllIIlIIIlIIIlIl ^ lllllllllllllIIllllIIlIIIlIIIIIl[lllllllllllllIIllllIIlIIIlIIIIII % lllllllllllllIIllllIIlIIIlIIIIIl.length]));
            "".length();
            ++lllllllllllllIIllllIIlIIIlIIIIII;
            ++lllllllllllllIIllllIIlIIIIlllIII;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIlIIIlIIIIlI);
    }
    
    private static String llIIIlllllllIIl(final String lllllllllllllIIllllIIlIIIlIlllll, final String lllllllllllllIIllllIIlIIIllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), ScorePlayerTeam.lIIIlllllIIIlI[5]), "DES");
            final Cipher lllllllllllllIIllllIIlIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllIIllllIIlIIIllIIIll.init(ScorePlayerTeam.lIIIlllllIIIlI[2], lllllllllllllIIllllIIlIIIllIIlII);
            return new String(lllllllllllllIIllllIIlIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlIIIllIIIlI) {
            lllllllllllllIIllllIIlIIIllIIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIIIIIlllII();
        llIIIlllllllIll();
    }
    
    public void setNameSuffix(final String lllllllllllllIIllllIIlIIlIlIlllI) {
        this.colorSuffix = lllllllllllllIIllllIIlIIlIlIlllI;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    private static boolean llIIlIIIIlIIIII(final int lllllllllllllIIllllIIlIIIIllIlII, final int lllllllllllllIIllllIIlIIIIllIIll) {
        return lllllllllllllIIllllIIlIIIIllIlII < lllllllllllllIIllllIIlIIIIllIIll;
    }
    
    public String getTeamName() {
        return this.teamNameSPT;
    }
    
    public void setNamePrefix(final String lllllllllllllIIllllIIlIIlIlllIIl) {
        if (llIIlIIIIIlllIl(lllllllllllllIIllllIIlIIlIlllIIl)) {
            throw new IllegalArgumentException(ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[3]]);
        }
        this.namePrefixSPT = lllllllllllllIIllllIIlIIlIlllIIl;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    @Override
    public String formatString(final String lllllllllllllIIllllIIlIIlIlIlIII) {
        return String.valueOf(new StringBuilder(String.valueOf(this.getColorPrefix())).append(lllllllllllllIIllllIIlIIlIlIlIII).append(this.getColorSuffix()));
    }
    
    public ScorePlayerTeam(final Scoreboard lllllllllllllIIllllIIlIIllIlIIll, final String lllllllllllllIIllllIIlIIllIlIIlI) {
        this.membershipSet = (Set<String>)Sets.newHashSet();
        this.namePrefixSPT = ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[0]];
        this.colorSuffix = ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[1]];
        this.allowFriendlyFire = (ScorePlayerTeam.lIIIlllllIIIlI[1] != 0);
        this.canSeeFriendlyInvisibles = (ScorePlayerTeam.lIIIlllllIIIlI[1] != 0);
        this.nameTagVisibility = EnumVisible.ALWAYS;
        this.deathMessageVisibility = EnumVisible.ALWAYS;
        this.chatFormat = EnumChatFormatting.RESET;
        this.theScoreboard = lllllllllllllIIllllIIlIIllIlIIll;
        this.registeredName = lllllllllllllIIllllIIlIIllIlIIlI;
        this.teamNameSPT = lllllllllllllIIllllIIlIIllIlIIlI;
    }
    
    public void setTeamName(final String lllllllllllllIIllllIIlIIllIIIIll) {
        if (llIIlIIIIIlllIl(lllllllllllllIIllllIIlIIllIIIIll)) {
            throw new IllegalArgumentException(ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[2]]);
        }
        this.teamNameSPT = lllllllllllllIIllllIIlIIllIIIIll;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    public void setAllowFriendlyFire(final boolean lllllllllllllIIllllIIlIIlIIllIll) {
        this.allowFriendlyFire = lllllllllllllIIllllIIlIIlIIllIll;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    @Override
    public Collection<String> getMembershipCollection() {
        return this.membershipSet;
    }
    
    @Override
    public boolean getSeeFriendlyInvisiblesEnabled() {
        return this.canSeeFriendlyInvisibles;
    }
    
    @Override
    public boolean getAllowFriendlyFire() {
        return this.allowFriendlyFire;
    }
    
    @Override
    public String getRegisteredName() {
        return this.registeredName;
    }
    
    public void setNameTagVisibility(final EnumVisible lllllllllllllIIllllIIlIIlIIIIlII) {
        this.nameTagVisibility = lllllllllllllIIllllIIlIIlIIIIlII;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    public int func_98299_i() {
        int lllllllllllllIIllllIIlIIIllllIlI = ScorePlayerTeam.lIIIlllllIIIlI[0];
        if (llIIlIIIIIllllI(this.getAllowFriendlyFire() ? 1 : 0)) {
            lllllllllllllIIllllIIlIIIllllIlI |= ScorePlayerTeam.lIIIlllllIIIlI[1];
        }
        if (llIIlIIIIIllllI(this.getSeeFriendlyInvisiblesEnabled() ? 1 : 0)) {
            lllllllllllllIIllllIIlIIIllllIlI |= ScorePlayerTeam.lIIIlllllIIIlI[2];
        }
        return lllllllllllllIIllllIIlIIIllllIlI;
    }
    
    @Override
    public EnumVisible getNameTagVisibility() {
        return this.nameTagVisibility;
    }
    
    private static void llIIlIIIIIlllII() {
        (lIIIlllllIIIlI = new int[6])[0] = ((0x98 ^ 0xA8 ^ (0x96 ^ 0x9B)) & (0x9A ^ 0xBA ^ (0x1A ^ 0x7) ^ -" ".length()));
        ScorePlayerTeam.lIIIlllllIIIlI[1] = " ".length();
        ScorePlayerTeam.lIIIlllllIIIlI[2] = "  ".length();
        ScorePlayerTeam.lIIIlllllIIIlI[3] = "   ".length();
        ScorePlayerTeam.lIIIlllllIIIlI[4] = (0x37 ^ 0x5E ^ (0x58 ^ 0x35));
        ScorePlayerTeam.lIIIlllllIIIlI[5] = (0x75 ^ 0x7D);
    }
    
    public void setChatFormat(final EnumChatFormatting lllllllllllllIIllllIIlIIIllIllII) {
        this.chatFormat = lllllllllllllIIllllIIlIIIllIllII;
    }
    
    public void setDeathMessageVisibility(final EnumVisible lllllllllllllIIllllIIlIIlIIIIIII) {
        this.deathMessageVisibility = lllllllllllllIIllllIIlIIlIIIIIII;
        this.theScoreboard.sendTeamUpdate(this);
    }
    
    private static void llIIIlllllllIll() {
        (lIIIllllIllIlI = new String[ScorePlayerTeam.lIIIlllllIIIlI[4]])[ScorePlayerTeam.lIIIlllllIIIlI[0]] = llIIIlllllllIII("GXx83KiHNRM=", "OeKXn");
        ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[1]] = llIIIlllllllIIl("+d7W14TE4d4=", "nUTCD");
        ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[2]] = llIIIlllllllIlI("JAclFmgJByYdJx5GKhZoBBMkHw==", "jfHsH");
        ScorePlayerTeam.lIIIllllIllIlI[ScorePlayerTeam.lIIIlllllIIIlI[3]] = llIIIlllllllIII("tZBTw91JOnccbNK1GOAA+L+rVeIR5usZ", "ecklw");
    }
    
    public EnumChatFormatting getChatFormat() {
        return this.chatFormat;
    }
    
    @Override
    public EnumVisible getDeathMessageVisibility() {
        return this.deathMessageVisibility;
    }
}
