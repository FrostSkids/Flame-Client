// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.internal.RecyclableMpscLinkedQueueNode;
import io.netty.util.Recycler;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.ByteBufAllocator;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.ReferenceCountUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.net.SocketAddress;
import io.netty.util.internal.OneTimeTask;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.DefaultAttributeMap;

abstract class AbstractChannelHandlerContext extends DefaultAttributeMap implements ChannelHandlerContext
{
    volatile /* synthetic */ AbstractChannelHandlerContext prev;
    private volatile /* synthetic */ Runnable invokeFlushTask;
    private static final /* synthetic */ int[] llllIlIllIlIl;
    private static final /* synthetic */ String[] llllIlIlIIllI;
    volatile /* synthetic */ AbstractChannelHandlerContext next;
    private /* synthetic */ ChannelFuture succeededFuture;
    private final /* synthetic */ DefaultChannelPipeline pipeline;
    private volatile /* synthetic */ Runnable invokeChannelReadCompleteTask;
    private /* synthetic */ boolean removed;
    private volatile /* synthetic */ Runnable invokeChannelWritableStateChangedTask;
    private final /* synthetic */ AbstractChannel channel;
    private final /* synthetic */ boolean outbound;
    private final /* synthetic */ boolean inbound;
    final /* synthetic */ EventExecutor executor;
    private volatile /* synthetic */ Runnable invokeReadTask;
    private final /* synthetic */ String name;
    
    @Override
    public ChannelHandlerContext fireChannelInactive() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIIIlIIll = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIlllIIIlIIlI = lllllllllllllIlIllIlIlllIIIlIIll.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlllIIIlIIlI.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlllIIIlIIll.invokeChannelInactive();
            "".length();
            if (-(6 + 25 - 6 + 138 ^ 148 + 12 - 157 + 163) >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIlllIIIlIIlI.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeChannelInactive();
                }
            });
        }
        return this;
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress lllllllllllllIlIllIlIllIIlIIIIIl, final ChannelPromise lllllllllllllIlIllIlIllIIlIIIIII) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIIlIIIIIl)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[7]]);
        }
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIllIIlIIIIII, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0)) ? 1 : 0)) {
            return lllllllllllllIlIllIlIllIIlIIIIII;
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIIIllllll = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIllIIIlllllI = lllllllllllllIlIllIlIllIIIllllll.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIIIlllllI.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIIIllllll.invokeBind(lllllllllllllIlIllIlIllIIlIIIIIl, lllllllllllllIlIllIlIllIIlIIIIII);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            safeExecute(lllllllllllllIlIllIlIllIIIlllllI, new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeBind(lllllllllllllIlIllIlIllIIlIIIIIl, lllllllllllllIlIllIlIllIIlIIIIII);
                }
            }, lllllllllllllIlIllIlIllIIlIIIIII, null);
        }
        return lllllllllllllIlIllIlIllIIlIIIIII;
    }
    
    private void invokeChannelInactive() {
        try {
            ((ChannelInboundHandler)this.handler()).channelInactive(this);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlllIIIIllII) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlllIIIIllII);
        }
    }
    
    @Override
    public ChannelHandlerContext fireUserEventTriggered(final Object lllllllllllllIlIllIlIllIlllIIIll) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIlllIIIll)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[5]]);
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIlllIIIIl = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIllIllIlllll = lllllllllllllIlIllIlIllIlllIIIIl.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIllIlllll.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIlllIIIIl.invokeUserEventTriggered(lllllllllllllIlIllIlIllIlllIIIll);
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIllIllIlllll.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeUserEventTriggered(lllllllllllllIlIllIlIllIlllIIIll);
                }
            });
        }
        return this;
    }
    
    private static boolean lIlIlIlIlIllIlI(final int lllllllllllllIlIllIlIlIIIlIlIlll) {
        return lllllllllllllIlIllIlIlIIIlIlIlll == 0;
    }
    
    private void invokeChannelActive() {
        try {
            ((ChannelInboundHandler)this.handler()).channelActive(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlllIIIllIll) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlllIIIllIll);
        }
    }
    
    @Override
    public ChannelFuture newSucceededFuture() {
        ChannelFuture lllllllllllllIlIllIlIlIlIIllIlII = this.succeededFuture;
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIlIIllIlII)) {
            lllllllllllllIlIllIlIlIlIIllIlII = (this.succeededFuture = new SucceededChannelFuture(this.channel(), this.executor()));
        }
        return lllllllllllllIlIllIlIlIlIIllIlII;
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIlIllIlIllIIIlIIlIl, final ChannelPromise lllllllllllllIlIllIlIllIIIlIIlll) {
        return this.connect(lllllllllllllIlIllIlIllIIIlIIlIl, null, lllllllllllllIlIllIlIllIIIlIIlll);
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIlIllIlIllIIlIlllII) {
        return this.connect(lllllllllllllIlIllIlIllIIlIlllII, this.newPromise());
    }
    
    @Override
    public ChannelFuture newFailedFuture(final Throwable lllllllllllllIlIllIlIlIlIIlIllII) {
        return new FailedChannelFuture(this.channel(), this.executor(), lllllllllllllIlIllIlIlIlIIlIllII);
    }
    
    private AbstractChannelHandlerContext findContextInbound() {
        AbstractChannelHandlerContext lllllllllllllIlIllIlIlIlIIIlllll = this;
        do {
            lllllllllllllIlIllIlIlIlIIIlllll = lllllllllllllIlIllIlIlIlIIIlllll.next;
        } while (!lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIIIlllll.inbound ? 1 : 0));
        return lllllllllllllIlIllIlIlIlIIIlllll;
    }
    
    void setRemoved() {
        this.removed = (AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0);
    }
    
    private static String lIlIlIlIIlllIll(String lllllllllllllIlIllIlIlIIlIIIIIII, final String lllllllllllllIlIllIlIlIIIlllllll) {
        lllllllllllllIlIllIlIlIIlIIIIIII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIlIlIIlIIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIlIIlIIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIllIlIlIIlIIIIIlI = lllllllllllllIlIllIlIlIIIlllllll.toCharArray();
        int lllllllllllllIlIllIlIlIIlIIIIIIl = AbstractChannelHandlerContext.llllIlIllIlIl[0];
        final Exception lllllllllllllIlIllIlIlIIIllllIll = (Object)((String)lllllllllllllIlIllIlIlIIlIIIIIII).toCharArray();
        final short lllllllllllllIlIllIlIlIIIllllIlI = (short)lllllllllllllIlIllIlIlIIIllllIll.length;
        int lllllllllllllIlIllIlIlIIIllllIIl = AbstractChannelHandlerContext.llllIlIllIlIl[0];
        while (lIlIlIlIlIlllII(lllllllllllllIlIllIlIlIIIllllIIl, lllllllllllllIlIllIlIlIIIllllIlI)) {
            final char lllllllllllllIlIllIlIlIIlIIIIllI = lllllllllllllIlIllIlIlIIIllllIll[lllllllllllllIlIllIlIlIIIllllIIl];
            lllllllllllllIlIllIlIlIIlIIIIIll.append((char)(lllllllllllllIlIllIlIlIIlIIIIllI ^ lllllllllllllIlIllIlIlIIlIIIIIlI[lllllllllllllIlIllIlIlIIlIIIIIIl % lllllllllllllIlIllIlIlIIlIIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIllIlIlIIlIIIIIIl;
            ++lllllllllllllIlIllIlIlIIIllllIIl;
            "".length();
            if ((0x5 ^ 0x1) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIlIIlIIIIIll);
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIlIllIlIllIIlIlIIlI, final SocketAddress lllllllllllllIlIllIlIllIIlIlIlII) {
        return this.connect(lllllllllllllIlIllIlIllIIlIlIIlI, lllllllllllllIlIllIlIllIIlIlIlII, this.newPromise());
    }
    
    private void invokeDisconnect(final ChannelPromise lllllllllllllIlIllIlIlIlllllIIIl) {
        try {
            ((ChannelOutboundHandler)this.handler()).disconnect(this, lllllllllllllIlIllIlIlIlllllIIIl);
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIlllllIIll) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIlIlllllIIll, lllllllllllllIlIllIlIlIlllllIIIl);
        }
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    @Override
    public ChannelHandlerContext fireChannelRead(final Object lllllllllllllIlIllIlIllIlIlllIII) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIlIlllIII)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[6]]);
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIlIlllIll = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIllIlIlllIlI = lllllllllllllIlIllIlIllIlIlllIll.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIlIlllIlI.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIlIlllIll.invokeChannelRead(lllllllllllllIlIllIlIllIlIlllIII);
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIllIlIlllIlI.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeChannelRead(lllllllllllllIlIllIlIllIlIlllIII);
                }
            });
        }
        return this;
    }
    
    private static boolean lIlIlIlIlIlllII(final int lllllllllllllIlIllIlIlIIIllIlIII, final int lllllllllllllIlIllIlIlIIIllIIlll) {
        return lllllllllllllIlIllIlIlIIIllIlIII < lllllllllllllIlIllIlIlIIIllIIlll;
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object lllllllllllllIlIllIlIlIlIlllllIl, final ChannelPromise lllllllllllllIlIllIlIlIlIlllllll) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIlIlllllIl)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[10]]);
        }
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIlIlIlllllll, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0)) ? 1 : 0)) {
            ReferenceCountUtil.release(lllllllllllllIlIllIlIlIlIlllllIl);
            "".length();
            return lllllllllllllIlIllIlIlIlIlllllll;
        }
        this.write(lllllllllllllIlIllIlIlIlIlllllIl, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0), lllllllllllllIlIllIlIlIlIlllllll);
        return lllllllllllllIlIllIlIlIlIlllllll;
    }
    
    private static boolean inExceptionCaught(Throwable lllllllllllllIlIllIlIlIlIlIIIIll) {
        do {
            final StackTraceElement[] lllllllllllllIlIllIlIlIlIlIIIlIl = lllllllllllllIlIllIlIlIlIlIIIIll.getStackTrace();
            if (lIlIlIlIlIllIII(lllllllllllllIlIllIlIlIlIlIIIlIl)) {
                final StackTraceElement[] lllllllllllllIlIllIlIlIlIlIIlIII = lllllllllllllIlIllIlIlIlIlIIIlIl;
                final int lllllllllllllIlIllIlIlIlIlIIIlll = lllllllllllllIlIllIlIlIlIlIIlIII.length;
                int lllllllllllllIlIllIlIlIlIlIIIllI = AbstractChannelHandlerContext.llllIlIllIlIl[0];
                while (lIlIlIlIlIlllII(lllllllllllllIlIllIlIlIlIlIIIllI, lllllllllllllIlIllIlIlIlIlIIIlll)) {
                    final StackTraceElement lllllllllllllIlIllIlIlIlIlIIlIIl = lllllllllllllIlIllIlIlIlIlIIlIII[lllllllllllllIlIllIlIlIlIlIIIllI];
                    if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIlIlIIlIIl)) {
                        "".length();
                        if (" ".length() <= 0) {
                            return ((0x4C ^ 0x2) & ~(0x68 ^ 0x26)) != 0x0;
                        }
                        break;
                    }
                    else {
                        if (lIlIlIlIlIllIIl(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[13]].equals(lllllllllllllIlIllIlIlIlIlIIlIIl.getMethodName()) ? 1 : 0)) {
                            return AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0;
                        }
                        ++lllllllllllllIlIllIlIlIlIlIIIllI;
                        "".length();
                        if (-(0xC2 ^ 0xC6) > 0) {
                            return ((0x2C ^ 0x20) & ~(0x6B ^ 0x67)) != 0x0;
                        }
                        continue;
                    }
                }
            }
            lllllllllllllIlIllIlIlIlIlIIIIll = lllllllllllllIlIllIlIlIlIlIIIIll.getCause();
        } while (!lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIlIlIIIIll));
        return AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0;
    }
    
    AbstractChannelHandlerContext(final DefaultChannelPipeline lllllllllllllIlIllIlIlllIllIlIIl, final EventExecutorGroup lllllllllllllIlIllIlIlllIllIlllI, final String lllllllllllllIlIllIlIlllIllIllIl, final boolean lllllllllllllIlIllIlIlllIllIllII, final boolean lllllllllllllIlIllIlIlllIllIIlIl) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlllIllIllIl)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[0]]);
        }
        this.channel = lllllllllllllIlIllIlIlllIllIlIIl.channel;
        this.pipeline = lllllllllllllIlIllIlIlllIllIlIIl;
        this.name = lllllllllllllIlIllIlIlllIllIllIl;
        if (lIlIlIlIlIllIII(lllllllllllllIlIllIlIlllIllIlllI)) {
            EventExecutor lllllllllllllIlIllIlIlllIlllIIIl = lllllllllllllIlIllIlIlllIllIlIIl.childExecutors.get(lllllllllllllIlIllIlIlllIllIlllI);
            if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlllIlllIIIl)) {
                lllllllllllllIlIllIlIlllIlllIIIl = lllllllllllllIlIllIlIlllIllIlllI.next();
                lllllllllllllIlIllIlIlllIllIlIIl.childExecutors.put(lllllllllllllIlIllIlIlllIllIlllI, lllllllllllllIlIllIlIlllIlllIIIl);
                "".length();
            }
            this.executor = lllllllllllllIlIllIlIlllIlllIIIl;
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        else {
            this.executor = null;
        }
        this.inbound = lllllllllllllIlIllIlIlllIllIllII;
        this.outbound = lllllllllllllIlIllIlIlllIllIIlIl;
    }
    
    private static boolean lIlIlIlIlIllIII(final Object lllllllllllllIlIllIlIlIIIllIIIIl) {
        return lllllllllllllIlIllIlIlIIIllIIIIl != null;
    }
    
    @Override
    public String name() {
        return this.name;
    }
    
    private static String lIlIlIlIIllllII(final String lllllllllllllIlIllIlIlIIIlllIIII, final String lllllllllllllIlIllIlIlIIIllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIlIIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIlIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIlIIIlllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIlIIIlllIIlI.init(AbstractChannelHandlerContext.llllIlIllIlIl[2], lllllllllllllIlIllIlIlIIIlllIIll);
            return new String(lllllllllllllIlIllIlIlIIIlllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIlIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIlIIIlllIIIl) {
            lllllllllllllIlIllIlIlIIIlllIIIl.printStackTrace();
            return null;
        }
    }
    
    private void invokeChannelRead(final Object lllllllllllllIlIllIlIllIlIlIIllI) {
        try {
            ((ChannelInboundHandler)this.handler()).channelRead(this, lllllllllllllIlIllIlIllIlIlIIllI);
            "".length();
            if (" ".length() > (139 + 153 - 127 + 22 ^ 137 + 45 - 181 + 190)) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIlIlIlIIl) {
            this.notifyHandlerException(lllllllllllllIlIllIlIllIlIlIlIIl);
        }
    }
    
    @Override
    public ChannelHandlerContext fireChannelActive() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIIlIIIlI = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIlllIIlIIIIl = lllllllllllllIlIllIlIlllIIlIIIlI.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlllIIlIIIIl.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlllIIlIIIlI.invokeChannelActive();
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIlllIIlIIIIl.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeChannelActive();
                }
            });
        }
        return this;
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIlIllIlIllIIIIlllII, final SocketAddress lllllllllllllIlIllIlIllIIIIllIll, final ChannelPromise lllllllllllllIlIllIlIllIIIIllIlI) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIIIIlllII)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[8]]);
        }
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIllIIIIllIlI, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0)) ? 1 : 0)) {
            return lllllllllllllIlIllIlIllIIIIllIlI;
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIIIIllIIl = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIllIIIIllIII = lllllllllllllIlIllIlIllIIIIllIIl.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIIIIllIII.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIIIIllIIl.invokeConnect(lllllllllllllIlIllIlIllIIIIlllII, lllllllllllllIlIllIlIllIIIIllIll, lllllllllllllIlIllIlIllIIIIllIlI);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            safeExecute(lllllllllllllIlIllIlIllIIIIllIII, new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeConnect(lllllllllllllIlIllIlIllIIIIlllII, lllllllllllllIlIllIlIllIIIIllIll, lllllllllllllIlIllIlIllIIIIllIlI);
                }
            }, lllllllllllllIlIllIlIllIIIIllIlI, null);
        }
        return lllllllllllllIlIllIlIllIIIIllIlI;
    }
    
    private static boolean lIlIlIlIlIlIlll(final Object lllllllllllllIlIllIlIlIIIlIllIll) {
        return lllllllllllllIlIllIlIlIIIlIllIll == null;
    }
    
    private static boolean lIlIlIlIlIllllI(final Object lllllllllllllIlIllIlIlIIIlIllllI, final Object lllllllllllllIlIllIlIlIIIlIlllIl) {
        return lllllllllllllIlIllIlIlIIIlIllllI == lllllllllllllIlIllIlIlIIIlIlllIl;
    }
    
    @Override
    public ChannelFuture disconnect(final ChannelPromise lllllllllllllIlIllIlIlIlllllllIl) {
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIlIlllllllIl, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0)) ? 1 : 0)) {
            return lllllllllllllIlIllIlIlIlllllllIl;
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIlllllllII = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIllllllIll = lllllllllllllIlIllIlIlIlllllllII.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIllllllIll.inEventLoop() ? 1 : 0)) {
            if (lIlIlIlIlIllIlI(this.channel().metadata().hasDisconnect() ? 1 : 0)) {
                lllllllllllllIlIllIlIlIlllllllII.invokeClose(lllllllllllllIlIllIlIlIlllllllIl);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIllIlIlIlllllllII.invokeDisconnect(lllllllllllllIlIllIlIlIlllllllIl);
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
        }
        else {
            safeExecute(lllllllllllllIlIllIlIlIllllllIll, new OneTimeTask() {
                private static boolean lIllIlIllllllIl(final int lllllllllllllIlIIllllIIIlIlIlIlI) {
                    return lllllllllllllIlIIllllIIIlIlIlIlI == 0;
                }
                
                @Override
                public void run() {
                    if (lIllIlIllllllIl(AbstractChannelHandlerContext.this.channel().metadata().hasDisconnect() ? 1 : 0)) {
                        AbstractChannelHandlerContext.this.invokeClose(lllllllllllllIlIllIlIlIlllllllIl);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        AbstractChannelHandlerContext.this.invokeDisconnect(lllllllllllllIlIllIlIlIlllllllIl);
                    }
                }
            }, lllllllllllllIlIllIlIlIlllllllIl, null);
        }
        return lllllllllllllIlIllIlIlIlllllllIl;
    }
    
    private static boolean lIlIlIlIlIllIIl(final int lllllllllllllIlIllIlIlIIIlIllIIl) {
        return lllllllllllllIlIllIlIlIIIlIllIIl != 0;
    }
    
    private static String lIlIlIlIIlllIlI(final String lllllllllllllIlIllIlIlIIlIIlIIll, final String lllllllllllllIlIllIlIlIIlIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIlIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIlIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), AbstractChannelHandlerContext.llllIlIllIlIl[8]), "DES");
            final Cipher lllllllllllllIlIllIlIlIIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIllIlIlIIlIIlIlll.init(AbstractChannelHandlerContext.llllIlIllIlIl[2], lllllllllllllIlIllIlIlIIlIIllIII);
            return new String(lllllllllllllIlIllIlIlIIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIlIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIlIIlIIlIllI) {
            lllllllllllllIlIllIlIlIIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture disconnect() {
        return this.disconnect(this.newPromise());
    }
    
    private void invokeFlush() {
        try {
            ((ChannelOutboundHandler)this.handler()).flush(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIllIIIlIII) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlIllIIIlIII);
        }
    }
    
    private static void safeExecute(final EventExecutor lllllllllllllIlIllIlIlIlIIIIIIlI, final Runnable lllllllllllllIlIllIlIlIlIIIIIIIl, final ChannelPromise lllllllllllllIlIllIlIlIlIIIIIIII, final Object lllllllllllllIlIllIlIlIlIIIIIIll) {
        try {
            lllllllllllllIlIllIlIlIlIIIIIIlI.execute(lllllllllllllIlIllIlIlIlIIIIIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIlIIIIIlll) {
            try {
                lllllllllllllIlIllIlIlIlIIIIIIII.setFailure(lllllllllllllIlIllIlIlIlIIIIIlll);
                "".length();
                if (!lIlIlIlIlIllIII(lllllllllllllIlIllIlIlIlIIIIIIll)) {
                    return;
                }
                ReferenceCountUtil.release(lllllllllllllIlIllIlIlIlIIIIIIll);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            finally {
                if (lIlIlIlIlIllIII(lllllllllllllIlIllIlIlIlIIIIIIll)) {
                    ReferenceCountUtil.release(lllllllllllllIlIllIlIlIlIIIIIIll);
                    "".length();
                }
            }
        }
    }
    
    private void invokeRead() {
        try {
            ((ChannelOutboundHandler)this.handler()).read(this);
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIllIllIlIl) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlIllIllIlIl);
        }
    }
    
    @Override
    public EventExecutor executor() {
        if (lIlIlIlIlIlIlll(this.executor)) {
            return this.channel().eventLoop();
        }
        return this.executor;
    }
    
    @Override
    public ChannelHandlerContext read() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIllIllllIl = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIllIllllII = lllllllllllllIlIllIlIlIllIllllIl.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIllIllllII.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlIllIllllIl.invokeRead();
            "".length();
            if ((0x29 ^ 0x2D) != (0x85 ^ 0x81)) {
                return null;
            }
        }
        else {
            Runnable lllllllllllllIlIllIlIlIllIllllll = lllllllllllllIlIllIlIlIllIllllIl.invokeReadTask;
            if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIllIllllll)) {
                lllllllllllllIlIllIlIlIllIllllll = (lllllllllllllIlIllIlIlIllIllllIl.invokeReadTask = new Runnable() {
                    @Override
                    public void run() {
                        AbstractChannelHandlerContext.this.invokeRead();
                    }
                });
            }
            lllllllllllllIlIllIlIlIllIllllII.execute(lllllllllllllIlIllIlIlIllIllllll);
        }
        return this;
    }
    
    private static void lIlIlIlIlIlIllI() {
        (llllIlIllIlIl = new int[20])[0] = ((0xB7 ^ 0x97 ^ (0xB2 ^ 0xA9)) & (0x4F ^ 0x10 ^ (0x53 ^ 0x37) ^ -" ".length()));
        AbstractChannelHandlerContext.llllIlIllIlIl[1] = " ".length();
        AbstractChannelHandlerContext.llllIlIllIlIl[2] = "  ".length();
        AbstractChannelHandlerContext.llllIlIllIlIl[3] = "   ".length();
        AbstractChannelHandlerContext.llllIlIllIlIl[4] = (105 + 92 - 154 + 142 ^ 114 + 41 - 11 + 45);
        AbstractChannelHandlerContext.llllIlIllIlIl[5] = (0x42 ^ 0x47);
        AbstractChannelHandlerContext.llllIlIllIlIl[6] = (122 + 4 - 87 + 153 ^ 11 + 38 + 19 + 130);
        AbstractChannelHandlerContext.llllIlIllIlIl[7] = (0x36 ^ 0x5C ^ (0xD1 ^ 0xBC));
        AbstractChannelHandlerContext.llllIlIllIlIl[8] = (43 + 135 - 51 + 57 ^ 129 + 166 - 250 + 131);
        AbstractChannelHandlerContext.llllIlIllIlIl[9] = (37 + 80 - 61 + 119 ^ 140 + 145 - 251 + 132);
        AbstractChannelHandlerContext.llllIlIllIlIl[10] = (0x4E ^ 0xA ^ (0x8F ^ 0xC1));
        AbstractChannelHandlerContext.llllIlIllIlIl[11] = (0xE5 ^ 0x88 ^ (0xD1 ^ 0xB7));
        AbstractChannelHandlerContext.llllIlIllIlIl[12] = (0x77 ^ 0x7B);
        AbstractChannelHandlerContext.llllIlIllIlIl[13] = (0xA7 ^ 0xB6 ^ (0x3D ^ 0x21));
        AbstractChannelHandlerContext.llllIlIllIlIl[14] = (67 + 90 - 149 + 147 ^ 15 + 99 - 18 + 53);
        AbstractChannelHandlerContext.llllIlIllIlIl[15] = (0x28 ^ 0x36 ^ (0x93 ^ 0x82));
        AbstractChannelHandlerContext.llllIlIllIlIl[16] = (0xBD ^ 0xAD);
        AbstractChannelHandlerContext.llllIlIllIlIl[17] = (0x82 ^ 0x93);
        AbstractChannelHandlerContext.llllIlIllIlIl[18] = (0x7F ^ 0x6D);
        AbstractChannelHandlerContext.llllIlIllIlIl[19] = (0xD3 ^ 0xC0);
    }
    
    private void invokeConnect(final SocketAddress lllllllllllllIlIllIlIllIIIIIlIlI, final SocketAddress lllllllllllllIlIllIlIllIIIIIIlIl, final ChannelPromise lllllllllllllIlIllIlIllIIIIIIlII) {
        try {
            ((ChannelOutboundHandler)this.handler()).connect(this, lllllllllllllIlIllIlIllIIIIIlIlI, lllllllllllllIlIllIlIllIIIIIIlIl, lllllllllllllIlIllIlIllIIIIIIlII);
            "".length();
            if (((0x5F ^ 0x1C) & ~(0x87 ^ 0xC4)) != 0x0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIIIIIllII) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIllIIIIIllII, lllllllllllllIlIllIlIllIIIIIIlII);
        }
    }
    
    @Override
    public ChannelHandlerContext fireChannelRegistered() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIlIIIIII = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIlllIIllllll = lllllllllllllIlIllIlIlllIlIIIIII.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlllIIllllll.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlllIlIIIIII.invokeChannelRegistered();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIlllIIllllll.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeChannelRegistered();
                }
            });
        }
        return this;
    }
    
    @Override
    public ChannelFuture write(final Object lllllllllllllIlIllIlIlIllIlIIlll, final ChannelPromise lllllllllllllIlIllIlIlIllIlIIllI) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIllIlIIlll)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[9]]);
        }
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIlIllIlIIllI, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0)) ? 1 : 0)) {
            ReferenceCountUtil.release(lllllllllllllIlIllIlIlIllIlIIlll);
            "".length();
            return lllllllllllllIlIllIlIlIllIlIIllI;
        }
        this.write(lllllllllllllIlIllIlIlIllIlIIlll, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0), lllllllllllllIlIllIlIlIllIlIIllI);
        return lllllllllllllIlIllIlIlIllIlIIllI;
    }
    
    private static void lIlIlIlIlIIIIll() {
        (llllIlIlIIllI = new String[AbstractChannelHandlerContext.llllIlIllIlIl[19]])[AbstractChannelHandlerContext.llllIlIllIlIl[0]] = lIlIlIlIIlllIlI("pkFxYvCDWLA=", "UDLTL");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[1]] = lIlIlIlIIlllIlI("jvSM1iXG0TY=", "EhLwW");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[2]] = lIlIlIlIIlllIlI("HJsNxJrAHAZBNdPNEPm3On9OIfhlv5WkGxZkOJgHdkKSLveE1KtTQhF0AurKsIz5", "BYCYF");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[3]] = lIlIlIlIIlllIll("EAc0agY8DDQ6Fy0APwkCMQg5PkttTzQ8BiobcT4LJRtxPQI3TzcrCigKNWoXK08iPwEpBiVqFCUcaw==", "DoQJc");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[4]] = lIlIlIlIIllllII("3KLR3IAmH2R4QhAX3Kup/hriQsI0hbILZuMxkzI8UKLgxFEgEh1NyhXzZrc4H0wCUQeQNUFo5iWMVA6EgzuJ+JZL96/JJaLA4dfYTCoNQYv6f56QAhtMKEi9qqZiGXNeDiM0YBIvGf9EhVMxfAIeIw==", "YBWCs");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[5]] = lIlIlIlIIllllII("z/lpVKTFmc0=", "pECpP");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[6]] = lIlIlIlIIllllII("ONDIXfEeIVQ=", "FESQy");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[7]] = lIlIlIlIIlllIll("LyQoNT4CLy8mNzA4", "CKKTR");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[8]] = lIlIlIlIIlllIll("PzcGHyQoEw8UIighGA==", "MRkpP");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[9]] = lIlIlIlIIlllIll("Jjsl", "KHBkT");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[10]] = lIlIlIlIIlllIlI("9B6HRNo2d64=", "PxnmO");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[11]] = lIlIlIlIIllllII("GFcgfBL/4VgmIN1h041HsKIeAWmz1Vhzc/Avm/jhA089ZvvXaf4NEp0zpt1tr97270i7+kR8hFgawdh16LdLVA==", "CspiY");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[12]] = lIlIlIlIIlllIll("IARNBBQCDx0VBQ4ETRYNEkoZCR4OHQNBDhhKDEEZEg8fQQQABAkNCRNKGgkFDQ9NCQ0PDgEIAgZKDA9MBBIOBBwVAwIPLwAfCgkYQQ8bBAIV", "ajmal");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[13]] = lIlIlIlIIllllII("mJREfVE8UIazCbZkukmsFw==", "lzyKU");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[14]] = lIlIlIlIIlllIll("GgArNTkZFw==", "jrDXP");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[15]] = lIlIlIlIIlllIll("KiUXIAopMlgsDygyGSkaejMXIwZgdw==", "ZWxMc");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[16]] = lIlIlIlIIlllIlI("agCaHCAH+3Nz+ryXtVf/U33h8MI59slieMTI+iseUNaGMDV788AgeyRg3p+AwD6IWbyf0CgyXQ4=", "eoMSF");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[17]] = lIlIlIlIIlllIlI("RIxgrsyURqM4kif4wqvSpHDcnvzGC4iF9x2KovcpI6Q=", "NaPaK");
        AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[18]] = lIlIlIlIIlllIlI("LkITY1OY6nieMweHCvigWEkJsz/atfUbQ6MHofPIBJk=", "SPMSg");
    }
    
    @Override
    public ChannelPipeline pipeline() {
        return this.pipeline;
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress lllllllllllllIlIllIlIllIIllIIIII) {
        return this.bind(lllllllllllllIlIllIlIllIIllIIIII, this.newPromise());
    }
    
    private void invokeChannelRegistered() {
        try {
            ((ChannelInboundHandler)this.handler()).channelRegistered(this);
            "".length();
            if (((0x34 ^ 0xD) & ~(0x69 ^ 0x50)) != 0x0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlllIIlllIIl) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlllIIlllIIl);
        }
    }
    
    @Override
    public ChannelFuture close(final ChannelPromise lllllllllllllIlIllIlIlIllllIIlII) {
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIlIllllIIlII, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0)) ? 1 : 0)) {
            return lllllllllllllIlIllIlIlIllllIIlII;
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIllllIIlll = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIllllIIllI = lllllllllllllIlIllIlIlIllllIIlll.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIllllIIllI.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlIllllIIlll.invokeClose(lllllllllllllIlIllIlIlIllllIIlII);
            "".length();
            if ((0x3E ^ 0x3A) <= "   ".length()) {
                return null;
            }
        }
        else {
            safeExecute(lllllllllllllIlIllIlIlIllllIIllI, new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeClose(lllllllllllllIlIllIlIlIllllIIlII);
                }
            }, lllllllllllllIlIllIlIlIllllIIlII, null);
        }
        return lllllllllllllIlIllIlIlIllllIIlII;
    }
    
    private void write(final Object lllllllllllllIlIllIlIlIlIllIlIII, final boolean lllllllllllllIlIllIlIlIlIllIIlll, final ChannelPromise lllllllllllllIlIllIlIlIlIllIIllI) {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIlIllIlIll = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIlIllIlIlI = lllllllllllllIlIllIlIlIlIllIlIll.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIllIlIlI.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlIlIllIlIll.invokeWrite(lllllllllllllIlIllIlIlIlIllIlIII, lllllllllllllIlIllIlIlIlIllIIllI);
            if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIllIIlll ? 1 : 0)) {
                lllllllllllllIlIllIlIlIlIllIlIll.invokeFlush();
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            }
        }
        else {
            final int lllllllllllllIlIllIlIlIlIlllIIIl = this.channel.estimatorHandle().size(lllllllllllllIlIllIlIlIlIllIlIII);
            if (lIlIlIlIlIllIll(lllllllllllllIlIllIlIlIlIlllIIIl)) {
                final ChannelOutboundBuffer lllllllllllllIlIllIlIlIlIlllIIll = this.channel.unsafe().outboundBuffer();
                if (lIlIlIlIlIllIII(lllllllllllllIlIllIlIlIlIlllIIll)) {
                    lllllllllllllIlIllIlIlIlIlllIIll.incrementPendingOutboundBytes(lllllllllllllIlIllIlIlIlIlllIIIl);
                }
            }
            Runnable lllllllllllllIlIllIlIlIlIlllIIII = null;
            if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIllIIlll ? 1 : 0)) {
                final Runnable lllllllllllllIlIllIlIlIlIlllIIlI = newInstance(lllllllllllllIlIllIlIlIlIllIlIll, lllllllllllllIlIllIlIlIlIllIlIII, lllllllllllllIlIllIlIlIlIlllIIIl, lllllllllllllIlIllIlIlIlIllIIllI);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIllIlIlIlIlllIIII = newInstance(lllllllllllllIlIllIlIlIlIllIlIll, lllllllllllllIlIllIlIlIlIllIlIII, lllllllllllllIlIllIlIlIlIlllIIIl, lllllllllllllIlIllIlIlIlIllIIllI);
            }
            safeExecute(lllllllllllllIlIllIlIlIlIllIlIlI, lllllllllllllIlIllIlIlIlIlllIIII, lllllllllllllIlIllIlIlIlIllIIllI, lllllllllllllIlIllIlIlIlIllIlIII);
        }
    }
    
    private AbstractChannelHandlerContext findContextOutbound() {
        AbstractChannelHandlerContext lllllllllllllIlIllIlIlIlIIIllIIl = this;
        do {
            lllllllllllllIlIllIlIlIlIIIllIIl = lllllllllllllIlIllIlIlIlIIIllIIl.prev;
        } while (!lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIIIllIIl.outbound ? 1 : 0));
        return lllllllllllllIlIllIlIlIlIIIllIIl;
    }
    
    @Override
    public boolean isRemoved() {
        return this.removed;
    }
    
    private void invokeChannelWritabilityChanged() {
        try {
            ((ChannelInboundHandler)this.handler()).channelWritabilityChanged(this);
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIIllIlIIl) {
            this.notifyHandlerException(lllllllllllllIlIllIlIllIIllIlIIl);
        }
    }
    
    @Override
    public ChannelHandlerContext fireExceptionCaught(final Throwable lllllllllllllIlIllIlIllIllllllIl) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIllllllIl)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[1]]);
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIIIIIIII = this.next;
        final EventExecutor lllllllllllllIlIllIlIllIllllllll = lllllllllllllIlIllIlIlllIIIIIIII.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIllllllll.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlllIIIIIIII.invokeExceptionCaught(lllllllllllllIlIllIlIllIllllllIl);
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            try {
                lllllllllllllIlIllIlIllIllllllll.execute(new OneTimeTask() {
                    @Override
                    public void run() {
                        AbstractChannelHandlerContext.this.invokeExceptionCaught(lllllllllllllIlIllIlIllIllllllIl);
                    }
                });
                "".length();
                if ((0x18 ^ 0x1C) < "   ".length()) {
                    return null;
                }
            }
            catch (Throwable lllllllllllllIlIllIlIlllIIIIIIll) {
                if (lIlIlIlIlIllIIl(DefaultChannelPipeline.logger.isWarnEnabled() ? 1 : 0)) {
                    DefaultChannelPipeline.logger.warn(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[2]], lllllllllllllIlIllIlIlllIIIIIIll);
                    DefaultChannelPipeline.logger.warn(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[3]], lllllllllllllIlIllIlIllIllllllIl);
                }
            }
        }
        return this;
    }
    
    private void notifyHandlerException(final Throwable lllllllllllllIlIllIlIlIlIlIlIIII) {
        if (lIlIlIlIlIllIIl(inExceptionCaught(lllllllllllllIlIllIlIlIlIlIlIIII) ? 1 : 0)) {
            if (lIlIlIlIlIllIIl(DefaultChannelPipeline.logger.isWarnEnabled() ? 1 : 0)) {
                DefaultChannelPipeline.logger.warn(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[12]], lllllllllllllIlIllIlIlIlIlIlIIII);
            }
            return;
        }
        this.invokeExceptionCaught(lllllllllllllIlIllIlIlIlIlIlIIII);
    }
    
    private static boolean lIlIlIlIlIllIll(final int lllllllllllllIlIllIlIlIIIlIlIlIl) {
        return lllllllllllllIlIllIlIlIIIlIlIlIl > 0;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.channel().config().getAllocator();
    }
    
    @Override
    public ChannelFuture write(final Object lllllllllllllIlIllIlIlIllIlIllII) {
        return this.write(lllllllllllllIlIllIlIlIllIlIllII, this.newPromise());
    }
    
    @Override
    public ChannelPromise newPromise() {
        return new DefaultChannelPromise(this.channel(), this.executor());
    }
    
    @Override
    public ChannelFuture deregister(final ChannelPromise lllllllllllllIlIllIlIlIlllIlIIll) {
        if (lIlIlIlIlIllIlI(this.validatePromise(lllllllllllllIlIllIlIlIlllIlIIll, (boolean)(AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0)) ? 1 : 0)) {
            return lllllllllllllIlIllIlIlIlllIlIIll;
        }
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIlllIlIIlI = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIlllIlIIIl = lllllllllllllIlIllIlIlIlllIlIIlI.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlllIlIIIl.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlIlllIlIIlI.invokeDeregister(lllllllllllllIlIllIlIlIlllIlIIll);
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else {
            safeExecute(lllllllllllllIlIllIlIlIlllIlIIIl, new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeDeregister(lllllllllllllIlIllIlIlIlllIlIIll);
                }
            }, lllllllllllllIlIllIlIlIlllIlIIll, null);
        }
        return lllllllllllllIlIllIlIlIlllIlIIll;
    }
    
    private void teardown0() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIlIllIII = this.prev;
        if (lIlIlIlIlIllIII(lllllllllllllIlIllIlIlllIlIllIII)) {
            synchronized (this.pipeline) {
                this.pipeline.remove0(this);
                // monitorexit(this.pipeline)
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            lllllllllllllIlIllIlIlllIlIllIII.teardown();
        }
    }
    
    @Override
    public ChannelFuture deregister() {
        return this.deregister(this.newPromise());
    }
    
    private void invokeChannelUnregistered() {
        try {
            ((ChannelInboundHandler)this.handler()).channelUnregistered(this);
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlllIIlIlIlI) {
            this.notifyHandlerException(lllllllllllllIlIllIlIlllIIlIlIlI);
        }
    }
    
    static {
        lIlIlIlIlIlIllI();
        lIlIlIlIlIIIIll();
    }
    
    private void invokeDeregister(final ChannelPromise lllllllllllllIlIllIlIlIlllIIIlll) {
        try {
            ((ChannelOutboundHandler)this.handler()).deregister(this, lllllllllllllIlIllIlIlIlllIIIlll);
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIlllIIlIIl) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIlIlllIIlIIl, lllllllllllllIlIllIlIlIlllIIIlll);
        }
    }
    
    void teardown() {
        final EventExecutor lllllllllllllIlIllIlIlllIllIIIII = this.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlllIllIIIII.inEventLoop() ? 1 : 0)) {
            this.teardown0();
            "".length();
            if ("   ".length() >= (0xBB ^ 0xBF)) {
                return;
            }
        }
        else {
            lllllllllllllIlIllIlIlllIllIIIII.execute(new Runnable() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.teardown0();
                }
            });
        }
    }
    
    @Override
    public ChannelPromise voidPromise() {
        return this.channel.voidPromise();
    }
    
    @Override
    public ChannelHandlerContext fireChannelReadComplete() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIlIIlIIII = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIllIlIIIllll = lllllllllllllIlIllIlIllIlIIlIIII.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIlIIIllll.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIlIIlIIII.invokeChannelReadComplete();
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            Runnable lllllllllllllIlIllIlIllIlIIlIIll = lllllllllllllIlIllIlIllIlIIlIIII.invokeChannelReadCompleteTask;
            if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIlIIlIIll)) {
                lllllllllllllIlIllIlIllIlIIlIIll = (lllllllllllllIlIllIlIllIlIIlIIII.invokeChannelReadCompleteTask = new Runnable() {
                    @Override
                    public void run() {
                        AbstractChannelHandlerContext.this.invokeChannelReadComplete();
                    }
                });
            }
            lllllllllllllIlIllIlIllIlIIIllll.execute(lllllllllllllIlIllIlIllIlIIlIIll);
        }
        return this;
    }
    
    @Override
    public ChannelHandlerContext fireChannelUnregistered() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlllIIllIIIl = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIlllIIllIIII = lllllllllllllIlIllIlIlllIIllIIIl.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlllIIllIIII.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlllIIllIIIl.invokeChannelUnregistered();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            lllllllllllllIlIllIlIlllIIllIIII.execute(new OneTimeTask() {
                @Override
                public void run() {
                    AbstractChannelHandlerContext.this.invokeChannelUnregistered();
                }
            });
        }
        return this;
    }
    
    private static void notifyOutboundHandlerException(final Throwable lllllllllllllIlIllIlIlIlIlIllIIl, final ChannelPromise lllllllllllllIlIllIlIlIlIlIllIII) {
        if (lIlIlIlIlIllIIl((lllllllllllllIlIllIlIlIlIlIllIII instanceof VoidChannelPromise) ? 1 : 0)) {
            return;
        }
        if (lIlIlIlIlIllIlI(lllllllllllllIlIllIlIlIlIlIllIII.tryFailure(lllllllllllllIlIllIlIlIlIlIllIIl) ? 1 : 0) && lIlIlIlIlIllIIl(DefaultChannelPipeline.logger.isWarnEnabled() ? 1 : 0)) {
            DefaultChannelPipeline.logger.warn(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[11]], lllllllllllllIlIllIlIlIlIlIllIII, lllllllllllllIlIllIlIlIlIlIllIIl);
        }
    }
    
    private void invokeChannelReadComplete() {
        try {
            ((ChannelInboundHandler)this.handler()).channelReadComplete(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIlIIIIIII) {
            this.notifyHandlerException(lllllllllllllIlIllIlIllIlIIIIIII);
        }
    }
    
    private void invokeWrite(final Object lllllllllllllIlIllIlIlIllIIlllII, final ChannelPromise lllllllllllllIlIllIlIlIllIIllIII) {
        try {
            ((ChannelOutboundHandler)this.handler()).write(this, lllllllllllllIlIllIlIlIllIIlllII, lllllllllllllIlIllIlIlIllIIllIII);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIllIIllllI) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIlIllIIllllI, lllllllllllllIlIllIlIlIllIIllIII);
        }
    }
    
    @Override
    public ChannelHandlerContext flush() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIlIllIIlIIII = this.findContextOutbound();
        final EventExecutor lllllllllllllIlIllIlIlIllIIIllll = lllllllllllllIlIllIlIlIllIIlIIII.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIllIIIllll.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIlIllIIlIIII.invokeFlush();
            "".length();
            if ((0x6E ^ 0x6A) == 0x0) {
                return null;
            }
        }
        else {
            Runnable lllllllllllllIlIllIlIlIllIIlIIlI = lllllllllllllIlIllIlIlIllIIlIIII.invokeFlushTask;
            if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIllIIlIIlI)) {
                lllllllllllllIlIllIlIlIllIIlIIlI = (lllllllllllllIlIllIlIlIllIIlIIII.invokeFlushTask = new Runnable() {
                    @Override
                    public void run() {
                        AbstractChannelHandlerContext.this.invokeFlush();
                    }
                });
            }
            safeExecute(lllllllllllllIlIllIlIlIllIIIllll, lllllllllllllIlIllIlIlIllIIlIIlI, this.channel.voidPromise(), null);
        }
        return this;
    }
    
    private static boolean lIlIlIlIlIlllIl(final Object lllllllllllllIlIllIlIlIIIllIIlII, final Object lllllllllllllIlIllIlIlIIIllIIIll) {
        return lllllllllllllIlIllIlIlIIIllIIlII != lllllllllllllIlIllIlIlIIIllIIIll;
    }
    
    private void invokeBind(final SocketAddress lllllllllllllIlIllIlIllIIIllIIlI, final ChannelPromise lllllllllllllIlIllIlIllIIIllIIIl) {
        try {
            ((ChannelOutboundHandler)this.handler()).bind(this, lllllllllllllIlIllIlIllIIIllIIlI, lllllllllllllIlIllIlIllIIIllIIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIIIllIlII) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIllIIIllIlII, lllllllllllllIlIllIlIllIIIllIIIl);
        }
    }
    
    private void invokeExceptionCaught(final Throwable lllllllllllllIlIllIlIllIllllIIlI) {
        try {
            this.handler().exceptionCaught(this, lllllllllllllIlIllIlIllIllllIIlI);
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIllllIlIl) {
            if (lIlIlIlIlIllIIl(DefaultChannelPipeline.logger.isWarnEnabled() ? 1 : 0)) {
                DefaultChannelPipeline.logger.warn(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[4]], lllllllllllllIlIllIlIllIllllIIlI);
            }
        }
    }
    
    @Override
    public ChannelProgressivePromise newProgressivePromise() {
        return new DefaultChannelProgressivePromise(this.channel(), this.executor());
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object lllllllllllllIlIllIlIlIlIlIllllI) {
        return this.writeAndFlush(lllllllllllllIlIllIlIlIlIlIllllI, this.newPromise());
    }
    
    private void invokeClose(final ChannelPromise lllllllllllllIlIllIlIlIlllIlllII) {
        try {
            ((ChannelOutboundHandler)this.handler()).close(this, lllllllllllllIlIllIlIlIlllIlllII);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIlIlllIllllI) {
            notifyOutboundHandlerException(lllllllllllllIlIllIlIlIlllIllllI, lllllllllllllIlIllIlIlIlllIlllII);
        }
    }
    
    private void invokeUserEventTriggered(final Object lllllllllllllIlIllIlIllIllIIlIlI) {
        try {
            ((ChannelInboundHandler)this.handler()).userEventTriggered(this, lllllllllllllIlIllIlIllIllIIlIlI);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIlIllIllIlIIII) {
            this.notifyHandlerException(lllllllllllllIlIllIlIllIllIlIIII);
        }
    }
    
    @Override
    public ChannelHandlerContext fireChannelWritabilityChanged() {
        final AbstractChannelHandlerContext lllllllllllllIlIllIlIllIIlllIIIl = this.findContextInbound();
        final EventExecutor lllllllllllllIlIllIlIllIIlllIIII = lllllllllllllIlIllIlIllIIlllIIIl.executor();
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIllIIlllIIII.inEventLoop() ? 1 : 0)) {
            lllllllllllllIlIllIlIllIIlllIIIl.invokeChannelWritabilityChanged();
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            Runnable lllllllllllllIlIllIlIllIIlllIIll = lllllllllllllIlIllIlIllIIlllIIIl.invokeChannelWritableStateChangedTask;
            if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIllIIlllIIll)) {
                lllllllllllllIlIllIlIllIIlllIIll = (lllllllllllllIlIllIlIllIIlllIIIl.invokeChannelWritableStateChangedTask = new Runnable() {
                    @Override
                    public void run() {
                        AbstractChannelHandlerContext.this.invokeChannelWritabilityChanged();
                    }
                });
            }
            lllllllllllllIlIllIlIllIIlllIIII.execute(lllllllllllllIlIllIlIllIIlllIIll);
        }
        return this;
    }
    
    @Override
    public ChannelFuture close() {
        return this.close(this.newPromise());
    }
    
    private boolean validatePromise(final ChannelPromise lllllllllllllIlIllIlIlIlIIlIIlll, final boolean lllllllllllllIlIllIlIlIlIIlIIllI) {
        if (lIlIlIlIlIlIlll(lllllllllllllIlIllIlIlIlIIlIIlll)) {
            throw new NullPointerException(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[14]]);
        }
        if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIIlIIlll.isDone() ? 1 : 0)) {
            if (lIlIlIlIlIllIIl(lllllllllllllIlIllIlIlIlIIlIIlll.isCancelled() ? 1 : 0)) {
                return AbstractChannelHandlerContext.llllIlIllIlIl[0] != 0;
            }
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[15]]).append(lllllllllllllIlIllIlIlIlIIlIIlll)));
        }
        else {
            if (lIlIlIlIlIlllIl(lllllllllllllIlIllIlIlIlIIlIIlll.channel(), this.channel())) {
                final String format = AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[16]];
                final Object[] args = new Object[AbstractChannelHandlerContext.llllIlIllIlIl[2]];
                args[AbstractChannelHandlerContext.llllIlIllIlIl[0]] = lllllllllllllIlIllIlIlIlIIlIIlll.channel();
                args[AbstractChannelHandlerContext.llllIlIllIlIl[1]] = this.channel();
                throw new IllegalArgumentException(String.format(format, args));
            }
            if (lIlIlIlIlIllllI(lllllllllllllIlIllIlIlIlIIlIIlll.getClass(), DefaultChannelPromise.class)) {
                return AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0;
            }
            if (lIlIlIlIlIllIlI(lllllllllllllIlIllIlIlIlIIlIIllI ? 1 : 0) && lIlIlIlIlIllIIl((lllllllllllllIlIllIlIlIlIIlIIlll instanceof VoidChannelPromise) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(VoidChannelPromise.class)).append(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[17]])));
            }
            if (lIlIlIlIlIllIIl((lllllllllllllIlIllIlIlIlIIlIIlll instanceof AbstractChannel.CloseFuture) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(AbstractChannel.CloseFuture.class)).append(AbstractChannelHandlerContext.llllIlIlIIllI[AbstractChannelHandlerContext.llllIlIllIlIl[18]])));
            }
            return AbstractChannelHandlerContext.llllIlIllIlIl[1] != 0;
        }
    }
    
    static final class WriteAndFlushTask extends AbstractWriteTask
    {
        private static final /* synthetic */ Recycler<WriteAndFlushTask> RECYCLER;
        
        public void write(final AbstractChannelHandlerContext lllllllllllllIlIllIllIllllllIIII, final Object lllllllllllllIlIllIllIlllllIlIlI, final ChannelPromise lllllllllllllIlIllIllIlllllIlllI) {
            super.write(lllllllllllllIlIllIllIllllllIIII, lllllllllllllIlIllIllIlllllIlIlI, lllllllllllllIlIllIllIlllllIlllI);
            lllllllllllllIlIllIllIllllllIIII.invokeFlush();
        }
        
        private static WriteAndFlushTask newInstance(final AbstractChannelHandlerContext lllllllllllllIlIllIlllIIIIIlIIII, final Object lllllllllllllIlIllIlllIIIIIIllll, final int lllllllllllllIlIllIlllIIIIIIlllI, final ChannelPromise lllllllllllllIlIllIlllIIIIIlIIlI) {
            final WriteAndFlushTask lllllllllllllIlIllIlllIIIIIlIIIl = WriteAndFlushTask.RECYCLER.get();
            AbstractWriteTask.init(lllllllllllllIlIllIlllIIIIIlIIIl, lllllllllllllIlIllIlllIIIIIlIIII, lllllllllllllIlIllIlllIIIIIIllll, lllllllllllllIlIllIlllIIIIIIlllI, lllllllllllllIlIllIlllIIIIIlIIlI);
            return lllllllllllllIlIllIlllIIIIIlIIIl;
        }
        
        static {
            RECYCLER = new Recycler<WriteAndFlushTask>() {
                @Override
                protected WriteAndFlushTask newObject(final Handle lllllllllllllIIIIIIIlIIllllIIlll) {
                    return new WriteAndFlushTask(lllllllllllllIIIIIIIlIIllllIIlll);
                }
            };
        }
        
        private WriteAndFlushTask(final Recycler.Handle lllllllllllllIlIllIlllIIIIIIIIIl) {
            super(lllllllllllllIlIllIlllIIIIIIIIIl);
        }
        
        @Override
        protected void recycle(final Recycler.Handle lllllllllllllIlIllIllIllllIlllll) {
            WriteAndFlushTask.RECYCLER.recycle(this, lllllllllllllIlIllIllIllllIlllll);
            "".length();
        }
    }
    
    static final class WriteTask extends AbstractWriteTask implements SingleThreadEventLoop.NonWakeupRunnable
    {
        private static final /* synthetic */ Recycler<WriteTask> RECYCLER;
        
        static {
            RECYCLER = new Recycler<WriteTask>() {
                @Override
                protected WriteTask newObject(final Handle llllllllllllIlllllIIIIIIllllIIlI) {
                    return new WriteTask(llllllllllllIlllllIIIIIIllllIIlI);
                }
            };
        }
        
        @Override
        protected void recycle(final Recycler.Handle llllllllllllIllIIIllIllIlllIIlll) {
            WriteTask.RECYCLER.recycle(this, llllllllllllIllIIIllIllIlllIIlll);
            "".length();
        }
        
        private static WriteTask newInstance(final AbstractChannelHandlerContext llllllllllllIllIIIllIllIllllIlll, final Object llllllllllllIllIIIllIllIlllllIll, final int llllllllllllIllIIIllIllIllllIlIl, final ChannelPromise llllllllllllIllIIIllIllIlllllIIl) {
            final WriteTask llllllllllllIllIIIllIllIlllllIII = WriteTask.RECYCLER.get();
            AbstractWriteTask.init(llllllllllllIllIIIllIllIlllllIII, llllllllllllIllIIIllIllIllllIlll, llllllllllllIllIIIllIllIlllllIll, llllllllllllIllIIIllIllIllllIlIl, llllllllllllIllIIIllIllIlllllIIl);
            return llllllllllllIllIIIllIllIlllllIII;
        }
        
        private WriteTask(final Recycler.Handle llllllllllllIllIIIllIllIlllIllll) {
            super(llllllllllllIllIIIllIllIlllIllll);
        }
    }
    
    abstract static class AbstractWriteTask extends RecyclableMpscLinkedQueueNode<Runnable> implements Runnable
    {
        private /* synthetic */ int size;
        private /* synthetic */ AbstractChannelHandlerContext ctx;
        private /* synthetic */ Object msg;
        private /* synthetic */ ChannelPromise promise;
        
        private static boolean lIllIIllIlIlIlI(final Object lllllllllllllIlIlIIIlllIlIllIlll) {
            return lllllllllllllIlIlIIIlllIlIllIlll != null;
        }
        
        @Override
        public Runnable value() {
            return this;
        }
        
        private static boolean lIllIIllIlIlIIl(final int lllllllllllllIlIlIIIlllIlIllIlIl) {
            return lllllllllllllIlIlIIIlllIlIllIlIl > 0;
        }
        
        @Override
        public final void run() {
            try {
                if (lIllIIllIlIlIIl(this.size)) {
                    final ChannelOutboundBuffer lllllllllllllIlIlIIIlllIllIlIlII = this.ctx.channel.unsafe().outboundBuffer();
                    if (lIllIIllIlIlIlI(lllllllllllllIlIlIIIlllIllIlIlII)) {
                        lllllllllllllIlIlIIIlllIllIlIlII.decrementPendingOutboundBytes(this.size);
                    }
                }
                this.write(this.ctx, this.msg, this.promise);
                this.ctx = null;
                this.msg = null;
                this.promise = null;
                "".length();
                if (((0xCB ^ 0xC1) & ~(0x80 ^ 0x8A)) != 0x0) {
                    return;
                }
            }
            finally {
                this.ctx = null;
                this.msg = null;
                this.promise = null;
            }
        }
        
        protected void write(final AbstractChannelHandlerContext lllllllllllllIlIlIIIlllIllIIIlIl, final Object lllllllllllllIlIlIIIlllIllIIIlII, final ChannelPromise lllllllllllllIlIlIIIlllIllIIIllI) {
            lllllllllllllIlIlIIIlllIllIIIlIl.invokeWrite(lllllllllllllIlIlIIIlllIllIIIlII, lllllllllllllIlIlIIIlllIllIIIllI);
        }
        
        private AbstractWriteTask(final Recycler.Handle lllllllllllllIlIlIIIlllIlllIlIIl) {
            super(lllllllllllllIlIlIIIlllIlllIlIIl);
        }
        
        protected static void init(final AbstractWriteTask lllllllllllllIlIlIIIlllIllIlllII, final AbstractChannelHandlerContext lllllllllllllIlIlIIIlllIllIllIll, final Object lllllllllllllIlIlIIIlllIllIllIlI, final int lllllllllllllIlIlIIIlllIllIllllI, final ChannelPromise lllllllllllllIlIlIIIlllIllIlllIl) {
            lllllllllllllIlIlIIIlllIllIlllII.ctx = lllllllllllllIlIlIIIlllIllIllIll;
            lllllllllllllIlIlIIIlllIllIlllII.msg = lllllllllllllIlIlIIIlllIllIllIlI;
            lllllllllllllIlIlIIIlllIllIlllII.promise = lllllllllllllIlIlIIIlllIllIlllIl;
            lllllllllllllIlIlIIIlllIllIlllII.size = lllllllllllllIlIlIIIlllIllIllllI;
        }
    }
}
