// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.embedded;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.SocketAddress;

final class EmbeddedSocketAddress extends SocketAddress
{
    private static final /* synthetic */ int[] llIIIlIIIIIIll;
    private static final /* synthetic */ String[] llIIIlIIIIIIIl;
    
    private static String lIIIlIIIlIlIIIIl(final String llllllllllllIlllIllIIlIIlllIIIII, final String llllllllllllIlllIllIIlIIllIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIIllIlllIl.getBytes(StandardCharsets.UTF_8)), EmbeddedSocketAddress.llIIIlIIIIIIll[2]), "DES");
            final Cipher llllllllllllIlllIllIIlIIlllIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIllIIlIIlllIIIll.init(EmbeddedSocketAddress.llIIIlIIIIIIll[3], llllllllllllIlllIllIIlIIlllIIllI);
            return new String(llllllllllllIlllIllIIlIIlllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIIlllIIIIl) {
            llllllllllllIlllIllIIlIIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIIlIlIlIII() {
        (llIIIlIIIIIIll = new int[4])[0] = ((95 + 33 - 35 + 35 ^ 122 + 72 - 126 + 68) & (182 + 105 - 106 + 4 ^ 170 + 136 - 272 + 143 ^ -" ".length()));
        EmbeddedSocketAddress.llIIIlIIIIIIll[1] = " ".length();
        EmbeddedSocketAddress.llIIIlIIIIIIll[2] = (185 + 110 - 150 + 41 ^ 69 + 7 + 74 + 28);
        EmbeddedSocketAddress.llIIIlIIIIIIll[3] = "  ".length();
    }
    
    private static void lIIIlIIIlIlIIIlI() {
        (llIIIlIIIIIIIl = new String[EmbeddedSocketAddress.llIIIlIIIIIIll[1]])[EmbeddedSocketAddress.llIIIlIIIIIIll[0]] = lIIIlIIIlIlIIIIl("UASs1qZqCXMCm7a9Pfp9Gw==", "AVQoH");
    }
    
    @Override
    public String toString() {
        return EmbeddedSocketAddress.llIIIlIIIIIIIl[EmbeddedSocketAddress.llIIIlIIIIIIll[0]];
    }
    
    static {
        lIIIlIIIlIlIlIII();
        lIIIlIIIlIlIIIlI();
    }
}
