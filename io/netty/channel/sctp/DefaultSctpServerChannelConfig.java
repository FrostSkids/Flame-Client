// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.NetUtil;
import io.netty.channel.Channel;
import java.util.Map;
import io.netty.channel.ChannelOption;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.ChannelConfig;
import java.io.IOException;
import io.netty.channel.ChannelException;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import com.sun.nio.sctp.SctpServerChannel;
import io.netty.channel.DefaultChannelConfig;

public class DefaultSctpServerChannelConfig extends DefaultChannelConfig implements SctpServerChannelConfig
{
    private static final /* synthetic */ int[] lIIIlllllllIII;
    private volatile /* synthetic */ int backlog;
    private final /* synthetic */ SctpServerChannel javaChannel;
    private static final /* synthetic */ String[] lIIIllllllIlll;
    
    @Override
    public SctpServerChannelConfig setSendBufferSize(final int lllllllllllllIIllllIIIIlIIIIlIll) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SO_SNDBUF, lllllllllllllIIllllIIIIlIIIIlIll);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIllllIIIIlIIIIllIl) {
            throw new ChannelException(lllllllllllllIIllllIIIIlIIIIllIl);
        }
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setBacklog(final int lllllllllllllIIllllIIIIIlllIIIIl) {
        if (llIIlIIIlIlllIl(lllllllllllllIIllllIIIIIlllIIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSctpServerChannelConfig.lIIIllllllIlll[DefaultSctpServerChannelConfig.lIIIlllllllIII[2]]).append(lllllllllllllIIllllIIIIIlllIIIIl)));
        }
        this.backlog = lllllllllllllIIllllIIIIIlllIIIIl;
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIllllIIIIIlIlIllIl) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIllllIIIIIlIlIllIl);
        "".length();
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIllllIIIIIlIlIIlll) {
        super.setMessageSizeEstimator(lllllllllllllIIllllIIIIIlIlIIlll);
        "".length();
        return this;
    }
    
    private static boolean llIIlIIIlIllIll(final Object lllllllllllllIIllllIIIIIIlIIIlll) {
        return lllllllllllllIIllllIIIIIIlIIIlll == null;
    }
    
    private static boolean llIIlIIIlIlllII(final Object lllllllllllllIIllllIIIIIIlIIlIlI, final Object lllllllllllllIIllllIIIIIIlIIlIIl) {
        return lllllllllllllIIllllIIIIIIlIIlIlI == lllllllllllllIIllllIIIIIIlIIlIIl;
    }
    
    @Override
    public SctpServerChannelConfig setInitMaxStreams(final SctpStandardSocketOptions.InitMaxStreams lllllllllllllIIllllIIIIIlllIllIl) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS, lllllllllllllIIllllIIIIIlllIllIl);
            "".length();
            "".length();
            if ((0x7B ^ 0x41 ^ (0x87 ^ 0xB8)) == 0x0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIllllIIIIIlllIllll) {
            throw new ChannelException(lllllllllllllIIllllIIIIIlllIllll);
        }
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setAutoRead(final boolean lllllllllllllIIllllIIIIIlIllllll) {
        super.setAutoRead(lllllllllllllIIllllIIIIIlIllllll);
        "".length();
        return this;
    }
    
    @Override
    public int getBacklog() {
        return this.backlog;
    }
    
    @Override
    public SctpServerChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIllllIIIIIllIIllll) {
        super.setConnectTimeoutMillis(lllllllllllllIIllllIIIIIllIIllll);
        "".length();
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIllllIIIIIlIllIIIl) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIllllIIIIIlIllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SO_SNDBUF);
        }
        catch (IOException lllllllllllllIIllllIIIIlIIIlIlII) {
            throw new ChannelException(lllllllllllllIIllllIIIIlIIIlIlII);
        }
    }
    
    static {
        llIIlIIIlIllIlI();
        llIIlIIIlIllIIl();
    }
    
    @Override
    public SctpServerChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIllllIIIIIllIIIlIl) {
        super.setRecvByteBufAllocator(lllllllllllllIIllllIIIIIllIIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setAutoClose(final boolean lllllllllllllIIllllIIIIIlIllIlll) {
        super.setAutoClose(lllllllllllllIIllllIIIIIlIllIlll);
        "".length();
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIllllIIIIIllIllIll) {
        super.setMaxMessagesPerRead(lllllllllllllIIllllIIIIIllIllIll);
        "".length();
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIllllIIIIlIIlIIIII) {
        if (llIIlIIIlIlllII(lllllllllllllIIllllIIIIlIIlIIIII, ChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (llIIlIIIlIlllII(lllllllllllllIIllllIIIIlIIlIIIII, ChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        return super.getOption(lllllllllllllIIllllIIIIlIIlIIIII);
    }
    
    @Override
    public SctpServerChannelConfig setReceiveBufferSize(final int lllllllllllllIIllllIIIIIllllllII) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SO_RCVBUF, lllllllllllllIIllllIIIIIllllllII);
            "".length();
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIllllIIIIIlllllllI) {
            throw new ChannelException(lllllllllllllIIllllIIIIIlllllllI);
        }
        return this;
    }
    
    @Override
    public SctpServerChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIllllIIIIIllIIlIll) {
        super.setAllocator(lllllllllllllIIllllIIIIIllIIlIll);
        "".length();
        return this;
    }
    
    private static void llIIlIIIlIllIlI() {
        (lIIIlllllllIII = new int[4])[0] = (("  ".length() ^ (0x1D ^ 0x46)) & (0xA6 ^ 0x91 ^ (0xFE ^ 0x90) ^ -" ".length()));
        DefaultSctpServerChannelConfig.lIIIlllllllIII[1] = "   ".length();
        DefaultSctpServerChannelConfig.lIIIlllllllIII[2] = " ".length();
        DefaultSctpServerChannelConfig.lIIIlllllllIII[3] = "  ".length();
    }
    
    @Override
    public int getReceiveBufferSize() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SO_RCVBUF);
        }
        catch (IOException lllllllllllllIIllllIIIIlIIIIIlIl) {
            throw new ChannelException(lllllllllllllIIllllIIIIlIIIIIlIl);
        }
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIllllIIIIlIIIllIII, final T lllllllllllllIIllllIIIIlIIIllIlI) {
        this.validate(lllllllllllllIIllllIIIIlIIIllIII, lllllllllllllIIllllIIIIlIIIllIlI);
        if (llIIlIIIlIlllII(lllllllllllllIIllllIIIIlIIIllIII, ChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIIllllIIIIlIIIllIlI);
            "".length();
            "".length();
            if (((98 + 6 - 56 + 86 ^ 106 + 148 - 116 + 15) & (39 + 31 + 81 + 67 ^ 178 + 46 - 204 + 177 ^ -" ".length())) < -" ".length()) {
                return ((133 + 192 - 266 + 156 ^ 118 + 125 - 242 + 133) & (164 + 93 - 133 + 74 ^ 136 + 33 - 78 + 60 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIlIIIlIlllII(lllllllllllllIIllllIIIIlIIIllIII, ChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)lllllllllllllIIllllIIIIlIIIllIlI);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return ((0x7A ^ 0x61 ^ (0x20 ^ 0x14)) & (0x46 ^ 0x67 ^ (0xB9 ^ 0xB7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!llIIlIIIlIlllII(lllllllllllllIIllllIIIIlIIIllIII, SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS)) {
                return super.setOption(lllllllllllllIIllllIIIIlIIIllIII, lllllllllllllIIllllIIIIlIIIllIlI);
            }
            this.setInitMaxStreams((SctpStandardSocketOptions.InitMaxStreams)lllllllllllllIIllllIIIIlIIIllIlI);
            "".length();
            "".length();
            if ("  ".length() == ((39 + 122 - 125 + 95 ^ 180 + 100 - 208 + 112) & (0x11 ^ 0x25 ^ (0x15 ^ 0x1A) ^ -" ".length()))) {
                return ((0x27 ^ 0x7E ^ (0x7 ^ 0x54)) & (2 + 165 - 112 + 114 ^ 67 + 60 - 35 + 71 ^ -" ".length())) != 0x0;
            }
        }
        return DefaultSctpServerChannelConfig.lIIIlllllllIII[2] != 0;
    }
    
    @Override
    public SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS);
        }
        catch (IOException lllllllllllllIIllllIIIIIllllIllI) {
            throw new ChannelException(lllllllllllllIIllllIIIIIllllIllI);
        }
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultSctpServerChannelConfig.lIIIlllllllIII[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpServerChannelConfig.lIIIlllllllIII[0]] = ChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpServerChannelConfig.lIIIlllllllIII[2]] = ChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpServerChannelConfig.lIIIlllllllIII[3]] = SctpChannelOption.SCTP_INIT_MAXSTREAMS;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    public DefaultSctpServerChannelConfig(final io.netty.channel.sctp.SctpServerChannel lllllllllllllIIllllIIIIlIIlIlIlI, final SctpServerChannel lllllllllllllIIllllIIIIlIIlIlIIl) {
        super(lllllllllllllIIllllIIIIlIIlIlIlI);
        this.backlog = NetUtil.SOMAXCONN;
        if (llIIlIIIlIllIll(lllllllllllllIIllllIIIIlIIlIlIIl)) {
            throw new NullPointerException(DefaultSctpServerChannelConfig.lIIIllllllIlll[DefaultSctpServerChannelConfig.lIIIlllllllIII[0]]);
        }
        this.javaChannel = lllllllllllllIIllllIIIIlIIlIlIIl;
    }
    
    private static void llIIlIIIlIllIIl() {
        (lIIIllllllIlll = new String[DefaultSctpServerChannelConfig.lIIIlllllllIII[3]])[DefaultSctpServerChannelConfig.lIIIlllllllIII[0]] = llIIlIIIlIllIII("CDs9BDEKOyULFw4=", "bZKer");
        DefaultSctpServerChannelConfig.lIIIllllllIlll[DefaultSctpServerChannelConfig.lIIIlllllllIII[2]] = llIIlIIIlIllIII("DgYCKTwDAFti", "lgaBP");
    }
    
    @Override
    public SctpServerChannelConfig setWriteSpinCount(final int lllllllllllllIIllllIIIIIllIlIlll) {
        super.setWriteSpinCount(lllllllllllllIIllllIIIIIllIlIlll);
        "".length();
        return this;
    }
    
    private static boolean llIIlIIIlIlllIl(final int lllllllllllllIIllllIIIIIIlIIIlIl) {
        return lllllllllllllIIllllIIIIIIlIIIlIl < 0;
    }
    
    private static boolean llIIlIIIlIllllI(final int lllllllllllllIIllllIIIIIIlIIlllI, final int lllllllllllllIIllllIIIIIIlIIllIl) {
        return lllllllllllllIIllllIIIIIIlIIlllI < lllllllllllllIIllllIIIIIIlIIllIl;
    }
    
    private static String llIIlIIIlIllIII(String lllllllllllllIIllllIIIIIIlIllIIl, final String lllllllllllllIIllllIIIIIIlIlllIl) {
        lllllllllllllIIllllIIIIIIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllllIIIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIIIIIlIlllII = new StringBuilder();
        final char[] lllllllllllllIIllllIIIIIIlIllIll = lllllllllllllIIllllIIIIIIlIlllIl.toCharArray();
        int lllllllllllllIIllllIIIIIIlIllIlI = DefaultSctpServerChannelConfig.lIIIlllllllIII[0];
        final Exception lllllllllllllIIllllIIIIIIlIlIlII = (Object)lllllllllllllIIllllIIIIIIlIllIIl.toCharArray();
        final long lllllllllllllIIllllIIIIIIlIlIIll = lllllllllllllIIllllIIIIIIlIlIlII.length;
        String lllllllllllllIIllllIIIIIIlIlIIlI = (String)DefaultSctpServerChannelConfig.lIIIlllllllIII[0];
        while (llIIlIIIlIllllI((int)lllllllllllllIIllllIIIIIIlIlIIlI, (int)lllllllllllllIIllllIIIIIIlIlIIll)) {
            final char lllllllllllllIIllllIIIIIIlIlllll = lllllllllllllIIllllIIIIIIlIlIlII[lllllllllllllIIllllIIIIIIlIlIIlI];
            lllllllllllllIIllllIIIIIIlIlllII.append((char)(lllllllllllllIIllllIIIIIIlIlllll ^ lllllllllllllIIllllIIIIIIlIllIll[lllllllllllllIIllllIIIIIIlIllIlI % lllllllllllllIIllllIIIIIIlIllIll.length]));
            "".length();
            ++lllllllllllllIIllllIIIIIIlIllIlI;
            ++lllllllllllllIIllllIIIIIIlIlIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIIIIIlIlllII);
    }
}
