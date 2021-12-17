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

public enum SocksAddressType
{
    IPv4((byte)SocksAddressType.lIIIIllIIlIllI[1]);
    
    private static final /* synthetic */ String[] lIIIIllIIIllIl;
    
    UNKNOWN((byte)SocksAddressType.lIIIIllIIlIllI[5]), 
    IPv6((byte)SocksAddressType.lIIIIllIIlIllI[4]);
    
    private final /* synthetic */ byte b;
    
    DOMAIN((byte)SocksAddressType.lIIIIllIIlIllI[2]);
    
    private static final /* synthetic */ int[] lIIIIllIIlIllI;
    
    private static void lIlllIllIIIllIl() {
        (lIIIIllIIIllIl = new String[SocksAddressType.lIIIIllIIlIllI[4]])[SocksAddressType.lIIIIllIIlIllI[0]] = lIlllIllIIIIIlI("KwtnApIsISM=", "NvKYx");
        SocksAddressType.lIIIIllIIIllIl[SocksAddressType.lIIIIllIIlIllI[1]] = lIlllIllIIIIIlI("HNcb9uCXZiU=", "lfhoe");
        SocksAddressType.lIIIIllIIIllIl[SocksAddressType.lIIIIllIIlIllI[3]] = lIlllIllIIIIlII("AM4vS82wVJE=", "EZWrn");
        SocksAddressType.lIIIIllIIIllIl[SocksAddressType.lIIIIllIIlIllI[2]] = lIlllIllIIIIlII("Kbd7EobobEw=", "pWxJr");
    }
    
    public static SocksAddressType valueOf(final byte lllllllllllllIlIIlIIllIlllIllIlI) {
        final SocksAddressType[] lllllllllllllIlIIlIIllIlllIlllIl = values();
        final int lllllllllllllIlIIlIIllIlllIlllII = lllllllllllllIlIIlIIllIlllIlllIl.length;
        int lllllllllllllIlIIlIIllIlllIllIll = SocksAddressType.lIIIIllIIlIllI[0];
        while (lIlllIllIIlllll(lllllllllllllIlIIlIIllIlllIllIll, lllllllllllllIlIIlIIllIlllIlllII)) {
            final SocksAddressType lllllllllllllIlIIlIIllIlllIllllI = lllllllllllllIlIIlIIllIlllIlllIl[lllllllllllllIlIIlIIllIlllIllIll];
            if (lIlllIllIlIIIII(lllllllllllllIlIIlIIllIlllIllllI.b, lllllllllllllIlIIlIIllIlllIllIlI)) {
                return lllllllllllllIlIIlIIllIlllIllllI;
            }
            ++lllllllllllllIlIIlIIllIlllIllIll;
            "".length();
            if ((0x9F ^ 0xC4 ^ (0xE5 ^ 0xBA)) <= ((50 + 136 - 162 + 117 ^ 118 + 154 - 128 + 50) & (0x3E ^ 0x14 ^ (0xA2 ^ 0xC7) ^ -" ".length()))) {
                return null;
            }
        }
        return SocksAddressType.UNKNOWN;
    }
    
    private static boolean lIlllIllIlIIIII(final int lllllllllllllIlIIlIIllIllIllIlIl, final int lllllllllllllIlIIlIIllIllIllIlII) {
        return lllllllllllllIlIIlIIllIllIllIlIl == lllllllllllllIlIIlIIllIllIllIlII;
    }
    
    static {
        lIlllIllIIllllI();
        lIlllIllIIIllIl();
        final SocksAddressType[] $values = new SocksAddressType[SocksAddressType.lIIIIllIIlIllI[4]];
        $values[SocksAddressType.lIIIIllIIlIllI[0]] = SocksAddressType.IPv4;
        $values[SocksAddressType.lIIIIllIIlIllI[1]] = SocksAddressType.DOMAIN;
        $values[SocksAddressType.lIIIIllIIlIllI[3]] = SocksAddressType.IPv6;
        $values[SocksAddressType.lIIIIllIIlIllI[2]] = SocksAddressType.UNKNOWN;
        $VALUES = $values;
    }
    
    private static String lIlllIllIIIIlII(final String lllllllllllllIlIIlIIllIllIllllIl, final String lllllllllllllIlIIlIIllIllIllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllIlllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIllIllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIllIllIllllll.init(SocksAddressType.lIIIIllIIlIllI[3], lllllllllllllIlIIlIIllIlllIIIIII);
            return new String(lllllllllllllIlIIlIIllIllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllIllIlllllI) {
            lllllllllllllIlIIlIIllIllIlllllI.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    public static SocksAddressType fromByte(final byte lllllllllllllIlIIlIIllIllllIIlII) {
        return valueOf(lllllllllllllIlIIlIIllIllllIIlII);
    }
    
    public byte byteValue() {
        return this.b;
    }
    
    private SocksAddressType(final byte lllllllllllllIlIIlIIllIllllIIlll) {
        this.b = lllllllllllllIlIIlIIllIllllIIlll;
    }
    
    private static void lIlllIllIIllllI() {
        (lIIIIllIIlIllI = new int[7])[0] = ((0x7C ^ 0x35) & ~(0xE8 ^ 0xA1));
        SocksAddressType.lIIIIllIIlIllI[1] = " ".length();
        SocksAddressType.lIIIIllIIlIllI[2] = "   ".length();
        SocksAddressType.lIIIIllIIlIllI[3] = "  ".length();
        SocksAddressType.lIIIIllIIlIllI[4] = (0x77 ^ 0x73);
        SocksAddressType.lIIIIllIIlIllI[5] = -" ".length();
        SocksAddressType.lIIIIllIIlIllI[6] = (0x5B ^ 0x53);
    }
    
    private static boolean lIlllIllIIlllll(final int lllllllllllllIlIIlIIllIllIllIIIl, final int lllllllllllllIlIIlIIllIllIllIIII) {
        return lllllllllllllIlIIlIIllIllIllIIIl < lllllllllllllIlIIlIIllIllIllIIII;
    }
    
    private static String lIlllIllIIIIIlI(final String lllllllllllllIlIIlIIllIlllIIlIlI, final String lllllllllllllIlIIlIIllIlllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), SocksAddressType.lIIIIllIIlIllI[6]), "DES");
            final Cipher lllllllllllllIlIIlIIllIlllIIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIllIlllIIllII.init(SocksAddressType.lIIIIllIIlIllI[3], lllllllllllllIlIIlIIllIlllIIllIl);
            return new String(lllllllllllllIlIIlIIllIlllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllIlllIIlIll) {
            lllllllllllllIlIIlIIllIlllIIlIll.printStackTrace();
            return null;
        }
    }
}
