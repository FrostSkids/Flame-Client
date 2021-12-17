// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class DefaultHttpResponse extends DefaultHttpMessage implements HttpResponse
{
    private static final /* synthetic */ int[] lIllIIIlIllIII;
    private /* synthetic */ HttpResponseStatus status;
    private static final /* synthetic */ String[] lIllIIIlIlIlll;
    
    static {
        lllllIIIIIIllll();
        lllllIIIIIIllIl();
    }
    
    @Override
    public HttpResponseStatus getStatus() {
        return this.status;
    }
    
    private static void lllllIIIIIIllIl() {
        (lIllIIIlIlIlll = new String[DefaultHttpResponse.lIllIIIlIllIII[5]])[DefaultHttpResponse.lIllIIIlIllIII[1]] = lllllIIIIIIlIlI("vQJUF9araok=", "jpjTi");
        DefaultHttpResponse.lIllIIIlIlIlll[DefaultHttpResponse.lIllIIIlIllIII[0]] = lllllIIIIIIlIlI("CIDJu/4GESg=", "KhPsd");
        DefaultHttpResponse.lIllIIIlIlIlll[DefaultHttpResponse.lIllIIIlIllIII[2]] = lllllIIIIIIlIll("bFh4o73N+FT6M6UIKX0NlA==", "vZWLp");
    }
    
    public DefaultHttpResponse(final HttpVersion lllllllllllllIIIIIllIIIllllllIlI, final HttpResponseStatus lllllllllllllIIIIIllIIIllllllIIl) {
        this(lllllllllllllIIIIIllIIIllllllIlI, lllllllllllllIIIIIllIIIllllllIIl, (boolean)(DefaultHttpResponse.lIllIIIlIllIII[0] != 0));
    }
    
    @Override
    public HttpResponse setProtocolVersion(final HttpVersion lllllllllllllIIIIIllIIIlllIlllIl) {
        super.setProtocolVersion(lllllllllllllIIIIIllIIIlllIlllIl);
        "".length();
        return this;
    }
    
    private static void lllllIIIIIIllll() {
        (lIllIIIlIllIII = new int[7])[0] = " ".length();
        DefaultHttpResponse.lIllIIIlIllIII[1] = ((0xCD ^ 0x80) & ~(0xC ^ 0x41));
        DefaultHttpResponse.lIllIIIlIllIII[2] = "  ".length();
        DefaultHttpResponse.lIllIIIlIllIII[3] = (0x91 ^ 0xB8);
        DefaultHttpResponse.lIllIIIlIllIII[4] = (40 + 41 + 19 + 54 ^ 76 + 145 - 143 + 108);
        DefaultHttpResponse.lIllIIIlIllIII[5] = "   ".length();
        DefaultHttpResponse.lIllIIIlIllIII[6] = (0xE9 ^ 0xA2 ^ (0x64 ^ 0x27));
    }
    
    private static String lllllIIIIIIlIll(final String lllllllllllllIIIIIllIIIllIlllIII, final String lllllllllllllIIIIIllIIIllIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIIllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIIllIllllII.init(DefaultHttpResponse.lIllIIIlIllIII[2], lllllllllllllIIIIIllIIIllIllllIl);
            return new String(lllllllllllllIIIIIllIIIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIllIlllIll) {
            lllllllllllllIIIIIllIIIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    public DefaultHttpResponse(final HttpVersion lllllllllllllIIIIIllIIIlllllIIII, final HttpResponseStatus lllllllllllllIIIIIllIIIllllIlIll, final boolean lllllllllllllIIIIIllIIIllllIlllI) {
        super(lllllllllllllIIIIIllIIIlllllIIII, lllllllllllllIIIIIllIIIllllIlllI);
        if (lllllIIIIIlIIII(lllllllllllllIIIIIllIIIllllIlIll)) {
            throw new NullPointerException(DefaultHttpResponse.lIllIIIlIlIlll[DefaultHttpResponse.lIllIIIlIllIII[1]]);
        }
        this.status = lllllllllllllIIIIIllIIIllllIlIll;
    }
    
    private static boolean lllllIIIIIlIIII(final Object lllllllllllllIIIIIllIIIllIllIIll) {
        return lllllllllllllIIIIIllIIIllIllIIll == null;
    }
    
    private static String lllllIIIIIIlIlI(final String lllllllllllllIIIIIllIIIlllIIIlll, final String lllllllllllllIIIIIllIIIlllIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), DefaultHttpResponse.lIllIIIlIllIII[6]), "DES");
            final Cipher lllllllllllllIIIIIllIIIlllIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIIIlllIIlIIl.init(DefaultHttpResponse.lIllIIIlIllIII[2], lllllllllllllIIIIIllIIIlllIIlIlI);
            return new String(lllllllllllllIIIIIllIIIlllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIlllIIlIII) {
            lllllllllllllIIIIIllIIIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIIIIllIIIlllIlIlll = new StringBuilder();
        lllllllllllllIIIIIllIIIlllIlIlll.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(DefaultHttpResponse.lIllIIIlIlIlll[DefaultHttpResponse.lIllIIIlIllIII[2]]);
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(this.getDecoderResult());
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append((char)DefaultHttpResponse.lIllIIIlIllIII[3]);
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(this.getProtocolVersion().text());
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append((char)DefaultHttpResponse.lIllIIIlIllIII[4]);
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(this.getStatus());
        "".length();
        lllllllllllllIIIIIllIIIlllIlIlll.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(lllllllllllllIIIIIllIIIlllIlIlll);
        lllllllllllllIIIIIllIIIlllIlIlll.setLength(lllllllllllllIIIIIllIIIlllIlIlll.length() - StringUtil.NEWLINE.length());
        return String.valueOf(lllllllllllllIIIIIllIIIlllIlIlll);
    }
    
    @Override
    public HttpResponse setStatus(final HttpResponseStatus lllllllllllllIIIIIllIIIllllIIIll) {
        if (lllllIIIIIlIIII(lllllllllllllIIIIIllIIIllllIIIll)) {
            throw new NullPointerException(DefaultHttpResponse.lIllIIIlIlIlll[DefaultHttpResponse.lIllIIIlIllIII[0]]);
        }
        this.status = lllllllllllllIIIIIllIIIllllIIIll;
        return this;
    }
}
