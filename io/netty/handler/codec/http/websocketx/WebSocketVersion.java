// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum WebSocketVersion
{
    private static final /* synthetic */ String[] lIlIIlIIllIllI;
    
    V13, 
    V08, 
    UNKNOWN, 
    V00;
    
    private static final /* synthetic */ int[] lIlIIlIIlllIII;
    
    V07;
    
    private static void lllIIlIllIlIIIl() {
        (lIlIIlIIllIllI = new String[WebSocketVersion.lIlIIlIIlllIII[10]])[WebSocketVersion.lIlIIlIIlllIII[0]] = lllIIlIllIIlllI("opQqRfmdeSE=", "hWoCA");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[1]] = lllIIlIllIIllll("eQ==", "NzGxF");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[2]] = lllIIlIllIIlllI("v03+Np+0kxA=", "xrhnl");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[3]] = lllIIlIllIlIIII("vaqj92dz/Uw=", "qfLkk");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[4]] = lllIIlIllIlIIII("T9VuM4VIyhDbxVrq59G2+5V9301ZtPFAYEStb5w81Uw=", "YWZZf");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[5]] = lllIIlIllIIlllI("t/yGz85JtX4=", "jlXkm");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[6]] = lllIIlIllIlIIII("Ay+Jl6vMtNI=", "ZTmAS");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[7]] = lllIIlIllIIlllI("5wxXLme9zOc=", "HkuRA");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[8]] = lllIIlIllIIlllI("ZUS58EXTT9Y=", "OOAsA");
        WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[9]] = lllIIlIllIIllll("GHBh", "NARMf");
    }
    
    static {
        lllIIlIllIlIlII();
        lllIIlIllIlIIIl();
        final WebSocketVersion[] $values = new WebSocketVersion[WebSocketVersion.lIlIIlIIlllIII[5]];
        $values[WebSocketVersion.lIlIIlIIlllIII[0]] = WebSocketVersion.UNKNOWN;
        $values[WebSocketVersion.lIlIIlIIlllIII[1]] = WebSocketVersion.V00;
        $values[WebSocketVersion.lIlIIlIIlllIII[2]] = WebSocketVersion.V07;
        $values[WebSocketVersion.lIlIIlIIlllIII[3]] = WebSocketVersion.V08;
        $values[WebSocketVersion.lIlIIlIIlllIII[4]] = WebSocketVersion.V13;
        $VALUES = $values;
    }
    
    private static boolean lllIIlIllIlIllI(final int lllllllllllllIIIlllIIIIIllIllIll, final int lllllllllllllIIIlllIIIIIllIllIlI) {
        return lllllllllllllIIIlllIIIIIllIllIll < lllllllllllllIIIlllIIIIIllIllIlI;
    }
    
    private static String lllIIlIllIIllll(String lllllllllllllIIIlllIIIIlIIIIIIII, final String lllllllllllllIIIlllIIIIlIIIIIlII) {
        lllllllllllllIIIlllIIIIlIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIIIlIIIIIIll = new StringBuilder();
        final char[] lllllllllllllIIIlllIIIIlIIIIIIlI = lllllllllllllIIIlllIIIIlIIIIIlII.toCharArray();
        int lllllllllllllIIIlllIIIIlIIIIIIIl = WebSocketVersion.lIlIIlIIlllIII[0];
        final char lllllllllllllIIIlllIIIIIlllllIll = (Object)lllllllllllllIIIlllIIIIlIIIIIIII.toCharArray();
        final int lllllllllllllIIIlllIIIIIlllllIlI = lllllllllllllIIIlllIIIIIlllllIll.length;
        int lllllllllllllIIIlllIIIIIlllllIIl = WebSocketVersion.lIlIIlIIlllIII[0];
        while (lllIIlIllIlIllI(lllllllllllllIIIlllIIIIIlllllIIl, lllllllllllllIIIlllIIIIIlllllIlI)) {
            final char lllllllllllllIIIlllIIIIlIIIIIllI = lllllllllllllIIIlllIIIIIlllllIll[lllllllllllllIIIlllIIIIIlllllIIl];
            lllllllllllllIIIlllIIIIlIIIIIIll.append((char)(lllllllllllllIIIlllIIIIlIIIIIllI ^ lllllllllllllIIIlllIIIIlIIIIIIlI[lllllllllllllIIIlllIIIIlIIIIIIIl % lllllllllllllIIIlllIIIIlIIIIIIlI.length]));
            "".length();
            ++lllllllllllllIIIlllIIIIlIIIIIIIl;
            ++lllllllllllllIIIlllIIIIIlllllIIl;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIIIlIIIIIIll);
    }
    
    private static String lllIIlIllIlIIII(final String lllllllllllllIIIlllIIIIIlllIIIll, final String lllllllllllllIIIlllIIIIIlllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIIIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIIIIlllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIIIIlllIIlIl.init(WebSocketVersion.lIlIIlIIlllIII[2], lllllllllllllIIIlllIIIIIlllIIllI);
            return new String(lllllllllllllIIIlllIIIIIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIIIIlllIIlII) {
            lllllllllllllIIIlllIIIIIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIlIllIIlllI(final String lllllllllllllIIIlllIIIIIlllIlllI, final String lllllllllllllIIIlllIIIIIlllIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIIIIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIIIIlllIllIl.getBytes(StandardCharsets.UTF_8)), WebSocketVersion.lIlIIlIIlllIII[8]), "DES");
            final Cipher lllllllllllllIIIlllIIIIIllllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIIIIllllIIlI.init(WebSocketVersion.lIlIIlIIlllIII[2], lllllllllllllIIIlllIIIIIllllIIll);
            return new String(lllllllllllllIIIlllIIIIIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIIIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIIIIllllIIIl) {
            lllllllllllllIIIlllIIIIIllllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIlIllIlIlII() {
        (lIlIIlIIlllIII = new int[11])[0] = ((0x3A ^ 0x13) & ~(0x83 ^ 0xAA));
        WebSocketVersion.lIlIIlIIlllIII[1] = " ".length();
        WebSocketVersion.lIlIIlIIlllIII[2] = "  ".length();
        WebSocketVersion.lIlIIlIIlllIII[3] = "   ".length();
        WebSocketVersion.lIlIIlIIlllIII[4] = (55 + 89 + 1 + 36 ^ 150 + 47 - 175 + 155);
        WebSocketVersion.lIlIIlIIlllIII[5] = (0x4E ^ 0x7C ^ (0x32 ^ 0x5));
        WebSocketVersion.lIlIIlIIlllIII[6] = (0x3E ^ 0x38);
        WebSocketVersion.lIlIIlIIlllIII[7] = (0x9B ^ 0x9C);
        WebSocketVersion.lIlIIlIIlllIII[8] = (0x6A ^ 0x5C ^ (0x6C ^ 0x52));
        WebSocketVersion.lIlIIlIIlllIII[9] = (123 + 144 - 194 + 109 ^ 131 + 60 - 137 + 137);
        WebSocketVersion.lIlIIlIIlllIII[10] = (0x82 ^ 0xB2 ^ (0xBE ^ 0x84));
    }
    
    public String toHttpHeaderValue() {
        if (lllIIlIllIlIlIl(this, WebSocketVersion.V00)) {
            return WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[0]];
        }
        if (lllIIlIllIlIlIl(this, WebSocketVersion.V07)) {
            return WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[1]];
        }
        if (lllIIlIllIlIlIl(this, WebSocketVersion.V08)) {
            return WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[2]];
        }
        if (lllIIlIllIlIlIl(this, WebSocketVersion.V13)) {
            return WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[3]];
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(WebSocketVersion.lIlIIlIIllIllI[WebSocketVersion.lIlIIlIIlllIII[4]]).append(this)));
    }
    
    private static boolean lllIIlIllIlIlIl(final Object lllllllllllllIIIlllIIIIIllIlIlll, final Object lllllllllllllIIIlllIIIIIllIlIllI) {
        return lllllllllllllIIIlllIIIIIllIlIlll == lllllllllllllIIIlllIIIIIllIlIllI;
    }
}
