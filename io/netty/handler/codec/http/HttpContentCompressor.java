// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.compression.ZlibCodecFactory;
import io.netty.channel.ChannelHandler;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.StringUtil;
import io.netty.handler.codec.compression.ZlibWrapper;

public class HttpContentCompressor extends HttpContentEncoder
{
    private final /* synthetic */ int compressionLevel;
    private static final /* synthetic */ String[] lllIIIlllllIll;
    private final /* synthetic */ int memLevel;
    private final /* synthetic */ int windowBits;
    private static final /* synthetic */ int[] lllIIIllllllIl;
    
    private static boolean lIIllllIlIIIIlll(final int llllllllllllIlIlllllIllllllllIIl) {
        return llllllllllllIlIlllllIllllllllIIl > 0;
    }
    
    private static boolean lIIllllIIlllllIl(final int llllllllllllIlIlllllIlllllllllIl) {
        return llllllllllllIlIlllllIlllllllllIl >= 0;
    }
    
    private static boolean lIIllllIIllllllI(final int llllllllllllIlIllllllIIIIIIIlIII, final int llllllllllllIlIllllllIIIIIIIIlll) {
        return llllllllllllIlIllllllIIIIIIIlIII > llllllllllllIlIllllllIIIIIIIIlll;
    }
    
    public HttpContentCompressor(final int llllllllllllIlIllllllIIIlIIIIlIl) {
        this(llllllllllllIlIllllllIIIlIIIIlIl, HttpContentCompressor.lllIIIllllllIl[1], HttpContentCompressor.lllIIIllllllIl[2]);
    }
    
    private static void lIIllllIIllllIll() {
        (lllIIIlllllIll = new String[HttpContentCompressor.lllIIIllllllIl[17]])[HttpContentCompressor.lllIIIllllllIl[4]] = lIIllllIIlllIlIl("i+7ULemTbsS/xho7HMQ9TMKt2CTWRKzE", "fhSKr");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[5]] = lIIllllIIlllIlIl("A9/lOm5avK+7oIoU2NXj6CtR8/nEQg5a", "sjkOU");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[6]] = lIIllllIIlllIlIl("xoiywOfkSJvQ5yGXAdpa3w==", "BfDsH");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[7]] = lIIllllIIlllIlIl("Tl0/PoF/kgjWrNd1tlIgrPRPK8GU0cEQ", "sTbdv");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[8]] = lIIllllIIlllIllI("r4nysrGHsqHajxw7UFVW0w==", "FVbHb");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[9]] = lIIllllIIlllIlIl("PPV2RwkvO3+08HL1w1e1EU/xnQFkStVw", "bUhpc");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[0]] = lIIllllIIlllIlll("AB8eOxAtBF0KGyAfFCYbJA==", "CppOu");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[10]] = lIIllllIIlllIllI("OyV5LARoWFkgqhGcZgxUFw==", "BCSRK");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[2]] = lIIllllIIlllIlll("ETM9Hg==", "vITnf");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[3]] = lIIllllIIlllIlIl("hJl3rq5KAJg=", "PDdSU");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[14]] = lIIllllIIlllIllI("l0y5FBOMcuc=", "MYRim");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[15]] = lIIllllIIlllIllI("ZoV6izHI06o=", "tsIVw");
        HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[16]] = lIIllllIIlllIllI("zEDw7UXOKj4=", "LNDKW");
    }
    
    private static boolean lIIllllIlIIIIllI(final int llllllllllllIlIllllllIIIIIIIIIIl) {
        return llllllllllllIlIllllllIIIIIIIIIIl != 0;
    }
    
    static {
        lIIllllIIlllllII();
        lIIllllIIllllIll();
    }
    
    private static boolean lIIllllIlIIIIIlI(final Object llllllllllllIlIllllllIIIIIIIIIll) {
        return llllllllllllIlIllllllIIIIIIIIIll == null;
    }
    
    private static boolean lIIllllIlIIIIIII(final Object llllllllllllIlIllllllIIIIIIIIlIl) {
        return llllllllllllIlIllllllIIIIIIIIlIl != null;
    }
    
    private static boolean lIIllllIlIIIIlIl(final int llllllllllllIlIlllllIlllllllIllI, final int llllllllllllIlIlllllIlllllllIlIl) {
        return llllllllllllIlIlllllIlllllllIllI != llllllllllllIlIlllllIlllllllIlIl;
    }
    
    protected ZlibWrapper determineWrapper(final String llllllllllllIlIllllllIIIIlIIllll) {
        float llllllllllllIlIllllllIIIIlIlIIlI = -1.0f;
        float llllllllllllIlIllllllIIIIlIlIIIl = -1.0f;
        float llllllllllllIlIllllllIIIIlIlIIII = -1.0f;
        final String[] llllllllllllIlIllllllIIIIlIlIlll = StringUtil.split(llllllllllllIlIllllllIIIIlIIllll, (char)HttpContentCompressor.lllIIIllllllIl[11]);
        final int llllllllllllIlIllllllIIIIlIlIllI = llllllllllllIlIllllllIIIIlIlIlll.length;
        int llllllllllllIlIllllllIIIIlIlIlIl = HttpContentCompressor.lllIIIllllllIl[4];
        while (lIIllllIlIIIIlII(llllllllllllIlIllllllIIIIlIlIlIl, llllllllllllIlIllllllIIIIlIlIllI)) {
            final String llllllllllllIlIllllllIIIIlIllIII = llllllllllllIlIllllllIIIIlIlIlll[llllllllllllIlIllllllIIIIlIlIlIl];
            float llllllllllllIlIllllllIIIIlIllIlI = 1.0f;
            final int llllllllllllIlIllllllIIIIlIllIIl = llllllllllllIlIllllllIIIIlIllIII.indexOf(HttpContentCompressor.lllIIIllllllIl[12]);
            if (lIIllllIlIIIIlIl(llllllllllllIlIllllllIIIIlIllIIl, HttpContentCompressor.lllIIIllllllIl[13])) {
                try {
                    llllllllllllIlIllllllIIIIlIllIlI = Float.valueOf(llllllllllllIlIllllllIIIIlIllIII.substring(llllllllllllIlIllllllIIIIlIllIIl + HttpContentCompressor.lllIIIllllllIl[5]));
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                catch (NumberFormatException llllllllllllIlIllllllIIIIlIllIll) {
                    llllllllllllIlIllllllIIIIlIllIlI = 0.0f;
                }
            }
            if (lIIllllIlIIIIllI(llllllllllllIlIllllllIIIIlIllIII.contains(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[14]]) ? 1 : 0)) {
                llllllllllllIlIllllllIIIIlIlIIlI = llllllllllllIlIllllllIIIIlIllIlI;
                "".length();
                if ("   ".length() == " ".length()) {
                    return null;
                }
            }
            else if (lIIllllIlIIIIllI(llllllllllllIlIllllllIIIIlIllIII.contains(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[15]]) ? 1 : 0) && lIIllllIlIIIIlll(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIllIlI, llllllllllllIlIllllllIIIIlIlIIIl))) {
                llllllllllllIlIllllllIIIIlIlIIIl = llllllllllllIlIllllllIIIIlIllIlI;
                "".length();
                if (((99 + 139 - 64 + 52 ^ 155 + 143 - 226 + 103) & (14 + 209 - 197 + 220 ^ 138 + 178 - 315 + 186 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else if (lIIllllIlIIIIllI(llllllllllllIlIllllllIIIIlIllIII.contains(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[16]]) ? 1 : 0) && lIIllllIlIIIIlll(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIllIlI, llllllllllllIlIllllllIIIIlIlIIII))) {
                llllllllllllIlIllllllIIIIlIlIIII = llllllllllllIlIllllllIIIIlIllIlI;
            }
            ++llllllllllllIlIllllllIIIIlIlIlIl;
            "".length();
            if (((0xAF ^ 0x96 ^ (0xF3 ^ 0x94)) & (0x56 ^ 0x17 ^ (0xAD ^ 0xB2) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        if (lIIllllIlIIIlIII(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIIl, 0.0f)) && !lIIllllIlIIIIlll(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIII, 0.0f))) {
            if (lIIllllIlIIIIlll(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIlI, 0.0f))) {
                if (lIIllllIlIIIIIIl(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIIl, -1.0f))) {
                    return ZlibWrapper.GZIP;
                }
                if (lIIllllIlIIIIIIl(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIII, -1.0f))) {
                    return ZlibWrapper.ZLIB;
                }
            }
            return null;
        }
        if (lIIllllIIlllllIl(lIIllllIlIIIIIll(llllllllllllIlIllllllIIIIlIlIIIl, llllllllllllIlIllllllIIIIlIlIIII))) {
            return ZlibWrapper.GZIP;
        }
        return ZlibWrapper.ZLIB;
    }
    
    private static boolean lIIllllIlIIIIIIl(final int llllllllllllIlIlllllIlllllllllll) {
        return llllllllllllIlIlllllIlllllllllll == 0;
    }
    
    private static int lIIllllIlIIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIIllllIIlllIlll(String llllllllllllIlIllllllIIIIIlIlIII, final String llllllllllllIlIllllllIIIIIlIIlll) {
        llllllllllllIlIllllllIIIIIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIlIllllllIIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllIIIIIlIlIll = new StringBuilder();
        final char[] llllllllllllIlIllllllIIIIIlIlIlI = llllllllllllIlIllllllIIIIIlIIlll.toCharArray();
        int llllllllllllIlIllllllIIIIIlIlIIl = HttpContentCompressor.lllIIIllllllIl[4];
        final short llllllllllllIlIllllllIIIIIlIIIll = (Object)llllllllllllIlIllllllIIIIIlIlIII.toCharArray();
        final int llllllllllllIlIllllllIIIIIlIIIlI = llllllllllllIlIllllllIIIIIlIIIll.length;
        String llllllllllllIlIllllllIIIIIlIIIIl = (String)HttpContentCompressor.lllIIIllllllIl[4];
        while (lIIllllIlIIIIlII((int)llllllllllllIlIllllllIIIIIlIIIIl, llllllllllllIlIllllllIIIIIlIIIlI)) {
            final char llllllllllllIlIllllllIIIIIlIlllI = llllllllllllIlIllllllIIIIIlIIIll[llllllllllllIlIllllllIIIIIlIIIIl];
            llllllllllllIlIllllllIIIIIlIlIll.append((char)(llllllllllllIlIllllllIIIIIlIlllI ^ llllllllllllIlIllllllIIIIIlIlIlI[llllllllllllIlIllllllIIIIIlIlIIl % llllllllllllIlIllllllIIIIIlIlIlI.length]));
            "".length();
            ++llllllllllllIlIllllllIIIIIlIlIIl;
            ++llllllllllllIlIllllllIIIIIlIIIIl;
            "".length();
            if (((0x9 ^ 0x5E) & ~(0x18 ^ 0x4F)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllIIIIIlIlIll);
    }
    
    private static boolean lIIllllIlIIIIlII(final int llllllllllllIlIllllllIIIIIIIllII, final int llllllllllllIlIllllllIIIIIIIlIll) {
        return llllllllllllIlIllllllIIIIIIIllII < llllllllllllIlIllllllIIIIIIIlIll;
    }
    
    private static void lIIllllIIlllllII() {
        (lllIIIllllllIl = new int[18])[0] = (0x65 ^ 0x63);
        HttpContentCompressor.lllIIIllllllIl[1] = (0xA2 ^ 0x93 ^ (0x79 ^ 0x47));
        HttpContentCompressor.lllIIIllllllIl[2] = (0x43 ^ 0x4B);
        HttpContentCompressor.lllIIIllllllIl[3] = (0x43 ^ 0x4A);
        HttpContentCompressor.lllIIIllllllIl[4] = ((0xA5 ^ 0xB0 ^ (0x20 ^ 0x6C)) & (0x23 ^ 0x24 ^ (0x5D ^ 0x3) ^ -" ".length()));
        HttpContentCompressor.lllIIIllllllIl[5] = " ".length();
        HttpContentCompressor.lllIIIllllllIl[6] = "  ".length();
        HttpContentCompressor.lllIIIllllllIl[7] = "   ".length();
        HttpContentCompressor.lllIIIllllllIl[8] = (0x31 ^ 0x35);
        HttpContentCompressor.lllIIIllllllIl[9] = (0x14 ^ 0x11);
        HttpContentCompressor.lllIIIllllllIl[10] = (0x71 ^ 0x25 ^ (0xD4 ^ 0x87));
        HttpContentCompressor.lllIIIllllllIl[11] = (0x9E ^ 0x8F ^ (0xBB ^ 0x86));
        HttpContentCompressor.lllIIIllllllIl[12] = (0xDC ^ 0x90 ^ (0xDC ^ 0xAD));
        HttpContentCompressor.lllIIIllllllIl[13] = -" ".length();
        HttpContentCompressor.lllIIIllllllIl[14] = (70 + 58 - 4 + 32 ^ 4 + 84 + 60 + 2);
        HttpContentCompressor.lllIIIllllllIl[15] = (0x26 ^ 0x2D);
        HttpContentCompressor.lllIIIllllllIl[16] = (13 + 17 + 68 + 56 ^ 118 + 48 - 21 + 5);
        HttpContentCompressor.lllIIIllllllIl[17] = (0x37 ^ 0x3A);
    }
    
    private static boolean lIIllllIIlllllll(final int llllllllllllIlIllllllIIIIIIlIIII, final int llllllllllllIlIllllllIIIIIIIllll) {
        return llllllllllllIlIllllllIIIIIIlIIII >= llllllllllllIlIllllllIIIIIIIllll;
    }
    
    private static boolean lIIllllIlIIIlIII(final int llllllllllllIlIlllllIllllllllIll) {
        return llllllllllllIlIlllllIllllllllIll <= 0;
    }
    
    @Override
    protected Result beginEncode(final HttpResponse llllllllllllIlIllllllIIIIlllIIIl, final String llllllllllllIlIllllllIIIIllIlIlI) throws Exception {
        final String llllllllllllIlIllllllIIIIllIllll = llllllllllllIlIllllllIIIIlllIIIl.headers().get(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[0]]);
        if (lIIllllIlIIIIIII(llllllllllllIlIllllllIIIIllIllll) && lIIllllIlIIIIIIl(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[10]].equalsIgnoreCase(llllllllllllIlIllllllIIIIllIllll) ? 1 : 0)) {
            return null;
        }
        final ZlibWrapper llllllllllllIlIllllllIIIIllIlllI = this.determineWrapper(llllllllllllIlIllllllIIIIllIlIlI);
        if (lIIllllIlIIIIIlI(llllllllllllIlIllllllIIIIllIlllI)) {
            return null;
        }
        String llllllllllllIlIllllllIIIIllIllIl = null;
        switch (HttpContentCompressor$1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[llllllllllllIlIllllllIIIIllIlllI.ordinal()]) {
            case 1: {
                llllllllllllIlIllllllIIIIllIllIl = HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[2]];
                "".length();
                if ((157 + 35 - 71 + 52 ^ 155 + 48 - 95 + 61) <= 0) {
                    return null;
                }
                break;
            }
            case 2: {
                llllllllllllIlIllllllIIIIllIllIl = HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[3]];
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
        final String llllllllllllIlllIllIIlIIIlIIllIl = llllllllllllIlIllllllIIIIllIllIl;
        final ChannelHandler[] lllllllllllllIIllIIIlIIlllIllIII = new ChannelHandler[HttpContentCompressor.lllIIIllllllIl[5]];
        lllllllllllllIIllIIIlIIlllIllIII[HttpContentCompressor.lllIIIllllllIl[4]] = ZlibCodecFactory.newZlibEncoder(llllllllllllIlIllllllIIIIllIlllI, this.compressionLevel, this.windowBits, this.memLevel);
        return new Result(llllllllllllIlllIllIIlIIIlIIllIl, new EmbeddedChannel(lllllllllllllIIllIIIlIIlllIllIII));
    }
    
    public HttpContentCompressor(final int llllllllllllIlIllllllIIIIllllIll, final int llllllllllllIlIllllllIIIIllllIlI, final int llllllllllllIlIllllllIIIIlllllIl) {
        if (!lIIllllIIlllllIl(llllllllllllIlIllllllIIIIllllIll) || lIIllllIIllllllI(llllllllllllIlIllllllIIIIllllIll, HttpContentCompressor.lllIIIllllllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[4]]).append(llllllllllllIlIllllllIIIIllllIll).append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[5]])));
        }
        if (!lIIllllIIlllllll(llllllllllllIlIllllllIIIIllllIlI, HttpContentCompressor.lllIIIllllllIl[3]) || lIIllllIIllllllI(llllllllllllIlIllllllIIIIllllIlI, HttpContentCompressor.lllIIIllllllIl[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[6]]).append(llllllllllllIlIllllllIIIIllllIlI).append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[7]])));
        }
        if (!lIIllllIIlllllll(llllllllllllIlIllllllIIIIlllllIl, HttpContentCompressor.lllIIIllllllIl[5]) || lIIllllIIllllllI(llllllllllllIlIllllllIIIIlllllIl, HttpContentCompressor.lllIIIllllllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[8]]).append(llllllllllllIlIllllllIIIIlllllIl).append(HttpContentCompressor.lllIIIlllllIll[HttpContentCompressor.lllIIIllllllIl[9]])));
        }
        this.compressionLevel = llllllllllllIlIllllllIIIIllllIll;
        this.windowBits = llllllllllllIlIllllllIIIIllllIlI;
        this.memLevel = llllllllllllIlIllllllIIIIlllllIl;
    }
    
    public HttpContentCompressor() {
        this(HttpContentCompressor.lllIIIllllllIl[0]);
    }
    
    private static String lIIllllIIlllIlIl(final String llllllllllllIlIllllllIIIIIIlIllI, final String llllllllllllIlIllllllIIIIIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIIIIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), HttpContentCompressor.lllIIIllllllIl[2]), "DES");
            final Cipher llllllllllllIlIllllllIIIIIIllIlI = Cipher.getInstance("DES");
            llllllllllllIlIllllllIIIIIIllIlI.init(HttpContentCompressor.lllIIIllllllIl[6], llllllllllllIlIllllllIIIIIIllIll);
            return new String(llllllllllllIlIllllllIIIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIIIIIIllIIl) {
            llllllllllllIlIllllllIIIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIIlllIllI(final String llllllllllllIlIllllllIIIIIllllIl, final String llllllllllllIlIllllllIIIIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIIIIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllllIIIIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllllIIIIIllllll.init(HttpContentCompressor.lllIIIllllllIl[6], llllllllllllIlIllllllIIIIlIIIIII);
            return new String(llllllllllllIlIllllllIIIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIIIIIlllllI) {
            llllllllllllIlIllllllIIIIIlllllI.printStackTrace();
            return null;
        }
    }
}
