// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.Unpooled;
import io.netty.util.Recycler;
import java.nio.channels.ClosedChannelException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.internal.InternalThreadLocalMap;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.logging.InternalLogger;
import java.nio.ByteBuffer;
import io.netty.util.concurrent.FastThreadLocal;

public final class ChannelOutboundBuffer
{
    private static final /* synthetic */ FastThreadLocal<ByteBuffer[]> NIO_BUFFERS;
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ long nioBufferSize;
    private static final /* synthetic */ String[] lllIllIlllIlll;
    private /* synthetic */ Entry tailEntry;
    private /* synthetic */ Entry flushedEntry;
    private final /* synthetic */ Channel channel;
    private /* synthetic */ boolean inFail;
    private volatile /* synthetic */ long totalPendingSize;
    private /* synthetic */ int flushed;
    private static final /* synthetic */ AtomicIntegerFieldUpdater<ChannelOutboundBuffer> WRITABLE_UPDATER;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ int[] lllIllIllllIII;
    private /* synthetic */ Entry unflushedEntry;
    private volatile /* synthetic */ int writable;
    private /* synthetic */ int nioBufferCount;
    private static final /* synthetic */ AtomicLongFieldUpdater<ChannelOutboundBuffer> TOTAL_PENDING_SIZE_UPDATER;
    
    private static long total(final Object llllllllllllIlIllIIIlIllIlIlIIlI) {
        if (lIlIIlIlIlIIllll((llllllllllllIlIllIIIlIllIlIlIIlI instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)llllllllllllIlIllIIIlIllIlIlIIlI).readableBytes();
        }
        if (lIlIIlIlIlIIllll((llllllllllllIlIllIIIlIllIlIlIIlI instanceof FileRegion) ? 1 : 0)) {
            return ((FileRegion)llllllllllllIlIllIIIlIllIlIlIIlI).count();
        }
        if (lIlIIlIlIlIIllll((llllllllllllIlIllIIIlIllIlIlIIlI instanceof ByteBufHolder) ? 1 : 0)) {
            return ((ByteBufHolder)llllllllllllIlIllIIIlIllIlIlIIlI).content().readableBytes();
        }
        return -1L;
    }
    
    public void addFlush() {
        Entry llllllllllllIlIllIIIlIllIllIllII = this.unflushedEntry;
        if (lIlIIlIlIlIIlIll(llllllllllllIlIllIIIlIllIllIllII)) {
            if (lIlIIlIlIlIIlIlI(this.flushedEntry)) {
                this.flushedEntry = llllllllllllIlIllIIIlIllIllIllII;
            }
            do {
                this.flushed += ChannelOutboundBuffer.lllIllIllllIII[0];
                if (lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIllIllIllII.promise.setUncancellable() ? 1 : 0)) {
                    final int llllllllllllIlIllIIIlIllIllIlllI = llllllllllllIlIllIIIlIllIllIllII.cancel();
                    this.decrementPendingOutboundBytes(llllllllllllIlIllIIIlIllIllIlllI);
                }
                llllllllllllIlIllIIIlIllIllIllII = llllllllllllIlIllIIIlIllIllIllII.next;
            } while (!lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIllIllIllII));
            this.unflushedEntry = null;
        }
    }
    
    static {
        lIlIIlIlIlIIlIIl();
        lIlIIlIlIlIIlIII();
        int $assertionsDisabled2;
        if (lIlIIlIlIlIIllII(ChannelOutboundBuffer.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = ChannelOutboundBuffer.lllIllIllllIII[0];
            "".length();
            if ("  ".length() == ((0x70 ^ 0x64) & ~(0x91 ^ 0x85))) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = ChannelOutboundBuffer.lllIllIllllIII[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(ChannelOutboundBuffer.class);
        NIO_BUFFERS = new FastThreadLocal<ByteBuffer[]>() {
            private static final /* synthetic */ int[] lIIIIIIllIlIIl;
            
            @Override
            protected ByteBuffer[] initialValue() throws Exception {
                return new ByteBuffer[ChannelOutboundBuffer$1.lIIIIIIllIlIIl[0]];
            }
            
            static {
                lIllIlIIlIlllII();
            }
            
            private static void lIllIlIIlIlllII() {
                (lIIIIIIllIlIIl = new int[1])[0] = (0xFFFF84D5 & 0x7F2A);
            }
        };
        AtomicIntegerFieldUpdater<ChannelOutboundBuffer> llllllllllllIlIllIIIlIlIIlllIIll = PlatformDependent.newAtomicIntegerFieldUpdater(ChannelOutboundBuffer.class, ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[6]]);
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIIlllIIll)) {
            llllllllllllIlIllIIIlIlIIlllIIll = AtomicIntegerFieldUpdater.newUpdater(ChannelOutboundBuffer.class, ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[7]]);
        }
        WRITABLE_UPDATER = llllllllllllIlIllIIIlIlIIlllIIll;
        AtomicLongFieldUpdater<ChannelOutboundBuffer> llllllllllllIlIllIIIlIlIIlllIIlI = PlatformDependent.newAtomicLongFieldUpdater(ChannelOutboundBuffer.class, ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[8]]);
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIIlllIIlI)) {
            llllllllllllIlIllIIIlIlIIlllIIlI = AtomicLongFieldUpdater.newUpdater(ChannelOutboundBuffer.class, ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[9]]);
        }
        TOTAL_PENDING_SIZE_UPDATER = llllllllllllIlIllIIIlIlIIlllIIlI;
    }
    
    public Object current() {
        final Entry llllllllllllIlIllIIIlIllIlIIlIlI = this.flushedEntry;
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIllIlIIlIlI)) {
            return null;
        }
        return llllllllllllIlIllIIIlIllIlIIlIlI.msg;
    }
    
    private static void lIlIIlIlIlIIlIIl() {
        (lllIllIllllIII = new int[11])[0] = " ".length();
        ChannelOutboundBuffer.lllIllIllllIII[1] = ((0x39 ^ 0x73 ^ (0xC1 ^ 0xAA)) & (149 + 190 - 171 + 23 ^ 148 + 8 - 37 + 39 ^ -" ".length()));
        ChannelOutboundBuffer.lllIllIllllIII[2] = -" ".length();
        ChannelOutboundBuffer.lllIllIllllIII[3] = "  ".length();
        ChannelOutboundBuffer.lllIllIllllIII[4] = "   ".length();
        ChannelOutboundBuffer.lllIllIllllIII[5] = (101 + 101 - 191 + 118 ^ 40 + 88 - 91 + 96);
        ChannelOutboundBuffer.lllIllIllllIII[6] = (0x50 ^ 0x55);
        ChannelOutboundBuffer.lllIllIllllIII[7] = (79 + 43 - 117 + 128 ^ 118 + 45 - 82 + 50);
        ChannelOutboundBuffer.lllIllIllllIII[8] = (0x22 ^ 0x25);
        ChannelOutboundBuffer.lllIllIllllIII[9] = (0x68 ^ 0x52 ^ (0x4D ^ 0x7F));
        ChannelOutboundBuffer.lllIllIllllIII[10] = (0xA5 ^ 0xAC);
    }
    
    private static int fillBufferArray(final ByteBuffer[] llllllllllllIlIllIIIlIlIllIIllll, final ByteBuffer[] llllllllllllIlIllIIIlIlIllIIlllI, int llllllllllllIlIllIIIlIlIllIIlIlI) {
        final ByteBuffer[] llllllllllllIlIllIIIlIlIllIlIIlI = llllllllllllIlIllIIIlIlIllIIllll;
        final int llllllllllllIlIllIIIlIlIllIlIIIl = llllllllllllIlIllIIIlIlIllIlIIlI.length;
        int llllllllllllIlIllIIIlIlIllIlIIII = ChannelOutboundBuffer.lllIllIllllIII[1];
        while (lIlIIlIlIlIlIlll(llllllllllllIlIllIIIlIlIllIlIIII, llllllllllllIlIllIIIlIlIllIlIIIl)) {
            final ByteBuffer llllllllllllIlIllIIIlIlIllIlIIll = llllllllllllIlIllIIIlIlIllIlIIlI[llllllllllllIlIllIIIlIlIllIlIIII];
            if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIllIlIIll)) {
                "".length();
                if (null != null) {
                    return (0x29 ^ 0x3E) & ~(0xD6 ^ 0xC1);
                }
                break;
            }
            else {
                llllllllllllIlIllIIIlIlIllIIlllI[llllllllllllIlIllIIIlIlIllIIlIlI++] = llllllllllllIlIllIIIlIlIllIlIIll;
                ++llllllllllllIlIllIIIlIlIllIlIIII;
                "".length();
                if ("   ".length() == ((0xB9 ^ 0xB7 ^ (0xDA ^ 0xC1)) & (107 + 77 - 177 + 146 ^ 40 + 57 - 59 + 102 ^ -" ".length()))) {
                    return (0x5 ^ 0x63 ^ (0x34 ^ 0x77)) & (0xBE ^ 0x86 ^ (0x58 ^ 0x45) ^ -" ".length());
                }
                continue;
            }
        }
        return llllllllllllIlIllIIIlIlIllIIlIlI;
    }
    
    private static boolean lIlIIlIlIlIIlllI(final int llllllllllllIlIllIIIlIlIIIIlIlIl) {
        return llllllllllllIlIllIIIlIlIIIIlIlIl > 0;
    }
    
    public void progress(final long llllllllllllIlIllIIIlIllIlIIIIII) {
        final Entry llllllllllllIlIllIIIlIllIIllllll = this.flushedEntry;
        if (lIlIIlIlIlIIllII(ChannelOutboundBuffer.$assertionsDisabled ? 1 : 0) && lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIllIIllllll)) {
            throw new AssertionError();
        }
        final ChannelPromise llllllllllllIlIllIIIlIllIIlllllI = llllllllllllIlIllIIIlIllIIllllll.promise;
        if (lIlIIlIlIlIIllll((llllllllllllIlIllIIIlIllIIlllllI instanceof ChannelProgressivePromise) ? 1 : 0)) {
            final long llllllllllllIlIllIIIlIllIlIIIIlI = llllllllllllIlIllIIIlIllIIllllll.progress + llllllllllllIlIllIIIlIllIlIIIIII;
            llllllllllllIlIllIIIlIllIIllllll.progress = llllllllllllIlIllIIIlIllIlIIIIlI;
            ((ChannelProgressivePromise)llllllllllllIlIllIIIlIllIIlllllI).tryProgress(llllllllllllIlIllIIIlIllIlIIIIlI, llllllllllllIlIllIIIlIllIIllllll.total);
            "".length();
        }
    }
    
    public long nioBufferSize() {
        return this.nioBufferSize;
    }
    
    boolean isWritable() {
        int n;
        if (lIlIIlIlIlIIllll(this.writable)) {
            n = ChannelOutboundBuffer.lllIllIllllIII[0];
            "".length();
            if (-" ".length() > 0) {
                return ((0x14 ^ 0xA ^ (0x3 ^ 0x3E)) & (123 + 117 - 230 + 124 ^ 150 + 64 - 134 + 85 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ChannelOutboundBuffer.lllIllIllllIII[1];
        }
        return n != 0;
    }
    
    private static String lIlIIlIlIlIIIllI(String llllllllllllIlIllIIIlIlIIlIIIIll, final String llllllllllllIlIllIIIlIlIIlIIIIlI) {
        llllllllllllIlIllIIIlIlIIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIlIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIlIlIIlIIIllI = new StringBuilder();
        final char[] llllllllllllIlIllIIIlIlIIlIIIlIl = llllllllllllIlIllIIIlIlIIlIIIIlI.toCharArray();
        int llllllllllllIlIllIIIlIlIIlIIIlII = ChannelOutboundBuffer.lllIllIllllIII[1];
        final int llllllllllllIlIllIIIlIlIIIlllllI = (Object)llllllllllllIlIllIIIlIlIIlIIIIll.toCharArray();
        final short llllllllllllIlIllIIIlIlIIIllllIl = (short)llllllllllllIlIllIIIlIlIIIlllllI.length;
        int llllllllllllIlIllIIIlIlIIIllllII = ChannelOutboundBuffer.lllIllIllllIII[1];
        while (lIlIIlIlIlIlIlll(llllllllllllIlIllIIIlIlIIIllllII, llllllllllllIlIllIIIlIlIIIllllIl)) {
            final char llllllllllllIlIllIIIlIlIIlIIlIIl = llllllllllllIlIllIIIlIlIIIlllllI[llllllllllllIlIllIIIlIlIIIllllII];
            llllllllllllIlIllIIIlIlIIlIIIllI.append((char)(llllllllllllIlIllIIIlIlIIlIIlIIl ^ llllllllllllIlIllIIIlIlIIlIIIlIl[llllllllllllIlIllIIIlIlIIlIIIlII % llllllllllllIlIllIIIlIlIIlIIIlIl.length]));
            "".length();
            ++llllllllllllIlIllIIIlIlIIlIIIlII;
            ++llllllllllllIlIllIIIlIlIIIllllII;
            "".length();
            if (-(86 + 119 - 90 + 54 ^ 66 + 87 - 64 + 83) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIlIlIIlIIIllI);
    }
    
    void decrementPendingOutboundBytes(final long llllllllllllIlIllIIIlIllIlIllIll) {
        if (lIlIIlIlIlIIllII(lIlIIlIlIlIlIIII(llllllllllllIlIllIIIlIllIlIllIll, 0L))) {
            return;
        }
        final long llllllllllllIlIllIIIlIllIlIllIlI = ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, -llllllllllllIlIllIIIlIllIlIllIll);
        if ((!lIlIIlIlIlIIllll(lIlIIlIlIlIlIIII(llllllllllllIlIllIIIlIllIlIllIlI, 0L)) || lIlIIlIlIlIlIIIl(lIlIIlIlIlIlIIII(llllllllllllIlIllIIIlIllIlIllIlI, this.channel.config().getWriteBufferLowWaterMark()))) && lIlIIlIlIlIIllll(ChannelOutboundBuffer.WRITABLE_UPDATER.compareAndSet(this, ChannelOutboundBuffer.lllIllIllllIII[1], ChannelOutboundBuffer.lllIllIllllIII[0]) ? 1 : 0)) {
            this.channel.pipeline().fireChannelWritabilityChanged();
            "".length();
        }
    }
    
    public void addMessage(final Object llllllllllllIlIllIIIlIllIlllIllI, final int llllllllllllIlIllIIIlIllIllllIlI, final ChannelPromise llllllllllllIlIllIIIlIllIllllIIl) {
        final Entry llllllllllllIlIllIIIlIllIllllIII = Entry.newInstance(llllllllllllIlIllIIIlIllIlllIllI, llllllllllllIlIllIIIlIllIllllIlI, total(llllllllllllIlIllIIIlIllIlllIllI), llllllllllllIlIllIIIlIllIllllIIl);
        if (lIlIIlIlIlIIlIlI(this.tailEntry)) {
            this.flushedEntry = null;
            this.tailEntry = llllllllllllIlIllIIIlIllIllllIII;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            final Entry llllllllllllIlIllIIIlIllIlllllIl = this.tailEntry;
            llllllllllllIlIllIIIlIllIlllllIl.next = llllllllllllIlIllIIIlIllIllllIII;
            this.tailEntry = llllllllllllIlIllIIIlIllIllllIII;
        }
        if (lIlIIlIlIlIIlIlI(this.unflushedEntry)) {
            this.unflushedEntry = llllllllllllIlIllIIIlIllIllllIII;
        }
        this.incrementPendingOutboundBytes(llllllllllllIlIllIIIlIllIllllIlI);
    }
    
    public ByteBuffer[] nioBuffers() {
        long llllllllllllIlIllIIIlIlIlllIlIll = 0L;
        int llllllllllllIlIllIIIlIlIlllIlIlI = ChannelOutboundBuffer.lllIllIllllIII[1];
        final InternalThreadLocalMap llllllllllllIlIllIIIlIlIlllIlIIl = InternalThreadLocalMap.get();
        ByteBuffer[] llllllllllllIlIllIIIlIlIlllIlIII = ChannelOutboundBuffer.NIO_BUFFERS.get(llllllllllllIlIllIIIlIlIlllIlIIl);
        Entry llllllllllllIlIllIIIlIlIlllIIlll = this.flushedEntry;
        while (lIlIIlIlIlIIllll(this.isFlushedEntry(llllllllllllIlIllIIIlIlIlllIIlll) ? 1 : 0) && lIlIIlIlIlIIllll((llllllllllllIlIllIIIlIlIlllIIlll.msg instanceof ByteBuf) ? 1 : 0)) {
            if (lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIlllIIlll.cancelled ? 1 : 0)) {
                final ByteBuf llllllllllllIlIllIIIlIlIlllIllll = (ByteBuf)llllllllllllIlIllIIIlIlIlllIIlll.msg;
                final int llllllllllllIlIllIIIlIlIlllIlllI = llllllllllllIlIllIIIlIlIlllIllll.readerIndex();
                final int llllllllllllIlIllIIIlIlIlllIllIl = llllllllllllIlIllIIIlIlIlllIllll.writerIndex() - llllllllllllIlIllIIIlIlIlllIlllI;
                if (lIlIIlIlIlIIlllI(llllllllllllIlIllIIIlIlIlllIllIl)) {
                    llllllllllllIlIllIIIlIlIlllIlIll += llllllllllllIlIllIIIlIlIlllIllIl;
                    int llllllllllllIlIllIIIlIlIllllIIIl = llllllllllllIlIllIIIlIlIlllIIlll.count;
                    if (lIlIIlIlIlIlIlIl(llllllllllllIlIllIIIlIlIllllIIIl, ChannelOutboundBuffer.lllIllIllllIII[2])) {
                        llllllllllllIlIllIIIlIlIllllIIIl = (llllllllllllIlIllIIIlIlIlllIIlll.count = llllllllllllIlIllIIIlIlIlllIllll.nioBufferCount());
                    }
                    final int llllllllllllIlIllIIIlIlIllllIIII = llllllllllllIlIllIIIlIlIlllIlIlI + llllllllllllIlIllIIIlIlIllllIIIl;
                    if (lIlIIlIlIlIlIllI(llllllllllllIlIllIIIlIlIllllIIII, llllllllllllIlIllIIIlIlIlllIlIII.length)) {
                        llllllllllllIlIllIIIlIlIlllIlIII = expandNioBufferArray(llllllllllllIlIllIIIlIlIlllIlIII, llllllllllllIlIllIIIlIlIllllIIII, llllllllllllIlIllIIIlIlIlllIlIlI);
                        ChannelOutboundBuffer.NIO_BUFFERS.set(llllllllllllIlIllIIIlIlIlllIlIIl, llllllllllllIlIllIIIlIlIlllIlIII);
                    }
                    if (lIlIIlIlIlIlIlIl(llllllllllllIlIllIIIlIlIllllIIIl, ChannelOutboundBuffer.lllIllIllllIII[0])) {
                        ByteBuffer llllllllllllIlIllIIIlIlIllllIIll = llllllllllllIlIllIIIlIlIlllIIlll.buf;
                        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIllllIIll)) {
                            llllllllllllIlIllIIIlIlIllllIIll = (llllllllllllIlIllIIIlIlIlllIIlll.buf = llllllllllllIlIllIIIlIlIlllIllll.internalNioBuffer(llllllllllllIlIllIIIlIlIlllIlllI, llllllllllllIlIllIIIlIlIlllIllIl));
                        }
                        llllllllllllIlIllIIIlIlIlllIlIII[llllllllllllIlIllIIIlIlIlllIlIlI++] = llllllllllllIlIllIIIlIlIllllIIll;
                        "".length();
                        if ("  ".length() == 0) {
                            return null;
                        }
                    }
                    else {
                        ByteBuffer[] llllllllllllIlIllIIIlIlIllllIIlI = llllllllllllIlIllIIIlIlIlllIIlll.bufs;
                        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIllllIIlI)) {
                            llllllllllllIlIllIIIlIlIllllIIlI = (llllllllllllIlIllIIIlIlIlllIIlll.bufs = llllllllllllIlIllIIIlIlIlllIllll.nioBuffers());
                        }
                        llllllllllllIlIllIIIlIlIlllIlIlI = fillBufferArray(llllllllllllIlIllIIIlIlIllllIIlI, llllllllllllIlIllIIIlIlIlllIlIII, llllllllllllIlIllIIIlIlIlllIlIlI);
                    }
                }
            }
            llllllllllllIlIllIIIlIlIlllIIlll = llllllllllllIlIllIIIlIlIlllIIlll.next;
            "".length();
            if (-(120 + 19 - 13 + 68 ^ 181 + 58 - 112 + 71) > 0) {
                return null;
            }
        }
        this.nioBufferCount = llllllllllllIlIllIIIlIlIlllIlIlI;
        this.nioBufferSize = llllllllllllIlIllIIIlIlIlllIlIll;
        return llllllllllllIlIllIIIlIlIlllIlIII;
    }
    
    public boolean isEmpty() {
        int n;
        if (lIlIIlIlIlIIllII(this.flushed)) {
            n = ChannelOutboundBuffer.lllIllIllllIII[0];
            "".length();
            if (((71 + 81 - 110 + 119 ^ 105 + 133 - 122 + 31) & (209 + 203 - 306 + 135 ^ 63 + 22 - 59 + 169 ^ -" ".length())) > 0) {
                return ((0x70 ^ 0x20 ^ (0x55 ^ 0x2C)) & (71 + 80 - 143 + 120 ^ 130 + 21 - 81 + 99 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ChannelOutboundBuffer.lllIllIllllIII[1];
        }
        return n != 0;
    }
    
    public boolean remove(final Throwable llllllllllllIlIllIIIlIllIIlIIIlI) {
        final Entry llllllllllllIlIllIIIlIllIIlIIIIl = this.flushedEntry;
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIllIIlIIIIl)) {
            return ChannelOutboundBuffer.lllIllIllllIII[1] != 0;
        }
        final Object llllllllllllIlIllIIIlIllIIlIIIII = llllllllllllIlIllIIIlIllIIlIIIIl.msg;
        final ChannelPromise llllllllllllIlIllIIIlIllIIIlllll = llllllllllllIlIllIIIlIllIIlIIIIl.promise;
        final int llllllllllllIlIllIIIlIllIIIllllI = llllllllllllIlIllIIIlIllIIlIIIIl.pendingSize;
        this.removeEntry(llllllllllllIlIllIIIlIllIIlIIIIl);
        if (lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIllIIlIIIIl.cancelled ? 1 : 0)) {
            ReferenceCountUtil.safeRelease(llllllllllllIlIllIIIlIllIIlIIIII);
            safeFail(llllllllllllIlIllIIIlIllIIIlllll, llllllllllllIlIllIIIlIllIIlIIIlI);
            this.decrementPendingOutboundBytes(llllllllllllIlIllIIIlIllIIIllllI);
        }
        llllllllllllIlIllIIIlIllIIlIIIIl.recycle();
        return ChannelOutboundBuffer.lllIllIllllIII[0] != 0;
    }
    
    ChannelOutboundBuffer(final AbstractChannel llllllllllllIlIllIIIlIlllIIIIllI) {
        this.writable = ChannelOutboundBuffer.lllIllIllllIII[0];
        this.channel = llllllllllllIlIllIIIlIlllIIIIllI;
    }
    
    private static boolean lIlIIlIlIlIIllll(final int llllllllllllIlIllIIIlIlIIIIlllIl) {
        return llllllllllllIlIllIIIlIlIIIIlllIl != 0;
    }
    
    private static boolean lIlIIlIlIlIIlIlI(final Object llllllllllllIlIllIIIlIlIIIIlllll) {
        return llllllllllllIlIllIIIlIlIIIIlllll == null;
    }
    
    private static boolean lIlIIlIlIlIlIIIl(final int llllllllllllIlIllIIIlIlIIIIllIIl) {
        return llllllllllllIlIllIIIlIlIIIIllIIl < 0;
    }
    
    private void removeEntry(final Entry llllllllllllIlIllIIIlIllIIIlIIlI) {
        final int n = this.flushed - ChannelOutboundBuffer.lllIllIllllIII[0];
        this.flushed = n;
        if (lIlIIlIlIlIIllII(n)) {
            this.flushedEntry = null;
            if (lIlIIlIlIlIlIIlI(llllllllllllIlIllIIIlIllIIIlIIlI, this.tailEntry)) {
                this.tailEntry = null;
                this.unflushedEntry = null;
                "".length();
                if (((108 + 92 - 175 + 129 ^ 160 + 125 - 138 + 28) & (0x90 ^ 0xA8 ^ (0xAF ^ 0xA2) ^ -" ".length())) >= "   ".length()) {
                    return;
                }
            }
        }
        else {
            this.flushedEntry = llllllllllllIlIllIIIlIllIIIlIIlI.next;
        }
    }
    
    private static void safeSuccess(final ChannelPromise llllllllllllIlIllIIIlIlIlIIlIIII) {
        if (lIlIIlIlIlIIllII((llllllllllllIlIllIIIlIlIlIIlIIII instanceof VoidChannelPromise) ? 1 : 0) && lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIlIIlIIII.trySuccess() ? 1 : 0)) {
            ChannelOutboundBuffer.logger.warn(ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[3]], llllllllllllIlIllIIIlIlIlIIlIIII);
        }
    }
    
    private static boolean lIlIIlIlIlIlIlll(final int llllllllllllIlIllIIIlIlIIIllIlII, final int llllllllllllIlIllIIIlIlIIIllIIll) {
        return llllllllllllIlIllIIIlIlIIIllIlII < llllllllllllIlIllIIIlIlIIIllIIll;
    }
    
    private static boolean lIlIIlIlIlIlIlII(final int llllllllllllIlIllIIIlIlIIIIlIlll) {
        return llllllllllllIlIllIIIlIlIIIIlIlll <= 0;
    }
    
    private static boolean lIlIIlIlIlIlIlIl(final int llllllllllllIlIllIIIlIlIIIlllIII, final int llllllllllllIlIllIIIlIlIIIllIlll) {
        return llllllllllllIlIllIIIlIlIIIlllIII == llllllllllllIlIllIIIlIlIIIllIlll;
    }
    
    public boolean remove() {
        final Entry llllllllllllIlIllIIIlIllIIllIIlI = this.flushedEntry;
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIllIIllIIlI)) {
            return ChannelOutboundBuffer.lllIllIllllIII[1] != 0;
        }
        final Object llllllllllllIlIllIIIlIllIIllIIIl = llllllllllllIlIllIIIlIllIIllIIlI.msg;
        final ChannelPromise llllllllllllIlIllIIIlIllIIllIIII = llllllllllllIlIllIIIlIllIIllIIlI.promise;
        final int llllllllllllIlIllIIIlIllIIlIllll = llllllllllllIlIllIIIlIllIIllIIlI.pendingSize;
        this.removeEntry(llllllllllllIlIllIIIlIllIIllIIlI);
        if (lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIllIIllIIlI.cancelled ? 1 : 0)) {
            ReferenceCountUtil.safeRelease(llllllllllllIlIllIIIlIllIIllIIIl);
            safeSuccess(llllllllllllIlIllIIIlIllIIllIIII);
            this.decrementPendingOutboundBytes(llllllllllllIlIllIIIlIllIIlIllll);
        }
        llllllllllllIlIllIIIlIllIIllIIlI.recycle();
        return ChannelOutboundBuffer.lllIllIllllIII[0] != 0;
    }
    
    private static void safeFail(final ChannelPromise llllllllllllIlIllIIIlIlIlIIIllII, final Throwable llllllllllllIlIllIIIlIlIlIIIlIIl) {
        if (lIlIIlIlIlIIllII((llllllllllllIlIllIIIlIlIlIIIllII instanceof VoidChannelPromise) ? 1 : 0) && lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIlIIIllII.tryFailure(llllllllllllIlIllIIIlIlIlIIIlIIl) ? 1 : 0)) {
            ChannelOutboundBuffer.logger.warn(ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[4]], llllllllllllIlIllIIIlIlIlIIIllII, llllllllllllIlIllIIIlIlIlIIIlIIl);
        }
    }
    
    private static boolean lIlIIlIlIlIlIllI(final int llllllllllllIlIllIIIlIlIIIlIllII, final int llllllllllllIlIllIIIlIlIIIlIlIll) {
        return llllllllllllIlIllIIIlIlIIIlIllII > llllllllllllIlIllIIIlIlIIIlIlIll;
    }
    
    private static int lIlIIlIlIlIlIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static ByteBuffer[] expandNioBufferArray(final ByteBuffer[] llllllllllllIlIllIIIlIlIlIlllIll, final int llllllllllllIlIllIIIlIlIlIlllIlI, final int llllllllllllIlIllIIIlIlIlIlllllI) {
        int llllllllllllIlIllIIIlIlIlIllllIl = llllllllllllIlIllIIIlIlIlIlllIll.length;
        do {
            llllllllllllIlIllIIIlIlIlIllllIl <<= ChannelOutboundBuffer.lllIllIllllIII[0];
            if (lIlIIlIlIlIlIIIl(llllllllllllIlIllIIIlIlIlIllllIl)) {
                throw new IllegalStateException();
            }
        } while (!lIlIIlIlIlIllIII(llllllllllllIlIllIIIlIlIlIlllIlI, llllllllllllIlIllIIIlIlIlIllllIl));
        final ByteBuffer[] llllllllllllIlIllIIIlIlIlIllllII = new ByteBuffer[llllllllllllIlIllIIIlIlIlIllllIl];
        System.arraycopy(llllllllllllIlIllIIIlIlIlIlllIll, ChannelOutboundBuffer.lllIllIllllIII[1], llllllllllllIlIllIIIlIlIlIllllII, ChannelOutboundBuffer.lllIllIllllIII[1], llllllllllllIlIllIIIlIlIlIlllllI);
        return llllllllllllIlIllIIIlIlIlIllllII;
    }
    
    public void forEachFlushedMessage(final MessageProcessor llllllllllllIlIllIIIlIlIIlllllIl) throws Exception {
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIIlllllIl)) {
            throw new NullPointerException(ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[5]]);
        }
        Entry llllllllllllIlIllIIIlIlIIlllllll = this.flushedEntry;
        if (lIlIIlIlIlIIlIlI(llllllllllllIlIllIIIlIlIIlllllll)) {
            return;
        }
        while (!lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIIlllllll.cancelled ? 1 : 0) || !lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIIlllllIl.processMessage(llllllllllllIlIllIIIlIlIIlllllll.msg) ? 1 : 0)) {
            llllllllllllIlIllIIIlIlIIlllllll = llllllllllllIlIllIIIlIlIIlllllll.next;
            if (lIlIIlIlIlIIllII(this.isFlushedEntry(llllllllllllIlIllIIIlIlIIlllllll) ? 1 : 0)) {
                return;
            }
        }
    }
    
    private static boolean lIlIIlIlIlIllIII(final int llllllllllllIlIllIIIlIlIIIllIIII, final int llllllllllllIlIllIIIlIlIIIlIllll) {
        return llllllllllllIlIllIIIlIlIIIllIIII <= llllllllllllIlIllIIIlIlIIIlIllll;
    }
    
    public void removeBytes(long llllllllllllIlIllIIIlIllIIIIIlII) {
        do {
            final Object llllllllllllIlIllIIIlIllIIIIlIll = this.current();
            if (lIlIIlIlIlIIllII((llllllllllllIlIllIIIlIllIIIIlIll instanceof ByteBuf) ? 1 : 0)) {
                if (lIlIIlIlIlIIllII(ChannelOutboundBuffer.$assertionsDisabled ? 1 : 0) && lIlIIlIlIlIIllll(lIlIIlIlIlIlIIll(llllllllllllIlIllIIIlIllIIIIIlII, 0L))) {
                    throw new AssertionError();
                }
            }
            else {
                final ByteBuf llllllllllllIlIllIIIlIllIIIIlIlI = (ByteBuf)llllllllllllIlIllIIIlIllIIIIlIll;
                final int llllllllllllIlIllIIIlIllIIIIlIIl = llllllllllllIlIllIIIlIllIIIIlIlI.readerIndex();
                final int llllllllllllIlIllIIIlIllIIIIlIII = llllllllllllIlIllIIIlIllIIIIlIlI.writerIndex() - llllllllllllIlIllIIIlIllIIIIlIIl;
                if (lIlIIlIlIlIlIlII(lIlIIlIlIlIlIIll(llllllllllllIlIllIIIlIllIIIIlIII, llllllllllllIlIllIIIlIllIIIIIlII))) {
                    if (lIlIIlIlIlIIllll(lIlIIlIlIlIlIIll(llllllllllllIlIllIIIlIllIIIIIlII, 0L))) {
                        this.progress(llllllllllllIlIllIIIlIllIIIIlIII);
                        llllllllllllIlIllIIIlIllIIIIIlII -= llllllllllllIlIllIIIlIllIIIIlIII;
                    }
                    this.remove();
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    "".length();
                    continue;
                }
                else if (lIlIIlIlIlIIllll(lIlIIlIlIlIlIIll(llllllllllllIlIllIIIlIllIIIIIlII, 0L))) {
                    llllllllllllIlIllIIIlIllIIIIlIlI.readerIndex(llllllllllllIlIllIIIlIllIIIIlIIl + (int)llllllllllllIlIllIIIlIllIIIIIlII);
                    "".length();
                    this.progress(llllllllllllIlIllIIIlIllIIIIIlII);
                    "".length();
                    if ((0xB ^ 0xC ^ "   ".length()) <= " ".length()) {
                        return;
                    }
                }
            }
        } while (-" ".length() <= (86 + 130 - 123 + 40 ^ 1 + 46 + 11 + 71));
    }
    
    private static boolean lIlIIlIlIlIlIIlI(final Object llllllllllllIlIllIIIlIlIIIlIIIlI, final Object llllllllllllIlIllIIIlIlIIIlIIIIl) {
        return llllllllllllIlIllIIIlIlIIIlIIIlI == llllllllllllIlIllIIIlIlIIIlIIIIl;
    }
    
    public long totalPendingWriteBytes() {
        return this.totalPendingSize;
    }
    
    private static void lIlIIlIlIlIIlIII() {
        (lllIllIlllIlll = new String[ChannelOutboundBuffer.lllIllIllllIII[10]])[ChannelOutboundBuffer.lllIllIllllIII[1]] = lIlIIlIlIlIIIllI("CCk/ETVDbHAPJRgxcAA1Syw+FD8AIDRCMQ0xNRBwHy01QjMDJD4MNQdlORFwCCk/ETUPaw==", "kEPbP");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[0]] = lIlIIlIlIlIIIllI("BC0OJiBPaEE4MBQ1QTcgRygPIyoMJAV1JAE1BCdlBi0NdSMLNBI9IANhFicsEyQSdSQVJEE9JAklDTAhSQ==", "gAaUE");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[3]] = lIlIIlIlIlIIIllI("FCgkAwI2aTkARz8oPwRHM2k9HQg/ID4KRzM6bRwSMSooHBRyKygMBic6KE8OJmkkHEc2JiMKRzMlPwoGNjB3Txwv", "RIMog");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[4]] = lIlIIlIlIlIIIlll("y05/Ra4qnwU0FjtIMEkUHYnLqU2aL1ciBHzpZjedc0wswM76IkFLC/P2PmT0Rz3keocfK/0vN1EdJpWF6igZqKhhNSqheFrA", "jyjzG");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[5]] = lIlIIlIlIlIIIlll("yikSQu71SdqXvGJ+7mmK9g==", "HXFda");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[6]] = lIlIIlIlIlIIIlll("zbheWrnq+5JhKW5MRRvJMA==", "vvlbH");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[7]] = lIlIIlIlIlIIIlll("s1uKc4Camd6W4dWa+V0q8Q==", "dLEul");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[8]] = lIlIIlIlIlIIIlll("xOfOAR/A3BYlCbUYuyd4CGVV4l7+nLz2", "YgPud");
        ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[9]] = lIlIIlIlIlIIIllI("JRcnCjYBHT0PMz8fAAIgNA==", "QxSkZ");
    }
    
    private static boolean lIlIIlIlIlIIlIll(final Object llllllllllllIlIllIIIlIlIIIlIIlIl) {
        return llllllllllllIlIllIIIlIlIIIlIIlIl != null;
    }
    
    private static int lIlIIlIlIlIIllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    void incrementPendingOutboundBytes(final long llllllllllllIlIllIIIlIllIllIIIIl) {
        if (lIlIIlIlIlIIllII(lIlIIlIlIlIIllIl(llllllllllllIlIllIIIlIllIllIIIIl, 0L))) {
            return;
        }
        final long llllllllllllIlIllIIIlIllIllIIIll = ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, llllllllllllIlIllIIIlIllIllIIIIl);
        if (lIlIIlIlIlIIlllI(lIlIIlIlIlIIllIl(llllllllllllIlIllIIIlIllIllIIIll, this.channel.config().getWriteBufferHighWaterMark())) && lIlIIlIlIlIIllll(ChannelOutboundBuffer.WRITABLE_UPDATER.compareAndSet(this, ChannelOutboundBuffer.lllIllIllllIII[0], ChannelOutboundBuffer.lllIllIllllIII[1]) ? 1 : 0)) {
            this.channel.pipeline().fireChannelWritabilityChanged();
            "".length();
        }
    }
    
    private static boolean lIlIIlIlIlIlllII(final Object llllllllllllIlIllIIIlIlIIIlIlIII, final Object llllllllllllIlIllIIIlIlIIIlIIlll) {
        return llllllllllllIlIllIIIlIlIIIlIlIII != llllllllllllIlIllIIIlIlIIIlIIlll;
    }
    
    private static int lIlIIlIlIlIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIlIIlIlIlIIIlll(final String llllllllllllIlIllIIIlIlIIlIlllIl, final String llllllllllllIlIllIIIlIlIIlIlllll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIlIlIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIlIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), ChannelOutboundBuffer.lllIllIllllIII[9]), "DES");
            final Cipher llllllllllllIlIllIIIlIlIIllIIIll = Cipher.getInstance("DES");
            llllllllllllIlIllIIIlIlIIllIIIll.init(ChannelOutboundBuffer.lllIllIllllIII[3], llllllllllllIlIllIIIlIlIIllIIlII);
            return new String(llllllllllllIlIllIIIlIlIIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIlIlIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIlIlIIllIIIlI) {
            llllllllllllIlIllIIIlIlIIllIIIlI.printStackTrace();
            return null;
        }
    }
    
    public int nioBufferCount() {
        return this.nioBufferCount;
    }
    
    void close(final ClosedChannelException llllllllllllIlIllIIIlIlIlIIlIlll) {
        if (lIlIIlIlIlIIllll(this.inFail ? 1 : 0)) {
            this.channel.eventLoop().execute(new Runnable() {
                @Override
                public void run() {
                    ChannelOutboundBuffer.this.close(llllllllllllIlIllIIIlIlIlIIlIlll);
                }
            });
            return;
        }
        this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[0] != 0);
        if (lIlIIlIlIlIIllll(this.channel.isOpen() ? 1 : 0)) {
            throw new IllegalStateException(ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[1]]);
        }
        if (lIlIIlIlIlIIllII(this.isEmpty() ? 1 : 0)) {
            throw new IllegalStateException(ChannelOutboundBuffer.lllIllIlllIlll[ChannelOutboundBuffer.lllIllIllllIII[0]]);
        }
        try {
            Entry llllllllllllIlIllIIIlIlIlIIllIIl = this.unflushedEntry;
            while (lIlIIlIlIlIIlIll(llllllllllllIlIllIIIlIlIlIIllIIl)) {
                final int llllllllllllIlIllIIIlIlIlIIllIlI = llllllllllllIlIllIIIlIlIlIIllIIl.pendingSize;
                ChannelOutboundBuffer.TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, -llllllllllllIlIllIIIlIlIlIIllIlI);
                if (lIlIIlIlIlIIllII(llllllllllllIlIllIIIlIlIlIIllIIl.cancelled ? 1 : 0)) {
                    ReferenceCountUtil.safeRelease(llllllllllllIlIllIIIlIlIlIIllIIl.msg);
                    safeFail(llllllllllllIlIllIIIlIlIlIIllIIl.promise, llllllllllllIlIllIIIlIlIlIIlIlll);
                }
                llllllllllllIlIllIIIlIlIlIIllIIl = llllllllllllIlIllIIIlIlIlIIllIIl.recycleAndGetNext();
                "".length();
                if ((0xAD ^ 0xA9) < ((0x3E ^ 0x18) & ~(0xA3 ^ 0x85))) {
                    return;
                }
            }
            this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[1] != 0);
            "".length();
            if (((0x4D ^ 0x1C) & ~(0x75 ^ 0x24)) != 0x0) {
                return;
            }
        }
        finally {
            this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[1] != 0);
        }
    }
    
    private static boolean lIlIIlIlIlIIllII(final int llllllllllllIlIllIIIlIlIIIIllIll) {
        return llllllllllllIlIllIIIlIlIIIIllIll == 0;
    }
    
    void failFlushed(final Throwable llllllllllllIlIllIIIlIlIlIlIIIIl) {
        if (lIlIIlIlIlIIllll(this.inFail ? 1 : 0)) {
            return;
        }
        try {
            this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[0] != 0);
            while (!lIlIIlIlIlIIllII(this.remove(llllllllllllIlIllIIIlIlIlIlIIIIl) ? 1 : 0)) {}
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) == "  ".length()) {
                return;
            }
            this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[1] != 0);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        finally {
            this.inFail = (ChannelOutboundBuffer.lllIllIllllIII[1] != 0);
        }
    }
    
    @Deprecated
    public void recycle() {
    }
    
    private boolean isFlushedEntry(final Entry llllllllllllIlIllIIIlIlIIlllIllI) {
        int n;
        if (lIlIIlIlIlIIlIll(llllllllllllIlIllIIIlIlIIlllIllI) && lIlIIlIlIlIlllII(llllllllllllIlIllIIIlIlIIlllIllI, this.unflushedEntry)) {
            n = ChannelOutboundBuffer.lllIllIllllIII[0];
            "".length();
            if (null != null) {
                return ((0x39 ^ 0x58 ^ (0x24 ^ 0x19)) & (0xF9 ^ 0x9B ^ (0x11 ^ 0x2F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ChannelOutboundBuffer.lllIllIllllIII[1];
        }
        return n != 0;
    }
    
    public int size() {
        return this.flushed;
    }
    
    static final class Entry
    {
        /* synthetic */ ChannelPromise promise;
        /* synthetic */ Object msg;
        /* synthetic */ Entry next;
        private static final /* synthetic */ int[] llIIlllIIllIlI;
        /* synthetic */ long progress;
        private final /* synthetic */ Recycler.Handle handle;
        /* synthetic */ long total;
        /* synthetic */ boolean cancelled;
        /* synthetic */ ByteBuffer[] bufs;
        private static final /* synthetic */ Recycler<Entry> RECYCLER;
        /* synthetic */ int count;
        /* synthetic */ int pendingSize;
        /* synthetic */ ByteBuffer buf;
        
        private static boolean lIIIllllIlllllII(final int llllllllllllIllIlllllIIIlIIIlIIl) {
            return llllllllllllIllIlllllIIIlIIIlIIl == 0;
        }
        
        private Entry(final Recycler.Handle llllllllllllIllIlllllIIIlIllIIII) {
            this.count = Entry.llIIlllIIllIlI[0];
            this.handle = llllllllllllIllIlllllIIIlIllIIII;
        }
        
        static Entry newInstance(final Object llllllllllllIllIlllllIIIlIlIIlIl, final int llllllllllllIllIlllllIIIlIlIlIIl, final long llllllllllllIllIlllllIIIlIlIlIII, final ChannelPromise llllllllllllIllIlllllIIIlIlIIlll) {
            final Entry llllllllllllIllIlllllIIIlIlIIllI = Entry.RECYCLER.get();
            llllllllllllIllIlllllIIIlIlIIllI.msg = llllllllllllIllIlllllIIIlIlIIlIl;
            llllllllllllIllIlllllIIIlIlIIllI.pendingSize = llllllllllllIllIlllllIIIlIlIlIIl;
            llllllllllllIllIlllllIIIlIlIIllI.total = llllllllllllIllIlllllIIIlIlIlIII;
            llllllllllllIllIlllllIIIlIlIIllI.promise = llllllllllllIllIlllllIIIlIlIIlll;
            return llllllllllllIllIlllllIIIlIlIIllI;
        }
        
        private static void lIIIllllIllllIll() {
            (llIIlllIIllIlI = new int[3])[0] = -" ".length();
            Entry.llIIlllIIllIlI[1] = " ".length();
            Entry.llIIlllIIllIlI[2] = ((27 + 136 - 155 + 179 ^ 158 + 110 - 178 + 70) & (0x64 ^ 0x6E ^ (0x51 ^ 0x40) ^ -" ".length()));
        }
        
        static {
            lIIIllllIllllIll();
            RECYCLER = new Recycler<Entry>() {
                @Override
                protected Entry newObject(final Handle lllllllllllllIIIlIIIlllllllIlllI) {
                    return new Entry(lllllllllllllIIIlIIIlllllllIlllI);
                }
            };
        }
        
        void recycle() {
            this.next = null;
            this.bufs = null;
            this.buf = null;
            this.msg = null;
            this.promise = null;
            this.progress = 0L;
            this.total = 0L;
            this.pendingSize = Entry.llIIlllIIllIlI[2];
            this.count = Entry.llIIlllIIllIlI[0];
            this.cancelled = (Entry.llIIlllIIllIlI[2] != 0);
            Entry.RECYCLER.recycle(this, this.handle);
            "".length();
        }
        
        Entry recycleAndGetNext() {
            final Entry llllllllllllIllIlllllIIIlIIlIlII = this.next;
            this.recycle();
            return llllllllllllIllIlllllIIIlIIlIlII;
        }
        
        int cancel() {
            if (lIIIllllIlllllII(this.cancelled ? 1 : 0)) {
                this.cancelled = (Entry.llIIlllIIllIlI[1] != 0);
                final int llllllllllllIllIlllllIIIlIIllllI = this.pendingSize;
                ReferenceCountUtil.safeRelease(this.msg);
                this.msg = Unpooled.EMPTY_BUFFER;
                this.pendingSize = Entry.llIIlllIIllIlI[2];
                this.total = 0L;
                this.progress = 0L;
                this.bufs = null;
                this.buf = null;
                return llllllllllllIllIlllllIIIlIIllllI;
            }
            return Entry.llIIlllIIllIlI[2];
        }
    }
    
    public interface MessageProcessor
    {
        boolean processMessage(final Object p0) throws Exception;
    }
}
