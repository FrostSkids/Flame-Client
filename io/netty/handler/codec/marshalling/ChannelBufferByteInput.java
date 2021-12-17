// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import java.io.IOException;
import io.netty.buffer.ByteBuf;
import org.jboss.marshalling.ByteInput;

class ChannelBufferByteInput implements ByteInput
{
    private static final /* synthetic */ int[] llIIIlIIIlIIIl;
    private final /* synthetic */ ByteBuf buffer;
    
    private static void lIIIlIIIlIllllII() {
        (llIIIlIIIlIIIl = new int[3])[0] = (0x6D ^ 0xC) + (144 + 1 - 16 + 93) - (0x48 ^ 0xF) + (0x7 ^ 0x0);
        ChannelBufferByteInput.llIIIlIIIlIIIl[1] = -" ".length();
        ChannelBufferByteInput.llIIIlIIIlIIIl[2] = ((0x43 ^ 0x70) & ~(0x70 ^ 0x43));
    }
    
    private static boolean lIIIlIIIllIIIIII(final int llllllllllllIlllIllIIIllIlIlIlII) {
        return llllllllllllIlllIllIIIllIlIlIlII < 0;
    }
    
    private static int lIIIlIIIlIllllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIIIlIIIlIllllII();
    }
    
    public long skip(long llllllllllllIlllIllIIIllIlIllIll) throws IOException {
        final int llllllllllllIlllIllIIIllIlIlllIl = this.buffer.readableBytes();
        if (lIIIlIIIllIIIIII(lIIIlIIIlIllllll(llllllllllllIlllIllIIIllIlIlllIl, (long)llllllllllllIlllIllIIIllIlIllIll))) {
            llllllllllllIlllIllIIIllIlIllIll = llllllllllllIlllIllIIIllIlIlllIl;
        }
        this.buffer.readerIndex((int)((long)this.buffer.readerIndex() + llllllllllllIlllIllIIIllIlIllIll));
        "".length();
        return (long)llllllllllllIlllIllIIIllIlIllIll;
    }
    
    private static boolean lIIIlIIIlIllllIl(final int llllllllllllIlllIllIIIllIlIllIII) {
        return llllllllllllIlllIllIIIllIlIllIII != 0;
    }
    
    public int read() throws IOException {
        if (lIIIlIIIlIllllIl(this.buffer.isReadable() ? 1 : 0)) {
            return this.buffer.readByte() & ChannelBufferByteInput.llIIIlIIIlIIIl[0];
        }
        return ChannelBufferByteInput.llIIIlIIIlIIIl[1];
    }
    
    public int read(final byte[] llllllllllllIlllIllIIIllIllIIllI, final int llllllllllllIlllIllIIIllIllIIlIl, int llllllllllllIlllIllIIIllIllIIlII) throws IOException {
        final int llllllllllllIlllIllIIIllIllIlIII = this.available();
        if (lIIIlIIIlIlllllI(llllllllllllIlllIllIIIllIllIlIII)) {
            return ChannelBufferByteInput.llIIIlIIIlIIIl[1];
        }
        llllllllllllIlllIllIIIllIllIIlII = Math.min(llllllllllllIlllIllIIIllIllIlIII, llllllllllllIlllIllIIIllIllIIlII);
        this.buffer.readBytes(llllllllllllIlllIllIIIllIllIIllI, llllllllllllIlllIllIIIllIllIIlIl, llllllllllllIlllIllIIIllIllIIlII);
        "".length();
        return llllllllllllIlllIllIIIllIllIIlII;
    }
    
    public int read(final byte[] llllllllllllIlllIllIIIllIlllIlII) throws IOException {
        return this.read(llllllllllllIlllIllIIIllIlllIlII, ChannelBufferByteInput.llIIIlIIIlIIIl[2], llllllllllllIlllIllIIIllIlllIlII.length);
    }
    
    private static boolean lIIIlIIIlIlllllI(final int llllllllllllIlllIllIIIllIlIlIllI) {
        return llllllllllllIlllIllIIIllIlIlIllI == 0;
    }
    
    public void close() throws IOException {
    }
    
    public int available() throws IOException {
        return this.buffer.readableBytes();
    }
    
    ChannelBufferByteInput(final ByteBuf llllllllllllIlllIllIIIllIlllllll) {
        this.buffer = llllllllllllIlllIllIIIllIlllllll;
    }
}
