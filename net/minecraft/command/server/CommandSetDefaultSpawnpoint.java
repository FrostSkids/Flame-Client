// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.server.MinecraftServer;
import net.minecraft.command.WrongUsageException;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandBase;

public class CommandSetDefaultSpawnpoint extends CommandBase
{
    private static final /* synthetic */ String[] lIIllIIIllIlII;
    private static final /* synthetic */ int[] lIIllIIIllIllI;
    
    private static boolean llIlIllIllIIlII(final int lllllllllllllIIlIllIIlIllllIIIlI, final int lllllllllllllIIlIllIIlIllllIIIIl) {
        return lllllllllllllIIlIllIIlIllllIIIlI <= lllllllllllllIIlIllIIlIllllIIIIl;
    }
    
    private static String llIlIllIlIIIlII(final String lllllllllllllIIlIllIIlIlllllIIll, final String lllllllllllllIIlIllIIlIllllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIlIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIlIllllIllll.getBytes(StandardCharsets.UTF_8)), CommandSetDefaultSpawnpoint.lIIllIIIllIllI[5]), "DES");
            final Cipher lllllllllllllIIlIllIIlIlllllIllI = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIlIlllllIllI.init(CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1], lllllllllllllIIlIllIIlIllllllIII);
            return new String(lllllllllllllIIlIllIIlIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIlIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIlIlllllIlII) {
            lllllllllllllIIlIllIIlIlllllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIllIIIII(final int lllllllllllllIIlIllIIlIlllIllIlI) {
        return lllllllllllllIIlIllIIlIlllIllIlI == 0;
    }
    
    private static void llIlIllIlIlllll() {
        (lIIllIIIllIllI = new int[6])[0] = ((0x8D ^ 0x9F) & ~(0x86 ^ 0x94));
        CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1] = "  ".length();
        CommandSetDefaultSpawnpoint.lIIllIIIllIllI[2] = " ".length();
        CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3] = "   ".length();
        CommandSetDefaultSpawnpoint.lIIllIIIllIllI[4] = (0x1B ^ 0x59 ^ (0xDE ^ 0x98));
        CommandSetDefaultSpawnpoint.lIIllIIIllIllI[5] = (0x60 ^ 0x45 ^ (0x1C ^ 0x31));
    }
    
    private static String llIlIllIlIIIIll(final String lllllllllllllIIlIllIIllIIIllIlll, final String lllllllllllllIIlIllIIllIIIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIllIIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIllIIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIllIIIlllIll.init(CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1], lllllllllllllIIlIllIIllIIIllllIl);
            return new String(lllllllllllllIIlIllIIllIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIllIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIllIIIlllIIl) {
            lllllllllllllIIlIllIIllIIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIllIIllIIlIlIllI, final String[] lllllllllllllIIlIllIIllIIlIlIIII, final BlockPos lllllllllllllIIlIllIIllIIlIIlllI) {
        List<String> func_175771_a;
        if (llIlIllIllIIIll(lllllllllllllIIlIllIIllIIlIlIIII.length) && llIlIllIllIIlII(lllllllllllllIIlIllIIllIIlIlIIII.length, CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3])) {
            func_175771_a = CommandBase.func_175771_a(lllllllllllllIIlIllIIllIIlIlIIII, CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0], lllllllllllllIIlIllIIllIIlIIlllI);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            func_175771_a = null;
        }
        return func_175771_a;
    }
    
    private static String llIlIllIlIIIlIl(String lllllllllllllIIlIllIIllIIIIlIIIl, final String lllllllllllllIIlIllIIllIIIIlIIII) {
        lllllllllllllIIlIllIIllIIIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIllIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIllIIIIlIllI = new StringBuilder();
        final char[] lllllllllllllIIlIllIIllIIIIlIlII = lllllllllllllIIlIllIIllIIIIlIIII.toCharArray();
        int lllllllllllllIIlIllIIllIIIIlIIlI = CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0];
        final int lllllllllllllIIlIllIIllIIIIIlIll = (Object)lllllllllllllIIlIllIIllIIIIlIIIl.toCharArray();
        final Exception lllllllllllllIIlIllIIllIIIIIlIIl = (Exception)lllllllllllllIIlIllIIllIIIIIlIll.length;
        long lllllllllllllIIlIllIIllIIIIIIlll = CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0];
        while (llIlIllIllIIlIl((int)lllllllllllllIIlIllIIllIIIIIIlll, (int)lllllllllllllIIlIllIIllIIIIIlIIl)) {
            final char lllllllllllllIIlIllIIllIIIIllIIl = lllllllllllllIIlIllIIllIIIIIlIll[lllllllllllllIIlIllIIllIIIIIIlll];
            lllllllllllllIIlIllIIllIIIIlIllI.append((char)(lllllllllllllIIlIllIIllIIIIllIIl ^ lllllllllllllIIlIllIIllIIIIlIlII[lllllllllllllIIlIllIIllIIIIlIIlI % lllllllllllllIIlIllIIllIIIIlIlII.length]));
            "".length();
            ++lllllllllllllIIlIllIIllIIIIlIIlI;
            ++lllllllllllllIIlIllIIllIIIIIIlll;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIllIIIIlIllI);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1];
    }
    
    private static boolean llIlIllIllIIIll(final int lllllllllllllIIlIllIIlIlllIlIlIl) {
        return lllllllllllllIIlIllIIlIlllIlIlIl > 0;
    }
    
    private static boolean llIlIllIllIIIIl(final int lllllllllllllIIlIllIIlIllllIlIlI, final int lllllllllllllIIlIllIIlIllllIlIIl) {
        return lllllllllllllIIlIllIIlIllllIlIlI == lllllllllllllIIlIllIIlIllllIlIIl;
    }
    
    @Override
    public String getCommandName() {
        return CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0]];
    }
    
    private static boolean llIlIllIllIIIlI(final Object lllllllllllllIIlIllIIlIlllIllllI) {
        return lllllllllllllIIlIllIIlIlllIllllI == null;
    }
    
    private static boolean llIlIllIllIIlIl(final int lllllllllllllIIlIllIIlIllllIIllI, final int lllllllllllllIIlIllIIlIllllIIlIl) {
        return lllllllllllllIIlIllIIlIllllIIllI < lllllllllllllIIlIllIIlIllllIIlIl;
    }
    
    static {
        llIlIllIlIlllll();
        llIlIllIlIIIllI();
    }
    
    private static void llIlIllIlIIIllI() {
        (lIIllIIIllIlII = new String[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[4]])[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0]] = llIlIllIlIIIIll("DvEiTBKmDXec/ZlJ1IUUBg==", "zFYSO");
        CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[2]] = llIlIllIlIIIlII("yLSNuQzCqP62ynlIWZtuh70sKUP4o+YSe88NPlMWPl4=", "XFLnq");
        CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1]] = llIlIllIlIIIlIl("BygkCiUKIzpJNwEzPgg2CCM6FyUTKWcSNwUgLA==", "dGIgD");
        CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3]] = llIlIllIlIIIlII("t73kUaLMip4rg1unVYDovSLZ7DhQNKgoqr44527DMTM=", "yFKoG");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIllIIllIlIIIIIll) {
        return CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[2]];
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIllIIllIIllIIlIl, final String[] lllllllllllllIIlIllIIllIIllIllIl) throws CommandException {
        BlockPos lllllllllllllIIlIllIIllIIllIlIIl = null;
        if (llIlIllIllIIIII(lllllllllllllIIlIllIIllIIllIllIl.length)) {
            final BlockPos lllllllllllllIIlIllIIllIIllIlIll = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIlIllIIllIIllIIlIl).getPosition();
            "".length();
            if (((3 + 86 - 68 + 128 ^ 89 + 6 + 52 + 0) & (0x18 ^ 0x3 ^ (0x9A ^ 0x87) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            if (!llIlIllIllIIIIl(lllllllllllllIIlIllIIllIIllIllIl.length, CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3]) || llIlIllIllIIIlI(lllllllllllllIIlIllIIllIIllIIlIl.getEntityWorld())) {
                throw new WrongUsageException(CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1]], new Object[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0]]);
            }
            lllllllllllllIIlIllIIllIIllIlIIl = CommandBase.parseBlockPos(lllllllllllllIIlIllIIllIIllIIlIl, lllllllllllllIIlIllIIllIIllIllIl, CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0], (boolean)(CommandSetDefaultSpawnpoint.lIIllIIIllIllI[2] != 0));
        }
        lllllllllllllIIlIllIIllIIllIIlIl.getEntityWorld().setSpawnPoint(lllllllllllllIIlIllIIllIIllIlIIl);
        MinecraftServer.getServer().getConfigurationManager().sendPacketToAllPlayers(new S05PacketSpawnPosition(lllllllllllllIIlIllIIllIIllIlIIl));
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandSetDefaultSpawnpoint.lIIllIIIllIlII[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[3]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[0]] = lllllllllllllIIlIllIIllIIllIlIIl.getX();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[2]] = lllllllllllllIIlIllIIllIIllIlIIl.getY();
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetDefaultSpawnpoint.lIIllIIIllIllI[1]] = lllllllllllllIIlIllIIllIIllIlIIl.getZ();
        CommandBase.notifyOperators(lllllllllllllIIlIllIIllIIllIIlIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
}
