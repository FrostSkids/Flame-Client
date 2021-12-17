// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import java.util.concurrent.TimeUnit;
import java.util.ConcurrentModificationException;
import java.nio.channels.CancelledKeyException;
import io.netty.channel.EventLoopException;
import java.lang.reflect.Field;
import io.netty.channel.ChannelException;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import java.util.Queue;
import io.netty.channel.EventLoopGroup;
import java.util.concurrent.ThreadFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import io.netty.util.internal.logging.InternalLogger;
import java.nio.channels.spi.SelectorProvider;
import java.nio.channels.Selector;
import io.netty.channel.SingleThreadEventLoop;

public final class NioEventLoop extends SingleThreadEventLoop
{
    /* synthetic */ Selector selector;
    private final /* synthetic */ SelectorProvider provider;
    private static final /* synthetic */ int[] lIlllIIIllIIlI;
    private static final /* synthetic */ int SELECTOR_AUTO_REBUILD_THRESHOLD;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ boolean DISABLE_KEYSET_OPTIMIZATION;
    private volatile /* synthetic */ int ioRatio;
    private static final /* synthetic */ String[] lIlllIIIlIllll;
    private /* synthetic */ SelectedSelectionKeySet selectedKeys;
    private final /* synthetic */ AtomicBoolean wakenUp;
    private /* synthetic */ boolean needsToSelectAgain;
    private /* synthetic */ int cancelledKeys;
    
    private static void invokeChannelUnregistered(final NioTask<SelectableChannel> llllllllllllIlllllIlIlllIIlIlIll, final SelectionKey llllllllllllIlllllIlIlllIIlIlIlI, final Throwable llllllllllllIlllllIlIlllIIlIIllI) {
        try {
            llllllllllllIlllllIlIlllIIlIlIll.channelUnregistered(llllllllllllIlllllIlIlllIIlIlIlI.channel(), llllllllllllIlllllIlIlllIIlIIllI);
            "".length();
            if (((0x53 ^ 0x56) & ~(0x2B ^ 0x2E)) != 0x0) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllIlIlllIIlIllII) {
            NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[29]], llllllllllllIlllllIlIlllIIlIllII);
        }
    }
    
    private void processSelectedKeysOptimized(SelectionKey[] llllllllllllIlllllIlIlllIllIlIlI) {
        int llllllllllllIlllllIlIlllIllIlllI = NioEventLoop.lIlllIIIllIIlI[0];
        do {
            final SelectionKey llllllllllllIlllllIlIlllIlllIIII = llllllllllllIlllllIlIlllIllIlIlI[llllllllllllIlllllIlIlllIllIlllI];
            if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIlllIlllIIII)) {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIlIlllIllIlIlI[llllllllllllIlllllIlIlllIllIlllI] = null;
                final Object llllllllllllIlllllIlIlllIllIllll = llllllllllllIlllllIlIlllIlllIIII.attachment();
                if (lIIIIIIlIlIlIlII((llllllllllllIlllllIlIlllIllIllll instanceof AbstractNioChannel) ? 1 : 0)) {
                    processSelectedKey(llllllllllllIlllllIlIlllIlllIIII, (AbstractNioChannel)llllllllllllIlllllIlIlllIllIllll);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    final NioTask<SelectableChannel> llllllllllllIlllllIlIlllIlllIIIl = (NioTask<SelectableChannel>)llllllllllllIlllllIlIlllIllIllll;
                    processSelectedKey(llllllllllllIlllllIlIlllIlllIIII, llllllllllllIlllllIlIlllIlllIIIl);
                }
                if (lIIIIIIlIlIlIlII(this.needsToSelectAgain ? 1 : 0)) {
                    while (!lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIlllIllIlIlI[llllllllllllIlllllIlIlllIllIlllI])) {
                        llllllllllllIlllllIlIlllIllIlIlI[llllllllllllIlllllIlIlllIllIlllI] = null;
                        ++llllllllllllIlllllIlIlllIllIlllI;
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    "".length();
                    if ((0xA3 ^ 0xA6) == 0x0) {
                        return;
                    }
                    this.selectAgain();
                    llllllllllllIlllllIlIlllIllIlIlI = this.selectedKeys.flip();
                    llllllllllllIlllllIlIlllIllIlllI = NioEventLoop.lIlllIIIllIIlI[10];
                }
                ++llllllllllllIlllllIlIlllIllIlllI;
                "".length();
            }
        } while (null == null);
    }
    
    void selectNow() throws IOException {
        try {
            this.selector.selectNow();
            "".length();
            if (lIIIIIIlIlIlIlII(this.wakenUp.get() ? 1 : 0)) {
                this.selector.wakeup();
                "".length();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        finally {
            if (lIIIIIIlIlIlIlII(this.wakenUp.get() ? 1 : 0)) {
                this.selector.wakeup();
                "".length();
            }
        }
    }
    
    private static boolean lIIIIIIlIlIlIlII(final int llllllllllllIlllllIlIllIlIlIlIII) {
        return llllllllllllIlllllIlIllIlIlIlIII != 0;
    }
    
    private static boolean lIIIIIIlIlIlIIlI(final Object llllllllllllIlllllIlIllIlIlIlIlI) {
        return llllllllllllIlllllIlIllIlIlIlIlI == null;
    }
    
    private void processSelectedKeys() {
        if (lIIIIIIlIlIllIII(this.selectedKeys)) {
            this.processSelectedKeysOptimized(this.selectedKeys.flip());
            "".length();
            if ((0xED ^ 0xAF ^ (0x35 ^ 0x73)) != (103 + 46 - 132 + 118 ^ 61 + 58 - 52 + 64)) {
                return;
            }
        }
        else {
            this.processSelectedKeysPlain(this.selector.selectedKeys());
        }
    }
    
    private static boolean lIIIIIIlIlIlIlIl(final int llllllllllllIlllllIlIllIlIlIIllI) {
        return llllllllllllIlllllIlIllIlIlIIllI == 0;
    }
    
    @Override
    protected void cleanup() {
        try {
            this.selector.close();
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        }
        catch (IOException llllllllllllIlllllIlIllllIIllIIl) {
            NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[26]], llllllllllllIlllllIlIllllIIllIIl);
        }
    }
    
    private static String lIIIIIIlIlIIllII(String llllllllllllIlllllIlIllIllIlIIll, final String llllllllllllIlllllIlIllIllIlIlll) {
        llllllllllllIlllllIlIllIllIlIIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIlIllIllIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlIllIllIlIllI = new StringBuilder();
        final char[] llllllllllllIlllllIlIllIllIlIlIl = llllllllllllIlllllIlIllIllIlIlll.toCharArray();
        int llllllllllllIlllllIlIllIllIlIlII = NioEventLoop.lIlllIIIllIIlI[0];
        final byte llllllllllllIlllllIlIllIllIIlllI = (Object)((String)llllllllllllIlllllIlIllIllIlIIll).toCharArray();
        final double llllllllllllIlllllIlIllIllIIllIl = llllllllllllIlllllIlIllIllIIlllI.length;
        double llllllllllllIlllllIlIllIllIIllII = NioEventLoop.lIlllIIIllIIlI[0];
        while (lIIIIIIlIlIlllll((int)llllllllllllIlllllIlIllIllIIllII, (int)llllllllllllIlllllIlIllIllIIllIl)) {
            final char llllllllllllIlllllIlIllIllIllIIl = llllllllllllIlllllIlIllIllIIlllI[llllllllllllIlllllIlIllIllIIllII];
            llllllllllllIlllllIlIllIllIlIllI.append((char)(llllllllllllIlllllIlIllIllIllIIl ^ llllllllllllIlllllIlIllIllIlIlIl[llllllllllllIlllllIlIllIllIlIlII % llllllllllllIlllllIlIllIllIlIlIl.length]));
            "".length();
            ++llllllllllllIlllllIlIllIllIlIlII;
            ++llllllllllllIlllllIlIllIllIIllII;
            "".length();
            if (-" ".length() == ((80 + 97 - 78 + 28 ^ (0xE3 ^ 0xBF)) & (0x24 ^ 0x7 ^ ((0x57 ^ 0x50) & ~(0xBD ^ 0xBA)) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlIllIllIlIllI);
    }
    
    private static int lIIIIIIlIlIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    NioEventLoop(final NioEventLoopGroup llllllllllllIlllllIllIIIIIIIIIII, final ThreadFactory llllllllllllIlllllIlIlllllllllll, final SelectorProvider llllllllllllIlllllIlIllllllllllI) {
        super(llllllllllllIlllllIllIIIIIIIIIII, llllllllllllIlllllIlIlllllllllll, (boolean)(NioEventLoop.lIlllIIIllIIlI[0] != 0));
        this.wakenUp = new AtomicBoolean();
        this.ioRatio = NioEventLoop.lIlllIIIllIIlI[1];
        if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIllllllllllI)) {
            throw new NullPointerException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[0]]);
        }
        this.provider = llllllllllllIlllllIlIllllllllllI;
        this.selector = this.openSelector();
    }
    
    @Override
    protected Queue<Runnable> newTaskQueue() {
        return PlatformDependent.newMpscQueue();
    }
    
    private static String lIIIIIIlIlIIlIll(final String llllllllllllIlllllIlIllIllIIIIll, final String llllllllllllIlllllIlIllIllIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIllIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIllIllIIIIII.getBytes(StandardCharsets.UTF_8)), NioEventLoop.lIlllIIIllIIlI[9]), "DES");
            final Cipher llllllllllllIlllllIlIllIllIIIlIl = Cipher.getInstance("DES");
            llllllllllllIlllllIlIllIllIIIlIl.init(NioEventLoop.lIlllIIIllIIlI[3], llllllllllllIlllllIlIllIllIIIllI);
            return new String(llllllllllllIlllllIlIllIllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIllIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIllIllIIIlII) {
            llllllllllllIlllllIlIllIllIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIlIlIlllII(final int llllllllllllIlllllIlIllIlIlIIIlI) {
        return llllllllllllIlllllIlIllIlIlIIIlI <= 0;
    }
    
    private void processSelectedKeysPlain(Set<SelectionKey> llllllllllllIlllllIlIlllIlllllII) {
        if (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIlllllII.isEmpty() ? 1 : 0)) {
            return;
        }
        Iterator<SelectionKey> llllllllllllIlllllIlIlllIllllllI = llllllllllllIlllllIlIlllIlllllII.iterator();
        do {
            final SelectionKey llllllllllllIlllllIlIllllIIIIIlI = llllllllllllIlllllIlIlllIllllllI.next();
            final Object llllllllllllIlllllIlIllllIIIIIIl = llllllllllllIlllllIlIllllIIIIIlI.attachment();
            llllllllllllIlllllIlIlllIllllllI.remove();
            if (lIIIIIIlIlIlIlII((llllllllllllIlllllIlIllllIIIIIIl instanceof AbstractNioChannel) ? 1 : 0)) {
                processSelectedKey(llllllllllllIlllllIlIllllIIIIIlI, (AbstractNioChannel)llllllllllllIlllllIlIllllIIIIIIl);
                "".length();
                if ((0x73 ^ 0x77) <= ((0x63 ^ 0x40) & ~(0x46 ^ 0x65))) {
                    return;
                }
            }
            else {
                final NioTask<SelectableChannel> llllllllllllIlllllIlIllllIIIIIll = (NioTask<SelectableChannel>)llllllllllllIlllllIlIllllIIIIIIl;
                processSelectedKey(llllllllllllIlllllIlIllllIIIIIlI, llllllllllllIlllllIlIllllIIIIIll);
            }
            if (!lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIllllllI.hasNext() ? 1 : 0)) {
                if (lIIIIIIlIlIlIlII(this.needsToSelectAgain ? 1 : 0)) {
                    this.selectAgain();
                    llllllllllllIlllllIlIlllIlllllII = this.selector.selectedKeys();
                    if (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIlllllII.isEmpty() ? 1 : 0)) {
                        "".length();
                        if ((27 + 30 + 31 + 51 ^ 123 + 26 - 70 + 64) <= "  ".length()) {
                            return;
                        }
                        return;
                    }
                    else {
                        llllllllllllIlllllIlIlllIllllllI = llllllllllllIlllllIlIlllIlllllII.iterator();
                    }
                }
                "".length();
                continue;
            }
            "".length();
            if (null != null) {
                return;
            }
        } while ((0x9B ^ 0x9E) > 0);
    }
    
    @Override
    protected void wakeup(final boolean llllllllllllIlllllIlIlllIIlIIIIl) {
        if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIIlIIIIl ? 1 : 0) && lIIIIIIlIlIlIlII(this.wakenUp.compareAndSet((boolean)(NioEventLoop.lIlllIIIllIIlI[0] != 0), (boolean)(NioEventLoop.lIlllIIIllIIlI[2] != 0)) ? 1 : 0)) {
            this.selector.wakeup();
            "".length();
        }
    }
    
    private static String lIIIIIIlIlIIllIl(final String llllllllllllIlllllIlIllIlllIIllI, final String llllllllllllIlllllIlIllIlllIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIllIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIllIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlIllIlllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlIllIlllIlIlI.init(NioEventLoop.lIlllIIIllIIlI[3], llllllllllllIlllllIlIllIlllIlIll);
            return new String(llllllllllllIlllllIlIllIlllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIllIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIllIlllIlIIl) {
            llllllllllllIlllllIlIllIlllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private void selectAgain() {
        this.needsToSelectAgain = (NioEventLoop.lIlllIIIllIIlI[0] != 0);
        try {
            this.selector.selectNow();
            "".length();
            "".length();
            if (((149 + 173 - 297 + 174 ^ 96 + 96 - 65 + 13) & ("  ".length() ^ (0x11 ^ 0x58) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllllIlIllIlllllIll) {
            NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[34]], llllllllllllIlllllIlIllIlllllIll);
        }
    }
    
    public void setIoRatio(final int llllllllllllIlllllIlIlllllIlIIll) {
        if (!lIIIIIIlIlIlIllI(llllllllllllIlllllIlIlllllIlIIll) || lIIIIIIlIlIlIlll(llllllllllllIlllllIlIlllllIlIIll, NioEventLoop.lIlllIIIllIIlI[17])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[18]]).append(llllllllllllIlllllIlIlllllIlIIll).append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[19]])));
        }
        this.ioRatio = llllllllllllIlllllIlIlllllIlIIll;
    }
    
    private void closeAll() {
        this.selectAgain();
        final Set<SelectionKey> llllllllllllIlllllIlIlllIIlllIIl = this.selector.keys();
        final Collection<AbstractNioChannel> llllllllllllIlllllIlIlllIIlllIII = new ArrayList<AbstractNioChannel>(llllllllllllIlllllIlIlllIIlllIIl.size());
        final Iterator llllllllllllIlllllIlIlllIIllllIl = llllllllllllIlllllIlIlllIIlllIIl.iterator();
        while (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIIllllIl.hasNext() ? 1 : 0)) {
            final SelectionKey llllllllllllIlllllIlIlllIIlllllI = llllllllllllIlllllIlIlllIIllllIl.next();
            final Object llllllllllllIlllllIlIlllIIllllll = llllllllllllIlllllIlIlllIIlllllI.attachment();
            if (lIIIIIIlIlIlIlII((llllllllllllIlllllIlIlllIIllllll instanceof AbstractNioChannel) ? 1 : 0)) {
                llllllllllllIlllllIlIlllIIlllIII.add((AbstractNioChannel)llllllllllllIlllllIlIlllIIllllll);
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIlIlllIIlllllI.cancel();
                final NioTask<SelectableChannel> llllllllllllIlllllIlIlllIlIIIIII = (NioTask<SelectableChannel>)llllllllllllIlllllIlIlllIIllllll;
                invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIIIII, llllllllllllIlllllIlIlllIIlllllI, null);
            }
            "".length();
            if ("   ".length() < ((0x4E ^ 0x32 ^ (0xCA ^ 0x9E)) & (((0xC7 ^ 0x87) & ~(0x2F ^ 0x6F)) ^ (0x7D ^ 0x55) ^ -" ".length()))) {
                return;
            }
        }
        final Iterator llllllllllllIlllllIlIlllIIlllIll = llllllllllllIlllllIlIlllIIlllIII.iterator();
        while (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIIlllIll.hasNext() ? 1 : 0)) {
            final AbstractNioChannel llllllllllllIlllllIlIlllIIllllII = llllllllllllIlllllIlIlllIIlllIll.next();
            llllllllllllIlllllIlIlllIIllllII.unsafe().close(llllllllllllIlllllIlIlllIIllllII.unsafe().voidPromise());
            "".length();
            if ((147 + 113 - 225 + 130 ^ 135 + 17 - 132 + 141) > (46 + 37 - 35 + 93 ^ 131 + 133 - 131 + 4)) {
                return;
            }
        }
    }
    
    private static boolean lIIIIIIlIlIllIII(final Object llllllllllllIlllllIlIllIlIlIllII) {
        return llllllllllllIlllllIlIllIlIlIllII != null;
    }
    
    static {
        lIIIIIIlIlIlIIII();
        lIIIIIIlIlIIlllI();
        CLEANUP_INTERVAL = NioEventLoop.lIlllIIIllIIlI[27];
        MIN_PREMATURE_SELECTOR_RETURNS = NioEventLoop.lIlllIIIllIIlI[4];
        logger = InternalLoggerFactory.getInstance(NioEventLoop.class);
        DISABLE_KEYSET_OPTIMIZATION = SystemPropertyUtil.getBoolean(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[35]], (boolean)(NioEventLoop.lIlllIIIllIIlI[0] != 0));
        final String llllllllllllIlllllIlIllIllllIIll = NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[36]];
        try {
            final String llllllllllllIlllllIlIllIllllIlIl = SystemPropertyUtil.get(llllllllllllIlllllIlIllIllllIIll);
            if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIllIllllIlIl)) {
                System.setProperty(llllllllllllIlllllIlIllIllllIIll, NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[37]]);
                "".length();
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SecurityException llllllllllllIlllllIlIllIllllIlII) {
            if (lIIIIIIlIlIlIlII(NioEventLoop.logger.isDebugEnabled() ? 1 : 0)) {
                NioEventLoop.logger.debug(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[38]], llllllllllllIlllllIlIllIllllIIll, llllllllllllIlllllIlIllIllllIlII);
            }
        }
        int llllllllllllIlllllIlIllIllllIIlI = SystemPropertyUtil.getInt(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[39]], NioEventLoop.lIlllIIIllIIlI[40]);
        if (lIIIIIIlIlIlllll(llllllllllllIlllllIlIllIllllIIlI, NioEventLoop.lIlllIIIllIIlI[4])) {
            llllllllllllIlllllIlIllIllllIIlI = NioEventLoop.lIlllIIIllIIlI[0];
        }
        SELECTOR_AUTO_REBUILD_THRESHOLD = llllllllllllIlllllIlIllIllllIIlI;
        if (lIIIIIIlIlIlIlII(NioEventLoop.logger.isDebugEnabled() ? 1 : 0)) {
            NioEventLoop.logger.debug(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[41]], (Object)NioEventLoop.DISABLE_KEYSET_OPTIMIZATION);
            NioEventLoop.logger.debug(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[42]], (Object)NioEventLoop.SELECTOR_AUTO_REBUILD_THRESHOLD);
        }
    }
    
    private static boolean lIIIIIIlIlIlllll(final int llllllllllllIlllllIlIllIlIllIIll, final int llllllllllllIlllllIlIllIlIllIIlI) {
        return llllllllllllIlllllIlIllIlIllIIll < llllllllllllIlllllIlIllIlIllIIlI;
    }
    
    private Selector openSelector() {
        Selector llllllllllllIlllllIlIlllllllIIII;
        try {
            llllllllllllIlllllIlIlllllllIIII = this.provider.openSelector();
            "".length();
            if ((161 + 162 - 221 + 89 ^ 76 + 134 - 125 + 102) == -" ".length()) {
                return null;
            }
        }
        catch (IOException llllllllllllIlllllIlIlllllllIlll) {
            throw new ChannelException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[2]], llllllllllllIlllllIlIlllllllIlll);
        }
        if (lIIIIIIlIlIlIlII(NioEventLoop.DISABLE_KEYSET_OPTIMIZATION ? 1 : 0)) {
            return llllllllllllIlllllIlIlllllllIIII;
        }
        try {
            final SelectedSelectionKeySet llllllllllllIlllllIlIlllllllIllI = new SelectedSelectionKeySet();
            final Class<?> llllllllllllIlllllIlIlllllllIlIl = Class.forName(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[3]], (boolean)(NioEventLoop.lIlllIIIllIIlI[0] != 0), PlatformDependent.getSystemClassLoader());
            if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllllllIlIl.isAssignableFrom(llllllllllllIlllllIlIlllllllIIII.getClass()) ? 1 : 0)) {
                return llllllllllllIlllllIlIlllllllIIII;
            }
            final Field llllllllllllIlllllIlIlllllllIlII = llllllllllllIlllllIlIlllllllIlIl.getDeclaredField(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[4]]);
            final Field llllllllllllIlllllIlIlllllllIIll = llllllllllllIlllllIlIlllllllIlIl.getDeclaredField(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[5]]);
            llllllllllllIlllllIlIlllllllIlII.setAccessible((boolean)(NioEventLoop.lIlllIIIllIIlI[2] != 0));
            llllllllllllIlllllIlIlllllllIIll.setAccessible((boolean)(NioEventLoop.lIlllIIIllIIlI[2] != 0));
            llllllllllllIlllllIlIlllllllIlII.set(llllllllllllIlllllIlIlllllllIIII, llllllllllllIlllllIlIlllllllIllI);
            llllllllllllIlllllIlIlllllllIIll.set(llllllllllllIlllllIlIlllllllIIII, llllllllllllIlllllIlIlllllllIllI);
            this.selectedKeys = llllllllllllIlllllIlIlllllllIllI;
            NioEventLoop.logger.trace(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[6]], llllllllllllIlllllIlIlllllllIIII);
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (Throwable llllllllllllIlllllIlIlllllllIIlI) {
            this.selectedKeys = null;
            NioEventLoop.logger.trace(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[7]], llllllllllllIlllllIlIlllllllIIII, llllllllllllIlllllIlIlllllllIIlI);
        }
        return llllllllllllIlllllIlIlllllllIIII;
    }
    
    @Override
    protected void run() {
        do {
            final boolean llllllllllllIlllllIlIllllIlIIlIl = this.wakenUp.getAndSet((boolean)(NioEventLoop.lIlllIIIllIIlI[0] != 0));
            try {
                if (lIIIIIIlIlIlIlII(this.hasTasks() ? 1 : 0)) {
                    this.selectNow();
                    "".length();
                    if ("   ".length() > (0xB3 ^ 0xB7)) {
                        return;
                    }
                }
                else {
                    this.select(llllllllllllIlllllIlIllllIlIIlIl);
                    if (lIIIIIIlIlIlIlII(this.wakenUp.get() ? 1 : 0)) {
                        this.selector.wakeup();
                        "".length();
                    }
                }
                this.cancelledKeys = NioEventLoop.lIlllIIIllIIlI[0];
                this.needsToSelectAgain = (NioEventLoop.lIlllIIIllIIlI[0] != 0);
                final int llllllllllllIlllllIlIllllIlIlIII = this.ioRatio;
                if (lIIIIIIlIlIllIIl(llllllllllllIlllllIlIllllIlIlIII, NioEventLoop.lIlllIIIllIIlI[17])) {
                    this.processSelectedKeys();
                    this.runAllTasks();
                    "".length();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    final long llllllllllllIlllllIlIllllIlIlIlI = System.nanoTime();
                    this.processSelectedKeys();
                    final long llllllllllllIlllllIlIllllIlIlIIl = System.nanoTime() - llllllllllllIlllllIlIllllIlIlIlI;
                    this.runAllTasks(llllllllllllIlllllIlIllllIlIlIIl * (NioEventLoop.lIlllIIIllIIlI[17] - llllllllllllIlllllIlIllllIlIlIII) / llllllllllllIlllllIlIllllIlIlIII);
                    "".length();
                }
                if (lIIIIIIlIlIlIlII(this.isShuttingDown() ? 1 : 0)) {
                    this.closeAll();
                    if (lIIIIIIlIlIlIlII(this.confirmShutdown() ? 1 : 0)) {
                        "".length();
                        if ((93 + 52 - 84 + 83 ^ 109 + 9 + 20 + 10) <= "  ".length()) {
                            return;
                        }
                        return;
                    }
                }
                "".length();
                if (-(0x1B ^ 0x7B ^ (0x3 ^ 0x66)) >= 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlllllIlIllllIlIIllI) {
                NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[25]], llllllllllllIlllllIlIllllIlIIllI);
                try {
                    Thread.sleep(1000L);
                    "".length();
                    if (((0xBA ^ 0xA2) & ~(0x8 ^ 0x10)) != 0x0) {
                        return;
                    }
                }
                catch (InterruptedException ex) {}
            }
            "".length();
        } while ((0x10 ^ 0x15) > 0);
    }
    
    private static void lIIIIIIlIlIIlllI() {
        (lIlllIIIlIllll = new String[NioEventLoop.lIlllIIIllIIlI[43]])[NioEventLoop.lIlllIIIllIIlI[0]] = lIIIIIIlIlIIlIll("0QBc3miqhk3HztE6MKV3dmVQTsVR0BoD", "VnHdZ");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[2]] = lIIIIIIlIlIIllII("JzUaHz0ldAcceC4kFh14IHQdFi9hJxYfPSIgHAE=", "ATssX");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[3]] = lIIIIIIlIlIIlIll("JcCRbaEuTO/rcJx5z/kdiJrPo6K7dl5H", "IIpoH");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[4]] = lIIIIIIlIlIIllIl("2SDL7C0Qj2u0Fe/oqcieKw==", "tRapY");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[5]] = lIIIIIIlIlIIllIl("kDrP4UnhSlEaFQW0U5MC/YzAn2FTjjNS", "MnPAx");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[6]] = lIIIIIIlIlIIllIl("EkLLJE5I9woPjCWqXuO2o0grfd/aePrwbZ4MKN2vvWO/uLnwIV6F0r9Uk1zEh+OL/ahGx4dYvgQ=", "ykqLx");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[7]] = lIIIIIIlIlIIllII("PDYbDQoedwYOTxM5ARUdDzoXDxtaNhxBAAojGwwGADIWQQUbIRNPGg4+Hk88HyNSCAEOOEhBFAc=", "zWrao");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[8]] = lIIIIIIlIlIIllIl("JCxmJvd16Yo=", "NFXuX");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[9]] = lIIIIIIlIlIIllIl("hFuRfI3XdVjiTfg4z4EgA3runC7HkeA733kBlBT0mc4=", "XOeOq");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[11]] = lIIIIIIlIlIIllII("KBQHJx4oHlEvHDUfAyMBNTUBNUhh", "AzqFr");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[12]] = lIIIIIIlIlIIllII("ZwI1KSYrOyQ2dW8=", "OtTEO");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[14]] = lIIIIIIlIlIIllII("AisdMQ==", "vJnZS");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[15]] = lIIIIIIlIlIIllIl("m7pRlY8uv9Bm95e7xvLMwN4V8f+mXSMG", "tYyzC");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[16]] = lIIIIIIlIlIIllIl("iyx+ThKFfMVfDEdCBpgenujcXdAX8S/HztzZ8zR7HuA=", "umVxG");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[18]] = lIIIIIIlIlIIllII("JzsnJQMnO09k", "NTuDw");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[19]] = lIIIIIIlIlIIllIl("J77n9k5DkYGOvFsIQtuJWofosUEtxD2+6p2wYLZSouo=", "yobNl");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[20]] = lIIIIIIlIlIIlIll("D4fGnIHB46DUkmKkUHgMkycTdB9kobpm+VGcZfMtYje6N2cCaA7ofw==", "tTDQN");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[21]] = lIIIIIIlIlIIllIl("saivPDvASfNyUYqSEY45cOr4h6LqTH7RpuYU6pA992LiZbzut4BiPVptTH9Dee/DLHcFPh2APXE=", "ALhiA");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[22]] = lIIIIIIlIlIIlIll("QAGkZg5JP63660hRfS161A2MakUBQh8Ciy4VdtTdt0wtk2T6zfNAMQ==", "clHvX");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[23]] = lIIIIIIlIlIIlIll("R0fzkmD9tcFhgIz6mOdGZg==", "gvGTE");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[24]] = lIIIIIIlIlIIllII("YxU+JBctEzptCmpWIipZNx4zZRcmAXYWHC8TNTEWMVg=", "CvVEy");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[25]] = lIIIIIIlIlIIllII("FwEMDRcnDB0QA2IKERYCMhsAGgliBgdVEyoKSQYCLgoKAQgwTwUaCDJB", "Boiug");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[26]] = lIIIIIIlIlIIllIl("lkJmhwt+AouGD1HPgQ5OjESuuvxvf96OSCir4glzhf4=", "oBgpw");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[29]] = lIIIIIIlIlIIllII("ISkUNz4RJAUqKlQiCSwrBDMYICBUMBkmIhFnAzogGi4fKG46Lh4bLwcsXywmFSkfKiIhKQMqKR00BSo8ESNZZg==", "tGqON");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[30]] = lIIIIIIlIlIIllII("PCwePSobJgB2OgolFzs9R2BSKiwbPAA2LAtpAiosAigGLTsKJQt4KwoqEy06CmkmMDsKKBZ2Kho7AD0nGx0aKiwOLVpxZwYnBj07HTwCLGFGaQU5Ok8qEzQlCi1ceBwcLFIWIAAMBD0nGwUdNzlBOhotPQsmBTYOHSgRPS8aJR4hYUZpBjdpHCEHLC0APhx4PQcsUhYgAAwEPScbBR03OUE=", "oIrXI");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[31]] = lIIIIIIlIlIIlIll("F/AEGPwhiNKvp8W7peld9a8XnLJZV8IkbFOJeQeL8dNXOI1yUCSVNMHNFHYe+35Dfn3srEoSLTC07ubu6xvX2F/LDaeFY3lZQI2lZ+/htvg=", "KBwCX");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[32]] = lIIIIIIlIlIIllII("CQMaETEuCQRaIT8KExcmck9WBjcuEwQaNz5GBgY3NwcCASA/Cg9UKSdGAh0/PxVWHTx6B1YGPS1I", "ZfvtR");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[33]] = lIIIIIIlIlIIllII("ZRs7EyMgDXoYKWUIeik1KQw5Dj83SXdaGgEiehglIlY=", "EiZzP");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[34]] = lIIIIIIlIlIIlIll("u7XkjYaDFSmKN5WZCoK6DRA6ygWolo4MgpU9wL2AWiM=", "aTUug");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[35]] = lIIIIIIlIlIIllII("PxdrNzAiDDx3OzkzICAGMwwKKSE/FSwjNCIRKjc=", "VxEYU");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[36]] = lIIIIIIlIlIIlIll("f1+XeepLqknb7C45E5DwYcRv5TzEK6iv", "wriof");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[37]] = lIIIIIIlIlIIllII("", "wAedA");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[38]] = lIIIIIIlIlIIlIll("uzLNZ3/3qRTIM4UqdOGAmc1aEe3xiR/810neS1b0vJKRfxOVcxLSEw==", "bAVfo");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[39]] = lIIIIIIlIlIIllII("BhZoLwgbDT9vHgoVIyIZAAsHNBkAKyMjGAYVIhUFHRw1KQIDHQ==", "oyFAm");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[41]] = lIIIIIIlIlIIllII("ZzMfOm0kEgIhOmQZGR4mMyQTIQw6Ax84KjAWAjwsJE1WLj4=", "JwvUC");
        NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[42]] = lIIIIIIlIlIIllII("awArOEEoITYjFmg3JzsKJTAtJS4zMC0FCiQxKzsLEiwwMhwuKy4zVWY/Pw==", "FDBWo");
    }
    
    private static boolean lIIIIIIlIlIlIllI(final int llllllllllllIlllllIlIllIlIlIIIII) {
        return llllllllllllIlllllIlIllIlIlIIIII > 0;
    }
    
    void cancel(final SelectionKey llllllllllllIlllllIlIllllIIlIIlI) {
        llllllllllllIlllllIlIllllIIlIIlI.cancel();
        this.cancelledKeys += NioEventLoop.lIlllIIIllIIlI[2];
        if (lIIIIIIlIlIllIlI(this.cancelledKeys, NioEventLoop.lIlllIIIllIIlI[27])) {
            this.cancelledKeys = NioEventLoop.lIlllIIIllIIlI[0];
            this.needsToSelectAgain = (NioEventLoop.lIlllIIIllIIlI[2] != 0);
        }
    }
    
    private static void processSelectedKey(final SelectionKey llllllllllllIlllllIlIlllIlIIllll, final NioTask<SelectableChannel> llllllllllllIlllllIlIlllIlIIlllI) {
        int llllllllllllIlllllIlIlllIlIIllIl = NioEventLoop.lIlllIIIllIIlI[0];
        try {
            llllllllllllIlllllIlIlllIlIIlllI.channelReady(llllllllllllIlllllIlIlllIlIIllll.channel(), llllllllllllIlllllIlIlllIlIIllll);
            llllllllllllIlllllIlIlllIlIIllIl = NioEventLoop.lIlllIIIllIIlI[2];
            switch (llllllllllllIlllllIlIlllIlIIllIl) {
                case 0: {
                    llllllllllllIlllllIlIlllIlIIllll.cancel();
                    invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIIllll.isValid() ? 1 : 0)) {
                        invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                        break;
                    }
                    break;
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllIlIlllIlIlIIII) {
            llllllllllllIlllllIlIlllIlIIllll.cancel();
            invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, llllllllllllIlllllIlIlllIlIlIIII);
            llllllllllllIlllllIlIlllIlIIllIl = NioEventLoop.lIlllIIIllIIlI[3];
            switch (llllllllllllIlllllIlIlllIlIIllIl) {
                case 0: {
                    llllllllllllIlllllIlIlllIlIIllll.cancel();
                    invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                    "".length();
                    if ((0x2E ^ 0x2A) <= "  ".length()) {
                        return;
                    }
                    break;
                }
                case 1: {
                    if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIIllll.isValid() ? 1 : 0)) {
                        invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                        break;
                    }
                    break;
                }
            }
            "".length();
            if (((0x55 ^ 0x58 ^ (0x8D ^ 0x97)) & (0x6D ^ 0xE ^ (0xEB ^ 0x9F) ^ -" ".length()) & (((0xCF ^ 0xA2 ^ (0x20 ^ 0x55)) & (0xA6 ^ 0x91 ^ (0xAF ^ 0x80) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        finally {
            switch (llllllllllllIlllllIlIlllIlIIllIl) {
                case 0: {
                    llllllllllllIlllllIlIlllIlIIllll.cancel();
                    invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIIllll.isValid() ? 1 : 0)) {
                        invokeChannelUnregistered(llllllllllllIlllllIlIlllIlIIlllI, llllllllllllIlllllIlIlllIlIIllll, null);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private static boolean lIIIIIIlIlIllIIl(final int llllllllllllIlllllIlIllIlIlllIll, final int llllllllllllIlllllIlIllIlIlllIlI) {
        return llllllllllllIlllllIlIllIlIlllIll == llllllllllllIlllllIlIllIlIlllIlI;
    }
    
    public void register(final SelectableChannel llllllllllllIlllllIlIllllllIIIIl, final int llllllllllllIlllllIlIllllllIIIII, final NioTask<?> llllllllllllIlllllIlIlllllIllIll) {
        if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIllllllIIIIl)) {
            throw new NullPointerException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[8]]);
        }
        if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIllllllIIIII)) {
            throw new IllegalArgumentException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[9]]);
        }
        if (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIllllllIIIII & (llllllllllllIlllllIlIllllllIIIIl.validOps() ^ NioEventLoop.lIlllIIIllIIlI[10]))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[11]]).append(llllllllllllIlllllIlIllllllIIIII).append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[12]]).append(llllllllllllIlllllIlIllllllIIIIl.validOps()).append((char)NioEventLoop.lIlllIIIllIIlI[13])));
        }
        if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIlllllIllIll)) {
            throw new NullPointerException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[14]]);
        }
        if (lIIIIIIlIlIlIlII(this.isShutdown() ? 1 : 0)) {
            throw new IllegalStateException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[15]]);
        }
        try {
            llllllllllllIlllllIlIllllllIIIIl.register(this.selector, llllllllllllIlllllIlIllllllIIIII, llllllllllllIlllllIlIlllllIllIll);
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllIlIllllllIIIll) {
            throw new EventLoopException(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[16]], llllllllllllIlllllIlIllllllIIIll);
        }
    }
    
    @Override
    protected Runnable pollTask() {
        final Runnable llllllllllllIlllllIlIllllIIIllII = super.pollTask();
        if (lIIIIIIlIlIlIlII(this.needsToSelectAgain ? 1 : 0)) {
            this.selectAgain();
        }
        return llllllllllllIlllllIlIllllIIIllII;
    }
    
    private static boolean lIIIIIIlIlIlIlll(final int llllllllllllIlllllIlIllIlIlIllll, final int llllllllllllIlllllIlIllIlIlIlllI) {
        return llllllllllllIlllllIlIllIlIlIllll > llllllllllllIlllllIlIllIlIlIlllI;
    }
    
    private static void processSelectedKey(final SelectionKey llllllllllllIlllllIlIlllIlIllIlI, final AbstractNioChannel llllllllllllIlllllIlIlllIlIllIIl) {
        final AbstractNioChannel.NioUnsafe llllllllllllIlllllIlIlllIlIllIll = llllllllllllIlllllIlIlllIlIllIIl.unsafe();
        if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIllIlI.isValid() ? 1 : 0)) {
            llllllllllllIlllllIlIlllIlIllIll.close(llllllllllllIlllllIlIlllIlIllIll.voidPromise());
            return;
        }
        try {
            final int llllllllllllIlllllIlIlllIlIlllll = llllllllllllIlllllIlIlllIlIllIlI.readyOps();
            if (!lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIlllll & NioEventLoop.lIlllIIIllIIlI[21]) || lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIlllll)) {
                llllllllllllIlllllIlIlllIlIllIll.read();
                if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIlIllIIl.isOpen() ? 1 : 0)) {
                    return;
                }
            }
            if (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIlIlllll & NioEventLoop.lIlllIIIllIIlI[5])) {
                llllllllllllIlllllIlIlllIlIllIIl.unsafe().forceFlush();
            }
            if (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllIlIlllll & NioEventLoop.lIlllIIIllIIlI[9])) {
                int llllllllllllIlllllIlIlllIllIIIII = llllllllllllIlllllIlIlllIlIllIlI.interestOps();
                llllllllllllIlllllIlIlllIllIIIII &= NioEventLoop.lIlllIIIllIIlI[28];
                llllllllllllIlllllIlIlllIlIllIlI.interestOps(llllllllllllIlllllIlIlllIllIIIII);
                "".length();
                llllllllllllIlllllIlIlllIlIllIll.finishConnect();
            }
            "".length();
            if (-(60 + 58 - 4 + 19 ^ 15 + 38 + 54 + 22) > 0) {
                return;
            }
        }
        catch (CancelledKeyException llllllllllllIlllllIlIlllIlIllllI) {
            llllllllllllIlllllIlIlllIlIllIll.close(llllllllllllIlllllIlIlllIlIllIll.voidPromise());
        }
    }
    
    private static boolean lIIIIIIlIlIllllI(final int llllllllllllIlllllIlIllIlIlIIlII) {
        return llllllllllllIlllllIlIllIlIlIIlII >= 0;
    }
    
    public int getIoRatio() {
        return this.ioRatio;
    }
    
    public void rebuildSelector() {
        if (lIIIIIIlIlIlIlIl(this.inEventLoop() ? 1 : 0)) {
            this.execute(new Runnable() {
                @Override
                public void run() {
                    NioEventLoop.this.rebuildSelector();
                }
            });
            return;
        }
        final Selector llllllllllllIlllllIlIllllIlllIll = this.selector;
        if (lIIIIIIlIlIlIIlI(llllllllllllIlllllIlIllllIlllIll)) {
            return;
        }
        Selector llllllllllllIlllllIlIllllIlllIlI;
        try {
            llllllllllllIlllllIlIllllIlllIlI = this.openSelector();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIlllllIlIlllllIIIlll) {
            NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[20]], llllllllllllIlllllIlIlllllIIIlll);
            return;
        }
        int llllllllllllIlllllIlIllllIlllIIl = NioEventLoop.lIlllIIIllIIlI[0];
        while (true) {
            try {
                final Iterator llllllllllllIlllllIlIllllIllllll = llllllllllllIlllllIlIllllIlllIll.keys().iterator();
                while (lIIIIIIlIlIlIlII(llllllllllllIlllllIlIllllIllllll.hasNext() ? 1 : 0)) {
                    final SelectionKey llllllllllllIlllllIlIlllllIIIIII = llllllllllllIlllllIlIllllIllllll.next();
                    final Object llllllllllllIlllllIlIlllllIIIIIl = llllllllllllIlllllIlIlllllIIIIII.attachment();
                    try {
                        if (!lIIIIIIlIlIlIlII(llllllllllllIlllllIlIlllllIIIIII.isValid() ? 1 : 0) || lIIIIIIlIlIllIII(llllllllllllIlllllIlIlllllIIIIII.channel().keyFor(llllllllllllIlllllIlIllllIlllIlI))) {
                            "".length();
                            if ((48 + 96 - 137 + 155 ^ 68 + 23 - 44 + 119) == "  ".length()) {
                                return;
                            }
                            continue;
                        }
                        else {
                            final int llllllllllllIlllllIlIlllllIIIllI = llllllllllllIlllllIlIlllllIIIIII.interestOps();
                            llllllllllllIlllllIlIlllllIIIIII.cancel();
                            final SelectionKey llllllllllllIlllllIlIlllllIIIlIl = llllllllllllIlllllIlIlllllIIIIII.channel().register(llllllllllllIlllllIlIllllIlllIlI, llllllllllllIlllllIlIlllllIIIllI, llllllllllllIlllllIlIlllllIIIIIl);
                            if (lIIIIIIlIlIlIlII((llllllllllllIlllllIlIlllllIIIIIl instanceof AbstractNioChannel) ? 1 : 0)) {
                                ((AbstractNioChannel)llllllllllllIlllllIlIlllllIIIIIl).selectionKey = llllllllllllIlllllIlIlllllIIIlIl;
                            }
                            ++llllllllllllIlllllIlIllllIlllIIl;
                            "".length();
                            if ((0x19 ^ 0x1D) <= 0) {
                                return;
                            }
                        }
                    }
                    catch (Exception llllllllllllIlllllIlIlllllIIIIlI) {
                        NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[21]], llllllllllllIlllllIlIlllllIIIIlI);
                        if (lIIIIIIlIlIlIlII((llllllllllllIlllllIlIlllllIIIIIl instanceof AbstractNioChannel) ? 1 : 0)) {
                            final AbstractNioChannel llllllllllllIlllllIlIlllllIIIlII = (AbstractNioChannel)llllllllllllIlllllIlIlllllIIIIIl;
                            llllllllllllIlllllIlIlllllIIIlII.unsafe().close(llllllllllllIlllllIlIlllllIIIlII.unsafe().voidPromise());
                            "".length();
                            if (" ".length() == 0) {
                                return;
                            }
                        }
                        else {
                            final NioTask<SelectableChannel> llllllllllllIlllllIlIlllllIIIIll = (NioTask<SelectableChannel>)llllllllllllIlllllIlIlllllIIIIIl;
                            invokeChannelUnregistered(llllllllllllIlllllIlIlllllIIIIll, llllllllllllIlllllIlIlllllIIIIII, llllllllllllIlllllIlIlllllIIIIlI);
                        }
                    }
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                "".length();
                if (((0x25 ^ 0x1A ^ (0x28 ^ 0x8)) & (72 + 93 - 156 + 118 ^ (0xE2 ^ 0x82) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (ConcurrentModificationException llllllllllllIlllllIlIllllIlllllI) {
                "".length();
                if (-(0x58 ^ 0x5C) >= 0) {
                    return;
                }
                continue;
            }
            break;
        }
        this.selector = llllllllllllIlllllIlIllllIlllIlI;
        try {
            llllllllllllIlllllIlIllllIlllIll.close();
            "".length();
            if (((44 + 163 - 79 + 55 ^ 82 + 130 - 159 + 133) & (0x25 ^ 0x31 ^ (0x95 ^ 0x8C) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllllIlIllllIllllIl) {
            if (lIIIIIIlIlIlIlII(NioEventLoop.logger.isWarnEnabled() ? 1 : 0)) {
                NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[22]], llllllllllllIlllllIlIllllIllllIl);
            }
        }
        NioEventLoop.logger.info(String.valueOf(new StringBuilder().append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[23]]).append(llllllllllllIlllllIlIllllIlllIIl).append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[24]])));
    }
    
    private static void lIIIIIIlIlIlIIII() {
        (lIlllIIIllIIlI = new int[44])[0] = ((0x7D ^ 0x4A) & ~(0x83 ^ 0xB4));
        NioEventLoop.lIlllIIIllIIlI[1] = (0x20 ^ 0x4C ^ (0xEE ^ 0xB0));
        NioEventLoop.lIlllIIIllIIlI[2] = " ".length();
        NioEventLoop.lIlllIIIllIIlI[3] = "  ".length();
        NioEventLoop.lIlllIIIllIIlI[4] = "   ".length();
        NioEventLoop.lIlllIIIllIIlI[5] = (0x99 ^ 0x9D);
        NioEventLoop.lIlllIIIllIIlI[6] = (147 + 34 - 155 + 142 ^ 7 + 118 - 68 + 116);
        NioEventLoop.lIlllIIIllIIlI[7] = (0xE ^ 0x8);
        NioEventLoop.lIlllIIIllIIlI[8] = (0x5 ^ 0x0 ^ "  ".length());
        NioEventLoop.lIlllIIIllIIlI[9] = (26 + 133 - 6 + 29 ^ 4 + 185 - 144 + 145);
        NioEventLoop.lIlllIIIllIIlI[10] = -" ".length();
        NioEventLoop.lIlllIIIllIIlI[11] = (0x6C ^ 0x65);
        NioEventLoop.lIlllIIIllIIlI[12] = (0xFB ^ 0x95 ^ (0x3A ^ 0x5E));
        NioEventLoop.lIlllIIIllIIlI[13] = (" ".length() ^ (0x6C ^ 0x44));
        NioEventLoop.lIlllIIIllIIlI[14] = (0x2A ^ 0x21);
        NioEventLoop.lIlllIIIllIIlI[15] = (125 + 72 - 97 + 72 ^ 12 + 105 - 39 + 82);
        NioEventLoop.lIlllIIIllIIlI[16] = (14 + 67 - 44 + 93 ^ 21 + 87 - 83 + 118);
        NioEventLoop.lIlllIIIllIIlI[17] = (0xEB ^ 0x8F);
        NioEventLoop.lIlllIIIllIIlI[18] = (0xC3 ^ 0xBB ^ (0x2D ^ 0x5B));
        NioEventLoop.lIlllIIIllIIlI[19] = (0x49 ^ 0x46);
        NioEventLoop.lIlllIIIllIIlI[20] = (131 + 9 + 5 + 3 ^ 90 + 69 - 156 + 129);
        NioEventLoop.lIlllIIIllIIlI[21] = (33 + 69 - 18 + 67 ^ 66 + 43 - 60 + 85);
        NioEventLoop.lIlllIIIllIIlI[22] = (44 + 65 + 44 + 33 ^ 26 + 41 - 12 + 113);
        NioEventLoop.lIlllIIIllIIlI[23] = (0x30 ^ 0x28 ^ (0x6E ^ 0x65));
        NioEventLoop.lIlllIIIllIIlI[24] = (0x40 ^ 0x54);
        NioEventLoop.lIlllIIIllIIlI[25] = (0xD7 ^ 0xC2);
        NioEventLoop.lIlllIIIllIIlI[26] = (0x49 ^ 0x5F);
        NioEventLoop.lIlllIIIllIIlI[27] = (0xFFFFF95E & 0x7A1);
        NioEventLoop.lIlllIIIllIIlI[28] = -(0x37 ^ 0x6B ^ (0x6A ^ 0x3F));
        NioEventLoop.lIlllIIIllIIlI[29] = (0x77 ^ 0x23 ^ (0x29 ^ 0x6A));
        NioEventLoop.lIlllIIIllIIlI[30] = (0x16 ^ 0xE);
        NioEventLoop.lIlllIIIllIIlI[31] = (0x92 ^ 0x8B);
        NioEventLoop.lIlllIIIllIIlI[32] = (17 + 91 + 8 + 41 ^ 121 + 66 - 55 + 3);
        NioEventLoop.lIlllIIIllIIlI[33] = (0x5D ^ 0x56 ^ (0x1F ^ 0xF));
        NioEventLoop.lIlllIIIllIIlI[34] = (0x67 ^ 0x5E ^ (0x23 ^ 0x6));
        NioEventLoop.lIlllIIIllIIlI[35] = (0x69 ^ 0x74);
        NioEventLoop.lIlllIIIllIIlI[36] = (0x19 ^ 0x7);
        NioEventLoop.lIlllIIIllIIlI[37] = (0x41 ^ 0x48 ^ (0x33 ^ 0x25));
        NioEventLoop.lIlllIIIllIIlI[38] = (0x2C ^ 0x35 ^ (0x52 ^ 0x6B));
        NioEventLoop.lIlllIIIllIIlI[39] = (169 + 24 - 183 + 178 ^ 131 + 26 - 123 + 123);
        NioEventLoop.lIlllIIIllIIlI[40] = (0xFFFFA7EC & 0x5A13);
        NioEventLoop.lIlllIIIllIIlI[41] = (104 + 16 - 56 + 69 ^ 73 + 75 - 97 + 116);
        NioEventLoop.lIlllIIIllIIlI[42] = (0xE6 ^ 0xC5);
        NioEventLoop.lIlllIIIllIIlI[43] = (0x7A ^ 0x5E);
    }
    
    private void select(final boolean llllllllllllIlllllIlIlllIIIIIlIl) throws IOException {
        Selector llllllllllllIlllllIlIlllIIIIIlll = this.selector;
        try {
            int llllllllllllIlllllIlIlllIIIIllIl = NioEventLoop.lIlllIIIllIIlI[0];
            long llllllllllllIlllllIlIlllIIIIllII = System.nanoTime();
            final long llllllllllllIlllllIlIlllIIIIlIll = llllllllllllIlllllIlIlllIIIIllII + this.delayNanos(llllllllllllIlllllIlIlllIIIIllII);
            do {
                final long llllllllllllIlllllIlIlllIIIlIIII = (llllllllllllIlllllIlIlllIIIIlIll - llllllllllllIlllllIlIlllIIIIllII + 500000L) / 1000000L;
                Label_0404: {
                    if (lIIIIIIlIlIlllII(lIIIIIIlIlIllIll(llllllllllllIlllllIlIlllIIIlIIII, 0L))) {
                        if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIIIIllIl)) {
                            llllllllllllIlllllIlIlllIIIIIlll.selectNow();
                            "".length();
                            llllllllllllIlllllIlIlllIIIIllIl = NioEventLoop.lIlllIIIllIIlI[2];
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                        }
                    }
                    else {
                        final int llllllllllllIlllllIlIlllIIIIllll = llllllllllllIlllllIlIlllIIIIIlll.select(llllllllllllIlllllIlIlllIIIlIIII);
                        ++llllllllllllIlllllIlIlllIIIIllIl;
                        if (lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIIIIllll) && lIIIIIIlIlIlIlIl(llllllllllllIlllllIlIlllIIIIIlIl ? 1 : 0) && lIIIIIIlIlIlIlIl(this.wakenUp.get() ? 1 : 0) && lIIIIIIlIlIlIlIl(this.hasTasks() ? 1 : 0)) {
                            if (lIIIIIIlIlIlIlII(this.hasScheduledTasks() ? 1 : 0)) {
                                "".length();
                                if (-"  ".length() > 0) {
                                    return;
                                }
                            }
                            else {
                                if (!lIIIIIIlIlIlIlII(Thread.interrupted() ? 1 : 0)) {
                                    final long llllllllllllIlllllIlIlllIIIIlllI = System.nanoTime();
                                    if (lIIIIIIlIlIllllI(lIIIIIIlIlIllIll(llllllllllllIlllllIlIlllIIIIlllI - TimeUnit.MILLISECONDS.toNanos(llllllllllllIlllllIlIlllIIIlIIII), llllllllllllIlllllIlIlllIIIIllII))) {
                                        llllllllllllIlllllIlIlllIIIIllIl = NioEventLoop.lIlllIIIllIIlI[2];
                                        "".length();
                                        if (" ".length() >= "   ".length()) {
                                            return;
                                        }
                                    }
                                    else if (lIIIIIIlIlIlIllI(NioEventLoop.SELECTOR_AUTO_REBUILD_THRESHOLD) && lIIIIIIlIlIllIlI(llllllllllllIlllllIlIlllIIIIllIl, NioEventLoop.SELECTOR_AUTO_REBUILD_THRESHOLD)) {
                                        NioEventLoop.logger.warn(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[31]], (Object)llllllllllllIlllllIlIlllIIIIllIl);
                                        this.rebuildSelector();
                                        llllllllllllIlllllIlIlllIIIIIlll = this.selector;
                                        llllllllllllIlllllIlIlllIIIIIlll.selectNow();
                                        "".length();
                                        llllllllllllIlllllIlIlllIIIIllIl = NioEventLoop.lIlllIIIllIIlI[2];
                                        "".length();
                                        if ("   ".length() >= (0x42 ^ 0x60 ^ (0x77 ^ 0x51))) {
                                            return;
                                        }
                                        break Label_0404;
                                    }
                                    llllllllllllIlllllIlIlllIIIIllII = llllllllllllIlllllIlIlllIIIIlllI;
                                    "".length();
                                    continue;
                                }
                                if (lIIIIIIlIlIlIlII(NioEventLoop.logger.isDebugEnabled() ? 1 : 0)) {
                                    NioEventLoop.logger.debug(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[30]]);
                                }
                                llllllllllllIlllllIlIlllIIIIllIl = NioEventLoop.lIlllIIIllIIlI[2];
                                "".length();
                                if (-" ".length() > 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (lIIIIIIlIlIlIlll(llllllllllllIlllllIlIlllIIIIllIl, NioEventLoop.lIlllIIIllIIlI[4]) && lIIIIIIlIlIlIlII(NioEventLoop.logger.isDebugEnabled() ? 1 : 0)) {
                    NioEventLoop.logger.debug(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[32]], (Object)(llllllllllllIlllllIlIlllIIIIllIl - NioEventLoop.lIlllIIIllIIlI[2]));
                }
                "".length();
                if ((153 + 57 - 101 + 69 ^ 27 + 155 - 86 + 86) < -" ".length()) {
                    return;
                }
            } while (-" ".length() != (0xA3 ^ 0xA7));
        }
        catch (CancelledKeyException llllllllllllIlllllIlIlllIIIIlIlI) {
            if (lIIIIIIlIlIlIlII(NioEventLoop.logger.isDebugEnabled() ? 1 : 0)) {
                NioEventLoop.logger.debug(String.valueOf(new StringBuilder().append(CancelledKeyException.class.getSimpleName()).append(NioEventLoop.lIlllIIIlIllll[NioEventLoop.lIlllIIIllIIlI[33]])), llllllllllllIlllllIlIlllIIIIlIlI);
            }
        }
    }
    
    private static boolean lIIIIIIlIlIllIlI(final int llllllllllllIlllllIlIllIlIllIlll, final int llllllllllllIlllllIlIllIlIllIllI) {
        return llllllllllllIlllllIlIllIlIllIlll >= llllllllllllIlllllIlIllIlIllIllI;
    }
}
