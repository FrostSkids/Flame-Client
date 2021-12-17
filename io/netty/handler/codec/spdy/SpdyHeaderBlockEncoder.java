// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;
import io.netty.util.internal.PlatformDependent;

abstract class SpdyHeaderBlockEncoder
{
    private static final /* synthetic */ int[] lllIIIllIIlIll;
    
    static {
        lIIlllIllllIlIII();
    }
    
    private static void lIIlllIllllIlIII() {
        (lllIIIllIIlIll = new int[1])[0] = (153 + 53 - 190 + 151 ^ 73 + 66 + 19 + 2);
    }
    
    abstract void end();
    
    static SpdyHeaderBlockEncoder newInstance(final SpdyVersion llllllllllllIllIIIIIIIIIlllIIlII, final int llllllllllllIllIIIIIIIIIlllIIIll, final int llllllllllllIllIIIIIIIIIlllIIIlI, final int llllllllllllIllIIIIIIIIIlllIIIIl) {
        if (lIIlllIllllIlIIl(PlatformDependent.javaVersion(), SpdyHeaderBlockEncoder.lllIIIllIIlIll[0])) {
            return new SpdyHeaderBlockZlibEncoder(llllllllllllIllIIIIIIIIIlllIIlII, llllllllllllIllIIIIIIIIIlllIIIll);
        }
        return new SpdyHeaderBlockJZlibEncoder(llllllllllllIllIIIIIIIIIlllIIlII, llllllllllllIllIIIIIIIIIlllIIIll, llllllllllllIllIIIIIIIIIlllIIIlI, llllllllllllIllIIIIIIIIIlllIIIIl);
    }
    
    abstract ByteBuf encode(final SpdyHeadersFrame p0) throws Exception;
    
    private static boolean lIIlllIllllIlIIl(final int llllllllllllIllIIIIIIIIIllIllIlI, final int llllllllllllIllIIIIIIIIIllIllIIl) {
        return llllllllllllIllIIIIIIIIIllIllIlI >= llllllllllllIllIIIIIIIIIllIllIIl;
    }
}
