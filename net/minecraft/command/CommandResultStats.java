// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

public class CommandResultStats
{
    private static final /* synthetic */ String[] STRING_RESULT_TYPES;
    private /* synthetic */ String[] field_179675_c;
    private static final /* synthetic */ String[] lIIIIlIlIIIlll;
    private /* synthetic */ String[] field_179673_d;
    private static final /* synthetic */ int NUM_RESULT_TYPES;
    private static final /* synthetic */ int[] lIIIIlIlIIlIlI;
    
    public void writeStatsToNBT(final NBTTagCompound lllllllllllllIlIIlIllIllIIIIIlII) {
        final NBTTagCompound lllllllllllllIlIIlIllIllIIIIIIll = new NBTTagCompound();
        final boolean lllllllllllllIlIIlIllIlIlllllIIl;
        final Exception lllllllllllllIlIIlIllIlIlllllIlI = (Exception)((Type[])(Object)(lllllllllllllIlIIlIllIlIlllllIIl = (boolean)(Object)Type.values())).length;
        long lllllllllllllIlIIlIllIlIlllllIll = CommandResultStats.lIIIIlIlIIlIlI[0];
        "".length();
        if (-(0x18 ^ 0x47 ^ (0xCB ^ 0x90)) >= 0) {
            return;
        }
        while (!lIlllIIllIIlIlI((int)lllllllllllllIlIIlIllIlIlllllIll, (int)lllllllllllllIlIIlIllIlIlllllIlI)) {
            final Type lllllllllllllIlIIlIllIllIIIIIIlI = lllllllllllllIlIIlIllIlIlllllIIl[lllllllllllllIlIIlIllIlIlllllIll];
            final String lllllllllllllIlIIlIllIllIIIIIIIl = this.field_179675_c[lllllllllllllIlIIlIllIllIIIIIIlI.getTypeID()];
            final String lllllllllllllIlIIlIllIllIIIIIIII = this.field_179673_d[lllllllllllllIlIIlIllIllIIIIIIlI.getTypeID()];
            if (lIlllIIllIIlIII(lllllllllllllIlIIlIllIllIIIIIIIl) && lIlllIIllIIlIII(lllllllllllllIlIIlIllIllIIIIIIII)) {
                lllllllllllllIlIIlIllIllIIIIIIll.setString(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIlIllIllIIIIIIlI.getTypeName())).append(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[6]])), lllllllllllllIlIIlIllIllIIIIIIIl);
                lllllllllllllIlIIlIllIllIIIIIIll.setString(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIlIllIllIIIIIIlI.getTypeName())).append(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[7]])), lllllllllllllIlIIlIllIllIIIIIIII);
            }
            ++lllllllllllllIlIIlIllIlIlllllIll;
        }
        if (lIlllIIllIIllII(lllllllllllllIlIIlIllIllIIIIIIll.hasNoTags() ? 1 : 0)) {
            lllllllllllllIlIIlIllIllIIIIIlII.setTag(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[8]], lllllllllllllIlIIlIllIllIIIIIIll);
        }
    }
    
    private static boolean lIlllIIllIlIIII(final int lllllllllllllIlIIlIllIlIlIIlIIIl, final int lllllllllllllIlIIlIllIlIlIIlIIII) {
        return lllllllllllllIlIIlIllIlIlIIlIIIl < lllllllllllllIlIIlIllIlIlIIlIIII;
    }
    
    public CommandResultStats() {
        this.field_179675_c = CommandResultStats.STRING_RESULT_TYPES;
        this.field_179673_d = CommandResultStats.STRING_RESULT_TYPES;
    }
    
    private static String lIlllIIlIllllIl(final String lllllllllllllIlIIlIllIlIlIllIIll, final String lllllllllllllIlIIlIllIlIlIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIlIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIlIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIllIlIlIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIllIlIlIllIlll.init(CommandResultStats.lIIIIlIlIIlIlI[3], lllllllllllllIlIIlIllIlIlIlllIII);
            return new String(lllllllllllllIlIIlIllIlIlIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIlIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIlIlIllIllI) {
            lllllllllllllIlIIlIllIlIlIllIllI.printStackTrace();
            return null;
        }
    }
    
    public void func_179671_a(final CommandResultStats lllllllllllllIlIIlIllIlIllIlIIIl) {
        final char lllllllllllllIlIIlIllIlIllIIlIlI;
        final Exception lllllllllllllIlIIlIllIlIllIIlIll = (Exception)((Type[])(Object)(lllllllllllllIlIIlIllIlIllIIlIlI = (char)(Object)Type.values())).length;
        char lllllllllllllIlIIlIllIlIllIIllII = (char)CommandResultStats.lIIIIlIlIIlIlI[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIIllIIlIlI(lllllllllllllIlIIlIllIlIllIIllII, (int)lllllllllllllIlIIlIllIlIllIIlIll)) {
            final Type lllllllllllllIlIIlIllIlIllIlIIII = lllllllllllllIlIIlIllIlIllIIlIlI[lllllllllllllIlIIlIllIlIllIIllII];
            func_179667_a(this, lllllllllllllIlIIlIllIlIllIlIIII, lllllllllllllIlIIlIllIlIllIlIIIl.field_179675_c[lllllllllllllIlIIlIllIlIllIlIIII.getTypeID()], lllllllllllllIlIIlIllIlIllIlIIIl.field_179673_d[lllllllllllllIlIIlIllIlIllIlIIII.getTypeID()]);
            ++lllllllllllllIlIIlIllIlIllIIllII;
        }
    }
    
    private static boolean lIlllIIllIIllII(final int lllllllllllllIlIIlIllIlIlIIIIIlI) {
        return lllllllllllllIlIIlIllIlIlIIIIIlI == 0;
    }
    
    public void readStatsFromNBT(final NBTTagCompound lllllllllllllIlIIlIllIllIIlIIIII) {
        if (lIlllIIllIIlIIl(lllllllllllllIlIIlIllIllIIlIIIII.hasKey(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[0]], CommandResultStats.lIIIIlIlIIlIlI[1]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIlIIlIllIllIIIlllll = lllllllllllllIlIIlIllIllIIlIIIII.getCompoundTag(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[2]]);
            final char lllllllllllllIlIIlIllIllIIIlIIll;
            final short lllllllllllllIlIIlIllIllIIIlIlII = (short)((Type[])(Object)(lllllllllllllIlIIlIllIllIIIlIIll = (char)(Object)Type.values())).length;
            long lllllllllllllIlIIlIllIllIIIlIlIl = CommandResultStats.lIIIIlIlIIlIlI[0];
            "".length();
            if ((0x95 ^ 0x91) == 0x0) {
                return;
            }
            while (!lIlllIIllIIlIlI((int)lllllllllllllIlIIlIllIllIIIlIlIl, lllllllllllllIlIIlIllIllIIIlIlII)) {
                final Type lllllllllllllIlIIlIllIllIIIllllI = lllllllllllllIlIIlIllIllIIIlIIll[lllllllllllllIlIIlIllIllIIIlIlIl];
                final String lllllllllllllIlIIlIllIllIIIlllIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIlIllIllIIIllllI.getTypeName())).append(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[3]]));
                final String lllllllllllllIlIIlIllIllIIIlllII = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIlIllIllIIIllllI.getTypeName())).append(CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[4]]));
                if (lIlllIIllIIlIIl(lllllllllllllIlIIlIllIllIIIlllll.hasKey(lllllllllllllIlIIlIllIllIIIlllIl, CommandResultStats.lIIIIlIlIIlIlI[5]) ? 1 : 0) && lIlllIIllIIlIIl(lllllllllllllIlIIlIllIllIIIlllll.hasKey(lllllllllllllIlIIlIllIllIIIlllII, CommandResultStats.lIIIIlIlIIlIlI[5]) ? 1 : 0)) {
                    final String lllllllllllllIlIIlIllIllIIIllIll = lllllllllllllIlIIlIllIllIIIlllll.getString(lllllllllllllIlIIlIllIllIIIlllIl);
                    final String lllllllllllllIlIIlIllIllIIIllIlI = lllllllllllllIlIIlIllIllIIIlllll.getString(lllllllllllllIlIIlIllIllIIIlllII);
                    func_179667_a(this, lllllllllllllIlIIlIllIllIIIllllI, lllllllllllllIlIIlIllIllIIIllIll, lllllllllllllIlIIlIllIllIIIllIlI);
                }
                ++lllllllllllllIlIIlIllIllIIIlIlIl;
            }
        }
    }
    
    private static boolean lIlllIIllIIlIlI(final int lllllllllllllIlIIlIllIlIlIIlIlIl, final int lllllllllllllIlIIlIllIlIlIIlIlII) {
        return lllllllllllllIlIIlIllIlIlIIlIlIl >= lllllllllllllIlIIlIllIlIlIIlIlII;
    }
    
    private static String lIlllIIlIllIlII(final String lllllllllllllIlIIlIllIlIllIIIIlI, final String lllllllllllllIlIIlIllIlIllIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIlIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIlIllIIIIIl.getBytes(StandardCharsets.UTF_8)), CommandResultStats.lIIIIlIlIIlIlI[5]), "DES");
            final Cipher lllllllllllllIlIIlIllIlIllIIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIllIlIllIIIlII.init(CommandResultStats.lIIIIlIlIIlIlI[3], lllllllllllllIlIIlIllIlIllIIIlIl);
            return new String(lllllllllllllIlIIlIllIlIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIlIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIlIllIIIIll) {
            lllllllllllllIlIIlIllIlIllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIIllIIlIIl(final int lllllllllllllIlIIlIllIlIlIIIIlII) {
        return lllllllllllllIlIIlIllIlIlIIIIlII != 0;
    }
    
    private static boolean lIlllIIllIIlIII(final Object lllllllllllllIlIIlIllIlIlIIIlIlI) {
        return lllllllllllllIlIIlIllIlIlIIIlIlI != null;
    }
    
    private static boolean lIlllIIllIIlllI(final Object lllllllllllllIlIIlIllIlIlIIIIlll, final Object lllllllllllllIlIIlIllIlIlIIIIllI) {
        return lllllllllllllIlIIlIllIlIlIIIIlll == lllllllllllllIlIIlIllIlIlIIIIllI;
    }
    
    private static String lIlllIIlIllIIll(String lllllllllllllIlIIlIllIlIlIlIIIII, final String lllllllllllllIlIIlIllIlIlIlIIlII) {
        lllllllllllllIlIIlIllIlIlIlIIIII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIllIlIlIlIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllIlIlIlIIIll = new StringBuilder();
        final char[] lllllllllllllIlIIlIllIlIlIlIIIlI = lllllllllllllIlIIlIllIlIlIlIIlII.toCharArray();
        int lllllllllllllIlIIlIllIlIlIlIIIIl = CommandResultStats.lIIIIlIlIIlIlI[0];
        final char lllllllllllllIlIIlIllIlIlIIllIll = (Object)((String)lllllllllllllIlIIlIllIlIlIlIIIII).toCharArray();
        final String lllllllllllllIlIIlIllIlIlIIllIlI = (String)lllllllllllllIlIIlIllIlIlIIllIll.length;
        boolean lllllllllllllIlIIlIllIlIlIIllIIl = CommandResultStats.lIIIIlIlIIlIlI[0] != 0;
        while (lIlllIIllIlIIII(lllllllllllllIlIIlIllIlIlIIllIIl ? 1 : 0, (int)lllllllllllllIlIIlIllIlIlIIllIlI)) {
            final char lllllllllllllIlIIlIllIlIlIlIIllI = lllllllllllllIlIIlIllIlIlIIllIll[lllllllllllllIlIIlIllIlIlIIllIIl];
            lllllllllllllIlIIlIllIlIlIlIIIll.append((char)(lllllllllllllIlIIlIllIlIlIlIIllI ^ lllllllllllllIlIIlIllIlIlIlIIIlI[lllllllllllllIlIIlIllIlIlIlIIIIl % lllllllllllllIlIIlIllIlIlIlIIIlI.length]));
            "".length();
            ++lllllllllllllIlIIlIllIlIlIlIIIIl;
            ++lllllllllllllIlIIlIllIlIlIIllIIl;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllIlIlIlIIIll);
    }
    
    private static void lIlllIIllIIIlll() {
        (lIIIIlIlIIlIlI = new int[10])[0] = ((0x46 ^ 0x48 ^ (0xC ^ 0x61)) & (180 + 52 - 92 + 85 ^ 64 + 123 - 103 + 46 ^ -" ".length()));
        CommandResultStats.lIIIIlIlIIlIlI[1] = (0x59 ^ 0x56 ^ (0x28 ^ 0x2D));
        CommandResultStats.lIIIIlIlIIlIlI[2] = " ".length();
        CommandResultStats.lIIIIlIlIIlIlI[3] = "  ".length();
        CommandResultStats.lIIIIlIlIIlIlI[4] = "   ".length();
        CommandResultStats.lIIIIlIlIIlIlI[5] = (0xB9 ^ 0xB1);
        CommandResultStats.lIIIIlIlIIlIlI[6] = (0x2E ^ 0x15 ^ (0x2C ^ 0x13));
        CommandResultStats.lIIIIlIlIIlIlI[7] = (0xBA ^ 0xBF);
        CommandResultStats.lIIIIlIlIIlIlI[8] = (0x6B ^ 0x30 ^ (0xC1 ^ 0x9C));
        CommandResultStats.lIIIIlIlIIlIlI[9] = ("  ".length() ^ (0x13 ^ 0x16));
    }
    
    private static void lIlllIIllIIIIlI() {
        (lIIIIlIlIIIlll = new String[CommandResultStats.lIIIIlIlIIlIlI[9]])[CommandResultStats.lIIIIlIlIIlIlI[0]] = lIlllIIlIllIIll("KQAhOCwECx8hLB4c", "joLUM");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[2]] = lIlllIIlIllIIll("FiouBAY7IRAdBiE2", "UECig");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[3]] = lIlllIIlIllIlII("emECvZnAPvk=", "kIVUX");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[4]] = lIlllIIlIllIlII("CG6QyPu+1sJSFNw2j78yJQ==", "nwjql");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[6]] = lIlllIIlIllIIll("Owc1Lw==", "ufXJF");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[7]] = lIlllIIlIllIIll("CxM9DzQwGCEP", "DqWjW");
        CommandResultStats.lIIIIlIlIIIlll[CommandResultStats.lIIIIlIlIIlIlI[8]] = lIlllIIlIllllIl("X6M6iC3Q4SuP2FdacqaglQ==", "HcBdE");
    }
    
    private static boolean lIlllIIllIIllIl(final Object lllllllllllllIlIIlIllIlIlIIIllIl, final Object lllllllllllllIlIIlIllIlIlIIIllII) {
        return lllllllllllllIlIIlIllIlIlIIIllIl != lllllllllllllIlIIlIllIlIlIIIllII;
    }
    
    private static void func_179669_a(final CommandResultStats lllllllllllllIlIIlIllIlIllIlllll, final Type lllllllllllllIlIIlIllIlIllIllllI) {
        if (lIlllIIllIIllIl(lllllllllllllIlIIlIllIlIllIlllll.field_179675_c, CommandResultStats.STRING_RESULT_TYPES) && lIlllIIllIIllIl(lllllllllllllIlIIlIllIlIllIlllll.field_179673_d, CommandResultStats.STRING_RESULT_TYPES)) {
            lllllllllllllIlIIlIllIlIllIlllll.field_179675_c[lllllllllllllIlIIlIllIlIllIllllI.getTypeID()] = null;
            lllllllllllllIlIIlIllIlIllIlllll.field_179673_d[lllllllllllllIlIIlIllIlIllIllllI.getTypeID()] = null;
            boolean lllllllllllllIlIIlIllIlIlllIIIIl = CommandResultStats.lIIIIlIlIIlIlI[2] != 0;
            final int lllllllllllllIlIIlIllIlIllIllIIl;
            final long lllllllllllllIlIIlIllIlIllIllIlI = ((Type[])(Object)(lllllllllllllIlIIlIllIlIllIllIIl = (int)(Object)Type.values())).length;
            long lllllllllllllIlIIlIllIlIllIllIll = CommandResultStats.lIIIIlIlIIlIlI[0];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
            while (!lIlllIIllIIlIlI((int)lllllllllllllIlIIlIllIlIllIllIll, (int)lllllllllllllIlIIlIllIlIllIllIlI)) {
                final Type lllllllllllllIlIIlIllIlIlllIIIII = lllllllllllllIlIIlIllIlIllIllIIl[lllllllllllllIlIIlIllIlIllIllIll];
                if (lIlllIIllIIlIII(lllllllllllllIlIIlIllIlIllIlllll.field_179675_c[lllllllllllllIlIIlIllIlIlllIIIII.getTypeID()]) && lIlllIIllIIlIII(lllllllllllllIlIIlIllIlIllIlllll.field_179673_d[lllllllllllllIlIIlIllIlIlllIIIII.getTypeID()])) {
                    lllllllllllllIlIIlIllIlIlllIIIIl = (CommandResultStats.lIIIIlIlIIlIlI[0] != 0);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIlIIlIllIlIllIllIll;
                }
            }
            if (lIlllIIllIIlIIl(lllllllllllllIlIIlIllIlIlllIIIIl ? 1 : 0)) {
                lllllllllllllIlIIlIllIlIllIlllll.field_179675_c = CommandResultStats.STRING_RESULT_TYPES;
                lllllllllllllIlIIlIllIlIllIlllll.field_179673_d = CommandResultStats.STRING_RESULT_TYPES;
            }
        }
    }
    
    static {
        lIlllIIllIIIlll();
        lIlllIIllIIIIlI();
        NUM_RESULT_TYPES = Type.values().length;
        STRING_RESULT_TYPES = new String[CommandResultStats.NUM_RESULT_TYPES];
    }
    
    public void func_179672_a(final ICommandSender lllllllllllllIlIIlIllIllIlIIIIll, final Type lllllllllllllIlIIlIllIllIlIIIIlI, final int lllllllllllllIlIIlIllIllIlIIIIIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/command/CommandResultStats.field_179675_c:[Ljava/lang/String;
        //     4: aload_2         /* lllllllllllllIlIIlIllIllIIllIlIl */
        //     5: invokevirtual   net/minecraft/command/CommandResultStats$Type.getTypeID:()I
        //     8: aaload         
        //     9: astore          lllllllllllllIlIIlIllIllIlIIIIII
        //    11: aload           lllllllllllllIlIIlIllIllIlIIIIII
        //    13: invokestatic    net/minecraft/command/CommandResultStats.lIlllIIllIIlIII:(Ljava/lang/Object;)Z
        //    16: ifeq            144
        //    19: new             Lnet/minecraft/command/CommandResultStats$1;
        //    22: dup            
        //    23: aload_0         /* lllllllllllllIlIIlIllIllIlIIIlII */
        //    24: aload_1         /* lllllllllllllIlIIlIllIllIIllIllI */
        //    25: invokespecial   net/minecraft/command/CommandResultStats$1.<init>:(Lnet/minecraft/command/CommandResultStats;Lnet/minecraft/command/ICommandSender;)V
        //    28: astore          lllllllllllllIlIIlIllIllIIllllll
        //    30: aload           lllllllllllllIlIIlIllIllIIllllll
        //    32: aload           lllllllllllllIlIIlIllIllIlIIIIII
        //    34: invokestatic    net/minecraft/command/CommandBase.getEntityName:(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/lang/String;
        //    37: astore          lllllllllllllIlIIlIllIllIIlllllI
        //    39: ldc             ""
        //    41: invokevirtual   java/lang/String.length:()I
        //    44: pop            
        //    45: ldc_w           " "
        //    48: invokevirtual   java/lang/String.length:()I
        //    51: ineg           
        //    52: ldc_w           "  "
        //    55: invokevirtual   java/lang/String.length:()I
        //    58: if_icmpne       65
        //    61: return         
        //    62: astore          lllllllllllllIlIIlIllIllIIllllII
        //    64: return         
        //    65: aload_0         /* lllllllllllllIlIIlIllIllIlIIIlII */
        //    66: getfield        net/minecraft/command/CommandResultStats.field_179673_d:[Ljava/lang/String;
        //    69: aload_2         /* lllllllllllllIlIIlIllIllIIllIlIl */
        //    70: invokevirtual   net/minecraft/command/CommandResultStats$Type.getTypeID:()I
        //    73: aaload         
        //    74: astore          lllllllllllllIlIIlIllIllIIlllIll
        //    76: aload           lllllllllllllIlIIlIllIllIIlllIll
        //    78: invokestatic    net/minecraft/command/CommandResultStats.lIlllIIllIIlIII:(Ljava/lang/Object;)Z
        //    81: ifeq            144
        //    84: aload_1         /* lllllllllllllIlIIlIllIllIIllIllI */
        //    85: invokeinterface net/minecraft/command/ICommandSender.getEntityWorld:()Lnet/minecraft/world/World;
        //    90: invokevirtual   net/minecraft/world/World.getScoreboard:()Lnet/minecraft/scoreboard/Scoreboard;
        //    93: astore          lllllllllllllIlIIlIllIllIIlllIlI
        //    95: aload           lllllllllllllIlIIlIllIllIIlllIlI
        //    97: aload           lllllllllllllIlIIlIllIllIIlllIll
        //    99: invokevirtual   net/minecraft/scoreboard/Scoreboard.getObjective:(Ljava/lang/String;)Lnet/minecraft/scoreboard/ScoreObjective;
        //   102: astore          lllllllllllllIlIIlIllIllIIlllIIl
        //   104: aload           lllllllllllllIlIIlIllIllIIlllIIl
        //   106: invokestatic    net/minecraft/command/CommandResultStats.lIlllIIllIIlIII:(Ljava/lang/Object;)Z
        //   109: ifeq            144
        //   112: aload           lllllllllllllIlIIlIllIllIIlllIlI
        //   114: aload           lllllllllllllIlIIlIllIllIIllllIl
        //   116: aload           lllllllllllllIlIIlIllIllIIlllIIl
        //   118: invokevirtual   net/minecraft/scoreboard/Scoreboard.entityHasObjective:(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)Z
        //   121: invokestatic    net/minecraft/command/CommandResultStats.lIlllIIllIIlIIl:(I)Z
        //   124: ifeq            144
        //   127: aload           lllllllllllllIlIIlIllIllIIlllIlI
        //   129: aload           lllllllllllllIlIIlIllIllIIllllIl
        //   131: aload           lllllllllllllIlIIlIllIllIIlllIIl
        //   133: invokevirtual   net/minecraft/scoreboard/Scoreboard.getValueFromObjective:(Ljava/lang/String;Lnet/minecraft/scoreboard/ScoreObjective;)Lnet/minecraft/scoreboard/Score;
        //   136: astore          lllllllllllllIlIIlIllIllIIlllIII
        //   138: aload           lllllllllllllIlIIlIllIllIIlllIII
        //   140: iload_3         /* lllllllllllllIlIIlIllIllIIllIlII */
        //   141: invokevirtual   net/minecraft/scoreboard/Score.setScorePoints:(I)V
        //   144: return         
        //    StackMapTable: 00 03 FF 00 3E 00 06 07 00 02 07 01 84 07 00 06 01 07 00 24 07 00 09 00 01 07 01 79 FC 00 02 07 00 24 F9 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                           
        //  -----  -----  -----  -----  -----------------------------------------------
        //  30     39     62     65     Lnet/minecraft/command/EntityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void func_179667_a(final CommandResultStats lllllllllllllIlIIlIllIlIllllIIlI, final Type lllllllllllllIlIIlIllIlIllllIIIl, final String lllllllllllllIlIIlIllIlIlllIllII, final String lllllllllllllIlIIlIllIlIlllIlIll) {
        if (lIlllIIllIIlIII(lllllllllllllIlIIlIllIlIlllIllII) && lIlllIIllIIlIIl(lllllllllllllIlIIlIllIlIlllIllII.length()) && lIlllIIllIIlIII(lllllllllllllIlIIlIllIlIlllIlIll) && lIlllIIllIIlIIl(lllllllllllllIlIIlIllIlIlllIlIll.length())) {
            if (!lIlllIIllIIllIl(lllllllllllllIlIIlIllIlIllllIIlI.field_179675_c, CommandResultStats.STRING_RESULT_TYPES) || lIlllIIllIIlllI(lllllllllllllIlIIlIllIlIllllIIlI.field_179673_d, CommandResultStats.STRING_RESULT_TYPES)) {
                lllllllllllllIlIIlIllIlIllllIIlI.field_179675_c = new String[CommandResultStats.NUM_RESULT_TYPES];
                lllllllllllllIlIIlIllIlIllllIIlI.field_179673_d = new String[CommandResultStats.NUM_RESULT_TYPES];
            }
            lllllllllllllIlIIlIllIlIllllIIlI.field_179675_c[lllllllllllllIlIIlIllIlIllllIIIl.getTypeID()] = lllllllllllllIlIIlIllIlIlllIllII;
            lllllllllllllIlIIlIllIlIllllIIlI.field_179673_d[lllllllllllllIlIIlIllIlIllllIIIl.getTypeID()] = lllllllllllllIlIIlIllIlIlllIlIll;
            "".length();
            if (((0x37 ^ 0x46 ^ (0x4E ^ 0x3B)) & (0xEC ^ 0x8C ^ (0x45 ^ 0x21) ^ -" ".length())) > (167 + 87 - 238 + 177 ^ 60 + 140 - 76 + 73)) {
                return;
            }
        }
        else {
            func_179669_a(lllllllllllllIlIIlIllIlIllllIIlI, lllllllllllllIlIIlIllIlIllllIIIl);
        }
    }
    
    public enum Type
    {
        SUCCESS_COUNT(Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[0]], Type.lIlIIIIllIllll[0], Type.lIlIIIIllIllll[0], Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[1]]), 
        AFFECTED_BLOCKS(Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[2]], Type.lIlIIIIllIllll[1], Type.lIlIIIIllIllll[1], Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[3]]), 
        AFFECTED_ENTITIES(Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[4]], Type.lIlIIIIllIllll[2], Type.lIlIIIIllIllll[2], Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[5]]);
        
        private static final /* synthetic */ String[] lIlIIIIIIllIlI;
        final /* synthetic */ int typeID;
        final /* synthetic */ String typeName;
        private static final /* synthetic */ int[] lIlIIIIllIllll;
        
        AFFECTED_ITEMS(Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[6]], Type.lIlIIIIllIllll[3], Type.lIlIIIIllIllll[3], Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[7]]), 
        QUERY_RESULT(Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[8]], Type.lIlIIIIllIllll[4], Type.lIlIIIIllIllll[4], Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[9]]);
        
        private static String lllIIIIIIIlIIlI(final String lllllllllllllIIlIIIIIIllllIIllIl, final String lllllllllllllIIlIIIIIIllllIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIIIllllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIIIIllllIIllll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIIIIllllIIllll.init(Type.lIlIIIIllIllll[2], lllllllllllllIIlIIIIIIllllIlIIII);
                return new String(lllllllllllllIIlIIIIIIllllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIIIllllIIlllI) {
                lllllllllllllIIlIIIIIIllllIIlllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lllIIIIlllllIll();
            lllIIIIIIIlIIll();
            final Type[] enum$VALUES = new Type[Type.lIlIIIIllIllll[5]];
            enum$VALUES[Type.lIlIIIIllIllll[0]] = Type.SUCCESS_COUNT;
            enum$VALUES[Type.lIlIIIIllIllll[1]] = Type.AFFECTED_BLOCKS;
            enum$VALUES[Type.lIlIIIIllIllll[2]] = Type.AFFECTED_ENTITIES;
            enum$VALUES[Type.lIlIIIIllIllll[3]] = Type.AFFECTED_ITEMS;
            enum$VALUES[Type.lIlIIIIllIllll[4]] = Type.QUERY_RESULT;
            ENUM$VALUES = enum$VALUES;
        }
        
        public String getTypeName() {
            return this.typeName;
        }
        
        private static void lllIIIIlllllIll() {
            (lIlIIIIllIllll = new int[11])[0] = ((0x95 ^ 0xAF) & ~(0xA ^ 0x30));
            Type.lIlIIIIllIllll[1] = " ".length();
            Type.lIlIIIIllIllll[2] = "  ".length();
            Type.lIlIIIIllIllll[3] = "   ".length();
            Type.lIlIIIIllIllll[4] = (0x25 ^ 0x68 ^ (0xEC ^ 0xA5));
            Type.lIlIIIIllIllll[5] = (0x84 ^ 0xBE ^ (0xB4 ^ 0x8B));
            Type.lIlIIIIllIllll[6] = (0x9D ^ 0x9B);
            Type.lIlIIIIllIllll[7] = (45 + 120 - 125 + 102 ^ 79 + 107 - 127 + 78);
            Type.lIlIIIIllIllll[8] = (0xC9 ^ 0xC1);
            Type.lIlIIIIllIllll[9] = (0x2B ^ 0x22);
            Type.lIlIIIIllIllll[10] = (0xB5 ^ 0xBF);
        }
        
        public static String[] getTypeNames() {
            final String[] lllllllllllllIIlIIIIIIllllllIIIl = new String[values().length];
            int lllllllllllllIIlIIIIIIllllllIIII = Type.lIlIIIIllIllll[0];
            final boolean lllllllllllllIIlIIIIIIlllllIlIIl;
            final double lllllllllllllIIlIIIIIIlllllIlIlI = ((Type[])(Object)(lllllllllllllIIlIIIIIIlllllIlIIl = (boolean)(Object)values())).length;
            double lllllllllllllIIlIIIIIIlllllIlIll = Type.lIlIIIIllIllll[0];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
            while (!lllIIIIllllllII((int)lllllllllllllIIlIIIIIIlllllIlIll, (int)lllllllllllllIIlIIIIIIlllllIlIlI)) {
                final Type lllllllllllllIIlIIIIIIlllllIllll = lllllllllllllIIlIIIIIIlllllIlIIl[lllllllllllllIIlIIIIIIlllllIlIll];
                lllllllllllllIIlIIIIIIllllllIIIl[lllllllllllllIIlIIIIIIllllllIIII++] = lllllllllllllIIlIIIIIIlllllIllll.getTypeName();
                ++lllllllllllllIIlIIIIIIlllllIlIll;
            }
            return lllllllllllllIIlIIIIIIllllllIIIl;
        }
        
        private Type(final String lllllllllllllIIlIIIIIlIIIIIIIIIl, final int lllllllllllllIIlIIIIIlIIIIIIIIII, final int lllllllllllllIIlIIIIIlIIIIIIIlII, final String lllllllllllllIIlIIIIIIlllllllllI) {
            this.typeID = lllllllllllllIIlIIIIIlIIIIIIIlII;
            this.typeName = lllllllllllllIIlIIIIIIlllllllllI;
        }
        
        public static Type getTypeByName(final String lllllllllllllIIlIIIIIIlllllIIIll) {
            final String lllllllllllllIIlIIIIIIllllIlllIl;
            final short lllllllllllllIIlIIIIIIllllIllllI = (short)((Type[])(Object)(lllllllllllllIIlIIIIIIllllIlllIl = (String)(Object)values())).length;
            Exception lllllllllllllIIlIIIIIIllllIlllll = (Exception)Type.lIlIIIIllIllll[0];
            "".length();
            if (((0x49 ^ 0x72 ^ (0x70 ^ 0x74)) & (0x42 ^ 0x2 ^ 92 + 105 - 173 + 103 ^ -" ".length())) != ((0x15 ^ 0x1C ^ (0x59 ^ 0x6C)) & (42 + 85 - 119 + 164 ^ 33 + 48 + 16 + 47 ^ -" ".length()))) {
                return null;
            }
            while (!lllIIIIllllllII((int)lllllllllllllIIlIIIIIIllllIlllll, lllllllllllllIIlIIIIIIllllIllllI)) {
                final Type lllllllllllllIIlIIIIIIlllllIIIlI = lllllllllllllIIlIIIIIIllllIlllIl[lllllllllllllIIlIIIIIIllllIlllll];
                if (lllIIIIllllllIl(lllllllllllllIIlIIIIIIlllllIIIlI.getTypeName().equals(lllllllllllllIIlIIIIIIlllllIIIll) ? 1 : 0)) {
                    return lllllllllllllIIlIIIIIIlllllIIIlI;
                }
                ++lllllllllllllIIlIIIIIIllllIlllll;
            }
            return null;
        }
        
        private static boolean lllIIIIlllllllI(final int lllllllllllllIIlIIIIIIlllIIlllII, final int lllllllllllllIIlIIIIIIlllIIllIll) {
            return lllllllllllllIIlIIIIIIlllIIlllII < lllllllllllllIIlIIIIIIlllIIllIll;
        }
        
        private static void lllIIIIIIIlIIll() {
            (lIlIIIIIIllIlI = new String[Type.lIlIIIIllIllll[10]])[Type.lIlIIIIllIllll[0]] = lllIIIIIIIlIIII("PDkpEAE8PzUQCzoiPg==", "oljSD");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[1]] = lllIIIIIIIlIIIl("BqCG3F/66dlLbNlX8dYJ7w==", "AmBYM");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[2]] = lllIIIIIIIlIIlI("u/I3Z3MQwKqV8HVHdLzCxQ==", "aTgrv");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[3]] = lllIIIIIIIlIIII("BBwnEyExHyU0LioZKgU=", "EzAvB");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[4]] = lllIIIIIIIlIIlI("BuM71S8d89m60CLJZtXimYbsljzkxAZg", "dPPcv");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[5]] = lllIIIIIIIlIIII("Cwo2ECs+CTQwJj4FJBwtOQ==", "JlPuH");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[6]] = lllIIIIIIIlIIlI("z0Nt3CoD40mtN4051dquAg==", "ODhmA");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[7]] = lllIIIIIIIlIIlI("pblOF8W3kdksR6ASv4Sv8g==", "NCXAl");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[8]] = lllIIIIIIIlIIlI("gEAcPJTrLIEGp0nMf8TSuA==", "AevHq");
            Type.lIlIIIIIIllIlI[Type.lIlIIIIllIllll[9]] = lllIIIIIIIlIIII("FDsOHAgXKxgbHTE=", "ENknq");
        }
        
        private static boolean lllIIIIllllllIl(final int lllllllllllllIIlIIIIIIlllIIllIIl) {
            return lllllllllllllIIlIIIIIIlllIIllIIl != 0;
        }
        
        private static String lllIIIIIIIlIIII(String lllllllllllllIIlIIIIIIlllIlIlIll, final String lllllllllllllIIlIIIIIIlllIlIlIlI) {
            lllllllllllllIIlIIIIIIlllIlIlIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIIIIlllIlIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIIIlllIlIlllI = new StringBuilder();
            final char[] lllllllllllllIIlIIIIIIlllIlIllIl = lllllllllllllIIlIIIIIIlllIlIlIlI.toCharArray();
            int lllllllllllllIIlIIIIIIlllIlIllII = Type.lIlIIIIllIllll[0];
            final int lllllllllllllIIlIIIIIIlllIlIIllI = (Object)((String)lllllllllllllIIlIIIIIIlllIlIlIll).toCharArray();
            final int lllllllllllllIIlIIIIIIlllIlIIlIl = lllllllllllllIIlIIIIIIlllIlIIllI.length;
            long lllllllllllllIIlIIIIIIlllIlIIlII = Type.lIlIIIIllIllll[0];
            while (lllIIIIlllllllI((int)lllllllllllllIIlIIIIIIlllIlIIlII, lllllllllllllIIlIIIIIIlllIlIIlIl)) {
                final char lllllllllllllIIlIIIIIIlllIllIIIl = lllllllllllllIIlIIIIIIlllIlIIllI[lllllllllllllIIlIIIIIIlllIlIIlII];
                lllllllllllllIIlIIIIIIlllIlIlllI.append((char)(lllllllllllllIIlIIIIIIlllIllIIIl ^ lllllllllllllIIlIIIIIIlllIlIllIl[lllllllllllllIIlIIIIIIlllIlIllII % lllllllllllllIIlIIIIIIlllIlIllIl.length]));
                "".length();
                ++lllllllllllllIIlIIIIIIlllIlIllII;
                ++lllllllllllllIIlIIIIIIlllIlIIlII;
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIIIlllIlIlllI);
        }
        
        public int getTypeID() {
            return this.typeID;
        }
        
        private static String lllIIIIIIIlIIIl(final String lllllllllllllIIlIIIIIIllllIIIIII, final String lllllllllllllIIlIIIIIIlllIllllIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIIIllllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIlllIllllIl.getBytes(StandardCharsets.UTF_8)), Type.lIlIIIIllIllll[8]), "DES");
                final Cipher lllllllllllllIIlIIIIIIllllIIIIlI = Cipher.getInstance("DES");
                lllllllllllllIIlIIIIIIllllIIIIlI.init(Type.lIlIIIIllIllll[2], lllllllllllllIIlIIIIIIllllIIIIll);
                return new String(lllllllllllllIIlIIIIIIllllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIIIllllIIIIIl) {
                lllllllllllllIIlIIIIIIllllIIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIIIIllllllII(final int lllllllllllllIIlIIIIIIlllIlIIIII, final int lllllllllllllIIlIIIIIIlllIIlllll) {
            return lllllllllllllIIlIIIIIIlllIlIIIII >= lllllllllllllIIlIIIIIIlllIIlllll;
        }
    }
}
