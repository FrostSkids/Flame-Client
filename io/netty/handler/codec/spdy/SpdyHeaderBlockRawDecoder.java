// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public class SpdyHeaderBlockRawDecoder extends SpdyHeaderBlockDecoder
{
    private /* synthetic */ int headerSize;
    private /* synthetic */ String name;
    private /* synthetic */ int length;
    private /* synthetic */ ByteBuf cumulation;
    private static final /* synthetic */ int[] lllIIlIllllIIl;
    private final /* synthetic */ int maxHeaderSize;
    private static final /* synthetic */ String[] lllIIlIlllIllI;
    private /* synthetic */ State state;
    private /* synthetic */ int numHeaders;
    
    private static boolean lIIlllllllllIllI(final Object llllllllllllIlIllllIIlIIIlIlIIll, final Object llllllllllllIlIllllIIlIIIlIlIIlI) {
        return llllllllllllIlIllllIIlIIIlIlIIll == llllllllllllIlIllllIIlIIIlIlIIlI;
    }
    
    private static String lIIllllllllIIIll(final String llllllllllllIlIllllIIlIIlIIlIIII, final String llllllllllllIlIllllIIlIIlIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIlIIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIlIIlIIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIlIIlIIlIIlI.init(SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[3], llllllllllllIlIllllIIlIIlIIlIIll);
            return new String(llllllllllllIlIllllIIlIIlIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIlIIlIIlIIIl) {
            llllllllllllIlIllllIIlIIlIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static int readLengthField(final ByteBuf llllllllllllIlIllllIIlIIllIIlllI) {
        final int llllllllllllIlIllllIIlIIllIIllIl = SpdyCodecUtil.getSignedInt(llllllllllllIlIllllIIlIIllIIlllI, llllllllllllIlIllllIIlIIllIIlllI.readerIndex());
        llllllllllllIlIllllIIlIIllIIlllI.skipBytes(SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1]);
        "".length();
        return llllllllllllIlIllllIIlIIllIIllIl;
    }
    
    private static boolean lIIllllllllIllll(final int llllllllllllIlIllllIIlIIIllIIIll, final int llllllllllllIlIllllIIlIIIllIIIlI) {
        return llllllllllllIlIllllIIlIIIllIIIll < llllllllllllIlIllllIIlIIIllIIIlI;
    }
    
    private static void lIIllllllllIIllI() {
        (lllIIlIlllIllI = new String[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[7]])[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0]] = lIIllllllllIIIll("PHGlG0qVwBHYPdbxAdvH3A==", "XVjxd");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2]] = lIIllllllllIIlII("73lu28TrJ45UqkxYUOqgrg==", "mmNnA");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[3]] = lIIllllllllIIlIl("EBMqNDA=", "vaKYU");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[4]] = lIIllllllllIIlIl("FyERemw=", "BuWWT");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1]] = lIIllllllllIIIll("i/56YWCjX7I=", "sokiA");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[5]] = lIIllllllllIIlII("spvRbWuazSY=", "rnAyI");
        SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[6]] = lIIllllllllIIlIl("IgciHh8VAWofUwMKLAgbUQcoGRZf", "qoMks");
    }
    
    private static String lIIllllllllIIlIl(String llllllllllllIlIllllIIlIIIlllIIll, final String llllllllllllIlIllllIIlIIIlllIIlI) {
        llllllllllllIlIllllIIlIIIlllIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllllIIlIIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIlIIIlllIIIl = new StringBuilder();
        final char[] llllllllllllIlIllllIIlIIIlllIIII = llllllllllllIlIllllIIlIIIlllIIlI.toCharArray();
        int llllllllllllIlIllllIIlIIIllIllll = SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0];
        final boolean llllllllllllIlIllllIIlIIIllIlIIl = (Object)llllllllllllIlIllllIIlIIIlllIIll.toCharArray();
        final short llllllllllllIlIllllIIlIIIllIlIII = (short)llllllllllllIlIllllIIlIIIllIlIIl.length;
        short llllllllllllIlIllllIIlIIIllIIlll = (short)SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0];
        while (lIIllllllllIllll(llllllllllllIlIllllIIlIIIllIIlll, llllllllllllIlIllllIIlIIIllIlIII)) {
            final char llllllllllllIlIllllIIlIIIlllIlII = llllllllllllIlIllllIIlIIIllIlIIl[llllllllllllIlIllllIIlIIIllIIlll];
            llllllllllllIlIllllIIlIIIlllIIIl.append((char)(llllllllllllIlIllllIIlIIIlllIlII ^ llllllllllllIlIllllIIlIIIlllIIII[llllllllllllIlIllllIIlIIIllIllll % llllllllllllIlIllllIIlIIIlllIIII.length]));
            "".length();
            ++llllllllllllIlIllllIIlIIIllIllll;
            ++llllllllllllIlIllllIIlIIIllIIlll;
            "".length();
            if ((0xD3 ^ 0xA0 ^ (0x44 ^ 0x33)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIlIIIlllIIIl);
    }
    
    static {
        lIIllllllllIllII();
        lIIllllllllIIllI();
        LENGTH_FIELD_SIZE = SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1];
    }
    
    private static void lIIllllllllIllII() {
        (lllIIlIllllIIl = new int[9])[0] = ((0xE4 ^ 0xAD) & ~(0x54 ^ 0x1D));
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1] = (0x7D ^ 0x6E ^ (0xD7 ^ 0xC0));
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2] = " ".length();
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[3] = "  ".length();
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[4] = "   ".length();
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[5] = (0x88 ^ 0x8D);
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[6] = (0x7F ^ 0x79);
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[7] = (0x1D ^ 0x5B ^ (0x36 ^ 0x77));
        SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[8] = (0x8A ^ 0x82);
    }
    
    private static boolean lIIllllllllllIII(final Object llllllllllllIlIllllIIlIIIlIlIIII) {
        return llllllllllllIlIllllIIlIIIlIlIIII != null;
    }
    
    @Override
    void endHeaderBlock(final SpdyHeadersFrame llllllllllllIlIllllIIlIIlIIllllI) throws Exception {
        if (lIIlllllllllIlll(this.state, State.END_HEADER_BLOCK)) {
            llllllllllllIlIllllIIlIIlIIllllI.setInvalid();
            "".length();
        }
        this.releaseBuffer();
        this.headerSize = SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0];
        this.name = null;
        this.state = State.READ_NUM_HEADERS;
    }
    
    private static boolean lIIllllllllIllIl(final Object llllllllllllIlIllllIIlIIIlIIlllI) {
        return llllllllllllIlIllllIIlIIIlIIlllI == null;
    }
    
    private static boolean lIIlllllllllIlIl(final int llllllllllllIlIllllIIlIIIlIIIIll, final int llllllllllllIlIllllIIlIIIlIIIIlI) {
        return llllllllllllIlIllllIIlIIIlIIIIll != llllllllllllIlIllllIIlIIIlIIIIlI;
    }
    
    private static boolean lIIlllllllllIIII(final int llllllllllllIlIllllIIlIIIlIIlIII) {
        return llllllllllllIlIllllIIlIIIlIIlIII < 0;
    }
    
    private static boolean lIIlllllllllIIIl(final int llllllllllllIlIllllIIlIIIlIIlIlI) {
        return llllllllllllIlIllllIIlIIIlIIlIlI == 0;
    }
    
    @Override
    void decode(final ByteBuf llllllllllllIlIllllIIlIIllIIIIll, final SpdyHeadersFrame llllllllllllIlIllllIIlIIllIIIlIl) throws Exception {
        if (lIIllllllllIllIl(llllllllllllIlIllllIIlIIllIIIIll)) {
            throw new NullPointerException(SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2]]);
        }
        if (lIIllllllllIllIl(llllllllllllIlIllllIIlIIllIIIlIl)) {
            throw new NullPointerException(SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[3]]);
        }
        if (lIIllllllllIllIl(this.cumulation)) {
            this.decodeHeaderBlock(llllllllllllIlIllllIIlIIllIIIIll, llllllllllllIlIllllIIlIIllIIIlIl);
            if (lIIllllllllIlllI(llllllllllllIlIllllIIlIIllIIIIll.isReadable() ? 1 : 0)) {
                this.cumulation = llllllllllllIlIllllIIlIIllIIIIll.alloc().buffer(llllllllllllIlIllllIIlIIllIIIIll.readableBytes());
                this.cumulation.writeBytes(llllllllllllIlIllllIIlIIllIIIIll);
                "".length();
                "".length();
                if (-(0x3D ^ 0x39) > 0) {
                    return;
                }
            }
        }
        else {
            this.cumulation.writeBytes(llllllllllllIlIllllIIlIIllIIIIll);
            "".length();
            this.decodeHeaderBlock(this.cumulation, llllllllllllIlIllllIIlIIllIIIlIl);
            if (lIIllllllllIlllI(this.cumulation.isReadable() ? 1 : 0)) {
                this.cumulation.discardReadBytes();
                "".length();
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                this.releaseBuffer();
            }
        }
    }
    
    private static boolean lIIlllllllllIlll(final Object llllllllllllIlIllllIIlIIIlIlIlll, final Object llllllllllllIlIllllIIlIIIlIlIllI) {
        return llllllllllllIlIllllIIlIIIlIlIlll != llllllllllllIlIllllIIlIIIlIlIllI;
    }
    
    private void releaseBuffer() {
        if (lIIllllllllllIII(this.cumulation)) {
            this.cumulation.release();
            "".length();
            this.cumulation = null;
        }
    }
    
    private static boolean lIIlllllllllIlII(final int llllllllllllIlIllllIIlIIIlIllIll, final int llllllllllllIlIllllIIlIIIlIllIlI) {
        return llllllllllllIlIllllIIlIIIlIllIll > llllllllllllIlIllllIIlIIIlIllIlI;
    }
    
    public SpdyHeaderBlockRawDecoder(final SpdyVersion llllllllllllIlIllllIIlIIllIlIIlI, final int llllllllllllIlIllllIIlIIllIlIIIl) {
        if (lIIllllllllIllIl(llllllllllllIlIllllIIlIIllIlIIlI)) {
            throw new NullPointerException(SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0]]);
        }
        this.maxHeaderSize = llllllllllllIlIllllIIlIIllIlIIIl;
        this.state = State.READ_NUM_HEADERS;
    }
    
    @Override
    void end() {
        this.releaseBuffer();
    }
    
    protected void decodeHeaderBlock(final ByteBuf llllllllllllIlIllllIIlIIlIlIllII, final SpdyHeadersFrame llllllllllllIlIllllIIlIIlIlIllll) throws Exception {
        while (lIIllllllllIlllI(llllllllllllIlIllllIIlIIlIlIllII.isReadable() ? 1 : 0)) {
            switch (SpdyHeaderBlockRawDecoder$1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State[this.state.ordinal()]) {
                case 1: {
                    if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1])) {
                        return;
                    }
                    this.numHeaders = readLengthField(llllllllllllIlIllllIIlIIlIlIllII);
                    if (lIIlllllllllIIII(this.numHeaders)) {
                        this.state = State.ERROR;
                        llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else if (lIIlllllllllIIIl(this.numHeaders)) {
                        this.state = State.END_HEADER_BLOCK;
                        "".length();
                        if (((217 + 228 - 350 + 158 ^ 139 + 35 - 133 + 157) & (0x24 ^ 0x10 ^ (0x1D ^ 0x12) ^ -" ".length())) >= (0x5A ^ 0x53 ^ (0x4F ^ 0x42))) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_NAME_LENGTH;
                        "".length();
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1])) {
                        return;
                    }
                    this.length = readLengthField(llllllllllllIlIllllIIlIIlIlIllII);
                    if (lIIlllllllllIIlI(this.length)) {
                        this.state = State.ERROR;
                        llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                        "".length();
                        "".length();
                        if (((224 + 63 - 253 + 191 ^ 137 + 187 - 147 + 13) & (0x93 ^ 0xBC ^ (0x76 ^ 0x6) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                        break;
                    }
                    else if (!lIIlllllllllIIll(this.length, this.maxHeaderSize) || lIIlllllllllIlII(this.headerSize, this.maxHeaderSize - this.length)) {
                        this.headerSize = this.maxHeaderSize + SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2];
                        this.state = State.SKIP_NAME;
                        llllllllllllIlIllllIIlIIlIlIllll.setTruncated();
                        "".length();
                        "".length();
                        if (((0x4E ^ 0x56) & ~(0xA0 ^ 0xB8)) != ((0x2D ^ 0x38) & ~(0xBE ^ 0xAB))) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.headerSize += this.length;
                        this.state = State.READ_NAME;
                        "".length();
                        if (((48 + 80 - 62 + 84 ^ 55 + 160 - 116 + 87) & (0x4 ^ 0x65 ^ (0x47 ^ 0xA) ^ -" ".length())) == (0x8F ^ 0xC4 ^ (0x1C ^ 0x53))) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), this.length)) {
                        return;
                    }
                    final byte[] llllllllllllIlIllllIIlIIlIllIlIl = new byte[this.length];
                    llllllllllllIlIllllIIlIIlIlIllII.readBytes(llllllllllllIlIllllIIlIIlIllIlIl);
                    "".length();
                    this.name = new String(llllllllllllIlIllllIIlIIlIllIlIl, SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[4]]);
                    if (lIIllllllllIlllI(llllllllllllIlIllllIIlIIlIlIllll.headers().contains(this.name) ? 1 : 0)) {
                        this.state = State.ERROR;
                        llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_VALUE_LENGTH;
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 4: {
                    final int llllllllllllIlIllllIIlIIlIlIlllI = Math.min(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), this.length);
                    llllllllllllIlIllllIIlIIlIlIllII.skipBytes(llllllllllllIlIllllIIlIIlIlIlllI);
                    "".length();
                    this.length -= llllllllllllIlIllllIIlIIlIlIlllI;
                    if (!lIIlllllllllIIIl(this.length)) {
                        break;
                    }
                    this.state = State.READ_VALUE_LENGTH;
                    "".length();
                    if (((0xA3 ^ 0xB8) & ~(0x10 ^ 0xB)) != 0x0) {
                        return;
                    }
                    break;
                }
                case 5: {
                    if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1])) {
                        return;
                    }
                    this.length = readLengthField(llllllllllllIlIllllIIlIIlIlIllII);
                    if (lIIlllllllllIIII(this.length)) {
                        this.state = State.ERROR;
                        llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                        "".length();
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else if (lIIlllllllllIIIl(this.length)) {
                        if (lIIlllllllllIIIl(llllllllllllIlIllllIIlIIlIlIllll.isTruncated() ? 1 : 0)) {
                            llllllllllllIlIllllIIlIIlIlIllll.headers().add(this.name, SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[1]]);
                            "".length();
                        }
                        this.name = null;
                        final int n = this.numHeaders - SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2];
                        this.numHeaders = n;
                        if (lIIlllllllllIIIl(n)) {
                            this.state = State.END_HEADER_BLOCK;
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            this.state = State.READ_NAME_LENGTH;
                            "".length();
                            if ("   ".length() <= " ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    else if (!lIIlllllllllIIll(this.length, this.maxHeaderSize) || lIIlllllllllIlII(this.headerSize, this.maxHeaderSize - this.length)) {
                        this.headerSize = this.maxHeaderSize + SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2];
                        this.name = null;
                        this.state = State.SKIP_VALUE;
                        llllllllllllIlIllllIIlIIlIlIllll.setTruncated();
                        "".length();
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.headerSize += this.length;
                        this.state = State.READ_VALUE;
                        "".length();
                        if ((0x79 ^ 0x7D) <= 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 6: {
                    if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), this.length)) {
                        return;
                    }
                    final byte[] llllllllllllIlIllllIIlIIlIllIlII = new byte[this.length];
                    llllllllllllIlIllllIIlIIlIlIllII.readBytes(llllllllllllIlIllllIIlIIlIllIlII);
                    "".length();
                    int llllllllllllIlIllllIIlIIlIllIIll = SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0];
                    int llllllllllllIlIllllIIlIIlIllIIlI = SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0];
                    if (lIIlllllllllIIIl(llllllllllllIlIllllIIlIIlIllIlII[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[0]])) {
                        this.state = State.ERROR;
                        llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                        "".length();
                        "".length();
                        if ((0x57 ^ 0x52) <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        while (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIllIIll, this.length)) {
                            while (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIllIIll, llllllllllllIlIllllIIlIIlIllIlII.length) && lIIllllllllIlllI(llllllllllllIlIllllIIlIIlIllIlII[llllllllllllIlIllllIIlIIlIllIIll])) {
                                ++llllllllllllIlIllllIIlIIlIllIIll;
                                "".length();
                                if (-"   ".length() >= 0) {
                                    return;
                                }
                            }
                            if (lIIllllllllIllll(llllllllllllIlIllllIIlIIlIllIIll, llllllllllllIlIllllIIlIIlIllIlII.length) && (!lIIlllllllllIlIl(llllllllllllIlIllllIIlIIlIllIIll + SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2], llllllllllllIlIllllIIlIIlIllIlII.length) || lIIlllllllllIIIl(llllllllllllIlIllllIIlIIlIllIlII[llllllllllllIlIllllIIlIIlIllIIll + SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2]]))) {
                                this.state = State.ERROR;
                                llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                                "".length();
                                "".length();
                                if (-" ".length() >= (0x47 ^ 0x43)) {
                                    return;
                                }
                                break;
                            }
                            else {
                                final String llllllllllllIlIllllIIlIIlIllIllI = new String(llllllllllllIlIllllIIlIIlIllIlII, llllllllllllIlIllllIIlIIlIllIIlI, llllllllllllIlIllllIIlIIlIllIIll - llllllllllllIlIllllIIlIIlIllIIlI, SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[5]]);
                                try {
                                    llllllllllllIlIllllIIlIIlIlIllll.headers().add(this.name, llllllllllllIlIllllIIlIIlIllIllI);
                                    "".length();
                                    "".length();
                                    if (-"   ".length() >= 0) {
                                        return;
                                    }
                                }
                                catch (IllegalArgumentException llllllllllllIlIllllIIlIIlIllIlll) {
                                    this.state = State.ERROR;
                                    llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                                    "".length();
                                    "".length();
                                    if ((0xA6 ^ 0xA2) == 0x0) {
                                        return;
                                    }
                                    break;
                                }
                                llllllllllllIlIllllIIlIIlIllIIlI = ++llllllllllllIlIllllIIlIIlIllIIll;
                                "".length();
                                if (-(0xD7 ^ 0xA5 ^ (0xC3 ^ 0xB4)) >= 0) {
                                    return;
                                }
                                continue;
                            }
                        }
                        this.name = null;
                        if (lIIlllllllllIllI(this.state, State.ERROR)) {
                            "".length();
                            if ((0x5B ^ 0x5E) == 0x0) {
                                return;
                            }
                            break;
                        }
                        else {
                            final int n2 = this.numHeaders - SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2];
                            this.numHeaders = n2;
                            if (lIIlllllllllIIIl(n2)) {
                                this.state = State.END_HEADER_BLOCK;
                                "".length();
                                if (-" ".length() > 0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                this.state = State.READ_NAME_LENGTH;
                                "".length();
                                if (null != null) {
                                    return;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    final int llllllllllllIlIllllIIlIIlIlIlllI = Math.min(llllllllllllIlIllllIIlIIlIlIllII.readableBytes(), this.length);
                    llllllllllllIlIllllIIlIIlIlIllII.skipBytes(llllllllllllIlIllllIIlIIlIlIlllI);
                    "".length();
                    this.length -= llllllllllllIlIllllIIlIIlIlIlllI;
                    if (!lIIlllllllllIIIl(this.length)) {
                        break;
                    }
                    final int n3 = this.numHeaders - SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[2];
                    this.numHeaders = n3;
                    if (lIIlllllllllIIIl(n3)) {
                        this.state = State.END_HEADER_BLOCK;
                        "".length();
                        if ((0xB2 ^ 0xB7) == 0x0) {
                            return;
                        }
                        break;
                    }
                    else {
                        this.state = State.READ_NAME_LENGTH;
                        "".length();
                        if (-(0xA1 ^ 0x8E ^ (0x27 ^ 0xC)) > 0) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 8: {
                    this.state = State.ERROR;
                    llllllllllllIlIllllIIlIIlIlIllll.setInvalid();
                    "".length();
                    "".length();
                    if (((0x48 ^ 0x5C) & ~(0x20 ^ 0x34)) != 0x0) {
                        return;
                    }
                    break;
                }
                case 9: {
                    llllllllllllIlIllllIIlIIlIlIllII.skipBytes(llllllllllllIlIllllIIlIIlIlIllII.readableBytes());
                    "".length();
                    return;
                }
                default: {
                    throw new Error(SpdyHeaderBlockRawDecoder.lllIIlIlllIllI[SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[6]]);
                }
            }
            "".length();
            if ((0x5C ^ 0x79 ^ (0x13 ^ 0x32)) != (0x25 ^ 0x5C ^ (0xD9 ^ 0xA4))) {
                return;
            }
        }
    }
    
    private static String lIIllllllllIIlII(final String llllllllllllIlIllllIIlIIlIIIIIIl, final String llllllllllllIlIllllIIlIIlIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIlIIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlIIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[8]), "DES");
            final Cipher llllllllllllIlIllllIIlIIlIIIIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIIlIIlIIIIlIl.init(SpdyHeaderBlockRawDecoder.lllIIlIllllIIl[3], llllllllllllIlIllllIIlIIlIIIIllI);
            return new String(llllllllllllIlIllllIIlIIlIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIlIIlIIIIlII) {
            llllllllllllIlIllllIIlIIlIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllllllllIIlI(final int llllllllllllIlIllllIIlIIIlIIIllI) {
        return llllllllllllIlIllllIIlIIIlIIIllI <= 0;
    }
    
    private static boolean lIIlllllllllIIll(final int llllllllllllIlIllllIIlIIIlIlllll, final int llllllllllllIlIllllIIlIIIlIllllI) {
        return llllllllllllIlIllllIIlIIIlIlllll <= llllllllllllIlIllllIIlIIIlIllllI;
    }
    
    private static boolean lIIllllllllIlllI(final int llllllllllllIlIllllIIlIIIlIIllII) {
        return llllllllllllIlIllllIIlIIIlIIllII != 0;
    }
    
    private enum State
    {
        private static final /* synthetic */ String[] lIlIlllIIlIIII;
        
        READ_VALUE_LENGTH, 
        READ_NUM_HEADERS, 
        READ_VALUE, 
        READ_NAME, 
        ERROR, 
        READ_NAME_LENGTH, 
        END_HEADER_BLOCK, 
        SKIP_VALUE, 
        SKIP_NAME;
        
        private static final /* synthetic */ int[] lIlIlllIIlIIlI;
        
        private static String llllIIllIIlIIll(final String lllllllllllllIIIIlIlllIIIIIlIIll, final String lllllllllllllIIIIlIlllIIIIIlIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIlllIIIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), State.lIlIlllIIlIIlI[8]), "DES");
                final Cipher lllllllllllllIIIIlIlllIIIIIlIlll = Cipher.getInstance("DES");
                lllllllllllllIIIIlIlllIIIIIlIlll.init(State.lIlIlllIIlIIlI[2], lllllllllllllIIIIlIlllIIIIIllIIl);
                return new String(lllllllllllllIIIIlIlllIIIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlllIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIlllIIIIIlIllI) {
                lllllllllllllIIIIlIlllIIIIIlIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllIIllIlIllII(final int lllllllllllllIIIIlIllIllllIlllll, final int lllllllllllllIIIIlIllIllllIllllI) {
            return lllllllllllllIIIIlIllIllllIlllll < lllllllllllllIIIIlIllIllllIllllI;
        }
        
        private static void llllIIllIlIlIll() {
            (lIlIlllIIlIIlI = new int[10])[0] = ((0x53 ^ 0x67) & ~(0x33 ^ 0x7));
            State.lIlIlllIIlIIlI[1] = " ".length();
            State.lIlIlllIIlIIlI[2] = "  ".length();
            State.lIlIlllIIlIIlI[3] = "   ".length();
            State.lIlIlllIIlIIlI[4] = (0x8F ^ 0x8B);
            State.lIlIlllIIlIIlI[5] = (0x18 ^ 0x1D);
            State.lIlIlllIIlIIlI[6] = (0x3C ^ 0x53 ^ (0xDE ^ 0xB7));
            State.lIlIlllIIlIIlI[7] = (0xA2 ^ 0xA5);
            State.lIlIlllIIlIIlI[8] = (0x82 ^ 0x8A);
            State.lIlIlllIIlIIlI[9] = (0xCB ^ 0x8B ^ (0x2F ^ 0x66));
        }
        
        private static String llllIIllIIlIllI(String lllllllllllllIIIIlIllIlllllllIlI, final String lllllllllllllIIIIlIllIlllllllIII) {
            lllllllllllllIIIIlIllIlllllllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIllIlllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIlIlllIIIIIIIIII = new StringBuilder();
            final char[] lllllllllllllIIIIlIllIlllllllllI = lllllllllllllIIIIlIllIlllllllIII.toCharArray();
            int lllllllllllllIIIIlIllIllllllllII = State.lIlIlllIIlIIlI[0];
            final double lllllllllllllIIIIlIllIllllllIIII = (Object)lllllllllllllIIIIlIllIlllllllIlI.toCharArray();
            final long lllllllllllllIIIIlIllIlllllIlllI = lllllllllllllIIIIlIllIllllllIIII.length;
            long lllllllllllllIIIIlIllIlllllIllII = State.lIlIlllIIlIIlI[0];
            while (llllIIllIlIllII((int)lllllllllllllIIIIlIllIlllllIllII, (int)lllllllllllllIIIIlIllIlllllIlllI)) {
                final char lllllllllllllIIIIlIlllIIIIIIIlIl = lllllllllllllIIIIlIllIllllllIIII[lllllllllllllIIIIlIllIlllllIllII];
                lllllllllllllIIIIlIlllIIIIIIIIII.append((char)(lllllllllllllIIIIlIlllIIIIIIIlIl ^ lllllllllllllIIIIlIllIlllllllllI[lllllllllllllIIIIlIllIllllllllII % lllllllllllllIIIIlIllIlllllllllI.length]));
                "".length();
                ++lllllllllllllIIIIlIllIllllllllII;
                ++lllllllllllllIIIIlIllIlllllIllII;
                "".length();
                if (" ".length() == "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIlIlllIIIIIIIIII);
        }
        
        private static void llllIIllIIlIlll() {
            (lIlIlllIIlIIII = new String[State.lIlIlllIIlIIlI[9]])[State.lIlIlllIIlIIlI[0]] = llllIIllIIlIIll("IE97hRVZoJO9LlOCFHwKNjRKMLMvIhZD", "sCtpA");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[1]] = llllIIllIIlIlII("E03qZWK9Z9yoc/UJEwkQf1AMQHeIX6Sw", "ogTmq");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[2]] = llllIIllIIlIlII("8HI9XRJBSX4+2egSgbvX1A==", "MQaGk");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[3]] = llllIIllIIlIllI("HikkGDEDIyAN", "MbmHn");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[4]] = llllIIllIIlIlII("/jTc0vBp6QARWCMt3RC2djelNtaQGah+", "reqwG");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[5]] = llllIIllIIlIllI("OxEqIhU/FSczDw==", "iTkfJ");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[6]] = llllIIllIIlIlII("8C7RzuKtf4MA074wuRnH/A==", "AuiCQ");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[7]] = llllIIllIIlIIll("RIj/GLyJHHtA2iZs40iptqP7wa8D18Gl", "SEcfO");
            State.lIlIlllIIlIIII[State.lIlIlllIIlIIlI[8]] = llllIIllIIlIlII("mvB+shE5848=", "Ylrpw");
        }
        
        private static String llllIIllIIlIlII(final String lllllllllllllIIIIlIlllIIIIlIlllI, final String lllllllllllllIIIIlIlllIIIIlIllIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIlllIIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlllIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIlIlllIIIIllIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIlIlllIIIIllIIlI.init(State.lIlIlllIIlIIlI[2], lllllllllllllIIIIlIlllIIIIllIlIl);
                return new String(lllllllllllllIIIIlIlllIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlllIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIlllIIIIllIIII) {
                lllllllllllllIIIIlIlllIIIIllIIII.printStackTrace();
                return null;
            }
        }
        
        static {
            llllIIllIlIlIll();
            llllIIllIIlIlll();
            final State[] $values = new State[State.lIlIlllIIlIIlI[9]];
            $values[State.lIlIlllIIlIIlI[0]] = State.READ_NUM_HEADERS;
            $values[State.lIlIlllIIlIIlI[1]] = State.READ_NAME_LENGTH;
            $values[State.lIlIlllIIlIIlI[2]] = State.READ_NAME;
            $values[State.lIlIlllIIlIIlI[3]] = State.SKIP_NAME;
            $values[State.lIlIlllIIlIIlI[4]] = State.READ_VALUE_LENGTH;
            $values[State.lIlIlllIIlIIlI[5]] = State.READ_VALUE;
            $values[State.lIlIlllIIlIIlI[6]] = State.SKIP_VALUE;
            $values[State.lIlIlllIIlIIlI[7]] = State.END_HEADER_BLOCK;
            $values[State.lIlIlllIIlIIlI[8]] = State.ERROR;
            $VALUES = $values;
        }
    }
}
