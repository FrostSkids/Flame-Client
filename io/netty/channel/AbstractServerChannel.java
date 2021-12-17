// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.net.SocketAddress;

public abstract class AbstractServerChannel extends AbstractChannel implements ServerChannel
{
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ int[] lIIIlIlllllIlI;
    
    private static void llIIIIlIIlIIlIl() {
        (lIIIlIlllllIlI = new int[1])[0] = ((0x3E ^ 0x55 ^ (0x77 ^ 0x55)) & (0x9D ^ 0xB2 ^ (0x33 ^ 0x55) ^ -" ".length()));
    }
    
    @Override
    public SocketAddress remoteAddress() {
        return null;
    }
    
    static {
        llIIIIlIIlIIlIl();
        METADATA = new ChannelMetadata((boolean)(AbstractServerChannel.lIIIlIlllllIlI[0] != 0));
    }
    
    @Override
    protected AbstractUnsafe newUnsafe() {
        return new DefaultServerUnsafe();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public ChannelMetadata metadata() {
        return AbstractServerChannel.METADATA;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIlIIIIlIIlIIIlllIlI) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    protected AbstractServerChannel() {
        super(null);
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object lllllllllllllIlIIIIlIIlIIIlllIII) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    private final class DefaultServerUnsafe extends AbstractUnsafe
    {
        @Override
        public void connect(final SocketAddress llllllllllllIlIlllIIlIllIIlllIll, final SocketAddress llllllllllllIlIlllIIlIllIIlllIlI, final ChannelPromise llllllllllllIlIlllIIlIllIIllIlll) {
            this.safeSetFailure(llllllllllllIlIlllIIlIllIIllIlll, new UnsupportedOperationException());
        }
    }
}
