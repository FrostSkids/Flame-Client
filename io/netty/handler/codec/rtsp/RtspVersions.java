// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.handler.codec.http.HttpVersion;

public final class RtspVersions
{
    private static final /* synthetic */ int[] llIlIIIIlIIIll;
    public static final /* synthetic */ HttpVersion RTSP_1_0;
    private static final /* synthetic */ String[] llIlIIIIlIIIIl;
    
    private static boolean lIIlIIIlIlIIllIl(final int llllllllllllIllIllIllIIIIlllIIll, final int llllllllllllIllIllIllIIIIlllIIlI) {
        return llllllllllllIllIllIllIIIIlllIIll < llllllllllllIllIllIllIIIIlllIIlI;
    }
    
    static {
        lIIlIIIlIlIIlIlI();
        lIIlIIIlIlIIIIll();
        RTSP_1_0 = new HttpVersion(RtspVersions.llIlIIIIlIIIIl[RtspVersions.llIlIIIIlIIIll[2]], RtspVersions.llIlIIIIlIIIll[1], RtspVersions.llIlIIIIlIIIll[0], (boolean)(RtspVersions.llIlIIIIlIIIll[1] != 0));
    }
    
    private static String lIIlIIIlIlIIIIlI(String llllllllllllIllIllIllIIIlIIlIIII, final String llllllllllllIllIllIllIIIlIIIllll) {
        llllllllllllIllIllIllIIIlIIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIllIllIIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIllIIIlIIIlllI = new StringBuilder();
        final char[] llllllllllllIllIllIllIIIlIIIllIl = llllllllllllIllIllIllIIIlIIIllll.toCharArray();
        int llllllllllllIllIllIllIIIlIIIllII = RtspVersions.llIlIIIIlIIIll[0];
        final Exception llllllllllllIllIllIllIIIlIIIIllI = (Object)llllllllllllIllIllIllIIIlIIlIIII.toCharArray();
        final float llllllllllllIllIllIllIIIlIIIIlIl = llllllllllllIllIllIllIIIlIIIIllI.length;
        byte llllllllllllIllIllIllIIIlIIIIlII = (byte)RtspVersions.llIlIIIIlIIIll[0];
        while (lIIlIIIlIlIIllIl(llllllllllllIllIllIllIIIlIIIIlII, (int)llllllllllllIllIllIllIIIlIIIIlIl)) {
            final char llllllllllllIllIllIllIIIlIIlIIIl = llllllllllllIllIllIllIIIlIIIIllI[llllllllllllIllIllIllIIIlIIIIlII];
            llllllllllllIllIllIllIIIlIIIlllI.append((char)(llllllllllllIllIllIllIIIlIIlIIIl ^ llllllllllllIllIllIllIIIlIIIllIl[llllllllllllIllIllIllIIIlIIIllII % llllllllllllIllIllIllIIIlIIIllIl.length]));
            "".length();
            ++llllllllllllIllIllIllIIIlIIIllII;
            ++llllllllllllIllIllIllIIIlIIIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIllIIIlIIIlllI);
    }
    
    private RtspVersions() {
    }
    
    private static void lIIlIIIlIlIIIIll() {
        (llIlIIIIlIIIIl = new String[RtspVersions.llIlIIIIlIIIll[3]])[RtspVersions.llIlIIIIlIIIll[0]] = lIIlIIIlIlIIIIIl("K9N6hNq5wO0=", "KcVVx");
        RtspVersions.llIlIIIIlIIIIl[RtspVersions.llIlIIIIlIIIll[1]] = lIIlIIIlIlIIIIlI("Fj89AF91RV4=", "DknPp");
        RtspVersions.llIlIIIIlIIIIl[RtspVersions.llIlIIIIlIIIll[2]] = lIIlIIIlIlIIIIIl("NpyEMHcxA/Q=", "nDyHd");
    }
    
    private static boolean lIIlIIIlIlIIllII(final int llllllllllllIllIllIllIIIIllIlllI) {
        return llllllllllllIllIllIllIIIIllIlllI != 0;
    }
    
    private static String lIIlIIIlIlIIIIIl(final String llllllllllllIllIllIllIIIIllllIIl, final String llllllllllllIllIllIllIIIIllllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIIIIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIllIIIIlllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIllIIIIlllllIl.init(RtspVersions.llIlIIIIlIIIll[2], llllllllllllIllIllIllIIIIllllllI);
            return new String(llllllllllllIllIllIllIIIIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIIIIlllllII) {
            llllllllllllIllIllIllIIIIlllllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIlIlIIlIll(final Object llllllllllllIllIllIllIIIIlllIIII) {
        return llllllllllllIllIllIllIIIIlllIIII == null;
    }
    
    private static void lIIlIIIlIlIIlIlI() {
        (llIlIIIIlIIIll = new int[4])[0] = ((0x93 ^ 0x81 ^ (0x83 ^ 0x8D)) & (0xDB ^ 0xA6 ^ (0x4E ^ 0x2F) ^ -" ".length()));
        RtspVersions.llIlIIIIlIIIll[1] = " ".length();
        RtspVersions.llIlIIIIlIIIll[2] = "  ".length();
        RtspVersions.llIlIIIIlIIIll[3] = "   ".length();
    }
    
    public static HttpVersion valueOf(String llllllllllllIllIllIllIIIlIIllllI) {
        if (lIIlIIIlIlIIlIll(llllllllllllIllIllIllIIIlIIllllI)) {
            throw new NullPointerException(RtspVersions.llIlIIIIlIIIIl[RtspVersions.llIlIIIIlIIIll[0]]);
        }
        llllllllllllIllIllIllIIIlIIllllI = llllllllllllIllIllIllIIIlIIllllI.trim().toUpperCase();
        if (lIIlIIIlIlIIllII(RtspVersions.llIlIIIIlIIIIl[RtspVersions.llIlIIIIlIIIll[1]].equals(llllllllllllIllIllIllIIIlIIllllI) ? 1 : 0)) {
            return RtspVersions.RTSP_1_0;
        }
        return new HttpVersion(llllllllllllIllIllIllIIIlIIllllI, (boolean)(RtspVersions.llIlIIIIlIIIll[1] != 0));
    }
}
