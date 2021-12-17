// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp.nio;

import io.netty.channel.sctp.DefaultSctpChannelConfig;
import io.netty.util.ReferenceCounted;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelOutboundBuffer;
import com.sun.nio.sctp.MessageInfo;
import java.nio.ByteBuffer;
import io.netty.buffer.ByteBuf;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.sctp.SctpMessage;
import java.util.List;
import io.netty.channel.ChannelPromise;
import io.netty.channel.sctp.SctpServerChannel;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.ChannelException;
import io.netty.channel.sctp.SctpNotificationHandler;
import java.nio.channels.SelectableChannel;
import io.netty.channel.Channel;
import java.util.LinkedHashSet;
import io.netty.channel.ChannelFuture;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Collections;
import java.net.SocketAddress;
import java.util.HashSet;
import java.net.InetSocketAddress;
import java.util.Set;
import io.netty.channel.ChannelConfig;
import java.io.IOException;
import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.NotificationHandler;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.sctp.SctpChannelConfig;
import io.netty.channel.sctp.SctpChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public class NioSctpChannel extends AbstractNioMessageChannel implements SctpChannel
{
    private final /* synthetic */ SctpChannelConfig config;
    private static final /* synthetic */ String[] lIllIIllllIIII;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ int[] lIllIIllllIIIl;
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
    private final /* synthetic */ NotificationHandler<?> notificationHandler;
    
    @Override
    public Association association() {
        try {
            return this.javaChannel().association();
        }
        catch (IOException lllllllllllllIIIIIIlIIIllllIllll) {
            return null;
        }
    }
    
    private static boolean lllllIllIIlllll(final int lllllllllllllIIIIIIlIIIIllIllIll, final int lllllllllllllIIIIIIlIIIIllIllIlI) {
        return lllllllllllllIIIIIIlIIIIllIllIll == lllllllllllllIIIIIIlIIIIllIllIlI;
    }
    
    private static boolean lllllIllIIlllIl(final int lllllllllllllIIIIIIlIIIIllIIlIIl, final int lllllllllllllIIIIIIlIIIIllIIlIII) {
        return lllllllllllllIIIIIIlIIIIllIIlIIl != lllllllllllllIIIIIIlIIIIllIIlIII;
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        if (lllllIllIIllIll(this.javaChannel().finishConnect() ? 1 : 0)) {
            throw new Error();
        }
    }
    
    private static void lllllIllIIllIII() {
        (lIllIIllllIIIl = new int[8])[0] = ((0xD0 ^ 0x80 ^ (0x66 ^ 0x72)) & (0x2D ^ 0x62 ^ (0xB1 ^ 0xBA) ^ -" ".length()));
        NioSctpChannel.lIllIIllllIIIl[1] = " ".length();
        NioSctpChannel.lIllIIllllIIIl[2] = "  ".length();
        NioSctpChannel.lIllIIllllIIIl[3] = (0x43 ^ 0x4B);
        NioSctpChannel.lIllIIllllIIIl[4] = -" ".length();
        NioSctpChannel.lIllIIllllIIIl[5] = "   ".length();
        NioSctpChannel.lIllIIllllIIIl[6] = (0x37 ^ 0x33);
        NioSctpChannel.lIllIIllllIIIl[7] = (0x31 ^ 0x34);
    }
    
    private static boolean lllllIllIIllIlI(final Object lllllllllllllIIIIIIlIIIIllIlIlII) {
        return lllllllllllllIIIIIIlIIIIllIlIlII != null;
    }
    
    @Override
    public Set<InetSocketAddress> allRemoteAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIIIIIIlIIIlllIlIIIl = this.javaChannel().getRemoteAddresses();
            final Set<InetSocketAddress> lllllllllllllIIIIIIlIIIlllIlIIII = new HashSet<InetSocketAddress>(lllllllllllllIIIIIIlIIIlllIlIIIl.size());
            final Iterator lllllllllllllIIIIIIlIIIlllIlIIlI = lllllllllllllIIIIIIlIIIlllIlIIIl.iterator();
            while (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIlllIlIIlI.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIIIIIIlIIIlllIlIIll = lllllllllllllIIIIIIlIIIlllIlIIlI.next();
                lllllllllllllIIIIIIlIIIlllIlIIII.add((InetSocketAddress)lllllllllllllIIIIIIlIIIlllIlIIll);
                "".length();
                "".length();
                if (((91 + 103 - 151 + 125 ^ 101 + 160 - 117 + 37) & (0x2D ^ 0x68 ^ (0x6A ^ 0x32) ^ -" ".length())) == (19 + 123 - 65 + 111 ^ 68 + 128 - 57 + 45)) {
                    return null;
                }
            }
            return lllllllllllllIIIIIIlIIIlllIlIIII;
        }
        catch (Throwable lllllllllllllIIIIIIlIIIlllIIllll) {
            return Collections.emptySet();
        }
    }
    
    private static String lllllIllIIlIlIl(String lllllllllllllIIIIIIlIIIIlllIIllI, final String lllllllllllllIIIIIIlIIIIlllIlIlI) {
        lllllllllllllIIIIIIlIIIIlllIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlIIIIlllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIlIIIIlllIlIII = lllllllllllllIIIIIIlIIIIlllIlIlI.toCharArray();
        int lllllllllllllIIIIIIlIIIIlllIIlll = NioSctpChannel.lIllIIllllIIIl[0];
        final double lllllllllllllIIIIIIlIIIIlllIIIIl = (Object)lllllllllllllIIIIIIlIIIIlllIIllI.toCharArray();
        final short lllllllllllllIIIIIIlIIIIlllIIIII = (short)lllllllllllllIIIIIIlIIIIlllIIIIl.length;
        long lllllllllllllIIIIIIlIIIIllIlllll = NioSctpChannel.lIllIIllllIIIl[0];
        while (lllllIllIlIIIII((int)lllllllllllllIIIIIIlIIIIllIlllll, lllllllllllllIIIIIIlIIIIlllIIIII)) {
            final char lllllllllllllIIIIIIlIIIIlllIllII = lllllllllllllIIIIIIlIIIIlllIIIIl[lllllllllllllIIIIIIlIIIIllIlllll];
            lllllllllllllIIIIIIlIIIIlllIlIIl.append((char)(lllllllllllllIIIIIIlIIIIlllIllII ^ lllllllllllllIIIIIIlIIIIlllIlIII[lllllllllllllIIIIIIlIIIIlllIIlll % lllllllllllllIIIIIIlIIIIlllIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIIlIIIIlllIIlll;
            ++lllllllllllllIIIIIIlIIIIllIlllll;
            "".length();
            if (((63 + 149 - 160 + 115 ^ 116 + 156 - 154 + 79) & (75 + 78 - 21 + 88 ^ 59 + 148 - 155 + 138 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlIIIIlllIlIIl);
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIIIIIlIIIllIlIlllI) throws Exception {
        this.javaChannel().bind(lllllllllllllIIIIIIlIIIllIlIlllI);
        "".length();
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIIIIIIlIIIlIIllIllI) {
        return this.bindAddress(lllllllllllllIIIIIIlIIIlIIllIllI, this.newPromise());
    }
    
    public NioSctpChannel() {
        this(newSctpChannel());
    }
    
    @Override
    public Set<InetSocketAddress> allLocalAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIIIIIIlIIIllllIIlII = this.javaChannel().getAllLocalAddresses();
            final Set<InetSocketAddress> lllllllllllllIIIIIIlIIIllllIIIll = new LinkedHashSet<InetSocketAddress>(lllllllllllllIIIIIIlIIIllllIIlII.size());
            final Iterator lllllllllllllIIIIIIlIIIllllIIlIl = lllllllllllllIIIIIIlIIIllllIIlII.iterator();
            while (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIllllIIlIl.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIIIIIIlIIIllllIIllI = lllllllllllllIIIIIIlIIIllllIIlIl.next();
                lllllllllllllIIIIIIlIIIllllIIIll.add((InetSocketAddress)lllllllllllllIIIIIIlIIIllllIIllI);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return lllllllllllllIIIIIIlIIIllllIIIll;
        }
        catch (Throwable lllllllllllllIIIIIIlIIIllllIIIlI) {
            return Collections.emptySet();
        }
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    public NioSctpChannel(final Channel lllllllllllllIIIIIIlIIIlllllllll, final com.sun.nio.sctp.SctpChannel lllllllllllllIIIIIIlIIlIIIIIIIIl) {
        super(lllllllllllllIIIIIIlIIIlllllllll, lllllllllllllIIIIIIlIIlIIIIIIIIl, NioSctpChannel.lIllIIllllIIIl[1]);
        try {
            lllllllllllllIIIIIIlIIlIIIIIIIIl.configureBlocking((boolean)(NioSctpChannel.lIllIIllllIIIl[0] != 0));
            "".length();
            this.config = new NioSctpChannelConfig(this, lllllllllllllIIIIIIlIIlIIIIIIIIl);
            this.notificationHandler = new SctpNotificationHandler(this);
            "".length();
            if (((65 + 45 - 60 + 102 ^ 158 + 32 - 127 + 108) & (82 + 123 - 84 + 22 ^ 37 + 60 + 31 + 60 ^ -" ".length())) != 0x0) {
                throw null;
            }
        }
        catch (IOException lllllllllllllIIIIIIlIIlIIIIIIlII) {
            try {
                lllllllllllllIIIIIIlIIlIIIIIIIIl.close();
                "".length();
                if ((0x75 ^ 0x71) < " ".length()) {
                    throw null;
                }
            }
            catch (IOException lllllllllllllIIIIIIlIIlIIIIIIlIl) {
                if (lllllIllIIllIIl(NioSctpChannel.logger.isWarnEnabled() ? 1 : 0)) {
                    NioSctpChannel.logger.warn(NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[1]], lllllllllllllIIIIIIlIIlIIIIIIlIl);
                }
            }
            throw new ChannelException(NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[2]], lllllllllllllIIIIIIlIIlIIIIIIlII);
        }
    }
    
    @Override
    protected boolean doConnect(final SocketAddress lllllllllllllIIIIIIlIIIllIlIIIlI, final SocketAddress lllllllllllllIIIIIIlIIIllIlIIIIl) throws Exception {
        if (lllllIllIIllIlI(lllllllllllllIIIIIIlIIIllIlIIIIl)) {
            this.javaChannel().bind(lllllllllllllIIIIIIlIIIllIlIIIIl);
            "".length();
        }
        boolean lllllllllllllIIIIIIlIIIllIlIIIII = NioSctpChannel.lIllIIllllIIIl[0] != 0;
        try {
            final boolean lllllllllllllIIIIIIlIIIllIlIIlII = this.javaChannel().connect(lllllllllllllIIIIIIlIIIllIlIIIlI);
            if (lllllIllIIllIll(lllllllllllllIIIIIIlIIIllIlIIlII ? 1 : 0)) {
                this.selectionKey().interestOps(NioSctpChannel.lIllIIllllIIIl[3]);
                "".length();
            }
            lllllllllllllIIIIIIlIIIllIlIIIII = (NioSctpChannel.lIllIIllllIIIl[1] != 0);
            final double lllllllllllllIIIIIIlIIIllIIllIlI = lllllllllllllIIIIIIlIIIllIlIIlII ? 1 : 0;
            return lllllllllllllIIIIIIlIIIllIIllIlI != 0.0;
        }
        finally {
            if (lllllIllIIllIll(lllllllllllllIIIIIIlIIIllIlIIIII ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    private static String lllllIllIIlIllI(final String lllllllllllllIIIIIIlIIIIlllllIll, final String lllllllllllllIIIIIIlIIIIlllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlIIIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIIIIlllllIlI.getBytes(StandardCharsets.UTF_8)), NioSctpChannel.lIllIIllllIIIl[3]), "DES");
            final Cipher lllllllllllllIIIIIIlIIIIllllllIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlIIIIllllllIl.init(NioSctpChannel.lIllIIllllIIIl[2], lllllllllllllIIIIIIlIIIIlllllllI);
            return new String(lllllllllllllIIIIIIlIIIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlIIIIllllllII) {
            lllllllllllllIIIIIIlIIIIllllllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIllIIlIlll() {
        (lIllIIllllIIII = new String[NioSctpChannel.lIllIIllllIIIl[7]])[NioSctpChannel.lIllIIllllIIIl[0]] = lllllIllIIlIlIl("FBElBj82UDgFej0AKQR6M1A/CS4iUC8COzweKQZ0", "RpLjZ");
        NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[1]] = lllllIllIIlIllI("Wq14C0QIl5CSEOh1pIve6Sgw2rW+m4fCkul/IcSQfzgiPfQ0NtswyPi/f8FDZQehtbD2ntsfXEI=", "WFNyv");
        NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[2]] = lllllIllIIlIllI("rQc97YgOFuSsXG4HRM00NiSYmdA4mipaLwswjXbZDIzYcrWOOP2N4A==", "yozow");
        NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[5]] = lllllIllIIlIlIl("HyQRIgEaJRAjFA5qDzICGSsFMlEeMxIyS0o=", "jJbWq");
        NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[6]] = lllllIllIIlIllI("BCZOWSslAuVifuvTqi3Jog==", "cxViY");
    }
    
    private static boolean lllllIllIIllIIl(final int lllllllllllllIIIIIIlIIIIllIlIIII) {
        return lllllllllllllIIIIIIlIIIIllIlIIII != 0;
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIIIIIIlIIIllIllIllI = this.javaChannel().getRemoteAddresses().iterator();
            if (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIllIllIllI.hasNext() ? 1 : 0)) {
                return lllllllllllllIIIIIIlIIIllIllIllI.next();
            }
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    @Override
    public SctpServerChannel parent() {
        return (SctpServerChannel)super.parent();
    }
    
    private static com.sun.nio.sctp.SctpChannel newSctpChannel() {
        try {
            return com.sun.nio.sctp.SctpChannel.open();
        }
        catch (IOException lllllllllllllIIIIIIlIIlIIIIlIlIl) {
            throw new ChannelException(NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[0]], lllllllllllllIIIIIIlIIlIIIIlIlIl);
        }
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIIIIIIlIIIlIIlIIllI) {
        return this.unbindAddress(lllllllllllllIIIIIIlIIIlIIlIIllI, this.newPromise());
    }
    
    @Override
    protected SocketAddress localAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIIIIIIlIIIllIllllIl = this.javaChannel().getAllLocalAddresses().iterator();
            if (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIllIllllIl.hasNext() ? 1 : 0)) {
                return lllllllllllllIIIIIIlIIIllIllllIl.next();
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIIIIIIlIIIlIIIlllIl, final ChannelPromise lllllllllllllIIIIIIlIIIlIIIlllII) {
        if (lllllIllIIllIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.javaChannel().unbindAddress(lllllllllllllIIIIIIlIIIlIIIlllIl);
                "".length();
                lllllllllllllIIIIIIlIIIlIIIlllII.setSuccess();
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
                return lllllllllllllIIIIIIlIIIlIIIlllII;
            }
            catch (Throwable lllllllllllllIIIIIIlIIIlIIIlllll) {
                lllllllllllllIIIIIIlIIIlIIIlllII.setFailure(lllllllllllllIIIIIIlIIIlIIIlllll);
                "".length();
                "".length();
                if ((0x48 ^ 0x4C) < -" ".length()) {
                    return null;
                }
                return lllllllllllllIIIIIIlIIIlIIIlllII;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                NioSctpChannel.this.unbindAddress(lllllllllllllIIIIIIlIIIlIIIlllIl, lllllllllllllIIIIIIlIIIlIIIlllII);
                "".length();
            }
        });
        return lllllllllllllIIIIIIlIIIlIIIlllII;
    }
    
    @Override
    public boolean isActive() {
        final com.sun.nio.sctp.SctpChannel lllllllllllllIIIIIIlIIIlllIIIIlI = this.javaChannel();
        int n;
        if (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIlllIIIIlI.isOpen() ? 1 : 0) && lllllIllIIllIlI(this.association())) {
            n = NioSctpChannel.lIllIIllllIIIl[1];
            "".length();
            if (-(0x86 ^ 0x83) >= 0) {
                return ((0x59 ^ 0xC) & ~(0xE9 ^ 0xBC)) != 0x0;
            }
        }
        else {
            n = NioSctpChannel.lIllIIllllIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public SctpChannelConfig config() {
        return this.config;
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIIIIIIlIIIlIIlIllll, final ChannelPromise lllllllllllllIIIIIIlIIIlIIlIlIll) {
        if (lllllIllIIllIIl(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.javaChannel().bindAddress(lllllllllllllIIIIIIlIIIlIIlIllll);
                "".length();
                lllllllllllllIIIIIIlIIIlIIlIlIll.setSuccess();
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
                return lllllllllllllIIIIIIlIIIlIIlIlIll;
            }
            catch (Throwable lllllllllllllIIIIIIlIIIlIIllIIIl) {
                lllllllllllllIIIIIIlIIIlIIlIlIll.setFailure(lllllllllllllIIIIIIlIIIlIIllIIIl);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                return lllllllllllllIIIIIIlIIIlIIlIlIll;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                NioSctpChannel.this.bindAddress(lllllllllllllIIIIIIlIIIlIIlIllll, lllllllllllllIIIIIIlIIIlIIlIlIll);
                "".length();
            }
        });
        return lllllllllllllIIIIIIlIIIlIIlIlIll;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioSctpChannel.METADATA;
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    private static boolean lllllIllIIllIll(final int lllllllllllllIIIIIIlIIIIllIIlllI) {
        return lllllllllllllIIIIIIlIIIIllIIlllI == 0;
    }
    
    private static boolean lllllIllIIlllII(final Object lllllllllllllIIIIIIlIIIIllIlIIlI) {
        return lllllllllllllIIIIIIlIIIIllIlIIlI == null;
    }
    
    public NioSctpChannel(final com.sun.nio.sctp.SctpChannel lllllllllllllIIIIIIlIIlIIIIIlIll) {
        this(null, lllllllllllllIIIIIIlIIlIIIIIlIll);
    }
    
    private static boolean lllllIllIIllllI(final int lllllllllllllIIIIIIlIIIIllIIllII) {
        return lllllllllllllIIIIIIlIIIIllIIllII > 0;
    }
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIIIIIIlIIIlIlllIIll) throws Exception {
        final com.sun.nio.sctp.SctpChannel lllllllllllllIIIIIIlIIIlIllllIII = this.javaChannel();
        RecvByteBufAllocator.Handle lllllllllllllIIIIIIlIIIlIlllIlll = this.allocHandle;
        if (lllllIllIIlllII(lllllllllllllIIIIIIlIIIlIlllIlll)) {
            lllllllllllllIIIIIIlIIIlIlllIlll = (this.allocHandle = this.config().getRecvByteBufAllocator().newHandle());
        }
        final ByteBuf lllllllllllllIIIIIIlIIIlIlllIllI = lllllllllllllIIIIIIlIIIlIlllIlll.allocate(this.config().getAllocator());
        boolean lllllllllllllIIIIIIlIIIlIlllIlIl = NioSctpChannel.lIllIIllllIIIl[1] != 0;
        try {
            final ByteBuffer lllllllllllllIIIIIIlIIIllIIIIIII = lllllllllllllIIIIIIlIIIlIlllIllI.internalNioBuffer(lllllllllllllIIIIIIlIIIlIlllIllI.writerIndex(), lllllllllllllIIIIIIlIIIlIlllIllI.writableBytes());
            final int lllllllllllllIIIIIIlIIIlIlllllll = lllllllllllllIIIIIIlIIIllIIIIIII.position();
            final MessageInfo lllllllllllllIIIIIIlIIIlIllllllI = lllllllllllllIIIIIIlIIIlIllllIII.receive(lllllllllllllIIIIIIlIIIllIIIIIII, null, this.notificationHandler);
            if (lllllIllIIlllII(lllllllllllllIIIIIIlIIIlIllllllI)) {
                final double lllllllllllllIIIIIIlIIIlIllIlIll = NioSctpChannel.lIllIIllllIIIl[0];
                return (int)lllllllllllllIIIIIIlIIIlIllIlIll;
            }
            lllllllllllllIIIIIIlIIIlIlllIIll.add(new SctpMessage(lllllllllllllIIIIIIlIIIlIllllllI, lllllllllllllIIIIIIlIIIlIlllIllI.writerIndex(lllllllllllllIIIIIIlIIIlIlllIllI.writerIndex() + lllllllllllllIIIIIIlIIIllIIIIIII.position() - lllllllllllllIIIIIIlIIIlIlllllll)));
            "".length();
            lllllllllllllIIIIIIlIIIlIlllIlIl = (NioSctpChannel.lIllIIllllIIIl[0] != 0);
            final double lllllllllllllIIIIIIlIIIlIllIlIll = NioSctpChannel.lIllIIllllIIIl[1];
            return (int)lllllllllllllIIIIIIlIIIlIllIlIll;
        }
        catch (Throwable lllllllllllllIIIIIIlIIIlIlllllII) {
            PlatformDependent.throwException(lllllllllllllIIIIIIlIIIlIlllllII);
            return NioSctpChannel.lIllIIllllIIIl[4];
        }
        finally {
            final int lllllllllllllIIIIIIlIIIlIllllIll = lllllllllllllIIIIIIlIIIlIlllIllI.readableBytes();
            lllllllllllllIIIIIIlIIIlIlllIlll.record(lllllllllllllIIIIIIlIIIlIllllIll);
            if (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIlIlllIlIl ? 1 : 0)) {
                lllllllllllllIIIIIIlIIIlIlllIllI.release();
                "".length();
            }
        }
    }
    
    @Override
    protected boolean doWriteMessage(final Object lllllllllllllIIIIIIlIIIlIlIlIIII, final ChannelOutboundBuffer lllllllllllllIIIIIIlIIIlIlIllIlI) throws Exception {
        final SctpMessage lllllllllllllIIIIIIlIIIlIlIllIIl = (SctpMessage)lllllllllllllIIIIIIlIIIlIlIlIIII;
        ByteBuf lllllllllllllIIIIIIlIIIlIlIllIII = lllllllllllllIIIIIIlIIIlIlIllIIl.content();
        final int lllllllllllllIIIIIIlIIIlIlIlIlll = lllllllllllllIIIIIIlIIIlIlIllIII.readableBytes();
        if (lllllIllIIllIll(lllllllllllllIIIIIIlIIIlIlIlIlll)) {
            return NioSctpChannel.lIllIIllllIIIl[1] != 0;
        }
        final ByteBufAllocator lllllllllllllIIIIIIlIIIlIlIlIllI = this.alloc();
        int n;
        if (lllllIllIIlllIl(lllllllllllllIIIIIIlIIIlIlIllIII.nioBufferCount(), NioSctpChannel.lIllIIllllIIIl[1])) {
            n = NioSctpChannel.lIllIIllllIIIl[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0xD4 ^ 0x80) & ~(0x6D ^ 0x39)) != 0x0;
            }
        }
        else {
            n = NioSctpChannel.lIllIIllllIIIl[0];
        }
        boolean lllllllllllllIIIIIIlIIIlIlIlIlIl = n != 0;
        if (lllllIllIIllIll(lllllllllllllIIIIIIlIIIlIlIlIlIl ? 1 : 0) && lllllIllIIllIll(lllllllllllllIIIIIIlIIIlIlIllIII.isDirect() ? 1 : 0) && lllllIllIIllIIl(lllllllllllllIIIIIIlIIIlIlIlIllI.isDirectBufferPooled() ? 1 : 0)) {
            lllllllllllllIIIIIIlIIIlIlIlIlIl = (NioSctpChannel.lIllIIllllIIIl[1] != 0);
        }
        ByteBuffer lllllllllllllIIIIIIlIIIlIlIlIlII = null;
        if (lllllIllIIllIll(lllllllllllllIIIIIIlIIIlIlIlIlIl ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIIIlIIIlIlIlllIl = lllllllllllllIIIIIIlIIIlIlIllIII.nioBuffer();
            "".length();
            if (" ".length() == 0) {
                return ((0x53 ^ 0x30 ^ (0x68 ^ 0x48)) & (0xBC ^ 0xA6 ^ (0xD9 ^ 0x80) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIIIIIlIIIlIlIllIII = lllllllllllllIIIIIIlIIIlIlIlIllI.directBuffer(lllllllllllllIIIIIIlIIIlIlIlIlll).writeBytes(lllllllllllllIIIIIIlIIIlIlIllIII);
            lllllllllllllIIIIIIlIIIlIlIlIlII = lllllllllllllIIIIIIlIIIlIlIllIII.nioBuffer();
        }
        final MessageInfo lllllllllllllIIIIIIlIIIlIlIlIIll = MessageInfo.createOutgoing(this.association(), null, lllllllllllllIIIIIIlIIIlIlIllIIl.streamIdentifier());
        lllllllllllllIIIIIIlIIIlIlIlIIll.payloadProtocolID(lllllllllllllIIIIIIlIIIlIlIllIIl.protocolIdentifier());
        "".length();
        lllllllllllllIIIIIIlIIIlIlIlIIll.streamNumber(lllllllllllllIIIIIIlIIIlIlIllIIl.streamIdentifier());
        "".length();
        final int lllllllllllllIIIIIIlIIIlIlIlIIlI = this.javaChannel().send(lllllllllllllIIIIIIlIIIlIlIlIlII, lllllllllllllIIIIIIlIIIlIlIlIIll);
        int n2;
        if (lllllIllIIllllI(lllllllllllllIIIIIIlIIIlIlIlIIlI)) {
            n2 = NioSctpChannel.lIllIIllllIIIl[1];
            "".length();
            if ((0x22 ^ 0x39 ^ (0x24 ^ 0x3B)) == 0x0) {
                return ((0x60 ^ 0x1D ^ (0xD9 ^ 0x9E)) & (0xE5 ^ 0x90 ^ (0x68 ^ 0x27) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = NioSctpChannel.lIllIIllllIIIl[0];
        }
        return n2 != 0;
    }
    
    private static boolean lllllIllIlIIIII(final int lllllllllllllIIIIIIlIIIIllIlIlll, final int lllllllllllllIIIIIIlIIIIllIlIllI) {
        return lllllllllllllIIIIIIlIIIIllIlIlll < lllllllllllllIIIIIIlIIIIllIlIllI;
    }
    
    static {
        lllllIllIIllIII();
        lllllIllIIlIlll();
        METADATA = new ChannelMetadata((boolean)(NioSctpChannel.lIllIIllllIIIl[0] != 0));
        logger = InternalLoggerFactory.getInstance(NioSctpChannel.class);
    }
    
    @Override
    protected com.sun.nio.sctp.SctpChannel javaChannel() {
        return (com.sun.nio.sctp.SctpChannel)super.javaChannel();
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object lllllllllllllIIIIIIlIIIlIlIIIIII) throws Exception {
        if (!lllllIllIIllIIl((lllllllllllllIIIIIIlIIIlIlIIIIII instanceof SctpMessage) ? 1 : 0)) {
            throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[5]]).append(StringUtil.simpleClassName(lllllllllllllIIIIIIlIIIlIlIIIIII)).append(NioSctpChannel.lIllIIllllIIII[NioSctpChannel.lIllIIllllIIIl[6]]).append(StringUtil.simpleClassName(SctpMessage.class))));
        }
        final SctpMessage lllllllllllllIIIIIIlIIIlIlIIIIll = (SctpMessage)lllllllllllllIIIIIIlIIIlIlIIIIII;
        final ByteBuf lllllllllllllIIIIIIlIIIlIlIIIIlI = lllllllllllllIIIIIIlIIIlIlIIIIll.content();
        if (lllllIllIIllIIl(lllllllllllllIIIIIIlIIIlIlIIIIlI.isDirect() ? 1 : 0) && lllllIllIIlllll(lllllllllllllIIIIIIlIIIlIlIIIIlI.nioBufferCount(), NioSctpChannel.lIllIIllllIIIl[1])) {
            return lllllllllllllIIIIIIlIIIlIlIIIIll;
        }
        return new SctpMessage(lllllllllllllIIIIIIlIIIlIlIIIIll.protocolIdentifier(), lllllllllllllIIIIIIlIIIlIlIIIIll.streamIdentifier(), this.newDirectBuffer(lllllllllllllIIIIIIlIIIlIlIIIIll, lllllllllllllIIIIIIlIIIlIlIIIIlI));
    }
    
    private final class NioSctpChannelConfig extends DefaultSctpChannelConfig
    {
        private static final /* synthetic */ int[] lIIIIllllIIllI;
        
        private static void lIllllIlIIlIIll() {
            (lIIIIllllIIllI = new int[1])[0] = ((0x42 ^ 0x63) & ~(0x9A ^ 0xBB));
        }
        
        private NioSctpChannelConfig(final NioSctpChannel lllllllllllllIlIIIlllIlIlllIllII, final com.sun.nio.sctp.SctpChannel lllllllllllllIlIIIlllIlIlllIlIll) {
            super(lllllllllllllIlIIIlllIlIlllIllII, lllllllllllllIlIIIlllIlIlllIlIll);
        }
        
        static {
            lIllllIlIIlIIll();
        }
        
        @Override
        protected void autoReadCleared() {
            AbstractNioChannel.this.setReadPending((boolean)(NioSctpChannelConfig.lIIIIllllIIllI[0] != 0));
        }
    }
}
