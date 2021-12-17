// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class SocksInitResponse extends SocksResponse
{
    private static final /* synthetic */ int[] llIlllIllIIllI;
    private static final /* synthetic */ String[] llIlllIllIIlIl;
    private final /* synthetic */ SocksAuthScheme authScheme;
    
    private static String lIIllIlIIIIIllIl(final String llllllllllllIllIIlIIIlIIIIlIIIll, final String llllllllllllIllIIlIIIlIIIIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIIlIIIIlIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIIlIIIIlIIlll.init(SocksInitResponse.llIlllIllIIllI[2], llllllllllllIllIIlIIIlIIIIlIlIII);
            return new String(llllllllllllIllIIlIIIlIIIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIIIIlIIllI) {
            llllllllllllIllIIlIIIlIIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    public SocksInitResponse(final SocksAuthScheme llllllllllllIllIIlIIIlIIIIllIllI) {
        super(SocksResponseType.INIT);
        if (lIIllIlIIIIlIIII(llllllllllllIllIIlIIIlIIIIllIllI)) {
            throw new NullPointerException(SocksInitResponse.llIlllIllIIlIl[SocksInitResponse.llIlllIllIIllI[0]]);
        }
        this.authScheme = llllllllllllIllIIlIIIlIIIIllIllI;
    }
    
    private static void lIIllIlIIIIIllll() {
        (llIlllIllIIllI = new int[3])[0] = ((140 + 113 - 169 + 63 ^ 76 + 50 - 27 + 74) & (0x85 ^ 0x9C ^ (0xE7 ^ 0xC0) ^ -" ".length()));
        SocksInitResponse.llIlllIllIIllI[1] = " ".length();
        SocksInitResponse.llIlllIllIIllI[2] = "  ".length();
    }
    
    private static void lIIllIlIIIIIlllI() {
        (llIlllIllIIlIl = new String[SocksInitResponse.llIlllIllIIllI[1]])[SocksInitResponse.llIlllIllIIllI[0]] = lIIllIlIIIIIllIl("znDhnXF0Ni+pjXds4u1YYw==", "qMFXQ");
    }
    
    public SocksAuthScheme authScheme() {
        return this.authScheme;
    }
    
    static {
        lIIllIlIIIIIllll();
        lIIllIlIIIIIlllI();
    }
    
    private static boolean lIIllIlIIIIlIIII(final Object llllllllllllIllIIlIIIlIIIIIllllI) {
        return llllllllllllIllIIlIIIlIIIIIllllI == null;
    }
    
    @Override
    public void encodeAsByteBuf(final ByteBuf llllllllllllIllIIlIIIlIIIIlIllIl) {
        llllllllllllIllIIlIIIlIIIIlIllIl.writeByte(this.protocolVersion().byteValue());
        "".length();
        llllllllllllIllIIlIIIlIIIIlIllIl.writeByte(this.authScheme.byteValue());
        "".length();
    }
}
