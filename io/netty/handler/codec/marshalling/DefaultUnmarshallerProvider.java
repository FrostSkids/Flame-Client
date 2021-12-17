// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.Unmarshaller;
import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;

public class DefaultUnmarshallerProvider implements UnmarshallerProvider
{
    private final /* synthetic */ MarshallingConfiguration config;
    private final /* synthetic */ MarshallerFactory factory;
    
    @Override
    public Unmarshaller getUnmarshaller(final ChannelHandlerContext llllllllllllIlIlllIIllllIIlIIlII) throws Exception {
        return this.factory.createUnmarshaller(this.config);
    }
    
    public DefaultUnmarshallerProvider(final MarshallerFactory llllllllllllIlIlllIIllllIIlIlIll, final MarshallingConfiguration llllllllllllIlIlllIIllllIIlIlIlI) {
        this.factory = llllllllllllIlIlllIIllllIIlIlIll;
        this.config = llllllllllllIlIlllIIllllIIlIlIlI;
    }
}
