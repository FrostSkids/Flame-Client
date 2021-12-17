// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import io.netty.util.concurrent.SingleThreadEventExecutor;
import java.util.ArrayDeque;
import io.netty.channel.DefaultChannelConfig;
import io.netty.channel.SingleThreadEventLoop;
import io.netty.channel.EventLoop;
import io.netty.channel.Channel;
import java.net.SocketAddress;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import java.util.Queue;
import io.netty.channel.AbstractServerChannel;

public class LocalServerChannel extends AbstractServerChannel
{
    private volatile /* synthetic */ LocalAddress localAddress;
    private static final /* synthetic */ int[] lIIIIIlIllIlll;
    private final /* synthetic */ Queue<Object> inboundBuffer;
    private volatile /* synthetic */ boolean acceptInProgress;
    private final /* synthetic */ Runnable shutdownHook;
    private final /* synthetic */ ChannelConfig config;
    private volatile /* synthetic */ int state;
    
    private static boolean lIllIllIlIIIlIl(final Object lllllllllllllIlIIlllIIlIllIIlIIl) {
        return lllllllllllllIlIIlllIIlIllIIlIIl == null;
    }
    
    @Override
    protected void doBeginRead() throws Exception {
        if (lIllIllIlIIIlII(this.acceptInProgress ? 1 : 0)) {
            return;
        }
        final Queue<Object> lllllllllllllIlIIlllIIlIllllllll = this.inboundBuffer;
        if (lIllIllIlIIIlII(lllllllllllllIlIIlllIIlIllllllll.isEmpty() ? 1 : 0)) {
            this.acceptInProgress = (LocalServerChannel.lIIIIIlIllIlll[1] != 0);
            return;
        }
        final ChannelPipeline lllllllllllllIlIIlllIIlIlllllllI = this.pipeline();
        do {
            final Object lllllllllllllIlIIlllIIllIIIIIIIl = lllllllllllllIlIIlllIIlIllllllll.poll();
            if (lIllIllIlIIIlIl(lllllllllllllIlIIlllIIllIIIIIIIl)) {
                "".length();
                if ((139 + 175 - 205 + 68 ^ 37 + 135 - 13 + 22) < 0) {
                    return;
                }
                lllllllllllllIlIIlllIIlIlllllllI.fireChannelReadComplete();
                "".length();
            }
            else {
                lllllllllllllIlIIlllIIlIlllllllI.fireChannelRead(lllllllllllllIlIIlllIIllIIIIIIIl);
                "".length();
                "".length();
            }
        } while (null == null);
    }
    
    private static boolean lIllIllIlIIIIIl(final int lllllllllllllIlIIlllIIlIllIlIllI, final int lllllllllllllIlIIlllIIlIllIlIlIl) {
        return lllllllllllllIlIIlllIIlIllIlIllI == lllllllllllllIlIIlllIIlIllIlIlIl;
    }
    
    @Override
    public ChannelConfig config() {
        return this.config;
    }
    
    private void serve0(final LocalChannel lllllllllllllIlIIlllIIlIlllIlIIl) {
        this.inboundBuffer.add(lllllllllllllIlIIlllIIlIlllIlIIl);
        "".length();
        if (lIllIllIlIIIlII(this.acceptInProgress ? 1 : 0)) {
            this.acceptInProgress = (LocalServerChannel.lIIIIIlIllIlll[2] != 0);
            final ChannelPipeline lllllllllllllIlIIlllIIlIlllIlIll = this.pipeline();
            do {
                final Object lllllllllllllIlIIlllIIlIlllIllII = this.inboundBuffer.poll();
                if (lIllIllIlIIIlIl(lllllllllllllIlIIlllIIlIlllIllII)) {
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return;
                    }
                    lllllllllllllIlIIlllIIlIlllIlIll.fireChannelReadComplete();
                    "".length();
                }
                else {
                    lllllllllllllIlIIlllIIlIlllIlIll.fireChannelRead(lllllllllllllIlIIlllIIlIlllIllII);
                    "".length();
                    "".length();
                }
            } while (" ".length() != -" ".length());
        }
    }
    
    @Override
    public LocalAddress localAddress() {
        return (LocalAddress)super.localAddress();
    }
    
    static {
        lIllIllIIllllll();
    }
    
    @Override
    protected void doClose() throws Exception {
        if (lIllIllIlIIIIlI(this.state, LocalServerChannel.lIIIIIlIllIlll[1])) {
            if (lIllIllIlIIIIll(this.localAddress)) {
                LocalChannelRegistry.unregister(this.localAddress);
                this.localAddress = null;
            }
            this.state = LocalServerChannel.lIIIIIlIllIlll[0];
        }
    }
    
    private static boolean lIllIllIlIIIIll(final Object lllllllllllllIlIIlllIIlIllIIlIll) {
        return lllllllllllllIlIIlllIIlIllIIlIll != null;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIlIIlllIIllIIIIllII) throws Exception {
        this.localAddress = LocalChannelRegistry.register(this, this.localAddress, lllllllllllllIlIIlllIIllIIIIllII);
        this.state = LocalServerChannel.lIIIIIlIllIlll[1];
    }
    
    @Override
    protected boolean isCompatible(final EventLoop lllllllllllllIlIIlllIIllIIIllIII) {
        return lllllllllllllIlIIlllIIllIIIllIII instanceof SingleThreadEventLoop;
    }
    
    public LocalServerChannel() {
        this.config = new DefaultChannelConfig(this);
        this.inboundBuffer = new ArrayDeque<Object>();
        this.shutdownHook = new Runnable() {
            @Override
            public void run() {
                LocalServerChannel.this.unsafe().close(LocalServerChannel.this.unsafe().voidPromise());
            }
        };
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (lIllIllIlIIIIIl(this.state, LocalServerChannel.lIIIIIlIllIlll[1])) {
            n = LocalServerChannel.lIIIIIlIllIlll[1];
            "".length();
            if (((0x3 ^ 0x38) & ~(0xA4 ^ 0x9F)) < 0) {
                return ((0xF8 ^ 0xAA) & ~(0x5C ^ 0xE)) != 0x0;
            }
        }
        else {
            n = LocalServerChannel.lIIIIIlIllIlll[2];
        }
        return n != 0;
    }
    
    LocalChannel serve(final LocalChannel lllllllllllllIlIIlllIIlIllllIIlI) {
        final LocalChannel lllllllllllllIlIIlllIIlIllllIlII = new LocalChannel(this, lllllllllllllIlIIlllIIlIllllIIlI);
        if (lIllIllIlIIIlII(this.eventLoop().inEventLoop() ? 1 : 0)) {
            this.serve0(lllllllllllllIlIIlllIIlIllllIlII);
            "".length();
            if ("  ".length() == (0xBF ^ 0xBB)) {
                return null;
            }
        }
        else {
            this.eventLoop().execute(new Runnable() {
                @Override
                public void run() {
                    LocalServerChannel.this.serve0(lllllllllllllIlIIlllIIlIllllIlII);
                }
            });
        }
        return lllllllllllllIlIIlllIIlIllllIlII;
    }
    
    @Override
    protected void doRegister() throws Exception {
        ((SingleThreadEventExecutor)this.eventLoop()).addShutdownHook(this.shutdownHook);
    }
    
    @Override
    protected void doDeregister() throws Exception {
        ((SingleThreadEventExecutor)this.eventLoop()).removeShutdownHook(this.shutdownHook);
    }
    
    private static boolean lIllIllIlIIIIlI(final int lllllllllllllIlIIlllIIlIllIIlllI, final int lllllllllllllIlIIlllIIlIllIIllIl) {
        return lllllllllllllIlIIlllIIlIllIIlllI <= lllllllllllllIlIIlllIIlIllIIllIl;
    }
    
    private static boolean lIllIllIlIIIlII(final int lllllllllllllIlIIlllIIlIllIIIlll) {
        return lllllllllllllIlIIlllIIlIllIIIlll != 0;
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (lIllIllIlIIIIII(this.state, LocalServerChannel.lIIIIIlIllIlll[0])) {
            n = LocalServerChannel.lIIIIIlIllIlll[1];
            "".length();
            if (null != null) {
                return ((0x28 ^ 0x16) & ~(0x62 ^ 0x5C)) != 0x0;
            }
        }
        else {
            n = LocalServerChannel.lIIIIIlIllIlll[2];
        }
        return n != 0;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.localAddress;
    }
    
    private static boolean lIllIllIlIIIIII(final int lllllllllllllIlIIlllIIlIllIlIIlI, final int lllllllllllllIlIIlllIIlIllIlIIIl) {
        return lllllllllllllIlIIlllIIlIllIlIIlI < lllllllllllllIlIIlllIIlIllIlIIIl;
    }
    
    private static void lIllIllIIllllll() {
        (lIIIIIlIllIlll = new int[3])[0] = "  ".length();
        LocalServerChannel.lIIIIIlIllIlll[1] = " ".length();
        LocalServerChannel.lIIIIIlIllIlll[2] = ((0xCB ^ 0x8C) & ~(0xE9 ^ 0xAE));
    }
    
    @Override
    public LocalAddress remoteAddress() {
        return (LocalAddress)super.remoteAddress();
    }
}
