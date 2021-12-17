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
public class MarshallingEncoder extends MessageToByteEncoder<Object>
{
    private static final /* synthetic */ byte[] LENGTH_PLACEHOLDER;
    private static final /* synthetic */ int[] llIIlllIlIlIII;
    private final /* synthetic */ MarshallerProvider provider;
    
    private static void lIIIlllllIlIIIII() {
        (llIIlllIlIlIII = new int[1])[0] = (0x60 ^ 0x64);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllIllllIllIIlIlIlIl, final Object llllllllllllIllIllllIllIIlIIllIl, final ByteBuf llllllllllllIllIllllIllIIlIlIIll) throws Exception {
        final Marshaller llllllllllllIllIllllIllIIlIlIIlI = this.provider.getMarshaller(llllllllllllIllIllllIllIIlIlIlIl);
        final int llllllllllllIllIllllIllIIlIlIIIl = llllllllllllIllIllllIllIIlIlIIll.writerIndex();
        llllllllllllIllIllllIllIIlIlIIll.writeBytes(MarshallingEncoder.LENGTH_PLACEHOLDER);
        "".length();
        final ChannelBufferByteOutput llllllllllllIllIllllIllIIlIlIIII = new ChannelBufferByteOutput(llllllllllllIllIllllIllIIlIlIIll);
        llllllllllllIllIllllIllIIlIlIIlI.start((ByteOutput)llllllllllllIllIllllIllIIlIlIIII);
        llllllllllllIllIllllIllIIlIlIIlI.writeObject(llllllllllllIllIllllIllIIlIIllIl);
        llllllllllllIllIllllIllIIlIlIIlI.finish();
        llllllllllllIllIllllIllIIlIlIIlI.close();
        llllllllllllIllIllllIllIIlIlIIll.setInt(llllllllllllIllIllllIllIIlIlIIIl, llllllllllllIllIllllIllIIlIlIIll.writerIndex() - llllllllllllIllIllllIllIIlIlIIIl - MarshallingEncoder.llIIlllIlIlIII[0]);
        "".length();
    }
    
    public MarshallingEncoder(final MarshallerProvider llllllllllllIllIllllIllIIlIllllI) {
        this.provider = llllllllllllIllIllllIllIIlIllllI;
    }
    
    static {
        lIIIlllllIlIIIII();
        LENGTH_PLACEHOLDER = new byte[MarshallingEncoder.llIIlllIlIlIII[0]];
    }
}
