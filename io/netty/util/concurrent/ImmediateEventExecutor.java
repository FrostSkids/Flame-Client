// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

public final class ImmediateEventExecutor extends AbstractEventExecutor
{
    private static final /* synthetic */ String[] lIlIllllllIIll;
    private final /* synthetic */ Future<?> terminationFuture;
    private static final /* synthetic */ int[] lIlIllllllIlII;
    
    private static void llllIlIllIIIIIl() {
        (lIlIllllllIIll = new String[ImmediateEventExecutor.lIlIllllllIlII[0]])[ImmediateEventExecutor.lIlIllllllIlII[1]] = llllIlIllIIIIII("OQoENy00AQ==", "ZeiZL");
    }
    
    @Override
    public void execute(final Runnable lllllllllllllIIIIlIIlIlllIIlIlll) {
        if (llllIlIllIIIIll(lllllllllllllIIIIlIIlIlllIIlIlll)) {
            throw new NullPointerException(ImmediateEventExecutor.lIlIllllllIIll[ImmediateEventExecutor.lIlIllllllIlII[1]]);
        }
        lllllllllllllIIIIlIIlIlllIIlIlll.run();
    }
    
    @Override
    public boolean inEventLoop(final Thread lllllllllllllIIIIlIIlIlllIlIlIll) {
        return ImmediateEventExecutor.lIlIllllllIlII[0] != 0;
    }
    
    @Override
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }
    
    @Override
    public <V> Promise<V> newPromise() {
        return new ImmediatePromise<V>(this);
    }
    
    private static boolean llllIlIllIIIlII(final int lllllllllllllIIIIlIIlIllIlllIllI, final int lllllllllllllIIIIlIIlIllIlllIlIl) {
        return lllllllllllllIIIIlIIlIllIlllIllI < lllllllllllllIIIIlIIlIllIlllIlIl;
    }
    
    @Override
    public boolean isTerminated() {
        return ImmediateEventExecutor.lIlIllllllIlII[1] != 0;
    }
    
    private static boolean llllIlIllIIIIll(final Object lllllllllllllIIIIlIIlIllIlllIIll) {
        return lllllllllllllIIIIlIIlIllIlllIIll == null;
    }
    
    @Deprecated
    @Override
    public void shutdown() {
    }
    
    @Override
    public boolean inEventLoop() {
        return ImmediateEventExecutor.lIlIllllllIlII[0] != 0;
    }
    
    @Override
    public boolean awaitTermination(final long lllllllllllllIIIIlIIlIlllIIlllII, final TimeUnit lllllllllllllIIIIlIIlIlllIIllIll) {
        return ImmediateEventExecutor.lIlIllllllIlII[1] != 0;
    }
    
    @Override
    public <V> ProgressivePromise<V> newProgressivePromise() {
        return new ImmediateProgressivePromise<V>(this);
    }
    
    static {
        llllIlIllIIIIlI();
        llllIlIllIIIIIl();
        INSTANCE = new ImmediateEventExecutor();
    }
    
    @Override
    public boolean isShuttingDown() {
        return ImmediateEventExecutor.lIlIllllllIlII[1] != 0;
    }
    
    private static String llllIlIllIIIIII(String lllllllllllllIIIIlIIlIlllIIIIIIl, final String lllllllllllllIIIIlIIlIlllIIIIIII) {
        lllllllllllllIIIIlIIlIlllIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIlllIIIIlII = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIlllIIIIIll = lllllllllllllIIIIlIIlIlllIIIIIII.toCharArray();
        int lllllllllllllIIIIlIIlIlllIIIIIlI = ImmediateEventExecutor.lIlIllllllIlII[1];
        final double lllllllllllllIIIIlIIlIllIlllllII = (Object)lllllllllllllIIIIlIIlIlllIIIIIIl.toCharArray();
        final float lllllllllllllIIIIlIIlIllIllllIll = lllllllllllllIIIIlIIlIllIlllllII.length;
        Exception lllllllllllllIIIIlIIlIllIllllIlI = (Exception)ImmediateEventExecutor.lIlIllllllIlII[1];
        while (llllIlIllIIIlII((int)lllllllllllllIIIIlIIlIllIllllIlI, (int)lllllllllllllIIIIlIIlIllIllllIll)) {
            final char lllllllllllllIIIIlIIlIlllIIIIlll = lllllllllllllIIIIlIIlIllIlllllII[lllllllllllllIIIIlIIlIllIllllIlI];
            lllllllllllllIIIIlIIlIlllIIIIlII.append((char)(lllllllllllllIIIIlIIlIlllIIIIlll ^ lllllllllllllIIIIlIIlIlllIIIIIll[lllllllllllllIIIIlIIlIlllIIIIIlI % lllllllllllllIIIIlIIlIlllIIIIIll.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIlllIIIIIlI;
            ++lllllllllllllIIIIlIIlIllIllllIlI;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIlllIIIIlII);
    }
    
    private static void llllIlIllIIIIlI() {
        (lIlIllllllIlII = new int[2])[0] = " ".length();
        ImmediateEventExecutor.lIlIllllllIlII[1] = ((0x14 ^ 0x6) & ~(0xD0 ^ 0xC2));
    }
    
    @Override
    public EventExecutorGroup parent() {
        return null;
    }
    
    @Override
    public boolean isShutdown() {
        return ImmediateEventExecutor.lIlIllllllIlII[1] != 0;
    }
    
    @Override
    public Future<?> shutdownGracefully(final long lllllllllllllIIIIlIIlIlllIlIlIII, final long lllllllllllllIIIIlIIlIlllIlIIlll, final TimeUnit lllllllllllllIIIIlIIlIlllIlIIllI) {
        return this.terminationFuture();
    }
    
    private ImmediateEventExecutor() {
        this.terminationFuture = new FailedFuture<Object>(GlobalEventExecutor.INSTANCE, new UnsupportedOperationException());
    }
    
    static class ImmediatePromise<V> extends DefaultPromise<V>
    {
        ImmediatePromise(final EventExecutor lllllllllllllIIlIlIIIlIIIIlllIlI) {
            super(lllllllllllllIIlIlIIIlIIIIlllIlI);
        }
        
        @Override
        protected void checkDeadLock() {
        }
    }
    
    static class ImmediateProgressivePromise<V> extends DefaultProgressivePromise<V>
    {
        ImmediateProgressivePromise(final EventExecutor llllllllllllIllIlIllIIllllIlllIl) {
            super(llllllllllllIllIlIllIIllllIlllIl);
        }
        
        @Override
        protected void checkDeadLock() {
        }
    }
}
