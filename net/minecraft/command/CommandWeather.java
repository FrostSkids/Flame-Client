// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.World;
import net.minecraft.server.MinecraftServer;
import java.util.Random;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommandWeather extends CommandBase
{
    private static final /* synthetic */ int[] lIlIlIIIlIIlll;
    private static final /* synthetic */ String[] lIlIlIIIlIIllI;
    
    private static void lllIlIllIllIlIl() {
        (lIlIlIIIlIIllI = new String[CommandWeather.lIlIlIIIlIIlll[17]])[CommandWeather.lIlIlIIIlIIlll[0]] = lllIlIllIllIIlI("hStsCnhEyKE=", "uJAaK");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[2]] = lllIlIllIllIIll("ORoHNTA0ERl2Jj8UHjA0KFsfKzA9EA==", "ZujXQ");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[1]] = lllIlIllIllIlII("5/DQzL1sjqc=", "Mgtib");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[7]] = lllIlIllIllIlII("lnIH7J8+eLFx+cIyj4kMvB8Q4JId6/Fk", "DDnYL");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[8]] = lllIlIllIllIlII("z1IUciZqcGE=", "sfTfq");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[9]] = lllIlIllIllIIll("KiAXLAMnKwlvFSwuDikHO2EIIAsn", "IOzAb");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[10]] = lllIlIllIllIIlI("Uqhcg7ulqsk=", "gdZUF");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[11]] = lllIlIllIllIIlI("42XSK7x2cL2xRIX3IDJbyX9WJUx3X+8M", "yofTc");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[12]] = lllIlIllIllIIll("BQQhKwAIDz9oFgMKOC4EFEU4LhQIDyk0", "fkLFa");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[13]] = lllIlIllIllIlII("KJzBBSA5XxhrHAnpt58gFOTRBzjd1H+I", "SaiYI");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[14]] = lllIlIllIllIlII("68eUkAmwZy8=", "YadEu");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[15]] = lllIlIllIllIlII("6RunyKdOrG4=", "tJWIJ");
        CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[16]] = lllIlIllIllIIll("Oy4QASoqNA==", "OFeoN");
    }
    
    @Override
    public String getCommandName() {
        return CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[0]];
    }
    
    static {
        lllIlIllIllIllI();
        lllIlIllIllIlIl();
    }
    
    private static String lllIlIllIllIIll(String lllllllllllllIIIlIlIlIllIIllllll, final String lllllllllllllIIIlIlIlIllIlIIIIll) {
        lllllllllllllIIIlIlIlIllIIllllll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIlIllIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIlIllIlIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIlIllIlIIIIIl = lllllllllllllIIIlIlIlIllIlIIIIll.toCharArray();
        int lllllllllllllIIIlIlIlIllIlIIIIII = CommandWeather.lIlIlIIIlIIlll[0];
        final String lllllllllllllIIIlIlIlIllIIlllIlI = (Object)((String)lllllllllllllIIIlIlIlIllIIllllll).toCharArray();
        final double lllllllllllllIIIlIlIlIllIIlllIIl = lllllllllllllIIIlIlIlIllIIlllIlI.length;
        double lllllllllllllIIIlIlIlIllIIlllIII = CommandWeather.lIlIlIIIlIIlll[0];
        while (lllIlIllIllllII((int)lllllllllllllIIIlIlIlIllIIlllIII, (int)lllllllllllllIIIlIlIlIllIIlllIIl)) {
            final char lllllllllllllIIIlIlIlIllIlIIIlIl = lllllllllllllIIIlIlIlIllIIlllIlI[lllllllllllllIIIlIlIlIllIIlllIII];
            lllllllllllllIIIlIlIlIllIlIIIIlI.append((char)(lllllllllllllIIIlIlIlIllIlIIIlIl ^ lllllllllllllIIIlIlIlIllIlIIIIIl[lllllllllllllIIIlIlIlIllIlIIIIII % lllllllllllllIIIlIlIlIllIlIIIIIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIlIllIlIIIIII;
            ++lllllllllllllIIIlIlIlIllIIlllIII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIlIllIlIIIIlI);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIlIlIlIllIlIlllll, final String[] lllllllllllllIIIlIlIlIllIlIllllI, final BlockPos lllllllllllllIIIlIlIlIllIlIlllIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lllIlIllIlllIll(lllllllllllllIIIlIlIlIllIlIllllI.length, CommandWeather.lIlIlIIIlIIlll[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandWeather.lIlIlIIIlIIlll[7]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWeather.lIlIlIIIlIIlll[0]] = CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[14]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWeather.lIlIlIIIlIIlll[2]] = CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[15]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWeather.lIlIlIIIlIIlll[1]] = CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[16]];
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIlIlIllIlIllllI, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static String lllIlIllIllIlII(final String lllllllllllllIIIlIlIlIllIlIlIlII, final String lllllllllllllIIIlIlIlIllIlIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlIllIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIlIllIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIlIllIlIlIllI.init(CommandWeather.lIlIlIIIlIIlll[1], lllllllllllllIIIlIlIlIllIlIlIlll);
            return new String(lllllllllllllIIIlIlIlIllIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIllIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlIllIlIlIlIl) {
            lllllllllllllIIIlIlIlIllIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandWeather.lIlIlIIIlIIlll[1];
    }
    
    private static boolean lllIlIllIllllII(final int lllllllllllllIIIlIlIlIllIIIlllll, final int lllllllllllllIIIlIlIlIllIIIllllI) {
        return lllllllllllllIIIlIlIlIllIIIlllll < lllllllllllllIIIlIlIlIllIIIllllI;
    }
    
    private static String lllIlIllIllIIlI(final String lllllllllllllIIIlIlIlIllIIlIllll, final String lllllllllllllIIIlIlIlIllIIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlIllIIlIllII.getBytes(StandardCharsets.UTF_8)), CommandWeather.lIlIlIIIlIIlll[12]), "DES");
            final Cipher lllllllllllllIIIlIlIlIllIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIlIllIIllIIIl.init(CommandWeather.lIlIlIIIlIIlll[1], lllllllllllllIIIlIlIlIllIIllIIlI);
            return new String(lllllllllllllIIIlIlIlIllIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIllIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlIllIIllIIII) {
            lllllllllllllIIIlIlIlIllIIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIllIllIlll(final int lllllllllllllIIIlIlIlIllIIlIIIll, final int lllllllllllllIIIlIlIlIllIIlIIIlI) {
        return lllllllllllllIIIlIlIlIllIIlIIIll >= lllllllllllllIIIlIlIlIllIIlIIIlI;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIlIlIlIllIllIIllI, final String[] lllllllllllllIIIlIlIlIllIllIlIll) throws CommandException {
        if (lllIlIllIllIlll(lllllllllllllIIIlIlIlIllIllIlIll.length, CommandWeather.lIlIlIIIlIIlll[2]) && lllIlIllIlllIII(lllllllllllllIIIlIlIlIllIllIlIll.length, CommandWeather.lIlIlIIIlIIlll[1])) {
            int lllllllllllllIIIlIlIlIllIllIlIlI = (CommandWeather.lIlIlIIIlIIlll[3] + new Random().nextInt(CommandWeather.lIlIlIIIlIIlll[4])) * CommandWeather.lIlIlIIIlIIlll[5];
            if (lllIlIllIllIlll(lllllllllllllIIIlIlIlIllIllIlIll.length, CommandWeather.lIlIlIIIlIIlll[1])) {
                lllllllllllllIIIlIlIlIllIllIlIlI = CommandBase.parseInt(lllllllllllllIIIlIlIlIllIllIlIll[CommandWeather.lIlIlIIIlIIlll[2]], CommandWeather.lIlIlIIIlIIlll[2], CommandWeather.lIlIlIIIlIIlll[6]) * CommandWeather.lIlIlIIIlIIlll[5];
            }
            final World lllllllllllllIIIlIlIlIllIllIlIIl = MinecraftServer.getServer().worldServers[CommandWeather.lIlIlIIIlIIlll[0]];
            final WorldInfo lllllllllllllIIIlIlIlIllIllIlIII = lllllllllllllIIIlIlIlIllIllIlIIl.getWorldInfo();
            if (lllIlIllIlllIIl(CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[1]].equalsIgnoreCase(lllllllllllllIIIlIlIlIllIllIlIll[CommandWeather.lIlIlIIIlIIlll[0]]) ? 1 : 0)) {
                lllllllllllllIIIlIlIlIllIllIlIII.setCleanWeatherTime(lllllllllllllIIIlIlIlIllIllIlIlI);
                lllllllllllllIIIlIlIlIllIllIlIII.setRainTime(CommandWeather.lIlIlIIIlIIlll[0]);
                lllllllllllllIIIlIlIlIllIllIlIII.setThunderTime(CommandWeather.lIlIlIIIlIIlll[0]);
                lllllllllllllIIIlIlIlIllIllIlIII.setRaining((boolean)(CommandWeather.lIlIlIIIlIIlll[0] != 0));
                lllllllllllllIIIlIlIlIllIllIlIII.setThundering((boolean)(CommandWeather.lIlIlIIIlIIlll[0] != 0));
                CommandBase.notifyOperators(lllllllllllllIIIlIlIlIllIllIIllI, this, CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[7]], new Object[CommandWeather.lIlIlIIIlIIlll[0]]);
                "".length();
                if ("  ".length() > (0x2D ^ 0x29)) {
                    return;
                }
            }
            else if (lllIlIllIlllIIl(CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[8]].equalsIgnoreCase(lllllllllllllIIIlIlIlIllIllIlIll[CommandWeather.lIlIlIIIlIIlll[0]]) ? 1 : 0)) {
                lllllllllllllIIIlIlIlIllIllIlIII.setCleanWeatherTime(CommandWeather.lIlIlIIIlIIlll[0]);
                lllllllllllllIIIlIlIlIllIllIlIII.setRainTime(lllllllllllllIIIlIlIlIllIllIlIlI);
                lllllllllllllIIIlIlIlIllIllIlIII.setThunderTime(lllllllllllllIIIlIlIlIllIllIlIlI);
                lllllllllllllIIIlIlIlIllIllIlIII.setRaining((boolean)(CommandWeather.lIlIlIIIlIIlll[2] != 0));
                lllllllllllllIIIlIlIlIllIllIlIII.setThundering((boolean)(CommandWeather.lIlIlIIIlIIlll[0] != 0));
                CommandBase.notifyOperators(lllllllllllllIIIlIlIlIllIllIIllI, this, CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[9]], new Object[CommandWeather.lIlIlIIIlIIlll[0]]);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                if (lllIlIllIlllIlI(CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[10]].equalsIgnoreCase(lllllllllllllIIIlIlIlIllIllIlIll[CommandWeather.lIlIlIIIlIIlll[0]]) ? 1 : 0)) {
                    throw new WrongUsageException(CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[11]], new Object[CommandWeather.lIlIlIIIlIIlll[0]]);
                }
                lllllllllllllIIIlIlIlIllIllIlIII.setCleanWeatherTime(CommandWeather.lIlIlIIIlIIlll[0]);
                lllllllllllllIIIlIlIlIllIllIlIII.setRainTime(lllllllllllllIIIlIlIlIllIllIlIlI);
                lllllllllllllIIIlIlIlIllIllIlIII.setThunderTime(lllllllllllllIIIlIlIlIllIllIlIlI);
                lllllllllllllIIIlIlIlIllIllIlIII.setRaining((boolean)(CommandWeather.lIlIlIIIlIIlll[2] != 0));
                lllllllllllllIIIlIlIlIllIllIlIII.setThundering((boolean)(CommandWeather.lIlIlIIIlIIlll[2] != 0));
                CommandBase.notifyOperators(lllllllllllllIIIlIlIlIllIllIIllI, this, CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[12]], new Object[CommandWeather.lIlIlIIIlIIlll[0]]);
                "".length();
                if (((0x29 ^ 0x25) & ~(0x44 ^ 0x48) & ~((0x51 ^ 0x73) & ~(0x11 ^ 0x33))) != 0x0) {
                    return;
                }
            }
            return;
        }
        throw new WrongUsageException(CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[13]], new Object[CommandWeather.lIlIlIIIlIIlll[0]]);
    }
    
    private static boolean lllIlIllIlllIII(final int lllllllllllllIIIlIlIlIllIIIllIll, final int lllllllllllllIIIlIlIlIllIIIllIlI) {
        return lllllllllllllIIIlIlIlIllIIIllIll <= lllllllllllllIIIlIlIlIllIIIllIlI;
    }
    
    private static boolean lllIlIllIlllIll(final int lllllllllllllIIIlIlIlIllIIlIIlll, final int lllllllllllllIIIlIlIlIllIIlIIllI) {
        return lllllllllllllIIIlIlIlIllIIlIIlll == lllllllllllllIIIlIlIlIllIIlIIllI;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIlIlIlIllIlllIlII) {
        return CommandWeather.lIlIlIIIlIIllI[CommandWeather.lIlIlIIIlIIlll[2]];
    }
    
    private static void lllIlIllIllIllI() {
        (lIlIlIIIlIIlll = new int[18])[0] = ((138 + 37 - 93 + 107 ^ 40 + 92 + 6 + 26) & (104 + 54 + 21 + 8 ^ 98 + 78 - 38 + 24 ^ -" ".length()));
        CommandWeather.lIlIlIIIlIIlll[1] = "  ".length();
        CommandWeather.lIlIlIIIlIIlll[2] = " ".length();
        CommandWeather.lIlIlIIIlIIlll[3] = (-(0xFFFFFFFA & 0x7E57) & (0xFFFFFFFD & 0x7F7F));
        CommandWeather.lIlIlIIIlIIlll[4] = (0xFFFFE37C & 0x1EDB);
        CommandWeather.lIlIlIIIlIIlll[5] = (137 + 42 - 67 + 70 ^ 40 + 9 + 48 + 65);
        CommandWeather.lIlIlIIIlIIlll[6] = (0xFFFFE7D7 & 0xF5A68);
        CommandWeather.lIlIlIIIlIIlll[7] = "   ".length();
        CommandWeather.lIlIlIIIlIIlll[8] = (0x7 ^ 0x3);
        CommandWeather.lIlIlIIIlIIlll[9] = (107 + 109 - 126 + 90 ^ 130 + 161 - 138 + 24);
        CommandWeather.lIlIlIIIlIIlll[10] = (0x5 ^ 0x42 ^ (0x37 ^ 0x76));
        CommandWeather.lIlIlIIIlIIlll[11] = (0xD3 ^ 0xBC ^ (0x6F ^ 0x7));
        CommandWeather.lIlIlIIIlIIlll[12] = (0xBD ^ 0xB5);
        CommandWeather.lIlIlIIIlIIlll[13] = (0xA ^ 0x3);
        CommandWeather.lIlIlIIIlIIlll[14] = (52 + 99 - 26 + 24 ^ 89 + 28 - 108 + 150);
        CommandWeather.lIlIlIIIlIIlll[15] = (0xB0 ^ 0xBA ^ " ".length());
        CommandWeather.lIlIlIIIlIIlll[16] = (115 + 121 - 149 + 42 ^ 95 + 77 - 131 + 100);
        CommandWeather.lIlIlIIIlIIlll[17] = (0xAC ^ 0xA1);
    }
    
    private static boolean lllIlIllIlllIIl(final int lllllllllllllIIIlIlIlIllIIIllIII) {
        return lllllllllllllIIIlIlIlIllIIIllIII != 0;
    }
    
    private static boolean lllIlIllIlllIlI(final int lllllllllllllIIIlIlIlIllIIIlIllI) {
        return lllllllllllllIIIlIlIlIllIIIlIllI == 0;
    }
}
