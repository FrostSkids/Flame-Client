// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.Marshaller;
import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.MarshallerFactory;

public class DefaultMarshallerProvider implements MarshallerProvider
{
    private final /* synthetic */ MarshallerFactory factory;
    private final /* synthetic */ MarshallingConfiguration config;
    
    @Override
    public Marshaller getMarshaller(final ChannelHandlerContext lllllllllllllIlIIIlIIIlllIllIIIl) throws Exception {
        return this.factory.createMarshaller(this.config);
    }
    
    public DefaultMarshallerProvider(final MarshallerFactory lllllllllllllIlIIIlIIIlllIlllIII, final MarshallingConfiguration lllllllllllllIlIIIlIIIlllIllIlll) {
        this.factory = lllllllllllllIlIIIlIIIlllIlllIII;
        this.config = lllllllllllllIlIIIlIIIlllIllIlll;
    }
}
