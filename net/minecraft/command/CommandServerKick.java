// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommandServerKick extends CommandBase
{
    private static final /* synthetic */ int[] lIlllIllIIIlII;
    private static final /* synthetic */ String[] lIlllIllIIIIIl;
    
    private static String lIIIIIllIIIllIlI(String llllllllllllIllllIlllIllIIllIIll, final String llllllllllllIllllIlllIllIIllIlll) {
        llllllllllllIllllIlllIllIIllIIll = new String(Base64.getDecoder().decode(llllllllllllIllllIlllIllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlllIllIIllIllI = new StringBuilder();
        final char[] llllllllllllIllllIlllIllIIllIlIl = llllllllllllIllllIlllIllIIllIlll.toCharArray();
        int llllllllllllIllllIlllIllIIllIlII = CommandServerKick.lIlllIllIIIlII[0];
        final char llllllllllllIllllIlllIllIIlIlllI = (Object)llllllllllllIllllIlllIllIIllIIll.toCharArray();
        final byte llllllllllllIllllIlllIllIIlIllIl = (byte)llllllllllllIllllIlllIllIIlIlllI.length;
        char llllllllllllIllllIlllIllIIlIllII = (char)CommandServerKick.lIlllIllIIIlII[0];
        while (lIIIIIllIIlIlIIl(llllllllllllIllllIlllIllIIlIllII, llllllllllllIllllIlllIllIIlIllIl)) {
            final char llllllllllllIllllIlllIllIIlllIIl = llllllllllllIllllIlllIllIIlIlllI[llllllllllllIllllIlllIllIIlIllII];
            llllllllllllIllllIlllIllIIllIllI.append((char)(llllllllllllIllllIlllIllIIlllIIl ^ llllllllllllIllllIlllIllIIllIlIl[llllllllllllIllllIlllIllIIllIlII % llllllllllllIllllIlllIllIIllIlIl.length]));
            "".length();
            ++llllllllllllIllllIlllIllIIllIlII;
            ++llllllllllllIllllIlllIllIIlIllII;
            "".length();
            if (((116 + 66 - 55 + 3 ^ 160 + 116 - 142 + 63) & (0x38 ^ 0x48 ^ (0xD ^ 0x3A) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlllIllIIllIllI);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandServerKick.lIlllIllIIIlII[1];
    }
    
    private static boolean lIIIIIllIIlIIlIl(final int llllllllllllIllllIlllIllIIIlIIll, final int llllllllllllIllllIlllIllIIIlIIlI) {
        return llllllllllllIllllIlllIllIIIlIIll > llllllllllllIllllIlllIllIIIlIIlI;
    }
    
    private static boolean lIIIIIllIIlIIlII(final int llllllllllllIllllIlllIllIIIIllII) {
        return llllllllllllIllllIlllIllIIIIllII > 0;
    }
    
    private static boolean lIIIIIllIIlIIllI(final Object llllllllllllIllllIlllIllIIIlIIII) {
        return llllllllllllIllllIlllIllIIIlIIII == null;
    }
    
    private static boolean lIIIIIllIIlIlIIl(final int llllllllllllIllllIlllIllIIIlIlll, final int llllllllllllIllllIlllIllIIIlIllI) {
        return llllllllllllIllllIlllIllIIIlIlll < llllllllllllIllllIlllIllIIIlIllI;
    }
    
    private static boolean lIIIIIllIIlIIlll(final int llllllllllllIllllIlllIllIIIllIll, final int llllllllllllIllllIlllIllIIIllIlI) {
        return llllllllllllIllllIlllIllIIIllIll >= llllllllllllIllllIlllIllIIIllIlI;
    }
    
    private static void lIIIIIllIIlIIIll() {
        (lIlllIllIIIlII = new int[8])[0] = ((0xCF ^ 0x9B) & ~(0x33 ^ 0x67));
        CommandServerKick.lIlllIllIIIlII[1] = "   ".length();
        CommandServerKick.lIlllIllIIIlII[2] = " ".length();
        CommandServerKick.lIlllIllIIIlII[3] = "  ".length();
        CommandServerKick.lIlllIllIIIlII[4] = (0xA ^ 0xE);
        CommandServerKick.lIlllIllIIIlII[5] = (0x28 ^ 0x2D);
        CommandServerKick.lIlllIllIIIlII[6] = (0x84 ^ 0x82);
        CommandServerKick.lIlllIllIIIlII[7] = (57 + 25 + 46 + 1 ^ 97 + 131 - 213 + 122);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllllIlllIllIllIlIII) {
        return CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[2]];
    }
    
    @Override
    public String getCommandName() {
        return CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[0]];
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllllIlllIllIlIlIIll, final String[] llllllllllllIllllIlllIllIlIlIIII, final BlockPos llllllllllllIllllIlllIllIlIlIIIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lIIIIIllIIlIIlll(llllllllllllIllllIlllIllIlIlIIII.length, CommandServerKick.lIlllIllIIIlII[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllllIlllIllIlIlIIII, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (((41 + 117 - 76 + 119 ^ 112 + 9 - 18 + 52) & (12 + 123 + 49 + 21 ^ 49 + 101 - 116 + 125 ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllllIlllIllIlIllIlI, final String[] llllllllllllIllllIlllIllIlIllIIl) throws CommandException {
        if (!lIIIIIllIIlIIlII(llllllllllllIllllIlllIllIlIllIIl.length) || !lIIIIIllIIlIIlIl(llllllllllllIllllIlllIllIlIllIIl[CommandServerKick.lIlllIllIIIlII[0]].length(), CommandServerKick.lIlllIllIIIlII[2])) {
            throw new WrongUsageException(CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[5]], new Object[CommandServerKick.lIlllIllIIIlII[0]]);
        }
        final EntityPlayerMP llllllllllllIllllIlllIllIlIllllI = MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(llllllllllllIllllIlllIllIlIllIIl[CommandServerKick.lIlllIllIIIlII[0]]);
        String llllllllllllIllllIlllIllIlIlllIl = CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[3]];
        boolean llllllllllllIllllIlllIllIlIlllII = CommandServerKick.lIlllIllIIIlII[0] != 0;
        if (lIIIIIllIIlIIllI(llllllllllllIllllIlllIllIlIllllI)) {
            throw new PlayerNotFoundException();
        }
        if (lIIIIIllIIlIIlll(llllllllllllIllllIlllIllIlIllIIl.length, CommandServerKick.lIlllIllIIIlII[3])) {
            llllllllllllIllllIlllIllIlIlllIl = CommandBase.getChatComponentFromNthArg(llllllllllllIllllIlllIllIlIllIlI, llllllllllllIllllIlllIllIlIllIIl, CommandServerKick.lIlllIllIIIlII[2]).getUnformattedText();
            llllllllllllIllllIlllIllIlIlllII = (CommandServerKick.lIlllIllIIIlII[2] != 0);
        }
        llllllllllllIllllIlllIllIlIllllI.playerNetServerHandler.kickPlayerFromServer(llllllllllllIllllIlllIllIlIlllIl);
        if (lIIIIIllIIlIlIII(llllllllllllIllllIlllIllIlIlllII ? 1 : 0)) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[1]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandServerKick.lIlllIllIIIlII[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandServerKick.lIlllIllIIIlII[0]] = llllllllllllIllllIlllIllIlIllllI.getName();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandServerKick.lIlllIllIIIlII[2]] = llllllllllllIllllIlllIllIlIlllIl;
            CommandBase.notifyOperators(llllllllllllIllllIlllIllIlIllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[4]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandServerKick.lIlllIllIIIlII[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandServerKick.lIlllIllIIIlII[0]] = llllllllllllIllllIlllIllIlIllllI.getName();
            CommandBase.notifyOperators(llllllllllllIllllIlllIllIlIllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static void lIIIIIllIIIllllI() {
        (lIlllIllIIIIIl = new String[CommandServerKick.lIlllIllIIIlII[6]])[CommandServerKick.lIlllIllIIIlII[0]] = lIIIIIllIIIllIlI("BTkkMg==", "nPGYg");
        CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[2]] = lIIIIIllIIIllIll("r3MDTn95fpx57axg5TEIMAEXFYUa8bVw", "knfUG");
        CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[3]] = lIIIIIllIIIlllII("15G1GZ7vXbo83r004XxMvip8IaMZfCs5", "fEtrq");
        CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[1]] = lIIIIIllIIIllIlI("DywvJzUCJzFkPwUgKWQnGSAhLycfbTAvNR8sLA==", "lCBJT");
        CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[4]] = lIIIIIllIIIlllII("e2Kj1SpJ7zxExx1TYraoJG0/SvB5JUbP", "gRpJO");
        CommandServerKick.lIlllIllIIIIIl[CommandServerKick.lIlllIllIIIlII[5]] = lIIIIIllIIIllIlI("MgIOFBU/CRBXHzgOCFcBIgwEHA==", "Qmcyt");
    }
    
    private static boolean lIIIIIllIIlIlIII(final int llllllllllllIllllIlllIllIIIIlllI) {
        return llllllllllllIllllIlllIllIIIIlllI != 0;
    }
    
    private static String lIIIIIllIIIllIll(final String llllllllllllIllllIlllIllIIlIIIll, final String llllllllllllIllllIlllIllIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIllIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), CommandServerKick.lIlllIllIIIlII[7]), "DES");
            final Cipher llllllllllllIllllIlllIllIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllIllllIlllIllIIlIIlIl.init(CommandServerKick.lIlllIllIIIlII[3], llllllllllllIllllIlllIllIIlIIllI);
            return new String(llllllllllllIllllIlllIllIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIllIIlIIlII) {
            llllllllllllIllllIlllIllIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllIIIlllII(final String llllllllllllIllllIlllIllIlIIIllI, final String llllllllllllIllllIlllIllIlIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIllIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIllIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlllIllIlIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlllIllIlIIlIlI.init(CommandServerKick.lIlllIllIIIlII[3], llllllllllllIllllIlllIllIlIIlIll);
            return new String(llllllllllllIllllIlllIllIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIllIlIIlIIl) {
            llllllllllllIllllIlllIllIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIIllIIlIIIll();
        lIIIIIllIIIllllI();
    }
}
