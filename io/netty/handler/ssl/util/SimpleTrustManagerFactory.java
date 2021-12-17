// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import javax.net.ssl.ManagerFactoryParameters;
import java.util.Arrays;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactorySpi;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.TrustManager;
import io.netty.util.concurrent.FastThreadLocal;
import java.security.Provider;
import javax.net.ssl.TrustManagerFactory;

public abstract class SimpleTrustManagerFactory extends TrustManagerFactory
{
    private static final /* synthetic */ Provider PROVIDER;
    private static final /* synthetic */ int[] lIllIlIllIIlII;
    private static final /* synthetic */ FastThreadLocal<SimpleTrustManagerFactorySpi> CURRENT_SPI;
    private static final /* synthetic */ String[] lIllIlIllIIIll;
    
    protected abstract TrustManager[] engineGetTrustManagers();
    
    private static String llllllIlllIlllI(final String llllllllllllIlllllllllIIIlllIIll, final String llllllllllllIlllllllllIIIlllIlII) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllllIIIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllllIIIlllIlll.init(SimpleTrustManagerFactory.lIllIlIllIIlII[2], llllllllllllIlllllllllIIIllllIII);
            return new String(llllllllllllIlllllllllIIIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIIlllIllI) {
            llllllllllllIlllllllllIIIlllIllI.printStackTrace();
            return null;
        }
    }
    
    protected SimpleTrustManagerFactory(final String llllllllllllIlllllllllIIIlllllll) {
        super(SimpleTrustManagerFactory.CURRENT_SPI.get(), SimpleTrustManagerFactory.PROVIDER, llllllllllllIlllllllllIIIlllllll);
        SimpleTrustManagerFactory.CURRENT_SPI.get().init(this);
        SimpleTrustManagerFactory.CURRENT_SPI.remove();
        if (llllllIllllIIll(llllllllllllIlllllllllIIIlllllll)) {
            throw new NullPointerException(SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[1]]);
        }
    }
    
    private static boolean llllllIllllIIll(final Object llllllllllllIlllllllllIIIllIIIIl) {
        return llllllllllllIlllllllllIIIllIIIIl == null;
    }
    
    private static void llllllIllllIIlI() {
        (lIllIlIllIIlII = new int[6])[0] = ((0xF2 ^ 0xA9) & ~(0x9 ^ 0x52));
        SimpleTrustManagerFactory.lIllIlIllIIlII[1] = " ".length();
        SimpleTrustManagerFactory.lIllIlIllIIlII[2] = "  ".length();
        SimpleTrustManagerFactory.lIllIlIllIIlII[3] = "   ".length();
        SimpleTrustManagerFactory.lIllIlIllIIlII[4] = (0x30 ^ 0x34);
        SimpleTrustManagerFactory.lIllIlIllIIlII[5] = (0x29 ^ 0x46 ^ (0x19 ^ 0x7E));
    }
    
    protected abstract void engineInit(final KeyStore p0) throws Exception;
    
    protected SimpleTrustManagerFactory() {
        this(SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[0]]);
    }
    
    static {
        llllllIllllIIlI();
        llllllIllllIIIl();
        PROVIDER = new Provider(SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[2]], 0.0, SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[3]]) {};
        CURRENT_SPI = new FastThreadLocal<SimpleTrustManagerFactorySpi>() {
            @Override
            protected SimpleTrustManagerFactorySpi initialValue() {
                return new SimpleTrustManagerFactorySpi();
            }
        };
    }
    
    private static String llllllIlllIllIl(final String llllllllllllIlllllllllIIIllIlIII, final String llllllllllllIlllllllllIIIllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), SimpleTrustManagerFactory.lIllIlIllIIlII[5]), "DES");
            final Cipher llllllllllllIlllllllllIIIllIlIlI = Cipher.getInstance("DES");
            llllllllllllIlllllllllIIIllIlIlI.init(SimpleTrustManagerFactory.lIllIlIllIIlII[2], llllllllllllIlllllllllIIIllIlIll);
            return new String(llllllllllllIlllllllllIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIIllIlIIl) {
            llllllllllllIlllllllllIIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    protected abstract void engineInit(final ManagerFactoryParameters p0) throws Exception;
    
    private static void llllllIllllIIIl() {
        (lIllIlIllIIIll = new String[SimpleTrustManagerFactory.lIllIlIllIIlII[4]])[SimpleTrustManagerFactory.lIllIlIllIIlII[0]] = llllllIlllIllIl("q+BK8kKzBZo=", "cdvRv");
        SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[1]] = llllllIlllIlllI("TPzd/WTumcI=", "QXpTd");
        SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[2]] = llllllIlllIllIl("HjRq4eyRD24=", "cNRHp");
        SimpleTrustManagerFactory.lIllIlIllIIIll[SimpleTrustManagerFactory.lIllIlIllIIlII[3]] = llllllIlllIllIl("kUWxnEBR5Fo=", "pTasd");
    }
    
    static final class SimpleTrustManagerFactorySpi extends TrustManagerFactorySpi
    {
        private /* synthetic */ SimpleTrustManagerFactory parent;
        
        @Override
        protected void engineInit(final KeyStore lllllllllllllIIIlIllIIIIIlIIllIl) throws KeyStoreException {
            try {
                this.parent.engineInit(lllllllllllllIIIlIllIIIIIlIIllIl);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (KeyStoreException lllllllllllllIIIlIllIIIIIlIlIIlI) {
                throw lllllllllllllIIIlIllIIIIIlIlIIlI;
            }
            catch (Exception lllllllllllllIIIlIllIIIIIlIlIIIl) {
                throw new KeyStoreException(lllllllllllllIIIlIllIIIIIlIlIIIl);
            }
        }
        
        @Override
        protected void engineInit(final ManagerFactoryParameters lllllllllllllIIIlIllIIIIIlIIIlIl) throws InvalidAlgorithmParameterException {
            try {
                this.parent.engineInit(lllllllllllllIIIlIllIIIIIlIIIlIl);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            catch (InvalidAlgorithmParameterException lllllllllllllIIIlIllIIIIIlIIlIII) {
                throw lllllllllllllIIIlIllIIIIIlIIlIII;
            }
            catch (Exception lllllllllllllIIIlIllIIIIIlIIIlll) {
                throw new InvalidAlgorithmParameterException(lllllllllllllIIIlIllIIIIIlIIIlll);
            }
        }
        
        void init(final SimpleTrustManagerFactory lllllllllllllIIIlIllIIIIIlIlIllI) {
            this.parent = lllllllllllllIIIlIllIIIIIlIlIllI;
        }
        
        @Override
        protected TrustManager[] engineGetTrustManagers() {
            return this.parent.engineGetTrustManagers();
        }
    }
}
