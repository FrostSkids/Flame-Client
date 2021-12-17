// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.network.Packet;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;

public class CommandGameRule extends CommandBase
{
    private static final /* synthetic */ int[] lIllIllllIlIIl;
    private static final /* synthetic */ String[] lIllIllllIIlII;
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandGameRule.lIllIllllIlIIl[1];
    }
    
    private static boolean lIIIIIIIIlllIlIl(final int llllllllllllIllllllIIIlllIIIIIll) {
        return llllllllllllIllllllIIIlllIIIIIll == 0;
    }
    
    public static void func_175773_a(final GameRules llllllllllllIllllllIIIllllIlIlIl, final String llllllllllllIllllllIIIllllIllIII) {
        if (lIIIIIIIIlllIllI(CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[10]].equals(llllllllllllIllllllIIIllllIllIII) ? 1 : 0)) {
            int n;
            if (lIIIIIIIIlllIllI(llllllllllllIllllllIIIllllIlIlIl.getBoolean(llllllllllllIllllllIIIllllIllIII) ? 1 : 0)) {
                n = CommandGameRule.lIllIllllIlIIl[11];
                "".length();
                if (-(0xBA ^ 0xBE) >= 0) {
                    return;
                }
            }
            else {
                n = CommandGameRule.lIllIllllIlIIl[12];
            }
            final byte llllllllllllIllllllIIIllllIlIlll = (byte)n;
            final String llllllllllllIllllllIIIllllIlIIIl = (String)MinecraftServer.getServer().getConfigurationManager().func_181057_v().iterator();
            "".length();
            if (((0x54 ^ 0x45) & ~(0x38 ^ 0x29)) != 0x0) {
                return;
            }
            while (!lIIIIIIIIlllIlIl(((Iterator)llllllllllllIllllllIIIllllIlIIIl).hasNext() ? 1 : 0)) {
                final EntityPlayerMP llllllllllllIllllllIIIllllIlIllI = ((Iterator<EntityPlayerMP>)llllllllllllIllllllIIIllllIlIIIl).next();
                llllllllllllIllllllIIIllllIlIllI.playerNetServerHandler.sendPacket(new S19PacketEntityStatus(llllllllllllIllllllIIIllllIlIllI, llllllllllllIllllllIIIllllIlIlll));
            }
        }
    }
    
    private static boolean lIIIIIIIIlllIIll(final int llllllllllllIllllllIIIlllIIIIIIl) {
        return llllllllllllIllllllIIIlllIIIIIIl > 0;
    }
    
    private static boolean lIIIIIIIIlllIlll(final int llllllllllllIllllllIIIlllIIlIIII, final int llllllllllllIllllllIIIlllIIIllll) {
        return llllllllllllIllllllIIIlllIIlIIII == llllllllllllIllllllIIIlllIIIllll;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllllllIIIlllllIIlII, final String[] llllllllllllIllllllIIIlllllIIIll) throws CommandException {
        final GameRules llllllllllllIllllllIIIlllllIlIIl = this.getGameRules();
        String s;
        if (lIIIIIIIIlllIIll(llllllllllllIllllllIIIlllllIIIll.length)) {
            s = llllllllllllIllllllIIIlllllIIIll[CommandGameRule.lIllIllllIlIIl[0]];
            "".length();
            if (((131 + 66 - 72 + 116 ^ 19 + 165 - 169 + 160) & (0xF4 ^ 0xA3 ^ (0x7A ^ 0x73) ^ -" ".length())) >= "  ".length()) {
                return;
            }
        }
        else {
            s = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[1]];
        }
        final String llllllllllllIllllllIIIlllllIlIII = s;
        String buildString;
        if (lIIIIIIIIlllIlII(llllllllllllIllllllIIIlllllIIIll.length, CommandGameRule.lIllIllllIlIIl[2])) {
            buildString = CommandBase.buildString(llllllllllllIllllllIIIlllllIIIll, CommandGameRule.lIllIllllIlIIl[2]);
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            buildString = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[3]];
        }
        final String llllllllllllIllllllIIIlllllIIlll = buildString;
        switch (llllllllllllIllllllIIIlllllIIIll.length) {
            case 0: {
                llllllllllllIllllllIIIlllllIIlII.addChatMessage(new ChatComponentText(CommandBase.joinNiceString(llllllllllllIllllllIIIlllllIlIIl.getRules())));
                "".length();
                if ("  ".length() < ((0x74 ^ 0x5F) & ~(0x20 ^ 0xB))) {
                    return;
                }
                break;
            }
            case 1: {
                if (lIIIIIIIIlllIlIl(llllllllllllIllllllIIIlllllIlIIl.hasRule(llllllllllllIllllllIIIlllllIlIII) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[4]];
                    final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandGameRule.lIllIllllIlIIl[2]];
                    lllllllllllllIlIIIIIIlIlIllIIlIl[CommandGameRule.lIllIllllIlIIl[0]] = llllllllllllIllllllIIIlllllIlIII;
                    throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
                }
                final String llllllllllllIllllllIIIlllllIIllI = llllllllllllIllllllIIIlllllIlIIl.getString(llllllllllllIllllllIIIlllllIlIII);
                llllllllllllIllllllIIIlllllIIlII.addChatMessage(new ChatComponentText(llllllllllllIllllllIIIlllllIlIII).appendText(CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[5]]).appendText(llllllllllllIllllllIIIlllllIIllI));
                llllllllllllIllllllIIIlllllIIlII.setCommandStat(CommandResultStats.Type.QUERY_RESULT, llllllllllllIllllllIIIlllllIlIIl.getInt(llllllllllllIllllllIIIlllllIlIII));
                "".length();
                if ("   ".length() < ((0x24 ^ 0x33) & ~(0x2 ^ 0x15))) {
                    return;
                }
                break;
            }
            default: {
                if (lIIIIIIIIlllIllI(llllllllllllIllllllIIIlllllIlIIl.areSameType(llllllllllllIllllllIIIlllllIlIII, GameRules.ValueType.BOOLEAN_VALUE) ? 1 : 0) && lIIIIIIIIlllIlIl(CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[6]].equals(llllllllllllIllllllIIIlllllIIlll) ? 1 : 0) && lIIIIIIIIlllIlIl(CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[7]].equals(llllllllllllIllllllIIIlllllIIlll) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[8]];
                    final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandGameRule.lIllIllllIlIIl[2]];
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandGameRule.lIllIllllIlIIl[0]] = llllllllllllIllllllIIIlllllIIlll;
                    throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
                }
                llllllllllllIllllllIIIlllllIlIIl.setOrCreateGameRule(llllllllllllIllllllIIIlllllIlIII, llllllllllllIllllllIIIlllllIIlll);
                func_175773_a(llllllllllllIllllllIIIlllllIlIIl, llllllllllllIllllllIIIlllllIlIII);
                CommandBase.notifyOperators(llllllllllllIllllllIIIlllllIIlII, this, CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[9]], new Object[CommandGameRule.lIllIllllIlIIl[0]]);
                break;
            }
        }
    }
    
    private static boolean lIIIIIIIIlllIllI(final int llllllllllllIllllllIIIlllIIIIlIl) {
        return llllllllllllIllllllIIIlllIIIIlIl != 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllllllIIIllllIIllII, final String[] llllllllllllIllllllIIIllllIIIlll, final BlockPos llllllllllllIllllllIIIllllIIlIlI) {
        if (lIIIIIIIIlllIlll(llllllllllllIllllllIIIllllIIIlll.length, CommandGameRule.lIllIllllIlIIl[2])) {
            return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllllllIIIllllIIIlll, this.getGameRules().getRules());
        }
        if (lIIIIIIIIlllIlll(llllllllllllIllllllIIIllllIIIlll.length, CommandGameRule.lIllIllllIlIIl[1])) {
            final GameRules llllllllllllIllllllIIIllllIIlIIl = this.getGameRules();
            if (lIIIIIIIIlllIllI(llllllllllllIllllllIIIllllIIlIIl.areSameType(llllllllllllIllllllIIIllllIIIlll[CommandGameRule.lIllIllllIlIIl[0]], GameRules.ValueType.BOOLEAN_VALUE) ? 1 : 0)) {
                final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandGameRule.lIllIllllIlIIl[1]];
                lllllllllllllIIIIlIlllIIIllIllII[CommandGameRule.lIllIllllIlIIl[0]] = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[13]];
                lllllllllllllIIIIlIlllIIIllIllII[CommandGameRule.lIllIllllIlIIl[2]] = CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[14]];
                return CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllllllIIIllllIIIlll, lllllllllllllIIIIlIlllIIIllIllII);
            }
        }
        return null;
    }
    
    private static String lIIIIIIIIllIIlIl(final String llllllllllllIllllllIIIlllIIlIllI, final String llllllllllllIllllllIIIlllIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIlllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIlllIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIlllIIllIlI.init(CommandGameRule.lIllIllllIlIIl[1], llllllllllllIllllllIIIlllIIllIll);
            return new String(llllllllllllIllllllIIIlllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIlllIIllIIl) {
            llllllllllllIllllllIIIlllIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIIIlllIIlI() {
        (lIllIllllIlIIl = new int[16])[0] = ((90 + 219 - 136 + 51 ^ 76 + 68 - 127 + 156) & (0x83 ^ 0xA1 ^ (0xD2 ^ 0xBD) ^ -" ".length()));
        CommandGameRule.lIllIllllIlIIl[1] = "  ".length();
        CommandGameRule.lIllIllllIlIIl[2] = " ".length();
        CommandGameRule.lIllIllllIlIIl[3] = "   ".length();
        CommandGameRule.lIllIllllIlIIl[4] = (0x31 ^ 0x35);
        CommandGameRule.lIllIllllIlIIl[5] = (0x3E ^ 0x3B);
        CommandGameRule.lIllIllllIlIIl[6] = (0x3F ^ 0x39);
        CommandGameRule.lIllIllllIlIIl[7] = (0x87 ^ 0x80);
        CommandGameRule.lIllIllllIlIIl[8] = (112 + 22 - 52 + 85 ^ 47 + 16 - 32 + 144);
        CommandGameRule.lIllIllllIlIIl[9] = (0x3A ^ 0x33);
        CommandGameRule.lIllIllllIlIIl[10] = (0xDB ^ 0x8A ^ (0x2E ^ 0x75));
        CommandGameRule.lIllIllllIlIIl[11] = (0xBB ^ 0x85 ^ (0x78 ^ 0x50));
        CommandGameRule.lIllIllllIlIIl[12] = (0x18 ^ 0xF);
        CommandGameRule.lIllIllllIlIIl[13] = (0xA2 ^ 0xBD ^ (0x58 ^ 0x4C));
        CommandGameRule.lIllIllllIlIIl[14] = (0x86 ^ 0x8A);
        CommandGameRule.lIllIllllIlIIl[15] = (0xED ^ 0x81 ^ (0x5A ^ 0x3B));
    }
    
    static {
        lIIIIIIIIlllIIlI();
        lIIIIIIIIllIllII();
    }
    
    private static void lIIIIIIIIllIllII() {
        (lIllIllllIIlII = new String[CommandGameRule.lIllIllllIlIIl[15]])[CommandGameRule.lIllIllllIlIIl[0]] = lIIIIIIIIllIIIll("JOLBmBmi4hD1m8RA1Dhi5g==", "YdtGB");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[2]] = lIIIIIIIIllIIIll("ny6UcVd4Q1noDPZh60Dx3lzD2aIjA9FL", "XNNwT");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[1]] = lIIIIIIIIllIIlII("", "eNhSa");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[3]] = lIIIIIIIIllIIlII("", "ZifAO");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[4]] = lIIIIIIIIllIIIll("sse2dAYS6AnftO/fEs2G8S1eeJcg4Y+xzpRFQmlHRBc=", "ejckg");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[5]] = lIIIIIIIIllIIIll("5G4KCCvNSes=", "swRpq");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[6]] = lIIIIIIIIllIIIll("mx/DRTr5S0k=", "ySiPD");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[7]] = lIIIIIIIIllIIlIl("dsgh67nJyHo=", "zZJCt");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[8]] = lIIIIIIIIllIIlIl("MTji/LTwW6JdfznYv84DhdMwgoE56F26MnFtu3GJTfnbqtlOKChPmQ==", "TRXaa");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[9]] = lIIIIIIIIllIIlIl("xbt+QhPcK5dA0SQ47bfSJSyMVUHOuqErS1mxnc1g38E=", "zkxdV");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[10]] = lIIIIIIIIllIIlII("ISMcGxs2IjwLGiYhMQAePA==", "SFxnx");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[13]] = lIIIIIIIIllIIlIl("NguYM+XJ8bg=", "OdFpb");
        CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[14]] = lIIIIIIIIllIIlIl("8LLqedKGaLs=", "iPxOU");
    }
    
    private static boolean lIIIIIIIIllllIII(final int llllllllllllIllllllIIIlllIIIllII, final int llllllllllllIllllllIIIlllIIIlIll) {
        return llllllllllllIllllllIIIlllIIIllII < llllllllllllIllllllIIIlllIIIlIll;
    }
    
    @Override
    public String getCommandName() {
        return CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[0]];
    }
    
    private static boolean lIIIIIIIIlllIlII(final int llllllllllllIllllllIIIlllIIIlIII, final int llllllllllllIllllllIIIlllIIIIlll) {
        return llllllllllllIllllllIIIlllIIIlIII > llllllllllllIllllllIIIlllIIIIlll;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllllllIIIllllllIlII) {
        return CommandGameRule.lIllIllllIIlII[CommandGameRule.lIllIllllIlIIl[2]];
    }
    
    private static String lIIIIIIIIllIIlII(String llllllllllllIllllllIIIlllIlllIlI, final String llllllllllllIllllllIIIlllIllIlII) {
        llllllllllllIllllllIIIlllIlllIlI = new String(Base64.getDecoder().decode(llllllllllllIllllllIIIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIIlllIlllIII = new StringBuilder();
        final char[] llllllllllllIllllllIIIlllIllIlll = llllllllllllIllllllIIIlllIllIlII.toCharArray();
        int llllllllllllIllllllIIIlllIllIllI = CommandGameRule.lIllIllllIlIIl[0];
        final float llllllllllllIllllllIIIlllIllIIII = (Object)llllllllllllIllllllIIIlllIlllIlI.toCharArray();
        final boolean llllllllllllIllllllIIIlllIlIllll = llllllllllllIllllllIIIlllIllIIII.length != 0;
        char llllllllllllIllllllIIIlllIlIlllI = (char)CommandGameRule.lIllIllllIlIIl[0];
        while (lIIIIIIIIllllIII(llllllllllllIllllllIIIlllIlIlllI, llllllllllllIllllllIIIlllIlIllll ? 1 : 0)) {
            final char llllllllllllIllllllIIIlllIlllIll = llllllllllllIllllllIIIlllIllIIII[llllllllllllIllllllIIIlllIlIlllI];
            llllllllllllIllllllIIIlllIlllIII.append((char)(llllllllllllIllllllIIIlllIlllIll ^ llllllllllllIllllllIIIlllIllIlll[llllllllllllIllllllIIIlllIllIllI % llllllllllllIllllllIIIlllIllIlll.length]));
            "".length();
            ++llllllllllllIllllllIIIlllIllIllI;
            ++llllllllllllIllllllIIIlllIlIlllI;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIIlllIlllIII);
    }
    
    private static String lIIIIIIIIllIIIll(final String llllllllllllIllllllIIIlllIlIIlIl, final String llllllllllllIllllllIIIlllIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIlllIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), CommandGameRule.lIllIllllIlIIl[8]), "DES");
            final Cipher llllllllllllIllllllIIIlllIlIIlll = Cipher.getInstance("DES");
            llllllllllllIllllllIIIlllIlIIlll.init(CommandGameRule.lIllIllllIlIIl[1], llllllllllllIllllllIIIlllIlIlIII);
            return new String(llllllllllllIllllllIIIlllIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIlllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIlllIlIIllI) {
            llllllllllllIllllllIIIlllIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private GameRules getGameRules() {
        return MinecraftServer.getServer().worldServerForDimension(CommandGameRule.lIllIllllIlIIl[0]).getGameRules();
    }
}
