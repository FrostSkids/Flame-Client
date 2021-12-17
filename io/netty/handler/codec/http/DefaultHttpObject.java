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
import io.netty.handler.codec.DecoderResult;

public class DefaultHttpObject implements HttpObject
{
    private static final /* synthetic */ String[] lIIIlIllllIlII;
    private /* synthetic */ DecoderResult decoderResult;
    private static final /* synthetic */ int[] lIIIlIlllllIII;
    
    @Override
    public DecoderResult getDecoderResult() {
        return this.decoderResult;
    }
    
    protected DefaultHttpObject() {
        this.decoderResult = DecoderResult.SUCCESS;
    }
    
    private static void llIIIIlIIlIIIIl() {
        (lIIIlIlllllIII = new int[3])[0] = ((0x9A ^ 0x8B ^ (0x4B ^ 0x78)) & (0x54 ^ 0x78 ^ (0x9F ^ 0x91) ^ -" ".length()));
        DefaultHttpObject.lIIIlIlllllIII[1] = " ".length();
        DefaultHttpObject.lIIIlIlllllIII[2] = "  ".length();
    }
    
    static {
        llIIIIlIIlIIIIl();
        llIIIIlIIlIIIII();
    }
    
    @Override
    public void setDecoderResult(final DecoderResult lllllllllllllIlIIIIlIIlIIlIlIlll) {
        if (llIIIIlIIlIIIll(lllllllllllllIlIIIIlIIlIIlIlIlll)) {
            throw new NullPointerException(DefaultHttpObject.lIIIlIllllIlII[DefaultHttpObject.lIIIlIlllllIII[0]]);
        }
        this.decoderResult = lllllllllllllIlIIIIlIIlIIlIlIlll;
    }
    
    private static void llIIIIlIIlIIIII() {
        (lIIIlIllllIlII = new String[DefaultHttpObject.lIIIlIlllllIII[1]])[DefaultHttpObject.lIIIlIlllllIII[0]] = llIIIIlIIIllIll("tu4dIvX8k/Yca/yYqosdJg==", "XboTs");
    }
    
    private static boolean llIIIIlIIlIIIll(final Object lllllllllllllIlIIIIlIIlIIlIIIllI) {
        return lllllllllllllIlIIIIlIIlIIlIIIllI == null;
    }
    
    private static String llIIIIlIIIllIll(final String lllllllllllllIlIIIIlIIlIIlIIllIl, final String lllllllllllllIlIIIIlIIlIIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIIlIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIIlIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlIIlIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlIIlIIlIIllll.init(DefaultHttpObject.lIIIlIlllllIII[2], lllllllllllllIlIIIIlIIlIIlIlIIII);
            return new String(lllllllllllllIlIIIIlIIlIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIIlIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIIlIIlIIlllI) {
            lllllllllllllIlIIIIlIIlIIlIIlllI.printStackTrace();
            return null;
        }
    }
}
