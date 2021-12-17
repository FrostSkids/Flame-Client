// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandException;
import net.minecraft.world.WorldServer;
import net.minecraft.world.MinecraftException;
import net.minecraft.command.ICommand;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandSaveAll extends CommandBase
{
    private static final /* synthetic */ int[] lIlIIIlIIIIIII;
    private static final /* synthetic */ String[] lIlIIIIllllllI;
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIIIIIIIIlIIIlIIl, final String[] lllllllllllllIIlIIIIIIIIlIIlIllI) throws CommandException {
        final MinecraftServer lllllllllllllIIlIIIIIIIIlIIlIlIl = MinecraftServer.getServer();
        lllllllllllllIIlIIIIIIIIlIIIlIIl.addChatMessage(new ChatComponentTranslation(CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[2]], new Object[CommandSaveAll.lIlIIIlIIIIIII[0]]));
        if (lllIIIlIIllIIll(lllllllllllllIIlIIIIIIIIlIIlIlIl.getConfigurationManager())) {
            lllllllllllllIIlIIIIIIIIlIIlIlIl.getConfigurationManager().saveAllPlayerData();
        }
        try {
            int lllllllllllllIIlIIIIIIIIlIIlIlII = CommandSaveAll.lIlIIIlIIIIIII[0];
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
            while (!lllIIIlIIllIlII(lllllllllllllIIlIIIIIIIIlIIlIlII, lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers.length)) {
                if (lllIIIlIIllIIll(lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers[lllllllllllllIIlIIIIIIIIlIIlIlII])) {
                    final WorldServer lllllllllllllIIlIIIIIIIIlIIlIIll = lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers[lllllllllllllIIlIIIIIIIIlIIlIlII];
                    final boolean lllllllllllllIIlIIIIIIIIlIIlIIlI = lllllllllllllIIlIIIIIIIIlIIlIIll.disableLevelSaving;
                    lllllllllllllIIlIIIIIIIIlIIlIIll.disableLevelSaving = (CommandSaveAll.lIlIIIlIIIIIII[0] != 0);
                    lllllllllllllIIlIIIIIIIIlIIlIIll.saveAllChunks((boolean)(CommandSaveAll.lIlIIIlIIIIIII[1] != 0), null);
                    lllllllllllllIIlIIIIIIIIlIIlIIll.disableLevelSaving = lllllllllllllIIlIIIIIIIIlIIlIIlI;
                }
                ++lllllllllllllIIlIIIIIIIIlIIlIlII;
            }
            if (lllIIIlIIllIlIl(lllllllllllllIIlIIIIIIIIlIIlIllI.length) && lllIIIlIIllIllI(CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[3]].equals(lllllllllllllIIlIIIIIIIIlIIlIllI[CommandSaveAll.lIlIIIlIIIIIII[0]]) ? 1 : 0)) {
                lllllllllllllIIlIIIIIIIIlIIIlIIl.addChatMessage(new ChatComponentTranslation(CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[4]], new Object[CommandSaveAll.lIlIIIlIIIIIII[0]]));
                int lllllllllllllIIlIIIIIIIIlIIlIIIl = CommandSaveAll.lIlIIIlIIIIIII[0];
                "".length();
                if ((0x72 ^ 0x5 ^ (0x9 ^ 0x7A)) <= ((0x2 ^ 0x9 ^ (0xB ^ 0x12)) & (0x28 ^ 0x5F ^ (0x7B ^ 0x1E) ^ -" ".length()))) {
                    return;
                }
                while (!lllIIIlIIllIlII(lllllllllllllIIlIIIIIIIIlIIlIIIl, lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers.length)) {
                    if (lllIIIlIIllIIll(lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers[lllllllllllllIIlIIIIIIIIlIIlIIIl])) {
                        final WorldServer lllllllllllllIIlIIIIIIIIlIIlIIII = lllllllllllllIIlIIIIIIIIlIIlIlIl.worldServers[lllllllllllllIIlIIIIIIIIlIIlIIIl];
                        final boolean lllllllllllllIIlIIIIIIIIlIIIlllI = lllllllllllllIIlIIIIIIIIlIIlIIII.disableLevelSaving;
                        lllllllllllllIIlIIIIIIIIlIIlIIII.disableLevelSaving = (CommandSaveAll.lIlIIIlIIIIIII[0] != 0);
                        lllllllllllllIIlIIIIIIIIlIIlIIII.saveChunkData();
                        lllllllllllllIIlIIIIIIIIlIIlIIII.disableLevelSaving = lllllllllllllIIlIIIIIIIIlIIIlllI;
                    }
                    ++lllllllllllllIIlIIIIIIIIlIIlIIIl;
                }
                lllllllllllllIIlIIIIIIIIlIIIlIIl.addChatMessage(new ChatComponentTranslation(CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[5]], new Object[CommandSaveAll.lIlIIIlIIIIIII[0]]));
                "".length();
                if ((0xC1 ^ 0xC5) == 0x0) {
                    return;
                }
            }
        }
        catch (MinecraftException lllllllllllllIIlIIIIIIIIlIIIllII) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[6]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandSaveAll.lIlIIIlIIIIIII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandSaveAll.lIlIIIlIIIIIII[0]] = lllllllllllllIIlIIIIIIIIlIIIllII.getMessage();
            CommandBase.notifyOperators(lllllllllllllIIlIIIIIIIIlIIIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            return;
        }
        CommandBase.notifyOperators(lllllllllllllIIlIIIIIIIIlIIIlIIl, this, CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[7]], new Object[CommandSaveAll.lIlIIIlIIIIIII[0]]);
    }
    
    @Override
    public String getCommandName() {
        return CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[0]];
    }
    
    private static boolean lllIIIlIIllIlII(final int lllllllllllllIIlIIIIIIIIIIIIlIll, final int lllllllllllllIIlIIIIIIIIIIIIlIlI) {
        return lllllllllllllIIlIIIIIIIIIIIIlIll >= lllllllllllllIIlIIIIIIIIIIIIlIlI;
    }
    
    private static boolean lllIIIlIIllIllI(final int lllllllllllllIIlIIIIIIIIIIIIIIlI) {
        return lllllllllllllIIlIIIIIIIIIIIIIIlI != 0;
    }
    
    private static String lllIIIlIIlIIIII(String lllllllllllllIIlIIIIIIIIIIlIIIII, final String lllllllllllllIIlIIIIIIIIIIIllllI) {
        lllllllllllllIIlIIIIIIIIIIlIIIII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIIIIIIIIlIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIIIIIIIlIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIIIIIIIIIIlIIlIl = lllllllllllllIIlIIIIIIIIIIIllllI.toCharArray();
        int lllllllllllllIIlIIIIIIIIIIlIIIlI = CommandSaveAll.lIlIIIlIIIIIII[0];
        final String lllllllllllllIIlIIIIIIIIIIIllIIl = (Object)((String)lllllllllllllIIlIIIIIIIIIIlIIIII).toCharArray();
        final int lllllllllllllIIlIIIIIIIIIIIllIII = lllllllllllllIIlIIIIIIIIIIIllIIl.length;
        boolean lllllllllllllIIlIIIIIIIIIIIlIllI = CommandSaveAll.lIlIIIlIIIIIII[0] != 0;
        while (lllIIIlIIllIlll(lllllllllllllIIlIIIIIIIIIIIlIllI ? 1 : 0, lllllllllllllIIlIIIIIIIIIIIllIII)) {
            final char lllllllllllllIIlIIIIIIIIIIlIllIl = lllllllllllllIIlIIIIIIIIIIIllIIl[lllllllllllllIIlIIIIIIIIIIIlIllI];
            lllllllllllllIIlIIIIIIIIIIlIIlll.append((char)(lllllllllllllIIlIIIIIIIIIIlIllIl ^ lllllllllllllIIlIIIIIIIIIIlIIlIl[lllllllllllllIIlIIIIIIIIIIlIIIlI % lllllllllllllIIlIIIIIIIIIIlIIlIl.length]));
            "".length();
            ++lllllllllllllIIlIIIIIIIIIIlIIIlI;
            ++lllllllllllllIIlIIIIIIIIIIIlIllI;
            "".length();
            if ((0x32 ^ 0x36) != (0x26 ^ 0x22)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIIIIIIIlIIlll);
    }
    
    private static String lllIIIlIIIllllI(final String lllllllllllllIIlIIIIIIIIIlIIllII, final String lllllllllllllIIlIIIIIIIIIlIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIIIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIIIIIIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIIIIIIlIlIlII.init(CommandSaveAll.lIlIIIlIIIIIII[2], lllllllllllllIIlIIIIIIIIIlIlIllI);
            return new String(lllllllllllllIIlIIIIIIIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIIIIlIlIIlI) {
            lllllllllllllIIlIIIIIIIIIlIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlIIIlllll(final String lllllllllllllIIlIIIIIIIIIllIIIIl, final String lllllllllllllIIlIIIIIIIIIllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), CommandSaveAll.lIlIIIlIIIIIII[8]), "DES");
            final Cipher lllllllllllllIIlIIIIIIIIIllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIIIIIllIlIIl.init(CommandSaveAll.lIlIIIlIIIIIII[2], lllllllllllllIIlIIIIIIIIIllIlIll);
            return new String(lllllllllllllIIlIIIIIIIIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIIIIllIIlll) {
            lllllllllllllIIlIIIIIIIIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIlIIllIIll(final Object lllllllllllllIIlIIIIIIIIIIIIIlII) {
        return lllllllllllllIIlIIIIIIIIIIIIIlII != null;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIIIIIIIIlIlllIlI) {
        return CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[1]];
    }
    
    private static void lllIIIlIIllIIlI() {
        (lIlIIIlIIIIIII = new int[9])[0] = ((0x47 ^ 0x29 ^ (0xD ^ 0x43)) & (0x8C ^ 0x81 ^ (0xA3 ^ 0x8E) ^ -" ".length()));
        CommandSaveAll.lIlIIIlIIIIIII[1] = " ".length();
        CommandSaveAll.lIlIIIlIIIIIII[2] = "  ".length();
        CommandSaveAll.lIlIIIlIIIIIII[3] = "   ".length();
        CommandSaveAll.lIlIIIlIIIIIII[4] = (0x8 ^ 0xC);
        CommandSaveAll.lIlIIIlIIIIIII[5] = (155 + 121 - 189 + 83 ^ 113 + 45 - 36 + 53);
        CommandSaveAll.lIlIIIlIIIIIII[6] = (0x31 ^ 0x37);
        CommandSaveAll.lIlIIIlIIIIIII[7] = (153 + 130 - 261 + 138 ^ 55 + 31 + 74 + 7);
        CommandSaveAll.lIlIIIlIIIIIII[8] = (0x57 ^ 0x7D ^ (0x96 ^ 0xB4));
    }
    
    private static boolean lllIIIlIIllIlll(final int lllllllllllllIIlIIIIIIIIIIIIIlll, final int lllllllllllllIIlIIIIIIIIIIIIIllI) {
        return lllllllllllllIIlIIIIIIIIIIIIIlll < lllllllllllllIIlIIIIIIIIIIIIIllI;
    }
    
    private static boolean lllIIIlIIllIlIl(final int lllllllllllllIIlIIIIIIIIIIIIIIII) {
        return lllllllllllllIIlIIIIIIIIIIIIIIII > 0;
    }
    
    static {
        lllIIIlIIllIIlI();
        lllIIIlIIlIIIIl();
    }
    
    private static void lllIIIlIIlIIIIl() {
        (lIlIIIIllllllI = new String[CommandSaveAll.lIlIIIlIIIIIII[8]])[CommandSaveAll.lIlIIIlIIIIIII[0]] = lllIIIlIIIllllI("A+19zKemho3gJTd6upQv2A==", "uhDtl");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[1]] = lllIIIlIIIllllI("KGayjoMhBGHnWGT24zwwoh8DP/ZiOqTT", "pEyzf");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[2]] = lllIIIlIIIlllll("jHPHtPR/5THhfr24j73JLWv0ZSIIBTrk", "PHyRd");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[3]] = lllIIIlIIIllllI("wJmbJxUkhtA=", "AmrWA");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[4]] = lllIIIlIIIlllll("v+VqYb0iEcSr++QBEnHGcMZZyzuTFJyj5qnWMSyfAx8=", "kqRFd");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[5]] = lllIIIlIIlIIIII("MCEGJCQ9KhhnNjI4DmcjPzsYIQA9Kg==", "SNkIE");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[6]] = lllIIIlIIIllllI("6y9ETQg9sAyUlsXnU9mxVEIfrAjxj5ko", "mSwfK");
        CommandSaveAll.lIlIIIIllllllI[CommandSaveAll.lIlIIIlIIIIIII[7]] = lllIIIlIIIlllll("TBiRY73IK3B+05o7NPYQDAKnMNx79MSS", "NTDTz");
    }
}
