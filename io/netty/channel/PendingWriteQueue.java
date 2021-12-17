// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.Recycler;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Arrays;
import io.netty.util.ReferenceCountUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;

public final class PendingWriteQueue
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lIlIlIlIIllIII;
    private static final /* synthetic */ String[] lIlIlIlIIlIllI;
    private /* synthetic */ int size;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ ChannelOutboundBuffer buffer;
    private /* synthetic */ PendingWrite tail;
    private final /* synthetic */ MessageSizeEstimator.Handle estimatorHandle;
    private final /* synthetic */ ChannelHandlerContext ctx;
    private /* synthetic */ PendingWrite head;
    
    public ChannelFuture removeAndWriteAll() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        PendingWrite lllllllllllllIIIlIIIIllIllIIlIIl = this.head;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllIIlIIl)) {
            return null;
        }
        if (lllIlllIIIIlIlI(this.size, PendingWriteQueue.lIlIlIlIIllIII[1])) {
            return this.removeAndWrite();
        }
        final ChannelPromise lllllllllllllIIIlIIIIllIllIIlIII = this.ctx.newPromise();
        final ChannelPromiseAggregator lllllllllllllIIIlIIIIllIllIIIlll = new ChannelPromiseAggregator(lllllllllllllIIIlIIIIllIllIIlIII);
        while (lllIlllIIIIlIIl(lllllllllllllIIIlIIIIllIllIIlIIl)) {
            final PendingWrite lllllllllllllIIIlIIIIllIllIIllIl = lllllllllllllIIIlIIIIllIllIIlIIl.next;
            final Object lllllllllllllIIIlIIIIllIllIIllII = lllllllllllllIIIlIIIIllIllIIlIIl.msg;
            final ChannelPromise lllllllllllllIIIlIIIIllIllIIlIll = lllllllllllllIIIlIIIIllIllIIlIIl.promise;
            this.recycle(lllllllllllllIIIlIIIIllIllIIlIIl);
            this.ctx.write(lllllllllllllIIIlIIIIllIllIIllII, lllllllllllllIIIlIIIIllIllIIlIll);
            "".length();
            final ChannelPromiseAggregator channelPromiseAggregator = lllllllllllllIIIlIIIIllIllIIIlll;
            final ChannelPromise[] lllllllllllllIlIllIIlIIlIIlllIII = new ChannelPromise[PendingWriteQueue.lIlIlIlIIllIII[1]];
            lllllllllllllIlIllIIlIIlIIlllIII[PendingWriteQueue.lIlIlIlIIllIII[0]] = lllllllllllllIIIlIIIIllIllIIlIll;
            channelPromiseAggregator.add(lllllllllllllIlIllIIlIIlIIlllIII);
            "".length();
            lllllllllllllIIIlIIIIllIllIIlIIl = lllllllllllllIIIlIIIIllIllIIllIl;
            "".length();
            if (((0x8F ^ 0xC0) & ~(0xD3 ^ 0x9C)) < 0) {
                return null;
            }
        }
        this.assertEmpty();
        return lllllllllllllIIIlIIIIllIllIIlIII;
    }
    
    public void add(final Object lllllllllllllIIIlIIIIllIllllIlII, final ChannelPromise lllllllllllllIIIlIIIIllIllllIIll) {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllllIlII)) {
            throw new NullPointerException(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[1]]);
        }
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllllIIll)) {
            throw new NullPointerException(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[2]]);
        }
        int lllllllllllllIIIlIIIIllIlllllIII = this.estimatorHandle.size(lllllllllllllIIIlIIIIllIllllIlII);
        if (lllIlllIIIIlIII(lllllllllllllIIIlIIIIllIlllllIII)) {
            lllllllllllllIIIlIIIIllIlllllIII = PendingWriteQueue.lIlIlIlIIllIII[0];
        }
        final PendingWrite lllllllllllllIIIlIIIIllIllllIlll = PendingWrite.newInstance(lllllllllllllIIIlIIIIllIllllIlII, lllllllllllllIIIlIIIIllIlllllIII, lllllllllllllIIIlIIIIllIllllIIll);
        final PendingWrite lllllllllllllIIIlIIIIllIllllIllI = this.tail;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllllIllI)) {
            final PendingWrite pendingWrite = lllllllllllllIIIlIIIIllIllllIlll;
            this.head = pendingWrite;
            this.tail = pendingWrite;
            "".length();
            if (-(0x42 ^ 0x46) >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIlIIIIllIllllIllI.next = lllllllllllllIIIlIIIIllIllllIlll;
            "".length();
            this.tail = lllllllllllllIIIlIIIIllIllllIlll;
        }
        this.size += PendingWriteQueue.lIlIlIlIIllIII[1];
        this.buffer.incrementPendingOutboundBytes(lllllllllllllIIIlIIIIllIllllIlll.size);
    }
    
    private static String lllIllIlllllIII(final String lllllllllllllIIIlIIIIllIIllIIllI, final String lllllllllllllIIIlIIIIllIIllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIllIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIllIIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIllIIllIlIII.init(PendingWriteQueue.lIlIlIlIIllIII[2], lllllllllllllIIIlIIIIllIIllIlIIl);
            return new String(lllllllllllllIIIlIIIIllIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIllIIllIIlll) {
            lllllllllllllIIIlIIIIllIIllIIlll.printStackTrace();
            return null;
        }
    }
    
    public void removeAndFailAll(final Throwable lllllllllllllIIIlIIIIllIlllIIlll) {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIlllIIlll)) {
            throw new NullPointerException(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[3]]);
        }
        PendingWrite lllllllllllllIIIlIIIIllIlllIIllI = this.head;
        while (lllIlllIIIIlIIl(lllllllllllllIIIlIIIIllIlllIIllI)) {
            final PendingWrite lllllllllllllIIIlIIIIllIlllIlIlI = lllllllllllllIIIlIIIIllIlllIIllI.next;
            ReferenceCountUtil.safeRelease(lllllllllllllIIIlIIIIllIlllIIllI.msg);
            final ChannelPromise lllllllllllllIIIlIIIIllIlllIlIIl = lllllllllllllIIIlIIIIllIlllIIllI.promise;
            this.recycle(lllllllllllllIIIlIIIIllIlllIIllI);
            safeFail(lllllllllllllIIIlIIIIllIlllIlIIl, lllllllllllllIIIlIIIIllIlllIIlll);
            lllllllllllllIIIlIIIIllIlllIIllI = lllllllllllllIIIlIIIIllIlllIlIlI;
            "".length();
            if ("  ".length() <= ((60 + 109 - 116 + 88 ^ 172 + 39 - 164 + 132) & (44 + 95 - 102 + 135 ^ 135 + 78 - 89 + 22 ^ -" ".length()))) {
                return;
            }
        }
        this.assertEmpty();
    }
    
    public ChannelFuture removeAndWrite() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        final PendingWrite lllllllllllllIIIlIIIIllIlIllIlll = this.head;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIlIllIlll)) {
            return null;
        }
        final Object lllllllllllllIIIlIIIIllIlIllIllI = lllllllllllllIIIlIIIIllIlIllIlll.msg;
        final ChannelPromise lllllllllllllIIIlIIIIllIlIllIlIl = lllllllllllllIIIlIIIIllIlIllIlll.promise;
        this.recycle(lllllllllllllIIIlIIIIllIlIllIlll);
        return this.ctx.write(lllllllllllllIIIlIIIIllIlIllIllI, lllllllllllllIIIlIIIIllIlIllIlIl);
    }
    
    public int size() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        return this.size;
    }
    
    private static boolean lllIlllIIIIIllI(final Object lllllllllllllIIIlIIIIllIIlIlIlIl) {
        return lllllllllllllIIIlIIIIllIIlIlIlIl == null;
    }
    
    private static String lllIllIlllllIIl(String lllllllllllllIIIlIIIIllIlIIIIIll, final String lllllllllllllIIIlIIIIllIlIIIIlll) {
        lllllllllllllIIIlIIIIllIlIIIIIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIllIlIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIllIlIIIIllI = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIllIlIIIIlIl = lllllllllllllIIIlIIIIllIlIIIIlll.toCharArray();
        int lllllllllllllIIIlIIIIllIlIIIIlII = PendingWriteQueue.lIlIlIlIIllIII[0];
        final Exception lllllllllllllIIIlIIIIllIIllllllI = (Object)((String)lllllllllllllIIIlIIIIllIlIIIIIll).toCharArray();
        final char lllllllllllllIIIlIIIIllIIlllllIl = (char)lllllllllllllIIIlIIIIllIIllllllI.length;
        byte lllllllllllllIIIlIIIIllIIlllllII = (byte)PendingWriteQueue.lIlIlIlIIllIII[0];
        while (lllIlllIIIIllIl(lllllllllllllIIIlIIIIllIIlllllII, lllllllllllllIIIlIIIIllIIlllllIl)) {
            final char lllllllllllllIIIlIIIIllIlIIIlIIl = lllllllllllllIIIlIIIIllIIllllllI[lllllllllllllIIIlIIIIllIIlllllII];
            lllllllllllllIIIlIIIIllIlIIIIllI.append((char)(lllllllllllllIIIlIIIIllIlIIIlIIl ^ lllllllllllllIIIlIIIIllIlIIIIlIl[lllllllllllllIIIlIIIIllIlIIIIlII % lllllllllllllIIIlIIIIllIlIIIIlIl.length]));
            "".length();
            ++lllllllllllllIIIlIIIIllIlIIIIlII;
            ++lllllllllllllIIIlIIIIllIIlllllII;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIllIlIIIIllI);
    }
    
    private void assertEmpty() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && (!lllIlllIIIIIllI(this.tail) || !lllIlllIIIIIllI(this.head) || lllIlllIIIIlIll(this.size))) {
            throw new AssertionError();
        }
    }
    
    private static boolean lllIlllIIIIlIll(final int lllllllllllllIIIlIIIIllIIlIlIIll) {
        return lllllllllllllIIIlIIIIllIIlIlIIll != 0;
    }
    
    private static boolean lllIlllIIIIlIII(final int lllllllllllllIIIlIIIIllIIlIIllll) {
        return lllllllllllllIIIlIIIIllIIlIIllll < 0;
    }
    
    public Object current() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        final PendingWrite lllllllllllllIIIlIIIIllIlIlIIlII = this.head;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIlIlIIlII)) {
            return null;
        }
        return lllllllllllllIIIlIIIIllIlIlIIlII.msg;
    }
    
    private static boolean lllIlllIIIIIlll(final int lllllllllllllIIIlIIIIllIIlIlIIIl) {
        return lllllllllllllIIIlIIIIllIIlIlIIIl == 0;
    }
    
    private static void safeFail(final ChannelPromise lllllllllllllIIIlIIIIllIlIIlIlII, final Throwable lllllllllllllIIIlIIIIllIlIIlIIll) {
        if (lllIlllIIIIIlll((lllllllllllllIIIlIIIIllIlIIlIlII instanceof VoidChannelPromise) ? 1 : 0) && lllIlllIIIIIlll(lllllllllllllIIIlIIIIllIlIIlIlII.tryFailure(lllllllllllllIIIlIIIIllIlIIlIIll) ? 1 : 0)) {
            PendingWriteQueue.logger.warn(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[5]], lllllllllllllIIIlIIIIllIlIIlIlII, lllllllllllllIIIlIIIIllIlIIlIIll);
        }
    }
    
    public ChannelPromise remove() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        final PendingWrite lllllllllllllIIIlIIIIllIlIlIllII = this.head;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIlIlIllII)) {
            return null;
        }
        final ChannelPromise lllllllllllllIIIlIIIIllIlIlIlIll = lllllllllllllIIIlIIIIllIlIlIllII.promise;
        ReferenceCountUtil.safeRelease(lllllllllllllIIIlIIIIllIlIlIllII.msg);
        this.recycle(lllllllllllllIIIlIIIIllIlIlIllII);
        return lllllllllllllIIIlIIIIllIlIlIlIll;
    }
    
    public PendingWriteQueue(final ChannelHandlerContext lllllllllllllIIIlIIIIlllIIIIlIlI) {
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIlllIIIIlIlI)) {
            throw new NullPointerException(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[0]]);
        }
        this.ctx = lllllllllllllIIIlIIIIlllIIIIlIlI;
        this.buffer = lllllllllllllIIIlIIIIlllIIIIlIlI.channel().unsafe().outboundBuffer();
        this.estimatorHandle = lllllllllllllIIIlIIIIlllIIIIlIlI.channel().config().getMessageSizeEstimator().newHandle();
    }
    
    private static boolean lllIlllIIIIllII(final int lllllllllllllIIIlIIIIllIIlIIllIl) {
        return lllllllllllllIIIlIIIIllIIlIIllIl <= 0;
    }
    
    private static boolean lllIlllIIIIllIl(final int lllllllllllllIIIlIIIIllIIlIllIlI, final int lllllllllllllIIIlIIIIllIIlIllIIl) {
        return lllllllllllllIIIlIIIIllIIlIllIlI < lllllllllllllIIIlIIIIllIIlIllIIl;
    }
    
    public boolean isEmpty() {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        int n;
        if (lllIlllIIIIIllI(this.head)) {
            n = PendingWriteQueue.lIlIlIlIIllIII[1];
            "".length();
            if ("   ".length() == "  ".length()) {
                return ((0x16 ^ 0x33) & ~(0xA4 ^ 0x81)) != 0x0;
            }
        }
        else {
            n = PendingWriteQueue.lIlIlIlIIllIII[0];
        }
        return n != 0;
    }
    
    private static boolean lllIlllIIIIlIIl(final Object lllllllllllllIIIlIIIIllIIlIlIlll) {
        return lllllllllllllIIIlIIIIllIIlIlIlll != null;
    }
    
    private static void lllIlllIIIIIlIl() {
        (lIlIlIlIIllIII = new int[8])[0] = ((0xF ^ 0x20) & ~(0x6C ^ 0x43));
        PendingWriteQueue.lIlIlIlIIllIII[1] = " ".length();
        PendingWriteQueue.lIlIlIlIIllIII[2] = "  ".length();
        PendingWriteQueue.lIlIlIlIIllIII[3] = "   ".length();
        PendingWriteQueue.lIlIlIlIIllIII[4] = (0x63 ^ 0x77 ^ (0x43 ^ 0x53));
        PendingWriteQueue.lIlIlIlIIllIII[5] = (0x14 ^ 0x66 ^ (0x6F ^ 0x18));
        PendingWriteQueue.lIlIlIlIIllIII[6] = (0x53 ^ 0x55);
        PendingWriteQueue.lIlIlIlIIllIII[7] = (0x7D ^ 0x42 ^ (0x43 ^ 0x74));
    }
    
    private static String lllIllIllllIlll(final String lllllllllllllIIIlIIIIllIIlllIIIl, final String lllllllllllllIIIlIIIIllIIlllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIllIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIllIIlllIIlI.getBytes(StandardCharsets.UTF_8)), PendingWriteQueue.lIlIlIlIIllIII[7]), "DES");
            final Cipher lllllllllllllIIIlIIIIllIIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIllIIlllIlIl.init(PendingWriteQueue.lIlIlIlIIllIII[2], lllllllllllllIIIlIIIIllIIlllIllI);
            return new String(lllllllllllllIIIlIIIIllIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIllIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIllIIlllIlII) {
            lllllllllllllIIIlIIIIllIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllIlllllIlI() {
        (lIlIlIlIIlIllI = new String[PendingWriteQueue.lIlIlIlIIllIII[6]])[PendingWriteQueue.lIlIlIlIIllIII[0]] = lllIllIllllIlll("d0ICz23XZTA=", "edAsi");
        PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[1]] = lllIllIllllIlll("198pkZ0Qqt0=", "cDWab");
        PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[2]] = lllIllIlllllIII("95IZn4gRsPw=", "nwBmF");
        PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[3]] = lllIllIlllllIII("X7BXbXWz3IY=", "XmZeh");
        PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[4]] = lllIllIllllIlll("6ugV+ILYdoA=", "pHDRi");
        PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[5]] = lllIllIlllllIIl("HAsvPzM+SjI8djcLNDh2O0o2ITk3AzU2djsZZjU3MwYzITN6CCMwNy8ZI3M/Lk01czI1BCNzNzYYIzIyI1BmKCs=", "ZjFSV");
    }
    
    public void removeAndFail(final Throwable lllllllllllllIIIlIIIIllIllIllIll) {
        if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIIlll(this.ctx.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllIllIll)) {
            throw new NullPointerException(PendingWriteQueue.lIlIlIlIIlIllI[PendingWriteQueue.lIlIlIlIIllIII[4]]);
        }
        final PendingWrite lllllllllllllIIIlIIIIllIllIllIlI = this.head;
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIllIllIlI)) {
            return;
        }
        ReferenceCountUtil.safeRelease(lllllllllllllIIIlIIIIllIllIllIlI.msg);
        final ChannelPromise lllllllllllllIIIlIIIIllIllIllIIl = lllllllllllllIIIlIIIIllIllIllIlI.promise;
        safeFail(lllllllllllllIIIlIIIIllIllIllIIl, lllllllllllllIIIlIIIIllIllIllIll);
        this.recycle(lllllllllllllIIIlIIIIllIllIllIlI);
    }
    
    private static boolean lllIlllIIIIlIlI(final int lllllllllllllIIIlIIIIllIIlIllllI, final int lllllllllllllIIIlIIIIllIIlIlllIl) {
        return lllllllllllllIIIlIIIIllIIlIllllI == lllllllllllllIIIlIIIIllIIlIlllIl;
    }
    
    private void recycle(final PendingWrite lllllllllllllIIIlIIIIllIlIIlllIl) {
        final PendingWrite lllllllllllllIIIlIIIIllIlIIlllII = lllllllllllllIIIlIIIIllIlIIlllIl.next;
        this.buffer.decrementPendingOutboundBytes(lllllllllllllIIIlIIIIllIlIIlllIl.size);
        lllllllllllllIIIlIIIIllIlIIlllIl.recycle();
        this.size -= PendingWriteQueue.lIlIlIlIIllIII[1];
        if (lllIlllIIIIIllI(lllllllllllllIIIlIIIIllIlIIlllII)) {
            final PendingWrite pendingWrite = null;
            this.tail = pendingWrite;
            this.head = pendingWrite;
            if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIlIll(this.size)) {
                throw new AssertionError();
            }
        }
        else {
            this.head = lllllllllllllIIIlIIIIllIlIIlllII;
            if (lllIlllIIIIIlll(PendingWriteQueue.$assertionsDisabled ? 1 : 0) && lllIlllIIIIllII(this.size)) {
                throw new AssertionError();
            }
        }
    }
    
    static {
        lllIlllIIIIIlIl();
        lllIllIlllllIlI();
        int $assertionsDisabled2;
        if (lllIlllIIIIIlll(PendingWriteQueue.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PendingWriteQueue.lIlIlIlIIllIII[1];
            "".length();
            if (-(98 + 83 - 173 + 149 ^ 146 + 125 - 127 + 8) >= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PendingWriteQueue.lIlIlIlIIllIII[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(PendingWriteQueue.class);
    }
    
    static final class PendingWrite
    {
        private /* synthetic */ PendingWrite next;
        private /* synthetic */ ChannelPromise promise;
        private static final /* synthetic */ Recycler<PendingWrite> RECYCLER;
        private /* synthetic */ long size;
        private /* synthetic */ Object msg;
        private final /* synthetic */ Recycler.Handle handle;
        
        static {
            RECYCLER = new Recycler<PendingWrite>() {
                @Override
                protected PendingWrite newObject(final Handle llllllllllllIlllIIlIIlIlllIllllI) {
                    return new PendingWrite(llllllllllllIlllIIlIIlIlllIllllI);
                }
            };
        }
        
        private void recycle() {
            this.size = 0L;
            this.next = null;
            this.msg = null;
            this.promise = null;
            PendingWrite.RECYCLER.recycle(this, this.handle);
            "".length();
        }
        
        private PendingWrite(final Recycler.Handle lllllllllllllIlIlllIIllIIIlIIlll) {
            this.handle = lllllllllllllIlIlllIIllIIIlIIlll;
        }
        
        static PendingWrite newInstance(final Object lllllllllllllIlIlllIIllIIIIllIII, final int lllllllllllllIlIlllIIllIIIIlIlll, final ChannelPromise lllllllllllllIlIlllIIllIIIIlllII) {
            final PendingWrite lllllllllllllIlIlllIIllIIIIllIlI = PendingWrite.RECYCLER.get();
            lllllllllllllIlIlllIIllIIIIllIlI.size = lllllllllllllIlIlllIIllIIIIlIlll;
            lllllllllllllIlIlllIIllIIIIllIlI.msg = lllllllllllllIlIlllIIllIIIIllIII;
            lllllllllllllIlIlllIIllIIIIllIlI.promise = lllllllllllllIlIlllIIllIIIIlllII;
            return lllllllllllllIlIlllIIllIIIIllIlI;
        }
    }
}
