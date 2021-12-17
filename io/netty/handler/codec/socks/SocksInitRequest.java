// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import java.util.Collections;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

public final class SocksInitRequest extends SocksRequest
{
    private static final /* synthetic */ int[] llIIIIlIlllllI;
    private static final /* synthetic */ String[] llIIIIlIlllIlI;
    private final /* synthetic */ List<SocksAuthScheme> authSchemes;
    
    private static boolean lIIIlIIIIIIIlIIl(final int llllllllllllIlllIllIllIlIlIIllll) {
        return llllllllllllIlllIllIllIlIlIIllll != 0;
    }
    
    static {
        lIIIlIIIIIIIIlll();
        lIIIlIIIIIIIIIlI();
    }
    
    private static void lIIIlIIIIIIIIIlI() {
        (llIIIIlIlllIlI = new String[SocksInitRequest.llIIIIlIlllllI[1]])[SocksInitRequest.llIIIIlIlllllI[0]] = lIIIlIIIIIIIIIIl("L1fJmoV2dc0WRULLlY60hQ==", "IwASt");
    }
    
    private static String lIIIlIIIIIIIIIIl(final String llllllllllllIlllIllIllIlIlIllIII, final String llllllllllllIlllIllIllIlIlIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIllIlIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), SocksInitRequest.llIIIIlIlllllI[2]), "DES");
            final Cipher llllllllllllIlllIllIllIlIlIllIlI = Cipher.getInstance("DES");
            llllllllllllIlllIllIllIlIlIllIlI.init(SocksInitRequest.llIIIIlIlllllI[3], llllllllllllIlllIllIllIlIlIllIll);
            return new String(llllllllllllIlllIllIllIlIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIllIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIllIlIlIllIIl) {
            llllllllllllIlllIllIllIlIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIIIIIIlIII(final Object llllllllllllIlllIllIllIlIlIlIIIl) {
        return llllllllllllIlllIllIllIlIlIlIIIl == null;
    }
    
    public List<SocksAuthScheme> authSchemes() {
        return Collections.unmodifiableList((List<? extends SocksAuthScheme>)this.authSchemes);
    }
    
    @Override
    public void encodeAsByteBuf(final ByteBuf llllllllllllIlllIllIllIlIllIIlII) {
        llllllllllllIlllIllIllIlIllIIlII.writeByte(this.protocolVersion().byteValue());
        "".length();
        llllllllllllIlllIllIllIlIllIIlII.writeByte(this.authSchemes.size());
        "".length();
        final Iterator llllllllllllIlllIllIllIlIllIIllI = this.authSchemes.iterator();
        while (lIIIlIIIIIIIlIIl(llllllllllllIlllIllIllIlIllIIllI.hasNext() ? 1 : 0)) {
            final SocksAuthScheme llllllllllllIlllIllIllIlIllIIlll = llllllllllllIlllIllIllIlIllIIllI.next();
            llllllllllllIlllIllIllIlIllIIlII.writeByte(llllllllllllIlllIllIllIlIllIIlll.byteValue());
            "".length();
            "".length();
            if (-(0x9C ^ 0xAC ^ (0x31 ^ 0x5)) >= 0) {
                return;
            }
        }
    }
    
    private static void lIIIlIIIIIIIIlll() {
        (llIIIIlIlllllI = new int[4])[0] = ((0x35 ^ 0x5B ^ (0xBD ^ 0x9D)) & (0x6D ^ 0x1 ^ (0x72 ^ 0x50) ^ -" ".length()));
        SocksInitRequest.llIIIIlIlllllI[1] = " ".length();
        SocksInitRequest.llIIIIlIlllllI[2] = (0x2D ^ 0x25);
        SocksInitRequest.llIIIIlIlllllI[3] = "  ".length();
    }
    
    public SocksInitRequest(final List<SocksAuthScheme> llllllllllllIlllIllIllIlIllIllll) {
        super(SocksRequestType.INIT);
        if (lIIIlIIIIIIIlIII(llllllllllllIlllIllIllIlIllIllll)) {
            throw new NullPointerException(SocksInitRequest.llIIIIlIlllIlI[SocksInitRequest.llIIIIlIlllllI[0]]);
        }
        this.authSchemes = llllllllllllIlllIllIllIlIllIllll;
    }
}
