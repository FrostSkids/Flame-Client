// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum InternetProtocolFamily
{
    IPv4, 
    IPv6;
    
    private static final /* synthetic */ int[] lIllllIIIIIIlI;
    private static final /* synthetic */ String[] lIlllIlllllIll;
    
    private static void lIIIIIlllIlIIlII() {
        (lIllllIIIIIIlI = new int[4])[0] = ((0xDE ^ 0x8F) & ~(0x67 ^ 0x36));
        InternetProtocolFamily.lIllllIIIIIIlI[1] = " ".length();
        InternetProtocolFamily.lIllllIIIIIIlI[2] = "  ".length();
        InternetProtocolFamily.lIllllIIIIIIlI[3] = (0x3C ^ 0x34);
    }
    
    static {
        lIIIIIlllIlIIlII();
        lIIIIIlllIlIIIlI();
        final InternetProtocolFamily[] $values = new InternetProtocolFamily[InternetProtocolFamily.lIllllIIIIIIlI[2]];
        $values[InternetProtocolFamily.lIllllIIIIIIlI[0]] = InternetProtocolFamily.IPv4;
        $values[InternetProtocolFamily.lIllllIIIIIIlI[1]] = InternetProtocolFamily.IPv6;
        $VALUES = $values;
    }
    
    private static String lIIIIIlllIIlllll(final String llllllllllllIllllIllIIlllIIlIIlI, final String llllllllllllIllllIllIIlllIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIllIIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), InternetProtocolFamily.lIllllIIIIIIlI[3]), "DES");
            final Cipher llllllllllllIllllIllIIlllIIlIlII = Cipher.getInstance("DES");
            llllllllllllIllllIllIIlllIIlIlII.init(InternetProtocolFamily.lIllllIIIIIIlI[2], llllllllllllIllllIllIIlllIIlIlIl);
            return new String(llllllllllllIllllIllIIlllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIIlllIIlIIll) {
            llllllllllllIllllIllIIlllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlllIlIIIlI() {
        (lIlllIlllllIll = new String[InternetProtocolFamily.lIllllIIIIIIlI[2]])[InternetProtocolFamily.lIllllIIIIIIlI[0]] = lIIIIIlllIIlllll("HJAzNMnViLA=", "vDvuY");
        InternetProtocolFamily.lIlllIlllllIll[InternetProtocolFamily.lIllllIIIIIIlI[1]] = lIIIIIlllIIlllll("CRGrGUy6od8=", "pIKSw");
    }
}
