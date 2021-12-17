// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandSetSpawnpoint extends CommandBase
{
    private static final /* synthetic */ String[] lIIIllllIIIllI;
    private static final /* synthetic */ int[] lIIIllllIIlIII;
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIllllIlIIIlllIIllI, final int lllllllllllllIIllllIlIIIlllIIlIl) {
        if (llIIIllllIllIlI(lllllllllllllIIllllIlIIIlllIIlIl)) {
            return CommandSetSpawnpoint.lIIIllllIIlIII[2] != 0;
        }
        return CommandSetSpawnpoint.lIIIllllIIlIII[0] != 0;
    }
    
    private static String llIIIllllIIIlll(final String lllllllllllllIIllllIlIIIlIllIlll, final String lllllllllllllIIllllIlIIIlIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), CommandSetSpawnpoint.lIIIllllIIlIII[5]), "DES");
            final Cipher lllllllllllllIIllllIlIIIlIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIllllIlIIIlIlllIIl.init(CommandSetSpawnpoint.lIIIllllIIlIII[1], lllllllllllllIIllllIlIIIlIlllIlI);
            return new String(lllllllllllllIIllllIlIIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIIIlIlllIII) {
            lllllllllllllIIllllIlIIIlIlllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllllIlIIIlllllIIl, final String[] lllllllllllllIIllllIlIIIlllllIII) throws CommandException {
        if (llIIIllllIlIlII(lllllllllllllIIllllIlIIIlllllIII.length, CommandSetSpawnpoint.lIIIllllIIlIII[2]) && llIIIllllIlIlIl(lllllllllllllIIllllIlIIIlllllIII.length, CommandSetSpawnpoint.lIIIllllIIlIII[3])) {
            throw new WrongUsageException(CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[1]], new Object[CommandSetSpawnpoint.lIIIllllIIlIII[0]]);
        }
        EntityPlayerMP entityPlayerMP;
        if (llIIIllllIlIllI(lllllllllllllIIllllIlIIIlllllIII.length)) {
            entityPlayerMP = CommandBase.getPlayer(lllllllllllllIIllllIlIIIlllllIIl, lllllllllllllIIllllIlIIIlllllIII[CommandSetSpawnpoint.lIIIllllIIlIII[0]]);
            "".length();
            if ((0x7A ^ 0x7E) <= 0) {
                return;
            }
        }
        else {
            entityPlayerMP = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIllllIlIIIlllllIIl);
        }
        final EntityPlayerMP lllllllllllllIIllllIlIIIllllIlll = entityPlayerMP;
        BlockPos blockPos;
        if (llIIIllllIlIlII(lllllllllllllIIllllIlIIIlllllIII.length, CommandSetSpawnpoint.lIIIllllIIlIII[4])) {
            blockPos = CommandBase.parseBlockPos(lllllllllllllIIllllIlIIIlllllIIl, lllllllllllllIIllllIlIIIlllllIII, CommandSetSpawnpoint.lIIIllllIIlIII[2], (boolean)(CommandSetSpawnpoint.lIIIllllIIlIII[2] != 0));
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            blockPos = lllllllllllllIIllllIlIIIllllIlll.getPosition();
        }
        final BlockPos lllllllllllllIIllllIlIIIllllIllI = blockPos;
        if (llIIIllllIlIlll(lllllllllllllIIllllIlIIIllllIlll.worldObj)) {
            lllllllllllllIIllllIlIIIllllIlll.setSpawnPoint(lllllllllllllIIllllIlIIIllllIllI, (boolean)(CommandSetSpawnpoint.lIIIllllIIlIII[2] != 0));
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[4]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandSetSpawnpoint.lIIIllllIIlIII[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetSpawnpoint.lIIIllllIIlIII[0]] = lllllllllllllIIllllIlIIIllllIlll.getName();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetSpawnpoint.lIIIllllIIlIII[2]] = lllllllllllllIIllllIlIIIllllIllI.getX();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetSpawnpoint.lIIIllllIIlIII[1]] = lllllllllllllIIllllIlIIIllllIllI.getY();
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandSetSpawnpoint.lIIIllllIIlIII[4]] = lllllllllllllIIllllIlIIIllllIllI.getZ();
            CommandBase.notifyOperators(lllllllllllllIIllllIlIIIlllllIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    private static boolean llIIIllllIllIlI(final int lllllllllllllIIllllIlIIIlIIllllI) {
        return lllllllllllllIIllllIlIIIlIIllllI == 0;
    }
    
    private static boolean llIIIllllIlIlII(final int lllllllllllllIIllllIlIIIlIlIIIll, final int lllllllllllllIIllllIlIIIlIlIIIlI) {
        return lllllllllllllIIllllIlIIIlIlIIIll > lllllllllllllIIllllIlIIIlIlIIIlI;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllllIlIIIlllIllIl, final String[] lllllllllllllIIllllIlIIIlllIlIlI, final BlockPos lllllllllllllIIllllIlIIIlllIlIIl) {
        List<String> list;
        if (llIIIllllIllIII(lllllllllllllIIllllIlIIIlllIlIlI.length, CommandSetSpawnpoint.lIIIllllIIlIII[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllllIlIIIlllIlIlI, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else if (llIIIllllIlIlII(lllllllllllllIIllllIlIIIlllIlIlI.length, CommandSetSpawnpoint.lIIIllllIIlIII[2]) && llIIIllllIllIIl(lllllllllllllIIllllIlIIIlllIlIlI.length, CommandSetSpawnpoint.lIIIllllIIlIII[3])) {
            list = CommandBase.func_175771_a(lllllllllllllIIllllIlIIIlllIlIlI, CommandSetSpawnpoint.lIIIllllIIlIII[2], lllllllllllllIIllllIlIIIlllIlIIl);
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean llIIIllllIlIlIl(final int lllllllllllllIIllllIlIIIlIlIlIll, final int lllllllllllllIIllllIlIIIlIlIlIlI) {
        return lllllllllllllIIllllIlIIIlIlIlIll < lllllllllllllIIllllIlIIIlIlIlIlI;
    }
    
    private static String llIIIllllIIlIIl(final String lllllllllllllIIllllIlIIIllIIIlII, final String lllllllllllllIIllllIlIIIllIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIIIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlIIIllIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlIIIllIIIllI.init(CommandSetSpawnpoint.lIIIllllIIlIII[1], lllllllllllllIIllllIlIIIllIIIlll);
            return new String(lllllllllllllIIllllIlIIIllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIIIllIIIlIl) {
            lllllllllllllIIllllIlIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIllllIlIllI(final int lllllllllllllIIllllIlIIIlIIlllII) {
        return lllllllllllllIIllllIlIIIlIIlllII > 0;
    }
    
    private static boolean llIIIllllIlIlll(final Object lllllllllllllIIllllIlIIIlIlIIIII) {
        return lllllllllllllIIllllIlIIIlIlIIIII != null;
    }
    
    static {
        llIIIllllIlIIll();
        llIIIllllIIlIlI();
    }
    
    private static void llIIIllllIIlIlI() {
        (lIIIllllIIIllI = new String[CommandSetSpawnpoint.lIIIllllIIlIII[3]])[CommandSetSpawnpoint.lIIIllllIIlIII[0]] = llIIIllllIIIlll("Ap8V5zzUIplhjvBxFnFdbQ==", "ekfhK");
        CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[2]] = llIIIllllIIlIII("DAAhAw4BCz9AHB8OOwAfAAYiGkEaHC0JCg==", "ooLno");
        CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[1]] = llIIIllllIIlIIl("YPgfN/xhRwgEENf2h46MifsVi933StLyRS0QB+WmE/E=", "ARxuW");
        CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[4]] = llIIIllllIIIlll("tI0UTOo2B8wXDhpoBMxzGabc2973NNAMXEZVTjsPXR8=", "eXXzi");
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllllIlIIlIIIIIIII) {
        return CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[2]];
    }
    
    private static boolean llIIIllllIllIII(final int lllllllllllllIIllllIlIIIlIlIllll, final int lllllllllllllIIllllIlIIIlIlIlllI) {
        return lllllllllllllIIllllIlIIIlIlIllll == lllllllllllllIIllllIlIIIlIlIlllI;
    }
    
    private static void llIIIllllIlIIll() {
        (lIIIllllIIlIII = new int[6])[0] = ((0xAD ^ 0xB0) & ~(0x10 ^ 0xD));
        CommandSetSpawnpoint.lIIIllllIIlIII[1] = "  ".length();
        CommandSetSpawnpoint.lIIIllllIIlIII[2] = " ".length();
        CommandSetSpawnpoint.lIIIllllIIlIII[3] = (0xB7 ^ 0xB3);
        CommandSetSpawnpoint.lIIIllllIIlIII[4] = "   ".length();
        CommandSetSpawnpoint.lIIIllllIIlIII[5] = (61 + 109 - 48 + 16 ^ 129 + 115 - 125 + 11);
    }
    
    private static String llIIIllllIIlIII(String lllllllllllllIIllllIlIIIllIlIlII, final String lllllllllllllIIllllIlIIIllIlIIll) {
        lllllllllllllIIllllIlIIIllIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIIllllIlIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlIIIllIlIlll = new StringBuilder();
        final char[] lllllllllllllIIllllIlIIIllIlIllI = lllllllllllllIIllllIlIIIllIlIIll.toCharArray();
        int lllllllllllllIIllllIlIIIllIlIlIl = CommandSetSpawnpoint.lIIIllllIIlIII[0];
        final boolean lllllllllllllIIllllIlIIIllIIllll = (Object)lllllllllllllIIllllIlIIIllIlIlII.toCharArray();
        final int lllllllllllllIIllllIlIIIllIIlllI = lllllllllllllIIllllIlIIIllIIllll.length;
        char lllllllllllllIIllllIlIIIllIIllIl = (char)CommandSetSpawnpoint.lIIIllllIIlIII[0];
        while (llIIIllllIlIlIl(lllllllllllllIIllllIlIIIllIIllIl, lllllllllllllIIllllIlIIIllIIlllI)) {
            final char lllllllllllllIIllllIlIIIllIllIlI = lllllllllllllIIllllIlIIIllIIllll[lllllllllllllIIllllIlIIIllIIllIl];
            lllllllllllllIIllllIlIIIllIlIlll.append((char)(lllllllllllllIIllllIlIIIllIllIlI ^ lllllllllllllIIllllIlIIIllIlIllI[lllllllllllllIIllllIlIIIllIlIlIl % lllllllllllllIIllllIlIIIllIlIllI.length]));
            "".length();
            ++lllllllllllllIIllllIlIIIllIlIlIl;
            ++lllllllllllllIIllllIlIIIllIIllIl;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlIIIllIlIlll);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSetSpawnpoint.lIIIllllIIlIII[1];
    }
    
    @Override
    public String getCommandName() {
        return CommandSetSpawnpoint.lIIIllllIIIllI[CommandSetSpawnpoint.lIIIllllIIlIII[0]];
    }
    
    private static boolean llIIIllllIllIIl(final int lllllllllllllIIllllIlIIIlIlIIlll, final int lllllllllllllIIllllIlIIIlIlIIllI) {
        return lllllllllllllIIllllIlIIIlIlIIlll <= lllllllllllllIIllllIlIIIlIlIIllI;
    }
}
