// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;

public class DefaultHttpRequest extends DefaultHttpMessage implements HttpRequest
{
    private /* synthetic */ String uri;
    private static final /* synthetic */ int[] llIIllIIIlIlIl;
    private static final /* synthetic */ String[] llIIllIIIlIlII;
    private /* synthetic */ HttpMethod method;
    
    @Override
    public HttpRequest setProtocolVersion(final HttpVersion llllllllllllIlllIIIIlIIIlllllIlI) {
        super.setProtocolVersion(llllllllllllIlllIIIIlIIIlllllIlI);
        "".length();
        return this;
    }
    
    @Override
    public HttpRequest setMethod(final HttpMethod llllllllllllIlllIIIIlIIlIIIIIlII) {
        if (lIIIlllIIllIIlIl(llllllllllllIlllIIIIlIIlIIIIIlII)) {
            throw new NullPointerException(DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[2]]);
        }
        this.method = llllllllllllIlllIIIIlIIlIIIIIlII;
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIIIIlIIIllllIlII = new StringBuilder();
        llllllllllllIlllIIIIlIIIllllIlII.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[4]]);
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(this.getDecoderResult());
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append((char)DefaultHttpRequest.llIIllIIIlIlIl[5]);
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(this.getMethod());
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append((char)DefaultHttpRequest.llIIllIIIlIlIl[6]);
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(this.getUri());
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append((char)DefaultHttpRequest.llIIllIIIlIlIl[6]);
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(this.getProtocolVersion().text());
        "".length();
        llllllllllllIlllIIIIlIIIllllIlII.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(llllllllllllIlllIIIIlIIIllllIlII);
        llllllllllllIlllIIIIlIIIllllIlII.setLength(llllllllllllIlllIIIIlIIIllllIlII.length() - StringUtil.NEWLINE.length());
        return String.valueOf(llllllllllllIlllIIIIlIIIllllIlII);
    }
    
    private static void lIIIlllIIllIIIll() {
        (llIIllIIIlIlII = new String[DefaultHttpRequest.llIIllIIIlIlIl[7]])[DefaultHttpRequest.llIIllIIIlIlIl[1]] = lIIIlllIIllIIIII("7OoP+PBz7EI=", "IXATO");
        DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[0]] = lIIIlllIIllIIIII("YQ4K1r6xP6M=", "USmqU");
        DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[2]] = lIIIlllIIllIIIIl("PwsdGiw2", "RnirC");
        DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[3]] = lIIIlllIIllIIIlI("Wke9UjPRdTw=", "KWInt");
        DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[4]] = lIIIlllIIllIIIII("JSGwpI3Y50vPhcdD9fI50g==", "IrazM");
    }
    
    public DefaultHttpRequest(final HttpVersion llllllllllllIlllIIIIlIIlIIIllIII, final HttpMethod llllllllllllIlllIIIIlIIlIIIlIIlI, final String llllllllllllIlllIIIIlIIlIIIlIllI, final boolean llllllllllllIlllIIIIlIIlIIIlIlIl) {
        super(llllllllllllIlllIIIIlIIlIIIllIII, llllllllllllIlllIIIIlIIlIIIlIlIl);
        if (lIIIlllIIllIIlIl(llllllllllllIlllIIIIlIIlIIIlIIlI)) {
            throw new NullPointerException(DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[1]]);
        }
        if (lIIIlllIIllIIlIl(llllllllllllIlllIIIIlIIlIIIlIllI)) {
            throw new NullPointerException(DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[0]]);
        }
        this.method = llllllllllllIlllIIIIlIIlIIIlIIlI;
        this.uri = llllllllllllIlllIIIIlIIlIIIlIllI;
    }
    
    @Override
    public String getUri() {
        return this.uri;
    }
    
    private static String lIIIlllIIllIIIlI(final String llllllllllllIlllIIIIlIIIlllIIIlI, final String llllllllllllIlllIIIIlIIIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIIIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIlIIIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIlIIIlllIIllI.init(DefaultHttpRequest.llIIllIIIlIlIl[2], llllllllllllIlllIIIIlIIIlllIIlll);
            return new String(llllllllllllIlllIIIIlIIIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIIIlllIIlIl) {
            llllllllllllIlllIIIIlIIIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlllIIllIIlII();
        lIIIlllIIllIIIll();
    }
    
    @Override
    public HttpMethod getMethod() {
        return this.method;
    }
    
    private static void lIIIlllIIllIIlII() {
        (llIIllIIIlIlIl = new int[9])[0] = " ".length();
        DefaultHttpRequest.llIIllIIIlIlIl[1] = ((0x3B ^ 0x5B ^ (0x53 ^ 0xC)) & (0x1A ^ 0x30 ^ (0x66 ^ 0x73) ^ -" ".length()));
        DefaultHttpRequest.llIIllIIIlIlIl[2] = "  ".length();
        DefaultHttpRequest.llIIllIIIlIlIl[3] = "   ".length();
        DefaultHttpRequest.llIIllIIIlIlIl[4] = (0x8F ^ 0x8B);
        DefaultHttpRequest.llIIllIIIlIlIl[5] = (0xDC ^ 0xB5 ^ (0x79 ^ 0x39));
        DefaultHttpRequest.llIIllIIIlIlIl[6] = (0x15 ^ 0x78 ^ (0x6 ^ 0x4B));
        DefaultHttpRequest.llIIllIIIlIlIl[7] = (0xBB ^ 0xC2 ^ (0x6 ^ 0x7A));
        DefaultHttpRequest.llIIllIIIlIlIl[8] = (0xE1 ^ 0xAF ^ (0x6D ^ 0x2B));
    }
    
    private static String lIIIlllIIllIIIIl(String llllllllllllIlllIIIIlIIIllIIllll, final String llllllllllllIlllIIIIlIIIllIlIIll) {
        llllllllllllIlllIIIIlIIIllIIllll = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIIllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIlIIIllIlIIlI = new StringBuilder();
        final char[] llllllllllllIlllIIIIlIIIllIlIIIl = llllllllllllIlllIIIIlIIIllIlIIll.toCharArray();
        int llllllllllllIlllIIIIlIIIllIlIIII = DefaultHttpRequest.llIIllIIIlIlIl[1];
        final long llllllllllllIlllIIIIlIIIllIIlIlI = (Object)llllllllllllIlllIIIIlIIIllIIllll.toCharArray();
        final char llllllllllllIlllIIIIlIIIllIIlIIl = (char)llllllllllllIlllIIIIlIIIllIIlIlI.length;
        boolean llllllllllllIlllIIIIlIIIllIIlIII = DefaultHttpRequest.llIIllIIIlIlIl[1] != 0;
        while (lIIIlllIIllIIllI(llllllllllllIlllIIIIlIIIllIIlIII ? 1 : 0, llllllllllllIlllIIIIlIIIllIIlIIl)) {
            final char llllllllllllIlllIIIIlIIIllIlIlIl = llllllllllllIlllIIIIlIIIllIIlIlI[llllllllllllIlllIIIIlIIIllIIlIII];
            llllllllllllIlllIIIIlIIIllIlIIlI.append((char)(llllllllllllIlllIIIIlIIIllIlIlIl ^ llllllllllllIlllIIIIlIIIllIlIIIl[llllllllllllIlllIIIIlIIIllIlIIII % llllllllllllIlllIIIIlIIIllIlIIIl.length]));
            "".length();
            ++llllllllllllIlllIIIIlIIIllIlIIII;
            ++llllllllllllIlllIIIIlIIIllIIlIII;
            "".length();
            if ((0x6D ^ 0x68) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIlIIIllIlIIlI);
    }
    
    @Override
    public HttpRequest setUri(final String llllllllllllIlllIIIIlIIIlllllllI) {
        if (lIIIlllIIllIIlIl(llllllllllllIlllIIIIlIIIlllllllI)) {
            throw new NullPointerException(DefaultHttpRequest.llIIllIIIlIlII[DefaultHttpRequest.llIIllIIIlIlIl[3]]);
        }
        this.uri = llllllllllllIlllIIIIlIIIlllllllI;
        return this;
    }
    
    private static String lIIIlllIIllIIIII(final String llllllllllllIlllIIIIlIIIlIllllll, final String llllllllllllIlllIIIIlIIIlIllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIIIlIllllII.getBytes(StandardCharsets.UTF_8)), DefaultHttpRequest.llIIllIIIlIlIl[8]), "DES");
            final Cipher llllllllllllIlllIIIIlIIIllIIIIIl = Cipher.getInstance("DES");
            llllllllllllIlllIIIIlIIIllIIIIIl.init(DefaultHttpRequest.llIIllIIIlIlIl[2], llllllllllllIlllIIIIlIIIllIIIIlI);
            return new String(llllllllllllIlllIIIIlIIIllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIIIllIIIIII) {
            llllllllllllIlllIIIIlIIIllIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlllIIllIIllI(final int llllllllllllIlllIIIIlIIIlIllIlll, final int llllllllllllIlllIIIIlIIIlIllIllI) {
        return llllllllllllIlllIIIIlIIIlIllIlll < llllllllllllIlllIIIIlIIIlIllIllI;
    }
    
    private static boolean lIIIlllIIllIIlIl(final Object llllllllllllIlllIIIIlIIIlIllIlII) {
        return llllllllllllIlllIIIIlIIIlIllIlII == null;
    }
    
    public DefaultHttpRequest(final HttpVersion llllllllllllIlllIIIIlIIlIIlIIlIl, final HttpMethod llllllllllllIlllIIIIlIIlIIlIIIII, final String llllllllllllIlllIIIIlIIlIIlIIIll) {
        this(llllllllllllIlllIIIIlIIlIIlIIlIl, llllllllllllIlllIIIIlIIlIIlIIIII, llllllllllllIlllIIIIlIIlIIlIIIll, (boolean)(DefaultHttpRequest.llIIllIIIlIlIl[0] != 0));
    }
}
