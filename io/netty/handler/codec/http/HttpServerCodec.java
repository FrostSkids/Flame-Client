// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.channel.CombinedChannelDuplexHandler;

public final class HttpServerCodec extends CombinedChannelDuplexHandler<HttpRequestDecoder, HttpResponseEncoder>
{
    private static final /* synthetic */ int[] lllllIIIIIlIl;
    
    public HttpServerCodec(final int lllllllllllllIlIllIIIlIlIllIIIIl, final int lllllllllllllIlIllIIIlIlIllIIIII, final int lllllllllllllIlIllIIIlIlIlIlllll, final boolean lllllllllllllIlIllIIIlIlIlIllllI) {
        super(new HttpRequestDecoder(lllllllllllllIlIllIIIlIlIllIIIIl, lllllllllllllIlIllIIIlIlIllIIIII, lllllllllllllIlIllIIIlIlIlIlllll, lllllllllllllIlIllIIIlIlIlIllllI), new HttpResponseEncoder());
    }
    
    static {
        lIlIllIIlIlIllI();
    }
    
    public HttpServerCodec() {
        this(HttpServerCodec.lllllIIIIIlIl[0], HttpServerCodec.lllllIIIIIlIl[1], HttpServerCodec.lllllIIIIIlIl[1]);
    }
    
    private static void lIlIllIIlIlIllI() {
        (lllllIIIIIlIl = new int[2])[0] = (-(0xFFFFB6E9 & 0x4D5F) & (0xFFFF96F8 & 0x7D4F));
        HttpServerCodec.lllllIIIIIlIl[1] = (-(0xFFFFFDFC & 0x5793) & (0xFFFFF5EF & 0x7F9F));
    }
    
    public HttpServerCodec(final int lllllllllllllIlIllIIIlIlIllIllll, final int lllllllllllllIlIllIIIlIlIllIlllI, final int lllllllllllllIlIllIIIlIlIllIllIl) {
        super(new HttpRequestDecoder(lllllllllllllIlIllIIIlIlIllIllll, lllllllllllllIlIllIIIlIlIllIlllI, lllllllllllllIlIllIIIlIlIllIllIl), new HttpResponseEncoder());
    }
}
