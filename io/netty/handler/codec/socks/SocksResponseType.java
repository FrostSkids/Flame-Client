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

public enum SocksResponseType
{
    AUTH, 
    CMD;
    
    private static final /* synthetic */ int[] lIlIlllllIlIlI;
    
    INIT;
    
    private static final /* synthetic */ String[] lIlIlllllIIllI;
    
    UNKNOWN;
    
    private static String llllIlIlIIlIIII(final String lllllllllllllIIIIlIIlllIIlIIlllI, final String lllllllllllllIIIIlIIlllIIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlllIIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), SocksResponseType.lIlIlllllIlIlI[5]), "DES");
            final Cipher lllllllllllllIIIIlIIlllIIlIlIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlllIIlIlIIlI.init(SocksResponseType.lIlIlllllIlIlI[2], lllllllllllllIIIIlIIlllIIlIlIIll);
            return new String(lllllllllllllIIIIlIIlllIIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlllIIlIlIIIl) {
            lllllllllllllIIIIlIIlllIIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llllIlIlIIlIlIl();
        llllIlIlIIlIIIl();
        final SocksResponseType[] $values = new SocksResponseType[SocksResponseType.lIlIlllllIlIlI[4]];
        $values[SocksResponseType.lIlIlllllIlIlI[0]] = SocksResponseType.INIT;
        $values[SocksResponseType.lIlIlllllIlIlI[1]] = SocksResponseType.AUTH;
        $values[SocksResponseType.lIlIlllllIlIlI[2]] = SocksResponseType.CMD;
        $values[SocksResponseType.lIlIlllllIlIlI[3]] = SocksResponseType.UNKNOWN;
        $VALUES = $values;
    }
    
    private static void llllIlIlIIlIIIl() {
        (lIlIlllllIIllI = new String[SocksResponseType.lIlIlllllIlIlI[4]])[SocksResponseType.lIlIlllllIlIlI[0]] = llllIlIlIIIlllI("BCMvLA==", "Mmfxx");
        SocksResponseType.lIlIlllllIIllI[SocksResponseType.lIlIlllllIlIlI[1]] = llllIlIlIIIllll("4tn3gCVG7U8=", "hCubO");
        SocksResponseType.lIlIlllllIIllI[SocksResponseType.lIlIlllllIlIlI[2]] = llllIlIlIIIlllI("Lj8C", "mrFGo");
        SocksResponseType.lIlIlllllIIllI[SocksResponseType.lIlIlllllIlIlI[3]] = llllIlIlIIlIIII("i6hUPqaL1rc=", "UXSQb");
    }
    
    private static String llllIlIlIIIllll(final String lllllllllllllIIIIlIIlllIIlIIIIll, final String lllllllllllllIIIIlIIlllIIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlllIIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlllIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlllIIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlllIIlIIIlIl.init(SocksResponseType.lIlIlllllIlIlI[2], lllllllllllllIIIIlIIlllIIlIIIllI);
            return new String(lllllllllllllIIIIlIIlllIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlllIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlllIIlIIIlII) {
            lllllllllllllIIIIlIIlllIIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String llllIlIlIIIlllI(String lllllllllllllIIIIlIIlllIIIlIlllI, final String lllllllllllllIIIIlIIlllIIIlIllIl) {
        lllllllllllllIIIIlIIlllIIIlIlllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIlllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlllIIIllIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlllIIIllIIII = lllllllllllllIIIIlIIlllIIIlIllIl.toCharArray();
        int lllllllllllllIIIIlIIlllIIIlIllll = SocksResponseType.lIlIlllllIlIlI[0];
        final short lllllllllllllIIIIlIIlllIIIlIlIIl = (Object)lllllllllllllIIIIlIIlllIIIlIlllI.toCharArray();
        final long lllllllllllllIIIIlIIlllIIIlIlIII = lllllllllllllIIIIlIIlllIIIlIlIIl.length;
        long lllllllllllllIIIIlIIlllIIIlIIlll = SocksResponseType.lIlIlllllIlIlI[0];
        while (llllIlIlIIlIllI((int)lllllllllllllIIIIlIIlllIIIlIIlll, (int)lllllllllllllIIIIlIIlllIIIlIlIII)) {
            final char lllllllllllllIIIIlIIlllIIIllIlII = lllllllllllllIIIIlIIlllIIIlIlIIl[lllllllllllllIIIIlIIlllIIIlIIlll];
            lllllllllllllIIIIlIIlllIIIllIIIl.append((char)(lllllllllllllIIIIlIIlllIIIllIlII ^ lllllllllllllIIIIlIIlllIIIllIIII[lllllllllllllIIIIlIIlllIIIlIllll % lllllllllllllIIIIlIIlllIIIllIIII.length]));
            "".length();
            ++lllllllllllllIIIIlIIlllIIIlIllll;
            ++lllllllllllllIIIIlIIlllIIIlIIlll;
            "".length();
            if ((0x3A ^ 0x55 ^ (0xF5 ^ 0x9E)) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlllIIIllIIIl);
    }
    
    private static void llllIlIlIIlIlIl() {
        (lIlIlllllIlIlI = new int[6])[0] = ((0x1A ^ 0x22) & ~(0x4B ^ 0x73));
        SocksResponseType.lIlIlllllIlIlI[1] = " ".length();
        SocksResponseType.lIlIlllllIlIlI[2] = "  ".length();
        SocksResponseType.lIlIlllllIlIlI[3] = "   ".length();
        SocksResponseType.lIlIlllllIlIlI[4] = (12 + 72 + 56 + 1 ^ 88 + 58 - 26 + 17);
        SocksResponseType.lIlIlllllIlIlI[5] = (0xEF ^ 0xA5 ^ (0x3D ^ 0x7F));
    }
    
    private static boolean llllIlIlIIlIllI(final int lllllllllllllIIIIlIIlllIIIlIIIll, final int lllllllllllllIIIIlIIlllIIIlIIIlI) {
        return lllllllllllllIIIIlIIlllIIIlIIIll < lllllllllllllIIIIlIIlllIIIlIIIlI;
    }
}
