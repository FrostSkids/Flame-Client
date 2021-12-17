// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.command.CommandException;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.command.WrongUsageException;
import java.util.Arrays;
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

public class CommandMessage extends CommandBase
{
    private static final /* synthetic */ String[] lIIIlllIIIlIII;
    private static final /* synthetic */ int[] lIIIlllIIIlIIl;
    
    static {
        llIIIlIllIllIll();
        llIIIlIllIllIlI();
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllllllIIIIlIIIllI, final String[] lllllllllllllIIllllllIIIIlIIIIll, final BlockPos lllllllllllllIIllllllIIIIlIIIlII) {
        return CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllllllIIIIlIIIIll, MinecraftServer.getServer().getAllUsernames());
    }
    
    private static void llIIIlIllIllIlI() {
        (lIIIlllIIIlIII = new String[CommandMessage.lIIIlllIIIlIIl[8]])[CommandMessage.lIIIlllIIIlIIl[1]] = llIIIlIllIllIII("/uz6QXNgdBg=", "AdIWe");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[2]] = llIIIlIllIllIII("YPoi5C+3oxM=", "PBioE");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[0]] = llIIIlIllIllIIl("75xDB7Erego=", "giOQk");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[3]] = llIIIlIllIllIIl("VMuOL+ghbwM4V/l2e3nNl59I4p1PXTAQ", "hwiny");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[4]] = llIIIlIllIllIII("mCU5VIU9uNsTi/ofrKfIxZnv3jgg47lO", "lBzFS");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[5]] = llIIIlIllIllIII("Oi+uDJ19PG58vxSIunFAMWwraVHwqdCYos9LqRJhi6s=", "Gpnxp");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[6]] = llIIIlIllIllIIl("Fz19yHW4/H551728LZ6YcErvHoNMPJWbmqAUm7TXUvDFIzkbEfRq3w==", "Epfhp");
        CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[7]] = llIIIlIllIllIIl("fYJnEGA5m6kKVtOPMlWIEzSH4I1wzs9DCHi74lV/IiV3YHQk/ewkNA==", "MfHpv");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllllllIIIIlIlllII) {
        return CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[3]];
    }
    
    private static void llIIIlIllIllIll() {
        (lIIIlllIIIlIIl = new int[9])[0] = "  ".length();
        CommandMessage.lIIIlllIIIlIIl[1] = ((0x8C ^ 0xB4) & ~(0x93 ^ 0xAB));
        CommandMessage.lIIIlllIIIlIIl[2] = " ".length();
        CommandMessage.lIIIlllIIIlIIl[3] = "   ".length();
        CommandMessage.lIIIlllIIIlIIl[4] = (0xD1 ^ 0x8F ^ (0x17 ^ 0x4D));
        CommandMessage.lIIIlllIIIlIIl[5] = (40 + 113 - 74 + 67 ^ 137 + 47 - 110 + 77);
        CommandMessage.lIIIlllIIIlIIl[6] = (0x91 ^ 0x97);
        CommandMessage.lIIIlllIIIlIIl[7] = (0x37 ^ 0x30);
        CommandMessage.lIIIlllIIIlIIl[8] = (0x26 ^ 0x2E);
    }
    
    @Override
    public String getCommandName() {
        return CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[0]];
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIllllllIIIIlIIIIII, final int lllllllllllllIIllllllIIIIIllllll) {
        if (llIIIlIllIlllll(lllllllllllllIIllllllIIIIIllllll)) {
            return CommandMessage.lIIIlllIIIlIIl[2] != 0;
        }
        return CommandMessage.lIIIlllIIIlIIl[1] != 0;
    }
    
    private static String llIIIlIllIllIIl(final String lllllllllllllIIllllllIIIIIlIIlll, final String lllllllllllllIIllllllIIIIIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllIIIIIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllIIIIIlIlIll.init(CommandMessage.lIIIlllIIIlIIl[0], lllllllllllllIIllllllIIIIIlIllII);
            return new String(lllllllllllllIIllllllIIIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIIIIlIlIlI) {
            lllllllllllllIIllllllIIIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIllIllllI(final int lllllllllllllIIllllllIIIIIIllIlI) {
        return lllllllllllllIIllllllIIIIIIllIlI != 0;
    }
    
    private static boolean llIIIlIllIlllII(final int lllllllllllllIIllllllIIIIIlIIIIl, final int lllllllllllllIIllllllIIIIIlIIIII) {
        return lllllllllllllIIllllllIIIIIlIIIIl < lllllllllllllIIllllllIIIIIlIIIII;
    }
    
    @Override
    public List<String> getCommandAliases() {
        final String[] a = new String[CommandMessage.lIIIlllIIIlIIl[0]];
        a[CommandMessage.lIIIlllIIIlIIl[1]] = CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[1]];
        a[CommandMessage.lIIIlllIIIlIIl[2]] = CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[2]];
        return Arrays.asList(a);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandMessage.lIIIlllIIIlIIl[1];
    }
    
    private static String llIIIlIllIllIII(final String lllllllllllllIIllllllIIIIIllIlII, final String lllllllllllllIIllllllIIIIIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), CommandMessage.lIIIlllIIIlIIl[8]), "DES");
            final Cipher lllllllllllllIIllllllIIIIIlllIII = Cipher.getInstance("DES");
            lllllllllllllIIllllllIIIIIlllIII.init(CommandMessage.lIIIlllIIIlIIl[0], lllllllllllllIIllllllIIIIIlllIIl);
            return new String(lllllllllllllIIllllllIIIIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIIIIllIlll) {
            lllllllllllllIIllllllIIIIIllIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllllllIIIIlIlIlII, final String[] lllllllllllllIIllllllIIIIlIlIIll) throws CommandException {
        if (llIIIlIllIlllII(lllllllllllllIIllllllIIIIlIlIIll.length, CommandMessage.lIIIlllIIIlIIl[0])) {
            throw new WrongUsageException(CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[4]], new Object[CommandMessage.lIIIlllIIIlIIl[1]]);
        }
        final EntityPlayer lllllllllllllIIllllllIIIIlIlIIlI = CommandBase.getPlayer(lllllllllllllIIllllllIIIIlIlIlII, lllllllllllllIIllllllIIIIlIlIIll[CommandMessage.lIIIlllIIIlIIl[1]]);
        if (llIIIlIllIlllIl(lllllllllllllIIllllllIIIIlIlIIlI, lllllllllllllIIllllllIIIIlIlIlII)) {
            throw new PlayerNotFoundException(CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[5]], new Object[CommandMessage.lIIIlllIIIlIIl[1]]);
        }
        final int lllllllllllllIIIIlIlllIlIIlIIIll = CommandMessage.lIIIlllIIIlIIl[2];
        int lllllllllllllIIIIlIlllIlIIlIIIlI;
        if (llIIIlIllIllllI((lllllllllllllIIllllllIIIIlIlIlII instanceof EntityPlayer) ? 1 : 0)) {
            lllllllllllllIIIIlIlllIlIIlIIIlI = CommandMessage.lIIIlllIIIlIIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIlIlllIlIIlIIIlI = CommandMessage.lIIIlllIIIlIIl[2];
        }
        final IChatComponent lllllllllllllIIllllllIIIIlIlIIIl = CommandBase.getChatComponentFromNthArg(lllllllllllllIIllllllIIIIlIlIlII, lllllllllllllIIllllllIIIIlIlIIll, lllllllllllllIIIIlIlllIlIIlIIIll, (boolean)(lllllllllllllIIIIlIlllIlIIlIIIlI != 0));
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[6]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandMessage.lIIIlllIIIlIIl[0]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandMessage.lIIIlllIIIlIIl[1]] = lllllllllllllIIllllllIIIIlIlIlII.getDisplayName();
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandMessage.lIIIlllIIIlIIl[2]] = lllllllllllllIIllllllIIIIlIlIIIl.createCopy();
        final ChatComponentTranslation lllllllllllllIIllllllIIIIlIlIIII = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
        final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = CommandMessage.lIIIlllIIIlIII[CommandMessage.lIIIlllIIIlIIl[7]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[CommandMessage.lIIIlllIIIlIIl[0]];
        lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandMessage.lIIIlllIIIlIIl[1]] = lllllllllllllIIllllllIIIIlIlIIlI.getDisplayName();
        lllllllllllllIlIIlIlllIIlIIIIIIl2[CommandMessage.lIIIlllIIIlIIl[2]] = lllllllllllllIIllllllIIIIlIlIIIl.createCopy();
        final ChatComponentTranslation lllllllllllllIIllllllIIIIlIIllll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
        lllllllllllllIIllllllIIIIlIlIIII.getChatStyle().setColor(EnumChatFormatting.GRAY).setItalic((boolean)(CommandMessage.lIIIlllIIIlIIl[2] != 0));
        "".length();
        lllllllllllllIIllllllIIIIlIIllll.getChatStyle().setColor(EnumChatFormatting.GRAY).setItalic((boolean)(CommandMessage.lIIIlllIIIlIIl[2] != 0));
        "".length();
        lllllllllllllIIllllllIIIIlIlIIlI.addChatMessage(lllllllllllllIIllllllIIIIlIlIIII);
        lllllllllllllIIllllllIIIIlIlIlII.addChatMessage(lllllllllllllIIllllllIIIIlIIllll);
    }
    
    private static boolean llIIIlIllIlllll(final int lllllllllllllIIllllllIIIIIIllIII) {
        return lllllllllllllIIllllllIIIIIIllIII == 0;
    }
    
    private static boolean llIIIlIllIlllIl(final Object lllllllllllllIIllllllIIIIIIlllIl, final Object lllllllllllllIIllllllIIIIIIlllII) {
        return lllllllllllllIIllllllIIIIIIlllIl == lllllllllllllIIllllllIIIIIIlllII;
    }
}
