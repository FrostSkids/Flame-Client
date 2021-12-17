// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Iterator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import com.google.gson.JsonParseException;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import java.io.Reader;
import com.google.gson.JsonParser;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.util.Map;

public class ResourceIndex
{
    private static final /* synthetic */ int[] llllIIIlIlIlI;
    private final /* synthetic */ Map<String, File> resourceMap;
    private static final /* synthetic */ String[] llllIIIlIlIII;
    private static final /* synthetic */ Logger logger;
    
    private static String lIlIIllllIIIIlI(final String lllllllllllllIlIllllIIIlIllllIII, final String lllllllllllllIlIllllIIIlIlllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIIlIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIIIlIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIIIlIllllIlI.init(ResourceIndex.llllIIIlIlIlI[2], lllllllllllllIlIllllIIIlIllllIll);
            return new String(lllllllllllllIlIllllIIIlIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIIlIllllIIl) {
            lllllllllllllIlIllllIIIlIllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIllllIIIIIl(String lllllllllllllIlIllllIIIllIIlIlIl, final String lllllllllllllIlIllllIIIllIIlIlII) {
        lllllllllllllIlIllllIIIllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllllIIIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllllIIIllIIllIII = new StringBuilder();
        final char[] lllllllllllllIlIllllIIIllIIlIlll = lllllllllllllIlIllllIIIllIIlIlII.toCharArray();
        int lllllllllllllIlIllllIIIllIIlIllI = ResourceIndex.llllIIIlIlIlI[0];
        final char lllllllllllllIlIllllIIIllIIlIIII = (Object)lllllllllllllIlIllllIIIllIIlIlIl.toCharArray();
        final char lllllllllllllIlIllllIIIllIIIllll = (char)lllllllllllllIlIllllIIIllIIlIIII.length;
        short lllllllllllllIlIllllIIIllIIIlllI = (short)ResourceIndex.llllIIIlIlIlI[0];
        while (lIlIIllllIlIIIl(lllllllllllllIlIllllIIIllIIIlllI, lllllllllllllIlIllllIIIllIIIllll)) {
            final char lllllllllllllIlIllllIIIllIIllIll = lllllllllllllIlIllllIIIllIIlIIII[lllllllllllllIlIllllIIIllIIIlllI];
            lllllllllllllIlIllllIIIllIIllIII.append((char)(lllllllllllllIlIllllIIIllIIllIll ^ lllllllllllllIlIllllIIIllIIlIlll[lllllllllllllIlIllllIIIllIIlIllI % lllllllllllllIlIllllIIIllIIlIlll.length]));
            "".length();
            ++lllllllllllllIlIllllIIIllIIlIllI;
            ++lllllllllllllIlIllllIIIllIIIlllI;
            "".length();
            if (((0x2A ^ 0x35 ^ (0x3D ^ 0x33)) & (0x2F ^ 0xC ^ (0xB8 ^ 0x8A) ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllllIIIllIIllIII);
    }
    
    private static boolean lIlIIllllIIllll(final int lllllllllllllIlIllllIIIlIlllIIII, final int lllllllllllllIlIllllIIIlIllIllll) {
        return lllllllllllllIlIllllIIIlIlllIIII == lllllllllllllIlIllllIIIlIllIllll;
    }
    
    private static void lIlIIllllIIllII() {
        (llllIIIlIlIlI = new int[11])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
        ResourceIndex.llllIIIlIlIlI[1] = " ".length();
        ResourceIndex.llllIIIlIlIlI[2] = "  ".length();
        ResourceIndex.llllIIIlIlIlI[3] = "   ".length();
        ResourceIndex.llllIIIlIlIlI[4] = (0x44 ^ 0x40);
        ResourceIndex.llllIIIlIlIlI[5] = (33 + 106 - 26 + 51 ^ 25 + 101 - 29 + 64);
        ResourceIndex.llllIIIlIlIlI[6] = (0xFC ^ 0xC7 ^ (0x86 ^ 0xBB));
        ResourceIndex.llllIIIlIlIlI[7] = (0x3A ^ 0x6E ^ (0x69 ^ 0x3A));
        ResourceIndex.llllIIIlIlIlI[8] = (0xAD ^ 0xA5);
        ResourceIndex.llllIIIlIlIlI[9] = (0xCC ^ 0xC5);
        ResourceIndex.llllIIIlIlIlI[10] = (0xC8 ^ 0xC2);
    }
    
    static {
        lIlIIllllIIllII();
        lIlIIllllIIlIll();
        logger = LogManager.getLogger();
    }
    
    private static String lIlIIllllIIIIII(final String lllllllllllllIlIllllIIIllIIIIIll, final String lllllllllllllIlIllllIIIllIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIIllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIIllIIIIlII.getBytes(StandardCharsets.UTF_8)), ResourceIndex.llllIIIlIlIlI[8]), "DES");
            final Cipher lllllllllllllIlIllllIIIllIIIIlll = Cipher.getInstance("DES");
            lllllllllllllIlIllllIIIllIIIIlll.init(ResourceIndex.llllIIIlIlIlI[2], lllllllllllllIlIllllIIIllIIIlIII);
            return new String(lllllllllllllIlIllllIIIllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIIllIIIIllI) {
            lllllllllllllIlIllllIIIllIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIllllIlIIIl(final int lllllllllllllIlIllllIIIlIllIllII, final int lllllllllllllIlIllllIIIlIllIlIll) {
        return lllllllllllllIlIllllIIIlIllIllII < lllllllllllllIlIllllIIIlIllIlIll;
    }
    
    private static boolean lIlIIllllIlIIII(final int lllllllllllllIlIllllIIIlIllIIlll) {
        return lllllllllllllIlIllllIIIlIllIIlll == 0;
    }
    
    private static void lIlIIllllIIlIll() {
        (llllIIIlIlIII = new String[ResourceIndex.llllIIIlIlIlI[10]])[ResourceIndex.llllIIIlIlIlI[0]] = lIlIIllllIIIIII("Nls7qfxkKJ8=", "CnFXn");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[1]] = lIlIIllllIIIIIl("OSccCQE1Olc=", "PIxly");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[2]] = lIlIIllllIIIIlI("vs6hxV7QATs=", "poQnw");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[3]] = lIlIIllllIIIIII("rk3nkyng+Lo=", "QMXCr");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[4]] = lIlIIllllIIIIII("N0Q0ewpsWyU=", "wOolw");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[5]] = lIlIIllllIIIIII("Jj9mcqAzwdM=", "sZJlk");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[6]] = lIlIIllllIIIIII("PzjVD3HqrCQ=", "ezhgD");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[7]] = lIlIIllllIIIIII("h888FWjZ8b8=", "UsIMs");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[8]] = lIlIIllllIIIIII("DcA4BMh9QLRTVIPGBe0fjj+smvYvBbxg5Xrb+3MTZsTpzXIf8cNDUQ==", "xitTz");
        ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[9]] = lIlIIllllIIIIlI("TMWN8+MJn7w5y4Y9fmAMHtkRzKB9c3AcBv4jzFaWmowRxf9YVdHemw==", "LUHZD");
    }
    
    public ResourceIndex(final File lllllllllllllIlIllllIIIllIllIlll, final String lllllllllllllIlIllllIIIllIllIllI) {
        this.resourceMap = (Map<String, File>)Maps.newHashMap();
        if (lIlIIllllIIllIl(lllllllllllllIlIllllIIIllIllIllI)) {
            final File lllllllllllllIlIllllIIIlllIIIllI = new File(lllllllllllllIlIllllIIIllIllIlll, ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[0]]);
            final File lllllllllllllIlIllllIIIlllIIIlIl = new File(lllllllllllllIlIllllIIIllIllIlll, String.valueOf(new StringBuilder(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[1]]).append(lllllllllllllIlIllllIIIllIllIllI).append(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[2]])));
            BufferedReader lllllllllllllIlIllllIIIlllIIIlII = null;
            Label_0595: {
                try {
                    lllllllllllllIlIllllIIIlllIIIlII = Files.newReader(lllllllllllllIlIllllIIIlllIIIlIl, Charsets.UTF_8);
                    final JsonObject lllllllllllllIlIllllIIIlllIIIIll = new JsonParser().parse((Reader)lllllllllllllIlIllllIIIlllIIIlII).getAsJsonObject();
                    final JsonObject lllllllllllllIlIllllIIIlllIIIIlI = JsonUtils.getJsonObject(lllllllllllllIlIllllIIIlllIIIIll, ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[3]], null);
                    if (!lIlIIllllIIllIl(lllllllllllllIlIllllIIIlllIIIIlI)) {
                        break Label_0595;
                    }
                    final String lllllllllllllIlIllllIIIllIlIllll = (String)lllllllllllllIlIllllIIIlllIIIIlI.entrySet().iterator();
                    "".length();
                    if (" ".length() < 0) {
                        throw null;
                    }
                    while (!lIlIIllllIlIIII(((Iterator)lllllllllllllIlIllllIIIllIlIllll).hasNext() ? 1 : 0)) {
                        final Map.Entry<String, JsonElement> lllllllllllllIlIllllIIIlllIIIIIl = ((Iterator<Map.Entry<String, JsonElement>>)lllllllllllllIlIllllIIIllIlIllll).next();
                        final JsonObject lllllllllllllIlIllllIIIlllIIIIII = (JsonObject)lllllllllllllIlIllllIIIlllIIIIIl.getValue();
                        final String lllllllllllllIlIllllIIIllIllllll = lllllllllllllIlIllllIIIlllIIIIIl.getKey();
                        final String[] lllllllllllllIlIllllIIIllIlllllI = lllllllllllllIlIllllIIIllIllllll.split(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[4]], ResourceIndex.llllIIIlIlIlI[2]);
                        String value;
                        if (lIlIIllllIIllll(lllllllllllllIlIllllIIIllIlllllI.length, ResourceIndex.llllIIIlIlIlI[1])) {
                            value = lllllllllllllIlIllllIIIllIlllllI[ResourceIndex.llllIIIlIlIlI[0]];
                            "".length();
                            if (((203 + 234 - 331 + 141 ^ 160 + 74 - 169 + 127) & (0x62 ^ 0x37 ^ (0xD2 ^ 0xB0) ^ -" ".length())) != 0x0) {
                                throw null;
                            }
                        }
                        else {
                            value = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllllIIIllIlllllI[ResourceIndex.llllIIIlIlIlI[0]])).append(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[5]]).append(lllllllllllllIlIllllIIIllIlllllI[ResourceIndex.llllIIIlIlIlI[1]]));
                        }
                        final String lllllllllllllIlIllllIIIllIllllIl = value;
                        final String lllllllllllllIlIllllIIIllIllllII = JsonUtils.getString(lllllllllllllIlIllllIIIlllIIIIII, ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[6]]);
                        final File lllllllllllllIlIllllIIIllIlllIll = new File(lllllllllllllIlIllllIIIlllIIIllI, String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllllIIIllIllllII.substring(ResourceIndex.llllIIIlIlIlI[0], ResourceIndex.llllIIIlIlIlI[2]))).append(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[7]]).append(lllllllllllllIlIllllIIIllIllllII)));
                        this.resourceMap.put(lllllllllllllIlIllllIIIllIllllIl, lllllllllllllIlIllllIIIllIlllIll);
                        "".length();
                    }
                    "".length();
                    if (-" ".length() >= 0) {
                        throw null;
                    }
                }
                catch (JsonParseException lllllllllllllIlIllllIIIllIlllIlI) {
                    ResourceIndex.logger.error(String.valueOf(new StringBuilder(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[8]]).append(lllllllllllllIlIllllIIIlllIIIlIl)));
                    IOUtils.closeQuietly((Reader)lllllllllllllIlIllllIIIlllIIIlII);
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        throw null;
                    }
                    return;
                }
                catch (FileNotFoundException lllllllllllllIlIllllIIIllIlllIIl) {
                    ResourceIndex.logger.error(String.valueOf(new StringBuilder(ResourceIndex.llllIIIlIlIII[ResourceIndex.llllIIIlIlIlI[9]]).append(lllllllllllllIlIllllIIIlllIIIlIl)));
                    IOUtils.closeQuietly((Reader)lllllllllllllIlIllllIIIlllIIIlII);
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                    return;
                }
                finally {
                    IOUtils.closeQuietly((Reader)lllllllllllllIlIllllIIIlllIIIlII);
                }
            }
            IOUtils.closeQuietly((Reader)lllllllllllllIlIllllIIIlllIIIlII);
        }
    }
    
    private static boolean lIlIIllllIIllIl(final Object lllllllllllllIlIllllIIIlIllIlIIl) {
        return lllllllllllllIlIllllIIIlIllIlIIl != null;
    }
    
    public Map<String, File> getResourceMap() {
        return this.resourceMap;
    }
}
