// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.Collection;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Arrays;
import javax.net.ssl.SSLEngine;
import io.netty.buffer.ByteBufAllocator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import org.apache.tomcat.jni.SSL;
import javax.net.ssl.SSLException;
import org.apache.tomcat.jni.SSLContext;
import org.apache.tomcat.jni.Pool;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import io.netty.util.internal.logging.InternalLogger;
import java.util.List;

public final class OpenSslServerContext extends SslContext
{
    private final /* synthetic */ OpenSslSessionStats stats;
    private final /* synthetic */ List<String> ciphers;
    private final /* synthetic */ long ctx;
    private final /* synthetic */ long sessionCacheSize;
    private final /* synthetic */ List<String> unmodifiableCiphers;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIlIIIIIIllIll;
    private final /* synthetic */ long aprPool;
    private static final /* synthetic */ List<String> DEFAULT_CIPHERS;
    private final /* synthetic */ long sessionTimeout;
    private final /* synthetic */ List<String> nextProtocols;
    private static final /* synthetic */ String[] lIlIIIIIIlIlII;
    
    @Override
    public List<String> cipherSuites() {
        return this.unmodifiableCiphers;
    }
    
    public OpenSslServerContext(final File lllllllllllllIIlIIIlIIllIIllIIll, final File lllllllllllllIIlIIIlIIllIIlIlIII, String lllllllllllllIIlIIIlIIllIIllIIIl, Iterable<String> lllllllllllllIIlIIIlIIllIIlIIllI, Iterable<String> lllllllllllllIIlIIIlIIllIIlIIlIl, long lllllllllllllIIlIIIlIIllIIlIlllI, long lllllllllllllIIlIIIlIIllIIlIllIl) throws SSLException {
        this.ciphers = new ArrayList<String>();
        this.unmodifiableCiphers = Collections.unmodifiableList((List<? extends String>)this.ciphers);
        OpenSsl.ensureAvailability();
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIIllIIll)) {
            throw new NullPointerException(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[0]]);
        }
        if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIllIIll.isFile() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[1]]).append(lllllllllllllIIlIIIlIIllIIllIIll)));
        }
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIIlIlIII)) {
            throw new NullPointerException(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[2]]);
        }
        if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIlIlIII.isFile() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[3]]).append(lllllllllllllIIlIIIlIIllIIlIlIII)));
        }
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIIlIIllI)) {
            lllllllllllllIIlIIIlIIllIIlIIllI = OpenSslServerContext.DEFAULT_CIPHERS;
        }
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIIllIIIl)) {
            lllllllllllllIIlIIIlIIllIIllIIIl = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[4]];
        }
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIIlIIlIl)) {
            lllllllllllllIIlIIIlIIllIIlIIlIl = (Iterable<String>)Collections.emptyList();
        }
        final Iterator lllllllllllllIIlIIIlIIllIlIIIIll = lllllllllllllIIlIIIlIIllIIlIIllI.iterator();
        while (lllIIIIIIIlllII(lllllllllllllIIlIIIlIIllIlIIIIll.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIIIlIIllIlIIIlII = lllllllllllllIIlIIIlIIllIlIIIIll.next();
            if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIlIIIlII)) {
                "".length();
                if ("   ".length() < ("   ".length() & ~"   ".length())) {
                    throw null;
                }
                break;
            }
            else {
                this.ciphers.add(lllllllllllllIIlIIIlIIllIlIIIlII);
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    throw null;
                }
                continue;
            }
        }
        final List<String> lllllllllllllIIlIIIlIIllIIlIllII = new ArrayList<String>();
        final Iterator lllllllllllllIIlIIIlIIllIlIIIIIl = lllllllllllllIIlIIIlIIllIIlIIlIl.iterator();
        while (lllIIIIIIIlllII(lllllllllllllIIlIIIlIIllIlIIIIIl.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIIIlIIllIlIIIIlI = lllllllllllllIIlIIIlIIllIlIIIIIl.next();
            if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIllIlIIIIlI)) {
                "".length();
                if (null != null) {
                    throw null;
                }
                break;
            }
            else {
                lllllllllllllIIlIIIlIIllIIlIllII.add(lllllllllllllIIlIIIlIIllIlIIIIlI);
                "".length();
                "".length();
                if (null != null) {
                    throw null;
                }
                continue;
            }
        }
        this.nextProtocols = Collections.unmodifiableList((List<? extends String>)lllllllllllllIIlIIIlIIllIIlIllII);
        this.aprPool = Pool.create(0L);
        boolean lllllllllllllIIlIIIlIIllIIlIlIll = OpenSslServerContext.lIlIIIIIIllIll[0] != 0;
        try {
            synchronized (OpenSslServerContext.class) {
                try {
                    this.ctx = SSLContext.make(this.aprPool, OpenSslServerContext.lIlIIIIIIllIll[5], OpenSslServerContext.lIlIIIIIIllIll[1]);
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                catch (Exception lllllllllllllIIlIIIlIIllIlIIIIII) {
                    throw new SSLException(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[6]], lllllllllllllIIlIIIlIIllIlIIIIII);
                }
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[7]);
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[8]);
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[9]);
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[10]);
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[11]);
                SSLContext.setOptions(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[12]);
                try {
                    final StringBuilder lllllllllllllIIlIIIlIIllIIllllIl = new StringBuilder();
                    final Iterator lllllllllllllIIlIIIlIIllIIlllllI = this.ciphers.iterator();
                    while (lllIIIIIIIlllII(lllllllllllllIIlIIIlIIllIIlllllI.hasNext() ? 1 : 0)) {
                        final String lllllllllllllIIlIIIlIIllIIllllll = lllllllllllllIIlIIIlIIllIIlllllI.next();
                        lllllllllllllIIlIIIlIIllIIllllIl.append(lllllllllllllIIlIIIlIIllIIllllll);
                        "".length();
                        lllllllllllllIIlIIIlIIllIIllllIl.append((char)OpenSslServerContext.lIlIIIIIIllIll[13]);
                        "".length();
                        "".length();
                        if ("   ".length() == 0) {
                            throw null;
                        }
                    }
                    lllllllllllllIIlIIIlIIllIIllllIl.setLength(lllllllllllllIIlIIIlIIllIIllllIl.length() - OpenSslServerContext.lIlIIIIIIllIll[1]);
                    SSLContext.setCipherSuite(this.ctx, String.valueOf(lllllllllllllIIlIIIlIIllIIllllIl));
                    "".length();
                    "".length();
                    if (" ".length() <= 0) {
                        throw null;
                    }
                }
                catch (SSLException lllllllllllllIIlIIIlIIllIIllllII) {
                    throw lllllllllllllIIlIIIlIIllIIllllII;
                }
                catch (Exception lllllllllllllIIlIIIlIIllIIlllIll) {
                    throw new SSLException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[5]]).append(this.ciphers)), lllllllllllllIIlIIIlIIllIIlllIll);
                }
                SSLContext.setVerify(this.ctx, OpenSslServerContext.lIlIIIIIIllIll[0], OpenSslServerContext.lIlIIIIIIllIll[14]);
                try {
                    if (lllIIIIIIIllIll(SSLContext.setCertificate(this.ctx, lllllllllllllIIlIIIlIIllIIllIIll.getPath(), lllllllllllllIIlIIIlIIllIIlIlIII.getPath(), lllllllllllllIIlIIIlIIllIIllIIIl, OpenSslServerContext.lIlIIIIIIllIll[0]) ? 1 : 0)) {
                        throw new SSLException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[15]]).append(lllllllllllllIIlIIIlIIllIIllIIll).append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[16]]).append(lllllllllllllIIlIIIlIIllIIlIlIII).append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[17]]).append(SSL.getLastError()).append((char)OpenSslServerContext.lIlIIIIIIllIll[18])));
                    }
                    "".length();
                    if ("   ".length() <= 0) {
                        throw null;
                    }
                }
                catch (SSLException lllllllllllllIIlIIIlIIllIIlllIlI) {
                    throw lllllllllllllIIlIIIlIIllIIlllIlI;
                }
                catch (Exception lllllllllllllIIlIIIlIIllIIlllIIl) {
                    throw new SSLException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[14]]).append(lllllllllllllIIlIIIlIIllIIllIIll).append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[19]]).append(lllllllllllllIIlIIIlIIllIIlIlIII)), lllllllllllllIIlIIIlIIllIIlllIIl);
                }
                if (lllIIIIIIIllIll(SSLContext.setCertificateChainFile(this.ctx, lllllllllllllIIlIIIlIIllIIllIIll.getPath(), (boolean)(OpenSslServerContext.lIlIIIIIIllIll[1] != 0)) ? 1 : 0)) {
                    final String lllllllllllllIIlIIIlIIllIIlllIII = SSL.getLastError();
                    if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIlllIII.startsWith(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[20]]) ? 1 : 0)) {
                        throw new SSLException(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[21]]).append(lllllllllllllIIlIIIlIIllIIllIIll).append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[22]]).append(SSL.getLastError()).append((char)OpenSslServerContext.lIlIIIIIIllIll[18])));
                    }
                }
                if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIlIllII.isEmpty() ? 1 : 0)) {
                    final StringBuilder lllllllllllllIIlIIIlIIllIIllIlIl = new StringBuilder();
                    final Iterator lllllllllllllIIlIIIlIIllIIllIllI = lllllllllllllIIlIIIlIIllIIlIllII.iterator();
                    while (lllIIIIIIIlllII(lllllllllllllIIlIIIlIIllIIllIllI.hasNext() ? 1 : 0)) {
                        final String lllllllllllllIIlIIIlIIllIIllIlll = lllllllllllllIIlIIIlIIllIIllIllI.next();
                        lllllllllllllIIlIIIlIIllIIllIlIl.append(lllllllllllllIIlIIIlIIllIIllIlll);
                        "".length();
                        lllllllllllllIIlIIIlIIllIIllIlIl.append((char)OpenSslServerContext.lIlIIIIIIllIll[23]);
                        "".length();
                        "".length();
                        if (" ".length() == (0xDD ^ 0xB7 ^ (0x36 ^ 0x58))) {
                            throw null;
                        }
                    }
                    lllllllllllllIIlIIIlIIllIIllIlIl.setLength(lllllllllllllIIlIIIlIIllIIllIlIl.length() - OpenSslServerContext.lIlIIIIIIllIll[1]);
                    SSLContext.setNextProtos(this.ctx, String.valueOf(lllllllllllllIIlIIIlIIllIIllIlIl));
                }
                if (lllIIIIIIIlllIl(lllIIIIIIIllIIl(lllllllllllllIIlIIIlIIllIIlIlllI, 0L))) {
                    this.sessionCacheSize = lllllllllllllIIlIIIlIIllIIlIlllI;
                    SSLContext.setSessionCacheSize(this.ctx, lllllllllllllIIlIIIlIIllIIlIlllI);
                    "".length();
                    if ("   ".length() == " ".length()) {
                        throw null;
                    }
                }
                else {
                    lllllllllllllIIlIIIlIIllIIlIlllI = (this.sessionCacheSize = SSLContext.setSessionCacheSize(this.ctx, 20480L));
                    SSLContext.setSessionCacheSize(this.ctx, lllllllllllllIIlIIIlIIllIIlIlllI);
                }
                if (lllIIIIIIIlllIl(lllIIIIIIIllIIl(lllllllllllllIIlIIIlIIllIIlIllIl, 0L))) {
                    this.sessionTimeout = lllllllllllllIIlIIIlIIllIIlIllIl;
                    SSLContext.setSessionCacheTimeout(this.ctx, lllllllllllllIIlIIIlIIllIIlIllIl);
                    "".length();
                    if (" ".length() <= 0) {
                        throw null;
                    }
                }
                else {
                    lllllllllllllIIlIIIlIIllIIlIllIl = (this.sessionTimeout = SSLContext.setSessionCacheTimeout(this.ctx, 300L));
                    SSLContext.setSessionCacheTimeout(this.ctx, lllllllllllllIIlIIIlIIllIIlIllIl);
                }
                // monitorexit(OpenSslServerContext.class)
                "".length();
                if (((0x9 ^ 0x54 ^ (0x24 ^ 0x39)) & (0xC9 ^ 0xAC ^ (0x8D ^ 0xA8) ^ -" ".length())) != ((0x7 ^ 0x15 ^ (0x43 ^ 0x49)) & (0x2C ^ 0x18 ^ (0x7A ^ 0x56) ^ -" ".length()))) {
                    throw null;
                }
            }
            lllllllllllllIIlIIIlIIllIIlIlIll = (OpenSslServerContext.lIlIIIIIIllIll[1] != 0);
            if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIlIlIll ? 1 : 0)) {
                this.destroyPools();
                "".length();
                if (((0x1C ^ 0x15) & ~(0x7E ^ 0x77)) != 0x0) {
                    throw null;
                }
            }
        }
        finally {
            if (lllIIIIIIIllIll(lllllllllllllIIlIIIlIIllIIlIlIll ? 1 : 0)) {
                this.destroyPools();
            }
        }
        this.stats = new OpenSslSessionStats(this.ctx);
    }
    
    @Override
    public List<String> nextProtocols() {
        return this.nextProtocols;
    }
    
    public OpenSslServerContext(final File lllllllllllllIIlIIIlIIllIllIIlIl, final File lllllllllllllIIlIIIlIIllIllIIlII) throws SSLException {
        this(lllllllllllllIIlIIIlIIllIllIIlIl, lllllllllllllIIlIIIlIIllIllIIlII, null);
    }
    
    private static boolean lllIIIIIIIllIlI(final Object lllllllllllllIIlIIIlIIlIlIllIIll) {
        return lllllllllllllIIlIIIlIIlIlIllIIll == null;
    }
    
    private static int lllIIIIIIIllIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIIIIIIIlllII(final int lllllllllllllIIlIIIlIIlIlIllIIIl) {
        return lllllllllllllIIlIIIlIIlIlIllIIIl != 0;
    }
    
    private static boolean lllIIIIIIIlllIl(final int lllllllllllllIIlIIIlIIlIlIlIllIl) {
        return lllllllllllllIIlIIIlIIlIlIlIllIl > 0;
    }
    
    @Override
    public long sessionCacheSize() {
        return this.sessionCacheSize;
    }
    
    @Override
    public boolean isClient() {
        return OpenSslServerContext.lIlIIIIIIllIll[0] != 0;
    }
    
    private static void lllIIIIIIIlIllI() {
        (lIlIIIIIIlIlII = new String[OpenSslServerContext.lIlIIIIIIllIll[36]])[OpenSslServerContext.lIlIIIIIIllIll[0]] = lllIIIIIIIIlIlI("y9UV9CageNAlM9rbxf/wsA==", "GZcbd");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[1]] = lllIIIIIIIIlIll("lD6aYHAD26HrhfIhk3mJsCSertnJyGDFJ2wQrXtyJmQ=", "MSDeN");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[2]] = lllIIIIIIIIlIlI("cezw5rwxypo=", "LlWcX");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[3]] = lllIIIIIIIIlIll("1p6Nk0L5BBSKYvSX6eVY3p6XWDtOYi1t", "VgghL");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[4]] = lllIIIIIIIIlIll("6F8D5OOfli4=", "LJbbd");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[6]] = lllIIIIIIIIllll("AA0iIj0CTD8heAUeLi8sA0wqIHg1PwcRGzI0", "flKNX");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[5]] = lllIIIIIIIIlIlI("GFqRgGEY4G1cRD6e7BuegWtmJnAX+aJVvMOTtLgxQt8=", "MmdNu");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[15]] = lllIIIIIIIIlIll("d5swhrunF7KobFhNxXJo7cPSG93LZGXd4h52ukjH7Ug=", "KkFZP");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[16]] = lllIIIIIIIIlIlI("yke+n98FVT8=", "dlcXu");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[17]] = lllIIIIIIIIlIll("MweZ5LkfnfU=", "PCHnZ");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[14]] = lllIIIIIIIIlIlI("aONZ7DNrSiiv1/EdMq06fzWPv43AzEqkpzQ526KRJZA=", "icBBK");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[19]] = lllIIIIIIIIlIll("Yt0gVoLEHfQ=", "hDjmO");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[20]] = lllIIIIIIIIlIlI("QjiNYUoikWNQLfgEUZnN8Q==", "qKmZn");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[21]] = lllIIIIIIIIlIll("UlZKWhWleHOe55OA5e8JI+p6OwHhUXzukNiKn7y2wsI3+ER8WmYR2w==", "ILvDN");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[22]] = lllIIIIIIIIlIlI("Gf+mEOp8VvU=", "xsAqU");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[24]] = lllIIIIIIIIlIll("VWaZAAV39i0=", "pRtwq");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[25]] = lllIIIIIIIIllll("HywoIzN3PT8qWxsqP1pEYkIrKDt3PCQqRG9Z", "Zolkv");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[26]] = lllIIIIIIIIlIlI("deB3RrqOvx/NCvrQ8PCY8foAhVjn1Til", "UcGfK");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[27]] = lllIIIIIIIIllll("DAUzCSlkFCQAQQgDJHBecWskCS0=", "IFwAl");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[28]] = lllIIIIIIIIlIlI("2lzVbleX1sbVkK6gaVTSehbeOxus8qnk", "SFGsW");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[29]] = lllIIIIIIIIlIlI("jUhL/QPXDmf4TKgtSla8v7RWa7P/aDpD", "AitOq");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[30]] = lllIIIIIIIIlIlI("Xp2tV362+TU=", "atIeJ");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[31]] = lllIIIIIIIIlIll("+s7BfTL0Zv8=", "xePVX");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[32]] = lllIIIIIIIIllll("FwEDcnpuaQMLCQ==", "VDPCH");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[33]] = lllIIIIIIIIlIll("OgxEJmmnxgm3arOdtXVPWw==", "QJNuz");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[34]] = lllIIIIIIIIlIlI("PcMYdtZrgeT6p72YKrvzlQ==", "ByajZ");
        OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[35]] = lllIIIIIIIIllll("ECETEjw4MFUQICQsEAFpJzEcByx0bDoDLDoXJj9gbmQ=", "TDusI");
    }
    
    public OpenSslServerContext(final File lllllllllllllIIlIIIlIIllIlIlIlll, final File lllllllllllllIIlIIIlIIllIlIllIlI, final String lllllllllllllIIlIIIlIIllIlIlIlIl) throws SSLException {
        this(lllllllllllllIIlIIIlIIllIlIlIlll, lllllllllllllIIlIIIlIIllIlIllIlI, lllllllllllllIIlIIIlIIllIlIlIlIl, null, null, 0L, 0L);
    }
    
    private static String lllIIIIIIIIlIlI(final String lllllllllllllIIlIIIlIIlIlIllllII, final String lllllllllllllIIlIIIlIIlIlIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIIlIllIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIIlIllIIIIII.init(OpenSslServerContext.lIlIIIIIIllIll[2], lllllllllllllIIlIIIlIIlIllIIIIIl);
            return new String(lllllllllllllIIlIIIlIIlIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIlIlIllllll) {
            lllllllllllllIIlIIIlIIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static int lllIIIIIIIllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lllIIIIIIIlllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIIIIIIlIIIII(final int lllllllllllllIIlIIIlIIlIlIllIllI, final int lllllllllllllIIlIIIlIIlIlIllIlIl) {
        return lllllllllllllIIlIIIlIIlIlIllIllI < lllllllllllllIIlIIIlIIlIlIllIlIl;
    }
    
    private static boolean lllIIIIIIIllIll(final int lllllllllllllIIlIIIlIIlIlIlIllll) {
        return lllllllllllllIIlIIIlIIlIlIlIllll == 0;
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        synchronized (OpenSslServerContext.class) {
            if (lllIIIIIIIlllII(lllIIIIIIIllllI(this.ctx, 0L))) {
                SSLContext.free(this.ctx);
                "".length();
            }
            // monitorexit(OpenSslServerContext.class)
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        this.destroyPools();
    }
    
    @Override
    public SSLEngine newEngine(final ByteBufAllocator lllllllllllllIIlIIIlIIllIIIIIIII, final String lllllllllllllIIlIIIlIIlIllllllll, final int lllllllllllllIIlIIIlIIlIlllllllI) {
        throw new UnsupportedOperationException();
    }
    
    private void destroyPools() {
        if (lllIIIIIIIlllII(lllIIIIIIIlllll(this.aprPool, 0L))) {
            Pool.destroy(this.aprPool);
        }
    }
    
    @Override
    public long sessionTimeout() {
        return this.sessionTimeout;
    }
    
    public long context() {
        return this.ctx;
    }
    
    public OpenSslSessionStats stats() {
        return this.stats;
    }
    
    private static String lllIIIIIIIIllll(String lllllllllllllIIlIIIlIIlIllIIlllI, final String lllllllllllllIIlIIIlIIlIllIlIIlI) {
        lllllllllllllIIlIIIlIIlIllIIlllI = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIIlIllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIIlIllIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIIlIllIlIIII = lllllllllllllIIlIIIlIIlIllIlIIlI.toCharArray();
        int lllllllllllllIIlIIIlIIlIllIIllll = OpenSslServerContext.lIlIIIIIIllIll[0];
        final float lllllllllllllIIlIIIlIIlIllIIlIIl = (Object)((String)lllllllllllllIIlIIIlIIlIllIIlllI).toCharArray();
        final double lllllllllllllIIlIIIlIIlIllIIlIII = lllllllllllllIIlIIIlIIlIllIIlIIl.length;
        Exception lllllllllllllIIlIIIlIIlIllIIIlll = (Exception)OpenSslServerContext.lIlIIIIIIllIll[0];
        while (lllIIIIIIlIIIII((int)lllllllllllllIIlIIIlIIlIllIIIlll, (int)lllllllllllllIIlIIIlIIlIllIIlIII)) {
            final char lllllllllllllIIlIIIlIIlIllIlIlII = lllllllllllllIIlIIIlIIlIllIIlIIl[lllllllllllllIIlIIIlIIlIllIIIlll];
            lllllllllllllIIlIIIlIIlIllIlIIIl.append((char)(lllllllllllllIIlIIIlIIlIllIlIlII ^ lllllllllllllIIlIIIlIIlIllIlIIII[lllllllllllllIIlIIIlIIlIllIIllll % lllllllllllllIIlIIIlIIlIllIlIIII.length]));
            "".length();
            ++lllllllllllllIIlIIIlIIlIllIIllll;
            ++lllllllllllllIIlIIIlIIlIllIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIIlIllIlIIIl);
    }
    
    @Override
    public SSLEngine newEngine(final ByteBufAllocator lllllllllllllIIlIIIlIIllIIIIIlII) {
        if (lllIIIIIIIlllII(this.nextProtocols.isEmpty() ? 1 : 0)) {
            return new OpenSslEngine(this.ctx, lllllllllllllIIlIIIlIIllIIIIIlII, null);
        }
        return new OpenSslEngine(this.ctx, lllllllllllllIIlIIIlIIllIIIIIlII, this.nextProtocols.get(this.nextProtocols.size() - OpenSslServerContext.lIlIIIIIIllIll[1]));
    }
    
    private static void lllIIIIIIIllIII() {
        (lIlIIIIIIllIll = new int[37])[0] = ((0x4C ^ 0x7E ^ (0xAC ^ 0xA7)) & (0x7B ^ 0x1D ^ (0x4 ^ 0x5B) ^ -" ".length()));
        OpenSslServerContext.lIlIIIIIIllIll[1] = " ".length();
        OpenSslServerContext.lIlIIIIIIllIll[2] = "  ".length();
        OpenSslServerContext.lIlIIIIIIllIll[3] = "   ".length();
        OpenSslServerContext.lIlIIIIIIllIll[4] = (0x2D ^ 0x29);
        OpenSslServerContext.lIlIIIIIIllIll[5] = (0x9E ^ 0x90 ^ (0x84 ^ 0x8C));
        OpenSslServerContext.lIlIIIIIIllIll[6] = (0x14 ^ 0x31 ^ (0x97 ^ 0xB7));
        OpenSslServerContext.lIlIIIIIIllIll[7] = (-(0xFFFFEA63 & 0x759D) & (0xFFFFEFFF & 0x7FFF));
        OpenSslServerContext.lIlIIIIIIllIll[8] = (0xFFFF8AAD & 0x1007552);
        OpenSslServerContext.lIlIIIIIIllIll[9] = (-(0xFFFFB2EB & 0x6DBE) & (0xFFFFF9EF & 0x4026B9));
        OpenSslServerContext.lIlIIIIIIllIll[10] = (-(0xFFFFDFF5 & 0x238E) & (0xFFFFA387 & 0x85FFB));
        OpenSslServerContext.lIlIIIIIIllIll[11] = (0xFFFFB6AA & 0x104955);
        OpenSslServerContext.lIlIIIIIIllIll[12] = (0xFFFFE1A9 & 0x11E56);
        OpenSslServerContext.lIlIIIIIIllIll[13] = (0x3F ^ 0x5);
        OpenSslServerContext.lIlIIIIIIllIll[14] = (0x4A ^ 0x40);
        OpenSslServerContext.lIlIIIIIIllIll[15] = (0x89 ^ 0x8E);
        OpenSslServerContext.lIlIIIIIIllIll[16] = (0x6 ^ 0xE);
        OpenSslServerContext.lIlIIIIIIllIll[17] = (0x3 ^ 0x6 ^ (0xCD ^ 0xC1));
        OpenSslServerContext.lIlIIIIIIllIll[18] = (0x5E ^ 0x63 ^ (0x9E ^ 0x8A));
        OpenSslServerContext.lIlIIIIIIllIll[19] = (150 + 51 - 65 + 19 ^ 92 + 20 - 79 + 111);
        OpenSslServerContext.lIlIIIIIIllIll[20] = (0x78 ^ 0x46 ^ (0x58 ^ 0x6A));
        OpenSslServerContext.lIlIIIIIIllIll[21] = (0x65 ^ 0xB ^ (0xC1 ^ 0xA2));
        OpenSslServerContext.lIlIIIIIIllIll[22] = (51 + 20 + 3 + 75 ^ 22 + 91 + 14 + 28);
        OpenSslServerContext.lIlIIIIIIllIll[23] = (0xEA ^ 0xC6);
        OpenSslServerContext.lIlIIIIIIllIll[24] = (0x63 ^ 0x6C);
        OpenSslServerContext.lIlIIIIIIllIll[25] = (0x69 ^ 0x79);
        OpenSslServerContext.lIlIIIIIIllIll[26] = (4 + 139 - 27 + 99 ^ 82 + 5 + 14 + 97);
        OpenSslServerContext.lIlIIIIIIllIll[27] = (0x8 ^ 0x1A);
        OpenSslServerContext.lIlIIIIIIllIll[28] = (0x51 ^ 0x42);
        OpenSslServerContext.lIlIIIIIIllIll[29] = (0x81 ^ 0x95);
        OpenSslServerContext.lIlIIIIIIllIll[30] = (49 + 155 - 40 + 8 ^ 130 + 130 - 115 + 40);
        OpenSslServerContext.lIlIIIIIIllIll[31] = (31 + 113 - 85 + 132 ^ 13 + 54 + 48 + 54);
        OpenSslServerContext.lIlIIIIIIllIll[32] = (0xA4 ^ 0xB7 ^ (0x7D ^ 0x79));
        OpenSslServerContext.lIlIIIIIIllIll[33] = (0x77 ^ 0x6A ^ (0x64 ^ 0x61));
        OpenSslServerContext.lIlIIIIIIllIll[34] = (0xA4 ^ 0xBD);
        OpenSslServerContext.lIlIIIIIIllIll[35] = (70 + 5 + 57 + 31 ^ 4 + 151 - 104 + 134);
        OpenSslServerContext.lIlIIIIIIllIll[36] = (0xAE ^ 0x83 ^ (0x97 ^ 0xA1));
    }
    
    private static String lllIIIIIIIIlIll(final String lllllllllllllIIlIIIlIIlIlllIIIll, final String lllllllllllllIIlIIIlIIlIlllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIlIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), OpenSslServerContext.lIlIIIIIIllIll[16]), "DES");
            final Cipher lllllllllllllIIlIIIlIIlIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlIIlIlllIIlIl.init(OpenSslServerContext.lIlIIIIIIllIll[2], lllllllllllllIIlIIIlIIlIlllIIllI);
            return new String(lllllllllllllIIlIIIlIIlIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIlIlllIIlII) {
            lllllllllllllIIlIIIlIIlIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    public void setTicketKeys(final byte[] lllllllllllllIIlIIIlIIlIlllllIlI) {
        if (lllIIIIIIIllIlI(lllllllllllllIIlIIIlIIlIlllllIlI)) {
            throw new NullPointerException(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[24]]);
        }
        SSLContext.setSessionTicketKeys(this.ctx, lllllllllllllIIlIIIlIIlIlllllIlI);
    }
    
    static {
        lllIIIIIIIllIII();
        lllIIIIIIIlIllI();
        logger = InternalLoggerFactory.getInstance(OpenSslServerContext.class);
        final ArrayList<Object> c;
        final List<String> lllllllllllllIIlIIIlIIlIlllIllII = (List<String>)(c = new ArrayList<Object>());
        final String[] elements = new String[OpenSslServerContext.lIlIIIIIIllIll[14]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[0]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[25]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[1]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[26]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[2]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[27]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[3]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[28]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[4]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[29]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[6]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[30]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[5]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[31]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[15]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[32]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[16]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[33]];
        elements[OpenSslServerContext.lIlIIIIIIllIll[17]] = OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[34]];
        Collections.addAll(c, elements);
        "".length();
        DEFAULT_CIPHERS = Collections.unmodifiableList((List<? extends String>)lllllllllllllIIlIIIlIIlIlllIllII);
        if (lllIIIIIIIlllII(OpenSslServerContext.logger.isDebugEnabled() ? 1 : 0)) {
            OpenSslServerContext.logger.debug(String.valueOf(new StringBuilder().append(OpenSslServerContext.lIlIIIIIIlIlII[OpenSslServerContext.lIlIIIIIIllIll[35]]).append(lllllllllllllIIlIIIlIIlIlllIllII)));
        }
    }
}
