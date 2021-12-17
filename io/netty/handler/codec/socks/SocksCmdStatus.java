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

public enum SocksCmdStatus
{
    HOST_UNREACHABLE((byte)SocksCmdStatus.lllIlIlllIllIl[4]), 
    NETWORK_UNREACHABLE((byte)SocksCmdStatus.lllIlIlllIllIl[3]);
    
    private static final /* synthetic */ String[] lllIlIlllIlIIl;
    private final /* synthetic */ byte b;
    
    SUCCESS((byte)SocksCmdStatus.lllIlIlllIllIl[0]), 
    UNASSIGNED((byte)SocksCmdStatus.lllIlIlllIllIl[10]), 
    TTL_EXPIRED((byte)SocksCmdStatus.lllIlIlllIllIl[6]);
    
    private static final /* synthetic */ int[] lllIlIlllIllIl;
    
    FAILURE((byte)SocksCmdStatus.lllIlIlllIllIl[1]), 
    ADDRESS_NOT_SUPPORTED((byte)SocksCmdStatus.lllIlIlllIllIl[8]), 
    FORBIDDEN((byte)SocksCmdStatus.lllIlIlllIllIl[2]), 
    COMMAND_NOT_SUPPORTED((byte)SocksCmdStatus.lllIlIlllIllIl[7]), 
    REFUSED((byte)SocksCmdStatus.lllIlIlllIllIl[5]);
    
    public static SocksCmdStatus valueOf(final byte llllllllllllIlIllIlIIlIllIIlllll) {
        final SocksCmdStatus[] llllllllllllIlIllIlIIlIllIlIIIlI = values();
        final int llllllllllllIlIllIlIIlIllIlIIIIl = llllllllllllIlIllIlIIlIllIlIIIlI.length;
        int llllllllllllIlIllIlIIlIllIlIIIII = SocksCmdStatus.lllIlIlllIllIl[0];
        while (lIlIIIlllIIIllII(llllllllllllIlIllIlIIlIllIlIIIII, llllllllllllIlIllIlIIlIllIlIIIIl)) {
            final SocksCmdStatus llllllllllllIlIllIlIIlIllIlIIIll = llllllllllllIlIllIlIIlIllIlIIIlI[llllllllllllIlIllIlIIlIllIlIIIII];
            if (lIlIIIlllIIIllIl(llllllllllllIlIllIlIIlIllIlIIIll.b, llllllllllllIlIllIlIIlIllIIlllll)) {
                return llllllllllllIlIllIlIIlIllIlIIIll;
            }
            ++llllllllllllIlIllIlIIlIllIlIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return SocksCmdStatus.UNASSIGNED;
    }
    
    private static String lIlIIIllIlllllII(final String llllllllllllIlIllIlIIlIllIIIIIlI, final String llllllllllllIlIllIlIIlIllIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlIllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIlIllIIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIlIllIIIIlII.init(SocksCmdStatus.lllIlIlllIllIl[2], llllllllllllIlIllIlIIlIllIIIIlIl);
            return new String(llllllllllllIlIllIlIIlIllIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlIllIIIIIll) {
            llllllllllllIlIllIlIIlIllIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIllIllllIll(final String llllllllllllIlIllIlIIlIllIIIllIl, final String llllllllllllIlIllIlIIlIllIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIlIllIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIlIllIIIlllI.getBytes(StandardCharsets.UTF_8)), SocksCmdStatus.lllIlIlllIllIl[8]), "DES");
            final Cipher llllllllllllIlIllIlIIlIllIIlIIIl = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIlIllIIlIIIl.init(SocksCmdStatus.lllIlIlllIllIl[2], llllllllllllIlIllIlIIlIllIIlIIlI);
            return new String(llllllllllllIlIllIlIIlIllIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIlIllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIlIllIIlIIII) {
            llllllllllllIlIllIlIIlIllIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlllIIIlIll() {
        (lllIlIlllIllIl = new int[12])[0] = ((0x12 ^ 0x71) & ~(0xE0 ^ 0x83));
        SocksCmdStatus.lllIlIlllIllIl[1] = " ".length();
        SocksCmdStatus.lllIlIlllIllIl[2] = "  ".length();
        SocksCmdStatus.lllIlIlllIllIl[3] = "   ".length();
        SocksCmdStatus.lllIlIlllIllIl[4] = (0x5F ^ 0x5B);
        SocksCmdStatus.lllIlIlllIllIl[5] = (0xC7 ^ 0x95 ^ (0x72 ^ 0x25));
        SocksCmdStatus.lllIlIlllIllIl[6] = (0xAB ^ 0xAD);
        SocksCmdStatus.lllIlIlllIllIl[7] = ("  ".length() ^ (0x94 ^ 0x91));
        SocksCmdStatus.lllIlIlllIllIl[8] = (0x29 ^ 0x21);
        SocksCmdStatus.lllIlIlllIllIl[9] = (0xB7 ^ 0x83 ^ (0xAE ^ 0x93));
        SocksCmdStatus.lllIlIlllIllIl[10] = -" ".length();
        SocksCmdStatus.lllIlIlllIllIl[11] = (0xBB ^ 0xB1);
    }
    
    private static boolean lIlIIIlllIIIllII(final int llllllllllllIlIllIlIIlIlIlllIllI, final int llllllllllllIlIllIlIIlIlIlllIlIl) {
        return llllllllllllIlIllIlIIlIlIlllIllI < llllllllllllIlIllIlIIlIlIlllIlIl;
    }
    
    @Deprecated
    public static SocksCmdStatus fromByte(final byte llllllllllllIlIllIlIIlIllIlIlIlI) {
        return valueOf(llllllllllllIlIllIlIIlIllIlIlIlI);
    }
    
    private static boolean lIlIIIlllIIIllIl(final int llllllllllllIlIllIlIIlIlIllllIlI, final int llllllllllllIlIllIlIIlIlIllllIIl) {
        return llllllllllllIlIllIlIIlIlIllllIlI == llllllllllllIlIllIlIIlIlIllllIIl;
    }
    
    private static void lIlIIIllIlllllIl() {
        (lllIlIlllIlIIl = new String[SocksCmdStatus.lllIlIlllIllIl[11]])[SocksCmdStatus.lllIlIlllIllIl[0]] = lIlIIIllIllllIll("D5tVeTW/FdU=", "shyyh");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[1]] = lIlIIIllIllllIll("nHg27FmPOMg=", "MWFhf");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[2]] = lIlIIIllIlllllII("47El33TX7yumlxKmpIjE2Q==", "FbPUH");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[3]] = lIlIIIllIllllIll("5QDb6BBn4r8W73o2HonuoiWQbK4hRJXm", "sxykB");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[4]] = lIlIIIllIllllIll("71H6S9QSK2SMlAKB3YkXkzzxk36nL8CJ", "ERjrC");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[5]] = lIlIIIllIlllllII("27BpQufrwO0=", "xQgXQ");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[6]] = lIlIIIllIllllIll("UfemUtrxsNAX2ApUmXMTtQ==", "cxKOM");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[7]] = lIlIIIllIllllIll("yjwxxkHHpW7z1Hq/eqvVeF1ZnXP1r+v0", "RBHsx");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[8]] = lIlIIIllIlllllII("2xg5RROnoegmhS9AtLzd1l+XA+KKnm98", "DVRNN");
        SocksCmdStatus.lllIlIlllIlIIl[SocksCmdStatus.lllIlIlllIllIl[9]] = lIlIIIllIlllllII("Smp9hkVXg10wRDgkEwOYbQ==", "uIoqX");
    }
    
    private SocksCmdStatus(final byte llllllllllllIlIllIlIIlIllIlIllII) {
        this.b = llllllllllllIlIllIlIIlIllIlIllII;
    }
    
    static {
        lIlIIIlllIIIlIll();
        lIlIIIllIlllllIl();
        final SocksCmdStatus[] $values = new SocksCmdStatus[SocksCmdStatus.lllIlIlllIllIl[11]];
        $values[SocksCmdStatus.lllIlIlllIllIl[0]] = SocksCmdStatus.SUCCESS;
        $values[SocksCmdStatus.lllIlIlllIllIl[1]] = SocksCmdStatus.FAILURE;
        $values[SocksCmdStatus.lllIlIlllIllIl[2]] = SocksCmdStatus.FORBIDDEN;
        $values[SocksCmdStatus.lllIlIlllIllIl[3]] = SocksCmdStatus.NETWORK_UNREACHABLE;
        $values[SocksCmdStatus.lllIlIlllIllIl[4]] = SocksCmdStatus.HOST_UNREACHABLE;
        $values[SocksCmdStatus.lllIlIlllIllIl[5]] = SocksCmdStatus.REFUSED;
        $values[SocksCmdStatus.lllIlIlllIllIl[6]] = SocksCmdStatus.TTL_EXPIRED;
        $values[SocksCmdStatus.lllIlIlllIllIl[7]] = SocksCmdStatus.COMMAND_NOT_SUPPORTED;
        $values[SocksCmdStatus.lllIlIlllIllIl[8]] = SocksCmdStatus.ADDRESS_NOT_SUPPORTED;
        $values[SocksCmdStatus.lllIlIlllIllIl[9]] = SocksCmdStatus.UNASSIGNED;
        $VALUES = $values;
    }
    
    public byte byteValue() {
        return this.b;
    }
}
