// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.oio;

import io.netty.channel.socket.ServerSocketChannel;
import java.net.ServerSocket;
import java.io.IOException;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import java.util.Map;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.socket.ServerSocketChannelConfig;
import io.netty.channel.socket.DefaultServerSocketChannelConfig;

public class DefaultOioServerSocketChannelConfig extends DefaultServerSocketChannelConfig implements OioServerSocketChannelConfig
{
    private static final /* synthetic */ int[] lIIIlIIIIIIIlI;
    
    @Override
    public OioServerSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIlIIIllIlllIlllIlll) {
        super.setRecvByteBufAllocator(lllllllllllllIlIIIllIlllIlllIlll);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIlIIIllIlllIlllllIl) {
        super.setAllocator(lllllllllllllIlIIIllIlllIlllllIl);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setAutoRead(final boolean lllllllllllllIlIIIllIlllIllIllll) {
        super.setAutoRead(lllllllllllllIlIIIllIlllIllIllll);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setBacklog(final int lllllllllllllIlIIIllIllllIlIllIl) {
        super.setBacklog(lllllllllllllIlIIIllIllllIlIllIl);
        "".length();
        return this;
    }
    
    static {
        lIllllIllIIIlII();
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultOioServerSocketChannelConfig.lIIIlIIIIIIIlI[0]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultOioServerSocketChannelConfig.lIIIlIIIIIIIlI[1]] = ChannelOption.SO_TIMEOUT;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public int getSoTimeout() {
        try {
            return this.javaSocket.getSoTimeout();
        }
        catch (IOException lllllllllllllIlIIIllIllllIllIlII) {
            throw new ChannelException(lllllllllllllIlIIIllIllllIllIlII);
        }
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIlIIIllIlllllIIIIIl, final T lllllllllllllIlIIIllIlllllIIIIll) {
        this.validate(lllllllllllllIlIIIllIlllllIIIIIl, lllllllllllllIlIIIllIlllllIIIIll);
        if (!lIllllIllIIIlIl(lllllllllllllIlIIIllIlllllIIIIIl, ChannelOption.SO_TIMEOUT)) {
            return super.setOption(lllllllllllllIlIIIllIlllllIIIIIl, lllllllllllllIlIIIllIlllllIIIIll);
        }
        this.setSoTimeout((int)lllllllllllllIlIIIllIlllllIIIIll);
        "".length();
        "".length();
        if ((0x0 ^ 0x4) < ((0x25 ^ 0x4) & ~(0x17 ^ 0x36))) {
            return ((0xA7 ^ 0x9C) & ~(0x16 ^ 0x2D)) != 0x0;
        }
        return DefaultOioServerSocketChannelConfig.lIIIlIIIIIIIlI[0] != 0;
    }
    
    DefaultOioServerSocketChannelConfig(final OioServerSocketChannel lllllllllllllIlIIIllIlllllIlIIll, final ServerSocket lllllllllllllIlIIIllIlllllIlIIlI) {
        super(lllllllllllllIlIIIllIlllllIlIIll, lllllllllllllIlIIIllIlllllIlIIlI);
    }
    
    @Override
    public OioServerSocketChannelConfig setReuseAddress(final boolean lllllllllllllIlIIIllIllllIlIIlll) {
        super.setReuseAddress(lllllllllllllIlIIIllIllllIlIIlll);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setReceiveBufferSize(final int lllllllllllllIlIIIllIllllIIlllll) {
        super.setReceiveBufferSize(lllllllllllllIlIIIllIllllIIlllll);
        "".length();
        return this;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIlIIIllIlllllIIlIIl) {
        if (lIllllIllIIIlIl(lllllllllllllIlIIIllIlllllIIlIIl, ChannelOption.SO_TIMEOUT)) {
            return (T)Integer.valueOf(this.getSoTimeout());
        }
        return super.getOption(lllllllllllllIlIIIllIlllllIIlIIl);
    }
    
    @Deprecated
    public DefaultOioServerSocketChannelConfig(final ServerSocketChannel lllllllllllllIlIIIllIlllllIlllII, final ServerSocket lllllllllllllIlIIIllIlllllIllIll) {
        super(lllllllllllllIlIIIllIlllllIlllII, lllllllllllllIlIIIllIlllllIllIll);
    }
    
    @Override
    public OioServerSocketChannelConfig setAutoClose(final boolean lllllllllllllIlIIIllIlllIllIlIII) {
        super.setAutoClose(lllllllllllllIlIIIllIlllIllIlIII);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setSoTimeout(final int lllllllllllllIlIIIllIllllIlllIlI) {
        try {
            this.javaSocket.setSoTimeout(lllllllllllllIlIIIllIllllIlllIlI);
            "".length();
            if (((186 + 107 - 146 + 63 ^ 131 + 37 - 145 + 126) & (0x5F ^ 0x43 ^ (0x2E ^ 0x75) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (IOException lllllllllllllIlIIIllIllllIllllII) {
            throw new ChannelException(lllllllllllllIlIIIllIllllIllllII);
        }
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIlIIIllIlllIlIlllII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIlIIIllIlllIlIlllII);
        "".length();
        return this;
    }
    
    private static boolean lIllllIllIIIllI(final int lllllllllllllIlIIIllIllIlIlllllI) {
        return lllllllllllllIlIIIllIllIlIlllllI != 0;
    }
    
    @Override
    public OioServerSocketChannelConfig setMaxMessagesPerRead(final int lllllllllllllIlIIIllIllllIIIlIIl) {
        super.setMaxMessagesPerRead(lllllllllllllIlIIIllIllllIIIlIIl);
        "".length();
        return this;
    }
    
    private static void lIllllIllIIIlII() {
        (lIIIlIIIIIIIlI = new int[2])[0] = " ".length();
        DefaultOioServerSocketChannelConfig.lIIIlIIIIIIIlI[1] = ((0xD3 ^ 0xAE ^ (0x4A ^ 0x10)) & (0x75 ^ 0x49 ^ (0x7A ^ 0x61) ^ -" ".length()));
    }
    
    @Override
    protected void autoReadCleared() {
        if (lIllllIllIIIllI((this.channel instanceof OioServerSocketChannel) ? 1 : 0)) {
            ((OioServerSocketChannel)this.channel).setReadPending((boolean)(DefaultOioServerSocketChannelConfig.lIIIlIIIIIIIlI[1] != 0));
        }
    }
    
    @Override
    public OioServerSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIlIIIllIlllIlIlIlII) {
        super.setMessageSizeEstimator(lllllllllllllIlIIIllIlllIlIlIlII);
        "".length();
        return this;
    }
    
    private static boolean lIllllIllIIIlIl(final Object lllllllllllllIlIIIllIllIllIIIIIl, final Object lllllllllllllIlIIIllIllIllIIIIII) {
        return lllllllllllllIlIIIllIllIllIIIIIl == lllllllllllllIlIIIllIllIllIIIIII;
    }
    
    @Override
    public OioServerSocketChannelConfig setPerformancePreferences(final int lllllllllllllIlIIIllIllllIIlIlIl, final int lllllllllllllIlIIIllIllllIIllIII, final int lllllllllllllIlIIIllIllllIIlIIll) {
        super.setPerformancePreferences(lllllllllllllIlIIIllIllllIIlIlIl, lllllllllllllIlIIIllIllllIIllIII, lllllllllllllIlIIIllIllllIIlIIll);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setWriteSpinCount(final int lllllllllllllIlIIIllIllllIIIIIll) {
        super.setWriteSpinCount(lllllllllllllIlIIIllIllllIIIIIll);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIlIIIllIlllIllIIIlI) {
        super.setWriteBufferHighWaterMark(lllllllllllllIlIIIllIlllIllIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public OioServerSocketChannelConfig setConnectTimeoutMillis(final int lllllllllllllIlIIIllIllllIIIllIl) {
        super.setConnectTimeoutMillis(lllllllllllllIlIIIllIllllIIIllIl);
        "".length();
        return this;
    }
}
