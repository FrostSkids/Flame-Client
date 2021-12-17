// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.zip.DataFormatException;
import io.netty.buffer.ByteBufAllocator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Inflater;
import io.netty.buffer.ByteBuf;

final class SpdyHeaderBlockZlibDecoder extends SpdyHeaderBlockRawDecoder
{
    private /* synthetic */ ByteBuf decompressed;
    private final /* synthetic */ Inflater decompressor;
    private static final /* synthetic */ int[] llIlIlIlIIIIIl;
    private static final /* synthetic */ String[] llIlIlIIllllll;
    private static final /* synthetic */ SpdyProtocolException INVALID_HEADER_BLOCK;
    
    private static boolean lIIlIlIIIIlIllIl(final Object llllllllllllIllIlIlIlIIIlIlIIlIl) {
        return llllllllllllIllIlIlIlIIIlIlIIlIl == null;
    }
    
    private static boolean lIIlIlIIIIlIlllI(final int llllllllllllIllIlIlIlIIIlIlIlIlI, final int llllllllllllIllIlIlIlIIIlIlIlIIl) {
        return llllllllllllIllIlIlIlIIIlIlIlIlI < llllllllllllIllIlIlIlIIIlIlIlIIl;
    }
    
    static {
        lIIlIlIIIIlIlIII();
        lIIlIlIIIIlIIlIl();
        DEFAULT_BUFFER_CAPACITY = SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[1];
        INVALID_HEADER_BLOCK = new SpdyProtocolException(SpdyHeaderBlockZlibDecoder.llIlIlIIllllll[SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[2]]);
    }
    
    private static String lIIlIlIIIIlIIlII(String llllllllllllIllIlIlIlIIIllIIIIlI, final String llllllllllllIllIlIlIlIIIllIIIIIl) {
        llllllllllllIllIlIlIlIIIllIIIIlI = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIlIIIllIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlIIIllIIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlIlIlIIIllIIIlII = llllllllllllIllIlIlIlIIIllIIIIIl.toCharArray();
        int llllllllllllIllIlIlIlIIIllIIIIll = SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[0];
        final double llllllllllllIllIlIlIlIIIlIllllIl = (Object)((String)llllllllllllIllIlIlIlIIIllIIIIlI).toCharArray();
        final String llllllllllllIllIlIlIlIIIlIllllII = (String)llllllllllllIllIlIlIlIIIlIllllIl.length;
        String llllllllllllIllIlIlIlIIIlIlllIll = (String)SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[0];
        while (lIIlIlIIIIlIlllI((int)llllllllllllIllIlIlIlIIIlIlllIll, (int)llllllllllllIllIlIlIlIIIlIllllII)) {
            final char llllllllllllIllIlIlIlIIIllIIlIII = llllllllllllIllIlIlIlIIIlIllllIl[llllllllllllIllIlIlIlIIIlIlllIll];
            llllllllllllIllIlIlIlIIIllIIIlIl.append((char)(llllllllllllIllIlIlIlIIIllIIlIII ^ llllllllllllIllIlIlIlIIIllIIIlII[llllllllllllIllIlIlIlIIIllIIIIll % llllllllllllIllIlIlIlIIIllIIIlII.length]));
            "".length();
            ++llllllllllllIllIlIlIlIIIllIIIIll;
            ++llllllllllllIllIlIlIlIIIlIlllIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlIIIllIIIlIl);
    }
    
    private static String lIIlIlIIIIlIIIll(final String llllllllllllIllIlIlIlIIIlIllIIlI, final String llllllllllllIllIlIlIlIIIlIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIIIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[4]), "DES");
            final Cipher llllllllllllIllIlIlIlIIIlIllIlII = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlIIIlIllIlII.init(SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[3], llllllllllllIllIlIlIlIIIlIllIlIl);
            return new String(llllllllllllIllIlIlIlIIIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIIIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIIIlIllIIll) {
            llllllllllllIllIlIlIlIIIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    public void end() {
        super.end();
        this.releaseBuffer();
        this.decompressor.end();
    }
    
    private void ensureBuffer(final ByteBufAllocator llllllllllllIllIlIlIlIIIlllIIIII) {
        if (lIIlIlIIIIlIllIl(this.decompressed)) {
            this.decompressed = llllllllllllIllIlIlIlIIIlllIIIII.heapBuffer(SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[1]);
        }
        this.decompressed.ensureWritable(SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[2]);
        "".length();
    }
    
    private static boolean lIIlIlIIIIlIlIlI(final int llllllllllllIllIlIlIlIIIlIlIIIll) {
        return llllllllllllIllIlIlIlIIIlIlIIIll != 0;
    }
    
    private int decompress(final ByteBufAllocator llllllllllllIllIlIlIlIIIlllIlllI, final SpdyHeadersFrame llllllllllllIllIlIlIlIIIlllIllIl) throws Exception {
        this.ensureBuffer(llllllllllllIllIlIlIlIIIlllIlllI);
        final byte[] llllllllllllIllIlIlIlIIIlllIllII = this.decompressed.array();
        final int llllllllllllIllIlIlIlIIIlllIlIll = this.decompressed.arrayOffset() + this.decompressed.writerIndex();
        try {
            int llllllllllllIllIlIlIlIIIllllIIIl = this.decompressor.inflate(llllllllllllIllIlIlIlIIIlllIllII, llllllllllllIllIlIlIlIIIlllIlIll, this.decompressed.writableBytes());
            if (lIIlIlIIIIlIlIll(llllllllllllIllIlIlIlIIIllllIIIl) && lIIlIlIIIIlIlIlI(this.decompressor.needsDictionary() ? 1 : 0)) {
                try {
                    this.decompressor.setDictionary(SpdyCodecUtil.SPDY_DICT);
                    "".length();
                    if (-" ".length() >= 0) {
                        return "  ".length() & ("  ".length() ^ -" ".length());
                    }
                }
                catch (IllegalArgumentException llllllllllllIllIlIlIlIIIllllIIlI) {
                    throw SpdyHeaderBlockZlibDecoder.INVALID_HEADER_BLOCK;
                }
                llllllllllllIllIlIlIlIIIllllIIIl = this.decompressor.inflate(llllllllllllIllIlIlIlIIIlllIllII, llllllllllllIllIlIlIlIIIlllIlIll, this.decompressed.writableBytes());
            }
            if (lIIlIlIIIIlIllII(llllllllllllIllIlIlIlIIIlllIllIl)) {
                this.decompressed.writerIndex(this.decompressed.writerIndex() + llllllllllllIllIlIlIlIIIllllIIIl);
                "".length();
                this.decodeHeaderBlock(this.decompressed, llllllllllllIllIlIlIlIIIlllIllIl);
                this.decompressed.discardReadBytes();
                "".length();
            }
            return llllllllllllIllIlIlIlIIIllllIIIl;
        }
        catch (DataFormatException llllllllllllIllIlIlIlIIIllllIIII) {
            throw new SpdyProtocolException(SpdyHeaderBlockZlibDecoder.llIlIlIIllllll[SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[0]], llllllllllllIllIlIlIlIIIllllIIII);
        }
    }
    
    private static boolean lIIlIlIIIIlIllII(final Object llllllllllllIllIlIlIlIIIlIlIIlll) {
        return llllllllllllIllIlIlIlIIIlIlIIlll != null;
    }
    
    private void releaseBuffer() {
        if (lIIlIlIIIIlIllII(this.decompressed)) {
            this.decompressed.release();
            "".length();
            this.decompressed = null;
        }
    }
    
    @Override
    void endHeaderBlock(final SpdyHeadersFrame llllllllllllIllIlIlIlIIIllIllIII) throws Exception {
        super.endHeaderBlock(llllllllllllIllIlIlIlIIIllIllIII);
        this.releaseBuffer();
    }
    
    private static void lIIlIlIIIIlIIlIl() {
        (llIlIlIIllllll = new String[SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[3]])[SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[0]] = lIIlIlIIIIlIIIll("xI+nuFSCKcm0Z1R49IRZ5MUVs+DB02MubVdyzlzLEVo=", "rIdoU");
        SpdyHeaderBlockZlibDecoder.llIlIlIIllllll[SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[2]] = lIIlIlIIIIlIIlII("EBowJQswEGYMAjgQIzZHGxgpJww=", "YtFDg");
    }
    
    private static boolean lIIlIlIIIIlIlIIl(final int llllllllllllIllIlIlIlIIIlIIlllll) {
        return llllllllllllIllIlIlIlIIIlIIlllll <= 0;
    }
    
    @Override
    void decode(final ByteBuf llllllllllllIllIlIlIlIIlIIIIlIIl, final SpdyHeadersFrame llllllllllllIllIlIlIlIIlIIIIllIl) throws Exception {
        final int llllllllllllIllIlIlIlIIlIIIIllII = this.setInput(llllllllllllIllIlIlIlIIlIIIIlIIl);
        int llllllllllllIllIlIlIlIIlIIIIlIll;
        do {
            llllllllllllIllIlIlIlIIlIIIIlIll = this.decompress(llllllllllllIllIlIlIlIIlIIIIlIIl.alloc(), llllllllllllIllIlIlIlIIlIIIIllIl);
        } while (!lIIlIlIIIIlIlIIl(llllllllllllIllIlIlIlIIlIIIIlIll));
        if (lIIlIlIIIIlIlIlI(this.decompressor.getRemaining())) {
            throw SpdyHeaderBlockZlibDecoder.INVALID_HEADER_BLOCK;
        }
        llllllllllllIllIlIlIlIIlIIIIlIIl.skipBytes(llllllllllllIllIlIlIlIIlIIIIllII);
        "".length();
    }
    
    private static void lIIlIlIIIIlIlIII() {
        (llIlIlIlIIIIIl = new int[5])[0] = ((10 + 22 + 51 + 110 ^ 68 + 111 - 147 + 109) & (0xA3 ^ 0x8A ^ (0xF5 ^ 0x90) ^ -" ".length()));
        SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[1] = (0xFFFFDFB8 & 0x3047);
        SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[2] = " ".length();
        SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[3] = "  ".length();
        SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[4] = (0x4F ^ 0x47);
    }
    
    private static boolean lIIlIlIIIIlIlIll(final int llllllllllllIllIlIlIlIIIlIlIIIIl) {
        return llllllllllllIllIlIlIlIIIlIlIIIIl == 0;
    }
    
    SpdyHeaderBlockZlibDecoder(final SpdyVersion llllllllllllIllIlIlIlIIlIIIlIllI, final int llllllllllllIllIlIlIlIIlIIIlIlIl) {
        super(llllllllllllIllIlIlIlIIlIIIlIllI, llllllllllllIllIlIlIlIIlIIIlIlIl);
        this.decompressor = new Inflater();
    }
    
    private int setInput(final ByteBuf llllllllllllIllIlIlIlIIIllllllll) {
        final int llllllllllllIllIlIlIlIIIlllllllI = llllllllllllIllIlIlIlIIIllllllll.readableBytes();
        if (lIIlIlIIIIlIlIlI(llllllllllllIllIlIlIlIIIllllllll.hasArray() ? 1 : 0)) {
            this.decompressor.setInput(llllllllllllIllIlIlIlIIIllllllll.array(), llllllllllllIllIlIlIlIIIllllllll.arrayOffset() + llllllllllllIllIlIlIlIIIllllllll.readerIndex(), llllllllllllIllIlIlIlIIIlllllllI);
            "".length();
            if (null != null) {
                return (104 + 56 - 117 + 141 ^ 3 + 116 + 20 + 39) & (0x43 ^ 0x11 ^ (0x1B ^ 0x43) ^ -" ".length());
            }
        }
        else {
            final byte[] llllllllllllIllIlIlIlIIlIIIIIIIl = new byte[llllllllllllIllIlIlIlIIIlllllllI];
            llllllllllllIllIlIlIlIIIllllllll.getBytes(llllllllllllIllIlIlIlIIIllllllll.readerIndex(), llllllllllllIllIlIlIlIIlIIIIIIIl);
            "".length();
            this.decompressor.setInput(llllllllllllIllIlIlIlIIlIIIIIIIl, SpdyHeaderBlockZlibDecoder.llIlIlIlIIIIIl[0], llllllllllllIllIlIlIlIIlIIIIIIIl.length);
        }
        return llllllllllllIllIlIlIlIIIlllllllI;
    }
}
