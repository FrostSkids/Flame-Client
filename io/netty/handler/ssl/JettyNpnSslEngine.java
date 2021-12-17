// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.net.ssl.SSLEngineResult;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLException;
import org.eclipse.jetty.npn.NextProtoNego;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLEngine;

final class JettyNpnSslEngine extends SSLEngine
{
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ int[] llIlIllIllIIII;
    private static final /* synthetic */ String[] llIlIllIlIllll;
    private final /* synthetic */ JettyNpnSslSession session;
    private final /* synthetic */ SSLEngine engine;
    private static /* synthetic */ boolean available;
    
    @Override
    public void setSSLParameters(final SSLParameters llllllllllllIllIlIIlIlIlIllllIlI) {
        this.engine.setSSLParameters(llllllllllllIllIlIIlIlIlIllllIlI);
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        return this.engine.getSupportedCipherSuites();
    }
    
    @Override
    public void setEnabledProtocols(final String[] llllllllllllIllIlIIlIlIllIllIIII) {
        this.engine.setEnabledProtocols(llllllllllllIllIlIIlIlIllIllIIII);
    }
    
    @Override
    public void closeInbound() throws SSLException {
        NextProtoNego.remove(this.engine);
        "".length();
        this.engine.closeInbound();
    }
    
    @Override
    public String[] getEnabledCipherSuites() {
        return this.engine.getEnabledCipherSuites();
    }
    
    @Override
    public void setUseClientMode(final boolean llllllllllllIllIlIIlIlIllIlIIIIl) {
        this.engine.setUseClientMode(llllllllllllIllIlIIlIlIllIlIIIIl);
    }
    
    private static boolean lIIlIlIlIllIIlII(final int llllllllllllIllIlIIlIlIlIlIlllll) {
        return llllllllllllIllIlIIlIlIlIlIlllll == 0;
    }
    
    @Override
    public String[] getEnabledProtocols() {
        return this.engine.getEnabledProtocols();
    }
    
    @Override
    public void setWantClientAuth(final boolean llllllllllllIllIlIIlIlIllIIIllll) {
        this.engine.setWantClientAuth(llllllllllllIllIlIIlIlIllIIIllll);
    }
    
    @Override
    public String[] getSupportedProtocols() {
        return this.engine.getSupportedProtocols();
    }
    
    @Override
    public SSLEngineResult wrap(final ByteBuffer llllllllllllIllIlIIlIllIIIIIlIIl, final ByteBuffer llllllllllllIllIlIIlIllIIIIIlIll) throws SSLException {
        return this.engine.wrap(llllllllllllIllIlIIlIllIIIIIlIIl, llllllllllllIllIlIIlIllIIIIIlIll);
    }
    
    @Override
    public boolean getEnableSessionCreation() {
        return this.engine.getEnableSessionCreation();
    }
    
    private static String lIIlIlIlIlIlllll(final String llllllllllllIllIlIIlIlIlIllIlIII, final String llllllllllllIllIlIIlIlIlIllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIlIlIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIlIlIllIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIlIlIllIllII.init(JettyNpnSslEngine.llIlIllIllIIII[2], llllllllllllIllIlIIlIlIlIllIllIl);
            return new String(llllllllllllIllIlIIlIlIlIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIlIlIllIlIll) {
            llllllllllllIllIlIIlIlIlIllIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void beginHandshake() throws SSLException {
        this.engine.beginHandshake();
    }
    
    @Override
    public void closeOutbound() {
        NextProtoNego.remove(this.engine);
        "".length();
        this.engine.closeOutbound();
    }
    
    @Override
    public void setEnabledCipherSuites(final String[] llllllllllllIllIlIIlIlIllIlllIlI) {
        this.engine.setEnabledCipherSuites(llllllllllllIllIlIIlIlIllIlllIlI);
    }
    
    @Override
    public boolean isOutboundDone() {
        return this.engine.isOutboundDone();
    }
    
    @Override
    public SSLSession getHandshakeSession() {
        return this.engine.getHandshakeSession();
    }
    
    @Override
    public JettyNpnSslSession getSession() {
        return this.session;
    }
    
    static boolean isAvailable() {
        updateAvailability();
        return JettyNpnSslEngine.available;
    }
    
    @Override
    public SSLEngineResult unwrap(final ByteBuffer llllllllllllIllIlIIlIlIlllIlIIlI, final ByteBuffer[] llllllllllllIllIlIIlIlIlllIlIllI, final int llllllllllllIllIlIIlIlIlllIlIlIl, final int llllllllllllIllIlIIlIlIlllIlIlII) throws SSLException {
        return this.engine.unwrap(llllllllllllIllIlIIlIlIlllIlIIlI, llllllllllllIllIlIIlIlIlllIlIllI, llllllllllllIllIlIIlIlIlllIlIlIl, llllllllllllIllIlIIlIlIlllIlIlII);
    }
    
    @Override
    public boolean getWantClientAuth() {
        return this.engine.getWantClientAuth();
    }
    
    @Override
    public int getPeerPort() {
        return this.engine.getPeerPort();
    }
    
    @Override
    public boolean isInboundDone() {
        return this.engine.isInboundDone();
    }
    
    @Override
    public SSLEngineResult unwrap(final ByteBuffer llllllllllllIllIlIIlIlIllllIIIlI, final ByteBuffer[] llllllllllllIllIlIIlIlIlllIllllI) throws SSLException {
        return this.engine.unwrap(llllllllllllIllIlIIlIlIllllIIIlI, llllllllllllIllIlIIlIlIlllIllllI);
    }
    
    private static boolean lIIlIlIlIllIIIlI(final int llllllllllllIllIlIIlIlIlIllIIIIl) {
        return llllllllllllIllIlIIlIlIlIllIIIIl != 0;
    }
    
    private static void lIIlIlIlIllIIIIl() {
        (llIlIllIllIIII = new int[3])[0] = ((0x16 ^ 0x34) & ~(0x1 ^ 0x23));
        JettyNpnSslEngine.llIlIllIllIIII[1] = " ".length();
        JettyNpnSslEngine.llIlIllIllIIII[2] = "  ".length();
    }
    
    @Override
    public boolean getUseClientMode() {
        return this.engine.getUseClientMode();
    }
    
    @Override
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return this.engine.getHandshakeStatus();
    }
    
    private static void updateAvailability() {
        if (lIIlIlIlIllIIIlI(JettyNpnSslEngine.available ? 1 : 0)) {
            return;
        }
        try {
            ClassLoader llllllllllllIllIlIIlIllIIIllIlII = ClassLoader.getSystemClassLoader().getParent();
            if (lIIlIlIlIllIIIll(llllllllllllIllIlIIlIllIIIllIlII)) {
                llllllllllllIllIlIIlIllIIIllIlII = ClassLoader.getSystemClassLoader();
            }
            Class.forName(JettyNpnSslEngine.llIlIllIlIllll[JettyNpnSslEngine.llIlIllIllIIII[0]], (boolean)(JettyNpnSslEngine.llIlIllIllIIII[1] != 0), llllllllllllIllIlIIlIllIIIllIlII);
            "".length();
            JettyNpnSslEngine.available = (JettyNpnSslEngine.llIlIllIllIIII[1] != 0);
            "".length();
            if (((0xDA ^ 0x93 ^ (0xDC ^ 0xB9)) & (0x9F ^ 0xC4 ^ (0xEF ^ 0x98) ^ -" ".length())) <= -" ".length()) {
                return;
            }
        }
        catch (Exception ex) {}
    }
    
    @Override
    public SSLEngineResult wrap(final ByteBuffer[] llllllllllllIllIlIIlIllIIIIIIIll, final ByteBuffer llllllllllllIllIlIIlIllIIIIIIIlI) throws SSLException {
        return this.engine.wrap(llllllllllllIllIlIIlIllIIIIIIIll, llllllllllllIllIlIIlIllIIIIIIIlI);
    }
    
    @Override
    public Runnable getDelegatedTask() {
        return this.engine.getDelegatedTask();
    }
    
    @Override
    public void setEnableSessionCreation(final boolean llllllllllllIllIlIIlIlIllIIIIlII) {
        this.engine.setEnableSessionCreation(llllllllllllIllIlIIlIlIllIIIIlII);
    }
    
    @Override
    public void setNeedClientAuth(final boolean llllllllllllIllIlIIlIlIllIIllIII) {
        this.engine.setNeedClientAuth(llllllllllllIllIlIIlIlIllIIllIII);
    }
    
    @Override
    public SSLEngineResult wrap(final ByteBuffer[] llllllllllllIllIlIIlIlIllllllIII, final int llllllllllllIllIlIIlIlIlllllIIlI, final int llllllllllllIllIlIIlIlIlllllIllI, final ByteBuffer llllllllllllIllIlIIlIlIlllllIlIl) throws SSLException {
        return this.engine.wrap(llllllllllllIllIlIIlIlIllllllIII, llllllllllllIllIlIIlIlIlllllIIlI, llllllllllllIllIlIIlIlIlllllIllI, llllllllllllIllIlIIlIlIlllllIlIl);
    }
    
    @Override
    public String getPeerHost() {
        return this.engine.getPeerHost();
    }
    
    private static boolean lIIlIlIlIllIIIll(final Object llllllllllllIllIlIIlIlIlIllIIIll) {
        return llllllllllllIllIlIIlIlIlIllIIIll == null;
    }
    
    static {
        lIIlIlIlIllIIIIl();
        lIIlIlIlIllIIIII();
        int $assertionsDisabled2;
        if (lIIlIlIlIllIIlII(JettyNpnSslEngine.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = JettyNpnSslEngine.llIlIllIllIIII[1];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = JettyNpnSslEngine.llIlIllIllIIII[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    JettyNpnSslEngine(final SSLEngine llllllllllllIllIlIIlIllIIIlIIlII, final List<String> llllllllllllIllIlIIlIllIIIlIIlll, final boolean llllllllllllIllIlIIlIllIIIlIIllI) {
        if (lIIlIlIlIllIIlII(JettyNpnSslEngine.$assertionsDisabled ? 1 : 0) && lIIlIlIlIllIIIlI(llllllllllllIllIlIIlIllIIIlIIlll.isEmpty() ? 1 : 0)) {
            throw new AssertionError();
        }
        this.engine = llllllllllllIllIlIIlIllIIIlIIlII;
        this.session = new JettyNpnSslSession(llllllllllllIllIlIIlIllIIIlIIlII);
        if (lIIlIlIlIllIIIlI(llllllllllllIllIlIIlIllIIIlIIllI ? 1 : 0)) {
            NextProtoNego.put(llllllllllllIllIlIIlIllIIIlIIlII, (NextProtoNego.Provider)new NextProtoNego.ServerProvider() {
                private static final /* synthetic */ int[] llIlIIllIIlllI;
                
                static {
                    lIIlIIlIlllIIlII();
                }
                
                public void protocolSelected(final String llllllllllllIllIlIllllllIlIllIIl) {
                    JettyNpnSslEngine.this.getSession().setApplicationProtocol(llllllllllllIllIlIllllllIlIllIIl);
                }
                
                public List<String> protocols() {
                    return llllllllllllIllIlIIlIllIIIlIIlll;
                }
                
                private static void lIIlIIlIlllIIlII() {
                    (llIlIIllIIlllI = new int[1])[0] = " ".length();
                }
                
                public void unsupported() {
                    JettyNpnSslEngine.this.getSession().setApplicationProtocol(llllllllllllIllIlIIlIllIIIlIIlll.get(llllllllllllIllIlIIlIllIIIlIIlll.size() - JettyNpnSslEngine$1.llIlIIllIIlllI[0]));
                }
            });
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            final String[] llllllllllllIllIlIIlIllIIIlIlIll = llllllllllllIllIlIIlIllIIIlIIlll.toArray(new String[llllllllllllIllIlIIlIllIIIlIIlll.size()]);
            final String llllllllllllIllIlIIlIllIIIlIlIlI = llllllllllllIllIlIIlIllIIIlIlIll[llllllllllllIllIlIIlIllIIIlIlIll.length - JettyNpnSslEngine.llIlIllIllIIII[1]];
            NextProtoNego.put(llllllllllllIllIlIIlIllIIIlIIlII, (NextProtoNego.Provider)new NextProtoNego.ClientProvider() {
                private static final /* synthetic */ int[] lIllIIIIIIIIlI;
                
                public boolean supports() {
                    return JettyNpnSslEngine$2.lIllIIIIIIIIlI[0] != 0;
                }
                
                private static boolean llllIlIlllIIIII(final int lllllllllllllIIIIlIIlIIlllIlIllI, final int lllllllllllllIIIIlIIlIIlllIlIlIl) {
                    return lllllllllllllIIIIlIIlIIlllIlIllI < lllllllllllllIIIIlIIlIIlllIlIlIl;
                }
                
                private static boolean llllIlIlllIIIIl(final int lllllllllllllIIIIlIIlIIlllIlIIll) {
                    return lllllllllllllIIIIlIIlIIlllIlIIll != 0;
                }
                
                private static void llllIlIllIlllll() {
                    (lIllIIIIIIIIlI = new int[2])[0] = " ".length();
                    JettyNpnSslEngine$2.lIllIIIIIIIIlI[1] = ((15 + 25 + 89 + 49 ^ 137 + 17 - 131 + 152) & (14 + 47 + 68 + 33 ^ 158 + 154 - 294 + 173 ^ -" ".length()));
                }
                
                public String selectProtocol(final List<String> lllllllllllllIIIIlIIlIIlllIlllIl) {
                    final String[] lllllllllllllIIIIlIIlIIllllIIIll = llllllllllllIllIlIIlIllIIIlIlIll;
                    final int lllllllllllllIIIIlIIlIIllllIIIlI = lllllllllllllIIIIlIIlIIllllIIIll.length;
                    int lllllllllllllIIIIlIIlIIllllIIIIl = JettyNpnSslEngine$2.lIllIIIIIIIIlI[1];
                    while (llllIlIlllIIIII(lllllllllllllIIIIlIIlIIllllIIIIl, lllllllllllllIIIIlIIlIIllllIIIlI)) {
                        final String lllllllllllllIIIIlIIlIIllllIIlII = lllllllllllllIIIIlIIlIIllllIIIll[lllllllllllllIIIIlIIlIIllllIIIIl];
                        if (llllIlIlllIIIIl(lllllllllllllIIIIlIIlIIlllIlllIl.contains(lllllllllllllIIIIlIIlIIllllIIlII) ? 1 : 0)) {
                            return lllllllllllllIIIIlIIlIIllllIIlII;
                        }
                        ++lllllllllllllIIIIlIIlIIllllIIIIl;
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                    }
                    return llllllllllllIllIlIIlIllIIIlIlIlI;
                }
                
                static {
                    llllIlIllIlllll();
                }
                
                public void unsupported() {
                    JettyNpnSslEngine.this.session.setApplicationProtocol(null);
                }
            });
        }
    }
    
    private static void lIIlIlIlIllIIIII() {
        (llIlIllIlIllll = new String[JettyNpnSslEngine.llIlIllIllIIII[1]])[JettyNpnSslEngine.llIlIllIllIIII[0]] = lIIlIlIlIlIlllll("a/fEc7arWUesLl//HSARTGuUc0vAqiFlvJOpcWw6cQCbWEEYoXbhHw==", "wxozU");
    }
    
    @Override
    public boolean getNeedClientAuth() {
        return this.engine.getNeedClientAuth();
    }
    
    @Override
    public SSLEngineResult unwrap(final ByteBuffer llllllllllllIllIlIIlIlIllllIlIII, final ByteBuffer llllllllllllIllIlIIlIlIllllIlIlI) throws SSLException {
        return this.engine.unwrap(llllllllllllIllIlIIlIlIllllIlIII, llllllllllllIllIlIIlIlIllllIlIlI);
    }
    
    @Override
    public SSLParameters getSSLParameters() {
        return this.engine.getSSLParameters();
    }
}
