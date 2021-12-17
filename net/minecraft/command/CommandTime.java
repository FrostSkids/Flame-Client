// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.world.WorldServer;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandTime extends CommandBase
{
    private static final /* synthetic */ String[] lIlIlIllIIIIIl;
    private static final /* synthetic */ int[] lIlIlIllIIllII;
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIlIIIIIIIIllIllll) {
        return CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[2]];
    }
    
    private static boolean lllIllllIIIlIII(final int lllllllllllllIIIlIIIIIIIIIIlIIII, final int lllllllllllllIIIlIIIIIIIIIIIllll) {
        return lllllllllllllIIIlIIIIIIIIIIlIIII == lllllllllllllIIIlIIIIIIIIIIIllll;
    }
    
    private static String lllIlllIllIlIll(final String lllllllllllllIIIlIIIIIIIIIlIIlIl, final String lllllllllllllIIIlIIIIIIIIIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), CommandTime.lIlIlIllIIllII[10]), "DES");
            final Cipher lllllllllllllIIIlIIIIIIIIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIIIIIlIIlll.init(CommandTime.lIlIlIllIIllII[1], lllllllllllllIIIlIIIIIIIIIlIlIII);
            return new String(lllllllllllllIIIlIIIIIIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIIIIlIIllI) {
            lllllllllllllIIIlIIIIIIIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTime.lIlIlIllIIllII[1];
    }
    
    private static boolean lllIllllIIIIllI(final int lllllllllllllIIIlIIIIIIIIIIIIIIl) {
        return lllllllllllllIIIlIIIIIIIIIIIIIIl != 0;
    }
    
    @Override
    public String getCommandName() {
        return CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[0]];
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIlIIIIIIIIlIllIll, final String[] lllllllllllllIIIlIIIIIIIIlIllIII, final BlockPos lllllllllllllIIIlIIIIIIIIlIllIIl) {
        List<String> list;
        if (lllIllllIIIlIII(lllllllllllllIIIlIIIIIIIIlIllIII.length, CommandTime.lIlIlIllIIllII[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandTime.lIlIlIllIIllII[3]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandTime.lIlIlIllIIllII[0]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[16]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandTime.lIlIlIllIIllII[2]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[17]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandTime.lIlIlIllIIllII[1]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[18]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIIIIIIIIlIllIII, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else if (lllIllllIIIlIII(lllllllllllllIIIlIIIIIIIIlIllIII.length, CommandTime.lIlIlIllIIllII[1]) && lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIllIII[CommandTime.lIlIlIllIIllII[0]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[19]]) ? 1 : 0)) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII2 = new String[CommandTime.lIlIlIllIIllII[1]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandTime.lIlIlIllIIllII[0]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[20]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandTime.lIlIlIllIIllII[2]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[21]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIIIIIIIIlIllIII, lllllllllllllIIIIlIlllIIIllIllII2);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lllIllllIIIlIII(lllllllllllllIIIlIIIIIIIIlIllIII.length, CommandTime.lIlIlIllIIllII[1]) && lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIllIII[CommandTime.lIlIlIllIIllII[0]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[22]]) ? 1 : 0)) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII3 = new String[CommandTime.lIlIlIllIIllII[1]];
            lllllllllllllIIIIlIlllIIIllIllII3[CommandTime.lIlIlIllIIllII[0]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[23]];
            lllllllllllllIIIIlIlllIIIllIllII3[CommandTime.lIlIlIllIIllII[2]] = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[24]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlIIIIIIIIlIllIII, lllllllllllllIIIIlIlllIIIllIllII3);
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static String lllIlllIllIllIl(String lllllllllllllIIIlIIIIIIIIIlllIlI, final String lllllllllllllIIIlIIIIIIIIIllIlII) {
        lllllllllllllIIIlIIIIIIIIIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIIIIIIlllIII = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIIIIIIllIlll = lllllllllllllIIIlIIIIIIIIIllIlII.toCharArray();
        int lllllllllllllIIIlIIIIIIIIIllIllI = CommandTime.lIlIlIllIIllII[0];
        final float lllllllllllllIIIlIIIIIIIIIllIIII = (Object)lllllllllllllIIIlIIIIIIIIIlllIlI.toCharArray();
        final byte lllllllllllllIIIlIIIIIIIIIlIllll = (byte)lllllllllllllIIIlIIIIIIIIIllIIII.length;
        String lllllllllllllIIIlIIIIIIIIIlIlllI = (String)CommandTime.lIlIlIllIIllII[0];
        while (lllIllllIIIlIlI((int)lllllllllllllIIIlIIIIIIIIIlIlllI, lllllllllllllIIIlIIIIIIIIIlIllll)) {
            final char lllllllllllllIIIlIIIIIIIIIlllIll = lllllllllllllIIIlIIIIIIIIIllIIII[lllllllllllllIIIlIIIIIIIIIlIlllI];
            lllllllllllllIIIlIIIIIIIIIlllIII.append((char)(lllllllllllllIIIlIIIIIIIIIlllIll ^ lllllllllllllIIIlIIIIIIIIIllIlll[lllllllllllllIIIlIIIIIIIIIllIllI % lllllllllllllIIIlIIIIIIIIIllIlll.length]));
            "".length();
            ++lllllllllllllIIIlIIIIIIIIIllIllI;
            ++lllllllllllllIIIlIIIIIIIIIlIlllI;
            "".length();
            if ((0x24 ^ 0x53 ^ (0x76 ^ 0x5)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIIIIIIlllIII);
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIlIIIIIIIIllIIIII, final String[] lllllllllllllIIIlIIIIIIIIlIlllll) throws CommandException {
        if (lllIllllIIIIlIl(lllllllllllllIIIlIIIIIIIIlIlllll.length, CommandTime.lIlIlIllIIllII[2])) {
            if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[0]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[1]]) ? 1 : 0)) {
                int lllllllllllllIIIlIIIIIIIIllIIlIl = 0;
                if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[3]]) ? 1 : 0)) {
                    final int lllllllllllllIIIlIIIIIIIIllIIlll = CommandTime.lIlIlIllIIllII[4];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[5]]) ? 1 : 0)) {
                    final int lllllllllllllIIIlIIIIIIIIllIIllI = CommandTime.lIlIlIllIIllII[6];
                    "".length();
                    if (-(0xA4 ^ 0xA0) >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIIIIIIIllIIlIl = CommandBase.parseInt(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]], CommandTime.lIlIlIllIIllII[0]);
                }
                this.setTime(lllllllllllllIIIlIIIIIIIIllIIIII, lllllllllllllIIIlIIIIIIIIllIIlIl);
                final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[7]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandTime.lIlIlIllIIllII[2]];
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandTime.lIlIlIllIIllII[0]] = lllllllllllllIIIlIIIIIIIIllIIlIl;
                CommandBase.notifyOperators(lllllllllllllIIIlIIIIIIIIllIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
                return;
            }
            if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[0]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[8]]) ? 1 : 0)) {
                final int lllllllllllllIIIlIIIIIIIIllIIlII = CommandBase.parseInt(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]], CommandTime.lIlIlIllIIllII[0]);
                this.addTime(lllllllllllllIIIlIIIIIIIIllIIIII, lllllllllllllIIIlIIIIIIIIllIIlII);
                final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[9]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandTime.lIlIlIllIIllII[2]];
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandTime.lIlIlIllIIllII[0]] = lllllllllllllIIIlIIIIIIIIllIIlII;
                CommandBase.notifyOperators(lllllllllllllIIIlIIIIIIIIllIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
                return;
            }
            if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[0]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[10]]) ? 1 : 0)) {
                if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[11]]) ? 1 : 0)) {
                    final int lllllllllllllIIIlIIIIIIIIllIIIll = (int)(lllllllllllllIIIlIIIIIIIIllIIIII.getEntityWorld().getWorldTime() % 2147483647L);
                    lllllllllllllIIIlIIIIIIIIllIIIII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIIlIIIIIIIIllIIIll);
                    final String lllllllllllllIIIIlIlllIIIlIIIlII3 = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[12]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll3 = new Object[CommandTime.lIlIlIllIIllII[2]];
                    lllllllllllllIIIIlIlllIIIlIIIlll3[CommandTime.lIlIlIllIIllII[0]] = lllllllllllllIIIlIIIIIIIIllIIIll;
                    CommandBase.notifyOperators(lllllllllllllIIIlIIIIIIIIllIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII3, lllllllllllllIIIIlIlllIIIlIIIlll3);
                    return;
                }
                if (lllIllllIIIIllI(lllllllllllllIIIlIIIIIIIIlIlllll[CommandTime.lIlIlIllIIllII[2]].equals(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[13]]) ? 1 : 0)) {
                    final int lllllllllllllIIIlIIIIIIIIllIIIlI = (int)(lllllllllllllIIIlIIIIIIIIllIIIII.getEntityWorld().getTotalWorldTime() % 2147483647L);
                    lllllllllllllIIIlIIIIIIIIllIIIII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIIlIIIIIIIIllIIIlI);
                    final String lllllllllllllIIIIlIlllIIIlIIIlII4 = CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[14]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll4 = new Object[CommandTime.lIlIlIllIIllII[2]];
                    lllllllllllllIIIIlIlllIIIlIIIlll4[CommandTime.lIlIlIllIIllII[0]] = lllllllllllllIIIlIIIIIIIIllIIIlI;
                    CommandBase.notifyOperators(lllllllllllllIIIlIIIIIIIIllIIIII, this, lllllllllllllIIIIlIlllIIIlIIIlII4, lllllllllllllIIIIlIlllIIIlIIIlll4);
                    return;
                }
            }
        }
        throw new WrongUsageException(CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[15]], new Object[CommandTime.lIlIlIllIIllII[0]]);
    }
    
    private static boolean lllIllllIIIlIlI(final int lllllllllllllIIIlIIIIIIIIIIIlIII, final int lllllllllllllIIIlIIIIIIIIIIIIlll) {
        return lllllllllllllIIIlIIIIIIIIIIIlIII < lllllllllllllIIIlIIIIIIIIIIIIlll;
    }
    
    private static boolean lllIllllIIIlIIl(final int lllllllllllllIIIlIIIIIIIIIIIllII, final int lllllllllllllIIIlIIIIIIIIIIIlIll) {
        return lllllllllllllIIIlIIIIIIIIIIIllII >= lllllllllllllIIIlIIIIIIIIIIIlIll;
    }
    
    protected void addTime(final ICommandSender lllllllllllllIIIlIIIIIIIIlIIlIll, final int lllllllllllllIIIlIIIIIIIIlIIlIlI) {
        int lllllllllllllIIIlIIIIIIIIlIIlIIl = CommandTime.lIlIlIllIIllII[0];
        "".length();
        if (((0x13 ^ 0x4A) & ~(0xF4 ^ 0xAD)) >= "  ".length()) {
            return;
        }
        while (!lllIllllIIIlIIl(lllllllllllllIIIlIIIIIIIIlIIlIIl, MinecraftServer.getServer().worldServers.length)) {
            final WorldServer lllllllllllllIIIlIIIIIIIIlIIlIII = MinecraftServer.getServer().worldServers[lllllllllllllIIIlIIIIIIIIlIIlIIl];
            lllllllllllllIIIlIIIIIIIIlIIlIII.setWorldTime(lllllllllllllIIIlIIIIIIIIlIIlIII.getWorldTime() + lllllllllllllIIIlIIIIIIIIlIIlIlI);
            ++lllllllllllllIIIlIIIIIIIIlIIlIIl;
        }
    }
    
    private static String lllIlllIllIlllI(final String lllllllllllllIIIlIIIIIIIIIIllIII, final String lllllllllllllIIIlIIIIIIIIIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIIIIIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIIIIIIIllIlI.init(CommandTime.lIlIlIllIIllII[1], lllllllllllllIIIlIIIIIIIIIIllIll);
            return new String(lllllllllllllIIIlIIIIIIIIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIIIIIllIIl) {
            lllllllllllllIIIlIIIIIIIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllllIIIIlII() {
        (lIlIlIllIIllII = new int[26])[0] = ((0x9 ^ 0x49 ^ (0xCD ^ 0xC4)) & (0x70 ^ 0x31 ^ (0x16 ^ 0x1E) ^ -" ".length()));
        CommandTime.lIlIlIllIIllII[1] = "  ".length();
        CommandTime.lIlIlIllIIllII[2] = " ".length();
        CommandTime.lIlIlIllIIllII[3] = "   ".length();
        CommandTime.lIlIlIllIIllII[4] = (0xFFFFAFFF & 0x53E8);
        CommandTime.lIlIlIllIIllII[5] = (0x48 ^ 0x31 ^ (0x37 ^ 0x4A));
        CommandTime.lIlIlIllIIllII[6] = (-(0xFFFFDFFB & 0x2435) & (0xFFFFF6FE & 0x3FF9));
        CommandTime.lIlIlIllIIllII[7] = (0xAB ^ 0x8B ^ (0xA9 ^ 0x8C));
        CommandTime.lIlIlIllIIllII[8] = (26 + 109 - 98 + 91 ^ 124 + 48 - 69 + 31);
        CommandTime.lIlIlIllIIllII[9] = (0x5D ^ 0x56 ^ (0xA5 ^ 0xA9));
        CommandTime.lIlIlIllIIllII[10] = (0x20 ^ 0x28);
        CommandTime.lIlIlIllIIllII[11] = (0x77 ^ 0x73 ^ (0x2 ^ 0xF));
        CommandTime.lIlIlIllIIllII[12] = (0x1E ^ 0x14);
        CommandTime.lIlIlIllIIllII[13] = (0x97 ^ 0x9C);
        CommandTime.lIlIlIllIIllII[14] = (0x42 ^ 0x4E);
        CommandTime.lIlIlIllIIllII[15] = (0x72 ^ 0x7F);
        CommandTime.lIlIlIllIIllII[16] = (0x83 ^ 0x8D);
        CommandTime.lIlIlIllIIllII[17] = (0x7A ^ 0x75);
        CommandTime.lIlIlIllIIllII[18] = (93 + 24 - 49 + 88 ^ 89 + 115 - 93 + 29);
        CommandTime.lIlIlIllIIllII[19] = (0x1C ^ 0xD);
        CommandTime.lIlIlIllIIllII[20] = (0xC9 ^ 0xAB ^ (0xED ^ 0x9D));
        CommandTime.lIlIlIllIIllII[21] = (0x6B ^ 0x2F ^ (0x97 ^ 0xC0));
        CommandTime.lIlIlIllIIllII[22] = (0xA4 ^ 0xB0);
        CommandTime.lIlIlIllIIllII[23] = (29 + 7 + 72 + 61 ^ 43 + 58 + 18 + 69);
        CommandTime.lIlIlIllIIllII[24] = (0xE8 ^ 0x81 ^ 98 + 48 - 49 + 30);
        CommandTime.lIlIlIllIIllII[25] = (0x93 ^ 0x84);
    }
    
    private static boolean lllIllllIIIIlIl(final int lllllllllllllIIIlIIIIIIIIIIIIlII, final int lllllllllllllIIIlIIIIIIIIIIIIIll) {
        return lllllllllllllIIIlIIIIIIIIIIIIlII > lllllllllllllIIIlIIIIIIIIIIIIIll;
    }
    
    static {
        lllIllllIIIIlII();
        lllIlllIllllIll();
    }
    
    protected void setTime(final ICommandSender lllllllllllllIIIlIIIIIIIIlIlIlII, final int lllllllllllllIIIlIIIIIIIIlIlIIIl) {
        int lllllllllllllIIIlIIIIIIIIlIlIIlI = CommandTime.lIlIlIllIIllII[0];
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lllIllllIIIlIIl(lllllllllllllIIIlIIIIIIIIlIlIIlI, MinecraftServer.getServer().worldServers.length)) {
            MinecraftServer.getServer().worldServers[lllllllllllllIIIlIIIIIIIIlIlIIlI].setWorldTime(lllllllllllllIIIlIIIIIIIIlIlIIIl);
            ++lllllllllllllIIIlIIIIIIIIlIlIIlI;
        }
    }
    
    private static void lllIlllIllllIll() {
        (lIlIlIllIIIIIl = new String[CommandTime.lIlIlIllIIllII[25]])[CommandTime.lIlIlIllIIllII[0]] = lllIlllIllIlIll("xdDsOkDk4OQ=", "XXebx");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[2]] = lllIlllIllIllIl("Oh0PFBk3FhFXDDAfB1cNKhMFHA==", "Yrbyx");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[1]] = lllIlllIllIlllI("8/k8zHjL8so=", "FVKSp");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[3]] = lllIlllIllIllIl("CxI2", "osOeR");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[5]] = lllIlllIllIlllI("mj4kTR3sB3E=", "VSihz");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[7]] = lllIlllIllIllIl("EgQVKwwfDwtoGRgGHWgeFB8=", "qkxFm");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[8]] = lllIlllIllIlIll("qxo1wZW8Oi8=", "abamm");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[9]] = lllIlllIllIlIll("YOsbfhBug6bVMkuIa0hnfRnIKyRXYQID", "PygBa");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[10]] = lllIlllIllIlIll("9bRkeUOQDaQ=", "YeJaO");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[11]] = lllIlllIllIlllI("fd2H0Ugjwow=", "Jcifj");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[12]] = lllIlllIllIlIll("AJrHVkvSN0HSQ91KsLAUqsj2Z8q+ho6t", "jZMCT");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[13]] = lllIlllIllIlIll("Bc/W/+hwExdmptpZZSziNQ==", "vnSzg");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[14]] = lllIlllIllIlIll("q8FgRyTqrNq+VTXGDCRJSjfJpwRxdFLR", "xBmgW");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[15]] = lllIlllIllIllIl("ATkjOCsMMj17Pgs7K3s/ETcpMA==", "bVNUJ");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[16]] = lllIlllIllIlllI("x0wqofAYQBI=", "vsgex");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[17]] = lllIlllIllIllIl("MD0x", "QYUcc");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[18]] = lllIlllIllIlIll("FRxDTYYOeVc=", "XRIqK");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[19]] = lllIlllIllIllIl("GDEc", "kThBc");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[20]] = lllIlllIllIllIl("LS8M", "INuDX");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[21]] = lllIlllIllIllIl("Jy4JHgA=", "IGnvt");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[22]] = lllIlllIllIlIll("e5FlILdMRok=", "uYaMQ");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[23]] = lllIlllIllIlIll("NroYhn6BSY4=", "bwsoV");
        CommandTime.lIlIlIllIIIIIl[CommandTime.lIlIlIllIIllII[24]] = lllIlllIllIlIll("sdodyVUC+xYJ8yVzzBQh3g==", "elWFO");
    }
}
