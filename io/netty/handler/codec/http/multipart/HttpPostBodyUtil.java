// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.charset.Charset;

final class HttpPostBodyUtil
{
    private static final /* synthetic */ String[] llIIIIllllllIl;
    private static final /* synthetic */ int[] llIIIlIIIIIIlI;
    
    private static void lIIIlIIIlIIlllIl() {
        (llIIIIllllllIl = new String[HttpPostBodyUtil.llIIIlIIIIIIlI[10]])[HttpPostBodyUtil.llIIIlIIIIIIlI[1]] = lIIIlIIIlIIlIlIl("H4XEPKrdtZLc3jUCU8KI/A==", "fTFzJ");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[0]] = lIIIlIIIlIIlIlIl("nx9iT+v5bWqAVyXBeq2owDNM2H9+gTSw", "RAggm");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[2]] = lIIIlIIIlIIlIlll("BgcJOyQEFg0+IglYFjQ5AgNUJDkVEhg6", "gwyWM");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[4]] = lIIIlIIIlIIlIlIl("6DnhA3iOPNK6IxbWlJ2EuQ==", "BfcCv");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[5]] = lIIIlIIIlIIlIlll("BxI5Gy4aBicbaAcOLQoj", "jgUoG");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[6]] = lIIIlIIIlIIlIlIl("eFqTR5Y3aH64W6VS6ljXSQ==", "mXNWI");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[7]] = lIIIlIIIlIIlIlll("LiUaPA==", "HLvYo");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[8]] = lIIIlIIIlIIlllII("w4sGbCxeWqnTDeQOJwV1Rw==", "UfBjp");
        HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[9]] = lIIIlIIIlIIlIlIl("w7WGVPj5SyI=", "tJuxw");
    }
    
    static int findWhitespace(final String llllllllllllIlllIllIIlIIlllIlIll, final int llllllllllllIlllIllIIlIIlllIlIIl) {
        int llllllllllllIlllIllIIlIIlllIIlll = llllllllllllIlllIllIIlIIlllIlIIl;
        while (lIIIlIIIlIlIIlII(llllllllllllIlllIllIIlIIlllIIlll, llllllllllllIlllIllIIlIIlllIlIll.length())) {
            if (lIIIlIIIlIlIIllI(Character.isWhitespace(llllllllllllIlllIllIIlIIlllIlIll.charAt(llllllllllllIlllIllIIlIIlllIIlll)) ? 1 : 0)) {
                "".length();
                if (" ".length() != " ".length()) {
                    return (0x15 ^ 0x32) & ~(0xC ^ 0x2B);
                }
                break;
            }
            else {
                ++llllllllllllIlllIllIIlIIlllIIlll;
                "".length();
                if ("  ".length() < 0) {
                    return (51 + 91 - 101 + 139 ^ 56 + 36 - 73 + 109) & (0x5C ^ 0x77 ^ (0x21 ^ 0x3E) ^ -" ".length());
                }
                continue;
            }
        }
        return llllllllllllIlllIllIIlIIlllIIlll;
    }
    
    private static void lIIIlIIIlIlIIIll() {
        (llIIIlIIIIIIlI = new int[11])[0] = " ".length();
        HttpPostBodyUtil.llIIIlIIIIIIlI[1] = ((0x35 ^ 0x70) & ~(0x6F ^ 0x2A));
        HttpPostBodyUtil.llIIIlIIIIIIlI[2] = "  ".length();
        HttpPostBodyUtil.llIIIlIIIIIIlI[3] = (-(0xFFFFE83D & 0x77CF) & (0xFFFFFFBD & 0x7FEE));
        HttpPostBodyUtil.llIIIlIIIIIIlI[4] = "   ".length();
        HttpPostBodyUtil.llIIIlIIIIIIlI[5] = (0xA5 ^ 0xA1);
        HttpPostBodyUtil.llIIIlIIIIIIlI[6] = (0x9C ^ 0x99);
        HttpPostBodyUtil.llIIIlIIIIIIlI[7] = (0x46 ^ 0x3A ^ (0x29 ^ 0x53));
        HttpPostBodyUtil.llIIIlIIIIIIlI[8] = (38 + 98 - 64 + 122 ^ 54 + 138 - 150 + 155);
        HttpPostBodyUtil.llIIIlIIIIIIlI[9] = (0xE0 ^ 0xC4 ^ (0x1C ^ 0x30));
        HttpPostBodyUtil.llIIIlIIIIIIlI[10] = (0x3B ^ 0x4B ^ (0x77 ^ 0xE));
    }
    
    private static boolean lIIIlIIIlIlIIlIl(final int llllllllllllIlllIllIIlIIlIIlllII) {
        return llllllllllllIlllIllIIlIIlIIlllII == 0;
    }
    
    static int findEndOfString(final String llllllllllllIlllIllIIlIIllIllIIl) {
        int llllllllllllIlllIllIIlIIllIllIII = llllllllllllIlllIllIIlIIllIllIIl.length();
        while (lIIIlIIIlIlIIlll(llllllllllllIlllIllIIlIIllIllIII)) {
            if (lIIIlIIIlIlIIlIl(Character.isWhitespace(llllllllllllIlllIllIIlIIllIllIIl.charAt(llllllllllllIlllIllIIlIIllIllIII - HttpPostBodyUtil.llIIIlIIIIIIlI[0])) ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return (0x6C ^ 0x5C) & ~(0x2C ^ 0x1C);
                }
                break;
            }
            else {
                --llllllllllllIlllIllIIlIIllIllIII;
                "".length();
                if (((0x7C ^ 0x30) & ~(0xFC ^ 0xB0)) > 0) {
                    return (0xE8 ^ 0xBA) & ~(0x6B ^ 0x39);
                }
                continue;
            }
        }
        return llllllllllllIlllIllIIlIIllIllIII;
    }
    
    private static String lIIIlIIIlIIlllII(final String llllllllllllIlllIllIIlIIlIllllll, final String llllllllllllIlllIllIIlIIlIlllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIIlIlllllI.getBytes(StandardCharsets.UTF_8)), HttpPostBodyUtil.llIIIlIIIIIIlI[9]), "DES");
            final Cipher llllllllllllIlllIllIIlIIllIIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIllIIlIIllIIIIll.init(HttpPostBodyUtil.llIIIlIIIIIIlI[2], llllllllllllIlllIllIIlIIllIIIlII);
            return new String(llllllllllllIlllIllIIlIIllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIIllIIIIlI) {
            llllllllllllIlllIllIIlIIllIIIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlIIIlIlIIIll();
        lIIIlIIIlIIlllIl();
        FILENAME = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[1]];
        CONTENT_DISPOSITION = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[0]];
        DEFAULT_BINARY_CONTENT_TYPE = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[2]];
        chunkSize = HttpPostBodyUtil.llIIIlIIIIIIlI[3];
        FORM_DATA = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[4]];
        MULTIPART_MIXED = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[5]];
        DEFAULT_TEXT_CONTENT_TYPE = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[6]];
        FILE = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[7]];
        ATTACHMENT = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[8]];
        NAME = HttpPostBodyUtil.llIIIIllllllIl[HttpPostBodyUtil.llIIIlIIIIIIlI[9]];
        ISO_8859_1 = CharsetUtil.ISO_8859_1;
        US_ASCII = CharsetUtil.US_ASCII;
    }
    
    private static boolean lIIIlIIIlIlIIlll(final int llllllllllllIlllIllIIlIIlIIllIlI) {
        return llllllllllllIlllIllIIlIIlIIllIlI > 0;
    }
    
    private static String lIIIlIIIlIIlIlIl(final String llllllllllllIlllIllIIlIIllIIlllI, final String llllllllllllIlllIllIIlIIllIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIlIIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIlIIllIlIIII.init(HttpPostBodyUtil.llIIIlIIIIIIlI[2], llllllllllllIlllIllIIlIIllIlIIIl);
            return new String(llllllllllllIlllIllIIlIIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIIllIIllll) {
            llllllllllllIlllIllIIlIIllIIllll.printStackTrace();
            return null;
        }
    }
    
    private HttpPostBodyUtil() {
    }
    
    private static boolean lIIIlIIIlIlIIllI(final int llllllllllllIlllIllIIlIIlIIllllI) {
        return llllllllllllIlllIllIIlIIlIIllllI != 0;
    }
    
    private static String lIIIlIIIlIIlIlll(String llllllllllllIlllIllIIlIIlIlIllII, final String llllllllllllIlllIllIIlIIlIlIlIll) {
        llllllllllllIlllIllIIlIIlIlIllII = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIlIIlIlIllll = new StringBuilder();
        final char[] llllllllllllIlllIllIIlIIlIlIlllI = llllllllllllIlllIllIIlIIlIlIlIll.toCharArray();
        int llllllllllllIlllIllIIlIIlIlIllIl = HttpPostBodyUtil.llIIIlIIIIIIlI[1];
        final char llllllllllllIlllIllIIlIIlIlIIlll = (Object)llllllllllllIlllIllIIlIIlIlIllII.toCharArray();
        final double llllllllllllIlllIllIIlIIlIlIIllI = llllllllllllIlllIllIIlIIlIlIIlll.length;
        double llllllllllllIlllIllIIlIIlIlIIlIl = HttpPostBodyUtil.llIIIlIIIIIIlI[1];
        while (lIIIlIIIlIlIIlII((int)llllllllllllIlllIllIIlIIlIlIIlIl, (int)llllllllllllIlllIllIIlIIlIlIIllI)) {
            final char llllllllllllIlllIllIIlIIlIllIIlI = llllllllllllIlllIllIIlIIlIlIIlll[llllllllllllIlllIllIIlIIlIlIIlIl];
            llllllllllllIlllIllIIlIIlIlIllll.append((char)(llllllllllllIlllIllIIlIIlIllIIlI ^ llllllllllllIlllIllIIlIIlIlIlllI[llllllllllllIlllIllIIlIIlIlIllIl % llllllllllllIlllIllIIlIIlIlIlllI.length]));
            "".length();
            ++llllllllllllIlllIllIIlIIlIlIllIl;
            ++llllllllllllIlllIllIIlIIlIlIIlIl;
            "".length();
            if (((211 + 20 - 41 + 43 ^ 103 + 134 - 184 + 120) & (0x2A ^ 0x58 ^ (0x75 ^ 0x43) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIlIIlIlIllll);
    }
    
    static int findNonWhitespace(final String llllllllllllIlllIllIIlIIllllIlII, final int llllllllllllIlllIllIIlIIllllIIlI) {
        int llllllllllllIlllIllIIlIIllllIlIl = llllllllllllIlllIllIIlIIllllIIlI;
        while (lIIIlIIIlIlIIlII(llllllllllllIlllIllIIlIIllllIlIl, llllllllllllIlllIllIIlIIllllIlII.length())) {
            if (lIIIlIIIlIlIIlIl(Character.isWhitespace(llllllllllllIlllIllIIlIIllllIlII.charAt(llllllllllllIlllIllIIlIIllllIlIl)) ? 1 : 0)) {
                "".length();
                if ("   ".length() <= 0) {
                    return (0xB6 ^ 0xBF ^ (0x8B ^ 0x9D)) & (148 + 114 - 135 + 32 ^ 53 + 53 - 70 + 92 ^ -" ".length());
                }
                break;
            }
            else {
                ++llllllllllllIlllIllIIlIIllllIlIl;
                "".length();
                if (-" ".length() > " ".length()) {
                    return (0xC0 ^ 0x9A) & ~(0x74 ^ 0x2E);
                }
                continue;
            }
        }
        return llllllllllllIlllIllIIlIIllllIlIl;
    }
    
    private static boolean lIIIlIIIlIlIIlII(final int llllllllllllIlllIllIIlIIlIlIIIIl, final int llllllllllllIlllIllIIlIIlIlIIIII) {
        return llllllllllllIlllIllIIlIIlIlIIIIl < llllllllllllIlllIllIIlIIlIlIIIII;
    }
    
    public enum TransferEncodingMechanism
    {
        private static final /* synthetic */ String[] llIlIIlIIIIIIl;
        private static final /* synthetic */ int[] llIlIIlIIIIIll;
        
        BIT7(TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[1]]), 
        BINARY(TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[5]]);
        
        private final /* synthetic */ String value;
        
        BIT8(TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[3]]);
        
        private static void lIIlIIlIIlIIIlll() {
            (llIlIIlIIIIIll = new int[8])[0] = ((15 + 72 - 75 + 146 ^ 69 + 128 - 37 + 33) & (107 + 58 - 64 + 106 ^ 79 + 89 - 58 + 34 ^ -" ".length()));
            TransferEncodingMechanism.llIlIIlIIIIIll[1] = " ".length();
            TransferEncodingMechanism.llIlIIlIIIIIll[2] = "  ".length();
            TransferEncodingMechanism.llIlIIlIIIIIll[3] = "   ".length();
            TransferEncodingMechanism.llIlIIlIIIIIll[4] = (36 + 58 - 91 + 130 ^ 75 + 122 - 141 + 73);
            TransferEncodingMechanism.llIlIIlIIIIIll[5] = (0x63 ^ 0x66);
            TransferEncodingMechanism.llIlIIlIIIIIll[6] = (0xC1 ^ 0xC7);
            TransferEncodingMechanism.llIlIIlIIIIIll[7] = (0xBD ^ 0xB5);
        }
        
        private TransferEncodingMechanism(final String llllllllllllIllIllIIlIIIIlllIIII) {
            this.value = llllllllllllIllIllIIlIIIIlllIIII;
        }
        
        static {
            lIIlIIlIIlIIIlll();
            lIIlIIlIIlIIIIII();
            final TransferEncodingMechanism[] $values = new TransferEncodingMechanism[TransferEncodingMechanism.llIlIIlIIIIIll[3]];
            $values[TransferEncodingMechanism.llIlIIlIIIIIll[0]] = TransferEncodingMechanism.BIT7;
            $values[TransferEncodingMechanism.llIlIIlIIIIIll[1]] = TransferEncodingMechanism.BIT8;
            $values[TransferEncodingMechanism.llIlIIlIIIIIll[2]] = TransferEncodingMechanism.BINARY;
            $VALUES = $values;
        }
        
        public String value() {
            return this.value;
        }
        
        private static void lIIlIIlIIlIIIIII() {
            (llIlIIlIIIIIIl = new String[TransferEncodingMechanism.llIlIIlIIIIIll[6]])[TransferEncodingMechanism.llIlIIlIIIIIll[0]] = lIIlIIlIIIlllllI("uTe/ohQobgU=", "mXsSX");
            TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[1]] = lIIlIIlIIIlllllI("HXVzaWsqdOg=", "YViLA");
            TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[2]] = lIIlIIlIIIlllllI("8ILRdTIvzKA=", "wmLUO");
            TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[3]] = lIIlIIlIIIlllllI("0h78s6Tg/zg=", "ileBz");
            TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[4]] = lIIlIIlIIIllllll("yXlQ3qqoIf4=", "dOOLq");
            TransferEncodingMechanism.llIlIIlIIIIIIl[TransferEncodingMechanism.llIlIIlIIIIIll[5]] = lIIlIIlIIIlllllI("nE9kZtbGluQ=", "zwePh");
        }
        
        private TransferEncodingMechanism() {
            this.value = this.name();
        }
        
        private static String lIIlIIlIIIlllllI(final String llllllllllllIllIllIIlIIIIlIIlIlI, final String llllllllllllIllIllIIlIIIIlIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllIllIIlIIIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), TransferEncodingMechanism.llIlIIlIIIIIll[7]), "DES");
                final Cipher llllllllllllIllIllIIlIIIIlIIllII = Cipher.getInstance("DES");
                llllllllllllIllIllIIlIIIIlIIllII.init(TransferEncodingMechanism.llIlIIlIIIIIll[2], llllllllllllIllIllIIlIIIIlIIllIl);
                return new String(llllllllllllIllIllIIlIIIIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIlIIIIlIIlIll) {
                llllllllllllIllIllIIlIIIIlIIlIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String toString() {
            return this.value;
        }
        
        private static String lIIlIIlIIIllllll(final String llllllllllllIllIllIIlIIIIlIlIlIl, final String llllllllllllIllIllIIlIIIIlIlIlII) {
            try {
                final SecretKeySpec llllllllllllIllIllIIlIIIIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllIIlIIIIlIllIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIllIIlIIIIlIllIIl.init(TransferEncodingMechanism.llIlIIlIIIIIll[2], llllllllllllIllIllIIlIIIIlIllIlI);
                return new String(llllllllllllIllIllIIlIIIIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIlIIIIlIllIII) {
                llllllllllllIllIllIIlIIIIlIllIII.printStackTrace();
                return null;
            }
        }
    }
    
    static class SeekAheadOptimize
    {
        /* synthetic */ int readerIndex;
        /* synthetic */ int origPos;
        private static final /* synthetic */ int[] lIIIIlllllIIlI;
        /* synthetic */ int pos;
        /* synthetic */ int limit;
        /* synthetic */ ByteBuf buffer;
        /* synthetic */ byte[] bytes;
        
        static {
            lIllllIlIlIIIIl();
        }
        
        int getReadPosition(final int lllllllllllllIlIIIlllIIlllIllllI) {
            return lllllllllllllIlIIIlllIIlllIllllI - this.origPos + this.readerIndex;
        }
        
        private static boolean lIllllIlIlIIIlI(final int lllllllllllllIlIIIlllIIlllIlIlll) {
            return lllllllllllllIlIIIlllIIlllIlIlll == 0;
        }
        
        void setReadPosition(final int lllllllllllllIlIIIlllIIllllIIlII) {
            this.pos -= lllllllllllllIlIIIlllIIllllIIlII;
            this.readerIndex = this.getReadPosition(this.pos);
            this.buffer.readerIndex(this.readerIndex);
            "".length();
        }
        
        void clear() {
            this.buffer = null;
            this.bytes = null;
            this.limit = SeekAheadOptimize.lIIIIlllllIIlI[0];
            this.pos = SeekAheadOptimize.lIIIIlllllIIlI[0];
            this.readerIndex = SeekAheadOptimize.lIIIIlllllIIlI[0];
        }
        
        private static void lIllllIlIlIIIIl() {
            (lIIIIlllllIIlI = new int[1])[0] = ((0x2A ^ 0x18 ^ (0x5E ^ 0xF)) & (172 + 63 - 104 + 110 ^ 124 + 85 - 178 + 115 ^ -" ".length()));
        }
        
        SeekAheadOptimize(final ByteBuf lllllllllllllIlIIIlllIIllllIlIlI) throws SeekAheadNoBackArrayException {
            if (lIllllIlIlIIIlI(lllllllllllllIlIIIlllIIllllIlIlI.hasArray() ? 1 : 0)) {
                throw new SeekAheadNoBackArrayException();
            }
            this.buffer = lllllllllllllIlIIIlllIIllllIlIlI;
            this.bytes = lllllllllllllIlIIIlllIIllllIlIlI.array();
            this.readerIndex = lllllllllllllIlIIIlllIIllllIlIlI.readerIndex();
            final int n = lllllllllllllIlIIIlllIIllllIlIlI.arrayOffset() + this.readerIndex;
            this.pos = n;
            this.origPos = n;
            this.limit = lllllllllllllIlIIIlllIIllllIlIlI.arrayOffset() + lllllllllllllIlIIIlllIIllllIlIlI.writerIndex();
        }
    }
    
    static class SeekAheadNoBackArrayException extends Exception
    {
    }
}
