// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp.oio;

import io.netty.channel.sctp.DefaultSctpChannelConfig;
import io.netty.channel.sctp.SctpServerChannel;
import io.netty.channel.ChannelPromise;
import com.sun.nio.sctp.Association;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.net.InetSocketAddress;
import io.netty.channel.ChannelFuture;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelException;
import java.io.IOException;
import io.netty.channel.sctp.SctpNotificationHandler;
import io.netty.channel.Channel;
import java.net.SocketAddress;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import com.sun.nio.sctp.MessageInfo;
import java.nio.ByteBuffer;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Set;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.sctp.SctpMessage;
import java.nio.channels.SelectionKey;
import java.util.List;
import com.sun.nio.sctp.NotificationHandler;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelMetadata;
import java.nio.channels.Selector;
import io.netty.channel.sctp.SctpChannelConfig;
import io.netty.channel.sctp.SctpChannel;
import io.netty.channel.oio.AbstractOioMessageChannel;

public class OioSctpChannel extends AbstractOioMessageChannel implements SctpChannel
{
    private final /* synthetic */ SctpChannelConfig config;
    private final /* synthetic */ Selector writeSelector;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ NotificationHandler<?> notificationHandler;
    private static final /* synthetic */ String[] lIIlIIIlIlllII;
    private static final /* synthetic */ int[] lIIlIIIlllllIl;
    private static final /* synthetic */ String EXPECTED_TYPE;
    private final /* synthetic */ Selector readSelector;
    private final /* synthetic */ Selector connectSelector;
    private final /* synthetic */ com.sun.nio.sctp.SctpChannel ch;
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIIlllIIIllIlIIIIIIl) throws Exception {
        if (llIIlIllllIIIlI(this.readSelector.isOpen() ? 1 : 0)) {
            return OioSctpChannel.lIIlIIIlllllIl[0];
        }
        int lllllllllllllIIlllIIIllIlIIIIIII = OioSctpChannel.lIIlIIIlllllIl[0];
        final int lllllllllllllIIlllIIIllIIlllllll = this.readSelector.select(1000L);
        int n;
        if (llIIlIllllIIIll(lllllllllllllIIlllIIIllIIlllllll)) {
            n = OioSctpChannel.lIIlIIIlllllIl[1];
            "".length();
            if ((0x85 ^ 0x81) <= 0) {
                return (0x85 ^ 0xC5) & ~(0x26 ^ 0x66);
            }
        }
        else {
            n = OioSctpChannel.lIIlIIIlllllIl[0];
        }
        final boolean lllllllllllllIIlllIIIllIIllllllI = n != 0;
        if (llIIlIllllIIIlI(lllllllllllllIIlllIIIllIIllllllI ? 1 : 0)) {
            return lllllllllllllIIlllIIIllIlIIIIIII;
        }
        final Set<SelectionKey> lllllllllllllIIlllIIIllIIlllllIl = this.readSelector.selectedKeys();
        try {
            final Iterator lllllllllllllIIlllIIIllIlIIIIIll = lllllllllllllIIlllIIIllIIlllllIl.iterator();
            while (llIIlIllllIIlII(lllllllllllllIIlllIIIllIlIIIIIll.hasNext() ? 1 : 0)) {
                final SelectionKey lllllllllllllIIlllIIIllIlIIIIlII = lllllllllllllIIlllIIIllIlIIIIIll.next();
                RecvByteBufAllocator.Handle lllllllllllllIIlllIIIllIlIIIIlll = this.allocHandle;
                if (llIIlIllllIIlIl(lllllllllllllIIlllIIIllIlIIIIlll)) {
                    lllllllllllllIIlllIIIllIlIIIIlll = (this.allocHandle = this.config().getRecvByteBufAllocator().newHandle());
                }
                final ByteBuf lllllllllllllIIlllIIIllIlIIIIllI = lllllllllllllIIlllIIIllIlIIIIlll.allocate(this.config().getAllocator());
                boolean lllllllllllllIIlllIIIllIlIIIIlIl = OioSctpChannel.lIIlIIIlllllIl[1] != 0;
                try {
                    final ByteBuffer lllllllllllllIIlllIIIllIlIIIllIl = lllllllllllllIIlllIIIllIlIIIIllI.nioBuffer(lllllllllllllIIlllIIIllIlIIIIllI.writerIndex(), lllllllllllllIIlllIIIllIlIIIIllI.writableBytes());
                    final MessageInfo lllllllllllllIIlllIIIllIlIIIllII = this.ch.receive(lllllllllllllIIlllIIIllIlIIIllIl, null, this.notificationHandler);
                    if (llIIlIllllIIlIl(lllllllllllllIIlllIIIllIlIIIllII)) {
                        final double lllllllllllllIIlllIIIllIIllIllll = lllllllllllllIIlllIIIllIlIIIIIII;
                        return (int)lllllllllllllIIlllIIIllIIllIllll;
                    }
                    lllllllllllllIIlllIIIllIlIIIllIl.flip();
                    "".length();
                    lllllllllllllIIlllIIIllIlIIIIIIl.add(new SctpMessage(lllllllllllllIIlllIIIllIlIIIllII, lllllllllllllIIlllIIIllIlIIIIllI.writerIndex(lllllllllllllIIlllIIIllIlIIIIllI.writerIndex() + lllllllllllllIIlllIIIllIlIIIllIl.remaining())));
                    "".length();
                    lllllllllllllIIlllIIIllIlIIIIlIl = (OioSctpChannel.lIIlIIIlllllIl[0] != 0);
                    ++lllllllllllllIIlllIIIllIlIIIIIII;
                    final int lllllllllllllIIlllIIIllIlIIIlIll = lllllllllllllIIlllIIIllIlIIIIllI.readableBytes();
                    lllllllllllllIIlllIIIllIlIIIIlll.record(lllllllllllllIIlllIIIllIlIIIlIll);
                    if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIlIIIIlIl ? 1 : 0)) {
                        lllllllllllllIIlllIIIllIlIIIIllI.release();
                        "".length();
                    }
                    "".length();
                    if (((0x84 ^ 0xC2) & ~(0x36 ^ 0x70)) < 0) {
                        return (0xE ^ 0x20) & ~(0x9E ^ 0xB0);
                    }
                }
                catch (Throwable lllllllllllllIIlllIIIllIlIIIlIlI) {
                    PlatformDependent.throwException(lllllllllllllIIlllIIIllIlIIIlIlI);
                    final int lllllllllllllIIlllIIIllIlIIIlIIl = lllllllllllllIIlllIIIllIlIIIIllI.readableBytes();
                    lllllllllllllIIlllIIIllIlIIIIlll.record(lllllllllllllIIlllIIIllIlIIIlIIl);
                    if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIlIIIIlIl ? 1 : 0)) {
                        lllllllllllllIIlllIIIllIlIIIIllI.release();
                        "".length();
                    }
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return (0xBD ^ 0x85 ^ (0x25 ^ 0x10)) & (0xD3 ^ 0xB0 ^ (0xD3 ^ 0xBD) ^ -" ".length());
                    }
                }
                finally {
                    final int lllllllllllllIIlllIIIllIlIIIlIII = lllllllllllllIIlllIIIllIlIIIIllI.readableBytes();
                    lllllllllllllIIlllIIIllIlIIIIlll.record(lllllllllllllIIlllIIIllIlIIIlIII);
                    if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIlIIIIlIl ? 1 : 0)) {
                        lllllllllllllIIlllIIIllIlIIIIllI.release();
                        "".length();
                    }
                }
                "".length();
                if (("   ".length() & ("   ".length() ^ -" ".length())) < ((0x6C ^ 0x76 ^ (0x0 ^ 0x5)) & (0x73 ^ 0x5D ^ (0xE ^ 0x3F) ^ -" ".length()))) {
                    return (24 + 120 - 82 + 91 ^ 61 + 56 + 13 + 8) & (199 + 22 - 80 + 69 ^ 4 + 125 - 47 + 111 ^ -" ".length());
                }
            }
            lllllllllllllIIlllIIIllIIlllllIl.clear();
            "".length();
            if ("   ".length() == 0) {
                return (0x8E ^ 0xAF ^ (0x7A ^ 0x4D)) & (48 + 58 - 98 + 123 ^ 134 + 68 - 83 + 30 ^ -" ".length());
            }
        }
        finally {
            lllllllllllllIIlllIIIllIIlllllIl.clear();
        }
        return lllllllllllllIIlllIIIllIlIIIIIII;
    }
    
    private static boolean llIIlIllllIIlll(final int lllllllllllllIIlllIIIlIlIIIlIlIl, final int lllllllllllllIIlllIIIlIlIIIlIlII) {
        return lllllllllllllIIlllIIIlIlIIIlIlIl != lllllllllllllIIlllIIIlIlIIIlIlII;
    }
    
    private static boolean llIIlIllllIlIIl(final int lllllllllllllIIlllIIIlIlIIIllIlI) {
        return lllllllllllllIIlllIIIlIlIIIllIlI >= 0;
    }
    
    static {
        llIIlIllllIIIIl();
        llIIlIllIIIllII();
        logger = InternalLoggerFactory.getInstance(OioSctpChannel.class);
        METADATA = new ChannelMetadata((boolean)(OioSctpChannel.lIIlIIIlllllIl[0] != 0));
        EXPECTED_TYPE = String.valueOf(new StringBuilder().append(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[11]]).append(StringUtil.simpleClassName(SctpMessage.class)).append((char)OioSctpChannel.lIIlIIIlllllIl[12]));
    }
    
    private static boolean llIIlIllllIIIlI(final int lllllllllllllIIlllIIIlIlIIIlllII) {
        return lllllllllllllIIlllIIIlIlIIIlllII == 0;
    }
    
    @Override
    protected void doConnect(final SocketAddress lllllllllllllIIlllIIIlIlllllIIlI, final SocketAddress lllllllllllllIIlllIIIlIlllllIIIl) throws Exception {
        if (llIIlIllllIlIII(lllllllllllllIIlllIIIlIlllllIIIl)) {
            this.ch.bind(lllllllllllllIIlllIIIlIlllllIIIl);
            "".length();
        }
        boolean lllllllllllllIIlllIIIlIlllllIlII = OioSctpChannel.lIIlIIIlllllIl[0] != 0;
        try {
            this.ch.connect(lllllllllllllIIlllIIIlIlllllIIlI);
            "".length();
            boolean lllllllllllllIIlllIIIlIllllllIII = OioSctpChannel.lIIlIIIlllllIl[0] != 0;
            while (llIIlIllllIIIlI(lllllllllllllIIlllIIIlIllllllIII ? 1 : 0)) {
                if (llIIlIllllIlIIl(this.connectSelector.select(1000L))) {
                    final Set<SelectionKey> lllllllllllllIIlllIIIlIllllllIIl = this.connectSelector.selectedKeys();
                    final Iterator lllllllllllllIIlllIIIlIllllllIlI = lllllllllllllIIlllIIIlIllllllIIl.iterator();
                    while (llIIlIllllIIlII(lllllllllllllIIlllIIIlIllllllIlI.hasNext() ? 1 : 0)) {
                        final SelectionKey lllllllllllllIIlllIIIlIllllllIll = lllllllllllllIIlllIIIlIllllllIlI.next();
                        if (llIIlIllllIIlII(lllllllllllllIIlllIIIlIllllllIll.isConnectable() ? 1 : 0)) {
                            lllllllllllllIIlllIIIlIllllllIIl.clear();
                            lllllllllllllIIlllIIIlIllllllIII = (OioSctpChannel.lIIlIIIlllllIl[1] != 0);
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            "".length();
                            if ("   ".length() < " ".length()) {
                                return;
                            }
                            continue;
                        }
                    }
                    lllllllllllllIIlllIIIlIllllllIIl.clear();
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    continue;
                }
            }
            lllllllllllllIIlllIIIlIlllllIlII = this.ch.finishConnect();
            if (llIIlIllllIIIlI(lllllllllllllIIlllIIIlIlllllIlII ? 1 : 0)) {
                this.doClose();
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
        }
        finally {
            if (llIIlIllllIIIlI(lllllllllllllIIlllIIIlIlllllIlII ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    public OioSctpChannel(final Channel lllllllllllllIIlllIIIllIlIlllIlI, final com.sun.nio.sctp.SctpChannel lllllllllllllIIlllIIIllIlIlllIIl) {
        super(lllllllllllllIIlllIIIllIlIlllIlI);
        this.ch = lllllllllllllIIlllIIIllIlIlllIIl;
        boolean lllllllllllllIIlllIIIllIlIlllIII = OioSctpChannel.lIIlIIIlllllIl[0] != 0;
        try {
            lllllllllllllIIlllIIIllIlIlllIIl.configureBlocking((boolean)(OioSctpChannel.lIIlIIIlllllIl[0] != 0));
            "".length();
            this.readSelector = Selector.open();
            this.writeSelector = Selector.open();
            this.connectSelector = Selector.open();
            lllllllllllllIIlllIIIllIlIlllIIl.register(this.readSelector, OioSctpChannel.lIIlIIIlllllIl[1]);
            "".length();
            lllllllllllllIIlllIIIllIlIlllIIl.register(this.writeSelector, OioSctpChannel.lIIlIIIlllllIl[2]);
            "".length();
            lllllllllllllIIlllIIIllIlIlllIIl.register(this.connectSelector, OioSctpChannel.lIIlIIIlllllIl[3]);
            "".length();
            this.config = new OioSctpChannelConfig(this, lllllllllllllIIlllIIIllIlIlllIIl);
            this.notificationHandler = new SctpNotificationHandler(this);
            lllllllllllllIIlllIIIllIlIlllIII = (OioSctpChannel.lIIlIIIlllllIl[1] != 0);
            if (llIIlIllllIIIlI(lllllllllllllIIlllIIIllIlIlllIII ? 1 : 0)) {
                try {
                    lllllllllllllIIlllIIIllIlIlllIIl.close();
                    "".length();
                    if ("  ".length() < 0) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIIlllIIIllIlIlllllI) {
                    OioSctpChannel.logger.warn(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[1]], lllllllllllllIIlllIIIllIlIlllllI);
                    "".length();
                    if (-(0x46 ^ 0x43) >= 0) {
                        throw null;
                    }
                }
            }
        }
        catch (Exception lllllllllllllIIlllIIIllIlIllllIl) {
            throw new ChannelException(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[4]], lllllllllllllIIlllIIIllIlIllllIl);
        }
        finally {
            if (llIIlIllllIIIlI(lllllllllllllIIlllIIIllIlIlllIII ? 1 : 0)) {
                try {
                    lllllllllllllIIlllIIIllIlIlllIIl.close();
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                }
                catch (IOException lllllllllllllIIlllIIIllIlIllllII) {
                    OioSctpChannel.logger.warn(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[5]], lllllllllllllIIlllIIIllIlIllllII);
                }
            }
        }
    }
    
    private static boolean llIIlIllllIlIII(final Object lllllllllllllIIlllIIIlIlIIlIIIlI) {
        return lllllllllllllIIlllIIIlIlIIlIIIlI != null;
    }
    
    private static void llIIlIllIIIllII() {
        (lIIlIIIlIlllII = new String[OioSctpChannel.lIIlIIIlllllIl[13]])[OioSctpChannel.lIIlIIIlllllIl[0]] = llIIlIllIIIlIIl("Id9e7VdiDd3wYyQRffUWT1PzhAawznVPbTE3b9SlTUU=", "kWpbL");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[1]] = llIIlIllIIIlIlI("wKceP0aG9K2zSTw1NGfHrck+lP2/0lLiNYmSYXz2hvQ=", "jGzYu");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[4]] = llIIlIllIIIlIll("Ihk5NhwgWCQ1WS0WOS4QJRQ5IBxkGXApGjAIcDkRJRY+PxU=", "DxPZy");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[5]] = llIIlIllIIIlIIl("+2VtCl7EqTo19J9TrbqWjNHgsl9uPOGvPBg8m5y17Ks=", "AUMkw");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[2]] = llIIlIllIIIlIlI("3ZQKox3LHNNKu7SkBqMgbcmJ3AkXn8fCopc+t99q9sY=", "OiQEE");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[7]] = llIIlIllIIIlIIl("P2xUXmvDCjE=", "eBSoL");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[8]] = llIIlIllIIIlIlI("sMk+XGm4w9o=", "BlIka");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[9]] = llIIlIllIIIlIll("BxUpBSQHDg==", "dzGkA");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[3]] = llIIlIllIIIlIlI("hlvdVJa1Sjin0lueVmuvYW26jFffD6kR", "MNQnB");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[10]] = llIIlIllIIIlIIl("SuspnHkpeSM/8QTSD6vvKg==", "ZLLnW");
        OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[11]] = llIIlIllIIIlIll("SWcQFigMLAELPFNv", "iOunX");
    }
    
    @Override
    protected SocketAddress localAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIIlllIIIllIIIllIllI = this.ch.getAllLocalAddresses().iterator();
            if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIIIllIllI.hasNext() ? 1 : 0)) {
                return lllllllllllllIIlllIIIllIIIllIllI.next();
            }
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    private static void closeSelector(final String lllllllllllllIIlllIIIlIllllIIIII, final Selector lllllllllllllIIlllIIIlIlllIlllIl) {
        try {
            lllllllllllllIIlllIIIlIlllIlllIl.close();
            "".length();
            if (((26 + 131 - 3 + 15 ^ 106 + 141 - 244 + 150) & (130 + 137 - 257 + 164 ^ 138 + 53 - 113 + 80 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIlllIIIlIllllIIIIl) {
            OioSctpChannel.logger.warn(String.valueOf(new StringBuilder().append(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[3]]).append(lllllllllllllIIlllIIIlIllllIIIII).append(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[10]])), lllllllllllllIIlllIIIlIllllIIIIl);
        }
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    private static String llIIlIllIIIlIll(String lllllllllllllIIlllIIIlIlIIllIlll, final String lllllllllllllIIlllIIIlIlIIllllII) {
        lllllllllllllIIlllIIIlIlIIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIlIlIIlllIlI = new StringBuilder();
        final char[] lllllllllllllIIlllIIIlIlIIlllIIl = lllllllllllllIIlllIIIlIlIIllllII.toCharArray();
        int lllllllllllllIIlllIIIlIlIIlllIII = OioSctpChannel.lIIlIIIlllllIl[0];
        final char lllllllllllllIIlllIIIlIlIIlIllll = (Object)lllllllllllllIIlllIIIlIlIIllIlll.toCharArray();
        final Exception lllllllllllllIIlllIIIlIlIIlIlllI = (Exception)lllllllllllllIIlllIIIlIlIIlIllll.length;
        long lllllllllllllIIlllIIIlIlIIlIllIl = OioSctpChannel.lIIlIIIlllllIl[0];
        while (llIIlIllllIlIlI((int)lllllllllllllIIlllIIIlIlIIlIllIl, (int)lllllllllllllIIlllIIIlIlIIlIlllI)) {
            final char lllllllllllllIIlllIIIlIlIIlllllI = lllllllllllllIIlllIIIlIlIIlIllll[lllllllllllllIIlllIIIlIlIIlIllIl];
            lllllllllllllIIlllIIIlIlIIlllIlI.append((char)(lllllllllllllIIlllIIIlIlIIlllllI ^ lllllllllllllIIlllIIIlIlIIlllIIl[lllllllllllllIIlllIIIlIlIIlllIII % lllllllllllllIIlllIIIlIlIIlllIIl.length]));
            "".length();
            ++lllllllllllllIIlllIIIlIlIIlllIII;
            ++lllllllllllllIIlllIIIlIlIIlIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIlIlIIlllIlI);
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIIlllIIIlIllIllIlll) {
        return this.unbindAddress(lllllllllllllIIlllIIIlIllIllIlll, this.newPromise());
    }
    
    @Override
    public Set<InetSocketAddress> allRemoteAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIIlllIIIllIIIIlIIll = this.ch.getRemoteAddresses();
            final Set<InetSocketAddress> lllllllllllllIIlllIIIllIIIIlIIlI = new LinkedHashSet<InetSocketAddress>(lllllllllllllIIlllIIIllIIIIlIIll.size());
            final Iterator lllllllllllllIIlllIIIllIIIIlIlII = lllllllllllllIIlllIIIllIIIIlIIll.iterator();
            while (llIIlIllllIIlII(lllllllllllllIIlllIIIllIIIIlIlII.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIIlllIIIllIIIIlIlIl = lllllllllllllIIlllIIIllIIIIlIlII.next();
                lllllllllllllIIlllIIIllIIIIlIIlI.add((InetSocketAddress)lllllllllllllIIlllIIIllIIIIlIlIl);
                "".length();
                "".length();
                if (((0x28 ^ 0x9) & ~(0x5E ^ 0x7F)) < -" ".length()) {
                    return null;
                }
            }
            return lllllllllllllIIlllIIIllIIIIlIIlI;
        }
        catch (Throwable lllllllllllllIIlllIIIllIIIIlIIIl) {
            return Collections.emptySet();
        }
    }
    
    private static void llIIlIllllIIIIl() {
        (lIIlIIIlllllIl = new int[14])[0] = (" ".length() & ~" ".length());
        OioSctpChannel.lIIlIIIlllllIl[1] = " ".length();
        OioSctpChannel.lIIlIIIlllllIl[2] = (0x16 ^ 0xF ^ (0x7B ^ 0x66));
        OioSctpChannel.lIIlIIIlllllIl[3] = (0x23 ^ 0x8 ^ (0x8B ^ 0xA8));
        OioSctpChannel.lIIlIIIlllllIl[4] = "  ".length();
        OioSctpChannel.lIIlIIIlllllIl[5] = "   ".length();
        OioSctpChannel.lIIlIIIlllllIl[6] = -" ".length();
        OioSctpChannel.lIIlIIIlllllIl[7] = (0x77 ^ 0x72);
        OioSctpChannel.lIIlIIIlllllIl[8] = (0x2 ^ 0x4);
        OioSctpChannel.lIIlIIIlllllIl[9] = (0x9E ^ 0xA3 ^ (0x8A ^ 0xB0));
        OioSctpChannel.lIIlIIIlllllIl[10] = (0x47 ^ 0x7F ^ (0x21 ^ 0x10));
        OioSctpChannel.lIIlIIIlllllIl[11] = (0x48 ^ 0x42);
        OioSctpChannel.lIIlIIIlllllIl[12] = (0x86 ^ 0xAF);
        OioSctpChannel.lIIlIIIlllllIl[13] = (0x55 ^ 0x5E);
    }
    
    private static boolean llIIlIllllIIllI(final int lllllllllllllIIlllIIIlIlIIlIlIIl, final int lllllllllllllIIlllIIIlIlIIlIlIII) {
        return lllllllllllllIIlllIIIlIlIIlIlIIl == lllllllllllllIIlllIIIlIlIIlIlIII;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIlllIIIllIIlIlIlII) throws Exception {
        if (llIIlIllllIIIlI(this.writeSelector.isOpen() ? 1 : 0)) {
            return;
        }
        final int lllllllllllllIIlllIIIllIIlIlIIll = lllllllllllllIIlllIIIllIIlIlIlII.size();
        final int lllllllllllllIIlllIIIllIIlIlIIlI = this.writeSelector.select(1000L);
        if (!llIIlIllllIIIll(lllllllllllllIIlllIIIllIIlIlIIlI)) {
            return;
        }
        final Set<SelectionKey> lllllllllllllIIlllIIIllIIlIllIII = this.writeSelector.selectedKeys();
        if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIIlIllIII.isEmpty() ? 1 : 0)) {
            return;
        }
        final Iterator<SelectionKey> lllllllllllllIIlllIIIllIIlIlIlll = lllllllllllllIIlllIIIllIIlIllIII.iterator();
        int lllllllllllllIIlllIIIllIIlIlIllI = OioSctpChannel.lIIlIIIlllllIl[0];
        while (!llIIlIllllIIllI(lllllllllllllIIlllIIIllIIlIlIllI, lllllllllllllIIlllIIIllIIlIlIIll)) {
            lllllllllllllIIlllIIIllIIlIlIlll.next();
            "".length();
            lllllllllllllIIlllIIIllIIlIlIlll.remove();
            final SctpMessage lllllllllllllIIlllIIIllIIlIlllIl = (SctpMessage)lllllllllllllIIlllIIIllIIlIlIlII.current();
            if (llIIlIllllIIlIl(lllllllllllllIIlllIIIllIIlIlllIl)) {
                return;
            }
            final ByteBuf lllllllllllllIIlllIIIllIIlIlllII = lllllllllllllIIlllIIIllIIlIlllIl.content();
            final int lllllllllllllIIlllIIIllIIlIllIll = lllllllllllllIIlllIIIllIIlIlllII.readableBytes();
            ByteBuffer lllllllllllllIIlllIIIllIIlIllIlI = null;
            if (llIIlIllllIIlll(lllllllllllllIIlllIIIllIIlIlllII.nioBufferCount(), OioSctpChannel.lIIlIIIlllllIl[6])) {
                final ByteBuffer lllllllllllllIIlllIIIllIIlIllllI = lllllllllllllIIlllIIIllIIlIlllII.nioBuffer();
                "".length();
                if (((0x3B ^ 0x2D) & ~(0x41 ^ 0x57)) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIIIllIIlIllIlI = ByteBuffer.allocate(lllllllllllllIIlllIIIllIIlIllIll);
                lllllllllllllIIlllIIIllIIlIlllII.getBytes(lllllllllllllIIlllIIIllIIlIlllII.readerIndex(), lllllllllllllIIlllIIIllIIlIllIlI);
                "".length();
                lllllllllllllIIlllIIIllIIlIllIlI.flip();
                "".length();
            }
            final MessageInfo lllllllllllllIIlllIIIllIIlIllIIl = MessageInfo.createOutgoing(this.association(), null, lllllllllllllIIlllIIIllIIlIlllIl.streamIdentifier());
            lllllllllllllIIlllIIIllIIlIllIIl.payloadProtocolID(lllllllllllllIIlllIIIllIIlIlllIl.protocolIdentifier());
            "".length();
            lllllllllllllIIlllIIIllIIlIllIIl.streamNumber(lllllllllllllIIlllIIIllIIlIlllIl.streamIdentifier());
            "".length();
            this.ch.send(lllllllllllllIIlllIIIllIIlIllIlI, lllllllllllllIIlllIIIllIIlIllIIl);
            "".length();
            ++lllllllllllllIIlllIIIllIIlIlIllI;
            lllllllllllllIIlllIIIllIIlIlIlII.remove();
            "".length();
            if (llIIlIllllIIIlI(lllllllllllllIIlllIIIllIIlIlIlll.hasNext() ? 1 : 0)) {
                return;
            }
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
    }
    
    @Override
    protected void doClose() throws Exception {
        closeSelector(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[7]], this.readSelector);
        closeSelector(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[8]], this.writeSelector);
        closeSelector(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[9]], this.connectSelector);
        this.ch.close();
    }
    
    private static String llIIlIllIIIlIlI(final String lllllllllllllIIlllIIIlIlIllIllIl, final String lllllllllllllIIlllIIIlIlIllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIlIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIlIllIllII.getBytes(StandardCharsets.UTF_8)), OioSctpChannel.lIIlIIIlllllIl[3]), "DES");
            final Cipher lllllllllllllIIlllIIIlIlIlllIIIl = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIlIlIlllIIIl.init(OioSctpChannel.lIIlIIIlllllIl[4], lllllllllllllIIlllIIIlIlIlllIIll);
            return new String(lllllllllllllIIlllIIIlIlIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIlIlIlllIIII) {
            lllllllllllllIIlllIIIlIlIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIllllIIlIl(final Object lllllllllllllIIlllIIIlIlIIlIIIII) {
        return lllllllllllllIIlllIIIlIlIIlIIIII == null;
    }
    
    @Override
    public SctpChannelConfig config() {
        return this.config;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIlllIIIllIIIIIIlIl) throws Exception {
        this.ch.bind(lllllllllllllIIlllIIIllIIIIIIlIl);
        "".length();
    }
    
    private static String llIIlIllIIIlIIl(final String lllllllllllllIIlllIIIlIlIlIllIll, final String lllllllllllllIIlllIIIlIlIlIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIlIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIlIlIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIlIlIlIlllIl.init(OioSctpChannel.lIIlIIIlllllIl[4], lllllllllllllIIlllIIIlIlIlIlllll);
            return new String(lllllllllllllIIlllIIIlIlIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIlIlIlIlllII) {
            lllllllllllllIIlllIIIlIlIlIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIllllIIlII(final int lllllllllllllIIlllIIIlIlIIIllllI) {
        return lllllllllllllIIlllIIIlIlIIIllllI != 0;
    }
    
    @Override
    public boolean isOpen() {
        return this.ch.isOpen();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        try {
            final Iterator<SocketAddress> lllllllllllllIIlllIIIllIIIIlllll = this.ch.getRemoteAddresses().iterator();
            if (llIIlIllllIIlII(lllllllllllllIIlllIIIllIIIIlllll.hasNext() ? 1 : 0)) {
                return lllllllllllllIIlllIIIllIIIIlllll.next();
            }
            "".length();
            if ((0x99 ^ 0x9D) != (0x8F ^ 0x8B)) {
                return null;
            }
        }
        catch (IOException ex) {}
        return null;
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIIlllIIIlIlllIlIllI) {
        return this.bindAddress(lllllllllllllIIlllIIIlIlllIlIllI, this.newPromise());
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (llIIlIllllIIlII(this.isOpen() ? 1 : 0) && llIIlIllllIlIII(this.association())) {
            n = OioSctpChannel.lIIlIIIlllllIl[1];
            "".length();
            if (-(0xBE ^ 0xBA) > 0) {
                return ((0x1A ^ 0x2A) & ~(0x62 ^ 0x52)) != 0x0;
            }
        }
        else {
            n = OioSctpChannel.lIIlIIIlllllIl[0];
        }
        return n != 0;
    }
    
    public OioSctpChannel() {
        this(openChannel());
    }
    
    @Override
    public Association association() {
        try {
            return this.ch.association();
        }
        catch (IOException lllllllllllllIIlllIIIllIIIllllll) {
            return null;
        }
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIIlllIIIllIIlIIIIll) throws Exception {
        if (llIIlIllllIIlII((lllllllllllllIIlllIIIllIIlIIIIll instanceof SctpMessage) ? 1 : 0)) {
            return lllllllllllllIIlllIIIllIIlIIIIll;
        }
        throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[2]]).append(StringUtil.simpleClassName(lllllllllllllIIlllIIIllIIlIIIIll)).append(OioSctpChannel.EXPECTED_TYPE)));
    }
    
    private static boolean llIIlIllllIIIll(final int lllllllllllllIIlllIIIlIlIIIllIII) {
        return lllllllllllllIIlllIIIlIlIIIllIII > 0;
    }
    
    private static boolean llIIlIllllIlIlI(final int lllllllllllllIIlllIIIlIlIIlIIlIl, final int lllllllllllllIIlllIIIlIlIIlIIlII) {
        return lllllllllllllIIlllIIIlIlIIlIIlIl < lllllllllllllIIlllIIIlIlIIlIIlII;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return OioSctpChannel.METADATA;
    }
    
    public OioSctpChannel(final com.sun.nio.sctp.SctpChannel lllllllllllllIIlllIIIllIllIIIllI) {
        this(null, lllllllllllllIIlllIIIllIllIIIllI);
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    public Set<InetSocketAddress> allLocalAddresses() {
        try {
            final Set<SocketAddress> lllllllllllllIIlllIIIllIIIlIlIlI = this.ch.getAllLocalAddresses();
            final Set<InetSocketAddress> lllllllllllllIIlllIIIllIIIlIlIIl = new LinkedHashSet<InetSocketAddress>(lllllllllllllIIlllIIIllIIIlIlIlI.size());
            final Iterator lllllllllllllIIlllIIIllIIIlIlIll = lllllllllllllIIlllIIIllIIIlIlIlI.iterator();
            while (llIIlIllllIIlII(lllllllllllllIIlllIIIllIIIlIlIll.hasNext() ? 1 : 0)) {
                final SocketAddress lllllllllllllIIlllIIIllIIIlIllII = lllllllllllllIIlllIIIllIIIlIlIll.next();
                lllllllllllllIIlllIIIllIIIlIlIIl.add((InetSocketAddress)lllllllllllllIIlllIIIllIIIlIllII);
                "".length();
                "".length();
                if (((0x66 ^ 0x3C) & ~(0x9E ^ 0xC4)) < -" ".length()) {
                    return null;
                }
            }
            return lllllllllllllIIlllIIIllIIIlIlIIl;
        }
        catch (Throwable lllllllllllllIIlllIIIllIIIlIlIII) {
            return Collections.emptySet();
        }
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    public ChannelFuture bindAddress(final InetAddress lllllllllllllIIlllIIIlIlllIIIlIl, final ChannelPromise lllllllllllllIIlllIIIlIlllIIIlll) {
        if (llIIlIllllIIlII(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.ch.bindAddress(lllllllllllllIIlllIIIlIlllIIIlIl);
                "".length();
                lllllllllllllIIlllIIIlIlllIIIlll.setSuccess();
                "".length();
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
                return lllllllllllllIIlllIIIlIlllIIIlll;
            }
            catch (Throwable lllllllllllllIIlllIIIlIlllIIllII) {
                lllllllllllllIIlllIIIlIlllIIIlll.setFailure(lllllllllllllIIlllIIIlIlllIIllII);
                "".length();
                "".length();
                if ((0xC ^ 0x52 ^ (0x22 ^ 0x78)) <= "  ".length()) {
                    return null;
                }
                return lllllllllllllIIlllIIIlIlllIIIlll;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                OioSctpChannel.this.bindAddress(lllllllllllllIIlllIIIlIlllIIIlIl, lllllllllllllIIlllIIIlIlllIIIlll);
                "".length();
            }
        });
        return lllllllllllllIIlllIIIlIlllIIIlll;
    }
    
    private static com.sun.nio.sctp.SctpChannel openChannel() {
        try {
            return com.sun.nio.sctp.SctpChannel.open();
        }
        catch (IOException lllllllllllllIIlllIIIllIllIlIIII) {
            throw new ChannelException(OioSctpChannel.lIIlIIIlIlllII[OioSctpChannel.lIIlIIIlllllIl[0]], lllllllllllllIIlllIIIllIllIlIIII);
        }
    }
    
    @Override
    public SctpServerChannel parent() {
        return (SctpServerChannel)super.parent();
    }
    
    @Override
    public ChannelFuture unbindAddress(final InetAddress lllllllllllllIIlllIIIlIllIlIlIIl, final ChannelPromise lllllllllllllIIlllIIIlIllIlIIIll) {
        if (llIIlIllllIIlII(this.eventLoop().inEventLoop() ? 1 : 0)) {
            try {
                this.ch.unbindAddress(lllllllllllllIIlllIIIlIllIlIlIIl);
                "".length();
                lllllllllllllIIlllIIIlIllIlIIIll.setSuccess();
                "".length();
                "".length();
                if (" ".length() > (0x9B ^ 0x9F)) {
                    return null;
                }
                return lllllllllllllIIlllIIIlIllIlIIIll;
            }
            catch (Throwable lllllllllllllIIlllIIIlIllIlIlIll) {
                lllllllllllllIIlllIIIlIllIlIIIll.setFailure(lllllllllllllIIlllIIIlIllIlIlIll);
                "".length();
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
                return lllllllllllllIIlllIIIlIllIlIIIll;
            }
        }
        this.eventLoop().execute(new Runnable() {
            @Override
            public void run() {
                OioSctpChannel.this.unbindAddress(lllllllllllllIIlllIIIlIllIlIlIIl, lllllllllllllIIlllIIIlIllIlIIIll);
                "".length();
            }
        });
        return lllllllllllllIIlllIIIlIllIlIIIll;
    }
    
    private final class OioSctpChannelConfig extends DefaultSctpChannelConfig
    {
        private static final /* synthetic */ int[] llIIIlIlIIIIll;
        
        private OioSctpChannelConfig(final OioSctpChannel llllllllllllIlllIlIlllIlIlIlIlIl, final com.sun.nio.sctp.SctpChannel llllllllllllIlllIlIlllIlIlIllIII) {
            super(llllllllllllIlllIlIlllIlIlIlIlIl, llllllllllllIlllIlIlllIlIlIllIII);
        }
        
        private static void lIIIlIIlIIllIlIl() {
            (llIIIlIlIIIIll = new int[1])[0] = ((0x16 ^ 0x4 ^ (0x4F ^ 0x11)) & (33 + 35 + 141 + 24 ^ 103 + 111 - 92 + 43 ^ -" ".length()));
        }
        
        static {
            lIIIlIIlIIllIlIl();
        }
        
        @Override
        protected void autoReadCleared() {
            AbstractOioChannel.this.setReadPending((boolean)(OioSctpChannelConfig.llIIIlIlIIIIll[0] != 0));
        }
    }
}
