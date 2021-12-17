// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import io.netty.util.internal.EmptyArrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import io.netty.util.internal.logging.InternalLogger;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public final class InsecureTrustManagerFactory extends SimpleTrustManagerFactory
{
    private static final /* synthetic */ int[] lIIlllIIlIIIIl;
    private static final /* synthetic */ TrustManager tm;
    private static final /* synthetic */ InternalLogger logger;
    
    private static void llIllIlIllIllIl() {
        (lIIlllIIlIIIIl = new int[2])[0] = " ".length();
        InsecureTrustManagerFactory.lIIlllIIlIIIIl[1] = ((0x3C ^ 0xE) & ~(0x64 ^ 0x56));
    }
    
    @Override
    protected void engineInit(final ManagerFactoryParameters lllllllllllllIIlIlIIIlIIlIIIIIlI) throws Exception {
    }
    
    private InsecureTrustManagerFactory() {
    }
    
    @Override
    protected TrustManager[] engineGetTrustManagers() {
        final TrustManager[] array = new TrustManager[InsecureTrustManagerFactory.lIIlllIIlIIIIl[0]];
        array[InsecureTrustManagerFactory.lIIlllIIlIIIIl[1]] = InsecureTrustManagerFactory.tm;
        return array;
    }
    
    @Override
    protected void engineInit(final KeyStore lllllllllllllIIlIlIIIlIIlIIIIlII) throws Exception {
    }
    
    static {
        llIllIlIllIllIl();
        logger = InternalLoggerFactory.getInstance(InsecureTrustManagerFactory.class);
        INSTANCE = new InsecureTrustManagerFactory();
        tm = new X509TrustManager() {
            private static final /* synthetic */ String[] lIllllllIIllll;
            private static final /* synthetic */ int[] lIlllllllIIIII;
            
            static {
                lIIIIllIIIIIlIII();
                lIIIIlIlllIIlIlI();
            }
            
            @Override
            public void checkServerTrusted(final X509Certificate[] llllllllllllIllllIIlIIIIIllIllII, final String llllllllllllIllllIIlIIIIIllIllIl) {
                InsecureTrustManagerFactory.logger.debug(String.valueOf(new StringBuilder().append(InsecureTrustManagerFactory$1.lIllllllIIllll[InsecureTrustManagerFactory$1.lIlllllllIIIII[1]]).append(llllllllllllIllllIIlIIIIIllIllII[InsecureTrustManagerFactory$1.lIlllllllIIIII[0]].getSubjectDN())));
            }
            
            @Override
            public void checkClientTrusted(final X509Certificate[] llllllllllllIllllIIlIIIIIlllIIIl, final String llllllllllllIllllIIlIIIIIlllIIlI) {
                InsecureTrustManagerFactory.logger.debug(String.valueOf(new StringBuilder().append(InsecureTrustManagerFactory$1.lIllllllIIllll[InsecureTrustManagerFactory$1.lIlllllllIIIII[0]]).append(llllllllllllIllllIIlIIIIIlllIIIl[InsecureTrustManagerFactory$1.lIlllllllIIIII[0]].getSubjectDN())));
            }
            
            private static boolean lIIIIllIIIIIlIIl(final int llllllllllllIllllIIlIIIIIlIIIIll, final int llllllllllllIllllIIlIIIIIlIIIIlI) {
                return llllllllllllIllllIIlIIIIIlIIIIll < llllllllllllIllllIIlIIIIIlIIIIlI;
            }
            
            private static void lIIIIllIIIIIlIII() {
                (lIlllllllIIIII = new int[3])[0] = ((13 + 108 - 33 + 78 ^ 159 + 145 - 227 + 109) & (0x6A ^ 0x1E ^ (0xF8 ^ 0x90) ^ -" ".length()));
                InsecureTrustManagerFactory$1.lIlllllllIIIII[1] = " ".length();
                InsecureTrustManagerFactory$1.lIlllllllIIIII[2] = "  ".length();
            }
            
            private static String lIIIIlIlllIIlIIl(String llllllllllllIllllIIlIIIIIllIIIII, final String llllllllllllIllllIIlIIIIIlIlllll) {
                llllllllllllIllllIIlIIIIIllIIIII = new String(Base64.getDecoder().decode(llllllllllllIllllIIlIIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIIlIIIIIlIllllI = new StringBuilder();
                final char[] llllllllllllIllllIIlIIIIIlIlllIl = llllllllllllIllllIIlIIIIIlIlllll.toCharArray();
                int llllllllllllIllllIIlIIIIIlIlllII = InsecureTrustManagerFactory$1.lIlllllllIIIII[0];
                final short llllllllllllIllllIIlIIIIIlIlIllI = (Object)llllllllllllIllllIIlIIIIIllIIIII.toCharArray();
                final short llllllllllllIllllIIlIIIIIlIlIlIl = (short)llllllllllllIllllIIlIIIIIlIlIllI.length;
                Exception llllllllllllIllllIIlIIIIIlIlIlII = (Exception)InsecureTrustManagerFactory$1.lIlllllllIIIII[0];
                while (lIIIIllIIIIIlIIl((int)llllllllllllIllllIIlIIIIIlIlIlII, llllllllllllIllllIIlIIIIIlIlIlIl)) {
                    final char llllllllllllIllllIIlIIIIIllIIIIl = llllllllllllIllllIIlIIIIIlIlIllI[llllllllllllIllllIIlIIIIIlIlIlII];
                    llllllllllllIllllIIlIIIIIlIllllI.append((char)(llllllllllllIllllIIlIIIIIllIIIIl ^ llllllllllllIllllIIlIIIIIlIlllIl[llllllllllllIllllIIlIIIIIlIlllII % llllllllllllIllllIIlIIIIIlIlllIl.length]));
                    "".length();
                    ++llllllllllllIllllIIlIIIIIlIlllII;
                    ++llllllllllllIllllIIlIIIIIlIlIlII;
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIIlIIIIIlIllllI);
            }
            
            private static String lIIIIlIlllIIlIII(final String llllllllllllIllllIIlIIIIIlIIlIIl, final String llllllllllllIllllIIlIIIIIlIIlIlI) {
                try {
                    final SecretKeySpec llllllllllllIllllIIlIIIIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllIIlIIIIIlIIllIl = Cipher.getInstance("Blowfish");
                    llllllllllllIllllIIlIIIIIlIIllIl.init(InsecureTrustManagerFactory$1.lIlllllllIIIII[2], llllllllllllIllllIIlIIIIIlIIlllI);
                    return new String(llllllllllllIllllIIlIIIIIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIIlIIIIIlIIllII) {
                    llllllllllllIllllIIlIIIIIlIIllII.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return EmptyArrays.EMPTY_X509_CERTIFICATES;
            }
            
            private static void lIIIIlIlllIIlIlI() {
                (lIllllllIIllll = new String[InsecureTrustManagerFactory$1.lIlllllllIIIII[2]])[InsecureTrustManagerFactory$1.lIlllllllIIIII[0]] = lIIIIlIlllIIlIII("KqktYKbh5XHeDTsYBycP2/MELR4ESJ7xpvfwGofIJbSqk7tZcEfaFw==", "XVtNO");
                InsecureTrustManagerFactory$1.lIllllllIIllll[InsecureTrustManagerFactory$1.lIlllllllIIIII[1]] = lIIIIlIlllIIlIIl("NjImMQIDOCszUhZxNjEAATQ3dBESIzE9FB4yJCAXTXE=", "wQETr");
            }
        };
    }
}
