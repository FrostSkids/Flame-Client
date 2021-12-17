// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumChatFormatting;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Scoreboard
{
    private final /* synthetic */ Map<String, ScorePlayerTeam> teams;
    private final /* synthetic */ ScoreObjective[] objectiveDisplaySlots;
    private static /* synthetic */ String[] field_178823_g;
    private static final /* synthetic */ int[] lIIIIlIlIlIlII;
    private final /* synthetic */ Map<String, ScoreObjective> scoreObjectives;
    private static final /* synthetic */ String[] lIIIIlIlIIlllI;
    private final /* synthetic */ Map<String, Map<ScoreObjective, Score>> entitiesScoreObjectives;
    private final /* synthetic */ Map<IScoreObjectiveCriteria, List<ScoreObjective>> scoreObjectiveCriterias;
    private final /* synthetic */ Map<String, ScorePlayerTeam> teamMemberships;
    
    public ScorePlayerTeam getTeam(final String lllllllllllllIlIIlIlIlllIIllllIl) {
        return this.teams.get(lllllllllllllIlIIlIlIlllIIllllIl);
    }
    
    public boolean addPlayerToTeam(final String lllllllllllllIlIIlIlIlllIIlIIIIl, final String lllllllllllllIlIIlIlIlllIIIlllII) {
        if (lIlllIIlllllllI(lllllllllllllIlIIlIlIlllIIlIIIIl.length(), Scoreboard.lIIIIlIlIlIlII[6])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[13]]).append(lllllllllllllIlIIlIlIlllIIlIIIIl).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[14]])));
        }
        if (lIlllIlIIIIIIIl(this.teams.containsKey(lllllllllllllIlIIlIlIlllIIIlllII) ? 1 : 0)) {
            return Scoreboard.lIIIIlIlIlIlII[2] != 0;
        }
        final ScorePlayerTeam lllllllllllllIlIIlIlIlllIIIlllll = this.getTeam(lllllllllllllIlIIlIlIlllIIIlllII);
        if (lIlllIIllllllll(this.getPlayersTeam(lllllllllllllIlIIlIlIlllIIlIIIIl))) {
            this.removePlayerFromTeams(lllllllllllllIlIIlIlIlllIIlIIIIl);
            "".length();
        }
        this.teamMemberships.put(lllllllllllllIlIIlIlIlllIIlIIIIl, lllllllllllllIlIIlIlIlllIIIlllll);
        "".length();
        lllllllllllllIlIIlIlIlllIIIlllll.getMembershipCollection().add(lllllllllllllIlIIlIlIlllIIlIIIIl);
        "".length();
        return Scoreboard.lIIIIlIlIlIlII[3] != 0;
    }
    
    public Collection<String> getObjectiveNames() {
        return this.entitiesScoreObjectives.keySet();
    }
    
    public Scoreboard() {
        this.scoreObjectives = (Map<String, ScoreObjective>)Maps.newHashMap();
        this.scoreObjectiveCriterias = (Map<IScoreObjectiveCriteria, List<ScoreObjective>>)Maps.newHashMap();
        this.entitiesScoreObjectives = (Map<String, Map<ScoreObjective, Score>>)Maps.newHashMap();
        this.objectiveDisplaySlots = new ScoreObjective[Scoreboard.lIIIIlIlIlIlII[0]];
        this.teams = (Map<String, ScorePlayerTeam>)Maps.newHashMap();
        this.teamMemberships = (Map<String, ScorePlayerTeam>)Maps.newHashMap();
    }
    
    public ScoreObjective addScoreObjective(final String lllllllllllllIlIIlIlIlllllIIlIlI, final IScoreObjectiveCriteria lllllllllllllIlIIlIlIlllllIIlIIl) {
        if (lIlllIIlllllllI(lllllllllllllIlIIlIlIlllllIIlIlI.length(), Scoreboard.lIIIIlIlIlIlII[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[2]]).append(lllllllllllllIlIIlIlIlllllIIlIlI).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[3]])));
        }
        ScoreObjective lllllllllllllIlIIlIlIlllllIIllIl = this.getObjective(lllllllllllllIlIIlIlIlllllIIlIlI);
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllllIIllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[4]]).append(lllllllllllllIlIIlIlIlllllIIlIlI).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[5]])));
        }
        lllllllllllllIlIIlIlIlllllIIllIl = new ScoreObjective(this, lllllllllllllIlIIlIlIlllllIIlIlI, lllllllllllllIlIIlIlIlllllIIlIIl);
        List<ScoreObjective> lllllllllllllIlIIlIlIlllllIIllII = this.scoreObjectiveCriterias.get(lllllllllllllIlIIlIlIlllllIIlIIl);
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIlllllIIllII)) {
            lllllllllllllIlIIlIlIlllllIIllII = (List<ScoreObjective>)Lists.newArrayList();
            this.scoreObjectiveCriterias.put(lllllllllllllIlIIlIlIlllllIIlIIl, lllllllllllllIlIIlIlIlllllIIllII);
            "".length();
        }
        lllllllllllllIlIIlIlIlllllIIllII.add(lllllllllllllIlIIlIlIlllllIIllIl);
        "".length();
        this.scoreObjectives.put(lllllllllllllIlIIlIlIlllllIIlIlI, lllllllllllllIlIIlIlIlllllIIllIl);
        "".length();
        this.onScoreObjectiveAdded(lllllllllllllIlIIlIlIlllllIIllIl);
        return lllllllllllllIlIIlIlIlllllIIllIl;
    }
    
    public void setObjectiveInDisplaySlot(final int lllllllllllllIlIIlIlIlllIlIIlIII, final ScoreObjective lllllllllllllIlIIlIlIlllIlIIIlll) {
        this.objectiveDisplaySlots[lllllllllllllIlIIlIlIlllIlIIlIII] = lllllllllllllIlIIlIlIlllIlIIIlll;
    }
    
    public Collection<Score> getScores() {
        final Collection<Map<ScoreObjective, Score>> lllllllllllllIlIIlIlIlllIllIllll = this.entitiesScoreObjectives.values();
        final List<Score> lllllllllllllIlIIlIlIlllIllIlllI = (List<Score>)Lists.newArrayList();
        final byte lllllllllllllIlIIlIlIlllIllIlIII = (byte)lllllllllllllIlIIlIlIlllIllIllll.iterator();
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIlllIlIIIIIIIl(((Iterator)lllllllllllllIlIIlIlIlllIllIlIII).hasNext() ? 1 : 0)) {
            final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIllIllIl = ((Iterator<Map<ScoreObjective, Score>>)lllllllllllllIlIIlIlIlllIllIlIII).next();
            lllllllllllllIlIIlIlIlllIllIlllI.addAll(lllllllllllllIlIIlIlIlllIllIllIl.values());
            "".length();
        }
        return lllllllllllllIlIIlIlIlllIllIlllI;
    }
    
    public void removePlayerFromTeam(final String lllllllllllllIlIIlIlIlllIIIIlIlI, final ScorePlayerTeam lllllllllllllIlIIlIlIlllIIIIllII) {
        if (lIlllIlIIIIIlIl(this.getPlayersTeam(lllllllllllllIlIIlIlIlllIIIIlIlI), lllllllllllllIlIIlIlIlllIIIIllII)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[15]]).append(lllllllllllllIlIIlIlIlllIIIIllII.getRegisteredName()).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[16]])));
        }
        this.teamMemberships.remove(lllllllllllllIlIIlIlIlllIIIIlIlI);
        "".length();
        lllllllllllllIlIIlIlIlllIIIIllII.getMembershipCollection().remove(lllllllllllllIlIIlIlIlllIIIIlIlI);
        "".length();
    }
    
    private static void lIlllIIlllllIII() {
        (lIIIIlIlIIlllI = new String[Scoreboard.lIIIIlIlIlIlII[25]])[Scoreboard.lIIIIlIlIlIlII[2]] = lIlllIIlllIIIlI("Awk1cx01CzUwBj4XNXMcNgw1c1U=", "WaPSr");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[3]] = lIlllIIlllIIIlI("Zk4+IFI1AThzHi4AMHI=", "AnWSr");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[4]] = lIlllIIlllIIIlI("BwVHAissDgQZIDAORxogMgNHGSEjSwkMJCNLQA==", "FkgmI");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[5]] = lIlllIIlllIIIll("U12rMwENMEBLTaLscnw+mD8Ke5EBjHpC", "juEld");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[7]] = lIlllIIlllIIIlI("FToTZhotMw8jGGE8FysPYXU=", "ARvFj");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[8]] = lIlllIIlllIIlII("kWAXxka3ccRDnBLHzHCQhA==", "NMoZN");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[9]] = lIlllIIlllIIlII("K31x+ws1hT5Rd5s3jMsMHQ==", "HKEUE");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[10]] = lIlllIIlllIIlII("3exZ/nFow99+eVmm2knhmw==", "nzyFN");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[11]] = lIlllIIlllIIIll("ZMQGSMMkNzpY+n5UB/CsOY3hETvMBe3U", "AfKIX");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[12]] = lIlllIIlllIIlII("clAFYOwiUmilJD8IJtL6M1OA1pvBAsJI", "pJwqZ");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[13]] = lIlllIIlllIIIll("9w737F4FEYV6DAlIC3qwL+u3eN1xKVSz", "TEnuM");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[14]] = lIlllIIlllIIlII("R4JmVVNVzm+qnOqvBnfscg==", "flgwN");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[15]] = lIlllIIlllIIIll("fgvimpLvmrbmhNcBeikdXP9vkZJx303zlLEOApnAq+RkIsEa28Ou1VccIadTYacXHuFzXlBcIIxlAzGNenPK1MVwissKSMs8X7enlAoN2Ms=", "PSidK");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[16]] = lIlllIIlllIIIll("fEaahDSgxBs=", "ZcrEL");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[17]] = lIlllIIlllIIlII("KhgkuYXxGyI=", "jTHio");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[18]] = lIlllIIlllIIIlI("HhAuEgUMCw==", "myJwg");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[1]] = lIlllIIlllIIlII("0+EXYVXItfBxjDkneoZN4A==", "nsEIv");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[20]] = lIlllIIlllIIlII("OKEQhRgEbhOd5DZcA0KIwg==", "DRypK");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[19]] = lIlllIIlllIIlII("QUcIH7ZIwpQ=", "DlMPU");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[0]] = lIlllIIlllIIlII("fLww2mnxEz8=", "XwaOj");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[21]] = lIlllIIlllIIlII("5JU3a4kzpyronHI4fVJXdw==", "Tahqj");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[22]] = lIlllIIlllIIIlI("PBMPDiAuCEUfJy4XRQ==", "OzkkB");
        Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[23]] = lIlllIIlllIIlII("uGzXpUHpvq4N9ZRMC7FvSA==", "CGzjG");
    }
    
    private static boolean lIlllIlIIIIIllI(final int lllllllllllllIlIIlIlIllIlIIIIlll, final int lllllllllllllIlIIlIlIllIlIIIIllI) {
        return lllllllllllllIlIIlIlIllIlIIIIlll <= lllllllllllllIlIIlIlIllIlIIIIllI;
    }
    
    private static boolean lIlllIlIIIIIIIl(final int lllllllllllllIlIIlIlIllIIlllIIlI) {
        return lllllllllllllIlIIlIlIllIIlllIIlI == 0;
    }
    
    public Collection<ScoreObjective> getScoreObjectives() {
        return this.scoreObjectives.values();
    }
    
    public ScoreObjective getObjectiveInDisplaySlot(final int lllllllllllllIlIIlIlIlllIlIIIIIl) {
        return this.objectiveDisplaySlots[lllllllllllllIlIIlIlIlllIlIIIIIl];
    }
    
    public void onScoreObjectiveAdded(final ScoreObjective lllllllllllllIlIIlIlIllIlllllIll) {
    }
    
    public Collection<Score> getSortedScores(final ScoreObjective lllllllllllllIlIIlIlIllllIIllIII) {
        final List<Score> lllllllllllllIlIIlIlIllllIIlIlll = (List<Score>)Lists.newArrayList();
        final Exception lllllllllllllIlIIlIlIllllIIlIIII = (Exception)this.entitiesScoreObjectives.values().iterator();
        "".length();
        if (((0x5F ^ 0x64 ^ (0x4A ^ 0x42)) & (0x52 ^ 0x24 ^ (0x78 ^ 0x3D) ^ -" ".length())) == "   ".length()) {
            return null;
        }
        while (!lIlllIlIIIIIIIl(((Iterator)lllllllllllllIlIIlIlIllllIIlIIII).hasNext() ? 1 : 0)) {
            final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIllllIIlIllI = ((Iterator<Map<ScoreObjective, Score>>)lllllllllllllIlIIlIlIllllIIlIIII).next();
            final Score lllllllllllllIlIIlIlIllllIIlIlIl = lllllllllllllIlIIlIlIllllIIlIllI.get(lllllllllllllIlIIlIlIllllIIllIII);
            if (lIlllIIllllllll(lllllllllllllIlIIlIlIllllIIlIlIl)) {
                lllllllllllllIlIIlIlIllllIIlIlll.add(lllllllllllllIlIIlIlIllllIIlIlIl);
                "".length();
            }
        }
        Collections.sort(lllllllllllllIlIIlIlIllllIIlIlll, Score.scoreComparator);
        return lllllllllllllIlIIlIlIllllIIlIlll;
    }
    
    public void func_96533_c(final ScoreObjective lllllllllllllIlIIlIlIllIllllIlll) {
    }
    
    public void removeTeam(final ScorePlayerTeam lllllllllllllIlIIlIlIlllIIlIlIIl) {
        this.teams.remove(lllllllllllllIlIIlIlIlllIIlIlIIl.getRegisteredName());
        "".length();
        final short lllllllllllllIlIIlIlIlllIIlIIlll = (short)lllllllllllllIlIIlIlIlllIIlIlIIl.getMembershipCollection().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIlIIIIIIIl(((Iterator)lllllllllllllIlIIlIlIlllIIlIIlll).hasNext() ? 1 : 0)) {
            final String lllllllllllllIlIIlIlIlllIIlIlIll = ((Iterator<String>)lllllllllllllIlIIlIlIlllIIlIIlll).next();
            this.teamMemberships.remove(lllllllllllllIlIIlIlIlllIIlIlIll);
            "".length();
        }
        this.func_96513_c(lllllllllllllIlIIlIlIlllIIlIlIIl);
    }
    
    private static boolean lIlllIIllllllll(final Object lllllllllllllIlIIlIlIllIIlllllII) {
        return lllllllllllllIlIIlIlIllIIlllllII != null;
    }
    
    public static String getObjectiveDisplaySlot(final int lllllllllllllIlIIlIlIllIllIlllII) {
        switch (lllllllllllllIlIIlIlIllIllIlllII) {
            case 0: {
                return Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[17]];
            }
            case 1: {
                return Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[18]];
            }
            case 2: {
                return Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[1]];
            }
            default: {
                if (lIlllIlIIIIIlII(lllllllllllllIlIIlIlIllIllIlllII, Scoreboard.lIIIIlIlIlIlII[5]) && lIlllIlIIIIIllI(lllllllllllllIlIIlIlIllIllIlllII, Scoreboard.lIIIIlIlIlIlII[19])) {
                    final EnumChatFormatting lllllllllllllIlIIlIlIllIllIllIll = EnumChatFormatting.func_175744_a(lllllllllllllIlIIlIlIllIllIlllII - Scoreboard.lIIIIlIlIlIlII[5]);
                    if (lIlllIIllllllll(lllllllllllllIlIIlIlIllIllIllIll) && lIlllIlIIIIIlIl(lllllllllllllIlIIlIlIllIllIllIll, EnumChatFormatting.RESET)) {
                        return String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[20]]).append(lllllllllllllIlIIlIlIllIllIllIll.getFriendlyName()));
                    }
                }
                return null;
            }
        }
    }
    
    public ScorePlayerTeam getPlayersTeam(final String lllllllllllllIlIIlIlIllIllllllIl) {
        return this.teamMemberships.get(lllllllllllllIlIIlIlIllIllllllIl);
    }
    
    public ScoreObjective getObjective(final String lllllllllllllIlIIlIlIlllllIllIII) {
        return this.scoreObjectives.get(lllllllllllllIlIIlIlIlllllIllIII);
    }
    
    public ScorePlayerTeam createTeam(final String lllllllllllllIlIIlIlIlllIIllIllI) {
        if (lIlllIIlllllllI(lllllllllllllIlIIlIlIlllIIllIllI.length(), Scoreboard.lIIIIlIlIlIlII[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[9]]).append(lllllllllllllIlIIlIlIlllIIllIllI).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[10]])));
        }
        ScorePlayerTeam lllllllllllllIlIIlIlIlllIIllIlIl = this.getTeam(lllllllllllllIlIIlIlIlllIIllIllI);
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIIllIlIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[11]]).append(lllllllllllllIlIIlIlIlllIIllIllI).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[12]])));
        }
        lllllllllllllIlIIlIlIlllIIllIlIl = new ScorePlayerTeam(this, lllllllllllllIlIIlIlIlllIIllIllI);
        this.teams.put(lllllllllllllIlIIlIlIlllIIllIllI, lllllllllllllIlIIlIlIlllIIllIlIl);
        "".length();
        this.broadcastTeamCreated(lllllllllllllIlIIlIlIlllIIllIlIl);
        return lllllllllllllIlIIlIlIlllIIllIlIl;
    }
    
    private static void lIlllIIllllllIl() {
        (lIIIIlIlIlIlII = new int[26])[0] = (0x98 ^ 0x8B);
        Scoreboard.lIIIIlIlIlIlII[1] = (0x5F ^ 0x6B ^ (0xA1 ^ 0x85));
        Scoreboard.lIIIIlIlIlIlII[2] = ((55 + 24 + 22 + 32 ^ 62 + 7 - 48 + 177) & (0x41 ^ 0x15 ^ (0x23 ^ 0x34) ^ -" ".length()));
        Scoreboard.lIIIIlIlIlIlII[3] = " ".length();
        Scoreboard.lIIIIlIlIlIlII[4] = "  ".length();
        Scoreboard.lIIIIlIlIlIlII[5] = "   ".length();
        Scoreboard.lIIIIlIlIlIlII[6] = (0x64 ^ 0x46 ^ (0x42 ^ 0x48));
        Scoreboard.lIIIIlIlIlIlII[7] = (0x5A ^ 0x79 ^ (0x3F ^ 0x18));
        Scoreboard.lIIIIlIlIlIlII[8] = (0x3E ^ 0x3B);
        Scoreboard.lIIIIlIlIlIlII[9] = (0x61 ^ 0x67);
        Scoreboard.lIIIIlIlIlIlII[10] = (0xB5 ^ 0xB2);
        Scoreboard.lIIIIlIlIlIlII[11] = (0x8F ^ 0x97 ^ (0x99 ^ 0x89));
        Scoreboard.lIIIIlIlIlIlII[12] = (0x60 ^ 0x73 ^ (0xAE ^ 0xB4));
        Scoreboard.lIIIIlIlIlIlII[13] = (123 + 111 - 213 + 108 ^ 8 + 129 - 40 + 42);
        Scoreboard.lIIIIlIlIlIlII[14] = (0x6D ^ 0x25 ^ (0xD6 ^ 0x95));
        Scoreboard.lIIIIlIlIlIlII[15] = (36 + 23 + 49 + 81 ^ 10 + 125 + 18 + 24);
        Scoreboard.lIIIIlIlIlIlII[16] = (0x4C ^ 0x41);
        Scoreboard.lIIIIlIlIlIlII[17] = (0x7D ^ 0x59 ^ (0x3 ^ 0x29));
        Scoreboard.lIIIIlIlIlIlII[18] = (0x13 ^ 0x75 ^ (0x4C ^ 0x25));
        Scoreboard.lIIIIlIlIlIlII[19] = (100 + 110 - 167 + 86 ^ 44 + 47 - 44 + 100);
        Scoreboard.lIIIIlIlIlIlII[20] = (0x43 ^ 0x52);
        Scoreboard.lIIIIlIlIlIlII[21] = (0xD3 ^ 0xC7);
        Scoreboard.lIIIIlIlIlIlII[22] = (0x82 ^ 0x97);
        Scoreboard.lIIIIlIlIlIlII[23] = (0x7A ^ 0x6C);
        Scoreboard.lIIIIlIlIlIlII[24] = -" ".length();
        Scoreboard.lIIIIlIlIlIlII[25] = (0x62 ^ 0x75);
    }
    
    public static int getObjectiveDisplaySlotNumber(final String lllllllllllllIlIIlIlIllIllIlIlIl) {
        if (lIlllIlIIIIIlll(lllllllllllllIlIIlIlIllIllIlIlIl.equalsIgnoreCase(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[19]]) ? 1 : 0)) {
            return Scoreboard.lIIIIlIlIlIlII[2];
        }
        if (lIlllIlIIIIIlll(lllllllllllllIlIIlIlIllIllIlIlIl.equalsIgnoreCase(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[0]]) ? 1 : 0)) {
            return Scoreboard.lIIIIlIlIlIlII[3];
        }
        if (lIlllIlIIIIIlll(lllllllllllllIlIIlIlIllIllIlIlIl.equalsIgnoreCase(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[21]]) ? 1 : 0)) {
            return Scoreboard.lIIIIlIlIlIlII[4];
        }
        if (lIlllIlIIIIIlll(lllllllllllllIlIIlIlIllIllIlIlIl.startsWith(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[22]]) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlIllIllIlIlII = lllllllllllllIlIIlIlIllIllIlIlIl.substring(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[23]].length());
            final EnumChatFormatting lllllllllllllIlIIlIlIllIllIlIIll = EnumChatFormatting.getValueByName(lllllllllllllIlIIlIlIllIllIlIlII);
            if (lIlllIIllllllll(lllllllllllllIlIIlIlIllIllIlIIll) && lIlllIlIIIIlIII(lllllllllllllIlIIlIlIllIllIlIIll.getColorIndex())) {
                return lllllllllllllIlIIlIlIllIllIlIIll.getColorIndex() + Scoreboard.lIIIIlIlIlIlII[5];
            }
        }
        return Scoreboard.lIIIIlIlIlIlII[24];
    }
    
    private static boolean lIlllIIlllllllI(final int lllllllllllllIlIIlIlIllIlIIIIIll, final int lllllllllllllIlIIlIlIllIlIIIIIlI) {
        return lllllllllllllIlIIlIlIllIlIIIIIll > lllllllllllllIlIIlIlIllIlIIIIIlI;
    }
    
    public boolean removePlayerFromTeams(final String lllllllllllllIlIIlIlIlllIIIlIllI) {
        final ScorePlayerTeam lllllllllllllIlIIlIlIlllIIIlIlIl = this.getPlayersTeam(lllllllllllllIlIIlIlIlllIIIlIllI);
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIIIlIlIl)) {
            this.removePlayerFromTeam(lllllllllllllIlIIlIlIlllIIIlIllI, lllllllllllllIlIIlIlIlllIIIlIlIl);
            return Scoreboard.lIIIIlIlIlIlII[3] != 0;
        }
        return Scoreboard.lIIIIlIlIlIlII[2] != 0;
    }
    
    public void func_178820_a(final String lllllllllllllIlIIlIlIllIlllIllll, final ScoreObjective lllllllllllllIlIIlIlIllIlllIlllI) {
    }
    
    private static boolean lIlllIlIIIIlIII(final int lllllllllllllIlIIlIlIllIIlllIIII) {
        return lllllllllllllIlIIlIlIllIIlllIIII >= 0;
    }
    
    private static boolean lIlllIlIIIIIlIl(final Object lllllllllllllIlIIlIlIllIIlllllll, final Object lllllllllllllIlIIlIlIllIIllllllI) {
        return lllllllllllllIlIIlIlIllIIlllllll != lllllllllllllIlIIlIlIllIIllllllI;
    }
    
    public void func_96513_c(final ScorePlayerTeam lllllllllllllIlIIlIlIllIlllIIIll) {
    }
    
    private static String lIlllIIlllIIlII(final String lllllllllllllIlIIlIlIllIlIllllII, final String lllllllllllllIlIIlIlIllIlIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIllIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIllIlIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIllIlIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIllIlIlllllI.init(Scoreboard.lIIIIlIlIlIlII[4], lllllllllllllIlIIlIlIllIlIllllll);
            return new String(lllllllllllllIlIIlIlIllIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIllIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIllIlIllllIl) {
            lllllllllllllIlIIlIlIllIlIllllIl.printStackTrace();
            return null;
        }
    }
    
    public void func_181140_a(final Entity lllllllllllllIlIIlIlIllIllIIlIII) {
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIllIllIIlIII) && lIlllIlIIIIIIIl((lllllllllllllIlIIlIlIllIllIIlIII instanceof EntityPlayer) ? 1 : 0) && lIlllIlIIIIIIIl(lllllllllllllIlIIlIlIllIllIIlIII.isEntityAlive() ? 1 : 0)) {
            final String lllllllllllllIlIIlIlIllIllIIIlll = lllllllllllllIlIIlIlIllIllIIlIII.getUniqueID().toString();
            this.removeObjectiveFromEntity(lllllllllllllIlIIlIlIllIllIIIlll, null);
            this.removePlayerFromTeams(lllllllllllllIlIIlIlIllIllIIIlll);
            "".length();
        }
    }
    
    public Collection<ScoreObjective> getObjectivesFromCriteria(final IScoreObjectiveCriteria lllllllllllllIlIIlIlIllllIllllll) {
        final Collection<ScoreObjective> lllllllllllllIlIIlIlIlllllIIIIIl = this.scoreObjectiveCriterias.get(lllllllllllllIlIIlIlIllllIllllll);
        ArrayList list;
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIlllllIIIIIl)) {
            list = Lists.newArrayList();
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            list = Lists.newArrayList((Iterable)lllllllllllllIlIIlIlIlllllIIIIIl);
        }
        return (Collection<ScoreObjective>)list;
    }
    
    private static boolean lIlllIlIIIIIlll(final int lllllllllllllIlIIlIlIllIIlllIlII) {
        return lllllllllllllIlIIlIlIllIIlllIlII != 0;
    }
    
    public void func_96516_a(final String lllllllllllllIlIIlIlIllIllllIIlI) {
    }
    
    public static String[] getDisplaySlotStrings() {
        if (lIlllIlIIIIIIII(Scoreboard.field_178823_g)) {
            Scoreboard.field_178823_g = new String[Scoreboard.lIIIIlIlIlIlII[0]];
            int lllllllllllllIlIIlIlIllIllIIlllI = Scoreboard.lIIIIlIlIlIlII[2];
            "".length();
            if (((0x60 ^ 0x44 ^ (0x27 ^ 0xE)) & (0x9E ^ 0xB3 ^ (0x65 ^ 0x45) ^ -" ".length())) < ("   ".length() & ("   ".length() ^ -" ".length()))) {
                return null;
            }
            while (!lIlllIlIIIIIlII(lllllllllllllIlIIlIlIllIllIIlllI, Scoreboard.lIIIIlIlIlIlII[0])) {
                Scoreboard.field_178823_g[lllllllllllllIlIIlIlIllIllIIlllI] = getObjectiveDisplaySlot(lllllllllllllIlIIlIlIllIllIIlllI);
                ++lllllllllllllIlIIlIlIllIllIIlllI;
            }
        }
        return Scoreboard.field_178823_g;
    }
    
    public void func_96536_a(final Score lllllllllllllIlIIlIlIllIllllIlIl) {
    }
    
    private static boolean lIlllIlIIIIIlII(final int lllllllllllllIlIIlIlIllIlIIIllll, final int lllllllllllllIlIIlIlIllIlIIIlllI) {
        return lllllllllllllIlIIlIlIllIlIIIllll >= lllllllllllllIlIIlIlIllIlIIIlllI;
    }
    
    public boolean entityHasObjective(final String lllllllllllllIlIIlIlIllllIllIIlI, final ScoreObjective lllllllllllllIlIIlIlIllllIllIIIl) {
        final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIllllIllIlIl = this.entitiesScoreObjectives.get(lllllllllllllIlIIlIlIllllIllIIlI);
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIllllIllIlIl)) {
            return Scoreboard.lIIIIlIlIlIlII[2] != 0;
        }
        final Score lllllllllllllIlIIlIlIllllIllIlII = lllllllllllllIlIIlIlIllllIllIlIl.get(lllllllllllllIlIIlIlIllllIllIIIl);
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIllllIllIlII)) {
            return Scoreboard.lIIIIlIlIlIlII[3] != 0;
        }
        return Scoreboard.lIIIIlIlIlIlII[2] != 0;
    }
    
    private static String lIlllIIlllIIIlI(String lllllllllllllIlIIlIlIllIlIlIIlll, final String lllllllllllllIlIIlIlIllIlIlIIllI) {
        lllllllllllllIlIIlIlIllIlIlIIlll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIlIllIlIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlIllIlIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIlIllIlIlIlIIl = lllllllllllllIlIIlIlIllIlIlIIllI.toCharArray();
        int lllllllllllllIlIIlIlIllIlIlIlIII = Scoreboard.lIIIIlIlIlIlII[2];
        final int lllllllllllllIlIIlIlIllIlIlIIIlI = (Object)((String)lllllllllllllIlIIlIlIllIlIlIIlll).toCharArray();
        final char lllllllllllllIlIIlIlIllIlIlIIIIl = (char)lllllllllllllIlIIlIlIllIlIlIIIlI.length;
        short lllllllllllllIlIIlIlIllIlIlIIIII = (short)Scoreboard.lIIIIlIlIlIlII[2];
        while (lIlllIlIIIIIIlI(lllllllllllllIlIIlIlIllIlIlIIIII, lllllllllllllIlIIlIlIllIlIlIIIIl)) {
            final char lllllllllllllIlIIlIlIllIlIlIllIl = lllllllllllllIlIIlIlIllIlIlIIIlI[lllllllllllllIlIIlIlIllIlIlIIIII];
            lllllllllllllIlIIlIlIllIlIlIlIlI.append((char)(lllllllllllllIlIIlIlIllIlIlIllIl ^ lllllllllllllIlIIlIlIllIlIlIlIIl[lllllllllllllIlIIlIlIllIlIlIlIII % lllllllllllllIlIIlIlIllIlIlIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIlIllIlIlIlIII;
            ++lllllllllllllIlIIlIlIllIlIlIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIllIlIlIlIlI);
    }
    
    public void sendTeamUpdate(final ScorePlayerTeam lllllllllllllIlIIlIlIllIlllIIlll) {
    }
    
    public void broadcastTeamCreated(final ScorePlayerTeam lllllllllllllIlIIlIlIllIlllIlIlI) {
    }
    
    public void removeObjectiveFromEntity(final String lllllllllllllIlIIlIlIlllIllllIlI, final ScoreObjective lllllllllllllIlIIlIlIlllIllllIIl) {
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIlllIllllIIl)) {
            final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIlllllll = this.entitiesScoreObjectives.remove(lllllllllllllIlIIlIlIlllIllllIlI);
            if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIlllllll)) {
                this.func_96516_a(lllllllllllllIlIIlIlIlllIllllIlI);
                "".length();
                if (-(0x6F ^ 0x53 ^ (0x6C ^ 0x55)) >= 0) {
                    return;
                }
            }
        }
        else {
            final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIllllllI = this.entitiesScoreObjectives.get(lllllllllllllIlIIlIlIlllIllllIlI);
            if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIllllllI)) {
                final Score lllllllllllllIlIIlIlIlllIlllllIl = lllllllllllllIlIIlIlIlllIllllllI.remove(lllllllllllllIlIIlIlIlllIllllIIl);
                if (lIlllIlIIIIIIlI(lllllllllllllIlIIlIlIlllIllllllI.size(), Scoreboard.lIIIIlIlIlIlII[3])) {
                    final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIlllllII = this.entitiesScoreObjectives.remove(lllllllllllllIlIIlIlIlllIllllIlI);
                    if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIlllllII)) {
                        this.func_96516_a(lllllllllllllIlIIlIlIlllIllllIlI);
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                }
                else if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIlllllIl)) {
                    this.func_178820_a(lllllllllllllIlIIlIlIlllIllllIlI, lllllllllllllIlIIlIlIlllIllllIIl);
                }
            }
        }
    }
    
    private static boolean lIlllIlIIIIIIll(final Object lllllllllllllIlIIlIlIllIIllllIIl, final Object lllllllllllllIlIIlIlIllIIllllIII) {
        return lllllllllllllIlIIlIlIllIIllllIIl == lllllllllllllIlIIlIlIllIIllllIII;
    }
    
    static {
        lIlllIIllllllIl();
        lIlllIIlllllIII();
        Scoreboard.field_178823_g = null;
    }
    
    public void removeObjective(final ScoreObjective lllllllllllllIlIIlIlIlllIlIllIII) {
        this.scoreObjectives.remove(lllllllllllllIlIIlIlIlllIlIllIII.getName());
        "".length();
        int lllllllllllllIlIIlIlIlllIlIlIlll = Scoreboard.lIIIIlIlIlIlII[2];
        "".length();
        if (-(124 + 88 - 206 + 160 ^ 60 + 119 - 112 + 95) > 0) {
            return;
        }
        while (!lIlllIlIIIIIlII(lllllllllllllIlIIlIlIlllIlIlIlll, Scoreboard.lIIIIlIlIlIlII[0])) {
            if (lIlllIlIIIIIIll(this.getObjectiveInDisplaySlot(lllllllllllllIlIIlIlIlllIlIlIlll), lllllllllllllIlIIlIlIlllIlIllIII)) {
                this.setObjectiveInDisplaySlot(lllllllllllllIlIIlIlIlllIlIlIlll, null);
            }
            ++lllllllllllllIlIIlIlIlllIlIlIlll;
        }
        final List<ScoreObjective> lllllllllllllIlIIlIlIlllIlIlIllI = this.scoreObjectiveCriterias.get(lllllllllllllIlIIlIlIlllIlIllIII.getCriteria());
        if (lIlllIIllllllll(lllllllllllllIlIIlIlIlllIlIlIllI)) {
            lllllllllllllIlIIlIlIlllIlIlIllI.remove(lllllllllllllIlIIlIlIlllIlIllIII);
            "".length();
        }
        final String lllllllllllllIlIIlIlIlllIlIlIIII = (String)this.entitiesScoreObjectives.values().iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIlllIlIIIIIIIl(((Iterator)lllllllllllllIlIIlIlIlllIlIlIIII).hasNext() ? 1 : 0)) {
            final Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIlIlIlIl = ((Iterator<Map<ScoreObjective, Score>>)lllllllllllllIlIIlIlIlllIlIlIIII).next();
            lllllllllllllIlIIlIlIlllIlIlIlIl.remove(lllllllllllllIlIIlIlIlllIlIllIII);
            "".length();
        }
        this.func_96533_c(lllllllllllllIlIIlIlIlllIlIllIII);
    }
    
    public Collection<ScorePlayerTeam> getTeams() {
        return this.teams.values();
    }
    
    private static boolean lIlllIlIIIIIIlI(final int lllllllllllllIlIIlIlIllIlIIIlIll, final int lllllllllllllIlIIlIlIllIlIIIlIlI) {
        return lllllllllllllIlIIlIlIllIlIIIlIll < lllllllllllllIlIIlIlIllIlIIIlIlI;
    }
    
    public Collection<String> getTeamNames() {
        return this.teams.keySet();
    }
    
    public void func_96532_b(final ScoreObjective lllllllllllllIlIIlIlIllIlllllIIl) {
    }
    
    private static String lIlllIIlllIIIll(final String lllllllllllllIlIIlIlIllIlIIlIlll, final String lllllllllllllIlIIlIlIllIlIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIllIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIllIlIIlIlII.getBytes(StandardCharsets.UTF_8)), Scoreboard.lIIIIlIlIlIlII[11]), "DES");
            final Cipher lllllllllllllIlIIlIlIllIlIIllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIllIlIIllIIl.init(Scoreboard.lIIIIlIlIlIlII[4], lllllllllllllIlIIlIlIllIlIIllIlI);
            return new String(lllllllllllllIlIIlIlIllIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIllIlIIllIII) {
            lllllllllllllIlIIlIlIllIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    public Score getValueFromObjective(final String lllllllllllllIlIIlIlIllllIlIIIll, final ScoreObjective lllllllllllllIlIIlIlIllllIlIIlll) {
        if (lIlllIIlllllllI(lllllllllllllIlIIlIlIllllIlIIIll.length(), Scoreboard.lIIIIlIlIlIlII[6])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[7]]).append(lllllllllllllIlIIlIlIllllIlIIIll).append(Scoreboard.lIIIIlIlIIlllI[Scoreboard.lIIIIlIlIlIlII[8]])));
        }
        Map<ScoreObjective, Score> lllllllllllllIlIIlIlIllllIlIIllI = this.entitiesScoreObjectives.get(lllllllllllllIlIIlIlIllllIlIIIll);
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIllllIlIIllI)) {
            lllllllllllllIlIIlIlIllllIlIIllI = (Map<ScoreObjective, Score>)Maps.newHashMap();
            this.entitiesScoreObjectives.put(lllllllllllllIlIIlIlIllllIlIIIll, lllllllllllllIlIIlIlIllllIlIIllI);
            "".length();
        }
        Score lllllllllllllIlIIlIlIllllIlIIlIl = lllllllllllllIlIIlIlIllllIlIIllI.get(lllllllllllllIlIIlIlIllllIlIIlll);
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIllllIlIIlIl)) {
            lllllllllllllIlIIlIlIllllIlIIlIl = new Score(this, lllllllllllllIlIIlIlIllllIlIIlll, lllllllllllllIlIIlIlIllllIlIIIll);
            lllllllllllllIlIIlIlIllllIlIIllI.put(lllllllllllllIlIIlIlIllllIlIIlll, lllllllllllllIlIIlIlIllllIlIIlIl);
            "".length();
        }
        return lllllllllllllIlIIlIlIllllIlIIlIl;
    }
    
    public Map<ScoreObjective, Score> getObjectivesForEntity(final String lllllllllllllIlIIlIlIlllIllIIIII) {
        Map<ScoreObjective, Score> lllllllllllllIlIIlIlIlllIllIIIlI = this.entitiesScoreObjectives.get(lllllllllllllIlIIlIlIlllIllIIIII);
        if (lIlllIlIIIIIIII(lllllllllllllIlIIlIlIlllIllIIIlI)) {
            lllllllllllllIlIIlIlIlllIllIIIlI = (Map<ScoreObjective, Score>)Maps.newHashMap();
        }
        return lllllllllllllIlIIlIlIlllIllIIIlI;
    }
    
    private static boolean lIlllIlIIIIIIII(final Object lllllllllllllIlIIlIlIllIIlllIllI) {
        return lllllllllllllIlIIlIlIllIIlllIllI == null;
    }
}
