// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import java.util.concurrent.ScheduledFuture;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class WriteTimeoutHandler extends ChannelOutboundHandlerAdapter
{
    private static final /* synthetic */ String[] lIlIIIIIlllIlI;
    private final /* synthetic */ long timeoutNanos;
    private /* synthetic */ boolean closed;
    private static final /* synthetic */ long MIN_TIMEOUT_NANOS;
    private static final /* synthetic */ int[] lIlIIIIIllllII;
    
    private static boolean lllIIIIlIIIIlll(final Object lllllllllllllIIlIIIIllIlIIllllII) {
        return lllllllllllllIIlIIIIllIlIIllllII == null;
    }
    
    private void scheduleTimeout(final ChannelHandlerContext lllllllllllllIIlIIIIllIlIllIIllI, final ChannelPromise lllllllllllllIIlIIIIllIlIlIllllI) {
        if (lllIIIIlIIIlIlI(lllIIIIlIIIlIIl(this.timeoutNanos, 0L))) {
            final ScheduledFuture<?> lllllllllllllIIlIIIIllIlIllIlIlI = lllllllllllllIIlIIIIllIlIllIIllI.executor().schedule((Runnable)new Runnable() {
                private static boolean lIllIIIllIIllll(final int lllllllllllllIlIlIIllIlIIIlIlllI) {
                    return lllllllllllllIlIlIIllIlIIIlIlllI == 0;
                }
                
                @Override
                public void run() {
                    if (lIllIIIllIIllll(lllllllllllllIIlIIIIllIlIlIllllI.isDone() ? 1 : 0)) {
                        try {
                            WriteTimeoutHandler.this.writeTimedOut(lllllllllllllIIlIIIIllIlIllIIllI);
                            "".length();
                            if (-"   ".length() > 0) {
                                return;
                            }
                        }
                        catch (Throwable lllllllllllllIlIlIIllIlIIIllIIll) {
                            lllllllllllllIIlIIIIllIlIllIIllI.fireExceptionCaught(lllllllllllllIlIlIIllIlIIIllIIll);
                            "".length();
                        }
                    }
                }
            }, this.timeoutNanos, TimeUnit.NANOSECONDS);
            lllllllllllllIIlIIIIllIlIlIllllI.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                private static final /* synthetic */ int[] llIllIIlllIIII;
                
                @Override
                public void operationComplete(final ChannelFuture llllllllllllIllIIlllIlllIIIlIlII) throws Exception {
                    lllllllllllllIIlIIIIllIlIllIlIlI.cancel((boolean)(WriteTimeoutHandler$2.llIllIIlllIIII[0] != 0));
                    "".length();
                }
                
                private static void lIIlIlllIIllIlll() {
                    (llIllIIlllIIII = new int[1])[0] = ((0x7A ^ 0x2C) & ~(0xF4 ^ 0xA2));
                }
                
                static {
                    lIIlIlllIIllIlll();
                }
            });
            "".length();
        }
    }
    
    protected void writeTimedOut(final ChannelHandlerContext lllllllllllllIIlIIIIllIlIlIlIlll) throws Exception {
        if (lllIIIIlIIIlIll(this.closed ? 1 : 0)) {
            lllllllllllllIIlIIIIllIlIlIlIlll.fireExceptionCaught(WriteTimeoutException.INSTANCE);
            "".length();
            lllllllllllllIIlIIIIllIlIlIlIlll.close();
            "".length();
            this.closed = (WriteTimeoutHandler.lIlIIIIIllllII[1] != 0);
        }
    }
    
    private static int lllIIIIlIIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public WriteTimeoutHandler(final int lllllllllllllIIlIIIIllIllIIlIlll) {
        this(lllllllllllllIIlIIIIllIllIIlIlll, TimeUnit.SECONDS);
    }
    
    private static boolean lllIIIIlIIIlIll(final int lllllllllllllIIlIIIIllIlIIlllIIl) {
        return lllllllllllllIIlIIIIllIlIIlllIIl == 0;
    }
    
    private static int lllIIIIlIIIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lllIIIIIllllIll() {
        (lIlIIIIIlllIlI = new String[WriteTimeoutHandler.lIlIIIIIllllII[1]])[WriteTimeoutHandler.lIlIIIIIllllII[0]] = lllIIIIIllllIlI("rL/OvmRi7D0=", "acKmm");
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIlIIIIllIlIlllllll, final Object lllllllllllllIIlIIIIllIlIlllllIl, final ChannelPromise lllllllllllllIIlIIIIllIlIllllIll) throws Exception {
        this.scheduleTimeout(lllllllllllllIIlIIIIllIlIlllllll, lllllllllllllIIlIIIIllIlIllllIll);
        lllllllllllllIIlIIIIllIlIlllllll.write(lllllllllllllIIlIIIIllIlIlllllIl, lllllllllllllIIlIIIIllIlIllllIll);
        "".length();
    }
    
    private static boolean lllIIIIlIIIlIII(final int lllllllllllllIIlIIIIllIlIIllIlll) {
        return lllllllllllllIIlIIIIllIlIIllIlll <= 0;
    }
    
    static {
        lllIIIIlIIIIlIl();
        lllIIIIIllllIll();
        MIN_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(1L);
    }
    
    private static void lllIIIIlIIIIlIl() {
        (lIlIIIIIllllII = new int[4])[0] = ((0x24 ^ 0x70 ^ (0x18 ^ 0x2F)) & (0x12 ^ 0x40 ^ (0xB2 ^ 0x83) ^ -" ".length()));
        WriteTimeoutHandler.lIlIIIIIllllII[1] = " ".length();
        WriteTimeoutHandler.lIlIIIIIllllII[2] = (0x1A ^ 0x12);
        WriteTimeoutHandler.lIlIIIIIllllII[3] = "  ".length();
    }
    
    private static boolean lllIIIIlIIIlIlI(final int lllllllllllllIIlIIIIllIlIIllIlII) {
        return lllllllllllllIIlIIIIllIlIIllIlII > 0;
    }
    
    public WriteTimeoutHandler(final long lllllllllllllIIlIIIIllIllIIIlIII, final TimeUnit lllllllllllllIIlIIIIllIllIIIlIlI) {
        if (lllIIIIlIIIIlll(lllllllllllllIIlIIIIllIllIIIlIlI)) {
            throw new NullPointerException(WriteTimeoutHandler.lIlIIIIIlllIlI[WriteTimeoutHandler.lIlIIIIIllllII[0]]);
        }
        if (lllIIIIlIIIlIII(lllIIIIlIIIIllI(lllllllllllllIIlIIIIllIllIIIlIII, 0L))) {
            this.timeoutNanos = 0L;
            "".length();
            if ("  ".length() < ((0x6E ^ 0x6B) & ~(0x97 ^ 0x92))) {
                throw null;
            }
        }
        else {
            this.timeoutNanos = Math.max(lllllllllllllIIlIIIIllIllIIIlIlI.toNanos(lllllllllllllIIlIIIIllIllIIIlIII), WriteTimeoutHandler.MIN_TIMEOUT_NANOS);
        }
    }
    
    private static String lllIIIIIllllIlI(final String lllllllllllllIIlIIIIllIlIlIIlIII, final String lllllllllllllIIlIIIIllIlIlIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllIlIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), WriteTimeoutHandler.lIlIIIIIllllII[2]), "DES");
            final Cipher lllllllllllllIIlIIIIllIlIlIIllll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIllIlIlIIllll.init(WriteTimeoutHandler.lIlIIIIIllllII[3], lllllllllllllIIlIIIIllIlIlIlIIIl);
            return new String(lllllllllllllIIlIIIIllIlIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllIlIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllIlIlIIllIl) {
            lllllllllllllIIlIIIIllIlIlIIllIl.printStackTrace();
            return null;
        }
    }
}
