// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.ByteOutput;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class CompatibleMarshallingEncoder extends MessageToByteEncoder<Object>
{
    private final /* synthetic */ MarshallerProvider provider;
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlIllIllIllllllIlIIl, final Object llllllllllllIlIllIllIllllllIlllI, final ByteBuf llllllllllllIlIllIllIllllllIIlIl) throws Exception {
        final Marshaller llllllllllllIlIllIllIllllllIllII = this.provider.getMarshaller(llllllllllllIlIllIllIllllllIlIIl);
        llllllllllllIlIllIllIllllllIllII.start((ByteOutput)new ChannelBufferByteOutput(llllllllllllIlIllIllIllllllIIlIl));
        llllllllllllIlIllIllIllllllIllII.writeObject(llllllllllllIlIllIllIllllllIlllI);
        llllllllllllIlIllIllIllllllIllII.finish();
        llllllllllllIlIllIllIllllllIllII.close();
    }
    
    public CompatibleMarshallingEncoder(final MarshallerProvider llllllllllllIlIllIlllIIIIIIIIIll) {
        this.provider = llllllllllllIlIllIlllIIIIIIIIIll;
    }
}
