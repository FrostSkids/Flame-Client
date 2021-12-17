// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class SslHandshakeCompletionEvent
{
    private static final /* synthetic */ int[] lIlllIlllIIlll;
    private final /* synthetic */ Throwable cause;
    private static final /* synthetic */ String[] lIlllIlllIIlIl;
    
    private SslHandshakeCompletionEvent() {
        this.cause = null;
    }
    
    private static String lIIIIIllIllIlIll(final String llllllllllllIllllIllIllIllIlIlII, final String llllllllllllIllllIllIllIllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllIllIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIllIllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIllIllIlIllI.init(SslHandshakeCompletionEvent.lIlllIlllIIlll[2], llllllllllllIllllIllIllIllIlIlll);
            return new String(llllllllllllIllllIllIllIllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIllIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIllIllIlIlIl) {
            llllllllllllIllllIllIllIllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIllIlllIIIl(final Object llllllllllllIllllIllIllIllIIllIl) {
        return llllllllllllIllllIllIllIllIIllIl == null;
    }
    
    static {
        lIIIIIllIlllIIII();
        lIIIIIllIllIlllI();
        SUCCESS = new SslHandshakeCompletionEvent();
    }
    
    public Throwable cause() {
        return this.cause;
    }
    
    public boolean isSuccess() {
        int n;
        if (lIIIIIllIlllIIIl(this.cause)) {
            n = SslHandshakeCompletionEvent.lIlllIlllIIlll[1];
            "".length();
            if (((0xFE ^ 0xAD) & ~(0xEB ^ 0xB8)) < 0) {
                return ((0x95 ^ 0x87) & ~(0x15 ^ 0x7)) != 0x0;
            }
        }
        else {
            n = SslHandshakeCompletionEvent.lIlllIlllIIlll[0];
        }
        return n != 0;
    }
    
    private static void lIIIIIllIlllIIII() {
        (lIlllIlllIIlll = new int[3])[0] = ((0xC2 ^ 0x9D ^ "   ".length()) & (0x5A ^ 0x32 ^ (0x45 ^ 0x71) ^ -" ".length()));
        SslHandshakeCompletionEvent.lIlllIlllIIlll[1] = " ".length();
        SslHandshakeCompletionEvent.lIlllIlllIIlll[2] = "  ".length();
    }
    
    private static void lIIIIIllIllIlllI() {
        (lIlllIlllIIlIl = new String[SslHandshakeCompletionEvent.lIlllIlllIIlll[1]])[SslHandshakeCompletionEvent.lIlllIlllIIlll[0]] = lIIIIIllIllIlIll("bubFxT6HQAA=", "FPcxA");
    }
    
    public SslHandshakeCompletionEvent(final Throwable llllllllllllIllllIllIllIlllIIlII) {
        if (lIIIIIllIlllIIIl(llllllllllllIllllIllIllIlllIIlII)) {
            throw new NullPointerException(SslHandshakeCompletionEvent.lIlllIlllIIlIl[SslHandshakeCompletionEvent.lIlllIlllIIlll[0]]);
        }
        this.cause = llllllllllllIllllIllIllIlllIIlII;
    }
}
