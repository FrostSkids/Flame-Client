// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Arrays;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommand;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTException;
import net.minecraft.command.CommandException;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.command.WrongUsageException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.command.CommandBase;

public class CommandTestFor extends CommandBase
{
    private static final /* synthetic */ String[] lllIlIIIllIIll;
    private static final /* synthetic */ int[] lllIlIIIllIlII;
    
    private static String lIlIIIIlllIlIIlI(String llllllllllllIlIlllIIIlllllIlIlll, final String llllllllllllIlIlllIIIlllllIllIll) {
        llllllllllllIlIlllIIIlllllIlIlll = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIIlllllIlIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIIlllllIllIlI = new StringBuilder();
        final char[] llllllllllllIlIlllIIIlllllIllIIl = llllllllllllIlIlllIIIlllllIllIll.toCharArray();
        int llllllllllllIlIlllIIIlllllIllIII = CommandTestFor.lllIlIIIllIlII[0];
        final double llllllllllllIlIlllIIIlllllIlIIlI = (Object)((String)llllllllllllIlIlllIIIlllllIlIlll).toCharArray();
        final short llllllllllllIlIlllIIIlllllIlIIIl = (short)llllllllllllIlIlllIIIlllllIlIIlI.length;
        double llllllllllllIlIlllIIIlllllIlIIII = CommandTestFor.lllIlIIIllIlII[0];
        while (lIlIIIIlllIlIlIl((int)llllllllllllIlIlllIIIlllllIlIIII, llllllllllllIlIlllIIIlllllIlIIIl)) {
            final char llllllllllllIlIlllIIIlllllIlllIl = llllllllllllIlIlllIIIlllllIlIIlI[llllllllllllIlIlllIIIlllllIlIIII];
            llllllllllllIlIlllIIIlllllIllIlI.append((char)(llllllllllllIlIlllIIIlllllIlllIl ^ llllllllllllIlIlllIIIlllllIllIIl[llllllllllllIlIlllIIIlllllIllIII % llllllllllllIlIlllIIIlllllIllIIl.length]));
            "".length();
            ++llllllllllllIlIlllIIIlllllIllIII;
            ++llllllllllllIlIlllIIIlllllIlIIII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIIlllllIllIlI);
    }
    
    private static boolean lIlIIIIlllIlIlIl(final int llllllllllllIlIlllIIIllllIllIlll, final int llllllllllllIlIlllIIIllllIllIllI) {
        return llllllllllllIlIlllIIIllllIllIlll < llllllllllllIlIlllIIIllllIllIllI;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTestFor.lllIlIIIllIlII[1];
    }
    
    static {
        lIlIIIIlllIlIlII();
        lIlIIIIlllIlIIll();
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIlIlllIIIlllllllllII, final int llllllllllllIlIlllIIIllllllllIlI) {
        if (lIlIIIIlllIllIII(llllllllllllIlIlllIIIllllllllIlI)) {
            return CommandTestFor.lllIlIIIllIlII[2] != 0;
        }
        return CommandTestFor.lllIlIIIllIlII[0] != 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIlIlllIIIlllllllIlll, final String[] llllllllllllIlIlllIIIlllllllIlII, final BlockPos llllllllllllIlIlllIIIlllllllIlIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lIlIIIIlllIllIIl(llllllllllllIlIlllIIIlllllllIlII.length, CommandTestFor.lllIlIIIllIlII[2])) {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIlIlllIIIlllllllIlII, MinecraftServer.getServer().getAllUsernames());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = null;
        }
        return listOfStringsMatchingLastWord;
    }
    
    private static boolean lIlIIIIlllIlIlll(final Object llllllllllllIlIlllIIIllllIllIlII) {
        return llllllllllllIlIlllIIIllllIllIlII != null;
    }
    
    private static void lIlIIIIlllIlIIll() {
        (lllIlIIIllIIll = new String[CommandTestFor.lllIlIIIllIlII[6]])[CommandTestFor.lllIlIIIllIlII[0]] = lIlIIIIlllIlIIII("ycA8zyMPx1c=", "xjeOY");
        CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[2]] = lIlIIIIlllIlIIII("E4/3UfGQOMU3B+mm2S1Vh2XxTpqUqWkA", "CGmfY");
        CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[1]] = lIlIIIIlllIlIIII("EtqtcIh3UZ5APyuHC1fEu50BJLBc4P+z", "LnTWD");
        CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[3]] = lIlIIIIlllIlIIIl("nxDTe6Wbejwztq0fB5hz0/APXiJqz7AQ9ZExtW6r/5g=", "kLQDN");
        CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[4]] = lIlIIIIlllIlIIII("E9/8FFCroTFy7L8E12vrTIhCm5ljxKE8SlSMQ0uwoZE=", "IdPKB");
        CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[5]] = lIlIIIIlllIlIIlI("OyYFICw2LRtjOT06HCsiKmcbOC47LBs+", "XIhMM");
    }
    
    private static String lIlIIIIlllIlIIIl(final String llllllllllllIlIlllIIIlllllIIIlll, final String llllllllllllIlIlllIIIlllllIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIlllllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIlllllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIIlllllIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIIlllllIIlIIl.init(CommandTestFor.lllIlIIIllIlII[1], llllllllllllIlIlllIIIlllllIIlIlI);
            return new String(llllllllllllIlIlllIIIlllllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIlllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIlllllIIlIII) {
            llllllllllllIlIlllIIIlllllIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIlllIlIlII() {
        (lllIlIIIllIlII = new int[8])[0] = ((0xAE ^ 0xBD) & ~(0xB4 ^ 0xA7));
        CommandTestFor.lllIlIIIllIlII[1] = "  ".length();
        CommandTestFor.lllIlIIIllIlII[2] = " ".length();
        CommandTestFor.lllIlIIIllIlII[3] = "   ".length();
        CommandTestFor.lllIlIIIllIlII[4] = (0x99 ^ 0x9D);
        CommandTestFor.lllIlIIIllIlII[5] = (94 + 146 - 112 + 30 ^ 145 + 58 - 146 + 98);
        CommandTestFor.lllIlIIIllIlII[6] = (0x94 ^ 0xC5 ^ (0x93 ^ 0xC4));
        CommandTestFor.lllIlIIIllIlII[7] = (0x3 ^ 0xB);
    }
    
    private static boolean lIlIIIIlllIllIIl(final int llllllllllllIlIlllIIIllllIllllll, final int llllllllllllIlIlllIIIllllIlllllI) {
        return llllllllllllIlIlllIIIllllIllllll == llllllllllllIlIlllIIIllllIlllllI;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIlIlllIIlIIIIIIIIIll, final String[] llllllllllllIlIlllIIlIIIIIIIIIlI) throws CommandException {
        if (lIlIIIIlllIlIlIl(llllllllllllIlIlllIIlIIIIIIIIIlI.length, CommandTestFor.lllIlIIIllIlII[2])) {
            throw new WrongUsageException(CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[1]], new Object[CommandTestFor.lllIlIIIllIlII[0]]);
        }
        final Entity llllllllllllIlIlllIIlIIIIIIIlIII = CommandBase.func_175768_b(llllllllllllIlIlllIIlIIIIIIIIIll, llllllllllllIlIlllIIlIIIIIIIIIlI[CommandTestFor.lllIlIIIllIlII[0]]);
        NBTTagCompound llllllllllllIlIlllIIlIIIIIIIIlll = null;
        if (lIlIIIIlllIlIllI(llllllllllllIlIlllIIlIIIIIIIIIlI.length, CommandTestFor.lllIlIIIllIlII[1])) {
            try {
                llllllllllllIlIlllIIlIIIIIIIIlll = JsonToNBT.getTagFromJson(CommandBase.buildString(llllllllllllIlIlllIIlIIIIIIIIIlI, CommandTestFor.lllIlIIIllIlII[2]));
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            catch (NBTException llllllllllllIlIlllIIlIIIIIIIIllI) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[3]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandTestFor.lllIlIIIllIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandTestFor.lllIlIIIllIlII[0]] = llllllllllllIlIlllIIlIIIIIIIIllI.getMessage();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
        }
        if (lIlIIIIlllIlIlll(llllllllllllIlIlllIIlIIIIIIIIlll)) {
            final NBTTagCompound llllllllllllIlIlllIIlIIIIIIIIlIl = new NBTTagCompound();
            llllllllllllIlIlllIIlIIIIIIIlIII.writeToNBT(llllllllllllIlIlllIIlIIIIIIIIlIl);
            if (lIlIIIIlllIllIII(NBTUtil.func_181123_a(llllllllllllIlIlllIIlIIIIIIIIlll, llllllllllllIlIlllIIlIIIIIIIIlIl, (boolean)(CommandTestFor.lllIlIIIllIlII[2] != 0)) ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[4]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandTestFor.lllIlIIIllIlII[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandTestFor.lllIlIIIllIlII[0]] = llllllllllllIlIlllIIlIIIIIIIlIII.getName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
            }
        }
        final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[5]];
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandTestFor.lllIlIIIllIlII[2]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandTestFor.lllIlIIIllIlII[0]] = llllllllllllIlIlllIIlIIIIIIIlIII.getName();
        CommandBase.notifyOperators(llllllllllllIlIlllIIlIIIIIIIIIll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    private static boolean lIlIIIIlllIlIllI(final int llllllllllllIlIlllIIIllllIlllIll, final int llllllllllllIlIlllIIIllllIlllIlI) {
        return llllllllllllIlIlllIIIllllIlllIll >= llllllllllllIlIlllIIIllllIlllIlI;
    }
    
    private static boolean lIlIIIIlllIllIII(final int llllllllllllIlIlllIIIllllIllIIlI) {
        return llllllllllllIlIlllIIIllllIllIIlI == 0;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIlIlllIIlIIIIIIlIIlI) {
        return CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[2]];
    }
    
    private static String lIlIIIIlllIlIIII(final String llllllllllllIlIlllIIIllllllIllII, final String llllllllllllIlIlllIIIllllllIlIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIllllllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIllllllIlIll.getBytes(StandardCharsets.UTF_8)), CommandTestFor.lllIlIIIllIlII[7]), "DES");
            final Cipher llllllllllllIlIlllIIIllllllIlllI = Cipher.getInstance("DES");
            llllllllllllIlIlllIIIllllllIlllI.init(CommandTestFor.lllIlIIIllIlII[1], llllllllllllIlIlllIIIllllllIllll);
            return new String(llllllllllllIlIlllIIIllllllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIllllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIllllllIllIl) {
            llllllllllllIlIlllIIIllllllIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandName() {
        return CommandTestFor.lllIlIIIllIIll[CommandTestFor.lllIlIIIllIlII[0]];
    }
}
