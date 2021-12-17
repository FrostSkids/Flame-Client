// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.util.internal.EmptyArrays;
import java.security.cert.CertificateEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Arrays;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.security.MessageDigest;
import io.netty.util.concurrent.FastThreadLocal;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;

public final class FingerprintTrustManagerFactory extends SimpleTrustManagerFactory
{
    private static final /* synthetic */ String[] lIIIlllIIllllI;
    private final /* synthetic */ TrustManager tm;
    private static final /* synthetic */ Pattern FINGERPRINT_STRIP_PATTERN;
    private static final /* synthetic */ int[] lIIIlllIlIIIII;
    private static final /* synthetic */ Pattern FINGERPRINT_PATTERN;
    private static final /* synthetic */ FastThreadLocal<MessageDigest> tlmd;
    private final /* synthetic */ byte[][] fingerprints;
    
    private static boolean llIIIllIIlllllI(final Object lllllllllllllIIlllllIIlIIIIIllII) {
        return lllllllllllllIIlllllIIlIIIIIllII == null;
    }
    
    private static byte[][] toFingerprintArray(final Iterable<String> lllllllllllllIIlllllIIlIIlIlIllI) {
        if (llIIIllIIlllllI(lllllllllllllIIlllllIIlIIlIlIllI)) {
            throw new NullPointerException(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[4]]);
        }
        final List<byte[]> lllllllllllllIIlllllIIlIIlIlIlIl = new ArrayList<byte[]>();
        final Iterator lllllllllllllIIlllllIIlIIlIlIlll = lllllllllllllIIlllllIIlIIlIlIllI.iterator();
        while (llIIIllIlIIIIIl(lllllllllllllIIlllllIIlIIlIlIlll.hasNext() ? 1 : 0)) {
            String lllllllllllllIIlllllIIlIIlIllIII = lllllllllllllIIlllllIIlIIlIlIlll.next();
            if (llIIIllIIlllllI(lllllllllllllIIlllllIIlIIlIllIII)) {
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
                break;
            }
            else {
                if (llIIIllIlIIIIlI(FingerprintTrustManagerFactory.FINGERPRINT_PATTERN.matcher(lllllllllllllIIlllllIIlIIlIllIII).matches() ? 1 : 0)) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[5]]).append(lllllllllllllIIlllllIIlIIlIllIII)));
                }
                lllllllllllllIIlllllIIlIIlIllIII = FingerprintTrustManagerFactory.FINGERPRINT_STRIP_PATTERN.matcher(lllllllllllllIIlllllIIlIIlIllIII).replaceAll(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[6]]);
                if (llIIIllIlIIIIII(lllllllllllllIIlllllIIlIIlIllIII.length(), FingerprintTrustManagerFactory.lIIIlllIlIIIII[7])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[8]]).append(lllllllllllllIIlllllIIlIIlIllIII).append(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[9]])));
                }
                final byte[] lllllllllllllIIlllllIIlIIlIllIIl = new byte[FingerprintTrustManagerFactory.lIIIlllIlIIIII[1]];
                int lllllllllllllIIlllllIIlIIlIllIlI = FingerprintTrustManagerFactory.lIIIlllIlIIIII[0];
                while (llIIIllIIllllll(lllllllllllllIIlllllIIlIIlIllIlI, lllllllllllllIIlllllIIlIIlIllIIl.length)) {
                    final int lllllllllllllIIlllllIIlIIlIllIll = lllllllllllllIIlllllIIlIIlIllIlI << FingerprintTrustManagerFactory.lIIIlllIlIIIII[2];
                    lllllllllllllIIlllllIIlIIlIllIIl[lllllllllllllIIlllllIIlIIlIllIlI] = (byte)Integer.parseInt(lllllllllllllIIlllllIIlIIlIllIII.substring(lllllllllllllIIlllllIIlIIlIllIll, lllllllllllllIIlllllIIlIIlIllIll + FingerprintTrustManagerFactory.lIIIlllIlIIIII[3]), FingerprintTrustManagerFactory.lIIIlllIlIIIII[10]);
                    ++lllllllllllllIIlllllIIlIIlIllIlI;
                    "".length();
                    if ((0x78 ^ 0x7C) == 0x0) {
                        return null;
                    }
                }
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        return lllllllllllllIIlllllIIlIIlIlIlIl.toArray(new byte[lllllllllllllIIlllllIIlIIlIlIlIl.size()][]);
    }
    
    private static void llIIIllIIllllII() {
        (lIIIlllIIllllI = new String[FingerprintTrustManagerFactory.lIIIlllIlIIIII[13]])[FingerprintTrustManagerFactory.lIIIlllIlIIIII[0]] = llIIIllIIllIlll("JyECBgIzOB4ICTU7", "AHlag");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[2]] = llIIIllIIllIlll("PhMkKyshHy0pZDUbJiohIQI6JConSGg=", "SrHMD");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[3]] = llIIIllIIlllIII("RPWNVyBkjW1i2hJV8XzTHBR1C2uEbDqT", "kwhLb");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[4]] = llIIIllIIlllIII("kBHOyJ+mIFox/YY+P7rJwQ==", "ydgMC");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[5]] = llIIIllIIlllIIl("BrV85dfsC1AHoDrWRrcOk3RLYt1qo/h7", "DxEBp");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[6]] = llIIIllIIlllIIl("p+YsZVFdS8s=", "pOJlP");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[8]] = llIIIllIIlllIIl("g8Q59jGuIP7P0EF76h97vPVTC1CMtBJJ", "audUp");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[9]] = llIIIllIIllIlll("VVsQOhkQEAEnDU9TJgooRFo=", "usuBi");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[11]] = llIIIllIIlllIII("4hP6Ic3eXEfAa7hjUFZ7Ug==", "KtpPD");
        FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[12]] = llIIIllIIllIlll("cA==", "Jrrdz");
    }
    
    private static boolean llIIIllIlIIIIII(final int lllllllllllllIIlllllIIlIIIIIIlIl, final int lllllllllllllIIlllllIIlIIIIIIlII) {
        return lllllllllllllIIlllllIIlIIIIIIlIl != lllllllllllllIIlllllIIlIIIIIIlII;
    }
    
    public FingerprintTrustManagerFactory(final Iterable<String> lllllllllllllIIlllllIIlIIllllllI) {
        this(toFingerprintArray(lllllllllllllIIlllllIIlIIllllllI));
    }
    
    private static void llIIIllIIllllIl() {
        (lIIIlllIlIIIII = new int[14])[0] = ((0x42 ^ 0x3 ^ (0x41 ^ 0x6)) & (72 + 105 - 153 + 153 ^ 24 + 42 - 64 + 181 ^ -" ".length()));
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[1] = (0x7F ^ 0x6B);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[2] = " ".length();
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[3] = "  ".length();
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[4] = "   ".length();
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[5] = (0x12 ^ 0x16);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[6] = (0x8F ^ 0x8A);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[7] = (0xE8 ^ 0xC0);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[8] = (0x47 ^ 0x41);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[9] = (0x29 ^ 0x2E);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[10] = (116 + 107 - 175 + 93 ^ 125 + 141 - 245 + 136);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[11] = (0xBC ^ 0xB4);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[12] = (0x19 ^ 0x10);
        FingerprintTrustManagerFactory.lIIIlllIlIIIII[13] = (0x9A ^ 0x90);
    }
    
    private static boolean llIIIllIIllllll(final int lllllllllllllIIlllllIIlIIIIIllll, final int lllllllllllllIIlllllIIlIIIIIlllI) {
        return lllllllllllllIIlllllIIlIIIIIllll < lllllllllllllIIlllllIIlIIIIIlllI;
    }
    
    private static boolean llIIIllIlIIIIlI(final int lllllllllllllIIlllllIIlIIIIIlIII) {
        return lllllllllllllIIlllllIIlIIIIIlIII == 0;
    }
    
    private static boolean llIIIllIlIIIIIl(final int lllllllllllllIIlllllIIlIIIIIlIlI) {
        return lllllllllllllIIlllllIIlIIIIIlIlI != 0;
    }
    
    public FingerprintTrustManagerFactory(final byte[]... lllllllllllllIIlllllIIlIIllIlIII) {
        this.tm = new X509TrustManager() {
            private static final /* synthetic */ int[] lIllllIlIllllI;
            private static final /* synthetic */ String[] lIllllIlIlllIl;
            
            private static boolean lIIIIlIIlIllIlIl(final int llllllllllllIllllIlIIIlllIIIIlII) {
                return llllllllllllIllllIlIIIlllIIIIlII == 0;
            }
            
            @Override
            public void checkServerTrusted(final X509Certificate[] llllllllllllIllllIlIIIllllIIllIl, final String llllllllllllIllllIlIIIllllIIllII) throws CertificateException {
                this.checkTrusted(FingerprintTrustManagerFactory$2.lIllllIlIlllIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[1]], llllllllllllIllllIlIIIllllIIllIl);
            }
            
            private void checkTrusted(final String llllllllllllIllllIlIIIlllIlllIlI, final X509Certificate[] llllllllllllIllllIlIIIlllIlllIIl) throws CertificateException {
                final X509Certificate llllllllllllIllllIlIIIlllIlllIII = llllllllllllIllllIlIIIlllIlllIIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[0]];
                final byte[] llllllllllllIllllIlIIIlllIllIlll = this.fingerprint(llllllllllllIllllIlIIIlllIlllIII);
                boolean llllllllllllIllllIlIIIlllIllIllI = FingerprintTrustManagerFactory$2.lIllllIlIllllI[0] != 0;
                final byte[][] llllllllllllIllllIlIIIlllIlllllI = FingerprintTrustManagerFactory.this.fingerprints;
                final int llllllllllllIllllIlIIIlllIllllIl = llllllllllllIllllIlIIIlllIlllllI.length;
                int llllllllllllIllllIlIIIlllIllllII = FingerprintTrustManagerFactory$2.lIllllIlIllllI[0];
                while (lIIIIlIIlIllIIll(llllllllllllIllllIlIIIlllIllllII, llllllllllllIllllIlIIIlllIllllIl)) {
                    final byte[] llllllllllllIllllIlIIIlllIllllll = llllllllllllIllllIlIIIlllIlllllI[llllllllllllIllllIlIIIlllIllllII];
                    if (lIIIIlIIlIllIlII(Arrays.equals(llllllllllllIllllIlIIIlllIllIlll, llllllllllllIllllIlIIIlllIllllll) ? 1 : 0)) {
                        llllllllllllIllllIlIIIlllIllIllI = (FingerprintTrustManagerFactory$2.lIllllIlIllllI[1] != 0);
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllllIlIIIlllIllllII;
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return;
                        }
                        continue;
                    }
                }
                if (lIIIIlIIlIllIlIl(llllllllllllIllllIlIIIlllIllIllI ? 1 : 0)) {
                    throw new CertificateException(String.valueOf(new StringBuilder().append(llllllllllllIllllIlIIIlllIlllIlI).append(FingerprintTrustManagerFactory$2.lIllllIlIlllIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[2]]).append(llllllllllllIllllIlIIIlllIlllIII.getSubjectDN())));
                }
            }
            
            private static String lIIIIlIIlIllIIII(String llllllllllllIllllIlIIIlllIIlIlII, final String llllllllllllIllllIlIIIlllIIlIIll) {
                llllllllllllIllllIlIIIlllIIlIlII = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIIlllIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIlIIIlllIIlIlll = new StringBuilder();
                final char[] llllllllllllIllllIlIIIlllIIlIllI = llllllllllllIllllIlIIIlllIIlIIll.toCharArray();
                int llllllllllllIllllIlIIIlllIIlIlIl = FingerprintTrustManagerFactory$2.lIllllIlIllllI[0];
                final String llllllllllllIllllIlIIIlllIIIllll = (Object)((String)llllllllllllIllllIlIIIlllIIlIlII).toCharArray();
                final byte llllllllllllIllllIlIIIlllIIIlllI = (byte)llllllllllllIllllIlIIIlllIIIllll.length;
                String llllllllllllIllllIlIIIlllIIIllIl = (String)FingerprintTrustManagerFactory$2.lIllllIlIllllI[0];
                while (lIIIIlIIlIllIIll((int)llllllllllllIllllIlIIIlllIIIllIl, llllllllllllIllllIlIIIlllIIIlllI)) {
                    final char llllllllllllIllllIlIIIlllIIllIlI = llllllllllllIllllIlIIIlllIIIllll[llllllllllllIllllIlIIIlllIIIllIl];
                    llllllllllllIllllIlIIIlllIIlIlll.append((char)(llllllllllllIllllIlIIIlllIIllIlI ^ llllllllllllIllllIlIIIlllIIlIllI[llllllllllllIllllIlIIIlllIIlIlIl % llllllllllllIllllIlIIIlllIIlIllI.length]));
                    "".length();
                    ++llllllllllllIllllIlIIIlllIIlIlIl;
                    ++llllllllllllIllllIlIIIlllIIIllIl;
                    "".length();
                    if ((0xA8 ^ 0xBC ^ (0xD ^ 0x1D)) <= " ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIlIIIlllIIlIlll);
            }
            
            static {
                lIIIIlIIlIllIIlI();
                lIIIIlIIlIllIIIl();
            }
            
            private static boolean lIIIIlIIlIllIlII(final int llllllllllllIllllIlIIIlllIIIIllI) {
                return llllllllllllIllllIlIIIlllIIIIllI != 0;
            }
            
            private byte[] fingerprint(final X509Certificate llllllllllllIllllIlIIIlllIlIlIII) throws CertificateEncodingException {
                final MessageDigest llllllllllllIllllIlIIIlllIlIIlll = FingerprintTrustManagerFactory.tlmd.get();
                llllllllllllIllllIlIIIlllIlIIlll.reset();
                return llllllllllllIllllIlIIIlllIlIIlll.digest(llllllllllllIllllIlIIIlllIlIlIII.getEncoded());
            }
            
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return EmptyArrays.EMPTY_X509_CERTIFICATES;
            }
            
            private static void lIIIIlIIlIllIIIl() {
                (lIllllIlIlllIl = new String[FingerprintTrustManagerFactory$2.lIllllIlIllllI[3]])[FingerprintTrustManagerFactory$2.lIllllIlIllllI[0]] = lIIIIlIIlIllIIII("IhYNIAY1", "AzdEh");
                FingerprintTrustManagerFactory$2.lIllllIlIlllIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[1]] = lIIIIlIIlIllIIII("ITwGFCcg", "RYtbB");
                FingerprintTrustManagerFactory$2.lIllllIlIlllIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[2]] = lIIIIlIIlIllIIII("cQEhIB84BC0xCiUHZCUCJQpkJwU6DCslBXEELTwMNBA0IAI/Fn5y", "QbDRk");
            }
            
            private static void lIIIIlIIlIllIIlI() {
                (lIllllIlIllllI = new int[4])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
                FingerprintTrustManagerFactory$2.lIllllIlIllllI[1] = " ".length();
                FingerprintTrustManagerFactory$2.lIllllIlIllllI[2] = "  ".length();
                FingerprintTrustManagerFactory$2.lIllllIlIllllI[3] = "   ".length();
            }
            
            @Override
            public void checkClientTrusted(final X509Certificate[] llllllllllllIllllIlIIIllllIlIIIl, final String llllllllllllIllllIlIIIllllIlIIll) throws CertificateException {
                this.checkTrusted(FingerprintTrustManagerFactory$2.lIllllIlIlllIl[FingerprintTrustManagerFactory$2.lIllllIlIllllI[0]], llllllllllllIllllIlIIIllllIlIIIl);
            }
            
            private static boolean lIIIIlIIlIllIIll(final int llllllllllllIllllIlIIIlllIIIlIIl, final int llllllllllllIllllIlIIIlllIIIlIII) {
                return llllllllllllIllllIlIIIlllIIIlIIl < llllllllllllIllllIlIIIlllIIIlIII;
            }
        };
        if (llIIIllIIlllllI(lllllllllllllIIlllllIIlIIllIlIII)) {
            throw new NullPointerException(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[0]]);
        }
        final List<byte[]> lllllllllllllIIlllllIIlIIllIlIlI = new ArrayList<byte[]>();
        final byte[][] lllllllllllllIIlllllIIlIIllIllll = lllllllllllllIIlllllIIlIIllIlIII;
        final int lllllllllllllIIlllllIIlIIllIlllI = lllllllllllllIIlllllIIlIIllIllll.length;
        int lllllllllllllIIlllllIIlIIllIllIl = FingerprintTrustManagerFactory.lIIIlllIlIIIII[0];
        while (llIIIllIIllllll(lllllllllllllIIlllllIIlIIllIllIl, lllllllllllllIIlllllIIlIIllIlllI)) {
            final byte[] lllllllllllllIIlllllIIlIIlllIIII = lllllllllllllIIlllllIIlIIllIllll[lllllllllllllIIlllllIIlIIllIllIl];
            if (llIIIllIIlllllI(lllllllllllllIIlllllIIlIIlllIIII)) {
                "".length();
                if (-" ".length() >= ((0xEC ^ 0x9E ^ (0x7 ^ 0x31)) & (0x57 ^ 0x59 ^ (0x22 ^ 0x68) ^ -" ".length()))) {
                    throw null;
                }
                break;
            }
            else {
                if (llIIIllIlIIIIII(lllllllllllllIIlllllIIlIIlllIIII.length, FingerprintTrustManagerFactory.lIIIlllIlIIIII[1])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[2]]).append(ByteBufUtil.hexDump(Unpooled.wrappedBuffer(lllllllllllllIIlllllIIlIIlllIIII))).append(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[3]])));
                }
                lllllllllllllIIlllllIIlIIllIlIlI.add(lllllllllllllIIlllllIIlIIlllIIII.clone());
                "".length();
                ++lllllllllllllIIlllllIIlIIllIllIl;
                "".length();
                if ("  ".length() <= 0) {
                    throw null;
                }
                continue;
            }
        }
        this.fingerprints = lllllllllllllIIlllllIIlIIllIlIlI.toArray(new byte[lllllllllllllIIlllllIIlIIllIlIlI.size()][]);
    }
    
    static {
        llIIIllIIllllIl();
        llIIIllIIllllII();
        SHA1_BYTE_LEN = FingerprintTrustManagerFactory.lIIIlllIlIIIII[1];
        SHA1_HEX_LEN = FingerprintTrustManagerFactory.lIIIlllIlIIIII[7];
        FINGERPRINT_PATTERN = Pattern.compile(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[11]]);
        FINGERPRINT_STRIP_PATTERN = Pattern.compile(FingerprintTrustManagerFactory.lIIIlllIIllllI[FingerprintTrustManagerFactory.lIIIlllIlIIIII[12]]);
        tlmd = new FastThreadLocal<MessageDigest>() {
            private static final /* synthetic */ String[] lIIllIIIlIIllI;
            private static final /* synthetic */ int[] lIIllIIIlIIlll;
            
            static {
                llIlIllIIlIllIl();
                llIlIllIIlIllII();
            }
            
            @Override
            protected MessageDigest initialValue() {
                try {
                    return MessageDigest.getInstance(FingerprintTrustManagerFactory$1.lIIllIIIlIIllI[FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[0]]);
                }
                catch (NoSuchAlgorithmException lllllllllllllIIlIllIlIIIIIllIlII) {
                    throw new Error(lllllllllllllIIlIllIlIIIIIllIlII);
                }
            }
            
            private static String llIlIllIIlIlIll(final String lllllllllllllIIlIllIlIIIIIlIIlll, final String lllllllllllllIIlIllIlIIIIIlIIlII) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIlIIIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[2]), "DES");
                    final Cipher lllllllllllllIIlIllIlIIIIIlIlIIl = Cipher.getInstance("DES");
                    lllllllllllllIIlIllIlIIIIIlIlIIl.init(FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[3], lllllllllllllIIlIllIlIIIIIlIlIlI);
                    return new String(lllllllllllllIIlIllIlIIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIlIIIIIlIlIII) {
                    lllllllllllllIIlIllIlIIIIIlIlIII.printStackTrace();
                    return null;
                }
            }
            
            private static void llIlIllIIlIllII() {
                (lIIllIIIlIIllI = new String[FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[1]])[FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[0]] = llIlIllIIlIlIll("k3ai3iH1rSM=", "QUZxW");
            }
            
            private static void llIlIllIIlIllIl() {
                (lIIllIIIlIIlll = new int[4])[0] = ((0x71 ^ 0x32) & ~(0x2E ^ 0x6D));
                FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[1] = " ".length();
                FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[2] = (0xCF ^ 0xC7);
                FingerprintTrustManagerFactory$1.lIIllIIIlIIlll[3] = "  ".length();
            }
        };
    }
    
    @Override
    protected void engineInit(final ManagerFactoryParameters lllllllllllllIIlllllIIlIIlIIlIlI) throws Exception {
    }
    
    @Override
    protected void engineInit(final KeyStore lllllllllllllIIlllllIIlIIlIIllII) throws Exception {
    }
    
    @Override
    protected TrustManager[] engineGetTrustManagers() {
        final TrustManager[] array = new TrustManager[FingerprintTrustManagerFactory.lIIIlllIlIIIII[2]];
        array[FingerprintTrustManagerFactory.lIIIlllIlIIIII[0]] = this.tm;
        return array;
    }
    
    private static String llIIIllIIllIlll(String lllllllllllllIIlllllIIlIIIlIIlll, final String lllllllllllllIIlllllIIlIIIlIIllI) {
        lllllllllllllIIlllllIIlIIIlIIlll = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllllIIlIIIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllIIlIIIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIIlllllIIlIIIlIlIIl = lllllllllllllIIlllllIIlIIIlIIllI.toCharArray();
        int lllllllllllllIIlllllIIlIIIlIlIII = FingerprintTrustManagerFactory.lIIIlllIlIIIII[0];
        final char lllllllllllllIIlllllIIlIIIlIIIlI = (Object)((String)lllllllllllllIIlllllIIlIIIlIIlll).toCharArray();
        final int lllllllllllllIIlllllIIlIIIlIIIIl = lllllllllllllIIlllllIIlIIIlIIIlI.length;
        String lllllllllllllIIlllllIIlIIIlIIIII = (String)FingerprintTrustManagerFactory.lIIIlllIlIIIII[0];
        while (llIIIllIIllllll((int)lllllllllllllIIlllllIIlIIIlIIIII, lllllllllllllIIlllllIIlIIIlIIIIl)) {
            final char lllllllllllllIIlllllIIlIIIlIllIl = lllllllllllllIIlllllIIlIIIlIIIlI[lllllllllllllIIlllllIIlIIIlIIIII];
            lllllllllllllIIlllllIIlIIIlIlIlI.append((char)(lllllllllllllIIlllllIIlIIIlIllIl ^ lllllllllllllIIlllllIIlIIIlIlIIl[lllllllllllllIIlllllIIlIIIlIlIII % lllllllllllllIIlllllIIlIIIlIlIIl.length]));
            "".length();
            ++lllllllllllllIIlllllIIlIIIlIlIII;
            ++lllllllllllllIIlllllIIlIIIlIIIII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllIIlIIIlIlIlI);
    }
    
    private static String llIIIllIIlllIII(final String lllllllllllllIIlllllIIlIIIlllIlI, final String lllllllllllllIIlllllIIlIIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIIlIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIlIIIlllIll.getBytes(StandardCharsets.UTF_8)), FingerprintTrustManagerFactory.lIIIlllIlIIIII[11]), "DES");
            final Cipher lllllllllllllIIlllllIIlIIIlllllI = Cipher.getInstance("DES");
            lllllllllllllIIlllllIIlIIIlllllI.init(FingerprintTrustManagerFactory.lIIIlllIlIIIII[3], lllllllllllllIIlllllIIlIIIllllll);
            return new String(lllllllllllllIIlllllIIlIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIIlIIIllllIl) {
            lllllllllllllIIlllllIIlIIIllllIl.printStackTrace();
            return null;
        }
    }
    
    public FingerprintTrustManagerFactory(final String... lllllllllllllIIlllllIIlIIllllIII) {
        this(toFingerprintArray(Arrays.asList(lllllllllllllIIlllllIIlIIllllIII)));
    }
    
    private static String llIIIllIIlllIIl(final String lllllllllllllIIlllllIIlIIIIlIlIl, final String lllllllllllllIIlllllIIlIIIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIIlIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllIIlIIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllIIlIIIIllIIl.init(FingerprintTrustManagerFactory.lIIIlllIlIIIII[3], lllllllllllllIIlllllIIlIIIIllIlI);
            return new String(lllllllllllllIIlllllIIlIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIIlIIIIllIII) {
            lllllllllllllIIlllllIIlIIIIllIII.printStackTrace();
            return null;
        }
    }
}
