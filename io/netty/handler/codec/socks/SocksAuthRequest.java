// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.CharsetUtil;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.charset.CharsetEncoder;

public final class SocksAuthRequest extends SocksRequest
{
    private static final /* synthetic */ int[] lIIlIIIIlIlIIl;
    private static final /* synthetic */ CharsetEncoder asciiEncoder;
    private static final /* synthetic */ SocksSubnegotiationVersion SUBNEGOTIATION_VERSION;
    private static final /* synthetic */ String[] lIIIllllIlllIl;
    private final /* synthetic */ String password;
    private final /* synthetic */ String username;
    
    private static String llIIlIIIIIlIIIl(String lllllllllllllIIlllIllIlIlIlllIII, final String lllllllllllllIIlllIllIlIlIllllII) {
        lllllllllllllIIlllIllIlIlIlllIII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIllIlIlIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIllIlIlIlllIll = new StringBuilder();
        final char[] lllllllllllllIIlllIllIlIlIlllIlI = lllllllllllllIIlllIllIlIlIllllII.toCharArray();
        int lllllllllllllIIlllIllIlIlIlllIIl = SocksAuthRequest.lIIlIIIIlIlIIl[0];
        final double lllllllllllllIIlllIllIlIlIllIIll = (Object)((String)lllllllllllllIIlllIllIlIlIlllIII).toCharArray();
        final short lllllllllllllIIlllIllIlIlIllIIlI = (short)lllllllllllllIIlllIllIlIlIllIIll.length;
        boolean lllllllllllllIIlllIllIlIlIllIIIl = SocksAuthRequest.lIIlIIIIlIlIIl[0] != 0;
        while (llIIlIIllIlIIlI(lllllllllllllIIlllIllIlIlIllIIIl ? 1 : 0, lllllllllllllIIlllIllIlIlIllIIlI)) {
            final char lllllllllllllIIlllIllIlIlIlllllI = lllllllllllllIIlllIllIlIlIllIIll[lllllllllllllIIlllIllIlIlIllIIIl];
            lllllllllllllIIlllIllIlIlIlllIll.append((char)(lllllllllllllIIlllIllIlIlIlllllI ^ lllllllllllllIIlllIllIlIlIlllIlI[lllllllllllllIIlllIllIlIlIlllIIl % lllllllllllllIIlllIllIlIlIlllIlI.length]));
            "".length();
            ++lllllllllllllIIlllIllIlIlIlllIIl;
            ++lllllllllllllIIlllIllIlIlIllIIIl;
            "".length();
            if (((0x7A ^ 0x2A) & ~(0x2F ^ 0x7F)) != ((0x11 ^ 0x1) & ~(0x37 ^ 0x27))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIllIlIlIlllIll);
    }
    
    private static boolean llIIlIIllIIlllI(final Object lllllllllllllIIlllIllIlIlIlIIllI) {
        return lllllllllllllIIlllIllIlIlIlIIllI == null;
    }
    
    public SocksAuthRequest(final String lllllllllllllIIlllIllIlIlllIllll, final String lllllllllllllIIlllIllIlIlllIlllI) {
        super(SocksRequestType.AUTH);
        if (llIIlIIllIIlllI(lllllllllllllIIlllIllIlIlllIllll)) {
            throw new NullPointerException(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[0]]);
        }
        if (llIIlIIllIIlllI(lllllllllllllIIlllIllIlIlllIlllI)) {
            throw new NullPointerException(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[1]]);
        }
        if (!llIIlIIllIIllll(SocksAuthRequest.asciiEncoder.canEncode(lllllllllllllIIlllIllIlIlllIllll) ? 1 : 0) || llIIlIIllIlIIII(SocksAuthRequest.asciiEncoder.canEncode(lllllllllllllIIlllIllIlIlllIlllI) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[2]]).append(lllllllllllllIIlllIllIlIlllIllll).append(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[3]]).append(lllllllllllllIIlllIllIlIlllIlllI).append(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[4]])));
        }
        if (llIIlIIllIlIIIl(lllllllllllllIIlllIllIlIlllIllll.length(), SocksAuthRequest.lIIlIIIIlIlIIl[5])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(lllllllllllllIIlllIllIlIlllIllll).append(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[6]])));
        }
        if (llIIlIIllIlIIIl(lllllllllllllIIlllIllIlIlllIlllI.length(), SocksAuthRequest.lIIlIIIIlIlIIl[5])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(lllllllllllllIIlllIllIlIlllIlllI).append(SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[7]])));
        }
        this.username = lllllllllllllIIlllIllIlIlllIllll;
        this.password = lllllllllllllIIlllIllIlIlllIlllI;
    }
    
    private static void llIIlIIllIIllIl() {
        (lIIlIIIIlIlIIl = new int[10])[0] = ((0x59 ^ 0x5F) & ~(0x6C ^ 0x6A));
        SocksAuthRequest.lIIlIIIIlIlIIl[1] = " ".length();
        SocksAuthRequest.lIIlIIIIlIlIIl[2] = "  ".length();
        SocksAuthRequest.lIIlIIIIlIlIIl[3] = "   ".length();
        SocksAuthRequest.lIIlIIIIlIlIIl[4] = (0x5A ^ 0x5E);
        SocksAuthRequest.lIIlIIIIlIlIIl[5] = 238 + 177 - 402 + 242;
        SocksAuthRequest.lIIlIIIIlIlIIl[6] = (0x2F ^ 0x2A);
        SocksAuthRequest.lIIlIIIIlIlIIl[7] = (0x7E ^ 0x78);
        SocksAuthRequest.lIIlIIIIlIlIIl[8] = (0x8 ^ 0xF);
        SocksAuthRequest.lIIlIIIIlIlIIl[9] = (0x26 ^ 0x32 ^ (0xB ^ 0x17));
    }
    
    private static boolean llIIlIIllIIllll(final int lllllllllllllIIlllIllIlIlIlIIlII) {
        return lllllllllllllIIlllIllIlIlIlIIlII != 0;
    }
    
    @Override
    public void encodeAsByteBuf(final ByteBuf lllllllllllllIIlllIllIlIlllIIlII) {
        lllllllllllllIIlllIllIlIlllIIlII.writeByte(SocksAuthRequest.SUBNEGOTIATION_VERSION.byteValue());
        "".length();
        lllllllllllllIIlllIllIlIlllIIlII.writeByte(this.username.length());
        "".length();
        lllllllllllllIIlllIllIlIlllIIlII.writeBytes(this.username.getBytes(CharsetUtil.US_ASCII));
        "".length();
        lllllllllllllIIlllIllIlIlllIIlII.writeByte(this.password.length());
        "".length();
        lllllllllllllIIlllIllIlIlllIIlII.writeBytes(this.password.getBytes(CharsetUtil.US_ASCII));
        "".length();
    }
    
    private static void llIIlIIIIIlIllI() {
        (lIIIllllIlllIl = new String[SocksAuthRequest.lIIlIIIIlIlIIl[8]])[SocksAuthRequest.lIIlIIIIlIlIIl[0]] = llIIlIIIIIlIIIl("LxsTCyY7BRM=", "ZhvyH");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[1]] = llIIlIIIIIlIIIl("GiEMGj4OPww=", "oRihP");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[2]] = llIIlIIIIIlIIlI("ckBpqv1lLs11hI+VHPyjJA==", "EMuwl");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[3]] = llIIlIIIIIlIIlI("dBCiHq2oKGLX9NISeiD/cw==", "wSXjx");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[4]] = llIIlIIIIIlIIIl("eiM5AhQ/JngdCTUgNApBODB4Bw96JS0cBHo0Kw0IMw==", "ZUXna");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[6]] = llIIlIIIIIlIlII("oRa23RLgg+gsujrFT4kLE9vWXdwVjAqh", "MhPRz");
        SocksAuthRequest.lIIIllllIlllIl[SocksAuthRequest.lIIlIIIIlIlIIl[7]] = llIIlIIIIIlIIlI("qYtAzEfa3TDCKGxS4x4x6ufOm6LJQe3d", "mooVf");
    }
    
    private static boolean llIIlIIllIlIIlI(final int lllllllllllllIIlllIllIlIlIlIllIl, final int lllllllllllllIIlllIllIlIlIlIllII) {
        return lllllllllllllIIlllIllIlIlIlIllIl < lllllllllllllIIlllIllIlIlIlIllII;
    }
    
    private static boolean llIIlIIllIlIIII(final int lllllllllllllIIlllIllIlIlIlIIIlI) {
        return lllllllllllllIIlllIllIlIlIlIIIlI == 0;
    }
    
    static {
        llIIlIIllIIllIl();
        llIIlIIIIIlIllI();
        asciiEncoder = CharsetUtil.getEncoder(CharsetUtil.US_ASCII);
        SUBNEGOTIATION_VERSION = SocksSubnegotiationVersion.AUTH_PASSWORD;
    }
    
    public String username() {
        return this.username;
    }
    
    private static String llIIlIIIIIlIIlI(final String lllllllllllllIIlllIllIlIllIllIII, final String lllllllllllllIIlllIllIlIllIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIlIllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIlIllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIllIlIllIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIllIlIllIlllII.init(SocksAuthRequest.lIIlIIIIlIlIIl[2], lllllllllllllIIlllIllIlIllIlllIl);
            return new String(lllllllllllllIIlllIllIlIllIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIlIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIlIllIllIll) {
            lllllllllllllIIlllIllIlIllIllIll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIIIIIlIlII(final String lllllllllllllIIlllIllIlIllIIlIll, final String lllllllllllllIIlllIllIlIllIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIlIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8)), SocksAuthRequest.lIIlIIIIlIlIIl[9]), "DES");
            final Cipher lllllllllllllIIlllIllIlIllIIllll = Cipher.getInstance("DES");
            lllllllllllllIIlllIllIlIllIIllll.init(SocksAuthRequest.lIIlIIIIlIlIIl[2], lllllllllllllIIlllIllIlIllIlIIII);
            return new String(lllllllllllllIIlllIllIlIllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIlIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIlIllIIlllI) {
            lllllllllllllIIlllIllIlIllIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIIllIlIIIl(final int lllllllllllllIIlllIllIlIlIlIlIIl, final int lllllllllllllIIlllIllIlIlIlIlIII) {
        return lllllllllllllIIlllIllIlIlIlIlIIl > lllllllllllllIIlllIllIlIlIlIlIII;
    }
    
    public String password() {
        return this.password;
    }
}
