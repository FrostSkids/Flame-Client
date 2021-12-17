// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

final class MessageFormatter
{
    private static final /* synthetic */ String[] lIlIllIllIllII;
    private static final /* synthetic */ int[] lIlIllIllIllIl;
    
    static FormattingTuple format(final String lllllllllllllIIIIllIlIIIIlIlIlll, final Object lllllllllllllIIIIllIlIIIIlIllIII) {
        final Object[] lllllllllllllIIIIllIlIIIIIllllIl = new Object[MessageFormatter.lIlIllIllIllIl[0]];
        lllllllllllllIIIIllIlIIIIIllllIl[MessageFormatter.lIlIllIllIllIl[1]] = lllllllllllllIIIIllIlIIIIlIllIII;
        return arrayFormat(lllllllllllllIIIIllIlIIIIlIlIlll, lllllllllllllIIIIllIlIIIIIllllIl);
    }
    
    private MessageFormatter() {
    }
    
    private static String llllIIlIIIIlIIl(final String lllllllllllllIIIIllIIllllIIllIIl, final String lllllllllllllIIIIllIIllllIIllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIllllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIllllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIllllIIllIll.init(MessageFormatter.lIlIllIllIllIl[2], lllllllllllllIIIIllIIllllIIlllII);
            return new String(lllllllllllllIIIIllIIllllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIllllIIllIlI) {
            lllllllllllllIIIIllIIllllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlIIIlIIIl(final int lllllllllllllIIIIllIIlllIllIllII, final int lllllllllllllIIIIllIIlllIllIlIll) {
        return lllllllllllllIIIIllIIlllIllIllII == lllllllllllllIIIIllIIlllIllIlIll;
    }
    
    private static boolean llllIIlIIIIllII(final Object lllllllllllllIIIIllIIlllIllIIIIl) {
        return lllllllllllllIIIIllIIlllIllIIIIl != null;
    }
    
    private static boolean llllIIlIIIIllIl(final int lllllllllllllIIIIllIIlllIlIllIll) {
        return lllllllllllllIIIIllIIlllIlIllIll == 0;
    }
    
    private static boolean llllIIlIIIIllll(final Object lllllllllllllIIIIllIIlllIlIlllll) {
        return lllllllllllllIIIIllIIlllIlIlllll == null;
    }
    
    private static void longArrayAppend(final StringBuffer lllllllllllllIIIIllIIlllllIIIIlI, final long[] lllllllllllllIIIIllIIlllllIIIIIl) {
        lllllllllllllIIIIllIIlllllIIIIlI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIlllllIIIIII = lllllllllllllIIIIllIIlllllIIIIIl.length;
        int lllllllllllllIIIIllIIlllllIIIIll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIlllllIIIIll, lllllllllllllIIIIllIIlllllIIIIII)) {
            lllllllllllllIIIIllIIlllllIIIIlI.append(lllllllllllllIIIIllIIlllllIIIIIl[lllllllllllllIIIIllIIlllllIIIIll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIlllllIIIIll, lllllllllllllIIIIllIIlllllIIIIII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIlllllIIIIlI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[17]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIlllllIIIIll;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        lllllllllllllIIIIllIIlllllIIIIlI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static void doubleArrayAppend(final StringBuffer lllllllllllllIIIIllIIllllIlIIlll, final double[] lllllllllllllIIIIllIIllllIlIIllI) {
        lllllllllllllIIIIllIIllllIlIIlll.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIllllIlIlIII = lllllllllllllIIIIllIIllllIlIIllI.length;
        int lllllllllllllIIIIllIIllllIlIlIll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIllllIlIlIll, lllllllllllllIIIIllIIllllIlIlIII)) {
            lllllllllllllIIIIllIIllllIlIIlll.append(lllllllllllllIIIIllIIllllIlIIllI[lllllllllllllIIIIllIIllllIlIlIll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIllllIlIlIll, lllllllllllllIIIIllIIllllIlIlIII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIllllIlIIlll.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[19]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIllllIlIlIll;
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        lllllllllllllIIIIllIIllllIlIIlll.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static boolean llllIIlIIIIlllI(final int lllllllllllllIIIIllIIlllIlIlllIl) {
        return lllllllllllllIIIIllIIlllIlIlllIl != 0;
    }
    
    private static String llllIIlIIIIlIII(String lllllllllllllIIIIllIIlllIlllIlll, final String lllllllllllllIIIIllIIlllIlllIllI) {
        lllllllllllllIIIIllIIlllIlllIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIIlllIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIlllIllllIlI = new StringBuilder();
        final char[] lllllllllllllIIIIllIIlllIllllIIl = lllllllllllllIIIIllIIlllIlllIllI.toCharArray();
        int lllllllllllllIIIIllIIlllIllllIII = MessageFormatter.lIlIllIllIllIl[1];
        final int lllllllllllllIIIIllIIlllIlllIIlI = (Object)((String)lllllllllllllIIIIllIIlllIlllIlll).toCharArray();
        final boolean lllllllllllllIIIIllIIlllIlllIIIl = lllllllllllllIIIIllIIlllIlllIIlI.length != 0;
        long lllllllllllllIIIIllIIlllIlllIIII = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII((int)lllllllllllllIIIIllIIlllIlllIIII, lllllllllllllIIIIllIIlllIlllIIIl ? 1 : 0)) {
            final char lllllllllllllIIIIllIIlllIlllllIl = lllllllllllllIIIIllIIlllIlllIIlI[lllllllllllllIIIIllIIlllIlllIIII];
            lllllllllllllIIIIllIIlllIllllIlI.append((char)(lllllllllllllIIIIllIIlllIlllllIl ^ lllllllllllllIIIIllIIlllIllllIIl[lllllllllllllIIIIllIIlllIllllIII % lllllllllllllIIIIllIIlllIllllIIl.length]));
            "".length();
            ++lllllllllllllIIIIllIIlllIllllIII;
            ++lllllllllllllIIIIllIIlllIlllIIII;
            "".length();
            if (-" ".length() >= ((0x7B ^ 0x19) & ~(0x68 ^ 0xA))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIlllIllllIlI);
    }
    
    static boolean isDoubleEscaped(final String lllllllllllllIIIIllIlIIIIIlIlIIl, final int lllllllllllllIIIIllIlIIIIIlIIllI) {
        int n;
        if (llllIIlIIIlIIlI(lllllllllllllIIIIllIlIIIIIlIIllI, MessageFormatter.lIlIllIllIllIl[2]) && llllIIlIIIlIIIl(lllllllllllllIIIIllIlIIIIIlIlIIl.charAt(lllllllllllllIIIIllIlIIIIIlIIllI - MessageFormatter.lIlIllIllIllIl[2]), MessageFormatter.lIlIllIllIllIl[6])) {
            n = MessageFormatter.lIlIllIllIllIl[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x10 ^ 0x44) & ~(0x10 ^ 0x44)) != 0x0;
            }
        }
        else {
            n = MessageFormatter.lIlIllIllIllIl[1];
        }
        return n != 0;
    }
    
    private static void shortArrayAppend(final StringBuffer lllllllllllllIIIIllIIlllllIllIlI, final short[] lllllllllllllIIIIllIIlllllIlIllI) {
        lllllllllllllIIIIllIIlllllIllIlI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIlllllIllIII = lllllllllllllIIIIllIIlllllIlIllI.length;
        int lllllllllllllIIIIllIIlllllIllIll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIlllllIllIll, lllllllllllllIIIIllIIlllllIllIII)) {
            lllllllllllllIIIIllIIlllllIllIlI.append(lllllllllllllIIIIllIIlllllIlIllI[lllllllllllllIIIIllIIlllllIllIll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIlllllIllIll, lllllllllllllIIIIllIIlllllIllIII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIlllllIllIlI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[15]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIlllllIllIll;
            "".length();
            if (null != null) {
                return;
            }
        }
        lllllllllllllIIIIllIIlllllIllIlI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static void booleanArrayAppend(final StringBuffer lllllllllllllIIIIllIIllllllllllI, final boolean[] lllllllllllllIIIIllIIllllllllIlI) {
        lllllllllllllIIIIllIIllllllllllI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIlllllllllII = lllllllllllllIIIIllIIllllllllIlI.length;
        int lllllllllllllIIIIllIIlllllllllll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIlllllllllll, lllllllllllllIIIIllIIlllllllllII)) {
            lllllllllllllIIIIllIIllllllllllI.append(lllllllllllllIIIIllIIllllllllIlI[lllllllllllllIIIIllIIlllllllllll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIlllllllllll, lllllllllllllIIIIllIIlllllllllII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIllllllllllI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[12]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIlllllllllll;
            "".length();
            if (null != null) {
                return;
            }
        }
        lllllllllllllIIIIllIIllllllllllI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    static FormattingTuple format(final String lllllllllllllIIIIllIlIIIIlIlIIlI, final Object lllllllllllllIIIIllIlIIIIlIlIIIl, final Object lllllllllllllIIIIllIlIIIIlIIllIl) {
        final Object[] lllllllllllllIIIIllIlIIIIIllllIl = new Object[MessageFormatter.lIlIllIllIllIl[2]];
        lllllllllllllIIIIllIlIIIIIllllIl[MessageFormatter.lIlIllIllIllIl[1]] = lllllllllllllIIIIllIlIIIIlIlIIIl;
        lllllllllllllIIIIllIlIIIIIllllIl[MessageFormatter.lIlIllIllIllIl[0]] = lllllllllllllIIIIllIlIIIIlIIllIl;
        return arrayFormat(lllllllllllllIIIIllIlIIIIlIlIIlI, lllllllllllllIIIIllIlIIIIIllllIl);
    }
    
    static {
        llllIIlIIIIlIll();
        llllIIlIIIIlIlI();
        DELIM_START = (char)MessageFormatter.lIlIllIllIllIl[5];
        DELIM_STOP = (char)MessageFormatter.lIlIllIllIllIl[20];
        DELIM_STR = MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[21]];
        ESCAPE_CHAR = (char)MessageFormatter.lIlIllIllIllIl[6];
    }
    
    private static void floatArrayAppend(final StringBuffer lllllllllllllIIIIllIIllllIllIllI, final float[] lllllllllllllIIIIllIIllllIllIIlI) {
        lllllllllllllIIIIllIIllllIllIllI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIllllIllIlII = lllllllllllllIIIIllIIllllIllIIlI.length;
        int lllllllllllllIIIIllIIllllIllIlll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIllllIllIlll, lllllllllllllIIIIllIIllllIllIlII)) {
            lllllllllllllIIIIllIIllllIllIllI.append(lllllllllllllIIIIllIIllllIllIIlI[lllllllllllllIIIIllIIllllIllIlll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIllllIllIlll, lllllllllllllIIIIllIIllllIllIlII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIllllIllIllI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[18]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIllllIllIlll;
            "".length();
            if (" ".length() < ((96 + 62 - 43 + 20 ^ 81 + 9 - 33 + 110) & (0x76 ^ 0x0 ^ (0xE ^ 0x58) ^ -" ".length()))) {
                return;
            }
        }
        lllllllllllllIIIIllIIllllIllIllI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static void safeObjectAppend(final StringBuffer lllllllllllllIIIIllIlIIIIIIlIlll, final Object lllllllllllllIIIIllIlIIIIIIlIllI) {
        try {
            final String lllllllllllllIIIIllIlIIIIIIllIIl = lllllllllllllIIIIllIlIIIIIIlIllI.toString();
            lllllllllllllIIIIllIlIIIIIIlIlll.append(lllllllllllllIIIIllIlIIIIIIllIIl);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIIllIlIIIIIIllIII) {
            System.err.println(String.valueOf(new StringBuilder().append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[2]]).append(lllllllllllllIIIIllIlIIIIIIlIllI.getClass().getName()).append((char)MessageFormatter.lIlIllIllIllIl[7])));
            lllllllllllllIIIIllIlIIIIIIllIII.printStackTrace();
            lllllllllllllIIIIllIlIIIIIIlIlll.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[8]]);
            "".length();
        }
    }
    
    private static void intArrayAppend(final StringBuffer lllllllllllllIIIIllIIlllllIIlllI, final int[] lllllllllllllIIIIllIIlllllIIllIl) {
        lllllllllllllIIIIllIIlllllIIlllI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIlllllIIllII = lllllllllllllIIIIllIIlllllIIllIl.length;
        int lllllllllllllIIIIllIIlllllIIllll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIlllllIIllll, lllllllllllllIIIIllIIlllllIIllII)) {
            lllllllllllllIIIIllIIlllllIIlllI.append(lllllllllllllIIIIllIIlllllIIllIl[lllllllllllllIIIIllIIlllllIIllll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIlllllIIllll, lllllllllllllIIIIllIIlllllIIllII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIlllllIIlllI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[16]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIlllllIIllll;
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        lllllllllllllIIIIllIIlllllIIlllI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static void llllIIlIIIIlIlI() {
        (lIlIllIllIllII = new String[MessageFormatter.lIlIllIllIllIl[22]])[MessageFormatter.lIlIllIllIllIl[1]] = llllIIlIIIIIllI("6/ymjjpHFNQ=", "WQqNn");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[0]] = llllIIlIIIIlIII("DR8JIA==", "cjeLA");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[2]] = llllIIlIIIIlIII("HAQ3Ww51aDcOLSMtFU8wIBsFHS0hL1lGZCYmBwAnLjwYACpvJx9PJSFoHg0uKisFTyspaAUWNCpoKg==", "OHqoD");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[8]] = llllIIlIIIIlIII("Px8gLx0hHUESPjctEw8/A3FIOw==", "dYafQ");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[10]] = llllIIlIIIIlIIl("0eX2Tnnpnvk=", "TlHuH");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[11]] = llllIIlIIIIlIIl("MlqxGH+b3/4=", "vXafB");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[12]] = llllIIlIIIIlIII("QUE=", "maEsw");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[13]] = llllIIlIIIIlIIl("jtYh3ytUcx0=", "xstrU");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[14]] = llllIIlIIIIlIIl("DfAYtwBQ63A=", "Zeval");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[15]] = llllIIlIIIIlIII("fkw=", "RlETS");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[16]] = llllIIlIIIIIllI("xD+2823kST0=", "nzsxe");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[17]] = llllIIlIIIIlIIl("xQzDuhd1eqI=", "XsiVQ");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[18]] = llllIIlIIIIlIII("ZEw=", "HlCEt");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[19]] = llllIIlIIIIlIII("f0o=", "SjhuF");
        MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[21]] = llllIIlIIIIlIIl("V1m1deQ2vSA=", "XeCsK");
    }
    
    private static void objectArrayAppend(final StringBuffer lllllllllllllIIIIllIlIIIIIIIlIII, final Object[] lllllllllllllIIIIllIlIIIIIIIlIlI, final Map<Object[], Void> lllllllllllllIIIIllIlIIIIIIIIllI) {
        lllllllllllllIIIIllIlIIIIIIIlIII.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        if (llllIIlIIIIllIl(lllllllllllllIIIIllIlIIIIIIIIllI.containsKey(lllllllllllllIIIIllIlIIIIIIIlIlI) ? 1 : 0)) {
            lllllllllllllIIIIllIlIIIIIIIIllI.put(lllllllllllllIIIIllIlIIIIIIIlIlI, null);
            "".length();
            final int lllllllllllllIIIIllIlIIIIIIIllII = lllllllllllllIIIIllIlIIIIIIIlIlI.length;
            int lllllllllllllIIIIllIlIIIIIIIllIl = MessageFormatter.lIlIllIllIllIl[1];
            while (llllIIlIIIlIIII(lllllllllllllIIIIllIlIIIIIIIllIl, lllllllllllllIIIIllIlIIIIIIIllII)) {
                deeplyAppendParameter(lllllllllllllIIIIllIlIIIIIIIlIII, lllllllllllllIIIIllIlIIIIIIIlIlI[lllllllllllllIIIIllIlIIIIIIIllIl], lllllllllllllIIIIllIlIIIIIIIIllI);
                if (llllIIlIIIlIIll(lllllllllllllIIIIllIlIIIIIIIllIl, lllllllllllllIIIIllIlIIIIIIIllII - MessageFormatter.lIlIllIllIllIl[0])) {
                    lllllllllllllIIIIllIlIIIIIIIlIII.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[10]]);
                    "".length();
                }
                ++lllllllllllllIIIIllIlIIIIIIIllIl;
                "".length();
                if (((0x65 ^ 0x26 ^ (0x1 ^ 0x76)) & (72 + 72 - 115 + 160 ^ 1 + 18 + 11 + 107 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            lllllllllllllIIIIllIlIIIIIIIIllI.remove(lllllllllllllIIIIllIlIIIIIIIlIlI);
            "".length();
            "".length();
            if (((0x33 ^ 0x22) & ~(0x62 ^ 0x73)) < 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllIlIIIIIIIlIII.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[11]]);
            "".length();
        }
        lllllllllllllIIIIllIlIIIIIIIlIII.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    static boolean isEscapedDelimeter(final String lllllllllllllIIIIllIlIIIIIlIllIl, final int lllllllllllllIIIIllIlIIIIIlIlllI) {
        if (llllIIlIIIIllIl(lllllllllllllIIIIllIlIIIIIlIlllI)) {
            return MessageFormatter.lIlIllIllIllIl[1] != 0;
        }
        int n;
        if (llllIIlIIIlIIIl(lllllllllllllIIIIllIlIIIIIlIllIl.charAt(lllllllllllllIIIIllIlIIIIIlIlllI - MessageFormatter.lIlIllIllIllIl[0]), MessageFormatter.lIlIllIllIllIl[6])) {
            n = MessageFormatter.lIlIllIllIllIl[0];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return ((0x0 ^ 0xB) & ~(0x3F ^ 0x34)) != 0x0;
            }
        }
        else {
            n = MessageFormatter.lIlIllIllIllIl[1];
        }
        return n != 0;
    }
    
    static Throwable getThrowableCandidate(final Object[] lllllllllllllIIIIllIlIIIIlIIlIlI) {
        if (!llllIIlIIIIllII(lllllllllllllIIIIllIlIIIIlIIlIlI) || llllIIlIIIIllIl(lllllllllllllIIIIllIlIIIIlIIlIlI.length)) {
            return null;
        }
        final Object lllllllllllllIIIIllIlIIIIlIIlIIl = lllllllllllllIIIIllIlIIIIlIIlIlI[lllllllllllllIIIIllIlIIIIlIIlIlI.length - MessageFormatter.lIlIllIllIllIl[0]];
        if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIlIIlIIl instanceof Throwable) ? 1 : 0)) {
            return (Throwable)lllllllllllllIIIIllIlIIIIlIIlIIl;
        }
        return null;
    }
    
    static FormattingTuple arrayFormat(final String lllllllllllllIIIIllIlIIIIIlllIII, final Object[] lllllllllllllIIIIllIlIIIIIllllIl) {
        final Throwable lllllllllllllIIIIllIlIIIIIllllII = getThrowableCandidate(lllllllllllllIIIIllIlIIIIIllllIl);
        if (llllIIlIIIIllll(lllllllllllllIIIIllIlIIIIIlllIII)) {
            return new FormattingTuple(null, lllllllllllllIIIIllIlIIIIIllllIl, lllllllllllllIIIIllIlIIIIIllllII);
        }
        if (llllIIlIIIIllll(lllllllllllllIIIIllIlIIIIIllllIl)) {
            return new FormattingTuple(lllllllllllllIIIIllIlIIIIIlllIII);
        }
        int lllllllllllllIIIIllIlIIIIIlllIll = MessageFormatter.lIlIllIllIllIl[1];
        final StringBuffer lllllllllllllIIIIllIlIIIIIlllIlI = new StringBuffer(lllllllllllllIIIIllIlIIIIIlllIII.length() + MessageFormatter.lIlIllIllIllIl[3]);
        int lllllllllllllIIIIllIlIIIIIlllIIl = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIlIIIIIlllIIl, lllllllllllllIIIIllIlIIIIIllllIl.length)) {
            final int lllllllllllllIIIIllIlIIIIIllllll = lllllllllllllIIIIllIlIIIIIlllIII.indexOf(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[1]], lllllllllllllIIIIllIlIIIIIlllIll);
            if (llllIIlIIIlIIIl(lllllllllllllIIIIllIlIIIIIllllll, MessageFormatter.lIlIllIllIllIl[4])) {
                if (llllIIlIIIIllIl(lllllllllllllIIIIllIlIIIIIlllIll)) {
                    return new FormattingTuple(lllllllllllllIIIIllIlIIIIIlllIII, lllllllllllllIIIIllIlIIIIIllllIl, lllllllllllllIIIIllIlIIIIIllllII);
                }
                lllllllllllllIIIIllIlIIIIIlllIlI.append(lllllllllllllIIIIllIlIIIIIlllIII.substring(lllllllllllllIIIIllIlIIIIIlllIll, lllllllllllllIIIIllIlIIIIIlllIII.length()));
                "".length();
                return new FormattingTuple(lllllllllllllIIIIllIlIIIIIlllIlI.toString(), lllllllllllllIIIIllIlIIIIIllllIl, lllllllllllllIIIIllIlIIIIIllllII);
            }
            else {
                if (llllIIlIIIIlllI(isEscapedDelimeter(lllllllllllllIIIIllIlIIIIIlllIII, lllllllllllllIIIIllIlIIIIIllllll) ? 1 : 0)) {
                    if (llllIIlIIIIllIl(isDoubleEscaped(lllllllllllllIIIIllIlIIIIIlllIII, lllllllllllllIIIIllIlIIIIIllllll) ? 1 : 0)) {
                        --lllllllllllllIIIIllIlIIIIIlllIIl;
                        lllllllllllllIIIIllIlIIIIIlllIlI.append(lllllllllllllIIIIllIlIIIIIlllIII.substring(lllllllllllllIIIIllIlIIIIIlllIll, lllllllllllllIIIIllIlIIIIIllllll - MessageFormatter.lIlIllIllIllIl[0]));
                        "".length();
                        lllllllllllllIIIIllIlIIIIIlllIlI.append((char)MessageFormatter.lIlIllIllIllIl[5]);
                        "".length();
                        lllllllllllllIIIIllIlIIIIIlllIll = lllllllllllllIIIIllIlIIIIIllllll + MessageFormatter.lIlIllIllIllIl[0];
                        "".length();
                        if ((0x36 ^ 0x32) == 0x0) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIIllIlIIIIIlllIlI.append(lllllllllllllIIIIllIlIIIIIlllIII.substring(lllllllllllllIIIIllIlIIIIIlllIll, lllllllllllllIIIIllIlIIIIIllllll - MessageFormatter.lIlIllIllIllIl[0]));
                        "".length();
                        deeplyAppendParameter(lllllllllllllIIIIllIlIIIIIlllIlI, lllllllllllllIIIIllIlIIIIIllllIl[lllllllllllllIIIIllIlIIIIIlllIIl], new HashMap<Object[], Void>());
                        lllllllllllllIIIIllIlIIIIIlllIll = lllllllllllllIIIIllIlIIIIIllllll + MessageFormatter.lIlIllIllIllIl[2];
                        "".length();
                        if (" ".length() >= (0x9D ^ 0x99)) {
                            return null;
                        }
                    }
                }
                else {
                    lllllllllllllIIIIllIlIIIIIlllIlI.append(lllllllllllllIIIIllIlIIIIIlllIII.substring(lllllllllllllIIIIllIlIIIIIlllIll, lllllllllllllIIIIllIlIIIIIllllll));
                    "".length();
                    deeplyAppendParameter(lllllllllllllIIIIllIlIIIIIlllIlI, lllllllllllllIIIIllIlIIIIIllllIl[lllllllllllllIIIIllIlIIIIIlllIIl], new HashMap<Object[], Void>());
                    lllllllllllllIIIIllIlIIIIIlllIll = lllllllllllllIIIIllIlIIIIIllllll + MessageFormatter.lIlIllIllIllIl[2];
                }
                ++lllllllllllllIIIIllIlIIIIIlllIIl;
                "".length();
                if (((0x94 ^ 0x83) & ~(0x97 ^ 0x80)) > " ".length()) {
                    return null;
                }
                continue;
            }
        }
        lllllllllllllIIIIllIlIIIIIlllIlI.append(lllllllllllllIIIIllIlIIIIIlllIII.substring(lllllllllllllIIIIllIlIIIIIlllIll, lllllllllllllIIIIllIlIIIIIlllIII.length()));
        "".length();
        if (llllIIlIIIlIIII(lllllllllllllIIIIllIlIIIIIlllIIl, lllllllllllllIIIIllIlIIIIIllllIl.length - MessageFormatter.lIlIllIllIllIl[0])) {
            return new FormattingTuple(lllllllllllllIIIIllIlIIIIIlllIlI.toString(), lllllllllllllIIIIllIlIIIIIllllIl, lllllllllllllIIIIllIlIIIIIllllII);
        }
        return new FormattingTuple(lllllllllllllIIIIllIlIIIIIlllIlI.toString(), lllllllllllllIIIIllIlIIIIIllllIl, null);
    }
    
    private static void byteArrayAppend(final StringBuffer lllllllllllllIIIIllIIlllllllIIlI, final byte[] lllllllllllllIIIIllIIllllllIlllI) {
        lllllllllllllIIIIllIIlllllllIIlI.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIlllllllIIII = lllllllllllllIIIIllIIllllllIlllI.length;
        int lllllllllllllIIIIllIIlllllllIIll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIlllllllIIll, lllllllllllllIIIIllIIlllllllIIII)) {
            lllllllllllllIIIIllIIlllllllIIlI.append(lllllllllllllIIIIllIIllllllIlllI[lllllllllllllIIIIllIIlllllllIIll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIlllllllIIll, lllllllllllllIIIIllIIlllllllIIII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIlllllllIIlI.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[13]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIlllllllIIll;
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        lllllllllllllIIIIllIIlllllllIIlI.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static String llllIIlIIIIIllI(final String lllllllllllllIIIIllIIllllIIIllII, final String lllllllllllllIIIIllIIllllIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIllllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIllllIIIlIll.getBytes(StandardCharsets.UTF_8)), MessageFormatter.lIlIllIllIllIl[14]), "DES");
            final Cipher lllllllllllllIIIIllIIllllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIllllIIIlllI.init(MessageFormatter.lIlIllIllIllIl[2], lllllllllllllIIIIllIIllllIIIllll);
            return new String(lllllllllllllIIIIllIIllllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIllllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIllllIIIllIl) {
            lllllllllllllIIIIllIIllllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlIIIlIIll(final int lllllllllllllIIIIllIIlllIlIllIII, final int lllllllllllllIIIIllIIlllIlIlIlll) {
        return lllllllllllllIIIIllIIlllIlIllIII != lllllllllllllIIIIllIIlllIlIlIlll;
    }
    
    private static boolean llllIIlIIIlIIlI(final int lllllllllllllIIIIllIIlllIllIlIII, final int lllllllllllllIIIIllIIlllIllIIlll) {
        return lllllllllllllIIIIllIIlllIllIlIII >= lllllllllllllIIIIllIIlllIllIIlll;
    }
    
    private static void llllIIlIIIIlIll() {
        (lIlIllIllIllIl = new int[23])[0] = " ".length();
        MessageFormatter.lIlIllIllIllIl[1] = ((0x25 ^ 0x1E ^ (0x78 ^ 0x6)) & (162 + 194 - 315 + 176 ^ 8 + 127 - 18 + 39 ^ -" ".length()));
        MessageFormatter.lIlIllIllIllIl[2] = "  ".length();
        MessageFormatter.lIlIllIllIllIl[3] = (0xAF ^ 0x88 ^ (0x53 ^ 0x46));
        MessageFormatter.lIlIllIllIllIl[4] = -" ".length();
        MessageFormatter.lIlIllIllIllIl[5] = (57 + 191 - 134 + 129 ^ 129 + 56 - 163 + 114);
        MessageFormatter.lIlIllIllIllIl[6] = ("  ".length() ^ (0x37 ^ 0x69));
        MessageFormatter.lIlIllIllIllIl[7] = (0x2A ^ 0x77);
        MessageFormatter.lIlIllIllIllIl[8] = "   ".length();
        MessageFormatter.lIlIllIllIllIl[9] = (0xD3 ^ 0x88);
        MessageFormatter.lIlIllIllIllIl[10] = (169 + 134 - 234 + 110 ^ 137 + 32 - 43 + 57);
        MessageFormatter.lIlIllIllIllIl[11] = (0x87 ^ 0x82);
        MessageFormatter.lIlIllIllIllIl[12] = (0x2D ^ 0x2B);
        MessageFormatter.lIlIllIllIllIl[13] = (0x53 ^ 0x13 ^ (0x5D ^ 0x1A));
        MessageFormatter.lIlIllIllIllIl[14] = (0x14 ^ 0x1C);
        MessageFormatter.lIlIllIllIllIl[15] = (0xC8 ^ 0xC1);
        MessageFormatter.lIlIllIllIllIl[16] = (0x7F ^ 0x75);
        MessageFormatter.lIlIllIllIllIl[17] = (0x3D ^ 0x36);
        MessageFormatter.lIlIllIllIllIl[18] = (0x6B ^ 0x5D ^ (0x70 ^ 0x4A));
        MessageFormatter.lIlIllIllIllIl[19] = (47 + 108 - 58 + 45 ^ 80 + 62 - 47 + 36);
        MessageFormatter.lIlIllIllIllIl[20] = (0xE3 ^ 0x9E);
        MessageFormatter.lIlIllIllIllIl[21] = (0x6F ^ 0x61);
        MessageFormatter.lIlIllIllIllIl[22] = (0x98 ^ 0x97);
    }
    
    private static void charArrayAppend(final StringBuffer lllllllllllllIIIIllIIllllllIIIll, final char[] lllllllllllllIIIIllIIllllllIIlIl) {
        lllllllllllllIIIIllIIllllllIIIll.append((char)MessageFormatter.lIlIllIllIllIl[9]);
        "".length();
        final int lllllllllllllIIIIllIIllllllIIlII = lllllllllllllIIIIllIIllllllIIlIl.length;
        int lllllllllllllIIIIllIIllllllIIlll = MessageFormatter.lIlIllIllIllIl[1];
        while (llllIIlIIIlIIII(lllllllllllllIIIIllIIllllllIIlll, lllllllllllllIIIIllIIllllllIIlII)) {
            lllllllllllllIIIIllIIllllllIIIll.append(lllllllllllllIIIIllIIllllllIIlIl[lllllllllllllIIIIllIIllllllIIlll]);
            "".length();
            if (llllIIlIIIlIIll(lllllllllllllIIIIllIIllllllIIlll, lllllllllllllIIIIllIIllllllIIlII - MessageFormatter.lIlIllIllIllIl[0])) {
                lllllllllllllIIIIllIIllllllIIIll.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[14]]);
                "".length();
            }
            ++lllllllllllllIIIIllIIllllllIIlll;
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        lllllllllllllIIIIllIIllllllIIIll.append((char)MessageFormatter.lIlIllIllIllIl[7]);
        "".length();
    }
    
    private static void deeplyAppendParameter(final StringBuffer lllllllllllllIIIIllIlIIIIIIlllll, final Object lllllllllllllIIIIllIlIIIIIlIIIIl, final Map<Object[], Void> lllllllllllllIIIIllIlIIIIIlIIIII) {
        if (llllIIlIIIIllll(lllllllllllllIIIIllIlIIIIIlIIIIl)) {
            lllllllllllllIIIIllIlIIIIIIlllll.append(MessageFormatter.lIlIllIllIllII[MessageFormatter.lIlIllIllIllIl[0]]);
            "".length();
            return;
        }
        if (llllIIlIIIIllIl(lllllllllllllIIIIllIlIIIIIlIIIIl.getClass().isArray() ? 1 : 0)) {
            safeObjectAppend(lllllllllllllIIIIllIlIIIIIIlllll, lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof boolean[]) ? 1 : 0)) {
            booleanArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (boolean[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if ((127 + 83 - 194 + 119 ^ 102 + 39 - 44 + 34) < " ".length()) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof byte[]) ? 1 : 0)) {
            byteArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (byte[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if ((0x0 ^ 0x4) < 0) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof char[]) ? 1 : 0)) {
            charArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (char[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (((0x29 ^ 0x49) & ~(0x40 ^ 0x20)) > (0xC6 ^ 0xC2)) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof short[]) ? 1 : 0)) {
            shortArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (short[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if ((0x97 ^ 0x93) <= 0) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof int[]) ? 1 : 0)) {
            intArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (int[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof long[]) ? 1 : 0)) {
            longArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (long[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof float[]) ? 1 : 0)) {
            floatArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (float[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (((0x2D ^ 0x16) & ~(0xB6 ^ 0x8D)) >= " ".length()) {
                return;
            }
        }
        else if (llllIIlIIIIlllI((lllllllllllllIIIIllIlIIIIIlIIIIl instanceof double[]) ? 1 : 0)) {
            doubleArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (double[])lllllllllllllIIIIllIlIIIIIlIIIIl);
            "".length();
            if (" ".length() == -" ".length()) {
                return;
            }
        }
        else {
            objectArrayAppend(lllllllllllllIIIIllIlIIIIIIlllll, (Object[])lllllllllllllIIIIllIlIIIIIlIIIIl, lllllllllllllIIIIllIlIIIIIlIIIII);
        }
    }
    
    private static boolean llllIIlIIIlIIII(final int lllllllllllllIIIIllIIlllIllIIlII, final int lllllllllllllIIIIllIIlllIllIIIll) {
        return lllllllllllllIIIIllIIlllIllIIlII < lllllllllllllIIIIllIIlllIllIIIll;
    }
}
