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

public enum SocksAuthScheme
{
    AUTH_GSSAPI((byte)SocksAuthScheme.lIIlIllIIllllI[1]), 
    UNKNOWN((byte)SocksAuthScheme.lIIlIllIIllllI[4]), 
    AUTH_PASSWORD((byte)SocksAuthScheme.lIIlIllIIllllI[2]);
    
    private static final /* synthetic */ String[] lIIlIllIIlllIl;
    private static final /* synthetic */ int[] lIIlIllIIllllI;
    
    NO_AUTH((byte)SocksAuthScheme.lIIlIllIIllllI[0]);
    
    private final /* synthetic */ byte b;
    
    private static String llIlIIlIIlIllII(final String lllllllllllllIIllIIlIIIlllllllII, final String lllllllllllllIIllIIlIIIlllllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIlIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIIlllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIIlIIIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIIlIIIIIIIII.init(SocksAuthScheme.lIIlIllIIllllI[2], lllllllllllllIIllIIlIIlIIIIIIIIl);
            return new String(lllllllllllllIIllIIlIIlIIIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIIlllllllll) {
            lllllllllllllIIllIIlIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIIlIIlIllll() {
        (lIIlIllIIlllIl = new String[SocksAuthScheme.lIIlIllIIllllI[5]])[SocksAuthScheme.lIIlIllIIllllI[0]] = llIlIIlIIlIllII("fDGJprZmhzY=", "CpdwH");
        SocksAuthScheme.lIIlIllIIlllIl[SocksAuthScheme.lIIlIllIIllllI[1]] = llIlIIlIIlIllIl("LhElMj0oFyI7MiY=", "oDqzb");
        SocksAuthScheme.lIIlIllIIlllIl[SocksAuthScheme.lIIlIllIIllllI[2]] = llIlIIlIIlIlllI("cR8gXMtRF+DB0Er5ujqihA==", "Fubvb");
        SocksAuthScheme.lIIlIllIIlllIl[SocksAuthScheme.lIIlIllIIllllI[3]] = llIlIIlIIlIllII("42Y49fQAoWw=", "nJEzg");
    }
    
    public byte byteValue() {
        return this.b;
    }
    
    private static String llIlIIlIIlIlllI(final String lllllllllllllIIllIIlIIlIIIIIlIll, final String lllllllllllllIIllIIlIIlIIIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIlIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), SocksAuthScheme.lIIlIllIIllllI[6]), "DES");
            final Cipher lllllllllllllIIllIIlIIlIIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIIlIIIIIllIl.init(SocksAuthScheme.lIIlIllIIllllI[2], lllllllllllllIIllIIlIIlIIIIIlllI);
            return new String(lllllllllllllIIllIIlIIlIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIlIIIIIllII) {
            lllllllllllllIIllIIlIIlIIIIIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        llIlIIlIIllIIII();
        llIlIIlIIlIllll();
        final SocksAuthScheme[] $values = new SocksAuthScheme[SocksAuthScheme.lIIlIllIIllllI[5]];
        $values[SocksAuthScheme.lIIlIllIIllllI[0]] = SocksAuthScheme.NO_AUTH;
        $values[SocksAuthScheme.lIIlIllIIllllI[1]] = SocksAuthScheme.AUTH_GSSAPI;
        $values[SocksAuthScheme.lIIlIllIIllllI[2]] = SocksAuthScheme.AUTH_PASSWORD;
        $values[SocksAuthScheme.lIIlIllIIllllI[3]] = SocksAuthScheme.UNKNOWN;
        $VALUES = $values;
    }
    
    private static boolean llIlIIlIIllIIIl(final int lllllllllllllIIllIIlIIIlllllIIlI, final int lllllllllllllIIllIIlIIIlllllIIIl) {
        return lllllllllllllIIllIIlIIIlllllIIlI < lllllllllllllIIllIIlIIIlllllIIIl;
    }
    
    public static SocksAuthScheme valueOf(final byte lllllllllllllIIllIIlIIlIIIllIIlI) {
        final SocksAuthScheme[] lllllllllllllIIllIIlIIlIIIllIllI = values();
        final int lllllllllllllIIllIIlIIlIIIllIlIl = lllllllllllllIIllIIlIIlIIIllIllI.length;
        int lllllllllllllIIllIIlIIlIIIllIlII = SocksAuthScheme.lIIlIllIIllllI[0];
        while (llIlIIlIIllIIIl(lllllllllllllIIllIIlIIlIIIllIlII, lllllllllllllIIllIIlIIlIIIllIlIl)) {
            final SocksAuthScheme lllllllllllllIIllIIlIIlIIIllIlll = lllllllllllllIIllIIlIIlIIIllIllI[lllllllllllllIIllIIlIIlIIIllIlII];
            if (llIlIIlIIllIIlI(lllllllllllllIIllIIlIIlIIIllIlll.b, lllllllllllllIIllIIlIIlIIIllIIlI)) {
                return lllllllllllllIIllIIlIIlIIIllIlll;
            }
            ++lllllllllllllIIllIIlIIlIIIllIlII;
            "".length();
            if ((0x9A ^ 0x9E) < 0) {
                return null;
            }
        }
        return SocksAuthScheme.UNKNOWN;
    }
    
    @Deprecated
    public static SocksAuthScheme fromByte(final byte lllllllllllllIIllIIlIIlIIIlllllI) {
        return valueOf(lllllllllllllIIllIIlIIlIIIlllllI);
    }
    
    private static boolean llIlIIlIIllIIlI(final int lllllllllllllIIllIIlIIIlllllIllI, final int lllllllllllllIIllIIlIIIlllllIlIl) {
        return lllllllllllllIIllIIlIIIlllllIllI == lllllllllllllIIllIIlIIIlllllIlIl;
    }
    
    private static void llIlIIlIIllIIII() {
        (lIIlIllIIllllI = new int[7])[0] = ((0x42 ^ 0x59) & ~(0x83 ^ 0x98));
        SocksAuthScheme.lIIlIllIIllllI[1] = " ".length();
        SocksAuthScheme.lIIlIllIIllllI[2] = "  ".length();
        SocksAuthScheme.lIIlIllIIllllI[3] = "   ".length();
        SocksAuthScheme.lIIlIllIIllllI[4] = -" ".length();
        SocksAuthScheme.lIIlIllIIllllI[5] = (0x19 ^ 0x58 ^ (0x1B ^ 0x5E));
        SocksAuthScheme.lIIlIllIIllllI[6] = (0xCC ^ 0xC4);
    }
    
    private SocksAuthScheme(final byte lllllllllllllIIllIIlIIlIIlIIIIII) {
        this.b = lllllllllllllIIllIIlIIlIIlIIIIII;
    }
    
    private static String llIlIIlIIlIllIl(String lllllllllllllIIllIIlIIlIIIIllIll, final String lllllllllllllIIllIIlIIlIIIIlllll) {
        lllllllllllllIIllIIlIIlIIIIllIll = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlIIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIIlIIIIllllI = new StringBuilder();
        final char[] lllllllllllllIIllIIlIIlIIIIlllIl = lllllllllllllIIllIIlIIlIIIIlllll.toCharArray();
        int lllllllllllllIIllIIlIIlIIIIlllII = SocksAuthScheme.lIIlIllIIllllI[0];
        final int lllllllllllllIIllIIlIIlIIIIlIllI = (Object)lllllllllllllIIllIIlIIlIIIIllIll.toCharArray();
        final String lllllllllllllIIllIIlIIlIIIIlIlIl = (String)lllllllllllllIIllIIlIIlIIIIlIllI.length;
        char lllllllllllllIIllIIlIIlIIIIlIlII = (char)SocksAuthScheme.lIIlIllIIllllI[0];
        while (llIlIIlIIllIIIl(lllllllllllllIIllIIlIIlIIIIlIlII, (int)lllllllllllllIIllIIlIIlIIIIlIlIl)) {
            final char lllllllllllllIIllIIlIIlIIIlIIIIl = lllllllllllllIIllIIlIIlIIIIlIllI[lllllllllllllIIllIIlIIlIIIIlIlII];
            lllllllllllllIIllIIlIIlIIIIllllI.append((char)(lllllllllllllIIllIIlIIlIIIlIIIIl ^ lllllllllllllIIllIIlIIlIIIIlllIl[lllllllllllllIIllIIlIIlIIIIlllII % lllllllllllllIIllIIlIIlIIIIlllIl.length]));
            "".length();
            ++lllllllllllllIIllIIlIIlIIIIlllII;
            ++lllllllllllllIIllIIlIIlIIIIlIlII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIIlIIIIllllI);
    }
}
