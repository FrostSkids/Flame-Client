// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HttpRequestDecoder extends HttpObjectDecoder
{
    private static final /* synthetic */ int[] llIIlIIlIIIlll;
    private static final /* synthetic */ String[] llIIlIIlIIIllI;
    
    @Override
    protected boolean isDecodingRequest() {
        return HttpRequestDecoder.llIIlIIlIIIlll[0] != 0;
    }
    
    @Override
    protected HttpMessage createMessage(final String[] llllllllllllIlllIIlIllIIIIIlIlll) throws Exception {
        return new DefaultHttpRequest(HttpVersion.valueOf(llllllllllllIlllIIlIllIIIIIlIlll[HttpRequestDecoder.llIIlIIlIIIlll[1]]), HttpMethod.valueOf(llllllllllllIlllIIlIllIIIIIlIlll[HttpRequestDecoder.llIIlIIlIIIlll[2]]), llllllllllllIlllIIlIllIIIIIlIlll[HttpRequestDecoder.llIIlIIlIIIlll[0]], this.validateHeaders);
    }
    
    public HttpRequestDecoder(final int llllllllllllIlllIIlIllIIIIlIIIII, final int llllllllllllIlllIIlIllIIIIIlllll, final int llllllllllllIlllIIlIllIIIIIllllI, final boolean llllllllllllIlllIIlIllIIIIlIIIlI) {
        super(llllllllllllIlllIIlIllIIIIlIIIII, llllllllllllIlllIIlIllIIIIIlllll, llllllllllllIlllIIlIllIIIIIllllI, (boolean)(HttpRequestDecoder.llIIlIIlIIIlll[0] != 0), llllllllllllIlllIIlIllIIIIlIIIlI);
    }
    
    public HttpRequestDecoder(final int llllllllllllIlllIIlIllIIIIllIIlI, final int llllllllllllIlllIIlIllIIIIlIllIl, final int llllllllllllIlllIIlIllIIIIllIIII) {
        super(llllllllllllIlllIIlIllIIIIllIIlI, llllllllllllIlllIIlIllIIIIlIllIl, llllllllllllIlllIIlIllIIIIllIIII, (boolean)(HttpRequestDecoder.llIIlIIlIIIlll[0] != 0));
    }
    
    private static void lIIIllIIIIlllIll() {
        (llIIlIIlIIIllI = new String[HttpRequestDecoder.llIIlIIlIIIlll[0]])[HttpRequestDecoder.llIIlIIlIIIlll[2]] = lIIIllIIIIlllIlI("33LI+yb9/OALw4QTIRhV8A==", "tLHgN");
    }
    
    private static String lIIIllIIIIlllIlI(final String llllllllllllIlllIIlIllIIIIIIlIIl, final String llllllllllllIlllIIlIllIIIIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIllIIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIllIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIllIIIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIllIIIIIIllIl.init(HttpRequestDecoder.llIIlIIlIIIlll[1], llllllllllllIlllIIlIllIIIIIIlllI);
            return new String(llllllllllllIlllIIlIllIIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIllIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIllIIIIIIllII) {
            llllllllllllIlllIIlIllIIIIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIIIIllllII() {
        (llIIlIIlIIIlll = new int[3])[0] = " ".length();
        HttpRequestDecoder.llIIlIIlIIIlll[1] = "  ".length();
        HttpRequestDecoder.llIIlIIlIIIlll[2] = ((32 + 112 - 37 + 21 ^ 60 + 171 - 100 + 47) & (0x6E ^ 0x50 ^ (0x28 ^ 0x24) ^ -" ".length()));
    }
    
    public HttpRequestDecoder() {
    }
    
    static {
        lIIIllIIIIllllII();
        lIIIllIIIIlllIll();
    }
    
    @Override
    protected HttpMessage createInvalidMessage() {
        return new DefaultHttpRequest(HttpVersion.HTTP_1_0, HttpMethod.GET, HttpRequestDecoder.llIIlIIlIIIllI[HttpRequestDecoder.llIIlIIlIIIlll[2]], this.validateHeaders);
    }
}
