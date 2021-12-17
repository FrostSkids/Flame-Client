// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.internal.InternalThreadLocalMap;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

final class CookieEncoderUtil
{
    private static final /* synthetic */ int[] lIlllllllllIll;
    private static final /* synthetic */ String[] lIllllllIlllll;
    
    static void add(final StringBuilder llllllllllllIllllIIIlIlIlIlIllll, final String llllllllllllIllllIIIlIlIlIlIlllI, final String llllllllllllIllllIIIlIlIlIllIIII) {
        if (lIIIIllIIllIIlII(llllllllllllIllllIIIlIlIlIllIIII)) {
            addQuoted(llllllllllllIllllIIIlIlIlIlIllll, llllllllllllIllllIIIlIlIlIlIlllI, CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[1]]);
            return;
        }
        int llllllllllllIllllIIIlIlIlIllIIll = CookieEncoderUtil.lIlllllllllIll[1];
        while (lIIIIllIIllIIlIl(llllllllllllIllllIIIlIlIlIllIIll, llllllllllllIllllIIIlIlIlIllIIII.length())) {
            final char llllllllllllIllllIIIlIlIlIllIlII = llllllllllllIllllIIIlIlIlIllIIII.charAt(llllllllllllIllllIIIlIlIlIllIIll);
            switch (llllllllllllIllllIIIlIlIlIllIlII) {
                case '\t':
                case ' ':
                case '\"':
                case '(':
                case ')':
                case ',':
                case '/':
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                case '[':
                case '\\':
                case ']':
                case '{':
                case '}': {
                    addQuoted(llllllllllllIllllIIIlIlIlIlIllll, llllllllllllIllllIIIlIlIlIlIlllI, llllllllllllIllllIIIlIlIlIllIIII);
                    return;
                }
                default: {
                    ++llllllllllllIllllIIIlIlIlIllIIll;
                    "".length();
                    if (((0x4 ^ 0x20) & ~(0x4E ^ 0x6A)) <= -" ".length()) {
                        return;
                    }
                    continue;
                }
            }
        }
        addUnquoted(llllllllllllIllllIIIlIlIlIlIllll, llllllllllllIllllIIIlIlIlIlIlllI, llllllllllllIllllIIIlIlIlIllIIII);
    }
    
    private static void lIIIIllIIllIIIlI() {
        (lIlllllllllIll = new int[12])[0] = "  ".length();
        CookieEncoderUtil.lIlllllllllIll[1] = ((0xC7 ^ 0xC2) & ~(0xA1 ^ 0xA4));
        CookieEncoderUtil.lIlllllllllIll[2] = (0xCF ^ 0x85 ^ (0xF0 ^ 0x87));
        CookieEncoderUtil.lIlllllllllIll[3] = (0xA4 ^ 0x9F);
        CookieEncoderUtil.lIlllllllllIll[4] = (0x8 ^ 0x1F ^ (0x40 ^ 0x77));
        CookieEncoderUtil.lIlllllllllIll[5] = " ".length();
        CookieEncoderUtil.lIlllllllllIll[6] = (101 + 59 + 12 + 3 ^ 112 + 69 - 160 + 120);
        CookieEncoderUtil.lIlllllllllIll[7] = "   ".length();
        CookieEncoderUtil.lIlllllllllIll[8] = (0xC7 ^ 0xC3);
        CookieEncoderUtil.lIlllllllllIll[9] = (0x13 ^ 0x52 ^ (0xD1 ^ 0x95));
        CookieEncoderUtil.lIlllllllllIll[10] = (0x2D ^ 0x2B);
        CookieEncoderUtil.lIlllllllllIll[11] = (0x2 ^ 0xA);
    }
    
    private static boolean lIIIIllIIllIIlIl(final int llllllllllllIllllIIIlIlIIlIllIII, final int llllllllllllIllllIIIlIlIIlIlIlll) {
        return llllllllllllIllllIIIlIlIIlIllIII < llllllllllllIllllIIIlIlIIlIlIlll;
    }
    
    private static boolean lIIIIllIIllIIIll(final int llllllllllllIllllIIIlIlIIlIlIIll) {
        return llllllllllllIllllIIIlIlIIlIlIIll > 0;
    }
    
    private static String lIIIIllIIIIIIlIl(final String llllllllllllIllllIIIlIlIIllIlIll, final String llllllllllllIllllIIIlIlIIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIlIlIIllIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIlIlIIllIllll.init(CookieEncoderUtil.lIlllllllllIll[0], llllllllllllIllllIIIlIlIIlllIIII);
            return new String(llllllllllllIllllIIIlIlIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlIIllIlllI) {
            llllllllllllIllllIIIlIlIIllIlllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIllIIllIIIlI();
        lIIIIllIIIIIIlll();
    }
    
    private static String lIIIIllIIIIIIllI(final String llllllllllllIllllIIIlIlIIlIllllI, final String llllllllllllIllllIIIlIlIIlIlllll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlIIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), CookieEncoderUtil.lIlllllllllIll[11]), "DES");
            final Cipher llllllllllllIllllIIIlIlIIllIIIlI = Cipher.getInstance("DES");
            llllllllllllIllllIIIlIlIIllIIIlI.init(CookieEncoderUtil.lIlllllllllIll[0], llllllllllllIllllIIIlIlIIllIIIll);
            return new String(llllllllllllIllllIIIlIlIIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlIIllIIIIl) {
            llllllllllllIllllIIIlIlIIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIllIIlII(final Object llllllllllllIllllIIIlIlIIlIlIlIl) {
        return llllllllllllIllllIIIlIlIIlIlIlIl == null;
    }
    
    static String stripTrailingSeparator(final StringBuilder llllllllllllIllllIIIlIlIlIlllIll) {
        if (lIIIIllIIllIIIll(llllllllllllIllllIIIlIlIlIlllIll.length())) {
            llllllllllllIllllIIIlIlIlIlllIll.setLength(llllllllllllIllllIIIlIlIlIlllIll.length() - CookieEncoderUtil.lIlllllllllIll[0]);
        }
        return String.valueOf(llllllllllllIllllIIIlIlIlIlllIll);
    }
    
    static void add(final StringBuilder llllllllllllIllllIIIlIlIlIIlIlIl, final String llllllllllllIllllIIIlIlIlIIlIIIl, final long llllllllllllIllllIIIlIlIlIIlIIII) {
        llllllllllllIllllIIIlIlIlIIlIlIl.append(llllllllllllIllllIIIlIlIlIIlIIIl);
        "".length();
        llllllllllllIllllIIIlIlIlIIlIlIl.append((char)CookieEncoderUtil.lIlllllllllIll[2]);
        "".length();
        llllllllllllIllllIIIlIlIlIIlIlIl.append(llllllllllllIllllIIIlIlIlIIlIIII);
        "".length();
        llllllllllllIllllIIIlIlIlIIlIlIl.append((char)CookieEncoderUtil.lIlllllllllIll[3]);
        "".length();
        llllllllllllIllllIIIlIlIlIIlIlIl.append((char)CookieEncoderUtil.lIlllllllllIll[4]);
        "".length();
    }
    
    private static String lIIIIllIIIIIIlII(String llllllllllllIllllIIIlIlIIlllllIl, final String llllllllllllIllllIIIlIlIIlllllII) {
        llllllllllllIllllIIIlIlIIlllllIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIlIlIIlllllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIlIlIlIIIIIII = new StringBuilder();
        final char[] llllllllllllIllllIIIlIlIIlllllll = llllllllllllIllllIIIlIlIIlllllII.toCharArray();
        int llllllllllllIllllIIIlIlIIllllllI = CookieEncoderUtil.lIlllllllllIll[1];
        final long llllllllllllIllllIIIlIlIIllllIII = (Object)((String)llllllllllllIllllIIIlIlIIlllllIl).toCharArray();
        final boolean llllllllllllIllllIIIlIlIIlllIlll = llllllllllllIllllIIIlIlIIllllIII.length != 0;
        int llllllllllllIllllIIIlIlIIlllIllI = CookieEncoderUtil.lIlllllllllIll[1];
        while (lIIIIllIIllIIlIl(llllllllllllIllllIIIlIlIIlllIllI, llllllllllllIllllIIIlIlIIlllIlll ? 1 : 0)) {
            final char llllllllllllIllllIIIlIlIlIIIIIll = llllllllllllIllllIIIlIlIIllllIII[llllllllllllIllllIIIlIlIIlllIllI];
            llllllllllllIllllIIIlIlIlIIIIIII.append((char)(llllllllllllIllllIIIlIlIlIIIIIll ^ llllllllllllIllllIIIlIlIIlllllll[llllllllllllIllllIIIlIlIIllllllI % llllllllllllIllllIIIlIlIIlllllll.length]));
            "".length();
            ++llllllllllllIllllIIIlIlIIllllllI;
            ++llllllllllllIllllIIIlIlIIlllIllI;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIlIlIlIIIIIII);
    }
    
    static void addUnquoted(final StringBuilder llllllllllllIllllIIIlIlIlIlIIlll, final String llllllllllllIllllIIIlIlIlIlIIllI, final String llllllllllllIllllIIIlIlIlIlIIlIl) {
        llllllllllllIllllIIIlIlIlIlIIlll.append(llllllllllllIllllIIIlIlIlIlIIllI);
        "".length();
        llllllllllllIllllIIIlIlIlIlIIlll.append((char)CookieEncoderUtil.lIlllllllllIll[2]);
        "".length();
        llllllllllllIllllIIIlIlIlIlIIlll.append(llllllllllllIllllIIIlIlIlIlIIlIl);
        "".length();
        llllllllllllIllllIIIlIlIlIlIIlll.append((char)CookieEncoderUtil.lIlllllllllIll[3]);
        "".length();
        llllllllllllIllllIIIlIlIlIlIIlll.append((char)CookieEncoderUtil.lIlllllllllIll[4]);
        "".length();
    }
    
    private CookieEncoderUtil() {
    }
    
    static StringBuilder stringBuilder() {
        return InternalThreadLocalMap.get().stringBuilder();
    }
    
    static void addQuoted(final StringBuilder llllllllllllIllllIIIlIlIlIIllIll, final String llllllllllllIllllIIIlIlIlIIlllIl, String llllllllllllIllllIIIlIlIlIIllIIl) {
        if (lIIIIllIIllIIlII(llllllllllllIllllIIIlIlIlIIllIIl)) {
            llllllllllllIllllIIIlIlIlIIllIIl = CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[5]];
        }
        llllllllllllIllllIIIlIlIlIIllIll.append(llllllllllllIllllIIIlIlIlIIlllIl);
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append((char)CookieEncoderUtil.lIlllllllllIll[2]);
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append((char)CookieEncoderUtil.lIlllllllllIll[6]);
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append(((String)llllllllllllIllllIIIlIlIlIIllIIl).replace(CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[0]], CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[7]]).replace(CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[8]], CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[9]]));
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append((char)CookieEncoderUtil.lIlllllllllIll[6]);
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append((char)CookieEncoderUtil.lIlllllllllIll[3]);
        "".length();
        llllllllllllIllllIIIlIlIlIIllIll.append((char)CookieEncoderUtil.lIlllllllllIll[4]);
        "".length();
    }
    
    private static void lIIIIllIIIIIIlll() {
        (lIllllllIlllll = new String[CookieEncoderUtil.lIlllllllllIll[10]])[CookieEncoderUtil.lIlllllllllIll[1]] = lIIIIllIIIIIIlII("", "RhlvX");
        CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[5]] = lIIIIllIIIIIIlIl("hhEO0r3CNYE=", "HFTcj");
        CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[0]] = lIIIIllIIIIIIllI("pihLQ9YOA7I=", "RGfoa");
        CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[7]] = lIIIIllIIIIIIlIl("tHVsWXWLtSc=", "SsPmX");
        CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[8]] = lIIIIllIIIIIIlII("ZA==", "FGnpB");
        CookieEncoderUtil.lIllllllIlllll[CookieEncoderUtil.lIlllllllllIll[9]] = lIIIIllIIIIIIlII("BGQ=", "XFoYP");
    }
}
