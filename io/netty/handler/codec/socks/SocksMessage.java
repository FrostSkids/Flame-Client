// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public abstract class SocksMessage
{
    private static final /* synthetic */ String[] lllllllIIIllI;
    private final /* synthetic */ SocksMessageType type;
    private static final /* synthetic */ int[] lllllllIIIlll;
    private final /* synthetic */ SocksProtocolVersion protocolVersion;
    
    static {
        lIllIIIIllIIlII();
        lIllIIIIllIIIlI();
    }
    
    private static void lIllIIIIllIIlII() {
        (lllllllIIIlll = new int[4])[0] = ((0xED ^ 0x93 ^ (0x6A ^ 0x5A)) & (83 + 219 - 213 + 159 ^ 115 + 13 - 105 + 159 ^ -" ".length()));
        SocksMessage.lllllllIIIlll[1] = " ".length();
        SocksMessage.lllllllIIIlll[2] = (0xBF ^ 0xB7);
        SocksMessage.lllllllIIIlll[3] = "  ".length();
    }
    
    protected SocksMessage(final SocksMessageType lllllllllllllIlIlIlIIIlIIIIlllIl) {
        this.protocolVersion = SocksProtocolVersion.SOCKS5;
        if (lIllIIIIllIIlIl(lllllllllllllIlIlIlIIIlIIIIlllIl)) {
            throw new NullPointerException(SocksMessage.lllllllIIIllI[SocksMessage.lllllllIIIlll[0]]);
        }
        this.type = lllllllllllllIlIlIlIIIlIIIIlllIl;
    }
    
    private static void lIllIIIIllIIIlI() {
        (lllllllIIIllI = new String[SocksMessage.lllllllIIIlll[1]])[SocksMessage.lllllllIIIlll[0]] = lIllIIIIllIIIIl("LboOVnC9wMY=", "osjVd");
    }
    
    public SocksProtocolVersion protocolVersion() {
        return this.protocolVersion;
    }
    
    public SocksMessageType type() {
        return this.type;
    }
    
    private static boolean lIllIIIIllIIlIl(final Object lllllllllllllIlIlIlIIIlIIIIIlIII) {
        return lllllllllllllIlIlIlIIIlIIIIIlIII == null;
    }
    
    @Deprecated
    public abstract void encodeAsByteBuf(final ByteBuf p0);
    
    private static String lIllIIIIllIIIIl(final String lllllllllllllIlIlIlIIIlIIIIIllIl, final String lllllllllllllIlIlIlIIIlIIIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIlIIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIlIIIIIlllI.getBytes(StandardCharsets.UTF_8)), SocksMessage.lllllllIIIlll[2]), "DES");
            final Cipher lllllllllllllIlIlIlIIIlIIIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIIlIIIIlIIIl.init(SocksMessage.lllllllIIIlll[3], lllllllllllllIlIlIlIIIlIIIIlIIlI);
            return new String(lllllllllllllIlIlIlIIIlIIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIlIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIlIIIIlIIII) {
            lllllllllllllIlIlIlIIIlIIIIlIIII.printStackTrace();
            return null;
        }
    }
}
