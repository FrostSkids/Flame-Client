// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.util.internal.PlatformDependent;
import io.netty.channel.Channel;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.ChannelConfig;
import io.netty.channel.socket.SocketChannelConfig;
import io.netty.channel.DefaultChannelConfig;

public final class EpollSocketChannelConfig extends DefaultChannelConfig implements SocketChannelConfig
{
    private volatile /* synthetic */ boolean allowHalfClosure;
    private final /* synthetic */ EpollSocketChannel channel;
    private static final /* synthetic */ int[] lllIlIlIllllIl;
    
    @Override
    public EpollSocketChannelConfig setAutoClose(final boolean llllllllllllIlIllIlIllllllIllIlI) {
        super.setAutoClose(llllllllllllIlIllIlIllllllIllIlI);
        "".length();
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[EpollSocketChannelConfig.lllIlIlIllllIl[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[2]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[0]] = ChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[3]] = ChannelOption.TCP_NODELAY;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[4]] = ChannelOption.SO_KEEPALIVE;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[5]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[6]] = ChannelOption.SO_LINGER;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[7]] = ChannelOption.IP_TOS;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[8]] = ChannelOption.ALLOW_HALF_CLOSURE;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[9]] = EpollChannelOption.TCP_CORK;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[10]] = EpollChannelOption.TCP_KEEPCNT;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[11]] = EpollChannelOption.TCP_KEEPIDLE;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollSocketChannelConfig.lllIlIlIllllIl[12]] = EpollChannelOption.TCP_KEEPINTVL;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    private static boolean lIlIIIllIIlIIlIl(final Object llllllllllllIlIllIlIlllIllllllII, final Object llllllllllllIlIllIlIlllIlllllIll) {
        return llllllllllllIlIllIlIlllIllllllII == llllllllllllIlIllIlIlllIlllllIll;
    }
    
    private static boolean lIlIIIllIIlIIllI(final int llllllllllllIlIllIlIllllIIIIIIII, final int llllllllllllIlIllIlIlllIllllllll) {
        return llllllllllllIlIllIlIllllIIIIIIII == llllllllllllIlIllIlIlllIllllllll;
    }
    
    @Override
    public EpollSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator llllllllllllIlIllIlIlllllllIIlII) {
        super.setRecvByteBufAllocator(llllllllllllIlIllIlIlllllllIIlII);
        "".length();
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setAutoRead(final boolean llllllllllllIlIllIlIlllllllIIIII) {
        super.setAutoRead(llllllllllllIlIllIlIlllllllIIIII);
        "".length();
        return this;
    }
    
    @Override
    public int getTrafficClass() {
        return Native.getTrafficClass(this.channel.fd);
    }
    
    public boolean isTcpCork() {
        int n;
        if (lIlIIIllIIlIIllI(Native.isTcpCork(this.channel.fd), EpollSocketChannelConfig.lllIlIlIllllIl[0])) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if (null != null) {
                return ((0x89 ^ 0xC0) & ~(0x8 ^ 0x41)) != 0x0;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        return n != 0;
    }
    
    @Override
    public int getSoLinger() {
        return Native.getSoLinger(this.channel.fd);
    }
    
    public EpollSocketChannelConfig setTcpKeepIntvl(final int llllllllllllIlIllIllIIIIIIIlIIll) {
        Native.setTcpKeepIntvl(this.channel.fd, llllllllllllIlIllIllIIIIIIIlIIll);
        return this;
    }
    
    @Override
    public boolean isAllowHalfClosure() {
        return this.allowHalfClosure;
    }
    
    @Override
    public EpollSocketChannelConfig setMaxMessagesPerRead(final int llllllllllllIlIllIlIllllllllIllI) {
        super.setMaxMessagesPerRead(llllllllllllIlIllIlIllllllllIllI);
        "".length();
        return this;
    }
    
    private static boolean lIlIIIllIIlIIlII(final int llllllllllllIlIllIlIlllIlllllIIl) {
        return llllllllllllIlIllIlIlllIlllllIIl != 0;
    }
    
    @Override
    public EpollSocketChannelConfig setTcpNoDelay(final boolean llllllllllllIlIllIllIIIIIIlIlIll) {
        final int fd = this.channel.fd;
        int n;
        if (lIlIIIllIIlIIlII(llllllllllllIlIllIllIIIIIIlIlIll ? 1 : 0)) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        Native.setTcpNoDelay(fd, n);
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setReuseAddress(final boolean llllllllllllIlIllIllIIIIIIllllIl) {
        final int fd = this.channel.fd;
        int n;
        if (lIlIIIllIIlIIlII(llllllllllllIlIllIllIIIIIIllllIl ? 1 : 0)) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        Native.setReuseAddress(fd, n);
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        return Native.getSendBufferSize(this.channel.fd);
    }
    
    @Override
    public EpollSocketChannelConfig setWriteSpinCount(final int llllllllllllIlIllIlIllllllllIIII) {
        super.setWriteSpinCount(llllllllllllIlIllIlIllllllllIIII);
        "".length();
        return this;
    }
    
    @Override
    public int getReceiveBufferSize() {
        return Native.getReceiveBufferSize(this.channel.fd);
    }
    
    public EpollSocketChannelConfig setTcpKeepIdle(final int llllllllllllIlIllIllIIIIIIIlIlll) {
        Native.setTcpKeepIdle(this.channel.fd, llllllllllllIlIllIllIIIIIIIlIlll);
        return this;
    }
    
    public EpollSocketChannelConfig setTcpKeepCntl(final int llllllllllllIlIllIllIIIIIIIIllIl) {
        Native.setTcpKeepCnt(this.channel.fd, llllllllllllIlIllIllIIIIIIIIllIl);
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setSendBufferSize(final int llllllllllllIlIllIllIIIIIIllIlll) {
        Native.setSendBufferSize(this.channel.fd, llllllllllllIlIllIllIIIIIIllIlll);
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setConnectTimeoutMillis(final int llllllllllllIlIllIlIllllllllllII) {
        super.setConnectTimeoutMillis(llllllllllllIlIllIlIllllllllllII);
        "".length();
        return this;
    }
    
    public int getTcpKeepCnt() {
        return Native.getTcpKeepCnt(this.channel.fd);
    }
    
    static {
        lIlIIIllIIlIIIll();
    }
    
    @Override
    protected void autoReadCleared() {
        this.channel.clearEpollIn();
    }
    
    private static void lIlIIIllIIlIIIll() {
        (lllIlIlIllllIl = new int[13])[0] = " ".length();
        EpollSocketChannelConfig.lllIlIlIllllIl[1] = (0x66 ^ 0x6A);
        EpollSocketChannelConfig.lllIlIlIllllIl[2] = ((0x60 ^ 0x1C ^ (0x39 ^ 0x6E)) & (0xE3 ^ 0xA9 ^ (0xD4 ^ 0xB5) ^ -" ".length()));
        EpollSocketChannelConfig.lllIlIlIllllIl[3] = "  ".length();
        EpollSocketChannelConfig.lllIlIlIllllIl[4] = "   ".length();
        EpollSocketChannelConfig.lllIlIlIllllIl[5] = (141 + 139 - 270 + 141 ^ 2 + 32 + 112 + 1);
        EpollSocketChannelConfig.lllIlIlIllllIl[6] = (0x8B ^ 0x8E);
        EpollSocketChannelConfig.lllIlIlIllllIl[7] = (0x14 ^ 0x12);
        EpollSocketChannelConfig.lllIlIlIllllIl[8] = (0x45 ^ 0x42);
        EpollSocketChannelConfig.lllIlIlIllllIl[9] = (59 + 60 + 23 + 33 ^ 97 + 53 - 61 + 78);
        EpollSocketChannelConfig.lllIlIlIllllIl[10] = (0xCF ^ 0xC6);
        EpollSocketChannelConfig.lllIlIlIllllIl[11] = (0xA8 ^ 0xA2);
        EpollSocketChannelConfig.lllIlIlIllllIl[12] = (0x8E ^ 0x85);
    }
    
    @Override
    public EpollSocketChannelConfig setAllocator(final ByteBufAllocator llllllllllllIlIllIlIlllllllIlIlI) {
        super.setAllocator(llllllllllllIlIllIlIlllllllIlIlI);
        "".length();
        return this;
    }
    
    public int getTcpKeepIdle() {
        return Native.getTcpKeepIdle(this.channel.fd);
    }
    
    @Override
    public EpollSocketChannelConfig setKeepAlive(final boolean llllllllllllIlIllIllIIIIIlIIllll) {
        final int fd = this.channel.fd;
        int n;
        if (lIlIIIllIIlIIlII(llllllllllllIlIllIllIIIIIlIIllll ? 1 : 0)) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if ("   ".length() >= (0x56 ^ 0x52)) {
                return null;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        Native.setKeepAlive(fd, n);
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setSoLinger(final int llllllllllllIlIllIllIIIIIIllIIIl) {
        Native.setSoLinger(this.channel.fd, llllllllllllIlIllIllIIIIIIllIIIl);
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setAllowHalfClosure(final boolean llllllllllllIlIllIllIIIIIIIIIIlI) {
        this.allowHalfClosure = llllllllllllIlIllIllIIIIIIIIIIlI;
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setPerformancePreferences(final int llllllllllllIlIllIllIIIIIlIIlIlI, final int llllllllllllIlIllIllIIIIIlIIlIIl, final int llllllllllllIlIllIllIIIIIlIIlIII) {
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> llllllllllllIlIllIllIIIIIlllllIl) {
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.TCP_NODELAY)) {
            return (T)Boolean.valueOf(this.isTcpNoDelay());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.SO_KEEPALIVE)) {
            return (T)Boolean.valueOf(this.isKeepAlive());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.SO_LINGER)) {
            return (T)Integer.valueOf(this.getSoLinger());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.IP_TOS)) {
            return (T)Integer.valueOf(this.getTrafficClass());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, ChannelOption.ALLOW_HALF_CLOSURE)) {
            return (T)Boolean.valueOf(this.isAllowHalfClosure());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, EpollChannelOption.TCP_CORK)) {
            return (T)Boolean.valueOf(this.isTcpCork());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, EpollChannelOption.TCP_KEEPIDLE)) {
            return (T)Integer.valueOf(this.getTcpKeepIdle());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, EpollChannelOption.TCP_KEEPINTVL)) {
            return (T)Integer.valueOf(this.getTcpKeepIntvl());
        }
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllllIl, EpollChannelOption.TCP_KEEPCNT)) {
            return (T)Integer.valueOf(this.getTcpKeepCnt());
        }
        return super.getOption(llllllllllllIlIllIllIIIIIlllllIl);
    }
    
    @Override
    public EpollSocketChannelConfig setWriteBufferHighWaterMark(final int llllllllllllIlIllIlIllllllIlIIlI) {
        super.setWriteBufferHighWaterMark(llllllllllllIlIllIlIllllllIlIIlI);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> llllllllllllIlIllIllIIIIIlllIlIl, final T llllllllllllIlIllIllIIIIIlllIlII) {
        this.validate(llllllllllllIlIllIllIIIIIlllIlIl, llllllllllllIlIllIllIIIIIlllIlII);
        if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (-"   ".length() > 0) {
                return ((0x3E ^ 0x13 ^ (0x62 ^ 0x2C)) & (193 + 150 - 161 + 16 ^ 153 + 62 - 197 + 147 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((0x1D ^ 0x11 ^ (0x6F ^ 0x44)) & (0x82 ^ 0xA2 ^ (0xB6 ^ 0xB1) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.TCP_NODELAY)) {
            this.setTcpNoDelay((boolean)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0x12 ^ 0x29 ^ (0x12 ^ 0x6C)) & (0xF2 ^ 0x83 ^ (0x5D ^ 0x69) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.SO_KEEPALIVE)) {
            this.setKeepAlive((boolean)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ((93 + 0 - 69 + 158 ^ 90 + 96 - 106 + 98) <= -" ".length()) {
                return ((144 + 17 + 13 + 8 ^ 57 + 142 - 15 + 6) & (7 + 63 - 57 + 115 ^ 63 + 11 + 39 + 23 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return ((0x5E ^ 0x8 ^ (0xC1 ^ 0xA6)) & (0xE ^ 0x9 ^ (0xF6 ^ 0xC0) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.SO_LINGER)) {
            this.setSoLinger((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return ((0x88 ^ 0xB7) & ~(0x16 ^ 0x29)) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.IP_TOS)) {
            this.setTrafficClass((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (((0xAE ^ 0xAA) & ~(0x3B ^ 0x3F)) == (0xA7 ^ 0xA3)) {
                return ((0x69 ^ 0x4A) & ~(0x7B ^ 0x58)) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, ChannelOption.ALLOW_HALF_CLOSURE)) {
            this.setAllowHalfClosure((boolean)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (null != null) {
                return ((0x4A ^ 0x3B ^ (0x39 ^ 0x13)) & (0x2D ^ 0x6E ^ (0x96 ^ 0x8E) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, EpollChannelOption.TCP_CORK)) {
            this.setTcpCork((boolean)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0x3A ^ 0x12) & ~(0xA4 ^ 0x8C)) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, EpollChannelOption.TCP_KEEPIDLE)) {
            this.setTcpKeepIdle((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return ((0xF8 ^ 0xB5 ^ (0x11 ^ 0x52)) & (54 + 34 - 56 + 115 ^ 107 + 49 - 6 + 7 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, EpollChannelOption.TCP_KEEPCNT)) {
            this.setTcpKeepCntl((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if (((0xB0 ^ 0x8B) & ~(0x12 ^ 0x29)) > 0) {
                return ((0xE ^ 0x39) & ~(0x27 ^ 0x10)) != 0x0;
            }
        }
        else {
            if (!lIlIIIllIIlIIlIl(llllllllllllIlIllIllIIIIIlllIlIl, EpollChannelOption.TCP_KEEPINTVL)) {
                return super.setOption(llllllllllllIlIllIllIIIIIlllIlIl, llllllllllllIlIllIllIIIIIlllIlII);
            }
            this.setTcpKeepIntvl((int)llllllllllllIlIllIllIIIIIlllIlII);
            "".length();
            "".length();
            if ("  ".length() < "  ".length()) {
                return ((0x60 ^ 0x5A) & ~(0xF8 ^ 0xC2)) != 0x0;
            }
        }
        return EpollSocketChannelConfig.lllIlIlIllllIl[0] != 0;
    }
    
    @Override
    public EpollSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator llllllllllllIlIllIlIllllllIIIllI) {
        super.setMessageSizeEstimator(llllllllllllIlIllIlIllllllIIIllI);
        "".length();
        return this;
    }
    
    @Override
    public boolean isReuseAddress() {
        int n;
        if (lIlIIIllIIlIIllI(Native.isReuseAddress(this.channel.fd), EpollSocketChannelConfig.lllIlIlIllllIl[0])) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if (null != null) {
                return ((0xD3 ^ 0x9A ^ 27 + 9 + 70 + 21) & (0xF9 ^ 0x9A ^ (0x67 ^ 0x32) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        return n != 0;
    }
    
    @Override
    public EpollSocketChannelConfig setTrafficClass(final int llllllllllllIlIllIllIIIIIIIlllIl) {
        Native.setTrafficClass(this.channel.fd, llllllllllllIlIllIllIIIIIIIlllIl);
        return this;
    }
    
    public int getTcpKeepIntvl() {
        return Native.getTcpKeepIntvl(this.channel.fd);
    }
    
    @Override
    public boolean isKeepAlive() {
        int n;
        if (lIlIIIllIIlIIllI(Native.isKeepAlive(this.channel.fd), EpollSocketChannelConfig.lllIlIlIllllIl[0])) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x1A ^ 0x45 ^ (0x1D ^ 0x11)) & (0x74 ^ 0x6 ^ (0x3A ^ 0x1B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        return n != 0;
    }
    
    @Override
    public EpollSocketChannelConfig setWriteBufferLowWaterMark(final int llllllllllllIlIllIlIllllllIIllII) {
        super.setWriteBufferLowWaterMark(llllllllllllIlIllIlIllllllIIllII);
        "".length();
        return this;
    }
    
    @Override
    public EpollSocketChannelConfig setReceiveBufferSize(final int llllllllllllIlIllIllIIIIIlIIIIll) {
        Native.setReceiveBufferSize(this.channel.fd, llllllllllllIlIllIllIIIIIlIIIIll);
        return this;
    }
    
    EpollSocketChannelConfig(final EpollSocketChannel llllllllllllIlIllIllIIIIlIIIIllI) {
        super(llllllllllllIlIllIllIIIIlIIIIllI);
        this.channel = llllllllllllIlIllIllIIIIlIIIIllI;
        if (lIlIIIllIIlIIlII(PlatformDependent.canEnableTcpNoDelayByDefault() ? 1 : 0)) {
            this.setTcpNoDelay((boolean)(EpollSocketChannelConfig.lllIlIlIllllIl[0] != 0));
            "".length();
        }
    }
    
    @Override
    public boolean isTcpNoDelay() {
        int n;
        if (lIlIIIllIIlIIllI(Native.isTcpNoDelay(this.channel.fd), EpollSocketChannelConfig.lllIlIlIllllIl[0])) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if (" ".length() < ((0xCF ^ 0x9D) & ~(0x43 ^ 0x11))) {
                return ((0xC5 ^ 0x97) & ~(0x97 ^ 0xC5)) != 0x0;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        return n != 0;
    }
    
    public EpollSocketChannelConfig setTcpCork(final boolean llllllllllllIlIllIllIIIIIIlIIIll) {
        final int fd = this.channel.fd;
        int n;
        if (lIlIIIllIIlIIlII(llllllllllllIlIllIllIIIIIIlIIIll ? 1 : 0)) {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[0];
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            n = EpollSocketChannelConfig.lllIlIlIllllIl[2];
        }
        Native.setTcpCork(fd, n);
        return this;
    }
}
