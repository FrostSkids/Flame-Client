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

public enum SocksRequestType
{
    private static final /* synthetic */ String[] llIlIlIlllIlll;
    
    INIT;
    
    private static final /* synthetic */ int[] llIlIlIllllIII;
    
    CMD, 
    AUTH, 
    UNKNOWN;
    
    private static String lIIlIlIIlIlllIll(final String llllllllllllIllIlIlIIIIIIIlIlIII, final String llllllllllllIllIlIlIIIIIIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIIIIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), SocksRequestType.llIlIlIllllIII[5]), "DES");
            final Cipher llllllllllllIllIlIlIIIIIIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIlIIIIIIIlIlIlI.init(SocksRequestType.llIlIlIllllIII[2], llllllllllllIllIlIlIIIIIIIlIlIll);
            return new String(llllllllllllIllIlIlIIIIIIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIIIIIIlIlIIl) {
            llllllllllllIllIlIlIIIIIIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIIlIllllII(final String llllllllllllIllIlIlIIIIIIIllIIll, final String llllllllllllIllIlIlIIIIIIIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIIIIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIIIIIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIIIIIIllIlll.init(SocksRequestType.llIlIlIllllIII[2], llllllllllllIllIlIlIIIIIIIlllIII);
            return new String(llllllllllllIllIlIlIIIIIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIIIIIIllIllI) {
            llllllllllllIllIlIlIIIIIIIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlIIlIlllIlI(String llllllllllllIllIlIlIIIIIIIIllIII, final String llllllllllllIllIlIlIIIIIIIIlIlll) {
        llllllllllllIllIlIlIIIIIIIIllIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIIIIIIIlIllI = new StringBuilder();
        final char[] llllllllllllIllIlIlIIIIIIIIlIlIl = llllllllllllIllIlIlIIIIIIIIlIlll.toCharArray();
        int llllllllllllIllIlIlIIIIIIIIlIlII = SocksRequestType.llIlIlIllllIII[0];
        final String llllllllllllIllIlIlIIIIIIIIIlllI = (Object)llllllllllllIllIlIlIIIIIIIIllIII.toCharArray();
        final Exception llllllllllllIllIlIlIIIIIIIIIllIl = (Exception)llllllllllllIllIlIlIIIIIIIIIlllI.length;
        short llllllllllllIllIlIlIIIIIIIIIllII = (short)SocksRequestType.llIlIlIllllIII[0];
        while (lIIlIlIIlIllllll(llllllllllllIllIlIlIIIIIIIIIllII, (int)llllllllllllIllIlIlIIIIIIIIIllIl)) {
            final char llllllllllllIllIlIlIIIIIIIIllIIl = llllllllllllIllIlIlIIIIIIIIIlllI[llllllllllllIllIlIlIIIIIIIIIllII];
            llllllllllllIllIlIlIIIIIIIIlIllI.append((char)(llllllllllllIllIlIlIIIIIIIIllIIl ^ llllllllllllIllIlIlIIIIIIIIlIlIl[llllllllllllIllIlIlIIIIIIIIlIlII % llllllllllllIllIlIlIIIIIIIIlIlIl.length]));
            "".length();
            ++llllllllllllIllIlIlIIIIIIIIlIlII;
            ++llllllllllllIllIlIlIIIIIIIIIllII;
            "".length();
            if ((0x38 ^ 0x16 ^ (0x2 ^ 0x29)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIIIIIIIlIllI);
    }
    
    private static boolean lIIlIlIIlIllllll(final int llllllllllllIllIlIlIIIIIIIIIlIII, final int llllllllllllIllIlIlIIIIIIIIIIlll) {
        return llllllllllllIllIlIlIIIIIIIIIlIII < llllllllllllIllIlIlIIIIIIIIIIlll;
    }
    
    private static void lIIlIlIIlIlllllI() {
        (llIlIlIllllIII = new int[6])[0] = ((0x61 ^ 0x41) & ~(0x36 ^ 0x16));
        SocksRequestType.llIlIlIllllIII[1] = " ".length();
        SocksRequestType.llIlIlIllllIII[2] = "  ".length();
        SocksRequestType.llIlIlIllllIII[3] = "   ".length();
        SocksRequestType.llIlIlIllllIII[4] = (0x7 ^ 0x3);
        SocksRequestType.llIlIlIllllIII[5] = (0x0 ^ 0x21 ^ (0x1F ^ 0x36));
    }
    
    static {
        lIIlIlIIlIlllllI();
        lIIlIlIIlIllllIl();
        final SocksRequestType[] $values = new SocksRequestType[SocksRequestType.llIlIlIllllIII[4]];
        $values[SocksRequestType.llIlIlIllllIII[0]] = SocksRequestType.INIT;
        $values[SocksRequestType.llIlIlIllllIII[1]] = SocksRequestType.AUTH;
        $values[SocksRequestType.llIlIlIllllIII[2]] = SocksRequestType.CMD;
        $values[SocksRequestType.llIlIlIllllIII[3]] = SocksRequestType.UNKNOWN;
        $VALUES = $values;
    }
    
    private static void lIIlIlIIlIllllIl() {
        (llIlIlIlllIlll = new String[SocksRequestType.llIlIlIllllIII[4]])[SocksRequestType.llIlIlIllllIII[0]] = lIIlIlIIlIlllIlI("Ly8IDg==", "faAZj");
        SocksRequestType.llIlIlIlllIlll[SocksRequestType.llIlIlIllllIII[1]] = lIIlIlIIlIlllIll("dhthICYmHlg=", "qObcS");
        SocksRequestType.llIlIlIlllIlll[SocksRequestType.llIlIlIllllIII[2]] = lIIlIlIIlIllllII("Q9VX/hIslSo=", "sqqaZ");
        SocksRequestType.llIlIlIlllIlll[SocksRequestType.llIlIlIllllIII[3]] = lIIlIlIIlIlllIlI("DQk7KDoPCQ==", "XGpfu");
    }
}
