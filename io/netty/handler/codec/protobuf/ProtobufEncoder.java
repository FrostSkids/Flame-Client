// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.protobuf;

import io.netty.buffer.Unpooled;
import com.google.protobuf.MessageLite;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler.Sharable
public class ProtobufEncoder extends MessageToMessageEncoder<MessageLiteOrBuilder>
{
    private static boolean lIIIIIIlIlIIlIlI(final int llllllllllllIlllllIllIIIIlllllIl) {
        return llllllllllllIlllllIllIIIIlllllIl != 0;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlllllIllIIIlIlIIIII, final MessageLiteOrBuilder llllllllllllIlllllIllIIIlIIllllI, final List<Object> llllllllllllIlllllIllIIIlIIlllII) throws Exception {
        if (lIIIIIIlIlIIlIlI((llllllllllllIlllllIllIIIlIIllllI instanceof MessageLite) ? 1 : 0)) {
            llllllllllllIlllllIllIIIlIIlllII.add(Unpooled.wrappedBuffer(((MessageLite)llllllllllllIlllllIllIIIlIIllllI).toByteArray()));
            "".length();
            return;
        }
        if (lIIIIIIlIlIIlIlI((llllllllllllIlllllIllIIIlIIllllI instanceof MessageLite.Builder) ? 1 : 0)) {
            llllllllllllIlllllIllIIIlIIlllII.add(Unpooled.wrappedBuffer(((MessageLite.Builder)llllllllllllIlllllIllIIIlIIllllI).build().toByteArray()));
            "".length();
        }
    }
}
