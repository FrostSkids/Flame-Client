// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandException;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandBase;

public class CommandDeOp extends CommandBase
{
    private static final /* synthetic */ int[] lllllllllIllI;
    private static final /* synthetic */ String[] llllllllIlIII;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandDeOp.lllllllllIllI[1];
    }
    
    private static void lIllIIIllIlIlII() {
        (llllllllIlIII = new String[CommandDeOp.lllllllllIllI[5]])[CommandDeOp.lllllllllIllI[0]] = lIllIIIllIlIIIl("Ij0pOg==", "FXFJB");
        CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[2]] = lIllIIIllIlIIlI("L889wjKsC9xkPFyLdt478V+SrdSkDFRl", "WqDQv");
        CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[3]] = lIllIIIllIlIIll("1TunwLFv6vThQT1YW7pY2/4WgLwvRW7Y", "RVHKQ");
        CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[1]] = lIllIIIllIlIIIl("LwMICwoiCBZIDykDFUgYOQ8GAxg/", "Llefk");
        CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[4]] = lIllIIIllIlIIIl("NiIVOiM7KQt5JjAiCHk3JiwfMg==", "UMxWB");
    }
    
    private static String lIllIIIllIlIIlI(final String lllllllllllllIlIlIIlIllIIlIIlIII, final String lllllllllllllIlIlIIlIllIIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIllIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIllIIlIIIlll.getBytes(StandardCharsets.UTF_8)), CommandDeOp.lllllllllIllI[6]), "DES");
            final Cipher lllllllllllllIlIlIIlIllIIlIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIllIIlIIlIlI.init(CommandDeOp.lllllllllIllI[3], lllllllllllllIlIlIIlIllIIlIIlIll);
            return new String(lllllllllllllIlIlIIlIllIIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIllIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIllIIlIIlIIl) {
            lllllllllllllIlIlIIlIllIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIlIIlIllIIllIlIll, final String[] lllllllllllllIlIlIIlIllIIllIlIlI, final BlockPos lllllllllllllIlIlIIlIllIIllIlIIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lIllIIlIIIlIllI(lllllllllllllIlIlIIlIllIIllIlIlI.length, CommandDeOp.lllllllllIllI[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIlIIlIllIIllIlIlI, MinecraftServer.getServer().getConfigurationManager().getOppedPlayerNames());
            "".length();
            if (((0x6E ^ 0x7D ^ (0x89 ^ 0xB1)) & (0xFC ^ 0xAB ^ (0x5 ^ 0x79) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static String lIllIIIllIlIIll(final String lllllllllllllIlIlIIlIllIIIlllIIl, final String lllllllllllllIlIlIIlIllIIIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIllIIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIllIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIllIIIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIllIIIllllIl.init(CommandDeOp.lllllllllIllI[3], lllllllllllllIlIlIIlIllIIIlllllI);
            return new String(lllllllllllllIlIlIIlIllIIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIllIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIllIIIllllII) {
            lllllllllllllIlIlIIlIllIIIllllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIIllIlIIIl(String lllllllllllllIlIlIIlIllIIlIllIII, final String lllllllllllllIlIlIIlIllIIlIlllII) {
        lllllllllllllIlIlIIlIllIIlIllIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlIllIIlIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIllIIlIllIll = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIllIIlIllIlI = lllllllllllllIlIlIIlIllIIlIlllII.toCharArray();
        int lllllllllllllIlIlIIlIllIIlIllIIl = CommandDeOp.lllllllllIllI[0];
        final String lllllllllllllIlIlIIlIllIIlIlIIll = (Object)((String)lllllllllllllIlIlIIlIllIIlIllIII).toCharArray();
        final float lllllllllllllIlIlIIlIllIIlIlIIlI = lllllllllllllIlIlIIlIllIIlIlIIll.length;
        char lllllllllllllIlIlIIlIllIIlIlIIIl = (char)CommandDeOp.lllllllllIllI[0];
        while (lIllIIlIIIllIIl(lllllllllllllIlIlIIlIllIIlIlIIIl, (int)lllllllllllllIlIlIIlIllIIlIlIIlI)) {
            final char lllllllllllllIlIlIIlIllIIlIllllI = lllllllllllllIlIlIIlIllIIlIlIIll[lllllllllllllIlIlIIlIllIIlIlIIIl];
            lllllllllllllIlIlIIlIllIIlIllIll.append((char)(lllllllllllllIlIlIIlIllIIlIllllI ^ lllllllllllllIlIlIIlIllIIlIllIlI[lllllllllllllIlIlIIlIllIIlIllIIl % lllllllllllllIlIlIIlIllIIlIllIlI.length]));
            "".length();
            ++lllllllllllllIlIlIIlIllIIlIllIIl;
            ++lllllllllllllIlIlIIlIllIIlIlIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIllIIlIllIll);
    }
    
    private static boolean lIllIIlIIIllIIl(final int lllllllllllllIlIlIIlIllIIIlIllll, final int lllllllllllllIlIlIIlIllIIIlIlllI) {
        return lllllllllllllIlIlIIlIllIIIlIllll < lllllllllllllIlIlIIlIllIIIlIlllI;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIlIIlIllIIlllllIl) {
        return CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[2]];
    }
    
    private static boolean lIllIIlIIIlIlll(final int lllllllllllllIlIlIIlIllIIIlIlIlI) {
        return lllllllllllllIlIlIIlIllIIIlIlIlI > 0;
    }
    
    static {
        lIllIIlIIIlIlIl();
        lIllIIIllIlIlII();
    }
    
    @Override
    public String getCommandName() {
        return CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[0]];
    }
    
    private static boolean lIllIIlIIIlIllI(final int lllllllllllllIlIlIIlIllIIIllIIll, final int lllllllllllllIlIlIIlIllIIIllIIlI) {
        return lllllllllllllIlIlIIlIllIIIllIIll == lllllllllllllIlIlIIlIllIIIllIIlI;
    }
    
    private static void lIllIIlIIIlIlIl() {
        (lllllllllIllI = new int[7])[0] = ((0x6E ^ 0x3B) & ~(0x2F ^ 0x7A));
        CommandDeOp.lllllllllIllI[1] = "   ".length();
        CommandDeOp.lllllllllIllI[2] = " ".length();
        CommandDeOp.lllllllllIllI[3] = "  ".length();
        CommandDeOp.lllllllllIllI[4] = (0x34 ^ 0x4A ^ (0xBE ^ 0xC4));
        CommandDeOp.lllllllllIllI[5] = (0x93 ^ 0x96);
        CommandDeOp.lllllllllIllI[6] = (0x30 ^ 0x38);
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIlIIlIllIIlllIIIl, final String[] lllllllllllllIlIlIIlIllIIlllIlIl) throws CommandException {
        if (!lIllIIlIIIlIllI(lllllllllllllIlIlIIlIllIIlllIlIl.length, CommandDeOp.lllllllllIllI[2]) || !lIllIIlIIIlIlll(lllllllllllllIlIlIIlIllIIlllIlIl[CommandDeOp.lllllllllIllI[0]].length())) {
            throw new WrongUsageException(CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[4]], new Object[CommandDeOp.lllllllllIllI[0]]);
        }
        final MinecraftServer lllllllllllllIlIlIIlIllIIlllIlII = MinecraftServer.getServer();
        final GameProfile lllllllllllllIlIlIIlIllIIlllIIll = lllllllllllllIlIlIIlIllIIlllIlII.getConfigurationManager().getOppedPlayers().getGameProfileFromName(lllllllllllllIlIlIIlIllIIlllIlIl[CommandDeOp.lllllllllIllI[0]]);
        if (lIllIIlIIIllIII(lllllllllllllIlIlIIlIllIIlllIIll)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[3]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandDeOp.lllllllllIllI[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandDeOp.lllllllllIllI[0]] = lllllllllllllIlIlIIlIllIIlllIlIl[CommandDeOp.lllllllllIllI[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        lllllllllllllIlIlIIlIllIIlllIlII.getConfigurationManager().removeOp(lllllllllllllIlIlIIlIllIIlllIIll);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandDeOp.llllllllIlIII[CommandDeOp.lllllllllIllI[1]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandDeOp.lllllllllIllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandDeOp.lllllllllIllI[0]] = lllllllllllllIlIlIIlIllIIlllIlIl[CommandDeOp.lllllllllIllI[0]];
        CommandBase.notifyOperators(lllllllllllllIlIlIIlIllIIlllIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
    }
    
    private static boolean lIllIIlIIIllIII(final Object lllllllllllllIlIlIIlIllIIIlIllII) {
        return lllllllllllllIlIlIIlIllIIIlIllII == null;
    }
}
