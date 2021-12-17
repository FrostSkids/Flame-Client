// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.http.DefaultHttpRequest;
import io.netty.handler.codec.http.HttpMessage;

public class RtspRequestDecoder extends RtspObjectDecoder
{
    private static final /* synthetic */ String[] llIIIlIlIlIlll;
    private static final /* synthetic */ int[] llIIIlIlIllIII;
    
    public RtspRequestDecoder(final int llllllllllllIlllIlIllIlIIIIllIll, final int llllllllllllIlllIlIllIlIIIIllIlI, final int llllllllllllIlllIlIllIlIIIIllIIl, final boolean llllllllllllIlllIlIllIlIIIIllIII) {
        super(llllllllllllIlllIlIllIlIIIIllIll, llllllllllllIlllIlIllIlIIIIllIlI, llllllllllllIlllIlIllIlIIIIllIIl, llllllllllllIlllIlIllIlIIIIllIII);
    }
    
    private static void lIIIlIIlIllIIlll() {
        (llIIIlIlIllIII = new int[4])[0] = "  ".length();
        RtspRequestDecoder.llIIIlIlIllIII[1] = ((0xD ^ 0x54) & ~(0xC6 ^ 0x9F) & ~((0x2 ^ 0x12) & ~(0x78 ^ 0x68)));
        RtspRequestDecoder.llIIIlIlIllIII[2] = " ".length();
        RtspRequestDecoder.llIIIlIlIllIII[3] = (0x48 ^ 0x53 ^ (0xD3 ^ 0xC0));
    }
    
    @Override
    protected HttpMessage createInvalidMessage() {
        return new DefaultHttpRequest(RtspVersions.RTSP_1_0, RtspMethods.OPTIONS, RtspRequestDecoder.llIIIlIlIlIlll[RtspRequestDecoder.llIIIlIlIllIII[1]], this.validateHeaders);
    }
    
    private static String lIIIlIIlIllIIlIl(final String llllllllllllIlllIlIllIIlllllllll, final String llllllllllllIlllIlIllIIllllllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIlIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIIllllllllI.getBytes(StandardCharsets.UTF_8)), RtspRequestDecoder.llIIIlIlIllIII[3]), "DES");
            final Cipher llllllllllllIlllIlIllIlIIIIIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIlIllIlIIIIIIIll.init(RtspRequestDecoder.llIIIlIlIllIII[0], llllllllllllIlllIlIllIlIIIIIIlII);
            return new String(llllllllllllIlllIlIllIlIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIlIIIIIIIlI) {
            llllllllllllIlllIlIllIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIlIllIIllI() {
        (llIIIlIlIlIlll = new String[RtspRequestDecoder.llIIIlIlIllIII[2]])[RtspRequestDecoder.llIIIlIlIllIII[1]] = lIIIlIIlIllIIlIl("/SGJMs4U43psTdMLBOqiPw==", "RiAEh");
    }
    
    @Override
    protected boolean isDecodingRequest() {
        return RtspRequestDecoder.llIIIlIlIllIII[2] != 0;
    }
    
    static {
        lIIIlIIlIllIIlll();
        lIIIlIIlIllIIllI();
    }
    
    public RtspRequestDecoder() {
    }
    
    public RtspRequestDecoder(final int llllllllllllIlllIlIllIlIIIlIIlII, final int llllllllllllIlllIlIllIlIIIlIIIll, final int llllllllllllIlllIlIllIlIIIlIIllI) {
        super(llllllllllllIlllIlIllIlIIIlIIlII, llllllllllllIlllIlIllIlIIIlIIIll, llllllllllllIlllIlIllIlIIIlIIllI);
    }
    
    @Override
    protected HttpMessage createMessage(final String[] llllllllllllIlllIlIllIlIIIIIllll) throws Exception {
        return new DefaultHttpRequest(RtspVersions.valueOf(llllllllllllIlllIlIllIlIIIIIllll[RtspRequestDecoder.llIIIlIlIllIII[0]]), RtspMethods.valueOf(llllllllllllIlllIlIllIlIIIIIllll[RtspRequestDecoder.llIIIlIlIllIII[1]]), llllllllllllIlllIlIllIlIIIIIllll[RtspRequestDecoder.llIIIlIlIllIII[2]], this.validateHeaders);
    }
}
