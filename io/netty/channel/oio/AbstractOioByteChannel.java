// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.oio;

import io.netty.channel.ChannelOutboundBuffer;
import io.netty.channel.Channel;
import io.netty.util.internal.StringUtil;
import io.netty.channel.FileRegion;
import java.util.Arrays;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import io.netty.channel.socket.ChannelInputShutdownEvent;
import io.netty.channel.ChannelOption;
import java.io.IOException;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelMetadata;

public abstract class AbstractOioByteChannel extends AbstractOioChannel
{
    private volatile /* synthetic */ boolean inputShutdown;
    private static final /* synthetic */ String EXPECTED_TYPES;
    private static final /* synthetic */ ChannelMetadata METADATA;
    private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
    private static final /* synthetic */ String[] lIIIllIIllllII;
    private static final /* synthetic */ int[] lIIIllIIllllIl;
    
    private static boolean llIIIlIIIIIIIII(final Object lllllllllllllIlIIIIIIllIIlIllllI) {
        return lllllllllllllIlIIIIIIllIIlIllllI != null;
    }
    
    private static String llIIIIlllllIIll(final String lllllllllllllIlIIIIIIllIIlllIIll, final String lllllllllllllIlIIIIIIllIIlllIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIllIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIllIIlllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIllIIlllIlll.init(AbstractOioByteChannel.lIIIllIIllllIl[3], lllllllllllllIlIIIIIIllIIllllIII);
            return new String(lllllllllllllIlIIIIIIllIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIllIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIllIIlllIllI) {
            lllllllllllllIlIIIIIIllIIlllIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIIIIIIIl(final int lllllllllllllIlIIIIIIllIIllIIlIl, final int lllllllllllllIlIIIIIIllIIllIIlII) {
        return lllllllllllllIlIIIIIIllIIllIIlIl < lllllllllllllIlIIIIIIllIIllIIlII;
    }
    
    protected abstract int doReadBytes(final ByteBuf p0) throws Exception;
    
    private static boolean llIIIIlllllIlll(final int lllllllllllllIlIIIIIIllIIlIllIlI) {
        return lllllllllllllIlIIIIIIllIIlIllIlI != 0;
    }
    
    @Override
    protected void doRead() {
        if (llIIIIlllllIlll(this.checkInputShutdown() ? 1 : 0)) {
            return;
        }
        final ChannelConfig lllllllllllllIlIIIIIIllIllIlIIII = this.config();
        final ChannelPipeline lllllllllllllIlIIIIIIllIllIIllll = this.pipeline();
        RecvByteBufAllocator.Handle lllllllllllllIlIIIIIIllIllIIlllI = this.allocHandle;
        if (llIIIIllllllIII(lllllllllllllIlIIIIIIllIllIIlllI)) {
            lllllllllllllIlIIIIIIllIllIIlllI = (this.allocHandle = lllllllllllllIlIIIIIIllIllIlIIII.getRecvByteBufAllocator().newHandle());
        }
        ByteBuf lllllllllllllIlIIIIIIllIllIIllIl = lllllllllllllIlIIIIIIllIllIIlllI.allocate(this.alloc());
        boolean lllllllllllllIlIIIIIIllIllIIllII = AbstractOioByteChannel.lIIIllIIllllIl[1] != 0;
        boolean lllllllllllllIlIIIIIIllIllIIlIll = AbstractOioByteChannel.lIIIllIIllllIl[1] != 0;
        Throwable lllllllllllllIlIIIIIIllIllIIlIlI = null;
        int lllllllllllllIlIIIIIIllIllIIlIIl = AbstractOioByteChannel.lIIIllIIllllIl[1];
        try {
            int lllllllllllllIlIIIIIIllIllIlIIll = AbstractOioByteChannel.lIIIllIIllllIl[1];
            do {
                lllllllllllllIlIIIIIIllIllIIlIIl = this.doReadBytes(lllllllllllllIlIIIIIIllIllIIllIl);
                if (llIIIIllllllIIl(lllllllllllllIlIIIIIIllIllIIlIIl)) {
                    lllllllllllllIlIIIIIIllIllIIlIll = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
                else if (llIIIIllllllIlI(lllllllllllllIlIIIIIIllIllIIlIIl)) {
                    lllllllllllllIlIIIIIIllIllIIllII = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                }
                final int lllllllllllllIlIIIIIIllIllIlIlII = this.available();
                if (llIIIIllllllIll(lllllllllllllIlIIIIIIllIllIlIlII)) {
                    "".length();
                    if (((0xDC ^ 0xBF) & ~(0x2A ^ 0x49)) <= -" ".length()) {
                        return;
                    }
                }
                else {
                    if (llIIIIlllllllII(lllllllllllllIlIIIIIIllIllIIllIl.isWritable() ? 1 : 0)) {
                        final int lllllllllllllIlIIIIIIllIllIlIllI = lllllllllllllIlIIIIIIllIllIIllIl.capacity();
                        final int lllllllllllllIlIIIIIIllIllIlIlIl = lllllllllllllIlIIIIIIllIllIIllIl.maxCapacity();
                        if (llIIIIlllllllIl(lllllllllllllIlIIIIIIllIllIlIllI, lllllllllllllIlIIIIIIllIllIlIlIl)) {
                            if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIlIll ? 1 : 0)) {
                                lllllllllllllIlIIIIIIllIllIIlIll = (AbstractOioByteChannel.lIIIllIIllllIl[1] != 0);
                                lllllllllllllIlIIIIIIllIllIIllll.fireChannelRead(lllllllllllllIlIIIIIIllIllIIllIl);
                                "".length();
                                lllllllllllllIlIIIIIIllIllIIllIl = this.alloc().buffer();
                                "".length();
                                if ((0xBF ^ 0xA6 ^ (0xBC ^ 0xA1)) == ((0x46 ^ 0x9 ^ (0xCD ^ 0xA7)) & (0xD3 ^ 0xAA ^ (0x75 ^ 0x29) ^ -" ".length()))) {
                                    return;
                                }
                            }
                        }
                        else {
                            final int lllllllllllllIlIIIIIIllIllIlIlll = lllllllllllllIlIIIIIIllIllIIllIl.writerIndex();
                            if (llIIIIllllllllI(lllllllllllllIlIIIIIIllIllIlIlll + lllllllllllllIlIIIIIIllIllIlIlII, lllllllllllllIlIIIIIIllIllIlIlIl)) {
                                lllllllllllllIlIIIIIIllIllIIllIl.capacity(lllllllllllllIlIIIIIIllIllIlIlIl);
                                "".length();
                                "".length();
                                if (((122 + 0 + 76 + 33 ^ 37 + 186 - 156 + 122) & (0x41 ^ 0x27 ^ (0x78 ^ 0x44) ^ -" ".length())) != 0x0) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIlIIIIIIllIllIIllIl.ensureWritable(lllllllllllllIlIIIIIIllIllIlIlII);
                                "".length();
                            }
                        }
                    }
                    if (llIIIIlllllllll(lllllllllllllIlIIIIIIllIllIlIIll, AbstractOioByteChannel.lIIIllIIllllIl[2] - lllllllllllllIlIIIIIIllIllIIlIIl)) {
                        lllllllllllllIlIIIIIIllIllIlIIll = AbstractOioByteChannel.lIIIllIIllllIl[2];
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIIIIIIllIllIlIIll += lllllllllllllIlIIIIIIllIllIIlIIl;
                        if (!llIIIIlllllllII(lllllllllllllIlIIIIIIllIllIlIIII.isAutoRead() ? 1 : 0)) {
                            "".length();
                            continue;
                        }
                        "".length();
                        if (-" ".length() > -" ".length()) {
                            return;
                        }
                    }
                }
                lllllllllllllIlIIIIIIllIllIIlllI.record(lllllllllllllIlIIIIIIllIllIlIIll);
                if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIlIll ? 1 : 0)) {
                    lllllllllllllIlIIIIIIllIllIIllll.fireChannelRead(lllllllllllllIlIIIIIIllIllIIllIl);
                    "".length();
                    "".length();
                    if ((0x3 ^ 0x7) <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIIIIllIllIIllIl.release();
                    "".length();
                }
                lllllllllllllIlIIIIIIllIllIIllll.fireChannelReadComplete();
                "".length();
                if (llIIIlIIIIIIIII(lllllllllllllIlIIIIIIllIllIIlIlI)) {
                    if (llIIIIlllllIlll((lllllllllllllIlIIIIIIllIllIIlIlI instanceof IOException) ? 1 : 0)) {
                        lllllllllllllIlIIIIIIllIllIIllII = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                        this.pipeline().fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                        "".length();
                        "".length();
                        if (-" ".length() > "  ".length()) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIIIIIIllIllIIllll.fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                        "".length();
                        this.unsafe().close(this.voidPromise());
                    }
                }
                if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIllII ? 1 : 0)) {
                    this.inputShutdown = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                    if (llIIIIlllllIlll(this.isOpen() ? 1 : 0)) {
                        if (llIIIIlllllIlll(Boolean.TRUE.equals(this.config().getOption(ChannelOption.ALLOW_HALF_CLOSURE)) ? 1 : 0)) {
                            lllllllllllllIlIIIIIIllIllIIllll.fireUserEventTriggered(ChannelInputShutdownEvent.INSTANCE);
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            this.unsafe().close(this.unsafe().voidPromise());
                        }
                    }
                }
                if (!llIIIIlllllllII(lllllllllllllIlIIIIIIllIllIIlIIl) || !llIIIIlllllIlll(this.isActive() ? 1 : 0)) {
                    return;
                }
                this.read();
                "".length();
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
            } while (" ".length() != 0);
        }
        catch (Throwable lllllllllllllIlIIIIIIllIllIlIIlI) {
            lllllllllllllIlIIIIIIllIllIIlIlI = lllllllllllllIlIIIIIIllIllIlIIlI;
            if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIlIll ? 1 : 0)) {
                lllllllllllllIlIIIIIIllIllIIllll.fireChannelRead(lllllllllllllIlIIIIIIllIllIIllIl);
                "".length();
                "".length();
                if ((0x1A ^ 0x1E) < " ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIIIIIllIllIIllIl.release();
                "".length();
            }
            lllllllllllllIlIIIIIIllIllIIllll.fireChannelReadComplete();
            "".length();
            if (llIIIlIIIIIIIII(lllllllllllllIlIIIIIIllIllIIlIlI)) {
                if (llIIIIlllllIlll((lllllllllllllIlIIIIIIllIllIIlIlI instanceof IOException) ? 1 : 0)) {
                    lllllllllllllIlIIIIIIllIllIIllII = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                    this.pipeline().fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                    "".length();
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIIIIllIllIIllll.fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                    "".length();
                    this.unsafe().close(this.voidPromise());
                }
            }
            if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIllII ? 1 : 0)) {
                this.inputShutdown = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                if (llIIIIlllllIlll(this.isOpen() ? 1 : 0)) {
                    if (llIIIIlllllIlll(Boolean.TRUE.equals(this.config().getOption(ChannelOption.ALLOW_HALF_CLOSURE)) ? 1 : 0)) {
                        lllllllllllllIlIIIIIIllIllIIllll.fireUserEventTriggered(ChannelInputShutdownEvent.INSTANCE);
                        "".length();
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    }
                    else {
                        this.unsafe().close(this.unsafe().voidPromise());
                    }
                }
            }
            if (llIIIIlllllllII(lllllllllllllIlIIIIIIllIllIIlIIl) && llIIIIlllllIlll(this.isActive() ? 1 : 0)) {
                this.read();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        finally {
            if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIlIll ? 1 : 0)) {
                lllllllllllllIlIIIIIIllIllIIllll.fireChannelRead(lllllllllllllIlIIIIIIllIllIIllIl);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIIIIIllIllIIllIl.release();
                "".length();
            }
            lllllllllllllIlIIIIIIllIllIIllll.fireChannelReadComplete();
            "".length();
            if (llIIIlIIIIIIIII(lllllllllllllIlIIIIIIllIllIIlIlI)) {
                if (llIIIIlllllIlll((lllllllllllllIlIIIIIIllIllIIlIlI instanceof IOException) ? 1 : 0)) {
                    lllllllllllllIlIIIIIIllIllIIllII = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                    this.pipeline().fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                    "".length();
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIIIIllIllIIllll.fireExceptionCaught(lllllllllllllIlIIIIIIllIllIIlIlI);
                    "".length();
                    this.unsafe().close(this.voidPromise());
                }
            }
            if (llIIIIlllllIlll(lllllllllllllIlIIIIIIllIllIIllII ? 1 : 0)) {
                this.inputShutdown = (AbstractOioByteChannel.lIIIllIIllllIl[0] != 0);
                if (llIIIIlllllIlll(this.isOpen() ? 1 : 0)) {
                    if (llIIIIlllllIlll(Boolean.TRUE.equals(this.config().getOption(ChannelOption.ALLOW_HALF_CLOSURE)) ? 1 : 0)) {
                        lllllllllllllIlIIIIIIllIllIIllll.fireUserEventTriggered(ChannelInputShutdownEvent.INSTANCE);
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        this.unsafe().close(this.unsafe().voidPromise());
                    }
                }
            }
            if (llIIIIlllllllII(lllllllllllllIlIIIIIIllIllIIlIIl) && llIIIIlllllIlll(this.isActive() ? 1 : 0)) {
                this.read();
                "".length();
            }
        }
    }
    
    protected boolean isInputShutdown() {
        return this.inputShutdown;
    }
    
    private static String llIIIIlllllIlII(final String lllllllllllllIlIIIIIIllIlIIIIIII, final String lllllllllllllIlIIIIIIllIlIIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIllIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIllIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), AbstractOioByteChannel.lIIIllIIllllIl[7]), "DES");
            final Cipher lllllllllllllIlIIIIIIllIlIIIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIIllIlIIIIlII.init(AbstractOioByteChannel.lIIIllIIllllIl[3], lllllllllllllIlIIIIIIllIlIIIIlIl);
            return new String(lllllllllllllIlIIIIIIllIlIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIllIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIllIlIIIIIll) {
            lllllllllllllIlIIIIIIllIlIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIlllllIIlI(String lllllllllllllIlIIIIIIllIlIIlIIlI, final String lllllllllllllIlIIIIIIllIlIIlIllI) {
        lllllllllllllIlIIIIIIllIlIIlIIlI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIIllIlIIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIllIlIIlIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIllIlIIlIlII = lllllllllllllIlIIIIIIllIlIIlIllI.toCharArray();
        int lllllllllllllIlIIIIIIllIlIIlIIll = AbstractOioByteChannel.lIIIllIIllllIl[1];
        final double lllllllllllllIlIIIIIIllIlIIIllIl = (Object)((String)lllllllllllllIlIIIIIIllIlIIlIIlI).toCharArray();
        final char lllllllllllllIlIIIIIIllIlIIIllII = (char)lllllllllllllIlIIIIIIllIlIIIllIl.length;
        short lllllllllllllIlIIIIIIllIlIIIlIll = (short)AbstractOioByteChannel.lIIIllIIllllIl[1];
        while (llIIIlIIIIIIIIl(lllllllllllllIlIIIIIIllIlIIIlIll, lllllllllllllIlIIIIIIllIlIIIllII)) {
            final char lllllllllllllIlIIIIIIllIlIIllIII = lllllllllllllIlIIIIIIllIlIIIllIl[lllllllllllllIlIIIIIIllIlIIIlIll];
            lllllllllllllIlIIIIIIllIlIIlIlIl.append((char)(lllllllllllllIlIIIIIIllIlIIllIII ^ lllllllllllllIlIIIIIIllIlIIlIlII[lllllllllllllIlIIIIIIllIlIIlIIll % lllllllllllllIlIIIIIIllIlIIlIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIllIlIIlIIll;
            ++lllllllllllllIlIIIIIIllIlIIIlIll;
            "".length();
            if ("   ".length() == ((0x3F ^ 0x11) & ~(0x37 ^ 0x19))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIllIlIIlIlIl);
    }
    
    private static boolean llIIIIllllllllI(final int lllllllllllllIlIIIIIIllIIllIIIIl, final int lllllllllllllIlIIIIIIllIIllIIIII) {
        return lllllllllllllIlIIIIIIllIIllIIIIl > lllllllllllllIlIIIIIIllIIllIIIII;
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object lllllllllllllIlIIIIIIllIlIlIIIlI) throws Exception {
        if (!llIIIIlllllllII((lllllllllllllIlIIIIIIllIlIlIIIlI instanceof ByteBuf) ? 1 : 0) || llIIIIlllllIlll((lllllllllllllIlIIIIIIllIlIlIIIlI instanceof FileRegion) ? 1 : 0)) {
            return lllllllllllllIlIIIIIIllIlIlIIIlI;
        }
        throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[0]]).append(StringUtil.simpleClassName(lllllllllllllIlIIIIIIllIlIlIIIlI)).append(AbstractOioByteChannel.EXPECTED_TYPES)));
    }
    
    private static void llIIIIlllllIlIl() {
        (lIIIllIIllllII = new String[AbstractOioByteChannel.lIIIllIIllllIl[6]])[AbstractOioByteChannel.lIIIllIIllllIl[1]] = llIIIIlllllIIlI("DBkKFAMJGAsVFh1XFAQAChYeBFMNDgkESVk=", "ywyas");
        AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[0]] = llIIIIlllllIIll("XyZ/QMu5gsXwMY/qrlDskb5fEn0vgVJg2/tfElb02Xk=", "IsftN");
        AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[3]] = llIIIIlllllIIll("J6SqFR8FGDViBSrhJos0+Q==", "TooRi");
        AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[4]] = llIIIIlllllIlII("SmWsBKeCWxg=", "ocGZb");
    }
    
    private static void llIIIIlllllIllI() {
        (lIIIllIIllllIl = new int[8])[0] = " ".length();
        AbstractOioByteChannel.lIIIllIIllllIl[1] = ((0xF7 ^ 0xAC) & ~(0x45 ^ 0x1E) & ~((0x4B ^ 0x18) & ~(0x21 ^ 0x72)));
        AbstractOioByteChannel.lIIIllIIllllIl[2] = (-1 & Integer.MAX_VALUE);
        AbstractOioByteChannel.lIIIllIIllllIl[3] = "  ".length();
        AbstractOioByteChannel.lIIIllIIllllIl[4] = "   ".length();
        AbstractOioByteChannel.lIIIllIIllllIl[5] = (0x24 ^ 0x6F ^ (0xB ^ 0x69));
        AbstractOioByteChannel.lIIIllIIllllIl[6] = (6 + 131 - 34 + 33 ^ 30 + 120 - 108 + 98);
        AbstractOioByteChannel.lIIIllIIllllIl[7] = (0x92 ^ 0x9A);
    }
    
    private static boolean llIIIIlllllllII(final int lllllllllllllIlIIIIIIllIIlIllIII) {
        return lllllllllllllIlIIIIIIllIIlIllIII == 0;
    }
    
    private static boolean llIIIIllllllIll(final int lllllllllllllIlIIIIIIllIIlIlIlII) {
        return lllllllllllllIlIIIIIIllIIlIlIlII <= 0;
    }
    
    private static boolean llIIIIlllllllll(final int lllllllllllllIlIIIIIIllIIllIlIIl, final int lllllllllllllIlIIIIIIllIIllIlIII) {
        return lllllllllllllIlIIIIIIllIIllIlIIl >= lllllllllllllIlIIIIIIllIIllIlIII;
    }
    
    static {
        llIIIIlllllIllI();
        llIIIIlllllIlIl();
        METADATA = new ChannelMetadata((boolean)(AbstractOioByteChannel.lIIIllIIllllIl[1] != 0));
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[3]]).append(StringUtil.simpleClassName(ByteBuf.class)).append(AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[4]]).append(StringUtil.simpleClassName(FileRegion.class)).append((char)AbstractOioByteChannel.lIIIllIIllllIl[5]));
    }
    
    private static boolean llIIIIllllllIIl(final int lllllllllllllIlIIIIIIllIIlIlIIlI) {
        return lllllllllllllIlIIIIIIllIIlIlIIlI > 0;
    }
    
    protected abstract void doWriteFileRegion(final FileRegion p0) throws Exception;
    
    protected AbstractOioByteChannel(final Channel lllllllllllllIlIIIIIIllIllllIIIl) {
        super(lllllllllllllIlIIIIIIllIllllIIIl);
    }
    
    protected abstract void doWriteBytes(final ByteBuf p0) throws Exception;
    
    private static boolean llIIIIlllllllIl(final int lllllllllllllIlIIIIIIllIIllIllIl, final int lllllllllllllIlIIIIIIllIIllIllII) {
        return lllllllllllllIlIIIIIIllIIllIllIl == lllllllllllllIlIIIIIIllIIllIllII;
    }
    
    protected boolean checkInputShutdown() {
        if (llIIIIlllllIlll(this.inputShutdown ? 1 : 0)) {
            try {
                Thread.sleep(1000L);
                "".length();
                if (null != null) {
                    return ((0x39 ^ 0x34) & ~(0xB3 ^ 0xBE)) != 0x0;
                }
            }
            catch (InterruptedException ex) {}
            return AbstractOioByteChannel.lIIIllIIllllIl[0] != 0;
        }
        return AbstractOioByteChannel.lIIIllIIllllIl[1] != 0;
    }
    
    protected abstract int available();
    
    private static boolean llIIIIllllllIII(final Object lllllllllllllIlIIIIIIllIIlIlllII) {
        return lllllllllllllIlIIIIIIllIIlIlllII == null;
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIlIIIIIIllIlIlIlIlI) throws Exception {
        do {
            final Object lllllllllllllIlIIIIIIllIlIlIlllI = lllllllllllllIlIIIIIIllIlIlIlIlI.current();
            if (llIIIIllllllIII(lllllllllllllIlIIIIIIllIlIlIlllI)) {
                "".length();
                if (((189 + 139 - 150 + 19 ^ 151 + 14 - 3 + 2) & (0xEC ^ 0xBD ^ (0xBC ^ 0x8C) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                if (llIIIIlllllIlll((lllllllllllllIlIIIIIIllIlIlIlllI instanceof ByteBuf) ? 1 : 0)) {
                    final ByteBuf lllllllllllllIlIIIIIIllIlIllIIlI = (ByteBuf)lllllllllllllIlIIIIIIllIlIlIlllI;
                    int lllllllllllllIlIIIIIIllIlIllIIIl = lllllllllllllIlIIIIIIllIlIllIIlI.readableBytes();
                    while (llIIIIllllllIIl(lllllllllllllIlIIIIIIllIlIllIIIl)) {
                        this.doWriteBytes(lllllllllllllIlIIIIIIllIlIllIIlI);
                        final int lllllllllllllIlIIIIIIllIlIllIIll = lllllllllllllIlIIIIIIllIlIllIIlI.readableBytes();
                        lllllllllllllIlIIIIIIllIlIlIlIlI.progress(lllllllllllllIlIIIIIIllIlIllIIIl - lllllllllllllIlIIIIIIllIlIllIIll);
                        lllllllllllllIlIIIIIIllIlIllIIIl = lllllllllllllIlIIIIIIllIlIllIIll;
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    lllllllllllllIlIIIIIIllIlIlIlIlI.remove();
                    "".length();
                    "".length();
                    if ((0x3A ^ 0x3E) < 0) {
                        return;
                    }
                }
                else if (llIIIIlllllIlll((lllllllllllllIlIIIIIIllIlIlIlllI instanceof FileRegion) ? 1 : 0)) {
                    final FileRegion lllllllllllllIlIIIIIIllIlIllIIII = (FileRegion)lllllllllllllIlIIIIIIllIlIlIlllI;
                    final long lllllllllllllIlIIIIIIllIlIlIllll = lllllllllllllIlIIIIIIllIlIllIIII.transfered();
                    this.doWriteFileRegion(lllllllllllllIlIIIIIIllIlIllIIII);
                    lllllllllllllIlIIIIIIllIlIlIlIlI.progress(lllllllllllllIlIIIIIIllIlIllIIII.transfered() - lllllllllllllIlIIIIIIllIlIlIllll);
                    lllllllllllllIlIIIIIIllIlIlIlIlI.remove();
                    "".length();
                    "".length();
                    if (" ".length() >= (0xD8 ^ 0x91 ^ (0x7C ^ 0x31))) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIIIIllIlIlIlIlI.remove(new UnsupportedOperationException(String.valueOf(new StringBuilder().append(AbstractOioByteChannel.lIIIllIIllllII[AbstractOioByteChannel.lIIIllIIllllIl[1]]).append(StringUtil.simpleClassName(lllllllllllllIlIIIIIIllIlIlIlllI)))));
                    "".length();
                }
                "".length();
            }
        } while (null == null);
    }
    
    @Override
    public ChannelMetadata metadata() {
        return AbstractOioByteChannel.METADATA;
    }
    
    private static boolean llIIIIllllllIlI(final int lllllllllllllIlIIIIIIllIIlIlIllI) {
        return lllllllllllllIlIIIIIIllIIlIlIllI < 0;
    }
}
