// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ConnectTimeoutException;
import io.netty.util.internal.OneTimeTask;
import java.net.ConnectException;
import java.util.Arrays;
import java.nio.channels.CancelledKeyException;
import io.netty.channel.ChannelException;
import java.io.IOException;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCounted;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.channel.EventLoop;
import io.netty.channel.Channel;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelPromise;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import io.netty.util.internal.logging.InternalLogger;
import java.util.concurrent.ScheduledFuture;
import io.netty.channel.AbstractChannel;

public abstract class AbstractNioChannel extends AbstractChannel
{
    private /* synthetic */ ScheduledFuture<?> connectTimeoutFuture;
    private static final /* synthetic */ InternalLogger logger;
    private volatile /* synthetic */ boolean readPending;
    private static final /* synthetic */ String[] lIlIIIlIlllIII;
    volatile /* synthetic */ SelectionKey selectionKey;
    private final /* synthetic */ SelectableChannel ch;
    private static final /* synthetic */ int[] lIlIIIlIlllIIl;
    private /* synthetic */ SocketAddress requestedRemoteAddress;
    static final /* synthetic */ boolean $assertionsDisabled;
    private /* synthetic */ ChannelPromise connectPromise;
    protected final /* synthetic */ int readInterestOp;
    private volatile /* synthetic */ boolean inputShutdown;
    
    private static boolean lllIIIllIIIIlll(final int lllllllllllllIIIllllIlllllllIIIl) {
        return lllllllllllllIIIllllIlllllllIIIl == 0;
    }
    
    @Override
    protected void doDeregister() throws Exception {
        this.eventLoop().cancel(this.selectionKey());
    }
    
    private static boolean lllIIIllIIIIllI(final int lllllllllllllIIIllllIlllllllIIll) {
        return lllllllllllllIIIllllIlllllllIIll != 0;
    }
    
    protected abstract boolean doConnect(final SocketAddress p0, final SocketAddress p1) throws Exception;
    
    private static String lllIIIllIIIIIlI(String lllllllllllllIIIlllllIIIIIIIlIIl, final String lllllllllllllIIIlllllIIIIIIIlIII) {
        lllllllllllllIIIlllllIIIIIIIlIIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllllIIIIIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllllIIIIIIIllII = new StringBuilder();
        final char[] lllllllllllllIIIlllllIIIIIIIlIll = lllllllllllllIIIlllllIIIIIIIlIII.toCharArray();
        int lllllllllllllIIIlllllIIIIIIIlIlI = AbstractNioChannel.lIlIIIlIlllIIl[0];
        final boolean lllllllllllllIIIlllllIIIIIIIIlII = (Object)((String)lllllllllllllIIIlllllIIIIIIIlIIl).toCharArray();
        final byte lllllllllllllIIIlllllIIIIIIIIIll = (byte)lllllllllllllIIIlllllIIIIIIIIlII.length;
        String lllllllllllllIIIlllllIIIIIIIIIlI = (String)AbstractNioChannel.lIlIIIlIlllIIl[0];
        while (lllIIIllIIIlIll((int)lllllllllllllIIIlllllIIIIIIIIIlI, lllllllllllllIIIlllllIIIIIIIIIll)) {
            final char lllllllllllllIIIlllllIIIIIIIllll = lllllllllllllIIIlllllIIIIIIIIlII[lllllllllllllIIIlllllIIIIIIIIIlI];
            lllllllllllllIIIlllllIIIIIIIllII.append((char)(lllllllllllllIIIlllllIIIIIIIllll ^ lllllllllllllIIIlllllIIIIIIIlIll[lllllllllllllIIIlllllIIIIIIIlIlI % lllllllllllllIIIlllllIIIIIIIlIll.length]));
            "".length();
            ++lllllllllllllIIIlllllIIIIIIIlIlI;
            ++lllllllllllllIIIlllllIIIIIIIIIlI;
            "".length();
            if (-" ".length() > ((0x54 ^ 0x1D) & ~(0xD6 ^ 0x9F))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllllIIIIIIIllII);
    }
    
    void setInputShutdown() {
        this.inputShutdown = (AbstractNioChannel.lIlIIIlIlllIIl[1] != 0);
    }
    
    private static boolean lllIIIllIIIlIll(final int lllllllllllllIIIllllIllllllllllI, final int lllllllllllllIIIllllIlllllllllIl) {
        return lllllllllllllIIIllllIllllllllllI < lllllllllllllIIIllllIlllllllllIl;
    }
    
    protected boolean isReadPending() {
        return this.readPending;
    }
    
    protected boolean isInputShutdown() {
        return this.inputShutdown;
    }
    
    @Override
    public NioUnsafe unsafe() {
        return (NioUnsafe)super.unsafe();
    }
    
    private static boolean lllIIIllIIIlIIl(final Object lllllllllllllIIIllllIlllllllIlll) {
        return lllllllllllllIIIllllIlllllllIlll != null;
    }
    
    @Override
    public boolean isOpen() {
        return this.ch.isOpen();
    }
    
    @Override
    protected boolean isCompatible(final EventLoop lllllllllllllIIIlllllIIIIlllllll) {
        return lllllllllllllIIIlllllIIIIlllllll instanceof NioEventLoop;
    }
    
    @Override
    protected void doBeginRead() throws Exception {
        if (lllIIIllIIIIllI(this.inputShutdown ? 1 : 0)) {
            return;
        }
        final SelectionKey lllllllllllllIIIlllllIIIIllIlllI = this.selectionKey;
        if (lllIIIllIIIIlll(lllllllllllllIIIlllllIIIIllIlllI.isValid() ? 1 : 0)) {
            return;
        }
        this.readPending = (AbstractNioChannel.lIlIIIlIlllIIl[1] != 0);
        final int lllllllllllllIIIlllllIIIIllIllIl = lllllllllllllIIIlllllIIIIllIlllI.interestOps();
        if (lllIIIllIIIIlll(lllllllllllllIIIlllllIIIIllIllIl & this.readInterestOp)) {
            lllllllllllllIIIlllllIIIIllIlllI.interestOps(lllllllllllllIIIlllllIIIIllIllIl | this.readInterestOp);
            "".length();
        }
    }
    
    protected SelectableChannel javaChannel() {
        return this.ch;
    }
    
    private static String lllIIIllIIIIIll(final String lllllllllllllIIIlllllIIIIIIlllII, final String lllllllllllllIIIlllllIIIIIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlllllIIIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllllIIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllllIIIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllllIIIIIlIIIII.init(AbstractNioChannel.lIlIIIlIlllIIl[2], lllllllllllllIIIlllllIIIIIlIIIIl);
            return new String(lllllllllllllIIIlllllIIIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllllIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllllIIIIIIlllll) {
            lllllllllllllIIIlllllIIIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    protected void setReadPending(final boolean lllllllllllllIIIlllllIIIlIIIlIll) {
        this.readPending = lllllllllllllIIIlllllIIIlIIIlIll;
    }
    
    @Override
    public NioEventLoop eventLoop() {
        return (NioEventLoop)super.eventLoop();
    }
    
    protected final ByteBuf newDirectBuffer(final ReferenceCounted lllllllllllllIIIlllllIIIIlIlIIIl, final ByteBuf lllllllllllllIIIlllllIIIIlIlIIII) {
        final int lllllllllllllIIIlllllIIIIlIIllll = lllllllllllllIIIlllllIIIIlIlIIII.readableBytes();
        if (lllIIIllIIIIlll(lllllllllllllIIIlllllIIIIlIIllll)) {
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIlIlIIIl);
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBufAllocator lllllllllllllIIIlllllIIIIlIIlllI = this.alloc();
        if (lllIIIllIIIIllI(lllllllllllllIIIlllllIIIIlIIlllI.isDirectBufferPooled() ? 1 : 0)) {
            final ByteBuf lllllllllllllIIIlllllIIIIlIlIIll = lllllllllllllIIIlllllIIIIlIIlllI.directBuffer(lllllllllllllIIIlllllIIIIlIIllll);
            lllllllllllllIIIlllllIIIIlIlIIll.writeBytes(lllllllllllllIIIlllllIIIIlIlIIII, lllllllllllllIIIlllllIIIIlIlIIII.readerIndex(), lllllllllllllIIIlllllIIIIlIIllll);
            "".length();
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIlIlIIIl);
            return lllllllllllllIIIlllllIIIIlIlIIll;
        }
        final ByteBuf lllllllllllllIIIlllllIIIIlIIllIl = ByteBufUtil.threadLocalDirectBuffer();
        if (lllIIIllIIIlIIl(lllllllllllllIIIlllllIIIIlIIllIl)) {
            lllllllllllllIIIlllllIIIIlIIllIl.writeBytes(lllllllllllllIIIlllllIIIIlIlIIII, lllllllllllllIIIlllllIIIIlIlIIII.readerIndex(), lllllllllllllIIIlllllIIIIlIIllll);
            "".length();
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIlIlIIIl);
            return lllllllllllllIIIlllllIIIIlIIllIl;
        }
        if (lllIIIllIIIlIlI(lllllllllllllIIIlllllIIIIlIlIIIl, lllllllllllllIIIlllllIIIIlIlIIII)) {
            lllllllllllllIIIlllllIIIIlIlIIII.retain();
            "".length();
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIlIlIIIl);
        }
        return lllllllllllllIIIlllllIIIIlIlIIII;
    }
    
    private static void lllIIIllIIIIlIl() {
        (lIlIIIlIlllIIl = new int[3])[0] = ((0x79 ^ 0x68) & ~(0x1F ^ 0xE));
        AbstractNioChannel.lIlIIIlIlllIIl[1] = " ".length();
        AbstractNioChannel.lIlIIIlIlllIIl[2] = "  ".length();
    }
    
    protected final ByteBuf newDirectBuffer(final ByteBuf lllllllllllllIIIlllllIIIIllIIIlI) {
        final int lllllllllllllIIIlllllIIIIllIIIIl = lllllllllllllIIIlllllIIIIllIIIlI.readableBytes();
        if (lllIIIllIIIIlll(lllllllllllllIIIlllllIIIIllIIIIl)) {
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIllIIIlI);
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBufAllocator lllllllllllllIIIlllllIIIIllIIIII = this.alloc();
        if (lllIIIllIIIIllI(lllllllllllllIIIlllllIIIIllIIIII.isDirectBufferPooled() ? 1 : 0)) {
            final ByteBuf lllllllllllllIIIlllllIIIIllIIlII = lllllllllllllIIIlllllIIIIllIIIII.directBuffer(lllllllllllllIIIlllllIIIIllIIIIl);
            lllllllllllllIIIlllllIIIIllIIlII.writeBytes(lllllllllllllIIIlllllIIIIllIIIlI, lllllllllllllIIIlllllIIIIllIIIlI.readerIndex(), lllllllllllllIIIlllllIIIIllIIIIl);
            "".length();
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIllIIIlI);
            return lllllllllllllIIIlllllIIIIllIIlII;
        }
        final ByteBuf lllllllllllllIIIlllllIIIIlIlllll = ByteBufUtil.threadLocalDirectBuffer();
        if (lllIIIllIIIlIIl(lllllllllllllIIIlllllIIIIlIlllll)) {
            lllllllllllllIIIlllllIIIIlIlllll.writeBytes(lllllllllllllIIIlllllIIIIllIIIlI, lllllllllllllIIIlllllIIIIllIIIlI.readerIndex(), lllllllllllllIIIlllllIIIIllIIIIl);
            "".length();
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlllllIIIIllIIIlI);
            return lllllllllllllIIIlllllIIIIlIlllll;
        }
        return lllllllllllllIIIlllllIIIIllIIIlI;
    }
    
    protected abstract void doFinishConnect() throws Exception;
    
    private static boolean lllIIIllIIIlIII(final Object lllllllllllllIIIllllIlllllllIlIl) {
        return lllllllllllllIIIllllIlllllllIlIl == null;
    }
    
    static {
        lllIIIllIIIIlIl();
        lllIIIllIIIIlII();
        int $assertionsDisabled2;
        if (lllIIIllIIIIlll(AbstractNioChannel.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = AbstractNioChannel.lIlIIIlIlllIIl[1];
            "".length();
            if (((112 + 124 - 215 + 118 ^ 106 + 93 - 67 + 13) & (0x66 ^ 0x17 ^ (0x1A ^ 0x71) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = AbstractNioChannel.lIlIIIlIlllIIl[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(AbstractNioChannel.class);
    }
    
    private static void lllIIIllIIIIlII() {
        (lIlIIIlIlllIII = new String[AbstractNioChannel.lIlIIIlIlllIIl[2]])[AbstractNioChannel.lIlIIIlIlllIIl[0]] = lllIIIllIIIIIlI("IyY6BAwBZycHSQYrPBsMRSZzGAgXMzoJBQk+cwEHDDM6CQUMPTYMSRYoMAMMEWk=", "eGShi");
        AbstractNioChannel.lIlIIIlIlllIII[AbstractNioChannel.lIlIIIlIlllIIl[1]] = lllIIIllIIIIIll("/dhYf54kQ2pbTl1nChXGNl8Lf3TJ10GwU6Quu2T7gx9dedOiIhmnTg==", "oDzMt");
    }
    
    protected AbstractNioChannel(final Channel lllllllllllllIIIlllllIIIlIlIlIIl, final SelectableChannel lllllllllllllIIIlllllIIIlIlIlIII, final int lllllllllllllIIIlllllIIIlIlIIIll) {
        super(lllllllllllllIIIlllllIIIlIlIlIIl);
        this.ch = lllllllllllllIIIlllllIIIlIlIlIII;
        this.readInterestOp = lllllllllllllIIIlllllIIIlIlIIIll;
        try {
            lllllllllllllIIIlllllIIIlIlIlIII.configureBlocking((boolean)(AbstractNioChannel.lIlIIIlIlllIIl[0] != 0));
            "".length();
            "".length();
            if (null != null) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIIIlllllIIIlIlIlIll) {
            try {
                lllllllllllllIIIlllllIIIlIlIlIII.close();
                "".length();
                if (-" ".length() == " ".length()) {
                    throw null;
                }
            }
            catch (IOException lllllllllllllIIIlllllIIIlIlIllII) {
                if (lllIIIllIIIIllI(AbstractNioChannel.logger.isWarnEnabled() ? 1 : 0)) {
                    AbstractNioChannel.logger.warn(AbstractNioChannel.lIlIIIlIlllIII[AbstractNioChannel.lIlIIIlIlllIIl[0]], lllllllllllllIIIlllllIIIlIlIllII);
                }
            }
            throw new ChannelException(AbstractNioChannel.lIlIIIlIlllIII[AbstractNioChannel.lIlIIIlIlllIIl[1]], lllllllllllllIIIlllllIIIlIlIlIll);
        }
    }
    
    private static boolean lllIIIllIIIlIlI(final Object lllllllllllllIIIllllIllllllllIlI, final Object lllllllllllllIIIllllIllllllllIIl) {
        return lllllllllllllIIIllllIllllllllIlI != lllllllllllllIIIllllIllllllllIIl;
    }
    
    @Override
    protected void doRegister() throws Exception {
        boolean lllllllllllllIIIlllllIIIIllllIIl = AbstractNioChannel.lIlIIIlIlllIIl[0] != 0;
        while (true) {
            try {
                this.selectionKey = this.javaChannel().register(this.eventLoop().selector, AbstractNioChannel.lIlIIIlIlllIIl[0], this);
            }
            catch (CancelledKeyException lllllllllllllIIIlllllIIIIllllIll) {
                if (!lllIIIllIIIIlll(lllllllllllllIIIlllllIIIIllllIIl ? 1 : 0)) {
                    throw lllllllllllllIIIlllllIIIIllllIll;
                }
                this.eventLoop().selectNow();
                lllllllllllllIIIlllllIIIIllllIIl = (AbstractNioChannel.lIlIIIlIlllIIl[1] != 0);
                "".length();
                if ((0xC0 ^ 0xC4) <= -" ".length()) {
                    return;
                }
                "".length();
                if (((0xF3 ^ 0xA3) & ~(0x49 ^ 0x19)) < ((0x7A ^ 0x64) & ~(0x47 ^ 0x59))) {
                    return;
                }
                continue;
            }
            break;
        }
    }
    
    protected SelectionKey selectionKey() {
        if (lllIIIllIIIIlll(AbstractNioChannel.$assertionsDisabled ? 1 : 0) && lllIIIllIIIlIII(this.selectionKey)) {
            throw new AssertionError();
        }
        return this.selectionKey;
    }
    
    protected abstract class AbstractNioUnsafe extends AbstractUnsafe implements NioUnsafe
    {
        private static final /* synthetic */ int[] lIlIlllIllllll;
        static final /* synthetic */ boolean $assertionsDisabled;
        private static final /* synthetic */ String[] lIlIlllIlllllI;
        
        private static boolean llllIlIIIlIIIlI(final int lllllllllllllIIIIlIlIlIlIIlIIlll) {
            return lllllllllllllIIIIlIlIlIlIIlIIlll == 0;
        }
        
        protected final void removeReadOp() {
            final SelectionKey lllllllllllllIIIIlIlIlIllIllllII = AbstractNioChannel.this.selectionKey();
            if (llllIlIIIlIIIlI(lllllllllllllIIIIlIlIlIllIllllII.isValid() ? 1 : 0)) {
                return;
            }
            final int lllllllllllllIIIIlIlIlIllIlllIll = lllllllllllllIIIIlIlIlIllIllllII.interestOps();
            if (llllIlIIIlIIIll(lllllllllllllIIIIlIlIlIllIlllIll & AbstractNioChannel.this.readInterestOp)) {
                lllllllllllllIIIIlIlIlIllIllllII.interestOps(lllllllllllllIIIIlIlIlIllIlllIll & (AbstractNioChannel.this.readInterestOp ^ AbstractNioUnsafe.lIlIlllIllllll[0]));
                "".length();
            }
        }
        
        private static String llllIlIIIIllllI(final String lllllllllllllIIIIlIlIlIlIIllllll, final String lllllllllllllIIIIlIlIlIlIlIIIIII) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIlIlIlIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), AbstractNioUnsafe.lIlIlllIllllll[6]), "DES");
                final Cipher lllllllllllllIIIIlIlIlIlIlIIIlIl = Cipher.getInstance("DES");
                lllllllllllllIIIIlIlIlIlIlIIIlIl.init(AbstractNioUnsafe.lIlIlllIllllll[3], lllllllllllllIIIIlIlIlIlIlIIIlll);
                return new String(lllllllllllllIIIIlIlIlIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIlIlIlIlIIIIll) {
                lllllllllllllIIIIlIlIlIlIlIIIIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllIlIIIlIIlII(final Object lllllllllllllIIIIlIlIlIlIIllIIIl) {
            return lllllllllllllIIIIlIlIlIlIIllIIIl != null;
        }
        
        private void fulfillConnectPromise(final ChannelPromise lllllllllllllIIIIlIlIlIllIIIllIl, final Throwable lllllllllllllIIIIlIlIlIllIIIllII) {
            if (llllIlIIIlIIllI(lllllllllllllIIIIlIlIlIllIIIllIl)) {
                return;
            }
            lllllllllllllIIIIlIlIlIllIIIllIl.tryFailure(lllllllllllllIIIIlIlIlIllIIIllII);
            "".length();
            this.closeIfClosed();
        }
        
        @Override
        protected final void flush0() {
            if (llllIlIIIlIIIll(this.isFlushPending() ? 1 : 0)) {
                return;
            }
            super.flush0();
        }
        
        @Override
        public final SelectableChannel ch() {
            return AbstractNioChannel.this.javaChannel();
        }
        
        private static boolean llllIlIIIlIIllI(final Object lllllllllllllIIIIlIlIlIlIIlIllll) {
            return lllllllllllllIIIIlIlIlIlIIlIllll == null;
        }
        
        private static boolean llllIlIIIlIIlIl(final int lllllllllllllIIIIlIlIlIlIIlIIIll) {
            return lllllllllllllIIIIlIlIlIlIIlIIIll > 0;
        }
        
        private static void llllIlIIIlIIIII() {
            (lIlIlllIlllllI = new String[AbstractNioUnsafe.lIlIlllIllllll[5]])[AbstractNioUnsafe.lIlIlllIllllll[1]] = llllIlIIIIllllI("vi2COxL4ZAoq5HKO52QdcPdlq0VAEUQggXPknj8xXcM=", "WuVQi");
            AbstractNioUnsafe.lIlIlllIlllllI[AbstractNioUnsafe.lIlIlllIllllll[2]] = llllIlIIIIlllll("VWU=", "oEufR");
            AbstractNioUnsafe.lIlIlllIlllllI[AbstractNioUnsafe.lIlIlllIllllll[3]] = llllIlIIIIllllI("ExWoK89L2TA=", "igtxA");
        }
        
        private static boolean llllIlIIIlIIIll(final int lllllllllllllIIIIlIlIlIlIIlIlIll) {
            return lllllllllllllIIIIlIlIlIlIIlIlIll != 0;
        }
        
        @Override
        public final void finishConnect() {
            if (llllIlIIIlIIIlI(AbstractNioUnsafe.$assertionsDisabled ? 1 : 0) && llllIlIIIlIIIlI(AbstractNioChannel.this.eventLoop().inEventLoop() ? 1 : 0)) {
                throw new AssertionError();
            }
            try {
                final boolean lllllllllllllIIIIlIlIlIllIIIIlll = AbstractNioChannel.this.isActive();
                AbstractNioChannel.this.doFinishConnect();
                this.fulfillConnectPromise(AbstractNioChannel.this.connectPromise, lllllllllllllIIIIlIlIlIllIIIIlll);
                if (llllIlIIIlIIlII(AbstractNioChannel.this.connectTimeoutFuture)) {
                    AbstractNioChannel.this.connectTimeoutFuture.cancel((boolean)(AbstractNioUnsafe.lIlIlllIllllll[1] != 0));
                    "".length();
                }
                AbstractNioChannel.this.connectPromise = null;
                "".length();
                "".length();
                if (((0x59 ^ 0x44) & ~(0xB8 ^ 0xA5)) == "   ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIIlIlIlIllIIIIlIl) {
                if (llllIlIIIlIIIll((lllllllllllllIIIIlIlIlIllIIIIlIl instanceof ConnectException) ? 1 : 0)) {
                    final Throwable lllllllllllllIIIIlIlIlIllIIIIllI = new ConnectException(String.valueOf(new StringBuilder().append(lllllllllllllIIIIlIlIlIllIIIIlIl.getMessage()).append(AbstractNioUnsafe.lIlIlllIlllllI[AbstractNioUnsafe.lIlIlllIllllll[3]]).append(AbstractNioChannel.this.requestedRemoteAddress)));
                    lllllllllllllIIIIlIlIlIllIIIIllI.setStackTrace(lllllllllllllIIIIlIlIlIllIIIIlIl.getStackTrace());
                    lllllllllllllIIIIlIlIlIllIIIIlIl = lllllllllllllIIIIlIlIlIllIIIIllI;
                }
                this.fulfillConnectPromise(AbstractNioChannel.this.connectPromise, lllllllllllllIIIIlIlIlIllIIIIlIl);
                if (llllIlIIIlIIlII(AbstractNioChannel.this.connectTimeoutFuture)) {
                    AbstractNioChannel.this.connectTimeoutFuture.cancel((boolean)(AbstractNioUnsafe.lIlIlllIllllll[1] != 0));
                    "".length();
                }
                AbstractNioChannel.this.connectPromise = null;
                "".length();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            finally {
                if (llllIlIIIlIIlII(AbstractNioChannel.this.connectTimeoutFuture)) {
                    AbstractNioChannel.this.connectTimeoutFuture.cancel((boolean)(AbstractNioUnsafe.lIlIlllIllllll[1] != 0));
                    "".length();
                }
                AbstractNioChannel.this.connectPromise = null;
                "".length();
            }
        }
        
        @Override
        public final void connect(final SocketAddress lllllllllllllIIIIlIlIlIllIlIlIIl, final SocketAddress lllllllllllllIIIIlIlIlIllIlIlIII, final ChannelPromise lllllllllllllIIIIlIlIlIllIlIIlll) {
            if (!llllIlIIIlIIIll(lllllllllllllIIIIlIlIlIllIlIIlll.setUncancellable() ? 1 : 0) || llllIlIIIlIIIlI(this.ensureOpen(lllllllllllllIIIIlIlIlIllIlIIlll) ? 1 : 0)) {
                return;
            }
            try {
                if (llllIlIIIlIIlII(AbstractNioChannel.this.connectPromise)) {
                    throw new IllegalStateException(AbstractNioUnsafe.lIlIlllIlllllI[AbstractNioUnsafe.lIlIlllIllllll[1]]);
                }
                final boolean lllllllllllllIIIIlIlIlIllIlIllIl = AbstractNioChannel.this.isActive();
                if (llllIlIIIlIIIll(AbstractNioChannel.this.doConnect(lllllllllllllIIIIlIlIlIllIlIlIIl, lllllllllllllIIIIlIlIlIllIlIlIII) ? 1 : 0)) {
                    this.fulfillConnectPromise(lllllllllllllIIIIlIlIlIllIlIIlll, lllllllllllllIIIIlIlIlIllIlIllIl);
                    "".length();
                    if ((0x83 ^ 0x86) == 0x0) {
                        return;
                    }
                }
                else {
                    AbstractNioChannel.this.connectPromise = lllllllllllllIIIIlIlIlIllIlIIlll;
                    "".length();
                    AbstractNioChannel.this.requestedRemoteAddress = lllllllllllllIIIIlIlIlIllIlIlIIl;
                    "".length();
                    final int lllllllllllllIIIIlIlIlIllIlIlllI = AbstractNioChannel.this.config().getConnectTimeoutMillis();
                    if (llllIlIIIlIIlIl(lllllllllllllIIIIlIlIlIllIlIlllI)) {
                        AbstractNioChannel.this.connectTimeoutFuture = AbstractNioChannel.this.eventLoop().schedule(new OneTimeTask() {
                            private static final /* synthetic */ int[] lIllIlllllIIII;
                            private static final /* synthetic */ String[] lIllIllllIllIl;
                            
                            private static void lIIIIIIIlIIIlIll() {
                                (lIllIlllllIIII = new int[2])[0] = ((0xA1 ^ 0xBE ^ (0x62 ^ 0x6D)) & (166 + 73 - 115 + 43 ^ 177 + 46 - 171 + 131 ^ -" ".length()));
                                AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[1] = " ".length();
                            }
                            
                            private static String lIIIIIIIlIIIIIll(String llllllllllllIllllllIIIlIlIIIIlIl, final String llllllllllllIllllllIIIlIlIIIlIIl) {
                                llllllllllllIllllllIIIlIlIIIIlIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllIIIlIlIIIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                                final StringBuilder llllllllllllIllllllIIIlIlIIIlIII = new StringBuilder();
                                final char[] llllllllllllIllllllIIIlIlIIIIlll = llllllllllllIllllllIIIlIlIIIlIIl.toCharArray();
                                int llllllllllllIllllllIIIlIlIIIIllI = AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[0];
                                final boolean llllllllllllIllllllIIIlIlIIIIIII = (Object)((String)llllllllllllIllllllIIIlIlIIIIlIl).toCharArray();
                                final float llllllllllllIllllllIIIlIIlllllll = llllllllllllIllllllIIIlIlIIIIIII.length;
                                int llllllllllllIllllllIIIlIIllllllI = AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[0];
                                while (lIIIIIIIlIIIlllI(llllllllllllIllllllIIIlIIllllllI, (int)llllllllllllIllllllIIIlIIlllllll)) {
                                    final char llllllllllllIllllllIIIlIlIIIlIll = llllllllllllIllllllIIIlIlIIIIIII[llllllllllllIllllllIIIlIIllllllI];
                                    llllllllllllIllllllIIIlIlIIIlIII.append((char)(llllllllllllIllllllIIIlIlIIIlIll ^ llllllllllllIllllllIIIlIlIIIIlll[llllllllllllIllllllIIIlIlIIIIllI % llllllllllllIllllllIIIlIlIIIIlll.length]));
                                    "".length();
                                    ++llllllllllllIllllllIIIlIlIIIIllI;
                                    ++llllllllllllIllllllIIIlIIllllllI;
                                    "".length();
                                    if (-"   ".length() > 0) {
                                        return null;
                                    }
                                }
                                return String.valueOf(llllllllllllIllllllIIIlIlIIIlIII);
                            }
                            
                            private static boolean lIIIIIIIlIIIllII(final Object llllllllllllIllllllIIIlIIlllIlll) {
                                return llllllllllllIllllllIIIlIIlllIlll != null;
                            }
                            
                            @Override
                            public void run() {
                                final ChannelPromise llllllllllllIllllllIIIlIlIIllIIl = AbstractNioChannel.this.connectPromise;
                                final ConnectTimeoutException llllllllllllIllllllIIIlIlIIllIII = new ConnectTimeoutException(String.valueOf(new StringBuilder().append(AbstractNioChannel$AbstractNioUnsafe$1.lIllIllllIllIl[AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[0]]).append(lllllllllllllIIIIlIlIlIllIlIlIIl)));
                                if (lIIIIIIIlIIIllII(llllllllllllIllllllIIIlIlIIllIIl) && lIIIIIIIlIIIllIl(llllllllllllIllllllIIIlIlIIllIIl.tryFailure(llllllllllllIllllllIIIlIlIIllIII) ? 1 : 0)) {
                                    AbstractNioUnsafe.this.close(AbstractNioUnsafe.this.voidPromise());
                                }
                            }
                            
                            private static void lIIIIIIIlIIIIlII() {
                                (lIllIllllIllIl = new String[AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[1]])[AbstractNioChannel$AbstractNioUnsafe$1.lIllIlllllIIII[0]] = lIIIIIIIlIIIIIll("CTUFPQQJLgI8D0ouAj4EDnoEJhVQeg==", "jZkSa");
                            }
                            
                            private static boolean lIIIIIIIlIIIlllI(final int llllllllllllIllllllIIIlIIllllIlI, final int llllllllllllIllllllIIIlIIllllIIl) {
                                return llllllllllllIllllllIIIlIIllllIlI < llllllllllllIllllllIIIlIIllllIIl;
                            }
                            
                            private static boolean lIIIIIIIlIIIllIl(final int llllllllllllIllllllIIIlIIlllIlIl) {
                                return llllllllllllIllllllIIIlIIlllIlIl != 0;
                            }
                            
                            static {
                                lIIIIIIIlIIIlIll();
                                lIIIIIIIlIIIIlII();
                            }
                        }, lllllllllllllIIIIlIlIlIllIlIlllI, TimeUnit.MILLISECONDS);
                        "".length();
                    }
                    lllllllllllllIIIIlIlIlIllIlIIlll.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                        private static final /* synthetic */ int[] lIlIIIIIIlIlll;
                        
                        private static void lllIIIIIIIIllII() {
                            (lIlIIIIIIlIlll = new int[1])[0] = ((0x86 ^ 0x88) & ~(0x85 ^ 0x8B));
                        }
                        
                        static {
                            lllIIIIIIIIllII();
                        }
                        
                        private static boolean lllIIIIIIIIllIl(final int lllllllllllllIIlIIIlIIllIlllIIll) {
                            return lllllllllllllIIlIIIlIIllIlllIIll != 0;
                        }
                        
                        private static boolean lllIIIIIIIIlllI(final Object lllllllllllllIIlIIIlIIllIlllIlIl) {
                            return lllllllllllllIIlIIIlIIllIlllIlIl != null;
                        }
                        
                        @Override
                        public void operationComplete(final ChannelFuture lllllllllllllIIlIIIlIIllIlllllIl) throws Exception {
                            if (lllIIIIIIIIllIl(lllllllllllllIIlIIIlIIllIlllllIl.isCancelled() ? 1 : 0)) {
                                if (lllIIIIIIIIlllI(AbstractNioChannel.this.connectTimeoutFuture)) {
                                    AbstractNioChannel.this.connectTimeoutFuture.cancel((boolean)(AbstractNioChannel$AbstractNioUnsafe$2.lIlIIIIIIlIlll[0] != 0));
                                    "".length();
                                }
                                AbstractNioChannel.this.connectPromise = null;
                                "".length();
                                AbstractNioUnsafe.this.close(AbstractNioUnsafe.this.voidPromise());
                            }
                        }
                    });
                    "".length();
                }
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIIlIlIlIllIlIlIll) {
                if (llllIlIIIlIIIll((lllllllllllllIIIIlIlIlIllIlIlIll instanceof ConnectException) ? 1 : 0)) {
                    final Throwable lllllllllllllIIIIlIlIlIllIlIllII = new ConnectException(String.valueOf(new StringBuilder().append(lllllllllllllIIIIlIlIlIllIlIlIll.getMessage()).append(AbstractNioUnsafe.lIlIlllIlllllI[AbstractNioUnsafe.lIlIlllIllllll[2]]).append(lllllllllllllIIIIlIlIlIllIlIlIIl)));
                    lllllllllllllIIIIlIlIlIllIlIllII.setStackTrace(lllllllllllllIIIIlIlIlIllIlIlIll.getStackTrace());
                    lllllllllllllIIIIlIlIlIllIlIlIll = lllllllllllllIIIIlIlIlIllIlIllII;
                }
                lllllllllllllIIIIlIlIlIllIlIIlll.tryFailure(lllllllllllllIIIIlIlIlIllIlIlIll);
                "".length();
                this.closeIfClosed();
            }
        }
        
        private void fulfillConnectPromise(final ChannelPromise lllllllllllllIIIIlIlIlIllIIllIll, final boolean lllllllllllllIIIIlIlIlIllIIllIlI) {
            if (llllIlIIIlIIllI(lllllllllllllIIIIlIlIlIllIIllIll)) {
                return;
            }
            final boolean lllllllllllllIIIIlIlIlIllIIllIIl = lllllllllllllIIIIlIlIlIllIIllIll.trySuccess();
            if (llllIlIIIlIIIlI(lllllllllllllIIIIlIlIlIllIIllIlI ? 1 : 0) && llllIlIIIlIIIll(AbstractNioChannel.this.isActive() ? 1 : 0)) {
                AbstractNioChannel.this.pipeline().fireChannelActive();
                "".length();
            }
            if (llllIlIIIlIIIlI(lllllllllllllIIIIlIlIlIllIIllIIl ? 1 : 0)) {
                this.close(this.voidPromise());
            }
        }
        
        @Override
        public final void forceFlush() {
            super.flush0();
        }
        
        private boolean isFlushPending() {
            final SelectionKey lllllllllllllIIIIlIlIlIlIlllIllI = AbstractNioChannel.this.selectionKey();
            int n;
            if (llllIlIIIlIIIll(lllllllllllllIIIIlIlIlIlIlllIllI.isValid() ? 1 : 0) && llllIlIIIlIIIll(lllllllllllllIIIIlIlIlIlIlllIllI.interestOps() & AbstractNioUnsafe.lIlIlllIllllll[4])) {
                n = AbstractNioUnsafe.lIlIlllIllllll[2];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return ((158 + 5 - 2 + 36 ^ 122 + 96 - 98 + 19) & (0x65 ^ 0xD ^ (0x53 ^ 0x75) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = AbstractNioUnsafe.lIlIlllIllllll[1];
            }
            return n != 0;
        }
        
        private static boolean llllIlIIIlIIlll(final int lllllllllllllIIIIlIlIlIlIIllIlII, final int lllllllllllllIIIIlIlIlIlIIllIIll) {
            return lllllllllllllIIIIlIlIlIlIIllIlII < lllllllllllllIIIIlIlIlIlIIllIIll;
        }
        
        private static void llllIlIIIlIIIIl() {
            (lIlIlllIllllll = new int[7])[0] = -" ".length();
            AbstractNioUnsafe.lIlIlllIllllll[1] = ((0x1B ^ 0xB ^ ((0x59 ^ 0x54) & ~(0xB2 ^ 0xBF))) & (0x43 ^ 0x1F ^ (0x5D ^ 0x11) ^ -" ".length()));
            AbstractNioUnsafe.lIlIlllIllllll[2] = " ".length();
            AbstractNioUnsafe.lIlIlllIllllll[3] = "  ".length();
            AbstractNioUnsafe.lIlIlllIllllll[4] = (0x21 ^ 0x25);
            AbstractNioUnsafe.lIlIlllIllllll[5] = "   ".length();
            AbstractNioUnsafe.lIlIlllIllllll[6] = (0x46 ^ 0x4F ^ " ".length());
        }
        
        static {
            llllIlIIIlIIIIl();
            llllIlIIIlIIIII();
            int $assertionsDisabled2;
            if (llllIlIIIlIIIlI(AbstractNioChannel.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = AbstractNioUnsafe.lIlIlllIllllll[2];
                "".length();
                if (-(0x7E ^ 0x7B) >= 0) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = AbstractNioUnsafe.lIlIlllIllllll[1];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static String llllIlIIIIlllll(String lllllllllllllIIIIlIlIlIlIllIIIIl, final String lllllllllllllIIIIlIlIlIlIllIIlll) {
            lllllllllllllIIIIlIlIlIlIllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIlIlIlIlIllIIllI = new StringBuilder();
            final char[] lllllllllllllIIIIlIlIlIlIllIIlII = lllllllllllllIIIIlIlIlIlIllIIlll.toCharArray();
            int lllllllllllllIIIIlIlIlIlIllIIIll = AbstractNioUnsafe.lIlIlllIllllll[1];
            final boolean lllllllllllllIIIIlIlIlIlIlIllIII = (Object)lllllllllllllIIIIlIlIlIlIllIIIIl.toCharArray();
            final long lllllllllllllIIIIlIlIlIlIlIlIlll = lllllllllllllIIIIlIlIlIlIlIllIII.length;
            boolean lllllllllllllIIIIlIlIlIlIlIlIlIl = AbstractNioUnsafe.lIlIlllIllllll[1] != 0;
            while (llllIlIIIlIIlll(lllllllllllllIIIIlIlIlIlIlIlIlIl ? 1 : 0, (int)lllllllllllllIIIIlIlIlIlIlIlIlll)) {
                final char lllllllllllllIIIIlIlIlIlIllIlIlI = lllllllllllllIIIIlIlIlIlIlIllIII[lllllllllllllIIIIlIlIlIlIlIlIlIl];
                lllllllllllllIIIIlIlIlIlIllIIllI.append((char)(lllllllllllllIIIIlIlIlIlIllIlIlI ^ lllllllllllllIIIIlIlIlIlIllIIlII[lllllllllllllIIIIlIlIlIlIllIIIll % lllllllllllllIIIIlIlIlIlIllIIlII.length]));
                "".length();
                ++lllllllllllllIIIIlIlIlIlIllIIIll;
                ++lllllllllllllIIIIlIlIlIlIlIlIlIl;
                "".length();
                if (" ".length() > "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIlIlIlIlIllIIllI);
        }
    }
    
    public interface NioUnsafe extends Channel.Unsafe
    {
        void forceFlush();
        
        SelectableChannel ch();
        
        void read();
        
        void finishConnect();
    }
}
