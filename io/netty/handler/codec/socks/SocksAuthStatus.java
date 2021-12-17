// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum SocksAuthStatus
{
    FAILURE((byte)SocksAuthStatus.lIlIIlllIllllI[2]);
    
    private final /* synthetic */ byte b;
    private static final /* synthetic */ int[] lIlIIlllIllllI;
    private static final /* synthetic */ String[] lIlIIlllIlllIl;
    
    SUCCESS((byte)SocksAuthStatus.lIlIIlllIllllI[0]);
    
    public static SocksAuthStatus valueOf(final byte lllllllllllllIIIlIllllIIllIlllll) {
        final SocksAuthStatus[] lllllllllllllIIIlIllllIIlllIIIlI = values();
        final int lllllllllllllIIIlIllllIIlllIIIIl = lllllllllllllIIIlIllllIIlllIIIlI.length;
        int lllllllllllllIIIlIllllIIlllIIIII = SocksAuthStatus.lIlIIlllIllllI[0];
        while (lllIlIIllIIllII(lllllllllllllIIIlIllllIIlllIIIII, lllllllllllllIIIlIllllIIlllIIIIl)) {
            final SocksAuthStatus lllllllllllllIIIlIllllIIlllIIIll = lllllllllllllIIIlIllllIIlllIIIlI[lllllllllllllIIIlIllllIIlllIIIII];
            if (lllIlIIllIIllIl(lllllllllllllIIIlIllllIIlllIIIll.b, lllllllllllllIIIlIllllIIllIlllll)) {
                return lllllllllllllIIIlIllllIIlllIIIll;
            }
            ++lllllllllllllIIIlIllllIIlllIIIII;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return SocksAuthStatus.FAILURE;
    }
    
    private SocksAuthStatus(final byte lllllllllllllIIIlIllllIIlllIllII) {
        this.b = lllllllllllllIIIlIllllIIlllIllII;
    }
    
    private static void lllIlIIllIIlIIl() {
        (lIlIIlllIlllIl = new String[SocksAuthStatus.lIlIIlllIllllI[3]])[SocksAuthStatus.lIlIIlllIllllI[0]] = lllIlIIllIIIlll("IxgCEhQjHg==", "pMAQQ");
        SocksAuthStatus.lIlIIlllIlllIl[SocksAuthStatus.lIlIIlllIllllI[1]] = lllIlIIllIIlIII("7YYM6aX4+yY=", "WBtVz");
    }
    
    private static boolean lllIlIIllIIllII(final int lllllllllllllIIIlIllllIIlIlIlIll, final int lllllllllllllIIIlIllllIIlIlIlIlI) {
        return lllllllllllllIIIlIllllIIlIlIlIll < lllllllllllllIIIlIllllIIlIlIlIlI;
    }
    
    private static String lllIlIIllIIIlll(String lllllllllllllIIIlIllllIIlIlllIlI, final String lllllllllllllIIIlIllllIIlIlllllI) {
        lllllllllllllIIIlIllllIIlIlllIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIllllIIlIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllllIIlIllllIl = new StringBuilder();
        final char[] lllllllllllllIIIlIllllIIlIllllII = lllllllllllllIIIlIllllIIlIlllllI.toCharArray();
        int lllllllllllllIIIlIllllIIlIlllIll = SocksAuthStatus.lIlIIlllIllllI[0];
        final char lllllllllllllIIIlIllllIIlIllIlIl = (Object)((String)lllllllllllllIIIlIllllIIlIlllIlI).toCharArray();
        final short lllllllllllllIIIlIllllIIlIllIlII = (short)lllllllllllllIIIlIllllIIlIllIlIl.length;
        float lllllllllllllIIIlIllllIIlIllIIll = SocksAuthStatus.lIlIIlllIllllI[0];
        while (lllIlIIllIIllII((int)lllllllllllllIIIlIllllIIlIllIIll, lllllllllllllIIIlIllllIIlIllIlII)) {
            final char lllllllllllllIIIlIllllIIllIIIIII = lllllllllllllIIIlIllllIIlIllIlIl[lllllllllllllIIIlIllllIIlIllIIll];
            lllllllllllllIIIlIllllIIlIllllIl.append((char)(lllllllllllllIIIlIllllIIllIIIIII ^ lllllllllllllIIIlIllllIIlIllllII[lllllllllllllIIIlIllllIIlIlllIll % lllllllllllllIIIlIllllIIlIllllII.length]));
            "".length();
            ++lllllllllllllIIIlIllllIIlIlllIll;
            ++lllllllllllllIIIlIllllIIlIllIIll;
            "".length();
            if ((0x24 ^ 0x20) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllllIIlIllllIl);
    }
    
    private static void lllIlIIllIIlIll() {
        (lIlIIlllIllllI = new int[5])[0] = ("  ".length() & ~"  ".length());
        SocksAuthStatus.lIlIIlllIllllI[1] = " ".length();
        SocksAuthStatus.lIlIIlllIllllI[2] = -" ".length();
        SocksAuthStatus.lIlIIlllIllllI[3] = "  ".length();
        SocksAuthStatus.lIlIIlllIllllI[4] = (0x84 ^ 0x8C);
    }
    
    static {
        lllIlIIllIIlIll();
        lllIlIIllIIlIIl();
        final SocksAuthStatus[] $values = new SocksAuthStatus[SocksAuthStatus.lIlIIlllIllllI[3]];
        $values[SocksAuthStatus.lIlIIlllIllllI[0]] = SocksAuthStatus.SUCCESS;
        $values[SocksAuthStatus.lIlIIlllIllllI[1]] = SocksAuthStatus.FAILURE;
        $VALUES = $values;
    }
    
    private static String lllIlIIllIIlIII(final String lllllllllllllIIIlIllllIIllIIllIl, final String lllllllllllllIIIlIllllIIllIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllllIIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllllIIllIIllII.getBytes(StandardCharsets.UTF_8)), SocksAuthStatus.lIlIIlllIllllI[4]), "DES");
            final Cipher lllllllllllllIIIlIllllIIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIllllIIllIlIIIl.init(SocksAuthStatus.lIlIIlllIllllI[3], lllllllllllllIIIlIllllIIllIlIIlI);
            return new String(lllllllllllllIIIlIllllIIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllllIIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllllIIllIlIIII) {
            lllllllllllllIIIlIllllIIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    public static SocksAuthStatus fromByte(final byte lllllllllllllIIIlIllllIIlllIlIIl) {
        return valueOf(lllllllllllllIIIlIllllIIlllIlIIl);
    }
    
    private static boolean lllIlIIllIIllIl(final int lllllllllllllIIIlIllllIIlIlIllll, final int lllllllllllllIIIlIllllIIlIlIlllI) {
        return lllllllllllllIIIlIllllIIlIlIllll == lllllllllllllIIIlIllllIIlIlIlllI;
    }
    
    public byte byteValue() {
        return this.b;
    }
}
