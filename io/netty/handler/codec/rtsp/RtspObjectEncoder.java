// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.http.HttpObjectEncoder;
import io.netty.handler.codec.http.HttpMessage;

@ChannelHandler.Sharable
public abstract class RtspObjectEncoder<H extends HttpMessage> extends HttpObjectEncoder<H>
{
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIlIIIIIIllIlllllIII) throws Exception {
        return lllllllllllllIlIIIIIIllIlllllIII instanceof FullHttpMessage;
    }
    
    protected RtspObjectEncoder() {
    }
}
