// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Collection;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import net.minecraft.entity.player.EntityPlayerMP;
import com.google.common.base.Predicate;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.command.ICommand;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.command.CommandException;
import net.minecraft.stats.StatList;
import net.minecraft.command.WrongUsageException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandAchievement extends CommandBase
{
    private static final /* synthetic */ int[] lIlIIIllIlIlIl;
    private static final /* synthetic */ String[] lIlIIIllIIlIll;
    
    private static boolean lllIIIllllIIIll(final int lllllllllllllIIIllllIIIlIIIIIlIl, final int lllllllllllllIIIllllIIIlIIIIIlII) {
        return lllllllllllllIIIllllIIIlIIIIIlIl < lllllllllllllIIIllllIIIlIIIIIlII;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandAchievement.lIlIIIllIlIlIl[1];
    }
    
    @Override
    public String getCommandName() {
        return CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[0]];
    }
    
    private static boolean lllIIIllllIlIll(final int lllllllllllllIIIllllIIIIllllIlIl, final int lllllllllllllIIIllllIIIIllllIlII) {
        return lllllllllllllIIIllllIIIIllllIlIl != lllllllllllllIIIllllIIIIllllIlII;
    }
    
    private static boolean lllIIIllllIlIII(final Object lllllllllllllIIIllllIIIlIIIIIIlI) {
        return lllllllllllllIIIllllIIIlIIIIIIlI != null;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIllllIIIllIIIIIll) {
        return CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[2]];
    }
    
    private static boolean lllIIIllllIIlll(final int lllllllllllllIIIllllIIIIlllllIlI) {
        return lllllllllllllIIIllllIIIIlllllIlI != 0;
    }
    
    private static void lllIIIlllIIlIll() {
        (lIlIIIllIIlIll = new String[CommandAchievement.lIlIIIllIlIlIl[15]])[CommandAchievement.lIlIIIllIlIlIl[0]] = lllIIIlllIIlIII("GDkOHBYPPwsQHQ0=", "yZfus");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[2]] = lllIIIlllIIlIII("NDwcDBQ5NwJPFDQ7GAQDMj4UDwF5JgIAEjI=", "WSqau");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[1]] = lllIIIlllIIlIIl("kOrUeEcG+cJpRjaBJUO8yqP0u6OKCxBzTfp3J9H5jvk=", "BWeGZ");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[3]] = lllIIIlllIIlIIl("hWrXjTDtIvs=", "hqVth");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[4]] = lllIIIlllIIlIIl("u+B8g/YrbAbRHoYDds0TinUWd5rIY54KFCTuLBHtEojoGG2uPV/cSA==", "rEOYX");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[5]] = lllIIIlllIIlIII("CiA/Fw==", "mIIrY");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[6]] = lllIIIlllIIlIII("JTYuBA==", "QWEao");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[7]] = lllIIIlllIIlIII("OggvPxc3AzF8FzoPKzcAPAonPAJ3ACskE3cUNzEVPBQxfBc1Cw==", "YgBRv");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[8]] = lllIIIlllIIlIIl("nf4bPXajWCLNmc0Iy8MsmOq+qzK9z1zy8J462i9fJ+dp5EsFIdpbdg==", "XRQkH");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[9]] = lllIIIlllIIlIII("DDUFGCoBPhtbKgwyARA9CjcNGz9BOwQHLg4+ET0qGT8=", "oZhuK");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[10]] = lllIIIlllIIlIII("CAM5CicFCCdJJwgEPQIwDgExCTJFCDsJMiMNIgI=", "klTgF");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[11]] = lllIIIlllIIlIIl("F+LeVE3INaBomj9L+pdJjMekdZdmhT8RlmGDS3UdIUrNihn5xpIRiw==", "sBoXo");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[12]] = lllIIIlllIIlIIl("raOUokXziK1DSGveGP67A3ZXnP5b0XmKMg1YjYGs9+togb37kpveBw==", "gbqoV");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[13]] = lllIIIlllIIlIlI("gm9ZrEs8R7k=", "KPfdP");
        CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[14]] = lllIIIlllIIlIII("GxgeLA==", "oyuIN");
    }
    
    private static boolean lllIIIllllIlIlI(final int lllllllllllllIIIllllIIIlIIIIllIl, final int lllllllllllllIIIllllIIIlIIIIllII) {
        return lllllllllllllIIIllllIIIlIIIIllIl == lllllllllllllIIIllllIIIlIIIIllII;
    }
    
    private static boolean lllIIIllllIlIIl(final Object lllllllllllllIIIllllIIIIllllllll, final Object lllllllllllllIIIllllIIIIlllllllI) {
        return lllllllllllllIIIllllIIIIllllllll == lllllllllllllIIIllllIIIIlllllllI;
    }
    
    private static boolean lllIIIllllIIlII(final Object lllllllllllllIIIllllIIIIllllllII) {
        return lllllllllllllIIIllllIIIIllllllII == null;
    }
    
    private static String lllIIIlllIIlIII(String lllllllllllllIIIllllIIIlIIllIIlI, final String lllllllllllllIIIllllIIIlIIllIllI) {
        lllllllllllllIIIllllIIIlIIllIIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllllIIIlIIllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIIlIIllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIllllIIIlIIllIlII = lllllllllllllIIIllllIIIlIIllIllI.toCharArray();
        int lllllllllllllIIIllllIIIlIIllIIll = CommandAchievement.lIlIIIllIlIlIl[0];
        final float lllllllllllllIIIllllIIIlIIlIllIl = (Object)((String)lllllllllllllIIIllllIIIlIIllIIlI).toCharArray();
        final boolean lllllllllllllIIIllllIIIlIIlIllII = lllllllllllllIIIllllIIIlIIlIllIl.length != 0;
        double lllllllllllllIIIllllIIIlIIlIlIll = CommandAchievement.lIlIIIllIlIlIl[0];
        while (lllIIIllllIIIll((int)lllllllllllllIIIllllIIIlIIlIlIll, lllllllllllllIIIllllIIIlIIlIllII ? 1 : 0)) {
            final char lllllllllllllIIIllllIIIlIIlllIII = lllllllllllllIIIllllIIIlIIlIllIl[lllllllllllllIIIllllIIIlIIlIlIll];
            lllllllllllllIIIllllIIIlIIllIlIl.append((char)(lllllllllllllIIIllllIIIlIIlllIII ^ lllllllllllllIIIllllIIIlIIllIlII[lllllllllllllIIIllllIIIlIIllIIll % lllllllllllllIIIllllIIIlIIllIlII.length]));
            "".length();
            ++lllllllllllllIIIllllIIIlIIllIIll;
            ++lllllllllllllIIIllllIIIlIIlIlIll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIIlIIllIlIl);
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIllllIIIlIllIIIIl, final String[] lllllllllllllIIIllllIIIlIlllIIlI) throws CommandException {
        if (lllIIIllllIIIll(lllllllllllllIIIllllIIIlIlllIIlI.length, CommandAchievement.lIlIIIllIlIlIl[1])) {
            throw new WrongUsageException(CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[1]], new Object[CommandAchievement.lIlIIIllIlIlIl[0]]);
        }
        final StatBase lllllllllllllIIIllllIIIlIlllIIIl = StatList.getOneShotStat(lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[2]]);
        if (lllIIIllllIIlII(lllllllllllllIIIllllIIIlIlllIIIl) && lllIIIllllIIlIl(lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[2]].equals(CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[3]]) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandAchievement.lIlIIIllIlIlIl[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[2]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        EntityPlayerMP entityPlayerMP;
        if (lllIIIllllIIllI(lllllllllllllIIIllllIIIlIlllIIlI.length, CommandAchievement.lIlIIIllIlIlIl[3])) {
            entityPlayerMP = CommandBase.getPlayer(lllllllllllllIIIllllIIIlIllIIIIl, lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[1]]);
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            entityPlayerMP = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIIllllIIIlIllIIIIl);
        }
        final EntityPlayerMP lllllllllllllIIIllllIIIlIlllIIII = entityPlayerMP;
        final boolean lllllllllllllIIIllllIIIlIllIllll = lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[0]].equalsIgnoreCase(CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[5]]);
        final boolean lllllllllllllIIIllllIIIlIllIlllI = lllllllllllllIIIllllIIIlIlllIIlI[CommandAchievement.lIlIIIllIlIlIl[0]].equalsIgnoreCase(CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[6]]);
        if (!lllIIIllllIIlIl(lllllllllllllIIIllllIIIlIllIllll ? 1 : 0) || lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIlllI ? 1 : 0)) {
            if (lllIIIllllIIlII(lllllllllllllIIIllllIIIlIlllIIIl)) {
                if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIllll ? 1 : 0)) {
                    final Iterator<Achievement> iterator = AchievementList.achievementList.iterator();
                    "".length();
                    if (((0x21 ^ 0x3C ^ (0x57 ^ 0x69)) & (98 + 90 - 21 + 3 ^ 78 + 19 - 74 + 114 ^ -" ".length())) >= "  ".length()) {
                        return;
                    }
                    while (!lllIIIllllIIlIl(iterator.hasNext() ? 1 : 0)) {
                        final Achievement lllllllllllllIIIllllIIIlIllIllIl = iterator.next();
                        lllllllllllllIIIllllIIIlIlllIIII.triggerAchievement(lllllllllllllIIIllllIIIlIllIllIl);
                    }
                    final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[7]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandAchievement.lIlIIIllIlIlIl[2]];
                    lllllllllllllIIIIlIlllIIIlIIIlll[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                    CommandBase.notifyOperators(lllllllllllllIIIllllIIIlIllIIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
                    "".length();
                    if (-" ".length() == (0x3E ^ 0x53 ^ (0xE5 ^ 0x8C))) {
                        return;
                    }
                }
                else if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIlllI ? 1 : 0)) {
                    final Iterator iterator2 = Lists.reverse((List)AchievementList.achievementList).iterator();
                    "".length();
                    if (((0x6A ^ 0x1C ^ (0xEF ^ 0x81)) & (0x3B ^ 0x1A ^ (0x46 ^ 0x7F) ^ -" ".length())) >= "   ".length()) {
                        return;
                    }
                    while (!lllIIIllllIIlIl(iterator2.hasNext() ? 1 : 0)) {
                        final Achievement lllllllllllllIIIllllIIIlIllIllII = iterator2.next();
                        lllllllllllllIIIllllIIIlIlllIIII.func_175145_a(lllllllllllllIIIllllIIIlIllIllII);
                    }
                    final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[8]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandAchievement.lIlIIIllIlIlIl[2]];
                    lllllllllllllIIIIlIlllIIIlIIIlll2[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                    CommandBase.notifyOperators(lllllllllllllIIIllllIIIlIllIIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
                    "".length();
                    if ((0xAB ^ 0xAF) <= 0) {
                        return;
                    }
                }
            }
            else {
                if (lllIIIllllIIlll((lllllllllllllIIIllllIIIlIlllIIIl instanceof Achievement) ? 1 : 0)) {
                    Achievement lllllllllllllIIIllllIIIlIllIlIll = (Achievement)lllllllllllllIIIllllIIIlIlllIIIl;
                    if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIllll ? 1 : 0)) {
                        if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIlllIIII.getStatFile().hasAchievementUnlocked(lllllllllllllIIIllllIIIlIllIlIll) ? 1 : 0)) {
                            final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[9]];
                            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandAchievement.lIlIIIllIlIlIl[1]];
                            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                            lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandAchievement.lIlIIIllIlIlIl[2]] = lllllllllllllIIIllllIIIlIlllIIIl.func_150955_j();
                            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
                        }
                        final List<Achievement> lllllllllllllIIIllllIIIlIllIlIlI = (List<Achievement>)Lists.newArrayList();
                        "".length();
                        if ((0x93 ^ 0x96) == 0x0) {
                            return;
                        }
                        while (lllIIIllllIlIII(lllllllllllllIIIllllIIIlIllIlIll.parentAchievement) && !lllIIIllllIIlll(lllllllllllllIIIllllIIIlIlllIIII.getStatFile().hasAchievementUnlocked(lllllllllllllIIIllllIIIlIllIlIll.parentAchievement) ? 1 : 0)) {
                            lllllllllllllIIIllllIIIlIllIlIlI.add(lllllllllllllIIIllllIIIlIllIlIll.parentAchievement);
                            "".length();
                            lllllllllllllIIIllllIIIlIllIlIll = lllllllllllllIIIllllIIIlIllIlIll.parentAchievement;
                        }
                        final Iterator iterator3 = Lists.reverse((List)lllllllllllllIIIllllIIIlIllIlIlI).iterator();
                        "".length();
                        if (((0xFF ^ 0xC5 ^ "   ".length()) & (0x1A ^ 0xA ^ (0xED ^ 0xC4) ^ -" ".length())) > "   ".length()) {
                            return;
                        }
                        while (!lllIIIllllIIlIl(iterator3.hasNext() ? 1 : 0)) {
                            final Achievement lllllllllllllIIIllllIIIlIllIlIIl = iterator3.next();
                            lllllllllllllIIIllllIIIlIlllIIII.triggerAchievement(lllllllllllllIIIllllIIIlIllIlIIl);
                        }
                        "".length();
                        if (-" ".length() < -" ".length()) {
                            return;
                        }
                    }
                    else if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIlllI ? 1 : 0)) {
                        if (lllIIIllllIIlIl(lllllllllllllIIIllllIIIlIlllIIII.getStatFile().hasAchievementUnlocked(lllllllllllllIIIllllIIIlIllIlIll) ? 1 : 0)) {
                            final String lllllllllllllIlIIIIIIlIlIllIlIIl3 = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[10]];
                            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl3 = new Object[CommandAchievement.lIlIIIllIlIlIl[1]];
                            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                            lllllllllllllIlIIIIIIlIlIllIIlIl3[CommandAchievement.lIlIIIllIlIlIl[2]] = lllllllllllllIIIllllIIIlIlllIIIl.func_150955_j();
                            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl3, lllllllllllllIlIIIIIIlIlIllIIlIl3);
                        }
                        final List<Achievement> lllllllllllllIIIllllIIIlIllIlIII = (List<Achievement>)Lists.newArrayList((Iterator)Iterators.filter((Iterator)AchievementList.achievementList.iterator(), (Predicate)new Predicate<Achievement>() {
                            private static final /* synthetic */ int[] llIIIlIIIIIIII;
                            
                            private static boolean lIIIlIIIlIIlllll(final int llllllllllllIlllIllIIlIIllllllll) {
                                return llllllllllllIlllIllIIlIIllllllll != 0;
                            }
                            
                            private static boolean lIIIlIIIlIlIIIII(final Object llllllllllllIlllIllIIlIlIIIIIIlI, final Object llllllllllllIlllIllIIlIlIIIIIIIl) {
                                return llllllllllllIlllIllIIlIlIIIIIIlI != llllllllllllIlllIllIIlIlIIIIIIIl;
                            }
                            
                            private static void lIIIlIIIlIIllllI() {
                                (llIIIlIIIIIIII = new int[2])[0] = " ".length();
                                CommandAchievement$1.llIIIlIIIIIIII[1] = ((0x63 ^ 0x2C ^ (0x1 ^ 0x56)) & (0x4F ^ 0x53 ^ (0x3 ^ 0x7) ^ -" ".length()));
                            }
                            
                            public boolean apply(final Achievement llllllllllllIlllIllIIlIlIIIIlIll) {
                                if (lIIIlIIIlIIlllll(lllllllllllllIIIllllIIIlIlllIIII.getStatFile().hasAchievementUnlocked(llllllllllllIlllIllIIlIlIIIIlIll) ? 1 : 0) && lIIIlIIIlIlIIIII(llllllllllllIlllIllIIlIlIIIIlIll, lllllllllllllIIIllllIIIlIlllIIIl)) {
                                    return CommandAchievement$1.llIIIlIIIIIIII[0] != 0;
                                }
                                return CommandAchievement$1.llIIIlIIIIIIII[1] != 0;
                            }
                            
                            static {
                                lIIIlIIIlIIllllI();
                            }
                        }));
                        final List<Achievement> lllllllllllllIIIllllIIIlIllIIlll = (List<Achievement>)Lists.newArrayList((Iterable)lllllllllllllIIIllllIIIlIllIlIII);
                        float lllllllllllllIIIllllIIIlIlIlIlll = (float)lllllllllllllIIIllllIIIlIllIlIII.iterator();
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        while (!lllIIIllllIIlIl(((Iterator)lllllllllllllIIIllllIIIlIlIlIlll).hasNext() ? 1 : 0)) {
                            Achievement lllllllllllllIIIllllIIIlIllIIlIl;
                            final Achievement lllllllllllllIIIllllIIIlIllIIllI = lllllllllllllIIIllllIIIlIllIIlIl = ((Iterator<Achievement>)lllllllllllllIIIllllIIIlIlIlIlll).next();
                            boolean lllllllllllllIIIllllIIIlIllIIlII = CommandAchievement.lIlIIIllIlIlIl[0] != 0;
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                            while (!lllIIIllllIIlII(lllllllllllllIIIllllIIIlIllIIlIl)) {
                                if (lllIIIllllIlIIl(lllllllllllllIIIllllIIIlIllIIlIl, lllllllllllllIIIllllIIIlIlllIIIl)) {
                                    lllllllllllllIIIllllIIIlIllIIlII = (CommandAchievement.lIlIIIllIlIlIl[2] != 0);
                                }
                                lllllllllllllIIIllllIIIlIllIIlIl = lllllllllllllIIIllllIIIlIllIIlIl.parentAchievement;
                            }
                            if (!lllIIIllllIIlIl(lllllllllllllIIIllllIIIlIllIIlII ? 1 : 0)) {
                                continue;
                            }
                            lllllllllllllIIIllllIIIlIllIIlIl = lllllllllllllIIIllllIIIlIllIIllI;
                            "".length();
                            if ("  ".length() < 0) {
                                return;
                            }
                            while (!lllIIIllllIIlII(lllllllllllllIIIllllIIIlIllIIlIl)) {
                                lllllllllllllIIIllllIIIlIllIIlll.remove(lllllllllllllIIIllllIIIlIllIIllI);
                                "".length();
                                lllllllllllllIIIllllIIIlIllIIlIl = lllllllllllllIIIllllIIIlIllIIlIl.parentAchievement;
                            }
                        }
                        lllllllllllllIIIllllIIIlIlIlIlll = (float)lllllllllllllIIIllllIIIlIllIIlll.iterator();
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        while (!lllIIIllllIIlIl(((Iterator)lllllllllllllIIIllllIIIlIlIlIlll).hasNext() ? 1 : 0)) {
                            final Achievement lllllllllllllIIIllllIIIlIllIIIll = ((Iterator<Achievement>)lllllllllllllIIIllllIIIlIlIlIlll).next();
                            lllllllllllllIIIllllIIIlIlllIIII.func_175145_a(lllllllllllllIIIllllIIIlIllIIIll);
                        }
                    }
                }
                if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIllll ? 1 : 0)) {
                    lllllllllllllIIIllllIIIlIlllIIII.triggerAchievement(lllllllllllllIIIllllIIIlIlllIIIl);
                    final String lllllllllllllIIIIlIlllIIIlIIIlII3 = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[11]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll3 = new Object[CommandAchievement.lIlIIIllIlIlIl[1]];
                    lllllllllllllIIIIlIlllIIIlIIIlll3[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                    lllllllllllllIIIIlIlllIIIlIIIlll3[CommandAchievement.lIlIIIllIlIlIl[2]] = lllllllllllllIIIllllIIIlIlllIIIl.func_150955_j();
                    CommandBase.notifyOperators(lllllllllllllIIIllllIIIlIllIIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII3, lllllllllllllIIIIlIlllIIIlIIIlll3);
                    "".length();
                    if ((0xB ^ 0x79 ^ (0x6F ^ 0x19)) <= 0) {
                        return;
                    }
                }
                else if (lllIIIllllIIlll(lllllllllllllIIIllllIIIlIllIlllI ? 1 : 0)) {
                    lllllllllllllIIIllllIIIlIlllIIII.func_175145_a(lllllllllllllIIIllllIIIlIlllIIIl);
                    final String lllllllllllllIIIIlIlllIIIlIIIlII4 = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[12]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll4 = new Object[CommandAchievement.lIlIIIllIlIlIl[1]];
                    lllllllllllllIIIIlIlllIIIlIIIlll4[CommandAchievement.lIlIIIllIlIlIl[0]] = lllllllllllllIIIllllIIIlIlllIIIl.func_150955_j();
                    lllllllllllllIIIIlIlllIIIlIIIlll4[CommandAchievement.lIlIIIllIlIlIl[2]] = lllllllllllllIIIllllIIIlIlllIIII.getName();
                    CommandBase.notifyOperators(lllllllllllllIIIllllIIIlIllIIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII4, lllllllllllllIIIIlIlllIIIlIIIlll4);
                }
            }
        }
    }
    
    private static String lllIIIlllIIlIIl(final String lllllllllllllIIIllllIIIlIIlIIIlI, final String lllllllllllllIIIllllIIIlIIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIlIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), CommandAchievement.lIlIIIllIlIlIl[8]), "DES");
            final Cipher lllllllllllllIIIllllIIIlIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIIlIIlIIlII.init(CommandAchievement.lIlIIIllIlIlIl[1], lllllllllllllIIIllllIIIlIIlIIlIl);
            return new String(lllllllllllllIIIllllIIIlIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIlIIlIIIll) {
            lllllllllllllIIIllllIIIlIIlIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIllllIIlIl(final int lllllllllllllIIIllllIIIIlllllIII) {
        return lllllllllllllIIIllllIIIIlllllIII == 0;
    }
    
    private static String lllIIIlllIIlIlI(final String lllllllllllllIIIllllIIIlIIIlIlIl, final String lllllllllllllIIIllllIIIlIIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIIlIIIlIlll.init(CommandAchievement.lIlIIIllIlIlIl[1], lllllllllllllIIIllllIIIlIIIllIII);
            return new String(lllllllllllllIIIllllIIIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIlIIIlIllI) {
            lllllllllllllIIIllllIIIlIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIllllIIIlI() {
        (lIlIIIllIlIlIl = new int[16])[0] = ((0x72 ^ 0x5A) & ~(0x8B ^ 0xA3));
        CommandAchievement.lIlIIIllIlIlIl[1] = "  ".length();
        CommandAchievement.lIlIIIllIlIlIl[2] = " ".length();
        CommandAchievement.lIlIIIllIlIlIl[3] = "   ".length();
        CommandAchievement.lIlIIIllIlIlIl[4] = (125 + 10 - 73 + 78 ^ 87 + 77 - 43 + 15);
        CommandAchievement.lIlIIIllIlIlIl[5] = (0x6B ^ 0x6E);
        CommandAchievement.lIlIIIllIlIlIl[6] = (0x2E ^ 0x28);
        CommandAchievement.lIlIIIllIlIlIl[7] = (0x29 ^ 0x2E);
        CommandAchievement.lIlIIIllIlIlIl[8] = (0x80 ^ 0x88);
        CommandAchievement.lIlIIIllIlIlIl[9] = (0xA2 ^ 0xAB);
        CommandAchievement.lIlIIIllIlIlIl[10] = (72 + 117 - 99 + 63 ^ 144 + 59 - 167 + 111);
        CommandAchievement.lIlIIIllIlIlIl[11] = (0xD ^ 0x6);
        CommandAchievement.lIlIIIllIlIlIl[12] = (0x8A ^ 0x86);
        CommandAchievement.lIlIIIllIlIlIl[13] = (0x85 ^ 0x88);
        CommandAchievement.lIlIIIllIlIlIl[14] = (0xB7 ^ 0xB9);
        CommandAchievement.lIlIIIllIlIlIl[15] = (0x52 ^ 0x57 ^ (0x64 ^ 0x6E));
    }
    
    static {
        lllIIIllllIIIlI();
        lllIIIlllIIlIll();
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIllllIIIlIlIIllll, final String[] lllllllllllllIIIllllIIIlIlIIlIlI, final BlockPos lllllllllllllIIIllllIIIlIlIIllIl) {
        if (lllIIIllllIlIlI(lllllllllllllIIIllllIIIlIlIIlIlI.length, CommandAchievement.lIlIIIllIlIlIl[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandAchievement.lIlIIIllIlIlIl[1]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandAchievement.lIlIIIllIlIlIl[0]] = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[13]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandAchievement.lIlIIIllIlIlIl[2]] = CommandAchievement.lIlIIIllIIlIll[CommandAchievement.lIlIIIllIlIlIl[14]];
            return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIllllIIIlIlIIlIlI, lllllllllllllIIIIlIlllIIIllIllII);
        }
        if (lllIIIllllIlIll(lllllllllllllIIIllllIIIlIlIIlIlI.length, CommandAchievement.lIlIIIllIlIlIl[1])) {
            List<String> listOfStringsMatchingLastWord;
            if (lllIIIllllIlIlI(lllllllllllllIIIllllIIIlIlIIlIlI.length, CommandAchievement.lIlIIIllIlIlIl[3])) {
                listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIllllIIIlIlIIlIlI, MinecraftServer.getServer().getAllUsernames());
                "".length();
                if (((0x45 ^ 0x7D) & ~(0x2A ^ 0x12)) != 0x0) {
                    return null;
                }
            }
            else {
                listOfStringsMatchingLastWord = null;
            }
            return listOfStringsMatchingLastWord;
        }
        final List<String> lllllllllllllIIIllllIIIlIlIIllII = (List<String>)Lists.newArrayList();
        final byte lllllllllllllIIIllllIIIlIlIIIlll = (byte)StatList.allStats.iterator();
        "".length();
        if ("  ".length() < 0) {
            return null;
        }
        while (!lllIIIllllIIlIl(((Iterator)lllllllllllllIIIllllIIIlIlIIIlll).hasNext() ? 1 : 0)) {
            final StatBase lllllllllllllIIIllllIIIlIlIIlIll = ((Iterator<StatBase>)lllllllllllllIIIllllIIIlIlIIIlll).next();
            lllllllllllllIIIllllIIIlIlIIllII.add(lllllllllllllIIIllllIIIlIlIIlIll.statId);
            "".length();
        }
        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIllllIIIlIlIIlIlI, lllllllllllllIIIllllIIIlIlIIllII);
    }
    
    private static boolean lllIIIllllIIllI(final int lllllllllllllIIIllllIIIlIIIIlIIl, final int lllllllllllllIIIllllIIIlIIIIlIII) {
        return lllllllllllllIIIllllIIIlIIIIlIIl >= lllllllllllllIIIllllIIIlIIIIlIII;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIIllllIIIlIlIIIlII, final int lllllllllllllIIIllllIIIlIlIIIIlI) {
        if (lllIIIllllIlIlI(lllllllllllllIIIllllIIIlIlIIIIlI, CommandAchievement.lIlIIIllIlIlIl[1])) {
            return CommandAchievement.lIlIIIllIlIlIl[2] != 0;
        }
        return CommandAchievement.lIlIIIllIlIlIl[0] != 0;
    }
}
