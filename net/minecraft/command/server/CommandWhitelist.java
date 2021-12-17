// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import com.mojang.authlib.GameProfile;
import net.minecraft.command.CommandException;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.command.ICommand;
import net.minecraft.command.WrongUsageException;
import java.util.Arrays;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandWhitelist extends CommandBase
{
    private static final /* synthetic */ String[] llIIlIIIIllIll;
    private static final /* synthetic */ int[] llIIlIIIIlllll;
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllIIllIIllIIIlIlIl) {
        return CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[2]];
    }
    
    private static boolean lIIIlIlllIllllIl(final Object llllllllllllIlllIIllIIlIllIIIIlI) {
        return llllllllllllIlllIIllIIlIllIIIIlI == null;
    }
    
    private static boolean lIIIlIlllIlllIll(final int llllllllllllIlllIIllIIlIllIIIlIl, final int llllllllllllIlllIIllIIlIllIIIlII) {
        return llllllllllllIlllIIllIIlIllIIIlIl < llllllllllllIlllIIllIIlIllIIIlII;
    }
    
    @Override
    public String getCommandName() {
        return CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[0]];
    }
    
    private static String lIIIlIlllIllIlII(final String llllllllllllIlllIIllIIlIllllIlII, final String llllllllllllIlllIIllIIlIllllIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIlIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIlIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllIIlIlllllIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllIIlIlllllIII.init(CommandWhitelist.llIIlIIIIlllll[3], llllllllllllIlllIIllIIlIlllllIIl);
            return new String(llllllllllllIlllIIllIIlIlllllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIlIllllIlll) {
            llllllllllllIlllIIllIIlIllllIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlllIIllIIllIIIIIIIl, final String[] llllllllllllIlllIIllIIlIlllllllI, final BlockPos llllllllllllIlllIIllIIlIllllllll) {
        if (lIIIlIlllIlllllI(llllllllllllIlllIIllIIlIlllllllI.length, CommandWhitelist.llIIlIIIIlllll[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandWhitelist.llIIlIIIIlllll[6]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[0]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[19]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[2]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[20]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[3]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[21]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[1]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[22]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[4]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[23]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWhitelist.llIIlIIIIlllll[5]] = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[24]];
            return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIllIIlIlllllllI, lllllllllllllIIIIlIlllIIIllIllII);
        }
        if (lIIIlIlllIlllllI(llllllllllllIlllIIllIIlIlllllllI.length, CommandWhitelist.llIIlIIIIlllll[3])) {
            if (lIIIlIlllIllllII(llllllllllllIlllIIllIIlIlllllllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[25]]) ? 1 : 0)) {
                return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIllIIlIlllllllI, MinecraftServer.getServer().getConfigurationManager().getWhitelistedPlayerNames());
            }
            if (lIIIlIlllIllllII(llllllllllllIlllIIllIIlIlllllllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[26]]) ? 1 : 0)) {
                return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlllIIllIIlIlllllllI, MinecraftServer.getServer().getPlayerProfileCache().getUsernames());
            }
        }
        return null;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandWhitelist.llIIlIIIIlllll[1];
    }
    
    private static void lIIIlIlllIlllIIl() {
        (llIIlIIIIllIll = new String[CommandWhitelist.llIIlIIIIlllll[27]])[CommandWhitelist.llIIlIIIIlllll[0]] = lIIIlIlllIllIIlI("BC89BBUfLicE", "sGTpp");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[2]] = lIIIlIlllIllIIlI("CBwLAjUFFxVBIwMaEgo4AgASQSEYEgEK", "ksfoT");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[3]] = lIIIlIlllIllIIll("Z9L7mWr4qi1mbbJ/4gwVfCzw6Cm5tLgyWDGe9TSWuHY=", "cIAUx");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[1]] = lIIIlIlllIllIIll("so/9M7tJ77c=", "fgPzZ");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[4]] = lIIIlIlllIllIIll("G8My2Az2vjK/6Zz9M6VDhviUcJX9pp4t6zvjIjhKHgM=", "POuac");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[5]] = lIIIlIlllIllIIll("tHMYCaAbJuE=", "Lfkas");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[6]] = lIIIlIlllIllIlII("rMX3jNx4kGn0lz4U2/MNqE4DHIlWZ3uOj6z//YCYSYI=", "WlNKN");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[7]] = lIIIlIlllIllIlII("f57sOqWTY/8=", "nIpyp");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[8]] = lIIIlIlllIllIlII("fW/fiqxDOd2bsNjsF9FaXx2LRkQNVhqb", "AyKIL");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[9]] = lIIIlIlllIllIIll("F4KmllkJQeU=", "eyrrD");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[10]] = lIIIlIlllIllIlII("x9XKFlc97uV89d83d6oFIIQKRbdnNxWhUgynMucPWeg=", "oNyFE");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[11]] = lIIIlIlllIllIIll("xa89wquiZe29WmbESD+W5iNzLZa9F0JFRozlkqMtzj8=", "NybFm");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[12]] = lIIIlIlllIllIIlI("JgkILCorAhZvPC0PESQnLBURbyohAksyPiYFADI4", "EfeAK");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[13]] = lIIIlIlllIllIIll("3rFvS2M9ZEM=", "YXgvm");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[14]] = lIIIlIlllIllIIlI("GRkMDhEUEhJNBxIfFQYcEwUVTQIfGw4VFVQDEgIXHw==", "zvacp");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[15]] = lIIIlIlllIllIlII("E4mrb2L+Qw7yolKlBv7l0Y/5LKl6692XCN2u1HX7/4+fTA3SOvcU4Q==", "TMMBi");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[16]] = lIIIlIlllIllIlII("Q2E/EHHXV8RuSXYoqCwcVxwcr/qeFcU8Slq22LVJoywyPk9OjvfXWQ==", "QfkYG");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[17]] = lIIIlIlllIllIIll("xwYQJee1jXM=", "klBcR");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[18]] = lIIIlIlllIllIlII("fXDgE8L4WZ9Toei4VptNZ+wQNxxSUk+FCLUOzZ9S6c0=", "LSBKv");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[19]] = lIIIlIlllIllIIlI("FT4=", "zPkVr");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[20]] = lIIIlIlllIllIIll("w/VXsFR1xTg=", "zXPiD");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[21]] = lIIIlIlllIllIIlI("OggqHQ==", "VaYiX");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[22]] = lIIIlIlllIllIIlI("Fwch", "vcEjk");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[23]] = lIIIlIlllIllIlII("i/VwIJhWhKk=", "fnxSY");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[24]] = lIIIlIlllIllIlII("1EVt9b+o280=", "HDGoT");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[25]] = lIIIlIlllIllIIll("aXvZ14A8Vao=", "XPqaR");
        CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[26]] = lIIIlIlllIllIIll("mTY30reFdSU=", "dHnMd");
    }
    
    private static String lIIIlIlllIllIIll(final String llllllllllllIlllIIllIIlIllIlIIIl, final String llllllllllllIlllIIllIIlIllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIlIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIlIllIIlllI.getBytes(StandardCharsets.UTF_8)), CommandWhitelist.llIIlIIIIlllll[8]), "DES");
            final Cipher llllllllllllIlllIIllIIlIllIlIIll = Cipher.getInstance("DES");
            llllllllllllIlllIIllIIlIllIlIIll.init(CommandWhitelist.llIIlIIIIlllll[3], llllllllllllIlllIIllIIlIllIlIlII);
            return new String(llllllllllllIlllIIllIIlIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIlIllIlIIlI) {
            llllllllllllIlllIIllIIlIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIlllIllllII(final int llllllllllllIlllIIllIIlIllIIIIII) {
        return llllllllllllIlllIIllIIlIllIIIIII != 0;
    }
    
    static {
        lIIIlIlllIlllIlI();
        lIIIlIlllIlllIIl();
    }
    
    private static void lIIIlIlllIlllIlI() {
        (llIIlIIIIlllll = new int[28])[0] = ((118 + 121 - 63 + 23 ^ 26 + 59 - 79 + 126) & (33 + 195 - 225 + 250 ^ 23 + 17 + 100 + 50 ^ -" ".length()));
        CommandWhitelist.llIIlIIIIlllll[1] = "   ".length();
        CommandWhitelist.llIIlIIIIlllll[2] = " ".length();
        CommandWhitelist.llIIlIIIIlllll[3] = "  ".length();
        CommandWhitelist.llIIlIIIIlllll[4] = (25 + 123 - 54 + 51 ^ 131 + 78 - 176 + 116);
        CommandWhitelist.llIIlIIIIlllll[5] = (0x99 ^ 0x91 ^ (0x6A ^ 0x67));
        CommandWhitelist.llIIlIIIIlllll[6] = (153 + 147 - 280 + 149 ^ 85 + 135 - 193 + 148);
        CommandWhitelist.llIIlIIIIlllll[7] = (0x80 ^ 0x87);
        CommandWhitelist.llIIlIIIIlllll[8] = (48 + 143 - 136 + 150 ^ 132 + 148 - 269 + 186);
        CommandWhitelist.llIIlIIIIlllll[9] = (0x4E ^ 0x5E ^ (0x10 ^ 0x9));
        CommandWhitelist.llIIlIIIIlllll[10] = (0x97 ^ 0x9D);
        CommandWhitelist.llIIlIIIIlllll[11] = (0xAD ^ 0xA6);
        CommandWhitelist.llIIlIIIIlllll[12] = (0x3 ^ 0xF);
        CommandWhitelist.llIIlIIIIlllll[13] = (0xB4 ^ 0xB9);
        CommandWhitelist.llIIlIIIIlllll[14] = (0x55 ^ 0x6B ^ (0x3A ^ 0xA));
        CommandWhitelist.llIIlIIIIlllll[15] = (0xAD ^ 0xA2);
        CommandWhitelist.llIIlIIIIlllll[16] = (0x1A ^ 0x4E ^ (0x48 ^ 0xC));
        CommandWhitelist.llIIlIIIIlllll[17] = (53 + 99 - 54 + 37 ^ 142 + 99 - 221 + 130);
        CommandWhitelist.llIIlIIIIlllll[18] = (0x4 ^ 0x4A ^ (0xEB ^ 0xB7));
        CommandWhitelist.llIIlIIIIlllll[19] = (0x71 ^ 0x43 ^ (0x39 ^ 0x18));
        CommandWhitelist.llIIlIIIIlllll[20] = (0x5 ^ 0x1A ^ (0x11 ^ 0x1A));
        CommandWhitelist.llIIlIIIIlllll[21] = (0xEB ^ 0x80 ^ (0x3D ^ 0x43));
        CommandWhitelist.llIIlIIIIlllll[22] = (0xB6 ^ 0xA0);
        CommandWhitelist.llIIlIIIIlllll[23] = (0xD8 ^ 0xBD ^ (0xE2 ^ 0x90));
        CommandWhitelist.llIIlIIIIlllll[24] = (0x93 ^ 0x8B);
        CommandWhitelist.llIIlIIIIlllll[25] = (0x73 ^ 0x66 ^ (0x5B ^ 0x57));
        CommandWhitelist.llIIlIIIIlllll[26] = (0x6D ^ 0x77);
        CommandWhitelist.llIIlIIIIlllll[27] = (0xBF ^ 0xA4);
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllIIllIIllIIIIIlll, final String[] llllllllllllIlllIIllIIllIIIIIllI) throws CommandException {
        if (lIIIlIlllIlllIll(llllllllllllIlllIIllIIllIIIIIllI.length, CommandWhitelist.llIIlIIIIlllll[2])) {
            throw new WrongUsageException(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[3]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
        }
        final MinecraftServer llllllllllllIlllIIllIIllIIIIllII = MinecraftServer.getServer();
        if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[1]]) ? 1 : 0)) {
            llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().setWhiteListEnabled((boolean)(CommandWhitelist.llIIlIIIIlllll[2] != 0));
            CommandBase.notifyOperators(llllllllllllIlllIIllIIllIIIIIlll, this, CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[4]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[5]]) ? 1 : 0)) {
            llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().setWhiteListEnabled((boolean)(CommandWhitelist.llIIlIIIIlllll[0] != 0));
            CommandBase.notifyOperators(llllllllllllIlllIIllIIllIIIIIlll, this, CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[6]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[7]]) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[8]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandWhitelist.llIIlIIIIlllll[3]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandWhitelist.llIIlIIIIlllll[0]] = llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().getWhitelistedPlayerNames().length;
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandWhitelist.llIIlIIIIlllll[2]] = llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().getAvailablePlayerDat().length;
            llllllllllllIlllIIllIIllIIIIIlll.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
            final String[] llllllllllllIlllIIllIIllIIIIlIll = llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().getWhitelistedPlayerNames();
            llllllllllllIlllIIllIIllIIIIIlll.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(llllllllllllIlllIIllIIllIIIIlIll)));
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[9]]) ? 1 : 0)) {
            if (lIIIlIlllIlllIll(llllllllllllIlllIIllIIllIIIIIllI.length, CommandWhitelist.llIIlIIIIlllll[3])) {
                throw new WrongUsageException(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[10]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
            }
            final GameProfile llllllllllllIlllIIllIIllIIIIlIlI = llllllllllllIlllIIllIIllIIIIllII.getPlayerProfileCache().getGameProfileForUsername(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]]);
            if (lIIIlIlllIllllIl(llllllllllllIlllIIllIIllIIIIlIlI)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[11]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandWhitelist.llIIlIIIIlllll[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandWhitelist.llIIlIIIIlllll[0]] = llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]];
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().addWhitelistedPlayer(llllllllllllIlllIIllIIllIIIIlIlI);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[12]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandWhitelist.llIIlIIIIlllll[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandWhitelist.llIIlIIIIlllll[0]] = llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]];
            CommandBase.notifyOperators(llllllllllllIlllIIllIIllIIIIIlll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[13]]) ? 1 : 0)) {
            if (lIIIlIlllIlllIll(llllllllllllIlllIIllIIllIIIIIllI.length, CommandWhitelist.llIIlIIIIlllll[3])) {
                throw new WrongUsageException(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[14]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
            }
            final GameProfile llllllllllllIlllIIllIIllIIIIlIIl = llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().getWhitelistedPlayers().func_152706_a(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]]);
            if (lIIIlIlllIllllIl(llllllllllllIlllIIllIIllIIIIlIIl)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[15]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandWhitelist.llIIlIIIIlllll[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandWhitelist.llIIlIIIIlllll[0]] = llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]];
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
            llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().removePlayerFromWhitelist(llllllllllllIlllIIllIIllIIIIlIIl);
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[16]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandWhitelist.llIIlIIIIlllll[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandWhitelist.llIIlIIIIlllll[0]] = llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[2]];
            CommandBase.notifyOperators(llllllllllllIlllIIllIIllIIIIIlll, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else if (lIIIlIlllIllllII(llllllllllllIlllIIllIIllIIIIIllI[CommandWhitelist.llIIlIIIIlllll[0]].equals(CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[17]]) ? 1 : 0)) {
            llllllllllllIlllIIllIIllIIIIllII.getConfigurationManager().loadWhiteList();
            CommandBase.notifyOperators(llllllllllllIlllIIllIIllIIIIIlll, this, CommandWhitelist.llIIlIIIIllIll[CommandWhitelist.llIIlIIIIlllll[18]], new Object[CommandWhitelist.llIIlIIIIlllll[0]]);
        }
    }
    
    private static boolean lIIIlIlllIlllllI(final int llllllllllllIlllIIllIIlIllIIlIIl, final int llllllllllllIlllIIllIIlIllIIlIII) {
        return llllllllllllIlllIIllIIlIllIIlIIl == llllllllllllIlllIIllIIlIllIIlIII;
    }
    
    private static String lIIIlIlllIllIIlI(String llllllllllllIlllIIllIIlIlllIIIIl, final String llllllllllllIlllIIllIIlIlllIIIII) {
        llllllllllllIlllIIllIIlIlllIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIIlIlllIIlII = new StringBuilder();
        final char[] llllllllllllIlllIIllIIlIlllIIIll = llllllllllllIlllIIllIIlIlllIIIII.toCharArray();
        int llllllllllllIlllIIllIIlIlllIIIlI = CommandWhitelist.llIIlIIIIlllll[0];
        final Exception llllllllllllIlllIIllIIlIllIlllII = (Object)llllllllllllIlllIIllIIlIlllIIIIl.toCharArray();
        final int llllllllllllIlllIIllIIlIllIllIll = llllllllllllIlllIIllIIlIllIlllII.length;
        double llllllllllllIlllIIllIIlIllIllIlI = CommandWhitelist.llIIlIIIIlllll[0];
        while (lIIIlIlllIlllIll((int)llllllllllllIlllIIllIIlIllIllIlI, llllllllllllIlllIIllIIlIllIllIll)) {
            final char llllllllllllIlllIIllIIlIlllIIlll = llllllllllllIlllIIllIIlIllIlllII[llllllllllllIlllIIllIIlIllIllIlI];
            llllllllllllIlllIIllIIlIlllIIlII.append((char)(llllllllllllIlllIIllIIlIlllIIlll ^ llllllllllllIlllIIllIIlIlllIIIll[llllllllllllIlllIIllIIlIlllIIIlI % llllllllllllIlllIIllIIlIlllIIIll.length]));
            "".length();
            ++llllllllllllIlllIIllIIlIlllIIIlI;
            ++llllllllllllIlllIIllIIlIllIllIlI;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIIlIlllIIlII);
    }
}
