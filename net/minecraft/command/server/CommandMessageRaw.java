// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.CommandException;
import net.minecraft.entity.player.EntityPlayer;
import com.google.gson.JsonParseException;
import net.minecraft.command.SyntaxErrorException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentProcessor;
import net.minecraft.util.IChatComponent;
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

public class CommandMessageRaw extends CommandBase
{
    private static final /* synthetic */ int[] lIIIIlllIlllIl;
    private static final /* synthetic */ String[] lIIIIlllIllIll;
    
    private static String lIllllIIllIllll(String lllllllllllllIlIIIllllIlIllllIIl, final String lllllllllllllIlIIIllllIlIllllIII) {
        lllllllllllllIlIIIllllIlIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllllIlIlllllII = new StringBuilder();
        final char[] lllllllllllllIlIIIllllIlIllllIll = lllllllllllllIlIIIllllIlIllllIII.toCharArray();
        int lllllllllllllIlIIIllllIlIllllIlI = CommandMessageRaw.lIIIIlllIlllIl[0];
        final short lllllllllllllIlIIIllllIlIlllIlII = (Object)lllllllllllllIlIIIllllIlIllllIIl.toCharArray();
        final boolean lllllllllllllIlIIIllllIlIlllIIll = lllllllllllllIlIIIllllIlIlllIlII.length != 0;
        char lllllllllllllIlIIIllllIlIlllIIlI = (char)CommandMessageRaw.lIIIIlllIlllIl[0];
        while (lIllllIIlllIlIl(lllllllllllllIlIIIllllIlIlllIIlI, lllllllllllllIlIIIllllIlIlllIIll ? 1 : 0)) {
            final char lllllllllllllIlIIIllllIlIlllllll = lllllllllllllIlIIIllllIlIlllIlII[lllllllllllllIlIIIllllIlIlllIIlI];
            lllllllllllllIlIIIllllIlIlllllII.append((char)(lllllllllllllIlIIIllllIlIlllllll ^ lllllllllllllIlIIIllllIlIllllIll[lllllllllllllIlIIIllllIlIllllIlI % lllllllllllllIlIIIllllIlIllllIll.length]));
            "".length();
            ++lllllllllllllIlIIIllllIlIllllIlI;
            ++lllllllllllllIlIIIllllIlIlllIIlI;
            "".length();
            if (((70 + 112 - 96 + 79 ^ 66 + 75 - 57 + 112) & (0x8C ^ 0x92 ^ 30 + 64 - 32 + 65 ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllllIlIlllllII);
    }
    
    private static String lIllllIIllIlllI(final String lllllllllllllIlIIIllllIllIIIllII, final String lllllllllllllIlIIIllllIllIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllIllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllIllIIIlIll.getBytes(StandardCharsets.UTF_8)), CommandMessageRaw.lIIIIlllIlllIl[6]), "DES");
            final Cipher lllllllllllllIlIIIllllIllIIlIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIIllllIllIIlIIII.init(CommandMessageRaw.lIIIIlllIlllIl[1], lllllllllllllIlIIIllllIllIIlIIIl);
            return new String(lllllllllllllIlIIIllllIllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllIllIIIllll) {
            lllllllllllllIlIIIllllIllIIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[0]];
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIlIIIllllIllIlIIlIl, final int lllllllllllllIlIIIllllIllIlIIIll) {
        if (lIllllIIllllIII(lllllllllllllIlIIIllllIllIlIIIll)) {
            return CommandMessageRaw.lIIIIlllIlllIl[2] != 0;
        }
        return CommandMessageRaw.lIIIIlllIlllIl[0] != 0;
    }
    
    static {
        lIllllIIlllIIll();
        lIllllIIlllIIIl();
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIIllllIlllIIIIlI) {
        return CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[2]];
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIIllllIllIllIIll, final String[] lllllllllllllIlIIIllllIllIlllIIl) throws CommandException {
        if (lIllllIIlllIlIl(lllllllllllllIlIIIllllIllIlllIIl.length, CommandMessageRaw.lIIIIlllIlllIl[1])) {
            throw new WrongUsageException(CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[1]], new Object[CommandMessageRaw.lIIIIlllIlllIl[0]]);
        }
        final EntityPlayer lllllllllllllIlIIIllllIllIlllIII = CommandBase.getPlayer(lllllllllllllIlIIIllllIllIllIIll, lllllllllllllIlIIIllllIllIlllIIl[CommandMessageRaw.lIIIIlllIlllIl[0]]);
        final String lllllllllllllIlIIIllllIllIllIlll = CommandBase.buildString(lllllllllllllIlIIIllllIllIlllIIl, CommandMessageRaw.lIIIIlllIlllIl[2]);
        try {
            final IChatComponent lllllllllllllIlIIIllllIllIllIllI = IChatComponent.Serializer.jsonToComponent(lllllllllllllIlIIIllllIllIllIlll);
            lllllllllllllIlIIIllllIllIlllIII.addChatMessage(ChatComponentProcessor.processComponent(lllllllllllllIlIIIllllIllIllIIll, lllllllllllllIlIIIllllIllIllIllI, lllllllllllllIlIIIllllIllIlllIII));
            "".length();
            if (((0x61 ^ 0x49) & ~(0x49 ^ 0x61)) != 0x0) {
                return;
            }
        }
        catch (JsonParseException lllllllllllllIlIIIllllIllIllIlIl) {
            final Throwable lllllllllllllIlIIIllllIllIllIlII = ExceptionUtils.getRootCause((Throwable)lllllllllllllIlIIIllllIllIllIlIl);
            final String lllllllllllllIIIIlllIIIIIlIlIIII = CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[3]];
            final Object[] lllllllllllllIIIIlllIIIIIlIIllII = new Object[CommandMessageRaw.lIIIIlllIlllIl[2]];
            final int n = CommandMessageRaw.lIIIIlllIlllIl[0];
            String message;
            if (lIllllIIlllIllI(lllllllllllllIlIIIllllIllIllIlII)) {
                message = CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[4]];
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                message = lllllllllllllIlIIIllllIllIllIlII.getMessage();
            }
            lllllllllllllIIIIlllIIIIIlIIllII[n] = message;
            throw new SyntaxErrorException(lllllllllllllIIIIlllIIIIIlIlIIII, lllllllllllllIIIIlllIIIIIlIIllII);
        }
    }
    
    private static void lIllllIIlllIIll() {
        (lIIIIlllIlllIl = new int[7])[0] = ((0x4F ^ 0x75) & ~(0x7D ^ 0x47));
        CommandMessageRaw.lIIIIlllIlllIl[1] = "  ".length();
        CommandMessageRaw.lIIIIlllIlllIl[2] = " ".length();
        CommandMessageRaw.lIIIIlllIlllIl[3] = "   ".length();
        CommandMessageRaw.lIIIIlllIlllIl[4] = (0x1F ^ 0x1B);
        CommandMessageRaw.lIIIIlllIlllIl[5] = (0x9E ^ 0x9B);
        CommandMessageRaw.lIIIIlllIlllIl[6] = (0x7A ^ 0x24 ^ (0xB ^ 0x5D));
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandMessageRaw.lIIIIlllIlllIl[1];
    }
    
    private static void lIllllIIlllIIIl() {
        (lIIIIlllIllIll = new String[CommandMessageRaw.lIIIIlllIlllIl[5]])[CommandMessageRaw.lIIIIlllIlllIl[0]] = lIllllIIllIlllI("IgCHcs3jw8A=", "KwDWq");
        CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[2]] = lIllllIIllIllll("NioDCRM7IR1KBjApAhYTImsbFxMyIA==", "UEndr");
        CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[1]] = lIllllIIllIllll("MgwZAjI/BwdBJzQPGB0yJk0BHDI2Bg==", "QctoS");
        CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[3]] = lIllllIIlllIIII("hfn6iSskDmUJb01/wqpikT0AD2RKPS2a5mrd+qhbEsU=", "AhfYK");
        CommandMessageRaw.lIIIIlllIllIll[CommandMessageRaw.lIIIIlllIlllIl[4]] = lIllllIIllIlllI("GeM65Psf6U0=", "fQFvj");
    }
    
    private static boolean lIllllIIlllIlIl(final int lllllllllllllIlIIIllllIlIllIlIlI, final int lllllllllllllIlIIIllllIlIllIlIIl) {
        return lllllllllllllIlIIIllllIlIllIlIlI < lllllllllllllIlIIIllllIlIllIlIIl;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIIIllllIllIlIlIll, final String[] lllllllllllllIlIIIllllIllIlIlIII, final BlockPos lllllllllllllIlIIIllllIllIlIlIIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lIllllIIlllIlll(lllllllllllllIlIIIllllIllIlIlIII.length, CommandMessageRaw.lIIIIlllIlllIl[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIIllllIllIlIlIII, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (-(7 + 0 + 65 + 55 ^ (0x1B ^ 0x61)) >= 0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static boolean lIllllIIlllIlll(final int lllllllllllllIlIIIllllIlIllIlllI, final int lllllllllllllIlIIIllllIlIllIllIl) {
        return lllllllllllllIlIIIllllIlIllIlllI == lllllllllllllIlIIIllllIlIllIllIl;
    }
    
    private static boolean lIllllIIlllIllI(final Object lllllllllllllIlIIIllllIlIllIIlll) {
        return lllllllllllllIlIIIllllIlIllIIlll == null;
    }
    
    private static boolean lIllllIIllllIII(final int lllllllllllllIlIIIllllIlIllIIlIl) {
        return lllllllllllllIlIIIllllIlIllIIlIl == 0;
    }
    
    private static String lIllllIIlllIIII(final String lllllllllllllIlIIIllllIllIIllIIl, final String lllllllllllllIlIIIllllIllIIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllIllIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllllIllIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllllIllIIlllIl.init(CommandMessageRaw.lIIIIlllIlllIl[1], lllllllllllllIlIIIllllIllIIllllI);
            return new String(lllllllllllllIlIIIllllIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllIllIIlllII) {
            lllllllllllllIlIIIllllIllIIlllII.printStackTrace();
            return null;
        }
    }
}
