// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.util.Iterator;
import java.util.UUID;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.mojang.authlib.properties.Property;
import net.minecraft.util.StringUtils;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class NBTUtil
{
    private static final /* synthetic */ String[] lIlIllIllIlIlI;
    private static final /* synthetic */ int[] lIlIllIllIlllI;
    
    static {
        llllIIlIIIlIlII();
        llllIIlIIIIIlll();
    }
    
    private static boolean llllIIlIIIllIlI(final Object lllllllllllllIIIIllIIllIlIllIlIl) {
        return lllllllllllllIIIIllIIllIlIllIlIl == null;
    }
    
    private static boolean llllIIlIIIlIlIl(final int lllllllllllllIIIIllIIllIlIllIIll) {
        return lllllllllllllIIIIllIIllIlIllIIll != 0;
    }
    
    private static boolean llllIIlIIIllIIl(final Object lllllllllllllIIIIllIIllIlIlllIII, final Object lllllllllllllIIIIllIIllIlIllIlll) {
        return lllllllllllllIIIIllIIllIlIlllIII == lllllllllllllIIIIllIIllIlIllIlll;
    }
    
    private static String llllIIlIIIIIIIl(String lllllllllllllIIIIllIIllIlllIIlll, final String lllllllllllllIIIIllIIllIlllIIllI) {
        lllllllllllllIIIIllIIllIlllIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIllIIllIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIllIlllIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIIllIIllIlllIlIIl = lllllllllllllIIIIllIIllIlllIIllI.toCharArray();
        int lllllllllllllIIIIllIIllIlllIlIII = NBTUtil.lIlIllIllIlllI[0];
        final Exception lllllllllllllIIIIllIIllIlllIIIlI = (Object)lllllllllllllIIIIllIIllIlllIIlll.toCharArray();
        final byte lllllllllllllIIIIllIIllIlllIIIIl = (byte)lllllllllllllIIIIllIIllIlllIIIlI.length;
        double lllllllllllllIIIIllIIllIlllIIIII = NBTUtil.lIlIllIllIlllI[0];
        while (llllIIlIIIllIll((int)lllllllllllllIIIIllIIllIlllIIIII, lllllllllllllIIIIllIIllIlllIIIIl)) {
            final char lllllllllllllIIIIllIIllIlllIllIl = lllllllllllllIIIIllIIllIlllIIIlI[lllllllllllllIIIIllIIllIlllIIIII];
            lllllllllllllIIIIllIIllIlllIlIlI.append((char)(lllllllllllllIIIIllIIllIlllIllIl ^ lllllllllllllIIIIllIIllIlllIlIIl[lllllllllllllIIIIllIIllIlllIlIII % lllllllllllllIIIIllIIllIlllIlIIl.length]));
            "".length();
            ++lllllllllllllIIIIllIIllIlllIlIII;
            ++lllllllllllllIIIIllIIllIlllIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIllIlllIlIlI);
    }
    
    private static void llllIIlIIIlIlII() {
        (lIlIllIllIlllI = new int[15])[0] = ((0xF5 ^ 0xA5) & ~(0x7E ^ 0x2E));
        NBTUtil.lIlIllIllIlllI[1] = (0x4C ^ 0x44);
        NBTUtil.lIlIllIllIlllI[2] = " ".length();
        NBTUtil.lIlIllIllIlllI[3] = "  ".length();
        NBTUtil.lIlIllIllIlllI[4] = "   ".length();
        NBTUtil.lIlIllIllIlllI[5] = (0x55 ^ 0x51);
        NBTUtil.lIlIllIllIlllI[6] = (0x2D ^ 0x27);
        NBTUtil.lIlIllIllIlllI[7] = (0xC7 ^ 0xC2);
        NBTUtil.lIlIllIllIlllI[8] = (137 + 16 - 39 + 32 ^ 35 + 61 - 14 + 66);
        NBTUtil.lIlIllIllIlllI[9] = (0x23 ^ 0x24);
        NBTUtil.lIlIllIllIlllI[10] = (0xD2 ^ 0xB4 ^ (0xC9 ^ 0xA6));
        NBTUtil.lIlIllIllIlllI[11] = (0xA0 ^ 0xAB);
        NBTUtil.lIlIllIllIlllI[12] = (0x73 ^ 0x54 ^ (0x3D ^ 0x16));
        NBTUtil.lIlIllIllIlllI[13] = (0x13 ^ 0x1E);
        NBTUtil.lIlIllIllIlllI[14] = (0x45 ^ 0x4B);
    }
    
    public static NBTTagCompound writeGameProfile(final NBTTagCompound lllllllllllllIIIIllIIlllIIlIIlIl, final GameProfile lllllllllllllIIIIllIIlllIIlIIlII) {
        if (llllIIlIIIlIlll(StringUtils.isNullOrEmpty(lllllllllllllIIIIllIIlllIIlIIlII.getName()) ? 1 : 0)) {
            lllllllllllllIIIIllIIlllIIlIIlIl.setString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[10]], lllllllllllllIIIIllIIlllIIlIIlII.getName());
        }
        if (llllIIlIIIllIII(lllllllllllllIIIIllIIlllIIlIIlII.getId())) {
            lllllllllllllIIIIllIIlllIIlIIlIl.setString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[6]], lllllllllllllIIIIllIIlllIIlIIlII.getId().toString());
        }
        if (llllIIlIIIlIlll(lllllllllllllIIIIllIIlllIIlIIlII.getProperties().isEmpty() ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIIIllIIlllIIlIIIll = new NBTTagCompound();
            final boolean lllllllllllllIIIIllIIlllIIIllIlI = (boolean)lllllllllllllIIIIllIIlllIIlIIlII.getProperties().keySet().iterator();
            "".length();
            if ((0x45 ^ 0x7D ^ (0xFC ^ 0xC0)) != (0x27 ^ 0x59 ^ (0x6 ^ 0x7C))) {
                return null;
            }
            while (!llllIIlIIIlIlll(((Iterator)lllllllllllllIIIIllIIlllIIIllIlI).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIIllIIlllIIlIIIlI = ((Iterator<String>)lllllllllllllIIIIllIIlllIIIllIlI).next();
                final NBTTagList lllllllllllllIIIIllIIlllIIlIIIIl = new NBTTagList();
                final boolean lllllllllllllIIIIllIIlllIIIlIlll = (boolean)lllllllllllllIIIIllIIlllIIlIIlII.getProperties().get((Object)lllllllllllllIIIIllIIlllIIlIIIlI).iterator();
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
                while (!llllIIlIIIlIlll(((Iterator)lllllllllllllIIIIllIIlllIIIlIlll).hasNext() ? 1 : 0)) {
                    final Property lllllllllllllIIIIllIIlllIIlIIIII = ((Iterator<Property>)lllllllllllllIIIIllIIlllIIIlIlll).next();
                    final NBTTagCompound lllllllllllllIIIIllIIlllIIIlllll = new NBTTagCompound();
                    lllllllllllllIIIIllIIlllIIIlllll.setString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[11]], lllllllllllllIIIIllIIlllIIlIIIII.getValue());
                    if (llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIIlIIIII.hasSignature() ? 1 : 0)) {
                        lllllllllllllIIIIllIIlllIIIlllll.setString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[12]], lllllllllllllIIIIllIIlllIIlIIIII.getSignature());
                    }
                    lllllllllllllIIIIllIIlllIIlIIIIl.appendTag(lllllllllllllIIIIllIIlllIIIlllll);
                }
                lllllllllllllIIIIllIIlllIIlIIIll.setTag(lllllllllllllIIIIllIIlllIIlIIIlI, lllllllllllllIIIIllIIlllIIlIIIIl);
            }
            lllllllllllllIIIIllIIlllIIlIIlIl.setTag(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[13]], lllllllllllllIIIIllIIlllIIlIIIll);
        }
        return lllllllllllllIIIIllIIlllIIlIIlIl;
    }
    
    private static String llllIIlIIIIIIII(final String lllllllllllllIIIIllIIllIllIIlIII, final String lllllllllllllIIIIllIIllIllIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIllIllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), NBTUtil.lIlIllIllIlllI[1]), "DES");
            final Cipher lllllllllllllIIIIllIIllIllIIllII = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIllIllIIllII.init(NBTUtil.lIlIllIllIlllI[3], lllllllllllllIIIIllIIllIllIIllIl);
            return new String(lllllllllllllIIIIllIIllIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIllIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIllIllIIlIll) {
            lllllllllllllIIIIllIIllIllIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIlIIIIIlll() {
        (lIlIllIllIlIlI = new String[NBTUtil.lIlIllIllIlllI[14]])[NBTUtil.lIlIllIllIlllI[0]] = llllIIlIIIIIIII("unaO06fjmwM=", "IikEX");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[2]] = llllIIlIIIIIIIl("HzQMLA==", "QUaIQ");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[3]] = llllIIlIIIIIIlI("sdHJ8aMeURU=", "cWEOx");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[4]] = llllIIlIIIIIIlI("c6m+T9EsI0w=", "VcsPn");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[5]] = llllIIlIIIIIIIl("GAg3Khc6DjE/AQ==", "HzXZr");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[7]] = llllIIlIIIIIIIl("MTUNOTMTMwssJQ==", "aGbIV");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[8]] = llllIIlIIIIIIII("nJzwLa1rjyk=", "csmpB");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[9]] = llllIIlIIIIIIII("MJNbKC8yUnUy0ijQsUVEug==", "uVBui");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[1]] = llllIIlIIIIIIlI("2fls489JDuw9Zi1DKl4TJw==", "QNXSG");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[10]] = llllIIlIIIIIIlI("6zF600Jkv+I=", "MIliN");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[6]] = llllIIlIIIIIIII("LJgkTvvdd4c=", "CEtbS");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[11]] = llllIIlIIIIIIII("g2heY4plclU=", "pueJa");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[12]] = llllIIlIIIIIIlI("q6bRcTxVIZDPqvUvyXBi0g==", "tGXRB");
        NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[13]] = llllIIlIIIIIIlI("4GS+E4SnS3RXqgWnBI6nJA==", "aSfUy");
    }
    
    private static boolean llllIIlIIIllIll(final int lllllllllllllIIIIllIIllIlIlllllI, final int lllllllllllllIIIIllIIllIlIllllIl) {
        return lllllllllllllIIIIllIIllIlIlllllI < lllllllllllllIIIIllIIllIlIllllIl;
    }
    
    private static String llllIIlIIIIIIlI(final String lllllllllllllIIIIllIIllIllIlIlll, final String lllllllllllllIIIIllIIllIllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIllIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIllIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIllIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIllIllIllIIl.init(NBTUtil.lIlIllIllIlllI[3], lllllllllllllIIIIllIIllIllIllIlI);
            return new String(lllllllllllllIIIIllIIllIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIllIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIllIllIllIII) {
            lllllllllllllIIIIllIIllIllIllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlIIIllIII(final Object lllllllllllllIIIIllIIllIlIlllIll) {
        return lllllllllllllIIIIllIIllIlIlllIll != null;
    }
    
    public static GameProfile readGameProfileFromNBT(final NBTTagCompound lllllllllllllIIIIllIIlllIlIIIlll) {
        String lllllllllllllIIIIllIIlllIlIIIllI = null;
        String lllllllllllllIIIIllIIlllIlIIIlIl = null;
        if (llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIlIIIlll.hasKey(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[0]], NBTUtil.lIlIllIllIlllI[1]) ? 1 : 0)) {
            lllllllllllllIIIIllIIlllIlIIIllI = lllllllllllllIIIIllIIlllIlIIIlll.getString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[2]]);
        }
        if (llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIlIIIlll.hasKey(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[3]], NBTUtil.lIlIllIllIlllI[1]) ? 1 : 0)) {
            lllllllllllllIIIIllIIlllIlIIIlIl = lllllllllllllIIIIllIIlllIlIIIlll.getString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[4]]);
        }
        if (llllIIlIIIlIlIl(StringUtils.isNullOrEmpty(lllllllllllllIIIIllIIlllIlIIIllI) ? 1 : 0) && llllIIlIIIlIlIl(StringUtils.isNullOrEmpty(lllllllllllllIIIIllIIlllIlIIIlIl) ? 1 : 0)) {
            return null;
        }
        UUID lllllllllllllIIIIllIIlllIlIIIIll = null;
        try {
            final UUID lllllllllllllIIIIllIIlllIlIIIlII = UUID.fromString(lllllllllllllIIIIllIIlllIlIIIlIl);
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIIIIllIIlllIlIIIIlI) {
            lllllllllllllIIIIllIIlllIlIIIIll = null;
        }
        final GameProfile lllllllllllllIIIIllIIlllIlIIIIIl = new GameProfile(lllllllllllllIIIIllIIlllIlIIIIll, lllllllllllllIIIIllIIlllIlIIIllI);
        if (llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIlIIIlll.hasKey(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[5]], NBTUtil.lIlIllIllIlllI[6]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIIIllIIlllIlIIIIII = lllllllllllllIIIIllIIlllIlIIIlll.getCompoundTag(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[7]]);
            final Exception lllllllllllllIIIIllIIlllIIllIIll = (Exception)lllllllllllllIIIIllIIlllIlIIIIII.getKeySet().iterator();
            "".length();
            if ((0xAC ^ 0xA8) < 0) {
                return null;
            }
            while (!llllIIlIIIlIlll(((Iterator)lllllllllllllIIIIllIIlllIIllIIll).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIIllIIlllIIllllll = ((Iterator<String>)lllllllllllllIIIIllIIlllIIllIIll).next();
                final NBTTagList lllllllllllllIIIIllIIlllIIlllllI = lllllllllllllIIIIllIIlllIlIIIIII.getTagList(lllllllllllllIIIIllIIlllIIllllll, NBTUtil.lIlIllIllIlllI[6]);
                int lllllllllllllIIIIllIIlllIIllllIl = NBTUtil.lIlIllIllIlllI[0];
                "".length();
                if (((0x60 ^ 0x5F ^ (0x41 ^ 0x58)) & (0x42 ^ 0x70 ^ (0xD4 ^ 0xC0) ^ -" ".length())) > " ".length()) {
                    return null;
                }
                while (!llllIIlIIIlIllI(lllllllllllllIIIIllIIlllIIllllIl, lllllllllllllIIIIllIIlllIIlllllI.tagCount())) {
                    final NBTTagCompound lllllllllllllIIIIllIIlllIIllllII = lllllllllllllIIIIllIIlllIIlllllI.getCompoundTagAt(lllllllllllllIIIIllIIlllIIllllIl);
                    final String lllllllllllllIIIIllIIlllIIlllIll = lllllllllllllIIIIllIIlllIIllllII.getString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[8]]);
                    if (llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIIllllII.hasKey(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[9]], NBTUtil.lIlIllIllIlllI[1]) ? 1 : 0)) {
                        lllllllllllllIIIIllIIlllIlIIIIIl.getProperties().put((Object)lllllllllllllIIIIllIIlllIIllllll, (Object)new Property(lllllllllllllIIIIllIIlllIIllllll, lllllllllllllIIIIllIIlllIIlllIll, lllllllllllllIIIIllIIlllIIllllII.getString(NBTUtil.lIlIllIllIlIlI[NBTUtil.lIlIllIllIlllI[1]])));
                        "".length();
                        "".length();
                        if (((0x9A ^ 0x94) & ~(0x45 ^ 0x4B)) > " ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIIllIIlllIlIIIIIl.getProperties().put((Object)lllllllllllllIIIIllIIlllIIllllll, (Object)new Property(lllllllllllllIIIIllIIlllIIllllll, lllllllllllllIIIIllIIlllIIlllIll));
                        "".length();
                    }
                    ++lllllllllllllIIIIllIIlllIIllllIl;
                }
            }
        }
        return lllllllllllllIIIIllIIlllIlIIIIIl;
    }
    
    private static boolean llllIIlIIIlIlll(final int lllllllllllllIIIIllIIllIlIllIIIl) {
        return lllllllllllllIIIIllIIllIlIllIIIl == 0;
    }
    
    public static boolean func_181123_a(final NBTBase lllllllllllllIIIIllIIlllIIIIllII, final NBTBase lllllllllllllIIIIllIIlllIIIIlIll, final boolean lllllllllllllIIIIllIIlllIIIIlIlI) {
        if (llllIIlIIIllIIl(lllllllllllllIIIIllIIlllIIIIllII, lllllllllllllIIIIllIIlllIIIIlIll)) {
            return NBTUtil.lIlIllIllIlllI[2] != 0;
        }
        if (llllIIlIIIllIlI(lllllllllllllIIIIllIIlllIIIIllII)) {
            return NBTUtil.lIlIllIllIlllI[2] != 0;
        }
        if (llllIIlIIIllIlI(lllllllllllllIIIIllIIlllIIIIlIll)) {
            return NBTUtil.lIlIllIllIlllI[0] != 0;
        }
        if (llllIIlIIIlIlll(lllllllllllllIIIIllIIlllIIIIllII.getClass().equals(lllllllllllllIIIIllIIlllIIIIlIll.getClass()) ? 1 : 0)) {
            return NBTUtil.lIlIllIllIlllI[0] != 0;
        }
        if (llllIIlIIIlIlIl((lllllllllllllIIIIllIIlllIIIIllII instanceof NBTTagCompound) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIIIIllIIlllIIIIlIIl = (NBTTagCompound)lllllllllllllIIIIllIIlllIIIIllII;
            final NBTTagCompound lllllllllllllIIIIllIIlllIIIIlIII = (NBTTagCompound)lllllllllllllIIIIllIIlllIIIIlIll;
            final Iterator<String> iterator = lllllllllllllIIIIllIIlllIIIIlIIl.getKeySet().iterator();
            "".length();
            if (" ".length() == 0) {
                return ((0xB0 ^ 0xC3 ^ (0xE7 ^ 0x9F)) & (0xCC ^ 0xC2 ^ (0x7C ^ 0x79) ^ -" ".length())) != 0x0;
            }
            while (!llllIIlIIIlIlll(iterator.hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIIllIIlllIIIIIlll = iterator.next();
                final NBTBase lllllllllllllIIIIllIIlllIIIIIllI = lllllllllllllIIIIllIIlllIIIIlIIl.getTag(lllllllllllllIIIIllIIlllIIIIIlll);
                if (llllIIlIIIlIlll(func_181123_a(lllllllllllllIIIIllIIlllIIIIIllI, lllllllllllllIIIIllIIlllIIIIlIII.getTag(lllllllllllllIIIIllIIlllIIIIIlll), lllllllllllllIIIIllIIlllIIIIlIlI) ? 1 : 0)) {
                    return NBTUtil.lIlIllIllIlllI[0] != 0;
                }
            }
            return NBTUtil.lIlIllIllIlllI[2] != 0;
        }
        else {
            if (!llllIIlIIIlIlIl((lllllllllllllIIIIllIIlllIIIIllII instanceof NBTTagList) ? 1 : 0) || !llllIIlIIIlIlIl(lllllllllllllIIIIllIIlllIIIIlIlI ? 1 : 0)) {
                return lllllllllllllIIIIllIIlllIIIIllII.equals(lllllllllllllIIIIllIIlllIIIIlIll);
            }
            final NBTTagList lllllllllllllIIIIllIIlllIIIIIlIl = (NBTTagList)lllllllllllllIIIIllIIlllIIIIllII;
            final NBTTagList lllllllllllllIIIIllIIlllIIIIIlII = (NBTTagList)lllllllllllllIIIIllIIlllIIIIlIll;
            if (llllIIlIIIlIlll(lllllllllllllIIIIllIIlllIIIIIlIl.tagCount())) {
                if (llllIIlIIIlIlll(lllllllllllllIIIIllIIlllIIIIIlII.tagCount())) {
                    return NBTUtil.lIlIllIllIlllI[2] != 0;
                }
                return NBTUtil.lIlIllIllIlllI[0] != 0;
            }
            else {
                int lllllllllllllIIIIllIIlllIIIIIIll = NBTUtil.lIlIllIllIlllI[0];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x3B ^ 0x6A) & ~(0x13 ^ 0x42)) != 0x0;
                }
                while (!llllIIlIIIlIllI(lllllllllllllIIIIllIIlllIIIIIIll, lllllllllllllIIIIllIIlllIIIIIlIl.tagCount())) {
                    final NBTBase lllllllllllllIIIIllIIlllIIIIIIlI = lllllllllllllIIIIllIIlllIIIIIlIl.get(lllllllllllllIIIIllIIlllIIIIIIll);
                    boolean lllllllllllllIIIIllIIlllIIIIIIIl = NBTUtil.lIlIllIllIlllI[0] != 0;
                    int lllllllllllllIIIIllIIlllIIIIIIII = NBTUtil.lIlIllIllIlllI[0];
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0x63 ^ 0x35) & ~(0x4C ^ 0x1A)) != 0x0;
                    }
                    while (!llllIIlIIIlIllI(lllllllllllllIIIIllIIlllIIIIIIII, lllllllllllllIIIIllIIlllIIIIIlII.tagCount())) {
                        if (llllIIlIIIlIlIl(func_181123_a(lllllllllllllIIIIllIIlllIIIIIIlI, lllllllllllllIIIIllIIlllIIIIIlII.get(lllllllllllllIIIIllIIlllIIIIIIII), lllllllllllllIIIIllIIlllIIIIlIlI) ? 1 : 0)) {
                            lllllllllllllIIIIllIIlllIIIIIIIl = (NBTUtil.lIlIllIllIlllI[2] != 0);
                            "".length();
                            if (((0xC5 ^ 0x9D) & ~(0x46 ^ 0x1E)) != 0x0) {
                                return ((0x94 ^ 0xA2) & ~(0x54 ^ 0x62)) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++lllllllllllllIIIIllIIlllIIIIIIII;
                        }
                    }
                    if (llllIIlIIIlIlll(lllllllllllllIIIIllIIlllIIIIIIIl ? 1 : 0)) {
                        return NBTUtil.lIlIllIllIlllI[0] != 0;
                    }
                    ++lllllllllllllIIIIllIIlllIIIIIIll;
                }
                return NBTUtil.lIlIllIllIlllI[2] != 0;
            }
        }
    }
    
    private static boolean llllIIlIIIlIllI(final int lllllllllllllIIIIllIIllIllIIIIlI, final int lllllllllllllIIIIllIIllIllIIIIIl) {
        return lllllllllllllIIIIllIIllIllIIIIlI >= lllllllllllllIIIIllIIllIllIIIIIl;
    }
}
