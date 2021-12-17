// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CommandWorldBorder extends CommandBase
{
    private static final /* synthetic */ int[] lllIIIIlIIIIlI;
    private static final /* synthetic */ String[] lllIIIIIlIlllI;
    
    private static boolean lIIlllIIIllIlIII(final int llllllllllllIllIIIIllIIIlIIIlIlI, final int llllllllllllIllIIIIllIIIlIIIlIIl) {
        return llllllllllllIllIIIIllIIIlIIIlIlI != llllllllllllIllIIIIllIIIlIIIlIIl;
    }
    
    private static boolean lIIlllIIIllIIllI(final int llllllllllllIllIIIIllIIIlIIlllII, final int llllllllllllIllIIIIllIIIlIIllIll) {
        return llllllllllllIllIIIIllIIIlIIlllII < llllllllllllIllIIIIllIIIlIIllIll;
    }
    
    private static String lIIlllIIIIlIllll(final String llllllllllllIllIIIIllIIIllIIIIlI, final String llllllllllllIllIIIIllIIIllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), CommandWorldBorder.lllIIIIlIIIIlI[8]), "DES");
            final Cipher llllllllllllIllIIIIllIIIllIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIIIllIIIllIIIllI.init(CommandWorldBorder.lllIIIIlIIIIlI[1], llllllllllllIllIIIIllIIIllIIIlll);
            return new String(llllllllllllIllIIIIllIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIIIllIIIlIl) {
            llllllllllllIllIIIIllIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void processCommand(final ICommandSender llllllllllllIllIIIIllIIIlllIlIIl, final String[] llllllllllllIllIIIIllIIIlllIlIII) throws CommandException {
        if (lIIlllIIIllIIllI(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[2])) {
            throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[1]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
        }
        final WorldBorder llllllllllllIllIIIIllIIIllllllII = this.getWorldBorder();
        if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[3]]) ? 1 : 0)) {
            if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1]) && lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[4]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            final double llllllllllllIllIIIIllIIIlllllIll = llllllllllllIllIIIIllIIIllllllII.getTargetSize();
            final double llllllllllllIllIIIIllIIIlllllIlI = CommandBase.parseDouble(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]], 1.0, 6.0E7);
            long n;
            if (lIIlllIIIllIlIIl(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1])) {
                n = CommandBase.parseLong(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], 0L, 9223372036854775L) * 1000L;
                "".length();
                if (((0xDA ^ 0xBB ^ (0xD6 ^ 0x80)) & (113 + 120 - 156 + 73 ^ 94 + 101 - 177 + 143 ^ -" ".length())) > "   ".length()) {
                    return;
                }
            }
            else {
                n = 0L;
            }
            final long llllllllllllIllIIIIllIIIlllllIIl = n;
            if (lIIlllIIIllIlIlI(lIIlllIIIllIIlII(llllllllllllIllIIIIllIIIlllllIIl, 0L))) {
                llllllllllllIllIIIIllIIIllllllII.setTransition(llllllllllllIllIIIIllIIIlllllIll, llllllllllllIllIIIIllIIIlllllIlI, llllllllllllIllIIIIllIIIlllllIIl);
                if (lIIlllIIIllIlIlI(lIIlllIIIllIIlIl(llllllllllllIllIIIIllIIIlllllIll, llllllllllllIllIIIIllIIIlllllIlI))) {
                    final String lllllllllllllIIIIlIlllIIIlIIIlII = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[5]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandWorldBorder.lllIIIIlIIIIlI[3]];
                    final int n2 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                    final String format = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[6]];
                    final Object[] args = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIlI;
                    lllllllllllllIIIIlIlllIIIlIIIlll[n2] = String.format(format, args);
                    final int n3 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                    final String format2 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[7]];
                    final Object[] args2 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args2[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIll;
                    lllllllllllllIIIIlIlllIIIlIIIlll[n3] = String.format(format2, args2);
                    lllllllllllllIIIIlIlllIIIlIIIlll[CommandWorldBorder.lllIIIIlIIIIlI[1]] = Long.toString(llllllllllllIllIIIIllIIIlllllIIl / 1000L);
                    CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII, lllllllllllllIIIIlIlllIIIlIIIlll);
                    "".length();
                    if (((0x6 ^ 0x28) & ~(0x22 ^ 0xC)) > 0) {
                        return;
                    }
                }
                else {
                    final String lllllllllllllIIIIlIlllIIIlIIIlII2 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[8]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll2 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[3]];
                    final int n4 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                    final String format3 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[9]];
                    final Object[] args3 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args3[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIlI;
                    lllllllllllllIIIIlIlllIIIlIIIlll2[n4] = String.format(format3, args3);
                    final int n5 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                    final String format4 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[10]];
                    final Object[] args4 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args4[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIll;
                    lllllllllllllIIIIlIlllIIIlIIIlll2[n5] = String.format(format4, args4);
                    lllllllllllllIIIIlIlllIIIlIIIlll2[CommandWorldBorder.lllIIIIlIIIIlI[1]] = Long.toString(llllllllllllIllIIIIllIIIlllllIIl / 1000L);
                    CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII2, lllllllllllllIIIIlIlllIIIlIIIlll2);
                    "".length();
                    if ((0x5D ^ 0x58) == 0x0) {
                        return;
                    }
                }
            }
            else {
                llllllllllllIllIIIIllIIIllllllII.setTransition(llllllllllllIllIIIIllIIIlllllIlI);
                final String lllllllllllllIIIIlIlllIIIlIIIlII3 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[11]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll3 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                final int n6 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                final String format5 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[12]];
                final Object[] args5 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args5[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIlI;
                lllllllllllllIIIIlIlllIIIlIIIlll3[n6] = String.format(format5, args5);
                final int n7 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                final String format6 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[13]];
                final Object[] args6 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args6[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIll;
                lllllllllllllIIIIlIlllIIIlIIIlll3[n7] = String.format(format6, args6);
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII3, lllllllllllllIIIIlIlllIIIlIIIlll3);
                "".length();
                if (((0x28 ^ 0x3C) & ~(0x38 ^ 0x2C)) != 0x0) {
                    return;
                }
            }
        }
        else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[14]]) ? 1 : 0)) {
            if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1]) && lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[15]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            final double llllllllllllIllIIIIllIIIlllllIII = llllllllllllIllIIIIllIIIllllllII.getDiameter();
            final double llllllllllllIllIIIIllIIIllllIlll = llllllllllllIllIIIIllIIIlllllIII + CommandBase.parseDouble(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]], -llllllllllllIllIIIIllIIIlllllIII, 6.0E7 - llllllllllllIllIIIIllIIIlllllIII);
            final long timeUntilTarget = llllllllllllIllIIIIllIIIllllllII.getTimeUntilTarget();
            long n8;
            if (lIIlllIIIllIlIIl(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1])) {
                n8 = CommandBase.parseLong(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], 0L, 9223372036854775L) * 1000L;
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                n8 = 0L;
            }
            final long llllllllllllIllIIIIllIIIllllIllI = timeUntilTarget + n8;
            if (lIIlllIIIllIlIlI(lIIlllIIIllIIlII(llllllllllllIllIIIIllIIIllllIllI, 0L))) {
                llllllllllllIllIIIIllIIIllllllII.setTransition(llllllllllllIllIIIIllIIIlllllIII, llllllllllllIllIIIIllIIIllllIlll, llllllllllllIllIIIIllIIIllllIllI);
                if (lIIlllIIIllIlIlI(lIIlllIIIllIIlIl(llllllllllllIllIIIIllIIIlllllIII, llllllllllllIllIIIIllIIIllllIlll))) {
                    final String lllllllllllllIIIIlIlllIIIlIIIlII4 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[16]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll4 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[3]];
                    final int n9 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                    final String format7 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[17]];
                    final Object[] args7 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args7[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIlll;
                    lllllllllllllIIIIlIlllIIIlIIIlll4[n9] = String.format(format7, args7);
                    final int n10 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                    final String format8 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[18]];
                    final Object[] args8 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args8[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIII;
                    lllllllllllllIIIIlIlllIIIlIIIlll4[n10] = String.format(format8, args8);
                    lllllllllllllIIIIlIlllIIIlIIIlll4[CommandWorldBorder.lllIIIIlIIIIlI[1]] = Long.toString(llllllllllllIllIIIIllIIIllllIllI / 1000L);
                    CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII4, lllllllllllllIIIIlIlllIIIlIIIlll4);
                    "".length();
                    if (("  ".length() & ("  ".length() ^ -" ".length())) < 0) {
                        return;
                    }
                }
                else {
                    final String lllllllllllllIIIIlIlllIIIlIIIlII5 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[19]];
                    final Object[] lllllllllllllIIIIlIlllIIIlIIIlll5 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[3]];
                    final int n11 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                    final String format9 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[20]];
                    final Object[] args9 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args9[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIlll;
                    lllllllllllllIIIIlIlllIIIlIIIlll5[n11] = String.format(format9, args9);
                    final int n12 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                    final String format10 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[21]];
                    final Object[] args10 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                    args10[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIII;
                    lllllllllllllIIIIlIlllIIIlIIIlll5[n12] = String.format(format10, args10);
                    lllllllllllllIIIIlIlllIIIlIIIlll5[CommandWorldBorder.lllIIIIlIIIIlI[1]] = Long.toString(llllllllllllIllIIIIllIIIllllIllI / 1000L);
                    CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII5, lllllllllllllIIIIlIlllIIIlIIIlll5);
                    "".length();
                    if (((0x19 ^ 0x23) & ~(0x51 ^ 0x6B)) != 0x0) {
                        return;
                    }
                }
            }
            else {
                llllllllllllIllIIIIllIIIllllllII.setTransition(llllllllllllIllIIIIllIIIllllIlll);
                final String lllllllllllllIIIIlIlllIIIlIIIlII6 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[22]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll6 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                final int n13 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                final String format11 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[23]];
                final Object[] args11 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args11[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIlll;
                lllllllllllllIIIIlIlllIIIlIIIlll6[n13] = String.format(format11, args11);
                final int n14 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                final String format12 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[24]];
                final Object[] args12 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args12[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllllIII;
                lllllllllllllIIIIlIlllIIIlIIIlll6[n14] = String.format(format12, args12);
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII6, lllllllllllllIIIIlIlllIIIlIIIlll6);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[25]]) ? 1 : 0)) {
            if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[26]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            final BlockPos llllllllllllIllIIIIllIIIllllIlIl = llllllllllllIllIIIIllIIIlllIlIIl.getPosition();
            final double llllllllllllIllIIIIllIIIllllIlII = CommandBase.parseDouble(llllllllllllIllIIIIllIIIllllIlIl.getX() + 0.5, llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]], (boolean)(CommandWorldBorder.lllIIIIlIIIIlI[2] != 0));
            final double llllllllllllIllIIIIllIIIllllIIll = CommandBase.parseDouble(llllllllllllIllIIIIllIIIllllIlIl.getZ() + 0.5, llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], (boolean)(CommandWorldBorder.lllIIIIlIIIIlI[2] != 0));
            llllllllllllIllIIIIllIIIllllllII.setCenter(llllllllllllIllIIIIllIIIllllIlII, llllllllllllIllIIIIllIIIllllIIll);
            final String lllllllllllllIIIIlIlllIIIlIIIlII7 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[27]];
            final Object[] lllllllllllllIIIIlIlllIIIlIIIlll7 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
            lllllllllllllIIIIlIlllIIIlIIIlll7[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIlII;
            lllllllllllllIIIIlIlllIIIlIIIlll7[CommandWorldBorder.lllIIIIlIIIIlI[2]] = llllllllllllIllIIIIllIIIllllIIll;
            CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII7, lllllllllllllIIIIlIlllIIIlIIIlll7);
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
        }
        else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[28]]) ? 1 : 0)) {
            if (lIIlllIIIllIIllI(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1])) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[29]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[30]]) ? 1 : 0)) {
                if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                    throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[31]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
                }
                final double llllllllllllIllIIIIllIIIllllIIlI = CommandBase.parseDouble(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], 0.0);
                final double llllllllllllIllIIIIllIIIllllIIIl = llllllllllllIllIIIIllIIIllllllII.getDamageBuffer();
                llllllllllllIllIIIIllIIIllllllII.setDamageBuffer(llllllllllllIllIIIIllIIIllllIIlI);
                final String lllllllllllllIIIIlIlllIIIlIIIlII8 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[32]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll8 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                final int n15 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                final String format13 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[33]];
                final Object[] args13 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args13[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIIlI;
                lllllllllllllIIIIlIlllIIIlIIIlll8[n15] = String.format(format13, args13);
                final int n16 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                final String format14 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[34]];
                final Object[] args14 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args14[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIIIl;
                lllllllllllllIIIIlIlllIIIlIIIlll8[n16] = String.format(format14, args14);
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII8, lllllllllllllIIIIlIlllIIIlIIIlll8);
                "".length();
                if (-(0x90 ^ 0x95) >= 0) {
                    return;
                }
            }
            else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[35]]) ? 1 : 0)) {
                if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                    throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[36]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
                }
                final double llllllllllllIllIIIIllIIIllllIIII = CommandBase.parseDouble(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], 0.0);
                final double llllllllllllIllIIIIllIIIlllIllll = llllllllllllIllIIIIllIIIllllllII.getDamageAmount();
                llllllllllllIllIIIIllIIIllllllII.setDamageAmount(llllllllllllIllIIIIllIIIllllIIII);
                final String lllllllllllllIIIIlIlllIIIlIIIlII9 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[37]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll9 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                final int n17 = CommandWorldBorder.lllIIIIlIIIIlI[0];
                final String format15 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[38]];
                final Object[] args15 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args15[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIllllIIII;
                lllllllllllllIIIIlIlllIIIlIIIlll9[n17] = String.format(format15, args15);
                final int n18 = CommandWorldBorder.lllIIIIlIIIIlI[2];
                final String format16 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[39]];
                final Object[] args16 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
                args16[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllIllll;
                lllllllllllllIIIIlIlllIIIlIIIlll9[n18] = String.format(format16, args16);
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII9, lllllllllllllIIIIlIlllIIIlIIIlll9);
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
        }
        else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[40]]) ? 1 : 0)) {
            if (lIIlllIIIllIIllI(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[1])) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[41]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            final int llllllllllllIllIIIIllIIIlllIlllI = CommandBase.parseInt(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[1]], CommandWorldBorder.lllIIIIlIIIIlI[0]);
            if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[42]]) ? 1 : 0)) {
                if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                    throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[43]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
                }
                final int llllllllllllIllIIIIllIIIlllIllIl = llllllllllllIllIIIIllIIIllllllII.getWarningTime();
                llllllllllllIllIIIIllIIIllllllII.setWarningTime(llllllllllllIllIIIIllIIIlllIlllI);
                final String lllllllllllllIIIIlIlllIIIlIIIlII10 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[44]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll10 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                lllllllllllllIIIIlIlllIIIlIIIlll10[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllIlllI;
                lllllllllllllIIIIlIlllIIIlIIIlll10[CommandWorldBorder.lllIIIIlIIIIlI[2]] = llllllllllllIllIIIIllIIIlllIllIl;
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII10, lllllllllllllIIIIlIlllIIIlIIIlll10);
                "".length();
                if ((0x2D ^ 0x5C ^ (0xA ^ 0x7F)) != (50 + 75 - 121 + 141 ^ 134 + 41 - 45 + 19)) {
                    return;
                }
            }
            else if (lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[2]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[45]]) ? 1 : 0)) {
                if (lIIlllIIIllIlIII(llllllllllllIllIIIIllIIIlllIlIII.length, CommandWorldBorder.lllIIIIlIIIIlI[3])) {
                    throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[46]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
                }
                final int llllllllllllIllIIIIllIIIlllIllII = llllllllllllIllIIIIllIIIllllllII.getWarningDistance();
                llllllllllllIllIIIIllIIIllllllII.setWarningDistance(llllllllllllIllIIIIllIIIlllIlllI);
                final String lllllllllllllIIIIlIlllIIIlIIIlII11 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[47]];
                final Object[] lllllllllllllIIIIlIlllIIIlIIIlll11 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[1]];
                lllllllllllllIIIIlIlllIIIlIIIlll11[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllIlllI;
                lllllllllllllIIIIlIlllIIIlIIIlll11[CommandWorldBorder.lllIIIIlIIIIlI[2]] = llllllllllllIllIIIIllIIIlllIllII;
                CommandBase.notifyOperators(llllllllllllIllIIIIllIIIlllIlIIl, this, lllllllllllllIIIIlIlllIIIlIIIlII11, lllllllllllllIIIIlIlllIIIlIIIlll11);
                "".length();
                if (((0x24 ^ 0x39 ^ (0xF8 ^ 0xA1)) & (0x77 ^ 0x2E ^ (0xBE ^ 0xA3) ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
        }
        else {
            if (lIIlllIIIllIlIll(llllllllllllIllIIIIllIIIlllIlIII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[48]]) ? 1 : 0)) {
                throw new WrongUsageException(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[49]], new Object[CommandWorldBorder.lllIIIIlIIIIlI[0]]);
            }
            final double llllllllllllIllIIIIllIIIlllIlIll = llllllllllllIllIIIIllIIIllllllII.getDiameter();
            llllllllllllIllIIIIllIIIlllIlIIl.setCommandStat(CommandResultStats.Type.QUERY_RESULT, MathHelper.floor_double(llllllllllllIllIIIIllIIIlllIlIll + 0.5));
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[50]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
            final int n19 = CommandWorldBorder.lllIIIIlIIIIlI[0];
            final String format17 = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[51]];
            final Object[] args17 = new Object[CommandWorldBorder.lllIIIIlIIIIlI[2]];
            args17[CommandWorldBorder.lllIIIIlIIIIlI[0]] = llllllllllllIllIIIIllIIIlllIlIll;
            lllllllllllllIlIIlIlllIIlIIIIIIl[n19] = String.format(format17, args17);
            llllllllllllIllIIIIllIIIlllIlIIl.addChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
        }
    }
    
    private static boolean lIIlllIIIllIllIl(final int llllllllllllIllIIIIllIIIlIlIIIII, final int llllllllllllIllIIIIllIIIlIIlllll) {
        return llllllllllllIllIIIIllIIIlIlIIIII >= llllllllllllIllIIIIllIIIlIIlllll;
    }
    
    protected WorldBorder getWorldBorder() {
        return MinecraftServer.getServer().worldServers[CommandWorldBorder.lllIIIIlIIIIlI[0]].getWorldBorder();
    }
    
    private static int lIIlllIIIllIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIlllIIIIlIllIl(String llllllllllllIllIIIIllIIIlIlIllll, final String llllllllllllIllIIIIllIIIlIlIlllI) {
        llllllllllllIllIIIIllIIIlIlIllll = new String(Base64.getDecoder().decode(llllllllllllIllIIIIllIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIllIIIlIllIIlI = new StringBuilder();
        final char[] llllllllllllIllIIIIllIIIlIllIIIl = llllllllllllIllIIIIllIIIlIlIlllI.toCharArray();
        int llllllllllllIllIIIIllIIIlIllIIII = CommandWorldBorder.lllIIIIlIIIIlI[0];
        final long llllllllllllIllIIIIllIIIlIlIlIlI = (Object)llllllllllllIllIIIIllIIIlIlIllll.toCharArray();
        final boolean llllllllllllIllIIIIllIIIlIlIlIIl = llllllllllllIllIIIIllIIIlIlIlIlI.length != 0;
        double llllllllllllIllIIIIllIIIlIlIlIII = CommandWorldBorder.lllIIIIlIIIIlI[0];
        while (lIIlllIIIllIIllI((int)llllllllllllIllIIIIllIIIlIlIlIII, llllllllllllIllIIIIllIIIlIlIlIIl ? 1 : 0)) {
            final char llllllllllllIllIIIIllIIIlIllIlIl = llllllllllllIllIIIIllIIIlIlIlIlI[llllllllllllIllIIIIllIIIlIlIlIII];
            llllllllllllIllIIIIllIIIlIllIIlI.append((char)(llllllllllllIllIIIIllIIIlIllIlIl ^ llllllllllllIllIIIIllIIIlIllIIIl[llllllllllllIllIIIIllIIIlIllIIII % llllllllllllIllIIIIllIIIlIllIIIl.length]));
            "".length();
            ++llllllllllllIllIIIIllIIIlIllIIII;
            ++llllllllllllIllIIIIllIIIlIlIlIII;
            "".length();
            if ("   ".length() <= ((0xEE ^ 0xBE) & ~(0xDC ^ 0x8C))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIllIIIlIllIIlI);
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender llllllllllllIllIIIIllIIIllIlllIl, final String[] llllllllllllIllIIIIllIIIllIlllII, final BlockPos llllllllllllIllIIIIllIIIllIllIIl) {
        List<String> list;
        if (lIIlllIIIllIllII(llllllllllllIllIIIIllIIIllIlllII.length, CommandWorldBorder.lllIIIIlIIIIlI[2])) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII = new String[CommandWorldBorder.lllIIIIlIIIIlI[6]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[0]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[52]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[2]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[53]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[1]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[54]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[3]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[55]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[4]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[56]];
            lllllllllllllIIIIlIlllIIIllIllII[CommandWorldBorder.lllIIIIlIIIIlI[5]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[57]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIIIllIIIllIlllII, lllllllllllllIIIIlIlllIIIllIllII);
            "".length();
            if (((0xA7 ^ 0x83) & ~(0x7D ^ 0x59)) != 0x0) {
                return null;
            }
        }
        else if (lIIlllIIIllIllII(llllllllllllIllIIIIllIIIllIlllII.length, CommandWorldBorder.lllIIIIlIIIIlI[1]) && lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIllIlllII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[58]]) ? 1 : 0)) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII2 = new String[CommandWorldBorder.lllIIIIlIIIIlI[1]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandWorldBorder.lllIIIIlIIIIlI[0]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[59]];
            lllllllllllllIIIIlIlllIIIllIllII2[CommandWorldBorder.lllIIIIlIIIIlI[2]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[60]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIIIllIIIllIlllII, lllllllllllllIIIIlIlllIIIllIllII2);
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else if (lIIlllIIIllIllIl(llllllllllllIllIIIIllIIIllIlllII.length, CommandWorldBorder.lllIIIIlIIIIlI[1]) && lIIlllIIIllIlllI(llllllllllllIllIIIIllIIIllIlllII.length, CommandWorldBorder.lllIIIIlIIIIlI[3]) && lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIllIlllII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[61]]) ? 1 : 0)) {
            list = CommandBase.func_181043_b(llllllllllllIllIIIIllIIIllIlllII, CommandWorldBorder.lllIIIIlIIIIlI[2], llllllllllllIllIIIIllIIIllIllIIl);
            "".length();
            if ((0x64 ^ 0x60) == 0x0) {
                return null;
            }
        }
        else if (lIIlllIIIllIllII(llllllllllllIllIIIIllIIIllIlllII.length, CommandWorldBorder.lllIIIIlIIIIlI[1]) && lIIlllIIIllIIlll(llllllllllllIllIIIIllIIIllIlllII[CommandWorldBorder.lllIIIIlIIIIlI[0]].equals(CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[62]]) ? 1 : 0)) {
            final String[] lllllllllllllIIIIlIlllIIIllIllII3 = new String[CommandWorldBorder.lllIIIIlIIIIlI[1]];
            lllllllllllllIIIIlIlllIIIllIllII3[CommandWorldBorder.lllIIIIlIIIIlI[0]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[63]];
            lllllllllllllIIIIlIlllIIIllIllII3[CommandWorldBorder.lllIIIIlIIIIlI[2]] = CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[64]];
            list = CommandBase.getListOfStringsMatchingLastWord(llllllllllllIllIIIIllIIIllIlllII, lllllllllllllIIIIlIlllIIIllIllII3);
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            list = null;
        }
        return list;
    }
    
    @Override
    public String getCommandUsage(final ICommandSender llllllllllllIllIIIIllIIlIIIIlIIl) {
        return CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[2]];
    }
    
    private static boolean lIIlllIIIllIllII(final int llllllllllllIllIIIIllIIIlIlIIlII, final int llllllllllllIllIIIIllIIIlIlIIIll) {
        return llllllllllllIllIIIIllIIIlIlIIlII == llllllllllllIllIIIIllIIIlIlIIIll;
    }
    
    private static void lIIlllIIIlIllIll() {
        (lllIIIIIlIlllI = new String[CommandWorldBorder.lllIIIIlIIIIlI[65]])[CommandWorldBorder.lllIIIIlIIIIlI[0]] = lIIlllIIIIlIllIl("EgwABhYHDAAOFxc=", "ecrjr");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[2]] = lIIlllIIIIlIllIl("GxUnORkWHjl6DxcIJjAaFwguMQpWDzk1Hx0=", "xzJTx");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[1]] = lIIlllIIIIlIllIl("MzYgHw4+PT5cGD8rIRYNPyspFx1+LD4TCDU=", "PYMro");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[3]] = lIIlllIIIIlIllIl("Ohwc", "Iyhrm");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[4]] = lIIlllIIIIlIlllI("7yMO6XJygBgDBjlGZsaiPzbi0Jz1z6J8vni1v74m/E0=", "KOKVk");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[5]] = lIIlllIIIIlIlllI("wQZea/NH+GWKHbdJUR7x/JNBhUKkBmnI08Z8OVrarJ6rUaWiq9Q94ubTTPSW/zu4", "wtSZC");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[6]] = lIIlllIIIIlIlllI("NEcqNAz+AhQ=", "DYhKq");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[7]] = lIIlllIIIIlIlllI("191Tzz7kvso=", "XGZsw");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[8]] = lIIlllIIIIlIllll("T4IgQCosxrLwC9PDODxHen8xvSsWR9Rxp7qGudhpD4HfbaryFfpMjg58k0X4xU6i", "vciTI");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[9]] = lIIlllIIIIlIlllI("cQkvIPY34to=", "LThXl");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[10]] = lIIlllIIIIlIllll("QNJUGndRh/o=", "Xhzfr");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[11]] = lIIlllIIIIlIllIl("NwMVFQM6CAtWFTseFBwAOx4cHRB6Hx0MTCcZGxsHJx8=", "Tlxxb");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[12]] = lIIlllIIIIlIllIl("YmJGAQ==", "GLwgL");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[13]] = lIIlllIIIIlIlllI("LJpD/SHZrbw=", "dhlTP");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[14]] = lIIlllIIIIlIlllI("fd5QFTzwMig=", "PlprG");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[15]] = lIIlllIIIIlIllIl("BjcOLzULPBBsIwoqDyY2CioHJyZLOQcmehArAiUx", "eXcBT");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[16]] = lIIlllIIIIlIllll("eSUp5WLXOAOrFO0J4wbSn2PHnFHMe1La/T/aUCC4qvj0iTybTlPwwE1ZNUH5WKsq", "Kgcgw");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[17]] = lIIlllIIIIlIllll("cnr5izehXFU=", "sqbPM");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[18]] = lIIlllIIIIlIlllI("xm4XHap7x50=", "VbvnG");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[19]] = lIIlllIIIIlIlllI("/dI8jw0zCwr5umLEN8YnzTkOLJ+IOYRoTX+4rTKdksGezAopT8uIsl9Y9bHY15zQ", "aJicZ");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[20]] = lIIlllIIIIlIlllI("JP5UyPMhR3g=", "jlsiT");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[21]] = lIIlllIIIIlIllIl("QH5rMA==", "ePZVv");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[22]] = lIIlllIIIIlIllIl("EC4BODgdJR97LhwzADE7HDMIMCtdMgkhdwA0DzY8ADI=", "sAlUY");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[23]] = lIIlllIIIIlIllll("sVuBQDO1TaY=", "gpWYc");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[24]] = lIIlllIIIIlIllIl("dUxLLA==", "PbzJL");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[25]] = lIIlllIIIIlIllll("u+P0NJofTrI=", "tBBNW");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[26]] = lIIlllIIIIlIllIl("LykMCCgiIhJLPiM0DQErIzQFADtiJQQLPSk0TxA6LSEE", "LFaeI");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[27]] = lIIlllIIIIlIllIl("DhY/IgcDHSFhEQILPisEAgs2KhRDGjchEggLfDwTDho3PBU=", "myROf");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[28]] = lIIlllIIIIlIllIl("Li0ZMjIv", "JLtSU");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[29]] = lIIlllIIIIlIlllI("VI0gdhv1gIuFfUqFcX7cNNjkil7euFjqWbGif99uVYtuXYbbwjyBdg==", "HSVDT");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[30]] = lIIlllIIIIlIllIl("JzwSEhE3", "EIttt");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[31]] = lIIlllIIIIlIllll("moUxr4ocy8wBJpGaZeWZfstnQh2RaBrSB1Epv63ruaBWUO80g8/Ebxjf0HBKh9Iv", "MBSLT");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[32]] = lIIlllIIIIlIlllI("FYnHsStMUk8liXyabVxxibIOAASPF/rsUKMHuiJ7o3Em7MXe+wVaHRBeVRfcStVO", "zTPRw");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[33]] = lIIlllIIIIlIlllI("cIgysJTAFf8=", "JYgQJ");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[34]] = lIIlllIIIIlIlllI("Wi7bQCRQxZs=", "VFysB");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[35]] = lIIlllIIIIlIllIl("FyUgETkC", "vHOdW");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[36]] = lIIlllIIIIlIllIl("ByAPOSkKKxF6Pws9DjAqCz0GMTpKKwM5KQMqTDUlCzoMIGYRPAMzLQ==", "dObTH");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[37]] = lIIlllIIIIlIlllI("iTj7SLSi9RJVkQloujjGmJ37KB260b2+KYjVay3hMvIJ0L+9c0x1Fwm9j5deVsFp", "CanZZ");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[38]] = lIIlllIIIIlIllll("solb4FqVx2c=", "SuCwH");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[39]] = lIIlllIIIIlIllIl("Y31kHA==", "FSVzj");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[40]] = lIIlllIIIIlIllll("o51CefYSoVk=", "vnYlI");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[41]] = lIIlllIIIIlIlllI("C9qGBiH1QmNbVLfGO8pLTBgovkU9QS/OZBEw93u7QsK1z8eQd37jJA==", "ehxLO");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[42]] = lIIlllIIIIlIllIl("OAAgCg==", "LiMoE");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[43]] = lIIlllIIIIlIlllI("mlf3QJ/r5z/Gg9OGJuPVfyra2U8nmmk/r+miFBm9MY+02nsC/k3O6w==", "zPNYp");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[44]] = lIIlllIIIIlIllll("0E1yOb48093PYUeU+S3bU96VzFjoXPqPamIu/TE3oLwlbS/X1LfCeoGF0sejOjq0", "xUQbM");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[45]] = lIIlllIIIIlIllIl("Lgo3Jw4kACE=", "JcDSo");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[46]] = lIIlllIIIIlIllIl("DCoILywBIRZsOgA3CSYvADcBJz9BMgQwIwYrAmwpBjYRIyMMIEs3Pg4iAA==", "oEeBM");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[47]] = lIIlllIIIIlIllIl("NgwHCDY7BxlLIDoRBgE1OhEOACV7FAsXOTwNDUszPBAeBDk2BkQWIjYADxYk", "UcjeW");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[48]] = lIIlllIIIIlIllIl("IQoQ", "FodHB");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[49]] = lIIlllIIIIlIlllI("ljV+zf/8AuNSXnaPnCuezyPyS1rRTkkPt0n0bdGZ7mM=", "Crcdv");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[50]] = lIIlllIIIIlIllIl("FhgpCCsbEzdLPRoFKAEoGgUgADhbECERZAYCJwYvBgQ=", "uwDeJ");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[51]] = lIIlllIIIIlIllIl("a39jDw==", "NQSii");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[52]] = lIIlllIIIIlIllIl("NAsb", "GnoxH");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[53]] = lIIlllIIIIlIllIl("MiM6GRQj", "QFTmq");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[54]] = lIIlllIIIIlIllIl("HgkrBgkf", "zhFgn");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[55]] = lIIlllIIIIlIllll("Z0KDRd+a9+w=", "mlkKj");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[56]] = lIIlllIIIIlIllll("tjE4i4wP1pg=", "eTwGj");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[57]] = lIIlllIIIIlIllll("MlTEn3EUGXg=", "xDiCq");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[58]] = lIIlllIIIIlIlllI("ih9s92vm8Dg=", "CZNeL");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[59]] = lIIlllIIIIlIllll("llbfrPWxZxI=", "hywLW");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[60]] = lIIlllIIIIlIllIl("EgMENwwH", "snkBb");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[61]] = lIIlllIIIIlIlllI("4JqFnkjLBSs=", "CVZhI");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[62]] = lIIlllIIIIlIllIl("ICIjNwc5JA==", "WCQYn");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[63]] = lIIlllIIIIlIllll("81xuhtiZ28A=", "fhMgF");
        CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[64]] = lIIlllIIIIlIllll("iymQbv1dE1NaOxgcxUs7Dw==", "Ombjj");
    }
    
    private static boolean lIIlllIIIllIIlll(final int llllllllllllIllIIIIllIIIlIIlIIIl) {
        return llllllllllllIllIIIIllIIIlIIlIIIl != 0;
    }
    
    private static boolean lIIlllIIIllIlIlI(final int llllllllllllIllIIIIllIIIlIIIllIl) {
        return llllllllllllIllIIIIllIIIlIIIllIl > 0;
    }
    
    @Override
    public String getCommandName() {
        return CommandWorldBorder.lllIIIIIlIlllI[CommandWorldBorder.lllIIIIlIIIIlI[0]];
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandWorldBorder.lllIIIIlIIIIlI[1];
    }
    
    private static String lIIlllIIIIlIlllI(final String llllllllllllIllIIIIllIIIllIlIIIl, final String llllllllllllIllIIIIllIIIllIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIllIIIllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIllIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIllIIIllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIllIIIllIlIIll.init(CommandWorldBorder.lllIIIIlIIIIlI[1], llllllllllllIllIIIIllIIIllIlIlII);
            return new String(llllllllllllIllIIIIllIIIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIllIIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIllIIIllIlIIlI) {
            llllllllllllIllIIIIllIIIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIIllIlIIl(final int llllllllllllIllIIIIllIIIlIIlIlII, final int llllllllllllIllIIIIllIIIlIIlIIll) {
        return llllllllllllIllIIIIllIIIlIIlIlII > llllllllllllIllIIIIllIIIlIIlIIll;
    }
    
    static {
        lIIlllIIIllIIIll();
        lIIlllIIIlIllIll();
    }
    
    private static boolean lIIlllIIIllIlllI(final int llllllllllllIllIIIIllIIIlIIllIII, final int llllllllllllIllIIIIllIIIlIIlIlll) {
        return llllllllllllIllIIIIllIIIlIIllIII <= llllllllllllIllIIIIllIIIlIIlIlll;
    }
    
    private static void lIIlllIIIllIIIll() {
        (lllIIIIlIIIIlI = new int[66])[0] = ((0xC2 ^ 0xB4 ^ (0xDE ^ 0x85)) & (0x3B ^ 0x6 ^ (0x1C ^ 0xC) ^ -" ".length()));
        CommandWorldBorder.lllIIIIlIIIIlI[1] = "  ".length();
        CommandWorldBorder.lllIIIIlIIIIlI[2] = " ".length();
        CommandWorldBorder.lllIIIIlIIIIlI[3] = "   ".length();
        CommandWorldBorder.lllIIIIlIIIIlI[4] = (0xDA ^ 0x89 ^ (0x60 ^ 0x37));
        CommandWorldBorder.lllIIIIlIIIIlI[5] = (0x46 ^ 0x43);
        CommandWorldBorder.lllIIIIlIIIIlI[6] = (157 + 81 - 122 + 67 ^ 50 + 57 + 10 + 60);
        CommandWorldBorder.lllIIIIlIIIIlI[7] = (0x6E ^ 0x3 ^ (0xAE ^ 0xC4));
        CommandWorldBorder.lllIIIIlIIIIlI[8] = (0x7F ^ 0x77);
        CommandWorldBorder.lllIIIIlIIIIlI[9] = (0xBC ^ 0xB5);
        CommandWorldBorder.lllIIIIlIIIIlI[10] = (0x8F ^ 0x85);
        CommandWorldBorder.lllIIIIlIIIIlI[11] = (0x8E ^ 0x85);
        CommandWorldBorder.lllIIIIlIIIIlI[12] = (140 + 15 - 19 + 50 ^ 67 + 13 - 76 + 178);
        CommandWorldBorder.lllIIIIlIIIIlI[13] = (((0x9A ^ 0xA8) & ~(0x7E ^ 0x4C)) ^ (0x95 ^ 0x98));
        CommandWorldBorder.lllIIIIlIIIIlI[14] = (0x9C ^ 0x92);
        CommandWorldBorder.lllIIIIlIIIIlI[15] = (0x68 ^ 0x3 ^ (0xF2 ^ 0x96));
        CommandWorldBorder.lllIIIIlIIIIlI[16] = (0x29 ^ 0x60 ^ (0x20 ^ 0x79));
        CommandWorldBorder.lllIIIIlIIIIlI[17] = (0xD7 ^ 0xC6);
        CommandWorldBorder.lllIIIIlIIIIlI[18] = (30 + 102 - 77 + 83 ^ 126 + 25 - 23 + 24);
        CommandWorldBorder.lllIIIIlIIIIlI[19] = (106 + 21 - 65 + 69 ^ 6 + 57 + 72 + 9);
        CommandWorldBorder.lllIIIIlIIIIlI[20] = (0x1C ^ 0x8);
        CommandWorldBorder.lllIIIIlIIIIlI[21] = (113 + 103 - 198 + 147 ^ 42 + 40 - 32 + 126);
        CommandWorldBorder.lllIIIIlIIIIlI[22] = (0x97 ^ 0xA4 ^ (0x90 ^ 0xB5));
        CommandWorldBorder.lllIIIIlIIIIlI[23] = (49 + 93 - 107 + 102 ^ 108 + 91 - 149 + 108);
        CommandWorldBorder.lllIIIIlIIIIlI[24] = (101 + 27 - 56 + 96 ^ 145 + 6 - 31 + 56);
        CommandWorldBorder.lllIIIIlIIIIlI[25] = (0xED ^ 0x85 ^ (0x46 ^ 0x37));
        CommandWorldBorder.lllIIIIlIIIIlI[26] = (0xD ^ 0x2 ^ (0x95 ^ 0x80));
        CommandWorldBorder.lllIIIIlIIIIlI[27] = (61 + 30 - 18 + 66 ^ 52 + 116 - 99 + 75);
        CommandWorldBorder.lllIIIIlIIIIlI[28] = (0x66 ^ 0x7A);
        CommandWorldBorder.lllIIIIlIIIIlI[29] = (0x3C ^ 0x32 ^ (0xAD ^ 0xBE));
        CommandWorldBorder.lllIIIIlIIIIlI[30] = (0x83 ^ 0x9D);
        CommandWorldBorder.lllIIIIlIIIIlI[31] = (0xA5 ^ 0xBA);
        CommandWorldBorder.lllIIIIlIIIIlI[32] = (0x8C ^ 0xAC);
        CommandWorldBorder.lllIIIIlIIIIlI[33] = (0x3C ^ 0x71 ^ (0x23 ^ 0x4F));
        CommandWorldBorder.lllIIIIlIIIIlI[34] = (141 + 89 - 78 + 37 ^ 40 + 68 + 31 + 20);
        CommandWorldBorder.lllIIIIlIIIIlI[35] = (0x59 ^ 0x7A);
        CommandWorldBorder.lllIIIIlIIIIlI[36] = (0xF0 ^ 0xB9 ^ (0xD4 ^ 0xB9));
        CommandWorldBorder.lllIIIIlIIIIlI[37] = (74 + 130 - 175 + 109 ^ 53 + 66 + 40 + 16);
        CommandWorldBorder.lllIIIIlIIIIlI[38] = (0x19 ^ 0x5B ^ (0x75 ^ 0x11));
        CommandWorldBorder.lllIIIIlIIIIlI[39] = (0x88 ^ 0xAF);
        CommandWorldBorder.lllIIIIlIIIIlI[40] = (0x7C ^ 0x4C ^ (0x8E ^ 0x96));
        CommandWorldBorder.lllIIIIlIIIIlI[41] = (0xAE ^ 0x87);
        CommandWorldBorder.lllIIIIlIIIIlI[42] = (0xDC ^ 0x8F ^ (0x76 ^ 0xF));
        CommandWorldBorder.lllIIIIlIIIIlI[43] = (0x0 ^ 0x2B);
        CommandWorldBorder.lllIIIIlIIIIlI[44] = (0x7 ^ 0x2B);
        CommandWorldBorder.lllIIIIlIIIIlI[45] = (152 + 99 - 146 + 64 ^ 6 + 95 - 25 + 56);
        CommandWorldBorder.lllIIIIlIIIIlI[46] = (0xEF ^ 0xC1);
        CommandWorldBorder.lllIIIIlIIIIlI[47] = (0x5E ^ 0xB ^ (0x21 ^ 0x5B));
        CommandWorldBorder.lllIIIIlIIIIlI[48] = (0xB9 ^ 0x89);
        CommandWorldBorder.lllIIIIlIIIIlI[49] = (0x5D ^ 0x3B ^ (0xC8 ^ 0x9F));
        CommandWorldBorder.lllIIIIlIIIIlI[50] = ("   ".length() ^ (0xBF ^ 0x8E));
        CommandWorldBorder.lllIIIIlIIIIlI[51] = (0x61 ^ 0x52);
        CommandWorldBorder.lllIIIIlIIIIlI[52] = (0x2 ^ 0x4C ^ (0x48 ^ 0x32));
        CommandWorldBorder.lllIIIIlIIIIlI[53] = (0xA4 ^ 0x91);
        CommandWorldBorder.lllIIIIlIIIIlI[54] = (0x5C ^ 0x2B ^ (0x31 ^ 0x70));
        CommandWorldBorder.lllIIIIlIIIIlI[55] = (0x63 ^ 0x54);
        CommandWorldBorder.lllIIIIlIIIIlI[56] = (0x1E ^ 0x26);
        CommandWorldBorder.lllIIIIlIIIIlI[57] = (149 + 75 - 138 + 81 ^ 141 + 39 - 105 + 83);
        CommandWorldBorder.lllIIIIlIIIIlI[58] = (0x46 ^ 0x62 ^ (0xA0 ^ 0xBE));
        CommandWorldBorder.lllIIIIlIIIIlI[59] = (79 + 121 - 122 + 63 ^ 93 + 46 - 11 + 54);
        CommandWorldBorder.lllIIIIlIIIIlI[60] = (11 + 78 + 26 + 21 ^ 6 + 14 + 115 + 45);
        CommandWorldBorder.lllIIIIlIIIIlI[61] = (0x2D ^ 0x10);
        CommandWorldBorder.lllIIIIlIIIIlI[62] = (157 + 43 - 132 + 98 ^ 95 + 11 - 24 + 70);
        CommandWorldBorder.lllIIIIlIIIIlI[63] = (0x9 ^ 0x36);
        CommandWorldBorder.lllIIIIlIIIIlI[64] = (94 + 113 - 142 + 168 ^ 139 + 143 - 204 + 91);
        CommandWorldBorder.lllIIIIlIIIIlI[65] = (0xC8 ^ 0x89);
    }
    
    private static boolean lIIlllIIIllIlIll(final int llllllllllllIllIIIIllIIIlIIIllll) {
        return llllllllllllIllIIIIllIIIlIIIllll == 0;
    }
    
    private static int lIIlllIIIllIIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
}
