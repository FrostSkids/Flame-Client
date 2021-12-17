// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum SslProvider
{
    private static final /* synthetic */ int[] llIlIIlIIlllIl;
    
    OPENSSL;
    
    private static final /* synthetic */ String[] llIlIIlIIllIll;
    
    JDK;
    
    private static void lIIlIIlIlIIIIlII() {
        (llIlIIlIIlllIl = new int[4])[0] = ((0x55 ^ 0xE) & ~(0xE8 ^ 0xB3));
        SslProvider.llIlIIlIIlllIl[1] = " ".length();
        SslProvider.llIlIIlIIlllIl[2] = "  ".length();
        SslProvider.llIlIIlIIlllIl[3] = (0x8A ^ 0x82);
    }
    
    static {
        lIIlIIlIlIIIIlII();
        lIIlIIlIIlllllll();
        final SslProvider[] $values = new SslProvider[SslProvider.llIlIIlIIlllIl[2]];
        $values[SslProvider.llIlIIlIIlllIl[0]] = SslProvider.JDK;
        $values[SslProvider.llIlIIlIIlllIl[1]] = SslProvider.OPENSSL;
        $VALUES = $values;
    }
    
    private static void lIIlIIlIIlllllll() {
        (llIlIIlIIllIll = new String[SslProvider.llIlIIlIIlllIl[2]])[SslProvider.llIlIIlIIlllIl[0]] = lIIlIIlIIlllllIl("Kzwv", "axdAJ");
        SslProvider.llIlIIlIIllIll[SslProvider.llIlIIlIIlllIl[1]] = lIIlIIlIIllllllI("p52c/Z1BtvQ=", "LvbvF");
    }
    
    private static String lIIlIIlIIlllllIl(String llllllllllllIllIllIIIlIIlIllllII, final String llllllllllllIllIllIIIlIIllIIIIII) {
        llllllllllllIllIllIIIlIIlIllllII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIIlIIlIllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIlIIlIllllll = new StringBuilder();
        final char[] llllllllllllIllIllIIIlIIlIlllllI = llllllllllllIllIllIIIlIIllIIIIII.toCharArray();
        int llllllllllllIllIllIIIlIIlIllllIl = SslProvider.llIlIIlIIlllIl[0];
        final float llllllllllllIllIllIIIlIIlIllIlll = (Object)((String)llllllllllllIllIllIIIlIIlIllllII).toCharArray();
        final double llllllllllllIllIllIIIlIIlIllIllI = llllllllllllIllIllIIIlIIlIllIlll.length;
        char llllllllllllIllIllIIIlIIlIllIlIl = (char)SslProvider.llIlIIlIIlllIl[0];
        while (lIIlIIlIlIIIIlIl(llllllllllllIllIllIIIlIIlIllIlIl, (int)llllllllllllIllIllIIIlIIlIllIllI)) {
            final char llllllllllllIllIllIIIlIIllIIIIlI = llllllllllllIllIllIIIlIIlIllIlll[llllllllllllIllIllIIIlIIlIllIlIl];
            llllllllllllIllIllIIIlIIlIllllll.append((char)(llllllllllllIllIllIIIlIIllIIIIlI ^ llllllllllllIllIllIIIlIIlIlllllI[llllllllllllIllIllIIIlIIlIllllIl % llllllllllllIllIllIIIlIIlIlllllI.length]));
            "".length();
            ++llllllllllllIllIllIIIlIIlIllllIl;
            ++llllllllllllIllIllIIIlIIlIllIlIl;
            "".length();
            if (" ".length() <= ((0x3E ^ 0x5A ^ (0x7C ^ 0xE)) & (0x70 ^ 0x74 ^ (0xA0 ^ 0xB2) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIlIIlIllllll);
    }
    
    private static boolean lIIlIIlIlIIIIlIl(final int llllllllllllIllIllIIIlIIlIlIIlII, final int llllllllllllIllIllIIIlIIlIlIIIll) {
        return llllllllllllIllIllIIIlIIlIlIIlII < llllllllllllIllIllIIIlIIlIlIIIll;
    }
    
    private static String lIIlIIlIIllllllI(final String llllllllllllIllIllIIIlIIlIlIlIlI, final String llllllllllllIllIllIIIlIIlIlIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIIlIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), SslProvider.llIlIIlIIlllIl[3]), "DES");
            final Cipher llllllllllllIllIllIIIlIIlIlIlllI = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlIIlIlIlllI.init(SslProvider.llIlIIlIIlllIl[2], llllllllllllIllIllIIIlIIlIlIllll);
            return new String(llllllllllllIllIllIIIlIIlIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIIlIlIllIl) {
            llllllllllllIllIllIIIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }
}
