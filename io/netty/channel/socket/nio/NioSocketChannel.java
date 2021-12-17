// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.nio;

import java.net.Socket;
import io.netty.channel.socket.DefaultSocketChannelConfig;
import java.nio.channels.ScatteringByteChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import io.netty.channel.ChannelOutboundBuffer;
import java.nio.channels.GatheringByteChannel;
import io.netty.buffer.ByteBuf;
import io.netty.channel.EventLoop;
import io.netty.util.internal.OneTimeTask;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import java.net.InetSocketAddress;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.ChannelConfig;
import java.net.SocketAddress;
import java.nio.channels.WritableByteChannel;
import io.netty.channel.FileRegion;
import io.netty.channel.Channel;
import java.io.IOException;
import io.netty.channel.ChannelException;
import java.nio.channels.SelectableChannel;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.socket.SocketChannelConfig;
import java.nio.channels.spi.SelectorProvider;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.nio.AbstractNioByteChannel;

public class NioSocketChannel extends AbstractNioByteChannel implements SocketChannel
{
    private static final /* synthetic */ int[] lIlIllIlIIlIlI;
    private static final /* synthetic */ SelectorProvider DEFAULT_SELECTOR_PROVIDER;
    private final /* synthetic */ SocketChannelConfig config;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String[] lIlIllIlIIlIIl;
    
    @Override
    protected void doFinishConnect() throws Exception {
        if (llllIIIllIIllll(this.javaChannel().finishConnect() ? 1 : 0)) {
            throw new Error();
        }
    }
    
    private static java.nio.channels.SocketChannel newSocket(final SelectorProvider lllllllllllllIIIIllIllIIlIlIllll) {
        try {
            return lllllllllllllIIIIllIllIIlIlIllll.openSocketChannel();
        }
        catch (IOException lllllllllllllIIIIllIllIIlIllIIIl) {
            throw new ChannelException(NioSocketChannel.lIlIllIlIIlIIl[NioSocketChannel.lIlIllIlIIlIlI[0]], lllllllllllllIIIIllIllIIlIllIIIl);
        }
    }
    
    public NioSocketChannel(final java.nio.channels.SocketChannel lllllllllllllIIIIllIllIIlIlIIIIl) {
        this(null, lllllllllllllIIIIllIllIIlIlIIIIl);
    }
    
    @Override
    protected long doWriteFileRegion(final FileRegion lllllllllllllIIIIllIllIIIIlIllll) throws Exception {
        final long lllllllllllllIIIIllIllIIIIlIlllI = lllllllllllllIIIIllIllIIIIlIllll.transfered();
        return lllllllllllllIIIIllIllIIIIlIllll.transferTo(this.javaChannel(), lllllllllllllIIIIllIllIIIIlIlllI);
    }
    
    @Override
    protected boolean doConnect(final SocketAddress lllllllllllllIIIIllIllIIIlIlIlIl, final SocketAddress lllllllllllllIIIIllIllIIIlIlIIII) throws Exception {
        if (llllIIIllIlIIII(lllllllllllllIIIIllIllIIIlIlIIII)) {
            this.javaChannel().socket().bind(lllllllllllllIIIIllIllIIIlIlIIII);
        }
        boolean lllllllllllllIIIIllIllIIIlIlIIll = NioSocketChannel.lIlIllIlIIlIlI[0] != 0;
        try {
            final boolean lllllllllllllIIIIllIllIIIlIlIlll = this.javaChannel().connect(lllllllllllllIIIIllIllIIIlIlIlIl);
            if (llllIIIllIIllll(lllllllllllllIIIIllIllIIIlIlIlll ? 1 : 0)) {
                this.selectionKey().interestOps(NioSocketChannel.lIlIllIlIIlIlI[2]);
                "".length();
            }
            lllllllllllllIIIIllIllIIIlIlIIll = (NioSocketChannel.lIlIllIlIIlIlI[1] != 0);
            final char lllllllllllllIIIIllIllIIIlIIllIl = (char)(lllllllllllllIIIIllIllIIIlIlIlll ? 1 : 0);
            return lllllllllllllIIIIllIllIIIlIIllIl != '\0';
        }
        finally {
            if (llllIIIllIIllll(lllllllllllllIIIIllIllIIIlIlIIll ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    @Override
    protected java.nio.channels.SocketChannel javaChannel() {
        return (java.nio.channels.SocketChannel)super.javaChannel();
    }
    
    @Override
    public ServerSocketChannel parent() {
        return (ServerSocketChannel)super.parent();
    }
    
    @Override
    public boolean isActive() {
        final java.nio.channels.SocketChannel lllllllllllllIIIIllIllIIlIIIlIII = this.javaChannel();
        int n;
        if (llllIIIllIIlllI(lllllllllllllIIIIllIllIIlIIIlIII.isOpen() ? 1 : 0) && llllIIIllIIlllI(lllllllllllllIIIIllIllIIlIIIlIII.isConnected() ? 1 : 0)) {
            n = NioSocketChannel.lIlIllIlIIlIlI[1];
            "".length();
            if ((0x94 ^ 0xC0 ^ (0x57 ^ 0x6)) == 0x0) {
                return ((0xDA ^ 0xA7 ^ (0x71 ^ 0x46)) & (92 + 73 - 146 + 200 ^ 142 + 108 - 236 + 131 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = NioSocketChannel.lIlIllIlIIlIlI[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean isInputShutdown() {
        return super.isInputShutdown();
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    private static boolean llllIIIllIlIIII(final Object lllllllllllllIIIIllIlIllllIllllI) {
        return lllllllllllllIIIIllIlIllllIllllI != null;
    }
    
    private static void llllIIIllIIllII() {
        (lIlIllIlIIlIIl = new String[NioSocketChannel.lIlIllIlIIlIlI[1]])[NioSocketChannel.lIlIllIlIIlIlI[0]] = llllIIIllIIlIll("lrHHrX3Vkxq+pIF0YcCZrem5HNyMNI/LnqbpmSxFPxI=", "YQkqH");
    }
    
    @Override
    public ChannelFuture shutdownOutput(final ChannelPromise lllllllllllllIIIIllIllIIIllIllIl) {
        final EventLoop lllllllllllllIIIIllIllIIIllIllll = this.eventLoop();
        if (llllIIIllIIlllI(lllllllllllllIIIIllIllIIIllIllll.inEventLoop() ? 1 : 0)) {
            try {
                this.javaChannel().socket().shutdownOutput();
                lllllllllllllIIIIllIllIIIllIllIl.setSuccess();
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                return lllllllllllllIIIIllIllIIIllIllIl;
            }
            catch (Throwable lllllllllllllIIIIllIllIIIlllIIlI) {
                lllllllllllllIIIIllIllIIIllIllIl.setFailure(lllllllllllllIIIIllIllIIIlllIIlI);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                return lllllllllllllIIIIllIllIIIllIllIl;
            }
        }
        lllllllllllllIIIIllIllIIIllIllll.execute(new OneTimeTask() {
            @Override
            public void run() {
                NioSocketChannel.this.shutdownOutput(lllllllllllllIIIIllIllIIIllIllIl);
                "".length();
            }
        });
        return lllllllllllllIIIIllIllIIIllIllIl;
    }
    
    private static boolean llllIIIllIIlllI(final int lllllllllllllIIIIllIlIllllIlllII) {
        return lllllllllllllIIIIllIlIllllIlllII != 0;
    }
    
    static {
        llllIIIllIIllIl();
        llllIIIllIIllII();
        METADATA = new ChannelMetadata((boolean)(NioSocketChannel.lIlIllIlIIlIlI[0] != 0));
        DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();
    }
    
    @Override
    protected int doWriteBytes(final ByteBuf lllllllllllllIIIIllIllIIIIlllIII) throws Exception {
        final int lllllllllllllIIIIllIllIIIIllIlll = lllllllllllllIIIIllIllIIIIlllIII.readableBytes();
        return lllllllllllllIIIIllIllIIIIlllIII.readBytes(this.javaChannel(), lllllllllllllIIIIllIllIIIIllIlll);
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIIIllIllIIIIIIllll) throws Exception {
        do {
            final int lllllllllllllIIIIllIllIIIIIllIII = lllllllllllllIIIIllIllIIIIIIllll.size();
            if (llllIIIllIIllll(lllllllllllllIIIIllIllIIIIIllIII)) {
                this.clearOpWrite();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                long lllllllllllllIIIIllIllIIIIIlIlll = 0L;
                boolean lllllllllllllIIIIllIllIIIIIlIllI = NioSocketChannel.lIlIllIlIIlIlI[0] != 0;
                boolean lllllllllllllIIIIllIllIIIIIlIlIl = NioSocketChannel.lIlIllIlIIlIlI[0] != 0;
                final ByteBuffer[] lllllllllllllIIIIllIllIIIIIlIlII = lllllllllllllIIIIllIllIIIIIIllll.nioBuffers();
                final int lllllllllllllIIIIllIllIIIIIlIIll = lllllllllllllIIIIllIllIIIIIIllll.nioBufferCount();
                long lllllllllllllIIIIllIllIIIIIlIIlI = lllllllllllllIIIIllIllIIIIIIllll.nioBufferSize();
                final java.nio.channels.SocketChannel lllllllllllllIIIIllIllIIIIIlIIIl = this.javaChannel();
                switch (lllllllllllllIIIIllIllIIIIIlIIll) {
                    case 0: {
                        super.doWrite(lllllllllllllIIIIllIllIIIIIIllll);
                        return;
                    }
                    case 1: {
                        final ByteBuffer lllllllllllllIIIIllIllIIIIIllIIl = lllllllllllllIIIIllIllIIIIIlIlII[NioSocketChannel.lIlIllIlIIlIlI[0]];
                        int lllllllllllllIIIIllIllIIIIIlllII = this.config().getWriteSpinCount() - NioSocketChannel.lIlIllIlIIlIlI[1];
                        while (llllIIIllIlIIlI(lllllllllllllIIIIllIllIIIIIlllII)) {
                            final int lllllllllllllIIIIllIllIIIIIlllIl = lllllllllllllIIIIllIllIIIIIlIIIl.write(lllllllllllllIIIIllIllIIIIIllIIl);
                            if (llllIIIllIIllll(lllllllllllllIIIIllIllIIIIIlllIl)) {
                                lllllllllllllIIIIllIllIIIIIlIlIl = (NioSocketChannel.lIlIllIlIIlIlI[1] != 0);
                                "".length();
                                if ((75 + 57 + 8 + 4 ^ 69 + 29 - 37 + 87) < ((0x72 ^ 0x25 ^ "   ".length()) & (0x94 ^ 0xBC ^ (0xC4 ^ 0xB8) ^ -" ".length()))) {
                                    return;
                                }
                                break;
                            }
                            else {
                                lllllllllllllIIIIllIllIIIIIlIIlI -= lllllllllllllIIIIllIllIIIIIlllIl;
                                lllllllllllllIIIIllIllIIIIIlIlll += lllllllllllllIIIIllIllIIIIIlllIl;
                                if (llllIIIllIIllll(llllIIIllIlIIIl(lllllllllllllIIIIllIllIIIIIlIIlI, 0L))) {
                                    lllllllllllllIIIIllIllIIIIIlIllI = (NioSocketChannel.lIlIllIlIIlIlI[1] != 0);
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                    break;
                                }
                                else {
                                    --lllllllllllllIIIIllIllIIIIIlllII;
                                    "".length();
                                    if (((0xD4 ^ 0xC2) & ~(0x6F ^ 0x79)) != 0x0) {
                                        return;
                                    }
                                    continue;
                                }
                            }
                        }
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        break;
                    }
                    default: {
                        int lllllllllllllIIIIllIllIIIIIllIlI = this.config().getWriteSpinCount() - NioSocketChannel.lIlIllIlIIlIlI[1];
                        while (llllIIIllIlIIlI(lllllllllllllIIIIllIllIIIIIllIlI)) {
                            final long lllllllllllllIIIIllIllIIIIIllIll = lllllllllllllIIIIllIllIIIIIlIIIl.write(lllllllllllllIIIIllIllIIIIIlIlII, NioSocketChannel.lIlIllIlIIlIlI[0], lllllllllllllIIIIllIllIIIIIlIIll);
                            if (llllIIIllIIllll(llllIIIllIlIIIl(lllllllllllllIIIIllIllIIIIIllIll, 0L))) {
                                lllllllllllllIIIIllIllIIIIIlIlIl = (NioSocketChannel.lIlIllIlIIlIlI[1] != 0);
                                "".length();
                                if (((63 + 150 - 144 + 99 ^ 24 + 13 - 6 + 136) & (125 + 78 - 64 + 50 ^ 130 + 161 - 163 + 50 ^ -" ".length())) < 0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                lllllllllllllIIIIllIllIIIIIlIIlI -= lllllllllllllIIIIllIllIIIIIllIll;
                                lllllllllllllIIIIllIllIIIIIlIlll += lllllllllllllIIIIllIllIIIIIllIll;
                                if (llllIIIllIIllll(llllIIIllIlIIIl(lllllllllllllIIIIllIllIIIIIlIIlI, 0L))) {
                                    lllllllllllllIIIIllIllIIIIIlIllI = (NioSocketChannel.lIlIllIlIIlIlI[1] != 0);
                                    "".length();
                                    if (((49 + 105 + 17 + 63 ^ 99 + 48 - 19 + 11) & (48 + 57 - 36 + 156 ^ 30 + 42 - 14 + 70 ^ -" ".length())) > " ".length()) {
                                        return;
                                    }
                                    break;
                                }
                                else {
                                    --lllllllllllllIIIIllIllIIIIIllIlI;
                                    "".length();
                                    if (((0x56 ^ 0x18) & ~(0xEC ^ 0xA2)) > "   ".length()) {
                                        return;
                                    }
                                    continue;
                                }
                            }
                        }
                        break;
                    }
                }
                lllllllllllllIIIIllIllIIIIIIllll.removeBytes(lllllllllllllIIIIllIllIIIIIlIlll);
                if (!llllIIIllIIllll(lllllllllllllIIIIllIllIIIIIlIllI ? 1 : 0)) {
                    "".length();
                    continue;
                }
                this.incompleteWrite(lllllllllllllIIIIllIllIIIIIlIlIl);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        } while (-"  ".length() <= 0);
    }
    
    private static boolean llllIIIllIIllll(final int lllllllllllllIIIIllIlIllllIllIlI) {
        return lllllllllllllIIIIllIlIllllIllIlI == 0;
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.javaChannel().socket().getLocalSocketAddress();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.javaChannel().socket().getRemoteSocketAddress();
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioSocketChannel.METADATA;
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    public NioSocketChannel(final SelectorProvider lllllllllllllIIIIllIllIIlIlIIlIl) {
        this(newSocket(lllllllllllllIIIIllIllIIlIlIIlIl));
    }
    
    private static int llllIIIllIlIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String llllIIIllIIlIll(final String lllllllllllllIIIIllIlIlllllIIIll, final String lllllllllllllIIIIllIlIlllllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIlllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlIlllllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlIlllllIIlll.init(NioSocketChannel.lIlIllIlIIlIlI[3], lllllllllllllIIIIllIlIlllllIlIII);
            return new String(lllllllllllllIIIIllIlIlllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIlllllIIllI) {
            lllllllllllllIIIIllIlIlllllIIllI.printStackTrace();
            return null;
        }
    }
    
    public NioSocketChannel(final Channel lllllllllllllIIIIllIllIIlIIlIlll, final java.nio.channels.SocketChannel lllllllllllllIIIIllIllIIlIIlIllI) {
        super(lllllllllllllIIIIllIllIIlIIlIlll, lllllllllllllIIIIllIllIIlIIlIllI);
        this.config = new NioSocketChannelConfig(this, lllllllllllllIIIIllIllIIlIIlIllI.socket());
    }
    
    @Override
    public ChannelFuture shutdownOutput() {
        return this.shutdownOutput(this.newPromise());
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    @Override
    protected int doReadBytes(final ByteBuf lllllllllllllIIIIllIllIIIIllllll) throws Exception {
        return lllllllllllllIIIIllIllIIIIllllll.writeBytes(this.javaChannel(), lllllllllllllIIIIllIllIIIIllllll.writableBytes());
    }
    
    @Override
    public SocketChannelConfig config() {
        return this.config;
    }
    
    private static void llllIIIllIIllIl() {
        (lIlIllIlIIlIlI = new int[4])[0] = ((0x5F ^ 0x7F ^ (0x5 ^ 0x13)) & (0x1A ^ 0x3 ^ (0x62 ^ 0x4D) ^ -" ".length()));
        NioSocketChannel.lIlIllIlIIlIlI[1] = " ".length();
        NioSocketChannel.lIlIllIlIIlIlI[2] = (0x7C ^ 0x74);
        NioSocketChannel.lIlIllIlIIlIlI[3] = "  ".length();
    }
    
    public NioSocketChannel() {
        this(newSocket(NioSocketChannel.DEFAULT_SELECTOR_PROVIDER));
    }
    
    @Override
    public boolean isOutputShutdown() {
        int n;
        if (!llllIIIllIIllll(this.javaChannel().socket().isOutputShutdown() ? 1 : 0) || llllIIIllIIllll(this.isActive() ? 1 : 0)) {
            n = NioSocketChannel.lIlIllIlIIlIlI[1];
            "".length();
            if (((0x4E ^ 0x9) & ~(0xE4 ^ 0xA3)) <= -" ".length()) {
                return ((0x29 ^ 0x67) & ~(0xEC ^ 0xA2)) != 0x0;
            }
        }
        else {
            n = NioSocketChannel.lIlIllIlIIlIlI[0];
        }
        return n != 0;
    }
    
    private static boolean llllIIIllIlIIlI(final int lllllllllllllIIIIllIlIllllIllIII) {
        return lllllllllllllIIIIllIlIllllIllIII >= 0;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIIIllIllIIIllIIIIl) throws Exception {
        this.javaChannel().socket().bind(lllllllllllllIIIIllIllIIIllIIIIl);
    }
    
    private final class NioSocketChannelConfig extends DefaultSocketChannelConfig
    {
        private static final /* synthetic */ int[] lIlIllIIIIlllI;
        
        private NioSocketChannelConfig(final NioSocketChannel lllllllllllllIIIIlllIllIIIIIIllI, final Socket lllllllllllllIIIIlllIllIIIIIIlIl) {
            super(lllllllllllllIIIIlllIllIIIIIIllI, lllllllllllllIIIIlllIllIIIIIIlIl);
        }
        
        static {
            llllIIIIIlIlllI();
        }
        
        @Override
        protected void autoReadCleared() {
            AbstractNioChannel.this.setReadPending((boolean)(NioSocketChannelConfig.lIlIllIIIIlllI[0] != 0));
        }
        
        private static void llllIIIIIlIlllI() {
            (lIlIllIIIIlllI = new int[1])[0] = ((0x64 ^ 0x41 ^ (0x41 ^ 0x28)) & (68 + 101 - 35 + 7 ^ 77 + 179 - 183 + 120 ^ -" ".length()));
        }
    }
}
