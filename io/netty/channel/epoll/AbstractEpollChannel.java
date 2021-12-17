// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.channel.Channel;
import io.netty.util.internal.OneTimeTask;
import java.nio.channels.UnresolvedAddressException;
import java.net.InetSocketAddress;
import io.netty.channel.EventLoop;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import io.netty.buffer.ByteBuf;
import java.net.SocketAddress;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.AbstractChannel;

abstract class AbstractEpollChannel extends AbstractChannel
{
    protected /* synthetic */ int flags;
    private static final /* synthetic */ int[] llIIllIlIllIll;
    volatile /* synthetic */ int fd;
    private final /* synthetic */ int readFlag;
    private static final /* synthetic */ ChannelMetadata DATA;
    protected volatile /* synthetic */ boolean active;
    
    @Override
    protected abstract AbstractEpollUnsafe newUnsafe();
    
    @Override
    protected void doRegister() throws Exception {
        final EpollEventLoop llllllllllllIlllIIIIIIIlIIIIllll = (EpollEventLoop)this.eventLoop();
        llllllllllllIlllIIIIIIIlIIIIllll.add(this);
    }
    
    protected final ByteBuf newDirectBuffer(final Object llllllllllllIlllIIIIIIIIlllllIIl, final ByteBuf llllllllllllIlllIIIIIIIIlllllllI) {
        final int llllllllllllIlllIIIIIIIIllllllIl = llllllllllllIlllIIIIIIIIlllllllI.readableBytes();
        if (lIIIlllIllllIIIl(llllllllllllIlllIIIIIIIIllllllIl)) {
            ReferenceCountUtil.safeRelease(llllllllllllIlllIIIIIIIIlllllIIl);
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBufAllocator llllllllllllIlllIIIIIIIIllllllII = this.alloc();
        if (lIIIlllIllllIIlI(llllllllllllIlllIIIIIIIIllllllII.isDirectBufferPooled() ? 1 : 0)) {
            return newDirectBuffer0(llllllllllllIlllIIIIIIIIlllllIIl, llllllllllllIlllIIIIIIIIlllllllI, llllllllllllIlllIIIIIIIIllllllII, llllllllllllIlllIIIIIIIIllllllIl);
        }
        final ByteBuf llllllllllllIlllIIIIIIIIlllllIll = ByteBufUtil.threadLocalDirectBuffer();
        if (lIIIlllIllllIIll(llllllllllllIlllIIIIIIIIlllllIll)) {
            return newDirectBuffer0(llllllllllllIlllIIIIIIIIlllllIIl, llllllllllllIlllIIIIIIIIlllllllI, llllllllllllIlllIIIIIIIIllllllII, llllllllllllIlllIIIIIIIIllllllIl);
        }
        llllllllllllIlllIIIIIIIIlllllIll.writeBytes(llllllllllllIlllIIIIIIIIlllllllI, llllllllllllIlllIIIIIIIIlllllllI.readerIndex(), llllllllllllIlllIIIIIIIIllllllIl);
        "".length();
        ReferenceCountUtil.safeRelease(llllllllllllIlllIIIIIIIIlllllIIl);
        return llllllllllllIlllIIIIIIIIlllllIll;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return AbstractEpollChannel.DATA;
    }
    
    @Override
    protected void doBeginRead() throws Exception {
        ((AbstractEpollUnsafe)this.unsafe()).readPending = (AbstractEpollChannel.llIIllIlIllIll[2] != 0);
        if (lIIIlllIllllIIIl(this.flags & this.readFlag)) {
            this.flags |= this.readFlag;
            this.modifyEvents();
        }
    }
    
    @Override
    protected boolean isCompatible(final EventLoop llllllllllllIlllIIIIIIIlIIlIllll) {
        return llllllllllllIlllIIIIIIIlIIlIllll instanceof EpollEventLoop;
    }
    
    protected static void checkResolvable(final InetSocketAddress llllllllllllIlllIIIIIIIIlllIIlII) {
        if (lIIIlllIllllIIlI(llllllllllllIlllIIIIIIIIlllIIlII.isUnresolved() ? 1 : 0)) {
            throw new UnresolvedAddressException();
        }
    }
    
    final void clearEpollIn() {
        if (lIIIlllIllllIIlI(this.isRegistered() ? 1 : 0)) {
            final EventLoop llllllllllllIlllIIIIIIIlIIlIIIIl = this.eventLoop();
            final AbstractEpollUnsafe llllllllllllIlllIIIIIIIlIIlIIIII = (AbstractEpollUnsafe)this.unsafe();
            if (lIIIlllIllllIIlI(llllllllllllIlllIIIIIIIlIIlIIIIl.inEventLoop() ? 1 : 0)) {
                llllllllllllIlllIIIIIIIlIIlIIIII.clearEpollIn0();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllIIIIIIIlIIlIIIIl.execute(new OneTimeTask() {
                    private static boolean llIllIIlllIlllI(final int lllllllllllllIIlIlIIllIIlIlIIllI) {
                        return lllllllllllllIIlIlIIllIIlIlIIllI == 0;
                    }
                    
                    @Override
                    public void run() {
                        if (llIllIIlllIlllI(AbstractEpollChannel.this.config().isAutoRead() ? 1 : 0) && llIllIIlllIlllI(llllllllllllIlllIIIIIIIlIIlIIIII.readPending ? 1 : 0)) {
                            llllllllllllIlllIIIIIIIlIIlIIIII.clearEpollIn0();
                        }
                    }
                });
            }
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.flags &= (this.readFlag ^ AbstractEpollChannel.llIIllIlIllIll[1]);
        }
    }
    
    AbstractEpollChannel(final int llllllllllllIlllIIIIIIIlIlIllIII, final int llllllllllllIlllIIIIIIIlIlIlIlll) {
        this(null, llllllllllllIlllIIIIIIIlIlIllIII, llllllllllllIlllIIIIIIIlIlIlIlll, (boolean)(AbstractEpollChannel.llIIllIlIllIll[0] != 0));
    }
    
    private static boolean lIIIlllIllllIIIl(final int llllllllllllIlllIIIIIIIIllIIlllI) {
        return llllllllllllIlllIIIIIIIIllIIlllI == 0;
    }
    
    @Override
    public boolean isActive() {
        return this.active;
    }
    
    protected final void clearEpollOut() {
        if (lIIIlllIllllIIlI(this.flags & AbstractEpollChannel.llIIllIlIllIll[3])) {
            this.flags &= AbstractEpollChannel.llIIllIlIllIll[4];
            this.modifyEvents();
        }
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    protected final ByteBuf newDirectBuffer(final ByteBuf llllllllllllIlllIIIIIIIlIIIIlIIl) {
        return this.newDirectBuffer(llllllllllllIlllIIIIIIIlIIIIlIIl, llllllllllllIlllIIIIIIIlIIIIlIIl);
    }
    
    private static boolean lIIIlllIllllIIll(final Object llllllllllllIlllIIIIIIIIllIlIIlI) {
        return llllllllllllIlllIIIIIIIIllIlIIlI == null;
    }
    
    static {
        lIIIlllIlllIllll();
        DATA = new ChannelMetadata((boolean)(AbstractEpollChannel.llIIllIlIllIll[0] != 0));
    }
    
    @Override
    protected void doClose() throws Exception {
        this.active = (AbstractEpollChannel.llIIllIlIllIll[0] != 0);
        this.doDeregister();
        final int llllllllllllIlllIIIIIIIlIIllllIl = this.fd;
        this.fd = AbstractEpollChannel.llIIllIlIllIll[1];
        Native.close(llllllllllllIlllIIIIIIIlIIllllIl);
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    private static boolean lIIIlllIllllIIlI(final int llllllllllllIlllIIIIIIIIllIlIIII) {
        return llllllllllllIlllIIIIIIIIllIlIIII != 0;
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (lIIIlllIllllIIII(this.fd, AbstractEpollChannel.llIIllIlIllIll[1])) {
            n = AbstractEpollChannel.llIIllIlIllIll[2];
            "".length();
            if (" ".length() <= 0) {
                return ((0x42 ^ 0x6E) & ~(0xF ^ 0x23)) != 0x0;
            }
        }
        else {
            n = AbstractEpollChannel.llIIllIlIllIll[0];
        }
        return n != 0;
    }
    
    private static void lIIIlllIlllIllll() {
        (llIIllIlIllIll = new int[5])[0] = ((0xD0 ^ 0xB9 ^ (0x22 ^ 0x1B)) & (0xAD ^ 0xB0 ^ (0x42 ^ 0xF) ^ -" ".length()));
        AbstractEpollChannel.llIIllIlIllIll[1] = -" ".length();
        AbstractEpollChannel.llIIllIlIllIll[2] = " ".length();
        AbstractEpollChannel.llIIllIlIllIll[3] = "  ".length();
        AbstractEpollChannel.llIIllIlIllIll[4] = -"   ".length();
    }
    
    @Override
    protected void doDeregister() throws Exception {
        ((EpollEventLoop)this.eventLoop()).remove(this);
    }
    
    protected final void setEpollOut() {
        if (lIIIlllIllllIIIl(this.flags & AbstractEpollChannel.llIIllIlIllIll[3])) {
            this.flags |= AbstractEpollChannel.llIIllIlIllIll[3];
            this.modifyEvents();
        }
    }
    
    private static boolean lIIIlllIllllIIII(final int llllllllllllIlllIIIIIIIIllIIlIll, final int llllllllllllIlllIIIIIIIIllIIlIlI) {
        return llllllllllllIlllIIIIIIIIllIIlIll != llllllllllllIlllIIIIIIIIllIIlIlI;
    }
    
    private static ByteBuf newDirectBuffer0(final Object llllllllllllIlllIIIIIIIIlllIlIlI, final ByteBuf llllllllllllIlllIIIIIIIIlllIlllI, final ByteBufAllocator llllllllllllIlllIIIIIIIIlllIllIl, final int llllllllllllIlllIIIIIIIIlllIIlll) {
        final ByteBuf llllllllllllIlllIIIIIIIIlllIlIll = llllllllllllIlllIIIIIIIIlllIllIl.directBuffer(llllllllllllIlllIIIIIIIIlllIIlll);
        llllllllllllIlllIIIIIIIIlllIlIll.writeBytes(llllllllllllIlllIIIIIIIIlllIlllI, llllllllllllIlllIIIIIIIIlllIlllI.readerIndex(), llllllllllllIlllIIIIIIIIlllIIlll);
        "".length();
        ReferenceCountUtil.safeRelease(llllllllllllIlllIIIIIIIIlllIlIlI);
        return llllllllllllIlllIIIIIIIIlllIlIll;
    }
    
    private void modifyEvents() {
        if (lIIIlllIllllIIlI(this.isOpen() ? 1 : 0)) {
            ((EpollEventLoop)this.eventLoop()).modify(this);
        }
    }
    
    AbstractEpollChannel(final Channel llllllllllllIlllIIIIIIIlIlIIlIII, final int llllllllllllIlllIIIIIIIlIlIIIlll, final int llllllllllllIlllIIIIIIIlIlIIlIll, final boolean llllllllllllIlllIIIIIIIlIlIIIlIl) {
        super(llllllllllllIlllIIIIIIIlIlIIlIII);
        this.fd = llllllllllllIlllIIIIIIIlIlIIIlll;
        this.readFlag = llllllllllllIlllIIIIIIIlIlIIlIll;
        this.flags |= llllllllllllIlllIIIIIIIlIlIIlIll;
        this.active = llllllllllllIlllIIIIIIIlIlIIIlIl;
    }
    
    protected abstract class AbstractEpollUnsafe extends AbstractUnsafe
    {
        protected /* synthetic */ boolean readPending;
        private static final /* synthetic */ int[] lIlIlIllIllIll;
        
        private boolean isFlushPending() {
            int n;
            if (lllIllllIllIIlI(AbstractEpollChannel.this.flags & AbstractEpollUnsafe.lIlIlIllIllIll[0])) {
                n = AbstractEpollUnsafe.lIlIlIllIllIll[1];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x3E ^ 0x65 ^ (0xF8 ^ 0xA9)) & (109 + 63 - 115 + 77 ^ 55 + 139 - 161 + 107 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = AbstractEpollUnsafe.lIlIlIllIllIll[2];
            }
            return n != 0;
        }
        
        protected final void clearEpollIn0() {
            if (lllIllllIllIIlI(AbstractEpollChannel.this.flags & AbstractEpollChannel.this.readFlag)) {
                final AbstractEpollChannel this$0 = AbstractEpollChannel.this;
                this$0.flags &= (AbstractEpollChannel.this.readFlag ^ AbstractEpollUnsafe.lIlIlIllIllIll[3]);
                AbstractEpollChannel.this.modifyEvents();
            }
        }
        
        abstract void epollInReady();
        
        @Override
        protected void flush0() {
            if (lllIllllIllIIlI(this.isFlushPending() ? 1 : 0)) {
                return;
            }
            super.flush0();
        }
        
        private static boolean lllIllllIllIIlI(final int lllllllllllllIIIIlllllIllIIlIIII) {
            return lllllllllllllIIIIlllllIllIIlIIII != 0;
        }
        
        static {
            lllIllllIllIIIl();
        }
        
        void epollRdHupReady() {
        }
        
        void epollOutReady() {
            super.flush0();
        }
        
        private static void lllIllllIllIIIl() {
            (lIlIlIllIllIll = new int[4])[0] = "  ".length();
            AbstractEpollUnsafe.lIlIlIllIllIll[1] = " ".length();
            AbstractEpollUnsafe.lIlIlIllIllIll[2] = ((0x1E ^ 0x55 ^ (0x3 ^ 0x10)) & (231 + 223 - 428 + 226 ^ 130 + 68 - 91 + 57 ^ -" ".length()));
            AbstractEpollUnsafe.lIlIlIllIllIll[3] = -" ".length();
        }
    }
}
