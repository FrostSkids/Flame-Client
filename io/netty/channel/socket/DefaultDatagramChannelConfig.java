// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;
import java.util.Map;
import java.net.NetworkInterface;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBufAllocator;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import java.net.MulticastSocket;
import java.net.InetAddress;
import java.net.SocketException;
import io.netty.channel.ChannelException;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.util.internal.logging.InternalLogger;
import java.net.DatagramSocket;
import io.netty.channel.DefaultChannelConfig;

public class DefaultDatagramChannelConfig extends DefaultChannelConfig implements DatagramChannelConfig
{
    private static final /* synthetic */ int[] lIlIIlIlllIIlI;
    private volatile /* synthetic */ boolean activeOnOpen;
    private final /* synthetic */ DatagramSocket javaSocket;
    private static final /* synthetic */ String[] lIlIIlIllIllll;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ RecvByteBufAllocator DEFAULT_RCVBUF_ALLOCATOR;
    
    @Override
    public int getReceiveBufferSize() {
        try {
            return this.javaSocket.getReceiveBufferSize();
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIllllll) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIllllll);
        }
    }
    
    @Override
    public InetAddress getInterface() {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                return ((MulticastSocket)this.javaSocket).getInterface();
            }
            catch (SocketException lllllllllllllIIIllIlIllIIllllIll) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIllllIll);
            }
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public DatagramChannelConfig setAutoRead(final boolean lllllllllllllIIIllIlIlIllllIIlII) {
        super.setAutoRead(lllllllllllllIIIllIlIlIllllIIlII);
        "".length();
        return this;
    }
    
    private static boolean lllIIllIllIlllI(final Object lllllllllllllIIIllIlIlIlIllIIIlI, final Object lllllllllllllIIIllIlIlIlIllIIIIl) {
        return lllllllllllllIIIllIlIlIlIllIIIlI == lllllllllllllIIIllIlIlIlIllIIIIl;
    }
    
    @Override
    public DatagramChannelConfig setBroadcast(final boolean lllllllllllllIIIllIlIllIlIIIIIIl) {
        try {
            if (lllIIllIllIllll(lllllllllllllIIIllIlIllIlIIIIIIl ? 1 : 0) && lllIIllIlllIIII(PlatformDependent.isWindows() ? 1 : 0) && lllIIllIlllIIII(PlatformDependent.isRoot() ? 1 : 0) && lllIIllIlllIIII(this.javaSocket.getLocalAddress().isAnyLocalAddress() ? 1 : 0)) {
                DefaultDatagramChannelConfig.logger.warn(String.valueOf(new StringBuilder().append(DefaultDatagramChannelConfig.lIlIIlIllIllll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[3]]).append(this.javaSocket.getLocalSocketAddress()).append((char)DefaultDatagramChannelConfig.lIlIIlIlllIIlI[11])));
            }
            this.javaSocket.setBroadcast(lllllllllllllIIIllIlIllIlIIIIIIl);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIIllIlIllIlIIIIIll) {
            throw new ChannelException(lllllllllllllIIIllIlIllIlIIIIIll);
        }
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIllIlIllIlIIlIlII, final T lllllllllllllIIIllIlIllIlIIlIIll) {
        this.validate(lllllllllllllIIIllIlIllIlIIlIlII, lllllllllllllIIIllIlIllIlIIlIIll);
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.SO_BROADCAST)) {
            this.setBroadcast((boolean)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (-" ".length() == ((0x8D ^ 0x85) & ~(0x61 ^ 0x69))) {
                return ((0x3E ^ 0x7E) & ~(0x72 ^ 0x32)) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return ((0x9B ^ 0xC5) & ~(0xE9 ^ 0xB7)) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (((0x77 ^ 0x7E) & ~(0x64 ^ 0x6D)) >= "  ".length()) {
                return ((0x14 ^ 0x4A) & ~(0xD ^ 0x53)) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (-"   ".length() > 0) {
                return ((0x59 ^ 0xA) & ~(0x18 ^ 0x4B)) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.IP_MULTICAST_LOOP_DISABLED)) {
            this.setLoopbackModeDisabled((boolean)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (" ".length() < 0) {
                return ((0x24 ^ 0x73) & ~(0xCD ^ 0x9A)) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.IP_MULTICAST_ADDR)) {
            this.setInterface((InetAddress)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0xF5 ^ 0xA2 ^ (0xD7 ^ 0xC2)) & (0x6D ^ 0x64 ^ (0x69 ^ 0x22) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.IP_MULTICAST_IF)) {
            this.setNetworkInterface((NetworkInterface)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if ("   ".length() >= (27 + 36 - 3 + 107 ^ 112 + 31 - 16 + 36)) {
                return ((0x54 ^ 0x60 ^ "   ".length()) & (0x9B ^ 0xB5 ^ (0x20 ^ 0x39) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.IP_MULTICAST_TTL)) {
            this.setTimeToLive((int)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((100 + 224 - 209 + 111 ^ 36 + 174 - 31 + 15) & (145 + 147 - 273 + 208 ^ 149 + 10 - 14 + 50 ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.IP_TOS)) {
            this.setTrafficClass((int)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            "".length();
            if (-" ".length() > 0) {
                return ((173 + 121 - 185 + 72 ^ 97 + 126 - 82 + 8) & (0x5 ^ 0xB ^ (0x41 ^ 0x6F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIlIlII, ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) {
                return super.setOption(lllllllllllllIIIllIlIllIlIIlIlII, lllllllllllllIIIllIlIllIlIIlIIll);
            }
            this.setActiveOnOpen((boolean)lllllllllllllIIIllIlIllIlIIlIIll);
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0xF5 ^ 0xB8 ^ (0x66 ^ 0x2E)) & (11 + 160 - 98 + 123 ^ 82 + 103 - 152 + 160 ^ -" ".length())) != 0x0;
            }
        }
        return DefaultDatagramChannelConfig.lIlIIlIlllIIlI[2] != 0;
    }
    
    @Override
    public DatagramChannelConfig setNetworkInterface(final NetworkInterface lllllllllllllIIIllIlIllIIlIlIIlI) {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                ((MulticastSocket)this.javaSocket).setNetworkInterface(lllllllllllllIIIllIlIllIIlIlIIlI);
                "".length();
                if ((0x2 ^ 0x6) == ((0xCF ^ 0x84) & ~(0x4D ^ 0x6))) {
                    return null;
                }
                return this;
            }
            catch (SocketException lllllllllllllIIIllIlIllIIlIlIllI) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIlIlIllI);
            }
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public DatagramChannelConfig setLoopbackModeDisabled(final boolean lllllllllllllIIIllIlIllIIllIIIIl) {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                ((MulticastSocket)this.javaSocket).setLoopbackMode(lllllllllllllIIIllIlIllIIllIIIIl);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
                return this;
            }
            catch (SocketException lllllllllllllIIIllIlIllIIllIIlIl) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIllIIlIl);
            }
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public DatagramChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIllIlIlIlllIlIllI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIIllIlIlIlllIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public DatagramChannelConfig setInterface(final InetAddress lllllllllllllIIIllIlIllIIlllIIII) {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                ((MulticastSocket)this.javaSocket).setInterface(lllllllllllllIIIllIlIllIIlllIIII);
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
                return this;
            }
            catch (SocketException lllllllllllllIIIllIlIllIIlllIlII) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIlllIlII);
            }
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public DatagramChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIllIlIlIlllIlIIlI) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIIllIlIlIlllIlIIlI);
        "".length();
        return this;
    }
    
    private static boolean lllIIllIllIllll(final int lllllllllllllIIIllIlIlIlIlIlllIl) {
        return lllllllllllllIIIllIlIlIlIlIlllIl != 0;
    }
    
    @Override
    public DatagramChannelConfig setReuseAddress(final boolean lllllllllllllIIIllIlIllIIlIIIlIl) {
        try {
            this.javaSocket.setReuseAddress(lllllllllllllIIIllIlIllIIlIIIlIl);
            "".length();
            if ((0xA0 ^ 0xA4) <= " ".length()) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIIllIlIllIIlIIIlll) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIlIIIlll);
        }
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIllIlIllIlIIllllI) {
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.SO_BROADCAST)) {
            return (T)Boolean.valueOf(this.isBroadcast());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.IP_MULTICAST_LOOP_DISABLED)) {
            return (T)Boolean.valueOf(this.isLoopbackModeDisabled());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.IP_MULTICAST_ADDR)) {
            return (T)this.getInterface();
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.IP_MULTICAST_IF)) {
            return (T)this.getNetworkInterface();
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.IP_MULTICAST_TTL)) {
            return (T)Integer.valueOf(this.getTimeToLive());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.IP_TOS)) {
            return (T)Integer.valueOf(this.getTrafficClass());
        }
        if (lllIIllIllIlllI(lllllllllllllIIIllIlIllIlIIllllI, ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION)) {
            return (T)Boolean.valueOf(this.activeOnOpen);
        }
        return super.getOption(lllllllllllllIIIllIlIllIlIIllllI);
    }
    
    @Override
    public DatagramChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIllIlIlIlllllIIII) {
        super.setAllocator(lllllllllllllIIIllIlIlIlllllIIII);
        "".length();
        return this;
    }
    
    @Override
    public DatagramChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIllIlIlIlllllIllI) {
        super.setMaxMessagesPerRead(lllllllllllllIIIllIlIlIlllllIllI);
        "".length();
        return this;
    }
    
    private static void lllIIllIllIllII() {
        (lIlIIlIlllIIlI = new int[13])[0] = ((0x2E ^ 0x5F ^ (0xE5 ^ 0x9C)) & (0x2D ^ 0x21 ^ (0xAF ^ 0xAB) ^ -" ".length()));
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[1] = (0xA0 ^ 0xAA);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[2] = " ".length();
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[3] = "  ".length();
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[4] = "   ".length();
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[5] = (0xAA ^ 0xAE);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[6] = (0x10 ^ 0x4F ^ (0xFB ^ 0xA1));
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[7] = (0x7F ^ 0x79);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[8] = (0x5E ^ 0x46 ^ (0x89 ^ 0x96));
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[9] = (128 + 102 - 213 + 120 ^ 77 + 111 - 146 + 87);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[10] = (82 + 8 + 27 + 15 ^ 91 + 29 - 73 + 94);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[11] = (0xAB ^ 0x85);
        DefaultDatagramChannelConfig.lIlIIlIlllIIlI[12] = (0xFFFFEBD9 & 0x1C26);
    }
    
    @Override
    public DatagramChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIllIlIlIlllIIlIlI) {
        super.setMessageSizeEstimator(lllllllllllllIIIllIlIlIlllIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public boolean isBroadcast() {
        try {
            return this.javaSocket.getBroadcast();
        }
        catch (SocketException lllllllllllllIIIllIlIllIlIIIlIlI) {
            throw new ChannelException(lllllllllllllIIIllIlIllIlIIIlIlI);
        }
    }
    
    @Override
    public DatagramChannelConfig setSendBufferSize(final int lllllllllllllIIIllIlIllIIIlIIlll) {
        try {
            this.javaSocket.setSendBufferSize(lllllllllllllIIIllIlIllIIIlIIlll);
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIlIlIIl) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIlIlIIl);
        }
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[0]] = ChannelOption.SO_BROADCAST;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[2]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[3]] = ChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[4]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[5]] = ChannelOption.IP_MULTICAST_LOOP_DISABLED;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[6]] = ChannelOption.IP_MULTICAST_ADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[7]] = ChannelOption.IP_MULTICAST_IF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[8]] = ChannelOption.IP_MULTICAST_TTL;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[9]] = ChannelOption.IP_TOS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[10]] = ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    public DefaultDatagramChannelConfig(final DatagramChannel lllllllllllllIIIllIlIllIlIlIlIIl, final DatagramSocket lllllllllllllIIIllIlIllIlIlIIlIl) {
        super(lllllllllllllIIIllIlIllIlIlIlIIl);
        if (lllIIllIllIllIl(lllllllllllllIIIllIlIllIlIlIIlIl)) {
            throw new NullPointerException(DefaultDatagramChannelConfig.lIlIIlIllIllll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[0]]);
        }
        this.javaSocket = lllllllllllllIIIllIlIllIlIlIIlIl;
        this.setRecvByteBufAllocator(DefaultDatagramChannelConfig.DEFAULT_RCVBUF_ALLOCATOR);
        "".length();
    }
    
    @Override
    public DatagramChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIllIlIlIllllIlIII) {
        super.setRecvByteBufAllocator(lllllllllllllIIIllIlIlIllllIlIII);
        "".length();
        return this;
    }
    
    @Override
    public DatagramChannelConfig setTrafficClass(final int lllllllllllllIIIllIlIllIIIIIIlll) {
        try {
            this.javaSocket.setTrafficClass(lllllllllllllIIIllIlIllIIIIIIlll);
            "".length();
            if ((0xAF ^ 0x92 ^ (0xBD ^ 0x84)) < 0) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIIIlIll) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIIIlIll);
        }
        return this;
    }
    
    @Override
    public NetworkInterface getNetworkInterface() {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                return ((MulticastSocket)this.javaSocket).getNetworkInterface();
            }
            catch (SocketException lllllllllllllIIIllIlIllIIlIlllIl) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIlIlllIl);
            }
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int getSendBufferSize() {
        try {
            return this.javaSocket.getSendBufferSize();
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIllIIII) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIllIIII);
        }
    }
    
    @Override
    public boolean isReuseAddress() {
        try {
            return this.javaSocket.getReuseAddress();
        }
        catch (SocketException lllllllllllllIIIllIlIllIIlIIlllI) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIlIIlllI);
        }
    }
    
    private static boolean lllIIllIlllIIII(final int lllllllllllllIIIllIlIlIlIlIllIll) {
        return lllllllllllllIIIllIlIlIlIlIllIll == 0;
    }
    
    private static boolean lllIIllIllIllIl(final Object lllllllllllllIIIllIlIlIlIlIlllll) {
        return lllllllllllllIIIllIlIlIlIlIlllll == null;
    }
    
    private static String lllIIllIlIlllll(final String lllllllllllllIIIllIlIlIlIllIllII, final String lllllllllllllIIIllIlIlIlIllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIlIlIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), DefaultDatagramChannelConfig.lIlIIlIlllIIlI[9]), "DES");
            final Cipher lllllllllllllIIIllIlIlIlIlllIIII = Cipher.getInstance("DES");
            lllllllllllllIIIllIlIlIlIlllIIII.init(DefaultDatagramChannelConfig.lIlIIlIlllIIlI[3], lllllllllllllIIIllIlIlIlIlllIIIl);
            return new String(lllllllllllllIIIllIlIlIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIlIlIllIllll) {
            lllllllllllllIIIllIlIlIlIllIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public DatagramChannelConfig setWriteSpinCount(final int lllllllllllllIIIllIlIllIIIIIIIII) {
        super.setWriteSpinCount(lllllllllllllIIIllIlIllIIIIIIIII);
        "".length();
        return this;
    }
    
    private void setActiveOnOpen(final boolean lllllllllllllIIIllIlIllIlIIIllIl) {
        if (lllIIllIllIllll(this.channel.isRegistered() ? 1 : 0)) {
            throw new IllegalStateException(DefaultDatagramChannelConfig.lIlIIlIllIllll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[2]]);
        }
        this.activeOnOpen = lllllllllllllIIIllIlIllIlIIIllIl;
    }
    
    private static boolean lllIIllIlllIIIl(final int lllllllllllllIIIllIlIlIlIllIIllI, final int lllllllllllllIIIllIlIlIlIllIIlIl) {
        return lllllllllllllIIIllIlIlIlIllIIllI < lllllllllllllIIIllIlIlIlIllIIlIl;
    }
    
    @Override
    public DatagramChannelConfig setTimeToLive(final int lllllllllllllIIIllIlIllIIIIllIII) {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                ((MulticastSocket)this.javaSocket).setTimeToLive(lllllllllllllIIIllIlIllIIIIllIII);
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
                return this;
            }
            catch (IOException lllllllllllllIIIllIlIllIIIIllIlI) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIIIllIlI);
            }
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isLoopbackModeDisabled() {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                return ((MulticastSocket)this.javaSocket).getLoopbackMode();
            }
            catch (SocketException lllllllllllllIIIllIlIllIIllIllII) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIllIllII);
            }
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public DatagramChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIllIlIlIllllllIlI) {
        super.setConnectTimeoutMillis(lllllllllllllIIIllIlIlIllllllIlI);
        "".length();
        return this;
    }
    
    static {
        lllIIllIllIllII();
        lllIIllIllIIIII();
        logger = InternalLoggerFactory.getInstance(DefaultDatagramChannelConfig.class);
        DEFAULT_RCVBUF_ALLOCATOR = new FixedRecvByteBufAllocator(DefaultDatagramChannelConfig.lIlIIlIlllIIlI[12]);
    }
    
    @Override
    public DatagramChannelConfig setAutoClose(final boolean lllllllllllllIIIllIlIlIlllIllllI) {
        super.setAutoClose(lllllllllllllIIIllIlIlIlllIllllI);
        "".length();
        return this;
    }
    
    private static void lllIIllIllIIIII() {
        (lIlIIlIllIllll = new String[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[4]])[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[0]] = lllIIllIlIllllI("JRs4NTAgGSUxFw==", "OzNTc");
        DefaultDatagramChannelConfig.lIlIIlIllIllll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[2]] = lllIIllIlIlllll("Oj+IGhsSunOljbkm6DrRW3/1ulXu9Y9TEzSS39U/S+sCmKp+gN1D4CY1zNk+78YK", "LdDki");
        DefaultDatagramChannelConfig.lIlIIlIllIllll[DefaultDatagramChannelConfig.lIlIIlIlllIIlI[3]] = lllIIllIlIllllI("KlMBCCFGAQAIO0sGHAI9SxAOCWgfUx0CLA4aGQJvClMNFSAKFwwGPB9THwYsABYbRyYNUxsPKksAAAQkDgdPDjxLHQATbwkcGgkrSwcARy5LBAYLKwgSHQNvChcLFSoYAFRHPA4HGw4hDFMbDypLICA4DTk8LiMMKiA7RykHEghHLgUKGAY2SxIcRz0OAhoCPB8WC0cgBVMbDypLAAAEJA4HTxAnAhAHRyYYUw0IOgUXTxMgSw==", "ksogO");
    }
    
    @Override
    public int getTrafficClass() {
        try {
            return this.javaSocket.getTrafficClass();
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIIlIIlI) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIIlIIlI);
        }
    }
    
    @Override
    public DatagramChannelConfig setReceiveBufferSize(final int lllllllllllllIIIllIlIllIIIllIlII) {
        try {
            this.javaSocket.setReceiveBufferSize(lllllllllllllIIIllIlIllIIIllIlII);
            "".length();
            if ("   ".length() > (100 + 100 - 55 + 47 ^ 21 + 3 + 81 + 91)) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIIllIlIllIIIlllIII) {
            throw new ChannelException(lllllllllllllIIIllIlIllIIIlllIII);
        }
        return this;
    }
    
    private static String lllIIllIlIllllI(String lllllllllllllIIIllIlIlIlIllllllI, final String lllllllllllllIIIllIlIlIllIIIIIlI) {
        lllllllllllllIIIllIlIlIlIllllllI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIlIlIlIllllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIlIlIllIIIIIIl = new StringBuilder();
        final char[] lllllllllllllIIIllIlIlIllIIIIIII = lllllllllllllIIIllIlIlIllIIIIIlI.toCharArray();
        int lllllllllllllIIIllIlIlIlIlllllll = DefaultDatagramChannelConfig.lIlIIlIlllIIlI[0];
        final char lllllllllllllIIIllIlIlIlIllllIIl = (Object)((String)lllllllllllllIIIllIlIlIlIllllllI).toCharArray();
        final float lllllllllllllIIIllIlIlIlIllllIII = lllllllllllllIIIllIlIlIlIllllIIl.length;
        boolean lllllllllllllIIIllIlIlIlIlllIlll = DefaultDatagramChannelConfig.lIlIIlIlllIIlI[0] != 0;
        while (lllIIllIlllIIIl(lllllllllllllIIIllIlIlIlIlllIlll ? 1 : 0, (int)lllllllllllllIIIllIlIlIlIllllIII)) {
            final char lllllllllllllIIIllIlIlIllIIIIlII = lllllllllllllIIIllIlIlIlIllllIIl[lllllllllllllIIIllIlIlIlIlllIlll];
            lllllllllllllIIIllIlIlIllIIIIIIl.append((char)(lllllllllllllIIIllIlIlIllIIIIlII ^ lllllllllllllIIIllIlIlIllIIIIIII[lllllllllllllIIIllIlIlIlIlllllll % lllllllllllllIIIllIlIlIllIIIIIII.length]));
            "".length();
            ++lllllllllllllIIIllIlIlIlIlllllll;
            ++lllllllllllllIIIllIlIlIlIlllIlll;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIlIlIllIIIIIIl);
    }
    
    @Override
    public int getTimeToLive() {
        if (lllIIllIllIllll((this.javaSocket instanceof MulticastSocket) ? 1 : 0)) {
            try {
                return ((MulticastSocket)this.javaSocket).getTimeToLive();
            }
            catch (IOException lllllllllllllIIIllIlIllIIIlIIIIl) {
                throw new ChannelException(lllllllllllllIIIllIlIllIIIlIIIIl);
            }
        }
        throw new UnsupportedOperationException();
    }
}
