// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SpdyStreamStatus implements Comparable<SpdyStreamStatus>
{
    public static final /* synthetic */ SpdyStreamStatus FRAME_TOO_LARGE;
    private static final /* synthetic */ int[] lIllIIIllIllIl;
    public static final /* synthetic */ SpdyStreamStatus INVALID_STREAM;
    private final /* synthetic */ String statusPhrase;
    public static final /* synthetic */ SpdyStreamStatus STREAM_IN_USE;
    public static final /* synthetic */ SpdyStreamStatus INVALID_CREDENTIALS;
    public static final /* synthetic */ SpdyStreamStatus PROTOCOL_ERROR;
    private static final /* synthetic */ String[] lIllIIIllIlIlI;
    public static final /* synthetic */ SpdyStreamStatus UNSUPPORTED_VERSION;
    public static final /* synthetic */ SpdyStreamStatus CANCEL;
    public static final /* synthetic */ SpdyStreamStatus REFUSED_STREAM;
    private final /* synthetic */ int code;
    public static final /* synthetic */ SpdyStreamStatus STREAM_ALREADY_CLOSED;
    public static final /* synthetic */ SpdyStreamStatus FLOW_CONTROL_ERROR;
    public static final /* synthetic */ SpdyStreamStatus INTERNAL_ERROR;
    
    static {
        lllllIIIllllIlI();
        lllllIIIlllIIlI();
        PROTOCOL_ERROR = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[1], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[5]]);
        INVALID_STREAM = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[3], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[6]]);
        REFUSED_STREAM = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[4], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[7]]);
        UNSUPPORTED_VERSION = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[5], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[8]]);
        CANCEL = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[6], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[9]]);
        INTERNAL_ERROR = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[7], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[10]]);
        FLOW_CONTROL_ERROR = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[8], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[11]]);
        STREAM_IN_USE = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[9], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[12]]);
        STREAM_ALREADY_CLOSED = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[10], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[13]]);
        INVALID_CREDENTIALS = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[11], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[14]]);
        FRAME_TOO_LARGE = new SpdyStreamStatus(SpdyStreamStatus.lIllIIIllIllIl[12], SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[15]]);
    }
    
    private static boolean lllllIIIlllllII(final Object lllllllllllllIIIIIlIlIIIllIlIIIl) {
        return lllllllllllllIIIIIlIlIIIllIlIIIl == null;
    }
    
    private static String lllllIIIlllIIII(final String lllllllllllllIIIIIlIlIIlIIIIIlIl, final String lllllllllllllIIIIIlIlIIlIIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIIlIIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), SpdyStreamStatus.lIllIIIllIllIl[9]), "DES");
            final Cipher lllllllllllllIIIIIlIlIIlIIIIIlll = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIlIIlIIIIIlll.init(SpdyStreamStatus.lIllIIIllIllIl[3], lllllllllllllIIIIIlIlIIlIIIIlIII);
            return new String(lllllllllllllIIIIIlIlIIlIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIIlIIIIIllI) {
            lllllllllllllIIIIIlIlIIlIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIIIllIllll(final String lllllllllllllIIIIIlIlIIIllIllllI, final String lllllllllllllIIIIIlIlIIIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIlIIIlllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIlIIIlllIIIlI.init(SpdyStreamStatus.lIllIIIllIllIl[3], lllllllllllllIIIIIlIlIIIlllIIIll);
            return new String(lllllllllllllIIIIIlIlIIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIIIlllIIIIl) {
            lllllllllllllIIIIIlIlIIIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    public SpdyStreamStatus(final int lllllllllllllIIIIIlIlIIlIIlIllll, final String lllllllllllllIIIIIlIlIIlIIlIlIll) {
        if (lllllIIIllllIll(lllllllllllllIIIIIlIlIIlIIlIllll)) {
            throw new IllegalArgumentException(SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[3]]);
        }
        if (lllllIIIlllllII(lllllllllllllIIIIIlIlIIlIIlIlIll)) {
            throw new NullPointerException(SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[4]]);
        }
        this.code = lllllllllllllIIIIIlIlIIlIIlIllll;
        this.statusPhrase = lllllllllllllIIIIIlIlIIlIIlIlIll;
    }
    
    @Override
    public int hashCode() {
        return this.code();
    }
    
    private static boolean lllllIIIllllIll(final int lllllllllllllIIIIIlIlIIIllIIllll) {
        return lllllllllllllIIIIIlIlIIIllIIllll == 0;
    }
    
    private static boolean lllllIIIlllllIl(final int lllllllllllllIIIIIlIlIIIllIllIII, final int lllllllllllllIIIIIlIlIIIllIlIlll) {
        return lllllllllllllIIIIIlIlIIIllIllIII == lllllllllllllIIIIIlIlIIIllIlIlll;
    }
    
    private static void lllllIIIllllIlI() {
        (lIllIIIllIllIl = new int[17])[0] = (("  ".length() ^ (0x7B ^ 0x2A)) & (0x3F ^ 0x49 ^ (0x21 ^ 0x4) ^ -" ".length()));
        SpdyStreamStatus.lIllIIIllIllIl[1] = " ".length();
        SpdyStreamStatus.lIllIIIllIllIl[2] = (0xE3 ^ 0x9F ^ (0xD5 ^ 0x80));
        SpdyStreamStatus.lIllIIIllIllIl[3] = "  ".length();
        SpdyStreamStatus.lIllIIIllIllIl[4] = "   ".length();
        SpdyStreamStatus.lIllIIIllIllIl[5] = (0x86 ^ 0x82);
        SpdyStreamStatus.lIllIIIllIllIl[6] = (0x83 ^ 0x86);
        SpdyStreamStatus.lIllIIIllIllIl[7] = (0x58 ^ 0x5E);
        SpdyStreamStatus.lIllIIIllIllIl[8] = (0x8E ^ 0x89);
        SpdyStreamStatus.lIllIIIllIllIl[9] = (0x86 ^ 0xB0 ^ (0xAB ^ 0x95));
        SpdyStreamStatus.lIllIIIllIllIl[10] = (148 + 102 - 230 + 131 ^ 154 + 115 - 148 + 37);
        SpdyStreamStatus.lIllIIIllIllIl[11] = (70 + 33 - 60 + 118 ^ 75 + 119 - 97 + 74);
        SpdyStreamStatus.lIllIIIllIllIl[12] = (0xC4 ^ 0x97 ^ (0x9C ^ 0xC4));
        SpdyStreamStatus.lIllIIIllIllIl[13] = (0x71 ^ 0x7C ^ " ".length());
        SpdyStreamStatus.lIllIIIllIllIl[14] = (0xFE ^ 0x9D ^ (0xCE ^ 0xA0));
        SpdyStreamStatus.lIllIIIllIllIl[15] = (101 + 89 - 89 + 73 ^ 57 + 89 - 30 + 44);
        SpdyStreamStatus.lIllIIIllIllIl[16] = (0x41 ^ 0x4E);
    }
    
    private static boolean lllllIIIllllllI(final int lllllllllllllIIIIIlIlIIIllIlIlII, final int lllllllllllllIIIIIlIlIIIllIlIIll) {
        return lllllllllllllIIIIIlIlIIIllIlIlII < lllllllllllllIIIIIlIlIIIllIlIIll;
    }
    
    @Override
    public int compareTo(final SpdyStreamStatus lllllllllllllIIIIIlIlIIlIIIlIlIl) {
        return this.code() - lllllllllllllIIIIIlIlIIlIIIlIlIl.code();
    }
    
    public String statusPhrase() {
        return this.statusPhrase;
    }
    
    public static SpdyStreamStatus valueOf(final int lllllllllllllIIIIIlIlIIlIIllIlIl) {
        if (lllllIIIllllIll(lllllllllllllIIIIIlIlIIlIIllIlIl)) {
            throw new IllegalArgumentException(SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[0]]);
        }
        switch (lllllllllllllIIIIIlIlIIlIIllIlIl) {
            case 1: {
                return SpdyStreamStatus.PROTOCOL_ERROR;
            }
            case 2: {
                return SpdyStreamStatus.INVALID_STREAM;
            }
            case 3: {
                return SpdyStreamStatus.REFUSED_STREAM;
            }
            case 4: {
                return SpdyStreamStatus.UNSUPPORTED_VERSION;
            }
            case 5: {
                return SpdyStreamStatus.CANCEL;
            }
            case 6: {
                return SpdyStreamStatus.INTERNAL_ERROR;
            }
            case 7: {
                return SpdyStreamStatus.FLOW_CONTROL_ERROR;
            }
            case 8: {
                return SpdyStreamStatus.STREAM_IN_USE;
            }
            case 9: {
                return SpdyStreamStatus.STREAM_ALREADY_CLOSED;
            }
            case 10: {
                return SpdyStreamStatus.INVALID_CREDENTIALS;
            }
            case 11: {
                return SpdyStreamStatus.FRAME_TOO_LARGE;
            }
            default: {
                return new SpdyStreamStatus(lllllllllllllIIIIIlIlIIlIIllIlIl, String.valueOf(new StringBuilder().append(SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[1]]).append(lllllllllllllIIIIIlIlIIlIIllIlIl).append((char)SpdyStreamStatus.lIllIIIllIllIl[2])));
            }
        }
    }
    
    @Override
    public String toString() {
        return this.statusPhrase();
    }
    
    private static void lllllIIIlllIIlI() {
        (lIllIIIllIlIlI = new String[SpdyStreamStatus.lIllIIIllIllIl[16]])[SpdyStreamStatus.lIllIIIllIllIl[0]] = lllllIIIllIllll("ulS/RTT02QoTP2tWGYoHEyUI79/CbZ3dRpMl2CDtYJy7flBjeHPrc8ybrNF9I7Kt", "QrZUi");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[1]] = lllllIIIllIllll("vELBFuGcGjFfG6O9r+IhwA==", "IqryZ");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[3]] = lllllIIIlllIIII("0+mTJC4Q2ZO2QdeX3kHz3b2XfVrgBSoSXA7JDlg/rkIl0tUumQIwqE0QC+EiCfoO", "OxXcl");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[4]] = lllllIIIlllIIIl("FhgTARgWPBoHDBYJ", "elrum");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[5]] = lllllIIIlllIIII("EWWWFdbjumHKMti0J1A5mQ==", "rYoQV");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[6]] = lllllIIIlllIIIl("LyQsFS0vLiUHNTQvOxk=", "fjzTa");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[7]] = lllllIIIlllIIII("yqvQI6gTjqSA5KBQjkn+DQ==", "smMop");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[8]] = lllllIIIllIllll("UFh2KKBpNnBbI4BodES7CwUjCVcgzpsB", "zGFhN");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[9]] = lllllIIIllIllll("+X1GX87jZpQ=", "azwGS");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[10]] = lllllIIIllIllll("QyMLvK+ydY8Sb562vzkhvA==", "OoYsd");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[11]] = lllllIIIlllIIII("PkcbBU9xlnPiTmZi95w87BLRnaI9NjQ0", "FkNHz");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[12]] = lllllIIIlllIIIl("ES0cIBEPJgcrDxcqCw==", "ByNeP");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[13]] = lllllIIIlllIIII("9sLrXckyXJPDA0ictghY5udaAPvmZEm0", "ebigq");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[14]] = lllllIIIlllIIIl("BCI+Fh0EKDcUAwgoLRkFBC0kBA==", "MlhWQ");
        SpdyStreamStatus.lIllIIIllIlIlI[SpdyStreamStatus.lIllIIIllIllIl[15]] = lllllIIIlllIIII("QPC98vOfjSW25JAxkIKkMw==", "OGujT");
    }
    
    private static String lllllIIIlllIIIl(String lllllllllllllIIIIIlIlIIIllllIIII, final String lllllllllllllIIIIIlIlIIIlllIllll) {
        lllllllllllllIIIIIlIlIIIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIlIIIllllIIll = new StringBuilder();
        final char[] lllllllllllllIIIIIlIlIIIllllIIlI = lllllllllllllIIIIIlIlIIIlllIllll.toCharArray();
        int lllllllllllllIIIIIlIlIIIllllIIIl = SpdyStreamStatus.lIllIIIllIllIl[0];
        final double lllllllllllllIIIIIlIlIIIlllIlIll = (Object)lllllllllllllIIIIIlIlIIIllllIIII.toCharArray();
        final float lllllllllllllIIIIIlIlIIIlllIlIlI = lllllllllllllIIIIIlIlIIIlllIlIll.length;
        float lllllllllllllIIIIIlIlIIIlllIlIIl = SpdyStreamStatus.lIllIIIllIllIl[0];
        while (lllllIIIllllllI((int)lllllllllllllIIIIIlIlIIIlllIlIIl, (int)lllllllllllllIIIIIlIlIIIlllIlIlI)) {
            final char lllllllllllllIIIIIlIlIIIllllIllI = lllllllllllllIIIIIlIlIIIlllIlIll[lllllllllllllIIIIIlIlIIIlllIlIIl];
            lllllllllllllIIIIIlIlIIIllllIIll.append((char)(lllllllllllllIIIIIlIlIIIllllIllI ^ lllllllllllllIIIIIlIlIIIllllIIlI[lllllllllllllIIIIIlIlIIIllllIIIl % lllllllllllllIIIIIlIlIIIllllIIlI.length]));
            "".length();
            ++lllllllllllllIIIIIlIlIIIllllIIIl;
            ++lllllllllllllIIIIIlIlIIIlllIlIIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIlIIIllllIIll);
    }
    
    public int code() {
        return this.code;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIIIlIlIIlIIIllllI) {
        if (lllllIIIllllIll((lllllllllllllIIIIIlIlIIlIIIllllI instanceof SpdyStreamStatus) ? 1 : 0)) {
            return SpdyStreamStatus.lIllIIIllIllIl[0] != 0;
        }
        int n;
        if (lllllIIIlllllIl(this.code(), ((SpdyStreamStatus)lllllllllllllIIIIIlIlIIlIIIllllI).code())) {
            n = SpdyStreamStatus.lIllIIIllIllIl[1];
            "".length();
            if (" ".length() != " ".length()) {
                return ((0xA7 ^ 0xA0) & ~(0x2F ^ 0x28)) != 0x0;
            }
        }
        else {
            n = SpdyStreamStatus.lIllIIIllIllIl[0];
        }
        return n != 0;
    }
}
