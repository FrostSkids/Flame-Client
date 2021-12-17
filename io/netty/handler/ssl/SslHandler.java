// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.ssl;

import io.netty.util.ReferenceCounted;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelFutureListener;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import io.netty.buffer.Unpooled;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ScheduledFuture;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.Channel;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelException;
import io.netty.buffer.ByteBufAllocator;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.net.SocketAddress;
import io.netty.channel.ChannelFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import io.netty.util.concurrent.ImmediateExecutor;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.channel.ChannelPromise;
import javax.net.ssl.SSLEngineResult;
import io.netty.buffer.ByteBuf;
import java.util.regex.Pattern;
import io.netty.channel.ChannelHandlerContext;
import javax.net.ssl.SSLEngine;
import io.netty.channel.PendingWriteQueue;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLException;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.handler.codec.ByteToMessageDecoder;

public class SslHandler extends ByteToMessageDecoder implements ChannelOutboundHandler
{
    private final /* synthetic */ int maxPacketBufferSize;
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ LazyChannelPromise sslCloseFuture;
    private static final /* synthetic */ SSLException SSLENGINE_CLOSED;
    private final /* synthetic */ boolean wantsLargeOutboundNetworkBuffer;
    private volatile /* synthetic */ long handshakeTimeoutMillis;
    private final /* synthetic */ Executor delegatedTaskExecutor;
    private final /* synthetic */ boolean startTls;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ ClosedChannelException CHANNEL_CLOSED;
    private /* synthetic */ PendingWriteQueue pendingUnencryptedWrites;
    private static final /* synthetic */ int[] lIlllIIIlIlIII;
    private static final /* synthetic */ String[] lIlllIIIlIIlIl;
    private /* synthetic */ boolean sentFirstMessage;
    private final /* synthetic */ SSLEngine engine;
    private final /* synthetic */ boolean wantsDirectBuffer;
    private volatile /* synthetic */ ChannelHandlerContext ctx;
    private volatile /* synthetic */ long closeNotifyTimeoutMillis;
    private final /* synthetic */ LazyChannelPromise handshakePromise;
    private /* synthetic */ boolean wantsInboundHeapBuffer;
    private /* synthetic */ int packetLength;
    private static final /* synthetic */ Pattern IGNORABLE_CLASS_IN_STACK;
    private static final /* synthetic */ SSLException HANDSHAKE_TIMED_OUT;
    private /* synthetic */ boolean needsFlush;
    private /* synthetic */ boolean flushedBeforeHandshakeDone;
    private static final /* synthetic */ Pattern IGNORABLE_ERROR_MESSAGE;
    
    private void wrap(final ChannelHandlerContext llllllllllllIlllllIllIlIIIIIllII, final boolean llllllllllllIlllllIllIlIIIIIlIll) throws SSLException {
        ByteBuf llllllllllllIlllllIllIlIIIIIllll = null;
        ChannelPromise llllllllllllIlllllIllIlIIIIIlllI = null;
        try {
            while (true) {
                final Object llllllllllllIlllllIllIlIIIIlIllI = this.pendingUnencryptedWrites.current();
                if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIIIIlIllI)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    this.finishWrap(llllllllllllIlllllIllIlIIIIIllII, llllllllllllIlllllIllIlIIIIIllll, llllllllllllIlllllIllIlIIIIIlllI, llllllllllllIlllllIllIlIIIIIlIll);
                    "".length();
                    if ((0xE0 ^ 0xB7 ^ (0xC6 ^ 0x94)) == 0x0) {
                        return;
                    }
                    break;
                }
                else if (lIIIIIIlIIllIlII((llllllllllllIlllllIllIlIIIIlIllI instanceof ByteBuf) ? 1 : 0)) {
                    this.pendingUnencryptedWrites.removeAndWrite();
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    final ByteBuf llllllllllllIlllllIllIlIIIIlIlIl = (ByteBuf)llllllllllllIlllllIllIlIIIIlIllI;
                    if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIIIIIllll)) {
                        llllllllllllIlllllIllIlIIIIIllll = this.allocateOutNetBuf(llllllllllllIlllllIllIlIIIIIllII, llllllllllllIlllllIllIlIIIIlIlIl.readableBytes());
                    }
                    final SSLEngineResult llllllllllllIlllllIllIlIIIIlIlII = this.wrap(this.engine, llllllllllllIlllllIllIlIIIIlIlIl, llllllllllllIlllllIllIlIIIIIllll);
                    if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIlIIIIlIlIl.isReadable() ? 1 : 0)) {
                        llllllllllllIlllllIllIlIIIIIlllI = this.pendingUnencryptedWrites.remove();
                        "".length();
                        if ((" ".length() ^ (0x9 ^ 0xC)) != (8 + 1 + 77 + 89 ^ 98 + 101 - 91 + 63)) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIlllllIllIlIIIIIlllI = null;
                    }
                    if (lIIIIIIlIIlllIIl(llllllllllllIlllllIllIlIIIIlIlII.getStatus(), SSLEngineResult.Status.CLOSED)) {
                        this.pendingUnencryptedWrites.removeAndFailAll(SslHandler.SSLENGINE_CLOSED);
                        return;
                    }
                    switch (SslHandler$8.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[llllllllllllIlllllIllIlIIIIlIlII.getHandshakeStatus().ordinal()]) {
                        case 1: {
                            this.runDelegatedTasks();
                            "".length();
                            if (((0x33 ^ 0x7D ^ (0x6E ^ 0x26)) & (0x63 ^ 0x1A ^ 85 + 20 - 41 + 63 ^ -" ".length())) != ((101 + 36 - 17 + 31 ^ 87 + 96 - 77 + 92) & (0x9B ^ 0xBE ^ (0xE4 ^ 0x90) ^ -" ".length()))) {
                                return;
                            }
                            break;
                        }
                        case 2: {
                            this.setHandshakeSuccess();
                        }
                        case 3: {
                            this.setHandshakeSuccessIfStillHandshaking();
                            "".length();
                        }
                        case 4: {
                            this.finishWrap(llllllllllllIlllllIllIlIIIIIllII, llllllllllllIlllllIllIlIIIIIllll, llllllllllllIlllllIllIlIIIIIlllI, llllllllllllIlllllIllIlIIIIIlIll);
                            llllllllllllIlllllIllIlIIIIIlllI = null;
                            llllllllllllIlllllIllIlIIIIIllll = null;
                            "".length();
                            if (-(15 + 75 + 59 + 15 ^ 91 + 49 - 83 + 103) > 0) {
                                return;
                            }
                            break;
                        }
                        case 5: {
                            return;
                        }
                        default: {
                            throw new IllegalStateException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[9]]).append(llllllllllllIlllllIllIlIIIIlIlII.getHandshakeStatus())));
                        }
                    }
                    "".length();
                    if (((0x15 ^ 0x66 ^ (0xE2 ^ 0xBE)) & (0xAC ^ 0x9B ^ (0xBC ^ 0xA4) ^ -" ".length())) > "   ".length()) {
                        return;
                    }
                    continue;
                }
            }
        }
        catch (SSLException llllllllllllIlllllIllIlIIIIlIIll) {
            this.setHandshakeFailure(llllllllllllIlllllIllIlIIIIlIIll);
            throw llllllllllllIlllllIllIlIIIIlIIll;
        }
        finally {
            this.finishWrap(llllllllllllIlllllIllIlIIIIIllII, llllllllllllIlllllIllIlIIIIIllll, llllllllllllIlllllIllIlIIIIIlllI, llllllllllllIlllllIllIlIIIIIlIll);
        }
    }
    
    static {
        lIIIIIIlIIllIIlI();
        lIIIIIIlIIlIllIl();
        int $assertionsDisabled2;
        if (lIIIIIIlIIllIlII(SslHandler.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = SslHandler.lIlllIIIlIlIII[1];
            "".length();
            if ((14 + 67 - 15 + 97 ^ 47 + 29 + 62 + 29) < " ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = SslHandler.lIlllIIIlIlIII[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(SslHandler.class);
        IGNORABLE_CLASS_IN_STACK = Pattern.compile(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[29]]);
        IGNORABLE_ERROR_MESSAGE = Pattern.compile(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[30]], SslHandler.lIlllIIIlIlIII[2]);
        SSLENGINE_CLOSED = new SSLException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[31]]);
        HANDSHAKE_TIMED_OUT = new SSLException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[32]]);
        CHANNEL_CLOSED = new ClosedChannelException();
        SslHandler.SSLENGINE_CLOSED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        SslHandler.HANDSHAKE_TIMED_OUT.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        SslHandler.CHANNEL_CLOSED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
    }
    
    private void runDelegatedTasks() {
        if (lIIIIIIlIIlllIIl(this.delegatedTaskExecutor, ImmediateExecutor.INSTANCE)) {
            do {
                final Runnable llllllllllllIlllllIllIIlIIIIlIlI = this.engine.getDelegatedTask();
                if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIIlIIIIlIlI)) {
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllllIllIIlIIIIlIlI.run();
                    "".length();
                }
            } while (((0x74 ^ 0x60) & ~(0x8B ^ 0x9F)) != (0x72 ^ 0x76));
            return;
        }
        final List<Runnable> llllllllllllIlllllIllIIlIIIIIlll = new ArrayList<Runnable>(SslHandler.lIlllIIIlIlIII[2]);
        do {
            final Runnable llllllllllllIlllllIllIIlIIIIlIIl = this.engine.getDelegatedTask();
            if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIIlIIIIlIIl)) {
                "".length();
                if (" ".length() <= ((0xD7 ^ 0x83) & ~(0x34 ^ 0x60))) {
                    return;
                }
                if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIIIIlll.isEmpty() ? 1 : 0)) {
                    return;
                }
                final CountDownLatch llllllllllllIlllllIllIIlIIIIIllI = new CountDownLatch(SslHandler.lIlllIIIlIlIII[1]);
                this.delegatedTaskExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final Iterator lllllllllllllIIlIllIlIIIllllllIl = llllllllllllIlllllIllIIlIIIIIlll.iterator();
                            while (llIlIllIIIlllll(lllllllllllllIIlIllIlIIIllllllIl.hasNext() ? 1 : 0)) {
                                final Runnable lllllllllllllIIlIllIlIIIlllllllI = lllllllllllllIIlIllIlIIIllllllIl.next();
                                lllllllllllllIIlIllIlIIIlllllllI.run();
                                "".length();
                                if ("  ".length() != "  ".length()) {
                                    return;
                                }
                            }
                            llllllllllllIlllllIllIIlIIIIIllI.countDown();
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        catch (Exception lllllllllllllIIlIllIlIIIllllllII) {
                            SslHandler.this.ctx.fireExceptionCaught(lllllllllllllIIlIllIlIIIllllllII);
                            "".length();
                            llllllllllllIlllllIllIIlIIIIIllI.countDown();
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                        finally {
                            llllllllllllIlllllIllIIlIIIIIllI.countDown();
                        }
                    }
                    
                    private static boolean llIlIllIIIlllll(final int lllllllllllllIIlIllIlIIIllllIlIl) {
                        return lllllllllllllIIlIllIlIIIllllIlIl != 0;
                    }
                });
                boolean llllllllllllIlllllIllIIlIIIIIlIl = SslHandler.lIlllIIIlIlIII[0] != 0;
                while (lIIIIIIlIIlllIII(lIIIIIIlIlIIIllI(llllllllllllIlllllIllIIlIIIIIllI.getCount(), 0L))) {
                    try {
                        llllllllllllIlllllIllIIlIIIIIllI.await();
                        "".length();
                        if (-" ".length() < -" ".length()) {
                            return;
                        }
                        continue;
                    }
                    catch (InterruptedException llllllllllllIlllllIllIIlIIIIlIII) {
                        llllllllllllIlllllIllIIlIIIIIlIl = (SslHandler.lIlllIIIlIlIII[1] != 0);
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            return;
                        }
                        continue;
                    }
                    break;
                }
                if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIIIIlIl ? 1 : 0)) {
                    Thread.currentThread().interrupt();
                }
            }
            else {
                llllllllllllIlllllIllIIlIIIIIlll.add(llllllllllllIlllllIllIIlIIIIlIIl);
                "".length();
                "".length();
            }
        } while (((0x38 ^ 0x51 ^ (0xCA ^ 0x89)) & (8 + 67 - 23 + 105 ^ 59 + 92 - 101 + 133 ^ -" ".length())) <= ((0x23 ^ 0x1A ^ (0x49 ^ 0x20)) & (0xC6 ^ 0xBD ^ (0x90 ^ 0xBB) ^ -" ".length())));
    }
    
    private static boolean lIIIIIIlIlIIIIII(final int llllllllllllIlllllIllIIIIIIlIllI, final int llllllllllllIlllllIllIIIIIIlIlIl) {
        return llllllllllllIlllllIllIIIIIIlIllI != llllllllllllIlllllIllIIIIIIlIlIl;
    }
    
    public ChannelFuture close() {
        return this.close(this.ctx.newPromise());
    }
    
    @Override
    public void read(final ChannelHandlerContext llllllllllllIlllllIllIlIIlIIIlll) {
        llllllllllllIlllllIllIlIIlIIIlll.read();
        "".length();
    }
    
    private static boolean lIIIIIIlIIllIlII(final int llllllllllllIlllllIllIIIIIIlllll) {
        return llllllllllllIlllllIllIIIIIIlllll == 0;
    }
    
    private static boolean lIIIIIIlIIllllII(final int llllllllllllIlllllIllIIIIIIllIIl) {
        return llllllllllllIlllllIllIIIIIIllIIl > 0;
    }
    
    private static boolean lIIIIIIlIIllllll(final int llllllllllllIlllllIllIIIIIllllII, final int llllllllllllIlllllIllIIIIIlllIll) {
        return llllllllllllIlllllIllIIIIIllllII >= llllllllllllIlllllIllIIIIIlllIll;
    }
    
    @Override
    public void connect(final ChannelHandlerContext llllllllllllIlllllIllIlIlIIIlIIl, final SocketAddress llllllllllllIlllllIllIlIlIIIllIl, final SocketAddress llllllllllllIlllllIllIlIlIIIllII, final ChannelPromise llllllllllllIlllllIllIlIlIIIIlII) throws Exception {
        llllllllllllIlllllIllIlIlIIIlIIl.connect(llllllllllllIlllllIllIlIlIIIllIl, llllllllllllIlllllIllIlIlIIIllII, llllllllllllIlllllIllIlIlIIIIlII);
        "".length();
    }
    
    private static boolean lIIIIIIlIIlllIII(final int llllllllllllIlllllIllIIIIIlIIIIl) {
        return llllllllllllIlllllIllIIIIIlIIIIl != 0;
    }
    
    @Deprecated
    public SslHandler(final SSLEngine llllllllllllIlllllIllIlIllllIIll, final boolean llllllllllllIlllllIllIlIllllIllI, final Executor llllllllllllIlllllIllIlIllllIIIl) {
        this.handshakePromise = new LazyChannelPromise();
        this.sslCloseFuture = new LazyChannelPromise();
        this.handshakeTimeoutMillis = 10000L;
        this.closeNotifyTimeoutMillis = 3000L;
        if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIllllIIll)) {
            throw new NullPointerException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[0]]);
        }
        if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIllllIIIl)) {
            throw new NullPointerException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[1]]);
        }
        this.engine = llllllllllllIlllllIllIlIllllIIll;
        this.delegatedTaskExecutor = llllllllllllIlllllIllIlIllllIIIl;
        this.startTls = llllllllllllIlllllIllIlIllllIllI;
        this.maxPacketBufferSize = llllllllllllIlllllIllIlIllllIIll.getSession().getPacketBufferSize();
        this.wantsDirectBuffer = (llllllllllllIlllllIllIlIllllIIll instanceof OpenSslEngine);
        int wantsLargeOutboundNetworkBuffer;
        if (lIIIIIIlIIllIlII((llllllllllllIlllllIllIlIllllIIll instanceof OpenSslEngine) ? 1 : 0)) {
            wantsLargeOutboundNetworkBuffer = SslHandler.lIlllIIIlIlIII[1];
            "".length();
            if ((0x2C ^ 0x29) <= 0) {
                throw null;
            }
        }
        else {
            wantsLargeOutboundNetworkBuffer = SslHandler.lIlllIIIlIlIII[0];
        }
        this.wantsLargeOutboundNetworkBuffer = (wantsLargeOutboundNetworkBuffer != 0);
    }
    
    public void setHandshakeTimeout(final long llllllllllllIlllllIllIlIlllIlIIl, final TimeUnit llllllllllllIlllllIllIlIlllIlIII) {
        if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIlllIlIII)) {
            throw new NullPointerException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[2]]);
        }
        this.setHandshakeTimeoutMillis(llllllllllllIlllllIllIlIlllIlIII.toMillis(llllllllllllIlllllIllIlIlllIlIIl));
    }
    
    private SSLEngineResult wrap(final SSLEngine llllllllllllIlllllIllIIlllIlIIll, final ByteBuf llllllllllllIlllllIllIIlllIlIlll, final ByteBuf llllllllllllIlllllIllIIlllIlIllI) throws SSLException {
        ByteBuffer llllllllllllIlllllIllIIlllIlIlIl = llllllllllllIlllllIllIIlllIlIlll.nioBuffer();
        if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIlllIlIlIl.isDirect() ? 1 : 0)) {
            final ByteBuffer llllllllllllIlllllIllIIlllIlllII = ByteBuffer.allocateDirect(llllllllllllIlllllIllIIlllIlIlIl.remaining());
            llllllllllllIlllllIllIIlllIlllII.put(llllllllllllIlllllIllIIlllIlIlIl).flip();
            "".length();
            llllllllllllIlllllIllIIlllIlIlIl = llllllllllllIlllllIllIIlllIlllII;
        }
        do {
            final ByteBuffer llllllllllllIlllllIllIIlllIllIll = llllllllllllIlllllIllIIlllIlIllI.nioBuffer(llllllllllllIlllllIllIIlllIlIllI.writerIndex(), llllllllllllIlllllIllIIlllIlIllI.writableBytes());
            final SSLEngineResult llllllllllllIlllllIllIIlllIllIlI = llllllllllllIlllllIllIIlllIlIIll.wrap(llllllllllllIlllllIllIIlllIlIlIl, llllllllllllIlllllIllIIlllIllIll);
            llllllllllllIlllllIllIIlllIlIlll.skipBytes(llllllllllllIlllllIllIIlllIllIlI.bytesConsumed());
            "".length();
            llllllllllllIlllllIllIIlllIlIllI.writerIndex(llllllllllllIlllllIllIIlllIlIllI.writerIndex() + llllllllllllIlllllIllIIlllIllIlI.bytesProduced());
            "".length();
            switch (SslHandler$8.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[llllllllllllIlllllIllIIlllIllIlI.getStatus().ordinal()]) {
                case 1: {
                    llllllllllllIlllllIllIIlllIlIllI.ensureWritable(this.maxPacketBufferSize);
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    "".length();
                    continue;
                }
                default: {
                    return llllllllllllIlllllIllIIlllIllIlI;
                }
            }
        } while (((125 + 54 - 75 + 76 ^ 36 + 157 - 99 + 80) & (0xEA ^ 0xC3 ^ (0x3C ^ 0xF) ^ -" ".length())) == 0x0);
        return null;
    }
    
    private ByteBuf allocate(final ChannelHandlerContext llllllllllllIlllllIllIIIlIlIIllI, final int llllllllllllIlllllIllIIIlIlIIlIl) {
        final ByteBufAllocator llllllllllllIlllllIllIIIlIlIIlII = llllllllllllIlllllIllIIIlIlIIllI.alloc();
        if (lIIIIIIlIIlllIII(this.wantsDirectBuffer ? 1 : 0)) {
            return llllllllllllIlllllIllIIIlIlIIlII.directBuffer(llllllllllllIlllllIllIIIlIlIIlIl);
        }
        return llllllllllllIlllllIllIIIlIlIIlII.buffer(llllllllllllIlllllIllIIIlIlIIlIl);
    }
    
    @Override
    public void close(final ChannelHandlerContext llllllllllllIlllllIllIlIIlIllIII, final ChannelPromise llllllllllllIlllllIllIlIIlIlIllI) throws Exception {
        this.closeOutboundAndChannel(llllllllllllIlllllIllIlIIlIllIII, llllllllllllIlllllIllIlIIlIlIllI, (boolean)(SslHandler.lIlllIIIlIlIII[0] != 0));
    }
    
    private static int getEncryptedPacketLength(final ByteBuf llllllllllllIlllllIllIIllIIIlllI, final int llllllllllllIlllllIllIIllIIIllIl) {
        int llllllllllllIlllllIllIIllIIIllII = SslHandler.lIlllIIIlIlIII[0];
        boolean llllllllllllIlllllIllIIllIIIlIll = false;
        switch (llllllllllllIlllllIllIIllIIIlllI.getUnsignedByte(llllllllllllIlllllIllIIllIIIllIl)) {
            case 20:
            case 21:
            case 22:
            case 23: {
                llllllllllllIlllllIllIIllIIIlIll = (SslHandler.lIlllIIIlIlIII[1] != 0);
                "".length();
                if (" ".length() == -" ".length()) {
                    return (0x7B ^ 0x18) & ~(0x71 ^ 0x12);
                }
                break;
            }
            default: {
                llllllllllllIlllllIllIIllIIIlIll = (SslHandler.lIlllIIIlIlIII[0] != 0);
                break;
            }
        }
        if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIllIIIlIll ? 1 : 0)) {
            final int llllllllllllIlllllIllIIllIIlIIlI = llllllllllllIlllllIllIIllIIIlllI.getUnsignedByte(llllllllllllIlllllIllIIllIIIllIl + SslHandler.lIlllIIIlIlIII[1]);
            if (lIIIIIIlIlIIIIIl(llllllllllllIlllllIllIIllIIlIIlI, SslHandler.lIlllIIIlIlIII[3])) {
                llllllllllllIlllllIllIIllIIIllII = llllllllllllIlllllIllIIllIIIlllI.getUnsignedShort(llllllllllllIlllllIllIIllIIIllIl + SslHandler.lIlllIIIlIlIII[3]) + SslHandler.lIlllIIIlIlIII[5];
                if (lIIIIIIlIlIIIIlI(llllllllllllIlllllIllIIllIIIllII, SslHandler.lIlllIIIlIlIII[5])) {
                    llllllllllllIlllllIllIIllIIIlIll = (SslHandler.lIlllIIIlIlIII[0] != 0);
                    "".length();
                    if (" ".length() < 0) {
                        return (0x4E ^ 0x5) & ~(0xF9 ^ 0xB2);
                    }
                }
            }
            else {
                llllllllllllIlllllIllIIllIIIlIll = (SslHandler.lIlllIIIlIlIII[0] != 0);
            }
        }
        if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIllIIIlIll ? 1 : 0)) {
            boolean llllllllllllIlllllIllIIllIIlIIIl = SslHandler.lIlllIIIlIlIII[1] != 0;
            int n;
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIllIIIlllI.getUnsignedByte(llllllllllllIlllllIllIIllIIIllIl) & SslHandler.lIlllIIIlIlIII[17])) {
                n = SslHandler.lIlllIIIlIlIII[2];
                "".length();
                if (-(0xA6 ^ 0xA2) >= 0) {
                    return (0x21 ^ 0x37) & ~(0x43 ^ 0x55);
                }
            }
            else {
                n = SslHandler.lIlllIIIlIlIII[3];
            }
            final int llllllllllllIlllllIllIIllIIlIIII = n;
            final int llllllllllllIlllllIllIIllIIIllll = llllllllllllIlllllIllIIllIIIlllI.getUnsignedByte(llllllllllllIlllllIllIIllIIIllIl + llllllllllllIlllllIllIIllIIlIIII + SslHandler.lIlllIIIlIlIII[1]);
            if (!lIIIIIIlIlIIIIII(llllllllllllIlllllIllIIllIIIllll, SslHandler.lIlllIIIlIlIII[2]) || lIIIIIIlIlIIIIIl(llllllllllllIlllllIllIIllIIIllll, SslHandler.lIlllIIIlIlIII[3])) {
                if (lIIIIIIlIlIIIIIl(llllllllllllIlllllIllIIllIIlIIII, SslHandler.lIlllIIIlIlIII[2])) {
                    llllllllllllIlllllIllIIllIIIllII = (llllllllllllIlllllIllIIllIIIlllI.getShort(llllllllllllIlllllIllIIllIIIllIl) & SslHandler.lIlllIIIlIlIII[18]) + SslHandler.lIlllIIIlIlIII[2];
                    "".length();
                    if (null != null) {
                        return (0x62 ^ 0x23) & ~(0x1A ^ 0x5B);
                    }
                }
                else {
                    llllllllllllIlllllIllIIllIIIllII = (llllllllllllIlllllIllIIllIIIlllI.getShort(llllllllllllIlllllIllIIllIIIllIl) & SslHandler.lIlllIIIlIlIII[19]) + SslHandler.lIlllIIIlIlIII[3];
                }
                if (lIIIIIIlIlIIIIlI(llllllllllllIlllllIllIIllIIIllII, llllllllllllIlllllIllIIllIIlIIII)) {
                    llllllllllllIlllllIllIIllIIlIIIl = (SslHandler.lIlllIIIlIlIII[0] != 0);
                    "".length();
                    if ((0x20 ^ 0x25) <= 0) {
                        return (0x56 ^ 0x51) & ~(0x11 ^ 0x16);
                    }
                }
            }
            else {
                llllllllllllIlllllIllIIllIIlIIIl = (SslHandler.lIlllIIIlIlIII[0] != 0);
            }
            if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIllIIlIIIl ? 1 : 0)) {
                return SslHandler.lIlllIIIlIlIII[16];
            }
        }
        return llllllllllllIlllllIllIIllIIIllII;
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIlllllIllIIIllIIllll) throws Exception {
        this.ctx = llllllllllllIlllllIllIIIllIIllll;
        this.pendingUnencryptedWrites = new PendingWriteQueue(llllllllllllIlllllIllIIIllIIllll);
        if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIIllIIllll.channel().isActive() ? 1 : 0) && lIIIIIIlIIlllIII(this.engine.getUseClientMode() ? 1 : 0)) {
            this.handshake();
            "".length();
        }
    }
    
    private static int lIIIIIIlIlIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static boolean isEncrypted(final ByteBuf llllllllllllIlllllIllIIllIIllIlI) {
        if (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIllIIllIlI.readableBytes(), SslHandler.lIlllIIIlIlIII[5])) {
            throw new IllegalArgumentException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[15]]);
        }
        int n;
        if (lIIIIIIlIlIIIIII(getEncryptedPacketLength(llllllllllllIlllllIllIIllIIllIlI, llllllllllllIlllllIllIIllIIllIlI.readerIndex()), SslHandler.lIlllIIIlIlIII[16])) {
            n = SslHandler.lIlllIIIlIlIII[1];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xA7 ^ 0x89) & ~(0xE8 ^ 0xC6)) != 0x0;
            }
        }
        else {
            n = SslHandler.lIlllIIIlIlIII[0];
        }
        return n != 0;
    }
    
    public SslHandler(final SSLEngine llllllllllllIlllllIllIllIIIIllll) {
        this(llllllllllllIlllllIllIllIIIIllll, (boolean)(SslHandler.lIlllIIIlIlIII[0] != 0));
    }
    
    private static boolean lIIIIIIlIIllIllI(final int llllllllllllIlllllIllIIIIIIlllIl) {
        return llllllllllllIlllllIllIIIIIIlllIl < 0;
    }
    
    public void setCloseNotifyTimeoutMillis(final long llllllllllllIlllllIllIlIllIIllll) {
        if (lIIIIIIlIIllIllI(lIIIIIIlIIllIlll(llllllllllllIlllllIllIlIllIIllll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[6]]).append(llllllllllllIlllllIllIlIllIIllll).append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[7]])));
        }
        this.closeNotifyTimeoutMillis = llllllllllllIlllllIllIlIllIIllll;
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIlllllIllIlIIIlllIll, final Object llllllllllllIlllllIllIlIIIlllIIl, final ChannelPromise llllllllllllIlllllIllIlIIIllIIlI) throws Exception {
        this.pendingUnencryptedWrites.add(llllllllllllIlllllIllIlIIIlllIIl, llllllllllllIlllllIllIlIIIllIIlI);
    }
    
    private static SSLEngineResult unwrap(final SSLEngine llllllllllllIlllllIllIIlIIIlIllI, final ByteBuffer llllllllllllIlllllIllIIlIIIlIlIl, final ByteBuf llllllllllllIlllllIllIIlIIIllIII) throws SSLException {
        int llllllllllllIlllllIllIIlIIIlIlll = SslHandler.lIlllIIIlIlIII[0];
        do {
            final ByteBuffer llllllllllllIlllllIllIIlIIIlllII = llllllllllllIlllllIllIIlIIIllIII.nioBuffer(llllllllllllIlllllIllIIlIIIllIII.writerIndex(), llllllllllllIlllllIllIIlIIIllIII.writableBytes());
            final SSLEngineResult llllllllllllIlllllIllIIlIIIllIll = llllllllllllIlllllIllIIlIIIlIllI.unwrap(llllllllllllIlllllIllIIlIIIlIlIl, llllllllllllIlllllIllIIlIIIlllII);
            llllllllllllIlllllIllIIlIIIllIII.writerIndex(llllllllllllIlllllIllIIlIIIllIII.writerIndex() + llllllllllllIlllllIllIIlIIIllIll.bytesProduced());
            "".length();
            switch (SslHandler$8.$SwitchMap$javax$net$ssl$SSLEngineResult$Status[llllllllllllIlllllIllIIlIIIllIll.getStatus().ordinal()]) {
                case 1: {
                    final int llllllllllllIlllllIllIIlIIIlllIl = llllllllllllIlllllIllIIlIIIlIllI.getSession().getApplicationBufferSize();
                    switch (llllllllllllIlllllIllIIlIIIlIlll++) {
                        case 0: {
                            llllllllllllIlllllIllIIlIIIllIII.ensureWritable(Math.min(llllllllllllIlllllIllIIlIIIlllIl, llllllllllllIlllllIllIIlIIIlIlIl.remaining()));
                            "".length();
                            "".length();
                            if ("   ".length() == 0) {
                                return null;
                            }
                            break;
                        }
                        default: {
                            llllllllllllIlllllIllIIlIIIllIII.ensureWritable(llllllllllllIlllllIllIIlIIIlllIl);
                            "".length();
                            "".length();
                            if (" ".length() == -" ".length()) {
                                return null;
                            }
                            break;
                        }
                    }
                    "".length();
                    continue;
                }
                default: {
                    return llllllllllllIlllllIllIIlIIIllIll;
                }
            }
        } while (" ".length() != "   ".length());
        return null;
    }
    
    public void handlerRemoved0(final ChannelHandlerContext llllllllllllIlllllIllIlIlIllIIll) throws Exception {
        if (lIIIIIIlIIllIlII(this.pendingUnencryptedWrites.isEmpty() ? 1 : 0)) {
            this.pendingUnencryptedWrites.removeAndFailAll(new ChannelException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[8]]));
        }
    }
    
    public long getHandshakeTimeoutMillis() {
        return this.handshakeTimeoutMillis;
    }
    
    private Future<Channel> handshake() {
        ScheduledFuture<?> llllllllllllIlllllIllIIIllIIlIII = null;
        if (lIIIIIIlIIllllII(lIIIIIIlIlIIIlll(this.handshakeTimeoutMillis, 0L))) {
            final ScheduledFuture<?> llllllllllllIlllllIllIIIllIIlIll = this.ctx.executor().schedule((Runnable)new Runnable() {
                @Override
                public void run() {
                    if (lIllIIllIIllIIl(SslHandler.this.handshakePromise.isDone() ? 1 : 0)) {
                        return;
                    }
                    SslHandler.this.notifyHandshakeFailure(SslHandler.HANDSHAKE_TIMED_OUT);
                }
                
                private static boolean lIllIIllIIllIIl(final int lllllllllllllIlIlIIIlllllIlIlIIl) {
                    return lllllllllllllIlIlIIIlllllIlIlIIl != 0;
                }
            }, this.handshakeTimeoutMillis, TimeUnit.MILLISECONDS);
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIllIIIllIIlIII = null;
        }
        this.handshakePromise.addListener(new GenericFutureListener<Future<Channel>>() {
            private static final /* synthetic */ int[] lIlIlIIlIIIlII;
            
            static {
                lllIllIIIIIIlIl();
            }
            
            @Override
            public void operationComplete(final Future<Channel> lllllllllllllIIIlIlIIlIIlIlIIllI) throws Exception {
                if (lllIllIIIIIIllI(llllllllllllIlllllIllIIIllIIlIII)) {
                    llllllllllllIlllllIllIIIllIIlIII.cancel((boolean)(SslHandler$4.lIlIlIIlIIIlII[0] != 0));
                    "".length();
                }
            }
            
            private static boolean lllIllIIIIIIllI(final Object lllllllllllllIIIlIlIIlIIlIlIIIll) {
                return lllllllllllllIIIlIlIIlIIlIlIIIll != null;
            }
            
            private static void lllIllIIIIIIlIl() {
                (lIlIlIIlIIIlII = new int[1])[0] = ((137 + 6 + 1 + 28 ^ 84 + 157 - 179 + 125) & (56 + 15 + 70 + 10 ^ 34 + 121 - 148 + 121 ^ -" ".length()));
            }
        });
        "".length();
        try {
            this.engine.beginHandshake();
            this.wrapNonAppData(this.ctx, (boolean)(SslHandler.lIlllIIIlIlIII[0] != 0));
            this.ctx.flush();
            "".length();
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (Exception llllllllllllIlllllIllIIIllIIlIlI) {
            this.notifyHandshakeFailure(llllllllllllIlllllIllIIIllIIlIlI);
        }
        return this.handshakePromise;
    }
    
    private static String lIIIIIIlIIlIIllI(final String llllllllllllIlllllIllIIIIllIlIll, final String llllllllllllIlllllIllIIIIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIIIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), SslHandler.lIlllIIIlIlIII[8]), "DES");
            final Cipher llllllllllllIlllllIllIIIIllIllll = Cipher.getInstance("DES");
            llllllllllllIlllllIllIIIIllIllll.init(SslHandler.lIlllIIIlIlIII[2], llllllllllllIlllllIllIIIIlllIIII);
            return new String(llllllllllllIlllllIllIIIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIIIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIIIIllIlllI) {
            llllllllllllIlllllIllIIIIllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIlIlIIIIll(final int llllllllllllIlllllIllIIIIIIllIll) {
        return llllllllllllIlllllIllIIIIIIllIll <= 0;
    }
    
    private void notifyHandshakeFailure(final Throwable llllllllllllIlllllIllIIIlllIIlII) {
        if (lIIIIIIlIIlllIII(this.handshakePromise.tryFailure(llllllllllllIlllllIllIIIlllIIlII) ? 1 : 0)) {
            this.ctx.fireUserEventTriggered(new SslHandshakeCompletionEvent(llllllllllllIlllllIllIIIlllIIlII));
            "".length();
            this.ctx.close();
            "".length();
        }
    }
    
    private static String lIIIIIIlIIlIlIII(final String llllllllllllIlllllIllIIIIllIIIII, final String llllllllllllIlllllIllIIIIlIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIIIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIllIIIIllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIllIIIIllIIIlI.init(SslHandler.lIlllIIIlIlIII[2], llllllllllllIlllllIllIIIIllIIIll);
            return new String(llllllllllllIlllllIllIIIIllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIIIIllIIIIl) {
            llllllllllllIlllllIllIIIIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlllllIllIIlllIIlIlI) throws Exception {
        this.setHandshakeFailure(SslHandler.CHANNEL_CLOSED);
        super.channelInactive(llllllllllllIlllllIllIIlllIIlIlI);
    }
    
    private void unwrap(final ChannelHandlerContext llllllllllllIlllllIllIIlIIlllIll, ByteBuffer llllllllllllIlllllIllIIlIIllIIIl, final int llllllllllllIlllllIllIIlIIlllIIl) throws SSLException {
        final int llllllllllllIlllllIllIIlIIllIllI = llllllllllllIlllllIllIIlIIllIIIl.position();
        ByteBuffer llllllllllllIlllllIllIIlIIlllIII;
        ByteBuf llllllllllllIlllllIllIIlIIllIlll;
        if (lIIIIIIlIIlllIII(this.wantsInboundHeapBuffer ? 1 : 0) && lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIllIIIl.isDirect() ? 1 : 0)) {
            final ByteBuf llllllllllllIlllllIllIIlIlIIIIll = llllllllllllIlllllIllIIlIIlllIll.alloc().heapBuffer(llllllllllllIlllllIllIIlIIllIIIl.limit() - llllllllllllIlllllIllIIlIIllIllI);
            llllllllllllIlllllIllIIlIlIIIIll.writeBytes(llllllllllllIlllllIllIIlIIllIIIl);
            "".length();
            final ByteBuffer llllllllllllIlllllIllIIlIlIIIlII = llllllllllllIlllllIllIIlIIllIIIl;
            llllllllllllIlllllIllIIlIIllIIIl = llllllllllllIlllllIllIIlIlIIIIll.nioBuffer();
            "".length();
            if ((0xD3 ^ 0xBA ^ (0x5B ^ 0x36)) < -" ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllllIllIIlIIlllIII = null;
            llllllllllllIlllllIllIIlIIllIlll = null;
        }
        boolean llllllllllllIlllllIllIIlIIllIlIl = SslHandler.lIlllIIIlIlIII[0] != 0;
        final ByteBuf llllllllllllIlllllIllIIlIIllIlII = this.allocate(llllllllllllIlllllIllIIlIIlllIll, llllllllllllIlllllIllIIlIIlllIIl);
        try {
            while (true) {
                final SSLEngineResult llllllllllllIlllllIllIIlIlIIIIlI = unwrap(this.engine, llllllllllllIlllllIllIIlIIllIIIl, llllllllllllIlllllIllIIlIIllIlII);
                final SSLEngineResult.Status llllllllllllIlllllIllIIlIlIIIIIl = llllllllllllIlllllIllIIlIlIIIIlI.getStatus();
                final SSLEngineResult.HandshakeStatus llllllllllllIlllllIllIIlIlIIIIII = llllllllllllIlllllIllIIlIlIIIIlI.getHandshakeStatus();
                final int llllllllllllIlllllIllIIlIIllllll = llllllllllllIlllllIllIIlIlIIIIlI.bytesProduced();
                final int llllllllllllIlllllIllIIlIIlllllI = llllllllllllIlllllIllIIlIlIIIIlI.bytesConsumed();
                if (lIIIIIIlIIlllIIl(llllllllllllIlllllIllIIlIlIIIIIl, SSLEngineResult.Status.CLOSED)) {
                    this.sslCloseFuture.trySuccess(llllllllllllIlllllIllIIlIIlllIll.channel());
                    "".length();
                    "".length();
                    if (" ".length() > " ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    switch (SslHandler$8.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[llllllllllllIlllllIllIIlIlIIIIII.ordinal()]) {
                        case 5: {
                            "".length();
                            if ("   ".length() == " ".length()) {
                                return;
                            }
                            break;
                        }
                        case 4: {
                            this.wrapNonAppData(llllllllllllIlllllIllIIlIIlllIll, (boolean)(SslHandler.lIlllIIIlIlIII[1] != 0));
                            "".length();
                            if (" ".length() < ((0x69 ^ 0x62) & ~(0x94 ^ 0x9F))) {
                                return;
                            }
                            break;
                        }
                        case 1: {
                            this.runDelegatedTasks();
                            "".length();
                            if (" ".length() == 0) {
                                return;
                            }
                            break;
                        }
                        case 2: {
                            this.setHandshakeSuccess();
                            llllllllllllIlllllIllIIlIIllIlIl = (SslHandler.lIlllIIIlIlIII[1] != 0);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            continue;
                        }
                        case 3: {
                            if (lIIIIIIlIIlllIII(this.setHandshakeSuccessIfStillHandshaking() ? 1 : 0)) {
                                llllllllllllIlllllIllIIlIIllIlIl = (SslHandler.lIlllIIIlIlIII[1] != 0);
                                "".length();
                                if ("   ".length() > (48 + 79 + 17 + 26 ^ 46 + 145 - 90 + 73)) {
                                    return;
                                }
                                continue;
                            }
                            else {
                                if (!lIIIIIIlIIlllIII(this.flushedBeforeHandshakeDone ? 1 : 0)) {
                                    break;
                                }
                                this.flushedBeforeHandshakeDone = (SslHandler.lIlllIIIlIlIII[0] != 0);
                                llllllllllllIlllllIllIIlIIllIlIl = (SslHandler.lIlllIIIlIlIII[1] != 0);
                                "".length();
                                if (((0x83 ^ 0xBD) & ~(0x91 ^ 0xAF)) > (0x2 ^ 0x6)) {
                                    return;
                                }
                                break;
                            }
                            break;
                        }
                        default: {
                            throw new IllegalStateException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[22]]).append(llllllllllllIlllllIllIIlIlIIIIII)));
                        }
                    }
                    if (!lIIIIIIlIlIIIlIl(llllllllllllIlllllIllIIlIlIIIIIl, SSLEngineResult.Status.BUFFER_UNDERFLOW)) {
                        break;
                    }
                    if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIlIIlllllI) && lIIIIIIlIIllIlII(llllllllllllIlllllIllIIlIIllllll)) {
                        "".length();
                        if (" ".length() >= (0x27 ^ 0x23)) {
                            return;
                        }
                        break;
                    }
                    else {
                        "".length();
                        if (-" ".length() > -" ".length()) {
                            return;
                        }
                        continue;
                    }
                }
            }
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIllIlIl ? 1 : 0)) {
                this.wrap(llllllllllllIlllllIllIIlIIlllIll, (boolean)(SslHandler.lIlllIIIlIlIII[1] != 0));
            }
            if (lIIIIIIlIIlllIll(llllllllllllIlllllIllIIlIIllIlll)) {
                llllllllllllIlllllIllIIlIIlllIII.position(llllllllllllIlllllIllIIlIIllIllI + llllllllllllIlllllIllIIlIIllIIIl.position());
                "".length();
                llllllllllllIlllllIllIIlIIllIlll.release();
                "".length();
            }
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIllIlII.isReadable() ? 1 : 0)) {
                llllllllllllIlllllIllIIlIIlllIll.fireChannelRead(llllllllllllIlllllIllIIlIIllIlII);
                "".length();
                "".length();
                if ((0xA4 ^ 0xA0) < 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIllIIlIIllIlII.release();
                "".length();
                "".length();
                if ("  ".length() == ((0x91 ^ 0x9B) & ~(0x85 ^ 0x8F))) {
                    return;
                }
            }
        }
        catch (SSLException llllllllllllIlllllIllIIlIIllllIl) {
            this.setHandshakeFailure(llllllllllllIlllllIllIIlIIllllIl);
            throw llllllllllllIlllllIllIIlIIllllIl;
        }
        finally {
            if (lIIIIIIlIIlllIll(llllllllllllIlllllIllIIlIIllIlll)) {
                llllllllllllIlllllIllIIlIIlllIII.position(llllllllllllIlllllIllIIlIIllIllI + llllllllllllIlllllIllIIlIIllIIIl.position());
                "".length();
                llllllllllllIlllllIllIIlIIllIlll.release();
                "".length();
            }
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIIllIlII.isReadable() ? 1 : 0)) {
                llllllllllllIlllllIllIIlIIlllIll.fireChannelRead(llllllllllllIlllllIllIIlIIllIlII);
                "".length();
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIllIIlIIllIlII.release();
                "".length();
            }
        }
    }
    
    private void closeOutboundAndChannel(final ChannelHandlerContext llllllllllllIlllllIllIIIllIllIII, final ChannelPromise llllllllllllIlllllIllIIIllIlllII, final boolean llllllllllllIlllllIllIIIllIllIll) throws Exception {
        if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIIllIllIII.channel().isActive() ? 1 : 0)) {
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIIllIllIll ? 1 : 0)) {
                llllllllllllIlllllIllIIIllIllIII.disconnect(llllllllllllIlllllIllIIIllIlllII);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIllIIIllIllIII.close(llllllllllllIlllllIllIIIllIlllII);
                "".length();
            }
            return;
        }
        this.engine.closeOutbound();
        final ChannelPromise llllllllllllIlllllIllIIIllIllIlI = llllllllllllIlllllIllIIIllIllIII.newPromise();
        this.write(llllllllllllIlllllIllIIIllIllIII, Unpooled.EMPTY_BUFFER, llllllllllllIlllllIllIIIllIllIlI);
        this.flush(llllllllllllIlllllIllIIIllIllIII);
        this.safeClose(llllllllllllIlllllIllIIIllIllIII, llllllllllllIlllllIllIIIllIllIlI, llllllllllllIlllllIllIIIllIlllII);
    }
    
    public SslHandler(final SSLEngine llllllllllllIlllllIllIllIIIIIlll, final boolean llllllllllllIlllllIllIllIIIIIllI) {
        this(llllllllllllIlllllIllIllIIIIIlll, llllllllllllIlllllIllIllIIIIIllI, ImmediateExecutor.INSTANCE);
    }
    
    public Future<Channel> sslCloseFuture() {
        return this.sslCloseFuture;
    }
    
    private static boolean lIIIIIIlIIlllIll(final Object llllllllllllIlllllIllIIIIIlIIlIl) {
        return llllllllllllIlllllIllIIIIIlIIlIl != null;
    }
    
    @Deprecated
    public SslHandler(final SSLEngine llllllllllllIlllllIllIllIIIIIIIl, final Executor llllllllllllIlllllIllIlIllllllIl) {
        this(llllllllllllIlllllIllIllIIIIIIIl, (boolean)(SslHandler.lIlllIIIlIlIII[0] != 0), llllllllllllIlllllIllIlIllllllIl);
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIlllllIllIIlllIIIIll, final Throwable llllllllllllIlllllIllIIllIllllll) throws Exception {
        if (lIIIIIIlIIlllIII(this.ignoreException(llllllllllllIlllllIllIIllIllllll) ? 1 : 0)) {
            if (lIIIIIIlIIlllIII(SslHandler.logger.isDebugEnabled() ? 1 : 0)) {
                SslHandler.logger.debug(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[11]], llllllllllllIlllllIllIIllIllllll);
            }
            if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlllIIIIll.channel().isActive() ? 1 : 0)) {
                llllllllllllIlllllIllIIlllIIIIll.close();
                "".length();
                "".length();
                if ("  ".length() < ((0x4 ^ 0x66) & ~(0xD ^ 0x6F))) {
                    return;
                }
            }
        }
        else {
            llllllllllllIlllllIllIIlllIIIIll.fireExceptionCaught(llllllllllllIlllllIllIIllIllllll);
            "".length();
        }
    }
    
    private void finishWrap(final ChannelHandlerContext llllllllllllIlllllIllIIllllllllI, ByteBuf llllllllllllIlllllIllIIllllllIII, final ChannelPromise llllllllllllIlllllIllIIlllllllII, final boolean llllllllllllIlllllIllIIlllllIllI) {
        if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIIllllllIII)) {
            llllllllllllIlllllIllIIllllllIII = Unpooled.EMPTY_BUFFER;
            "".length();
            if (-(0xDE ^ 0xBE ^ (0xEA ^ 0x8E)) >= 0) {
                return;
            }
        }
        else if (lIIIIIIlIIllIlII(((ByteBuf)llllllllllllIlllllIllIIllllllIII).isReadable() ? 1 : 0)) {
            ((ReferenceCounted)llllllllllllIlllllIllIIllllllIII).release();
            "".length();
            llllllllllllIlllllIllIIllllllIII = Unpooled.EMPTY_BUFFER;
        }
        if (lIIIIIIlIIlllIll(llllllllllllIlllllIllIIlllllllII)) {
            llllllllllllIlllllIllIIllllllllI.write(llllllllllllIlllllIllIIllllllIII, llllllllllllIlllllIllIIlllllllII);
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            llllllllllllIlllllIllIIllllllllI.write(llllllllllllIlllllIllIIllllllIII);
            "".length();
        }
        if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlllllIllI ? 1 : 0)) {
            this.needsFlush = (SslHandler.lIlllIIIlIlIII[1] != 0);
        }
    }
    
    private boolean setHandshakeSuccessIfStillHandshaking() {
        if (lIIIIIIlIIllIlII(this.handshakePromise.isDone() ? 1 : 0)) {
            this.setHandshakeSuccess();
            return SslHandler.lIlllIIIlIlIII[1] != 0;
        }
        return SslHandler.lIlllIIIlIlIII[0] != 0;
    }
    
    private static int lIIIIIIlIlIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void deregister(final ChannelHandlerContext llllllllllllIlllllIllIlIIlllIllI, final ChannelPromise llllllllllllIlllllIllIlIIlllIlll) throws Exception {
        llllllllllllIlllllIllIlIIlllIllI.deregister(llllllllllllIlllllIllIlIIlllIlll);
        "".length();
    }
    
    private static void lIIIIIIlIIlIllIl() {
        (lIlllIIIlIIlIl = new String[SslHandler.lIlllIIIlIlIII[33]])[SslHandler.lIlllIIIlIlIII[0]] = lIIIIIIlIIlIIllI("/ATG7V7hKcU=", "gWcKx");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[1]] = lIIIIIIlIIlIIlll("ABcVCDcFBhwJBAUBEigoAREMGT8W", "drymP");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[2]] = lIIIIIIlIIlIlIII("16+w/IHadJ0=", "kHIqs");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[3]] = lIIIIIIlIIlIlIII("+43AvTl0QbrY5UeEVJtEnR+oIhXQZ9cJELAvxfowwck=", "tyvlQ");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[4]] = lIIIIIIlIIlIIllI("HrrIo4Jh4ui+ZbRFraJS56HRd6IwSUu0", "Uszpp");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[5]] = lIIIIIIlIIlIIllI("apFVjFzZwKk=", "IjuRh");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[6]] = lIIIIIIlIIlIIlll("NwspAQcaCDIbBC0zLx8HOxIyPws4Cy8BWHQ=", "TgFrb");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[7]] = lIIIIIIlIIlIIlll("bHIfNQcpOQ4oE3Z6RHBXfHM=", "LZzMw");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[8]] = lIIIIIIlIIlIlIII("7J3DOnaemGIsUKEoat/N2+OCXs8gRpaQI6i4TQ5ovGkx77U63Yc+BA==", "JzgOf");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[9]] = lIIIIIIlIIlIIllI("3AhFZpiZPYW/ZcpwfZ0D9IvYAsG5s2rK3W3HoZu6nGE=", "Flwcb");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[10]] = lIIIIIIlIIlIIlll("Ix0gCzUBHWsNOxgXOA07HRZrFi4XBz4WYFY=", "vsKeZ");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[11]] = lIIIIIIlIIlIIlll("HQIgCw8hAigJBG4UYQ8CPBgtAhA9VWYEDCAbJAQXJxovRxErBiQTQywMYRcGKwdhSEMsBy4MBiBVMQ4TK1JhAhE8GjNHFyYUNUcMLRY0FRErEWEQCycZJEcUPBw1Dg0pVSILDD0QHgkMOhwnHkMnG2EVBj0FLgkQK1U1CEM6HSRHEysQM0AQbhYtCBArKi8IFycTOA==", "NuAgc");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[12]] = lIIIIIIlIIlIIllI("YxAr33i6wz4v8JwwvMczlw==", "QkEhB");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[13]] = lIIIIIIlIIlIIlll("MwYkDA==", "AcEhF");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[14]] = lIIIIIIlIIlIIlll("OQUcZzUvBF8nLzVEAioyKkQiKjIqKRkoKDQPHQ==", "ZjqIF");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[15]] = lIIIIIIlIIlIlIII("i8aSaBNSaiu28qumkBM3E/E40KJmLzv64w7OiCJis33nUu7D6IauFgTfKkTtbH/e", "ymdPl");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[21]] = lIIIIIIlIIlIIlll("PQI5YRc9TR4SOnw5ARJWIQguLgQ3V20=", "SmMAv");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[22]] = lIIIIIIlIIlIIllI("wFKZ4Dq43jzeYwfc6R5splnrOX3uGvPgI8Zwx5vZObs=", "mRaHd");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[23]] = lIIIIIIlIIlIIlll("Oy81JSs=", "dhvht");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[24]] = lIIIIIIlIIlIIlll("RCwrAHw=", "ikhMQ");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[25]] = lIIIIIIlIIlIIlll("ZAMNHz0XAw0aPApxbA==", "DKLQy");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[26]] = lIIIIIIlIIlIlIII("dueT57RwQtfbSU/ug+H0ifMgu7mtD5eKpssXCGx8OJ8=", "vGmFw");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[27]] = lIIIIIIlIIlIIllI("/UjUM/GVYfjho9QC6bTrjAVVJ+W7wtVl+PfQLMjeT/JJMt+f5OBeW4m+TS+q3ZLg", "ytZQY");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[29]] = lIIIIIIlIIlIIllI("HV64eSNmFm3q1fGYRXBQY1nhAAaEhYz3ZKXsg3XVJTHPmuM15ZE36WL112nnuVkz", "otVyV");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[30]] = lIIIIIIlIIlIlIII("hNpI8Pb+fsGBRjF/GOiBY5V5y0wZa9HU7SV4Q9b4zXJ6ygjUK6JaMTiB7q1IoGVfJYAecPNXBDgG5Dv3MvS0YYeEqyyvXL37", "kHmtK");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[31]] = lIIIIIIlIIlIIllI("mb3R+vh/eszQPUu21r796yVE3iMX0x8YyhbWLjS2SPw=", "ydVxg");
        SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[32]] = lIIIIIIlIIlIIllI("fC+reKTwxZmAaeSpr9H/PiWyJeQ03pF/", "IrsCN");
    }
    
    @Override
    public void bind(final ChannelHandlerContext llllllllllllIlllllIllIlIlIlIIIIl, final SocketAddress llllllllllllIlllllIllIlIlIIlllll, final ChannelPromise llllllllllllIlllllIllIlIlIlIIIlI) throws Exception {
        llllllllllllIlllllIllIlIlIlIIIIl.bind(llllllllllllIlllllIllIlIlIIlllll, llllllllllllIlllllIllIlIlIlIIIlI);
        "".length();
    }
    
    @Override
    public void disconnect(final ChannelHandlerContext llllllllllllIlllllIllIlIIllIIlIl, final ChannelPromise llllllllllllIlllllIllIlIIllIlIII) throws Exception {
        this.closeOutboundAndChannel(llllllllllllIlllllIllIlIIllIIlIl, llllllllllllIlllllIllIlIIllIlIII, (boolean)(SslHandler.lIlllIIIlIlIII[1] != 0));
    }
    
    private boolean ignoreException(final Throwable llllllllllllIlllllIllIIllIlIlIII) {
        if (lIIIIIIlIIllIlII((llllllllllllIlllllIllIIllIlIlIII instanceof SSLException) ? 1 : 0) && lIIIIIIlIIlllIII((llllllllllllIlllllIllIIllIlIlIII instanceof IOException) ? 1 : 0) && lIIIIIIlIIlllIII(this.sslCloseFuture.isDone() ? 1 : 0)) {
            final String llllllllllllIlllllIllIIllIlIlIll = String.valueOf(llllllllllllIlllllIllIIllIlIlIII.getMessage()).toLowerCase();
            if (lIIIIIIlIIlllIII(SslHandler.IGNORABLE_ERROR_MESSAGE.matcher(llllllllllllIlllllIllIIllIlIlIll).matches() ? 1 : 0)) {
                return SslHandler.lIlllIIIlIlIII[1] != 0;
            }
            final StackTraceElement[] llllllllllllIlllllIllIIllIlIlllI;
            final StackTraceElement[] llllllllllllIlllllIllIIllIlIlIlI = llllllllllllIlllllIllIIllIlIlllI = llllllllllllIlllllIllIIllIlIlIII.getStackTrace();
            final int llllllllllllIlllllIllIIllIlIllIl = llllllllllllIlllllIllIIllIlIlllI.length;
            int llllllllllllIlllllIllIIllIlIllII = SslHandler.lIlllIIIlIlIII[0];
            while (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIllIlIllII, llllllllllllIlllllIllIIllIlIllIl)) {
                final StackTraceElement llllllllllllIlllllIllIIllIlIllll = llllllllllllIlllllIllIIllIlIlllI[llllllllllllIlllllIllIIllIlIllII];
                final String llllllllllllIlllllIllIIllIllIIIl = llllllllllllIlllllIllIIllIlIllll.getClassName();
                final String llllllllllllIlllllIllIIllIllIIII = llllllllllllIlllllIllIIllIlIllll.getMethodName();
                if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIllIllIIIl.startsWith(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[12]]) ? 1 : 0)) {
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x93 ^ 0x89 ^ (0x4 ^ 0x15)) & (74 + 47 - 15 + 50 ^ 97 + 124 - 218 + 148 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIIIIIlIIllIlII(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[13]].equals(llllllllllllIlllllIllIIllIllIIII) ? 1 : 0)) {
                    "".length();
                    if ((0x75 ^ 0x44 ^ (0x58 ^ 0x6C)) == 0x0) {
                        return ((0x61 ^ 0x64 ^ (0x4B ^ 0x11)) & (0x7E ^ 0x1A ^ (0x12 ^ 0x29) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    if (lIIIIIIlIIlllIII(SslHandler.IGNORABLE_CLASS_IN_STACK.matcher(llllllllllllIlllllIllIIllIllIIIl).matches() ? 1 : 0)) {
                        return SslHandler.lIlllIIIlIlIII[1] != 0;
                    }
                    try {
                        final Class<?> llllllllllllIlllllIllIIllIllIIll = PlatformDependent.getClassLoader(this.getClass()).loadClass(llllllllllllIlllllIllIIllIllIIIl);
                        if (!lIIIIIIlIIllIlII(SocketChannel.class.isAssignableFrom(llllllllllllIlllllIllIIllIllIIll) ? 1 : 0) || lIIIIIIlIIlllIII(DatagramChannel.class.isAssignableFrom(llllllllllllIlllllIllIIllIllIIll) ? 1 : 0)) {
                            return SslHandler.lIlllIIIlIlIII[1] != 0;
                        }
                        if (lIIIIIIlIIllllll(PlatformDependent.javaVersion(), SslHandler.lIlllIIIlIlIII[7]) && lIIIIIIlIIlllIII(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[14]].equals(llllllllllllIlllllIllIIllIllIIll.getSuperclass().getName()) ? 1 : 0)) {
                            return SslHandler.lIlllIIIlIlIII[1] != 0;
                        }
                        "".length();
                        if ("  ".length() == (0x65 ^ 0x61)) {
                            return ((0xE0 ^ 0xA6) & ~(0x60 ^ 0x26)) != 0x0;
                        }
                    }
                    catch (ClassNotFoundException ex) {}
                }
                ++llllllllllllIlllllIllIIllIlIllII;
                "".length();
                if (((0x28 ^ 0x6E) & ~(0x50 ^ 0x16)) < 0) {
                    return ((0x3E ^ 0x25) & ~(0x96 ^ 0x8D)) != 0x0;
                }
            }
        }
        return SslHandler.lIlllIIIlIlIII[0] != 0;
    }
    
    private void wrapNonAppData(final ChannelHandlerContext llllllllllllIlllllIllIIllllIllII, final boolean llllllllllllIlllllIllIIllllIlIll) throws SSLException {
        ByteBuf llllllllllllIlllllIllIIllllIlIlI = null;
        try {
            do {
                if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIIllllIlIlI)) {
                    llllllllllllIlllllIllIIllllIlIlI = this.allocateOutNetBuf(llllllllllllIlllllIllIIllllIllII, SslHandler.lIlllIIIlIlIII[0]);
                }
                final SSLEngineResult llllllllllllIlllllIllIIllllIllll = this.wrap(this.engine, Unpooled.EMPTY_BUFFER, llllllllllllIlllllIllIIllllIlIlI);
                if (lIIIIIIlIIllllII(llllllllllllIlllllIllIIllllIllll.bytesProduced())) {
                    llllllllllllIlllllIllIIllllIllII.write(llllllllllllIlllllIllIIllllIlIlI);
                    "".length();
                    if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIllllIlIll ? 1 : 0)) {
                        this.needsFlush = (SslHandler.lIlllIIIlIlIII[1] != 0);
                    }
                    llllllllllllIlllllIllIIllllIlIlI = null;
                }
                switch (SslHandler$8.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[llllllllllllIlllllIllIIllllIllll.getHandshakeStatus().ordinal()]) {
                    case 2: {
                        this.setHandshakeSuccess();
                        "".length();
                        if ("   ".length() < "  ".length()) {
                            return;
                        }
                        break;
                    }
                    case 1: {
                        this.runDelegatedTasks();
                        "".length();
                        if (((0xF5 ^ 0xB8 ^ (0x1A ^ 0x68)) & (44 + 163 - 107 + 66 ^ 140 + 87 - 200 + 126 ^ -" ".length())) != 0x0) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        if (!lIIIIIIlIIllIlII(llllllllllllIlllllIllIIllllIlIll ? 1 : 0)) {
                            break;
                        }
                        this.unwrapNonAppData(llllllllllllIlllllIllIIllllIllII);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        "".length();
                        if (" ".length() > (0x14 ^ 0x10)) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        this.setHandshakeSuccessIfStillHandshaking();
                        "".length();
                        if (!lIIIIIIlIIllIlII(llllllllllllIlllllIllIIllllIlIll ? 1 : 0)) {
                            break;
                        }
                        this.unwrapNonAppData(llllllllllllIlllllIllIIllllIllII);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[10]]).append(llllllllllllIlllllIllIIllllIllll.getHandshakeStatus())));
                    }
                }
                if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIllllIllll.bytesProduced())) {
                    "".length();
                    if (((0xD0 ^ 0x9B ^ (0x69 ^ 0xF)) & (61 + 143 - 161 + 131 ^ 33 + 22 + 41 + 35 ^ -" ".length())) > 0) {
                        return;
                    }
                    if (!lIIIIIIlIIlllIll(llllllllllllIlllllIllIIllllIlIlI)) {
                        return;
                    }
                    llllllllllllIlllllIllIIllllIlIlI.release();
                    "".length();
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                }
                else {
                    "".length();
                }
            } while ("   ".length() > 0);
        }
        catch (SSLException llllllllllllIlllllIllIIllllIlllI) {
            this.setHandshakeFailure(llllllllllllIlllllIllIIllllIlllI);
            throw llllllllllllIlllllIllIIllllIlllI;
        }
        finally {
            if (lIIIIIIlIIlllIll(llllllllllllIlllllIllIIllllIlIlI)) {
                llllllllllllIlllllIllIIllllIlIlI.release();
                "".length();
            }
        }
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIlllllIllIIIlIllllll) throws Exception {
        if (lIIIIIIlIIllIlII(this.startTls ? 1 : 0) && lIIIIIIlIIlllIII(this.engine.getUseClientMode() ? 1 : 0)) {
            this.handshake().addListener(new GenericFutureListener<Future<Channel>>() {
                private static final /* synthetic */ int[] llIlllIlIlIllI;
                private static final /* synthetic */ String[] llIlllIlIlIIII;
                
                private static String lIIllIIlllIIlIlI(final String llllllllllllIllIIlIIIlllIIIlllIl, final String llllllllllllIllIIlIIIlllIIIllllI) {
                    try {
                        final SecretKeySpec llllllllllllIllIIlIIIlllIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlllIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIllIIlIIIlllIIlIIIIl = Cipher.getInstance("Blowfish");
                        llllllllllllIllIIlIIIlllIIlIIIIl.init(SslHandler$5.llIlllIlIlIllI[2], llllllllllllIllIIlIIIlllIIlIIIlI);
                        return new String(llllllllllllIllIIlIIIlllIIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlllIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIllIIlIIIlllIIlIIIII) {
                        llllllllllllIllIIlIIIlllIIlIIIII.printStackTrace();
                        return null;
                    }
                }
                
                private static boolean lIIllIIlllIlllll(final int llllllllllllIllIIlIIIlllIIIllIII) {
                    return llllllllllllIllIIlIIIlllIIIllIII == 0;
                }
                
                private static void lIIllIIlllIIlIll() {
                    (llIlllIlIlIIII = new String[SslHandler$5.llIlllIlIlIllI[1]])[SslHandler$5.llIlllIlIlIllI[0]] = lIIllIIlllIIlIlI("6jg4ECVz5kK6aAbF090gQXj1RYMGF+YxMWJitOn0LN8=", "yQykU");
                }
                
                private static void lIIllIIlllIllllI() {
                    (llIlllIlIlIllI = new int[3])[0] = ((0xD5 ^ 0xC4) & ~(0x4A ^ 0x5B));
                    SslHandler$5.llIlllIlIlIllI[1] = " ".length();
                    SslHandler$5.llIlllIlIlIllI[2] = "  ".length();
                }
                
                static {
                    lIIllIIlllIllllI();
                    lIIllIIlllIIlIll();
                }
                
                @Override
                public void operationComplete(final Future<Channel> llllllllllllIllIIlIIIlllIIlIlIIl) throws Exception {
                    if (lIIllIIlllIlllll(llllllllllllIllIIlIIIlllIIlIlIIl.isSuccess() ? 1 : 0)) {
                        SslHandler.logger.debug(SslHandler$5.llIlllIlIlIIII[SslHandler$5.llIlllIlIlIllI[0]], llllllllllllIllIIlIIIlllIIlIlIIl.cause());
                        llllllllllllIlllllIllIIIlIllllll.close();
                        "".length();
                    }
                }
            });
            "".length();
        }
        llllllllllllIlllllIllIIIlIllllll.fireChannelActive();
        "".length();
    }
    
    private void unwrapNonAppData(final ChannelHandlerContext llllllllllllIlllllIllIIlIlIlIlII) throws SSLException {
        this.unwrap(llllllllllllIlllllIllIIlIlIlIlII, Unpooled.EMPTY_BUFFER.nioBuffer(), SslHandler.lIlllIIIlIlIII[0]);
    }
    
    private static int lIIIIIIlIIllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public SSLEngine engine() {
        return this.engine;
    }
    
    public long getCloseNotifyTimeoutMillis() {
        return this.closeNotifyTimeoutMillis;
    }
    
    private static int lIIIIIIlIlIIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIIIIlIIlIIlll(String llllllllllllIlllllIllIIIIlIIlIll, final String llllllllllllIlllllIllIIIIlIIlIlI) {
        llllllllllllIlllllIllIIIIlIIlIll = new String(Base64.getDecoder().decode(llllllllllllIlllllIllIIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIllIIIIlIIlllI = new StringBuilder();
        final char[] llllllllllllIlllllIllIIIIlIIllIl = llllllllllllIlllllIllIIIIlIIlIlI.toCharArray();
        int llllllllllllIlllllIllIIIIlIIllII = SslHandler.lIlllIIIlIlIII[0];
        final char llllllllllllIlllllIllIIIIlIIIllI = (Object)llllllllllllIlllllIllIIIIlIIlIll.toCharArray();
        final char llllllllllllIlllllIllIIIIlIIIlIl = (char)llllllllllllIlllllIllIIIIlIIIllI.length;
        int llllllllllllIlllllIllIIIIlIIIlII = SslHandler.lIlllIIIlIlIII[0];
        while (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIIIlIIIlII, llllllllllllIlllllIllIIIIlIIIlIl)) {
            final char llllllllllllIlllllIllIIIIlIlIIIl = llllllllllllIlllllIllIIIIlIIIllI[llllllllllllIlllllIllIIIIlIIIlII];
            llllllllllllIlllllIllIIIIlIIlllI.append((char)(llllllllllllIlllllIllIIIIlIlIIIl ^ llllllllllllIlllllIllIIIIlIIllIl[llllllllllllIlllllIllIIIIlIIllII % llllllllllllIlllllIllIIIIlIIllIl.length]));
            "".length();
            ++llllllllllllIlllllIllIIIIlIIllII;
            ++llllllllllllIlllllIllIIIIlIIIlII;
            "".length();
            if ((56 + 46 - 71 + 117 ^ 15 + 16 + 89 + 25) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIllIIIIlIIlllI);
    }
    
    private static boolean lIIIIIIlIlIIIlIl(final Object llllllllllllIlllllIllIIIIIlIllII, final Object llllllllllllIlllllIllIIIIIlIlIll) {
        return llllllllllllIlllllIllIIIIIlIllII != llllllllllllIlllllIllIIIIIlIlIll;
    }
    
    public ChannelFuture close(final ChannelPromise llllllllllllIlllllIllIlIlIllllll) {
        final ChannelHandlerContext llllllllllllIlllllIllIlIlIlllllI = this.ctx;
        llllllllllllIlllllIllIlIlIlllllI.executor().execute(new Runnable() {
            private static final /* synthetic */ String[] lIlllIIlIIlllI;
            private static final /* synthetic */ int[] lIlllIIlIIllll;
            
            static {
                lIIIIIIlllIIIlIl();
                lIIIIIIlllIIIlII();
            }
            
            private static void lIIIIIIlllIIIlII() {
                (lIlllIIlIIlllI = new String[SslHandler$1.lIlllIIlIIllll[1]])[SslHandler$1.lIlllIIlIIllll[0]] = lIIIIIIlllIIIIll("sf5SUmuKTaOQ6aOzS2Fq3X+T6YknrBEWH43H55EUzxJ3Amti4IJMCA==", "sYxau");
            }
            
            private static String lIIIIIIlllIIIIll(final String llllllllllllIlllllIlIIIlIllIIllI, final String llllllllllllIlllllIlIIIlIllIIlIl) {
                try {
                    final SecretKeySpec llllllllllllIlllllIlIIIlIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIIIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllllIlIIIlIllIlIII = Cipher.getInstance("Blowfish");
                    llllllllllllIlllllIlIIIlIllIlIII.init(SslHandler$1.lIlllIIlIIllll[2], llllllllllllIlllllIlIIIlIllIlIIl);
                    return new String(llllllllllllIlllllIlIIIlIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIIIlIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllllIlIIIlIllIIlll) {
                    llllllllllllIlllllIlIIIlIllIIlll.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIIIIlllIIIlIl() {
                (lIlllIIlIIllll = new int[3])[0] = ((0x12 ^ 0xC) & ~(0x33 ^ 0x2D));
                SslHandler$1.lIlllIIlIIllll[1] = " ".length();
                SslHandler$1.lIlllIIlIIllll[2] = "  ".length();
            }
            
            @Override
            public void run() {
                SslHandler.this.engine.closeOutbound();
                try {
                    SslHandler.this.write(llllllllllllIlllllIllIlIlIlllllI, Unpooled.EMPTY_BUFFER, llllllllllllIlllllIllIlIlIllllll);
                    SslHandler.this.flush(llllllllllllIlllllIllIlIlIlllllI);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
                catch (Exception llllllllllllIlllllIlIIIlIlllIIIl) {
                    if (lIIIIIIlllIIIllI(llllllllllllIlllllIllIlIlIllllll.tryFailure(llllllllllllIlllllIlIIIlIlllIIIl) ? 1 : 0)) {
                        SslHandler.logger.warn(SslHandler$1.lIlllIIlIIlllI[SslHandler$1.lIlllIIlIIllll[0]], llllllllllllIlllllIlIIIlIlllIIIl);
                    }
                }
            }
            
            private static boolean lIIIIIIlllIIIllI(final int llllllllllllIlllllIlIIIlIlIlllll) {
                return llllllllllllIlllllIlIIIlIlIlllll == 0;
            }
        });
        return llllllllllllIlllllIllIlIlIllllll;
    }
    
    @Override
    public void flush(final ChannelHandlerContext llllllllllllIlllllIllIlIIIlIIlll) throws Exception {
        if (lIIIIIIlIIlllIII(this.startTls ? 1 : 0) && lIIIIIIlIIllIlII(this.sentFirstMessage ? 1 : 0)) {
            this.sentFirstMessage = (SslHandler.lIlllIIIlIlIII[1] != 0);
            this.pendingUnencryptedWrites.removeAndWriteAll();
            "".length();
            llllllllllllIlllllIllIlIIIlIIlll.flush();
            "".length();
            return;
        }
        if (lIIIIIIlIIlllIII(this.pendingUnencryptedWrites.isEmpty() ? 1 : 0)) {
            this.pendingUnencryptedWrites.add(Unpooled.EMPTY_BUFFER, llllllllllllIlllllIllIlIIIlIIlll.voidPromise());
        }
        if (lIIIIIIlIIllIlII(this.handshakePromise.isDone() ? 1 : 0)) {
            this.flushedBeforeHandshakeDone = (SslHandler.lIlllIIIlIlIII[1] != 0);
        }
        this.wrap(llllllllllllIlllllIllIlIIIlIIlll, (boolean)(SslHandler.lIlllIIIlIlIII[0] != 0));
        llllllllllllIlllllIllIlIIIlIIlll.flush();
        "".length();
    }
    
    private void safeClose(final ChannelHandlerContext llllllllllllIlllllIllIIIlIllIIlI, final ChannelFuture llllllllllllIlllllIllIIIlIllIIIl, final ChannelPromise llllllllllllIlllllIllIIIlIllIIII) {
        if (lIIIIIIlIIllIlII(llllllllllllIlllllIllIIIlIllIIlI.channel().isActive() ? 1 : 0)) {
            llllllllllllIlllllIllIIIlIllIIlI.close(llllllllllllIlllllIllIIIlIllIIII);
            "".length();
            return;
        }
        ScheduledFuture<?> llllllllllllIlllllIllIIIlIllIlII = null;
        if (lIIIIIIlIIllllII(lIIIIIIlIlIIlIII(this.closeNotifyTimeoutMillis, 0L))) {
            final ScheduledFuture<?> llllllllllllIlllllIllIIIlIlllIIl = llllllllllllIlllllIllIIIlIllIIlI.executor().schedule((Runnable)new Runnable() {
                private static final /* synthetic */ String[] llIIIIIIIlIIlI;
                private static final /* synthetic */ int[] llIIIIIIIlIIll;
                
                private static void lIIIIllIlIIllIlI() {
                    (llIIIIIIIlIIll = new int[4])[0] = ((0x3D ^ 0x6F ^ (0xEC ^ 0x99)) & (0xCB ^ 0x93 ^ 48 + 36 - 74 + 117 ^ -" ".length()));
                    SslHandler$6.llIIIIIIIlIIll[1] = " ".length();
                    SslHandler$6.llIIIIIIIlIIll[2] = "  ".length();
                    SslHandler$6.llIIIIIIIlIIll[3] = (0x22 ^ 0x2A);
                }
                
                private static boolean lIIIIllIlIIllIll(final int llllllllllllIllllIIIIlIlIlIIIlIl, final int llllllllllllIllllIIIIlIlIlIIIlII) {
                    return llllllllllllIllllIIIIlIlIlIIIlIl < llllllllllllIllllIIIIlIlIlIIIlII;
                }
                
                private static String lIIIIllIlIIllIII(String llllllllllllIllllIIIIlIlIlIlllIl, final String llllllllllllIllllIIIIlIlIllIIIIl) {
                    llllllllllllIllllIIIIlIlIlIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllllIIIIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIllllIIIIlIlIllIIIII = new StringBuilder();
                    final char[] llllllllllllIllllIIIIlIlIlIlllll = llllllllllllIllllIIIIlIlIllIIIIl.toCharArray();
                    int llllllllllllIllllIIIIlIlIlIllllI = SslHandler$6.llIIIIIIIlIIll[0];
                    final boolean llllllllllllIllllIIIIlIlIlIllIII = (Object)llllllllllllIllllIIIIlIlIlIlllIl.toCharArray();
                    final boolean llllllllllllIllllIIIIlIlIlIlIlll = llllllllllllIllllIIIIlIlIlIllIII.length != 0;
                    short llllllllllllIllllIIIIlIlIlIlIllI = (short)SslHandler$6.llIIIIIIIlIIll[0];
                    while (lIIIIllIlIIllIll(llllllllllllIllllIIIIlIlIlIlIllI, llllllllllllIllllIIIIlIlIlIlIlll ? 1 : 0)) {
                        final char llllllllllllIllllIIIIlIlIllIIIll = llllllllllllIllllIIIIlIlIlIllIII[llllllllllllIllllIIIIlIlIlIlIllI];
                        llllllllllllIllllIIIIlIlIllIIIII.append((char)(llllllllllllIllllIIIIlIlIllIIIll ^ llllllllllllIllllIIIIlIlIlIlllll[llllllllllllIllllIIIIlIlIlIllllI % llllllllllllIllllIIIIlIlIlIlllll.length]));
                        "".length();
                        ++llllllllllllIllllIIIIlIlIlIllllI;
                        ++llllllllllllIllllIIIIlIlIlIlIllI;
                        "".length();
                        if (((0xF8 ^ 0xBD) & ~(0x71 ^ 0x34)) != 0x0) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIllllIIIIlIlIllIIIII);
                }
                
                @Override
                public void run() {
                    SslHandler.logger.warn(String.valueOf(new StringBuilder().append(llllllllllllIlllllIllIIIlIllIIlI.channel()).append(SslHandler$6.llIIIIIIIlIIlI[SslHandler$6.llIIIIIIIlIIll[0]]).append(SslHandler$6.llIIIIIIIlIIlI[SslHandler$6.llIIIIIIIlIIll[1]])));
                    llllllllllllIlllllIllIIIlIllIIlI.close(llllllllllllIlllllIllIIIlIllIIII);
                    "".length();
                }
                
                private static void lIIIIllIlIIllIIl() {
                    (llIIIIIIIlIIlI = new String[SslHandler$6.llIIIIIIIlIIll[2]])[SslHandler$6.llIIIIIIIlIIll[0]] = lIIIIllIlIIlIlll("+Abp/69BQUun5F4D8iLxK89sG4clgKz++GQtXj2xTbI=", "eNvfR");
                    SslHandler$6.llIIIIIIIlIIlI[SslHandler$6.llIIIIIIIlIIll[1]] = lIIIIllIlIIllIII("dQ4kEQswZSgPByYhJQRIISAuQws6JiUGCyEhJA1G", "UHKch");
                }
                
                static {
                    lIIIIllIlIIllIlI();
                    lIIIIllIlIIllIIl();
                }
                
                private static String lIIIIllIlIIlIlll(final String llllllllllllIllllIIIIlIlIlIIlIll, final String llllllllllllIllllIIIIlIlIlIIlIlI) {
                    try {
                        final SecretKeySpec llllllllllllIllllIIIIlIlIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), SslHandler$6.llIIIIIIIlIIll[3]), "DES");
                        final Cipher llllllllllllIllllIIIIlIlIlIIllll = Cipher.getInstance("DES");
                        llllllllllllIllllIIIIlIlIlIIllll.init(SslHandler$6.llIIIIIIIlIIll[2], llllllllllllIllllIIIIlIlIlIlIIII);
                        return new String(llllllllllllIllllIIIIlIlIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIllllIIIIlIlIlIIlllI) {
                        llllllllllllIllllIIIIlIlIlIIlllI.printStackTrace();
                        return null;
                    }
                }
            }, this.closeNotifyTimeoutMillis, TimeUnit.MILLISECONDS);
            "".length();
            if (((0x92 ^ 0xA4 ^ (0x60 ^ 0x7E)) & (0xFA ^ 0x8A ^ (0xDD ^ 0x85) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            llllllllllllIlllllIllIIIlIllIlII = null;
        }
        llllllllllllIlllllIllIIIlIllIIIl.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            private static final /* synthetic */ int[] llIlIlIIIIllII;
            
            @Override
            public void operationComplete(final ChannelFuture llllllllllllIllIlIllIIIIllllllll) throws Exception {
                if (lIIlIIlllIIIllIl(llllllllllllIlllllIllIIIlIllIlII)) {
                    llllllllllllIlllllIllIIIlIllIlII.cancel((boolean)(SslHandler$7.llIlIlIIIIllII[0] != 0));
                    "".length();
                }
                llllllllllllIlllllIllIIIlIllIIlI.close(llllllllllllIlllllIllIIIlIllIIII);
                "".length();
            }
            
            private static boolean lIIlIIlllIIIllIl(final Object llllllllllllIllIlIllIIIIllllIllI) {
                return llllllllllllIllIlIllIIIIllllIllI != null;
            }
            
            private static void lIIlIIlllIIIllII() {
                (llIlIlIIIIllII = new int[1])[0] = ((0x2F ^ 0x73 ^ (0x58 ^ 0x30)) & (0x87 ^ 0xB8 ^ (0x43 ^ 0x48) ^ -" ".length()));
            }
            
            static {
                lIIlIIlllIIIllII();
            }
        });
        "".length();
    }
    
    private static boolean lIIIIIIlIIlllIIl(final Object llllllllllllIlllllIllIIIIIlIlIII, final Object llllllllllllIlllllIllIIIIIlIIlll) {
        return llllllllllllIlllllIllIIIIIlIlIII == llllllllllllIlllllIllIIIIIlIIlll;
    }
    
    private static boolean lIIIIIIlIlIIIIIl(final int llllllllllllIlllllIllIIIIlIIIIII, final int llllllllllllIlllllIllIIIIIllllll) {
        return llllllllllllIlllllIllIIIIlIIIIII == llllllllllllIlllllIllIIIIIllllll;
    }
    
    public Future<Channel> handshakeFuture() {
        return this.handshakePromise;
    }
    
    private static void lIIIIIIlIIllIIlI() {
        (lIlllIIIlIlIII = new int[34])[0] = ((0xCF ^ 0xB7 ^ (0xD9 ^ 0x97)) & (0x7E ^ 0x14 ^ (0xD1 ^ 0x8D) ^ -" ".length()));
        SslHandler.lIlllIIIlIlIII[1] = " ".length();
        SslHandler.lIlllIIIlIlIII[2] = "  ".length();
        SslHandler.lIlllIIIlIlIII[3] = "   ".length();
        SslHandler.lIlllIIIlIlIII[4] = (3 + 10 + 98 + 23 ^ 14 + 59 - 0 + 57);
        SslHandler.lIlllIIIlIlIII[5] = (0x63 ^ 0x65 ^ "   ".length());
        SslHandler.lIlllIIIlIlIII[6] = (0 + 56 + 97 + 25 ^ 145 + 165 - 272 + 142);
        SslHandler.lIlllIIIlIlIII[7] = (110 + 60 - 37 + 60 ^ 78 + 64 - 129 + 185);
        SslHandler.lIlllIIIlIlIII[8] = (0xCD ^ 0xC5);
        SslHandler.lIlllIIIlIlIII[9] = (117 + 84 - 95 + 61 ^ 111 + 86 - 143 + 120);
        SslHandler.lIlllIIIlIlIII[10] = (0x48 ^ 0x4E ^ (0x83 ^ 0x8F));
        SslHandler.lIlllIIIlIlIII[11] = (0x1B ^ 0x69 ^ (0xE ^ 0x77));
        SslHandler.lIlllIIIlIlIII[12] = (0x10 ^ 0x1C);
        SslHandler.lIlllIIIlIlIII[13] = (83 + 23 - 66 + 87 ^ (0x57 ^ 0x25));
        SslHandler.lIlllIIIlIlIII[14] = (21 + 95 - 18 + 69 ^ 77 + 39 - 95 + 148);
        SslHandler.lIlllIIIlIlIII[15] = (0x64 ^ 0x6B);
        SslHandler.lIlllIIIlIlIII[16] = -" ".length();
        SslHandler.lIlllIIIlIlIII[17] = 70 + 67 - 115 + 106;
        SslHandler.lIlllIIIlIlIII[18] = (-1 & 0x7FFF);
        SslHandler.lIlllIIIlIlIII[19] = (0xFFFFBFFF & 0x7FFF);
        SslHandler.lIlllIIIlIlIII[20] = (0xFFFFCD99 & 0x7B7F);
        SslHandler.lIlllIIIlIlIII[21] = (0xB6 ^ 0xAD ^ (0x5 ^ 0xE));
        SslHandler.lIlllIIIlIlIII[22] = (0xA ^ 0x1B);
        SslHandler.lIlllIIIlIlIII[23] = (0x40 ^ 0x52);
        SslHandler.lIlllIIIlIlIII[24] = (0xA0 ^ 0xB3);
        SslHandler.lIlllIIIlIlIII[25] = (0xA4 ^ 0xB0);
        SslHandler.lIlllIIIlIlIII[26] = (0xAF ^ 0xBA);
        SslHandler.lIlllIIIlIlIII[27] = (0xA2 ^ 0xB1 ^ (0x10 ^ 0x15));
        SslHandler.lIlllIIIlIlIII[28] = (-(0xFFFFF7EF & 0x2E57) & (0xFFFFEFDF & 0x3F7F));
        SslHandler.lIlllIIIlIlIII[29] = (131 + 88 - 203 + 126 ^ 127 + 99 - 192 + 119);
        SslHandler.lIlllIIIlIlIII[30] = (0x6C ^ 0x74);
        SslHandler.lIlllIIIlIlIII[31] = (0xB9 ^ 0xA0);
        SslHandler.lIlllIIIlIlIII[32] = (0x1B ^ 0x72 ^ (0x5F ^ 0x2C));
        SslHandler.lIlllIIIlIlIII[33] = (0x64 ^ 0x1F ^ (0xEF ^ 0x8F));
    }
    
    public void setHandshakeTimeoutMillis(final long llllllllllllIlllllIllIlIllIlllll) {
        if (lIIIIIIlIIllIllI(lIIIIIIlIIllIlIl(llllllllllllIlllllIllIlIllIlllll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[3]]).append(llllllllllllIlllllIllIlIllIlllll).append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[4]])));
        }
        this.handshakeTimeoutMillis = llllllllllllIlllllIllIlIllIlllll;
    }
    
    private static boolean lIIIIIIlIlIIIlII(final int llllllllllllIlllllIllIIIIIllIIII, final int llllllllllllIlllllIllIIIIIlIllll) {
        return llllllllllllIlllllIllIIIIIllIIII > llllllllllllIlllllIllIIIIIlIllll;
    }
    
    public void setCloseNotifyTimeout(final long llllllllllllIlllllIllIlIllIlIlll, final TimeUnit llllllllllllIlllllIllIlIllIlIIll) {
        if (lIIIIIIlIIllIIll(llllllllllllIlllllIllIlIllIlIIll)) {
            throw new NullPointerException(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[5]]);
        }
        this.setCloseNotifyTimeoutMillis(llllllllllllIlllllIllIlIllIlIIll.toMillis(llllllllllllIlllllIllIlIllIlIlll));
    }
    
    private static boolean lIIIIIIlIIlllllI(final int llllllllllllIlllllIllIIIIIlllIII, final int llllllllllllIlllllIllIIIIIllIlll) {
        return llllllllllllIlllllIllIIIIIlllIII < llllllllllllIlllllIllIIIIIllIlll;
    }
    
    private void setHandshakeFailure(final Throwable llllllllllllIlllllIllIIIlllIllII) {
        this.engine.closeOutbound();
        try {
            this.engine.closeInbound();
            "".length();
            if (((0xE0 ^ 0xA8) & ~(0x16 ^ 0x5E)) > 0) {
                return;
            }
        }
        catch (SSLException llllllllllllIlllllIllIIIllllIIII) {
            final String llllllllllllIlllllIllIIIllllIIIl = llllllllllllIlllllIllIIIllllIIII.getMessage();
            if (!lIIIIIIlIIlllIll(llllllllllllIlllllIllIIIllllIIIl) || lIIIIIIlIIllIlII(llllllllllllIlllllIllIIIllllIIIl.contains(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[26]]) ? 1 : 0)) {
                SslHandler.logger.debug(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[27]], llllllllllllIlllllIllIIIllllIIII);
            }
        }
        this.notifyHandshakeFailure(llllllllllllIlllllIllIIIlllIllII);
        this.pendingUnencryptedWrites.removeAndFailAll(llllllllllllIlllllIllIIIlllIllII);
    }
    
    @Override
    public void channelReadComplete(final ChannelHandlerContext llllllllllllIlllllIllIIlIlIllIlI) throws Exception {
        if (lIIIIIIlIIlllIII(this.needsFlush ? 1 : 0)) {
            this.needsFlush = (SslHandler.lIlllIIIlIlIII[0] != 0);
            llllllllllllIlllllIllIIlIlIllIlI.flush();
            "".length();
        }
        super.channelReadComplete(llllllllllllIlllllIllIIlIlIllIlI);
    }
    
    private ByteBuf allocateOutNetBuf(final ChannelHandlerContext llllllllllllIlllllIllIIIlIIIlllI, final int llllllllllllIlllllIllIIIlIIIllII) {
        if (lIIIIIIlIIlllIII(this.wantsLargeOutboundNetworkBuffer ? 1 : 0)) {
            return this.allocate(llllllllllllIlllllIllIIIlIIIlllI, this.maxPacketBufferSize);
        }
        return this.allocate(llllllllllllIlllllIllIIIlIIIlllI, Math.min(llllllllllllIlllllIllIIIlIIIllII + SslHandler.lIlllIIIlIlIII[28], this.maxPacketBufferSize));
    }
    
    private void setHandshakeSuccess() {
        final String llllllllllllIlllllIllIIIlllllIII = String.valueOf(this.engine.getSession().getCipherSuite());
        if (lIIIIIIlIIllIlII(this.wantsDirectBuffer ? 1 : 0) && (!lIIIIIIlIIllIlII(llllllllllllIlllllIllIIIlllllIII.contains(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[23]]) ? 1 : 0) || lIIIIIIlIIlllIII(llllllllllllIlllllIllIIIlllllIII.contains(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[24]]) ? 1 : 0))) {
            this.wantsInboundHeapBuffer = (SslHandler.lIlllIIIlIlIII[1] != 0);
        }
        if (lIIIIIIlIIlllIII(this.handshakePromise.trySuccess(this.ctx.channel()) ? 1 : 0)) {
            if (lIIIIIIlIIlllIII(SslHandler.logger.isDebugEnabled() ? 1 : 0)) {
                SslHandler.logger.debug(String.valueOf(new StringBuilder().append(this.ctx.channel()).append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[25]]).append(this.engine.getSession().getCipherSuite())));
            }
            this.ctx.fireUserEventTriggered(SslHandshakeCompletionEvent.SUCCESS);
            "".length();
        }
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllllIllIIlIlllIIlI, final ByteBuf llllllllllllIlllllIllIIlIllIlIII, final List<Object> llllllllllllIlllllIllIIlIlllIIII) throws SSLException {
        final int llllllllllllIlllllIllIIlIllIllll = llllllllllllIlllllIllIIlIllIlIII.readerIndex();
        final int llllllllllllIlllllIllIIlIllIlllI = llllllllllllIlllllIllIIlIllIlIII.writerIndex();
        int llllllllllllIlllllIllIIlIllIllIl = llllllllllllIlllllIllIIlIllIllll;
        int llllllllllllIlllllIllIIlIllIllII = SslHandler.lIlllIIIlIlIII[0];
        if (lIIIIIIlIIllllII(this.packetLength)) {
            if (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIlIllIlllI - llllllllllllIlllllIllIIlIllIllll, this.packetLength)) {
                return;
            }
            llllllllllllIlllllIllIIlIllIllIl += this.packetLength;
            llllllllllllIlllllIllIIlIllIllII = this.packetLength;
            this.packetLength = SslHandler.lIlllIIIlIlIII[0];
        }
        boolean llllllllllllIlllllIllIIlIllIlIll = SslHandler.lIlllIIIlIlIII[0] != 0;
        while (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIlIllIllII, SslHandler.lIlllIIIlIlIII[20])) {
            final int llllllllllllIlllllIllIIlIllllIII = llllllllllllIlllllIllIIlIllIlllI - llllllllllllIlllllIllIIlIllIllIl;
            if (lIIIIIIlIIlllllI(llllllllllllIlllllIllIIlIllllIII, SslHandler.lIlllIIIlIlIII[5])) {
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            else {
                final int llllllllllllIlllllIllIIlIlllIlll = getEncryptedPacketLength(llllllllllllIlllllIllIIlIllIlIII, llllllllllllIlllllIllIIlIllIllIl);
                if (lIIIIIIlIlIIIIIl(llllllllllllIlllllIllIIlIlllIlll, SslHandler.lIlllIIIlIlIII[16])) {
                    llllllllllllIlllllIllIIlIllIlIll = (SslHandler.lIlllIIIlIlIII[1] != 0);
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                    break;
                }
                else {
                    if (lIIIIIIlIIllIlII(SslHandler.$assertionsDisabled ? 1 : 0) && lIIIIIIlIlIIIIll(llllllllllllIlllllIllIIlIlllIlll)) {
                        throw new AssertionError();
                    }
                    if (lIIIIIIlIlIIIlII(llllllllllllIlllllIllIIlIlllIlll, llllllllllllIlllllIllIIlIllllIII)) {
                        this.packetLength = llllllllllllIlllllIllIIlIlllIlll;
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        final int llllllllllllIlllllIllIIlIlllIllI = llllllllllllIlllllIllIIlIllIllII + llllllllllllIlllllIllIIlIlllIlll;
                        if (lIIIIIIlIlIIIlII(llllllllllllIlllllIllIIlIlllIllI, SslHandler.lIlllIIIlIlIII[20])) {
                            "".length();
                            if (" ".length() > " ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            llllllllllllIlllllIllIIlIllIllIl += llllllllllllIlllllIllIIlIlllIlll;
                            llllllllllllIlllllIllIIlIllIllII = llllllllllllIlllllIllIIlIlllIllI;
                            "".length();
                            if ("   ".length() == 0) {
                                return;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        if (lIIIIIIlIIllllII(llllllllllllIlllllIllIIlIllIllII)) {
            llllllllllllIlllllIllIIlIllIlIII.skipBytes(llllllllllllIlllllIllIIlIllIllII);
            "".length();
            final ByteBuffer llllllllllllIlllllIllIIlIlllIlIl = llllllllllllIlllllIllIIlIllIlIII.nioBuffer(llllllllllllIlllllIllIIlIllIllll, llllllllllllIlllllIllIIlIllIllII);
            this.unwrap(llllllllllllIlllllIllIIlIlllIIlI, llllllllllllIlllllIllIIlIlllIlIl, llllllllllllIlllllIllIIlIllIllII);
            if (lIIIIIIlIIllIlII(SslHandler.$assertionsDisabled ? 1 : 0) && lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIlllIlIl.hasRemaining() ? 1 : 0) && lIIIIIIlIIllIlII(this.engine.isInboundDone() ? 1 : 0)) {
                throw new AssertionError();
            }
        }
        if (lIIIIIIlIIlllIII(llllllllllllIlllllIllIIlIllIlIll ? 1 : 0)) {
            final NotSslRecordException llllllllllllIlllllIllIIlIlllIlII = new NotSslRecordException(String.valueOf(new StringBuilder().append(SslHandler.lIlllIIIlIIlIl[SslHandler.lIlllIIIlIlIII[21]]).append(ByteBufUtil.hexDump(llllllllllllIlllllIllIIlIllIlIII))));
            llllllllllllIlllllIllIIlIllIlIII.skipBytes(llllllllllllIlllllIllIIlIllIlIII.readableBytes());
            "".length();
            llllllllllllIlllllIllIIlIlllIIlI.fireExceptionCaught(llllllllllllIlllllIllIIlIlllIlII);
            "".length();
            this.setHandshakeFailure(llllllllllllIlllllIllIIlIlllIlII);
        }
    }
    
    private static int lIIIIIIlIIllIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIIIIlIIllIIll(final Object llllllllllllIlllllIllIIIIIlIIIll) {
        return llllllllllllIlllllIllIIIIIlIIIll == null;
    }
    
    private static boolean lIIIIIIlIlIIIIlI(final int llllllllllllIlllllIllIIIIIllIlII, final int llllllllllllIlllllIllIIIIIllIIll) {
        return llllllllllllIlllllIllIIIIIllIlII <= llllllllllllIlllllIllIIIIIllIIll;
    }
    
    private final class LazyChannelPromise extends DefaultPromise<Channel>
    {
        private static boolean llIIIlIlIlllllI(final Object lllllllllllllIIllllllIIlllIlIIII) {
            return lllllllllllllIIllllllIIlllIlIIII == null;
        }
        
        @Override
        protected EventExecutor executor() {
            if (llIIIlIlIlllllI(SslHandler.this.ctx)) {
                throw new IllegalStateException();
            }
            return SslHandler.this.ctx.executor();
        }
    }
}
