// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.util.NetUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.socket.ServerSocketChannelConfig;
import io.netty.channel.DefaultChannelConfig;

public final class EpollServerSocketChannelConfig extends DefaultChannelConfig implements ServerSocketChannelConfig
{
    private static final /* synthetic */ String[] lIlIIIllllIlII;
    private final /* synthetic */ EpollServerSocketChannel channel;
    private volatile /* synthetic */ int backlog;
    private static final /* synthetic */ int[] lIlIIIllllIllI;
    
    EpollServerSocketChannelConfig(final EpollServerSocketChannel lllllllllllllIIIlllIlllIlIIllIIl) {
        super(lllllllllllllIIIlllIlllIlIIllIIl);
        this.backlog = NetUtil.SOMAXCONN;
        this.channel = lllllllllllllIIIlllIlllIlIIllIIl;
        this.setReuseAddress((boolean)(EpollServerSocketChannelConfig.lIlIIIllllIllI[0] != 0));
        "".length();
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[EpollServerSocketChannelConfig.lIlIIIllllIllI[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[EpollServerSocketChannelConfig.lIlIIIllllIllI[2]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollServerSocketChannelConfig.lIlIIIllllIllI[0]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollServerSocketChannelConfig.lIlIIIllllIllI[3]] = ChannelOption.SO_BACKLOG;
        lllllllllllllIIIIlIllIIIIIlllIll[EpollServerSocketChannelConfig.lIlIIIllllIllI[4]] = EpollChannelOption.SO_REUSEPORT;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    private static void lllIIlIIIIlllIl() {
        (lIlIIIllllIllI = new int[6])[0] = " ".length();
        EpollServerSocketChannelConfig.lIlIIIllllIllI[1] = (0xB0 ^ 0xB4);
        EpollServerSocketChannelConfig.lIlIIIllllIllI[2] = ((0x85 ^ 0xA2) & ~(0x23 ^ 0x4));
        EpollServerSocketChannelConfig.lIlIIIllllIllI[3] = "  ".length();
        EpollServerSocketChannelConfig.lIlIIIllllIllI[4] = "   ".length();
        EpollServerSocketChannelConfig.lIlIIIllllIllI[5] = (0x62 ^ 0x73 ^ (0x30 ^ 0x29));
    }
    
    @Override
    public EpollServerSocketChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIlllIlllIIIlllIII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIIlllIlllIIIlllIII);
        "".length();
        return this;
    }
    
    private static void lllIIlIIIIllIlI() {
        (lIlIIIllllIlII = new String[EpollServerSocketChannelConfig.lIlIIIllllIllI[0]])[EpollServerSocketChannelConfig.lIlIIIllllIllI[2]] = lllIIlIIIIllIIl("iG6j2XL+OafY7D5/pvWkAg==", "aCGhX");
    }
    
    @Override
    public EpollServerSocketChannelConfig setAutoRead(final boolean lllllllllllllIIIlllIlllIIlIIIlII) {
        super.setAutoRead(lllllllllllllIIIlllIlllIIlIIIlII);
        "".length();
        return this;
    }
    
    @Override
    public EpollServerSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIlllIlllIIlIIlIII) {
        super.setRecvByteBufAllocator(lllllllllllllIIIlllIlllIIlIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public int getReceiveBufferSize() {
        return Native.getReceiveBufferSize(this.channel.fd);
    }
    
    @Override
    protected void autoReadCleared() {
        this.channel.clearEpollIn();
    }
    
    @Override
    public EpollServerSocketChannelConfig setWriteSpinCount(final int lllllllllllllIIIlllIlllIIlIlIllI) {
        super.setWriteSpinCount(lllllllllllllIIIlllIlllIIlIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public EpollServerSocketChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIlllIlllIIllIIIlI) {
        super.setConnectTimeoutMillis(lllllllllllllIIIlllIlllIIllIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public boolean isReuseAddress() {
        int n;
        if (lllIIlIIIIlllll(Native.isReuseAddress(this.channel.fd), EpollServerSocketChannelConfig.lIlIIIllllIllI[0])) {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[0];
            "".length();
            if ((0xAB ^ 0xAF) <= 0) {
                return ((0xF6 ^ 0xC1) & ~(0x19 ^ 0x2E)) != 0x0;
            }
        }
        else {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[2];
        }
        return n != 0;
    }
    
    private static boolean lllIIlIIIlIIIIl(final int lllllllllllllIIIlllIllIllIIIllIl) {
        return lllllllllllllIIIlllIllIllIIIllIl < 0;
    }
    
    @Override
    public EpollServerSocketChannelConfig setBacklog(final int lllllllllllllIIIlllIlllIIllIlIII) {
        if (lllIIlIIIlIIIIl(lllllllllllllIIIlllIlllIIllIlIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EpollServerSocketChannelConfig.lIlIIIllllIlII[EpollServerSocketChannelConfig.lIlIIIllllIllI[2]]).append(lllllllllllllIIIlllIlllIIllIlIII)));
        }
        this.backlog = lllllllllllllIIIlllIlllIIllIlIII;
        return this;
    }
    
    private static boolean lllIIlIIIIlllll(final int lllllllllllllIIIlllIllIllIIlIllI, final int lllllllllllllIIIlllIllIllIIlIlIl) {
        return lllllllllllllIIIlllIllIllIIlIllI == lllllllllllllIIIlllIllIllIIlIlIl;
    }
    
    @Override
    public EpollServerSocketChannelConfig setReceiveBufferSize(final int lllllllllllllIIIlllIlllIIlllIlIl) {
        Native.setReceiveBufferSize(this.channel.fd, lllllllllllllIIIlllIlllIIlllIlIl);
        return this;
    }
    
    private static boolean lllIIlIIIlIIIII(final int lllllllllllllIIIlllIllIllIIIllll) {
        return lllllllllllllIIIlllIllIllIIIllll != 0;
    }
    
    public EpollServerSocketChannelConfig setReusePort(final boolean lllllllllllllIIIlllIlllIIIlIlIIl) {
        final int fd = this.channel.fd;
        int n;
        if (lllIIlIIIlIIIII(lllllllllllllIIIlllIlllIIIlIlIIl ? 1 : 0)) {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[0];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[2];
        }
        Native.setReusePort(fd, n);
        return this;
    }
    
    @Override
    public EpollServerSocketChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIlllIlllIIIlllllI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIIlllIlllIIIlllllI);
        "".length();
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIlllIlllIlIIlIIII) {
        if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIlIIII, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIlIIII, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIlIIII, ChannelOption.SO_BACKLOG)) {
            return (T)Integer.valueOf(this.getBacklog());
        }
        if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIlIIII, EpollChannelOption.SO_REUSEPORT)) {
            return (T)Boolean.valueOf(this.isReusePort());
        }
        return super.getOption(lllllllllllllIIIlllIlllIlIIlIIII);
    }
    
    private static String lllIIlIIIIllIIl(final String lllllllllllllIIIlllIllIllIIllllI, final String lllllllllllllIIIlllIllIllIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIllIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIllIIllIll.getBytes(StandardCharsets.UTF_8)), EpollServerSocketChannelConfig.lIlIIIllllIllI[5]), "DES");
            final Cipher lllllllllllllIIIlllIllIllIlIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllIllIlIIIII.init(EpollServerSocketChannelConfig.lIlIIIllllIllI[3], lllllllllllllIIIlllIllIllIlIIIIl);
            return new String(lllllllllllllIIIlllIllIllIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIllIIlllll) {
            lllllllllllllIIIlllIllIllIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlIIIIllllI(final Object lllllllllllllIIIlllIllIllIIlIIlI, final Object lllllllllllllIIIlllIllIllIIlIIIl) {
        return lllllllllllllIIIlllIllIllIIlIIlI == lllllllllllllIIIlllIllIllIIlIIIl;
    }
    
    public boolean isReusePort() {
        int n;
        if (lllIIlIIIIlllll(Native.isReusePort(this.channel.fd), EpollServerSocketChannelConfig.lIlIIIllllIllI[0])) {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[0];
            "".length();
            if ((0xD0 ^ 0x97 ^ (0x4C ^ 0xF)) == 0x0) {
                return ((63 + 11 - 55 + 133 ^ 111 + 118 - 203 + 108) & (0xBC ^ 0xAE ^ (0x90 ^ 0x9C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[2];
        }
        return n != 0;
    }
    
    @Override
    public EpollServerSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIlllIlllIIIllIIlI) {
        super.setMessageSizeEstimator(lllllllllllllIIIlllIlllIIIllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public EpollServerSocketChannelConfig setReuseAddress(final boolean lllllllllllllIIIlllIlllIlIIIIIII) {
        final int fd = this.channel.fd;
        int n;
        if (lllIIlIIIlIIIII(lllllllllllllIIIlllIlllIlIIIIIII ? 1 : 0)) {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[0];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else {
            n = EpollServerSocketChannelConfig.lIlIIIllllIllI[2];
        }
        Native.setReuseAddress(fd, n);
        return this;
    }
    
    @Override
    public EpollServerSocketChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIlllIlllIIlIlIIII) {
        super.setAllocator(lllllllllllllIIIlllIlllIIlIlIIII);
        "".length();
        return this;
    }
    
    @Override
    public int getBacklog() {
        return this.backlog;
    }
    
    @Override
    public EpollServerSocketChannelConfig setPerformancePreferences(final int lllllllllllllIIIlllIlllIIlllIIlI, final int lllllllllllllIIIlllIlllIIlllIIIl, final int lllllllllllllIIIlllIlllIIlllIIII) {
        return this;
    }
    
    static {
        lllIIlIIIIlllIl();
        lllIIlIIIIllIlI();
    }
    
    @Override
    public EpollServerSocketChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIlllIlllIIlIllIlI) {
        super.setMaxMessagesPerRead(lllllllllllllIIIlllIlllIIlIllIlI);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIlllIlllIlIIIlIII, final T lllllllllllllIIIlllIlllIlIIIlIlI) {
        this.validate(lllllllllllllIIIlllIlllIlIIIlIII, lllllllllllllIIIlllIlllIlIIIlIlI);
        if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIIlIII, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIIIlllIlllIlIIIlIlI);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xE8 ^ 0xC7) & ~(0xB1 ^ 0x9E)) != 0x0;
            }
        }
        else if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIIlIII, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)lllllllllllllIIIlllIlllIlIIIlIlI);
            "".length();
            "".length();
            if (null != null) {
                return ((0x8E ^ 0x97) & ~(0x8F ^ 0x96)) != 0x0;
            }
        }
        else if (lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIIlIII, ChannelOption.SO_BACKLOG)) {
            this.setBacklog((int)lllllllllllllIIIlllIlllIlIIIlIlI);
            "".length();
            "".length();
            if (null != null) {
                return ((0x61 ^ 0x4E) & ~(0x5F ^ 0x70)) != 0x0;
            }
        }
        else {
            if (!lllIIlIIIIllllI(lllllllllllllIIIlllIlllIlIIIlIII, EpollChannelOption.SO_REUSEPORT)) {
                return super.setOption(lllllllllllllIIIlllIlllIlIIIlIII, lllllllllllllIIIlllIlllIlIIIlIlI);
            }
            this.setReusePort((boolean)lllllllllllllIIIlllIlllIlIIIlIlI);
            "".length();
            "".length();
            if (" ".length() > " ".length()) {
                return ((0x6E ^ 0x5F) & ~(0xA5 ^ 0x94)) != 0x0;
            }
        }
        return EpollServerSocketChannelConfig.lIlIIIllllIllI[0] != 0;
    }
}
