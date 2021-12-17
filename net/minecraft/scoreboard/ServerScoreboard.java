// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.scoreboard;

import java.util.Iterator;
import com.google.common.collect.Sets;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import com.google.common.collect.Lists;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.server.management.ServerConfigurationManager;
import java.util.Collection;
import net.minecraft.network.play.server.S3EPacketTeams;
import java.util.Arrays;
import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import java.util.Set;

public class ServerScoreboard extends Scoreboard
{
    private static final /* synthetic */ int[] lIIlllIllIlllI;
    private /* synthetic */ ScoreboardSaveData scoreboardSaveData;
    private final /* synthetic */ Set<ScoreObjective> field_96553_b;
    private final /* synthetic */ MinecraftServer scoreboardMCServer;
    
    private static boolean llIlllIIIIllIII(final Object lllllllllllllIIlIIlllIIIIIIlllII, final Object lllllllllllllIIlIIlllIIIIIIllIll) {
        return lllllllllllllIIlIIlllIIIIIIlllII == lllllllllllllIIlIIlllIIIIIIllIll;
    }
    
    public void getPlayerIterator(final ScoreObjective lllllllllllllIIlIIlllIIIIIlllIlI) {
        final List<Packet> lllllllllllllIIlIIlllIIIIIlllllI = this.func_96548_f(lllllllllllllIIlIIlllIIIIIlllIlI);
        final long lllllllllllllIIlIIlllIIIIIllIlll = (long)this.scoreboardMCServer.getConfigurationManager().func_181057_v().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlllIIIIllIlI(((Iterator)lllllllllllllIIlIIlllIIIIIllIlll).hasNext() ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIIlIIlllIIIIIllllIl = ((Iterator<EntityPlayerMP>)lllllllllllllIIlIIlllIIIIIllIlll).next();
            final boolean lllllllllllllIIlIIlllIIIIIllIlIl = (boolean)lllllllllllllIIlIIlllIIIIIlllllI.iterator();
            "".length();
            if ((0xA8 ^ 0xAD) == 0x0) {
                return;
            }
            while (!llIlllIIIIllIlI(((Iterator)lllllllllllllIIlIIlllIIIIIllIlIl).hasNext() ? 1 : 0)) {
                final Packet lllllllllllllIIlIIlllIIIIIllllII = ((Iterator<Packet>)lllllllllllllIIlIIlllIIIIIllIlIl).next();
                lllllllllllllIIlIIlllIIIIIllllIl.playerNetServerHandler.sendPacket(lllllllllllllIIlIIlllIIIIIllllII);
            }
        }
        this.field_96553_b.remove(lllllllllllllIIlIIlllIIIIIlllIlI);
        "".length();
    }
    
    public void func_96547_a(final ScoreboardSaveData lllllllllllllIIlIIlllIIIIllllIIl) {
        this.scoreboardSaveData = lllllllllllllIIlIIlllIIIIllllIIl;
    }
    
    @Override
    public boolean addPlayerToTeam(final String lllllllllllllIIlIIlllIIIlIlIlllI, final String lllllllllllllIIlIIlllIIIlIllIIIl) {
        if (llIlllIIIIlIlII(super.addPlayerToTeam(lllllllllllllIIlIIlllIIIlIlIlllI, lllllllllllllIIlIIlllIIIlIllIIIl) ? 1 : 0)) {
            final ScorePlayerTeam lllllllllllllIIlIIlllIIIlIllIIII = this.getTeam(lllllllllllllIIlIIlllIIIlIllIIIl);
            final ServerConfigurationManager configurationManager = this.scoreboardMCServer.getConfigurationManager();
            final ScorePlayerTeam llllllllllllIlIllIIlIIlllIllIIIl = lllllllllllllIIlIIlllIIIlIllIIII;
            final String[] a = new String[ServerScoreboard.lIIlllIllIlllI[0]];
            a[ServerScoreboard.lIIlllIllIlllI[1]] = lllllllllllllIIlIIlllIIIlIlIlllI;
            configurationManager.sendPacketToAllPlayers(new S3EPacketTeams(llllllllllllIlIllIIlIIlllIllIIIl, Arrays.asList(a), ServerScoreboard.lIIlllIllIlllI[2]));
            this.func_96551_b();
            return ServerScoreboard.lIIlllIllIlllI[0] != 0;
        }
        return ServerScoreboard.lIIlllIllIlllI[1] != 0;
    }
    
    @Override
    public void func_96513_c(final ScorePlayerTeam lllllllllllllIIlIIlllIIIIlllllll) {
        super.func_96513_c(lllllllllllllIIlIIlllIIIIlllllll);
        this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3EPacketTeams(lllllllllllllIIlIIlllIIIIlllllll, ServerScoreboard.lIIlllIllIlllI[0]));
        this.func_96551_b();
    }
    
    @Override
    public void setObjectiveInDisplaySlot(final int lllllllllllllIIlIIlllIIIlIlllllI, final ScoreObjective lllllllllllllIIlIIlllIIIlIlllIIl) {
        final ScoreObjective lllllllllllllIIlIIlllIIIlIllllII = this.getObjectiveInDisplaySlot(lllllllllllllIIlIIlllIIIlIlllllI);
        super.setObjectiveInDisplaySlot(lllllllllllllIIlIIlllIIIlIlllllI, lllllllllllllIIlIIlllIIIlIlllIIl);
        if (llIlllIIIIlIlIl(lllllllllllllIIlIIlllIIIlIllllII, lllllllllllllIIlIIlllIIIlIlllIIl) && llIlllIIIIlIllI(lllllllllllllIIlIIlllIIIlIllllII)) {
            if (llIlllIIIIlIlll(this.func_96552_h(lllllllllllllIIlIIlllIIIlIllllII))) {
                this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3DPacketDisplayScoreboard(lllllllllllllIIlIIlllIIIlIlllllI, lllllllllllllIIlIIlllIIIlIlllIIl));
                "".length();
                if ((0x7B ^ 0x64 ^ (0x3F ^ 0x25)) <= 0) {
                    return;
                }
            }
            else {
                this.getPlayerIterator(lllllllllllllIIlIIlllIIIlIllllII);
            }
        }
        if (llIlllIIIIlIllI(lllllllllllllIIlIIlllIIIlIlllIIl)) {
            if (llIlllIIIIlIlII(this.field_96553_b.contains(lllllllllllllIIlIIlllIIIlIlllIIl) ? 1 : 0)) {
                this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3DPacketDisplayScoreboard(lllllllllllllIIlIIlllIIIlIlllllI, lllllllllllllIIlIIlllIIIlIlllIIl));
                "".length();
                if ((0xB5 ^ 0xB1) != (0x3D ^ 0x39)) {
                    return;
                }
            }
            else {
                this.func_96549_e(lllllllllllllIIlIIlllIIIlIlllIIl);
            }
        }
        this.func_96551_b();
    }
    
    private static void llIlllIIIIlIIll() {
        (lIIlllIllIlllI = new int[6])[0] = " ".length();
        ServerScoreboard.lIIlllIllIlllI[1] = ((114 + 35 - 104 + 93 ^ 89 + 15 - 103 + 189) & (0xCF ^ 0x82 ^ (0xCE ^ 0xB7) ^ -" ".length()));
        ServerScoreboard.lIIlllIllIlllI[2] = "   ".length();
        ServerScoreboard.lIIlllIllIlllI[3] = (0xB ^ 0xF);
        ServerScoreboard.lIIlllIllIlllI[4] = "  ".length();
        ServerScoreboard.lIIlllIllIlllI[5] = (0xF7 ^ 0xA7 ^ (0xFE ^ 0xBD));
    }
    
    public void func_96549_e(final ScoreObjective lllllllllllllIIlIIlllIIIIlIllIIl) {
        final List<Packet> lllllllllllllIIlIIlllIIIIlIlllIl = this.func_96550_d(lllllllllllllIIlIIlllIIIIlIllIIl);
        final short lllllllllllllIIlIIlllIIIIlIlIllI = (short)this.scoreboardMCServer.getConfigurationManager().func_181057_v().iterator();
        "".length();
        if ("  ".length() > "   ".length()) {
            return;
        }
        while (!llIlllIIIIllIlI(((Iterator)lllllllllllllIIlIIlllIIIIlIlIllI).hasNext() ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIIlIIlllIIIIlIlllII = ((Iterator<EntityPlayerMP>)lllllllllllllIIlIIlllIIIIlIlIllI).next();
            final float lllllllllllllIIlIIlllIIIIlIlIlII = (float)lllllllllllllIIlIIlllIIIIlIlllIl.iterator();
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
            while (!llIlllIIIIllIlI(((Iterator)lllllllllllllIIlIIlllIIIIlIlIlII).hasNext() ? 1 : 0)) {
                final Packet lllllllllllllIIlIIlllIIIIlIllIll = ((Iterator<Packet>)lllllllllllllIIlIIlllIIIIlIlIlII).next();
                lllllllllllllIIlIIlllIIIIlIlllII.playerNetServerHandler.sendPacket(lllllllllllllIIlIIlllIIIIlIllIll);
            }
        }
        this.field_96553_b.add(lllllllllllllIIlIIlllIIIIlIllIIl);
        "".length();
    }
    
    static {
        llIlllIIIIlIIll();
    }
    
    private static boolean llIlllIIIIlIlll(final int lllllllllllllIIlIIlllIIIIIIlIlIl) {
        return lllllllllllllIIlIIlllIIIIIIlIlIl > 0;
    }
    
    public int func_96552_h(final ScoreObjective lllllllllllllIIlIIlllIIIIIlIllll) {
        int lllllllllllllIIlIIlllIIIIIlIlllI = ServerScoreboard.lIIlllIllIlllI[1];
        int lllllllllllllIIlIIlllIIIIIlIllIl = ServerScoreboard.lIIlllIllIlllI[1];
        "".length();
        if ("   ".length() == 0) {
            return (0x33 ^ 0x11) & ~(0x8 ^ 0x2A);
        }
        while (!llIlllIIIIllIIl(lllllllllllllIIlIIlllIIIIIlIllIl, ServerScoreboard.lIIlllIllIlllI[5])) {
            if (llIlllIIIIllIII(this.getObjectiveInDisplaySlot(lllllllllllllIIlIIlllIIIIIlIllIl), lllllllllllllIIlIIlllIIIIIlIllll)) {
                ++lllllllllllllIIlIIlllIIIIIlIlllI;
            }
            ++lllllllllllllIIlIIlllIIIIIlIllIl;
        }
        return lllllllllllllIIlIIlllIIIIIlIlllI;
    }
    
    @Override
    public void onScoreObjectiveAdded(final ScoreObjective lllllllllllllIIlIIlllIIIlIIlllll) {
        super.onScoreObjectiveAdded(lllllllllllllIIlIIlllIIIlIIlllll);
        this.func_96551_b();
    }
    
    protected void func_96551_b() {
        if (llIlllIIIIlIllI(this.scoreboardSaveData)) {
            this.scoreboardSaveData.markDirty();
        }
    }
    
    private static boolean llIlllIIIIllIlI(final int lllllllllllllIIlIIlllIIIIIIlIlll) {
        return lllllllllllllIIlIIlllIIIIIIlIlll == 0;
    }
    
    private static boolean llIlllIIIIllIIl(final int lllllllllllllIIlIIlllIIIIIlIIllI, final int lllllllllllllIIlIIlllIIIIIlIIlIl) {
        return lllllllllllllIIlIIlllIIIIIlIIllI >= lllllllllllllIIlIIlllIIIIIlIIlIl;
    }
    
    private static boolean llIlllIIIIlIlIl(final Object lllllllllllllIIlIIlllIIIIIlIIIlI, final Object lllllllllllllIIlIIlllIIIIIlIIIIl) {
        return lllllllllllllIIlIIlllIIIIIlIIIlI != lllllllllllllIIlIIlllIIIIIlIIIIl;
    }
    
    public List<Packet> func_96548_f(final ScoreObjective lllllllllllllIIlIIlllIIIIlIIlIlI) {
        final List<Packet> lllllllllllllIIlIIlllIIIIlIIllIl = (List<Packet>)Lists.newArrayList();
        lllllllllllllIIlIIlllIIIIlIIllIl.add(new S3BPacketScoreboardObjective(lllllllllllllIIlIIlllIIIIlIIlIlI, ServerScoreboard.lIIlllIllIlllI[0]));
        "".length();
        int lllllllllllllIIlIIlllIIIIlIIllII = ServerScoreboard.lIIlllIllIlllI[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlllIIIIllIIl(lllllllllllllIIlIIlllIIIIlIIllII, ServerScoreboard.lIIlllIllIlllI[5])) {
            if (llIlllIIIIllIII(this.getObjectiveInDisplaySlot(lllllllllllllIIlIIlllIIIIlIIllII), lllllllllllllIIlIIlllIIIIlIIlIlI)) {
                lllllllllllllIIlIIlllIIIIlIIllIl.add(new S3DPacketDisplayScoreboard(lllllllllllllIIlIIlllIIIIlIIllII, lllllllllllllIIlIIlllIIIIlIIlIlI));
                "".length();
            }
            ++lllllllllllllIIlIIlllIIIIlIIllII;
        }
        return lllllllllllllIIlIIlllIIIIlIIllIl;
    }
    
    @Override
    public void sendTeamUpdate(final ScorePlayerTeam lllllllllllllIIlIIlllIIIlIIIIlll) {
        super.sendTeamUpdate(lllllllllllllIIlIIlllIIIlIIIIlll);
        this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3EPacketTeams(lllllllllllllIIlIIlllIIIlIIIIlll, ServerScoreboard.lIIlllIllIlllI[4]));
        this.func_96551_b();
    }
    
    @Override
    public void broadcastTeamCreated(final ScorePlayerTeam lllllllllllllIIlIIlllIIIlIIIllIl) {
        super.broadcastTeamCreated(lllllllllllllIIlIIlllIIIlIIIllIl);
        this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3EPacketTeams(lllllllllllllIIlIIlllIIIlIIIllIl, ServerScoreboard.lIIlllIllIlllI[1]));
        this.func_96551_b();
    }
    
    private static boolean llIlllIIIIlIlII(final int lllllllllllllIIlIIlllIIIIIIllIIl) {
        return lllllllllllllIIlIIlllIIIIIIllIIl != 0;
    }
    
    @Override
    public void func_96533_c(final ScoreObjective lllllllllllllIIlIIlllIIIlIIlIIIl) {
        super.func_96533_c(lllllllllllllIIlIIlllIIIlIIlIIIl);
        if (llIlllIIIIlIlII(this.field_96553_b.contains(lllllllllllllIIlIIlllIIIlIIlIIIl) ? 1 : 0)) {
            this.getPlayerIterator(lllllllllllllIIlIIlllIIIlIIlIIIl);
        }
        this.func_96551_b();
    }
    
    @Override
    public void func_96532_b(final ScoreObjective lllllllllllllIIlIIlllIIIlIIllIIl) {
        super.func_96532_b(lllllllllllllIIlIIlllIIIlIIllIIl);
        if (llIlllIIIIlIlII(this.field_96553_b.contains(lllllllllllllIIlIIlllIIIlIIllIIl) ? 1 : 0)) {
            this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3BPacketScoreboardObjective(lllllllllllllIIlIIlllIIIlIIllIIl, ServerScoreboard.lIIlllIllIlllI[4]));
        }
        this.func_96551_b();
    }
    
    @Override
    public void func_178820_a(final String lllllllllllllIIlIIlllIIIllIIIlIl, final ScoreObjective lllllllllllllIIlIIlllIIIllIIIlll) {
        super.func_178820_a(lllllllllllllIIlIIlllIIIllIIIlIl, lllllllllllllIIlIIlllIIIllIIIlll);
        this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3CPacketUpdateScore(lllllllllllllIIlIIlllIIIllIIIlIl, lllllllllllllIIlIIlllIIIllIIIlll));
        this.func_96551_b();
    }
    
    @Override
    public void removePlayerFromTeam(final String lllllllllllllIIlIIlllIIIlIlIIlII, final ScorePlayerTeam lllllllllllllIIlIIlllIIIlIlIIIll) {
        super.removePlayerFromTeam(lllllllllllllIIlIIlllIIIlIlIIlII, lllllllllllllIIlIIlllIIIlIlIIIll);
        final ServerConfigurationManager configurationManager = this.scoreboardMCServer.getConfigurationManager();
        final String[] a = new String[ServerScoreboard.lIIlllIllIlllI[0]];
        a[ServerScoreboard.lIIlllIllIlllI[1]] = lllllllllllllIIlIIlllIIIlIlIIlII;
        configurationManager.sendPacketToAllPlayers(new S3EPacketTeams(lllllllllllllIIlIIlllIIIlIlIIIll, Arrays.asList(a), ServerScoreboard.lIIlllIllIlllI[3]));
        this.func_96551_b();
    }
    
    @Override
    public void func_96536_a(final Score lllllllllllllIIlIIlllIIIllIlIIll) {
        super.func_96536_a(lllllllllllllIIlIIlllIIIllIlIIll);
        if (llIlllIIIIlIlII(this.field_96553_b.contains(lllllllllllllIIlIIlllIIIllIlIIll.getObjective()) ? 1 : 0)) {
            this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3CPacketUpdateScore(lllllllllllllIIlIIlllIIIllIlIIll));
        }
        this.func_96551_b();
    }
    
    private static boolean llIlllIIIIlIllI(final Object lllllllllllllIIlIIlllIIIIIIlllll) {
        return lllllllllllllIIlIIlllIIIIIIlllll != null;
    }
    
    public List<Packet> func_96550_d(final ScoreObjective lllllllllllllIIlIIlllIIIIllIllll) {
        final List<Packet> lllllllllllllIIlIIlllIIIIllIlllI = (List<Packet>)Lists.newArrayList();
        lllllllllllllIIlIIlllIIIIllIlllI.add(new S3BPacketScoreboardObjective(lllllllllllllIIlIIlllIIIIllIllll, ServerScoreboard.lIIlllIllIlllI[1]));
        "".length();
        int lllllllllllllIIlIIlllIIIIllIllIl = ServerScoreboard.lIIlllIllIlllI[1];
        "".length();
        if ("   ".length() < 0) {
            return null;
        }
        while (!llIlllIIIIllIIl(lllllllllllllIIlIIlllIIIIllIllIl, ServerScoreboard.lIIlllIllIlllI[5])) {
            if (llIlllIIIIllIII(this.getObjectiveInDisplaySlot(lllllllllllllIIlIIlllIIIIllIllIl), lllllllllllllIIlIIlllIIIIllIllll)) {
                lllllllllllllIIlIIlllIIIIllIlllI.add(new S3DPacketDisplayScoreboard(lllllllllllllIIlIIlllIIIIllIllIl, lllllllllllllIIlIIlllIIIIllIllll));
                "".length();
            }
            ++lllllllllllllIIlIIlllIIIIllIllIl;
        }
        final String lllllllllllllIIlIIlllIIIIllIIlll = (String)this.getSortedScores(lllllllllllllIIlIIlllIIIIllIllll).iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlllIIIIllIlI(((Iterator)lllllllllllllIIlIIlllIIIIllIIlll).hasNext() ? 1 : 0)) {
            final Score lllllllllllllIIlIIlllIIIIllIllII = ((Iterator<Score>)lllllllllllllIIlIIlllIIIIllIIlll).next();
            lllllllllllllIIlIIlllIIIIllIlllI.add(new S3CPacketUpdateScore(lllllllllllllIIlIIlllIIIIllIllII));
            "".length();
        }
        return lllllllllllllIIlIIlllIIIIllIlllI;
    }
    
    @Override
    public void func_96516_a(final String lllllllllllllIIlIIlllIIIllIIllll) {
        super.func_96516_a(lllllllllllllIIlIIlllIIIllIIllll);
        this.scoreboardMCServer.getConfigurationManager().sendPacketToAllPlayers(new S3CPacketUpdateScore(lllllllllllllIIlIIlllIIIllIIllll));
        this.func_96551_b();
    }
    
    public ServerScoreboard(final MinecraftServer lllllllllllllIIlIIlllIIIllIllIIl) {
        this.field_96553_b = (Set<ScoreObjective>)Sets.newHashSet();
        this.scoreboardMCServer = lllllllllllllIIlIIlllIIIllIllIIl;
    }
}
