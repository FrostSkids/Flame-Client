// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Iterator;
import net.minecraft.server.management.UserList;
import net.minecraft.util.BlockPos;
import java.util.Arrays;
import net.minecraft.command.CommandException;
import java.util.regex.Matcher;
import net.minecraft.util.IChatComponent;
import net.minecraft.command.WrongUsageException;
import net.minecraft.command.PlayerNotFoundException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.Date;
import net.minecraft.server.management.IPBanEntry;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import java.util.regex.Pattern;
import net.minecraft.command.CommandBase;

public class CommandBanIp extends CommandBase
{
    private static final /* synthetic */ String[] lIIIIllIIllIII;
    public static final /* synthetic */ Pattern field_147211_a;
    private static final /* synthetic */ int[] lIIIIllIIllIIl;
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender lllllllllllllIlIIlIIllIllIlIIlIl) {
        if (lIlllIllIlIlIlI(MinecraftServer.getServer().getConfigurationManager().getBannedIPs().isLanServer() ? 1 : 0) && lIlllIllIlIlIlI(super.canCommandSenderUseCommand(lllllllllllllIlIIlIIllIllIlIIlIl) ? 1 : 0)) {
            return CommandBanIp.lIIIIllIIllIIl[1] != 0;
        }
        return CommandBanIp.lIIIIllIIllIIl[0] != 0;
    }
    
    private static String lIlllIllIlIIlIl(String lllllllllllllIlIIlIIllIlIlIllllI, final String lllllllllllllIlIIlIIllIlIlIlllIl) {
        lllllllllllllIlIIlIIllIlIlIllllI = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIllIlIlIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIllIlIllIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIlIIllIlIllIIIII = lllllllllllllIlIIlIIllIlIlIlllIl.toCharArray();
        int lllllllllllllIlIIlIIllIlIlIlllll = CommandBanIp.lIIIIllIIllIIl[0];
        final short lllllllllllllIlIIlIIllIlIlIllIIl = (Object)((String)lllllllllllllIlIIlIIllIlIlIllllI).toCharArray();
        final double lllllllllllllIlIIlIIllIlIlIllIII = lllllllllllllIlIIlIIllIlIlIllIIl.length;
        double lllllllllllllIlIIlIIllIlIlIlIlll = CommandBanIp.lIIIIllIIllIIl[0];
        while (lIlllIllIllIIII((int)lllllllllllllIlIIlIIllIlIlIlIlll, (int)lllllllllllllIlIIlIIllIlIlIllIII)) {
            final char lllllllllllllIlIIlIIllIlIllIIlII = lllllllllllllIlIIlIIllIlIlIllIIl[lllllllllllllIlIIlIIllIlIlIlIlll];
            lllllllllllllIlIIlIIllIlIllIIIIl.append((char)(lllllllllllllIlIIlIIllIlIllIIlII ^ lllllllllllllIlIIlIIllIlIllIIIII[lllllllllllllIlIIlIIllIlIlIlllll % lllllllllllllIlIIlIIllIlIllIIIII.length]));
            "".length();
            ++lllllllllllllIlIIlIIllIlIlIlllll;
            ++lllllllllllllIlIIlIIllIlIlIlIlll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIllIlIllIIIIl);
    }
    
    private static boolean lIlllIllIlIlIlI(final int lllllllllllllIlIIlIIllIlIIlIlIII) {
        return lllllllllllllIlIIlIIllIlIIlIlIII != 0;
    }
    
    private static void lIlllIllIlIIlll() {
        (lIIIIllIIllIII = new String[CommandBanIp.lIIIIllIIllIIl[8]])[CommandBanIp.lIIIIllIIllIIl[0]] = lIlllIllIlIIIlI("1abwmv68ecfIfEv8494ZMrIfn70RUuDBkRG3qiC+uT2Ji1Ujlcu5SZT/Ubq8bFg5KIYoI2W18IFZ+gRpEsd5QTTrgBwJxtqBmMccx4TaobkPGIXpl9Um85fp987uHXLUJYI8Y3m3OkCZiTAAm6w8dYWAvIw/bB8gWcX6993DRek=", "nAtsW");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[1]] = lIlllIllIlIIIlI("XRqXt9t4NGM=", "OWfPV");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[3]] = lIlllIllIlIIIlI("ywzqbUyH+zOH6wr5OrG8WFwP1Z2IvWSo", "seisK");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[2]] = lIlllIllIlIIlIl("Ag49ByQPBSNEJwAPORprCA8mCykIBQ==", "aaPjE");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[4]] = lIlllIllIlIIlIl("BCQlCA0JLztLDgYlIRVCEjgpAgk=", "gKHel");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[5]] = lIlllIllIlIIllI("1JJKQCNO3MvFkx1xJpL7asfCbqugvfady3R/Pd2+HGo=", "ZywYx");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[6]] = lIlllIllIlIIlIl("JhgEHCMrExpfICQZAAFsNgIKEic2BA==", "EwiqB");
        CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[7]] = lIlllIllIlIIlIl("EgY0OQcfDSp6BBAHMCRIAhw6NwMCGnckChAQPCYV", "qiYTf");
    }
    
    private static boolean lIlllIllIlIllII(final int lllllllllllllIlIIlIIllIlIIlIllIl, final int lllllllllllllIlIIlIIllIlIIlIllII) {
        return lllllllllllllIlIIlIIllIlIIlIllIl > lllllllllllllIlIIlIIllIlIIlIllII;
    }
    
    private static boolean lIlllIllIlIllll(final int lllllllllllllIlIIlIIllIlIIlIIllI) {
        return lllllllllllllIlIIlIIllIlIIlIIllI == 0;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIlIIllIllIlIIIll) {
        return CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[3]];
    }
    
    protected void func_147210_a(final ICommandSender lllllllllllllIlIIlIIllIlIlllllll, final String lllllllllllllIlIIlIIllIlIlllIlIl, final String lllllllllllllIlIIlIIllIlIlllIlII) {
        final IPBanEntry lllllllllllllIlIIlIIllIlIlllllII = new IPBanEntry(lllllllllllllIlIIlIIllIlIlllIlIl, null, lllllllllllllIlIIlIIllIlIlllllll.getName(), null, lllllllllllllIlIIlIIllIlIlllIlII);
        ((UserList<K, IPBanEntry>)MinecraftServer.getServer().getConfigurationManager().getBannedIPs()).addEntry(lllllllllllllIlIIlIIllIlIlllllII);
        final List<EntityPlayerMP> lllllllllllllIlIIlIIllIlIllllIll = MinecraftServer.getServer().getConfigurationManager().getPlayersMatchingAddress(lllllllllllllIlIIlIIllIlIlllIlIl);
        final String[] lllllllllllllIlIIlIIllIlIllllIlI = new String[lllllllllllllIlIIlIIllIlIllllIll.size()];
        int lllllllllllllIlIIlIIllIlIllllIIl = CommandBanIp.lIIIIllIIllIIl[0];
        final char lllllllllllllIlIIlIIllIlIllIlllI = (char)lllllllllllllIlIIlIIllIlIllllIll.iterator();
        "".length();
        if ((0x4 ^ 0x3C ^ (0xA5 ^ 0x98)) == 0x0) {
            return;
        }
        while (!lIlllIllIlIllll(((Iterator)lllllllllllllIlIIlIIllIlIllIlllI).hasNext() ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIlIIlIIllIlIllllIII = ((Iterator<EntityPlayerMP>)lllllllllllllIlIIlIIllIlIllIlllI).next();
            lllllllllllllIlIIlIIllIlIllllIII.playerNetServerHandler.kickPlayerFromServer(CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[5]]);
            lllllllllllllIlIIlIIllIlIllllIlI[lllllllllllllIlIIlIIllIlIllllIIl++] = lllllllllllllIlIIlIIllIlIllllIII.getName();
        }
        if (lIlllIllIlIlIlI(lllllllllllllIlIIlIIllIlIllllIll.isEmpty() ? 1 : 0)) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[6]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandBanIp.lIIIIllIIllIIl[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandBanIp.lIIIIllIIllIIl[0]] = lllllllllllllIlIIlIIllIlIlllIlIl;
            CommandBase.notifyOperators(lllllllllllllIlIIlIIllIlIlllllll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[7]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandBanIp.lIIIIllIIllIIl[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandBanIp.lIIIIllIIllIIl[0]] = lllllllllllllIlIIlIIllIlIlllIlIl;
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandBanIp.lIIIIllIIllIIl[1]] = CommandBase.joinNiceString(lllllllllllllIlIIlIIllIlIllllIlI);
            CommandBase.notifyOperators(lllllllllllllIlIIlIIllIlIlllllll, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
    }
    
    private static boolean lIlllIllIlIlIll(final int lllllllllllllIlIIlIIllIlIIllIlIl, final int lllllllllllllIlIIlIIllIlIIllIlII) {
        return lllllllllllllIlIIlIIllIlIIllIlIl >= lllllllllllllIlIIlIIllIlIIllIlII;
    }
    
    private static String lIlllIllIlIIllI(final String lllllllllllllIlIIlIIllIlIlIIIIIl, final String lllllllllllllIlIIlIIllIlIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllIlIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIllIlIlIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIllIlIlIIIIll.init(CommandBanIp.lIIIIllIIllIIl[3], lllllllllllllIlIIlIIllIlIlIIIlII);
            return new String(lllllllllllllIlIIlIIllIlIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllIlIlIIIIlI) {
            lllllllllllllIlIIlIIllIlIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIlIIllIllIIllIll, final String[] lllllllllllllIlIIlIIllIllIIllIlI) throws CommandException {
        if (lIlllIllIlIlIll(lllllllllllllIlIIlIIllIllIIllIlI.length, CommandBanIp.lIIIIllIIllIIl[1]) && lIlllIllIlIllII(lllllllllllllIlIIlIIllIllIIllIlI[CommandBanIp.lIIIIllIIllIIl[0]].length(), CommandBanIp.lIIIIllIIllIIl[1])) {
            IChatComponent chatComponentFromNthArg;
            if (lIlllIllIlIlIll(lllllllllllllIlIIlIIllIllIIllIlI.length, CommandBanIp.lIIIIllIIllIIl[3])) {
                chatComponentFromNthArg = CommandBase.getChatComponentFromNthArg(lllllllllllllIlIIlIIllIllIIllIll, lllllllllllllIlIIlIIllIllIIllIlI, CommandBanIp.lIIIIllIIllIIl[1]);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                chatComponentFromNthArg = null;
            }
            final IChatComponent lllllllllllllIlIIlIIllIllIIllIIl = chatComponentFromNthArg;
            final Matcher lllllllllllllIlIIlIIllIllIIllIII = CommandBanIp.field_147211_a.matcher(lllllllllllllIlIIlIIllIllIIllIlI[CommandBanIp.lIIIIllIIllIIl[0]]);
            if (lIlllIllIlIlIlI(lllllllllllllIlIIlIIllIllIIllIII.matches() ? 1 : 0)) {
                final String lllllllllllllIlIIlIIllIlIlllIlIl = lllllllllllllIlIIlIIllIllIIllIlI[CommandBanIp.lIIIIllIIllIIl[0]];
                String unformattedText;
                if (lIlllIllIlIllIl(lllllllllllllIlIIlIIllIllIIllIIl)) {
                    unformattedText = null;
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else {
                    unformattedText = lllllllllllllIlIIlIIllIllIIllIIl.getUnformattedText();
                }
                this.func_147210_a(lllllllllllllIlIIlIIllIllIIllIll, lllllllllllllIlIIlIIllIlIlllIlIl, unformattedText);
                "".length();
                if (((193 + 66 - 182 + 165 ^ 44 + 93 - 75 + 105) & (0x88 ^ 0x8E ^ (0xEF ^ 0xBC) ^ -" ".length())) <= -" ".length()) {
                    return;
                }
            }
            else {
                final EntityPlayerMP lllllllllllllIlIIlIIllIllIIlIlll = MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(lllllllllllllIlIIlIIllIllIIllIlI[CommandBanIp.lIIIIllIIllIIl[0]]);
                if (lIlllIllIlIllIl(lllllllllllllIlIIlIIllIllIIlIlll)) {
                    throw new PlayerNotFoundException(CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[2]], new Object[CommandBanIp.lIIIIllIIllIIl[0]]);
                }
                final String playerIP = lllllllllllllIlIIlIIllIllIIlIlll.getPlayerIP();
                String unformattedText2;
                if (lIlllIllIlIllIl(lllllllllllllIlIIlIIllIllIIllIIl)) {
                    unformattedText2 = null;
                    "".length();
                    if (((0x18 ^ 0x3B) & ~(0x99 ^ 0xBA)) != 0x0) {
                        return;
                    }
                }
                else {
                    unformattedText2 = lllllllllllllIlIIlIIllIllIIllIIl.getUnformattedText();
                }
                this.func_147210_a(lllllllllllllIlIIlIIllIllIIllIll, playerIP, unformattedText2);
                "".length();
                if (null != null) {
                    return;
                }
            }
            return;
        }
        throw new WrongUsageException(CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[4]], new Object[CommandBanIp.lIIIIllIIllIIl[0]]);
    }
    
    private static boolean lIlllIllIllIIII(final int lllllllllllllIlIIlIIllIlIIllIIIl, final int lllllllllllllIlIIlIIllIlIIllIIII) {
        return lllllllllllllIlIIlIIllIlIIllIIIl < lllllllllllllIlIIlIIllIlIIllIIII;
    }
    
    static {
        lIlllIllIlIlIIl();
        lIlllIllIlIIlll();
        field_147211_a = Pattern.compile(CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[0]]);
    }
    
    private static boolean lIlllIllIlIlllI(final int lllllllllllllIlIIlIIllIlIIlllIIl, final int lllllllllllllIlIIlIIllIlIIlllIII) {
        return lllllllllllllIlIIlIIllIlIIlllIIl == lllllllllllllIlIIlIIllIlIIlllIII;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandBanIp.lIIIIllIIllIIl[2];
    }
    
    @Override
    public String getCommandName() {
        return CommandBanIp.lIIIIllIIllIII[CommandBanIp.lIIIIllIIllIIl[1]];
    }
    
    private static String lIlllIllIlIIIlI(final String lllllllllllllIlIIlIIllIlIlIIllII, final String lllllllllllllIlIIlIIllIlIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllIlIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), CommandBanIp.lIIIIllIIllIIl[8]), "DES");
            final Cipher lllllllllllllIlIIlIIllIlIlIlIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIllIlIlIlIIII.init(CommandBanIp.lIIIIllIIllIIl[3], lllllllllllllIlIIlIIllIlIlIlIIIl);
            return new String(lllllllllllllIlIIlIIllIlIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllIlIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllIlIlIIllll) {
            lllllllllllllIlIIlIIllIlIlIIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIllIlIllIl(final Object lllllllllllllIlIIlIIllIlIIlIlIlI) {
        return lllllllllllllIlIIlIIllIlIIlIlIlI == null;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIIlIIllIllIIIlllI, final String[] lllllllllllllIlIIlIIllIllIIIlIll, final BlockPos lllllllllllllIlIIlIIllIllIIIllII) {
        List<String> listOfStringsMatchingLastWord;
        if (lIlllIllIlIlllI(lllllllllllllIlIIlIIllIllIIIlIll.length, CommandBanIp.lIIIIllIIllIIl[1])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIlIIllIllIIIlIll, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static void lIlllIllIlIlIIl() {
        (lIIIIllIIllIIl = new int[9])[0] = ((0x2E ^ 0x64 ^ (0x88 ^ 0x9D)) & (0x82 ^ 0xC0 ^ (0x67 ^ 0x7A) ^ -" ".length()));
        CommandBanIp.lIIIIllIIllIIl[1] = " ".length();
        CommandBanIp.lIIIIllIIllIIl[2] = "   ".length();
        CommandBanIp.lIIIIllIIllIIl[3] = "  ".length();
        CommandBanIp.lIIIIllIIllIIl[4] = (0xB8 ^ 0xBC);
        CommandBanIp.lIIIIllIIllIIl[5] = (0x6D ^ 0x68);
        CommandBanIp.lIIIIllIIllIIl[6] = (134 + 84 - 88 + 50 ^ 65 + 3 + 30 + 80);
        CommandBanIp.lIIIIllIIllIIl[7] = (0x43 ^ 0x2A ^ (0x5F ^ 0x31));
        CommandBanIp.lIIIIllIIllIIl[8] = (0x75 ^ 0x7D);
    }
}
