// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public abstract class ZlibEncoder extends MessageToByteEncoder<ByteBuf>
{
    private static final /* synthetic */ int[] llIIlIlllllIIl;
    
    private static void lIIIlllIIIIlllII() {
        (llIIlIlllllIIl = new int[1])[0] = ((0xCD ^ 0x81 ^ (0xAC ^ 0xB5)) & (0x6 ^ 0x5D ^ (0xB5 ^ 0xBB) ^ -" ".length()));
    }
    
    public abstract boolean isClosed();
    
    protected ZlibEncoder() {
        super((boolean)(ZlibEncoder.llIIlIlllllIIl[0] != 0));
    }
    
    public abstract ChannelFuture close(final ChannelPromise p0);
    
    static {
        lIIIlllIIIIlllII();
    }
    
    public abstract ChannelFuture close();
}
