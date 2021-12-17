// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.CharsetUtil;
import java.util.regex.Pattern;

public class HttpVersion implements Comparable<HttpVersion>
{
    private static final /* synthetic */ Pattern VERSION_PATTERN;
    private final /* synthetic */ boolean keepAliveDefault;
    private final /* synthetic */ byte[] bytes;
    private final /* synthetic */ int minorVersion;
    private static final /* synthetic */ String[] lIIllIlIlIllIl;
    private final /* synthetic */ String protocolName;
    private final /* synthetic */ String text;
    private static final /* synthetic */ int[] lIIllIlIllIIII;
    public static final /* synthetic */ HttpVersion HTTP_1_1;
    public static final /* synthetic */ HttpVersion HTTP_1_0;
    private final /* synthetic */ int majorVersion;
    
    private HttpVersion(String lllllllllllllIIlIlIlIIlllIIIllII, final int lllllllllllllIIlIlIlIIlllIIIlIll, final int lllllllllllllIIlIlIlIIlllIIIlIIl, final boolean lllllllllllllIIlIlIlIIllIllllllI, final boolean lllllllllllllIIlIlIlIIllIlllllIl) {
        if (llIllIIlIIlIIII(lllllllllllllIIlIlIlIIlllIIIllII)) {
            throw new NullPointerException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[9]]);
        }
        lllllllllllllIIlIlIlIIlllIIIllII = lllllllllllllIIlIlIlIIlllIIIllII.trim().toUpperCase();
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIlllIIIllII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[10]]);
        }
        int lllllllllllllIIlIlIlIIlllIIIlllI = HttpVersion.lIIllIlIllIIII[0];
        while (llIllIIlIIlIIll(lllllllllllllIIlIlIlIIlllIIIlllI, lllllllllllllIIlIlIlIIlllIIIllII.length())) {
            if (!llIllIIlIIlIIlI(Character.isISOControl(lllllllllllllIIlIlIlIIlllIIIllII.charAt(lllllllllllllIIlIlIlIIlllIIIlllI)) ? 1 : 0) || llIllIIlIIlIIIl(Character.isWhitespace(lllllllllllllIIlIlIlIIlllIIIllII.charAt(lllllllllllllIIlIlIlIIlllIIIlllI)) ? 1 : 0)) {
                throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[11]]);
            }
            ++lllllllllllllIIlIlIlIIlllIIIlllI;
            "".length();
            if (null != null) {
                throw null;
            }
        }
        if (llIllIIlIIlIlII(lllllllllllllIIlIlIlIIlllIIIlIll)) {
            throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[12]]);
        }
        if (llIllIIlIIlIlII(lllllllllllllIIlIlIlIIlllIIIlIIl)) {
            throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[13]]);
        }
        this.protocolName = lllllllllllllIIlIlIlIIlllIIIllII;
        this.majorVersion = lllllllllllllIIlIlIlIIlllIIIlIll;
        this.minorVersion = lllllllllllllIIlIlIlIIlllIIIlIIl;
        this.text = String.valueOf(new StringBuilder().append(lllllllllllllIIlIlIlIIlllIIIllII).append((char)HttpVersion.lIIllIlIllIIII[7]).append(lllllllllllllIIlIlIlIIlllIIIlIll).append((char)HttpVersion.lIIllIlIllIIII[8]).append(lllllllllllllIIlIlIlIIlllIIIlIIl));
        this.keepAliveDefault = lllllllllllllIIlIlIlIIllIllllllI;
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIllIlllllIl ? 1 : 0)) {
            this.bytes = this.text.getBytes(CharsetUtil.US_ASCII);
            "".length();
            if (((0x76 ^ 0x5C) & ~(0x1C ^ 0x36)) >= (0x95 ^ 0x91)) {
                throw null;
            }
        }
        else {
            this.bytes = null;
        }
    }
    
    @Override
    public String toString() {
        return this.text();
    }
    
    @Override
    public int compareTo(final HttpVersion lllllllllllllIIlIlIlIIllIIllIlII) {
        int lllllllllllllIIlIlIlIIllIIllIllI = this.protocolName().compareTo(lllllllllllllIIlIlIlIIllIIllIlII.protocolName());
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIllIIllIllI)) {
            return lllllllllllllIIlIlIlIIllIIllIllI;
        }
        lllllllllllllIIlIlIlIIllIIllIllI = this.majorVersion() - lllllllllllllIIlIlIlIIllIIllIlII.majorVersion();
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIllIIllIllI)) {
            return lllllllllllllIIlIlIlIIllIIllIllI;
        }
        return this.minorVersion() - lllllllllllllIIlIlIlIIllIIllIlII.minorVersion();
    }
    
    private static boolean llIllIIlIIlIIIl(final int lllllllllllllIIlIlIlIIlIllIIIIIl) {
        return lllllllllllllIIlIlIlIIlIllIIIIIl != 0;
    }
    
    private static HttpVersion version0(final String lllllllllllllIIlIlIlIIllllIllllI) {
        if (llIllIIlIIlIIIl(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[2]].equals(lllllllllllllIIlIlIlIIllllIllllI) ? 1 : 0)) {
            return HttpVersion.HTTP_1_1;
        }
        if (llIllIIlIIlIIIl(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[3]].equals(lllllllllllllIIlIlIlIIllllIllllI) ? 1 : 0)) {
            return HttpVersion.HTTP_1_0;
        }
        return null;
    }
    
    private static String llIllIIlIIIIlll(final String lllllllllllllIIlIlIlIIlIlllllIII, final String lllllllllllllIIlIlIlIIlIlllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIlIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIlIIlIllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIlIIlIllllllIl.init(HttpVersion.lIIllIlIllIIII[2], lllllllllllllIIlIlIlIIlIllllllll);
            return new String(lllllllllllllIIlIlIlIIlIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIlIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIlIlllllIll) {
            lllllllllllllIIlIlIlIIlIlllllIll.printStackTrace();
            return null;
        }
    }
    
    public int majorVersion() {
        return this.majorVersion;
    }
    
    private static void llIllIIlIIIllll() {
        (lIIllIlIllIIII = new int[21])[0] = ((176 + 35 - 143 + 145 ^ 29 + 16 + 34 + 52) & (0xBC ^ 0x98 ^ (0xA ^ 0x78) ^ -" ".length()));
        HttpVersion.lIIllIlIllIIII[1] = " ".length();
        HttpVersion.lIIllIlIllIIII[2] = "  ".length();
        HttpVersion.lIIllIlIllIIII[3] = "   ".length();
        HttpVersion.lIIllIlIllIIII[4] = (0xEA ^ 0xBD ^ (0x74 ^ 0x27));
        HttpVersion.lIIllIlIllIIII[5] = (0x8F ^ 0x8A);
        HttpVersion.lIIllIlIllIIII[6] = (0x6E ^ 0x68);
        HttpVersion.lIIllIlIllIIII[7] = (0x43 ^ 0x6C);
        HttpVersion.lIIllIlIllIIII[8] = (0x90 ^ 0xBE);
        HttpVersion.lIIllIlIllIIII[9] = (0x3B ^ 0x64 ^ (0x7B ^ 0x23));
        HttpVersion.lIIllIlIllIIII[10] = (0x1E ^ 0x6 ^ (0x2E ^ 0x3E));
        HttpVersion.lIIllIlIllIIII[11] = (0xD2 ^ 0x9B ^ (0x6B ^ 0x2B));
        HttpVersion.lIIllIlIllIIII[12] = (0x7B ^ 0x71);
        HttpVersion.lIIllIlIllIIII[13] = (55 + 29 - 13 + 86 ^ 102 + 139 - 176 + 85);
        HttpVersion.lIIllIlIllIIII[14] = (0x43 ^ 0x5C);
        HttpVersion.lIIllIlIllIIII[15] = (0x7A ^ 0x76);
        HttpVersion.lIIllIlIllIIII[16] = (0x48 ^ 0x45);
        HttpVersion.lIIllIlIllIIII[17] = (0x26 ^ 0x62 ^ (0x2E ^ 0x64));
        HttpVersion.lIIllIlIllIIII[18] = (0x9D ^ 0x92);
        HttpVersion.lIIllIlIllIIII[19] = (0x48 ^ 0x71 ^ (0x80 ^ 0xA9));
        HttpVersion.lIIllIlIllIIII[20] = (0xD7 ^ 0xC6);
    }
    
    public HttpVersion(final String lllllllllllllIIlIlIlIIlllIlIllll, final int lllllllllllllIIlIlIlIIlllIlIlllI, final int lllllllllllllIIlIlIlIIlllIllIIll, final boolean lllllllllllllIIlIlIlIIlllIllIIlI) {
        this(lllllllllllllIIlIlIlIIlllIlIllll, lllllllllllllIIlIlIlIIlllIlIlllI, lllllllllllllIIlIlIlIIlllIllIIll, lllllllllllllIIlIlIlIIlllIllIIlI, (boolean)(HttpVersion.lIIllIlIllIIII[0] != 0));
    }
    
    @Override
    public int hashCode() {
        return (this.protocolName().hashCode() * HttpVersion.lIIllIlIllIIII[14] + this.majorVersion()) * HttpVersion.lIIllIlIllIIII[14] + this.minorVersion();
    }
    
    public static HttpVersion valueOf(String lllllllllllllIIlIlIlIIlllllIIllI) {
        if (llIllIIlIIlIIII(lllllllllllllIIlIlIlIIlllllIIllI)) {
            throw new NullPointerException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[0]]);
        }
        lllllllllllllIIlIlIlIIlllllIIllI = lllllllllllllIIlIlIlIIlllllIIllI.trim();
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIlllllIIllI.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[1]]);
        }
        HttpVersion lllllllllllllIIlIlIlIIlllllIIlIl = version0(lllllllllllllIIlIlIlIIlllllIIllI);
        if (llIllIIlIIlIIII(lllllllllllllIIlIlIlIIlllllIIlIl)) {
            lllllllllllllIIlIlIlIIlllllIIllI = lllllllllllllIIlIlIlIIlllllIIllI.toUpperCase();
            lllllllllllllIIlIlIlIIlllllIIlIl = version0(lllllllllllllIIlIlIlIIlllllIIllI);
            if (llIllIIlIIlIIII(lllllllllllllIIlIlIlIIlllllIIlIl)) {
                lllllllllllllIIlIlIlIIlllllIIlIl = new HttpVersion(lllllllllllllIIlIlIlIIlllllIIllI, (boolean)(HttpVersion.lIIllIlIllIIII[1] != 0));
            }
        }
        return lllllllllllllIIlIlIlIIlllllIIlIl;
    }
    
    public HttpVersion(String lllllllllllllIIlIlIlIIllllIIIlIl, final boolean lllllllllllllIIlIlIlIIllllIIIlII) {
        if (llIllIIlIIlIIII(lllllllllllllIIlIlIlIIllllIIIlIl)) {
            throw new NullPointerException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[4]]);
        }
        lllllllllllllIIlIlIlIIllllIIIlIl = lllllllllllllIIlIlIlIIllllIIIlIl.trim().toUpperCase();
        if (llIllIIlIIlIIIl(lllllllllllllIIlIlIlIIllllIIIlIl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[5]]);
        }
        final Matcher lllllllllllllIIlIlIlIIllllIIlIIl = HttpVersion.VERSION_PATTERN.matcher(lllllllllllllIIlIlIlIIllllIIIlIl);
        if (llIllIIlIIlIIlI(lllllllllllllIIlIlIlIIllllIIlIIl.matches() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[6]]).append(lllllllllllllIIlIlIlIIllllIIIlIl)));
        }
        this.protocolName = lllllllllllllIIlIlIlIIllllIIlIIl.group(HttpVersion.lIIllIlIllIIII[1]);
        this.majorVersion = Integer.parseInt(lllllllllllllIIlIlIlIIllllIIlIIl.group(HttpVersion.lIIllIlIllIIII[2]));
        this.minorVersion = Integer.parseInt(lllllllllllllIIlIlIlIIllllIIlIIl.group(HttpVersion.lIIllIlIllIIII[3]));
        this.text = String.valueOf(new StringBuilder().append(this.protocolName).append((char)HttpVersion.lIIllIlIllIIII[7]).append(this.majorVersion).append((char)HttpVersion.lIIllIlIllIIII[8]).append(this.minorVersion));
        this.keepAliveDefault = lllllllllllllIIlIlIlIIllllIIIlII;
        this.bytes = null;
    }
    
    private static boolean llIllIIlIIlIIlI(final int lllllllllllllIIlIlIlIIlIlIllllll) {
        return lllllllllllllIIlIlIlIIlIlIllllll == 0;
    }
    
    public String protocolName() {
        return this.protocolName;
    }
    
    static {
        llIllIIlIIIllll();
        llIllIIlIIIlIlI();
        HTTP_1_1_STRING = HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[15]];
        HTTP_1_0_STRING = HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[16]];
        VERSION_PATTERN = Pattern.compile(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[17]]);
        HTTP_1_0 = new HttpVersion(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[18]], HttpVersion.lIIllIlIllIIII[1], HttpVersion.lIIllIlIllIIII[0], (boolean)(HttpVersion.lIIllIlIllIIII[0] != 0), (boolean)(HttpVersion.lIIllIlIllIIII[1] != 0));
        HTTP_1_1 = new HttpVersion(HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[19]], HttpVersion.lIIllIlIllIIII[1], HttpVersion.lIIllIlIllIIII[1], (boolean)(HttpVersion.lIIllIlIllIIII[1] != 0), (boolean)(HttpVersion.lIIllIlIllIIII[1] != 0));
    }
    
    private static boolean llIllIIlIIlIlIl(final int lllllllllllllIIlIlIlIIlIllIIlIlI, final int lllllllllllllIIlIlIlIIlIllIIlIIl) {
        return lllllllllllllIIlIlIlIIlIllIIlIlI == lllllllllllllIIlIlIlIIlIllIIlIIl;
    }
    
    public String text() {
        return this.text;
    }
    
    private static void llIllIIlIIIlIlI() {
        (lIIllIlIlIllIl = new String[HttpVersion.lIIllIlIllIIII[20]])[HttpVersion.lIIllIlIllIIII[0]] = llIllIIlIIIIlIl("MutvVObxe3Q=", "EphnQ");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[1]] = llIllIIlIIIIlIl("IgqgY4Z+b2sWXwtXBlMCEQ==", "maYZA");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[2]] = llIllIIlIIIIlIl("zyIiFsAxAObTeLl2bHAFwQ==", "UJRGY");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[3]] = llIllIIlIIIIlIl("szWiztRDAznxiDOTowRurQ==", "bsbks");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[4]] = llIllIIlIIIIllI("LAgdMA==", "XmeDX");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[5]] = llIllIIlIIIIlll("+KPXwZVcDdaiW+uhOKcMFw==", "bWNyw");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[6]] = llIllIIlIIIIlIl("XaxNZVYrx2GpS+vAB4Q4PoCqXmuYbBtB+pLK2jwZScA=", "EBRiC");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[9]] = llIllIIlIIIIlIl("zD6rpqubn1HiDc0ujFaVRw==", "gTUSH");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[10]] = llIllIIlIIIIllI("Fzo5MT1SJzsqMB00JikKEzos", "rWIED");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[11]] = llIllIIlIIIIlIl("F30WYLCEJ3D+grxunAYD8ykXMJVenojrMY420TqtUFR2T1XS6QIn2Q==", "NIjLT");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[12]] = llIllIIlIIIIlll("3PyAt5phYMVRyN8eIfJWpwYw1zNp+zbK", "fdzBN");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[13]] = llIllIIlIIIIlll("BnP5WQUddBWMIioKto4HMFtjDLA6TLZd", "GKhKQ");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[15]] = llIllIIlIIIIllI("LB0gIF1VZ0U=", "dItpr");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[16]] = llIllIIlIIIIlIl("KLER4kYMwECmyGu5eXE25w==", "unalG");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[17]] = llIllIIlIIIIlll("HDsAMEqahrbo9DG8XindPs1eOYAf/H/x", "wUrBq");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[18]] = llIllIIlIIIIlll("HxGru6cZkOw=", "obwPZ");
        HttpVersion.lIIllIlIlIllIl[HttpVersion.lIIllIlIllIIII[19]] = llIllIIlIIIIllI("CzAVKA==", "CdAxB");
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIlIlIIllIlIIIIll) {
        if (llIllIIlIIlIIlI((lllllllllllllIIlIlIlIIllIlIIIIll instanceof HttpVersion) ? 1 : 0)) {
            return HttpVersion.lIIllIlIllIIII[0] != 0;
        }
        final HttpVersion lllllllllllllIIlIlIlIIllIlIIIlll = (HttpVersion)lllllllllllllIIlIlIlIIllIlIIIIll;
        int n;
        if (llIllIIlIIlIlIl(this.minorVersion(), lllllllllllllIIlIlIlIIllIlIIIlll.minorVersion()) && llIllIIlIIlIlIl(this.majorVersion(), lllllllllllllIIlIlIlIIllIlIIIlll.majorVersion()) && llIllIIlIIlIIIl(this.protocolName().equals(lllllllllllllIIlIlIlIIllIlIIIlll.protocolName()) ? 1 : 0)) {
            n = HttpVersion.lIIllIlIllIIII[1];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0xAA ^ 0xAC ^ (0xEC ^ 0xB2)) & (0x2C ^ 0x8 ^ (0xDD ^ 0xA1) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpVersion.lIIllIlIllIIII[0];
        }
        return n != 0;
    }
    
    private static boolean llIllIIlIIlIIII(final Object lllllllllllllIIlIlIlIIlIllIIIIll) {
        return lllllllllllllIIlIlIlIIlIllIIIIll == null;
    }
    
    public int minorVersion() {
        return this.minorVersion;
    }
    
    private static boolean llIllIIlIIlIlII(final int lllllllllllllIIlIlIlIIlIlIllllIl) {
        return lllllllllllllIIlIlIlIIlIlIllllIl < 0;
    }
    
    private static String llIllIIlIIIIlIl(final String lllllllllllllIIlIlIlIIlIllIlIIlI, final String lllllllllllllIIlIlIlIIlIllIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIlIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIlIllIIllll.getBytes(StandardCharsets.UTF_8)), HttpVersion.lIIllIlIllIIII[10]), "DES");
            final Cipher lllllllllllllIIlIlIlIIlIllIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlIIlIllIlIlII.init(HttpVersion.lIIllIlIllIIII[2], lllllllllllllIIlIlIlIIlIllIlIlIl);
            return new String(lllllllllllllIIlIlIlIIlIllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIlIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIlIllIlIIll) {
            lllllllllllllIIlIlIlIIlIllIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIIlIIlIIll(final int lllllllllllllIIlIlIlIIlIllIIIllI, final int lllllllllllllIIlIlIlIIlIllIIIlIl) {
        return lllllllllllllIIlIlIlIIlIllIIIllI < lllllllllllllIIlIlIlIIlIllIIIlIl;
    }
    
    void encode(final ByteBuf lllllllllllllIIlIlIlIIllIIlIlIII) {
        if (llIllIIlIIlIIII(this.bytes)) {
            HttpHeaders.encodeAscii0(this.text, lllllllllllllIIlIlIlIIllIIlIlIII);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlIlIIllIIlIlIII.writeBytes(this.bytes);
            "".length();
        }
    }
    
    private static String llIllIIlIIIIllI(String lllllllllllllIIlIlIlIIlIlllIIIlI, final String lllllllllllllIIlIlIlIIlIlllIIIIl) {
        lllllllllllllIIlIlIlIIlIlllIIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIIlIlllIIlIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIIlIlllIIlII = lllllllllllllIIlIlIlIIlIlllIIIIl.toCharArray();
        int lllllllllllllIIlIlIlIIlIlllIIIll = HttpVersion.lIIllIlIllIIII[0];
        final float lllllllllllllIIlIlIlIIlIllIlllIl = (Object)lllllllllllllIIlIlIlIIlIlllIIIlI.toCharArray();
        final Exception lllllllllllllIIlIlIlIIlIllIlllII = (Exception)lllllllllllllIIlIlIlIIlIllIlllIl.length;
        float lllllllllllllIIlIlIlIIlIllIllIll = HttpVersion.lIIllIlIllIIII[0];
        while (llIllIIlIIlIIll((int)lllllllllllllIIlIlIlIIlIllIllIll, (int)lllllllllllllIIlIlIlIIlIllIlllII)) {
            final char lllllllllllllIIlIlIlIIlIlllIlIII = lllllllllllllIIlIlIlIIlIllIlllIl[lllllllllllllIIlIlIlIIlIllIllIll];
            lllllllllllllIIlIlIlIIlIlllIIlIl.append((char)(lllllllllllllIIlIlIlIIlIlllIlIII ^ lllllllllllllIIlIlIlIIlIlllIIlII[lllllllllllllIIlIlIlIIlIlllIIIll % lllllllllllllIIlIlIlIIlIlllIIlII.length]));
            "".length();
            ++lllllllllllllIIlIlIlIIlIlllIIIll;
            ++lllllllllllllIIlIlIlIIlIllIllIll;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIIlIlllIIlIl);
    }
    
    public boolean isKeepAliveDefault() {
        return this.keepAliveDefault;
    }
}
