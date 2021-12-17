// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import javax.net.ssl.SSLSessionContext;
import javax.security.auth.x500.X500Principal;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.security.cert.Certificate;
import io.netty.buffer.ByteBufInputStream;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateFactory;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLContext;

public final class JdkSslClientContext extends JdkSslContext
{
    private final /* synthetic */ SSLContext ctx;
    private static final /* synthetic */ int[] lllIIlIIllllII;
    private final /* synthetic */ List<String> nextProtocols;
    private static final /* synthetic */ String[] lllIIlIIlllIlI;
    
    static {
        lIIlllllIlllllll();
        lIIlllllIllIlIll();
    }
    
    public JdkSslClientContext(final File llllllllllllIlIllllIlIlIIllIIlll) throws SSLException {
        this(llllllllllllIlIllllIlIlIIllIIlll, null);
    }
    
    private static String lIIlllllIllIlIlI(final String llllllllllllIlIllllIlIIlllIllIll, final String llllllllllllIlIllllIlIIlllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIIlllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), JdkSslClientContext.lllIIlIIllllII[8]), "DES");
            final Cipher llllllllllllIlIllllIlIIlllIlllIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIlIIlllIlllIl.init(JdkSslClientContext.lllIIlIIllllII[2], llllllllllllIlIllllIlIIlllIllllI);
            return new String(llllllllllllIlIllllIlIIlllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIIlllIlllII) {
            llllllllllllIlIllllIlIIlllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllllIIIIIlI(final int llllllllllllIlIllllIlIIlllIIllII) {
        return llllllllllllIlIllllIlIIlllIIllII != 0;
    }
    
    private static String lIIlllllIllIIllI(final String llllllllllllIlIllllIlIIllllllllI, final String llllllllllllIlIllllIlIIlllllllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlIlIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlIIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIlIlIIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIlIlIIIIIIIlI.init(JdkSslClientContext.lllIIlIIllllII[2], llllllllllllIlIllllIlIlIIIIIIIll);
            return new String(llllllllllllIlIllllIlIlIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlIIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlIlIIIIIIIIl) {
            llllllllllllIlIllllIlIlIIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllllIIIIlII(final Object llllllllllllIlIllllIlIIlllIIlllI) {
        return llllllllllllIlIllllIlIIlllIIlllI == null;
    }
    
    public JdkSslClientContext() throws SSLException {
        this(null, null, null, null, 0L, 0L);
    }
    
    private static void lIIlllllIllIlIll() {
        (lllIIlIIlllIlI = new String[JdkSslClientContext.lllIIlIIllllII[7]])[JdkSslClientContext.lllIIlIIllllII[0]] = lIIlllllIllIIllI("hpLeE9Fiu7P+AiTc5I/TE2FWVm+dY7QM", "vEScX");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[1]] = lIIlllllIllIIllI("+PditKfmMwY=", "Giejh");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[2]] = lIIlllllIllIIlll("Mzki", "yrqZo");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[3]] = lIIlllllIllIIlll("E3pbSGE=", "KTnxX");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[4]] = lIIlllllIllIIllI("/Moy5VreJ7U=", "hUQYF");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[5]] = lIIlllllIllIlIlI("MZ2QBdTZ8Xk=", "RbdWk");
        JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[6]] = lIIlllllIllIIlll("AysnFgYBajoVQwwkJw4KBCYnAAZFPiYfQxYvPAwGF2c9EwcAah0pL0UpIRQXADI6", "eJNzc");
    }
    
    @Override
    public boolean isClient() {
        return JdkSslClientContext.lllIIlIIllllII[1] != 0;
    }
    
    private static boolean lIIllllllIIIIIll(final int llllllllllllIlIllllIlIIlllIIlIlI) {
        return llllllllllllIlIllllIlIIlllIIlIlI == 0;
    }
    
    private static int lIIllllllIIIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public JdkSslClientContext(final File llllllllllllIlIllllIlIlIIIlIlIIl, TrustManagerFactory llllllllllllIlIllllIlIlIIIlIIIIl, final Iterable<String> llllllllllllIlIllllIlIlIIIlIIlll, final Iterable<String> llllllllllllIlIllllIlIlIIIlIIllI, final long llllllllllllIlIllllIlIlIIIlIIlIl, final long llllllllllllIlIllllIlIlIIIlIIlII) throws SSLException {
        super(llllllllllllIlIllllIlIlIIIlIIlll);
        if (lIIllllllIIIIIIl(llllllllllllIlIllllIlIlIIIlIIllI) && lIIllllllIIIIIlI(llllllllllllIlIllllIlIlIIIlIIllI.iterator().hasNext() ? 1 : 0)) {
            if (lIIllllllIIIIIll(JettyNpnSslEngine.isAvailable() ? 1 : 0)) {
                throw new SSLException(String.valueOf(new StringBuilder().append(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[0]]).append(llllllllllllIlIllllIlIlIIIlIIllI)));
            }
            final List<String> llllllllllllIlIllllIlIlIIIlllllI = new ArrayList<String>();
            final Iterator llllllllllllIlIllllIlIlIIIllllll = llllllllllllIlIllllIlIlIIIlIIllI.iterator();
            while (lIIllllllIIIIIlI(llllllllllllIlIllllIlIlIIIllllll.hasNext() ? 1 : 0)) {
                final String llllllllllllIlIllllIlIlIIlIIIIII = llllllllllllIlIllllIlIlIIIllllll.next();
                if (lIIllllllIIIIlII(llllllllllllIlIllllIlIlIIlIIIIII)) {
                    "".length();
                    if (-(0x52 ^ 0x57) >= 0) {
                        throw null;
                    }
                    break;
                }
                else {
                    llllllllllllIlIllllIlIlIIIlllllI.add(llllllllllllIlIllllIlIlIIlIIIIII);
                    "".length();
                    "".length();
                    if ("  ".length() <= ((139 + 145 - 136 + 4 ^ 16 + 9 + 96 + 19) & (0x29 ^ 0x4B ^ (0xC7 ^ 0xB1) ^ -" ".length()))) {
                        throw null;
                    }
                    continue;
                }
            }
            this.nextProtocols = Collections.unmodifiableList((List<? extends String>)llllllllllllIlIllllIlIlIIIlllllI);
            "".length();
            if (-(0xA5 ^ 0xC2 ^ (0xCB ^ 0xA8)) > 0) {
                throw null;
            }
        }
        else {
            this.nextProtocols = Collections.emptyList();
        }
        try {
            if (lIIllllllIIIIlII(llllllllllllIlIllllIlIlIIIlIlIIl)) {
                this.ctx = SSLContext.getInstance(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[1]]);
                if (lIIllllllIIIIlII(llllllllllllIlIllllIlIlIIIlIIIIl)) {
                    this.ctx.init(null, null, null);
                    "".length();
                    if ((38 + 57 - 2 + 88 ^ 31 + 15 + 36 + 95) <= "  ".length()) {
                        throw null;
                    }
                }
                else {
                    ((TrustManagerFactory)llllllllllllIlIllllIlIlIIIlIIIIl).init((KeyStore)null);
                    this.ctx.init(null, ((TrustManagerFactory)llllllllllllIlIllllIlIlIIIlIIIIl).getTrustManagers(), null);
                    "".length();
                    if (-"  ".length() > 0) {
                        throw null;
                    }
                }
            }
            else {
                final KeyStore llllllllllllIlIllllIlIlIIIlIllll = KeyStore.getInstance(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[2]]);
                llllllllllllIlIllllIlIlIIIlIllll.load(null, null);
                final CertificateFactory llllllllllllIlIllllIlIlIIIlIlllI = CertificateFactory.getInstance(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[3]]);
                final ByteBuf[] llllllllllllIlIllllIlIlIIIlIllIl = PemReader.readCertificates(llllllllllllIlIllllIlIlIIIlIlIIl);
                try {
                    final ByteBuf[] llllllllllllIlIllllIlIlIIIlllIlI = llllllllllllIlIllllIlIlIIIlIllIl;
                    final int llllllllllllIlIllllIlIlIIIlllIIl = llllllllllllIlIllllIlIlIIIlllIlI.length;
                    int llllllllllllIlIllllIlIlIIIlllIII = JdkSslClientContext.lllIIlIIllllII[0];
                    while (lIIllllllIIIIlIl(llllllllllllIlIllllIlIlIIIlllIII, llllllllllllIlIllllIlIlIIIlllIIl)) {
                        final ByteBuf llllllllllllIlIllllIlIlIIIlllIll = llllllllllllIlIllllIlIlIIIlllIlI[llllllllllllIlIllllIlIlIIIlllIII];
                        final X509Certificate llllllllllllIlIllllIlIlIIIllllIl = (X509Certificate)llllllllllllIlIllllIlIlIIIlIlllI.generateCertificate(new ByteBufInputStream(llllllllllllIlIllllIlIlIIIlllIll));
                        final X500Principal llllllllllllIlIllllIlIlIIIllllII = llllllllllllIlIllllIlIlIIIllllIl.getSubjectX500Principal();
                        llllllllllllIlIllllIlIlIIIlIllll.setCertificateEntry(llllllllllllIlIllllIlIlIIIllllII.getName(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[4]]), llllllllllllIlIllllIlIlIIIllllIl);
                        ++llllllllllllIlIllllIlIlIIIlllIII;
                        "".length();
                        if (-(0xD2 ^ 0xA6 ^ (0xF9 ^ 0x89)) > 0) {
                            throw null;
                        }
                    }
                    final ByteBuf[] llllllllllllIlIllllIlIlIIIllIllI = llllllllllllIlIllllIlIlIIIlIllIl;
                    final int llllllllllllIlIllllIlIlIIIllIlIl = llllllllllllIlIllllIlIlIIIllIllI.length;
                    int llllllllllllIlIllllIlIlIIIllIlII = JdkSslClientContext.lllIIlIIllllII[0];
                    while (lIIllllllIIIIlIl(llllllllllllIlIllllIlIlIIIllIlII, llllllllllllIlIllllIlIlIIIllIlIl)) {
                        final ByteBuf llllllllllllIlIllllIlIlIIIllIlll = llllllllllllIlIllllIlIlIIIllIllI[llllllllllllIlIllllIlIlIIIllIlII];
                        llllllllllllIlIllllIlIlIIIllIlll.release();
                        "".length();
                        ++llllllllllllIlIllllIlIlIIIllIlII;
                        "".length();
                        if (-"   ".length() > 0) {
                            throw null;
                        }
                    }
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                finally {
                    final ByteBuf[] llllllllllllIlIllllIlIlIIIllIIlI = llllllllllllIlIllllIlIlIIIlIllIl;
                    final int llllllllllllIlIllllIlIlIIIllIIIl = llllllllllllIlIllllIlIlIIIllIIlI.length;
                    int llllllllllllIlIllllIlIlIIIllIIII = JdkSslClientContext.lllIIlIIllllII[0];
                    while (lIIllllllIIIIlIl(llllllllllllIlIllllIlIlIIIllIIII, llllllllllllIlIllllIlIlIIIllIIIl)) {
                        final ByteBuf llllllllllllIlIllllIlIlIIIllIIll = llllllllllllIlIllllIlIlIIIllIIlI[llllllllllllIlIllllIlIlIIIllIIII];
                        llllllllllllIlIllllIlIlIIIllIIll.release();
                        "".length();
                        ++llllllllllllIlIllllIlIlIIIllIIII;
                        "".length();
                        if (((0xCB ^ 0x95) & ~(0x4B ^ 0x15)) >= "  ".length()) {
                            throw null;
                        }
                    }
                }
                if (lIIllllllIIIIlII(llllllllllllIlIllllIlIlIIIlIIIIl)) {
                    llllllllllllIlIllllIlIlIIIlIIIIl = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                }
                ((TrustManagerFactory)llllllllllllIlIllllIlIlIIIlIIIIl).init(llllllllllllIlIllllIlIlIIIlIllll);
                this.ctx = SSLContext.getInstance(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[5]]);
                this.ctx.init(null, ((TrustManagerFactory)llllllllllllIlIllllIlIlIIIlIIIIl).getTrustManagers(), null);
            }
            final SSLSessionContext llllllllllllIlIllllIlIlIIIlIllII = this.ctx.getClientSessionContext();
            if (lIIllllllIIIIllI(lIIllllllIIIIIII(llllllllllllIlIllllIlIlIIIlIIlIl, 0L))) {
                llllllllllllIlIllllIlIlIIIlIllII.setSessionCacheSize((int)Math.min(llllllllllllIlIllllIlIlIIIlIIlIl, 2147483647L));
            }
            if (lIIllllllIIIIllI(lIIllllllIIIIIII(llllllllllllIlIllllIlIlIIIlIIlII, 0L))) {
                llllllllllllIlIllllIlIlIIIlIllII.setSessionTimeout((int)Math.min(llllllllllllIlIllllIlIlIIIlIIlII, 2147483647L));
            }
            "".length();
            if (((0x14 ^ 0x6A ^ (0x20 ^ 0x70)) & (165 + 188 - 204 + 84 ^ 189 + 81 - 192 + 121 ^ -" ".length())) > ((82 + 23 + 82 + 25 ^ 64 + 89 - 148 + 138) & (0x30 ^ 0x26 ^ (0x5E ^ 0x13) ^ -" ".length()))) {
                throw null;
            }
        }
        catch (Exception llllllllllllIlIllllIlIlIIIlIlIll) {
            throw new SSLException(JdkSslClientContext.lllIIlIIlllIlI[JdkSslClientContext.lllIIlIIllllII[6]], llllllllllllIlIllllIlIlIIIlIlIll);
        }
    }
    
    private static String lIIlllllIllIIlll(String llllllllllllIlIllllIlIIllllIlIll, final String llllllllllllIlIllllIlIIllllIllll) {
        llllllllllllIlIllllIlIIllllIlIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIlIIllllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIlIIllllIlllI = new StringBuilder();
        final char[] llllllllllllIlIllllIlIIllllIllIl = llllllllllllIlIllllIlIIllllIllll.toCharArray();
        int llllllllllllIlIllllIlIIllllIllII = JdkSslClientContext.lllIIlIIllllII[0];
        final short llllllllllllIlIllllIlIIllllIIllI = (Object)((String)llllllllllllIlIllllIlIIllllIlIll).toCharArray();
        final char llllllllllllIlIllllIlIIllllIIlIl = (char)llllllllllllIlIllllIlIIllllIIllI.length;
        short llllllllllllIlIllllIlIIllllIIlII = (short)JdkSslClientContext.lllIIlIIllllII[0];
        while (lIIllllllIIIIlIl(llllllllllllIlIllllIlIIllllIIlII, llllllllllllIlIllllIlIIllllIIlIl)) {
            final char llllllllllllIlIllllIlIIlllllIIIl = llllllllllllIlIllllIlIIllllIIllI[llllllllllllIlIllllIlIIllllIIlII];
            llllllllllllIlIllllIlIIllllIlllI.append((char)(llllllllllllIlIllllIlIIlllllIIIl ^ llllllllllllIlIllllIlIIllllIllIl[llllllllllllIlIllllIlIIllllIllII % llllllllllllIlIllllIlIIllllIllIl.length]));
            "".length();
            ++llllllllllllIlIllllIlIIllllIllII;
            ++llllllllllllIlIllllIlIIllllIIlII;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIlIIllllIlllI);
    }
    
    @Override
    public List<String> nextProtocols() {
        return this.nextProtocols;
    }
    
    private static boolean lIIllllllIIIIlIl(final int llllllllllllIlIllllIlIIlllIlIIll, final int llllllllllllIlIllllIlIIlllIlIIlI) {
        return llllllllllllIlIllllIlIIlllIlIIll < llllllllllllIlIllllIlIIlllIlIIlI;
    }
    
    private static boolean lIIllllllIIIIllI(final int llllllllllllIlIllllIlIIlllIIlIII) {
        return llllllllllllIlIllllIlIIlllIIlIII > 0;
    }
    
    public JdkSslClientContext(final File llllllllllllIlIllllIlIlIIlIlIlll, final TrustManagerFactory llllllllllllIlIllllIlIlIIlIlIllI) throws SSLException {
        this(llllllllllllIlIllllIlIlIIlIlIlll, llllllllllllIlIllllIlIlIIlIlIllI, null, null, 0L, 0L);
    }
    
    private static boolean lIIllllllIIIIIIl(final Object llllllllllllIlIllllIlIIlllIlIIII) {
        return llllllllllllIlIllllIlIIlllIlIIII != null;
    }
    
    public JdkSslClientContext(final TrustManagerFactory llllllllllllIlIllllIlIlIIlIlllll) throws SSLException {
        this(null, llllllllllllIlIllllIlIlIIlIlllll);
    }
    
    @Override
    public SSLContext context() {
        return this.ctx;
    }
    
    private static void lIIlllllIlllllll() {
        (lllIIlIIllllII = new int[9])[0] = ((0x70 ^ 0x5 ^ (0x7C ^ 0x37)) & (78 + 162 - 177 + 110 ^ 115 + 78 - 171 + 125 ^ -" ".length()));
        JdkSslClientContext.lllIIlIIllllII[1] = " ".length();
        JdkSslClientContext.lllIIlIIllllII[2] = "  ".length();
        JdkSslClientContext.lllIIlIIllllII[3] = "   ".length();
        JdkSslClientContext.lllIIlIIllllII[4] = (28 + 16 + 74 + 53 ^ 110 + 47 - 20 + 38);
        JdkSslClientContext.lllIIlIIllllII[5] = (0xB5 ^ 0xB0);
        JdkSslClientContext.lllIIlIIllllII[6] = (0x80 ^ 0xA1 ^ (0x41 ^ 0x66));
        JdkSslClientContext.lllIIlIIllllII[7] = (0xF4 ^ 0xC5 ^ (0x5C ^ 0x6A));
        JdkSslClientContext.lllIIlIIllllII[8] = (0x5C ^ 0x54);
    }
}
