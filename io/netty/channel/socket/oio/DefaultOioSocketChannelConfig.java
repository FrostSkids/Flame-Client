// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket.oio;

import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelOption;
import java.util.Map;
import java.io.IOException;
import io.netty.channel.ChannelException;
import java.net.Socket;
import io.netty.channel.socket.SocketChannel;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.socket.SocketChannelConfig;
import io.netty.channel.socket.DefaultSocketChannelConfig;

public class DefaultOioSocketChannelConfig extends DefaultSocketChannelConfig implements OioSocketChannelConfig
{
    private static final /* synthetic */ int[] lIIlIIIlIIlllI;
    
    @Override
    public OioSocketChannelConfig setReceiveBufferSize(final int lllllllllllllIIlllIIlllIllIlllll) {
        super.setReceiveBufferSize(lllllllllllllIIlllIIlllIllIlllll);
        "".length();
        return this;
    }
    
    private static boolean llIIlIlIllIIlIl(final Object lllllllllllllIIlllIIllIlllIIIIll, final Object lllllllllllllIIlllIIllIlllIIIIlI) {
        return lllllllllllllIIlllIIllIlllIIIIll == lllllllllllllIIlllIIllIlllIIIIlI;
    }
    
    @Override
    public OioSocketChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIlllIIlllIlIlIIIIl) {
        super.setAllocator(lllllllllllllIIlllIIlllIlIlIIIIl);
        "".length();
        return this;
    }
    
    private static void llIIlIlIllIIlII() {
        (lIIlIIIlIIlllI = new int[2])[0] = " ".length();
        DefaultOioSocketChannelConfig.lIIlIIIlIIlllI[1] = ((0xBB ^ 0xA2) & ~(0x8 ^ 0x11));
    }
    
    @Deprecated
    public DefaultOioSocketChannelConfig(final SocketChannel lllllllllllllIIlllIIllllIIlIIIII, final Socket lllllllllllllIIlllIIllllIIlIIIlI) {
        super(lllllllllllllIIlllIIllllIIlIIIII, lllllllllllllIIlllIIllllIIlIIIlI);
    }
    
    DefaultOioSocketChannelConfig(final OioSocketChannel lllllllllllllIIlllIIllllIIIllIlI, final Socket lllllllllllllIIlllIIllllIIIllIIl) {
        super(lllllllllllllIIlllIIllllIIIllIlI, lllllllllllllIIlllIIllllIIIllIIl);
    }
    
    @Override
    public OioSocketChannelConfig setWriteSpinCount(final int lllllllllllllIIlllIIlllIlIlIIlll) {
        super.setWriteSpinCount(lllllllllllllIIlllIIlllIlIlIIlll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setAllowHalfClosure(final boolean lllllllllllllIIlllIIlllIlIlllIll) {
        super.setAllowHalfClosure(lllllllllllllIIlllIIlllIlIlllIll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setSoLinger(final int lllllllllllllIIlllIIlllIlllIlIll) {
        super.setSoLinger(lllllllllllllIIlllIIlllIlllIlIll);
        "".length();
        return this;
    }
    
    @Override
    public int getSoTimeout() {
        try {
            return this.javaSocket.getSoTimeout();
        }
        catch (IOException lllllllllllllIIlllIIlllIlllllIII) {
            throw new ChannelException(lllllllllllllIIlllIIlllIlllllIII);
        }
    }
    
    @Override
    public OioSocketChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIlllIIlllIlIIIlIII) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIlllIIlllIlIIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultOioSocketChannelConfig.lIIlIIIlIIlllI[0]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultOioSocketChannelConfig.lIIlIIIlIIlllI[1]] = ChannelOption.SO_TIMEOUT;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public OioSocketChannelConfig setAutoClose(final boolean lllllllllllllIIlllIIlllIlIIIlllI) {
        super.setAutoClose(lllllllllllllIIlllIIlllIlIIIlllI);
        "".length();
        return this;
    }
    
    private static boolean llIIlIlIllIIllI(final int lllllllllllllIIlllIIllIlllIIIIII) {
        return lllllllllllllIIlllIIllIlllIIIIII != 0;
    }
    
    @Override
    public OioSocketChannelConfig setSendBufferSize(final int lllllllllllllIIlllIIlllIlllIIlIl) {
        super.setSendBufferSize(lllllllllllllIIlllIIlllIlllIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setKeepAlive(final boolean lllllllllllllIIlllIIlllIllIlIlll) {
        super.setKeepAlive(lllllllllllllIIlllIIlllIllIlIlll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setTcpNoDelay(final boolean lllllllllllllIIlllIIlllIlllIllll) {
        super.setTcpNoDelay(lllllllllllllIIlllIIlllIlllIllll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIlllIIlllIlIllIIll) {
        super.setConnectTimeoutMillis(lllllllllllllIIlllIIlllIlIllIIll);
        "".length();
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIlllIIllllIIIIIlIl, final T lllllllllllllIIlllIIllllIIIIIlll) {
        this.validate(lllllllllllllIIlllIIllllIIIIIlIl, lllllllllllllIIlllIIllllIIIIIlll);
        if (!llIIlIlIllIIlIl(lllllllllllllIIlllIIllllIIIIIlIl, ChannelOption.SO_TIMEOUT)) {
            return super.setOption(lllllllllllllIIlllIIllllIIIIIlIl, lllllllllllllIIlllIIllllIIIIIlll);
        }
        this.setSoTimeout((int)lllllllllllllIIlllIIllllIIIIIlll);
        "".length();
        "".length();
        if (" ".length() < 0) {
            return ((0xE9 ^ 0x9A ^ (0x9A ^ 0xAE)) & (0x1F ^ 0x0 ^ (0x73 ^ 0x2B) ^ -" ".length())) != 0x0;
        }
        return DefaultOioSocketChannelConfig.lIIlIIIlIIlllI[0] != 0;
    }
    
    @Override
    protected void autoReadCleared() {
        if (llIIlIlIllIIllI((this.channel instanceof OioSocketChannel) ? 1 : 0)) {
            ((OioSocketChannel)this.channel).setReadPending((boolean)(DefaultOioSocketChannelConfig.lIIlIIIlIIlllI[1] != 0));
        }
    }
    
    @Override
    public OioSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIlllIIlllIIllllIlI) {
        super.setMessageSizeEstimator(lllllllllllllIIlllIIlllIIllllIlI);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setTrafficClass(final int lllllllllllllIIlllIIlllIllIlIIll) {
        super.setTrafficClass(lllllllllllllIIlllIIlllIllIlIIll);
        "".length();
        return this;
    }
    
    static {
        llIIlIlIllIIlII();
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIlllIIllllIIIIllll) {
        if (llIIlIlIllIIlIl(lllllllllllllIIlllIIllllIIIIllll, ChannelOption.SO_TIMEOUT)) {
            return (T)Integer.valueOf(this.getSoTimeout());
        }
        return super.getOption(lllllllllllllIIlllIIllllIIIIllll);
    }
    
    @Override
    public OioSocketChannelConfig setSoTimeout(final int lllllllllllllIIlllIIlllIlllllllI) {
        try {
            this.javaSocket.setSoTimeout(lllllllllllllIIlllIIlllIlllllllI);
            "".length();
            if ("  ".length() >= (0x7A ^ 0x7E)) {
                return null;
            }
        }
        catch (IOException lllllllllllllIIlllIIllllIIIIIIII) {
            throw new ChannelException(lllllllllllllIIlllIIllllIIIIIIII);
        }
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIlllIIlllIlIIllIll) {
        super.setRecvByteBufAllocator(lllllllllllllIIlllIIlllIlIIllIll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIlllIIlllIlIIIIIII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIlllIIlllIlIIIIIII);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setPerformancePreferences(final int lllllllllllllIIlllIIlllIllIIIIIl, final int lllllllllllllIIlllIIlllIllIIIIII, final int lllllllllllllIIlllIIlllIllIIIIll) {
        super.setPerformancePreferences(lllllllllllllIIlllIIlllIllIIIIIl, lllllllllllllIIlllIIlllIllIIIIII, lllllllllllllIIlllIIlllIllIIIIll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setReuseAddress(final boolean lllllllllllllIIlllIIlllIllIIlIll) {
        super.setReuseAddress(lllllllllllllIIlllIIlllIllIIlIll);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIlllIIlllIlIlIllIl) {
        super.setMaxMessagesPerRead(lllllllllllllIIlllIIlllIlIlIllIl);
        "".length();
        return this;
    }
    
    @Override
    public OioSocketChannelConfig setAutoRead(final boolean lllllllllllllIIlllIIlllIlIIlIlll) {
        super.setAutoRead(lllllllllllllIIlllIIlllIlIIlIlll);
        "".length();
        return this;
    }
}
