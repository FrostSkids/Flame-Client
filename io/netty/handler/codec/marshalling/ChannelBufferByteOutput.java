// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import java.io.IOException;
import io.netty.buffer.ByteBuf;
import org.jboss.marshalling.ByteOutput;

class ChannelBufferByteOutput implements ByteOutput
{
    private final /* synthetic */ ByteBuf buffer;
    
    public void write(final byte[] lllllllllllllIIIIlllllIlIIllllll, final int lllllllllllllIIIIlllllIlIIlllllI, final int lllllllllllllIIIIlllllIlIIlllIIl) throws IOException {
        this.buffer.writeBytes(lllllllllllllIIIIlllllIlIIllllll, lllllllllllllIIIIlllllIlIIlllllI, lllllllllllllIIIIlllllIlIIlllIIl);
        "".length();
    }
    
    public void write(final int lllllllllllllIIIIlllllIlIlIIlIll) throws IOException {
        this.buffer.writeByte(lllllllllllllIIIIlllllIlIlIIlIll);
        "".length();
    }
    
    ChannelBufferByteOutput(final ByteBuf lllllllllllllIIIIlllllIlIlIlIlIl) {
        this.buffer = lllllllllllllIIIIlllllIlIlIlIlIl;
    }
    
    ByteBuf getBuffer() {
        return this.buffer;
    }
    
    public void write(final byte[] lllllllllllllIIIIlllllIlIlIIIlll) throws IOException {
        this.buffer.writeBytes(lllllllllllllIIIIlllllIlIlIIIlll);
        "".length();
    }
    
    public void flush() throws IOException {
    }
    
    public void close() throws IOException {
    }
}
