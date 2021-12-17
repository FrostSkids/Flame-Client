// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import java.util.Iterator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import java.io.File;
import java.util.Map;

public class RegionFileCache
{
    private static final /* synthetic */ Map<File, RegionFile> regionsByFilename;
    private static final /* synthetic */ String[] lllllIIIlIIII;
    private static final /* synthetic */ int[] lllllIIIllllI;
    
    private static boolean lIlIllIlIllIlII(final int lllllllllllllIlIllIIIIIIIlllllIl, final int lllllllllllllIlIllIIIIIIIlllllII) {
        return lllllllllllllIlIllIIIIIIIlllllIl < lllllllllllllIlIllIIIIIIIlllllII;
    }
    
    private static boolean lIlIllIlIllIIlI(final int lllllllllllllIlIllIIIIIIIllllIII) {
        return lllllllllllllIlIllIIIIIIIllllIII == 0;
    }
    
    public static synchronized RegionFile createOrLoadRegionFile(final File lllllllllllllIlIllIIIIIIllIlllII, final int lllllllllllllIlIllIIIIIIlllIIIlI, final int lllllllllllllIlIllIIIIIIlllIIIIl) {
        final File lllllllllllllIlIllIIIIIIlllIIIII = new File(lllllllllllllIlIllIIIIIIllIlllII, RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[0]]);
        final File lllllllllllllIlIllIIIIIIllIlllll = new File(lllllllllllllIlIllIIIIIIlllIIIII, String.valueOf(new StringBuilder(RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[1]]).append(lllllllllllllIlIllIIIIIIlllIIIlI >> RegionFileCache.lllllIIIllllI[2]).append(RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[3]]).append(lllllllllllllIlIllIIIIIIlllIIIIl >> RegionFileCache.lllllIIIllllI[2]).append(RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[4]])));
        final RegionFile lllllllllllllIlIllIIIIIIllIllllI = RegionFileCache.regionsByFilename.get(lllllllllllllIlIllIIIIIIllIlllll);
        if (lIlIllIlIllIIIl(lllllllllllllIlIllIIIIIIllIllllI)) {
            return lllllllllllllIlIllIIIIIIllIllllI;
        }
        if (lIlIllIlIllIIlI(lllllllllllllIlIllIIIIIIlllIIIII.exists() ? 1 : 0)) {
            lllllllllllllIlIllIIIIIIlllIIIII.mkdirs();
            "".length();
        }
        if (lIlIllIlIllIIll(RegionFileCache.regionsByFilename.size(), RegionFileCache.lllllIIIllllI[5])) {
            clearRegionFileReferences();
        }
        final RegionFile lllllllllllllIlIllIIIIIIllIlllIl = new RegionFile(lllllllllllllIlIllIIIIIIllIlllll);
        RegionFileCache.regionsByFilename.put(lllllllllllllIlIllIIIIIIllIlllll, lllllllllllllIlIllIIIIIIllIlllIl);
        "".length();
        return lllllllllllllIlIllIIIIIIllIlllIl;
    }
    
    static {
        lIlIllIlIllIIII();
        lIlIllIIlllllIl();
        regionsByFilename = Maps.newHashMap();
    }
    
    private static String lIlIllIIlllllII(final String lllllllllllllIlIllIIIIIIlIIlIlII, final String lllllllllllllIlIllIIIIIIlIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIIIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), RegionFileCache.lllllIIIllllI[8]), "DES");
            final Cipher lllllllllllllIlIllIIIIIIlIIllIII = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIIIIlIIllIII.init(RegionFileCache.lllllIIIllllI[3], lllllllllllllIlIllIIIIIIlIIllIIl);
            return new String(lllllllllllllIlIllIIIIIIlIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIIIlIIlIlll) {
            lllllllllllllIlIllIIIIIIlIIlIlll.printStackTrace();
            return null;
        }
    }
    
    public static DataInputStream getChunkInputStream(final File lllllllllllllIlIllIIIIIIllIIIlIl, final int lllllllllllllIlIllIIIIIIllIIIlII, final int lllllllllllllIlIllIIIIIIllIIIIll) {
        final RegionFile lllllllllllllIlIllIIIIIIllIIIllI = createOrLoadRegionFile(lllllllllllllIlIllIIIIIIllIIIlIl, lllllllllllllIlIllIIIIIIllIIIlII, lllllllllllllIlIllIIIIIIllIIIIll);
        return lllllllllllllIlIllIIIIIIllIIIllI.getChunkDataInputStream(lllllllllllllIlIllIIIIIIllIIIlII & RegionFileCache.lllllIIIllllI[6], lllllllllllllIlIllIIIIIIllIIIIll & RegionFileCache.lllllIIIllllI[6]);
    }
    
    private static boolean lIlIllIlIllIIll(final int lllllllllllllIlIllIIIIIIlIIIIIIl, final int lllllllllllllIlIllIIIIIIlIIIIIII) {
        return lllllllllllllIlIllIIIIIIlIIIIIIl >= lllllllllllllIlIllIIIIIIlIIIIIII;
    }
    
    private static String lIlIllIIllllIlI(final String lllllllllllllIlIllIIIIIIlIIIIlll, final String lllllllllllllIlIllIIIIIIlIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIIIlIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIIIIlIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIIIIlIIIlIll.init(RegionFileCache.lllllIIIllllI[3], lllllllllllllIlIllIIIIIIlIIIllII);
            return new String(lllllllllllllIlIllIIIIIIlIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIIIlIIIlIlI) {
            lllllllllllllIlIllIIIIIIlIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    public static synchronized void clearRegionFileReferences() {
        final short lllllllllllllIlIllIIIIIIllIIllll = (short)RegionFileCache.regionsByFilename.values().iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIlIllIlIllIIlI(((Iterator)lllllllllllllIlIllIIIIIIllIIllll).hasNext() ? 1 : 0)) {
            final RegionFile lllllllllllllIlIllIIIIIIllIlIIlI = ((Iterator<RegionFile>)lllllllllllllIlIllIIIIIIllIIllll).next();
            try {
                if (!lIlIllIlIllIIIl(lllllllllllllIlIllIIIIIIllIlIIlI)) {
                    continue;
                }
                lllllllllllllIlIllIIIIIIllIlIIlI.close();
                "".length();
                if ((0x85 ^ 0xC3 ^ (0xCB ^ 0x89)) < 0) {
                    return;
                }
                continue;
            }
            catch (IOException lllllllllllllIlIllIIIIIIllIlIIIl) {
                lllllllllllllIlIllIIIIIIllIlIIIl.printStackTrace();
            }
        }
        RegionFileCache.regionsByFilename.clear();
    }
    
    private static boolean lIlIllIlIllIIIl(final Object lllllllllllllIlIllIIIIIIIllllIlI) {
        return lllllllllllllIlIllIIIIIIIllllIlI != null;
    }
    
    public static DataOutputStream getChunkOutputStream(final File lllllllllllllIlIllIIIIIIlIlllIIl, final int lllllllllllllIlIllIIIIIIlIllllII, final int lllllllllllllIlIllIIIIIIlIllIlll) {
        final RegionFile lllllllllllllIlIllIIIIIIlIlllIlI = createOrLoadRegionFile(lllllllllllllIlIllIIIIIIlIlllIIl, lllllllllllllIlIllIIIIIIlIllllII, lllllllllllllIlIllIIIIIIlIllIlll);
        return lllllllllllllIlIllIIIIIIlIlllIlI.getChunkDataOutputStream(lllllllllllllIlIllIIIIIIlIllllII & RegionFileCache.lllllIIIllllI[6], lllllllllllllIlIllIIIIIIlIllIlll & RegionFileCache.lllllIIIllllI[6]);
    }
    
    private static String lIlIllIIllllIll(String lllllllllllllIlIllIIIIIIlIlIIllI, final String lllllllllllllIlIllIIIIIIlIlIIlIl) {
        lllllllllllllIlIllIIIIIIlIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIIIIlIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIIIIIIlIlIlIII = lllllllllllllIlIllIIIIIIlIlIIlIl.toCharArray();
        int lllllllllllllIlIllIIIIIIlIlIIlll = RegionFileCache.lllllIIIllllI[0];
        final long lllllllllllllIlIllIIIIIIlIlIIIIl = (Object)lllllllllllllIlIllIIIIIIlIlIIllI.toCharArray();
        final short lllllllllllllIlIllIIIIIIlIlIIIII = (short)lllllllllllllIlIllIIIIIIlIlIIIIl.length;
        boolean lllllllllllllIlIllIIIIIIlIIlllll = RegionFileCache.lllllIIIllllI[0] != 0;
        while (lIlIllIlIllIlII(lllllllllllllIlIllIIIIIIlIIlllll ? 1 : 0, lllllllllllllIlIllIIIIIIlIlIIIII)) {
            final char lllllllllllllIlIllIIIIIIlIlIllII = lllllllllllllIlIllIIIIIIlIlIIIIl[lllllllllllllIlIllIIIIIIlIIlllll];
            lllllllllllllIlIllIIIIIIlIlIlIIl.append((char)(lllllllllllllIlIllIIIIIIlIlIllII ^ lllllllllllllIlIllIIIIIIlIlIlIII[lllllllllllllIlIllIIIIIIlIlIIlll % lllllllllllllIlIllIIIIIIlIlIlIII.length]));
            "".length();
            ++lllllllllllllIlIllIIIIIIlIlIIlll;
            ++lllllllllllllIlIllIIIIIIlIIlllll;
            "".length();
            if (((0x91 ^ 0x9C) & ~(0x5A ^ 0x57)) >= (0x62 ^ 0x66)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIIIIlIlIlIIl);
    }
    
    private static void lIlIllIlIllIIII() {
        (lllllIIIllllI = new int[9])[0] = ((0x5F ^ 0x57) & ~(0x62 ^ 0x6A));
        RegionFileCache.lllllIIIllllI[1] = " ".length();
        RegionFileCache.lllllIIIllllI[2] = (0x66 ^ 0x63);
        RegionFileCache.lllllIIIllllI[3] = "  ".length();
        RegionFileCache.lllllIIIllllI[4] = "   ".length();
        RegionFileCache.lllllIIIllllI[5] = (-(0xFFFFEFDE & 0x566B) & (0xFFFFF74D & 0x4FFB));
        RegionFileCache.lllllIIIllllI[6] = (137 + 54 - 98 + 80 ^ 128 + 153 - 119 + 16);
        RegionFileCache.lllllIIIllllI[7] = (30 + 37 + 46 + 28 ^ 105 + 117 - 152 + 67);
        RegionFileCache.lllllIIIllllI[8] = (10 + 59 + 13 + 88 ^ 152 + 91 - 86 + 5);
    }
    
    private static void lIlIllIIlllllIl() {
        (lllllIIIlIIII = new String[RegionFileCache.lllllIIIllllI[7]])[RegionFileCache.lllllIIIllllI[0]] = lIlIllIIllllIlI("M0GS0rgdNro=", "vuXEn");
        RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[1]] = lIlIllIIllllIlI("R4U9bWHrZWA=", "bBcWn");
        RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[3]] = lIlIllIIllllIll("dg==", "XkhAJ");
        RegionFileCache.lllllIIIlIIII[RegionFileCache.lllllIIIllllI[4]] = lIlIllIIlllllII("j1BlCqiRTI4=", "PhscS");
    }
}
