// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;
import io.netty.buffer.Unpooled;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

final class WebSocketUtil
{
    private static final /* synthetic */ int[] llIIlllIllllll;
    private static final /* synthetic */ String[] llIIlllIllllIl;
    
    static byte[] randomBytes(final int llllllllllllIllIlllIlllIllIlIIlI) {
        final byte[] llllllllllllIllIlllIlllIllIlIIIl = new byte[llllllllllllIllIlllIlllIllIlIIlI];
        int llllllllllllIllIlllIlllIllIlIIll = WebSocketUtil.llIIlllIllllll[0];
        while (lIIlIIIIIIIIIIlI(llllllllllllIllIlllIlllIllIlIIll, llllllllllllIllIlllIlllIllIlIIlI)) {
            llllllllllllIllIlllIlllIllIlIIIl[llllllllllllIllIlllIlllIllIlIIll] = (byte)randomNumber(WebSocketUtil.llIIlllIllllll[0], WebSocketUtil.llIIlllIllllll[4]);
            ++llllllllllllIllIlllIlllIllIlIIll;
            "".length();
            if ((0xE3 ^ 0x8B ^ (0x49 ^ 0x25)) < 0) {
                return null;
            }
        }
        return llllllllllllIllIlllIlllIllIlIIIl;
    }
    
    static byte[] md5(final byte[] llllllllllllIllIlllIlllIlllIllII) {
        try {
            final MessageDigest llllllllllllIllIlllIlllIlllIlllI = MessageDigest.getInstance(WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[0]]);
            return llllllllllllIllIlllIlllIlllIlllI.digest(llllllllllllIllIlllIlllIlllIllII);
        }
        catch (NoSuchAlgorithmException llllllllllllIllIlllIlllIlllIllIl) {
            throw new InternalError(WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[1]]);
        }
    }
    
    private static String lIIIlllllllllIlI(String llllllllllllIllIlllIlllIlIllIlIl, final String llllllllllllIllIlllIlllIlIlllIIl) {
        llllllllllllIllIlllIlllIlIllIlIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIlllIlIllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlllIlIlllIII = new StringBuilder();
        final char[] llllllllllllIllIlllIlllIlIllIlll = llllllllllllIllIlllIlllIlIlllIIl.toCharArray();
        int llllllllllllIllIlllIlllIlIllIllI = WebSocketUtil.llIIlllIllllll[0];
        final char llllllllllllIllIlllIlllIlIllIIII = (Object)((String)llllllllllllIllIlllIlllIlIllIlIl).toCharArray();
        final float llllllllllllIllIlllIlllIlIlIllll = llllllllllllIllIlllIlllIlIllIIII.length;
        byte llllllllllllIllIlllIlllIlIlIlllI = (byte)WebSocketUtil.llIIlllIllllll[0];
        while (lIIlIIIIIIIIIIlI(llllllllllllIllIlllIlllIlIlIlllI, (int)llllllllllllIllIlllIlllIlIlIllll)) {
            final char llllllllllllIllIlllIlllIlIlllIll = llllllllllllIllIlllIlllIlIllIIII[llllllllllllIllIlllIlllIlIlIlllI];
            llllllllllllIllIlllIlllIlIlllIII.append((char)(llllllllllllIllIlllIlllIlIlllIll ^ llllllllllllIllIlllIlllIlIllIlll[llllllllllllIllIlllIlllIlIllIllI % llllllllllllIllIlllIlllIlIllIlll.length]));
            "".length();
            ++llllllllllllIllIlllIlllIlIllIllI;
            ++llllllllllllIllIlllIlllIlIlIlllI;
            "".length();
            if ("   ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlllIlIlllIII);
    }
    
    private static String lIIIlllllllllIll(final String llllllllllllIllIlllIlllIlIlIIIll, final String llllllllllllIllIlllIlllIlIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlllIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlllIlIlIIlII.getBytes(StandardCharsets.UTF_8)), WebSocketUtil.llIIlllIllllll[6]), "DES");
            final Cipher llllllllllllIllIlllIlllIlIlIIlll = Cipher.getInstance("DES");
            llllllllllllIllIlllIlllIlIlIIlll.init(WebSocketUtil.llIIlllIllllll[2], llllllllllllIllIlllIlllIlIlIlIII);
            return new String(llllllllllllIllIlllIlllIlIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlllIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlllIlIlIIllI) {
            llllllllllllIllIlllIlllIlIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllllllllllII() {
        (llIIlllIllllIl = new String[WebSocketUtil.llIIlllIllllll[5]])[WebSocketUtil.llIIlllIllllll[0]] = lIIIlllllllllIlI("Gxd4", "VSMQC");
        WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[1]] = lIIIlllllllllIlI("NB5eTzkWLkscIgkqBB0jHD5LADlZLgMGJFkqBw4jHzUZAndUeiQaIx07HwozRg==", "yZkoW");
        WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[2]] = lIIIlllllllllIlI("BwcqYQ==", "TOkPo");
        WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[3]] = lIIIlllllllllIll("vpQLvejk9xluXvU3sqL/aMwYv03nxxirDGetXnsMQ87/abiMAR3yfdGiB06czYJRybBFUSO4QLQ=", "mBeKt");
    }
    
    static byte[] sha1(final byte[] llllllllllllIllIlllIlllIlllIIlIl) {
        try {
            final MessageDigest llllllllllllIllIlllIlllIlllIIlll = MessageDigest.getInstance(WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[2]]);
            return llllllllllllIllIlllIlllIlllIIlll.digest(llllllllllllIllIlllIlllIlllIIlIl);
        }
        catch (NoSuchAlgorithmException llllllllllllIllIlllIlllIlllIIllI) {
            throw new InternalError(WebSocketUtil.llIIlllIllllIl[WebSocketUtil.llIIlllIllllll[3]]);
        }
    }
    
    static {
        lIIlIIIIIIIIIIIl();
        lIIIllllllllllII();
    }
    
    static int randomNumber(final int llllllllllllIllIlllIlllIllIIlIll, final int llllllllllllIllIlllIlllIllIIlIII) {
        return (int)(Math.random() * llllllllllllIllIlllIlllIllIIlIII + llllllllllllIllIlllIlllIllIIlIll);
    }
    
    private WebSocketUtil() {
    }
    
    private static void lIIlIIIIIIIIIIIl() {
        (llIIlllIllllll = new int[7])[0] = ((0xE ^ 0x43 ^ (0xD4 ^ 0x94)) & (121 + 72 - 122 + 60 ^ 89 + 95 - 100 + 58 ^ -" ".length()));
        WebSocketUtil.llIIlllIllllll[1] = " ".length();
        WebSocketUtil.llIIlllIllllll[2] = "  ".length();
        WebSocketUtil.llIIlllIllllll[3] = "   ".length();
        WebSocketUtil.llIIlllIllllll[4] = (0x3 ^ 0x7D) + (0x81 ^ 0x8B) - -(0x6D ^ 0xC) + (0x96 ^ 0x80);
        WebSocketUtil.llIIlllIllllll[5] = (0x60 ^ 0x64);
        WebSocketUtil.llIIlllIllllll[6] = (0x4E ^ 0x4A ^ (0x8 ^ 0x4));
    }
    
    private static boolean lIIlIIIIIIIIIIlI(final int llllllllllllIllIlllIlllIlIIlllIl, final int llllllllllllIllIlllIlllIlIIlllII) {
        return llllllllllllIllIlllIlllIlIIlllIl < llllllllllllIllIlllIlllIlIIlllII;
    }
    
    static String base64(final byte[] llllllllllllIllIlllIlllIllIllIlI) {
        final ByteBuf llllllllllllIllIlllIlllIllIlllIl = Unpooled.wrappedBuffer(llllllllllllIllIlllIlllIllIllIlI);
        final ByteBuf llllllllllllIllIlllIlllIllIlllII = io.netty.handler.codec.base64.Base64.encode(llllllllllllIllIlllIlllIllIlllIl);
        final String llllllllllllIllIlllIlllIllIllIll = llllllllllllIllIlllIlllIllIlllII.toString(CharsetUtil.UTF_8);
        llllllllllllIllIlllIlllIllIlllII.release();
        "".length();
        return llllllllllllIllIlllIlllIllIllIll;
    }
}
