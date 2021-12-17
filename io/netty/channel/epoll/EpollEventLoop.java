// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.io.IOException;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.collection.IntObjectHashMap;
import java.util.concurrent.ThreadFactory;
import io.netty.channel.EventLoopGroup;
import io.netty.util.internal.PlatformDependent;
import java.util.Queue;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import io.netty.util.collection.IntObjectMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.SingleThreadEventLoop;

final class EpollEventLoop extends SingleThreadEventLoop
{
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ int id;
    private /* synthetic */ boolean overflown;
    private final /* synthetic */ long[] events;
    private static final /* synthetic */ int[] lIIIlIlIlIllIl;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ String[] lIIIlIlIlIlIll;
    private volatile /* synthetic */ int ioRatio;
    private static final /* synthetic */ AtomicIntegerFieldUpdater<EpollEventLoop> WAKEN_UP_UPDATER;
    private final /* synthetic */ IntObjectMap<AbstractEpollChannel> ids;
    private final /* synthetic */ int eventFd;
    private final /* synthetic */ int epollFd;
    private volatile /* synthetic */ int wakenUp;
    
    private int epollWait(final boolean lllllllllllllIlIIIIllIlIllllIlll) {
        int lllllllllllllIlIIIIllIlIllllIllI = EpollEventLoop.lIIIlIlIlIllIl[0];
        long lllllllllllllIlIIIIllIlIllllIlIl = System.nanoTime();
        final long lllllllllllllIlIIIIllIlIllllIlII = lllllllllllllIlIIIIllIlIllllIlIl + this.delayNanos(lllllllllllllIlIIIIllIlIllllIlIl);
        do {
            final long lllllllllllllIlIIIIllIlIlllllIlI = (lllllllllllllIlIIIIllIlIllllIlII - lllllllllllllIlIIIIllIlIllllIlIl + 500000L) / 1000000L;
            if (llIIIIIlIIllIll(llIIIIIlIIllIlI(lllllllllllllIlIIIIllIlIlllllIlI, 0L))) {
                if (llIIIIIlIIlIIll(lllllllllllllIlIIIIllIlIllllIllI)) {
                    final int lllllllllllllIlIIIIllIlIlllllIll = Native.epollWait(this.epollFd, this.events, EpollEventLoop.lIIIlIlIlIllIl[0]);
                    if (llIIIIIlIIllIII(lllllllllllllIlIIIIllIlIlllllIll)) {
                        return lllllllllllllIlIIIIllIlIlllllIll;
                    }
                    "".length();
                    if (null != null) {
                        return (156 + 207 - 337 + 199 ^ 24 + 171 - 77 + 63) & (0x6B ^ 0x1F ^ (0xB7 ^ 0x97) ^ -" ".length());
                    }
                }
                return EpollEventLoop.lIIIlIlIlIllIl[0];
            }
            final int lllllllllllllIlIIIIllIlIlllllIIl = Native.epollWait(this.epollFd, this.events, (int)lllllllllllllIlIIIIllIlIlllllIlI);
            ++lllllllllllllIlIIIIllIlIllllIllI;
            if (!llIIIIIlIIlIIll(lllllllllllllIlIIIIllIlIlllllIIl) || !llIIIIIlIIlIIll(lllllllllllllIlIIIIllIlIllllIlll ? 1 : 0) || !llIIIIIlIIlIlII(this.wakenUp, EpollEventLoop.lIIIlIlIlIllIl[3]) || !llIIIIIlIIlIIll(this.hasTasks() ? 1 : 0) || llIIIIIlIIlIllI(this.hasScheduledTasks() ? 1 : 0)) {
                return lllllllllllllIlIIIIllIlIlllllIIl;
            }
            lllllllllllllIlIIIIllIlIllllIlIl = System.nanoTime();
            "".length();
        } while ("   ".length() >= " ".length());
        return (0xB ^ 0x7) & ~(0x49 ^ 0x45);
    }
    
    private static boolean llIIIIIlIIllIII(final int lllllllllllllIlIIIIllIlIIlIlIlIl) {
        return lllllllllllllIlIIIIllIlIIlIlIlIl > 0;
    }
    
    private static boolean llIIIIIlIIllIll(final int lllllllllllllIlIIIIllIlIIlIlIlll) {
        return lllllllllllllIlIIIIllIlIIlIlIlll <= 0;
    }
    
    private static boolean llIIIIIlIIlIlII(final int lllllllllllllIlIIIIllIlIIlIlIIlI, final int lllllllllllllIlIIIIllIlIIlIlIIIl) {
        return lllllllllllllIlIIIIllIlIIlIlIIlI != lllllllllllllIlIIIIllIlIIlIlIIIl;
    }
    
    void modify(final AbstractEpollChannel lllllllllllllIlIIIIllIllIIIlIIll) {
        if (llIIIIIlIIlIIll(EpollEventLoop.$assertionsDisabled ? 1 : 0) && llIIIIIlIIlIIll(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        Native.epollCtlMod(this.epollFd, lllllllllllllIlIIIIllIllIIIlIIll.fd, lllllllllllllIlIIIIllIllIIIlIIll.flags, lllllllllllllIlIIIIllIllIIIlIIll.id);
    }
    
    private static int llIIIIIlIIllIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private int nextId() {
        int lllllllllllllIlIIIIllIllIIlIlIlI = this.id;
        if (llIIIIIlIIlIlIl(lllllllllllllIlIIIIllIllIIlIlIlI, EpollEventLoop.lIIIlIlIlIllIl[4])) {
            this.overflown = (EpollEventLoop.lIIIlIlIlIllIl[3] != 0);
            lllllllllllllIlIIIIllIllIIlIlIlI = EpollEventLoop.lIIIlIlIlIllIl[0];
        }
        if (llIIIIIlIIlIllI(this.overflown ? 1 : 0)) {
            while (!llIIIIIlIIlIIll(this.ids.containsKey(++lllllllllllllIlIIIIllIllIIlIlIlI) ? 1 : 0)) {}
            this.id = lllllllllllllIlIIIIllIllIIlIlIlI;
            "".length();
            if ((0xBE ^ 0xBA ^ ((0x6E ^ 0x5C) & ~(0x63 ^ 0x51))) <= 0) {
                return (0x25 ^ 0x7C ^ (0x35 ^ 0x2F)) & (193 + 26 - 153 + 140 ^ 76 + 68 - 90 + 87 ^ -" ".length());
            }
        }
        else {
            this.id = ++lllllllllllllIlIIIIllIllIIlIlIlI;
        }
        return lllllllllllllIlIIIIllIllIIlIlIlI;
    }
    
    private void closeAll() {
        Native.epollWait(this.epollFd, this.events, EpollEventLoop.lIIIlIlIlIllIl[0]);
        "".length();
        final Collection<AbstractEpollChannel> lllllllllllllIlIIIIllIlIllIIlllI = new ArrayList<AbstractEpollChannel>(this.ids.size());
        final Iterator lllllllllllllIlIIIIllIlIllIlIIlI = this.ids.entries().iterator();
        while (llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIllIlIIlI.hasNext() ? 1 : 0)) {
            final IntObjectMap.Entry<AbstractEpollChannel> lllllllllllllIlIIIIllIlIllIlIIll = lllllllllllllIlIIIIllIlIllIlIIlI.next();
            lllllllllllllIlIIIIllIlIllIIlllI.add(lllllllllllllIlIIIIllIlIllIlIIll.value());
            "".length();
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        final Iterator lllllllllllllIlIIIIllIlIllIlIIII = lllllllllllllIlIIIIllIlIllIIlllI.iterator();
        while (llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIllIlIIII.hasNext() ? 1 : 0)) {
            final AbstractEpollChannel lllllllllllllIlIIIIllIlIllIlIIIl = lllllllllllllIlIIIIllIlIllIlIIII.next();
            lllllllllllllIlIIIIllIlIllIlIIIl.unsafe().close(lllllllllllllIlIIIIllIlIllIlIIIl.unsafe().voidPromise());
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
    }
    
    private static boolean llIIIIIlIIllllI(final Object lllllllllllllIlIIIIllIlIIlIlllIl) {
        return lllllllllllllIlIIIIllIlIIlIlllIl == null;
    }
    
    private static boolean llIIIIIlIIllIIl(final int lllllllllllllIlIIIIllIlIIllIIIlI, final int lllllllllllllIlIIIIllIlIIllIIIIl) {
        return lllllllllllllIlIIIIllIlIIllIIIlI > lllllllllllllIlIIIIllIlIIllIIIIl;
    }
    
    @Override
    protected void wakeup(final boolean lllllllllllllIlIIIIllIllIIlIIlII) {
        if (llIIIIIlIIlIIll(lllllllllllllIlIIIIllIllIIlIIlII ? 1 : 0) && llIIIIIlIIlIllI(EpollEventLoop.WAKEN_UP_UPDATER.compareAndSet(this, EpollEventLoop.lIIIlIlIlIllIl[0], EpollEventLoop.lIIIlIlIlIllIl[3]) ? 1 : 0)) {
            Native.eventFdWrite(this.eventFd, 1L);
        }
    }
    
    private static int llIIIIIlIIlllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIIIIlIIlIIll(final int lllllllllllllIlIIIIllIlIIlIllIIl) {
        return lllllllllllllIlIIIIllIlIIlIllIIl == 0;
    }
    
    private static boolean llIIIIIlIIlIllI(final int lllllllllllllIlIIIIllIlIIlIllIll) {
        return lllllllllllllIlIIIIllIlIIlIllIll != 0;
    }
    
    public int getIoRatio() {
        return this.ioRatio;
    }
    
    public void setIoRatio(final int lllllllllllllIlIIIIllIllIIIIIIll) {
        if (!llIIIIIlIIllIII(lllllllllllllIlIIIIllIllIIIIIIll) || llIIIIIlIIllIIl(lllllllllllllIlIIIIllIllIIIIIIll, EpollEventLoop.lIIIlIlIlIllIl[5])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[0]]).append(lllllllllllllIlIIIIllIllIIIIIIll).append(EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[3]])));
        }
        this.ioRatio = lllllllllllllIlIIIIllIllIIIIIIll;
    }
    
    void remove(final AbstractEpollChannel lllllllllllllIlIIIIllIllIIIIllIl) {
        if (llIIIIIlIIlIIll(EpollEventLoop.$assertionsDisabled ? 1 : 0) && llIIIIIlIIlIIll(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (llIIIIIlIIlIlll(this.ids.remove(lllllllllllllIlIIIIllIllIIIIllIl.id)) && llIIIIIlIIlIllI(lllllllllllllIlIIIIllIllIIIIllIl.isOpen() ? 1 : 0)) {
            Native.epollCtlDel(this.epollFd, lllllllllllllIlIIIIllIllIIIIllIl.fd);
        }
    }
    
    @Override
    protected void run() {
        do {
            int n;
            if (llIIIIIlIIlIlIl(EpollEventLoop.WAKEN_UP_UPDATER.getAndSet(this, EpollEventLoop.lIIIlIlIlIllIl[0]), EpollEventLoop.lIIIlIlIlIllIl[3])) {
                n = EpollEventLoop.lIIIlIlIlIllIl[3];
                "".length();
                if (" ".length() <= ((0xAF ^ 0x8E) & ~(0xE2 ^ 0xC3))) {
                    return;
                }
            }
            else {
                n = EpollEventLoop.lIIIlIlIlIllIl[0];
            }
            final boolean lllllllllllllIlIIIIllIlIllIlllll = n != 0;
            try {
                int lllllllllllllIlIIIIllIlIlllIIIll = 0;
                if (llIIIIIlIIlIllI(this.hasTasks() ? 1 : 0)) {
                    final int lllllllllllllIlIIIIllIlIlllIIllI = Native.epollWait(this.epollFd, this.events, EpollEventLoop.lIIIlIlIlIllIl[0]);
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIIllIlIlllIIIll = this.epollWait(lllllllllllllIlIIIIllIlIllIlllll);
                    if (llIIIIIlIIlIlIl(this.wakenUp, EpollEventLoop.lIIIlIlIlIllIl[3])) {
                        Native.eventFdWrite(this.eventFd, 1L);
                    }
                }
                final int lllllllllllllIlIIIIllIlIlllIIIlI = this.ioRatio;
                if (llIIIIIlIIlIlIl(lllllllllllllIlIIIIllIlIlllIIIlI, EpollEventLoop.lIIIlIlIlIllIl[5])) {
                    if (llIIIIIlIIllIII(lllllllllllllIlIIIIllIlIlllIIIll)) {
                        this.processReady(this.events, lllllllllllllIlIIIIllIlIlllIIIll);
                    }
                    this.runAllTasks();
                    "".length();
                    "".length();
                    if ((" ".length() & (" ".length() ^ -" ".length())) != ((0x12 ^ 0x5E ^ (0xD ^ 0x55)) & (0x25 ^ 0x5F ^ (0x30 ^ 0x5E) ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    final long lllllllllllllIlIIIIllIlIlllIIlIl = System.nanoTime();
                    if (llIIIIIlIIllIII(lllllllllllllIlIIIIllIlIlllIIIll)) {
                        this.processReady(this.events, lllllllllllllIlIIIIllIlIlllIIIll);
                    }
                    final long lllllllllllllIlIIIIllIlIlllIIlII = System.nanoTime() - lllllllllllllIlIIIIllIlIlllIIlIl;
                    this.runAllTasks(lllllllllllllIlIIIIllIlIlllIIlII * (EpollEventLoop.lIIIlIlIlIllIl[5] - lllllllllllllIlIIIIllIlIlllIIIlI) / lllllllllllllIlIIIIllIlIlllIIIlI);
                    "".length();
                }
                if (llIIIIIlIIlIllI(this.isShuttingDown() ? 1 : 0)) {
                    this.closeAll();
                    if (llIIIIIlIIlIllI(this.confirmShutdown() ? 1 : 0)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                        return;
                    }
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIlIIIIllIlIlllIIIII) {
                EpollEventLoop.logger.warn(EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[6]], lllllllllllllIlIIIIllIlIlllIIIII);
                try {
                    Thread.sleep(1000L);
                    "".length();
                    if (((0xAE ^ 0x85 ^ 35 + 75 - 43 + 60) & (0xAB ^ 0xA4 ^ (0x21 ^ 0x7A) ^ -" ".length())) != ((0x79 ^ 0x71 ^ (0x5E ^ 0x35)) & (157 + 87 - 134 + 97 ^ 144 + 138 - 207 + 97 ^ -" ".length()))) {
                        return;
                    }
                }
                catch (InterruptedException ex) {}
            }
            "".length();
        } while (null == null);
    }
    
    private static boolean llIIIIIlIIlllIl(final int lllllllllllllIlIIIIllIlIIllIIllI, final int lllllllllllllIlIIIIllIlIIllIIlIl) {
        return lllllllllllllIlIIIIllIlIIllIIllI < lllllllllllllIlIIIIllIlIIllIIlIl;
    }
    
    void add(final AbstractEpollChannel lllllllllllllIlIIIIllIllIIIlllIl) {
        if (llIIIIIlIIlIIll(EpollEventLoop.$assertionsDisabled ? 1 : 0) && llIIIIIlIIlIIll(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        final int lllllllllllllIlIIIIllIllIIIlllII = this.nextId();
        Native.epollCtlAdd(this.epollFd, lllllllllllllIlIIIIllIllIIIlllIl.fd, lllllllllllllIlIIIIllIllIIIlllIl.flags, lllllllllllllIlIIIIllIllIIIlllII);
        lllllllllllllIlIIIIllIllIIIlllIl.id = lllllllllllllIlIIIIllIllIIIlllII;
        this.ids.put(lllllllllllllIlIIIIllIllIIIlllII, lllllllllllllIlIIIIllIllIIIlllIl);
        "".length();
    }
    
    private void processReady(final long[] lllllllllllllIlIIIIllIlIlIllIIlI, final int lllllllllllllIlIIIIllIlIlIllIIIl) {
        int lllllllllllllIlIIIIllIlIlIllIlll = EpollEventLoop.lIIIlIlIlIllIl[0];
        while (llIIIIIlIIlllIl(lllllllllllllIlIIIIllIlIlIllIlll, lllllllllllllIlIIIIllIlIlIllIIIl)) {
            final long lllllllllllllIlIIIIllIlIlIlllIIl = lllllllllllllIlIIIIllIlIlIllIIlI[lllllllllllllIlIIIIllIlIlIllIlll];
            final int lllllllllllllIlIIIIllIlIlIlllIII = (int)(lllllllllllllIlIIIIllIlIlIlllIIl >> EpollEventLoop.lIIIlIlIlIllIl[7]);
            if (llIIIIIlIIlIIll(lllllllllllllIlIIIIllIlIlIlllIII)) {
                Native.eventFdRead(this.eventFd);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                int n;
                if (llIIIIIlIIlIllI(llIIIIIlIIlllII(lllllllllllllIlIIIIllIlIlIlllIIl & 0x1L, 0L))) {
                    n = EpollEventLoop.lIIIlIlIlIllIl[3];
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else {
                    n = EpollEventLoop.lIIIlIlIlIllIl[0];
                }
                final boolean lllllllllllllIlIIIIllIlIlIllllIl = n != 0;
                int n2;
                if (llIIIIIlIIlIllI(llIIIIIlIIlllII(lllllllllllllIlIIIIllIlIlIlllIIl & 0x2L, 0L))) {
                    n2 = EpollEventLoop.lIIIlIlIlIllIl[3];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else {
                    n2 = EpollEventLoop.lIIIlIlIlIllIl[0];
                }
                final boolean lllllllllllllIlIIIIllIlIlIllllII = n2 != 0;
                int n3;
                if (llIIIIIlIIlIllI(llIIIIIlIIlllII(lllllllllllllIlIIIIllIlIlIlllIIl & 0x8L, 0L))) {
                    n3 = EpollEventLoop.lIIIlIlIlIllIl[3];
                    "".length();
                    if ((24 + 114 - 108 + 100 ^ 2 + 65 - 43 + 111) == 0x0) {
                        return;
                    }
                }
                else {
                    n3 = EpollEventLoop.lIIIlIlIlIllIl[0];
                }
                final boolean lllllllllllllIlIIIIllIlIlIlllIll = n3 != 0;
                final AbstractEpollChannel lllllllllllllIlIIIIllIlIlIlllIlI = this.ids.get(lllllllllllllIlIIIIllIlIlIlllIII);
                if (llIIIIIlIIlIlll(lllllllllllllIlIIIIllIlIlIlllIlI)) {
                    final AbstractEpollChannel.AbstractEpollUnsafe lllllllllllllIlIIIIllIlIlIlllllI = (AbstractEpollChannel.AbstractEpollUnsafe)lllllllllllllIlIIIIllIlIlIlllIlI.unsafe();
                    if (llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIllllII ? 1 : 0) && llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIlllIlI.isOpen() ? 1 : 0)) {
                        lllllllllllllIlIIIIllIlIlIlllllI.epollOutReady();
                    }
                    if (llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIllllIl ? 1 : 0) && llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIlllIlI.isOpen() ? 1 : 0)) {
                        lllllllllllllIlIIIIllIlIlIlllllI.epollInReady();
                    }
                    if (llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIlllIll ? 1 : 0) && llIIIIIlIIlIllI(lllllllllllllIlIIIIllIlIlIlllIlI.isOpen() ? 1 : 0)) {
                        lllllllllllllIlIIIIllIlIlIlllllI.epollRdHupReady();
                    }
                }
            }
            ++lllllllllllllIlIIIIllIlIlIllIlll;
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
    }
    
    private static void llIIIIIlIIlIIlI() {
        (lIIIlIlIlIllIl = new int[14])[0] = ((0xD8 ^ 0xC2) & ~(0xA3 ^ 0xB9));
        EpollEventLoop.lIIIlIlIlIllIl[1] = (0x72 ^ 0x40);
        EpollEventLoop.lIIIlIlIlIllIl[2] = -" ".length();
        EpollEventLoop.lIIIlIlIlIllIl[3] = " ".length();
        EpollEventLoop.lIIIlIlIlIllIl[4] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        EpollEventLoop.lIIIlIlIlIllIl[5] = (0x76 ^ 0x12);
        EpollEventLoop.lIIIlIlIlIllIl[6] = "  ".length();
        EpollEventLoop.lIIIlIlIlIllIl[7] = (0x14 ^ 0x34);
        EpollEventLoop.lIIIlIlIlIllIl[8] = "   ".length();
        EpollEventLoop.lIIIlIlIlIllIl[9] = (0x26 ^ 0x55 ^ (0x48 ^ 0x3F));
        EpollEventLoop.lIIIlIlIlIllIl[10] = (127 + 144 - 138 + 41 ^ 70 + 53 - 69 + 117);
        EpollEventLoop.lIIIlIlIlIllIl[11] = (0x77 ^ 0x71);
        EpollEventLoop.lIIIlIlIlIllIl[12] = (0x8B ^ 0x8C);
        EpollEventLoop.lIIIlIlIlIllIl[13] = (0x41 ^ 0x49);
    }
    
    private static String llIIIIIlIIIllII(final String lllllllllllllIlIIIIllIlIlIIIlIlI, final String lllllllllllllIlIIIIllIlIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIlIlIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), EpollEventLoop.lIIIlIlIlIllIl[13]), "DES");
            final Cipher lllllllllllllIlIIIIllIlIlIIIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIllIlIlIIIllII.init(EpollEventLoop.lIIIlIlIlIllIl[6], lllllllllllllIlIIIIllIlIlIIIllIl);
            return new String(lllllllllllllIlIIIIllIlIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIlIlIIIlIll) {
            lllllllllllllIlIIIIllIlIlIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIIIlIIIlllI() {
        (lIIIlIlIlIlIll = new String[EpollEventLoop.lIIIlIlIlIllIl[12]])[EpollEventLoop.lIIIlIlIlIllIl[0]] = llIIIIIlIIIlIll("MA0CEDowDWpR", "YbPqN");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[3]] = llIIIIIlIIIlIll("c14iDzI2FTMSJmlWd1d+cx8oJSMnHyhXfm5Wdkdyeg==", "SvGwB");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[6]] = llIIIIIlIIIllII("0vXMou/5IZ7xzJl3G8C+TVS4WBi8qnCBIFM+MsvZmILwX7Q41Ozvvsg/naf7ealj", "bUYGd");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[8]] = llIIIIIlIIIllII("pfRTtxNCc2Anh4NFA6qqdswJEPyknlYfFZn5r3dnuN8=", "wrFcn");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[9]] = llIIIIIlIIIllIl("L9V52QJdUW6BqVRvneJUd+FKkyHf0c+MEQGuAcBK2pc=", "knjTa");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[10]] = llIIIIIlIIIllIl("WpN6s3Eq2+g=", "zZAuq");
        EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[11]] = llIIIIIlIIIlIll("BjUDLTQkJA==", "qThHZ");
    }
    
    @Override
    protected Queue<Runnable> newTaskQueue() {
        return PlatformDependent.newMpscQueue();
    }
    
    private static String llIIIIIlIIIlIll(String lllllllllllllIlIIIIllIlIIlllIlIl, final String lllllllllllllIlIIIIllIlIIlllIlII) {
        lllllllllllllIlIIIIllIlIIlllIlIl = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIllIlIIlllIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIllIlIIllllIII = new StringBuilder();
        final char[] lllllllllllllIlIIIIllIlIIlllIlll = lllllllllllllIlIIIIllIlIIlllIlII.toCharArray();
        int lllllllllllllIlIIIIllIlIIlllIllI = EpollEventLoop.lIIIlIlIlIllIl[0];
        final double lllllllllllllIlIIIIllIlIIlllIIII = (Object)((String)lllllllllllllIlIIIIllIlIIlllIlIl).toCharArray();
        final float lllllllllllllIlIIIIllIlIIllIllll = lllllllllllllIlIIIIllIlIIlllIIII.length;
        long lllllllllllllIlIIIIllIlIIllIlllI = EpollEventLoop.lIIIlIlIlIllIl[0];
        while (llIIIIIlIIlllIl((int)lllllllllllllIlIIIIllIlIIllIlllI, (int)lllllllllllllIlIIIIllIlIIllIllll)) {
            final char lllllllllllllIlIIIIllIlIIllllIll = lllllllllllllIlIIIIllIlIIlllIIII[lllllllllllllIlIIIIllIlIIllIlllI];
            lllllllllllllIlIIIIllIlIIllllIII.append((char)(lllllllllllllIlIIIIllIlIIllllIll ^ lllllllllllllIlIIIIllIlIIlllIlll[lllllllllllllIlIIIIllIlIIlllIllI % lllllllllllllIlIIIIllIlIIlllIlll.length]));
            "".length();
            ++lllllllllllllIlIIIIllIlIIlllIllI;
            ++lllllllllllllIlIIIIllIlIIllIlllI;
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIllIlIIllllIII);
    }
    
    EpollEventLoop(final EventLoopGroup lllllllllllllIlIIIIllIllIIllIllI, final ThreadFactory lllllllllllllIlIIIIllIllIIllIlIl, final int lllllllllllllIlIIIIllIllIIlllIll) {
        super(lllllllllllllIlIIIIllIllIIllIllI, lllllllllllllIlIIIIllIllIIllIlIl, (boolean)(EpollEventLoop.lIIIlIlIlIllIl[0] != 0));
        this.ids = new IntObjectHashMap<AbstractEpollChannel>();
        this.ioRatio = EpollEventLoop.lIIIlIlIlIllIl[1];
        this.events = new long[lllllllllllllIlIIIIllIllIIlllIll];
        boolean lllllllllllllIlIIIIllIllIIlllIlI = EpollEventLoop.lIIIlIlIlIllIl[0] != 0;
        int lllllllllllllIlIIIIllIllIIlllIIl = EpollEventLoop.lIIIlIlIlIllIl[2];
        int lllllllllllllIlIIIIllIllIIlllIII = EpollEventLoop.lIIIlIlIlIllIl[2];
        try {
            lllllllllllllIlIIIIllIllIIlllIIl = (this.epollFd = Native.epollCreate());
            lllllllllllllIlIIIIllIllIIlllIII = (this.eventFd = Native.eventFd());
            Native.epollCtlAdd(lllllllllllllIlIIIIllIllIIlllIIl, lllllllllllllIlIIIIllIllIIlllIII, EpollEventLoop.lIIIlIlIlIllIl[3], EpollEventLoop.lIIIlIlIlIllIl[0]);
            lllllllllllllIlIIIIllIllIIlllIlI = (EpollEventLoop.lIIIlIlIlIllIl[3] != 0);
            if (llIIIIIlIIlIIll(lllllllllllllIlIIIIllIllIIlllIlI ? 1 : 0)) {
                if (llIIIIIlIIlIlII(lllllllllllllIlIIIIllIllIIlllIIl, EpollEventLoop.lIIIlIlIlIllIl[2])) {
                    try {
                        Native.close(lllllllllllllIlIIIIllIllIIlllIIl);
                        "".length();
                        if (null != null) {
                            throw null;
                        }
                    }
                    catch (Exception ex) {}
                }
                if (llIIIIIlIIlIlII(lllllllllllllIlIIIIllIllIIlllIII, EpollEventLoop.lIIIlIlIlIllIl[2])) {
                    try {
                        Native.close(lllllllllllllIlIIIIllIllIIlllIII);
                        "".length();
                        if (-" ".length() >= (59 + 69 - 70 + 112 ^ 59 + 168 - 67 + 14)) {
                            throw null;
                        }
                    }
                    catch (Exception lllllllllllllIlIIIIllIllIlIIIIIl) {
                        "".length();
                        if (null != null) {
                            throw null;
                        }
                    }
                }
            }
        }
        finally {
            if (llIIIIIlIIlIIll(lllllllllllllIlIIIIllIllIIlllIlI ? 1 : 0)) {
                if (llIIIIIlIIlIlII(lllllllllllllIlIIIIllIllIIlllIIl, EpollEventLoop.lIIIlIlIlIllIl[2])) {
                    try {
                        Native.close(lllllllllllllIlIIIIllIllIIlllIIl);
                        "".length();
                        if ((0x33 ^ 0x37) == 0x0) {
                            throw null;
                        }
                    }
                    catch (Exception ex2) {}
                }
                if (llIIIIIlIIlIlII(lllllllllllllIlIIIIllIllIIlllIII, EpollEventLoop.lIIIlIlIlIllIl[2])) {
                    try {
                        Native.close(lllllllllllllIlIIIIllIllIIlllIII);
                        "".length();
                        if (-"   ".length() >= 0) {
                            throw null;
                        }
                    }
                    catch (Exception ex3) {}
                }
            }
        }
    }
    
    private static boolean llIIIIIlIIlIlll(final Object lllllllllllllIlIIIIllIlIIlIlllll) {
        return lllllllllllllIlIIIIllIlIIlIlllll != null;
    }
    
    private static boolean llIIIIIlIIlIlIl(final int lllllllllllllIlIIIIllIlIIllIlIlI, final int lllllllllllllIlIIIIllIlIIllIlIIl) {
        return lllllllllllllIlIIIIllIlIIllIlIlI == lllllllllllllIlIIIIllIlIIllIlIIl;
    }
    
    static {
        llIIIIIlIIlIIlI();
        llIIIIIlIIIlllI();
        int $assertionsDisabled2;
        if (llIIIIIlIIlIIll(EpollEventLoop.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = EpollEventLoop.lIIIlIlIlIllIl[3];
            "".length();
            if (((0xA5 ^ 0x98) & ~(0x3D ^ 0x0)) >= "   ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = EpollEventLoop.lIIIlIlIlIllIl[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(EpollEventLoop.class);
        AtomicIntegerFieldUpdater<EpollEventLoop> lllllllllllllIlIIIIllIlIlIlIIIII = PlatformDependent.newAtomicIntegerFieldUpdater(EpollEventLoop.class, EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[10]]);
        if (llIIIIIlIIllllI(lllllllllllllIlIIIIllIlIlIlIIIII)) {
            lllllllllllllIlIIIIllIlIlIlIIIII = AtomicIntegerFieldUpdater.newUpdater(EpollEventLoop.class, EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[11]]);
        }
        WAKEN_UP_UPDATER = lllllllllllllIlIIIIllIlIlIlIIIII;
    }
    
    private static String llIIIIIlIIIllIl(final String lllllllllllllIlIIIIllIlIlIIlIlIl, final String lllllllllllllIlIIIIllIlIlIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIlIlIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIlIlIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIllIlIlIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIllIlIlIIllIIl.init(EpollEventLoop.lIIIlIlIlIllIl[6], lllllllllllllIlIIIIllIlIlIIllIlI);
            return new String(lllllllllllllIlIIIIllIlIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIlIlIIllIII) {
            lllllllllllllIlIIIIllIlIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void cleanup() {
        try {
            Native.close(this.epollFd);
            "".length();
            if (-(0x36 ^ 0x32) > 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIIIIllIlIlIlIIllI) {
            EpollEventLoop.logger.warn(EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[8]], lllllllllllllIlIIIIllIlIlIlIIllI);
        }
        try {
            Native.close(this.eventFd);
            "".length();
            if ("   ".length() > (0x21 ^ 0x3 ^ (0x3 ^ 0x25))) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIIIIllIlIlIlIIlIl) {
            EpollEventLoop.logger.warn(EpollEventLoop.lIIIlIlIlIlIll[EpollEventLoop.lIIIlIlIlIllIl[9]], lllllllllllllIlIIIIllIlIlIlIIlIl);
        }
    }
}
