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

public enum SocksSubnegotiationVersion
{
    UNKNOWN((byte)SocksSubnegotiationVersion.lIIlIlllIlIllI[2]);
    
    private static final /* synthetic */ String[] lIIlIllIlllllI;
    private static final /* synthetic */ int[] lIIlIlllIlIllI;
    private final /* synthetic */ byte b;
    
    AUTH_PASSWORD((byte)SocksSubnegotiationVersion.lIIlIlllIlIllI[1]);
    
    private static String llIlIIllIllllII(final String lllllllllllllIIllIIIIIlIlIIlIlll, final String lllllllllllllIIllIIIIIlIlIIllIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIIlIlIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), SocksSubnegotiationVersion.lIIlIlllIlIllI[4]), "DES");
            final Cipher lllllllllllllIIllIIIIIlIlIIllIll = Cipher.getInstance("DES");
            lllllllllllllIIllIIIIIlIlIIllIll.init(SocksSubnegotiationVersion.lIIlIlllIlIllI[3], lllllllllllllIIllIIIIIlIlIIlllII);
            return new String(lllllllllllllIIllIIIIIlIlIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIlIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIIlIlIIllIlI) {
            lllllllllllllIIllIIIIIlIlIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlIIIIIIIll() {
        (lIIlIlllIlIllI = new int[5])[0] = ((229 + 110 - 232 + 131 ^ 141 + 41 - 17 + 25) & (109 + 174 - 212 + 169 ^ 31 + 17 + 97 + 15 ^ -" ".length()));
        SocksSubnegotiationVersion.lIIlIlllIlIllI[1] = " ".length();
        SocksSubnegotiationVersion.lIIlIlllIlIllI[2] = -" ".length();
        SocksSubnegotiationVersion.lIIlIlllIlIllI[3] = "  ".length();
        SocksSubnegotiationVersion.lIIlIlllIlIllI[4] = (0xC ^ 0x4);
    }
    
    static {
        llIlIlIIIIIIIll();
        llIlIIllIllllIl();
        final SocksSubnegotiationVersion[] $values = new SocksSubnegotiationVersion[SocksSubnegotiationVersion.lIIlIlllIlIllI[3]];
        $values[SocksSubnegotiationVersion.lIIlIlllIlIllI[0]] = SocksSubnegotiationVersion.AUTH_PASSWORD;
        $values[SocksSubnegotiationVersion.lIIlIlllIlIllI[1]] = SocksSubnegotiationVersion.UNKNOWN;
        $VALUES = $values;
    }
    
    private static boolean llIlIlIIIIIIlII(final int lllllllllllllIIllIIIIIlIlIIIllIl, final int lllllllllllllIIllIIIIIlIlIIIllII) {
        return lllllllllllllIIllIIIIIlIlIIIllIl < lllllllllllllIIllIIIIIlIlIIIllII;
    }
    
    public static SocksSubnegotiationVersion valueOf(final byte lllllllllllllIIllIIIIIlIllIIIIIl) {
        final SocksSubnegotiationVersion[] lllllllllllllIIllIIIIIlIllIIIlII = values();
        final int lllllllllllllIIllIIIIIlIllIIIIll = lllllllllllllIIllIIIIIlIllIIIlII.length;
        int lllllllllllllIIllIIIIIlIllIIIIlI = SocksSubnegotiationVersion.lIIlIlllIlIllI[0];
        while (llIlIlIIIIIIlII(lllllllllllllIIllIIIIIlIllIIIIlI, lllllllllllllIIllIIIIIlIllIIIIll)) {
            final SocksSubnegotiationVersion lllllllllllllIIllIIIIIlIllIIIlIl = lllllllllllllIIllIIIIIlIllIIIlII[lllllllllllllIIllIIIIIlIllIIIIlI];
            if (llIlIlIIIIIIlIl(lllllllllllllIIllIIIIIlIllIIIlIl.b, lllllllllllllIIllIIIIIlIllIIIIIl)) {
                return lllllllllllllIIllIIIIIlIllIIIlIl;
            }
            ++lllllllllllllIIllIIIIIlIllIIIIlI;
            "".length();
            if ((165 + 168 - 147 + 7 ^ 5 + 45 + 120 + 27) <= 0) {
                return null;
            }
        }
        return SocksSubnegotiationVersion.UNKNOWN;
    }
    
    private SocksSubnegotiationVersion(final byte lllllllllllllIIllIIIIIlIllIlIIlI) {
        this.b = lllllllllllllIIllIIIIIlIllIlIIlI;
    }
    
    private static String llIlIIllIlllIll(String lllllllllllllIIllIIIIIlIlIlIlIIl, final String lllllllllllllIIllIIIIIlIlIlIlIII) {
        lllllllllllllIIllIIIIIlIlIlIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIIIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIIIlIlIlIllII = new StringBuilder();
        final char[] lllllllllllllIIllIIIIIlIlIlIlIll = lllllllllllllIIllIIIIIlIlIlIlIII.toCharArray();
        int lllllllllllllIIllIIIIIlIlIlIlIlI = SocksSubnegotiationVersion.lIIlIlllIlIllI[0];
        final double lllllllllllllIIllIIIIIlIlIlIIlII = (Object)lllllllllllllIIllIIIIIlIlIlIlIIl.toCharArray();
        final long lllllllllllllIIllIIIIIlIlIlIIIll = lllllllllllllIIllIIIIIlIlIlIIlII.length;
        short lllllllllllllIIllIIIIIlIlIlIIIlI = (short)SocksSubnegotiationVersion.lIIlIlllIlIllI[0];
        while (llIlIlIIIIIIlII(lllllllllllllIIllIIIIIlIlIlIIIlI, (int)lllllllllllllIIllIIIIIlIlIlIIIll)) {
            final char lllllllllllllIIllIIIIIlIlIlIllll = lllllllllllllIIllIIIIIlIlIlIIlII[lllllllllllllIIllIIIIIlIlIlIIIlI];
            lllllllllllllIIllIIIIIlIlIlIllII.append((char)(lllllllllllllIIllIIIIIlIlIlIllll ^ lllllllllllllIIllIIIIIlIlIlIlIll[lllllllllllllIIllIIIIIlIlIlIlIlI % lllllllllllllIIllIIIIIlIlIlIlIll.length]));
            "".length();
            ++lllllllllllllIIllIIIIIlIlIlIlIlI;
            ++lllllllllllllIIllIIIIIlIlIlIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIIIlIlIlIllII);
    }
    
    private static boolean llIlIlIIIIIIlIl(final int lllllllllllllIIllIIIIIlIlIIlIIIl, final int lllllllllllllIIllIIIIIlIlIIlIIII) {
        return lllllllllllllIIllIIIIIlIlIIlIIIl == lllllllllllllIIllIIIIIlIlIIlIIII;
    }
    
    private static void llIlIIllIllllIl() {
        (lIIlIllIlllllI = new String[SocksSubnegotiationVersion.lIIlIlllIlIllI[3]])[SocksSubnegotiationVersion.lIIlIlllIlIllI[0]] = llIlIIllIlllIll("OxcAICcqAwc7LzUQEA==", "zBThx");
        SocksSubnegotiationVersion.lIIlIllIlllllI[SocksSubnegotiationVersion.lIIlIlllIlIllI[1]] = llIlIIllIllllII("UEfntzv1Kuk=", "LrfDE");
    }
    
    @Deprecated
    public static SocksSubnegotiationVersion fromByte(final byte lllllllllllllIIllIIIIIlIllIIlIll) {
        return valueOf(lllllllllllllIIllIIIIIlIllIIlIll);
    }
    
    public byte byteValue() {
        return this.b;
    }
}
