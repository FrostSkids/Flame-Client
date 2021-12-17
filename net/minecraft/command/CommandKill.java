// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;

public class CommandKill extends CommandBase
{
    private static final /* synthetic */ String[] llIllIIIIllIIl;
    private static final /* synthetic */ int[] llIllIIIllIlIl;
    
    static {
        lIIlIllIlIIIllll();
        lIIlIllIIlIlIllI();
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIlIIIIIIIllIIlIll) {
        return CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[2]];
    }
    
    private static boolean lIIlIllIlIIlIIII(final int llllllllllllIllIlIIIIIIIlIIlIIll) {
        return llllllllllllIllIlIIIIIIIlIIlIIll == 0;
    }
    
    private static void lIIlIllIlIIIllll() {
        (llIllIIIllIlIl = new int[6])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
        CommandKill.llIllIIIllIlIl[1] = "  ".length();
        CommandKill.llIllIIIllIlIl[2] = " ".length();
        CommandKill.llIllIIIllIlIl[3] = "   ".length();
        CommandKill.llIllIIIllIlIl[4] = (0x39 ^ 0x16 ^ (0xA1 ^ 0x8A));
        CommandKill.llIllIIIllIlIl[5] = (0xB9 ^ 0xB1);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIlIIIIIIIlIllIllI, final String[] llllllllllllIllIlIIIIIIIlIllIIll, final BlockPos llllllllllllIllIlIIIIIIIlIllIlII) {
        List<String> listOfStringsMatchingLastWord;
        if (lIIlIllIlIIlIIIl(llllllllllllIllIlIIIIIIIlIllIIll.length, CommandKill.llIllIIIllIlIl[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIIIIIIIlIllIIll, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (((121 + 24 - 137 + 141 ^ 123 + 160 - 282 + 173) & (0xF ^ 0xB ^ (0xF ^ 0x30) ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIllIlIIIIIIIlIlllIll, final int llllllllllllIllIlIIIIIIIlIlllIIl) {
        if (lIIlIllIlIIlIIII(llllllllllllIllIlIIIIIIIlIlllIIl)) {
            return CommandKill.llIllIIIllIlIl[2] != 0;
        }
        return CommandKill.llIllIIIllIlIl[0] != 0;
    }
    
    private static String lIIlIllIIlIlIlII(final String llllllllllllIllIlIIIIIIIlIIlllII, final String llllllllllllIllIlIIIIIIIlIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), CommandKill.llIllIIIllIlIl[5]), "DES");
            final Cipher llllllllllllIllIlIIIIIIIlIlIIIII = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIIIIlIlIIIII.init(CommandKill.llIllIIIllIlIl[1], llllllllllllIllIlIIIIIIIlIlIIIIl);
            return new String(llllllllllllIllIlIIIIIIIlIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIIlIIlllll) {
            llllllllllllIllIlIIIIIIIlIIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIlIIIIIIIllIIIIII, final String[] llllllllllllIllIlIIIIIIIlIllllll) throws CommandException {
        if (lIIlIllIlIIlIIII(llllllllllllIllIlIIIIIIIlIllllll.length)) {
            final EntityPlayer llllllllllllIllIlIIIIIIIllIIIIll = CommandBase.getCommandSenderAsPlayer(llllllllllllIllIlIIIIIIIllIIIIII);
            llllllllllllIllIlIIIIIIIllIIIIll.onKillCommand();
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[1]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandKill.llIllIIIllIlIl[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandKill.llIllIIIllIlIl[0]] = llllllllllllIllIlIIIIIIIllIIIIll.getDisplayName();
            CommandBase.notifyOperators(llllllllllllIllIlIIIIIIIllIIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (((0x89 ^ 0xBC) & ~(0xAC ^ 0x99)) != ((0xBC ^ 0xBB) & ~(0x2C ^ 0x2B))) {
                return;
            }
        }
        else {
            final Entity llllllllllllIllIlIIIIIIIllIIIIlI = CommandBase.func_175768_b(llllllllllllIllIlIIIIIIIllIIIIII, llllllllllllIllIlIIIIIIIlIllllll[CommandKill.llIllIIIllIlIl[0]]);
            llllllllllllIllIlIIIIIIIllIIIIlI.onKillCommand();
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[3]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandKill.llIllIIIllIlIl[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandKill.llIllIIIllIlIl[0]] = llllllllllllIllIlIIIIIIIllIIIIlI.getDisplayName();
            CommandBase.notifyOperators(llllllllllllIllIlIIIIIIIllIIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
    }
    
    private static void lIIlIllIIlIlIllI() {
        (llIllIIIIllIIl = new String[CommandKill.llIllIIIllIlIl[4]])[CommandKill.llIllIIIllIlIl[0]] = lIIlIllIIlIlIlII("KWbTLtgtE9g=", "SMcUe");
        CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[2]] = lIIlIllIIlIlIlIl("HtQnmXQ0W470LKGggxy1UVbBjSBGyLG1", "ndcZR");
        CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[1]] = lIIlIllIIlIlIlII("DLeA6vaF8eW3y02vyuBagFwOCL1/fJXsjjTfZCdfKb8=", "bTHnY");
        CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[3]] = lIIlIllIIlIlIlII("V0grYSEIiTVKm4i6qvdBmHCilS89ZC1cMoTktOjJ/78=", "kedon");
    }
    
    private static boolean lIIlIllIlIIlIIIl(final int llllllllllllIllIlIIIIIIIlIIlIllI, final int llllllllllllIllIlIIIIIIIlIIlIlIl) {
        return llllllllllllIllIlIIIIIIIlIIlIllI == llllllllllllIllIlIIIIIIIlIIlIlIl;
    }
    
    @Override
    public String getCommandName() {
        return CommandKill.llIllIIIIllIIl[CommandKill.llIllIIIllIlIl[0]];
    }
    
    private static String lIIlIllIIlIlIlIl(final String llllllllllllIllIlIIIIIIIlIlIlIIl, final String llllllllllllIllIlIIIIIIIlIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIIIIlIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIIIIlIlIllIl.init(CommandKill.llIllIIIllIlIl[1], llllllllllllIllIlIIIIIIIlIlIlllI);
            return new String(llllllllllllIllIlIIIIIIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIIlIlIllII) {
            llllllllllllIllIlIIIIIIIlIlIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandKill.llIllIIIllIlIl[1];
    }
}
