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
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;

public class DelimiterBasedFrameDecoder extends ByteToMessageDecoder
{
    private static final /* synthetic */ String[] llIlllIIIIllII;
    private /* synthetic */ boolean discardingTooLongFrame;
    private final /* synthetic */ boolean failFast;
    private /* synthetic */ int tooLongFrameLength;
    private static final /* synthetic */ int[] llIlllIIlIllll;
    private final /* synthetic */ boolean stripDelimiter;
    private final /* synthetic */ ByteBuf[] delimiters;
    private final /* synthetic */ LineBasedFrameDecoder lineBasedDecoder;
    private final /* synthetic */ int maxFrameLength;
    
    private static int lIIllIIlIlllIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIllIIlIllIlIIl() {
        (llIlllIIlIllll = new int[14])[0] = " ".length();
        DelimiterBasedFrameDecoder.llIlllIIlIllll[1] = ("  ".length() & ~"  ".length());
        DelimiterBasedFrameDecoder.llIlllIIlIllll[2] = "  ".length();
        DelimiterBasedFrameDecoder.llIlllIIlIllll[3] = (0x8A ^ 0x87);
        DelimiterBasedFrameDecoder.llIlllIIlIllll[4] = (0xAC ^ 0x8D ^ (0x15 ^ 0x3E));
        DelimiterBasedFrameDecoder.llIlllIIlIllll[5] = (-1 & Integer.MAX_VALUE);
        DelimiterBasedFrameDecoder.llIlllIIlIllll[6] = "   ".length();
        DelimiterBasedFrameDecoder.llIlllIIlIllll[7] = (0x80 ^ 0x84);
        DelimiterBasedFrameDecoder.llIlllIIlIllll[8] = (76 + 82 - 95 + 91 ^ 142 + 119 - 179 + 77);
        DelimiterBasedFrameDecoder.llIlllIIlIllll[9] = (0x44 ^ 0x12 ^ (0x38 ^ 0x68));
        DelimiterBasedFrameDecoder.llIlllIIlIllll[10] = -" ".length();
        DelimiterBasedFrameDecoder.llIlllIIlIllll[11] = (0x6B ^ 0x6C);
        DelimiterBasedFrameDecoder.llIlllIIlIllll[12] = (((0xD6 ^ 0x9E) & ~(0x0 ^ 0x48)) ^ (0xC ^ 0x4));
        DelimiterBasedFrameDecoder.llIlllIIlIllll[13] = (0xB4 ^ 0xBD);
    }
    
    private static boolean lIIllIIlIlllIlIl(final int llllllllllllIllIIlIIllIlIIIlIIII) {
        return llllllllllllIllIIlIIllIlIIIlIIII > 0;
    }
    
    private static boolean lIIllIIlIllIllII(final int llllllllllllIllIIlIIllIlIIIllIII) {
        return llllllllllllIllIIlIIllIlIIIllIII != 0;
    }
    
    protected Object decode(final ChannelHandlerContext llllllllllllIllIIlIIllIllIIIIIll, final ByteBuf llllllllllllIllIIlIIllIllIIIIlll) throws Exception {
        if (lIIllIIlIlllIIIl(this.lineBasedDecoder)) {
            return this.lineBasedDecoder.decode(llllllllllllIllIIlIIllIllIIIIIll, llllllllllllIllIIlIIllIllIIIIlll);
        }
        int llllllllllllIllIIlIIllIllIIIIllI = DelimiterBasedFrameDecoder.llIlllIIlIllll[5];
        ByteBuf llllllllllllIllIIlIIllIllIIIIlIl = null;
        final ByteBuf[] llllllllllllIllIIlIIllIllIIlIIII = this.delimiters;
        final int llllllllllllIllIIlIIllIllIIIllll = llllllllllllIllIIlIIllIllIIlIIII.length;
        int llllllllllllIllIIlIIllIllIIIlllI = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
        while (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIllIIIlllI, llllllllllllIllIIlIIllIllIIIllll)) {
            final ByteBuf llllllllllllIllIIlIIllIllIIlIIIl = llllllllllllIllIIlIIllIllIIlIIII[llllllllllllIllIIlIIllIllIIIlllI];
            final int llllllllllllIllIIlIIllIllIIlIIlI = indexOf(llllllllllllIllIIlIIllIllIIIIlll, llllllllllllIllIIlIIllIllIIlIIIl);
            if (lIIllIIlIlllIIlI(llllllllllllIllIIlIIllIllIIlIIlI) && lIIllIIlIllIllIl(llllllllllllIllIIlIIllIllIIlIIlI, llllllllllllIllIIlIIllIllIIIIllI)) {
                llllllllllllIllIIlIIllIllIIIIllI = llllllllllllIllIIlIIllIllIIlIIlI;
                llllllllllllIllIIlIIllIllIIIIlIl = llllllllllllIllIIlIIllIllIIlIIIl;
            }
            ++llllllllllllIllIIlIIllIllIIIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        if (!lIIllIIlIlllIIIl(llllllllllllIllIIlIIllIllIIIIlIl)) {
            if (lIIllIIlIllIlIll(this.discardingTooLongFrame ? 1 : 0)) {
                if (lIIllIIlIlllIIll(llllllllllllIllIIlIIllIllIIIIlll.readableBytes(), this.maxFrameLength)) {
                    this.tooLongFrameLength = llllllllllllIllIIlIIllIllIIIIlll.readableBytes();
                    llllllllllllIllIIlIIllIllIIIIlll.skipBytes(llllllllllllIllIIlIIllIllIIIIlll.readableBytes());
                    "".length();
                    this.discardingTooLongFrame = (DelimiterBasedFrameDecoder.llIlllIIlIllll[0] != 0);
                    if (lIIllIIlIllIllII(this.failFast ? 1 : 0)) {
                        this.fail(this.tooLongFrameLength);
                        "".length();
                        if ("   ".length() < "  ".length()) {
                            return null;
                        }
                    }
                }
            }
            else {
                this.tooLongFrameLength += llllllllllllIllIIlIIllIllIIIIlll.readableBytes();
                llllllllllllIllIIlIIllIllIIIIlll.skipBytes(llllllllllllIllIIlIIllIllIIIIlll.readableBytes());
                "".length();
            }
            return null;
        }
        final int llllllllllllIllIIlIIllIllIIIlIll = llllllllllllIllIIlIIllIllIIIIlIl.capacity();
        if (lIIllIIlIllIllII(this.discardingTooLongFrame ? 1 : 0)) {
            this.discardingTooLongFrame = (DelimiterBasedFrameDecoder.llIlllIIlIllll[1] != 0);
            llllllllllllIllIIlIIllIllIIIIlll.skipBytes(llllllllllllIllIIlIIllIllIIIIllI + llllllllllllIllIIlIIllIllIIIlIll);
            "".length();
            final int llllllllllllIllIIlIIllIllIIIllIl = this.tooLongFrameLength;
            this.tooLongFrameLength = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
            if (lIIllIIlIllIlIll(this.failFast ? 1 : 0)) {
                this.fail(llllllllllllIllIIlIIllIllIIIllIl);
            }
            return null;
        }
        if (lIIllIIlIlllIIll(llllllllllllIllIIlIIllIllIIIIllI, this.maxFrameLength)) {
            llllllllllllIllIIlIIllIllIIIIlll.skipBytes(llllllllllllIllIIlIIllIllIIIIllI + llllllllllllIllIIlIIllIllIIIlIll);
            "".length();
            this.fail(llllllllllllIllIIlIIllIllIIIIllI);
            return null;
        }
        ByteBuf llllllllllllIllIIlIIllIllIIIlIlI = null;
        if (lIIllIIlIllIllII(this.stripDelimiter ? 1 : 0)) {
            final ByteBuf llllllllllllIllIIlIIllIllIIIllII = llllllllllllIllIIlIIllIllIIIIlll.readSlice(llllllllllllIllIIlIIllIllIIIIllI);
            llllllllllllIllIIlIIllIllIIIIlll.skipBytes(llllllllllllIllIIlIIllIllIIIlIll);
            "".length();
            "".length();
            if ((0x68 ^ 0x6D) == 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIllIIlIIllIllIIIlIlI = llllllllllllIllIIlIIllIllIIIIlll.readSlice(llllllllllllIllIIlIIllIllIIIIllI + llllllllllllIllIIlIIllIllIIIlIll);
        }
        return llllllllllllIllIIlIIllIllIIIlIlI.retain();
    }
    
    private static boolean lIIllIIlIlllIIlI(final int llllllllllllIllIIlIIllIlIIIlIlII) {
        return llllllllllllIllIIlIIllIlIIIlIlII >= 0;
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIllllIIlIl, final boolean llllllllllllIllIIlIIllIllllIlIIl, final boolean llllllllllllIllIIlIIllIllllIlIII, final ByteBuf llllllllllllIllIIlIIllIllllIIIlI) {
        final ByteBuf[] llllllllllllIllIIlIIllIllIlllIlI = new ByteBuf[DelimiterBasedFrameDecoder.llIlllIIlIllll[0]];
        llllllllllllIllIIlIIllIllIlllIlI[DelimiterBasedFrameDecoder.llIlllIIlIllll[1]] = llllllllllllIllIIlIIllIllllIIIlI.slice(llllllllllllIllIIlIIllIllllIIIlI.readerIndex(), llllllllllllIllIIlIIllIllllIIIlI.readableBytes());
        this(llllllllllllIllIIlIIllIllllIIlIl, llllllllllllIllIIlIIllIllllIlIIl, llllllllllllIllIIlIIllIllllIlIII, llllllllllllIllIIlIIllIllIlllIlI);
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIlllIllIlI, final ByteBuf... llllllllllllIllIIlIIllIlllIlllII) {
        this(llllllllllllIllIIlIIllIlllIllIlI, (boolean)(DelimiterBasedFrameDecoder.llIlllIIlIllll[0] != 0), llllllllllllIllIIlIIllIlllIlllII);
    }
    
    private static boolean lIIllIIlIllIllIl(final int llllllllllllIllIIlIIllIlIIlIIlll, final int llllllllllllIllIIlIIllIlIIlIIllI) {
        return llllllllllllIllIIlIIllIlIIlIIlll < llllllllllllIllIIlIIllIlIIlIIllI;
    }
    
    private static int indexOf(final ByteBuf llllllllllllIllIIlIIllIlIllIlIlI, final ByteBuf llllllllllllIllIIlIIllIlIllIlIIl) {
        int llllllllllllIllIIlIIllIlIllIllIl = llllllllllllIllIIlIIllIlIllIlIlI.readerIndex();
        while (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIlIllIllIl, llllllllllllIllIIlIIllIlIllIlIlI.writerIndex())) {
            int llllllllllllIllIIlIIllIlIllIllll = llllllllllllIllIIlIIllIlIllIllIl;
            int llllllllllllIllIIlIIllIlIllIlllI = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
            while (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIlIllIlllI, llllllllllllIllIIlIIllIlIllIlIIl.capacity())) {
                if (lIIllIIlIllIlllI(llllllllllllIllIIlIIllIlIllIlIlI.getByte(llllllllllllIllIIlIIllIlIllIllll), llllllllllllIllIIlIIllIlIllIlIIl.getByte(llllllllllllIllIIlIIllIlIllIlllI))) {
                    "".length();
                    if ((0x60 ^ 0x47 ^ (0x98 ^ 0xBB)) <= ((64 + 120 - 149 + 146 ^ 11 + 109 - 66 + 100) & (0xAD ^ 0xA7 ^ (0x3D ^ 0x18) ^ -" ".length()))) {
                        return (0xC ^ 0x7C ^ (0x58 ^ 0x8)) & (33 + 82 + 64 + 45 ^ 127 + 102 - 82 + 45 ^ -" ".length());
                    }
                    break;
                }
                else {
                    if (lIIllIIlIllIllll(++llllllllllllIllIIlIIllIlIllIllll, llllllllllllIllIIlIIllIlIllIlIlI.writerIndex()) && lIIllIIlIllIlllI(llllllllllllIllIIlIIllIlIllIlllI, llllllllllllIllIIlIIllIlIllIlIIl.capacity() - DelimiterBasedFrameDecoder.llIlllIIlIllll[0])) {
                        return DelimiterBasedFrameDecoder.llIlllIIlIllll[10];
                    }
                    ++llllllllllllIllIIlIIllIlIllIlllI;
                    "".length();
                    if (((0x14 ^ 0x3C) & ~(0x1 ^ 0x29)) >= "   ".length()) {
                        return (0xA4 ^ 0xBF) & ~(0x6E ^ 0x75);
                    }
                    continue;
                }
            }
            if (lIIllIIlIllIllll(llllllllllllIllIIlIIllIlIllIlllI, llllllllllllIllIIlIIllIlIllIlIIl.capacity())) {
                return llllllllllllIllIIlIIllIlIllIllIl - llllllllllllIllIIlIIllIlIllIlIlI.readerIndex();
            }
            ++llllllllllllIllIIlIIllIlIllIllIl;
            "".length();
            if (((0x30 ^ 0x22) & ~(0x5A ^ 0x48)) == -" ".length()) {
                return (0x36 ^ 0x13) & ~(0x21 ^ 0x4);
            }
        }
        return DelimiterBasedFrameDecoder.llIlllIIlIllll[10];
    }
    
    private static boolean lIIllIIlIlllIIIl(final Object llllllllllllIllIIlIIllIlIIIlllII) {
        return llllllllllllIllIIlIIllIlIIIlllII != null;
    }
    
    private static void validateDelimiter(final ByteBuf llllllllllllIllIIlIIllIlIllIIIll) {
        if (lIIllIIlIllIlIlI(llllllllllllIllIIlIIllIlIllIIIll)) {
            throw new NullPointerException(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[11]]);
        }
        if (lIIllIIlIllIlIll(llllllllllllIllIIlIIllIlIllIIIll.isReadable() ? 1 : 0)) {
            throw new IllegalArgumentException(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[12]]);
        }
    }
    
    private static boolean lIIllIIlIllIlIlI(final Object llllllllllllIllIIlIIllIlIIIllIlI) {
        return llllllllllllIllIIlIIllIlIIIllIlI == null;
    }
    
    @Override
    protected final void decode(final ChannelHandlerContext llllllllllllIllIIlIIllIllIlIIIII, final ByteBuf llllllllllllIllIIlIIllIllIIlllll, final List<Object> llllllllllllIllIIlIIllIllIIllllI) throws Exception {
        final Object llllllllllllIllIIlIIllIllIlIIIlI = this.decode(llllllllllllIllIIlIIllIllIlIIIII, llllllllllllIllIIlIIllIllIIlllll);
        if (lIIllIIlIlllIIIl(llllllllllllIllIIlIIllIllIlIIIlI)) {
            llllllllllllIllIIlIIllIllIIllllI.add(llllllllllllIllIIlIIllIllIlIIIlI);
            "".length();
        }
    }
    
    private static void validateMaxFrameLength(final int llllllllllllIllIIlIIllIlIllIIIIl) {
        if (lIIllIIlIlllIlll(llllllllllllIllIIlIIllIlIllIIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[13]]).append(llllllllllllIllIIlIIllIlIllIIIIl)));
        }
    }
    
    private static boolean lIIllIIlIllIlIll(final int llllllllllllIllIIlIIllIlIIIlIllI) {
        return llllllllllllIllIIlIIllIlIIIlIllI == 0;
    }
    
    private static String lIIllIIlIIIIllll(final String llllllllllllIllIIlIIllIlIIlllllI, final String llllllllllllIllIIlIIllIlIIllllll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIllIlIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIllIlIIllllll.getBytes(StandardCharsets.UTF_8)), DelimiterBasedFrameDecoder.llIlllIIlIllll[12]), "DES");
            final Cipher llllllllllllIllIIlIIllIlIlIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIllIlIlIIIIlI.init(DelimiterBasedFrameDecoder.llIlllIIlIllll[2], llllllllllllIllIIlIIllIlIlIIIIll);
            return new String(llllllllllllIllIIlIIllIlIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIllIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIllIlIlIIIIIl) {
            llllllllllllIllIIlIIllIlIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIIlIIIlIIlI() {
        (llIlllIIIIllII = new String[DelimiterBasedFrameDecoder.llIlllIIlIllll[4]])[DelimiterBasedFrameDecoder.llIlllIIlIllll[1]] = lIIllIIlIIIIllll("F0wtDRftqo3COSjERe6acQ==", "ZIoyG");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[0]] = lIIllIIlIIIIllll("4eFMX3gbY+oVCa7/eh393w4JPIzEZ+4k", "HwcpN");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[2]] = lIIllIIlIIIIllll("w4q7hWcSkPGLYUKPmnqfL2xuwfPjRpau", "pNpXt");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[6]] = lIIllIIlIIIlIIII("av3S/EwRahg=", "YFEik");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[7]] = lIIllIIlIIIIllll("cisd0uGb/+OGDXi2FzndFA==", "fGWPI");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[8]] = lIIllIIlIIIlIIIl("Dz0EHBBJIwAfEh0nRRQNCioAFQZJ", "iOequ");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[9]] = lIIllIIlIIIlIIIl("dUdYPSYmCRkrKzwEHw==", "UjxYO");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[11]] = lIIllIIlIIIIllll("qdOrnr0is8GKsCeb1Ou6Og==", "GrPKS");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[12]] = lIIllIIlIIIlIIII("R2F0ihkhxQXPicY2nyuF/w==", "WZDrp");
        DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[13]] = lIIllIIlIIIlIIII("pxlGqwnBVyP8XRCvqxh4daIcKGlMJcBpxNp0jPpk7kJD47i8KMIVv46jvOb2PjDx", "omFgL");
    }
    
    static {
        lIIllIIlIllIlIIl();
        lIIllIIlIIIlIIlI();
    }
    
    private static boolean lIIllIIlIlllIIII(final Object llllllllllllIllIIlIIllIlIIIlllll, final Object llllllllllllIllIIlIIllIlIIIllllI) {
        return llllllllllllIllIIlIIllIlIIIlllll != llllllllllllIllIIlIIllIlIIIllllI;
    }
    
    private static boolean lIIllIIlIllIlllI(final int llllllllllllIllIIlIIllIlIIIIllIl, final int llllllllllllIllIIlIIllIlIIIIllII) {
        return llllllllllllIllIIlIIllIlIIIIllIl != llllllllllllIllIIlIIllIlIIIIllII;
    }
    
    private static String lIIllIIlIIIlIIIl(String llllllllllllIllIIlIIllIlIlIlIIII, final String llllllllllllIllIIlIIllIlIlIIllll) {
        llllllllllllIllIIlIIllIlIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIllIlIlIlIIll = new StringBuilder();
        final char[] llllllllllllIllIIlIIllIlIlIlIIlI = llllllllllllIllIIlIIllIlIlIIllll.toCharArray();
        int llllllllllllIllIIlIIllIlIlIlIIIl = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
        final Exception llllllllllllIllIIlIIllIlIlIIlIll = (Object)llllllllllllIllIIlIIllIlIlIlIIII.toCharArray();
        final Exception llllllllllllIllIIlIIllIlIlIIlIlI = (Exception)llllllllllllIllIIlIIllIlIlIIlIll.length;
        short llllllllllllIllIIlIIllIlIlIIlIIl = (short)DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
        while (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIlIlIIlIIl, (int)llllllllllllIllIIlIIllIlIlIIlIlI)) {
            final char llllllllllllIllIIlIIllIlIlIlIllI = llllllllllllIllIIlIIllIlIlIIlIll[llllllllllllIllIIlIIllIlIlIIlIIl];
            llllllllllllIllIIlIIllIlIlIlIIll.append((char)(llllllllllllIllIIlIIllIlIlIlIllI ^ llllllllllllIllIIlIIllIlIlIlIIlI[llllllllllllIllIIlIIllIlIlIlIIIl % llllllllllllIllIIlIIllIlIlIlIIlI.length]));
            "".length();
            ++llllllllllllIllIIlIIllIlIlIlIIIl;
            ++llllllllllllIllIIlIIllIlIlIIlIIl;
            "".length();
            if (((0x45 ^ 0x5C ^ (0x6A ^ 0x43)) & (132 + 39 - 152 + 134 ^ 69 + 39 - 23 + 84 ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIllIlIlIlIIll);
    }
    
    private static boolean isLineBased(final ByteBuf[] llllllllllllIllIIlIIllIllIllIIIl) {
        if (lIIllIIlIllIlllI(llllllllllllIllIIlIIllIllIllIIIl.length, DelimiterBasedFrameDecoder.llIlllIIlIllll[2])) {
            return DelimiterBasedFrameDecoder.llIlllIIlIllll[1] != 0;
        }
        ByteBuf llllllllllllIllIIlIIllIllIllIIll = llllllllllllIllIIlIIllIllIllIIIl[DelimiterBasedFrameDecoder.llIlllIIlIllll[1]];
        ByteBuf llllllllllllIllIIlIIllIllIllIIlI = llllllllllllIllIIlIIllIllIllIIIl[DelimiterBasedFrameDecoder.llIlllIIlIllll[0]];
        if (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIllIllIIll.capacity(), llllllllllllIllIIlIIllIllIllIIlI.capacity())) {
            llllllllllllIllIIlIIllIllIllIIll = llllllllllllIllIIlIIllIllIllIIIl[DelimiterBasedFrameDecoder.llIlllIIlIllll[0]];
            llllllllllllIllIIlIIllIllIllIIlI = llllllllllllIllIIlIIllIllIllIIIl[DelimiterBasedFrameDecoder.llIlllIIlIllll[1]];
        }
        int n;
        if (lIIllIIlIllIllll(llllllllllllIllIIlIIllIllIllIIll.capacity(), DelimiterBasedFrameDecoder.llIlllIIlIllll[2]) && lIIllIIlIllIllll(llllllllllllIllIIlIIllIllIllIIlI.capacity(), DelimiterBasedFrameDecoder.llIlllIIlIllll[0]) && lIIllIIlIllIllll(llllllllllllIllIIlIIllIllIllIIll.getByte(DelimiterBasedFrameDecoder.llIlllIIlIllll[1]), DelimiterBasedFrameDecoder.llIlllIIlIllll[3]) && lIIllIIlIllIllll(llllllllllllIllIIlIIllIllIllIIll.getByte(DelimiterBasedFrameDecoder.llIlllIIlIllll[0]), DelimiterBasedFrameDecoder.llIlllIIlIllll[4]) && lIIllIIlIllIllll(llllllllllllIllIIlIIllIllIllIIlI.getByte(DelimiterBasedFrameDecoder.llIlllIIlIllll[1]), DelimiterBasedFrameDecoder.llIlllIIlIllll[4])) {
            n = DelimiterBasedFrameDecoder.llIlllIIlIllll[0];
            "".length();
            if (" ".length() == 0) {
                return ((0x56 ^ 0xE ^ (0x28 ^ 0x4F)) & (0x79 ^ 0x2A ^ (0x3F ^ 0x53) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
        }
        return n != 0;
    }
    
    private static String lIIllIIlIIIlIIII(final String llllllllllllIllIIlIIllIlIIllIIIl, final String llllllllllllIllIIlIIllIlIIllIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIllIlIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIllIlIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIllIlIIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIllIlIIllIlIl.init(DelimiterBasedFrameDecoder.llIlllIIlIllll[2], llllllllllllIllIIlIIllIlIIllIllI);
            return new String(llllllllllllIllIIlIIllIlIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIllIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIllIlIIllIlII) {
            llllllllllllIllIIlIIllIlIIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIlIlllIIll(final int llllllllllllIllIIlIIllIlIIlIIIll, final int llllllllllllIllIIlIIllIlIIlIIIlI) {
        return llllllllllllIllIIlIIllIlIIlIIIll > llllllllllllIllIIlIIllIlIIlIIIlI;
    }
    
    private boolean isSubclass() {
        int n;
        if (lIIllIIlIlllIIII(this.getClass(), DelimiterBasedFrameDecoder.class)) {
            n = DelimiterBasedFrameDecoder.llIlllIIlIllll[0];
            "".length();
            if ("   ".length() < 0) {
                return ((65 + 136 - 115 + 99 ^ 163 + 73 - 173 + 126) & (65 + 120 - 143 + 106 ^ 86 + 106 - 174 + 126 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
        }
        return n != 0;
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIlllllIIll, final boolean llllllllllllIllIIlIIllIlllllIllI, final ByteBuf llllllllllllIllIIlIIllIlllllIIIl) {
        this(llllllllllllIllIIlIIllIlllllIIll, llllllllllllIllIIlIIllIlllllIllI, (boolean)(DelimiterBasedFrameDecoder.llIlllIIlIllll[0] != 0), llllllllllllIllIIlIIllIlllllIIIl);
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIlllIIllll, final boolean llllllllllllIllIIlIIllIlllIlIIlI, final ByteBuf... llllllllllllIllIIlIIllIlllIlIIIl) {
        this(llllllllllllIllIIlIIllIlllIIllll, llllllllllllIllIIlIIllIlllIlIIlI, (boolean)(DelimiterBasedFrameDecoder.llIlllIIlIllll[0] != 0), llllllllllllIllIIlIIllIlllIlIIIl);
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIllllllllI, final ByteBuf llllllllllllIllIIlIIllIlllllllIl) {
        this(llllllllllllIllIIlIIllIllllllllI, (boolean)(DelimiterBasedFrameDecoder.llIlllIIlIllll[0] != 0), llllllllllllIllIIlIIllIlllllllIl);
    }
    
    private static boolean lIIllIIlIllIllll(final int llllllllllllIllIIlIIllIlIIlIlIll, final int llllllllllllIllIIlIIllIlIIlIlIlI) {
        return llllllllllllIllIIlIIllIlIIlIlIll == llllllllllllIllIIlIIllIlIIlIlIlI;
    }
    
    private void fail(final long llllllllllllIllIIlIIllIlIlllIlll) {
        if (lIIllIIlIlllIlIl(lIIllIIlIlllIlII(llllllllllllIllIIlIIllIlIlllIlll, 0L))) {
            throw new TooLongFrameException(String.valueOf(new StringBuilder().append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[2]]).append(this.maxFrameLength).append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[6]]).append(llllllllllllIllIIlIIllIlIlllIlll).append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[7]])));
        }
        throw new TooLongFrameException(String.valueOf(new StringBuilder().append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[8]]).append(this.maxFrameLength).append(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[9]])));
    }
    
    public DelimiterBasedFrameDecoder(final int llllllllllllIllIIlIIllIllIllllIl, final boolean llllllllllllIllIIlIIllIllIllllII, final boolean llllllllllllIllIIlIIllIlllIIIIII, final ByteBuf... llllllllllllIllIIlIIllIllIlllIlI) {
        validateMaxFrameLength(llllllllllllIllIIlIIllIllIllllIl);
        if (lIIllIIlIllIlIlI(llllllllllllIllIIlIIllIllIlllIlI)) {
            throw new NullPointerException(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[1]]);
        }
        if (lIIllIIlIllIlIll(llllllllllllIllIIlIIllIllIlllIlI.length)) {
            throw new IllegalArgumentException(DelimiterBasedFrameDecoder.llIlllIIIIllII[DelimiterBasedFrameDecoder.llIlllIIlIllll[0]]);
        }
        if (lIIllIIlIllIllII(isLineBased(llllllllllllIllIIlIIllIllIlllIlI) ? 1 : 0) && lIIllIIlIllIlIll(this.isSubclass() ? 1 : 0)) {
            this.lineBasedDecoder = new LineBasedFrameDecoder(llllllllllllIllIIlIIllIllIllllIl, llllllllllllIllIIlIIllIllIllllII, llllllllllllIllIIlIIllIlllIIIIII);
            this.delimiters = null;
            "".length();
            if (-" ".length() >= (0xB1 ^ 0xB5)) {
                throw null;
            }
        }
        else {
            this.delimiters = new ByteBuf[llllllllllllIllIIlIIllIllIlllIlI.length];
            int llllllllllllIllIIlIIllIlllIIIlII = DelimiterBasedFrameDecoder.llIlllIIlIllll[1];
            while (lIIllIIlIllIllIl(llllllllllllIllIIlIIllIlllIIIlII, llllllllllllIllIIlIIllIllIlllIlI.length)) {
                final ByteBuf llllllllllllIllIIlIIllIlllIIIlIl = llllllllllllIllIIlIIllIllIlllIlI[llllllllllllIllIIlIIllIlllIIIlII];
                validateDelimiter(llllllllllllIllIIlIIllIlllIIIlIl);
                this.delimiters[llllllllllllIllIIlIIllIlllIIIlII] = llllllllllllIllIIlIIllIlllIIIlIl.slice(llllllllllllIllIIlIIllIlllIIIlIl.readerIndex(), llllllllllllIllIIlIIllIlllIIIlIl.readableBytes());
                ++llllllllllllIllIIlIIllIlllIIIlII;
                "".length();
                if (-" ".length() > " ".length()) {
                    throw null;
                }
            }
            this.lineBasedDecoder = null;
        }
        this.maxFrameLength = llllllllllllIllIIlIIllIllIllllIl;
        this.stripDelimiter = llllllllllllIllIIlIIllIllIllllII;
        this.failFast = llllllllllllIllIIlIIllIlllIIIIII;
    }
    
    private static boolean lIIllIIlIlllIlll(final int llllllllllllIllIIlIIllIlIIIlIIlI) {
        return llllllllllllIllIIlIIllIlIIIlIIlI <= 0;
    }
}
