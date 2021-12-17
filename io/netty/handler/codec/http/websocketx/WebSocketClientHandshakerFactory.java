// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.URI;

public final class WebSocketClientHandshakerFactory
{
    private static final /* synthetic */ int[] lIIIIIIlIIlIll;
    private static final /* synthetic */ String[] lIIIIIIlIIlIlI;
    
    private static boolean lIllIlIIIIIIIll(final int lllllllllllllIlIlIIIIlllIIlIllII, final int lllllllllllllIlIlIIIIlllIIlIlIll) {
        return lllllllllllllIlIlIIIIlllIIlIllII < lllllllllllllIlIlIIIIlllIIlIlIll;
    }
    
    public static WebSocketClientHandshaker newHandshaker(final URI lllllllllllllIlIlIIIIlllIllIllll, final WebSocketVersion lllllllllllllIlIlIIIIlllIllIlllI, final String lllllllllllllIlIlIIIIlllIllIllIl, final boolean lllllllllllllIlIlIIIIlllIllIIlll, final HttpHeaders lllllllllllllIlIlIIIIlllIllIlIll) {
        return newHandshaker(lllllllllllllIlIlIIIIlllIllIllll, lllllllllllllIlIlIIIIlllIllIlllI, lllllllllllllIlIlIIIIlllIllIllIl, lllllllllllllIlIlIIIIlllIllIIlll, lllllllllllllIlIlIIIIlllIllIlIll, WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[0]);
    }
    
    private static String lIllIIlllllllll(final String lllllllllllllIlIlIIIIlllIlIIllII, final String lllllllllllllIlIlIIIIlllIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIlllIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[4]), "DES");
            final Cipher lllllllllllllIlIlIIIIlllIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIIlllIlIIlllI.init(WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[3], lllllllllllllIlIlIIIIlllIlIIllll);
            return new String(lllllllllllllIlIlIIIIlllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIlllIlIIllIl) {
            lllllllllllllIlIlIIIIlllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    public static WebSocketClientHandshaker newHandshaker(final URI lllllllllllllIlIlIIIIlllIlIlllll, final WebSocketVersion lllllllllllllIlIlIIIIlllIlIllllI, final String lllllllllllllIlIlIIIIlllIlIlIlll, final boolean lllllllllllllIlIlIIIIlllIlIlIllI, final HttpHeaders lllllllllllllIlIlIIIIlllIlIllIll, final int lllllllllllllIlIlIIIIlllIlIlIlII) {
        if (lIllIlIIIIIIIlI(lllllllllllllIlIlIIIIlllIlIllllI, WebSocketVersion.V13)) {
            return new WebSocketClientHandshaker13(lllllllllllllIlIlIIIIlllIlIlllll, WebSocketVersion.V13, lllllllllllllIlIlIIIIlllIlIlIlll, lllllllllllllIlIlIIIIlllIlIlIllI, lllllllllllllIlIlIIIIlllIlIllIll, lllllllllllllIlIlIIIIlllIlIlIlII);
        }
        if (lIllIlIIIIIIIlI(lllllllllllllIlIlIIIIlllIlIllllI, WebSocketVersion.V08)) {
            return new WebSocketClientHandshaker08(lllllllllllllIlIlIIIIlllIlIlllll, WebSocketVersion.V08, lllllllllllllIlIlIIIIlllIlIlIlll, lllllllllllllIlIlIIIIlllIlIlIllI, lllllllllllllIlIlIIIIlllIlIllIll, lllllllllllllIlIlIIIIlllIlIlIlII);
        }
        if (lIllIlIIIIIIIlI(lllllllllllllIlIlIIIIlllIlIllllI, WebSocketVersion.V07)) {
            return new WebSocketClientHandshaker07(lllllllllllllIlIlIIIIlllIlIlllll, WebSocketVersion.V07, lllllllllllllIlIlIIIIlllIlIlIlll, lllllllllllllIlIlIIIIlllIlIlIllI, lllllllllllllIlIlIIIIlllIlIllIll, lllllllllllllIlIlIIIIlllIlIlIlII);
        }
        if (lIllIlIIIIIIIlI(lllllllllllllIlIlIIIIlllIlIllllI, WebSocketVersion.V00)) {
            return new WebSocketClientHandshaker00(lllllllllllllIlIlIIIIlllIlIlllll, WebSocketVersion.V00, lllllllllllllIlIlIIIIlllIlIlIlll, lllllllllllllIlIlIIIIlllIlIllIll, lllllllllllllIlIlIIIIlllIlIlIlII);
        }
        throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshakerFactory.lIIIIIIlIIlIlI[WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[1]]).append(lllllllllllllIlIlIIIIlllIlIllllI).append(WebSocketClientHandshakerFactory.lIIIIIIlIIlIlI[WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[2]])));
    }
    
    private static void lIllIlIIIIIIIII() {
        (lIIIIIIlIIlIlI = new String[WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[3]])[WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[1]] = lIllIIllllllllI("PTc8MSYOKj9lPwg3ICwmA2U=", "mESEI");
        WebSocketClientHandshakerFactory.lIIIIIIlIIlIlI[WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[2]] = lIllIIlllllllll("Xcnau2tNHyP19fkd62Vw6A==", "gZPwW");
    }
    
    private WebSocketClientHandshakerFactory() {
    }
    
    private static String lIllIIllllllllI(String lllllllllllllIlIlIIIIlllIIllIlll, final String lllllllllllllIlIlIIIIlllIIllIllI) {
        lllllllllllllIlIlIIIIlllIIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIlllIIlllIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIlllIIlllIIl = lllllllllllllIlIlIIIIlllIIllIllI.toCharArray();
        int lllllllllllllIlIlIIIIlllIIlllIII = WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[1];
        final char lllllllllllllIlIlIIIIlllIIllIIlI = (Object)lllllllllllllIlIlIIIIlllIIllIlll.toCharArray();
        final char lllllllllllllIlIlIIIIlllIIllIIIl = (char)lllllllllllllIlIlIIIIlllIIllIIlI.length;
        String lllllllllllllIlIlIIIIlllIIllIIII = (String)WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[1];
        while (lIllIlIIIIIIIll((int)lllllllllllllIlIlIIIIlllIIllIIII, lllllllllllllIlIlIIIIlllIIllIIIl)) {
            final char lllllllllllllIlIlIIIIlllIIllllIl = lllllllllllllIlIlIIIIlllIIllIIlI[lllllllllllllIlIlIIIIlllIIllIIII];
            lllllllllllllIlIlIIIIlllIIlllIlI.append((char)(lllllllllllllIlIlIIIIlllIIllllIl ^ lllllllllllllIlIlIIIIlllIIlllIIl[lllllllllllllIlIlIIIIlllIIlllIII % lllllllllllllIlIlIIIIlllIIlllIIl.length]));
            "".length();
            ++lllllllllllllIlIlIIIIlllIIlllIII;
            ++lllllllllllllIlIlIIIIlllIIllIIII;
            "".length();
            if (-(0x47 ^ 0x43) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIlllIIlllIlI);
    }
    
    private static void lIllIlIIIIIIIIl() {
        (lIIIIIIlIIlIll = new int[5])[0] = (-(0xFFFFFFDD & 0x2BBB) & (0xFFFFFBB9 & 0x12FDE));
        WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[1] = ((0x25 ^ 0x13) & ~(0x4E ^ 0x78));
        WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[2] = " ".length();
        WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[3] = "  ".length();
        WebSocketClientHandshakerFactory.lIIIIIIlIIlIll[4] = (0x7F ^ 0x4A ^ (0x5B ^ 0x66));
    }
    
    static {
        lIllIlIIIIIIIIl();
        lIllIlIIIIIIIII();
    }
    
    private static boolean lIllIlIIIIIIIlI(final Object lllllllllllllIlIlIIIIlllIIlIlIII, final Object lllllllllllllIlIlIIIIlllIIlIIlll) {
        return lllllllllllllIlIlIIIIlllIIlIlIII == lllllllllllllIlIlIIIIlllIIlIIlll;
    }
}
