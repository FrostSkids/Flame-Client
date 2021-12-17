// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Iterator;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.util.BlockPos;
import net.minecraft.scoreboard.Team;
import net.minecraft.server.MinecraftServer;
import java.util.Arrays;
import net.minecraft.command.SyntaxErrorException;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.command.WrongUsageException;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import net.minecraft.util.ChatComponentText;
import net.minecraft.scoreboard.Score;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.command.CommandResultStats;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.command.CommandException;
import net.minecraft.scoreboard.ScorePlayerTeam;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandBase;

public class CommandScoreboard extends CommandBase
{
    private static final /* synthetic */ String[] lIIIllllllllII;
    private static final /* synthetic */ int[] lIIlIIIlIIIlII;
    
    static {
        llIIlIlIIllllll();
        llIIlIIllIIIIII();
    }
    
    private static String llIIlIIIllIllIl(final String lllllllllllllIIlllIlIIIlIIIIlIII, final String lllllllllllllIIlllIlIIIlIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIIIlIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlIIIlIIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlIIIlIIIIlIlI.init(CommandScoreboard.lIIlIIIlIIIlII[1], lllllllllllllIIlllIlIIIlIIIIlIll);
            return new String(lllllllllllllIIlllIlIIIlIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIIIlIIIIlIIl) {
            lllllllllllllIIlllIlIIIlIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIlIlIIIIlI(final int lllllllllllllIIlllIlIIIIlllIIIIl) {
        return lllllllllllllIIlllIlIIIIlllIIIIl != 0;
    }
    
    private static boolean llIIlIlIlIIlllI(final int lllllllllllllIIlllIlIIIIllllIlII, final int lllllllllllllIIlllIlIIIIllllIIll) {
        return lllllllllllllIIlllIlIIIIllllIlII <= lllllllllllllIIlllIlIIIIllllIIll;
    }
    
    protected ScorePlayerTeam getTeam(final String lllllllllllllIIlllIlIIllIIlllIIl) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIllIIlllIII = this.getScoreboard();
        final ScorePlayerTeam lllllllllllllIIlllIlIIllIIllIlll = lllllllllllllIIlllIlIIllIIlllIII.getTeam(lllllllllllllIIlllIlIIllIIlllIIl);
        if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIllIIllIlll)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[56]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlllIIl;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        return lllllllllllllIIlllIlIIllIIllIlll;
    }
    
    protected void setObjectiveDisplay(final ICommandSender lllllllllllllIIlllIlIIlIIIlIllII, final String[] lllllllllllllIIlllIlIIlIIIlIIIll, int lllllllllllllIIlllIlIIlIIIlIlIlI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIIIlIlIIl = this.getScoreboard();
        final String lllllllllllllIIlllIlIIlIIIlIlIII = lllllllllllllIIlllIlIIlIIIlIIIll[lllllllllllllIIlllIlIIlIIIlIlIlI++];
        final int lllllllllllllIIlllIlIIlIIIlIIlll = Scoreboard.getObjectiveDisplaySlotNumber(lllllllllllllIIlllIlIIlIIIlIlIII);
        ScoreObjective lllllllllllllIIlllIlIIlIIIlIIllI = null;
        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIlIIIlIIIll.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
            lllllllllllllIIlllIlIIlIIIlIIllI = this.getObjective(lllllllllllllIIlllIlIIlIIIlIIIll[lllllllllllllIIlllIlIIlIIIlIlIlI], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        }
        if (llIIlIlIlIIlIII(lllllllllllllIIlllIlIIlIIIlIIlll)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[124]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIlIlIII;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        lllllllllllllIIlllIlIIlIIIlIlIIl.setObjectiveInDisplaySlot(lllllllllllllIIlllIlIIlIIIlIIlll, lllllllllllllIIlllIlIIlIIIlIIllI);
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIlIIIlIIllI)) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[125]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = Scoreboard.getObjectiveDisplaySlot(lllllllllllllIIlllIlIIlIIIlIIlll);
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIIIlIIllI.getName();
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIIIlIllII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[126]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandScoreboard.lIIlIIIlIIIlII[0]] = Scoreboard.getObjectiveDisplaySlot(lllllllllllllIIlllIlIIlIIIlIIlll);
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIIIlIllII, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
    }
    
    private static boolean llIIlIlIlIIllIl(final Object lllllllllllllIIlllIlIIIIlllIllII, final Object lllllllllllllIIlllIlIIIIlllIlIll) {
        return lllllllllllllIIlllIlIIIIlllIllII != lllllllllllllIIlllIlIIIIlllIlIll;
    }
    
    private static boolean llIIlIlIlIIIlIl(final int lllllllllllllIIlllIlIIIIllllIIII, final int lllllllllllllIIlllIlIIIIlllIllll) {
        return lllllllllllllIIlllIlIIIIllllIIII > lllllllllllllIIlllIlIIIIlllIllll;
    }
    
    protected void listPlayers(final ICommandSender lllllllllllllIIlllIlIIlIIIIlIIlI, final String[] lllllllllllllIIlllIlIIlIIIIlIIIl, final int lllllllllllllIIlllIlIIlIIIIIIlIl) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIIIIIllll = this.getScoreboard();
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIlIIIIlIIIl.length, lllllllllllllIIlllIlIIlIIIIIIlIl)) {
            final String lllllllllllllIIlllIlIIlIIIIIlllI = CommandBase.getEntityName(lllllllllllllIIlllIlIIlIIIIlIIlI, lllllllllllllIIlllIlIIlIIIIlIIIl[lllllllllllllIIlllIlIIlIIIIIIlIl]);
            final Map<ScoreObjective, Score> lllllllllllllIIlllIlIIlIIIIIllIl = lllllllllllllIIlllIlIIlIIIIIllll.getObjectivesForEntity(lllllllllllllIIlllIlIIlIIIIIlllI);
            lllllllllllllIIlllIlIIlIIIIlIIlI.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIlllIlIIlIIIIIllIl.size());
            if (llIIlIlIlIIllII(lllllllllllllIIlllIlIIlIIIIIllIl.size())) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[127]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIIIlllI;
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[128]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIIIllIl.size();
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIIIIIlllI;
            final ChatComponentTranslation lllllllllllllIIlllIlIIlIIIIIllII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIIlllIlIIlIIIIIllII.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
            "".length();
            lllllllllllllIIlllIlIIlIIIIlIIlI.addChatMessage(lllllllllllllIIlllIlIIlIIIIIllII);
            final long lllllllllllllIIlllIlIIIlllllllll = (long)lllllllllllllIIlllIlIIlIIIIIllIl.values().iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIIlllllllll).hasNext() ? 1 : 0)) {
                final Score lllllllllllllIIlllIlIIlIIIIIlIll = ((Iterator<Score>)lllllllllllllIIlllIlIIIlllllllll).next();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[129]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIIIlIll.getScorePoints();
                lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIIIIIlIll.getObjective().getDisplayName();
                lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIlIIIIIlIll.getObjective().getName();
                lllllllllllllIIlllIlIIlIIIIlIIlI.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final Collection<String> lllllllllllllIIlllIlIIlIIIIIlIlI = lllllllllllllIIlllIlIIlIIIIIllll.getObjectiveNames();
            lllllllllllllIIlllIlIIlIIIIlIIlI.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIlllIlIIlIIIIIlIlI.size());
            if (llIIlIlIlIIllII(lllllllllllllIIlllIlIIlIIIIIlIlI.size())) {
                throw new CommandException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[130]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
            }
            final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[131]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl3[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIIIlIlI.size();
            final ChatComponentTranslation lllllllllllllIIlllIlIIlIIIIIlIIl = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3);
            lllllllllllllIIlllIlIIlIIIIIlIIl.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
            "".length();
            lllllllllllllIIlllIlIIlIIIIlIIlI.addChatMessage(lllllllllllllIIlllIlIIlIIIIIlIIl);
            lllllllllllllIIlllIlIIlIIIIlIIlI.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIIIIIlIlI.toArray())));
        }
    }
    
    protected void resetPlayers(final ICommandSender lllllllllllllIIlllIlIIIlllIIlIII, final String[] lllllllllllllIIlllIlIIIlllIIIlll, int lllllllllllllIIlllIlIIIlllIIIllI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIIlllIIllII = this.getScoreboard();
        final String lllllllllllllIIlllIlIIIlllIIlIll = CommandBase.getEntityName(lllllllllllllIIlllIlIIIlllIIlIII, lllllllllllllIIlllIlIIIlllIIIlll[lllllllllllllIIlllIlIIIlllIIIllI++]);
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIlllIIIlll.length, lllllllllllllIIlllIlIIIlllIIIllI)) {
            final ScoreObjective lllllllllllllIIlllIlIIIlllIIlIlI = this.getObjective(lllllllllllllIIlllIlIIIlllIIIlll[lllllllllllllIIlllIlIIIlllIIIllI++], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
            lllllllllllllIIlllIlIIIlllIIllII.removeObjectiveFromEntity(lllllllllllllIIlllIlIIIlllIIlIll, lllllllllllllIIlllIlIIIlllIIlIlI);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[139]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlllIIlIlI.getName();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIlllIIlIll;
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIIlllIIlIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIlllIlIIIlllIIllII.removeObjectiveFromEntity(lllllllllllllIIlllIlIIIlllIIlIll, null);
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[140]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlllIIlIll;
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIIlllIIlIII, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
    }
    
    private static boolean llIIlIlIlIIIlII(final int lllllllllllllIIlllIlIIIIllIlIlII, final int lllllllllllllIIlllIlIIIIllIlIIll) {
        return lllllllllllllIIlllIlIIIIllIlIlII != lllllllllllllIIlllIlIIIIllIlIIll;
    }
    
    protected void joinTeam(final ICommandSender lllllllllllllIIlllIlIIlIlIIlllll, final String[] lllllllllllllIIlllIlIIlIlIlIlIll, int lllllllllllllIIlllIlIIlIlIlIlIlI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIlIlIlIIl = this.getScoreboard();
        final String lllllllllllllIIlllIlIIlIlIlIlIII = lllllllllllllIIlllIlIIlIlIlIlIll[lllllllllllllIIlllIlIIlIlIlIlIlI++];
        final Set<String> lllllllllllllIIlllIlIIlIlIlIIlll = (Set<String>)Sets.newHashSet();
        final Set<String> lllllllllllllIIlllIlIIlIlIlIIllI = (Set<String>)Sets.newHashSet();
        if (llIIlIlIlIIIIlI((lllllllllllllIIlllIlIIlIlIIlllll instanceof EntityPlayer) ? 1 : 0) && llIIlIlIlIIIIll(lllllllllllllIIlllIlIIlIlIlIlIlI, lllllllllllllIIlllIlIIlIlIlIlIll.length)) {
            final String lllllllllllllIIlllIlIIlIlIlIIlIl = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIlllIlIIlIlIIlllll).getName();
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIlIlIIl.addPlayerToTeam(lllllllllllllIIlllIlIIlIlIlIIlIl, lllllllllllllIIlllIlIIlIlIlIlIII) ? 1 : 0)) {
                lllllllllllllIIlllIlIIlIlIlIIlll.add(lllllllllllllIIlllIlIIlIlIlIIlIl);
                "".length();
                "".length();
                if ((0xD ^ 0x46 ^ (0xC4 ^ 0x8B)) < "  ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIlIIlIlIlIIllI.add(lllllllllllllIIlllIlIIlIlIlIIlIl);
                "".length();
                "".length();
                if (((0x69 ^ 0x6D) & ~(0x93 ^ 0x97)) > 0) {
                    return;
                }
            }
        }
        else {
            while (!llIIlIlIlIIIlll(lllllllllllllIIlllIlIIlIlIlIlIlI, lllllllllllllIIlllIlIIlIlIlIlIll.length)) {
                final String lllllllllllllIIlllIlIIlIlIlIIlII = lllllllllllllIIlllIlIIlIlIlIlIll[lllllllllllllIIlllIlIIlIlIlIlIlI++];
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIlIIlII.startsWith(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[112]]) ? 1 : 0)) {
                    final char lllllllllllllIIlllIlIIlIlIIlIllI = (char)CommandBase.func_175763_c(lllllllllllllIIlllIlIIlIlIIlllll, lllllllllllllIIlllIlIIlIlIlIIlII).iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIlIlIIlIllI).hasNext() ? 1 : 0)) {
                        final Entity lllllllllllllIIlllIlIIlIlIlIIIll = ((Iterator<Entity>)lllllllllllllIIlllIlIIlIlIIlIllI).next();
                        final String lllllllllllllIIlllIlIIlIlIlIIIlI = CommandBase.getEntityName(lllllllllllllIIlllIlIIlIlIIlllll, lllllllllllllIIlllIlIIlIlIlIIIll.getUniqueID().toString());
                        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIlIlIIl.addPlayerToTeam(lllllllllllllIIlllIlIIlIlIlIIIlI, lllllllllllllIIlllIlIIlIlIlIlIII) ? 1 : 0)) {
                            lllllllllllllIIlllIlIIlIlIlIIlll.add(lllllllllllllIIlllIlIIlIlIlIIIlI);
                            "".length();
                            "".length();
                            if (-(37 + 123 - 100 + 101 ^ 36 + 26 - 58 + 161) >= 0) {
                                return;
                            }
                            continue;
                        }
                        else {
                            lllllllllllllIIlllIlIIlIlIlIIllI.add(lllllllllllllIIlllIlIIlIlIlIIIlI);
                            "".length();
                        }
                    }
                    "".length();
                    if (((88 + 9 - 1 + 48 ^ 91 + 73 - 106 + 70) & (137 + 39 - 33 + 18 ^ 69 + 71 + 33 + 4 ^ -" ".length())) != 0x0) {
                        return;
                    }
                    continue;
                }
                else {
                    final String lllllllllllllIIlllIlIIlIlIlIIIIl = CommandBase.getEntityName(lllllllllllllIIlllIlIIlIlIIlllll, lllllllllllllIIlllIlIIlIlIlIIlII);
                    if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIlIlIIl.addPlayerToTeam(lllllllllllllIIlllIlIIlIlIlIIIIl, lllllllllllllIIlllIlIIlIlIlIlIII) ? 1 : 0)) {
                        lllllllllllllIIlllIlIIlIlIlIIlll.add(lllllllllllllIIlllIlIIlIlIlIIIIl);
                        "".length();
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        continue;
                    }
                    else {
                        lllllllllllllIIlllIlIIlIlIlIIllI.add(lllllllllllllIIlllIlIIlIlIlIIIIl);
                        "".length();
                    }
                }
            }
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIlIlIIlll.isEmpty() ? 1 : 0)) {
            lllllllllllllIIlllIlIIlIlIIlllll.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIIlllIlIIlIlIlIIlll.size());
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[113]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIlIlIIlll.size();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIlIlIlIII;
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIlIlIIlll.toArray(new String[lllllllllllllIIlllIlIIlIlIlIIlll.size()]));
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIlIIlllll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIlIlIIllI.isEmpty() ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[114]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIlIlIIllI.size();
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIlIlIlIII;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIlIlIIllI.toArray(new String[lllllllllllllIIlllIlIIlIlIlIIllI.size()]));
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandScoreboard.lIIlIIIlIIIlII[1];
    }
    
    private static boolean llIIlIlIlIIIIII(final int lllllllllllllIIlllIlIIIIllIlllll) {
        return lllllllllllllIIlllIlIIIIllIlllll == 0;
    }
    
    private static boolean llIIlIlIlIIlIIl(final Object lllllllllllllIIlllIlIIIIlllIIIll) {
        return lllllllllllllIIlllIlIIIIlllIIIll == null;
    }
    
    private static String llIIlIIIllIllII(String lllllllllllllIIlllIlIIIlIIlIIlIl, final String lllllllllllllIIlllIlIIIlIIlIIlII) {
        lllllllllllllIIlllIlIIIlIIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlIIIlIIlIlIII = new StringBuilder();
        final char[] lllllllllllllIIlllIlIIIlIIlIIlll = lllllllllllllIIlllIlIIIlIIlIIlII.toCharArray();
        int lllllllllllllIIlllIlIIIlIIlIIllI = CommandScoreboard.lIIlIIIlIIIlII[0];
        final short lllllllllllllIIlllIlIIIlIIlIIIII = (Object)lllllllllllllIIlllIlIIIlIIlIIlIl.toCharArray();
        final Exception lllllllllllllIIlllIlIIIlIIIlllll = (Exception)lllllllllllllIIlllIlIIIlIIlIIIII.length;
        byte lllllllllllllIIlllIlIIIlIIIllllI = (byte)CommandScoreboard.lIIlIIIlIIIlII[0];
        while (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIIlIIIllllI, (int)lllllllllllllIIlllIlIIIlIIIlllll)) {
            final char lllllllllllllIIlllIlIIIlIIlIlIll = lllllllllllllIIlllIlIIIlIIlIIIII[lllllllllllllIIlllIlIIIlIIIllllI];
            lllllllllllllIIlllIlIIIlIIlIlIII.append((char)(lllllllllllllIIlllIlIIIlIIlIlIll ^ lllllllllllllIIlllIlIIIlIIlIIlll[lllllllllllllIIlllIlIIIlIIlIIllI % lllllllllllllIIlllIlIIIlIIlIIlll.length]));
            "".length();
            ++lllllllllllllIIlllIlIIIlIIlIIllI;
            ++lllllllllllllIIlllIlIIIlIIIllllI;
            "".length();
            if (((0x1A ^ 0x72 ^ (0xA2 ^ 0x99)) & (0x9D ^ 0x92 ^ (0x2F ^ 0x73) ^ -" ".length())) != ((33 + 133 - 60 + 28 ^ 81 + 148 - 70 + 30) & (0xCF ^ 0xB7 ^ (0x6 ^ 0x45) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlIIIlIIlIlIII);
    }
    
    protected void leaveTeam(final ICommandSender lllllllllllllIIlllIlIIlIlIIIlIII, final String[] lllllllllllllIIlllIlIIlIIllllIll, int lllllllllllllIIlllIlIIlIlIIIIllI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIlIIIIlIl = this.getScoreboard();
        final Set<String> lllllllllllllIIlllIlIIlIlIIIIlII = (Set<String>)Sets.newHashSet();
        final Set<String> lllllllllllllIIlllIlIIlIlIIIIIll = (Set<String>)Sets.newHashSet();
        if (llIIlIlIlIIIIlI((lllllllllllllIIlllIlIIlIlIIIlIII instanceof EntityPlayer) ? 1 : 0) && llIIlIlIlIIIIll(lllllllllllllIIlllIlIIlIlIIIIllI, lllllllllllllIIlllIlIIlIIllllIll.length)) {
            final String lllllllllllllIIlllIlIIlIlIIIIIlI = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIlllIlIIlIlIIIlIII).getName();
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIIIIlIl.removePlayerFromTeams(lllllllllllllIIlllIlIIlIlIIIIIlI) ? 1 : 0)) {
                lllllllllllllIIlllIlIIlIlIIIIlII.add(lllllllllllllIIlllIlIIlIlIIIIIlI);
                "".length();
                "".length();
                if (((0x30 ^ 0x10) & ~(0x4E ^ 0x6E)) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIlIIlIlIIIIIll.add(lllllllllllllIIlllIlIIlIlIIIIIlI);
                "".length();
                "".length();
                if (-" ".length() > ((0xA5 ^ 0x96) & ~(0x4B ^ 0x78))) {
                    return;
                }
            }
        }
        else {
            while (!llIIlIlIlIIIlll(lllllllllllllIIlllIlIIlIlIIIIllI, lllllllllllllIIlllIlIIlIIllllIll.length)) {
                final String lllllllllllllIIlllIlIIlIlIIIIIIl = lllllllllllllIIlllIlIIlIIllllIll[lllllllllllllIIlllIlIIlIlIIIIllI++];
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIIIIIIl.startsWith(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[115]]) ? 1 : 0)) {
                    final long lllllllllllllIIlllIlIIlIIlllIlII = (long)CommandBase.func_175763_c(lllllllllllllIIlllIlIIlIlIIIlIII, lllllllllllllIIlllIlIIlIlIIIIIIl).iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIlIIlllIlII).hasNext() ? 1 : 0)) {
                        final Entity lllllllllllllIIlllIlIIlIlIIIIIII = ((Iterator<Entity>)lllllllllllllIIlllIlIIlIIlllIlII).next();
                        final String lllllllllllllIIlllIlIIlIIlllllll = CommandBase.getEntityName(lllllllllllllIIlllIlIIlIlIIIlIII, lllllllllllllIIlllIlIIlIlIIIIIII.getUniqueID().toString());
                        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIIIIlIl.removePlayerFromTeams(lllllllllllllIIlllIlIIlIIlllllll) ? 1 : 0)) {
                            lllllllllllllIIlllIlIIlIlIIIIlII.add(lllllllllllllIIlllIlIIlIIlllllll);
                            "".length();
                            "".length();
                            if ((0x80 ^ 0x84) < "   ".length()) {
                                return;
                            }
                            continue;
                        }
                        else {
                            lllllllllllllIIlllIlIIlIlIIIIIll.add(lllllllllllllIIlllIlIIlIIlllllll);
                            "".length();
                        }
                    }
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    continue;
                }
                else {
                    final String lllllllllllllIIlllIlIIlIIllllllI = CommandBase.getEntityName(lllllllllllllIIlllIlIIlIlIIIlIII, lllllllllllllIIlllIlIIlIlIIIIIIl);
                    if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIlIIIIlIl.removePlayerFromTeams(lllllllllllllIIlllIlIIlIIllllllI) ? 1 : 0)) {
                        lllllllllllllIIlllIlIIlIlIIIIlII.add(lllllllllllllIIlllIlIIlIIllllllI);
                        "".length();
                        "".length();
                        if (-(139 + 80 - 157 + 83 ^ 82 + 106 - 75 + 36) >= 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        lllllllllllllIIlllIlIIlIlIIIIIll.add(lllllllllllllIIlllIlIIlIIllllllI);
                        "".length();
                    }
                }
            }
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIlIIIIlII.isEmpty() ? 1 : 0)) {
            lllllllllllllIIlllIlIIlIlIIIlIII.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIIlllIlIIlIlIIIIlII.size());
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[116]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIlIIIIlII.size();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIlIIIIlII.toArray(new String[lllllllllllllIIlllIlIIlIlIIIIlII.size()]));
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIlIIIlIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIlIIIIIll.isEmpty() ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[117]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIlIIIIIll.size();
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIlIIIIIll.toArray(new String[lllllllllllllIIlllIlIIlIlIIIIIll.size()]));
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlllIlIIllIlllIlII, final String[] lllllllllllllIIlllIlIIllIlllIIII) throws CommandException {
        if (llIIlIlIlIIIIII(this.func_175780_b(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII) ? 1 : 0)) {
            if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[2])) {
                throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[1]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
            }
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[3]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[2])) {
                    throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[4]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[5]]) ? 1 : 0)) {
                    this.listObjectives(lllllllllllllIIlllIlIIllIlllIlII);
                    "".length();
                    if ("   ".length() < ((0xEF ^ 0xC6) & ~(0x8B ^ 0xA2))) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[6]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[7]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.addObjective(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[8]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[9]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.removeObjective(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[1]]);
                    "".length();
                    if (-(0x54 ^ 0x36 ^ (0x2 ^ 0x64)) > 0) {
                        return;
                    }
                }
                else {
                    if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[10]]) ? 1 : 0)) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[11]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3]) && llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[12]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.setObjectiveDisplay(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (-(0x19 ^ 0x1C) >= 0) {
                        return;
                    }
                }
            }
            else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[13]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[2])) {
                    throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[14]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[15]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[16]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.listPlayers(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (((0x1A ^ 0x6A ^ (0x15 ^ 0x5)) & (0xE2 ^ 0xA8 ^ (0x62 ^ 0x48) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[17]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[18]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.setPlayer(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (((0x83 ^ 0x88 ^ (0x33 ^ 0x15)) & (0x3D ^ 0x5F ^ (0x44 ^ 0xB) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[19]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[20]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.setPlayer(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[21]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[22]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.setPlayer(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ((42 + 49 - 48 + 98 ^ 100 + 73 - 51 + 15) <= " ".length()) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[23]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3]) && llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[24]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.resetPlayers(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[25]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[26]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.func_175779_n(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (((0xE4 ^ 0xB8) & ~(0xC3 ^ 0x9F)) > "   ".length()) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[27]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[5]) && llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[6])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[28]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.func_175781_o(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                else {
                    if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[29]]) ? 1 : 0)) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[30]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[7])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[31]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.func_175778_p(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("   ".length() == ((0x34 ^ 0x25) & ~(0x7D ^ 0x6C))) {
                        return;
                    }
                }
            }
            else {
                if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[32]]) ? 1 : 0)) {
                    throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[33]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[2])) {
                    throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[34]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[35]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[36]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.listTeams(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[37]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[38]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.addTeam(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[39]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[40]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.removeTeam(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (((0xA ^ 0x6A) & ~(0xD2 ^ 0xB2)) == (0x90 ^ 0x94)) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[41]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[42]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.emptyTeam(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if (((118 + 59 - 54 + 39 ^ 142 + 111 - 203 + 114) & (13 + 37 + 131 + 1 ^ 139 + 76 - 180 + 141 ^ -" ".length())) != ((120 + 168 - 172 + 105 ^ 51 + 106 - 89 + 69) & (0x5C ^ 0x7C ^ (0xCF ^ 0xBB) ^ -" ".length()))) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[43]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4]) && (!llIIlIlIlIIIIll(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3]) || llIIlIlIlIIIIII((lllllllllllllIIlllIlIIllIlllIlII instanceof EntityPlayer) ? 1 : 0))) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[44]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.joinTeam(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[45]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIIl(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[3]) && llIIlIlIlIIIIII((lllllllllllllIIlllIlIIllIlllIlII instanceof EntityPlayer) ? 1 : 0)) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[46]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.leaveTeam(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                    "".length();
                    if ((0xB6 ^ 0xB2) == 0x0) {
                        return;
                    }
                }
                else {
                    if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIlllIIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[47]]) ? 1 : 0)) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[48]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[4]) && llIIlIlIlIIIlII(lllllllllllllIIlllIlIIllIlllIIII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                        throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[49]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                    }
                    this.setTeamOption(lllllllllllllIIlllIlIIllIlllIlII, lllllllllllllIIlllIlIIllIlllIIII, CommandScoreboard.lIIlIIIlIIIlII[1]);
                }
            }
        }
    }
    
    protected void removeTeam(final ICommandSender lllllllllllllIIlllIlIIlIlllIIIIl, final String[] lllllllllllllIIlllIlIIlIllIllIlI, final int lllllllllllllIIlllIlIIlIllIllIIl) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIllIllllI = this.getScoreboard();
        final ScorePlayerTeam lllllllllllllIIlllIlIIlIllIlllIl = this.getTeam(lllllllllllllIIlllIlIIlIllIllIlI[lllllllllllllIIlllIlIIlIllIllIIl]);
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIlIllIlllIl)) {
            lllllllllllllIIlllIlIIlIllIllllI.removeTeam(lllllllllllllIIlllIlIIlIllIlllIl);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[106]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllIlllIl.getRegisteredName();
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIlllIIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    protected void emptyTeam(final ICommandSender lllllllllllllIIlllIlIIlIIllIIIII, final String[] lllllllllllllIIlllIlIIlIIlIlllll, final int lllllllllllllIIlllIlIIlIIlIllllI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIIllIIlIl = this.getScoreboard();
        final ScorePlayerTeam lllllllllllllIIlllIlIIlIIllIIlII = this.getTeam(lllllllllllllIIlllIlIIlIIlIlllll[lllllllllllllIIlllIlIIlIIlIllllI]);
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIlIIllIIlII)) {
            final Collection<String> lllllllllllllIIlllIlIIlIIllIIIll = (Collection<String>)Lists.newArrayList((Iterable)lllllllllllllIIlllIlIIlIIllIIlII.getMembershipCollection());
            lllllllllllllIIlllIlIIlIIllIIIII.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIIlllIlIIlIIllIIIll.size());
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIIllIIIll.isEmpty() ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[118]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIllIIlII.getRegisteredName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            final Exception lllllllllllllIIlllIlIIlIIlIllIIl = (Exception)lllllllllllllIIlllIlIIlIIllIIIll.iterator();
            "".length();
            if ((0x6 ^ 0x2B ^ (0x99 ^ 0xB0)) < 0) {
                return;
            }
            while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIlIIlIllIIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIlllIlIIlIIllIIIlI = ((Iterator<String>)lllllllllllllIIlllIlIIlIIlIllIIl).next();
                lllllllllllllIIlllIlIIlIIllIIlIl.removePlayerFromTeam(lllllllllllllIIlllIlIIlIIllIIIlI, lllllllllllllIIlllIlIIlIIllIIlII);
            }
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[119]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIllIIIll.size();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIIllIIlII.getRegisteredName();
            CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIIllIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    protected List<String> func_175782_e() {
        final Collection<ScoreObjective> lllllllllllllIIlllIlIIIlIlIIIIll = this.getScoreboard().getScoreObjectives();
        final List<String> lllllllllllllIIlllIlIIIlIlIIIIlI = (List<String>)Lists.newArrayList();
        final double lllllllllllllIIlllIlIIIlIIllllII = (double)lllllllllllllIIlllIlIIIlIlIIIIll.iterator();
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIIlIIllllII).hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIIlllIlIIIlIlIIIIIl = ((Iterator<ScoreObjective>)lllllllllllllIIlllIlIIIlIIllllII).next();
            if (llIIlIlIlIIllll(lllllllllllllIIlllIlIIIlIlIIIIIl.getCriteria(), IScoreObjectiveCriteria.TRIGGER)) {
                lllllllllllllIIlllIlIIIlIlIIIIlI.add(lllllllllllllIIlllIlIIIlIlIIIIIl.getName());
                "".length();
            }
        }
        return lllllllllllllIIlllIlIIIlIlIIIIlI;
    }
    
    private static boolean llIIlIlIlIIIllI(final int lllllllllllllIIlllIlIIIIllIlllIl) {
        return lllllllllllllIIlllIlIIIIllIlllIl >= 0;
    }
    
    protected void removeObjective(final ICommandSender lllllllllllllIIlllIlIIlIIlIIllIl, final String lllllllllllllIIlllIlIIlIIlIIllII) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIIlIlIIII = this.getScoreboard();
        final ScoreObjective lllllllllllllIIlllIlIIlIIlIIllll = this.getObjective(lllllllllllllIIlllIlIIlIIlIIllII, (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        lllllllllllllIIlllIlIIlIIlIlIIII.removeObjective(lllllllllllllIIlllIlIIlIIlIIllll);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[120]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIlIIllII;
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIIlIIllIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    protected ScoreObjective getObjective(final String lllllllllllllIIlllIlIIllIlIIIIlI, final boolean lllllllllllllIIlllIlIIllIlIIIllI) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIllIlIIIlIl = this.getScoreboard();
        final ScoreObjective lllllllllllllIIlllIlIIllIlIIIlII = lllllllllllllIIlllIlIIllIlIIIlIl.getObjective(lllllllllllllIIlllIlIIllIlIIIIlI);
        if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIllIlIIIlII)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[54]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIlIIIIlI;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlIIIllI ? 1 : 0) && llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIllIlIIIlII.getCriteria().isReadOnly() ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[55]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIlIIIIlI;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
        }
        return lllllllllllllIIlllIlIIllIlIIIlII;
    }
    
    private static boolean llIIlIlIlIIlIll(final int lllllllllllllIIlllIlIIIIllIlIlll) {
        return lllllllllllllIIlllIlIIIIllIlIlll > 0;
    }
    
    protected void listObjectives(final ICommandSender lllllllllllllIIlllIlIIlIIlIIIIIl) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIIlIIIIII = this.getScoreboard();
        final Collection<ScoreObjective> lllllllllllllIIlllIlIIlIIIllllll = lllllllllllllIIlllIlIIlIIlIIIIII.getScoreObjectives();
        if (llIIlIlIlIIllII(lllllllllllllIIlllIlIIlIIIllllll.size())) {
            throw new CommandException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[121]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
        }
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[122]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIllllll.size();
        final ChatComponentTranslation lllllllllllllIIlllIlIIlIIIlllllI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        lllllllllllllIIlllIlIIlIIIlllllI.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
        "".length();
        lllllllllllllIIlllIlIIlIIlIIIIIl.addChatMessage(lllllllllllllIIlllIlIIlIIIlllllI);
        final long lllllllllllllIIlllIlIIlIIIllIllI = (long)lllllllllllllIIlllIlIIlIIIllllll.iterator();
        "".length();
        if (((177 + 153 - 158 + 8 ^ 24 + 88 - 24 + 67) & (0x1A ^ 0x1 ^ (0x12 ^ 0x26) ^ -" ".length())) > "  ".length()) {
            return;
        }
        while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIlIIIllIllI).hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIIlllIlIIlIIIllllIl = ((Iterator<ScoreObjective>)lllllllllllllIIlllIlIIlIIIllIllI).next();
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[123]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIIIllllIl.getName();
            lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIIIllllIl.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIlIIIllllIl.getCriteria().getName();
            lllllllllllllIIlllIlIIlIIlIIIIIl.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
        }
    }
    
    protected void func_175779_n(final ICommandSender lllllllllllllIIlllIlIIIllIlllIIl, final String[] lllllllllllllIIlllIlIIIllIllIIII, int lllllllllllllIIlllIlIIIllIllIlll) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIIllIllIllI = this.getScoreboard();
        final String lllllllllllllIIlllIlIIIllIllIlIl = CommandBase.getPlayerName(lllllllllllllIIlllIlIIIllIlllIIl, lllllllllllllIIlllIlIIIllIllIIII[lllllllllllllIIlllIlIIIllIllIlll++]);
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIllIllIlIl.length(), CommandScoreboard.lIIlIIIlIIIlII[40])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[141]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIllIlIl;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[40];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        final ScoreObjective lllllllllllllIIlllIlIIIllIllIlII = this.getObjective(lllllllllllllIIlllIlIIIllIllIIII[lllllllllllllIIlllIlIIIllIllIlll], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        if (llIIlIlIlIIllIl(lllllllllllllIIlllIlIIIllIllIlII.getCriteria(), IScoreObjectiveCriteria.TRIGGER)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[142]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIllIlII.getName();
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        final Score lllllllllllllIIlllIlIIIllIllIIll = lllllllllllllIIlllIlIIIllIllIllI.getValueFromObjective(lllllllllllllIIlllIlIIIllIllIlIl, lllllllllllllIIlllIlIIIllIllIlII);
        lllllllllllllIIlllIlIIIllIllIIll.setLocked((boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[143]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIllIlII.getName();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIllIllIlIl;
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIIllIlllIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static boolean llIIlIlIlIIlIlI(final Object lllllllllllllIIlllIlIIIIlllIlIIl) {
        return lllllllllllllIIlllIlIIIIlllIlIIl != null;
    }
    
    private static boolean llIIlIlIlIIIIll(final int lllllllllllllIIlllIlIIIlIIIIIIII, final int lllllllllllllIIlllIlIIIIllllllll) {
        return lllllllllllllIIlllIlIIIlIIIIIIII == lllllllllllllIIlllIlIIIIllllllll;
    }
    
    protected void addObjective(final ICommandSender lllllllllllllIIlllIlIIllIIlIlIII, final String[] lllllllllllllIIlllIlIIllIIlIIlll, int lllllllllllllIIlllIlIIllIIlIIllI) throws CommandException {
        final String lllllllllllllIIlllIlIIllIIlIIlIl = lllllllllllllIIlllIlIIllIIlIIlll[lllllllllllllIIlllIlIIllIIlIIllI++];
        final String lllllllllllllIIlllIlIIllIIlIIlII = lllllllllllllIIlllIlIIllIIlIIlll[lllllllllllllIIlllIlIIllIIlIIllI++];
        final Scoreboard lllllllllllllIIlllIlIIllIIlIIIll = this.getScoreboard();
        final IScoreObjectiveCriteria lllllllllllllIIlllIlIIllIIlIIIlI = IScoreObjectiveCriteria.INSTANCES.get(lllllllllllllIIlllIlIIllIIlIIlII);
        if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIllIIlIIIlI)) {
            final String lllllllllllllIlIIIIlllIllIlIlIll = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[57]];
            final Object[] lllllllllllllIlIIIIlllIllIlIllIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIlllIllIlIllIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlIIlII;
            throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll, lllllllllllllIlIIIIlllIllIlIllIl);
        }
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIllIIlIIIll.getObjective(lllllllllllllIIlllIlIIllIIlIIlIl))) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[58]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlIIlIl;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIlIIlIl.length(), CommandScoreboard.lIIlIIIlIIIlII[16])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[59]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlIIlIl;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[16];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIIlIIlIl.length())) {
            throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[60]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
        }
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIlIIlll.length, lllllllllllllIIlllIlIIllIIlIIllI)) {
            final String lllllllllllllIIlllIlIIllIIlIIIIl = CommandBase.getChatComponentFromNthArg(lllllllllllllIIlllIlIIllIIlIlIII, lllllllllllllIIlllIlIIllIIlIIlll, lllllllllllllIIlllIlIIllIIlIIllI).getUnformattedText();
            if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIlIIIIl.length(), CommandScoreboard.lIIlIIIlIIIlII[32])) {
                final String lllllllllllllIIIIlllIIIIIlIlIIII2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[61]];
                final Object[] lllllllllllllIIIIlllIIIIIlIIllII2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlIIIIl;
                lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[32];
                throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII2, lllllllllllllIIIIlllIIIIIlIIllII2);
            }
            if (llIIlIlIlIIlIll(lllllllllllllIIlllIlIIllIIlIIIIl.length())) {
                lllllllllllllIIlllIlIIllIIlIIIll.addScoreObjective(lllllllllllllIIlllIlIIllIIlIIlIl, lllllllllllllIIlllIlIIllIIlIIIlI).setDisplayName(lllllllllllllIIlllIlIIllIIlIIIIl);
                "".length();
                if ("   ".length() > (0xC7 ^ 0xC3)) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIlIIllIIlIIIll.addScoreObjective(lllllllllllllIIlllIlIIllIIlIIlIl, lllllllllllllIIlllIlIIllIIlIIIlI);
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIIlllIlIIllIIlIIIll.addScoreObjective(lllllllllllllIIlllIlIIllIIlIIlIl, lllllllllllllIIlllIlIIllIIlIIIlI);
            "".length();
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[62]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIlIIlIl;
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIllIIlIlIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static boolean llIIlIlIlIIIIIl(final int lllllllllllllIIlllIlIIIIlllllIII, final int lllllllllllllIIlllIlIIIIllllIlll) {
        return lllllllllllllIIlllIlIIIIlllllIII < lllllllllllllIIlllIlIIIIllllIlll;
    }
    
    protected List<String> func_147184_a(final boolean lllllllllllllIIlllIlIIIlIlIlIIll) {
        final Collection<ScoreObjective> lllllllllllllIIlllIlIIIlIlIlIIlI = this.getScoreboard().getScoreObjectives();
        final List<String> lllllllllllllIIlllIlIIIlIlIlIIIl = (List<String>)Lists.newArrayList();
        final float lllllllllllllIIlllIlIIIlIlIIlIlI = (float)lllllllllllllIIlllIlIIIlIlIlIIlI.iterator();
        "".length();
        if ((0x14 ^ 0x10) == 0x0) {
            return null;
        }
        while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIIlIlIIlIlI).hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIIlllIlIIIlIlIlIIII = ((Iterator<ScoreObjective>)lllllllllllllIIlllIlIIIlIlIIlIlI).next();
            if (!llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlIIll ? 1 : 0) || llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlIIII.getCriteria().isReadOnly() ? 1 : 0)) {
                lllllllllllllIIlllIlIIIlIlIlIIIl.add(lllllllllllllIIlllIlIIIlIlIlIIII.getName());
                "".length();
            }
        }
        return lllllllllllllIIlllIlIIIlIlIlIIIl;
    }
    
    protected void func_175778_p(final ICommandSender lllllllllllllIIlllIlIIIlIlllIIIl, final String[] lllllllllllllIIlllIlIIIlIlllllIl, int lllllllllllllIIlllIlIIIlIlllllII) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIIlIllllIll = this.getScoreboard();
        final String lllllllllllllIIlllIlIIIlIllllIlI = CommandBase.getEntityName(lllllllllllllIIlllIlIIIlIlllIIIl, lllllllllllllIIlllIlIIIlIlllllIl[lllllllllllllIIlllIlIIIlIlllllII++]);
        final ScoreObjective lllllllllllllIIlllIlIIIlIllllIIl = this.getObjective(lllllllllllllIIlllIlIIIlIlllllIl[lllllllllllllIIlllIlIIIlIlllllII++], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0));
        final String lllllllllllllIIlllIlIIIlIllllIII = lllllllllllllIIlllIlIIIlIlllllIl[lllllllllllllIIlllIlIIIlIlllllII++];
        final String lllllllllllllIIlllIlIIIlIlllIlll = CommandBase.getEntityName(lllllllllllllIIlllIlIIIlIlllIIIl, lllllllllllllIIlllIlIIIlIlllllIl[lllllllllllllIIlllIlIIIlIlllllII++]);
        final ScoreObjective lllllllllllllIIlllIlIIIlIlllIllI = this.getObjective(lllllllllllllIIlllIlIIIlIlllllIl[lllllllllllllIIlllIlIIIlIlllllII], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIlIllllIlI.length(), CommandScoreboard.lIIlIIIlIIIlII[40])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[151]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlIllllIlI;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[40];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIlIlllIlll.length(), CommandScoreboard.lIIlIIIlIIIlII[40])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[152]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlIlllIlll;
            lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[40];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII2, lllllllllllllIIIIlllIIIIIlIIllII2);
        }
        final Score lllllllllllllIIlllIlIIIlIlllIlIl = lllllllllllllIIlllIlIIIlIllllIll.getValueFromObjective(lllllllllllllIIlllIlIIIlIllllIlI, lllllllllllllIIlllIlIIIlIllllIIl);
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIllllIll.entityHasObjective(lllllllllllllIIlllIlIIIlIlllIlll, lllllllllllllIIlllIlIIIlIlllIllI) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[153]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlIlllIllI.getName();
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIlIlllIlll;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        final Score lllllllllllllIIlllIlIIIlIlllIlII = lllllllllllllIIlllIlIIIlIllllIll.getValueFromObjective(lllllllllllllIIlllIlIIIlIlllIlll, lllllllllllllIIlllIlIIIlIlllIllI);
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[154]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints() + lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[155]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints() - lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[156]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints() * lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
            "".length();
            if ("  ".length() <= ((0x50 ^ 0x4A ^ (0x6F ^ 0x2B)) & (148 + 176 - 258 + 140 ^ 108 + 7 - 8 + 37 ^ -" ".length()))) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[157]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints())) {
                lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints() / lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
                "".length();
                if (((159 + 112 - 269 + 174 ^ 3 + 3 + 15 + 169) & (0xE6 ^ 0x8B ^ (0xF8 ^ 0x9B) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[158]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints())) {
                lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints() % lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[159]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
            "".length();
            if ("  ".length() >= (0x71 ^ 0x75)) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[160]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(Math.min(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints(), lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints()));
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[161]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(Math.max(lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints(), lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints()));
            "".length();
            if (((0xFA ^ 0xBA ^ (0x3 ^ 0x52)) & (0x38 ^ 0x7 ^ (0x73 ^ 0x5D) ^ -" ".length())) > "   ".length()) {
                return;
            }
        }
        else {
            if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIllllIII.equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[162]]) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[163]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIlIllllIII;
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
            final int lllllllllllllIIlllIlIIIlIlllIIll = lllllllllllllIIlllIlIIIlIlllIlIl.getScorePoints();
            lllllllllllllIIlllIlIIIlIlllIlIl.setScorePoints(lllllllllllllIIlllIlIIIlIlllIlII.getScorePoints());
            lllllllllllllIIlllIlIIIlIlllIlII.setScorePoints(lllllllllllllIIlllIlIIIlIlllIIll);
        }
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIIlIlllIIIl, this, CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[164]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
    }
    
    private static String llIIlIIIllIlIll(final String lllllllllllllIIlllIlIIIlIIIlIlIl, final String lllllllllllllIIlllIlIIIlIIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIIIlIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), CommandScoreboard.lIIlIIIlIIIlII[8]), "DES");
            final Cipher lllllllllllllIIlllIlIIIlIIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIIlllIlIIIlIIIlIlll.init(CommandScoreboard.lIIlIIIlIIIlII[1], lllllllllllllIIlllIlIIIlIIIllIII);
            return new String(lllllllllllllIIlllIlIIIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIIIlIIIlIllI) {
            lllllllllllllIIlllIlIIIlIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIlllIlIIIlIIlllIII, final int lllllllllllllIIlllIlIIIlIIllIlIl) {
        int n;
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIIlllIII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[229]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIIlllIII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[230]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIIllIlIl, CommandScoreboard.lIIlIIIlIIIlII[1])) {
                    n = CommandScoreboard.lIIlIIIlIIIlII[2];
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return ((0x5F ^ 0xA ^ (0xF6 ^ 0x98)) & (212 + 19 - 83 + 107 ^ 116 + 50 - 73 + 103 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = CommandScoreboard.lIIlIIIlIIIlII[0];
                    "".length();
                    if (-(0xB2 ^ 0xB6) >= 0) {
                        return ((0x10 ^ 0x28) & ~(0xB4 ^ 0x8C)) != 0x0;
                    }
                }
            }
            else {
                n = CommandScoreboard.lIIlIIIlIIIlII[0];
                "".length();
                if ((0x65 ^ 0x60) <= 0) {
                    return ((0x6C ^ 0x57) & ~(0x11 ^ 0x2A)) != 0x0;
                }
            }
        }
        else if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIlIIlllIII.length, CommandScoreboard.lIIlIIIlIIIlII[2]) && llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIIlllIII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[231]]) ? 1 : 0)) {
            if (llIIlIlIlIIIlII(lllllllllllllIIlllIlIIIlIIllIlIl, CommandScoreboard.lIIlIIIlIIIlII[1]) && llIIlIlIlIIIlII(lllllllllllllIIlllIlIIIlIIllIlIl, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                n = CommandScoreboard.lIIlIIIlIIIlII[0];
                "".length();
                if (-" ".length() >= (0x7F ^ 0x7B)) {
                    return ((0x65 ^ 0x5) & ~(0xCE ^ 0xAE)) != 0x0;
                }
            }
            else {
                n = CommandScoreboard.lIIlIIIlIIIlII[2];
                "".length();
                if (((0xB3 ^ 0xBB ^ (0xC4 ^ 0x83)) & (9 + 132 - 139 + 207 ^ 116 + 102 - 158 + 98 ^ -" ".length())) > ((0xE2 ^ 0x88 ^ 18 + 5 + 39 + 65) & (0xD ^ 0x24 ^ (0x66 ^ 0x5A) ^ -" ".length()))) {
                    return ((72 + 72 - 34 + 74 ^ 170 + 76 - 207 + 140) & (42 + 83 + 72 + 8 ^ 185 + 82 - 257 + 188 ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIIllIlIl, CommandScoreboard.lIIlIIIlIIIlII[1])) {
            n = CommandScoreboard.lIIlIIIlIIIlII[2];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0xCA ^ 0xC1 ^ (0xD ^ 0x16)) & (93 + 141 - 212 + 134 ^ 59 + 81 - 100 + 100 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = CommandScoreboard.lIIlIIIlIIIlII[0];
        }
        return n != 0;
    }
    
    private static void llIIlIIllIIIIII() {
        (lIIIllllllllII = new String[CommandScoreboard.lIIlIIIlIIIlII[232]])[CommandScoreboard.lIIlIIIlIIIlII[0]] = llIIlIIIllIlIll("26sf4Bo8dITC9eYeVSeOkA==", "UUpCs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = llIIlIIIllIlIll("MBhxw+FW27enAxFqKR7BRVi7cJCQbIZq6UvyPZ2+3C4=", "eWGMF");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[1]] = llIIlIIIllIlIll("SqbGISP4isaK9tM6a8I0esbmJcVr9GVP2Uv/fdlq37E=", "WpQWc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[3]] = llIIlIIIllIllII("JQ8pLQA+BDUtEA==", "JmCHc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[4]] = llIIlIIIllIllIl("5Jx/1j3Kp/Lvw06XwISlebb2xLgk0CnNioxeKt2n9ljELYdHaH1VSQ==", "EEAKu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[5]] = llIIlIIIllIlIll("SQAjULh9w4o=", "ldqha");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[6]] = llIIlIIIllIllIl("wltkbZddg4Q=", "WdbhX");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[7]] = llIIlIIIllIllIl("oEw9Yrxa+VaVXyJwpTQDn414NQzEggUtLlwUFJ1yGWOLSELM44rkqq/fmA8DKnPg", "uyNAZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[8]] = llIIlIIIllIllIl("p7bOaFY5dx8=", "MECLx");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[9]] = llIIlIIIllIllIl("DXwoUy0+WC2ZLaaJ4exKAqJn/WwK3Mt0sn4sUK6WvP9v5ksC2Bg4FA4UY8p3b+vc", "CLURA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[10]] = llIIlIIIllIllII("KTwFIDgpKR0lKA==", "ZYqDQ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[11]] = llIIlIIIllIllIl("21WgsOIVQt19JG4HoZkLrHhO7xUsgRGA2J0RmoRl67uZjpzfIthWDg==", "OzUNj");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[12]] = llIIlIIIllIllII("My0aPCk+JgR/OzMtBTQqPyMFNWY/IB00KyQrATQ7fjESJSw5MQc9KSlsAiIpNyc=", "PBwQH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[13]] = llIIlIIIllIllIl("nTkjnKbjKTI=", "COQex");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[14]] = llIIlIIIllIllII("CAA1HzAFCytcIggAKhczBA4qFn8bAzkLNBkcdgciCgg9", "koXrQ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[15]] = llIIlIIIllIllIl("7tPO5DeXd4w=", "kyppn");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[16]] = llIIlIIIllIllIl("dXxsbzGLKJWB7s3LcRE2mGK8ZVtnELVnkB5sT1SO44ws17L0AcSJJw==", "wcCUB");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[17]] = llIIlIIIllIllIl("03XkXj/2usk=", "hAlMo");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[18]] = llIIlIIIllIlIll("CnBZnn1f7jx3p2BaniSXJQDM5Ya4JX5wd7+UGJuPka+xlzn0qBQltA==", "BYWoW");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[19]] = llIIlIIIllIlIll("rf2o8vfYbNQ=", "xZdui");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[20]] = llIIlIIIllIllII("FDgnBxYZMzlEBBQ4OA8VGDY4DlkHOysTEgUkZBgSGjg8D1kCJCsNEg==", "wWJjw");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[21]] = llIIlIIIllIlIll("JcMIcPZPch0=", "GfHZu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[22]] = llIIlIIIllIlIll("yqXHyQCEhu2ZLjXDabRz0LRW7maGok0Jtn4Aj6bYx8vyaVVXE48xEw==", "VrGsW");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[23]] = llIIlIIIllIllII("OQMbEB0=", "Kfhui");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[24]] = llIIlIIIllIllIl("zTxSqtWHy2mGZ47X9VTapSTRreRxUzXHpPk7iOdFTVdNXqNNiMqMBg==", "Ylocv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[25]] = llIIlIIIllIlIll("DRuTRUWDXiA=", "lPREk");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[26]] = llIIlIIIllIllII("DQMbPQoACAV+GA0DBDUJAQ0ENEUeABcpDhwfWDUFDw4aNUUbHxc3Dg==", "nlvPk");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[27]] = llIIlIIIllIlIll("kfye9qZEHZQ=", "VsEWg");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[28]] = llIIlIIIllIlIll("1N3ILbHHlhutCA6w0bpfhPn0UYkjI+P1I5cub9tcFtVM5sRef3bGlA==", "ivQHZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[29]] = llIIlIIIllIlIll("O3cAPIURwdeesLvHRttKVA==", "gEIgv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[30]] = llIIlIIIllIllIl("h6+tcx7tN2bmnMSZu9k1VOJqXreza0g1uiZ3kF2QUxw3jm5EEWsk5A==", "Roovf");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[31]] = llIIlIIIllIllII("IQkkIygsAjpgOiEJOysrLQc7KmcyCig3LDAVZyE5JxQoOiAtCGc7OiMBLA==", "BfINI");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[32]] = llIIlIIIllIllIl("ku3fNCT6csA=", "DXFKY");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[33]] = llIIlIIIllIllII("FwcMFQkaDBJWGxcHEx0KGwkTHEYBGwAfDQ==", "thaxh");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[34]] = llIIlIIIllIlIll("C1UnfwYBMkn2aSlQftk3nyNnwK2pPKCCKte52jdjbdo=", "ZQsqb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[35]] = llIIlIIIllIllIl("/uQZmTVHDZ8=", "xIZig");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[36]] = llIIlIIIllIllIl("BH4+kOqdVtxL+Dfeyc2nUDoGPNHjdFw/WsSUVd0RtPsqPDAXC6NaaA==", "fEsbu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[37]] = llIIlIIIllIllII("BQ40", "djPAJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[38]] = llIIlIIIllIllII("Aho0FScPESpWNQIaKx0kDhQrHGgVEDgVNU8UPRxoFAY4HyM=", "auYxF");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[39]] = llIIlIIIllIlIll("b/lFEScbGe8=", "LvGSx");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[40]] = llIIlIIIllIllII("FwcsGhkaDDJZCxcHMxIaGwkzE1YADSAaC1oaJBoXAg1vAgsVDyQ=", "thAwx");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[41]] = llIIlIIIllIllII("DwwiGg8=", "jaRnv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[42]] = llIIlIIIllIlIll("f+tiz6S971HT94b9Ezm8Oyw6yTpeEkYOoj6YnxiArR7wL0x6LUctsQ==", "etfvM");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[43]] = llIIlIIIllIllIl("8YwLo1tvX/Y=", "Kwkxu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[44]] = llIIlIIIllIllIl("UuiyPYyxKdnTKvq7x6Gxj5It9CyNVGCEJHHxF0DE1hkCBCO5hZvmWA==", "yTRxv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[45]] = llIIlIIIllIllIl("BwcSrzdoVjU=", "gotER");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[46]] = llIIlIIIllIllIl("tIjHA0YmRcJKt5X9pmiCD4wmllZBHLf5GDT8K4zaUzffTx2ENUuwsw==", "uVYAP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[47]] = llIIlIIIllIlIll("NvpG2BhgFg4=", "vNaGD");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[48]] = llIIlIIIllIlIll("TIcXWbVoAehfUV+JCS+M+aRDBQYskSEb54aENeTlyCg=", "ulmiy");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[49]] = llIIlIIIllIlIll("vxTu7wYmczOnGorS+Pksxyq/21/ro1tS+np2xoEaHl6XP/NX5CpOWg==", "eaIMg");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[51]] = llIIlIIIllIllII("Tg==", "dOmQe");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[52]] = llIIlIIIllIllIl("ecZgkOE1jjeVPkqYqwSEeIMbLeShvdPw96jjlQNPctZMFK7GDX5ASQ==", "nrqDC");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[53]] = llIIlIIIllIllII("BS46ATMIJSRCIQUuJQkwCSAlCHwHLTshMxIiPwkhICA+ADcC", "fAWlR");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[54]] = llIIlIIIllIllII("LAIUPzkhCQp8KywCCzc6IAwLNnYgDxM3OzsEDzcWIBk/PS0hCQ==", "OmyRX");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[55]] = llIIlIIIllIllII("NBk7GgM5EiVZETQZJBIAOBckE0w4FDwSASMfIBIwMhcyOAw7Dw==", "WvVwb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[56]] = llIIlIIIllIlIll("gXXwNze8za5wMEnvsuzuc+YfqAQLwV98wR7AsT1GdXiU7Ve5KMWQtA==", "PmaNI");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[57]] = llIIlIIIllIlIll("G2PZY6UXywmtIWffF1U0WnSdoeqfKk8ZhTQiFjYR/CNqPhOU9oC3PIAHqzpYSIQa", "AOcAa");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[58]] = llIIlIIIllIllIl("8Rs8+1Ec9SkY3IiHshthaTBfZASjcwGw2YDTsm0f0voaf6pE8gyv5R1ypB2JqKoe3xaclrunVbc=", "ZGyVC");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[59]] = llIIlIIIllIllII("CBcdIAQFHANjFggXAigHBBkCKUsEGhooBh8RBigWRRkUKUsfFx8BCgUf", "kxpMe");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[60]] = llIIlIIIllIllIl("W224CQP1vYGveBe6BEneop6oG56+PJplxnVrj3ehgB6GfyYyST1iL+6eEpu4wDfD", "ztowc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[61]] = llIIlIIIllIllII("MzkXIzg+MglgKjM5CCs7PzcIKnc/NBArOiQ/DCsqfjceKnc0Pwk+NTEvLiE2HDkUKQ==", "PVzNY");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[62]] = llIIlIIIllIlIll("Av8kG0O7t0O8ooOmam1O4y1kEehLRw1Q06e9Y1NQwp7nfjnp56aAd6sP95qMBozP", "mCVLO");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[63]] = llIIlIIIllIllII("LTYnJDQgPTlnJi02OCw3ITg4LXs6PCskJmA4Li17LzU4LDQqIA8xPD0tOQ==", "NYJIU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[64]] = llIIlIIIllIllIl("XbqjGupoiyW4PmkdroscbR5goKp9g7mkKZ1ZB6SlXJlPE8gD9NPY/g==", "vMddw");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[65]] = llIIlIIIllIlIll("NmOyJrLJ3fXY7qjmO+gML7/6aAjdh6CpklrzFukAADuYdBZ9x+uzbg==", "tcdPB");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[66]] = llIIlIIIllIllII("ABw3BjsNFylFKQAcKA44DBIoD3QXFjsGKU0SPg90BxopGzYCCg4ENS8cNAw=", "csZkZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[67]] = llIIlIIIllIllII("FRsILCAYEBZvMhUbFyQjGRUXJW8CEQQsMlgVASVvBQEGIiQFBw==", "vteAA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[68]] = llIIlIIIllIllIl("JH1OQFJwuwU=", "JOZdU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[69]] = llIIlIIIllIlIll("sVZe7STQviDBdAgaeajPvg==", "QDMYZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[70]] = llIIlIIIllIlIll("2v/szXGbnO3HkCqPAGna3riNOAZbXzul", "iSDEk");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[71]] = llIIlIIIllIllIl("k4Zl+P1ADdsmckRuRI8SwtCauxCx/VLz", "jjFfN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[72]] = llIIlIIIllIllIl("nt7RusDJq/jNwcwau5BITbe0diY8ZRaH", "WxqOj");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[73]] = llIIlIIIllIllII("JCgPIDQpIxFjJiQoECg3KCYQKXszIgMgJmkoEjk8KClMOCYmIAc=", "GGbMU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[74]] = llIIlIIIllIllII("KD8hPTo=", "KPMRH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[75]] = llIIlIIIllIllII("FRYBGxAYHR9YAhUWHhMTGRgeEl8CHA0bAlgWHAIYGRdCGB4gGAADFA==", "vylvq");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[76]] = llIIlIIIllIllIl("OC/VVTdu+KkjFIvoslZ2CA==", "whCoi");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[77]] = llIIlIIIllIllII("Ag8JHhAYDwI8DggjAi4LAgMONAcC", "qjlXb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[78]] = llIIlIIIllIllII("Bi8LDgAJKTACBwEsDwcdHDc=", "hNfkt");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[79]] = llIIlIIIllIlIll("vyEzifr+xjd+HUKio5vUvhTyeEi3yRPT", "yIxNq");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[80]] = llIIlIIIllIllII("Gh41JjcXFStlJRoeKi40FhAqL3gNFDkmJVceKD8/Fh92PiUYFj0=", "yqXKV");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[81]] = llIIlIIIllIllIl("X51MsN4jvpoWIIkBMTn++W+OS0IG/GgujB5CE16sVBAI5BhMrhtuCPFPUff2vejo", "FIwRL");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[82]] = llIIlIIIllIlIll("BgHs9iZ88mSO4jFCowjMNjr+XxAtBTiM5qOrtXcbOBzYF+ozo9b8GFf97nODBitJ", "lVGEo");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[83]] = llIIlIIIllIllII("FSsfBg==", "aYjce");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[84]] = llIIlIIIllIllII("JQ0VICo=", "ClySO");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[85]] = llIIlIIIllIllII("EgQZCBY=", "qkugd");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[86]] = llIIlIIIllIllIl("JbtV77VuxjCZkrgORdAuGjtqfkR1ZQyIKlw6GyAIFh3rjHsySp4DMetl8kvekaUM", "cIYKi");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[87]] = llIIlIIIllIllII("LBgPAwwuBh8ACzgP", "Jjffb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[88]] = llIIlIIIllIllII("GTUAIg==", "mGuGN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[89]] = llIIlIIIllIllII("EDcLGTc=", "vVgjR");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[90]] = llIIlIIIllIllII("Ex4bPAceFQV/FRMeBDQEHxAENUgEFBc8FV4eBiUPHx9YPwkmEBokAw==", "pqvQf");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[91]] = llIIlIIIllIllII("IT8HMQ==", "UMrTB");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[92]] = llIIlIIIllIlIll("/uD2sFlaWRg=", "PsrXN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[93]] = llIIlIIIllIllII("JjEBLA==", "RCtIo");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[94]] = llIIlIIIllIllII("Pj8THgEkPxg8HzQTGC4aPjMUNBY+", "MZvXs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[95]] = llIIlIIIllIllII("ITEANA==", "UCuQO");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[96]] = llIIlIIIllIlIll("7WAYKGzwj3Y=", "cqNzX");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[97]] = llIIlIIIllIllII("NgQXARc7DwlCBTYECAkUOgoICFghDhsBBXsEChgfOgVUAhkDChYZEw==", "Ukzlv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[98]] = llIIlIIIllIllII("Jyo7IA==", "SXNEA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[99]] = llIIlIIIllIlIll("87BTs9X6Mfg=", "AyQGu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[100]] = llIIlIIIllIllII("Px0jMw==", "KoVVI");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[101]] = llIIlIIIllIlIll("drNUEZ/2lX+nw8Y+JF1jPmOzTfvb5ARq", "kpUnc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[102]] = llIIlIIIllIllIl("Xk4vgKI1pY2I4KNbCPee/FJR8DLdII34HW76kSezOaiTZWTmiXbvU72eeKLeXHQO", "qAyxH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[103]] = llIIlIIIllIlIll("u4cBt5gXSD006qoD2cdHTsYHZsyi4ETT", "Fftpj");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[104]] = llIIlIIIllIllIl("QHveiywFA8VJSOcbj//29eUHT7pHQPqkdAqVVoeIOlPv6tfGV33sABYMinL0eiK6", "ZYjbc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[105]] = llIIlIIIllIllIl("4FtgkeDaBlTM5vycxoML63LvRlhWRltUv16jZOo+4B9Q21+UlfvGH2d3mAZaXJq8", "IHJCV");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[106]] = llIIlIIIllIllIl("6hrhNxPOjzsKxlGVQrFXVARV07g7hNOLRH8SnNQ2+X06KFHpU/IEvBUs2hvmTbRp", "hTDYB");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[107]] = llIIlIIIllIllIl("0sueiureaDLjFI7DJgUdYvUPElGFyVtKgsM0r5yxLe6frd1qnl5MGbUHu6oPlaVz", "WmiWn");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[108]] = llIIlIIIllIllIl("7x/LUG2MaPWal4vspA6DZ3V5C6LSKvZH1D+xRCAPSEHz16M+aEU8Egli1FRwtmwc", "KVSIy");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[109]] = llIIlIIIllIlIll("t4B6iyMofG5bT3ZkTOkKpcLIVFyh1QhbFWqOR/TbddOeZla+mHvv1Q==", "krPis");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[110]] = llIIlIIIllIlIll("U4kTt4AolSth2+O8Ep48KNKufwE7jFNyfUSJMqTUOgevUdgW+ds5ow==", "egltt");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[111]] = llIIlIIIllIllIl("F58CrzwMXHKT5rFNrSzV9X5bE9SLK8RobUZPrQBLqL6JSCdZialE2w==", "gbDob");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[112]] = llIIlIIIllIllIl("A0NZXFCjwU8=", "fiwCb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[113]] = llIIlIIIllIllII("FgEHKw0bChloHxYBGCMOGg8YIkIBCwsrH1sEBS8CWx0fJQ8QHRk=", "unjFl");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[114]] = llIIlIIIllIllII("LjspJy4jMDdkPC47Ni8tIjU2LmE5MSUnPGM+KyMhYzIlIyM4JiE=", "MTDJO");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[115]] = llIIlIIIllIllII("DA==", "Lotzj");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[116]] = llIIlIIIllIllIl("9aluasLDqSIPCIB5g+KFcg8xD5W3Y1zRhq+uUnizrM0M1I0LiKAoCQ==", "umaIa");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[117]] = llIIlIIIllIlIll("QpAXHMhI75i/sIztLOeA3BLRSV7xVGxJly22/nQiu9OCMe/6fBtfUQ==", "TYPjA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[118]] = llIIlIIIllIllIl("Va1fAazfUTljyEHUeo+4bf/PImFcIBV7a4DLyb3TmnT6STolcglDwEU4yo7ClL+1", "FzMVb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[119]] = llIIlIIIllIllIl("DJWsYS/SYRClrgT+nuDC3LdoTBiJ5QMtKR3yfzXWNJnNczVuLEcGOQ==", "uKPKe");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[120]] = llIIlIIIllIllIl("MyBGgvDtTUVn+dbJebvKRj2lr6Fy4/buzNGxn0fVUCPXEyD5etEhb30q5JoLh6WR", "gtRXH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[121]] = llIIlIIIllIllII("CCIBAjcFKR9BJQgiHgo0BCweC3gELwYKNR8kGgolRSEFHCJFKAEfIhI=", "kMloV");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[122]] = llIIlIIIllIllII("LwkgGQIiAj5aEC8JPxEBIwc/EE0jBCcRADgPOxEQYgokBxdiBSIBDTg=", "LfMtc");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[123]] = llIIlIIIllIllIl("tsmyQ5UD6RSd6y2ojjU0n39l1frk7Z1RnOYgIZV7ZlroDNn+N5w6cWJcHZXigXmW", "ASDaj");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[124]] = llIIlIIIllIllII("DRc1BTIAHCtGIA0XKg0xARkqDH0BGjINMBoRLg0gQAs9HDcHCygEMhdWMQYlDxQxDAACFyw=", "nxXhS");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[125]] = llIIlIIIllIlIll("YetHd/gCoduMc/Pg/GiblPbkfg9GN5Ju/4PiTGZHyrRNyEeHzPhQylw0ETWfEyiuuU2nTDoPAts=", "pVNVZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[126]] = llIIlIIIllIllIl("rCbHfr54cqeXbeYSnrPxUN2HcUXyPVrLPHsl4qZ0k4ELfpAN7mtDgmf4kwb8EiYvgrOuA5kDU9RD+L0iTnrlfQ==", "ZCnHD");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[127]] = llIIlIIIllIlIll("hJwZSc+rjYA/yky0Y7HdlcyWbPAXlBwuxswI2kF06NPeDfQ9d1nfvFcHq8T+97hf", "QNMZU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[128]] = llIIlIIIllIllII("NgwiOQM7Bzx6ETYMPTEAOgI9MEwlDy4tBycQYTgLJhdhJA40GiomTDYMOjoW", "UcOTb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[129]] = llIIlIIIllIllIl("nzZmFNeEoNKbUo8IJkykq5wFgL7HEyZEagdpMRMEdAN+sbKxC3JWvjChrd4sIe9L", "QPacP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[130]] = llIIlIIIllIllII("DAEXCAUBCglLFwwBCAAGAA8IAUofAhscAR0dVAkNHBpUAAkfGgM=", "onzed");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[131]] = llIIlIIIllIlIll("VyC5MgOdFUg393o58mbSmH6nTLEZhQdeV7DPPmhQvP7gqdNJU/p/Sg==", "jBGrs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[132]] = llIIlIIIllIlIll("/Q5+XlR2nBtqDvqALmHG2CBc9G9su2eqz5TdqTVZaeNNlDd+tpSRVNJ5FcQeWchI", "kvGfP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[133]] = llIIlIIIllIllII("IQ4H", "RksMs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[134]] = llIIlIIIllIllII("KzkBOQMmMh96ESs5HjEAJzceMEw4Og0tBzolQicHPHgYNQUFPx85Azw1BA==", "HVlTb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[135]] = llIIlIIIllIllIl("ziv7+poxHp6AYgoSP2g1F4zSJ/dx4QK9nwnUXzc0gobT5j0GFsiL/ojvqvuXCREb", "yNbXu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[136]] = llIIlIIIllIllIl("R0bneBj5pvo=", "tzqPw");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[137]] = llIIlIIIllIlIll("+usa30ReGfQ=", "MqUbJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[138]] = llIIlIIIllIllII("DwQnKCgCDzlrOg8EOCArAwo4IWccBys8LB4YZDYsGEU5MCoPDjk2", "lkJEI");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[139]] = llIIlIIIllIllII("DR0gPwUAFj58Fw0dPzcGARM/NkoeHiwrARwBYyABHRc5IQcBACh8FxsRLjcXHQ==", "nrMRd");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[140]] = llIIlIIIllIlIll("frEfuKmlX6CD1tuq2KU16z2tUuLHIyb07bcgATLilsnuUUpgb1SYw6rqWBQ5XbrH", "gkEvF");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[141]] = llIIlIIIllIlIll("t6qM/3Jlavwr6NoG00k3A2SxyufDuYzhCbsqG8D3JZFkiZUMf3MJUAhKupaSGUm+", "biHkL");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[142]] = llIIlIIIllIllII("ASoEFwQMIRpUFgEqGx8HDSQbHksSKQgDABA2Rx8LAycFH0sMKj0IDAUiDAg=", "bEize");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[143]] = llIIlIIIllIlIll("4fmg/xp2iatzrv+Un7i2AY9Luc0Q4dNQhZLHWv5RqcXFLE22paeatA9Emv/hOpJX", "SzjbE");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[144]] = llIIlIIIllIllIl("D+16cgYzJ5ouEKC/odoFpBkFfJtf/SWJuNq01pImxeYkUgSFrTNgITqAZS3I7+Ca", "yHCDK");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[145]] = llIIlIIIllIlIll("RjdsbIytWtNzY0S0uC4pysxfktZHt97muNsx8WO5XEFtqWkFkIau5p6SWZadku9Y", "cekKU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[146]] = llIIlIIIllIlIll("NYpMklCAMmg=", "SvUBv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[147]] = llIIlIIIllIllII("QA==", "jEIOJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[149]] = llIIlIIIllIlIll("ICDbHyhatBz9MNFTPu9Ru3XS/EX+OZHBaxedLyZoA2NwAmwxmSoFbqqxNT2W6xm2", "YgOoL");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[150]] = llIIlIIIllIllII("BgcCOxgLDBx4CgYHHTMbCgkdMlcVBA4vHBcbQSIcFhxBMBgMBAoy", "ehoVy");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[151]] = llIIlIIIllIlIll("0Q8UU2WHBwRrnxf/+xPVvdiEWmSLUQKaJVVTOJL5ONdhcv9hIjKnvBt3vv6wpGbL", "eEunq");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[152]] = llIIlIIIllIllIl("8J5pMWmEspu4Iq+aD2uqJF2Una5ekUsBFHIoGycAGagIrgiJZbFPmBACi821dpBf", "WvbnN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[153]] = llIIlIIIllIllIl("DXRB2dqmyXoStlwd2uT/VxAzqvEaWdsqIb2DNYDFMNYtBXSiME+xINpGDgwMniCc", "qvamk");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[154]] = llIIlIIIllIllIl("tZJjBgX/34s=", "OBwaq");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[155]] = llIIlIIIllIllIl("c2nnb40IX8o=", "Peynp");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[156]] = llIIlIIIllIlIll("IE694De3DxM=", "EgXpZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[157]] = llIIlIIIllIllII("R3Y=", "hKwjf");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[158]] = llIIlIIIllIllIl("xS9S0pM1pnU=", "jRqDa");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[159]] = llIIlIIIllIlIll("fuSJwfEJBDM=", "tzACo");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[160]] = llIIlIIIllIlIll("orpAbN0PvDw=", "ihLGv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[161]] = llIIlIIIllIllII("Sw==", "uXhFN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[162]] = llIIlIIIllIllII("b1g=", "QdQhs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[163]] = llIIlIIIllIllIl("aa8oGtXEFHo8DBLJLHYvOBE5qSrKaAeDXnqU7arC4qHeyD3iSTle+pcslhapWmPumMF7tTp4FSY=", "CpZvx");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[164]] = llIIlIIIllIllII("NiU1GyQ7LitYNjYlKhMnOisqEmslJjkPICc5dhk1MDg5Aiw6JHYFMDYpPQU2", "UJXvE");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[165]] = llIIlIIIllIllIl("a45xFiojULh6+N0tODIA2A==", "BLrLl");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[166]] = llIIlIIIllIllIl("CN5PFMdBKl0=", "ZxZIt");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[167]] = llIIlIIIllIllIl("uqkTFM8imjA=", "qcNXe");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[168]] = llIIlIIIllIllIl("/jIJSzj2r7+YxSH5A3svEw==", "FBtpT");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[169]] = llIIlIIIllIllII("CC47DQ==", "dGHyJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[170]] = llIIlIIIllIllII("OAUg", "YaDAJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[171]] = llIIlIIIllIllII("IiM3OzE1", "PFZTG");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[172]] = llIIlIIIllIllII("BQ4zDhoFGysLCg==", "vkGjs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[173]] = llIIlIIIllIllIl("3RV9HPCYWT4=", "qkFhD");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[174]] = llIIlIIIllIllIl("43m01Ned27A=", "nSRAf");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[175]] = llIIlIIIllIllIl("+Ma8m6wZ0fNVsu0DTnppow==", "OKUSd");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[176]] = llIIlIIIllIllIl("3rh3E7qfWcs=", "kkKcE");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[177]] = llIIlIIIllIllIl("rMYtcnoWjtg=", "YbUTS");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[178]] = llIIlIIIllIlIll("I/Q36uskeGc=", "PRpym");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[179]] = llIIlIIIllIllIl("aT2fpCq56vA=", "KNXCv");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[180]] = llIIlIIIllIllIl("7nmwj0EUfQQ=", "bBVPA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[181]] = llIIlIIIllIlIll("39n/QDxa878=", "QzdgV");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[182]] = llIIlIIIllIllII("FCsjCCYU", "qEBjJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[183]] = llIIlIIIllIllII("NwknDQ==", "ClTyS");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[184]] = llIIlIIIllIlIll("HWQ5W6GDpBBdPLiiA/49Qg==", "hnrAX");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[185]] = llIIlIIIllIllII("JC4A", "WKtFh");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[186]] = llIIlIIIllIllII("ECEe", "qEzuo");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[187]] = llIIlIIIllIllII("Bh00HyYR", "txYpP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[188]] = llIIlIIIllIlIll("LoGS3Kl3xaQ=", "JQAeP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[189]] = llIIlIIIllIlIll("PQZMOssNNns=", "HYuia");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[190]] = llIIlIIIllIllII("Hzk2Fg==", "sPEbX");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[191]] = llIIlIIIllIlIll("jDJqFNSreRI=", "yTRZA");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[192]] = llIIlIIIllIllII("PB42NTEnBzwp", "SnSGP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[193]] = llIIlIIIllIllIl("QFSGbCC6OJc=", "mnlWG");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[194]] = llIIlIIIllIllIl("Rr16cFIYMDQ=", "GZMXH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[195]] = llIIlIIIllIlIll("31VaQzf2dhQ=", "CjVbP");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[196]] = llIIlIIIllIllIl("a6YfYWalV6k=", "pRsrl");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[197]] = llIIlIIIllIllIl("7iKKyQe72CY=", "HHhZy");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[198]] = llIIlIIIllIllIl("qorte2/ayzc=", "lriHZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[199]] = llIIlIIIllIllII("bA==", "PmCwb");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[200]] = llIIlIIIllIlIll("0OCUWBG2HUI=", "YZfgD");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[201]] = llIIlIIIllIlIll("BOHSf2CJCDk=", "byegu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[202]] = llIIlIIIllIllIl("Axr4PRHYKLc=", "nRumh");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[203]] = llIIlIIIllIlIll("vTYvdAI0eh4=", "WRooe");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[204]] = llIIlIIIllIllIl("NBPYvy+oXTk=", "DHUCJ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[205]] = llIIlIIIllIlIll("ItMsgzDAEz0=", "ivryU");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[206]] = llIIlIIIllIllII("BBYtPA==", "nyDRZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[207]] = llIIlIIIllIlIll("OenKPTH6+yE=", "wrPej");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[208]] = llIIlIIIllIllIl("aPQwPv0jHfQ=", "bTaLd");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[209]] = llIIlIIIllIlIll("xLCkDUtZ+9Y=", "kxgwL");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[210]] = llIIlIIIllIllIl("QaRlauKBq+0=", "NnFod");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[211]] = llIIlIIIllIlIll("jX+H9uwQvNQ=", "OpEsM");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[212]] = llIIlIIIllIlIll("myTiiM4x6pA=", "ZEghd");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[213]] = llIIlIIIllIlIll("sSk6/qzYRVY=", "SDoOT");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[214]] = llIIlIIIllIllIl("YpxtEAMSFRQ=", "GPlNK");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[215]] = llIIlIIIllIlIll("eYT7jINxGcU=", "PcqYu");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[216]] = llIIlIIIllIllII("GQkADSEY", "vytdN");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[217]] = llIIlIIIllIllIl("PjzdSO+MDr0=", "zITyr");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[218]] = llIIlIIIllIllIl("7x35H7DSyFVQJWhc+6aiqw==", "LFpox");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[219]] = llIIlIIIllIlIll("jlFfmJJixPY9szq756crM1XhBEnjp74i", "vDfmV");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[220]] = llIIlIIIllIlIll("qKBK2y20r8nzENnT3GTllAE932b1rad1", "vGpzZ");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[221]] = llIIlIIIllIllII("IigyGCULKCAfLCEoBQU+Ly86ACQyNA==", "FMSlM");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[222]] = llIIlIIIllIllII("JDUEJgo=", "GZhIx");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[223]] = llIIlIIIllIllIl("SJJZXcBFFoBq81HV358g0bQ2QCEXVgB+", "bYDgH");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[224]] = llIIlIIIllIllIl("8wFX0iZ/I56hkmW3MasZGtU7kK91lDBi", "eemOp");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[225]] = llIIlIIIllIllII("BxwKIxQFAhogExML", "ancFz");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[226]] = llIIlIIIllIlIll("TiMkBF4EQA9gQElblCpnKqlP0QuBe0kE", "pzwUi");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[227]] = llIIlIIIllIlIll("AcfLHx1PrOQ=", "BtMKt");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[228]] = llIIlIIIllIllII("LyQ4PSY=", "IETNC");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[229]] = llIIlIIIllIlIll("+m7wntc3m/A=", "kyiKk");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[230]] = llIIlIIIllIllIl("ZOHtqHO+mFI=", "WvaQs");
        CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[231]] = llIIlIIIllIllII("BSgAPRYeMQoh", "jXeOw");
    }
    
    protected void func_175781_o(final ICommandSender lllllllllllllIIlllIlIIIllIIlllll, final String[] lllllllllllllIIlllIlIIIllIIllllI, int lllllllllllllIIlllIlIIIllIIlIIll) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIIllIIlllII = this.getScoreboard();
        final String lllllllllllllIIlllIlIIIllIIllIll = CommandBase.getEntityName(lllllllllllllIIlllIlIIIllIIlllll, lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll++]);
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIllIIllIll.length(), CommandScoreboard.lIIlIIIlIIIlII[40])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[144]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIIllIll;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[40];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        final ScoreObjective lllllllllllllIIlllIlIIIllIIllIlI = this.getObjective(lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll++], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0));
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIllIIlllII.entityHasObjective(lllllllllllllIIlllIlIIIllIIllIll, lllllllllllllIIlllIlIIIllIIllIlI) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[145]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIIllIlI.getName();
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIllIIllIll;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        int int1;
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll].equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[146]]) ? 1 : 0)) {
            int1 = Integer.MIN_VALUE;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            int1 = CommandBase.parseInt(lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll]);
        }
        final int lllllllllllllIIlllIlIIIllIIllIIl = int1;
        int int2;
        if (llIIlIlIlIIIIIl(++lllllllllllllIIlllIlIIIllIIlIIll, lllllllllllllIIlllIlIIIllIIllllI.length) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll].equals(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[147]]) ? 1 : 0)) {
            int2 = CommandBase.parseInt(lllllllllllllIIlllIlIIIllIIllllI[lllllllllllllIIlllIlIIIllIIlIIll], lllllllllllllIIlllIlIIIllIIllIIl);
            "".length();
            if ((0x96 ^ 0x92) < ((0xA6 ^ 0xAF) & ~(0x12 ^ 0x1B))) {
                return;
            }
        }
        else {
            int2 = CommandScoreboard.lIIlIIIlIIIlII[148];
        }
        final int lllllllllllllIIlllIlIIIllIIllIII = int2;
        final Score lllllllllllllIIlllIlIIIllIIlIlll = lllllllllllllIIlllIlIIIllIIlllII.getValueFromObjective(lllllllllllllIIlllIlIIIllIIllIll, lllllllllllllIIlllIlIIIllIIllIlI);
        if (!llIIlIlIlIIIlll(lllllllllllllIIlllIlIIIllIIlIlll.getScorePoints(), lllllllllllllIIlllIlIIIllIIllIIl) || !llIIlIlIlIIlllI(lllllllllllllIIlllIlIIIllIIlIlll.getScorePoints(), lllllllllllllIIlllIlIIIllIIllIII)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[150]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIIlIlll.getScorePoints();
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIllIIllIIl;
            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIIllIIllIII;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[149]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllIIlIlll.getScorePoints();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIllIIllIIl;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIIllIIllIII;
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIIllIIlllll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (((0xA ^ 0x65 ^ (0x63 ^ 0x5F)) & (128 + 177 - 267 + 178 ^ 70 + 91 - 37 + 15 ^ -" ".length())) < 0) {
            return;
        }
    }
    
    protected Scoreboard getScoreboard() {
        return MinecraftServer.getServer().worldServerForDimension(CommandScoreboard.lIIlIIIlIIIlII[0]).getScoreboard();
    }
    
    protected void setTeamOption(final ICommandSender lllllllllllllIIlllIlIIlIlllIllll, final String[] lllllllllllllIIlllIlIIlIlllIlllI, int lllllllllllllIIlllIlIIlIllllIlll) throws CommandException {
        final ScorePlayerTeam lllllllllllllIIlllIlIIlIllllIllI = this.getTeam(lllllllllllllIIlllIlIIlIlllIlllI[lllllllllllllIIlllIlIIlIllllIlll++]);
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIlIllllIllI)) {
            final String lllllllllllllIIlllIlIIlIllllIlIl = lllllllllllllIIlllIlIIlIlllIlllI[lllllllllllllIIlllIlIIlIllllIlll++].toLowerCase();
            if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[68]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[69]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[70]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[71]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[72]]) ? 1 : 0)) {
                throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[73]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
            }
            if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIlIlllIlllI.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[74]]) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIlllIllIlIlIll = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[75]];
                    final Object[] lllllllllllllIlIIIIlllIllIlIllIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                    lllllllllllllIlIIIIlllIllIlIllIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                    lllllllllllllIlIIIIlllIllIlIllIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceStringFromCollection(EnumChatFormatting.getValidValues((boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0), (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                    throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll, lllllllllllllIlIIIIlllIllIlIllIl);
                }
                if (!llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[76]]) ? 1 : 0) || !llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[77]]) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIlllIllIlIlIll2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[82]];
                    final Object[] lllllllllllllIlIIIIlllIllIlIllIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                    lllllllllllllIlIIIIlllIllIlIllIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                    final int n = CommandScoreboard.lIIlIIIlIIIlII[2];
                    final String[] a = new String[CommandScoreboard.lIIlIIIlIIIlII[1]];
                    a[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[83]];
                    a[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[84]];
                    lllllllllllllIlIIIIlllIllIlIllIl2[n] = CommandBase.joinNiceStringFromCollection(Arrays.asList(a));
                    throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll2, lllllllllllllIlIIIIlllIllIlIllIl2);
                }
                if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[78]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[79]]) ? 1 : 0)) {
                    throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[80]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                final String lllllllllllllIlIIIIlllIllIlIlIll3 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[81]];
                final Object[] lllllllllllllIlIIIIlllIllIlIllIl3 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                lllllllllllllIlIIIIlllIllIlIllIl3[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                lllllllllllllIlIIIIlllIllIlIllIl3[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceString(Team.EnumVisible.func_178825_a());
                throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll3, lllllllllllllIlIIIIlllIllIlIllIl3);
            }
            else {
                final String lllllllllllllIIlllIlIIlIllllIlII = lllllllllllllIIlllIlIIlIlllIlllI[lllllllllllllIIlllIlIIlIllllIlll];
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[85]]) ? 1 : 0)) {
                    final EnumChatFormatting lllllllllllllIIlllIlIIlIllllIIll = EnumChatFormatting.getValueByName(lllllllllllllIIlllIlIIlIllllIlII);
                    if (!llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIlIllllIIll) || llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIIll.isFancyStyling() ? 1 : 0)) {
                        final String lllllllllllllIlIIIIlllIllIlIlIll4 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[86]];
                        final Object[] lllllllllllllIlIIIIlllIllIlIllIl4 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        lllllllllllllIlIIIIlllIllIlIllIl4[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                        lllllllllllllIlIIIIlllIllIlIllIl4[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceStringFromCollection(EnumChatFormatting.getValidValues((boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0), (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                        throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll4, lllllllllllllIlIIIIlllIllIlIllIl4);
                    }
                    lllllllllllllIIlllIlIIlIllllIllI.setChatFormat(lllllllllllllIIlllIlIIlIllllIIll);
                    lllllllllllllIIlllIlIIlIllllIllI.setNamePrefix(lllllllllllllIIlllIlIIlIllllIIll.toString());
                    lllllllllllllIIlllIlIIlIllllIllI.setNameSuffix(EnumChatFormatting.RESET.toString());
                    "".length();
                    if (((0x25 ^ 0x70) & ~(0x63 ^ 0x36)) != 0x0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[87]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[88]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[89]]) ? 1 : 0)) {
                        final String lllllllllllllIlIIIIlllIllIlIlIll5 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[90]];
                        final Object[] lllllllllllllIlIIIIlllIllIlIllIl5 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        lllllllllllllIlIIIIlllIllIlIllIl5[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                        final int n2 = CommandScoreboard.lIIlIIIlIIIlII[2];
                        final String[] a2 = new String[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        a2[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[91]];
                        a2[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[92]];
                        lllllllllllllIlIIIIlllIllIlIllIl5[n2] = CommandBase.joinNiceStringFromCollection(Arrays.asList(a2));
                        throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll5, lllllllllllllIlIIIIlllIllIlIllIl5);
                    }
                    lllllllllllllIIlllIlIIlIllllIllI.setAllowFriendlyFire(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[93]]));
                    "".length();
                    if ((0x9D ^ 0x99) <= 0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[94]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[95]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[96]]) ? 1 : 0)) {
                        final String lllllllllllllIlIIIIlllIllIlIlIll6 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[97]];
                        final Object[] lllllllllllllIlIIIIlllIllIlIllIl6 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        lllllllllllllIlIIIIlllIllIlIllIl6[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                        final int n3 = CommandScoreboard.lIIlIIIlIIIlII[2];
                        final String[] a3 = new String[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        a3[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[98]];
                        a3[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[99]];
                        lllllllllllllIlIIIIlllIllIlIllIl6[n3] = CommandBase.joinNiceStringFromCollection(Arrays.asList(a3));
                        throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll6, lllllllllllllIlIIIIlllIllIlIllIl6);
                    }
                    lllllllllllllIIlllIlIIlIllllIllI.setSeeFriendlyInvisiblesEnabled(lllllllllllllIIlllIlIIlIllllIlII.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[100]]));
                    "".length();
                    if (((0x8 ^ 0x57 ^ (0x97 ^ 0x8F)) & (0x4A ^ 0x2C ^ (0xE1 ^ 0xC0) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[101]]) ? 1 : 0)) {
                    final Team.EnumVisible lllllllllllllIIlllIlIIlIllllIIlI = Team.EnumVisible.func_178824_a(lllllllllllllIIlllIlIIlIllllIlII);
                    if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIlIllllIIlI)) {
                        final String lllllllllllllIlIIIIlllIllIlIlIll7 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[102]];
                        final Object[] lllllllllllllIlIIIIlllIllIlIllIl7 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        lllllllllllllIlIIIIlllIllIlIllIl7[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                        lllllllllllllIlIIIIlllIllIlIllIl7[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceString(Team.EnumVisible.func_178825_a());
                        throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll7, lllllllllllllIlIIIIlllIllIlIllIl7);
                    }
                    lllllllllllllIIlllIlIIlIllllIllI.setNameTagVisibility(lllllllllllllIIlllIlIIlIllllIIlI);
                    "".length();
                    if ((0x2A ^ 0x11 ^ (0xFB ^ 0xC4)) <= "   ".length()) {
                        return;
                    }
                }
                else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIlIllllIlIl.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[103]]) ? 1 : 0)) {
                    final Team.EnumVisible lllllllllllllIIlllIlIIlIllllIIIl = Team.EnumVisible.func_178824_a(lllllllllllllIIlllIlIIlIllllIlII);
                    if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIlIllllIIIl)) {
                        final String lllllllllllllIlIIIIlllIllIlIlIll8 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[104]];
                        final Object[] lllllllllllllIlIIIIlllIllIlIllIl8 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                        lllllllllllllIlIIIIlllIllIlIllIl8[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                        lllllllllllllIlIIIIlllIllIlIllIl8[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandBase.joinNiceString(Team.EnumVisible.func_178825_a());
                        throw new WrongUsageException(lllllllllllllIlIIIIlllIllIlIlIll8, lllllllllllllIlIIIIlllIllIlIllIl8);
                    }
                    lllllllllllllIIlllIlIIlIllllIllI.setDeathMessageVisibility(lllllllllllllIIlllIlIIlIllllIIIl);
                }
                final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[105]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllllIlIl;
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIllllIllI.getRegisteredName();
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIlIllllIlII;
                CommandBase.notifyOperators(lllllllllllllIIlllIlIIlIlllIllll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            }
        }
    }
    
    private static boolean llIIlIlIlIIllll(final Object lllllllllllllIIlllIlIIIIlllIIllI, final Object lllllllllllllIIlllIlIIIIlllIIlIl) {
        return lllllllllllllIIlllIlIIIIlllIIllI == lllllllllllllIIlllIlIIIIlllIIlIl;
    }
    
    private static boolean llIIlIlIlIIIlll(final int lllllllllllllIIlllIlIIIIllllllII, final int lllllllllllllIIlllIlIIIIlllllIll) {
        return lllllllllllllIIlllIlIIIIllllllII >= lllllllllllllIIlllIlIIIIlllllIll;
    }
    
    @Override
    public String getCommandName() {
        return CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[0]];
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlllIlIIIlIllIIIIl, final String[] lllllllllllllIIlllIlIIIlIlIlllII, final BlockPos lllllllllllllIIlllIlIIIlIlIlllll) {
        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandScoreboard.lIIlIIIlIIIlII[3]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[165]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[166]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[167]];
            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII);
        }
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[168]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[1])) {
                final String[] lllllllllllllIIIIlIlllIIIllIllII2 = new String[CommandScoreboard.lIIlIIIlIIIlII[4]];
                lllllllllllllIIIIlIlllIIIllIllII2[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[169]];
                lllllllllllllIIIIlIlllIIIllIllII2[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[170]];
                lllllllllllllIIIIlIlllIIIllIllII2[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[171]];
                lllllllllllllIIIIlIlllIIIllIllII2[CommandScoreboard.lIIlIIIlIIIlII[3]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[172]];
                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII2);
            }
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[173]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                    final Set<String> lllllllllllllIIlllIlIIIlIlIllllI = IScoreObjectiveCriteria.INSTANCES.keySet();
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIlllIlIIIlIlIllllI);
                }
            }
            else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[174]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                }
            }
            else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[175]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, Scoreboard.getDisplaySlotStrings());
                }
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                }
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[176]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[1])) {
                final String[] lllllllllllllIIIIlIlllIIIllIllII3 = new String[CommandScoreboard.lIIlIIIlIIIlII[8]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[177]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[178]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[179]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[3]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[180]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[4]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[181]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[5]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[182]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[6]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[183]];
                lllllllllllllIIIIlIlllIIIllIllII3[CommandScoreboard.lIIlIIIlIIIlII[7]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[184]];
                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII3);
            }
            if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[185]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[186]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[187]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[188]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[189]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, MinecraftServer.getServer().getAllUsernames());
                    }
                    if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_175782_e());
                    }
                }
                else if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[190]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[191]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[192]]) ? 1 : 0)) {
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.getScoreboard().getObjectiveNames());
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0)));
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                            final String[] lllllllllllllIIIIlIlllIIIllIllII4 = new String[CommandScoreboard.lIIlIIIlIIIlII[9]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[193]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[194]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[195]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[3]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[196]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[4]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[197]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[5]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[198]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[6]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[199]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[7]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[200]];
                            lllllllllllllIIIIlIlllIIIllIllII4[CommandScoreboard.lIIlIIIlIIIlII[8]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[201]];
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII4);
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[6])) {
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, MinecraftServer.getServer().getAllUsernames());
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[7])) {
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                        }
                    }
                }
                else {
                    if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.getScoreboard().getObjectiveNames());
                    }
                    if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4]) && llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[202]]) ? 1 : 0)) {
                        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                    }
                }
            }
            else {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, MinecraftServer.getServer().getAllUsernames());
                }
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.func_147184_a((boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0)));
                }
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[0]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[203]]) ? 1 : 0)) {
            if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[1])) {
                final String[] lllllllllllllIIIIlIlllIIIllIllII5 = new String[CommandScoreboard.lIIlIIIlIIIlII[7]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[204]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[205]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[206]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[3]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[207]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[4]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[208]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[5]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[209]];
                lllllllllllllIIIIlIlllIIIllIllII5[CommandScoreboard.lIIlIIIlIIIlII[6]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[210]];
                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII5);
            }
            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[211]]) ? 1 : 0)) {
                if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.getScoreboard().getTeamNames());
                }
                if (llIIlIlIlIIIlll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, MinecraftServer.getServer().getAllUsernames());
                }
            }
            else {
                if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[212]]) ? 1 : 0)) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, MinecraftServer.getServer().getAllUsernames());
                }
                if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[213]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[214]]) ? 1 : 0) && llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[215]]) ? 1 : 0)) {
                    if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[2]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[216]]) ? 1 : 0)) {
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.getScoreboard().getTeamNames());
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[4])) {
                            final String[] lllllllllllllIIIIlIlllIIIllIllII6 = new String[CommandScoreboard.lIIlIIIlIIIlII[5]];
                            lllllllllllllIIIIlIlllIIIllIllII6[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[217]];
                            lllllllllllllIIIIlIlllIIIllIllII6[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[218]];
                            lllllllllllllIIIIlIlllIIIllIllII6[CommandScoreboard.lIIlIIIlIIIlII[1]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[219]];
                            lllllllllllllIIIIlIlllIIIllIllII6[CommandScoreboard.lIIlIIIlIIIlII[3]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[220]];
                            lllllllllllllIIIIlIlllIIIllIllII6[CommandScoreboard.lIIlIIIlIIIlII[4]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[221]];
                            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII6);
                        }
                        if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[5])) {
                            if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[3]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[222]]) ? 1 : 0)) {
                                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, EnumChatFormatting.getValidValues((boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0), (boolean)(CommandScoreboard.lIIlIIIlIIIlII[0] != 0)));
                            }
                            if (!llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[3]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[223]]) ? 1 : 0) || llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[3]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[224]]) ? 1 : 0)) {
                                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, Team.EnumVisible.func_178825_a());
                            }
                            if (!llIIlIlIlIIIIII(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[3]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[225]]) ? 1 : 0) || llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIlIlIlllII[CommandScoreboard.lIIlIIIlIIIlII[3]].equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[226]]) ? 1 : 0)) {
                                final String[] lllllllllllllIIIIlIlllIIIllIllII7 = new String[CommandScoreboard.lIIlIIIlIIIlII[1]];
                                lllllllllllllIIIIlIlllIIIllIllII7[CommandScoreboard.lIIlIIIlIIIlII[0]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[227]];
                                lllllllllllllIIIIlIlllIIIllIllII7[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[228]];
                                return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, lllllllllllllIIIIlIlllIIIllIllII7);
                            }
                        }
                    }
                }
                else if (llIIlIlIlIIIIll(lllllllllllllIIlllIlIIIlIlIlllII.length, CommandScoreboard.lIIlIIIlIIIlII[3])) {
                    return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlllIlIIIlIlIlllII, this.getScoreboard().getTeamNames());
                }
            }
        }
        return null;
    }
    
    protected void addTeam(final ICommandSender lllllllllllllIIlllIlIIllIIIIlIII, final String[] lllllllllllllIIlllIlIIllIIIIIlll, int lllllllllllllIIlllIlIIllIIIIIllI) throws CommandException {
        final String lllllllllllllIIlllIlIIllIIIIllII = lllllllllllllIIlllIlIIllIIIIIlll[lllllllllllllIIlllIlIIllIIIIIllI++];
        final Scoreboard lllllllllllllIIlllIlIIllIIIIlIll = this.getScoreboard();
        if (llIIlIlIlIIlIlI(lllllllllllllIIlllIlIIllIIIIlIll.getTeam(lllllllllllllIIlllIlIIllIIIIllII))) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[63]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIIIllII;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIIIllII.length(), CommandScoreboard.lIIlIIIlIIIlII[16])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[64]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIIIllII;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[16];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIIIIllII.length())) {
            throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[65]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
        }
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIIIIlll.length, lllllllllllllIIlllIlIIllIIIIIllI)) {
            final String lllllllllllllIIlllIlIIllIIIIlIlI = CommandBase.getChatComponentFromNthArg(lllllllllllllIIlllIlIIllIIIIlIII, lllllllllllllIIlllIlIIllIIIIIlll, lllllllllllllIIlllIlIIllIIIIIllI).getUnformattedText();
            if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIllIIIIlIlI.length(), CommandScoreboard.lIIlIIIlIIIlII[32])) {
                final String lllllllllllllIIIIlllIIIIIlIlIIII2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[66]];
                final Object[] lllllllllllllIIIIlllIIIIIlIIllII2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
                lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIIIlIlI;
                lllllllllllllIIIIlllIIIIIlIIllII2[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[32];
                throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII2, lllllllllllllIIIIlllIIIIIlIIllII2);
            }
            if (llIIlIlIlIIlIll(lllllllllllllIIlllIlIIllIIIIlIlI.length())) {
                lllllllllllllIIlllIlIIllIIIIlIll.createTeam(lllllllllllllIIlllIlIIllIIIIllII).setTeamName(lllllllllllllIIlllIlIIllIIIIlIlI);
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIlIIllIIIIlIll.createTeam(lllllllllllllIIlllIlIIllIIIIllII);
                "".length();
                "".length();
                if (((0xA0 ^ 0x97 ^ (0x2D ^ 0x78)) & (136 + 140 - 165 + 112 ^ 183 + 36 - 35 + 5 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIIlllIlIIllIIIIlIll.createTeam(lllllllllllllIIlllIlIIllIIIIllII);
            "".length();
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[67]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIllIIIIllII;
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIllIIIIlIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    protected void setPlayer(final ICommandSender lllllllllllllIIlllIlIIIllllIIIlI, final String[] lllllllllllllIIlllIlIIIlllllIIII, int lllllllllllllIIlllIlIIIllllIIIII) throws CommandException {
        final String lllllllllllllIIlllIlIIIllllIlllI = lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIIIII - CommandScoreboard.lIIlIIIlIIIlII[2]];
        final int lllllllllllllIIlllIlIIIllllIllIl = lllllllllllllIIlllIlIIIllllIIIII;
        final String lllllllllllllIIlllIlIIIllllIllII = CommandBase.getEntityName(lllllllllllllIIlllIlIIIllllIIIlI, lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIIIII++]);
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIllllIllII.length(), CommandScoreboard.lIIlIIIlIIIlII[40])) {
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[132]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllllIllII;
            lllllllllllllIIIIlllIIIIIlIIllII[CommandScoreboard.lIIlIIIlIIIlII[2]] = CommandScoreboard.lIIlIIIlIIIlII[40];
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
        final ScoreObjective lllllllllllllIIlllIlIIIllllIlIll = this.getObjective(lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIIIII++], (boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0));
        int n;
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIllllIlllI.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[133]]) ? 1 : 0)) {
            n = CommandBase.parseInt(lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIIIII++]);
            "".length();
            if (-(0xAC ^ 0xA9) >= 0) {
                return;
            }
        }
        else {
            n = CommandBase.parseInt(lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIIIII++], CommandScoreboard.lIIlIIIlIIIlII[0]);
        }
        final int lllllllllllllIIlllIlIIIllllIlIlI = n;
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIIlllllIIII.length, lllllllllllllIIlllIlIIIllllIIIII)) {
            final Entity lllllllllllllIIlllIlIIIllllIlIIl = CommandBase.func_175768_b(lllllllllllllIIlllIlIIIllllIIIlI, lllllllllllllIIlllIlIIIlllllIIII[lllllllllllllIIlllIlIIIllllIllIl]);
            try {
                final NBTTagCompound lllllllllllllIIlllIlIIIllllIlIII = JsonToNBT.getTagFromJson(CommandBase.buildString(lllllllllllllIIlllIlIIIlllllIIII, lllllllllllllIIlllIlIIIllllIIIII));
                final NBTTagCompound lllllllllllllIIlllIlIIIllllIIlll = new NBTTagCompound();
                lllllllllllllIIlllIlIIIllllIlIIl.writeToNBT(lllllllllllllIIlllIlIIIllllIIlll);
                if (llIIlIlIlIIIIII(NBTUtil.func_181123_a(lllllllllllllIIlllIlIIIllllIlIII, lllllllllllllIIlllIlIIIllllIIlll, (boolean)(CommandScoreboard.lIIlIIIlIIIlII[2] != 0)) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[134]];
                    final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                    lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllllIllII;
                    throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
                }
            }
            catch (NBTException lllllllllllllIIlllIlIIIllllIIllI) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[135]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllllIIllI.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
        }
        final Scoreboard lllllllllllllIIlllIlIIIllllIIlIl = this.getScoreboard();
        final Score lllllllllllllIIlllIlIIIllllIIlII = lllllllllllllIIlllIlIIIllllIIlIl.getValueFromObjective(lllllllllllllIIlllIlIIIllllIllII, lllllllllllllIIlllIlIIIllllIlIll);
        if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIllllIlllI.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[136]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIllllIIlII.setScorePoints(lllllllllllllIIlllIlIIIllllIlIlI);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (llIIlIlIlIIIIlI(lllllllllllllIIlllIlIIIllllIlllI.equalsIgnoreCase(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[137]]) ? 1 : 0)) {
            lllllllllllllIIlllIlIIIllllIIlII.increseScore(lllllllllllllIIlllIlIIIllllIlIlI);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlllIlIIIllllIIlII.decreaseScore(lllllllllllllIIlllIlIIIllllIlIlI);
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[138]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIIllllIlIll.getName();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIIllllIllII;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIIllllIIlII.getScorePoints();
        CommandBase.notifyOperators(lllllllllllllIIlllIlIIIllllIIIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlllIlIIllIllllIIl) {
        return CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[2]];
    }
    
    private static boolean llIIlIlIlIIllII(final int lllllllllllllIIlllIlIIIIllIllIIl) {
        return lllllllllllllIIlllIlIIIIllIllIIl <= 0;
    }
    
    private static void llIIlIlIIllllll() {
        (lIIlIIIlIIIlII = new int[233])[0] = ((0xEE ^ 0x96 ^ (0x69 ^ 0x2E)) & (0x75 ^ 0x21 ^ (0xC2 ^ 0xA9) ^ -" ".length()));
        CommandScoreboard.lIIlIIIlIIIlII[1] = "  ".length();
        CommandScoreboard.lIIlIIIlIIIlII[2] = " ".length();
        CommandScoreboard.lIIlIIIlIIIlII[3] = "   ".length();
        CommandScoreboard.lIIlIIIlIIIlII[4] = (0xBB ^ 0xBF);
        CommandScoreboard.lIIlIIIlIIIlII[5] = (151 + 132 - 210 + 99 ^ 89 + 155 - 98 + 23);
        CommandScoreboard.lIIlIIIlIIIlII[6] = (97 + 14 + 41 + 9 ^ 29 + 6 - 7 + 139);
        CommandScoreboard.lIIlIIIlIIIlII[7] = (29 + 13 - 31 + 169 ^ 9 + 170 - 17 + 17);
        CommandScoreboard.lIIlIIIlIIIlII[8] = (0x77 ^ 0x7F);
        CommandScoreboard.lIIlIIIlIIIlII[9] = (0x7D ^ 0x74);
        CommandScoreboard.lIIlIIIlIIIlII[10] = (39 + 113 - 63 + 58 ^ 102 + 149 - 129 + 31);
        CommandScoreboard.lIIlIIIlIIIlII[11] = (0x0 ^ 0xB);
        CommandScoreboard.lIIlIIIlIIIlII[12] = (0xA4 ^ 0xC6 ^ (0x48 ^ 0x26));
        CommandScoreboard.lIIlIIIlIIIlII[13] = (44 + 39 - 75 + 123 ^ 17 + 39 - 42 + 128);
        CommandScoreboard.lIIlIIIlIIIlII[14] = (0xCD ^ 0xC3);
        CommandScoreboard.lIIlIIIlIIIlII[15] = (0x77 ^ 0xD ^ (0x7F ^ 0xA));
        CommandScoreboard.lIIlIIIlIIIlII[16] = (0x8 ^ 0x18);
        CommandScoreboard.lIIlIIIlIIIlII[17] = (143 + 149 - 212 + 83 ^ 138 + 68 - 87 + 59);
        CommandScoreboard.lIIlIIIlIIIlII[18] = (0x70 ^ 0x13 ^ (0x7F ^ 0xE));
        CommandScoreboard.lIIlIIIlIIIlII[19] = (21 + 75 + 7 + 32 ^ 88 + 56 - 71 + 75);
        CommandScoreboard.lIIlIIIlIIIlII[20] = (135 + 61 - 130 + 84 ^ 62 + 33 + 16 + 19);
        CommandScoreboard.lIIlIIIlIIIlII[21] = (0x26 ^ 0x33);
        CommandScoreboard.lIIlIIIlIIIlII[22] = (0x4E ^ 0x58);
        CommandScoreboard.lIIlIIIlIIIlII[23] = (0x2D ^ 0x3A);
        CommandScoreboard.lIIlIIIlIIIlII[24] = (138 + 82 - 58 + 19 ^ 107 + 72 - 152 + 146);
        CommandScoreboard.lIIlIIIlIIIlII[25] = (79 + 129 - 83 + 27 ^ 52 + 120 - 158 + 115);
        CommandScoreboard.lIIlIIIlIIIlII[26] = (0x34 ^ 0x78 ^ (0x8 ^ 0x5E));
        CommandScoreboard.lIIlIIIlIIIlII[27] = (0xF1 ^ 0xA0 ^ (0xF4 ^ 0xBE));
        CommandScoreboard.lIIlIIIlIIIlII[28] = (0x90 ^ 0x8C);
        CommandScoreboard.lIIlIIIlIIIlII[29] = (124 + 4 - 66 + 66 ^ 110 + 6 - 25 + 66);
        CommandScoreboard.lIIlIIIlIIIlII[30] = (0x52 ^ 0x4C);
        CommandScoreboard.lIIlIIIlIIIlII[31] = (101 + 92 - 149 + 101 ^ 93 + 83 - 160 + 126);
        CommandScoreboard.lIIlIIIlIIIlII[32] = (" ".length() ^ (0x24 ^ 0x5));
        CommandScoreboard.lIIlIIIlIIIlII[33] = (0x71 ^ 0x7B ^ (0x4 ^ 0x2F));
        CommandScoreboard.lIIlIIIlIIIlII[34] = (46 + 13 + 69 + 43 ^ 122 + 81 - 146 + 80);
        CommandScoreboard.lIIlIIIlIIIlII[35] = (89 + 135 - 95 + 26 ^ 170 + 152 - 195 + 57);
        CommandScoreboard.lIIlIIIlIIIlII[36] = (0xA4 ^ 0x80);
        CommandScoreboard.lIIlIIIlIIIlII[37] = (0x2E ^ 0xB);
        CommandScoreboard.lIIlIIIlIIIlII[38] = (0x1E ^ 0x38);
        CommandScoreboard.lIIlIIIlIIIlII[39] = (0x35 ^ 0x12);
        CommandScoreboard.lIIlIIIlIIIlII[40] = (0xB2 ^ 0x9A);
        CommandScoreboard.lIIlIIIlIIIlII[41] = (97 + 154 - 92 + 78 ^ 64 + 156 - 154 + 130);
        CommandScoreboard.lIIlIIIlIIIlII[42] = (0xB5 ^ 0x9F);
        CommandScoreboard.lIIlIIIlIIIlII[43] = (132 + 0 + 20 + 2 ^ 73 + 112 - 88 + 80);
        CommandScoreboard.lIIlIIIlIIIlII[44] = (0x8C ^ 0xA0);
        CommandScoreboard.lIIlIIIlIIIlII[45] = (0x67 ^ 0x4A);
        CommandScoreboard.lIIlIIIlIIIlII[46] = (0x11 ^ 0x3F);
        CommandScoreboard.lIIlIIIlIIIlII[47] = (45 + 163 - 131 + 114 ^ 142 + 39 - 154 + 117);
        CommandScoreboard.lIIlIIIlIIIlII[48] = (0x68 ^ 0x58);
        CommandScoreboard.lIIlIIIlIIIlII[49] = (0x54 ^ 0x65);
        CommandScoreboard.lIIlIIIlIIIlII[50] = -" ".length();
        CommandScoreboard.lIIlIIIlIIIlII[51] = (69 + 135 - 195 + 139 ^ 75 + 93 - 139 + 137);
        CommandScoreboard.lIIlIIIlIIIlII[52] = (56 + 54 + 17 + 21 ^ 83 + 82 - 108 + 110);
        CommandScoreboard.lIIlIIIlIIIlII[53] = (0x1E ^ 0x2A);
        CommandScoreboard.lIIlIIIlIIIlII[54] = (0xA ^ 0x3F);
        CommandScoreboard.lIIlIIIlIIIlII[55] = (0xE7 ^ 0x95 ^ (0x60 ^ 0x24));
        CommandScoreboard.lIIlIIIlIIIlII[56] = (0x5D ^ 0x9 ^ (0xFE ^ 0x9D));
        CommandScoreboard.lIIlIIIlIIIlII[57] = (0xA2 ^ 0x87 ^ (0x97 ^ 0x8A));
        CommandScoreboard.lIIlIIIlIIIlII[58] = (0x5D ^ 0x64);
        CommandScoreboard.lIIlIIIlIIIlII[59] = (0x60 ^ 0x5A);
        CommandScoreboard.lIIlIIIlIIIlII[60] = (0xB6 ^ 0x8D);
        CommandScoreboard.lIIlIIIlIIIlII[61] = (7 + 165 + 7 + 3 ^ 3 + 36 - 26 + 125);
        CommandScoreboard.lIIlIIIlIIIlII[62] = (0x7B ^ 0x36 ^ (0x2E ^ 0x5E));
        CommandScoreboard.lIIlIIIlIIIlII[63] = (0x22 ^ 0x1C);
        CommandScoreboard.lIIlIIIlIIIlII[64] = (46 + 34 - 22 + 79 ^ 21 + 14 + 52 + 95);
        CommandScoreboard.lIIlIIIlIIIlII[65] = (0xF5 ^ 0xB5);
        CommandScoreboard.lIIlIIIlIIIlII[66] = (0x8B ^ 0xB7 ^ (0xCD ^ 0xB0));
        CommandScoreboard.lIIlIIIlIIIlII[67] = (169 + 126 - 262 + 184 ^ 118 + 45 - 55 + 47);
        CommandScoreboard.lIIlIIIlIIIlII[68] = (0x37 ^ 0x2F ^ (0x8 ^ 0x53));
        CommandScoreboard.lIIlIIIlIIIlII[69] = (0x9 ^ 0x42 ^ (0x5 ^ 0xA));
        CommandScoreboard.lIIlIIIlIIIlII[70] = (0x17 ^ 0x52);
        CommandScoreboard.lIIlIIIlIIIlII[71] = (0x45 ^ 0x3);
        CommandScoreboard.lIIlIIIlIIIlII[72] = (0x7E ^ 0x39);
        CommandScoreboard.lIIlIIIlIIIlII[73] = (0xA ^ 0x20 ^ (0x0 ^ 0x62));
        CommandScoreboard.lIIlIIIlIIIlII[74] = (152 + 152 - 117 + 16 ^ 8 + 105 - 51 + 68);
        CommandScoreboard.lIIlIIIlIIIlII[75] = (0x8A ^ 0xC0);
        CommandScoreboard.lIIlIIIlIIIlII[76] = (194 + 108 - 164 + 113 ^ 53 + 131 - 35 + 27);
        CommandScoreboard.lIIlIIIlIIIlII[77] = (0x65 ^ 0x29);
        CommandScoreboard.lIIlIIIlIIIlII[78] = (0xC5 ^ 0x88);
        CommandScoreboard.lIIlIIIlIIIlII[79] = (0x3D ^ 0x73);
        CommandScoreboard.lIIlIIIlIIIlII[80] = (129 + 115 - 136 + 35 ^ 110 + 44 - 89 + 127);
        CommandScoreboard.lIIlIIIlIIIlII[81] = (0x6E ^ 0x3E);
        CommandScoreboard.lIIlIIIlIIIlII[82] = (0x37 ^ 0xD ^ (0x46 ^ 0x2D));
        CommandScoreboard.lIIlIIIlIIIlII[83] = (0xED ^ 0xBF);
        CommandScoreboard.lIIlIIIlIIIlII[84] = (0xE9 ^ 0xBA);
        CommandScoreboard.lIIlIIIlIIIlII[85] = (0x97 ^ 0xC3);
        CommandScoreboard.lIIlIIIlIIIlII[86] = (0xE5 ^ 0xB0);
        CommandScoreboard.lIIlIIIlIIIlII[87] = (0xDB ^ 0x8D);
        CommandScoreboard.lIIlIIIlIIIlII[88] = (106 + 89 - 88 + 143 ^ 147 + 109 - 161 + 78);
        CommandScoreboard.lIIlIIIlIIIlII[89] = (180 + 55 - 115 + 111 ^ 12 + 123 - 25 + 81);
        CommandScoreboard.lIIlIIIlIIIlII[90] = (0xD1 ^ 0x88);
        CommandScoreboard.lIIlIIIlIIIlII[91] = (0x5C ^ 0x6);
        CommandScoreboard.lIIlIIIlIIIlII[92] = (0x1B ^ 0x47 ^ (0x7D ^ 0x7A));
        CommandScoreboard.lIIlIIIlIIIlII[93] = (0x97 ^ 0x83 ^ (0x79 ^ 0x31));
        CommandScoreboard.lIIlIIIlIIIlII[94] = (0x1C ^ 0x41);
        CommandScoreboard.lIIlIIIlIIIlII[95] = (0x32 ^ 0x4C ^ (0x8E ^ 0xAE));
        CommandScoreboard.lIIlIIIlIIIlII[96] = (0x36 ^ 0x69);
        CommandScoreboard.lIIlIIIlIIIlII[97] = (73 + 189 - 87 + 30 ^ 99 + 21 - 65 + 118);
        CommandScoreboard.lIIlIIIlIIIlII[98] = (0x51 ^ 0x30);
        CommandScoreboard.lIIlIIIlIIIlII[99] = (0x27 ^ 0x2B ^ (0x47 ^ 0x29));
        CommandScoreboard.lIIlIIIlIIIlII[100] = (0x44 ^ 0x27);
        CommandScoreboard.lIIlIIIlIIIlII[101] = (0xBE ^ 0xB4 ^ (0xAD ^ 0xC3));
        CommandScoreboard.lIIlIIIlIIIlII[102] = (94 + 121 - 140 + 122 ^ 88 + 131 - 149 + 90);
        CommandScoreboard.lIIlIIIlIIIlII[103] = (0x78 ^ 0xF ^ (0xD7 ^ 0xC6));
        CommandScoreboard.lIIlIIIlIIIlII[104] = (72 + 0 - 60 + 216 ^ 28 + 130 - 131 + 104);
        CommandScoreboard.lIIlIIIlIIIlII[105] = (0x4F ^ 0x27);
        CommandScoreboard.lIIlIIIlIIIlII[106] = (173 + 78 - 187 + 136 ^ 136 + 132 - 215 + 108);
        CommandScoreboard.lIIlIIIlIIIlII[107] = (0x74 ^ 0x1E);
        CommandScoreboard.lIIlIIIlIIIlII[108] = (152 + 64 - 135 + 124 ^ 60 + 151 - 131 + 86);
        CommandScoreboard.lIIlIIIlIIIlII[109] = (0x64 ^ 0x52 ^ (0x6D ^ 0x37));
        CommandScoreboard.lIIlIIIlIIIlII[110] = (70 + 180 - 249 + 192 ^ 114 + 11 - 111 + 158);
        CommandScoreboard.lIIlIIIlIIIlII[111] = (0xFC ^ 0x92);
        CommandScoreboard.lIIlIIIlIIIlII[112] = (0x3D ^ 0x52);
        CommandScoreboard.lIIlIIIlIIIlII[113] = (0xB1 ^ 0xAD ^ (0xFE ^ 0x92));
        CommandScoreboard.lIIlIIIlIIIlII[114] = (0xB0 ^ 0xC1);
        CommandScoreboard.lIIlIIIlIIIlII[115] = (0x1D ^ 0x6F);
        CommandScoreboard.lIIlIIIlIIIlII[116] = (0x3F ^ 0x4C);
        CommandScoreboard.lIIlIIIlIIIlII[117] = (0x24 ^ 0x50);
        CommandScoreboard.lIIlIIIlIIIlII[118] = (0x6B ^ 0x1E);
        CommandScoreboard.lIIlIIIlIIIlII[119] = (0x71 ^ 0x53 ^ (0xEA ^ 0xBE));
        CommandScoreboard.lIIlIIIlIIIlII[120] = (0x68 ^ 0x1F);
        CommandScoreboard.lIIlIIIlIIIlII[121] = (0x55 ^ 0x48 ^ (0x7E ^ 0x1B));
        CommandScoreboard.lIIlIIIlIIIlII[122] = (0x67 ^ 0x1E);
        CommandScoreboard.lIIlIIIlIIIlII[123] = (0x69 ^ 0x13);
        CommandScoreboard.lIIlIIIlIIIlII[124] = (0xEF ^ 0x94);
        CommandScoreboard.lIIlIIIlIIIlII[125] = (0x77 ^ 0xB);
        CommandScoreboard.lIIlIIIlIIIlII[126] = (0xEA ^ 0x97);
        CommandScoreboard.lIIlIIIlIIIlII[127] = (0x65 ^ 0x1B);
        CommandScoreboard.lIIlIIIlIIIlII[128] = (0xB6 ^ 0xAA) + (0x7D ^ 0x38) - (0x1D ^ 0x10) + (0xAB ^ 0x80);
        CommandScoreboard.lIIlIIIlIIIlII[129] = 37 + 39 + 2 + 50;
        CommandScoreboard.lIIlIIIlIIIlII[130] = 127 + 128 - 223 + 97;
        CommandScoreboard.lIIlIIIlIIIlII[131] = (0x10 ^ 0x3F) + (0x7A ^ 0x4A) - -(0x60 ^ 0x6E) + (0xD7 ^ 0xC2);
        CommandScoreboard.lIIlIIIlIIIlII[132] = (0x24 ^ 0x5F) + (0x4D ^ 0x41) - (0x2C ^ 0x4B) + (0xA1 ^ 0xC2);
        CommandScoreboard.lIIlIIIlIIIlII[133] = 60 + 38 - 86 + 120;
        CommandScoreboard.lIIlIIIlIIIlII[134] = 79 + 42 - 115 + 127;
        CommandScoreboard.lIIlIIIlIIIlII[135] = (0x3A ^ 0x3F) + (0xEE ^ 0x9C) - -"   ".length() + (0xD ^ 0x1);
        CommandScoreboard.lIIlIIIlIIIlII[136] = (0x9E ^ 0x8F) + (0xA7 ^ 0x85) - -(0x2A ^ 0x3A) + (0x14 ^ 0x50);
        CommandScoreboard.lIIlIIIlIIIlII[137] = 64 + 121 - 142 + 93;
        CommandScoreboard.lIIlIIIlIIIlII[138] = (0x36 ^ 0x53) + (0xE0 ^ 0x84) - (35 + 169 - 187 + 155) + (0x6F ^ 0x3);
        CommandScoreboard.lIIlIIIlIIIlII[139] = (0x60 ^ 0x3B) + (0x27 ^ 0x31) - (0x7A ^ 0x2B) + (0x5D ^ 0x37);
        CommandScoreboard.lIIlIIIlIIIlII[140] = (0x7F ^ 0x66) + (81 + 113 - 98 + 34) - (0x6C ^ 0x20) + (0xA7 ^ 0x9B);
        CommandScoreboard.lIIlIIIlIIIlII[141] = 135 + 98 - 175 + 82;
        CommandScoreboard.lIIlIIIlIIIlII[142] = 69 + 74 - 21 + 19;
        CommandScoreboard.lIIlIIIlIIIlII[143] = (0xAD ^ 0xB1) + (0x2E ^ 0x6C) - (0xCE ^ 0x94) + (125 + 107 - 181 + 87);
        CommandScoreboard.lIIlIIIlIIIlII[144] = 2 + 86 + 39 + 16;
        CommandScoreboard.lIIlIIIlIIIlII[145] = (0xB4 ^ 0x91) + (0x93 ^ 0xC0) - "  ".length() + (0x29 ^ 0x33);
        CommandScoreboard.lIIlIIIlIIIlII[146] = 111 + 70 - 124 + 88;
        CommandScoreboard.lIIlIIIlIIIlII[147] = 90 + 74 - 137 + 119;
        CommandScoreboard.lIIlIIIlIIIlII[148] = (-1 & Integer.MAX_VALUE);
        CommandScoreboard.lIIlIIIlIIIlII[149] = 81 + 32 - 100 + 134;
        CommandScoreboard.lIIlIIIlIIIlII[150] = (0x8 ^ 0x50) + (0xCD ^ 0xBF) - (0x59 ^ 0x1E) + (0x76 ^ 0x67);
        CommandScoreboard.lIIlIIIlIIIlII[151] = 45 + 5 + 61 + 38;
        CommandScoreboard.lIIlIIIlIIIlII[152] = 135 + 59 - 57 + 13;
        CommandScoreboard.lIIlIIIlIIIlII[153] = 150 + 24 - 141 + 118;
        CommandScoreboard.lIIlIIIlIIIlII[154] = 112 + 27 - 100 + 113;
        CommandScoreboard.lIIlIIIlIIIlII[155] = 80 + 152 - 166 + 87;
        CommandScoreboard.lIIlIIIlIIIlII[156] = (0xAE ^ 0xAA) + (67 + 36 - 6 + 33) - (0x72 ^ 0x2F) + (0x16 ^ 0x67);
        CommandScoreboard.lIIlIIIlIIIlII[157] = (0x87 ^ 0xB5) + (0xAD ^ 0xAB) - -(0x9 ^ 0x25) + (0xA0 ^ 0x97);
        CommandScoreboard.lIIlIIIlIIIlII[158] = 48 + 46 + 52 + 10;
        CommandScoreboard.lIIlIIIlIIIlII[159] = 99 + 88 - 70 + 13 + (0x86 ^ 0xA9) - (24 + 106 - 17 + 56) + (43 + 19 + 24 + 63);
        CommandScoreboard.lIIlIIIlIIIlII[160] = (0xED ^ 0x96) + (0x71 ^ 0x3A) - (17 + 158 - 92 + 97) + (139 + 71 - 128 + 58);
        CommandScoreboard.lIIlIIIlIIIlII[161] = (0x34 ^ 0x7C) + (0x13 ^ 0x70) - (131 + 19 - 7 + 9) + (19 + 130 - 64 + 55);
        CommandScoreboard.lIIlIIIlIIIlII[162] = 97 + 5 - 63 + 115 + (0x2D ^ 0x17) - (159 + 80 - 92 + 15) + (0x39 ^ 0x57);
        CommandScoreboard.lIIlIIIlIIIlII[163] = 158 + 65 - 140 + 78;
        CommandScoreboard.lIIlIIIlIIIlII[164] = 80 + 110 - 172 + 144;
        CommandScoreboard.lIIlIIIlIIIlII[165] = (0xD4 ^ 0x91) + (5 + 119 - 25 + 54) - (105 + 57 - 56 + 50) + (0xE1 ^ 0x80);
        CommandScoreboard.lIIlIIIlIIIlII[166] = 29 + 137 - 159 + 152 + (48 + 47 + 10 + 52) - (25 + 131 + 20 + 18) + (0x65 ^ 0x4F);
        CommandScoreboard.lIIlIIIlIIIlII[167] = 76 + 107 - 177 + 159;
        CommandScoreboard.lIIlIIIlIIIlII[168] = 22 + 39 + 47 + 58;
        CommandScoreboard.lIIlIIIlIIIlII[169] = (0x6A ^ 0x8) + (0x87 ^ 0xA9) - (30 + 104 - 26 + 23) + (62 + 43 + 21 + 28);
        CommandScoreboard.lIIlIIIlIIIlII[170] = (0xF5 ^ 0x92) + (0xA2 ^ 0xC2) - (83 + 124 - 81 + 19) + (0x57 ^ 0x25);
        CommandScoreboard.lIIlIIIlIIIlII[171] = 136 + 146 - 135 + 22;
        CommandScoreboard.lIIlIIIlIIIlII[172] = 22 + 35 + 78 + 35;
        CommandScoreboard.lIIlIIIlIIIlII[173] = ((0x53 ^ 0x7E) & ~(0x4 ^ 0x29)) + (0x91 ^ 0x9A) - -(0x3C ^ 0x1) + (0xD1 ^ 0xB2);
        CommandScoreboard.lIIlIIIlIIIlII[174] = 77 + 71 - 141 + 165;
        CommandScoreboard.lIIlIIIlIIIlII[175] = (0xBD ^ 0x9A) + (0xA4 ^ 0x9B) - (0x14 ^ 0x1) + (0x77 ^ 0x2B);
        CommandScoreboard.lIIlIIIlIIIlII[176] = 64 + 110 - 17 + 0 + (0x8D ^ 0x84) - (0x3D ^ 0x1D) + (0xB3 ^ 0x9B);
        CommandScoreboard.lIIlIIIlIIIlII[177] = (0x2B ^ 0x14) + (0x1B ^ 0x69) - (0x4C ^ 0x6A) + (0x8F ^ 0xAB);
        CommandScoreboard.lIIlIIIlIIIlII[178] = 162 + 103 - 146 + 57;
        CommandScoreboard.lIIlIIIlIIIlII[179] = 48 + 8 - 16 + 137;
        CommandScoreboard.lIIlIIIlIIIlII[180] = (0x5A ^ 0x63) + (0x4D ^ 0xC) - (0xA6 ^ 0xBD) + (0x3C ^ 0x6F);
        CommandScoreboard.lIIlIIIlIIIlII[181] = 60 + 15 + 12 + 46 + (0x56 ^ 0x2) - (0x2B ^ 0x13) + (0xB4 ^ 0xA6);
        CommandScoreboard.lIIlIIIlIIIlII[182] = 79 + 117 - 111 + 95;
        CommandScoreboard.lIIlIIIlIIIlII[183] = 47 + 124 - 64 + 57 + (0x9E ^ 0xAC) - (0x4E ^ 0x14) + (0xA6 ^ 0x9F);
        CommandScoreboard.lIIlIIIlIIIlII[184] = 57 + 110 - 128 + 143;
        CommandScoreboard.lIIlIIIlIIIlII[185] = (0x8D ^ 0x97) + (167 + 115 - 161 + 52) - (114 + 20 - 48 + 46) + (0xCB ^ 0xBF);
        CommandScoreboard.lIIlIIIlIIIlII[186] = 44 + 143 - 30 + 27;
        CommandScoreboard.lIIlIIIlIIIlII[187] = (0xF7 ^ 0xB0) + (105 + 59 - 2 + 4) - (36 + 31 - 31 + 108) + (0xD8 ^ 0x84);
        CommandScoreboard.lIIlIIIlIIIlII[188] = 98 + 53 + 3 + 32;
        CommandScoreboard.lIIlIIIlIIIlII[189] = 113 + 38 - 105 + 141;
        CommandScoreboard.lIIlIIIlIIIlII[190] = (0xCB ^ 0x8F) + (0x21 ^ 0x73) - (0x6F ^ 0x4) + (111 + 24 - 116 + 126);
        CommandScoreboard.lIIlIIIlIIIlII[191] = 13 + 62 + 113 + 1;
        CommandScoreboard.lIIlIIIlIIIlII[192] = 11 + 124 - 31 + 86;
        CommandScoreboard.lIIlIIIlIIIlII[193] = 19 + 39 + 123 + 10;
        CommandScoreboard.lIIlIIIlIIIlII[194] = (0x71 ^ 0x2E) + (0x52 ^ 0x56) - -(0x63 ^ 0x2F) + (0xB4 ^ 0xA5);
        CommandScoreboard.lIIlIIIlIIIlII[195] = 98 + 43 + 14 + 16 + (0x67 ^ 0x79) - (0x71 ^ 0x41) + (0x74 ^ 0x5C);
        CommandScoreboard.lIIlIIIlIIIlII[196] = (0x63 ^ 0xE) + (0xAA ^ 0x99) - (0x13 ^ 0x1F) + (0xA1 ^ 0x8F);
        CommandScoreboard.lIIlIIIlIIIlII[197] = 169 + 183 - 243 + 86;
        CommandScoreboard.lIIlIIIlIIIlII[198] = (0xF8 ^ 0x93) + (0x95 ^ 0xC2) - -" ".length() + " ".length();
        CommandScoreboard.lIIlIIIlIIIlII[199] = 46 + 69 + 51 + 31;
        CommandScoreboard.lIIlIIIlIIIlII[200] = 58 + 141 - 117 + 116;
        CommandScoreboard.lIIlIIIlIIIlII[201] = 106 + 29 - 99 + 122 + (0x26 ^ 0x53) - (25 + 61 - 56 + 135) + (0x52 ^ 0xB);
        CommandScoreboard.lIIlIIIlIIIlII[202] = 48 + 2 - 42 + 192;
        CommandScoreboard.lIIlIIIlIIIlII[203] = (0xDA ^ 0xB1) + (112 + 142 - 154 + 44) - (77 + 14 + 53 + 23) + (0x26 ^ 0x53);
        CommandScoreboard.lIIlIIIlIIIlII[204] = (0x90 ^ 0xB6) + (133 + 5 - 40 + 70) - (0x76 ^ 0x3A) + (0xD3 ^ 0x9B);
        CommandScoreboard.lIIlIIIlIIIlII[205] = (0x4D ^ 0x1A) + (160 + 97 - 118 + 22) - (163 + 13 - 88 + 90) + (69 + 132 - 108 + 40);
        CommandScoreboard.lIIlIIIlIIIlII[206] = (0x5D ^ 0x52) + (44 + 108 - 136 + 111) - (0x16 ^ 0x53) + (85 + 32 - 49 + 63);
        CommandScoreboard.lIIlIIIlIIIlII[207] = 75 + 186 - 245 + 173 + (0x77 ^ 0x34) - (0x23 ^ 0x1C) + (0xB2 ^ 0xBE);
        CommandScoreboard.lIIlIIIlIIIlII[208] = 61 + 174 - 135 + 76 + (131 + 63 - 185 + 150) - (53 + 82 - 106 + 115) + (0x8A ^ 0x85);
        CommandScoreboard.lIIlIIIlIIIlII[209] = 155 + 166 - 246 + 132;
        CommandScoreboard.lIIlIIIlIIIlII[210] = 109 + 20 - 81 + 160;
        CommandScoreboard.lIIlIIIlIIIlII[211] = 24 + 160 - 86 + 111;
        CommandScoreboard.lIIlIIIlIIIlII[212] = 2 + 83 + 29 + 66 + (0x14 ^ 0x7A) - (12 + 126 - 121 + 120) + (0x53 ^ 0x6A);
        CommandScoreboard.lIIlIIIlIIIlII[213] = (0xD4 ^ 0xB5) + (161 + 179 - 175 + 25) - (136 + 146 - 50 + 14) + (38 + 146 - 41 + 27);
        CommandScoreboard.lIIlIIIlIIIlII[214] = 148 + 78 - 127 + 113;
        CommandScoreboard.lIIlIIIlIIIlII[215] = 56 + 68 - 67 + 132 + (0xCA ^ 0x9F) - (105 + 49 - 57 + 43) + (0x51 ^ 0x1E);
        CommandScoreboard.lIIlIIIlIIIlII[216] = 12 + 11 + 186 + 5;
        CommandScoreboard.lIIlIIIlIIIlII[217] = 130 + 147 - 130 + 45 + (0x9D ^ 0xBE) - (44 + 8 + 33 + 125) + (181 + 72 - 99 + 44);
        CommandScoreboard.lIIlIIIlIIIlII[218] = 8 + 58 + 52 + 10 + (30 + 21 + 60 + 55) - (0x36 ^ 0x4F) + (0x20 ^ 0xB);
        CommandScoreboard.lIIlIIIlIIIlII[219] = 72 + 207 - 93 + 31;
        CommandScoreboard.lIIlIIIlIIIlII[220] = 29 + 76 - 11 + 124;
        CommandScoreboard.lIIlIIIlIIIlII[221] = 92 + 14 - 32 + 145;
        CommandScoreboard.lIIlIIIlIIIlII[222] = (0x8B ^ 0xAB) + "   ".length() - -(0xEF ^ 0xC2) + (129 + 90 - 201 + 122);
        CommandScoreboard.lIIlIIIlIIIlII[223] = 115 + 4 + 24 + 78;
        CommandScoreboard.lIIlIIIlIIIlII[224] = 54 + 99 - 88 + 77 + (0x64 ^ 0x44) - (101 + 47 - 68 + 76) + (121 + 98 - 163 + 148);
        CommandScoreboard.lIIlIIIlIIIlII[225] = 33 + 73 - 69 + 110 + (78 + 160 - 78 + 19) - (69 + 116 - 88 + 96) + (0x30 ^ 0x6A);
        CommandScoreboard.lIIlIIIlIIIlII[226] = 180 + 165 - 207 + 86;
        CommandScoreboard.lIIlIIIlIIIlII[227] = 15 + 11 - 8 + 140 + (0x9 ^ 0x16) - (66 + 113 - 67 + 71) + (180 + 17 - 169 + 191);
        CommandScoreboard.lIIlIIIlIIIlII[228] = 119 + 38 - 71 + 140;
        CommandScoreboard.lIIlIIIlIIIlII[229] = 134 + 123 - 130 + 100;
        CommandScoreboard.lIIlIIIlIIIlII[230] = 148 + 15 - 6 + 71;
        CommandScoreboard.lIIlIIIlIIIlII[231] = 40 + 102 - 19 + 35 + (24 + 125 - 56 + 46) - (97 + 45 - 52 + 98) + (0x1B ^ 0x63);
        CommandScoreboard.lIIlIIIlIIIlII[232] = 63 + 219 - 256 + 203 + (0xFF ^ 0xAE) - (0xFFFFED5B & 0x13AF) + (159 + 14 - 1 + 15);
    }
    
    private boolean func_175780_b(final ICommandSender lllllllllllllIIlllIlIIllIllIIIll, final String[] lllllllllllllIIlllIlIIllIllIIIlI) throws CommandException {
        int lllllllllllllIIlllIlIIllIllIIIIl = CommandScoreboard.lIIlIIIlIIIlII[50];
        int lllllllllllllIIlllIlIIllIllIIIII = CommandScoreboard.lIIlIIIlIIIlII[0];
        "".length();
        if ((0xF7 ^ 0xAC ^ (0xC3 ^ 0x9C)) <= 0) {
            return ((65 + 146 - 191 + 155 ^ 27 + 73 - 10 + 57) & (0x20 ^ 0x7 ^ (0x96 ^ 0x8D) ^ -" ".length())) != 0x0;
        }
        while (!llIIlIlIlIIIlll(lllllllllllllIIlllIlIIllIllIIIII, lllllllllllllIIlllIlIIllIllIIIlI.length)) {
            if (llIIlIlIlIIIIlI(this.isUsernameIndex(lllllllllllllIIlllIlIIllIllIIIlI, lllllllllllllIIlllIlIIllIllIIIII) ? 1 : 0) && llIIlIlIlIIIIlI(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[51]].equals(lllllllllllllIIlllIlIIllIllIIIlI[lllllllllllllIIlllIlIIllIllIIIII]) ? 1 : 0)) {
                if (llIIlIlIlIIIllI(lllllllllllllIIlllIlIIllIllIIIIl)) {
                    throw new CommandException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[52]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
                }
                lllllllllllllIIlllIlIIllIllIIIIl = lllllllllllllIIlllIlIIllIllIIIII;
            }
            ++lllllllllllllIIlllIlIIllIllIIIII;
        }
        if (llIIlIlIlIIlIII(lllllllllllllIIlllIlIIllIllIIIIl)) {
            return CommandScoreboard.lIIlIIIlIIIlII[0] != 0;
        }
        final List<String> lllllllllllllIIlllIlIIllIlIlllll = (List<String>)Lists.newArrayList((Iterable)this.getScoreboard().getObjectiveNames());
        final String lllllllllllllIIlllIlIIllIlIllllI = lllllllllllllIIlllIlIIllIllIIIlI[lllllllllllllIIlllIlIIllIllIIIIl];
        final List<String> lllllllllllllIIlllIlIIllIlIlllIl = (List<String>)Lists.newArrayList();
        final String lllllllllllllIIlllIlIIllIlIlIIIl = (String)lllllllllllllIIlllIlIIllIlIlllll.iterator();
        "".length();
        if ((0x33 ^ 0x37) <= 0) {
            return ((0x84 ^ 0xC3) & ~(0x39 ^ 0x7E)) != 0x0;
        }
        while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIllIlIlIIIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlllIlIIllIlIlllII = ((Iterator<String>)lllllllllllllIIlllIlIIllIlIlIIIl).next();
            lllllllllllllIIlllIlIIllIllIIIlI[lllllllllllllIIlllIlIIllIllIIIIl] = lllllllllllllIIlllIlIIllIlIlllII;
            try {
                this.processCommand(lllllllllllllIIlllIlIIllIllIIIll, lllllllllllllIIlllIlIIllIllIIIlI);
                lllllllllllllIIlllIlIIllIlIlllIl.add(lllllllllllllIIlllIlIIllIlIlllII);
                "".length();
                "".length();
                if ((0xAE ^ 0xB5 ^ (0x1C ^ 0x3)) <= 0) {
                    return ((0xE9 ^ 0xA8 ^ (0x60 ^ 0x6)) & (76 + 144 - 162 + 89 ^ 127 + 89 - 69 + 33 ^ -" ".length())) != 0x0;
                }
                continue;
            }
            catch (CommandException lllllllllllllIIlllIlIIllIlIllIll) {
                final ChatComponentTranslation lllllllllllllIIlllIlIIllIlIllIlI = new ChatComponentTranslation(lllllllllllllIIlllIlIIllIlIllIll.getMessage(), lllllllllllllIIlllIlIIllIlIllIll.getErrorObjects());
                lllllllllllllIIlllIlIIllIlIllIlI.getChatStyle().setColor(EnumChatFormatting.RED);
                "".length();
                lllllllllllllIIlllIlIIllIllIIIll.addChatMessage(lllllllllllllIIlllIlIIllIlIllIlI);
            }
        }
        lllllllllllllIIlllIlIIllIllIIIlI[lllllllllllllIIlllIlIIllIllIIIIl] = lllllllllllllIIlllIlIIllIlIllllI;
        lllllllllllllIIlllIlIIllIllIIIll.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIIlllIlIIllIlIlllIl.size());
        if (llIIlIlIlIIIIII(lllllllllllllIIlllIlIIllIlIlllIl.size())) {
            throw new WrongUsageException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[53]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
        }
        return CommandScoreboard.lIIlIIIlIIIlII[2] != 0;
    }
    
    protected void listTeams(final ICommandSender lllllllllllllIIlllIlIIlIllIIllII, final String[] lllllllllllllIIlllIlIIlIllIIlIll, final int lllllllllllllIIlllIlIIlIlIllllll) throws CommandException {
        final Scoreboard lllllllllllllIIlllIlIIlIllIIlIIl = this.getScoreboard();
        if (llIIlIlIlIIIlIl(lllllllllllllIIlllIlIIlIllIIlIll.length, lllllllllllllIIlllIlIIlIlIllllll)) {
            final ScorePlayerTeam lllllllllllllIIlllIlIIlIllIIlIII = this.getTeam(lllllllllllllIIlllIlIIlIllIIlIll[lllllllllllllIIlllIlIIlIlIllllll]);
            if (llIIlIlIlIIlIIl(lllllllllllllIIlllIlIIlIllIIlIII)) {
                return;
            }
            final Collection<String> lllllllllllllIIlllIlIIlIllIIIlll = lllllllllllllIIlllIlIIlIllIIlIII.getMembershipCollection();
            lllllllllllllIIlllIlIIlIllIIllII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIlllIlIIlIllIIIlll.size());
            if (llIIlIlIlIIllII(lllllllllllllIIlllIlIIlIllIIIlll.size())) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[107]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllIIlIII.getRegisteredName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[108]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandScoreboard.lIIlIIIlIIIlII[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllIIIlll.size();
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIllIIlIII.getRegisteredName();
            final ChatComponentTranslation lllllllllllllIIlllIlIIlIllIIIllI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIIlllIlIIlIllIIIllI.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
            "".length();
            lllllllllllllIIlllIlIIlIllIIllII.addChatMessage(lllllllllllllIIlllIlIIlIllIIIllI);
            lllllllllllllIIlllIlIIlIllIIllII.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(lllllllllllllIIlllIlIIlIllIIIlll.toArray())));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final Collection<ScorePlayerTeam> lllllllllllllIIlllIlIIlIllIIIlIl = lllllllllllllIIlllIlIIlIllIIlIIl.getTeams();
            lllllllllllllIIlllIlIIlIllIIllII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIlllIlIIlIllIIIlIl.size());
            if (llIIlIlIlIIllII(lllllllllllllIIlllIlIIlIllIIIlIl.size())) {
                throw new CommandException(CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[109]], new Object[CommandScoreboard.lIIlIIIlIIIlII[0]]);
            }
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[110]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CommandScoreboard.lIIlIIIlIIIlII[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllIIIlIl.size();
            final ChatComponentTranslation lllllllllllllIIlllIlIIlIllIIIlII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            lllllllllllllIIlllIlIIlIllIIIlII.getChatStyle().setColor(EnumChatFormatting.DARK_GREEN);
            "".length();
            lllllllllllllIIlllIlIIlIllIIllII.addChatMessage(lllllllllllllIIlllIlIIlIllIIIlII);
            final long lllllllllllllIIlllIlIIlIlIlllIlI = (long)lllllllllllllIIlllIlIIlIllIIIlIl.iterator();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!llIIlIlIlIIIIII(((Iterator)lllllllllllllIIlllIlIIlIlIlllIlI).hasNext() ? 1 : 0)) {
                final ScorePlayerTeam lllllllllllllIIlllIlIIlIllIIIIll = ((Iterator<ScorePlayerTeam>)lllllllllllllIIlllIlIIlIlIlllIlI).next();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = CommandScoreboard.lIIIllllllllII[CommandScoreboard.lIIlIIIlIIIlII[111]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[CommandScoreboard.lIIlIIIlIIIlII[3]];
                lllllllllllllIlIIlIlllIIlIIIIIIl3[CommandScoreboard.lIIlIIIlIIIlII[0]] = lllllllllllllIIlllIlIIlIllIIIIll.getRegisteredName();
                lllllllllllllIlIIlIlllIIlIIIIIIl3[CommandScoreboard.lIIlIIIlIIIlII[2]] = lllllllllllllIIlllIlIIlIllIIIIll.getTeamName();
                lllllllllllllIlIIlIlllIIlIIIIIIl3[CommandScoreboard.lIIlIIIlIIIlII[1]] = lllllllllllllIIlllIlIIlIllIIIIll.getMembershipCollection().size();
                lllllllllllllIIlllIlIIlIllIIllII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3));
            }
        }
    }
    
    private static boolean llIIlIlIlIIlIII(final int lllllllllllllIIlllIlIIIIllIllIll) {
        return lllllllllllllIIlllIlIIIIllIllIll < 0;
    }
}
