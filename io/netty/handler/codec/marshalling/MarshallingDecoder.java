// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.ByteInput;
import org.jboss.marshalling.Unmarshaller;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class MarshallingDecoder extends LengthFieldBasedFrameDecoder
{
    private static final /* synthetic */ int[] lIlllllllIIIlI;
    private final /* synthetic */ UnmarshallerProvider provider;
    
    static {
        lIIIIllIIIIIlIlI();
    }
    
    private static void lIIIIllIIIIIlIlI() {
        (lIlllllllIIIlI = new int[3])[0] = (0xFFFFB8CD & 0x104732);
        MarshallingDecoder.lIlllllllIIIlI[1] = ((106 + 85 - 170 + 121 ^ 115 + 116 - 126 + 89) & (0x28 ^ 0x61 ^ (0x85 ^ 0x80) ^ -" ".length()));
        MarshallingDecoder.lIlllllllIIIlI[2] = (8 + 166 - 44 + 60 ^ 111 + 47 - 6 + 34);
    }
    
    @Override
    protected ByteBuf extractFrame(final ChannelHandlerContext llllllllllllIllllIIlIIIIIIIlIlIl, final ByteBuf llllllllllllIllllIIlIIIIIIIlIIIl, final int llllllllllllIllllIIlIIIIIIIlIIII, final int llllllllllllIllllIIlIIIIIIIIllll) {
        return llllllllllllIllllIIlIIIIIIIlIIIl.slice(llllllllllllIllllIIlIIIIIIIlIIII, llllllllllllIllllIIlIIIIIIIIllll);
    }
    
    @Override
    protected Object decode(final ChannelHandlerContext llllllllllllIllllIIlIIIIIIlIIlll, final ByteBuf llllllllllllIllllIIlIIIIIIlIIllI) throws Exception {
        final ByteBuf llllllllllllIllllIIlIIIIIIlIIlIl = (ByteBuf)super.decode(llllllllllllIllllIIlIIIIIIlIIlll, llllllllllllIllllIIlIIIIIIlIIllI);
        if (lIIIIllIIIIIlIll(llllllllllllIllllIIlIIIIIIlIIlIl)) {
            return null;
        }
        final Unmarshaller llllllllllllIllllIIlIIIIIIlIIlII = this.provider.getUnmarshaller(llllllllllllIllllIIlIIIIIIlIIlll);
        final ByteInput llllllllllllIllllIIlIIIIIIlIIIll = (ByteInput)new ChannelBufferByteInput(llllllllllllIllllIIlIIIIIIlIIlIl);
        try {
            llllllllllllIllllIIlIIIIIIlIIlII.start(llllllllllllIllllIIlIIIIIIlIIIll);
            final Object llllllllllllIllllIIlIIIIIIlIlIIl = llllllllllllIllllIIlIIIIIIlIIlII.readObject();
            llllllllllllIllllIIlIIIIIIlIIlII.finish();
            final double llllllllllllIllllIIlIIIIIIIllIll = (double)llllllllllllIllllIIlIIIIIIlIlIIl;
            return llllllllllllIllllIIlIIIIIIIllIll;
        }
        finally {
            llllllllllllIllllIIlIIIIIIlIIlII.close();
        }
    }
    
    private static boolean lIIIIllIIIIIlIll(final Object llllllllllllIllllIIlIIIIIIIIllIl) {
        return llllllllllllIllllIIlIIIIIIIIllIl == null;
    }
    
    public MarshallingDecoder(final UnmarshallerProvider llllllllllllIllllIIlIIIIIIllIlII, final int llllllllllllIllllIIlIIIIIIllIIll) {
        super(llllllllllllIllllIIlIIIIIIllIIll, MarshallingDecoder.lIlllllllIIIlI[1], MarshallingDecoder.lIlllllllIIIlI[2], MarshallingDecoder.lIlllllllIIIlI[1], MarshallingDecoder.lIlllllllIIIlI[2]);
        this.provider = llllllllllllIllllIIlIIIIIIllIlII;
    }
    
    public MarshallingDecoder(final UnmarshallerProvider llllllllllllIllllIIlIIIIIIlllllI) {
        this(llllllllllllIllllIIlIIIIIIlllllI, MarshallingDecoder.lIlllllllIIIlI[0]);
    }
}
