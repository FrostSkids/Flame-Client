// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandException;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.command.CommandResultStats;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.CommandBase;

public class CommandListPlayers extends CommandBase
{
    private static final /* synthetic */ int[] lIlllIllllIIII;
    private static final /* synthetic */ String[] lIlllIlllIIIII;
    
    static {
        lIIIIIlllIIlIlII();
        lIIIIIllIllIIIlI();
    }
    
    @Override
    public String getCommandName() {
        return CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[0]];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllllIllIlIIlIlIlIII) {
        return CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[1]];
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllllIllIlIIlIlIIIII, final String[] llllllllllllIllllIllIlIIlIIlllll) throws CommandException {
        final int llllllllllllIllllIllIlIIlIlIIIIl = MinecraftServer.getServer().getCurrentPlayerCount();
        final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[2]];
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandListPlayers.lIlllIllllIIII[2]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandListPlayers.lIlllIllllIIII[0]] = llllllllllllIllllIllIlIIlIlIIIIl;
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandListPlayers.lIlllIllllIIII[1]] = MinecraftServer.getServer().getMaxPlayers();
        llllllllllllIllllIllIlIIlIlIIIII.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
        final ServerConfigurationManager configurationManager = MinecraftServer.getServer().getConfigurationManager();
        int llllllllllllIlIlIlllIlllIIlllllI;
        if (lIIIIIlllIIlIlIl(llllllllllllIllllIllIlIIlIIlllll.length) && lIIIIIlllIIlIllI(CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[3]].equalsIgnoreCase(llllllllllllIllllIllIlIIlIIlllll[CommandListPlayers.lIlllIllllIIII[0]]) ? 1 : 0)) {
            llllllllllllIlIlIlllIlllIIlllllI = CommandListPlayers.lIlllIllllIIII[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlIlIlllIlllIIlllllI = CommandListPlayers.lIlllIllllIIII[0];
        }
        llllllllllllIllllIllIlIIlIlIIIII.addChatMessage(new ChatComponentText(configurationManager.func_181058_b((boolean)(llllllllllllIlIlIlllIlllIIlllllI != 0))));
        llllllllllllIllllIllIlIIlIlIIIII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, llllllllllllIllllIllIlIIlIlIIIIl);
    }
    
    private static boolean lIIIIIlllIIlIlll(final int llllllllllllIllllIllIlIIIllIlIIl, final int llllllllllllIllllIllIlIIIllIlIII) {
        return llllllllllllIllllIllIlIIIllIlIIl < llllllllllllIllllIllIlIIIllIlIII;
    }
    
    private static boolean lIIIIIlllIIlIlIl(final int llllllllllllIllllIllIlIIIllIIlII) {
        return llllllllllllIllllIllIlIIIllIIlII > 0;
    }
    
    private static String lIIIIIllIllIIIII(final String llllllllllllIllllIllIlIIlIIIlIIl, final String llllllllllllIllllIllIlIIlIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllllIllIlIIlIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIlIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), CommandListPlayers.lIlllIllllIIII[5]), "DES");
            final Cipher llllllllllllIllllIllIlIIlIIIlIll = Cipher.getInstance("DES");
            llllllllllllIllllIllIlIIlIIIlIll.init(CommandListPlayers.lIlllIllllIIII[2], llllllllllllIllllIllIlIIlIIIllII);
            return new String(llllllllllllIllllIllIlIIlIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIlIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIlIIlIIIlIlI) {
            llllllllllllIllllIllIlIIlIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllIlIllllI(final String llllllllllllIllllIllIlIIlIIlIllI, final String llllllllllllIllllIllIlIIlIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllIlIIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIlIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIlIIlIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIlIIlIIllIII.init(CommandListPlayers.lIlllIllllIIII[2], llllllllllllIllllIllIlIIlIIllIIl);
            return new String(llllllllllllIllllIllIlIIlIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIlIIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIlIIlIIlIlll) {
            llllllllllllIllllIllIlIIlIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllIllIIIIl(String llllllllllllIllllIllIlIIIlllIlII, final String llllllllllllIllllIllIlIIIllllIII) {
        llllllllllllIllllIllIlIIIlllIlII = new String(Base64.getDecoder().decode(llllllllllllIllllIllIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIlIIIlllIlll = new StringBuilder();
        final char[] llllllllllllIllllIllIlIIIlllIllI = llllllllllllIllllIllIlIIIllllIII.toCharArray();
        int llllllllllllIllllIllIlIIIlllIlIl = CommandListPlayers.lIlllIllllIIII[0];
        final byte llllllllllllIllllIllIlIIIllIllll = (Object)llllllllllllIllllIllIlIIIlllIlII.toCharArray();
        final double llllllllllllIllllIllIlIIIllIlllI = llllllllllllIllllIllIlIIIllIllll.length;
        int llllllllllllIllllIllIlIIIllIllIl = CommandListPlayers.lIlllIllllIIII[0];
        while (lIIIIIlllIIlIlll(llllllllllllIllllIllIlIIIllIllIl, (int)llllllllllllIllllIllIlIIIllIlllI)) {
            final char llllllllllllIllllIllIlIIIllllIlI = llllllllllllIllllIllIlIIIllIllll[llllllllllllIllllIllIlIIIllIllIl];
            llllllllllllIllllIllIlIIIlllIlll.append((char)(llllllllllllIllllIllIlIIIllllIlI ^ llllllllllllIllllIllIlIIIlllIllI[llllllllllllIllllIllIlIIIlllIlIl % llllllllllllIllllIllIlIIIlllIllI.length]));
            "".length();
            ++llllllllllllIllllIllIlIIIlllIlIl;
            ++llllllllllllIllllIllIlIIIllIllIl;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIlIIIlllIlll);
    }
    
    private static void lIIIIIllIllIIIlI() {
        (lIlllIlllIIIII = new String[CommandListPlayers.lIlllIllllIIII[4]])[CommandListPlayers.lIlllIllllIIII[0]] = lIIIIIllIlIllllI("Bo1YkM87QOA=", "cmwnC");
        CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[1]] = lIIIIIllIllIIIII("13hQt7qWLXEnub8vx+rs/yzB4DOAtKrh", "NiBMg");
        CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[2]] = lIIIIIllIlIllllI("95zCuikcrFT5HlBTVU2bvPQmzrlPy7e7", "oreZN");
        CommandListPlayers.lIlllIlllIIIII[CommandListPlayers.lIlllIllllIIII[3]] = lIIIIIllIllIIIIl("BScxMCE=", "pRXTR");
    }
    
    private static boolean lIIIIIlllIIlIllI(final int llllllllllllIllllIllIlIIIllIIllI) {
        return llllllllllllIllllIllIlIIIllIIllI != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandListPlayers.lIlllIllllIIII[0];
    }
    
    private static void lIIIIIlllIIlIlII() {
        (lIlllIllllIIII = new int[6])[0] = ((0xFA ^ 0xBF) & ~(0x31 ^ 0x74));
        CommandListPlayers.lIlllIllllIIII[1] = " ".length();
        CommandListPlayers.lIlllIllllIIII[2] = "  ".length();
        CommandListPlayers.lIlllIllllIIII[3] = "   ".length();
        CommandListPlayers.lIlllIllllIIII[4] = (25 + 78 - 79 + 170 ^ 85 + 34 - 114 + 193);
        CommandListPlayers.lIlllIllllIIII[5] = (159 + 76 - 227 + 173 ^ 183 + 154 - 249 + 101);
    }
}
