// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.nio;

import java.net.ServerSocket;
import io.netty.channel.socket.DefaultServerSocketChannelConfig;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelConfig;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.Arrays;
import java.net.InetSocketAddress;
import java.nio.channels.SelectableChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import io.netty.channel.Channel;
import java.util.List;
import java.nio.channels.spi.SelectorProvider;
import io.netty.channel.socket.ServerSocketChannelConfig;
import io.netty.channel.ChannelMetadata;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public class NioServerSocketChannel extends AbstractNioMessageChannel implements ServerSocketChannel
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIIlIIllIIlIIl;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private final /* synthetic */ ServerSocketChannelConfig config;
    private static final /* synthetic */ String[] lIIlIIllIIIlll;
    private static final /* synthetic */ SelectorProvider DEFAULT_SELECTOR_PROVIDER;
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIIllIllIlIIlllllIlI) throws Exception {
        final SocketChannel lllllllllllllIIllIllIlIIlllllIIl = this.javaChannel().accept();
        try {
            if (llIIllIlllllIII(lllllllllllllIIllIllIlIIlllllIIl)) {
                lllllllllllllIIllIllIlIIlllllIlI.add(new NioSocketChannel(this, lllllllllllllIIllIllIlIIlllllIIl));
                "".length();
                return NioServerSocketChannel.lIIlIIllIIlIIl[2];
            }
            "".length();
            if (((0x2A ^ 0x5D ^ (0x8 ^ 0x57)) & (0xC ^ 0x75 ^ (0xEB ^ 0xBA) ^ -" ".length())) >= "   ".length()) {
                return (0x5C ^ 0x6A ^ (0x1B ^ 0x7)) & (120 + 139 - 148 + 58 ^ 70 + 10 + 35 + 16 ^ -" ".length());
            }
        }
        catch (Throwable lllllllllllllIIllIllIlIIllllllII) {
            NioServerSocketChannel.logger.warn(NioServerSocketChannel.lIIlIIllIIIlll[NioServerSocketChannel.lIIlIIllIIlIIl[2]], lllllllllllllIIllIllIlIIllllllII);
            try {
                lllllllllllllIIllIllIlIIlllllIIl.close();
                "".length();
                if (((0xD1 ^ 0x91 ^ (0x10 ^ 0x61)) & (24 + 25 + 1 + 78 ^ 149 + 80 - 212 + 160 ^ -" ".length())) > ((0xE0 ^ 0xAA ^ (0xCE ^ 0xA6)) & (0x58 ^ 0x71 ^ (0x2B ^ 0x20) ^ -" ".length()))) {
                    return (0xDE ^ 0x98 ^ (0xF5 ^ 0x90)) & (41 + 52 - 68 + 199 ^ 50 + 112 + 26 + 7 ^ -" ".length());
                }
                return NioServerSocketChannel.lIIlIIllIIlIIl[0];
            }
            catch (Throwable lllllllllllllIIllIllIlIIllllllIl) {
                NioServerSocketChannel.logger.warn(NioServerSocketChannel.lIIlIIllIIIlll[NioServerSocketChannel.lIIlIIllIIlIIl[3]], lllllllllllllIIllIllIlIIllllllIl);
            }
        }
        return NioServerSocketChannel.lIIlIIllIIlIIl[0];
    }
    
    private static boolean llIIllIlllllIII(final Object lllllllllllllIIllIllIlIIlIIlllll) {
        return lllllllllllllIIllIllIlIIlIIlllll != null;
    }
    
    @Override
    public ServerSocketChannelConfig config() {
        return this.config;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.javaChannel().socket().getLocalSocketAddress();
    }
    
    @Override
    public boolean isActive() {
        return this.javaChannel().socket().isBound();
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object lllllllllllllIIllIllIlIIlllIlIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static String llIIllIlllIllII(final String lllllllllllllIIllIllIlIIllIIIIII, final String lllllllllllllIIllIllIlIIlIllllll) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIlIIllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllIlIIllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllIlIIllIIIlII.init(NioServerSocketChannel.lIIlIIllIIlIIl[3], lllllllllllllIIllIllIlIIllIIIlIl);
            return new String(lllllllllllllIIllIllIlIIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIlIIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIlIIllIIIIll) {
            lllllllllllllIIllIllIlIIllIIIIll.printStackTrace();
            return null;
        }
    }
    
    public NioServerSocketChannel(final java.nio.channels.ServerSocketChannel lllllllllllllIIllIllIlIlIIlIlllI) {
        super(null, lllllllllllllIIllIllIlIlIIlIlllI, NioServerSocketChannel.lIIlIIllIIlIIl[1]);
        this.config = new NioServerSocketChannelConfig(this, this.javaChannel().socket());
    }
    
    public NioServerSocketChannel(final SelectorProvider lllllllllllllIIllIllIlIlIIllIlII) {
        this(newSocket(lllllllllllllIIllIllIlIlIIllIlII));
    }
    
    private static boolean llIIllIlllllIIl(final int lllllllllllllIIllIllIlIIlIlIIIlI, final int lllllllllllllIIllIllIlIIlIlIIIIl) {
        return lllllllllllllIIllIllIlIIlIlIIIlI < lllllllllllllIIllIllIlIIlIlIIIIl;
    }
    
    private static void llIIllIllllIlll() {
        (lIIlIIllIIlIIl = new int[6])[0] = ((148 + 47 - 34 + 67 ^ 166 + 105 - 229 + 133) & (0x36 ^ 0x1B ^ (0x16 ^ 0x70) ^ -" ".length()));
        NioServerSocketChannel.lIIlIIllIIlIIl[1] = (0x26 ^ 0x36);
        NioServerSocketChannel.lIIlIIllIIlIIl[2] = " ".length();
        NioServerSocketChannel.lIIlIIllIIlIIl[3] = "  ".length();
        NioServerSocketChannel.lIIlIIllIIlIIl[4] = "   ".length();
        NioServerSocketChannel.lIIlIIllIIlIIl[5] = (0x26 ^ 0x2E);
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return null;
    }
    
    private static String llIIllIlllIlllI(final String lllllllllllllIIllIllIlIIllIIllll, final String lllllllllllllIIllIllIlIIllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIlIIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIlIIllIIlllI.getBytes(StandardCharsets.UTF_8)), NioServerSocketChannel.lIIlIIllIIlIIl[5]), "DES");
            final Cipher lllllllllllllIIllIllIlIIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIllIlIIllIlIIIl.init(NioServerSocketChannel.lIIlIIllIIlIIl[3], lllllllllllllIIllIllIlIIllIlIIlI);
            return new String(lllllllllllllIIllIllIlIIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIlIIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIlIIllIlIIII) {
            lllllllllllllIIllIllIlIIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected boolean doWriteMessage(final Object lllllllllllllIIllIllIlIIlllIllII, final ChannelOutboundBuffer lllllllllllllIIllIllIlIIlllIlIll) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    static {
        llIIllIllllIlll();
        llIIllIlllIllll();
        METADATA = new ChannelMetadata((boolean)(NioServerSocketChannel.lIIlIIllIIlIIl[0] != 0));
        DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();
        logger = InternalLoggerFactory.getInstance(NioServerSocketChannel.class);
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    protected boolean doConnect(final SocketAddress lllllllllllllIIllIllIlIIllllIIlI, final SocketAddress lllllllllllllIIllIllIlIIllllIIIl) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static String llIIllIlllIllIl(String lllllllllllllIIllIllIlIIlIlIllIl, final String lllllllllllllIIllIllIlIIlIlIllII) {
        lllllllllllllIIllIllIlIIlIlIllIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIllIlIIlIlIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllIlIIlIllIIII = new StringBuilder();
        final char[] lllllllllllllIIllIllIlIIlIlIllll = lllllllllllllIIllIllIlIIlIlIllII.toCharArray();
        int lllllllllllllIIllIllIlIIlIlIlllI = NioServerSocketChannel.lIIlIIllIIlIIl[0];
        final boolean lllllllllllllIIllIllIlIIlIlIlIII = (Object)((String)lllllllllllllIIllIllIlIIlIlIllIl).toCharArray();
        final char lllllllllllllIIllIllIlIIlIlIIlll = (char)lllllllllllllIIllIllIlIIlIlIlIII.length;
        short lllllllllllllIIllIllIlIIlIlIIllI = (short)NioServerSocketChannel.lIIlIIllIIlIIl[0];
        while (llIIllIlllllIIl(lllllllllllllIIllIllIlIIlIlIIllI, lllllllllllllIIllIllIlIIlIlIIlll)) {
            final char lllllllllllllIIllIllIlIIlIllIIll = lllllllllllllIIllIllIlIIlIlIlIII[lllllllllllllIIllIllIlIIlIlIIllI];
            lllllllllllllIIllIllIlIIlIllIIII.append((char)(lllllllllllllIIllIllIlIIlIllIIll ^ lllllllllllllIIllIllIlIIlIlIllll[lllllllllllllIIllIllIlIIlIlIlllI % lllllllllllllIIllIllIlIIlIlIllll.length]));
            "".length();
            ++lllllllllllllIIllIllIlIIlIlIlllI;
            ++lllllllllllllIIllIllIlIIlIlIIllI;
            "".length();
            if ((0x17 ^ 0x13) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllIlIIlIllIIII);
    }
    
    private static void llIIllIlllIllll() {
        (lIIlIIllIIIlll = new String[NioServerSocketChannel.lIIlIIllIIlIIl[4]])[NioServerSocketChannel.lIIlIIllIIlIIl[0]] = llIIllIlllIllII("2rOJqNzToFo5HEzgEAPfSfnOfjTRM82ni3tkL4JZWH4=", "Dvahf");
        NioServerSocketChannel.lIIlIIllIIIlll[NioServerSocketChannel.lIIlIIllIIlIIl[2]] = llIIllIlllIllIl("ERslGzMzWjgYdjQIKRYiMlotVzgyDWwUPjYUIhI6dxw+GDt3GyJXNzQZKQciMh5sBDk0ESkDeA==", "WzLwV");
        NioServerSocketChannel.lIIlIIllIIIlll[NioServerSocketChannel.lIIlIIllIIlIIl[3]] = llIIllIlllIlllI("mCPjRpEepwoiXMQ0oWEkqP7hhiLwHfvgCeqJeaFXgv8=", "LzcJr");
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioServerSocketChannel.METADATA;
    }
    
    private static java.nio.channels.ServerSocketChannel newSocket(final SelectorProvider lllllllllllllIIllIllIlIlIIllllIl) {
        try {
            return lllllllllllllIIllIllIlIlIIllllIl.openServerSocketChannel();
        }
        catch (IOException lllllllllllllIIllIllIlIlIIlllllI) {
            throw new ChannelException(NioServerSocketChannel.lIIlIIllIIIlll[NioServerSocketChannel.lIIlIIllIIlIIl[0]], lllllllllllllIIllIllIlIlIIlllllI);
        }
    }
    
    @Override
    protected java.nio.channels.ServerSocketChannel javaChannel() {
        return (java.nio.channels.ServerSocketChannel)super.javaChannel();
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    public NioServerSocketChannel() {
        this(newSocket(NioServerSocketChannel.DEFAULT_SELECTOR_PROVIDER));
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIllIllIlIlIIIIlIIl) throws Exception {
        this.javaChannel().socket().bind(lllllllllllllIIllIllIlIlIIIIlIIl, this.config.getBacklog());
    }
    
    private final class NioServerSocketChannelConfig extends DefaultServerSocketChannelConfig
    {
        private static final /* synthetic */ int[] llIIlllllllIll;
        
        private NioServerSocketChannelConfig(final NioServerSocketChannel llllllllllllIllIlllIIIlIIllllllI, final ServerSocket llllllllllllIllIlllIIIlIIlllllIl) {
            super(llllllllllllIllIlllIIIlIIllllllI, llllllllllllIllIlllIIIlIIlllllIl);
        }
        
        @Override
        protected void autoReadCleared() {
            AbstractNioChannel.this.setReadPending((boolean)(NioServerSocketChannelConfig.llIIlllllllIll[0] != 0));
        }
        
        static {
            lIIlIIIIllIIIlll();
        }
        
        private static void lIIlIIIIllIIIlll() {
            (llIIlllllllIll = new int[1])[0] = ((0x72 ^ 0x2D ^ (0x91 ^ 0x8D)) & (0xEB ^ 0xAE ^ (0x6E ^ 0x68) ^ -" ".length()));
        }
    }
}
