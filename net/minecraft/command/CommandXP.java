// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandXP extends CommandBase
{
    private static final /* synthetic */ String[] lIlIIIllllIlIl;
    private static final /* synthetic */ int[] lIlIIIlllllIII;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandXP.lIlIIIlllllIII[1];
    }
    
    private static boolean lllIIlIIIlIlIlI(final int lllllllllllllIIIlllIllIlIIIlllII) {
        return lllllllllllllIIIlllIllIlIIIlllII < 0;
    }
    
    private static void lllIIlIIIlIIlIl() {
        (lIlIIIlllllIII = new int[11])[0] = ((206 + 219 - 306 + 103 ^ 106 + 56 - 152 + 145) & (0x1E ^ 0x29 ^ (0xF3 ^ 0x81) ^ -" ".length()));
        CommandXP.lIlIIIlllllIII[1] = "  ".length();
        CommandXP.lIlIIIlllllIII[2] = " ".length();
        CommandXP.lIlIIIlllllIII[3] = "   ".length();
        CommandXP.lIlIIIlllllIII[4] = (0x64 ^ 0x60);
        CommandXP.lIlIIIlllllIII[5] = -" ".length();
        CommandXP.lIlIIIlllllIII[6] = (0x94 ^ 0x91);
        CommandXP.lIlIIIlllllIII[7] = (0xE7 ^ 0xBB ^ (0x63 ^ 0x39));
        CommandXP.lIlIIIlllllIII[8] = (0xB2 ^ 0xC6 ^ (0x7B ^ 0x8));
        CommandXP.lIlIIIlllllIII[9] = (51 + 156 - 196 + 166 ^ 73 + 171 - 234 + 175);
        CommandXP.lIlIIIlllllIII[10] = (57 + 53 - 35 + 67 ^ 18 + 105 - 27 + 39);
    }
    
    static {
        lllIIlIIIlIIlIl();
        lllIIlIIIlIIIll();
    }
    
    @Override
    public String getCommandName() {
        return CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[0]];
    }
    
    private static boolean lllIIlIIIlIlIII(final int lllllllllllllIIIlllIllIlIIlIIIII) {
        return lllllllllllllIIIlllIllIlIIlIIIII != 0;
    }
    
    private static boolean lllIIlIIIlIllII(final int lllllllllllllIIIlllIllIlIIlIlIll, final int lllllllllllllIIIlllIllIlIIlIlIlI) {
        return lllllllllllllIIIlllIllIlIIlIlIll == lllllllllllllIIIlllIllIlIIlIlIlI;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIIlllIllIllIIIIllI) {
        return CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[2]];
    }
    
    private static String lllIIlIIIlIIIlI(final String lllllllllllllIIIlllIllIlIIlllllI, final String lllllllllllllIIIlllIllIlIIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIlIIllllIl.getBytes(StandardCharsets.UTF_8)), CommandXP.lIlIIIlllllIII[9]), "DES");
            final Cipher lllllllllllllIIIlllIllIlIlIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllIlIlIIIIlI.init(CommandXP.lIlIIIlllllIII[1], lllllllllllllIIIlllIllIlIlIIIIll);
            return new String(lllllllllllllIIIlllIllIlIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIlIlIIIIIl) {
            lllllllllllllIIIlllIllIlIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlIIIlIllIl(final int lllllllllllllIIIlllIllIlIIlIIlll, final int lllllllllllllIIIlllIllIlIIlIIllI) {
        return lllllllllllllIIIlllIllIlIIlIIlll < lllllllllllllIIIlllIllIlIIlIIllI;
    }
    
    protected String[] getAllUsernames() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static boolean lllIIlIIIlIlIIl(final int lllllllllllllIIIlllIllIlIIlIIIll, final int lllllllllllllIIIlllIllIlIIlIIIlI) {
        return lllllllllllllIIIlllIllIlIIlIIIll > lllllllllllllIIIlllIllIlIIlIIIlI;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIlllIllIlIllIlIlI, final String[] lllllllllllllIIIlllIllIlIllIIllI, final BlockPos lllllllllllllIIIlllIllIlIllIlIII) {
        List<String> listOfStringsMatchingLastWord;
        if (lllIIlIIIlIllII(lllllllllllllIIIlllIllIlIllIIllI.length, CommandXP.lIlIIIlllllIII[1])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIIlllIllIlIllIIllI, this.getAllUsernames());
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static boolean lllIIlIIIlIIllI(final int lllllllllllllIIIlllIllIlIIIllIlI) {
        return lllllllllllllIIIlllIllIlIIIllIlI <= 0;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIIlllIllIlIllIIIlI, final int lllllllllllllIIIlllIllIlIllIIIII) {
        if (lllIIlIIIlIllII(lllllllllllllIIIlllIllIlIllIIIII, CommandXP.lIlIIIlllllIII[2])) {
            return CommandXP.lIlIIIlllllIII[2] != 0;
        }
        return CommandXP.lIlIIIlllllIII[0] != 0;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIIlllIllIlIlllllII, final String[] lllllllllllllIIIlllIllIlIlllIIll) throws CommandException {
        if (lllIIlIIIlIIllI(lllllllllllllIIIlllIllIlIlllIIll.length)) {
            throw new WrongUsageException(CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[1]], new Object[CommandXP.lIlIIIlllllIII[0]]);
        }
        String lllllllllllllIIIlllIllIlIllllIlI = lllllllllllllIIIlllIllIlIlllIIll[CommandXP.lIlIIIlllllIII[0]];
        int n;
        if (lllIIlIIIlIIlll(lllllllllllllIIIlllIllIlIllllIlI.endsWith(CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[3]]) ? 1 : 0) && lllIIlIIIlIIlll(lllllllllllllIIIlllIllIlIllllIlI.endsWith(CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[4]]) ? 1 : 0)) {
            n = CommandXP.lIlIIIlllllIII[0];
            "".length();
            if ((57 + 24 + 32 + 63 ^ 22 + 60 + 17 + 81) < 0) {
                return;
            }
        }
        else {
            n = CommandXP.lIlIIIlllllIII[2];
        }
        final boolean lllllllllllllIIIlllIllIlIllllIIl = n != 0;
        if (lllIIlIIIlIlIII(lllllllllllllIIIlllIllIlIllllIIl ? 1 : 0) && lllIIlIIIlIlIIl(lllllllllllllIIIlllIllIlIllllIlI.length(), CommandXP.lIlIIIlllllIII[2])) {
            lllllllllllllIIIlllIllIlIllllIlI = lllllllllllllIIIlllIllIlIllllIlI.substring(CommandXP.lIlIIIlllllIII[0], lllllllllllllIIIlllIllIlIllllIlI.length() - CommandXP.lIlIIIlllllIII[2]);
        }
        int lllllllllllllIIIlllIllIlIllllIII = CommandBase.parseInt(lllllllllllllIIIlllIllIlIllllIlI);
        int n2;
        if (lllIIlIIIlIlIlI(lllllllllllllIIIlllIllIlIllllIII)) {
            n2 = CommandXP.lIlIIIlllllIII[2];
            "".length();
            if (-(0x2A ^ 0x2E) > 0) {
                return;
            }
        }
        else {
            n2 = CommandXP.lIlIIIlllllIII[0];
        }
        final boolean lllllllllllllIIIlllIllIlIlllIlll = n2 != 0;
        if (lllIIlIIIlIlIII(lllllllllllllIIIlllIllIlIlllIlll ? 1 : 0)) {
            lllllllllllllIIIlllIllIlIllllIII *= CommandXP.lIlIIIlllllIII[5];
        }
        EntityPlayer entityPlayer;
        if (lllIIlIIIlIlIIl(lllllllllllllIIIlllIllIlIlllIIll.length, CommandXP.lIlIIIlllllIII[2])) {
            entityPlayer = CommandBase.getPlayer(lllllllllllllIIIlllIllIlIlllllII, lllllllllllllIIIlllIllIlIlllIIll[CommandXP.lIlIIIlllllIII[2]]);
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
        }
        else {
            entityPlayer = CommandBase.getCommandSenderAsPlayer(lllllllllllllIIIlllIllIlIlllllII);
        }
        final EntityPlayer lllllllllllllIIIlllIllIlIlllIllI = entityPlayer;
        if (lllIIlIIIlIlIII(lllllllllllllIIIlllIllIlIllllIIl ? 1 : 0)) {
            lllllllllllllIIIlllIllIlIlllllII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIIlllIllIlIlllIllI.experienceLevel);
            if (lllIIlIIIlIlIII(lllllllllllllIIIlllIllIlIlllIlll ? 1 : 0)) {
                lllllllllllllIIIlllIllIlIlllIllI.addExperienceLevel(-lllllllllllllIIIlllIllIlIllllIII);
                final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[6]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandXP.lIlIIIlllllIII[1]];
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandXP.lIlIIIlllllIII[0]] = lllllllllllllIIIlllIllIlIllllIII;
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandXP.lIlIIIlllllIII[2]] = lllllllllllllIIIlllIllIlIlllIllI.getName();
                CommandBase.notifyOperators(lllllllllllllIIIlllIllIlIlllllII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
                "".length();
                if (((20 + 82 + 22 + 22 ^ 137 + 158 - 183 + 54) & (0x2C ^ 0x17 ^ (0x21 ^ 0x2E) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIllIlIlllIllI.addExperienceLevel(lllllllllllllIIIlllIllIlIllllIII);
                final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[7]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandXP.lIlIIIlllllIII[1]];
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandXP.lIlIIIlllllIII[0]] = lllllllllllllIIIlllIllIlIllllIII;
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandXP.lIlIIIlllllIII[2]] = lllllllllllllIIIlllIllIlIlllIllI.getName();
                CommandBase.notifyOperators(lllllllllllllIIIlllIllIlIlllllII, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
                "".length();
                if (((0x4D ^ 0x11) & ~(0x7A ^ 0x26)) < 0) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIIIlllIllIlIlllllII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, lllllllllllllIIIlllIllIlIlllIllI.experienceTotal);
            if (lllIIlIIIlIlIII(lllllllllllllIIIlllIllIlIlllIlll ? 1 : 0)) {
                throw new CommandException(CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[8]], new Object[CommandXP.lIlIIIlllllIII[0]]);
            }
            lllllllllllllIIIlllIllIlIlllIllI.addExperience(lllllllllllllIIIlllIllIlIllllIII);
            final String lllllllllllllIIIIlIlllIIIlIIIlII3 = CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[9]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll3 = new Object[CommandXP.lIlIIIlllllIII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll3[CommandXP.lIlIIIlllllIII[0]] = lllllllllllllIIIlllIllIlIllllIII;
            lllllllllllllIIIIlIlllIIIlIIIlll3[CommandXP.lIlIIIlllllIII[2]] = lllllllllllllIIIlllIllIlIlllIllI.getName();
            CommandBase.notifyOperators(lllllllllllllIIIlllIllIlIlllllII, this, lllllllllllllIIIIlIlllIIIlIIIlII3, lllllllllllllIIIIlIlllIIIlIIIlll3);
        }
    }
    
    private static String lllIIlIIIIlllII(String lllllllllllllIIIlllIllIlIlIlIIII, final String lllllllllllllIIIlllIllIlIlIIllll) {
        lllllllllllllIIIlllIllIlIlIlIIII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllIllIlIlIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIllIlIlIlIIll = new StringBuilder();
        final char[] lllllllllllllIIIlllIllIlIlIlIIlI = lllllllllllllIIIlllIllIlIlIIllll.toCharArray();
        int lllllllllllllIIIlllIllIlIlIlIIIl = CommandXP.lIlIIIlllllIII[0];
        final float lllllllllllllIIIlllIllIlIlIIlIll = (Object)((String)lllllllllllllIIIlllIllIlIlIlIIII).toCharArray();
        final short lllllllllllllIIIlllIllIlIlIIlIlI = (short)lllllllllllllIIIlllIllIlIlIIlIll.length;
        Exception lllllllllllllIIIlllIllIlIlIIlIIl = (Exception)CommandXP.lIlIIIlllllIII[0];
        while (lllIIlIIIlIllIl((int)lllllllllllllIIIlllIllIlIlIIlIIl, lllllllllllllIIIlllIllIlIlIIlIlI)) {
            final char lllllllllllllIIIlllIllIlIlIlIllI = lllllllllllllIIIlllIllIlIlIIlIll[lllllllllllllIIIlllIllIlIlIIlIIl];
            lllllllllllllIIIlllIllIlIlIlIIll.append((char)(lllllllllllllIIIlllIllIlIlIlIllI ^ lllllllllllllIIIlllIllIlIlIlIIlI[lllllllllllllIIIlllIllIlIlIlIIIl % lllllllllllllIIIlllIllIlIlIlIIlI.length]));
            "".length();
            ++lllllllllllllIIIlllIllIlIlIlIIIl;
            ++lllllllllllllIIIlllIllIlIlIIlIIl;
            "".length();
            if ((0x14 ^ 0x10) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIllIlIlIlIIll);
    }
    
    private static String lllIIlIIIIllIll(final String lllllllllllllIIIlllIllIlIIllIIll, final String lllllllllllllIIIlllIllIlIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIlIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIllIlIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIllIlIIllIlIl.init(CommandXP.lIlIIIlllllIII[1], lllllllllllllIIIlllIllIlIIllIllI);
            return new String(lllllllllllllIIIlllIllIlIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIlIIllIlII) {
            lllllllllllllIIIlllIllIlIIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlIIIlIIlll(final int lllllllllllllIIIlllIllIlIIIllllI) {
        return lllllllllllllIIIlllIllIlIIIllllI == 0;
    }
    
    private static void lllIIlIIIlIIIll() {
        (lIlIIIllllIlIl = new String[CommandXP.lIlIIIlllllIII[10]])[CommandXP.lIlIIIlllllIII[0]] = lllIIlIIIIllIll("f9JtyxjiINE=", "GgMeN");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[2]] = lllIIlIIIIlllII("LCYnHzEhLTlcKD9nPwExKCw=", "OIJrP");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[1]] = lllIIlIIIIllIll("KheoyE+yslC26eoVZjpHyv+UmEs/atz9", "kQVeW");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[3]] = lllIIlIIIIlllII("Dw==", "coYim");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[4]] = lllIIlIIIIllIll("e41PLCfPR18=", "zfyqn");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[6]] = lllIIlIIIIllIll("Tw8JAKC7Iil6blDCRjOADCDr4tKiIwZLB2EBWLJ9QiduHjKhoKLcvg==", "QDRKR");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[7]] = lllIIlIIIIllIll("qHKFY5dn3Ro4lw2ILsFMWerFx8yHGor3JLMlvwLstvA=", "rdBFG");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[8]] = lllIIlIIIlIIIlI("nfLzBPDaf47rSWtNHGxNTZgzv/BSrn+SHQ/vl3kIdlU=", "nXoco");
        CommandXP.lIlIIIllllIlIl[CommandXP.lIlIIIlllllIII[9]] = lllIIlIIIIlllII("AQ0ePw0MBgB8FBJMACcPAQcAIQ==", "bbsRl");
    }
}
