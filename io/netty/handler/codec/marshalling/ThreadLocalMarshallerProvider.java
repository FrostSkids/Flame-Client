// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshaller;
import io.netty.util.concurrent.FastThreadLocal;

public class ThreadLocalMarshallerProvider implements MarshallerProvider
{
    private final /* synthetic */ FastThreadLocal<Marshaller> marshallers;
    private final /* synthetic */ MarshallerFactory factory;
    private final /* synthetic */ MarshallingConfiguration config;
    
    private static boolean lIlIllIIlIIIIlI(final Object lllllllllllllIlIllIIIllIIlIIllII) {
        return lllllllllllllIlIllIIIllIIlIIllII == null;
    }
    
    @Override
    public Marshaller getMarshaller(final ChannelHandlerContext lllllllllllllIlIllIIIllIIlIlIIIl) throws Exception {
        Marshaller lllllllllllllIlIllIIIllIIlIlIIII = this.marshallers.get();
        if (lIlIllIIlIIIIlI(lllllllllllllIlIllIIIllIIlIlIIII)) {
            lllllllllllllIlIllIIIllIIlIlIIII = this.factory.createMarshaller(this.config);
            this.marshallers.set(lllllllllllllIlIllIIIllIIlIlIIII);
        }
        return lllllllllllllIlIllIIIllIIlIlIIII;
    }
    
    public ThreadLocalMarshallerProvider(final MarshallerFactory lllllllllllllIlIllIIIllIIlIllIIl, final MarshallingConfiguration lllllllllllllIlIllIIIllIIlIllIII) {
        this.marshallers = new FastThreadLocal<Marshaller>();
        this.factory = lllllllllllllIlIllIIIllIIlIllIIl;
        this.config = lllllllllllllIlIllIIIllIIlIllIII;
    }
}
