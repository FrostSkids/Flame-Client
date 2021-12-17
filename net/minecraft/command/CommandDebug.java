// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.FileWriter;
import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import net.minecraft.profiler.Profiler;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import org.apache.logging.log4j.Logger;

public class CommandDebug extends CommandBase
{
    private static final /* synthetic */ String[] llIlIIIlIIllII;
    private static final /* synthetic */ int[] llIlIIIlIlIIII;
    private /* synthetic */ int field_147207_c;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ long field_147206_b;
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIllIIllllIlIlIlll, final String[] llllllllllllIllIllIIllllIlIlIllI, final BlockPos llllllllllllIllIllIIllllIlIlIlII) {
        List<String> listOfStringsMatchingLastWord;
        if (lIIlIIIllllIlIIl(llllllllllllIllIllIIllllIlIlIllI.length, CommandDebug.llIlIIIlIlIIII[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandDebug.llIlIIIlIlIIII[3]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDebug.llIlIIIlIlIIII[0]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[56]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandDebug.llIlIIIlIlIIII[2]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[57]];
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIllIIllllIlIlIllI, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandDebug.llIlIIIlIlIIII[1];
    }
    
    private void func_147202_a(final int llllllllllllIllIllIIllllIllllIII, final String llllllllllllIllIllIIllllIlllIllI, final StringBuilder llllllllllllIllIllIIllllIlllIlII) {
        final List<Profiler.Result> llllllllllllIllIllIIlllllIIIIIll = MinecraftServer.getServer().theProfiler.getProfilingData(llllllllllllIllIllIIllllIlllIllI);
        if (lIIlIIIllllIIlll(llllllllllllIllIllIIlllllIIIIIll) && lIIlIIIllllIlIII(llllllllllllIllIllIIlllllIIIIIll.size(), CommandDebug.llIlIIIlIlIIII[1])) {
            int llllllllllllIllIllIIlllllIIIIIIl = CommandDebug.llIlIIIlIlIIII[2];
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
            while (!lIIlIIIllllIlIII(llllllllllllIllIllIIlllllIIIIIIl, llllllllllllIllIllIIlllllIIIIIll.size())) {
                final Profiler.Result llllllllllllIllIllIIllllIlllllll = llllllllllllIllIllIIlllllIIIIIll.get(llllllllllllIllIllIIlllllIIIIIIl);
                final String format = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[30]];
                final Object[] args = new Object[CommandDebug.llIlIIIlIlIIII[2]];
                args[CommandDebug.llIlIIIlIlIIII[0]] = llllllllllllIllIllIIllllIllllIII;
                llllllllllllIllIllIIllllIlllIlII.append(String.format(format, args));
                "".length();
                int llllllllllllIllIllIIllllIllllllI = CommandDebug.llIlIIIlIlIIII[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlIIIllllIlIII(llllllllllllIllIllIIllllIllllllI, llllllllllllIllIllIIllllIllllIII)) {
                    llllllllllllIllIllIIllllIlllIlII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[31]]);
                    "".length();
                    ++llllllllllllIllIllIIllllIllllllI;
                }
                final StringBuilder append = llllllllllllIllIllIIllllIlllIlII.append(llllllllllllIllIllIIllllIlllllll.field_76331_c).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[32]]);
                final String format2 = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[33]];
                final Object[] args2 = new Object[CommandDebug.llIlIIIlIlIIII[2]];
                args2[CommandDebug.llIlIIIlIlIIII[0]] = llllllllllllIllIllIIllllIlllllll.field_76332_a;
                final StringBuilder append2 = append.append(String.format(format2, args2)).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[34]]);
                final String format3 = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[35]];
                final Object[] args3 = new Object[CommandDebug.llIlIIIlIlIIII[2]];
                args3[CommandDebug.llIlIIIlIlIIII[0]] = llllllllllllIllIllIIllllIlllllll.field_76330_b;
                append2.append(String.format(format3, args3)).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[36]]);
                "".length();
                if (lIIlIIIllllIIllI(llllllllllllIllIllIIllllIlllllll.field_76331_c.equals(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[37]]) ? 1 : 0)) {
                    try {
                        this.func_147202_a(llllllllllllIllIllIIllllIllllIII + CommandDebug.llIlIIIlIlIIII[2], String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIIllllIlllIllI)).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[38]]).append(llllllllllllIllIllIIllllIlllllll.field_76331_c)), llllllllllllIllIllIIllllIlllIlII);
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIllIllIIllllIlllllII) {
                        llllllllllllIllIllIIllllIlllIlII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[39]]).append(llllllllllllIllIllIIllllIlllllII).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[40]]);
                        "".length();
                    }
                }
                ++llllllllllllIllIllIIlllllIIIIIIl;
            }
        }
    }
    
    private static void lIIlIIIllllIIIlI() {
        (llIlIIIlIlIIII = new int[59])[0] = ((0xCA ^ 0x85 ^ (0x9B ^ 0x86)) & (0x9 ^ 0x5D ^ (0x86 ^ 0x80) ^ -" ".length()));
        CommandDebug.llIlIIIlIlIIII[1] = "   ".length();
        CommandDebug.llIlIIIlIlIIII[2] = " ".length();
        CommandDebug.llIlIIIlIlIIII[3] = "  ".length();
        CommandDebug.llIlIIIlIlIIII[4] = (0x92 ^ 0xAE ^ (0xB4 ^ 0x8C));
        CommandDebug.llIlIIIlIlIIII[5] = (0x79 ^ 0x52 ^ (0x3 ^ 0x2D));
        CommandDebug.llIlIIIlIlIIII[6] = (0x12 ^ 0x14);
        CommandDebug.llIlIIIlIlIIII[7] = (0x5D ^ 0x5A);
        CommandDebug.llIlIIIlIlIIII[8] = (0x95 ^ 0x98 ^ (0x90 ^ 0x95));
        CommandDebug.llIlIIIlIlIIII[9] = (0x5E ^ 0x57);
        CommandDebug.llIlIIIlIlIIII[10] = (0xE4 ^ 0x91 ^ 27 + 74 + 9 + 17);
        CommandDebug.llIlIIIlIlIIII[11] = (0x44 ^ 0x4F);
        CommandDebug.llIlIIIlIlIIII[12] = (0x13 ^ 0x1F);
        CommandDebug.llIlIIIlIlIIII[13] = (0x13 ^ 0x1E);
        CommandDebug.llIlIIIlIlIIII[14] = (114 + 19 - 49 + 46 ^ 124 + 59 - 161 + 118);
        CommandDebug.llIlIIIlIlIIII[15] = (0x14 ^ 0x1B);
        CommandDebug.llIlIIIlIlIIII[16] = (0xAB ^ 0xBB);
        CommandDebug.llIlIIIlIlIIII[17] = (0x2C ^ 0x3D);
        CommandDebug.llIlIIIlIlIIII[18] = (92 + 155 - 65 + 1 ^ 144 + 4 - 72 + 89);
        CommandDebug.llIlIIIlIlIIII[19] = (0xA1 ^ 0x99 ^ (0x8 ^ 0x23));
        CommandDebug.llIlIIIlIlIIII[20] = (0x1A ^ 0x6D ^ (0xA5 ^ 0xC6));
        CommandDebug.llIlIIIlIlIIII[21] = (0xAA ^ 0xBF);
        CommandDebug.llIlIIIlIlIIII[22] = (17 + 55 - 70 + 140 ^ 3 + 76 - 1 + 74);
        CommandDebug.llIlIIIlIlIIII[23] = (0xFB ^ 0x98 ^ (0x39 ^ 0x4D));
        CommandDebug.llIlIIIlIlIIII[24] = (0x9 ^ 0x11);
        CommandDebug.llIlIIIlIlIIII[25] = (0x9 ^ 0x10);
        CommandDebug.llIlIIIlIlIIII[26] = (0x64 ^ 0x7E);
        CommandDebug.llIlIIIlIlIIII[27] = (0x97 ^ 0x80 ^ (0x3A ^ 0x36));
        CommandDebug.llIlIIIlIlIIII[28] = (0x5E ^ 0x42);
        CommandDebug.llIlIIIlIlIIII[29] = (0x3B ^ 0x26);
        CommandDebug.llIlIIIlIlIIII[30] = (0xB ^ 0x15);
        CommandDebug.llIlIIIlIlIIII[31] = (0xED ^ 0x94 ^ (0xE8 ^ 0x8E));
        CommandDebug.llIlIIIlIlIIII[32] = (0x21 ^ 0x40 ^ (0x5B ^ 0x1A));
        CommandDebug.llIlIIIlIlIIII[33] = (0xB5 ^ 0x94);
        CommandDebug.llIlIIIlIlIIII[34] = (0xBB ^ 0x99);
        CommandDebug.llIlIIIlIlIIII[35] = (0x13 ^ 0x43 ^ (0x3C ^ 0x4F));
        CommandDebug.llIlIIIlIlIIII[36] = (0x23 ^ 0x7);
        CommandDebug.llIlIIIlIlIIII[37] = (0x40 ^ 0x68 ^ (0x89 ^ 0x84));
        CommandDebug.llIlIIIlIlIIII[38] = (0x14 ^ 0x10 ^ (0x2C ^ 0xE));
        CommandDebug.llIlIIIlIlIIII[39] = (0xBD ^ 0x9A);
        CommandDebug.llIlIIIlIlIIII[40] = (0x43 ^ 0x6B);
        CommandDebug.llIlIIIlIlIIII[41] = (113 + 12 - 30 + 137 ^ 134 + 58 - 148 + 149);
        CommandDebug.llIlIIIlIlIIII[42] = (0xA4 ^ 0x8E);
        CommandDebug.llIlIIIlIlIIII[43] = (0x17 ^ 0x3C);
        CommandDebug.llIlIIIlIlIIII[44] = (0x2F ^ 0x3);
        CommandDebug.llIlIIIlIlIIII[45] = (0x1B ^ 0x36);
        CommandDebug.llIlIIIlIlIIII[46] = (0x48 ^ 0x66);
        CommandDebug.llIlIIIlIlIIII[47] = (0x72 ^ 0x5D);
        CommandDebug.llIlIIIlIlIIII[48] = (0x1C ^ 0x52 ^ (0x73 ^ 0xD));
        CommandDebug.llIlIIIlIlIIII[49] = (0x9C ^ 0xAD);
        CommandDebug.llIlIIIlIlIIII[50] = (0x14 ^ 0x26);
        CommandDebug.llIlIIIlIlIIII[51] = (82 + 65 - 41 + 65 ^ 3 + 15 + 60 + 74);
        CommandDebug.llIlIIIlIlIIII[52] = (0xF5 ^ 0xC1);
        CommandDebug.llIlIIIlIlIIII[53] = (0x53 ^ 0x66);
        CommandDebug.llIlIIIlIlIIII[54] = (0x57 ^ 0x61);
        CommandDebug.llIlIIIlIlIIII[55] = (0x42 ^ 0x75);
        CommandDebug.llIlIIIlIlIIII[56] = (43 + 68 - 35 + 97 ^ 44 + 9 + 6 + 90);
        CommandDebug.llIlIIIlIlIIII[57] = (0x16 ^ 0x2F);
        CommandDebug.llIlIIIlIlIIII[58] = (0x1D ^ 0x27);
    }
    
    private void func_147205_a(final long llllllllllllIllIllIIlllllIlIIIll, final int llllllllllllIllIllIIlllllIlIlIII) {
        final File llllllllllllIllIllIIlllllIlIIlll = new File(MinecraftServer.getServer().getFile(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[11]]), String.valueOf(new StringBuilder(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[12]]).append(new SimpleDateFormat(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[13]]).format(new Date())).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[14]])));
        llllllllllllIllIllIIlllllIlIIlll.getParentFile().mkdirs();
        "".length();
        try {
            final FileWriter llllllllllllIllIllIIlllllIlIIllI = new FileWriter(llllllllllllIllIllIIlllllIlIIlll);
            llllllllllllIllIllIIlllllIlIIllI.write(this.func_147204_b(llllllllllllIllIllIIlllllIlIIIll, llllllllllllIllIllIIlllllIlIlIII));
            llllllllllllIllIllIIlllllIlIIllI.close();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIllIIlllllIlIIlIl) {
            CommandDebug.logger.error(String.valueOf(new StringBuilder(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[15]]).append(llllllllllllIllIllIIlllllIlIIlll)), llllllllllllIllIllIIlllllIlIIlIl);
        }
    }
    
    private static boolean lIIlIIIllllIIIll(final int llllllllllllIllIllIIllllIIIIIIlI, final int llllllllllllIllIllIIllllIIIIIIIl) {
        return llllllllllllIllIllIIllllIIIIIIlI < llllllllllllIllIllIIllllIIIIIIIl;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIllIIllllllIIIlIl) {
        return CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[2]];
    }
    
    private static boolean lIIlIIIllllIIlll(final Object llllllllllllIllIllIIlllIllllllll) {
        return llllllllllllIllIllIIlllIllllllll != null;
    }
    
    private static boolean lIIlIIIllllIIlII(final int llllllllllllIllIllIIlllIllllllIl) {
        return llllllllllllIllIllIIlllIllllllIl != 0;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIllIIlllllIllIlIl, final String[] llllllllllllIllIllIIlllllIllIlII) throws CommandException {
        if (lIIlIIIllllIIIll(llllllllllllIllIllIIlllllIllIlII.length, CommandDebug.llIlIIIlIlIIII[2])) {
            throw new WrongUsageException(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[3]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
        }
        if (lIIlIIIllllIIlII(llllllllllllIllIllIIlllllIllIlII[CommandDebug.llIlIIIlIlIIII[0]].equals(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[1]]) ? 1 : 0)) {
            if (lIIlIIIllllIIlIl(llllllllllllIllIllIIlllllIllIlII.length, CommandDebug.llIlIIIlIlIIII[2])) {
                throw new WrongUsageException(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[4]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
            }
            CommandBase.notifyOperators(llllllllllllIllIllIIlllllIllIlIl, this, CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[5]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
            MinecraftServer.getServer().enableProfiling();
            this.field_147206_b = MinecraftServer.getCurrentTimeMillis();
            this.field_147207_c = MinecraftServer.getServer().getTickCounter();
            "".length();
            if ("   ".length() == (0x86 ^ 0x82)) {
                return;
            }
        }
        else {
            if (lIIlIIIllllIIllI(llllllllllllIllIllIIlllllIllIlII[CommandDebug.llIlIIIlIlIIII[0]].equals(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[6]]) ? 1 : 0)) {
                throw new WrongUsageException(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[7]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
            }
            if (lIIlIIIllllIIlIl(llllllllllllIllIllIIlllllIllIlII.length, CommandDebug.llIlIIIlIlIIII[2])) {
                throw new WrongUsageException(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[8]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
            }
            if (lIIlIIIllllIIllI(MinecraftServer.getServer().theProfiler.profilingEnabled ? 1 : 0)) {
                throw new CommandException(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[9]], new Object[CommandDebug.llIlIIIlIlIIII[0]]);
            }
            final long llllllllllllIllIllIIlllllIlllIlI = MinecraftServer.getCurrentTimeMillis();
            final int llllllllllllIllIllIIlllllIlllIIl = MinecraftServer.getServer().getTickCounter();
            final long llllllllllllIllIllIIlllllIlllIII = llllllllllllIllIllIIlllllIlllIlI - this.field_147206_b;
            final int llllllllllllIllIllIIlllllIllIlll = llllllllllllIllIllIIlllllIlllIIl - this.field_147207_c;
            this.func_147205_a(llllllllllllIllIllIIlllllIlllIII, llllllllllllIllIllIIlllllIllIlll);
            MinecraftServer.getServer().theProfiler.profilingEnabled = (CommandDebug.llIlIIIlIlIIII[0] != 0);
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[10]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandDebug.llIlIIIlIlIIII[3]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandDebug.llIlIIIlIlIIII[0]] = llllllllllllIllIllIIlllllIlllIII / 1000.0f;
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandDebug.llIlIIIlIlIIII[2]] = llllllllllllIllIllIIlllllIllIlll;
            CommandBase.notifyOperators(llllllllllllIllIllIIlllllIllIlIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        }
    }
    
    private static String lIIlIIIlllIIllII(final String llllllllllllIllIllIIllllIIlIlIlI, final String llllllllllllIllIllIIllllIIlIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIllllIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIllllIIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIllllIIlIllII.init(CommandDebug.llIlIIIlIlIIII[3], llllllllllllIllIllIIllllIIlIllIl);
            return new String(llllllllllllIllIllIIllllIIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIllllIIlIlIll) {
            llllllllllllIllIllIIllllIIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private String func_147204_b(final long llllllllllllIllIllIIlllllIIlIllI, final int llllllllllllIllIllIIlllllIIlIlIl) {
        final StringBuilder llllllllllllIllIllIIlllllIIllIII = new StringBuilder();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[16]]);
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[17]]);
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(func_147203_d());
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[18]]);
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[19]]).append(llllllllllllIllIllIIlllllIIlIllI).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[20]]);
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[21]]).append(llllllllllllIllIllIIlllllIIlIlIl).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[22]]);
        "".length();
        final StringBuilder append = llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[23]]);
        final String format = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[24]];
        final Object[] args = new Object[CommandDebug.llIlIIIlIlIIII[2]];
        args[CommandDebug.llIlIIIlIlIIII[0]] = llllllllllllIllIllIIlllllIIlIlIl / (llllllllllllIllIllIIlllllIIlIllI / 1000.0f);
        append.append(String.format(format, args)).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[25]]).append(CommandDebug.llIlIIIlIlIIII[20]).append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[26]]);
        "".length();
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[27]]);
        "".length();
        this.func_147202_a(CommandDebug.llIlIIIlIlIIII[0], CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[28]], llllllllllllIllIllIIlllllIIllIII);
        llllllllllllIllIllIIlllllIIllIII.append(CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[29]]);
        "".length();
        return String.valueOf(llllllllllllIllIllIIlllllIIllIII);
    }
    
    private static boolean lIIlIIIllllIIlIl(final int llllllllllllIllIllIIlllIlllllIII, final int llllllllllllIllIllIIlllIllllIlll) {
        return llllllllllllIllIllIIlllIlllllIII != llllllllllllIllIllIIlllIllllIlll;
    }
    
    private static void lIIlIIIlllIllIIl() {
        (llIlIIIlIIllII = new String[CommandDebug.llIlIIIlIlIIII[58]])[CommandDebug.llIlIIIlIlIIII[0]] = lIIlIIIlllIIIIlI("Hgk3GBE=", "zlUmv");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[2]] = lIIlIIIlllIIIIll("nLqaHcAPDT5oWVK0NyLG0i0XlrwlEDns", "HTRtd");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[3]] = lIIlIIIlllIIIIll("J/o3XuDKoPia4NvagsL+Db5Yxg4owIpc", "uuLNq");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[1]] = lIIlIIIlllIIIIll("yL16sBfyLtc=", "lQnIQ");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[4]] = lIIlIIIlllIIllII("dG2JKvLPhuC3DcNiiT91ZrPPJ9mq6wPO", "DOaOY");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[5]] = lIIlIIIlllIIllII("KVmDYuqCmHOslk4NtQBEIb6q5GPA2Ckf", "OMEtt");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[6]] = lIIlIIIlllIIIIlI("PzABAQ==", "LDnqo");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[7]] = lIIlIIIlllIIllII("taLMoFELVSCxMArdboRfclTJA8t/MSlg", "mgIad");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[8]] = lIIlIIIlllIIIIlI("LSsFDDMgIBtPNismHQZ8OzcJBjc=", "NDhaR");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[9]] = lIIlIIIlllIIllII("0WW3wImPaSQRUvkWTkopf/r11dY+OMkMNiUl/c5bJV0=", "yqMVx");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[10]] = lIIlIIIlllIIIIlI("AAoKKwUNARRoAAYHEiFKEBEINg==", "cegFd");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[11]] = lIIlIIIlllIIIIlI("MSYxLQs=", "UCSXl");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[12]] = lIIlIIIlllIIIIlI("IQs3Mjo9HHUmNiIMNCAgfA==", "QyXTS");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[13]] = lIIlIIIlllIIIIlI("AR4aEVU1Kk4MHCcvK0YVFUkQGw==", "xgchx");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[14]] = lIIlIIIlllIIIIlI("eSIdDg==", "WVezd");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[15]] = lIIlIIIlllIIllII("OLhKM1Aynv9x1aEytJVqYyMhPGKXGthuaOt0rLCkQMtqdIZIFyntnA==", "yBvwZ");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[16]] = lIIlIIIlllIIllII("ujWvItOENJZx9RbeHyR2U0JUf1TNdMcE05Twk9uwKiIvFV0vr9svBQ==", "fmqce");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[17]] = lIIlIIIlllIIllII("7XF8w9cUiIc=", "KXbiY");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[18]] = lIIlIIIlllIIIIlI("SEY=", "BLlFA");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[19]] = lIIlIIIlllIIllII("M24NFGsdWSeo5W4B+so/3A==", "GFKRT");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[20]] = lIIlIIIlllIIllII("Uw9X1MwiiH8=", "ifflv");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[21]] = lIIlIIIlllIIIIlI("LRAuKUEKCSwsW1k=", "yyMBa");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[22]] = lIIlIIIlllIIIIlI("dBcHDTgnaQ==", "TcnnS");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[23]] = lIIlIIIlllIIIIll("TnAjDN0arQFMoWcJ6vRCfOiBgIpEKYkvRKjxa/n5V5s=", "SChkZ");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[24]] = lIIlIIIlllIIIIlI("Y0NQNQ==", "FmbSB");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[25]] = lIIlIIIlllIIIIlI("aQMNKCo6VxQuM2kEASguJxNKawg9VxcjLjwbAGsjLFc=", "IwdKA");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[26]] = lIIlIIIlllIIIIll("YR4yew9UOHgJEOE7HCh+VY7TiXMfVnDE", "OFWwM");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[27]] = lIIlIIIlllIIIIll("5Xr+EgF1YtLwf0BJoix+zKutX6jjy5wItVmCjN1VDzg=", "aIktR");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[28]] = lIIlIIIlllIIIIll("vfIiBKHQFOk=", "uudYI");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[29]] = lIIlIIIlllIIIIll("bSIRhbsPBUmEvcI9KZNsIwHs1wNY0lOddAdIykZcXEM=", "TNgka");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[30]] = lIIlIIIlllIIllII("Oj2bVPirxOc=", "ctxUN");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[31]] = lIIlIIIlllIIllII("wC9j/33+2d0=", "exYjp");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[32]] = lIIlIIIlllIIIIll("MEFZ92i9SLA=", "lOsDy");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[33]] = lIIlIIIlllIIIIll("T2LOMDDAjQc=", "lEcti");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[34]] = lIIlIIIlllIIIIlI("QFk=", "evYPA");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[35]] = lIIlIIIlllIIIIlI("R3trJw==", "bUYAb");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[36]] = lIIlIIIlllIIIIlI("cWU=", "TotHJ");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[37]] = lIIlIIIlllIIllII("LUrM1DEzL0Pca/6fCfPtKA==", "mhRFj");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[38]] = lIIlIIIlllIIIIlI("eQ==", "WKofc");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[39]] = lIIlIIIlllIIIIlI("IhdjCgk6CRMbGDYCYw==", "yLCOQ");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[40]] = lIIlIIIlllIIllII("FNPZZq2JA+8=", "vShSI");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[41]] = lIIlIIIlllIIllII("jBBbwCvKP6l9RUfcW+tHpg==", "Vtomb");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[42]] = lIIlIIIlllIIllII("dQIqWF6YS6UwhIr6Udp2vWbVUo+TxHL0MQD/pH8VpMkAWizjebmjbw==", "ZpSPi");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[43]] = lIIlIIIlllIIllII("sYBhDM9VaEusSxq9RG2xC5IjxNfutWHvSsY9cmB7Jj8=", "nSdMu");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[44]] = lIIlIIIlllIIIIll("/Y949BXmsVaGO/3B8DngaOAmfUJ0j4Q2DXi5qjFf/H5ejaxv4VTZ1w==", "bGxgM");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[45]] = lIIlIIIlllIIIIll("Y+q9WmP26v2QGl9+5gIaDW9RqBYhPxay", "FfBIN");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[46]] = lIIlIIIlllIIIIll("ekC1JfMaU8I++oR/K+ZADg==", "pfQzg");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[47]] = lIIlIIIlllIIllII("K7F4A2q8bJiStTYfZjhnWnAy/rnlZjaZlgMp7AuLblw=", "opeKF");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[48]] = lIIlIIIlllIIIIll("l9GM+GSqQVtLTJneSxaudsxubo222k9I", "SsFCR");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[49]] = lIIlIIIlllIIIIlI("OiQ4Zj8dPydmJBE4PGYmASYtIzoH", "tKOFH");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[50]] = lIIlIIIlllIIIIlI("Dy0DWBEoNhxYEiknVAsHLCdUFhMsIBEKFQ==", "ABtxf");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[51]] = lIIlIIIlllIIllII("MAl4xtFhoPmMjPXYa+NMqinxhw6FWlJ8WkpUboip5CPP4//Q5tMHjzj4DNpsuNYPGt2+bXmVgeJr0Io5Zb3ipw==", "pYAZG");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[52]] = lIIlIIIlllIIllII("2ofZDlhfPoqJQZ/agctwAaVEeIB5AXgCp0V9k5uDXf5NQopSF8N5Y8GAjZv8dW13", "xPDKn");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[53]] = lIIlIIIlllIIllII("2vT6aON0gAsny04dRYmWHj81+MDIeZYy", "uLycL");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[54]] = lIIlIIIlllIIIIlI("Ly01GypCJSpZNg05bA09By04HCtCJThZLQc4OBw9QjgkHCFCJTheIw5sJBg5B2whFj0HbCEWOws6LQ0mDSJsDSBCOyMLJEIqLQo7Bz5tWR8NIz5ZPAc+Ohw9TA==", "bLLyO");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[55]] = lIIlIIIlllIIIIll("2BaprefResL72scvj0UOmifJwvb6sCTmnXjbVe5/qXg=", "pskjS");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[56]] = lIIlIIIlllIIIIll("JPwU644/mYA=", "pXWGE");
        CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[57]] = lIIlIIIlllIIIIll("btE/rnuP4eg=", "dbuKq");
    }
    
    private static boolean lIIlIIIllllIlIIl(final int llllllllllllIllIllIIllllIIIIlIlI, final int llllllllllllIllIllIIllllIIIIlIIl) {
        return llllllllllllIllIllIIllllIIIIlIlI == llllllllllllIllIllIIllllIIIIlIIl;
    }
    
    private static String lIIlIIIlllIIIIll(final String llllllllllllIllIllIIllllIIllIlIl, final String llllllllllllIllIllIIllllIIllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIllllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllllIIllIllI.getBytes(StandardCharsets.UTF_8)), CommandDebug.llIlIIIlIlIIII[8]), "DES");
            final Cipher llllllllllllIllIllIIllllIIlllIIl = Cipher.getInstance("DES");
            llllllllllllIllIllIIllllIIlllIIl.init(CommandDebug.llIlIIIlIlIIII[3], llllllllllllIllIllIIllllIIlllIlI);
            return new String(llllllllllllIllIllIIllllIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIllllIIlllIII) {
            llllllllllllIllIllIIllllIIlllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[0]];
    }
    
    static {
        lIIlIIIllllIIIlI();
        lIIlIIIlllIllIIl();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIlIIIllllIIllI(final int llllllllllllIllIllIIlllIlllllIll) {
        return llllllllllllIllIllIIlllIlllllIll == 0;
    }
    
    private static String func_147203_d() {
        final String[] array = new String[CommandDebug.llIlIIIlIlIIII[14]];
        array[CommandDebug.llIlIIIlIlIIII[0]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[41]];
        array[CommandDebug.llIlIIIlIlIIII[2]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[42]];
        array[CommandDebug.llIlIIIlIlIIII[3]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[43]];
        array[CommandDebug.llIlIIIlIlIIII[1]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[44]];
        array[CommandDebug.llIlIIIlIlIIII[4]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[45]];
        array[CommandDebug.llIlIIIlIlIIII[5]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[46]];
        array[CommandDebug.llIlIIIlIlIIII[6]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[47]];
        array[CommandDebug.llIlIIIlIlIIII[7]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[48]];
        array[CommandDebug.llIlIIIlIlIIII[8]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[49]];
        array[CommandDebug.llIlIIIlIlIIII[9]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[50]];
        array[CommandDebug.llIlIIIlIlIIII[10]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[51]];
        array[CommandDebug.llIlIIIlIlIIII[11]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[52]];
        array[CommandDebug.llIlIIIlIlIIII[12]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[53]];
        array[CommandDebug.llIlIIIlIlIIII[13]] = CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[54]];
        final String[] llllllllllllIllIllIIllllIllIIlII = array;
        try {
            return llllllllllllIllIllIIllllIllIIlII[(int)(System.nanoTime() % llllllllllllIllIllIIllllIllIIlII.length)];
        }
        catch (Throwable llllllllllllIllIllIIllllIllIIIlI) {
            return CommandDebug.llIlIIIlIIllII[CommandDebug.llIlIIIlIlIIII[55]];
        }
    }
    
    private static String lIIlIIIlllIIIIlI(String llllllllllllIllIllIIllllIIIlIlIl, final String llllllllllllIllIllIIllllIIIllIIl) {
        llllllllllllIllIllIIllllIIIlIlIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIllllIIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIllllIIIllIII = new StringBuilder();
        final char[] llllllllllllIllIllIIllllIIIlIlll = llllllllllllIllIllIIllllIIIllIIl.toCharArray();
        int llllllllllllIllIllIIllllIIIlIllI = CommandDebug.llIlIIIlIlIIII[0];
        final char llllllllllllIllIllIIllllIIIlIIII = (Object)((String)llllllllllllIllIllIIllllIIIlIlIl).toCharArray();
        final String llllllllllllIllIllIIllllIIIIllll = (String)llllllllllllIllIllIIllllIIIlIIII.length;
        boolean llllllllllllIllIllIIllllIIIIlllI = CommandDebug.llIlIIIlIlIIII[0] != 0;
        while (lIIlIIIllllIIIll(llllllllllllIllIllIIllllIIIIlllI ? 1 : 0, (int)llllllllllllIllIllIIllllIIIIllll)) {
            final char llllllllllllIllIllIIllllIIIllIll = llllllllllllIllIllIIllllIIIlIIII[llllllllllllIllIllIIllllIIIIlllI];
            llllllllllllIllIllIIllllIIIllIII.append((char)(llllllllllllIllIllIIllllIIIllIll ^ llllllllllllIllIllIIllllIIIlIlll[llllllllllllIllIllIIllllIIIlIllI % llllllllllllIllIllIIllllIIIlIlll.length]));
            "".length();
            ++llllllllllllIllIllIIllllIIIlIllI;
            ++llllllllllllIllIllIIllllIIIIlllI;
            "".length();
            if ((0x7D ^ 0x79) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIllllIIIllIII);
    }
    
    private static boolean lIIlIIIllllIlIII(final int llllllllllllIllIllIIllllIIIIIllI, final int llllllllllllIllIllIIllllIIIIIlIl) {
        return llllllllllllIllIllIIllllIIIIIllI >= llllllllllllIllIllIIllllIIIIIlIl;
    }
}
