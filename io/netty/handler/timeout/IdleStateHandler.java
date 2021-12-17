// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.EventExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.ScheduledFuture;
import io.netty.channel.ChannelDuplexHandler;

public class IdleStateHandler extends ChannelDuplexHandler
{
    private /* synthetic */ boolean firstWriterIdleEvent;
    volatile /* synthetic */ ScheduledFuture<?> readerIdleTimeout;
    private static final /* synthetic */ long MIN_TIMEOUT_NANOS;
    private /* synthetic */ boolean firstReaderIdleEvent;
    private final /* synthetic */ long readerIdleTimeNanos;
    volatile /* synthetic */ long lastWriteTime;
    private /* synthetic */ boolean firstAllIdleEvent;
    volatile /* synthetic */ ScheduledFuture<?> writerIdleTimeout;
    private static final /* synthetic */ int[] llllIIIlIlIIl;
    private final /* synthetic */ long writerIdleTimeNanos;
    volatile /* synthetic */ long lastReadTime;
    volatile /* synthetic */ ScheduledFuture<?> allIdleTimeout;
    private static final /* synthetic */ String[] llllIIIlIIlll;
    private final /* synthetic */ long allIdleTimeNanos;
    private volatile /* synthetic */ int state;
    
    @Override
    public void channelRegistered(final ChannelHandlerContext lllllllllllllIlIllllIIlIIlIIllII) throws Exception {
        if (lIlIIllllIIIlll(lllllllllllllIlIllllIIlIIlIIllII.channel().isActive() ? 1 : 0)) {
            this.initialize(lllllllllllllIlIllllIIlIIlIIllII);
        }
        super.channelRegistered(lllllllllllllIlIllllIIlIIlIIllII);
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIlIllllIIlIIlIIIIII) throws Exception {
        this.destroy();
        super.channelInactive(lllllllllllllIlIllllIIlIIlIIIIII);
    }
    
    private void destroy() {
        this.state = IdleStateHandler.llllIIIlIlIIl[2];
        if (lIlIIllllIIlIlI(this.readerIdleTimeout)) {
            this.readerIdleTimeout.cancel((boolean)(IdleStateHandler.llllIIIlIlIIl[1] != 0));
            "".length();
            this.readerIdleTimeout = null;
        }
        if (lIlIIllllIIlIlI(this.writerIdleTimeout)) {
            this.writerIdleTimeout.cancel((boolean)(IdleStateHandler.llllIIIlIlIIl[1] != 0));
            "".length();
            this.writerIdleTimeout = null;
        }
        if (lIlIIllllIIlIlI(this.allIdleTimeout)) {
            this.allIdleTimeout.cancel((boolean)(IdleStateHandler.llllIIIlIlIIl[1] != 0));
            "".length();
            this.allIdleTimeout = null;
        }
    }
    
    protected void channelIdle(final ChannelHandlerContext lllllllllllllIlIllllIIlIIIIllIIl, final IdleStateEvent lllllllllllllIlIllllIIlIIIIllIII) throws Exception {
        lllllllllllllIlIllllIIlIIIIllIIl.fireUserEventTriggered(lllllllllllllIlIllllIIlIIIIllIII);
        "".length();
    }
    
    private static int lIlIIllllIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIlIIlllIlllllI(final String lllllllllllllIlIllllIIIllllIlIlI, final String lllllllllllllIlIllllIIIllllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIIIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIIIllllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIIIllllIllII.init(IdleStateHandler.llllIIIlIlIIl[2], lllllllllllllIlIllllIIIllllIllIl);
            return new String(lllllllllllllIlIllllIIIllllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIIIllllIlIll) {
            lllllllllllllIlIllllIIIllllIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIlIllllIIlIIlIlIllI) throws Exception {
        if (lIlIIllllIIIlll(lllllllllllllIlIllllIIlIIlIlIllI.channel().isActive() ? 1 : 0) && lIlIIllllIIIlll(lllllllllllllIlIllllIIlIIlIlIllI.channel().isRegistered() ? 1 : 0)) {
            this.initialize(lllllllllllllIlIllllIIlIIlIlIllI);
        }
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext lllllllllllllIlIllllIIlIIlIlIIIl) throws Exception {
        this.destroy();
    }
    
    public IdleStateHandler(final int lllllllllllllIlIllllIIlIIllllIII, final int lllllllllllllIlIllllIIlIIlllIlll, final int lllllllllllllIlIllllIIlIIlllIIlI) {
        this(lllllllllllllIlIllllIIlIIllllIII, lllllllllllllIlIllllIIlIIlllIlll, lllllllllllllIlIllllIIlIIlllIIlI, TimeUnit.SECONDS);
    }
    
    static {
        lIlIIllllIIIIll();
        lIlIIlllIllllll();
        MIN_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(1L);
    }
    
    private static int lIlIIllllIIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIlIIlllIllllll() {
        (llllIIIlIIlll = new String[IdleStateHandler.llllIIIlIlIIl[0]])[IdleStateHandler.llllIIIlIlIIl[1]] = lIlIIlllIlllllI("/0arkkOM9/I=", "XbMVb");
    }
    
    private static boolean lIlIIllllIIlIlI(final Object lllllllllllllIlIllllIIIllllIIIll) {
        return lllllllllllllIlIllllIIIllllIIIll != null;
    }
    
    public long getAllIdleTimeInMillis() {
        return TimeUnit.NANOSECONDS.toMillis(this.allIdleTimeNanos);
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext lllllllllllllIlIllllIIlIIlIIIlII) throws Exception {
        this.initialize(lllllllllllllIlIllllIIlIIlIIIlII);
        super.channelActive(lllllllllllllIlIllllIIlIIlIIIlII);
    }
    
    private void initialize(final ChannelHandlerContext lllllllllllllIlIllllIIlIIIlIIlII) {
        switch (this.state) {
            case 1:
            case 2: {}
            default: {
                this.state = IdleStateHandler.llllIIIlIlIIl[0];
                final EventExecutor lllllllllllllIlIllllIIlIIIlIIIll = lllllllllllllIlIllllIIlIIIlIIlII.executor();
                final long nanoTime = System.nanoTime();
                this.lastWriteTime = nanoTime;
                this.lastReadTime = nanoTime;
                if (lIlIIllllIIlIIl(lIlIIllllIIlIII(this.readerIdleTimeNanos, 0L))) {
                    this.readerIdleTimeout = lllllllllllllIlIllllIIlIIIlIIIll.schedule((Runnable)new ReaderIdleTimeoutTask(lllllllllllllIlIllllIIlIIIlIIlII), this.readerIdleTimeNanos, TimeUnit.NANOSECONDS);
                }
                if (lIlIIllllIIlIIl(lIlIIllllIIlIII(this.writerIdleTimeNanos, 0L))) {
                    this.writerIdleTimeout = lllllllllllllIlIllllIIlIIIlIIIll.schedule((Runnable)new WriterIdleTimeoutTask(lllllllllllllIlIllllIIlIIIlIIlII), this.writerIdleTimeNanos, TimeUnit.NANOSECONDS);
                }
                if (lIlIIllllIIlIIl(lIlIIllllIIlIII(this.allIdleTimeNanos, 0L))) {
                    this.allIdleTimeout = lllllllllllllIlIllllIIlIIIlIIIll.schedule((Runnable)new AllIdleTimeoutTask(lllllllllllllIlIllllIIlIIIlIIlII), this.allIdleTimeNanos, TimeUnit.NANOSECONDS);
                }
            }
        }
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIlIllllIIlIIIlIllll, final Object lllllllllllllIlIllllIIlIIIlIlllI, final ChannelPromise lllllllllllllIlIllllIIlIIIlIlIIl) throws Exception {
        lllllllllllllIlIllllIIlIIIlIlIIl.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            private static final /* synthetic */ int[] llIlIIlIIlIIII;
            
            static {
                lIIlIIlIIlIlIllI();
            }
            
            @Override
            public void operationComplete(final ChannelFuture llllllllllllIllIllIIIlllIlIlllII) throws Exception {
                IdleStateHandler.this.lastWriteTime = System.nanoTime();
                IdleStateHandler.this.firstWriterIdleEvent = (IdleStateHandler.this.firstAllIdleEvent = (boolean)(IdleStateHandler$1.llIlIIlIIlIIII[0] != 0));
                "".length();
            }
            
            private static void lIIlIIlIIlIlIllI() {
                (llIlIIlIIlIIII = new int[1])[0] = " ".length();
            }
        });
        "".length();
        lllllllllllllIlIllllIIlIIIlIllll.write(lllllllllllllIlIllllIIlIIIlIlllI, lllllllllllllIlIllllIIlIIIlIlIIl);
        "".length();
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIlIllllIIlIIIllIllI, final Object lllllllllllllIlIllllIIlIIIllIlIl) throws Exception {
        this.lastReadTime = System.nanoTime();
        final int n = IdleStateHandler.llllIIIlIlIIl[0];
        this.firstAllIdleEvent = (n != 0);
        this.firstReaderIdleEvent = (n != 0);
        lllllllllllllIlIllllIIlIIIllIllI.fireChannelRead(lllllllllllllIlIllllIIlIIIllIlIl);
        "".length();
    }
    
    private static boolean lIlIIllllIIIllI(final int lllllllllllllIlIllllIIIlllIlllIl) {
        return lllllllllllllIlIllllIIIlllIlllIl <= 0;
    }
    
    public long getWriterIdleTimeInMillis() {
        return TimeUnit.NANOSECONDS.toMillis(this.writerIdleTimeNanos);
    }
    
    public IdleStateHandler(final long lllllllllllllIlIllllIIlIIllIlIll, final long lllllllllllllIlIllllIIlIIllIlIlI, final long lllllllllllllIlIllllIIlIIllIlIIl, final TimeUnit lllllllllllllIlIllllIIlIIllIlIII) {
        this.firstReaderIdleEvent = (IdleStateHandler.llllIIIlIlIIl[0] != 0);
        this.firstWriterIdleEvent = (IdleStateHandler.llllIIIlIlIIl[0] != 0);
        this.firstAllIdleEvent = (IdleStateHandler.llllIIIlIlIIl[0] != 0);
        if (lIlIIllllIIIlIl(lllllllllllllIlIllllIIlIIllIlIII)) {
            throw new NullPointerException(IdleStateHandler.llllIIIlIIlll[IdleStateHandler.llllIIIlIlIIl[1]]);
        }
        if (lIlIIllllIIIllI(lIlIIllllIIIlII(lllllllllllllIlIllllIIlIIllIlIll, 0L))) {
            this.readerIdleTimeNanos = 0L;
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            this.readerIdleTimeNanos = Math.max(lllllllllllllIlIllllIIlIIllIlIII.toNanos(lllllllllllllIlIllllIIlIIllIlIll), IdleStateHandler.MIN_TIMEOUT_NANOS);
        }
        if (lIlIIllllIIIllI(lIlIIllllIIIlII(lllllllllllllIlIllllIIlIIllIlIlI, 0L))) {
            this.writerIdleTimeNanos = 0L;
            "".length();
            if ("   ".length() < 0) {
                throw null;
            }
        }
        else {
            this.writerIdleTimeNanos = Math.max(lllllllllllllIlIllllIIlIIllIlIII.toNanos(lllllllllllllIlIllllIIlIIllIlIlI), IdleStateHandler.MIN_TIMEOUT_NANOS);
        }
        if (lIlIIllllIIIllI(lIlIIllllIIIlII(lllllllllllllIlIllllIIlIIllIlIIl, 0L))) {
            this.allIdleTimeNanos = 0L;
            "".length();
            if (-(0x9B ^ 0x9F) > 0) {
                throw null;
            }
        }
        else {
            this.allIdleTimeNanos = Math.max(lllllllllllllIlIllllIIlIIllIlIII.toNanos(lllllllllllllIlIllllIIlIIllIlIIl), IdleStateHandler.MIN_TIMEOUT_NANOS);
        }
    }
    
    private static void lIlIIllllIIIIll() {
        (llllIIIlIlIIl = new int[3])[0] = " ".length();
        IdleStateHandler.llllIIIlIlIIl[1] = ((0x9A ^ 0x9E) & ~(0x0 ^ 0x4));
        IdleStateHandler.llllIIIlIlIIl[2] = "  ".length();
    }
    
    private static boolean lIlIIllllIIIlIl(final Object lllllllllllllIlIllllIIIllllIIIIl) {
        return lllllllllllllIlIllllIIIllllIIIIl == null;
    }
    
    private static boolean lIlIIllllIIIlll(final int lllllllllllllIlIllllIIIlllIlllll) {
        return lllllllllllllIlIllllIIIlllIlllll != 0;
    }
    
    public long getReaderIdleTimeInMillis() {
        return TimeUnit.NANOSECONDS.toMillis(this.readerIdleTimeNanos);
    }
    
    private static boolean lIlIIllllIIlIIl(final int lllllllllllllIlIllllIIIlllIllIll) {
        return lllllllllllllIlIllllIIIlllIllIll > 0;
    }
    
    private final class AllIdleTimeoutTask implements Runnable
    {
        private final /* synthetic */ ChannelHandlerContext ctx;
        private static final /* synthetic */ int[] lIIlIlIIIIlIIl;
        
        private static int llIIllllIlIIlll(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean llIIllllIlIlIIl(final int lllllllllllllIIllIlIlIIIIIIllIlI) {
            return lllllllllllllIIllIlIlIIIIIIllIlI <= 0;
        }
        
        AllIdleTimeoutTask(final ChannelHandlerContext lllllllllllllIIllIlIlIIIIIllIIIl) {
            this.ctx = lllllllllllllIIllIlIlIIIIIllIIIl;
        }
        
        private static void llIIllllIlIIllI() {
            (lIIlIlIIIIlIIl = new int[1])[0] = ((0x1B ^ 0x40) & ~(0xC7 ^ 0x9C));
        }
        
        static {
            llIIllllIlIIllI();
        }
        
        private static boolean llIIllllIlIlIlI(final int lllllllllllllIIllIlIlIIIIIIllllI) {
            return lllllllllllllIIllIlIlIIIIIIllllI != 0;
        }
        
        private static boolean llIIllllIlIlIII(final int lllllllllllllIIllIlIlIIIIIIlllII) {
            return lllllllllllllIIllIlIlIIIIIIlllII == 0;
        }
        
        @Override
        public void run() {
            if (llIIllllIlIlIII(this.ctx.channel().isOpen() ? 1 : 0)) {
                return;
            }
            final long lllllllllllllIIllIlIlIIIIIlIIlll = System.nanoTime();
            final long lllllllllllllIIllIlIlIIIIIlIIllI = Math.max(IdleStateHandler.this.lastReadTime, IdleStateHandler.this.lastWriteTime);
            final long lllllllllllllIIllIlIlIIIIIlIIlIl = IdleStateHandler.this.allIdleTimeNanos - (lllllllllllllIIllIlIlIIIIIlIIlll - lllllllllllllIIllIlIlIIIIIlIIllI);
            if (llIIllllIlIlIIl(llIIllllIlIIlll(lllllllllllllIIllIlIlIIIIIlIIlIl, 0L))) {
                IdleStateHandler.this.allIdleTimeout = this.ctx.executor().schedule((Runnable)this, IdleStateHandler.this.allIdleTimeNanos, TimeUnit.NANOSECONDS);
                try {
                    IdleStateEvent lllllllllllllIIllIlIlIIIIIlIlIlI = null;
                    if (llIIllllIlIlIlI(IdleStateHandler.this.firstAllIdleEvent ? 1 : 0)) {
                        IdleStateHandler.this.firstAllIdleEvent = (boolean)(AllIdleTimeoutTask.lIIlIlIIIIlIIl[0] != 0);
                        "".length();
                        final IdleStateEvent lllllllllllllIIllIlIlIIIIIlIlIll = IdleStateEvent.FIRST_ALL_IDLE_STATE_EVENT;
                        "".length();
                        if (-" ".length() >= (0x8D ^ 0x89)) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIllIlIlIIIIIlIlIlI = IdleStateEvent.ALL_IDLE_STATE_EVENT;
                    }
                    IdleStateHandler.this.channelIdle(this.ctx, lllllllllllllIIllIlIlIIIIIlIlIlI);
                    "".length();
                    if ("   ".length() <= ((0x86 ^ 0xB6 ^ (0xF2 ^ 0x8C)) & (0x6D ^ 0x4A ^ (0x32 ^ 0x5B) ^ -" ".length()))) {
                        return;
                    }
                    return;
                }
                catch (Throwable lllllllllllllIIllIlIlIIIIIlIlIIl) {
                    this.ctx.fireExceptionCaught(lllllllllllllIIllIlIlIIIIIlIlIIl);
                    "".length();
                    "".length();
                    if ((0xC0 ^ 0xC4) < -" ".length()) {
                        return;
                    }
                    return;
                }
            }
            IdleStateHandler.this.allIdleTimeout = this.ctx.executor().schedule((Runnable)this, lllllllllllllIIllIlIlIIIIIlIIlIl, TimeUnit.NANOSECONDS);
        }
    }
    
    private final class ReaderIdleTimeoutTask implements Runnable
    {
        private final /* synthetic */ ChannelHandlerContext ctx;
        private static final /* synthetic */ int[] lIlIlIIlIIIllI;
        
        private static boolean lllIllIIIIIlIll(final int lllllllllllllIIIlIlIIlIIlIIIlIII) {
            return lllllllllllllIIIlIlIIlIIlIIIlIII != 0;
        }
        
        ReaderIdleTimeoutTask(final ChannelHandlerContext lllllllllllllIIIlIlIIlIIlIIllllI) {
            this.ctx = lllllllllllllIIIlIlIIlIIlIIllllI;
        }
        
        private static boolean lllIllIIIIIlIlI(final int lllllllllllllIIIlIlIIlIIlIIIIlII) {
            return lllllllllllllIIIlIlIIlIIlIIIIlII <= 0;
        }
        
        private static int lllIllIIIIIlIII(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        @Override
        public void run() {
            if (lllIllIIIIIlIIl(this.ctx.channel().isOpen() ? 1 : 0)) {
                return;
            }
            final long lllllllllllllIIIlIlIIlIIlIIlIIIl = System.nanoTime();
            final long lllllllllllllIIIlIlIIlIIlIIlIIII = IdleStateHandler.this.lastReadTime;
            final long lllllllllllllIIIlIlIIlIIlIIIllll = IdleStateHandler.this.readerIdleTimeNanos - (lllllllllllllIIIlIlIIlIIlIIlIIIl - lllllllllllllIIIlIlIIlIIlIIlIIII);
            if (lllIllIIIIIlIlI(lllIllIIIIIlIII(lllllllllllllIIIlIlIIlIIlIIIllll, 0L))) {
                IdleStateHandler.this.readerIdleTimeout = this.ctx.executor().schedule((Runnable)this, IdleStateHandler.this.readerIdleTimeNanos, TimeUnit.NANOSECONDS);
                try {
                    IdleStateEvent lllllllllllllIIIlIlIIlIIlIIlIlII = null;
                    if (lllIllIIIIIlIll(IdleStateHandler.this.firstReaderIdleEvent ? 1 : 0)) {
                        IdleStateHandler.this.firstReaderIdleEvent = (boolean)(ReaderIdleTimeoutTask.lIlIlIIlIIIllI[0] != 0);
                        "".length();
                        final IdleStateEvent lllllllllllllIIIlIlIIlIIlIIlIlIl = IdleStateEvent.FIRST_READER_IDLE_STATE_EVENT;
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIlIlIIlIIlIIlIlII = IdleStateEvent.READER_IDLE_STATE_EVENT;
                    }
                    IdleStateHandler.this.channelIdle(this.ctx, lllllllllllllIIIlIlIIlIIlIIlIlII);
                    "".length();
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                    return;
                }
                catch (Throwable lllllllllllllIIIlIlIIlIIlIIlIIll) {
                    this.ctx.fireExceptionCaught(lllllllllllllIIIlIlIIlIIlIIlIIll);
                    "".length();
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    return;
                }
            }
            IdleStateHandler.this.readerIdleTimeout = this.ctx.executor().schedule((Runnable)this, lllllllllllllIIIlIlIIlIIlIIIllll, TimeUnit.NANOSECONDS);
        }
        
        private static void lllIllIIIIIIlll() {
            (lIlIlIIlIIIllI = new int[1])[0] = ((0x56 ^ 0x5C ^ (0xB9 ^ 0xA9)) & (0x11 ^ 0x37 ^ (0x22 ^ 0x1E) ^ -" ".length()));
        }
        
        private static boolean lllIllIIIIIlIIl(final int lllllllllllllIIIlIlIIlIIlIIIIllI) {
            return lllllllllllllIIIlIlIIlIIlIIIIllI == 0;
        }
        
        static {
            lllIllIIIIIIlll();
        }
    }
    
    private final class WriterIdleTimeoutTask implements Runnable
    {
        private static final /* synthetic */ int[] lIIlIlIlIIIIll;
        private final /* synthetic */ ChannelHandlerContext ctx;
        
        private static boolean llIlIIIIIlIlIIl(final int lllllllllllllIIllIlIIIIlIllIllII) {
            return lllllllllllllIIllIlIIIIlIllIllII <= 0;
        }
        
        private static boolean llIlIIIIIlIlIII(final int lllllllllllllIIllIlIIIIlIllIlllI) {
            return lllllllllllllIIllIlIIIIlIllIlllI == 0;
        }
        
        @Override
        public void run() {
            if (llIlIIIIIlIlIII(this.ctx.channel().isOpen() ? 1 : 0)) {
                return;
            }
            final long lllllllllllllIIllIlIIIIlIllllIIl = System.nanoTime();
            final long lllllllllllllIIllIlIIIIlIllllIII = IdleStateHandler.this.lastWriteTime;
            final long lllllllllllllIIllIlIIIIlIlllIlll = IdleStateHandler.this.writerIdleTimeNanos - (lllllllllllllIIllIlIIIIlIllllIIl - lllllllllllllIIllIlIIIIlIllllIII);
            if (llIlIIIIIlIlIIl(llIlIIIIIlIIlll(lllllllllllllIIllIlIIIIlIlllIlll, 0L))) {
                IdleStateHandler.this.writerIdleTimeout = this.ctx.executor().schedule((Runnable)this, IdleStateHandler.this.writerIdleTimeNanos, TimeUnit.NANOSECONDS);
                try {
                    IdleStateEvent lllllllllllllIIllIlIIIIlIlllllII = null;
                    if (llIlIIIIIlIlIlI(IdleStateHandler.this.firstWriterIdleEvent ? 1 : 0)) {
                        IdleStateHandler.this.firstWriterIdleEvent = (boolean)(WriterIdleTimeoutTask.lIIlIlIlIIIIll[0] != 0);
                        "".length();
                        final IdleStateEvent lllllllllllllIIllIlIIIIlIlllllIl = IdleStateEvent.FIRST_WRITER_IDLE_STATE_EVENT;
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIllIlIIIIlIlllllII = IdleStateEvent.WRITER_IDLE_STATE_EVENT;
                    }
                    IdleStateHandler.this.channelIdle(this.ctx, lllllllllllllIIllIlIIIIlIlllllII);
                    "".length();
                    if (((0xEA ^ 0xA7) & ~(0x5C ^ 0x11)) > "   ".length()) {
                        return;
                    }
                    return;
                }
                catch (Throwable lllllllllllllIIllIlIIIIlIllllIll) {
                    this.ctx.fireExceptionCaught(lllllllllllllIIllIlIIIIlIllllIll);
                    "".length();
                    "".length();
                    if (((0xE2 ^ 0xA3) & ~(0x57 ^ 0x16)) != 0x0) {
                        return;
                    }
                    return;
                }
            }
            IdleStateHandler.this.writerIdleTimeout = this.ctx.executor().schedule((Runnable)this, lllllllllllllIIllIlIIIIlIlllIlll, TimeUnit.NANOSECONDS);
        }
        
        private static void llIlIIIIIlIIllI() {
            (lIIlIlIlIIIIll = new int[1])[0] = ((0x9F ^ 0xA8 ^ (0xB0 ^ 0x8F)) & (0x46 ^ 0x5A ^ (0x39 ^ 0x2D) ^ -" ".length()));
        }
        
        static {
            llIlIIIIIlIIllI();
        }
        
        WriterIdleTimeoutTask(final ChannelHandlerContext lllllllllllllIIllIlIIIIllIIIIIll) {
            this.ctx = lllllllllllllIIllIlIIIIllIIIIIll;
        }
        
        private static int llIlIIIIIlIIlll(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean llIlIIIIIlIlIlI(final int lllllllllllllIIllIlIIIIlIlllIIII) {
            return lllllllllllllIIllIlIIIIlIlllIIII != 0;
        }
    }
}
