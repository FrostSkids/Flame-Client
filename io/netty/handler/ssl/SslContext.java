// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.List;
import java.lang.constant.Constable;
import javax.net.ssl.SSLEngine;
import io.netty.buffer.ByteBufAllocator;
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

public abstract class SslContext
{
    private static final /* synthetic */ String[] lllIIlIIlIIllI;
    private static final /* synthetic */ int[] lllIIlIIlIlIII;
    
    private static boolean lIIlllllIIllIIll(final int llllllllllllIlIllllIlllIIlIIIllI) {
        return llllllllllllIlIllllIlllIIlIIIllI == 0;
    }
    
    SslContext() {
    }
    
    public static SslContext newClientContext(final SslProvider llllllllllllIlIllllIlllIlIIlllll, final File llllllllllllIlIllllIlllIlIlIIIII) throws SSLException {
        return newClientContext(llllllllllllIlIllllIlllIlIIlllll, llllllllllllIlIllllIlllIlIlIIIII, null, null, null, 0L, 0L);
    }
    
    private static String lIIlllllIIlIllII(final String llllllllllllIlIllllIlllIIlIlIlll, final String llllllllllllIlIllllIlllIIlIlIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIlllIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIlllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), SslContext.lllIIlIIlIlIII[2]), "DES");
            final Cipher llllllllllllIlIllllIlllIIlIllIIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIlllIIlIllIIl.init(SslContext.lllIIlIIlIlIII[3], llllllllllllIlIllllIlllIIlIllIlI);
            return new String(llllllllllllIlIllllIlllIIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIlllIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIlllIIlIllIII) {
            llllllllllllIlIllllIlllIIlIllIII.printStackTrace();
            return null;
        }
    }
    
    public abstract long sessionCacheSize();
    
    public final SslHandler newHandler(final ByteBufAllocator llllllllllllIlIllllIlllIIllIlllI) {
        return newHandler(this.newEngine(llllllllllllIlIllllIlllIIllIlllI));
    }
    
    static {
        lIIlllllIIlIlllI();
        lIIlllllIIlIllIl();
    }
    
    public final SslHandler newHandler(final ByteBufAllocator llllllllllllIlIllllIlllIIllIIlII, final String llllllllllllIlIllllIlllIIllIIIll, final int llllllllllllIlIllllIlllIIllIIIlI) {
        return newHandler(this.newEngine(llllllllllllIlIllllIlllIIllIIlII, llllllllllllIlIllllIlllIIllIIIll, llllllllllllIlIllllIlllIIllIIIlI));
    }
    
    public static SslContext newClientContext(final File llllllllllllIlIllllIlllIlIlllIlI, final TrustManagerFactory llllllllllllIlIllllIlllIlIlllIll) throws SSLException {
        return newClientContext(null, llllllllllllIlIllllIlllIlIlllIlI, llllllllllllIlIllllIlllIlIlllIll, null, null, 0L, 0L);
    }
    
    public static SslContext newServerContext(final SslProvider llllllllllllIlIllllIlllIlllIlIll, final File llllllllllllIlIllllIlllIlllIllIl, final File llllllllllllIlIllllIlllIlllIllII) throws SSLException {
        return newServerContext(llllllllllllIlIllllIlllIlllIlIll, llllllllllllIlIllllIlllIlllIllIl, llllllllllllIlIllllIlllIlllIllII, null, null, null, 0L, 0L);
    }
    
    private static boolean lIIlllllIIllIIII(final Object llllllllllllIlIllllIlllIIlIIlIlI) {
        return llllllllllllIlIllllIlllIIlIIlIlI == null;
    }
    
    public static SslContext newClientContext() throws SSLException {
        return newClientContext(null, null, null, null, null, 0L, 0L);
    }
    
    public abstract SSLEngine newEngine(final ByteBufAllocator p0);
    
    public static SslContext newClientContext(final SslProvider llllllllllllIlIllllIlllIlIIlIlII, final File llllllllllllIlIllllIlllIlIIlIIll, final TrustManagerFactory llllllllllllIlIllllIlllIlIIlIIlI) throws SSLException {
        return newClientContext(llllllllllllIlIllllIlllIlIIlIlII, llllllllllllIlIllllIlllIlIIlIIll, llllllllllllIlIllllIlllIlIIlIIlI, null, null, 0L, 0L);
    }
    
    public abstract long sessionTimeout();
    
    public static SslContext newServerContext(final SslProvider llllllllllllIlIllllIlllIlllIIlII, final File llllllllllllIlIllllIlllIlllIIIll, final File llllllllllllIlIllllIlllIllIllllI, final String llllllllllllIlIllllIlllIlllIIIIl) throws SSLException {
        return newServerContext(llllllllllllIlIllllIlllIlllIIlII, llllllllllllIlIllllIlllIlllIIIll, llllllllllllIlIllllIlllIllIllllI, llllllllllllIlIllllIlllIlllIIIIl, null, null, 0L, 0L);
    }
    
    private static boolean lIIlllllIIllIIlI(final Object llllllllllllIlIllllIlllIIlIIllll, final Object llllllllllllIlIllllIlllIIlIIlllI) {
        return llllllllllllIlIllllIlllIIlIIllll != llllllllllllIlIllllIlllIIlIIlllI;
    }
    
    public static SslContext newClientContext(final SslProvider llllllllllllIlIllllIlllIlIIllIIl, final TrustManagerFactory llllllllllllIlIllllIlllIlIIllIlI) throws SSLException {
        return newClientContext(llllllllllllIlIllllIlllIlIIllIIl, null, llllllllllllIlIllllIlllIlIIllIlI, null, null, 0L, 0L);
    }
    
    private static void lIIlllllIIlIlllI() {
        (lllIIlIIlIlIII = new int[4])[0] = ((0x4C ^ 0x1D) & ~(0x95 ^ 0xC4));
        SslContext.lllIIlIIlIlIII[1] = " ".length();
        SslContext.lllIIlIIlIlIII[2] = (0x94 ^ 0x9C);
        SslContext.lllIIlIIlIlIII[3] = "  ".length();
    }
    
    public static SslContext newServerContext(final File llllllllllllIlIllllIllllIIIIlIIl, final File llllllllllllIlIllllIllllIIIIlIll, final String llllllllllllIlIllllIllllIIIIlIlI) throws SSLException {
        return newServerContext(null, llllllllllllIlIllllIllllIIIIlIIl, llllllllllllIlIllllIllllIIIIlIll, llllllllllllIlIllllIllllIIIIlIlI, null, null, 0L, 0L);
    }
    
    private static void lIIlllllIIlIllIl() {
        (lllIIlIIlIIllI = new String[SslContext.lllIIlIIlIlIII[1]])[SslContext.lllIIlIIlIlIII[0]] = lIIlllllIIlIllII("Hv1bNpBLZyHWU51zo6ySSmwtmMxHok6WjzvgNcLVZSIp1Z4hOcsNrA==", "XAhbd");
    }
    
    private static boolean lIIlllllIIllIIIl(final Object llllllllllllIlIllllIlllIIlIIllII) {
        return llllllllllllIlIllllIlllIIlIIllII != null;
    }
    
    public static SslProvider defaultServerProvider() {
        if (lIIlllllIIlIllll(OpenSsl.isAvailable() ? 1 : 0)) {
            return SslProvider.OPENSSL;
        }
        return SslProvider.JDK;
    }
    
    public static SslProvider defaultClientProvider() {
        return SslProvider.JDK;
    }
    
    public abstract boolean isClient();
    
    public abstract SSLEngine newEngine(final ByteBufAllocator p0, final String p1, final int p2);
    
    public static SslContext newClientContext(final File llllllllllllIlIllllIlllIllIIIIlI) throws SSLException {
        return newClientContext(null, llllllllllllIlIllllIlllIllIIIIlI, null, null, null, 0L, 0L);
    }
    
    public static SslContext newClientContext(final TrustManagerFactory llllllllllllIlIllllIlllIllIIIIII) throws SSLException {
        return newClientContext(null, null, llllllllllllIlIllllIlllIllIIIIII, null, null, 0L, 0L);
    }
    
    public static SslContext newServerContext(SslProvider llllllllllllIlIllllIlllIllIIllII, final File llllllllllllIlIllllIlllIllIlIIll, final File llllllllllllIlIllllIlllIllIIlIlI, final String llllllllllllIlIllllIlllIllIlIIIl, final Iterable<String> llllllllllllIlIllllIlllIllIIlIII, final Iterable<String> llllllllllllIlIllllIlllIllIIllll, final long llllllllllllIlIllllIlllIllIIIllI, final long llllllllllllIlIllllIlllIllIIIlIl) throws SSLException {
        if (lIIlllllIIllIIII(llllllllllllIlIllllIlllIllIIllII)) {
            Constable constable;
            if (lIIlllllIIlIllll(OpenSsl.isAvailable() ? 1 : 0)) {
                constable = SslProvider.OPENSSL;
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            else {
                constable = SslProvider.JDK;
            }
            llllllllllllIlIllllIlllIllIIllII = constable;
        }
        switch (SslContext$1.$SwitchMap$io$netty$handler$ssl$SslProvider[((Enum)llllllllllllIlIllllIlllIllIIllII).ordinal()]) {
            case 1: {
                return new JdkSslServerContext(llllllllllllIlIllllIlllIllIlIIll, llllllllllllIlIllllIlllIllIIlIlI, llllllllllllIlIllllIlllIllIlIIIl, llllllllllllIlIllllIlllIllIIlIII, llllllllllllIlIllllIlllIllIIllll, llllllllllllIlIllllIlllIllIIIllI, llllllllllllIlIllllIlllIllIIIlIl);
            }
            case 2: {
                return new OpenSslServerContext(llllllllllllIlIllllIlllIllIlIIll, llllllllllllIlIllllIlllIllIIlIlI, llllllllllllIlIllllIlllIllIlIIIl, llllllllllllIlIllllIlllIllIIlIII, llllllllllllIlIllllIlllIllIIllll, llllllllllllIlIllllIlllIllIIIllI, llllllllllllIlIllllIlllIllIIIlIl);
            }
            default: {
                throw new Error(((Enum)llllllllllllIlIllllIlllIllIIllII).toString());
            }
        }
    }
    
    public static SslContext newClientContext(final SslProvider llllllllllllIlIllllIlllIlIlIIlIl) throws SSLException {
        return newClientContext(llllllllllllIlIllllIlllIlIlIIlIl, null, null, null, null, 0L, 0L);
    }
    
    private static SslHandler newHandler(final SSLEngine llllllllllllIlIllllIlllIIlIlllll) {
        return new SslHandler(llllllllllllIlIllllIlllIIlIlllll);
    }
    
    public static SslContext newServerContext(final File llllllllllllIlIllllIllllIIIlIIll, final File llllllllllllIlIllllIllllIIIlIIII) throws SSLException {
        return newServerContext(null, llllllllllllIlIllllIllllIIIlIIll, llllllllllllIlIllllIllllIIIlIIII, null, null, null, 0L, 0L);
    }
    
    public abstract List<String> cipherSuites();
    
    public static SslContext newClientContext(final File llllllllllllIlIllllIlllIlIlIllII, final TrustManagerFactory llllllllllllIlIllllIlllIlIllIIIl, final Iterable<String> llllllllllllIlIllllIlllIlIllIIII, final Iterable<String> llllllllllllIlIllllIlllIlIlIlIIl, final long llllllllllllIlIllllIlllIlIlIlllI, final long llllllllllllIlIllllIlllIlIlIIlll) throws SSLException {
        return newClientContext(null, llllllllllllIlIllllIlllIlIlIllII, llllllllllllIlIllllIlllIlIllIIIl, llllllllllllIlIllllIlllIlIllIIII, llllllllllllIlIllllIlllIlIlIlIIl, llllllllllllIlIllllIlllIlIlIlllI, llllllllllllIlIllllIlllIlIlIIlll);
    }
    
    public static SslContext newClientContext(final SslProvider llllllllllllIlIllllIlllIlIIIIIII, final File llllllllllllIlIllllIlllIIlllllll, final TrustManagerFactory llllllllllllIlIllllIlllIIllllllI, final Iterable<String> llllllllllllIlIllllIlllIIlllllIl, final Iterable<String> llllllllllllIlIllllIlllIlIIIIIll, final long llllllllllllIlIllllIlllIIllllIll, final long llllllllllllIlIllllIlllIIllllIlI) throws SSLException {
        if (lIIlllllIIllIIIl(llllllllllllIlIllllIlllIlIIIIIII) && lIIlllllIIllIIlI(llllllllllllIlIllllIlllIlIIIIIII, SslProvider.JDK)) {
            throw new SSLException(String.valueOf(new StringBuilder().append(SslContext.lllIIlIIlIIllI[SslContext.lllIIlIIlIlIII[0]]).append(llllllllllllIlIllllIlllIlIIIIIII)));
        }
        return new JdkSslClientContext(llllllllllllIlIllllIlllIIlllllll, llllllllllllIlIllllIlllIIllllllI, llllllllllllIlIllllIlllIIlllllIl, llllllllllllIlIllllIlllIlIIIIIll, llllllllllllIlIllllIlllIIllllIll, llllllllllllIlIllllIlllIIllllIlI);
    }
    
    private static boolean lIIlllllIIlIllll(final int llllllllllllIlIllllIlllIIlIIlIII) {
        return llllllllllllIlIllllIlllIIlIIlIII != 0;
    }
    
    public abstract List<String> nextProtocols();
    
    public final boolean isServer() {
        int n;
        if (lIIlllllIIllIIll(this.isClient() ? 1 : 0)) {
            n = SslContext.lllIIlIIlIlIII[1];
            "".length();
            if (null != null) {
                return ((10 + 133 - 61 + 149 ^ 5 + 134 + 11 + 15) & (169 + 173 - 234 + 138 ^ 82 + 107 - 13 + 4 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SslContext.lllIIlIIlIlIII[0];
        }
        return n != 0;
    }
    
    public static SslContext newServerContext(final File llllllllllllIlIllllIlllIlllllIII, final File llllllllllllIlIllllIlllIllllIlll, final String llllllllllllIlIllllIlllIllllIllI, final Iterable<String> llllllllllllIlIllllIlllIllllIlIl, final Iterable<String> llllllllllllIlIllllIlllIllllIlII, final long llllllllllllIlIllllIlllIlllllIlI, final long llllllllllllIlIllllIlllIlllllIIl) throws SSLException {
        return newServerContext(null, llllllllllllIlIllllIlllIlllllIII, llllllllllllIlIllllIlllIllllIlll, llllllllllllIlIllllIlllIllllIllI, llllllllllllIlIllllIlllIllllIlIl, llllllllllllIlIllllIlllIllllIlII, llllllllllllIlIllllIlllIlllllIlI, llllllllllllIlIllllIlllIlllllIIl);
    }
}
