// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.nbt.NBTTagIntArray;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.util.StatCollector;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ItemFireworkCharge extends Item
{
    private static final /* synthetic */ int[] llIllIIlIIllll;
    private static final /* synthetic */ String[] llIllIIlIIIlIl;
    
    private static boolean lIIlIllIlllIlIIl(final int llllllllllllIllIIllllIllIlIlIIll, final int llllllllllllIllIIllllIllIlIlIIlI) {
        return llllllllllllIllIIllllIllIlIlIIll == llllllllllllIllIIllllIllIlIlIIlI;
    }
    
    private static String lIIlIllIllIIIIII(String llllllllllllIllIIllllIllIllIlIll, final String llllllllllllIllIIllllIllIllIlIlI) {
        llllllllllllIllIIllllIllIllIlIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllllIllIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllIllIllIlllI = new StringBuilder();
        final char[] llllllllllllIllIIllllIllIllIllIl = llllllllllllIllIIllllIllIllIlIlI.toCharArray();
        int llllllllllllIllIIllllIllIllIllII = ItemFireworkCharge.llIllIIlIIllll[1];
        final short llllllllllllIllIIllllIllIllIIllI = (Object)((String)llllllllllllIllIIllllIllIllIlIll).toCharArray();
        final boolean llllllllllllIllIIllllIllIllIIlIl = llllllllllllIllIIllllIllIllIIllI.length != 0;
        short llllllllllllIllIIllllIllIllIIlII = (short)ItemFireworkCharge.llIllIIlIIllll[1];
        while (lIIlIllIllllIIII(llllllllllllIllIIllllIllIllIIlII, llllllllllllIllIIllllIllIllIIlIl ? 1 : 0)) {
            final char llllllllllllIllIIllllIllIlllIIIl = llllllllllllIllIIllllIllIllIIllI[llllllllllllIllIIllllIllIllIIlII];
            llllllllllllIllIIllllIllIllIlllI.append((char)(llllllllllllIllIIllllIllIlllIIIl ^ llllllllllllIllIIllllIllIllIllIl[llllllllllllIllIIllllIllIllIllII % llllllllllllIllIIllllIllIllIllIl.length]));
            "".length();
            ++llllllllllllIllIIllllIllIllIllII;
            ++llllllllllllIllIIllllIllIllIIlII;
            "".length();
            if (" ".length() >= (0x1A ^ 0x1E)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllIllIllIlllI);
    }
    
    private static boolean lIIlIllIlllIllII(final Object llllllllllllIllIIllllIllIlIIIlII) {
        return llllllllllllIllIIllllIllIlIIIlII != null;
    }
    
    static {
        lIIlIllIlllIIllI();
        lIIlIllIllIIIlIl();
    }
    
    private static boolean lIIlIllIlllIllll(final int llllllllllllIllIIllllIllIIllllII) {
        return llllllllllllIllIIllllIllIIllllII > 0;
    }
    
    private static boolean lIIlIllIlllIlIll(final int llllllllllllIllIIllllIllIlIIIIlI) {
        return llllllllllllIllIIllllIllIlIIIIlI != 0;
    }
    
    private static void lIIlIllIlllIIllI() {
        (llIllIIlIIllll = new int[26])[0] = " ".length();
        ItemFireworkCharge.llIllIIlIIllll[1] = ((109 + 16 + 38 + 85 ^ 128 + 24 - 7 + 47) & (35 + 81 + 54 + 2 ^ 47 + 70 + 17 + 14 ^ -" ".length()));
        ItemFireworkCharge.llIllIIlIIllll[2] = (-(0xFFFFB3FB & 0x7D05) & (0xFFFFFBEF & 0x8ABF9A));
        ItemFireworkCharge.llIllIIlIIllll[3] = (0xFFFFC7A0 & 0xFF385F);
        ItemFireworkCharge.llIllIIlIIllll[4] = (0x41 ^ 0x6B ^ (0xA6 ^ 0x9C));
        ItemFireworkCharge.llIllIIlIIllll[5] = (0xFFFFFF7A & 0xFF85);
        ItemFireworkCharge.llIllIIlIIllll[6] = (0x1F ^ 0xB ^ (0x7E ^ 0x62));
        ItemFireworkCharge.llIllIIlIIllll[7] = 210 + 146 - 332 + 231;
        ItemFireworkCharge.llIllIIlIIllll[8] = "  ".length();
        ItemFireworkCharge.llIllIIlIIllll[9] = "   ".length();
        ItemFireworkCharge.llIllIIlIIllll[10] = (0x19 ^ 0x1D);
        ItemFireworkCharge.llIllIIlIIllll[11] = (0xC7 ^ 0xC2);
        ItemFireworkCharge.llIllIIlIIllll[12] = (0x16 ^ 0x72 ^ (0x13 ^ 0x71));
        ItemFireworkCharge.llIllIIlIIllll[13] = (67 + 64 - 80 + 117 ^ 113 + 173 - 231 + 120);
        ItemFireworkCharge.llIllIIlIIllll[14] = (0xA ^ 0x3);
        ItemFireworkCharge.llIllIIlIIllll[15] = (0x17 ^ 0x1D);
        ItemFireworkCharge.llIllIIlIIllll[16] = ("  ".length() ^ (0x77 ^ 0x7E));
        ItemFireworkCharge.llIllIIlIIllll[17] = (0x3D ^ 0x31);
        ItemFireworkCharge.llIllIIlIIllll[18] = (0x26 ^ 0x2B);
        ItemFireworkCharge.llIllIIlIIllll[19] = (0x17 ^ 0x19);
        ItemFireworkCharge.llIllIIlIIllll[20] = (120 + 6 - 61 + 74 ^ 54 + 47 - 17 + 48);
        ItemFireworkCharge.llIllIIlIIllll[21] = (0xB6 ^ 0xA7);
        ItemFireworkCharge.llIllIIlIIllll[22] = (0x44 ^ 0x49 ^ (0xA4 ^ 0xBB));
        ItemFireworkCharge.llIllIIlIIllll[23] = (0x7A ^ 0x62 ^ (0x37 ^ 0x3C));
        ItemFireworkCharge.llIllIIlIIllll[24] = (0x44 ^ 0x50);
        ItemFireworkCharge.llIllIIlIIllll[25] = (0x3A ^ 0x6E ^ (0x3 ^ 0x42));
    }
    
    private static boolean lIIlIllIlllIlllI(final int llllllllllllIllIIllllIllIlIIIlll, final int llllllllllllIllIIllllIllIlIIIllI) {
        return llllllllllllIllIIllllIllIlIIIlll <= llllllllllllIllIIllllIllIlIIIllI;
    }
    
    private static boolean lIIlIllIlllIlIII(final int llllllllllllIllIIllllIllIlIIIIII) {
        return llllllllllllIllIIllllIllIlIIIIII == 0;
    }
    
    private static boolean lIIlIllIlllIlIlI(final int llllllllllllIllIIllllIllIlIIllll, final int llllllllllllIllIIllllIllIlIIlllI) {
        return llllllllllllIllIIllllIllIlIIllll >= llllllllllllIllIIllllIllIlIIlllI;
    }
    
    @Override
    public void addInformation(final ItemStack llllllllllllIllIIllllIlllIlllIlI, final EntityPlayer llllllllllllIllIIllllIlllIlllIIl, final List<String> llllllllllllIllIIllllIlllIlllIII, final boolean llllllllllllIllIIllllIlllIllIlll) {
        if (lIIlIllIlllIlIll(llllllllllllIllIIllllIlllIlllIlI.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllIIllllIlllIllIllI = llllllllllllIllIIllllIlllIlllIlI.getTagCompound().getCompoundTag(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[8]]);
            if (lIIlIllIlllIllII(llllllllllllIllIIllllIlllIllIllI)) {
                addExplosionInfo(llllllllllllIllIIllllIlllIllIllI, llllllllllllIllIIllllIlllIlllIII);
            }
        }
    }
    
    public static NBTBase getExplosionTag(final ItemStack llllllllllllIllIIllllIllllIIIlII, final String llllllllllllIllIIllllIllllIIIIII) {
        if (lIIlIllIlllIlIll(llllllllllllIllIIllllIllllIIIlII.hasTagCompound() ? 1 : 0)) {
            final NBTTagCompound llllllllllllIllIIllllIllllIIIIlI = llllllllllllIllIIllllIllllIIIlII.getTagCompound().getCompoundTag(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[0]]);
            if (lIIlIllIlllIllII(llllllllllllIllIIllllIllllIIIIlI)) {
                return llllllllllllIllIIllllIllllIIIIlI.getTag(llllllllllllIllIIllllIllllIIIIII);
            }
        }
        return null;
    }
    
    private static void lIIlIllIllIIIlIl() {
        (llIllIIlIIIlIl = new String[ItemFireworkCharge.llIllIIlIIllll[25]])[ItemFireworkCharge.llIllIIlIIllll[1]] = lIIlIllIlIlllllI("nbqFs7iohic=", "ECnpC");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[0]] = lIIlIllIlIlllllI("ymuoGlOULGXxv9zDB+t2Kg==", "qJNZu");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[8]] = lIIlIllIlIllllll("kFFc3Chx0LEqPwJYCUmjUA==", "OgIwY");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[9]] = lIIlIllIlIlllllI("lwjnen0zWKI=", "eSGbb");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[10]] = lIIlIllIlIllllll("ZWI2Tz8ywR70Mo8QWDXH9YZlm42E43guXZH9vjcY9hs=", "sqVFq");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[11]] = lIIlIllIllIIIIII("ChYvAGMFCzgIOgwQIR4OCwM4CihNFjMdKA==", "cbJmM");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[12]] = lIIlIllIlIllllll("CALkoHjVjUQ=", "WzjOc");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[13]] = lIIlIllIlIlllllI("8Tb/ol/89LI=", "raIQW");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[6]] = lIIlIllIllIIIIII("QUY=", "mfVqN");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[14]] = lIIlIllIllIIIIII("ORopBmQ2Bz4OPT8cJxgJOA8+DC9+", "PnLkJ");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[15]] = lIIlIllIllIIIIII("BhcWBHgJCgEMIQARGBoVBwIBDjNBAAYaIgAOMAY6ABE=", "ocsiV");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[16]] = lIIlIllIlIlllllI("cOsgkMWpIgvG7PTnsTxuhw==", "uUeJn");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[17]] = lIIlIllIllIIIIII("ExESCEscDAUAEhUXHBYmEgQFAgBUAxYBAC4K", "zewee");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[18]] = lIIlIllIlIllllll("wt7mPAAMyfg=", "JdqHu");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[19]] = lIIlIllIllIIIIII("Zk8=", "JoScY");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[20]] = lIIlIllIlIlllllI("trEq8uEA3mkFD3CWMUMOutWj0nFR3/9I", "qISif");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[4]] = lIIlIllIlIllllll("oN7mJKsnwfgkvRsNRI/S5stIWoCYPK/O/4Am9izxfA0OZ64A99HHqA==", "wwHyV");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[21]] = lIIlIllIlIlllllI("PR0pf+9hdd0=", "ipilH");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[22]] = lIIlIllIlIllllll("DTov9LonfpihLb0xjmp/t1j49/UYoCakPh6wX0zHhIU=", "ylNGO");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[23]] = lIIlIllIllIIIIII("LAgzLQgPFg==", "jdZNc");
        ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[24]] = lIIlIllIllIIIIII("EwwxPGUcESY0PBUKPyIIEhkmNi5UHjg4KBEdJg==", "zxTQK");
    }
    
    private static boolean lIIlIllIlllIllIl(final int llllllllllllIllIIllllIllIIlllllI) {
        return llllllllllllIllIIllllIllIIlllllI >= 0;
    }
    
    private static boolean lIIlIllIllllIIII(final int llllllllllllIllIIllllIllIlIIlIll, final int llllllllllllIllIIllllIllIlIIlIlI) {
        return llllllllllllIllIIllllIllIlIIlIll < llllllllllllIllIIllllIllIlIIlIlI;
    }
    
    private static boolean lIIlIllIlllIIlll(final int llllllllllllIllIIllllIllIIlllIIl, final int llllllllllllIllIIllllIllIIlllIII) {
        return llllllllllllIllIIllllIllIIlllIIl != llllllllllllIllIIllllIllIIlllIII;
    }
    
    public static void addExplosionInfo(final NBTTagCompound llllllllllllIllIIllllIlllIIlIlII, final List<String> llllllllllllIllIIllllIlllIlIIlII) {
        final byte llllllllllllIllIIllllIlllIlIIIll = llllllllllllIllIIllllIlllIIlIlII.getByte(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[9]]);
        if (lIIlIllIlllIllIl(llllllllllllIllIIllllIlllIlIIIll) && lIIlIllIlllIlllI(llllllllllllIllIIllllIlllIlIIIll, ItemFireworkCharge.llIllIIlIIllll[10])) {
            llllllllllllIllIIllllIlllIlIIlII.add(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[10]]).append(llllllllllllIllIIllllIlllIlIIIll))).trim());
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllIIllllIlllIlIIlII.add(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[11]]).trim());
            "".length();
        }
        final int[] llllllllllllIllIIllllIlllIlIIIlI = llllllllllllIllIIllllIlllIIlIlII.getIntArray(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[12]]);
        if (lIIlIllIlllIllll(llllllllllllIllIIllllIlllIlIIIlI.length)) {
            boolean llllllllllllIllIIllllIlllIlIIIIl = ItemFireworkCharge.llIllIIlIIllll[0] != 0;
            String llllllllllllIllIIllllIlllIlIIIII = ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[13]];
            final String llllllllllllIllIIllllIlllIIIlIll;
            final Exception llllllllllllIllIIllllIlllIIIllII = (Exception)((int[])(Object)(llllllllllllIllIIllllIlllIIIlIll = (String)(Object)llllllllllllIllIIllllIlllIlIIIlI)).length;
            int llllllllllllIllIIllllIllIlIIllll = ItemFireworkCharge.llIllIIlIIllll[1];
            "".length();
            if (" ".length() < 0) {
                return;
            }
            while (!lIIlIllIlllIlIlI(llllllllllllIllIIllllIllIlIIllll, (int)llllllllllllIllIIllllIlllIIIllII)) {
                final int llllllllllllIllIIllllIlllIIlllll = llllllllllllIllIIllllIlllIIIlIll[llllllllllllIllIIllllIllIlIIllll];
                if (lIIlIllIlllIlIII(llllllllllllIllIIllllIlllIlIIIIl ? 1 : 0)) {
                    llllllllllllIllIIllllIlllIlIIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIlIIIII)).append(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[6]]));
                }
                llllllllllllIllIIllllIlllIlIIIIl = (ItemFireworkCharge.llIllIIlIIllll[1] != 0);
                boolean llllllllllllIllIIllllIlllIIllllI = ItemFireworkCharge.llIllIIlIIllll[1] != 0;
                int llllllllllllIllIIllllIlllIIlllIl = ItemFireworkCharge.llIllIIlIIllll[1];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIIlIllIlllIlIlI(llllllllllllIllIIllllIlllIIlllIl, ItemDye.dyeColors.length)) {
                    if (lIIlIllIlllIlIIl(llllllllllllIllIIllllIlllIIlllll, ItemDye.dyeColors[llllllllllllIllIIllllIlllIIlllIl])) {
                        llllllllllllIllIIllllIlllIIllllI = (ItemFireworkCharge.llIllIIlIIllll[0] != 0);
                        llllllllllllIllIIllllIlllIlIIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIlIIIII)).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[14]]).append(EnumDyeColor.byDyeDamage(llllllllllllIllIIllllIlllIIlllIl).getUnlocalizedName())))));
                        "".length();
                        if ("  ".length() == ((0x1C ^ 0x35 ^ (0x36 ^ 0x33)) & (11 + 100 - 36 + 66 ^ 80 + 110 - 45 + 16 ^ -" ".length()))) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIIllllIlllIIlllIl;
                    }
                }
                if (lIIlIllIlllIlIII(llllllllllllIllIIllllIlllIIllllI ? 1 : 0)) {
                    llllllllllllIllIIllllIlllIlIIIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIlIIIII)).append(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[15]])));
                }
                ++llllllllllllIllIIllllIllIlIIllll;
            }
            llllllllllllIllIIllllIlllIlIIlII.add(llllllllllllIllIIllllIlllIlIIIII);
            "".length();
        }
        final int[] llllllllllllIllIIllllIlllIIlllII = llllllllllllIllIIllllIlllIIlIlII.getIntArray(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[16]]);
        if (lIIlIllIlllIllll(llllllllllllIllIIllllIlllIIlllII.length)) {
            boolean llllllllllllIllIIllllIlllIIllIll = ItemFireworkCharge.llIllIIlIIllll[0] != 0;
            String llllllllllllIllIIllllIlllIIllIlI = String.valueOf(new StringBuilder(String.valueOf(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[17]]))).append(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[18]]));
            final int[] array;
            final String llllllllllllIllIIllllIlllIIIlIll = (String)(array = llllllllllllIllIIllllIlllIIlllII).length;
            Exception llllllllllllIllIIllllIlllIIIllII = (Exception)ItemFireworkCharge.llIllIIlIIllll[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIllIlllIlIlI((int)llllllllllllIllIIllllIlllIIIllII, (int)llllllllllllIllIIllllIlllIIIlIll)) {
                final int llllllllllllIllIIllllIlllIIllIIl = array[llllllllllllIllIIllllIlllIIIllII];
                if (lIIlIllIlllIlIII(llllllllllllIllIIllllIlllIIllIll ? 1 : 0)) {
                    llllllllllllIllIIllllIlllIIllIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIIllIlI)).append(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[19]]));
                }
                llllllllllllIllIIllllIlllIIllIll = (ItemFireworkCharge.llIllIIlIIllll[1] != 0);
                boolean llllllllllllIllIIllllIlllIIllIII = ItemFireworkCharge.llIllIIlIIllll[1] != 0;
                int llllllllllllIllIIllllIlllIIlIlll = ItemFireworkCharge.llIllIIlIIllll[1];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!lIIlIllIlllIlIlI(llllllllllllIllIIllllIlllIIlIlll, ItemFireworkCharge.llIllIIlIIllll[4])) {
                    if (lIIlIllIlllIlIIl(llllllllllllIllIIllllIlllIIllIIl, ItemDye.dyeColors[llllllllllllIllIIllllIlllIIlIlll])) {
                        llllllllllllIllIIllllIlllIIllIII = (ItemFireworkCharge.llIllIIlIIllll[0] != 0);
                        llllllllllllIllIIllllIlllIIllIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIIllIlI)).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[20]]).append(EnumDyeColor.byDyeDamage(llllllllllllIllIIllllIlllIIlIlll).getUnlocalizedName())))));
                        "".length();
                        if (" ".length() == 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIIllllIlllIIlIlll;
                    }
                }
                if (lIIlIllIlllIlIII(llllllllllllIllIIllllIlllIIllIII ? 1 : 0)) {
                    llllllllllllIllIIllllIlllIIllIlI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIllllIlllIIllIlI)).append(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[4]])));
                }
                ++llllllllllllIllIIllllIlllIIIllII;
            }
            llllllllllllIllIIllllIlllIlIIlII.add(llllllllllllIllIIllllIlllIIllIlI);
            "".length();
        }
        final boolean llllllllllllIllIIllllIlllIIlIllI = llllllllllllIllIIllllIlllIIlIlII.getBoolean(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[21]]);
        if (lIIlIllIlllIlIll(llllllllllllIllIIllllIlllIIlIllI ? 1 : 0)) {
            llllllllllllIllIIllllIlllIlIIlII.add(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[22]]));
            "".length();
        }
        final boolean llllllllllllIllIIllllIlllIIlIlIl = llllllllllllIllIIllllIlllIIlIlII.getBoolean(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[23]]);
        if (lIIlIllIlllIlIll(llllllllllllIllIIllllIlllIIlIlIl ? 1 : 0)) {
            llllllllllllIllIIllllIlllIlIIlII.add(StatCollector.translateToLocal(ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[24]]));
            "".length();
        }
    }
    
    private static String lIIlIllIlIlllllI(final String llllllllllllIllIIllllIllIlIllIll, final String llllllllllllIllIIllllIllIlIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIllIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIllIlIllIII.getBytes(StandardCharsets.UTF_8)), ItemFireworkCharge.llIllIIlIIllll[6]), "DES");
            final Cipher llllllllllllIllIIllllIllIlIlllIl = Cipher.getInstance("DES");
            llllllllllllIllIIllllIllIlIlllIl.init(ItemFireworkCharge.llIllIIlIIllll[8], llllllllllllIllIIllllIllIlIllllI);
            return new String(llllllllllllIllIIllllIllIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIllIlIlllII) {
            llllllllllllIllIIllllIllIlIlllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIllIlIllllll(final String llllllllllllIllIIllllIlllIIIIIII, final String llllllllllllIllIIllllIllIlllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIlllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllllIlllIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllllIlllIIIIIlI.init(ItemFireworkCharge.llIllIIlIIllll[8], llllllllllllIllIIllllIlllIIIIIll);
            return new String(llllllllllllIllIIllllIlllIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIlllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIlllIIIIIIl) {
            llllllllllllIllIIllllIlllIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack llllllllllllIllIIllllIllllIlllIl, final int llllllllllllIllIIllllIllllIlIIlI) {
        if (lIIlIllIlllIIlll(llllllllllllIllIIllllIllllIlIIlI, ItemFireworkCharge.llIllIIlIIllll[0])) {
            return super.getColorFromItemStack(llllllllllllIllIIllllIllllIlllIl, llllllllllllIllIIllllIllllIlIIlI);
        }
        final NBTBase llllllllllllIllIIllllIllllIllIll = getExplosionTag(llllllllllllIllIIllllIllllIlllIl, ItemFireworkCharge.llIllIIlIIIlIl[ItemFireworkCharge.llIllIIlIIllll[1]]);
        if (lIIlIllIlllIlIII((llllllllllllIllIIllllIllllIllIll instanceof NBTTagIntArray) ? 1 : 0)) {
            return ItemFireworkCharge.llIllIIlIIllll[2];
        }
        final NBTTagIntArray llllllllllllIllIIllllIllllIllIlI = (NBTTagIntArray)llllllllllllIllIIllllIllllIllIll;
        final int[] llllllllllllIllIIllllIllllIllIIl = llllllllllllIllIIllllIllllIllIlI.getIntArray();
        if (lIIlIllIlllIlIIl(llllllllllllIllIIllllIllllIllIIl.length, ItemFireworkCharge.llIllIIlIIllll[0])) {
            return llllllllllllIllIIllllIllllIllIIl[ItemFireworkCharge.llIllIIlIIllll[1]];
        }
        int llllllllllllIllIIllllIllllIllIII = ItemFireworkCharge.llIllIIlIIllll[1];
        int llllllllllllIllIIllllIllllIlIlll = ItemFireworkCharge.llIllIIlIIllll[1];
        int llllllllllllIllIIllllIllllIlIllI = ItemFireworkCharge.llIllIIlIIllll[1];
        final short llllllllllllIllIIllllIllllIIlIII;
        final int llllllllllllIllIIllllIllllIIlIIl = ((int[])(Object)(llllllllllllIllIIllllIllllIIlIII = (short)(Object)llllllllllllIllIIllllIllllIllIIl)).length;
        boolean llllllllllllIllIIllllIllllIIlIlI = ItemFireworkCharge.llIllIIlIIllll[1] != 0;
        "".length();
        if ("  ".length() <= -" ".length()) {
            return (0x2B ^ 0x5A ^ (0xC4 ^ 0x9F)) & (201 + 5 - 132 + 164 ^ 65 + 26 - 44 + 149 ^ -" ".length());
        }
        while (!lIIlIllIlllIlIlI(llllllllllllIllIIllllIllllIIlIlI ? 1 : 0, llllllllllllIllIIllllIllllIIlIIl)) {
            final int llllllllllllIllIIllllIllllIlIlIl = llllllllllllIllIIllllIllllIIlIII[llllllllllllIllIIllllIllllIIlIlI];
            llllllllllllIllIIllllIllllIllIII += (llllllllllllIllIIllllIllllIlIlIl & ItemFireworkCharge.llIllIIlIIllll[3]) >> ItemFireworkCharge.llIllIIlIIllll[4];
            llllllllllllIllIIllllIllllIlIlll += (llllllllllllIllIIllllIllllIlIlIl & ItemFireworkCharge.llIllIIlIIllll[5]) >> ItemFireworkCharge.llIllIIlIIllll[6];
            llllllllllllIllIIllllIllllIlIllI += (llllllllllllIllIIllllIllllIlIlIl & ItemFireworkCharge.llIllIIlIIllll[7]) >> ItemFireworkCharge.llIllIIlIIllll[1];
            ++llllllllllllIllIIllllIllllIIlIlI;
        }
        llllllllllllIllIIllllIllllIllIII /= llllllllllllIllIIllllIllllIllIIl.length;
        llllllllllllIllIIllllIllllIlIlll /= llllllllllllIllIIllllIllllIllIIl.length;
        llllllllllllIllIIllllIllllIlIllI /= llllllllllllIllIIllllIllllIllIIl.length;
        return llllllllllllIllIIllllIllllIllIII << ItemFireworkCharge.llIllIIlIIllll[4] | llllllllllllIllIIllllIllllIlIlll << ItemFireworkCharge.llIllIIlIIllll[6] | llllllllllllIllIIllllIllllIlIllI;
    }
}
