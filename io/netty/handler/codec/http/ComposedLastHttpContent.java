// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;
import io.netty.handler.codec.DecoderResult;

final class ComposedLastHttpContent implements LastHttpContent
{
    private static final /* synthetic */ int[] lIlIlIlIlllIlI;
    private /* synthetic */ DecoderResult result;
    private final /* synthetic */ HttpHeaders trailingHeaders;
    
    static {
        lllIlllIllIIIlI();
    }
    
    @Override
    public DecoderResult getDecoderResult() {
        return this.result;
    }
    
    @Override
    public LastHttpContent retain() {
        return this;
    }
    
    ComposedLastHttpContent(final HttpHeaders lllllllllllllIIIlIIIIIlIIIllllll) {
        this.trailingHeaders = lllllllllllllIIIlIIIIIlIIIllllll;
    }
    
    @Override
    public HttpHeaders trailingHeaders() {
        return this.trailingHeaders;
    }
    
    @Override
    public int refCnt() {
        return ComposedLastHttpContent.lIlIlIlIlllIlI[0];
    }
    
    @Override
    public HttpContent duplicate() {
        return this.copy();
    }
    
    @Override
    public LastHttpContent copy() {
        final LastHttpContent lllllllllllllIIIlIIIIIlIIIllIllI = new DefaultLastHttpContent(Unpooled.EMPTY_BUFFER);
        lllllllllllllIIIlIIIIIlIIIllIllI.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIIIlIIIIIlIIIllIllI;
    }
    
    @Override
    public void setDecoderResult(final DecoderResult lllllllllllllIIIlIIIIIlIIIlIIIII) {
        this.result = lllllllllllllIIIlIIIIIlIIIlIIIII;
    }
    
    @Override
    public boolean release() {
        return ComposedLastHttpContent.lIlIlIlIlllIlI[1] != 0;
    }
    
    private static void lllIlllIllIIIlI() {
        (lIlIlIlIlllIlI = new int[2])[0] = " ".length();
        ComposedLastHttpContent.lIlIlIlIlllIlI[1] = ((138 + 60 - 196 + 165 ^ 177 + 56 - 120 + 70) & (78 + 75 - 74 + 91 ^ 169 + 110 - 173 + 80 ^ -" ".length()));
    }
    
    @Override
    public ByteBuf content() {
        return Unpooled.EMPTY_BUFFER;
    }
    
    @Override
    public boolean release(final int lllllllllllllIIIlIIIIIlIIIIlllII) {
        return ComposedLastHttpContent.lIlIlIlIlllIlI[1] != 0;
    }
    
    @Override
    public LastHttpContent retain(final int lllllllllllllIIIlIIIIIlIIIllIIIl) {
        return this;
    }
}
