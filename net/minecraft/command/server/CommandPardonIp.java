// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.server.management.UserList;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.CommandException;
import java.util.regex.Matcher;
import net.minecraft.command.ICommand;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.SyntaxErrorException;
import net.minecraft.command.WrongUsageException;
import net.minecraft.command.ICommandSender;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandPardonIp extends CommandBase
{
    private static final /* synthetic */ int[] lllIIlIlIIIIIl;
    private static final /* synthetic */ String[] lllIIlIIlIIIIl;
    
    private static boolean lIIllllllIIlIIIl(final int llllllllllllIlIllllIlIIlIIlIlllI, final int llllllllllllIlIllllIlIIlIIlIllIl) {
        return llllllllllllIlIllllIlIIlIIlIlllI == llllllllllllIlIllllIlIIlIIlIllIl;
    }
    
    private static String lIIlllllIIlIIIIl(String llllllllllllIlIllllIlIIlIlIlIllI, final String llllllllllllIlIllllIlIIlIlIllIlI) {
        llllllllllllIlIllllIlIIlIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIlIllllIlIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIlIIlIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlIllllIlIIlIlIllIII = llllllllllllIlIllllIlIIlIlIllIlI.toCharArray();
        int llllllllllllIlIllllIlIIlIlIlIlll = CommandPardonIp.lllIIlIlIIIIIl[0];
        final Exception llllllllllllIlIllllIlIIlIlIlIIIl = (Object)llllllllllllIlIllllIlIIlIlIlIllI.toCharArray();
        final Exception llllllllllllIlIllllIlIIlIlIlIIII = (Exception)llllllllllllIlIllllIlIIlIlIlIIIl.length;
        byte llllllllllllIlIllllIlIIlIlIIllll = (byte)CommandPardonIp.lllIIlIlIIIIIl[0];
        while (lIIllllllIIlIlII(llllllllllllIlIllllIlIIlIlIIllll, (int)llllllllllllIlIllllIlIIlIlIlIIII)) {
            final char llllllllllllIlIllllIlIIlIlIlllII = llllllllllllIlIllllIlIIlIlIlIIIl[llllllllllllIlIllllIlIIlIlIIllll];
            llllllllllllIlIllllIlIIlIlIllIIl.append((char)(llllllllllllIlIllllIlIIlIlIlllII ^ llllllllllllIlIllllIlIIlIlIllIII[llllllllllllIlIllllIlIIlIlIlIlll % llllllllllllIlIllllIlIIlIlIllIII.length]));
            "".length();
            ++llllllllllllIlIllllIlIIlIlIlIlll;
            ++llllllllllllIlIllllIlIIlIlIIllll;
            "".length();
            if (-" ".length() > ((24 + 102 + 11 + 48 ^ 34 + 137 - 145 + 142) & (167 + 159 - 168 + 53 ^ 175 + 49 - 99 + 69 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIlIIlIlIllIIl);
    }
    
    private static boolean lIIllllllIIlIlII(final int llllllllllllIlIllllIlIIlIIlIlIlI, final int llllllllllllIlIllllIlIIlIIlIlIIl) {
        return llllllllllllIlIllllIlIIlIIlIlIlI < llllllllllllIlIllllIlIIlIIlIlIIl;
    }
    
    private static boolean lIIllllllIIlIIII(final int llllllllllllIlIllllIlIIlIIlIIIll) {
        return llllllllllllIlIllllIlIIlIIlIIIll != 0;
    }
    
    private static String lIIlllllIIlIIIll(final String llllllllllllIlIllllIlIIlIIllIlII, final String llllllllllllIlIllllIlIIlIIllIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIIlIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), CommandPardonIp.lllIIlIlIIIIIl[6]), "DES");
            final Cipher llllllllllllIlIllllIlIIlIIlllIII = Cipher.getInstance("DES");
            llllllllllllIlIllllIlIIlIIlllIII.init(CommandPardonIp.lllIIlIlIIIIIl[3], llllllllllllIlIllllIlIIlIIlllIIl);
            return new String(llllllllllllIlIllllIlIIlIIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIIlIIllIlll) {
            llllllllllllIlIllllIlIIlIIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllllIIlIIlI(final int llllllllllllIlIllllIlIIlIIlIIllI, final int llllllllllllIlIllllIlIIlIIlIIlIl) {
        return llllllllllllIlIllllIlIIlIIlIIllI > llllllllllllIlIllllIlIIlIIlIIlIl;
    }
    
    static {
        lIIllllllIIIllll();
        lIIlllllIIlIIlII();
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlIllllIlIIlIllIlllI, final String[] llllllllllllIlIllllIlIIlIlllIIIl) throws CommandException {
        if (!lIIllllllIIlIIIl(llllllllllllIlIllllIlIIlIlllIIIl.length, CommandPardonIp.lllIIlIlIIIIIl[2]) || !lIIllllllIIlIIlI(llllllllllllIlIllllIlIIlIlllIIIl[CommandPardonIp.lllIIlIlIIIIIl[0]].length(), CommandPardonIp.lllIIlIlIIIIIl[2])) {
            throw new WrongUsageException(CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[4]], new Object[CommandPardonIp.lllIIlIlIIIIIl[0]]);
        }
        final Matcher llllllllllllIlIllllIlIIlIlllIIII = CommandBanIp.field_147211_a.matcher(llllllllllllIlIllllIlIIlIlllIIIl[CommandPardonIp.lllIIlIlIIIIIl[0]]);
        if (!lIIllllllIIlIIII(llllllllllllIlIllllIlIIlIlllIIII.matches() ? 1 : 0)) {
            throw new SyntaxErrorException(CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[1]], new Object[CommandPardonIp.lllIIlIlIIIIIl[0]]);
        }
        ((UserList<String, V>)MinecraftServer.getServer().getConfigurationManager().getBannedIPs()).removeEntry(llllllllllllIlIllllIlIIlIlllIIIl[CommandPardonIp.lllIIlIlIIIIIl[0]]);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[3]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandPardonIp.lllIIlIlIIIIIl[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandPardonIp.lllIIlIlIIIIIl[0]] = llllllllllllIlIllllIlIIlIlllIIIl[CommandPardonIp.lllIIlIlIIIIIl[0]];
        CommandBase.notifyOperators(llllllllllllIlIllllIlIIlIllIlllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (-" ".length() == "  ".length()) {
            return;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlIllllIlIIlIllllIII) {
        return CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[2]];
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlIllllIlIIlIllIlIIl, final String[] llllllllllllIlIllllIlIIlIllIlIII, final BlockPos llllllllllllIlIllllIlIIlIllIIlll) {
        List<String> listOfStringsMatchingLastWord;
        if (lIIllllllIIlIIIl(llllllllllllIlIllllIlIIlIllIlIII.length, CommandPardonIp.lllIIlIlIIIIIl[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIllllIlIIlIllIlIII, MinecraftServer.getServer().getConfigurationManager().getBannedIPs().getKeys());
            "".length();
            if (((142 + 59 - 146 + 133 ^ 7 + 113 - 5 + 33) & (20 + 133 - 19 + 27 ^ 39 + 27 + 6 + 65 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static String lIIlllllIIlIIIlI(final String llllllllllllIlIllllIlIIlIlIIIlII, final String llllllllllllIlIllllIlIIlIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIlIIlIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIlIIlIlIIlIII.init(CommandPardonIp.lllIIlIlIIIIIl[3], llllllllllllIlIllllIlIIlIlIIlIIl);
            return new String(llllllllllllIlIllllIlIIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIIlIlIIIlll) {
            llllllllllllIlIllllIlIIlIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllllIIlIIlII() {
        (lllIIlIIlIIIIl = new String[CommandPardonIp.lllIIlIlIIIIIl[5]])[CommandPardonIp.lllIIlIlIIIIIl[0]] = lIIlllllIIlIIIIl("OxcnKyYlWzw/", "KvUOI");
        CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[2]] = lIIlllllIIlIIIIl("Fxo1GBMaEStbBxoXORsbBFstBhMTEA==", "tuXur");
        CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[3]] = lIIlllllIIlIIIlI("VFqr1M/h8hfbKzXaEhDFweJNlOFAcIOEo9TmWAbWsZg=", "kxNxq");
        CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[1]] = lIIlllllIIlIIIIl("OiMLNAQ3KBV3EDcuBzcMKWIPNxM4IA89", "YLfYe");
        CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[4]] = lIIlllllIIlIIIll("ftwslVKPqC5gFA5FtAoxt8zGrEENA0LP", "giUBK");
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender llllllllllllIlIllllIlIIlIlllllII) {
        if (lIIllllllIIlIIII(MinecraftServer.getServer().getConfigurationManager().getBannedIPs().isLanServer() ? 1 : 0) && lIIllllllIIlIIII(super.canCommandSenderUseCommand(llllllllllllIlIllllIlIIlIlllllII) ? 1 : 0)) {
            return CommandPardonIp.lllIIlIlIIIIIl[2] != 0;
        }
        return CommandPardonIp.lllIIlIlIIIIIl[0] != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandPardonIp.lllIIlIlIIIIIl[1];
    }
    
    @Override
    public String getCommandName() {
        return CommandPardonIp.lllIIlIIlIIIIl[CommandPardonIp.lllIIlIlIIIIIl[0]];
    }
    
    private static void lIIllllllIIIllll() {
        (lllIIlIlIIIIIl = new int[7])[0] = ((0x9D ^ 0x8C ^ (0x67 ^ 0x4C)) & (0xE7 ^ 0x83 ^ (0xF0 ^ 0xAE) ^ -" ".length()));
        CommandPardonIp.lllIIlIlIIIIIl[1] = "   ".length();
        CommandPardonIp.lllIIlIlIIIIIl[2] = " ".length();
        CommandPardonIp.lllIIlIlIIIIIl[3] = "  ".length();
        CommandPardonIp.lllIIlIlIIIIIl[4] = (0x8D ^ 0xA3 ^ (0x17 ^ 0x3D));
        CommandPardonIp.lllIIlIlIIIIIl[5] = (96 + 44 - 8 + 1 ^ 74 + 105 - 172 + 121);
        CommandPardonIp.lllIIlIlIIIIIl[6] = (0x6D ^ 0xC ^ (0x72 ^ 0x1B));
    }
}
