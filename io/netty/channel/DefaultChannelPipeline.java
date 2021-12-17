// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.ReferenceCountUtil;
import java.util.IdentityHashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import io.netty.util.internal.PlatformDependent;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import io.netty.util.internal.StringUtil;
import java.net.SocketAddress;
import java.util.NoSuchElementException;
import java.util.concurrent.Future;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.EventExecutorGroup;
import java.util.Map;
import java.util.WeakHashMap;

final class DefaultChannelPipeline implements ChannelPipeline
{
    private static final /* synthetic */ WeakHashMap<Class<?>, String>[] nameCaches;
    final /* synthetic */ AbstractChannelHandlerContext head;
    private static final /* synthetic */ String[] lIlIIllIlIllll;
    final /* synthetic */ Map<EventExecutorGroup, EventExecutor> childExecutors;
    static final /* synthetic */ InternalLogger logger;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ Map<String, AbstractChannelHandlerContext> name2ctx;
    final /* synthetic */ AbstractChannel channel;
    private static final /* synthetic */ int[] lIlIIllIllIIII;
    final /* synthetic */ AbstractChannelHandlerContext tail;
    
    private ChannelHandler replace(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIlIllIIl, final String lllllllllllllIIIllIIIlIlIlIlllIl, final ChannelHandler lllllllllllllIIIllIIIlIlIlIlIlll) {
        if (lllIlIIIlIllIll(DefaultChannelPipeline.$assertionsDisabled ? 1 : 0) && (!lllIlIIIlIlllII(lllllllllllllIIIllIIIlIlIlIllIIl, this.head) || lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIlIlIllIIl, this.tail))) {
            throw new AssertionError();
        }
        final short lllllllllllllIIIllIIIlIlIlIlIlIl = (short)this;
        final Future<?> lllllllllllllIIIllIIIlIlIlIllIll;
        synchronized (this) {
            final boolean lllllllllllllIIIllIIIlIlIllIIIIl = lllllllllllllIIIllIIIlIlIlIllIIl.name().equals(lllllllllllllIIIllIIIlIlIlIlllIl);
            if (lllIlIIIlIllIll(lllllllllllllIIIllIIIlIlIllIIIIl ? 1 : 0)) {
                this.checkDuplicateName(lllllllllllllIIIllIIIlIlIlIlllIl);
            }
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIllIIIII = new DefaultChannelHandlerContext(this, lllllllllllllIIIllIIIlIlIlIllIIl.executor, lllllllllllllIIIllIIIlIlIlIlllIl, lllllllllllllIIIllIIIlIlIlIlIlll);
            if (!lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIllIIIII.channel().isRegistered() ? 1 : 0) || lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIllIIIII.executor().inEventLoop() ? 1 : 0)) {
                this.replace0(lllllllllllllIIIllIIIlIlIlIllIIl, lllllllllllllIIIllIIIlIlIlIlllIl, lllllllllllllIIIllIIIlIlIllIIIII);
                return lllllllllllllIIIllIIIlIlIlIllIIl.handler();
            }
            lllllllllllllIIIllIIIlIlIlIllIll = lllllllllllllIIIllIIIlIlIllIIIII.executor().submit((Runnable)new Runnable() {
                @Override
                public void run() {
                    synchronized (DefaultChannelPipeline.this) {
                        DefaultChannelPipeline.this.replace0(lllllllllllllIIIllIIIlIlIlIllIIl, lllllllllllllIIIllIIIlIlIlIlllIl, lllllllllllllIIIllIIIlIlIllIIIII);
                        // monitorexit(this.this$0)
                        "".length();
                        if ((0x9A ^ 0x9E) == 0x0) {
                            return;
                        }
                    }
                }
            });
            // monitorexit(this)
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        waitForFuture(lllllllllllllIIIllIIIlIlIlIllIll);
        return lllllllllllllIIIllIIIlIlIlIllIIl.handler();
    }
    
    @Override
    public ChannelPipeline fireChannelInactive() {
        this.head.fireChannelInactive();
        "".length();
        return this;
    }
    
    private String generateName(final ChannelHandler lllllllllllllIIIllIIIlIlllIlIIll) {
        final WeakHashMap<Class<?>, String> lllllllllllllIIIllIIIlIlllIlIIlI = DefaultChannelPipeline.nameCaches[(int)(Thread.currentThread().getId() % DefaultChannelPipeline.nameCaches.length)];
        final Class<?> lllllllllllllIIIllIIIlIlllIlIIIl = lllllllllllllIIIllIIIlIlllIlIIll.getClass();
        String lllllllllllllIIIllIIIlIlllIlIIII;
        synchronized (lllllllllllllIIIllIIIlIlllIlIIlI) {
            lllllllllllllIIIllIIIlIlllIlIIII = lllllllllllllIIIllIIIlIlllIlIIlI.get(lllllllllllllIIIllIIIlIlllIlIIIl);
            if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIlllIlIIII)) {
                lllllllllllllIIIllIIIlIlllIlIIII = generateName0(lllllllllllllIIIllIIIlIlllIlIIIl);
                lllllllllllllIIIllIIIlIlllIlIIlI.put(lllllllllllllIIIllIIIlIlllIlIIIl, lllllllllllllIIIllIIIlIlllIlIIII);
                "".length();
            }
            // monitorexit(lllllllllllllIIIllIIIlIlllIlIIlI)
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        final String lllllllllllllIIIllIIIlIlllIIlIlI = (String)this;
        synchronized (this) {
            Label_0245: {
                if (lllIlIIIlIllIII(this.name2ctx.containsKey(lllllllllllllIIIllIIIlIlllIlIIII) ? 1 : 0)) {
                    final String lllllllllllllIIIllIIIlIlllIlIlIl = lllllllllllllIIIllIIIlIlllIlIIII.substring(DefaultChannelPipeline.lIlIIllIllIIII[1], lllllllllllllIIIllIIIlIlllIlIIII.length() - DefaultChannelPipeline.lIlIIllIllIIII[2]);
                    int lllllllllllllIIIllIIIlIlllIlIllI = DefaultChannelPipeline.lIlIIllIllIIII[2];
                    do {
                        final String lllllllllllllIIIllIIIlIlllIlIlll = String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIlIlllIlIlIl).append(lllllllllllllIIIllIIIlIlllIlIllI));
                        if (lllIlIIIlIllIll(this.name2ctx.containsKey(lllllllllllllIIIllIIIlIlllIlIlll) ? 1 : 0)) {
                            lllllllllllllIIIllIIIlIlllIlIIII = lllllllllllllIIIllIIIlIlllIlIlll;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                            break Label_0245;
                        }
                        else {
                            ++lllllllllllllIIIllIIIlIlllIlIllI;
                            "".length();
                        }
                    } while (((0x22 ^ 0x5B ^ (0x8D ^ 0xBB)) & (0x5 ^ 0xD ^ (0x29 ^ 0x6E) ^ -" ".length())) <= 0);
                    return null;
                }
            }
            // monitorexit(this)
            "".length();
            if (-" ".length() >= ((0x7E ^ 0x6A ^ (0xC8 ^ 0xBF)) & (0x54 ^ 0x5E ^ (0x40 ^ 0x29) ^ -" ".length()))) {
                return null;
            }
        }
        return lllllllllllllIIIllIIIlIlllIlIIII;
    }
    
    private void replace0(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIlIIlIlI, final String lllllllllllllIIIllIIIlIlIlIIlIIl, final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIlIIIIlI) {
        checkMultiplicity(lllllllllllllIIIllIIIlIlIlIIIIlI);
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIlIIIlll = lllllllllllllIIIllIIIlIlIlIIlIlI.prev;
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIlIIIllI = lllllllllllllIIIllIIIlIlIlIIlIlI.next;
        lllllllllllllIIIllIIIlIlIlIIIIlI.prev = lllllllllllllIIIllIIIlIlIlIIIlll;
        lllllllllllllIIIllIIIlIlIlIIIIlI.next = lllllllllllllIIIllIIIlIlIlIIIllI;
        lllllllllllllIIIllIIIlIlIlIIIlll.next = lllllllllllllIIIllIIIlIlIlIIIIlI;
        lllllllllllllIIIllIIIlIlIlIIIllI.prev = lllllllllllllIIIllIIIlIlIlIIIIlI;
        if (lllIlIIIlIllIll(lllllllllllllIIIllIIIlIlIlIIlIlI.name().equals(lllllllllllllIIIllIIIlIlIlIIlIIl) ? 1 : 0)) {
            this.name2ctx.remove(lllllllllllllIIIllIIIlIlIlIIlIlI.name());
            "".length();
        }
        this.name2ctx.put(lllllllllllllIIIllIIIlIlIlIIlIIl, lllllllllllllIIIllIIIlIlIlIIIIlI);
        "".length();
        lllllllllllllIIIllIIIlIlIlIIlIlI.prev = lllllllllllllIIIllIIIlIlIlIIIIlI;
        lllllllllllllIIIllIIIlIlIlIIlIlI.next = lllllllllllllIIIllIIIlIlIlIIIIlI;
        this.callHandlerAdded(lllllllllllllIIIllIIIlIlIlIIIIlI);
        this.callHandlerRemoved(lllllllllllllIIIllIIIlIlIlIIlIlI);
    }
    
    private void teardownAll() {
        this.tail.prev.teardown();
    }
    
    private AbstractChannelHandlerContext getContextOrDie(final ChannelHandler lllllllllllllIIIllIIIIlllllllIII) {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIIlllllllIlI = (AbstractChannelHandlerContext)this.context(lllllllllllllIIIllIIIIlllllllIII);
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIIlllllllIlI)) {
            throw new NoSuchElementException(lllllllllllllIIIllIIIIlllllllIII.getClass().getName());
        }
        return lllllllllllllIIIllIIIIlllllllIlI;
    }
    
    @Override
    public ChannelFuture deregister(final ChannelPromise lllllllllllllIIIllIIIlIIIIllIIII) {
        return this.tail.deregister(lllllllllllllIIIllIIIlIIIIllIIII);
    }
    
    private void addFirst0(final String lllllllllllllIIIllIIIllIlIlIIlIl, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIlIlIIIII) {
        checkMultiplicity(lllllllllllllIIIllIIIllIlIlIIIII);
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIlIlIIIll = this.head.next;
        lllllllllllllIIIllIIIllIlIlIIIII.prev = this.head;
        lllllllllllllIIIllIIIllIlIlIIIII.next = lllllllllllllIIIllIIIllIlIlIIIll;
        this.head.next = lllllllllllllIIIllIIIllIlIlIIIII;
        lllllllllllllIIIllIIIllIlIlIIIll.prev = lllllllllllllIIIllIIIllIlIlIIIII;
        this.name2ctx.put(lllllllllllllIIIllIIIllIlIlIIlIl, lllllllllllllIIIllIIIllIlIlIIIII);
        "".length();
        this.callHandlerAdded(lllllllllllllIIIllIIIllIlIlIIIII);
    }
    
    @Override
    public <T extends ChannelHandler> T get(final Class<T> lllllllllllllIIIllIIIlIIlllIIllI) {
        final ChannelHandlerContext lllllllllllllIIIllIIIlIIlllIIlIl = this.context(lllllllllllllIIIllIIIlIIlllIIllI);
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIlllIIlIl)) {
            return null;
        }
        return (T)lllllllllllllIIIllIIIlIIlllIIlIl.handler();
    }
    
    @Override
    public ChannelHandlerContext context(final String lllllllllllllIIIllIIIlIIllIlllII) {
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIlllII)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[9]]);
        }
        final Exception lllllllllllllIIIllIIIlIIllIllIIl = (Exception)this;
        synchronized (this) {
            return this.name2ctx.get(lllllllllllllIIIllIIIlIIllIlllII);
        }
    }
    
    private AbstractChannelHandlerContext getContextOrDie(final Class<? extends ChannelHandler> lllllllllllllIIIllIIIIlllllIllll) {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIIllllllIIIl = (AbstractChannelHandlerContext)this.context(lllllllllllllIIIllIIIIlllllIllll);
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIIllllllIIIl)) {
            throw new NoSuchElementException(lllllllllllllIIIllIIIIlllllIllll.getName());
        }
        return lllllllllllllIIIllIIIIllllllIIIl;
    }
    
    @Override
    public ChannelFuture write(final Object lllllllllllllIIIllIIIlIIIIlIlIIl) {
        return this.tail.write(lllllllllllllIIIllIIIlIIIIlIlIIl);
    }
    
    private void callHandlerRemoved0(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIIIlIlII) {
        try {
            lllllllllllllIIIllIIIlIlIIIlIlII.handler().handlerRemoved(lllllllllllllIIIllIIIlIlIIIlIlII);
            lllllllllllllIIIllIIIlIlIIIlIlII.setRemoved();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIllIIIlIlIIIllIII) {
            this.fireExceptionCaught(new ChannelPipelineException(String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIlIlIIIlIlII.handler().getClass().getName()).append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[8]])), lllllllllllllIIIllIIIlIlIIIllIII));
            "".length();
        }
    }
    
    private static void checkMultiplicity(final ChannelHandlerContext lllllllllllllIIIllIIIlIlIIlllIll) {
        final ChannelHandler lllllllllllllIIIllIIIlIlIIlllIlI = lllllllllllllIIIllIIIlIlIIlllIll.handler();
        if (lllIlIIIlIllIII((lllllllllllllIIIllIIIlIlIIlllIlI instanceof ChannelHandlerAdapter) ? 1 : 0)) {
            final ChannelHandlerAdapter lllllllllllllIIIllIIIlIlIIllllII = (ChannelHandlerAdapter)lllllllllllllIIIllIIIlIlIIlllIlI;
            if (lllIlIIIlIllIll(lllllllllllllIIIllIIIlIlIIllllII.isSharable() ? 1 : 0) && lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIIllllII.added ? 1 : 0)) {
                throw new ChannelPipelineException(String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIlIlIIllllII.getClass().getName()).append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[0]])));
            }
            lllllllllllllIIIllIIIlIlIIllllII.added = (DefaultChannelPipeline.lIlIIllIllIIII[2] != 0);
        }
    }
    
    @Override
    public ChannelPipeline addBefore(final String lllllllllllllIIIllIIIllIIlllIIIl, final String lllllllllllllIIIllIIIllIIllIllII, final ChannelHandler lllllllllllllIIIllIIIllIIllIllll) {
        return this.addBefore(null, lllllllllllllIIIllIIIllIIlllIIIl, lllllllllllllIIIllIIIllIIllIllII, lllllllllllllIIIllIIIllIIllIllll);
    }
    
    private void addAfter0(final String lllllllllllllIIIllIIIllIIIIllIll, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIIIllIlI, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIIIlIlIl) {
        this.checkDuplicateName(lllllllllllllIIIllIIIllIIIIllIll);
        checkMultiplicity(lllllllllllllIIIllIIIllIIIIlIlIl);
        lllllllllllllIIIllIIIllIIIIlIlIl.prev = lllllllllllllIIIllIIIllIIIIllIlI;
        lllllllllllllIIIllIIIllIIIIlIlIl.next = lllllllllllllIIIllIIIllIIIIllIlI.next;
        lllllllllllllIIIllIIIllIIIIllIlI.next.prev = lllllllllllllIIIllIIIllIIIIlIlIl;
        lllllllllllllIIIllIIIllIIIIllIlI.next = lllllllllllllIIIllIIIllIIIIlIlIl;
        this.name2ctx.put(lllllllllllllIIIllIIIllIIIIllIll, lllllllllllllIIIllIIIllIIIIlIlIl);
        "".length();
        this.callHandlerAdded(lllllllllllllIIIllIIIllIIIIlIlIl);
    }
    
    private static boolean lllIlIIIlIllIII(final int lllllllllllllIIIllIIIIlllIIIlllI) {
        return lllllllllllllIIIllIIIIlllIIIlllI != 0;
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress lllllllllllllIIIllIIIlIIIlIllIll, final ChannelPromise lllllllllllllIIIllIIIlIIIlIlIlll) {
        return this.tail.bind(lllllllllllllIIIllIIIlIIIlIllIll, lllllllllllllIIIllIIIlIIIlIlIlll);
    }
    
    @Override
    public ChannelPipeline addBefore(final EventExecutorGroup lllllllllllllIIIllIIIllIIlIllIIl, final String lllllllllllllIIIllIIIllIIlIlllIl, final String lllllllllllllIIIllIIIllIIlIlIlll, final ChannelHandler lllllllllllllIIIllIIIllIIlIllIll) {
        final Exception lllllllllllllIIIllIIIllIIlIlIlIl = (Exception)this;
        synchronized (this) {
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIllIIIIl = this.getContextOrDie(lllllllllllllIIIllIIIllIIlIlllIl);
            this.checkDuplicateName(lllllllllllllIIIllIIIllIIlIlIlll);
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIllIIIII = new DefaultChannelHandlerContext(this, lllllllllllllIIIllIIIllIIlIllIIl, lllllllllllllIIIllIIIllIIlIlIlll, lllllllllllllIIIllIIIllIIlIllIll);
            this.addBefore0(lllllllllllllIIIllIIIllIIlIlIlll, lllllllllllllIIIllIIIllIIllIIIIl, lllllllllllllIIIllIIIllIIllIIIII);
            // monitorexit(this)
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public ChannelHandler get(final String lllllllllllllIIIllIIIlIIlllIllII) {
        final ChannelHandlerContext lllllllllllllIIIllIIIlIIlllIlllI = this.context(lllllllllllllIIIllIIIlIIlllIllII);
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIlllIlllI)) {
            return null;
        }
        return lllllllllllllIIIllIIIlIIlllIlllI.handler();
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIIIllIIIlIIIlIlIIlI, final ChannelPromise lllllllllllllIIIllIIIlIIIlIlIIIl) {
        return this.tail.connect(lllllllllllllIIIllIIIlIIIlIlIIlI, lllllllllllllIIIllIIIlIIIlIlIIIl);
    }
    
    @Override
    public ChannelFuture write(final Object lllllllllllllIIIllIIIlIIIIlIIIlI, final ChannelPromise lllllllllllllIIIllIIIlIIIIIllllI) {
        return this.tail.write(lllllllllllllIIIllIIIlIIIIlIIIlI, lllllllllllllIIIllIIIlIIIIIllllI);
    }
    
    @Override
    public ChannelPipeline fireUserEventTriggered(final Object lllllllllllllIIIllIIIlIIlIIIllIl) {
        this.head.fireUserEventTriggered(lllllllllllllIIIllIIIlIIlIIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public ChannelFuture disconnect(final ChannelPromise lllllllllllllIIIllIIIlIIIIllllII) {
        return this.tail.disconnect(lllllllllllllIIIllIIIlIIIIllllII);
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    private static boolean lllIlIIIlIllIIl(final int lllllllllllllIIIllIIIIlllIIllIll, final int lllllllllllllIIIllIIIIlllIIllIlI) {
        return lllllllllllllIIIllIIIIlllIIllIll < lllllllllllllIIIllIIIIlllIIllIlI;
    }
    
    @Override
    public ChannelFuture disconnect() {
        return this.tail.disconnect();
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIIllIIIlIIlIlIllII = new StringBuilder();
        lllllllllllllIIIllIIIlIIlIlIllII.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIIIllIIIlIIlIlIllII.append((char)DefaultChannelPipeline.lIlIIllIllIIII[12]);
        "".length();
        AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIlIlIlIll = this.head.next;
        while (true) {
            while (!lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIlIlIlIll, this.tail)) {
                lllllllllllllIIIllIIIlIIlIlIllII.append((char)DefaultChannelPipeline.lIlIIllIllIIII[13]);
                "".length();
                lllllllllllllIIIllIIIlIIlIlIllII.append(lllllllllllllIIIllIIIlIIlIlIlIll.name());
                "".length();
                lllllllllllllIIIllIIIlIIlIlIllII.append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[14]]);
                "".length();
                lllllllllllllIIIllIIIlIIlIlIllII.append(lllllllllllllIIIllIIIlIIlIlIlIll.handler().getClass().getName());
                "".length();
                lllllllllllllIIIllIIIlIIlIlIllII.append((char)DefaultChannelPipeline.lIlIIllIllIIII[15]);
                "".length();
                lllllllllllllIIIllIIIlIIlIlIlIll = lllllllllllllIIIllIIIlIIlIlIlIll.next;
                if (lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIlIlIlIll, this.tail)) {
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                    lllllllllllllIIIllIIIlIIlIlIllII.append((char)DefaultChannelPipeline.lIlIIllIllIIII[17]);
                    "".length();
                    return String.valueOf(lllllllllllllIIIllIIIlIIlIlIllII);
                }
                else {
                    lllllllllllllIIIllIIIlIIlIlIllII.append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[16]]);
                    "".length();
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                    continue;
                }
            }
            "".length();
            if ((0x73 ^ 0x32 ^ (0xD9 ^ 0x9C)) != (" ".length() ^ (0x65 ^ 0x60))) {
                return null;
            }
            continue;
        }
    }
    
    @Override
    public Iterator<Map.Entry<String, ChannelHandler>> iterator() {
        return this.toMap().entrySet().iterator();
    }
    
    @Override
    public ChannelPipeline addFirst(final String lllllllllllllIIIllIIIllIlIllllll, final ChannelHandler lllllllllllllIIIllIIIllIlIlllllI) {
        return this.addFirst(null, lllllllllllllIIIllIIIllIlIllllll, lllllllllllllIIIllIIIllIlIlllllI);
    }
    
    @Override
    public ChannelPipeline fireChannelReadComplete() {
        this.head.fireChannelReadComplete();
        "".length();
        if (lllIlIIIlIllIII(this.channel.config().isAutoRead() ? 1 : 0)) {
            this.read();
            "".length();
        }
        return this;
    }
    
    @Override
    public ChannelPipeline addLast(final EventExecutorGroup lllllllllllllIIIllIIIllIlIIIlIII, final String lllllllllllllIIIllIIIllIlIIIIlll, final ChannelHandler lllllllllllllIIIllIIIllIlIIIIllI) {
        final boolean lllllllllllllIIIllIIIllIlIIIIlIl = (boolean)this;
        synchronized (this) {
            this.checkDuplicateName(lllllllllllllIIIllIIIllIlIIIIlll);
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIlIIIlllI = new DefaultChannelHandlerContext(this, lllllllllllllIIIllIIIllIlIIIlIII, lllllllllllllIIIllIIIllIlIIIIlll, lllllllllllllIIIllIIIllIlIIIIllI);
            this.addLast0(lllllllllllllIIIllIIIllIlIIIIlll, lllllllllllllIIIllIIIllIlIIIlllI);
            // monitorexit(this)
            "".length();
            if (null != null) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public ChannelHandler removeFirst() {
        if (lllIlIIIlIlllIl(this.head.next, this.tail)) {
            throw new NoSuchElementException();
        }
        return this.remove(this.head.next).handler();
    }
    
    @Override
    public ChannelPipeline addAfter(final String lllllllllllllIIIllIIIllIIlIIIIII, final String lllllllllllllIIIllIIIllIIIlllIll, final ChannelHandler lllllllllllllIIIllIIIllIIIlllllI) {
        return this.addAfter(null, lllllllllllllIIIllIIIllIIlIIIIII, lllllllllllllIIIllIIIllIIIlllIll, lllllllllllllIIIllIIIllIIIlllllI);
    }
    
    private void addLast0(final String lllllllllllllIIIllIIIllIIllllIIl, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIlllllII) {
        checkMultiplicity(lllllllllllllIIIllIIIllIIlllllII);
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIllllIll = this.tail.prev;
        lllllllllllllIIIllIIIllIIlllllII.prev = lllllllllllllIIIllIIIllIIllllIll;
        lllllllllllllIIIllIIIllIIlllllII.next = this.tail;
        lllllllllllllIIIllIIIllIIllllIll.next = lllllllllllllIIIllIIIllIIlllllII;
        this.tail.prev = lllllllllllllIIIllIIIllIIlllllII;
        this.name2ctx.put(lllllllllllllIIIllIIIllIIllllIIl, lllllllllllllIIIllIIIllIIlllllII);
        "".length();
        this.callHandlerAdded(lllllllllllllIIIllIIIllIIlllllII);
    }
    
    @Override
    public ChannelPipeline addAfter(final EventExecutorGroup lllllllllllllIIIllIIIllIIIlIllIl, final String lllllllllllllIIIllIIIllIIIlIIlll, final String lllllllllllllIIIllIIIllIIIlIlIll, final ChannelHandler lllllllllllllIIIllIIIllIIIlIIlIl) {
        final short lllllllllllllIIIllIIIllIIIlIIlII = (short)this;
        synchronized (this) {
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIIllIIII = this.getContextOrDie(lllllllllllllIIIllIIIllIIIlIIlll);
            this.checkDuplicateName(lllllllllllllIIIllIIIllIIIlIlIll);
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIIlIllll = new DefaultChannelHandlerContext(this, lllllllllllllIIIllIIIllIIIlIllIl, lllllllllllllIIIllIIIllIIIlIlIll, lllllllllllllIIIllIIIllIIIlIIlIl);
            this.addAfter0(lllllllllllllIIIllIIIllIIIlIlIll, lllllllllllllIIIllIIIllIIIllIIII, lllllllllllllIIIllIIIllIIIlIllll);
            // monitorexit(this)
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        return this;
    }
    
    private static void lllIlIIIIIllIll() {
        (lIlIIllIllIIII = new int[20])[0] = (0x3E ^ 0x3A);
        DefaultChannelPipeline.lIlIIllIllIIII[1] = ((0x70 ^ 0x46) & ~(0x90 ^ 0xA6));
        DefaultChannelPipeline.lIlIIllIllIIII[2] = " ".length();
        DefaultChannelPipeline.lIlIIllIllIIII[3] = "  ".length();
        DefaultChannelPipeline.lIlIIllIllIIII[4] = "   ".length();
        DefaultChannelPipeline.lIlIIllIllIIII[5] = (0x75 ^ 0x70);
        DefaultChannelPipeline.lIlIIllIllIIII[6] = (0x37 ^ 0x6B ^ (0x74 ^ 0x2E));
        DefaultChannelPipeline.lIlIIllIllIIII[7] = (0xBD ^ 0xBA);
        DefaultChannelPipeline.lIlIIllIllIIII[8] = (0xCB ^ 0x9A ^ (0x65 ^ 0x3C));
        DefaultChannelPipeline.lIlIIllIllIIII[9] = (0x56 ^ 0x5F);
        DefaultChannelPipeline.lIlIIllIllIIII[10] = (0xA7 ^ 0xAD);
        DefaultChannelPipeline.lIlIIllIllIIII[11] = (114 + 123 - 172 + 68 ^ 137 + 37 - 96 + 64);
        DefaultChannelPipeline.lIlIIllIllIIII[12] = (0x2C ^ 0x57);
        DefaultChannelPipeline.lIlIIllIllIIII[13] = (0x22 ^ 0x24 ^ (0x62 ^ 0x4C));
        DefaultChannelPipeline.lIlIIllIllIIII[14] = (0xC4 ^ 0x8C ^ (0x51 ^ 0x15));
        DefaultChannelPipeline.lIlIIllIllIIII[15] = (0x5B ^ 0x72);
        DefaultChannelPipeline.lIlIIllIllIIII[16] = (0x9 ^ 0x4);
        DefaultChannelPipeline.lIlIIllIllIIII[17] = (0xF3 ^ 0x8E);
        DefaultChannelPipeline.lIlIIllIllIIII[18] = (0x50 ^ 0x5E);
        DefaultChannelPipeline.lIlIIllIllIIII[19] = (123 + 86 - 46 + 1 ^ 3 + 149 - 117 + 136);
    }
    
    private static String generateName0(final Class<?> lllllllllllllIIIllIIIlIlllIIIlII) {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(lllllllllllllIIIllIIIlIlllIIIlII)).append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[4]]));
    }
    
    private static boolean lllIlIIIlIllIlI(final int lllllllllllllIIIllIIIIlllIIIlIlI) {
        return lllllllllllllIIIllIIIIlllIIIlIlI >= 0;
    }
    
    @Override
    public ChannelPipeline fireChannelUnregistered() {
        this.head.fireChannelUnregistered();
        "".length();
        if (lllIlIIIlIllIll(this.channel.isOpen() ? 1 : 0)) {
            this.teardownAll();
        }
        return this;
    }
    
    @Override
    public ChannelPipeline replace(final ChannelHandler lllllllllllllIIIllIIIlIllIIIIlIl, final String lllllllllllllIIIllIIIlIllIIIIlII, final ChannelHandler lllllllllllllIIIllIIIlIllIIIIIll) {
        this.replace(this.getContextOrDie(lllllllllllllIIIllIIIlIllIIIIlIl), lllllllllllllIIIllIIIlIllIIIIlII, lllllllllllllIIIllIIIlIllIIIIIll);
        "".length();
        return this;
    }
    
    private static boolean lllIlIIIlIllIll(final int lllllllllllllIIIllIIIIlllIIIllII) {
        return lllllllllllllIIIllIIIIlllIIIllII == 0;
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIIIllIIIlIIIllIllIl, final SocketAddress lllllllllllllIIIllIIIlIIIllIllll) {
        return this.tail.connect(lllllllllllllIIIllIIIlIIIllIllIl, lllllllllllllIIIllIIIlIIIllIllll);
    }
    
    private void addBefore0(final String lllllllllllllIIIllIIIllIIlIIlIII, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIlIIIlll, final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIIlIIIllI) {
        checkMultiplicity(lllllllllllllIIIllIIIllIIlIIIllI);
        lllllllllllllIIIllIIIllIIlIIIllI.prev = lllllllllllllIIIllIIIllIIlIIIlll.prev;
        lllllllllllllIIIllIIIllIIlIIIllI.next = lllllllllllllIIIllIIIllIIlIIIlll;
        lllllllllllllIIIllIIIllIIlIIIlll.prev.next = lllllllllllllIIIllIIIllIIlIIIllI;
        lllllllllllllIIIllIIIllIIlIIIlll.prev = lllllllllllllIIIllIIIllIIlIIIllI;
        this.name2ctx.put(lllllllllllllIIIllIIIllIIlIIlIII, lllllllllllllIIIllIIIllIIlIIIllI);
        "".length();
        this.callHandlerAdded(lllllllllllllIIIllIIIllIIlIIIllI);
    }
    
    @Override
    public ChannelPipeline fireChannelRead(final Object lllllllllllllIIIllIIIlIIlIIIlIIl) {
        this.head.fireChannelRead(lllllllllllllIIIllIIIlIIlIIIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public ChannelFuture close(final ChannelPromise lllllllllllllIIIllIIIlIIIIllIllI) {
        return this.tail.close(lllllllllllllIIIllIIIlIIIIllIllI);
    }
    
    @Override
    public ChannelPipeline fireChannelActive() {
        this.head.fireChannelActive();
        "".length();
        if (lllIlIIIlIllIII(this.channel.config().isAutoRead() ? 1 : 0)) {
            this.channel.read();
            "".length();
        }
        return this;
    }
    
    private void callHandlerAdded0(final ChannelHandlerContext lllllllllllllIIIllIIIlIlIIlIIlll) {
        try {
            lllllllllllllIIIllIIIlIlIIlIIlll.handler().handlerAdded(lllllllllllllIIIllIIIlIlIIlIIlll);
            "".length();
            if ((0x2 ^ 0x14 ^ (0x38 ^ 0x2A)) == -" ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIIllIIIlIlIIlIlIIl) {
            boolean lllllllllllllIIIllIIIlIlIIlIlIlI = DefaultChannelPipeline.lIlIIllIllIIII[1] != 0;
            try {
                this.remove((AbstractChannelHandlerContext)lllllllllllllIIIllIIIlIlIIlIIlll);
                "".length();
                lllllllllllllIIIllIIIlIlIIlIlIlI = (DefaultChannelPipeline.lIlIIllIllIIII[2] != 0);
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIllIIIlIlIIlIlIll) {
                if (lllIlIIIlIllIII(DefaultChannelPipeline.logger.isWarnEnabled() ? 1 : 0)) {
                    DefaultChannelPipeline.logger.warn(String.valueOf(new StringBuilder().append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[5]]).append(lllllllllllllIIIllIIIlIlIIlIIlll.name())), lllllllllllllIIIllIIIlIlIIlIlIll);
                }
            }
            if (lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIIlIlIlI ? 1 : 0)) {
                this.fireExceptionCaught(new ChannelPipelineException(String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIlIlIIlIIlll.handler().getClass().getName()).append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[6]])), lllllllllllllIIIllIIIlIlIIlIlIIl));
                "".length();
                "".length();
                if (" ".length() < ("   ".length() & ~"   ".length())) {
                    return;
                }
            }
            else {
                this.fireExceptionCaught(new ChannelPipelineException(String.valueOf(new StringBuilder().append(lllllllllllllIIIllIIIlIlIIlIIlll.handler().getClass().getName()).append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[7]])), lllllllllllllIIIllIIIlIlIIlIlIIl));
                "".length();
            }
        }
    }
    
    @Override
    public ChannelPipeline addLast(final EventExecutorGroup lllllllllllllIIIllIIIlIllllIlIlI, final ChannelHandler... lllllllllllllIIIllIIIlIllllIIllI) {
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIllllIIllI)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[3]]);
        }
        final ChannelHandler[] lllllllllllllIIIllIIIlIllllIlllI = lllllllllllllIIIllIIIlIllllIIllI;
        final int lllllllllllllIIIllIIIlIllllIllIl = lllllllllllllIIIllIIIlIllllIlllI.length;
        int lllllllllllllIIIllIIIlIllllIllII = DefaultChannelPipeline.lIlIIllIllIIII[1];
        while (lllIlIIIlIllIIl(lllllllllllllIIIllIIIlIllllIllII, lllllllllllllIIIllIIIlIllllIllIl)) {
            final ChannelHandler lllllllllllllIIIllIIIlIllllIllll = lllllllllllllIIIllIIIlIllllIlllI[lllllllllllllIIIllIIIlIllllIllII];
            if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIllllIllll)) {
                "".length();
                if ((0x80 ^ 0x84) == "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                this.addLast(lllllllllllllIIIllIIIlIllllIlIlI, this.generateName(lllllllllllllIIIllIIIlIllllIllll), lllllllllllllIIIllIIIlIllllIllll);
                "".length();
                ++lllllllllllllIIIllIIIlIllllIllII;
                "".length();
                if (-(95 + 5 + 22 + 16 ^ 26 + 47 - 27 + 96) >= 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    @Override
    public ChannelHandler first() {
        final ChannelHandlerContext lllllllllllllIIIllIIIlIlIIIIlIII = this.firstContext();
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIlIIIIlIII)) {
            return null;
        }
        return lllllllllllllIIIllIIIlIlIIIIlIII.handler();
    }
    
    private static String lllIlIIIIIllIII(final String lllllllllllllIIIllIIIIlllIlIIIIl, final String lllllllllllllIIIllIIIIlllIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIlllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIIIlllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIIIlllIlIIlIl.init(DefaultChannelPipeline.lIlIIllIllIIII[3], lllllllllllllIIIllIIIIlllIlIIllI);
            return new String(lllllllllllllIIIllIIIIlllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIlllIlIIlII) {
            lllllllllllllIIIllIIIIlllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIlIIIIIllIll();
        lllIlIIIIIllIlI();
        int $assertionsDisabled2;
        if (lllIlIIIlIllIll(DefaultChannelPipeline.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = DefaultChannelPipeline.lIlIIllIllIIII[2];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = DefaultChannelPipeline.lIlIIllIllIIII[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(DefaultChannelPipeline.class);
        nameCaches = new WeakHashMap[Runtime.getRuntime().availableProcessors()];
        int lllllllllllllIIIllIIIIllllIlIIIl = DefaultChannelPipeline.lIlIIllIllIIII[1];
        while (lllIlIIIlIllIIl(lllllllllllllIIIllIIIIllllIlIIIl, DefaultChannelPipeline.nameCaches.length)) {
            DefaultChannelPipeline.nameCaches[lllllllllllllIIIllIIIIllllIlIIIl] = new WeakHashMap<Class<?>, String>();
            ++lllllllllllllIIIllIIIIllllIlIIIl;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }
    
    @Override
    public ChannelPipeline addFirst(final EventExecutorGroup lllllllllllllIIIllIIIllIlIllIIII, final String lllllllllllllIIIllIIIllIlIllIIll, final ChannelHandler lllllllllllllIIIllIIIllIlIllIIlI) {
        final String lllllllllllllIIIllIIIllIlIlIllIl = (String)this;
        synchronized (this) {
            this.checkDuplicateName(lllllllllllllIIIllIIIllIlIllIIll);
            final AbstractChannelHandlerContext lllllllllllllIIIllIIIllIlIllIllI = new DefaultChannelHandlerContext(this, lllllllllllllIIIllIIIllIlIllIIII, lllllllllllllIIIllIIIllIlIllIIll, lllllllllllllIIIllIIIllIlIllIIlI);
            this.addFirst0(lllllllllllllIIIllIIIllIlIllIIll, lllllllllllllIIIllIIIllIlIllIllI);
            // monitorexit(this)
            "".length();
            if ((0x9A ^ 0x9E) <= ((0xD4 ^ 0xC4) & ~(0xAA ^ 0xBA))) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public ChannelFuture close() {
        return this.tail.close();
    }
    
    @Override
    public ChannelPipeline flush() {
        this.tail.flush();
        "".length();
        return this;
    }
    
    @Override
    public ChannelHandlerContext firstContext() {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIIIIIIlI = this.head.next;
        if (lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIlIIIIIIlI, this.tail)) {
            return null;
        }
        return this.head.next;
    }
    
    private static String lllIlIIIIIlIlll(String lllllllllllllIIIllIIIIlllIllIIll, final String lllllllllllllIIIllIIIIlllIllIlll) {
        lllllllllllllIIIllIIIIlllIllIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlllIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIIlllIllIllI = new StringBuilder();
        final char[] lllllllllllllIIIllIIIIlllIllIlIl = lllllllllllllIIIllIIIIlllIllIlll.toCharArray();
        int lllllllllllllIIIllIIIIlllIllIlII = DefaultChannelPipeline.lIlIIllIllIIII[1];
        final char lllllllllllllIIIllIIIIlllIlIlllI = (Object)lllllllllllllIIIllIIIIlllIllIIll.toCharArray();
        final double lllllllllllllIIIllIIIIlllIlIllIl = lllllllllllllIIIllIIIIlllIlIlllI.length;
        boolean lllllllllllllIIIllIIIIlllIlIllII = DefaultChannelPipeline.lIlIIllIllIIII[1] != 0;
        while (lllIlIIIlIllIIl(lllllllllllllIIIllIIIIlllIlIllII ? 1 : 0, (int)lllllllllllllIIIllIIIIlllIlIllIl)) {
            final char lllllllllllllIIIllIIIIlllIlllIIl = lllllllllllllIIIllIIIIlllIlIlllI[lllllllllllllIIIllIIIIlllIlIllII];
            lllllllllllllIIIllIIIIlllIllIllI.append((char)(lllllllllllllIIIllIIIIlllIlllIIl ^ lllllllllllllIIIllIIIIlllIllIlIl[lllllllllllllIIIllIIIIlllIllIlII % lllllllllllllIIIllIIIIlllIllIlIl.length]));
            "".length();
            ++lllllllllllllIIIllIIIIlllIllIlII;
            ++lllllllllllllIIIllIIIIlllIlIllII;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIIlllIllIllI);
    }
    
    @Override
    public List<String> names() {
        final List<String> lllllllllllllIIIllIIIlIIllIIIIIl = new ArrayList<String>();
        AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIllIIIIII = this.head.next;
        while (!lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIIIIII)) {
            lllllllllllllIIIllIIIlIIllIIIIIl.add(lllllllllllllIIIllIIIlIIllIIIIII.name());
            "".length();
            lllllllllllllIIIllIIIlIIllIIIIII = lllllllllllllIIIllIIIlIIllIIIIII.next;
            "".length();
            if (((0xF1 ^ 0x84 ^ (0x6D ^ 0xD)) & (98 + 91 - 127 + 116 ^ 99 + 124 - 156 + 100 ^ -" ".length())) >= (184 + 178 - 329 + 158 ^ 170 + 180 - 223 + 60)) {
                return null;
            }
        }
        return lllllllllllllIIIllIIIlIIllIIIIIl;
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object lllllllllllllIIIllIIIlIIIIIlIIIl) {
        return this.tail.writeAndFlush(lllllllllllllIIIllIIIlIIIIIlIIIl);
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIIIllIIIlIIIlllIlll) {
        return this.tail.connect(lllllllllllllIIIllIIIlIIIlllIlll);
    }
    
    private static String lllIlIIIIIllIIl(final String lllllllllllllIIIllIIIIllllIIIllI, final String lllllllllllllIIIllIIIIllllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIllllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIllllIIIlll.getBytes(StandardCharsets.UTF_8)), DefaultChannelPipeline.lIlIIllIllIIII[8]), "DES");
            final Cipher lllllllllllllIIIllIIIIllllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIIIIllllIIlIlI.init(DefaultChannelPipeline.lIlIIllIllIIII[3], lllllllllllllIIIllIIIIllllIIlIll);
            return new String(lllllllllllllIIIllIIIIllllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIllllIIlIIl) {
            lllllllllllllIIIllIIIIllllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelPipeline addLast(final ChannelHandler... lllllllllllllIIIllIIIlIllllllIIl) {
        return this.addLast((EventExecutorGroup)null, lllllllllllllIIIllIIIlIllllllIIl);
    }
    
    private static void waitForFuture(final Future<?> lllllllllllllIIIllIIIlIlIIIIlllI) {
        try {
            lllllllllllllIIIllIIIlIlIIIIlllI.get();
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (ExecutionException lllllllllllllIIIllIIIlIlIIIlIIII) {
            PlatformDependent.throwException(lllllllllllllIIIllIIIlIlIIIlIIII.getCause());
            "".length();
            if (((0x3 ^ 0x1A) & ~(0x1C ^ 0x5)) >= (0x97 ^ 0x93)) {
                return;
            }
        }
        catch (InterruptedException lllllllllllllIIIllIIIlIlIIIIllll) {
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public ChannelPipeline read() {
        this.tail.read();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPipeline addFirst(final ChannelHandler... lllllllllllllIIIllIIIllIIIIlIIIl) {
        return this.addFirst((EventExecutorGroup)null, lllllllllllllIIIllIIIllIIIIlIIIl);
    }
    
    private static void lllIlIIIIIllIlI() {
        (lIlIIllIlIllll = new String[DefaultChannelPipeline.lIlIIllIllIIII[19]])[DefaultChannelPipeline.lIlIIllIllIIII[1]] = lllIlIIIIIlIlll("JQMNAQojBw==", "Fklod");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[2]] = lllIlIIIIIlIlll("BgUqJhULFjc=", "ndDBy");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[3]] = lllIlIIIIIllIII("X+hVfAZK1IZdP/9HbjIJaw==", "SlVVX");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[4]] = lllIlIIIIIlIlll("cHU=", "SEIWZ");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[0]] = lllIlIIIIIllIII("owUt3QT9RwKP2J6RmshVcJ8+WjVLv9lte4/c16COU+shuP9zDONTCnH7ZJbwlJgE/Rcwb9jos6SvUkIvGWTPqD8FXJkp7bf5LhK5RiOFv7U=", "DoxmK");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[5]] = lllIlIIIIIlIlll("CDIiKQMqcz8qRjw2JioQK3MqZQ4vPS8pAzxpaw==", "NSKEf");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[6]] = lllIlIIIIIllIII("8E87KuxtQ5lgb4l7YpOzNpfr/6FrJ2kPk2OGBAdISpvRexJUad6Ph5Lpbq2kQxKMWVkC/Td/5Vo=", "KiqMx");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[7]] = lllIlIIIIIllIIl("Xos2p/hUlO3mUkMAvhXj2u5CuRcqMG7gbaAQcUfpaU1v6rLMf1KxVfjjNunOaGjo1pFeWWqzxVwTXr+QAFumFw==", "evAop");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[8]] = lllIlIIIIIlIlll("dh4TBis0EwA6KjUZBA0rcF9SAC4rVgYAPTcBHEguNlYXECw9BgYBIDZY", "XvrhO");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[9]] = lllIlIIIIIllIIl("bzmZNNrQldM=", "MKQsA");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[10]] = lllIlIIIIIlIlll("JCo/Cg4pOQ==", "LKQnb");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[11]] = lllIlIIIIIllIII("EDYBk99HvXDZx7AXYBhxmQ==", "HiaXm");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[14]] = lllIlIIIIIllIIl("G0paBSyn1iE=", "eJhLz");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[16]] = lllIlIIIIIllIIl("3J+79ML+0sg=", "EAWMd");
        DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[18]] = lllIlIIIIIllIII("iMh9SGIKmVJ1plCSAVWUTL5UiSEo+FLPq+T/rTUx2No=", "INyqw");
    }
    
    @Override
    public ChannelFuture connect(final SocketAddress lllllllllllllIIIllIIIlIIIlIIlIII, final SocketAddress lllllllllllllIIIllIIIlIIIlIIIIll, final ChannelPromise lllllllllllllIIIllIIIlIIIlIIIIlI) {
        return this.tail.connect(lllllllllllllIIIllIIIlIIIlIIlIII, lllllllllllllIIIllIIIlIIIlIIIIll, lllllllllllllIIIllIIIlIIIlIIIIlI);
    }
    
    @Override
    public ChannelHandler removeLast() {
        if (lllIlIIIlIlllIl(this.head.next, this.tail)) {
            throw new NoSuchElementException();
        }
        return this.remove(this.tail.prev).handler();
    }
    
    void remove0(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIllIIllIll) {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIllIIllIlI = lllllllllllllIIIllIIIlIllIIllIll.prev;
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIllIIllIIl = lllllllllllllIIIllIIIlIllIIllIll.next;
        lllllllllllllIIIllIIIlIllIIllIlI.next = lllllllllllllIIIllIIIlIllIIllIIl;
        lllllllllllllIIIllIIIlIllIIllIIl.prev = lllllllllllllIIIllIIIlIllIIllIlI;
        this.name2ctx.remove(lllllllllllllIIIllIIIlIllIIllIll.name());
        "".length();
        this.callHandlerRemoved(lllllllllllllIIIllIIIlIllIIllIll);
    }
    
    @Override
    public ChannelHandler replace(final String lllllllllllllIIIllIIIlIlIllllIIl, final String lllllllllllllIIIllIIIlIlIllllIII, final ChannelHandler lllllllllllllIIIllIIIlIlIllllIll) {
        return this.replace(this.getContextOrDie(lllllllllllllIIIllIIIlIlIllllIIl), lllllllllllllIIIllIIIlIlIllllIII, lllllllllllllIIIllIIIlIlIllllIll);
    }
    
    @Override
    public ChannelPipeline remove(final ChannelHandler lllllllllllllIIIllIIIlIllIllllIl) {
        this.remove(this.getContextOrDie(lllllllllllllIIIllIIIlIllIllllIl));
        "".length();
        return this;
    }
    
    @Override
    public <T extends ChannelHandler> T replace(final Class<T> lllllllllllllIIIllIIIlIlIllIllIl, final String lllllllllllllIIIllIIIlIlIllIllII, final ChannelHandler lllllllllllllIIIllIIIlIlIllIllll) {
        return (T)this.replace(this.getContextOrDie(lllllllllllllIIIllIIIlIlIllIllIl), lllllllllllllIIIllIIIlIlIllIllII, lllllllllllllIIIllIIIlIlIllIllll);
    }
    
    @Override
    public ChannelPipeline fireExceptionCaught(final Throwable lllllllllllllIIIllIIIlIIlIIlIIll) {
        this.head.fireExceptionCaught(lllllllllllllIIIllIIIlIIlIIlIIll);
        "".length();
        return this;
    }
    
    @Override
    public <T extends ChannelHandler> T remove(final Class<T> lllllllllllllIIIllIIIlIllIllIIll) {
        return (T)this.remove(this.getContextOrDie(lllllllllllllIIIllIIIlIllIllIIll)).handler();
    }
    
    private AbstractChannelHandlerContext getContextOrDie(final String lllllllllllllIIIllIIIlIIIIIIIIIl) {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIIIIIIIll = (AbstractChannelHandlerContext)this.context(lllllllllllllIIIllIIIlIIIIIIIIIl);
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIIIIIIIll)) {
            throw new NoSuchElementException(lllllllllllllIIIllIIIlIIIIIIIIIl);
        }
        return lllllllllllllIIIllIIIlIIIIIIIIll;
    }
    
    @Override
    public Map<String, ChannelHandler> toMap() {
        final Map<String, ChannelHandler> lllllllllllllIIIllIIIlIIlIlllIII = new LinkedHashMap<String, ChannelHandler>();
        AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIlIllIlll = this.head.next;
        while (!lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIlIllIlll, this.tail)) {
            lllllllllllllIIIllIIIlIIlIlllIII.put(lllllllllllllIIIllIIIlIIlIllIlll.name(), lllllllllllllIIIllIIIlIIlIllIlll.handler());
            "".length();
            lllllllllllllIIIllIIIlIIlIllIlll = lllllllllllllIIIllIIIlIIlIllIlll.next;
            "".length();
            if (-(0xB1 ^ 0xB5) > 0) {
                return null;
            }
        }
        return lllllllllllllIIIllIIIlIIlIlllIII;
    }
    
    @Override
    public ChannelHandler last() {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIllllllII = this.tail.prev;
        if (lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIllllllII, this.head)) {
            return null;
        }
        return lllllllllllllIIIllIIIlIIllllllII.handler();
    }
    
    private static boolean lllIlIIIIIlllII(final Object lllllllllllllIIIllIIIIlllIIlIIII) {
        return lllllllllllllIIIllIIIIlllIIlIIII == null;
    }
    
    private void callHandlerAdded(final ChannelHandlerContext lllllllllllllIIIllIIIlIlIIllIIIl) {
        if (lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIIllIIIl.channel().isRegistered() ? 1 : 0) && lllIlIIIlIllIll(lllllllllllllIIIllIIIlIlIIllIIIl.executor().inEventLoop() ? 1 : 0)) {
            lllllllllllllIIIllIIIlIlIIllIIIl.executor().execute(new Runnable() {
                @Override
                public void run() {
                    DefaultChannelPipeline.this.callHandlerAdded0(lllllllllllllIIIllIIIlIlIIllIIIl);
                }
            });
            return;
        }
        this.callHandlerAdded0(lllllllllllllIIIllIIIlIlIIllIIIl);
    }
    
    private static boolean lllIlIIIlIlllII(final Object lllllllllllllIIIllIIIIlllIIlIlll, final Object lllllllllllllIIIllIIIIlllIIlIllI) {
        return lllllllllllllIIIllIIIIlllIIlIlll != lllllllllllllIIIllIIIIlllIIlIllI;
    }
    
    public DefaultChannelPipeline(final AbstractChannel lllllllllllllIIIllIIIllIllIIllII) {
        this.name2ctx = new HashMap<String, AbstractChannelHandlerContext>(DefaultChannelPipeline.lIlIIllIllIIII[0]);
        this.childExecutors = new IdentityHashMap<EventExecutorGroup, EventExecutor>();
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIllIllIIllII)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[1]]);
        }
        this.channel = lllllllllllllIIIllIIIllIllIIllII;
        this.tail = new TailContext(this);
        this.head = new HeadContext(this);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    private AbstractChannelHandlerContext remove(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIllIlIIlIl) {
        if (lllIlIIIlIllIll(DefaultChannelPipeline.$assertionsDisabled ? 1 : 0) && (!lllIlIIIlIlllII(lllllllllllllIIIllIIIlIllIlIIlIl, this.head) || lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIllIlIIlIl, this.tail))) {
            throw new AssertionError();
        }
        final char lllllllllllllIIIllIIIlIllIlIIIlI = (char)this;
        final Future<?> lllllllllllllIIIllIIIlIllIlIIlll;
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIllIlIlIII;
        synchronized (this) {
            if (!lllIlIIIlIllIII(lllllllllllllIIIllIIIlIllIlIIlIl.channel().isRegistered() ? 1 : 0) || lllIlIIIlIllIII(lllllllllllllIIIllIIIlIllIlIIlIl.executor().inEventLoop() ? 1 : 0)) {
                this.remove0(lllllllllllllIIIllIIIlIllIlIIlIl);
                return lllllllllllllIIIllIIIlIllIlIIlIl;
            }
            lllllllllllllIIIllIIIlIllIlIIlll = lllllllllllllIIIllIIIlIllIlIIlIl.executor().submit((Runnable)new Runnable() {
                @Override
                public void run() {
                    synchronized (DefaultChannelPipeline.this) {
                        DefaultChannelPipeline.this.remove0(lllllllllllllIIIllIIIlIllIlIIlIl);
                        // monitorexit(this.this$0)
                        "".length();
                        if (((0xA0 ^ 0x83) & ~(0x9B ^ 0xB8)) > "   ".length()) {
                            return;
                        }
                    }
                }
            });
            lllllllllllllIIIllIIIlIllIlIlIII = lllllllllllllIIIllIIIlIllIlIIlIl;
            // monitorexit(this)
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        waitForFuture(lllllllllllllIIIllIIIlIllIlIIlll);
        return lllllllllllllIIIllIIIlIllIlIlIII;
    }
    
    @Override
    public ChannelPipeline addFirst(final EventExecutorGroup lllllllllllllIIIllIIIllIIIIIIlIl, final ChannelHandler... lllllllllllllIIIllIIIllIIIIIIlII) {
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIllIIIIIIlII)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[2]]);
        }
        if (!lllIlIIIlIllIII(lllllllllllllIIIllIIIllIIIIIIlII.length) || lllIlIIIIIlllII(lllllllllllllIIIllIIIllIIIIIIlII[DefaultChannelPipeline.lIlIIllIllIIII[1]])) {
            return this;
        }
        int lllllllllllllIIIllIIIllIIIIIIIll = DefaultChannelPipeline.lIlIIllIllIIII[2];
        while (lllIlIIIlIllIIl(lllllllllllllIIIllIIIllIIIIIIIll, lllllllllllllIIIllIIIllIIIIIIlII.length)) {
            if (lllIlIIIIIlllII(lllllllllllllIIIllIIIllIIIIIIlII[lllllllllllllIIIllIIIllIIIIIIIll])) {
                "".length();
                if (-" ".length() >= (0x3 ^ 0x23 ^ (0x22 ^ 0x6))) {
                    return null;
                }
                break;
            }
            else {
                ++lllllllllllllIIIllIIIllIIIIIIIll;
                "".length();
                if ((0x6E ^ 0x6A) < 0) {
                    return null;
                }
                continue;
            }
        }
        int lllllllllllllIIIllIIIllIIIIIIlll = lllllllllllllIIIllIIIllIIIIIIIll - DefaultChannelPipeline.lIlIIllIllIIII[2];
        while (lllIlIIIlIllIlI(lllllllllllllIIIllIIIllIIIIIIlll)) {
            final ChannelHandler lllllllllllllIIIllIIIllIIIIIlIII = lllllllllllllIIIllIIIllIIIIIIlII[lllllllllllllIIIllIIIllIIIIIIlll];
            this.addFirst(lllllllllllllIIIllIIIllIIIIIIlIl, this.generateName(lllllllllllllIIIllIIIllIIIIIlIII), lllllllllllllIIIllIIIllIIIIIlIII);
            "".length();
            --lllllllllllllIIIllIIIllIIIIIIlll;
            "".length();
            if ("   ".length() > (0x74 ^ 0x70)) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public ChannelFuture deregister() {
        return this.tail.deregister();
    }
    
    private void checkDuplicateName(final String lllllllllllllIIIllIIIlIIIIIIlIIl) {
        if (lllIlIIIlIllIII(this.name2ctx.containsKey(lllllllllllllIIIllIIIlIIIIIIlIIl) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[18]]).append(lllllllllllllIIIllIIIlIIIIIIlIIl)));
        }
    }
    
    @Override
    public ChannelFuture bind(final SocketAddress lllllllllllllIIIllIIIlIIIlllllIl) {
        return this.tail.bind(lllllllllllllIIIllIIIlIIIlllllIl);
    }
    
    @Override
    public ChannelPipeline fireChannelRegistered() {
        this.head.fireChannelRegistered();
        "".length();
        return this;
    }
    
    @Override
    public ChannelHandler remove(final String lllllllllllllIIIllIIIlIllIllIlll) {
        return this.remove(this.getContextOrDie(lllllllllllllIIIllIIIlIllIllIlll)).handler();
    }
    
    @Override
    public ChannelHandlerContext context(final ChannelHandler lllllllllllllIIIllIIIlIIllIlIIll) {
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIlIIll)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[10]]);
        }
        AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIllIlIIlI = this.head.next;
        while (!lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIlIIlI)) {
            if (lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIllIlIIlI.handler(), lllllllllllllIIIllIIIlIIllIlIIll)) {
                return lllllllllllllIIIllIIIlIIllIlIIlI;
            }
            lllllllllllllIIIllIIIlIIllIlIIlI = lllllllllllllIIIllIIIlIIllIlIIlI.next;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return null;
    }
    
    @Override
    public ChannelPipeline fireChannelWritabilityChanged() {
        this.head.fireChannelWritabilityChanged();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPipeline addLast(final String lllllllllllllIIIllIIIllIlIIllIlI, final ChannelHandler lllllllllllllIIIllIIIllIlIIlIllI) {
        return this.addLast(null, lllllllllllllIIIllIIIllIlIIllIlI, lllllllllllllIIIllIIIllIlIIlIllI);
    }
    
    private void callHandlerRemoved(final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIlIIIllllI) {
        if (lllIlIIIlIllIII(lllllllllllllIIIllIIIlIlIIIllllI.channel().isRegistered() ? 1 : 0) && lllIlIIIlIllIll(lllllllllllllIIIllIIIlIlIIIllllI.executor().inEventLoop() ? 1 : 0)) {
            lllllllllllllIIIllIIIlIlIIIllllI.executor().execute(new Runnable() {
                @Override
                public void run() {
                    DefaultChannelPipeline.this.callHandlerRemoved0(lllllllllllllIIIllIIIlIlIIIllllI);
                }
            });
            return;
        }
        this.callHandlerRemoved0(lllllllllllllIIIllIIIlIlIIIllllI);
    }
    
    private static boolean lllIlIIIlIlllIl(final Object lllllllllllllIIIllIIIIlllIIlIIll, final Object lllllllllllllIIIllIIIIlllIIlIIlI) {
        return lllllllllllllIIIllIIIIlllIIlIIll == lllllllllllllIIIllIIIIlllIIlIIlI;
    }
    
    @Override
    public ChannelHandlerContext context(final Class<? extends ChannelHandler> lllllllllllllIIIllIIIlIIllIIIlll) {
        if (lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIIIlll)) {
            throw new NullPointerException(DefaultChannelPipeline.lIlIIllIlIllll[DefaultChannelPipeline.lIlIIllIllIIII[11]]);
        }
        AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIllIIlIIl = this.head.next;
        while (!lllIlIIIIIlllII(lllllllllllllIIIllIIIlIIllIIlIIl)) {
            if (lllIlIIIlIllIII(lllllllllllllIIIllIIIlIIllIIIlll.isAssignableFrom(lllllllllllllIIIllIIIlIIllIIlIIl.handler().getClass()) ? 1 : 0)) {
                return lllllllllllllIIIllIIIlIIllIIlIIl;
            }
            lllllllllllllIIIllIIIlIIllIIlIIl = lllllllllllllIIIllIIIlIIllIIlIIl.next;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return null;
    }
    
    @Override
    public ChannelHandlerContext lastContext() {
        final AbstractChannelHandlerContext lllllllllllllIIIllIIIlIIllllIllI = this.tail.prev;
        if (lllIlIIIlIlllIl(lllllllllllllIIIllIIIlIIllllIllI, this.head)) {
            return null;
        }
        return lllllllllllllIIIllIIIlIIllllIllI;
    }
    
    @Override
    public ChannelFuture writeAndFlush(final Object lllllllllllllIIIllIIIlIIIIIllIIl, final ChannelPromise lllllllllllllIIIllIIIlIIIIIlIlIl) {
        return this.tail.writeAndFlush(lllllllllllllIIIllIIIlIIIIIllIIl, lllllllllllllIIIllIIIlIIIIIlIlIl);
    }
    
    static final class HeadContext extends AbstractChannelHandlerContext implements ChannelOutboundHandler
    {
        private static final /* synthetic */ String HEAD_NAME;
        private static final /* synthetic */ int[] lIIlllIlIIIIII;
        protected final /* synthetic */ Channel.Unsafe unsafe;
        
        @Override
        public ChannelHandler handler() {
            return this;
        }
        
        static {
            llIllIllIlIIlII();
            HEAD_NAME = generateName0(HeadContext.class);
        }
        
        @Override
        public void handlerRemoved(final ChannelHandlerContext lllllllllllllIIlIlIIIIIlIIIlIIIl) throws Exception {
        }
        
        @Override
        public void deregister(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIlllIlIII, final ChannelPromise lllllllllllllIIlIlIIIIIIlllIIlll) throws Exception {
            this.unsafe.deregister(lllllllllllllIIlIlIIIIIIlllIIlll);
        }
        
        @Override
        public void write(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIllIlllII, final Object lllllllllllllIIlIlIIIIIIllIllIII, final ChannelPromise lllllllllllllIIlIlIIIIIIllIllIlI) throws Exception {
            this.unsafe.write(lllllllllllllIIlIlIIIIIIllIllIII, lllllllllllllIIlIlIIIIIIllIllIlI);
        }
        
        HeadContext(final DefaultChannelPipeline lllllllllllllIIlIlIIIIIlIIIllIlI) {
            super(lllllllllllllIIlIlIIIIIlIIIllIlI, null, HeadContext.HEAD_NAME, (boolean)(HeadContext.lIIlllIlIIIIII[0] != 0), (boolean)(HeadContext.lIIlllIlIIIIII[1] != 0));
            this.unsafe = lllllllllllllIIlIlIIIIIlIIIllIlI.channel().unsafe();
        }
        
        @Override
        public void flush(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIllIlIlII) throws Exception {
            this.unsafe.flush();
        }
        
        @Override
        public void bind(final ChannelHandlerContext lllllllllllllIIlIlIIIIIlIIIIllII, final SocketAddress lllllllllllllIIlIlIIIIIlIIIIlIll, final ChannelPromise lllllllllllllIIlIlIIIIIlIIIIIlll) throws Exception {
            this.unsafe.bind(lllllllllllllIIlIlIIIIIlIIIIlIll, lllllllllllllIIlIlIIIIIlIIIIIlll);
        }
        
        @Override
        public void disconnect(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIllllIllI, final ChannelPromise lllllllllllllIIlIlIIIIIIllllIlIl) throws Exception {
            this.unsafe.disconnect(lllllllllllllIIlIlIIIIIIllllIlIl);
        }
        
        @Override
        public void exceptionCaught(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIllIIllll, final Throwable lllllllllllllIIlIlIIIIIIllIIllII) throws Exception {
            lllllllllllllIIlIlIIIIIIllIIllll.fireExceptionCaught(lllllllllllllIIlIlIIIIIIllIIllII);
            "".length();
        }
        
        @Override
        public void connect(final ChannelHandlerContext lllllllllllllIIlIlIIIIIlIIIIIIIl, final SocketAddress lllllllllllllIIlIlIIIIIlIIIIIIII, final SocketAddress lllllllllllllIIlIlIIIIIIlllllIll, final ChannelPromise lllllllllllllIIlIlIIIIIIlllllIlI) throws Exception {
            this.unsafe.connect(lllllllllllllIIlIlIIIIIlIIIIIIII, lllllllllllllIIlIlIIIIIIlllllIll, lllllllllllllIIlIlIIIIIIlllllIlI);
        }
        
        @Override
        public void handlerAdded(final ChannelHandlerContext lllllllllllllIIlIlIIIIIlIIIlIIll) throws Exception {
        }
        
        @Override
        public void read(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIlllIIIlI) {
            this.unsafe.beginRead();
        }
        
        @Override
        public void close(final ChannelHandlerContext lllllllllllllIIlIlIIIIIIlllIllll, final ChannelPromise lllllllllllllIIlIlIIIIIIlllIllII) throws Exception {
            this.unsafe.close(lllllllllllllIIlIlIIIIIIlllIllII);
        }
        
        private static void llIllIllIlIIlII() {
            (lIIlllIlIIIIII = new int[2])[0] = ((0x6E ^ 0x6B ^ (0x5A ^ 0x69)) & (0x87 ^ 0x9C ^ (0x6E ^ 0x43) ^ -" ".length()));
            HeadContext.lIIlllIlIIIIII[1] = " ".length();
        }
    }
    
    static final class TailContext extends AbstractChannelHandlerContext implements ChannelInboundHandler
    {
        private static final /* synthetic */ String[] llIlllIlIIIlll;
        private static final /* synthetic */ String TAIL_NAME;
        private static final /* synthetic */ int[] llIlllIlIIlIII;
        
        @Override
        public void channelInactive(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIlIIII) throws Exception {
        }
        
        @Override
        public void channelRegistered(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIlIllI) throws Exception {
        }
        
        private static String lIIllIIllIlIIIIl(final String llllllllllllIllIIlIIlIlIlIllIIIl, final String llllllllllllIllIIlIIlIlIlIllIIII) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIlIlIlIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIlIlIllIIII.getBytes(StandardCharsets.UTF_8)), TailContext.llIlllIlIIlIII[3]), "DES");
                final Cipher llllllllllllIllIIlIIlIlIlIllIIll = Cipher.getInstance("DES");
                llllllllllllIllIIlIIlIlIlIllIIll.init(TailContext.llIlllIlIIlIII[2], llllllllllllIllIIlIIlIlIlIllIlII);
                return new String(llllllllllllIllIIlIIlIlIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIlIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIlIlIlIllIIlI) {
                llllllllllllIllIIlIIlIlIlIllIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIIllIlIIIll() {
            (llIlllIlIIlIII = new int[4])[0] = " ".length();
            TailContext.llIlllIlIIlIII[1] = ((0xA1 ^ 0x97) & ~(0x1 ^ 0x37));
            TailContext.llIlllIlIIlIII[2] = "  ".length();
            TailContext.llIlllIlIIlIII[3] = (0x22 ^ 0x2A);
        }
        
        @Override
        public void userEventTriggered(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIIlIII, final Object llllllllllllIllIIlIIlIlIllIIIlll) throws Exception {
        }
        
        private static void lIIllIIllIlIIIlI() {
            (llIlllIlIIIlll = new String[TailContext.llIlllIlIIlIII[2]])[TailContext.llIlllIlIIlIII[1]] = lIIllIIllIlIIIII("JwloBxwFAjgWDQkJCwMRAQ88Sk1GAj4HChJHPwMXRgEhEAECS2gDCgJHIRZEFAIpAQwDA2gDEEYTIAdEEgYhDkQJAWgWDANHOAsUAwshDAFIRwEWRBMUPQMICh5oDwEHCTtCEA4CaA4FFRNoCgUIAyQHFkYOJkIQDgJoEg0WAiQLCgNHLAsARgknFkQOBiYGCANHPAoBRgIwAQEWEyENCkg=", "fgHbd");
            TailContext.llIlllIlIIIlll[TailContext.llIlllIlIIlIII[0]] = lIIllIIllIlIIIIl("FNaoPsHUuDIRe6iHLuiVJz3kBchGuhWkCr5izlLlKraSdYPattP4dfQiJ2Ylq5hiay54fDPJ08qyHI7w8uWgCvTiogIuHK3AvoxdSb042818tmOnGTcTi8KCIDyfCq9AWP5OgXZPLUizTd3tOLnbAsqIuS3/kC+t", "ziIRP");
        }
        
        @Override
        public ChannelHandler handler() {
            return this;
        }
        
        @Override
        public void channelRead(final ChannelHandlerContext llllllllllllIllIIlIIlIlIlIlllllI, final Object llllllllllllIllIIlIIlIlIlIllllII) throws Exception {
            try {
                DefaultChannelPipeline.logger.debug(TailContext.llIlllIlIIIlll[TailContext.llIlllIlIIlIII[0]], llllllllllllIllIIlIIlIlIlIllllII);
                ReferenceCountUtil.release(llllllllllllIllIIlIIlIlIlIllllII);
                "".length();
                "".length();
                if (((170 + 8 + 28 + 9 ^ 34 + 63 + 25 + 30) & (153 + 240 - 261 + 109 ^ 65 + 35 + 15 + 75 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            finally {
                ReferenceCountUtil.release(llllllllllllIllIIlIIlIlIlIllllII);
                "".length();
            }
        }
        
        TailContext(final DefaultChannelPipeline llllllllllllIllIIlIIlIlIllIllIll) {
            super(llllllllllllIllIIlIIlIlIllIllIll, null, TailContext.TAIL_NAME, (boolean)(TailContext.llIlllIlIIlIII[0] != 0), (boolean)(TailContext.llIlllIlIIlIII[1] != 0));
        }
        
        static {
            lIIllIIllIlIIIll();
            lIIllIIllIlIIIlI();
            TAIL_NAME = generateName0(TailContext.class);
        }
        
        @Override
        public void channelWritabilityChanged(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIIlllI) throws Exception {
        }
        
        private static boolean lIIllIIllIlIIlII(final int llllllllllllIllIIlIIlIlIlIIlIIIl, final int llllllllllllIllIIlIIlIlIlIIlIIII) {
            return llllllllllllIllIIlIIlIlIlIIlIIIl < llllllllllllIllIIlIIlIlIlIIlIIII;
        }
        
        @Override
        public void handlerAdded(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIIllII) throws Exception {
        }
        
        @Override
        public void channelActive(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIlIIlI) throws Exception {
        }
        
        private static String lIIllIIllIlIIIII(String llllllllllllIllIIlIIlIlIlIIlllII, final String llllllllllllIllIIlIIlIlIlIlIIIII) {
            llllllllllllIllIIlIIlIlIlIIlllII = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIIlIlIlIIlllll = new StringBuilder();
            final char[] llllllllllllIllIIlIIlIlIlIIllllI = llllllllllllIllIIlIIlIlIlIlIIIII.toCharArray();
            int llllllllllllIllIIlIIlIlIlIIlllIl = TailContext.llIlllIlIIlIII[1];
            final short llllllllllllIllIIlIIlIlIlIIlIlll = (Object)llllllllllllIllIIlIIlIlIlIIlllII.toCharArray();
            final String llllllllllllIllIIlIIlIlIlIIlIllI = (String)llllllllllllIllIIlIIlIlIlIIlIlll.length;
            float llllllllllllIllIIlIIlIlIlIIlIlIl = TailContext.llIlllIlIIlIII[1];
            while (lIIllIIllIlIIlII((int)llllllllllllIllIIlIIlIlIlIIlIlIl, (int)llllllllllllIllIIlIIlIlIlIIlIllI)) {
                final char llllllllllllIllIIlIIlIlIlIlIIIlI = llllllllllllIllIIlIIlIlIlIIlIlll[llllllllllllIllIIlIIlIlIlIIlIlIl];
                llllllllllllIllIIlIIlIlIlIIlllll.append((char)(llllllllllllIllIIlIIlIlIlIlIIIlI ^ llllllllllllIllIIlIIlIlIlIIllllI[llllllllllllIllIIlIIlIlIlIIlllIl % llllllllllllIllIIlIIlIlIlIIllllI.length]));
                "".length();
                ++llllllllllllIllIIlIIlIlIlIIlllIl;
                ++llllllllllllIllIIlIIlIlIlIIlIlIl;
                "".length();
                if (" ".length() > " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIIlIlIlIIlllll);
        }
        
        @Override
        public void channelReadComplete(final ChannelHandlerContext llllllllllllIllIIlIIlIlIlIlllIIl) throws Exception {
        }
        
        @Override
        public void exceptionCaught(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIIIlII, final Throwable llllllllllllIllIIlIIlIlIllIIIIlI) throws Exception {
            DefaultChannelPipeline.logger.warn(TailContext.llIlllIlIIIlll[TailContext.llIlllIlIIlIII[1]], llllllllllllIllIIlIIlIlIllIIIIlI);
        }
        
        @Override
        public void channelUnregistered(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIlIlII) throws Exception {
        }
        
        @Override
        public void handlerRemoved(final ChannelHandlerContext llllllllllllIllIIlIIlIlIllIIlIlI) throws Exception {
        }
    }
}
