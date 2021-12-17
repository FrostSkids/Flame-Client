// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SpdySessionStatus implements Comparable<SpdySessionStatus>
{
    public static final /* synthetic */ SpdySessionStatus INTERNAL_ERROR;
    private static final /* synthetic */ String[] llIllllIllIIlI;
    public static final /* synthetic */ SpdySessionStatus OK;
    private final /* synthetic */ String statusPhrase;
    private static final /* synthetic */ int[] llIllllIllIlII;
    private final /* synthetic */ int code;
    public static final /* synthetic */ SpdySessionStatus PROTOCOL_ERROR;
    
    static {
        lIIllIlIllIIlIII();
        lIIllIlIllIIIlIl();
        OK = new SpdySessionStatus(SpdySessionStatus.llIllllIllIlII[0], SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[3]]);
        PROTOCOL_ERROR = new SpdySessionStatus(SpdySessionStatus.llIllllIllIlII[2], SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[4]]);
        INTERNAL_ERROR = new SpdySessionStatus(SpdySessionStatus.llIllllIllIlII[3], SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[5]]);
    }
    
    private static boolean lIIllIlIllIIlIll(final int llllllllllllIllIIIllIlIIllIlIIlI, final int llllllllllllIllIIIllIlIIllIlIIIl) {
        return llllllllllllIllIIIllIlIIllIlIIlI == llllllllllllIllIIIllIlIIllIlIIIl;
    }
    
    private static String lIIllIlIllIIIIlI(final String llllllllllllIllIIIllIlIIllllllIl, final String llllllllllllIllIIIllIlIIlllllllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIlIlIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIIlllllllI.getBytes(StandardCharsets.UTF_8)), SpdySessionStatus.llIllllIllIlII[7]), "DES");
            final Cipher llllllllllllIllIIIllIlIlIIIIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIIIllIlIlIIIIIIIl.init(SpdySessionStatus.llIllllIllIlII[3], llllllllllllIllIIIllIlIlIIIIIIlI);
            return new String(llllllllllllIllIIIllIlIlIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIlIlIIIIIIII) {
            llllllllllllIllIIIllIlIlIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIlIllIIIlIl() {
        (llIllllIllIIlI = new String[SpdySessionStatus.llIllllIllIlII[6]])[SpdySessionStatus.llIllllIllIlII[0]] = lIIllIlIllIIIIIl("BBwKJzUGHGFB", "QRAiz");
        SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[2]] = lIIllIlIllIIIIlI("no1p/XkZJliaUk1V4+pM0g==", "WmmEL");
        SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[3]] = lIIllIlIllIIIIIl("Igw=", "mGmrG");
        SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[4]] = lIIllIlIllIIIIlI("RONVwS8SAGjEY/FSIfPrdw==", "ZdTAx");
        SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[5]] = lIIllIlIllIIIIll("nEvFIYEcxPy+Wxoj298AkA==", "ihZGr");
    }
    
    public SpdySessionStatus(final int llllllllllllIllIIIllIlIlIIlIIllI, final String llllllllllllIllIIIllIlIlIIlIlIII) {
        if (lIIllIlIllIIlIIl(llllllllllllIllIIIllIlIlIIlIlIII)) {
            throw new NullPointerException(SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[2]]);
        }
        this.code = llllllllllllIllIIIllIlIlIIlIIllI;
        this.statusPhrase = llllllllllllIllIIIllIlIlIIlIlIII;
    }
    
    private static String lIIllIlIllIIIIIl(String llllllllllllIllIIIllIlIIllIlllIl, final String llllllllllllIllIIIllIlIIllIlllII) {
        llllllllllllIllIIIllIlIIllIlllIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllIlIIllIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIlIIlllIIIII = new StringBuilder();
        final char[] llllllllllllIllIIIllIlIIllIlllll = llllllllllllIllIIIllIlIIllIlllII.toCharArray();
        int llllllllllllIllIIIllIlIIllIllllI = SpdySessionStatus.llIllllIllIlII[0];
        final int llllllllllllIllIIIllIlIIllIllIII = (Object)((String)llllllllllllIllIIIllIlIIllIlllIl).toCharArray();
        final long llllllllllllIllIIIllIlIIllIlIlll = llllllllllllIllIIIllIlIIllIllIII.length;
        long llllllllllllIllIIIllIlIIllIlIllI = SpdySessionStatus.llIllllIllIlII[0];
        while (lIIllIlIllIIllII((int)llllllllllllIllIIIllIlIIllIlIllI, (int)llllllllllllIllIIIllIlIIllIlIlll)) {
            final char llllllllllllIllIIIllIlIIlllIIIll = llllllllllllIllIIIllIlIIllIllIII[llllllllllllIllIIIllIlIIllIlIllI];
            llllllllllllIllIIIllIlIIlllIIIII.append((char)(llllllllllllIllIIIllIlIIlllIIIll ^ llllllllllllIllIIIllIlIIllIlllll[llllllllllllIllIIIllIlIIllIllllI % llllllllllllIllIIIllIlIIllIlllll.length]));
            "".length();
            ++llllllllllllIllIIIllIlIIllIllllI;
            ++llllllllllllIllIIIllIlIIllIlIllI;
            "".length();
            if ((0x30 ^ 0x34) <= ((0xC3 ^ 0x83) & ~(0x3 ^ 0x43))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIlIIlllIIIII);
    }
    
    @Override
    public String toString() {
        return this.statusPhrase();
    }
    
    private static boolean lIIllIlIllIIlIlI(final int llllllllllllIllIIIllIlIIllIIlIIl) {
        return llllllllllllIllIIIllIlIIllIIlIIl == 0;
    }
    
    public static SpdySessionStatus valueOf(final int llllllllllllIllIIIllIlIlIIlIllll) {
        switch (llllllllllllIllIIIllIlIlIIlIllll) {
            case 0: {
                return SpdySessionStatus.OK;
            }
            case 1: {
                return SpdySessionStatus.PROTOCOL_ERROR;
            }
            case 2: {
                return SpdySessionStatus.INTERNAL_ERROR;
            }
            default: {
                return new SpdySessionStatus(llllllllllllIllIIIllIlIlIIlIllll, String.valueOf(new StringBuilder().append(SpdySessionStatus.llIllllIllIIlI[SpdySessionStatus.llIllllIllIlII[0]]).append(llllllllllllIllIIIllIlIlIIlIllll).append((char)SpdySessionStatus.llIllllIllIlII[1])));
            }
        }
    }
    
    @Override
    public int compareTo(final SpdySessionStatus llllllllllllIllIIIllIlIlIIIIllll) {
        return this.code() - llllllllllllIllIIIllIlIlIIIIllll.code();
    }
    
    private static boolean lIIllIlIllIIlIIl(final Object llllllllllllIllIIIllIlIIllIIlIll) {
        return llllllllllllIllIIIllIlIIllIIlIll == null;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIIIllIlIlIIIlIllI) {
        if (lIIllIlIllIIlIlI((llllllllllllIllIIIllIlIlIIIlIllI instanceof SpdySessionStatus) ? 1 : 0)) {
            return SpdySessionStatus.llIllllIllIlII[0] != 0;
        }
        int n;
        if (lIIllIlIllIIlIll(this.code(), ((SpdySessionStatus)llllllllllllIllIIIllIlIlIIIlIllI).code())) {
            n = SpdySessionStatus.llIllllIllIlII[2];
            "".length();
            if ("   ".length() >= (175 + 154 - 216 + 80 ^ 150 + 150 - 264 + 161)) {
                return ((0x55 ^ 0x5B ^ (0x77 ^ 0x4F)) & (0xF8 ^ 0x99 ^ (0xE5 ^ 0xB2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdySessionStatus.llIllllIllIlII[0];
        }
        return n != 0;
    }
    
    private static String lIIllIlIllIIIIll(final String llllllllllllIllIIIllIlIIllllIIII, final String llllllllllllIllIIIllIlIIllllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIlIIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlIIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIlIIllllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIlIIllllIlII.init(SpdySessionStatus.llIllllIllIlII[3], llllllllllllIllIIIllIlIIllllIlIl);
            return new String(llllllllllllIllIIIllIlIIllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlIIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIlIIllllIIll) {
            llllllllllllIllIIIllIlIIllllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIlIllIIlIII() {
        (llIllllIllIlII = new int[8])[0] = ((51 + 137 + 19 + 10 ^ 12 + 52 + 40 + 89) & (130 + 123 - 126 + 55 ^ 2 + 134 - 105 + 143 ^ -" ".length()));
        SpdySessionStatus.llIllllIllIlII[1] = (0xA8 ^ 0x81);
        SpdySessionStatus.llIllllIllIlII[2] = " ".length();
        SpdySessionStatus.llIllllIllIlII[3] = "  ".length();
        SpdySessionStatus.llIllllIllIlII[4] = "   ".length();
        SpdySessionStatus.llIllllIllIlII[5] = (0x7A ^ 0x1C ^ (0x34 ^ 0x56));
        SpdySessionStatus.llIllllIllIlII[6] = (0x59 ^ 0x44 ^ (0x70 ^ 0x68));
        SpdySessionStatus.llIllllIllIlII[7] = (0x60 ^ 0x39 ^ (0x12 ^ 0x43));
    }
    
    @Override
    public int hashCode() {
        return this.code();
    }
    
    private static boolean lIIllIlIllIIllII(final int llllllllllllIllIIIllIlIIllIIlllI, final int llllllllllllIllIIIllIlIIllIIllIl) {
        return llllllllllllIllIIIllIlIIllIIlllI < llllllllllllIllIIIllIlIIllIIllIl;
    }
    
    public int code() {
        return this.code;
    }
    
    public String statusPhrase() {
        return this.statusPhrase;
    }
}
