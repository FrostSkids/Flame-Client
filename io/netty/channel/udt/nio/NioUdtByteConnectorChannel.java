// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import java.nio.channels.ScatteringByteChannel;
import io.netty.channel.ChannelConfig;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.channels.GatheringByteChannel;
import io.netty.buffer.ByteBuf;
import com.barchart.udt.TypeUDT;
import io.netty.channel.FileRegion;
import java.net.SocketAddress;
import io.netty.channel.ChannelException;
import com.barchart.udt.nio.ChannelUDT;
import io.netty.channel.udt.DefaultUdtChannelConfig;
import java.nio.channels.SelectableChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;
import com.barchart.udt.nio.SocketChannelUDT;
import java.net.InetSocketAddress;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.udt.UdtChannelConfig;
import io.netty.channel.ChannelMetadata;
import io.netty.channel.udt.UdtChannel;
import io.netty.channel.nio.AbstractNioByteChannel;

public class NioUdtByteConnectorChannel extends AbstractNioByteChannel implements UdtChannel
{
    private static final /* synthetic */ int[] lllIIIlIIllllI;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String[] lllIIIlIIlllIl;
    private final /* synthetic */ UdtChannelConfig config;
    private static final /* synthetic */ InternalLogger logger;
    
    @Override
    protected void doDisconnect() throws Exception {
        this.doClose();
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    public NioUdtByteConnectorChannel(final SocketChannelUDT llllllllllllIllIIIIIlIllIIIIlIlI) {
        this(null, llllllllllllIllIIIIIlIllIIIIlIlI);
    }
    
    private static String lIIlllIlIlIIllIl(final String llllllllllllIllIIIIIlIlIlIlIIIII, final String llllllllllllIllIIIIIlIlIlIlIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIlIlIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIlIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), NioUdtByteConnectorChannel.lllIIIlIIllllI[2]), "DES");
            final Cipher llllllllllllIllIIIIIlIlIlIlIIlII = Cipher.getInstance("DES");
            llllllllllllIllIIIIIlIlIlIlIIlII.init(NioUdtByteConnectorChannel.lllIIIlIIllllI[4], llllllllllllIllIIIIIlIlIlIlIIlIl);
            return new String(llllllllllllIllIIIIIlIlIlIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIlIlIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIlIlIlIlIIIll) {
            llllllllllllIllIIIIIlIlIlIlIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIlIlIlIIIl(final int llllllllllllIllIIIIIlIlIIlllllIl) {
        return llllllllllllIllIIIIIlIlIIlllllIl != 0;
    }
    
    @Override
    protected void doFinishConnect() throws Exception {
        if (!lIIlllIlIlIlIIIl(this.javaChannel().finishConnect() ? 1 : 0)) {
            throw new Error(NioUdtByteConnectorChannel.lllIIIlIIlllIl[NioUdtByteConnectorChannel.lllIIIlIIllllI[4]]);
        }
        this.selectionKey().interestOps(this.selectionKey().interestOps() & NioUdtByteConnectorChannel.lllIIIlIIllllI[3]);
        "".length();
        "".length();
        if ((0xA9 ^ 0xAC) <= 0) {
            return;
        }
    }
    
    private static void lIIlllIlIlIIllll() {
        (lllIIIlIIlllIl = new String[NioUdtByteConnectorChannel.lllIIIlIIllllI[5]])[NioUdtByteConnectorChannel.lllIIIlIIllllI[0]] = lIIlllIlIlIIllIl("CG3lKmOUw4qmeiU/DYVHENzX9zylHmuSVxv+RxLOPKc=", "BvBGE");
        NioUdtByteConnectorChannel.lllIIIlIIlllIl[NioUdtByteConnectorChannel.lllIIIlIIllllI[1]] = lIIlllIlIlIIlllI("Khs/FR0IWiIWWA8VOB8RCw8kHFgPEjcXFgkWeA==", "lzVyx");
        NioUdtByteConnectorChannel.lllIIIlIIlllIl[NioUdtByteConnectorChannel.lllIIIlIIllllI[4]] = lIIlllIlIlIIllIl("JgRJ00fcDqa9cEToPmfMoRb80ZbOua1B9DntUdjQzrWZaN/2KB8Gg9msAk5Frgid3hnJSeNDKpRYwbhPeEeNgSpgwOOcIKJv5R9w9W93hjA=", "PmmGI");
    }
    
    public NioUdtByteConnectorChannel(final Channel llllllllllllIllIIIIIlIllIIIlIIIl, final SocketChannelUDT llllllllllllIllIIIIIlIllIIIlIIll) {
        super(llllllllllllIllIIIIIlIllIIIlIIIl, (SelectableChannel)llllllllllllIllIIIIIlIllIIIlIIll);
        try {
            llllllllllllIllIIIIIlIllIIIlIIll.configureBlocking((boolean)(NioUdtByteConnectorChannel.lllIIIlIIllllI[0] != 0));
            "".length();
            switch (NioUdtByteConnectorChannel$1.$SwitchMap$com$barchart$udt$StatusUDT[llllllllllllIllIIIIIlIllIIIlIIll.socketUDT().status().ordinal()]) {
                case 1:
                case 2: {
                    this.config = new DefaultUdtChannelConfig(this, (ChannelUDT)llllllllllllIllIIIIIlIllIIIlIIll, (boolean)(NioUdtByteConnectorChannel.lllIIIlIIllllI[1] != 0));
                    "".length();
                    if (null != null) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.config = new DefaultUdtChannelConfig(this, (ChannelUDT)llllllllllllIllIIIIIlIllIIIlIIll, (boolean)(NioUdtByteConnectorChannel.lllIIIlIIllllI[0] != 0));
                    break;
                }
            }
            "".length();
            if ("   ".length() <= ((0x9F ^ 0xA3) & ~(0x6C ^ 0x50))) {
                throw null;
            }
        }
        catch (Exception llllllllllllIllIIIIIlIllIIIlIllI) {
            try {
                llllllllllllIllIIIIIlIllIIIlIIll.close();
                "".length();
                if ("  ".length() < 0) {
                    throw null;
                }
            }
            catch (Exception llllllllllllIllIIIIIlIllIIIlIlll) {
                if (lIIlllIlIlIlIIIl(NioUdtByteConnectorChannel.logger.isWarnEnabled() ? 1 : 0)) {
                    NioUdtByteConnectorChannel.logger.warn(NioUdtByteConnectorChannel.lllIIIlIIlllIl[NioUdtByteConnectorChannel.lllIIIlIIllllI[0]], llllllllllllIllIIIIIlIllIIIlIlll);
                }
            }
            throw new ChannelException(NioUdtByteConnectorChannel.lllIIIlIIlllIl[NioUdtByteConnectorChannel.lllIIIlIIllllI[1]], llllllllllllIllIIIIIlIllIIIlIllI);
        }
    }
    
    @Override
    protected void doClose() throws Exception {
        this.javaChannel().close();
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioUdtByteConnectorChannel.METADATA;
    }
    
    protected SocketChannelUDT javaChannel() {
        return (SocketChannelUDT)super.javaChannel();
    }
    
    @Override
    protected long doWriteFileRegion(final FileRegion llllllllllllIllIIIIIlIlIllIIllII) throws Exception {
        throw new UnsupportedOperationException();
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
    public boolean isActive() {
        final SocketChannelUDT llllllllllllIllIIIIIlIlIllIIlIII = this.javaChannel();
        int n;
        if (lIIlllIlIlIlIIIl(llllllllllllIllIIIIIlIlIllIIlIII.isOpen() ? 1 : 0) && lIIlllIlIlIlIIIl(llllllllllllIllIIIIIlIlIllIIlIII.isConnectFinished() ? 1 : 0)) {
            n = NioUdtByteConnectorChannel.lllIIIlIIllllI[1];
            "".length();
            if (((119 + 122 - 117 + 16 ^ 74 + 99 - 31 + 21) & (0x32 ^ 0x64 ^ (0x1C ^ 0x65) ^ -" ".length())) != 0x0) {
                return ((0x9 ^ 0x2F ^ (0x40 ^ 0x22)) & (27 + 61 - 46 + 169 ^ 89 + 121 - 203 + 144 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = NioUdtByteConnectorChannel.lllIIIlIIllllI[0];
        }
        return n != 0;
    }
    
    private static boolean lIIlllIlIlIlIlII(final int llllllllllllIllIIIIIlIlIlIIIIIlI, final int llllllllllllIllIIIIIlIlIlIIIIIIl) {
        return llllllllllllIllIIIIIlIlIlIIIIIlI < llllllllllllIllIIIIIlIlIlIIIIIIl;
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    public NioUdtByteConnectorChannel() {
        this(TypeUDT.STREAM);
    }
    
    @Override
    protected boolean doConnect(final SocketAddress llllllllllllIllIIIIIlIlIlllIlIII, final SocketAddress llllllllllllIllIIIIIlIlIlllIIlll) throws Exception {
        SocketAddress llllllllllllIllIIIIIlIlIlllllIll;
        if (lIIlllIlIlIlIIlI(llllllllllllIllIIIIIlIlIlllIIlll)) {
            llllllllllllIllIIIIIlIlIlllllIll = llllllllllllIllIIIIIlIlIlllIIlll;
            "".length();
            if (-(0xE9 ^ 0x87 ^ (0x72 ^ 0x18)) >= 0) {
                return ((0x7E ^ 0x62 ^ (0x28 ^ 0x56)) & (0x32 ^ 0x55 ^ (0x5F ^ 0x5A) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllIIIIIlIlIlllllIll = new InetSocketAddress(NioUdtByteConnectorChannel.lllIIIlIIllllI[0]);
        }
        this.doBind(llllllllllllIllIIIIIlIlIlllllIll);
        boolean llllllllllllIllIIIIIlIlIlllIlIlI = NioUdtByteConnectorChannel.lllIIIlIIllllI[0] != 0;
        try {
            final boolean llllllllllllIllIIIIIlIlIlllIlllI = this.javaChannel().connect(llllllllllllIllIIIIIlIlIlllIlIII);
            if (lIIlllIlIlIlIIll(llllllllllllIllIIIIIlIlIlllIlllI ? 1 : 0)) {
                this.selectionKey().interestOps(this.selectionKey().interestOps() | NioUdtByteConnectorChannel.lllIIIlIIllllI[2]);
                "".length();
            }
            llllllllllllIllIIIIIlIlIlllIlIlI = (NioUdtByteConnectorChannel.lllIIIlIIllllI[1] != 0);
            final byte llllllllllllIllIIIIIlIlIlllIIlII = (byte)(llllllllllllIllIIIIIlIlIlllIlllI ? 1 : 0);
            return llllllllllllIllIIIIIlIlIlllIIlII != 0;
        }
        finally {
            if (lIIlllIlIlIlIIll(llllllllllllIllIIIIIlIlIlllIlIlI ? 1 : 0)) {
                this.doClose();
            }
        }
    }
    
    public NioUdtByteConnectorChannel(final TypeUDT llllllllllllIllIIIIIlIllIIIIIlII) {
        this(NioUdtProvider.newConnectorChannelUDT(llllllllllllIllIIIIIlIllIIIIIlII));
    }
    
    private static boolean lIIlllIlIlIlIIll(final int llllllllllllIllIIIIIlIlIIllllIll) {
        return llllllllllllIllIIIIIlIlIIllllIll == 0;
    }
    
    @Override
    public UdtChannelConfig config() {
        return this.config;
    }
    
    private static boolean lIIlllIlIlIlIIlI(final Object llllllllllllIllIIIIIlIlIIlllllll) {
        return llllllllllllIllIIIIIlIlIIlllllll != null;
    }
    
    @Override
    protected int doWriteBytes(final ByteBuf llllllllllllIllIIIIIlIlIllIIllll) throws Exception {
        final int llllllllllllIllIIIIIlIlIllIlIIIl = llllllllllllIllIIIIIlIlIllIIllll.readableBytes();
        return llllllllllllIllIIIIIlIlIllIIllll.readBytes((GatheringByteChannel)this.javaChannel(), llllllllllllIllIIIIIlIlIllIlIIIl);
    }
    
    private static void lIIlllIlIlIlIIII() {
        (lllIIIlIIllllI = new int[6])[0] = ((0xA9 ^ 0xAD) & ~(0x5B ^ 0x5F));
        NioUdtByteConnectorChannel.lllIIIlIIllllI[1] = " ".length();
        NioUdtByteConnectorChannel.lllIIIlIIllllI[2] = (0x18 ^ 0x47 ^ (0x10 ^ 0x47));
        NioUdtByteConnectorChannel.lllIIIlIIllllI[3] = -(0x73 ^ 0x7A);
        NioUdtByteConnectorChannel.lllIIIlIIllllI[4] = "  ".length();
        NioUdtByteConnectorChannel.lllIIIlIIllllI[5] = "   ".length();
    }
    
    static {
        lIIlllIlIlIlIIII();
        lIIlllIlIlIIllll();
        logger = InternalLoggerFactory.getInstance(NioUdtByteConnectorChannel.class);
        METADATA = new ChannelMetadata((boolean)(NioUdtByteConnectorChannel.lllIIIlIIllllI[0] != 0));
    }
    
    @Override
    protected void doBind(final SocketAddress llllllllllllIllIIIIIlIlIlllllIll) throws Exception {
        this.javaChannel().bind(llllllllllllIllIIIIIlIlIlllllIll);
        "".length();
    }
    
    private static String lIIlllIlIlIIlllI(String llllllllllllIllIIIIIlIlIlIIIllIl, final String llllllllllllIllIIIIIlIlIlIIIllII) {
        llllllllllllIllIIIIIlIlIlIIIllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIlIlIlIIlIIII = new StringBuilder();
        final char[] llllllllllllIllIIIIIlIlIlIIIllll = llllllllllllIllIIIIIlIlIlIIIllII.toCharArray();
        int llllllllllllIllIIIIIlIlIlIIIlllI = NioUdtByteConnectorChannel.lllIIIlIIllllI[0];
        final int llllllllllllIllIIIIIlIlIlIIIlIII = (Object)llllllllllllIllIIIIIlIlIlIIIllIl.toCharArray();
        final Exception llllllllllllIllIIIIIlIlIlIIIIlll = (Exception)llllllllllllIllIIIIIlIlIlIIIlIII.length;
        Exception llllllllllllIllIIIIIlIlIlIIIIllI = (Exception)NioUdtByteConnectorChannel.lllIIIlIIllllI[0];
        while (lIIlllIlIlIlIlII((int)llllllllllllIllIIIIIlIlIlIIIIllI, (int)llllllllllllIllIIIIIlIlIlIIIIlll)) {
            final char llllllllllllIllIIIIIlIlIlIIlIIll = llllllllllllIllIIIIIlIlIlIIIlIII[llllllllllllIllIIIIIlIlIlIIIIllI];
            llllllllllllIllIIIIIlIlIlIIlIIII.append((char)(llllllllllllIllIIIIIlIlIlIIlIIll ^ llllllllllllIllIIIIIlIlIlIIIllll[llllllllllllIllIIIIIlIlIlIIIlllI % llllllllllllIllIIIIIlIlIlIIIllll.length]));
            "".length();
            ++llllllllllllIllIIIIIlIlIlIIIlllI;
            ++llllllllllllIllIIIIIlIlIlIIIIllI;
            "".length();
            if (((0x23 ^ 0x2F) & ~(0xA6 ^ 0xAA)) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIlIlIlIIlIIII);
    }
    
    @Override
    protected int doReadBytes(final ByteBuf llllllllllllIllIIIIIlIlIllIlIlll) throws Exception {
        return llllllllllllIllIIIIIlIlIllIlIlll.writeBytes((ScatteringByteChannel)this.javaChannel(), llllllllllllIllIIIIIlIlIllIlIlll.writableBytes());
    }
}
