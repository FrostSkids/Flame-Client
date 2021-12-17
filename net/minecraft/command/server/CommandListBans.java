// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.List;
import net.minecraft.util.BlockPos;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandException;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandListBans extends CommandBase
{
    private static final /* synthetic */ int[] lIlIIIIlIIlIlI;
    private static final /* synthetic */ String[] lIlIIIIlIIlIIl;
    
    private static void lllIIIIlIlIIlII() {
        (lIlIIIIlIIlIIl = new String[CommandListBans.lIlIIIIlIIlIlI[7]])[CommandListBans.lIlIIIIlIIlIlI[0]] = lllIIIIlIlIIIIl("1h5rPxyKCVU=", "yuBYu");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[2]] = lllIIIIlIlIIIIl("y2RBjxdwGfaJlWf4izHBmCocQ9JDOGnu", "ZUPCZ");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[3]] = lllIIIIlIlIIIlI("CBki", "aiQAI");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[1]] = lllIIIIlIlIIIIl("AxLpkaWYtjOOJLI8NFtMl2iDs1DnBugo", "gCGzR");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[4]] = lllIIIIlIlIIIll("yHB+ACvB+okBskMa0yHaBdNyyESiF63eq5nqle7Q2H0=", "ITsnW");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[5]] = lllIIIIlIlIIIll("V34gZLHRqgI=", "lczOD");
        CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[6]] = lllIIIIlIlIIIlI("GBYA", "qfsFf");
    }
    
    private static boolean lllIIIIlIlIlIlI(final int lllllllllllllIIlIIIIlIllIlllIllI, final int lllllllllllllIIlIIIIlIllIlllIlIl) {
        return lllllllllllllIIlIIIIlIllIlllIllI == lllllllllllllIIlIIIIlIllIlllIlIl;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIIIIlIlllIllIlII, final String[] lllllllllllllIIlIIIIlIlllIllIIll) throws CommandException {
        if (lllIIIIlIlIlIIl(lllllllllllllIIlIIIIlIlllIllIIll.length, CommandListBans.lIlIIIIlIIlIlI[2]) && lllIIIIlIlIlIII(lllllllllllllIIlIIIIlIlllIllIIll[CommandListBans.lIlIIIIlIIlIlI[0]].equalsIgnoreCase(CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[3]]) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[1]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandListBans.lIlIIIIlIIlIlI[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandListBans.lIlIIIIlIIlIlI[0]] = MinecraftServer.getServer().getConfigurationManager().getBannedIPs().getKeys().length;
            lllllllllllllIIlIIIIlIlllIllIlII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
            lllllllllllllIIlIIIIlIlllIllIlII.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(MinecraftServer.getServer().getConfigurationManager().getBannedIPs().getKeys())));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[4]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CommandListBans.lIlIIIIlIIlIlI[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandListBans.lIlIIIIlIIlIlI[0]] = MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().getKeys().length;
            lllllllllllllIIlIIIIlIlllIllIlII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
            lllllllllllllIIlIIIIlIlllIllIlII.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().getKeys())));
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender lllllllllllllIIlIIIIlIlllIlllIlI) {
        if ((!lllIIIIlIlIIlll(MinecraftServer.getServer().getConfigurationManager().getBannedIPs().isLanServer() ? 1 : 0) || lllIIIIlIlIlIII(MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().isLanServer() ? 1 : 0)) && lllIIIIlIlIlIII(super.canCommandSenderUseCommand(lllllllllllllIIlIIIIlIlllIlllIlI) ? 1 : 0)) {
            return CommandListBans.lIlIIIIlIIlIlI[2] != 0;
        }
        return CommandListBans.lIlIIIIlIIlIlI[0] != 0;
    }
    
    private static String lllIIIIlIlIIIlI(String lllllllllllllIIlIIIIlIlllIIIIIIl, final String lllllllllllllIIlIIIIlIlllIIIIIII) {
        lllllllllllllIIlIIIIlIlllIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIlIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIlIlllIIIIlII = new StringBuilder();
        final char[] lllllllllllllIIlIIIIlIlllIIIIIll = lllllllllllllIIlIIIIlIlllIIIIIII.toCharArray();
        int lllllllllllllIIlIIIIlIlllIIIIIlI = CommandListBans.lIlIIIIlIIlIlI[0];
        final long lllllllllllllIIlIIIIlIllIlllllII = (Object)lllllllllllllIIlIIIIlIlllIIIIIIl.toCharArray();
        final boolean lllllllllllllIIlIIIIlIllIllllIll = lllllllllllllIIlIIIIlIllIlllllII.length != 0;
        double lllllllllllllIIlIIIIlIllIllllIlI = CommandListBans.lIlIIIIlIIlIlI[0];
        while (lllIIIIlIlIlIll((int)lllllllllllllIIlIIIIlIllIllllIlI, lllllllllllllIIlIIIIlIllIllllIll ? 1 : 0)) {
            final char lllllllllllllIIlIIIIlIlllIIIIlll = lllllllllllllIIlIIIIlIllIlllllII[lllllllllllllIIlIIIIlIllIllllIlI];
            lllllllllllllIIlIIIIlIlllIIIIlII.append((char)(lllllllllllllIIlIIIIlIlllIIIIlll ^ lllllllllllllIIlIIIIlIlllIIIIIll[lllllllllllllIIlIIIIlIlllIIIIIlI % lllllllllllllIIlIIIIlIlllIIIIIll.length]));
            "".length();
            ++lllllllllllllIIlIIIIlIlllIIIIIlI;
            ++lllllllllllllIIlIIIIlIllIllllIlI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIlIlllIIIIlII);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandListBans.lIlIIIIlIIlIlI[1];
    }
    
    @Override
    public String getCommandName() {
        return CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[0]];
    }
    
    private static void lllIIIIlIlIIllI() {
        (lIlIIIIlIIlIlI = new int[9])[0] = ((0x5F ^ 0x3A ^ (0xAA ^ 0xC4)) & (110 + 64 - 140 + 127 ^ 53 + 126 - 20 + 11 ^ -" ".length()));
        CommandListBans.lIlIIIIlIIlIlI[1] = "   ".length();
        CommandListBans.lIlIIIIlIIlIlI[2] = " ".length();
        CommandListBans.lIlIIIIlIIlIlI[3] = "  ".length();
        CommandListBans.lIlIIIIlIIlIlI[4] = (0x95 ^ 0x91);
        CommandListBans.lIlIIIIlIIlIlI[5] = (0x7E ^ 0x66 ^ (0xAA ^ 0xB7));
        CommandListBans.lIlIIIIlIIlIlI[6] = (0x24 ^ 0x22);
        CommandListBans.lIlIIIIlIIlIlI[7] = (0x6A ^ 0x6D);
        CommandListBans.lIlIIIIlIIlIlI[8] = (0x4E ^ 0x46);
    }
    
    private static String lllIIIIlIlIIIIl(final String lllllllllllllIIlIIIIlIlllIlIIIll, final String lllllllllllllIIlIIIIlIlllIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIlIlllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), CommandListBans.lIlIIIIlIIlIlI[8]), "DES");
            final Cipher lllllllllllllIIlIIIIlIlllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIlIlllIlIIlIl.init(CommandListBans.lIlIIIIlIIlIlI[3], lllllllllllllIIlIIIIlIlllIlIIllI);
            return new String(lllllllllllllIIlIIIIlIlllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlIlllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIlIlllIlIIlII) {
            lllllllllllllIIlIIIIlIlllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIIlIlIlIll(final int lllllllllllllIIlIIIIlIllIllIlllI, final int lllllllllllllIIlIIIIlIllIllIllIl) {
        return lllllllllllllIIlIIIIlIllIllIlllI < lllllllllllllIIlIIIIlIllIllIllIl;
    }
    
    private static boolean lllIIIIlIlIIlll(final int lllllllllllllIIlIIIIlIllIllIlIIl) {
        return lllllllllllllIIlIIIIlIllIllIlIIl == 0;
    }
    
    private static boolean lllIIIIlIlIlIIl(final int lllllllllllllIIlIIIIlIllIlllIIlI, final int lllllllllllllIIlIIIIlIllIlllIIIl) {
        return lllllllllllllIIlIIIIlIllIlllIIlI >= lllllllllllllIIlIIIIlIllIlllIIIl;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIIIIlIlllIlllIII) {
        return CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[2]];
    }
    
    static {
        lllIIIIlIlIIllI();
        lllIIIIlIlIIlII();
    }
    
    private static String lllIIIIlIlIIIll(final String lllllllllllllIIlIIIIlIlllIIlIllI, final String lllllllllllllIIlIIIIlIlllIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIlIlllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlIlllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIlIlllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIlIlllIIllIII.init(CommandListBans.lIlIIIIlIIlIlI[3], lllllllllllllIIlIIIIlIlllIIllIIl);
            return new String(lllllllllllllIIlIIIIlIlllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlIlllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIlIlllIIlIlll) {
            lllllllllllllIIlIIIIlIlllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIIlIlIlIII(final int lllllllllllllIIlIIIIlIllIllIlIll) {
        return lllllllllllllIIlIIIIlIllIllIlIll != 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIIIIlIlllIlIlllI, final String[] lllllllllllllIIlIIIIlIlllIlIlIll, final BlockPos lllllllllllllIIlIIIIlIlllIlIllII) {
        List<String> listOfStringsMatchingLastWord;
        if (lllIIIIlIlIlIlI(lllllllllllllIIlIIIIlIlllIlIlIll.length, CommandListBans.lIlIIIIlIIlIlI[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandListBans.lIlIIIIlIIlIlI[3]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandListBans.lIlIIIIlIIlIlI[0]] = CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[5]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandListBans.lIlIIIIlIIlIlI[2]] = CommandListBans.lIlIIIIlIIlIIl[CommandListBans.lIlIIIIlIIlIlI[6]];
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIIIlIlllIlIlIll, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (((0x2 ^ 0x12) & ~(0xB8 ^ 0xA8)) < -" ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
}
