// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.oio;

import io.netty.util.internal.PlatformDependent;
import java.util.Locale;
import java.net.SocketTimeoutException;
import java.util.List;
import io.netty.channel.ChannelOption;
import java.net.DatagramSocket;
import io.netty.channel.socket.DefaultDatagramChannelConfig;
import java.net.SocketException;
import io.netty.channel.ChannelException;
import io.netty.util.internal.EmptyArrays;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.ChannelConfig;
import java.io.IOException;
import io.netty.channel.ChannelPromise;
import java.net.InetAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.SocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.AddressedEnvelope;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.channel.ChannelFuture;
import java.net.NetworkInterface;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import io.netty.channel.ChannelMetadata;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.channel.socket.DatagramChannelConfig;
import java.net.DatagramPacket;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.socket.DatagramChannel;
import io.netty.channel.oio.AbstractOioMessageChannel;

public class OioDatagramChannel extends AbstractOioMessageChannel implements DatagramChannel
{
    private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
    private static final /* synthetic */ String[] llllIIIllIlII;
    private static final /* synthetic */ String EXPECTED_TYPES;
    private final /* synthetic */ DatagramPacket tmpPacket;
    private static final /* synthetic */ int[] llllIIIllIllI;
    private final /* synthetic */ DatagramChannelConfig config;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private final /* synthetic */ MulticastSocket socket;
    
    private static boolean lIlIIlllllllllI(final int lllllllllllllIlIlllIlIlIllIlIllI) {
        return lllllllllllllIlIlllIlIlIllIlIllI == 0;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress lllllllllllllIlIlllIlIlllIIIllll, final NetworkInterface lllllllllllllIlIlllIlIlllIIIlIll) {
        return this.joinGroup(lllllllllllllIlIlllIlIlllIIIllll, lllllllllllllIlIlllIlIlllIIIlIll, this.newPromise());
    }
    
    @Override
    public boolean isOpen() {
        int n;
        if (lIlIIlllllllllI(this.socket.isClosed() ? 1 : 0)) {
            n = OioDatagramChannel.llllIIIllIllI[2];
            "".length();
            if (-(0x81 ^ 0x85) > 0) {
                return ((0xA2 ^ 0x80) & ~(0x91 ^ 0xB3)) != 0x0;
            }
        }
        else {
            n = OioDatagramChannel.llllIIIllIllI[0];
        }
        return n != 0;
    }
    
    public OioDatagramChannel() {
        this(newSocket());
    }
    
    static {
        lIlIIllllllllIl();
        lIlIIllllllllII();
        logger = InternalLoggerFactory.getInstance(OioDatagramChannel.class);
        METADATA = new ChannelMetadata((boolean)(OioDatagramChannel.llllIIIllIllI[2] != 0));
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[9]]).append(StringUtil.simpleClassName(io.netty.channel.socket.DatagramPacket.class)).append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[10]]).append(StringUtil.simpleClassName(AddressedEnvelope.class)).append((char)OioDatagramChannel.llllIIIllIllI[11]).append(StringUtil.simpleClassName(ByteBuf.class)).append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[12]]).append(StringUtil.simpleClassName(SocketAddress.class)).append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[13]]).append(StringUtil.simpleClassName(ByteBuf.class)).append((char)OioDatagramChannel.llllIIIllIllI[14]));
    }
    
    private static String lIlIIllllllIIIl(final String lllllllllllllIlIlllIlIlIllllllIl, final String lllllllllllllIlIlllIlIlIlllllllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIllIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIlIlllllllI.getBytes(StandardCharsets.UTF_8)), OioDatagramChannel.llllIIIllIllI[10]), "DES");
            final Cipher lllllllllllllIlIlllIlIllIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlllIlIllIIIIIIIl.init(OioDatagramChannel.llllIIIllIllI[3], lllllllllllllIlIlllIlIllIIIIIIlI);
            return new String(lllllllllllllIlIlllIlIllIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIllIIIIIIII) {
            lllllllllllllIlIlllIlIllIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isConnected() {
        return this.socket.isConnected();
    }
    
    @Override
    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress)super.remoteAddress();
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIlIlllIlIllIIlIIlIl, final InetAddress lllllllllllllIlIlllIlIllIIlIIlII) {
        return this.newFailedFuture(new UnsupportedOperationException());
    }
    
    @Override
    protected SocketAddress remoteAddress0() {
        return this.socket.getRemoteSocketAddress();
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIlIlllIlIllIllllIIl, final NetworkInterface lllllllllllllIlIlllIlIllIllllIII, final InetAddress lllllllllllllIlIlllIlIllIlllIlll) {
        return this.newFailedFuture(new UnsupportedOperationException());
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIlIlllIlIllIllIIllI) {
        return this.leaveGroup(lllllllllllllIlIlllIlIllIllIIllI, this.newPromise());
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIlIlllIlIllIlllIIll, final NetworkInterface lllllllllllllIlIlllIlIllIlllIIlI, final InetAddress lllllllllllllIlIlllIlIllIlllIIIl, final ChannelPromise lllllllllllllIlIlllIlIllIlllIIII) {
        lllllllllllllIlIlllIlIllIlllIIII.setFailure((Throwable)new UnsupportedOperationException());
        "".length();
        return lllllllllllllIlIlllIlIllIlllIIII;
    }
    
    private static void lIlIIllllllllIl() {
        (llllIIIllIllI = new int[16])[0] = ((0xBE ^ 0xC4 ^ (0x41 ^ 0x67)) & (0x5A ^ 0x52 ^ (0x2C ^ 0x78) ^ -" ".length()));
        OioDatagramChannel.llllIIIllIllI[1] = (0xFFFFEFFF & 0x13E8);
        OioDatagramChannel.llllIIIllIllI[2] = " ".length();
        OioDatagramChannel.llllIIIllIllI[3] = "  ".length();
        OioDatagramChannel.llllIIIllIllI[4] = "   ".length();
        OioDatagramChannel.llllIIIllIllI[5] = (0x72 ^ 0x4B ^ (0x78 ^ 0x45));
        OioDatagramChannel.llllIIIllIllI[6] = -" ".length();
        OioDatagramChannel.llllIIIllIllI[7] = (0x90 ^ 0x95);
        OioDatagramChannel.llllIIIllIllI[8] = (0x41 ^ 0x5D ^ (0xBD ^ 0xA7));
        OioDatagramChannel.llllIIIllIllI[9] = (0x1B ^ 0x6E ^ (0x6D ^ 0x1F));
        OioDatagramChannel.llllIIIllIllI[10] = (0xB ^ 0x14 ^ (0xBD ^ 0xAA));
        OioDatagramChannel.llllIIIllIllI[11] = (0x8E ^ 0xB2);
        OioDatagramChannel.llllIIIllIllI[12] = (0xD4 ^ 0x89 ^ (0xD6 ^ 0x82));
        OioDatagramChannel.llllIIIllIllI[13] = (0x1 ^ 0xB);
        OioDatagramChannel.llllIIIllIllI[14] = (0x98 ^ 0xB1);
        OioDatagramChannel.llllIIIllIllI[15] = (0xB ^ 0x0);
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress lllllllllllllIlIlllIlIllIlIIIlIl, final NetworkInterface lllllllllllllIlIlllIlIllIlIIlIII, final ChannelPromise lllllllllllllIlIlllIlIllIlIIIIll) {
        try {
            this.socket.leaveGroup(lllllllllllllIlIlllIlIllIlIIIlIl, lllllllllllllIlIlllIlIllIlIIlIII);
            lllllllllllllIlIlllIlIllIlIIIIll.setSuccess();
            "".length();
            "".length();
            if (-(0xC ^ 0x8) > 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIlllIlIllIlIIlIll) {
            lllllllllllllIlIlllIlIllIlIIIIll.setFailure((Throwable)lllllllllllllIlIlllIlIllIlIIlIll);
            "".length();
        }
        return lllllllllllllIlIlllIlIllIlIIIIll;
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIlIlllIlIllIIlIIIII, final InetAddress lllllllllllllIlIlllIlIllIIIlllll, final ChannelPromise lllllllllllllIlIlllIlIllIIIlllIl) {
        lllllllllllllIlIlllIlIllIIIlllIl.setFailure((Throwable)new UnsupportedOperationException());
        "".length();
        return lllllllllllllIlIlllIlIllIIIlllIl;
    }
    
    private void ensureBound() {
        if (lIlIIlllllllllI(this.isActive() ? 1 : 0)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(DatagramChannel.class.getName()).append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[8]])));
        }
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIlIlllIlIllIIllIIlI, final NetworkInterface lllllllllllllIlIlllIlIllIIllIIIl, final InetAddress lllllllllllllIlIlllIlIllIIllIIII) {
        return this.newFailedFuture(new UnsupportedOperationException());
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIlIlllIlIlllIllIlII) throws Exception {
        do {
            final Object lllllllllllllIlIlllIlIlllIlllIIl = lllllllllllllIlIlllIlIlllIllIlII.current();
            if (lIlIlIIIIIIIIIl(lllllllllllllIlIlllIlIlllIlllIIl)) {
                "".length();
                if (((48 + 58 - 101 + 144 ^ 133 + 12 - 103 + 94) & (48 + 26 - 54 + 148 ^ 45 + 171 - 192 + 157 ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            else {
                ByteBuf lllllllllllllIlIlllIlIlllIlllIII = null;
                SocketAddress lllllllllllllIlIlllIlIlllIllIlll;
                if (lIlIIllllllllll((lllllllllllllIlIlllIlIlllIlllIIl instanceof AddressedEnvelope) ? 1 : 0)) {
                    final AddressedEnvelope<ByteBuf, SocketAddress> lllllllllllllIlIlllIlIlllIlllllI = (AddressedEnvelope<ByteBuf, SocketAddress>)lllllllllllllIlIlllIlIlllIlllIIl;
                    final SocketAddress lllllllllllllIlIlllIlIlllIllllII = lllllllllllllIlIlllIlIlllIlllllI.recipient();
                    final ByteBuf lllllllllllllIlIlllIlIlllIllllIl = lllllllllllllIlIlllIlIlllIlllllI.content();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlllIlIlllIlllIII = (ByteBuf)lllllllllllllIlIlllIlIlllIlllIIl;
                    lllllllllllllIlIlllIlIlllIllIlll = null;
                }
                final int lllllllllllllIlIlllIlIlllIllIllI = lllllllllllllIlIlllIlIlllIlllIII.readableBytes();
                if (lIlIlIIIIIIIIII(lllllllllllllIlIlllIlIlllIllIlll)) {
                    this.tmpPacket.setSocketAddress(lllllllllllllIlIlllIlIlllIllIlll);
                }
                if (lIlIIllllllllll(lllllllllllllIlIlllIlIlllIlllIII.hasArray() ? 1 : 0)) {
                    this.tmpPacket.setData(lllllllllllllIlIlllIlIlllIlllIII.array(), lllllllllllllIlIlllIlIlllIlllIII.arrayOffset() + lllllllllllllIlIlllIlIlllIlllIII.readerIndex(), lllllllllllllIlIlllIlIlllIllIllI);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
                else {
                    final byte[] lllllllllllllIlIlllIlIlllIlllIll = new byte[lllllllllllllIlIlllIlIlllIllIllI];
                    lllllllllllllIlIlllIlIlllIlllIII.getBytes(lllllllllllllIlIlllIlIlllIlllIII.readerIndex(), lllllllllllllIlIlllIlIlllIlllIll);
                    "".length();
                    this.tmpPacket.setData(lllllllllllllIlIlllIlIlllIlllIll);
                }
                try {
                    this.socket.send(this.tmpPacket);
                    lllllllllllllIlIlllIlIlllIllIlII.remove();
                    "".length();
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return;
                    }
                }
                catch (IOException lllllllllllllIlIlllIlIlllIlllIlI) {
                    lllllllllllllIlIlllIlIlllIllIlII.remove(lllllllllllllIlIlllIlIlllIlllIlI);
                    "".length();
                }
                "".length();
            }
        } while (((0x47 ^ 0x7F ^ (0xB4 ^ 0xA2)) & (0x7E ^ 0x72 ^ (0x2 ^ 0x20) ^ -" ".length())) <= (0xE ^ 0x25 ^ (0xB6 ^ 0x99)));
    }
    
    private static String lIlIIlllllIIIll(String lllllllllllllIlIlllIlIlIlllIllll, final String lllllllllllllIlIlllIlIlIlllIlllI) {
        lllllllllllllIlIlllIlIlIlllIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIlIlIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIlIlIlllIllIl = new StringBuilder();
        final char[] lllllllllllllIlIlllIlIlIlllIllII = lllllllllllllIlIlllIlIlIlllIlllI.toCharArray();
        int lllllllllllllIlIlllIlIlIlllIlIll = OioDatagramChannel.llllIIIllIllI[0];
        final char lllllllllllllIlIlllIlIlIlllIIlIl = (Object)lllllllllllllIlIlllIlIlIlllIllll.toCharArray();
        final long lllllllllllllIlIlllIlIlIlllIIlII = lllllllllllllIlIlllIlIlIlllIIlIl.length;
        long lllllllllllllIlIlllIlIlIlllIIIll = OioDatagramChannel.llllIIIllIllI[0];
        while (lIlIlIIIIIIIIlI((int)lllllllllllllIlIlllIlIlIlllIIIll, (int)lllllllllllllIlIlllIlIlIlllIIlII)) {
            final char lllllllllllllIlIlllIlIlIllllIIII = lllllllllllllIlIlllIlIlIlllIIlIl[lllllllllllllIlIlllIlIlIlllIIIll];
            lllllllllllllIlIlllIlIlIlllIllIl.append((char)(lllllllllllllIlIlllIlIlIllllIIII ^ lllllllllllllIlIlllIlIlIlllIllII[lllllllllllllIlIlllIlIlIlllIlIll % lllllllllllllIlIlllIlIlIlllIllII.length]));
            "".length();
            ++lllllllllllllIlIlllIlIlIlllIlIll;
            ++lllllllllllllIlIlllIlIlIlllIIIll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIlIlIlllIllIl);
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIlIlllIlIllIIlllIIl, final NetworkInterface lllllllllllllIlIlllIlIllIIlllIII, final InetAddress lllllllllllllIlIlllIlIllIIllIlll, final ChannelPromise lllllllllllllIlIlllIlIllIIllIllI) {
        lllllllllllllIlIlllIlIllIIllIllI.setFailure((Throwable)new UnsupportedOperationException());
        "".length();
        return lllllllllllllIlIlllIlIllIIllIllI;
    }
    
    public OioDatagramChannel(final MulticastSocket lllllllllllllIlIlllIllIIIIlIIIIl) {
        super(null);
        this.tmpPacket = new DatagramPacket(EmptyArrays.EMPTY_BYTES, OioDatagramChannel.llllIIIllIllI[0]);
        boolean lllllllllllllIlIlllIllIIIIlIIIll = OioDatagramChannel.llllIIIllIllI[0] != 0;
        try {
            lllllllllllllIlIlllIllIIIIlIIIIl.setSoTimeout(OioDatagramChannel.llllIIIllIllI[1]);
            lllllllllllllIlIlllIllIIIIlIIIIl.setBroadcast((boolean)(OioDatagramChannel.llllIIIllIllI[0] != 0));
            lllllllllllllIlIlllIllIIIIlIIIll = (OioDatagramChannel.llllIIIllIllI[2] != 0);
            if (lIlIIlllllllllI(lllllllllllllIlIlllIllIIIIlIIIll ? 1 : 0)) {
                lllllllllllllIlIlllIllIIIIlIIIIl.close();
                "".length();
                if (null != null) {
                    throw null;
                }
            }
        }
        catch (SocketException lllllllllllllIlIlllIllIIIIlIIllI) {
            throw new ChannelException(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[2]], lllllllllllllIlIlllIllIIIIlIIllI);
        }
        finally {
            if (lIlIIlllllllllI(lllllllllllllIlIlllIllIIIIlIIIll ? 1 : 0)) {
                lllllllllllllIlIlllIllIIIIlIIIIl.close();
            }
        }
        this.socket = lllllllllllllIlIlllIllIIIIlIIIIl;
        this.config = new DefaultDatagramChannelConfig(this, lllllllllllllIlIlllIllIIIIlIIIIl);
    }
    
    @Override
    public boolean isActive() {
        int n;
        if (lIlIIllllllllll(this.isOpen() ? 1 : 0) && ((lIlIIllllllllll(((boolean)this.config.getOption(ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) ? 1 : 0) && !lIlIIlllllllllI(this.isRegistered() ? 1 : 0)) || lIlIIllllllllll(this.socket.isBound() ? 1 : 0))) {
            n = OioDatagramChannel.llllIIIllIllI[2];
            "".length();
            if (((0x5A ^ 0x38) & ~(0xB ^ 0x69)) != 0x0) {
                return ((0x6A ^ 0x8) & ~(0x39 ^ 0x5B)) != 0x0;
            }
        }
        else {
            n = OioDatagramChannel.llllIIIllIllI[0];
        }
        return n != 0;
    }
    
    @Override
    public InetSocketAddress localAddress() {
        return (InetSocketAddress)super.localAddress();
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIlIlllIlIlllIlIIIlI) {
        return this.joinGroup(lllllllllllllIlIlllIlIlllIlIIIlI, this.newPromise());
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIlIlllIlIlllIlIIlll) {
        if (!lIlIIlllllllllI((lllllllllllllIlIlllIlIlllIlIIlll instanceof io.netty.channel.socket.DatagramPacket) ? 1 : 0) || lIlIIllllllllll((lllllllllllllIlIlllIlIlllIlIIlll instanceof ByteBuf) ? 1 : 0)) {
            return lllllllllllllIlIlllIlIlllIlIIlll;
        }
        if (lIlIIllllllllll((lllllllllllllIlIlllIlIlllIlIIlll instanceof AddressedEnvelope) ? 1 : 0)) {
            final AddressedEnvelope<Object, SocketAddress> lllllllllllllIlIlllIlIlllIlIlIlI = (AddressedEnvelope<Object, SocketAddress>)lllllllllllllIlIlllIlIlllIlIIlll;
            if (lIlIIllllllllll((lllllllllllllIlIlllIlIlllIlIlIlI.content() instanceof ByteBuf) ? 1 : 0)) {
                return lllllllllllllIlIlllIlIlllIlIIlll;
            }
        }
        throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[7]]).append(StringUtil.simpleClassName(lllllllllllllIlIlllIlIlllIlIIlll)).append(OioDatagramChannel.EXPECTED_TYPES)));
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIlIlllIlIllIIllllll, final NetworkInterface lllllllllllllIlIlllIlIllIIlllllI, final InetAddress lllllllllllllIlIlllIlIllIIllllIl) {
        return this.newFailedFuture(new UnsupportedOperationException());
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIlIlllIllIIIIIIIlll) throws Exception {
        this.socket.bind(lllllllllllllIlIlllIllIIIIIIIlll);
    }
    
    private static String lIlIIlllllIIIlI(final String lllllllllllllIlIlllIlIllIIIIllII, final String lllllllllllllIlIlllIlIllIIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIllIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIlIllIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIlIllIIIIlllI.init(OioDatagramChannel.llllIIIllIllI[3], lllllllllllllIlIlllIlIllIIIIllll);
            return new String(lllllllllllllIlIlllIlIllIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIllIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIllIIIIllIl) {
            lllllllllllllIlIlllIlIllIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void doClose() throws Exception {
        this.socket.close();
    }
    
    @Override
    public ChannelMetadata metadata() {
        return OioDatagramChannel.METADATA;
    }
    
    private static boolean lIlIlIIIIIIIIIl(final Object lllllllllllllIlIlllIlIlIllIllIlI) {
        return lllllllllllllIlIlllIlIlIllIllIlI == null;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIlIlllIlIllIlIlllll, final ChannelPromise lllllllllllllIlIlllIlIllIlIllllI) {
        try {
            this.socket.leaveGroup(lllllllllllllIlIlllIlIllIlIlllll);
            lllllllllllllIlIlllIlIllIlIllllI.setSuccess();
            "".length();
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIlllIlIllIllIIIIl) {
            lllllllllllllIlIlllIlIllIlIllllI.setFailure((Throwable)lllllllllllllIlIlllIlIllIllIIIIl);
            "".length();
        }
        return lllllllllllllIlIlllIlIllIlIllllI;
    }
    
    @Override
    protected void doConnect(final SocketAddress lllllllllllllIlIlllIlIllllllIlII, final SocketAddress lllllllllllllIlIlllIlIlllllIllll) throws Exception {
        if (lIlIlIIIIIIIIII(lllllllllllllIlIlllIlIlllllIllll)) {
            this.socket.bind(lllllllllllllIlIlllIlIlllllIllll);
        }
        boolean lllllllllllllIlIlllIlIllllllIIlI = OioDatagramChannel.llllIIIllIllI[0] != 0;
        try {
            this.socket.connect(lllllllllllllIlIlllIlIllllllIlII);
            lllllllllllllIlIlllIlIllllllIIlI = (OioDatagramChannel.llllIIIllIllI[2] != 0);
            if (lIlIIlllllllllI(lllllllllllllIlIlllIlIllllllIIlI ? 1 : 0)) {
                try {
                    this.socket.close();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIlllIlIllllllIlll) {
                    OioDatagramChannel.logger.warn(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[3]], lllllllllllllIlIlllIlIllllllIlll);
                    "".length();
                    if (((0x7A ^ 0x3A ^ (0xEC ^ 0xA1)) & (0xB5 ^ 0xA9 ^ (0xB ^ 0x1A) ^ -" ".length())) == "   ".length()) {
                        return;
                    }
                }
            }
        }
        finally {
            if (lIlIIlllllllllI(lllllllllllllIlIlllIlIllllllIIlI ? 1 : 0)) {
                try {
                    this.socket.close();
                    "".length();
                    if (((0x21 ^ 0xF) & ~(0x16 ^ 0x38)) > ((0x24 ^ 0x67) & ~(0x15 ^ 0x56))) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIlllIlIllllllIllI) {
                    OioDatagramChannel.logger.warn(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[4]], lllllllllllllIlIlllIlIllllllIllI);
                }
            }
        }
    }
    
    private static MulticastSocket newSocket() {
        try {
            return new MulticastSocket((SocketAddress)null);
        }
        catch (Exception lllllllllllllIlIlllIllIIIIllIIII) {
            throw new ChannelException(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[0]], lllllllllllllIlIlllIllIIIIllIIII);
        }
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress lllllllllllllIlIlllIlIllIlIlIlIl, final NetworkInterface lllllllllllllIlIlllIlIllIlIlIlII) {
        return this.leaveGroup(lllllllllllllIlIlllIlIllIlIlIlIl, lllllllllllllIlIlllIlIllIlIlIlII, this.newPromise());
    }
    
    private static boolean lIlIlIIIIIIIIlI(final int lllllllllllllIlIlllIlIlIllIlllll, final int lllllllllllllIlIlllIlIlIllIllllI) {
        return lllllllllllllIlIlllIlIlIllIlllll < lllllllllllllIlIlllIlIlIllIllllI;
    }
    
    @Override
    public DatagramChannelConfig config() {
        return this.config;
    }
    
    private static void lIlIIllllllllII() {
        (llllIIIllIlII = new String[OioDatagramChannel.llllIIIllIllI[15]])[OioDatagramChannel.llllIIIllIllI[0]] = lIlIIlllllIIIlI("rvw2qUOIk4I0hAVZsYIooqFC7KaM6wi4iK8cDuNH1ug=", "gLTPY");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[2]] = lIlIIlllllIIIll("ISkcFQQDaAEWQQQnGx8IAD0HHEETIBBZBQY8FB4TBiVVCg4EIxANQRMhGBwOEjxb", "gHuya");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[3]] = lIlIIlllllIIIll("MBYoDx0SVzUMWBUbLhAdVhZhEBcVHCQXVg==", "vwAcx");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[4]] = lIlIIlllllIIIlI("lNJc6h01s+JdLwd6xGFg9glBzYmpxG72KnCMYU50wTc=", "FXgud");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[5]] = lIlIIlllllIIIlI("YrXMgK3RyON2PWfPV96Axg==", "ChavD");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[7]] = lIlIIlllllIIIlI("1jcCDuu+TF4RuIs9zprlmOSuVB1xUE7L8nNBPraY6Ws=", "jQAhE");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[8]] = lIlIIlllllIIIll("Vy8sFxtXIDxEDRg3NwBPAy15DgAeLHkFTxAwNhEfWQ==", "wBYdo");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[9]] = lIlIIlllllIIIll("QWQtLCIELzwxNlts", "aLHTR");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[10]] = lIlIIllllllIIIl("QFeSKpwXjZ8=", "UdTzL");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[12]] = lIlIIlllllIIIlI("zlRcWHoy57M=", "DTKlx");
        OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[13]] = lIlIIlllllIIIlI("ebnWOLc/V0Q=", "pYgJx");
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.socket.disconnect();
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIlIlllIlIllIIlIllII, final NetworkInterface lllllllllllllIlIlllIlIllIIlIlIll, final InetAddress lllllllllllllIlIlllIlIllIIlIlIlI, final ChannelPromise lllllllllllllIlIlllIlIllIIlIlIIl) {
        lllllllllllllIlIlllIlIllIIlIlIIl.setFailure((Throwable)new UnsupportedOperationException());
        "".length();
        return lllllllllllllIlIlllIlIllIIlIlIIl;
    }
    
    @Override
    protected SocketAddress localAddress0() {
        return this.socket.getLocalSocketAddress();
    }
    
    private static boolean lIlIIllllllllll(final int lllllllllllllIlIlllIlIlIllIllIII) {
        return lllllllllllllIlIlllIlIlIllIllIII != 0;
    }
    
    private static boolean lIlIlIIIIIIIIII(final Object lllllllllllllIlIlllIlIlIllIlllII) {
        return lllllllllllllIlIlllIlIlIllIlllII != null;
    }
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIlIlllIlIllllIlIlII) throws Exception {
        final DatagramChannelConfig lllllllllllllIlIlllIlIllllIlIIll = this.config();
        RecvByteBufAllocator.Handle lllllllllllllIlIlllIlIllllIlIIlI = this.allocHandle;
        if (lIlIlIIIIIIIIIl(lllllllllllllIlIlllIlIllllIlIIlI)) {
            lllllllllllllIlIlllIlIllllIlIIlI = (this.allocHandle = lllllllllllllIlIlllIlIllllIlIIll.getRecvByteBufAllocator().newHandle());
        }
        final ByteBuf lllllllllllllIlIlllIlIllllIlIIIl = lllllllllllllIlIlllIlIllllIlIIll.getAllocator().heapBuffer(lllllllllllllIlIlllIlIllllIlIIlI.guess());
        boolean lllllllllllllIlIlllIlIllllIlIIII = OioDatagramChannel.llllIIIllIllI[2] != 0;
        try {
            this.tmpPacket.setData(lllllllllllllIlIlllIlIllllIlIIIl.array(), lllllllllllllIlIlllIlIllllIlIIIl.arrayOffset(), lllllllllllllIlIlllIlIllllIlIIIl.capacity());
            this.socket.receive(this.tmpPacket);
            final InetSocketAddress lllllllllllllIlIlllIlIllllIllIlI = (InetSocketAddress)this.tmpPacket.getSocketAddress();
            final int lllllllllllllIlIlllIlIllllIllIIl = this.tmpPacket.getLength();
            lllllllllllllIlIlllIlIllllIlIIlI.record(lllllllllllllIlIlllIlIllllIllIIl);
            lllllllllllllIlIlllIlIllllIlIlII.add(new io.netty.channel.socket.DatagramPacket(lllllllllllllIlIlllIlIllllIlIIIl.writerIndex(lllllllllllllIlIlllIlIllllIllIIl), this.localAddress(), lllllllllllllIlIlllIlIllllIllIlI));
            "".length();
            lllllllllllllIlIlllIlIllllIlIIII = (OioDatagramChannel.llllIIIllIllI[0] != 0);
            final byte lllllllllllllIlIlllIlIllllIIIlll = (byte)OioDatagramChannel.llllIIIllIllI[2];
            return lllllllllllllIlIlllIlIllllIIIlll;
        }
        catch (SocketTimeoutException lllllllllllllIlIlllIlIllllIllIII) {
            return OioDatagramChannel.llllIIIllIllI[0];
        }
        catch (SocketException lllllllllllllIlIlllIlIllllIlIlll) {
            if (lIlIIlllllllllI(lllllllllllllIlIlllIlIllllIlIlll.getMessage().toLowerCase(Locale.US).contains(OioDatagramChannel.llllIIIllIlII[OioDatagramChannel.llllIIIllIllI[5]]) ? 1 : 0)) {
                throw lllllllllllllIlIlllIlIllllIlIlll;
            }
            return OioDatagramChannel.llllIIIllIllI[6];
        }
        catch (Throwable lllllllllllllIlIlllIlIllllIlIllI) {
            PlatformDependent.throwException(lllllllllllllIlIlllIlIllllIlIllI);
            return OioDatagramChannel.llllIIIllIllI[6];
        }
        finally {
            if (lIlIIllllllllll(lllllllllllllIlIlllIlIllllIlIIII ? 1 : 0)) {
                lllllllllllllIlIlllIlIllllIlIIIl.release();
                "".length();
            }
        }
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress lllllllllllllIlIlllIlIllIlllllll, final NetworkInterface lllllllllllllIlIlllIlIllIllllllI, final ChannelPromise lllllllllllllIlIlllIlIlllIIIIIIl) {
        this.ensureBound();
        try {
            this.socket.joinGroup(lllllllllllllIlIlllIlIllIlllllll, lllllllllllllIlIlllIlIllIllllllI);
            lllllllllllllIlIlllIlIlllIIIIIIl.setSuccess();
            "".length();
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIlllIlIlllIIIIlIl) {
            lllllllllllllIlIlllIlIlllIIIIIIl.setFailure((Throwable)lllllllllllllIlIlllIlIlllIIIIlIl);
            "".length();
        }
        return lllllllllllllIlIlllIlIlllIIIIIIl;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIlIlllIlIlllIIllIIl, final ChannelPromise lllllllllllllIlIlllIlIlllIIlIlIl) {
        this.ensureBound();
        try {
            this.socket.joinGroup(lllllllllllllIlIlllIlIlllIIllIIl);
            lllllllllllllIlIlllIlIlllIIlIlIl.setSuccess();
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIlllIlIlllIIllIll) {
            lllllllllllllIlIlllIlIlllIIlIlIl.setFailure((Throwable)lllllllllllllIlIlllIlIlllIIllIll);
            "".length();
        }
        return lllllllllllllIlIlllIlIlllIIlIlIl;
    }
}
