// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum SocksProtocolVersion
{
    SOCKS4a((byte)SocksProtocolVersion.lIllIIllIIlIII[1]), 
    UNKNOWN((byte)SocksProtocolVersion.lIllIIllIIlIII[5]);
    
    private final /* synthetic */ byte b;
    private static final /* synthetic */ int[] lIllIIllIIlIII;
    
    SOCKS5((byte)SocksProtocolVersion.lIllIIllIIlIII[3]);
    
    private static final /* synthetic */ String[] lIllIIllIIIllI;
    
    static {
        lllllIlIlIIIlIl();
        lllllIlIlIIIIlI();
        final SocksProtocolVersion[] $values = new SocksProtocolVersion[SocksProtocolVersion.lIllIIllIIlIII[6]];
        $values[SocksProtocolVersion.lIllIIllIIlIII[0]] = SocksProtocolVersion.SOCKS4a;
        $values[SocksProtocolVersion.lIllIIllIIlIII[2]] = SocksProtocolVersion.SOCKS5;
        $values[SocksProtocolVersion.lIllIIllIIlIII[4]] = SocksProtocolVersion.UNKNOWN;
        $VALUES = $values;
    }
    
    public static SocksProtocolVersion valueOf(final byte lllllllllllllIIIIIIllIlIIlIIlIlI) {
        final SocksProtocolVersion[] lllllllllllllIIIIIIllIlIIlIIllIl = values();
        final int lllllllllllllIIIIIIllIlIIlIIllII = lllllllllllllIIIIIIllIlIIlIIllIl.length;
        int lllllllllllllIIIIIIllIlIIlIIlIll = SocksProtocolVersion.lIllIIllIIlIII[0];
        while (lllllIlIlIIIllI(lllllllllllllIIIIIIllIlIIlIIlIll, lllllllllllllIIIIIIllIlIIlIIllII)) {
            final SocksProtocolVersion lllllllllllllIIIIIIllIlIIlIIlllI = lllllllllllllIIIIIIllIlIIlIIllIl[lllllllllllllIIIIIIllIlIIlIIlIll];
            if (lllllIlIlIIIlll(lllllllllllllIIIIIIllIlIIlIIlllI.b, lllllllllllllIIIIIIllIlIIlIIlIlI)) {
                return lllllllllllllIIIIIIllIlIIlIIlllI;
            }
            ++lllllllllllllIIIIIIllIlIIlIIlIll;
            "".length();
            if (-(0x60 ^ 0x64) >= 0) {
                return null;
            }
        }
        return SocksProtocolVersion.UNKNOWN;
    }
    
    private static void lllllIlIlIIIIlI() {
        (lIllIIllIIIllI = new String[SocksProtocolVersion.lIllIIllIIlIII[6]])[SocksProtocolVersion.lIllIIllIIlIII[0]] = lllllIlIlIIIIII("3rFT45asME8=", "AKgWp");
        SocksProtocolVersion.lIllIIllIIIllI[SocksProtocolVersion.lIllIIllIIlIII[2]] = lllllIlIlIIIIII("hM4PzXtHJOE=", "cUPqP");
        SocksProtocolVersion.lIllIIllIIIllI[SocksProtocolVersion.lIllIIllIIlIII[4]] = lllllIlIlIIIIIl("UMDnMF0kd10=", "nswYe");
    }
    
    private SocksProtocolVersion(final byte lllllllllllllIIIIIIllIlIIlIllIll) {
        this.b = lllllllllllllIIIIIIllIlIIlIllIll;
    }
    
    private static boolean lllllIlIlIIIlll(final int lllllllllllllIIIIIIllIlIIIlIIlIl, final int lllllllllllllIIIIIIllIlIIIlIIlII) {
        return lllllllllllllIIIIIIllIlIIIlIIlIl == lllllllllllllIIIIIIllIlIIIlIIlII;
    }
    
    private static boolean lllllIlIlIIIllI(final int lllllllllllllIIIIIIllIlIIIlIIIIl, final int lllllllllllllIIIIIIllIlIIIlIIIII) {
        return lllllllllllllIIIIIIllIlIIIlIIIIl < lllllllllllllIIIIIIllIlIIIlIIIII;
    }
    
    public byte byteValue() {
        return this.b;
    }
    
    private static void lllllIlIlIIIlIl() {
        (lIllIIllIIlIII = new int[8])[0] = ((93 + 134 - 168 + 85 ^ 84 + 125 - 175 + 135) & (0xB5 ^ 0xA9 ^ (0x2 ^ 0x27) ^ -" ".length()));
        SocksProtocolVersion.lIllIIllIIlIII[1] = (0xCC ^ 0xC0 ^ (0x39 ^ 0x31));
        SocksProtocolVersion.lIllIIllIIlIII[2] = " ".length();
        SocksProtocolVersion.lIllIIllIIlIII[3] = (0xE0 ^ 0x97 ^ (0x1F ^ 0x6D));
        SocksProtocolVersion.lIllIIllIIlIII[4] = "  ".length();
        SocksProtocolVersion.lIllIIllIIlIII[5] = -" ".length();
        SocksProtocolVersion.lIllIIllIIlIII[6] = "   ".length();
        SocksProtocolVersion.lIllIIllIIlIII[7] = (0x68 ^ 0x60);
    }
    
    private static String lllllIlIlIIIIIl(final String lllllllllllllIIIIIIllIlIIIlllIlI, final String lllllllllllllIIIIIIllIlIIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIlIIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIllIlIIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIllIlIIIllllII.init(SocksProtocolVersion.lIllIIllIIlIII[4], lllllllllllllIIIIIIllIlIIIllllIl);
            return new String(lllllllllllllIIIIIIllIlIIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIlIIIlllIll) {
            lllllllllllllIIIIIIllIlIIIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static String lllllIlIlIIIIII(final String lllllllllllllIIIIIIllIlIIIlIllIl, final String lllllllllllllIIIIIIllIlIIIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIlIIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), SocksProtocolVersion.lIllIIllIIlIII[7]), "DES");
            final Cipher lllllllllllllIIIIIIllIlIIIlIllll = Cipher.getInstance("DES");
            lllllllllllllIIIIIIllIlIIIlIllll.init(SocksProtocolVersion.lIllIIllIIlIII[4], lllllllllllllIIIIIIllIlIIIllIIII);
            return new String(lllllllllllllIIIIIIllIlIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIlIIIlIlllI) {
            lllllllllllllIIIIIIllIlIIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    public static SocksProtocolVersion fromByte(final byte lllllllllllllIIIIIIllIlIIlIlIlIl) {
        return valueOf(lllllllllllllIIIIIIllIlIIlIlIlIl);
    }
}
