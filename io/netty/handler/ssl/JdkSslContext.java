// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import javax.net.ssl.SSLSessionContext;
import java.util.Arrays;
import java.util.Collections;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.buffer.ByteBufAllocator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.SSLEngine;
import io.netty.util.internal.logging.InternalLogger;
import java.util.List;

public abstract class JdkSslContext extends SslContext
{
    private final /* synthetic */ List<String> unmodifiableCipherSuites;
    private static final /* synthetic */ String[] lIIllIIlllIIlI;
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ String[] cipherSuites;
    static final /* synthetic */ String[] PROTOCOLS;
    private static final /* synthetic */ int[] lIIllIIlllIIll;
    static final /* synthetic */ List<String> DEFAULT_CIPHERS;
    
    @Override
    public final long sessionCacheSize() {
        return this.sessionContext().getSessionCacheSize();
    }
    
    private static boolean llIlIlllllIlIII(final int lllllllllllllIIlIlIlllIlIllIIIII) {
        return lllllllllllllIIlIlIlllIlIllIIIII != 0;
    }
    
    @Override
    public final long sessionTimeout() {
        return this.sessionContext().getSessionTimeout();
    }
    
    private SSLEngine wrapEngine(final SSLEngine lllllllllllllIIlIlIlllIllIlllIll) {
        if (llIlIlllllIlIII(this.nextProtocols().isEmpty() ? 1 : 0)) {
            return lllllllllllllIIlIlIlllIllIlllIll;
        }
        return new JettyNpnSslEngine(lllllllllllllIIlIlIlllIllIlllIll, this.nextProtocols(), this.isServer());
    }
    
    private static String llIlIlllllIIlII(final String lllllllllllllIIlIlIlllIlIllIlIll, final String lllllllllllllIIlIlIlllIlIllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlllIlIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIlIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIlllIlIllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIlllIlIllIllll.init(JdkSslContext.lIIllIIlllIIll[2], lllllllllllllIIlIlIlllIlIlllIIII);
            return new String(lllllllllllllIIlIlIlllIlIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlllIlIllIlllI) {
            lllllllllllllIIlIlIlllIlIllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlllllIIlIl() {
        (lIIllIIlllIIlI = new String[JdkSslContext.lIIllIIlllIIll[19]])[JdkSslContext.lIIllIIlllIIll[0]] = llIlIlllllIIIlI("HT81", "IsfaB");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[1]] = llIlIlllllIIIll("diFi12NBjIY=", "YmphJ");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[2]] = llIlIlllllIIlII("19TlCuDmkSm+JZL87RktIx+HG7yuzjknx46PgqiJDuWGmnmetArwU8SR5uF/JRbD", "ajdGx");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[4]] = llIlIlllllIIlII("d43bwBv5ZMI=", "FvDLM");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[3]] = llIlIlllllIIIll("vG+8DmmJ4RQ=", "aSaNP");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[5]] = llIlIlllllIIIll("A3avn1XR6Xo=", "KOvIn");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[6]] = llIlIlllllIIIlI("AxELBmE=", "PBGpR");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[8]] = llIlIlllllIIlII("g3oUqrPeyep3YARj7whe++1HcAOMnb0zBDx9vnixVXJp4MJ3rGVmKA==", "OwDsz");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[9]] = llIlIlllllIIIll("uM3vg3d3gJMGP9zfiaULGok9Td9EOaWwFS7LwhzNzB4=", "cLAUe");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[10]] = llIlIlllllIIlII("4bwp+XhD5aigdVhoE2l5oYOl8d5t1c+/1MgedxudsG5pMKSnQMRQkg==", "GkQsq");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[7]] = llIlIlllllIIlII("6THb6vey7bHU4TyjIjCjQiPBVPMxy1w4g5XZ7xVMEC/IFLSjkBn+Cg==", "vQmpG");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[11]] = llIlIlllllIIIlI("HAYZDB4bCxUEBRwCFRIJGxV7YXQXDQkeExsCC2F5fg==", "HJJSL");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[12]] = llIlIlllllIIlII("c/s3FWnbwYLU9Hl5qyBKlxOk2lK4Rgu7OpVIQJbiwHY=", "QhNGO");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[13]] = llIlIlllllIIlII("qrzH25vXvLjXUI6VTION+XSnRm8bWaZYOEQElnOaa3Y=", "HETbG");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[14]] = llIlIlllllIIIlI("BD01ChcDMDkCDAQ5ORQAAy5XZ30PMiQWGgM5Jw==", "PqfUE");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[15]] = llIlIlllllIIIlI("DigmGDYJJSoQLQ4sKgYhCTtHclIFJzcEOwksNA==", "ZduGd");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[16]] = llIlIlllllIIIll("ES4BvkvuuCazLSetcFIGgye4c9N+Mc1FFlTtQGUM7jI=", "htiwY");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[17]] = llIlIlllllIIIll("ejS5oSXrZCC2ZY7Ym5MiQ36VZIRkacdV234HUXl+sEA=", "WNnyR");
        JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[18]] = llIlIlllllIIIlI("IQYxBTkJF3cHJRULMhZsFhY+ECkWQ38uCC5KbUQ3GA==", "ecWdL");
    }
    
    private static String[] toCipherSuiteArray(final Iterable<String> lllllllllllllIIlIlIlllIllIllIIIl) {
        if (llIlIlllllIlIIl(lllllllllllllIIlIlIlllIllIllIIIl)) {
            return JdkSslContext.DEFAULT_CIPHERS.toArray(new String[JdkSslContext.DEFAULT_CIPHERS.size()]);
        }
        final List<String> lllllllllllllIIlIlIlllIllIllIIlI = new ArrayList<String>();
        final Iterator lllllllllllllIIlIlIlllIllIllIIll = lllllllllllllIIlIlIlllIllIllIIIl.iterator();
        while (llIlIlllllIlIII(lllllllllllllIIlIlIlllIllIllIIll.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIlIlllIllIllIlII = lllllllllllllIIlIlIlllIllIllIIll.next();
            if (llIlIlllllIlIIl(lllllllllllllIIlIlIlllIllIllIlII)) {
                "".length();
                if ((68 + 41 - 99 + 131 ^ 112 + 83 - 158 + 100) < 0) {
                    return null;
                }
                break;
            }
            else {
                lllllllllllllIIlIlIlllIllIllIIlI.add(lllllllllllllIIlIlIlllIllIllIlII);
                "".length();
                "".length();
                if (-" ".length() < -" ".length()) {
                    return null;
                }
                continue;
            }
        }
        return lllllllllllllIIlIlIlllIllIllIIlI.toArray(new String[lllllllllllllIIlIlIlllIllIllIIlI.size()]);
    }
    
    private static String llIlIlllllIIIlI(String lllllllllllllIIlIlIlllIllIIIlIlI, final String lllllllllllllIIlIlIlllIllIIIlllI) {
        lllllllllllllIIlIlIlllIllIIIlIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlllIllIIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlllIllIIIllIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIlllIllIIIllII = lllllllllllllIIlIlIlllIllIIIlllI.toCharArray();
        int lllllllllllllIIlIlIlllIllIIIlIll = JdkSslContext.lIIllIIlllIIll[0];
        final float lllllllllllllIIlIlIlllIllIIIIlIl = (Object)((String)lllllllllllllIIlIlIlllIllIIIlIlI).toCharArray();
        final boolean lllllllllllllIIlIlIlllIllIIIIlII = lllllllllllllIIlIlIlllIllIIIIlIl.length != 0;
        boolean lllllllllllllIIlIlIlllIllIIIIIll = JdkSslContext.lIIllIIlllIIll[0] != 0;
        while (llIlIlllllIIlll(lllllllllllllIIlIlIlllIllIIIIIll ? 1 : 0, lllllllllllllIIlIlIlllIllIIIIlII ? 1 : 0)) {
            final char lllllllllllllIIlIlIlllIllIIlIIII = lllllllllllllIIlIlIlllIllIIIIlIl[lllllllllllllIIlIlIlllIllIIIIIll];
            lllllllllllllIIlIlIlllIllIIIllIl.append((char)(lllllllllllllIIlIlIlllIllIIlIIII ^ lllllllllllllIIlIlIlllIllIIIllII[lllllllllllllIIlIlIlllIllIIIlIll % lllllllllllllIIlIlIlllIllIIIllII.length]));
            "".length();
            ++lllllllllllllIIlIlIlllIllIIIlIll;
            ++lllllllllllllIIlIlIlllIllIIIIIll;
            "".length();
            if (" ".length() == ((0xE4 ^ 0x85) & ~(0x43 ^ 0x22))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlllIllIIIllIl);
    }
    
    @Override
    public final List<String> cipherSuites() {
        return this.unmodifiableCipherSuites;
    }
    
    @Override
    public final SSLEngine newEngine(final ByteBufAllocator lllllllllllllIIlIlIlllIlllIIllll) {
        final SSLEngine lllllllllllllIIlIlIlllIlllIIlllI = this.context().createSSLEngine();
        lllllllllllllIIlIlIlllIlllIIlllI.setEnabledCipherSuites(this.cipherSuites);
        lllllllllllllIIlIlIlllIlllIIlllI.setEnabledProtocols(JdkSslContext.PROTOCOLS);
        lllllllllllllIIlIlIlllIlllIIlllI.setUseClientMode(this.isClient());
        return this.wrapEngine(lllllllllllllIIlIlIlllIlllIIlllI);
    }
    
    static {
        llIlIlllllIIllI();
        llIlIlllllIIlIl();
        PROTOCOL = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[0]];
        logger = InternalLoggerFactory.getInstance(JdkSslContext.class);
        SSLContext lllllllllllllIIlIlIlllIllIlIIlIl;
        try {
            lllllllllllllIIlIlIlllIllIlIIlIl = SSLContext.getInstance(JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[1]]);
            lllllllllllllIIlIlIlllIllIlIIlIl.init(null, null, null);
            "".length();
            if (-" ".length() >= (0x6C ^ 0x3C ^ (0x69 ^ 0x3D))) {
                return;
            }
        }
        catch (Exception lllllllllllllIIlIlIlllIllIlIIllI) {
            throw new Error(JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[2]], lllllllllllllIIlIlIlllIllIlIIllI);
        }
        final SSLEngine lllllllllllllIIlIlIlllIllIlIIlII = lllllllllllllIIlIlIlllIllIlIIlIl.createSSLEngine();
        final String[] lllllllllllllIIlIlIlllIllIlIIIll = lllllllllllllIIlIlIlllIllIlIIlII.getSupportedProtocols();
        final List<String> lllllllllllllIIlIlIlllIllIlIIIlI = new ArrayList<String>();
        final String[] lllllllllllllIIlIlIlllIllllIllll = lllllllllllllIIlIlIlllIllIlIIIll;
        final List<String> lllllllllllllIIlIlIlllIlllllIIIl = lllllllllllllIIlIlIlllIllIlIIIlI;
        final String[] lllllllllllllIIlIlIlllIlllllIIII = new String[JdkSslContext.lIIllIIlllIIll[3]];
        lllllllllllllIIlIlIlllIlllllIIII[JdkSslContext.lIIllIIlllIIll[0]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[4]];
        lllllllllllllIIlIlIlllIlllllIIII[JdkSslContext.lIIllIIlllIIll[1]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[3]];
        lllllllllllllIIlIlIlllIlllllIIII[JdkSslContext.lIIllIIlllIIll[2]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[5]];
        lllllllllllllIIlIlIlllIlllllIIII[JdkSslContext.lIIllIIlllIIll[4]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[6]];
        addIfSupported(lllllllllllllIIlIlIlllIllllIllll, lllllllllllllIIlIlIlllIlllllIIIl, lllllllllllllIIlIlIlllIlllllIIII);
        if (llIlIlllllIlIlI(lllllllllllllIIlIlIlllIllIlIIIlI.isEmpty() ? 1 : 0)) {
            PROTOCOLS = lllllllllllllIIlIlIlllIllIlIIIlI.toArray(new String[lllllllllllllIIlIlIlllIllIlIIIlI.size()]);
            "".length();
            if ((0xC3 ^ 0xAD ^ (0x7D ^ 0x16)) <= 0) {
                return;
            }
        }
        else {
            PROTOCOLS = lllllllllllllIIlIlIlllIllIlIIlII.getEnabledProtocols();
        }
        final String[] lllllllllllllIIlIlIlllIllIlIIIIl = lllllllllllllIIlIlIlllIllIlIIlII.getSupportedCipherSuites();
        final List<String> lllllllllllllIIlIlIlllIllIlIIIII = new ArrayList<String>();
        final String[] lllllllllllllIIlIlIlllIllllIllll2 = lllllllllllllIIlIlIlllIllIlIIIIl;
        final List<String> lllllllllllllIIlIlIlllIlllllIIIl2 = lllllllllllllIIlIlIlllIllIlIIIII;
        final String[] lllllllllllllIIlIlIlllIlllllIIII2 = new String[JdkSslContext.lIIllIIlllIIll[7]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[0]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[8]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[1]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[9]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[2]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[10]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[4]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[7]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[3]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[11]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[5]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[12]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[6]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[13]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[8]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[14]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[9]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[15]];
        lllllllllllllIIlIlIlllIlllllIIII2[JdkSslContext.lIIllIIlllIIll[10]] = JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[16]];
        addIfSupported(lllllllllllllIIlIlIlllIllllIllll2, lllllllllllllIIlIlIlllIlllllIIIl2, lllllllllllllIIlIlIlllIlllllIIII2);
        if (llIlIlllllIlIlI(lllllllllllllIIlIlIlllIllIlIIIII.isEmpty() ? 1 : 0)) {
            DEFAULT_CIPHERS = Collections.unmodifiableList((List<? extends String>)lllllllllllllIIlIlIlllIllIlIIIII);
            "".length();
            if (((101 + 55 - 40 + 24 ^ 93 + 10 - 45 + 130) & (50 + 58 - 71 + 96 ^ 116 + 51 - 46 + 60 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            DEFAULT_CIPHERS = Collections.unmodifiableList((List<? extends String>)Arrays.asList((T[])lllllllllllllIIlIlIlllIllIlIIlII.getEnabledCipherSuites()));
        }
        if (llIlIlllllIlIII(JdkSslContext.logger.isDebugEnabled() ? 1 : 0)) {
            JdkSslContext.logger.debug(JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[17]], Arrays.asList(JdkSslContext.PROTOCOLS));
            JdkSslContext.logger.debug(JdkSslContext.lIIllIIlllIIlI[JdkSslContext.lIIllIIlllIIll[18]], JdkSslContext.DEFAULT_CIPHERS);
        }
    }
    
    @Override
    public final SSLEngine newEngine(final ByteBufAllocator lllllllllllllIIlIlIlllIlllIIIllI, final String lllllllllllllIIlIlIlllIlllIIIIIl, final int lllllllllllllIIlIlIlllIlllIIIlII) {
        final SSLEngine lllllllllllllIIlIlIlllIlllIIIIll = this.context().createSSLEngine(lllllllllllllIIlIlIlllIlllIIIIIl, lllllllllllllIIlIlIlllIlllIIIlII);
        lllllllllllllIIlIlIlllIlllIIIIll.setEnabledCipherSuites(this.cipherSuites);
        lllllllllllllIIlIlIlllIlllIIIIll.setEnabledProtocols(JdkSslContext.PROTOCOLS);
        lllllllllllllIIlIlIlllIlllIIIIll.setUseClientMode(this.isClient());
        return this.wrapEngine(lllllllllllllIIlIlIlllIlllIIIIll);
    }
    
    private static boolean llIlIlllllIlIlI(final int lllllllllllllIIlIlIlllIlIlIllllI) {
        return lllllllllllllIIlIlIlllIlIlIllllI == 0;
    }
    
    public abstract SSLContext context();
    
    private static void addIfSupported(final String[] lllllllllllllIIlIlIlllIllllIllll, final List<String> lllllllllllllIIlIlIlllIlllllIIIl, final String... lllllllllllllIIlIlIlllIlllllIIII) {
        final String[] lllllllllllllIIlIlIlllIlllllIlIl = lllllllllllllIIlIlIlllIlllllIIII;
        final int lllllllllllllIIlIlIlllIlllllIlII = lllllllllllllIIlIlIlllIlllllIlIl.length;
        int lllllllllllllIIlIlIlllIlllllIIll = JdkSslContext.lIIllIIlllIIll[0];
        while (llIlIlllllIIlll(lllllllllllllIIlIlIlllIlllllIIll, lllllllllllllIIlIlIlllIlllllIlII)) {
            final String lllllllllllllIIlIlIlllIlllllIllI = lllllllllllllIIlIlIlllIlllllIlIl[lllllllllllllIIlIlIlllIlllllIIll];
            final String[] lllllllllllllIIlIlIlllIllllllIIl = lllllllllllllIIlIlIlllIllllIllll;
            final int lllllllllllllIIlIlIlllIllllllIII = lllllllllllllIIlIlIlllIllllllIIl.length;
            int lllllllllllllIIlIlIlllIlllllIlll = JdkSslContext.lIIllIIlllIIll[0];
            while (llIlIlllllIIlll(lllllllllllllIIlIlIlllIlllllIlll, lllllllllllllIIlIlIlllIllllllIII)) {
                final String lllllllllllllIIlIlIlllIllllllIlI = lllllllllllllIIlIlIlllIllllllIIl[lllllllllllllIIlIlIlllIlllllIlll];
                if (llIlIlllllIlIII(lllllllllllllIIlIlIlllIlllllIllI.equals(lllllllllllllIIlIlIlllIllllllIlI) ? 1 : 0)) {
                    lllllllllllllIIlIlIlllIlllllIIIl.add(lllllllllllllIIlIlIlllIllllllIlI);
                    "".length();
                    "".length();
                    if (((0x63 ^ 0x3F) & ~(0x2A ^ 0x76)) >= " ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIlIlIlllIlllllIlll;
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                    continue;
                }
            }
            ++lllllllllllllIIlIlIlllIlllllIIll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static boolean llIlIlllllIIlll(final int lllllllllllllIIlIlIlllIlIllIIlIl, final int lllllllllllllIIlIlIlllIlIllIIlII) {
        return lllllllllllllIIlIlIlllIlIllIIlIl < lllllllllllllIIlIlIlllIlIllIIlII;
    }
    
    private static String llIlIlllllIIIll(final String lllllllllllllIIlIlIlllIlIllllIlI, final String lllllllllllllIIlIlIlllIlIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlllIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), JdkSslContext.lIIllIIlllIIll[9]), "DES");
            final Cipher lllllllllllllIIlIlIlllIlIlllllII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlllIlIlllllII.init(JdkSslContext.lIIllIIlllIIll[2], lllllllllllllIIlIlIlllIlIlllllIl);
            return new String(lllllllllllllIIlIlIlllIlIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlllIlIllllIll) {
            lllllllllllllIIlIlIlllIlIllllIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlllllIIllI() {
        (lIIllIIlllIIll = new int[20])[0] = ((0x4F ^ 0xC ^ (0x23 ^ 0x56)) & (111 + 15 - 125 + 181 ^ 38 + 104 - 115 + 101 ^ -" ".length()));
        JdkSslContext.lIIllIIlllIIll[1] = " ".length();
        JdkSslContext.lIIllIIlllIIll[2] = "  ".length();
        JdkSslContext.lIIllIIlllIIll[3] = (0x90 ^ 0x94);
        JdkSslContext.lIIllIIlllIIll[4] = "   ".length();
        JdkSslContext.lIIllIIlllIIll[5] = (0xD1 ^ 0xBC ^ (0x49 ^ 0x21));
        JdkSslContext.lIIllIIlllIIll[6] = (0x3C ^ 0x3A);
        JdkSslContext.lIIllIIlllIIll[7] = (0x17 ^ 0x1D);
        JdkSslContext.lIIllIIlllIIll[8] = (36 + 26 - 33 + 156 ^ 146 + 143 - 101 + 2);
        JdkSslContext.lIIllIIlllIIll[9] = (86 + 16 - 0 + 63 ^ 129 + 7 + 26 + 11);
        JdkSslContext.lIIllIIlllIIll[10] = (0xF ^ 0x59 ^ (0x42 ^ 0x1D));
        JdkSslContext.lIIllIIlllIIll[11] = (0xA5 ^ 0xAE);
        JdkSslContext.lIIllIIlllIIll[12] = (0x7F ^ 0x73);
        JdkSslContext.lIIllIIlllIIll[13] = (95 + 123 - 198 + 186 ^ 61 + 28 - 66 + 172);
        JdkSslContext.lIIllIIlllIIll[14] = (118 + 30 - 27 + 64 ^ 54 + 39 + 43 + 47);
        JdkSslContext.lIIllIIlllIIll[15] = (0x3 ^ 0xC);
        JdkSslContext.lIIllIIlllIIll[16] = (0x4D ^ 0x5D);
        JdkSslContext.lIIllIIlllIIll[17] = (0x99 ^ 0x88);
        JdkSslContext.lIIllIIlllIIll[18] = (0x11 ^ 0x58 ^ (0xE5 ^ 0xBE));
        JdkSslContext.lIIllIIlllIIll[19] = (0x3E ^ 0x73 ^ (0xEA ^ 0xB4));
    }
    
    public final SSLSessionContext sessionContext() {
        if (llIlIlllllIlIII(this.isServer() ? 1 : 0)) {
            return this.context().getServerSessionContext();
        }
        return this.context().getClientSessionContext();
    }
    
    private static boolean llIlIlllllIlIIl(final Object lllllllllllllIIlIlIlllIlIllIIIlI) {
        return lllllllllllllIIlIlIlllIlIllIIIlI == null;
    }
    
    JdkSslContext(final Iterable<String> lllllllllllllIIlIlIlllIlllIlllll) {
        this.cipherSuites = toCipherSuiteArray(lllllllllllllIIlIlIlllIlllIlllll);
        this.unmodifiableCipherSuites = Collections.unmodifiableList((List<? extends String>)Arrays.asList((T[])this.cipherSuites));
    }
}
