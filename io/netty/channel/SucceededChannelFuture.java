// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;

final class SucceededChannelFuture extends CompleteChannelFuture
{
    private static final /* synthetic */ int[] lIlIllllllIIlI;
    
    SucceededChannelFuture(final Channel lllllllllllllIIIIlIIlIlllIllIlIl, final EventExecutor lllllllllllllIIIIlIIlIlllIllIlII) {
        super(lllllllllllllIIIIlIIlIlllIllIlIl, lllllllllllllIIIIlIIlIlllIllIlII);
    }
    
    static {
        llllIlIlIllllll();
    }
    
    @Override
    public boolean isSuccess() {
        return SucceededChannelFuture.lIlIllllllIIlI[0] != 0;
    }
    
    private static void llllIlIlIllllll() {
        (lIlIllllllIIlI = new int[1])[0] = " ".length();
    }
    
    @Override
    public Throwable cause() {
        return null;
    }
}
