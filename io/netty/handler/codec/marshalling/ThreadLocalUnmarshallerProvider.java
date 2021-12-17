// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Unmarshaller;
import io.netty.util.concurrent.FastThreadLocal;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;

public class ThreadLocalUnmarshallerProvider implements UnmarshallerProvider
{
    private final /* synthetic */ MarshallingConfiguration config;
    private final /* synthetic */ MarshallerFactory factory;
    private final /* synthetic */ FastThreadLocal<Unmarshaller> unmarshallers;
    
    @Override
    public Unmarshaller getUnmarshaller(final ChannelHandlerContext llllllllllllIlIlllIlIIlllllIIlIl) throws Exception {
        Unmarshaller llllllllllllIlIlllIlIIlllllIIlII = this.unmarshallers.get();
        if (lIlIIIIlIIIllIII(llllllllllllIlIlllIlIIlllllIIlII)) {
            llllllllllllIlIlllIlIIlllllIIlII = this.factory.createUnmarshaller(this.config);
            this.unmarshallers.set(llllllllllllIlIlllIlIIlllllIIlII);
        }
        return llllllllllllIlIlllIlIIlllllIIlII;
    }
    
    private static boolean lIlIIIIlIIIllIII(final Object llllllllllllIlIlllIlIIlllllIIIII) {
        return llllllllllllIlIlllIlIIlllllIIIII == null;
    }
    
    public ThreadLocalUnmarshallerProvider(final MarshallerFactory llllllllllllIlIlllIlIIlllllIlIlI, final MarshallingConfiguration llllllllllllIlIlllIlIIlllllIlIIl) {
        this.unmarshallers = new FastThreadLocal<Unmarshaller>();
        this.factory = llllllllllllIlIlllIlIIlllllIlIlI;
        this.config = llllllllllllIlIlllIlIIlllllIlIIl;
    }
}
