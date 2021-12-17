// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum SocksCmdType
{
    BIND((byte)SocksCmdType.llIIllllIIIllI[2]);
    
    private static final /* synthetic */ int[] llIIllllIIIllI;
    
    UNKNOWN((byte)SocksCmdType.llIIllllIIIllI[4]), 
    UDP((byte)SocksCmdType.llIIllllIIIllI[3]);
    
    private final /* synthetic */ byte b;
    private static final /* synthetic */ String[] llIIllllIIIIlI;
    
    CONNECT((byte)SocksCmdType.llIIllllIIIllI[1]);
    
    private static void lIIlIIIIIIIIlIIl() {
        (llIIllllIIIllI = new int[6])[0] = ((0x81 ^ 0xC3 ^ (0x49 ^ 0x57)) & (0xE8 ^ 0xAC ^ (0x2A ^ 0x32) ^ -" ".length()));
        SocksCmdType.llIIllllIIIllI[1] = " ".length();
        SocksCmdType.llIIllllIIIllI[2] = "  ".length();
        SocksCmdType.llIIllllIIIllI[3] = "   ".length();
        SocksCmdType.llIIllllIIIllI[4] = -" ".length();
        SocksCmdType.llIIllllIIIllI[5] = (0x67 ^ 0x10 ^ (0xEE ^ 0x9D));
    }
    
    private static void lIIlIIIIIIIIIlIl() {
        (llIIllllIIIIlI = new String[SocksCmdType.llIIllllIIIllI[5]])[SocksCmdType.llIIllllIIIllI[0]] = lIIlIIIIIIIIIIll("QvVJsE3rgJM=", "UIRli");
        SocksCmdType.llIIllllIIIIlI[SocksCmdType.llIIllllIIIllI[1]] = lIIlIIIIIIIIIlII("DzsIEw==", "MrFWu");
        SocksCmdType.llIIllllIIIIlI[SocksCmdType.llIIllllIIIllI[2]] = lIIlIIIIIIIIIIll("fioyiEjFdtg=", "THFfa");
        SocksCmdType.llIIllllIIIIlI[SocksCmdType.llIIllllIIIllI[3]] = lIIlIIIIIIIIIlII("DAYbJwIOBg==", "YHPiM");
    }
    
    @Deprecated
    public static SocksCmdType fromByte(final byte llllllllllllIllIlllIlllIlIIIIIlI) {
        return valueOf(llllllllllllIllIlllIlllIlIIIIIlI);
    }
    
    private static boolean lIIlIIIIIIIIlIll(final int llllllllllllIllIlllIlllIIlIIlIII, final int llllllllllllIllIlllIlllIIlIIIlll) {
        return llllllllllllIllIlllIlllIIlIIlIII == llllllllllllIllIlllIlllIIlIIIlll;
    }
    
    private static boolean lIIlIIIIIIIIlIlI(final int llllllllllllIllIlllIlllIIlIIIlII, final int llllllllllllIllIlllIlllIIlIIIIll) {
        return llllllllllllIllIlllIlllIIlIIIlII < llllllllllllIllIlllIlllIIlIIIIll;
    }
    
    private static String lIIlIIIIIIIIIlII(String llllllllllllIllIlllIlllIIllIIIII, final String llllllllllllIllIlllIlllIIlIlllll) {
        llllllllllllIllIlllIlllIIllIIIII = new String(Base64.getDecoder().decode(llllllllllllIllIlllIlllIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlllIIllIIIll = new StringBuilder();
        final char[] llllllllllllIllIlllIlllIIllIIIlI = llllllllllllIllIlllIlllIIlIlllll.toCharArray();
        int llllllllllllIllIlllIlllIIllIIIIl = SocksCmdType.llIIllllIIIllI[0];
        final byte llllllllllllIllIlllIlllIIlIllIll = (Object)llllllllllllIllIlllIlllIIllIIIII.toCharArray();
        final long llllllllllllIllIlllIlllIIlIllIlI = llllllllllllIllIlllIlllIIlIllIll.length;
        float llllllllllllIllIlllIlllIIlIllIIl = SocksCmdType.llIIllllIIIllI[0];
        while (lIIlIIIIIIIIlIlI((int)llllllllllllIllIlllIlllIIlIllIIl, (int)llllllllllllIllIlllIlllIIlIllIlI)) {
            final char llllllllllllIllIlllIlllIIllIIllI = llllllllllllIllIlllIlllIIlIllIll[llllllllllllIllIlllIlllIIlIllIIl];
            llllllllllllIllIlllIlllIIllIIIll.append((char)(llllllllllllIllIlllIlllIIllIIllI ^ llllllllllllIllIlllIlllIIllIIIlI[llllllllllllIllIlllIlllIIllIIIIl % llllllllllllIllIlllIlllIIllIIIlI.length]));
            "".length();
            ++llllllllllllIllIlllIlllIIllIIIIl;
            ++llllllllllllIllIlllIlllIIlIllIIl;
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlllIIllIIIll);
    }
    
    private SocksCmdType(final byte llllllllllllIllIlllIlllIlIIIlIIl) {
        this.b = llllllllllllIllIlllIlllIlIIIlIIl;
    }
    
    static {
        lIIlIIIIIIIIlIIl();
        lIIlIIIIIIIIIlIl();
        final SocksCmdType[] $values = new SocksCmdType[SocksCmdType.llIIllllIIIllI[5]];
        $values[SocksCmdType.llIIllllIIIllI[0]] = SocksCmdType.CONNECT;
        $values[SocksCmdType.llIIllllIIIllI[1]] = SocksCmdType.BIND;
        $values[SocksCmdType.llIIllllIIIllI[2]] = SocksCmdType.UDP;
        $values[SocksCmdType.llIIllllIIIllI[3]] = SocksCmdType.UNKNOWN;
        $VALUES = $values;
    }
    
    public static SocksCmdType valueOf(final byte llllllllllllIllIlllIlllIIllllIII) {
        final SocksCmdType[] llllllllllllIllIlllIlllIIllllIll = values();
        final int llllllllllllIllIlllIlllIIllllIlI = llllllllllllIllIlllIlllIIllllIll.length;
        int llllllllllllIllIlllIlllIIllllIIl = SocksCmdType.llIIllllIIIllI[0];
        while (lIIlIIIIIIIIlIlI(llllllllllllIllIlllIlllIIllllIIl, llllllllllllIllIlllIlllIIllllIlI)) {
            final SocksCmdType llllllllllllIllIlllIlllIIlllllII = llllllllllllIllIlllIlllIIllllIll[llllllllllllIllIlllIlllIIllllIIl];
            if (lIIlIIIIIIIIlIll(llllllllllllIllIlllIlllIIlllllII.b, llllllllllllIllIlllIlllIIllllIII)) {
                return llllllllllllIllIlllIlllIIlllllII;
            }
            ++llllllllllllIllIlllIlllIIllllIIl;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return SocksCmdType.UNKNOWN;
    }
    
    private static String lIIlIIIIIIIIIIll(final String llllllllllllIllIlllIlllIIlIlIIII, final String llllllllllllIllIlllIlllIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlllIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIlllIIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIlllIIlIlIIlI.init(SocksCmdType.llIIllllIIIllI[2], llllllllllllIllIlllIlllIIlIlIIll);
            return new String(llllllllllllIllIlllIlllIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlllIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlllIIlIlIIIl) {
            llllllllllllIllIlllIlllIIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public byte byteValue() {
        return this.b;
    }
}
