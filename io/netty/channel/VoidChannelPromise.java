// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.concurrent.TimeUnit;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.AbstractFuture;

final class VoidChannelPromise extends AbstractFuture<Void> implements ChannelPromise
{
    private static final /* synthetic */ String[] lIlIlIIIlIlIII;
    private static final /* synthetic */ int[] lIlIlIIIlIllII;
    private final /* synthetic */ boolean fireException;
    private final /* synthetic */ Channel channel;
    
    @Override
    public boolean isCancellable() {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public VoidChannelPromise addListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIIIlIlIlIllIIIIIllI) {
        fail();
        return this;
    }
    
    @Override
    public boolean awaitUninterruptibly(final long lllllllllllllIIIlIlIlIlIlllIllIl) {
        fail();
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    private static void lllIlIlllIIIllI() {
        (lIlIlIIIlIllII = new int[3])[0] = ((0xB4 ^ 0x9C ^ (0x3 ^ 0x31)) & (0x3C ^ 0x15 ^ (0xB1 ^ 0x82) ^ -" ".length()));
        VoidChannelPromise.lIlIlIIIlIllII[1] = " ".length();
        VoidChannelPromise.lIlIlIIIlIllII[2] = "  ".length();
    }
    
    @Override
    public VoidChannelPromise removeListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIIIlIlIlIlIlllllllI) {
        return this;
    }
    
    @Override
    public boolean isCancelled() {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    private static String lllIlIllIllllIl(String lllllllllllllIIIlIlIlIIllllllIll, final String lllllllllllllIIIlIlIlIIlllllllll) {
        lllllllllllllIIIlIlIlIIllllllIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIlIIllllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIlIIllllllllI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIlIIlllllllIl = lllllllllllllIIIlIlIlIIlllllllll.toCharArray();
        int lllllllllllllIIIlIlIlIIlllllllII = VoidChannelPromise.lIlIlIIIlIllII[0];
        final char lllllllllllllIIIlIlIlIIlllllIllI = (Object)((String)lllllllllllllIIIlIlIlIIllllllIll).toCharArray();
        final char lllllllllllllIIIlIlIlIIlllllIlIl = (char)lllllllllllllIIIlIlIlIIlllllIllI.length;
        short lllllllllllllIIIlIlIlIIlllllIlII = (short)VoidChannelPromise.lIlIlIIIlIllII[0];
        while (lllIlIlllIIlIIl(lllllllllllllIIIlIlIlIIlllllIlII, lllllllllllllIIIlIlIlIIlllllIlIl)) {
            final char lllllllllllllIIIlIlIlIlIIIIIIIIl = lllllllllllllIIIlIlIlIIlllllIllI[lllllllllllllIIIlIlIlIIlllllIlII];
            lllllllllllllIIIlIlIlIIllllllllI.append((char)(lllllllllllllIIIlIlIlIlIIIIIIIIl ^ lllllllllllllIIIlIlIlIIlllllllIl[lllllllllllllIIIlIlIlIIlllllllII % lllllllllllllIIIlIlIlIIlllllllIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIlIIlllllllII;
            ++lllllllllllllIIIlIlIlIIlllllIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIlIIllllllllI);
    }
    
    @Override
    public boolean tryFailure(final Throwable lllllllllllllIIIlIlIlIlIllIIllll) {
        this.fireException(lllllllllllllIIIlIlIlIlIllIIllll);
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public boolean await(final long lllllllllllllIIIlIlIlIlIlllllIII, final TimeUnit lllllllllllllIIIlIlIlIlIllllIlll) {
        fail();
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    private static void fail() {
        throw new IllegalStateException(VoidChannelPromise.lIlIlIIIlIlIII[VoidChannelPromise.lIlIlIIIlIllII[1]]);
    }
    
    @Override
    public boolean trySuccess() {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public VoidChannelPromise addListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIIIlIlIlIllIIIIlIlI) {
        fail();
        return this;
    }
    
    @Override
    public VoidChannelPromise sync() {
        fail();
        return this;
    }
    
    @Override
    public VoidChannelPromise setSuccess() {
        return this;
    }
    
    private static void lllIlIllIlllllI() {
        (lIlIlIIIlIlIII = new String[VoidChannelPromise.lIlIlIIIlIllII[2]])[VoidChannelPromise.lIlIlIIIlIllII[0]] = lllIlIllIllllIl("CwsWKTwNDw==", "hcwGR");
        VoidChannelPromise.lIlIlIIIlIlIII[VoidChannelPromise.lIlIlIIIlIllII[1]] = lllIlIllIllllIl("JConAmI0MDoTMDc=", "RENfB");
    }
    
    @Override
    public boolean awaitUninterruptibly(final long lllllllllllllIIIlIlIlIlIllllIIII, final TimeUnit lllllllllllllIIIlIlIlIlIlllIllll) {
        fail();
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public VoidChannelPromise removeListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIIIlIlIlIllIIIIIIlI) {
        return this;
    }
    
    private void fireException(final Throwable lllllllllllllIIIlIlIlIlIlIllllll) {
        if (lllIlIlllIIlIII(this.fireException ? 1 : 0) && lllIlIlllIIlIII(this.channel.isRegistered() ? 1 : 0)) {
            this.channel.pipeline().fireExceptionCaught(lllllllllllllIIIlIlIlIlIlIllllll);
            "".length();
        }
    }
    
    @Override
    public VoidChannelPromise await() throws InterruptedException {
        if (lllIlIlllIIlIII(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        return this;
    }
    
    @Override
    public Throwable cause() {
        return null;
    }
    
    @Override
    public boolean await(final long lllllllllllllIIIlIlIlIlIllllIlIl) {
        fail();
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    private static boolean lllIlIlllIIIlll(final Object lllllllllllllIIIlIlIlIIllllIllIl) {
        return lllllllllllllIIIlIlIlIIllllIllIl == null;
    }
    
    static {
        lllIlIlllIIIllI();
        lllIlIllIlllllI();
    }
    
    @Override
    public Void getNow() {
        return null;
    }
    
    @Override
    public VoidChannelPromise syncUninterruptibly() {
        fail();
        return this;
    }
    
    private static boolean lllIlIlllIIlIIl(final int lllllllllllllIIIlIlIlIIlllllIIII, final int lllllllllllllIIIlIlIlIIllllIllll) {
        return lllllllllllllIIIlIlIlIIlllllIIII < lllllllllllllIIIlIlIlIIllllIllll;
    }
    
    @Override
    public VoidChannelPromise awaitUninterruptibly() {
        fail();
        return this;
    }
    
    private static boolean lllIlIlllIIlIII(final int lllllllllllllIIIlIlIlIIllllIlIll) {
        return lllllllllllllIIIlIlIlIIllllIlIll != 0;
    }
    
    @Override
    public boolean setUncancellable() {
        return VoidChannelPromise.lIlIlIIIlIllII[1] != 0;
    }
    
    @Override
    public VoidChannelPromise setSuccess(final Void lllllllllllllIIIlIlIlIlIllIIlIIl) {
        return this;
    }
    
    @Override
    public boolean isDone() {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public boolean cancel(final boolean lllllllllllllIIIlIlIlIlIllIIllIl) {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public boolean trySuccess(final Void lllllllllllllIIIlIlIlIlIllIIIllI) {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    VoidChannelPromise(final Channel lllllllllllllIIIlIlIlIllIIIIlllI, final boolean lllllllllllllIIIlIlIlIllIIIIllIl) {
        if (lllIlIlllIIIlll(lllllllllllllIIIlIlIlIllIIIIlllI)) {
            throw new NullPointerException(VoidChannelPromise.lIlIlIIIlIlIII[VoidChannelPromise.lIlIlIIIlIllII[0]]);
        }
        this.channel = lllllllllllllIIIlIlIlIllIIIIlllI;
        this.fireException = lllllllllllllIIIlIlIlIllIIIIllIl;
    }
    
    @Override
    public boolean isSuccess() {
        return VoidChannelPromise.lIlIlIIIlIllII[0] != 0;
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    @Override
    public VoidChannelPromise setFailure(final Throwable lllllllllllllIIIlIlIlIlIllIllIlI) {
        this.fireException(lllllllllllllIIIlIlIlIlIllIllIlI);
        return this;
    }
}
