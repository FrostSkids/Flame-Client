// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.handler.codec.TooLongFrameException;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderResult;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;
import io.netty.buffer.Unpooled;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.util.internal.AppendableCharSequence;
import io.netty.handler.codec.ReplayingDecoder;

public abstract class HttpObjectDecoder extends ReplayingDecoder<State>
{
    private final /* synthetic */ LineParser lineParser;
    private final /* synthetic */ AppendableCharSequence seq;
    private final /* synthetic */ int maxHeaderSize;
    private static final /* synthetic */ int[] lIlIIlllIIlllI;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ boolean chunkedSupported;
    protected final /* synthetic */ boolean validateHeaders;
    private /* synthetic */ HttpMessage message;
    private /* synthetic */ long chunkSize;
    private /* synthetic */ int headerSize;
    private final /* synthetic */ HeaderParser headerParser;
    private /* synthetic */ long contentLength;
    private static final /* synthetic */ String[] lIlIIlllIIllIl;
    private final /* synthetic */ int maxInitialLineLength;
    private final /* synthetic */ int maxChunkSize;
    
    private static boolean lllIlIIlIIIlIlI(final int lllllllllllllIIIllIIIIIIIIlllllI, final int lllllllllllllIIIllIIIIIIIIllllIl) {
        return lllllllllllllIIIllIIIIIIIIlllllI >= lllllllllllllIIIllIIIIIIIIllllIl;
    }
    
    private static int findNonWhitespace(final CharSequence lllllllllllllIIIllIIIIIIlIIllIlI, final int lllllllllllllIIIllIIIIIIlIIlllII) {
        int lllllllllllllIIIllIIIIIIlIIllIll = lllllllllllllIIIllIIIIIIlIIlllII;
        while (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIlIIllIll, lllllllllllllIIIllIIIIIIlIIllIlI.length())) {
            if (lllIlIIlIIIIIll(Character.isWhitespace(lllllllllllllIIIllIIIIIIlIIllIlI.charAt(lllllllllllllIIIllIIIIIIlIIllIll)) ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return (9 + 13 + 89 + 27 ^ 65 + 47 - 12 + 78) & (0xA7 ^ 0x81 ^ (0x3 ^ 0x1D) ^ -" ".length());
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIIIlIIllIll;
                "".length();
                if (((0x74 ^ 0x64) & ~(0x58 ^ 0x48)) > 0) {
                    return (0x40 ^ 0x1) & ~(0xDE ^ 0x9F);
                }
                continue;
            }
        }
        return lllllllllllllIIIllIIIIIIlIIllIll;
    }
    
    private State readHeaders(final ByteBuf lllllllllllllIIIllIIIIIIlllllllI) {
        this.headerSize = HttpObjectDecoder.lIlIIlllIIlllI[4];
        final HttpMessage lllllllllllllIIIllIIIIIlIIIIIlIl = this.message;
        final HttpHeaders lllllllllllllIIIllIIIIIlIIIIIlII = lllllllllllllIIIllIIIIIlIIIIIlIl.headers();
        AppendableCharSequence lllllllllllllIIIllIIIIIlIIIIIIll = this.headerParser.parse(lllllllllllllIIIllIIIIIIlllllllI);
        String lllllllllllllIIIllIIIIIlIIIIIIlI = null;
        String lllllllllllllIIIllIIIIIlIIIIIIIl = null;
        if (lllIlIIlIIIIllI(lllllllllllllIIIllIIIIIlIIIIIIll.length())) {
            lllllllllllllIIIllIIIIIlIIIIIlII.clear();
            "".length();
            do {
                final char lllllllllllllIIIllIIIIIlIIIIlIll = lllllllllllllIIIllIIIIIlIIIIIIll.charAt(HttpObjectDecoder.lIlIIlllIIlllI[4]);
                if (lllIlIIlIIIlIIl(lllllllllllllIIIllIIIIIlIIIIIIlI) && (!lllIlIIlIIIllII(lllllllllllllIIIllIIIIIlIIIIlIll, HttpObjectDecoder.lIlIIlllIIlllI[13]) || lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIIIIlIll, HttpObjectDecoder.lIlIIlllIIlllI[14]))) {
                    lllllllllllllIIIllIIIIIlIIIIIIIl = String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIIIlIIIIIIIl).append((char)HttpObjectDecoder.lIlIIlllIIlllI[13]).append(lllllllllllllIIIllIIIIIlIIIIIIll.toString().trim()));
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                }
                else {
                    if (lllIlIIlIIIlIIl(lllllllllllllIIIllIIIIIlIIIIIIlI)) {
                        lllllllllllllIIIllIIIIIlIIIIIlII.add(lllllllllllllIIIllIIIIIlIIIIIIlI, lllllllllllllIIIllIIIIIlIIIIIIIl);
                        "".length();
                    }
                    final String[] lllllllllllllIIIllIIIIIlIIIIllII = splitHeader(lllllllllllllIIIllIIIIIlIIIIIIll);
                    lllllllllllllIIIllIIIIIlIIIIIIlI = lllllllllllllIIIllIIIIIlIIIIllII[HttpObjectDecoder.lIlIIlllIIlllI[4]];
                    lllllllllllllIIIllIIIIIlIIIIIIIl = lllllllllllllIIIllIIIIIlIIIIllII[HttpObjectDecoder.lIlIIlllIIlllI[2]];
                }
                lllllllllllllIIIllIIIIIlIIIIIIll = this.headerParser.parse(lllllllllllllIIIllIIIIIIlllllllI);
            } while (!lllIlIIIlllllll(lllllllllllllIIIllIIIIIlIIIIIIll.length()));
            if (lllIlIIlIIIlIIl(lllllllllllllIIIllIIIIIlIIIIIIlI)) {
                lllllllllllllIIIllIIIIIlIIIIIlII.add(lllllllllllllIIIllIIIIIlIIIIIIlI, lllllllllllllIIIllIIIIIlIIIIIIIl);
                "".length();
            }
        }
        State lllllllllllllIIIllIIIIIlIIIIIIII = null;
        if (lllIlIIlIIIIlII(this.isContentAlwaysEmpty(lllllllllllllIIIllIIIIIlIIIIIlIl) ? 1 : 0)) {
            HttpHeaders.removeTransferEncodingChunked(lllllllllllllIIIllIIIIIlIIIIIlIl);
            final State lllllllllllllIIIllIIIIIlIIIIlIlI = State.SKIP_CONTROL_CHARS;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lllIlIIlIIIIlII(HttpHeaders.isTransferEncodingChunked(lllllllllllllIIIllIIIIIlIIIIIlIl) ? 1 : 0)) {
            final State lllllllllllllIIIllIIIIIlIIIIlIIl = State.READ_CHUNK_SIZE;
            "".length();
            if (((0x7B ^ 0x53) & ~(0x55 ^ 0x7D)) != 0x0) {
                return null;
            }
        }
        else if (lllIlIIlIIIllIl(lllIlIIlIIIlIll(this.contentLength(), 0L))) {
            final State lllllllllllllIIIllIIIIIlIIIIlIII = State.READ_FIXED_LENGTH_CONTENT;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIllIIIIIlIIIIIIII = State.READ_VARIABLE_LENGTH_CONTENT;
        }
        return lllllllllllllIIIllIIIIIlIIIIIIII;
    }
    
    protected abstract boolean isDecodingRequest();
    
    private static String lllIlIIIllllIlI(final String lllllllllllllIIIllIIIIIIIllIIIlI, final String lllllllllllllIIIllIIIIIIIlIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIIIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), HttpObjectDecoder.lIlIIlllIIlllI[20]), "DES");
            final Cipher lllllllllllllIIIllIIIIIIIllIIlII = Cipher.getInstance("DES");
            lllllllllllllIIIllIIIIIIIllIIlII.init(HttpObjectDecoder.lIlIIlllIIlllI[5], lllllllllllllIIIllIIIIIIIllIIlIl);
            return new String(lllllllllllllIIIllIIIIIIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIIIIllIIIll) {
            lllllllllllllIIIllIIIIIIIllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIIlIIIIlll(final int lllllllllllllIIIllIIIIIIIlIIIIlI, final int lllllllllllllIIIllIIIIIIIlIIIIIl) {
        return lllllllllllllIIIllIIIIIIIlIIIIlI == lllllllllllllIIIllIIIIIIIlIIIIIl;
    }
    
    private static String lllIlIIIllllIll(String lllllllllllllIIIllIIIIIIIlIIllIl, final String lllllllllllllIIIllIIIIIIIlIlIIIl) {
        lllllllllllllIIIllIIIIIIIlIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIIIIIlIlIIII = new StringBuilder();
        final char[] lllllllllllllIIIllIIIIIIIlIIllll = lllllllllllllIIIllIIIIIIIlIlIIIl.toCharArray();
        int lllllllllllllIIIllIIIIIIIlIIlllI = HttpObjectDecoder.lIlIIlllIIlllI[4];
        final double lllllllllllllIIIllIIIIIIIlIIlIII = (Object)lllllllllllllIIIllIIIIIIIlIIllIl.toCharArray();
        final short lllllllllllllIIIllIIIIIIIlIIIlll = (short)lllllllllllllIIIllIIIIIIIlIIlIII.length;
        float lllllllllllllIIIllIIIIIIIlIIIllI = HttpObjectDecoder.lIlIIlllIIlllI[4];
        while (lllIlIIlIIIIIIl((int)lllllllllllllIIIllIIIIIIIlIIIllI, lllllllllllllIIIllIIIIIIIlIIIlll)) {
            final char lllllllllllllIIIllIIIIIIIlIlIIll = lllllllllllllIIIllIIIIIIIlIIlIII[lllllllllllllIIIllIIIIIIIlIIIllI];
            lllllllllllllIIIllIIIIIIIlIlIIII.append((char)(lllllllllllllIIIllIIIIIIIlIlIIll ^ lllllllllllllIIIllIIIIIIIlIIllll[lllllllllllllIIIllIIIIIIIlIIlllI % lllllllllllllIIIllIIIIIIIlIIllll.length]));
            "".length();
            ++lllllllllllllIIIllIIIIIIIlIIlllI;
            ++lllllllllllllIIIllIIIIIIIlIIIllI;
            "".length();
            if ("  ".length() > (0x65 ^ 0x61)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIIIIIlIlIIII);
    }
    
    private static int lllIlIIlIIIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lllIlIIlIIIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void skipControlCharacters(final ByteBuf lllllllllllllIIIllIIIIIlIIIlIlll) {
        do {
            final char lllllllllllllIIIllIIIIIlIIIllIIl = (char)lllllllllllllIIIllIIIIIlIIIlIlll.readUnsignedByte();
            if (lllIlIIlIIIIIll(Character.isISOControl(lllllllllllllIIIllIIIIIlIIIllIIl) ? 1 : 0) && lllIlIIlIIIIIll(Character.isWhitespace(lllllllllllllIIIllIIIIIlIIIllIIl) ? 1 : 0)) {
                lllllllllllllIIIllIIIIIlIIIlIlll.readerIndex(lllllllllllllIIIllIIIIIlIIIlIlll.readerIndex() - HttpObjectDecoder.lIlIIlllIIlllI[2]);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                "".length();
            }
        } while ((177 + 69 - 147 + 90 ^ 28 + 63 - 90 + 184) >= 0);
    }
    
    static {
        lllIlIIIllllllI();
        lllIlIIIlllllIl();
        int $assertionsDisabled2;
        if (lllIlIIlIIIIIll(HttpObjectDecoder.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = HttpObjectDecoder.lIlIIlllIIlllI[2];
            "".length();
            if (((0x69 ^ 0x46) & ~(0x88 ^ 0xA7)) == " ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = HttpObjectDecoder.lIlIIlllIIlllI[4];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    protected HttpObjectDecoder(final int lllllllllllllIIIllIIIIIllIIIlIll, final int lllllllllllllIIIllIIIIIllIIIlIlI, final int lllllllllllllIIIllIIIIIllIIIlllI, final boolean lllllllllllllIIIllIIIIIllIIIlIII) {
        this(lllllllllllllIIIllIIIIIllIIIlIll, lllllllllllllIIIllIIIIIllIIIlIlI, lllllllllllllIIIllIIIIIllIIIlllI, lllllllllllllIIIllIIIIIllIIIlIII, (boolean)(HttpObjectDecoder.lIlIIlllIIlllI[2] != 0));
    }
    
    private static boolean lllIlIIlIIIIlIl(final Object lllllllllllllIIIllIIIIIIIIllIllI, final Object lllllllllllllIIIllIIIIIIIIllIlIl) {
        return lllllllllllllIIIllIIIIIIIIllIllI != lllllllllllllIIIllIIIIIIIIllIlIl;
    }
    
    private static boolean lllIlIIlIIIIIIl(final int lllllllllllllIIIllIIIIIIIIlllIlI, final int lllllllllllllIIIllIIIIIIIIlllIIl) {
        return lllllllllllllIIIllIIIIIIIIlllIlI < lllllllllllllIIIllIIIIIIIIlllIIl;
    }
    
    private static int findEndOfString(final CharSequence lllllllllllllIIIllIIIIIIlIIIlIlI) {
        int lllllllllllllIIIllIIIIIIlIIIlIll = lllllllllllllIIIllIIIIIIlIIIlIlI.length();
        while (lllIlIIlIIIIllI(lllllllllllllIIIllIIIIIIlIIIlIll)) {
            if (lllIlIIlIIIIIll(Character.isWhitespace(lllllllllllllIIIllIIIIIIlIIIlIlI.charAt(lllllllllllllIIIllIIIIIIlIIIlIll - HttpObjectDecoder.lIlIIlllIIlllI[2])) ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return (0xFC ^ 0xA7) & ~(0xA ^ 0x51);
                }
                break;
            }
            else {
                --lllllllllllllIIIllIIIIIIlIIIlIll;
                "".length();
                if (null != null) {
                    return (0x78 ^ 0x2B) & ~(0x73 ^ 0x20);
                }
                continue;
            }
        }
        return lllllllllllllIIIllIIIIIIlIIIlIll;
    }
    
    private static int getChunkSize(String lllllllllllllIIIllIIIIIIllIlIIII) {
        lllllllllllllIIIllIIIIIIllIlIIII = lllllllllllllIIIllIIIIIIllIlIIII.trim();
        int lllllllllllllIIIllIIIIIIllIlIIlI = HttpObjectDecoder.lIlIIlllIIlllI[4];
        while (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIllIlIIlI, lllllllllllllIIIllIIIIIIllIlIIII.length())) {
            final char lllllllllllllIIIllIIIIIIllIlIIll = lllllllllllllIIIllIIIIIIllIlIIII.charAt(lllllllllllllIIIllIIIIIIllIlIIlI);
            if (!lllIlIIlIIIllII(lllllllllllllIIIllIIIIIIllIlIIll, HttpObjectDecoder.lIlIIlllIIlllI[18]) || !lllIlIIlIIIIIll(Character.isWhitespace(lllllllllllllIIIllIIIIIIllIlIIll) ? 1 : 0) || lllIlIIlIIIIlII(Character.isISOControl(lllllllllllllIIIllIIIIIIllIlIIll) ? 1 : 0)) {
                lllllllllllllIIIllIIIIIIllIlIIII = lllllllllllllIIIllIIIIIIllIlIIII.substring(HttpObjectDecoder.lIlIIlllIIlllI[4], lllllllllllllIIIllIIIIIIllIlIIlI);
                "".length();
                if (((0x3A ^ 0x2B) & ~(0x92 ^ 0x83)) != 0x0) {
                    return (0x3A ^ 0x2A) & ~(0x5C ^ 0x4C);
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIIIllIlIIlI;
                "".length();
                if (-"  ".length() > 0) {
                    return "   ".length() & ("   ".length() ^ -" ".length());
                }
                continue;
            }
        }
        return Integer.parseInt(lllllllllllllIIIllIIIIIIllIlIIII, HttpObjectDecoder.lIlIIlllIIlllI[19]);
    }
    
    private LastHttpContent readTrailingHeaders(final ByteBuf lllllllllllllIIIllIIIIIIlllIIIlI) {
        this.headerSize = HttpObjectDecoder.lIlIIlllIIlllI[4];
        AppendableCharSequence lllllllllllllIIIllIIIIIIlllIIIIl = this.headerParser.parse(lllllllllllllIIIllIIIIIIlllIIIlI);
        String lllllllllllllIIIllIIIIIIlllIIIII = null;
        if (lllIlIIlIIIIllI(lllllllllllllIIIllIIIIIIlllIIIIl.length())) {
            final LastHttpContent lllllllllllllIIIllIIIIIIlllIIlII = new DefaultLastHttpContent(Unpooled.EMPTY_BUFFER, this.validateHeaders);
            do {
                final char lllllllllllllIIIllIIIIIIlllIIlIl = lllllllllllllIIIllIIIIIIlllIIIIl.charAt(HttpObjectDecoder.lIlIIlllIIlllI[4]);
                if (lllIlIIlIIIlIIl(lllllllllllllIIIllIIIIIIlllIIIII) && (!lllIlIIlIIIllII(lllllllllllllIIIllIIIIIIlllIIlIl, HttpObjectDecoder.lIlIIlllIIlllI[13]) || lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIIlllIIlIl, HttpObjectDecoder.lIlIIlllIIlllI[14]))) {
                    final List<String> lllllllllllllIIIllIIIIIIlllIlIII = lllllllllllllIIIllIIIIIIlllIIlII.trailingHeaders().getAll(lllllllllllllIIIllIIIIIIlllIIIII);
                    if (lllIlIIlIIIIIll(lllllllllllllIIIllIIIIIIlllIlIII.isEmpty() ? 1 : 0)) {
                        final int lllllllllllllIIIllIIIIIIlllIlIlI = lllllllllllllIIIllIIIIIIlllIlIII.size() - HttpObjectDecoder.lIlIIlllIIlllI[2];
                        final String lllllllllllllIIIllIIIIIIlllIlIIl = String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIIIIlllIlIII.get(lllllllllllllIIIllIIIIIIlllIlIlI)).append(lllllllllllllIIIllIIIIIIlllIIIIl.toString().trim()));
                        lllllllllllllIIIllIIIIIIlllIlIII.set(lllllllllllllIIIllIIIIIIlllIlIlI, lllllllllllllIIIllIIIIIIlllIlIIl);
                        "".length();
                    }
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    final String[] lllllllllllllIIIllIIIIIIlllIIlll = splitHeader(lllllllllllllIIIllIIIIIIlllIIIIl);
                    final String lllllllllllllIIIllIIIIIIlllIIllI = lllllllllllllIIIllIIIIIIlllIIlll[HttpObjectDecoder.lIlIIlllIIlllI[4]];
                    if (lllIlIIlIIIIIll(HttpHeaders.equalsIgnoreCase(lllllllllllllIIIllIIIIIIlllIIllI, HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[15]]) ? 1 : 0) && lllIlIIlIIIIIll(HttpHeaders.equalsIgnoreCase(lllllllllllllIIIllIIIIIIlllIIllI, HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[16]]) ? 1 : 0) && lllIlIIlIIIIIll(HttpHeaders.equalsIgnoreCase(lllllllllllllIIIllIIIIIIlllIIllI, HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[17]]) ? 1 : 0)) {
                        lllllllllllllIIIllIIIIIIlllIIlII.trailingHeaders().add(lllllllllllllIIIllIIIIIIlllIIllI, lllllllllllllIIIllIIIIIIlllIIlll[HttpObjectDecoder.lIlIIlllIIlllI[2]]);
                        "".length();
                    }
                    lllllllllllllIIIllIIIIIIlllIIIII = lllllllllllllIIIllIIIIIIlllIIllI;
                }
                lllllllllllllIIIllIIIIIIlllIIIIl = this.headerParser.parse(lllllllllllllIIIllIIIIIIlllIIIlI);
            } while (!lllIlIIIlllllll(lllllllllllllIIIllIIIIIIlllIIIIl.length()));
            return lllllllllllllIIIllIIIIIIlllIIlII;
        }
        return LastHttpContent.EMPTY_LAST_CONTENT;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIllIIIIIlIlIllIlI, final ByteBuf lllllllllllllIIIllIIIIIlIlIlIlIl, final List<Object> lllllllllllllIIIllIIIIIlIlIlIlII) throws Exception {
        Label_1106: {
            switch (HttpObjectDecoder$1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[this.state().ordinal()]) {
                case 1: {
                    try {
                        skipControlCharacters(lllllllllllllIIIllIIIIIlIlIlIlIl);
                        this.checkpoint(State.READ_INITIAL);
                        this.checkpoint();
                        "".length();
                        if (((0x6F ^ 0x41) & ~(0x3C ^ 0x12) & ~((0x7C ^ 0x6D) & ~(0xAF ^ 0xBE))) != 0x0) {
                            return;
                        }
                    }
                    finally {
                        this.checkpoint();
                    }
                }
                case 2: {
                    try {
                        final String[] lllllllllllllIIIllIIIIIlIllIlllI = splitInitialLine(this.lineParser.parse(lllllllllllllIIIllIIIIIlIlIlIlIl));
                        if (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIlIllIlllI.length, HttpObjectDecoder.lIlIIlllIIlllI[6])) {
                            this.checkpoint(State.SKIP_CONTROL_CHARS);
                            return;
                        }
                        this.message = this.createMessage(lllllllllllllIIIllIIIIIlIllIlllI);
                        this.checkpoint(State.READ_HEADER);
                        "".length();
                        if (((0x94 ^ 0xAD ^ (0xCB ^ 0xBE)) & (196 + 10 - 86 + 84 ^ 89 + 41 - 110 + 108 ^ -" ".length())) < 0) {
                            return;
                        }
                    }
                    catch (Exception lllllllllllllIIIllIIIIIlIllIllIl) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(this.invalidMessage(lllllllllllllIIIllIIIIIlIllIllIl));
                        "".length();
                    }
                }
                case 3: {
                    try {
                        final State lllllllllllllIIIllIIIIIlIllIllII = this.readHeaders(lllllllllllllIIIllIIIIIlIlIlIlIl);
                        this.checkpoint(lllllllllllllIIIllIIIIIlIllIllII);
                        if (lllIlIIlIIIIIlI(lllllllllllllIIIllIIIIIlIllIllII, State.READ_CHUNK_SIZE)) {
                            if (lllIlIIlIIIIIll(this.chunkedSupported ? 1 : 0)) {
                                throw new IllegalArgumentException(HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[6]]);
                            }
                            lllllllllllllIIIllIIIIIlIlIlIlII.add(this.message);
                            "".length();
                        }
                        else {
                            if (lllIlIIlIIIIIlI(lllllllllllllIIIllIIIIIlIllIllII, State.SKIP_CONTROL_CHARS)) {
                                lllllllllllllIIIllIIIIIlIlIlIlII.add(this.message);
                                "".length();
                                lllllllllllllIIIllIIIIIlIlIlIlII.add(LastHttpContent.EMPTY_LAST_CONTENT);
                                "".length();
                                this.reset();
                                return;
                            }
                            final long lllllllllllllIIIllIIIIIlIllIlIll = this.contentLength();
                            if (!lllIlIIlIIIIlII(lllIlIIlIIIIIII(lllllllllllllIIIllIIIIIlIllIlIll, 0L)) || (lllIlIIlIIIIIll(lllIlIIlIIIIIII(lllllllllllllIIIllIIIIIlIllIlIll, -1L)) && lllIlIIlIIIIlII(this.isDecodingRequest() ? 1 : 0))) {
                                lllllllllllllIIIllIIIIIlIlIlIlII.add(this.message);
                                "".length();
                                lllllllllllllIIIllIIIIIlIlIlIlII.add(LastHttpContent.EMPTY_LAST_CONTENT);
                                "".length();
                                this.reset();
                                return;
                            }
                            if (lllIlIIlIIIIIll(HttpObjectDecoder.$assertionsDisabled ? 1 : 0) && lllIlIIlIIIIlIl(lllllllllllllIIIllIIIIIlIllIllII, State.READ_FIXED_LENGTH_CONTENT) && lllIlIIlIIIIlIl(lllllllllllllIIIllIIIIIlIllIllII, State.READ_VARIABLE_LENGTH_CONTENT)) {
                                throw new AssertionError();
                            }
                            lllllllllllllIIIllIIIIIlIlIlIlII.add(this.message);
                            "".length();
                            if (lllIlIIlIIIIIlI(lllllllllllllIIIllIIIIIlIllIllII, State.READ_FIXED_LENGTH_CONTENT)) {
                                this.chunkSize = lllllllllllllIIIllIIIIIlIllIlIll;
                            }
                        }
                    }
                    catch (Exception lllllllllllllIIIllIIIIIlIllIlIlI) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(this.invalidMessage(lllllllllllllIIIllIIIIIlIllIlIlI));
                        "".length();
                    }
                }
                case 4: {
                    final int lllllllllllllIIIllIIIIIlIllIlIII = Math.min(this.actualReadableBytes(), this.maxChunkSize);
                    if (lllIlIIlIIIIllI(lllllllllllllIIIllIIIIIlIllIlIII)) {
                        final ByteBuf lllllllllllllIIIllIIIIIlIllIlIIl = ByteBufUtil.readBytes(lllllllllllllIIIllIIIIIlIlIllIlI.alloc(), lllllllllllllIIIllIIIIIlIlIlIlIl, lllllllllllllIIIllIIIIIlIllIlIII);
                        if (lllIlIIlIIIIlII(lllllllllllllIIIllIIIIIlIlIlIlIl.isReadable() ? 1 : 0)) {
                            lllllllllllllIIIllIIIIIlIlIlIlII.add(new DefaultHttpContent(lllllllllllllIIIllIIIIIlIllIlIIl));
                            "".length();
                            "".length();
                            if (-(0x42 ^ 0x5D ^ (0x85 ^ 0x9E)) >= 0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIIllIIIIIlIlIlIlII.add(new DefaultLastHttpContent(lllllllllllllIIIllIIIIIlIllIlIIl, this.validateHeaders));
                            "".length();
                            this.reset();
                        }
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                    else if (lllIlIIlIIIIIll(lllllllllllllIIIllIIIIIlIlIlIlIl.isReadable() ? 1 : 0)) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(LastHttpContent.EMPTY_LAST_CONTENT);
                        "".length();
                        this.reset();
                    }
                }
                case 5: {
                    final int lllllllllllllIIIllIIIIIlIllIIlll = this.actualReadableBytes();
                    if (lllIlIIlIIIIIll(lllllllllllllIIIllIIIIIlIllIIlll)) {
                        return;
                    }
                    int lllllllllllllIIIllIIIIIlIllIIllI = Math.min(lllllllllllllIIIllIIIIIlIllIIlll, this.maxChunkSize);
                    if (lllIlIIlIIIIllI(lllIlIIlIIIIIII(lllllllllllllIIIllIIIIIlIllIIllI, this.chunkSize))) {
                        lllllllllllllIIIllIIIIIlIllIIllI = (int)this.chunkSize;
                    }
                    final ByteBuf lllllllllllllIIIllIIIIIlIllIIlIl = ByteBufUtil.readBytes(lllllllllllllIIIllIIIIIlIlIllIlI.alloc(), lllllllllllllIIIllIIIIIlIlIlIlIl, lllllllllllllIIIllIIIIIlIllIIllI);
                    this.chunkSize -= lllllllllllllIIIllIIIIIlIllIIllI;
                    if (lllIlIIlIIIIIll(lllIlIIlIIIIIII(this.chunkSize, 0L))) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(new DefaultLastHttpContent(lllllllllllllIIIllIIIIIlIllIIlIl, this.validateHeaders));
                        "".length();
                        this.reset();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(new DefaultHttpContent(lllllllllllllIIIllIIIIIlIllIIlIl));
                        "".length();
                    }
                }
                case 6: {
                    try {
                        final AppendableCharSequence lllllllllllllIIIllIIIIIlIllIIlII = this.lineParser.parse(lllllllllllllIIIllIIIIIlIlIlIlIl);
                        final int lllllllllllllIIIllIIIIIlIllIIIll = getChunkSize(lllllllllllllIIIllIIIIIlIllIIlII.toString());
                        this.chunkSize = lllllllllllllIIIllIIIIIlIllIIIll;
                        if (lllIlIIlIIIIIll(lllllllllllllIIIllIIIIIlIllIIIll)) {
                            this.checkpoint(State.READ_CHUNK_FOOTER);
                            return;
                        }
                        this.checkpoint(State.READ_CHUNKED_CONTENT);
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                    }
                    catch (Exception lllllllllllllIIIllIIIIIlIllIIIlI) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(this.invalidChunk(lllllllllllllIIIllIIIIIlIllIIIlI));
                        "".length();
                    }
                }
                case 7: {
                    if (lllIlIIlIIIIIll(HttpObjectDecoder.$assertionsDisabled ? 1 : 0) && lllIlIIlIIIIllI(lllIlIIlIIIIIII(this.chunkSize, 2147483647L))) {
                        throw new AssertionError();
                    }
                    final int lllllllllllllIIIllIIIIIlIllIIIIl = Math.min((int)this.chunkSize, this.maxChunkSize);
                    final HttpContent lllllllllllllIIIllIIIIIlIllIIIII = new DefaultHttpContent(ByteBufUtil.readBytes(lllllllllllllIIIllIIIIIlIlIllIlI.alloc(), lllllllllllllIIIllIIIIIlIlIlIlIl, lllllllllllllIIIllIIIIIlIllIIIIl));
                    this.chunkSize -= lllllllllllllIIIllIIIIIlIllIIIIl;
                    lllllllllllllIIIllIIIIIlIlIlIlII.add(lllllllllllllIIIllIIIIIlIllIIIII);
                    "".length();
                    if (!lllIlIIlIIIIIll(lllIlIIlIIIIIII(this.chunkSize, 0L))) {
                        return;
                    }
                    this.checkpoint(State.READ_CHUNK_DELIMITER);
                    "".length();
                    if ((0x2C ^ 0xB ^ (0xA ^ 0x29)) == 0x0) {
                        return;
                    }
                    break Label_1106;
                }
                case 8: {
                    do {
                        final byte lllllllllllllIIIllIIIIIlIlIlllll = lllllllllllllIIIllIIIIIlIlIlIlIl.readByte();
                        if (lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIlIlllll, HttpObjectDecoder.lIlIIlllIIlllI[7])) {
                            if (lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIlIlIlIl.readByte(), HttpObjectDecoder.lIlIIlllIIlllI[8])) {
                                this.checkpoint(State.READ_CHUNK_SIZE);
                                return;
                            }
                        }
                        else {
                            if (lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIlIlllll, HttpObjectDecoder.lIlIIlllIIlllI[8])) {
                                this.checkpoint(State.READ_CHUNK_SIZE);
                                return;
                            }
                            this.checkpoint();
                        }
                        "".length();
                    } while ("  ".length() < (0xC0 ^ 0xC4));
                }
                case 9: {
                    try {
                        final LastHttpContent lllllllllllllIIIllIIIIIlIlIllllI = this.readTrailingHeaders(lllllllllllllIIIllIIIIIlIlIlIlIl);
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(lllllllllllllIIIllIIIIIlIlIllllI);
                        "".length();
                        this.reset();
                    }
                    catch (Exception lllllllllllllIIIllIIIIIlIlIlllIl) {
                        lllllllllllllIIIllIIIIIlIlIlIlII.add(this.invalidChunk(lllllllllllllIIIllIIIIIlIlIlllIl));
                        "".length();
                    }
                }
                case 10: {
                    lllllllllllllIIIllIIIIIlIlIlIlIl.skipBytes(this.actualReadableBytes());
                    "".length();
                    "".length();
                    if ((91 + 24 + 11 + 53 ^ 61 + 126 - 66 + 62) <= "  ".length()) {
                        return;
                    }
                    break;
                }
                case 11: {
                    final int lllllllllllllIIIllIIIIIlIlIlllII = this.actualReadableBytes();
                    if (!lllIlIIlIIIIllI(lllllllllllllIIIllIIIIIlIlIlllII)) {
                        break;
                    }
                    lllllllllllllIIIllIIIIIlIlIlIlII.add(lllllllllllllIIIllIIIIIlIlIlIlIl.readBytes(this.actualReadableBytes()));
                    "".length();
                    "".length();
                    if ((0x90 ^ 0x94) != (0x2 ^ 0x6)) {
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    protected abstract HttpMessage createInvalidMessage();
    
    private static boolean lllIlIIlIIIIlII(final int lllllllllllllIIIllIIIIIIIIlIllIl) {
        return lllllllllllllIIIllIIIIIIIIlIllIl != 0;
    }
    
    protected HttpObjectDecoder(final int lllllllllllllIIIllIIIIIlIllllIlI, final int lllllllllllllIIIllIIIIIlIllllIIl, final int lllllllllllllIIIllIIIIIlIllllllI, final boolean lllllllllllllIIIllIIIIIlIlllllIl, final boolean lllllllllllllIIIllIIIIIlIlllllII) {
        super(State.SKIP_CONTROL_CHARS);
        this.seq = new AppendableCharSequence(HttpObjectDecoder.lIlIIlllIIlllI[3]);
        this.headerParser = new HeaderParser(this.seq);
        this.lineParser = new LineParser(this.seq);
        this.contentLength = Long.MIN_VALUE;
        if (lllIlIIIlllllll(lllllllllllllIIIllIIIIIlIllllIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[4]]).append(lllllllllllllIIIllIIIIIlIllllIlI)));
        }
        if (lllIlIIIlllllll(lllllllllllllIIIllIIIIIlIllllIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[2]]).append(lllllllllllllIIIllIIIIIlIllllIIl)));
        }
        if (lllIlIIIlllllll(lllllllllllllIIIllIIIIIlIllllllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[5]]).append(lllllllllllllIIIllIIIIIlIllllllI)));
        }
        this.maxInitialLineLength = lllllllllllllIIIllIIIIIlIllllIlI;
        this.maxHeaderSize = lllllllllllllIIIllIIIIIlIllllIIl;
        this.maxChunkSize = lllllllllllllIIIllIIIIIlIllllllI;
        this.chunkedSupported = lllllllllllllIIIllIIIIIlIlllllIl;
        this.validateHeaders = lllllllllllllIIIllIIIIIlIlllllII;
    }
    
    private HttpMessage invalidMessage(final Exception lllllllllllllIIIllIIIIIlIIlIlIIl) {
        this.checkpoint(State.BAD_MESSAGE);
        if (lllIlIIlIIIlIIl(this.message)) {
            this.message.setDecoderResult(DecoderResult.failure(lllllllllllllIIIllIIIIIlIIlIlIIl));
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            this.message = this.createInvalidMessage();
            this.message.setDecoderResult(DecoderResult.failure(lllllllllllllIIIllIIIIIlIIlIlIIl));
        }
        final HttpMessage lllllllllllllIIIllIIIIIlIIlIlIII = this.message;
        this.message = null;
        return lllllllllllllIIIllIIIIIlIIlIlIII;
    }
    
    private static void lllIlIIIllllllI() {
        (lIlIIlllIIlllI = new int[22])[0] = (-(0xFFFFFAFD & 0x4F3B) & (0xFFFFDABD & 0x7F7A));
        HttpObjectDecoder.lIlIIlllIIlllI[1] = (0xFFFFE63F & 0x39C0);
        HttpObjectDecoder.lIlIIlllIIlllI[2] = " ".length();
        HttpObjectDecoder.lIlIIlllIIlllI[3] = 114 + 106 - 127 + 35;
        HttpObjectDecoder.lIlIIlllIIlllI[4] = ((0x1F ^ 0x47 ^ (0xB6 ^ 0xB1)) & (0xDC ^ 0x85 ^ (0x74 ^ 0x72) ^ -" ".length()));
        HttpObjectDecoder.lIlIIlllIIlllI[5] = "  ".length();
        HttpObjectDecoder.lIlIIlllIIlllI[6] = "   ".length();
        HttpObjectDecoder.lIlIIlllIIlllI[7] = (0x52 ^ 0x30 ^ (0x28 ^ 0x47));
        HttpObjectDecoder.lIlIIlllIIlllI[8] = (0x3B ^ 0x31);
        HttpObjectDecoder.lIlIIlllIIlllI[9] = (0xC5 ^ 0xA1);
        HttpObjectDecoder.lIlIIlllIIlllI[10] = 15 + 6 + 170 + 9;
        HttpObjectDecoder.lIlIIlllIIlllI[11] = (183 + 230 - 268 + 102 ^ 98 + 94 - 191 + 145);
        HttpObjectDecoder.lIlIIlllIIlllI[12] = (0x49 ^ 0x4D);
        HttpObjectDecoder.lIlIIlllIIlllI[13] = (((0x10 ^ 0x73) & ~(0x3E ^ 0x5D)) ^ (0x6A ^ 0x4A));
        HttpObjectDecoder.lIlIIlllIIlllI[14] = (0x19 ^ 0x10);
        HttpObjectDecoder.lIlIIlllIIlllI[15] = (0xB4 ^ 0xB1);
        HttpObjectDecoder.lIlIIlllIIlllI[16] = (75 + 46 - 10 + 33 ^ 147 + 7 - 30 + 26);
        HttpObjectDecoder.lIlIIlllIIlllI[17] = (0xAE ^ 0xA9);
        HttpObjectDecoder.lIlIIlllIIlllI[18] = (0x8B ^ 0xB0);
        HttpObjectDecoder.lIlIIlllIIlllI[19] = (0x7A ^ 0x34 ^ (0x7F ^ 0x21));
        HttpObjectDecoder.lIlIIlllIIlllI[20] = (0x95 ^ 0x9E ^ "   ".length());
        HttpObjectDecoder.lIlIIlllIIlllI[21] = (0x98 ^ 0xA2);
    }
    
    protected abstract HttpMessage createMessage(final String[] p0) throws Exception;
    
    private static boolean lllIlIIIlllllll(final int lllllllllllllIIIllIIIIIIIIlIIlll) {
        return lllllllllllllIIIllIIIIIIIIlIIlll <= 0;
    }
    
    protected HttpObjectDecoder() {
        this(HttpObjectDecoder.lIlIIlllIIlllI[0], HttpObjectDecoder.lIlIIlllIIlllI[1], HttpObjectDecoder.lIlIIlllIIlllI[1], (boolean)(HttpObjectDecoder.lIlIIlllIIlllI[2] != 0));
    }
    
    private static boolean lllIlIIlIIIllIl(final int lllllllllllllIIIllIIIIIIIIlIlIIl) {
        return lllllllllllllIIIllIIIIIIIIlIlIIl >= 0;
    }
    
    private long contentLength() {
        if (lllIlIIlIIIIIll(lllIlIIlIIIlllI(this.contentLength, Long.MIN_VALUE))) {
            this.contentLength = HttpHeaders.getContentLength(this.message, -1L);
        }
        return this.contentLength;
    }
    
    private static int lllIlIIlIIIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIlIIlIIIIIll(final int lllllllllllllIIIllIIIIIIIIlIlIll) {
        return lllllllllllllIIIllIIIIIIIIlIlIll == 0;
    }
    
    private void reset() {
        final HttpMessage lllllllllllllIIIllIIIIIlIIllIIIl = this.message;
        this.message = null;
        this.contentLength = Long.MIN_VALUE;
        if (lllIlIIlIIIIIll(this.isDecodingRequest() ? 1 : 0)) {
            final HttpResponse lllllllllllllIIIllIIIIIlIIllIIll = (HttpResponse)lllllllllllllIIIllIIIIIlIIllIIIl;
            if (lllIlIIlIIIlIIl(lllllllllllllIIIllIIIIIlIIllIIll) && lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIIllIIll.getStatus().code(), HttpObjectDecoder.lIlIIlllIIlllI[11])) {
                this.checkpoint(State.UPGRADED);
                return;
            }
        }
        this.checkpoint(State.SKIP_CONTROL_CHARS);
    }
    
    private static String[] splitHeader(final AppendableCharSequence lllllllllllllIIIllIIIIIIlIlIllll) {
        final int lllllllllllllIIIllIIIIIIlIlIlllI = lllllllllllllIIIllIIIIIIlIlIllll.length();
        int lllllllllllllIIIllIIIIIIlIlIllII;
        final int lllllllllllllIIIllIIIIIIlIlIllIl = lllllllllllllIIIllIIIIIIlIlIllII = findNonWhitespace(lllllllllllllIIIllIIIIIIlIlIllll, HttpObjectDecoder.lIlIIlllIIlllI[4]);
        while (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIlIlIllII, lllllllllllllIIIllIIIIIIlIlIlllI)) {
            final char lllllllllllllIIIllIIIIIIlIllIIII = lllllllllllllIIIllIIIIIIlIlIllll.charAt(lllllllllllllIIIllIIIIIIlIlIllII);
            if (!lllIlIIlIIIllII(lllllllllllllIIIllIIIIIIlIllIIII, HttpObjectDecoder.lIlIIlllIIlllI[21])) {
                break;
            }
            if (lllIlIIlIIIIlII(Character.isWhitespace(lllllllllllllIIIllIIIIIIlIllIIII) ? 1 : 0)) {
                "".length();
                if ((0x6F ^ 0x6B) < 0) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIIIlIlIllII;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
                continue;
            }
        }
        int lllllllllllllIIIllIIIIIIlIlIlIll = lllllllllllllIIIllIIIIIIlIlIllII;
        while (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIlIlIlIll, lllllllllllllIIIllIIIIIIlIlIlllI)) {
            if (lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIIlIlIllll.charAt(lllllllllllllIIIllIIIIIIlIlIlIll), HttpObjectDecoder.lIlIIlllIIlllI[21])) {
                ++lllllllllllllIIIllIIIIIIlIlIlIll;
                "".length();
                if ("   ".length() >= (0x1 ^ 0x5)) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIIIlIlIlIll;
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        final int lllllllllllllIIIllIIIIIIlIlIlIlI = findNonWhitespace(lllllllllllllIIIllIIIIIIlIlIllll, lllllllllllllIIIllIIIIIIlIlIlIll);
        if (lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIIlIlIlIlI, lllllllllllllIIIllIIIIIIlIlIlllI)) {
            final String[] array = new String[HttpObjectDecoder.lIlIIlllIIlllI[5]];
            array[HttpObjectDecoder.lIlIIlllIIlllI[4]] = lllllllllllllIIIllIIIIIIlIlIllll.substring(lllllllllllllIIIllIIIIIIlIlIllIl, lllllllllllllIIIllIIIIIIlIlIllII);
            array[HttpObjectDecoder.lIlIIlllIIlllI[2]] = HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[14]];
            return array;
        }
        final int lllllllllllllIIIllIIIIIIlIlIlIIl = findEndOfString(lllllllllllllIIIllIIIIIIlIlIllll);
        final String[] array2 = new String[HttpObjectDecoder.lIlIIlllIIlllI[5]];
        array2[HttpObjectDecoder.lIlIIlllIIlllI[4]] = lllllllllllllIIIllIIIIIIlIlIllll.substring(lllllllllllllIIIllIIIIIIlIlIllIl, lllllllllllllIIIllIIIIIIlIlIllII);
        array2[HttpObjectDecoder.lIlIIlllIIlllI[2]] = lllllllllllllIIIllIIIIIIlIlIllll.substring(lllllllllllllIIIllIIIIIIlIlIlIlI, lllllllllllllIIIllIIIIIIlIlIlIIl);
        return array2;
    }
    
    private static int lllIlIIlIIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIlIIlIIIllII(final int lllllllllllllIIIllIIIIIIIIlIIIlI, final int lllllllllllllIIIllIIIIIIIIlIIIIl) {
        return lllllllllllllIIIllIIIIIIIIlIIIlI != lllllllllllllIIIllIIIIIIIIlIIIIl;
    }
    
    @Override
    protected void decodeLast(final ChannelHandlerContext lllllllllllllIIIllIIIIIlIlIIIlII, final ByteBuf lllllllllllllIIIllIIIIIlIlIIIlll, final List<Object> lllllllllllllIIIllIIIIIlIlIIIllI) throws Exception {
        this.decode(lllllllllllllIIIllIIIIIlIlIIIlII, lllllllllllllIIIllIIIIIlIlIIIlll, lllllllllllllIIIllIIIIIlIlIIIllI);
        if (lllIlIIlIIIlIIl(this.message)) {
            boolean lllllllllllllIIIllIIIIIlIlIIlIlI = false;
            if (lllIlIIlIIIIlII(this.isDecodingRequest() ? 1 : 0)) {
                final boolean lllllllllllllIIIllIIIIIlIlIIlIll = HttpObjectDecoder.lIlIIlllIIlllI[2] != 0;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                int n;
                if (lllIlIIlIIIIllI(lllIlIIlIIIlIII(this.contentLength(), 0L))) {
                    n = HttpObjectDecoder.lIlIIlllIIlllI[2];
                    "".length();
                    if ((0x6E ^ 0x45 ^ (0xE9 ^ 0xC6)) <= 0) {
                        return;
                    }
                }
                else {
                    n = HttpObjectDecoder.lIlIIlllIIlllI[4];
                }
                lllllllllllllIIIllIIIIIlIlIIlIlI = (n != 0);
            }
            this.reset();
            if (lllIlIIlIIIIIll(lllllllllllllIIIllIIIIIlIlIIlIlI ? 1 : 0)) {
                lllllllllllllIIIllIIIIIlIlIIIllI.add(LastHttpContent.EMPTY_LAST_CONTENT);
                "".length();
            }
        }
    }
    
    private static boolean lllIlIIlIIIlIIl(final Object lllllllllllllIIIllIIIIIIIIlIllll) {
        return lllllllllllllIIIllIIIIIIIIlIllll != null;
    }
    
    private static boolean lllIlIIlIIIIllI(final int lllllllllllllIIIllIIIIIIIIlIIlIl) {
        return lllllllllllllIIIllIIIIIIIIlIIlIl > 0;
    }
    
    protected boolean isContentAlwaysEmpty(final HttpMessage lllllllllllllIIIllIIIIIlIIlllIIl) {
        if (lllIlIIlIIIIlII((lllllllllllllIIIllIIIIIlIIlllIIl instanceof HttpResponse) ? 1 : 0)) {
            final HttpResponse lllllllllllllIIIllIIIIIlIIllllIl = (HttpResponse)lllllllllllllIIIllIIIIIlIIlllIIl;
            final int lllllllllllllIIIllIIIIIlIIllllII = lllllllllllllIIIllIIIIIlIIllllIl.getStatus().code();
            if (lllIlIIlIIIlIlI(lllllllllllllIIIllIIIIIlIIllllII, HttpObjectDecoder.lIlIIlllIIlllI[9]) && lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIlIIllllII, HttpObjectDecoder.lIlIIlllIIlllI[10])) {
                int n;
                if (!lllIlIIlIIIIlll(lllllllllllllIIIllIIIIIlIIllllII, HttpObjectDecoder.lIlIIlllIIlllI[11]) || lllIlIIlIIIIlII(lllllllllllllIIIllIIIIIlIIllllIl.headers().contains(HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[12]]) ? 1 : 0)) {
                    n = HttpObjectDecoder.lIlIIlllIIlllI[2];
                    "".length();
                    if ("   ".length() < 0) {
                        return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = HttpObjectDecoder.lIlIIlllIIlllI[4];
                }
                return n != 0;
            }
            switch (lllllllllllllIIIllIIIIIlIIllllII) {
                case 204:
                case 205:
                case 304: {
                    return HttpObjectDecoder.lIlIIlllIIlllI[2] != 0;
                }
            }
        }
        return HttpObjectDecoder.lIlIIlllIIlllI[4] != 0;
    }
    
    private static String lllIlIIIlllllII(final String lllllllllllllIIIllIIIIIIIllIllIl, final String lllllllllllllIIIllIIIIIIIllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIIIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIIIIIIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIIIIIIlllIIIl.init(HttpObjectDecoder.lIlIIlllIIlllI[5], lllllllllllllIIIllIIIIIIIlllIIlI);
            return new String(lllllllllllllIIIllIIIIIIIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIIIIlllIIII) {
            lllllllllllllIIIllIIIIIIIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private HttpContent invalidChunk(final Exception lllllllllllllIIIllIIIIIlIIIlllIl) {
        this.checkpoint(State.BAD_MESSAGE);
        final HttpContent lllllllllllllIIIllIIIIIlIIIlllll = new DefaultLastHttpContent(Unpooled.EMPTY_BUFFER);
        lllllllllllllIIIllIIIIIlIIIlllll.setDecoderResult(DecoderResult.failure(lllllllllllllIIIllIIIIIlIIIlllIl));
        this.message = null;
        return lllllllllllllIIIllIIIIIlIIIlllll;
    }
    
    private static String[] splitInitialLine(final AppendableCharSequence lllllllllllllIIIllIIIIIIlIllllll) {
        final int lllllllllllllIIIllIIIIIIllIIIlIl = findNonWhitespace(lllllllllllllIIIllIIIIIIlIllllll, HttpObjectDecoder.lIlIIlllIIlllI[4]);
        final int lllllllllllllIIIllIIIIIIllIIIlII = findWhitespace(lllllllllllllIIIllIIIIIIlIllllll, lllllllllllllIIIllIIIIIIllIIIlIl);
        final int lllllllllllllIIIllIIIIIIllIIIIll = findNonWhitespace(lllllllllllllIIIllIIIIIIlIllllll, lllllllllllllIIIllIIIIIIllIIIlII);
        final int lllllllllllllIIIllIIIIIIllIIIIlI = findWhitespace(lllllllllllllIIIllIIIIIIlIllllll, lllllllllllllIIIllIIIIIIllIIIIll);
        final int lllllllllllllIIIllIIIIIIllIIIIIl = findNonWhitespace(lllllllllllllIIIllIIIIIIlIllllll, lllllllllllllIIIllIIIIIIllIIIIlI);
        final int lllllllllllllIIIllIIIIIIllIIIIII = findEndOfString(lllllllllllllIIIllIIIIIIlIllllll);
        final String[] array = new String[HttpObjectDecoder.lIlIIlllIIlllI[6]];
        array[HttpObjectDecoder.lIlIIlllIIlllI[4]] = lllllllllllllIIIllIIIIIIlIllllll.substring(lllllllllllllIIIllIIIIIIllIIIlIl, lllllllllllllIIIllIIIIIIllIIIlII);
        array[HttpObjectDecoder.lIlIIlllIIlllI[2]] = lllllllllllllIIIllIIIIIIlIllllll.substring(lllllllllllllIIIllIIIIIIllIIIIll, lllllllllllllIIIllIIIIIIllIIIIlI);
        final int n = HttpObjectDecoder.lIlIIlllIIlllI[5];
        String substring;
        if (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIllIIIIIl, lllllllllllllIIIllIIIIIIllIIIIII)) {
            substring = lllllllllllllIIIllIIIIIIlIllllll.substring(lllllllllllllIIIllIIIIIIllIIIIIl, lllllllllllllIIIllIIIIIIllIIIIII);
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            substring = HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[20]];
        }
        array[n] = substring;
        return array;
    }
    
    private static boolean lllIlIIlIIIIIlI(final Object lllllllllllllIIIllIIIIIIIIllIIlI, final Object lllllllllllllIIIllIIIIIIIIllIIIl) {
        return lllllllllllllIIIllIIIIIIIIllIIlI == lllllllllllllIIIllIIIIIIIIllIIIl;
    }
    
    private static int findWhitespace(final CharSequence lllllllllllllIIIllIIIIIIlIIlIlII, final int lllllllllllllIIIllIIIIIIlIIlIIll) {
        int lllllllllllllIIIllIIIIIIlIIlIIlI = lllllllllllllIIIllIIIIIIlIIlIIll;
        while (lllIlIIlIIIIIIl(lllllllllllllIIIllIIIIIIlIIlIIlI, lllllllllllllIIIllIIIIIIlIIlIlII.length())) {
            if (lllIlIIlIIIIlII(Character.isWhitespace(lllllllllllllIIIllIIIIIIlIIlIlII.charAt(lllllllllllllIIIllIIIIIIlIIlIIlI)) ? 1 : 0)) {
                "".length();
                if (-" ".length() > (0x6D ^ 0x69)) {
                    return (0x7B ^ 0x6B) & ~(0x71 ^ 0x61);
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIIIIlIIlIIlI;
                "".length();
                if (" ".length() == 0) {
                    return (0xE2 ^ 0xC2 ^ " ".length()) & (81 + 215 - 101 + 31 ^ 47 + 80 + 61 + 7 ^ -" ".length());
                }
                continue;
            }
        }
        return lllllllllllllIIIllIIIIIIlIIlIIlI;
    }
    
    private static void lllIlIIIlllllIl() {
        (lIlIIlllIIllIl = new String[HttpObjectDecoder.lIlIIlllIIlllI[8]])[HttpObjectDecoder.lIlIIlllIIlllI[4]] = lllIlIIIllllIlI("mVNFi3De39IFKQXei+lY8X983xEBX9d/so7Qxf/iDzsoBkr2cydZfmEaWEm7is4WCf9pNTo8t6U=", "wTxfc");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[2]] = lllIlIIIllllIlI("f6NQubQkfRLmuiSQQEbH+JnolQvPMDJHERBlFcDg6KUtdfo8BwVADj5aFYLxYa2d", "NeEUS");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[5]] = lllIlIIIllllIlI("EoyMLb3FXmmkfUOnx2iPeRybJTggOv/L4+p2s2BjL/z/LJr2p6HgRQmVPu6DLsTZ", "xCpNU");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[6]] = lllIlIIIllllIlI("rIrXK26lb6hBQg3SSWmfqn21KDbuk9xpFFldbuuTz10=", "pcWFd");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[12]] = lllIlIIIllllIll("OBUCSR0OEjILKQAVFUkLCBMEFD4=", "kpadJ");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[15]] = lllIlIIIllllIlI("CP4imbhdzdbw6dGjW+KTig==", "Tnhxu");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[16]] = lllIlIIIlllllII("OaXZlkyPOKb4TPzt3+C5mE4PUs+CsagQ", "iQyLP");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[17]] = lllIlIIIllllIll("OyUQJgYKJQ==", "oWqOj");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[20]] = lllIlIIIllllIlI("xtDqnj4PKXk=", "tcxeo");
        HttpObjectDecoder.lIlIIlllIIllIl[HttpObjectDecoder.lIlIIlllIIlllI[14]] = lllIlIIIlllllII("qrLgf3Sv40w=", "EHbTI");
    }
    
    private final class LineParser implements ByteBufProcessor
    {
        private /* synthetic */ int size;
        private final /* synthetic */ AppendableCharSequence seq;
        private static final /* synthetic */ int[] lIlllllIIIlIlI;
        private static final /* synthetic */ String[] lIlllllIIIlIII;
        
        static {
            lIIIIlIlIIIllllI();
            lIIIIlIlIIIlIlll();
        }
        
        private static boolean lIIIIlIlIIIlllll(final int llllllllllllIllllIIlllIllllIlIll, final int llllllllllllIllllIIlllIllllIlIlI) {
            return llllllllllllIllllIIlllIllllIlIll == llllllllllllIllllIIlllIllllIlIlI;
        }
        
        public AppendableCharSequence parse(final ByteBuf llllllllllllIllllIIllllIIIIlIIlI) {
            this.seq.reset();
            this.size = LineParser.lIlllllIIIlIlI[0];
            final int llllllllllllIllllIIllllIIIIlIlII = llllllllllllIllllIIllllIIIIlIIlI.forEachByte(this);
            llllllllllllIllllIIllllIIIIlIIlI.readerIndex(llllllllllllIllllIIllllIIIIlIlII + LineParser.lIlllllIIIlIlI[1]);
            "".length();
            return this.seq;
        }
        
        private static String lIIIIlIlIIIlIllI(final String llllllllllllIllllIIlllIllllllllI, final String llllllllllllIllllIIlllIlllllllIl) {
            try {
                final SecretKeySpec llllllllllllIllllIIllllIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIlllllllIl.getBytes(StandardCharsets.UTF_8)), LineParser.lIlllllIIIlIlI[5]), "DES");
                final Cipher llllllllllllIllllIIllllIIIIIIIlI = Cipher.getInstance("DES");
                llllllllllllIllllIIllllIIIIIIIlI.init(LineParser.lIlllllIIIlIlI[4], llllllllllllIllllIIllllIIIIIIIll);
                return new String(llllllllllllIllllIIllllIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIllllIIIIIIIIl) {
                llllllllllllIllllIIllllIIIIIIIIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIIlIlIIIlIlll() {
            (lIlllllIIIlIII = new String[LineParser.lIlllllIIIlIlI[4]])[LineParser.lIlllllIIIlIlI[0]] = lIIIIlIlIIIlIlIl("uRMgow1I05v522avI7Aa6RHZ78DBlxM1fy2BtUZuX0Y=", "uFiQc");
            LineParser.lIlllllIIIlIII[LineParser.lIlllllIIIlIlI[1]] = lIIIIlIlIIIlIllI("PI/8s9ngQag=", "rhclR");
        }
        
        @Override
        public boolean process(final byte llllllllllllIllllIIllllIIIIIllII) throws Exception {
            final char llllllllllllIllllIIllllIIIIIlIll = (char)llllllllllllIllllIIllllIIIIIllII;
            if (lIIIIlIlIIIlllll(llllllllllllIllllIIllllIIIIIlIll, LineParser.lIlllllIIIlIlI[2])) {
                return LineParser.lIlllllIIIlIlI[1] != 0;
            }
            if (lIIIIlIlIIIlllll(llllllllllllIllllIIllllIIIIIlIll, LineParser.lIlllllIIIlIlI[3])) {
                return LineParser.lIlllllIIIlIlI[0] != 0;
            }
            if (lIIIIlIlIIlIIIII(this.size, HttpObjectDecoder.this.maxInitialLineLength)) {
                throw new TooLongFrameException(String.valueOf(new StringBuilder().append(LineParser.lIlllllIIIlIII[LineParser.lIlllllIIIlIlI[0]]).append(HttpObjectDecoder.this.maxInitialLineLength).append(LineParser.lIlllllIIIlIII[LineParser.lIlllllIIIlIlI[1]])));
            }
            this.size += LineParser.lIlllllIIIlIlI[1];
            this.seq.append(llllllllllllIllllIIllllIIIIIlIll);
            "".length();
            return LineParser.lIlllllIIIlIlI[1] != 0;
        }
        
        private static void lIIIIlIlIIIllllI() {
            (lIlllllIIIlIlI = new int[6])[0] = ((0xF ^ 0x78 ^ (0x3F ^ 0x7)) & (152 + 72 - 107 + 77 ^ 60 + 121 - 102 + 62 ^ -" ".length()));
            LineParser.lIlllllIIIlIlI[1] = " ".length();
            LineParser.lIlllllIIIlIlI[2] = (120 + 132 - 177 + 116 ^ 79 + 171 - 246 + 174);
            LineParser.lIlllllIIIlIlI[3] = (0xB0 ^ 0xBA);
            LineParser.lIlllllIIIlIlI[4] = "  ".length();
            LineParser.lIlllllIIIlIlI[5] = (131 + 44 - 94 + 75 ^ 105 + 25 - 45 + 63);
        }
        
        LineParser(final AppendableCharSequence llllllllllllIllllIIllllIIIIllIlI) {
            this.seq = llllllllllllIllllIIllllIIIIllIlI;
        }
        
        private static String lIIIIlIlIIIlIlIl(final String llllllllllllIllllIIlllIlllllIIIl, final String llllllllllllIllllIIlllIlllllIIlI) {
            try {
                final SecretKeySpec llllllllllllIllllIIlllIlllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIlllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIIlllIlllllIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllllIIlllIlllllIlIl.init(LineParser.lIlllllIIIlIlI[4], llllllllllllIllllIIlllIlllllIllI);
                return new String(llllllllllllIllllIIlllIlllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIlllIlllllIlII) {
                llllllllllllIllllIIlllIlllllIlII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIlIlIIlIIIII(final int llllllllllllIllllIIlllIllllIIlll, final int llllllllllllIllllIIlllIllllIIllI) {
            return llllllllllllIllllIIlllIllllIIlll >= llllllllllllIllllIIlllIllllIIllI;
        }
    }
    
    enum State
    {
        UPGRADED, 
        SKIP_CONTROL_CHARS, 
        READ_INITIAL, 
        BAD_MESSAGE;
        
        private static final /* synthetic */ int[] llIllIIllllIll;
        
        READ_FIXED_LENGTH_CONTENT, 
        READ_VARIABLE_LENGTH_CONTENT, 
        READ_CHUNK_SIZE, 
        READ_CHUNK_FOOTER, 
        READ_HEADER, 
        READ_CHUNKED_CONTENT, 
        READ_CHUNK_DELIMITER;
        
        private static final /* synthetic */ String[] llIllIIllllIII;
        
        static {
            lIIlIlllIlIIllII();
            lIIlIlllIlIIIlll();
            final State[] $values = new State[State.llIllIIllllIll[11]];
            $values[State.llIllIIllllIll[0]] = State.SKIP_CONTROL_CHARS;
            $values[State.llIllIIllllIll[1]] = State.READ_INITIAL;
            $values[State.llIllIIllllIll[2]] = State.READ_HEADER;
            $values[State.llIllIIllllIll[3]] = State.READ_VARIABLE_LENGTH_CONTENT;
            $values[State.llIllIIllllIll[4]] = State.READ_FIXED_LENGTH_CONTENT;
            $values[State.llIllIIllllIll[5]] = State.READ_CHUNK_SIZE;
            $values[State.llIllIIllllIll[6]] = State.READ_CHUNKED_CONTENT;
            $values[State.llIllIIllllIll[7]] = State.READ_CHUNK_DELIMITER;
            $values[State.llIllIIllllIll[8]] = State.READ_CHUNK_FOOTER;
            $values[State.llIllIIllllIll[9]] = State.BAD_MESSAGE;
            $values[State.llIllIIllllIll[10]] = State.UPGRADED;
            $VALUES = $values;
        }
        
        private static String lIIlIlllIlIIIlII(final String llllllllllllIllIIlllIllIIIlIlIlI, final String llllllllllllIllIIlllIllIIIlIlIIl) {
            try {
                final SecretKeySpec llllllllllllIllIIlllIllIIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), State.llIllIIllllIll[8]), "DES");
                final Cipher llllllllllllIllIIlllIllIIIlIlllI = Cipher.getInstance("DES");
                llllllllllllIllIIlllIllIIIlIlllI.init(State.llIllIIllllIll[2], llllllllllllIllIIlllIllIIIlIllll);
                return new String(llllllllllllIllIIlllIllIIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlllIllIIIlIllIl) {
                llllllllllllIllIIlllIllIIIlIllIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIIlIlllIlIIIllI(String llllllllllllIllIIlllIllIIIIlIlll, final String llllllllllllIllIIlllIllIIIIlIllI) {
            llllllllllllIllIIlllIllIIIIlIlll = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIllIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlllIllIIIIllIlI = new StringBuilder();
            final char[] llllllllllllIllIIlllIllIIIIllIIl = llllllllllllIllIIlllIllIIIIlIllI.toCharArray();
            int llllllllllllIllIIlllIllIIIIllIII = State.llIllIIllllIll[0];
            final Exception llllllllllllIllIIlllIllIIIIlIIlI = (Object)llllllllllllIllIIlllIllIIIIlIlll.toCharArray();
            final String llllllllllllIllIIlllIllIIIIlIIIl = (String)llllllllllllIllIIlllIllIIIIlIIlI.length;
            float llllllllllllIllIIlllIllIIIIlIIII = State.llIllIIllllIll[0];
            while (lIIlIlllIlIIllIl((int)llllllllllllIllIIlllIllIIIIlIIII, (int)llllllllllllIllIIlllIllIIIIlIIIl)) {
                final char llllllllllllIllIIlllIllIIIIlllIl = llllllllllllIllIIlllIllIIIIlIIlI[llllllllllllIllIIlllIllIIIIlIIII];
                llllllllllllIllIIlllIllIIIIllIlI.append((char)(llllllllllllIllIIlllIllIIIIlllIl ^ llllllllllllIllIIlllIllIIIIllIIl[llllllllllllIllIIlllIllIIIIllIII % llllllllllllIllIIlllIllIIIIllIIl.length]));
                "".length();
                ++llllllllllllIllIIlllIllIIIIllIII;
                ++llllllllllllIllIIlllIllIIIIlIIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlllIllIIIIllIlI);
        }
        
        private static boolean lIIlIlllIlIIllIl(final int llllllllllllIllIIlllIlIlllllllll, final int llllllllllllIllIIlllIlIllllllllI) {
            return llllllllllllIllIIlllIlIlllllllll < llllllllllllIllIIlllIlIllllllllI;
        }
        
        private static void lIIlIlllIlIIllII() {
            (llIllIIllllIll = new int[12])[0] = ((45 + 45 + 97 + 41 ^ 96 + 9 - 37 + 67) & (122 + 203 - 286 + 176 ^ 81 + 43 - 101 + 157 ^ -" ".length()));
            State.llIllIIllllIll[1] = " ".length();
            State.llIllIIllllIll[2] = "  ".length();
            State.llIllIIllllIll[3] = "   ".length();
            State.llIllIIllllIll[4] = (0xFE ^ 0xC4 ^ (0xB1 ^ 0x8F));
            State.llIllIIllllIll[5] = (56 + 29 + 40 + 33 ^ 55 + 136 - 189 + 153);
            State.llIllIIllllIll[6] = (0x86 ^ 0x80);
            State.llIllIIllllIll[7] = (29 + 53 - 33 + 122 ^ 82 + 111 - 186 + 165);
            State.llIllIIllllIll[8] = (0xB0 ^ 0xB8);
            State.llIllIIllllIll[9] = (0xDA ^ 0x9C ^ (0x4 ^ 0x4B));
            State.llIllIIllllIll[10] = (0x86 ^ 0x8C);
            State.llIllIIllllIll[11] = (0x5E ^ 0x24 ^ (0x68 ^ 0x19));
        }
        
        private static void lIIlIlllIlIIIlll() {
            (llIllIIllllIII = new String[State.llIllIIllllIll[11]])[State.llIllIIllllIll[0]] = lIIlIlllIlIIIlII("cT5kFi3E2PhGRgDLKN2p1JpJhGi3i63v", "bRkbX");
            State.llIllIIllllIII[State.llIllIIllllIll[1]] = lIIlIlllIlIIIlIl("Qw732GwKdxNJ7Le6AIi0VA==", "vnETR");
            State.llIllIIllllIII[State.llIllIIllllIll[2]] = lIIlIlllIlIIIllI("KzUqLjcxNSouLSs=", "ypkjh");
            State.llIllIIllllIII[State.llIllIIllllIll[3]] = lIIlIlllIlIIIlIl("yZ3W522VbJaiQtn5JG0/7Pz3R+58hn0qltrP0ighofE=", "CUIqM");
            State.llIllIIllllIII[State.llIllIIllllIll[4]] = lIIlIlllIlIIIllI("Jy8xDT0zIygMJiomNQclISIvCi07PjUHNg==", "ujpIb");
            State.llIllIIllllIII[State.llIllIIllllIll[5]] = lIIlIlllIlIIIllI("NSIrNB4kLz8+Cjg0IyoE", "ggjpA");
            State.llIllIIllllIII[State.llIllIIllllIll[6]] = lIIlIlllIlIIIlIl("AMi3w7FZVVILTXCoI/iu+XbB0hOwTuOW", "KtPNG");
            State.llIllIIllllIII[State.llIllIIllllIll[7]] = lIIlIlllIlIIIllI("ETY0KDMAOyAiJxw3MCAlDjohKT4=", "Csull");
            State.llIllIIllllIII[State.llIllIIllllIll[8]] = lIIlIlllIlIIIlIl("8c/t8Dn0rAkTRb0qfRQ/p9MwgskhYcRk", "JmTQC");
            State.llIllIIllllIII[State.llIllIIllllIll[9]] = lIIlIlllIlIIIlII("9mH1APLwtSyUM+VZDj6XQA==", "vjhVV");
            State.llIllIIllllIII[State.llIllIIllllIll[10]] = lIIlIlllIlIIIllI("HwUIEy0OEAs=", "JUOAl");
        }
        
        private static String lIIlIlllIlIIIlIl(final String llllllllllllIllIIlllIllIIIIIIlll, final String llllllllllllIllIIlllIllIIIIIIllI) {
            try {
                final SecretKeySpec llllllllllllIllIIlllIllIIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIllIIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlllIllIIIIIlIIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlllIllIIIIIlIIl.init(State.llIllIIllllIll[2], llllllllllllIllIIlllIllIIIIIlIlI);
                return new String(llllllllllllIllIIlllIllIIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIllIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlllIllIIIIIlIII) {
                llllllllllllIllIIlllIllIIIIIlIII.printStackTrace();
                return null;
            }
        }
    }
    
    private final class HeaderParser implements ByteBufProcessor
    {
        private static final /* synthetic */ String[] lllIlllIllIlIl;
        private final /* synthetic */ AppendableCharSequence seq;
        private static final /* synthetic */ int[] lllIllllllIIlI;
        
        private static void lIlIIlIlllIIlIlI() {
            (lllIlllIllIlIl = new String[HeaderParser.lllIllllllIIlI[4]])[HeaderParser.lllIllllllIIlI[0]] = lIlIIlIlllIIlIII("VqS5+Sx9nH5dzaQtdwqR3UPKbhN6EbQpxErbKX2kwrw=", "XXmwp");
            HeaderParser.lllIlllIllIlIl[HeaderParser.lllIllllllIIlI[1]] = lIlIIlIlllIIlIIl("czoyIRUgdg==", "SXKUp");
        }
        
        static {
            lIlIIllIIIllllII();
            lIlIIlIlllIIlIlI();
        }
        
        HeaderParser(final AppendableCharSequence llllllllllllIlIlIlllllIIIIIIIIll) {
            this.seq = llllllllllllIlIlIlllllIIIIIIIIll;
        }
        
        private static boolean lIlIIllIIIllllll(final int llllllllllllIlIlIllllIlllIlllIII, final int llllllllllllIlIlIllllIlllIllIlll) {
            return llllllllllllIlIlIllllIlllIlllIII < llllllllllllIlIlIllllIlllIllIlll;
        }
        
        private static void lIlIIllIIIllllII() {
            (lllIllllllIIlI = new int[6])[0] = ((0x17 ^ 0x74) & ~(0x29 ^ 0x4A));
            HeaderParser.lllIllllllIIlI[1] = " ".length();
            HeaderParser.lllIllllllIIlI[2] = (0x9 ^ 0x4);
            HeaderParser.lllIllllllIIlI[3] = (0x4E ^ 0x44);
            HeaderParser.lllIllllllIIlI[4] = "  ".length();
            HeaderParser.lllIllllllIIlI[5] = (72 + 126 - 99 + 44 ^ 128 + 41 - 138 + 104);
        }
        
        public AppendableCharSequence parse(final ByteBuf llllllllllllIlIlIllllIlllllllIll) {
            this.seq.reset();
            HttpObjectDecoder.this.headerSize = HeaderParser.lllIllllllIIlI[0];
            "".length();
            final int llllllllllllIlIlIllllIllllllllIl = llllllllllllIlIlIllllIlllllllIll.forEachByte(this);
            llllllllllllIlIlIllllIlllllllIll.readerIndex(llllllllllllIlIlIllllIllllllllIl + HeaderParser.lllIllllllIIlI[1]);
            "".length();
            return this.seq;
        }
        
        @Override
        public boolean process(final byte llllllllllllIlIlIllllIllllllIIlI) throws Exception {
            final char llllllllllllIlIlIllllIllllllIlII = (char)llllllllllllIlIlIllllIllllllIIlI;
            HttpObjectDecoder.this.headerSize = HttpObjectDecoder.this.headerSize;
            "".length();
            if (lIlIIllIIIllllIl(llllllllllllIlIlIllllIllllllIlII, HeaderParser.lllIllllllIIlI[2])) {
                return HeaderParser.lllIllllllIIlI[1] != 0;
            }
            if (lIlIIllIIIllllIl(llllllllllllIlIlIllllIllllllIlII, HeaderParser.lllIllllllIIlI[3])) {
                return HeaderParser.lllIllllllIIlI[0] != 0;
            }
            if (lIlIIllIIIlllllI(HttpObjectDecoder.this.headerSize, HttpObjectDecoder.this.maxHeaderSize)) {
                throw new TooLongFrameException(String.valueOf(new StringBuilder().append(HeaderParser.lllIlllIllIlIl[HeaderParser.lllIllllllIIlI[0]]).append(HttpObjectDecoder.this.maxHeaderSize).append(HeaderParser.lllIlllIllIlIl[HeaderParser.lllIllllllIIlI[1]])));
            }
            this.seq.append(llllllllllllIlIlIllllIllllllIlII);
            "".length();
            return HeaderParser.lllIllllllIIlI[1] != 0;
        }
        
        private static boolean lIlIIllIIIlllllI(final int llllllllllllIlIlIllllIlllIllllII, final int llllllllllllIlIlIllllIlllIlllIll) {
            return llllllllllllIlIlIllllIlllIllllII >= llllllllllllIlIlIllllIlllIlllIll;
        }
        
        private static String lIlIIlIlllIIlIIl(String llllllllllllIlIlIllllIllllIIllll, final String llllllllllllIlIlIllllIllllIIllIl) {
            llllllllllllIlIlIllllIllllIIllll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlIllllIllllIIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlIllllIllllIlIIll = new StringBuilder();
            final char[] llllllllllllIlIlIllllIllllIlIIlI = llllllllllllIlIlIllllIllllIIllIl.toCharArray();
            int llllllllllllIlIlIllllIllllIlIIIl = HeaderParser.lllIllllllIIlI[0];
            final float llllllllllllIlIlIllllIllllIIIlll = (Object)((String)llllllllllllIlIlIllllIllllIIllll).toCharArray();
            final int llllllllllllIlIlIllllIllllIIIlIl = llllllllllllIlIlIllllIllllIIIlll.length;
            String llllllllllllIlIlIllllIllllIIIlII = (String)HeaderParser.lllIllllllIIlI[0];
            while (lIlIIllIIIllllll((int)llllllllllllIlIlIllllIllllIIIlII, llllllllllllIlIlIllllIllllIIIlIl)) {
                final char llllllllllllIlIlIllllIllllIllIII = llllllllllllIlIlIllllIllllIIIlll[llllllllllllIlIlIllllIllllIIIlII];
                llllllllllllIlIlIllllIllllIlIIll.append((char)(llllllllllllIlIlIllllIllllIllIII ^ llllllllllllIlIlIllllIllllIlIIlI[llllllllllllIlIlIllllIllllIlIIIl % llllllllllllIlIlIllllIllllIlIIlI.length]));
                "".length();
                ++llllllllllllIlIlIllllIllllIlIIIl;
                ++llllllllllllIlIlIllllIllllIIIlII;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlIllllIllllIlIIll);
        }
        
        private static String lIlIIlIlllIIlIII(final String llllllllllllIlIlIllllIlllllIlIIl, final String llllllllllllIlIlIllllIlllllIlIII) {
            try {
                final SecretKeySpec llllllllllllIlIlIllllIlllllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIlllllIlIII.getBytes(StandardCharsets.UTF_8)), HeaderParser.lllIllllllIIlI[5]), "DES");
                final Cipher llllllllllllIlIlIllllIlllllIlIll = Cipher.getInstance("DES");
                llllllllllllIlIlIllllIlllllIlIll.init(HeaderParser.lllIllllllIIlI[4], llllllllllllIlIlIllllIlllllIllII);
                return new String(llllllllllllIlIlIllllIlllllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIlllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlIllllIlllllIlIlI) {
                llllllllllllIlIlIllllIlllllIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIIllIIIllllIl(final int llllllllllllIlIlIllllIllllIIIIII, final int llllllllllllIlIlIllllIlllIllllll) {
            return llllllllllllIlIlIllllIllllIIIIII == llllllllllllIlIlIllllIlllIllllll;
        }
    }
}
