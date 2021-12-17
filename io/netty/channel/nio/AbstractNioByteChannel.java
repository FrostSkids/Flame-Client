// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import io.netty.channel.socket.ChannelInputShutdownEvent;
import io.netty.channel.ChannelOption;
import java.io.IOException;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelConfig;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.ChannelOutboundBuffer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.AbstractChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SelectableChannel;
import io.netty.channel.Channel;
import io.netty.channel.FileRegion;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.ByteBuf;

public abstract class AbstractNioByteChannel extends AbstractNioChannel
{
    private static final /* synthetic */ int[] lIIIIlIllIIIlI;
    private /* synthetic */ Runnable flushTask;
    private static final /* synthetic */ String[] lIIIIlIllIIIII;
    private static final /* synthetic */ String EXPECTED_TYPES;
    
    static {
        lIlllIlIIIlllIl();
        lIlllIlIIIllIlI();
        EXPECTED_TYPES = String.valueOf(new StringBuilder().append(AbstractNioByteChannel.lIIIIlIllIIIII[AbstractNioByteChannel.lIIIIlIllIIIlI[0]]).append(StringUtil.simpleClassName(ByteBuf.class)).append(AbstractNioByteChannel.lIIIIlIllIIIII[AbstractNioByteChannel.lIIIIlIllIIIlI[5]]).append(StringUtil.simpleClassName(FileRegion.class)).append((char)AbstractNioByteChannel.lIIIIlIllIIIlI[6]));
    }
    
    private static boolean lIlllIlIIlIIlIl(final int lllllllllllllIlIIlIlIlIIlIIIlIlI, final int lllllllllllllIlIIlIlIlIIlIIIlIIl) {
        return lllllllllllllIlIIlIlIlIIlIIIlIlI == lllllllllllllIlIIlIlIlIIlIIIlIIl;
    }
    
    protected AbstractNioByteChannel(final Channel lllllllllllllIlIIlIlIlIlIlIllIlI, final SelectableChannel lllllllllllllIlIIlIlIlIlIlIlllII) {
        super(lllllllllllllIlIIlIlIlIlIlIllIlI, lllllllllllllIlIIlIlIlIlIlIlllII, AbstractNioByteChannel.lIIIIlIllIIIlI[0]);
    }
    
    @Override
    protected AbstractNioUnsafe newUnsafe() {
        return new NioByteUnsafe();
    }
    
    protected final void clearOpWrite() {
        final SelectionKey lllllllllllllIlIIlIlIlIIlIlllIlI = this.selectionKey();
        if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIIlIlllIlI.isValid() ? 1 : 0)) {
            return;
        }
        final int lllllllllllllIlIIlIlIlIIlIllIlll = lllllllllllllIlIIlIlIlIIlIlllIlI.interestOps();
        if (lIlllIlIIlIIIlI(lllllllllllllIlIIlIlIlIIlIllIlll & AbstractNioByteChannel.lIIIIlIllIIIlI[3])) {
            lllllllllllllIlIIlIlIlIIlIlllIlI.interestOps(lllllllllllllIlIIlIlIlIIlIllIlll & AbstractNioByteChannel.lIIIIlIllIIIlI[4]);
            "".length();
        }
    }
    
    protected abstract int doReadBytes(final ByteBuf p0) throws Exception;
    
    protected final void setOpWrite() {
        final SelectionKey lllllllllllllIlIIlIlIlIIllIIlllI = this.selectionKey();
        if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIIllIIlllI.isValid() ? 1 : 0)) {
            return;
        }
        final int lllllllllllllIlIIlIlIlIIllIIllIl = lllllllllllllIlIIlIlIlIIllIIlllI.interestOps();
        if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIIllIIllIl & AbstractNioByteChannel.lIIIIlIllIIIlI[3])) {
            lllllllllllllIlIIlIlIlIIllIIlllI.interestOps(lllllllllllllIlIIlIlIlIIllIIllIl | AbstractNioByteChannel.lIIIIlIllIIIlI[3]);
            "".length();
        }
    }
    
    private static void lIlllIlIIIlllIl() {
        (lIIIIlIllIIIlI = new int[9])[0] = " ".length();
        AbstractNioByteChannel.lIIIIlIllIIIlI[1] = -" ".length();
        AbstractNioByteChannel.lIIIIlIllIIIlI[2] = ((0x8B ^ 0x9C ^ (0x17 ^ 0x7)) & (64 + 131 - 101 + 39 ^ 122 + 107 - 111 + 12 ^ -" ".length()));
        AbstractNioByteChannel.lIIIIlIllIIIlI[3] = (95 + 160 - 123 + 39 ^ 135 + 147 - 198 + 91);
        AbstractNioByteChannel.lIIIIlIllIIIlI[4] = -(0xA7 ^ 0xA2);
        AbstractNioByteChannel.lIIIIlIllIIIlI[5] = "  ".length();
        AbstractNioByteChannel.lIIIIlIllIIIlI[6] = (0x62 ^ 0x4B);
        AbstractNioByteChannel.lIIIIlIllIIIlI[7] = "   ".length();
        AbstractNioByteChannel.lIIIIlIllIIIlI[8] = (0x81 ^ 0x89);
    }
    
    protected final void incompleteWrite(final boolean lllllllllllllIlIIlIlIlIIllIlllII) {
        if (lIlllIlIIlIIIlI(lllllllllllllIlIIlIlIlIIllIlllII ? 1 : 0)) {
            this.setOpWrite();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            Runnable lllllllllllllIlIIlIlIlIIlllIIIII = this.flushTask;
            if (lIlllIlIIlIIIIl(lllllllllllllIlIIlIlIlIIlllIIIII)) {
                final Runnable flushTask = new Runnable() {
                    @Override
                    public void run() {
                        AbstractNioByteChannel.this.flush();
                        "".length();
                    }
                };
                this.flushTask = flushTask;
                lllllllllllllIlIIlIlIlIIlllIIIII = flushTask;
            }
            this.eventLoop().execute(lllllllllllllIlIIlIlIlIIlllIIIII);
        }
    }
    
    private static boolean lIlllIlIIlIIIIl(final Object lllllllllllllIlIIlIlIlIIlIIIIlll) {
        return lllllllllllllIlIIlIlIlIIlIIIIlll == null;
    }
    
    private static boolean lIlllIlIIlIIIlI(final int lllllllllllllIlIIlIlIlIIlIIIIlIl) {
        return lllllllllllllIlIIlIlIlIIlIIIIlIl != 0;
    }
    
    private static int lIlllIlIIIlllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIlllIlIIIlIllI(final String lllllllllllllIlIIlIlIlIIlIlIIIlI, final String lllllllllllllIlIIlIlIlIIlIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIIlIIlllll.getBytes(StandardCharsets.UTF_8)), AbstractNioByteChannel.lIIIIlIllIIIlI[8]), "DES");
            final Cipher lllllllllllllIlIIlIlIlIIlIlIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIlIIlIlIIlII.init(AbstractNioByteChannel.lIIIIlIllIIIlI[5], lllllllllllllIlIIlIlIlIIlIlIIlIl);
            return new String(lllllllllllllIlIIlIlIlIIlIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIIlIlIIIll) {
            lllllllllllllIlIIlIlIlIIlIlIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected final Object filterOutboundMessage(final Object lllllllllllllIlIIlIlIlIIllllIIII) {
        if (lIlllIlIIlIIIlI((lllllllllllllIlIIlIlIlIIllllIIII instanceof ByteBuf) ? 1 : 0)) {
            final ByteBuf lllllllllllllIlIIlIlIlIIllllIIll = (ByteBuf)lllllllllllllIlIIlIlIlIIllllIIII;
            if (lIlllIlIIlIIIlI(lllllllllllllIlIIlIlIlIIllllIIll.isDirect() ? 1 : 0)) {
                return lllllllllllllIlIIlIlIlIIllllIIII;
            }
            return this.newDirectBuffer(lllllllllllllIlIIlIlIlIIllllIIll);
        }
        else {
            if (lIlllIlIIlIIIlI((lllllllllllllIlIIlIlIlIIllllIIII instanceof FileRegion) ? 1 : 0)) {
                return lllllllllllllIlIIlIlIlIIllllIIII;
            }
            throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(AbstractNioByteChannel.lIIIIlIllIIIII[AbstractNioByteChannel.lIIIIlIllIIIlI[2]]).append(StringUtil.simpleClassName(lllllllllllllIlIIlIlIlIIllllIIII)).append(AbstractNioByteChannel.EXPECTED_TYPES)));
        }
    }
    
    private static void lIlllIlIIIllIlI() {
        (lIIIIlIllIIIII = new String[AbstractNioByteChannel.lIIIIlIllIIIlI[7]])[AbstractNioByteChannel.lIIIIlIllIIIlI[2]] = lIlllIlIIIlIllI("DRcDAIupV7Xw9tyWkM+nxZnoL+2KWkd5jit4/p4fan0=", "ZdWmp");
        AbstractNioByteChannel.lIIIIlIllIIIII[AbstractNioByteChannel.lIIIIlIllIIIlI[0]] = lIlllIlIIIllIII("eL6Ofa6e/7cv8diH4x1rjw==", "Koffs");
        AbstractNioByteChannel.lIIIIlIllIIIII[AbstractNioByteChannel.lIIIIlIllIIIlI[5]] = lIlllIlIIIllIII("v7ET4s8Gcaw=", "Gvdlo");
    }
    
    @Override
    protected void doWrite(final ChannelOutboundBuffer lllllllllllllIlIIlIlIlIlIIIlIIlI) throws Exception {
        int lllllllllllllIlIIlIlIlIlIIIlIIIl = AbstractNioByteChannel.lIIIIlIllIIIlI[1];
        while (true) {
            final Object lllllllllllllIlIIlIlIlIlIIIlIlII = lllllllllllllIlIIlIlIlIlIIIlIIlI.current();
            if (lIlllIlIIlIIIIl(lllllllllllllIlIIlIlIlIlIIIlIlII)) {
                this.clearOpWrite();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                break;
            }
            else {
                if (lIlllIlIIlIIIlI((lllllllllllllIlIIlIlIlIlIIIlIlII instanceof ByteBuf) ? 1 : 0)) {
                    final ByteBuf lllllllllllllIlIIlIlIlIlIIlIIIlI = (ByteBuf)lllllllllllllIlIIlIlIlIlIIIlIlII;
                    final int lllllllllllllIlIIlIlIlIlIIlIIIII = lllllllllllllIlIIlIlIlIlIIlIIIlI.readableBytes();
                    if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIlIIlIIIII)) {
                        lllllllllllllIlIIlIlIlIlIIIlIIlI.remove();
                        "".length();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                    else {
                        boolean lllllllllllllIlIIlIlIlIlIIIlllIl = AbstractNioByteChannel.lIIIIlIllIIIlI[2] != 0;
                        boolean lllllllllllllIlIIlIlIlIlIIIlllII = AbstractNioByteChannel.lIIIIlIllIIIlI[2] != 0;
                        long lllllllllllllIlIIlIlIlIlIIIllIll = 0L;
                        if (lIlllIlIIlIIlIl(lllllllllllllIlIIlIlIlIlIIIlIIIl, AbstractNioByteChannel.lIIIIlIllIIIlI[1])) {
                            lllllllllllllIlIIlIlIlIlIIIlIIIl = this.config().getWriteSpinCount();
                        }
                        int lllllllllllllIlIIlIlIlIlIIlIIlII = lllllllllllllIlIIlIlIlIlIIIlIIIl - AbstractNioByteChannel.lIIIIlIllIIIlI[0];
                        while (lIlllIlIIlIIllI(lllllllllllllIlIIlIlIlIlIIlIIlII)) {
                            final int lllllllllllllIlIIlIlIlIlIIlIIllI = this.doWriteBytes(lllllllllllllIlIIlIlIlIlIIlIIIlI);
                            if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIlIIlIIllI)) {
                                lllllllllllllIlIIlIlIlIlIIIlllIl = (AbstractNioByteChannel.lIIIIlIllIIIlI[0] != 0);
                                "".length();
                                if ((0x89 ^ 0x8D) == 0x0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                lllllllllllllIlIIlIlIlIlIIIllIll += lllllllllllllIlIIlIlIlIlIIlIIllI;
                                if (lIlllIlIIlIIlII(lllllllllllllIlIIlIlIlIlIIlIIIlI.isReadable() ? 1 : 0)) {
                                    lllllllllllllIlIIlIlIlIlIIIlllII = (AbstractNioByteChannel.lIIIIlIllIIIlI[0] != 0);
                                    "".length();
                                    if (-"   ".length() >= 0) {
                                        return;
                                    }
                                    break;
                                }
                                else {
                                    --lllllllllllllIlIIlIlIlIlIIlIIlII;
                                    "".length();
                                    if (-"  ".length() > 0) {
                                        return;
                                    }
                                    continue;
                                }
                            }
                        }
                        lllllllllllllIlIIlIlIlIlIIIlIIlI.progress(lllllllllllllIlIIlIlIlIlIIIllIll);
                        if (lIlllIlIIlIIIlI(lllllllllllllIlIIlIlIlIlIIIlllII ? 1 : 0)) {
                            lllllllllllllIlIIlIlIlIlIIIlIIlI.remove();
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            this.incompleteWrite(lllllllllllllIlIIlIlIlIlIIIlllIl);
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                            break;
                        }
                    }
                }
                else {
                    if (!lIlllIlIIlIIIlI((lllllllllllllIlIIlIlIlIlIIIlIlII instanceof FileRegion) ? 1 : 0)) {
                        throw new Error();
                    }
                    final FileRegion lllllllllllllIlIIlIlIlIlIIIllIII = (FileRegion)lllllllllllllIlIIlIlIlIlIIIlIlII;
                    boolean lllllllllllllIlIIlIlIlIlIIIlIlll = AbstractNioByteChannel.lIIIIlIllIIIlI[2] != 0;
                    boolean lllllllllllllIlIIlIlIlIlIIIlIllI = AbstractNioByteChannel.lIIIIlIllIIIlI[2] != 0;
                    long lllllllllllllIlIIlIlIlIlIIIlIlIl = 0L;
                    if (lIlllIlIIlIIlIl(lllllllllllllIlIIlIlIlIlIIIlIIIl, AbstractNioByteChannel.lIIIIlIllIIIlI[1])) {
                        lllllllllllllIlIIlIlIlIlIIIlIIIl = this.config().getWriteSpinCount();
                    }
                    int lllllllllllllIlIIlIlIlIlIIIllIIl = lllllllllllllIlIIlIlIlIlIIIlIIIl - AbstractNioByteChannel.lIIIIlIllIIIlI[0];
                    while (lIlllIlIIlIIllI(lllllllllllllIlIIlIlIlIlIIIllIIl)) {
                        final long lllllllllllllIlIIlIlIlIlIIIllIlI = this.doWriteFileRegion(lllllllllllllIlIIlIlIlIlIIIllIII);
                        if (lIlllIlIIlIIlII(lIlllIlIIIlllll(lllllllllllllIlIIlIlIlIlIIIllIlI, 0L))) {
                            lllllllllllllIlIIlIlIlIlIIIlIlll = (AbstractNioByteChannel.lIIIIlIllIIIlI[0] != 0);
                            "".length();
                            if (" ".length() <= ((0x1D ^ 0x5) & ~(0x5E ^ 0x46))) {
                                return;
                            }
                            break;
                        }
                        else {
                            lllllllllllllIlIIlIlIlIlIIIlIlIl += lllllllllllllIlIIlIlIlIlIIIllIlI;
                            if (lIlllIlIIlIIllI(lIlllIlIIIlllll(lllllllllllllIlIIlIlIlIlIIIllIII.transfered(), lllllllllllllIlIIlIlIlIlIIIllIII.count()))) {
                                lllllllllllllIlIIlIlIlIlIIIlIllI = (AbstractNioByteChannel.lIIIIlIllIIIlI[0] != 0);
                                "".length();
                                if (-" ".length() != -" ".length()) {
                                    return;
                                }
                                break;
                            }
                            else {
                                --lllllllllllllIlIIlIlIlIlIIIllIIl;
                                "".length();
                                if (" ".length() < 0) {
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                    lllllllllllllIlIIlIlIlIlIIIlIIlI.progress(lllllllllllllIlIIlIlIlIlIIIlIlIl);
                    if (lIlllIlIIlIIIlI(lllllllllllllIlIIlIlIlIlIIIlIllI ? 1 : 0)) {
                        lllllllllllllIlIIlIlIlIlIIIlIIlI.remove();
                        "".length();
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                        "".length();
                        if (-(0xE ^ 0x2B ^ (0x7D ^ 0x5C)) > 0) {
                            return;
                        }
                    }
                    else {
                        this.incompleteWrite(lllllllllllllIlIIlIlIlIlIIIlIlll);
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                        break;
                    }
                }
                "".length();
                if (((0xFB ^ 0xA7) & ~(0x3C ^ 0x60)) > 0) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static String lIlllIlIIIllIII(final String lllllllllllllIlIIlIlIlIIlIIlIIlI, final String lllllllllllllIlIIlIlIlIIlIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIlIIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIlIIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIlIIlIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIlIIlIIlIlII.init(AbstractNioByteChannel.lIIIIlIllIIIlI[5], lllllllllllllIlIIlIlIlIIlIIlIlIl);
            return new String(lllllllllllllIlIIlIlIlIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIlIIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIlIIlIIlIIll) {
            lllllllllllllIlIIlIlIlIIlIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIlIIlIIlII(final int lllllllllllllIlIIlIlIlIIlIIIIIll) {
        return lllllllllllllIlIIlIlIlIIlIIIIIll == 0;
    }
    
    private static boolean lIlllIlIIlIIllI(final int lllllllllllllIlIIlIlIlIIlIIIIIIl) {
        return lllllllllllllIlIIlIlIlIIlIIIIIIl >= 0;
    }
    
    protected abstract int doWriteBytes(final ByteBuf p0) throws Exception;
    
    protected abstract long doWriteFileRegion(final FileRegion p0) throws Exception;
    
    private final class NioByteUnsafe extends AbstractNioUnsafe
    {
        private static final /* synthetic */ int[] llIlIIIIlIIlll;
        private /* synthetic */ RecvByteBufAllocator.Handle allocHandle;
        
        private static boolean lIIlIIIlIlIlIlIl(final int llllllllllllIllIllIllIIIIIIIllII, final int llllllllllllIllIllIllIIIIIIIlIll) {
            return llllllllllllIllIllIllIIIIIIIllII >= llllllllllllIllIllIllIIIIIIIlIll;
        }
        
        @Override
        public void read() {
            final ChannelConfig llllllllllllIllIllIllIIIIIlIlIll = AbstractNioByteChannel.this.config();
            if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlIll.isAutoRead() ? 1 : 0) && lIIlIIIlIlIlIIIl(AbstractNioByteChannel.this.isReadPending() ? 1 : 0)) {
                this.removeReadOp();
                return;
            }
            final ChannelPipeline llllllllllllIllIllIllIIIIIlIlIlI = AbstractNioByteChannel.this.pipeline();
            final ByteBufAllocator llllllllllllIllIllIllIIIIIlIlIIl = llllllllllllIllIllIllIIIIIlIlIll.getAllocator();
            final int llllllllllllIllIllIllIIIIIlIlIII = llllllllllllIllIllIllIIIIIlIlIll.getMaxMessagesPerRead();
            RecvByteBufAllocator.Handle llllllllllllIllIllIllIIIIIlIIlll = this.allocHandle;
            if (lIIlIIIlIlIlIIlI(llllllllllllIllIllIllIIIIIlIIlll)) {
                llllllllllllIllIllIllIIIIIlIIlll = (this.allocHandle = llllllllllllIllIllIllIIIIIlIlIll.getRecvByteBufAllocator().newHandle());
            }
            ByteBuf llllllllllllIllIllIllIIIIIlIIllI = null;
            int llllllllllllIllIllIllIIIIIlIIlIl = NioByteUnsafe.llIlIIIIlIIlll[1];
            boolean llllllllllllIllIllIllIIIIIlIIlII = NioByteUnsafe.llIlIIIIlIIlll[1] != 0;
            try {
                int llllllllllllIllIllIllIIIIIlIllll = NioByteUnsafe.llIlIIIIlIIlll[1];
                boolean llllllllllllIllIllIllIIIIIlIlllI = NioByteUnsafe.llIlIIIIlIIlll[1] != 0;
                do {
                    llllllllllllIllIllIllIIIIIlIIllI = llllllllllllIllIllIllIIIIIlIIlll.allocate(llllllllllllIllIllIllIIIIIlIlIIl);
                    final int llllllllllllIllIllIllIIIIIllIIIl = llllllllllllIllIllIllIIIIIlIIllI.writableBytes();
                    final int llllllllllllIllIllIllIIIIIllIIII = AbstractNioByteChannel.this.doReadBytes(llllllllllllIllIllIllIIIIIlIIllI);
                    if (lIIlIIIlIlIlIIll(llllllllllllIllIllIllIIIIIllIIII)) {
                        llllllllllllIllIllIllIIIIIlIIllI.release();
                        "".length();
                        int n;
                        if (lIIlIIIlIlIlIlII(llllllllllllIllIllIllIIIIIllIIII)) {
                            n = NioByteUnsafe.llIlIIIIlIIlll[2];
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        else {
                            n = NioByteUnsafe.llIlIIIIlIIlll[1];
                        }
                        llllllllllllIllIllIllIIIIIlIIlII = (n != 0);
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlllI ? 1 : 0)) {
                            llllllllllllIllIllIllIIIIIlIlllI = (NioByteUnsafe.llIlIIIIlIIlll[2] != 0);
                            AbstractNioByteChannel.this.setReadPending((boolean)(NioByteUnsafe.llIlIIIIlIIlll[1] != 0));
                        }
                        llllllllllllIllIllIllIIIIIlIlIlI.fireChannelRead(llllllllllllIllIllIllIIIIIlIIllI);
                        "".length();
                        llllllllllllIllIllIllIIIIIlIIllI = null;
                        if (lIIlIIIlIlIlIlIl(llllllllllllIllIllIllIIIIIlIllll, NioByteUnsafe.llIlIIIIlIIlll[3] - llllllllllllIllIllIllIIIIIllIIII)) {
                            llllllllllllIllIllIllIIIIIlIllll = NioByteUnsafe.llIlIIIIlIIlll[3];
                            "".length();
                            if ("  ".length() == " ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            llllllllllllIllIllIllIIIIIlIllll += llllllllllllIllIllIllIIIIIllIIII;
                            if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlIll.isAutoRead() ? 1 : 0)) {
                                "".length();
                                if (((0x12 ^ 0x71) & ~(0xD9 ^ 0xBA)) < 0) {
                                    return;
                                }
                                break;
                            }
                            else {
                                if (!lIIlIIIlIlIlIllI(llllllllllllIllIllIllIIIIIllIIII, llllllllllllIllIllIllIIIIIllIIIl)) {
                                    continue;
                                }
                                "".length();
                                if (" ".length() <= -" ".length()) {
                                    return;
                                }
                                break;
                            }
                        }
                    }
                } while (!lIIlIIIlIlIlIlIl(++llllllllllllIllIllIllIIIIIlIIlIl, llllllllllllIllIllIllIIIIIlIlIII));
                llllllllllllIllIllIllIIIIIlIlIlI.fireChannelReadComplete();
                "".length();
                llllllllllllIllIllIllIIIIIlIIlll.record(llllllllllllIllIllIllIIIIIlIllll);
                if (lIIlIIIlIlIIllll(llllllllllllIllIllIllIIIIIlIIlII ? 1 : 0)) {
                    this.closeOnRead(llllllllllllIllIllIllIIIIIlIlIlI);
                    llllllllllllIllIllIllIIIIIlIIlII = (NioByteUnsafe.llIlIIIIlIIlll[1] != 0);
                }
                if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlIll.isAutoRead() ? 1 : 0) && lIIlIIIlIlIlIIIl(AbstractNioByteChannel.this.isReadPending() ? 1 : 0)) {
                    this.removeReadOp();
                    "".length();
                    if (((0x54 ^ 0x65 ^ (0x82 ^ 0xA0)) & (19 + 19 + 2 + 95 ^ 141 + 65 - 193 + 135 ^ -" ".length())) == " ".length()) {
                        return;
                    }
                }
            }
            catch (Throwable llllllllllllIllIllIllIIIIIlIllIl) {
                this.handleReadException(llllllllllllIllIllIllIIIIIlIlIlI, llllllllllllIllIllIllIIIIIlIIllI, llllllllllllIllIllIllIIIIIlIllIl, llllllllllllIllIllIllIIIIIlIIlII);
                if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlIll.isAutoRead() ? 1 : 0) && lIIlIIIlIlIlIIIl(AbstractNioByteChannel.this.isReadPending() ? 1 : 0)) {
                    this.removeReadOp();
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
            }
            finally {
                if (lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIIlIlIll.isAutoRead() ? 1 : 0) && lIIlIIIlIlIlIIIl(AbstractNioByteChannel.this.isReadPending() ? 1 : 0)) {
                    this.removeReadOp();
                }
            }
        }
        
        private static boolean lIIlIIIlIlIIllll(final int llllllllllllIllIllIllIIIIIIIIIIl) {
            return llllllllllllIllIllIllIIIIIIIIIIl != 0;
        }
        
        static {
            lIIlIIIlIlIIlllI();
        }
        
        private void handleReadException(final ChannelPipeline llllllllllllIllIllIllIIIIlIIlIII, final ByteBuf llllllllllllIllIllIllIIIIlIIIIlI, final Throwable llllllllllllIllIllIllIIIIlIIIIIl, final boolean llllllllllllIllIllIllIIIIlIIIlIl) {
            if (lIIlIIIlIlIlIIII(llllllllllllIllIllIllIIIIlIIIIlI)) {
                if (lIIlIIIlIlIIllll(llllllllllllIllIllIllIIIIlIIIIlI.isReadable() ? 1 : 0)) {
                    AbstractNioByteChannel.this.setReadPending((boolean)(NioByteUnsafe.llIlIIIIlIIlll[1] != 0));
                    llllllllllllIllIllIllIIIIlIIlIII.fireChannelRead(llllllllllllIllIllIllIIIIlIIIIlI);
                    "".length();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIllIllIIIIlIIIIlI.release();
                    "".length();
                }
            }
            llllllllllllIllIllIllIIIIlIIlIII.fireChannelReadComplete();
            "".length();
            llllllllllllIllIllIllIIIIlIIlIII.fireExceptionCaught(llllllllllllIllIllIllIIIIlIIIIIl);
            "".length();
            if (!lIIlIIIlIlIlIIIl(llllllllllllIllIllIllIIIIlIIIlIl ? 1 : 0) || lIIlIIIlIlIIllll((llllllllllllIllIllIllIIIIlIIIIIl instanceof IOException) ? 1 : 0)) {
                this.closeOnRead(llllllllllllIllIllIllIIIIlIIlIII);
            }
        }
        
        private static boolean lIIlIIIlIlIlIIIl(final int llllllllllllIllIllIlIlllllllllll) {
            return llllllllllllIllIllIlIlllllllllll == 0;
        }
        
        private static boolean lIIlIIIlIlIlIllI(final int llllllllllllIllIllIllIIIIIIIlIII, final int llllllllllllIllIllIllIIIIIIIIlll) {
            return llllllllllllIllIllIllIIIIIIIlIII < llllllllllllIllIllIllIIIIIIIIlll;
        }
        
        private static boolean lIIlIIIlIlIlIIlI(final Object llllllllllllIllIllIllIIIIIIIIIll) {
            return llllllllllllIllIllIllIIIIIIIIIll == null;
        }
        
        private void closeOnRead(final ChannelPipeline llllllllllllIllIllIllIIIIlIlIIII) {
            final SelectionKey llllllllllllIllIllIllIIIIlIlIIlI = AbstractNioByteChannel.this.selectionKey();
            AbstractNioByteChannel.this.setInputShutdown();
            if (lIIlIIIlIlIIllll(AbstractNioByteChannel.this.isOpen() ? 1 : 0)) {
                if (lIIlIIIlIlIIllll(Boolean.TRUE.equals(AbstractNioByteChannel.this.config().getOption(ChannelOption.ALLOW_HALF_CLOSURE)) ? 1 : 0)) {
                    llllllllllllIllIllIllIIIIlIlIIlI.interestOps(llllllllllllIllIllIllIIIIlIlIIlI.interestOps() & (AbstractNioByteChannel.this.readInterestOp ^ NioByteUnsafe.llIlIIIIlIIlll[0]));
                    "".length();
                    llllllllllllIllIllIllIIIIlIlIIII.fireUserEventTriggered(ChannelInputShutdownEvent.INSTANCE);
                    "".length();
                    "".length();
                    if ((0x7C ^ 0x6C ^ (0xB1 ^ 0xA5)) == "  ".length()) {
                        return;
                    }
                }
                else {
                    this.close(this.voidPromise());
                }
            }
        }
        
        private static void lIIlIIIlIlIIlllI() {
            (llIlIIIIlIIlll = new int[4])[0] = -" ".length();
            NioByteUnsafe.llIlIIIIlIIlll[1] = ((42 + 90 - 104 + 136 ^ 25 + 152 - 162 + 176) & (0x6B ^ 0x18 ^ (0x7B ^ 0x13) ^ -" ".length()));
            NioByteUnsafe.llIlIIIIlIIlll[2] = " ".length();
            NioByteUnsafe.llIlIIIIlIIlll[3] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        }
        
        private static boolean lIIlIIIlIlIlIIll(final int llllllllllllIllIllIlIllllllllIll) {
            return llllllllllllIllIllIlIllllllllIll <= 0;
        }
        
        private static boolean lIIlIIIlIlIlIIII(final Object llllllllllllIllIllIllIIIIIIIIlIl) {
            return llllllllllllIllIllIllIIIIIIIIlIl != null;
        }
        
        private static boolean lIIlIIIlIlIlIlII(final int llllllllllllIllIllIlIlllllllllIl) {
            return llllllllllllIllIllIlIlllllllllIl < 0;
        }
    }
}
