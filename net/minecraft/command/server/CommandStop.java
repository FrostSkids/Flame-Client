// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
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

public class CommandStop extends CommandBase
{
    private static final /* synthetic */ int[] lIIlIlIlIlIlll;
    private static final /* synthetic */ String[] lIIlIlIlIlIllI;
    
    private static String llIlIIIIlIlIlll(final String lllllllllllllIIllIIllllIllIlIllI, final String lllllllllllllIIllIIllllIllIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllllIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllllIllIlIlll.getBytes(StandardCharsets.UTF_8)), CommandStop.lIIlIlIlIlIlll[4]), "DES");
            final Cipher lllllllllllllIIllIIllllIllIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIllIIllllIllIllIlI.init(CommandStop.lIIlIlIlIlIlll[2], lllllllllllllIIllIIllllIllIllIll);
            return new String(lllllllllllllIIllIIllllIllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllllIllIllIIl) {
            lllllllllllllIIllIIllllIllIllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllIIllllIlllllIll, final String[] lllllllllllllIIllIIllllIlllllIlI) throws CommandException {
        if (llIlIIIIlIlllIl(MinecraftServer.getServer().worldServers)) {
            CommandBase.notifyOperators(lllllllllllllIIllIIllllIlllllIll, this, CommandStop.lIIlIlIlIlIllI[CommandStop.lIIlIlIlIlIlll[2]], new Object[CommandStop.lIIlIlIlIlIlll[0]]);
        }
        MinecraftServer.getServer().initiateShutdown();
    }
    
    private static void llIlIIIIlIllIII() {
        (lIIlIlIlIlIllI = new String[CommandStop.lIIlIlIlIlIlll[3]])[CommandStop.lIIlIlIlIlIlll[0]] = llIlIIIIlIlIllI("IwYWAQ==", "Pryqt");
        CommandStop.lIIlIlIlIlIllI[CommandStop.lIIlIlIlIlIlll[1]] = llIlIIIIlIlIlll("61jdUcfjAsf3fuRzV2oNHUi+HA98iyYi", "MymIG");
        CommandStop.lIIlIlIlIlIllI[CommandStop.lIIlIlIlIlIlll[2]] = llIlIIIIlIlIllI("BzcKHQ0KPBReHxA3F14fEDkVBA==", "dXgpl");
    }
    
    private static boolean llIlIIIIlIllllI(final int lllllllllllllIIllIIllllIllIlIIII, final int lllllllllllllIIllIIllllIllIIllll) {
        return lllllllllllllIIllIIllllIllIlIIII < lllllllllllllIIllIIllllIllIIllll;
    }
    
    @Override
    public String getCommandName() {
        return CommandStop.lIIlIlIlIlIllI[CommandStop.lIIlIlIlIlIlll[0]];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllIIllllIllllllll) {
        return CommandStop.lIIlIlIlIlIllI[CommandStop.lIIlIlIlIlIlll[1]];
    }
    
    static {
        llIlIIIIlIlllII();
        llIlIIIIlIllIII();
    }
    
    private static boolean llIlIIIIlIlllIl(final Object lllllllllllllIIllIIllllIllIIllIl) {
        return lllllllllllllIIllIIllllIllIIllIl != null;
    }
    
    private static String llIlIIIIlIlIllI(String lllllllllllllIIllIIllllIlllIllIl, final String lllllllllllllIIllIIllllIlllIllII) {
        lllllllllllllIIllIIllllIlllIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIllllIlllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIllllIlllIlIll = new StringBuilder();
        final char[] lllllllllllllIIllIIllllIlllIlIlI = lllllllllllllIIllIIllllIlllIllII.toCharArray();
        int lllllllllllllIIllIIllllIlllIlIIl = CommandStop.lIIlIlIlIlIlll[0];
        final int lllllllllllllIIllIIllllIlllIIIll = (Object)lllllllllllllIIllIIllllIlllIllIl.toCharArray();
        final byte lllllllllllllIIllIIllllIlllIIIlI = (byte)lllllllllllllIIllIIllllIlllIIIll.length;
        byte lllllllllllllIIllIIllllIlllIIIIl = (byte)CommandStop.lIIlIlIlIlIlll[0];
        while (llIlIIIIlIllllI(lllllllllllllIIllIIllllIlllIIIIl, lllllllllllllIIllIIllllIlllIIIlI)) {
            final char lllllllllllllIIllIIllllIlllIlllI = lllllllllllllIIllIIllllIlllIIIll[lllllllllllllIIllIIllllIlllIIIIl];
            lllllllllllllIIllIIllllIlllIlIll.append((char)(lllllllllllllIIllIIllllIlllIlllI ^ lllllllllllllIIllIIllllIlllIlIlI[lllllllllllllIIllIIllllIlllIlIIl % lllllllllllllIIllIIllllIlllIlIlI.length]));
            "".length();
            ++lllllllllllllIIllIIllllIlllIlIIl;
            ++lllllllllllllIIllIIllllIlllIIIIl;
            "".length();
            if ((0xD8 ^ 0x9F ^ (0xE ^ 0x4D)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIllllIlllIlIll);
    }
    
    private static void llIlIIIIlIlllII() {
        (lIIlIlIlIlIlll = new int[5])[0] = ((0xBA ^ 0x88 ^ (0x4E ^ 0x59)) & (0xE1 ^ 0x86 ^ (0x51 ^ 0x13) ^ -" ".length()));
        CommandStop.lIIlIlIlIlIlll[1] = " ".length();
        CommandStop.lIIlIlIlIlIlll[2] = "  ".length();
        CommandStop.lIIlIlIlIlIlll[3] = "   ".length();
        CommandStop.lIIlIlIlIlIlll[4] = (0x2C ^ 0x24);
    }
}
