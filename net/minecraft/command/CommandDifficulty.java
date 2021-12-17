// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Arrays;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.server.MinecraftServer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.EnumDifficulty;

public class CommandDifficulty extends CommandBase
{
    private static final /* synthetic */ String[] lIIIllllIIIIII;
    private static final /* synthetic */ int[] lIIIllllIIIIlI;
    
    private static boolean llIIIlllIlllIll(final int lllllllllllllIIllllIlIlIIIIllllI) {
        return lllllllllllllIIllllIlIlIIIIllllI <= 0;
    }
    
    protected EnumDifficulty getDifficultyFromCommand(final String lllllllllllllIIllllIlIlIIllIIIll) throws CommandException, NumberInvalidException {
        EnumDifficulty enumDifficulty;
        if (llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[4]]) ? 1 : 0) && llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[5]]) ? 1 : 0)) {
            if (llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[6]]) ? 1 : 0) && llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[7]]) ? 1 : 0)) {
                if (llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[8]]) ? 1 : 0) && llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[9]]) ? 1 : 0)) {
                    if (llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[10]]) ? 1 : 0) && llIIIlllIllllII(lllllllllllllIIllllIlIlIIllIIIll.equalsIgnoreCase(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[11]]) ? 1 : 0)) {
                        enumDifficulty = EnumDifficulty.getDifficultyEnum(CommandBase.parseInt(lllllllllllllIIllllIlIlIIllIIIll, CommandDifficulty.lIIIllllIIIIlI[0], CommandDifficulty.lIIIllllIIIIlI[3]));
                        "".length();
                        if ((128 + 56 - 61 + 15 ^ 52 + 67 - 17 + 40) != (0xA3 ^ 0x98 ^ (0x94 ^ 0xAB))) {
                            return null;
                        }
                    }
                    else {
                        enumDifficulty = EnumDifficulty.HARD;
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    enumDifficulty = EnumDifficulty.NORMAL;
                    "".length();
                    if ("   ".length() >= (0x3D ^ 0x39)) {
                        return null;
                    }
                }
            }
            else {
                enumDifficulty = EnumDifficulty.EASY;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
        }
        else {
            enumDifficulty = EnumDifficulty.PEACEFUL;
        }
        return enumDifficulty;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandDifficulty.lIIIllllIIIIlI[1];
    }
    
    private static String llIIIlllIlIllII(String lllllllllllllIIllllIlIlIIlIIllII, final String lllllllllllllIIllllIlIlIIlIIlIll) {
        lllllllllllllIIllllIlIlIIlIIllII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIlIlIIlIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlIlIIlIIllll = new StringBuilder();
        final char[] lllllllllllllIIllllIlIlIIlIIlllI = lllllllllllllIIllllIlIlIIlIIlIll.toCharArray();
        int lllllllllllllIIllllIlIlIIlIIllIl = CommandDifficulty.lIIIllllIIIIlI[0];
        final boolean lllllllllllllIIllllIlIlIIlIIIlll = (Object)((String)lllllllllllllIIllllIlIlIIlIIllII).toCharArray();
        final int lllllllllllllIIllllIlIlIIlIIIllI = lllllllllllllIIllllIlIlIIlIIIlll.length;
        boolean lllllllllllllIIllllIlIlIIlIIIlIl = CommandDifficulty.lIIIllllIIIIlI[0] != 0;
        while (llIIIlllIlllllI(lllllllllllllIIllllIlIlIIlIIIlIl ? 1 : 0, lllllllllllllIIllllIlIlIIlIIIllI)) {
            final char lllllllllllllIIllllIlIlIIlIlIIlI = lllllllllllllIIllllIlIlIIlIIIlll[lllllllllllllIIllllIlIlIIlIIIlIl];
            lllllllllllllIIllllIlIlIIlIIllll.append((char)(lllllllllllllIIllllIlIlIIlIlIIlI ^ lllllllllllllIIllllIlIlIIlIIlllI[lllllllllllllIIllllIlIlIIlIIllIl % lllllllllllllIIllllIlIlIIlIIlllI.length]));
            "".length();
            ++lllllllllllllIIllllIlIlIIlIIllIl;
            ++lllllllllllllIIllllIlIlIIlIIIlIl;
            "".length();
            if (-(0x42 ^ 0x46) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlIlIIlIIllll);
    }
    
    private static boolean llIIIlllIlllllI(final int lllllllllllllIIllllIlIlIIIlIIIll, final int lllllllllllllIIllllIlIlIIIlIIIlI) {
        return lllllllllllllIIllllIlIlIIIlIIIll < lllllllllllllIIllllIlIlIIIlIIIlI;
    }
    
    private static boolean llIIIlllIllllII(final int lllllllllllllIIllllIlIlIIIlIIIII) {
        return lllllllllllllIIllllIlIlIIIlIIIII == 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllllIlIlIIlIlllll, final String[] lllllllllllllIIllllIlIlIIlIlllII, final BlockPos lllllllllllllIIllllIlIlIIlIlllIl) {
        List<String> listOfStringsMatchingLastWord;
        if (llIIIlllIllllIl(lllllllllllllIIllllIlIlIIlIlllII.length, CommandDifficulty.lIIIllllIIIIlI[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandDifficulty.lIIIllllIIIIlI[4]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDifficulty.lIIIllllIIIIlI[0]] = CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[12]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDifficulty.lIIIllllIIIIlI[2]] = CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[13]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDifficulty.lIIIllllIIIIlI[1]] = CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[14]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDifficulty.lIIIllllIIIIlI[3]] = CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[15]];
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIllllIlIlIIlIlllII, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static String llIIIlllIlIllIl(final String lllllllllllllIIllllIlIlIIIlIllll, final String lllllllllllllIIllllIlIlIIIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIlIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlIlIIIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlIlIIIllIIIl.init(CommandDifficulty.lIIIllllIIIIlI[1], lllllllllllllIIllllIlIlIIIllIIlI);
            return new String(lllllllllllllIIllllIlIlIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIlIIIllIIII) {
            lllllllllllllIIllllIlIlIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllllIlIlIIllIllII, final String[] lllllllllllllIIllllIlIlIIllIIlll) throws CommandException {
        if (llIIIlllIlllIll(lllllllllllllIIllllIlIlIIllIIlll.length)) {
            throw new WrongUsageException(CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[1]], new Object[CommandDifficulty.lIIIllllIIIIlI[0]]);
        }
        final EnumDifficulty lllllllllllllIIllllIlIlIIllIlIlI = this.getDifficultyFromCommand(lllllllllllllIIllllIlIlIIllIIlll[CommandDifficulty.lIIIllllIIIIlI[0]]);
        MinecraftServer.getServer().setDifficultyForAllWorlds(lllllllllllllIIllllIlIlIIllIlIlI);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[3]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandDifficulty.lIIIllllIIIIlI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandDifficulty.lIIIllllIIIIlI[0]] = new ChatComponentTranslation(lllllllllllllIIllllIlIlIIllIlIlI.getDifficultyResourceKey(), new Object[CommandDifficulty.lIIIllllIIIIlI[0]]);
        CommandBase.notifyOperators(lllllllllllllIIllllIlIlIIllIllII, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static void llIIIlllIlIllll() {
        (lIIIllllIIIIII = new String[CommandDifficulty.lIIIllllIIIIlI[16]])[CommandDifficulty.lIIIllllIIIIlI[0]] = llIIIlllIlIllII("CDw/LwYPIDU9Fg==", "lUYIo");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[2]] = llIIIlllIlIllII("IBsnBjAtEDlFNSoSLAIyNhg+En82BysMNA==", "CtJkQ");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[1]] = llIIIlllIlIllIl("a5HDGo2sQGk6PWA4Cu27hPXqsDv/o1fCD3cs0Rdvkn0=", "CdTrq");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[3]] = llIIIlllIlIllII("MTwUDAk8NwpPDDs1HwgLJz8NGEYhJhoCDSEg", "RSyah");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[4]] = llIIIlllIlIllII("Mxc7BiclBzY=", "CrZeB");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[5]] = llIIIlllIlIllII("FA==", "dBTxs");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[6]] = llIIIlllIlIllII("AxQECA==", "fuwqi");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[7]] = llIIIlllIlIllII("AQ==", "dMSHC");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[8]] = llIIIlllIlIllIl("aoRgKsJzroo=", "fjRjD");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[9]] = llIIIlllIlIllII("IQ==", "OwaHh");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[10]] = llIIIlllIlIllII("Kjs9Iw==", "BZOGo");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[11]] = llIIIlllIlIllII("Jw==", "OiPGH");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[12]] = llIIIlllIlIlllI("5ERNPRgXDx69TAVazlhBHw==", "SUvVx");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[13]] = llIIIlllIlIllIl("nQSEwnMfZvE=", "vbymY");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[14]] = llIIIlllIlIllIl("iFU8H87GvDA=", "Jlnmh");
        CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[15]] = llIIIlllIlIllII("ERQKCg==", "yuxnr");
    }
    
    private static void llIIIlllIlllIlI() {
        (lIIIllllIIIIlI = new int[17])[0] = ((0x1E ^ 0x2F ^ (0x31 ^ 0x46)) & (46 + 160 + 6 + 7 ^ 99 + 127 - 181 + 112 ^ -" ".length()));
        CommandDifficulty.lIIIllllIIIIlI[1] = "  ".length();
        CommandDifficulty.lIIIllllIIIIlI[2] = " ".length();
        CommandDifficulty.lIIIllllIIIIlI[3] = "   ".length();
        CommandDifficulty.lIIIllllIIIIlI[4] = (0xC6 ^ 0xC2);
        CommandDifficulty.lIIIllllIIIIlI[5] = (49 + 69 - 101 + 142 ^ 66 + 150 - 175 + 113);
        CommandDifficulty.lIIIllllIIIIlI[6] = (0x30 ^ 0x12 ^ (0x6D ^ 0x49));
        CommandDifficulty.lIIIllllIIIIlI[7] = (0x37 ^ 0x30);
        CommandDifficulty.lIIIllllIIIIlI[8] = (0x34 ^ 0x79 ^ (0x6B ^ 0x2E));
        CommandDifficulty.lIIIllllIIIIlI[9] = (" ".length() ^ (0x1F ^ 0x17));
        CommandDifficulty.lIIIllllIIIIlI[10] = (101 + 78 - 164 + 137 ^ 77 + 92 - 112 + 89);
        CommandDifficulty.lIIIllllIIIIlI[11] = (0xB1 ^ 0x80 ^ (0x1E ^ 0x24));
        CommandDifficulty.lIIIllllIIIIlI[12] = (0x46 ^ 0x4F ^ (0x48 ^ 0x4D));
        CommandDifficulty.lIIIllllIIIIlI[13] = (0x61 ^ 0x6C);
        CommandDifficulty.lIIIllllIIIIlI[14] = (0x5C ^ 0x52);
        CommandDifficulty.lIIIllllIIIIlI[15] = (92 + 164 - 137 + 63 ^ 20 + 38 - 8 + 135);
        CommandDifficulty.lIIIllllIIIIlI[16] = (((0x41 ^ 0x21) & ~(0x67 ^ 0x7)) ^ (0xA ^ 0x1A));
    }
    
    private static String llIIIlllIlIlllI(final String lllllllllllllIIllllIlIlIIIlllIlI, final String lllllllllllllIIllllIlIlIIIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlIlIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), CommandDifficulty.lIIIllllIIIIlI[8]), "DES");
            final Cipher lllllllllllllIIllllIlIlIIIlllllI = Cipher.getInstance("DES");
            lllllllllllllIIllllIlIlIIIlllllI.init(CommandDifficulty.lIIIllllIIIIlI[1], lllllllllllllIIllllIlIlIIIllllll);
            return new String(lllllllllllllIIllllIlIlIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlIlIIIllllIl) {
            lllllllllllllIIllllIlIlIIIllllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllllIlIlIIlllIIlI) {
        return CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[2]];
    }
    
    @Override
    public String getCommandName() {
        return CommandDifficulty.lIIIllllIIIIII[CommandDifficulty.lIIIllllIIIIlI[0]];
    }
    
    static {
        llIIIlllIlllIlI();
        llIIIlllIlIllll();
    }
    
    private static boolean llIIIlllIllllIl(final int lllllllllllllIIllllIlIlIIIlIIlll, final int lllllllllllllIIllllIlIlIIIlIIllI) {
        return lllllllllllllIIllllIlIlIIIlIIlll == lllllllllllllIIllllIlIlIIIlIIllI;
    }
}
