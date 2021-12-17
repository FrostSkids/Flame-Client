// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.server.management.UserList;
import com.mojang.authlib.GameProfile;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandException;
import net.minecraft.command.WrongUsageException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandPardonPlayer extends CommandBase
{
    private static final /* synthetic */ int[] lIIIlllIllIlll;
    private static final /* synthetic */ String[] lIIIlllIllIlII;
    
    private static boolean llIIIlllIIllIlI(final int lllllllllllllIIllllIllIIIIIlllII, final int lllllllllllllIIllllIllIIIIIllIll) {
        return lllllllllllllIIllllIllIIIIIlllII < lllllllllllllIIllllIllIIIIIllIll;
    }
    
    private static String llIIIlllIIIllll(String lllllllllllllIIllllIllIIIIlIlIll, final String lllllllllllllIIllllIllIIIIlIllll) {
        lllllllllllllIIllllIllIIIIlIlIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIllIIIIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIllIIIIlIlllI = new StringBuilder();
        final char[] lllllllllllllIIllllIllIIIIlIllIl = lllllllllllllIIllllIllIIIIlIllll.toCharArray();
        int lllllllllllllIIllllIllIIIIlIllII = CommandPardonPlayer.lIIIlllIllIlll[0];
        final long lllllllllllllIIllllIllIIIIlIIllI = (Object)((String)lllllllllllllIIllllIllIIIIlIlIll).toCharArray();
        final char lllllllllllllIIllllIllIIIIlIIlIl = (char)lllllllllllllIIllllIllIIIIlIIllI.length;
        int lllllllllllllIIllllIllIIIIlIIlII = CommandPardonPlayer.lIIIlllIllIlll[0];
        while (llIIIlllIIllIlI(lllllllllllllIIllllIllIIIIlIIlII, lllllllllllllIIllllIllIIIIlIIlIl)) {
            final char lllllllllllllIIllllIllIIIIllIIIl = lllllllllllllIIllllIllIIIIlIIllI[lllllllllllllIIllllIllIIIIlIIlII];
            lllllllllllllIIllllIllIIIIlIlllI.append((char)(lllllllllllllIIllllIllIIIIllIIIl ^ lllllllllllllIIllllIllIIIIlIllIl[lllllllllllllIIllllIllIIIIlIllII % lllllllllllllIIllllIllIIIIlIllIl.length]));
            "".length();
            ++lllllllllllllIIllllIllIIIIlIllII;
            ++lllllllllllllIIllllIllIIIIlIIlII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIllIIIIlIlllI);
    }
    
    static {
        llIIIlllIIlIlIl();
        llIIIlllIIlIIII();
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandPardonPlayer.lIIIlllIllIlll[1];
    }
    
    private static void llIIIlllIIlIIII() {
        (lIIIlllIllIlII = new String[CommandPardonPlayer.lIIIlllIllIlll[5]])[CommandPardonPlayer.lIIIlllIllIlll[0]] = llIIIlllIIIllIl("ZstS0nnV22M=", "ORrhh");
        CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[2]] = llIIIlllIIIllIl("Qv7dDjBl96L3WhZdQDq9WVcxEij63qeo", "sIQMS");
        CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[3]] = llIIIlllIIIllIl("4XqrMukVIla60UM/23EZLGh/+Mk22ZzI", "umFni");
        CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[1]] = llIIIlllIIIllIl("d71D2OywltYYHgcGOAss43ZEBDtFrcfm", "wbqBF");
        CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[4]] = llIIIlllIIIllll("KAIkAzglCTpALCUPKAB3Ph4oCTw=", "KmInY");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllllIllIIIllIIIll) {
        return CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[2]];
    }
    
    private static void llIIIlllIIlIlIl() {
        (lIIIlllIllIlll = new int[6])[0] = ((0x5B ^ 0x3B) & ~(0xC7 ^ 0xA7));
        CommandPardonPlayer.lIIIlllIllIlll[1] = "   ".length();
        CommandPardonPlayer.lIIIlllIllIlll[2] = " ".length();
        CommandPardonPlayer.lIIIlllIllIlll[3] = "  ".length();
        CommandPardonPlayer.lIIIlllIllIlll[4] = (0x61 ^ 0x65);
        CommandPardonPlayer.lIIIlllIllIlll[5] = (0x49 ^ 0x1F ^ (0x42 ^ 0x11));
    }
    
    private static boolean llIIIlllIIlIlll(final int lllllllllllllIIllllIllIIIIlIIIII, final int lllllllllllllIIllllIllIIIIIlllll) {
        return lllllllllllllIIllllIllIIIIlIIIII == lllllllllllllIIllllIllIIIIIlllll;
    }
    
    @Override
    public String getCommandName() {
        return CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[0]];
    }
    
    private static boolean llIIIlllIIllIII(final int lllllllllllllIIllllIllIIIIIlIlIl) {
        return lllllllllllllIIllllIllIIIIIlIlIl > 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllllIllIIIlIIlIll, final String[] lllllllllllllIIllllIllIIIlIIlIlI, final BlockPos lllllllllllllIIllllIllIIIlIIlIIl) {
        List<String> listOfStringsMatchingLastWord;
        if (llIIIlllIIlIlll(lllllllllllllIIllllIllIIIlIIlIlI.length, CommandPardonPlayer.lIIIlllIllIlll[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllllIllIIIlIIlIlI, MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().getKeys());
            "".length();
            if (((0x77 ^ 0x4 ^ (0x76 ^ 0x47)) & (0xA0 ^ 0xB0 ^ (0xA ^ 0x58) ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static String llIIIlllIIIllIl(final String lllllllllllllIIllllIllIIIIlllllI, final String lllllllllllllIIllllIllIIIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIllIIIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIllIIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIllIIIlIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIllIIIlIIIIlI.init(CommandPardonPlayer.lIIIlllIllIlll[3], lllllllllllllIIllllIllIIIlIIIIll);
            return new String(lllllllllllllIIllllIllIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIllIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIllIIIlIIIIIl) {
            lllllllllllllIIllllIllIIIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender lllllllllllllIIllllIllIIIlIlllIl) {
        if (llIIIlllIIlIllI(MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().isLanServer() ? 1 : 0) && llIIIlllIIlIllI(super.canCommandSenderUseCommand(lllllllllllllIIllllIllIIIlIlllIl) ? 1 : 0)) {
            return CommandPardonPlayer.lIIIlllIllIlll[2] != 0;
        }
        return CommandPardonPlayer.lIIIlllIllIlll[0] != 0;
    }
    
    private static boolean llIIIlllIIllIIl(final Object lllllllllllllIIllllIllIIIIIllIIl) {
        return lllllllllllllIIllllIllIIIIIllIIl == null;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllllIllIIIlIlIllI, final String[] lllllllllllllIIllllIllIIIlIlIIII) throws CommandException {
        if (!llIIIlllIIlIlll(lllllllllllllIIllllIllIIIlIlIIII.length, CommandPardonPlayer.lIIIlllIllIlll[2]) || !llIIIlllIIllIII(lllllllllllllIIllllIllIIIlIlIIII[CommandPardonPlayer.lIIIlllIllIlll[0]].length())) {
            throw new WrongUsageException(CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[4]], new Object[CommandPardonPlayer.lIIIlllIllIlll[0]]);
        }
        final MinecraftServer lllllllllllllIIllllIllIIIlIlIlII = MinecraftServer.getServer();
        final GameProfile lllllllllllllIIllllIllIIIlIlIIll = lllllllllllllIIllllIllIIIlIlIlII.getConfigurationManager().getBannedPlayers().isUsernameBanned(lllllllllllllIIllllIllIIIlIlIIII[CommandPardonPlayer.lIIIlllIllIlll[0]]);
        if (llIIIlllIIllIIl(lllllllllllllIIllllIllIIIlIlIIll)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[3]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandPardonPlayer.lIIIlllIllIlll[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandPardonPlayer.lIIIlllIllIlll[0]] = lllllllllllllIIllllIllIIIlIlIIII[CommandPardonPlayer.lIIIlllIllIlll[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        ((UserList<GameProfile, V>)lllllllllllllIIllllIllIIIlIlIlII.getConfigurationManager().getBannedPlayers()).removeEntry(lllllllllllllIIllllIllIIIlIlIIll);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandPardonPlayer.lIIIlllIllIlII[CommandPardonPlayer.lIIIlllIllIlll[1]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandPardonPlayer.lIIIlllIllIlll[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandPardonPlayer.lIIIlllIllIlll[0]] = lllllllllllllIIllllIllIIIlIlIIII[CommandPardonPlayer.lIIIlllIllIlll[0]];
        CommandBase.notifyOperators(lllllllllllllIIllllIllIIIlIlIllI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (((0xC1 ^ 0xAE ^ (0x5C ^ 0x71)) & (43 + 82 - 121 + 232 ^ 36 + 82 - 1 + 57 ^ -" ".length())) < 0) {
            return;
        }
    }
    
    private static boolean llIIIlllIIlIllI(final int lllllllllllllIIllllIllIIIIIlIlll) {
        return lllllllllllllIIllllIllIIIIIlIlll != 0;
    }
}
