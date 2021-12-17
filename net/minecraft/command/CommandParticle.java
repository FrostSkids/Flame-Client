// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldServer;
import net.minecraft.util.EnumParticleTypes;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandParticle extends CommandBase
{
    private static final /* synthetic */ int[] lIIIIIIIIIIlII;
    private static final /* synthetic */ String[] lIIIIIIIIIIIIl;
    
    private static boolean lIllIIlIlIIIlIl(final int lllllllllllllIlIlIIlIIlllIlIlIII) {
        return lllllllllllllIlIlIIlIIlllIlIlIII != 0;
    }
    
    private static String lIllIIlIIllllII(final String lllllllllllllIlIlIIlIIllllIIIIIl, final String lllllllllllllIlIlIIlIIllllIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIIllllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIllllIIIIII.getBytes(StandardCharsets.UTF_8)), CommandParticle.lIIIIIIIIIIlII[3]), "DES");
            final Cipher lllllllllllllIlIlIIlIIllllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIIllllIIIlIl.init(CommandParticle.lIIIIIIIIIIlII[1], lllllllllllllIlIlIIlIIllllIIIllI);
            return new String(lllllllllllllIlIlIIlIIllllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIIllllIIIlII) {
            lllllllllllllIlIlIIlIIllllIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIlIlIIIllI(final int lllllllllllllIlIlIIlIIlllIllIlll, final int lllllllllllllIlIlIIlIIlllIllIllI) {
        return lllllllllllllIlIlIIlIIlllIllIlll >= lllllllllllllIlIlIIlIIlllIllIllI;
    }
    
    private static String lIllIIlIIlllIIl(String lllllllllllllIlIlIIlIIlllllIIIII, final String lllllllllllllIlIlIIlIIllllIlllll) {
        lllllllllllllIlIlIIlIIlllllIIIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlIIlllllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIIlllllIIIll = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIIlllllIIIlI = lllllllllllllIlIlIIlIIllllIlllll.toCharArray();
        int lllllllllllllIlIlIIlIIlllllIIIIl = CommandParticle.lIIIIIIIIIIlII[0];
        final char lllllllllllllIlIlIIlIIllllIllIll = (Object)((String)lllllllllllllIlIlIIlIIlllllIIIII).toCharArray();
        final boolean lllllllllllllIlIlIIlIIllllIllIlI = lllllllllllllIlIlIIlIIllllIllIll.length != 0;
        String lllllllllllllIlIlIIlIIllllIllIIl = (String)CommandParticle.lIIIIIIIIIIlII[0];
        while (lIllIIlIlIIIlII((int)lllllllllllllIlIlIIlIIllllIllIIl, lllllllllllllIlIlIIlIIllllIllIlI ? 1 : 0)) {
            final char lllllllllllllIlIlIIlIIlllllIIllI = lllllllllllllIlIlIIlIIllllIllIll[lllllllllllllIlIlIIlIIllllIllIIl];
            lllllllllllllIlIlIIlIIlllllIIIll.append((char)(lllllllllllllIlIlIIlIIlllllIIllI ^ lllllllllllllIlIlIIlIIlllllIIIlI[lllllllllllllIlIlIIlIIlllllIIIIl % lllllllllllllIlIlIIlIIlllllIIIlI.length]));
            "".length();
            ++lllllllllllllIlIlIIlIIlllllIIIIl;
            ++lllllllllllllIlIlIIlIIllllIllIIl;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIIlllllIIIll);
    }
    
    private static boolean lIllIIlIlIIIlll(final int lllllllllllllIlIlIIlIIlllIlIIllI) {
        return lllllllllllllIlIlIIlIIlllIlIIllI == 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIlIIlIIllllllIlII, final String[] lllllllllllllIlIlIIlIIllllllIIll, final BlockPos lllllllllllllIlIlIIlIIllllllIIlI) {
        List<String> list;
        if (lIllIIlIlIIlIIl(lllllllllllllIlIlIIlIIllllllIIll.length, CommandParticle.lIIIIIIIIIIlII[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIlIIlIIllllllIIll, EnumParticleTypes.getParticleNames());
            "".length();
            if ("   ".length() >= (62 + 83 + 13 + 38 ^ 160 + 182 - 161 + 11)) {
                return null;
            }
        }
        else if (lIllIIlIlIIlIII(lllllllllllllIlIlIIlIIllllllIIll.length, CommandParticle.lIIIIIIIIIIlII[2]) && lIllIIlIlIIlIlI(lllllllllllllIlIlIIlIIllllllIIll.length, CommandParticle.lIIIIIIIIIIlII[5])) {
            list = CommandBase.func_175771_a(lllllllllllllIlIlIIlIIllllllIIll, CommandParticle.lIIIIIIIIIIlII[2], lllllllllllllIlIlIIlIIllllllIIlI);
            "".length();
            if ((0x33 ^ 0x26 ^ (0x5D ^ 0x4D)) == 0x0) {
                return null;
            }
        }
        else if (lIllIIlIlIIlIIl(lllllllllllllIlIlIIlIIllllllIIll.length, CommandParticle.lIIIIIIIIIIlII[10])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandParticle.lIIIIIIIIIIlII[1]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandParticle.lIIIIIIIIIIlII[0]] = CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[3]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandParticle.lIIIIIIIIIIlII[2]] = CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[9]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIlIIlIIllllllIIll, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if ((0x1 ^ 0x5) <= 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIllIIlIlIIlIII(final int lllllllllllllIlIlIIlIIlllIlIlIll, final int lllllllllllllIlIlIIlIIlllIlIlIlI) {
        return lllllllllllllIlIlIIlIIlllIlIlIll > lllllllllllllIlIlIIlIIlllIlIlIlI;
    }
    
    private static void lIllIIlIlIIIIll() {
        (lIIIIIIIIIIlII = new int[11])[0] = ((0x70 ^ 0x2D) & ~(0x34 ^ 0x69));
        CommandParticle.lIIIIIIIIIIlII[1] = "  ".length();
        CommandParticle.lIIIIIIIIIIlII[2] = " ".length();
        CommandParticle.lIIIIIIIIIIlII[3] = (0x3C ^ 0x76 ^ (0xA ^ 0x48));
        CommandParticle.lIIIIIIIIIIlII[4] = "   ".length();
        CommandParticle.lIIIIIIIIIIlII[5] = (153 + 55 - 166 + 133 ^ 169 + 78 - 128 + 52);
        CommandParticle.lIIIIIIIIIIlII[6] = (0xBA ^ 0xBF);
        CommandParticle.lIIIIIIIIIIlII[7] = (173 + 144 - 250 + 118 ^ 65 + 54 + 2 + 70);
        CommandParticle.lIIIIIIIIIIlII[8] = (0x15 ^ 0x12);
        CommandParticle.lIIIIIIIIIIlII[9] = (0x89 ^ 0x80);
        CommandParticle.lIIIIIIIIIIlII[10] = (0x78 ^ 0x72);
    }
    
    static {
        lIllIIlIlIIIIll();
        lIllIIlIIlllllI();
    }
    
    private static String lIllIIlIIlllIlI(final String lllllllllllllIlIlIIlIIllllIIlllI, final String lllllllllllllIlIlIIlIIllllIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIIllllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIllllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIIllllIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIIllllIlIIlI.init(CommandParticle.lIIIIIIIIIIlII[1], lllllllllllllIlIlIIlIIllllIlIIll);
            return new String(lllllllllllllIlIlIIlIIllllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIIllllIlIIIl) {
            lllllllllllllIlIlIIlIIllllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIlIlIIlIIl(final int lllllllllllllIlIlIIlIIlllIlllIll, final int lllllllllllllIlIlIIlIIlllIlllIlI) {
        return lllllllllllllIlIlIIlIIlllIlllIll == lllllllllllllIlIlIIlIIlllIlllIlI;
    }
    
    private static void lIllIIlIIlllllI() {
        (lIIIIIIIIIIIIl = new String[CommandParticle.lIIIIIIIIIIlII[10]])[CommandParticle.lIIIIIIIIIIlII[0]] = lIllIIlIIlllIIl("MwU6Pg8gCC0=", "CdHJf");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[2]] = lIllIIlIIlllIlI("c44GJ99kbdAHt5/wFTKUxXszgcBByTN2", "UnHiT");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[1]] = lIllIIlIIlllIIl("LCoEJSchIRpmNi43HSElIyBHPTUuIgw=", "OEiHF");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[4]] = lIllIIlIIllllII("Q8dDCgAjPrBjKBWsc5ikZktiuCOeG6D+9L8W3V2YdaU=", "duHGx");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[5]] = lIllIIlIIlllIIl("HiQ0FSc=", "xKFvB");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[6]] = lIllIIlIIlllIIl("Bg==", "YvGfB");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[7]] = lIllIIlIIlllIIl("GzwEOwsWNxp4GhkhHT8JFDZHOAUMFQYjBBw=", "xSiVj");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[8]] = lIllIIlIIlllIIl("Ew4jPSweBT1+PRETOjkuHARgIzgTAisjPg==", "paNPM");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[3]] = lIllIIlIIlllIIl("FwUQGBIV", "yjbus");
        CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[9]] = lIllIIlIIllllII("ONjr2mb2Vvs=", "VdLuh");
    }
    
    @Override
    public String getCommandName() {
        return CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[0]];
    }
    
    private static boolean lIllIIlIlIIIlII(final int lllllllllllllIlIlIIlIIlllIllIIll, final int lllllllllllllIlIlIIlIIlllIllIIlI) {
        return lllllllllllllIlIlIIlIIlllIllIIll < lllllllllllllIlIlIIlIIlllIllIIlI;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIlIIlIlIIIIIIllIl, final String[] lllllllllllllIlIlIIlIlIIIIIIllII) throws CommandException {
        if (lIllIIlIlIIIlII(lllllllllllllIlIlIIlIlIIIIIIllII.length, CommandParticle.lIIIIIIIIIIlII[3])) {
            throw new WrongUsageException(CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[1]], new Object[CommandParticle.lIIIIIIIIIIlII[0]]);
        }
        boolean lllllllllllllIlIlIIlIlIIIIlIIIlI = CommandParticle.lIIIIIIIIIIlII[0] != 0;
        EnumParticleTypes lllllllllllllIlIlIIlIlIIIIlIIIIl = null;
        final float lllllllllllllIlIlIIlIlIIIIIIIllI;
        final int length = (lllllllllllllIlIlIIlIlIIIIIIIllI = (float)(Object)EnumParticleTypes.values()).length;
        int lllllllllllllIlIlIIlIlIIIIIIlIII = CommandParticle.lIIIIIIIIIIlII[0];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIllIIlIlIIIllI(lllllllllllllIlIlIIlIlIIIIIIlIII, length)) {
            final EnumParticleTypes lllllllllllllIlIlIIlIlIIIIlIIIII = lllllllllllllIlIlIIlIlIIIIIIIllI[lllllllllllllIlIlIIlIlIIIIIIlIII];
            if (lIllIIlIlIIIlIl(lllllllllllllIlIlIIlIlIIIIlIIIII.hasArguments() ? 1 : 0)) {
                if (lIllIIlIlIIIlIl(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]].startsWith(lllllllllllllIlIlIIlIlIIIIlIIIII.getParticleName()) ? 1 : 0)) {
                    lllllllllllllIlIlIIlIlIIIIlIIIlI = (CommandParticle.lIIIIIIIIIIlII[2] != 0);
                    lllllllllllllIlIlIIlIlIIIIlIIIIl = lllllllllllllIlIlIIlIlIIIIlIIIII;
                    "".length();
                    if (((0x54 ^ 0x5B ^ (0x7 ^ 0x11)) & (8 + 130 - 137 + 181 ^ 119 + 21 + 5 + 30 ^ -" ".length())) != ((14 + 163 - 81 + 80 ^ 31 + 85 - 18 + 32) & (0x2F ^ 0x31 ^ (0x18 ^ 0x34) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
            }
            else if (lIllIIlIlIIIlIl(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]].equals(lllllllllllllIlIlIIlIlIIIIlIIIII.getParticleName()) ? 1 : 0)) {
                lllllllllllllIlIlIIlIlIIIIlIIIlI = (CommandParticle.lIIIIIIIIIIlII[2] != 0);
                lllllllllllllIlIlIIlIlIIIIlIIIIl = lllllllllllllIlIlIIlIlIIIIlIIIII;
                "".length();
                if (((0x1D ^ 0x33) & ~(0x34 ^ 0x1A)) == -" ".length()) {
                    return;
                }
                break;
            }
            ++lllllllllllllIlIlIIlIlIIIIIIlIII;
        }
        if (lIllIIlIlIIIlll(lllllllllllllIlIlIIlIlIIIIlIIIlI ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[4]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandParticle.lIIIIIIIIIIlII[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandParticle.lIIIIIIIIIIlII[0]] = lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        final String lllllllllllllIlIlIIlIlIIIIIlllll = lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]];
        final Vec3 lllllllllllllIlIlIIlIlIIIIIllllI = lllllllllllllIlIlIIlIlIIIIIIllIl.getPositionVector();
        final double lllllllllllllIlIlIIlIlIIIIIlllIl = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIllllI.xCoord, lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[2]], (boolean)(CommandParticle.lIIIIIIIIIIlII[2] != 0));
        final double lllllllllllllIlIlIIlIlIIIIIlllII = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIllllI.yCoord, lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[1]], (boolean)(CommandParticle.lIIIIIIIIIIlII[2] != 0));
        final double lllllllllllllIlIlIIlIlIIIIIllIll = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIllllI.zCoord, lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[4]], (boolean)(CommandParticle.lIIIIIIIIIIlII[2] != 0));
        final double lllllllllllllIlIlIIlIlIIIIIllIlI = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[5]]);
        final double lllllllllllllIlIlIIlIlIIIIIllIIl = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[6]]);
        final double lllllllllllllIlIlIIlIlIIIIIllIII = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[7]]);
        final double lllllllllllllIlIlIIlIlIIIIIlIlll = (float)CommandBase.parseDouble(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[8]]);
        int lllllllllllllIlIlIIlIlIIIIIlIllI = CommandParticle.lIIIIIIIIIIlII[0];
        if (lIllIIlIlIIlIII(lllllllllllllIlIlIIlIlIIIIIIllII.length, CommandParticle.lIIIIIIIIIIlII[3])) {
            lllllllllllllIlIlIIlIlIIIIIlIllI = CommandBase.parseInt(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[3]], CommandParticle.lIIIIIIIIIIlII[0]);
        }
        boolean lllllllllllllIlIlIIlIlIIIIIlIlIl = CommandParticle.lIIIIIIIIIIlII[0] != 0;
        if (lIllIIlIlIIlIII(lllllllllllllIlIlIIlIlIIIIIIllII.length, CommandParticle.lIIIIIIIIIIlII[9]) && lIllIIlIlIIIlIl(CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[5]].equals(lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[9]]) ? 1 : 0)) {
            lllllllllllllIlIlIIlIlIIIIIlIlIl = (CommandParticle.lIIIIIIIIIIlII[2] != 0);
        }
        final World lllllllllllllIlIlIIlIlIIIIIlIlII = lllllllllllllIlIlIIlIlIIIIIIllIl.getEntityWorld();
        if (lIllIIlIlIIIlIl((lllllllllllllIlIlIIlIlIIIIIlIlII instanceof WorldServer) ? 1 : 0)) {
            final WorldServer lllllllllllllIlIlIIlIlIIIIIlIIll = (WorldServer)lllllllllllllIlIlIIlIlIIIIIlIlII;
            final int[] lllllllllllllIlIlIIlIlIIIIIlIIlI = new int[lllllllllllllIlIlIIlIlIIIIlIIIIl.getArgumentCount()];
            if (lIllIIlIlIIIlIl(lllllllllllllIlIlIIlIlIIIIlIIIIl.hasArguments() ? 1 : 0)) {
                final String[] lllllllllllllIlIlIIlIlIIIIIlIIIl = lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]].split(CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[6]], CommandParticle.lIIIIIIIIIIlII[4]);
                int lllllllllllllIlIlIIlIlIIIIIlIIII = CommandParticle.lIIIIIIIIIIlII[2];
                "".length();
                if (((0xF5 ^ 0x9F ^ (0xD1 ^ 0x98)) & (0x4 ^ 0xD ^ (0x28 ^ 0x2) ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!lIllIIlIlIIIllI(lllllllllllllIlIlIIlIlIIIIIlIIII, lllllllllllllIlIlIIlIlIIIIIlIIIl.length)) {
                    try {
                        lllllllllllllIlIlIIlIlIIIIIlIIlI[lllllllllllllIlIlIIlIlIIIIIlIIII - CommandParticle.lIIIIIIIIIIlII[2]] = Integer.parseInt(lllllllllllllIlIlIIlIlIIIIIlIIIl[lllllllllllllIlIlIIlIlIIIIIlIIII]);
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                    catch (NumberFormatException lllllllllllllIlIlIIlIlIIIIIIllll) {
                        final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[7]];
                        final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandParticle.lIIIIIIIIIIlII[2]];
                        lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandParticle.lIIIIIIIIIIlII[0]] = lllllllllllllIlIlIIlIlIIIIIIllII[CommandParticle.lIIIIIIIIIIlII[0]];
                        throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
                    }
                    ++lllllllllllllIlIlIIlIlIIIIIlIIII;
                }
            }
            lllllllllllllIlIlIIlIlIIIIIlIIll.spawnParticle(lllllllllllllIlIlIIlIlIIIIlIIIIl, lllllllllllllIlIlIIlIlIIIIIlIlIl, lllllllllllllIlIlIIlIlIIIIIlllIl, lllllllllllllIlIlIIlIlIIIIIlllII, lllllllllllllIlIlIIlIlIIIIIllIll, lllllllllllllIlIlIIlIlIIIIIlIllI, lllllllllllllIlIlIIlIlIIIIIllIlI, lllllllllllllIlIlIIlIlIIIIIllIIl, lllllllllllllIlIlIIlIlIIIIIllIII, lllllllllllllIlIlIIlIlIIIIIlIlll, lllllllllllllIlIlIIlIlIIIIIlIIlI);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[8]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandParticle.lIIIIIIIIIIlII[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandParticle.lIIIIIIIIIIlII[0]] = lllllllllllllIlIlIIlIlIIIIIlllll;
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandParticle.lIIIIIIIIIIlII[2]] = Math.max(lllllllllllllIlIlIIlIlIIIIIlIllI, CommandParticle.lIIIIIIIIIIlII[2]);
            CommandBase.notifyOperators(lllllllllllllIlIlIIlIlIIIIIIllIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIlIIlIlIIIIllllIl) {
        return CommandParticle.lIIIIIIIIIIIIl[CommandParticle.lIIIIIIIIIIlII[2]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandParticle.lIIIIIIIIIIlII[1];
    }
    
    private static boolean lIllIIlIlIIlIlI(final int lllllllllllllIlIlIIlIIlllIlIllll, final int lllllllllllllIlIlIIlIIlllIlIlllI) {
        return lllllllllllllIlIlIIlIIlllIlIllll <= lllllllllllllIlIlIIlIIlllIlIlllI;
    }
}
