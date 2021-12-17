// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum ZlibWrapper
{
    private static final /* synthetic */ String[] llIlllIlIIIIll;
    
    NONE;
    
    private static final /* synthetic */ int[] llIlllIlIIIllI;
    
    GZIP, 
    ZLIB, 
    ZLIB_OR_NONE;
    
    static {
        lIIllIIllIIlllll();
        lIIllIIllIIllllI();
        final ZlibWrapper[] $values = new ZlibWrapper[ZlibWrapper.llIlllIlIIIllI[4]];
        $values[ZlibWrapper.llIlllIlIIIllI[0]] = ZlibWrapper.ZLIB;
        $values[ZlibWrapper.llIlllIlIIIllI[1]] = ZlibWrapper.GZIP;
        $values[ZlibWrapper.llIlllIlIIIllI[2]] = ZlibWrapper.NONE;
        $values[ZlibWrapper.llIlllIlIIIllI[3]] = ZlibWrapper.ZLIB_OR_NONE;
        $VALUES = $values;
    }
    
    private static void lIIllIIllIIllllI() {
        (llIlllIlIIIIll = new String[ZlibWrapper.llIlllIlIIIllI[4]])[ZlibWrapper.llIlllIlIIIllI[0]] = lIIllIIllIIllIIl("+4TcvS3WM1A=", "GamUH");
        ZlibWrapper.llIlllIlIIIIll[ZlibWrapper.llIlllIlIIIllI[1]] = lIIllIIllIIllIIl("XdZPp0r63/A=", "StnbJ");
        ZlibWrapper.llIlllIlIIIIll[ZlibWrapper.llIlllIlIIIllI[2]] = lIIllIIllIIllIIl("hd8GotOCeVM=", "XcxoE");
        ZlibWrapper.llIlllIlIIIIll[ZlibWrapper.llIlllIlIIIllI[3]] = lIIllIIllIIllIIl("oPMO3Ng6JRlmA2s3BRPPfg==", "fSotD");
    }
    
    private static String lIIllIIllIIllIIl(final String llllllllllllIllIIlIIlIlIlllIIllI, final String llllllllllllIllIIlIIlIlIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIlIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), ZlibWrapper.llIlllIlIIIllI[5]), "DES");
            final Cipher llllllllllllIllIIlIIlIlIlllIlIII = Cipher.getInstance("DES");
            llllllllllllIllIIlIIlIlIlllIlIII.init(ZlibWrapper.llIlllIlIIIllI[2], llllllllllllIllIIlIIlIlIlllIlIIl);
            return new String(llllllllllllIllIIlIIlIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIlIlllIIlll) {
            llllllllllllIllIIlIIlIlIlllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIIllIIlllll() {
        (llIlllIlIIIllI = new int[6])[0] = ((0x1F ^ 0x59 ^ (0x89 ^ 0xAF)) & (0xAB ^ 0x94 ^ (0xCB ^ 0x94) ^ -" ".length()));
        ZlibWrapper.llIlllIlIIIllI[1] = " ".length();
        ZlibWrapper.llIlllIlIIIllI[2] = "  ".length();
        ZlibWrapper.llIlllIlIIIllI[3] = "   ".length();
        ZlibWrapper.llIlllIlIIIllI[4] = (0x21 ^ 0x25);
        ZlibWrapper.llIlllIlIIIllI[5] = (0x98 ^ 0x90);
    }
}
