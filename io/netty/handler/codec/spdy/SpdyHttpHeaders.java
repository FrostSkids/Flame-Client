// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMessage;

public final class SpdyHttpHeaders
{
    private static final /* synthetic */ String[] lIlIlIlIlIlllI;
    private static final /* synthetic */ int[] lIlIlIlIllllIl;
    
    public static byte getPriority(final HttpMessage lllllllllllllIIIlIIIIIIlllIlIlll) {
        return (byte)HttpHeaders.getIntHeader(lllllllllllllIIIlIIIIIIlllIlIlll, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[7]], SpdyHttpHeaders.lIlIlIlIllllIl[0]);
    }
    
    public static String getUrl(final HttpMessage lllllllllllllIIIlIIIIIIlllIIlIll) {
        return lllllllllllllIIIlIIIIIIlllIIlIll.headers().get(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[10]]);
    }
    
    static {
        lllIlllIllIIlll();
        lllIlllIlIlIIII();
    }
    
    public static String getScheme(final HttpMessage lllllllllllllIIIlIIIIIIlllIIIIII) {
        return lllllllllllllIIIlIIIIIIlllIIIIII.headers().get(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[13]]);
    }
    
    private static void lllIlllIlIlIIII() {
        (lIlIlIlIlIlllI = new String[SpdyHttpHeaders.lIlIlIlIllllIl[15]])[SpdyHttpHeaders.lIlIlIlIllllIl[0]] = lllIlllIlIIIllI("jqauiA/CsuBBeo8/EjbAVSKHdiLJWFas", "XDdpz");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[1]] = lllIlllIlIIIlll("GmwnJjwbbCcCCicgGVsxBg==", "BAtvx");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[2]] = lllIlllIlIIIllI("71f1X/ibBLBzRP2DNPPY39ZUSOZ54q1l", "PaHpY");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[3]] = lllIlllIlIIIllI("r8Da2YSDLXm/ogPY/47pae2fd3Dt8lVQ9/EoyiMHYsA=", "rYdxA");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[4]] = lllIlllIlIIIlll("AXwnCRYAfDUqITYyHTgmPDVZDT10AgArNzg8WRAW", "YQtYR");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[5]] = lllIlllIlIIIlll("KV4WFgsoXgQ1PB4QLCc7FBdoEiBcIDE0KhAeaA8L", "qsEFO");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[6]] = lllIlllIlIIIlll("IHQ4Iw8hdDsBIhcrAgcy", "xYksK");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[7]] = lllIlllIlIIIlll("N0EwGw42QTM5IwAeCj8z", "olcKJ");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[8]] = lllIlllIlIIIlll("EX0lEywQfSYxASYiHzcR", "IPvCh");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[9]] = lllIlllIlIIllll("iAj2BV2fwa3KSmRJsLrdQg==", "yLJOt");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[10]] = lllIlllIlIIIlll("EmU5AQETZT8DCQ==", "JHjQE");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[11]] = lllIlllIlIIllll("KtsdJX+eX3sAQ4tZgm7gtg==", "BLVni");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[12]] = lllIlllIlIIIlll("CWkVPSsIaRUOBzQpIw==", "QDFmo");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[13]] = lllIlllIlIIIllI("3qMqZDLswN6EIcpRzci4Fw==", "gNYrD");
        SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[14]] = lllIlllIlIIIllI("P07mT3I85Ppx39MqCstgoQ==", "bswQu");
    }
    
    public static int getStreamId(final HttpMessage lllllllllllllIIIlIIIIIIllllIllll) {
        return HttpHeaders.getIntHeader(lllllllllllllIIIlIIIIIIllllIllll, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[1]]);
    }
    
    public static void removeAssociatedToStreamId(final HttpMessage lllllllllllllIIIlIIIIIIllllIIllI) {
        lllllllllllllIIIlIIIIIIllllIIllI.headers().remove(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[3]]);
        "".length();
    }
    
    private static boolean lllIlllIllIlIII(final int lllllllllllllIIIlIIIIIIllIIIIlII, final int lllllllllllllIIIlIIIIIIllIIIIIll) {
        return lllllllllllllIIIlIIIIIIllIIIIlII < lllllllllllllIIIlIIIIIIllIIIIIll;
    }
    
    public static void setUrl(final HttpMessage lllllllllllllIIIlIIIIIIlllIIlIII, final String lllllllllllllIIIlIIIIIIlllIIIlIl) {
        lllllllllllllIIIlIIIIIIlllIIlIII.headers().set(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[11]], lllllllllllllIIIlIIIIIIlllIIIlIl);
        "".length();
    }
    
    public static void setPriority(final HttpMessage lllllllllllllIIIlIIIIIIlllIlIlII, final byte lllllllllllllIIIlIIIIIIlllIlIIIl) {
        HttpHeaders.setIntHeader(lllllllllllllIIIlIIIIIIlllIlIlII, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[8]], lllllllllllllIIIlIIIIIIlllIlIIIl);
    }
    
    public static void removeUrl(final HttpMessage lllllllllllllIIIlIIIIIIlllIIlllI) {
        lllllllllllllIIIlIIIIIIlllIIlllI.headers().remove(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[9]]);
        "".length();
    }
    
    private SpdyHttpHeaders() {
    }
    
    private static String lllIlllIlIIIlll(String lllllllllllllIIIlIIIIIIllIlIlIIl, final String lllllllllllllIIIlIIIIIIllIlIllIl) {
        lllllllllllllIIIlIIIIIIllIlIlIIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIIIllIlIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIIIllIlIllII = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIIIllIlIlIll = lllllllllllllIIIlIIIIIIllIlIllIl.toCharArray();
        int lllllllllllllIIIlIIIIIIllIlIlIlI = SpdyHttpHeaders.lIlIlIlIllllIl[0];
        final long lllllllllllllIIIlIIIIIIllIlIIlII = (Object)((String)lllllllllllllIIIlIIIIIIllIlIlIIl).toCharArray();
        final char lllllllllllllIIIlIIIIIIllIlIIIll = (char)lllllllllllllIIIlIIIIIIllIlIIlII.length;
        boolean lllllllllllllIIIlIIIIIIllIlIIIlI = SpdyHttpHeaders.lIlIlIlIllllIl[0] != 0;
        while (lllIlllIllIlIII(lllllllllllllIIIlIIIIIIllIlIIIlI ? 1 : 0, lllllllllllllIIIlIIIIIIllIlIIIll)) {
            final char lllllllllllllIIIlIIIIIIllIlIllll = lllllllllllllIIIlIIIIIIllIlIIlII[lllllllllllllIIIlIIIIIIllIlIIIlI];
            lllllllllllllIIIlIIIIIIllIlIllII.append((char)(lllllllllllllIIIlIIIIIIllIlIllll ^ lllllllllllllIIIlIIIIIIllIlIlIll[lllllllllllllIIIlIIIIIIllIlIlIlI % lllllllllllllIIIlIIIIIIllIlIlIll.length]));
            "".length();
            ++lllllllllllllIIIlIIIIIIllIlIlIlI;
            ++lllllllllllllIIIlIIIIIIllIlIIIlI;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIIIllIlIllII);
    }
    
    public static void removeScheme(final HttpMessage lllllllllllllIIIlIIIIIIlllIIIIll) {
        lllllllllllllIIIlIIIIIIlllIIIIll.headers().remove(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[12]]);
        "".length();
    }
    
    public static void setAssociatedToStreamId(final HttpMessage lllllllllllllIIIlIIIIIIlllIllllI, final int lllllllllllllIIIlIIIIIIlllIlllIl) {
        HttpHeaders.setIntHeader(lllllllllllllIIIlIIIIIIlllIllllI, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[5]], lllllllllllllIIIlIIIIIIlllIlllIl);
    }
    
    private static String lllIlllIlIIIllI(final String lllllllllllllIIIlIIIIIIllIIIllII, final String lllllllllllllIIIlIIIIIIllIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), SpdyHttpHeaders.lIlIlIlIllllIl[8]), "DES");
            final Cipher lllllllllllllIIIlIIIIIIllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIIllIIIlllI.init(SpdyHttpHeaders.lIlIlIlIllllIl[2], lllllllllllllIIIlIIIIIIllIIIllll);
            return new String(lllllllllllllIIIlIIIIIIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIllIIIllIl) {
            lllllllllllllIIIlIIIIIIllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public static void removeStreamId(final HttpMessage lllllllllllllIIIlIIIIIIlllllIIlI) {
        lllllllllllllIIIlIIIIIIlllllIIlI.headers().remove(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[0]]);
        "".length();
    }
    
    private static String lllIlllIlIIllll(final String lllllllllllllIIIlIIIIIIllIIllIIl, final String lllllllllllllIIIlIIIIIIllIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIIIllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIIIllIIllIll.init(SpdyHttpHeaders.lIlIlIlIllllIl[2], lllllllllllllIIIlIIIIIIllIIlllII);
            return new String(lllllllllllllIIIlIIIIIIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIllIIllIlI) {
            lllllllllllllIIIlIIIIIIllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    public static void setScheme(final HttpMessage lllllllllllllIIIlIIIIIIllIlllIlI, final String lllllllllllllIIIlIIIIIIllIlllIIl) {
        lllllllllllllIIIlIIIIIIllIlllIlI.headers().set(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[14]], lllllllllllllIIIlIIIIIIllIlllIIl);
        "".length();
    }
    
    public static void setStreamId(final HttpMessage lllllllllllllIIIlIIIIIIllllIllII, final int lllllllllllllIIIlIIIIIIllllIlIll) {
        HttpHeaders.setIntHeader(lllllllllllllIIIlIIIIIIllllIllII, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[2]], lllllllllllllIIIlIIIIIIllllIlIll);
    }
    
    private static void lllIlllIllIIlll() {
        (lIlIlIlIllllIl = new int[16])[0] = ((0x4 ^ 0x5B ^ (0x4D ^ 0x9)) & (94 + 48 - 78 + 100 ^ 14 + 100 - 57 + 134 ^ -" ".length()));
        SpdyHttpHeaders.lIlIlIlIllllIl[1] = " ".length();
        SpdyHttpHeaders.lIlIlIlIllllIl[2] = "  ".length();
        SpdyHttpHeaders.lIlIlIlIllllIl[3] = "   ".length();
        SpdyHttpHeaders.lIlIlIlIllllIl[4] = (0xF4 ^ 0xA1 ^ (0xD4 ^ 0x85));
        SpdyHttpHeaders.lIlIlIlIllllIl[5] = (93 + 106 - 164 + 116 ^ 79 + 104 - 65 + 28);
        SpdyHttpHeaders.lIlIlIlIllllIl[6] = (0x67 ^ 0x6F ^ (0xB4 ^ 0xBA));
        SpdyHttpHeaders.lIlIlIlIllllIl[7] = (63 + 72 - 106 + 123 ^ 148 + 154 - 200 + 57);
        SpdyHttpHeaders.lIlIlIlIllllIl[8] = (0x5E ^ 0x56);
        SpdyHttpHeaders.lIlIlIlIllllIl[9] = (173 + 10 - 99 + 101 ^ 83 + 163 - 195 + 125);
        SpdyHttpHeaders.lIlIlIlIllllIl[10] = (101 + 85 - 152 + 152 ^ 62 + 120 - 82 + 76);
        SpdyHttpHeaders.lIlIlIlIllllIl[11] = (0x2D ^ 0x26);
        SpdyHttpHeaders.lIlIlIlIllllIl[12] = (0xF2 ^ 0x97 ^ (0x41 ^ 0x28));
        SpdyHttpHeaders.lIlIlIlIllllIl[13] = (0xA1 ^ 0xAC);
        SpdyHttpHeaders.lIlIlIlIllllIl[14] = (0x24 ^ 0x2A);
        SpdyHttpHeaders.lIlIlIlIllllIl[15] = (0x70 ^ 0x4D ^ (0x83 ^ 0xB1));
    }
    
    public static int getAssociatedToStreamId(final HttpMessage lllllllllllllIIIlIIIIIIllllIIIll) {
        return HttpHeaders.getIntHeader(lllllllllllllIIIlIIIIIIllllIIIll, SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[4]], SpdyHttpHeaders.lIlIlIlIllllIl[0]);
    }
    
    public static void removePriority(final HttpMessage lllllllllllllIIIlIIIIIIlllIllIlI) {
        lllllllllllllIIIlIIIIIIlllIllIlI.headers().remove(SpdyHttpHeaders.lIlIlIlIlIlllI[SpdyHttpHeaders.lIlIlIlIllllIl[6]]);
        "".length();
    }
    
    public static final class Names
    {
        private static final /* synthetic */ String[] lIllllllIllIlI;
        private static final /* synthetic */ int[] lIllllllIllllI;
        
        private static String lIIIIlIllllllIlI(final String llllllllllllIllllIIlIIIIlIIIIIlI, final String llllllllllllIllllIIlIIIIlIIIIIIl) {
            try {
                final SecretKeySpec llllllllllllIllllIIlIIIIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), Names.lIllllllIllllI[6]), "DES");
                final Cipher llllllllllllIllllIIlIIIIlIIIIlII = Cipher.getInstance("DES");
                llllllllllllIllllIIlIIIIlIIIIlII.init(Names.lIllllllIllllI[2], llllllllllllIllllIIlIIIIlIIIIlIl);
                return new String(llllllllllllIllllIIlIIIIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIlIIIIlIIIIIll) {
                llllllllllllIllllIIlIIIIlIIIIIll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIlIllllllIll(final String llllllllllllIllllIIlIIIIlIIIllIl, final String llllllllllllIllllIIlIIIIlIIIllII) {
            try {
                final SecretKeySpec llllllllllllIllllIIlIIIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIIIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIIlIIIIlIIlIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIIlIIIIlIIlIIIl.init(Names.lIllllllIllllI[2], llllllllllllIllllIIlIIIIlIIlIIlI);
                return new String(llllllllllllIllllIIlIIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIlIIIIlIIlIIII) {
                llllllllllllIllllIIlIIIIlIIlIIII.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIIlIlllllllII(String llllllllllllIllllIIlIIIIlIIlllll, final String llllllllllllIllllIIlIIIIlIIllllI) {
            llllllllllllIllllIIlIIIIlIIlllll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlIIIIlIIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIIlIIIIlIlIIIlI = new StringBuilder();
            final char[] llllllllllllIllllIIlIIIIlIlIIIIl = llllllllllllIllllIIlIIIIlIIllllI.toCharArray();
            int llllllllllllIllllIIlIIIIlIlIIIII = Names.lIllllllIllllI[0];
            final char llllllllllllIllllIIlIIIIlIIllIlI = (Object)((String)llllllllllllIllllIIlIIIIlIIlllll).toCharArray();
            final boolean llllllllllllIllllIIlIIIIlIIllIIl = llllllllllllIllllIIlIIIIlIIllIlI.length != 0;
            double llllllllllllIllllIIlIIIIlIIllIII = Names.lIllllllIllllI[0];
            while (lIIIIllIIIIIIIll((int)llllllllllllIllllIIlIIIIlIIllIII, llllllllllllIllllIIlIIIIlIIllIIl ? 1 : 0)) {
                final char llllllllllllIllllIIlIIIIlIlIIlIl = llllllllllllIllllIIlIIIIlIIllIlI[llllllllllllIllllIIlIIIIlIIllIII];
                llllllllllllIllllIIlIIIIlIlIIIlI.append((char)(llllllllllllIllllIIlIIIIlIlIIlIl ^ llllllllllllIllllIIlIIIIlIlIIIIl[llllllllllllIllllIIlIIIIlIlIIIII % llllllllllllIllllIIlIIIIlIlIIIIl.length]));
                "".length();
                ++llllllllllllIllllIIlIIIIlIlIIIII;
                ++llllllllllllIllllIIlIIIIlIIllIII;
                "".length();
                if (-" ".length() > "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIIlIIIIlIlIIIlI);
        }
        
        private Names() {
        }
        
        private static void lIIIIlIlllllllIl() {
            (lIllllllIllIlI = new String[Names.lIllllllIllllI[5]])[Names.lIllllllIllllI[0]] = lIIIIlIllllllIlI("zQLpEMYDV5BMS4caUy4jrw==", "ujWXx");
            Names.lIllllllIllIlI[Names.lIllllllIllllI[1]] = lIIIIlIllllllIlI("yT0q7PGBXRTlvpjhreAtnw==", "amoqx");
            Names.lIllllllIllIlI[Names.lIllllllIllllI[2]] = lIIIIlIllllllIll("zAfHTNOM84uxGknccLjDcvcNVfCOjSMxx2WcAwcbRQg=", "IYteR");
            Names.lIllllllIllIlI[Names.lIllllllIllllI[3]] = lIIIIlIllllllIlI("C82rrSjxkQusREP0f8QB8dRGbyPOqD3t", "onPQF");
            Names.lIllllllIllIlI[Names.lIllllllIllllI[4]] = lIIIIlIlllllllII("LX8LAiUsfwggCBogMSYY", "uRXRa");
        }
        
        static {
            lIIIIllIIIIIIIlI();
            lIIIIlIlllllllIl();
            URL = Names.lIllllllIllIlI[Names.lIllllllIllllI[0]];
            SCHEME = Names.lIllllllIllIlI[Names.lIllllllIllllI[1]];
            ASSOCIATED_TO_STREAM_ID = Names.lIllllllIllIlI[Names.lIllllllIllllI[2]];
            STREAM_ID = Names.lIllllllIllIlI[Names.lIllllllIllllI[3]];
            PRIORITY = Names.lIllllllIllIlI[Names.lIllllllIllllI[4]];
        }
        
        private static boolean lIIIIllIIIIIIIll(final int llllllllllllIllllIIlIIIIIllllIlI, final int llllllllllllIllllIIlIIIIIllllIIl) {
            return llllllllllllIllllIIlIIIIIllllIlI < llllllllllllIllllIIlIIIIIllllIIl;
        }
        
        private static void lIIIIllIIIIIIIlI() {
            (lIllllllIllllI = new int[7])[0] = ((0x13 ^ 0x7 ^ (0x60 ^ 0x6B)) & (20 + 40 + 44 + 36 ^ 51 + 83 - 87 + 100 ^ -" ".length()));
            Names.lIllllllIllllI[1] = " ".length();
            Names.lIllllllIllllI[2] = "  ".length();
            Names.lIllllllIllllI[3] = "   ".length();
            Names.lIllllllIllllI[4] = (0x8E ^ 0x8A);
            Names.lIllllllIllllI[5] = (0x9A ^ 0x9F);
            Names.lIllllllIllllI[6] = (0x8C ^ 0x84);
        }
    }
}
