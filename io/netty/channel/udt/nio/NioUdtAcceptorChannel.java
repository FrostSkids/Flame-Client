// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import com.barchart.udt.nio.ChannelUDT;
import io.netty.channel.udt.UdtChannel;
import io.netty.channel.udt.DefaultUdtServerChannelConfig;
import io.netty.channel.Channel;
import com.barchart.udt.nio.ServerSocketChannelUDT;
import java.net.SocketAddress;
import io.netty.util.internal.logging.InternalLoggerFactory;
import com.barchart.udt.TypeUDT;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.channels.SelectableChannel;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.udt.UdtChannelConfig;
import io.netty.channel.udt.UdtServerChannelConfig;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.udt.UdtServerChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public abstract class NioUdtAcceptorChannel extends AbstractNioMessageChannel implements UdtServerChannel
{
    private static final /* synthetic */ String[] llIIlIIlIIllII;
    protected static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ UdtServerChannelConfig config;
    private static final /* synthetic */ int[] llIIlIIlIIllIl;
    
    @Override
    protected boolean doWriteMessage(final Object llllllllllllIlllIIlIlIllIIIllIll, final ChannelOutboundBuffer llllllllllllIlllIIlIlIllIIIllIlI) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static void lIIIllIIIlIlIIIl() {
        (llIIlIIlIIllIl = new int[4])[0] = (0x88 ^ 0x98);
        NioUdtAcceptorChannel.llIIlIIlIIllIl[1] = ((0x7A ^ 0x1E ^ (0x42 ^ 0x15)) & (21 + 57 - 32 + 114 ^ 52 + 14 + 31 + 50 ^ -" ".length()));
        NioUdtAcceptorChannel.llIIlIIlIIllIl[2] = " ".length();
        NioUdtAcceptorChannel.llIIlIIlIIllIl[3] = "  ".length();
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return null;
    }
    
    private static void lIIIllIIIlIlIIII() {
        (llIIlIIlIIllII = new String[NioUdtAcceptorChannel.llIIlIIlIIllIl[3]])[NioUdtAcceptorChannel.llIIlIIlIIllIl[1]] = lIIIllIIIlIIllll("JBsqPw0GWjc8SAEWLCANQhkrMgYMHy99", "bzCSh");
        NioUdtAcceptorChannel.llIIlIIlIIllII[NioUdtAcceptorChannel.llIIlIIlIIllIl[2]] = lIIIllIIIlIIllll("Aw4iCCwhTz8LaSYAJQIgIho5AWkmByoKJyADZQ==", "EoKdI");
    }
    
    private static boolean lIIIllIIIlIlIIlI(final int llllllllllllIlllIIlIlIlIllIlllIl) {
        return llllllllllllIlllIIlIlIlIllIlllIl != 0;
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    private static String lIIIllIIIlIIllll(String llllllllllllIlllIIlIlIlIllllIIII, final String llllllllllllIlllIIlIlIlIlllIllll) {
        llllllllllllIlllIIlIlIlIllllIIII = new String(Base64.getDecoder().decode(llllllllllllIlllIIlIlIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlIlIlIlllIlllI = new StringBuilder();
        final char[] llllllllllllIlllIIlIlIlIlllIllIl = llllllllllllIlllIIlIlIlIlllIllll.toCharArray();
        int llllllllllllIlllIIlIlIlIlllIllII = NioUdtAcceptorChannel.llIIlIIlIIllIl[1];
        final char llllllllllllIlllIIlIlIlIlllIIllI = (Object)llllllllllllIlllIIlIlIlIllllIIII.toCharArray();
        final int llllllllllllIlllIIlIlIlIlllIIlIl = llllllllllllIlllIIlIlIlIlllIIllI.length;
        boolean llllllllllllIlllIIlIlIlIlllIIlII = NioUdtAcceptorChannel.llIIlIIlIIllIl[1] != 0;
        while (lIIIllIIIlIlIIll(llllllllllllIlllIIlIlIlIlllIIlII ? 1 : 0, llllllllllllIlllIIlIlIlIlllIIlIl)) {
            final char llllllllllllIlllIIlIlIlIllllIIIl = llllllllllllIlllIIlIlIlIlllIIllI[llllllllllllIlllIIlIlIlIlllIIlII];
            llllllllllllIlllIIlIlIlIlllIlllI.append((char)(llllllllllllIlllIIlIlIlIllllIIIl ^ llllllllllllIlllIIlIlIlIlllIllIl[llllllllllllIlllIIlIlIlIlllIllII % llllllllllllIlllIIlIlIlIlllIllIl.length]));
            "".length();
            ++llllllllllllIlllIIlIlIlIlllIllII;
            ++llllllllllllIlllIIlIlIlIlllIIlII;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlIlIlIlllIlllI);
    }
    
    protected NioUdtAcceptorChannel(final TypeUDT llllllllllllIlllIIlIlIllIIlIlllI) {
        this(NioUdtProvider.newAcceptorChannelUDT(llllllllllllIlllIIlIlIllIIlIlllI));
    }
    
    static {
        lIIIllIIIlIlIIIl();
        lIIIllIIIlIlIIII();
        logger = InternalLoggerFactory.getInstance(NioUdtAcceptorChannel.class);
    }
    
    @Override
    protected boolean doConnect(final SocketAddress llllllllllllIlllIIlIlIllIIlIIIII, final SocketAddress llllllllllllIlllIIlIlIllIIIlllll) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.javaChannel().socket().getLocalSocketAddress();
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    protected NioUdtAcceptorChannel(final ServerSocketChannelUDT llllllllllllIlllIIlIlIllIIllIllI) {
        super(null, (SelectableChannel)llllllllllllIlllIIlIlIllIIllIllI, NioUdtAcceptorChannel.llIIlIIlIIllIl[0]);
        try {
            llllllllllllIlllIIlIlIllIIllIllI.configureBlocking((boolean)(NioUdtAcceptorChannel.llIIlIIlIIllIl[1] != 0));
            "".length();
            this.config = new DefaultUdtServerChannelConfig(this, (ChannelUDT)llllllllllllIlllIIlIlIllIIllIllI, (boolean)(NioUdtAcceptorChannel.llIIlIIlIIllIl[2] != 0));
            "".length();
            if ("   ".length() != "   ".length()) {
                throw null;
            }
        }
        catch (Exception llllllllllllIlllIIlIlIllIIlllIlI) {
            try {
                llllllllllllIlllIIlIlIllIIllIllI.close();
                "".length();
                if (((0xF0 ^ 0xA0) & ~(0xF ^ 0x5F)) != 0x0) {
                    throw null;
                }
            }
            catch (Exception llllllllllllIlllIIlIlIllIIlllIll) {
                if (lIIIllIIIlIlIIlI(NioUdtAcceptorChannel.logger.isWarnEnabled() ? 1 : 0)) {
                    NioUdtAcceptorChannel.logger.warn(NioUdtAcceptorChannel.llIIlIIlIIllII[NioUdtAcceptorChannel.llIIlIIlIIllIl[1]], llllllllllllIlllIIlIlIllIIlllIll);
                }
            }
            throw new ChannelException(NioUdtAcceptorChannel.llIIlIIlIIllII[NioUdtAcceptorChannel.llIIlIIlIIllIl[2]], llllllllllllIlllIIlIlIllIIlllIlI);
        }
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object llllllllllllIlllIIlIlIllIIIllIII) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    private static boolean lIIIllIIIlIlIIll(final int llllllllllllIlllIIlIlIlIlllIIIII, final int llllllllllllIlllIIlIlIlIllIlllll) {
        return llllllllllllIlllIIlIlIlIlllIIIII < llllllllllllIlllIIlIlIlIllIlllll;
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIlllIIlIlIllIIlIIlll) throws Exception {
        this.javaChannel().socket().bind(llllllllllllIlllIIlIlIllIIlIIlll, this.config.getBacklog());
    }
    
    protected ServerSocketChannelUDT javaChannel() {
        return (ServerSocketChannelUDT)super.javaChannel();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    @Override
    public boolean isActive() {
        return this.javaChannel().socket().isBound();
    }
    
    @Override
    public UdtServerChannelConfig config() {
        return this.config;
    }
}
