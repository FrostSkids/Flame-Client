// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import java.io.Serializable;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class ObjectEncoder extends MessageToByteEncoder<Serializable>
{
    private static final /* synthetic */ byte[] LENGTH_PLACEHOLDER;
    private static final /* synthetic */ int[] lIlllllIIIIlll;
    
    private static void lIIIIlIlIIIlIlII() {
        (lIlllllIIIIlll = new int[1])[0] = (0x2E ^ 0x2A);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllllIIllllIlIIllIll, final Serializable llllllllllllIllllIIllllIlIIlIlII, final ByteBuf llllllllllllIllllIIllllIlIIllIIl) throws Exception {
        final int llllllllllllIllllIIllllIlIIllIII = llllllllllllIllllIIllllIlIIllIIl.writerIndex();
        final ByteBufOutputStream llllllllllllIllllIIllllIlIIlIlll = new ByteBufOutputStream(llllllllllllIllllIIllllIlIIllIIl);
        llllllllllllIllllIIllllIlIIlIlll.write(ObjectEncoder.LENGTH_PLACEHOLDER);
        final ObjectOutputStream llllllllllllIllllIIllllIlIIlIllI = new CompactObjectOutputStream(llllllllllllIllllIIllllIlIIlIlll);
        llllllllllllIllllIIllllIlIIlIllI.writeObject(llllllllllllIllllIIllllIlIIlIlII);
        llllllllllllIllllIIllllIlIIlIllI.flush();
        llllllllllllIllllIIllllIlIIlIllI.close();
        final int llllllllllllIllllIIllllIlIIlIlIl = llllllllllllIllllIIllllIlIIllIIl.writerIndex();
        llllllllllllIllllIIllllIlIIllIIl.setInt(llllllllllllIllllIIllllIlIIllIII, llllllllllllIllllIIllllIlIIlIlIl - llllllllllllIllllIIllllIlIIllIII - ObjectEncoder.lIlllllIIIIlll[0]);
        "".length();
    }
    
    static {
        lIIIIlIlIIIlIlII();
        LENGTH_PLACEHOLDER = new byte[ObjectEncoder.lIlllllIIIIlll[0]];
    }
}
