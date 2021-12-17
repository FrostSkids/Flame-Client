// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.net.ssl.SSLSessionContext;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManagerFactory;
import io.netty.buffer.ByteBufInputStream;
import java.security.cert.Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.KeyFactory;
import java.security.cert.CertificateFactory;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.Security;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.SSLException;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLContext;

public final class JdkSslServerContext extends JdkSslContext
{
    private static final /* synthetic */ int[] llIIIllIIIIIlI;
    private static final /* synthetic */ String[] llIIIlIlllllIl;
    private final /* synthetic */ SSLContext ctx;
    private final /* synthetic */ List<String> nextProtocols;
    
    public JdkSslServerContext(final File llllllllllllIlllIlIlIIlIIllIlllI, final File llllllllllllIlllIlIlIIlIIlllIIIl, final String llllllllllllIlllIlIlIIlIIlllIIII) throws SSLException {
        this(llllllllllllIlllIlIlIIlIIllIlllI, llllllllllllIlllIlIlIIlIIlllIIIl, llllllllllllIlllIlIlIIlIIlllIIII, null, null, 0L, 0L);
    }
    
    private static boolean lIIIlIIllllIllII(final int llllllllllllIlllIlIlIIIllIllIIIl) {
        return llllllllllllIlllIlIlIIIllIllIIIl == 0;
    }
    
    private static String lIIIlIIlllIlllIl(final String llllllllllllIlllIlIlIIIlllIIllIl, final String llllllllllllIlllIlIlIIIlllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIlllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIIlllIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIIlllIlIIIl.init(JdkSslServerContext.llIIIllIIIIIlI[2], llllllllllllIlllIlIlIIIlllIlIIlI);
            return new String(llllllllllllIlllIlIlIIIlllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIlllIlIIII) {
            llllllllllllIlllIlIlIIIlllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIllllIIllI() {
        (llIIIlIlllllIl = new String[JdkSslServerContext.llIIIllIIIIIlI[13]])[JdkSslServerContext.llIIIllIIIIIlI[0]] = lIIIlIIlllIlllIl("jvP5C0Jgy0Cmy7EY1vfdCA==", "GaihR");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[1]] = lIIIlIIlllIlllIl("7B7IHo9ewoE=", "daqWV");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[2]] = lIIIlIIllllIIIII("", "xDCNm");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[3]] = lIIIlIIllllIIIIl("vtcz1cZl4a7hv+DkB4zhjwSpytpYyV+b", "iNsLw");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[4]] = lIIIlIIllllIIIIl("Fp3XHsqq6bI8cgWYy9R9vyOCW9ZKb7x1MxaztqFMoOU=", "Nkmaf");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[5]] = lIIIlIIlllIlllIl("iRC0lF0PZIY=", "MiZSv");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[6]] = lIIIlIIllllIIIII("IBgR", "jSBqr");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[7]] = lIIIlIIllllIIIII("MmhHek4=", "jFrJw");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[8]] = lIIIlIIllllIIIIl("gfGiGHocpWE=", "ndwta");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[9]] = lIIIlIIlllIlllIl("x4qSYiLxZGg=", "laqBG");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[10]] = lIIIlIIlllIlllIl("2nKjhg8Hvf8=", "MJVJN");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[11]] = lIIIlIIllllIIIIl("8QbpXqy6E2k=", "ROYOR");
        JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[12]] = lIIIlIIllllIIIIl("j8jwnoguntjV98msSnLUmgoCgRhxG+X/572OLyHXPJrsqxUL5vODH6SbKPUh9MONXBtzwSGd0rY=", "iNeHN");
    }
    
    private static boolean lIIIlIIllllIlIll(final int llllllllllllIlllIlIlIIIllIllIIll) {
        return llllllllllllIlllIlIlIIIllIllIIll != 0;
    }
    
    public JdkSslServerContext(final File llllllllllllIlllIlIlIIlIIllllIIl, final File llllllllllllIlllIlIlIIlIIllllIll) throws SSLException {
        this(llllllllllllIlllIlIlIIlIIllllIIl, llllllllllllIlllIlIlIIlIIllllIll, null);
    }
    
    @Override
    public SSLContext context() {
        return this.ctx;
    }
    
    private static String lIIIlIIllllIIIIl(final String llllllllllllIlllIlIlIIIlllIIIIlI, final String llllllllllllIlllIlIlIIIlllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIIlllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), JdkSslServerContext.llIIIllIIIIIlI[8]), "DES");
            final Cipher llllllllllllIlllIlIlIIIlllIIIlII = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIIIlllIIIlII.init(JdkSslServerContext.llIIIllIIIIIlI[2], llllllllllllIlllIlIlIIIlllIIIlIl);
            return new String(llllllllllllIlllIlIlIIIlllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIIlllIIIIll) {
            llllllllllllIlllIlIlIIIlllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIllllIIlll() {
        (llIIIllIIIIIlI = new int[14])[0] = ((0x67 ^ 0x4B) & ~(0x6E ^ 0x42));
        JdkSslServerContext.llIIIllIIIIIlI[1] = " ".length();
        JdkSslServerContext.llIIIllIIIIIlI[2] = "  ".length();
        JdkSslServerContext.llIIIllIIIIIlI[3] = "   ".length();
        JdkSslServerContext.llIIIllIIIIIlI[4] = (0x94 ^ 0x90);
        JdkSslServerContext.llIIIllIIIIIlI[5] = (0x56 ^ 0x53);
        JdkSslServerContext.llIIIllIIIIIlI[6] = (0x10 ^ 0x16);
        JdkSslServerContext.llIIIllIIIIIlI[7] = (0x11 ^ 0x16);
        JdkSslServerContext.llIIIllIIIIIlI[8] = (0xCA ^ 0xA4 ^ (0x7F ^ 0x19));
        JdkSslServerContext.llIIIllIIIIIlI[9] = (115 + 150 - 111 + 7 ^ 50 + 100 - 124 + 142);
        JdkSslServerContext.llIIIllIIIIIlI[10] = (0x42 ^ 0x48);
        JdkSslServerContext.llIIIllIIIIIlI[11] = (43 + 84 - 55 + 82 ^ 16 + 95 - 50 + 84);
        JdkSslServerContext.llIIIllIIIIIlI[12] = (133 + 153 - 139 + 28 ^ 146 + 9 - 110 + 118);
        JdkSslServerContext.llIIIllIIIIIlI[13] = (30 + 129 - 97 + 102 ^ 167 + 126 - 271 + 147);
    }
    
    @Override
    public boolean isClient() {
        return JdkSslServerContext.llIIIllIIIIIlI[0] != 0;
    }
    
    private static boolean lIIIlIIllllIlIIl(final Object llllllllllllIlllIlIlIIIllIllIlIl) {
        return llllllllllllIlllIlIlIIIllIllIlIl == null;
    }
    
    public JdkSslServerContext(final File llllllllllllIlllIlIlIIlIIIlIllll, final File llllllllllllIlllIlIlIIlIIIlIIlIl, String llllllllllllIlllIlIlIIlIIIlIIlII, final Iterable<String> llllllllllllIlllIlIlIIlIIIlIIIll, final Iterable<String> llllllllllllIlllIlIlIIlIIIlIIIlI, final long llllllllllllIlllIlIlIIlIIIlIIIIl, final long llllllllllllIlllIlIlIIlIIIlIlIIl) throws SSLException {
        super(llllllllllllIlllIlIlIIlIIIlIIIll);
        if (lIIIlIIllllIlIIl(llllllllllllIlllIlIlIIlIIIlIllll)) {
            throw new NullPointerException(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[0]]);
        }
        if (lIIIlIIllllIlIIl(llllllllllllIlllIlIlIIlIIIlIIlIl)) {
            throw new NullPointerException(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[1]]);
        }
        if (lIIIlIIllllIlIIl(llllllllllllIlllIlIlIIlIIIlIIlII)) {
            llllllllllllIlllIlIlIIlIIIlIIlII = JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[2]];
        }
        if (lIIIlIIllllIlIlI(llllllllllllIlllIlIlIIlIIIlIIIlI) && lIIIlIIllllIlIll(llllllllllllIlllIlIlIIlIIIlIIIlI.iterator().hasNext() ? 1 : 0)) {
            if (lIIIlIIllllIllII(JettyNpnSslEngine.isAvailable() ? 1 : 0)) {
                throw new SSLException(String.valueOf(new StringBuilder().append(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[3]]).append(llllllllllllIlllIlIlIIlIIIlIIIlI)));
            }
            final List<String> llllllllllllIlllIlIlIIlIIlIIllII = new ArrayList<String>();
            final Iterator llllllllllllIlllIlIlIIlIIlIIllIl = llllllllllllIlllIlIlIIlIIIlIIIlI.iterator();
            while (lIIIlIIllllIlIll(llllllllllllIlllIlIlIIlIIlIIllIl.hasNext() ? 1 : 0)) {
                final String llllllllllllIlllIlIlIIlIIlIIlllI = llllllllllllIlllIlIlIIlIIlIIllIl.next();
                if (lIIIlIIllllIlIIl(llllllllllllIlllIlIlIIlIIlIIlllI)) {
                    "".length();
                    if (-(0x23 ^ 0x27) >= 0) {
                        throw null;
                    }
                    break;
                }
                else {
                    llllllllllllIlllIlIlIIlIIlIIllII.add(llllllllllllIlllIlIlIIlIIlIIlllI);
                    "".length();
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        throw null;
                    }
                    continue;
                }
            }
            this.nextProtocols = Collections.unmodifiableList((List<? extends String>)llllllllllllIlllIlIlIIlIIlIIllII);
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        else {
            this.nextProtocols = Collections.emptyList();
        }
        String llllllllllllIlllIlIlIIlIIIlIlIII = Security.getProperty(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[4]]);
        if (lIIIlIIllllIlIIl(llllllllllllIlllIlIlIIlIIIlIlIII)) {
            llllllllllllIlllIlIlIIlIIIlIlIII = JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[5]];
        }
        try {
            final KeyStore llllllllllllIlllIlIlIIlIIIlllllI = KeyStore.getInstance(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[6]]);
            llllllllllllIlllIlIlIIlIIIlllllI.load(null, null);
            final CertificateFactory llllllllllllIlllIlIlIIlIIIllllIl = CertificateFactory.getInstance(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[7]]);
            final KeyFactory llllllllllllIlllIlIlIIlIIIllllII = KeyFactory.getInstance(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[8]]);
            final KeyFactory llllllllllllIlllIlIlIIlIIIlllIll = KeyFactory.getInstance(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[9]]);
            final ByteBuf llllllllllllIlllIlIlIIlIIIlllIlI = PemReader.readPrivateKey(llllllllllllIlllIlIlIIlIIIlIIlIl);
            final byte[] llllllllllllIlllIlIlIIlIIIlllIIl = new byte[llllllllllllIlllIlIlIIlIIIlllIlI.readableBytes()];
            llllllllllllIlllIlIlIIlIIIlllIlI.readBytes(llllllllllllIlllIlIlIIlIIIlllIIl).release();
            "".length();
            final char[] llllllllllllIlllIlIlIIlIIIlllIII = ((String)llllllllllllIlllIlIlIIlIIIlIIlII).toCharArray();
            final PKCS8EncodedKeySpec llllllllllllIlllIlIlIIlIIIllIlll = generateKeySpec(llllllllllllIlllIlIlIIlIIIlllIII, llllllllllllIlllIlIlIIlIIIlllIIl);
            PrivateKey llllllllllllIlllIlIlIIlIIIllIllI;
            try {
                llllllllllllIlllIlIlIIlIIIllIllI = llllllllllllIlllIlIlIIlIIIllllII.generatePrivate(llllllllllllIlllIlIlIIlIIIllIlll);
                "".length();
                if (-" ".length() > -" ".length()) {
                    throw null;
                }
            }
            catch (InvalidKeySpecException llllllllllllIlllIlIlIIlIIlIIlIll) {
                llllllllllllIlllIlIlIIlIIIllIllI = llllllllllllIlllIlIlIIlIIIlllIll.generatePrivate(llllllllllllIlllIlIlIIlIIIllIlll);
            }
            final List<Certificate> llllllllllllIlllIlIlIIlIIIllIlIl = new ArrayList<Certificate>();
            final ByteBuf[] llllllllllllIlllIlIlIIlIIIllIlII = PemReader.readCertificates(llllllllllllIlllIlIlIIlIIIlIllll);
            try {
                final ByteBuf[] llllllllllllIlllIlIlIIlIIlIIlIIl = llllllllllllIlllIlIlIIlIIIllIlII;
                final int llllllllllllIlllIlIlIIlIIlIIlIII = llllllllllllIlllIlIlIIlIIlIIlIIl.length;
                int llllllllllllIlllIlIlIIlIIlIIIlll = JdkSslServerContext.llIIIllIIIIIlI[0];
                while (lIIIlIIllllIllIl(llllllllllllIlllIlIlIIlIIlIIIlll, llllllllllllIlllIlIlIIlIIlIIlIII)) {
                    final ByteBuf llllllllllllIlllIlIlIIlIIlIIlIlI = llllllllllllIlllIlIlIIlIIlIIlIIl[llllllllllllIlllIlIlIIlIIlIIIlll];
                    llllllllllllIlllIlIlIIlIIIllIlIl.add(llllllllllllIlllIlIlIIlIIIllllIl.generateCertificate(new ByteBufInputStream(llllllllllllIlllIlIlIIlIIlIIlIlI)));
                    "".length();
                    ++llllllllllllIlllIlIlIIlIIlIIIlll;
                    "".length();
                    if (((0x29 ^ 0x40 ^ (0x9E ^ 0xAA)) & (42 + 212 - 78 + 78 ^ 94 + 82 - 22 + 9 ^ -" ".length())) != 0x0) {
                        throw null;
                    }
                }
                final ByteBuf[] llllllllllllIlllIlIlIIlIIlIIIlIl = llllllllllllIlllIlIlIIlIIIllIlII;
                final int llllllllllllIlllIlIlIIlIIlIIIlII = llllllllllllIlllIlIlIIlIIlIIIlIl.length;
                int llllllllllllIlllIlIlIIlIIlIIIIll = JdkSslServerContext.llIIIllIIIIIlI[0];
                while (lIIIlIIllllIllIl(llllllllllllIlllIlIlIIlIIlIIIIll, llllllllllllIlllIlIlIIlIIlIIIlII)) {
                    final ByteBuf llllllllllllIlllIlIlIIlIIlIIIllI = llllllllllllIlllIlIlIIlIIlIIIlIl[llllllllllllIlllIlIlIIlIIlIIIIll];
                    llllllllllllIlllIlIlIIlIIlIIIllI.release();
                    "".length();
                    ++llllllllllllIlllIlIlIIlIIlIIIIll;
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                "".length();
                if ("   ".length() <= 0) {
                    throw null;
                }
            }
            finally {
                final ByteBuf[] llllllllllllIlllIlIlIIlIIlIIIIIl = llllllllllllIlllIlIlIIlIIIllIlII;
                final int llllllllllllIlllIlIlIIlIIlIIIIII = llllllllllllIlllIlIlIIlIIlIIIIIl.length;
                int llllllllllllIlllIlIlIIlIIIllllll = JdkSslServerContext.llIIIllIIIIIlI[0];
                while (lIIIlIIllllIllIl(llllllllllllIlllIlIlIIlIIIllllll, llllllllllllIlllIlIlIIlIIlIIIIII)) {
                    final ByteBuf llllllllllllIlllIlIlIIlIIlIIIIlI = llllllllllllIlllIlIlIIlIIlIIIIIl[llllllllllllIlllIlIlIIlIIIllllll];
                    llllllllllllIlllIlIlIIlIIlIIIIlI.release();
                    "".length();
                    ++llllllllllllIlllIlIlIIlIIIllllll;
                    "".length();
                    if ((0x7B ^ 0x7F) <= " ".length()) {
                        throw null;
                    }
                }
            }
            llllllllllllIlllIlIlIIlIIIlllllI.setKeyEntry(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[10]], llllllllllllIlllIlIlIIlIIIllIllI, llllllllllllIlllIlIlIIlIIIlllIII, llllllllllllIlllIlIlIIlIIIllIlIl.toArray(new Certificate[llllllllllllIlllIlIlIIlIIIllIlIl.size()]));
            final KeyManagerFactory llllllllllllIlllIlIlIIlIIIllIIll = KeyManagerFactory.getInstance(llllllllllllIlllIlIlIIlIIIlIlIII);
            llllllllllllIlllIlIlIIlIIIllIIll.init(llllllllllllIlllIlIlIIlIIIlllllI, llllllllllllIlllIlIlIIlIIIlllIII);
            this.ctx = SSLContext.getInstance(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[11]]);
            this.ctx.init(llllllllllllIlllIlIlIIlIIIllIIll.getKeyManagers(), null, null);
            final SSLSessionContext llllllllllllIlllIlIlIIlIIIllIIlI = this.ctx.getServerSessionContext();
            if (lIIIlIIllllIlllI(lIIIlIIllllIlIII(llllllllllllIlllIlIlIIlIIIlIIIIl, 0L))) {
                llllllllllllIlllIlIlIIlIIIllIIlI.setSessionCacheSize((int)Math.min(llllllllllllIlllIlIlIIlIIIlIIIIl, 2147483647L));
            }
            if (lIIIlIIllllIlllI(lIIIlIIllllIlIII(llllllllllllIlllIlIlIIlIIIlIlIIl, 0L))) {
                llllllllllllIlllIlIlIIlIIIllIIlI.setSessionTimeout((int)Math.min(llllllllllllIlllIlIlIIlIIIlIlIIl, 2147483647L));
            }
            "".length();
            if (" ".length() > (0x9B ^ 0xB4 ^ (0x11 ^ 0x3A))) {
                throw null;
            }
        }
        catch (Exception llllllllllllIlllIlIlIIlIIIllIIIl) {
            throw new SSLException(JdkSslServerContext.llIIIlIlllllIl[JdkSslServerContext.llIIIllIIIIIlI[12]], llllllllllllIlllIlIlIIlIIIllIIIl);
        }
    }
    
    private static PKCS8EncodedKeySpec generateKeySpec(final char[] llllllllllllIlllIlIlIIIlllllllII, final byte[] llllllllllllIlllIlIlIIIlllllIlII) throws InvalidKeyException, InvalidKeySpecException, InvalidAlgorithmParameterException, NoSuchPaddingException, NoSuchAlgorithmException, IOException {
        if (!lIIIlIIllllIlIlI(llllllllllllIlllIlIlIIIlllllllII) || lIIIlIIllllIllII(llllllllllllIlllIlIlIIIlllllllII.length)) {
            return new PKCS8EncodedKeySpec(llllllllllllIlllIlIlIIIlllllIlII);
        }
        final EncryptedPrivateKeyInfo llllllllllllIlllIlIlIIIllllllIlI = new EncryptedPrivateKeyInfo(llllllllllllIlllIlIlIIIlllllIlII);
        final SecretKeyFactory llllllllllllIlllIlIlIIIllllllIIl = SecretKeyFactory.getInstance(llllllllllllIlllIlIlIIIllllllIlI.getAlgName());
        final PBEKeySpec llllllllllllIlllIlIlIIIllllllIII = new PBEKeySpec(llllllllllllIlllIlIlIIIlllllllII);
        final SecretKey llllllllllllIlllIlIlIIIlllllIlll = llllllllllllIlllIlIlIIIllllllIIl.generateSecret(llllllllllllIlllIlIlIIIllllllIII);
        final Cipher llllllllllllIlllIlIlIIIlllllIllI = Cipher.getInstance(llllllllllllIlllIlIlIIIllllllIlI.getAlgName());
        llllllllllllIlllIlIlIIIlllllIllI.init(JdkSslServerContext.llIIIllIIIIIlI[2], llllllllllllIlllIlIlIIIlllllIlll, llllllllllllIlllIlIlIIIllllllIlI.getAlgParameters());
        return llllllllllllIlllIlIlIIIllllllIlI.getKeySpec(llllllllllllIlllIlIlIIIlllllIllI);
    }
    
    private static boolean lIIIlIIllllIlllI(final int llllllllllllIlllIlIlIIIllIlIllll) {
        return llllllllllllIlllIlIlIIIllIlIllll > 0;
    }
    
    private static boolean lIIIlIIllllIlIlI(final Object llllllllllllIlllIlIlIIIllIllIlll) {
        return llllllllllllIlllIlIlIIIllIllIlll != null;
    }
    
    static {
        lIIIlIIllllIIlll();
        lIIIlIIllllIIllI();
    }
    
    private static boolean lIIIlIIllllIllIl(final int llllllllllllIlllIlIlIIIllIlllIlI, final int llllllllllllIlllIlIlIIIllIlllIIl) {
        return llllllllllllIlllIlIlIIIllIlllIlI < llllllllllllIlllIlIlIIIllIlllIIl;
    }
    
    @Override
    public List<String> nextProtocols() {
        return this.nextProtocols;
    }
    
    private static String lIIIlIIllllIIIII(String llllllllllllIlllIlIlIIIlllIlllll, final String llllllllllllIlllIlIlIIIllllIIIll) {
        llllllllllllIlllIlIlIIIlllIlllll = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIlIIIlllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIIIllllIIIlI = new StringBuilder();
        final char[] llllllllllllIlllIlIlIIIllllIIIIl = llllllllllllIlllIlIlIIIllllIIIll.toCharArray();
        int llllllllllllIlllIlIlIIIllllIIIII = JdkSslServerContext.llIIIllIIIIIlI[0];
        final char llllllllllllIlllIlIlIIIlllIllIlI = (Object)((String)llllllllllllIlllIlIlIIIlllIlllll).toCharArray();
        final double llllllllllllIlllIlIlIIIlllIllIIl = llllllllllllIlllIlIlIIIlllIllIlI.length;
        float llllllllllllIlllIlIlIIIlllIllIII = JdkSslServerContext.llIIIllIIIIIlI[0];
        while (lIIIlIIllllIllIl((int)llllllllllllIlllIlIlIIIlllIllIII, (int)llllllllllllIlllIlIlIIIlllIllIIl)) {
            final char llllllllllllIlllIlIlIIIllllIIlIl = llllllllllllIlllIlIlIIIlllIllIlI[llllllllllllIlllIlIlIIIlllIllIII];
            llllllllllllIlllIlIlIIIllllIIIlI.append((char)(llllllllllllIlllIlIlIIIllllIIlIl ^ llllllllllllIlllIlIlIIIllllIIIIl[llllllllllllIlllIlIlIIIllllIIIII % llllllllllllIlllIlIlIIIllllIIIIl.length]));
            "".length();
            ++llllllllllllIlllIlIlIIIllllIIIII;
            ++llllllllllllIlllIlIlIIIlllIllIII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIIIllllIIIlI);
    }
    
    private static int lIIIlIIllllIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
