// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.security.cert.CertificateEncodingException;
import java.io.FileOutputStream;
import io.netty.util.CharsetUtil;
import io.netty.buffer.Unpooled;
import java.security.cert.X509Certificate;
import java.security.PrivateKey;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.cert.CertificateException;
import java.io.IOException;
import java.io.OutputStream;
import io.netty.util.internal.logging.InternalLogger;
import java.util.Date;
import java.io.File;

public final class SelfSignedCertificate
{
    private final /* synthetic */ File certificate;
    private static final /* synthetic */ String[] lIIIIlIlIlllII;
    private static final /* synthetic */ int[] lIIIIlIllIIIIl;
    private final /* synthetic */ File privateKey;
    private static final /* synthetic */ InternalLogger logger;
    
    public void delete() {
        safeDelete(this.certificate);
        safeDelete(this.privateKey);
    }
    
    private static boolean lIlllIlIIIllllI(final Object lllllllllllllIlIIlIlIlIIlIIlllII) {
        return lllllllllllllIlIIlIlIlIIlIIlllII != null;
    }
    
    private static void safeClose(final File lllllllllllllIlIIlIlIlIlIIlIIIll, final OutputStream lllllllllllllIlIIlIlIlIlIIIlllll) {
        try {
            lllllllllllllIlIIlIlIlIlIIIlllll.close();
            "".length();
            if (((0x5D ^ 0x37 ^ (0x94 ^ 0xB5)) & (0x44 ^ 0x4F ^ (0x36 ^ 0x76) ^ -" ".length())) == -" ".length()) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIIlIlIlIlIIlIIlIl) {
            SelfSignedCertificate.logger.warn(String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[16]]).append(lllllllllllllIlIIlIlIlIlIIlIIIll)), lllllllllllllIlIIlIlIlIlIIlIIlIl);
        }
    }
    
    public SelfSignedCertificate(final String lllllllllllllIlIIlIlIlIllIIIIlll) throws CertificateException {
        this(lllllllllllllIlIIlIlIlIllIIIIlll, ThreadLocalInsecureRandom.current(), SelfSignedCertificate.lIIIIlIllIIIIl[1]);
    }
    
    static {
        lIlllIlIIIlllII();
        lIlllIlIIIllIIl();
        logger = InternalLoggerFactory.getInstance(SelfSignedCertificate.class);
        NOT_BEFORE = new Date(System.currentTimeMillis() - 31536000000L);
        NOT_AFTER = new Date(253402300799000L);
    }
    
    private static String lIlllIlIIIlIlII(final String lllllllllllllIlIIlIlIlIIlllIlIII, final String lllllllllllllIlIIlIlIlIIlllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIIlllIIlll.getBytes(StandardCharsets.UTF_8)), SelfSignedCertificate.lIIIIlIllIIIIl[10]), "DES");
            final Cipher lllllllllllllIlIIlIlIlIIlllIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIlIIlllIlIll.init(SelfSignedCertificate.lIIIIlIllIIIIl[3], lllllllllllllIlIIlIlIlIIlllIllIl);
            return new String(lllllllllllllIlIIlIlIlIIlllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIIlllIlIIl) {
            lllllllllllllIlIIlIlIlIIlllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllIlIIIlIIll(String lllllllllllllIlIIlIlIlIIllIIIIII, final String lllllllllllllIlIIlIlIlIIllIIIllI) {
        lllllllllllllIlIIlIlIlIIllIIIIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIlIlIIllIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlIlIIllIIIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIlIlIlIIllIIIlII = lllllllllllllIlIIlIlIlIIllIIIllI.toCharArray();
        int lllllllllllllIlIIlIlIlIIllIIIIlI = SelfSignedCertificate.lIIIIlIllIIIIl[0];
        final double lllllllllllllIlIIlIlIlIIlIlllIII = (Object)((String)lllllllllllllIlIIlIlIlIIllIIIIII).toCharArray();
        final short lllllllllllllIlIIlIlIlIIlIllIllI = (short)lllllllllllllIlIIlIlIlIIlIlllIII.length;
        byte lllllllllllllIlIIlIlIlIIlIllIlIl = (byte)SelfSignedCertificate.lIIIIlIllIIIIl[0];
        while (lIlllIlIIlIIIll(lllllllllllllIlIIlIlIlIIlIllIlIl, lllllllllllllIlIIlIlIlIIlIllIllI)) {
            final char lllllllllllllIlIIlIlIlIIllIIlIIl = lllllllllllllIlIIlIlIlIIlIlllIII[lllllllllllllIlIIlIlIlIIlIllIlIl];
            lllllllllllllIlIIlIlIlIIllIIIlIl.append((char)(lllllllllllllIlIIlIlIlIIllIIlIIl ^ lllllllllllllIlIIlIlIlIIllIIIlII[lllllllllllllIlIIlIlIlIIllIIIIlI % lllllllllllllIlIIlIlIlIIllIIIlII.length]));
            "".length();
            ++lllllllllllllIlIIlIlIlIIllIIIIlI;
            ++lllllllllllllIlIIlIlIlIIlIllIlIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIlIIllIIIlIl);
    }
    
    private static boolean lIlllIlIIlIIIll(final int lllllllllllllIlIIlIlIlIIlIlIllII, final int lllllllllllllIlIIlIlIlIIlIlIlIll) {
        return lllllllllllllIlIIlIlIlIIlIlIllII < lllllllllllllIlIIlIlIlIIlIlIlIll;
    }
    
    private static boolean lIlllIlIIlIIIII(final int lllllllllllllIlIIlIlIlIIlIIllIlI) {
        return lllllllllllllIlIIlIlIlIIlIIllIlI == 0;
    }
    
    public SelfSignedCertificate(final String lllllllllllllIlIIlIlIlIlIlllIlll, final SecureRandom lllllllllllllIlIIlIlIlIlIlllIllI, final int lllllllllllllIlIIlIlIlIlIllIllll) throws CertificateException {
        KeyPair lllllllllllllIlIIlIlIlIlIlllIlII;
        try {
            final KeyPairGenerator lllllllllllllIlIIlIlIlIlIlllllII = KeyPairGenerator.getInstance(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[2]]);
            lllllllllllllIlIIlIlIlIlIlllllII.initialize(lllllllllllllIlIIlIlIlIlIllIllll, lllllllllllllIlIIlIlIlIlIlllIllI);
            lllllllllllllIlIIlIlIlIlIlllIlII = lllllllllllllIlIIlIlIlIlIlllllII.generateKeyPair();
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        catch (NoSuchAlgorithmException lllllllllllllIlIIlIlIlIlIllllIll) {
            throw new Error(lllllllllllllIlIIlIlIlIlIllllIll);
        }
        String[] lllllllllllllIlIIlIlIlIlIlllIIll;
        try {
            lllllllllllllIlIIlIlIlIlIlllIIll = OpenJdkSelfSignedCertGenerator.generate(lllllllllllllIlIIlIlIlIlIlllIlll, lllllllllllllIlIIlIlIlIlIlllIlII, lllllllllllllIlIIlIlIlIlIlllIllI);
            "".length();
            if (null != null) {
                throw null;
            }
        }
        catch (Throwable lllllllllllllIlIIlIlIlIlIllllIIl) {
            SelfSignedCertificate.logger.debug(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[3]], lllllllllllllIlIIlIlIlIlIllllIIl);
            try {
                lllllllllllllIlIIlIlIlIlIlllIIll = BouncyCastleSelfSignedCertGenerator.generate(lllllllllllllIlIIlIlIlIlIlllIlll, lllllllllllllIlIIlIlIlIlIlllIlII, lllllllllllllIlIIlIlIlIlIlllIllI);
                "".length();
                if (-" ".length() != -" ".length()) {
                    throw null;
                }
            }
            catch (Throwable lllllllllllllIlIIlIlIlIlIllllIlI) {
                SelfSignedCertificate.logger.debug(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[4]], lllllllllllllIlIIlIlIlIlIllllIlI);
                throw new CertificateException(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[5]]);
            }
        }
        this.certificate = new File(lllllllllllllIlIIlIlIlIlIlllIIll[SelfSignedCertificate.lIIIIlIllIIIIl[0]]);
        this.privateKey = new File(lllllllllllllIlIIlIlIlIlIlllIIll[SelfSignedCertificate.lIIIIlIllIIIIl[2]]);
    }
    
    private static String lIlllIlIIIlIIlI(final String lllllllllllllIlIIlIlIlIIllllllIl, final String lllllllllllllIlIIlIlIlIIllllllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIlIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIlIlIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIlIlIIIIIlIl.init(SelfSignedCertificate.lIIIIlIllIIIIl[3], lllllllllllllIlIIlIlIlIlIIIIIlll);
            return new String(lllllllllllllIlIIlIlIlIlIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIlIIIIIIll) {
            lllllllllllllIlIIlIlIlIlIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIIIllIIl() {
        (lIIIIlIlIlllII = new String[SelfSignedCertificate.lIIIIlIllIIIIl[17]])[SelfSignedCertificate.lIIIIlIllIIIIl[0]] = lIlllIlIIIlIIlI("G4f6Xduer4THwfHp2w18yA==", "wSKkb");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[2]] = lIlllIlIIIlIIll("HBgv", "NKnHr");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[3]] = lIlllIlIIIlIIlI("KBMzk7t6fpXpSFSJyYC1khUc15g2640ZlHwRzIdiHpQzDUh+7X8G+xiLAxNGIu/gjn17XQcou1FIGiyyUnTjT9gqYjjjUEwbRVf5DoL1Qq4=", "mQUeY");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[4]] = lIlllIlIIIlIlII("NVVyWjpRRFOzStRHgAITlHAZky3YiM14QU2y0PlPYrN2crJbiC2Onq5eh4XUPfn+T8Jczvzzb2pEhXGpfVEVtm2LbY+rLeqN", "UBozC");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[5]] = lIlllIlIIIlIIlI("LlahW8wcCYEJgmue8WhMVSx1cTcoS4/0VitIYskFfHMf8zSY5mU5zHQoas972GWkPxm+piLTP+gMqdP8G49Jk1WD82cnm9AWQyR0PByD9a5fO9npLzi3WYUioMSGtsPQ", "JHAqC");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[6]] = lIlllIlIIIlIIlI("TaMN/1/UWRhr9+WepaotAfMNJkF/StrkNmJciWb+2eQ=", "dfYaA");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[7]] = lIlllIlIIIlIIlI("SY/6dhT8oHYRKBTKDG8H0WR2xkTkvVWlr1IcALBKQK0=", "aZeld");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[8]] = lIlllIlIIIlIlII("OL7k/rNbVyD9aDGztbnMHw==", "kArso");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[10]] = lIlllIlIIIlIlII("iA9KfBUqXRQ=", "lgpaz");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[11]] = lIlllIlIIIlIIll("bHl1WUwDER89L2EXHSY1CBIRNyAVEXVZTGx5Ug==", "ATXta");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[12]] = lIlllIlIIIlIIll("RmB/Xk9hCBw3Qg8IACcrCgQRMjYJYH9eT2FH", "LMRsb");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[13]] = lIlllIlIIIlIIll("AT0UOx0DNDI=", "jXmNi");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[14]] = lIlllIlIIIlIIlI("YR9uWR6H8rw=", "YXByG");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[15]] = lIlllIlIIIlIlII("8Eqew9R0Rk7l6cz52k0rNjFCIk7vZ3hC+p/j9hj+/mY=", "MUdYT");
        SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[16]] = lIlllIlIIIlIIlI("YI0bZ/IcGZEKyJRu2t5XaGHkuQxGtMeMwDagQtvFA50=", "cpiQC");
    }
    
    private static void lIlllIlIIIlllII() {
        (lIIIIlIllIIIIl = new int[18])[0] = ((0xBC ^ 0x89) & ~(0x13 ^ 0x26));
        SelfSignedCertificate.lIIIIlIllIIIIl[1] = (0xFFFF8E9F & 0x7560);
        SelfSignedCertificate.lIIIIlIllIIIIl[2] = " ".length();
        SelfSignedCertificate.lIIIIlIllIIIIl[3] = "  ".length();
        SelfSignedCertificate.lIIIIlIllIIIIl[4] = "   ".length();
        SelfSignedCertificate.lIIIIlIllIIIIl[5] = (0x3 ^ 0x7);
        SelfSignedCertificate.lIIIIlIllIIIIl[6] = (0x86 ^ 0x83);
        SelfSignedCertificate.lIIIIlIllIIIIl[7] = (108 + 13 - 0 + 73 ^ 89 + 191 - 172 + 88);
        SelfSignedCertificate.lIIIIlIllIIIIl[8] = (0xB8 ^ 0xBF);
        SelfSignedCertificate.lIIIIlIllIIIIl[9] = (0xF8 ^ 0xA7);
        SelfSignedCertificate.lIIIIlIllIIIIl[10] = (0x2E ^ 0x26);
        SelfSignedCertificate.lIIIIlIllIIIIl[11] = (0x39 ^ 0x30);
        SelfSignedCertificate.lIIIIlIllIIIIl[12] = (66 + 27 - 60 + 95 ^ 84 + 52 - 30 + 32);
        SelfSignedCertificate.lIIIIlIllIIIIl[13] = (0x9E ^ 0x95);
        SelfSignedCertificate.lIIIIlIllIIIIl[14] = (0x47 ^ 0x4B);
        SelfSignedCertificate.lIIIIlIllIIIIl[15] = (0x90 ^ 0x9D);
        SelfSignedCertificate.lIIIIlIllIIIIl[16] = (0xBE ^ 0xB0);
        SelfSignedCertificate.lIIIIlIllIIIIl[17] = (56 + 126 - 84 + 36 ^ 84 + 25 + 28 + 0);
    }
    
    static String[] newSelfSignedCertificate(final String lllllllllllllIlIIlIlIlIlIlIIIIlI, final PrivateKey lllllllllllllIlIIlIlIlIlIlIIlIlI, final X509Certificate lllllllllllllIlIIlIlIlIlIlIIlIIl) throws IOException, CertificateEncodingException {
        final String lllllllllllllIlIIlIlIlIlIlIIlIII = String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[6]]).append(io.netty.handler.codec.base64.Base64.encode(Unpooled.wrappedBuffer(lllllllllllllIlIIlIlIlIlIlIIlIlI.getEncoded()), (boolean)(SelfSignedCertificate.lIIIIlIllIIIIl[2] != 0)).toString(CharsetUtil.US_ASCII)).append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[7]]));
        final File lllllllllllllIlIIlIlIlIlIlIIIlll = File.createTempFile(String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[8]]).append(lllllllllllllIlIIlIlIlIlIlIIIIlI).append((char)SelfSignedCertificate.lIIIIlIllIIIIl[9])), SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[10]]);
        lllllllllllllIlIIlIlIlIlIlIIIlll.deleteOnExit();
        OutputStream lllllllllllllIlIIlIlIlIlIlIIIllI = new FileOutputStream(lllllllllllllIlIIlIlIlIlIlIIIlll);
        try {
            lllllllllllllIlIIlIlIlIlIlIIIllI.write(lllllllllllllIlIIlIlIlIlIlIIlIII.getBytes(CharsetUtil.US_ASCII));
            lllllllllllllIlIIlIlIlIlIlIIIllI.close();
            lllllllllllllIlIIlIlIlIlIlIIIllI = null;
            if (lIlllIlIIIllllI(lllllllllllllIlIIlIlIlIlIlIIIllI)) {
                safeClose(lllllllllllllIlIIlIlIlIlIlIIIlll, lllllllllllllIlIIlIlIlIlIlIIIllI);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlll);
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
            }
        }
        finally {
            if (lIlllIlIIIllllI(lllllllllllllIlIIlIlIlIlIlIIIllI)) {
                safeClose(lllllllllllllIlIIlIlIlIlIlIIIlll, lllllllllllllIlIIlIlIlIlIlIIIllI);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlll);
            }
        }
        final String lllllllllllllIlIIlIlIlIlIlIIIlIl = String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[11]]).append(io.netty.handler.codec.base64.Base64.encode(Unpooled.wrappedBuffer(lllllllllllllIlIIlIlIlIlIlIIlIIl.getEncoded()), (boolean)(SelfSignedCertificate.lIIIIlIllIIIIl[2] != 0)).toString(CharsetUtil.US_ASCII)).append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[12]]));
        final File lllllllllllllIlIIlIlIlIlIlIIIlII = File.createTempFile(String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[13]]).append(lllllllllllllIlIIlIlIlIlIlIIIIlI).append((char)SelfSignedCertificate.lIIIIlIllIIIIl[9])), SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[14]]);
        lllllllllllllIlIIlIlIlIlIlIIIlII.deleteOnExit();
        OutputStream lllllllllllllIlIIlIlIlIlIlIIIIll = new FileOutputStream(lllllllllllllIlIIlIlIlIlIlIIIlII);
        try {
            lllllllllllllIlIIlIlIlIlIlIIIIll.write(lllllllllllllIlIIlIlIlIlIlIIIlIl.getBytes(CharsetUtil.US_ASCII));
            lllllllllllllIlIIlIlIlIlIlIIIIll.close();
            lllllllllllllIlIIlIlIlIlIlIIIIll = null;
            if (lIlllIlIIIllllI(lllllllllllllIlIIlIlIlIlIlIIIIll)) {
                safeClose(lllllllllllllIlIIlIlIlIlIlIIIlII, lllllllllllllIlIIlIlIlIlIlIIIIll);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlII);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlll);
                "".length();
                if (-(0x18 ^ 0x10 ^ (0xB8 ^ 0xB4)) > 0) {
                    return null;
                }
            }
        }
        finally {
            if (lIlllIlIIIllllI(lllllllllllllIlIIlIlIlIlIlIIIIll)) {
                safeClose(lllllllllllllIlIIlIlIlIlIlIIIlII, lllllllllllllIlIIlIlIlIlIlIIIIll);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlII);
                safeDelete(lllllllllllllIlIIlIlIlIlIlIIIlll);
            }
        }
        final String[] array = new String[SelfSignedCertificate.lIIIIlIllIIIIl[3]];
        array[SelfSignedCertificate.lIIIIlIllIIIIl[0]] = lllllllllllllIlIIlIlIlIlIlIIIlII.getPath();
        array[SelfSignedCertificate.lIIIIlIllIIIIl[2]] = lllllllllllllIlIIlIlIlIlIlIIIlll.getPath();
        return array;
    }
    
    public SelfSignedCertificate() throws CertificateException {
        this(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[0]]);
    }
    
    private static void safeDelete(final File lllllllllllllIlIIlIlIlIlIIllIlII) {
        if (lIlllIlIIlIIIII(lllllllllllllIlIIlIlIlIlIIllIlII.delete() ? 1 : 0)) {
            SelfSignedCertificate.logger.warn(String.valueOf(new StringBuilder().append(SelfSignedCertificate.lIIIIlIlIlllII[SelfSignedCertificate.lIIIIlIllIIIIl[15]]).append(lllllllllllllIlIIlIlIlIlIIllIlII)));
        }
    }
    
    public File certificate() {
        return this.certificate;
    }
    
    public File privateKey() {
        return this.privateKey;
    }
}
