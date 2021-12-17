// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import com.barchart.udt.nio.ChannelUDT;
import io.netty.channel.udt.DefaultUdtChannelConfig;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.StringUtil;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.util.List;
import java.net.SocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.udt.UdtMessage;
import io.netty.channel.ChannelOutboundBuffer;
import java.nio.channels.SelectableChannel;
import java.net.InetSocketAddress;
import com.barchart.udt.TypeUDT;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;
import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.udt.UdtChannelConfig;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.udt.UdtChannel;
import io.netty.channel.nio.AbstractNioMessageChannel;

public class NioUdtMessageConnectorChannel extends AbstractNioMessageChannel implements UdtChannel
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String EXPECTED_TYPE;
    private final /* synthetic */ UdtChannelConfig config;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String[] lllIlIIIllIIIl;
    private static final /* synthetic */ int[] lllIlIIIllIIlI;
    
    @Override
    public ChannelMetadata metadata() {
        return NioUdtMessageConnectorChannel.METADATA;
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        if (!lIlIIIIlllIIIlll(this.javaChannel().finishConnect() ? 1 : 0)) {
            throw new Error(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[4]]);
        }
        this.selectionKey().interestOps(this.selectionKey().interestOps() & NioUdtMessageConnectorChannel.lllIlIIIllIIlI[3]);
        "".length();
        "".length();
        if (((0xA ^ 0x42 ^ (0x19 ^ 0x11)) & (0x6A ^ 0x3E ^ (0xF ^ 0x1B) ^ -" ".length())) != 0x0) {
            return;
        }
    }
    
    @Override
    public UdtChannelConfig config() {
        return this.config;
    }
    
    private static boolean lIlIIIIlllIIlIlI(final int llllllllllllIlIlllIIlIIIIIIllIll) {
        return llllllllllllIlIlllIIlIIIIIIllIll <= 0;
    }
    
    public NioUdtMessageConnectorChannel(final SocketChannelUDT llllllllllllIlIlllIIlIIIllIIlIlI) {
        this(null, llllllllllllIlIlllIIlIIIllIIlIlI);
    }
    
    protected SocketChannelUDT javaChannel() {
        return (SocketChannelUDT)super.javaChannel();
    }
    
    private static String lIlIIIIlllIIIlII(final String llllllllllllIlIlllIIlIIIIIllIIlI, final String llllllllllllIlIlllIIlIIIIIllIIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIlIIIIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8)), NioUdtMessageConnectorChannel.lllIlIIIllIIlI[2]), "DES");
            final Cipher llllllllllllIlIlllIIlIIIIIllIllI = Cipher.getInstance("DES");
            llllllllllllIlIlllIIlIIIIIllIllI.init(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[4], llllllllllllIlIlllIIlIIIIIllIlll);
            return new String(llllllllllllIlIlllIIlIIIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIlIIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIlIIIIIllIlIl) {
            llllllllllllIlIlllIIlIIIIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIlllIIlIII(final Object llllllllllllIlIlllIIlIIIIIlIIIIl) {
        return llllllllllllIlIlllIIlIIIIIlIIIIl != null;
    }
    
    private static boolean lIlIIIIlllIIlllI(final int llllllllllllIlIlllIIlIIIIIIllIIl) {
        return llllllllllllIlIlllIIlIIIIIIllIIl > 0;
    }
    
    public NioUdtMessageConnectorChannel() {
        this(TypeUDT.DATAGRAM);
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    protected boolean doWriteMessage(final Object llllllllllllIlIlllIIlIIIlIIIIlIl, final ChannelOutboundBuffer llllllllllllIlIlllIIlIIIlIIIIlII) throws Exception {
        final UdtMessage llllllllllllIlIlllIIlIIIlIIIIIll = (UdtMessage)llllllllllllIlIlllIIlIIIlIIIIlIl;
        final ByteBuf llllllllllllIlIlllIIlIIIlIIIIIlI = llllllllllllIlIlllIIlIIIlIIIIIll.content();
        final int llllllllllllIlIlllIIlIIIlIIIIIIl = llllllllllllIlIlllIIlIIIlIIIIIlI.readableBytes();
        long llllllllllllIlIlllIIlIIIlIIIIIII = 0L;
        if (lIlIIIIlllIIllIl(llllllllllllIlIlllIIlIIIlIIIIIlI.nioBufferCount(), NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0])) {
            final long llllllllllllIlIlllIIlIIIlIIIIlll = this.javaChannel().write(llllllllllllIlIlllIIlIIIlIIIIIlI.nioBuffer());
            "".length();
            if (null != null) {
                return ((0x1B ^ 0x4E) & ~(0x21 ^ 0x74)) != 0x0;
            }
        }
        else {
            llllllllllllIlIlllIIlIIIlIIIIIII = this.javaChannel().write(llllllllllllIlIlllIIlIIIlIIIIIlI.nioBuffers());
        }
        if (lIlIIIIlllIIlIlI(lIlIIIIlllIIllII(llllllllllllIlIlllIIlIIIlIIIIIII, 0L)) && lIlIIIIlllIIlllI(llllllllllllIlIlllIIlIIIlIIIIIIl)) {
            return NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] != 0;
        }
        if (lIlIIIIlllIIIlll(lIlIIIIlllIIllII(llllllllllllIlIlllIIlIIIlIIIIIII, llllllllllllIlIlllIIlIIIlIIIIIIl))) {
            throw new Error(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[6]]);
        }
        return NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0] != 0;
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIlIlllIIlIIIlIlllIIl) throws Exception {
        this.javaChannel().bind(llllllllllllIlIlllIIlIIIlIlllIIl);
        "".length();
    }
    
    private static void lIlIIIIlllIIIllI() {
        (lllIlIIIllIIlI = new int[11])[0] = " ".length();
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] = ((0x78 ^ 0x7F) & ~(0x17 ^ 0x10));
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[2] = (0xE5 ^ 0xC1 ^ (0x7B ^ 0x57));
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[3] = -(52 + 179 - 111 + 86 ^ 89 + 39 + 4 + 67);
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[4] = "  ".length();
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[5] = "   ".length();
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[6] = (0xCB ^ 0x8B ^ (0x52 ^ 0x16));
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[7] = (0x5E ^ 0x5B);
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[8] = (0x7F ^ 0x79);
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[9] = (0x8A ^ 0xA3);
        NioUdtMessageConnectorChannel.lllIlIIIllIIlI[10] = (0xF5 ^ 0x9A ^ (0x7D ^ 0x15));
    }
    
    private static boolean lIlIIIIlllIIlIll(final int llllllllllllIlIlllIIlIIIIIlIlIII, final int llllllllllllIlIlllIIlIIIIIlIIlll) {
        return llllllllllllIlIlllIIlIIIIIlIlIII >= llllllllllllIlIlllIIlIIIIIlIIlll;
    }
    
    @Override
    protected int doReadMessages(final List<Object> llllllllllllIlIlllIIlIIIlIIlIIIl) throws Exception {
        final int llllllllllllIlIlllIIlIIIlIIlIlIl = this.config.getReceiveBufferSize();
        final ByteBuf llllllllllllIlIlllIIlIIIlIIlIlII = this.config.getAllocator().directBuffer(llllllllllllIlIlllIIlIIIlIIlIlIl);
        final int llllllllllllIlIlllIIlIIIlIIlIIll = llllllllllllIlIlllIIlIIIlIIlIlII.writeBytes((ScatteringByteChannel)this.javaChannel(), llllllllllllIlIlllIIlIIIlIIlIlIl);
        if (lIlIIIIlllIIlIlI(llllllllllllIlIlllIIlIIIlIIlIIll)) {
            llllllllllllIlIlllIIlIIIlIIlIlII.release();
            "".length();
            return NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1];
        }
        if (lIlIIIIlllIIlIll(llllllllllllIlIlllIIlIIIlIIlIIll, llllllllllllIlIlllIIlIIIlIIlIlIl)) {
            this.javaChannel().close();
            throw new ChannelException(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[5]]);
        }
        llllllllllllIlIlllIIlIIIlIIlIIIl.add(new UdtMessage(llllllllllllIlIlllIIlIIIlIIlIlII));
        "".length();
        return NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0];
    }
    
    private static boolean lIlIIIIlllIIIlll(final int llllllllllllIlIlllIIlIIIIIIlllll) {
        return llllllllllllIlIlllIIlIIIIIIlllll != 0;
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.javaChannel().socket().getRemoteSocketAddress();
    }
    
    @Override
    protected boolean doConnect(final SocketAddress llllllllllllIlIlllIIlIIIlIlIlIII, final SocketAddress llllllllllllIlIlllIIlIIIlIlIIlll) throws Exception {
        SocketAddress llllllllllllIlIlllIIlIIIlIlllIIl;
        if (lIlIIIIlllIIlIII(llllllllllllIlIlllIIlIIIlIlIIlll)) {
            llllllllllllIlIlllIIlIIIlIlllIIl = llllllllllllIlIlllIIlIIIlIlIIlll;
            "".length();
            if (null != null) {
                return ((44 + 81 - 52 + 107 ^ 16 + 95 - 54 + 88) & (0xC7 ^ 0xC3 ^ (0x95 ^ 0xB4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIlIlllIIlIIIlIlllIIl = new InetSocketAddress(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1]);
        }
        this.doBind(llllllllllllIlIlllIIlIIIlIlllIIl);
        boolean llllllllllllIlIlllIIlIIIlIlIlIlI = NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] != 0;
        try {
            final boolean llllllllllllIlIlllIIlIIIlIlIlllI = this.javaChannel().connect(llllllllllllIlIlllIIlIIIlIlIlIII);
            if (lIlIIIIlllIIlIIl(llllllllllllIlIlllIIlIIIlIlIlllI ? 1 : 0)) {
                this.selectionKey().interestOps(this.selectionKey().interestOps() | NioUdtMessageConnectorChannel.lllIlIIIllIIlI[2]);
                "".length();
            }
            llllllllllllIlIlllIIlIIIlIlIlIlI = (NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0] != 0);
            final double llllllllllllIlIlllIIlIIIlIlIIlII = llllllllllllIlIlllIIlIIIlIlIlllI ? 1 : 0;
            return llllllllllllIlIlllIIlIIIlIlIIlII != 0.0;
        }
        finally {
            if (lIlIIIIlllIIlIIl(llllllllllllIlIlllIIlIIIlIlIlIlI ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    private static boolean lIlIIIIlllIIllll(final int llllllllllllIlIlllIIlIIIIIlIIlII, final int llllllllllllIlIlllIIlIIIIIlIIIll) {
        return llllllllllllIlIlllIIlIIIIIlIIlII < llllllllllllIlIlllIIlIIIIIlIIIll;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.javaChannel().socket().getLocalSocketAddress();
    }
    
    private static boolean lIlIIIIlllIIlIIl(final int llllllllllllIlIlllIIlIIIIIIlllIl) {
        return llllllllllllIlIlllIIlIIIIIIlllIl == 0;
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object llllllllllllIlIlllIIlIIIIlllIlll) throws Exception {
        if (lIlIIIIlllIIIlll((llllllllllllIlIlllIIlIIIIlllIlll instanceof UdtMessage) ? 1 : 0)) {
            return llllllllllllIlIlllIIlIIIIlllIlll;
        }
        throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[7]]).append(StringUtil.simpleClassName(llllllllllllIlIlllIIlIIIIlllIlll)).append(NioUdtMessageConnectorChannel.EXPECTED_TYPE)));
    }
    
    static {
        lIlIIIIlllIIIllI();
        lIlIIIIlllIIIlIl();
        logger = InternalLoggerFactory.getInstance(NioUdtMessageConnectorChannel.class);
        METADATA = new ChannelMetadata((boolean)(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] != 0));
        EXPECTED_TYPE = String.valueOf(new StringBuilder().append(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[8]]).append(StringUtil.simpleClassName(UdtMessage.class)).append((char)NioUdtMessageConnectorChannel.lllIlIIIllIIlI[9]));
    }
    
    public NioUdtMessageConnectorChannel(final TypeUDT llllllllllllIlIlllIIlIIIllIIIlII) {
        this(NioUdtProvider.newConnectorChannelUDT(llllllllllllIlIlllIIlIIIllIIIlII));
    }
    
    private static boolean lIlIIIIlllIIllIl(final int llllllllllllIlIlllIIlIIIIIlIllII, final int llllllllllllIlIlllIIlIIIIIlIlIll) {
        return llllllllllllIlIlllIIlIIIIIlIllII == llllllllllllIlIlllIIlIIIIIlIlIll;
    }
    
    public NioUdtMessageConnectorChannel(final Channel llllllllllllIlIlllIIlIIIllIlIIIl, final SocketChannelUDT llllllllllllIlIlllIIlIIIllIlIIII) {
        super(llllllllllllIlIlllIIlIIIllIlIIIl, (SelectableChannel)llllllllllllIlIlllIIlIIIllIlIIII, NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0]);
        try {
            llllllllllllIlIlllIIlIIIllIlIIII.configureBlocking((boolean)(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] != 0));
            "".length();
            switch (NioUdtMessageConnectorChannel$1.$SwitchMap$com$barchart$udt$StatusUDT[llllllllllllIlIlllIIlIIIllIlIIII.socketUDT().status().ordinal()]) {
                case 1:
                case 2: {
                    this.config = new DefaultUdtChannelConfig(this, (ChannelUDT)llllllllllllIlIlllIIlIIIllIlIIII, (boolean)(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0] != 0));
                    "".length();
                    if ((0xD ^ 0x70 ^ (0x7E ^ 0x7)) <= ((0x28 ^ 0x26 ^ (0xD3 ^ 0x9D)) & (0x27 ^ 0xD ^ (0xD1 ^ 0xBB) ^ -" ".length()))) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.config = new DefaultUdtChannelConfig(this, (ChannelUDT)llllllllllllIlIlllIIlIIIllIlIIII, (boolean)(NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1] != 0));
                    break;
                }
            }
            "".length();
            if (" ".length() < " ".length()) {
                throw null;
            }
        }
        catch (Exception llllllllllllIlIlllIIlIIIllIlIllI) {
            try {
                llllllllllllIlIlllIIlIIIllIlIIII.close();
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            catch (Exception llllllllllllIlIlllIIlIIIllIlIlll) {
                if (lIlIIIIlllIIIlll(NioUdtMessageConnectorChannel.logger.isWarnEnabled() ? 1 : 0)) {
                    NioUdtMessageConnectorChannel.logger.warn(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1]], llllllllllllIlIlllIIlIIIllIlIlll);
                }
            }
            throw new ChannelException(NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0]], llllllllllllIlIlllIIlIIIllIlIllI);
        }
    }
    
    private static void lIlIIIIlllIIIlIl() {
        (lllIlIIIllIIIl = new String[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[10]])[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1]] = lIlIIIIlllIIIIlI("HCIgOyE+Yz04ZDkvJiQheiAhNio0JiV5", "ZCIWD");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0]] = lIlIIIIlllIIIlII("6pn/uI3gsoxbJOs4Kew0pa4vnm8QwzApRd4WSLoIP/c=", "FOPZN");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[4]] = lIlIIIIlllIIIIlI("FhcLJSQiABZzKDQXCyF3ZgMFOiEjAUQnImYDDT0kNQ1EMCIoCwEwOWhFNCEiMAwANj9mCQ0xPycXHXM+LgoRPylmBwFzODYCFjIpIwFK", "FedSM");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[5]] = lIlIIIIlllIIIlII("9e4TnwvfH8Fn6QBYT67CASfs6eaR7kUIMnYA177gLADg65j1acot+XLPMkYBJ7huv6xAsvbvExrfGq37BdxyX2oPMOZ5fh9hlV2pkfEiKns=", "XPzuD");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[6]] = lIlIIIIlllIIIIlI("BDorBQQwLTZTCCY6KwFXdC4lGgExLGQHAnQ/NhoZMWgpFh4nKSMWQ3QYNhwbPSwhAU04ISYBDCYxZAAFOz0oF002LWQGHTM6JRcIMGY=", "THDsm");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[7]] = lIlIIIIlllIIIlII("mVgIn70QLpov0RryWRpLDNDRRyKhT9tfEEH6NUw9GtY=", "mUGZL");
        NioUdtMessageConnectorChannel.lllIlIIIllIIIl[NioUdtMessageConnectorChannel.lllIlIIIllIIlI[8]] = lIlIIIIlllIIIIlI("b1odKCQqEQw1MHVS", "OrxPT");
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    private static String lIlIIIIlllIIIIlI(String llllllllllllIlIlllIIlIIIIlIIIlII, final String llllllllllllIlIlllIIlIIIIlIIIIll) {
        llllllllllllIlIlllIIlIIIIlIIIlII = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIlIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIlIIIIlIIIlll = new StringBuilder();
        final char[] llllllllllllIlIlllIIlIIIIlIIIllI = llllllllllllIlIlllIIlIIIIlIIIIll.toCharArray();
        int llllllllllllIlIlllIIlIIIIlIIIlIl = NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1];
        final Exception llllllllllllIlIlllIIlIIIIIllllll = (Object)llllllllllllIlIlllIIlIIIIlIIIlII.toCharArray();
        final char llllllllllllIlIlllIIlIIIIIlllllI = (char)llllllllllllIlIlllIIlIIIIIllllll.length;
        float llllllllllllIlIlllIIlIIIIIllllIl = NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1];
        while (lIlIIIIlllIIllll((int)llllllllllllIlIlllIIlIIIIIllllIl, llllllllllllIlIlllIIlIIIIIlllllI)) {
            final char llllllllllllIlIlllIIlIIIIlIIlIlI = llllllllllllIlIlllIIlIIIIIllllll[llllllllllllIlIlllIIlIIIIIllllIl];
            llllllllllllIlIlllIIlIIIIlIIIlll.append((char)(llllllllllllIlIlllIIlIIIIlIIlIlI ^ llllllllllllIlIlllIIlIIIIlIIIllI[llllllllllllIlIlllIIlIIIIlIIIlIl % llllllllllllIlIlllIIlIIIIlIIIllI.length]));
            "".length();
            ++llllllllllllIlIlllIIlIIIIlIIIlIl;
            ++llllllllllllIlIlllIIlIIIIIllllIl;
            "".length();
            if ((113 + 144 - 166 + 58 ^ 110 + 0 - 37 + 72) != (0xB0 ^ 0x83 ^ (0x1F ^ 0x28))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIlIIIIlIIIlll);
    }
    
    @Override
    public boolean isActive() {
        final SocketChannelUDT llllllllllllIlIlllIIlIIIIlllIIlI = this.javaChannel();
        int n;
        if (lIlIIIIlllIIIlll(llllllllllllIlIlllIIlIIIIlllIIlI.isOpen() ? 1 : 0) && lIlIIIIlllIIIlll(llllllllllllIlIlllIIlIIIIlllIIlI.isConnectFinished() ? 1 : 0)) {
            n = NioUdtMessageConnectorChannel.lllIlIIIllIIlI[0];
            "".length();
            if (null != null) {
                return ((0x4F ^ 0x57) & ~(0xAA ^ 0xB2)) != 0x0;
            }
        }
        else {
            n = NioUdtMessageConnectorChannel.lllIlIIIllIIlI[1];
        }
        return n != 0;
    }
    
    private static int lIlIIIIlllIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
