// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Iterator;
import net.minecraft.block.material.Material;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Maps;
import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import com.google.common.collect.Lists;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import java.util.Set;
import net.minecraft.scoreboard.Team;
import net.minecraft.entity.player.EntityPlayer;
import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import java.util.List;
import java.util.Random;

public class CommandSpreadPlayers extends CommandBase
{
    private static final /* synthetic */ int[] lIIlIllIIIIlll;
    private static final /* synthetic */ String[] lIIlIlIllllIIl;
    
    private Position[] func_110670_a(final Random lllllllllllllIIllIIlIllIllIlllII, final int lllllllllllllIIllIIlIllIllIlIIlI, final double lllllllllllllIIllIIlIllIllIllIlI, final double lllllllllllllIIllIIlIllIllIlIIII, final double lllllllllllllIIllIIlIllIllIllIII, final double lllllllllllllIIllIIlIllIllIlIlll) {
        final Position[] lllllllllllllIIllIIlIllIllIlIllI = new Position[lllllllllllllIIllIIlIllIllIlIIlI];
        int lllllllllllllIIllIIlIllIllIlIlIl = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIllIllIlIlIl, lllllllllllllIIllIIlIllIllIlIllI.length)) {
            final Position lllllllllllllIIllIIlIllIllIlIlII = new Position();
            lllllllllllllIIllIIlIllIllIlIlII.func_111097_a(lllllllllllllIIllIIlIllIllIlllII, lllllllllllllIIllIIlIllIllIllIlI, lllllllllllllIIllIIlIllIllIlIIII, lllllllllllllIIllIIlIllIllIllIII, lllllllllllllIIllIIlIllIllIlIlll);
            lllllllllllllIIllIIlIllIllIlIllI[lllllllllllllIIllIIlIllIllIlIlIl] = lllllllllllllIIllIIlIllIllIlIlII;
            ++lllllllllllllIIllIIlIllIllIlIlIl;
        }
        return lllllllllllllIIllIIlIllIllIlIllI;
    }
    
    private static int llIlIIIllIlIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlIIIllIlIIlI(final int lllllllllllllIIllIIlIllIlIIIlllI, final int lllllllllllllIIllIIlIllIlIIIllIl) {
        return lllllllllllllIIllIIlIllIlIIIlllI >= lllllllllllllIIllIIlIllIlIIIllIl;
    }
    
    private int func_110667_a(final List<Entity> lllllllllllllIIllIIlIlllIlIlIllI) {
        final Set<Team> lllllllllllllIIllIIlIlllIlIlIlIl = (Set<Team>)Sets.newHashSet();
        final float lllllllllllllIIllIIlIlllIlIlIIII = (float)lllllllllllllIIllIIlIlllIlIlIllI.iterator();
        "".length();
        if (" ".length() == "  ".length()) {
            return (0x11 ^ 0x28 ^ (0xA4 ^ 0xAF)) & (0x67 ^ 0x14 ^ (0x7A ^ 0x3B) ^ -" ".length());
        }
        while (!llIlIIIllIlIIII(((Iterator)lllllllllllllIIllIIlIlllIlIlIIII).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIllIIlIlllIlIlIlII = ((Iterator<Entity>)lllllllllllllIIllIIlIlllIlIlIIII).next();
            if (llIlIIIllIIllll((lllllllllllllIIllIIlIlllIlIlIlII instanceof EntityPlayer) ? 1 : 0)) {
                lllllllllllllIIllIIlIlllIlIlIlIl.add(((EntityPlayer)lllllllllllllIIllIIlIlllIlIlIlII).getTeam());
                "".length();
                "".length();
                if (null != null) {
                    return (0xE5 ^ 0x8A ^ (0x7E ^ 0x31)) & (0xBE ^ 0x9A ^ (0xA2 ^ 0xA6) ^ -" ".length());
                }
                continue;
            }
            else {
                lllllllllllllIIllIIlIlllIlIlIlIl.add(null);
                "".length();
            }
        }
        return lllllllllllllIIllIIlIlllIlIlIlIl.size();
    }
    
    private void func_110669_a(final ICommandSender lllllllllllllIIllIIlIlllIllIlIlI, final List<Entity> lllllllllllllIIllIIlIlllIllIlIIl, final Position lllllllllllllIIllIIlIlllIllllIII, final double lllllllllllllIIllIIlIlllIlllIlll, final double lllllllllllllIIllIIlIlllIlllIllI, final World lllllllllllllIIllIIlIlllIlllIlIl, final boolean lllllllllllllIIllIIlIlllIllIIlII) throws CommandException {
        final Random lllllllllllllIIllIIlIlllIlllIIll = new Random();
        final double lllllllllllllIIllIIlIlllIlllIIlI = lllllllllllllIIllIIlIlllIllllIII.field_111101_a - lllllllllllllIIllIIlIlllIlllIllI;
        final double lllllllllllllIIllIIlIlllIlllIIIl = lllllllllllllIIllIIlIlllIllllIII.field_111100_b - lllllllllllllIIllIIlIlllIlllIllI;
        final double lllllllllllllIIllIIlIlllIlllIIII = lllllllllllllIIllIIlIlllIllllIII.field_111101_a + lllllllllllllIIllIIlIlllIlllIllI;
        final double lllllllllllllIIllIIlIlllIllIllll = lllllllllllllIIllIIlIlllIllllIII.field_111100_b + lllllllllllllIIllIIlIlllIlllIllI;
        final Random lllllllllllllIIllIIlIllIllIlllII = lllllllllllllIIllIIlIlllIlllIIll;
        int lllllllllllllIIllIIlIllIllIlIIlI;
        if (llIlIIIllIIllll(lllllllllllllIIllIIlIlllIllIIlII ? 1 : 0)) {
            lllllllllllllIIllIIlIllIllIlIIlI = this.func_110667_a(lllllllllllllIIllIIlIlllIllIlIIl);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIllIIlIllIllIlIIlI = lllllllllllllIIllIIlIlllIllIlIIl.size();
        }
        final Position[] lllllllllllllIIllIIlIlllIllIlllI = this.func_110670_a(lllllllllllllIIllIIlIllIllIlllII, lllllllllllllIIllIIlIllIllIlIIlI, lllllllllllllIIllIIlIlllIlllIIlI, lllllllllllllIIllIIlIlllIlllIIIl, lllllllllllllIIllIIlIlllIlllIIII, lllllllllllllIIllIIlIlllIllIllll);
        final int lllllllllllllIIllIIlIlllIllIllIl = this.func_110668_a(lllllllllllllIIllIIlIlllIllllIII, lllllllllllllIIllIIlIlllIlllIlll, lllllllllllllIIllIIlIlllIlllIlIl, lllllllllllllIIllIIlIlllIlllIIll, lllllllllllllIIllIIlIlllIlllIIlI, lllllllllllllIIllIIlIlllIlllIIIl, lllllllllllllIIllIIlIlllIlllIIII, lllllllllllllIIllIIlIlllIllIllll, lllllllllllllIIllIIlIlllIllIlllI, lllllllllllllIIllIIlIlllIllIIlII);
        final double lllllllllllllIIllIIlIlllIllIllII = this.func_110671_a(lllllllllllllIIllIIlIlllIllIlIIl, lllllllllllllIIllIIlIlllIlllIlIl, lllllllllllllIIllIIlIlllIllIlllI, lllllllllllllIIllIIlIlllIllIIlII);
        final StringBuilder sb = new StringBuilder(CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[3]]);
        String str;
        if (llIlIIIllIIllll(lllllllllllllIIllIIlIlllIllIIlII ? 1 : 0)) {
            str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[7]];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[8]];
        }
        final String value = String.valueOf(sb.append(str));
        final Object[] lllllllllllllIIIIlIlllIIIlIIIlll = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[4]];
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = lllllllllllllIIllIIlIlllIllIlllI.length;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSpreadPlayers.lIIlIllIIIIlll[2]] = lllllllllllllIIllIIlIlllIllllIII.field_111101_a;
        lllllllllllllIIIIlIlllIIIlIIIlll[CommandSpreadPlayers.lIIlIllIIIIlll[1]] = lllllllllllllIIllIIlIlllIllllIII.field_111100_b;
        CommandBase.notifyOperators(lllllllllllllIIllIIlIlllIllIlIlI, this, value, lllllllllllllIIIIlIlllIIIlIIIlll);
        if (llIlIIIllIlIIll(lllllllllllllIIllIIlIlllIllIlllI.length, CommandSpreadPlayers.lIIlIllIIIIlll[2])) {
            final StringBuilder sb2 = new StringBuilder(CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[9]]);
            String str2;
            if (llIlIIIllIIllll(lllllllllllllIIllIIlIlllIllIIlII ? 1 : 0)) {
                str2 = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[10]];
                "".length();
                if ((0xF2 ^ 0x86 ^ (0x7B ^ 0xB)) <= "   ".length()) {
                    return;
                }
            }
            else {
                str2 = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[11]];
            }
            final String value2 = String.valueOf(sb2.append(str2));
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[1]];
            final int n = CommandSpreadPlayers.lIIlIllIIIIlll[0];
            final String format = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[12]];
            final Object[] args = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[2]];
            args[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = lllllllllllllIIllIIlIlllIllIllII;
            lllllllllllllIlIIlIlllIIlIIIIIIl[n] = String.format(format, args);
            lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[2]] = lllllllllllllIIllIIlIlllIllIllIl;
            lllllllllllllIIllIIlIlllIllIlIlI.addChatMessage(new ChatComponentTranslation(value2, lllllllllllllIlIIlIlllIIlIIIIIIl));
        }
    }
    
    private static void llIlIIIllIIllIl() {
        (lIIlIllIIIIlll = new int[19])[0] = ((0x78 ^ 0x68) & ~(0x8F ^ 0x9F));
        CommandSpreadPlayers.lIIlIllIIIIlll[1] = "  ".length();
        CommandSpreadPlayers.lIIlIllIIIIlll[2] = " ".length();
        CommandSpreadPlayers.lIIlIllIIIIlll[3] = (0x44 ^ 0x7C ^ (0x89 ^ 0xB7));
        CommandSpreadPlayers.lIIlIllIIIIlll[4] = "   ".length();
        CommandSpreadPlayers.lIIlIllIIIIlll[5] = (70 + 64 - 130 + 146 ^ 29 + 28 - 4 + 93);
        CommandSpreadPlayers.lIIlIllIIIIlll[6] = (94 + 89 - 68 + 19 ^ 61 + 74 - 37 + 33);
        CommandSpreadPlayers.lIIlIllIIIIlll[7] = (0xCF ^ 0xB8 ^ (0x2D ^ 0x5D));
        CommandSpreadPlayers.lIIlIllIIIIlll[8] = (0x11 ^ 0x19);
        CommandSpreadPlayers.lIIlIllIIIIlll[9] = (0x90 ^ 0x99);
        CommandSpreadPlayers.lIIlIllIIIIlll[10] = (0x42 ^ 0x48);
        CommandSpreadPlayers.lIIlIllIIIIlll[11] = (0xEB ^ 0xBB ^ (0x59 ^ 0x2));
        CommandSpreadPlayers.lIIlIllIIIIlll[12] = (0x83 ^ 0x8F);
        CommandSpreadPlayers.lIIlIllIIIIlll[13] = (0xFFFFF77F & 0x2F90);
        CommandSpreadPlayers.lIIlIllIIIIlll[14] = (0x3 ^ 0xE);
        CommandSpreadPlayers.lIIlIllIIIIlll[15] = (157 + 147 - 124 + 5 ^ 152 + 34 - 108 + 105);
        CommandSpreadPlayers.lIIlIllIIIIlll[16] = (0x25 ^ 0x6E ^ (0x42 ^ 0x6));
        CommandSpreadPlayers.lIIlIllIIIIlll[17] = (0x30 ^ 0x20);
        CommandSpreadPlayers.lIIlIllIIIIlll[18] = (0x29 ^ 0x51 ^ (0x45 ^ 0x2C));
    }
    
    private static boolean llIlIIIllIlIIIl(final Object lllllllllllllIIllIIlIllIIllllIll) {
        return lllllllllllllIIllIIlIllIIllllIll == null;
    }
    
    @Override
    public List<String> addTabCompletionOptions(final ICommandSender lllllllllllllIIllIIlIllIllIIIlll, final String[] lllllllllllllIIllIIlIllIllIIIllI, final BlockPos lllllllllllllIIllIIlIllIllIIIlIl) {
        List<String> func_181043_b;
        if (llIlIIIllIlIIlI(lllllllllllllIIllIIlIllIllIIIllI.length, CommandSpreadPlayers.lIIlIllIIIIlll[2]) && llIlIIIllIllIll(lllllllllllllIIllIIlIllIllIIIllI.length, CommandSpreadPlayers.lIIlIllIIIIlll[1])) {
            func_181043_b = CommandBase.func_181043_b(lllllllllllllIIllIIlIllIllIIIllI, CommandSpreadPlayers.lIIlIllIIIIlll[0], lllllllllllllIIllIIlIllIllIIIlIl);
            "".length();
            if (" ".length() == ((0x88 ^ 0x81) & ~(0x9D ^ 0x94))) {
                return null;
            }
        }
        else {
            func_181043_b = null;
        }
        return func_181043_b;
    }
    
    private static boolean llIlIIIllIlIlll(final int lllllllllllllIIllIIlIllIIlllIlIl) {
        return lllllllllllllIIllIIlIllIIlllIlIl < 0;
    }
    
    private static boolean llIlIIIllIlIIII(final int lllllllllllllIIllIIlIllIIlllIlll) {
        return lllllllllllllIIllIIlIllIIlllIlll == 0;
    }
    
    private static void llIlIIIllIIIllI() {
        (lIIlIlIllllIIl = new String[CommandSpreadPlayers.lIIlIllIIIIlll[18]])[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = llIlIIIllIIIIII("Ax0dCxIUHQMPChUfHA==", "pmons");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[2]] = llIlIIIllIIIIII("Fgw3FS8bBylWPQURPxkqBQ87ASsHEHQNPRQEPw==", "ucZxN");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[1]] = llIlIIIllIIIIII("Oz0VARY2NgtCBCggHQ0TKD4ZFRIqIVYZBDk1HQ==", "XRxlw");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[4]] = llIlIIIllIIIIIl("X4DH3GUIP6wM+3I0pO2lT0UUgyQKLO2sVlghnhuHc+v85pKIr0p0aQ==", "njTWy");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[5]] = llIlIIIllIIIIII("AyYQAgQ=", "wCqow");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[6]] = llIlIIIllIIIIlI("0S0wgnMDgio=", "dnhsV");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[3]] = llIlIIIllIIIIlI("AMZ3tH6OE5XeOLLmZHQRFZHhvu1ZzUe/0zfUrRg/79A=", "ymChU");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[7]] = llIlIIIllIIIIlI("X9iTv6lTUx4=", "rBVyR");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[8]] = llIlIIIllIIIIII("ASQSDCgDOw==", "qHsuM");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[9]] = llIlIIIllIIIIIl("lZ9/6Q1ynqWdjQblAI4a0w72H38cSpWLVZHh3qJlPV0=", "oqatY");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[10]] = llIlIIIllIIIIII("PBcrNxE=", "HrJZb");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[11]] = llIlIIIllIIIIII("JjkrLDEkJg==", "VUJUT");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[12]] = llIlIIIllIIIIlI("2bVfHb1e7ys=", "klJTN");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[14]] = llIlIIIllIIIIII("GzYZLi4WPQdtPAgrESIrCDUVOioKKlolLhE1ATEqVg==", "xYtCO");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[15]] = llIlIIIllIIIIIl("VyjVT7D76Kk=", "WIlCK");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[16]] = llIlIIIllIIIIlI("fsG+yjdSqqM=", "KDeiO");
        CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[17]] = llIlIIIllIIIIII("VEFHDA==", "qoujL");
    }
    
    private static boolean llIlIIIllIllIIl(final Object lllllllllllllIIllIIlIllIIllllllI, final Object lllllllllllllIIllIIlIllIIlllllIl) {
        return lllllllllllllIIllIIlIllIIllllllI != lllllllllllllIIllIIlIllIIlllllIl;
    }
    
    private int func_110668_a(final Position lllllllllllllIIllIIlIlllIIlIIlII, final double lllllllllllllIIllIIlIlllIIlIIIll, final World lllllllllllllIIllIIlIlllIIlIIIlI, final Random lllllllllllllIIllIIlIlllIIlIIIIl, final double lllllllllllllIIllIIlIlllIIlIIIII, final double lllllllllllllIIllIIlIlllIIllIlIl, final double lllllllllllllIIllIIlIlllIIIllllI, final double lllllllllllllIIllIIlIlllIIIlllIl, final Position[] lllllllllllllIIllIIlIlllIIIlllII, final boolean lllllllllllllIIllIIlIlllIIIllIll) throws CommandException {
        boolean lllllllllllllIIllIIlIlllIIllIIII = CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0;
        double lllllllllllllIIllIIlIlllIIlIllll = 3.4028234663852886E38;
        int lllllllllllllIIllIIlIlllIIlIlllI = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        "".length();
        if (null != null) {
            return (0x1A ^ 0xD ^ "  ".length()) & (211 + 109 - 260 + 154 ^ 7 + 55 + 89 + 44 ^ -" ".length());
        }
        while (llIlIIIllIIlllI(lllllllllllllIIllIIlIlllIIlIlllI, CommandSpreadPlayers.lIIlIllIIIIlll[13]) && !llIlIIIllIlIIII(lllllllllllllIIllIIlIlllIIllIIII ? 1 : 0)) {
            lllllllllllllIIllIIlIlllIIllIIII = (CommandSpreadPlayers.lIIlIllIIIIlll[0] != 0);
            lllllllllllllIIllIIlIlllIIlIllll = 3.4028234663852886E38;
            int lllllllllllllIIllIIlIlllIIlIllIl = CommandSpreadPlayers.lIIlIllIIIIlll[0];
            "".length();
            if ((0x63 ^ 0x67) < 0) {
                return (0x43 ^ 0x2) & ~(0xC5 ^ 0x84);
            }
            while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIlllIIlIllIl, lllllllllllllIIllIIlIlllIIIlllII.length)) {
                final Position lllllllllllllIIllIIlIlllIIlIllII = lllllllllllllIIllIIlIlllIIIlllII[lllllllllllllIIllIIlIlllIIlIllIl];
                int lllllllllllllIIllIIlIlllIIlIlIll = CommandSpreadPlayers.lIIlIllIIIIlll[0];
                final Position lllllllllllllIIllIIlIlllIIlIlIlI = new Position();
                int lllllllllllllIIllIIlIlllIIlIlIIl = CommandSpreadPlayers.lIIlIllIIIIlll[0];
                "".length();
                if (-" ".length() > 0) {
                    return (0x1C ^ 0x54) & ~(0x3 ^ 0x4B);
                }
                while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIlllIIlIlIIl, lllllllllllllIIllIIlIlllIIIlllII.length)) {
                    if (llIlIIIllIlIllI(lllllllllllllIIllIIlIlllIIlIllIl, lllllllllllllIIllIIlIlllIIlIlIIl)) {
                        final Position lllllllllllllIIllIIlIlllIIlIlIII = lllllllllllllIIllIIlIlllIIIlllII[lllllllllllllIIllIIlIlllIIlIlIIl];
                        final double lllllllllllllIIllIIlIlllIIlIIlll = lllllllllllllIIllIIlIlllIIlIllII.func_111099_a(lllllllllllllIIllIIlIlllIIlIlIII);
                        lllllllllllllIIllIIlIlllIIlIllll = Math.min(lllllllllllllIIllIIlIlllIIlIIlll, lllllllllllllIIllIIlIlllIIlIllll);
                        if (llIlIIIllIlIlll(llIlIIIllIlIlII(lllllllllllllIIllIIlIlllIIlIIlll, lllllllllllllIIllIIlIlllIIlIIIll))) {
                            ++lllllllllllllIIllIIlIlllIIlIlIll;
                            final Position position = lllllllllllllIIllIIlIlllIIlIlIlI;
                            position.field_111101_a += lllllllllllllIIllIIlIlllIIlIlIII.field_111101_a - lllllllllllllIIllIIlIlllIIlIllII.field_111101_a;
                            final Position position2 = lllllllllllllIIllIIlIlllIIlIlIlI;
                            position2.field_111100_b += lllllllllllllIIllIIlIlllIIlIlIII.field_111100_b - lllllllllllllIIllIIlIlllIIlIllII.field_111100_b;
                        }
                    }
                    ++lllllllllllllIIllIIlIlllIIlIlIIl;
                }
                if (llIlIIIllIllIII(lllllllllllllIIllIIlIlllIIlIlIll)) {
                    final Position position3 = lllllllllllllIIllIIlIlllIIlIlIlI;
                    position3.field_111101_a /= lllllllllllllIIllIIlIlllIIlIlIll;
                    final Position position4 = lllllllllllllIIllIIlIlllIIlIlIlI;
                    position4.field_111100_b /= lllllllllllllIIllIIlIlllIIlIlIll;
                    final double lllllllllllllIIllIIlIlllIIlIIllI = lllllllllllllIIllIIlIlllIIlIlIlI.func_111096_b();
                    if (llIlIIIllIllIII(llIlIIIllIlIlIl(lllllllllllllIIllIIlIlllIIlIIllI, 0.0))) {
                        lllllllllllllIIllIIlIlllIIlIlIlI.func_111095_a();
                        lllllllllllllIIllIIlIlllIIlIllII.func_111094_b(lllllllllllllIIllIIlIlllIIlIlIlI);
                        "".length();
                        if ((0xB6 ^ 0xB2) <= 0) {
                            return (0x12 ^ 0x1) & ~(0x64 ^ 0x77) & ~((0x54 ^ 0x36) & ~(0x46 ^ 0x24));
                        }
                    }
                    else {
                        lllllllllllllIIllIIlIlllIIlIllII.func_111097_a(lllllllllllllIIllIIlIlllIIlIIIIl, lllllllllllllIIllIIlIlllIIlIIIII, lllllllllllllIIllIIlIlllIIllIlIl, lllllllllllllIIllIIlIlllIIIllllI, lllllllllllllIIllIIlIlllIIIlllIl);
                    }
                    lllllllllllllIIllIIlIlllIIllIIII = (CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0);
                }
                if (llIlIIIllIIllll(lllllllllllllIIllIIlIlllIIlIllII.func_111093_a(lllllllllllllIIllIIlIlllIIlIIIII, lllllllllllllIIllIIlIlllIIllIlIl, lllllllllllllIIllIIlIlllIIIllllI, lllllllllllllIIllIIlIlllIIIlllIl) ? 1 : 0)) {
                    lllllllllllllIIllIIlIlllIIllIIII = (CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0);
                }
                ++lllllllllllllIIllIIlIlllIIlIllIl;
            }
            if (llIlIIIllIlIIII(lllllllllllllIIllIIlIlllIIllIIII ? 1 : 0)) {
                final char lllllllllllllIIllIIlIlllIIIlIlIl = (char)lllllllllllllIIllIIlIlllIIIlllII.length;
                int lllllllllllllIIllIIlIllIlIIIlllI = CommandSpreadPlayers.lIIlIllIIIIlll[0];
                "".length();
                if (((0x7D ^ 0x7A ^ (0x89 ^ 0xAD)) & (102 + 100 - 157 + 144 ^ 28 + 17 - 1 + 114 ^ -" ".length())) > 0) {
                    return (0xD ^ 0x63 ^ (0xB3 ^ 0x9C)) & (0x37 ^ 0x6B ^ (0x64 ^ 0x79) ^ -" ".length());
                }
                while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIllIlIIIlllI, lllllllllllllIIllIIlIlllIIIlIlIl)) {
                    final Position lllllllllllllIIllIIlIlllIIlIIlIl = lllllllllllllIIllIIlIlllIIIlllII[lllllllllllllIIllIIlIllIlIIIlllI];
                    if (llIlIIIllIlIIII(lllllllllllllIIllIIlIlllIIlIIlIl.func_111098_b(lllllllllllllIIllIIlIlllIIlIIIlI) ? 1 : 0)) {
                        lllllllllllllIIllIIlIlllIIlIIlIl.func_111097_a(lllllllllllllIIllIIlIlllIIlIIIIl, lllllllllllllIIllIIlIlllIIlIIIII, lllllllllllllIIllIIlIlllIIllIlIl, lllllllllllllIIllIIlIlllIIIllllI, lllllllllllllIIllIIlIlllIIIlllIl);
                        lllllllllllllIIllIIlIlllIIllIIII = (CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0);
                    }
                    ++lllllllllllllIIllIIlIllIlIIIlllI;
                }
            }
            ++lllllllllllllIIllIIlIlllIIlIlllI;
        }
        if (llIlIIIllIlIIlI(lllllllllllllIIllIIlIlllIIlIlllI, CommandSpreadPlayers.lIIlIllIIIIlll[13])) {
            final StringBuilder sb = new StringBuilder(CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[14]]);
            String str;
            if (llIlIIIllIIllll(lllllllllllllIIllIIlIlllIIIllIll ? 1 : 0)) {
                str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[15]];
                "".length();
                if (null != null) {
                    return (0xF9 ^ 0xB6 ^ (0x6D ^ 0x61)) & (0x9A ^ 0x8C ^ (0xCD ^ 0x98) ^ -" ".length());
                }
            }
            else {
                str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[16]];
            }
            final String value = String.valueOf(sb.append(str));
            final Object[] lllllllllllllIlIIIIIIlIlIllIIlIl = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[5]];
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = lllllllllllllIIllIIlIlllIIIlllII.length;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandSpreadPlayers.lIIlIllIIIIlll[2]] = lllllllllllllIIllIIlIlllIIlIIlII.field_111101_a;
            lllllllllllllIlIIIIIIlIlIllIIlIl[CommandSpreadPlayers.lIIlIllIIIIlll[1]] = lllllllllllllIIllIIlIlllIIlIIlII.field_111100_b;
            final int n = CommandSpreadPlayers.lIIlIllIIIIlll[4];
            final String format = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[17]];
            final Object[] args = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[2]];
            args[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = lllllllllllllIIllIIlIlllIIlIllll;
            lllllllllllllIlIIIIIIlIlIllIIlIl[n] = String.format(format, args);
            throw new CommandException(value, lllllllllllllIlIIIIIIlIlIllIIlIl);
        }
        return lllllllllllllIIllIIlIlllIIlIlllI;
    }
    
    private static boolean llIlIIIllIlIllI(final int lllllllllllllIIllIIlIllIIlllIIII, final int lllllllllllllIIllIIlIllIIllIllll) {
        return lllllllllllllIIllIIlIllIIlllIIII != lllllllllllllIIllIIlIllIIllIllll;
    }
    
    private static boolean llIlIIIllIllIII(final int lllllllllllllIIllIIlIllIIlllIIll) {
        return lllllllllllllIIllIIlIllIIlllIIll > 0;
    }
    
    @Override
    public void processCommand(final ICommandSender lllllllllllllIIllIIlIllllIlIIlIl, final String[] lllllllllllllIIllIIlIllllIlIIlII) throws CommandException {
        if (llIlIIIllIIlllI(lllllllllllllIIllIIlIllllIlIIlII.length, CommandSpreadPlayers.lIIlIllIIIIlll[3])) {
            throw new WrongUsageException(CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[1]], new Object[CommandSpreadPlayers.lIIlIllIIIIlll[0]]);
        }
        int lllllllllllllIIllIIlIllllIlIIIll = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        final BlockPos lllllllllllllIIllIIlIllllIlIIIlI = lllllllllllllIIllIIlIllllIlIIlIl.getPosition();
        final double lllllllllllllIIllIIlIllllIlIIIIl = CommandBase.parseDouble(lllllllllllllIIllIIlIllllIlIIIlI.getX(), lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++], (boolean)(CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0));
        final double lllllllllllllIIllIIlIllllIlIIIII = CommandBase.parseDouble(lllllllllllllIIllIIlIllllIlIIIlI.getZ(), lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++], (boolean)(CommandSpreadPlayers.lIIlIllIIIIlll[2] != 0));
        final double lllllllllllllIIllIIlIllllIIlllll = CommandBase.parseDouble(lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++], 0.0);
        final double lllllllllllllIIllIIlIllllIIllllI = CommandBase.parseDouble(lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++], lllllllllllllIIllIIlIllllIIlllll + 1.0);
        final boolean lllllllllllllIIllIIlIllllIIlllIl = CommandBase.parseBoolean(lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++]);
        final List<Entity> lllllllllllllIIllIIlIllllIIlllII = (List<Entity>)Lists.newArrayList();
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIllllIlIIIll, lllllllllllllIIllIIlIllllIlIIlII.length)) {
            final String lllllllllllllIIllIIlIllllIIllIll = lllllllllllllIIllIIlIllllIlIIlII[lllllllllllllIIllIIlIllllIlIIIll++];
            if (llIlIIIllIIllll(PlayerSelector.hasArguments(lllllllllllllIIllIIlIllllIIllIll) ? 1 : 0)) {
                final List<Entity> lllllllllllllIIllIIlIllllIIllIlI = PlayerSelector.matchEntities(lllllllllllllIIllIIlIllllIlIIlIl, lllllllllllllIIllIIlIllllIIllIll, (Class<? extends Entity>)Entity.class);
                if (llIlIIIllIlIIII(lllllllllllllIIllIIlIllllIIllIlI.size())) {
                    throw new EntityNotFoundException();
                }
                lllllllllllllIIllIIlIllllIIlllII.addAll(lllllllllllllIIllIIlIllllIIllIlI);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                continue;
            }
            else {
                final EntityPlayer lllllllllllllIIllIIlIllllIIllIIl = MinecraftServer.getServer().getConfigurationManager().getPlayerByUsername(lllllllllllllIIllIIlIllllIIllIll);
                if (llIlIIIllIlIIIl(lllllllllllllIIllIIlIllllIIllIIl)) {
                    throw new PlayerNotFoundException();
                }
                lllllllllllllIIllIIlIllllIIlllII.add(lllllllllllllIIllIIlIllllIIllIIl);
                "".length();
            }
        }
        lllllllllllllIIllIIlIllllIlIIlIl.setCommandStat(CommandResultStats.Type.AFFECTED_ENTITIES, lllllllllllllIIllIIlIllllIIlllII.size());
        if (llIlIIIllIIllll(lllllllllllllIIllIIlIllllIIlllII.isEmpty() ? 1 : 0)) {
            throw new EntityNotFoundException();
        }
        final StringBuilder sb = new StringBuilder(CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[4]]);
        String str;
        if (llIlIIIllIIllll(lllllllllllllIIllIIlIllllIIlllIl ? 1 : 0)) {
            str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[5]];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            str = CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[6]];
        }
        final String value = String.valueOf(sb.append(str));
        final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[CommandSpreadPlayers.lIIlIllIIIIlll[6]];
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[0]] = lllllllllllllIIllIIlIllllIIlllII.size();
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[2]] = lllllllllllllIIllIIlIllllIIllllI;
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[1]] = lllllllllllllIIllIIlIllllIlIIIIl;
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[4]] = lllllllllllllIIllIIlIllllIlIIIII;
        lllllllllllllIlIIlIlllIIlIIIIIIl[CommandSpreadPlayers.lIIlIllIIIIlll[5]] = lllllllllllllIIllIIlIllllIIlllll;
        lllllllllllllIIllIIlIllllIlIIlIl.addChatMessage(new ChatComponentTranslation(value, lllllllllllllIlIIlIlllIIlIIIIIIl));
        this.func_110669_a(lllllllllllllIIllIIlIllllIlIIlIl, lllllllllllllIIllIIlIllllIIlllII, new Position(lllllllllllllIIllIIlIllllIlIIIIl, lllllllllllllIIllIIlIllllIlIIIII), lllllllllllllIIllIIlIllllIIlllll, lllllllllllllIIllIIlIllllIIllllI, lllllllllllllIIllIIlIllllIIlllII.get(CommandSpreadPlayers.lIIlIllIIIIlll[0]).worldObj, lllllllllllllIIllIIlIllllIIlllIl);
    }
    
    private double func_110671_a(final List<Entity> lllllllllllllIIllIIlIlllIIIIIIlI, final World lllllllllllllIIllIIlIlllIIIIIIIl, final Position[] lllllllllllllIIllIIlIlllIIIIIIII, final boolean lllllllllllllIIllIIlIllIllllIIII) {
        double lllllllllllllIIllIIlIllIlllllllI = 0.0;
        int lllllllllllllIIllIIlIllIllllllIl = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        final Map<Team, Position> lllllllllllllIIllIIlIllIllllllII = (Map<Team, Position>)Maps.newHashMap();
        int lllllllllllllIIllIIlIllIlllllIll = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        "".length();
        if (null != null) {
            return 0.0;
        }
        while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIllIlllllIll, lllllllllllllIIllIIlIlllIIIIIIlI.size())) {
            final Entity lllllllllllllIIllIIlIllIlllllIlI = lllllllllllllIIllIIlIlllIIIIIIlI.get(lllllllllllllIIllIIlIllIlllllIll);
            Position lllllllllllllIIllIIlIllIlllllIII = null;
            if (llIlIIIllIIllll(lllllllllllllIIllIIlIllIllllIIII ? 1 : 0)) {
                Team team;
                if (llIlIIIllIIllll((lllllllllllllIIllIIlIllIlllllIlI instanceof EntityPlayer) ? 1 : 0)) {
                    team = ((EntityPlayer)lllllllllllllIIllIIlIllIlllllIlI).getTeam();
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return 0.0;
                    }
                }
                else {
                    team = null;
                }
                final Team lllllllllllllIIllIIlIllIllllIlll = team;
                if (llIlIIIllIlIIII(lllllllllllllIIllIIlIllIllllllII.containsKey(lllllllllllllIIllIIlIllIllllIlll) ? 1 : 0)) {
                    lllllllllllllIIllIIlIllIllllllII.put(lllllllllllllIIllIIlIllIllllIlll, lllllllllllllIIllIIlIlllIIIIIIII[lllllllllllllIIllIIlIllIllllllIl++]);
                    "".length();
                }
                final Position lllllllllllllIIllIIlIllIlllllIIl = lllllllllllllIIllIIlIllIllllllII.get(lllllllllllllIIllIIlIllIllllIlll);
                "".length();
                if ("   ".length() <= 0) {
                    return 0.0;
                }
            }
            else {
                lllllllllllllIIllIIlIllIlllllIII = lllllllllllllIIllIIlIlllIIIIIIII[lllllllllllllIIllIIlIllIllllllIl++];
            }
            lllllllllllllIIllIIlIllIlllllIlI.setPositionAndUpdate(MathHelper.floor_double(lllllllllllllIIllIIlIllIlllllIII.field_111101_a) + 0.5f, lllllllllllllIIllIIlIllIlllllIII.func_111092_a(lllllllllllllIIllIIlIlllIIIIIIIl), MathHelper.floor_double(lllllllllllllIIllIIlIllIlllllIII.field_111100_b) + 0.5);
            double lllllllllllllIIllIIlIllIllllIllI = Double.MAX_VALUE;
            int lllllllllllllIIllIIlIllIllllIlIl = CommandSpreadPlayers.lIIlIllIIIIlll[0];
            "".length();
            if (((0x5E ^ 0x33 ^ (0xFA ^ 0xA2)) & (167 + 19 - 119 + 114 ^ 71 + 9 - 30 + 78 ^ -" ".length())) >= (192 + 157 - 230 + 74 ^ 186 + 77 - 227 + 161)) {
                return 0.0;
            }
            while (!llIlIIIllIlIIlI(lllllllllllllIIllIIlIllIllllIlIl, lllllllllllllIIllIIlIlllIIIIIIII.length)) {
                if (llIlIIIllIllIIl(lllllllllllllIIllIIlIllIlllllIII, lllllllllllllIIllIIlIlllIIIIIIII[lllllllllllllIIllIIlIllIllllIlIl])) {
                    final double lllllllllllllIIllIIlIllIllllIlII = lllllllllllllIIllIIlIllIlllllIII.func_111099_a(lllllllllllllIIllIIlIlllIIIIIIII[lllllllllllllIIllIIlIllIllllIlIl]);
                    lllllllllllllIIllIIlIllIllllIllI = Math.min(lllllllllllllIIllIIlIllIllllIlII, lllllllllllllIIllIIlIllIllllIllI);
                }
                ++lllllllllllllIIllIIlIllIllllIlIl;
            }
            lllllllllllllIIllIIlIllIlllllllI += lllllllllllllIIllIIlIllIllllIllI;
            ++lllllllllllllIIllIIlIllIlllllIll;
        }
        lllllllllllllIIllIIlIllIlllllllI /= lllllllllllllIIllIIlIlllIIIIIIlI.size();
        return lllllllllllllIIllIIlIllIlllllllI;
    }
    
    private static String llIlIIIllIIIIII(String lllllllllllllIIllIIlIllIlIIllIIl, final String lllllllllllllIIllIIlIllIlIIlllIl) {
        lllllllllllllIIllIIlIllIlIIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIllIlIIlllII = new StringBuilder();
        final char[] lllllllllllllIIllIIlIllIlIIllIll = lllllllllllllIIllIIlIllIlIIlllIl.toCharArray();
        int lllllllllllllIIllIIlIllIlIIllIlI = CommandSpreadPlayers.lIIlIllIIIIlll[0];
        final long lllllllllllllIIllIIlIllIlIIlIlII = (Object)lllllllllllllIIllIIlIllIlIIllIIl.toCharArray();
        final int lllllllllllllIIllIIlIllIlIIlIIll = lllllllllllllIIllIIlIllIlIIlIlII.length;
        short lllllllllllllIIllIIlIllIlIIlIIlI = (short)CommandSpreadPlayers.lIIlIllIIIIlll[0];
        while (llIlIIIllIIlllI(lllllllllllllIIllIIlIllIlIIlIIlI, lllllllllllllIIllIIlIllIlIIlIIll)) {
            final char lllllllllllllIIllIIlIllIlIIlllll = lllllllllllllIIllIIlIllIlIIlIlII[lllllllllllllIIllIIlIllIlIIlIIlI];
            lllllllllllllIIllIIlIllIlIIlllII.append((char)(lllllllllllllIIllIIlIllIlIIlllll ^ lllllllllllllIIllIIlIllIlIIllIll[lllllllllllllIIllIIlIllIlIIllIlI % lllllllllllllIIllIIlIllIlIIllIll.length]));
            "".length();
            ++lllllllllllllIIllIIlIllIlIIllIlI;
            ++lllllllllllllIIllIIlIllIlIIlIIlI;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIllIlIIlllII);
    }
    
    static {
        llIlIIIllIIllIl();
        llIlIIIllIIIllI();
    }
    
    private static boolean llIlIIIllIIlllI(final int lllllllllllllIIllIIlIllIlIIIlIlI, final int lllllllllllllIIllIIlIllIlIIIlIIl) {
        return lllllllllllllIIllIIlIllIlIIIlIlI < lllllllllllllIIllIIlIllIlIIIlIIl;
    }
    
    private static String llIlIIIllIIIIIl(final String lllllllllllllIIllIIlIllIlIlllIIl, final String lllllllllllllIIllIIlIllIlIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIllIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIllIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIllIlIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIllIlIllllIl.init(CommandSpreadPlayers.lIIlIllIIIIlll[1], lllllllllllllIIllIIlIllIlIlllllI);
            return new String(lllllllllllllIIllIIlIllIlIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIllIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIllIlIllllII) {
            lllllllllllllIIllIIlIllIlIllllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getCommandUsage(final ICommandSender lllllllllllllIIllIIlIllllIllIlII) {
        return CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[2]];
    }
    
    private static boolean llIlIIIllIlIIll(final int lllllllllllllIIllIIlIllIlIIIIIlI, final int lllllllllllllIIllIIlIllIlIIIIIIl) {
        return lllllllllllllIIllIIlIllIlIIIIIlI > lllllllllllllIIllIIlIllIlIIIIIIl;
    }
    
    private static int llIlIIIllIlIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public int getRequiredPermissionLevel() {
        return CommandSpreadPlayers.lIIlIllIIIIlll[1];
    }
    
    private static boolean llIlIIIllIllIll(final int lllllllllllllIIllIIlIllIlIIIIllI, final int lllllllllllllIIllIIlIllIlIIIIlIl) {
        return lllllllllllllIIllIIlIllIlIIIIllI <= lllllllllllllIIllIIlIllIlIIIIlIl;
    }
    
    private static String llIlIIIllIIIIlI(final String lllllllllllllIIllIIlIllIlIlIllII, final String lllllllllllllIIllIIlIllIlIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIllIlIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), CommandSpreadPlayers.lIIlIllIIIIlll[8]), "DES");
            final Cipher lllllllllllllIIllIIlIllIlIllIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIllIlIllIIII.init(CommandSpreadPlayers.lIIlIllIIIIlll[1], lllllllllllllIIllIIlIllIlIllIIIl);
            return new String(lllllllllllllIIllIIlIllIlIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIllIlIlIllll) {
            lllllllllllllIIllIIlIllIlIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIIllIIllll(final int lllllllllllllIIllIIlIllIIllllIIl) {
        return lllllllllllllIIllIIlIllIIllllIIl != 0;
    }
    
    @Override
    public String getCommandName() {
        return CommandSpreadPlayers.lIIlIlIllllIIl[CommandSpreadPlayers.lIIlIllIIIIlll[0]];
    }
    
    static class Position
    {
        private static final /* synthetic */ int[] lllIIlllIIIIII;
        /* synthetic */ double field_111101_a;
        /* synthetic */ double field_111100_b;
        
        Position() {
        }
        
        public void func_111094_b(final Position llllllllllllIlIlllIlllIlIIIIIlIl) {
            this.field_111101_a -= llllllllllllIlIlllIlllIlIIIIIlIl.field_111101_a;
            this.field_111100_b -= llllllllllllIlIlllIlllIlIIIIIlIl.field_111100_b;
        }
        
        private static boolean lIlIIIIIlIIllIll(final int llllllllllllIlIlllIlllIIllIIIlII) {
            return llllllllllllIlIlllIlllIIllIIIlII == 0;
        }
        
        public int func_111092_a(final World llllllllllllIlIlllIlllIIlllIllII) {
            BlockPos llllllllllllIlIlllIlllIIlllIlIll = new BlockPos(this.field_111101_a, 256.0, this.field_111100_b);
            "".length();
            if (" ".length() == (0x88 ^ 0x8C)) {
                return (0x5F ^ 0x15) & ~(0x8C ^ 0xC6);
            }
            while (!lIlIIIIIlIIllIlI(llllllllllllIlIlllIlllIIlllIlIll.getY())) {
                llllllllllllIlIlllIlllIIlllIlIll = llllllllllllIlIlllIlllIIlllIlIll.down();
                if (lIlIIIIIlIIllIIl(llllllllllllIlIlllIlllIIlllIllII.getBlockState(llllllllllllIlIlllIlllIIlllIlIll).getBlock().getMaterial(), Material.air)) {
                    return llllllllllllIlIlllIlllIIlllIlIll.getY() + Position.lllIIlllIIIIII[1];
                }
            }
            return Position.lllIIlllIIIIII[2];
        }
        
        private static int lIlIIIIIlIIlIlIl(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private static int lIlIIIIIlIIlIllI(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        public void func_111097_a(final Random llllllllllllIlIlllIlllIIllIlIlII, final double llllllllllllIlIlllIlllIIllIlIIll, final double llllllllllllIlIlllIlllIIllIlIIlI, final double llllllllllllIlIlllIlllIIllIlIIIl, final double llllllllllllIlIlllIlllIIllIIlIlI) {
            this.field_111101_a = MathHelper.getRandomDoubleInRange(llllllllllllIlIlllIlllIIllIlIlII, llllllllllllIlIlllIlllIIllIlIIll, llllllllllllIlIlllIlllIIllIlIIIl);
            this.field_111100_b = MathHelper.getRandomDoubleInRange(llllllllllllIlIlllIlllIIllIlIlII, llllllllllllIlIlllIlllIIllIlIIlI, llllllllllllIlIlllIlllIIllIIlIlI);
        }
        
        float func_111096_b() {
            return MathHelper.sqrt_double(this.field_111101_a * this.field_111101_a + this.field_111100_b * this.field_111100_b);
        }
        
        private static void lIlIIIIIlIIlIlII() {
            (lllIIlllIIIIII = new int[3])[0] = ((0x7B ^ 0x5D) & ~(0x33 ^ 0x15));
            Position.lllIIlllIIIIII[1] = " ".length();
            Position.lllIIlllIIIIII[2] = (-(-1 & 0x4EA5) & (0xFFFFEFFD & 0x5FA7));
        }
        
        double func_111099_a(final Position llllllllllllIlIlllIlllIlIIIlIlII) {
            final double llllllllllllIlIlllIlllIlIIIlIlll = this.field_111101_a - llllllllllllIlIlllIlllIlIIIlIlII.field_111101_a;
            final double llllllllllllIlIlllIlllIlIIIlIllI = this.field_111100_b - llllllllllllIlIlllIlllIlIIIlIlII.field_111100_b;
            return Math.sqrt(llllllllllllIlIlllIlllIlIIIlIlll * llllllllllllIlIlllIlllIlIIIlIlll + llllllllllllIlIlllIlllIlIIIlIllI * llllllllllllIlIlllIlllIlIIIlIllI);
        }
        
        private static boolean lIlIIIIIlIIlIlll(final int llllllllllllIlIlllIlllIIllIIIIlI) {
            return llllllllllllIlIlllIlllIIllIIIIlI < 0;
        }
        
        public boolean func_111093_a(final double llllllllllllIlIlllIlllIIllllIlIl, final double llllllllllllIlIlllIlllIIlllllIlI, final double llllllllllllIlIlllIlllIIllllIIll, final double llllllllllllIlIlllIlllIIllllIIlI) {
            boolean llllllllllllIlIlllIlllIIllllIlll = Position.lllIIlllIIIIII[0] != 0;
            if (lIlIIIIIlIIlIlll(lIlIIIIIlIIlIlIl(this.field_111101_a, llllllllllllIlIlllIlllIIllllIlIl))) {
                this.field_111101_a = llllllllllllIlIlllIlllIIllllIlIl;
                llllllllllllIlIlllIlllIIllllIlll = (Position.lllIIlllIIIIII[1] != 0);
                "".length();
                if (null != null) {
                    return ((0x1F ^ 0x52) & ~(0x76 ^ 0x3B)) != 0x0;
                }
            }
            else if (lIlIIIIIlIIllIII(lIlIIIIIlIIlIllI(this.field_111101_a, llllllllllllIlIlllIlllIIllllIIll))) {
                this.field_111101_a = llllllllllllIlIlllIlllIIllllIIll;
                llllllllllllIlIlllIlllIIllllIlll = (Position.lllIIlllIIIIII[1] != 0);
            }
            if (lIlIIIIIlIIlIlll(lIlIIIIIlIIlIlIl(this.field_111100_b, llllllllllllIlIlllIlllIIlllllIlI))) {
                this.field_111100_b = llllllllllllIlIlllIlllIIlllllIlI;
                llllllllllllIlIlllIlllIIllllIlll = (Position.lllIIlllIIIIII[1] != 0);
                "".length();
                if ((0xA4 ^ 0xA0) <= "  ".length()) {
                    return ((0x5C ^ 0x8) & ~(0xE0 ^ 0xB4)) != 0x0;
                }
            }
            else if (lIlIIIIIlIIllIII(lIlIIIIIlIIlIllI(this.field_111100_b, llllllllllllIlIlllIlllIIllllIIlI))) {
                this.field_111100_b = llllllllllllIlIlllIlllIIllllIIlI;
                llllllllllllIlIlllIlllIIllllIlll = (Position.lllIIlllIIIIII[1] != 0);
            }
            return llllllllllllIlIlllIlllIIllllIlll;
        }
        
        private static boolean lIlIIIIIlIIllIlI(final int llllllllllllIlIlllIlllIIllIIIIII) {
            return llllllllllllIlIlllIlllIIllIIIIII <= 0;
        }
        
        Position(final double llllllllllllIlIlllIlllIlIIIlllll, final double llllllllllllIlIlllIlllIlIIIllllI) {
            this.field_111101_a = llllllllllllIlIlllIlllIlIIIlllll;
            this.field_111100_b = llllllllllllIlIlllIlllIlIIIllllI;
        }
        
        void func_111095_a() {
            final double llllllllllllIlIlllIlllIlIIIIlllI = this.func_111096_b();
            this.field_111101_a /= llllllllllllIlIlllIlllIlIIIIlllI;
            this.field_111100_b /= llllllllllllIlIlllIlllIlIIIIlllI;
        }
        
        private static boolean lIlIIIIIlIIllIII(final int llllllllllllIlIlllIlllIIlIlllllI) {
            return llllllllllllIlIlllIlllIIlIlllllI > 0;
        }
        
        public boolean func_111098_b(final World llllllllllllIlIlllIlllIIllIllllI) {
            BlockPos llllllllllllIlIlllIlllIIlllIIIIl = new BlockPos(this.field_111101_a, 256.0, this.field_111100_b);
            "".length();
            if (" ".length() < 0) {
                return ((0x68 ^ 0x71) & ~(0x47 ^ 0x5E)) != 0x0;
            }
            while (!lIlIIIIIlIIllIlI(llllllllllllIlIlllIlllIIlllIIIIl.getY())) {
                llllllllllllIlIlllIlllIIlllIIIIl = llllllllllllIlIlllIlllIIlllIIIIl.down();
                final Material llllllllllllIlIlllIlllIIlllIIIII = llllllllllllIlIlllIlllIIllIllllI.getBlockState(llllllllllllIlIlllIlllIIlllIIIIl).getBlock().getMaterial();
                if (lIlIIIIIlIIllIIl(llllllllllllIlIlllIlllIIlllIIIII, Material.air)) {
                    if (lIlIIIIIlIIllIll(llllllllllllIlIlllIlllIIlllIIIII.isLiquid() ? 1 : 0) && lIlIIIIIlIIllIIl(llllllllllllIlIlllIlllIIlllIIIII, Material.fire)) {
                        return Position.lllIIlllIIIIII[1] != 0;
                    }
                    return Position.lllIIlllIIIIII[0] != 0;
                }
            }
            return Position.lllIIlllIIIIII[0] != 0;
        }
        
        static {
            lIlIIIIIlIIlIlII();
        }
        
        private static boolean lIlIIIIIlIIllIIl(final Object llllllllllllIlIlllIlllIIllIIIlll, final Object llllllllllllIlIlllIlllIIllIIIllI) {
            return llllllllllllIlIlllIlllIIllIIIlll != llllllllllllIlIlllIlllIIllIIIllI;
        }
    }
}
