// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Arrays;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.server.MinecraftServer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommandToggleDownfall extends CommandBase
{
    private static final /* synthetic */ String[] lllllIlIllIlI;
    private static final /* synthetic */ int[] lllllIllIIlII;
    
    private static void lIlIlllIlllIIIl() {
        (lllllIllIIlII = new int[5])[0] = ((0x30 ^ 0x2A) & ~(0xBF ^ 0xA5));
        CommandToggleDownfall.lllllIllIIlII[1] = "  ".length();
        CommandToggleDownfall.lllllIllIIlII[2] = " ".length();
        CommandToggleDownfall.lllllIllIIlII[3] = "   ".length();
        CommandToggleDownfall.lllllIllIIlII[4] = (0x34 ^ 0x62 ^ (0x33 ^ 0x6D));
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIlIllIlIIIlIIlIIl) {
        return CommandToggleDownfall.lllllIlIllIlI[CommandToggleDownfall.lllllIllIIlII[2]];
    }
    
    private static String lIlIlllIllIIlIl(String lllllllllllllIlIlIllIlIIIIlIIIIl, final String lllllllllllllIlIlIllIlIIIIlIIIII) {
        lllllllllllllIlIlIllIlIIIIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIlIIIIlIIlII = new StringBuilder();
        final char[] lllllllllllllIlIlIllIlIIIIlIIIll = lllllllllllllIlIlIllIlIIIIlIIIII.toCharArray();
        int lllllllllllllIlIlIllIlIIIIlIIIlI = CommandToggleDownfall.lllllIllIIlII[0];
        final double lllllllllllllIlIlIllIlIIIIIlllII = (Object)lllllllllllllIlIlIllIlIIIIlIIIIl.toCharArray();
        final Exception lllllllllllllIlIlIllIlIIIIIllIll = (Exception)lllllllllllllIlIlIllIlIIIIIlllII.length;
        double lllllllllllllIlIlIllIlIIIIIllIlI = CommandToggleDownfall.lllllIllIIlII[0];
        while (lIlIlllIlllIlIl((int)lllllllllllllIlIlIllIlIIIIIllIlI, (int)lllllllllllllIlIlIllIlIIIIIllIll)) {
            final char lllllllllllllIlIlIllIlIIIIlIIlll = lllllllllllllIlIlIllIlIIIIIlllII[lllllllllllllIlIlIllIlIIIIIllIlI];
            lllllllllllllIlIlIllIlIIIIlIIlII.append((char)(lllllllllllllIlIlIllIlIIIIlIIlll ^ lllllllllllllIlIlIllIlIIIIlIIIll[lllllllllllllIlIlIllIlIIIIlIIIlI % lllllllllllllIlIlIllIlIIIIlIIIll.length]));
            "".length();
            ++lllllllllllllIlIlIllIlIIIIlIIIlI;
            ++lllllllllllllIlIlIllIlIIIIIllIlI;
            "".length();
            if (-" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIlIIIIlIIlII);
    }
    
    private static boolean lIlIlllIlllIIlI(final int lllllllllllllIlIlIllIIlllllllIll) {
        return lllllllllllllIlIlIllIIlllllllIll != 0;
    }
    
    private static void lIlIlllIllIIllI() {
        (lllllIlIllIlI = new String[CommandToggleDownfall.lllllIllIIlII[3]])[CommandToggleDownfall.lllllIllIIlII[0]] = lIlIlllIllIIIlI("G/az2GeIfVFaZM1ib8xd1w==", "RYoPU");
        CommandToggleDownfall.lllllIlIllIlI[CommandToggleDownfall.lllllIllIIlII[2]] = lIlIlllIllIIlII("We/g1VROlCrHK/vUAMnchQqfLCZwhwnT", "nAwnt");
        CommandToggleDownfall.lllllIlIllIlI[CommandToggleDownfall.lllllIllIIlII[1]] = lIlIlllIllIIlIl("FzcAHQYaPB5eAxsvAxYGGDRDAxIXOwgDFA==", "tXmpg");
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIlIllIlIIIlIIIlIl, final String[] lllllllllllllIlIlIllIlIIIlIIIlII) throws CommandException {
        this.toggleDownfall();
        CommandBase.notifyOperators(lllllllllllllIlIlIllIlIIIlIIIlIl, this, CommandToggleDownfall.lllllIlIllIlI[CommandToggleDownfall.lllllIllIIlII[1]], new Object[CommandToggleDownfall.lllllIllIIlII[0]]);
    }
    
    static {
        lIlIlllIlllIIIl();
        lIlIlllIllIIllI();
    }
    
    @Override
    public String getCommandName() {
        return CommandToggleDownfall.lllllIlIllIlI[CommandToggleDownfall.lllllIllIIlII[0]];
    }
    
    private static boolean lIlIlllIlllIlIl(final int lllllllllllllIlIlIllIlIIIIIIIIIl, final int lllllllllllllIlIlIllIIllllllllll) {
        return lllllllllllllIlIlIllIlIIIIIIIIIl < lllllllllllllIlIlIllIIllllllllll;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandToggleDownfall.lllllIllIIlII[1];
    }
    
    private static String lIlIlllIllIIIlI(final String lllllllllllllIlIlIllIlIIIIIIlllI, final String lllllllllllllIlIlIllIlIIIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIlIIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIlIIIIIlIIII.init(CommandToggleDownfall.lllllIllIIlII[1], lllllllllllllIlIlIllIlIIIIIlIIIl);
            return new String(lllllllllllllIlIlIllIlIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlIIIIIIllll) {
            lllllllllllllIlIlIllIlIIIIIIllll.printStackTrace();
            return null;
        }
    }
    
    protected void toggleDownfall() {
        final WorldInfo worldInfo;
        final WorldInfo lllllllllllllIlIlIllIlIIIIllllll = worldInfo = MinecraftServer.getServer().worldServers[CommandToggleDownfall.lllllIllIIlII[0]].getWorldInfo();
        int raining;
        if (lIlIlllIlllIIlI(lllllllllllllIlIlIllIlIIIIllllll.isRaining() ? 1 : 0)) {
            raining = CommandToggleDownfall.lllllIllIIlII[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            raining = CommandToggleDownfall.lllllIllIIlII[2];
        }
        worldInfo.setRaining((boolean)(raining != 0));
    }
    
    private static String lIlIlllIllIIlII(final String lllllllllllllIlIlIllIlIIIIllIllI, final String lllllllllllllIlIlIllIlIIIIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlIIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), CommandToggleDownfall.lllllIllIIlII[4]), "DES");
            final Cipher lllllllllllllIlIlIllIlIIIIlllIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIlIIIIlllIII.init(CommandToggleDownfall.lllllIllIIlII[1], lllllllllllllIlIlIllIlIIIIlllIIl);
            return new String(lllllllllllllIlIlIllIlIIIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlIIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlIIIIllIlll) {
            lllllllllllllIlIlIllIlIIIIllIlll.printStackTrace();
            return null;
        }
    }
}
