// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.http.HttpResponseStatus;

public class RtspResponseDecoder extends RtspObjectDecoder
{
    private static final /* synthetic */ int[] llIlllIllIIIlI;
    private static final /* synthetic */ HttpResponseStatus UNKNOWN_STATUS;
    private static final /* synthetic */ String[] llIlllIllIIIIl;
    
    @Override
    protected HttpMessage createMessage(final String[] llllllllllllIllIIlIIIlIIIlIlIlIl) throws Exception {
        return new DefaultHttpResponse(RtspVersions.valueOf(llllllllllllIllIIlIIIlIIIlIlIlIl[RtspResponseDecoder.llIlllIllIIIlI[0]]), new HttpResponseStatus(Integer.parseInt(llllllllllllIllIIlIIIlIIIlIlIlIl[RtspResponseDecoder.llIlllIllIIIlI[1]]), llllllllllllIllIIlIIIlIIIlIlIlIl[RtspResponseDecoder.llIlllIllIIIlI[2]]), this.validateHeaders);
    }
    
    @Override
    protected HttpMessage createInvalidMessage() {
        return new DefaultHttpResponse(RtspVersions.RTSP_1_0, RtspResponseDecoder.UNKNOWN_STATUS, this.validateHeaders);
    }
    
    public RtspResponseDecoder(final int llllllllllllIllIIlIIIlIIIllIlllI, final int llllllllllllIllIIlIIIlIIIllIllIl, final int llllllllllllIllIIlIIIlIIIllIllII) {
        super(llllllllllllIllIIlIIIlIIIllIlllI, llllllllllllIllIIlIIIlIIIllIllIl, llllllllllllIllIIlIIIlIIIllIllII);
    }
    
    private static void lIIllIlIIIIIllII() {
        (llIlllIllIIIlI = new int[4])[0] = ((0x1E ^ 0x14) & ~(0x89 ^ 0x83));
        RtspResponseDecoder.llIlllIllIIIlI[1] = " ".length();
        RtspResponseDecoder.llIlllIllIIIlI[2] = "  ".length();
        RtspResponseDecoder.llIlllIllIIIlI[3] = (0xFFFFDFFF & 0x23E7);
    }
    
    public RtspResponseDecoder() {
    }
    
    public RtspResponseDecoder(final int llllllllllllIllIIlIIIlIIIllIIIIl, final int llllllllllllIllIIlIIIlIIIllIIIII, final int llllllllllllIllIIlIIIlIIIlIllIlI, final boolean llllllllllllIllIIlIIIlIIIlIllIIl) {
        super(llllllllllllIllIIlIIIlIIIllIIIIl, llllllllllllIllIIlIIIlIIIllIIIII, llllllllllllIllIIlIIIlIIIlIllIlI, llllllllllllIllIIlIIIlIIIlIllIIl);
    }
    
    static {
        lIIllIlIIIIIllII();
        lIIllIlIIIIIlIll();
        UNKNOWN_STATUS = new HttpResponseStatus(RtspResponseDecoder.llIlllIllIIIlI[3], RtspResponseDecoder.llIlllIllIIIIl[RtspResponseDecoder.llIlllIllIIIlI[0]]);
    }
    
    private static void lIIllIlIIIIIlIll() {
        (llIlllIllIIIIl = new String[RtspResponseDecoder.llIlllIllIIIlI[1]])[RtspResponseDecoder.llIlllIllIIIlI[0]] = lIIllIlIIIIIlIlI("a2x7OfiARPU=", "TmUaL");
    }
    
    @Override
    protected boolean isDecodingRequest() {
        return RtspResponseDecoder.llIlllIllIIIlI[0] != 0;
    }
    
    private static String lIIllIlIIIIIlIlI(final String llllllllllllIllIIlIIIlIIIlIIIlIl, final String llllllllllllIllIIlIIIlIIIlIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIIlIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIIlIIIlIIlIIl.init(RtspResponseDecoder.llIlllIllIIIlI[2], llllllllllllIllIIlIIIlIIIlIIlIlI);
            return new String(llllllllllllIllIIlIIIlIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIIIlIIlIII) {
            llllllllllllIllIIlIIIlIIIlIIlIII.printStackTrace();
            return null;
        }
    }
}
