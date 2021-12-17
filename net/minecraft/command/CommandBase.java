// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import com.google.common.collect.Iterables;
import com.google.common.base.Functions;
import net.minecraft.item.Item;
import java.util.Collections;
import net.minecraft.util.ChatComponentText;
import net.minecraft.entity.Entity;
import com.google.common.collect.Lists;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import com.google.common.primitives.Doubles;
import net.minecraft.util.IChatComponent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Collection;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.BlockPos;

public abstract class CommandBase implements ICommand
{
    private static /* synthetic */ IAdminCommand theAdmin;
    private static final /* synthetic */ int[] lIlIlllIIlIIIl;
    private static final /* synthetic */ String[] lIlIlllIIIlIll;
    
    public static BlockPos parseBlockPos(final ICommandSender lllllllllllllIIIIlIlllIllIIllllI, final String[] lllllllllllllIIIIlIlllIllIIllIII, final int lllllllllllllIIIIlIlllIllIIlIlll, final boolean lllllllllllllIIIIlIlllIllIIlIllI) throws NumberInvalidException {
        final BlockPos lllllllllllllIIIIlIlllIllIIllIlI = lllllllllllllIIIIlIlllIllIIllllI.getPosition();
        return new BlockPos(parseDouble(lllllllllllllIIIIlIlllIllIIllIlI.getX(), lllllllllllllIIIIlIlllIllIIllIII[lllllllllllllIIIIlIlllIllIIlIlll], CommandBase.lIlIlllIIlIIIl[7], CommandBase.lIlIlllIIlIIIl[8], lllllllllllllIIIIlIlllIllIIlIllI), parseDouble(lllllllllllllIIIIlIlllIllIIllIlI.getY(), lllllllllllllIIIIlIlllIllIIllIII[lllllllllllllIIIIlIlllIllIIlIlll + CommandBase.lIlIlllIIlIIIl[2]], CommandBase.lIlIlllIIlIIIl[1], CommandBase.lIlIlllIIlIIIl[9], (boolean)(CommandBase.lIlIlllIIlIIIl[1] != 0)), parseDouble(lllllllllllllIIIIlIlllIllIIllIlI.getZ(), lllllllllllllIIIIlIlllIllIIllIII[lllllllllllllIIIIlIlllIllIIlIlll + CommandBase.lIlIlllIIlIIIl[4]], CommandBase.lIlIlllIIlIIIl[7], CommandBase.lIlIlllIIlIIIl[8], lllllllllllllIIIIlIlllIllIIlIllI));
    }
    
    public static boolean doesStringStartWith(final String lllllllllllllIIIIlIlllIIIlllIIll, final String lllllllllllllIIIIlIlllIIIlllIlII) {
        return lllllllllllllIIIIlIlllIIIlllIlII.regionMatches((boolean)(CommandBase.lIlIlllIIlIIIl[2] != 0), CommandBase.lIlIlllIIlIIIl[1], lllllllllllllIIIIlIlllIIIlllIIll, CommandBase.lIlIlllIIlIIIl[1], lllllllllllllIIIIlIlllIIIlllIIll.length());
    }
    
    public static EntityPlayerMP getCommandSenderAsPlayer(final ICommandSender lllllllllllllIIIIlIlllIlIlllIlll) throws PlayerNotFoundException {
        if (llllIIllIlIIIIl((lllllllllllllIIIIlIlllIlIlllIlll instanceof EntityPlayerMP) ? 1 : 0)) {
            return (EntityPlayerMP)lllllllllllllIIIIlIlllIlIlllIlll;
        }
        throw new PlayerNotFoundException(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[19]], new Object[CommandBase.lIlIlllIIlIIIl[1]]);
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIIIlIlllIIIlIlIllI, final int lllllllllllllIIIIlIlllIIIlIlIlIl) {
        return CommandBase.lIlIlllIIlIIIl[1] != 0;
    }
    
    private static boolean llllIIllIIllllI(final int lllllllllllllIIIIlIllIlllIlIllII) {
        return lllllllllllllIIIIlIllIlllIlIllII == 0;
    }
    
    public static double parseDouble(final double lllllllllllllIIIIlIlllIIllIlIlII, String lllllllllllllIIIIlIlllIIllIIlIll, final int lllllllllllllIIIIlIlllIIllIIlIlI, final int lllllllllllllIIIIlIlllIIllIlIIIl, final boolean lllllllllllllIIIIlIlllIIllIIlIII) throws NumberInvalidException {
        final boolean lllllllllllllIIIIlIlllIIllIIllll = lllllllllllllIIIIlIlllIIllIIlIll.startsWith(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[29]]);
        if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIIllll ? 1 : 0) && llllIIllIlIIIIl(Double.isNaN(lllllllllllllIIIIlIlllIIllIlIlII) ? 1 : 0)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[30]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIllIlIlII;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        double n;
        if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIIllll ? 1 : 0)) {
            n = lllllllllllllIIIIlIlllIIllIlIlII;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return 0.0;
            }
        }
        else {
            n = 0.0;
        }
        double lllllllllllllIIIIlIlllIIllIIlllI = n;
        if (!llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIIllll ? 1 : 0) || llllIIllIIllIlI(lllllllllllllIIIIlIlllIIllIIlIll.length(), CommandBase.lIlIlllIIlIIIl[2])) {
            final boolean lllllllllllllIIIIlIlllIIllIIllIl = lllllllllllllIIIIlIlllIIllIIlIll.contains(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[31]]);
            if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIIllll ? 1 : 0)) {
                lllllllllllllIIIIlIlllIIllIIlIll = lllllllllllllIIIIlIlllIIllIIlIll.substring(CommandBase.lIlIlllIIlIIIl[2]);
            }
            lllllllllllllIIIIlIlllIIllIIlllI += parseDouble(lllllllllllllIIIIlIlllIIllIIlIll);
            if (llllIIllIIllllI(lllllllllllllIIIIlIlllIIllIIllIl ? 1 : 0) && llllIIllIIllllI(lllllllllllllIIIIlIlllIIllIIllll ? 1 : 0) && llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIIlIII ? 1 : 0)) {
                lllllllllllllIIIIlIlllIIllIIlllI += 0.5;
            }
        }
        if (!llllIIllIIllllI(lllllllllllllIIIIlIlllIIllIIlIlI) || llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllIlIIIl)) {
            if (llllIIllIIlllII(llllIIllIlIIlll(lllllllllllllIIIIlIlllIIllIIlllI, lllllllllllllIIIIlIlllIIllIIlIlI))) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[32]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
                lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIllIIlllI;
                lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIIllIIlIlI;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
            }
            if (llllIIllIIlllIl(llllIIllIlIlIII(lllllllllllllIIIIlIlllIIllIIlllI, lllllllllllllIIIIlIlllIIllIlIIIl))) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl3 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[33]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll3 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
                lllllllllllllIIlIIIIIIIlIIlllIll3[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIllIIlllI;
                lllllllllllllIIlIIIIIIIlIIlllIll3[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIIllIlIIIl;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl3, lllllllllllllIIlIIIIIIIlIIlllIll3);
            }
        }
        return lllllllllllllIIIIlIlllIIllIIlllI;
    }
    
    public static void notifyOperators(final ICommandSender lllllllllllllIIIIlIlllIIIIllllII, final ICommand lllllllllllllIIIIlIlllIIIIllIIll, final int lllllllllllllIIIIlIlllIIIIlllIIl, final String lllllllllllllIIIIlIlllIIIIlllIII, final Object... lllllllllllllIIIIlIlllIIIIllIllI) {
        if (llllIIllIlIIIll(CommandBase.theAdmin)) {
            CommandBase.theAdmin.notifyOperators(lllllllllllllIIIIlIlllIIIIllllII, lllllllllllllIIIIlIlllIIIIllIIll, lllllllllllllIIIIlIlllIIIIlllIIl, lllllllllllllIIIIlIlllIIIIlllIII, lllllllllllllIIIIlIlllIIIIllIllI);
        }
    }
    
    public static String joinNiceStringFromCollection(final Collection<String> lllllllllllllIIIIlIlllIIlIIllIIl) {
        return joinNiceString(lllllllllllllIIIIlIlllIIlIIllIIl.toArray(new String[lllllllllllllIIIIlIlllIIlIIllIIl.size()]));
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIIIlIlllIlllIlIIII, final String[] lllllllllllllIIIIlIlllIlllIIllll, final BlockPos lllllllllllllIIIIlIlllIlllIIlllI) {
        return null;
    }
    
    private static boolean llllIIllIIlllII(final int lllllllllllllIIIIlIllIlllIlIlIlI) {
        return lllllllllllllIIIIlIllIlllIlIlIlI < 0;
    }
    
    public static int parseInt(final String lllllllllllllIIIIlIlllIlllIIlIIl) throws NumberInvalidException {
        try {
            return Integer.parseInt(lllllllllllllIIIIlIlllIlllIIlIIl);
        }
        catch (NumberFormatException lllllllllllllIIIIlIlllIlllIIlIlI) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[1]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIlllIIlIIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
    }
    
    private static boolean llllIIllIlIIIlI(final Object lllllllllllllIIIIlIllIlllIllIIII) {
        return lllllllllllllIIIIlIllIlllIllIIII == null;
    }
    
    @Override
    public int compareTo(final ICommand lllllllllllllIIIIlIlllIIIIlIIIlI) {
        return this.getCommandName().compareTo(lllllllllllllIIIIlIlllIIIIlIIIlI.getCommandName());
    }
    
    private static int llllIIllIlIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        llllIIllIIllIII();
        llllIIllIIlIlIl();
    }
    
    private static String llllIIllIIIIlll(final String lllllllllllllIIIIlIllIllllIlIlII, final String lllllllllllllIIIIlIllIllllIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllIllllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), CommandBase.lIlIlllIIlIIIl[12]), "DES");
            final Cipher lllllllllllllIIIIlIllIllllIllIII = Cipher.getInstance("DES");
            lllllllllllllIIIIlIllIllllIllIII.init(CommandBase.lIlIlllIIlIIIl[4], lllllllllllllIIIIlIllIllllIllIIl);
            return new String(lllllllllllllIIIIlIllIllllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllIllllIlIlll) {
            lllllllllllllIIIIlIllIllllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static int llllIIllIlIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static IChatComponent getChatComponentFromNthArg(final ICommandSender lllllllllllllIIIIlIlllIlIIllIIII, final String[] lllllllllllllIIIIlIlllIlIIlIllll, final int lllllllllllllIIIIlIlllIlIIlIlllI) throws PlayerNotFoundException, CommandException {
        return getChatComponentFromNthArg(lllllllllllllIIIIlIlllIlIIllIIII, lllllllllllllIIIIlIlllIlIIlIllll, lllllllllllllIIIIlIlllIlIIlIlllI, (boolean)(CommandBase.lIlIlllIIlIIIl[1] != 0));
    }
    
    public static String joinNiceString(final Object[] lllllllllllllIIIIlIlllIIlIlIllII) {
        final StringBuilder lllllllllllllIIIIlIlllIIlIlIlIll = new StringBuilder();
        int lllllllllllllIIIIlIlllIIlIlIlIlI = CommandBase.lIlIlllIIlIIIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllIIllIlIIlII(lllllllllllllIIIIlIlllIIlIlIlIlI, lllllllllllllIIIIlIlllIIlIlIllII.length)) {
            final String lllllllllllllIIIIlIlllIIlIlIlIIl = lllllllllllllIIIIlIlllIIlIlIllII[lllllllllllllIIIIlIlllIIlIlIlIlI].toString();
            if (llllIIllIIlllIl(lllllllllllllIIIIlIlllIIlIlIlIlI)) {
                if (llllIIllIlIlIIl(lllllllllllllIIIIlIlllIIlIlIlIlI, lllllllllllllIIIIlIlllIIlIlIllII.length - CommandBase.lIlIlllIIlIIIl[2])) {
                    lllllllllllllIIIIlIlllIIlIlIlIll.append(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[37]]);
                    "".length();
                    "".length();
                    if (((0xE1 ^ 0xC4) & ~(0x6C ^ 0x49)) >= "  ".length()) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIIlIlllIIlIlIlIll.append(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[38]]);
                    "".length();
                }
            }
            lllllllllllllIIIIlIlllIIlIlIlIll.append(lllllllllllllIIIIlIlllIIlIlIlIIl);
            "".length();
            ++lllllllllllllIIIIlIlllIIlIlIlIlI;
        }
        return String.valueOf(lllllllllllllIIIIlIlllIIlIlIlIll);
    }
    
    public static void setAdminCommander(final IAdminCommand lllllllllllllIIIIlIlllIIIIlIlIlI) {
        CommandBase.theAdmin = lllllllllllllIIIIlIlllIIIIlIlIlI;
    }
    
    public static double parseDouble(final String lllllllllllllIIIIlIlllIllIIlIIlI) throws NumberInvalidException {
        try {
            final double lllllllllllllIIIIlIlllIllIIlIIIl = Double.parseDouble(lllllllllllllIIIIlIlllIllIIlIIlI);
            if (llllIIllIIllllI(Doubles.isFinite(lllllllllllllIIIIlIlllIllIIlIIIl) ? 1 : 0)) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[10]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
                lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIIlIIlI;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
            }
            return lllllllllllllIIIIlIlllIllIIlIIIl;
        }
        catch (NumberFormatException lllllllllllllIIIIlIlllIllIIlIIII) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[11]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIIlIIlI;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final ICommandSender lllllllllllllIIIIlIlllIlllIlIlII) {
        return lllllllllllllIIIIlIlllIlllIlIlII.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
    
    private static void llllIIllIIllIII() {
        (lIlIlllIIlIIIl = new int[43])[0] = (0x37 ^ 0x33);
        CommandBase.lIlIlllIIlIIIl[1] = ((0x53 ^ 0x1) & ~(0x6D ^ 0x3F));
        CommandBase.lIlIlllIIlIIIl[2] = " ".length();
        CommandBase.lIlIlllIIlIIIl[3] = (-1 & Integer.MAX_VALUE);
        CommandBase.lIlIlllIIlIIIl[4] = "  ".length();
        CommandBase.lIlIlllIIlIIIl[5] = "   ".length();
        CommandBase.lIlIlllIIlIIIl[6] = (0x9E ^ 0x9B);
        CommandBase.lIlIlllIIlIIIl[7] = -(0xFFFFEFB3 & 0x1C9D3CC);
        CommandBase.lIlIlllIIlIIIl[8] = (0xFFFFDBC5 & 0x1C9E7BA);
        CommandBase.lIlIlllIIlIIIl[9] = (0xFFFFD5A3 & 0x2B5C);
        CommandBase.lIlIlllIIlIIIl[10] = (0x15 ^ 0x60 ^ (0xFF ^ 0x8C));
        CommandBase.lIlIlllIIlIIIl[11] = (15 + 27 - 33 + 166 ^ 20 + 68 - 46 + 126);
        CommandBase.lIlIlllIIlIIIl[12] = (0xB3 ^ 0xBB);
        CommandBase.lIlIlllIIlIIIl[13] = (0x8B ^ 0xBC ^ (0xBE ^ 0x80));
        CommandBase.lIlIlllIIlIIIl[14] = (9 + 136 - 141 + 146 ^ 142 + 90 - 87 + 11);
        CommandBase.lIlIlllIIlIIIl[15] = (0x8 ^ 0x3);
        CommandBase.lIlIlllIIlIIIl[16] = (0x3A ^ 0x36);
        CommandBase.lIlIlllIIlIIIl[17] = (0x87 ^ 0x8A);
        CommandBase.lIlIlllIIlIIIl[18] = (0x1F ^ 0x38 ^ (0xB9 ^ 0x90));
        CommandBase.lIlIlllIIlIIIl[19] = (0x5F ^ 0xF ^ (0xDF ^ 0x80));
        CommandBase.lIlIlllIIlIIIl[20] = (0xBF ^ 0xAF);
        CommandBase.lIlIlllIIlIIIl[21] = (104 + 170 - 235 + 134 ^ 170 + 0 - 64 + 82);
        CommandBase.lIlIlllIIlIIIl[22] = (0x51 ^ 0x43);
        CommandBase.lIlIlllIIlIIIl[23] = (0x1A ^ 0x2F ^ (0x43 ^ 0x65));
        CommandBase.lIlIlllIIlIIIl[24] = (0x7D ^ 0x7A ^ (0xAC ^ 0xBF));
        CommandBase.lIlIlllIIlIIIl[25] = (0xD4 ^ 0xC1);
        CommandBase.lIlIlllIIlIIIl[26] = (0x2A ^ 0x3C);
        CommandBase.lIlIlllIIlIIIl[27] = (0x60 ^ 0x77);
        CommandBase.lIlIlllIIlIIIl[28] = (0x6F ^ 0x5E ^ (0x93 ^ 0xBA));
        CommandBase.lIlIlllIIlIIIl[29] = (0x35 ^ 0x3D ^ (0x1D ^ 0xC));
        CommandBase.lIlIlllIIlIIIl[30] = (0x51 ^ 0x7A ^ (0x82 ^ 0xB3));
        CommandBase.lIlIlllIIlIIIl[31] = (122 + 51 - 136 + 105 ^ 4 + 103 - 46 + 88);
        CommandBase.lIlIlllIIlIIIl[32] = (0xD7 ^ 0xC0 ^ (0x9A ^ 0x91));
        CommandBase.lIlIlllIIlIIIl[33] = (0x52 ^ 0x6A ^ (0x60 ^ 0x45));
        CommandBase.lIlIlllIIlIIIl[34] = (0x86 ^ 0x98);
        CommandBase.lIlIlllIIlIIIl[35] = (0x26 ^ 0x39);
        CommandBase.lIlIlllIIlIIIl[36] = (0x6C ^ 0x4C);
        CommandBase.lIlIlllIIlIIIl[37] = (0xBF ^ 0x9E);
        CommandBase.lIlIlllIIlIIIl[38] = (132 + 47 - 94 + 50 ^ 128 + 29 - 85 + 93);
        CommandBase.lIlIlllIIlIIIl[39] = (0x27 ^ 0x5F ^ (0xC8 ^ 0x93));
        CommandBase.lIlIlllIIlIIIl[40] = (12 + 79 - 48 + 106 ^ 112 + 71 - 97 + 91);
        CommandBase.lIlIlllIIlIIIl[41] = (149 + 22 - 108 + 100 ^ 57 + 4 + 68 + 5);
        CommandBase.lIlIlllIIlIIIl[42] = (0x7B ^ 0x5D);
    }
    
    private static boolean llllIIllIIllIIl(final int lllllllllllllIIIIlIllIlllIlllIIl, final int lllllllllllllIIIIlIllIlllIlllIII) {
        return lllllllllllllIIIIlIllIlllIlllIIl < lllllllllllllIIIIlIllIlllIlllIII;
    }
    
    private static boolean llllIIllIlIIIll(final Object lllllllllllllIIIIlIllIlllIllIIlI) {
        return lllllllllllllIIIIlIllIlllIllIIlI != null;
    }
    
    private static String llllIIllIIIlIII(final String lllllllllllllIIIIlIllIllllIIIlll, final String lllllllllllllIIIIlIllIllllIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllIllllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllIllllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIllIllllIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIllIllllIIlIll.init(CommandBase.lIlIlllIIlIIIl[4], lllllllllllllIIIIlIllIllllIIllII);
            return new String(lllllllllllllIIIIlIllIllllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllIllllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllIllllIIlIlI) {
            lllllllllllllIIIIlIllIllllIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIllIlIIIIl(final int lllllllllllllIIIIlIllIlllIlIlllI) {
        return lllllllllllllIIIIlIllIlllIlIlllI != 0;
    }
    
    private static int llllIIllIlIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static boolean parseBoolean(final String lllllllllllllIIIIlIlllIlIllllIIl) throws CommandException {
        if (!llllIIllIIllllI(lllllllllllllIIIIlIlllIlIllllIIl.equals(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[14]]) ? 1 : 0) || !llllIIllIIllllI(lllllllllllllIIIIlIlllIlIllllIIl.equals(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[15]]) ? 1 : 0)) {
            return CommandBase.lIlIlllIIlIIIl[2] != 0;
        }
        if (llllIIllIIllllI(lllllllllllllIIIIlIlllIlIllllIIl.equals(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[16]]) ? 1 : 0) && llllIIllIIllllI(lllllllllllllIIIIlIlllIlIllllIIl.equals(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[17]]) ? 1 : 0)) {
            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[18]];
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIlIllllIIl;
            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        return CommandBase.lIlIlllIIlIIIl[1] != 0;
    }
    
    public static CoordinateArg parseCoordinate(final double lllllllllllllIIIIlIlllIIlllIllIl, String lllllllllllllIIIIlIlllIIlllIllII, final int lllllllllllllIIIIlIlllIIllllIIll, final int lllllllllllllIIIIlIlllIIllllIIlI, final boolean lllllllllllllIIIIlIlllIIllllIIIl) throws NumberInvalidException {
        final boolean lllllllllllllIIIIlIlllIIllllIIII = ((String)lllllllllllllIIIIlIlllIIlllIllII).startsWith(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[24]]);
        if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIII ? 1 : 0) && llllIIllIlIIIIl(Double.isNaN(lllllllllllllIIIIlIlllIIlllIllIl) ? 1 : 0)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[25]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlllIllIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        double lllllllllllllIIIIlIlllIIlllIllll = 0.0;
        if (!llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIII ? 1 : 0) || llllIIllIIllIlI(((String)lllllllllllllIIIIlIlllIIlllIllII).length(), CommandBase.lIlIlllIIlIIIl[2])) {
            final boolean lllllllllllllIIIIlIlllIIlllIlllI = ((String)lllllllllllllIIIIlIlllIIlllIllII).contains(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[26]]);
            if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIII ? 1 : 0)) {
                lllllllllllllIIIIlIlllIIlllIllII = ((String)lllllllllllllIIIIlIlllIIlllIllII).substring(CommandBase.lIlIlllIIlIIIl[2]);
            }
            lllllllllllllIIIIlIlllIIlllIllll += parseDouble((String)lllllllllllllIIIIlIlllIIlllIllII);
            if (llllIIllIIllllI(lllllllllllllIIIIlIlllIIlllIlllI ? 1 : 0) && llllIIllIIllllI(lllllllllllllIIIIlIlllIIllllIIII ? 1 : 0) && llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIIl ? 1 : 0)) {
                lllllllllllllIIIIlIlllIIlllIllll += 0.5;
            }
        }
        if (!llllIIllIIllllI(lllllllllllllIIIIlIlllIIllllIIll) || llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIlI)) {
            if (llllIIllIIlllII(llllIIllIlIIlIl(lllllllllllllIIIIlIlllIIlllIllll, lllllllllllllIIIIlIlllIIllllIIll))) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[27]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
                lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlllIllll;
                lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIIllllIIll;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
            }
            if (llllIIllIIlllIl(llllIIllIlIIllI(lllllllllllllIIIIlIlllIIlllIllll, lllllllllllllIIIIlIlllIIllllIIlI))) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl3 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[28]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll3 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
                lllllllllllllIIlIIIIIIIlIIlllIll3[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlllIllll;
                lllllllllllllIIlIIIIIIIlIIlllIll3[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIIllllIIlI;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl3, lllllllllllllIIlIIIIIIIlIIlllIll3);
            }
        }
        final double n = lllllllllllllIIIIlIlllIIlllIllll;
        double n2;
        if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIllllIIII ? 1 : 0)) {
            n2 = lllllllllllllIIIIlIlllIIlllIllIl;
            "".length();
            if (((0x80 ^ 0x94 ^ (0x17 ^ 0x4D)) & (0x94 ^ 0x8F ^ (0x64 ^ 0x31) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            n2 = 0.0;
        }
        return new CoordinateArg(n + n2, lllllllllllllIIIIlIlllIIlllIllll, lllllllllllllIIIIlIlllIIllllIIII);
    }
    
    public static Block getBlockByText(final ICommandSender lllllllllllllIIIIlIlllIIlIllIlll, final String lllllllllllllIIIIlIlllIIlIllIllI) throws NumberInvalidException {
        final ResourceLocation lllllllllllllIIIIlIlllIIlIllIlIl = new ResourceLocation(lllllllllllllIIIIlIlllIIlIllIllI);
        if (llllIIllIIllllI(Block.blockRegistry.containsKey(lllllllllllllIIIIlIlllIIlIllIlIl) ? 1 : 0)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[35]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlIllIlIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        final Block lllllllllllllIIIIlIlllIIlIllIlII = Block.blockRegistry.getObject(lllllllllllllIIIIlIlllIIlIllIlIl);
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIIlIllIlII)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[36]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlIllIlIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
        }
        return lllllllllllllIIIIlIlllIIlIllIlII;
    }
    
    private static boolean llllIIllIlIlIIl(final int lllllllllllllIIIIlIllIllllIIIIIl, final int lllllllllllllIIIIlIllIllllIIIIII) {
        return lllllllllllllIIIIlIllIllllIIIIIl == lllllllllllllIIIIlIllIllllIIIIII;
    }
    
    private static boolean llllIIllIlIIlII(final int lllllllllllllIIIIlIllIlllIllllIl, final int lllllllllllllIIIIlIllIlllIllllII) {
        return lllllllllllllIIIIlIllIlllIllllIl >= lllllllllllllIIIIlIllIlllIllllII;
    }
    
    public static String buildString(final String[] lllllllllllllIIIIlIlllIlIIIIlIll, final int lllllllllllllIIIIlIlllIlIIIIlIlI) {
        final StringBuilder lllllllllllllIIIIlIlllIlIIIIlllI = new StringBuilder();
        int lllllllllllllIIIIlIlllIlIIIIllIl = lllllllllllllIIIIlIlllIlIIIIlIlI;
        "".length();
        if (" ".length() == 0) {
            return null;
        }
        while (!llllIIllIlIIlII(lllllllllllllIIIIlIlllIlIIIIllIl, lllllllllllllIIIIlIlllIlIIIIlIll.length)) {
            if (llllIIllIIllIlI(lllllllllllllIIIIlIlllIlIIIIllIl, lllllllllllllIIIIlIlllIlIIIIlIlI)) {
                lllllllllllllIIIIlIlllIlIIIIlllI.append(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[23]]);
                "".length();
            }
            final String lllllllllllllIIIIlIlllIlIIIIllII = lllllllllllllIIIIlIlllIlIIIIlIll[lllllllllllllIIIIlIlllIlIIIIllIl];
            lllllllllllllIIIIlIlllIlIIIIlllI.append(lllllllllllllIIIIlIlllIlIIIIllII);
            "".length();
            ++lllllllllllllIIIIlIlllIlIIIIllIl;
        }
        return String.valueOf(lllllllllllllIIIIlIlllIlIIIIlllI);
    }
    
    public static EntityPlayerMP getPlayer(final ICommandSender lllllllllllllIIIIlIlllIlIllIlllI, final String lllllllllllllIIIIlIlllIlIlllIIII) throws PlayerNotFoundException {
        EntityPlayerMP lllllllllllllIIIIlIlllIlIllIllll = PlayerSelector.matchOnePlayer(lllllllllllllIIIIlIlllIlIllIlllI, lllllllllllllIIIIlIlllIlIlllIIII);
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIllIllll)) {
            try {
                lllllllllllllIIIIlIlllIlIllIllll = MinecraftServer.getServer().getConfigurationManager().getPlayerByUUID(UUID.fromString(lllllllllllllIIIIlIlllIlIlllIIII));
                "".length();
                if (((137 + 206 - 168 + 34 ^ 7 + 149 - 23 + 17) & (0x2F ^ 0x42 ^ (0x2B ^ 0x1) ^ -" ".length())) == -" ".length()) {
                    return null;
                }
            }
            catch (IllegalArgumentException ex) {}
        }
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIllIllll)) {
            lllllllllllllIIIIlIlllIlIllIllll = MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(lllllllllllllIIIIlIlllIlIlllIIII);
        }
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIllIllll)) {
            throw new PlayerNotFoundException();
        }
        return lllllllllllllIIIIlIlllIlIllIllll;
    }
    
    public static List<String> func_175771_a(final String[] lllllllllllllIIIIlIlllIIlIIIllII, final int lllllllllllllIIIIlIlllIIlIIlIIlI, final BlockPos lllllllllllllIIIIlIlllIIlIIIlIlI) {
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIIlIIIlIlI)) {
            return null;
        }
        final int lllllllllllllIIIIlIlllIIlIIlIIII = lllllllllllllIIIIlIlllIIlIIIllII.length - CommandBase.lIlIlllIIlIIIl[2];
        String lllllllllllllIIIIlIlllIIlIIIllIl = null;
        if (llllIIllIlIlIIl(lllllllllllllIIIIlIlllIIlIIlIIII, lllllllllllllIIIIlIlllIIlIIlIIlI)) {
            final String lllllllllllllIIIIlIlllIIlIIIllll = Integer.toString(lllllllllllllIIIIlIlllIIlIIIlIlI.getX());
            "".length();
            if (((0x2C ^ 0x3B) & ~(0xD7 ^ 0xC0)) != 0x0) {
                return null;
            }
        }
        else if (llllIIllIlIlIIl(lllllllllllllIIIIlIlllIIlIIlIIII, lllllllllllllIIIIlIlllIIlIIlIIlI + CommandBase.lIlIlllIIlIIIl[2])) {
            final String lllllllllllllIIIIlIlllIIlIIIlllI = Integer.toString(lllllllllllllIIIIlIlllIIlIIIlIlI.getY());
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            if (llllIIllIlIlIlI(lllllllllllllIIIIlIlllIIlIIlIIII, lllllllllllllIIIIlIlllIIlIIlIIlI + CommandBase.lIlIlllIIlIIIl[4])) {
                return null;
            }
            lllllllllllllIIIIlIlllIIlIIIllIl = Integer.toString(lllllllllllllIIIIlIlllIIlIIIlIlI.getZ());
        }
        final String[] array = new String[CommandBase.lIlIlllIIlIIIl[2]];
        array[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlIIIllIl;
        return (List<String>)Lists.newArrayList((Object[])array);
    }
    
    public static List<String> func_181043_b(final String[] lllllllllllllIIIIlIlllIIIlllllII, final int lllllllllllllIIIIlIlllIIlIIIIIIl, final BlockPos lllllllllllllIIIIlIlllIIlIIIIIII) {
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIIlIIIIIII)) {
            return null;
        }
        final int lllllllllllllIIIIlIlllIIIlllllll = lllllllllllllIIIIlIlllIIIlllllII.length - CommandBase.lIlIlllIIlIIIl[2];
        String lllllllllllllIIIIlIlllIIIlllllIl = null;
        if (llllIIllIlIlIIl(lllllllllllllIIIIlIlllIIIlllllll, lllllllllllllIIIIlIlllIIlIIIIIIl)) {
            final String lllllllllllllIIIIlIlllIIIllllllI = Integer.toString(lllllllllllllIIIIlIlllIIlIIIIIII.getX());
            "".length();
            if (-" ".length() >= ((0x57 ^ 0x62 ^ (0x95 ^ 0xAF)) & (101 + 42 - 56 + 86 ^ 25 + 32 + 70 + 35 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            if (llllIIllIlIlIlI(lllllllllllllIIIIlIlllIIIlllllll, lllllllllllllIIIIlIlllIIlIIIIIIl + CommandBase.lIlIlllIIlIIIl[2])) {
                return null;
            }
            lllllllllllllIIIIlIlllIIIlllllIl = Integer.toString(lllllllllllllIIIIlIlllIIlIIIIIII.getZ());
        }
        final String[] array = new String[CommandBase.lIlIlllIIlIIIl[2]];
        array[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIIlllllIl;
        return (List<String>)Lists.newArrayList((Object[])array);
    }
    
    public static double parseDouble(final double lllllllllllllIIIIlIlllIIllIlllll, final String lllllllllllllIIIIlIlllIIllIllllI, final boolean lllllllllllllIIIIlIlllIIlllIIIII) throws NumberInvalidException {
        return parseDouble(lllllllllllllIIIIlIlllIIllIlllll, lllllllllllllIIIIlIlllIIllIllllI, CommandBase.lIlIlllIIlIIIl[7], CommandBase.lIlIlllIIlIIIl[8], lllllllllllllIIIIlIlllIIlllIIIII);
    }
    
    public static Entity func_175768_b(final ICommandSender lllllllllllllIIIIlIlllIlIllIlIII, final String lllllllllllllIIIIlIlllIlIllIIlIl) throws EntityNotFoundException {
        return getEntity(lllllllllllllIIIIlIlllIlIllIlIII, lllllllllllllIIIIlIlllIlIllIIlIl, (Class<? extends Entity>)Entity.class);
    }
    
    public static IChatComponent getChatComponentFromNthArg(final ICommandSender lllllllllllllIIIIlIlllIlIIlIIlIl, final String[] lllllllllllllIIIIlIlllIlIIIlllII, final int lllllllllllllIIIIlIlllIlIIlIIIll, final boolean lllllllllllllIIIIlIlllIlIIlIIIlI) throws PlayerNotFoundException {
        final IChatComponent lllllllllllllIIIIlIlllIlIIlIIIIl = new ChatComponentText(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[21]]);
        int lllllllllllllIIIIlIlllIlIIlIIIII = lllllllllllllIIIIlIlllIlIIlIIIll;
        "".length();
        if (" ".length() == 0) {
            return null;
        }
        while (!llllIIllIlIIlII(lllllllllllllIIIIlIlllIlIIlIIIII, lllllllllllllIIIIlIlllIlIIIlllII.length)) {
            if (llllIIllIIllIlI(lllllllllllllIIIIlIlllIlIIlIIIII, lllllllllllllIIIIlIlllIlIIlIIIll)) {
                lllllllllllllIIIIlIlllIlIIlIIIIl.appendText(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[22]]);
                "".length();
            }
            IChatComponent lllllllllllllIIIIlIlllIlIIIlllll = new ChatComponentText(lllllllllllllIIIIlIlllIlIIIlllII[lllllllllllllIIIIlIlllIlIIlIIIII]);
            if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIlIIlIIIlI ? 1 : 0)) {
                final IChatComponent lllllllllllllIIIIlIlllIlIIIllllI = PlayerSelector.matchEntitiesToChatComponent(lllllllllllllIIIIlIlllIlIIlIIlIl, lllllllllllllIIIIlIlllIlIIIlllII[lllllllllllllIIIIlIlllIlIIlIIIII]);
                if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIIIllllI)) {
                    if (llllIIllIlIIIIl(PlayerSelector.hasArguments(lllllllllllllIIIIlIlllIlIIIlllII[lllllllllllllIIIIlIlllIlIIlIIIII]) ? 1 : 0)) {
                        throw new PlayerNotFoundException();
                    }
                }
                else {
                    lllllllllllllIIIIlIlllIlIIIlllll = lllllllllllllIIIIlIlllIlIIIllllI;
                }
            }
            lllllllllllllIIIIlIlllIlIIlIIIIl.appendSibling(lllllllllllllIIIIlIlllIlIIIlllll);
            "".length();
            ++lllllllllllllIIIIlIlllIlIIlIIIII;
        }
        return lllllllllllllIIIIlIlllIlIIlIIIIl;
    }
    
    public static IChatComponent join(final List<IChatComponent> lllllllllllllIIIIlIlllIIlIlIIIIl) {
        final IChatComponent lllllllllllllIIIIlIlllIIlIlIIIII = new ChatComponentText(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[39]]);
        int lllllllllllllIIIIlIlllIIlIIlllll = CommandBase.lIlIlllIIlIIIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllIIllIlIIlII(lllllllllllllIIIIlIlllIIlIIlllll, lllllllllllllIIIIlIlllIIlIlIIIIl.size())) {
            if (llllIIllIIlllIl(lllllllllllllIIIIlIlllIIlIIlllll)) {
                if (llllIIllIlIlIIl(lllllllllllllIIIIlIlllIIlIIlllll, lllllllllllllIIIIlIlllIIlIlIIIIl.size() - CommandBase.lIlIlllIIlIIIl[2])) {
                    lllllllllllllIIIIlIlllIIlIlIIIII.appendText(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[40]]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (llllIIllIIlllIl(lllllllllllllIIIIlIlllIIlIIlllll)) {
                    lllllllllllllIIIIlIlllIIlIlIIIII.appendText(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[41]]);
                    "".length();
                }
            }
            lllllllllllllIIIIlIlllIIlIlIIIII.appendSibling(lllllllllllllIIIIlIlllIIlIlIIIIl.get(lllllllllllllIIIIlIlllIIlIIlllll));
            "".length();
            ++lllllllllllllIIIIlIlllIIlIIlllll;
        }
        return lllllllllllllIIIIlIlllIIlIlIIIII;
    }
    
    public static int parseInt(final String lllllllllllllIIIIlIlllIlllIIIIll, final int lllllllllllllIIIIlIlllIlllIIIlII) throws NumberInvalidException {
        return parseInt(lllllllllllllIIIIlIlllIlllIIIIll, lllllllllllllIIIIlIlllIlllIIIlII, CommandBase.lIlIlllIIlIIIl[3]);
    }
    
    private static boolean llllIIllIIlllIl(final int lllllllllllllIIIIlIllIlllIlIlIII) {
        return lllllllllllllIIIIlIllIlllIlIlIII > 0;
    }
    
    public int getRequiredPermissionLevel() {
        return CommandBase.lIlIlllIIlIIIl[0];
    }
    
    public static void notifyOperators(final ICommandSender lllllllllllllIIIIlIlllIIIlIIIllI, final ICommand lllllllllllllIIIIlIlllIIIlIIlIIl, final String lllllllllllllIIIIlIlllIIIlIIIlII, final Object... lllllllllllllIIIIlIlllIIIlIIIlll) {
        notifyOperators(lllllllllllllIIIIlIlllIIIlIIIllI, lllllllllllllIIIIlIlllIIIlIIlIIl, CommandBase.lIlIlllIIlIIIl[1], lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
    }
    
    public static double parseDouble(final String lllllllllllllIIIIlIlllIllIIIlIIl, final double lllllllllllllIIIIlIlllIllIIIlIII) throws NumberInvalidException {
        return parseDouble(lllllllllllllIIIIlIlllIllIIIlIIl, lllllllllllllIIIIlIlllIllIIIlIII, Double.MAX_VALUE);
    }
    
    public static int parseInt(final String lllllllllllllIIIIlIlllIllIlllIIl, final int lllllllllllllIIIIlIlllIllIlllIII, final int lllllllllllllIIIIlIlllIllIllIlll) throws NumberInvalidException {
        final int lllllllllllllIIIIlIlllIllIlllIlI = parseInt(lllllllllllllIIIIlIlllIllIlllIIl);
        if (llllIIllIIllIIl(lllllllllllllIIIIlIlllIllIlllIlI, lllllllllllllIIIIlIlllIllIlllIII)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[2]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIlllIlI;
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIllIlllIII;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        if (llllIIllIIllIlI(lllllllllllllIIIIlIlllIllIlllIlI, lllllllllllllIIIIlIlllIllIllIlll)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[4]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIlllIlI;
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIllIllIlll;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
        }
        return lllllllllllllIIIIlIlllIllIlllIlI;
    }
    
    public static long parseLong(final String lllllllllllllIIIIlIlllIllIlIlIll, final long lllllllllllllIIIIlIlllIllIlIlIlI, final long lllllllllllllIIIIlIlllIllIlIlIIl) throws NumberInvalidException {
        final long lllllllllllllIIIIlIlllIllIlIlIII = parseLong(lllllllllllllIIIIlIlllIllIlIlIll);
        if (llllIIllIIlllII(llllIIllIIllIll(lllllllllllllIIIIlIlllIllIlIlIII, lllllllllllllIIIIlIlllIllIlIlIlI))) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[0]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIlIlIII;
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIllIlIlIlI;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        if (llllIIllIIlllIl(llllIIllIIllIll(lllllllllllllIIIIlIlllIllIlIlIII, lllllllllllllIIIIlIlllIllIlIlIIl))) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[6]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIlIlIII;
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIllIlIlIIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
        }
        return lllllllllllllIIIIlIlllIllIlIlIII;
    }
    
    private static int llllIIllIIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static double parseDouble(final String lllllllllllllIIIIlIlllIlIlllllll, final double lllllllllllllIIIIlIlllIllIIIIIlI, final double lllllllllllllIIIIlIlllIlIlllllIl) throws NumberInvalidException {
        final double lllllllllllllIIIIlIlllIllIIIIIII = parseDouble(lllllllllllllIIIIlIlllIlIlllllll);
        if (llllIIllIIlllII(llllIIllIIlllll(lllllllllllllIIIIlIlllIllIIIIIII, lllllllllllllIIIIlIlllIllIIIIIlI))) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[12]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIIIIIII;
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIllIIIIIlI;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        if (llllIIllIIlllIl(llllIIllIlIIIII(lllllllllllllIIIIlIlllIllIIIIIII, lllllllllllllIIIIlIlllIlIlllllIl))) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl2 = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[13]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll2 = new Object[CommandBase.lIlIlllIIlIIIl[4]];
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIIIIIII;
            lllllllllllllIIlIIIIIIIlIIlllIll2[CommandBase.lIlIlllIIlIIIl[2]] = lllllllllllllIIIIlIlllIlIlllllIl;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl2, lllllllllllllIIlIIIIIIIlIIlllIll2);
        }
        return lllllllllllllIIIIlIlllIllIIIIIII;
    }
    
    public static String getPlayerName(final ICommandSender lllllllllllllIIIIlIlllIlIlIIIlIl, final String lllllllllllllIIIIlIlllIlIlIIIlll) throws PlayerNotFoundException {
        try {
            return getPlayer(lllllllllllllIIIIlIlllIlIlIIIlIl, lllllllllllllIIIIlIlllIlIlIIIlll).getName();
        }
        catch (PlayerNotFoundException lllllllllllllIIIIlIlllIlIlIIIllI) {
            if (llllIIllIlIIIIl(PlayerSelector.hasArguments(lllllllllllllIIIIlIlllIlIlIIIlll) ? 1 : 0)) {
                throw lllllllllllllIIIIlIlllIlIlIIIllI;
            }
            return lllllllllllllIIIIlIlllIlIlIIIlll;
        }
    }
    
    public static <T extends Entity> T getEntity(final ICommandSender lllllllllllllIIIIlIlllIlIlIllllI, final String lllllllllllllIIIIlIlllIlIlIlllIl, final Class<? extends T> lllllllllllllIIIIlIlllIlIlIlllII) throws EntityNotFoundException {
        Entity lllllllllllllIIIIlIlllIlIlIllIll = PlayerSelector.matchOneEntity(lllllllllllllIIIIlIlllIlIlIllllI, lllllllllllllIIIIlIlllIlIlIlllIl, (Class<? extends Entity>)lllllllllllllIIIIlIlllIlIlIlllII);
        final MinecraftServer lllllllllllllIIIIlIlllIlIlIllIlI = MinecraftServer.getServer();
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIlIllIll)) {
            lllllllllllllIIIIlIlllIlIlIllIll = lllllllllllllIIIIlIlllIlIlIllIlI.getConfigurationManager().getPlayerByUsername(lllllllllllllIIIIlIlllIlIlIlllIl);
        }
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIlIllIll)) {
            try {
                final UUID lllllllllllllIIIIlIlllIlIlIllIIl = UUID.fromString(lllllllllllllIIIIlIlllIlIlIlllIl);
                lllllllllllllIIIIlIlllIlIlIllIll = lllllllllllllIIIIlIlllIlIlIllIlI.getEntityFromUuid(lllllllllllllIIIIlIlllIlIlIllIIl);
                if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIlIlIllIll)) {
                    lllllllllllllIIIIlIlllIlIlIllIll = lllllllllllllIIIIlIlllIlIlIllIlI.getConfigurationManager().getPlayerByUUID(lllllllllllllIIIIlIlllIlIlIllIIl);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            catch (IllegalArgumentException lllllllllllllIIIIlIlllIlIlIllIII) {
                throw new EntityNotFoundException(CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[20]], new Object[CommandBase.lIlIlllIIlIIIl[1]]);
            }
        }
        if (llllIIllIlIIIll(lllllllllllllIIIIlIlllIlIlIllIll) && llllIIllIlIIIIl(lllllllllllllIIIIlIlllIlIlIlllII.isAssignableFrom(lllllllllllllIIIIlIlllIlIlIllIll.getClass()) ? 1 : 0)) {
            return (T)lllllllllllllIIIIlIlllIlIlIllIll;
        }
        throw new EntityNotFoundException();
    }
    
    private static void llllIIllIIlIlIl() {
        (lIlIlllIIIlIll = new String[CommandBase.lIlIlllIIlIIIl[42]])[CommandBase.lIlIlllIIlIIIl[1]] = llllIIllIIIIlll("WmJ6EGzBaC4r1VWaQq+z7qqSATAb6m5AlnjKC3cPl+4=", "NYKZC");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[2]] = llllIIllIIIlIII("ww9tGrv8JK80KDNTBHZyLod50U82hYEv/5Ckmz5mSlc=", "ZHYfa");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[4]] = llllIIllIIIlIIl("NgcuDjQ7DDBNMjAGJhE8NkYtFjh7HCwMFzwP", "UhCcU");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[5]] = llllIIllIIIlIII("QBbJKYeIaTCfmaRJujblX3BtzdbgTy9z66lz4Qu7dXA=", "xYmIK");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[0]] = llllIIllIIIIlll("wbhNEjxRBZ0Jxd1MR7sJEakKfOlki1DsAAXz8GUgiRQ=", "nbDaF");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[6]] = llllIIllIIIlIIl("DAQEARgBDxpCHgoFDB4QDEUHGRRBHwYDOwYM", "okily");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[10]] = llllIIllIIIlIIl("OQQXIgw0DwlhCj8FHz0EOUUUOgB0AhQ5DDYCHg==", "ZkzOm");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[11]] = llllIIllIIIIlll("F/mRft9Q6+73p1xnifzBet83T/32VQniZXBFBZUQH20=", "KUoPW");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[12]] = llllIIllIIIlIII("5hCVVYezxTE4qAAcd2MldUJrY0bGzXIsbzpiiWJeCQ6Gf6pRiO1W/w==", "MGSkt");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[13]] = llllIIllIIIlIIl("LTUbPwMgPgV8BSs0EyALLXQSPRcsNhN8FiE1NDsF", "NZvRb");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[14]] = llllIIllIIIIlll("YBS65XKs/EI=", "AwgTY");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[15]] = llllIIllIIIIlll("y+gFEI5MECE=", "GjTZn");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[16]] = llllIIllIIIlIII("My8lmrFvmUQ=", "tYVQU");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[17]] = llllIIllIIIlIIl("eQ==", "Iqsvj");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[18]] = llllIIllIIIIlll("f3zdKB9lPgm9XnvWEVllODpcQnnBaPM8lmILX3j9HKRnPSwP5CHJ1w==", "ltYgs");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[19]] = llllIIllIIIIlll("uJYPD0vBTfSvZMhTQAFyFH+ylDwHCMrRI6OPqTss++Zp+SH1AniPXZAtUBL6Wf/TjkVTd/XTSC7F1UAtpfzXWsHBVAc6/MMm", "XvWXi");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[20]] = llllIIllIIIIlll("upqqr+IEt4pZ+W6U2dDG7TvuyQbs5fYgQKQN8HPMNTvjbVex5YlJTw==", "cOzTV");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[21]] = llllIIllIIIlIIl("", "PHflL");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[22]] = llllIIllIIIlIIl("WQ==", "yapZs");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[23]] = llllIIllIIIlIII("30FHJhrxGDM=", "BNBVI");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[24]] = llllIIllIIIIlll("OZWN7sqUdVk=", "koVfH");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[25]] = llllIIllIIIIlll("7wF3Vz68lKx+HfhUclX2DdN2MwldWgCIKAe9PrbREzI=", "XgZhr");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[26]] = llllIIllIIIIlll("/olyMAI65kg=", "hStBY");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[27]] = llllIIllIIIlIII("0vWgbJFFQuGPHFSMUaGF2xb+VUKOWpuhQrqeIHPLzQSbPkBPQLfQRQ==", "WQAnP");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[28]] = llllIIllIIIIlll("WUwQPUSYB2tLU2ZELUx/QiHtoOUW9YW7huPswH9uW2o=", "qUzwD");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[29]] = llllIIllIIIIlll("VjlZuP0uUrY=", "vzwTH");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[30]] = llllIIllIIIIlll("HW4ugDDMfyDOJTcx9jX9nKCQZsAoyLwyCGf+Zem9HVg=", "RaLXM");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[31]] = llllIIllIIIlIII("UAagmhmKWP4=", "rKifi");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[32]] = llllIIllIIIlIII("fc/XlpnQ0+7pi+IKeexAqM4A3bjqZXT3St348us2ZMXWDtAut94CRA==", "JKsRo");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[33]] = llllIIllIIIIlll("jGip9E7Rh+zv49IO9lMiXwsMppyNH09QG7S2bNdXiRU=", "zJkbh");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[34]] = llllIIllIIIlIII("SmwV8qq59m+VcWaAUMIXdb5mE3kAlZdNgqx3dzMV2dA=", "HTwoJ");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[35]] = llllIIllIIIlIIl("DiAZBA4DKwdHCAQ5EUcNASAXAkEDIAAvABghEA==", "mOtio");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[36]] = llllIIllIIIlIIl("Ozw+Ig82NyBhCTElNmEMNDwwJEA2PCcJAS09Nw==", "XSSOn");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[37]] = llllIIllIIIIlll("OWO2DCpkyHU=", "OzpFY");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[38]] = llllIIllIIIIlll("pW9wxC/Tkcc=", "YHUAz");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[39]] = llllIIllIIIlIII("GnlpRjjzHu8=", "zjcEf");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[40]] = llllIIllIIIIlll("jLzBd3T3K2Y=", "poqAV");
        CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[41]] = llllIIllIIIlIII("eZuyvAGcLI8=", "HWWWB");
    }
    
    private static int llllIIllIlIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static CoordinateArg parseCoordinate(final double lllllllllllllIIIIlIlllIlIIIIIIll, final String lllllllllllllIIIIlIlllIIllllllll, final boolean lllllllllllllIIIIlIlllIIlllllllI) throws NumberInvalidException {
        return parseCoordinate(lllllllllllllIIIIlIlllIlIIIIIIll, lllllllllllllIIIIlIlllIIllllllll, CommandBase.lIlIlllIIlIIIl[7], CommandBase.lIlIlllIIlIIIl[8], lllllllllllllIIIIlIlllIIlllllllI);
    }
    
    @Override
    public List<String> getCommandAliases() {
        return Collections.emptyList();
    }
    
    private static boolean llllIIllIIllIlI(final int lllllllllllllIIIIlIllIlllIllIlIl, final int lllllllllllllIIIIlIllIlllIllIlII) {
        return lllllllllllllIIIIlIllIlllIllIlIl > lllllllllllllIIIIlIllIlllIllIlII;
    }
    
    private static String llllIIllIIIlIIl(String lllllllllllllIIIIlIllIlllllIlIll, final String lllllllllllllIIIIlIllIllllllIIlI) {
        lllllllllllllIIIIlIllIlllllIlIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIllIlllllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIllIllllllIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIllIlllllIllll = lllllllllllllIIIIlIllIllllllIIlI.toCharArray();
        int lllllllllllllIIIIlIllIlllllIllIl = CommandBase.lIlIlllIIlIIIl[1];
        final byte lllllllllllllIIIIlIllIlllllIIlIl = (Object)((String)lllllllllllllIIIIlIllIlllllIlIll).toCharArray();
        final float lllllllllllllIIIIlIllIlllllIIIll = lllllllllllllIIIIlIllIlllllIIlIl.length;
        Exception lllllllllllllIIIIlIllIlllllIIIlI = (Exception)CommandBase.lIlIlllIIlIIIl[1];
        while (llllIIllIIllIIl((int)lllllllllllllIIIIlIllIlllllIIIlI, (int)lllllllllllllIIIIlIllIlllllIIIll)) {
            final char lllllllllllllIIIIlIllIllllllIlIl = lllllllllllllIIIIlIllIlllllIIlIl[lllllllllllllIIIIlIllIlllllIIIlI];
            lllllllllllllIIIIlIllIllllllIIIl.append((char)(lllllllllllllIIIIlIllIllllllIlIl ^ lllllllllllllIIIIlIllIlllllIllll[lllllllllllllIIIIlIllIlllllIllIl % lllllllllllllIIIIlIllIlllllIllll.length]));
            "".length();
            ++lllllllllllllIIIIlIllIlllllIllIl;
            ++lllllllllllllIIIIlIllIlllllIIIlI;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIllIllllllIIIl);
    }
    
    public static List<String> getListOfStringsMatchingLastWord(final String[] lllllllllllllIIIIlIlllIIIllIllll, final String... lllllllllllllIIIIlIlllIIIllIllII) {
        return getListOfStringsMatchingLastWord(lllllllllllllIIIIlIlllIIIllIllll, Arrays.asList(lllllllllllllIIIIlIlllIIIllIllII));
    }
    
    public static List<Entity> func_175763_c(final ICommandSender lllllllllllllIIIIlIlllIlIlIIllll, final String lllllllllllllIIIIlIlllIlIlIIlllI) throws EntityNotFoundException {
        List<Entity> list;
        if (llllIIllIlIIIIl(PlayerSelector.hasArguments(lllllllllllllIIIIlIlllIlIlIIlllI) ? 1 : 0)) {
            list = PlayerSelector.matchEntities(lllllllllllllIIIIlIlllIlIlIIllll, lllllllllllllIIIIlIlllIlIlIIlllI, (Class<? extends Entity>)Entity.class);
            "".length();
            if (((0xDA ^ 0x82) & ~(0xC3 ^ 0x9B)) > "  ".length()) {
                return null;
            }
        }
        else {
            final Entity[] array = new Entity[CommandBase.lIlIlllIIlIIIl[2]];
            array[CommandBase.lIlIlllIIlIIIl[1]] = func_175768_b(lllllllllllllIIIIlIlllIlIlIIllll, lllllllllllllIIIIlIlllIlIlIIlllI);
            list = (List<Entity>)Lists.newArrayList((Object[])array);
        }
        return list;
    }
    
    private static boolean llllIIllIlIlIlI(final int lllllllllllllIIIIlIllIlllIlIIlIl, final int lllllllllllllIIIIlIllIlllIlIIlII) {
        return lllllllllllllIIIIlIllIlllIlIIlIl != lllllllllllllIIIIlIllIlllIlIIlII;
    }
    
    public static Item getItemByText(final ICommandSender lllllllllllllIIIIlIlllIIllIIIIIl, final String lllllllllllllIIIIlIlllIIllIIIIII) throws NumberInvalidException {
        final ResourceLocation lllllllllllllIIIIlIlllIIlIllllll = new ResourceLocation(lllllllllllllIIIIlIlllIIllIIIIII);
        final Item lllllllllllllIIIIlIlllIIlIlllllI = Item.itemRegistry.getObject(lllllllllllllIIIIlIlllIIlIllllll);
        if (llllIIllIlIIIlI(lllllllllllllIIIIlIlllIIlIlllllI)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[34]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIIlIllllll;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        return lllllllllllllIIIIlIlllIIlIlllllI;
    }
    
    private static int llllIIllIlIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static long parseLong(final String lllllllllllllIIIIlIlllIllIllIIll) throws NumberInvalidException {
        try {
            return Long.parseLong(lllllllllllllIIIIlIlllIllIllIIll);
        }
        catch (NumberFormatException lllllllllllllIIIIlIlllIllIllIIlI) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandBase.lIlIlllIIIlIll[CommandBase.lIlIlllIIlIIIl[5]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandBase.lIlIlllIIlIIIl[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandBase.lIlIlllIIlIIIl[1]] = lllllllllllllIIIIlIlllIllIllIIll;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
    }
    
    public static List<String> getListOfStringsMatchingLastWord(final String[] lllllllllllllIIIIlIlllIIIllIIlIl, final Collection<?> lllllllllllllIIIIlIlllIIIllIIlII) {
        final String lllllllllllllIIIIlIlllIIIllIIIll = lllllllllllllIIIIlIlllIIIllIIlIl[lllllllllllllIIIIlIlllIIIllIIlIl.length - CommandBase.lIlIlllIIlIIIl[2]];
        final List<String> lllllllllllllIIIIlIlllIIIllIIIlI = (List<String>)Lists.newArrayList();
        if (llllIIllIIllllI(lllllllllllllIIIIlIlllIIIllIIlII.isEmpty() ? 1 : 0)) {
            short lllllllllllllIIIIlIlllIIIlIllIIl = (short)Iterables.transform((Iterable)lllllllllllllIIIIlIlllIIIllIIlII, Functions.toStringFunction()).iterator();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
            while (!llllIIllIIllllI(((Iterator)lllllllllllllIIIIlIlllIIIlIllIIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIIlIlllIIIllIIIII = ((Iterator<String>)lllllllllllllIIIIlIlllIIIlIllIIl).next();
                if (llllIIllIlIIIIl(doesStringStartWith(lllllllllllllIIIIlIlllIIIllIIIll, lllllllllllllIIIIlIlllIIIllIIIII) ? 1 : 0)) {
                    lllllllllllllIIIIlIlllIIIllIIIlI.add(lllllllllllllIIIIlIlllIIIllIIIII);
                    "".length();
                }
            }
            if (llllIIllIlIIIIl(lllllllllllllIIIIlIlllIIIllIIIlI.isEmpty() ? 1 : 0)) {
                lllllllllllllIIIIlIlllIIIlIllIIl = (short)lllllllllllllIIIIlIlllIIIllIIlII.iterator();
                "".length();
                if ("   ".length() == (0x8D ^ 0xA5 ^ (0x2F ^ 0x3))) {
                    return null;
                }
                while (!llllIIllIIllllI(((Iterator)lllllllllllllIIIIlIlllIIIlIllIIl).hasNext() ? 1 : 0)) {
                    final Object lllllllllllllIIIIlIlllIIIlIlllll = ((Iterator<Object>)lllllllllllllIIIIlIlllIIIlIllIIl).next();
                    if (llllIIllIlIIIIl((lllllllllllllIIIIlIlllIIIlIlllll instanceof ResourceLocation) ? 1 : 0) && llllIIllIlIIIIl(doesStringStartWith(lllllllllllllIIIIlIlllIIIllIIIll, ((ResourceLocation)lllllllllllllIIIIlIlllIIIlIlllll).getResourcePath()) ? 1 : 0)) {
                        lllllllllllllIIIIlIlllIIIllIIIlI.add(String.valueOf(lllllllllllllIIIIlIlllIIIlIlllll));
                        "".length();
                    }
                }
            }
        }
        return lllllllllllllIIIIlIlllIIIllIIIlI;
    }
    
    public static String getEntityName(final ICommandSender lllllllllllllIIIIlIlllIlIIlllIlI, final String lllllllllllllIIIIlIlllIlIIlllIIl) throws EntityNotFoundException {
        try {
            return getPlayer(lllllllllllllIIIIlIlllIlIIlllIlI, lllllllllllllIIIIlIlllIlIIlllIIl).getName();
        }
        catch (PlayerNotFoundException lllllllllllllIIIIlIlllIlIIllllII) {
            try {
                return func_175768_b(lllllllllllllIIIIlIlllIlIIlllIlI, lllllllllllllIIIIlIlllIlIIlllIIl).getUniqueID().toString();
            }
            catch (EntityNotFoundException lllllllllllllIIIIlIlllIlIIlllIll) {
                if (llllIIllIlIIIIl(PlayerSelector.hasArguments(lllllllllllllIIIIlIlllIlIIlllIIl) ? 1 : 0)) {
                    throw lllllllllllllIIIIlIlllIlIIlllIll;
                }
                return lllllllllllllIIIIlIlllIlIIlllIIl;
            }
        }
    }
    
    private static int llllIIllIIlllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static class CoordinateArg
    {
        private final /* synthetic */ double field_179633_a;
        private final /* synthetic */ double field_179631_b;
        private final /* synthetic */ boolean field_179632_c;
        
        protected CoordinateArg(final double lllllllllllllIlIlIlllIlIlIlIlllI, final double lllllllllllllIlIlIlllIlIlIlIlIIl, final boolean lllllllllllllIlIlIlllIlIlIlIlIII) {
            this.field_179633_a = lllllllllllllIlIlIlllIlIlIlIlllI;
            this.field_179631_b = lllllllllllllIlIlIlllIlIlIlIlIIl;
            this.field_179632_c = lllllllllllllIlIlIlllIlIlIlIlIII;
        }
        
        public double func_179628_a() {
            return this.field_179633_a;
        }
        
        public double func_179629_b() {
            return this.field_179631_b;
        }
        
        public boolean func_179630_c() {
            return this.field_179632_c;
        }
    }
}
