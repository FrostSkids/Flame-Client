// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandException;
import net.minecraft.command.WrongUsageException;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandOp extends CommandBase
{
    private static final /* synthetic */ int[] lllIIIlIIIIllI;
    private static final /* synthetic */ String[] lllIIIIllIlllI;
    
    private static String lIIlllIIlllIlIll(String llllllllllllIllIIIIIllIlIllIlllI, final String llllllllllllIllIIIIIllIlIllIllIl) {
        llllllllllllIllIIIIIllIlIllIlllI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIIllIlIllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIllIlIlllIIIl = new StringBuilder();
        final char[] llllllllllllIllIIIIIllIlIlllIIII = llllllllllllIllIIIIIllIlIllIllIl.toCharArray();
        int llllllllllllIllIIIIIllIlIllIllll = CommandOp.lllIIIlIIIIllI[0];
        final long llllllllllllIllIIIIIllIlIllIlIIl = (Object)((String)llllllllllllIllIIIIIllIlIllIlllI).toCharArray();
        final String llllllllllllIllIIIIIllIlIllIlIII = (String)llllllllllllIllIIIIIllIlIllIlIIl.length;
        short llllllllllllIllIIIIIllIlIllIIlll = (short)CommandOp.lllIIIlIIIIllI[0];
        while (lIIlllIlIIlIIlII(llllllllllllIllIIIIIllIlIllIIlll, (int)llllllllllllIllIIIIIllIlIllIlIII)) {
            final char llllllllllllIllIIIIIllIlIlllIlII = llllllllllllIllIIIIIllIlIllIlIIl[llllllllllllIllIIIIIllIlIllIIlll];
            llllllllllllIllIIIIIllIlIlllIIIl.append((char)(llllllllllllIllIIIIIllIlIlllIlII ^ llllllllllllIllIIIIIllIlIlllIIII[llllllllllllIllIIIIIllIlIllIllll % llllllllllllIllIIIIIllIlIlllIIII.length]));
            "".length();
            ++llllllllllllIllIIIIIllIlIllIllll;
            ++llllllllllllIllIIIIIllIlIllIIlll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIllIlIlllIIIl);
    }
    
    static {
        lIIlllIlIIIlllIl();
        lIIlllIIlllIllII();
    }
    
    private static boolean lIIlllIlIIlIIlII(final int llllllllllllIllIIIIIllIlIlIllIll, final int llllllllllllIllIIIIIllIlIlIllIlI) {
        return llllllllllllIllIIIIIllIlIlIllIll < llllllllllllIllIIIIIllIlIlIllIlI;
    }
    
    private static boolean lIIlllIlIIlIIIll(final int llllllllllllIllIIIIIllIlIlIlllll, final int llllllllllllIllIIIIIllIlIlIllllI) {
        return llllllllllllIllIIIIIllIlIlIlllll >= llllllllllllIllIIIIIllIlIlIllllI;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIIIIIllIllIIlIlll, final String[] llllllllllllIllIIIIIllIllIIlIIIl, final BlockPos llllllllllllIllIIIIIllIllIIlIlIl) {
        if (!lIIlllIlIIIllllI(llllllllllllIllIIIIIllIllIIlIIIl.length, CommandOp.lllIIIlIIIIllI[2])) {
            return null;
        }
        final String llllllllllllIllIIIIIllIllIIlIlII = llllllllllllIllIIIIIllIllIIlIIIl[llllllllllllIllIIIIIllIllIIlIIIl.length - CommandOp.lllIIIlIIIIllI[2]];
        final List<String> llllllllllllIllIIIIIllIllIIlIIll = (List<String>)Lists.newArrayList();
        final boolean llllllllllllIllIIIIIllIllIIIlIll;
        final double llllllllllllIllIIIIIllIllIIIllII = ((GameProfile[])(Object)(llllllllllllIllIIIIIllIllIIIlIll = (boolean)(Object)MinecraftServer.getServer().getGameProfiles())).length;
        char llllllllllllIllIIIIIllIllIIIllIl = (char)CommandOp.lllIIIlIIIIllI[0];
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!lIIlllIlIIlIIIll(llllllllllllIllIIIIIllIllIIIllIl, (int)llllllllllllIllIIIIIllIllIIIllII)) {
            final GameProfile llllllllllllIllIIIIIllIllIIlIIlI = llllllllllllIllIIIIIllIllIIIlIll[llllllllllllIllIIIIIllIllIIIllIl];
            if (lIIlllIlIIlIIIIl(MinecraftServer.getServer().getConfigurationManager().canSendCommands(llllllllllllIllIIIIIllIllIIlIIlI) ? 1 : 0) && lIIlllIlIIlIIIlI(CommandBase.doesStringStartWith(llllllllllllIllIIIIIllIllIIlIlII, llllllllllllIllIIIIIllIllIIlIIlI.getName()) ? 1 : 0)) {
                llllllllllllIllIIIIIllIllIIlIIll.add(llllllllllllIllIIIIIllIllIIlIIlI.getName());
                "".length();
            }
            ++llllllllllllIllIIIIIllIllIIIllIl;
        }
        return llllllllllllIllIIIIIllIllIIlIIll;
    }
    
    private static void lIIlllIIlllIllII() {
        (lllIIIIllIlllI = new String[CommandOp.lllIIIlIIIIllI[5]])[CommandOp.lllIIIlIIIIllI[0]] = lIIlllIIlllIlIlI("qiwpwy3vfiM=", "ZuRpL");
        CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[2]] = lIIlllIIlllIlIlI("Z3yV3jWoDAmc0/vZFbtM7pjudNnyNnOa", "xcaiK");
        CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[3]] = lIIlllIIlllIlIll("Bx0jKgUKFj1pCxRcKCYNCBcq", "drNGd");
        CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[1]] = lIIlllIIlllIlIll("BScADiMILB5NLRZmHhYhBS0eEA==", "fHmcB");
        CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[4]] = lIIlllIIlllIlIlI("r6BpNMx7Srv2KXgferOrZcGq+QVLJJ1I", "RuWkV");
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIIIIllIllIlIIIll, final String[] llllllllllllIllIIIIIllIllIlIIIlI) throws CommandException {
        if (!lIIlllIlIIIllllI(llllllllllllIllIIIIIllIllIlIIIlI.length, CommandOp.lllIIIlIIIIllI[2]) || !lIIlllIlIIIlllll(llllllllllllIllIIIIIllIllIlIIIlI[CommandOp.lllIIIlIIIIllI[0]].length())) {
            throw new WrongUsageException(CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[4]], new Object[CommandOp.lllIIIlIIIIllI[0]]);
        }
        final MinecraftServer llllllllllllIllIIIIIllIllIlIIllI = MinecraftServer.getServer();
        final GameProfile llllllllllllIllIIIIIllIllIlIIlIl = llllllllllllIllIIIIIllIllIlIIllI.getPlayerProfileCache().getGameProfileForUsername(llllllllllllIllIIIIIllIllIlIIIlI[CommandOp.lllIIIlIIIIllI[0]]);
        if (lIIlllIlIIlIIIII(llllllllllllIllIIIIIllIllIlIIlIl)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[3]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandOp.lllIIIlIIIIllI[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandOp.lllIIIlIIIIllI[0]] = llllllllllllIllIIIIIllIllIlIIIlI[CommandOp.lllIIIlIIIIllI[0]];
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        llllllllllllIllIIIIIllIllIlIIllI.getConfigurationManager().addOp(llllllllllllIllIIIIIllIllIlIIlIl);
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[1]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandOp.lllIIIlIIIIllI[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandOp.lllIIIlIIIIllI[0]] = llllllllllllIllIIIIIllIllIlIIIlI[CommandOp.lllIIIlIIIIllI[0]];
        CommandBase.notifyOperators(llllllllllllIllIIIIIllIllIlIIIll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
        "".length();
        if (null != null) {
            return;
        }
    }
    
    private static void lIIlllIlIIIlllIl() {
        (lllIIIlIIIIllI = new int[7])[0] = ((0x47 ^ 0x75 ^ (0x77 ^ 0x4D)) & (0x78 ^ 0x58 ^ (0xB8 ^ 0x90) ^ -" ".length()));
        CommandOp.lllIIIlIIIIllI[1] = "   ".length();
        CommandOp.lllIIIlIIIIllI[2] = " ".length();
        CommandOp.lllIIIlIIIIllI[3] = "  ".length();
        CommandOp.lllIIIlIIIIllI[4] = (0xA7 ^ 0xBE ^ (0x43 ^ 0x5E));
        CommandOp.lllIIIlIIIIllI[5] = (0xD ^ 0x8);
        CommandOp.lllIIIlIIIIllI[6] = (0x54 ^ 0x5C);
    }
    
    @Override
    public String getCommandName() {
        return CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[0]];
    }
    
    private static String lIIlllIIlllIlIlI(final String llllllllllllIllIIIIIllIllIIIIIll, final String llllllllllllIllIIIIIllIllIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIllIllIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIllIIIIIII.getBytes(StandardCharsets.UTF_8)), CommandOp.lllIIIlIIIIllI[6]), "DES");
            final Cipher llllllllllllIllIIIIIllIllIIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIIIIIllIllIIIIlIl.init(CommandOp.lllIIIlIIIIllI[3], llllllllllllIllIIIIIllIllIIIIllI);
            return new String(llllllllllllIllIIIIIllIllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIllIllIIIIlII) {
            llllllllllllIllIIIIIllIllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandOp.lllIIIlIIIIllI[1];
    }
    
    private static boolean lIIlllIlIIlIIIIl(final int llllllllllllIllIIIIIllIlIlIlIlII) {
        return llllllllllllIllIIIIIllIlIlIlIlII == 0;
    }
    
    private static boolean lIIlllIlIIlIIIII(final Object llllllllllllIllIIIIIllIlIlIllIII) {
        return llllllllllllIllIIIIIllIlIlIllIII == null;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIIIIllIllIlIllll) {
        return CommandOp.lllIIIIllIlllI[CommandOp.lllIIIlIIIIllI[2]];
    }
    
    private static boolean lIIlllIlIIIlllll(final int llllllllllllIllIIIIIllIlIlIlIIlI) {
        return llllllllllllIllIIIIIllIlIlIlIIlI > 0;
    }
    
    private static boolean lIIlllIlIIIllllI(final int llllllllllllIllIIIIIllIlIllIIIll, final int llllllllllllIllIIIIIllIlIllIIIlI) {
        return llllllllllllIllIIIIIllIlIllIIIll == llllllllllllIllIIIIIllIlIllIIIlI;
    }
    
    private static boolean lIIlllIlIIlIIIlI(final int llllllllllllIllIIIIIllIlIlIlIllI) {
        return llllllllllllIllIIIIIllIlIlIlIllI != 0;
    }
}
