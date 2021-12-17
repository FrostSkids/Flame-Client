// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import java.util.Collection;
import net.minecraft.potion.Potion;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.server.MinecraftServer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandEffect extends CommandBase
{
    private static final /* synthetic */ int[] lIIllIlIIIIIlI;
    private static final /* synthetic */ String[] lIIllIIllIIIII;
    
    private static String llIlIllllIIIIIl(final String lllllllllllllIIlIlIllIllIllIIllI, final String lllllllllllllIIlIlIllIllIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIllIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIllIllIIlll.getBytes(StandardCharsets.UTF_8)), CommandEffect.lIIllIlIIIIIlI[13]), "DES");
            final Cipher lllllllllllllIIlIlIllIllIllIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIlIllIllIllIlIlI.init(CommandEffect.lIIllIlIIIIIlI[1], lllllllllllllIIlIlIllIllIllIlIll);
            return new String(lllllllllllllIIlIlIllIllIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIllIllIlIIl) {
            lllllllllllllIIlIlIllIllIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIllllIIIlll() {
        (lIIllIIllIIIII = new String[CommandEffect.lIIllIlIIIIIlI[18]])[CommandEffect.lIIllIlIIIIIlI[0]] = llIlIlllIlllllI("UxbuXcsO7iU=", "PJPpb");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[2]] = llIlIllllIIIIIl("N69ej6A9ZGsDCI/mmGL1NOyiWRXzZEmV", "KTUtK");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[1]] = llIlIllllIIIIIl("K1DSq5fs2ZOQnxUG6GDR/gq8kPl+Um58", "ltRrz");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[3]] = llIlIllllIIIIIl("3yL8SlNRA6w=", "gOHfL");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[4]] = llIlIlllIlllllI("VKRF6iycV/WN/udAN6Wup4R4yGZqZHFdFmn1+faAq3GBWz+xxPi7Dw==", "pqaox");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[5]] = llIlIllllIIIIIl("TOja0y6ZxX3GxfVgTgan8NMFXE5nb6kupUKmA9flls5YzW+xFP7qLA==", "LUrcf");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[11]] = llIlIllllIIIIIl("cenJD57jPKQ=", "fIyCw");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[12]] = llIlIlllIlllllI("Z7kb8XhTf/Hr6eL5TUeyVEZkqNy9yuP6", "bTizj");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[13]] = llIlIlllIlllllI("QgWehCMKn2DSxmp6Ryxlt//lnuOvcn2B7FKWrYgUtRs=", "SSPFJ");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[14]] = llIlIllllIIIllI("JS0hKigoJj9pLCAkKSQ9aCQtLiUzMClpJyk2DSQ9LzQp", "FBLGI");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[15]] = llIlIllllIIIIIl("Izw6AYBbc+e2szjau4v8gF5E5PNHJrKyg0D+hz//wVI=", "uTrqX");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[16]] = llIlIllllIIIIIl("Mjj50BDe8Dk=", "yZTSQ");
        CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[17]] = llIlIlllIlllllI("uDTBktXFbD4=", "mLTxQ");
    }
    
    private static boolean llIllIIIIIIllll(final int lllllllllllllIIlIlIllIllIIllIIll, final int lllllllllllllIIlIlIllIllIIllIIlI) {
        return lllllllllllllIIlIlIllIllIIllIIll < lllllllllllllIIlIlIllIllIIllIIlI;
    }
    
    @Override
    public String getCommandName() {
        return CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[0]];
    }
    
    protected String[] getAllUsernames() {
        return MinecraftServer.getServer().getAllUsernames();
    }
    
    private static boolean llIllIIIIIlIIII(final int lllllllllllllIIlIlIllIllIIlIllII) {
        return lllllllllllllIIlIlIllIllIIlIllII != 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIlIlIllIllIllllIlI, final String[] lllllllllllllIIlIlIllIllIllllIIl, final BlockPos lllllllllllllIIlIlIllIllIllllIII) {
        List<String> list;
        if (llIllIIIIIlIllI(lllllllllllllIIlIlIllIllIllllIIl.length, CommandEffect.lIIllIlIIIIIlI[2])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIlIllIllIllllIIl, this.getAllUsernames());
            "".length();
            if ((42 + 155 - 79 + 40 ^ 16 + 94 - 108 + 153) == 0x0) {
                return null;
            }
        }
        else if (llIllIIIIIlIllI(lllllllllllllIIlIlIllIllIllllIIl.length, CommandEffect.lIIllIlIIIIIlI[1])) {
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIlIllIllIllllIIl, Potion.func_181168_c());
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else if (llIllIIIIIlIllI(lllllllllllllIIlIlIllIllIllllIIl.length, CommandEffect.lIIllIlIIIIIlI[5])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandEffect.lIIllIlIIIIIlI[1]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandEffect.lIIllIlIIIIIlI[0]] = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[16]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandEffect.lIIllIlIIIIIlI[2]] = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[17]];
            list = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIIlIlIllIllIllllIIl, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if ("  ".length() == ((151 + 43 - 78 + 119 ^ 139 + 155 - 206 + 106) & (175 + 167 - 191 + 38 ^ 36 + 102 - 116 + 126 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    private static String llIlIllllIIIllI(String lllllllllllllIIlIlIllIllIlIlIIll, final String lllllllllllllIIlIlIllIllIlIlIIlI) {
        lllllllllllllIIlIlIllIllIlIlIIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIllIllIlIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIllIllIlIlIllI = new StringBuilder();
        final char[] lllllllllllllIIlIlIllIllIlIlIlIl = lllllllllllllIIlIlIllIllIlIlIIlI.toCharArray();
        int lllllllllllllIIlIlIllIllIlIlIlII = CommandEffect.lIIllIlIIIIIlI[0];
        final int lllllllllllllIIlIlIllIllIlIIlllI = (Object)((String)lllllllllllllIIlIlIllIllIlIlIIll).toCharArray();
        final double lllllllllllllIIlIlIllIllIlIIllIl = lllllllllllllIIlIlIllIllIlIIlllI.length;
        String lllllllllllllIIlIlIllIllIlIIllII = (String)CommandEffect.lIIllIlIIIIIlI[0];
        while (llIllIIIIIIllll((int)lllllllllllllIIlIlIllIllIlIIllII, (int)lllllllllllllIIlIlIllIllIlIIllIl)) {
            final char lllllllllllllIIlIlIllIllIlIllIIl = lllllllllllllIIlIlIllIllIlIIlllI[lllllllllllllIIlIlIllIllIlIIllII];
            lllllllllllllIIlIlIllIllIlIlIllI.append((char)(lllllllllllllIIlIlIllIllIlIllIIl ^ lllllllllllllIIlIlIllIllIlIlIlIl[lllllllllllllIIlIlIllIllIlIlIlII % lllllllllllllIIlIlIllIllIlIlIlIl.length]));
            "".length();
            ++lllllllllllllIIlIlIllIllIlIlIlII;
            ++lllllllllllllIIlIlIllIllIlIIllII;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIllIllIlIlIllI);
    }
    
    private static boolean llIllIIIIIlIllI(final int lllllllllllllIIlIlIllIllIIlllIll, final int lllllllllllllIIlIlIllIllIIlllIlI) {
        return lllllllllllllIIlIlIllIllIIlllIll == lllllllllllllIIlIlIllIllIIlllIlI;
    }
    
    private static String llIlIlllIlllllI(final String lllllllllllllIIlIlIllIllIlIIIIll, final String lllllllllllllIIlIlIllIllIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIllIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIllIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIllIllIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIllIllIlIIIlIl.init(CommandEffect.lIIllIlIIIIIlI[1], lllllllllllllIIlIlIllIllIlIIIllI);
            return new String(lllllllllllllIIlIlIllIllIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIllIlIIIlII) {
            lllllllllllllIIlIlIllIllIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void llIllIIIIIIlllI() {
        (lIIllIlIIIIIlI = new int[19])[0] = ((0x11 ^ 0x3A) & ~(0x8A ^ 0xA1));
        CommandEffect.lIIllIlIIIIIlI[1] = "  ".length();
        CommandEffect.lIIllIlIIIIIlI[2] = " ".length();
        CommandEffect.lIIllIlIIIIIlI[3] = "   ".length();
        CommandEffect.lIIllIlIIIIIlI[4] = (0x73 ^ 0x77);
        CommandEffect.lIIllIlIIIIIlI[5] = (0x19 ^ 0x7C ^ (0xE2 ^ 0x82));
        CommandEffect.lIIllIlIIIIIlI[6] = (-(0xFFFFC7D5 & 0x3DAE) & (0xFFFFE7FB & 0x1FDF));
        CommandEffect.lIIllIlIIIIIlI[7] = (0x63 ^ 0x7D);
        CommandEffect.lIIllIlIIIIIlI[8] = (0xFFFFFF57 & 0xF42E8);
        CommandEffect.lIIllIlIIIIIlI[9] = (0xD3 ^ 0xC7);
        CommandEffect.lIIllIlIIIIIlI[10] = 244 + 111 - 274 + 174;
        CommandEffect.lIIllIlIIIIIlI[11] = (0x7D ^ 0x7B);
        CommandEffect.lIIllIlIIIIIlI[12] = (0x80 ^ 0x87);
        CommandEffect.lIIllIlIIIIIlI[13] = (152 + 36 - 38 + 8 ^ 47 + 118 - 57 + 42);
        CommandEffect.lIIllIlIIIIIlI[14] = (0x5B ^ 0x52);
        CommandEffect.lIIllIlIIIIIlI[15] = (0xC8 ^ 0xC2);
        CommandEffect.lIIllIlIIIIIlI[16] = (0x3B ^ 0x30);
        CommandEffect.lIIllIlIIIIIlI[17] = (0x9C ^ 0x90);
        CommandEffect.lIIllIlIIIIIlI[18] = (0x7A ^ 0x77);
    }
    
    private static boolean llIllIIIIIlIlIl(final int lllllllllllllIIlIlIllIllIIlIIllI) {
        return lllllllllllllIIlIlIllIllIIlIIllI > 0;
    }
    
    private static boolean llIllIIIIIlIIIl(final Object lllllllllllllIIlIlIllIllIIlIlllI) {
        return lllllllllllllIIlIlIllIllIIlIlllI == null;
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandEffect.lIIllIlIIIIIlI[1];
    }
    
    private static boolean llIllIIIIIlIlll(final int lllllllllllllIIlIlIllIllIIlIlIlI) {
        return lllllllllllllIIlIlIllIllIIlIlIlI == 0;
    }
    
    private static boolean llIllIIIIIlIIlI(final int lllllllllllllIIlIlIllIllIIlIlIII) {
        return lllllllllllllIIlIlIllIllIIlIlIII >= 0;
    }
    
    private static boolean llIllIIIIIlIlII(final int lllllllllllllIIlIlIllIllIIllIlll, final int lllllllllllllIIlIlIllIllIIllIllI) {
        return lllllllllllllIIlIlIllIllIIllIlll >= lllllllllllllIIlIlIllIllIIllIllI;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIlIlIllIlllIlIIIlI) {
        return CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[2]];
    }
    
    static {
        llIllIIIIIIlllI();
        llIlIllllIIIlll();
    }
    
    private static boolean llIllIIIIIlIIll(final Object lllllllllllllIIlIlIllIllIIllIIII) {
        return lllllllllllllIIlIlIllIllIIllIIII != null;
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIIlIlIllIllIlllIIlI, final int lllllllllllllIIlIlIllIllIlllIIIl) {
        if (llIllIIIIIlIlll(lllllllllllllIIlIlIllIllIlllIIIl)) {
            return CommandEffect.lIIllIlIIIIIlI[2] != 0;
        }
        return CommandEffect.lIIllIlIIIIIlI[0] != 0;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIlIlIllIlllIIIIlll, final String[] lllllllllllllIIlIlIllIlllIIlIlII) throws CommandException {
        if (llIllIIIIIIllll(lllllllllllllIIlIlIllIlllIIlIlII.length, CommandEffect.lIIllIlIIIIIlI[1])) {
            throw new WrongUsageException(CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[1]], new Object[CommandEffect.lIIllIlIIIIIlI[0]]);
        }
        final EntityLivingBase lllllllllllllIIlIlIllIlllIIlIIll = CommandBase.getEntity(lllllllllllllIIlIlIllIlllIIIIlll, lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[0]], (Class<? extends EntityLivingBase>)EntityLivingBase.class);
        if (llIllIIIIIlIIII(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[2]].equals(CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[3]]) ? 1 : 0)) {
            if (llIllIIIIIlIIII(lllllllllllllIIlIlIllIlllIIlIIll.getActivePotionEffects().isEmpty() ? 1 : 0)) {
                final String lllllllllllllIlIIIIIIlIlIllIlIIl = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[4]];
                final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandEffect.lIIllIlIIIIIlI[2]];
                lllllllllllllIlIIIIIIlIlIllIIlIl[CommandEffect.lIIllIlIIIIIlI[0]] = lllllllllllllIIlIlIllIlllIIlIIll.getName();
                throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl, lllllllllllllIlIIIIIIlIlIllIIlIl);
            }
            lllllllllllllIIlIlIllIlllIIlIIll.clearActivePotions();
            final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[5]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandEffect.lIIllIlIIIIIlI[2]];
            lllllllllllllIIIIlIlllIIIlIIIlll[CommandEffect.lIIllIlIIIIIlI[0]] = lllllllllllllIIlIlIllIlllIIlIIll.getName();
            CommandBase.notifyOperators(lllllllllllllIIlIlIllIlllIIIIlll, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            int lllllllllllllIIlIlIllIlllIIlIIIl = 0;
            try {
                final int lllllllllllllIIlIlIllIlllIIlIIlI = CommandBase.parseInt(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[2]], CommandEffect.lIIllIlIIIIIlI[2]);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            catch (NumberInvalidException lllllllllllllIIlIlIllIlllIIlIIII) {
                final Potion lllllllllllllIIlIlIllIlllIIIllll = Potion.getPotionFromResourceLocation(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[2]]);
                if (llIllIIIIIlIIIl(lllllllllllllIIlIlIllIlllIIIllll)) {
                    throw lllllllllllllIIlIlIllIlllIIlIIII;
                }
                lllllllllllllIIlIlIllIlllIIlIIIl = lllllllllllllIIlIlIllIlllIIIllll.id;
            }
            int lllllllllllllIIlIlIllIlllIIIlllI = CommandEffect.lIIllIlIIIIIlI[6];
            int lllllllllllllIIlIlIllIlllIIIllIl = CommandEffect.lIIllIlIIIIIlI[7];
            int lllllllllllllIIlIlIllIlllIIIllII = CommandEffect.lIIllIlIIIIIlI[0];
            if (!llIllIIIIIlIIlI(lllllllllllllIIlIlIllIlllIIlIIIl) || !llIllIIIIIIllll(lllllllllllllIIlIlIllIlllIIlIIIl, Potion.potionTypes.length) || !llIllIIIIIlIIll(Potion.potionTypes[lllllllllllllIIlIlIllIlllIIlIIIl])) {
                final String lllllllllllllIIlIIIIIIIlIIlllIIl = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[15]];
                final Object[] lllllllllllllIIlIIIIIIIlIIlllIll = new Object[CommandEffect.lIIllIlIIIIIlI[2]];
                lllllllllllllIIlIIIIIIIlIIlllIll[CommandEffect.lIIllIlIIIIIlI[0]] = lllllllllllllIIlIlIllIlllIIlIIIl;
                throw new NumberInvalidException(lllllllllllllIIlIIIIIIIlIIlllIIl, lllllllllllllIIlIIIIIIIlIIlllIll);
            }
            final Potion lllllllllllllIIlIlIllIlllIIIlIll = Potion.potionTypes[lllllllllllllIIlIlIllIlllIIlIIIl];
            if (llIllIIIIIlIlII(lllllllllllllIIlIlIllIlllIIlIlII.length, CommandEffect.lIIllIlIIIIIlI[3])) {
                lllllllllllllIIlIlIllIlllIIIllIl = CommandBase.parseInt(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[1]], CommandEffect.lIIllIlIIIIIlI[0], CommandEffect.lIIllIlIIIIIlI[8]);
                if (llIllIIIIIlIIII(lllllllllllllIIlIlIllIlllIIIlIll.isInstant() ? 1 : 0)) {
                    lllllllllllllIIlIlIllIlllIIIlllI = lllllllllllllIIlIlIllIlllIIIllIl;
                    "".length();
                    if (((0x2 ^ 0x4A ^ (0x31 ^ 0x45)) & (96 + 20 - 98 + 113 ^ 189 + 110 - 228 + 120 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIlIllIlllIIIlllI = lllllllllllllIIlIlIllIlllIIIllIl * CommandEffect.lIIllIlIIIIIlI[9];
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
            }
            else if (llIllIIIIIlIIII(lllllllllllllIIlIlIllIlllIIIlIll.isInstant() ? 1 : 0)) {
                lllllllllllllIIlIlIllIlllIIIlllI = CommandEffect.lIIllIlIIIIIlI[2];
            }
            if (llIllIIIIIlIlII(lllllllllllllIIlIlIllIlllIIlIlII.length, CommandEffect.lIIllIlIIIIIlI[4])) {
                lllllllllllllIIlIlIllIlllIIIllII = CommandBase.parseInt(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[3]], CommandEffect.lIIllIlIIIIIlI[0], CommandEffect.lIIllIlIIIIIlI[10]);
            }
            boolean lllllllllllllIIlIlIllIlllIIIlIlI = CommandEffect.lIIllIlIIIIIlI[2] != 0;
            if (llIllIIIIIlIlII(lllllllllllllIIlIlIllIlllIIlIlII.length, CommandEffect.lIIllIlIIIIIlI[5]) && llIllIIIIIlIIII(CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[11]].equalsIgnoreCase(lllllllllllllIIlIlIllIlllIIlIlII[CommandEffect.lIIllIlIIIIIlI[4]]) ? 1 : 0)) {
                lllllllllllllIIlIlIllIlllIIIlIlI = (CommandEffect.lIIllIlIIIIIlI[0] != 0);
            }
            if (llIllIIIIIlIlIl(lllllllllllllIIlIlIllIlllIIIllIl)) {
                final PotionEffect lllllllllllllIIlIlIllIlllIIIlIIl = new PotionEffect(lllllllllllllIIlIlIllIlllIIlIIIl, lllllllllllllIIlIlIllIlllIIIlllI, lllllllllllllIIlIlIllIlllIIIllII, (boolean)(CommandEffect.lIIllIlIIIIIlI[0] != 0), lllllllllllllIIlIlIllIlllIIIlIlI);
                lllllllllllllIIlIlIllIlllIIlIIll.addPotionEffect(lllllllllllllIIlIlIllIlllIIIlIIl);
                final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[12]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandEffect.lIIllIlIIIIIlI[5]];
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandEffect.lIIllIlIIIIIlI[0]] = new ChatComponentTranslation(lllllllllllllIIlIlIllIlllIIIlIIl.getEffectName(), new Object[CommandEffect.lIIllIlIIIIIlI[0]]);
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandEffect.lIIllIlIIIIIlI[2]] = lllllllllllllIIlIlIllIlllIIlIIIl;
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandEffect.lIIllIlIIIIIlI[1]] = lllllllllllllIIlIlIllIlllIIIllII;
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandEffect.lIIllIlIIIIIlI[3]] = lllllllllllllIIlIlIllIlllIIlIIll.getName();
                lllllllllllllIIIIlIlllIIIlIIIlll2[CommandEffect.lIIllIlIIIIIlI[4]] = lllllllllllllIIlIlIllIlllIIIllIl;
                CommandBase.notifyOperators(lllllllllllllIIlIlIllIlllIIIIlll, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                if (!llIllIIIIIlIIII(lllllllllllllIIlIlIllIlllIIlIIll.isPotionActive(lllllllllllllIIlIlIllIlllIIlIIIl) ? 1 : 0)) {
                    final String lllllllllllllIlIIIIIIlIlIllIlIIl2 = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[14]];
                    final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl2 = new Object[CommandEffect.lIIllIlIIIIIlI[1]];
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandEffect.lIIllIlIIIIIlI[0]] = new ChatComponentTranslation(lllllllllllllIIlIlIllIlllIIIlIll.getName(), new Object[CommandEffect.lIIllIlIIIIIlI[0]]);
                    lllllllllllllIlIIIIIIlIlIllIIlIl2[CommandEffect.lIIllIlIIIIIlI[2]] = lllllllllllllIIlIlIllIlllIIlIIll.getName();
                    throw new CommandException(lllllllllllllIlIIIIIIlIlIllIlIIl2, lllllllllllllIlIIIIIIlIlIllIIlIl2);
                }
                lllllllllllllIIlIlIllIlllIIlIIll.removePotionEffect(lllllllllllllIIlIlIllIlllIIlIIIl);
                final String lllllllllllllIIIIlIlllIIIlIIIlII3 = CommandEffect.lIIllIIllIIIII[CommandEffect.lIIllIlIIIIIlI[13]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll3 = new Object[CommandEffect.lIIllIlIIIIIlI[1]];
                lllllllllllllIIIIlIlllIIIlIIIlll3[CommandEffect.lIIllIlIIIIIlI[0]] = new ChatComponentTranslation(lllllllllllllIIlIlIllIlllIIIlIll.getName(), new Object[CommandEffect.lIIllIlIIIIIlI[0]]);
                lllllllllllllIIIIlIlllIIIlIIIlll3[CommandEffect.lIIllIlIIIIIlI[2]] = lllllllllllllIIlIlIllIlllIIlIIll.getName();
                CommandBase.notifyOperators(lllllllllllllIIlIlIllIlllIIIIlll, this, lllllllllllllIIIIlIlllIIIlIIIlII3, lllllllllllllIIIIlIlllIIIlIIIlll3);
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
    }
}
