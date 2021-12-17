// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.util.Arrays;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import sun.security.x509.X509CertImpl;
import sun.security.x509.CertificateAlgorithmId;
import sun.security.x509.AlgorithmId;
import sun.security.x509.CertificateX509Key;
import sun.security.x509.CertificateValidity;
import sun.security.x509.CertificateIssuerName;
import java.security.cert.CertificateException;
import sun.security.x509.CertificateSubjectName;
import sun.security.x509.CertificateSerialNumber;
import java.util.Random;
import java.math.BigInteger;
import sun.security.x509.CertificateVersion;
import sun.security.x509.X500Name;
import sun.security.x509.X509CertInfo;
import java.security.SecureRandom;
import java.security.KeyPair;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

final class OpenJdkSelfSignedCertGenerator
{
    private static final /* synthetic */ int[] llIlIIllllllll;
    private static final /* synthetic */ String[] llIlIIlllllllI;
    
    private static String lIIlIIllIllIlIIl(String llllllllllllIllIlIllIlIIIIIIIlll, final String llllllllllllIllIlIllIlIIIIIIlIll) {
        llllllllllllIllIlIllIlIIIIIIIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIllIlIIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllIlIIIIIIlIlI = new StringBuilder();
        final char[] llllllllllllIllIlIllIlIIIIIIlIIl = llllllllllllIllIlIllIlIIIIIIlIll.toCharArray();
        int llllllllllllIllIlIllIlIIIIIIlIII = OpenJdkSelfSignedCertGenerator.llIlIIllllllll[0];
        final double llllllllllllIllIlIllIlIIIIIIIIlI = (Object)((String)llllllllllllIllIlIllIlIIIIIIIlll).toCharArray();
        final int llllllllllllIllIlIllIlIIIIIIIIIl = llllllllllllIllIlIllIlIIIIIIIIlI.length;
        float llllllllllllIllIlIllIlIIIIIIIIII = OpenJdkSelfSignedCertGenerator.llIlIIllllllll[0];
        while (lIIlIIllIllIllIl((int)llllllllllllIllIlIllIlIIIIIIIIII, llllllllllllIllIlIllIlIIIIIIIIIl)) {
            final char llllllllllllIllIlIllIlIIIIIIllIl = llllllllllllIllIlIllIlIIIIIIIIlI[llllllllllllIllIlIllIlIIIIIIIIII];
            llllllllllllIllIlIllIlIIIIIIlIlI.append((char)(llllllllllllIllIlIllIlIIIIIIllIl ^ llllllllllllIllIlIllIlIIIIIIlIIl[llllllllllllIllIlIllIlIIIIIIlIII % llllllllllllIllIlIllIlIIIIIIlIIl.length]));
            "".length();
            ++llllllllllllIllIlIllIlIIIIIIlIII;
            ++llllllllllllIllIlIllIlIIIIIIIIII;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllIlIIIIIIlIlI);
    }
    
    private static void lIIlIIllIllIllII() {
        (llIlIIllllllll = new int[16])[0] = ((0x34 ^ 0x7E ^ (0x68 ^ 0x62)) & (0xE2 ^ 0x9E ^ (0x46 ^ 0x7A) ^ -" ".length()) & (((0xEC ^ 0x80 ^ (0x0 ^ 0x77)) & (106 + 83 - 76 + 30 ^ 104 + 22 - 30 + 52 ^ -" ".length())) ^ -" ".length()));
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[1] = " ".length();
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2] = "  ".length();
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[3] = (0x6A ^ 0x5A ^ (0x3E ^ 0x4E));
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[4] = "   ".length();
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[5] = (158 + 41 - 104 + 94 ^ 145 + 36 - 40 + 44);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[6] = (0xB4 ^ 0xB1);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[7] = (0x3D ^ 0x44 ^ 79 + 122 - 161 + 87);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[8] = (0x37 ^ 0x30);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[9] = (0x1E ^ 0x16);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[10] = (0x59 ^ 0x50);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[11] = (0x53 ^ 0x59);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[12] = (0xD ^ 0x2F ^ (0x75 ^ 0x5C));
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[13] = (0x7F ^ 0x73);
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[14] = (0x67 ^ 0x71 ^ (0x5B ^ 0x40));
        OpenJdkSelfSignedCertGenerator.llIlIIllllllll[15] = (" ".length() ^ (0x49 ^ 0x46));
    }
    
    private OpenJdkSelfSignedCertGenerator() {
    }
    
    private static String lIIlIIllIllIlIlI(final String llllllllllllIllIlIllIIllllllIlIl, final String llllllllllllIllIlIllIIllllllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIIlllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIIllllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIllIIlllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIllIIlllllllIIl.init(OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2], llllllllllllIllIlIllIIlllllllIlI);
            return new String(llllllllllllIllIlIllIIlllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIIllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIIlllllllIII) {
            llllllllllllIllIlIllIIlllllllIII.printStackTrace();
            return null;
        }
    }
    
    static String[] generate(final String llllllllllllIllIlIllIlIIIIlIIIII, final KeyPair llllllllllllIllIlIllIlIIIIIlllll, final SecureRandom llllllllllllIllIlIllIlIIIIlIIlIl) throws Exception {
        final PrivateKey llllllllllllIllIlIllIlIIIIlIIlII = llllllllllllIllIlIllIlIIIIIlllll.getPrivate();
        final X509CertInfo llllllllllllIllIlIllIlIIIIlIIIll = new X509CertInfo();
        final X500Name llllllllllllIllIlIllIlIIIIlIIIlI = new X500Name(String.valueOf(new StringBuilder().append(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[0]]).append(llllllllllllIllIlIllIlIIIIlIIIII)));
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[1]], new CertificateVersion(OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2]));
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2]], new CertificateSerialNumber(new BigInteger(OpenJdkSelfSignedCertGenerator.llIlIIllllllll[3], llllllllllllIllIlIllIlIIIIlIIlIl)));
        try {
            llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[4]], new CertificateSubjectName(llllllllllllIllIlIllIlIIIIlIIIlI));
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (CertificateException llllllllllllIllIlIllIlIIIIlIlIIl) {
            llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[5]], llllllllllllIllIlIllIlIIIIlIIIlI);
        }
        try {
            llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[6]], new CertificateIssuerName(llllllllllllIllIlIllIlIIIIlIIIlI));
            "".length();
            if (-(0xC6 ^ 0xC2) >= 0) {
                return null;
            }
        }
        catch (CertificateException llllllllllllIllIlIllIlIIIIlIlIII) {
            llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[7]], llllllllllllIllIlIllIlIIIIlIIIlI);
        }
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[8]], new CertificateValidity(SelfSignedCertificate.NOT_BEFORE, SelfSignedCertificate.NOT_AFTER));
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[9]], new CertificateX509Key(llllllllllllIllIlIllIlIIIIIlllll.getPublic()));
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[10]], new CertificateAlgorithmId(new AlgorithmId(AlgorithmId.sha1WithRSAEncryption_oid)));
        X509CertImpl llllllllllllIllIlIllIlIIIIlIIIIl = new X509CertImpl(llllllllllllIllIlIllIlIIIIlIIIll);
        llllllllllllIllIlIllIlIIIIlIIIIl.sign(llllllllllllIllIlIllIlIIIIlIIlII, OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[11]]);
        llllllllllllIllIlIllIlIIIIlIIIll.set(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[12]], llllllllllllIllIlIllIlIIIIlIIIIl.get(OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[13]]));
        llllllllllllIllIlIllIlIIIIlIIIIl = new X509CertImpl(llllllllllllIllIlIllIlIIIIlIIIll);
        llllllllllllIllIlIllIlIIIIlIIIIl.sign(llllllllllllIllIlIllIlIIIIlIIlII, OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[14]]);
        llllllllllllIllIlIllIlIIIIlIIIIl.verify(llllllllllllIllIlIllIlIIIIIlllll.getPublic());
        return SelfSignedCertificate.newSelfSignedCertificate(llllllllllllIllIlIllIlIIIIlIIIII, llllllllllllIllIlIllIlIIIIlIIlII, llllllllllllIllIlIllIlIIIIlIIIIl);
    }
    
    private static void lIIlIIllIllIlIll() {
        (llIlIIlllllllI = new String[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[15]])[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[0]] = lIIlIIllIllIlIII("mp0X2ETgWyM=", "Buzzi");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[1]] = lIIlIIllIllIlIII("JlbfY7mxLJU=", "GEwlt");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2]] = lIIlIIllIllIlIII("f5Jx2f4PJqkJyQ9WPci8gQ==", "VFWza");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[4]] = lIIlIIllIllIlIIl("CxcpDy0bFg==", "xbKeH");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[5]] = lIIlIIllIllIlIII("KIk/i3WBudg=", "OsbZq");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[6]] = lIIlIIllIllIlIlI("9IeSnSglxHY=", "kdZPT");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[7]] = lIIlIIllIllIlIlI("YLGAUnrwJgQ=", "DkEsb");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[8]] = lIIlIIllIllIlIlI("VJwkuM5MZYfmBYRD1wIeXQ==", "rxklg");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[9]] = lIIlIIllIllIlIlI("KR4qqHbqad0=", "OYMtb");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[10]] = lIIlIIllIllIlIIl("NCoEDjs8MgsMABE=", "UFcaI");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[11]] = lIIlIIllIllIlIIl("FQA7SC0vPBIrCQc=", "FHzyZ");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[12]] = lIIlIIllIllIlIIl("JQYyOR4tHj07JQBENDoLKxg8IgQp", "DjUVl");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[13]] = lIIlIIllIllIlIII("o57I0lCMlE4q1ltyp6KU0Q==", "sxKxg");
        OpenJdkSelfSignedCertGenerator.llIlIIlllllllI[OpenJdkSelfSignedCertGenerator.llIlIIllllllll[14]] = lIIlIIllIllIlIlI("SFcMzx9EKK8EyVx9s61IvQ==", "HZvlX");
    }
    
    private static String lIIlIIllIllIlIII(final String llllllllllllIllIlIllIIlllllIlIlI, final String llllllllllllIllIlIllIIlllllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIllIIlllllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllIIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), OpenJdkSelfSignedCertGenerator.llIlIIllllllll[9]), "DES");
            final Cipher llllllllllllIllIlIllIIlllllIllII = Cipher.getInstance("DES");
            llllllllllllIllIlIllIIlllllIllII.init(OpenJdkSelfSignedCertGenerator.llIlIIllllllll[2], llllllllllllIllIlIllIIlllllIllIl);
            return new String(llllllllllllIllIlIllIIlllllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllIIlllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllIIlllllIlIll) {
            llllllllllllIllIlIllIIlllllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIllIllIllIl(final int llllllllllllIllIlIllIIlllllIIIlI, final int llllllllllllIllIlIllIIlllllIIIIl) {
        return llllllllllllIllIlIllIIlllllIIIlI < llllllllllllIllIlIllIIlllllIIIIl;
    }
    
    static {
        lIIlIIllIllIllII();
        lIIlIIllIllIlIll();
    }
}
