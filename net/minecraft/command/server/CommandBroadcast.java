// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Arrays;
import net.minecraft.command.CommandException;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandBroadcast extends CommandBase
{
    private static final /* synthetic */ int[] lIIllIlllllIIl;
    private static final /* synthetic */ String[] lIIllIllllIIll;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandBroadcast.lIIllIlllllIIl[1];
    }
    
    private static void llIllIlIIlIIlII() {
        (lIIllIllllIIll = new String[CommandBroadcast.lIIllIlllllIIl[4]])[CommandBroadcast.lIIllIlllllIIl[0]] = llIllIlIIIlllll("HBU8", "otEdq");
        CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[1]] = llIllIlIIlIIIII("c98dIVNsSlYr6k/zi3KrxxAKtpFWUFn8", "nGssg");
        CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[2]] = llIllIlIIlIIIlI("i7pV5oEKclGRPkJ3DL8fV7rltyDukAmP", "fgWDO");
        CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[3]] = llIllIlIIIlllll("ARUJNSkMHhd2OwMDSi07Ax0B", "bzdXH");
    }
    
    private static String llIllIlIIIlllll(String lllllllllllllIIlIlIIlIIlIlIIIlIl, final String lllllllllllllIIlIlIIlIIlIlIIlIIl) {
        lllllllllllllIIlIlIIlIIlIlIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIlIIlIlIIlIII = new StringBuilder();
        final char[] lllllllllllllIIlIlIIlIIlIlIIIlll = lllllllllllllIIlIlIIlIIlIlIIlIIl.toCharArray();
        int lllllllllllllIIlIlIIlIIlIlIIIllI = CommandBroadcast.lIIllIlllllIIl[0];
        final int lllllllllllllIIlIlIIlIIlIlIIIIII = (Object)lllllllllllllIIlIlIIlIIlIlIIIlIl.toCharArray();
        final double lllllllllllllIIlIlIIlIIlIIllllll = lllllllllllllIIlIlIIlIIlIlIIIIII.length;
        double lllllllllllllIIlIlIIlIIlIIlllllI = CommandBroadcast.lIIllIlllllIIl[0];
        while (llIllIlIIllIIll((int)lllllllllllllIIlIlIIlIIlIIlllllI, (int)lllllllllllllIIlIlIIlIIlIIllllll)) {
            final char lllllllllllllIIlIlIIlIIlIlIIlIll = lllllllllllllIIlIlIIlIIlIlIIIIII[lllllllllllllIIlIlIIlIIlIIlllllI];
            lllllllllllllIIlIlIIlIIlIlIIlIII.append((char)(lllllllllllllIIlIlIIlIIlIlIIlIll ^ lllllllllllllIIlIlIIlIIlIlIIIlll[lllllllllllllIIlIlIIlIIlIlIIIllI % lllllllllllllIIlIlIIlIIlIlIIIlll.length]));
            "".length();
            ++lllllllllllllIIlIlIIlIIlIlIIIllI;
            ++lllllllllllllIIlIlIIlIIlIIlllllI;
            "".length();
            if ((0x97 ^ 0x93) != (0xC ^ 0x8)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIlIIlIlIIlIII);
    }
    
    private static String llIllIlIIlIIIlI(final String lllllllllllllIIlIlIIlIIlIIlIIllI, final String lllllllllllllIIlIlIIlIIlIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIIlIIlIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIIlIIlIIlIlIlI.init(CommandBroadcast.lIIllIlllllIIl[2], lllllllllllllIIlIlIIlIIlIIlIlIll);
            return new String(lllllllllllllIIlIlIIlIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIlIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIIlIIlIlIIl) {
            lllllllllllllIIlIlIIlIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIlIIllIIlI(final int lllllllllllllIIlIlIIlIIlIIlIIIII, final int lllllllllllllIIlIlIIlIIlIIIlllll) {
        return lllllllllllllIIlIlIIlIIlIIlIIIII >= lllllllllllllIIlIlIIlIIlIIIlllll;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIlIIlIIlIlIllIII, final String[] lllllllllllllIIlIlIIlIIlIlIlIlIl, final BlockPos lllllllllllllIIlIlIIlIIlIlIlIllI) {
        List<String> listOfStringsMatchingLastWord;
        if (llIllIlIIllIIlI(lllllllllllllIIlIlIIlIIlIlIlIlIl.length, CommandBroadcast.lIIllIlllllIIl[1])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIlIIlIIlIlIlIlIl, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if ("  ".length() > (9 + 50 + 3 + 88 ^ 110 + 64 - 123 + 95)) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static boolean llIllIlIIllIIIl(final int lllllllllllllIIlIlIIlIIlIIIllIIl) {
        return lllllllllllllIIlIlIIlIIlIIIllIIl > 0;
    }
    
    private static boolean llIllIlIIllIIll(final int lllllllllllllIIlIlIIlIIlIIIlllII, final int lllllllllllllIIlIlIIlIIlIIIllIll) {
        return lllllllllllllIIlIlIIlIIlIIIlllII < lllllllllllllIIlIlIIlIIlIIIllIll;
    }
    
    @Override
    public String getCommandName() {
        return CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[0]];
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIlIIlIIlIllIIIII, final String[] lllllllllllllIIlIlIIlIIlIlIlllll) throws CommandException {
        if (!llIllIlIIllIIIl(lllllllllllllIIlIlIIlIIlIlIlllll.length) || !llIllIlIIllIIIl(lllllllllllllIIlIlIIlIIlIlIlllll[CommandBroadcast.lIIllIlllllIIl[0]].length())) {
            throw new WrongUsageException(CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[3]], new Object[CommandBroadcast.lIIllIlllllIIl[0]]);
        }
        final IChatComponent lllllllllllllIIlIlIIlIIlIlIllllI = CommandBase.getChatComponentFromNthArg(lllllllllllllIIlIlIIlIIlIllIIIII, lllllllllllllIIlIlIIlIIlIlIlllll, CommandBroadcast.lIIllIlllllIIl[0], (boolean)(CommandBroadcast.lIIllIlllllIIl[1] != 0));
        final ServerConfigurationManager configurationManager = MinecraftServer.getServer().getConfigurationManager();
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[2]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandBroadcast.lIIllIlllllIIl[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandBroadcast.lIIllIlllllIIl[0]] = lllllllllllllIIlIlIIlIIlIllIIIII.getDisplayName();
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandBroadcast.lIIllIlllllIIl[1]] = lllllllllllllIIlIlIIlIIlIlIllllI;
        configurationManager.sendChatMsg(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
        "".length();
        if (" ".length() == 0) {
            return;
        }
    }
    
    private static void llIllIlIIllIIII() {
        (lIIllIlllllIIl = new int[6])[0] = ((0x1 ^ 0x2B) & ~(0x31 ^ 0x1B));
        CommandBroadcast.lIIllIlllllIIl[1] = " ".length();
        CommandBroadcast.lIIllIlllllIIl[2] = "  ".length();
        CommandBroadcast.lIIllIlllllIIl[3] = "   ".length();
        CommandBroadcast.lIIllIlllllIIl[4] = (0x2C ^ 0x28);
        CommandBroadcast.lIIllIlllllIIl[5] = (0x72 ^ 0x7A);
    }
    
    private static String llIllIlIIlIIIII(final String lllllllllllllIIlIlIIlIIlIIllIIll, final String lllllllllllllIIlIlIIlIIlIIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIIlIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), CommandBroadcast.lIIllIlllllIIl[5]), "DES");
            final Cipher lllllllllllllIIlIlIIlIIlIIllIlll = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIlIIlIIllIlll.init(CommandBroadcast.lIIllIlllllIIl[2], lllllllllllllIIlIlIIlIIlIIlllIII);
            return new String(lllllllllllllIIlIlIIlIIlIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIIlIIllIllI) {
            lllllllllllllIIlIlIIlIIlIIllIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIlIIlIIlIllIIlIl) {
        return CommandBroadcast.lIIllIllllIIll[CommandBroadcast.lIIllIlllllIIl[1]];
    }
    
    static {
        llIllIlIIllIIII();
        llIllIlIIlIIlII();
    }
}
