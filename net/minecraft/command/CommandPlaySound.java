// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandPlaySound extends CommandBase
{
    private static final /* synthetic */ String[] lIIIIIllIlIlll;
    private static final /* synthetic */ int[] lIIIIIllIllllI;
    
    private static int lIllIlllIlIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public String getCommandName() {
        return CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[0]];
    }
    
    private static String lIllIlllIIIlllI(final String lllllllllllllIlIIllIllIlIllIIlIl, final String lllllllllllllIlIIllIllIlIllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllIlIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIllIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), CommandPlaySound.lIIIIIllIllllI[6]), "DES");
            final Cipher lllllllllllllIlIIllIllIlIllIIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIllIllIlIllIIlll.init(CommandPlaySound.lIIIIIllIllllI[1], lllllllllllllIlIIllIllIlIllIlIII);
            return new String(lllllllllllllIlIIllIllIlIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllIlIllIIllI) {
            lllllllllllllIlIIllIllIlIllIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlllIlIllll(final int lllllllllllllIlIIllIllIlIlIIlIII, final int lllllllllllllIlIIllIllIlIlIIIlll) {
        return lllllllllllllIlIIllIllIlIlIIlIII <= lllllllllllllIlIIllIllIlIlIIIlll;
    }
    
    private static boolean lIllIlllIlIlIll(final int lllllllllllllIlIIllIllIlIlIIIlII, final int lllllllllllllIlIIllIllIlIlIIIIll) {
        return lllllllllllllIlIIllIllIlIlIIIlII > lllllllllllllIlIIllIllIlIlIIIIll;
    }
    
    private static boolean lIllIlllIlIlIlI(final int lllllllllllllIlIIllIllIlIlIIllII, final int lllllllllllllIlIIllIllIlIlIIlIll) {
        return lllllllllllllIlIIllIllIlIlIIllII < lllllllllllllIlIIllIllIlIlIIlIll;
    }
    
    static {
        lIllIlllIlIIlll();
        lIllIlllIlIIlII();
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIlIIllIllIlIllIllll, final int lllllllllllllIlIIllIllIlIllIllIl) {
        if (lIllIlllIlIlllI(lllllllllllllIlIIllIllIlIllIllIl, CommandPlaySound.lIIIIIllIllllI[2])) {
            return CommandPlaySound.lIIIIIllIllllI[2] != 0;
        }
        return CommandPlaySound.lIIIIIllIllllI[0] != 0;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIllIllIllllIlIlI) {
        return CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[2]];
    }
    
    private static boolean lIllIlllIlIlllI(final int lllllllllllllIlIIllIllIlIlIlIIII, final int lllllllllllllIlIIllIllIlIlIIllll) {
        return lllllllllllllIlIIllIllIlIlIlIIII == lllllllllllllIlIIllIllIlIlIIllll;
    }
    
    private static boolean lIllIlllIlIllII(final int lllllllllllllIlIIllIllIlIIllllll) {
        return lllllllllllllIlIIllIllIlIIllllll > 0;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIllIllIllIIIlIll, final String[] lllllllllllllIlIIllIllIllIIIlIlI) throws CommandException {
        if (lIllIlllIlIlIlI(lllllllllllllIlIIllIllIllIIIlIlI.length, CommandPlaySound.lIIIIIllIllllI[1])) {
            throw new WrongUsageException(this.getCommandUsage(lllllllllllllIlIIllIllIllIIIlIll), new Object[CommandPlaySound.lIIIIIllIllllI[0]]);
        }
        int lllllllllllllIlIIllIllIllIIlllII = CommandPlaySound.lIIIIIllIllllI[0];
        final String lllllllllllllIlIIllIllIllIIllIll = lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++];
        final EntityPlayerMP lllllllllllllIlIIllIllIllIIllIlI = CommandBase.getPlayer(lllllllllllllIlIIllIllIllIIIlIll, lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++]);
        final Vec3 lllllllllllllIlIIllIllIllIIllIIl = lllllllllllllIlIIllIllIllIIIlIll.getPositionVector();
        double lllllllllllllIlIIllIllIllIIllIII = lllllllllllllIlIIllIllIllIIllIIl.xCoord;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIllIII = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIllIII, lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++], (boolean)(CommandPlaySound.lIIIIIllIllllI[2] != 0));
        }
        double lllllllllllllIlIIllIllIllIIlIlll = lllllllllllllIlIIllIllIllIIllIIl.yCoord;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIlIlll = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIlIlll, lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++], CommandPlaySound.lIIIIIllIllllI[0], CommandPlaySound.lIIIIIllIllllI[0], (boolean)(CommandPlaySound.lIIIIIllIllllI[0] != 0));
        }
        double lllllllllllllIlIIllIllIllIIlIllI = lllllllllllllIlIIllIllIllIIllIIl.zCoord;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIlIllI = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIlIllI, lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++], (boolean)(CommandPlaySound.lIIIIIllIllllI[2] != 0));
        }
        double lllllllllllllIlIIllIllIllIIlIlIl = 1.0;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIlIlIl = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++], 0.0, 3.4028234663852886E38);
        }
        double lllllllllllllIlIIllIllIllIIlIlII = 1.0;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIlIlII = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII++], 0.0, 2.0);
        }
        double lllllllllllllIlIIllIllIllIIlIIll = 0.0;
        if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIllIIIlIlI.length, lllllllllllllIlIIllIllIllIIlllII)) {
            lllllllllllllIlIIllIllIllIIlIIll = CommandBase.parseDouble(lllllllllllllIlIIllIllIllIIIlIlI[lllllllllllllIlIIllIllIllIIlllII], 0.0, 1.0);
        }
        double n;
        if (lIllIlllIlIllII(lIllIlllIlIlIII(lllllllllllllIlIIllIllIllIIlIlIl, 1.0))) {
            n = lllllllllllllIlIIllIllIllIIlIlIl * 16.0;
            "".length();
            if ("   ".length() <= ((55 + 60 - 23 + 111 ^ 166 + 49 - 138 + 91) & (0x42 ^ 0x6 ^ (0x67 ^ 0x40) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = 16.0;
        }
        final double lllllllllllllIlIIllIllIllIIlIIlI = n;
        final double lllllllllllllIlIIllIllIllIIlIIIl = lllllllllllllIlIIllIllIllIIllIlI.getDistance(lllllllllllllIlIIllIllIllIIllIII, lllllllllllllIlIIllIllIllIIlIlll, lllllllllllllIlIIllIllIllIIlIllI);
        if (lIllIlllIlIllII(lIllIlllIlIlIII(lllllllllllllIlIIllIllIllIIlIIIl, lllllllllllllIlIIllIllIllIIlIIlI))) {
            if (lIllIlllIlIllIl(lIllIlllIlIlIIl(lllllllllllllIlIIllIllIllIIlIIll, 0.0))) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[1]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandPlaySound.lIIIIIllIllllI[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandPlaySound.lIIIIIllIllllI[0]] = lllllllllllllIlIIllIllIllIIllIlI.getName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            final double lllllllllllllIlIIllIllIllIIlIIII = lllllllllllllIlIIllIllIllIIllIII - lllllllllllllIlIIllIllIllIIllIlI.posX;
            final double lllllllllllllIlIIllIllIllIIIllll = lllllllllllllIlIIllIllIllIIlIlll - lllllllllllllIlIIllIllIllIIllIlI.posY;
            final double lllllllllllllIlIIllIllIllIIIlllI = lllllllllllllIlIIllIllIllIIlIllI - lllllllllllllIlIIllIllIllIIllIlI.posZ;
            final double lllllllllllllIlIIllIllIllIIIllIl = Math.sqrt(lllllllllllllIlIIllIllIllIIlIIII * lllllllllllllIlIIllIllIllIIlIIII + lllllllllllllIlIIllIllIllIIIllll * lllllllllllllIlIIllIllIllIIIllll + lllllllllllllIlIIllIllIllIIIlllI * lllllllllllllIlIIllIllIllIIIlllI);
            if (lIllIlllIlIllII(lIllIlllIlIlIII(lllllllllllllIlIIllIllIllIIIllIl, 0.0))) {
                lllllllllllllIlIIllIllIllIIllIII = lllllllllllllIlIIllIllIllIIllIlI.posX + lllllllllllllIlIIllIllIllIIlIIII / lllllllllllllIlIIllIllIllIIIllIl * 2.0;
                lllllllllllllIlIIllIllIllIIlIlll = lllllllllllllIlIIllIllIllIIllIlI.posY + lllllllllllllIlIIllIllIllIIIllll / lllllllllllllIlIIllIllIllIIIllIl * 2.0;
                lllllllllllllIlIIllIllIllIIlIllI = lllllllllllllIlIIllIllIllIIllIlI.posZ + lllllllllllllIlIIllIllIllIIIlllI / lllllllllllllIlIIllIllIllIIIllIl * 2.0;
            }
            lllllllllllllIlIIllIllIllIIlIlIl = lllllllllllllIlIIllIllIllIIlIIll;
        }
        lllllllllllllIlIIllIllIllIIllIlI.playerNetServerHandler.sendPacket(new S29PacketSoundEffect(lllllllllllllIlIIllIllIllIIllIll, lllllllllllllIlIIllIllIllIIllIII, lllllllllllllIlIIllIllIllIIlIlll, lllllllllllllIlIIllIllIllIIlIllI, (float)lllllllllllllIlIIllIllIllIIlIlIl, (float)lllllllllllllIlIIllIllIllIIlIlII));
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[3]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandPlaySound.lIIIIIllIllllI[1]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandPlaySound.lIIIIIllIllllI[0]] = lllllllllllllIlIIllIllIllIIllIll;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandPlaySound.lIIIIIllIllllI[2]] = lllllllllllllIlIIllIllIllIIllIlI.getName();
        CommandBase.notifyOperators(lllllllllllllIlIIllIllIllIIIlIll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIIllIllIlIlllIllI, final String[] lllllllllllllIlIIllIllIlIlllIlIl, final BlockPos lllllllllllllIlIIllIllIlIlllIlII) {
        List<String> list;
        if (lIllIlllIlIlllI(lllllllllllllIlIIllIllIlIlllIlIl.length, CommandPlaySound.lIIIIIllIllllI[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIllIllIlIlllIlIl, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else if (lIllIlllIlIlIll(lllllllllllllIlIIllIllIlIlllIlIl.length, CommandPlaySound.lIIIIIllIllllI[1]) && lIllIlllIlIllll(lllllllllllllIlIIllIllIlIlllIlIl.length, CommandPlaySound.lIIIIIllIllllI[4])) {
            list = CommandBase.func_175771_a(lllllllllllllIlIIllIllIlIlllIlIl, CommandPlaySound.lIIIIIllIllllI[1], lllllllllllllIlIIllIllIlIlllIlII);
            "".length();
            if ("  ".length() < ((0x20 ^ 0x3C ^ ((0xA2 ^ 0xAB) & ~(0x10 ^ 0x19))) & (158 + 37 - 89 + 61 ^ 26 + 13 + 41 + 107 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static String lIllIlllIIIllll(final String lllllllllllllIlIIllIllIlIlIlIllI, final String lllllllllllllIlIIllIllIlIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIllIlIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIllIlIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIllIlIlIllIlI.init(CommandPlaySound.lIIIIIllIllllI[1], lllllllllllllIlIIllIllIlIlIllIll);
            return new String(lllllllllllllIlIIllIllIlIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIllIlIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIllIlIlIllIIl) {
            lllllllllllllIlIIllIllIlIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIlllIlIIlII() {
        (lIIIIIllIlIlll = new String[CommandPlaySound.lIIIIIllIllllI[5]])[CommandPlaySound.lIIIIIllIllllI[0]] = lIllIlllIIIlllI("PLMxUewSyRYl/z6FvNiggA==", "XhzOW");
        CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[2]] = lIllIlllIIIllll("KHO36REAmThvaxJnwku3m+K+2LSjKmQbJZelfrOms9Y=", "dpwwQ");
        CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[1]] = lIllIlllIIIllll("m12bS+PFCXywfAlrttYPhxQCvJB6lzcsItUgAQRJ2/o=", "JEnXx");
        CommandPlaySound.lIIIIIllIlIlll[CommandPlaySound.lIIIIIllIllllI[3]] = lIllIlllIIIlllI("j+Pif0NkQhPz1n0oltzBpqwr6yKuLH367Dcjrhq+Dr8=", "GLXEH");
    }
    
    private static void lIllIlllIlIIlll() {
        (lIIIIIllIllllI = new int[7])[0] = ((0x11 ^ 0x17) & ~(0x4C ^ 0x4A));
        CommandPlaySound.lIIIIIllIllllI[1] = "  ".length();
        CommandPlaySound.lIIIIIllIllllI[2] = " ".length();
        CommandPlaySound.lIIIIIllIllllI[3] = "   ".length();
        CommandPlaySound.lIIIIIllIllllI[4] = (0x29 ^ 0x55 ^ (0x79 ^ 0x0));
        CommandPlaySound.lIIIIIllIllllI[5] = (0x68 ^ 0x6C);
        CommandPlaySound.lIIIIIllIllllI[6] = (0xC9 ^ 0xC1);
    }
    
    private static boolean lIllIlllIlIllIl(final int lllllllllllllIlIIllIllIlIlIIIIIl) {
        return lllllllllllllIlIIllIllIlIlIIIIIl <= 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandPlaySound.lIIIIIllIllllI[1];
    }
    
    private static int lIllIlllIlIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
