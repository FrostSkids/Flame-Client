// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.net.ConnectException;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ConnectTimeoutException;
import io.netty.channel.socket.ChannelInputShutdownEvent;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.socket.SocketChannelConfig;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.AbstractChannel;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.ChannelConfig;
import io.netty.channel.Channel;
import io.netty.channel.EventLoop;
import java.nio.ByteBuffer;
import io.netty.channel.ChannelFuture;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.DefaultFileRegion;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.socket.ServerSocketChannel;
import java.net.SocketAddress;
import io.netty.channel.ChannelPromise;
import java.util.concurrent.ScheduledFuture;
import java.net.InetSocketAddress;
import io.netty.channel.socket.SocketChannel;

public final class EpollSocketChannel extends AbstractEpollChannel implements SocketChannel
{
    private volatile /* synthetic */ InetSocketAddress remote;
    private volatile /* synthetic */ boolean inputShutdown;
    private volatile /* synthetic */ boolean outputShutdown;
    private /* synthetic */ ScheduledFuture<?> connectTimeoutFuture;
    private /* synthetic */ ChannelPromise connectPromise;
    private /* synthetic */ SocketAddress requestedRemoteAddress;
    private static final /* synthetic */ int[] llIIlIlIIllllI;
    private static final /* synthetic */ String[] llIIlIlIIlllIl;
    static final /* synthetic */ boolean $assertionsDisabled;
    private volatile /* synthetic */ InetSocketAddress local;
    private static final /* synthetic */ String EXPECTED_TYPES;
    private final /* synthetic */ EpollSocketChannelConfig config;
    
    @Override
    public ServerSocketChannel parent() {
        return (ServerSocketChannel)super.parent();
    }
    
    @Override
    public EpollSocketChannelConfig config() {
        return this.config;
    }
    
    private boolean writeBytesMultiple(final ChannelOutboundBuffer llllllllllllIlllIIIlllIlllllllll, final IovArray llllllllllllIlllIIIllllIIIIIIlll) throws IOException {
        long llllllllllllIlllIIIllllIIIIIIllI = llllllllllllIlllIIIllllIIIIIIlll.size();
        int llllllllllllIlllIIIllllIIIIIIlIl = llllllllllllIlllIIIllllIIIIIIlll.count();
        if (lIIIllIlIIIIlIIl(EpollSocketChannel.$assertionsDisabled ? 1 : 0) && lIIIllIlIIIIlIIl(lIIIllIlIIIIllIl(llllllllllllIlllIIIllllIIIIIIllI, 0L))) {
            throw new AssertionError();
        }
        if (lIIIllIlIIIIlIIl(EpollSocketChannel.$assertionsDisabled ? 1 : 0) && lIIIllIlIIIIlIIl(llllllllllllIlllIIIllllIIIIIIlIl)) {
            throw new AssertionError();
        }
        boolean llllllllllllIlllIIIllllIIIIIIlII = EpollSocketChannel.llIIlIlIIllllI[1] != 0;
        long llllllllllllIlllIIIllllIIIIIIIll = 0L;
        int llllllllllllIlllIIIllllIIIIIIIlI = EpollSocketChannel.llIIlIlIIllllI[1];
        final int llllllllllllIlllIIIllllIIIIIIIIl = llllllllllllIlllIIIllllIIIIIIIlI + llllllllllllIlllIIIllllIIIIIIlIl;
        do {
            long llllllllllllIlllIIIllllIIIIIlIlI = Native.writevAddresses(this.fd, llllllllllllIlllIIIllllIIIIIIlll.memoryAddress(llllllllllllIlllIIIllllIIIIIIIlI), llllllllllllIlllIIIllllIIIIIIlIl);
            if (lIIIllIlIIIIlIIl(lIIIllIlIIIIllIl(llllllllllllIlllIIIllllIIIIIlIlI, 0L))) {
                this.setEpollOut();
                "".length();
                if (((0xBA ^ 0xB1) & ~(0x62 ^ 0x69)) < -" ".length()) {
                    return ((0xD4 ^ 0xC4) & ~(0x28 ^ 0x38)) != 0x0;
                }
            }
            else {
                llllllllllllIlllIIIllllIIIIIIllI -= llllllllllllIlllIIIllllIIIIIlIlI;
                llllllllllllIlllIIIllllIIIIIIIll += llllllllllllIlllIIIllllIIIIIlIlI;
                if (!lIIIllIlIIIIlIIl(lIIIllIlIIIIllIl(llllllllllllIlllIIIllllIIIIIIllI, 0L))) {
                    do {
                        final long llllllllllllIlllIIIllllIIIIIlIll = llllllllllllIlllIIIllllIIIIIIlll.processWritten(llllllllllllIlllIIIllllIIIIIIIlI, llllllllllllIlllIIIllllIIIIIlIlI);
                        if (lIIIllIlIIIIlIIl(lIIIllIlIIIIllIl(llllllllllllIlllIIIllllIIIIIlIll, -1L))) {
                            "".length();
                            if (null != null) {
                                return ((210 + 105 - 251 + 169 ^ 112 + 137 - 237 + 175) & (0xEB ^ 0x96 ^ (0xA7 ^ 0x88) ^ -" ".length())) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIlllIIIllllIIIIIIIlI;
                            --llllllllllllIlllIIIllllIIIIIIlIl;
                            llllllllllllIlllIIIllllIIIIIlIlI -= llllllllllllIlllIIIllllIIIIIlIll;
                        }
                    } while (lIIIllIlIIIIlllI(llllllllllllIlllIIIllllIIIIIIIlI, llllllllllllIlllIIIllllIIIIIIIIl) && !lIIIllIlIIIIllll(lIIIllIlIIIIllIl(llllllllllllIlllIIIllllIIIIIlIlI, 0L)));
                    "".length();
                    continue;
                }
                llllllllllllIlllIIIllllIIIIIIlII = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                "".length();
                if (-" ".length() == ((0x56 ^ 0x11) & ~(0xD9 ^ 0x9E))) {
                    return ("   ".length() & ~"   ".length()) != 0x0;
                }
            }
            llllllllllllIlllIIIlllIlllllllll.removeBytes(llllllllllllIlllIIIllllIIIIIIIll);
            return llllllllllllIlllIIIllllIIIIIIlII;
        } while ((111 + 130 - 211 + 117 ^ 6 + 2 + 140 + 3) >= " ".length());
        return ((176 + 128 - 173 + 121 ^ 62 + 138 - 192 + 163) & (0x8C ^ 0xA8 ^ (0x72 ^ 0x1) ^ -" ".length())) != 0x0;
    }
    
    private static boolean lIIIllIlIIIlIlII(final int llllllllllllIlllIIIlllIIlllIlIII, final int llllllllllllIlllIIIlllIIlllIIlll) {
        return llllllllllllIlllIIIlllIIlllIlIII >= llllllllllllIlllIIIlllIIlllIIlll;
    }
    
    static {
        lIIIllIlIIIIIlll();
        lIIIllIlIIIIIllI();
        int $assertionsDisabled2;
        if (lIIIllIlIIIIlIIl(EpollSocketChannel.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = EpollSocketChannel.llIIlIlIIllllI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = EpollSocketChannel.llIIlIlIIllllI[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(EpollSocketChannel.llIIlIlIIlllIl[EpollSocketChannel.llIIlIlIIllllI[0]]).append(StringUtil.simpleClassName(ByteBuf.class)).append(EpollSocketChannel.llIIlIlIIlllIl[EpollSocketChannel.llIIlIlIIllllI[2]]).append(StringUtil.simpleClassName(DefaultFileRegion.class)).append((char)EpollSocketChannel.llIIlIlIIllllI[3]));
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.local;
    }
    
    private static void lIIIllIlIIIIIllI() {
        (llIIlIlIIlllIl = new String[EpollSocketChannel.llIIlIlIIllllI[4]])[EpollSocketChannel.llIIlIlIIllllI[1]] = lIIIllIlIIIIIIll("alTTWv4YM3CisLjOE/0/XOJKbmq/1Nzg6kIIpuyQauU=", "ppNCE");
        EpollSocketChannel.llIIlIlIIlllIl[EpollSocketChannel.llIIlIlIIllllI[0]] = lIIIllIlIIIIIlII("VHsWFCoRMAcJPk5z", "tSslZ");
        EpollSocketChannel.llIIlIlIIlllIl[EpollSocketChannel.llIIlIlIIllllI[2]] = lIIIllIlIIIIIlIl("V/Cm/wtW6Mg=", "BmbHs");
    }
    
    public EpollSocketChannel() {
        super(Native.socketStreamFd(), EpollSocketChannel.llIIlIlIIllllI[0]);
        this.config = new EpollSocketChannelConfig(this);
    }
    
    private static boolean lIIIllIlIIIIllII(final int llllllllllllIlllIIIlllIIlllIllII, final int llllllllllllIlllIIIlllIIlllIlIll) {
        return llllllllllllIlllIIIlllIIlllIllII == llllllllllllIlllIIIlllIIlllIlIll;
    }
    
    @Override
    protected Object filterOutboundMessage(final Object llllllllllllIlllIIIlllIllIIIIlll) {
        if (lIIIllIlIIIIlIlI((llllllllllllIlllIIIlllIllIIIIlll instanceof ByteBuf) ? 1 : 0)) {
            ByteBuf llllllllllllIlllIIIlllIllIIIlIIl = (ByteBuf)llllllllllllIlllIIIlllIllIIIIlll;
            if (lIIIllIlIIIIlIIl(llllllllllllIlllIIIlllIllIIIlIIl.hasMemoryAddress() ? 1 : 0) && (!lIIIllIlIIIIlIIl(PlatformDependent.hasUnsafe() ? 1 : 0) || lIIIllIlIIIIlIIl(llllllllllllIlllIIIlllIllIIIlIIl.isDirect() ? 1 : 0))) {
                llllllllllllIlllIIIlllIllIIIlIIl = this.newDirectBuffer(llllllllllllIlllIIIlllIllIIIlIIl);
                if (lIIIllIlIIIIlIIl(EpollSocketChannel.$assertionsDisabled ? 1 : 0) && lIIIllIlIIIIlIIl(llllllllllllIlllIIIlllIllIIIlIIl.hasMemoryAddress() ? 1 : 0)) {
                    throw new AssertionError();
                }
            }
            return llllllllllllIlllIIIlllIllIIIlIIl;
        }
        if (lIIIllIlIIIIlIlI((llllllllllllIlllIIIlllIllIIIIlll instanceof DefaultFileRegion) ? 1 : 0)) {
            return llllllllllllIlllIIIlllIllIIIIlll;
        }
        throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(EpollSocketChannel.llIIlIlIIlllIl[EpollSocketChannel.llIIlIlIIllllI[1]]).append(StringUtil.simpleClassName(llllllllllllIlllIIIlllIllIIIIlll)).append(EpollSocketChannel.EXPECTED_TYPES)));
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIlllIIIllllIIlIIIIIl) throws Exception {
        final InetSocketAddress llllllllllllIlllIIIllllIIlIIIIII = (InetSocketAddress)llllllllllllIlllIIIllllIIlIIIIIl;
        Native.bind(this.fd, llllllllllllIlllIIIllllIIlIIIIII.getAddress(), llllllllllllIlllIIIllllIIlIIIIII.getPort());
        this.local = Native.localAddress(this.fd);
    }
    
    private static int lIIIllIlIIIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer llllllllllllIlllIIIlllIllIlIlIll) throws Exception {
        do {
            final int llllllllllllIlllIIIlllIllIlIllIl = llllllllllllIlllIIIlllIllIlIlIll.size();
            if (!lIIIllIlIIIIlIIl(llllllllllllIlllIIIlllIllIlIllIl)) {
                if (lIIIllIlIIIlIIll(llllllllllllIlllIIIlllIllIlIllIl, EpollSocketChannel.llIIlIlIIllllI[0]) && lIIIllIlIIIIlIlI((llllllllllllIlllIIIlllIllIlIlIll.current() instanceof ByteBuf) ? 1 : 0)) {
                    if (lIIIllIlIIIIlIIl(this.doWriteMultiple(llllllllllllIlllIIIlllIllIlIlIll) ? 1 : 0)) {
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return;
                        }
                        return;
                    }
                }
                else if (lIIIllIlIIIIlIIl(this.doWriteSingle(llllllllllllIlllIIIlllIllIlIlIll) ? 1 : 0)) {
                    "".length();
                    if (((0xE3 ^ 0x83 ^ 115 + 68 - 107 + 51) & (0x70 ^ 0x35 ^ (0xC0 ^ 0x9A) ^ -" ".length())) < 0) {
                        return;
                    }
                    return;
                }
                "".length();
                continue;
            }
            this.clearEpollOut();
            "".length();
            if (((0x1C ^ 0x3D ^ (0xB1 ^ 0x95)) & (0xDF ^ 0x98 ^ (0x8 ^ 0x4A) ^ -" ".length())) != ((0x74 ^ 0x5B ^ (0x20 ^ 0x25)) & (139 + 18 - 19 + 3 ^ 108 + 42 - 70 + 87 ^ -" ".length()))) {
                return;
            }
        } while (null == null);
    }
    
    @Override
    public ChannelFuture shutdownOutput() {
        return this.shutdownOutput(this.newPromise());
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.remote;
    }
    
    private static boolean lIIIllIlIIIIllll(final int llllllllllllIlllIIIlllIIllIlIlll) {
        return llllllllllllIlllIIIlllIIllIlIlll <= 0;
    }
    
    private boolean doWriteMultiple(final ChannelOutboundBuffer llllllllllllIlllIIIlllIllIIIllll) throws Exception {
        if (lIIIllIlIIIIlIlI(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            final IovArray llllllllllllIlllIIIlllIllIIlIllI = IovArray.get(llllllllllllIlllIIIlllIllIIIllll);
            final int llllllllllllIlllIIIlllIllIIlIlIl = llllllllllllIlllIIIlllIllIIlIllI.count();
            if (lIIIllIlIIIlIlII(llllllllllllIlllIIIlllIllIIlIlIl, EpollSocketChannel.llIIlIlIIllllI[0])) {
                if (lIIIllIlIIIIlIIl(this.writeBytesMultiple(llllllllllllIlllIIIlllIllIIIllll, llllllllllllIlllIIIlllIllIIlIllI) ? 1 : 0)) {
                    return EpollSocketChannel.llIIlIlIIllllI[1] != 0;
                }
            }
            else {
                llllllllllllIlllIIIlllIllIIIllll.removeBytes(0L);
            }
            "".length();
            if (((0x11 ^ 0x2A) & ~(0x9E ^ 0xA5)) == "   ".length()) {
                return ((0x31 ^ 0x28) & ~(0x8F ^ 0x96)) != 0x0;
            }
        }
        else {
            final ByteBuffer[] llllllllllllIlllIIIlllIllIIlIlII = llllllllllllIlllIIIlllIllIIIllll.nioBuffers();
            final int llllllllllllIlllIIIlllIllIIlIIll = llllllllllllIlllIIIlllIllIIIllll.nioBufferCount();
            if (lIIIllIlIIIlIlII(llllllllllllIlllIIIlllIllIIlIIll, EpollSocketChannel.llIIlIlIIllllI[0])) {
                if (lIIIllIlIIIIlIIl(this.writeBytesMultiple(llllllllllllIlllIIIlllIllIIIllll, llllllllllllIlllIIIlllIllIIlIlII, llllllllllllIlllIIIlllIllIIlIIll, llllllllllllIlllIIIlllIllIIIllll.nioBufferSize()) ? 1 : 0)) {
                    return EpollSocketChannel.llIIlIlIIllllI[1] != 0;
                }
            }
            else {
                llllllllllllIlllIIIlllIllIIIllll.removeBytes(0L);
            }
        }
        return EpollSocketChannel.llIIlIlIIllllI[0] != 0;
    }
    
    private static boolean lIIIllIlIIIIlIlI(final int llllllllllllIlllIIIlllIIllIlllIl) {
        return llllllllllllIlllIIIlllIIllIlllIl != 0;
    }
    
    @Override
    public ChannelFuture shutdownOutput(final ChannelPromise llllllllllllIlllIIIlllIlIllIlllI) {
        final EventLoop llllllllllllIlllIIIlllIlIlllIIII = this.eventLoop();
        if (lIIIllIlIIIIlIlI(llllllllllllIlllIIIlllIlIlllIIII.inEventLoop() ? 1 : 0)) {
            try {
                Native.shutdown(this.fd, (boolean)(EpollSocketChannel.llIIlIlIIllllI[1] != 0), (boolean)(EpollSocketChannel.llIIlIlIIllllI[0] != 0));
                this.outputShutdown = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                llllllllllllIlllIIIlllIlIllIlllI.setSuccess();
                "".length();
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
                return llllllllllllIlllIIIlllIlIllIlllI;
            }
            catch (Throwable llllllllllllIlllIIIlllIlIlllIIll) {
                llllllllllllIlllIIIlllIlIllIlllI.setFailure(llllllllllllIlllIIIlllIlIlllIIll);
                "".length();
                "".length();
                if (("  ".length() & ~"  ".length()) > "   ".length()) {
                    return null;
                }
                return llllllllllllIlllIIIlllIlIllIlllI;
            }
        }
        llllllllllllIlllIIIlllIlIlllIIII.execute(new Runnable() {
            @Override
            public void run() {
                EpollSocketChannel.this.shutdownOutput(llllllllllllIlllIIIlllIlIllIlllI);
                "".length();
            }
        });
        return llllllllllllIlllIIIlllIlIllIlllI;
    }
    
    EpollSocketChannel(final Channel llllllllllllIlllIIIllllIIlIlIIll, final int llllllllllllIlllIIIllllIIlIlIIlI) {
        super(llllllllllllIlllIIIllllIIlIlIIll, llllllllllllIlllIIIllllIIlIlIIlI, EpollSocketChannel.llIIlIlIIllllI[0], (boolean)(EpollSocketChannel.llIIlIlIIllllI[0] != 0));
        this.config = new EpollSocketChannelConfig(this);
        this.remote = Native.remoteAddress(llllllllllllIlllIIIllllIIlIlIIlI);
        this.local = Native.localAddress(llllllllllllIlllIIIllllIIlIlIIlI);
    }
    
    @Override
    public boolean isOutputShutdown() {
        int n;
        if (!lIIIllIlIIIIlIIl(this.outputShutdown ? 1 : 0) || lIIIllIlIIIIlIIl(this.isActive() ? 1 : 0)) {
            n = EpollSocketChannel.llIIlIlIIllllI[0];
            "".length();
            if (" ".length() <= 0) {
                return ((0x7B ^ 0x47) & ~(0xF9 ^ 0xC5)) != 0x0;
            }
        }
        else {
            n = EpollSocketChannel.llIIlIlIIllllI[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIllIlIIIlIIll(final int llllllllllllIlllIIIlllIIlllIIIII, final int llllllllllllIlllIIIlllIIllIlllll) {
        return llllllllllllIlllIIIlllIIlllIIIII > llllllllllllIlllIIIlllIIllIlllll;
    }
    
    private static boolean lIIIllIlIIIIlIIl(final int llllllllllllIlllIIIlllIIllIllIll) {
        return llllllllllllIlllIIIlllIIllIllIll == 0;
    }
    
    @Override
    protected AbstractEpollUnsafe newUnsafe() {
        return new EpollSocketUnsafe();
    }
    
    private boolean writeBytes(final ChannelOutboundBuffer llllllllllllIlllIIIllllIIIlIIllI, final ByteBuf llllllllllllIlllIIIllllIIIIlllll) throws Exception {
        final int llllllllllllIlllIIIllllIIIlIIlII = llllllllllllIlllIIIllllIIIIlllll.readableBytes();
        if (lIIIllIlIIIIlIIl(llllllllllllIlllIIIllllIIIlIIlII)) {
            llllllllllllIlllIIIllllIIIlIIllI.remove();
            "".length();
            return EpollSocketChannel.llIIlIlIIllllI[0] != 0;
        }
        boolean llllllllllllIlllIIIllllIIIlIIIll = EpollSocketChannel.llIIlIlIIllllI[1] != 0;
        long llllllllllllIlllIIIllllIIIlIIIlI = 0L;
        if (lIIIllIlIIIIlIlI(llllllllllllIlllIIIllllIIIIlllll.hasMemoryAddress() ? 1 : 0)) {
            final long llllllllllllIlllIIIllllIIIllIIII = llllllllllllIlllIIIllllIIIIlllll.memoryAddress();
            int llllllllllllIlllIIIllllIIIlIllll = llllllllllllIlllIIIllllIIIIlllll.readerIndex();
            final int llllllllllllIlllIIIllllIIIlIlllI = llllllllllllIlllIIIllllIIIIlllll.writerIndex();
            do {
                final int llllllllllllIlllIIIllllIIIllIIIl = Native.writeAddress(this.fd, llllllllllllIlllIIIllllIIIllIIII, llllllllllllIlllIIIllllIIIlIllll, llllllllllllIlllIIIllllIIIlIlllI);
                if (lIIIllIlIIIIlIll(llllllllllllIlllIIIllllIIIllIIIl)) {
                    llllllllllllIlllIIIllllIIIlIIIlI += llllllllllllIlllIIIllllIIIllIIIl;
                    if (lIIIllIlIIIIlIIl(lIIIllIlIIIIlIII(llllllllllllIlllIIIllllIIIlIIIlI, llllllllllllIlllIIIllllIIIlIIlII))) {
                        llllllllllllIlllIIIllllIIIlIIIll = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                        "".length();
                        if (null != null) {
                            return ((0xF0 ^ 0xBF) & ~(0x43 ^ 0xC)) != 0x0;
                        }
                    }
                    else {
                        llllllllllllIlllIIIllllIIIlIllll += llllllllllllIlllIIIllllIIIllIIIl;
                        "".length();
                        if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                            return ((154 + 82 - 157 + 108 ^ 18 + 25 + 81 + 32) & (170 + 55 - 97 + 61 ^ 136 + 107 - 169 + 80 ^ -" ".length())) != 0x0;
                        }
                        "".length();
                        continue;
                    }
                }
                else {
                    this.setEpollOut();
                    "".length();
                    if (" ".length() < ((0xDA ^ 0x8E ^ (0xED ^ 0x9C)) & (149 + 73 - 161 + 113 ^ 55 + 34 - 77 + 127 ^ -" ".length()))) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                }
                llllllllllllIlllIIIllllIIIlIIllI.removeBytes(llllllllllllIlllIIIllllIIIlIIIlI);
                return llllllllllllIlllIIIllllIIIlIIIll;
            } while (" ".length() != "   ".length());
            return ((0x51 ^ 0x33 ^ (0x4E ^ 0x60)) & (0x4E ^ 0x8 ^ (0x10 ^ 0x1A) ^ -" ".length())) != 0x0;
        }
        if (lIIIllIlIIIIllII(llllllllllllIlllIIIllllIIIIlllll.nioBufferCount(), EpollSocketChannel.llIIlIlIIllllI[0])) {
            final int llllllllllllIlllIIIllllIIIlIlIlI = llllllllllllIlllIIIllllIIIIlllll.readerIndex();
            final ByteBuffer llllllllllllIlllIIIllllIIIlIlIIl = llllllllllllIlllIIIllllIIIIlllll.internalNioBuffer(llllllllllllIlllIIIllllIIIlIlIlI, llllllllllllIlllIIIllllIIIIlllll.readableBytes());
            do {
                final int llllllllllllIlllIIIllllIIIlIllIl = llllllllllllIlllIIIllllIIIlIlIIl.position();
                final int llllllllllllIlllIIIllllIIIlIllII = llllllllllllIlllIIIllllIIIlIlIIl.limit();
                final int llllllllllllIlllIIIllllIIIlIlIll = Native.write(this.fd, llllllllllllIlllIIIllllIIIlIlIIl, llllllllllllIlllIIIllllIIIlIllIl, llllllllllllIlllIIIllllIIIlIllII);
                if (lIIIllIlIIIIlIll(llllllllllllIlllIIIllllIIIlIlIll)) {
                    llllllllllllIlllIIIllllIIIlIlIIl.position(llllllllllllIlllIIIllllIIIlIllIl + llllllllllllIlllIIIllllIIIlIlIll);
                    "".length();
                    llllllllllllIlllIIIllllIIIlIIIlI += llllllllllllIlllIIIllllIIIlIlIll;
                    if (!lIIIllIlIIIIlIIl(lIIIllIlIIIIlIII(llllllllllllIlllIIIllllIIIlIIIlI, llllllllllllIlllIIIllllIIIlIIlII))) {
                        "".length();
                        continue;
                    }
                    llllllllllllIlllIIIllllIIIlIIIll = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                    "".length();
                    if (-(0x72 ^ 0x76) >= 0) {
                        return ((0xAD ^ 0xBA) & ~(0x62 ^ 0x75)) != 0x0;
                    }
                }
                else {
                    this.setEpollOut();
                    "".length();
                    if (null != null) {
                        return ((0xE9 ^ 0xA9) & ~(0x68 ^ 0x28)) != 0x0;
                    }
                }
                llllllllllllIlllIIIllllIIIlIIllI.removeBytes(llllllllllllIlllIIIllllIIIlIIIlI);
                return llllllllllllIlllIIIllllIIIlIIIll;
            } while (((0x66 ^ 0x5) & ~(0x72 ^ 0x11)) != "  ".length());
            return ((0xC6 ^ 0x81) & ~(0x74 ^ 0x33)) != 0x0;
        }
        final ByteBuffer[] llllllllllllIlllIIIllllIIIlIlIII = llllllllllllIlllIIIllllIIIIlllll.nioBuffers();
        return this.writeBytesMultiple(llllllllllllIlllIIIllllIIIlIIllI, llllllllllllIlllIIIllllIIIlIlIII, llllllllllllIlllIIIllllIIIlIlIII.length, llllllllllllIlllIIIllllIIIlIIlII);
    }
    
    private static int lIIIllIlIIIIllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIIIllIlIIIlIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIllIlIIIIlIll(final int llllllllllllIlllIIIlllIIllIlIlIl) {
        return llllllllllllIlllIIIlllIIllIlIlIl > 0;
    }
    
    private static void lIIIllIlIIIIIlll() {
        (llIIlIlIIllllI = new int[6])[0] = " ".length();
        EpollSocketChannel.llIIlIlIIllllI[1] = ((0x3D ^ 0x7A) & ~(0x77 ^ 0x30));
        EpollSocketChannel.llIIlIlIIllllI[2] = "  ".length();
        EpollSocketChannel.llIIlIlIIllllI[3] = (0x23 ^ 0xA);
        EpollSocketChannel.llIIlIlIIllllI[4] = "   ".length();
        EpollSocketChannel.llIIlIlIIllllI[5] = (0x13 ^ 0x3B ^ (0x36 ^ 0x16));
    }
    
    private static boolean lIIIllIlIIIlIIlI(final int llllllllllllIlllIIIlllIIllIllIIl) {
        return llllllllllllIlllIIIlllIIllIllIIl >= 0;
    }
    
    private static int lIIIllIlIIIlIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private boolean writeFileRegion(final ChannelOutboundBuffer llllllllllllIlllIIIlllIllIlllIIl, final DefaultFileRegion llllllllllllIlllIIIlllIllIlllIII) throws Exception {
        final long llllllllllllIlllIIIlllIllIlllllI = llllllllllllIlllIIIlllIllIlllIII.count();
        if (lIIIllIlIIIlIIlI(lIIIllIlIIIlIIIl(llllllllllllIlllIIIlllIllIlllIII.transfered(), llllllllllllIlllIIIlllIllIlllllI))) {
            llllllllllllIlllIIIlllIllIlllIIl.remove();
            "".length();
            return EpollSocketChannel.llIIlIlIIllllI[0] != 0;
        }
        final long llllllllllllIlllIIIlllIllIllllIl = llllllllllllIlllIIIlllIllIlllIII.position();
        boolean llllllllllllIlllIIIlllIllIllllII = EpollSocketChannel.llIIlIlIIllllI[1] != 0;
        long llllllllllllIlllIIIlllIllIlllIll = 0L;
        int llllllllllllIlllIIIlllIlllIIIIlI = this.config().getWriteSpinCount() - EpollSocketChannel.llIIlIlIIllllI[0];
        while (lIIIllIlIIIlIIlI(llllllllllllIlllIIIlllIlllIIIIlI)) {
            final long llllllllllllIlllIIIlllIlllIIIlII = llllllllllllIlllIIIlllIllIlllIII.transfered();
            final long llllllllllllIlllIIIlllIlllIIIIll = Native.sendfile(this.fd, llllllllllllIlllIIIlllIllIlllIII, llllllllllllIlllIIIlllIllIllllIl, llllllllllllIlllIIIlllIlllIIIlII, llllllllllllIlllIIIlllIllIlllllI - llllllllllllIlllIIIlllIlllIIIlII);
            if (lIIIllIlIIIIlIIl(lIIIllIlIIIlIIIl(llllllllllllIlllIIIlllIlllIIIIll, 0L))) {
                this.setEpollOut();
                "".length();
                if ((0xC ^ 0x76 ^ (0xD8 ^ 0xA6)) <= ((0xCC ^ 0x86 ^ (0x2E ^ 0x6D)) & (0xAA ^ 0x96 ^ (0x8E ^ 0xBB) ^ -" ".length()))) {
                    return ((0x54 ^ 0x2C ^ (0x43 ^ 0x29)) & (74 + 44 + 64 + 9 ^ 19 + 170 - 32 + 16 ^ -" ".length())) != 0x0;
                }
                break;
            }
            else {
                llllllllllllIlllIIIlllIllIlllIll += llllllllllllIlllIIIlllIlllIIIIll;
                if (lIIIllIlIIIlIIlI(lIIIllIlIIIlIIIl(llllllllllllIlllIIIlllIllIlllIII.transfered(), llllllllllllIlllIIIlllIllIlllllI))) {
                    llllllllllllIlllIIIlllIllIllllII = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return ((0x4B ^ 0x1C) & ~(0xFD ^ 0xAA)) != 0x0;
                    }
                    break;
                }
                else {
                    --llllllllllllIlllIIIlllIlllIIIIlI;
                    "".length();
                    if ((0xA7 ^ 0xA3) <= 0) {
                        return ((0x67 ^ 0x75) & ~(0x78 ^ 0x6A)) != 0x0;
                    }
                    continue;
                }
            }
        }
        if (lIIIllIlIIIIlIll(lIIIllIlIIIlIIIl(llllllllllllIlllIIIlllIllIlllIll, 0L))) {
            llllllllllllIlllIIIlllIllIlllIIl.progress(llllllllllllIlllIIIlllIllIlllIll);
        }
        if (lIIIllIlIIIIlIlI(llllllllllllIlllIIIlllIllIllllII ? 1 : 0)) {
            llllllllllllIlllIIIlllIllIlllIIl.remove();
            "".length();
        }
        return llllllllllllIlllIIIlllIllIllllII;
    }
    
    private static String lIIIllIlIIIIIlII(String llllllllllllIlllIIIlllIIllllIlll, final String llllllllllllIlllIIIlllIIlllllIll) {
        llllllllllllIlllIIIlllIIllllIlll = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlllIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlllIIlllllIlI = new StringBuilder();
        final char[] llllllllllllIlllIIIlllIIlllllIIl = llllllllllllIlllIIIlllIIlllllIll.toCharArray();
        int llllllllllllIlllIIIlllIIlllllIII = EpollSocketChannel.llIIlIlIIllllI[1];
        final byte llllllllllllIlllIIIlllIIllllIIlI = (Object)llllllllllllIlllIIIlllIIllllIlll.toCharArray();
        final short llllllllllllIlllIIIlllIIllllIIIl = (short)llllllllllllIlllIIIlllIIllllIIlI.length;
        byte llllllllllllIlllIIIlllIIllllIIII = (byte)EpollSocketChannel.llIIlIlIIllllI[1];
        while (lIIIllIlIIIIlllI(llllllllllllIlllIIIlllIIllllIIII, llllllllllllIlllIIIlllIIllllIIIl)) {
            final char llllllllllllIlllIIIlllIIllllllIl = llllllllllllIlllIIIlllIIllllIIlI[llllllllllllIlllIIIlllIIllllIIII];
            llllllllllllIlllIIIlllIIlllllIlI.append((char)(llllllllllllIlllIIIlllIIllllllIl ^ llllllllllllIlllIIIlllIIlllllIIl[llllllllllllIlllIIIlllIIlllllIII % llllllllllllIlllIIIlllIIlllllIIl.length]));
            "".length();
            ++llllllllllllIlllIIIlllIIlllllIII;
            ++llllllllllllIlllIIIlllIIllllIIII;
            "".length();
            if ((0x67 ^ 0x63) != (0xAF ^ 0xAB)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlllIIlllllIlI);
    }
    
    private boolean doWriteSingle(final ChannelOutboundBuffer llllllllllllIlllIIIlllIllIIlllIl) throws Exception {
        final Object llllllllllllIlllIIIlllIllIIlllll = llllllllllllIlllIIIlllIllIIlllIl.current();
        if (lIIIllIlIIIIlIlI((llllllllllllIlllIIIlllIllIIlllll instanceof ByteBuf) ? 1 : 0)) {
            final ByteBuf llllllllllllIlllIIIlllIllIlIIIll = (ByteBuf)llllllllllllIlllIIIlllIllIIlllll;
            if (lIIIllIlIIIIlIIl(this.writeBytes(llllllllllllIlllIIIlllIllIIlllIl, llllllllllllIlllIIIlllIllIlIIIll) ? 1 : 0)) {
                return EpollSocketChannel.llIIlIlIIllllI[1] != 0;
            }
            "".length();
            if (null != null) {
                return ((172 + 33 - 174 + 202 ^ 114 + 79 - 133 + 115) & (28 + 124 - 134 + 226 ^ 92 + 50 - 104 + 140 ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!lIIIllIlIIIIlIlI((llllllllllllIlllIIIlllIllIIlllll instanceof DefaultFileRegion) ? 1 : 0)) {
                throw new Error();
            }
            final DefaultFileRegion llllllllllllIlllIIIlllIllIlIIIlI = (DefaultFileRegion)llllllllllllIlllIIIlllIllIIlllll;
            if (lIIIllIlIIIIlIIl(this.writeFileRegion(llllllllllllIlllIIIlllIllIIlllIl, llllllllllllIlllIIIlllIllIlIIIlI) ? 1 : 0)) {
                return EpollSocketChannel.llIIlIlIIllllI[1] != 0;
            }
            "".length();
            if (null != null) {
                return ((0x5 ^ 0x54) & ~(0xC6 ^ 0x97)) != 0x0;
            }
        }
        return EpollSocketChannel.llIIlIlIIllllI[0] != 0;
    }
    
    @Override
    public boolean isInputShutdown() {
        return this.inputShutdown;
    }
    
    private boolean writeBytesMultiple(final ChannelOutboundBuffer llllllllllllIlllIIIlllIlllIllIlI, final ByteBuffer[] llllllllllllIlllIIIlllIlllIllIIl, int llllllllllllIlllIIIlllIlllIllIII, long llllllllllllIlllIIIlllIllllIIIII) throws IOException {
        if (lIIIllIlIIIIlIIl(EpollSocketChannel.$assertionsDisabled ? 1 : 0) && lIIIllIlIIIIlIIl(lIIIllIlIIIlIIII(llllllllllllIlllIIIlllIllllIIIII, 0L))) {
            throw new AssertionError();
        }
        boolean llllllllllllIlllIIIlllIlllIlllll = EpollSocketChannel.llIIlIlIIllllI[1] != 0;
        long llllllllllllIlllIIIlllIlllIllllI = 0L;
        int llllllllllllIlllIIIlllIlllIlllIl = EpollSocketChannel.llIIlIlIIllllI[1];
        final int llllllllllllIlllIIIlllIlllIlllII = llllllllllllIlllIIIlllIlllIlllIl + llllllllllllIlllIIIlllIlllIllIII;
        do {
            long llllllllllllIlllIIIlllIllllIIlIl = Native.writev(this.fd, llllllllllllIlllIIIlllIlllIllIIl, llllllllllllIlllIIIlllIlllIlllIl, llllllllllllIlllIIIlllIlllIllIII);
            if (lIIIllIlIIIIlIIl(lIIIllIlIIIlIIII(llllllllllllIlllIIIlllIllllIIlIl, 0L))) {
                this.setEpollOut();
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return ((0xE7 ^ 0xA4) & ~(0x3B ^ 0x78)) != 0x0;
                }
            }
            else {
                llllllllllllIlllIIIlllIllllIIIII -= llllllllllllIlllIIIlllIllllIIlIl;
                llllllllllllIlllIIIlllIlllIllllI += llllllllllllIlllIIIlllIllllIIlIl;
                if (!lIIIllIlIIIIlIIl(lIIIllIlIIIlIIII(llllllllllllIlllIIIlllIllllIIIII, 0L))) {
                    do {
                        final ByteBuffer llllllllllllIlllIIIlllIllllIlIII = llllllllllllIlllIIIlllIlllIllIIl[llllllllllllIlllIIIlllIlllIlllIl];
                        final int llllllllllllIlllIIIlllIllllIIlll = llllllllllllIlllIIIlllIllllIlIII.position();
                        final int llllllllllllIlllIIIlllIllllIIllI = llllllllllllIlllIIIlllIllllIlIII.limit() - llllllllllllIlllIIIlllIllllIIlll;
                        if (lIIIllIlIIIIlIll(lIIIllIlIIIlIIII(llllllllllllIlllIIIlllIllllIIllI, llllllllllllIlllIIIlllIllllIIlIl))) {
                            llllllllllllIlllIIIlllIllllIlIII.position(llllllllllllIlllIIIlllIllllIIlll + (int)llllllllllllIlllIIIlllIllllIIlIl);
                            "".length();
                            "".length();
                            if (-" ".length() >= 0) {
                                return ((0xB0 ^ 0xB4) & ~(0x6B ^ 0x6F)) != 0x0;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIlllIIIlllIlllIlllIl;
                            --llllllllllllIlllIIIlllIlllIllIII;
                            llllllllllllIlllIIIlllIllllIIlIl -= llllllllllllIlllIIIlllIllllIIllI;
                        }
                    } while (lIIIllIlIIIIlllI(llllllllllllIlllIIIlllIlllIlllIl, llllllllllllIlllIIIlllIlllIlllII) && !lIIIllIlIIIIllll(lIIIllIlIIIlIIII(llllllllllllIlllIIIlllIllllIIlIl, 0L)));
                    "".length();
                    continue;
                }
                llllllllllllIlllIIIlllIlllIlllll = (EpollSocketChannel.llIIlIlIIllllI[0] != 0);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0xDC ^ 0x9B) & ~(0x46 ^ 0x1)) != 0x0;
                }
            }
            llllllllllllIlllIIIlllIlllIllIlI.removeBytes(llllllllllllIlllIIIlllIlllIllllI);
            return llllllllllllIlllIIIlllIlllIlllll;
        } while ("   ".length() == "   ".length());
        return ((0xE3 ^ 0xB6 ^ (0x2C ^ 0x45)) & (0x5E ^ 0x3B ^ (0x24 ^ 0x7D) ^ -" ".length())) != 0x0;
    }
    
    private static boolean lIIIllIlIIIIlllI(final int llllllllllllIlllIIIlllIIlllIIlII, final int llllllllllllIlllIIIlllIIlllIIIll) {
        return llllllllllllIlllIIIlllIIlllIIlII < llllllllllllIlllIIIlllIIlllIIIll;
    }
    
    private static String lIIIllIlIIIIIIll(final String llllllllllllIlllIIIlllIlIIIIlIlI, final String llllllllllllIlllIIIlllIlIIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlllIlIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), EpollSocketChannel.llIIlIlIIllllI[5]), "DES");
            final Cipher llllllllllllIlllIIIlllIlIIIIlllI = Cipher.getInstance("DES");
            llllllllllllIlllIIIlllIlIIIIlllI.init(EpollSocketChannel.llIIlIlIIllllI[2], llllllllllllIlllIIIlllIlIIIIllll);
            return new String(llllllllllllIlllIIIlllIlIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlllIlIIIIllIl) {
            llllllllllllIlllIIIlllIlIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIlIIIIIlIl(final String llllllllllllIlllIIIlllIlIIIllIIl, final String llllllllllllIlllIIIlllIlIIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlllIlIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllIlIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlllIlIIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlllIlIIIllIll.init(EpollSocketChannel.llIIlIlIIllllI[2], llllllllllllIlllIIIlllIlIIIlllII);
            return new String(llllllllllllIlllIIIlllIlIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlllIlIIIllIlI) {
            llllllllllllIlllIIIlllIlIIIllIlI.printStackTrace();
            return null;
        }
    }
    
    final class EpollSocketUnsafe extends AbstractEpollUnsafe
    {
        private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
        private static final /* synthetic */ String[] lIIIlIIlIlllIl;
        private static final /* synthetic */ int[] lIIIlIlIIlIlll;
        static final /* synthetic */ boolean $assertionsDisabled;
        
        @Override
        void epollInReady() {
            final ChannelConfig lllllllllllllIlIIIIllllIIIlIIIII = EpollSocketChannel.this.config();
            final ChannelPipeline lllllllllllllIlIIIIllllIIIIlllll = EpollSocketChannel.this.pipeline();
            final ByteBufAllocator lllllllllllllIlIIIIllllIIIIllllI = lllllllllllllIlIIIIllllIIIlIIIII.getAllocator();
            RecvByteBufAllocator.Handle lllllllllllllIlIIIIllllIIIIlllIl = this.allocHandle;
            if (llIIIIIIlIllllI(lllllllllllllIlIIIIllllIIIIlllIl)) {
                lllllllllllllIlIIIIllllIIIIlllIl = (this.allocHandle = lllllllllllllIlIIIIllllIIIlIIIII.getRecvByteBufAllocator().newHandle());
            }
            ByteBuf lllllllllllllIlIIIIllllIIIIlllII = null;
            boolean lllllllllllllIlIIIIllllIIIIllIll = EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0;
            try {
                int lllllllllllllIlIIIIllllIIIlIIlII = EpollSocketUnsafe.lIIIlIlIIlIlll[1];
                do {
                    lllllllllllllIlIIIIllllIIIIlllII = lllllllllllllIlIIIIllllIIIIlllIl.allocate(lllllllllllllIlIIIIllllIIIIllllI);
                    final int lllllllllllllIlIIIIllllIIIlIIllI = lllllllllllllIlIIIIllllIIIIlllII.writableBytes();
                    final int lllllllllllllIlIIIIllllIIIlIIlIl = this.doReadBytes(lllllllllllllIlIIIIllllIIIIlllII);
                    if (llIIIIIIlIlllll(lllllllllllllIlIIIIllllIIIlIIlIl)) {
                        lllllllllllllIlIIIIllllIIIIlllII.release();
                        "".length();
                        int n;
                        if (llIIIIIIllIIIII(lllllllllllllIlIIIIllllIIIlIIlIl)) {
                            n = EpollSocketUnsafe.lIIIlIlIIlIlll[0];
                            "".length();
                            if (-(0xA8 ^ 0xAD) >= 0) {
                                return;
                            }
                        }
                        else {
                            n = EpollSocketUnsafe.lIIIlIlIIlIlll[1];
                        }
                        lllllllllllllIlIIIIllllIIIIllIll = (n != 0);
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        this.readPending = (EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0);
                        lllllllllllllIlIIIIllllIIIIlllll.fireChannelRead(lllllllllllllIlIIIIllllIIIIlllII);
                        "".length();
                        lllllllllllllIlIIIIllllIIIIlllII = null;
                        if (llIIIIIIllIIIIl(lllllllllllllIlIIIIllllIIIlIIlII, EpollSocketUnsafe.lIIIlIlIIlIlll[3] - lllllllllllllIlIIIIllllIIIlIIlIl)) {
                            lllllllllllllIlIIIIllllIIIIlllIl.record(lllllllllllllIlIIIIllllIIIlIIlII);
                            lllllllllllllIlIIIIllllIIIlIIlII = lllllllllllllIlIIIIllllIIIlIIlIl;
                            "".length();
                            if (((0x81 ^ 0xB9) & ~(0xB1 ^ 0x89)) != 0x0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIlIIIIllllIIIlIIlII += lllllllllllllIlIIIIllllIIIlIIlIl;
                        }
                        if (!llIIIIIIllIIIlI(lllllllllllllIlIIIIllllIIIlIIlIl, lllllllllllllIlIIIIllllIIIlIIllI)) {
                            "".length();
                            continue;
                        }
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    }
                    lllllllllllllIlIIIIllllIIIIlllll.fireChannelReadComplete();
                    "".length();
                    lllllllllllllIlIIIIllllIIIIlllIl.record(lllllllllllllIlIIIIllllIIIlIIlII);
                    if (llIIIIIIlIllIlI(lllllllllllllIlIIIIllllIIIIllIll ? 1 : 0)) {
                        this.closeOnRead(lllllllllllllIlIIIIllllIIIIlllll);
                        lllllllllllllIlIIIIllllIIIIllIll = (EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0);
                    }
                    if (!llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIIlIIIII.isAutoRead() ? 1 : 0) || !llIIIIIIlIlllII(this.readPending ? 1 : 0)) {
                        return;
                    }
                    this.clearEpollIn0();
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                } while (((0xB7 ^ 0x9F) & ~(0xBF ^ 0x97)) != "   ".length());
            }
            catch (Throwable lllllllllllllIlIIIIllllIIIlIIIlI) {
                final boolean lllllllllllllIlIIIIllllIIIlIIIll = this.handleReadException(lllllllllllllIlIIIIllllIIIIlllll, lllllllllllllIlIIIIllllIIIIlllII, lllllllllllllIlIIIIllllIIIlIIIlI, lllllllllllllIlIIIIllllIIIIllIll);
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIIlIIIll ? 1 : 0)) {
                    EpollSocketChannel.this.eventLoop().execute(new Runnable() {
                        @Override
                        public void run() {
                            EpollSocketUnsafe.this.epollInReady();
                        }
                    });
                }
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIIlIIIII.isAutoRead() ? 1 : 0) && llIIIIIIlIlllII(this.readPending ? 1 : 0)) {
                    this.clearEpollIn0();
                    "".length();
                    if (((68 + 71 - 21 + 56 ^ 182 + 106 - 174 + 69) & (0x30 ^ 0x25 ^ (0xB7 ^ 0xBB) ^ -" ".length())) >= "   ".length()) {
                        return;
                    }
                }
            }
            finally {
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIIlIIIII.isAutoRead() ? 1 : 0) && llIIIIIIlIlllII(this.readPending ? 1 : 0)) {
                    this.clearEpollIn0();
                }
            }
        }
        
        @Override
        void epollOutReady() {
            if (llIIIIIIlIllIll(EpollSocketChannel.this.connectPromise)) {
                this.finishConnect();
                "".length();
                if ((0x80 ^ 0x84) == ((0x17 ^ 0x19) & ~(0x93 ^ 0x9D))) {
                    return;
                }
            }
            else {
                super.epollOutReady();
            }
        }
        
        private static boolean llIIIIIIllIIIII(final int lllllllllllllIlIIIIlllIlllIllIIl) {
            return lllllllllllllIlIIIIlllIlllIllIIl < 0;
        }
        
        private static String lIllllllIlIllII(final String lllllllllllllIlIIIIllllIIIIIlIII, final String lllllllllllllIlIIIIllllIIIIIIlIl) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIllllIIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllllIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), EpollSocketUnsafe.lIIIlIlIIlIlll[5]), "DES");
                final Cipher lllllllllllllIlIIIIllllIIIIIlIlI = Cipher.getInstance("DES");
                lllllllllllllIlIIIIllllIIIIIlIlI.init(EpollSocketUnsafe.lIIIlIlIIlIlll[2], lllllllllllllIlIIIIllllIIIIIlIll);
                return new String(lllllllllllllIlIIIIllllIIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllllIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIllllIIIIIlIIl) {
                lllllllllllllIlIIIIllllIIIIIlIIl.printStackTrace();
                return null;
            }
        }
        
        private void closeOnRead(final ChannelPipeline lllllllllllllIlIIIIllllIlIlIIlIl) {
            EpollSocketChannel.this.inputShutdown = (boolean)(EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0);
            "".length();
            if (llIIIIIIlIllIlI(EpollSocketChannel.this.isOpen() ? 1 : 0)) {
                if (llIIIIIIlIllIlI(Boolean.TRUE.equals(EpollSocketChannel.this.config().getOption(ChannelOption.ALLOW_HALF_CLOSURE)) ? 1 : 0)) {
                    this.clearEpollIn0();
                    lllllllllllllIlIIIIllllIlIlIIlIl.fireUserEventTriggered(ChannelInputShutdownEvent.INSTANCE);
                    "".length();
                    "".length();
                    if (-(0x3 ^ 0x65 ^ (0x26 ^ 0x45)) >= 0) {
                        return;
                    }
                }
                else {
                    this.close(this.voidPromise());
                }
            }
        }
        
        private boolean doFinishConnect() throws Exception {
            if (llIIIIIIlIllIlI(Native.finishConnect(EpollSocketChannel.this.fd) ? 1 : 0)) {
                EpollSocketChannel.this.clearEpollOut();
                return EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0;
            }
            EpollSocketChannel.this.setEpollOut();
            return EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0;
        }
        
        @Override
        public void connect(final SocketAddress lllllllllllllIlIIIIllllIlIIIlIlI, final SocketAddress lllllllllllllIlIIIIllllIlIIIIlIl, final ChannelPromise lllllllllllllIlIIIIllllIlIIIlIII) {
            if (!llIIIIIIlIllIlI(lllllllllllllIlIIIIllllIlIIIlIII.setUncancellable() ? 1 : 0) || llIIIIIIlIlllII(this.ensureOpen(lllllllllllllIlIIIIllllIlIIIlIII) ? 1 : 0)) {
                return;
            }
            try {
                if (llIIIIIIlIllIll(EpollSocketChannel.this.connectPromise)) {
                    throw new IllegalStateException(EpollSocketUnsafe.lIIIlIIlIlllIl[EpollSocketUnsafe.lIIIlIlIIlIlll[1]]);
                }
                final boolean lllllllllllllIlIIIIllllIlIIIlllI = EpollSocketChannel.this.isActive();
                if (llIIIIIIlIllIlI(this.doConnect((InetSocketAddress)lllllllllllllIlIIIIllllIlIIIlIlI, (InetSocketAddress)lllllllllllllIlIIIIllllIlIIIIlIl) ? 1 : 0)) {
                    this.fulfillConnectPromise(lllllllllllllIlIIIIllllIlIIIlIII, lllllllllllllIlIIIIllllIlIIIlllI);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    EpollSocketChannel.this.connectPromise = lllllllllllllIlIIIIllllIlIIIlIII;
                    "".length();
                    EpollSocketChannel.this.requestedRemoteAddress = lllllllllllllIlIIIIllllIlIIIlIlI;
                    "".length();
                    final int lllllllllllllIlIIIIllllIlIIIllll = EpollSocketChannel.this.config().getConnectTimeoutMillis();
                    if (llIIIIIIlIlllIl(lllllllllllllIlIIIIllllIlIIIllll)) {
                        EpollSocketChannel.this.connectTimeoutFuture = EpollSocketChannel.this.eventLoop().schedule((Runnable)new Runnable() {
                            private static final /* synthetic */ String[] llllIlIIlIllI;
                            private static final /* synthetic */ int[] llllIlIIllIIl;
                            
                            private static String lIlIlIlIIIIlIlI(final String lllllllllllllIlIllIllIllIIIllIIl, final String lllllllllllllIlIllIllIllIIIllIlI) {
                                try {
                                    final SecretKeySpec lllllllllllllIlIllIllIllIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllIllIIIllIlI.getBytes(StandardCharsets.UTF_8)), EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[2]), "DES");
                                    final Cipher lllllllllllllIlIllIllIllIIIlllIl = Cipher.getInstance("DES");
                                    lllllllllllllIlIllIllIllIIIlllIl.init(EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[3], lllllllllllllIlIllIllIllIIIllllI);
                                    return new String(lllllllllllllIlIllIllIllIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                                }
                                catch (Exception lllllllllllllIlIllIllIllIIIlllII) {
                                    lllllllllllllIlIllIllIllIIIlllII.printStackTrace();
                                    return null;
                                }
                            }
                            
                            private static boolean lIlIlIlIIIlIIll(final int lllllllllllllIlIllIllIllIIIlIIlI) {
                                return lllllllllllllIlIllIllIllIIIlIIlI != 0;
                            }
                            
                            @Override
                            public void run() {
                                final ChannelPromise lllllllllllllIlIllIllIllIIlIIlll = EpollSocketChannel.this.connectPromise;
                                final ConnectTimeoutException lllllllllllllIlIllIllIllIIlIIllI = new ConnectTimeoutException(String.valueOf(new StringBuilder().append(EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIlIllI[EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[0]]).append(lllllllllllllIlIIIIllllIlIIIlIlI)));
                                if (lIlIlIlIIIlIIlI(lllllllllllllIlIllIllIllIIlIIlll) && lIlIlIlIIIlIIll(lllllllllllllIlIllIllIllIIlIIlll.tryFailure(lllllllllllllIlIllIllIllIIlIIllI) ? 1 : 0)) {
                                    EpollSocketUnsafe.this.close(EpollSocketUnsafe.this.voidPromise());
                                }
                            }
                            
                            private static void lIlIlIlIIIIlIll() {
                                (llllIlIIlIllI = new String[EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[1]])[EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[0]] = lIlIlIlIIIIlIlI("nVK0hDFi2BWrem2YDmS7mvQnFjnJ+sHs", "OxfTn");
                            }
                            
                            private static void lIlIlIlIIIlIIIl() {
                                (llllIlIIllIIl = new int[4])[0] = ((47 + 138 - 65 + 30 ^ 165 + 113 - 120 + 15) & (31 + 137 - 130 + 216 ^ 149 + 166 - 232 + 114 ^ -" ".length()));
                                EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[1] = " ".length();
                                EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[2] = (82 + 78 - 70 + 64 ^ 138 + 62 - 132 + 78);
                                EpollSocketChannel$EpollSocketUnsafe$1.llllIlIIllIIl[3] = "  ".length();
                            }
                            
                            static {
                                lIlIlIlIIIlIIIl();
                                lIlIlIlIIIIlIll();
                            }
                            
                            private static boolean lIlIlIlIIIlIIlI(final Object lllllllllllllIlIllIllIllIIIlIlII) {
                                return lllllllllllllIlIllIllIllIIIlIlII != null;
                            }
                        }, (long)lllllllllllllIlIIIIllllIlIIIllll, TimeUnit.MILLISECONDS);
                        "".length();
                    }
                    lllllllllllllIlIIIIllllIlIIIlIII.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                        private static final /* synthetic */ int[] lIIlllIIlIlIII;
                        
                        private static void llIllIlIlllIIIl() {
                            (lIIlllIIlIlIII = new int[1])[0] = ((12 + 17 + 45 + 62 ^ 46 + 45 - 36 + 104) & (125 + 139 - 109 + 33 ^ 136 + 164 - 253 + 124 ^ -" ".length()));
                        }
                        
                        @Override
                        public void operationComplete(final ChannelFuture lllllllllllllIIlIlIIIlIIIIIlIlIl) throws Exception {
                            if (llIllIlIlllIIlI(lllllllllllllIIlIlIIIlIIIIIlIlIl.isCancelled() ? 1 : 0)) {
                                if (llIllIlIlllIlII(EpollSocketChannel.this.connectTimeoutFuture)) {
                                    EpollSocketChannel.this.connectTimeoutFuture.cancel((boolean)(EpollSocketChannel$EpollSocketUnsafe$2.lIIlllIIlIlIII[0] != 0));
                                    "".length();
                                }
                                EpollSocketChannel.this.connectPromise = null;
                                "".length();
                                EpollSocketUnsafe.this.close(EpollSocketUnsafe.this.voidPromise());
                            }
                        }
                        
                        private static boolean llIllIlIlllIlII(final Object lllllllllllllIIlIlIIIlIIIIIIlIll) {
                            return lllllllllllllIIlIlIIIlIIIIIIlIll != null;
                        }
                        
                        private static boolean llIllIlIlllIIlI(final int lllllllllllllIIlIlIIIlIIIIIIlIIl) {
                            return lllllllllllllIIlIlIIIlIIIIIIlIIl != 0;
                        }
                        
                        static {
                            llIllIlIlllIIIl();
                        }
                    });
                    "".length();
                }
                "".length();
                if ((0x8F ^ 0x8B) <= "   ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIlIIIIllllIlIIIllII) {
                if (llIIIIIIlIllIlI((lllllllllllllIlIIIIllllIlIIIllII instanceof ConnectException) ? 1 : 0)) {
                    final Throwable lllllllllllllIlIIIIllllIlIIIllIl = new ConnectException(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIllllIlIIIllII.getMessage()).append(EpollSocketUnsafe.lIIIlIIlIlllIl[EpollSocketUnsafe.lIIIlIlIIlIlll[0]]).append(lllllllllllllIlIIIIllllIlIIIlIlI)));
                    lllllllllllllIlIIIIllllIlIIIllIl.setStackTrace(lllllllllllllIlIIIIllllIlIIIllII.getStackTrace());
                    lllllllllllllIlIIIIllllIlIIIllII = lllllllllllllIlIIIIllllIlIIIllIl;
                }
                this.closeIfClosed();
                lllllllllllllIlIIIIllllIlIIIlIII.tryFailure(lllllllllllllIlIIIIllllIlIIIllII);
                "".length();
            }
        }
        
        static {
            llIIIIIIlIllIIl();
            lIllllllIlIllIl();
            int $assertionsDisabled2;
            if (llIIIIIIlIlllII(EpollSocketChannel.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = EpollSocketUnsafe.lIIIlIlIIlIlll[0];
                "".length();
                if ((0x74 ^ 0x70) <= ((0x16 ^ 0x44) & ~(0x5C ^ 0xE))) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = EpollSocketUnsafe.lIIIlIlIIlIlll[1];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private boolean handleReadException(final ChannelPipeline lllllllllllllIlIIIIllllIlIIllllI, final ByteBuf lllllllllllllIlIIIIllllIlIIllIII, final Throwable lllllllllllllIlIIIIllllIlIIlIlll, final boolean lllllllllllllIlIIIIllllIlIIllIll) {
            if (llIIIIIIlIllIll(lllllllllllllIlIIIIllllIlIIllIII)) {
                if (llIIIIIIlIllIlI(lllllllllllllIlIIIIllllIlIIllIII.isReadable() ? 1 : 0)) {
                    this.readPending = (EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0);
                    lllllllllllllIlIIIIllllIlIIllllI.fireChannelRead(lllllllllllllIlIIIIllllIlIIllIII);
                    "".length();
                    "".length();
                    if (-" ".length() > (0x89 ^ 0x8D)) {
                        return ((0xF7 ^ 0xC5) & ~(0x7A ^ 0x48)) != 0x0;
                    }
                }
                else {
                    lllllllllllllIlIIIIllllIlIIllIII.release();
                    "".length();
                }
            }
            lllllllllllllIlIIIIllllIlIIllllI.fireChannelReadComplete();
            "".length();
            lllllllllllllIlIIIIllllIlIIllllI.fireExceptionCaught(lllllllllllllIlIIIIllllIlIIlIlll);
            "".length();
            if (!llIIIIIIlIlllII(lllllllllllllIlIIIIllllIlIIllIll ? 1 : 0) || llIIIIIIlIllIlI((lllllllllllllIlIIIIllllIlIIlIlll instanceof IOException) ? 1 : 0)) {
                this.closeOnRead(lllllllllllllIlIIIIllllIlIIllllI);
                return EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0;
            }
            return EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0;
        }
        
        private static void llIIIIIIlIllIIl() {
            (lIIIlIlIIlIlll = new int[6])[0] = " ".length();
            EpollSocketUnsafe.lIIIlIlIIlIlll[1] = ((0x1A ^ 0x1E) & ~(0xB ^ 0xF));
            EpollSocketUnsafe.lIIIlIlIIlIlll[2] = "  ".length();
            EpollSocketUnsafe.lIIIlIlIIlIlll[3] = (-1 & Integer.MAX_VALUE);
            EpollSocketUnsafe.lIIIlIlIIlIlll[4] = "   ".length();
            EpollSocketUnsafe.lIIIlIlIIlIlll[5] = (29 + 162 - 37 + 11 ^ 101 + 167 - 187 + 92);
        }
        
        private static boolean llIIIIIIlIllIll(final Object lllllllllllllIlIIIIlllIllllIIIIl) {
            return lllllllllllllIlIIIIlllIllllIIIIl != null;
        }
        
        private boolean doConnect(final InetSocketAddress lllllllllllllIlIIIIllllIIlIlIIIl, final InetSocketAddress lllllllllllllIlIIIIllllIIlIlIIII) throws Exception {
            if (llIIIIIIlIllIll(lllllllllllllIlIIIIllllIIlIlIIII)) {
                AbstractEpollChannel.checkResolvable(lllllllllllllIlIIIIllllIIlIlIIII);
                Native.bind(EpollSocketChannel.this.fd, lllllllllllllIlIIIIllllIIlIlIIII.getAddress(), lllllllllllllIlIIIIllllIIlIlIIII.getPort());
            }
            boolean lllllllllllllIlIIIIllllIIlIIllll = EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0;
            try {
                AbstractEpollChannel.checkResolvable(lllllllllllllIlIIIIllllIIlIlIIIl);
                final boolean lllllllllllllIlIIIIllllIIlIlIIll = Native.connect(EpollSocketChannel.this.fd, lllllllllllllIlIIIIllllIIlIlIIIl.getAddress(), lllllllllllllIlIIIIllllIIlIlIIIl.getPort());
                EpollSocketChannel.this.remote = lllllllllllllIlIIIIllllIIlIlIIIl;
                "".length();
                EpollSocketChannel.this.local = Native.localAddress(EpollSocketChannel.this.fd);
                "".length();
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIlIlIIll ? 1 : 0)) {
                    EpollSocketChannel.this.setEpollOut();
                }
                lllllllllllllIlIIIIllllIIlIIllll = (EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0);
                final double lllllllllllllIlIIIIllllIIlIIlIIl = lllllllllllllIlIIIIllllIIlIlIIll ? 1 : 0;
                return lllllllllllllIlIIIIllllIIlIIlIIl != 0.0;
            }
            finally {
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIlIIllll ? 1 : 0)) {
                    EpollSocketChannel.this.doClose();
                }
            }
        }
        
        private void fulfillConnectPromise(final ChannelPromise lllllllllllllIlIIIIllllIIllllIII, final boolean lllllllllllllIlIIIIllllIIllllIll) {
            if (llIIIIIIlIllllI(lllllllllllllIlIIIIllllIIllllIII)) {
                return;
            }
            EpollSocketChannel.this.active = (EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0);
            final boolean lllllllllllllIlIIIIllllIIllllIlI = lllllllllllllIlIIIIllllIIllllIII.trySuccess();
            if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIllllIll ? 1 : 0) && llIIIIIIlIllIlI(EpollSocketChannel.this.isActive() ? 1 : 0)) {
                EpollSocketChannel.this.pipeline().fireChannelActive();
                "".length();
            }
            if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIllllIlI ? 1 : 0)) {
                this.close(this.voidPromise());
            }
        }
        
        private int doReadBytes(final ByteBuf lllllllllllllIlIIIIllllIIIlllIII) throws Exception {
            final int lllllllllllllIlIIIIllllIIIlllIll = lllllllllllllIlIIIIllllIIIlllIII.writerIndex();
            int lllllllllllllIlIIIIllllIIIlllIlI = 0;
            if (llIIIIIIlIllIlI(lllllllllllllIlIIIIllllIIIlllIII.hasMemoryAddress() ? 1 : 0)) {
                final int lllllllllllllIlIIIIllllIIIllllll = Native.readAddress(EpollSocketChannel.this.fd, lllllllllllllIlIIIIllllIIIlllIII.memoryAddress(), lllllllllllllIlIIIIllllIIIlllIll, lllllllllllllIlIIIIllllIIIlllIII.capacity());
                "".length();
                if ("   ".length() == 0) {
                    return (0xE2 ^ 0xC3) & ~(0x47 ^ 0x66);
                }
            }
            else {
                final ByteBuffer lllllllllllllIlIIIIllllIIIlllllI = lllllllllllllIlIIIIllllIIIlllIII.internalNioBuffer(lllllllllllllIlIIIIllllIIIlllIll, lllllllllllllIlIIIIllllIIIlllIII.writableBytes());
                lllllllllllllIlIIIIllllIIIlllIlI = Native.read(EpollSocketChannel.this.fd, lllllllllllllIlIIIIllllIIIlllllI, lllllllllllllIlIIIIllllIIIlllllI.position(), lllllllllllllIlIIIIllllIIIlllllI.limit());
            }
            if (llIIIIIIlIlllIl(lllllllllllllIlIIIIllllIIIlllIlI)) {
                lllllllllllllIlIIIIllllIIIlllIII.writerIndex(lllllllllllllIlIIIIllllIIIlllIll + lllllllllllllIlIIIIllllIIIlllIlI);
                "".length();
            }
            return lllllllllllllIlIIIIllllIIIlllIlI;
        }
        
        private static boolean llIIIIIIlIllllI(final Object lllllllllllllIlIIIIlllIlllIlllll) {
            return lllllllllllllIlIIIIlllIlllIlllll == null;
        }
        
        private void fulfillConnectPromise(final ChannelPromise lllllllllllllIlIIIIllllIIlllIIIl, final Throwable lllllllllllllIlIIIIllllIIlllIIII) {
            if (llIIIIIIlIllllI(lllllllllllllIlIIIIllllIIlllIIIl)) {
                return;
            }
            lllllllllllllIlIIIIllllIIlllIIIl.tryFailure(lllllllllllllIlIIIIllllIIlllIIII);
            "".length();
            this.closeIfClosed();
        }
        
        private static String lIllllllIlIlIll(String lllllllllllllIlIIIIlllIlllllIIll, final String lllllllllllllIlIIIIlllIlllllIIlI) {
            lllllllllllllIlIIIIlllIlllllIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIlllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIlllIlllllIllI = new StringBuilder();
            final char[] lllllllllllllIlIIIIlllIlllllIlIl = lllllllllllllIlIIIIlllIlllllIIlI.toCharArray();
            int lllllllllllllIlIIIIlllIlllllIlII = EpollSocketUnsafe.lIIIlIlIIlIlll[1];
            final short lllllllllllllIlIIIIlllIllllIlllI = (Object)lllllllllllllIlIIIIlllIlllllIIll.toCharArray();
            final long lllllllllllllIlIIIIlllIllllIllIl = lllllllllllllIlIIIIlllIllllIlllI.length;
            double lllllllllllllIlIIIIlllIllllIllII = EpollSocketUnsafe.lIIIlIlIIlIlll[1];
            while (llIIIIIIllIIIlI((int)lllllllllllllIlIIIIlllIllllIllII, (int)lllllllllllllIlIIIIlllIllllIllIl)) {
                final char lllllllllllllIlIIIIlllIllllllIIl = lllllllllllllIlIIIIlllIllllIlllI[lllllllllllllIlIIIIlllIllllIllII];
                lllllllllllllIlIIIIlllIlllllIllI.append((char)(lllllllllllllIlIIIIlllIllllllIIl ^ lllllllllllllIlIIIIlllIlllllIlIl[lllllllllllllIlIIIIlllIlllllIlII % lllllllllllllIlIIIIlllIlllllIlIl.length]));
                "".length();
                ++lllllllllllllIlIIIIlllIlllllIlII;
                ++lllllllllllllIlIIIIlllIllllIllII;
                "".length();
                if ("  ".length() == "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIlllIlllllIllI);
        }
        
        @Override
        void epollRdHupReady() {
            if (llIIIIIIlIllIlI(EpollSocketChannel.this.isActive() ? 1 : 0)) {
                this.epollInReady();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.closeOnRead(EpollSocketChannel.this.pipeline());
            }
        }
        
        private static boolean llIIIIIIllIIIlI(final int lllllllllllllIlIIIIlllIllllIIlII, final int lllllllllllllIlIIIIlllIllllIIIll) {
            return lllllllllllllIlIIIIlllIllllIIlII < lllllllllllllIlIIIIlllIllllIIIll;
        }
        
        private static boolean llIIIIIIlIlllII(final int lllllllllllllIlIIIIlllIlllIllIll) {
            return lllllllllllllIlIIIIlllIlllIllIll == 0;
        }
        
        private void finishConnect() {
            if (llIIIIIIlIlllII(EpollSocketUnsafe.$assertionsDisabled ? 1 : 0) && llIIIIIIlIlllII(EpollSocketChannel.this.eventLoop().inEventLoop() ? 1 : 0)) {
                throw new AssertionError();
            }
            boolean lllllllllllllIlIIIIllllIIllIIIll = EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0;
            try {
                final boolean lllllllllllllIlIIIIllllIIllIIlll = EpollSocketChannel.this.isActive();
                if (llIIIIIIlIlllII(this.doFinishConnect() ? 1 : 0)) {
                    lllllllllllllIlIIIIllllIIllIIIll = (EpollSocketUnsafe.lIIIlIlIIlIlll[0] != 0);
                    return;
                }
                this.fulfillConnectPromise(EpollSocketChannel.this.connectPromise, lllllllllllllIlIIIIllllIIllIIlll);
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIllIIIll ? 1 : 0)) {
                    if (llIIIIIIlIllIll(EpollSocketChannel.this.connectTimeoutFuture)) {
                        EpollSocketChannel.this.connectTimeoutFuture.cancel((boolean)(EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0));
                        "".length();
                    }
                    EpollSocketChannel.this.connectPromise = null;
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            catch (Throwable lllllllllllllIlIIIIllllIIllIIlIl) {
                if (llIIIIIIlIllIlI((lllllllllllllIlIIIIllllIIllIIlIl instanceof ConnectException) ? 1 : 0)) {
                    final Throwable lllllllllllllIlIIIIllllIIllIIllI = new ConnectException(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIllllIIllIIlIl.getMessage()).append(EpollSocketUnsafe.lIIIlIIlIlllIl[EpollSocketUnsafe.lIIIlIlIIlIlll[2]]).append(EpollSocketChannel.this.requestedRemoteAddress)));
                    lllllllllllllIlIIIIllllIIllIIllI.setStackTrace(lllllllllllllIlIIIIllllIIllIIlIl.getStackTrace());
                    lllllllllllllIlIIIIllllIIllIIlIl = lllllllllllllIlIIIIllllIIllIIllI;
                }
                this.fulfillConnectPromise(EpollSocketChannel.this.connectPromise, lllllllllllllIlIIIIllllIIllIIlIl);
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIllIIIll ? 1 : 0)) {
                    if (llIIIIIIlIllIll(EpollSocketChannel.this.connectTimeoutFuture)) {
                        EpollSocketChannel.this.connectTimeoutFuture.cancel((boolean)(EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0));
                        "".length();
                    }
                    EpollSocketChannel.this.connectPromise = null;
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            finally {
                if (llIIIIIIlIlllII(lllllllllllllIlIIIIllllIIllIIIll ? 1 : 0)) {
                    if (llIIIIIIlIllIll(EpollSocketChannel.this.connectTimeoutFuture)) {
                        EpollSocketChannel.this.connectTimeoutFuture.cancel((boolean)(EpollSocketUnsafe.lIIIlIlIIlIlll[1] != 0));
                        "".length();
                    }
                    EpollSocketChannel.this.connectPromise = null;
                    "".length();
                }
            }
        }
        
        private static boolean llIIIIIIlIlllIl(final int lllllllllllllIlIIIIlllIlllIlIlIl) {
            return lllllllllllllIlIIIIlllIlllIlIlIl > 0;
        }
        
        private static void lIllllllIlIllIl() {
            (lIIIlIIlIlllIl = new String[EpollSocketUnsafe.lIIIlIlIIlIlll[4]])[EpollSocketUnsafe.lIIIlIlIIlIlll[1]] = lIllllllIlIlIll("BSkkJhMFMiMnGEYnPjwTCzY+aBcKNC8pEh9mJykSAw==", "fFJHv");
            EpollSocketUnsafe.lIIIlIIlIlllIl[EpollSocketUnsafe.lIIIlIlIIlIlll[0]] = lIllllllIlIllII("mamcvR8TweU=", "focum");
            EpollSocketUnsafe.lIIIlIIlIlllIl[EpollSocketUnsafe.lIIIlIlIIlIlll[2]] = lIllllllIlIllII("ry+lyrSl/Vc=", "eHAes");
        }
        
        private static boolean llIIIIIIlIllIlI(final int lllllllllllllIlIIIIlllIlllIlllIl) {
            return lllllllllllllIlIIIIlllIlllIlllIl != 0;
        }
        
        private static boolean llIIIIIIlIlllll(final int lllllllllllllIlIIIIlllIlllIlIlll) {
            return lllllllllllllIlIIIIlllIlllIlIlll <= 0;
        }
        
        private static boolean llIIIIIIllIIIIl(final int lllllllllllllIlIIIIlllIllllIlIII, final int lllllllllllllIlIIIIlllIllllIIlll) {
            return lllllllllllllIlIIIIlllIllllIlIII >= lllllllllllllIlIIIIlllIllllIIlll;
        }
    }
}
