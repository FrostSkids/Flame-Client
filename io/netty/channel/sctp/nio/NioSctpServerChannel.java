// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp.nio;

import io.netty.channel.sctp.DefaultSctpServerChannelConfig;
import java.nio.channels.SelectableChannel;
import com.sun.nio.sctp.SctpChannel;
import io.netty.channel.Channel;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.net.InetSocketAddress;
import java.util.Set;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import java.net.InetAddress;
import java.net.SocketAddress;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.sctp.SctpServerChannelConfig;
import io.netty.channel.sctp.SctpServerChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public class NioSctpServerChannel extends AbstractNioMessageChannel implements SctpServerChannel
{
    private final /* synthetic */ SctpServerChannelConfig config;
    private static final /* synthetic */ int[] lllllIlIlIlII;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String[] lllllIlIlIIlI;
    
    @Override
    protected void doFinishConnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (lIlIlllIlIllIIl(this.isOpen() ? 1 : 0) && lIlIlllIlIllIlI(this.allLocalAddresses().isEmpty() ? 1 : 0)) {
            n = NioSctpServerChannel.lllllIlIlIlII[2];
            "".length();
            if ((0x59 ^ 0x5D) == 0x0) {
                return ((0x8F ^ 0xBF) & ~(0x57 ^ 0x67)) != 0x0;
            }
        }
        else {
            n = NioSctpServerChannel.lllllIlIlIlII[0];
        }
        return n != 0;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioSctpServerChannel.METADATA;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIlIlIllIlIlllIlIlIl) throws Exception {
        this.javaChannel().bind(lllllllllllllIlIlIllIlIlllIlIlIl, this.config.getBacklog());
        "".length();
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIlIlIllIlIllIlIlIlI, final ChannelPromise lllllllllllllIlIlIllIlIllIlIIllI) {
        if (lIlIlllIlIllIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.javaChannel().unbindAddress(lllllllllllllIlIlIllIlIllIlIlIlI);
                "".length();
                lllllllllllllIlIlIllIlIllIlIIllI.setSuccess();
                "".length();
                "".length();
                if (((0xD3 ^ 0x82) & ~(0x25 ^ 0x74)) != 0x0) {
                    return null;
                }
                return lllllllllllllIlIlIllIlIllIlIIllI;
            }
            catch (Throwable lllllllllllllIlIlIllIlIllIlIllII) {
                lllllllllllllIlIlIllIlIllIlIIllI.setFailure(lllllllllllllIlIlIllIlIllIlIllII);
                "".length();
                "".length();
                if (-" ".length() > -" ".length()) {
                    return null;
                }
                return lllllllllllllIlIlIllIlIllIlIIllI;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                NioSctpServerChannel.this.unbindAddress(lllllllllllllIlIlIllIlIllIlIlIlI, lllllllllllllIlIlIllIlIllIlIIllI);
                "".length();
            }
        });
        return lllllllllllllIlIlIllIlIllIlIIllI;
    }
    
    private static void lIlIlllIlIllIII() {
        (lllllIlIlIlII = new int[4])[0] = ((70 + 42 - 51 + 121 ^ 75 + 106 - 83 + 86) & (10 + 93 + 24 + 46 ^ 145 + 78 - 138 + 78 ^ -" ".length()));
        NioSctpServerChannel.lllllIlIlIlII[1] = (0x15 ^ 0x5);
        NioSctpServerChannel.lllllIlIlIlII[2] = " ".length();
        NioSctpServerChannel.lllllIlIlIlII[3] = "  ".length();
    }
    
    private static com.sun.nio.sctp.SctpServerChannel newSocket() {
        try {
            return com.sun.nio.sctp.SctpServerChannel.open();
        }
        catch (IOException lllllllllllllIlIlIllIllIIIIIIlII) {
            throw new ChannelException(NioSctpServerChannel.lllllIlIlIIlI[NioSctpServerChannel.lllllIlIlIlII[0]], lllllllllllllIlIlIllIllIIIIIIlII);
        }
    }
    
    @Override
    protected boolean doConnect(final SocketAddress lllllllllllllIlIlIllIlIllIlIIIll, final SocketAddress lllllllllllllIlIlIllIlIllIlIIIlI) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected com.sun.nio.sctp.SctpServerChannel javaChannel() {
        return (com.sun.nio.sctp.SctpServerChannel)super.javaChannel();
    }
    
    @Override
    public Set<InetSocketAddress> allLocalAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIlIlIllIlIlllllIlll = this.javaChannel().getAllLocalAddresses();
            final Set<InetSocketAddress> lllllllllllllIlIlIllIlIlllllIllI = new LinkedHashSet<InetSocketAddress>(lllllllllllllIlIlIllIlIlllllIlll.size());
            final Iterator lllllllllllllIlIlIllIlIllllllIII = lllllllllllllIlIlIllIlIlllllIlll.iterator();
            while (lIlIlllIlIllIIl(lllllllllllllIlIlIllIlIllllllIII.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIlIlIllIlIllllllIIl = lllllllllllllIlIlIllIlIllllllIII.next();
                lllllllllllllIlIlIllIlIlllllIllI.add((InetSocketAddress)lllllllllllllIlIlIllIlIllllllIIl);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return lllllllllllllIlIlIllIlIlllllIllI;
        }
        catch (Throwable lllllllllllllIlIlIllIlIlllllIlIl) {
            return Collections.emptySet();
        }
    }
    
    @Override
    protected boolean doWriteMessage(final Object lllllllllllllIlIlIllIlIllIIlllIl, final ChannelOutboundBuffer lllllllllllllIlIlIllIlIllIIlllII) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIlIlIllIlIllIIllIlI) throws Exception {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIlIlIllIlIllIllIIll) {
        return this.unbindAddress(lllllllllllllIlIlIllIlIllIllIIll, this.newPromise());
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIlIlIllIlIlllIIIIll) {
        return this.bindAddress(lllllllllllllIlIlIllIlIlllIIIIll, this.newPromise());
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return null;
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    private static String lIlIlllIlIlIIll(final String lllllllllllllIlIlIllIlIllIIIIIII, final String lllllllllllllIlIlIllIlIlIlllllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIlIllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIlIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIlIllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIlIllIIIIIlI.init(NioSctpServerChannel.lllllIlIlIlII[3], lllllllllllllIlIlIllIlIllIIIIIll);
            return new String(lllllllllllllIlIlIllIlIllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIlIllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIlIllIIIIIIl) {
            lllllllllllllIlIlIllIlIllIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIlIlIllIlIlllIIlIlI) throws Exception {
        final SctpChannel lllllllllllllIlIlIllIlIlllIIllII = this.javaChannel().accept();
        if (lIlIlllIlIllIll(lllllllllllllIlIlIllIlIlllIIllII)) {
            return NioSctpServerChannel.lllllIlIlIlII[0];
        }
        lllllllllllllIlIlIllIlIlllIIlIlI.add(new NioSctpChannel(this, lllllllllllllIlIlIllIlIlllIIllII));
        "".length();
        return NioSctpServerChannel.lllllIlIlIlII[2];
    }
    
    @Override
    public SctpServerChannelConfig config() {
        return this.config;
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return null;
    }
    
    private static boolean lIlIlllIlIllIll(final Object lllllllllllllIlIlIllIlIlIllllIIl) {
        return lllllllllllllIlIlIllIlIlIllllIIl == null;
    }
    
    static {
        lIlIlllIlIllIII();
        lIlIlllIlIlIllI();
        METADATA = new ChannelMetadata((boolean)(NioSctpServerChannel.lllllIlIlIlII[0] != 0));
    }
    
    private static boolean lIlIlllIlIllIIl(final int lllllllllllllIlIlIllIlIlIlllIlll) {
        return lllllllllllllIlIlIllIlIlIlllIlll != 0;
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIlIlIllIlIllIllllII, final ChannelPromise lllllllllllllIlIlIllIlIllIlllIll) {
        if (lIlIlllIlIllIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.javaChannel().bindAddress(lllllllllllllIlIlIllIlIllIllllII);
                "".length();
                lllllllllllllIlIlIllIlIllIlllIll.setSuccess();
                "".length();
                "".length();
                if (-(0x63 ^ 0x67) >= 0) {
                    return null;
                }
                return lllllllllllllIlIlIllIlIllIlllIll;
            }
            catch (Throwable lllllllllllllIlIlIllIlIllIlllllI) {
                lllllllllllllIlIlIllIlIllIlllIll.setFailure(lllllllllllllIlIlIllIlIllIlllllI);
                "".length();
                "".length();
                if ((107 + 49 - 145 + 142 ^ 32 + 125 - 142 + 142) < " ".length()) {
                    return null;
                }
                return lllllllllllllIlIlIllIlIllIlllIll;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                NioSctpServerChannel.this.bindAddress(lllllllllllllIlIlIllIlIllIllllII, lllllllllllllIlIlIllIlIllIlllIll);
                "".length();
            }
        });
        return lllllllllllllIlIlIllIlIllIlllIll;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIlIlIllIlIlllIlllll = this.javaChannel().getAllLocalAddresses().iterator();
            if (lIlIlllIlIllIIl(lllllllllllllIlIlIllIlIlllIlllll.hasNext() ? 1 : 0)) {
                return lllllllllllllIlIlIllIlIlllIlllll.next();
            }
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    public NioSctpServerChannel() {
        super(null, newSocket(), NioSctpServerChannel.lllllIlIlIlII[1]);
        this.config = new NioSctpServerChannelConfig(this, this.javaChannel());
    }
    
    private static void lIlIlllIlIlIllI() {
        (lllllIlIlIIlI = new String[NioSctpServerChannel.lllllIlIlIlII[2]])[NioSctpServerChannel.lllllIlIlIlII[0]] = lIlIlllIlIlIIll("RT4Al7yG/0rVig5f2niwdFe9AhhQ1a/b5O7otlFU/24=", "CKfGF");
    }
    
    private static boolean lIlIlllIlIllIlI(final int lllllllllllllIlIlIllIlIlIlllIlIl) {
        return lllllllllllllIlIlIllIlIlIlllIlIl == 0;
    }
    
    private final class NioSctpServerChannelConfig extends DefaultSctpServerChannelConfig
    {
        private static final /* synthetic */ int[] lllIIlIlIlIIll;
        
        @Override
        protected void autoReadCleared() {
            AbstractNioChannel.this.setReadPending((boolean)(NioSctpServerChannelConfig.lllIIlIlIlIIll[0] != 0));
        }
        
        private static void lIIllllllIlIIIlI() {
            (lllIIlIlIlIIll = new int[1])[0] = ((0x4E ^ 0xF) & ~(0x31 ^ 0x70));
        }
        
        private NioSctpServerChannelConfig(final NioSctpServerChannel llllllllllllIlIllllIlIIIIllIIIlI, final com.sun.nio.sctp.SctpServerChannel llllllllllllIlIllllIlIIIIllIIlIl) {
            super(llllllllllllIlIllllIlIIIIllIIIlI, llllllllllllIlIllllIlIIIIllIIlIl);
        }
        
        static {
            lIIllllllIlIIIlI();
        }
    }
}
