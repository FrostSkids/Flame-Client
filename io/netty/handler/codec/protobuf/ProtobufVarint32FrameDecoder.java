// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.protobuf;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.handler.codec.CorruptedFrameException;
import com.google.protobuf.CodedInputStream;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class ProtobufVarint32FrameDecoder extends ByteToMessageDecoder
{
    private static final /* synthetic */ String[] llllIlIlllllI;
    private static final /* synthetic */ int[] llllIlIllllll;
    
    private static void lIlIlIlIllIlIlI() {
        (llllIlIllllll = new int[4])[0] = (0x1A ^ 0x1F);
        ProtobufVarint32FrameDecoder.llllIlIllllll[1] = ((0x4B ^ 0x58) & ~(0x45 ^ 0x56));
        ProtobufVarint32FrameDecoder.llllIlIllllll[2] = " ".length();
        ProtobufVarint32FrameDecoder.llllIlIllllll[3] = "  ".length();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIlIllIlIIlllllIIIlI, final ByteBuf lllllllllllllIlIllIlIIllllIllllI, final List<Object> lllllllllllllIlIllIlIIlllllIIIII) throws Exception {
        lllllllllllllIlIllIlIIllllIllllI.markReaderIndex();
        "".length();
        final byte[] lllllllllllllIlIllIlIIllllIlllll = new byte[ProtobufVarint32FrameDecoder.llllIlIllllll[0]];
        int lllllllllllllIlIllIlIIlllllIIlII = ProtobufVarint32FrameDecoder.llllIlIllllll[1];
        while (lIlIlIlIllIlIll(lllllllllllllIlIllIlIIlllllIIlII, lllllllllllllIlIllIlIIllllIlllll.length)) {
            if (lIlIlIlIllIllII(lllllllllllllIlIllIlIIllllIllllI.isReadable() ? 1 : 0)) {
                lllllllllllllIlIllIlIIllllIllllI.resetReaderIndex();
                "".length();
                return;
            }
            lllllllllllllIlIllIlIIllllIlllll[lllllllllllllIlIllIlIIlllllIIlII] = lllllllllllllIlIllIlIIllllIllllI.readByte();
            if (lIlIlIlIllIllIl(lllllllllllllIlIllIlIIllllIlllll[lllllllllllllIlIllIlIIlllllIIlII])) {
                final int lllllllllllllIlIllIlIIlllllIIlIl = CodedInputStream.newInstance(lllllllllllllIlIllIlIIllllIlllll, ProtobufVarint32FrameDecoder.llllIlIllllll[1], lllllllllllllIlIllIlIIlllllIIlII + ProtobufVarint32FrameDecoder.llllIlIllllll[2]).readRawVarint32();
                if (lIlIlIlIllIlllI(lllllllllllllIlIllIlIIlllllIIlIl)) {
                    throw new CorruptedFrameException(String.valueOf(new StringBuilder().append(ProtobufVarint32FrameDecoder.llllIlIlllllI[ProtobufVarint32FrameDecoder.llllIlIllllll[1]]).append(lllllllllllllIlIllIlIIlllllIIlIl)));
                }
                if (lIlIlIlIllIlIll(lllllllllllllIlIllIlIIllllIllllI.readableBytes(), lllllllllllllIlIllIlIIlllllIIlIl)) {
                    lllllllllllllIlIllIlIIllllIllllI.resetReaderIndex();
                    "".length();
                    return;
                }
                lllllllllllllIlIllIlIIlllllIIIII.add(lllllllllllllIlIllIlIIllllIllllI.readBytes(lllllllllllllIlIllIlIIlllllIIlIl));
                "".length();
                return;
            }
            else {
                ++lllllllllllllIlIllIlIIlllllIIlII;
                "".length();
                if (((0xAC ^ 0x80) & ~(0xBB ^ 0x97)) != 0x0) {
                    return;
                }
                continue;
            }
        }
        throw new CorruptedFrameException(ProtobufVarint32FrameDecoder.llllIlIlllllI[ProtobufVarint32FrameDecoder.llllIlIllllll[2]]);
    }
    
    static {
        lIlIlIlIllIlIlI();
        lIlIlIlIllIlIIl();
    }
    
    private static String lIlIlIlIllIlIII(String lllllllllllllIlIllIlIIllllIIlIlI, final String lllllllllllllIlIllIlIIllllIIlIIl) {
        lllllllllllllIlIllIlIIllllIIlIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIlIIllllIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIIllllIIllIl = new StringBuilder();
        final char[] lllllllllllllIlIllIlIIllllIIllII = lllllllllllllIlIllIlIIllllIIlIIl.toCharArray();
        int lllllllllllllIlIllIlIIllllIIlIll = ProtobufVarint32FrameDecoder.llllIlIllllll[1];
        final float lllllllllllllIlIllIlIIllllIIIlIl = (Object)((String)lllllllllllllIlIllIlIIllllIIlIlI).toCharArray();
        final float lllllllllllllIlIllIlIIllllIIIlII = lllllllllllllIlIllIlIIllllIIIlIl.length;
        long lllllllllllllIlIllIlIIllllIIIIll = ProtobufVarint32FrameDecoder.llllIlIllllll[1];
        while (lIlIlIlIllIlIll((int)lllllllllllllIlIllIlIIllllIIIIll, (int)lllllllllllllIlIllIlIIllllIIIlII)) {
            final char lllllllllllllIlIllIlIIllllIlIIII = lllllllllllllIlIllIlIIllllIIIlIl[lllllllllllllIlIllIlIIllllIIIIll];
            lllllllllllllIlIllIlIIllllIIllIl.append((char)(lllllllllllllIlIllIlIIllllIlIIII ^ lllllllllllllIlIllIlIIllllIIllII[lllllllllllllIlIllIlIIllllIIlIll % lllllllllllllIlIllIlIIllllIIllII.length]));
            "".length();
            ++lllllllllllllIlIllIlIIllllIIlIll;
            ++lllllllllllllIlIllIlIIllllIIIIll;
            "".length();
            if (((0xB1 ^ 0x87) & ~(0x33 ^ 0x5)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIIllllIIllIl);
    }
    
    private static boolean lIlIlIlIllIlllI(final int lllllllllllllIlIllIlIIlllIlllIII) {
        return lllllllllllllIlIllIlIIlllIlllIII < 0;
    }
    
    private static boolean lIlIlIlIllIllIl(final int lllllllllllllIlIllIlIIlllIlllIlI) {
        return lllllllllllllIlIllIlIIlllIlllIlI >= 0;
    }
    
    private static void lIlIlIlIllIlIIl() {
        (llllIlIlllllI = new String[ProtobufVarint32FrameDecoder.llllIlIllllll[3]])[ProtobufVarint32FrameDecoder.llllIlIllllll[1]] = lIlIlIlIllIlIII("NxUOJTAwBgxkKDweDjAsY1A=", "YpiDD");
        ProtobufVarint32FrameDecoder.llllIlIlllllI[ProtobufVarint32FrameDecoder.llllIlIllllll[2]] = lIlIlIlIllIlIII("NiwBLi0yaRggPT87Tz0xOydPemt3KwY9", "ZIoIY");
    }
    
    private static boolean lIlIlIlIllIllII(final int lllllllllllllIlIllIlIIlllIllllII) {
        return lllllllllllllIlIllIlIIlllIllllII == 0;
    }
    
    private static boolean lIlIlIlIllIlIll(final int lllllllllllllIlIllIlIIlllIllllll, final int lllllllllllllIlIllIlIIlllIlllllI) {
        return lllllllllllllIlIllIlIIlllIllllll < lllllllllllllIlIllIlIIlllIlllllI;
    }
}
