// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.util.zip.DataFormatException;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.Inflater;
import java.util.zip.CRC32;

public class JdkZlibDecoder extends ZlibDecoder
{
    private static final /* synthetic */ int[] lllIlIIIIlIIlI;
    private /* synthetic */ boolean decideZlibOrNone;
    private /* synthetic */ int flags;
    private volatile /* synthetic */ boolean finished;
    private final /* synthetic */ byte[] dictionary;
    private final /* synthetic */ CRC32 crc;
    private /* synthetic */ int xlen;
    private static final /* synthetic */ String[] lllIlIIIIIllll;
    private /* synthetic */ GzipState gzipState;
    private /* synthetic */ Inflater inflater;
    
    private static boolean lIlIIIIlIllIllIl(final int llllllllllllIlIlllIIllIllIIIIlll) {
        return llllllllllllIlIlllIIllIllIIIIlll > 0;
    }
    
    private JdkZlibDecoder(final ZlibWrapper llllllllllllIlIlllIIlllIIIlllIlI, final byte[] llllllllllllIlIlllIIlllIIIlllIIl) {
        this.gzipState = GzipState.HEADER_START;
        this.flags = JdkZlibDecoder.lllIlIIIIlIIlI[0];
        this.xlen = JdkZlibDecoder.lllIlIIIIlIIlI[0];
        if (lIlIIIIlIllIIlll(llllllllllllIlIlllIIlllIIIlllIlI)) {
            throw new NullPointerException(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[1]]);
        }
        switch (JdkZlibDecoder$1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[llllllllllllIlIlllIIlllIIIlllIlI.ordinal()]) {
            case 1: {
                this.inflater = new Inflater((boolean)(JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0));
                this.crc = new CRC32();
                "".length();
                if (null != null) {
                    throw null;
                }
                break;
            }
            case 2: {
                this.inflater = new Inflater((boolean)(JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0));
                this.crc = null;
                "".length();
                if (-" ".length() > 0) {
                    throw null;
                }
                break;
            }
            case 3: {
                this.inflater = new Inflater();
                this.crc = null;
                "".length();
                if (-(0x6C ^ 0x10 ^ (0x69 ^ 0x10)) >= 0) {
                    throw null;
                }
                break;
            }
            case 4: {
                this.decideZlibOrNone = (JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0);
                this.crc = null;
                "".length();
                if (-(1 + 70 + 82 + 15 ^ 106 + 170 - 184 + 80) >= 0) {
                    throw null;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[2]]).append(llllllllllllIlIlllIIlllIIIlllIlI)));
            }
        }
        this.dictionary = llllllllllllIlIlllIIlllIIIlllIIl;
    }
    
    private static int lIlIIIIlIllIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIIIIlIllIlIlI(final int llllllllllllIlIlllIIllIllIIlIllI, final int llllllllllllIlIlllIIllIllIIlIlIl) {
        return llllllllllllIlIlllIIllIllIIlIllI < llllllllllllIlIlllIIllIllIIlIlIl;
    }
    
    private static String lIlIIIIlIlIllllI(final String llllllllllllIlIlllIIllIlllIIIlll, final String llllllllllllIlIlllIIllIlllIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIlllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIlllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIllIlllIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIllIlllIIlIIl.init(JdkZlibDecoder.lllIlIIIIlIIlI[3], llllllllllllIlIlllIIllIlllIIlIlI);
            return new String(llllllllllllIlIlllIIllIlllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIlllIIlIII) {
            llllllllllllIlIlllIIllIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIlIlllIIII(final int llllllllllllIlIlllIIllIllIIllIlI, final int llllllllllllIlIlllIIllIllIIllIIl) {
        return llllllllllllIlIlllIIllIllIIllIlI == llllllllllllIlIlllIIllIllIIllIIl;
    }
    
    private static void lIlIIIIlIllIIllI() {
        (lllIlIIIIlIIlI = new int[18])[0] = -" ".length();
        JdkZlibDecoder.lllIlIIIIlIIlI[1] = ((0x64 ^ 0x5C) & ~(0xAB ^ 0x93));
        JdkZlibDecoder.lllIlIIIIlIIlI[2] = " ".length();
        JdkZlibDecoder.lllIlIIIIlIIlI[3] = "  ".length();
        JdkZlibDecoder.lllIlIIIIlIIlI[4] = "   ".length();
        JdkZlibDecoder.lllIlIIIIlIIlI[5] = (0x49 ^ 0x6 ^ (0xF8 ^ 0xBD));
        JdkZlibDecoder.lllIlIIIIlIIlI[6] = (0x77 ^ 0x7B ^ (0x12 ^ 0x1));
        JdkZlibDecoder.lllIlIIIIlIIlI[7] = (0x9B ^ 0xC6 ^ (0xF2 ^ 0xAB));
        JdkZlibDecoder.lllIlIIIIlIIlI[8] = (0x15 ^ 0x1D);
        JdkZlibDecoder.lllIlIIIIlIIlI[9] = (0x35 ^ 0x30);
        JdkZlibDecoder.lllIlIIIIlIIlI[10] = (0x62 ^ 0x64);
        JdkZlibDecoder.lllIlIIIIlIIlI[11] = (0xE5 ^ 0xBC) + (49 + 148 - 170 + 138) - (0x73 ^ 0x32) + (0x0 ^ 0x23);
        JdkZlibDecoder.lllIlIIIIlIIlI[12] = (0x7C ^ 0x7B);
        JdkZlibDecoder.lllIlIIIIlIIlI[13] = (0xD ^ 0x1D);
        JdkZlibDecoder.lllIlIIIIlIIlI[14] = (0x7D ^ 0x3 ^ (0x2E ^ 0x59));
        JdkZlibDecoder.lllIlIIIIlIIlI[15] = (0x90 ^ 0x84 ^ (0x76 ^ 0x69));
        JdkZlibDecoder.lllIlIIIIlIIlI[16] = (-(0xFFFFBFFF & 0x4485) & (0xFFFFFE94 & 0x7DEF));
        JdkZlibDecoder.lllIlIIIIlIIlI[17] = (0x30 ^ 0x3D ^ " ".length());
    }
    
    private static String lIlIIIIlIlIlllIl(final String llllllllllllIlIlllIIllIllIlllIII, final String llllllllllllIlIlllIIllIllIllIlll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIllIllIlll.getBytes(StandardCharsets.UTF_8)), JdkZlibDecoder.lllIlIIIIlIIlI[8]), "DES");
            final Cipher llllllllllllIlIlllIIllIllIllllII = Cipher.getInstance("DES");
            llllllllllllIlIlllIIllIllIllllII.init(JdkZlibDecoder.lllIlIIIIlIIlI[3], llllllllllllIlIlllIIllIllIllllIl);
            return new String(llllllllllllIlIlllIIllIllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllIllIlllIll) {
            llllllllllllIlIlllIIllIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    private boolean readGZIPFooter(final ByteBuf llllllllllllIlIlllIIllIllllIIIIl) {
        if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIllllIIIIl.readableBytes(), JdkZlibDecoder.lllIlIIIIlIIlI[8])) {
            return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
        }
        this.verifyCrc(llllllllllllIlIlllIIllIllllIIIIl);
        int llllllllllllIlIlllIIllIllllIIlII = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        int llllllllllllIlIlllIIllIllllIIlll = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        while (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIllllIIlll, JdkZlibDecoder.lllIlIIIIlIIlI[7])) {
            llllllllllllIlIlllIIllIllllIIlII |= llllllllllllIlIlllIIllIllllIIIIl.readUnsignedByte() << llllllllllllIlIlllIIllIllllIIlll * JdkZlibDecoder.lllIlIIIIlIIlI[8];
            ++llllllllllllIlIlllIIllIllllIIlll;
            "".length();
            if (-"  ".length() > 0) {
                return ((108 + 17 - 66 + 159 ^ 28 + 33 + 2 + 79) & (0x0 ^ 0xD ^ (0x3E ^ 0x67) ^ -" ".length())) != 0x0;
            }
        }
        final int llllllllllllIlIlllIIllIllllIIIll = this.inflater.getTotalOut();
        if (lIlIIIIlIllIlllI(llllllllllllIlIlllIIllIllllIIlII, llllllllllllIlIlllIIllIllllIIIll)) {
            throw new DecompressionException(String.valueOf(new StringBuilder().append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[8]]).append(llllllllllllIlIlllIIllIllllIIlII).append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[14]]).append(llllllllllllIlIlllIIllIllllIIIll)));
        }
        return JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0;
    }
    
    private static boolean lIlIIIIlIllIlIII(final int llllllllllllIlIlllIIllIllIIIlIll) {
        return llllllllllllIlIlllIIllIllIIIlIll != 0;
    }
    
    private static boolean lIlIIIIlIllIlIIl(final int llllllllllllIlIlllIIllIllIIIlIIl) {
        return llllllllllllIlIlllIIllIllIIIlIIl == 0;
    }
    
    private static boolean lIlIIIIlIllIlIll(final Object llllllllllllIlIlllIIllIllIIIllll) {
        return llllllllllllIlIlllIIllIllIIIllll != null;
    }
    
    public JdkZlibDecoder() {
        this(ZlibWrapper.ZLIB, null);
    }
    
    private static String lIlIIIIlIlIlllII(String llllllllllllIlIlllIIllIllIlIIlIl, final String llllllllllllIlIlllIIllIllIlIlIIl) {
        llllllllllllIlIlllIIllIllIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIllIllIlIlIII = new StringBuilder();
        final char[] llllllllllllIlIlllIIllIllIlIIlll = llllllllllllIlIlllIIllIllIlIlIIl.toCharArray();
        int llllllllllllIlIlllIIllIllIlIIllI = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        final long llllllllllllIlIlllIIllIllIlIIIII = (Object)llllllllllllIlIlllIIllIllIlIIlIl.toCharArray();
        final String llllllllllllIlIlllIIllIllIIlllll = (String)llllllllllllIlIlllIIllIllIlIIIII.length;
        long llllllllllllIlIlllIIllIllIIllllI = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        while (lIlIIIIlIllIlIlI((int)llllllllllllIlIlllIIllIllIIllllI, (int)llllllllllllIlIlllIIllIllIIlllll)) {
            final char llllllllllllIlIlllIIllIllIlIlIll = llllllllllllIlIlllIIllIllIlIIIII[llllllllllllIlIlllIIllIllIIllllI];
            llllllllllllIlIlllIIllIllIlIlIII.append((char)(llllllllllllIlIlllIIllIllIlIlIll ^ llllllllllllIlIlllIIllIllIlIIlll[llllllllllllIlIlllIIllIllIlIIllI % llllllllllllIlIlllIIllIllIlIIlll.length]));
            "".length();
            ++llllllllllllIlIlllIIllIllIlIIllI;
            ++llllllllllllIlIlllIIllIllIIllllI;
            "".length();
            if ((0x71 ^ 0x2 ^ (0x63 ^ 0x14)) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIllIllIlIlIII);
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlIlllIIlllIIIIlIllI, final ByteBuf llllllllllllIlIlllIIlllIIIIlIlIl, final List<Object> llllllllllllIlIlllIIlllIIIIlIlII) throws Exception {
        if (lIlIIIIlIllIlIII(this.finished ? 1 : 0)) {
            llllllllllllIlIlllIIlllIIIIlIlIl.skipBytes(llllllllllllIlIlllIIlllIIIIlIlIl.readableBytes());
            "".length();
            return;
        }
        if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIlllIIIIlIlIl.isReadable() ? 1 : 0)) {
            return;
        }
        if (lIlIIIIlIllIlIII(this.decideZlibOrNone ? 1 : 0)) {
            if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIlllIIIIlIlIl.readableBytes(), JdkZlibDecoder.lllIlIIIIlIIlI[3])) {
                return;
            }
            int n;
            if (lIlIIIIlIllIlIIl(looksLikeZlib(llllllllllllIlIlllIIlllIIIIlIlIl.getShort(JdkZlibDecoder.lllIlIIIIlIIlI[1])) ? 1 : 0)) {
                n = JdkZlibDecoder.lllIlIIIIlIIlI[2];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = JdkZlibDecoder.lllIlIIIIlIIlI[1];
            }
            final boolean llllllllllllIlIlllIIlllIIIlIIlll = n != 0;
            this.inflater = new Inflater(llllllllllllIlIlllIIlllIIIlIIlll);
            this.decideZlibOrNone = (JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0);
        }
        if (lIlIIIIlIllIlIll(this.crc)) {
            switch (JdkZlibDecoder$1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState[this.gzipState.ordinal()]) {
                case 1: {
                    if (lIlIIIIlIllIlIII(this.readGZIPFooter(llllllllllllIlIlllIIlllIIIIlIlIl) ? 1 : 0)) {
                        this.finished = (JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0);
                    }
                    return;
                }
                default: {
                    if (lIlIIIIlIllIllII(this.gzipState, GzipState.HEADER_END) && lIlIIIIlIllIlIIl(this.readGZIPHeader(llllllllllllIlIlllIIlllIIIIlIlIl) ? 1 : 0)) {
                        return;
                    }
                    break;
                }
            }
        }
        final int llllllllllllIlIlllIIlllIIIIllIlI = llllllllllllIlIlllIIlllIIIIlIlIl.readableBytes();
        if (lIlIIIIlIllIlIII(llllllllllllIlIlllIIlllIIIIlIlIl.hasArray() ? 1 : 0)) {
            this.inflater.setInput(llllllllllllIlIlllIIlllIIIIlIlIl.array(), llllllllllllIlIlllIIlllIIIIlIlIl.arrayOffset() + llllllllllllIlIlllIIlllIIIIlIlIl.readerIndex(), llllllllllllIlIlllIIlllIIIIlIlIl.readableBytes());
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            final byte[] llllllllllllIlIlllIIlllIIIlIIllI = new byte[llllllllllllIlIlllIIlllIIIIlIlIl.readableBytes()];
            llllllllllllIlIlllIIlllIIIIlIlIl.getBytes(llllllllllllIlIlllIIlllIIIIlIlIl.readerIndex(), llllllllllllIlIlllIIlllIIIlIIllI);
            "".length();
            this.inflater.setInput(llllllllllllIlIlllIIlllIIIlIIllI);
        }
        final int llllllllllllIlIlllIIlllIIIIllIIl = this.inflater.getRemaining() << JdkZlibDecoder.lllIlIIIIlIIlI[2];
        ByteBuf llllllllllllIlIlllIIlllIIIIllIII = llllllllllllIlIlllIIlllIIIIlIllI.alloc().heapBuffer(llllllllllllIlIlllIIlllIIIIllIIl);
        try {
            boolean llllllllllllIlIlllIIlllIIIlIIIIl = JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
            byte[] llllllllllllIlIlllIIlllIIIlIIIII = llllllllllllIlIlllIIlllIIIIllIII.array();
            while (lIlIIIIlIllIlIIl(this.inflater.needsInput() ? 1 : 0)) {
                final int llllllllllllIlIlllIIlllIIIlIIlIl = llllllllllllIlIlllIIlllIIIIllIII.writerIndex();
                final int llllllllllllIlIlllIIlllIIIlIIlII = llllllllllllIlIlllIIlllIIIIllIII.arrayOffset() + llllllllllllIlIlllIIlllIIIlIIlIl;
                final int llllllllllllIlIlllIIlllIIIlIIIll = llllllllllllIlIlllIIlllIIIIllIII.writableBytes();
                if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIlllIIIlIIIll)) {
                    llllllllllllIlIlllIIlllIIIIlIlII.add(llllllllllllIlIlllIIlllIIIIllIII);
                    "".length();
                    llllllllllllIlIlllIIlllIIIIllIII = llllllllllllIlIlllIIlllIIIIlIllI.alloc().heapBuffer(llllllllllllIlIlllIIlllIIIIllIIl);
                    llllllllllllIlIlllIIlllIIIlIIIII = llllllllllllIlIlllIIlllIIIIllIII.array();
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    continue;
                }
                else {
                    final int llllllllllllIlIlllIIlllIIIlIIIlI = this.inflater.inflate(llllllllllllIlIlllIIlllIIIlIIIII, llllllllllllIlIlllIIlllIIIlIIlII, llllllllllllIlIlllIIlllIIIlIIIll);
                    if (lIlIIIIlIllIllIl(llllllllllllIlIlllIIlllIIIlIIIlI)) {
                        llllllllllllIlIlllIIlllIIIIllIII.writerIndex(llllllllllllIlIlllIIlllIIIlIIlIl + llllllllllllIlIlllIIlllIIIlIIIlI);
                        "".length();
                        if (lIlIIIIlIllIlIll(this.crc)) {
                            this.crc.update(llllllllllllIlIlllIIlllIIIlIIIII, llllllllllllIlIlllIIlllIIIlIIlII, llllllllllllIlIlllIIlllIIIlIIIlI);
                            "".length();
                            if ("  ".length() >= ("   ".length() ^ (0x2A ^ 0x2D))) {
                                return;
                            }
                        }
                    }
                    else if (lIlIIIIlIllIlIII(this.inflater.needsDictionary() ? 1 : 0)) {
                        if (lIlIIIIlIllIIlll(this.dictionary)) {
                            throw new DecompressionException(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[3]]);
                        }
                        this.inflater.setDictionary(this.dictionary);
                    }
                    if (lIlIIIIlIllIlIII(this.inflater.finished() ? 1 : 0)) {
                        if (lIlIIIIlIllIIlll(this.crc)) {
                            this.finished = (JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0);
                            "".length();
                            if ((0x5E ^ 0x79 ^ (0x1C ^ 0x3F)) < "  ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            llllllllllllIlIlllIIlllIIIlIIIIl = (JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0);
                            "".length();
                            if (-" ".length() > (0xA1 ^ 0xA5)) {
                                return;
                            }
                            break;
                        }
                    }
                    else {
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        continue;
                    }
                }
            }
            llllllllllllIlIlllIIlllIIIIlIlIl.skipBytes(llllllllllllIlIlllIIlllIIIIllIlI - this.inflater.getRemaining());
            "".length();
            if (lIlIIIIlIllIlIII(llllllllllllIlIlllIIlllIIIlIIIIl ? 1 : 0)) {
                this.gzipState = GzipState.FOOTER_START;
                if (lIlIIIIlIllIlIII(this.readGZIPFooter(llllllllllllIlIlllIIlllIIIIlIlIl) ? 1 : 0)) {
                    this.finished = (JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0);
                }
            }
            if (lIlIIIIlIllIlIII(llllllllllllIlIlllIIlllIIIIllIII.isReadable() ? 1 : 0)) {
                llllllllllllIlIlllIIlllIIIIlIlII.add(llllllllllllIlIlllIIlllIIIIllIII);
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                llllllllllllIlIlllIIlllIIIIllIII.release();
                "".length();
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
        }
        catch (DataFormatException llllllllllllIlIlllIIlllIIIIlllll) {
            throw new DecompressionException(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[4]], llllllllllllIlIlllIIlllIIIIlllll);
        }
        finally {
            if (lIlIIIIlIllIlIII(llllllllllllIlIlllIIlllIIIIllIII.isReadable() ? 1 : 0)) {
                llllllllllllIlIlllIIlllIIIIlIlII.add(llllllllllllIlIlllIIlllIIIIllIII);
                "".length();
                "".length();
                if ((0x8C ^ 0x88) <= ((0x8B ^ 0xB6) & ~(0x34 ^ 0x9))) {
                    return;
                }
            }
            else {
                llllllllllllIlIlllIIlllIIIIllIII.release();
                "".length();
            }
        }
    }
    
    private static boolean lIlIIIIlIllIIlll(final Object llllllllllllIlIlllIIllIllIIIllIl) {
        return llllllllllllIlIlllIIllIllIIIllIl == null;
    }
    
    private void verifyCrc(final ByteBuf llllllllllllIlIlllIIllIlllIllIII) {
        long llllllllllllIlIlllIIllIlllIlIlll = 0L;
        int llllllllllllIlIlllIIllIlllIllIlI = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        while (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIlllIllIlI, JdkZlibDecoder.lllIlIIIIlIIlI[7])) {
            llllllllllllIlIlllIIllIlllIlIlll |= (long)llllllllllllIlIlllIIllIlllIllIII.readUnsignedByte() << llllllllllllIlIlllIIllIlllIllIlI * JdkZlibDecoder.lllIlIIIIlIIlI[8];
            ++llllllllllllIlIlllIIllIlllIllIlI;
            "".length();
            if ((0x37 ^ 0x33) <= 0) {
                return;
            }
        }
        final long llllllllllllIlIlllIIllIlllIlIllI = this.crc.getValue();
        if (lIlIIIIlIllIlIII(lIlIIIIlIllIllll(llllllllllllIlIlllIIllIlllIlIlll, llllllllllllIlIlllIIllIlllIlIllI))) {
            throw new DecompressionException(String.valueOf(new StringBuilder().append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[5]]).append(llllllllllllIlIlllIIllIlllIlIlll).append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[15]]).append(llllllllllllIlIlllIIllIlllIlIllI)));
        }
    }
    
    private boolean readGZIPHeader(final ByteBuf llllllllllllIlIlllIIllIlllllIIll) {
        switch (JdkZlibDecoder$1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState[this.gzipState.ordinal()]) {
            case 2: {
                if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIlllllIIll.readableBytes(), JdkZlibDecoder.lllIlIIIIlIIlI[5])) {
                    return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                }
                final int llllllllllllIlIlllIIllIlllllIlll = llllllllllllIlIlllIIllIlllllIIll.readByte();
                final int llllllllllllIlIlllIIllIlllllIllI = llllllllllllIlIlllIIllIlllllIIll.readByte();
                if (lIlIIIIlIllIlllI(llllllllllllIlIlllIIllIlllllIlll, JdkZlibDecoder.lllIlIIIIlIIlI[6])) {
                    throw new DecompressionException(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[7]]);
                }
                this.crc.update(llllllllllllIlIlllIIllIlllllIlll);
                this.crc.update(llllllllllllIlIlllIIllIlllllIllI);
                final int llllllllllllIlIlllIIllIlllllIlIl = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                if (lIlIIIIlIllIlllI(llllllllllllIlIlllIIllIlllllIlIl, JdkZlibDecoder.lllIlIIIIlIIlI[8])) {
                    throw new DecompressionException(String.valueOf(new StringBuilder().append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[9]]).append(llllllllllllIlIlllIIllIlllllIlIl).append(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[10]])));
                }
                this.crc.update(llllllllllllIlIlllIIllIlllllIlIl);
                this.flags = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                this.crc.update(this.flags);
                if (lIlIIIIlIllIlIII(this.flags & JdkZlibDecoder.lllIlIIIIlIIlI[11])) {
                    throw new DecompressionException(JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[12]]);
                }
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readByte());
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readByte());
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readByte());
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readByte());
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte());
                this.crc.update(llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte());
                this.gzipState = GzipState.FLG_READ;
            }
            case 3: {
                if (lIlIIIIlIllIlIII(this.flags & JdkZlibDecoder.lllIlIIIIlIIlI[7])) {
                    if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIlllllIIll.readableBytes(), JdkZlibDecoder.lllIlIIIIlIIlI[3])) {
                        return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                    }
                    final int llllllllllllIlIlllIIllIlllllllII = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                    final int llllllllllllIlIlllIIllIllllllIll = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                    this.crc.update(llllllllllllIlIlllIIllIlllllllII);
                    this.crc.update(llllllllllllIlIlllIIllIllllllIll);
                    this.xlen |= (llllllllllllIlIlllIIllIlllllllII << JdkZlibDecoder.lllIlIIIIlIIlI[8] | llllllllllllIlIlllIIllIllllllIll);
                }
                this.gzipState = GzipState.XLEN_READ;
            }
            case 4: {
                if (lIlIIIIlIllIlllI(this.xlen, JdkZlibDecoder.lllIlIIIIlIIlI[0])) {
                    if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIlllllIIll.readableBytes(), this.xlen)) {
                        return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                    }
                    final byte[] llllllllllllIlIlllIIllIllllllIlI = new byte[this.xlen];
                    llllllllllllIlIlllIIllIlllllIIll.readBytes(llllllllllllIlIlllIIllIllllllIlI);
                    "".length();
                    this.crc.update(llllllllllllIlIlllIIllIllllllIlI);
                }
                this.gzipState = GzipState.SKIP_FNAME;
            }
            case 5: {
                if (lIlIIIIlIllIlIII(this.flags & JdkZlibDecoder.lllIlIIIIlIIlI[8])) {
                    if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIlllllIIll.isReadable() ? 1 : 0)) {
                        return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                    }
                    do {
                        final int llllllllllllIlIlllIIllIllllllIIl = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                        this.crc.update(llllllllllllIlIlllIIllIllllllIIl);
                        if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIllllllIIl)) {
                            "".length();
                            if (((0x89 ^ 0x82) & ~(0x70 ^ 0x7B)) < 0) {
                                return ((0xBF ^ 0x84) & ~(0xB6 ^ 0x8D)) != 0x0;
                            }
                            break;
                        }
                    } while (!lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIlllllIIll.isReadable() ? 1 : 0));
                }
                this.gzipState = GzipState.SKIP_COMMENT;
            }
            case 6: {
                if (lIlIIIIlIllIlIII(this.flags & JdkZlibDecoder.lllIlIIIIlIIlI[13])) {
                    if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIlllllIIll.isReadable() ? 1 : 0)) {
                        return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                    }
                    do {
                        final int llllllllllllIlIlllIIllIllllllIII = llllllllllllIlIlllIIllIlllllIIll.readUnsignedByte();
                        this.crc.update(llllllllllllIlIlllIIllIllllllIII);
                        if (lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIllllllIII)) {
                            "".length();
                            if (" ".length() > "  ".length()) {
                                return ((0x4 ^ 0x59) & ~(0x61 ^ 0x3C)) != 0x0;
                            }
                            break;
                        }
                    } while (!lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIlllllIIll.isReadable() ? 1 : 0));
                }
                this.gzipState = GzipState.PROCESS_FHCRC;
            }
            case 7: {
                if (lIlIIIIlIllIlIII(this.flags & JdkZlibDecoder.lllIlIIIIlIIlI[3])) {
                    if (lIlIIIIlIllIlIlI(llllllllllllIlIlllIIllIlllllIIll.readableBytes(), JdkZlibDecoder.lllIlIIIIlIIlI[7])) {
                        return JdkZlibDecoder.lllIlIIIIlIIlI[1] != 0;
                    }
                    this.verifyCrc(llllllllllllIlIlllIIllIlllllIIll);
                }
                this.crc.reset();
                this.gzipState = GzipState.HEADER_END;
            }
            case 8: {
                return JdkZlibDecoder.lllIlIIIIlIIlI[2] != 0;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
    
    private static boolean looksLikeZlib(final short llllllllllllIlIlllIIllIlllIIllll) {
        int n;
        if (lIlIIIIlIlllIIII(llllllllllllIlIlllIIllIlllIIllll & JdkZlibDecoder.lllIlIIIIlIIlI[16], JdkZlibDecoder.lllIlIIIIlIIlI[16]) && lIlIIIIlIllIlIIl(llllllllllllIlIlllIIllIlllIIllll % JdkZlibDecoder.lllIlIIIIlIIlI[6])) {
            n = JdkZlibDecoder.lllIlIIIIlIIlI[2];
            "".length();
            if (null != null) {
                return ((0x4F ^ 0x50 ^ " ".length()) & (42 + 55 + 13 + 30 ^ 110 + 98 - 177 + 115 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = JdkZlibDecoder.lllIlIIIIlIIlI[1];
        }
        return n != 0;
    }
    
    private static void lIlIIIIlIllIIIll() {
        (lllIlIIIIIllll = new String[JdkZlibDecoder.lllIlIIIIlIIlI[17]])[JdkZlibDecoder.lllIlIIIIlIIlI[1]] = lIlIIIIlIlIlllII("GDEQHT8KMQ==", "oCqmO");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[2]] = lIlIIIIlIlIlllII("DiI6GkMGFh8zQy4+djkvCA52ChBhPyMTEy4+IgYHbWw0FhdhNTkWQzQ/MwdD", "ALVcc");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[3]] = lIlIIIIlIlIlllIl("4kK2y3VoipODzcGT9Qkvt1+jglF1sbfv52sfyyM3LXoQbvXEQbAhtwNDfpCD4XnwXHriiwkLwLYuGtVHaFsBs8j1Yt4rMXgM", "VDftC");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[4]] = lIlIIIIlIlIlllII("NwQUAAgjExIcFjoOGU8DMggbGhc2", "Sawoe");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[7]] = lIlIIIIlIlIlllIl("VNhffpBbts2aMV7xllnuIAsOcrI7REWr+1LTFKmL2E8=", "HnIzs");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[9]] = lIlIIIIlIlIlllIl("wnFKPczYaWDx2ukYmMMN2awnNtRNweq7uMiJtGfm4b4=", "KFaAp");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[10]] = lIlIIIIlIlIlllIl("rg/1Slb9Xt98rdkeMbQwHioxzctzoOPO", "sXAXF");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[12]] = lIlIIIIlIlIllllI("6elOONNFpCHaDVW6Lei1MOxU6fcFJLMnAO6AtTHGcIr1IQM6qB7JSOR4lMVkPhAU", "PuiJA");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[8]] = lIlIIIIlIlIlllII("LwM4DCcTVjoIYgMPIQsxQRs8HS8AAjYGbEEzLR4nAgIwCnhB", "avUnB");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[14]] = lIlIIIIlIlIllllI("V4bDrTMCxs8=", "RYfmK");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[5]] = lIlIIIIlIlIlllIl("+hdapJWfqCtZAAcVWh22xDdQtgzJTBBntvNnxjP0KQg=", "bARqR");
        JdkZlibDecoder.lllIlIIIIIllll[JdkZlibDecoder.lllIlIIIIlIIlI[15]] = lIlIIIIlIlIllllI("FcP0PNs6wHE=", "bQhpe");
    }
    
    public JdkZlibDecoder(final byte[] llllllllllllIlIlllIIlllIIlIIlIlI) {
        this(ZlibWrapper.ZLIB, llllllllllllIlIlllIIlllIIlIIlIlI);
    }
    
    @Override
    protected void handlerRemoved0(final ChannelHandlerContext llllllllllllIlIlllIIlllIIIIIIlII) throws Exception {
        super.handlerRemoved0(llllllllllllIlIlllIIlllIIIIIIlII);
        if (lIlIIIIlIllIlIll(this.inflater)) {
            this.inflater.end();
        }
    }
    
    @Override
    public boolean isClosed() {
        return this.finished;
    }
    
    static {
        lIlIIIIlIllIIllI();
        lIlIIIIlIllIIIll();
        FNAME = JdkZlibDecoder.lllIlIIIIlIIlI[8];
        FEXTRA = JdkZlibDecoder.lllIlIIIIlIIlI[7];
        FHCRC = JdkZlibDecoder.lllIlIIIIlIIlI[3];
        FRESERVED = JdkZlibDecoder.lllIlIIIIlIIlI[11];
        FCOMMENT = JdkZlibDecoder.lllIlIIIIlIIlI[13];
    }
    
    private static boolean lIlIIIIlIllIllII(final Object llllllllllllIlIlllIIllIllIIlIIlI, final Object llllllllllllIlIlllIIllIllIIlIIIl) {
        return llllllllllllIlIlllIIllIllIIlIIlI != llllllllllllIlIlllIIllIllIIlIIIl;
    }
    
    public JdkZlibDecoder(final ZlibWrapper llllllllllllIlIlllIIlllIIlIIIIlI) {
        this(llllllllllllIlIlllIIlllIIlIIIIlI, null);
    }
    
    private static boolean lIlIIIIlIllIlllI(final int llllllllllllIlIlllIIllIllIIIIlII, final int llllllllllllIlIlllIIllIllIIIIIll) {
        return llllllllllllIlIlllIIllIllIIIIlII != llllllllllllIlIlllIIllIllIIIIIll;
    }
    
    private enum GzipState
    {
        FOOTER_START, 
        SKIP_FNAME, 
        SKIP_COMMENT;
        
        private static final /* synthetic */ int[] lIIIIllIlllllI;
        
        HEADER_START, 
        XLEN_READ, 
        PROCESS_FHCRC, 
        HEADER_END, 
        FLG_READ;
        
        private static final /* synthetic */ String[] lIIIIllIllllII;
        
        private static void lIllllIIIIlIlII() {
            (lIIIIllIllllII = new String[GzipState.lIIIIllIlllllI[8]])[GzipState.lIIIIllIlllllI[0]] = lIllllIIIIIllll("7t8Uy2ynZ/fmtT17PxpIqA==", "BtBKS");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[1]] = lIllllIIIIlIIIl("DywwBR0VNjQPHA==", "GiqAX");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[2]] = lIllllIIIIIllll("IzP2VEY+bS5nelAxyuNOqA==", "hVthV");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[3]] = lIllllIIIIlIIIl("MgUPCBQ4DAsC", "jIJFK");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[4]] = lIllllIIIIlIIIl("ARMOMQwUFgYsFg==", "RXGaS");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[5]] = lIllllIIIIIllll("NLSeFz6L2hNG8hXrt6oy6w==", "cSXnd");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[6]] = lIllllIIIIlIIll("H064tr1m4PWNDO1F3fm0HA==", "jAdaR");
            GzipState.lIIIIllIllllII[GzipState.lIIIIllIlllllI[7]] = lIllllIIIIIllll("2NJitZUbt5hLc0ms3nS3lg==", "UTCfk");
        }
        
        private static void lIllllIIIIllIlI() {
            (lIIIIllIlllllI = new int[9])[0] = ((0xCE ^ 0xB8 ^ (0x30 ^ 0x7C)) & (0x8A ^ 0xC1 ^ (0x34 ^ 0x45) ^ -" ".length()));
            GzipState.lIIIIllIlllllI[1] = " ".length();
            GzipState.lIIIIllIlllllI[2] = "  ".length();
            GzipState.lIIIIllIlllllI[3] = "   ".length();
            GzipState.lIIIIllIlllllI[4] = (0x8D ^ 0x89);
            GzipState.lIIIIllIlllllI[5] = (143 + 59 - 89 + 42 ^ 89 + 111 - 50 + 8);
            GzipState.lIIIIllIlllllI[6] = (0x34 ^ 0x32);
            GzipState.lIIIIllIlllllI[7] = (0x1D ^ 0x48 ^ (0xC8 ^ 0x9A));
            GzipState.lIIIIllIlllllI[8] = (0x75 ^ 0x9 ^ (0xFC ^ 0x88));
        }
        
        private static boolean lIllllIIIIllIll(final int lllllllllllllIlIIlIIIlIllIlllIII, final int lllllllllllllIlIIlIIIlIllIllIlll) {
            return lllllllllllllIlIIlIIIlIllIlllIII < lllllllllllllIlIIlIIIlIllIllIlll;
        }
        
        private static String lIllllIIIIIllll(final String lllllllllllllIlIIlIIIlIlllIIIIII, final String lllllllllllllIlIIlIIIlIllIllllll) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIIIlIlllIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIlIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIlIIIlIlllIIIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIlIIIlIlllIIIIlI.init(GzipState.lIIIIllIlllllI[2], lllllllllllllIlIIlIIIlIlllIIIIll);
                return new String(lllllllllllllIlIIlIIIlIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIIIlIlllIIIIIl) {
                lllllllllllllIlIIlIIIlIlllIIIIIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lIllllIIIIllIlI();
            lIllllIIIIlIlII();
            final GzipState[] $values = new GzipState[GzipState.lIIIIllIlllllI[8]];
            $values[GzipState.lIIIIllIlllllI[0]] = GzipState.HEADER_START;
            $values[GzipState.lIIIIllIlllllI[1]] = GzipState.HEADER_END;
            $values[GzipState.lIIIIllIlllllI[2]] = GzipState.FLG_READ;
            $values[GzipState.lIIIIllIlllllI[3]] = GzipState.XLEN_READ;
            $values[GzipState.lIIIIllIlllllI[4]] = GzipState.SKIP_FNAME;
            $values[GzipState.lIIIIllIlllllI[5]] = GzipState.SKIP_COMMENT;
            $values[GzipState.lIIIIllIlllllI[6]] = GzipState.PROCESS_FHCRC;
            $values[GzipState.lIIIIllIlllllI[7]] = GzipState.FOOTER_START;
            $VALUES = $values;
        }
        
        private static String lIllllIIIIlIIll(final String lllllllllllllIlIIlIIIlIlllIIllIl, final String lllllllllllllIlIIlIIIlIlllIIllII) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIIIlIlllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIlIlllIIllII.getBytes(StandardCharsets.UTF_8)), GzipState.lIIIIllIlllllI[8]), "DES");
                final Cipher lllllllllllllIlIIlIIIlIlllIIllll = Cipher.getInstance("DES");
                lllllllllllllIlIIlIIIlIlllIIllll.init(GzipState.lIIIIllIlllllI[2], lllllllllllllIlIIlIIIlIlllIlIIII);
                return new String(lllllllllllllIlIIlIIIlIlllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIIIlIlllIIlllI) {
                lllllllllllllIlIIlIIIlIlllIIlllI.printStackTrace();
                return null;
            }
        }
        
        private static String lIllllIIIIlIIIl(String lllllllllllllIlIIlIIIlIlllIlllIl, final String lllllllllllllIlIIlIIIlIlllIlllII) {
            lllllllllllllIlIIlIIIlIlllIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlIlllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIlIIIlIllllIIIII = new StringBuilder();
            final char[] lllllllllllllIlIIlIIIlIlllIlllll = lllllllllllllIlIIlIIIlIlllIlllII.toCharArray();
            int lllllllllllllIlIIlIIIlIlllIllllI = GzipState.lIIIIllIlllllI[0];
            final boolean lllllllllllllIlIIlIIIlIlllIllIII = (Object)lllllllllllllIlIIlIIIlIlllIlllIl.toCharArray();
            final int lllllllllllllIlIIlIIIlIlllIlIlll = lllllllllllllIlIIlIIIlIlllIllIII.length;
            Exception lllllllllllllIlIIlIIIlIlllIlIllI = (Exception)GzipState.lIIIIllIlllllI[0];
            while (lIllllIIIIllIll((int)lllllllllllllIlIIlIIIlIlllIlIllI, lllllllllllllIlIIlIIIlIlllIlIlll)) {
                final char lllllllllllllIlIIlIIIlIllllIIIll = lllllllllllllIlIIlIIIlIlllIllIII[lllllllllllllIlIIlIIIlIlllIlIllI];
                lllllllllllllIlIIlIIIlIllllIIIII.append((char)(lllllllllllllIlIIlIIIlIllllIIIll ^ lllllllllllllIlIIlIIIlIlllIlllll[lllllllllllllIlIIlIIIlIlllIllllI % lllllllllllllIlIIlIIIlIlllIlllll.length]));
                "".length();
                ++lllllllllllllIlIIlIIIlIlllIllllI;
                ++lllllllllllllIlIIlIIIlIlllIlIllI;
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIlIIIlIllllIIIII);
        }
    }
}
