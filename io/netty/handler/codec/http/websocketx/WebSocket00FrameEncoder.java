// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler.Sharable
public class WebSocket00FrameEncoder extends MessageToMessageEncoder<WebSocketFrame> implements WebSocketFrameEncoder
{
    private static final /* synthetic */ ByteBuf _0XFF;
    private static final /* synthetic */ ByteBuf _0X00;
    private static final /* synthetic */ int[] lllIIlIlIllIll;
    private static final /* synthetic */ ByteBuf _0XFF_0X00;
    
    private static boolean lIIllllllIlIlIll(final int llllllllllllIlIllllIIllllllIllII) {
        return llllllllllllIlIllllIIllllllIllII != 0;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlIllllIlIIIIIIIIlIl, final WebSocketFrame llllllllllllIlIllllIlIIIIIIIIlII, final List<Object> llllllllllllIlIllllIlIIIIIIIIIll) throws Exception {
        if (lIIllllllIlIlIll((llllllllllllIlIllllIlIIIIIIIIlII instanceof TextWebSocketFrame) ? 1 : 0)) {
            final ByteBuf llllllllllllIlIllllIlIIIIIIlIIlI = llllllllllllIlIllllIlIIIIIIIIlII.content();
            llllllllllllIlIllllIlIIIIIIIIIll.add(WebSocket00FrameEncoder._0X00.duplicate());
            "".length();
            llllllllllllIlIllllIlIIIIIIIIIll.add(llllllllllllIlIllllIlIIIIIIlIIlI.retain());
            "".length();
            llllllllllllIlIllllIlIIIIIIIIIll.add(WebSocket00FrameEncoder._0XFF.duplicate());
            "".length();
            "".length();
            if (-" ".length() >= ((75 + 147 - 98 + 78 ^ 71 + 140 - 120 + 65) & (109 + 187 - 224 + 121 ^ 44 + 37 - 69 + 139 ^ -" ".length()))) {
                return;
            }
        }
        else if (lIIllllllIlIlIll((llllllllllllIlIllllIlIIIIIIIIlII instanceof CloseWebSocketFrame) ? 1 : 0)) {
            llllllllllllIlIllllIlIIIIIIIIIll.add(WebSocket00FrameEncoder._0XFF_0X00.duplicate());
            "".length();
            "".length();
            if (((0x1D ^ 0x5) & ~(0x6C ^ 0x74)) > (0x8A ^ 0x8E)) {
                return;
            }
        }
        else {
            final ByteBuf llllllllllllIlIllllIlIIIIIIIllIl = llllllllllllIlIllllIlIIIIIIIIlII.content();
            final int llllllllllllIlIllllIlIIIIIIIllII = llllllllllllIlIllllIlIIIIIIIllIl.readableBytes();
            final ByteBuf llllllllllllIlIllllIlIIIIIIIlIll = llllllllllllIlIllllIlIIIIIIIIlIl.alloc().buffer(WebSocket00FrameEncoder.lllIIlIlIllIll[0]);
            boolean llllllllllllIlIllllIlIIIIIIIlIlI = WebSocket00FrameEncoder.lllIIlIlIllIll[1] != 0;
            try {
                llllllllllllIlIllllIlIIIIIIIlIll.writeByte(WebSocket00FrameEncoder.lllIIlIlIllIll[2]);
                "".length();
                final int llllllllllllIlIllllIlIIIIIIlIIIl = llllllllllllIlIllllIlIIIIIIIllII >>> WebSocket00FrameEncoder.lllIIlIlIllIll[3] & WebSocket00FrameEncoder.lllIIlIlIllIll[4];
                final int llllllllllllIlIllllIlIIIIIIlIIII = llllllllllllIlIllllIlIIIIIIIllII >>> WebSocket00FrameEncoder.lllIIlIlIllIll[5] & WebSocket00FrameEncoder.lllIIlIlIllIll[4];
                final int llllllllllllIlIllllIlIIIIIIIllll = llllllllllllIlIllllIlIIIIIIIllII >>> WebSocket00FrameEncoder.lllIIlIlIllIll[6] & WebSocket00FrameEncoder.lllIIlIlIllIll[4];
                final int llllllllllllIlIllllIlIIIIIIIlllI = llllllllllllIlIllllIlIIIIIIIllII & WebSocket00FrameEncoder.lllIIlIlIllIll[4];
                if (lIIllllllIlIllII(llllllllllllIlIllllIlIIIIIIlIIIl)) {
                    if (lIIllllllIlIllII(llllllllllllIlIllllIlIIIIIIlIIII)) {
                        if (lIIllllllIlIllII(llllllllllllIlIllllIlIIIIIIIllll)) {
                            llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIlllI);
                            "".length();
                            "".length();
                            if ((0x92 ^ 0x96) <= ((0x5A ^ 0x5E) & ~(0xB0 ^ 0xB4))) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIllll | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                            "".length();
                            llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIlllI);
                            "".length();
                            "".length();
                            if (-(0x46 ^ 0x43) >= 0) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIlIIII | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                        "".length();
                        llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIllll | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                        "".length();
                        llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIlllI);
                        "".length();
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                }
                else {
                    llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIlIIIl | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                    "".length();
                    llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIlIIII | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                    "".length();
                    llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIllll | WebSocket00FrameEncoder.lllIIlIlIllIll[7]);
                    "".length();
                    llllllllllllIlIllllIlIIIIIIIlIll.writeByte(llllllllllllIlIllllIlIIIIIIIlllI);
                    "".length();
                }
                llllllllllllIlIllllIlIIIIIIIIIll.add(llllllllllllIlIllllIlIIIIIIIlIll);
                "".length();
                llllllllllllIlIllllIlIIIIIIIIIll.add(llllllllllllIlIllllIlIIIIIIIllIl.retain());
                "".length();
                llllllllllllIlIllllIlIIIIIIIlIlI = (WebSocket00FrameEncoder.lllIIlIlIllIll[8] != 0);
                if (lIIllllllIlIlIll(llllllllllllIlIllllIlIIIIIIIlIlI ? 1 : 0)) {
                    llllllllllllIlIllllIlIIIIIIIlIll.release();
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            finally {
                if (lIIllllllIlIlIll(llllllllllllIlIllllIlIIIIIIIlIlI ? 1 : 0)) {
                    llllllllllllIlIllllIlIIIIIIIlIll.release();
                    "".length();
                }
            }
        }
    }
    
    private static void lIIllllllIlIlIlI() {
        (lllIIlIlIllIll = new int[11])[0] = (0x52 ^ 0x57);
        WebSocket00FrameEncoder.lllIIlIlIllIll[1] = " ".length();
        WebSocket00FrameEncoder.lllIIlIlIllIll[2] = -(60 + 50 - 66 + 84);
        WebSocket00FrameEncoder.lllIIlIlIllIll[3] = (0x9D ^ 0x8E ^ (0x8F ^ 0x80));
        WebSocket00FrameEncoder.lllIIlIlIllIll[4] = (0xB9 ^ 0x95) + (0x56 ^ 0xC) - (0x9F ^ 0x97) + " ".length();
        WebSocket00FrameEncoder.lllIIlIlIllIll[5] = (49 + 28 - 64 + 152 ^ 141 + 154 - 196 + 72);
        WebSocket00FrameEncoder.lllIIlIlIllIll[6] = (0xE ^ 0x9);
        WebSocket00FrameEncoder.lllIIlIlIllIll[7] = (0x39 ^ 0x5) + (0xE8 ^ 0xAD) - (0x96 ^ 0xA7) + (0x57 ^ 0x67);
        WebSocket00FrameEncoder.lllIIlIlIllIll[8] = ((0xE6 ^ 0xB7) & ~(0x53 ^ 0x2));
        WebSocket00FrameEncoder.lllIIlIlIllIll[9] = -" ".length();
        WebSocket00FrameEncoder.lllIIlIlIllIll[10] = "  ".length();
    }
    
    static {
        lIIllllllIlIlIlI();
        _0X00 = Unpooled.unreleasableBuffer(Unpooled.directBuffer(WebSocket00FrameEncoder.lllIIlIlIllIll[1], WebSocket00FrameEncoder.lllIIlIlIllIll[1]).writeByte(WebSocket00FrameEncoder.lllIIlIlIllIll[8]));
        _0XFF = Unpooled.unreleasableBuffer(Unpooled.directBuffer(WebSocket00FrameEncoder.lllIIlIlIllIll[1], WebSocket00FrameEncoder.lllIIlIlIllIll[1]).writeByte(WebSocket00FrameEncoder.lllIIlIlIllIll[9]));
        _0XFF_0X00 = Unpooled.unreleasableBuffer(Unpooled.directBuffer(WebSocket00FrameEncoder.lllIIlIlIllIll[10], WebSocket00FrameEncoder.lllIIlIlIllIll[10]).writeByte(WebSocket00FrameEncoder.lllIIlIlIllIll[9]).writeByte(WebSocket00FrameEncoder.lllIIlIlIllIll[8]));
    }
    
    private static boolean lIIllllllIlIllII(final int llllllllllllIlIllllIIllllllIlIlI) {
        return llllllllllllIlIllllIIllllllIlIlI == 0;
    }
}
