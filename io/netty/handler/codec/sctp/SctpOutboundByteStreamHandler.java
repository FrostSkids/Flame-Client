// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.sctp;

import io.netty.channel.sctp.SctpMessage;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageEncoder;

public class SctpOutboundByteStreamHandler extends MessageToMessageEncoder<ByteBuf>
{
    private final /* synthetic */ int protocolIdentifier;
    private final /* synthetic */ int streamIdentifier;
    
    public SctpOutboundByteStreamHandler(final int lllllllllllllIlIIIIllIlIIlIIlIIl, final int lllllllllllllIlIIIIllIlIIlIIlIll) {
        this.streamIdentifier = lllllllllllllIlIIIIllIlIIlIIlIIl;
        this.protocolIdentifier = lllllllllllllIlIIIIllIlIIlIIlIll;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIlIIIIllIlIIlIIIIll, final ByteBuf lllllllllllllIlIIIIllIlIIlIIIIlI, final List<Object> lllllllllllllIlIIIIllIlIIIlllllI) throws Exception {
        lllllllllllllIlIIIIllIlIIIlllllI.add(new SctpMessage(this.streamIdentifier, this.protocolIdentifier, lllllllllllllIlIIIIllIlIIlIIIIlI.retain()));
        "".length();
    }
}
