// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.bytes;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

public class ByteArrayDecoder extends MessageToMessageDecoder<ByteBuf>
{
    private static final /* synthetic */ int[] lllIlIllllllll;
    
    private static void lIlIIIllllIIllll() {
        (lllIlIllllllll = new int[1])[0] = ((0xF1 ^ 0x84 ^ (0xAD ^ 0x98)) & (21 + 105 + 96 + 25 ^ 98 + 48 - 131 + 168 ^ -" ".length()));
    }
    
    static {
        lIlIIIllllIIllll();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlIllIlIIIIlIIIIlllI, final ByteBuf llllllllllllIlIllIlIIIIlIIIIlIlI, final List<Object> llllllllllllIlIllIlIIIIlIIIIllII) throws Exception {
        final byte[] llllllllllllIlIllIlIIIIlIIIIlIll = new byte[llllllllllllIlIllIlIIIIlIIIIlIlI.readableBytes()];
        llllllllllllIlIllIlIIIIlIIIIlIlI.getBytes(ByteArrayDecoder.lllIlIllllllll[0], llllllllllllIlIllIlIIIIlIIIIlIll);
        "".length();
        llllllllllllIlIllIlIIIIlIIIIllII.add(llllllllllllIlIllIlIIIIlIIIIlIll);
        "".length();
    }
}
