// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HttpResponseDecoder extends HttpObjectDecoder
{
    private static final /* synthetic */ HttpResponseStatus UNKNOWN_STATUS;
    private static final /* synthetic */ String[] lIIIllIIIIllII;
    private static final /* synthetic */ int[] lIIIllIIIIlllI;
    
    @Override
    protected boolean isDecodingRequest() {
        return HttpResponseDecoder.lIIIllIIIIlllI[1] != 0;
    }
    
    public HttpResponseDecoder(final int lllllllllllllIlIIIIIlllIIlIIllII, final int lllllllllllllIlIIIIIlllIIlIlIIII, final int lllllllllllllIlIIIIIlllIIlIIllll, final boolean lllllllllllllIlIIIIIlllIIlIIlllI) {
        super(lllllllllllllIlIIIIIlllIIlIIllII, lllllllllllllIlIIIIIlllIIlIlIIII, lllllllllllllIlIIIIIlllIIlIIllll, (boolean)(HttpResponseDecoder.lIIIllIIIIlllI[0] != 0), lllllllllllllIlIIIIIlllIIlIIlllI);
    }
    
    static {
        llIIIIlIllIIllI();
        llIIIIlIllIIIlI();
        UNKNOWN_STATUS = new HttpResponseStatus(HttpResponseDecoder.lIIIllIIIIlllI[3], HttpResponseDecoder.lIIIllIIIIllII[HttpResponseDecoder.lIIIllIIIIlllI[1]]);
    }
    
    private static void llIIIIlIllIIIlI() {
        (lIIIllIIIIllII = new String[HttpResponseDecoder.lIIIllIIIIlllI[0]])[HttpResponseDecoder.lIIIllIIIIlllI[1]] = llIIIIlIllIIIIl("h75OiY4mZk8=", "UboRt");
    }
    
    public HttpResponseDecoder(final int lllllllllllllIlIIIIIlllIIlIllIlI, final int lllllllllllllIlIIIIIlllIIlIlllIl, final int lllllllllllllIlIIIIIlllIIlIllIII) {
        super(lllllllllllllIlIIIIIlllIIlIllIlI, lllllllllllllIlIIIIIlllIIlIlllIl, lllllllllllllIlIIIIIlllIIlIllIII, (boolean)(HttpResponseDecoder.lIIIllIIIIlllI[0] != 0));
    }
    
    @Override
    protected HttpMessage createMessage(final String[] lllllllllllllIlIIIIIlllIIlIIIIll) {
        return new DefaultHttpResponse(HttpVersion.valueOf(lllllllllllllIlIIIIIlllIIlIIIIll[HttpResponseDecoder.lIIIllIIIIlllI[1]]), new HttpResponseStatus(Integer.parseInt(lllllllllllllIlIIIIIlllIIlIIIIll[HttpResponseDecoder.lIIIllIIIIlllI[0]]), lllllllllllllIlIIIIIlllIIlIIIIll[HttpResponseDecoder.lIIIllIIIIlllI[2]]), this.validateHeaders);
    }
    
    public HttpResponseDecoder() {
    }
    
    @Override
    protected HttpMessage createInvalidMessage() {
        return new DefaultHttpResponse(HttpVersion.HTTP_1_0, HttpResponseDecoder.UNKNOWN_STATUS, this.validateHeaders);
    }
    
    private static void llIIIIlIllIIllI() {
        (lIIIllIIIIlllI = new int[5])[0] = " ".length();
        HttpResponseDecoder.lIIIllIIIIlllI[1] = ((0xAA ^ 0xB1) & ~(0x2C ^ 0x37) & ~((0xA6 ^ 0x99) & ~(0x36 ^ 0x9)));
        HttpResponseDecoder.lIIIllIIIIlllI[2] = "  ".length();
        HttpResponseDecoder.lIIIllIIIIlllI[3] = (-(0xFFFFED4B & 0x1ABD) & (0xFFFFDBFF & 0x2FEF));
        HttpResponseDecoder.lIIIllIIIIlllI[4] = (0x24 ^ 0x2C);
    }
    
    private static String llIIIIlIllIIIIl(final String lllllllllllllIlIIIIIlllIIIllIlIl, final String lllllllllllllIlIIIIIlllIIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIlllIIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlllIIIllIllI.getBytes(StandardCharsets.UTF_8)), HttpResponseDecoder.lIIIllIIIIlllI[4]), "DES");
            final Cipher lllllllllllllIlIIIIIlllIIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIlllIIIlllIIl.init(HttpResponseDecoder.lIIIllIIIIlllI[2], lllllllllllllIlIIIIIlllIIIlllIlI);
            return new String(lllllllllllllIlIIIIIlllIIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIlllIIIlllIII) {
            lllllllllllllIlIIIIIlllIIIlllIII.printStackTrace();
            return null;
        }
    }
}
