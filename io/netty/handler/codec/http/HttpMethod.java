// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Arrays;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import io.netty.util.CharsetUtil;
import java.util.Map;

public class HttpMethod implements Comparable<HttpMethod>
{
    public static final /* synthetic */ HttpMethod GET;
    public static final /* synthetic */ HttpMethod PUT;
    public static final /* synthetic */ HttpMethod OPTIONS;
    public static final /* synthetic */ HttpMethod CONNECT;
    public static final /* synthetic */ HttpMethod TRACE;
    private static final /* synthetic */ Map<String, HttpMethod> methodMap;
    private final /* synthetic */ byte[] bytes;
    public static final /* synthetic */ HttpMethod POST;
    private final /* synthetic */ String name;
    private static final /* synthetic */ String[] lIlIlIlllllIII;
    public static final /* synthetic */ HttpMethod DELETE;
    private static final /* synthetic */ int[] lIlIlIlllllIIl;
    public static final /* synthetic */ HttpMethod HEAD;
    public static final /* synthetic */ HttpMethod PATCH;
    
    private HttpMethod(String lllllllllllllIIIIllllIIlllIlIIII, final boolean lllllllllllllIIIIllllIIlllIIllll) {
        if (lllIlllllllIIlI(lllllllllllllIIIIllllIIlllIlIIII)) {
            throw new NullPointerException(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[2]]);
        }
        lllllllllllllIIIIllllIIlllIlIIII = lllllllllllllIIIIllllIIlllIlIIII.trim();
        if (lllIlllllllIIll(lllllllllllllIIIIllllIIlllIlIIII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[3]]);
        }
        int lllllllllllllIIIIllllIIlllIlIlIl = HttpMethod.lIlIlIlllllIIl[0];
        while (lllIlllllllIlIl(lllllllllllllIIIIllllIIlllIlIlIl, lllllllllllllIIIIllllIIlllIlIIII.length())) {
            if (!lllIlllllllIllI(Character.isISOControl(lllllllllllllIIIIllllIIlllIlIIII.charAt(lllllllllllllIIIIllllIIlllIlIlIl)) ? 1 : 0) || lllIlllllllIIll(Character.isWhitespace(lllllllllllllIIIIllllIIlllIlIIII.charAt(lllllllllllllIIIIllllIIlllIlIlIl)) ? 1 : 0)) {
                throw new IllegalArgumentException(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[4]]);
            }
            ++lllllllllllllIIIIllllIIlllIlIlIl;
            "".length();
            if ((0xF7 ^ 0xB0 ^ (0xCA ^ 0x89)) <= -" ".length()) {
                throw null;
            }
        }
        this.name = lllllllllllllIIIIllllIIlllIlIIII;
        if (lllIlllllllIIll(lllllllllllllIIIIllllIIlllIIllll ? 1 : 0)) {
            this.bytes = lllllllllllllIIIIllllIIlllIlIIII.getBytes(CharsetUtil.US_ASCII);
            "".length();
            if (-"   ".length() >= 0) {
                throw null;
            }
        }
        else {
            this.bytes = null;
        }
    }
    
    public static HttpMethod valueOf(String lllllllllllllIIIIllllIIllllIIIIl) {
        if (lllIlllllllIIlI(lllllllllllllIIIIllllIIllllIIIIl)) {
            throw new NullPointerException(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[0]]);
        }
        lllllllllllllIIIIllllIIllllIIIIl = lllllllllllllIIIIllllIIllllIIIIl.trim();
        if (lllIlllllllIIll(lllllllllllllIIIIllllIIllllIIIIl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[1]]);
        }
        final HttpMethod lllllllllllllIIIIllllIIllllIIIlI = HttpMethod.methodMap.get(lllllllllllllIIIIllllIIllllIIIIl);
        if (lllIlllllllIlII(lllllllllllllIIIIllllIIllllIIIlI)) {
            return lllllllllllllIIIIllllIIllllIIIlI;
        }
        return new HttpMethod(lllllllllllllIIIIllllIIllllIIIIl);
    }
    
    private static void lllIlllllllIIIl() {
        (lIlIlIlllllIIl = new int[15])[0] = ((0x1C ^ 0x7D) & ~(0x4B ^ 0x2A));
        HttpMethod.lIlIlIlllllIIl[1] = " ".length();
        HttpMethod.lIlIlIlllllIIl[2] = "  ".length();
        HttpMethod.lIlIlIlllllIIl[3] = "   ".length();
        HttpMethod.lIlIlIlllllIIl[4] = (0x78 ^ 0x7C);
        HttpMethod.lIlIlIlllllIIl[5] = (0x68 ^ 0x5B ^ (0x65 ^ 0x53));
        HttpMethod.lIlIlIlllllIIl[6] = (0xFD ^ 0x8C ^ (0x6D ^ 0x1A));
        HttpMethod.lIlIlIlllllIIl[7] = (0x38 ^ 0x3F);
        HttpMethod.lIlIlIlllllIIl[8] = (0xBF ^ 0xB7);
        HttpMethod.lIlIlIlllllIIl[9] = (0x2C ^ 0x25);
        HttpMethod.lIlIlIlllllIIl[10] = (0x7F ^ 0x75);
        HttpMethod.lIlIlIlllllIIl[11] = (0x49 ^ 0x22 ^ (0x21 ^ 0x41));
        HttpMethod.lIlIlIlllllIIl[12] = (0xE7 ^ 0x92 ^ (0x0 ^ 0x79));
        HttpMethod.lIlIlIlllllIIl[13] = (0x96 ^ 0x9B);
        HttpMethod.lIlIlIlllllIIl[14] = (0x79 ^ 0x13 ^ (0x36 ^ 0x52));
    }
    
    private static boolean lllIlllllllIIll(final int lllllllllllllIIIIllllIIlIllIlllI) {
        return lllllllllllllIIIIllllIIlIllIlllI != 0;
    }
    
    private static void lllIlllllllIIII() {
        (lIlIlIlllllIII = new String[HttpMethod.lIlIlIlllllIIl[14]])[HttpMethod.lIlIlIlllllIIl[0]] = lllIllllllIllIl("B+Zly6+97Jw=", "YmdlP");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[1]] = lllIllllllIlllI("vv9JoRvnO7VmP+Q7W8D5DQ==", "WijIA");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[2]] = lllIllllllIllIl("i0Pktur9yG8=", "pqtBs");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[3]] = lllIllllllIllIl("Bzk386ZSprVlwXPLVx1Cdg==", "uwWXm");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[4]] = lllIllllllIlllI("OwZAtipAvJY1jumh7w5pyYgehFD4g2WaMNUUZSBRHU0=", "UieqF");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[5]] = lllIllllllIlllI("alMRsu9iVpc=", "MPcFY");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[6]] = lllIllllllIlllI("4f15OsY+X7k=", "YCLse");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[7]] = lllIllllllIllll("OAAqFg==", "pEkRM");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[8]] = lllIllllllIllll("KDoSDA==", "xuAXo");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[9]] = lllIllllllIllIl("tGiqcWVBSd8=", "IlJQf");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[10]] = lllIllllllIlllI("kc4YrnwtC9o=", "WxMiX");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[11]] = lllIllllllIlllI("LlXFbRb5oOw=", "WBswX");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[12]] = lllIllllllIlllI("kuXiB7U11cU=", "znUXV");
        HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[13]] = lllIllllllIllll("CAYtFCwIHQ==", "KIcZi");
    }
    
    public String name() {
        return this.name;
    }
    
    static {
        lllIlllllllIIIl();
        lllIlllllllIIII();
        OPTIONS = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[5]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        GET = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[6]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        HEAD = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[7]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        POST = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[8]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        PUT = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[9]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        PATCH = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[10]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        DELETE = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[11]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        TRACE = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[12]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        CONNECT = new HttpMethod(HttpMethod.lIlIlIlllllIII[HttpMethod.lIlIlIlllllIIl[13]], (boolean)(HttpMethod.lIlIlIlllllIIl[1] != 0));
        (methodMap = new HashMap<String, HttpMethod>()).put(HttpMethod.OPTIONS.toString(), HttpMethod.OPTIONS);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.GET.toString(), HttpMethod.GET);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.HEAD.toString(), HttpMethod.HEAD);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.POST.toString(), HttpMethod.POST);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.PUT.toString(), HttpMethod.PUT);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.PATCH.toString(), HttpMethod.PATCH);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.DELETE.toString(), HttpMethod.DELETE);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.TRACE.toString(), HttpMethod.TRACE);
        "".length();
        HttpMethod.methodMap.put(HttpMethod.CONNECT.toString(), HttpMethod.CONNECT);
        "".length();
    }
    
    private static String lllIllllllIllIl(final String lllllllllllllIIIIllllIIlIlllllIl, final String lllllllllllllIIIIllllIIlIllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIIllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIIlIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllllIIlIlllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllllIIlIlllllll.init(HttpMethod.lIlIlIlllllIIl[2], lllllllllllllIIIIllllIIllIIIIIII);
            return new String(lllllllllllllIIIIllllIIlIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIIlIllllllI) {
            lllllllllllllIIIIllllIIlIllllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return this.name();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIIllllIIlllIIIIll) {
        if (lllIlllllllIllI((lllllllllllllIIIIllllIIlllIIIIll instanceof HttpMethod) ? 1 : 0)) {
            return HttpMethod.lIlIlIlllllIIl[0] != 0;
        }
        final HttpMethod lllllllllllllIIIIllllIIlllIIIIlI = (HttpMethod)lllllllllllllIIIIllllIIlllIIIIll;
        return this.name().equals(lllllllllllllIIIIllllIIlllIIIIlI.name());
    }
    
    @Override
    public int hashCode() {
        return this.name().hashCode();
    }
    
    @Override
    public int compareTo(final HttpMethod lllllllllllllIIIIllllIIllIllIllI) {
        return this.name().compareTo(lllllllllllllIIIIllllIIllIllIllI.name());
    }
    
    private static boolean lllIlllllllIIlI(final Object lllllllllllllIIIIllllIIlIlllIIII) {
        return lllllllllllllIIIIllllIIlIlllIIII == null;
    }
    
    private static String lllIllllllIllll(String lllllllllllllIIIIllllIIllIIIllIl, final String lllllllllllllIIIIllllIIllIIlIIIl) {
        lllllllllllllIIIIllllIIllIIIllIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllllIIllIIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllllIIllIIlIIII = new StringBuilder();
        final char[] lllllllllllllIIIIllllIIllIIIllll = lllllllllllllIIIIllllIIllIIlIIIl.toCharArray();
        int lllllllllllllIIIIllllIIllIIIlllI = HttpMethod.lIlIlIlllllIIl[0];
        final char lllllllllllllIIIIllllIIllIIIlIII = (Object)((String)lllllllllllllIIIIllllIIllIIIllIl).toCharArray();
        final long lllllllllllllIIIIllllIIllIIIIlll = lllllllllllllIIIIllllIIllIIIlIII.length;
        String lllllllllllllIIIIllllIIllIIIIllI = (String)HttpMethod.lIlIlIlllllIIl[0];
        while (lllIlllllllIlIl((int)lllllllllllllIIIIllllIIllIIIIllI, (int)lllllllllllllIIIIllllIIllIIIIlll)) {
            final char lllllllllllllIIIIllllIIllIIlIIll = lllllllllllllIIIIllllIIllIIIlIII[lllllllllllllIIIIllllIIllIIIIllI];
            lllllllllllllIIIIllllIIllIIlIIII.append((char)(lllllllllllllIIIIllllIIllIIlIIll ^ lllllllllllllIIIIllllIIllIIIllll[lllllllllllllIIIIllllIIllIIIlllI % lllllllllllllIIIIllllIIllIIIllll.length]));
            "".length();
            ++lllllllllllllIIIIllllIIllIIIlllI;
            ++lllllllllllllIIIIllllIIllIIIIllI;
            "".length();
            if ((0x4E ^ 0xE ^ (0xC1 ^ 0x84)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllllIIllIIlIIII);
    }
    
    private static boolean lllIlllllllIllI(final int lllllllllllllIIIIllllIIlIllIllII) {
        return lllllllllllllIIIIllllIIlIllIllII == 0;
    }
    
    public HttpMethod(final String lllllllllllllIIIIllllIIlllIllIlI) {
        this(lllllllllllllIIIIllllIIlllIllIlI, (boolean)(HttpMethod.lIlIlIlllllIIl[0] != 0));
    }
    
    void encode(final ByteBuf lllllllllllllIIIIllllIIllIllIIlI) {
        if (lllIlllllllIIlI(this.bytes)) {
            HttpHeaders.encodeAscii0(this.name, lllllllllllllIIIIllllIIllIllIIlI);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllllIIllIllIIlI.writeBytes(this.bytes);
            "".length();
        }
    }
    
    private static boolean lllIlllllllIlII(final Object lllllllllllllIIIIllllIIlIlllIIlI) {
        return lllllllllllllIIIIllllIIlIlllIIlI != null;
    }
    
    private static boolean lllIlllllllIlIl(final int lllllllllllllIIIIllllIIlIlllIlIl, final int lllllllllllllIIIIllllIIlIlllIlII) {
        return lllllllllllllIIIIllllIIlIlllIlIl < lllllllllllllIIIIllllIIlIlllIlII;
    }
    
    private static String lllIllllllIlllI(final String lllllllllllllIIIIllllIIllIlIIIII, final String lllllllllllllIIIIllllIIllIlIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllllIIllIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllllIIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), HttpMethod.lIlIlIlllllIIl[8]), "DES");
            final Cipher lllllllllllllIIIIllllIIllIlIIlII = Cipher.getInstance("DES");
            lllllllllllllIIIIllllIIllIlIIlII.init(HttpMethod.lIlIlIlllllIIl[2], lllllllllllllIIIIllllIIllIlIIlIl);
            return new String(lllllllllllllIIIIllllIIllIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllllIIllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllllIIllIlIIIll) {
            lllllllllllllIIIIllllIIllIlIIIll.printStackTrace();
            return null;
        }
    }
}
