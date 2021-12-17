// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.world.WorldServer;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.ICommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandBase;

public class CommandSaveOff extends CommandBase
{
    private static final /* synthetic */ String[] lIIIIlIllIIllI;
    private static final /* synthetic */ int[] lIIIIlIllIlIIl;
    
    private static String lIlllIlIIllIIll(final String lllllllllllllIlIIlIlIIlIlIlllIll, final String lllllllllllllIlIIlIlIIlIlIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIlIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), CommandSaveOff.lIIIIlIllIlIIl[5]), "DES");
            final Cipher lllllllllllllIlIIlIlIIlIllIIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIIlIllIIIIII.init(CommandSaveOff.lIIIIlIllIlIIl[2], lllllllllllllIlIIlIlIIlIllIIIIIl);
            return new String(lllllllllllllIlIIlIlIIlIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIlIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIlIlIllllll) {
            lllllllllllllIlIIlIlIIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIlIIIlIl() {
        (lIIIIlIllIlIIl = new int[6])[0] = ((0xA7 ^ 0x94 ^ (0xA6 ^ 0xAB)) & (0x3B ^ 0x25 ^ (0xA7 ^ 0x87) ^ -" ".length()));
        CommandSaveOff.lIIIIlIllIlIIl[1] = " ".length();
        CommandSaveOff.lIIIIlIllIlIIl[2] = "  ".length();
        CommandSaveOff.lIIIIlIllIlIIl[3] = "   ".length();
        CommandSaveOff.lIIIIlIllIlIIl[4] = (13 + 178 - 179 + 173 ^ 76 + 135 - 58 + 36);
        CommandSaveOff.lIIIIlIllIlIIl[5] = (0x56 ^ 0x69 ^ (0x34 ^ 0x3));
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIlIlIIlIlllIIllI) {
        return CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[1]];
    }
    
    private static boolean lIlllIlIlIIlIII(final int lllllllllllllIlIIlIlIIlIlIllIIIl, final int lllllllllllllIlIIlIlIIlIlIllIIII) {
        return lllllllllllllIlIIlIlIIlIlIllIIIl >= lllllllllllllIlIIlIlIIlIlIllIIII;
    }
    
    @Override
    public String getCommandName() {
        return CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[0]];
    }
    
    private static void lIlllIlIlIIIIlI() {
        (lIIIIlIllIIllI = new String[CommandSaveOff.lIIIIlIllIlIIl[4]])[CommandSaveOff.lIIIIlIllIlIIl[0]] = lIlllIlIIllIIlI("I2drDYzJlraBM3g4jbUQZw==", "xuOpw");
        CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[1]] = lIlllIlIIllIIlI("3HSz87DIHXUmqh/BTy2koaFPsc2AHOLk", "GhLXw");
        CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[2]] = lIlllIlIIllIIll("qzizPY80OZv6KCTd4CVvloFS02h3Sfo9", "mGTTx");
        CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[3]] = lIlllIlIIllIIlI("4PZSPhUu5ULviyv/rSbHlrve80OreH3yCXHf7rSzpR0=", "tecsk");
    }
    
    private static boolean lIlllIlIlIIlIIl(final int lllllllllllllIlIIlIlIIlIlIlIllII) {
        return lllllllllllllIlIIlIlIIlIlIlIllII != 0;
    }
    
    private static String lIlllIlIIllIIlI(final String lllllllllllllIlIIlIlIIlIllIIlIIl, final String lllllllllllllIlIIlIlIIlIllIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIlIllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIlIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIIlIllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIIlIllIIllIl.init(CommandSaveOff.lIIIIlIllIlIIl[2], lllllllllllllIlIIlIlIIlIllIIlllI);
            return new String(lllllllllllllIlIIlIlIIlIllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIlIllIIllII) {
            lllllllllllllIlIIlIlIIlIllIIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlllIlIlIIIlIl();
        lIlllIlIlIIIIlI();
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIlIlIIlIllIlIlll, final String[] lllllllllllllIlIIlIlIIlIllIlllIl) throws CommandException {
        final MinecraftServer lllllllllllllIlIIlIlIIlIllIlllII = MinecraftServer.getServer();
        boolean lllllllllllllIlIIlIlIIlIllIllIll = CommandSaveOff.lIIIIlIllIlIIl[0] != 0;
        int lllllllllllllIlIIlIlIIlIllIllIlI = CommandSaveOff.lIIIIlIllIlIIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIlIlIIlIII(lllllllllllllIlIIlIlIIlIllIllIlI, lllllllllllllIlIIlIlIIlIllIlllII.worldServers.length)) {
            if (lIlllIlIlIIIllI(lllllllllllllIlIIlIlIIlIllIlllII.worldServers[lllllllllllllIlIIlIlIIlIllIllIlI])) {
                final WorldServer lllllllllllllIlIIlIlIIlIllIllIIl = lllllllllllllIlIIlIlIIlIllIlllII.worldServers[lllllllllllllIlIIlIlIIlIllIllIlI];
                if (lIlllIlIlIIIlll(lllllllllllllIlIIlIlIIlIllIllIIl.disableLevelSaving ? 1 : 0)) {
                    lllllllllllllIlIIlIlIIlIllIllIIl.disableLevelSaving = (CommandSaveOff.lIIIIlIllIlIIl[1] != 0);
                    lllllllllllllIlIIlIlIIlIllIllIll = (CommandSaveOff.lIIIIlIllIlIIl[1] != 0);
                }
            }
            ++lllllllllllllIlIIlIlIIlIllIllIlI;
        }
        if (!lIlllIlIlIIlIIl(lllllllllllllIlIIlIlIIlIllIllIll ? 1 : 0)) {
            throw new CommandException(CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[3]], new Object[CommandSaveOff.lIIIIlIllIlIIl[0]]);
        }
        CommandBase.notifyOperators(lllllllllllllIlIIlIlIIlIllIlIlll, this, CommandSaveOff.lIIIIlIllIIllI[CommandSaveOff.lIIIIlIllIlIIl[2]], new Object[CommandSaveOff.lIIIIlIllIlIIl[0]]);
        "".length();
        if (null != null) {
            return;
        }
    }
    
    private static boolean lIlllIlIlIIIllI(final Object lllllllllllllIlIIlIlIIlIlIlIlllI) {
        return lllllllllllllIlIIlIlIIlIlIlIlllI != null;
    }
    
    private static boolean lIlllIlIlIIIlll(final int lllllllllllllIlIIlIlIIlIlIlIlIlI) {
        return lllllllllllllIlIIlIlIIlIlIlIlIlI == 0;
    }
}
