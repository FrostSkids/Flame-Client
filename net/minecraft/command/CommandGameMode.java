// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.WorldSettings;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;

public class CommandGameMode extends CommandBase
{
    private static final /* synthetic */ int[] llIlIIIlIIllll;
    private static final /* synthetic */ String[] llIlIIIlIIlllI;
    
    static {
        lIIlIIIlllIllIlI();
        lIIlIIIlllIllIII();
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIllIlIIIIIIllIIII, final String[] llllllllllllIllIllIlIIIIIIllIlIl) throws CommandException {
        if (lIIlIIIlllIllIll(llllllllllllIllIllIlIIIIIIllIlIl.length)) {
            throw new WrongUsageException(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[1]], new Object[CommandGameMode.llIlIIIlIIllll[0]]);
        }
        final WorldSettings.GameType llllllllllllIllIllIlIIIIIIllIlII = this.getGameModeFromCommand(llllllllllllIllIllIlIIIIIIllIIII, llllllllllllIllIllIlIIIIIIllIlIl[CommandGameMode.llIlIIIlIIllll[0]]);
        EntityPlayer entityPlayer;
        if (lIIlIIIlllIlllII(llllllllllllIllIllIlIIIIIIllIlIl.length, CommandGameMode.llIlIIIlIIllll[1])) {
            entityPlayer = CommandBase.getPlayer(llllllllllllIllIllIlIIIIIIllIIII, llllllllllllIllIllIlIIIIIIllIlIl[CommandGameMode.llIlIIIlIIllll[2]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            entityPlayer = CommandBase.getCommandSenderAsPlayer(llllllllllllIllIllIlIIIIIIllIIII);
        }
        final EntityPlayer llllllllllllIllIllIlIIIIIIllIIll = entityPlayer;
        llllllllllllIllIllIlIIIIIIllIIll.setGameType(llllllllllllIllIllIlIIIIIIllIlII);
        llllllllllllIllIllIlIIIIIIllIIll.fallDistance = 0.0f;
        if (lIIlIIIlllIlllIl(llllllllllllIllIllIlIIIIIIllIIII.getEntityWorld().getGameRules().getBoolean(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[3]]) ? 1 : 0)) {
            llllllllllllIllIllIlIIIIIIllIIll.addChatMessage(new ChatComponentTranslation(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[4]], new Object[CommandGameMode.llIlIIIlIIllll[0]]));
        }
        final IChatComponent llllllllllllIllIllIlIIIIIIllIIlI = new ChatComponentTranslation(String.valueOf(new StringBuilder(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[5]]).append(llllllllllllIllIllIlIIIIIIllIlII.getName())), new Object[CommandGameMode.llIlIIIlIIllll[0]]);
        if (lIIlIIIlllIllllI(llllllllllllIllIllIlIIIIIIllIIll, llllllllllllIllIllIlIIIIIIllIIII)) {
            final int lllllllllllllIIIIlIlllIIIIlllIIl = CommandGameMode.llIlIIIlIIllll[2];
            final String lllllllllllllIIIIlIlllIIIIlllIII = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[6]];
            final Object[] lllllllllllllIIIIlIlllIIIIllIllI = new Object[CommandGameMode.llIlIIIlIIllll[1]];
            lllllllllllllIIIIlIlllIIIIllIllI[CommandGameMode.llIlIIIlIIllll[0]] = llllllllllllIllIllIlIIIIIIllIIll.getName();
            lllllllllllllIIIIlIlllIIIIllIllI[CommandGameMode.llIlIIIlIIllll[2]] = llllllllllllIllIllIlIIIIIIllIIlI;
            CommandBase.notifyOperators(llllllllllllIllIllIlIIIIIIllIIII, this, lllllllllllllIIIIlIlllIIIIlllIIl, lllllllllllllIIIIlIlllIIIIlllIII, lllllllllllllIIIIlIlllIIIIllIllI);
            "".length();
            if (((95 + 38 - 17 + 49 ^ 61 + 114 - 165 + 166) & (0x15 ^ 0x65 ^ (0x2C ^ 0x49) ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            final int lllllllllllllIIIIlIlllIIIIlllIIl2 = CommandGameMode.llIlIIIlIIllll[2];
            final String lllllllllllllIIIIlIlllIIIIlllIII2 = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[7]];
            final Object[] lllllllllllllIIIIlIlllIIIIllIllI2 = new Object[CommandGameMode.llIlIIIlIIllll[2]];
            lllllllllllllIIIIlIlllIIIIllIllI2[CommandGameMode.llIlIIIlIIllll[0]] = llllllllllllIllIllIlIIIIIIllIIlI;
            CommandBase.notifyOperators(llllllllllllIllIllIlIIIIIIllIIII, this, lllllllllllllIIIIlIlllIIIIlllIIl2, lllllllllllllIIIIlIlllIIIIlllIII2, lllllllllllllIIIIlIlllIIIIllIllI2);
        }
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandGameMode.llIlIIIlIIllll[1];
    }
    
    private static boolean lIIlIIIllllIIIII(final int llllllllllllIllIllIIlllllllIIlII, final int llllllllllllIllIllIIlllllllIIIll) {
        return llllllllllllIllIllIIlllllllIIlII == llllllllllllIllIllIIlllllllIIIll;
    }
    
    private static void lIIlIIIlllIllIII() {
        (llIlIIIlIIlllI = new String[CommandGameMode.llIlIIIlIIllll[16]])[CommandGameMode.llIlIIIlIIllll[0]] = lIIlIIIlllIlIlIl("IBYcCgMoExQ=", "Gwqon");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[2]] = lIIlIIIlllIlIlIl("FQwgPAMYBz5/BRcOKDwNEgZjJBEXBCg=", "vcMQb");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[1]] = lIIlIIIlllIlIllI("1yjEZjyl37LnnkICJka2K6cb0bRiDKUr", "mzbyZ");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[3]] = lIIlIIIlllIlIlIl("Ii46IRk+JjkkNDUNMSA+Myo3Lg==", "QKTEZ");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[4]] = lIIlIIIlllIlIlll("vAkQZKo+Lmlt2d2Y30m0tnesSykUkwCP", "suzCj");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[5]] = lIIlIIIlllIlIlIl("NSk8Iz49LDRo", "RHQFs");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[6]] = lIIlIIIlllIlIlll("6mbR87+QwQTLcnuUOSorRmACDJTALZ4lFnDW+F2j1xY=", "RsSzj");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[7]] = lIIlIIIlllIlIlIl("FyEVDwwaKgtMChUjHQ8CECtWERgXLR0RHlo9HQ4L", "tNxbm");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[8]] = lIIlIIIlllIlIllI("UwxbfG1ij+g=", "gSttE");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[9]] = lIIlIIIlllIlIlll("lcmu4twO0CE=", "OYeat");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[10]] = lIIlIIIlllIlIlll("uIL73IBjwDM=", "CCxRW");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[11]] = lIIlIIIlllIlIlll("MQUkQ/Im2r8=", "uImwo");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[12]] = lIIlIIIlllIlIllI("bPzUGbbYVLElaPbb5Wo38g==", "ipzCU");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[13]] = lIIlIIIlllIlIlIl("FSgJBCQfLAk=", "vZleP");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[14]] = lIIlIIIlllIlIlll("D5bDdq6zkSAnHtO1CXmH9A==", "cJVIQ");
        CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[15]] = lIIlIIIlllIlIlIl("GxkBFzUJHQsG", "hidtA");
    }
    
    private static String lIIlIIIlllIlIllI(final String llllllllllllIllIllIIlllllllIlIlI, final String llllllllllllIllIllIIlllllllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlllllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlllllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIlllllllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIlllllllIlllI.init(CommandGameMode.llIlIIIlIIllll[1], llllllllllllIllIllIIlllllllIllll);
            return new String(llllllllllllIllIllIIlllllllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlllllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlllllllIllIl) {
            llllllllllllIllIllIIlllllllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIlllIlllll(final int llllllllllllIllIllIIllllllIlIIll) {
        return llllllllllllIllIllIIllllllIlIIll == 0;
    }
    
    private static String lIIlIIIlllIlIlll(final String llllllllllllIllIllIlIIIIIIIIllll, final String llllllllllllIllIllIlIIIIIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIIIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), CommandGameMode.llIlIIIlIIllll[8]), "DES");
            final Cipher llllllllllllIllIllIlIIIIIIIlIIll = Cipher.getInstance("DES");
            llllllllllllIllIllIlIIIIIIIlIIll.init(CommandGameMode.llIlIIIlIIllll[1], llllllllllllIllIllIlIIIIIIIlIlII);
            return new String(llllllllllllIllIllIlIIIIIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIIIIIIlIIlI) {
            llllllllllllIllIllIlIIIIIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIllIllIlIIIIIIIllIll, final int llllllllllllIllIllIlIIIIIIIllIlI) {
        if (lIIlIIIllllIIIII(llllllllllllIllIllIlIIIIIIIllIlI, CommandGameMode.llIlIIIlIIllll[2])) {
            return CommandGameMode.llIlIIIlIIllll[2] != 0;
        }
        return CommandGameMode.llIlIIIlIIllll[0] != 0;
    }
    
    private static void lIIlIIIlllIllIlI() {
        (llIlIIIlIIllll = new int[17])[0] = ((0xD9 ^ 0x80) & ~(0xF4 ^ 0xAD));
        CommandGameMode.llIlIIIlIIllll[1] = "  ".length();
        CommandGameMode.llIlIIIlIIllll[2] = " ".length();
        CommandGameMode.llIlIIIlIIllll[3] = "   ".length();
        CommandGameMode.llIlIIIlIIllll[4] = (0x62 ^ 0x66);
        CommandGameMode.llIlIIIlIIllll[5] = (105 + 122 - 167 + 126 ^ 59 + 6 + 86 + 40);
        CommandGameMode.llIlIIIlIIllll[6] = (0x24 ^ 0x20 ^ "  ".length());
        CommandGameMode.llIlIIIlIIllll[7] = (0x5E ^ 0x59);
        CommandGameMode.llIlIIIlIIllll[8] = (0x39 ^ 0x3D ^ (0x4D ^ 0x41));
        CommandGameMode.llIlIIIlIIllll[9] = (0x34 ^ 0x30 ^ (0x33 ^ 0x3E));
        CommandGameMode.llIlIIIlIIllll[10] = (0xB7 ^ 0x88 ^ (0x3 ^ 0x36));
        CommandGameMode.llIlIIIlIIllll[11] = (28 + 158 - 49 + 25 ^ 13 + 89 + 20 + 47);
        CommandGameMode.llIlIIIlIIllll[12] = (0x19 ^ 0x15);
        CommandGameMode.llIlIIIlIIllll[13] = (19 + 7 + 114 + 18 ^ 69 + 112 - 111 + 77);
        CommandGameMode.llIlIIIlIIllll[14] = (0xBE ^ 0x83 ^ (0x80 ^ 0xB3));
        CommandGameMode.llIlIIIlIIllll[15] = (46 + 110 - 119 + 132 ^ 9 + 42 + 14 + 101);
        CommandGameMode.llIlIIIlIIllll[16] = (123 + 135 - 171 + 56 ^ 7 + 19 + 71 + 62);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIllIlIIIIIIlIIIll, final String[] llllllllllllIllIllIlIIIIIIIlllll, final BlockPos llllllllllllIllIllIlIIIIIIlIIIIl) {
        List<String> list;
        if (lIIlIIIllllIIIII(llllllllllllIllIllIlIIIIIIIlllll.length, CommandGameMode.llIlIIIlIIllll[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandGameMode.llIlIIIlIIllll[4]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandGameMode.llIlIIIlIIllll[0]] = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[12]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandGameMode.llIlIIIlIIllll[2]] = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[13]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandGameMode.llIlIIIlIIllll[1]] = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[14]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandGameMode.llIlIIIlIIllll[3]] = CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[15]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIllIlIIIIIIIlllll, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (((" ".length() ^ (0x27 ^ 0x3C)) & (0x3A ^ 0x30 ^ (0x30 ^ 0x20) ^ -" ".length())) == " ".length()) {
                return null;
            }
        }
        else if (lIIlIIIllllIIIII(llllllllllllIllIllIlIIIIIIIlllll.length, CommandGameMode.llIlIIIlIIllll[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIllIlIIIIIIIlllll, this.getListOfPlayerUsernames());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIlIIIlllIllllI(final Object llllllllllllIllIllIIllllllIllIII, final Object llllllllllllIllIllIIllllllIlIlll) {
        return llllllllllllIllIllIIllllllIllIII != llllllllllllIllIllIIllllllIlIlll;
    }
    
    private static String lIIlIIIlllIlIlIl(String llllllllllllIllIllIIllllllllllII, final String llllllllllllIllIllIlIIIIIIIIIIII) {
        llllllllllllIllIllIIllllllllllII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIllllllllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIllllllllllll = new StringBuilder();
        final char[] llllllllllllIllIllIIlllllllllllI = llllllllllllIllIllIlIIIIIIIIIIII.toCharArray();
        int llllllllllllIllIllIIllllllllllIl = CommandGameMode.llIlIIIlIIllll[0];
        final int llllllllllllIllIllIIllllllllIlll = (Object)((String)llllllllllllIllIllIIllllllllllII).toCharArray();
        final long llllllllllllIllIllIIllllllllIllI = llllllllllllIllIllIIllllllllIlll.length;
        Exception llllllllllllIllIllIIllllllllIlIl = (Exception)CommandGameMode.llIlIIIlIIllll[0];
        while (lIIlIIIllllIIIIl((int)llllllllllllIllIllIIllllllllIlIl, (int)llllllllllllIllIllIIllllllllIllI)) {
            final char llllllllllllIllIllIlIIIIIIIIIIlI = llllllllllllIllIllIIllllllllIlll[llllllllllllIllIllIIllllllllIlIl];
            llllllllllllIllIllIIllllllllllll.append((char)(llllllllllllIllIllIlIIIIIIIIIIlI ^ llllllllllllIllIllIIlllllllllllI[llllllllllllIllIllIIllllllllllIl % llllllllllllIllIllIIlllllllllllI.length]));
            "".length();
            ++llllllllllllIllIllIIllllllllllIl;
            ++llllllllllllIllIllIIllllllllIlIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIllllllllllll);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIllIlIIIIIIlllllI) {
        return CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[2]];
    }
    
    private static boolean lIIlIIIllllIIIIl(final int llllllllllllIllIllIIllllllIlllII, final int llllllllllllIllIllIIllllllIllIll) {
        return llllllllllllIllIllIIllllllIlllII < llllllllllllIllIllIIllllllIllIll;
    }
    
    private static boolean lIIlIIIlllIllIll(final int llllllllllllIllIllIIllllllIlIIIl) {
        return llllllllllllIllIllIIllllllIlIIIl <= 0;
    }
    
    protected WorldSettings.GameType getGameModeFromCommand(final ICommandSender llllllllllllIllIllIlIIIIIIlIlIIl, final String llllllllllllIllIllIlIIIIIIlIIlll) throws NumberInvalidException, CommandException {
        WorldSettings.GameType gameType;
        if (lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(WorldSettings.GameType.SURVIVAL.getName()) ? 1 : 0) && lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[8]]) ? 1 : 0)) {
            if (lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(WorldSettings.GameType.CREATIVE.getName()) ? 1 : 0) && lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[9]]) ? 1 : 0)) {
                if (lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(WorldSettings.GameType.ADVENTURE.getName()) ? 1 : 0) && lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[10]]) ? 1 : 0)) {
                    if (lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(WorldSettings.GameType.SPECTATOR.getName()) ? 1 : 0) && lIIlIIIlllIlllll(llllllllllllIllIllIlIIIIIIlIIlll.equalsIgnoreCase(CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[11]]) ? 1 : 0)) {
                        gameType = WorldSettings.getGameTypeById(CommandBase.parseInt(llllllllllllIllIllIlIIIIIIlIIlll, CommandGameMode.llIlIIIlIIllll[0], WorldSettings.GameType.values().length - CommandGameMode.llIlIIIlIIllll[1]));
                        "".length();
                        if ((0xFF ^ 0xB7 ^ (0x72 ^ 0x3E)) == 0x0) {
                            return null;
                        }
                    }
                    else {
                        gameType = WorldSettings.GameType.SPECTATOR;
                        "".length();
                        if (" ".length() == "   ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    gameType = WorldSettings.GameType.ADVENTURE;
                    "".length();
                    if (-"   ".length() > 0) {
                        return null;
                    }
                }
            }
            else {
                gameType = WorldSettings.GameType.CREATIVE;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
        }
        else {
            gameType = WorldSettings.GameType.SURVIVAL;
        }
        return gameType;
    }
    
    private static boolean lIIlIIIlllIlllII(final int llllllllllllIllIllIIlllllllIIIII, final int llllllllllllIllIllIIllllllIlllll) {
        return llllllllllllIllIllIIlllllllIIIII >= llllllllllllIllIllIIllllllIlllll;
    }
    
    private static boolean lIIlIIIlllIlllIl(final int llllllllllllIllIllIIllllllIlIlIl) {
        return llllllllllllIllIllIIllllllIlIlIl != 0;
    }
    
    protected String[] getListOfPlayerUsernames() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    @Override
    public String getCommandName() {
        return CommandGameMode.llIlIIIlIIlllI[CommandGameMode.llIlIIIlIIllll[0]];
    }
}
