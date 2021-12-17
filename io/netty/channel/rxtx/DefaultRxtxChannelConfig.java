// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.rxtx;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import java.util.Map;
import io.netty.channel.ChannelOption;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.DefaultChannelConfig;

final class DefaultRxtxChannelConfig extends DefaultChannelConfig implements RxtxChannelConfig
{
    private volatile /* synthetic */ Databits databits;
    private volatile /* synthetic */ int baudrate;
    private static final /* synthetic */ String[] lIlIlIlIIIIIII;
    private volatile /* synthetic */ int readTimeout;
    private static final /* synthetic */ int[] lIlIlIlIIIIllI;
    private volatile /* synthetic */ Paritybit paritybit;
    private volatile /* synthetic */ int waitTime;
    private volatile /* synthetic */ boolean dtr;
    private volatile /* synthetic */ Stopbits stopbits;
    private volatile /* synthetic */ boolean rts;
    
    @Override
    public RxtxChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIlIIlIIIIlIIllIII) {
        super.setConnectTimeoutMillis(lllllllllllllIIIlIIlIIIIlIIllIII);
        "".length();
        return this;
    }
    
    @Override
    public RxtxChannelConfig setWaitTimeMillis(final int lllllllllllllIIIlIIlIIIIlIlIIlIl) {
        if (lllIllIllIIIIII(lllllllllllllIIIlIIlIIIIlIlIIlIl)) {
            throw new IllegalArgumentException(DefaultRxtxChannelConfig.lIlIlIlIIIIIII[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3]]);
        }
        this.waitTime = lllllllllllllIIIlIIlIIIIlIlIIlIl;
        return this;
    }
    
    @Override
    public Paritybit getParitybit() {
        return this.paritybit;
    }
    
    @Override
    public RxtxChannelConfig setDtr(final boolean lllllllllllllIIIlIIlIIIIlIllIlll) {
        this.dtr = lllllllllllllIIIlIIlIIIIlIllIlll;
        return this;
    }
    
    @Override
    public RxtxChannelConfig setReadTimeout(final int lllllllllllllIIIlIIlIIIIlIIlllll) {
        if (lllIllIllIIIIII(lllllllllllllIIIlIIlIIIIlIIlllll)) {
            throw new IllegalArgumentException(DefaultRxtxChannelConfig.lIlIlIlIIIIIII[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[4]]);
        }
        this.readTimeout = lllllllllllllIIIlIIlIIIIlIIlllll;
        return this;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIlIIlIIIIlllIIlIl, final T lllllllllllllIIIlIIlIIIIlllIIlII) {
        this.validate(lllllllllllllIIIlIIlIIIIlllIIlIl, lllllllllllllIIIlIIlIIIIlllIIlII);
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.BAUD_RATE)) {
            this.setBaudrate((int)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0x91 ^ 0xAF) & ~(0x5C ^ 0x62)) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.DTR)) {
            this.setDtr((boolean)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return ((0x78 ^ 0x21 ^ (0x7A ^ 0x8)) & (0xB8 ^ 0x80 ^ (0x4C ^ 0x5F) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.RTS)) {
            this.setRts((boolean)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((0x1 ^ 0x5E) & ~(0xFC ^ 0xA3)) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.STOP_BITS)) {
            this.setStopbits((Stopbits)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if (" ".length() < 0) {
                return ((0x7 ^ 0x3) & ~(0xC6 ^ 0xC2)) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.DATA_BITS)) {
            this.setDatabits((Databits)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0x48 ^ 0x61) & ~(0x87 ^ 0xAE)) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.PARITY_BIT)) {
            this.setParitybit((Paritybit)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if (null != null) {
                return ((0xC6 ^ 0x82) & ~(0x71 ^ 0x35)) != 0x0;
            }
        }
        else if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.WAIT_TIME)) {
            this.setWaitTimeMillis((int)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if (" ".length() == 0) {
                return ((0x7E ^ 0x1B ^ (0xBA ^ 0x88)) & (0xD8 ^ 0xB1 ^ (0x95 ^ 0xAB) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIIlIl, RxtxChannelOption.READ_TIMEOUT)) {
                return super.setOption(lllllllllllllIIIlIIlIIIIlllIIlIl, lllllllllllllIIIlIIlIIIIlllIIlII);
            }
            this.setReadTimeout((int)lllllllllllllIIIlIIlIIIIlllIIlII);
            "".length();
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((0x4E ^ 0x7B ^ (0x55 ^ 0x3D)) & (0xF ^ 0x42 ^ (0x54 ^ 0x44) ^ -" ".length())) != 0x0;
            }
        }
        return DefaultRxtxChannelConfig.lIlIlIlIIIIllI[4] != 0;
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> options = super.getOptions();
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[2]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3]] = RxtxChannelOption.BAUD_RATE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[4]] = RxtxChannelOption.DTR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[5]] = RxtxChannelOption.RTS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[6]] = RxtxChannelOption.STOP_BITS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[7]] = RxtxChannelOption.DATA_BITS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[8]] = RxtxChannelOption.PARITY_BIT;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[9]] = RxtxChannelOption.WAIT_TIME;
        return this.getOptions(options, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    private static void lllIllIlIlllIlI() {
        (lIlIlIlIIIIIII = new String[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[5]])[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3]] = lllIllIlIlllIII("ECYHMlczLgMjVyoyHTJXJSJOeEpndw==", "GGnFw");
        DefaultRxtxChannelConfig.lIlIlIlIIIIIII[DefaultRxtxChannelConfig.lIlIlIlIIIIllI[4]] = lllIllIlIlllIIl("FJ6T9t0RU8+ZXGLrDekTuMcNNKX6ZPAf", "ddjuN");
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIlIIlIIIIlllIllIl) {
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.BAUD_RATE)) {
            return (T)Integer.valueOf(this.getBaudrate());
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.DTR)) {
            return (T)Boolean.valueOf(this.isDtr());
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.RTS)) {
            return (T)Boolean.valueOf(this.isRts());
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.STOP_BITS)) {
            return (T)this.getStopbits();
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.DATA_BITS)) {
            return (T)this.getDatabits();
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.PARITY_BIT)) {
            return (T)this.getParitybit();
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.WAIT_TIME)) {
            return (T)Integer.valueOf(this.getWaitTimeMillis());
        }
        if (lllIllIlIllllll(lllllllllllllIIIlIIlIIIIlllIllIl, RxtxChannelOption.READ_TIMEOUT)) {
            return (T)Integer.valueOf(this.getReadTimeout());
        }
        return super.getOption(lllllllllllllIIIlIIlIIIIlllIllIl);
    }
    
    @Override
    public int getWaitTimeMillis() {
        return this.waitTime;
    }
    
    private static boolean lllIllIllIIIIIl(final int lllllllllllllIIIlIIIllllllllllII, final int lllllllllllllIIIlIIIlllllllllIll) {
        return lllllllllllllIIIlIIIllllllllllII < lllllllllllllIIIlIIIlllllllllIll;
    }
    
    @Override
    public boolean isRts() {
        return this.rts;
    }
    
    private static void lllIllIlIlllllI() {
        (lIlIlIlIIIIllI = new int[10])[0] = (0xFFFFF73E & 0x1CAC1);
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[1] = (-(0xFFFFFBFE & 0x7C07) & (0xFFFFFFED & 0x7BFF));
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[2] = (72 + 117 - 94 + 88 ^ 85 + 83 - 118 + 126);
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3] = ((0x48 ^ 0x59) & ~(0x1 ^ 0x10));
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[4] = " ".length();
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[5] = "  ".length();
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[6] = "   ".length();
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[7] = (0x2A ^ 0x2E);
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[8] = (0x1C ^ 0x19);
        DefaultRxtxChannelConfig.lIlIlIlIIIIllI[9] = (24 + 95 - 79 + 88 ^ 68 + 8 - 2 + 60);
    }
    
    @Override
    public RxtxChannelConfig setWriteSpinCount(final int lllllllllllllIIIlIIlIIIIlIIIlIlI) {
        super.setWriteSpinCount(lllllllllllllIIIlIIlIIIIlIIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public int getBaudrate() {
        return this.baudrate;
    }
    
    @Override
    public RxtxChannelConfig setBaudrate(final int lllllllllllllIIIlIIlIIIIllIllllI) {
        this.baudrate = lllllllllllllIIIlIIlIIIIllIllllI;
        return this;
    }
    
    private static boolean lllIllIllIIIIII(final int lllllllllllllIIIlIIIllllllllIlIl) {
        return lllllllllllllIIIlIIIllllllllIlIl < 0;
    }
    
    @Override
    public RxtxChannelConfig setAutoRead(final boolean lllllllllllllIIIlIIlIIIIIllllIlI) {
        super.setAutoRead(lllllllllllllIIIlIIlIIIIIllllIlI);
        "".length();
        return this;
    }
    
    @Override
    public int getReadTimeout() {
        return this.readTimeout;
    }
    
    @Override
    public RxtxChannelConfig setStopbits(final Stopbits lllllllllllllIIIlIIlIIIIllIllIII) {
        this.stopbits = lllllllllllllIIIlIIlIIIIllIllIII;
        return this;
    }
    
    @Override
    public boolean isDtr() {
        return this.dtr;
    }
    
    @Override
    public RxtxChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIlIIlIIIIIllIlIII) {
        super.setWriteBufferLowWaterMark(lllllllllllllIIIlIIlIIIIIllIlIII);
        "".length();
        return this;
    }
    
    DefaultRxtxChannelConfig(final RxtxChannel lllllllllllllIIIlIIlIIIIllllIllI) {
        super(lllllllllllllIIIlIIlIIIIllllIllI);
        this.baudrate = DefaultRxtxChannelConfig.lIlIlIlIIIIllI[0];
        this.stopbits = Stopbits.STOPBITS_1;
        this.databits = Databits.DATABITS_8;
        this.paritybit = Paritybit.NONE;
        this.readTimeout = DefaultRxtxChannelConfig.lIlIlIlIIIIllI[1];
    }
    
    @Override
    public RxtxChannelConfig setAutoClose(final boolean lllllllllllllIIIlIIlIIIIIlllIIlI) {
        super.setAutoClose(lllllllllllllIIIlIIlIIIIIlllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public RxtxChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIlIIlIIIIIllIIIII) {
        super.setMessageSizeEstimator(lllllllllllllIIIlIIlIIIIIllIIIII);
        "".length();
        return this;
    }
    
    @Override
    public RxtxChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIlIIlIIIIlIIIIIII) {
        super.setRecvByteBufAllocator(lllllllllllllIIIlIIlIIIIlIIIIIII);
        "".length();
        return this;
    }
    
    private static boolean lllIllIlIllllll(final Object lllllllllllllIIIlIIIlllllllllIII, final Object lllllllllllllIIIlIIIllllllllIlll) {
        return lllllllllllllIIIlIIIlllllllllIII == lllllllllllllIIIlIIIllllllllIlll;
    }
    
    @Override
    public Stopbits getStopbits() {
        return this.stopbits;
    }
    
    @Override
    public RxtxChannelConfig setRts(final boolean lllllllllllllIIIlIIlIIIIlIlIlllI) {
        this.rts = lllllllllllllIIIlIIlIIIIlIlIlllI;
        return this;
    }
    
    @Override
    public RxtxChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIlIIlIIIIlIIlIIlI) {
        super.setMaxMessagesPerRead(lllllllllllllIIIlIIlIIIIlIIlIIlI);
        "".length();
        return this;
    }
    
    private static String lllIllIlIlllIIl(final String lllllllllllllIIIlIIlIIIIIIIlllII, final String lllllllllllllIIIlIIlIIIIIIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIIIIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIIIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIlIIIIIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIlIIIIIIIllllI.init(DefaultRxtxChannelConfig.lIlIlIlIIIIllI[5], lllllllllllllIIIlIIlIIIIIIIlllll);
            return new String(lllllllllllllIIIlIIlIIIIIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIIIIIIIlllIl) {
            lllllllllllllIIIlIIlIIIIIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lllIllIlIlllIII(String lllllllllllllIIIlIIlIIIIIIIIIlll, final String lllllllllllllIIIlIIlIIIIIIIIIllI) {
        lllllllllllllIIIlIIlIIIIIIIIIlll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIlIIIIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIIIIIIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIIIIIIIIlIIl = lllllllllllllIIIlIIlIIIIIIIIIllI.toCharArray();
        int lllllllllllllIIIlIIlIIIIIIIIlIII = DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3];
        final String lllllllllllllIIIlIIlIIIIIIIIIIlI = (Object)((String)lllllllllllllIIIlIIlIIIIIIIIIlll).toCharArray();
        final char lllllllllllllIIIlIIlIIIIIIIIIIIl = (char)lllllllllllllIIIlIIlIIIIIIIIIIlI.length;
        long lllllllllllllIIIlIIlIIIIIIIIIIII = DefaultRxtxChannelConfig.lIlIlIlIIIIllI[3];
        while (lllIllIllIIIIIl((int)lllllllllllllIIIlIIlIIIIIIIIIIII, lllllllllllllIIIlIIlIIIIIIIIIIIl)) {
            final char lllllllllllllIIIlIIlIIIIIIIIllIl = lllllllllllllIIIlIIlIIIIIIIIIIlI[lllllllllllllIIIlIIlIIIIIIIIIIII];
            lllllllllllllIIIlIIlIIIIIIIIlIlI.append((char)(lllllllllllllIIIlIIlIIIIIIIIllIl ^ lllllllllllllIIIlIIlIIIIIIIIlIIl[lllllllllllllIIIlIIlIIIIIIIIlIII % lllllllllllllIIIlIIlIIIIIIIIlIIl.length]));
            "".length();
            ++lllllllllllllIIIlIIlIIIIIIIIlIII;
            ++lllllllllllllIIIlIIlIIIIIIIIIIII;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIIIIIIIIlIlI);
    }
    
    @Override
    public RxtxChannelConfig setParitybit(final Paritybit lllllllllllllIIIlIIlIIIIllIIllII) {
        this.paritybit = lllllllllllllIIIlIIlIIIIllIIllII;
        return this;
    }
    
    @Override
    public RxtxChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIlIIlIIIIlIIIIllI) {
        super.setAllocator(lllllllllllllIIIlIIlIIIIlIIIIllI);
        "".length();
        return this;
    }
    
    static {
        lllIllIlIlllllI();
        lllIllIlIlllIlI();
    }
    
    @Override
    public Databits getDatabits() {
        return this.databits;
    }
    
    @Override
    public RxtxChannelConfig setDatabits(final Databits lllllllllllllIIIlIIlIIIIllIlIlII) {
        this.databits = lllllllllllllIIIlIIlIIIIllIlIlII;
        return this;
    }
    
    @Override
    public RxtxChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIlIIlIIIIIllIllII) {
        super.setWriteBufferHighWaterMark(lllllllllllllIIIlIIlIIIIIllIllII);
        "".length();
        return this;
    }
}
