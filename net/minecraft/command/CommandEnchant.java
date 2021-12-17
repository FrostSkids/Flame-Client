// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Collection;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandEnchant extends CommandBase
{
    private static final /* synthetic */ int[] llIlIllIIlIIll;
    private static final /* synthetic */ String[] llIlIllIIlIIIl;
    
    private static boolean lIIlIlIlIIlIIIIl(final Object llllllllllllIllIlIIllIlIIIIIIllI) {
        return llllllllllllIllIlIIllIlIIIIIIllI != null;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] llllllllllllIllIlIIllIlIIlIIlIII, final int llllllllllllIllIlIIllIlIIlIIIllI) {
        if (lIIlIlIlIIIllllI(llllllllllllIllIlIIllIlIIlIIIllI)) {
            return CommandEnchant.llIlIllIIlIIll[2] != 0;
        }
        return CommandEnchant.llIlIllIIlIIll[0] != 0;
    }
    
    private static void lIIlIlIlIIIllIll() {
        (llIlIllIIlIIll = new int[11])[0] = ((0x46 ^ 0x5B) & ~(0x17 ^ 0xA));
        CommandEnchant.llIlIllIIlIIll[1] = "  ".length();
        CommandEnchant.llIlIllIIlIIll[2] = " ".length();
        CommandEnchant.llIlIllIIlIIll[3] = "   ".length();
        CommandEnchant.llIlIllIIlIIll[4] = (0x65 ^ 0x72 ^ (0x6C ^ 0x7F));
        CommandEnchant.llIlIllIIlIIll[5] = (48 + 78 - 85 + 97 ^ 46 + 134 - 39 + 2);
        CommandEnchant.llIlIllIIlIIll[6] = (0x76 ^ 0x24 ^ (0x72 ^ 0x26));
        CommandEnchant.llIlIllIIlIIll[7] = (0x70 ^ 0x77);
        CommandEnchant.llIlIllIIlIIll[8] = (0x90 ^ 0x8A ^ (0x50 ^ 0x42));
        CommandEnchant.llIlIllIIlIIll[9] = (79 + 9 - 6 + 85 ^ 136 + 99 - 161 + 100);
        CommandEnchant.llIlIllIIlIIll[10] = (0x32 ^ 0x53 ^ (0x55 ^ 0x3E));
    }
    
    private static String lIIlIlIlIIIIllll(final String llllllllllllIllIlIIllIlIIIIlIlll, final String llllllllllllIllIlIIllIlIIIIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIlIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), CommandEnchant.llIlIllIIlIIll[8]), "DES");
            final Cipher llllllllllllIllIlIIllIlIIIIllIll = Cipher.getInstance("DES");
            llllllllllllIllIlIIllIlIIIIllIll.init(CommandEnchant.llIlIllIIlIIll[1], llllllllllllIllIlIIllIlIIIIlllII);
            return new String(llllllllllllIllIlIIllIlIIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIlIIIIllIlI) {
            llllllllllllIllIlIIllIlIIIIllIlI.printStackTrace();
            return null;
        }
    }
    
    protected String[] getListOfPlayers() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static boolean lIIlIlIlIIlIIIlI(final int llllllllllllIllIlIIllIlIIIIlIIIl, final int llllllllllllIllIlIIllIlIIIIlIIII) {
        return llllllllllllIllIlIIllIlIIIIlIIIl == llllllllllllIllIlIIllIlIIIIlIIII;
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIlIIllIlIIlllIIlI, final String[] llllllllllllIllIlIIllIlIIlllIIII) throws CommandException {
        if (lIIlIlIlIIIlllII(llllllllllllIllIlIIllIlIIlllIIII.length, CommandEnchant.llIlIllIIlIIll[1])) {
            throw new WrongUsageException(CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[1]], new Object[CommandEnchant.llIlIllIIlIIll[0]]);
        }
        final EntityPlayer llllllllllllIllIlIIllIlIIllIllll = CommandBase.getPlayer(llllllllllllIllIlIIllIlIIlllIIlI, llllllllllllIllIlIIllIlIIlllIIII[CommandEnchant.llIlIllIIlIIll[0]]);
        llllllllllllIllIlIIllIlIIlllIIlI.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, CommandEnchant.llIlIllIIlIIll[0]);
        int llllllllllllIllIlIIllIlIIllIlIll = 0;
        try {
            final int llllllllllllIllIlIIllIlIIllIllIl = CommandBase.parseInt(llllllllllllIllIlIIllIlIIlllIIII[CommandEnchant.llIlIllIIlIIll[2]], CommandEnchant.llIlIllIIlIIll[0]);
            "".length();
            if (((0x7C ^ 0x28 ^ (0xC1 ^ 0x91)) & (106 + 98 - 122 + 65 ^ 118 + 150 - 137 + 20 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (NumberInvalidException llllllllllllIllIlIIllIlIIllIlIlI) {
            final Enchantment llllllllllllIllIlIIllIlIIllIlIII = Enchantment.getEnchantmentByLocation(llllllllllllIllIlIIllIlIIlllIIII[CommandEnchant.llIlIllIIlIIll[2]]);
            if (lIIlIlIlIIIlllIl(llllllllllllIllIlIIllIlIIllIlIII)) {
                throw llllllllllllIllIlIIllIlIIllIlIlI;
            }
            llllllllllllIllIlIIllIlIIllIlIll = llllllllllllIllIlIIllIlIIllIlIII.effectId;
        }
        int llllllllllllIllIlIIllIlIIllIIllI = CommandEnchant.llIlIllIIlIIll[2];
        final ItemStack llllllllllllIllIlIIllIlIIllIIlIl = llllllllllllIllIlIIllIlIIllIllll.getCurrentEquippedItem();
        if (lIIlIlIlIIIlllIl(llllllllllllIllIlIIllIlIIllIIlIl)) {
            throw new CommandException(CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[3]], new Object[CommandEnchant.llIlIllIIlIIll[0]]);
        }
        final Enchantment llllllllllllIllIlIIllIlIIllIIlII = Enchantment.getEnchantmentById(llllllllllllIllIlIIllIlIIllIlIll);
        if (lIIlIlIlIIIlllIl(llllllllllllIllIlIIllIlIIllIIlII)) {
            final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[4]];
            final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandEnchant.llIlIllIIlIIll[2]];
            lllllllllllllIIlIIIIIIIlIIlllIll[CommandEnchant.llIlIllIIlIIll[0]] = llllllllllllIllIlIIllIlIIllIlIll;
            throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
        }
        if (lIIlIlIlIIIllllI(llllllllllllIllIlIIllIlIIllIIlII.canApply(llllllllllllIllIlIIllIlIIllIIlIl) ? 1 : 0)) {
            throw new CommandException(CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[5]], new Object[CommandEnchant.llIlIllIIlIIll[0]]);
        }
        if (lIIlIlIlIIIlllll(llllllllllllIllIlIIllIlIIlllIIII.length, CommandEnchant.llIlIllIIlIIll[3])) {
            llllllllllllIllIlIIllIlIIllIIllI = CommandBase.parseInt(llllllllllllIllIlIIllIlIIlllIIII[CommandEnchant.llIlIllIIlIIll[1]], llllllllllllIllIlIIllIlIIllIIlII.getMinLevel(), llllllllllllIllIlIIllIlIIllIIlII.getMaxLevel());
        }
        if (lIIlIlIlIIlIIIII(llllllllllllIllIlIIllIlIIllIIlIl.hasTagCompound() ? 1 : 0)) {
            final NBTTagList llllllllllllIllIlIIllIlIIllIIIll = llllllllllllIllIlIIllIlIIllIIlIl.getEnchantmentTagList();
            if (lIIlIlIlIIlIIIIl(llllllllllllIllIlIIllIlIIllIIIll)) {
                int llllllllllllIllIlIIllIlIIllIIIlI = CommandEnchant.llIlIllIIlIIll[0];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                while (!lIIlIlIlIIIlllll(llllllllllllIllIlIIllIlIIllIIIlI, llllllllllllIllIlIIllIlIIllIIIll.tagCount())) {
                    final int llllllllllllIllIlIIllIlIIllIIIIl = llllllllllllIllIlIIllIlIIllIIIll.getCompoundTagAt(llllllllllllIllIlIIllIlIIllIIIlI).getShort(CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[6]]);
                    if (lIIlIlIlIIlIIIIl(Enchantment.getEnchantmentById(llllllllllllIllIlIIllIlIIllIIIIl))) {
                        final Enchantment llllllllllllIllIlIIllIlIIllIIIII = Enchantment.getEnchantmentById(llllllllllllIllIlIIllIlIIllIIIIl);
                        if (lIIlIlIlIIIllllI(llllllllllllIllIlIIllIlIIllIIIII.canApplyTogether(llllllllllllIllIlIIllIlIIllIIlII) ? 1 : 0)) {
                            final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[7]];
                            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandEnchant.llIlIllIIlIIll[1]];
                            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandEnchant.llIlIllIIlIIll[0]] = llllllllllllIllIlIIllIlIIllIIlII.getTranslatedName(llllllllllllIllIlIIllIlIIllIIllI);
                            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandEnchant.llIlIllIIlIIll[2]] = llllllllllllIllIlIIllIlIIllIIIII.getTranslatedName(llllllllllllIllIlIIllIlIIllIIIll.getCompoundTagAt(llllllllllllIllIlIIllIlIIllIIIlI).getShort(CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[8]]));
                            throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
                        }
                    }
                    ++llllllllllllIllIlIIllIlIIllIIIlI;
                }
            }
        }
        llllllllllllIllIlIIllIlIIllIIlIl.addEnchantment(llllllllllllIllIlIIllIlIIllIIlII, llllllllllllIllIlIIllIlIIllIIllI);
        CommandBase.notifyOperators(llllllllllllIllIlIIllIlIIlllIIlI, this, CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[9]], new Object[CommandEnchant.llIlIllIIlIIll[0]]);
        llllllllllllIllIlIIllIlIIlllIIlI.setCommandStat(CommandResultStats.Type.AFFECTED_ITEMS, CommandEnchant.llIlIllIIlIIll[2]);
    }
    
    private static void lIIlIlIlIIIlIIll() {
        (llIlIllIIlIIIl = new String[CommandEnchant.llIlIllIIlIIll[10]])[CommandEnchant.llIlIllIIlIIll[0]] = lIIlIlIlIIIIllll("RdFl/Al8kMI=", "knQCt");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[2]] = lIIlIlIlIIIlIIII("Mxg1PRg+Eyt+HD4UMDEXJFktIxg3Eg==", "PwXPy");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[1]] = lIIlIlIlIIIIllll("FB3GMqsiWizmd2wfRSnxzq/RI7YDr8/k", "fyxkj");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[3]] = lIIlIlIlIIIlIIII("DSs+FwUAICBUAQAnOxsKGmo9FS0aIT4=", "nDSzd");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[4]] = lIIlIlIlIIIlIIIl("yhPJexUrcuRmYPHkAdSnK99DbUJV8XSAs9OLT2WxrC0=", "cpGEo");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[5]] = lIIlIlIlIIIlIIIl("HviEodfyfPB4e4It/ZzxknjqNqnqwc1jIgKLYZ8Y/II=", "YfJMc");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[6]] = lIIlIlIlIIIlIIII("BDY=", "mRWlF");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[7]] = lIIlIlIlIIIlIIII("Kyo/DhsmISFNHyYmOgIUPGsxAhQ8Bj0OGCErNw==", "HERcz");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[8]] = lIIlIlIlIIIlIIIl("5mzC/eHfTSs=", "UeoZt");
        CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[9]] = lIIlIlIlIIIIllll("52rpK5hWER9TGnaOr8hfAx/qFiFshBIqgSORXr5Rmnc=", "ysOuU");
    }
    
    static {
        lIIlIlIlIIIllIll();
        lIIlIlIlIIIlIIll();
    }
    
    private static String lIIlIlIlIIIlIIII(String llllllllllllIllIlIIllIlIIIllIllI, final String llllllllllllIllIlIIllIlIIIllIlIl) {
        llllllllllllIllIlIIllIlIIIllIllI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIllIlIIIlllIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIllIlIIIlllIII = llllllllllllIllIlIIllIlIIIllIlIl.toCharArray();
        int llllllllllllIllIlIIllIlIIIllIlll = CommandEnchant.llIlIllIIlIIll[0];
        final String llllllllllllIllIlIIllIlIIIllIIIl = (Object)llllllllllllIllIlIIllIlIIIllIllI.toCharArray();
        final boolean llllllllllllIllIlIIllIlIIIllIIII = llllllllllllIllIlIIllIlIIIllIIIl.length != 0;
        int llllllllllllIllIlIIllIlIIIlIllll = CommandEnchant.llIlIllIIlIIll[0];
        while (lIIlIlIlIIIlllII(llllllllllllIllIlIIllIlIIIlIllll, llllllllllllIllIlIIllIlIIIllIIII ? 1 : 0)) {
            final char llllllllllllIllIlIIllIlIIIllllII = llllllllllllIllIlIIllIlIIIllIIIl[llllllllllllIllIlIIllIlIIIlIllll];
            llllllllllllIllIlIIllIlIIIlllIIl.append((char)(llllllllllllIllIlIIllIlIIIllllII ^ llllllllllllIllIlIIllIlIIIlllIII[llllllllllllIllIlIIllIlIIIllIlll % llllllllllllIllIlIIllIlIIIlllIII.length]));
            "".length();
            ++llllllllllllIllIlIIllIlIIIllIlll;
            ++llllllllllllIllIlIIllIlIIIlIllll;
            "".length();
            if ((0x40 ^ 0x6 ^ (0xF6 ^ 0xB4)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIllIlIIIlllIIl);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIlIIllIlIIlIlIIII, final String[] llllllllllllIllIlIIllIlIIlIIllII, final BlockPos llllllllllllIllIlIIllIlIIlIIlllI) {
        List<String> list;
        if (lIIlIlIlIIlIIIlI(llllllllllllIllIlIIllIlIIlIIllII.length, CommandEnchant.llIlIllIIlIIll[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIIllIlIIlIIllII, this.getListOfPlayers());
            "".length();
            if ("  ".length() == ((0x69 ^ 0x67) & ~(0x3C ^ 0x32))) {
                return null;
            }
        }
        else if (lIIlIlIlIIlIIIlI(llllllllllllIllIlIIllIlIIlIIllII.length, CommandEnchant.llIlIllIIlIIll[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIlIIllIlIIlIIllII, Enchantment.func_181077_c());
            "".length();
            if (((123 + 46 - 63 + 49 ^ 131 + 20 - 150 + 172) & (2 + 153 - 19 + 28 ^ 46 + 100 - 131 + 131 ^ -" ".length())) == -" ".length()) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static boolean lIIlIlIlIIIllllI(final int llllllllllllIllIlIIllIlIIIIIIIII) {
        return llllllllllllIllIlIIllIlIIIIIIIII == 0;
    }
    
    private static boolean lIIlIlIlIIlIIIII(final int llllllllllllIllIlIIllIlIIIIIIIlI) {
        return llllllllllllIllIlIIllIlIIIIIIIlI != 0;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandEnchant.llIlIllIIlIIll[1];
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIlIIllIlIlIIlllII) {
        return CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[2]];
    }
    
    @Override
    public String getCommandName() {
        return CommandEnchant.llIlIllIIlIIIl[CommandEnchant.llIlIllIIlIIll[0]];
    }
    
    private static boolean lIIlIlIlIIIlllII(final int llllllllllllIllIlIIllIlIIIIIlIIl, final int llllllllllllIllIlIIllIlIIIIIlIII) {
        return llllllllllllIllIlIIllIlIIIIIlIIl < llllllllllllIllIlIIllIlIIIIIlIII;
    }
    
    private static boolean lIIlIlIlIIIlllIl(final Object llllllllllllIllIlIIllIlIIIIIIlII) {
        return llllllllllllIllIlIIllIlIIIIIIlII == null;
    }
    
    private static boolean lIIlIlIlIIIlllll(final int llllllllllllIllIlIIllIlIIIIIllIl, final int llllllllllllIllIlIIllIlIIIIIllII) {
        return llllllllllllIllIlIIllIlIIIIIllIl >= llllllllllllIllIlIIllIlIIIIIllII;
    }
    
    private static String lIIlIlIlIIIlIIIl(final String llllllllllllIllIlIIllIlIIIlIIlII, final String llllllllllllIllIlIIllIlIIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIlIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIllIlIIIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIllIlIIIlIlIII.init(CommandEnchant.llIlIllIIlIIll[1], llllllllllllIllIlIIllIlIIIlIlIIl);
            return new String(llllllllllllIllIlIIllIlIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIlIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIlIIIlIIlll) {
            llllllllllllIllIlIIllIlIIIlIIlll.printStackTrace();
            return null;
        }
    }
}
