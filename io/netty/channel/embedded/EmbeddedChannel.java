// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.embedded;

import java.util.ArrayList;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import java.nio.channels.ClosedChannelException;
import io.netty.util.ReferenceCountUtil;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.ArrayDeque;
import io.netty.channel.DefaultChannelConfig;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.EventLoop;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.channel.ChannelFuture;
import io.netty.util.internal.RecyclableArrayList;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import java.util.Queue;
import io.netty.channel.ChannelMetadata;
import io.netty.util.internal.logging.InternalLogger;
import java.net.SocketAddress;
import io.netty.channel.AbstractChannel;

public class EmbeddedChannel extends AbstractChannel
{
    private static final /* synthetic */ String[] lIIlIllIlllIII;
    private static final /* synthetic */ int[] lIIlIllIlllIIl;
    private final /* synthetic */ SocketAddress localAddress;
    private final /* synthetic */ EmbeddedEventLoop loop;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private final /* synthetic */ Queue<Object> outboundMessages;
    private /* synthetic */ int state;
    private final /* synthetic */ SocketAddress remoteAddress;
    private final /* synthetic */ Queue<Object> inboundMessages;
    private /* synthetic */ Throwable lastException;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ ChannelConfig config;
    
    public boolean writeInbound(final Object... lllllllllllllIIllIIIlIIllIlIlIIl) {
        this.ensureOpen();
        if (llIlIIllIlIlIII(lllllllllllllIIllIIIlIIllIlIlIIl.length)) {
            int n;
            if (llIlIIllIlIlIII(this.inboundMessages.isEmpty() ? 1 : 0)) {
                n = EmbeddedChannel.lIIlIllIlllIIl[1];
                "".length();
                if (" ".length() < 0) {
                    return ((113 + 47 - 135 + 104 ^ 98 + 63 - 60 + 52) & (30 + 14 + 47 + 65 ^ 38 + 117 - 70 + 47 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = EmbeddedChannel.lIIlIllIlllIIl[0];
            }
            return n != 0;
        }
        final ChannelPipeline lllllllllllllIIllIIIlIIllIlIlIII = this.pipeline();
        final Object[] lllllllllllllIIllIIIlIIllIlIllIl = lllllllllllllIIllIIIlIIllIlIlIIl;
        final int lllllllllllllIIllIIIlIIllIlIllII = lllllllllllllIIllIIIlIIllIlIllIl.length;
        int lllllllllllllIIllIIIlIIllIlIlIll = EmbeddedChannel.lIIlIllIlllIIl[0];
        while (llIlIIllIlIIlll(lllllllllllllIIllIIIlIIllIlIlIll, lllllllllllllIIllIIIlIIllIlIllII)) {
            final Object lllllllllllllIIllIIIlIIllIlIlllI = lllllllllllllIIllIIIlIIllIlIllIl[lllllllllllllIIllIIIlIIllIlIlIll];
            lllllllllllllIIllIIIlIIllIlIlIII.fireChannelRead(lllllllllllllIIllIIIlIIllIlIlllI);
            "".length();
            ++lllllllllllllIIllIIIlIIllIlIlIll;
            "".length();
            if (("  ".length() ^ (0x78 ^ 0x7E)) < "   ".length()) {
                return ((244 + 47 - 143 + 97 ^ 50 + 101 - 62 + 109) & (0x5C ^ 0x22 ^ (0x49 ^ 0x4) ^ -" ".length())) != 0x0;
            }
        }
        lllllllllllllIIllIIIlIIllIlIlIII.fireChannelReadComplete();
        "".length();
        this.runPendingTasks();
        this.checkException();
        int n2;
        if (llIlIIllIlIlIII(this.inboundMessages.isEmpty() ? 1 : 0)) {
            n2 = EmbeddedChannel.lIIlIllIlllIIl[1];
            "".length();
            if (((0x1F ^ 0x25 ^ (0x30 ^ 0x7)) & (96 + 147 - 93 + 1 ^ 53 + 124 - 100 + 77 ^ -" ".length())) >= "  ".length()) {
                return ((34 + 57 - 34 + 70 ^ (0xC4 ^ 0xA4)) & (0x36 ^ 0x6C ^ (0x7F ^ 0x3A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = EmbeddedChannel.lIIlIllIlllIIl[0];
        }
        return n2 != 0;
    }
    
    public Object readInbound() {
        return this.inboundMessages.poll();
    }
    
    private static boolean llIlIIllIlIIllI(final Object lllllllllllllIIllIIIlIIlIIlIlIll) {
        return lllllllllllllIIllIIIlIIlIIlIlIll == null;
    }
    
    private static boolean llIlIIllIlIlIII(final int lllllllllllllIIllIIIlIIlIIlIIlll) {
        return lllllllllllllIIllIIIlIIlIIlIIlll == 0;
    }
    
    @Override
    protected void doBeginRead() throws Exception {
    }
    
    private static boolean llIlIIllIlIlIIl(final int lllllllllllllIIllIIIlIIlIIllIlII, final int lllllllllllllIIllIIIlIIlIIllIIll) {
        return lllllllllllllIIllIIIlIIlIIllIlII == lllllllllllllIIllIIIlIIlIIllIIll;
    }
    
    private static boolean llIlIIllIlIlIlI(final Object lllllllllllllIIllIIIlIIlIIlIllIl) {
        return lllllllllllllIIllIIIlIIlIIlIllIl != null;
    }
    
    private static boolean llIlIIllIlIlIll(final int lllllllllllllIIllIIIlIIlIIlIlIIl) {
        return lllllllllllllIIllIIIlIIlIIlIlIIl != 0;
    }
    
    public boolean writeOutbound(final Object... lllllllllllllIIllIIIlIIllIIlIIII) {
        this.ensureOpen();
        if (llIlIIllIlIlIII(lllllllllllllIIllIIIlIIllIIlIIII.length)) {
            int n;
            if (llIlIIllIlIlIII(this.outboundMessages.isEmpty() ? 1 : 0)) {
                n = EmbeddedChannel.lIIlIllIlllIIl[1];
                "".length();
                if ("  ".length() < 0) {
                    return ((0x30 ^ 0x37) & ~(0xBD ^ 0xBA)) != 0x0;
                }
            }
            else {
                n = EmbeddedChannel.lIIlIllIlllIIl[0];
            }
            return n != 0;
        }
        final RecyclableArrayList lllllllllllllIIllIIIlIIllIIIllll = RecyclableArrayList.newInstance(lllllllllllllIIllIIIlIIllIIlIIII.length);
        try {
            final Object[] lllllllllllllIIllIIIlIIllIIlIlll = lllllllllllllIIllIIIlIIllIIlIIII;
            final int lllllllllllllIIllIIIlIIllIIlIllI = lllllllllllllIIllIIIlIIllIIlIlll.length;
            int lllllllllllllIIllIIIlIIllIIlIlIl = EmbeddedChannel.lIIlIllIlllIIl[0];
            while (llIlIIllIlIIlll(lllllllllllllIIllIIIlIIllIIlIlIl, lllllllllllllIIllIIIlIIllIIlIllI)) {
                final Object lllllllllllllIIllIIIlIIllIIllIII = lllllllllllllIIllIIIlIIllIIlIlll[lllllllllllllIIllIIIlIIllIIlIlIl];
                if (llIlIIllIlIIllI(lllllllllllllIIllIIIlIIllIIllIII)) {
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((0x20 ^ 0x6D ^ (0xD6 ^ 0x8B)) & (46 + 173 - 197 + 169 ^ 74 + 156 - 187 + 132 ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    lllllllllllllIIllIIIlIIllIIIllll.add(this.write(lllllllllllllIIllIIIlIIllIIllIII));
                    "".length();
                    ++lllllllllllllIIllIIIlIIllIIlIlIl;
                    "".length();
                    if ((0x19 ^ 0x1D ^ ((0x76 ^ 0x30) & ~(0x85 ^ 0xC3))) == "  ".length()) {
                        return ((0x76 ^ 0x6B ^ (0x60 ^ 0x65)) & (86 + 61 - 91 + 165 ^ 130 + 11 + 48 + 8 ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
            }
            this.flush();
            "".length();
            final int lllllllllllllIIllIIIlIIllIIlIIlI = lllllllllllllIIllIIIlIIllIIIllll.size();
            int lllllllllllllIIllIIIlIIllIIlIIll = EmbeddedChannel.lIIlIllIlllIIl[0];
            while (llIlIIllIlIIlll(lllllllllllllIIllIIIlIIllIIlIIll, lllllllllllllIIllIIIlIIllIIlIIlI)) {
                final ChannelFuture lllllllllllllIIllIIIlIIllIIlIlII = ((ArrayList<ChannelFuture>)lllllllllllllIIllIIIlIIllIIIllll).get(lllllllllllllIIllIIIlIIllIIlIIll);
                if (llIlIIllIlIlIII(EmbeddedChannel.$assertionsDisabled ? 1 : 0) && llIlIIllIlIlIII(lllllllllllllIIllIIIlIIllIIlIlII.isDone() ? 1 : 0)) {
                    throw new AssertionError();
                }
                if (llIlIIllIlIlIlI(lllllllllllllIIllIIIlIIllIIlIlII.cause())) {
                    this.recordException(lllllllllllllIIllIIIlIIllIIlIlII.cause());
                }
                ++lllllllllllllIIllIIIlIIllIIlIIll;
                "".length();
                if (-" ".length() == ((22 + 40 + 70 + 56 ^ 16 + 43 - 31 + 109) & (0x63 ^ 0x50 ^ (0xA2 ^ 0xA4) ^ -" ".length()))) {
                    return ((0x4D ^ 0x37 ^ (0x3E ^ 0x4C)) & (0x76 ^ 0x10 ^ (0xA9 ^ 0xC7) ^ -" ".length())) != 0x0;
                }
            }
            this.runPendingTasks();
            this.checkException();
            int n2;
            if (llIlIIllIlIlIII(this.outboundMessages.isEmpty() ? 1 : 0)) {
                n2 = EmbeddedChannel.lIIlIllIlllIIl[1];
                "".length();
                if (" ".length() == ((0xD8 ^ 0xA3 ^ (0x79 ^ 0x11)) & (144 + 154 - 167 + 24 ^ 48 + 26 - 16 + 78 ^ -" ".length()))) {
                    return ((0x0 ^ 0x68 ^ (0x4D ^ 0x69)) & (0x88 ^ 0xB8 ^ (0xF0 ^ 0x8C) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = EmbeddedChannel.lIIlIllIlllIIl[0];
            }
            return n2 != 0;
        }
        finally {
            lllllllllllllIIllIIIlIIllIIIllll.recycle();
            "".length();
        }
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (llIlIIllIlIIlll(this.state, EmbeddedChannel.lIIlIllIlllIIl[2])) {
            n = EmbeddedChannel.lIIlIllIlllIIl[1];
            "".length();
            if ((0x4A ^ 0x4E) == "  ".length()) {
                return ((0x5E ^ 0xE) & ~(0x50 ^ 0x0)) != 0x0;
            }
        }
        else {
            n = EmbeddedChannel.lIIlIllIlllIIl[0];
        }
        return n != 0;
    }
    
    public Queue<Object> outboundMessages() {
        return this.outboundMessages;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return EmbeddedChannel.METADATA;
    }
    
    @Override
    protected AbstractUnsafe newUnsafe() {
        return new DefaultUnsafe();
    }
    
    public Object readOutbound() {
        return this.outboundMessages.poll();
    }
    
    @Override
    public ChannelConfig config() {
        return this.config;
    }
    
    static {
        llIlIIllIlIIlIl();
        llIlIIllIlIIlII();
        int $assertionsDisabled2;
        if (llIlIIllIlIlIII(EmbeddedChannel.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = EmbeddedChannel.lIIlIllIlllIIl[1];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = EmbeddedChannel.lIIlIllIlllIIl[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(EmbeddedChannel.class);
        METADATA = new ChannelMetadata((boolean)(EmbeddedChannel.lIIlIllIlllIIl[0] != 0));
    }
    
    public boolean finish() {
        this.close();
        "".length();
        this.runPendingTasks();
        this.checkException();
        int n;
        if (!llIlIIllIlIlIll(this.inboundMessages.isEmpty() ? 1 : 0) || llIlIIllIlIlIII(this.outboundMessages.isEmpty() ? 1 : 0)) {
            n = EmbeddedChannel.lIIlIllIlllIIl[1];
            "".length();
            if (((56 + 87 - 10 + 21 ^ 170 + 37 - 84 + 50) & (0x11 ^ 0x5C ^ (0x66 ^ 0x1C) ^ -" ".length())) > "  ".length()) {
                return ((77 + 141 - 78 + 55 ^ 126 + 48 - 104 + 68) & (57 + 172 - 192 + 167 ^ 56 + 101 - 49 + 25 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EmbeddedChannel.lIIlIllIlllIIl[0];
        }
        return n != 0;
    }
    
    private static String llIlIIllIlIIIlI(final String lllllllllllllIIllIIIlIIlIIlllIlI, final String lllllllllllllIIllIIIlIIlIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIIlIIlllIll.getBytes(StandardCharsets.UTF_8)), EmbeddedChannel.lIIlIllIlllIIl[4]), "DES");
            final Cipher lllllllllllllIIllIIIlIIlIIlllllI = Cipher.getInstance("DES");
            lllllllllllllIIllIIIlIIlIIlllllI.init(EmbeddedChannel.lIIlIllIlllIIl[2], lllllllllllllIIllIIIlIIlIIllllll);
            return new String(lllllllllllllIIllIIIlIIlIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIIlIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIIlIIllllIl) {
            lllllllllllllIIllIIIlIIlIIllllIl.printStackTrace();
            return null;
        }
    }
    
    public void runPendingTasks() {
        try {
            this.loop.runTasks();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIIIlIIllIIIIIIl) {
            this.recordException(lllllllllllllIIllIIIlIIllIIIIIIl);
        }
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        SocketAddress remoteAddress;
        if (llIlIIllIlIlIll(this.isActive() ? 1 : 0)) {
            remoteAddress = this.remoteAddress;
            "".length();
            if (-(0x2 ^ 0x52 ^ (0x5D ^ 0x8)) >= 0) {
                return null;
            }
        }
        else {
            remoteAddress = null;
        }
        return remoteAddress;
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    private static boolean llIlIIllIlIIlll(final int lllllllllllllIIllIIIlIIlIIllIIII, final int lllllllllllllIIllIIIlIIlIIlIllll) {
        return lllllllllllllIIllIIIlIIlIIllIIII < lllllllllllllIIllIIIlIIlIIlIllll;
    }
    
    @Override
    protected boolean isCompatible(final EventLoop lllllllllllllIIllIIIlIIlIllIllII) {
        return lllllllllllllIIllIIIlIIlIllIllII instanceof EmbeddedEventLoop;
    }
    
    public void checkException() {
        final Throwable lllllllllllllIIllIIIlIIlIlllIlII = this.lastException;
        if (llIlIIllIlIIllI(lllllllllllllIIllIIIlIIlIlllIlII)) {
            return;
        }
        this.lastException = null;
        PlatformDependent.throwException(lllllllllllllIIllIIIlIIlIlllIlII);
    }
    
    private static void llIlIIllIlIIlIl() {
        (lIIlIllIlllIIl = new int[5])[0] = ((0x36 ^ 0x48 ^ (0x3B ^ 0x73)) & (163 + 16 - 165 + 155 ^ 58 + 23 - 56 + 134 ^ -" ".length()));
        EmbeddedChannel.lIIlIllIlllIIl[1] = " ".length();
        EmbeddedChannel.lIIlIllIlllIIl[2] = "  ".length();
        EmbeddedChannel.lIIlIllIlllIIl[3] = "   ".length();
        EmbeddedChannel.lIIlIllIlllIIl[4] = (0xBE ^ 0xB6);
    }
    
    @Deprecated
    public Queue<Object> lastOutboundBuffer() {
        return this.outboundMessages();
    }
    
    public EmbeddedChannel(final ChannelHandler... lllllllllllllIIllIIIlIIlllIllIII) {
        super(null);
        this.loop = new EmbeddedEventLoop();
        this.config = new DefaultChannelConfig(this);
        this.localAddress = new EmbeddedSocketAddress();
        this.remoteAddress = new EmbeddedSocketAddress();
        this.inboundMessages = new ArrayDeque<Object>();
        this.outboundMessages = new ArrayDeque<Object>();
        if (llIlIIllIlIIllI(lllllllllllllIIllIIIlIIlllIllIII)) {
            throw new NullPointerException(EmbeddedChannel.lIIlIllIlllIII[EmbeddedChannel.lIIlIllIlllIIl[0]]);
        }
        int lllllllllllllIIllIIIlIIlllIllIll = EmbeddedChannel.lIIlIllIlllIIl[0];
        final ChannelPipeline lllllllllllllIIllIIIlIIlllIllIlI = this.pipeline();
        final ChannelHandler[] lllllllllllllIIllIIIlIIllllIIIII = lllllllllllllIIllIIIlIIlllIllIII;
        final int lllllllllllllIIllIIIlIIlllIlllll = lllllllllllllIIllIIIlIIllllIIIII.length;
        int lllllllllllllIIllIIIlIIlllIllllI = EmbeddedChannel.lIIlIllIlllIIl[0];
        while (llIlIIllIlIIlll(lllllllllllllIIllIIIlIIlllIllllI, lllllllllllllIIllIIIlIIlllIlllll)) {
            final ChannelHandler lllllllllllllIIllIIIlIIllllIIIIl = lllllllllllllIIllIIIlIIllllIIIII[lllllllllllllIIllIIIlIIlllIllllI];
            if (llIlIIllIlIIllI(lllllllllllllIIllIIIlIIllllIIIIl)) {
                "".length();
                if (-"   ".length() >= 0) {
                    throw null;
                }
                break;
            }
            else {
                ++lllllllllllllIIllIIIlIIlllIllIll;
                final ChannelPipeline channelPipeline = lllllllllllllIIllIIIlIIlllIllIlI;
                final ChannelHandler[] array = new ChannelHandler[EmbeddedChannel.lIIlIllIlllIIl[1]];
                array[EmbeddedChannel.lIIlIllIlllIIl[0]] = lllllllllllllIIllIIIlIIllllIIIIl;
                channelPipeline.addLast(array);
                "".length();
                ++lllllllllllllIIllIIIlIIlllIllllI;
                "".length();
                if ("  ".length() < " ".length()) {
                    throw null;
                }
                continue;
            }
        }
        if (llIlIIllIlIlIII(lllllllllllllIIllIIIlIIlllIllIll)) {
            throw new IllegalArgumentException(EmbeddedChannel.lIIlIllIlllIII[EmbeddedChannel.lIIlIllIlllIIl[1]]);
        }
        this.loop.register(this);
        "".length();
        final ChannelPipeline channelPipeline2 = lllllllllllllIIllIIIlIIlllIllIlI;
        final ChannelHandler[] array2 = new ChannelHandler[EmbeddedChannel.lIIlIllIlllIIl[1]];
        array2[EmbeddedChannel.lIIlIllIlllIIl[0]] = new LastInboundHandler();
        channelPipeline2.addLast(array2);
        "".length();
    }
    
    private void recordException(final Throwable lllllllllllllIIllIIIlIIlIllllIII) {
        if (llIlIIllIlIIllI(this.lastException)) {
            this.lastException = lllllllllllllIIllIIIlIIlIllllIII;
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            EmbeddedChannel.logger.warn(EmbeddedChannel.lIIlIllIlllIII[EmbeddedChannel.lIIlIllIlllIIl[2]], lllllllllllllIIllIIIlIIlIllllIII);
        }
    }
    
    @Override
    protected void doClose() throws Exception {
        this.state = EmbeddedChannel.lIIlIllIlllIIl[2];
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (llIlIIllIlIlIIl(this.state, EmbeddedChannel.lIIlIllIlllIIl[1])) {
            n = EmbeddedChannel.lIIlIllIlllIIl[1];
            "".length();
            if ("  ".length() > (0x57 ^ 0x53)) {
                return ((0x45 ^ 0x59) & ~(0x70 ^ 0x6C)) != 0x0;
            }
        }
        else {
            n = EmbeddedChannel.lIIlIllIlllIIl[0];
        }
        return n != 0;
    }
    
    @Override
    protected void doRegister() throws Exception {
        this.state = EmbeddedChannel.lIIlIllIlllIIl[1];
    }
    
    private static void llIlIIllIlIIlII() {
        (lIIlIllIlllIII = new String[EmbeddedChannel.lIIlIllIlllIIl[3]])[EmbeddedChannel.lIIlIllIlllIIl[0]] = llIlIIllIlIIIlI("5GxZJM+hnh2usCvu7M7QiQ==", "iisAC");
        EmbeddedChannel.lIIlIllIlllIII[EmbeddedChannel.lIIlIllIlllIIl[1]] = llIlIIllIlIIIlI("7vKyrHtXeXY1/mmwFOryIHd1lga5IjVl", "BUMPD");
        EmbeddedChannel.lIIlIllIlllIII[EmbeddedChannel.lIIlIllIlllIIl[2]] = llIlIIllIlIIIlI("5vnys3+DZpSoWaeGNArpiftWqLNjLtnXrh4z3zD3JjyciPphPfaBCZwocZoFcZUx/9AwBEvSuNp9BACkX7n+gf+6RVAdMXw8576HXBa8VKPptzjXWDx8AQ==", "GQXkS");
    }
    
    @Override
    protected SocketAddress localAddress0() {
        SocketAddress localAddress;
        if (llIlIIllIlIlIll(this.isActive() ? 1 : 0)) {
            localAddress = this.localAddress;
            "".length();
            if (((0xE5 ^ 0xA1) & ~(0xF7 ^ 0xB3)) != 0x0) {
                return null;
            }
        }
        else {
            localAddress = null;
        }
        return localAddress;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIllIIIlIIlIllIIIII) throws Exception {
    }
    
    @Deprecated
    public Queue<Object> lastInboundBuffer() {
        return this.inboundMessages();
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIllIIIlIIlIlIlIIII) throws Exception {
        do {
            final Object lllllllllllllIIllIIIlIIlIlIlIIlI = lllllllllllllIIllIIIlIIlIlIlIIII.current();
            if (llIlIIllIlIIllI(lllllllllllllIIllIIIlIIlIlIlIIlI)) {
                "".length();
                if (-(0xFA ^ 0x98 ^ (0xA1 ^ 0xC7)) >= 0) {
                    return;
                }
            }
            else {
                ReferenceCountUtil.retain(lllllllllllllIIllIIIlIIlIlIlIIlI);
                "".length();
                this.outboundMessages.add(lllllllllllllIIllIIIlIIlIlIlIIlI);
                "".length();
                lllllllllllllIIllIIIlIIlIlIlIIII.remove();
                "".length();
                "".length();
            }
        } while ((49 + 31 - 39 + 103 ^ 129 + 143 - 220 + 97) != 0x0);
    }
    
    protected final void ensureOpen() {
        if (llIlIIllIlIlIII(this.isOpen() ? 1 : 0)) {
            this.recordException(new ClosedChannelException());
            this.checkException();
        }
    }
    
    public Queue<Object> inboundMessages() {
        return this.inboundMessages;
    }
    
    private class DefaultUnsafe extends AbstractUnsafe
    {
        @Override
        public void connect(final SocketAddress llllllllllllIlllIIIIlIIlIllIlIlI, final SocketAddress llllllllllllIlllIIIIlIIlIllIlIIl, final ChannelPromise llllllllllllIlllIIIIlIIlIllIIllI) {
            this.safeSetSuccess(llllllllllllIlllIIIIlIIlIllIIllI);
        }
    }
    
    private final class LastInboundHandler extends ChannelInboundHandlerAdapter
    {
        @Override
        public void exceptionCaught(final ChannelHandlerContext llllllllllllIlIlllllIIlllIIIlllI, final Throwable llllllllllllIlIlllllIIlllIIIllIl) throws Exception {
            EmbeddedChannel.this.recordException(llllllllllllIlIlllllIIlllIIIllIl);
        }
        
        @Override
        public void channelRead(final ChannelHandlerContext llllllllllllIlIlllllIIlllIIlIlIl, final Object llllllllllllIlIlllllIIlllIIlIlII) throws Exception {
            EmbeddedChannel.this.inboundMessages.add(llllllllllllIlIlllllIIlllIIlIlII);
            "".length();
        }
    }
}
