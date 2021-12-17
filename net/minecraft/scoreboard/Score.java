// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import java.util.Comparator;

public class Score
{
    private static final /* synthetic */ String[] lIlIIlIlIlIIll;
    private /* synthetic */ int scorePoints;
    private /* synthetic */ boolean locked;
    private final /* synthetic */ String scorePlayerName;
    private final /* synthetic */ ScoreObjective theScoreObjective;
    private /* synthetic */ boolean field_178818_g;
    private final /* synthetic */ Scoreboard theScoreboard;
    private static final /* synthetic */ int[] lIlIIlIlIllIII;
    
    public int getScorePoints() {
        return this.scorePoints;
    }
    
    private static boolean lllIIllIIlIIlII(final int lllllllllllllIIIllIllIlIIIIlllll, final int lllllllllllllIIIllIllIlIIIIllllI) {
        return lllllllllllllIIIllIllIlIIIIlllll == lllllllllllllIIIllIllIlIIIIllllI;
    }
    
    public String getPlayerName() {
        return this.scorePlayerName;
    }
    
    private static void lllIIllIIlIIIlI() {
        (lIlIIlIlIllIII = new int[5])[0] = " ".length();
        Score.lIlIIlIlIllIII[1] = ((0x76 ^ 0x41 ^ "   ".length()) & (0x41 ^ 0x2B ^ (0xE0 ^ 0xBE) ^ -" ".length()));
        Score.lIlIIlIlIllIII[2] = "  ".length();
        Score.lIlIIlIlIllIII[3] = "   ".length();
        Score.lIlIIlIlIllIII[4] = (0x8C ^ 0xAF ^ (0x8 ^ 0x23));
    }
    
    public void increseScore(final int lllllllllllllIIIllIllIlIlIIIIIll) {
        if (lllIIllIIlIIIll(this.theScoreObjective.getCriteria().isReadOnly() ? 1 : 0)) {
            throw new IllegalStateException(Score.lIlIIlIlIlIIll[Score.lIlIIlIlIllIII[1]]);
        }
        this.setScorePoints(this.getScorePoints() + lllllllllllllIIIllIllIlIlIIIIIll);
    }
    
    public void func_96651_a(final List<EntityPlayer> lllllllllllllIIIllIllIlIIlIlIllI) {
        this.setScorePoints(this.theScoreObjective.getCriteria().func_96635_a(lllllllllllllIIIllIllIlIIlIlIllI));
    }
    
    public Scoreboard getScoreScoreboard() {
        return this.theScoreboard;
    }
    
    public boolean isLocked() {
        return this.locked;
    }
    
    private static String lllIIllIIIllllI(String lllllllllllllIIIllIllIlIIIllIlll, final String lllllllllllllIIIllIllIlIIIllIllI) {
        lllllllllllllIIIllIllIlIIIllIlll = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIllIlIIIllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIllIlIIIlllIlI = new StringBuilder();
        final char[] lllllllllllllIIIllIllIlIIIlllIIl = lllllllllllllIIIllIllIlIIIllIllI.toCharArray();
        int lllllllllllllIIIllIllIlIIIlllIII = Score.lIlIIlIlIllIII[1];
        final byte lllllllllllllIIIllIllIlIIIllIIlI = (Object)((String)lllllllllllllIIIllIllIlIIIllIlll).toCharArray();
        final String lllllllllllllIIIllIllIlIIIllIIIl = (String)lllllllllllllIIIllIllIlIIIllIIlI.length;
        boolean lllllllllllllIIIllIllIlIIIllIIII = Score.lIlIIlIlIllIII[1] != 0;
        while (lllIIllIIlIIlIl(lllllllllllllIIIllIllIlIIIllIIII ? 1 : 0, (int)lllllllllllllIIIllIllIlIIIllIIIl)) {
            final char lllllllllllllIIIllIllIlIIIllllIl = lllllllllllllIIIllIllIlIIIllIIlI[lllllllllllllIIIllIllIlIIIllIIII];
            lllllllllllllIIIllIllIlIIIlllIlI.append((char)(lllllllllllllIIIllIllIlIIIllllIl ^ lllllllllllllIIIllIllIlIIIlllIIl[lllllllllllllIIIllIllIlIIIlllIII % lllllllllllllIIIllIllIlIIIlllIIl.length]));
            "".length();
            ++lllllllllllllIIIllIllIlIIIlllIII;
            ++lllllllllllllIIIllIllIlIIIllIIII;
            "".length();
            if (((73 + 51 - 89 + 110 ^ 170 + 49 - 158 + 114) & (0xF ^ 0x35 ^ (0x1E ^ 0x1A) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIllIlIIIlllIlI);
    }
    
    public ScoreObjective getObjective() {
        return this.theScoreObjective;
    }
    
    public void func_96648_a() {
        if (lllIIllIIlIIIll(this.theScoreObjective.getCriteria().isReadOnly() ? 1 : 0)) {
            throw new IllegalStateException(Score.lIlIIlIlIlIIll[Score.lIlIIlIlIllIII[2]]);
        }
        this.increseScore(Score.lIlIIlIlIllIII[0]);
    }
    
    public void setScorePoints(final int lllllllllllllIIIllIllIlIIlllIIII) {
        final int lllllllllllllIIIllIllIlIIllIllll = this.scorePoints;
        this.scorePoints = lllllllllllllIIIllIllIlIIlllIIII;
        if (!lllIIllIIlIIlII(lllllllllllllIIIllIllIlIIllIllll, lllllllllllllIIIllIllIlIIlllIIII) || lllIIllIIlIIIll(this.field_178818_g ? 1 : 0)) {
            this.field_178818_g = (Score.lIlIIlIlIllIII[1] != 0);
            this.getScoreScoreboard().func_96536_a(this);
        }
    }
    
    private static boolean lllIIllIIlIIlIl(final int lllllllllllllIIIllIllIlIIIIllIll, final int lllllllllllllIIIllIllIlIIIIllIlI) {
        return lllllllllllllIIIllIllIlIIIIllIll < lllllllllllllIIIllIllIlIIIIllIlI;
    }
    
    public Score(final Scoreboard lllllllllllllIIIllIllIlIlIIIlIIl, final ScoreObjective lllllllllllllIIIllIllIlIlIIIlIII, final String lllllllllllllIIIllIllIlIlIIIIlll) {
        this.theScoreboard = lllllllllllllIIIllIllIlIlIIIlIIl;
        this.theScoreObjective = lllllllllllllIIIllIllIlIlIIIlIII;
        this.scorePlayerName = lllllllllllllIIIllIllIlIlIIIIlll;
        this.field_178818_g = (Score.lIlIIlIlIllIII[0] != 0);
    }
    
    private static void lllIIllIIIlllll() {
        (lIlIIlIlIlIIll = new String[Score.lIlIIlIlIllIII[3]])[Score.lIlIIlIlIllIII[1]] = lllIIllIIIllIlI("zJr4u/mmW9wvTmHOMUauB38AKh5No2eAVLVitdrio4k=", "UQNix");
        Score.lIlIIlIlIlIIll[Score.lIlIIlIlIllIII[0]] = lllIIllIIIllIll("AChhHzFSrZse5uhfh//G4XuTi///D6rtRwPHV+8Zs7Y=", "UVOLH");
        Score.lIlIIlIlIlIIll[Score.lIlIIlIlIllIII[2]] = lllIIllIIIllllI("MDUcLDcHdB8tPBoyC2IqFjUWbzcdOAtiKxA7ACc=", "sTrBX");
    }
    
    static {
        lllIIllIIlIIIlI();
        lllIIllIIIlllll();
        scoreComparator = new Comparator<Score>() {
            private static final /* synthetic */ int[] lIIIIIIIIllIII;
            
            private static void lIllIIlIllIlIlI() {
                (lIIIIIIIIllIII = new int[2])[0] = " ".length();
                Score$1.lIIIIIIIIllIII[1] = -" ".length();
            }
            
            static {
                lIllIIlIllIlIlI();
            }
            
            private static boolean lIllIIlIllIllII(final int lllllllllllllIlIlIIlIIlIIlIlIlII, final int lllllllllllllIlIlIIlIIlIIlIlIIll) {
                return lllllllllllllIlIlIIlIIlIIlIlIlII < lllllllllllllIlIlIIlIIlIIlIlIIll;
            }
            
            private static boolean lIllIIlIllIlIll(final int lllllllllllllIlIlIIlIIlIIlIlIIII, final int lllllllllllllIlIlIIlIIlIIlIIllll) {
                return lllllllllllllIlIlIIlIIlIIlIlIIII > lllllllllllllIlIlIIlIIlIIlIIllll;
            }
            
            @Override
            public int compare(final Score lllllllllllllIlIlIIlIIlIIlIllllI, final Score lllllllllllllIlIlIIlIIlIIlIlllIl) {
                int compareToIgnoreCase;
                if (lIllIIlIllIlIll(lllllllllllllIlIlIIlIIlIIlIllllI.getScorePoints(), lllllllllllllIlIlIIlIIlIIlIlllIl.getScorePoints())) {
                    compareToIgnoreCase = Score$1.lIIIIIIIIllIII[0];
                    "".length();
                    if (" ".length() <= ((7 + 8 + 102 + 86 ^ 68 + 195 - 125 + 59) & (46 + 123 - 118 + 89 ^ 45 + 58 - 35 + 62 ^ -" ".length()))) {
                        return (0x5A ^ 0x65 ^ (0x88 ^ 0xBE)) & (0x11 ^ 0xE ^ (0x4 ^ 0x12) ^ -" ".length());
                    }
                }
                else if (lIllIIlIllIllII(lllllllllllllIlIlIIlIIlIIlIllllI.getScorePoints(), lllllllllllllIlIlIIlIIlIIlIlllIl.getScorePoints())) {
                    compareToIgnoreCase = Score$1.lIIIIIIIIllIII[1];
                    "".length();
                    if (-(0x6F ^ 0x6B) >= 0) {
                        return (0xC0 ^ 0x90) & ~(0x11 ^ 0x41);
                    }
                }
                else {
                    compareToIgnoreCase = lllllllllllllIlIlIIlIIlIIlIlllIl.getPlayerName().compareToIgnoreCase(lllllllllllllIlIlIIlIIlIIlIllllI.getPlayerName());
                }
                return compareToIgnoreCase;
            }
        };
    }
    
    public void setLocked(final boolean lllllllllllllIIIllIllIlIIlIllIlI) {
        this.locked = lllllllllllllIIIllIllIlIIlIllIlI;
    }
    
    private static String lllIIllIIIllIlI(final String lllllllllllllIIIllIllIlIIIlIIlll, final String lllllllllllllIIIllIllIlIIIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIlIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIlIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIllIlIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIllIlIIIlIlIIl.init(Score.lIlIIlIlIllIII[2], lllllllllllllIIIllIllIlIIIlIlIlI);
            return new String(lllllllllllllIIIllIllIlIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIlIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIlIIIlIlIII) {
            lllllllllllllIIIllIllIlIIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIllIIlIIIll(final int lllllllllllllIIIllIllIlIIIIllIII) {
        return lllllllllllllIIIllIllIlIIIIllIII != 0;
    }
    
    public void decreaseScore(final int lllllllllllllIIIllIllIlIIlllllIl) {
        if (lllIIllIIlIIIll(this.theScoreObjective.getCriteria().isReadOnly() ? 1 : 0)) {
            throw new IllegalStateException(Score.lIlIIlIlIlIIll[Score.lIlIIlIlIllIII[0]]);
        }
        this.setScorePoints(this.getScorePoints() - lllllllllllllIIIllIllIlIIlllllIl);
    }
    
    private static String lllIIllIIIllIll(final String lllllllllllllIIIllIllIlIIlIIlIlI, final String lllllllllllllIIIllIllIlIIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIlIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), Score.lIlIIlIlIllIII[4]), "DES");
            final Cipher lllllllllllllIIIllIllIlIIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIllIllIlIIlIIlllI.init(Score.lIlIIlIlIllIII[2], lllllllllllllIIIllIllIlIIlIIllll);
            return new String(lllllllllllllIIIllIllIlIIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIlIIlIIllIl) {
            lllllllllllllIIIllIllIlIIlIIllIl.printStackTrace();
            return null;
        }
    }
}
