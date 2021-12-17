// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.PlatformDependent;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import java.util.Map;
import io.netty.channel.ChannelOption;
import java.net.SocketException;
import io.netty.channel.ChannelException;
import java.net.Socket;
import io.netty.channel.DefaultChannelConfig;

public class DefaultSocketChannelConfig extends DefaultChannelConfig implements SocketChannelConfig
{
    protected final /* synthetic */ Socket javaSocket;
    private static final /* synthetic */ String[] llIIlIIIIlIlIl;
    private volatile /* synthetic */ boolean allowHalfClosure;
    private static final /* synthetic */ int[] llIIlIIIIlIllI;
    
    @Override
    public SocketChannelConfig setAutoClose(final boolean llllllllllllIlllIIllIIllllIIIIIl) {
        super.setAutoClose(llllllllllllIlllIIllIIllllIIIIIl);
        "".length();
        return this;
    }
    
    @Override
    public SocketChannelConfig setReuseAddress(final boolean llllllllllllIlllIIllIlIIIIIllIll) {
        try {
            this.javaSocket.setReuseAddress(llllllllllllIlllIIllIlIIIIIllIll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIIlllIl) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIIlllIl);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setPerformancePreferences(final int llllllllllllIlllIIllIlIIIIllIIII, final int llllllllllllIlllIIllIlIIIIlIllll, final int llllllllllllIlllIIllIlIIIIlIlllI) {
        this.javaSocket.setPerformancePreferences(llllllllllllIlllIIllIlIIIIllIIII, llllllllllllIlllIIllIlIIIIlIllll, llllllllllllIlllIIllIlIIIIlIlllI);
        return this;
    }
    
    @Override
    public int getSoLinger() {
        try {
            return this.javaSocket.getSoLinger();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIlIllIlI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIlIllIlI);
        }
    }
    
    @Override
    public SocketChannelConfig setMaxMessagesPerRead(final int llllllllllllIlllIIllIIlllllIIIIl) {
        super.setMaxMessagesPerRead(llllllllllllIlllIIllIIlllllIIIIl);
        "".length();
        return this;
    }
    
    static {
        lIIIlIlllIlIlIIl();
        lIIIlIlllIlIlIII();
    }
    
    private static boolean lIIIlIlllIlIllII(final Object llllllllllllIlllIIllIIllIlIlIlII, final Object llllllllllllIlllIIllIIllIlIlIIll) {
        return llllllllllllIlllIIllIIllIlIlIlII == llllllllllllIlllIIllIIllIlIlIIll;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> llllllllllllIlllIIllIlIIIlllIlII) {
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.TCP_NODELAY)) {
            return (T)Boolean.valueOf(this.isTcpNoDelay());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.SO_KEEPALIVE)) {
            return (T)Boolean.valueOf(this.isKeepAlive());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.SO_LINGER)) {
            return (T)Integer.valueOf(this.getSoLinger());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.IP_TOS)) {
            return (T)Integer.valueOf(this.getTrafficClass());
        }
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIlllIlII, ChannelOption.ALLOW_HALF_CLOSURE)) {
            return (T)Boolean.valueOf(this.isAllowHalfClosure());
        }
        return super.getOption(llllllllllllIlllIIllIlIIIlllIlII);
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultSocketChannelConfig.llIIlIIIIlIllI[2]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[0]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[1]] = ChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[3]] = ChannelOption.TCP_NODELAY;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[4]] = ChannelOption.SO_KEEPALIVE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[5]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[6]] = ChannelOption.SO_LINGER;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[7]] = ChannelOption.IP_TOS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSocketChannelConfig.llIIlIIIIlIllI[8]] = ChannelOption.ALLOW_HALF_CLOSURE;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    private static void lIIIlIlllIlIlIIl() {
        (llIIlIIIIlIllI = new int[9])[0] = ((215 + 81 - 88 + 10 ^ 73 + 19 - 84 + 146) & (0x6E ^ 0x32 ^ (0x3 ^ 0x1F) ^ -" ".length()));
        DefaultSocketChannelConfig.llIIlIIIIlIllI[1] = " ".length();
        DefaultSocketChannelConfig.llIIlIIIIlIllI[2] = (0x2A ^ 0x22);
        DefaultSocketChannelConfig.llIIlIIIIlIllI[3] = "  ".length();
        DefaultSocketChannelConfig.llIIlIIIIlIllI[4] = "   ".length();
        DefaultSocketChannelConfig.llIIlIIIIlIllI[5] = (0xAA ^ 0xAE);
        DefaultSocketChannelConfig.llIIlIIIIlIllI[6] = (0xBF ^ 0xBA);
        DefaultSocketChannelConfig.llIIlIIIIlIllI[7] = (0x5B ^ 0x29 ^ (0xD7 ^ 0xA3));
        DefaultSocketChannelConfig.llIIlIIIIlIllI[8] = (0x9B ^ 0x9C);
    }
    
    private static boolean lIIIlIlllIlIllIl(final int llllllllllllIlllIIllIIllIlIIllIl) {
        return llllllllllllIlllIIllIIllIlIIllIl < 0;
    }
    
    public DefaultSocketChannelConfig(final SocketChannel llllllllllllIlllIIllIlIIlIIIIIII, final Socket llllllllllllIlllIIllIlIIIlllllII) {
        super(llllllllllllIlllIIllIlIIlIIIIIII);
        if (lIIIlIlllIlIlIlI(llllllllllllIlllIIllIlIIIlllllII)) {
            throw new NullPointerException(DefaultSocketChannelConfig.llIIlIIIIlIlIl[DefaultSocketChannelConfig.llIIlIIIIlIllI[0]]);
        }
        this.javaSocket = llllllllllllIlllIIllIlIIIlllllII;
        if (lIIIlIlllIlIlIll(PlatformDependent.canEnableTcpNoDelayByDefault() ? 1 : 0)) {
            try {
                this.setTcpNoDelay((boolean)(DefaultSocketChannelConfig.llIIlIIIIlIllI[1] != 0));
                "".length();
                "".length();
                if ("   ".length() > "   ".length()) {
                    throw null;
                }
            }
            catch (Exception ex) {}
        }
    }
    
    private static String lIIIlIlllIlIIlll(String llllllllllllIlllIIllIIllIllIIIll, final String llllllllllllIlllIIllIIllIllIIIlI) {
        llllllllllllIlllIIllIIllIllIIIll = new String(Base64.getDecoder().decode(llllllllllllIlllIIllIIllIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIIllIllIIllI = new StringBuilder();
        final char[] llllllllllllIlllIIllIIllIllIIlIl = llllllllllllIlllIIllIIllIllIIIlI.toCharArray();
        int llllllllllllIlllIIllIIllIllIIlII = DefaultSocketChannelConfig.llIIlIIIIlIllI[0];
        final Exception llllllllllllIlllIIllIIllIlIllllI = (Object)llllllllllllIlllIIllIIllIllIIIll.toCharArray();
        final float llllllllllllIlllIIllIIllIlIlllIl = llllllllllllIlllIIllIIllIlIllllI.length;
        int llllllllllllIlllIIllIIllIlIlllII = DefaultSocketChannelConfig.llIIlIIIIlIllI[0];
        while (lIIIlIlllIlIlllI(llllllllllllIlllIIllIIllIlIlllII, (int)llllllllllllIlllIIllIIllIlIlllIl)) {
            final char llllllllllllIlllIIllIIllIllIlIIl = llllllllllllIlllIIllIIllIlIllllI[llllllllllllIlllIIllIIllIlIlllII];
            llllllllllllIlllIIllIIllIllIIllI.append((char)(llllllllllllIlllIIllIIllIllIlIIl ^ llllllllllllIlllIIllIIllIllIIlIl[llllllllllllIlllIIllIIllIllIIlII % llllllllllllIlllIIllIIllIllIIlIl.length]));
            "".length();
            ++llllllllllllIlllIIllIIllIllIIlII;
            ++llllllllllllIlllIIllIIllIlIlllII;
            "".length();
            if (((0xB6 ^ 0xA2) & ~(0x6 ^ 0x12)) > (0x7A ^ 0x7E)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIIllIllIIllI);
    }
    
    @Override
    public boolean isAllowHalfClosure() {
        return this.allowHalfClosure;
    }
    
    @Override
    public SocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator llllllllllllIlllIIllIIlllIlIllll) {
        super.setMessageSizeEstimator(llllllllllllIlllIIllIIlllIlIllll);
        "".length();
        return this;
    }
    
    private static boolean lIIIlIlllIlIlIlI(final Object llllllllllllIlllIIllIIllIlIlIIIl) {
        return llllllllllllIlllIIllIIllIlIlIIIl == null;
    }
    
    @Override
    public SocketChannelConfig setSoLinger(final int llllllllllllIlllIIllIlIIIIIIlIIl) {
        try {
            if (lIIIlIlllIlIllIl(llllllllllllIlllIIllIlIIIIIIlIIl)) {
                this.javaSocket.setSoLinger((boolean)(DefaultSocketChannelConfig.llIIlIIIIlIllI[0] != 0), DefaultSocketChannelConfig.llIIlIIIIlIllI[0]);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                this.javaSocket.setSoLinger((boolean)(DefaultSocketChannelConfig.llIIlIIIIlIllI[1] != 0), llllllllllllIlllIIllIlIIIIIIlIIl);
            }
            "".length();
            if ((0x21 ^ 0x25) <= 0) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIIIlIll) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIIIlIll);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setAutoRead(final boolean llllllllllllIlllIIllIIllllIIlIIl) {
        super.setAutoRead(llllllllllllIlllIIllIIllllIIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public SocketChannelConfig setAllowHalfClosure(final boolean llllllllllllIlllIIllIIlllllIllIl) {
        this.allowHalfClosure = llllllllllllIlllIIllIIlllllIllIl;
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        try {
            return this.javaSocket.getSendBufferSize();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIllIIIII) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIllIIIII);
        }
    }
    
    @Override
    public SocketChannelConfig setSendBufferSize(final int llllllllllllIlllIIllIlIIIIIlIIlI) {
        try {
            this.javaSocket.setSendBufferSize(llllllllllllIlllIIllIlIIIIIlIIlI);
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIIlIlII) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIIlIlII);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setConnectTimeoutMillis(final int llllllllllllIlllIIllIIlllllIIlll) {
        super.setConnectTimeoutMillis(llllllllllllIlllIIllIIlllllIIlll);
        "".length();
        return this;
    }
    
    private static void lIIIlIlllIlIlIII() {
        (llIIlIIIIlIlIl = new String[DefaultSocketChannelConfig.llIIlIIIIlIllI[1]])[DefaultSocketChannelConfig.llIIlIIIIlIllI[0]] = lIIIlIlllIlIIlll("Mic4IhY3JSUmMQ==", "XFNCE");
    }
    
    @Override
    public SocketChannelConfig setWriteSpinCount(final int llllllllllllIlllIIllIIllllIllIll) {
        super.setWriteSpinCount(llllllllllllIlllIIllIIllllIllIll);
        "".length();
        return this;
    }
    
    @Override
    public SocketChannelConfig setKeepAlive(final boolean llllllllllllIlllIIllIlIIIIllIlll) {
        try {
            this.javaSocket.setKeepAlive(llllllllllllIlllIIllIlIIIIllIlll);
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIlllIll) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIlllIll);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setWriteBufferHighWaterMark(final int llllllllllllIlllIIllIIlllIlllIll) {
        super.setWriteBufferHighWaterMark(llllllllllllIlllIIllIIlllIlllIll);
        "".length();
        return this;
    }
    
    private static boolean lIIIlIlllIlIlIll(final int llllllllllllIlllIIllIIllIlIIllll) {
        return llllllllllllIlllIIllIIllIlIIllll != 0;
    }
    
    @Override
    public int getTrafficClass() {
        try {
            return this.javaSocket.getTrafficClass();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIlIlIlII) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIlIlIlII);
        }
    }
    
    private static boolean lIIIlIlllIlIlllI(final int llllllllllllIlllIIllIIllIlIllIII, final int llllllllllllIlllIIllIIllIlIlIlll) {
        return llllllllllllIlllIIllIIllIlIllIII < llllllllllllIlllIIllIIllIlIlIlll;
    }
    
    @Override
    public int getReceiveBufferSize() {
        try {
            return this.javaSocket.getReceiveBufferSize();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIllIIllI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIllIIllI);
        }
    }
    
    @Override
    public SocketChannelConfig setReceiveBufferSize(final int llllllllllllIlllIIllIlIIIIlIIIlI) {
        try {
            this.javaSocket.setReceiveBufferSize(llllllllllllIlllIIllIlIIIIlIIIlI);
            "".length();
            if (" ".length() >= (0x96 ^ 0x92)) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIlIIllI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIlIIllI);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator llllllllllllIlllIIllIIllllIIllIl) {
        super.setRecvByteBufAllocator(llllllllllllIlllIIllIIllllIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> llllllllllllIlllIIllIlIIIllIllIl, final T llllllllllllIlllIIllIlIIIllIllII) {
        this.validate(llllllllllllIlllIIllIlIIIllIllIl, llllllllllllIlllIIllIlIIIllIllII);
        if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if (null != null) {
                return ((0x5D ^ 0x59 ^ (0x48 ^ 0x2C)) & (0x2F ^ 0x60 ^ (0x3D ^ 0x12) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if ((0x83 ^ 0x87) <= 0) {
                return ((0x73 ^ 0x22) & ~(0x3A ^ 0x6B)) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.TCP_NODELAY)) {
            this.setTcpNoDelay((boolean)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if (((0x2F ^ 0x66) & ~(0xC ^ 0x45)) != 0x0) {
                return ((0x70 ^ 0x69) & ~(0x3 ^ 0x1A)) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.SO_KEEPALIVE)) {
            this.setKeepAlive((boolean)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if ((0x5F ^ 0x36 ^ (0x7A ^ 0x16)) <= 0) {
                return ((42 + 119 - 73 + 86 ^ 22 + 0 + 61 + 47) & (11 + 27 + 14 + 83 ^ 15 + 126 + 11 + 19 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if ((0x40 ^ 0x44) <= "  ".length()) {
                return ((0x87 ^ 0xB4) & ~(0x7A ^ 0x49)) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.SO_LINGER)) {
            this.setSoLinger((int)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if (null != null) {
                return ((38 + 131 - 138 + 101 ^ 130 + 69 - 175 + 132) & (0x28 ^ 0x45 ^ (0xF3 ^ 0x86) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.IP_TOS)) {
            this.setTrafficClass((int)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if ("   ".length() < 0) {
                return ((0xE2 ^ 0x9B ^ (0x66 ^ 0x1B)) & (151 + 65 - 114 + 81 ^ 130 + 172 - 164 + 41 ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!lIIIlIlllIlIllII(llllllllllllIlllIIllIlIIIllIllIl, ChannelOption.ALLOW_HALF_CLOSURE)) {
                return super.setOption(llllllllllllIlllIIllIlIIIllIllIl, llllllllllllIlllIIllIlIIIllIllII);
            }
            this.setAllowHalfClosure((boolean)llllllllllllIlllIIllIlIIIllIllII);
            "".length();
            "".length();
            if (-" ".length() > 0) {
                return ((0x56 ^ 0x52) & ~(0xBC ^ 0xB8)) != 0x0;
            }
        }
        return DefaultSocketChannelConfig.llIIlIIIIlIllI[1] != 0;
    }
    
    @Override
    public SocketChannelConfig setTcpNoDelay(final boolean llllllllllllIlllIIllIIlllllllllI) {
        try {
            this.javaSocket.setTcpNoDelay(llllllllllllIlllIIllIIlllllllllI);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIlIIIIIIIIlI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIIIIIIlI);
        }
        return this;
    }
    
    @Override
    public SocketChannelConfig setTrafficClass(final int llllllllllllIlllIIllIIllllllIlll) {
        try {
            this.javaSocket.setTrafficClass(llllllllllllIlllIIllIIllllllIlll);
            "".length();
            if (((0x2 ^ 0x7E ^ (0xF1 ^ 0xB5)) & (0x5D ^ 0x48 ^ (0x9B ^ 0xB6) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (SocketException llllllllllllIlllIIllIIlllllllIIl) {
            throw new ChannelException(llllllllllllIlllIIllIIlllllllIIl);
        }
        return this;
    }
    
    @Override
    public boolean isKeepAlive() {
        try {
            return this.javaSocket.getKeepAlive();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIlIIlllI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIlIIlllI);
        }
    }
    
    @Override
    public boolean isTcpNoDelay() {
        try {
            return this.javaSocket.getTcpNoDelay();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIlIIIIlI) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIlIIIIlI);
        }
    }
    
    @Override
    public SocketChannelConfig setAllocator(final ByteBufAllocator llllllllllllIlllIIllIIllllIlIlIl) {
        super.setAllocator(llllllllllllIlllIIllIIllllIlIlIl);
        "".length();
        return this;
    }
    
    @Override
    public SocketChannelConfig setWriteBufferLowWaterMark(final int llllllllllllIlllIIllIIlllIllIlll) {
        super.setWriteBufferLowWaterMark(llllllllllllIlllIIllIIlllIllIlll);
        "".length();
        return this;
    }
    
    @Override
    public boolean isReuseAddress() {
        try {
            return this.javaSocket.getReuseAddress();
        }
        catch (SocketException llllllllllllIlllIIllIlIIIlIIlIII) {
            throw new ChannelException(llllllllllllIlllIIllIlIIIlIIlIII);
        }
    }
}
