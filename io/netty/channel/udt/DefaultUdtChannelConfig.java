// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt;

import io.netty.channel.Channel;
import java.io.IOException;
import com.barchart.udt.SocketUDT;
import com.barchart.udt.OptionUDT;
import com.barchart.udt.nio.ChannelUDT;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.DefaultChannelConfig;

public class DefaultUdtChannelConfig extends DefaultChannelConfig implements UdtChannelConfig
{
    private static final /* synthetic */ int[] lIlIIllIIllIIl;
    private volatile /* synthetic */ int protocolSendBuferSize;
    private volatile /* synthetic */ int soLinger;
    private volatile /* synthetic */ int allocatorSendBufferSize;
    private volatile /* synthetic */ int protocolReceiveBuferSize;
    private volatile /* synthetic */ int systemSendBuferSize;
    private volatile /* synthetic */ int systemReceiveBufferSize;
    private volatile /* synthetic */ boolean reuseAddress;
    private volatile /* synthetic */ int allocatorReceiveBufferSize;
    
    @Override
    public UdtChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIllIIllIllllIllIl) {
        super.setMessageSizeEstimator(lllllllllllllIIIllIIllIllllIllIl);
        "".length();
        return this;
    }
    
    @Override
    public UdtChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIllIIllIlllllIIll) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIIllIIllIlllllIIll);
        "".length();
        return this;
    }
    
    @Override
    public UdtChannelConfig setProtocolReceiveBufferSize(final int lllllllllllllIIIllIIlllIIllIIlll) {
        this.protocolReceiveBuferSize = lllllllllllllIIIllIIlllIIllIIlll;
        return this;
    }
    
    @Override
    public UdtChannelConfig setProtocolSendBufferSize(final int lllllllllllllIIIllIIlllIIIllIlII) {
        this.protocolSendBuferSize = lllllllllllllIIIllIIlllIIIllIlII;
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultUdtChannelConfig.lIlIIllIIllIIl[5]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[4]] = UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[3]] = UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[6]] = UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[7]] = UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[8]] = UdtChannelOption.SO_RCVBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[9]] = UdtChannelOption.SO_SNDBUF;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[10]] = UdtChannelOption.SO_REUSEADDR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtChannelConfig.lIlIIllIIllIIl[11]] = UdtChannelOption.SO_LINGER;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public UdtChannelConfig setAutoClose(final boolean lllllllllllllIIIllIIllIlllllllll) {
        super.setAutoClose(lllllllllllllIIIllIIllIlllllllll);
        "".length();
        return this;
    }
    
    @Override
    public int getSystemReceiveBufferSize() {
        return this.systemReceiveBufferSize;
    }
    
    private static boolean lllIIllllIlllll(final int lllllllllllllIIIllIIllIllIlIlIIl) {
        return lllllllllllllIIIllIIllIllIlIlIIl <= 0;
    }
    
    @Override
    public int getSoLinger() {
        return this.soLinger;
    }
    
    @Override
    public UdtChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIllIIlllIIIIIlIll) {
        super.setRecvByteBufAllocator(lllllllllllllIIIllIIlllIIIIIlIll);
        "".length();
        return this;
    }
    
    @Override
    public int getProtocolReceiveBufferSize() {
        return this.protocolReceiveBuferSize;
    }
    
    static {
        lllIIllllIlllIl();
        K = DefaultUdtChannelConfig.lIlIIllIIllIIl[12];
        M = DefaultUdtChannelConfig.lIlIIllIIllIIl[1];
    }
    
    protected void apply(final ChannelUDT lllllllllllllIIIllIIlllIlIIIIlll) throws IOException {
        final SocketUDT lllllllllllllIIIllIIlllIlIIIIllI = lllllllllllllIIIllIIlllIlIIIIlll.socketUDT();
        lllllllllllllIIIllIIlllIlIIIIllI.setReuseAddress(this.isReuseAddress());
        lllllllllllllIIIllIIlllIlIIIIllI.setSendBufferSize(this.getSendBufferSize());
        if (lllIIllllIlllll(this.getSoLinger())) {
            lllllllllllllIIIllIIlllIlIIIIllI.setSoLinger((boolean)(DefaultUdtChannelConfig.lIlIIllIIllIIl[4] != 0), DefaultUdtChannelConfig.lIlIIllIIllIIl[4]);
            "".length();
            if (-(0x3 ^ 0x4 ^ "   ".length()) >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIllIIlllIlIIIIllI.setSoLinger((boolean)(DefaultUdtChannelConfig.lIlIIllIIllIIl[3] != 0), this.getSoLinger());
        }
        lllllllllllllIIIllIIlllIlIIIIllI.setOption(OptionUDT.Protocol_Receive_Buffer_Size, (Object)this.getProtocolReceiveBufferSize());
        lllllllllllllIIIllIIlllIlIIIIllI.setOption(OptionUDT.Protocol_Send_Buffer_Size, (Object)this.getProtocolSendBufferSize());
        lllllllllllllIIIllIIlllIlIIIIllI.setOption(OptionUDT.System_Receive_Buffer_Size, (Object)this.getSystemReceiveBufferSize());
        lllllllllllllIIIllIIlllIlIIIIllI.setOption(OptionUDT.System_Send_Buffer_Size, (Object)this.getSystemSendBufferSize());
    }
    
    @Override
    public UdtChannelConfig setSendBufferSize(final int lllllllllllllIIIllIIlllIIlIIllII) {
        this.allocatorSendBufferSize = lllllllllllllIIIllIIlllIIlIIllII;
        return this;
    }
    
    @Override
    public int getSendBufferSize() {
        return this.allocatorSendBufferSize;
    }
    
    private static boolean lllIIlllllIIIII(final Object lllllllllllllIIIllIIllIllIlIlllI, final Object lllllllllllllIIIllIIllIllIlIllIl) {
        return lllllllllllllIIIllIIllIllIlIlllI == lllllllllllllIIIllIIllIllIlIllIl;
    }
    
    @Override
    public UdtChannelConfig setWriteSpinCount(final int lllllllllllllIIIllIIlllIIIIllIIl) {
        super.setWriteSpinCount(lllllllllllllIIIllIIlllIIIIllIIl);
        "".length();
        return this;
    }
    
    @Override
    public UdtChannelConfig setSystemSendBufferSize(final int lllllllllllllIIIllIIlllIIIlllIll) {
        this.systemReceiveBufferSize = lllllllllllllIIIllIIlllIIIlllIll;
        return this;
    }
    
    @Override
    public int getProtocolSendBufferSize() {
        return this.protocolSendBuferSize;
    }
    
    @Override
    public UdtChannelConfig setAutoRead(final boolean lllllllllllllIIIllIIlllIIIIIIlIl) {
        super.setAutoRead(lllllllllllllIIIllIIlllIIIIIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public UdtChannelConfig setReceiveBufferSize(final int lllllllllllllIIIllIIlllIIlIlIllI) {
        this.allocatorReceiveBufferSize = lllllllllllllIIIllIIlllIIlIlIllI;
        return this;
    }
    
    @Override
    public UdtChannelConfig setReuseAddress(final boolean lllllllllllllIIIllIIlllIIlIlIIlI) {
        this.reuseAddress = lllllllllllllIIIllIIlllIIlIlIIlI;
        return this;
    }
    
    @Override
    public UdtChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIllIIlllIIIIlIIIl) {
        super.setAllocator(lllllllllllllIIIllIIlllIIIIlIIIl);
        "".length();
        return this;
    }
    
    private static void lllIIllllIlllIl() {
        (lIlIIllIIllIIl = new int[13])[0] = (0xFFFFC8E3 & 0xA0371C);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[1] = (-(0xFFFFBFEC & 0x7FF3) & (-1 & 0x103FDF));
        DefaultUdtChannelConfig.lIlIIllIIllIIl[2] = (0xFFFFF482 & 0x20B7D);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[3] = " ".length();
        DefaultUdtChannelConfig.lIlIIllIIllIIl[4] = ((0x67 ^ 0x73) & ~(0x46 ^ 0x52));
        DefaultUdtChannelConfig.lIlIIllIIllIIl[5] = (59 + 189 - 166 + 120 ^ 68 + 178 - 164 + 112);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[6] = "  ".length();
        DefaultUdtChannelConfig.lIlIIllIIllIIl[7] = "   ".length();
        DefaultUdtChannelConfig.lIlIIllIIllIIl[8] = (0x17 ^ 0x4D ^ (0x26 ^ 0x78));
        DefaultUdtChannelConfig.lIlIIllIIllIIl[9] = (67 + 131 - 192 + 176 ^ 48 + 1 + 35 + 95);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[10] = (0x1 ^ 0x7);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[11] = (0x4D ^ 0x4A);
        DefaultUdtChannelConfig.lIlIIllIIllIIl[12] = (-(0x31 ^ 0x1) & (0xFFFFB6EF & 0x4D3F));
    }
    
    public DefaultUdtChannelConfig(final UdtChannel lllllllllllllIIIllIIlllIlIIlIIlI, final ChannelUDT lllllllllllllIIIllIIlllIlIIlIIIl, final boolean lllllllllllllIIIllIIlllIlIIIllII) throws IOException {
        super(lllllllllllllIIIllIIlllIlIIlIIlI);
        this.protocolReceiveBuferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[0];
        this.protocolSendBuferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[0];
        this.systemReceiveBufferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[1];
        this.systemSendBuferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[1];
        this.allocatorReceiveBufferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[2];
        this.allocatorSendBufferSize = DefaultUdtChannelConfig.lIlIIllIIllIIl[2];
        this.reuseAddress = (DefaultUdtChannelConfig.lIlIIllIIllIIl[3] != 0);
        if (lllIIllllIllllI(lllllllllllllIIIllIIlllIlIIIllII ? 1 : 0)) {
            this.apply(lllllllllllllIIIllIIlllIlIIlIIIl);
        }
    }
    
    @Override
    public boolean isReuseAddress() {
        return this.reuseAddress;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIllIIlllIIlIlllIl, final T lllllllllllllIIIllIIlllIIlIlllll) {
        this.validate(lllllllllllllIIIllIIlllIIlIlllIl, lllllllllllllIIIllIIlllIIlIlllll);
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE)) {
            this.setProtocolReceiveBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((0xBE ^ 0xB9 ^ (0x5A ^ 0x1D)) & (0xB4 ^ 0xC7 ^ (0x10 ^ 0x23) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE)) {
            this.setProtocolSendBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if ("  ".length() <= ((20 + 18 + 19 + 76 ^ 61 + 141 - 185 + 132) & (0xD5 ^ 0x84 ^ (0x4E ^ 0xF) ^ -" ".length()))) {
                return ((0xE8 ^ 0x8F ^ (0xC9 ^ 0x80)) & (130 + 58 - 182 + 131 ^ 111 + 75 - 19 + 0 ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE)) {
            this.setSystemReceiveBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x7A ^ 0x31 ^ (0xF4 ^ 0xBA)) & (0x7F ^ 0x2A ^ (0xCC ^ 0x9C) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE)) {
            this.setSystemSendBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if (((0x4C ^ 0x8 ^ (0x65 ^ 0x29)) & (97 + 0 + 21 + 46 ^ 77 + 111 - 75 + 59 ^ -" ".length())) >= "  ".length()) {
                return ((64 + 77 - 21 + 41 ^ 43 + 85 - 69 + 85) & (0xF9 ^ 0xA7 ^ (0x45 ^ 0x2A) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SO_RCVBUF)) {
            this.setReceiveBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((0x51 ^ 0x6F) & ~(0x43 ^ 0x7D)) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SO_SNDBUF)) {
            this.setSendBufferSize((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if (-" ".length() >= ((0x31 ^ 0x3C ^ (0xB1 ^ 0xB9)) & (7 + 148 - 3 + 14 ^ 51 + 1 + 72 + 39 ^ -" ".length()))) {
                return ((0x54 ^ 0x24 ^ (0x2F ^ 0x5A)) & (0xA7 ^ 0x9B ^ (0x6D ^ 0x54) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SO_REUSEADDR)) {
            this.setReuseAddress((boolean)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if ((0x97 ^ 0x93) != (0x81 ^ 0x85)) {
                return ((0x4D ^ 0x6F) & ~(0xAB ^ 0x89)) != 0x0;
            }
        }
        else {
            if (!lllIIlllllIIIII(lllllllllllllIIIllIIlllIIlIlllIl, UdtChannelOption.SO_LINGER)) {
                return super.setOption(lllllllllllllIIIllIIlllIIlIlllIl, lllllllllllllIIIllIIlllIIlIlllll);
            }
            this.setSoLinger((int)lllllllllllllIIIllIIlllIIlIlllll);
            "".length();
            "".length();
            if (-" ".length() >= (0x7 ^ 0x11 ^ (0xBE ^ 0xAC))) {
                return ((0x1E ^ 0x7A ^ (0x8E ^ 0xC2)) & (14 + 42 - 47 + 177 ^ 65 + 7 + 26 + 48 ^ -" ".length())) != 0x0;
            }
        }
        return DefaultUdtChannelConfig.lIlIIllIIllIIl[3] != 0;
    }
    
    @Override
    public UdtChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIllIIlllIIIIlllIl) {
        super.setMaxMessagesPerRead(lllllllllllllIIIllIIlllIIIIlllIl);
        "".length();
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIllIIlllIIllllIlI) {
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE)) {
            return (T)Integer.valueOf(this.getProtocolReceiveBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE)) {
            return (T)Integer.valueOf(this.getProtocolSendBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE)) {
            return (T)Integer.valueOf(this.getSystemReceiveBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE)) {
            return (T)Integer.valueOf(this.getSystemSendBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SO_RCVBUF)) {
            return (T)Integer.valueOf(this.getReceiveBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SO_SNDBUF)) {
            return (T)Integer.valueOf(this.getSendBufferSize());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SO_REUSEADDR)) {
            return (T)Boolean.valueOf(this.isReuseAddress());
        }
        if (lllIIlllllIIIII(lllllllllllllIIIllIIlllIIllllIlI, UdtChannelOption.SO_LINGER)) {
            return (T)Integer.valueOf(this.getSoLinger());
        }
        return super.getOption(lllllllllllllIIIllIIlllIIllllIlI);
    }
    
    @Override
    public UdtChannelConfig setSoLinger(final int lllllllllllllIIIllIIlllIIlIIIlII) {
        this.soLinger = lllllllllllllIIIllIIlllIIlIIIlII;
        return this;
    }
    
    @Override
    public int getReceiveBufferSize() {
        return this.allocatorReceiveBufferSize;
    }
    
    @Override
    public UdtChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIllIIllIllllllIll) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIIllIIllIllllllIll);
        "".length();
        return this;
    }
    
    @Override
    public int getSystemSendBufferSize() {
        return this.systemSendBuferSize;
    }
    
    private static boolean lllIIllllIllllI(final int lllllllllllllIIIllIIllIllIlIlIll) {
        return lllllllllllllIIIllIIllIllIlIlIll != 0;
    }
    
    @Override
    public UdtChannelConfig setSystemReceiveBufferSize(final int lllllllllllllIIIllIIlllIIIlIlllI) {
        this.systemSendBuferSize = lllllllllllllIIIllIIlllIIIlIlllI;
        return this;
    }
    
    @Override
    public UdtChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIllIIlllIIIlIIIll) {
        super.setConnectTimeoutMillis(lllllllllllllIIIllIIlllIIIlIIIll);
        "".length();
        return this;
    }
}
