// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.Principal;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;

final class JettyNpnSslSession implements SSLSession
{
    private static final /* synthetic */ String[] llIIIIIIlIllII;
    private static final /* synthetic */ int[] llIIIIIIlIllll;
    private volatile /* synthetic */ String applicationProtocol;
    private final /* synthetic */ SSLEngine engine;
    
    @Override
    public int getPacketBufferSize() {
        return this.unwrap().getPacketBufferSize();
    }
    
    @Override
    public String getProtocol() {
        final String llllllllllllIlllIlllllIIIIlllllI = this.unwrap().getProtocol();
        final String llllllllllllIlllIlllllIIIIllllIl = this.applicationProtocol;
        if (!lIIIIlllIIIIIllI(llllllllllllIlllIlllllIIIIllllIl)) {
            final StringBuilder llllllllllllIlllIlllllIIIIllllII = new StringBuilder(JettyNpnSslSession.llIIIIIIlIllll[2]);
            if (lIIIIlllIIIIIlIl(llllllllllllIlllIlllllIIIIlllllI)) {
                llllllllllllIlllIlllllIIIIllllII.append(llllllllllllIlllIlllllIIIIlllllI.replace((char)JettyNpnSslSession.llIIIIIIlIllll[0], (char)JettyNpnSslSession.llIIIIIIlIllll[1]));
                "".length();
                llllllllllllIlllIlllllIIIIllllII.append((char)JettyNpnSslSession.llIIIIIIlIllll[0]);
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIlllllIIIIllllII.append(JettyNpnSslSession.llIIIIIIlIllII[JettyNpnSslSession.llIIIIIIlIllll[3]]);
                "".length();
            }
            llllllllllllIlllIlllllIIIIllllII.append(llllllllllllIlllIlllllIIIIllllIl);
            "".length();
            return String.valueOf(llllllllllllIlllIlllllIIIIllllII);
        }
        if (lIIIIlllIIIIIlIl(llllllllllllIlllIlllllIIIIlllllI)) {
            return llllllllllllIlllIlllllIIIIlllllI.replace((char)JettyNpnSslSession.llIIIIIIlIllll[0], (char)JettyNpnSslSession.llIIIIIIlIllll[1]);
        }
        return null;
    }
    
    @Override
    public void putValue(final String llllllllllllIlllIlllllIIIIIllIll, final Object llllllllllllIlllIlllllIIIIIlllIl) {
        this.unwrap().putValue(llllllllllllIlllIlllllIIIIIllIll, llllllllllllIlllIlllllIIIIIlllIl);
    }
    
    @Override
    public Principal getLocalPrincipal() {
        return this.unwrap().getLocalPrincipal();
    }
    
    @Override
    public Object getValue(final String llllllllllllIlllIlllllIIIIIlIlII) {
        return this.unwrap().getValue(llllllllllllIlllIlllllIIIIIlIlII);
    }
    
    @Override
    public String[] getValueNames() {
        return this.unwrap().getValueNames();
    }
    
    @Override
    public Certificate[] getLocalCertificates() {
        return this.unwrap().getLocalCertificates();
    }
    
    private static boolean lIIIIlllIIIIIllI(final Object llllllllllllIlllIllllIllllIlllII) {
        return llllllllllllIlllIllllIllllIlllII == null;
    }
    
    void setApplicationProtocol(String llllllllllllIlllIlllllIIIlIIIllI) {
        if (lIIIIlllIIIIIlIl(llllllllllllIlllIlllllIIIlIIIllI)) {
            llllllllllllIlllIlllllIIIlIIIllI = llllllllllllIlllIlllllIIIlIIIllI.replace((char)JettyNpnSslSession.llIIIIIIlIllll[0], (char)JettyNpnSslSession.llIIIIIIlIllll[1]);
        }
        this.applicationProtocol = llllllllllllIlllIlllllIIIlIIIllI;
    }
    
    @Override
    public boolean isValid() {
        return this.unwrap().isValid();
    }
    
    @Override
    public String getPeerHost() {
        return this.unwrap().getPeerHost();
    }
    
    private static void lIIIIllIllllIlll() {
        (llIIIIIIlIllII = new String[JettyNpnSslSession.llIIIIIIlIllll[4]])[JettyNpnSslSession.llIIIIIIlIllll[3]] = lIIIIllIllllIllI("+O/YpZjX65A=", "QjiFe");
    }
    
    private static String lIIIIllIllllIllI(final String llllllllllllIlllIllllIlllllIIIll, final String llllllllllllIlllIllllIlllllIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIllllIlllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllIlllllIIlII.getBytes(StandardCharsets.UTF_8)), JettyNpnSslSession.llIIIIIIlIllll[5]), "DES");
            final Cipher llllllllllllIlllIllllIlllllIIlll = Cipher.getInstance("DES");
            llllllllllllIlllIllllIlllllIIlll.init(JettyNpnSslSession.llIIIIIIlIllll[6], llllllllllllIlllIllllIlllllIlIII);
            return new String(llllllllllllIlllIllllIlllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllIlllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllllIlllllIIllI) {
            llllllllllllIlllIllllIlllllIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public long getLastAccessedTime() {
        return this.unwrap().getLastAccessedTime();
    }
    
    @Override
    public int getPeerPort() {
        return this.unwrap().getPeerPort();
    }
    
    @Override
    public void removeValue(final String llllllllllllIlllIlllllIIIIIIlllI) {
        this.unwrap().removeValue(llllllllllllIlllIlllllIIIIIIlllI);
    }
    
    @Override
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        return this.unwrap().getPeerCertificates();
    }
    
    JettyNpnSslSession(final SSLEngine llllllllllllIlllIlllllIIIlIIlIlI) {
        this.engine = llllllllllllIlllIlllllIIIlIIlIlI;
    }
    
    @Override
    public int getApplicationBufferSize() {
        return this.unwrap().getApplicationBufferSize();
    }
    
    @Override
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return this.unwrap().getPeerCertificateChain();
    }
    
    private static void lIIIIlllIIIIIlII() {
        (llIIIIIIlIllll = new int[7])[0] = (0x8B ^ 0xB1);
        JettyNpnSslSession.llIIIIIIlIllll[1] = (0xC9 ^ 0x96);
        JettyNpnSslSession.llIIIIIIlIllll[2] = (0x24 ^ 0x43 ^ (0xFE ^ 0xB9));
        JettyNpnSslSession.llIIIIIIlIllll[3] = ((0x5A ^ 0x1B) & ~(0xDE ^ 0x9F));
        JettyNpnSslSession.llIIIIIIlIllll[4] = " ".length();
        JettyNpnSslSession.llIIIIIIlIllll[5] = (0x3C ^ 0x35 ^ " ".length());
        JettyNpnSslSession.llIIIIIIlIllll[6] = "  ".length();
    }
    
    @Override
    public SSLSessionContext getSessionContext() {
        return this.unwrap().getSessionContext();
    }
    
    @Override
    public long getCreationTime() {
        return this.unwrap().getCreationTime();
    }
    
    static {
        lIIIIlllIIIIIlII();
        lIIIIllIllllIlll();
    }
    
    @Override
    public byte[] getId() {
        return this.unwrap().getId();
    }
    
    @Override
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.unwrap().getPeerPrincipal();
    }
    
    private static boolean lIIIIlllIIIIIlIl(final Object llllllllllllIlllIllllIllllIllllI) {
        return llllllllllllIlllIllllIllllIllllI != null;
    }
    
    @Override
    public String getCipherSuite() {
        return this.unwrap().getCipherSuite();
    }
    
    private SSLSession unwrap() {
        return this.engine.getSession();
    }
    
    @Override
    public void invalidate() {
        this.unwrap().invalidate();
    }
}
