// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.RejectedExecutionException;
import io.netty.util.internal.ReadOnlyIterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.Collections;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.concurrent.Future;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.ThreadFactory;
import io.netty.util.concurrent.FutureListener;
import java.util.Queue;
import java.util.Set;
import io.netty.util.concurrent.Promise;
import io.netty.util.concurrent.AbstractEventExecutorGroup;

public class ThreadPerChannelEventLoopGroup extends AbstractEventExecutorGroup implements EventLoopGroup
{
    private static final /* synthetic */ String[] lIlllIIIIllIII;
    private static final /* synthetic */ int[] lIlllIIIIllIlI;
    private final /* synthetic */ Promise<?> terminationFuture;
    final /* synthetic */ Set<ThreadPerChannelEventLoop> activeChildren;
    private final /* synthetic */ int maxChannels;
    final /* synthetic */ Queue<ThreadPerChannelEventLoop> idleChildren;
    private final /* synthetic */ FutureListener<Object> childTerminationListener;
    final /* synthetic */ ThreadFactory threadFactory;
    private final /* synthetic */ ChannelException tooManyChannels;
    private final /* synthetic */ Object[] childArgs;
    private volatile /* synthetic */ boolean shuttingDown;
    
    private static boolean lIIIIIIlIIIIIllI(final int llllllllllllIlllllIlllIIlIllllIl) {
        return llllllllllllIlllllIlllIIlIllllIl <= 0;
    }
    
    private static String lIIIIIIIllllIIIl(String llllllllllllIlllllIlllIIlllIllIl, final String llllllllllllIlllllIlllIIllllIIIl) {
        llllllllllllIlllllIlllIIlllIllIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIlllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlllIIllllIIII = new StringBuilder();
        final char[] llllllllllllIlllllIlllIIlllIllll = llllllllllllIlllllIlllIIllllIIIl.toCharArray();
        int llllllllllllIlllllIlllIIlllIlllI = ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0];
        final Exception llllllllllllIlllllIlllIIlllIIlll = (Object)llllllllllllIlllllIlllIIlllIllIl.toCharArray();
        final String llllllllllllIlllllIlllIIlllIIllI = (String)llllllllllllIlllllIlllIIlllIIlll.length;
        String llllllllllllIlllllIlllIIlllIIlIl = (String)ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0];
        while (lIIIIIIlIIIIlIIl((int)llllllllllllIlllllIlllIIlllIIlIl, (int)llllllllllllIlllllIlllIIlllIIllI)) {
            final char llllllllllllIlllllIlllIIllllIlII = llllllllllllIlllllIlllIIlllIIlll[llllllllllllIlllllIlllIIlllIIlIl];
            llllllllllllIlllllIlllIIllllIIII.append((char)(llllllllllllIlllllIlllIIllllIlII ^ llllllllllllIlllllIlllIIlllIllll[llllllllllllIlllllIlllIIlllIlllI % llllllllllllIlllllIlllIIlllIllll.length]));
            "".length();
            ++llllllllllllIlllllIlllIIlllIlllI;
            ++llllllllllllIlllllIlllIIlllIIlIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlllIIllllIIII);
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIlllllIlllIlIIlIIlll, final ChannelPromise llllllllllllIlllllIlllIlIIlIIllI) {
        if (lIIIIIIlIIIIIIlI(llllllllllllIlllllIlllIlIIlIIlll)) {
            throw new NullPointerException(ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[5]]);
        }
        try {
            return this.nextChild().register(llllllllllllIlllllIlllIlIIlIIlll, llllllllllllIlllllIlllIlIIlIIllI);
        }
        catch (Throwable llllllllllllIlllllIlllIlIIlIllII) {
            llllllllllllIlllllIlllIlIIlIIllI.setFailure(llllllllllllIlllllIlllIlIIlIllII);
            "".length();
            return llllllllllllIlllllIlllIlIIlIIllI;
        }
    }
    
    protected ThreadPerChannelEventLoopGroup(final int llllllllllllIlllllIlllIllIlIlIlI) {
        this(llllllllllllIlllllIlllIllIlIlIlI, Executors.defaultThreadFactory(), new Object[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0]]);
    }
    
    private static void lIIIIIIlIIIIIIII() {
        (lIlllIIIIllIlI = new int[9])[0] = ((0x42 ^ 0x15 ^ (0x55 ^ 0x34)) & (23 + 45 + 10 + 69 ^ 39 + 89 + 7 + 30 ^ -" ".length()));
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] = " ".length();
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[2] = "  ".length();
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[3] = (0x1B ^ 0x32);
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[4] = "   ".length();
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[5] = (0xC ^ 0x8);
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[6] = (0x64 ^ 0x61);
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[7] = (" ".length() ^ (0x2A ^ 0x2D));
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[8] = (113 + 20 - 3 + 51 ^ 186 + 168 - 226 + 61);
    }
    
    private static boolean lIIIIIIlIIIIIIll(final int llllllllllllIlllllIlllIIllIIIllI) {
        return llllllllllllIlllllIlllIIllIIIllI != 0;
    }
    
    @Override
    public boolean isTerminated() {
        final Iterator llllllllllllIlllllIlllIlIlIllIIl = this.activeChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIllIIl.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIlIllIlI = llllllllllllIlllllIlllIlIlIllIIl.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIlIllIlI.isTerminated() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if ((159 + 42 - 62 + 44 ^ 157 + 22 - 100 + 99) <= 0) {
                return ((0x57 ^ 0x30 ^ (0x6B ^ 0x22)) & (35 + 88 - 78 + 117 ^ 9 + 90 - 89 + 130 ^ -" ".length())) != 0x0;
            }
        }
        final Iterator llllllllllllIlllllIlllIlIlIlIlll = this.idleChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIlIlll.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIlIllIII = llllllllllllIlllllIlllIlIlIlIlll.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIlIllIII.isTerminated() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if (" ".length() <= 0) {
                return ((0x93 ^ 0xA5) & ~(0x9E ^ 0xA8)) != 0x0;
            }
        }
        return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] != 0;
    }
    
    private static int lIIIIIIlIIIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIIIIlIIIIIlll(final int llllllllllllIlllllIlllIIlIlllIll) {
        return llllllllllllIlllllIlllIIlIlllIll > 0;
    }
    
    private static boolean lIIIIIIlIIIIIIlI(final Object llllllllllllIlllllIlllIIllIIlIIl) {
        return llllllllllllIlllllIlllIIllIIlIIl == null;
    }
    
    @Override
    public boolean isShuttingDown() {
        final Iterator llllllllllllIlllllIlllIlIllIllll = this.activeChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllIllll.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIlllIIII = llllllllllllIlllllIlllIlIllIllll.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIlllIIII.isShuttingDown() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x5B ^ 0x54) & ~(0xCA ^ 0xC5)) != 0x0;
            }
        }
        final Iterator llllllllllllIlllllIlllIlIllIllIl = this.idleChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllIllIl.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIllIlllI = llllllllllllIlllllIlllIlIllIllIl.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIllIlllI.isShuttingDown() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if (null != null) {
                return ((0x76 ^ 0x58) & ~(0x2D ^ 0x3)) != 0x0;
            }
        }
        return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] != 0;
    }
    
    @Override
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }
    
    private static void lIIIIIIIllllIlII() {
        (lIlllIIIIllIII = new String[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[7]])[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0]] = lIIIIIIIllllIIIl("GS8pDzAVID8pNAd0cWk8VGY0NCgRLSUpPE5ub3F4RGc=", "tNQLX");
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1]] = lIIIIIIIllllIIlI("xNNA+SeGApajsGygG90p+w==", "izxGG");
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[2]] = lIIIIIIIllllIIIl("NSkWcjwgKAByMiknFzw0LTVZejwgPkNy", "AFyRQ");
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[4]] = lIIIIIIIllllIIlI("Z+FrzMEL75M=", "tzVlZ");
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[5]] = lIIIIIIIllllIIll("bex6Lv0XoEI=", "TjHsS");
        ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[6]] = lIIIIIIIllllIIlI("q86CS+wHazRx0lbvkYzKsQ==", "zlyMf");
    }
    
    protected ThreadPerChannelEventLoopGroup(final int llllllllllllIlllllIlllIllIlIIIII, final ThreadFactory llllllllllllIlllllIlllIllIIlllll, final Object... llllllllllllIlllllIlllIllIlIIIlI) {
        this.activeChildren = Collections.newSetFromMap((Map<ThreadPerChannelEventLoop, Boolean>)PlatformDependent.newConcurrentHashMap());
        this.idleChildren = new ConcurrentLinkedQueue<ThreadPerChannelEventLoop>();
        this.terminationFuture = new DefaultPromise<Object>(GlobalEventExecutor.INSTANCE);
        this.childTerminationListener = new FutureListener<Object>() {
            @Override
            public void operationComplete(final Future<Object> llllllllllllIlllIlllIlllllIlIllI) throws Exception {
                if (lIIIIlllIlIlIIII(ThreadPerChannelEventLoopGroup.this.isTerminated() ? 1 : 0)) {
                    ThreadPerChannelEventLoopGroup.this.terminationFuture.trySuccess(null);
                    "".length();
                }
            }
            
            private static boolean lIIIIlllIlIlIIII(final int llllllllllllIlllIlllIlllllIlIIll) {
                return llllllllllllIlllIlllIlllllIlIIll != 0;
            }
        };
        if (lIIIIIIlIIIIIIIl(llllllllllllIlllllIlllIllIlIIIII)) {
            final String format = ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0]];
            final Object[] args = new Object[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1]];
            args[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0]] = llllllllllllIlllllIlllIllIlIIIII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIIIIIIlIIIIIIlI(llllllllllllIlllllIlllIllIIlllll)) {
            throw new NullPointerException(ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1]]);
        }
        if (lIIIIIIlIIIIIIlI(llllllllllllIlllllIlllIllIlIIIlI)) {
            this.childArgs = EmptyArrays.EMPTY_OBJECTS;
            "".length();
            if ("  ".length() <= 0) {
                throw null;
            }
        }
        else {
            this.childArgs = llllllllllllIlllllIlllIllIlIIIlI.clone();
        }
        this.maxChannels = llllllllllllIlllllIlllIllIlIIIII;
        this.threadFactory = llllllllllllIlllllIlllIllIIlllll;
        this.tooManyChannels = new ChannelException(String.valueOf(new StringBuilder().append(ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[2]]).append(llllllllllllIlllllIlllIllIlIIIII).append((char)ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[3])));
        this.tooManyChannels.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
    }
    
    protected ThreadPerChannelEventLoopGroup() {
        this(ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0]);
    }
    
    @Override
    public boolean awaitTermination(final long llllllllllllIlllllIlllIlIlIIIIII, final TimeUnit llllllllllllIlllllIlllIlIlIIIIll) throws InterruptedException {
        final long llllllllllllIlllllIlllIlIlIIIIlI = System.nanoTime() + llllllllllllIlllllIlllIlIlIIIIll.toNanos(llllllllllllIlllllIlllIlIlIIIIII);
        final Iterator llllllllllllIlllllIlllIlIlIIlIIl = this.activeChildren.iterator();
    Label_0022:
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIIlIIl.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIlIIlIlI = llllllllllllIlllllIlllIlIlIIlIIl.next();
            do {
                final long llllllllllllIlllllIlllIlIlIIlIll = llllllllllllIlllllIlllIlIlIIIIlI - System.nanoTime();
                if (lIIIIIIlIIIIIllI(lIIIIIIlIIIIIlIl(llllllllllllIlllllIlllIlIlIIlIll, 0L))) {
                    return this.isTerminated();
                }
                if (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIIlIlI.awaitTermination(llllllllllllIlllllIlllIlIlIIlIll, TimeUnit.NANOSECONDS) ? 1 : 0)) {
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x35 ^ 0xC ^ "   ".length()) & (80 + 51 - 97 + 130 ^ 153 + 8 - 134 + 131 ^ -" ".length())) != 0x0;
                    }
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return ((0x4A ^ 0x3C ^ (0x1E ^ 0x4F)) & (0x8F ^ 0x98 ^ (0x1B ^ 0x2B) ^ -" ".length())) != 0x0;
                    }
                    continue Label_0022;
                }
                else {
                    "".length();
                }
            } while ("   ".length() >= "  ".length());
            return ((120 + 1 - 80 + 118 ^ 147 + 58 - 158 + 123) & (46 + 113 - 145 + 169 ^ 123 + 116 - 204 + 95 ^ -" ".length())) != 0x0;
        }
        final Iterator llllllllllllIlllllIlllIlIlIIIllI = this.idleChildren.iterator();
        Label_0292:
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIIIllI.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIlIIIlll = llllllllllllIlllllIlllIlIlIIIllI.next();
            do {
                final long llllllllllllIlllllIlllIlIlIIlIII = llllllllllllIlllllIlllIlIlIIIIlI - System.nanoTime();
                if (lIIIIIIlIIIIIllI(lIIIIIIlIIIIIlIl(llllllllllllIlllllIlllIlIlIIlIII, 0L))) {
                    return this.isTerminated();
                }
                if (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIlIIIlll.awaitTermination(llllllllllllIlllllIlllIlIlIIlIII, TimeUnit.NANOSECONDS) ? 1 : 0)) {
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0xC8 ^ 0x85) & ~(0x68 ^ 0x25)) != 0x0;
                    }
                    "".length();
                    if ((0x9C ^ 0xA3 ^ (0x6E ^ 0x55)) < 0) {
                        return ((0x32 ^ 0x6E ^ " ".length()) & (100 + 69 - 70 + 60 ^ 145 + 35 - 161 + 175 ^ -" ".length())) != 0x0;
                    }
                    continue Label_0292;
                }
                else {
                    "".length();
                }
            } while (" ".length() > 0);
            return ((0xDE ^ 0xB4 ^ (0xB1 ^ 0x8E)) & (0xD2 ^ 0xBF ^ (0x33 ^ 0xB) ^ -" ".length())) != 0x0;
        }
        return this.isTerminated();
    }
    
    @Override
    public ChannelFuture register(final Channel llllllllllllIlllllIlllIlIIllIIlI) {
        if (lIIIIIIlIIIIIIlI(llllllllllllIlllllIlllIlIIllIIlI)) {
            throw new NullPointerException(ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[4]]);
        }
        try {
            final EventLoop llllllllllllIlllllIlllIlIIllIlll = this.nextChild();
            return llllllllllllIlllllIlllIlIIllIlll.register(llllllllllllIlllllIlllIlIIllIIlI, new DefaultChannelPromise(llllllllllllIlllllIlllIlIIllIIlI, llllllllllllIlllllIlllIlIIllIlll));
        }
        catch (Throwable llllllllllllIlllllIlllIlIIllIllI) {
            return new FailedChannelFuture(llllllllllllIlllllIlllIlIIllIIlI, GlobalEventExecutor.INSTANCE, llllllllllllIlllllIlllIlIIllIllI);
        }
    }
    
    @Override
    public Future<?> shutdownGracefully(final long llllllllllllIlllllIlllIllIIIIllI, final long llllllllllllIlllllIlllIllIIIIlIl, final TimeUnit llllllllllllIlllllIlllIllIIIIlII) {
        this.shuttingDown = (ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] != 0);
        final Iterator llllllllllllIlllllIlllIllIIIlllI = this.activeChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIllIIIlllI.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIllIIIllll = llllllllllllIlllllIlllIllIIIlllI.next();
            llllllllllllIlllllIlllIllIIIllll.shutdownGracefully(llllllllllllIlllllIlllIllIIIIllI, llllllllllllIlllllIlllIllIIIIlIl, llllllllllllIlllllIlllIllIIIIlII);
            "".length();
            "".length();
            if (((0x6E ^ 0xD) & ~(0x3E ^ 0x5D)) != 0x0) {
                return null;
            }
        }
        final Iterator llllllllllllIlllllIlllIllIIIllII = this.idleChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIllIIIllII.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIllIIIllIl = llllllllllllIlllllIlllIllIIIllII.next();
            llllllllllllIlllllIlllIllIIIllIl.shutdownGracefully(llllllllllllIlllllIlllIllIIIIllI, llllllllllllIlllllIlllIllIIIIlIl, llllllllllllIlllllIlllIllIIIIlII);
            "".length();
            "".length();
            if (((0xEA ^ 0xA8) & ~(0xC0 ^ 0x82)) != ((0xF8 ^ 0xA7) & ~(0xFA ^ 0xA5))) {
                return null;
            }
        }
        if (lIIIIIIlIIIIIIll(this.isTerminated() ? 1 : 0)) {
            this.terminationFuture.trySuccess(null);
            "".length();
        }
        return this.terminationFuture();
    }
    
    private static String lIIIIIIIllllIIll(final String llllllllllllIlllllIlllIlIIIlIIIl, final String llllllllllllIlllllIlllIlIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllIlIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[8]), "DES");
            final Cipher llllllllllllIlllllIlllIlIIIlIIll = Cipher.getInstance("DES");
            llllllllllllIlllllIlllIlIIIlIIll.init(ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[2], llllllllllllIlllllIlllIlIIIlIlII);
            return new String(llllllllllllIlllllIlllIlIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllIlIIIlIIlI) {
            llllllllllllIlllllIlllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIlIIIIlIII(final int llllllllllllIlllllIlllIIllIllIlI, final int llllllllllllIlllllIlllIIllIllIII) {
        return llllllllllllIlllllIlllIIllIllIlI >= llllllllllllIlllllIlllIIllIllIII;
    }
    
    private static boolean lIIIIIIlIIIIIIIl(final int llllllllllllIlllllIlllIIlIllllll) {
        return llllllllllllIlllllIlllIIlIllllll < 0;
    }
    
    private static String lIIIIIIIllllIIlI(final String llllllllllllIlllllIlllIlIIIIIIlI, final String llllllllllllIlllllIlllIlIIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllIlIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllIlIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlllIlIIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlllIlIIIIIllI.init(ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[2], llllllllllllIlllllIlllIlIIIIIlll);
            return new String(llllllllllllIlllllIlllIlIIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllIlIIIIIlIl) {
            llllllllllllIlllllIlllIlIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Iterator<EventExecutor> iterator() {
        return new ReadOnlyIterator<EventExecutor>(this.activeChildren.iterator());
    }
    
    private static boolean lIIIIIIlIIIIlIIl(final int llllllllllllIlllllIlllIIllIlIIIl, final int llllllllllllIlllllIlllIIllIIllll) {
        return llllllllllllIlllllIlllIIllIlIIIl < llllllllllllIlllllIlllIIllIIllll;
    }
    
    private static boolean lIIIIIIlIIIIIlII(final int llllllllllllIlllllIlllIIllIIIIlI) {
        return llllllllllllIlllllIlllIIllIIIIlI == 0;
    }
    
    @Override
    public EventLoop next() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isShutdown() {
        final Iterator llllllllllllIlllllIlllIlIllIIlII = this.activeChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllIIlII.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIllIIlIl = llllllllllllIlllllIlllIlIllIIlII.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIllIIlIl.isShutdown() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x33 ^ 0x2 ^ (0x6B ^ 0x6)) & (0xE7 ^ 0xA8 ^ (0x3B ^ 0x28) ^ -" ".length())) != 0x0;
            }
        }
        final Iterator llllllllllllIlllllIlllIlIllIIIlI = this.idleChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllIIIlI.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIllIIIll = llllllllllllIlllllIlllIlIllIIIlI.next();
            if (lIIIIIIlIIIIIlII(llllllllllllIlllllIlllIlIllIIIll.isShutdown() ? 1 : 0)) {
                return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[0] != 0;
            }
            "".length();
            if (-(0x33 ^ 0x62 ^ (0x41 ^ 0x14)) >= 0) {
                return ((0x4 ^ 0x5E ^ (0x63 ^ 0x1A)) & (0x9 ^ 0x44 ^ (0xF ^ 0x61) ^ -" ".length())) != 0x0;
            }
        }
        return ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] != 0;
    }
    
    protected ThreadPerChannelEventLoop newChild(final Object... llllllllllllIlllllIlllIllIIllIll) throws Exception {
        return new ThreadPerChannelEventLoop(this);
    }
    
    static {
        lIIIIIIlIIIIIIII();
        lIIIIIIIllllIlII();
    }
    
    private EventLoop nextChild() throws Exception {
        if (lIIIIIIlIIIIIIll(this.shuttingDown ? 1 : 0)) {
            throw new RejectedExecutionException(ThreadPerChannelEventLoopGroup.lIlllIIIIllIII[ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[6]]);
        }
        ThreadPerChannelEventLoop llllllllllllIlllllIlllIlIIlIIIIl = this.idleChildren.poll();
        if (lIIIIIIlIIIIIIlI(llllllllllllIlllllIlllIlIIlIIIIl)) {
            if (lIIIIIIlIIIIIlll(this.maxChannels) && lIIIIIIlIIIIlIII(this.activeChildren.size(), this.maxChannels)) {
                throw this.tooManyChannels;
            }
            llllllllllllIlllllIlllIlIIlIIIIl = this.newChild(this.childArgs);
            llllllllllllIlllllIlllIlIIlIIIIl.terminationFuture().addListener(this.childTerminationListener);
            "".length();
        }
        this.activeChildren.add(llllllllllllIlllllIlllIlIIlIIIIl);
        "".length();
        return llllllllllllIlllllIlllIlIIlIIIIl;
    }
    
    @Deprecated
    @Override
    public void shutdown() {
        this.shuttingDown = (ThreadPerChannelEventLoopGroup.lIlllIIIIllIlI[1] != 0);
        final Iterator llllllllllllIlllllIlllIlIllllIlI = this.activeChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllllIlI.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIllllIll = llllllllllllIlllllIlllIlIllllIlI.next();
            llllllllllllIlllllIlllIlIllllIll.shutdown();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        final Iterator llllllllllllIlllllIlllIlIllllIII = this.idleChildren.iterator();
        while (lIIIIIIlIIIIIIll(llllllllllllIlllllIlllIlIllllIII.hasNext() ? 1 : 0)) {
            final EventLoop llllllllllllIlllllIlllIlIllllIIl = llllllllllllIlllllIlllIlIllllIII.next();
            llllllllllllIlllllIlllIlIllllIIl.shutdown();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        if (lIIIIIIlIIIIIIll(this.isTerminated() ? 1 : 0)) {
            this.terminationFuture.trySuccess(null);
            "".length();
        }
    }
}
