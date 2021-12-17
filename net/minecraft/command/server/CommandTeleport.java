// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command.server;

import java.util.Set;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import java.util.EnumSet;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.command.WrongUsageException;
import java.util.Arrays;
import net.minecraft.server.MinecraftServer;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.command.ICommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.command.CommandBase;

public class CommandTeleport extends CommandBase
{
    private static final /* synthetic */ String[] lIIIlIIIIIllIl;
    private static final /* synthetic */ int[] lIIIlIIIIIlllI;
    
    private static String lIllllIlllIIllI(final String lllllllllllllIlIIIllIlIIllIlIllI, final String lllllllllllllIlIIIllIlIIllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIlIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIlIIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllIlIIllIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllIlIIllIllIII.init(CommandTeleport.lIIIlIIIIIlllI[1], lllllllllllllIlIIIllIlIIllIllIIl);
            return new String(lllllllllllllIlIIIllIlIIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIlIIllIlIlll) {
            lllllllllllllIlIIIllIlIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIllllIIII(final int lllllllllllllIlIIIllIlIIllIIIIIl) {
        return lllllllllllllIlIIIllIlIIllIIIIIl != 0;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIlIIIllIlIlIIIIlIll, final String[] lllllllllllllIlIIIllIlIlIIIIlIlI, final BlockPos lllllllllllllIlIIIllIlIlIIIIlIIl) {
        List<String> listOfStringsMatchingLastWord;
        if (lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIIIlIlI.length, CommandTeleport.lIIIlIIIIIlllI[2]) && lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIIIlIlI.length, CommandTeleport.lIIIlIIIIIlllI[1])) {
            listOfStringsMatchingLastWord = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            listOfStringsMatchingLastWord = CommandBase.getListOfStringsMatchingLastWord(lllllllllllllIlIIIllIlIlIIIIlIlI, MinecraftServer.getServer().getAllUsernames());
        }
        return listOfStringsMatchingLastWord;
    }
    
    @Override
    public String getCommandName() {
        return CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[0]];
    }
    
    private static int lIllllIlllIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIllllIlllIlIIl() {
        (lIIIlIIIIIlllI = new int[10])[0] = ((0xA6 ^ 0xA8) & ~(0x57 ^ 0x59));
        CommandTeleport.lIIIlIIIIIlllI[1] = "  ".length();
        CommandTeleport.lIIIlIIIIIlllI[2] = " ".length();
        CommandTeleport.lIIIlIIIIIlllI[3] = (0x95 ^ 0xB4 ^ (0x91 ^ 0xB4));
        CommandTeleport.lIIIlIIIIIlllI[4] = (0x68 ^ 0x6E);
        CommandTeleport.lIIIlIIIIIlllI[5] = "   ".length();
        CommandTeleport.lIIIlIIIIIlllI[6] = (46 + 120 - 126 + 91 ^ 11 + 6 + 19 + 98);
        CommandTeleport.lIIIlIIIIIlllI[7] = (78 + 107 - 70 + 68 ^ 44 + 60 - 50 + 122);
        CommandTeleport.lIIIlIIIIIlllI[8] = (0x10 ^ 0x1A ^ "  ".length());
        CommandTeleport.lIIIlIIIIIlllI[9] = (0x98 ^ 0x91);
    }
    
    private static boolean lIllllIlllIllIl(final int lllllllllllllIlIIIllIlIIlIlllIII, final int lllllllllllllIlIIIllIlIIlIllIlll) {
        return lllllllllllllIlIIIllIlIIlIlllIII != lllllllllllllIlIIIllIlIIlIllIlll;
    }
    
    private static boolean lIllllIlllIllll(final int lllllllllllllIlIIIllIlIIllIIlIlI, final int lllllllllllllIlIIIllIlIIllIIlIIl) {
        return lllllllllllllIlIIIllIlIIllIIlIlI > lllllllllllllIlIIIllIlIIllIIlIIl;
    }
    
    private static boolean lIllllIlllIllII(final int lllllllllllllIlIIIllIlIIllIIlllI, final int lllllllllllllIlIIIllIlIIllIIllIl) {
        return lllllllllllllIlIIIllIlIIllIIlllI < lllllllllllllIlIIIllIlIIllIIllIl;
    }
    
    private static String lIllllIlllIIlIl(final String lllllllllllllIlIIIllIlIIlllllIll, final String lllllllllllllIlIIIllIlIIlllllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIlIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIlIIlllllIII.getBytes(StandardCharsets.UTF_8)), CommandTeleport.lIIIlIIIIIlllI[8]), "DES");
            final Cipher lllllllllllllIlIIIllIlIIllllllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIlIIllllllIl.init(CommandTeleport.lIIIlIIIIIlllI[1], lllllllllllllIlIIIllIlIIlllllllI);
            return new String(lllllllllllllIlIIIllIlIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIlIIllllllII) {
            lllllllllllllIlIIIllIlIIllllllII.printStackTrace();
            return null;
        }
    }
    
    private static int lIllllIlllIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    static {
        lIllllIlllIlIIl();
        lIllllIlllIlIII();
    }
    
    private static boolean lIllllIllllIIll(final int lllllllllllllIlIIIllIlIIlIllllIl) {
        return lllllllllllllIlIIIllIlIIlIllllIl < 0;
    }
    
    private static boolean lIllllIlllIlllI(final Object lllllllllllllIlIIIllIlIIllIIIIll) {
        return lllllllllllllIlIIIllIlIIllIIIIll != null;
    }
    
    private static boolean lIllllIllllIlII(final Object lllllllllllllIlIIIllIlIIllIIIllI, final Object lllllllllllllIlIIIllIlIIllIIIlIl) {
        return lllllllllllllIlIIIllIlIIllIIIllI != lllllllllllllIlIIIllIlIIllIIIlIl;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIlIIIllIlIlIIIllIlI, final String[] lllllllllllllIlIIIllIlIlIIlIlIll) throws CommandException {
        if (lIllllIlllIllII(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[2])) {
            throw new WrongUsageException(CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[1]], new Object[CommandTeleport.lIIIlIIIIIlllI[0]]);
        }
        int lllllllllllllIlIIIllIlIlIIlIlIlI = CommandTeleport.lIIIlIIIIIlllI[0];
        Entity lllllllllllllIlIIIllIlIlIIlIlIII = null;
        if (lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[1]) && lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[3]) && lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[4])) {
            final Entity lllllllllllllIlIIIllIlIlIIlIlIIl = CommandBase.getCommandSenderAsPlayer(lllllllllllllIlIIIllIlIlIIIllIlI);
            "".length();
            if ((0xC ^ 0x63 ^ (0xFB ^ 0x91)) <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIllIlIlIIlIlIII = CommandBase.func_175768_b(lllllllllllllIlIIIllIlIlIIIllIlI, lllllllllllllIlIIIllIlIlIIlIlIll[CommandTeleport.lIIIlIIIIIlllI[0]]);
            lllllllllllllIlIIIllIlIlIIlIlIlI = CommandTeleport.lIIIlIIIIIlllI[2];
        }
        if (lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[2]) && lIllllIlllIllIl(lllllllllllllIlIIIllIlIlIIlIlIll.length, CommandTeleport.lIIIlIIIIIlllI[1])) {
            if (lIllllIlllIllII(lllllllllllllIlIIIllIlIlIIlIlIll.length, lllllllllllllIlIIIllIlIlIIlIlIlI + CommandTeleport.lIIIlIIIIIlllI[5])) {
                throw new WrongUsageException(CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[5]], new Object[CommandTeleport.lIIIlIIIIIlllI[0]]);
            }
            if (lIllllIlllIlllI(lllllllllllllIlIIIllIlIlIIlIlIII.worldObj)) {
                int lllllllllllllIlIIIllIlIlIIlIIlll = lllllllllllllIlIIIllIlIlIIlIlIlI + CommandTeleport.lIIIlIIIIIlllI[2];
                final CoordinateArg lllllllllllllIlIIIllIlIlIIlIIllI = CommandBase.parseCoordinate(lllllllllllllIlIIIllIlIlIIlIlIII.posX, lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIlIlI], (boolean)(CommandTeleport.lIIIlIIIIIlllI[2] != 0));
                final CoordinateArg lllllllllllllIlIIIllIlIlIIlIIlIl = CommandBase.parseCoordinate(lllllllllllllIlIIIllIlIlIIlIlIII.posY, lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIIlll++], CommandTeleport.lIIIlIIIIIlllI[0], CommandTeleport.lIIIlIIIIIlllI[0], (boolean)(CommandTeleport.lIIIlIIIIIlllI[0] != 0));
                final CoordinateArg lllllllllllllIlIIIllIlIlIIlIIlII = CommandBase.parseCoordinate(lllllllllllllIlIIIllIlIlIIlIlIII.posZ, lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIIlll++], (boolean)(CommandTeleport.lIIIlIIIIIlllI[2] != 0));
                final double lllllllllllllIIIIlIlllIlIIIIIIll = lllllllllllllIlIIIllIlIlIIlIlIII.rotationYaw;
                String lllllllllllllIIIIlIlllIIllllllll;
                if (lIllllIlllIllll(lllllllllllllIlIIIllIlIlIIlIlIll.length, lllllllllllllIlIIIllIlIlIIlIIlll)) {
                    lllllllllllllIIIIlIlllIIllllllll = lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIIlll++];
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIlIlllIIllllllll = CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[3]];
                }
                final CoordinateArg lllllllllllllIlIIIllIlIlIIlIIIll = CommandBase.parseCoordinate(lllllllllllllIIIIlIlllIlIIIIIIll, lllllllllllllIIIIlIlllIIllllllll, (boolean)(CommandTeleport.lIIIlIIIIIlllI[0] != 0));
                final double lllllllllllllIIIIlIlllIlIIIIIIll2 = lllllllllllllIlIIIllIlIlIIlIlIII.rotationPitch;
                String lllllllllllllIIIIlIlllIIllllllll2;
                if (lIllllIlllIllll(lllllllllllllIlIIIllIlIlIIlIlIll.length, lllllllllllllIlIIIllIlIlIIlIIlll)) {
                    lllllllllllllIIIIlIlllIIllllllll2 = lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIIlll];
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIlIlllIIllllllll2 = CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[6]];
                }
                final CoordinateArg lllllllllllllIlIIIllIlIlIIlIIIlI = CommandBase.parseCoordinate(lllllllllllllIIIIlIlllIlIIIIIIll2, lllllllllllllIIIIlIlllIIllllllll2, (boolean)(CommandTeleport.lIIIlIIIIIlllI[0] != 0));
                if (lIllllIllllIIII((lllllllllllllIlIIIllIlIlIIlIlIII instanceof EntityPlayerMP) ? 1 : 0)) {
                    final Set<S08PacketPlayerPosLook.EnumFlags> lllllllllllllIlIIIllIlIlIIlIIIIl = EnumSet.noneOf(S08PacketPlayerPosLook.EnumFlags.class);
                    if (lIllllIllllIIII(lllllllllllllIlIIIllIlIlIIlIIllI.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIIl.add(S08PacketPlayerPosLook.EnumFlags.X);
                        "".length();
                    }
                    if (lIllllIllllIIII(lllllllllllllIlIIIllIlIlIIlIIlIl.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIIl.add(S08PacketPlayerPosLook.EnumFlags.Y);
                        "".length();
                    }
                    if (lIllllIllllIIII(lllllllllllllIlIIIllIlIlIIlIIlII.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIIl.add(S08PacketPlayerPosLook.EnumFlags.Z);
                        "".length();
                    }
                    if (lIllllIllllIIII(lllllllllllllIlIIIllIlIlIIlIIIlI.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIIl.add(S08PacketPlayerPosLook.EnumFlags.X_ROT);
                        "".length();
                    }
                    if (lIllllIllllIIII(lllllllllllllIlIIIllIlIlIIlIIIll.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIIl.add(S08PacketPlayerPosLook.EnumFlags.Y_ROT);
                        "".length();
                    }
                    float lllllllllllllIlIIIllIlIlIIlIIIII = (float)lllllllllllllIlIIIllIlIlIIlIIIll.func_179629_b();
                    if (lIllllIllllIIIl(lllllllllllllIlIIIllIlIlIIlIIIll.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIlIIIII = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIIllIlIlIIlIIIII);
                    }
                    float lllllllllllllIlIIIllIlIlIIIlllll = (float)lllllllllllllIlIIIllIlIlIIlIIIlI.func_179629_b();
                    if (lIllllIllllIIIl(lllllllllllllIlIIIllIlIlIIlIIIlI.func_179630_c() ? 1 : 0)) {
                        lllllllllllllIlIIIllIlIlIIIlllll = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIIllIlIlIIIlllll);
                    }
                    if (!lIllllIllllIIlI(lIllllIlllIlIlI(lllllllllllllIlIIIllIlIlIIIlllll, 90.0f)) || lIllllIllllIIll(lIllllIlllIlIll(lllllllllllllIlIIIllIlIlIIIlllll, -90.0f))) {
                        lllllllllllllIlIIIllIlIlIIIlllll = MathHelper.wrapAngleTo180_float(180.0f - lllllllllllllIlIIIllIlIlIIIlllll);
                        lllllllllllllIlIIIllIlIlIIlIIIII = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIIllIlIlIIlIIIII + 180.0f);
                    }
                    lllllllllllllIlIIIllIlIlIIlIlIII.mountEntity(null);
                    ((EntityPlayerMP)lllllllllllllIlIIIllIlIlIIlIlIII).playerNetServerHandler.setPlayerLocation(lllllllllllllIlIIIllIlIlIIlIIllI.func_179629_b(), lllllllllllllIlIIIllIlIlIIlIIlIl.func_179629_b(), lllllllllllllIlIIIllIlIlIIlIIlII.func_179629_b(), lllllllllllllIlIIIllIlIlIIlIIIII, lllllllllllllIlIIIllIlIlIIIlllll, lllllllllllllIlIIIllIlIlIIlIIIIl);
                    lllllllllllllIlIIIllIlIlIIlIlIII.setRotationYawHead(lllllllllllllIlIIIllIlIlIIlIIIII);
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
                else {
                    float lllllllllllllIlIIIllIlIlIIIllllI = (float)MathHelper.wrapAngleTo180_double(lllllllllllllIlIIIllIlIlIIlIIIll.func_179628_a());
                    float lllllllllllllIlIIIllIlIlIIIlllIl = (float)MathHelper.wrapAngleTo180_double(lllllllllllllIlIIIllIlIlIIlIIIlI.func_179628_a());
                    if (!lIllllIllllIIlI(lIllllIlllIlIlI(lllllllllllllIlIIIllIlIlIIIlllIl, 90.0f)) || lIllllIllllIIll(lIllllIlllIlIll(lllllllllllllIlIIIllIlIlIIIlllIl, -90.0f))) {
                        lllllllllllllIlIIIllIlIlIIIlllIl = MathHelper.wrapAngleTo180_float(180.0f - lllllllllllllIlIIIllIlIlIIIlllIl);
                        lllllllllllllIlIIIllIlIlIIIllllI = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIIllIlIlIIIllllI + 180.0f);
                    }
                    lllllllllllllIlIIIllIlIlIIlIlIII.setLocationAndAngles(lllllllllllllIlIIIllIlIlIIlIIllI.func_179628_a(), lllllllllllllIlIIIllIlIlIIlIIlIl.func_179628_a(), lllllllllllllIlIIIllIlIlIIlIIlII.func_179628_a(), lllllllllllllIlIIIllIlIlIIIllllI, lllllllllllllIlIIIllIlIlIIIlllIl);
                    lllllllllllllIlIIIllIlIlIIlIlIII.setRotationYawHead(lllllllllllllIlIIIllIlIlIIIllllI);
                }
                final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[4]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandTeleport.lIIIlIIIIIlllI[3]];
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandTeleport.lIIIlIIIIIlllI[0]] = lllllllllllllIlIIIllIlIlIIlIlIII.getName();
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandTeleport.lIIIlIIIIIlllI[2]] = lllllllllllllIlIIIllIlIlIIlIIllI.func_179628_a();
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandTeleport.lIIIlIIIIIlllI[1]] = lllllllllllllIlIIIllIlIlIIlIIlIl.func_179628_a();
                lllllllllllllIIIIlIlllIIIlIIIlll[CommandTeleport.lIIIlIIIIIlllI[5]] = lllllllllllllIlIIIllIlIlIIlIIlII.func_179628_a();
                CommandBase.notifyOperators(lllllllllllllIlIIIllIlIlIIIllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
                "".length();
                if (((0x24 ^ 0x62) & ~(0x6F ^ 0x29)) < 0) {
                    return;
                }
            }
        }
        else {
            final Entity lllllllllllllIlIIIllIlIlIIIlllII = CommandBase.func_175768_b(lllllllllllllIlIIIllIlIlIIIllIlI, lllllllllllllIlIIIllIlIlIIlIlIll[lllllllllllllIlIIIllIlIlIIlIlIll.length - CommandTeleport.lIIIlIIIIIlllI[2]]);
            if (lIllllIllllIlII(lllllllllllllIlIIIllIlIlIIIlllII.worldObj, lllllllllllllIlIIIllIlIlIIlIlIII.worldObj)) {
                throw new CommandException(CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[7]], new Object[CommandTeleport.lIIIlIIIIIlllI[0]]);
            }
            lllllllllllllIlIIIllIlIlIIlIlIII.mountEntity(null);
            if (lIllllIllllIIII((lllllllllllllIlIIIllIlIlIIlIlIII instanceof EntityPlayerMP) ? 1 : 0)) {
                ((EntityPlayerMP)lllllllllllllIlIIIllIlIlIIlIlIII).playerNetServerHandler.setPlayerLocation(lllllllllllllIlIIIllIlIlIIIlllII.posX, lllllllllllllIlIIIllIlIlIIIlllII.posY, lllllllllllllIlIIIllIlIlIIIlllII.posZ, lllllllllllllIlIIIllIlIlIIIlllII.rotationYaw, lllllllllllllIlIIIllIlIlIIIlllII.rotationPitch);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIIllIlIlIIlIlIII.setLocationAndAngles(lllllllllllllIlIIIllIlIlIIIlllII.posX, lllllllllllllIlIIIllIlIlIIIlllII.posY, lllllllllllllIlIIIllIlIlIIIlllII.posZ, lllllllllllllIlIIIllIlIlIIIlllII.rotationYaw, lllllllllllllIlIIIllIlIlIIIlllII.rotationPitch);
            }
            final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[8]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandTeleport.lIIIlIIIIIlllI[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandTeleport.lIIIlIIIIIlllI[0]] = lllllllllllllIlIIIllIlIlIIlIlIII.getName();
            lllllllllllllIIIIlIlllIIIlIIIlll2[CommandTeleport.lIIIlIIIIIlllI[2]] = lllllllllllllIlIIIllIlIlIIIlllII.getName();
            CommandBase.notifyOperators(lllllllllllllIlIIIllIlIlIIIllIlI, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
        }
    }
    
    @Override
    public boolean isUsernameIndex(final String[] lllllllllllllIlIIIllIlIlIIIIIlIl, final int lllllllllllllIlIIIllIlIlIIIIIIll) {
        if (lIllllIllllIIIl(lllllllllllllIlIIIllIlIlIIIIIIll)) {
            return CommandTeleport.lIIIlIIIIIlllI[2] != 0;
        }
        return CommandTeleport.lIIIlIIIIIlllI[0] != 0;
    }
    
    private static boolean lIllllIllllIIlI(final int lllllllllllllIlIIIllIlIIlIlllIll) {
        return lllllllllllllIlIIIllIlIIlIlllIll <= 0;
    }
    
    private static void lIllllIlllIlIII() {
        (lIIIlIIIIIllIl = new String[CommandTeleport.lIIIlIIIIIlllI[9]])[CommandTeleport.lIIIlIIIIIlllI[0]] = lIllllIlllIIlIl("AmOb6nKw1gg=", "MMGJf");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[2]] = lIllllIlllIIlIl("G9BPvZBITtAqsc3xcbN8YZ9W9sqU4oa9", "DAeVj");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[1]] = lIllllIlllIIlIl("cxxKNmDx5pIG0uhDOdsryB7TFZpuVeKl", "Stjfh");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[5]] = lIllllIlllIIllI("RkaK3TwClGZsiDa2PEd0rt0hRG+1qWnA", "eCEUQ");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[3]] = lIllllIlllIIlIl("qL+kJ/sLSWo=", "UWECb");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[6]] = lIllllIlllIIlll("PA==", "BoYNH");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[4]] = lIllllIlllIIlIl("mPKyFo2Nm3nS8i9IT0eQfAVtgtidgt+nerBjDW+4Ono=", "Qoqpm");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[7]] = lIllllIlllIIlll("OQIdLzM0CQNsJipDHi0mCQwdJxYzABUsITMCHg==", "ZmpBR");
        CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[8]] = lIllllIlllIIlIl("Ik0Mxu6JdyNTjr8Gtj7WD6EnoKDoDAYy", "Xmdhz");
    }
    
    private static boolean lIllllIllllIIIl(final int lllllllllllllIlIIIllIlIIlIllllll) {
        return lllllllllllllIlIIIllIlIIlIllllll == 0;
    }
    
    private static String lIllllIlllIIlll(String lllllllllllllIlIIIllIlIIlllIIllI, final String lllllllllllllIlIIIllIlIIlllIlIlI) {
        lllllllllllllIlIIIllIlIIlllIIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllIlIIlllIlIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIllIlIIlllIlIII = lllllllllllllIlIIIllIlIIlllIlIlI.toCharArray();
        int lllllllllllllIlIIIllIlIIlllIIlll = CommandTeleport.lIIIlIIIIIlllI[0];
        final double lllllllllllllIlIIIllIlIIlllIIIIl = (Object)lllllllllllllIlIIIllIlIIlllIIllI.toCharArray();
        final String lllllllllllllIlIIIllIlIIlllIIIII = (String)lllllllllllllIlIIIllIlIIlllIIIIl.length;
        long lllllllllllllIlIIIllIlIIllIlllll = CommandTeleport.lIIIlIIIIIlllI[0];
        while (lIllllIlllIllII((int)lllllllllllllIlIIIllIlIIllIlllll, (int)lllllllllllllIlIIIllIlIIlllIIIII)) {
            final char lllllllllllllIlIIIllIlIIlllIllII = lllllllllllllIlIIIllIlIIlllIIIIl[lllllllllllllIlIIIllIlIIllIlllll];
            lllllllllllllIlIIIllIlIIlllIlIIl.append((char)(lllllllllllllIlIIIllIlIIlllIllII ^ lllllllllllllIlIIIllIlIIlllIlIII[lllllllllllllIlIIIllIlIIlllIIlll % lllllllllllllIlIIIllIlIIlllIlIII.length]));
            "".length();
            ++lllllllllllllIlIIIllIlIIlllIIlll;
            ++lllllllllllllIlIIIllIlIIllIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllIlIIlllIlIIl);
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIlIIIllIlIlIIllllII) {
        return CommandTeleport.lIIIlIIIIIllIl[CommandTeleport.lIIIlIIIIIlllI[2]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandTeleport.lIIIlIIIIIlllI[1];
    }
}
