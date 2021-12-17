// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class LineBasedFrameDecoder extends ByteToMessageDecoder
{
    private final /* synthetic */ boolean failFast;
    private /* synthetic */ int discardedBytes;
    private static final /* synthetic */ String[] lllIIIIlIlIlll;
    private final /* synthetic */ boolean stripDelimiter;
    private final /* synthetic */ int maxLength;
    private /* synthetic */ boolean discarding;
    private static final /* synthetic */ int[] lllIIIIlIllIII;
    
    private static void lIIlllIIlIIlIIll() {
        (lllIIIIlIllIII = new int[9])[0] = " ".length();
        LineBasedFrameDecoder.lllIIIIlIllIII[1] = ((0x71 ^ 0x24) & ~(0x36 ^ 0x63));
        LineBasedFrameDecoder.lllIIIIlIllIII[2] = (0xAE ^ 0xA3);
        LineBasedFrameDecoder.lllIIIIlIllIII[3] = "  ".length();
        LineBasedFrameDecoder.lllIIIIlIllIII[4] = (0x7F ^ 0x5D ^ (0xA9 ^ 0xA2));
        LineBasedFrameDecoder.lllIIIIlIllIII[5] = (0x78 ^ 0x72);
        LineBasedFrameDecoder.lllIIIIlIllIII[6] = -" ".length();
        LineBasedFrameDecoder.lllIIIIlIllIII[7] = "   ".length();
        LineBasedFrameDecoder.lllIIIIlIllIII[8] = (0x3 ^ 0xB ^ ((0x5 ^ 0x26) & ~(0xA8 ^ 0x8B)));
    }
    
    private void fail(final ChannelHandlerContext llllllllllllIllIIIIlIllIllIlllIl, final String llllllllllllIllIIIIlIllIllIlllII) {
        llllllllllllIllIIIIlIllIllIlllIl.fireExceptionCaught(new TooLongFrameException(String.valueOf(new StringBuilder().append(LineBasedFrameDecoder.lllIIIIlIlIlll[LineBasedFrameDecoder.lllIIIIlIllIII[0]]).append(llllllllllllIllIIIIlIllIllIlllII).append(LineBasedFrameDecoder.lllIIIIlIlIlll[LineBasedFrameDecoder.lllIIIIlIllIII[3]]).append(this.maxLength).append((char)LineBasedFrameDecoder.lllIIIIlIllIII[4]))));
        "".length();
    }
    
    private static boolean lIIlllIIlIIlIllI(final int llllllllllllIllIIIIlIllIlIIlIlll) {
        return llllllllllllIllIIIIlIllIlIIlIlll >= 0;
    }
    
    private static int findEndOfLine(final ByteBuf llllllllllllIllIIIIlIllIllIlIlIl) {
        final int llllllllllllIllIIIIlIllIllIlIlII = llllllllllllIllIIIIlIllIllIlIlIl.writerIndex();
        int llllllllllllIllIIIIlIllIllIlIllI = llllllllllllIllIIIIlIllIllIlIlIl.readerIndex();
        while (lIIlllIIlIIllIlI(llllllllllllIllIIIIlIllIllIlIllI, llllllllllllIllIIIIlIllIllIlIlII)) {
            final byte llllllllllllIllIIIIlIllIllIlIlll = llllllllllllIllIIIIlIllIllIlIlIl.getByte(llllllllllllIllIIIIlIllIllIlIllI);
            if (lIIlllIIlIIlIlll(llllllllllllIllIIIIlIllIllIlIlll, LineBasedFrameDecoder.lllIIIIlIllIII[5])) {
                return llllllllllllIllIIIIlIllIllIlIllI;
            }
            if (lIIlllIIlIIlIlll(llllllllllllIllIIIIlIllIllIlIlll, LineBasedFrameDecoder.lllIIIIlIllIII[2]) && lIIlllIIlIIllIlI(llllllllllllIllIIIIlIllIllIlIllI, llllllllllllIllIIIIlIllIllIlIlII - LineBasedFrameDecoder.lllIIIIlIllIII[0]) && lIIlllIIlIIlIlll(llllllllllllIllIIIIlIllIllIlIlIl.getByte(llllllllllllIllIIIIlIllIllIlIllI + LineBasedFrameDecoder.lllIIIIlIllIII[0]), LineBasedFrameDecoder.lllIIIIlIllIII[5])) {
                return llllllllllllIllIIIIlIllIllIlIllI;
            }
            ++llllllllllllIllIIIIlIllIllIlIllI;
            "".length();
            if (((0xC ^ 0x3D) & ~(0x77 ^ 0x46)) < 0) {
                return (0x34 ^ 0x1E) & ~(0x76 ^ 0x5C);
            }
        }
        return LineBasedFrameDecoder.lllIIIIlIllIII[6];
    }
    
    @Override
    protected final void decode(final ChannelHandlerContext llllllllllllIllIIIIlIlllIIIIlIlI, final ByteBuf llllllllllllIllIIIIlIlllIIIIlllI, final List<Object> llllllllllllIllIIIIlIlllIIIIlIII) throws Exception {
        final Object llllllllllllIllIIIIlIlllIIIIllII = this.decode(llllllllllllIllIIIIlIlllIIIIlIlI, llllllllllllIllIIIIlIlllIIIIlllI);
        if (lIIlllIIlIIlIlII(llllllllllllIllIIIIlIlllIIIIllII)) {
            llllllllllllIllIIIIlIlllIIIIlIII.add(llllllllllllIllIIIIlIlllIIIIllII);
            "".length();
        }
    }
    
    private static String lIIlllIIlIIlIIII(final String llllllllllllIllIIIIlIllIlIlIlllI, final String llllllllllllIllIIIIlIllIlIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIllIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8)), LineBasedFrameDecoder.lllIIIIlIllIII[8]), "DES");
            final Cipher llllllllllllIllIIIIlIllIlIllIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIllIlIllIIlI.init(LineBasedFrameDecoder.lllIIIIlIllIII[3], llllllllllllIllIIIIlIllIlIllIIll);
            return new String(llllllllllllIllIIIIlIllIlIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIllIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIllIlIllIIIl) {
            llllllllllllIllIIIIlIllIlIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIlIIlIlIl(final int llllllllllllIllIIIIlIllIlIIllIIl) {
        return llllllllllllIllIIIIlIllIlIIllIIl == 0;
    }
    
    private static boolean lIIlllIIlIIlIlll(final int llllllllllllIllIIIIlIllIlIlIlIII, final int llllllllllllIllIIIIlIllIlIlIIlll) {
        return llllllllllllIllIIIIlIllIlIlIlIII == llllllllllllIllIIIIlIllIlIlIIlll;
    }
    
    protected Object decode(final ChannelHandlerContext llllllllllllIllIIIIlIllIllllIIll, final ByteBuf llllllllllllIllIIIIlIllIllllIIlI) throws Exception {
        final int llllllllllllIllIIIIlIllIllllIlIl = findEndOfLine(llllllllllllIllIIIIlIllIllllIIlI);
        if (!lIIlllIIlIIlIlIl(this.discarding ? 1 : 0)) {
            if (lIIlllIIlIIlIllI(llllllllllllIllIIIIlIllIllllIlIl)) {
                final int llllllllllllIllIIIIlIllIlllllIlI = this.discardedBytes + llllllllllllIllIIIIlIllIllllIlIl - llllllllllllIllIIIIlIllIllllIIlI.readerIndex();
                int n;
                if (lIIlllIIlIIlIlll(llllllllllllIllIIIIlIllIllllIIlI.getByte(llllllllllllIllIIIIlIllIllllIlIl), LineBasedFrameDecoder.lllIIIIlIllIII[2])) {
                    n = LineBasedFrameDecoder.lllIIIIlIllIII[3];
                    "".length();
                    if (-" ".length() > ("   ".length() ^ (0x8F ^ 0x88))) {
                        return null;
                    }
                }
                else {
                    n = LineBasedFrameDecoder.lllIIIIlIllIII[0];
                }
                final int llllllllllllIllIIIIlIllIlllllIIl = n;
                llllllllllllIllIIIIlIllIllllIIlI.readerIndex(llllllllllllIllIIIIlIllIllllIlIl + llllllllllllIllIIIIlIllIlllllIIl);
                "".length();
                this.discardedBytes = LineBasedFrameDecoder.lllIIIIlIllIII[1];
                this.discarding = (LineBasedFrameDecoder.lllIIIIlIllIII[1] != 0);
                if (lIIlllIIlIIlIlIl(this.failFast ? 1 : 0)) {
                    this.fail(llllllllllllIllIIIIlIllIllllIIll, llllllllllllIllIIIIlIllIlllllIlI);
                }
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            else {
                this.discardedBytes = llllllllllllIllIIIIlIllIllllIIlI.readableBytes();
                llllllllllllIllIIIIlIllIllllIIlI.readerIndex(llllllllllllIllIIIIlIllIllllIIlI.writerIndex());
                "".length();
            }
            return null;
        }
        if (!lIIlllIIlIIlIllI(llllllllllllIllIIIIlIllIllllIlIl)) {
            final int llllllllllllIllIIIIlIllIlllllIll = llllllllllllIllIIIIlIllIllllIIlI.readableBytes();
            if (lIIlllIIlIIllIII(llllllllllllIllIIIIlIllIlllllIll, this.maxLength)) {
                this.discardedBytes = llllllllllllIllIIIIlIllIlllllIll;
                llllllllllllIllIIIIlIllIllllIIlI.readerIndex(llllllllllllIllIIIIlIllIllllIIlI.writerIndex());
                "".length();
                this.discarding = (LineBasedFrameDecoder.lllIIIIlIllIII[0] != 0);
                if (lIIlllIIlIIllIIl(this.failFast ? 1 : 0)) {
                    this.fail(llllllllllllIllIIIIlIllIllllIIll, String.valueOf(new StringBuilder().append(LineBasedFrameDecoder.lllIIIIlIlIlll[LineBasedFrameDecoder.lllIIIIlIllIII[1]]).append(this.discardedBytes)));
                }
            }
            return null;
        }
        final int llllllllllllIllIIIIlIllIllllllIl = llllllllllllIllIIIIlIllIllllIlIl - llllllllllllIllIIIIlIllIllllIIlI.readerIndex();
        int n2;
        if (lIIlllIIlIIlIlll(llllllllllllIllIIIIlIllIllllIIlI.getByte(llllllllllllIllIIIIlIllIllllIlIl), LineBasedFrameDecoder.lllIIIIlIllIII[2])) {
            n2 = LineBasedFrameDecoder.lllIIIIlIllIII[3];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            n2 = LineBasedFrameDecoder.lllIIIIlIllIII[0];
        }
        final int llllllllllllIllIIIIlIllIllllllII = n2;
        if (lIIlllIIlIIllIII(llllllllllllIllIIIIlIllIllllllIl, this.maxLength)) {
            llllllllllllIllIIIIlIllIllllIIlI.readerIndex(llllllllllllIllIIIIlIllIllllIlIl + llllllllllllIllIIIIlIllIllllllII);
            "".length();
            this.fail(llllllllllllIllIIIIlIllIllllIIll, llllllllllllIllIIIIlIllIllllllIl);
            return null;
        }
        ByteBuf llllllllllllIllIIIIlIllIlllllllI = null;
        if (lIIlllIIlIIllIIl(this.stripDelimiter ? 1 : 0)) {
            final ByteBuf llllllllllllIllIIIIlIllIllllllll = llllllllllllIllIIIIlIllIllllIIlI.readSlice(llllllllllllIllIIIIlIllIllllllIl);
            llllllllllllIllIIIIlIllIllllIIlI.skipBytes(llllllllllllIllIIIIlIllIllllllII);
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIIIIlIllIlllllllI = llllllllllllIllIIIIlIllIllllIIlI.readSlice(llllllllllllIllIIIIlIllIllllllIl + llllllllllllIllIIIIlIllIllllllII);
        }
        return llllllllllllIllIIIIlIllIlllllllI.retain();
    }
    
    public LineBasedFrameDecoder(final int llllllllllllIllIIIIlIlllIIIlllII, final boolean llllllllllllIllIIIIlIlllIIIlIlll, final boolean llllllllllllIllIIIIlIlllIIIlIllI) {
        this.maxLength = llllllllllllIllIIIIlIlllIIIlllII;
        this.failFast = llllllllllllIllIIIIlIlllIIIlIllI;
        this.stripDelimiter = llllllllllllIllIIIIlIlllIIIlIlll;
    }
    
    private static boolean lIIlllIIlIIlIlII(final Object llllllllllllIllIIIIlIllIlIIlllIl) {
        return llllllllllllIllIIIIlIllIlIIlllIl != null;
    }
    
    public LineBasedFrameDecoder(final int llllllllllllIllIIIIlIlllIIlIIlII) {
        this(llllllllllllIllIIIIlIlllIIlIIlII, (boolean)(LineBasedFrameDecoder.lllIIIIlIllIII[0] != 0), (boolean)(LineBasedFrameDecoder.lllIIIIlIllIII[1] != 0));
    }
    
    static {
        lIIlllIIlIIlIIll();
        lIIlllIIlIIlIIlI();
    }
    
    private static boolean lIIlllIIlIIllIlI(final int llllllllllllIllIIIIlIllIlIlIIlII, final int llllllllllllIllIIIIlIllIlIlIIIll) {
        return llllllllllllIllIIIIlIllIlIlIIlII < llllllllllllIllIIIIlIllIlIlIIIll;
    }
    
    private static void lIIlllIIlIIlIIlI() {
        (lllIIIIlIlIlll = new String[LineBasedFrameDecoder.lllIIIIlIllIII[7]])[LineBasedFrameDecoder.lllIIIIlIllIII[1]] = lIIlllIIlIIlIIII("yi8fNYFkfdE=", "aQwgi");
        LineBasedFrameDecoder.lllIIIIlIlIlll[LineBasedFrameDecoder.lllIIIIlIllIII[0]] = lIIlllIIlIIlIIII("umkwqdXiX/NcVKEjcmM2tw==", "MojNy");
        LineBasedFrameDecoder.lllIIIIlIlIlll[LineBasedFrameDecoder.lllIIIIlIllIII[3]] = lIIlllIIlIIlIIIl("TWkGMRUBLAc6VhAhBmkXCCUMPhMAaQ4oDg0kFiRWTA==", "dIcIv");
    }
    
    private static boolean lIIlllIIlIIllIIl(final int llllllllllllIllIIIIlIllIlIIllIll) {
        return llllllllllllIllIIIIlIllIlIIllIll != 0;
    }
    
    private static boolean lIIlllIIlIIllIII(final int llllllllllllIllIIIIlIllIlIlIIIII, final int llllllllllllIllIIIIlIllIlIIlllll) {
        return llllllllllllIllIIIIlIllIlIlIIIII > llllllllllllIllIIIIlIllIlIIlllll;
    }
    
    private void fail(final ChannelHandlerContext llllllllllllIllIIIIlIllIlllIlIIl, final int llllllllllllIllIIIIlIllIlllIlIII) {
        this.fail(llllllllllllIllIIIIlIllIlllIlIIl, String.valueOf(llllllllllllIllIIIIlIllIlllIlIII));
    }
    
    private static String lIIlllIIlIIlIIIl(String llllllllllllIllIIIIlIllIllIIIIII, final String llllllllllllIllIIIIlIllIlIllllll) {
        llllllllllllIllIIIIlIllIllIIIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIllIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIllIllIIIIll = new StringBuilder();
        final char[] llllllllllllIllIIIIlIllIllIIIIlI = llllllllllllIllIIIIlIllIlIllllll.toCharArray();
        int llllllllllllIllIIIIlIllIllIIIIIl = LineBasedFrameDecoder.lllIIIIlIllIII[1];
        final boolean llllllllllllIllIIIIlIllIlIlllIll = (Object)llllllllllllIllIIIIlIllIllIIIIII.toCharArray();
        final long llllllllllllIllIIIIlIllIlIlllIlI = llllllllllllIllIIIIlIllIlIlllIll.length;
        byte llllllllllllIllIIIIlIllIlIlllIIl = (byte)LineBasedFrameDecoder.lllIIIIlIllIII[1];
        while (lIIlllIIlIIllIlI(llllllllllllIllIIIIlIllIlIlllIIl, (int)llllllllllllIllIIIIlIllIlIlllIlI)) {
            final char llllllllllllIllIIIIlIllIllIIIllI = llllllllllllIllIIIIlIllIlIlllIll[llllllllllllIllIIIIlIllIlIlllIIl];
            llllllllllllIllIIIIlIllIllIIIIll.append((char)(llllllllllllIllIIIIlIllIllIIIllI ^ llllllllllllIllIIIIlIllIllIIIIlI[llllllllllllIllIIIIlIllIllIIIIIl % llllllllllllIllIIIIlIllIllIIIIlI.length]));
            "".length();
            ++llllllllllllIllIIIIlIllIllIIIIIl;
            ++llllllllllllIllIIIIlIllIlIlllIIl;
            "".length();
            if ((0xD0 ^ 0x82 ^ (0xF4 ^ 0xA2)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIllIllIIIIll);
    }
}
