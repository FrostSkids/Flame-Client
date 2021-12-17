// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.Map;
import java.nio.charset.CodingErrorAction;
import io.netty.util.internal.InternalThreadLocalMap;
import java.nio.charset.CharsetEncoder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.charset.Charset;

public final class CharsetUtil
{
    private static final /* synthetic */ int[] lIIIIllIlIllII;
    private static final /* synthetic */ String[] lIIIIllIlIlIII;
    
    private static boolean lIlllIllllIIlll(final Object lllllllllllllIlIIlIIlIIllIIlllIl) {
        return lllllllllllllIlIIlIIlIIllIIlllIl != null;
    }
    
    private CharsetUtil() {
    }
    
    private static boolean lIlllIllllIIllI(final Object lllllllllllllIlIIlIIlIIllIIllIll) {
        return lllllllllllllIlIIlIIlIIllIIllIll == null;
    }
    
    static {
        lIlllIllllIIlIl();
        lIlllIllllIIIlI();
        UTF_16 = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[2]]);
        UTF_16BE = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[3]]);
        UTF_16LE = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[4]]);
        UTF_8 = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[5]]);
        ISO_8859_1 = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[6]]);
        US_ASCII = Charset.forName(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[7]]);
    }
    
    private static String lIlllIlllIllIIl(final String lllllllllllllIlIIlIIlIIllIllIlIl, final String lllllllllllllIlIIlIIlIIllIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIIllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIlIIllIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIlIIllIllIlll.init(CharsetUtil.lIIIIllIlIllII[2], lllllllllllllIlIIlIIlIIllIlllIII);
            return new String(lllllllllllllIlIIlIIlIIllIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIIllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIIllIllIllI) {
            lllllllllllllIlIIlIIlIIllIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIllllIIlIl() {
        (lIIIIllIlIllII = new int[9])[0] = ((0x4 ^ 0x28) & ~(0x6E ^ 0x42));
        CharsetUtil.lIIIIllIlIllII[1] = " ".length();
        CharsetUtil.lIIIIllIlIllII[2] = "  ".length();
        CharsetUtil.lIIIIllIlIllII[3] = "   ".length();
        CharsetUtil.lIIIIllIlIllII[4] = (0x81 ^ 0x85);
        CharsetUtil.lIIIIllIlIllII[5] = (0x9C ^ 0xAE ^ (0xA4 ^ 0x93));
        CharsetUtil.lIIIIllIlIllII[6] = (37 + 69 + 17 + 55 ^ 29 + 102 - 84 + 133);
        CharsetUtil.lIIIIllIlIllII[7] = (0x39 ^ 0x3E);
        CharsetUtil.lIIIIllIlIllII[8] = (0xA ^ 0x2);
    }
    
    private static void lIlllIllllIIIlI() {
        (lIIIIllIlIlIII = new String[CharsetUtil.lIIIIllIlIllII[8]])[CharsetUtil.lIIIIllIlIllII[0]] = lIlllIlllIllIIl("Kwh8BoD8+Zk=", "ScfcM");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[1]] = lIlllIlllIllIlI("OyYiIyk9Og==", "XNCQZ");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[2]] = lIlllIlllIllIIl("D0ZFz630clY=", "hkOKz");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[3]] = lIlllIlllIllIlI("IxUBQ3lAAwI=", "vAGnH");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[4]] = lIlllIllllIIIIl("72x/2CjNaoCUvk7UMyCqmQ==", "QsCZx");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[5]] = lIlllIlllIllIIl("G2hZbM4u8rY=", "vIuwX");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[6]] = lIlllIlllIllIlI("LBYAW0pdcHZbQw==", "eEOvr");
        CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[7]] = lIlllIlllIllIlI("JzdPCj4xLSs=", "rdbKm");
    }
    
    public static CharsetEncoder getEncoder(final Charset lllllllllllllIlIIlIIlIIllllIIllI) {
        if (lIlllIllllIIllI(lllllllllllllIlIIlIIlIIllllIIllI)) {
            throw new NullPointerException(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[0]]);
        }
        final Map<Charset, CharsetEncoder> lllllllllllllIlIIlIIlIIllllIIlIl = InternalThreadLocalMap.get().charsetEncoderCache();
        CharsetEncoder lllllllllllllIlIIlIIlIIllllIIlII = lllllllllllllIlIIlIIlIIllllIIlIl.get(lllllllllllllIlIIlIIlIIllllIIllI);
        if (lIlllIllllIIlll(lllllllllllllIlIIlIIlIIllllIIlII)) {
            lllllllllllllIlIIlIIlIIllllIIlII.reset();
            "".length();
            lllllllllllllIlIIlIIlIIllllIIlII.onMalformedInput(CodingErrorAction.REPLACE);
            "".length();
            lllllllllllllIlIIlIIlIIllllIIlII.onUnmappableCharacter(CodingErrorAction.REPLACE);
            "".length();
            return lllllllllllllIlIIlIIlIIllllIIlII;
        }
        lllllllllllllIlIIlIIlIIllllIIlII = lllllllllllllIlIIlIIlIIllllIIllI.newEncoder();
        lllllllllllllIlIIlIIlIIllllIIlII.onMalformedInput(CodingErrorAction.REPLACE);
        "".length();
        lllllllllllllIlIIlIIlIIllllIIlII.onUnmappableCharacter(CodingErrorAction.REPLACE);
        "".length();
        lllllllllllllIlIIlIIlIIllllIIlIl.put(lllllllllllllIlIIlIIlIIllllIIllI, lllllllllllllIlIIlIIlIIllllIIlII);
        "".length();
        return lllllllllllllIlIIlIIlIIllllIIlII;
    }
    
    private static String lIlllIlllIllIlI(String lllllllllllllIlIIlIIlIIlllIIIlIl, final String lllllllllllllIlIIlIIlIIlllIIlIIl) {
        lllllllllllllIlIIlIIlIIlllIIIlIl = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIlIIlllIIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIlIIlllIIlIII = new StringBuilder();
        final char[] lllllllllllllIlIIlIIlIIlllIIIlll = lllllllllllllIlIIlIIlIIlllIIlIIl.toCharArray();
        int lllllllllllllIlIIlIIlIIlllIIIllI = CharsetUtil.lIIIIllIlIllII[0];
        final boolean lllllllllllllIlIIlIIlIIlllIIIIII = (Object)((String)lllllllllllllIlIIlIIlIIlllIIIlIl).toCharArray();
        final long lllllllllllllIlIIlIIlIIllIllllll = lllllllllllllIlIIlIIlIIlllIIIIII.length;
        float lllllllllllllIlIIlIIlIIllIlllllI = CharsetUtil.lIIIIllIlIllII[0];
        while (lIlllIllllIlIII((int)lllllllllllllIlIIlIIlIIllIlllllI, (int)lllllllllllllIlIIlIIlIIllIllllll)) {
            final char lllllllllllllIlIIlIIlIIlllIIlIll = lllllllllllllIlIIlIIlIIlllIIIIII[lllllllllllllIlIIlIIlIIllIlllllI];
            lllllllllllllIlIIlIIlIIlllIIlIII.append((char)(lllllllllllllIlIIlIIlIIlllIIlIll ^ lllllllllllllIlIIlIIlIIlllIIIlll[lllllllllllllIlIIlIIlIIlllIIIllI % lllllllllllllIlIIlIIlIIlllIIIlll.length]));
            "".length();
            ++lllllllllllllIlIIlIIlIIlllIIIllI;
            ++lllllllllllllIlIIlIIlIIllIlllllI;
            "".length();
            if (("   ".length() & ~"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIlIIlllIIlIII);
    }
    
    private static boolean lIlllIllllIlIII(final int lllllllllllllIlIIlIIlIIllIlIIIII, final int lllllllllllllIlIIlIIlIIllIIlllll) {
        return lllllllllllllIlIIlIIlIIllIlIIIII < lllllllllllllIlIIlIIlIIllIIlllll;
    }
    
    private static String lIlllIllllIIIIl(final String lllllllllllllIlIIlIIlIIllIlIlIII, final String lllllllllllllIlIIlIIlIIllIlIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIIllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), CharsetUtil.lIIIIllIlIllII[8]), "DES");
            final Cipher lllllllllllllIlIIlIIlIIllIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlIIllIlIlIlI.init(CharsetUtil.lIIIIllIlIllII[2], lllllllllllllIlIIlIIlIIllIlIlIll);
            return new String(lllllllllllllIlIIlIIlIIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIIllIlIlIIl) {
            lllllllllllllIlIIlIIlIIllIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public static CharsetDecoder getDecoder(final Charset lllllllllllllIlIIlIIlIIlllIlllIl) {
        if (lIlllIllllIIllI(lllllllllllllIlIIlIIlIIlllIlllIl)) {
            throw new NullPointerException(CharsetUtil.lIIIIllIlIlIII[CharsetUtil.lIIIIllIlIllII[1]]);
        }
        final Map<Charset, CharsetDecoder> lllllllllllllIlIIlIIlIIlllIlllII = InternalThreadLocalMap.get().charsetDecoderCache();
        CharsetDecoder lllllllllllllIlIIlIIlIIlllIllIll = lllllllllllllIlIIlIIlIIlllIlllII.get(lllllllllllllIlIIlIIlIIlllIlllIl);
        if (lIlllIllllIIlll(lllllllllllllIlIIlIIlIIlllIllIll)) {
            lllllllllllllIlIIlIIlIIlllIllIll.reset();
            "".length();
            lllllllllllllIlIIlIIlIIlllIllIll.onMalformedInput(CodingErrorAction.REPLACE);
            "".length();
            lllllllllllllIlIIlIIlIIlllIllIll.onUnmappableCharacter(CodingErrorAction.REPLACE);
            "".length();
            return lllllllllllllIlIIlIIlIIlllIllIll;
        }
        lllllllllllllIlIIlIIlIIlllIllIll = lllllllllllllIlIIlIIlIIlllIlllIl.newDecoder();
        lllllllllllllIlIIlIIlIIlllIllIll.onMalformedInput(CodingErrorAction.REPLACE);
        "".length();
        lllllllllllllIlIIlIIlIIlllIllIll.onUnmappableCharacter(CodingErrorAction.REPLACE);
        "".length();
        lllllllllllllIlIIlIIlIIlllIlllII.put(lllllllllllllIlIIlIIlIIlllIlllIl, lllllllllllllIlIIlIIlIIlllIllIll);
        "".length();
        return lllllllllllllIlIIlIIlIIlllIllIll;
    }
}
