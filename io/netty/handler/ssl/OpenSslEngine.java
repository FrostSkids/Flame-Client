// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ReadOnlyBufferException;
import javax.net.ssl.SSLSessionContext;
import java.security.Principal;
import java.util.Arrays;
import io.netty.buffer.ByteBuf;
import org.apache.tomcat.jni.Buffer;
import java.nio.ByteBuffer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.internal.EmptyArrays;
import org.apache.tomcat.jni.SSL;
import javax.net.ssl.SSLEngineResult;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;
import javax.net.ssl.SSLSession;
import java.security.cert.Certificate;
import javax.security.cert.X509Certificate;
import io.netty.buffer.ByteBufAllocator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLEngine;

public final class OpenSslEngine extends SSLEngine
{
    private /* synthetic */ int lastPrimingReadResult;
    private /* synthetic */ int accepted;
    private static final /* synthetic */ SSLException ENGINE_CLOSED;
    private /* synthetic */ boolean receivedShutdown;
    private static final /* synthetic */ AtomicIntegerFieldUpdater<OpenSslEngine> DESTROYED_UPDATER;
    private final /* synthetic */ ByteBufAllocator alloc;
    private /* synthetic */ long ssl;
    private static final /* synthetic */ X509Certificate[] EMPTY_X509_CERTIFICATES;
    private volatile /* synthetic */ String applicationProtocol;
    private /* synthetic */ boolean handshakeFinished;
    private volatile /* synthetic */ int destroyed;
    private static final /* synthetic */ Certificate[] EMPTY_CERTIFICATES;
    private static final /* synthetic */ int[] lllllllllIIIl;
    private /* synthetic */ boolean isInboundDone;
    private /* synthetic */ boolean isOutboundDone;
    private /* synthetic */ SSLSession session;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lllllllllIIII;
    private final /* synthetic */ String fallbackApplicationProtocol;
    private /* synthetic */ String cipher;
    private /* synthetic */ long networkBIO;
    private /* synthetic */ boolean engineClosed;
    private static final /* synthetic */ SSLException RENEGOTIATION_UNSUPPORTED;
    private static final /* synthetic */ SSLException ENCRYPTED_PACKET_OVERSIZED;
    
    private static boolean lIllIIIlllllIlI(final int lllllllllllllIlIlIIlIlllIlIIIIlI) {
        return lllllllllllllIlIlIIlIlllIlIIIIlI >= 0;
    }
    
    @Override
    public synchronized void closeInbound() throws SSLException {
        if (lIllIIIlllllIII(this.isInboundDone ? 1 : 0)) {
            return;
        }
        this.isInboundDone = (OpenSslEngine.lllllllllIIIl[1] != 0);
        this.engineClosed = (OpenSslEngine.lllllllllIIIl[1] != 0);
        if (lIllIIIlllllIII(this.accepted)) {
            if (lIllIIIllllIllI(this.receivedShutdown ? 1 : 0)) {
                this.shutdown();
                throw new SSLException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[21]]);
            }
        }
        else {
            this.shutdown();
        }
    }
    
    private static boolean lIllIIIlllllIII(final int lllllllllllllIlIlIIlIlllIlIIIllI) {
        return lllllllllllllIlIlIIlIlllIlIIIllI != 0;
    }
    
    private static String lIllIIIllllIIIl(String lllllllllllllIlIlIIlIlllIlllIlIl, final String lllllllllllllIlIlIIlIlllIllllIIl) {
        lllllllllllllIlIlIIlIlllIlllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlllIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIlllIllllIII = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIlllIlllIlll = lllllllllllllIlIlIIlIlllIllllIIl.toCharArray();
        int lllllllllllllIlIlIIlIlllIlllIllI = OpenSslEngine.lllllllllIIIl[0];
        final double lllllllllllllIlIlIIlIlllIlllIIII = (Object)lllllllllllllIlIlIIlIlllIlllIlIl.toCharArray();
        final long lllllllllllllIlIlIIlIlllIllIllll = lllllllllllllIlIlIIlIlllIlllIIII.length;
        long lllllllllllllIlIlIIlIlllIllIlllI = OpenSslEngine.lllllllllIIIl[0];
        while (lIllIIIllllllII((int)lllllllllllllIlIlIIlIlllIllIlllI, (int)lllllllllllllIlIlIIlIlllIllIllll)) {
            final char lllllllllllllIlIlIIlIlllIllllIll = lllllllllllllIlIlIIlIlllIlllIIII[lllllllllllllIlIlIIlIlllIllIlllI];
            lllllllllllllIlIlIIlIlllIllllIII.append((char)(lllllllllllllIlIlIIlIlllIllllIll ^ lllllllllllllIlIlIIlIlllIlllIlll[lllllllllllllIlIlIIlIlllIlllIllI % lllllllllllllIlIlIIlIlllIlllIlll.length]));
            "".length();
            ++lllllllllllllIlIlIIlIlllIlllIllI;
            ++lllllllllllllIlIlIIlIlllIllIlllI;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIlllIllllIII);
    }
    
    private static int lIllIIIllllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        if (!lIllIIIlllllIII(this.accepted) || lIllIIIlllllIII(this.destroyed)) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        if (lIllIIIllllIllI(this.handshakeFinished ? 1 : 0)) {
            if (lIllIIIlllllIII(SSL.pendingWrittenBytesInBIO(this.networkBIO))) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            if (lIllIIIllllIllI(SSL.isInInit(this.ssl))) {
                this.handshakeFinished = (OpenSslEngine.lllllllllIIIl[1] != 0);
                this.cipher = SSL.getCipherForSSL(this.ssl);
                String lllllllllllllIlIlIIlIllllIllIIlI = SSL.getNextProtoNegotiated(this.ssl);
                if (lIllIIIllllIlll(lllllllllllllIlIlIIlIllllIllIIlI)) {
                    lllllllllllllIlIlIIlIllllIllIIlI = this.fallbackApplicationProtocol;
                }
                if (lIllIIIllllllll(lllllllllllllIlIlIIlIllllIllIIlI)) {
                    this.applicationProtocol = lllllllllllllIlIlIIlIllllIllIIlI.replace((char)OpenSslEngine.lllllllllIIIl[22], (char)OpenSslEngine.lllllllllIIIl[23]);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    this.applicationProtocol = null;
                }
                return SSLEngineResult.HandshakeStatus.FINISHED;
            }
            return SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        }
        else {
            if (!lIllIIIlllllIII(this.engineClosed ? 1 : 0)) {
                return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            }
            if (lIllIIIlllllIII(SSL.pendingWrittenBytesInBIO(this.networkBIO))) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            return SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        }
    }
    
    @Override
    public String[] getSupportedProtocols() {
        return EmptyArrays.EMPTY_STRINGS;
    }
    
    private SSLEngineResult.Status getEngineStatus() {
        SSLEngineResult.Status status;
        if (lIllIIIlllllIII(this.engineClosed ? 1 : 0)) {
            status = SSLEngineResult.Status.CLOSED;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            status = SSLEngineResult.Status.OK;
        }
        return status;
    }
    
    @Override
    public synchronized void beginHandshake() throws SSLException {
        if (lIllIIIlllllIII(this.engineClosed ? 1 : 0)) {
            throw OpenSslEngine.ENGINE_CLOSED;
        }
        switch (this.accepted) {
            case 0: {
                SSL.doHandshake(this.ssl);
                "".length();
                this.accepted = OpenSslEngine.lllllllllIIIl[3];
                "".length();
                if (((174 + 177 - 341 + 239 ^ 44 + 11 + 3 + 106) & (0x8B ^ 0xBF ^ (0x46 ^ 0x2F) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 1: {
                this.accepted = OpenSslEngine.lllllllllIIIl[3];
                "".length();
                if (((0xEA ^ 0xA2 ^ (0xD9 ^ 0x9A)) & (0x4A ^ 0x2 ^ (0xD1 ^ 0x92) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                throw OpenSslEngine.RENEGOTIATION_UNSUPPORTED;
            }
            default: {
                throw new Error();
            }
        }
    }
    
    private static boolean lIllIIIllllIllI(final int lllllllllllllIlIlIIlIlllIlIIIlII) {
        return lllllllllllllIlIlIIlIlllIlIIIlII == 0;
    }
    
    @Override
    public String[] getEnabledCipherSuites() {
        return EmptyArrays.EMPTY_STRINGS;
    }
    
    private static String lIllIIIllllIIII(final String lllllllllllllIlIlIIlIllllIIIlIII, final String lllllllllllllIlIlIIlIllllIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIllllIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIllllIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIllllIIIllII.init(OpenSslEngine.lllllllllIIIl[3], lllllllllllllIlIlIIlIllllIIIllIl);
            return new String(lllllllllllllIlIlIIlIllllIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIllllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIllllIIIlIll) {
            lllllllllllllIlIlIIlIllllIIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean getWantClientAuth() {
        return OpenSslEngine.lllllllllIIIl[0] != 0;
    }
    
    @Override
    public void setWantClientAuth(final boolean lllllllllllllIlIlIIlIllllIlIIIlI) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIlIllllIlIIIlI ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
    }
    
    @Override
    public boolean getEnableSessionCreation() {
        return OpenSslEngine.lllllllllIIIl[0] != 0;
    }
    
    private static boolean lIllIIIllllIlll(final Object lllllllllllllIlIlIIlIlllIlIIlIII) {
        return lllllllllllllIlIlIIlIlllIlIIlIII == null;
    }
    
    private int writeEncryptedData(final ByteBuffer lllllllllllllIlIlIIllIIIIlllllll) {
        final int lllllllllllllIlIlIIllIIIlIIIIIlI = lllllllllllllIlIlIIllIIIIlllllll.position();
        final int lllllllllllllIlIlIIllIIIlIIIIIIl = lllllllllllllIlIlIIllIIIIlllllll.remaining();
        if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIlllllll.isDirect() ? 1 : 0)) {
            final long lllllllllllllIlIlIIllIIIlIIIlIlI = Buffer.address(lllllllllllllIlIlIIllIIIIlllllll) + lllllllllllllIlIlIIllIIIlIIIIIlI;
            final int lllllllllllllIlIlIIllIIIlIIIlIIl = SSL.writeToBIO(this.networkBIO, lllllllllllllIlIlIIllIIIlIIIlIlI, lllllllllllllIlIlIIllIIIlIIIIIIl);
            if (lIllIIIlllllIlI(lllllllllllllIlIlIIllIIIlIIIlIIl)) {
                lllllllllllllIlIlIIllIIIIlllllll.position(lllllllllllllIlIlIIllIIIlIIIIIlI + lllllllllllllIlIlIIllIIIlIIIlIIl);
                "".length();
                this.lastPrimingReadResult = SSL.readFromSSL(this.ssl, lllllllllllllIlIlIIllIIIlIIIlIlI, OpenSslEngine.lllllllllIIIl[0]);
                return lllllllllllllIlIlIIllIIIlIIIlIIl;
            }
            "".length();
            if (((0x51 ^ 0x42 ^ (0x90 ^ 0x8D)) & (57 + 120 - 139 + 113 ^ 31 + 0 + 29 + 93 ^ -" ".length())) != ((0x93 ^ 0xC6 ^ (0xA ^ 0x76)) & (103 + 144 - 129 + 61 ^ 51 + 100 - 27 + 30 ^ -" ".length()))) {
                return (0x46 ^ 0x7E ^ (0xB7 ^ 0x98)) & (1 + 118 + 16 + 55 ^ 117 + 61 - 173 + 164 ^ -" ".length());
            }
        }
        else {
            final ByteBuf lllllllllllllIlIlIIllIIIlIIIIlIl = this.alloc.directBuffer(lllllllllllllIlIlIIllIIIlIIIIIIl);
            try {
                long lllllllllllllIlIlIIllIIIlIIIIlll;
                if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIlIIIIlIl.hasMemoryAddress() ? 1 : 0)) {
                    final long lllllllllllllIlIlIIllIIIlIIIlIII = lllllllllllllIlIlIIllIIIlIIIIlIl.memoryAddress();
                    "".length();
                    if ("  ".length() < 0) {
                        return (0x76 ^ 0x54) & ~(0xE5 ^ 0xC7);
                    }
                }
                else {
                    lllllllllllllIlIlIIllIIIlIIIIlll = Buffer.address(lllllllllllllIlIlIIllIIIlIIIIlIl.nioBuffer());
                }
                lllllllllllllIlIlIIllIIIlIIIIlIl.setBytes(OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIIlllllll);
                "".length();
                final int lllllllllllllIlIlIIllIIIlIIIIllI = SSL.writeToBIO(this.networkBIO, lllllllllllllIlIlIIllIIIlIIIIlll, lllllllllllllIlIlIIllIIIlIIIIIIl);
                if (lIllIIIlllllIlI(lllllllllllllIlIlIIllIIIlIIIIllI)) {
                    lllllllllllllIlIlIIllIIIIlllllll.position(lllllllllllllIlIlIIllIIIlIIIIIlI + lllllllllllllIlIlIIllIIIlIIIIllI);
                    "".length();
                    this.lastPrimingReadResult = SSL.readFromSSL(this.ssl, lllllllllllllIlIlIIllIIIlIIIIlll, OpenSslEngine.lllllllllIIIl[0]);
                    final boolean lllllllllllllIlIlIIllIIIIllllIII = lllllllllllllIlIlIIllIIIlIIIIllI != 0;
                    return lllllllllllllIlIlIIllIIIIllllIII ? 1 : 0;
                }
                lllllllllllllIlIlIIllIIIIlllllll.position(lllllllllllllIlIlIIllIIIlIIIIIlI);
                "".length();
                lllllllllllllIlIlIIllIIIlIIIIlIl.release();
                "".length();
                "".length();
                if (-(0x56 ^ 0x53) >= 0) {
                    return (0x19 ^ 0x55) & ~(0x5D ^ 0x11);
                }
            }
            finally {
                lllllllllllllIlIlIIllIIIlIIIIlIl.release();
                "".length();
            }
        }
        return OpenSslEngine.lllllllllIIIl[0];
    }
    
    private int readEncryptedData(final ByteBuffer lllllllllllllIlIlIIllIIIIlIIIIII, final int lllllllllllllIlIlIIllIIIIlIIIIlI) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIlIIIIII.isDirect() ? 1 : 0) && lIllIIIlllllIll(lllllllllllllIlIlIIllIIIIlIIIIII.remaining(), lllllllllllllIlIlIIllIIIIlIIIIlI)) {
            final int lllllllllllllIlIlIIllIIIIlIIllII = lllllllllllllIlIlIIllIIIIlIIIIII.position();
            final long lllllllllllllIlIlIIllIIIIlIIlIll = Buffer.address(lllllllllllllIlIlIIllIIIIlIIIIII) + lllllllllllllIlIlIIllIIIIlIIllII;
            final int lllllllllllllIlIlIIllIIIIlIIlIlI = SSL.readFromBIO(this.networkBIO, lllllllllllllIlIlIIllIIIIlIIlIll, lllllllllllllIlIlIIllIIIIlIIIIlI);
            if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIlIIlIlI)) {
                lllllllllllllIlIlIIllIIIIlIIIIII.position(lllllllllllllIlIlIIllIIIIlIIllII + lllllllllllllIlIlIIllIIIIlIIlIlI);
                "".length();
                return lllllllllllllIlIlIIllIIIIlIIlIlI;
            }
            "".length();
            if ("   ".length() <= ((0x23 ^ 0x36) & ~(0xBE ^ 0xAB))) {
                return (0xE9 ^ 0xA4) & ~(0xF8 ^ 0xB5);
            }
        }
        else {
            final ByteBuf lllllllllllllIlIlIIllIIIIlIIIlIl = this.alloc.directBuffer(lllllllllllllIlIlIIllIIIIlIIIIlI);
            try {
                long lllllllllllllIlIlIIllIIIIlIIIlll = 0L;
                if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIlIIIlIl.hasMemoryAddress() ? 1 : 0)) {
                    final long lllllllllllllIlIlIIllIIIIlIIlIIl = lllllllllllllIlIlIIllIIIIlIIIlIl.memoryAddress();
                    "".length();
                    if (-" ".length() > 0) {
                        return (0x2D ^ 0x8) & ~(0x57 ^ 0x72);
                    }
                }
                else {
                    lllllllllllllIlIlIIllIIIIlIIIlll = Buffer.address(lllllllllllllIlIlIIllIIIIlIIIlIl.nioBuffer());
                }
                final int lllllllllllllIlIlIIllIIIIlIIIllI = SSL.readFromBIO(this.networkBIO, lllllllllllllIlIlIIllIIIIlIIIlll, lllllllllllllIlIlIIllIIIIlIIIIlI);
                if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIlIIIllI)) {
                    final int lllllllllllllIlIlIIllIIIIlIIlIII = lllllllllllllIlIlIIllIIIIlIIIIII.limit();
                    lllllllllllllIlIlIIllIIIIlIIIIII.limit(lllllllllllllIlIlIIllIIIIlIIIIII.position() + lllllllllllllIlIlIIllIIIIlIIIllI);
                    "".length();
                    lllllllllllllIlIlIIllIIIIlIIIlIl.getBytes(OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIIlIIIIII);
                    "".length();
                    lllllllllllllIlIlIIllIIIIlIIIIII.limit(lllllllllllllIlIlIIllIIIIlIIlIII);
                    "".length();
                    final byte lllllllllllllIlIlIIllIIIIIlllIlI = (byte)lllllllllllllIlIlIIllIIIIlIIIllI;
                    return lllllllllllllIlIlIIllIIIIIlllIlI;
                }
                lllllllllllllIlIlIIllIIIIlIIIlIl.release();
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return (0x38 ^ 0x6E) & ~(0xFD ^ 0xAB) & ~((0x35 ^ 0x71) & ~(0x5A ^ 0x1E));
                }
            }
            finally {
                lllllllllllllIlIlIIllIIIIlIIIlIl.release();
                "".length();
            }
        }
        return OpenSslEngine.lllllllllIIIl[0];
    }
    
    @Override
    public SSLSession getSession() {
        SSLSession lllllllllllllIlIlIIlIlllllIIIIII = this.session;
        if (lIllIIIllllIlll(lllllllllllllIlIlIIlIlllllIIIIII)) {
            lllllllllllllIlIlIIlIlllllIIIIII = (this.session = new SSLSession() {
                private static final /* synthetic */ int[] lIIlllIIIlllll;
                private static final /* synthetic */ String[] lIIlllIIIllIlI;
                
                @Override
                public int getPacketBufferSize() {
                    return OpenSslEngine$1.lIIlllIIIlllll[2];
                }
                
                @Override
                public String getCipherSuite() {
                    return OpenSslEngine.this.cipher;
                }
                
                @Override
                public int getApplicationBufferSize() {
                    return OpenSslEngine$1.lIIlllIIIlllll[3];
                }
                
                private static String llIllIlIllIIlII(final String lllllllllllllIIlIlIIIlIIIlIIIlIl, final String lllllllllllllIIlIlIIIlIIIlIIIIlI) {
                    try {
                        final SecretKeySpec lllllllllllllIIlIlIIIlIIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIlIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), OpenSslEngine$1.lIIlllIIIlllll[5]), "DES");
                        final Cipher lllllllllllllIIlIlIIIlIIIlIIIlll = Cipher.getInstance("DES");
                        lllllllllllllIIlIlIIIlIIIlIIIlll.init(OpenSslEngine$1.lIIlllIIIlllll[4], lllllllllllllIIlIlIIIlIIIlIIlIII);
                        return new String(lllllllllllllIIlIlIIIlIIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIlIlIIIlIIIlIIIllI) {
                        lllllllllllllIIlIlIIIlIIIlIIIllI.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                public Certificate[] getLocalCertificates() {
                    return OpenSslEngine.EMPTY_CERTIFICATES;
                }
                
                @Override
                public void invalidate() {
                }
                
                @Override
                public void removeValue(final String lllllllllllllIIlIlIIIlIIIllIllIl) {
                }
                
                @Override
                public void putValue(final String lllllllllllllIIlIlIIIlIIIlllIIlI, final Object lllllllllllllIIlIlIIIlIIIlllIIIl) {
                }
                
                @Override
                public Certificate[] getPeerCertificates() {
                    return OpenSslEngine.EMPTY_CERTIFICATES;
                }
                
                @Override
                public long getLastAccessedTime() {
                    return 0L;
                }
                
                private static String llIllIlIllIIIll(final String lllllllllllllIIlIlIIIlIIIlIlIIII, final String lllllllllllllIIlIlIIIlIIIlIIllll) {
                    try {
                        final SecretKeySpec lllllllllllllIIlIlIIIlIIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIlIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIlIlIIIlIIIlIlIlII = Cipher.getInstance("Blowfish");
                        lllllllllllllIIlIlIIIlIIIlIlIlII.init(OpenSslEngine$1.lIIlllIIIlllll[4], lllllllllllllIIlIlIIIlIIIlIlIlIl);
                        return new String(lllllllllllllIIlIlIIIlIIIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIlIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIlIlIIIlIIIlIlIIll) {
                        lllllllllllllIIlIlIIIlIIIlIlIIll.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                public X509Certificate[] getPeerCertificateChain() {
                    return OpenSslEngine.EMPTY_X509_CERTIFICATES;
                }
                
                @Override
                public String[] getValueNames() {
                    return EmptyArrays.EMPTY_STRINGS;
                }
                
                @Override
                public String getProtocol() {
                    final String lllllllllllllIIlIlIIIlIIIllIIIII = OpenSslEngine.this.applicationProtocol;
                    if (llIllIlIllIlllI(lllllllllllllIIlIlIIIlIIIllIIIII)) {
                        return OpenSslEngine$1.lIIlllIIIllIlI[OpenSslEngine$1.lIIlllIIIlllll[0]];
                    }
                    return String.valueOf(new StringBuilder().append(OpenSslEngine$1.lIIlllIIIllIlI[OpenSslEngine$1.lIIlllIIIlllll[1]]).append(lllllllllllllIIlIlIIIlIIIllIIIII));
                }
                
                @Override
                public Principal getLocalPrincipal() {
                    return null;
                }
                
                @Override
                public Object getValue(final String lllllllllllllIIlIlIIIlIIIllIllll) {
                    return null;
                }
                
                @Override
                public long getCreationTime() {
                    return 0L;
                }
                
                private static boolean llIllIlIllIlllI(final Object lllllllllllllIIlIlIIIlIIIIlllllI) {
                    return lllllllllllllIIlIlIIIlIIIIlllllI == null;
                }
                
                private static void llIllIlIllIIlIl() {
                    (lIIlllIIIllIlI = new String[OpenSslEngine$1.lIIlllIIIlllll[4]])[OpenSslEngine$1.lIIlllIIIlllll[0]] = llIllIlIllIIIll("16fXvL8jqfg=", "BHcIL");
                    OpenSslEngine$1.lIIlllIIIllIlI[OpenSslEngine$1.lIIlllIIIlllll[1]] = llIllIlIllIIlII("jJKJ4yhMksBJJIbQ2Vj5BA==", "WkSBZ");
                }
                
                @Override
                public SSLSessionContext getSessionContext() {
                    return null;
                }
                
                @Override
                public Principal getPeerPrincipal() {
                    return null;
                }
                
                @Override
                public byte[] getId() {
                    return String.valueOf(OpenSslEngine.this.ssl).getBytes();
                }
                
                private static void llIllIlIllIllII() {
                    (lIIlllIIIlllll = new int[6])[0] = ((0x37 ^ 0x6) & ~(0x2E ^ 0x1F));
                    OpenSslEngine$1.lIIlllIIIlllll[1] = " ".length();
                    OpenSslEngine$1.lIIlllIIIlllll[2] = (-(0xFFFFB9F7 & 0x7609) & (0xFFFFF9DB & 0x7F3D));
                    OpenSslEngine$1.lIIlllIIIlllll[3] = (-(0xFFFFBC6A & 0x6FBF) & (0xFFFFFFEF & 0x6C39));
                    OpenSslEngine$1.lIIlllIIIlllll[4] = "  ".length();
                    OpenSslEngine$1.lIIlllIIIlllll[5] = (0x5B ^ 0x6B ^ (0x8 ^ 0x30));
                }
                
                @Override
                public String getPeerHost() {
                    return null;
                }
                
                @Override
                public int getPeerPort() {
                    return OpenSslEngine$1.lIIlllIIIlllll[0];
                }
                
                @Override
                public boolean isValid() {
                    return OpenSslEngine$1.lIIlllIIIlllll[0] != 0;
                }
                
                static {
                    llIllIlIllIllII();
                    llIllIlIllIIlIl();
                }
            });
        }
        return lllllllllllllIlIlIIlIlllllIIIIII;
    }
    
    @Override
    public Runnable getDelegatedTask() {
        return null;
    }
    
    private static boolean lIllIIlIIIIIIII(final int lllllllllllllIlIlIIlIlllIlIIIIII) {
        return lllllllllllllIlIlIIlIlllIlIIIIII <= 0;
    }
    
    public OpenSslEngine(final long lllllllllllllIlIlIIllIIIlIlllIIl, final ByteBufAllocator lllllllllllllIlIlIIllIIIlIlllIII, final String lllllllllllllIlIlIIllIIIlIlllIll) {
        OpenSsl.ensureAvailability();
        if (lIllIIIllllIllI(lIllIIIllllIlIl(lllllllllllllIlIlIIllIIIlIlllIIl, 0L))) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[0]]);
        }
        if (lIllIIIllllIlll(lllllllllllllIlIlIIllIIIlIlllIII)) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[1]]);
        }
        this.alloc = lllllllllllllIlIlIIllIIIlIlllIII;
        this.ssl = SSL.newSSL(lllllllllllllIlIlIIllIIIlIlllIIl, (boolean)(OpenSslEngine.lllllllllIIIl[1] != 0));
        this.networkBIO = SSL.makeNetworkBIO(this.ssl);
        this.fallbackApplicationProtocol = lllllllllllllIlIlIIllIIIlIlllIll;
    }
    
    @Override
    public synchronized SSLEngineResult wrap(final ByteBuffer[] lllllllllllllIlIlIIllIIIIIIllIlI, final int lllllllllllllIlIlIIllIIIIIlIIIlI, final int lllllllllllllIlIlIIllIIIIIIllIII, final ByteBuffer lllllllllllllIlIlIIllIIIIIlIIIII) throws SSLException {
        if (lIllIIIlllllIII(this.destroyed)) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, OpenSslEngine.lllllllllIIIl[0], OpenSslEngine.lllllllllIIIl[0]);
        }
        if (lIllIIIllllIlll(lllllllllllllIlIlIIllIIIIIIllIlI)) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[5]]);
        }
        if (lIllIIIllllIlll(lllllllllllllIlIlIIllIIIIIlIIIII)) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[6]]);
        }
        if (!lIllIIIllllllII(lllllllllllllIlIlIIllIIIIIlIIIlI, lllllllllllllIlIlIIllIIIIIIllIlI.length) || lIllIIIllllllIl(lllllllllllllIlIlIIllIIIIIlIIIlI + lllllllllllllIlIlIIllIIIIIIllIII, lllllllllllllIlIlIIllIIIIIIllIlI.length)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[7]]).append(lllllllllllllIlIlIIllIIIIIlIIIlI).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[8]]).append(lllllllllllllIlIlIIllIIIIIIllIII).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[9]]).append(lllllllllllllIlIlIIllIIIIIIllIlI.length).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[10]])));
        }
        if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIIlIIIII.isReadOnly() ? 1 : 0)) {
            throw new ReadOnlyBufferException();
        }
        if (lIllIIIllllIllI(this.accepted)) {
            this.beginHandshakeImplicitly();
        }
        final SSLEngineResult.HandshakeStatus lllllllllllllIlIlIIllIIIIIIlllll = this.getHandshakeStatus();
        if ((!lIllIIIlllllIII(this.handshakeFinished ? 1 : 0) || lIllIIIlllllIII(this.engineClosed ? 1 : 0)) && lIllIIIlllllllI(lllllllllllllIlIlIIllIIIIIIlllll, SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
            return new SSLEngineResult(this.getEngineStatus(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, OpenSslEngine.lllllllllIIIl[0], OpenSslEngine.lllllllllIIIl[0]);
        }
        int lllllllllllllIlIlIIllIIIIIIllllI = OpenSslEngine.lllllllllIIIl[0];
        int lllllllllllllIlIlIIllIIIIIIlllIl = SSL.pendingWrittenBytesInBIO(this.networkBIO);
        if (!lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIIIlllIl)) {
            int lllllllllllllIlIlIIllIIIIIIlllII = OpenSslEngine.lllllllllIIIl[0];
            int lllllllllllllIlIlIIllIIIIIlIIlIl = lllllllllllllIlIlIIllIIIIIlIIIlI;
            while (lIllIIIllllllII(lllllllllllllIlIlIIllIIIIIlIIlIl, lllllllllllllIlIlIIllIIIIIIllIII)) {
                final ByteBuffer lllllllllllllIlIlIIllIIIIIlIIllI = lllllllllllllIlIlIIllIIIIIIllIlI[lllllllllllllIlIlIIllIIIIIlIIlIl];
                while (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIIlIIllI.hasRemaining() ? 1 : 0)) {
                    try {
                        lllllllllllllIlIlIIllIIIIIIlllII += this.writePlaintextData(lllllllllllllIlIlIIllIIIIIlIIllI);
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    catch (Exception lllllllllllllIlIlIIllIIIIIlIlIIl) {
                        throw new SSLException(lllllllllllllIlIlIIllIIIIIlIlIIl);
                    }
                    lllllllllllllIlIlIIllIIIIIIlllIl = SSL.pendingWrittenBytesInBIO(this.networkBIO);
                    if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIIIlllIl)) {
                        final int lllllllllllllIlIlIIllIIIIIlIIlll = lllllllllllllIlIlIIllIIIIIlIIIII.remaining();
                        if (lIllIIIllllllII(lllllllllllllIlIlIIllIIIIIlIIlll, lllllllllllllIlIlIIllIIIIIIlllIl)) {
                            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, this.getHandshakeStatus(), lllllllllllllIlIlIIllIIIIIIlllII, lllllllllllllIlIlIIllIIIIIIllllI);
                        }
                        try {
                            lllllllllllllIlIlIIllIIIIIIllllI += this.readEncryptedData(lllllllllllllIlIlIIllIIIIIlIIIII, lllllllllllllIlIlIIllIIIIIIlllIl);
                            "".length();
                            if (-" ".length() == ("   ".length() & ("   ".length() ^ -" ".length()))) {
                                return null;
                            }
                        }
                        catch (Exception lllllllllllllIlIlIIllIIIIIlIlIII) {
                            throw new SSLException(lllllllllllllIlIlIIllIIIIIlIlIII);
                        }
                        return new SSLEngineResult(this.getEngineStatus(), this.getHandshakeStatus(), lllllllllllllIlIlIIllIIIIIIlllII, lllllllllllllIlIlIIllIIIIIIllllI);
                    }
                }
                ++lllllllllllllIlIlIIllIIIIIlIIlIl;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            return new SSLEngineResult(this.getEngineStatus(), this.getHandshakeStatus(), lllllllllllllIlIlIIllIIIIIIlllII, lllllllllllllIlIlIIllIIIIIIllllI);
        }
        final int lllllllllllllIlIlIIllIIIIIlIlIlI = lllllllllllllIlIlIIllIIIIIlIIIII.remaining();
        if (lIllIIIllllllII(lllllllllllllIlIlIIllIIIIIlIlIlI, lllllllllllllIlIlIIllIIIIIIlllIl)) {
            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, lllllllllllllIlIlIIllIIIIIIlllll, OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIIIIllllI);
        }
        try {
            lllllllllllllIlIlIIllIIIIIIllllI += this.readEncryptedData(lllllllllllllIlIlIIllIIIIIlIIIII, lllllllllllllIlIlIIllIIIIIIlllIl);
            "".length();
            if ((0x7F ^ 0x7B) < (0x72 ^ 0x76)) {
                return null;
            }
        }
        catch (Exception lllllllllllllIlIlIIllIIIIIlIlIll) {
            throw new SSLException(lllllllllllllIlIlIIllIIIIIlIlIll);
        }
        if (lIllIIIlllllIII(this.isOutboundDone ? 1 : 0)) {
            this.shutdown();
        }
        return new SSLEngineResult(this.getEngineStatus(), this.getHandshakeStatus(), OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIIIIllllI);
    }
    
    @Override
    public synchronized void closeOutbound() {
        if (lIllIIIlllllIII(this.isOutboundDone ? 1 : 0)) {
            return;
        }
        this.isOutboundDone = (OpenSslEngine.lllllllllIIIl[1] != 0);
        this.engineClosed = (OpenSslEngine.lllllllllIIIl[1] != 0);
        if (lIllIIIlllllIII(this.accepted) && lIllIIIllllIllI(this.destroyed)) {
            final int lllllllllllllIlIlIIlIlllllIlIIlI = SSL.getShutdown(this.ssl);
            if (lIllIIlIIIIIIlI(lllllllllllllIlIlIIlIlllllIlIIlI & OpenSslEngine.lllllllllIIIl[1], OpenSslEngine.lllllllllIIIl[1])) {
                SSL.shutdownSSL(this.ssl);
                "".length();
            }
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            this.shutdown();
        }
    }
    
    private static boolean lIllIIIllllllIl(final int lllllllllllllIlIlIIlIlllIlIlIIIl, final int lllllllllllllIlIlIIlIlllIlIlIIII) {
        return lllllllllllllIlIlIIlIlllIlIlIIIl > lllllllllllllIlIlIIlIlllIlIlIIII;
    }
    
    @Override
    public void setEnabledCipherSuites(final String[] lllllllllllllIlIlIIlIlllllIIlIII) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean getUseClientMode() {
        return OpenSslEngine.lllllllllIIIl[0] != 0;
    }
    
    private static void lIllIIIllllIIll() {
        (lllllllllIIII = new String[OpenSslEngine.lllllllllIIIl[31]])[OpenSslEngine.lllllllllIIIl[0]] = lIllIIIllllIIII("06lw5Z+6iFWN2IFpMRj7lA==", "wANOl");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[1]] = lIllIIIllllIIIl("CwIqCzs=", "jnFdX");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[3]] = lIllIIIllllIIIl("GRooRwA4IBAMIyUaNyVfY2kWDAM/OwoME2ooRAcYJGQUBgQjPQ0fEmo/BQUCL3NE", "JIdiw");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[5]] = lIllIIIllllIIlI("eN03rVksC0k=", "DZLdq");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[6]] = lIllIIIllllIIlI("M8CffCrsxMA=", "ywAVx");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[7]] = lIllIIIllllIIlI("kqu5CHaj2FU2CKPJBZ7pYg==", "NGWdg");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[8]] = lIllIIIllllIIlI("200uXRVkxlMryE/z459zjQ==", "yvPWE");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[9]] = lIllIIIllllIIlI("Kvl+GSsyIk4F+x5xJ1X0MyYfotTm/X/YMT88l2XcqyKTi6mkNeUbZ5q3z2vluVPWc1hh0KOHy2c=", "SVoaS");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[10]] = lIllIIIllllIIII("68otmX2pBo8=", "oHGTD");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[11]] = lIllIIIllllIIIl("MCsE", "CYghO");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[12]] = lIllIIIllllIIIl("KiMsJg==", "NPXUi");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[13]] = lIllIIIllllIIII("JkQolIpjYSi7WeQIv6RY3Q==", "OIKQy");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[14]] = lIllIIIllllIIlI("MjKRZmEyr8EAbt9daBbFMw==", "pwgIl");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[15]] = lIllIIIllllIIIl("QUILESEECRoMNVtKAQ83Eg8aSW1cSgEPNxIPGkl6QQYLBzYVAk5VbEEOHR0iTwYLBzYVAk5B", "ajniQ");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[16]] = lIllIIIllllIIIl("eUg=", "PaHLa");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[17]] = lIllIIIllllIIlI("BxZeJKaejYYdRN09mhpw9A==", "DvitX");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[18]] = lIllIIIllllIIlI("MfIKvCR9FwwW12tNrunvaZEOgURVpC3+tdBzLx4OZxMttGLOlvjohg==", "mQIcO");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[19]] = lIllIIIllllIIII("NWqLwponhPcqFed5BHzhHNXFVyUyDy4D", "tZgAl");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[21]] = lIllIIIllllIIII("2+YAiDeWkuN+qIUjsUp/g5TElJAvXNux8e8FG6mvVT2ZtjUuffYjONQYySHpFOLl+GeKa1Mmgl1rdfYNY47JtA3xEWEyWJNbZYSYVVKsc4nBi3lasWmKrQ==", "OzWWl");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[27]] = lIllIIIllllIIIl("HTkhDwQddyUKBQsyIg==", "xWFfj");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[28]] = lIllIIIllllIIII("gZGqoJwAX+bhiDwzGovyu03vxHU4+yABWzUhz49QDeU=", "FaknR");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[29]] = lIllIIIllllIIII("hG/VcFtbgJ08vBXJRkeQEIkruj8Eth24rPqOWQDudNo=", "GDfky");
        OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[30]] = lIllIIIllllIIII("/csqNGh9LlFP4uAZ8410EQ==", "eOLAR");
    }
    
    @Override
    public String[] getEnabledProtocols() {
        return EmptyArrays.EMPTY_STRINGS;
    }
    
    static {
        lIllIIIllllIlII();
        lIllIIIllllIIll();
        MAX_ENCRYPTED_PACKET_LENGTH = OpenSslEngine.lllllllllIIIl[4];
        MAX_COMPRESSED_LENGTH = OpenSslEngine.lllllllllIIIl[24];
        MAX_ENCRYPTION_OVERHEAD_LENGTH = OpenSslEngine.lllllllllIIIl[25];
        MAX_PLAINTEXT_LENGTH = OpenSslEngine.lllllllllIIIl[2];
        MAX_CIPHERTEXT_LENGTH = OpenSslEngine.lllllllllIIIl[26];
        logger = InternalLoggerFactory.getInstance(OpenSslEngine.class);
        EMPTY_CERTIFICATES = new Certificate[OpenSslEngine.lllllllllIIIl[0]];
        EMPTY_X509_CERTIFICATES = new X509Certificate[OpenSslEngine.lllllllllIIIl[0]];
        ENGINE_CLOSED = new SSLException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[27]]);
        RENEGOTIATION_UNSUPPORTED = new SSLException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[28]]);
        ENCRYPTED_PACKET_OVERSIZED = new SSLException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[29]]);
        OpenSslEngine.ENGINE_CLOSED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        OpenSslEngine.RENEGOTIATION_UNSUPPORTED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        OpenSslEngine.ENCRYPTED_PACKET_OVERSIZED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        DESTROYED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(OpenSslEngine.class, OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[30]]);
    }
    
    @Override
    public boolean getNeedClientAuth() {
        return OpenSslEngine.lllllllllIIIl[0] != 0;
    }
    
    @Override
    public void setUseClientMode(final boolean lllllllllllllIlIlIIlIllllIlIllII) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIlIllllIlIllII ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
    }
    
    @Override
    public void setEnabledProtocols(final String[] lllllllllllllIlIlIIlIlllllIIIlII) {
        throw new UnsupportedOperationException();
    }
    
    public synchronized void shutdown() {
        if (lIllIIIlllllIII(OpenSslEngine.DESTROYED_UPDATER.compareAndSet(this, OpenSslEngine.lllllllllIIIl[0], OpenSslEngine.lllllllllIIIl[1]) ? 1 : 0)) {
            SSL.freeSSL(this.ssl);
            SSL.freeBIO(this.networkBIO);
            final long n = 0L;
            this.networkBIO = n;
            this.ssl = n;
            final int isInboundDone = OpenSslEngine.lllllllllIIIl[1];
            this.engineClosed = (isInboundDone != 0);
            this.isOutboundDone = (isInboundDone != 0);
            this.isInboundDone = (isInboundDone != 0);
        }
    }
    
    private int readPlaintextData(final ByteBuffer lllllllllllllIlIlIIllIIIIllIIIII) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIllIIIII.isDirect() ? 1 : 0)) {
            final int lllllllllllllIlIlIIllIIIIllIllII = lllllllllllllIlIlIIllIIIIllIIIII.position();
            final long lllllllllllllIlIlIIllIIIIllIlIll = Buffer.address(lllllllllllllIlIlIIllIIIIllIIIII) + lllllllllllllIlIlIIllIIIIllIllII;
            final int lllllllllllllIlIlIIllIIIIllIlIlI = lllllllllllllIlIlIIllIIIIllIIIII.limit() - lllllllllllllIlIlIIllIIIIllIllII;
            final int lllllllllllllIlIlIIllIIIIllIlIIl = SSL.readFromSSL(this.ssl, lllllllllllllIlIlIIllIIIIllIlIll, lllllllllllllIlIlIIllIIIIllIlIlI);
            if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIllIlIIl)) {
                lllllllllllllIlIlIIllIIIIllIIIII.position(lllllllllllllIlIlIIllIIIIllIllII + lllllllllllllIlIlIIllIIIIllIlIIl);
                "".length();
                return lllllllllllllIlIlIIllIIIIllIlIIl;
            }
            "".length();
            if (null != null) {
                return (15 + 14 + 7 + 214 ^ 3 + 150 - 39 + 68) & (0x7E ^ 0xB ^ (0x3 ^ 0x3A) ^ -" ".length());
            }
        }
        else {
            final int lllllllllllllIlIlIIllIIIIllIIlIl = lllllllllllllIlIlIIllIIIIllIIIII.position();
            final int lllllllllllllIlIlIIllIIIIllIIlII = lllllllllllllIlIlIIllIIIIllIIIII.limit();
            final int lllllllllllllIlIlIIllIIIIllIIIll = Math.min(OpenSslEngine.lllllllllIIIl[4], lllllllllllllIlIlIIllIIIIllIIlII - lllllllllllllIlIlIIllIIIIllIIlIl);
            final ByteBuf lllllllllllllIlIlIIllIIIIllIIIlI = this.alloc.directBuffer(lllllllllllllIlIlIIllIIIIllIIIll);
            try {
                long lllllllllllllIlIlIIllIIIIllIIlll = 0L;
                if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIIllIIIlI.hasMemoryAddress() ? 1 : 0)) {
                    final long lllllllllllllIlIlIIllIIIIllIlIII = lllllllllllllIlIlIIllIIIIllIIIlI.memoryAddress();
                    "".length();
                    if (" ".length() <= 0) {
                        return (0xBC ^ 0x9B) & ~(0xE5 ^ 0xC2);
                    }
                }
                else {
                    lllllllllllllIlIlIIllIIIIllIIlll = Buffer.address(lllllllllllllIlIlIIllIIIIllIIIlI.nioBuffer());
                }
                final int lllllllllllllIlIlIIllIIIIllIIllI = SSL.readFromSSL(this.ssl, lllllllllllllIlIlIIllIIIIllIIlll, lllllllllllllIlIlIIllIIIIllIIIll);
                if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIIllIIllI)) {
                    lllllllllllllIlIlIIllIIIIllIIIII.limit(lllllllllllllIlIlIIllIIIIllIIlIl + lllllllllllllIlIlIIllIIIIllIIllI);
                    "".length();
                    lllllllllllllIlIlIIllIIIIllIIIlI.getBytes(OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIIllIIIII);
                    "".length();
                    lllllllllllllIlIlIIllIIIIllIIIII.limit(lllllllllllllIlIlIIllIIIIllIIlII);
                    "".length();
                    final Exception lllllllllllllIlIlIIllIIIIlIlIlll = (Exception)lllllllllllllIlIlIIllIIIIllIIllI;
                    return (int)lllllllllllllIlIlIIllIIIIlIlIlll;
                }
                lllllllllllllIlIlIIllIIIIllIIIlI.release();
                "".length();
                "".length();
                if (null != null) {
                    return (0x89 ^ 0xB2 ^ (0x2D ^ 0xC)) & (161 + 141 - 159 + 30 ^ 172 + 154 - 202 + 59 ^ -" ".length());
                }
            }
            finally {
                lllllllllllllIlIlIIllIIIIllIIIlI.release();
                "".length();
            }
        }
        return OpenSslEngine.lllllllllIIIl[0];
    }
    
    private static boolean lIllIIIllllllll(final Object lllllllllllllIlIlIIlIlllIlIIlIlI) {
        return lllllllllllllIlIlIIlIlllIlIIlIlI != null;
    }
    
    private static boolean lIllIIlIIIIIIlI(final int lllllllllllllIlIlIIlIlllIIlllIll, final int lllllllllllllIlIlIIlIlllIIlllIlI) {
        return lllllllllllllIlIlIIlIlllIIlllIll != lllllllllllllIlIlIIlIlllIIlllIlI;
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        return EmptyArrays.EMPTY_STRINGS;
    }
    
    @Override
    public void setNeedClientAuth(final boolean lllllllllllllIlIlIIlIllllIlIIlll) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIlIllllIlIIlll ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
    }
    
    private static boolean lIllIIlIIIIIIIl(final int lllllllllllllIlIlIIlIlllIlIlllIl, final int lllllllllllllIlIlIIlIlllIlIlllII) {
        return lllllllllllllIlIlIIlIlllIlIlllIl == lllllllllllllIlIlIIlIlllIlIlllII;
    }
    
    private static boolean lIllIIIlllllllI(final Object lllllllllllllIlIlIIlIlllIlIIllIl, final Object lllllllllllllIlIlIIlIlllIlIIllII) {
        return lllllllllllllIlIlIIlIlllIlIIllIl == lllllllllllllIlIlIIlIlllIlIIllII;
    }
    
    private static void lIllIIIllllIlII() {
        (lllllllllIIIl = new int[32])[0] = ((0x7E ^ 0x66) & ~(0xB5 ^ 0xAD));
        OpenSslEngine.lllllllllIIIl[1] = " ".length();
        OpenSslEngine.lllllllllIIIl[2] = (0xFFFFC5CF & 0x7A30);
        OpenSslEngine.lllllllllIIIl[3] = "  ".length();
        OpenSslEngine.lllllllllIIIl[4] = (-(0xFFFFF7F1 & 0x1C0F) & (0xFFFFFF3D & 0x5DDB));
        OpenSslEngine.lllllllllIIIl[5] = "   ".length();
        OpenSslEngine.lllllllllIIIl[6] = (0x9B ^ 0x9F);
        OpenSslEngine.lllllllllIIIl[7] = (0x8D ^ 0x88);
        OpenSslEngine.lllllllllIIIl[8] = (0x48 ^ 0x2E ^ (0xD7 ^ 0xB7));
        OpenSslEngine.lllllllllIIIl[9] = (0x1B ^ 0x1C);
        OpenSslEngine.lllllllllIIIl[10] = (0x43 ^ 0x72 ^ (0x69 ^ 0x50));
        OpenSslEngine.lllllllllIIIl[11] = (0x17 ^ 0x1E);
        OpenSslEngine.lllllllllIIIl[12] = (62 + 147 - 153 + 110 ^ 149 + 6 - 126 + 143);
        OpenSslEngine.lllllllllIIIl[13] = (0x10 ^ 0x1B);
        OpenSslEngine.lllllllllIIIl[14] = (0x30 ^ 0x7C ^ (0xD2 ^ 0x92));
        OpenSslEngine.lllllllllIIIl[15] = (92 + 182 - 88 + 1 ^ 81 + 107 - 40 + 34);
        OpenSslEngine.lllllllllIIIl[16] = (0xDD ^ 0x84 ^ (0xC1 ^ 0x96));
        OpenSslEngine.lllllllllIIIl[17] = (0x97 ^ 0x87 ^ (0x81 ^ 0x9E));
        OpenSslEngine.lllllllllIIIl[18] = (75 + 38 - 34 + 58 ^ 87 + 120 - 122 + 68);
        OpenSslEngine.lllllllllIIIl[19] = (0xD4 ^ 0x84 ^ (0xF9 ^ 0xB8));
        OpenSslEngine.lllllllllIIIl[20] = (0x91 ^ 0x89 ^ (0x78 ^ 0x47));
        OpenSslEngine.lllllllllIIIl[21] = (0x7F ^ 0x7A ^ (0x6C ^ 0x7B));
        OpenSslEngine.lllllllllIIIl[22] = (0xA8 ^ 0x92);
        OpenSslEngine.lllllllllIIIl[23] = (0xDE ^ 0xA7 ^ (0x9D ^ 0xBB));
        OpenSslEngine.lllllllllIIIl[24] = (0xFFFFCE33 & 0x75CC);
        OpenSslEngine.lllllllllIIIl[25] = (0xFFFF9F3D & 0x69DB);
        OpenSslEngine.lllllllllIIIl[26] = (0xFFFFC952 & 0x7EAD);
        OpenSslEngine.lllllllllIIIl[27] = (0x2 ^ 0x11);
        OpenSslEngine.lllllllllIIIl[28] = (0xBB ^ 0xAF);
        OpenSslEngine.lllllllllIIIl[29] = (0x4F ^ 0x78 ^ (0xB3 ^ 0x91));
        OpenSslEngine.lllllllllIIIl[30] = (0x73 ^ 0x65);
        OpenSslEngine.lllllllllIIIl[31] = (0xD3 ^ 0xC4);
    }
    
    private int writePlaintextData(final ByteBuffer lllllllllllllIlIlIIllIIIlIIlllIl) {
        final int lllllllllllllIlIlIIllIIIlIlIIIlI = lllllllllllllIlIlIIllIIIlIIlllIl.position();
        final int lllllllllllllIlIlIIllIIIlIlIIIIl = lllllllllllllIlIlIIllIIIlIIlllIl.limit();
        final int lllllllllllllIlIlIIllIIIlIlIIIII = Math.min(lllllllllllllIlIlIIllIIIlIlIIIIl - lllllllllllllIlIlIIllIIIlIlIIIlI, OpenSslEngine.lllllllllIIIl[2]);
        int lllllllllllllIlIlIIllIIIlIIlllll = 0;
        if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIlIIlllIl.isDirect() ? 1 : 0)) {
            final long lllllllllllllIlIlIIllIIIlIlIlIIl = Buffer.address(lllllllllllllIlIlIIllIIIlIIlllIl) + lllllllllllllIlIlIIllIIIlIlIIIlI;
            final int lllllllllllllIlIlIIllIIIlIlIlIII = SSL.writeToSSL(this.ssl, lllllllllllllIlIlIIllIIIlIlIlIIl, lllllllllllllIlIlIIllIIIlIlIIIII);
            if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIlIlIlIII)) {
                lllllllllllllIlIlIIllIIIlIIlllIl.position(lllllllllllllIlIlIIllIIIlIlIIIlI + lllllllllllllIlIlIIllIIIlIlIlIII);
                "".length();
                return lllllllllllllIlIlIIllIIIlIlIlIII;
            }
            "".length();
            if ("   ".length() <= 0) {
                return (161 + 19 - 178 + 169 ^ 4 + 33 - 33 + 172) & (179 + 160 - 272 + 117 ^ 162 + 22 - 154 + 133 ^ -" ".length());
            }
        }
        else {
            final ByteBuf lllllllllllllIlIlIIllIIIlIlIIlIl = this.alloc.directBuffer(lllllllllllllIlIlIIllIIIlIlIIIII);
            try {
                long lllllllllllllIlIlIIllIIIlIlIIllI;
                if (lIllIIIlllllIII(lllllllllllllIlIlIIllIIIlIlIIlIl.hasMemoryAddress() ? 1 : 0)) {
                    final long lllllllllllllIlIlIIllIIIlIlIIlll = lllllllllllllIlIlIIllIIIlIlIIlIl.memoryAddress();
                    "".length();
                    if ((0x60 ^ 0x72 ^ (0xBE ^ 0xA9)) == 0x0) {
                        return (0xAB ^ 0x8B ^ (0xAC ^ 0x88)) & (47 + 50 - 0 + 75 ^ 22 + 134 - 148 + 160 ^ -" ".length());
                    }
                }
                else {
                    lllllllllllllIlIlIIllIIIlIlIIllI = Buffer.address(lllllllllllllIlIlIIllIIIlIlIIlIl.nioBuffer());
                }
                lllllllllllllIlIlIIllIIIlIIlllIl.limit(lllllllllllllIlIlIIllIIIlIlIIIlI + lllllllllllllIlIlIIllIIIlIlIIIII);
                "".length();
                lllllllllllllIlIlIIllIIIlIlIIlIl.setBytes(OpenSslEngine.lllllllllIIIl[0], lllllllllllllIlIlIIllIIIlIIlllIl);
                "".length();
                lllllllllllllIlIlIIllIIIlIIlllIl.limit(lllllllllllllIlIlIIllIIIlIlIIIIl);
                "".length();
                lllllllllllllIlIlIIllIIIlIIlllll = SSL.writeToSSL(this.ssl, lllllllllllllIlIlIIllIIIlIlIIllI, lllllllllllllIlIlIIllIIIlIlIIIII);
                if (lIllIIIlllllIIl(lllllllllllllIlIlIIllIIIlIIlllll)) {
                    lllllllllllllIlIlIIllIIIlIIlllIl.position(lllllllllllllIlIlIIllIIIlIlIIIlI + lllllllllllllIlIlIIllIIIlIIlllll);
                    "".length();
                    final Exception lllllllllllllIlIlIIllIIIlIIlIllI = (Exception)lllllllllllllIlIlIIllIIIlIIlllll;
                    return (int)lllllllllllllIlIlIIllIIIlIIlIllI;
                }
                lllllllllllllIlIlIIllIIIlIIlllIl.position(lllllllllllllIlIlIIllIIIlIlIIIlI);
                "".length();
                lllllllllllllIlIlIIllIIIlIlIIlIl.release();
                "".length();
                "".length();
                if ("   ".length() == " ".length()) {
                    return (89 + 6 + 74 + 27 ^ 54 + 74 - 99 + 107) & (0x19 ^ 0x9 ^ (0x68 ^ 0x34) ^ -" ".length());
                }
            }
            finally {
                lllllllllllllIlIlIIllIIIlIlIIlIl.release();
                "".length();
            }
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[3]]).append(lllllllllllllIlIlIIllIIIlIIlllll)));
    }
    
    @Override
    public void setEnableSessionCreation(final boolean lllllllllllllIlIlIIlIllllIIlllIl) {
        if (lIllIIIlllllIII(lllllllllllllIlIlIIlIllllIIlllIl ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
    }
    
    private static boolean lIllIIIllllllII(final int lllllllllllllIlIlIIlIlllIlIlIlIl, final int lllllllllllllIlIlIIlIlllIlIlIlII) {
        return lllllllllllllIlIlIIlIlllIlIlIlIl < lllllllllllllIlIlIIlIlllIlIlIlII;
    }
    
    private static boolean lIllIIIlllllIIl(final int lllllllllllllIlIlIIlIlllIIlllllI) {
        return lllllllllllllIlIlIIlIlllIIlllllI > 0;
    }
    
    @Override
    public synchronized boolean isInboundDone() {
        int n;
        if (!lIllIIIllllIllI(this.isInboundDone ? 1 : 0) || lIllIIIlllllIII(this.engineClosed ? 1 : 0)) {
            n = OpenSslEngine.lllllllllIIIl[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0xBC ^ 0x94) & ~(0x52 ^ 0x7A)) != 0x0;
            }
        }
        else {
            n = OpenSslEngine.lllllllllIIIl[0];
        }
        return n != 0;
    }
    
    private static String lIllIIIllllIIlI(final String lllllllllllllIlIlIIlIlllIllIIIll, final String lllllllllllllIlIlIIlIlllIllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIlllIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIlllIllIIIlI.getBytes(StandardCharsets.UTF_8)), OpenSslEngine.lllllllllIIIl[10]), "DES");
            final Cipher lllllllllllllIlIlIIlIlllIllIIlll = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIlllIllIIlll.init(OpenSslEngine.lllllllllIIIl[3], lllllllllllllIlIlIIlIlllIllIlIII);
            return new String(lllllllllllllIlIlIIlIlllIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIlllIllIIllI) {
            lllllllllllllIlIlIIlIlllIllIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public synchronized boolean isOutboundDone() {
        return this.isOutboundDone;
    }
    
    private synchronized void beginHandshakeImplicitly() throws SSLException {
        if (lIllIIIlllllIII(this.engineClosed ? 1 : 0)) {
            throw OpenSslEngine.ENGINE_CLOSED;
        }
        if (lIllIIIllllIllI(this.accepted)) {
            SSL.doHandshake(this.ssl);
            "".length();
            this.accepted = OpenSslEngine.lllllllllIIIl[1];
        }
    }
    
    @Override
    public synchronized SSLEngineResult unwrap(final ByteBuffer lllllllllllllIlIlIIlIllllllIlIlI, final ByteBuffer[] lllllllllllllIlIlIIlIlllllllIllI, final int lllllllllllllIlIlIIlIllllllIlIII, final int lllllllllllllIlIlIIlIlllllllIlII) throws SSLException {
        if (lIllIIIlllllIII(this.destroyed)) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, OpenSslEngine.lllllllllIIIl[0], OpenSslEngine.lllllllllIIIl[0]);
        }
        if (lIllIIIllllIlll(lllllllllllllIlIlIIlIllllllIlIlI)) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[11]]);
        }
        if (lIllIIIllllIlll(lllllllllllllIlIlIIlIlllllllIllI)) {
            throw new NullPointerException(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[12]]);
        }
        if (!lIllIIIllllllII(lllllllllllllIlIlIIlIllllllIlIII, lllllllllllllIlIlIIlIlllllllIllI.length) || lIllIIIllllllIl(lllllllllllllIlIlIIlIllllllIlIII + lllllllllllllIlIlIIlIlllllllIlII, lllllllllllllIlIlIIlIlllllllIllI.length)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[13]]).append(lllllllllllllIlIlIIlIllllllIlIII).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[14]]).append(lllllllllllllIlIlIIlIlllllllIlII).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[15]]).append(lllllllllllllIlIlIIlIlllllllIllI.length).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[16]])));
        }
        int lllllllllllllIlIlIIlIlllllllIIll = OpenSslEngine.lllllllllIIIl[0];
        final int lllllllllllllIlIlIIlIlllllllIIlI = lllllllllllllIlIlIIlIllllllIlIII + lllllllllllllIlIlIIlIlllllllIlII;
        int lllllllllllllIlIlIIlIlllllllllIl = lllllllllllllIlIlIIlIllllllIlIII;
        while (lIllIIIllllllII(lllllllllllllIlIlIIlIlllllllllIl, lllllllllllllIlIlIIlIlllllllIIlI)) {
            final ByteBuffer lllllllllllllIlIlIIlIllllllllllI = lllllllllllllIlIlIIlIlllllllIllI[lllllllllllllIlIlIIlIlllllllllIl];
            if (lIllIIIllllIlll(lllllllllllllIlIlIIlIllllllllllI)) {
                throw new IllegalArgumentException();
            }
            if (lIllIIIlllllIII(lllllllllllllIlIlIIlIllllllllllI.isReadOnly() ? 1 : 0)) {
                throw new ReadOnlyBufferException();
            }
            lllllllllllllIlIlIIlIlllllllIIll += lllllllllllllIlIlIIlIllllllllllI.remaining();
            ++lllllllllllllIlIlIIlIlllllllllIl;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        if (lIllIIIllllIllI(this.accepted)) {
            this.beginHandshakeImplicitly();
        }
        final SSLEngineResult.HandshakeStatus lllllllllllllIlIlIIlIlllllllIIIl = this.getHandshakeStatus();
        if ((!lIllIIIlllllIII(this.handshakeFinished ? 1 : 0) || lIllIIIlllllIII(this.engineClosed ? 1 : 0)) && lIllIIIlllllllI(lllllllllllllIlIlIIlIlllllllIIIl, SSLEngineResult.HandshakeStatus.NEED_WRAP)) {
            return new SSLEngineResult(this.getEngineStatus(), SSLEngineResult.HandshakeStatus.NEED_WRAP, OpenSslEngine.lllllllllIIIl[0], OpenSslEngine.lllllllllIIIl[0]);
        }
        if (lIllIIIllllllIl(lllllllllllllIlIlIIlIllllllIlIlI.remaining(), OpenSslEngine.lllllllllIIIl[4])) {
            this.isInboundDone = (OpenSslEngine.lllllllllIIIl[1] != 0);
            this.isOutboundDone = (OpenSslEngine.lllllllllIIIl[1] != 0);
            this.engineClosed = (OpenSslEngine.lllllllllIIIl[1] != 0);
            this.shutdown();
            throw OpenSslEngine.ENCRYPTED_PACKET_OVERSIZED;
        }
        int lllllllllllllIlIlIIlIlllllllIIII = OpenSslEngine.lllllllllIIIl[0];
        this.lastPrimingReadResult = OpenSslEngine.lllllllllIIIl[0];
        try {
            lllllllllllllIlIlIIlIlllllllIIII += this.writeEncryptedData(lllllllllllllIlIlIIlIllllllIlIlI);
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (Exception lllllllllllllIlIlIIlIlllllllllII) {
            throw new SSLException(lllllllllllllIlIlIIlIlllllllllII);
        }
        final String lllllllllllllIlIlIIlIllllllIllll = SSL.getLastError();
        if (lIllIIIllllllll(lllllllllllllIlIlIIlIllllllIllll) && lIllIIIllllIllI(lllllllllllllIlIlIIlIllllllIllll.startsWith(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[17]]) ? 1 : 0)) {
            if (lIllIIIlllllIII(OpenSslEngine.logger.isInfoEnabled() ? 1 : 0)) {
                OpenSslEngine.logger.info(String.valueOf(new StringBuilder().append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[18]]).append(this.lastPrimingReadResult).append(OpenSslEngine.lllllllllIIII[OpenSslEngine.lllllllllIIIl[19]]).append(lllllllllllllIlIlIIlIllllllIllll).append((char)OpenSslEngine.lllllllllIIIl[20])));
            }
            this.shutdown();
            throw new SSLException(lllllllllllllIlIlIIlIllllllIllll);
        }
        int pendingReadableBytesInSSL;
        if (lIllIIIllllIllI(SSL.isInInit(this.ssl))) {
            pendingReadableBytesInSSL = SSL.pendingReadableBytesInSSL(this.ssl);
            "".length();
            if ("   ".length() < ((0x16 ^ 0x5D ^ "  ".length()) & (0xDC ^ 0x90 ^ (0x2D ^ 0x28) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            pendingReadableBytesInSSL = OpenSslEngine.lllllllllIIIl[0];
        }
        int lllllllllllllIlIlIIlIllllllIlllI = pendingReadableBytesInSSL;
        if (lIllIIIllllllII(lllllllllllllIlIlIIlIlllllllIIll, lllllllllllllIlIlIIlIllllllIlllI)) {
            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, this.getHandshakeStatus(), lllllllllllllIlIlIIlIlllllllIIII, OpenSslEngine.lllllllllIIIl[0]);
        }
        int lllllllllllllIlIlIIlIllllllIllIl = OpenSslEngine.lllllllllIIIl[0];
        int lllllllllllllIlIlIIlIllllllIllII = lllllllllllllIlIlIIlIllllllIlIII;
        while (lIllIIIllllllII(lllllllllllllIlIlIIlIllllllIllII, lllllllllllllIlIlIIlIlllllllIIlI)) {
            final ByteBuffer lllllllllllllIlIlIIlIllllllllIlI = lllllllllllllIlIlIIlIlllllllIllI[lllllllllllllIlIlIIlIllllllIllII];
            if (lIllIIIllllIllI(lllllllllllllIlIlIIlIllllllllIlI.hasRemaining() ? 1 : 0)) {
                ++lllllllllllllIlIlIIlIllllllIllII;
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
                continue;
            }
            else if (lIllIIlIIIIIIII(lllllllllllllIlIlIIlIllllllIlllI)) {
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                int lllllllllllllIlIlIIlIllllllllIIl;
                try {
                    lllllllllllllIlIlIIlIllllllllIIl = this.readPlaintextData(lllllllllllllIlIlIIlIllllllllIlI);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (Exception lllllllllllllIlIlIIlIllllllllIll) {
                    throw new SSLException(lllllllllllllIlIlIIlIllllllllIll);
                }
                if (lIllIIIllllIllI(lllllllllllllIlIlIIlIllllllllIIl)) {
                    "".length();
                    if ("   ".length() < ((0x16 ^ 0x5F) & ~(0x5 ^ 0x4C))) {
                        return null;
                    }
                    break;
                }
                else {
                    lllllllllllllIlIlIIlIllllllIllIl += lllllllllllllIlIlIIlIllllllllIIl;
                    lllllllllllllIlIlIIlIllllllIlllI -= lllllllllllllIlIlIIlIllllllllIIl;
                    if (lIllIIIllllIllI(lllllllllllllIlIlIIlIllllllllIlI.hasRemaining() ? 1 : 0)) {
                        ++lllllllllllllIlIlIIlIllllllIllII;
                    }
                    "".length();
                    if (((93 + 56 - 74 + 80 ^ 24 + 82 - 22 + 48) & (57 + 163 - 117 + 77 ^ 49 + 40 - 68 + 150 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    continue;
                }
            }
        }
        if (lIllIIIllllIllI(this.receivedShutdown ? 1 : 0) && lIllIIlIIIIIIIl(SSL.getShutdown(this.ssl) & OpenSslEngine.lllllllllIIIl[3], OpenSslEngine.lllllllllIIIl[3])) {
            this.receivedShutdown = (OpenSslEngine.lllllllllIIIl[1] != 0);
            this.closeOutbound();
            this.closeInbound();
        }
        return new SSLEngineResult(this.getEngineStatus(), this.getHandshakeStatus(), lllllllllllllIlIlIIlIlllllllIIII, lllllllllllllIlIlIIlIllllllIllIl);
    }
    
    private static boolean lIllIIIlllllIll(final int lllllllllllllIlIlIIlIlllIlIllIIl, final int lllllllllllllIlIlIIlIlllIlIllIII) {
        return lllllllllllllIlIlIIlIlllIlIllIIl >= lllllllllllllIlIlIIlIlllIlIllIII;
    }
}
