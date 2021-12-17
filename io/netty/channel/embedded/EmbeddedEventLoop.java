// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.embedded;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.ChannelPromise;
import io.netty.channel.DefaultChannelPromise;
import io.netty.channel.ChannelFuture;
import io.netty.channel.Channel;
import io.netty.util.concurrent.EventExecutor;
import java.util.ArrayDeque;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import io.netty.util.concurrent.EventExecutorGroup;
import java.util.Queue;
import io.netty.channel.EventLoop;
import io.netty.util.concurrent.AbstractEventExecutor;

final class EmbeddedEventLoop extends AbstractEventExecutor implements EventLoop
{
    private static final /* synthetic */ int[] lllIlIllIlIIll;
    private static final /* synthetic */ String[] lllIlIllIlIIIl;
    private final /* synthetic */ Queue<Runnable> tasks;
    
    private static void lIlIIIllIlIIIllI() {
        (lllIlIllIlIIll = new int[3])[0] = "  ".length();
        EmbeddedEventLoop.lllIlIllIlIIll[1] = ((0xA4 ^ 0x91 ^ (0xCD ^ 0xBC)) & (192 + 211 - 204 + 18 ^ 81 + 135 - 79 + 20 ^ -" ".length()));
        EmbeddedEventLoop.lllIlIllIlIIll[2] = " ".length();
    }
    
    @Override
    public boolean inEventLoop() {
        return EmbeddedEventLoop.lllIlIllIlIIll[2] != 0;
    }
    
    @Override
    public Future<?> shutdownGracefully(final long llllllllllllIlIllIlIllIlIlllIIlI, final long llllllllllllIlIllIlIllIlIlllIIIl, final TimeUnit llllllllllllIlIllIlIllIlIlllIIII) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public EventLoop next() {
        return this;
    }
    
    private static void lIlIIIllIlIIIIlI() {
        (lllIlIllIlIIIl = new String[EmbeddedEventLoop.lllIlIllIlIIll[2]])[EmbeddedEventLoop.lllIlIllIlIIll[1]] = lIlIIIllIlIIIIIl("hNFqLBfxyLU=", "mvQXn");
    }
    
    @Override
    public void execute(final Runnable llllllllllllIlIllIlIllIlIllllIlI) {
        if (lIlIIIllIlIIIlll(llllllllllllIlIllIlIllIlIllllIlI)) {
            throw new NullPointerException(EmbeddedEventLoop.lllIlIllIlIIIl[EmbeddedEventLoop.lllIlIllIlIIll[1]]);
        }
        this.tasks.add(llllllllllllIlIllIlIllIlIllllIlI);
        "".length();
    }
    
    private static String lIlIIIllIlIIIIIl(final String llllllllllllIlIllIlIllIlIIlllllI, final String llllllllllllIlIllIlIllIlIIllllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIllIlIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIllIlIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIllIlIlIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIllIlIlIIIIII.init(EmbeddedEventLoop.lllIlIllIlIIll[0], llllllllllllIlIllIlIllIlIlIIIIIl);
            return new String(llllllllllllIlIllIlIllIlIlIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIllIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIllIlIIllllll) {
            llllllllllllIlIllIlIllIlIIllllll.printStackTrace();
            return null;
        }
    }
    
    EmbeddedEventLoop() {
        this.tasks = new ArrayDeque<Runnable>(EmbeddedEventLoop.lllIlIllIlIIll[0]);
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIlIllIlIllIlIlIllllI) {
        return this.register(llllllllllllIlIllIlIllIlIlIllllI, new DefaultChannelPromise(llllllllllllIlIllIlIllIlIlIllllI, this));
    }
    
    void runTasks() {
        do {
            final Runnable llllllllllllIlIllIlIllIlIlllIlll = this.tasks.poll();
            if (lIlIIIllIlIIIlll(llllllllllllIlIllIlIllIlIlllIlll)) {
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                llllllllllllIlIllIlIllIlIlllIlll.run();
                "".length();
            }
        } while (-" ".length() < " ".length());
    }
    
    static {
        lIlIIIllIlIIIllI();
        lIlIIIllIlIIIIlI();
    }
    
    private static boolean lIlIIIllIlIIIlll(final Object llllllllllllIlIllIlIllIlIIllIlll) {
        return llllllllllllIlIllIlIllIlIIllIlll == null;
    }
    
    @Override
    public EventLoopGroup parent() {
        return this;
    }
    
    @Deprecated
    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIlIllIlIllIlIlIlIllI, final ChannelPromise llllllllllllIlIllIlIllIlIlIllIII) {
        llllllllllllIlIllIlIllIlIlIlIllI.unsafe().register(this, llllllllllllIlIllIlIllIlIlIllIII);
        return llllllllllllIlIllIlIllIlIlIllIII;
    }
    
    @Override
    public boolean isShutdown() {
        return EmbeddedEventLoop.lllIlIllIlIIll[1] != 0;
    }
    
    @Override
    public boolean isTerminated() {
        return EmbeddedEventLoop.lllIlIllIlIIll[1] != 0;
    }
    
    @Override
    public boolean awaitTermination(final long llllllllllllIlIllIlIllIlIllIIlIl, final TimeUnit llllllllllllIlIllIlIllIlIllIIllI) throws InterruptedException {
        Thread.sleep(llllllllllllIlIllIlIllIlIllIIllI.toMillis(llllllllllllIlIllIlIllIlIllIIlIl));
        return EmbeddedEventLoop.lllIlIllIlIIll[1] != 0;
    }
    
    @Override
    public Future<?> terminationFuture() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isShuttingDown() {
        return EmbeddedEventLoop.lllIlIllIlIIll[1] != 0;
    }
    
    @Override
    public boolean inEventLoop(final Thread llllllllllllIlIllIlIllIlIlIlIIlI) {
        return EmbeddedEventLoop.lllIlIllIlIIll[2] != 0;
    }
}
