// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt;

import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import java.util.Map;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import java.io.IOException;
import com.barchart.udt.nio.ChannelUDT;

public class DefaultUdtServerChannelConfig extends DefaultUdtChannelConfig implements UdtServerChannelConfig
{
    private volatile /* synthetic */ int backlog;
    private static final /* synthetic */ int[] lIllIIIlIIlIII;
    
    @Override
    protected void apply(final ChannelUDT lllllllllllllIIIIIllIlllIlIIIlIl) throws IOException {
    }
    
    private static boolean llllIllllIIllII(final int lllllllllllllIIIIIllIllIIIIlIIII) {
        return lllllllllllllIIIIIllIllIIIIlIIII != 0;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIIIllIlllIIlllllI) {
        if (llllIllllIIllIl(lllllllllllllIIIIIllIlllIIlllllI, ChannelOption.SO_BACKLOG)) {
            return (T)Integer.valueOf(this.getBacklog());
        }
        return super.getOption(lllllllllllllIIIIIllIlllIIlllllI);
    }
    
    static {
        llllIllllIIlIll();
    }
    
    @Override
    public int getBacklog() {
        return this.backlog;
    }
    
    @Override
    public UdtServerChannelConfig setWriteSpinCount(final int lllllllllllllIIIIIllIllIlllIlIlI) {
        super.setWriteSpinCount(lllllllllllllIIIIIllIllIlllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultUdtServerChannelConfig.lIllIIIlIIlIII[1]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultUdtServerChannelConfig.lIllIIIlIIlIII[2]] = ChannelOption.SO_BACKLOG;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public UdtServerChannelConfig setReceiveBufferSize(final int lllllllllllllIIIIIllIlllIIIllIII) {
        super.setReceiveBufferSize(lllllllllllllIIIIIllIlllIIIllIII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIIIllIllIllIIIllI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIIIIllIllIllIIIllI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIIIllIllIllIlllII) {
        super.setRecvByteBufAllocator(lllllllllllllIIIIIllIllIllIlllII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setProtocolSendBufferSize(final int lllllllllllllIIIIIllIlllIIIllllI) {
        super.setProtocolSendBufferSize(lllllllllllllIIIIIllIlllIIIllllI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setSystemReceiveBufferSize(final int lllllllllllllIIIIIllIlllIIIIIIlI) {
        super.setSystemReceiveBufferSize(lllllllllllllIIIIIllIlllIIIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setAutoRead(final boolean lllllllllllllIIIIIllIllIllIlIllI) {
        super.setAutoRead(lllllllllllllIIIIIllIllIllIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIIIllIllIllIIIIII) {
        super.setMessageSizeEstimator(lllllllllllllIIIIIllIllIllIIIIII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setSystemSendBufferSize(final int lllllllllllllIIIIIllIllIllllllII) {
        super.setSystemSendBufferSize(lllllllllllllIIIIIllIllIllllllII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setReuseAddress(final boolean lllllllllllllIIIIIllIlllIIIlIIlI) {
        super.setReuseAddress(lllllllllllllIIIIIllIlllIIIlIIlI);
        "".length();
        return this;
    }
    
    private static boolean llllIllllIIllIl(final Object lllllllllllllIIIIIllIllIIIIlIIll, final Object lllllllllllllIIIIIllIllIIIIlIIlI) {
        return lllllllllllllIIIIIllIllIIIIlIIll == lllllllllllllIIIIIllIllIIIIlIIlI;
    }
    
    @Override
    public UdtServerChannelConfig setAutoClose(final boolean lllllllllllllIIIIIllIllIllIlIIlI) {
        super.setAutoClose(lllllllllllllIIIIIllIllIllIlIIlI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setSoLinger(final int lllllllllllllIIIIIllIlllIIIIlIII) {
        super.setSoLinger(lllllllllllllIIIIIllIlllIIIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIIIllIlllIIlIlllI, final T lllllllllllllIIIIIllIlllIIlIlIlI) {
        this.validate(lllllllllllllIIIIIllIlllIIlIlllI, lllllllllllllIIIIIllIlllIIlIlIlI);
        if (!llllIllllIIllIl(lllllllllllllIIIIIllIlllIIlIlllI, ChannelOption.SO_BACKLOG)) {
            return super.setOption(lllllllllllllIIIIIllIlllIIlIlllI, lllllllllllllIIIIIllIlllIIlIlIlI);
        }
        this.setBacklog((int)lllllllllllllIIIIIllIlllIIlIlIlI);
        "".length();
        "".length();
        if (((0x5 ^ 0x5E) & ~(0x23 ^ 0x78)) != ((0x6B ^ 0x7E) & ~(0x73 ^ 0x66))) {
            return ((0x75 ^ 0x31) & ~(0x15 ^ 0x51)) != 0x0;
        }
        return DefaultUdtServerChannelConfig.lIllIIIlIIlIII[1] != 0;
    }
    
    @Override
    public UdtServerChannelConfig setBacklog(final int lllllllllllllIIIIIllIlllIIllIIll) {
        this.backlog = lllllllllllllIIIIIllIlllIIllIIll;
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setProtocolReceiveBufferSize(final int lllllllllllllIIIIIllIlllIIlIIllI) {
        super.setProtocolReceiveBufferSize(lllllllllllllIIIIIllIlllIIlIIllI);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIIIllIllIlllIIIlI) {
        super.setAllocator(lllllllllllllIIIIIllIllIlllIIIlI);
        "".length();
        return this;
    }
    
    public DefaultUdtServerChannelConfig(final UdtChannel lllllllllllllIIIIIllIlllIlIIlIIl, final ChannelUDT lllllllllllllIIIIIllIlllIlIIlIII, final boolean lllllllllllllIIIIIllIlllIlIIlIll) throws IOException {
        super(lllllllllllllIIIIIllIlllIlIIlIIl, lllllllllllllIIIIIllIlllIlIIlIII, lllllllllllllIIIIIllIlllIlIIlIll);
        this.backlog = DefaultUdtServerChannelConfig.lIllIIIlIIlIII[0];
        if (llllIllllIIllII(lllllllllllllIIIIIllIlllIlIIlIll ? 1 : 0)) {
            this.apply(lllllllllllllIIIIIllIlllIlIIlIII);
        }
    }
    
    @Override
    public UdtServerChannelConfig setSendBufferSize(final int lllllllllllllIIIIIllIlllIIIIlllI) {
        super.setSendBufferSize(lllllllllllllIIIIIllIlllIIIIlllI);
        "".length();
        return this;
    }
    
    private static void llllIllllIIlIll() {
        (lIllIIIlIIlIII = new int[3])[0] = (0x38 ^ 0x78);
        DefaultUdtServerChannelConfig.lIllIIIlIIlIII[1] = " ".length();
        DefaultUdtServerChannelConfig.lIllIIIlIIlIII[2] = ((0x49 ^ 0x76) & ~(0x4C ^ 0x73));
    }
    
    @Override
    public UdtServerChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIIIllIllIllllIIII) {
        super.setMaxMessagesPerRead(lllllllllllllIIIIIllIllIllllIIII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIIIllIllIllllIlII) {
        super.setConnectTimeoutMillis(lllllllllllllIIIIIllIllIllllIlII);
        "".length();
        return this;
    }
    
    @Override
    public UdtServerChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIIIllIllIllIIllII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIIIIllIllIllIIllII);
        "".length();
        return this;
    }
}
