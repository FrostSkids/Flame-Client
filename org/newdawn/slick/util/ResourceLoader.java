// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.util.Arrays;
import java.io.File;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class ResourceLoader
{
    private static final /* synthetic */ int[] lIIllIlIlllIlI;
    private static final /* synthetic */ String[] lIIllIlIlllIII;
    private static /* synthetic */ ArrayList locations;
    
    public static URL getResource(final String lllllllllllllIIlIlIlIIIIlIlIIIlI) {
        URL lllllllllllllIIlIlIlIIIIlIlIIIIl = null;
        int lllllllllllllIIlIlIlIIIIlIlIIlII = ResourceLoader.lIIllIlIlllIlI[0];
        while (llIllIIlIlIlllI(lllllllllllllIIlIlIlIIIIlIlIIlII, ResourceLoader.locations.size())) {
            final ResourceLocation lllllllllllllIIlIlIlIIIIlIlIIlIl = ResourceLoader.locations.get(lllllllllllllIIlIlIlIIIIlIlIIlII);
            lllllllllllllIIlIlIlIIIIlIlIIIIl = lllllllllllllIIlIlIlIIIIlIlIIlIl.getResource(lllllllllllllIIlIlIlIIIIlIlIIIlI);
            if (llIllIIlIlIllll(lllllllllllllIIlIlIlIIIIlIlIIIIl)) {
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIlIlIlIIIIlIlIIlII;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
                continue;
            }
        }
        if (llIllIIlIllIIII(lllllllllllllIIlIlIlIIIIlIlIIIIl)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(ResourceLoader.lIIllIlIlllIII[ResourceLoader.lIIllIlIlllIlI[1]]).append(lllllllllllllIIlIlIlIIIIlIlIIIlI)));
        }
        return lllllllllllllIIlIlIlIIIIlIlIIIIl;
    }
    
    public static InputStream getResourceAsStream(final String lllllllllllllIIlIlIlIIIIlIllllIl) {
        InputStream lllllllllllllIIlIlIlIIIIlIllllII = null;
        int lllllllllllllIIlIlIlIIIIlIlllllI = ResourceLoader.lIIllIlIlllIlI[0];
        while (llIllIIlIlIlllI(lllllllllllllIIlIlIlIIIIlIlllllI, ResourceLoader.locations.size())) {
            final ResourceLocation lllllllllllllIIlIlIlIIIIlIllllll = ResourceLoader.locations.get(lllllllllllllIIlIlIlIIIIlIlllllI);
            lllllllllllllIIlIlIlIIIIlIllllII = lllllllllllllIIlIlIlIIIIlIllllll.getResourceAsStream(lllllllllllllIIlIlIlIIIIlIllllIl);
            if (llIllIIlIlIllll(lllllllllllllIIlIlIlIIIIlIllllII)) {
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIlIlIlIIIIlIlllllI;
                "".length();
                if (((0x3E ^ 0x7) & ~(0x8A ^ 0xB3)) == (0x2A ^ 0x2E)) {
                    return null;
                }
                continue;
            }
        }
        if (llIllIIlIllIIII(lllllllllllllIIlIlIlIIIIlIllllII)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(ResourceLoader.lIIllIlIlllIII[ResourceLoader.lIIllIlIlllIlI[0]]).append(lllllllllllllIIlIlIlIIIIlIllllIl)));
        }
        return new BufferedInputStream(lllllllllllllIIlIlIlIIIIlIllllII);
    }
    
    public static void addResourceLocation(final ResourceLocation lllllllllllllIIlIlIlIIIIllIIlIII) {
        ResourceLoader.locations.add(lllllllllllllIIlIlIlIIIIllIIlIII);
        "".length();
    }
    
    public static void removeResourceLocation(final ResourceLocation lllllllllllllIIlIlIlIIIIllIIIlII) {
        ResourceLoader.locations.remove(lllllllllllllIIlIlIlIIIIllIIIlII);
        "".length();
    }
    
    private static boolean llIllIIlIlIlllI(final int lllllllllllllIIlIlIlIIIIlIIIIIII, final int lllllllllllllIIlIlIlIIIIIlllllll) {
        return lllllllllllllIIlIlIlIIIIlIIIIIII < lllllllllllllIIlIlIlIIIIIlllllll;
    }
    
    private static String llIllIIlIlIIlIl(final String lllllllllllllIIlIlIlIIIIlIIIIllI, final String lllllllllllllIIlIlIlIIIIlIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIIIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIlIIIIlIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIlIIIIlIIIlIlI.init(ResourceLoader.lIIllIlIlllIlI[2], lllllllllllllIIlIlIlIIIIlIIIlIll);
            return new String(lllllllllllllIIlIlIlIIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIIIlIIIlIIl) {
            lllllllllllllIIlIlIlIIIIlIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    public static boolean resourceExists(final String lllllllllllllIIlIlIlIIIIlIllIIIl) {
        URL lllllllllllllIIlIlIlIIIIlIllIIII = null;
        int lllllllllllllIIlIlIlIIIIlIllIIlI = ResourceLoader.lIIllIlIlllIlI[0];
        while (llIllIIlIlIlllI(lllllllllllllIIlIlIlIIIIlIllIIlI, ResourceLoader.locations.size())) {
            final ResourceLocation lllllllllllllIIlIlIlIIIIlIllIIll = ResourceLoader.locations.get(lllllllllllllIIlIlIlIIIIlIllIIlI);
            lllllllllllllIIlIlIlIIIIlIllIIII = lllllllllllllIIlIlIlIIIIlIllIIll.getResource(lllllllllllllIIlIlIlIIIIlIllIIIl);
            if (llIllIIlIlIllll(lllllllllllllIIlIlIlIIIIlIllIIII)) {
                return ResourceLoader.lIIllIlIlllIlI[1] != 0;
            }
            ++lllllllllllllIIlIlIlIIIIlIllIIlI;
            "".length();
            if (" ".length() < 0) {
                return ((0x8C ^ 0x95) & ~(0x7A ^ 0x63)) != 0x0;
            }
        }
        return ResourceLoader.lIIllIlIlllIlI[0] != 0;
    }
    
    static {
        llIllIIlIlIllIl();
        llIllIIlIlIllII();
        (ResourceLoader.locations = new ArrayList()).add(new ClasspathLocation());
        "".length();
        ResourceLoader.locations.add(new FileSystemLocation(new File(ResourceLoader.lIIllIlIlllIII[ResourceLoader.lIIllIlIlllIlI[2]])));
        "".length();
    }
    
    private static void llIllIIlIlIllIl() {
        (lIIllIlIlllIlI = new int[5])[0] = ((0x19 ^ 0x15 ^ (0x12 ^ 0x30)) & (0x6B ^ 0x25 ^ (0xF3 ^ 0x93) ^ -" ".length()));
        ResourceLoader.lIIllIlIlllIlI[1] = " ".length();
        ResourceLoader.lIIllIlIlllIlI[2] = "  ".length();
        ResourceLoader.lIIllIlIlllIlI[3] = "   ".length();
        ResourceLoader.lIIllIlIlllIlI[4] = (177 + 74 - 239 + 193 ^ 189 + 151 - 147 + 4);
    }
    
    private static boolean llIllIIlIllIIII(final Object lllllllllllllIIlIlIlIIIIIllllIll) {
        return lllllllllllllIIlIlIlIIIIIllllIll == null;
    }
    
    private static void llIllIIlIlIllII() {
        (lIIllIlIlllIII = new String[ResourceLoader.lIIllIlIlllIlI[3]])[ResourceLoader.lIIllIlIlllIlI[0]] = llIllIIlIlIIlII("1SMIvNkgnVCn9a/kTZoCttGPt2o9GYxO", "EtSrm");
        ResourceLoader.lIIllIlIlllIII[ResourceLoader.lIIllIlIlllIlI[1]] = llIllIIlIlIIlIl("lSKRGBjg6Ggjs9tnOHcwWAcCZZts5k5l", "weqSP");
        ResourceLoader.lIIllIlIlllIII[ResourceLoader.lIIllIlIlllIlI[2]] = llIllIIlIlIIlIl("XKp9iozH1To=", "mKbbI");
    }
    
    private static boolean llIllIIlIlIllll(final Object lllllllllllllIIlIlIlIIIIIlllllIl) {
        return lllllllllllllIIlIlIlIIIIIlllllIl != null;
    }
    
    private static String llIllIIlIlIIlII(final String lllllllllllllIIlIlIlIIIIlIIlIlIl, final String lllllllllllllIIlIlIlIIIIlIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), ResourceLoader.lIIllIlIlllIlI[4]), "DES");
            final Cipher lllllllllllllIIlIlIlIIIIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlIIIIlIIlIlll.init(ResourceLoader.lIIllIlIlllIlI[2], lllllllllllllIIlIlIlIIIIlIIllIII);
            return new String(lllllllllllllIIlIlIlIIIIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIIIlIIlIllI) {
            lllllllllllllIIlIlIlIIIIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    public static void removeAllResourceLocations() {
        ResourceLoader.locations.clear();
    }
}
