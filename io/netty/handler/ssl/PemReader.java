// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.List;
import java.util.ArrayList;
import java.security.cert.CertificateException;
import java.util.regex.Matcher;
import io.netty.buffer.Unpooled;
import java.security.KeyException;
import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import io.netty.util.internal.logging.InternalLogger;
import java.util.regex.Pattern;

final class PemReader
{
    private static final /* synthetic */ Pattern KEY_PATTERN;
    private static final /* synthetic */ Pattern CERT_PATTERN;
    private static final /* synthetic */ String[] lIlIllIIlllIll;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIlIllIIllllII;
    
    private static void safeClose(final OutputStream lllllllllllllIIIIllIlllIIlIIlIII) {
        try {
            lllllllllllllIIIIllIlllIIlIIlIII.close();
            "".length();
            if (-(0x8C ^ 0x88) > 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIIIllIlllIIlIIlIlI) {
            PemReader.logger.warn(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[6]], lllllllllllllIIIIllIlllIIlIIlIlI);
        }
    }
    
    private static void safeClose(final InputStream lllllllllllllIIIIllIlllIIlIIlllI) {
        try {
            lllllllllllllIIIIllIlllIIlIIlllI.close();
            "".length();
            if (-(0x5C ^ 0x58) > 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIIIllIlllIIlIlIIII) {
            PemReader.logger.warn(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[5]], lllllllllllllIIIIllIlllIIlIlIIII);
        }
    }
    
    static {
        llllIIIlIlIlIIl();
        llllIIIlIlIlIII();
        logger = InternalLoggerFactory.getInstance(PemReader.class);
        CERT_PATTERN = Pattern.compile(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[7]], PemReader.lIlIllIIllllII[2]);
        KEY_PATTERN = Pattern.compile(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[8]], PemReader.lIlIllIIllllII[2]);
    }
    
    private static void llllIIIlIlIlIII() {
        (lIlIllIIlllIll = new String[PemReader.lIlIllIIllllII[9]])[PemReader.lIlIllIIllllII[0]] = llllIIIlIlIIlIl("sdBuyOQt0UIwEL/I5OAfKA9uQsZWZtr0", "qSYPc");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[1]] = llllIIIlIlIIllI("H1pMkA7Nuy+UY0Ute6NA9jlN0XTAS/hb", "kLRIZ");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[2]] = llllIIIlIlIIlll("LiUIIRcsZBUiUjohAClSKWQHJB4tfkE=", "HDaMr");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[3]] = llllIIIlIlIIlll("LhonIRVoGz1vATocJC4FLVU5KghyVQ==", "HuROq");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[5]] = llllIIIlIlIIlIl("F+93bKQL5V2sCczcXbL5k6Bf11uyGl6H0Q+B9/qnSt8=", "xVwUv");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[6]] = llllIIIlIlIIllI("L7RZzJQPP+tO1fs/iZAbaV5q2VxCMKoiq5GsRb7Fzjo=", "aLJIW");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[7]] = llllIIIlIlIIlIl("nUhg9m17vvT6Sb4/PPSgPkVdg3tlonqTMyB0uo4egpEG+8CBg0emVjFvuxI9yq2q/Bq/SrASc+ixTAYMyMkjsJWY9LT6BpSNdltqO/WdQ0t0fpwOsjbLMnvd2PG4ld8w", "SUJOd");
        PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[8]] = llllIIIlIlIIllI("cQ1WtM8opgFaeepIPJawj+2rAtOV+rSv5pt+WgWMF1ITQ4q+73f32UoT5RscNM14+VAn/OVpM4+KYn23IRWYO9foqX4XqZ0J8RhEGfBvln1mPzD7Y3XLGFa4xglWwabO", "nKAso");
    }
    
    private static String llllIIIlIlIIlll(String lllllllllllllIIIIllIlllIIIIllIlI, final String lllllllllllllIIIIllIlllIIIIllIIl) {
        lllllllllllllIIIIllIlllIIIIllIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIlllIIIIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIlllIIIIlllIl = new StringBuilder();
        final char[] lllllllllllllIIIIllIlllIIIIlllII = lllllllllllllIIIIllIlllIIIIllIIl.toCharArray();
        int lllllllllllllIIIIllIlllIIIIllIll = PemReader.lIlIllIIllllII[0];
        final char lllllllllllllIIIIllIlllIIIIlIlIl = (Object)((String)lllllllllllllIIIIllIlllIIIIllIlI).toCharArray();
        final char lllllllllllllIIIIllIlllIIIIlIlII = (char)lllllllllllllIIIIllIlllIIIIlIlIl.length;
        short lllllllllllllIIIIllIlllIIIIlIIll = (short)PemReader.lIlIllIIllllII[0];
        while (llllIIIlIlIllIl(lllllllllllllIIIIllIlllIIIIlIIll, lllllllllllllIIIIllIlllIIIIlIlII)) {
            final char lllllllllllllIIIIllIlllIIIlIIIII = lllllllllllllIIIIllIlllIIIIlIlIl[lllllllllllllIIIIllIlllIIIIlIIll];
            lllllllllllllIIIIllIlllIIIIlllIl.append((char)(lllllllllllllIIIIllIlllIIIlIIIII ^ lllllllllllllIIIIllIlllIIIIlllII[lllllllllllllIIIIllIlllIIIIllIll % lllllllllllllIIIIllIlllIIIIlllII.length]));
            "".length();
            ++lllllllllllllIIIIllIlllIIIIllIll;
            ++lllllllllllllIIIIllIlllIIIIlIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIlllIIIIlllIl);
    }
    
    private PemReader() {
    }
    
    private static void llllIIIlIlIlIIl() {
        (lIlIllIIllllII = new int[10])[0] = ("   ".length() & ~"   ".length());
        PemReader.lIlIllIIllllII[1] = " ".length();
        PemReader.lIlIllIIllllII[2] = "  ".length();
        PemReader.lIlIllIIllllII[3] = "   ".length();
        PemReader.lIlIllIIllllII[4] = (-(0xFFFFFFEF & 0x53B7) & (0xFFFFF3BE & 0x7FE7));
        PemReader.lIlIllIIllllII[5] = (0x2 ^ 0x6);
        PemReader.lIlIllIIllllII[6] = (13 + 29 + 7 + 138 ^ 154 + 66 - 38 + 8);
        PemReader.lIlIllIIllllII[7] = (0x57 ^ 0x2D ^ (0x42 ^ 0x3E));
        PemReader.lIlIllIIllllII[8] = (0x30 ^ 0x37);
        PemReader.lIlIllIIllllII[9] = (0xB ^ 0x3);
    }
    
    private static boolean llllIIIlIlIlIlI(final int lllllllllllllIIIIllIlllIIIIIlIlI) {
        return lllllllllllllIIIIllIlllIIIIIlIlI == 0;
    }
    
    private static String llllIIIlIlIIllI(final String lllllllllllllIIIIllIlllIIIllllII, final String lllllllllllllIIIIllIlllIIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlllIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlllIIIlllIll.getBytes(StandardCharsets.UTF_8)), PemReader.lIlIllIIllllII[9]), "DES");
            final Cipher lllllllllllllIIIIllIlllIIIlllllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlllIIIlllllI.init(PemReader.lIlIllIIllllII[2], lllllllllllllIIIIllIlllIIIllllll);
            return new String(lllllllllllllIIIIllIlllIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlllIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlllIIIllllIl) {
            lllllllllllllIIIIllIlllIIIllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIIlIlIlIll(final int lllllllllllllIIIIllIlllIIIIIllII) {
        return lllllllllllllIIIIllIlllIIIIIllII != 0;
    }
    
    private static String readContent(final File lllllllllllllIIIIllIlllIIlIllIII) throws IOException {
        final InputStream lllllllllllllIIIIllIlllIIlIllIlI = new FileInputStream(lllllllllllllIIIIllIlllIIlIllIII);
        final ByteArrayOutputStream lllllllllllllIIIIllIlllIIlIllIIl = new ByteArrayOutputStream();
        try {
            final byte[] lllllllllllllIIIIllIlllIIlIlllII = new byte[PemReader.lIlIllIIllllII[4]];
            do {
                final int lllllllllllllIIIIllIlllIIlIlllIl = lllllllllllllIIIIllIlllIIlIllIlI.read(lllllllllllllIIIIllIlllIIlIlllII);
                if (llllIIIlIlIllII(lllllllllllllIIIIllIlllIIlIlllIl)) {
                    "".length();
                    if (((0x7A ^ 0x41) & ~(0x57 ^ 0x6C)) > "   ".length()) {
                        return null;
                    }
                    return lllllllllllllIIIIllIlllIIlIllIIl.toString(CharsetUtil.US_ASCII.name());
                }
                else {
                    lllllllllllllIIIIllIlllIIlIllIIl.write(lllllllllllllIIIIllIlllIIlIlllII, PemReader.lIlIllIIllllII[0], lllllllllllllIIIIllIlllIIlIlllIl);
                    "".length();
                }
            } while (null == null);
            return null;
        }
        finally {
            safeClose(lllllllllllllIIIIllIlllIIlIllIlI);
            safeClose(lllllllllllllIIIIllIlllIIlIllIIl);
        }
    }
    
    static ByteBuf readPrivateKey(final File lllllllllllllIIIIllIlllIIllIlIII) throws KeyException {
        String lllllllllllllIIIIllIlllIIllIllII;
        try {
            lllllllllllllIIIIllIlllIIllIllII = readContent(lllllllllllllIIIIllIlllIIllIlIII);
            "".length();
            if (("  ".length() & ~"  ".length()) > 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIIIllIlllIIllIlllI) {
            throw new KeyException(String.valueOf(new StringBuilder().append(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[2]]).append(lllllllllllllIIIIllIlllIIllIlIII)), lllllllllllllIIIIllIlllIIllIlllI);
        }
        final Matcher lllllllllllllIIIIllIlllIIllIlIll = PemReader.KEY_PATTERN.matcher(lllllllllllllIIIIllIlllIIllIllII);
        if (llllIIIlIlIlIlI(lllllllllllllIIIIllIlllIIllIlIll.find() ? 1 : 0)) {
            throw new KeyException(String.valueOf(new StringBuilder().append(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[3]]).append(lllllllllllllIIIIllIlllIIllIlIII)));
        }
        final ByteBuf lllllllllllllIIIIllIlllIIllIlIlI = Unpooled.copiedBuffer(lllllllllllllIIIIllIlllIIllIlIll.group(PemReader.lIlIllIIllllII[1]), CharsetUtil.US_ASCII);
        final ByteBuf lllllllllllllIIIIllIlllIIllIlIIl = io.netty.handler.codec.base64.Base64.decode(lllllllllllllIIIIllIlllIIllIlIlI);
        lllllllllllllIIIIllIlllIIllIlIlI.release();
        "".length();
        return lllllllllllllIIIIllIlllIIllIlIIl;
    }
    
    private static String llllIIIlIlIIlIl(final String lllllllllllllIIIIllIlllIIIlIllll, final String lllllllllllllIIIIllIlllIIIlIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlllIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlllIIIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlllIIIllIIIl.init(PemReader.lIlIllIIllllII[2], lllllllllllllIIIIllIlllIIIllIIlI);
            return new String(lllllllllllllIIIIllIlllIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlllIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlllIIIllIIII) {
            lllllllllllllIIIIllIlllIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIIlIlIllII(final int lllllllllllllIIIIllIlllIIIIIlIII) {
        return lllllllllllllIIIIllIlllIIIIIlIII < 0;
    }
    
    static ByteBuf[] readCertificates(final File lllllllllllllIIIIllIlllIIlllllll) throws CertificateException {
        String lllllllllllllIIIIllIlllIIllllllI;
        try {
            lllllllllllllIIIIllIlllIIllllllI = readContent(lllllllllllllIIIIllIlllIIlllllll);
            "".length();
            if ((0x17 ^ 0x37 ^ (0x10 ^ 0x34)) == 0x0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIIIllIlllIlIIIIIlI) {
            throw new CertificateException(String.valueOf(new StringBuilder().append(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[0]]).append(lllllllllllllIIIIllIlllIIlllllll)), lllllllllllllIIIIllIlllIlIIIIIlI);
        }
        final List<ByteBuf> lllllllllllllIIIIllIlllIIlllllIl = new ArrayList<ByteBuf>();
        final Matcher lllllllllllllIIIIllIlllIIlllllII = PemReader.CERT_PATTERN.matcher(lllllllllllllIIIIllIlllIIllllllI);
        int lllllllllllllIIIIllIlllIIllllIll = PemReader.lIlIllIIllllII[0];
        while (!llllIIIlIlIlIlI(lllllllllllllIIIIllIlllIIlllllII.find(lllllllllllllIIIIllIlllIIllllIll) ? 1 : 0)) {
            final ByteBuf lllllllllllllIIIIllIlllIlIIIIIIl = Unpooled.copiedBuffer(lllllllllllllIIIIllIlllIIlllllII.group(PemReader.lIlIllIIllllII[1]), CharsetUtil.US_ASCII);
            final ByteBuf lllllllllllllIIIIllIlllIlIIIIIII = io.netty.handler.codec.base64.Base64.decode(lllllllllllllIIIIllIlllIlIIIIIIl);
            lllllllllllllIIIIllIlllIlIIIIIIl.release();
            "".length();
            lllllllllllllIIIIllIlllIIlllllIl.add(lllllllllllllIIIIllIlllIlIIIIIII);
            "".length();
            lllllllllllllIIIIllIlllIIllllIll = lllllllllllllIIIIllIlllIIlllllII.end();
            "".length();
            if (-" ".length() == "   ".length()) {
                return null;
            }
        }
        "".length();
        if (((145 + 18 - 72 + 154 ^ 16 + 25 + 21 + 86) & (192 + 179 - 275 + 121 ^ 46 + 120 - 94 + 112 ^ -" ".length())) >= "   ".length()) {
            return null;
        }
        if (llllIIIlIlIlIll(lllllllllllllIIIIllIlllIIlllllIl.isEmpty() ? 1 : 0)) {
            throw new CertificateException(String.valueOf(new StringBuilder().append(PemReader.lIlIllIIlllIll[PemReader.lIlIllIIllllII[1]]).append(lllllllllllllIIIIllIlllIIlllllll)));
        }
        return lllllllllllllIIIIllIlllIIlllllIl.toArray(new ByteBuf[lllllllllllllIIIIllIlllIIlllllIl.size()]);
    }
    
    private static boolean llllIIIlIlIllIl(final int lllllllllllllIIIIllIlllIIIIIllll, final int lllllllllllllIIIIllIlllIIIIIlllI) {
        return lllllllllllllIIIIllIlllIIIIIllll < lllllllllllllIIIIllIlllIIIIIlllI;
    }
}
