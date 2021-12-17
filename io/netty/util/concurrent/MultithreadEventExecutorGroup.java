// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class MultithreadEventExecutorGroup extends AbstractEventExecutorGroup
{
    private final /* synthetic */ EventExecutor[] children;
    private final /* synthetic */ AtomicInteger childIndex;
    private final /* synthetic */ AtomicInteger terminatedChildren;
    private static final /* synthetic */ String[] lllIlllIllllll;
    private static final /* synthetic */ int[] lllIllllIIlIII;
    private final /* synthetic */ EventExecutorChooser chooser;
    private final /* synthetic */ Promise<?> terminationFuture;
    
    @Override
    public Iterator<EventExecutor> iterator() {
        return this.children().iterator();
    }
    
    private static boolean lIlIIlIlllllIIlI(final int llllllllllllIlIllIIIIIIIIIIIIIIl) {
        return llllllllllllIlIllIIIIIIIIIIIIIIl == 0;
    }
    
    static {
        lIlIIlIllllIllIl();
        lIlIIlIllllIIllI();
    }
    
    private static int lIlIIlIlllllIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIIlIllllIlllI(final int llllllllllllIlIlIlllllllllllllll) {
        return llllllllllllIlIlIlllllllllllllll <= 0;
    }
    
    @Override
    public boolean isTerminated() {
        final EventExecutor[] llllllllllllIlIllIIIIIIIIlIllIll = this.children;
        final int llllllllllllIlIllIIIIIIIIlIllIlI = llllllllllllIlIllIIIIIIIIlIllIll.length;
        int llllllllllllIlIllIIIIIIIIlIllIIl = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIIlIllIIl, llllllllllllIlIllIIIIIIIIlIllIlI)) {
            final EventExecutor llllllllllllIlIllIIIIIIIIlIlllII = llllllllllllIlIllIIIIIIIIlIllIll[llllllllllllIlIllIIIIIIIIlIllIIl];
            if (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIIlIlllII.isTerminated() ? 1 : 0)) {
                return MultithreadEventExecutorGroup.lllIllllIIlIII[0] != 0;
            }
            ++llllllllllllIlIllIIIIIIIIlIllIIl;
            "".length();
            if (" ".length() == (0x7D ^ 0x23 ^ (0xE8 ^ 0xB2))) {
                return ((0xB0 ^ 0xC1 ^ (0x38 ^ 0x76)) & (115 + 165 - 177 + 64 ^ 40 + 106 - 93 + 99 ^ -" ".length())) != 0x0;
            }
        }
        return MultithreadEventExecutorGroup.lllIllllIIlIII[1] != 0;
    }
    
    @Override
    public Future<?> shutdownGracefully(final long llllllllllllIlIllIIIIIIIlIIlllIl, final long llllllllllllIlIllIIIIIIIlIIlllII, final TimeUnit llllllllllllIlIllIIIIIIIlIIllIll) {
        final EventExecutor[] llllllllllllIlIllIIIIIIIlIlIIlIl = this.children;
        final int llllllllllllIlIllIIIIIIIlIlIIlII = llllllllllllIlIllIIIIIIIlIlIIlIl.length;
        int llllllllllllIlIllIIIIIIIlIlIIIll = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIlIlIIIll, llllllllllllIlIllIIIIIIIlIlIIlII)) {
            final EventExecutor llllllllllllIlIllIIIIIIIlIlIIllI = llllllllllllIlIllIIIIIIIlIlIIlIl[llllllllllllIlIllIIIIIIIlIlIIIll];
            llllllllllllIlIllIIIIIIIlIlIIllI.shutdownGracefully(llllllllllllIlIllIIIIIIIlIIlllIl, llllllllllllIlIllIIIIIIIlIIlllII, llllllllllllIlIllIIIIIIIlIIllIll);
            "".length();
            ++llllllllllllIlIllIIIIIIIlIlIIIll;
            "".length();
            if ((0x45 ^ 0xF ^ (0xE ^ 0x40)) < -" ".length()) {
                return null;
            }
        }
        return this.terminationFuture();
    }
    
    private static boolean lIlIIlIlllllIlIl(final int llllllllllllIlIllIIIIIIIIIIIllII, final int llllllllllllIlIllIIIIIIIIIIIlIll) {
        return llllllllllllIlIllIIIIIIIIIIIllII == llllllllllllIlIllIIIIIIIIIIIlIll;
    }
    
    @Deprecated
    @Override
    public void shutdown() {
        final EventExecutor[] llllllllllllIlIllIIIIIIIlIIIlIII = this.children;
        final int llllllllllllIlIllIIIIIIIlIIIIlll = llllllllllllIlIllIIIIIIIlIIIlIII.length;
        int llllllllllllIlIllIIIIIIIlIIIIllI = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIlIIIIllI, llllllllllllIlIllIIIIIIIlIIIIlll)) {
            final EventExecutor llllllllllllIlIllIIIIIIIlIIIlIIl = llllllllllllIlIllIIIIIIIlIIIlIII[llllllllllllIlIllIIIIIIIlIIIIllI];
            llllllllllllIlIllIIIIIIIlIIIlIIl.shutdown();
            ++llllllllllllIlIllIIIIIIIlIIIIllI;
            "".length();
            if (-" ".length() >= ((0x14 ^ 0x76 ^ (0x53 ^ 0x12)) & (0x7B ^ 0x5 ^ (0xD7 ^ 0x8A) ^ -" ".length()))) {
                return;
            }
        }
    }
    
    @Override
    public EventExecutor next() {
        return this.chooser.next();
    }
    
    @Override
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }
    
    @Override
    public boolean isShutdown() {
        final EventExecutor[] llllllllllllIlIllIIIIIIIIllIlIlI = this.children;
        final int llllllllllllIlIllIIIIIIIIllIlIIl = llllllllllllIlIllIIIIIIIIllIlIlI.length;
        int llllllllllllIlIllIIIIIIIIllIlIII = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIIllIlIII, llllllllllllIlIllIIIIIIIIllIlIIl)) {
            final EventExecutor llllllllllllIlIllIIIIIIIIllIlIll = llllllllllllIlIllIIIIIIIIllIlIlI[llllllllllllIlIllIIIIIIIIllIlIII];
            if (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIIllIlIll.isShutdown() ? 1 : 0)) {
                return MultithreadEventExecutorGroup.lllIllllIIlIII[0] != 0;
            }
            ++llllllllllllIlIllIIIIIIIIllIlIII;
            "".length();
            if ((0x80 ^ 0x84) < 0) {
                return ((0x55 ^ 0x11) & ~(0xC1 ^ 0x85)) != 0x0;
            }
        }
        return MultithreadEventExecutorGroup.lllIllllIIlIII[1] != 0;
    }
    
    public final int executorCount() {
        return this.children.length;
    }
    
    protected ThreadFactory newDefaultThreadFactory() {
        return new DefaultThreadFactory(this.getClass());
    }
    
    private static void lIlIIlIllllIllIl() {
        (lllIllllIIlIII = new int[4])[0] = ((0x9 ^ 0x5D) & ~(0xCE ^ 0x9A));
        MultithreadEventExecutorGroup.lllIllllIIlIII[1] = " ".length();
        MultithreadEventExecutorGroup.lllIllllIIlIII[2] = "  ".length();
        MultithreadEventExecutorGroup.lllIllllIIlIII[3] = (0x1E ^ 0x68 ^ (0x63 ^ 0x1D));
    }
    
    private static boolean lIlIIlIlllllIIIl(final int llllllllllllIlIllIIIIIIIIIIIlIII, final int llllllllllllIlIllIIIIIIIIIIIIlll) {
        return llllllllllllIlIllIIIIIIIIIIIlIII < llllllllllllIlIllIIIIIIIIIIIIlll;
    }
    
    protected MultithreadEventExecutorGroup(final int llllllllllllIlIllIIIIIIIlllIlIIl, ThreadFactory llllllllllllIlIllIIIIIIIlllIlIII, final Object... llllllllllllIlIllIIIIIIIlllIllII) {
        this.childIndex = new AtomicInteger();
        this.terminatedChildren = new AtomicInteger();
        this.terminationFuture = new DefaultPromise<Object>(GlobalEventExecutor.INSTANCE);
        if (lIlIIlIllllIlllI(llllllllllllIlIllIIIIIIIlllIlIIl)) {
            final String format = MultithreadEventExecutorGroup.lllIlllIllllll[MultithreadEventExecutorGroup.lllIllllIIlIII[0]];
            final Object[] args = new Object[MultithreadEventExecutorGroup.lllIllllIIlIII[1]];
            args[MultithreadEventExecutorGroup.lllIllllIIlIII[0]] = llllllllllllIlIllIIIIIIIlllIlIIl;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIlIIlIllllIllll(llllllllllllIlIllIIIIIIIlllIlIII)) {
            llllllllllllIlIllIIIIIIIlllIlIII = this.newDefaultThreadFactory();
        }
        this.children = new SingleThreadEventExecutor[llllllllllllIlIllIIIIIIIlllIlIIl];
        if (lIlIIlIlllllIIII(isPowerOfTwo(this.children.length) ? 1 : 0)) {
            this.chooser = new PowerOfTwoEventExecutorChooser();
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            this.chooser = new GenericEventExecutorChooser();
        }
        int llllllllllllIlIllIIIIIIIllllIlII = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIllllIlII, llllllllllllIlIllIIIIIIIlllIlIIl)) {
            boolean llllllllllllIlIllIIIIIIIllllIlIl = MultithreadEventExecutorGroup.lllIllllIIlIII[0] != 0;
            try {
                this.children[llllllllllllIlIllIIIIIIIllllIlII] = this.newChild(llllllllllllIlIllIIIIIIIlllIlIII, llllllllllllIlIllIIIIIIIlllIllII);
                llllllllllllIlIllIIIIIIIllllIlIl = (MultithreadEventExecutorGroup.lllIllllIIlIII[1] != 0);
                if (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIllllIlIl ? 1 : 0)) {
                    int llllllllllllIlIllIIIIIIIlllllllI = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
                    while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIlllllllI, llllllllllllIlIllIIIIIIIllllIlII)) {
                        this.children[llllllllllllIlIllIIIIIIIlllllllI].shutdownGracefully();
                        "".length();
                        ++llllllllllllIlIllIIIIIIIlllllllI;
                        "".length();
                        if (-" ".length() > ((0x43 ^ 0xC) & ~(0x1C ^ 0x53))) {
                            throw null;
                        }
                    }
                    int llllllllllllIlIllIIIIIIIlllllIll = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
                    while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIlllllIll, llllllllllllIlIllIIIIIIIllllIlII)) {
                        final EventExecutor llllllllllllIlIllIIIIIIIllllllII = this.children[llllllllllllIlIllIIIIIIIlllllIll];
                        try {
                            while (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIllllllII.isTerminated() ? 1 : 0)) {
                                llllllllllllIlIllIIIIIIIllllllII.awaitTermination(2147483647L, TimeUnit.SECONDS);
                                "".length();
                                "".length();
                                if (null != null) {
                                    throw null;
                                }
                            }
                            "".length();
                            if ((106 + 111 - 165 + 77 ^ 109 + 67 - 50 + 7) > (45 + 91 - 90 + 91 ^ 50 + 79 - 108 + 120)) {
                                throw null;
                            }
                        }
                        catch (InterruptedException llllllllllllIlIllIIIIIIIllllllIl) {
                            Thread.currentThread().interrupt();
                            "".length();
                            if (-" ".length() >= 0) {
                                throw null;
                            }
                            break;
                        }
                        ++llllllllllllIlIllIIIIIIIlllllIll;
                        "".length();
                        if (-"  ".length() > 0) {
                            throw null;
                        }
                    }
                    "".length();
                    if ("  ".length() == ((0x2D ^ 0x21) & ~(0x74 ^ 0x78))) {
                        throw null;
                    }
                }
            }
            catch (Exception llllllllllllIlIllIIIIIIIlllllIlI) {
                throw new IllegalStateException(MultithreadEventExecutorGroup.lllIlllIllllll[MultithreadEventExecutorGroup.lllIllllIIlIII[1]], llllllllllllIlIllIIIIIIIlllllIlI);
            }
            finally {
                if (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIllllIlIl ? 1 : 0)) {
                    int llllllllllllIlIllIIIIIIIlllllIIl = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
                    while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIlllllIIl, llllllllllllIlIllIIIIIIIllllIlII)) {
                        this.children[llllllllllllIlIllIIIIIIIlllllIIl].shutdownGracefully();
                        "".length();
                        ++llllllllllllIlIllIIIIIIIlllllIIl;
                        "".length();
                        if (null != null) {
                            throw null;
                        }
                    }
                    int llllllllllllIlIllIIIIIIIllllIllI = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
                    while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIllllIllI, llllllllllllIlIllIIIIIIIllllIlII)) {
                        final EventExecutor llllllllllllIlIllIIIIIIIllllIlll = this.children[llllllllllllIlIllIIIIIIIllllIllI];
                        try {
                            while (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIllllIlll.isTerminated() ? 1 : 0)) {
                                llllllllllllIlIllIIIIIIIllllIlll.awaitTermination(2147483647L, TimeUnit.SECONDS);
                                "".length();
                                "".length();
                                if (-" ".length() < -" ".length()) {
                                    throw null;
                                }
                            }
                            "".length();
                            if (null != null) {
                                throw null;
                            }
                        }
                        catch (InterruptedException llllllllllllIlIllIIIIIIIlllllIII) {
                            Thread.currentThread().interrupt();
                            "".length();
                            if (((0x25 ^ 0x35) & ~(0x10 ^ 0x0)) != 0x0) {
                                throw null;
                            }
                            break;
                        }
                        ++llllllllllllIlIllIIIIIIIllllIllI;
                        "".length();
                        if (-" ".length() == "  ".length()) {
                            throw null;
                        }
                    }
                }
            }
            ++llllllllllllIlIllIIIIIIIllllIlII;
            "".length();
            if ((0x38 ^ 0x3C) != (0xA0 ^ 0xA4)) {
                throw null;
            }
        }
        final FutureListener<Object> llllllllllllIlIllIIIIIIIlllIlIll = new FutureListener<Object>() {
            @Override
            public void operationComplete(final Future<Object> lllllllllllllIIlllIIIlIlIIIIllII) throws Exception {
                if (llIIlIllllIlllI(MultithreadEventExecutorGroup.this.terminatedChildren.incrementAndGet(), MultithreadEventExecutorGroup.this.children.length)) {
                    MultithreadEventExecutorGroup.this.terminationFuture.setSuccess(null);
                    "".length();
                }
            }
            
            private static boolean llIIlIllllIlllI(final int lllllllllllllIIlllIIIlIlIIIIlIII, final int lllllllllllllIIlllIIIlIlIIIIIlll) {
                return lllllllllllllIIlllIIIlIlIIIIlIII == lllllllllllllIIlllIIIlIlIIIIIlll;
            }
        };
        final EventExecutor[] llllllllllllIlIllIIIIIIIllllIIlI = this.children;
        final int llllllllllllIlIllIIIIIIIllllIIIl = llllllllllllIlIllIIIIIIIllllIIlI.length;
        int llllllllllllIlIllIIIIIIIllllIIII = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIllllIIII, llllllllllllIlIllIIIIIIIllllIIIl)) {
            final EventExecutor llllllllllllIlIllIIIIIIIllllIIll = llllllllllllIlIllIIIIIIIllllIIlI[llllllllllllIlIllIIIIIIIllllIIII];
            llllllllllllIlIllIIIIIIIllllIIll.terminationFuture().addListener(llllllllllllIlIllIIIIIIIlllIlIll);
            "".length();
            ++llllllllllllIlIllIIIIIIIllllIIII;
            "".length();
            if (-"   ".length() > 0) {
                throw null;
            }
        }
    }
    
    @Override
    public boolean awaitTermination(final long llllllllllllIlIllIIIIIIIIIllllll, final TimeUnit llllllllllllIlIllIIIIIIIIlIIIIlI) throws InterruptedException {
        final long llllllllllllIlIllIIIIIIIIlIIIIIl = System.nanoTime() + llllllllllllIlIllIIIIIIIIlIIIIlI.toNanos(llllllllllllIlIllIIIIIIIIIllllll);
        final EventExecutor[] llllllllllllIlIllIIIIIIIIlIIIlll = this.children;
        final int llllllllllllIlIllIIIIIIIIlIIIllI = llllllllllllIlIllIIIIIIIIlIIIlll.length;
        int llllllllllllIlIllIIIIIIIIlIIIlIl = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
    Label_0332:
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIIlIIIlIl, llllllllllllIlIllIIIIIIIIlIIIllI)) {
            final EventExecutor llllllllllllIlIllIIIIIIIIlIIlIII = llllllllllllIlIllIIIIIIIIlIIIlll[llllllllllllIlIllIIIIIIIIlIIIlIl];
            do {
                final long llllllllllllIlIllIIIIIIIIlIIlIIl = llllllllllllIlIllIIIIIIIIlIIIIIl - System.nanoTime();
                if (lIlIIlIllllIlllI(lIlIIlIlllllIlII(llllllllllllIlIllIIIIIIIIlIIlIIl, 0L))) {
                    "".length();
                    if (-" ".length() == "   ".length()) {
                        return ((0xC0 ^ 0x9D ^ (0xFC ^ 0xB8)) & (0x3 ^ 0x47 ^ (0x2B ^ 0x76) ^ -" ".length())) != 0x0;
                    }
                    break Label_0332;
                }
                else if (lIlIIlIlllllIIII(llllllllllllIlIllIIIIIIIIlIIlIII.awaitTermination(llllllllllllIlIllIIIIIIIIlIIlIIl, TimeUnit.NANOSECONDS) ? 1 : 0)) {
                    "".length();
                    if ((32 + 85 - 116 + 137 ^ 42 + 32 - 36 + 104) <= "  ".length()) {
                        return ((101 + 116 - 179 + 100 ^ 163 + 134 - 143 + 20) & (0x7A ^ 0x7C ^ (0x12 ^ 0x30) ^ -" ".length())) != 0x0;
                    }
                    ++llllllllllllIlIllIIIIIIIIlIIIlIl;
                    "".length();
                    if (null != null) {
                        return ((0xA5 ^ 0x96) & ~(0x10 ^ 0x23)) != 0x0;
                    }
                    continue Label_0332;
                }
                else {
                    "".length();
                }
            } while ((176 + 57 - 81 + 34 ^ 78 + 9 - 14 + 117) >= 0);
            return ((0x94 ^ 0xB9 ^ (0x6F ^ 0x21)) & (31 + 27 - 40 + 142 ^ 52 + 117 - 18 + 44 ^ -" ".length())) != 0x0;
        }
        return this.isTerminated();
    }
    
    @Override
    public boolean isShuttingDown() {
        final EventExecutor[] llllllllllllIlIllIIIIIIIIllllIIl = this.children;
        final int llllllllllllIlIllIIIIIIIIllllIII = llllllllllllIlIllIIIIIIIIllllIIl.length;
        int llllllllllllIlIllIIIIIIIIlllIlll = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        while (lIlIIlIlllllIIIl(llllllllllllIlIllIIIIIIIIlllIlll, llllllllllllIlIllIIIIIIIIllllIII)) {
            final EventExecutor llllllllllllIlIllIIIIIIIIllllIlI = llllllllllllIlIllIIIIIIIIllllIIl[llllllllllllIlIllIIIIIIIIlllIlll];
            if (lIlIIlIlllllIIlI(llllllllllllIlIllIIIIIIIIllllIlI.isShuttingDown() ? 1 : 0)) {
                return MultithreadEventExecutorGroup.lllIllllIIlIII[0] != 0;
            }
            ++llllllllllllIlIllIIIIIIIIlllIlll;
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x11 ^ 0x3B ^ (0x3D ^ 0x31)) & (0x12 ^ 0xC ^ (0x1A ^ 0x22) ^ -" ".length())) != 0x0;
            }
        }
        return MultithreadEventExecutorGroup.lllIllllIIlIII[1] != 0;
    }
    
    protected abstract EventExecutor newChild(final ThreadFactory p0, final Object... p1) throws Exception;
    
    private static String lIlIIlIllllIIIll(final String llllllllllllIlIllIIIIIIIIIIlllll, final String llllllllllllIlIllIIIIIIIIIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIIIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), MultithreadEventExecutorGroup.lllIllllIIlIII[3]), "DES");
            final Cipher llllllllllllIlIllIIIIIIIIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIIIIIIlIIIll.init(MultithreadEventExecutorGroup.lllIllllIIlIII[2], llllllllllllIlIllIIIIIIIIIlIIlII);
            return new String(llllllllllllIlIllIIIIIIIIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIIIIIlIIIlI) {
            llllllllllllIlIllIIIIIIIIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean isPowerOfTwo(final int llllllllllllIlIllIIIIIIIIIllIlIl) {
        int n;
        if (lIlIIlIlllllIlIl(llllllllllllIlIllIIIIIIIIIllIlIl & -llllllllllllIlIllIIIIIIIIIllIlIl, llllllllllllIlIllIIIIIIIIIllIlIl)) {
            n = MultithreadEventExecutorGroup.lllIllllIIlIII[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x19 ^ 0x46) & ~(0xC3 ^ 0x9C)) != 0x0;
            }
        }
        else {
            n = MultithreadEventExecutorGroup.lllIllllIIlIII[0];
        }
        return n != 0;
    }
    
    private static void lIlIIlIllllIIllI() {
        (lllIlllIllllll = new String[MultithreadEventExecutorGroup.lllIllllIIlIII[2]])[MultithreadEventExecutorGroup.lllIllllIIlIII[0]] = lIlIIlIllllIIIll("YrmFISjE4PU86gIiMeuN5Phr0diufQG46/wOFzP7VYs=", "JPWsl");
        MultithreadEventExecutorGroup.lllIlllIllllll[MultithreadEventExecutorGroup.lllIllllIIlIII[1]] = lIlIIlIllllIIlII("Eo8lQeP3x80bi/Cdv/s8EuYwn4WI0b76LDcY+w/qDcQm+D4BY7DW+Q==", "tUNhW");
    }
    
    private static boolean lIlIIlIlllllIIII(final int llllllllllllIlIllIIIIIIIIIIIIIll) {
        return llllllllllllIlIllIIIIIIIIIIIIIll != 0;
    }
    
    private static boolean lIlIIlIllllIllll(final Object llllllllllllIlIllIIIIIIIIIIIIlIl) {
        return llllllllllllIlIllIIIIIIIIIIIIlIl == null;
    }
    
    private static String lIlIIlIllllIIlII(final String llllllllllllIlIllIIIIIIIIIIlIIlI, final String llllllllllllIlIllIIIIIIIIIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIIIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIIIIIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIIIIIIIlIllI.init(MultithreadEventExecutorGroup.lllIllllIIlIII[2], llllllllllllIlIllIIIIIIIIIIlIlll);
            return new String(llllllllllllIlIllIIIIIIIIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIIIIIIlIlIl) {
            llllllllllllIlIllIIIIIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    protected Set<EventExecutor> children() {
        final Set<EventExecutor> llllllllllllIlIllIIIIIIIlIllIIIl = Collections.newSetFromMap(new LinkedHashMap<EventExecutor, Boolean>());
        Collections.addAll(llllllllllllIlIllIIIIIIIlIllIIIl, this.children);
        "".length();
        return llllllllllllIlIllIIIIIIIlIllIIIl;
    }
    
    private interface EventExecutorChooser
    {
        EventExecutor next();
    }
    
    private final class GenericEventExecutorChooser implements EventExecutorChooser
    {
        @Override
        public EventExecutor next() {
            return MultithreadEventExecutorGroup.this.children[Math.abs(MultithreadEventExecutorGroup.this.childIndex.getAndIncrement() % MultithreadEventExecutorGroup.this.children.length)];
        }
    }
    
    private final class PowerOfTwoEventExecutorChooser implements EventExecutorChooser
    {
        private static final /* synthetic */ int[] lIlIlIIIIIIIll;
        
        static {
            lllIlIlIIlllIlI();
        }
        
        @Override
        public EventExecutor next() {
            return MultithreadEventExecutorGroup.this.children[MultithreadEventExecutorGroup.this.childIndex.getAndIncrement() & MultithreadEventExecutorGroup.this.children.length - PowerOfTwoEventExecutorChooser.lIlIlIIIIIIIll[0]];
        }
        
        private static void lllIlIlIIlllIlI() {
            (lIlIlIIIIIIIll = new int[1])[0] = " ".length();
        }
    }
}
