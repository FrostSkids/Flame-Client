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

public enum SocksMessageType
{
    UNKNOWN, 
    RESPONSE, 
    REQUEST;
    
    private static final /* synthetic */ String[] lllIIllIIlIIll;
    private static final /* synthetic */ int[] lllIIllIIlIlII;
    
    private static String lIlIIIIIIIlllllI(final String llllllllllllIlIllllIIIIlIlIlIIlI, final String llllllllllllIlIllllIIIIlIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIIlIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), SocksMessageType.lllIIllIIlIlII[4]), "DES");
            final Cipher llllllllllllIlIllllIIIIlIlIlIllI = Cipher.getInstance("DES");
            llllllllllllIlIllllIIIIlIlIlIllI.init(SocksMessageType.lllIIllIIlIlII[2], llllllllllllIlIllllIIIIlIlIlIlll);
            return new String(llllllllllllIlIllllIIIIlIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIIlIlIlIlIl) {
            llllllllllllIlIllllIIIIlIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIIIIIllllll() {
        (lllIIllIIlIIll = new String[SocksMessageType.lllIIllIIlIlII[3]])[SocksMessageType.lllIIllIIlIlII[0]] = lIlIIIIIIIllllII("NgoTETc3Gw==", "dOBDr");
        SocksMessageType.lllIIllIIlIIll[SocksMessageType.lllIIllIIlIlII[1]] = lIlIIIIIIIllllIl("mnIuL7KE8+Lizc759K145w==", "fKBoh");
        SocksMessageType.lllIIllIIlIIll[SocksMessageType.lllIIllIIlIlII[2]] = lIlIIIIIIIlllllI("e9JkiCMatbw=", "JSyrw");
    }
    
    private static void lIlIIIIIIlIIIIIl() {
        (lllIIllIIlIlII = new int[5])[0] = ((0xC ^ 0x24) & ~(0x6 ^ 0x2E));
        SocksMessageType.lllIIllIIlIlII[1] = " ".length();
        SocksMessageType.lllIIllIIlIlII[2] = "  ".length();
        SocksMessageType.lllIIllIIlIlII[3] = "   ".length();
        SocksMessageType.lllIIllIIlIlII[4] = (0x4F ^ 0x47);
    }
    
    private static String lIlIIIIIIIllllIl(final String llllllllllllIlIllllIIIIlIlllIlll, final String llllllllllllIlIllllIIIIlIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIIlIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIIIlIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIIIlIllllIll.init(SocksMessageType.lllIIllIIlIlII[2], llllllllllllIlIllllIIIIlIlllllII);
            return new String(llllllllllllIlIllllIIIIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIIlIllllIlI) {
            llllllllllllIlIllllIIIIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIIlIIIIlI(final int llllllllllllIlIllllIIIIlIlIIllII, final int llllllllllllIlIllllIIIIlIlIIlIll) {
        return llllllllllllIlIllllIIIIlIlIIllII < llllllllllllIlIllllIIIIlIlIIlIll;
    }
    
    private static String lIlIIIIIIIllllII(String llllllllllllIlIllllIIIIlIllIIlII, final String llllllllllllIlIllllIIIIlIllIIIll) {
        llllllllllllIlIllllIIIIlIllIIlII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIIIIlIllIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIIIlIllIIlll = new StringBuilder();
        final char[] llllllllllllIlIllllIIIIlIllIIllI = llllllllllllIlIllllIIIIlIllIIIll.toCharArray();
        int llllllllllllIlIllllIIIIlIllIIlIl = SocksMessageType.lllIIllIIlIlII[0];
        final long llllllllllllIlIllllIIIIlIlIlllll = (Object)((String)llllllllllllIlIllllIIIIlIllIIlII).toCharArray();
        final short llllllllllllIlIllllIIIIlIlIllllI = (short)llllllllllllIlIllllIIIIlIlIlllll.length;
        double llllllllllllIlIllllIIIIlIlIlllIl = SocksMessageType.lllIIllIIlIlII[0];
        while (lIlIIIIIIlIIIIlI((int)llllllllllllIlIllllIIIIlIlIlllIl, llllllllllllIlIllllIIIIlIlIllllI)) {
            final char llllllllllllIlIllllIIIIlIllIlIlI = llllllllllllIlIllllIIIIlIlIlllll[llllllllllllIlIllllIIIIlIlIlllIl];
            llllllllllllIlIllllIIIIlIllIIlll.append((char)(llllllllllllIlIllllIIIIlIllIlIlI ^ llllllllllllIlIllllIIIIlIllIIllI[llllllllllllIlIllllIIIIlIllIIlIl % llllllllllllIlIllllIIIIlIllIIllI.length]));
            "".length();
            ++llllllllllllIlIllllIIIIlIllIIlIl;
            ++llllllllllllIlIllllIIIIlIlIlllIl;
            "".length();
            if ((0x4D ^ 0x74 ^ (0x67 ^ 0x5B)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIIIlIllIIlll);
    }
    
    static {
        lIlIIIIIIlIIIIIl();
        lIlIIIIIIIllllll();
        final SocksMessageType[] $values = new SocksMessageType[SocksMessageType.lllIIllIIlIlII[3]];
        $values[SocksMessageType.lllIIllIIlIlII[0]] = SocksMessageType.REQUEST;
        $values[SocksMessageType.lllIIllIIlIlII[1]] = SocksMessageType.RESPONSE;
        $values[SocksMessageType.lllIIllIIlIlII[2]] = SocksMessageType.UNKNOWN;
        $VALUES = $values;
    }
}
