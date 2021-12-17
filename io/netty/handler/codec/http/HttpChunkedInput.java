// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.stream.ChunkedInput;

public class HttpChunkedInput implements ChunkedInput<HttpContent>
{
    private static final /* synthetic */ int[] lIIIlIlllIllIl;
    private final /* synthetic */ LastHttpContent lastHttpContent;
    private final /* synthetic */ ChunkedInput<ByteBuf> input;
    private /* synthetic */ boolean sentLastChunk;
    
    public HttpChunkedInput(final ChunkedInput<ByteBuf> lllllllllllllIlIIIIlIIllIllIIIll, final LastHttpContent lllllllllllllIlIIIIlIIllIllIIlIl) {
        this.input = lllllllllllllIlIIIIlIIllIllIIIll;
        this.lastHttpContent = lllllllllllllIlIIIIlIIllIllIIlIl;
    }
    
    private static boolean llIIIIlIIIIlllI(final int lllllllllllllIlIIIIlIIllIlIIlIll) {
        return lllllllllllllIlIIIIlIIllIlIIlIll != 0;
    }
    
    @Override
    public HttpContent readChunk(final ChannelHandlerContext lllllllllllllIlIIIIlIIllIlIlIllI) throws Exception {
        if (!llIIIIlIIIIlllI(this.input.isEndOfInput() ? 1 : 0)) {
            final ByteBuf lllllllllllllIlIIIIlIIllIlIllIII = this.input.readChunk(lllllllllllllIlIIIIlIIllIlIlIllI);
            return new DefaultHttpContent(lllllllllllllIlIIIIlIIllIlIllIII);
        }
        if (llIIIIlIIIIlllI(this.sentLastChunk ? 1 : 0)) {
            return null;
        }
        this.sentLastChunk = (HttpChunkedInput.lIIIlIlllIllIl[1] != 0);
        return this.lastHttpContent;
    }
    
    @Override
    public boolean isEndOfInput() throws Exception {
        if (llIIIIlIIIIlllI(this.input.isEndOfInput() ? 1 : 0)) {
            return this.sentLastChunk;
        }
        return HttpChunkedInput.lIIIlIlllIllIl[0] != 0;
    }
    
    public HttpChunkedInput(final ChunkedInput<ByteBuf> lllllllllllllIlIIIIlIIllIllIlIll) {
        this.input = lllllllllllllIlIIIIlIIllIllIlIll;
        this.lastHttpContent = LastHttpContent.EMPTY_LAST_CONTENT;
    }
    
    @Override
    public void close() throws Exception {
        this.input.close();
    }
    
    private static void llIIIIlIIIIllIl() {
        (lIIIlIlllIllIl = new int[2])[0] = ((0x1A ^ 0x60 ^ (0x0 ^ 0x6A)) & (0x2B ^ 0x57 ^ (0xFF ^ 0x93) ^ -" ".length()));
        HttpChunkedInput.lIIIlIlllIllIl[1] = " ".length();
    }
    
    static {
        llIIIIlIIIIllIl();
    }
}
