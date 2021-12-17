// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public final class SocksAuthResponse extends SocksResponse
{
    private final /* synthetic */ SocksAuthStatus authStatus;
    private static final /* synthetic */ SocksSubnegotiationVersion SUBNEGOTIATION_VERSION;
    private static final /* synthetic */ int[] lIIIIIlIllIlIl;
    private static final /* synthetic */ String[] lIIIIIlIllIIll;
    
    @Override
    public void encodeAsByteBuf(final ByteBuf lllllllllllllIlIIlllIIllIIllllll) {
        lllllllllllllIlIIlllIIllIIllllll.writeByte(SocksAuthResponse.SUBNEGOTIATION_VERSION.byteValue());
        "".length();
        lllllllllllllIlIIlllIIllIIllllll.writeByte(this.authStatus.byteValue());
        "".length();
    }
    
    public SocksAuthStatus authStatus() {
        return this.authStatus;
    }
    
    static {
        lIllIllIIllllIl();
        lIllIllIIllllII();
        SUBNEGOTIATION_VERSION = SocksSubnegotiationVersion.AUTH_PASSWORD;
    }
    
    private static String lIllIllIIllIllI(final String lllllllllllllIlIIlllIIllIIllIlIl, final String lllllllllllllIlIIlllIIllIIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIllIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIllIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllIIllIIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllIIllIIllIlll.init(SocksAuthResponse.lIIIIIlIllIlIl[2], lllllllllllllIlIIlllIIllIIlllIII);
            return new String(lllllllllllllIlIIlllIIllIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIllIIllIllI) {
            lllllllllllllIlIIlllIIllIIllIllI.printStackTrace();
            return null;
        }
    }
    
    public SocksAuthResponse(final SocksAuthStatus lllllllllllllIlIIlllIIllIlIIIllI) {
        super(SocksResponseType.AUTH);
        if (lIllIllIIlllllI(lllllllllllllIlIIlllIIllIlIIIllI)) {
            throw new NullPointerException(SocksAuthResponse.lIIIIIlIllIIll[SocksAuthResponse.lIIIIIlIllIlIl[0]]);
        }
        this.authStatus = lllllllllllllIlIIlllIIllIlIIIllI;
    }
    
    private static void lIllIllIIllllIl() {
        (lIIIIIlIllIlIl = new int[3])[0] = ((0x44 ^ 0x68) & ~(0xBA ^ 0x96));
        SocksAuthResponse.lIIIIIlIllIlIl[1] = " ".length();
        SocksAuthResponse.lIIIIIlIllIlIl[2] = "  ".length();
    }
    
    private static boolean lIllIllIIlllllI(final Object lllllllllllllIlIIlllIIllIIlIlllI) {
        return lllllllllllllIlIIlllIIllIIlIlllI == null;
    }
    
    private static void lIllIllIIllllII() {
        (lIIIIIlIllIIll = new String[SocksAuthResponse.lIIIIIlIllIlIl[1]])[SocksAuthResponse.lIIIIIlIllIlIl[0]] = lIllIllIIllIllI("S5lN5nYoiSq+11lS+1c53w==", "UlBoc");
    }
}
