// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldSettings;
import net.minecraft.util.ChatComponentTranslation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandDefaultGameMode extends CommandGameMode
{
    private static final /* synthetic */ String[] lIlllIIIlIIIIl;
    private static final /* synthetic */ int[] lIlllIIIlIIlII;
    
    private static boolean lIIIIIIlIIlIIlIl(final int llllllllllllIlllllIllIlllIIlIIIl, final int llllllllllllIlllllIllIlllIIlIIII) {
        return llllllllllllIlllllIllIlllIIlIIIl < llllllllllllIlllllIllIlllIIlIIII;
    }
    
    private static String lIIIIIIlIIIlllII(final String llllllllllllIlllllIllIlllIlllllI, final String llllllllllllIlllllIllIlllIllllIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIllllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIlllIllllIl.getBytes(StandardCharsets.UTF_8)), CommandDefaultGameMode.lIlllIIIlIIlII[6]), "DES");
            final Cipher llllllllllllIlllllIllIllllIIIIII = Cipher.getInstance("DES");
            llllllllllllIlllllIllIllllIIIIII.init(CommandDefaultGameMode.lIlllIIIlIIlII[2], llllllllllllIlllllIllIllllIIIIIl);
            return new String(llllllllllllIlllllIllIllllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIlllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIlllIllllll) {
            llllllllllllIlllllIllIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIlIIlIIlII(final int llllllllllllIlllllIllIlllIIIllII) {
        return llllllllllllIlllllIllIlllIIIllII == 0;
    }
    
    private static boolean lIIIIIIlIIlIIIlI(final int llllllllllllIlllllIllIlllIIIlIlI) {
        return llllllllllllIlllllIllIlllIIIlIlI <= 0;
    }
    
    @Override
    public String getCommandName() {
        return CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[0]];
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlllllIllIllllIlIlII, final String[] llllllllllllIlllllIllIllllIlIIll) throws CommandException {
        if (lIIIIIIlIIlIIIlI(llllllllllllIlllllIllIllllIlIIll.length)) {
            throw new WrongUsageException(CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[2]], new Object[CommandDefaultGameMode.lIlllIIIlIIlII[0]]);
        }
        final WorldSettings.GameType llllllllllllIlllllIllIllllIlIllI = this.getGameModeFromCommand(llllllllllllIlllllIllIllllIlIlII, llllllllllllIlllllIllIllllIlIIll[CommandDefaultGameMode.lIlllIIIlIIlII[0]]);
        this.setGameType(llllllllllllIlllllIllIllllIlIllI);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[3]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandDefaultGameMode.lIlllIIIlIIlII[1]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandDefaultGameMode.lIlllIIIlIIlII[0]] = new ChatComponentTranslation(String.valueOf(new StringBuilder(CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[4]]).append(llllllllllllIlllllIllIllllIlIllI.getName())), new Object[CommandDefaultGameMode.lIlllIIIlIIlII[0]]);
        CommandBase.notifyOperators(llllllllllllIlllllIllIllllIlIlII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static String lIIIIIIlIIIllIll(String llllllllllllIlllllIllIlllIlIIIIl, final String llllllllllllIlllllIllIlllIlIIIII) {
        llllllllllllIlllllIllIlllIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIllIlllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIllIlllIIlllll = new StringBuilder();
        final char[] llllllllllllIlllllIllIlllIIllllI = llllllllllllIlllllIllIlllIlIIIII.toCharArray();
        int llllllllllllIlllllIllIlllIIlllIl = CommandDefaultGameMode.lIlllIIIlIIlII[0];
        final Exception llllllllllllIlllllIllIlllIIlIlll = (Object)llllllllllllIlllllIllIlllIlIIIIl.toCharArray();
        final short llllllllllllIlllllIllIlllIIlIllI = (short)llllllllllllIlllllIllIlllIIlIlll.length;
        short llllllllllllIlllllIllIlllIIlIlIl = (short)CommandDefaultGameMode.lIlllIIIlIIlII[0];
        while (lIIIIIIlIIlIIlIl(llllllllllllIlllllIllIlllIIlIlIl, llllllllllllIlllllIllIlllIIlIllI)) {
            final char llllllllllllIlllllIllIlllIlIIIlI = llllllllllllIlllllIllIlllIIlIlll[llllllllllllIlllllIllIlllIIlIlIl];
            llllllllllllIlllllIllIlllIIlllll.append((char)(llllllllllllIlllllIllIlllIlIIIlI ^ llllllllllllIlllllIllIlllIIllllI[llllllllllllIlllllIllIlllIIlllIl % llllllllllllIlllllIllIlllIIllllI.length]));
            "".length();
            ++llllllllllllIlllllIllIlllIIlllIl;
            ++llllllllllllIlllllIllIlllIIlIlIl;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIllIlllIIlllll);
    }
    
    private static void lIIIIIIlIIIllllI() {
        (lIlllIIIlIIIIl = new String[CommandDefaultGameMode.lIlllIIIlIIlII[5]])[CommandDefaultGameMode.lIlllIIIlIIlII[0]] = lIIIIIIlIIIllIll("PT0kCw01LCULFTw1LQ4d", "YXBjx");
        CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[1]] = lIIIIIIlIIIllIll("FSQoKDAYLzZrNRMtJDA9AiwkKDQbJCEgfwM4JCI0", "vKEEQ");
        CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[2]] = lIIIIIIlIIIlllII("O1S2KDJsh/GOSIbOa3BJGvdDnQv5dBPT/uiBBB0lzsA=", "lQhmV");
        CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[3]] = lIIIIIIlIIIllIll("GjYFGgoXPRtZDxw/CQIHDT4JGg4UNgwSRQosCxQOCio=", "yYhwk");
        CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[4]] = lIIIIIIlIIIlllIl("fubS/cHa03HAdCevNoT6Cw==", "iOadu");
    }
    
    static {
        lIIIIIIlIIlIIIIl();
        lIIIIIIlIIIllllI();
    }
    
    protected void setGameType(final WorldSettings.GameType llllllllllllIlllllIllIllllIIlIIl) {
        final MinecraftServer llllllllllllIlllllIllIllllIIlIll = MinecraftServer.getServer();
        llllllllllllIlllllIllIllllIIlIll.setGameType(llllllllllllIlllllIllIllllIIlIIl);
        if (lIIIIIIlIIlIIIll(llllllllllllIlllllIllIllllIIlIll.getForceGamemode() ? 1 : 0)) {
            final byte llllllllllllIlllllIllIllllIIIllI = (byte)MinecraftServer.getServer().getConfigurationManager().func_181057_v().iterator();
            "".length();
            if ("   ".length() < ((95 + 61 - 79 + 83 ^ 45 + 48 - 60 + 148) & (0x70 ^ 0x2C ^ (0x1B ^ 0x52) ^ -" ".length()))) {
                return;
            }
            while (!lIIIIIIlIIlIIlII(((Iterator)llllllllllllIlllllIllIllllIIIllI).hasNext() ? 1 : 0)) {
                final EntityPlayerMP llllllllllllIlllllIllIllllIIlIlI = ((Iterator<EntityPlayerMP>)llllllllllllIlllllIllIllllIIIllI).next();
                llllllllllllIlllllIllIllllIIlIlI.setGameType(llllllllllllIlllllIllIllllIIlIIl);
                llllllllllllIlllllIllIllllIIlIlI.fallDistance = 0.0f;
            }
        }
    }
    
    private static void lIIIIIIlIIlIIIIl() {
        (lIlllIIIlIIlII = new int[7])[0] = ((0x2F ^ 0x8 ^ (0x8E ^ 0x8A)) & (0x23 ^ 0x4E ^ (0x1A ^ 0x54) ^ -" ".length()));
        CommandDefaultGameMode.lIlllIIIlIIlII[1] = " ".length();
        CommandDefaultGameMode.lIlllIIIlIIlII[2] = "  ".length();
        CommandDefaultGameMode.lIlllIIIlIIlII[3] = "   ".length();
        CommandDefaultGameMode.lIlllIIIlIIlII[4] = (0xAC ^ 0xA8);
        CommandDefaultGameMode.lIlllIIIlIIlII[5] = (0xA2 ^ 0xA7);
        CommandDefaultGameMode.lIlllIIIlIIlII[6] = (0x14 ^ 0x1C);
    }
    
    private static boolean lIIIIIIlIIlIIIll(final int llllllllllllIlllllIllIlllIIIlllI) {
        return llllllllllllIlllllIllIlllIIIlllI != 0;
    }
    
    private static String lIIIIIIlIIIlllIl(final String llllllllllllIlllllIllIlllIlIllll, final String llllllllllllIlllllIllIlllIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIlllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIlllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIllIlllIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIllIlllIllIIll.init(CommandDefaultGameMode.lIlllIIIlIIlII[2], llllllllllllIlllllIllIlllIllIlII);
            return new String(llllllllllllIlllllIllIlllIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIlllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIlllIllIIlI) {
            llllllllllllIlllllIllIlllIllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlllllIllIllllIllllI) {
        return CommandDefaultGameMode.lIlllIIIlIIIIl[CommandDefaultGameMode.lIlllIIIlIIlII[1]];
    }
}
