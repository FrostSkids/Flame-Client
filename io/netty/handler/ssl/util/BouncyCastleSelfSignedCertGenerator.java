// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import java.security.PrivateKey;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import java.util.Random;
import java.math.BigInteger;
import org.bouncycastle.asn1.x500.X500Name;
import java.security.SecureRandom;
import java.security.KeyPair;
import java.security.Provider;

final class BouncyCastleSelfSignedCertGenerator
{
    private static final /* synthetic */ Provider PROVIDER;
    private static final /* synthetic */ int[] lIllllIIllllII;
    private static final /* synthetic */ String[] lIllllIIlllIll;
    
    static String[] generate(final String llllllllllllIllllIlIIllllIllIIlI, final KeyPair llllllllllllIllllIlIIllllIlllIlI, final SecureRandom llllllllllllIllllIlIIllllIlllIIl) throws Exception {
        final PrivateKey llllllllllllIllllIlIIllllIlllIII = llllllllllllIllllIlIIllllIlllIlI.getPrivate();
        final X500Name llllllllllllIllllIlIIllllIllIlll = new X500Name(String.valueOf(new StringBuilder().append(BouncyCastleSelfSignedCertGenerator.lIllllIIlllIll[BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[0]]).append(llllllllllllIllllIlIIllllIllIIlI)));
        final X509v3CertificateBuilder llllllllllllIllllIlIIllllIllIllI = (X509v3CertificateBuilder)new JcaX509v3CertificateBuilder(llllllllllllIllllIlIIllllIllIlll, new BigInteger(BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[1], llllllllllllIllllIlIIllllIlllIIl), SelfSignedCertificate.NOT_BEFORE, SelfSignedCertificate.NOT_AFTER, llllllllllllIllllIlIIllllIllIlll, llllllllllllIllllIlIIllllIlllIlI.getPublic());
        final ContentSigner llllllllllllIllllIlIIllllIllIlIl = new JcaContentSignerBuilder(BouncyCastleSelfSignedCertGenerator.lIllllIIlllIll[BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[2]]).build(llllllllllllIllllIlIIllllIlllIII);
        final X509CertificateHolder llllllllllllIllllIlIIllllIllIlII = llllllllllllIllllIlIIllllIllIllI.build(llllllllllllIllllIlIIllllIllIlIl);
        final X509Certificate llllllllllllIllllIlIIllllIllIIll = new JcaX509CertificateConverter().setProvider(BouncyCastleSelfSignedCertGenerator.PROVIDER).getCertificate(llllllllllllIllllIlIIllllIllIlII);
        llllllllllllIllllIlIIllllIllIIll.verify(llllllllllllIllllIlIIllllIlllIlI.getPublic());
        return SelfSignedCertificate.newSelfSignedCertificate(llllllllllllIllllIlIIllllIllIIlI, llllllllllllIllllIlIIllllIlllIII, llllllllllllIllllIlIIllllIllIIll);
    }
    
    private BouncyCastleSelfSignedCertGenerator() {
    }
    
    private static String lIIIIlIIIlIlIIll(String llllllllllllIllllIlIIllllIIIlIlI, final String llllllllllllIllllIlIIllllIIIlllI) {
        llllllllllllIllllIlIIllllIIIlIlI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIllllIIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIllllIIIllIl = new StringBuilder();
        final char[] llllllllllllIllllIlIIllllIIIllII = llllllllllllIllllIlIIllllIIIlllI.toCharArray();
        int llllllllllllIllllIlIIllllIIIlIll = BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[0];
        final double llllllllllllIllllIlIIllllIIIIlIl = (Object)((String)llllllllllllIllllIlIIllllIIIlIlI).toCharArray();
        final int llllllllllllIllllIlIIllllIIIIlII = llllllllllllIllllIlIIllllIIIIlIl.length;
        String llllllllllllIllllIlIIllllIIIIIll = (String)BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[0];
        while (lIIIIlIIIlIlIlll((int)llllllllllllIllllIlIIllllIIIIIll, llllllllllllIllllIlIIllllIIIIlII)) {
            final char llllllllllllIllllIlIIllllIIlIIII = llllllllllllIllllIlIIllllIIIIlIl[llllllllllllIllllIlIIllllIIIIIll];
            llllllllllllIllllIlIIllllIIIllIl.append((char)(llllllllllllIllllIlIIllllIIlIIII ^ llllllllllllIllllIlIIllllIIIllII[llllllllllllIllllIlIIllllIIIlIll % llllllllllllIllllIlIIllllIIIllII.length]));
            "".length();
            ++llllllllllllIllllIlIIllllIIIlIll;
            ++llllllllllllIllllIlIIllllIIIIIll;
            "".length();
            if (-" ".length() == ((0x3A ^ 0x30) & ~(0xAC ^ 0xA6))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIllllIIIllIl);
    }
    
    private static boolean lIIIIlIIIlIlIlll(final int llllllllllllIllllIlIIlllIlllllll, final int llllllllllllIllllIlIIlllIllllllI) {
        return llllllllllllIllllIlIIlllIlllllll < llllllllllllIllllIlIIlllIllllllI;
    }
    
    private static void lIIIIlIIIlIlIlIl() {
        (lIllllIIlllIll = new String[BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[3]])[BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[0]] = lIIIIlIIIlIlIIll("GQZe", "ZHcWY");
        BouncyCastleSelfSignedCertGenerator.lIllllIIlllIll[BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[2]] = lIIIIlIIIlIlIlII("GlDXH+BzoCmdr7yCc5c3qu+jkDNZrzzR", "CJsqp");
    }
    
    static {
        lIIIIlIIIlIlIllI();
        lIIIIlIIIlIlIlIl();
        PROVIDER = (Provider)new BouncyCastleProvider();
    }
    
    private static String lIIIIlIIIlIlIlII(final String llllllllllllIllllIlIIllllIIlllIl, final String llllllllllllIllllIlIIllllIIlllII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIllllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIllllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIllllIlIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIllllIlIIIIl.init(BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[3], llllllllllllIllllIlIIllllIlIIIlI);
            return new String(llllllllllllIllllIlIIllllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIllllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIllllIlIIIII) {
            llllllllllllIllllIlIIllllIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIlIIIlIlIllI() {
        (lIllllIIllllII = new int[4])[0] = ((0x57 ^ 0x5A) & ~(0xA5 ^ 0xA8));
        BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[1] = (0x5C ^ 0x1C);
        BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[2] = " ".length();
        BouncyCastleSelfSignedCertGenerator.lIllllIIllllII[3] = "  ".length();
    }
}
