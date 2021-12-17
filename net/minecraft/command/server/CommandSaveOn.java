// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.world.WorldServer;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandException;
import net.minecraft.server.MinecraftServer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.command.ICommandSender;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandSaveOn extends CommandBase
{
    private static final /* synthetic */ int[] llIlllIlIlIIIl;
    private static final /* synthetic */ String[] llIlllIIlIllIl;
    
    private static String lIIllIIlIllIIIIl(String llllllllllllIllIIlIIIlllllIllllI, final String llllllllllllIllIIlIIIlllllIlllIl) {
        llllllllllllIllIIlIIIlllllIllllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIllllllIIIIl = new StringBuilder();
        final char[] llllllllllllIllIIlIIIllllllIIIII = llllllllllllIllIIlIIIlllllIlllIl.toCharArray();
        int llllllllllllIllIIlIIIlllllIlllll = CommandSaveOn.llIlllIlIlIIIl[0];
        final short llllllllllllIllIIlIIIlllllIllIIl = (Object)llllllllllllIllIIlIIIlllllIllllI.toCharArray();
        final byte llllllllllllIllIIlIIIlllllIllIII = (byte)llllllllllllIllIIlIIIlllllIllIIl.length;
        long llllllllllllIllIIlIIIlllllIlIlll = CommandSaveOn.llIlllIlIlIIIl[0];
        while (lIIllIIlllIlIIIl((int)llllllllllllIllIIlIIIlllllIlIlll, llllllllllllIllIIlIIIlllllIllIII)) {
            final char llllllllllllIllIIlIIIllllllIIlII = llllllllllllIllIIlIIIlllllIllIIl[llllllllllllIllIIlIIIlllllIlIlll];
            llllllllllllIllIIlIIIllllllIIIIl.append((char)(llllllllllllIllIIlIIIllllllIIlII ^ llllllllllllIllIIlIIIllllllIIIII[llllllllllllIllIIlIIIlllllIlllll % llllllllllllIllIIlIIIllllllIIIII.length]));
            "".length();
            ++llllllllllllIllIIlIIIlllllIlllll;
            ++llllllllllllIllIIlIIIlllllIlIlll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIllllllIIIIl);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIlIIlIIIIIIIlllI) {
        return CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[1]];
    }
    
    private static boolean lIIllIIlllIIlllI(final Object llllllllllllIllIIlIIIllllIllllll) {
        return llllllllllllIllIIlIIIllllIllllll != null;
    }
    
    private static boolean lIIllIIlllIlIIII(final int llllllllllllIllIIlIIIlllllIIIllI, final int llllllllllllIllIIlIIIlllllIIIlIl) {
        return llllllllllllIllIIlIIIlllllIIIllI >= llllllllllllIllIIlIIIlllllIIIlIl;
    }
    
    @Override
    public String getCommandName() {
        return CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[0]];
    }
    
    private static void lIIllIIlllIIllIl() {
        (llIlllIlIlIIIl = new int[6])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        CommandSaveOn.llIlllIlIlIIIl[1] = " ".length();
        CommandSaveOn.llIlllIlIlIIIl[2] = "  ".length();
        CommandSaveOn.llIlllIlIlIIIl[3] = "   ".length();
        CommandSaveOn.llIlllIlIlIIIl[4] = (0xCD ^ 0xAA ^ (0x42 ^ 0x21));
        CommandSaveOn.llIlllIlIlIIIl[5] = (0x62 ^ 0x6A);
    }
    
    private static boolean lIIllIIlllIIllll(final int llllllllllllIllIIlIIIllllIllllIl) {
        return llllllllllllIllIIlIIIllllIllllIl != 0;
    }
    
    private static String lIIllIIlIllIIIlI(final String llllllllllllIllIIlIIIlllllIIllII, final String llllllllllllIllIIlIIIlllllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlllllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlllllIIlIll.getBytes(StandardCharsets.UTF_8)), CommandSaveOn.llIlllIlIlIIIl[5]), "DES");
            final Cipher llllllllllllIllIIlIIIlllllIlIIII = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIlllllIlIIII.init(CommandSaveOn.llIlllIlIlIIIl[2], llllllllllllIllIIlIIIlllllIlIIIl);
            return new String(llllllllllllIllIIlIIIlllllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlllllIIllll) {
            llllllllllllIllIIlIIIlllllIIllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIIlIllIIIII(final String llllllllllllIllIIlIIIlllllllIIIl, final String llllllllllllIllIIlIIIlllllllIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlllllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIIlllllllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIIlllllllIlIl.init(CommandSaveOn.llIlllIlIlIIIl[2], llllllllllllIllIIlIIIlllllllIllI);
            return new String(llllllllllllIllIIlIIIlllllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlllllllIlII) {
            llllllllllllIllIIlIIIlllllllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIlIIlIIIIIIIIllI, final String[] llllllllllllIllIIlIIlIIIIIIIIlIl) throws CommandException {
        final MinecraftServer llllllllllllIllIIlIIlIIIIIIIIlII = MinecraftServer.getServer();
        boolean llllllllllllIllIIlIIlIIIIIIIIIll = CommandSaveOn.llIlllIlIlIIIl[0] != 0;
        int llllllllllllIllIIlIIlIIIIIIIIIlI = CommandSaveOn.llIlllIlIlIIIl[0];
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIIllIIlllIlIIII(llllllllllllIllIIlIIlIIIIIIIIIlI, llllllllllllIllIIlIIlIIIIIIIIlII.worldServers.length)) {
            if (lIIllIIlllIIlllI(llllllllllllIllIIlIIlIIIIIIIIlII.worldServers[llllllllllllIllIIlIIlIIIIIIIIIlI])) {
                final WorldServer llllllllllllIllIIlIIlIIIIIIIIIIl = llllllllllllIllIIlIIlIIIIIIIIlII.worldServers[llllllllllllIllIIlIIlIIIIIIIIIlI];
                if (lIIllIIlllIIllll(llllllllllllIllIIlIIlIIIIIIIIIIl.disableLevelSaving ? 1 : 0)) {
                    llllllllllllIllIIlIIlIIIIIIIIIIl.disableLevelSaving = (CommandSaveOn.llIlllIlIlIIIl[0] != 0);
                    llllllllllllIllIIlIIlIIIIIIIIIll = (CommandSaveOn.llIlllIlIlIIIl[1] != 0);
                }
            }
            ++llllllllllllIllIIlIIlIIIIIIIIIlI;
        }
        if (!lIIllIIlllIIllll(llllllllllllIllIIlIIlIIIIIIIIIll ? 1 : 0)) {
            throw new CommandException(CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[3]], new Object[CommandSaveOn.llIlllIlIlIIIl[0]]);
        }
        CommandBase.notifyOperators(llllllllllllIllIIlIIlIIIIIIIIllI, this, CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[2]], new Object[CommandSaveOn.llIlllIlIlIIIl[0]]);
        "".length();
        if (((0x14 ^ 0x46) & ~(0xD1 ^ 0x83)) != 0x0) {
            return;
        }
    }
    
    private static boolean lIIllIIlllIlIIIl(final int llllllllllllIllIIlIIIlllllIIIIlI, final int llllllllllllIllIIlIIIlllllIIIIIl) {
        return llllllllllllIllIIlIIIlllllIIIIlI < llllllllllllIllIIlIIIlllllIIIIIl;
    }
    
    static {
        lIIllIIlllIIllIl();
        lIIllIIlllIIllII();
    }
    
    private static void lIIllIIlllIIllII() {
        (llIlllIIlIllIl = new String[CommandSaveOn.llIlllIlIlIIIl[4]])[CommandSaveOn.llIlllIlIlIIIl[0]] = lIIllIIlIllIIIII("VFe/2HSPObk=", "ZSSvO");
        CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[1]] = lIIllIIlIllIIIIl("Lwg3OQgiAyl6Gi0RP3kGIkkvJwgrAg==", "LgZTi");
        CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[2]] = lIIllIIlIllIIIlI("hkA3rCznwskMFhLx+PZKHj3Gw3nJzX0j", "CQBXD");
        CommandSaveOn.llIlllIIlIllIl[CommandSaveOn.llIlllIlIlIIIl[3]] = lIIllIIlIllIIIlI("pTORvb6fH40P4v4+T86JsbwyPFngdv2M+726qD0pLvE=", "odlkg");
    }
}
