// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.channel.ChannelPipeline;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.socket.DatagramChannelConfig;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import io.netty.channel.AbstractChannel;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.StringUtil;
import io.netty.channel.DefaultAddressedEnvelope;
import io.netty.channel.AddressedEnvelope;
import io.netty.buffer.ByteBuf;
import io.netty.channel.socket.DatagramPacket;
import java.io.IOException;
import io.netty.channel.ChannelOutboundBuffer;
import java.net.SocketException;
import io.netty.channel.ChannelPromise;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelFuture;
import java.net.InetAddress;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelMetadata;
import java.net.InetSocketAddress;
import io.netty.channel.socket.DatagramChannel;

public final class EpollDatagramChannel extends AbstractEpollChannel implements DatagramChannel
{
    private volatile /* synthetic */ boolean connected;
    private volatile /* synthetic */ InetSocketAddress local;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ String[] lIIlIIlIlIlIIl;
    private final /* synthetic */ EpollDatagramChannelConfig config;
    private static final /* synthetic */ String EXPECTED_TYPES;
    private volatile /* synthetic */ InetSocketAddress remote;
    private static final /* synthetic */ int[] lIIlIIlIlIlllI;
    
    @Override
    public boolean isActive() {
        int n;
        if (llIIllIlIIlIIlI(this.fd, EpollDatagramChannel.lIIlIIlIlIlllI[1]) && ((llIIllIlIIlIIll(((boolean)this.config.getOption(ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) ? 1 : 0) && !llIIllIlIIlIlII(this.isRegistered() ? 1 : 0)) || llIIllIlIIlIIll(this.active ? 1 : 0))) {
            n = EpollDatagramChannel.lIIlIIlIlIlllI[0];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x19 ^ 0x57) & ~(0xC ^ 0x42)) != 0x0;
            }
        }
        else {
            n = EpollDatagramChannel.lIIlIIlIlIlllI[2];
        }
        return n != 0;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIIllIlllIlIlIllIllI) {
        return this.leaveGroup(lllllllllllllIIllIlllIlIlIllIllI, this.newPromise());
    }
    
    private static void llIIllIlIIIllII() {
        (lIIlIIlIlIlIIl = new String[EpollDatagramChannel.lIIlIIlIlIlllI[18]])[EpollDatagramChannel.lIIlIIlIlIlllI[2]] = llIIllIlIIIIlII("IBsnNyguDzg3ACkKOSYyPg==", "MnKCA");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[0]] = llIIllIlIIIIlIl("I6McMw/q3sJE6UqC3I5hnwcdN9wkq27L", "WKlNN");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[3]] = llIIllIlIIIIlIl("pHbI0fejJnfV7N0H81YUWYmb5smpyRFp", "bygtb");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[4]] = llIIllIlIIIIlII("PzAVFzExJAoXGTYhCwYrIQ==", "REycX");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[5]] = llIIllIlIIIIlIl("bOjkKSkJ3PBygcn+U6YrapGTqCt3ie6I", "JIneX");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[6]] = llIIllIlIIIIllI("GA6f/7TRkziS8zJ7QeZS8x1VVj0wUCK6", "bDZFE");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[7]] = llIIllIlIIIIllI("kADSFZVLrYXbd7ZxsUkdES/rUMms7cCU", "ejcgo");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[8]] = llIIllIlIIIIllI("pC1WWxwuB8MRDT5+WoS7tg==", "nMTnZ");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[9]] = llIIllIlIIIIllI("9oeh6ogE+dSaOxyRIz0dUzftYYsT2Of/", "tygAg");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[10]] = llIIllIlIIIIllI("kbRAKLsplP/FkV3dwUPlPLhjjLA3AHQB", "LfrFK");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[11]] = llIIllIlIIIIllI("xs7VRYZy0Dwrgp+AS/jLGw7GNGQKHrZdodtNZvddyxI=", "bvtWV");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[12]] = llIIllIlIIIIlIl("I9/3XYjk/WGdztgXB22M1Q==", "QIEqU");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[13]] = llIIllIlIIIIlII("T2E=", "cAkhG");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[15]] = llIIllIlIIIIlII("Xkg=", "rhiTi");
        EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[16]] = llIIllIlIIIIlIl("/oEv5XYdWos=", "EakJu");
    }
    
    @Override
    public EpollDatagramChannelConfig config() {
        return this.config;
    }
    
    @Override
    protected void doBind(final SocketAddress lllllllllllllIIllIlllIlIIIllllIl) throws Exception {
        final InetSocketAddress lllllllllllllIIllIlllIlIIIllllII = (InetSocketAddress)lllllllllllllIIllIlllIlIIIllllIl;
        AbstractEpollChannel.checkResolvable(lllllllllllllIIllIlllIlIIIllllII);
        Native.bind(this.fd, lllllllllllllIIllIlllIlIIIllllII.getAddress(), lllllllllllllIIllIlllIlIIIllllII.getPort());
        this.local = Native.localAddress(this.fd);
        this.active = (EpollDatagramChannel.lIIlIIlIlIlllI[0] != 0);
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress lllllllllllllIIllIlllIlIllIllllI, final NetworkInterface lllllllllllllIIllIlllIlIlllIIIII) {
        return this.joinGroup(lllllllllllllIIllIlllIlIllIllllI, lllllllllllllIIllIlllIlIlllIIIII, this.newPromise());
    }
    
    private static boolean llIIllIlIIlIIlI(final int lllllllllllllIIllIlllIIllIIIlIll, final int lllllllllllllIIllIlllIIllIIIlIlI) {
        return lllllllllllllIIllIlllIIllIIIlIll != lllllllllllllIIllIlllIIllIIIlIlI;
    }
    
    @Override
    protected void doDisconnect() throws Exception {
        this.connected = (EpollDatagramChannel.lIIlIIlIlIlllI[2] != 0);
    }
    
    public EpollDatagramChannel() {
        super(Native.socketDgramFd(), EpollDatagramChannel.lIIlIIlIlIlllI[0]);
        this.config = new EpollDatagramChannelConfig(this);
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIIllIlllIlIIlIllllI, final InetAddress lllllllllllllIIllIlllIlIIlIlllIl) {
        return this.block(lllllllllllllIIllIlllIlIIlIllllI, lllllllllllllIIllIlllIlIIlIlllIl, this.newPromise());
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIIllIlllIlIIlIIlllI, final InetAddress lllllllllllllIIllIlllIlIIlIIllIl, final ChannelPromise lllllllllllllIIllIlllIlIIlIlIIII) {
        try {
            return this.block(lllllllllllllIIllIlllIlIIlIIlllI, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), lllllllllllllIIllIlllIlIIlIIllIl, lllllllllllllIIllIlllIlIIlIlIIII);
        }
        catch (Throwable lllllllllllllIIllIlllIlIIlIlIlII) {
            lllllllllllllIIllIlllIlIIlIlIIII.setFailure(lllllllllllllIIllIlllIlIIlIlIlII);
            "".length();
            return lllllllllllllIIllIlllIlIIlIlIIII;
        }
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIIllIlllIlIlIIIlIIl, final NetworkInterface lllllllllllllIIllIlllIlIlIIIllII, final InetAddress lllllllllllllIIllIlllIlIlIIIlIll) {
        return this.leaveGroup(lllllllllllllIIllIlllIlIlIIIlIIl, lllllllllllllIIllIlllIlIlIIIllII, lllllllllllllIIllIlllIlIlIIIlIll, this.newPromise());
    }
    
    @Override
    public boolean isConnected() {
        return this.connected;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIIllIlllIlIlIlIllIl, final ChannelPromise lllllllllllllIIllIlllIlIlIlIlIIl) {
        try {
            return this.leaveGroup(lllllllllllllIIllIlllIlIlIlIllIl, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), null, lllllllllllllIIllIlllIlIlIlIlIIl);
        }
        catch (SocketException lllllllllllllIIllIlllIlIlIlIllll) {
            lllllllllllllIIllIlllIlIlIlIlIIl.setFailure((Throwable)lllllllllllllIIllIlllIlIlIlIllll);
            "".length();
            return lllllllllllllIIllIlllIlIlIlIlIIl;
        }
    }
    
    private static void llIIllIlIIlIIIl() {
        (lIIlIIlIlIlllI = new int[19])[0] = " ".length();
        EpollDatagramChannel.lIIlIIlIlIlllI[1] = -" ".length();
        EpollDatagramChannel.lIIlIIlIlIlllI[2] = ((0xB5 ^ 0x82 ^ (0x93 ^ 0xA0)) & (0x60 ^ 0x55 ^ (0xB ^ 0x3A) ^ -" ".length()));
        EpollDatagramChannel.lIIlIIlIlIlllI[3] = "  ".length();
        EpollDatagramChannel.lIIlIIlIlIlllI[4] = "   ".length();
        EpollDatagramChannel.lIIlIIlIlIlllI[5] = (0xC5 ^ 0xB1 ^ (0x51 ^ 0x21));
        EpollDatagramChannel.lIIlIIlIlIlllI[6] = (0x16 ^ 0x13);
        EpollDatagramChannel.lIIlIIlIlIlllI[7] = (0x5A ^ 0xE ^ (0x15 ^ 0x47));
        EpollDatagramChannel.lIIlIIlIlIlllI[8] = (0x61 ^ 0x66);
        EpollDatagramChannel.lIIlIIlIlIlllI[9] = (0xD2 ^ 0x9E ^ (0x60 ^ 0x24));
        EpollDatagramChannel.lIIlIIlIlIlllI[10] = (0x82 ^ 0xC2 ^ (0x4D ^ 0x4));
        EpollDatagramChannel.lIIlIIlIlIlllI[11] = (0x5F ^ 0x55);
        EpollDatagramChannel.lIIlIIlIlIlllI[12] = (0x2C ^ 0xF ^ (0x91 ^ 0xB9));
        EpollDatagramChannel.lIIlIIlIlIlllI[13] = (62 + 157 - 205 + 171 ^ 52 + 80 - 118 + 167);
        EpollDatagramChannel.lIIlIIlIlIlllI[14] = (0x57 ^ 0x6B);
        EpollDatagramChannel.lIIlIIlIlIlllI[15] = (0xFE ^ 0x9B ^ (0x5A ^ 0x32));
        EpollDatagramChannel.lIIlIIlIlIlllI[16] = (0x88 ^ 0x86);
        EpollDatagramChannel.lIIlIIlIlIlllI[17] = (0x10 ^ 0x39);
        EpollDatagramChannel.lIIlIIlIlIlllI[18] = (0x3C ^ 0x33);
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIIllIlllIlIIllIlIlI, final NetworkInterface lllllllllllllIIllIlllIlIIllIIlIl, final InetAddress lllllllllllllIIllIlllIlIIllIIlII, final ChannelPromise lllllllllllllIIllIlllIlIIllIIIll) {
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIllIlIlI)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[7]]);
        }
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIllIIlII)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[8]]);
        }
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIllIIlIl)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[9]]);
        }
        lllllllllllllIIllIlllIlIIllIIIll.setFailure((Throwable)new UnsupportedOperationException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[10]]));
        "".length();
        return lllllllllllllIIllIlllIlIIllIIIll;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIIllIlllIlIIIlIlllI) throws Exception {
        do {
            final Object lllllllllllllIIllIlllIlIIIllIIII = lllllllllllllIIllIlllIlIIIlIlllI.current();
            if (!llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIIllIIII)) {
                try {
                    boolean lllllllllllllIIllIlllIlIIIllIIlI = EpollDatagramChannel.lIIlIIlIlIlllI[2] != 0;
                    int lllllllllllllIIllIlllIlIIIllIIll = this.config().getWriteSpinCount() - EpollDatagramChannel.lIIlIIlIlIlllI[0];
                    while (llIIllIlIIlIllI(lllllllllllllIIllIlllIlIIIllIIll)) {
                        if (llIIllIlIIlIIll(this.doWriteMessage(lllllllllllllIIllIlllIlIIIllIIII) ? 1 : 0)) {
                            lllllllllllllIIllIlllIlIIIllIIlI = (EpollDatagramChannel.lIIlIIlIlIlllI[0] != 0);
                            "".length();
                            if ("   ".length() == " ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            --lllllllllllllIIllIlllIlIIIllIIll;
                            "".length();
                            if (null != null) {
                                return;
                            }
                            continue;
                        }
                    }
                    if (llIIllIlIIlIIll(lllllllllllllIIllIlllIlIIIllIIlI ? 1 : 0)) {
                        lllllllllllllIIllIlllIlIIIlIlllI.remove();
                        "".length();
                        "".length();
                        if ((0x8D ^ 0x89) != (0x50 ^ 0x54)) {
                            return;
                        }
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        this.setEpollOut();
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        return;
                    }
                }
                catch (IOException lllllllllllllIIllIlllIlIIIllIIIl) {
                    lllllllllllllIIllIlllIlIIIlIlllI.remove(lllllllllllllIIllIlllIlIIIllIIIl);
                    "".length();
                }
                "".length();
                continue;
            }
            this.clearEpollOut();
            "".length();
            if ("  ".length() < ((0x11 ^ 0x45) & ~(0xEB ^ 0xBF))) {
                return;
            }
        } while (-" ".length() == -" ".length());
    }
    
    @Override
    protected Object filterOutboundMessage(final Object lllllllllllllIIllIlllIlIIIIIIIlI) {
        if (llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIIIIlI instanceof DatagramPacket) ? 1 : 0)) {
            final DatagramPacket lllllllllllllIIllIlllIlIIIIIlIlI = (DatagramPacket)lllllllllllllIIllIlllIlIIIIIIIlI;
            final ByteBuf lllllllllllllIIllIlllIlIIIIIlIIl = ((DefaultAddressedEnvelope<ByteBuf, A>)lllllllllllllIIllIlllIlIIIIIlIlI).content();
            if (llIIllIlIIlIIll(lllllllllllllIIllIlllIlIIIIIlIIl.hasMemoryAddress() ? 1 : 0)) {
                return lllllllllllllIIllIlllIlIIIIIIIlI;
            }
            return new DatagramPacket(this.newDirectBuffer(lllllllllllllIIllIlllIlIIIIIlIlI, lllllllllllllIIllIlllIlIIIIIlIIl), ((DefaultAddressedEnvelope<M, InetSocketAddress>)lllllllllllllIIllIlllIlIIIIIlIlI).recipient());
        }
        else {
            if (!llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIIIIlI instanceof ByteBuf) ? 1 : 0)) {
                if (llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIIIIlI instanceof AddressedEnvelope) ? 1 : 0)) {
                    final AddressedEnvelope<Object, SocketAddress> lllllllllllllIIllIlllIlIIIIIIllI = (AddressedEnvelope<Object, SocketAddress>)lllllllllllllIIllIlllIlIIIIIIIlI;
                    if (llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIIIllI.content() instanceof ByteBuf) ? 1 : 0) && (!llIIllIlIIllIII(lllllllllllllIIllIlllIlIIIIIIllI.recipient()) || llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIIIllI.recipient() instanceof InetSocketAddress) ? 1 : 0))) {
                        final ByteBuf lllllllllllllIIllIlllIlIIIIIIlll = lllllllllllllIIllIlllIlIIIIIIllI.content();
                        if (llIIllIlIIlIIll(lllllllllllllIIllIlllIlIIIIIIlll.hasMemoryAddress() ? 1 : 0)) {
                            return lllllllllllllIIllIlllIlIIIIIIllI;
                        }
                        return new DefaultAddressedEnvelope(this.newDirectBuffer(lllllllllllllIIllIlllIlIIIIIIllI, lllllllllllllIIllIlllIlIIIIIIlll), lllllllllllllIIllIlllIlIIIIIIllI.recipient());
                    }
                }
                throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[11]]).append(StringUtil.simpleClassName(lllllllllllllIIllIlllIlIIIIIIIlI)).append(EpollDatagramChannel.EXPECTED_TYPES)));
            }
            final ByteBuf lllllllllllllIIllIlllIlIIIIIlIII = (ByteBuf)lllllllllllllIIllIlllIlIIIIIIIlI;
            if (llIIllIlIIlIIll(lllllllllllllIIllIlllIlIIIIIlIII.hasMemoryAddress() ? 1 : 0)) {
                return lllllllllllllIIllIlllIlIIIIIIIlI;
            }
            return this.newDirectBuffer(lllllllllllllIIllIlllIlIIIIIlIII);
        }
    }
    
    private static boolean llIIllIlIIlIlll(final int lllllllllllllIIllIlllIIllIIIlllI) {
        return lllllllllllllIIllIlllIIllIIIlllI > 0;
    }
    
    private static String llIIllIlIIIIlII(String lllllllllllllIIllIlllIIlllIIIIII, final String lllllllllllllIIllIlllIIlllIIIlII) {
        lllllllllllllIIllIlllIIlllIIIIII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlllIIlllIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlllIIlllIIIIll = new StringBuilder();
        final char[] lllllllllllllIIllIlllIIlllIIIIlI = lllllllllllllIIllIlllIIlllIIIlII.toCharArray();
        int lllllllllllllIIllIlllIIlllIIIIIl = EpollDatagramChannel.lIIlIIlIlIlllI[2];
        final float lllllllllllllIIllIlllIIllIlllIll = (Object)((String)lllllllllllllIIllIlllIIlllIIIIII).toCharArray();
        final byte lllllllllllllIIllIlllIIllIlllIlI = (byte)lllllllllllllIIllIlllIIllIlllIll.length;
        Exception lllllllllllllIIllIlllIIllIlllIIl = (Exception)EpollDatagramChannel.lIIlIIlIlIlllI[2];
        while (llIIllIlIIllIIl((int)lllllllllllllIIllIlllIIllIlllIIl, lllllllllllllIIllIlllIIllIlllIlI)) {
            final char lllllllllllllIIllIlllIIlllIIIllI = lllllllllllllIIllIlllIIllIlllIll[lllllllllllllIIllIlllIIllIlllIIl];
            lllllllllllllIIllIlllIIlllIIIIll.append((char)(lllllllllllllIIllIlllIIlllIIIllI ^ lllllllllllllIIllIlllIIlllIIIIlI[lllllllllllllIIllIlllIIlllIIIIIl % lllllllllllllIIllIlllIIlllIIIIlI.length]));
            "".length();
            ++lllllllllllllIIllIlllIIlllIIIIIl;
            ++lllllllllllllIIllIlllIIllIlllIIl;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlllIIlllIIIIll);
    }
    
    private static boolean llIIllIlIIllIIl(final int lllllllllllllIIllIlllIIllIIllIll, final int lllllllllllllIIllIlllIIllIIllIlI) {
        return lllllllllllllIIllIlllIIllIIllIll < lllllllllllllIIllIlllIIllIIllIlI;
    }
    
    private static boolean llIIllIlIIlIlII(final int lllllllllllllIIllIlllIIllIIlIIlI) {
        return lllllllllllllIIllIlllIIllIIlIIlI == 0;
    }
    
    static {
        llIIllIlIIlIIIl();
        llIIllIlIIIllII();
        METADATA = new ChannelMetadata((boolean)(EpollDatagramChannel.lIIlIIlIlIlllI[0] != 0));
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[12]]).append(StringUtil.simpleClassName(DatagramPacket.class)).append(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[13]]).append(StringUtil.simpleClassName(AddressedEnvelope.class)).append((char)EpollDatagramChannel.lIIlIIlIlIlllI[14]).append(StringUtil.simpleClassName(ByteBuf.class)).append(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[15]]).append(StringUtil.simpleClassName(InetSocketAddress.class)).append(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[16]]).append(StringUtil.simpleClassName(ByteBuf.class)).append((char)EpollDatagramChannel.lIIlIIlIlIlllI[17]));
    }
    
    private boolean doWriteMessage(final Object lllllllllllllIIllIlllIlIIIIllIlI) throws IOException {
        ByteBuf lllllllllllllIIllIlllIlIIIIllIIl = null;
        InetSocketAddress lllllllllllllIIllIlllIlIIIIllIII;
        if (llIIllIlIIlIIll((lllllllllllllIIllIlllIlIIIIllIlI instanceof AddressedEnvelope) ? 1 : 0)) {
            final AddressedEnvelope<ByteBuf, InetSocketAddress> lllllllllllllIIllIlllIlIIIlIIIIl = (AddressedEnvelope<ByteBuf, InetSocketAddress>)lllllllllllllIIllIlllIlIIIIllIlI;
            final ByteBuf lllllllllllllIIllIlllIlIIIlIIIII = lllllllllllllIIllIlllIlIIIlIIIIl.content();
            final InetSocketAddress lllllllllllllIIllIlllIlIIIIlllll = lllllllllllllIIllIlllIlIIIlIIIIl.recipient();
            "".length();
            if (null != null) {
                return ((0x76 ^ 0x5B ^ ((0x64 ^ 0x7C) & ~(0x3A ^ 0x22))) & (24 + 102 - 99 + 146 ^ 123 + 41 - 64 + 28 ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIllIlllIlIIIIllIIl = (ByteBuf)lllllllllllllIIllIlllIlIIIIllIlI;
            lllllllllllllIIllIlllIlIIIIllIII = null;
        }
        final int lllllllllllllIIllIlllIlIIIIlIlll = lllllllllllllIIllIlllIlIIIIllIIl.readableBytes();
        if (llIIllIlIIlIlII(lllllllllllllIIllIlllIlIIIIlIlll)) {
            return EpollDatagramChannel.lIIlIIlIlIlllI[0] != 0;
        }
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIIIllIII)) {
            lllllllllllllIIllIlllIlIIIIllIII = this.remote;
            if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIIIIllIII)) {
                throw new NotYetConnectedException();
            }
        }
        int lllllllllllllIIllIlllIlIIIIlIllI = 0;
        if (llIIllIlIIlIIll(lllllllllllllIIllIlllIlIIIIllIIl.hasMemoryAddress() ? 1 : 0)) {
            final long lllllllllllllIIllIlllIlIIIIllllI = lllllllllllllIIllIlllIlIIIIllIIl.memoryAddress();
            final int lllllllllllllIIllIlllIlIIIIlllIl = Native.sendToAddress(this.fd, lllllllllllllIIllIlllIlIIIIllllI, lllllllllllllIIllIlllIlIIIIllIIl.readerIndex(), lllllllllllllIIllIlllIlIIIIllIIl.writerIndex(), lllllllllllllIIllIlllIlIIIIllIII.getAddress(), lllllllllllllIIllIlllIlIIIIllIII.getPort());
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0x15 ^ 0x2) & ~(0x71 ^ 0x66)) != 0x0;
            }
        }
        else {
            final ByteBuffer lllllllllllllIIllIlllIlIIIIlllII = lllllllllllllIIllIlllIlIIIIllIIl.internalNioBuffer(lllllllllllllIIllIlllIlIIIIllIIl.readerIndex(), lllllllllllllIIllIlllIlIIIIllIIl.readableBytes());
            lllllllllllllIIllIlllIlIIIIlIllI = Native.sendTo(this.fd, lllllllllllllIIllIlllIlIIIIlllII, lllllllllllllIIllIlllIlIIIIlllII.position(), lllllllllllllIIllIlllIlIIIIlllII.limit(), lllllllllllllIIllIlllIlIIIIllIII.getAddress(), lllllllllllllIIllIlllIlIIIIllIII.getPort());
        }
        int n;
        if (llIIllIlIIlIlll(lllllllllllllIIllIlllIlIIIIlIllI)) {
            n = EpollDatagramChannel.lIIlIIlIlIlllI[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((59 + 22 - 61 + 152 ^ 124 + 87 - 46 + 17) & (98 + 111 - 35 + 45 ^ 170 + 143 - 203 + 83 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollDatagramChannel.lIIlIIlIlIlllI[2];
        }
        return n != 0;
    }
    
    @Override
    protected InetSocketAddress remoteAddress0() {
        return this.remote;
    }
    
    private static boolean llIIllIlIIlIIll(final int lllllllllllllIIllIlllIIllIIlIlII) {
        return lllllllllllllIIllIlllIIllIIlIlII != 0;
    }
    
    private static String llIIllIlIIIIlIl(final String lllllllllllllIIllIlllIIllIlIlllI, final String lllllllllllllIIllIlllIIllIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), EpollDatagramChannel.lIIlIIlIlIlllI[9]), "DES");
            final Cipher lllllllllllllIIllIlllIIllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIllIlllIIllIllIIlI.init(EpollDatagramChannel.lIIlIIlIlIlllI[3], lllllllllllllIIllIlllIIllIllIIll);
            return new String(lllllllllllllIIllIlllIIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIIllIllIIIl) {
            lllllllllllllIIllIlllIIllIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllIlIIllIII(final Object lllllllllllllIIllIlllIIllIIllIII) {
        return lllllllllllllIIllIlllIIllIIllIII != null;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIIllIlllIlIlllIlIII, final ChannelPromise lllllllllllllIIllIlllIlIlllIIlll) {
        try {
            return this.joinGroup(lllllllllllllIIllIlllIlIlllIlIII, NetworkInterface.getByInetAddress(this.localAddress().getAddress()), null, lllllllllllllIIllIlllIlIlllIIlll);
        }
        catch (SocketException lllllllllllllIIllIlllIlIlllIllIl) {
            lllllllllllllIIllIlllIlIlllIIlll.setFailure((Throwable)lllllllllllllIIllIlllIlIlllIllIl);
            "".length();
            return lllllllllllllIIllIlllIlIlllIIlll;
        }
    }
    
    @Override
    public ChannelFuture block(final InetAddress lllllllllllllIIllIlllIlIIlllIllI, final NetworkInterface lllllllllllllIIllIlllIlIIlllIlIl, final InetAddress lllllllllllllIIllIlllIlIIlllIlII) {
        return this.block(lllllllllllllIIllIlllIlIIlllIllI, lllllllllllllIIllIlllIlIIlllIlIl, lllllllllllllIIllIlllIlIIlllIlII, this.newPromise());
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIIllIlllIlIllIIIlll, final NetworkInterface lllllllllllllIIllIlllIlIllIIIllI, final InetAddress lllllllllllllIIllIlllIlIllIIlIIl) {
        return this.joinGroup(lllllllllllllIIllIlllIlIllIIIlll, lllllllllllllIIllIlllIlIllIIIllI, lllllllllllllIIllIlllIlIllIIlIIl, this.newPromise());
    }
    
    private static boolean llIIllIlIIlIllI(final int lllllllllllllIIllIlllIIllIIlIIII) {
        return lllllllllllllIIllIlllIIllIIlIIII >= 0;
    }
    
    @Override
    public ChannelMetadata metadata() {
        return EpollDatagramChannel.METADATA;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIIllIlllIlIlIllllII, final NetworkInterface lllllllllllllIIllIlllIlIlIllllll, final InetAddress lllllllllllllIIllIlllIlIlIlllllI, final ChannelPromise lllllllllllllIIllIlllIlIlIllllIl) {
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIlIllllII)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[2]]);
        }
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIlIllllll)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[0]]);
        }
        lllllllllllllIIllIlllIlIlIllllIl.setFailure((Throwable)new UnsupportedOperationException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[3]]));
        "".length();
        return lllllllllllllIIllIlllIlIlIllllIl;
    }
    
    @Override
    protected InetSocketAddress localAddress0() {
        return this.local;
    }
    
    @Override
    public ChannelFuture joinGroup(final InetSocketAddress lllllllllllllIIllIlllIlIllIlIIll, final NetworkInterface lllllllllllllIIllIlllIlIllIlIIlI, final ChannelPromise lllllllllllllIIllIlllIlIllIlIlIl) {
        return this.joinGroup(lllllllllllllIIllIlllIlIllIlIIll.getAddress(), lllllllllllllIIllIlllIlIllIlIIlI, null, lllllllllllllIIllIlllIlIllIlIlIl);
    }
    
    private static boolean llIIllIlIIlIlIl(final Object lllllllllllllIIllIlllIIllIIlIllI) {
        return lllllllllllllIIllIlllIIllIIlIllI == null;
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetAddress lllllllllllllIIllIlllIlIlIIIIIlI, final NetworkInterface lllllllllllllIIllIlllIlIlIIIIIIl, final InetAddress lllllllllllllIIllIlllIlIlIIIIIII, final ChannelPromise lllllllllllllIIllIlllIlIIlllllll) {
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIlIIIIIlI)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[4]]);
        }
        if (llIIllIlIIlIlIl(lllllllllllllIIllIlllIlIlIIIIIIl)) {
            throw new NullPointerException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[5]]);
        }
        lllllllllllllIIllIlllIlIIlllllll.setFailure((Throwable)new UnsupportedOperationException(EpollDatagramChannel.lIIlIIlIlIlIIl[EpollDatagramChannel.lIIlIIlIlIlllI[6]]));
        "".length();
        return lllllllllllllIIllIlllIlIIlllllll;
    }
    
    @Override
    protected AbstractEpollUnsafe newUnsafe() {
        return new EpollDatagramChannelUnsafe();
    }
    
    private static String llIIllIlIIIIllI(final String lllllllllllllIIllIlllIIllIlIIIIl, final String lllllllllllllIIllIlllIIllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIIllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlllIIllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlllIIllIlIIlIl.init(EpollDatagramChannel.lIIlIIlIlIlllI[3], lllllllllllllIIllIlllIIllIlIIllI);
            return new String(lllllllllllllIIllIlllIIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIIllIlIIlII) {
            lllllllllllllIIllIlllIIllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress lllllllllllllIIllIlllIlIlIIllIIl, final NetworkInterface lllllllllllllIIllIlllIlIlIIllIII, final ChannelPromise lllllllllllllIIllIlllIlIlIIlIlll) {
        return this.leaveGroup(lllllllllllllIIllIlllIlIlIIllIIl.getAddress(), lllllllllllllIIllIlllIlIlIIllIII, null, lllllllllllllIIllIlllIlIlIIlIlll);
    }
    
    @Override
    public ChannelFuture joinGroup(final InetAddress lllllllllllllIIllIlllIlIllllIlII) {
        return this.joinGroup(lllllllllllllIIllIlllIlIllllIlII, this.newPromise());
    }
    
    @Override
    public ChannelFuture leaveGroup(final InetSocketAddress lllllllllllllIIllIlllIlIlIlIIIII, final NetworkInterface lllllllllllllIIllIlllIlIlIIlllll) {
        return this.leaveGroup(lllllllllllllIIllIlllIlIlIlIIIII, lllllllllllllIIllIlllIlIlIIlllll, this.newPromise());
    }
    
    static final class DatagramSocketAddress extends InetSocketAddress
    {
        final /* synthetic */ int receivedAmount;
        
        DatagramSocketAddress(final String llllllllllllIllllIIlIIIIlIllIlII, final int llllllllllllIllllIIlIIIIlIllIlll, final int llllllllllllIllllIIlIIIIlIllIllI) {
            super(llllllllllllIllllIIlIIIIlIllIlII, llllllllllllIllllIIlIIIIlIllIlll);
            this.receivedAmount = llllllllllllIllllIIlIIIIlIllIllI;
        }
    }
    
    final class EpollDatagramChannelUnsafe extends AbstractEpollUnsafe
    {
        private static final /* synthetic */ int[] llIlllIlIlIIll;
        static final /* synthetic */ boolean $assertionsDisabled;
        private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
        
        private static boolean lIIllIIlllIlIlII(final int llllllllllllIllIIlIIIlllIllllIIl) {
            return llllllllllllIllIIlIIIlllIllllIIl == 0;
        }
        
        private static boolean lIIllIIlllIlIllI(final int llllllllllllIllIIlIIIlllIllllIll) {
            return llllllllllllIllIIlIIIlllIllllIll != 0;
        }
        
        static {
            lIIllIIlllIlIIlI();
            int $assertionsDisabled2;
            if (lIIllIIlllIlIlII(EpollDatagramChannel.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = EpollDatagramChannelUnsafe.llIlllIlIlIIll[1];
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = EpollDatagramChannelUnsafe.llIlllIlIlIIll[0];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static void lIIllIIlllIlIIlI() {
            (llIlllIlIlIIll = new int[2])[0] = ((0xCE ^ 0xC1 ^ (0x1E ^ 0x29)) & (0x89 ^ 0xAB ^ (0x5F ^ 0x45) ^ -" ".length()));
            EpollDatagramChannelUnsafe.llIlllIlIlIIll[1] = " ".length();
        }
        
        @Override
        public void connect(final SocketAddress llllllllllllIllIIlIIIllllIlIlIll, final SocketAddress llllllllllllIllIIlIIIllllIlIIlIl, final ChannelPromise llllllllllllIllIIlIIIllllIlIlIIl) {
            boolean llllllllllllIllIIlIIIllllIlIlIII = EpollDatagramChannelUnsafe.llIlllIlIlIIll[0] != 0;
            try {
                try {
                    final InetSocketAddress llllllllllllIllIIlIIIllllIlIlllI = (InetSocketAddress)llllllllllllIllIIlIIIllllIlIlIll;
                    if (lIIllIIlllIlIIll(llllllllllllIllIIlIIIllllIlIIlIl)) {
                        final InetSocketAddress llllllllllllIllIIlIIIllllIlIllll = (InetSocketAddress)llllllllllllIllIIlIIIllllIlIIlIl;
                        EpollDatagramChannel.this.doBind(llllllllllllIllIIlIIIllllIlIllll);
                    }
                    AbstractEpollChannel.checkResolvable(llllllllllllIllIIlIIIllllIlIlllI);
                    EpollDatagramChannel.this.remote = llllllllllllIllIIlIIIllllIlIlllI;
                    "".length();
                    EpollDatagramChannel.this.local = Native.localAddress(EpollDatagramChannel.this.fd);
                    "".length();
                    llllllllllllIllIIlIIIllllIlIlIII = (EpollDatagramChannelUnsafe.llIlllIlIlIIll[1] != 0);
                    if (lIIllIIlllIlIlII(llllllllllllIllIIlIIIllllIlIlIII ? 1 : 0)) {
                        EpollDatagramChannel.this.doClose();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIlIIIllllIlIlIIl.setSuccess();
                        "".length();
                        EpollDatagramChannel.this.connected = (boolean)(EpollDatagramChannelUnsafe.llIlllIlIlIIll[1] != 0);
                        "".length();
                        "".length();
                        if (((0x4F ^ 0x7C ^ (0xB0 ^ 0xBC)) & (0xB0 ^ 0x8C ^ "   ".length() ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
                finally {
                    if (lIIllIIlllIlIlII(llllllllllllIllIIlIIIllllIlIlIII ? 1 : 0)) {
                        EpollDatagramChannel.this.doClose();
                        "".length();
                        if ("   ".length() < -" ".length()) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllIIlIIIllllIlIlIIl.setSuccess();
                        "".length();
                        EpollDatagramChannel.this.connected = (boolean)(EpollDatagramChannelUnsafe.llIlllIlIlIIll[1] != 0);
                        "".length();
                    }
                }
                "".length();
                if (((0x5C ^ 0x7B) & ~(0x74 ^ 0x53)) != 0x0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIIlIIIllllIlIllIl) {
                llllllllllllIllIIlIIIllllIlIlIIl.setFailure(llllllllllllIllIIlIIIllllIlIllIl);
                "".length();
            }
        }
        
        private static boolean lIIllIIlllIlIlIl(final Object llllllllllllIllIIlIIIlllIlllllIl) {
            return llllllllllllIllIIlIIIlllIlllllIl == null;
        }
        
        private static boolean lIIllIIlllIlIIll(final Object llllllllllllIllIIlIIIlllIlllllll) {
            return llllllllllllIllIIlIIIlllIlllllll != null;
        }
        
        @Override
        void epollInReady() {
            final DatagramChannelConfig llllllllllllIllIIlIIIllllIIIllIl = EpollDatagramChannel.this.config();
            RecvByteBufAllocator.Handle llllllllllllIllIIlIIIllllIIIllII = this.allocHandle;
            if (lIIllIIlllIlIlIl(llllllllllllIllIIlIIIllllIIIllII)) {
                llllllllllllIllIIlIIIllllIIIllII = (this.allocHandle = llllllllllllIllIIlIIIllllIIIllIl.getRecvByteBufAllocator().newHandle());
            }
            if (lIIllIIlllIlIlII(EpollDatagramChannelUnsafe.$assertionsDisabled ? 1 : 0) && lIIllIIlllIlIlII(EpollDatagramChannel.this.eventLoop().inEventLoop() ? 1 : 0)) {
                throw new AssertionError();
            }
            final ChannelPipeline llllllllllllIllIIlIIIllllIIIlIll = EpollDatagramChannel.this.pipeline();
            try {
                do {
                    ByteBuf llllllllllllIllIIlIIIllllIIIllll = null;
                    Label_0508: {
                        try {
                            llllllllllllIllIIlIIIllllIIIllll = llllllllllllIllIIlIIIllllIIIllII.allocate(llllllllllllIllIIlIIIllllIIIllIl.getAllocator());
                            final int llllllllllllIllIIlIIIllllIIlIIll = llllllllllllIllIIlIIIllllIIIllll.writerIndex();
                            DatagramSocketAddress llllllllllllIllIIlIIIllllIIlIIlI = null;
                            if (lIIllIIlllIlIllI(llllllllllllIllIIlIIIllllIIIllll.hasMemoryAddress() ? 1 : 0)) {
                                final DatagramSocketAddress llllllllllllIllIIlIIIllllIIlIlIl = Native.recvFromAddress(EpollDatagramChannel.this.fd, llllllllllllIllIIlIIIllllIIIllll.memoryAddress(), llllllllllllIllIIlIIIllllIIlIIll, llllllllllllIllIIlIIIllllIIIllll.capacity());
                                "".length();
                                if (" ".length() >= "  ".length()) {
                                    return;
                                }
                            }
                            else {
                                final ByteBuffer llllllllllllIllIIlIIIllllIIlIlII = llllllllllllIllIIlIIIllllIIIllll.internalNioBuffer(llllllllllllIllIIlIIIllllIIlIIll, llllllllllllIllIIlIIIllllIIIllll.writableBytes());
                                llllllllllllIllIIlIIIllllIIlIIlI = Native.recvFrom(EpollDatagramChannel.this.fd, llllllllllllIllIIlIIIllllIIlIlII, llllllllllllIllIIlIIIllllIIlIlII.position(), llllllllllllIllIIlIIIllllIIlIlII.limit());
                            }
                            if (lIIllIIlllIlIlIl(llllllllllllIllIIlIIIllllIIlIIlI)) {
                                if (!lIIllIIlllIlIIll(llllllllllllIllIIlIIIllllIIIllll)) {
                                    break Label_0508;
                                }
                                llllllllllllIllIIlIIIllllIIIllll.release();
                                "".length();
                                "".length();
                                if (((0x5E ^ 0x69 ^ (0x77 ^ 0x4C)) & (0x22 ^ 0x42 ^ (0x14 ^ 0x78) ^ -" ".length())) == -" ".length()) {
                                    return;
                                }
                                break Label_0508;
                            }
                            else {
                                final int llllllllllllIllIIlIIIllllIIlIIIl = llllllllllllIllIIlIIIllllIIlIIlI.receivedAmount;
                                llllllllllllIllIIlIIIllllIIIllll.writerIndex(llllllllllllIllIIlIIIllllIIIllll.writerIndex() + llllllllllllIllIIlIIIllllIIlIIIl);
                                "".length();
                                llllllllllllIllIIlIIIllllIIIllII.record(llllllllllllIllIIlIIIllllIIlIIIl);
                                this.readPending = (EpollDatagramChannelUnsafe.llIlllIlIlIIll[0] != 0);
                                llllllllllllIllIIlIIIllllIIIlIll.fireChannelRead(new DatagramPacket(llllllllllllIllIIlIIIllllIIIllll, (InetSocketAddress)this.localAddress(), llllllllllllIllIIlIIIllllIIlIIlI));
                                "".length();
                                llllllllllllIllIIlIIIllllIIIllll = null;
                                if (lIIllIIlllIlIIll(llllllllllllIllIIlIIIllllIIIllll)) {
                                    llllllllllllIllIIlIIIllllIIIllll.release();
                                    "".length();
                                    "".length();
                                    if (-" ".length() > " ".length()) {
                                        return;
                                    }
                                }
                            }
                        }
                        catch (Throwable llllllllllllIllIIlIIIllllIIlIIII) {
                            llllllllllllIllIIlIIIllllIIIlIll.fireChannelReadComplete();
                            "".length();
                            llllllllllllIllIIlIIIllllIIIlIll.fireExceptionCaught(llllllllllllIllIIlIIIllllIIlIIII);
                            "".length();
                            if (lIIllIIlllIlIIll(llllllllllllIllIIlIIIllllIIIllll)) {
                                llllllllllllIllIIlIIIllllIIIllll.release();
                                "".length();
                                "".length();
                                if ("   ".length() < 0) {
                                    return;
                                }
                            }
                        }
                        finally {
                            if (lIIllIIlllIlIIll(llllllllllllIllIIlIIIllllIIIllll)) {
                                llllllllllllIllIIlIIIllllIIIllll.release();
                                "".length();
                            }
                        }
                        "".length();
                        continue;
                    }
                    if (!lIIllIIlllIlIlII(EpollDatagramChannel.this.config().isAutoRead() ? 1 : 0) || !lIIllIIlllIlIlII(this.readPending ? 1 : 0)) {
                        return;
                    }
                    EpollDatagramChannel.this.clearEpollIn();
                    "".length();
                    if (null != null) {
                        return;
                    }
                } while ((108 + 122 - 138 + 76 ^ 115 + 89 - 161 + 129) > 0);
            }
            finally {
                if (lIIllIIlllIlIlII(EpollDatagramChannel.this.config().isAutoRead() ? 1 : 0) && lIIllIIlllIlIlII(this.readPending ? 1 : 0)) {
                    EpollDatagramChannel.this.clearEpollIn();
                }
            }
        }
    }
}
