// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Formatter;
import java.io.IOException;

public final class StringUtil
{
    private static final /* synthetic */ String[] lIlIIlllIIIIlI;
    private static final /* synthetic */ String[] BYTE2HEX_NOPAD;
    private static final /* synthetic */ int[] lIlIIlllIIIIll;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ String[] BYTE2HEX_PAD;
    
    public static String toHexStringPadded(final byte[] lllllllllllllIIIllIIIIllIllIlIII) {
        return toHexStringPadded(lllllllllllllIIIllIIIIllIllIlIII, StringUtil.lIlIIlllIIIIll[0], lllllllllllllIIIllIIIIllIllIlIII.length);
    }
    
    private StringUtil() {
    }
    
    private static boolean lllIlIIIllIIlII(final int lllllllllllllIIIllIIIIlIlIllIlIl) {
        return lllllllllllllIIIllIIIIlIlIllIlIl != 0;
    }
    
    private static void lllIlIIIlIlIlll() {
        (lIlIIlllIIIIlI = new String[StringUtil.lIlIIlllIIIIll[12]])[StringUtil.lIlIIlllIIIIll[0]] = lllIlIIIlIlIIll("4BCbaaXhDOo=", "WMuZG");
        StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[1]] = lllIlIIIlIlIlII("Pxg1DTk+DzMEBSU=", "QmYaf");
        StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[3]] = lllIlIIIlIlIlII("OzYHHgs2LwoBJw==", "UCkrT");
        StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[4]] = lllIlIIIlIlIIll("vYCLz72Bkfw=", "iMffY");
        StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[6]] = lllIlIIIlIlIlIl("qqn3nua0m9M=", "WsFfZ");
        StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[7]] = lllIlIIIlIlIIll("QuQNEG1DwuA=", "INUUe");
    }
    
    private static boolean lllIlIIIllIIIlI(final int lllllllllllllIIIllIIIIlIlIlIllII, final int lllllllllllllIIIllIIIIlIlIlIlIll) {
        return lllllllllllllIIIllIIIIlIlIlIllII != lllllllllllllIIIllIIIIlIlIlIlIll;
    }
    
    public static <T extends Appendable> T byteToHexStringPadded(final T lllllllllllllIIIllIIIIllIllIllll, final int lllllllllllllIIIllIIIIllIllIllII) {
        try {
            lllllllllllllIIIllIIIIllIllIllll.append(byteToHexStringPadded(lllllllllllllIIIllIIIIllIllIllII));
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIIllIIIIllIlllIIII) {
            PlatformDependent.throwException(lllllllllllllIIIllIIIIllIlllIIII);
        }
        return lllllllllllllIIIllIIIIllIllIllll;
    }
    
    public static <T extends Appendable> T byteToHexString(final T lllllllllllllIIIllIIIIllIIllllll, final int lllllllllllllIIIllIIIIllIIllllII) {
        try {
            lllllllllllllIIIllIIIIllIIllllll.append(byteToHexString(lllllllllllllIIIllIIIIllIIllllII));
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIIllIIIIllIlIIIIII) {
            PlatformDependent.throwException(lllllllllllllIIIllIIIIllIlIIIIII);
        }
        return lllllllllllllIIIllIIIIllIIllllll;
    }
    
    private static boolean lllIlIIIllIIlIl(final int lllllllllllllIIIllIIIIlIlIlIllll) {
        return lllllllllllllIIIllIIIIlIlIlIllll < 0;
    }
    
    static {
        lllIlIIIlIllllI();
        lllIlIIIlIlIlll();
        EMPTY_STRING = StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[4]];
        int $assertionsDisabled2;
        if (lllIlIIIllIIIIl(StringUtil.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = StringUtil.lIlIIlllIIIIll[1];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = StringUtil.lIlIIlllIIIIll[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        BYTE2HEX_PAD = new String[StringUtil.lIlIIlllIIIIll[5]];
        BYTE2HEX_NOPAD = new String[StringUtil.lIlIIlllIIIIll[5]];
        String lllllllllllllIIIllIIIIlIlllllIlI;
        try {
            lllllllllllllIIIllIIIIlIlllllIlI = new Formatter().format(StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[6]], new Object[StringUtil.lIlIIlllIIIIll[0]]).toString();
            "".length();
            if ((128 + 53 - 100 + 53 ^ 97 + 14 - 82 + 102) == 0x0) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIllIIIIllIIIIIIII) {
            lllllllllllllIIIllIIIIlIlllllIlI = StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[7]];
        }
        NEWLINE = lllllllllllllIIIllIIIIlIlllllIlI;
        int lllllllllllllIIIllIIIIlIlllllIIl = StringUtil.lIlIIlllIIIIll[0];
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIlIlllllIIl, StringUtil.lIlIIlllIIIIll[8])) {
            final StringBuilder lllllllllllllIIIllIIIIlIllllllll = new StringBuilder(StringUtil.lIlIIlllIIIIll[3]);
            lllllllllllllIIIllIIIIlIllllllll.append((char)StringUtil.lIlIIlllIIIIll[9]);
            "".length();
            lllllllllllllIIIllIIIIlIllllllll.append(lllllllllllllIIIllIIIIlIlllllIIl);
            "".length();
            StringUtil.BYTE2HEX_PAD[lllllllllllllIIIllIIIIlIlllllIIl] = String.valueOf(lllllllllllllIIIllIIIIlIllllllll);
            StringUtil.BYTE2HEX_NOPAD[lllllllllllllIIIllIIIIlIlllllIIl] = String.valueOf(lllllllllllllIIIllIIIIlIlllllIIl);
            ++lllllllllllllIIIllIIIIlIlllllIIl;
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIlIlllllIIl, StringUtil.lIlIIlllIIIIll[10])) {
            final StringBuilder lllllllllllllIIIllIIIIlIlllllllI = new StringBuilder(StringUtil.lIlIIlllIIIIll[3]);
            final char lllllllllllllIIIllIIIIlIllllllIl = (char)(StringUtil.lIlIIlllIIIIll[11] + lllllllllllllIIIllIIIIlIlllllIIl - StringUtil.lIlIIlllIIIIll[8]);
            lllllllllllllIIIllIIIIlIlllllllI.append((char)StringUtil.lIlIIlllIIIIll[9]);
            "".length();
            lllllllllllllIIIllIIIIlIlllllllI.append(lllllllllllllIIIllIIIIlIllllllIl);
            "".length();
            StringUtil.BYTE2HEX_PAD[lllllllllllllIIIllIIIIlIlllllIIl] = String.valueOf(lllllllllllllIIIllIIIIlIlllllllI);
            StringUtil.BYTE2HEX_NOPAD[lllllllllllllIIIllIIIIlIlllllIIl] = String.valueOf(lllllllllllllIIIllIIIIlIllllllIl);
            ++lllllllllllllIIIllIIIIlIlllllIIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIlIlllllIIl, StringUtil.BYTE2HEX_PAD.length)) {
            final StringBuilder lllllllllllllIIIllIIIIlIllllllII = new StringBuilder(StringUtil.lIlIIlllIIIIll[3]);
            lllllllllllllIIIllIIIIlIllllllII.append(Integer.toHexString(lllllllllllllIIIllIIIIlIlllllIIl));
            "".length();
            final String lllllllllllllIIIllIIIIlIlllllIll = String.valueOf(lllllllllllllIIIllIIIIlIllllllII);
            StringUtil.BYTE2HEX_PAD[lllllllllllllIIIllIIIIlIlllllIIl] = lllllllllllllIIIllIIIIlIlllllIll;
            StringUtil.BYTE2HEX_NOPAD[lllllllllllllIIIllIIIIlIlllllIIl] = lllllllllllllIIIllIIIIlIlllllIll;
            ++lllllllllllllIIIllIIIIlIlllllIIl;
            "".length();
            if (((0xB ^ 0x25) & ~(0x2A ^ 0x4)) != 0x0) {
                return;
            }
        }
    }
    
    private static boolean lllIlIIIllIIIll(final int lllllllllllllIIIllIIIIlIlIllIIIl) {
        return lllllllllllllIIIllIIIIlIlIllIIIl >= 0;
    }
    
    public static String toHexStringPadded(final byte[] lllllllllllllIIIllIIIIllIllIIlII, final int lllllllllllllIIIllIIIIllIllIIIll, final int lllllllllllllIIIllIIIIllIllIIIlI) {
        return String.valueOf(toHexStringPadded(new StringBuilder(lllllllllllllIIIllIIIIllIllIIIlI << StringUtil.lIlIIlllIIIIll[1]), lllllllllllllIIIllIIIIllIllIIlII, lllllllllllllIIIllIIIIllIllIIIll, lllllllllllllIIIllIIIIllIllIIIlI));
    }
    
    private static boolean lllIlIIIllIIIIl(final int lllllllllllllIIIllIIIIlIlIllIIll) {
        return lllllllllllllIIIllIIIIlIlIllIIll == 0;
    }
    
    public static <T extends Appendable> T toHexString(final T lllllllllllllIIIllIIIIllIIIllIII, final byte[] lllllllllllllIIIllIIIIllIIIlllll, final int lllllllllllllIIIllIIIIllIIIlIllI, final int lllllllllllllIIIllIIIIllIIIlIlIl) {
        if (lllIlIIIllIIIIl(StringUtil.$assertionsDisabled ? 1 : 0) && lllIlIIIllIIlIl(lllllllllllllIIIllIIIIllIIIlIlIl)) {
            throw new AssertionError();
        }
        if (lllIlIIIllIIIIl(lllllllllllllIIIllIIIIllIIIlIlIl)) {
            return lllllllllllllIIIllIIIIllIIIllIII;
        }
        final int lllllllllllllIIIllIIIIllIIIlllII = lllllllllllllIIIllIIIIllIIIlIllI + lllllllllllllIIIllIIIIllIIIlIlIl;
        final int lllllllllllllIIIllIIIIllIIIllIll = lllllllllllllIIIllIIIIllIIIlllII - StringUtil.lIlIIlllIIIIll[1];
        int lllllllllllllIIIllIIIIllIIIllIlI = lllllllllllllIIIllIIIIllIIIlIllI;
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIllIIIllIlI, lllllllllllllIIIllIIIIllIIIllIll)) {
            if (lllIlIIIllIIlII(lllllllllllllIIIllIIIIllIIIlllll[lllllllllllllIIIllIIIIllIIIllIlI])) {
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIllIIIllIlI;
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        byteToHexString(lllllllllllllIIIllIIIIllIIIllIII, lllllllllllllIIIllIIIIllIIIlllll[lllllllllllllIIIllIIIIllIIIllIlI++]);
        "".length();
        final int lllllllllllllIIIllIIIIllIIIllIIl = lllllllllllllIIIllIIIIllIIIlllII - lllllllllllllIIIllIIIIllIIIllIlI;
        toHexStringPadded((Appendable)lllllllllllllIIIllIIIIllIIIllIII, lllllllllllllIIIllIIIIllIIIlllll, lllllllllllllIIIllIIIIllIIIllIlI, lllllllllllllIIIllIIIIllIIIllIIl);
        "".length();
        return lllllllllllllIIIllIIIIllIIIllIII;
    }
    
    private static void lllIlIIIlIllllI() {
        (lIlIIlllIIIIll = new int[14])[0] = ((0x2 ^ 0x40) & ~(0x28 ^ 0x6A));
        StringUtil.lIlIIlllIIIIll[1] = " ".length();
        StringUtil.lIlIIlllIIIIll[2] = 123 + 48 - 106 + 190;
        StringUtil.lIlIIlllIIIIll[3] = "  ".length();
        StringUtil.lIlIIlllIIIIll[4] = "   ".length();
        StringUtil.lIlIIlllIIIIll[5] = (-(0xFFFF9A4F & 0x7FBB) & (0xFFFFFBAA & 0x1F5F));
        StringUtil.lIlIIlllIIIIll[6] = (128 + 47 - 121 + 99 ^ 42 + 36 - 72 + 151);
        StringUtil.lIlIIlllIIIIll[7] = (0xB8 ^ 0xBD);
        StringUtil.lIlIIlllIIIIll[8] = (0x82 ^ 0x9D ^ (0xA8 ^ 0xBD));
        StringUtil.lIlIIlllIIIIll[9] = ("   ".length() ^ (0x2D ^ 0x1E));
        StringUtil.lIlIIlllIIIIll[10] = (69 + 13 + 38 + 10 ^ 122 + 50 - 143 + 117);
        StringUtil.lIlIIlllIIIIll[11] = (0x5A ^ 0x5D ^ (0x2D ^ 0x4B));
        StringUtil.lIlIIlllIIIIll[12] = (0xDB ^ 0x90 ^ (0x30 ^ 0x7D));
        StringUtil.lIlIIlllIIIIll[13] = (0x3 ^ 0xB);
    }
    
    private static String lllIlIIIlIlIlIl(final String lllllllllllllIIIllIIIIlIlllIllIl, final String lllllllllllllIIIllIIIIlIlllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIlIllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIlIlllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIIIlIlllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIIIlIlllIllll.init(StringUtil.lIlIIlllIIIIll[3], lllllllllllllIIIllIIIIlIllllIIII);
            return new String(lllllllllllllIIIllIIIIlIlllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIlIlllIlllI) {
            lllllllllllllIIIllIIIIlIlllIlllI.printStackTrace();
            return null;
        }
    }
    
    public static String toHexString(final byte[] lllllllllllllIIIllIIIIllIIlllIIl) {
        return toHexString(lllllllllllllIIIllIIIIllIIlllIIl, StringUtil.lIlIIlllIIIIll[0], lllllllllllllIIIllIIIIllIIlllIIl.length);
    }
    
    public static String simpleClassName(final Class<?> lllllllllllllIIIllIIIIllIIIIlIIl) {
        if (lllIlIIIllIIllI(lllllllllllllIIIllIIIIllIIIIlIIl)) {
            return StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[3]];
        }
        final Package lllllllllllllIIIllIIIIllIIIIlIlI = lllllllllllllIIIllIIIIllIIIIlIIl.getPackage();
        if (lllIlIIIllIIlll(lllllllllllllIIIllIIIIllIIIIlIlI)) {
            return lllllllllllllIIIllIIIIllIIIIlIIl.getName().substring(lllllllllllllIIIllIIIIllIIIIlIlI.getName().length() + StringUtil.lIlIIlllIIIIll[1]);
        }
        return lllllllllllllIIIllIIIIllIIIIlIIl.getName();
    }
    
    private static String lllIlIIIlIlIlII(String lllllllllllllIIIllIIIIlIllIllIII, final String lllllllllllllIIIllIIIIlIllIlllII) {
        lllllllllllllIIIllIIIIlIllIllIII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIIIlIllIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIIlIllIllIll = new StringBuilder();
        final char[] lllllllllllllIIIllIIIIlIllIllIlI = lllllllllllllIIIllIIIIlIllIlllII.toCharArray();
        int lllllllllllllIIIllIIIIlIllIllIIl = StringUtil.lIlIIlllIIIIll[0];
        final short lllllllllllllIIIllIIIIlIllIlIIll = (Object)((String)lllllllllllllIIIllIIIIlIllIllIII).toCharArray();
        final boolean lllllllllllllIIIllIIIIlIllIlIIlI = lllllllllllllIIIllIIIIlIllIlIIll.length != 0;
        int lllllllllllllIIIllIIIIlIllIlIIIl = StringUtil.lIlIIlllIIIIll[0];
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIlIllIlIIIl, lllllllllllllIIIllIIIIlIllIlIIlI ? 1 : 0)) {
            final char lllllllllllllIIIllIIIIlIllIllllI = lllllllllllllIIIllIIIIlIllIlIIll[lllllllllllllIIIllIIIIlIllIlIIIl];
            lllllllllllllIIIllIIIIlIllIllIll.append((char)(lllllllllllllIIIllIIIIlIllIllllI ^ lllllllllllllIIIllIIIIlIllIllIlI[lllllllllllllIIIllIIIIlIllIllIIl % lllllllllllllIIIllIIIIlIllIllIlI.length]));
            "".length();
            ++lllllllllllllIIIllIIIIlIllIllIIl;
            ++lllllllllllllIIIllIIIIlIllIlIIIl;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIIlIllIllIll);
    }
    
    public static String byteToHexStringPadded(final int lllllllllllllIIIllIIIIllIlllIlII) {
        return StringUtil.BYTE2HEX_PAD[lllllllllllllIIIllIIIIllIlllIlII & StringUtil.lIlIIlllIIIIll[2]];
    }
    
    public static String simpleClassName(final Object lllllllllllllIIIllIIIIllIIIIlllI) {
        if (lllIlIIIllIIllI(lllllllllllllIIIllIIIIllIIIIlllI)) {
            return StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[1]];
        }
        return simpleClassName(lllllllllllllIIIllIIIIllIIIIlllI.getClass());
    }
    
    public static <T extends Appendable> T toHexStringPadded(final T lllllllllllllIIIllIIIIllIlIIllII, final byte[] lllllllllllllIIIllIIIIllIlIIlIll, final int lllllllllllllIIIllIIIIllIlIIlIlI, final int lllllllllllllIIIllIIIIllIlIIlllI) {
        final int lllllllllllllIIIllIIIIllIlIIllIl = lllllllllllllIIIllIIIIllIlIIlIlI + lllllllllllllIIIllIIIIllIlIIlllI;
        int lllllllllllllIIIllIIIIllIlIlIIlI = lllllllllllllIIIllIIIIllIlIIlIlI;
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIllIlIlIIlI, lllllllllllllIIIllIIIIllIlIIllIl)) {
            byteToHexStringPadded(lllllllllllllIIIllIIIIllIlIIllII, lllllllllllllIIIllIIIIllIlIIlIll[lllllllllllllIIIllIIIIllIlIlIIlI]);
            "".length();
            ++lllllllllllllIIIllIIIIllIlIlIIlI;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return lllllllllllllIIIllIIIIllIlIIllII;
    }
    
    private static boolean lllIlIIIllIIIII(final int lllllllllllllIIIllIIIIlIllIIIIII, final int lllllllllllllIIIllIIIIlIlIllllll) {
        return lllllllllllllIIIllIIIIlIllIIIIII == lllllllllllllIIIllIIIIlIlIllllll;
    }
    
    private static boolean lllIlIIIllIIlll(final Object lllllllllllllIIIllIIIIlIlIlllIIl) {
        return lllllllllllllIIIllIIIIlIlIlllIIl != null;
    }
    
    public static String byteToHexString(final int lllllllllllllIIIllIIIIllIlIIIlIl) {
        return StringUtil.BYTE2HEX_NOPAD[lllllllllllllIIIllIIIIllIlIIIlIl & StringUtil.lIlIIlllIIIIll[2]];
    }
    
    private static boolean lllIlIIIlIlllll(final int lllllllllllllIIIllIIIIlIlIllllII, final int lllllllllllllIIIllIIIIlIlIlllIll) {
        return lllllllllllllIIIllIIIIlIlIllllII < lllllllllllllIIIllIIIIlIlIlllIll;
    }
    
    public static <T extends Appendable> T toHexStringPadded(final T lllllllllllllIIIllIIIIllIlIlllII, final byte[] lllllllllllllIIIllIIIIllIlIllIll) {
        return toHexStringPadded(lllllllllllllIIIllIIIIllIlIlllII, lllllllllllllIIIllIIIIllIlIllIll, StringUtil.lIlIIlllIIIIll[0], lllllllllllllIIIllIIIIllIlIllIll.length);
    }
    
    public static <T extends Appendable> T toHexString(final T lllllllllllllIIIllIIIIllIIlIlIlI, final byte[] lllllllllllllIIIllIIIIllIIlIlIll) {
        return toHexString(lllllllllllllIIIllIIIIllIIlIlIlI, lllllllllllllIIIllIIIIllIIlIlIll, StringUtil.lIlIIlllIIIIll[0], lllllllllllllIIIllIIIIllIIlIlIll.length);
    }
    
    public static String toHexString(final byte[] lllllllllllllIIIllIIIIllIIllIlII, final int lllllllllllllIIIllIIIIllIIllIIII, final int lllllllllllllIIIllIIIIllIIllIIlI) {
        return String.valueOf(toHexString(new StringBuilder(lllllllllllllIIIllIIIIllIIllIIlI << StringUtil.lIlIIlllIIIIll[1]), lllllllllllllIIIllIIIIllIIllIlII, lllllllllllllIIIllIIIIllIIllIIII, lllllllllllllIIIllIIIIllIIllIIlI));
    }
    
    public static String[] split(final String lllllllllllllIIIllIIIIlllIIIIIIl, final char lllllllllllllIIIllIIIIllIllllIll) {
        final int lllllllllllllIIIllIIIIllIlllllll = lllllllllllllIIIllIIIIlllIIIIIIl.length();
        final List<String> lllllllllllllIIIllIIIIllIllllllI = new ArrayList<String>();
        int lllllllllllllIIIllIIIIllIlllllIl = StringUtil.lIlIIlllIIIIll[0];
        int lllllllllllllIIIllIIIIlllIIIIIll = StringUtil.lIlIIlllIIIIll[0];
        while (lllIlIIIlIlllll(lllllllllllllIIIllIIIIlllIIIIIll, lllllllllllllIIIllIIIIllIlllllll)) {
            if (lllIlIIIllIIIII(lllllllllllllIIIllIIIIlllIIIIIIl.charAt(lllllllllllllIIIllIIIIlllIIIIIll), lllllllllllllIIIllIIIIllIllllIll)) {
                if (lllIlIIIllIIIII(lllllllllllllIIIllIIIIllIlllllIl, lllllllllllllIIIllIIIIlllIIIIIll)) {
                    lllllllllllllIIIllIIIIllIllllllI.add(StringUtil.lIlIIlllIIIIlI[StringUtil.lIlIIlllIIIIll[0]]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIllIIIIllIllllllI.add(lllllllllllllIIIllIIIIlllIIIIIIl.substring(lllllllllllllIIIllIIIIllIlllllIl, lllllllllllllIIIllIIIIlllIIIIIll));
                    "".length();
                }
                lllllllllllllIIIllIIIIllIlllllIl = lllllllllllllIIIllIIIIlllIIIIIll + StringUtil.lIlIIlllIIIIll[1];
            }
            ++lllllllllllllIIIllIIIIlllIIIIIll;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        if (lllIlIIIllIIIIl(lllllllllllllIIIllIIIIllIlllllIl)) {
            lllllllllllllIIIllIIIIllIllllllI.add(lllllllllllllIIIllIIIIlllIIIIIIl);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (lllIlIIIllIIIlI(lllllllllllllIIIllIIIIllIlllllIl, lllllllllllllIIIllIIIIllIlllllll)) {
            lllllllllllllIIIllIIIIllIllllllI.add(lllllllllllllIIIllIIIIlllIIIIIIl.substring(lllllllllllllIIIllIIIIllIlllllIl, lllllllllllllIIIllIIIIllIlllllll));
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            int lllllllllllllIIIllIIIIlllIIIIIlI = lllllllllllllIIIllIIIIllIllllllI.size() - StringUtil.lIlIIlllIIIIll[1];
            while (lllIlIIIllIIIll(lllllllllllllIIIllIIIIlllIIIIIlI) && lllIlIIIllIIlII(lllllllllllllIIIllIIIIllIllllllI.get(lllllllllllllIIIllIIIIlllIIIIIlI).isEmpty() ? 1 : 0)) {
                lllllllllllllIIIllIIIIllIllllllI.remove(lllllllllllllIIIllIIIIlllIIIIIlI);
                "".length();
                --lllllllllllllIIIllIIIIlllIIIIIlI;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
        }
        return lllllllllllllIIIllIIIIllIllllllI.toArray(new String[lllllllllllllIIIllIIIIllIllllllI.size()]);
    }
    
    private static boolean lllIlIIIllIIllI(final Object lllllllllllllIIIllIIIIlIlIllIlll) {
        return lllllllllllllIIIllIIIIlIlIllIlll == null;
    }
    
    private static String lllIlIIIlIlIIll(final String lllllllllllllIIIllIIIIlIllIIIllI, final String lllllllllllllIIIllIIIIlIllIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIlIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StringUtil.lIlIIlllIIIIll[13]), "DES");
            final Cipher lllllllllllllIIIllIIIIlIllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIIIIlIllIIlIlI.init(StringUtil.lIlIIlllIIIIll[3], lllllllllllllIIIllIIIIlIllIIlIll);
            return new String(lllllllllllllIIIllIIIIlIllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIlIllIIlIIl) {
            lllllllllllllIIIllIIIIlIllIIlIIl.printStackTrace();
            return null;
        }
    }
}
