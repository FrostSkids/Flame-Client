// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.server.MinecraftServer;

public class CommandSetPlayerTimeout extends CommandBase
{
    private static final /* synthetic */ String[] lIlIIIllIllllI;
    private static final /* synthetic */ int[] lIlIIIlllIllIl;
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIlllIllllIIlIlIIl, final String[] lllllllllllllIIIlllIllllIIlIIlII) throws CommandException {
        if (lllIIlIIIIlIIlI(lllllllllllllIIIlllIllllIIlIIlII.length, CommandSetPlayerTimeout.lIlIIIlllIllIl[2])) {
            throw new WrongUsageException(CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[3]], new Object[CommandSetPlayerTimeout.lIlIIIlllIllIl[0]]);
        }
        final int lllllllllllllIIIlllIllllIIlIIlll = CommandBase.parseInt(lllllllllllllIIIlllIllllIIlIIlII[CommandSetPlayerTimeout.lIlIIIlllIllIl[0]], CommandSetPlayerTimeout.lIlIIIlllIllIl[0]);
        MinecraftServer.getServer().setPlayerIdleTimeout(lllllllllllllIIIlllIllllIIlIIlll);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[1]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandSetPlayerTimeout.lIlIIIlllIllIl[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetPlayerTimeout.lIlIIIlllIllIl[0]] = lllllllllllllIIIlllIllllIIlIIlll;
        CommandBase.notifyOperators(lllllllllllllIIIlllIllllIIlIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSetPlayerTimeout.lIlIIIlllIllIl[1];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIlllIllllIIlIllll) {
        return CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[2]];
    }
    
    static {
        lllIIlIIIIlIIIl();
        lllIIlIIIIIIIll();
    }
    
    private static String lllIIlIIIIIIIIl(String lllllllllllllIIIlllIllllIIIlIIll, final String lllllllllllllIIIlllIllllIIIlIIlI) {
        lllllllllllllIIIlllIllllIIIlIIll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllIllllIIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIllllIIIlIllI = new StringBuilder();
        final char[] lllllllllllllIIIlllIllllIIIlIlIl = lllllllllllllIIIlllIllllIIIlIIlI.toCharArray();
        int lllllllllllllIIIlllIllllIIIlIlII = CommandSetPlayerTimeout.lIlIIIlllIllIl[0];
        final double lllllllllllllIIIlllIllllIIIIlllI = (Object)((String)lllllllllllllIIIlllIllllIIIlIIll).toCharArray();
        final Exception lllllllllllllIIIlllIllllIIIIllIl = (Exception)lllllllllllllIIIlllIllllIIIIlllI.length;
        char lllllllllllllIIIlllIllllIIIIllII = (char)CommandSetPlayerTimeout.lIlIIIlllIllIl[0];
        while (lllIIlIIIIlIIll(lllllllllllllIIIlllIllllIIIIllII, (int)lllllllllllllIIIlllIllllIIIIllIl)) {
            final char lllllllllllllIIIlllIllllIIIllIIl = lllllllllllllIIIlllIllllIIIIlllI[lllllllllllllIIIlllIllllIIIIllII];
            lllllllllllllIIIlllIllllIIIlIllI.append((char)(lllllllllllllIIIlllIllllIIIllIIl ^ lllllllllllllIIIlllIllllIIIlIlIl[lllllllllllllIIIlllIllllIIIlIlII % lllllllllllllIIIlllIllllIIIlIlIl.length]));
            "".length();
            ++lllllllllllllIIIlllIllllIIIlIlII;
            ++lllllllllllllIIIlllIllllIIIIllII;
            "".length();
            if (((0xBA ^ 0x93) & ~(0x1C ^ 0x35)) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIllllIIIlIllI);
    }
    
    private static String lllIIIlllllllIl(final String lllllllllllllIIIlllIlllIllllIlII, final String lllllllllllllIIIlllIlllIllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIlllIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIlllIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIlllIlllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIlllIlllllIII.init(CommandSetPlayerTimeout.lIlIIIlllIllIl[3], lllllllllllllIIIlllIlllIlllllIIl);
            return new String(lllllllllllllIIIlllIlllIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIlllIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIlllIllllIlll) {
            lllllllllllllIIIlllIlllIllllIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIIIIlIIIl() {
        (lIlIIIlllIllIl = new int[6])[0] = ((0x5B ^ 0x4A) & ~(0x9C ^ 0x8D));
        CommandSetPlayerTimeout.lIlIIIlllIllIl[1] = "   ".length();
        CommandSetPlayerTimeout.lIlIIIlllIllIl[2] = " ".length();
        CommandSetPlayerTimeout.lIlIIIlllIllIl[3] = "  ".length();
        CommandSetPlayerTimeout.lIlIIIlllIllIl[4] = (0x79 ^ 0x7D);
        CommandSetPlayerTimeout.lIlIIIlllIllIl[5] = (0xB5 ^ 0xBD);
    }
    
    private static String lllIIlIIIIIIIlI(final String lllllllllllllIIIlllIllllIIIIIIIl, final String lllllllllllllIIIlllIllllIIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllllIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), CommandSetPlayerTimeout.lIlIIIlllIllIl[5]), "DES");
            final Cipher lllllllllllllIIIlllIllllIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllllIIIIIlIl.init(CommandSetPlayerTimeout.lIlIIIlllIllIl[3], lllllllllllllIIIlllIllllIIIIIllI);
            return new String(lllllllllllllIIIlllIllllIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllllIIIIIlII) {
            lllllllllllllIIIlllIllllIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlIIIIlIIlI(final int lllllllllllllIIIlllIlllIlllIlIlI, final int lllllllllllllIIIlllIlllIlllIlIIl) {
        return lllllllllllllIIIlllIlllIlllIlIlI != lllllllllllllIIIlllIlllIlllIlIIl;
    }
    
    private static void lllIIlIIIIIIIll() {
        (lIlIIIllIllllI = new String[CommandSetPlayerTimeout.lIlIIIlllIllIl[4]])[CommandSetPlayerTimeout.lIlIIIlllIllIl[0]] = lllIIIlllllllIl("whl0vx1HysvzPYgfVKTGAQ==", "bIkDn");
        CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[2]] = lllIIlIIIIIIIIl("GiQBLhEXLx9tAxw/BSccHD8FLhUWPhhtBQoqCyY=", "yKlCp");
        CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[3]] = lllIIlIIIIIIIlI("fuM0wM6uODbDoRhVSb3Vn5PPnq/JkeXYTsVBz+LDmE0=", "xSuME");
        CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[1]] = lllIIlIIIIIIIlI("KFbw/Y7HBEDDfVkRzCqah1PJX/BKlo1TQnSCa8i2KSw=", "fPXTf");
    }
    
    @Override
    public String getCommandName() {
        return CommandSetPlayerTimeout.lIlIIIllIllllI[CommandSetPlayerTimeout.lIlIIIlllIllIl[0]];
    }
    
    private static boolean lllIIlIIIIlIIll(final int lllllllllllllIIIlllIlllIlllIlllI, final int lllllllllllllIIIlllIlllIlllIllIl) {
        return lllllllllllllIIIlllIlllIlllIlllI < lllllllllllllIIIlllIlllIlllIllIl;
    }
}
