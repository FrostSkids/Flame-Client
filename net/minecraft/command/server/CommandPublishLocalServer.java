// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.world.WorldSettings;
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

public class CommandPublishLocalServer extends CommandBase
{
    private static final /* synthetic */ String[] lIIIIlIIlllllI;
    private static final /* synthetic */ int[] lIIIIlIlIIIIll;
    
    private static String lIlllIIlIIlIIIl(final String lllllllllllllIlIIlIlllIlllIIIlII, final String lllllllllllllIlIIlIlllIlllIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlllIlllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlllIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), CommandPublishLocalServer.lIIIIlIlIIIIll[5]), "DES");
            final Cipher lllllllllllllIlIIlIlllIlllIIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlllIlllIIlIII.init(CommandPublishLocalServer.lIIIIlIlIIIIll[2], lllllllllllllIlIIlIlllIlllIIlIIl);
            return new String(lllllllllllllIlIIlIlllIlllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlllIlllIIIlll) {
            lllllllllllllIlIIlIlllIlllIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIlIlllIllllllIII, final String[] lllllllllllllIlIIlIlllIlllllIlll) throws CommandException {
        final String lllllllllllllIlIIlIlllIlllllIllI = MinecraftServer.getServer().shareToLAN(WorldSettings.GameType.SURVIVAL, (boolean)(CommandPublishLocalServer.lIIIIlIlIIIIll[0] != 0));
        if (lIlllIIlIIlllII(lllllllllllllIlIIlIlllIlllllIllI)) {
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[2]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandPublishLocalServer.lIIIIlIlIIIIll[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandPublishLocalServer.lIIIIlIlIIIIll[0]] = lllllllllllllIlIIlIlllIlllllIllI;
            CommandBase.notifyOperators(lllllllllllllIlIIlIlllIllllllIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (((0xA ^ 0x1) & ~(0x61 ^ 0x6A)) < 0) {
                return;
            }
        }
        else {
            CommandBase.notifyOperators(lllllllllllllIlIIlIlllIllllllIII, this, CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[3]], new Object[CommandPublishLocalServer.lIIIIlIlIIIIll[0]]);
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[0]];
    }
    
    private static boolean lIlllIIlIIlllII(final Object lllllllllllllIlIIlIlllIllIlllIll) {
        return lllllllllllllIlIIlIlllIllIlllIll != null;
    }
    
    private static String lIlllIIlIIIllll(final String lllllllllllllIlIIlIlllIlllIlIIll, final String lllllllllllllIlIIlIlllIlllIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlllIlllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlllIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlllIlllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlllIlllIlIlIl.init(CommandPublishLocalServer.lIIIIlIlIIIIll[2], lllllllllllllIlIIlIlllIlllIlIllI);
            return new String(lllllllllllllIlIIlIlllIlllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlllIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlllIlllIlIlII) {
            lllllllllllllIlIIlIlllIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlllIIlIIllIll();
        lIlllIIlIIlIlIl();
    }
    
    private static String lIlllIIlIIIlllI(String lllllllllllllIlIIlIlllIllllIIIll, final String lllllllllllllIlIIlIlllIllllIIIlI) {
        lllllllllllllIlIIlIlllIllllIIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIlllIllllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlllIllllIIllI = new StringBuilder();
        final char[] lllllllllllllIlIIlIlllIllllIIlIl = lllllllllllllIlIIlIlllIllllIIIlI.toCharArray();
        int lllllllllllllIlIIlIlllIllllIIlII = CommandPublishLocalServer.lIIIIlIlIIIIll[0];
        final boolean lllllllllllllIlIIlIlllIlllIllllI = (Object)lllllllllllllIlIIlIlllIllllIIIll.toCharArray();
        final long lllllllllllllIlIIlIlllIlllIlllIl = lllllllllllllIlIIlIlllIlllIllllI.length;
        short lllllllllllllIlIIlIlllIlllIlllII = (short)CommandPublishLocalServer.lIIIIlIlIIIIll[0];
        while (lIlllIIlIIlllIl(lllllllllllllIlIIlIlllIlllIlllII, (int)lllllllllllllIlIIlIlllIlllIlllIl)) {
            final char lllllllllllllIlIIlIlllIllllIlIIl = lllllllllllllIlIIlIlllIlllIllllI[lllllllllllllIlIIlIlllIlllIlllII];
            lllllllllllllIlIIlIlllIllllIIllI.append((char)(lllllllllllllIlIIlIlllIllllIlIIl ^ lllllllllllllIlIIlIlllIllllIIlIl[lllllllllllllIlIIlIlllIllllIIlII % lllllllllllllIlIIlIlllIllllIIlIl.length]));
            "".length();
            ++lllllllllllllIlIIlIlllIllllIIlII;
            ++lllllllllllllIlIIlIlllIlllIlllII;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlllIllllIIllI);
    }
    
    private static boolean lIlllIIlIIlllIl(final int lllllllllllllIlIIlIlllIllIlllllI, final int lllllllllllllIlIIlIlllIllIllllIl) {
        return lllllllllllllIlIIlIlllIllIlllllI < lllllllllllllIlIIlIlllIllIllllIl;
    }
    
    private static void lIlllIIlIIlIlIl() {
        (lIIIIlIIlllllI = new String[CommandPublishLocalServer.lIIIIlIlIIIIll[4]])[CommandPublishLocalServer.lIIIIlIlIIIIll[0]] = lIlllIIlIIIlllI("GSQ1JxgaOQ==", "iQWKq");
        CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[1]] = lIlllIIlIIIllll("VUc8jwUg965xG5zpKktg076IGR27ZrLp", "BxnQQ");
        CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[2]] = lIlllIIlIIlIIIl("tWRjhbNvEJVDi0utA9JLhmVgzuASCJebD2ABd281QwA=", "kTTtI");
        CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[3]] = lIlllIIlIIIllll("jY4HYme8Y2Wt23NgtA1ooDLXrrq4yo4A", "pbYkK");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIlIlllIlllllllIl) {
        return CommandPublishLocalServer.lIIIIlIIlllllI[CommandPublishLocalServer.lIIIIlIlIIIIll[1]];
    }
    
    private static void lIlllIIlIIllIll() {
        (lIIIIlIlIIIIll = new int[6])[0] = ((0x6B ^ 0x27 ^ (0x2B ^ 0x34)) & (0x37 ^ 0x75 ^ (0x65 ^ 0x74) ^ -" ".length()));
        CommandPublishLocalServer.lIIIIlIlIIIIll[1] = " ".length();
        CommandPublishLocalServer.lIIIIlIlIIIIll[2] = "  ".length();
        CommandPublishLocalServer.lIIIIlIlIIIIll[3] = "   ".length();
        CommandPublishLocalServer.lIIIIlIlIIIIll[4] = (0x61 ^ 0x65);
        CommandPublishLocalServer.lIIIIlIlIIIIll[5] = (0x1A ^ 0x12);
    }
}
