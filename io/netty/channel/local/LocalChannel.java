// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import io.netty.channel.ChannelException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.AlreadyConnectedException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.SingleThreadEventLoop;
import io.netty.util.concurrent.SingleThreadEventExecutor;
import java.net.SocketAddress;
import io.netty.util.internal.InternalThreadLocalMap;
import io.netty.channel.EventLoop;
import java.util.Collection;
import java.util.Collections;
import io.netty.util.ReferenceCountUtil;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelPipeline;
import java.util.ArrayDeque;
import io.netty.channel.DefaultChannelConfig;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPromise;
import java.util.Queue;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelConfig;
import io.netty.channel.AbstractChannel;

public class LocalChannel extends AbstractChannel
{
    private final /* synthetic */ ChannelConfig config;
    private volatile /* synthetic */ LocalChannel peer;
    private volatile /* synthetic */ LocalAddress localAddress;
    private volatile /* synthetic */ int state;
    private static final /* synthetic */ int[] lIllIIlIIIlIII;
    private volatile /* synthetic */ boolean registerInProgress;
    private volatile /* synthetic */ boolean readInProgress;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private final /* synthetic */ Queue<Object> inboundBuffer;
    private final /* synthetic */ Runnable shutdownHook;
    private volatile /* synthetic */ ChannelPromise connectPromise;
    private volatile /* synthetic */ LocalAddress remoteAddress;
    private final /* synthetic */ Runnable readTask;
    
    LocalChannel(final LocalServerChannel lllllllllllllIIIIIlIIlIllllllllI, final LocalChannel lllllllllllllIIIIIlIIlIlllllllIl) {
        super(lllllllllllllIIIIIlIIlIllllllllI);
        this.config = new DefaultChannelConfig(this);
        this.inboundBuffer = new ArrayDeque<Object>();
        this.readTask = new Runnable() {
            private static boolean lIIlllIlIlIllIII(final Object llllllllllllIllIIIIIlIlIIlIlIlIl) {
                return llllllllllllIllIIIIIlIlIIlIlIlIl == null;
            }
            
            @Override
            public void run() {
                final ChannelPipeline llllllllllllIllIIIIIlIlIIlIllIlI = LocalChannel.this.pipeline();
                do {
                    final Object llllllllllllIllIIIIIlIlIIlIlllII = LocalChannel.this.inboundBuffer.poll();
                    if (lIIlllIlIlIllIII(llllllllllllIllIIIIIlIlIIlIlllII)) {
                        "".length();
                        if ("  ".length() < ((0x24 ^ 0x73) & ~(0x3D ^ 0x6A))) {
                            return;
                        }
                        llllllllllllIllIIIIIlIlIIlIllIlI.fireChannelReadComplete();
                        "".length();
                    }
                    else {
                        llllllllllllIllIIIIIlIlIIlIllIlI.fireChannelRead(llllllllllllIllIIIIIlIlIIlIlllII);
                        "".length();
                        "".length();
                    }
                } while (((0xBC ^ 0xB3) & ~(0x93 ^ 0x9C)) == 0x0);
            }
        };
        this.shutdownHook = new Runnable() {
            @Override
            public void run() {
                LocalChannel.this.unsafe().close(LocalChannel.this.unsafe().voidPromise());
            }
        };
        this.peer = lllllllllllllIIIIIlIIlIlllllllIl;
        this.localAddress = lllllllllllllIIIIIlIIlIllllllllI.localAddress();
        this.remoteAddress = lllllllllllllIIIIIlIIlIlllllllIl.localAddress();
    }
    
    @Override
    public LocalAddress localAddress() {
        return (LocalAddress)super.localAddress();
    }
    
    private static boolean lllllIIlIllIIlI(final int lllllllllllllIIIIIlIIlIlIlIIIllI) {
        return lllllllllllllIIIIIlIIlIlIlIIIllI == 0;
    }
    
    private static boolean lllllIIlIlIllll(final int lllllllllllllIIIIIlIIlIlIlIlIlll, final int lllllllllllllIIIIIlIIlIlIlIlIllI) {
        return lllllllllllllIIIIIlIIlIlIlIlIlll <= lllllllllllllIIIIIlIIlIlIlIlIllI;
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (lllllIIlIlIllII(this.state, LocalChannel.lIllIIlIIIlIII[0])) {
            n = LocalChannel.lIllIIlIIIlIII[1];
            "".length();
            if ((0xAD ^ 0xA9) == 0x0) {
                return ((0xEF ^ 0xC0) & ~(0x5D ^ 0x72)) != 0x0;
            }
        }
        else {
            n = LocalChannel.lIllIIlIIIlIII[2];
        }
        return n != 0;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIIIIlIIlIllIIlllll) throws Exception {
        if (lllllIIlIlIllII(this.state, LocalChannel.lIllIIlIIIlIII[3])) {
            throw new NotYetConnectedException();
        }
        if (lllllIIlIllIIll(this.state, LocalChannel.lIllIIlIIIlIII[3])) {
            throw new ClosedChannelException();
        }
        final LocalChannel lllllllllllllIIIIIlIIlIllIIllllI = this.peer;
        final ChannelPipeline lllllllllllllIIIIIlIIlIllIIlllIl = lllllllllllllIIIIIlIIlIllIIllllI.pipeline();
        final EventLoop lllllllllllllIIIIIlIIlIllIIlllII = lllllllllllllIIIIIlIIlIllIIllllI.eventLoop();
        if (lllllIIlIllIlII(lllllllllllllIIIIIlIIlIllIIlllII, this.eventLoop())) {
            do {
                final Object lllllllllllllIIIIIlIIlIllIlIIIll = lllllllllllllIIIIIlIIlIllIIlllll.current();
                if (lllllIIlIllIIII(lllllllllllllIIIIIlIIlIllIlIIIll)) {
                    "".length();
                    if ((0xF8 ^ 0xB7 ^ (0x5E ^ 0x15)) <= "   ".length()) {
                        return;
                    }
                    finishPeerRead(lllllllllllllIIIIIlIIlIllIIllllI, lllllllllllllIIIIIlIIlIllIIlllIl);
                    "".length();
                    if ((0x3F ^ 0x3B) == " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIIlIIlIllIIllllI.inboundBuffer.add(lllllllllllllIIIIIlIIlIllIlIIIll);
                    "".length();
                    ReferenceCountUtil.retain(lllllllllllllIIIIIlIIlIllIlIIIll);
                    "".length();
                    lllllllllllllIIIIIlIIlIllIIlllll.remove();
                    "".length();
                    "".length();
                }
            } while ("   ".length() > " ".length());
            return;
        }
        final Object[] lllllllllllllIIIIIlIIlIllIlIIIIl = new Object[lllllllllllllIIIIIlIIlIllIIlllll.size()];
        int lllllllllllllIIIIIlIIlIllIlIIIlI = LocalChannel.lIllIIlIIIlIII[2];
        while (lllllIIlIlIllII(lllllllllllllIIIIIlIIlIllIlIIIlI, lllllllllllllIIIIIlIIlIllIlIIIIl.length)) {
            lllllllllllllIIIIIlIIlIllIlIIIIl[lllllllllllllIIIIIlIIlIllIlIIIlI] = ReferenceCountUtil.retain(lllllllllllllIIIIIlIIlIllIIlllll.current());
            lllllllllllllIIIIIlIIlIllIIlllll.remove();
            "".length();
            ++lllllllllllllIIIIIlIIlIllIlIIIlI;
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        }
        lllllllllllllIIIIIlIIlIllIIlllII.execute(new Runnable() {
            @Override
            public void run() {
                Collections.addAll(lllllllllllllIIIIIlIIlIllIIllllI.inboundBuffer, lllllllllllllIIIIIlIIlIllIlIIIIl);
                "".length();
                finishPeerRead(lllllllllllllIIIIIlIIlIllIIllllI, lllllllllllllIIIIIlIIlIllIIlllIl);
            }
        });
    }
    
    private static boolean lllllIIlIlIlllI(final Object lllllllllllllIIIIIlIIlIlIlIlIIII) {
        return lllllllllllllIIIIIlIIlIlIlIlIIII != null;
    }
    
    private static boolean lllllIIlIllIIIl(final int lllllllllllllIIIIIlIIlIlIlIIlIII) {
        return lllllllllllllIIIIIlIIlIlIlIIlIII != 0;
    }
    
    @Override
    protected void doBeginRead() throws Exception {
        if (lllllIIlIllIIIl(this.readInProgress ? 1 : 0)) {
            return;
        }
        final ChannelPipeline lllllllllllllIIIIIlIIlIllIllIlIl = this.pipeline();
        final Queue<Object> lllllllllllllIIIIIlIIlIllIllIlII = this.inboundBuffer;
        if (lllllIIlIllIIIl(lllllllllllllIIIIIlIIlIllIllIlII.isEmpty() ? 1 : 0)) {
            this.readInProgress = (LocalChannel.lIllIIlIIIlIII[1] != 0);
            return;
        }
        final InternalThreadLocalMap lllllllllllllIIIIIlIIlIllIllIIll = InternalThreadLocalMap.get();
        final Integer lllllllllllllIIIIIlIIlIllIllIIlI = lllllllllllllIIIIIlIIlIllIllIIll.localChannelReaderStackDepth();
        if (lllllIIlIlIllII(lllllllllllllIIIIIlIIlIllIllIIlI, LocalChannel.lIllIIlIIIlIII[4])) {
            lllllllllllllIIIIIlIIlIllIllIIll.setLocalChannelReaderStackDepth(lllllllllllllIIIIIlIIlIllIllIIlI + LocalChannel.lIllIIlIIIlIII[1]);
            Label_0204: {
                try {
                    do {
                        final Object lllllllllllllIIIIIlIIlIllIllIlll = lllllllllllllIIIIIlIIlIllIllIlII.poll();
                        if (lllllIIlIllIIII(lllllllllllllIIIIIlIIlIllIllIlll)) {
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                            lllllllllllllIIIIIlIIlIllIllIlIl.fireChannelReadComplete();
                            "".length();
                            lllllllllllllIIIIIlIIlIllIllIIll.setLocalChannelReaderStackDepth(lllllllllllllIIIIIlIIlIllIllIIlI);
                            "".length();
                            if ((0x69 ^ 0x6D) != (0x68 ^ 0x6C)) {
                                return;
                            }
                            break Label_0204;
                        }
                        else {
                            lllllllllllllIIIIIlIIlIllIllIlIl.fireChannelRead(lllllllllllllIIIIIlIIlIllIllIlll);
                            "".length();
                            "".length();
                        }
                    } while (-"  ".length() < 0);
                    return;
                }
                finally {
                    lllllllllllllIIIIIlIIlIllIllIIll.setLocalChannelReaderStackDepth(lllllllllllllIIIIIlIIlIllIllIIlI);
                }
            }
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            this.eventLoop().execute(this.readTask);
        }
    }
    
    private static void lllllIIlIlIlIll() {
        (lIllIIlIIIlIII = new int[5])[0] = "   ".length();
        LocalChannel.lIllIIlIIIlIII[1] = " ".length();
        LocalChannel.lIllIIlIIIlIII[2] = ((0x42 ^ 0x10 ^ (0x0 ^ 0x42)) & (0x58 ^ 0x7A ^ (0x1E ^ 0x2C) ^ -" ".length()));
        LocalChannel.lIllIIlIIIlIII[3] = "  ".length();
        LocalChannel.lIllIIlIIIlIII[4] = (30 + 140 - 135 + 110 ^ 58 + 48 - 67 + 114);
    }
    
    @Override
    public ChannelConfig config() {
        return this.config;
    }
    
    private static boolean lllllIIlIllIlII(final Object lllllllllllllIIIIIlIIlIlIlIIllIl, final Object lllllllllllllIIIIIlIIlIlIlIIllII) {
        return lllllllllllllIIIIIlIIlIlIlIIllIl == lllllllllllllIIIIIlIIlIlIlIIllII;
    }
    
    @Override
    protected void doClose() throws Exception {
        if (lllllIIlIlIllll(this.state, LocalChannel.lIllIIlIIIlIII[3])) {
            if (lllllIIlIlIlllI(this.localAddress)) {
                if (lllllIIlIllIIII(this.parent())) {
                    LocalChannelRegistry.unregister(this.localAddress);
                }
                this.localAddress = null;
            }
            this.state = LocalChannel.lIllIIlIIIlIII[0];
        }
        final LocalChannel lllllllllllllIIIIIlIIlIlllIIIlIl = this.peer;
        if (lllllIIlIlIlllI(lllllllllllllIIIIIlIIlIlllIIIlIl) && lllllIIlIllIIIl(lllllllllllllIIIIIlIIlIlllIIIlIl.isActive() ? 1 : 0)) {
            final EventLoop lllllllllllllIIIIIlIIlIlllIIIlll = lllllllllllllIIIIIlIIlIlllIIIlIl.eventLoop();
            if (lllllIIlIllIIIl(lllllllllllllIIIIIlIIlIlllIIIlll.inEventLoop() ? 1 : 0) && lllllIIlIllIIlI(this.registerInProgress ? 1 : 0)) {
                lllllllllllllIIIIIlIIlIlllIIIlIl.unsafe().close(this.unsafe().voidPromise());
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIIlIIlIlllIIIlIl.eventLoop().execute(new Runnable() {
                    @Override
                    public void run() {
                        lllllllllllllIIIIIlIIlIlllIIIlIl.unsafe().close(LocalChannel.this.unsafe().voidPromise());
                    }
                });
            }
            this.peer = null;
        }
    }
    
    @Override
    protected void doRegister() throws Exception {
        if (lllllIIlIlIlllI(this.peer) && lllllIIlIlIlllI(this.parent())) {
            final LocalChannel lllllllllllllIIIIIlIIlIlllIlIlll = this.peer;
            this.registerInProgress = (LocalChannel.lIllIIlIIIlIII[1] != 0);
            this.state = LocalChannel.lIllIIlIIIlIII[3];
            lllllllllllllIIIIIlIIlIlllIlIlll.remoteAddress = this.parent().localAddress();
            lllllllllllllIIIIIlIIlIlllIlIlll.state = LocalChannel.lIllIIlIIIlIII[3];
            lllllllllllllIIIIIlIIlIlllIlIlll.eventLoop().execute(new Runnable() {
                private static final /* synthetic */ int[] lllIIIIlIlIllI;
                
                private static void lIIlllIIlIIIllll() {
                    (lllIIIIlIlIllI = new int[1])[0] = ((137 + 44 - 48 + 5 ^ 96 + 34 - 69 + 106) & (0xCF ^ 0xC5 ^ (0x3D ^ 0x1A) ^ -" ".length()));
                }
                
                static {
                    lIIlllIIlIIIllll();
                }
                
                @Override
                public void run() {
                    LocalChannel.this.registerInProgress = (boolean)(LocalChannel$3.lllIIIIlIlIllI[0] != 0);
                    "".length();
                    lllllllllllllIIIIIlIIlIlllIlIlll.pipeline().fireChannelActive();
                    "".length();
                    lllllllllllllIIIIIlIIlIlllIlIlll.connectPromise.setSuccess();
                    "".length();
                }
            });
        }
        ((SingleThreadEventExecutor)this.eventLoop()).addShutdownHook(this.shutdownHook);
    }
    
    private static void finishPeerRead(final LocalChannel lllllllllllllIIIIIlIIlIllIIlIIII, final ChannelPipeline lllllllllllllIIIIIlIIlIllIIIllIl) {
        if (lllllIIlIllIIIl(lllllllllllllIIIIIlIIlIllIIlIIII.readInProgress ? 1 : 0)) {
            lllllllllllllIIIIIlIIlIllIIlIIII.readInProgress = (LocalChannel.lIllIIlIIIlIII[2] != 0);
            do {
                final Object lllllllllllllIIIIIlIIlIllIIlIIIl = lllllllllllllIIIIIlIIlIllIIlIIII.inboundBuffer.poll();
                if (lllllIIlIllIIII(lllllllllllllIIIIIlIIlIllIIlIIIl)) {
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    lllllllllllllIIIIIlIIlIllIIIllIl.fireChannelReadComplete();
                    "".length();
                }
                else {
                    lllllllllllllIIIIIlIIlIllIIIllIl.fireChannelRead(lllllllllllllIIIIIlIIlIllIIlIIIl);
                    "".length();
                    "".length();
                }
            } while ((92 + 70 + 1 + 33 ^ 102 + 187 - 111 + 14) > "  ".length());
        }
    }
    
    @Override
    protected void doDeregister() throws Exception {
        ((SingleThreadEventExecutor)this.eventLoop()).removeShutdownHook(this.shutdownHook);
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIIIIlIIlIlllIIlllI) throws Exception {
        this.localAddress = LocalChannelRegistry.register(this, this.localAddress, lllllllllllllIIIIIlIIlIlllIIlllI);
        this.state = LocalChannel.lIllIIlIIIlIII[1];
    }
    
    @Override
    protected AbstractUnsafe newUnsafe() {
        return new LocalUnsafe();
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (lllllIIlIlIllIl(this.state, LocalChannel.lIllIIlIIIlIII[3])) {
            n = LocalChannel.lIllIIlIIIlIII[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x3F ^ 0x62) & ~(0x16 ^ 0x4B)) != 0x0;
            }
        }
        else {
            n = LocalChannel.lIllIIlIIIlIII[2];
        }
        return n != 0;
    }
    
    private static boolean lllllIIlIlIllII(final int lllllllllllllIIIIIlIIlIlIlIllIll, final int lllllllllllllIIIIIlIIlIlIlIllIlI) {
        return lllllllllllllIIIIIlIIlIlIlIllIll < lllllllllllllIIIIIlIIlIlIlIllIlI;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return LocalChannel.METADATA;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.localAddress;
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    static {
        lllllIIlIlIlIll();
        MAX_READER_STACK_DEPTH = LocalChannel.lIllIIlIIIlIII[4];
        METADATA = new ChannelMetadata((boolean)(LocalChannel.lIllIIlIIIlIII[2] != 0));
    }
    
    private static boolean lllllIIlIllIIll(final int lllllllllllllIIIIIlIIlIlIlIlIIll, final int lllllllllllllIIIIIlIIlIlIlIlIIlI) {
        return lllllllllllllIIIIIlIIlIlIlIlIIll > lllllllllllllIIIIIlIIlIlIlIlIIlI;
    }
    
    @Override
    public LocalServerChannel parent() {
        return (LocalServerChannel)super.parent();
    }
    
    private static boolean lllllIIlIlIllIl(final int lllllllllllllIIIIIlIIlIlIlIlllll, final int lllllllllllllIIIIIlIIlIlIlIllllI) {
        return lllllllllllllIIIIIlIIlIlIlIlllll == lllllllllllllIIIIIlIIlIlIlIllllI;
    }
    
    @Override
    protected boolean isCompatible(final EventLoop lllllllllllllIIIIIlIIlIllllIIIIl) {
        return lllllllllllllIIIIIlIIlIllllIIIIl instanceof SingleThreadEventLoop;
    }
    
    public LocalChannel() {
        super(null);
        this.config = new DefaultChannelConfig(this);
        this.inboundBuffer = new ArrayDeque<Object>();
        this.readTask = new Runnable() {
            private static boolean lIIlllIlIlIllIII(final Object llllllllllllIllIIIIIlIlIIlIlIlIl) {
                return llllllllllllIllIIIIIlIlIIlIlIlIl == null;
            }
            
            @Override
            public void run() {
                final ChannelPipeline llllllllllllIllIIIIIlIlIIlIllIlI = LocalChannel.this.pipeline();
                do {
                    final Object llllllllllllIllIIIIIlIlIIlIlllII = LocalChannel.this.inboundBuffer.poll();
                    if (lIIlllIlIlIllIII(llllllllllllIllIIIIIlIlIIlIlllII)) {
                        "".length();
                        if ("  ".length() < ((0x24 ^ 0x73) & ~(0x3D ^ 0x6A))) {
                            return;
                        }
                        llllllllllllIllIIIIIlIlIIlIllIlI.fireChannelReadComplete();
                        "".length();
                    }
                    else {
                        llllllllllllIllIIIIIlIlIIlIllIlI.fireChannelRead(llllllllllllIllIIIIIlIlIIlIlllII);
                        "".length();
                        "".length();
                    }
                } while (((0xBC ^ 0xB3) & ~(0x93 ^ 0x9C)) == 0x0);
            }
        };
        this.shutdownHook = new Runnable() {
            @Override
            public void run() {
                LocalChannel.this.unsafe().close(LocalChannel.this.unsafe().voidPromise());
            }
        };
    }
    
    private static boolean lllllIIlIllIIII(final Object lllllllllllllIIIIIlIIlIlIlIIlIlI) {
        return lllllllllllllIIIIIlIIlIlIlIIlIlI == null;
    }
    
    @Override
    public LocalAddress remoteAddress() {
        return (LocalAddress)super.remoteAddress();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.remoteAddress;
    }
    
    private class LocalUnsafe extends AbstractUnsafe
    {
        private static final /* synthetic */ String[] llllllllllIIl;
        private static final /* synthetic */ int[] llllllllllIlI;
        
        private static boolean lIllIIlIIlIIllI(final Object lllllllllllllIlIlIIlIlIllIIlIIlI) {
            return lllllllllllllIlIlIIlIlIllIIlIIlI != null;
        }
        
        private static String lIllIIlIIlIIIII(final String lllllllllllllIlIlIIlIlIllIIllIll, final String lllllllllllllIlIlIIlIlIllIIlllII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIIlIlIllIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIlIllIIlllII.getBytes(StandardCharsets.UTF_8)), LocalUnsafe.llllllllllIlI[3]), "DES");
                final Cipher lllllllllllllIlIlIIlIlIllIIlllll = Cipher.getInstance("DES");
                lllllllllllllIlIlIIlIlIllIIlllll.init(LocalUnsafe.llllllllllIlI[0], lllllllllllllIlIlIIlIlIllIlIIIII);
                return new String(lllllllllllllIlIlIIlIlIllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIIlIlIllIIllllI) {
                lllllllllllllIlIlIIlIlIllIIllllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lIllIIlIIlIIIlI();
            lIllIIlIIlIIIIl();
        }
        
        private static boolean lIllIIlIIlIIlll(final int lllllllllllllIlIlIIlIlIllIIIlIIl, final int lllllllllllllIlIlIIlIlIllIIIlIII) {
            return lllllllllllllIlIlIIlIlIllIIIlIIl != lllllllllllllIlIlIIlIlIllIIIlIII;
        }
        
        private static void lIllIIlIIlIIIlI() {
            (llllllllllIlI = new int[4])[0] = "  ".length();
            LocalUnsafe.llllllllllIlI[1] = " ".length();
            LocalUnsafe.llllllllllIlI[2] = (("  ".length() ^ (0x6C ^ 0x71)) & (0x4F ^ 0x39 ^ (0x2 ^ 0x6B) ^ -" ".length()));
            LocalUnsafe.llllllllllIlI[3] = (0x33 ^ 0x3B);
        }
        
        private static void lIllIIlIIlIIIIl() {
            (llllllllllIIl = new String[LocalUnsafe.llllllllllIlI[1]])[LocalUnsafe.llllllllllIlI[2]] = lIllIIlIIlIIIII("UO48XnWjk0izEMgPut4M2UfZaGL4Bmy9", "hfhDU");
        }
        
        private static boolean lIllIIlIIlIIlII(final int lllllllllllllIlIlIIlIlIllIIIllII) {
            return lllllllllllllIlIlIIlIlIllIIIllII == 0;
        }
        
        private static boolean lIllIIlIIlIIIll(final int lllllllllllllIlIlIIlIlIllIIIlllI) {
            return lllllllllllllIlIlIIlIlIllIIIlllI != 0;
        }
        
        @Override
        public void connect(final SocketAddress lllllllllllllIlIlIIlIlIllIllIllI, SocketAddress lllllllllllllIlIlIIlIlIllIlIllll, final ChannelPromise lllllllllllllIlIlIIlIlIllIllIlII) {
            if (!lIllIIlIIlIIIll(lllllllllllllIlIlIIlIlIllIllIlII.setUncancellable() ? 1 : 0) || lIllIIlIIlIIlII(this.ensureOpen(lllllllllllllIlIlIIlIlIllIllIlII) ? 1 : 0)) {
                return;
            }
            if (lIllIIlIIlIIlIl(LocalChannel.this.state, LocalUnsafe.llllllllllIlI[0])) {
                final Exception lllllllllllllIlIlIIlIlIllIlllIlI = new AlreadyConnectedException();
                this.safeSetFailure(lllllllllllllIlIlIIlIlIllIllIlII, lllllllllllllIlIlIIlIlIllIlllIlI);
                LocalChannel.this.pipeline().fireExceptionCaught(lllllllllllllIlIlIIlIlIllIlllIlI);
                "".length();
                return;
            }
            if (lIllIIlIIlIIllI(LocalChannel.this.connectPromise)) {
                throw new ConnectionPendingException();
            }
            LocalChannel.this.connectPromise = lllllllllllllIlIlIIlIlIllIllIlII;
            "".length();
            if (lIllIIlIIlIIlll(LocalChannel.this.state, LocalUnsafe.llllllllllIlI[1]) && lIllIIlIIlIlIII(lllllllllllllIlIlIIlIlIllIlIllll)) {
                lllllllllllllIlIlIIlIlIllIlIllll = new LocalAddress(LocalChannel.this);
            }
            if (lIllIIlIIlIIllI(lllllllllllllIlIlIIlIlIllIlIllll)) {
                try {
                    LocalChannel.this.doBind(lllllllllllllIlIlIIlIlIllIlIllll);
                    "".length();
                    if (((0x49 ^ 0x6D) & ~(0x60 ^ 0x44)) != 0x0) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIlIIlIlIllIlllIIl) {
                    this.safeSetFailure(lllllllllllllIlIlIIlIlIllIllIlII, lllllllllllllIlIlIIlIlIllIlllIIl);
                    this.close(this.voidPromise());
                    return;
                }
            }
            final Channel lllllllllllllIlIlIIlIlIllIllIIll = LocalChannelRegistry.get(lllllllllllllIlIlIIlIlIllIllIllI);
            if (lIllIIlIIlIIlII((lllllllllllllIlIlIIlIlIllIllIIll instanceof LocalServerChannel) ? 1 : 0)) {
                final Exception lllllllllllllIlIlIIlIlIllIlllIII = new ChannelException(LocalUnsafe.llllllllllIIl[LocalUnsafe.llllllllllIlI[2]]);
                this.safeSetFailure(lllllllllllllIlIlIIlIlIllIllIlII, lllllllllllllIlIlIIlIlIllIlllIII);
                this.close(this.voidPromise());
                return;
            }
            final LocalServerChannel lllllllllllllIlIlIIlIlIllIllIIlI = (LocalServerChannel)lllllllllllllIlIlIIlIlIllIllIIll;
            LocalChannel.this.peer = lllllllllllllIlIlIIlIlIllIllIIlI.serve(LocalChannel.this);
            "".length();
        }
        
        private static boolean lIllIIlIIlIlIII(final Object lllllllllllllIlIlIIlIlIllIIlIIII) {
            return lllllllllllllIlIlIIlIlIllIIlIIII == null;
        }
        
        private static boolean lIllIIlIIlIIlIl(final int lllllllllllllIlIlIIlIlIllIIlIlIl, final int lllllllllllllIlIlIIlIlIllIIlIlII) {
            return lllllllllllllIlIlIIlIlIllIIlIlIl == lllllllllllllIlIlIIlIlIllIIlIlII;
        }
    }
}
