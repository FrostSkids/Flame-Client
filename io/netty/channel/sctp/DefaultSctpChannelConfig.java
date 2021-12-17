// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import io.netty.util.internal.PlatformDependent;
import io.netty.channel.Channel;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import java.io.IOException;
import io.netty.channel.ChannelException;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import com.sun.nio.sctp.SctpChannel;
import io.netty.channel.DefaultChannelConfig;

public class DefaultSctpChannelConfig extends DefaultChannelConfig implements SctpChannelConfig
{
    private static final /* synthetic */ int[] llIlIlIllIlIll;
    private final /* synthetic */ SctpChannel javaChannel;
    private static final /* synthetic */ String[] llIlIlIllIlIlI;
    
    private static boolean lIIlIlIIlIIlllll(final int llllllllllllIllIlIlIIIIlIllllIII) {
        return llllllllllllIllIlIlIIIIlIllllIII != 0;
    }
    
    @Override
    public SctpChannelConfig setAutoRead(final boolean llllllllllllIllIlIlIIIIlllllIIII) {
        super.setAutoRead(llllllllllllIllIlIlIIIIlllllIIII);
        "".length();
        return this;
    }
    
    private static boolean lIIlIlIIlIIllllI(final Object llllllllllllIllIlIlIIIIlIllllIlI) {
        return llllllllllllIllIlIlIIIIlIllllIlI == null;
    }
    
    @Override
    public boolean isSctpNoDelay() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SCTP_NODELAY);
        }
        catch (IOException llllllllllllIllIlIlIIIlIIlIIllIl) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIlIIllIl);
        }
    }
    
    @Override
    public SctpChannelConfig setMessageSizeEstimator(final MessageSizeEstimator llllllllllllIllIlIlIIIIlllIllIlI) {
        super.setMessageSizeEstimator(llllllllllllIllIlIlIIIIlllIllIlI);
        "".length();
        return this;
    }
    
    private static boolean lIIlIlIIlIlIIIII(final Object llllllllllllIllIlIlIIIIlIlllllIl, final Object llllllllllllIllIlIlIIIIlIlllllII) {
        return llllllllllllIllIlIlIIIIlIlllllIl == llllllllllllIllIlIlIIIIlIlllllII;
    }
    
    @Override
    public SctpChannelConfig setMaxMessagesPerRead(final int llllllllllllIllIlIlIIIlIIIIIlIlI) {
        super.setMaxMessagesPerRead(llllllllllllIllIlIlIIIlIIIIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultSctpChannelConfig.llIlIlIllIlIll[2]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpChannelConfig.llIlIlIllIlIll[0]] = SctpChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpChannelConfig.llIlIlIllIlIll[1]] = SctpChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpChannelConfig.llIlIlIllIlIll[3]] = SctpChannelOption.SCTP_NODELAY;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultSctpChannelConfig.llIlIlIllIlIll[4]] = SctpChannelOption.SCTP_INIT_MAXSTREAMS;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public SctpChannelConfig setReceiveBufferSize(final int llllllllllllIllIlIlIIIlIIIlIIllI) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SO_RCVBUF, llllllllllllIllIlIlIIIlIIIlIIllI);
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIlIlIII) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIlIlIII);
        }
        return this;
    }
    
    private static String lIIlIlIIlIIllIll(String llllllllllllIllIlIlIIIIllIIIllII, final String llllllllllllIllIlIlIIIIllIIIlIll) {
        llllllllllllIllIlIlIIIIllIIIllII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIIIIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIIIIllIIIllll = new StringBuilder();
        final char[] llllllllllllIllIlIlIIIIllIIIlllI = llllllllllllIllIlIlIIIIllIIIlIll.toCharArray();
        int llllllllllllIllIlIlIIIIllIIIllIl = DefaultSctpChannelConfig.llIlIlIllIlIll[0];
        final String llllllllllllIllIlIlIIIIllIIIIlll = (Object)llllllllllllIllIlIlIIIIllIIIllII.toCharArray();
        final Exception llllllllllllIllIlIlIIIIllIIIIllI = (Exception)llllllllllllIllIlIlIIIIllIIIIlll.length;
        long llllllllllllIllIlIlIIIIllIIIIlIl = DefaultSctpChannelConfig.llIlIlIllIlIll[0];
        while (lIIlIlIIlIlIIIIl((int)llllllllllllIllIlIlIIIIllIIIIlIl, (int)llllllllllllIllIlIlIIIIllIIIIllI)) {
            final char llllllllllllIllIlIlIIIIllIIlIIlI = llllllllllllIllIlIlIIIIllIIIIlll[llllllllllllIllIlIlIIIIllIIIIlIl];
            llllllllllllIllIlIlIIIIllIIIllll.append((char)(llllllllllllIllIlIlIIIIllIIlIIlI ^ llllllllllllIllIlIlIIIIllIIIlllI[llllllllllllIllIlIlIIIIllIIIllIl % llllllllllllIllIlIlIIIIllIIIlllI.length]));
            "".length();
            ++llllllllllllIllIlIlIIIIllIIIllIl;
            ++llllllllllllIllIlIlIIIIllIIIIlIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIIIIllIIIllll);
    }
    
    @Override
    public int getReceiveBufferSize() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SO_RCVBUF);
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIlIllll) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIlIllll);
        }
    }
    
    @Override
    public SctpChannelConfig setInitMaxStreams(final SctpStandardSocketOptions.InitMaxStreams llllllllllllIllIlIlIIIlIIIIlIlll) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS, llllllllllllIllIlIlIIIlIIIIlIlll);
            "".length();
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIIllIIl) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIIllIIl);
        }
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SO_SNDBUF);
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIlllllI) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIlllllI);
        }
    }
    
    @Override
    public SctpChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator llllllllllllIllIlIlIIIIllllllIII) {
        super.setRecvByteBufAllocator(llllllllllllIllIlIlIIIIllllllIII);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> llllllllllllIllIlIlIIIlIIlIlIIIl, final T llllllllllllIllIlIlIIIlIIlIlIIII) {
        this.validate(llllllllllllIllIlIlIIIlIIlIlIIIl, llllllllllllIllIlIlIIIlIIlIlIIII);
        if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIlIIIl, SctpChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)llllllllllllIllIlIlIIIlIIlIlIIII);
            "".length();
            "".length();
            if (null != null) {
                return ((133 + 117 - 105 + 45 ^ 146 + 41 - 84 + 44) & (0x51 ^ 0x56 ^ (0xAA ^ 0x80) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIlIIIl, SctpChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)llllllllllllIllIlIlIIIlIIlIlIIII);
            "".length();
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((0x42 ^ 0x59 ^ (0x1F ^ 0x58)) & (0x2C ^ 0x3A ^ (0x8C ^ 0xC6) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIlIIIl, SctpChannelOption.SCTP_NODELAY)) {
            this.setSctpNoDelay((boolean)llllllllllllIllIlIlIIIlIIlIlIIII);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return ((0x66 ^ 0x7B) & ~(0xAC ^ 0xB1)) != 0x0;
            }
        }
        else {
            if (!lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIlIIIl, SctpChannelOption.SCTP_INIT_MAXSTREAMS)) {
                return super.setOption(llllllllllllIllIlIlIIIlIIlIlIIIl, llllllllllllIllIlIlIIIlIIlIlIIII);
            }
            this.setInitMaxStreams((SctpStandardSocketOptions.InitMaxStreams)llllllllllllIllIlIlIIIlIIlIlIIII);
            "".length();
            "".length();
            if (null != null) {
                return (" ".length() & ~" ".length()) != 0x0;
            }
        }
        return DefaultSctpChannelConfig.llIlIlIllIlIll[1] != 0;
    }
    
    @Override
    public SctpChannelConfig setConnectTimeoutMillis(final int llllllllllllIllIlIlIIIlIIIIlIIII) {
        super.setConnectTimeoutMillis(llllllllllllIllIlIlIIIlIIIIlIIII);
        "".length();
        return this;
    }
    
    @Override
    public SctpChannelConfig setAutoClose(final boolean llllllllllllIllIlIlIIIIllllIlIlI) {
        super.setAutoClose(llllllllllllIllIlIlIIIIllllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public SctpChannelConfig setWriteSpinCount(final int llllllllllllIllIlIlIIIlIIIIIIIlI) {
        super.setWriteSpinCount(llllllllllllIllIlIlIIIlIIIIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams() {
        try {
            return this.javaChannel.getOption(SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS);
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIlIIIII) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIlIIIII);
        }
    }
    
    @Override
    public SctpChannelConfig setAllocator(final ByteBufAllocator llllllllllllIllIlIlIIIIlllllllII) {
        super.setAllocator(llllllllllllIllIlIlIIIIlllllllII);
        "".length();
        return this;
    }
    
    private static void lIIlIlIIlIIlllII() {
        (llIlIlIllIlIlI = new String[DefaultSctpChannelConfig.llIlIlIllIlIll[1]])[DefaultSctpChannelConfig.llIlIlIllIlIll[0]] = lIIlIlIIlIIllIll("MjkkEg4wOTwdKDQ=", "XXRsM");
    }
    
    private static boolean lIIlIlIIlIlIIIIl(final int llllllllllllIllIlIlIIIIllIIIIIIl, final int llllllllllllIllIlIlIIIIllIIIIIII) {
        return llllllllllllIllIlIlIIIIllIIIIIIl < llllllllllllIllIlIlIIIIllIIIIIII;
    }
    
    @Override
    public SctpChannelConfig setWriteBufferLowWaterMark(final int llllllllllllIllIlIlIIIIllllIIIII) {
        super.setWriteBufferLowWaterMark(llllllllllllIllIlIlIIIIllllIIIII);
        "".length();
        return this;
    }
    
    public DefaultSctpChannelConfig(final io.netty.channel.sctp.SctpChannel llllllllllllIllIlIlIIIlIIllIIlII, final SctpChannel llllllllllllIllIlIlIIIlIIllIIIll) {
        super(llllllllllllIllIlIlIIIlIIllIIlII);
        if (lIIlIlIIlIIllllI(llllllllllllIllIlIlIIIlIIllIIIll)) {
            throw new NullPointerException(DefaultSctpChannelConfig.llIlIlIllIlIlI[DefaultSctpChannelConfig.llIlIlIllIlIll[0]]);
        }
        this.javaChannel = llllllllllllIllIlIlIIIlIIllIIIll;
        if (lIIlIlIIlIIlllll(PlatformDependent.canEnableTcpNoDelayByDefault() ? 1 : 0)) {
            try {
                this.setSctpNoDelay((boolean)(DefaultSctpChannelConfig.llIlIlIllIlIll[1] != 0));
                "".length();
                "".length();
                if (-(40 + 28 + 30 + 92 ^ 66 + 165 - 57 + 13) >= 0) {
                    throw null;
                }
            }
            catch (Exception ex) {}
        }
    }
    
    @Override
    public SctpChannelConfig setSctpNoDelay(final boolean llllllllllllIllIlIlIIIlIIlIIIlII) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SCTP_NODELAY, llllllllllllIllIlIlIIIlIIlIIIlII);
            "".length();
            "".length();
            if ((130 + 125 - 234 + 110 ^ 45 + 116 - 98 + 72) < 0) {
                return null;
            }
        }
        catch (IOException llllllllllllIllIlIlIIIlIIlIIIllI) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIlIIIllI);
        }
        return this;
    }
    
    static {
        lIIlIlIIlIIlllIl();
        lIIlIlIIlIIlllII();
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> llllllllllllIllIlIlIIIlIIlIllIll) {
        if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIllIll, SctpChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIllIll, SctpChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (lIIlIlIIlIlIIIII(llllllllllllIllIlIlIIIlIIlIllIll, SctpChannelOption.SCTP_NODELAY)) {
            return (T)Boolean.valueOf(this.isSctpNoDelay());
        }
        return super.getOption(llllllllllllIllIlIlIIIlIIlIllIll);
    }
    
    @Override
    public SctpChannelConfig setSendBufferSize(final int llllllllllllIllIlIlIIIlIIIllIIll) {
        try {
            this.javaChannel.setOption(SctpStandardSocketOptions.SO_SNDBUF, llllllllllllIllIlIlIIIlIIIllIIll);
            "".length();
            "".length();
            if (((16 + 26 - 12 + 111 ^ 38 + 151 - 180 + 176) & (0x80 ^ 0xB3 ^ (0x58 ^ 0x5F) ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        catch (IOException llllllllllllIllIlIlIIIlIIIllIlll) {
            throw new ChannelException(llllllllllllIllIlIlIIIlIIIllIlll);
        }
        return this;
    }
    
    @Override
    public SctpChannelConfig setWriteBufferHighWaterMark(final int llllllllllllIllIlIlIIIIllllIIlII) {
        super.setWriteBufferHighWaterMark(llllllllllllIllIlIlIIIIllllIIlII);
        "".length();
        return this;
    }
    
    private static void lIIlIlIIlIIlllIl() {
        (llIlIlIllIlIll = new int[5])[0] = ((0x1B ^ 0x1F) & ~(0x5 ^ 0x1));
        DefaultSctpChannelConfig.llIlIlIllIlIll[1] = " ".length();
        DefaultSctpChannelConfig.llIlIlIllIlIll[2] = (0xA0 ^ 0xA4);
        DefaultSctpChannelConfig.llIlIlIllIlIll[3] = "  ".length();
        DefaultSctpChannelConfig.llIlIlIllIlIll[4] = "   ".length();
    }
}
