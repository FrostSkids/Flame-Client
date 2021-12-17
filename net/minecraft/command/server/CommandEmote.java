// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Arrays;
import net.minecraft.command.CommandException;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.WrongUsageException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandEmote extends CommandBase
{
    private static final /* synthetic */ String[] llllIIlllIlII;
    private static final /* synthetic */ int[] llllIIlllIllI;
    
    private static void lIlIlIIlIIlllII() {
        (llllIIlllIlII = new String[CommandEmote.llllIIlllIllI[4]])[CommandEmote.llllIIlllIllI[0]] = lIlIlIIlIIllIlI("VEhSWXlUTVU=", "hjAvY");
        CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[1]] = lIlIlIIlIIllIll("GvVrnUDG6JWRpkCksSGAsDT2M/eR3WsC", "bqaEQ");
        CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[2]] = lIlIlIIlIIllIll("MLYFyY2k7I2U7+HfWuNNA1HN4l6xEl8U", "lAuYm");
        CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[3]] = lIlIlIIlIIllIll("V1tIxfzKI79fWaZX8TnFKQ==", "lkYKT");
    }
    
    static {
        lIlIlIIlIlIIlll();
        lIlIlIIlIIlllII();
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIlllIIIlIIIIlIIII, final String[] lllllllllllllIlIlllIIIlIIIIIllll, final BlockPos lllllllllllllIlIlllIIIlIIIIIlllI) {
        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIlllIIIlIIIIIllll, MinecraftServer.getServer().getAllUsernames());
    }
    
    @Override
    public String getCommandName() {
        return CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[0]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandEmote.llllIIlllIllI[0];
    }
    
    private static boolean lIlIlIIlIlIlIII(final int lllllllllllllIlIlllIIIIllllIllll) {
        return lllllllllllllIlIlllIIIIllllIllll <= 0;
    }
    
    private static String lIlIlIIlIIllIll(final String lllllllllllllIlIlllIIIlIIIIIIIll, final String lllllllllllllIlIlllIIIlIIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIlIIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIIIlIIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIIIlIIIIIIlll.init(CommandEmote.llllIIlllIllI[2], lllllllllllllIlIlllIIIlIIIIIlIII);
            return new String(lllllllllllllIlIlllIIIlIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIlIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIlIIIIIIllI) {
            lllllllllllllIlIlllIIIlIIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIlllIIIlIIIIlIlIl, final String[] lllllllllllllIlIlllIIIlIIIIlIlII) throws CommandException {
        if (lIlIlIIlIlIlIII(lllllllllllllIlIlllIIIlIIIIlIlII.length)) {
            throw new WrongUsageException(CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[2]], new Object[CommandEmote.llllIIlllIllI[0]]);
        }
        final int lllllllllllllIIIIlIlllIlIIlIIIll = CommandEmote.llllIIlllIllI[0];
        int lllllllllllllIIIIlIlllIlIIlIIIlI;
        if (lIlIlIIlIlIlIIl((lllllllllllllIlIlllIIIlIIIIlIlIl instanceof EntityPlayer) ? 1 : 0)) {
            lllllllllllllIIIIlIlllIlIIlIIIlI = CommandEmote.llllIIlllIllI[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIlIlllIlIIlIIIlI = CommandEmote.llllIIlllIllI[1];
        }
        final IChatComponent lllllllllllllIlIlllIIIlIIIIlIllI = CommandBase.getChatComponentFromNthArg(lllllllllllllIlIlllIIIlIIIIlIlIl, lllllllllllllIlIlllIIIlIIIIlIlII, lllllllllllllIIIIlIlllIlIIlIIIll, (boolean)(lllllllllllllIIIIlIlllIlIIlIIIlI != 0));
        final ServerConfigurationManager configurationManager = MinecraftServer.getServer().getConfigurationManager();
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[3]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandEmote.llllIIlllIllI[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandEmote.llllIIlllIllI[0]] = lllllllllllllIlIlllIIIlIIIIlIlIl.getDisplayName();
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandEmote.llllIIlllIllI[1]] = lllllllllllllIlIlllIIIlIIIIlIllI;
        configurationManager.sendChatMsg(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
    }
    
    private static String lIlIlIIlIIllIlI(final String lllllllllllllIlIlllIIIIlllllIllI, final String lllllllllllllIlIlllIIIIlllllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIIllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIIlllllIlIl.getBytes(StandardCharsets.UTF_8)), CommandEmote.llllIIlllIllI[5]), "DES");
            final Cipher lllllllllllllIlIlllIIIIllllllIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlllIIIIllllllIlI.init(CommandEmote.llllIIlllIllI[2], lllllllllllllIlIlllIIIIllllllIll);
            return new String(lllllllllllllIlIlllIIIIllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIIllllllIIl) {
            lllllllllllllIlIlllIIIIllllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIIlIlIIlll() {
        (llllIIlllIllI = new int[6])[0] = ((103 + 167 - 218 + 131 ^ 120 + 155 - 185 + 79) & (0x2E ^ 0x25 ^ (0x94 ^ 0x81) ^ -" ".length()));
        CommandEmote.llllIIlllIllI[1] = " ".length();
        CommandEmote.llllIIlllIllI[2] = "  ".length();
        CommandEmote.llllIIlllIllI[3] = "   ".length();
        CommandEmote.llllIIlllIllI[4] = (82 + 71 - 138 + 152 ^ 88 + 86 - 57 + 46);
        CommandEmote.llllIIlllIllI[5] = (0x79 ^ 0x71);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIlllIIIlIIIIlllIl) {
        return CommandEmote.llllIIlllIlII[CommandEmote.llllIIlllIllI[1]];
    }
    
    private static boolean lIlIlIIlIlIlIIl(final int lllllllllllllIlIlllIIIIlllllIIIl) {
        return lllllllllllllIlIlllIIIIlllllIIIl != 0;
    }
}
