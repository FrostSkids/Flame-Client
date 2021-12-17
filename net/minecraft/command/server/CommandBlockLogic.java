// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import io.netty.buffer.ByteBuf;
import java.util.Date;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.command.ICommandManager;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ChatComponentText;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.CommandResultStats;
import java.text.SimpleDateFormat;
import net.minecraft.util.IChatComponent;
import net.minecraft.command.ICommandSender;

public abstract class CommandBlockLogic implements ICommandSender
{
    private /* synthetic */ String customName;
    private static final /* synthetic */ int[] lIIIlIlllIIIll;
    private /* synthetic */ boolean trackOutput;
    private /* synthetic */ IChatComponent lastOutput;
    private static final /* synthetic */ SimpleDateFormat timestampFormat;
    private final /* synthetic */ CommandResultStats resultStats;
    private /* synthetic */ int successCount;
    private static final /* synthetic */ String[] lIIIlIllIlllll;
    private /* synthetic */ String commandStored;
    
    private static void llIIIIlIIIIIIll() {
        (lIIIlIlllIIIll = new int[24])[0] = ((0x88 ^ 0xBB) & ~(0x4 ^ 0x37));
        CommandBlockLogic.lIIIlIlllIIIll[1] = " ".length();
        CommandBlockLogic.lIIIlIlllIIIll[2] = "  ".length();
        CommandBlockLogic.lIIIlIlllIIIll[3] = "   ".length();
        CommandBlockLogic.lIIIlIlllIIIll[4] = (0x6F ^ 0x54 ^ (0x4D ^ 0x72));
        CommandBlockLogic.lIIIlIlllIIIll[5] = (58 + 2 + 75 + 16 ^ 32 + 38 + 63 + 13);
        CommandBlockLogic.lIIIlIlllIIIll[6] = (0x53 ^ 0x55);
        CommandBlockLogic.lIIIlIlllIIIll[7] = (0xA0 ^ 0xA7);
        CommandBlockLogic.lIIIlIlllIIIll[8] = (0x3E ^ 0x36);
        CommandBlockLogic.lIIIlIlllIIIll[9] = (0x98 ^ 0x91);
        CommandBlockLogic.lIIIlIlllIIIll[10] = (0x26 ^ 0x2C);
        CommandBlockLogic.lIIIlIlllIIIll[11] = (0xC6 ^ 0x99 ^ (0x76 ^ 0x22));
        CommandBlockLogic.lIIIlIlllIIIll[12] = (0xC3 ^ 0xC4 ^ (0x21 ^ 0x2A));
        CommandBlockLogic.lIIIlIlllIIIll[13] = (0x32 ^ 0x52 ^ (0xE2 ^ 0x8F));
        CommandBlockLogic.lIIIlIlllIIIll[14] = (0x45 ^ 0x4B);
        CommandBlockLogic.lIIIlIlllIIIll[15] = (0x95 ^ 0x9A);
        CommandBlockLogic.lIIIlIlllIIIll[16] = (0xA0 ^ 0xB0);
        CommandBlockLogic.lIIIlIlllIIIll[17] = (0x7F ^ 0x11 ^ 65 + 52 - 69 + 79);
        CommandBlockLogic.lIIIlIlllIIIll[18] = (0x6F ^ 0x69 ^ (0xB2 ^ 0xA6));
        CommandBlockLogic.lIIIlIlllIIIll[19] = (0x8 ^ 0x66 ^ (0xC2 ^ 0xBF));
        CommandBlockLogic.lIIIlIlllIIIll[20] = (0x15 ^ 0x1);
        CommandBlockLogic.lIIIlIlllIIIll[21] = (0x54 ^ 0x71 ^ (0xB9 ^ 0x89));
        CommandBlockLogic.lIIIlIlllIIIll[22] = (0x80 ^ 0x98 ^ (0x3F ^ 0x31));
        CommandBlockLogic.lIIIlIlllIIIll[23] = (2 + 94 + 9 + 26 ^ 137 + 86 - 98 + 23);
    }
    
    public boolean tryOpenEditCommandBlock(final EntityPlayer lllllllllllllIlIIIIlIlIIIlIlIIlI) {
        if (llIIIIlIIIIIlll(lllllllllllllIlIIIIlIlIIIlIlIIlI.capabilities.isCreativeMode ? 1 : 0)) {
            return CommandBlockLogic.lIIIlIlllIIIll[0] != 0;
        }
        if (llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIIlIlIIlI.getEntityWorld().isRemote ? 1 : 0)) {
            lllllllllllllIlIIIIlIlIIIlIlIIlI.openEditCommandBlock(this);
        }
        return CommandBlockLogic.lIIIlIlllIIIll[1] != 0;
    }
    
    @Override
    public String getName() {
        return this.customName;
    }
    
    public abstract void updateCommand();
    
    private static boolean llIIIIlIIIIIlII(final Object lllllllllllllIlIIIIlIlIIIIIIIIII) {
        return lllllllllllllIlIIIIlIlIIIIIIIIII != null;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }
    
    private static String llIIIIIlllllIIl(final String lllllllllllllIlIIIIlIlIIIIlllIII, final String lllllllllllllIlIIIIlIlIIIIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIlIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlIlIIIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlIlIIIIlllIlI.init(CommandBlockLogic.lIIIlIlllIIIll[2], lllllllllllllIlIIIIlIlIIIIlllIll);
            return new String(lllllllllllllIlIIIIlIlIIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIlIIIIlllIIl) {
            lllllllllllllIlIIIIlIlIIIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    public CommandResultStats getCommandResultStats() {
        return this.resultStats;
    }
    
    private static boolean llIIIIlIIIIlIII(final int lllllllllllllIlIIIIlIlIIIIIlIIII, final int lllllllllllllIlIIIIlIlIIIIIIlllI) {
        return lllllllllllllIlIIIIlIlIIIIIlIIII < lllllllllllllIlIIIIlIlIIIIIIlllI;
    }
    
    private static void llIIIIIlllllIll() {
        (lIIIlIllIlllll = new String[CommandBlockLogic.lIIIlIlllIIIll[23]])[CommandBlockLogic.lIIIlIlllIIIll[0]] = llIIIIIlllllIII("ECVKKiViHgM=", "XmpGH");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[1]] = llIIIIIlllllIII("", "sjMOO");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[2]] = llIIIIIlllllIIl("2XS7vyKJYm8=", "seFmm");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[3]] = llIIIIIlllllIII("JwI+GAYKCQ==", "dmSug");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[4]] = llIIIIIlllllIlI("7JFWLFRv3YDgOn+JAIQPNg==", "KSIsQ");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[5]] = llIIIIIlllllIII("KhIDGQQEKREADg==", "igpmk");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[6]] = llIIIIIlllllIIl("pJ3c+TIpwBi0XWOPdQBYIQ==", "XKWys");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[7]] = llIIIIIlllllIlI("7IBJqeQDPMridQpPRSBrFQ==", "MaSSH");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[8]] = llIIIIIlllllIII("EjwhJRY/Nw==", "QSLHw");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[9]] = llIIIIIlllllIIl("q4ZkuFcmVxH3dGYv769COg==", "bDPzl");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[10]] = llIIIIIlllllIII("JiQGATkIHxQYMw==", "eQuuV");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[11]] = llIIIIIlllllIIl("Hg2zXnBiYjwHsS11f35I9Q==", "QBswq");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[12]] = llIIIIIlllllIlI("QjpbV85E+zpebbYHGITVTQ==", "GZqTH");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[13]] = llIIIIIlllllIII("MTEbCT4qNg4aIBE=", "eCzjU");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[14]] = llIIIIIlllllIlI("dprrnXS6XxAHvEjS2GmUPA==", "SWtzm");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[15]] = llIIIIIlllllIII("NDYyEAoNIzERMQ==", "xWAdE");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[16]] = llIIIIIlllllIII("EzQoNxwiJSMzSTUjIDkIOChtNgU5LyY=", "VLMTi");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[17]] = llIIIIIlllllIII("OjomIAgXMWs5Blk3Lm0MATAoOB0cMQ==", "yUKMi");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[18]] = llIIIIIlllllIIl("Xha+DMvKcMg=", "zaUMA");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[19]] = llIIIIIlllllIII("NwQDMA==", "yenUi");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[20]] = llIIIIIlllllIII("IQ==", "zEdQq");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[21]] = llIIIIIlllllIlI("+PXy1eO3QLQ=", "atBQm");
        CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[22]] = llIIIIIlllllIlI("5FZSTfCVMU24OgubGqe2xsiZidfEAQQF", "kmDYT");
    }
    
    public String getCommand() {
        return this.commandStored;
    }
    
    public CommandBlockLogic() {
        this.trackOutput = (CommandBlockLogic.lIIIlIlllIIIll[1] != 0);
        this.lastOutput = null;
        this.commandStored = CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[1]];
        this.customName = CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[2]];
        this.resultStats = new CommandResultStats();
    }
    
    public int getSuccessCount() {
        return this.successCount;
    }
    
    public void setCommand(final String lllllllllllllIlIIIIlIlIIlIIlllII) {
        this.commandStored = lllllllllllllIlIIIIlIlIIlIIlllII;
        this.successCount = CommandBlockLogic.lIIIlIlllIIIll[0];
    }
    
    private static String llIIIIIlllllIII(String lllllllllllllIlIIIIlIlIIIIlIlIII, final String lllllllllllllIlIIIIlIlIIIIlIIlll) {
        lllllllllllllIlIIIIlIlIIIIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlIlIIIIlIIllI = new StringBuilder();
        final char[] lllllllllllllIlIIIIlIlIIIIlIIlIl = lllllllllllllIlIIIIlIlIIIIlIIlll.toCharArray();
        int lllllllllllllIlIIIIlIlIIIIlIIlII = CommandBlockLogic.lIIIlIlllIIIll[0];
        final float lllllllllllllIlIIIIlIlIIIIIllllI = (Object)lllllllllllllIlIIIIlIlIIIIlIlIII.toCharArray();
        final String lllllllllllllIlIIIIlIlIIIIIlllII = (String)lllllllllllllIlIIIIlIlIIIIIllllI.length;
        byte lllllllllllllIlIIIIlIlIIIIIllIll = (byte)CommandBlockLogic.lIIIlIlllIIIll[0];
        while (llIIIIlIIIIlIII(lllllllllllllIlIIIIlIlIIIIIllIll, (int)lllllllllllllIlIIIIlIlIIIIIlllII)) {
            final char lllllllllllllIlIIIIlIlIIIIlIlIIl = lllllllllllllIlIIIIlIlIIIIIllllI[lllllllllllllIlIIIIlIlIIIIIllIll];
            lllllllllllllIlIIIIlIlIIIIlIIllI.append((char)(lllllllllllllIlIIIIlIlIIIIlIlIIl ^ lllllllllllllIlIIIIlIlIIIIlIIlIl[lllllllllllllIlIIIIlIlIIIIlIIlII % lllllllllllllIlIIIIlIlIIIIlIIlIl.length]));
            "".length();
            ++lllllllllllllIlIIIIlIlIIIIlIIlII;
            ++lllllllllllllIlIIIIlIlIIIIIllIll;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlIlIIIIlIIllI);
    }
    
    @Override
    public void setCommandStat(final CommandResultStats.Type lllllllllllllIlIIIIlIlIIIllIlIIl, final int lllllllllllllIlIIIIlIlIIIllIlIII) {
        this.resultStats.func_179672_a(this, lllllllllllllIlIIIIlIlIIIllIlIIl, lllllllllllllIlIIIIlIlIIIllIlIII);
    }
    
    static {
        llIIIIlIIIIIIll();
        llIIIIIlllllIll();
        timestampFormat = new SimpleDateFormat(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[0]]);
    }
    
    public void setTrackOutput(final boolean lllllllllllllIlIIIIlIlIIIlIllIIl) {
        this.trackOutput = lllllllllllllIlIIIIlIlIIIlIllIIl;
    }
    
    public abstract int func_145751_f();
    
    public IChatComponent getLastOutput() {
        return this.lastOutput;
    }
    
    private static String llIIIIIlllllIlI(final String lllllllllllllIlIIIIlIlIIIlIIIlIl, final String lllllllllllllIlIIIIlIlIIIlIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIlIIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), CommandBlockLogic.lIIIlIlllIIIll[8]), "DES");
            final Cipher lllllllllllllIlIIIIlIlIIIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlIlIIIlIIIlll.init(CommandBlockLogic.lIIIlIlllIIIll[2], lllllllllllllIlIIIIlIlIIIlIIlIII);
            return new String(lllllllllllllIlIIIIlIlIIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIlIIIlIIIllI) {
            lllllllllllllIlIIIIlIlIIIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    public void trigger(final World lllllllllllllIlIIIIlIlIIlIIlIIII) {
        if (llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIIlIIII.isRemote ? 1 : 0)) {
            this.successCount = CommandBlockLogic.lIIIlIlllIIIll[0];
        }
        final MinecraftServer lllllllllllllIlIIIIlIlIIlIIIllll = MinecraftServer.getServer();
        if (llIIIIlIIIIIlII(lllllllllllllIlIIIIlIlIIlIIIllll) && llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIIIllll.isAnvilFileSet() ? 1 : 0) && llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIIIllll.isCommandBlockEnabled() ? 1 : 0)) {
            final ICommandManager lllllllllllllIlIIIIlIlIIlIIIlllI = lllllllllllllIlIIIIlIlIIlIIIllll.getCommandManager();
            try {
                this.lastOutput = null;
                this.successCount = lllllllllllllIlIIIIlIlIIlIIIlllI.executeCommand(this, this.commandStored);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                return;
            }
            catch (Throwable lllllllllllllIlIIIIlIlIIlIIIllIl) {
                final CrashReport lllllllllllllIlIIIIlIlIIlIIIllII = CrashReport.makeCrashReport(lllllllllllllIlIIIIlIlIIlIIIllIl, CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[16]]);
                final CrashReportCategory lllllllllllllIlIIIIlIlIIlIIIlIll = lllllllllllllIlIIIIlIlIIlIIIllII.makeCategory(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[17]]);
                lllllllllllllIlIIIIlIlIIlIIIlIll.addCrashSectionCallable(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[18]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return CommandBlockLogic.this.getCommand();
                    }
                });
                lllllllllllllIlIIIIlIlIIlIIIlIll.addCrashSectionCallable(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[19]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return CommandBlockLogic.this.getName();
                    }
                });
                throw new ReportedException(lllllllllllllIlIIIIlIlIIlIIIllII);
            }
        }
        this.successCount = CommandBlockLogic.lIIIlIlllIIIll[0];
    }
    
    public void readDataFromNBT(final NBTTagCompound lllllllllllllIlIIIIlIlIIlIlIlIIl) {
        this.commandStored = lllllllllllllIlIIIIlIlIIlIlIlIIl.getString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[8]]);
        this.successCount = lllllllllllllIlIIIIlIlIIlIlIlIIl.getInteger(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[9]]);
        if (llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIlIlIIl.hasKey(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[10]], CommandBlockLogic.lIIIlIlllIIIll[8]) ? 1 : 0)) {
            this.customName = lllllllllllllIlIIIIlIlIIlIlIlIIl.getString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[11]]);
        }
        if (llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIlIlIIl.hasKey(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[12]], CommandBlockLogic.lIIIlIlllIIIll[1]) ? 1 : 0)) {
            this.trackOutput = lllllllllllllIlIIIIlIlIIlIlIlIIl.getBoolean(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[13]]);
        }
        if (llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIlIlIlIIl.hasKey(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[14]], CommandBlockLogic.lIIIlIlllIIIll[8]) ? 1 : 0) && llIIIIlIIIIIlIl(this.trackOutput ? 1 : 0)) {
            this.lastOutput = IChatComponent.Serializer.jsonToComponent(lllllllllllllIlIIIIlIlIIlIlIlIIl.getString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[15]]));
        }
        this.resultStats.readStatsFromNBT(lllllllllllllIlIIIIlIlIIlIlIlIIl);
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int lllllllllllllIlIIIIlIlIIlIlIIlII, final String lllllllllllllIlIIIIlIlIIlIlIIIll) {
        if (llIIIIlIIIIIllI(lllllllllllllIlIIIIlIlIIlIlIIlII, CommandBlockLogic.lIIIlIlllIIIll[2])) {
            return CommandBlockLogic.lIIIlIlllIIIll[1] != 0;
        }
        return CommandBlockLogic.lIIIlIlllIIIll[0] != 0;
    }
    
    public void setName(final String lllllllllllllIlIIIIlIlIIIllllIlI) {
        this.customName = lllllllllllllIlIIIIlIlIIIllllIlI;
    }
    
    @Override
    public boolean sendCommandFeedback() {
        final MinecraftServer lllllllllllllIlIIIIlIlIIIllIllll = MinecraftServer.getServer();
        if (llIIIIlIIIIIlII(lllllllllllllIlIIIIlIlIIIllIllll) && llIIIIlIIIIIlIl(lllllllllllllIlIIIIlIlIIIllIllll.isAnvilFileSet() ? 1 : 0) && llIIIIlIIIIIlll(lllllllllllllIlIIIIlIlIIIllIllll.worldServers[CommandBlockLogic.lIIIlIlllIIIll[0]].getGameRules().getBoolean(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[22]]) ? 1 : 0)) {
            return CommandBlockLogic.lIIIlIlllIIIll[0] != 0;
        }
        return CommandBlockLogic.lIIIlIlllIIIll[1] != 0;
    }
    
    public void writeDataToNBT(final NBTTagCompound lllllllllllllIlIIIIlIlIIlIlIllll) {
        lllllllllllllIlIIIIlIlIIlIlIllll.setString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[3]], this.commandStored);
        lllllllllllllIlIIIIlIlIIlIlIllll.setInteger(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[4]], this.successCount);
        lllllllllllllIlIIIIlIlIIlIlIllll.setString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[5]], this.customName);
        lllllllllllllIlIIIIlIlIIlIlIllll.setBoolean(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[6]], this.trackOutput);
        if (llIIIIlIIIIIlII(this.lastOutput) && llIIIIlIIIIIlIl(this.trackOutput ? 1 : 0)) {
            lllllllllllllIlIIIIlIlIIlIlIllll.setString(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[7]], IChatComponent.Serializer.componentToJson(this.lastOutput));
        }
        this.resultStats.writeStatsToNBT(lllllllllllllIlIIIIlIlIIlIlIllll);
    }
    
    @Override
    public void addChatMessage(final IChatComponent lllllllllllllIlIIIIlIlIIIlllIIlI) {
        if (llIIIIlIIIIIlIl(this.trackOutput ? 1 : 0) && llIIIIlIIIIIlII(this.getEntityWorld()) && llIIIIlIIIIIlll(this.getEntityWorld().isRemote ? 1 : 0)) {
            this.lastOutput = new ChatComponentText(String.valueOf(new StringBuilder(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[20]]).append(CommandBlockLogic.timestampFormat.format(new Date())).append(CommandBlockLogic.lIIIlIllIlllll[CommandBlockLogic.lIIIlIlllIIIll[21]]))).appendSibling(lllllllllllllIlIIIIlIlIIIlllIIlI);
            this.updateCommand();
        }
    }
    
    private static boolean llIIIIlIIIIIllI(final int lllllllllllllIlIIIIlIlIIIIIIIlll, final int lllllllllllllIlIIIIlIlIIIIIIIlIl) {
        return lllllllllllllIlIIIIlIlIIIIIIIlll <= lllllllllllllIlIIIIlIlIIIIIIIlIl;
    }
    
    public abstract void func_145757_a(final ByteBuf p0);
    
    private static boolean llIIIIlIIIIIlll(final int lllllllllllllIlIIIIlIIlllllllIIl) {
        return lllllllllllllIlIIIIlIIlllllllIIl == 0;
    }
    
    public void setLastOutput(final IChatComponent lllllllllllllIlIIIIlIlIIIlIlllll) {
        this.lastOutput = lllllllllllllIlIIIIlIlIIIlIlllll;
    }
    
    public boolean shouldTrackOutput() {
        return this.trackOutput;
    }
    
    private static boolean llIIIIlIIIIIlIl(final int lllllllllllllIlIIIIlIIlllllllIll) {
        return lllllllllllllIlIIIIlIIlllllllIll != 0;
    }
}
