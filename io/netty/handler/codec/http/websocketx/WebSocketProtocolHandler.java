// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

abstract class WebSocketProtocolHandler extends MessageToMessageDecoder<WebSocketFrame>
{
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIlllIlllIlIIIllIIlll, final Throwable llllllllllllIlllIlllIlIIIllIIllI) throws Exception {
        llllllllllllIlllIlllIlIIIllIIlll.close();
        "".length();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllIlllIlIIIllIllII, final WebSocketFrame llllllllllllIlllIlllIlIIIllIlIll, final List<Object> llllllllllllIlllIlllIlIIIllIlIlI) throws Exception {
        if (lIIIIllllIIIllII((llllllllllllIlllIlllIlIIIllIlIll instanceof PingWebSocketFrame) ? 1 : 0)) {
            llllllllllllIlllIlllIlIIIllIlIll.content().retain();
            "".length();
            llllllllllllIlllIlllIlIIIllIllII.channel().writeAndFlush(new PongWebSocketFrame(llllllllllllIlllIlllIlIIIllIlIll.content()));
            "".length();
            return;
        }
        if (lIIIIllllIIIllII((llllllllllllIlllIlllIlIIIllIlIll instanceof PongWebSocketFrame) ? 1 : 0)) {
            return;
        }
        llllllllllllIlllIlllIlIIIllIlIlI.add(llllllllllllIlllIlllIlIIIllIlIll.retain());
        "".length();
    }
    
    private static boolean lIIIIllllIIIllII(final int llllllllllllIlllIlllIlIIIlIlIlll) {
        return llllllllllllIlllIlllIlIIIlIlIlll != 0;
    }
}
