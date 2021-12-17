// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Map;
import java.lang.annotation.Annotation;
import io.netty.util.internal.InternalThreadLocalMap;

public abstract class ChannelHandlerAdapter implements ChannelHandler
{
    @Override
    public void handlerRemoved(final ChannelHandlerContext llllllllllllIllIIIIlIlIIIllIllIl) throws Exception {
    }
    
    public boolean isSharable() {
        final Class<?> llllllllllllIllIIIIlIlIIIlllIlll = this.getClass();
        final Map<Class<?>, Boolean> llllllllllllIllIIIIlIlIIIlllIllI = InternalThreadLocalMap.get().handlerSharableCache();
        Boolean llllllllllllIllIIIIlIlIIIlllIlIl = llllllllllllIllIIIIlIlIIIlllIllI.get(llllllllllllIllIIIIlIlIIIlllIlll);
        if (lIIlllIIllIIIIlI(llllllllllllIllIIIIlIlIIIlllIlIl)) {
            llllllllllllIllIIIIlIlIIIlllIlIl = llllllllllllIllIIIIlIlIIIlllIlll.isAnnotationPresent(Sharable.class);
            llllllllllllIllIIIIlIlIIIlllIllI.put(llllllllllllIllIIIIlIlIIIlllIlll, llllllllllllIllIIIIlIlIIIlllIlIl);
            "".length();
        }
        return llllllllllllIllIIIIlIlIIIlllIlIl;
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllIIIIlIlIIIllIlIIl, final Throwable llllllllllllIllIIIIlIlIIIllIIllI) throws Exception {
        llllllllllllIllIIIIlIlIIIllIlIIl.fireExceptionCaught(llllllllllllIllIIIIlIlIIIllIIllI);
        "".length();
    }
    
    private static boolean lIIlllIIllIIIIlI(final Object llllllllllllIllIIIIlIlIIIllIIlII) {
        return llllllllllllIllIIIIlIlIIIllIIlII == null;
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIllIIIIlIlIIIllIllll) throws Exception {
    }
}
