// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.protobuf;

import java.io.OutputStream;
import io.netty.buffer.ByteBufOutputStream;
import com.google.protobuf.CodedOutputStream;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class ProtobufVarint32LengthFieldPrepender extends MessageToByteEncoder<ByteBuf>
{
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllIIIlIIIIlIlIlIllI, final ByteBuf llllllllllllIllIIIlIIIIlIlIlIIII, final ByteBuf llllllllllllIllIIIlIIIIlIlIlIlII) throws Exception {
        final int llllllllllllIllIIIlIIIIlIlIlIIll = llllllllllllIllIIIlIIIIlIlIlIIII.readableBytes();
        final int llllllllllllIllIIIlIIIIlIlIlIIlI = CodedOutputStream.computeRawVarint32Size(llllllllllllIllIIIlIIIIlIlIlIIll);
        llllllllllllIllIIIlIIIIlIlIlIlII.ensureWritable(llllllllllllIllIIIlIIIIlIlIlIIlI + llllllllllllIllIIIlIIIIlIlIlIIll);
        "".length();
        final CodedOutputStream llllllllllllIllIIIlIIIIlIlIlIIIl = CodedOutputStream.newInstance((OutputStream)new ByteBufOutputStream(llllllllllllIllIIIlIIIIlIlIlIlII), llllllllllllIllIIIlIIIIlIlIlIIlI);
        llllllllllllIllIIIlIIIIlIlIlIIIl.writeRawVarint32(llllllllllllIllIIIlIIIIlIlIlIIll);
        llllllllllllIllIIIlIIIIlIlIlIIIl.flush();
        llllllllllllIllIIIlIIIIlIlIlIlII.writeBytes(llllllllllllIllIIIlIIIIlIlIlIIII, llllllllllllIllIIIlIIIIlIlIlIIII.readerIndex(), llllllllllllIllIIIlIIIIlIlIlIIll);
        "".length();
    }
}
