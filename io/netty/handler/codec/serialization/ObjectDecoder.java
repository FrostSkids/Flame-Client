// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.io.ObjectInputStream;
import java.io.InputStream;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class ObjectDecoder extends LengthFieldBasedFrameDecoder
{
    private final /* synthetic */ ClassResolver classResolver;
    private static final /* synthetic */ int[] lIlllIllIIlllI;
    
    public ObjectDecoder(final int llllllllllllIllllIlllIlIIIIIlIlI, final ClassResolver llllllllllllIllllIlllIlIIIIIllII) {
        super(llllllllllllIllllIlllIlIIIIIlIlI, ObjectDecoder.lIlllIllIIlllI[1], ObjectDecoder.lIlllIllIIlllI[2], ObjectDecoder.lIlllIllIIlllI[1], ObjectDecoder.lIlllIllIIlllI[2]);
        this.classResolver = llllllllllllIllllIlllIlIIIIIllII;
    }
    
    static {
        lIIIIIllIIllIlIl();
    }
    
    @Override
    protected Object decode(final ChannelHandlerContext llllllllllllIllllIlllIlIIIIIIIII, final ByteBuf llllllllllllIllllIlllIIlllllIlll) throws Exception {
        final ByteBuf llllllllllllIllllIlllIIlllllllIl = (ByteBuf)super.decode(llllllllllllIllllIlllIlIIIIIIIII, llllllllllllIllllIlllIIlllllIlll);
        if (lIIIIIllIIllIlll(llllllllllllIllllIlllIIlllllllIl)) {
            return null;
        }
        final ObjectInputStream llllllllllllIllllIlllIIllllllIll = new CompactObjectInputStream(new ByteBufInputStream(llllllllllllIllllIlllIIlllllllIl), this.classResolver);
        final Object llllllllllllIllllIlllIIllllllIlI = llllllllllllIllllIlllIIllllllIll.readObject();
        llllllllllllIllllIlllIIllllllIll.close();
        return llllllllllllIllllIlllIIllllllIlI;
    }
    
    @Override
    protected ByteBuf extractFrame(final ChannelHandlerContext llllllllllllIllllIlllIIllllIlIlI, final ByteBuf llllllllllllIllllIlllIIllllIIIlI, final int llllllllllllIllllIlllIIllllIIllI, final int llllllllllllIllllIlllIIllllIIlII) {
        return llllllllllllIllllIlllIIllllIIIlI.slice(llllllllllllIllllIlllIIllllIIllI, llllllllllllIllllIlllIIllllIIlII);
    }
    
    private static boolean lIIIIIllIIllIlll(final Object llllllllllllIllllIlllIIlllIllIII) {
        return llllllllllllIllllIlllIIlllIllIII == null;
    }
    
    public ObjectDecoder(final ClassResolver llllllllllllIllllIlllIlIIIIlIIlI) {
        this(ObjectDecoder.lIlllIllIIlllI[0], llllllllllllIllllIlllIlIIIIlIIlI);
    }
    
    private static void lIIIIIllIIllIlIl() {
        (lIlllIllIIlllI = new int[3])[0] = (0xFFFFD6BE & 0x102941);
        ObjectDecoder.lIlllIllIIlllI[1] = ((0xF2 ^ 0xB4 ^ (0x50 ^ 0x28)) & (0x48 ^ 0x76 ^ ((0x39 ^ 0x36) & ~(0x7 ^ 0x8)) ^ -" ".length()));
        ObjectDecoder.lIlllIllIIlllI[2] = (0x15 ^ 0x11);
    }
}
