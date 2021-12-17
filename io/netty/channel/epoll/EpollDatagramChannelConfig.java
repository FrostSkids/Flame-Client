// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.util.Map;
import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.Channel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.InetAddress;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import java.net.NetworkInterface;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.socket.DatagramChannelConfig;
import io.netty.channel.DefaultChannelConfig;

public final class EpollDatagramChannelConfig extends DefaultChannelConfig implements DatagramChannelConfig
{
    private static final /* synthetic */ RecvByteBufAllocator DEFAULT_RCVBUF_ALLOCATOR;
    private static final /* synthetic */ int[] lIIIlIllllllll;
    private final /* synthetic */ EpollDatagramChannel datagramChannel;
    private /* synthetic */ boolean activeOnOpen;
    private static final /* synthetic */ String[] lIIIlIllllIlll;
    
    private static boolean llIIIIlIIlIllII(final Object lllllllllllllIlIIIIlIIIIlIllIlII, final Object lllllllllllllIlIIIIlIIIIlIllIIll) {
        return lllllllllllllIlIIIIlIIIIlIllIlII == lllllllllllllIlIIIIlIIIIlIllIIll;
    }
    
    @Override
    public NetworkInterface getNetworkInterface() {
        return null;
    }
    
    @Override
    public int getTrafficClass() {
        return Native.getTrafficClass(this.datagramChannel.fd);
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIlIIIIlIIlIIIIlIlIl, final T lllllllllllllIlIIIIlIIlIIIIlIlII) {
        this.validate(lllllllllllllIlIIIIlIIlIIIIlIlIl, lllllllllllllIlIIIIlIIlIIIIlIlII);
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.SO_BROADCAST)) {
            this.setBroadcast((boolean)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (((0xEC ^ 0x84 ^ (0xE6 ^ 0x9C)) & (124 + 58 - 69 + 69 ^ 44 + 53 + 7 + 60 ^ -" ".length())) == " ".length()) {
                return ((" ".length() ^ (0x3 ^ 0x56)) & (140 + 140 - 217 + 191 ^ 5 + 50 + 21 + 94 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0x30 ^ 0x74) & ~(0x64 ^ 0x20)) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return ((0x78 ^ 0x28 ^ (0xF2 ^ 0xBB)) & (0xB5 ^ 0x84 ^ (0xA5 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if ((0x6 ^ 0x44 ^ (0xDB ^ 0x9C)) == 0x0) {
                return ((0x3A ^ 0x4F ^ (0xC2 ^ 0x8A)) & (0x6E ^ 0x68 ^ (0x4C ^ 0x77) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.IP_MULTICAST_LOOP_DISABLED)) {
            this.setLoopbackModeDisabled((boolean)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x33 ^ 0x3A) & ~(0x4A ^ 0x43)) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.IP_MULTICAST_ADDR)) {
            this.setInterface((InetAddress)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if ("   ".length() <= -" ".length()) {
                return ((0xE ^ 0x1D) & ~(0x26 ^ 0x35)) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.IP_MULTICAST_IF)) {
            this.setNetworkInterface((NetworkInterface)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return ((0xE5 ^ 0xB0 ^ (0x3D ^ 0x41)) & (0xBC ^ 0x9F ^ (0x4D ^ 0x47) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.IP_MULTICAST_TTL)) {
            this.setTimeToLive((int)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (((0x43 ^ 0x3D ^ (0xD0 ^ 0x92)) & (0x75 ^ 0x12 ^ (0x4F ^ 0x14) ^ -" ".length())) != ((0x78 ^ 0xE ^ (0x63 ^ 0x28)) & (132 + 213 - 223 + 133 ^ 11 + 181 - 53 + 55 ^ -" ".length()))) {
                return ((0x42 ^ 0x7D ^ (0x66 ^ 0x61)) & (82 + 151 - 66 + 7 ^ 146 + 4 - 130 + 130 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.IP_TOS)) {
            this.setTrafficClass((int)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (-" ".length() > ((0xF9 ^ 0xAB ^ (0x2E ^ 0x52)) & (0x80 ^ 0x8A ^ (0x8A ^ 0xAE) ^ -" ".length()))) {
                return ((57 + 29 - 45 + 184 ^ 101 + 142 - 196 + 152) & (65 + 59 - 33 + 136 ^ 132 + 37 - 18 + 46 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) {
            this.setActiveOnOpen((boolean)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            if ("  ".length() > (0x3B ^ 0x3F)) {
                return ((0x42 ^ 0x5F) & ~(0x71 ^ 0x6C)) != 0x0;
            }
        }
        else {
            if (!llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlIlIl, EpollChannelOption.SO_REUSEPORT)) {
                return super.setOption(lllllllllllllIlIIIIlIIlIIIIlIlIl, lllllllllllllIlIIIIlIIlIIIIlIlII);
            }
            this.setReusePort((boolean)lllllllllllllIlIIIIlIIlIIIIlIlII);
            "".length();
            "".length();
            if (" ".length() == 0) {
                return ((0xF4 ^ 0x90 ^ (0xC3 ^ 0x94)) & (1 + 7 + 8 + 129 ^ 97 + 138 - 223 + 150 ^ -" ".length())) != 0x0;
            }
        }
        return EpollDatagramChannelConfig.lIIIlIllllllll[2] != 0;
    }
    
    @Override
    public EpollDatagramChannelConfig setTrafficClass(final int lllllllllllllIlIIIIlIIIllIlllIIl) {
        Native.setTrafficClass(this.datagramChannel.fd, lllllllllllllIlIIIIlIIIllIlllIIl);
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        return Native.getSendBufferSize(this.datagramChannel.fd);
    }
    
    @Override
    public boolean isBroadcast() {
        int n;
        if (llIIIIlIIlIlllI(Native.isBroadcast(this.datagramChannel.fd), EpollDatagramChannelConfig.lIIIlIllllllll[2])) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if ((2 + 119 - 80 + 144 ^ 70 + 130 - 70 + 59) < "  ".length()) {
                return ((0x5D ^ 0xF ^ (0xFD ^ 0xB4)) & (0x15 ^ 0x3 ^ (0xAF ^ 0xA2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        return n != 0;
    }
    
    @Override
    public EpollDatagramChannelConfig setConnectTimeoutMillis(final int lllllllllllllIlIIIIlIIIlllIllIlI) {
        super.setConnectTimeoutMillis(lllllllllllllIlIIIIlIIIlllIllIlI);
        "".length();
        return this;
    }
    
    private static boolean llIIIIlIIlIllll(final int lllllllllllllIlIIIIlIIIIlIlllIII, final int lllllllllllllIlIIIIlIIIIlIllIlll) {
        return lllllllllllllIlIIIIlIIIIlIlllIII < lllllllllllllIlIIIIlIIIIlIllIlll;
    }
    
    private static void llIIIIlIIlIIlll() {
        (lIIIlIllllIlll = new String[EpollDatagramChannelConfig.lIIIlIllllllll[6]])[EpollDatagramChannelConfig.lIIIlIllllllll[1]] = llIIIIlIIlIIIlI("JycvbToKKjhtNgwnLyowAGYjKDMLNCRtNgwnLyMwCGY2LCZENCQqPBcyJD8wAA==", "dFAMU");
        EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[2]] = llIIIIlIIlIIlII("xOkredT3CikHll/+c/aPxWPn+TS9SWP6", "KjtEZ");
        EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[3]] = llIIIIlIIlIIlII("m8buJOM/JbhoIz/Lbk/BuLctXd7XbwVO", "JFrlP");
        EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[4]] = llIIIIlIIlIIllI("kh23cdveVs0BsssTXSNzPZdKqYQ+gX4P", "mUcRt");
        EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[5]] = llIIIIlIIlIIIlI("LwY2Fx8BEikXVgwcLkMFFwMqDAQWFj4=", "bsZcv");
    }
    
    private static String llIIIIlIIlIIllI(final String lllllllllllllIlIIIIlIIIIlllIlIIl, final String lllllllllllllIlIIIIlIIIIlllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIIIIlllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIIIIlllIlIII.getBytes(StandardCharsets.UTF_8)), EpollDatagramChannelConfig.lIIIlIllllllll[9]), "DES");
            final Cipher lllllllllllllIlIIIIlIIIIlllIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlIIIIlllIlIll.init(EpollDatagramChannelConfig.lIIIlIllllllll[3], lllllllllllllIlIIIIlIIIIlllIllII);
            return new String(lllllllllllllIlIIIIlIIIIlllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIIIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIIIIlllIlIlI) {
            lllllllllllllIlIIIIlIIIIlllIlIlI.printStackTrace();
            return null;
        }
    }
    
    EpollDatagramChannelConfig(final EpollDatagramChannel lllllllllllllIlIIIIlIIlIIIlIIllI) {
        super(lllllllllllllIlIIIIlIIlIIIlIIllI);
        this.datagramChannel = lllllllllllllIlIIIIlIIlIIIlIIllI;
        this.setRecvByteBufAllocator(EpollDatagramChannelConfig.DEFAULT_RCVBUF_ALLOCATOR);
        "".length();
    }
    
    public EpollDatagramChannelConfig setReusePort(final boolean lllllllllllllIlIIIIlIIIllIIlIIlI) {
        final int fd = this.datagramChannel.fd;
        int n;
        if (llIIIIlIIlIllIl(lllllllllllllIlIIIIlIIIllIIlIIlI ? 1 : 0)) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if (-" ".length() >= ((0x6B ^ 0x62 ^ (0x4 ^ 0x1F)) & (0x46 ^ 0x18 ^ (0xCE ^ 0x82) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        Native.setReusePort(fd, n);
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setNetworkInterface(final NetworkInterface lllllllllllllIlIIIIlIIIllIIllIIl) {
        throw new UnsupportedOperationException(EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[5]]);
    }
    
    @Override
    public InetAddress getInterface() {
        return null;
    }
    
    @Override
    public EpollDatagramChannelConfig setMaxMessagesPerRead(final int lllllllllllllIlIIIIlIIIlllIlIIlI) {
        super.setMaxMessagesPerRead(lllllllllllllIlIIIIlIIIlllIlIIlI);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIlIIIIlIIIllllllllI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIlIIIIlIIIllllllllI);
        "".length();
        return this;
    }
    
    @Override
    protected void autoReadCleared() {
        this.datagramChannel.clearEpollIn();
    }
    
    static {
        llIIIIlIIlIlIll();
        llIIIIlIIlIIlll();
        DEFAULT_RCVBUF_ALLOCATOR = new FixedRecvByteBufAllocator(EpollDatagramChannelConfig.lIIIlIllllllll[13]);
    }
    
    private void setActiveOnOpen(final boolean lllllllllllllIlIIIIlIIlIIIIIlllI) {
        if (llIIIIlIIlIllIl(this.channel.isRegistered() ? 1 : 0)) {
            throw new IllegalStateException(EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[1]]);
        }
        this.activeOnOpen = lllllllllllllIlIIIIlIIlIIIIIlllI;
    }
    
    @Override
    public EpollDatagramChannelConfig setInterface(final InetAddress lllllllllllllIlIIIIlIIIllIIlllII) {
        throw new UnsupportedOperationException(EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[4]]);
    }
    
    @Override
    public DatagramChannelConfig setLoopbackModeDisabled(final boolean lllllllllllllIlIIIIlIIIllIlIIIlI) {
        throw new UnsupportedOperationException(EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[2]]);
    }
    
    @Override
    public EpollDatagramChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIlIIIIlIIlIIIIIlIII) {
        super.setMessageSizeEstimator(lllllllllllllIlIIIIlIIlIIIIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setAutoClose(final boolean lllllllllllllIlIIIIlIIIllllllIII) {
        super.setAutoClose(lllllllllllllIlIIIIlIIIllllllIII);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIlIIIIlIIIllllIIIII) {
        super.setAllocator(lllllllllllllIlIIIIlIIIllllIIIII);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setAutoRead(final boolean lllllllllllllIlIIIIlIIIlllllIIlI) {
        super.setAutoRead(lllllllllllllIlIIIIlIIIlllllIIlI);
        "".length();
        return this;
    }
    
    private static void llIIIIlIIlIlIll() {
        (lIIIlIllllllll = new int[14])[0] = (0x5 ^ 0x53 ^ (0x31 ^ 0x6C));
        EpollDatagramChannelConfig.lIIIlIllllllll[1] = ((0x9 ^ 0x48) & ~(0x4E ^ 0xF));
        EpollDatagramChannelConfig.lIIIlIllllllll[2] = " ".length();
        EpollDatagramChannelConfig.lIIIlIllllllll[3] = "  ".length();
        EpollDatagramChannelConfig.lIIIlIllllllll[4] = "   ".length();
        EpollDatagramChannelConfig.lIIIlIllllllll[5] = (0xB6 ^ 0xB2);
        EpollDatagramChannelConfig.lIIIlIllllllll[6] = (0x20 ^ 0x15 ^ (0x25 ^ 0x15));
        EpollDatagramChannelConfig.lIIIlIllllllll[7] = (0x5D ^ 0x31 ^ (0x2E ^ 0x44));
        EpollDatagramChannelConfig.lIIIlIllllllll[8] = (0x47 ^ 0x40);
        EpollDatagramChannelConfig.lIIIlIllllllll[9] = (0x2B ^ 0x52 ^ (0x31 ^ 0x40));
        EpollDatagramChannelConfig.lIIIlIllllllll[10] = (0x42 ^ 0x4B);
        EpollDatagramChannelConfig.lIIIlIllllllll[11] = (0xB1 ^ 0xBB);
        EpollDatagramChannelConfig.lIIIlIllllllll[12] = -" ".length();
        EpollDatagramChannelConfig.lIIIlIllllllll[13] = (-(0xFFFFEDB5 & 0x57FA) & (0xFFFFEDAF & 0x5FFF));
    }
    
    private static boolean llIIIIlIIlIlllI(final int lllllllllllllIlIIIIlIIIIlIllllII, final int lllllllllllllIlIIIIlIIIIlIlllIll) {
        return lllllllllllllIlIIIIlIIIIlIllllII == lllllllllllllIlIIIIlIIIIlIlllIll;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIlIIIIlIIlIIIIlllIl) {
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.SO_BROADCAST)) {
            return (T)Boolean.valueOf(this.isBroadcast());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.IP_MULTICAST_LOOP_DISABLED)) {
            return (T)Boolean.valueOf(this.isLoopbackModeDisabled());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.IP_MULTICAST_ADDR)) {
            return (T)this.getInterface();
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.IP_MULTICAST_IF)) {
            return (T)this.getNetworkInterface();
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.IP_MULTICAST_TTL)) {
            return (T)Integer.valueOf(this.getTimeToLive());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.IP_TOS)) {
            return (T)Integer.valueOf(this.getTrafficClass());
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) {
            return (T)Boolean.valueOf(this.activeOnOpen);
        }
        if (llIIIIlIIlIllII(lllllllllllllIlIIIIlIIlIIIIlllIl, EpollChannelOption.SO_REUSEPORT)) {
            return (T)Boolean.valueOf(this.isReusePort());
        }
        return super.getOption(lllllllllllllIlIIIIlIIlIIIIlllIl);
    }
    
    public boolean isReusePort() {
        int n;
        if (llIIIIlIIlIlllI(Native.isReusePort(this.datagramChannel.fd), EpollDatagramChannelConfig.lIIIlIllllllll[2])) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if (-" ".length() == (0x58 ^ 0x33 ^ (0xEC ^ 0x83))) {
                return ((0xEE ^ 0xB3 ^ (0x2B ^ 0x3B)) & (0xD3 ^ 0xC1 ^ (0x14 ^ 0x4B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        return n != 0;
    }
    
    private static String llIIIIlIIlIIlII(final String lllllllllllllIlIIIIlIIIIllIIIIlI, final String lllllllllllllIlIIIIlIIIIllIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlIIIIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlIIIIllIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlIIIIllIIIllI.init(EpollDatagramChannelConfig.lIIIlIllllllll[3], lllllllllllllIlIIIIlIIIIllIIIlll);
            return new String(lllllllllllllIlIIIIlIIIIllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlIIIIllIIIlIl) {
            lllllllllllllIlIIIIlIIIIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[EpollDatagramChannelConfig.lIIIlIllllllll[0]];
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[1]] = ChannelOption.SO_BROADCAST;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[2]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[3]] = ChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[4]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[5]] = ChannelOption.IP_MULTICAST_LOOP_DISABLED;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[6]] = ChannelOption.IP_MULTICAST_ADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[7]] = ChannelOption.IP_MULTICAST_IF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[8]] = ChannelOption.IP_MULTICAST_TTL;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[9]] = ChannelOption.IP_TOS;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[10]] = ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollDatagramChannelConfig.lIIIlIllllllll[11]] = EpollChannelOption.SO_REUSEPORT;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public int getTimeToLive() {
        return EpollDatagramChannelConfig.lIIIlIllllllll[12];
    }
    
    @Override
    public EpollDatagramChannelConfig setTimeToLive(final int lllllllllllllIlIIIIlIIIllIIlllll) {
        throw new UnsupportedOperationException(EpollDatagramChannelConfig.lIIIlIllllIlll[EpollDatagramChannelConfig.lIIIlIllllllll[3]]);
    }
    
    private static boolean llIIIIlIIlIllIl(final int lllllllllllllIlIIIIlIIIIlIllIIIl) {
        return lllllllllllllIlIIIIlIIIIlIllIIIl != 0;
    }
    
    @Override
    public EpollDatagramChannelConfig setWriteSpinCount(final int lllllllllllllIlIIIIlIIIllllIIllI) {
        super.setWriteSpinCount(lllllllllllllIlIIIIlIIIllllIIllI);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setReceiveBufferSize(final int lllllllllllllIlIIIIlIIIlllIIIIlI) {
        Native.setReceiveBufferSize(this.datagramChannel.fd, lllllllllllllIlIIIIlIIIlllIIIIlI);
        return this;
    }
    
    @Override
    public int getReceiveBufferSize() {
        return Native.getReceiveBufferSize(this.datagramChannel.fd);
    }
    
    @Override
    public EpollDatagramChannelConfig setReuseAddress(final boolean lllllllllllllIlIIIIlIIIllIlIlllI) {
        final int fd = this.datagramChannel.fd;
        int n;
        if (llIIIIlIIlIllIl(lllllllllllllIlIIIIlIIIllIlIlllI ? 1 : 0)) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if (-(0x60 ^ 0x64) > 0) {
                return null;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        Native.setReuseAddress(fd, n);
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIlIIIIlIIIllllIlIlI) {
        super.setRecvByteBufAllocator(lllllllllllllIlIIIIlIIIllllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setBroadcast(final boolean lllllllllllllIlIIIIlIIIllIlIIlll) {
        final int fd = this.datagramChannel.fd;
        int n;
        if (llIIIIlIIlIllIl(lllllllllllllIlIIIIlIIIllIlIIlll ? 1 : 0)) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        Native.setBroadcast(fd, n);
        return this;
    }
    
    @Override
    public EpollDatagramChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIlIIIIlIIlIIIIIIlII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIlIIIIlIIlIIIIIIlII);
        "".length();
        return this;
    }
    
    @Override
    public boolean isReuseAddress() {
        int n;
        if (llIIIIlIIlIlllI(Native.isReuseAddress(this.datagramChannel.fd), EpollDatagramChannelConfig.lIIIlIllllllll[2])) {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[2];
            "".length();
            if (((0x7A ^ 0x59) & ~(0x12 ^ 0x31)) != ((0x9E ^ 0xA1) & ~(0x82 ^ 0xBD))) {
                return ((0x72 ^ 0x3D) & ~(0xED ^ 0xA2)) != 0x0;
            }
        }
        else {
            n = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        }
        return n != 0;
    }
    
    @Override
    public EpollDatagramChannelConfig setSendBufferSize(final int lllllllllllllIlIIIIlIIIlllIIlIll) {
        Native.setSendBufferSize(this.datagramChannel.fd, lllllllllllllIlIIIIlIIIlllIIlIll);
        return this;
    }
    
    @Override
    public boolean isLoopbackModeDisabled() {
        return EpollDatagramChannelConfig.lIIIlIllllllll[1] != 0;
    }
    
    private static String llIIIIlIIlIIIlI(String lllllllllllllIlIIIIlIIIIllIlIlII, final String lllllllllllllIlIIIIlIIIIllIlIIll) {
        lllllllllllllIlIIIIlIIIIllIlIlII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlIIIIllIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlIIIIllIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIIIIlIIIIllIlIllI = lllllllllllllIlIIIIlIIIIllIlIIll.toCharArray();
        int lllllllllllllIlIIIIlIIIIllIlIlIl = EpollDatagramChannelConfig.lIIIlIllllllll[1];
        final int lllllllllllllIlIIIIlIIIIllIIllll = (Object)((String)lllllllllllllIlIIIIlIIIIllIlIlII).toCharArray();
        final Exception lllllllllllllIlIIIIlIIIIllIIlllI = (Exception)lllllllllllllIlIIIIlIIIIllIIllll.length;
        byte lllllllllllllIlIIIIlIIIIllIIllIl = (byte)EpollDatagramChannelConfig.lIIIlIllllllll[1];
        while (llIIIIlIIlIllll(lllllllllllllIlIIIIlIIIIllIIllIl, (int)lllllllllllllIlIIIIlIIIIllIIlllI)) {
            final char lllllllllllllIlIIIIlIIIIllIllIlI = lllllllllllllIlIIIIlIIIIllIIllll[lllllllllllllIlIIIIlIIIIllIIllIl];
            lllllllllllllIlIIIIlIIIIllIlIlll.append((char)(lllllllllllllIlIIIIlIIIIllIllIlI ^ lllllllllllllIlIIIIlIIIIllIlIllI[lllllllllllllIlIIIIlIIIIllIlIlIl % lllllllllllllIlIIIIlIIIIllIlIllI.length]));
            "".length();
            ++lllllllllllllIlIIIIlIIIIllIlIlIl;
            ++lllllllllllllIlIIIIlIIIIllIIllIl;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlIIIIllIlIlll);
    }
}
