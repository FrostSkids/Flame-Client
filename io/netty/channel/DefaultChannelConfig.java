// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Iterator;
import java.util.IdentityHashMap;
import io.netty.channel.nio.AbstractNioByteChannel;
import java.util.Map;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufAllocator;

public class DefaultChannelConfig implements ChannelConfig
{
    private volatile /* synthetic */ int maxMessagesPerRead;
    private static final /* synthetic */ RecvByteBufAllocator DEFAULT_RCVBUF_ALLOCATOR;
    private volatile /* synthetic */ int writeSpinCount;
    private volatile /* synthetic */ boolean autoClose;
    private static final /* synthetic */ String[] lIlIlllIlIIlII;
    private volatile /* synthetic */ RecvByteBufAllocator rcvBufAllocator;
    private volatile /* synthetic */ MessageSizeEstimator msgSizeEstimator;
    private volatile /* synthetic */ int writeBufferHighWaterMark;
    private static final /* synthetic */ int[] lIlIlllIlIlIlI;
    private volatile /* synthetic */ int connectTimeoutMillis;
    protected final /* synthetic */ Channel channel;
    private volatile /* synthetic */ ByteBufAllocator allocator;
    private volatile /* synthetic */ int writeBufferLowWaterMark;
    private volatile /* synthetic */ boolean autoRead;
    private static final /* synthetic */ MessageSizeEstimator DEFAULT_MSG_SIZE_ESTIMATOR;
    
    private static boolean llllIIlllllIlIl(final int lllllllllllllIIIIlIlIlllIllllIII, final int lllllllllllllIIIIlIlIlllIlllIlll) {
        return lllllllllllllIIIIlIlIlllIllllIII > lllllllllllllIIIIlIlIlllIlllIlll;
    }
    
    static {
        llllIIllllIllIl();
        llllIIllllIIlIl();
        DEFAULT_CONNECT_TIMEOUT = DefaultChannelConfig.lIlIlllIlIlIlI[0];
        DEFAULT_RCVBUF_ALLOCATOR = AdaptiveRecvByteBufAllocator.DEFAULT;
        DEFAULT_MSG_SIZE_ESTIMATOR = DefaultMessageSizeEstimator.DEFAULT;
    }
    
    @Override
    public int getWriteSpinCount() {
        return this.writeSpinCount;
    }
    
    @Override
    public int getWriteBufferLowWaterMark() {
        return this.writeBufferLowWaterMark;
    }
    
    private static boolean llllIIlllllIIIl(final int lllllllllllllIIIIlIlIlllIlllllII, final int lllllllllllllIIIIlIlIlllIllllIll) {
        return lllllllllllllIIIIlIlIlllIlllllII < lllllllllllllIIIIlIlIlllIllllIll;
    }
    
    @Override
    public <T> boolean setOption(final ChannelOption<T> lllllllllllllIIIIlIllIIIIIIlIlll, final T lllllllllllllIIIIlIllIIIIIIllIIl) {
        this.validate(lllllllllllllIIIIlIllIIIIIIlIlll, lllllllllllllIIIIlIllIIIIIIllIIl);
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.CONNECT_TIMEOUT_MILLIS)) {
            this.setConnectTimeoutMillis((int)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if (-(0x16 ^ 0x18 ^ (0x7F ^ 0x74)) >= 0) {
                return ((48 + 58 - 34 + 74 ^ 96 + 36 - 93 + 104) & (165 + 105 - 85 + 1 ^ 105 + 102 - 143 + 103 ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.MAX_MESSAGES_PER_READ)) {
            this.setMaxMessagesPerRead((int)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if ("   ".length() == 0) {
                return ((0x60 ^ 0x29) & ~(0x33 ^ 0x7A)) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.WRITE_SPIN_COUNT)) {
            this.setWriteSpinCount((int)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x1A ^ 0x40) & ~(0x71 ^ 0x2B)) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.ALLOCATOR)) {
            this.setAllocator((ByteBufAllocator)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if (null != null) {
                return ((0xB3 ^ 0x9B ^ (0x6 ^ 0x23)) & (0xCF ^ 0xC3 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.RCVBUF_ALLOCATOR)) {
            this.setRecvByteBufAllocator((RecvByteBufAllocator)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
                return ((0x9A ^ 0x90) & ~(0x85 ^ 0x8F)) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.AUTO_READ)) {
            this.setAutoRead((boolean)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0x77 ^ 0x37 ^ (0xE3 ^ 0x91)) & (154 + 150 - 266 + 129 ^ 81 + 109 - 147 + 106 ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.AUTO_CLOSE)) {
            this.setAutoClose((boolean)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((47 + 111 - 14 + 32 ^ 111 + 100 - 111 + 86) & (0x2C ^ 0x2 ^ (0x6E ^ 0x4A) ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK)) {
            this.setWriteBufferHighWaterMark((int)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if (" ".length() == "   ".length()) {
                return ((0xF9 ^ 0xB9) & ~(0x59 ^ 0x19)) != 0x0;
            }
        }
        else if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.WRITE_BUFFER_LOW_WATER_MARK)) {
            this.setWriteBufferLowWaterMark((int)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if (null != null) {
                return ((25 + 66 + 11 + 101 ^ 80 + 2 + 70 + 1) & (0xE2 ^ 0xA8 ^ (0x95 ^ 0x8D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (!llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlIlll, ChannelOption.MESSAGE_SIZE_ESTIMATOR)) {
                return DefaultChannelConfig.lIlIlllIlIlIlI[5] != 0;
            }
            this.setMessageSizeEstimator((MessageSizeEstimator)lllllllllllllIIIIlIllIIIIIIllIIl);
            "".length();
            "".length();
            if (null != null) {
                return ((0x7E ^ 0x72 ^ ((0x2D ^ 0x1) & ~(0x4F ^ 0x63))) & (0x68 ^ 0x24 ^ (0x18 ^ 0x58) ^ -" ".length())) != 0x0;
            }
        }
        return DefaultChannelConfig.lIlIlllIlIlIlI[2] != 0;
    }
    
    private static boolean llllIIllllIlllI(final Object lllllllllllllIIIIlIlIlllIlllIIIl) {
        return lllllllllllllIIIIlIlIlllIlllIIIl == null;
    }
    
    private static void llllIIllllIllIl() {
        (lIlIlllIlIlIlI = new int[21])[0] = (-(0xFFFF8867 & 0x7F9B) & (0xFFFFFDB6 & 0x7F7B));
        DefaultChannelConfig.lIlIlllIlIlIlI[1] = (0x8 ^ 0x5F ^ (0x3 ^ 0x44));
        DefaultChannelConfig.lIlIlllIlIlIlI[2] = " ".length();
        DefaultChannelConfig.lIlIlllIlIlIlI[3] = (-(0xFFFFA6FF & 0x7DBD) & (0xFFFFF6BF & 0x12DFC));
        DefaultChannelConfig.lIlIlllIlIlIlI[4] = (0xFFFFC184 & 0xBE7B);
        DefaultChannelConfig.lIlIlllIlIlIlI[5] = ((0x8F ^ 0xAB) & ~(0x45 ^ 0x61));
        DefaultChannelConfig.lIlIlllIlIlIlI[6] = (130 + 112 - 115 + 73 ^ 40 + 116 + 23 + 15);
        DefaultChannelConfig.lIlIlllIlIlIlI[7] = "  ".length();
        DefaultChannelConfig.lIlIlllIlIlIlI[8] = "   ".length();
        DefaultChannelConfig.lIlIlllIlIlIlI[9] = (0x40 ^ 0x44);
        DefaultChannelConfig.lIlIlllIlIlIlI[10] = (0xAF ^ 0xAA);
        DefaultChannelConfig.lIlIlllIlIlIlI[11] = (0x4A ^ 0x29 ^ (0xF3 ^ 0x96));
        DefaultChannelConfig.lIlIlllIlIlIlI[12] = (0x3E ^ 0x39);
        DefaultChannelConfig.lIlIlllIlIlIlI[13] = (0x28 ^ 0x20);
        DefaultChannelConfig.lIlIlllIlIlIlI[14] = (0xCA ^ 0x9A ^ (0x4E ^ 0x17));
        DefaultChannelConfig.lIlIlllIlIlIlI[15] = (64 + 176 - 59 + 24 ^ 66 + 25 - 16 + 123);
        DefaultChannelConfig.lIlIlllIlIlIlI[16] = (0x43 ^ 0x4F);
        DefaultChannelConfig.lIlIlllIlIlIlI[17] = (0x21 ^ 0x2C);
        DefaultChannelConfig.lIlIlllIlIlIlI[18] = (97 + 173 - 161 + 92 ^ 20 + 190 - 123 + 112);
        DefaultChannelConfig.lIlIlllIlIlIlI[19] = (48 + 47 - 45 + 83 ^ 2 + 82 - 15 + 69);
        DefaultChannelConfig.lIlIlllIlIlIlI[20] = (0xED ^ 0xC0 ^ (0x8F ^ 0xB3));
    }
    
    @Override
    public int getMaxMessagesPerRead() {
        return this.maxMessagesPerRead;
    }
    
    @Override
    public ChannelConfig setAutoRead(final boolean lllllllllllllIIIIlIlIlllllIllIlI) {
        final boolean lllllllllllllIIIIlIlIlllllIllIIl = this.autoRead;
        this.autoRead = lllllllllllllIIIIlIlIlllllIllIlI;
        if (llllIIlllllIIII(lllllllllllllIIIIlIlIlllllIllIlI ? 1 : 0) && llllIIllllIllll(lllllllllllllIIIIlIlIlllllIllIIl ? 1 : 0)) {
            this.channel.read();
            "".length();
            "".length();
            if ((0x8F ^ 0xAA ^ (0x39 ^ 0x18)) < -" ".length()) {
                return null;
            }
        }
        else if (llllIIllllIllll(lllllllllllllIIIIlIlIlllllIllIlI ? 1 : 0) && llllIIlllllIIII(lllllllllllllIIIIlIlIlllllIllIIl ? 1 : 0)) {
            this.autoReadCleared();
        }
        return this;
    }
    
    @Override
    public ByteBufAllocator getAllocator() {
        return this.allocator;
    }
    
    private static boolean llllIIllllIllll(final int lllllllllllllIIIIlIlIlllIllIllIl) {
        return lllllllllllllIIIIlIlIlllIllIllIl == 0;
    }
    
    @Override
    public boolean isAutoClose() {
        return this.autoClose;
    }
    
    @Override
    public ChannelConfig setConnectTimeoutMillis(final int lllllllllllllIIIIlIllIIIIIIIIllI) {
        if (llllIIlllllIIll(lllllllllllllIIIIlIllIIIIIIIIllI)) {
            final String format = DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[9]];
            final Object[] args = new Object[DefaultChannelConfig.lIlIlllIlIlIlI[2]];
            args[DefaultChannelConfig.lIlIlllIlIlIlI[5]] = lllllllllllllIIIIlIllIIIIIIIIllI;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.connectTimeoutMillis = lllllllllllllIIIIlIllIIIIIIIIllI;
        return this;
    }
    
    @Override
    public boolean isAutoRead() {
        return this.autoRead;
    }
    
    @Override
    public ChannelConfig setWriteSpinCount(final int lllllllllllllIIIIlIlIlllllllIlII) {
        if (llllIIlllllIlII(lllllllllllllIIIIlIlIlllllllIlII)) {
            throw new IllegalArgumentException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[12]]);
        }
        this.writeSpinCount = lllllllllllllIIIIlIlIlllllllIlII;
        return this;
    }
    
    @Override
    public ChannelConfig setWriteBufferLowWaterMark(final int lllllllllllllIIIIlIlIllllIllllII) {
        if (llllIIlllllIlIl(lllllllllllllIIIIlIlIllllIllllII, this.getWriteBufferHighWaterMark())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[17]]).append(this.getWriteBufferHighWaterMark()).append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[18]]).append(lllllllllllllIIIIlIlIllllIllllII)));
        }
        if (llllIIlllllIIll(lllllllllllllIIIIlIlIllllIllllII)) {
            throw new IllegalArgumentException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[19]]);
        }
        this.writeBufferLowWaterMark = lllllllllllllIIIIlIlIllllIllllII;
        return this;
    }
    
    @Override
    public ChannelConfig setAutoClose(final boolean lllllllllllllIIIIlIlIlllllIIlllI) {
        this.autoClose = lllllllllllllIIIIlIlIlllllIIlllI;
        return this;
    }
    
    @Override
    public ChannelConfig setMessageSizeEstimator(final MessageSizeEstimator lllllllllllllIIIIlIlIllllIllIIll) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIlIllllIllIIll)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[1]]);
        }
        this.msgSizeEstimator = lllllllllllllIIIIlIlIllllIllIIll;
        return this;
    }
    
    private static String llllIIllllIIIIl(final String lllllllllllllIIIIlIlIllllIIIIlII, final String lllllllllllllIIIIlIlIllllIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), DefaultChannelConfig.lIlIlllIlIlIlI[13]), "DES");
            final Cipher lllllllllllllIIIIlIlIllllIIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIllllIIIIllI.init(DefaultChannelConfig.lIlIlllIlIlIlI[7], lllllllllllllIIIIlIlIllllIIIIlll);
            return new String(lllllllllllllIIIIlIlIllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIllllIIIIlIl) {
            lllllllllllllIIIIlIlIllllIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Map<ChannelOption<?>, Object> getOptions() {
        final Map<ChannelOption<?>, Object> lllllllllllllIIIIlIllIIIIIlllIIl = null;
        final ChannelOption[] lllllllllllllIIIIlIllIIIIIlllIll = new ChannelOption[DefaultChannelConfig.lIlIlllIlIlIlI[6]];
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[5]] = ChannelOption.CONNECT_TIMEOUT_MILLIS;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[2]] = ChannelOption.MAX_MESSAGES_PER_READ;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[7]] = ChannelOption.WRITE_SPIN_COUNT;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[8]] = ChannelOption.ALLOCATOR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[9]] = ChannelOption.AUTO_READ;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[10]] = ChannelOption.AUTO_CLOSE;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[11]] = ChannelOption.RCVBUF_ALLOCATOR;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[12]] = ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[13]] = ChannelOption.WRITE_BUFFER_LOW_WATER_MARK;
        lllllllllllllIIIIlIllIIIIIlllIll[DefaultChannelConfig.lIlIlllIlIlIlI[14]] = ChannelOption.MESSAGE_SIZE_ESTIMATOR;
        return this.getOptions(lllllllllllllIIIIlIllIIIIIlllIIl, (ChannelOption<?>[])lllllllllllllIIIIlIllIIIIIlllIll);
    }
    
    @Override
    public MessageSizeEstimator getMessageSizeEstimator() {
        return this.msgSizeEstimator;
    }
    
    protected <T> void validate(final ChannelOption<T> lllllllllllllIIIIlIllIIIIIIlIIII, final T lllllllllllllIIIIlIllIIIIIIlIIIl) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIllIIIIIIlIIII)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[8]]);
        }
        lllllllllllllIIIIlIllIIIIIIlIIII.validate(lllllllllllllIIIIlIllIIIIIIlIIIl);
    }
    
    @Override
    public ChannelConfig setWriteBufferHighWaterMark(final int lllllllllllllIIIIlIlIlllllIIIlIl) {
        if (llllIIlllllIIIl(lllllllllllllIIIIlIlIlllllIIIlIl, this.getWriteBufferLowWaterMark())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[6]]).append(this.getWriteBufferLowWaterMark()).append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[15]]).append(lllllllllllllIIIIlIlIlllllIIIlIl)));
        }
        if (llllIIlllllIIll(lllllllllllllIIIIlIlIlllllIIIlIl)) {
            throw new IllegalArgumentException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[16]]);
        }
        this.writeBufferHighWaterMark = lllllllllllllIIIIlIlIlllllIIIlIl;
        return this;
    }
    
    private static String llllIIllllIIIlI(String lllllllllllllIIIIlIlIllllIlIIIIl, final String lllllllllllllIIIIlIlIllllIlIIlIl) {
        lllllllllllllIIIIlIlIllllIlIIIIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIlIllllIlIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIllllIlIIlII = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIllllIlIIIll = lllllllllllllIIIIlIlIllllIlIIlIl.toCharArray();
        int lllllllllllllIIIIlIlIllllIlIIIlI = DefaultChannelConfig.lIlIlllIlIlIlI[5];
        final int lllllllllllllIIIIlIlIllllIIlllII = (Object)((String)lllllllllllllIIIIlIlIllllIlIIIIl).toCharArray();
        final char lllllllllllllIIIIlIlIllllIIllIll = (char)lllllllllllllIIIIlIlIllllIIlllII.length;
        String lllllllllllllIIIIlIlIllllIIllIlI = (String)DefaultChannelConfig.lIlIlllIlIlIlI[5];
        while (llllIIlllllIIIl((int)lllllllllllllIIIIlIlIllllIIllIlI, lllllllllllllIIIIlIlIllllIIllIll)) {
            final char lllllllllllllIIIIlIlIllllIlIIlll = lllllllllllllIIIIlIlIllllIIlllII[lllllllllllllIIIIlIlIllllIIllIlI];
            lllllllllllllIIIIlIlIllllIlIIlII.append((char)(lllllllllllllIIIIlIlIllllIlIIlll ^ lllllllllllllIIIIlIlIllllIlIIIll[lllllllllllllIIIIlIlIllllIlIIIlI % lllllllllllllIIIIlIlIllllIlIIIll.length]));
            "".length();
            ++lllllllllllllIIIIlIlIllllIlIIIlI;
            ++lllllllllllllIIIIlIlIllllIIllIlI;
            "".length();
            if ((0xDB ^ 0x9E ^ (0x4 ^ 0x45)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIllllIlIIlII);
    }
    
    public DefaultChannelConfig(final Channel lllllllllllllIIIIlIllIIIIlIIllII) {
        this.allocator = ByteBufAllocator.DEFAULT;
        this.rcvBufAllocator = DefaultChannelConfig.DEFAULT_RCVBUF_ALLOCATOR;
        this.msgSizeEstimator = DefaultChannelConfig.DEFAULT_MSG_SIZE_ESTIMATOR;
        this.connectTimeoutMillis = DefaultChannelConfig.lIlIlllIlIlIlI[0];
        this.writeSpinCount = DefaultChannelConfig.lIlIlllIlIlIlI[1];
        this.autoRead = (DefaultChannelConfig.lIlIlllIlIlIlI[2] != 0);
        this.autoClose = (DefaultChannelConfig.lIlIlllIlIlIlI[2] != 0);
        this.writeBufferHighWaterMark = DefaultChannelConfig.lIlIlllIlIlIlI[3];
        this.writeBufferLowWaterMark = DefaultChannelConfig.lIlIlllIlIlIlI[4];
        if (llllIIllllIlllI(lllllllllllllIIIIlIllIIIIlIIllII)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[5]]);
        }
        this.channel = lllllllllllllIIIIlIllIIIIlIIllII;
        if (!llllIIllllIllll((lllllllllllllIIIIlIllIIIIlIIllII instanceof ServerChannel) ? 1 : 0) || llllIIlllllIIII((lllllllllllllIIIIlIllIIIIlIIllII instanceof AbstractNioByteChannel) ? 1 : 0)) {
            this.maxMessagesPerRead = DefaultChannelConfig.lIlIlllIlIlIlI[1];
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            this.maxMessagesPerRead = DefaultChannelConfig.lIlIlllIlIlIlI[2];
        }
    }
    
    private static boolean llllIIlllllIIlI(final Object lllllllllllllIIIIlIlIlllIlllIlII, final Object lllllllllllllIIIIlIlIlllIlllIIll) {
        return lllllllllllllIIIIlIlIlllIlllIlII == lllllllllllllIIIIlIlIlllIlllIIll;
    }
    
    @Override
    public int getWriteBufferHighWaterMark() {
        return this.writeBufferHighWaterMark;
    }
    
    @Override
    public RecvByteBufAllocator getRecvByteBufAllocator() {
        return this.rcvBufAllocator;
    }
    
    @Override
    public <T> T getOption(final ChannelOption<T> lllllllllllllIIIIlIllIIIIIIlllll) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIllIIIIIIlllll)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[7]]);
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.CONNECT_TIMEOUT_MILLIS)) {
            return (T)Integer.valueOf(this.getConnectTimeoutMillis());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.MAX_MESSAGES_PER_READ)) {
            return (T)Integer.valueOf(this.getMaxMessagesPerRead());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.WRITE_SPIN_COUNT)) {
            return (T)Integer.valueOf(this.getWriteSpinCount());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.ALLOCATOR)) {
            return (T)this.getAllocator();
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.RCVBUF_ALLOCATOR)) {
            return (T)this.getRecvByteBufAllocator();
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.AUTO_READ)) {
            return (T)Boolean.valueOf(this.isAutoRead());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.AUTO_CLOSE)) {
            return (T)Boolean.valueOf(this.isAutoClose());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK)) {
            return (T)Integer.valueOf(this.getWriteBufferHighWaterMark());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.WRITE_BUFFER_LOW_WATER_MARK)) {
            return (T)Integer.valueOf(this.getWriteBufferLowWaterMark());
        }
        if (llllIIlllllIIlI(lllllllllllllIIIIlIllIIIIIIlllll, ChannelOption.MESSAGE_SIZE_ESTIMATOR)) {
            return (T)this.getMessageSizeEstimator();
        }
        return null;
    }
    
    @Override
    public ChannelConfig setAllocator(final ByteBufAllocator lllllllllllllIIIIlIlIllllllIlIll) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIlIllllllIlIll)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[13]]);
        }
        this.allocator = lllllllllllllIIIIlIlIllllllIlIll;
        return this;
    }
    
    protected Map<ChannelOption<?>, Object> getOptions(Map<ChannelOption<?>, Object> lllllllllllllIIIIlIllIIIIIlllIIl, final ChannelOption<?>... lllllllllllllIIIIlIllIIIIIlllIll) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIllIIIIIlllIIl)) {
            lllllllllllllIIIIlIllIIIIIlllIIl = new IdentityHashMap<ChannelOption<?>, Object>();
        }
        final ChannelOption[] lllllllllllllIIIIlIllIIIIlIIIIII = lllllllllllllIIIIlIllIIIIIlllIll;
        final int lllllllllllllIIIIlIllIIIIIllllll = lllllllllllllIIIIlIllIIIIlIIIIII.length;
        int lllllllllllllIIIIlIllIIIIIlllllI = DefaultChannelConfig.lIlIlllIlIlIlI[5];
        while (llllIIlllllIIIl(lllllllllllllIIIIlIllIIIIIlllllI, lllllllllllllIIIIlIllIIIIIllllll)) {
            final ChannelOption<?> lllllllllllllIIIIlIllIIIIlIIIIIl = (ChannelOption<?>)lllllllllllllIIIIlIllIIIIlIIIIII[lllllllllllllIIIIlIllIIIIIlllllI];
            lllllllllllllIIIIlIllIIIIIlllIIl.put(lllllllllllllIIIIlIllIIIIlIIIIIl, this.getOption(lllllllllllllIIIIlIllIIIIlIIIIIl));
            "".length();
            ++lllllllllllllIIIIlIllIIIIIlllllI;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return lllllllllllllIIIIlIllIIIIIlllIIl;
    }
    
    @Override
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }
    
    private static boolean llllIIlllllIIll(final int lllllllllllllIIIIlIlIlllIllIlIll) {
        return lllllllllllllIIIIlIlIlllIllIlIll < 0;
    }
    
    private static boolean llllIIlllllIIII(final int lllllllllllllIIIIlIlIlllIllIllll) {
        return lllllllllllllIIIIlIlIlllIllIllll != 0;
    }
    
    private static String llllIIlllIlllII(final String lllllllllllllIIIIlIlIllllIIlIIIl, final String lllllllllllllIIIIlIlIllllIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIllllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIllllIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIllllIIlIIll.init(DefaultChannelConfig.lIlIlllIlIlIlI[7], lllllllllllllIIIIlIlIllllIIlIlII);
            return new String(lllllllllllllIIIIlIlIllllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIllllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIllllIIlIIlI) {
            lllllllllllllIIIIlIlIllllIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIlllllIlII(final int lllllllllllllIIIIlIlIlllIllIlIIl) {
        return lllllllllllllIIIIlIlIlllIllIlIIl <= 0;
    }
    
    @Override
    public ChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator lllllllllllllIIIIlIlIllllllIIIlI) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIlIllllllIIIlI)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[14]]);
        }
        this.rcvBufAllocator = lllllllllllllIIIIlIlIllllllIIIlI;
        return this;
    }
    
    @Override
    public ChannelConfig setMaxMessagesPerRead(final int lllllllllllllIIIIlIlIlllllllllll) {
        if (llllIIlllllIlII(lllllllllllllIIIIlIlIlllllllllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[10]]).append(lllllllllllllIIIIlIlIlllllllllll).append(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[11]])));
        }
        this.maxMessagesPerRead = lllllllllllllIIIIlIlIlllllllllll;
        return this;
    }
    
    protected void autoReadCleared() {
    }
    
    private static void llllIIllllIIlIl() {
        (lIlIlllIlIIlII = new String[DefaultChannelConfig.lIlIlllIlIlIlI[20]])[DefaultChannelConfig.lIlIlllIlIlIlI[5]] = llllIIlllIlllII("M+SJnJtAJX8=", "vgwRe");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[2]] = llllIIlllIlllII("Kg/+afIMrXY=", "sPtmK");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[7]] = llllIIlllIlllII("1OoCLBOv2vg=", "QEQqM");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[8]] = llllIIllllIIIIl("DkKIrN917YU=", "wFMGt");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[9]] = llllIIllllIIIIl("CSjRn6S9WXWP2GFg8CNKmey2ramUSxgg79oA7HgD/aDHX5q/BcJ4Ebt1NQQcFjcm", "FAwoB");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[10]] = llllIIllllIIIIl("eGJ0hw/WoUI6NRQDUOetbo/vjWQxSLxE", "KfJSX");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[11]] = llllIIllllIIIIl("zcuwxjtJGHOjrq0d7B4GDjinI1XRFJV5", "IOTFm");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[12]] = llllIIllllIIIlI("EAIEFw40AAQNKAgFAxdLCgUeF0sFFU0CSxcfHgofDgYIQwIJBAgEDhVe", "gpmck");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[13]] = llllIIlllIlllII("tIA7NPctLxf3XbgGmLf9uA==", "vZtfY");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[14]] = llllIIllllIIIIl("vXbJOz6W3JFCIx/vPbN83Q==", "VKcTG");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[6]] = llllIIllllIIIIl("NBT5X6B7sOopPXSWKMhiw85AxQf/vbrvOQQ0vv4qZ9T5ePJWEYZc9OnItXoFnRqcLXWosmgWqUwOJrqU0FOwg06eqnjiRY1P", "OfSuY");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[15]] = llllIIllllIIIIl("fI/OZfKBp0I=", "MkVOp");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[16]] = llllIIllllIIIlI("AzQiGA02My0KDQYOIgsAIyc/CRo5JzkHSBkzOBhIFiNrUlVUdg==", "tFKlh");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[17]] = llllIIllllIIIlI("LQImOTMYBSkrMyg8IDoBOwQqPxs7AiRtNTseISIiehIqbTEoFS45MyhQOyU3NFA4Pz8uFQ04MDwVPQU/PRgYLCI/AgIsJDFQZw==", "ZpOMV");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[18]] = llllIIlllIlllII("xnZP+uZx0zs=", "UOBrv");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[19]] = llllIIlllIlllII("3sXb3jYmFouie1VupCK/r1i/AiyRnlqcdYKXqZ1lovRTt8yvylyOKw==", "WGCOQ");
        DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[1]] = llllIIllllIIIlI("Nh4+LiQyGSU1", "SmJGI");
    }
    
    @Override
    public boolean setOptions(final Map<ChannelOption<?>, ?> lllllllllllllIIIIlIllIIIIIlIlIII) {
        if (llllIIllllIlllI(lllllllllllllIIIIlIllIIIIIlIlIII)) {
            throw new NullPointerException(DefaultChannelConfig.lIlIlllIlIIlII[DefaultChannelConfig.lIlIlllIlIlIlI[2]]);
        }
        boolean lllllllllllllIIIIlIllIIIIIlIlIlI = DefaultChannelConfig.lIlIlllIlIlIlI[2] != 0;
        final Iterator lllllllllllllIIIIlIllIIIIIlIllIl = lllllllllllllIIIIlIllIIIIIlIlIII.entrySet().iterator();
        while (llllIIlllllIIII(lllllllllllllIIIIlIllIIIIIlIllIl.hasNext() ? 1 : 0)) {
            final Map.Entry<ChannelOption<?>, ?> lllllllllllllIIIIlIllIIIIIlIlllI = lllllllllllllIIIIlIllIIIIIlIllIl.next();
            if (llllIIllllIllll(this.setOption(lllllllllllllIIIIlIllIIIIIlIlllI.getKey(), lllllllllllllIIIIlIllIIIIIlIlllI.getValue()) ? 1 : 0)) {
                lllllllllllllIIIIlIllIIIIIlIlIlI = (DefaultChannelConfig.lIlIlllIlIlIlI[5] != 0);
            }
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x95 ^ 0xBB ^ (0x92 ^ 0xAD)) & (0x28 ^ 0x15 ^ (0x26 ^ 0xA) ^ -" ".length())) != 0x0;
            }
        }
        return lllllllllllllIIIIlIllIIIIIlIlIlI;
    }
}
