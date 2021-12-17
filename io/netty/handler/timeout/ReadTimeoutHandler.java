// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.ScheduledFuture;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ReadTimeoutHandler extends ChannelInboundHandlerAdapter
{
    private static final /* synthetic */ long MIN_TIMEOUT_NANOS;
    private volatile /* synthetic */ long lastReadTime;
    private volatile /* synthetic */ int state;
    private final /* synthetic */ long timeoutNanos;
    private volatile /* synthetic */ ScheduledFuture<?> timeout;
    private static final /* synthetic */ String[] llIIIIllIIlIIl;
    private static final /* synthetic */ int[] llIIIIllIllIll;
    private /* synthetic */ boolean closed;
    
    private static void lIIIlIIIIIlIIllI() {
        (llIIIIllIIlIIl = new String[ReadTimeoutHandler.llIIIIllIllIll[1]])[ReadTimeoutHandler.llIIIIllIllIll[0]] = lIIIlIIIIIlIIIll("HXOxjIr47TU=", "sKirJ");
    }
    
    protected void readTimedOut(final ChannelHandlerContext llllllllllllIlllIllIlIIlIlIlllII) throws Exception {
        if (lIIIlIIIIlIIlIII(this.closed ? 1 : 0)) {
            llllllllllllIlllIllIlIIlIlIlllII.fireExceptionCaught(ReadTimeoutException.INSTANCE);
            "".length();
            llllllllllllIlllIllIlIIlIlIlllII.close();
            "".length();
            this.closed = (ReadTimeoutHandler.llIIIIllIllIll[1] != 0);
        }
    }
    
    private static boolean lIIIlIIIIlIIIIll(final int llllllllllllIlllIllIlIIlIIlllIIl) {
        return llllllllllllIlllIllIlIIlIIlllIIl <= 0;
    }
    
    @Override
    public void channelRegistered(final ChannelHandlerContext llllllllllllIlllIllIlIIllIIIIIlI) throws Exception {
        if (lIIIlIIIIlIIIlII(llllllllllllIlllIllIlIIllIIIIIlI.channel().isActive() ? 1 : 0)) {
            this.initialize(llllllllllllIlllIllIlIIllIIIIIlI);
        }
        super.channelRegistered(llllllllllllIlllIllIlIIllIIIIIlI);
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIlllIllIlIIlIllIllll, final Object llllllllllllIlllIllIlIIlIllIlllI) throws Exception {
        this.lastReadTime = System.nanoTime();
        llllllllllllIlllIllIlIIlIllIllll.fireChannelRead(llllllllllllIlllIllIlIIlIllIlllI);
        "".length();
    }
    
    static {
        lIIIlIIIIIllllll();
        lIIIlIIIIIlIIllI();
        MIN_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(1L);
    }
    
    private static boolean lIIIlIIIIlIIlIII(final int llllllllllllIlllIllIlIIlIIlllIll) {
        return llllllllllllIlllIllIlIIlIIlllIll == 0;
    }
    
    private static void lIIIlIIIIIllllll() {
        (llIIIIllIllIll = new int[3])[0] = ((46 + 155 - 16 + 24 ^ 32 + 47 - 6 + 57) & (0x24 ^ 0x6C ^ (0xC ^ 0x17) ^ -" ".length()));
        ReadTimeoutHandler.llIIIIllIllIll[1] = " ".length();
        ReadTimeoutHandler.llIIIIllIllIll[2] = "  ".length();
    }
    
    private static boolean lIIIlIIIIlIIIllI(final int llllllllllllIlllIllIlIIlIIllIlll) {
        return llllllllllllIlllIllIlIIlIIllIlll > 0;
    }
    
    private static boolean lIIIlIIIIlIIIlII(final int llllllllllllIlllIllIlIIlIIllllIl) {
        return llllllllllllIlllIllIlIIlIIllllIl != 0;
    }
    
    private static int lIIIlIIIIlIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void initialize(final ChannelHandlerContext llllllllllllIlllIllIlIIlIllIIlll) {
        switch (this.state) {
            case 1:
            case 2: {}
            default: {
                this.state = ReadTimeoutHandler.llIIIIllIllIll[1];
                this.lastReadTime = System.nanoTime();
                if (lIIIlIIIIlIIIllI(lIIIlIIIIlIIIlIl(this.timeoutNanos, 0L))) {
                    this.timeout = llllllllllllIlllIllIlIIlIllIIlll.executor().schedule((Runnable)new ReadTimeoutTask(llllllllllllIlllIllIlIIlIllIIlll), this.timeoutNanos, TimeUnit.NANOSECONDS);
                }
            }
        }
    }
    
    private static boolean lIIIlIIIIlIIIIIl(final Object llllllllllllIlllIllIlIIlIIllllll) {
        return llllllllllllIlllIllIlIIlIIllllll == null;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlllIllIlIIlIlllIllI) throws Exception {
        this.destroy();
        super.channelInactive(llllllllllllIlllIllIlIIlIlllIllI);
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIlllIllIlIIlIlllllII) throws Exception {
        this.initialize(llllllllllllIlllIllIlIIlIlllllII);
        super.channelActive(llllllllllllIlllIllIlIIlIlllllII);
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext llllllllllllIlllIllIlIIllIIIIlll) throws Exception {
        this.destroy();
    }
    
    private static String lIIIlIIIIIlIIIll(final String llllllllllllIlllIllIlIIlIlIIIllI, final String llllllllllllIlllIllIlIIlIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIlIIlIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIlIIlIlIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIlIIlIlIIlIlI.init(ReadTimeoutHandler.llIIIIllIllIll[2], llllllllllllIlllIllIlIIlIlIIlIll);
            return new String(llllllllllllIlllIllIlIIlIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIlIIlIlIIlIIl) {
            llllllllllllIlllIllIlIIlIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private void destroy() {
        this.state = ReadTimeoutHandler.llIIIIllIllIll[2];
        if (lIIIlIIIIlIIIlll(this.timeout)) {
            this.timeout.cancel((boolean)(ReadTimeoutHandler.llIIIIllIllIll[0] != 0));
            "".length();
            this.timeout = null;
        }
    }
    
    private static boolean lIIIlIIIIlIIIlll(final Object llllllllllllIlllIllIlIIlIlIIIIIl) {
        return llllllllllllIlllIllIlIIlIlIIIIIl != null;
    }
    
    public ReadTimeoutHandler(final int llllllllllllIlllIllIlIIllIIllIIl) {
        this(llllllllllllIlllIllIlIIllIIllIIl, TimeUnit.SECONDS);
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIlllIllIlIIllIIIlIlI) throws Exception {
        if (lIIIlIIIIlIIIlII(llllllllllllIlllIllIlIIllIIIlIlI.channel().isActive() ? 1 : 0) && lIIIlIIIIlIIIlII(llllllllllllIlllIllIlIIllIIIlIlI.channel().isRegistered() ? 1 : 0)) {
            this.initialize(llllllllllllIlllIllIlIIllIIIlIlI);
        }
    }
    
    public ReadTimeoutHandler(final long llllllllllllIlllIllIlIIllIIlIIIl, final TimeUnit llllllllllllIlllIllIlIIllIIlIIII) {
        if (lIIIlIIIIlIIIIIl(llllllllllllIlllIllIlIIllIIlIIII)) {
            throw new NullPointerException(ReadTimeoutHandler.llIIIIllIIlIIl[ReadTimeoutHandler.llIIIIllIllIll[0]]);
        }
        if (lIIIlIIIIlIIIIll(lIIIlIIIIlIIIIII(llllllllllllIlllIllIlIIllIIlIIIl, 0L))) {
            this.timeoutNanos = 0L;
            "".length();
            if (((0x86 ^ 0x94) & ~(0x10 ^ 0x2)) <= -" ".length()) {
                throw null;
            }
        }
        else {
            this.timeoutNanos = Math.max(llllllllllllIlllIllIlIIllIIlIIII.toNanos(llllllllllllIlllIllIlIIllIIlIIIl), ReadTimeoutHandler.MIN_TIMEOUT_NANOS);
        }
    }
    
    private static int lIIIlIIIIlIIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private final class ReadTimeoutTask implements Runnable
    {
        private final /* synthetic */ ChannelHandlerContext ctx;
        
        ReadTimeoutTask(final ChannelHandlerContext lllllllllllllIIlIIIIIIllIllIIlIl) {
            this.ctx = lllllllllllllIIlIIIIIIllIllIIlIl;
        }
        
        private static boolean lllIIIlIIIIlIII(final int lllllllllllllIIlIIIIIIllIlIlIlIl) {
            return lllllllllllllIIlIIIIIIllIlIlIlIl <= 0;
        }
        
        @Override
        public void run() {
            if (lllIIIlIIIIIlll(this.ctx.channel().isOpen() ? 1 : 0)) {
                return;
            }
            final long lllllllllllllIIlIIIIIIllIlIllllI = System.nanoTime();
            final long lllllllllllllIIlIIIIIIllIlIlllIl = ReadTimeoutHandler.this.timeoutNanos - (lllllllllllllIIlIIIIIIllIlIllllI - ReadTimeoutHandler.this.lastReadTime);
            if (lllIIIlIIIIlIII(lllIIIlIIIIIllI(lllllllllllllIIlIIIIIIllIlIlllIl, 0L))) {
                ReadTimeoutHandler.this.timeout = this.ctx.executor().schedule((Runnable)this, ReadTimeoutHandler.this.timeoutNanos, TimeUnit.NANOSECONDS);
                "".length();
                try {
                    ReadTimeoutHandler.this.readTimedOut(this.ctx);
                    "".length();
                    if (((0xA ^ 0x4D) & ~(0x4C ^ 0xB)) > 0) {
                        return;
                    }
                    return;
                }
                catch (Throwable lllllllllllllIIlIIIIIIllIllIIIII) {
                    this.ctx.fireExceptionCaught(lllllllllllllIIlIIIIIIllIllIIIII);
                    "".length();
                    "".length();
                    if ("   ".length() < ((0x30 ^ 0x2F) & ~(0x33 ^ 0x2C))) {
                        return;
                    }
                    return;
                }
            }
            ReadTimeoutHandler.this.timeout = this.ctx.executor().schedule((Runnable)this, lllllllllllllIIlIIIIIIllIlIlllIl, TimeUnit.NANOSECONDS);
            "".length();
        }
        
        private static boolean lllIIIlIIIIIlll(final int lllllllllllllIIlIIIIIIllIlIlIlll) {
            return lllllllllllllIIlIIIIIIllIlIlIlll == 0;
        }
        
        private static int lllIIIlIIIIIllI(final long n, final long n2) {
            return lcmp(n, n2);
        }
    }
}
