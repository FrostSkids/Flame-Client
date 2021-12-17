// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import io.netty.util.NetUtil;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBufAllocator;
import java.net.SocketException;
import io.netty.channel.ChannelException;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelOption;
import java.net.ServerSocket;
import io.netty.channel.DefaultChannelConfig;

public class DefaultServerSocketChannelConfig extends DefaultChannelConfig implements ServerSocketChannelConfig
{
    private volatile /* synthetic */ int backlog;
    private static final /* synthetic */ int[] lIIlIIlIIlllIl;
    private static final /* synthetic */ String[] lIIlIIlIIllIll;
    protected final /* synthetic */ ServerSocket javaSocket;
    
    @Override
    public int getBacklog() {
        return this.backlog;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIllIllllIIlIIIlIIl, final T lllllllllllllIIllIllllIIlIIIlIII) {
        this.validate(lllllllllllllIIllIllllIIlIIIlIIl, lllllllllllllIIllIllllIIlIIIlIII);
        if (llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlIIl, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIIllIllllIIlIIIlIII);
            "".length();
            "".length();
            if ((0xAB ^ 0xAF) == 0x0) {
                return ((0xF4 ^ 0xBF) & ~(0x16 ^ 0x5D)) != 0x0;
            }
        }
        else if (llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlIIl, ChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)lllllllllllllIIllIllllIIlIIIlIII);
            "".length();
            "".length();
            if (null != null) {
                return ((0x42 ^ 0x5A) & ~(0x4E ^ 0x56)) != 0x0;
            }
        }
        else {
            if (!llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlIIl, ChannelOption.SO_BACKLOG)) {
                return super.setOption(lllllllllllllIIllIllllIIlIIIlIIl, lllllllllllllIIllIllllIIlIIIlIII);
            }
            this.setBacklog((int)lllllllllllllIIllIllllIIlIIIlIII);
            "".length();
            "".length();
            if (((0x65 ^ 0x5E) & ~(0x8F ^ 0xB4)) != 0x0) {
                return ((0xC8 ^ 0x93) & ~(0x6A ^ 0x31)) != 0x0;
            }
        }
        return DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[2] != 0;
    }
    
    private static boolean llIIllIIlllIllI(final Object lllllllllllllIIllIlllIlllIllIlll) {
        return lllllllllllllIIllIlllIlllIllIlll == null;
    }
    
    @Override
    public ServerSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIllIllllIIIIIlllII) {
        super.setMessageSizeEstimator(lllllllllllllIIllIllllIIIIIlllII);
        "".length();
        return this;
    }
    
    static {
        llIIllIIlllIlIl();
        llIIllIIllIllIl();
    }
    
    @Override
    public ServerSocketChannelConfig setReceiveBufferSize(final int lllllllllllllIIllIllllIIIllIlIlI) {
        try {
            this.javaSocket.setReceiveBufferSize(lllllllllllllIIllIllllIIIllIlIlI);
            "".length();
            if ("   ".length() <= ((0x13 ^ 0x7) & ~(0x86 ^ 0x92))) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIllIllllIIIllIllII) {
            throw new ChannelException(lllllllllllllIIllIllllIIIllIllII);
        }
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIllIllllIIIIllIllI) {
        super.setRecvByteBufAllocator(lllllllllllllIIllIllllIIIIllIllI);
        "".length();
        return this;
    }
    
    private static boolean llIIllIIlllIlll(final Object lllllllllllllIIllIlllIlllIlllIlI, final Object lllllllllllllIIllIlllIlllIlllIIl) {
        return lllllllllllllIIllIlllIlllIlllIlI == lllllllllllllIIllIlllIlllIlllIIl;
    }
    
    @Override
    public ServerSocketChannelConfig setReuseAddress(final boolean lllllllllllllIIllIllllIIIlllIlll) {
        try {
            this.javaSocket.setReuseAddress(lllllllllllllIIllIllllIIIlllIlll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (SocketException lllllllllllllIIllIllllIIIllllIll) {
            throw new ChannelException(lllllllllllllIIllIllllIIIllllIll);
        }
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setBacklog(final int lllllllllllllIIllIllllIIIlIlIlII) {
        if (llIIllIIllllIII(lllllllllllllIIllIllllIIIlIlIlII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultServerSocketChannelConfig.lIIlIIlIIllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[2]]).append(lllllllllllllIIllIllllIIIlIlIlII)));
        }
        this.backlog = lllllllllllllIIllIllllIIIlIlIlII;
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setAutoRead(final boolean lllllllllllllIIllIllllIIIIllIIII) {
        super.setAutoRead(lllllllllllllIIllIllllIIIIllIIII);
        "".length();
        return this;
    }
    
    public DefaultServerSocketChannelConfig(final ServerSocketChannel lllllllllllllIIllIllllIIlIIllIll, final ServerSocket lllllllllllllIIllIllllIIlIIllIlI) {
        super(lllllllllllllIIllIllllIIlIIllIll);
        this.backlog = NetUtil.SOMAXCONN;
        if (llIIllIIlllIllI(lllllllllllllIIllIllllIIlIIllIlI)) {
            throw new NullPointerException(DefaultServerSocketChannelConfig.lIIlIIlIIllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[0]]);
        }
        this.javaSocket = lllllllllllllIIllIllllIIlIIllIlI;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[0]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[2]] = ChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[3]] = ChannelOption.SO_BACKLOG;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    private static boolean llIIllIIllllIII(final int lllllllllllllIIllIlllIlllIllIlIl) {
        return lllllllllllllIIllIlllIlllIllIlIl < 0;
    }
    
    @Override
    public boolean isReuseAddress() {
        try {
            return this.javaSocket.getReuseAddress();
        }
        catch (SocketException lllllllllllllIIllIllllIIlIIIIIlI) {
            throw new ChannelException(lllllllllllllIIllIllllIIlIIIIIlI);
        }
    }
    
    @Override
    public ServerSocketChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIllIllllIIIIllllII) {
        super.setAllocator(lllllllllllllIIllIllllIIIIllllII);
        "".length();
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIllIllllIIIIlIlIlI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIllIllllIIIIlIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setWriteSpinCount(final int lllllllllllllIIllIllllIIIlIIIIlI) {
        super.setWriteSpinCount(lllllllllllllIIllIllllIIIlIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIllIllllIIIlIIlIII) {
        super.setMaxMessagesPerRead(lllllllllllllIIllIllllIIIlIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIllIllllIIlIIIlllI) {
        if (llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlllI, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlllI, ChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (llIIllIIlllIlll(lllllllllllllIIllIllllIIlIIIlllI, ChannelOption.SO_BACKLOG)) {
            return (T)Integer.valueOf(this.getBacklog());
        }
        return super.getOption(lllllllllllllIIllIllllIIlIIIlllI);
    }
    
    @Override
    public int getReceiveBufferSize() {
        try {
            return this.javaSocket.getReceiveBufferSize();
        }
        catch (SocketException lllllllllllllIIllIllllIIIlllIIll) {
            throw new ChannelException(lllllllllllllIIllIllllIIIlllIIll);
        }
    }
    
    @Override
    public ServerSocketChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIllIllllIIIlIIllII) {
        super.setConnectTimeoutMillis(lllllllllllllIIllIllllIIIlIIllII);
        "".length();
        return this;
    }
    
    @Override
    public ServerSocketChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIllIllllIIIIlIIIlI) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIllIllllIIIIlIIIlI);
        "".length();
        return this;
    }
    
    private static void llIIllIIllIllIl() {
        (lIIlIIlIIllIll = new String[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[3]])[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[0]] = llIIllIIllIlIll("JQMTMQcgAQ41IA==", "ObePT");
        DefaultServerSocketChannelConfig.lIIlIIlIIllIll[DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[2]] = llIIllIIllIllII("CAR+HeiWGTvpo9O6m0oEfg==", "AQrug");
    }
    
    private static String llIIllIIllIlIll(String lllllllllllllIIllIlllIllllIIlIIl, final String lllllllllllllIIllIlllIllllIIlIII) {
        lllllllllllllIIllIlllIllllIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIlllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlllIllllIIllII = new StringBuilder();
        final char[] lllllllllllllIIllIlllIllllIIlIll = lllllllllllllIIllIlllIllllIIlIII.toCharArray();
        int lllllllllllllIIllIlllIllllIIlIlI = DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[0];
        final double lllllllllllllIIllIlllIllllIIIlII = (Object)lllllllllllllIIllIlllIllllIIlIIl.toCharArray();
        final byte lllllllllllllIIllIlllIllllIIIIll = (byte)lllllllllllllIIllIlllIllllIIIlII.length;
        float lllllllllllllIIllIlllIllllIIIIlI = DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[0];
        while (llIIllIIllllIIl((int)lllllllllllllIIllIlllIllllIIIIlI, lllllllllllllIIllIlllIllllIIIIll)) {
            final char lllllllllllllIIllIlllIllllIIllll = lllllllllllllIIllIlllIllllIIIlII[lllllllllllllIIllIlllIllllIIIIlI];
            lllllllllllllIIllIlllIllllIIllII.append((char)(lllllllllllllIIllIlllIllllIIllll ^ lllllllllllllIIllIlllIllllIIlIll[lllllllllllllIIllIlllIllllIIlIlI % lllllllllllllIIllIlllIllllIIlIll.length]));
            "".length();
            ++lllllllllllllIIllIlllIllllIIlIlI;
            ++lllllllllllllIIllIlllIllllIIIIlI;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlllIllllIIllII);
    }
    
    private static void llIIllIIlllIlIl() {
        (lIIlIIlIIlllIl = new int[5])[0] = ((0x14 ^ 0x5B) & ~(0xCE ^ 0x81));
        DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[1] = "   ".length();
        DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[2] = " ".length();
        DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[3] = "  ".length();
        DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[4] = (0xB3 ^ 0xBB);
    }
    
    private static boolean llIIllIIllllIIl(final int lllllllllllllIIllIlllIlllIlllllI, final int lllllllllllllIIllIlllIlllIllllIl) {
        return lllllllllllllIIllIlllIlllIlllllI < lllllllllllllIIllIlllIlllIllllIl;
    }
    
    private static String llIIllIIllIllII(final String lllllllllllllIIllIlllIllllIlllII, final String lllllllllllllIIllIlllIllllIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllIlllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIllllIllIll.getBytes(StandardCharsets.UTF_8)), DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[4]), "DES");
            final Cipher lllllllllllllIIllIlllIlllllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIlllIlllllIIIII.init(DefaultServerSocketChannelConfig.lIIlIIlIIlllIl[3], lllllllllllllIIllIlllIlllllIIIIl);
            return new String(lllllllllllllIIllIlllIlllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllIllllIlllll) {
            lllllllllllllIIllIlllIllllIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ServerSocketChannelConfig setPerformancePreferences(final int lllllllllllllIIllIllllIIIllIIIIl, final int lllllllllllllIIllIllllIIIlIlllII, final int lllllllllllllIIllIllllIIIlIllIll) {
        this.javaSocket.setPerformancePreferences(lllllllllllllIIllIllllIIIllIIIIl, lllllllllllllIIllIllllIIIlIlllII, lllllllllllllIIllIllllIIIlIllIll);
        return this;
    }
}
