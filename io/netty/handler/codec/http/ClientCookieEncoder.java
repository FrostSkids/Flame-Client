// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class ClientCookieEncoder
{
    private static final /* synthetic */ int[] lIlIIllIIIIIlI;
    private static final /* synthetic */ String[] lIlIIlIlllllIl;
    
    private ClientCookieEncoder() {
    }
    
    private static String lllIIlllIIllIlI(String lllllllllllllIIIllIlIIlIlIlllllI, final String lllllllllllllIIIllIlIIlIllIIIIlI) {
        lllllllllllllIIIllIlIIlIlIlllllI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIlIIlIlIlllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIlIIlIllIIIIIl = new StringBuilder();
        final char[] lllllllllllllIIIllIlIIlIllIIIIII = lllllllllllllIIIllIlIIlIllIIIIlI.toCharArray();
        int lllllllllllllIIIllIlIIlIlIllllll = ClientCookieEncoder.lIlIIllIIIIIlI[0];
        final double lllllllllllllIIIllIlIIlIlIlllIIl = (Object)((String)lllllllllllllIIIllIlIIlIlIlllllI).toCharArray();
        final Exception lllllllllllllIIIllIlIIlIlIlllIII = (Exception)lllllllllllllIIIllIlIIlIlIlllIIl.length;
        byte lllllllllllllIIIllIlIIlIlIllIlll = (byte)ClientCookieEncoder.lIlIIllIIIIIlI[0];
        while (lllIIlllIlIIIlI(lllllllllllllIIIllIlIIlIlIllIlll, (int)lllllllllllllIIIllIlIIlIlIlllIII)) {
            final char lllllllllllllIIIllIlIIlIllIIIlII = lllllllllllllIIIllIlIIlIlIlllIIl[lllllllllllllIIIllIlIIlIlIllIlll];
            lllllllllllllIIIllIlIIlIllIIIIIl.append((char)(lllllllllllllIIIllIlIIlIllIIIlII ^ lllllllllllllIIIllIlIIlIllIIIIII[lllllllllllllIIIllIlIIlIlIllllll % lllllllllllllIIIllIlIIlIllIIIIII.length]));
            "".length();
            ++lllllllllllllIIIllIlIIlIlIllllll;
            ++lllllllllllllIIIllIlIIlIlIllIlll;
            "".length();
            if ((0x66 ^ 0x7C ^ (0x72 ^ 0x6C)) < (0x50 ^ 0x6F ^ (0xE ^ 0x35))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIlIIlIllIIIIIl);
    }
    
    private static void encode(final StringBuilder lllllllllllllIIIllIlIIlIllllIIII, final Cookie lllllllllllllIIIllIlIIlIlllIllll) {
        if (lllIIlllIlIIlII(lllllllllllllIIIllIlIIlIlllIllll.getVersion(), ClientCookieEncoder.lIlIIllIIIIIlI[1])) {
            CookieEncoderUtil.add(lllllllllllllIIIllIlIIlIllllIIII, ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[3]], 1L);
        }
        CookieEncoderUtil.add(lllllllllllllIIIllIlIIlIllllIIII, lllllllllllllIIIllIlIIlIlllIllll.getName(), lllllllllllllIIIllIlIIlIlllIllll.getValue());
        if (lllIIlllIlIIlIl(lllllllllllllIIIllIlIIlIlllIllll.getPath())) {
            CookieEncoderUtil.add(lllllllllllllIIIllIlIIlIllllIIII, ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[4]], lllllllllllllIIIllIlIIlIlllIllll.getPath());
        }
        if (lllIIlllIlIIlIl(lllllllllllllIIIllIlIIlIlllIllll.getDomain())) {
            CookieEncoderUtil.add(lllllllllllllIIIllIlIIlIllllIIII, ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[5]], lllllllllllllIIIllIlIIlIlllIllll.getDomain());
        }
        if (lllIIlllIlIIlII(lllllllllllllIIIllIlIIlIlllIllll.getVersion(), ClientCookieEncoder.lIlIIllIIIIIlI[1]) && lllIIlllIlIIllI(lllllllllllllIIIllIlIIlIlllIllll.getPorts().isEmpty() ? 1 : 0)) {
            lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[6]);
            "".length();
            lllllllllllllIIIllIlIIlIllllIIII.append(ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[7]]);
            "".length();
            lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[8]);
            "".length();
            lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[9]);
            "".length();
            final Iterator lllllllllllllIIIllIlIIlIllllIIIl = lllllllllllllIIIllIlIIlIlllIllll.getPorts().iterator();
            while (lllIIlllIlIIIll(lllllllllllllIIIllIlIIlIllllIIIl.hasNext() ? 1 : 0)) {
                final int lllllllllllllIIIllIlIIlIllllIIlI = lllllllllllllIIIllIlIIlIllllIIIl.next();
                lllllllllllllIIIllIlIIlIllllIIII.append(lllllllllllllIIIllIlIIlIllllIIlI);
                "".length();
                lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[10]);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            lllllllllllllIIIllIlIIlIllllIIII.setCharAt(lllllllllllllIIIllIlIIlIllllIIII.length() - ClientCookieEncoder.lIlIIllIIIIIlI[1], (char)ClientCookieEncoder.lIlIIllIIIIIlI[9]);
            lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[11]);
            "".length();
            lllllllllllllIIIllIlIIlIllllIIII.append((char)ClientCookieEncoder.lIlIIllIIIIIlI[12]);
            "".length();
        }
    }
    
    private static boolean lllIIlllIlIIIll(final int lllllllllllllIIIllIlIIlIlIlIlIII) {
        return lllllllllllllIIIllIlIIlIlIlIlIII != 0;
    }
    
    private static boolean lllIIlllIlIIlIl(final Object lllllllllllllIIIllIlIIlIlIlIllII) {
        return lllllllllllllIIIllIlIIlIlIlIllII != null;
    }
    
    private static String lllIIlllIIllIII(final String lllllllllllllIIIllIlIIlIllIlIIll, final String lllllllllllllIIIllIlIIlIllIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIlIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlIIlIllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlIIlIllIlIlIl.init(ClientCookieEncoder.lIlIIllIIIIIlI[2], lllllllllllllIIIllIlIIlIllIlIllI);
            return new String(lllllllllllllIIIllIlIIlIllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIlIllIlIlII) {
            lllllllllllllIIIllIlIIlIllIlIlII.printStackTrace();
            return null;
        }
    }
    
    public static String encode(final Cookie... lllllllllllllIIIllIlIIllIIIIlIII) {
        if (lllIIlllIlIIIIl(lllllllllllllIIIllIlIIllIIIIlIII)) {
            throw new NullPointerException(ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[1]]);
        }
        final StringBuilder lllllllllllllIIIllIlIIllIIIIlIIl = CookieEncoderUtil.stringBuilder();
        final Cookie[] lllllllllllllIIIllIlIIllIIIIllIl = lllllllllllllIIIllIlIIllIIIIlIII;
        final int lllllllllllllIIIllIlIIllIIIIllII = lllllllllllllIIIllIlIIllIIIIllIl.length;
        int lllllllllllllIIIllIlIIllIIIIlIll = ClientCookieEncoder.lIlIIllIIIIIlI[0];
        while (lllIIlllIlIIIlI(lllllllllllllIIIllIlIIllIIIIlIll, lllllllllllllIIIllIlIIllIIIIllII)) {
            final Cookie lllllllllllllIIIllIlIIllIIIIlllI = lllllllllllllIIIllIlIIllIIIIllIl[lllllllllllllIIIllIlIIllIIIIlIll];
            if (lllIIlllIlIIIIl(lllllllllllllIIIllIlIIllIIIIlllI)) {
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
                break;
            }
            else {
                encode(lllllllllllllIIIllIlIIllIIIIlIIl, lllllllllllllIIIllIlIIllIIIIlllI);
                ++lllllllllllllIIIllIlIIllIIIIlIll;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                continue;
            }
        }
        return CookieEncoderUtil.stripTrailingSeparator(lllllllllllllIIIllIlIIllIIIIlIIl);
    }
    
    public static String encode(final Iterable<Cookie> lllllllllllllIIIllIlIIlIllllllII) {
        if (lllIIlllIlIIIIl(lllllllllllllIIIllIlIIlIllllllII)) {
            throw new NullPointerException(ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[2]]);
        }
        final StringBuilder lllllllllllllIIIllIlIIlIlllllIll = CookieEncoderUtil.stringBuilder();
        final Iterator lllllllllllllIIIllIlIIlIllllllIl = lllllllllllllIIIllIlIIlIllllllII.iterator();
        while (lllIIlllIlIIIll(lllllllllllllIIIllIlIIlIllllllIl.hasNext() ? 1 : 0)) {
            final Cookie lllllllllllllIIIllIlIIlIlllllllI = lllllllllllllIIIllIlIIlIllllllIl.next();
            if (lllIIlllIlIIIIl(lllllllllllllIIIllIlIIlIlllllllI)) {
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                encode(lllllllllllllIIIllIlIIlIlllllIll, lllllllllllllIIIllIlIIlIlllllllI);
                "".length();
                if (-" ".length() > ((0x67 ^ 0x28) & ~(0xF6 ^ 0xB9))) {
                    return null;
                }
                continue;
            }
        }
        return CookieEncoderUtil.stripTrailingSeparator(lllllllllllllIIIllIlIIlIlllllIll);
    }
    
    private static void lllIIlllIlIIIII() {
        (lIlIIllIIIIIlI = new int[15])[0] = ((0x84 ^ 0x81) & ~(0x91 ^ 0x94));
        ClientCookieEncoder.lIlIIllIIIIIlI[1] = " ".length();
        ClientCookieEncoder.lIlIIllIIIIIlI[2] = "  ".length();
        ClientCookieEncoder.lIlIIllIIIIIlI[3] = "   ".length();
        ClientCookieEncoder.lIlIIllIIIIIlI[4] = (0xA7 ^ 0xA3);
        ClientCookieEncoder.lIlIIllIIIIIlI[5] = (0x33 ^ 0x36);
        ClientCookieEncoder.lIlIIllIIIIIlI[6] = (0x0 ^ 0x24);
        ClientCookieEncoder.lIlIIllIIIIIlI[7] = (0x73 ^ 0x75);
        ClientCookieEncoder.lIlIIllIIIIIlI[8] = (0x89 ^ 0xB4);
        ClientCookieEncoder.lIlIIllIIIIIlI[9] = (0x11 ^ 0x51 ^ (0xEA ^ 0x88));
        ClientCookieEncoder.lIlIIllIIIIIlI[10] = (0x51 ^ 0x7D);
        ClientCookieEncoder.lIlIIllIIIIIlI[11] = (0x26 ^ 0x1D);
        ClientCookieEncoder.lIlIIllIIIIIlI[12] = (116 + 85 - 68 + 3 ^ 73 + 14 - 38 + 119);
        ClientCookieEncoder.lIlIIllIIIIIlI[13] = (0x58 ^ 0x5F);
        ClientCookieEncoder.lIlIIllIIIIIlI[14] = (0x12 ^ 0x1A);
    }
    
    static {
        lllIIlllIlIIIII();
        lllIIlllIIllIll();
    }
    
    private static boolean lllIIlllIlIIlII(final int lllllllllllllIIIllIlIIlIlIllIIll, final int lllllllllllllIIIllIlIIlIlIllIIlI) {
        return lllllllllllllIIIllIlIIlIlIllIIll >= lllllllllllllIIIllIlIIlIlIllIIlI;
    }
    
    private static boolean lllIIlllIlIIllI(final int lllllllllllllIIIllIlIIlIlIlIIllI) {
        return lllllllllllllIIIllIlIIlIlIlIIllI == 0;
    }
    
    public static String encode(final Cookie lllllllllllllIIIllIlIIllIIIlIllI) {
        if (lllIIlllIlIIIIl(lllllllllllllIIIllIlIIllIIIlIllI)) {
            throw new NullPointerException(ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[0]]);
        }
        final StringBuilder lllllllllllllIIIllIlIIllIIIlIlll = CookieEncoderUtil.stringBuilder();
        encode(lllllllllllllIIIllIlIIllIIIlIlll, lllllllllllllIIIllIlIIllIIIlIllI);
        return CookieEncoderUtil.stripTrailingSeparator(lllllllllllllIIIllIlIIllIIIlIlll);
    }
    
    private static boolean lllIIlllIlIIIIl(final Object lllllllllllllIIIllIlIIlIlIlIlIlI) {
        return lllllllllllllIIIllIlIIlIlIlIlIlI == null;
    }
    
    private static String lllIIlllIIllIIl(final String lllllllllllllIIIllIlIIlIlllIIIII, final String lllllllllllllIIIllIlIIlIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIlIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), ClientCookieEncoder.lIlIIllIIIIIlI[14]), "DES");
            final Cipher lllllllllllllIIIllIlIIlIlllIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIlIIlIlllIIIlI.init(ClientCookieEncoder.lIlIIllIIIIIlI[2], lllllllllllllIIIllIlIIlIlllIIIll);
            return new String(lllllllllllllIIIllIlIIlIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIlIlllIIIIl) {
            lllllllllllllIIIllIlIIlIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlllIlIIIlI(final int lllllllllllllIIIllIlIIlIlIlIllll, final int lllllllllllllIIIllIlIIlIlIlIlllI) {
        return lllllllllllllIIIllIlIIlIlIlIllll < lllllllllllllIIIllIlIIlIlIlIlllI;
    }
    
    private static void lllIIlllIIllIll() {
        (lIlIIlIlllllIl = new String[ClientCookieEncoder.lIlIIllIIIIIlI[13]])[ClientCookieEncoder.lIlIIllIIIIIlI[0]] = lllIIlllIIllIII("WRQo+zgxh5A=", "TAJYO");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[1]] = lllIIlllIIllIIl("k3p4MrfKw80=", "TaPpz");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[2]] = lllIIlllIIllIIl("wwqBuE9Q/TQ=", "FsfVg");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[3]] = lllIIlllIIllIIl("aBwU6DQHOm/HXZuBsAM9lA==", "LQAhI");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[4]] = lllIIlllIIllIII("gH8XTtMBYAo=", "hkRIe");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[5]] = lllIIlllIIllIIl("spOcXGPyX28=", "ulwkS");
        ClientCookieEncoder.lIlIIlIlllllIl[ClientCookieEncoder.lIlIIllIIIIIlI[7]] = lllIIlllIIllIlI("HSkqDQ==", "MFXyL");
    }
    
    public static String encode(final String lllllllllllllIIIllIlIIllIIIlllII, final String lllllllllllllIIIllIlIIllIIIllIll) {
        return encode(new DefaultCookie(lllllllllllllIIIllIlIIllIIIlllII, lllllllllllllIIIllIlIIllIIIllIll));
    }
}
