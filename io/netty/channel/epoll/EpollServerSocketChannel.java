// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.AbstractChannel;
import io.netty.channel.EventLoop;
import io.netty.channel.socket.ServerSocketChannelConfig;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import io.netty.channel.socket.ServerSocketChannel;

public final class EpollServerSocketChannel extends AbstractEpollChannel implements ServerSocketChannel
{
    private final /* synthetic */ EpollServerSocketChannelConfig config;
    private volatile /* synthetic */ InetSocketAddress local;
    private static final /* synthetic */ int[] llIIIllIllIIll;
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIlllIlIIlIIIIIlllIII) throws Exception {
        final InetSocketAddress llllllllllllIlllIlIIlIIIIIlllIlI = (InetSocketAddress)llllllllllllIlllIlIIlIIIIIlllIII;
        AbstractEpollChannel.checkResolvable(llllllllllllIlllIlIIlIIIIIlllIlI);
        Native.bind(this.fd, llllllllllllIlllIlIIlIIIIIlllIlI.getAddress(), llllllllllllIlllIlIIlIIIIIlllIlI.getPort());
        this.local = Native.localAddress(this.fd);
        Native.listen(this.fd, this.config.getBacklog());
        this.active = (EpollServerSocketChannel.llIIIllIllIIll[1] != 0);
    }
    
    private static void lIIIlIlIlIIIlllI() {
        (llIIIllIllIIll = new int[2])[0] = (0xE2 ^ 0xBA ^ (0xD3 ^ 0x8F));
        EpollServerSocketChannel.llIIIllIllIIll[1] = " ".length();
    }
    
    @Override
    protected InetSocketAddress remoteAddress0() {
        return null;
    }
    
    @Override
    public EpollServerSocketChannelConfig config() {
        return this.config;
    }
    
    public EpollServerSocketChannel() {
        super(Native.socketStreamFd(), EpollServerSocketChannel.llIIIllIllIIll[0]);
        this.config = new EpollServerSocketChannelConfig(this);
    }
    
    @Override
    protected Object filterOutboundMessage(final Object llllllllllllIlllIlIIlIIIIIlIlIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected boolean isCompatible(final EventLoop llllllllllllIlllIlIIlIIIIlIIIIII) {
        return llllllllllllIlllIlIIlIIIIlIIIIII instanceof EpollEventLoop;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer llllllllllllIlllIlIIlIIIIIlIlIll) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected AbstractEpollUnsafe newUnsafe() {
        return new EpollServerSocketUnsafe();
    }
    
    static {
        lIIIlIlIlIIIlllI();
    }
    
    @Override
    protected InetSocketAddress localAddress0() {
        return this.local;
    }
    
    final class EpollServerSocketUnsafe extends AbstractEpollUnsafe
    {
        static final /* synthetic */ boolean $assertionsDisabled;
        private static final /* synthetic */ int[] llIIllIlIlllll;
        
        @Override
        void epollInReady() {
            if (lIIIlllIllllIllI(EpollServerSocketUnsafe.$assertionsDisabled ? 1 : 0) && lIIIlllIllllIllI(EpollServerSocketChannel.this.eventLoop().inEventLoop() ? 1 : 0)) {
                throw new AssertionError();
            }
            final ChannelPipeline llllllllllllIlllIIIIIIIIlIIlIlIl = EpollServerSocketChannel.this.pipeline();
            Throwable llllllllllllIlllIIIIIIIIlIIlIlII = null;
            try {
                Label_0226: {
                    try {
                        do {
                            final int llllllllllllIlllIIIIIIIIlIIllIII = Native.accept(EpollServerSocketChannel.this.fd);
                            if (lIIIlllIllllIlll(llllllllllllIlllIIIIIIIIlIIllIII, EpollServerSocketUnsafe.llIIllIlIlllll[0])) {
                                "".length();
                                if (-" ".length() == ((0xB2 ^ 0x88) & ~(0xE ^ 0x34))) {
                                    return;
                                }
                                "".length();
                                if ("  ".length() <= " ".length()) {
                                    return;
                                }
                                break Label_0226;
                            }
                            else {
                                try {
                                    this.readPending = (EpollServerSocketUnsafe.llIIllIlIlllll[1] != 0);
                                    llllllllllllIlllIIIIIIIIlIIlIlIl.fireChannelRead(new EpollSocketChannel(EpollServerSocketChannel.this, llllllllllllIlllIIIIIIIIlIIllIII));
                                    "".length();
                                    "".length();
                                    if (((0x1F ^ 0x13) & ~(0x62 ^ 0x6E)) < 0) {
                                        return;
                                    }
                                }
                                catch (Throwable llllllllllllIlllIIIIIIIIlIIllIIl) {
                                    llllllllllllIlllIIIIIIIIlIIlIlIl.fireChannelReadComplete();
                                    "".length();
                                    llllllllllllIlllIIIIIIIIlIIlIlIl.fireExceptionCaught(llllllllllllIlllIIIIIIIIlIIllIIl);
                                    "".length();
                                }
                                "".length();
                            }
                        } while (" ".length() <= "  ".length());
                        return;
                    }
                    catch (Throwable llllllllllllIlllIIIIIIIIlIIlIlll) {
                        llllllllllllIlllIIIIIIIIlIIlIlII = llllllllllllIlllIIIIIIIIlIIlIlll;
                    }
                }
                llllllllllllIlllIIIIIIIIlIIlIlIl.fireChannelReadComplete();
                "".length();
                if (lIIIlllIlllllIII(llllllllllllIlllIIIIIIIIlIIlIlII)) {
                    llllllllllllIlllIIIIIIIIlIIlIlIl.fireExceptionCaught(llllllllllllIlllIIIIIIIIlIIlIlII);
                    "".length();
                }
                if (lIIIlllIllllIllI(EpollServerSocketChannel.this.config.isAutoRead() ? 1 : 0) && lIIIlllIllllIllI(this.readPending ? 1 : 0)) {
                    this.clearEpollIn0();
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
            }
            finally {
                if (lIIIlllIllllIllI(EpollServerSocketChannel.this.config.isAutoRead() ? 1 : 0) && lIIIlllIllllIllI(this.readPending ? 1 : 0)) {
                    this.clearEpollIn0();
                }
            }
        }
        
        private static void lIIIlllIllllIlIl() {
            (llIIllIlIlllll = new int[3])[0] = -" ".length();
            EpollServerSocketUnsafe.llIIllIlIlllll[1] = ((22 + 116 - 57 + 86 ^ 148 + 95 - 178 + 121) & (0xB1 ^ 0xA8 ^ (0xC6 ^ 0xC2) ^ -" ".length()));
            EpollServerSocketUnsafe.llIIllIlIlllll[2] = " ".length();
        }
        
        private static boolean lIIIlllIllllIllI(final int llllllllllllIlllIIIIIIIIlIIIIllI) {
            return llllllllllllIlllIIIIIIIIlIIIIllI == 0;
        }
        
        private static boolean lIIIlllIlllllIII(final Object llllllllllllIlllIIIIIIIIlIIIlIII) {
            return llllllllllllIlllIIIIIIIIlIIIlIII != null;
        }
        
        private static boolean lIIIlllIllllIlll(final int llllllllllllIlllIIIIIIIIlIIIlIll, final int llllllllllllIlllIIIIIIIIlIIIlIlI) {
            return llllllllllllIlllIIIIIIIIlIIIlIll == llllllllllllIlllIIIIIIIIlIIIlIlI;
        }
        
        static {
            lIIIlllIllllIlIl();
            int $assertionsDisabled2;
            if (lIIIlllIllllIllI(EpollServerSocketChannel.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = EpollServerSocketUnsafe.llIIllIlIlllll[2];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = EpollServerSocketUnsafe.llIIllIlIlllll[1];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        @Override
        public void connect(final SocketAddress llllllllllllIlllIIIIIIIIlIlIIIll, final SocketAddress llllllllllllIlllIIIIIIIIlIlIIIlI, final ChannelPromise llllllllllllIlllIIIIIIIIlIlIIIIl) {
            llllllllllllIlllIIIIIIIIlIlIIIIl.setFailure((Throwable)new UnsupportedOperationException());
            "".length();
        }
    }
}
