// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.server.management.UserList;
import net.minecraft.entity.player.EntityPlayerMP;
import com.mojang.authlib.GameProfile;
import net.minecraft.command.ICommand;
import java.util.Date;
import net.minecraft.server.management.UserListBansEntry;
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

public class CommandBanPlayer extends CommandBase
{
    private static final /* synthetic */ String[] lIIllllIIlIIIl;
    private static final /* synthetic */ int[] lIIllllIIlIllI;
    
    private static void llIlllIlIlllIIl() {
        (lIIllllIIlIIIl = new String[CommandBanPlayer.lIIllllIIlIllI[6]])[CommandBanPlayer.lIIllllIIlIllI[0]] = llIlllIlIllIIlI("PAWSLlyDrNI=", "Cvzyh");
        CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[2]] = llIlllIlIllIIlI("JLl4bT5oRydNCy7Eb06tmZK/w1dUEyad", "oNGcj");
        CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[3]] = llIlllIlIllIlIl("3/dO3QAGA7lCnh/6FdD6jzyR0WOEm8OG", "xnbAg");
        CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[1]] = llIlllIlIllIIlI("hGhvALd5iMA/6Xnw2Bi2c0LsO1S6LYrcVOrX+PJOt8ezOygpeHF5+Q==", "axfWm");
        CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[4]] = llIlllIlIllIlIl("DYer1sdAXfOTEvTz0mLutTWFtcr/yUD0", "mEWXc");
        CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[5]] = llIlllIlIllIlIl("wyeacNtCEkF84thh0OHmXatLx27WEH/G", "ZaIkD");
    }
    
    private static String llIlllIlIllIIlI(final String lllllllllllllIIlIIlIllIIlllllIll, final String lllllllllllllIIlIIlIllIIllllllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIllIlIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIllIIllllllII.getBytes(StandardCharsets.UTF_8)), CommandBanPlayer.lIIllllIIlIllI[7]), "DES");
            final Cipher lllllllllllllIIlIIlIllIIllllllll = Cipher.getInstance("DES");
            lllllllllllllIIlIIlIllIIllllllll.init(CommandBanPlayer.lIIllllIIlIllI[3], lllllllllllllIIlIIlIllIlIIIIIIII);
            return new String(lllllllllllllIIlIIlIllIIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIllIIlllllllI) {
            lllllllllllllIIlIIlIllIIlllllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllIllIlIIIl(final Object lllllllllllllIIlIIlIllIIlllIIlIl) {
        return lllllllllllllIIlIIlIllIIlllIIlIl != null;
    }
    
    private static boolean llIlllIllIlIIII(final Object lllllllllllllIIlIIlIllIIlllIIIll) {
        return lllllllllllllIIlIIlIllIIlllIIIll == null;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIIlIllIlIIIIlIII, final String[] lllllllllllllIIlIIlIllIlIIIIIlIl, final BlockPos lllllllllllllIIlIIlIllIlIIIIIllI) {
        List<String> listOfStringsMatchingLastWord;
        if (llIlllIllIIlllI(lllllllllllllIIlIIlIllIlIIIIIlIl.length, CommandBanPlayer.lIIllllIIlIllI[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIIlIllIlIIIIIlIl, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if ((0xFC ^ 0x99 ^ (0xA3 ^ 0xC2)) <= ((87 + 119 - 177 + 124 ^ 31 + 163 - 139 + 111) & (116 + 115 - 106 + 10 ^ 107 + 18 + 18 + 41 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    @Override
    public String getCommandName() {
        return CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[0]];
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIIlIllIlIIIlIIIl, final String[] lllllllllllllIIlIIlIllIlIIIlIIII) throws CommandException {
        if (!llIlllIllIIlllI(lllllllllllllIIlIIlIllIlIIIlIIII.length, CommandBanPlayer.lIIllllIIlIllI[2]) || !llIlllIllIIllll(lllllllllllllIIlIIlIllIlIIIlIIII[CommandBanPlayer.lIIllllIIlIllI[0]].length())) {
            throw new WrongUsageException(CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[5]], new Object[CommandBanPlayer.lIIllllIIlIllI[0]]);
        }
        final MinecraftServer lllllllllllllIIlIIlIllIlIIIlIlll = MinecraftServer.getServer();
        final GameProfile lllllllllllllIIlIIlIllIlIIIlIllI = lllllllllllllIIlIIlIllIlIIIlIlll.getPlayerProfileCache().getGameProfileForUsername(lllllllllllllIIlIIlIllIlIIIlIIII[CommandBanPlayer.lIIllllIIlIllI[0]]);
        if (llIlllIllIlIIII(lllllllllllllIIlIIlIllIlIIIlIllI)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[3]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandBanPlayer.lIIllllIIlIllI[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandBanPlayer.lIIllllIIlIllI[0]] = lllllllllllllIIlIIlIllIlIIIlIIII[CommandBanPlayer.lIIllllIIlIllI[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        String lllllllllllllIIlIIlIllIlIIIlIlIl = null;
        if (llIlllIllIIlllI(lllllllllllllIIlIIlIllIlIIIlIIII.length, CommandBanPlayer.lIIllllIIlIllI[3])) {
            lllllllllllllIIlIIlIllIlIIIlIlIl = CommandBase.getChatComponentFromNthArg(lllllllllllllIIlIIlIllIlIIIlIIIl, lllllllllllllIIlIIlIllIlIIIlIIII, CommandBanPlayer.lIIllllIIlIllI[2]).getUnformattedText();
        }
        final UserListBansEntry lllllllllllllIIlIIlIllIlIIIlIlII = new UserListBansEntry(lllllllllllllIIlIIlIllIlIIIlIllI, null, lllllllllllllIIlIIlIllIlIIIlIIIl.getName(), null, lllllllllllllIIlIIlIllIlIIIlIlIl);
        ((UserList<K, UserListBansEntry>)lllllllllllllIIlIIlIllIlIIIlIlll.getConfigurationManager().getBannedPlayers()).addEntry(lllllllllllllIIlIIlIllIlIIIlIlII);
        final EntityPlayerMP lllllllllllllIIlIIlIllIlIIIlIIll = lllllllllllllIIlIIlIllIlIIIlIlll.getConfigurationManager().getPlayerByUsername(lllllllllllllIIlIIlIllIlIIIlIIII[CommandBanPlayer.lIIllllIIlIllI[0]]);
        if (llIlllIllIlIIIl(lllllllllllllIIlIIlIllIlIIIlIIll)) {
            lllllllllllllIIlIIlIllIlIIIlIIll.playerNetServerHandler.kickPlayerFromServer(CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[1]]);
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[4]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandBanPlayer.lIIllllIIlIllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandBanPlayer.lIIllllIIlIllI[0]] = lllllllllllllIIlIIlIllIlIIIlIIII[CommandBanPlayer.lIIllllIIlIllI[0]];
        CommandBase.notifyOperators(lllllllllllllIIlIIlIllIlIIIlIIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (((0x43 ^ 0x69) & ~(0xBD ^ 0x97)) < -" ".length()) {
            return;
        }
    }
    
    private static boolean llIlllIllIIllIl(final int lllllllllllllIIlIIlIllIIlllIIIIl) {
        return lllllllllllllIIlIIlIllIIlllIIIIl != 0;
    }
    
    private static boolean llIlllIllIIllll(final int lllllllllllllIIlIIlIllIIllIlllll) {
        return lllllllllllllIIlIIlIllIIllIlllll > 0;
    }
    
    private static boolean llIlllIllIIlllI(final int lllllllllllllIIlIIlIllIIlllIlIII, final int lllllllllllllIIlIIlIllIIlllIIlll) {
        return lllllllllllllIIlIIlIllIIlllIlIII >= lllllllllllllIIlIIlIllIIlllIIlll;
    }
    
    static {
        llIlllIllIIllII();
        llIlllIlIlllIIl();
    }
    
    private static String llIlllIlIllIlIl(final String lllllllllllllIIlIIlIllIIllllIIII, final String lllllllllllllIIlIIlIllIIlllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIllIIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIllIIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIllIIllllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIllIIllllIIlI.init(CommandBanPlayer.lIIllllIIlIllI[3], lllllllllllllIIlIIlIllIIllllIIll);
            return new String(lllllllllllllIIlIIlIllIIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIllIIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIllIIllllIIIl) {
            lllllllllllllIIlIIlIllIIllllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender lllllllllllllIIlIIlIllIlIIlIIIll) {
        if (llIlllIllIIllIl(MinecraftServer.getServer().getConfigurationManager().getBannedPlayers().isLanServer() ? 1 : 0) && llIlllIllIIllIl(super.canCommandSenderUseCommand(lllllllllllllIIlIIlIllIlIIlIIIll) ? 1 : 0)) {
            return CommandBanPlayer.lIIllllIIlIllI[2] != 0;
        }
        return CommandBanPlayer.lIIllllIIlIllI[0] != 0;
    }
    
    private static void llIlllIllIIllII() {
        (lIIllllIIlIllI = new int[8])[0] = ((0xC2 ^ 0xB3 ^ (0xE0 ^ 0x86)) & (0xE7 ^ 0x83 ^ (0xEA ^ 0x99) ^ -" ".length()));
        CommandBanPlayer.lIIllllIIlIllI[1] = "   ".length();
        CommandBanPlayer.lIIllllIIlIllI[2] = " ".length();
        CommandBanPlayer.lIIllllIIlIllI[3] = "  ".length();
        CommandBanPlayer.lIIllllIIlIllI[4] = (0x82 ^ 0x8C ^ (0x84 ^ 0x8E));
        CommandBanPlayer.lIIllllIIlIllI[5] = (0x8A ^ 0x8F);
        CommandBanPlayer.lIIllllIIlIllI[6] = (0x1A ^ 0x71 ^ (0xCF ^ 0xA2));
        CommandBanPlayer.lIIllllIIlIllI[7] = (116 + 111 - 118 + 25 ^ 50 + 70 - 113 + 135);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandBanPlayer.lIIllllIIlIllI[1];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIIlIllIlIIlIlIIl) {
        return CommandBanPlayer.lIIllllIIlIIIl[CommandBanPlayer.lIIllllIIlIllI[2]];
    }
}
