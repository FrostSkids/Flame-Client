// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;
import java.nio.channels.ClosedChannelException;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.logging.InternalLogger;
import java.util.Queue;
import io.netty.channel.ChannelDuplexHandler;

public class ChunkedWriteHandler extends ChannelDuplexHandler
{
    private final /* synthetic */ Queue<PendingWrite> queue;
    private static final /* synthetic */ String[] llIIIlIllIIIlI;
    private static final /* synthetic */ InternalLogger logger;
    private volatile /* synthetic */ ChannelHandlerContext ctx;
    private /* synthetic */ PendingWrite currentWrite;
    private static final /* synthetic */ int[] llIIIlIllIIlII;
    
    private static boolean lIIIlIIllIIllIll(final int llllllllllllIlllIlIlIllIIIlllIII, final int llllllllllllIlllIlIlIllIIIllIlll) {
        return llllllllllllIlllIlIlIllIIIlllIII < llllllllllllIlllIlIlIllIIIllIlll;
    }
    
    @Override
    public void flush(final ChannelHandlerContext llllllllllllIlllIlIlIllIlIllIIIl) throws Exception {
        final Channel llllllllllllIlllIlIlIllIlIllIIll = llllllllllllIlllIlIlIllIlIllIIIl.channel();
        if (!lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIlIllIIll.isWritable() ? 1 : 0) || lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIlIllIIll.isActive() ? 1 : 0)) {
            this.doFlush(llllllllllllIlllIlIlIllIlIllIIIl);
        }
    }
    
    static {
        lIIIlIIllIIlIlIl();
        lIIIlIIllIIIlIII();
        logger = InternalLoggerFactory.getInstance(ChunkedWriteHandler.class);
    }
    
    @Deprecated
    public ChunkedWriteHandler(final int llllllllllllIlllIlIlIllIllIlIIlI) {
        this.queue = new ArrayDeque<PendingWrite>();
        if (lIIIlIIllIIlIllI(llllllllllllIlllIlIlIllIllIlIIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[0]]).append(llllllllllllIlllIlIlIllIllIlIIlI).append(ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[1]])));
        }
    }
    
    private static String lIIIlIIllIIIIlll(final String llllllllllllIlllIlIlIllIIlIllIII, final String llllllllllllIlllIlIlIllIIlIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIllIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), ChunkedWriteHandler.llIIIlIllIIlII[6]), "DES");
            final Cipher llllllllllllIlllIlIlIllIIlIllIlI = Cipher.getInstance("DES");
            llllllllllllIlllIlIlIllIIlIllIlI.init(ChunkedWriteHandler.llIIIlIllIIlII[2], llllllllllllIlllIlIlIllIIlIllIll);
            return new String(llllllllllllIlllIlIlIllIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIllIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIllIIlIllIIl) {
            llllllllllllIlllIlIlIllIIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static int amount(final Object llllllllllllIlllIlIlIllIIllIIllI) {
        if (lIIIlIIllIIllIII((llllllllllllIlllIlIlIllIIllIIllI instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)llllllllllllIlllIlIlIllIIllIIllI).readableBytes();
        }
        if (lIIIlIIllIIllIII((llllllllllllIlllIlIlIllIIllIIllI instanceof ByteBufHolder) ? 1 : 0)) {
            return ((ByteBufHolder)llllllllllllIlllIlIlIllIIllIIllI).content().readableBytes();
        }
        return ChunkedWriteHandler.llIIIlIllIIlII[1];
    }
    
    private static String lIIIlIIllIIIIllI(String llllllllllllIlllIlIlIllIIlIIIIll, final String llllllllllllIlllIlIlIllIIlIIIlll) {
        llllllllllllIlllIlIlIllIIlIIIIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIlIllIIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIlIllIIlIIIllI = new StringBuilder();
        final char[] llllllllllllIlllIlIlIllIIlIIIlIl = llllllllllllIlllIlIlIllIIlIIIlll.toCharArray();
        int llllllllllllIlllIlIlIllIIlIIIlII = ChunkedWriteHandler.llIIIlIllIIlII[0];
        final char llllllllllllIlllIlIlIllIIIlllllI = (Object)((String)llllllllllllIlllIlIlIllIIlIIIIll).toCharArray();
        final byte llllllllllllIlllIlIlIllIIIllllIl = (byte)llllllllllllIlllIlIlIllIIIlllllI.length;
        float llllllllllllIlllIlIlIllIIIllllII = ChunkedWriteHandler.llIIIlIllIIlII[0];
        while (lIIIlIIllIIllIll((int)llllllllllllIlllIlIlIllIIIllllII, llllllllllllIlllIlIlIllIIIllllIl)) {
            final char llllllllllllIlllIlIlIllIIlIIlIIl = llllllllllllIlllIlIlIllIIIlllllI[llllllllllllIlllIlIlIllIIIllllII];
            llllllllllllIlllIlIlIllIIlIIIllI.append((char)(llllllllllllIlllIlIlIllIIlIIlIIl ^ llllllllllllIlllIlIlIllIIlIIIlIl[llllllllllllIlllIlIlIllIIlIIIlII % llllllllllllIlllIlIlIllIIlIIIlIl.length]));
            "".length();
            ++llllllllllllIlllIlIlIllIIlIIIlII;
            ++llllllllllllIlllIlIlIllIIIllllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIlIllIIlIIIllI);
    }
    
    private void doFlush(final ChannelHandlerContext llllllllllllIlllIlIlIllIIllllIll) throws Exception {
        final Channel llllllllllllIlllIlIlIllIIllllIlI = llllllllllllIlllIlIlIllIIllllIll.channel();
        if (lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIIllllIlI.isActive() ? 1 : 0)) {
            this.discard(null);
            return;
        }
        while (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIIllllIlI.isWritable() ? 1 : 0)) {
            if (lIIIlIIllIIlIlll(this.currentWrite)) {
                this.currentWrite = this.queue.poll();
            }
            if (lIIIlIIllIIlIlll(this.currentWrite)) {
                "".length();
                if (-(0x12 ^ 0x2A ^ (0x3E ^ 0x3)) >= 0) {
                    return;
                }
                break;
            }
            else {
                final PendingWrite llllllllllllIlllIlIlIllIIllllllI = this.currentWrite;
                final Object llllllllllllIlllIlIlIllIIlllllIl = llllllllllllIlllIlIlIllIIllllllI.msg;
                if (lIIIlIIllIIllIII((llllllllllllIlllIlIlIllIIlllllIl instanceof ChunkedInput) ? 1 : 0)) {
                    final ChunkedInput<?> llllllllllllIlllIlIlIllIlIIIIlII = (ChunkedInput<?>)llllllllllllIlllIlIlIllIIlllllIl;
                    Object llllllllllllIlllIlIlIllIlIIIIIIl = null;
                    boolean llllllllllllIlllIlIlIllIlIIIIIll;
                    boolean llllllllllllIlllIlIlIllIlIIIIIlI;
                    try {
                        llllllllllllIlllIlIlIllIlIIIIIIl = llllllllllllIlllIlIlIllIlIIIIlII.readChunk(llllllllllllIlllIlIlIllIIllllIll);
                        llllllllllllIlllIlIlIllIlIIIIIll = llllllllllllIlllIlIlIllIlIIIIlII.isEndOfInput();
                        if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIlIIIIIIl)) {
                            int n;
                            if (lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIlIIIIIll ? 1 : 0)) {
                                n = ChunkedWriteHandler.llIIIlIllIIlII[1];
                                "".length();
                                if (-" ".length() == ((0xA6 ^ 0xB8) & ~(0x64 ^ 0x7A))) {
                                    return;
                                }
                            }
                            else {
                                n = ChunkedWriteHandler.llIIIlIllIIlII[0];
                            }
                            final boolean llllllllllllIlllIlIlIllIlIIIIllI = n != 0;
                            "".length();
                            if ("   ".length() < 0) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlIlIllIlIIIIIlI = (ChunkedWriteHandler.llIIIlIllIIlII[0] != 0);
                        }
                        "".length();
                        if ((0xDF ^ 0xC2 ^ (0x41 ^ 0x59)) == 0x0) {
                            return;
                        }
                    }
                    catch (Throwable llllllllllllIlllIlIlIllIlIIIIlIl) {
                        this.currentWrite = null;
                        if (lIIIlIIllIIllIlI(llllllllllllIlllIlIlIllIlIIIIIIl)) {
                            ReferenceCountUtil.release(llllllllllllIlllIlIlIllIlIIIIIIl);
                            "".length();
                        }
                        llllllllllllIlllIlIlIllIIllllllI.fail(llllllllllllIlllIlIlIllIlIIIIlIl);
                        closeInput(llllllllllllIlllIlIlIllIlIIIIlII);
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                        break;
                    }
                    if (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIlIIIIIlI ? 1 : 0)) {
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIlIIIIIIl)) {
                            llllllllllllIlllIlIlIllIlIIIIIIl = Unpooled.EMPTY_BUFFER;
                        }
                        final int llllllllllllIlllIlIlIllIlIIIIIII = amount(llllllllllllIlllIlIlIllIlIIIIIIl);
                        final ChannelFuture llllllllllllIlllIlIlIllIIlllllll = llllllllllllIlllIlIlIllIIllllIll.write(llllllllllllIlllIlIlIllIlIIIIIIl);
                        if (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIlIIIIIll ? 1 : 0)) {
                            this.currentWrite = null;
                            llllllllllllIlllIlIlIllIIlllllll.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                                @Override
                                public void operationComplete(final ChannelFuture llllllllllllIlllIllllllIIlIIllIl) throws Exception {
                                    llllllllllllIlllIlIlIllIIllllllI.progress(llllllllllllIlllIlIlIllIlIIIIIII);
                                    llllllllllllIlllIlIlIllIIllllllI.success();
                                    ChunkedWriteHandler.closeInput(llllllllllllIlllIlIlIllIlIIIIlII);
                                }
                            });
                            "".length();
                            "".length();
                            if (-" ".length() >= "  ".length()) {
                                return;
                            }
                        }
                        else if (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIIllllIlI.isWritable() ? 1 : 0)) {
                            llllllllllllIlllIlIlIllIIlllllll.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                                @Override
                                public void operationComplete(final ChannelFuture llllllllllllIllIIlIlIlIlIIIllIIl) throws Exception {
                                    if (lIIllIIlIIlIlIll(llllllllllllIllIIlIlIlIlIIIllIIl.isSuccess() ? 1 : 0)) {
                                        ChunkedWriteHandler.closeInput((ChunkedInput<?>)llllllllllllIlllIlIlIllIIlllllIl);
                                        llllllllllllIlllIlIlIllIIllllllI.fail(llllllllllllIllIIlIlIlIlIIIllIIl.cause());
                                        "".length();
                                        if ("   ".length() < ((0x1B ^ 0x36) & ~(0x9D ^ 0xB0))) {
                                            return;
                                        }
                                    }
                                    else {
                                        llllllllllllIlllIlIlIllIIllllllI.progress(llllllllllllIlllIlIlIllIlIIIIIII);
                                    }
                                }
                                
                                private static boolean lIIllIIlIIlIlIll(final int llllllllllllIllIIlIlIlIlIIIIllll) {
                                    return llllllllllllIllIIlIlIlIlIIIIllll == 0;
                                }
                            });
                            "".length();
                            "".length();
                            if ("  ".length() <= ((0x45 ^ 0x74) & ~(0x7B ^ 0x4A))) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlIlIllIIlllllll.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                                private static boolean lIllllllIlIlllI(final int lllllllllllllIlIIIlIlIIlllIlllIl) {
                                    return lllllllllllllIlIIIlIlIIlllIlllIl == 0;
                                }
                                
                                @Override
                                public void operationComplete(final ChannelFuture lllllllllllllIlIIIlIlIIllllIIlll) throws Exception {
                                    if (lIllllllIlIlllI(lllllllllllllIlIIIlIlIIllllIIlll.isSuccess() ? 1 : 0)) {
                                        ChunkedWriteHandler.closeInput((ChunkedInput<?>)llllllllllllIlllIlIlIllIIlllllIl);
                                        llllllllllllIlllIlIlIllIIllllllI.fail(lllllllllllllIlIIIlIlIIllllIIlll.cause());
                                        "".length();
                                        if ((0x4A ^ 0x5C ^ (0x41 ^ 0x53)) < (0x22 ^ 0x1A ^ (0x74 ^ 0x48))) {
                                            return;
                                        }
                                    }
                                    else {
                                        llllllllllllIlllIlIlIllIIllllllI.progress(llllllllllllIlllIlIlIllIlIIIIIII);
                                        if (lIllllllIlIllll(llllllllllllIlllIlIlIllIIllllIlI.isWritable() ? 1 : 0)) {
                                            ChunkedWriteHandler.this.resumeTransfer();
                                        }
                                    }
                                }
                                
                                private static boolean lIllllllIlIllll(final int lllllllllllllIlIIIlIlIIlllIlllll) {
                                    return lllllllllllllIlIIIlIlIIlllIlllll != 0;
                                }
                            });
                            "".length();
                        }
                        "".length();
                        if (((0xD8 ^ 0xC6) & ~(0x5A ^ 0x44)) > 0) {
                            return;
                        }
                    }
                }
                else {
                    llllllllllllIlllIlIlIllIIllllIll.write(llllllllllllIlllIlIlIllIIlllllIl, llllllllllllIlllIlIlIllIIllllllI.promise);
                    "".length();
                    this.currentWrite = null;
                }
                llllllllllllIlllIlIlIllIIllllIll.flush();
                "".length();
                if (lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIIllllIlI.isActive() ? 1 : 0)) {
                    this.discard(new ClosedChannelException());
                    return;
                }
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static boolean lIIIlIIllIIllIlI(final Object llllllllllllIlllIlIlIllIIIllIlIl) {
        return llllllllllllIlllIlIlIllIIIllIlIl != null;
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIlllIlIlIllIlIlllllI, final Object llllllllllllIlllIlIlIllIlIllllIl, final ChannelPromise llllllllllllIlllIlIlIllIlIlllIIl) throws Exception {
        this.queue.add(new PendingWrite(llllllllllllIlllIlIlIllIlIllllIl, llllllllllllIlllIlIlIllIlIlllIIl));
        "".length();
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIlllIlIlIllIllIIlllI) throws Exception {
        this.ctx = llllllllllllIlllIlIlIllIllIIlllI;
    }
    
    private static boolean lIIIlIIllIIllIII(final int llllllllllllIlllIlIlIllIIIllIIIl) {
        return llllllllllllIlllIlIlIllIIIllIIIl != 0;
    }
    
    private static boolean lIIIlIIllIIllIIl(final int llllllllllllIlllIlIlIllIIIlIllll) {
        return llllllllllllIlllIlIlIllIIIlIllll == 0;
    }
    
    public void resumeTransfer() {
        final ChannelHandlerContext llllllllllllIlllIlIlIllIllIIIllI = this.ctx;
        if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIllIIIllI)) {
            return;
        }
        if (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIllIIIllI.executor().inEventLoop() ? 1 : 0)) {
            try {
                this.doFlush(llllllllllllIlllIlIlIllIllIIIllI);
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
                return;
            }
            catch (Exception llllllllllllIlllIlIlIllIllIIlIII) {
                if (lIIIlIIllIIllIII(ChunkedWriteHandler.logger.isWarnEnabled() ? 1 : 0)) {
                    ChunkedWriteHandler.logger.warn(ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[2]], llllllllllllIlllIlIlIllIllIIlIII);
                }
                "".length();
                if ("  ".length() < ((0x9D ^ 0x8C ^ (0x45 ^ 0x72)) & (0x87 ^ 0xAC ^ (0x57 ^ 0x5A) ^ -" ".length()))) {
                    return;
                }
                return;
            }
        }
        llllllllllllIlllIlIlIllIllIIIllI.executor().execute(new Runnable() {
            private static final /* synthetic */ int[] llIlIllIIIIIII;
            private static final /* synthetic */ String[] llIlIlIlllllll;
            
            private static String lIIlIlIIllIlIlII(final String llllllllllllIllIlIIllllIllIIllIl, final String llllllllllllIllIlIIllllIllIIllII) {
                try {
                    final SecretKeySpec llllllllllllIllIlIIllllIllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllllIllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllIlIIllllIllIlIIIl = Cipher.getInstance("Blowfish");
                    llllllllllllIllIlIIllllIllIlIIIl.init(ChunkedWriteHandler$1.llIlIllIIIIIII[2], llllllllllllIllIlIIllllIllIlIIlI);
                    return new String(llllllllllllIllIlIIllllIllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllllIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllIlIIllllIllIlIIII) {
                    llllllllllllIllIlIIllllIllIlIIII.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIlIlIIllIlIlll(final int llllllllllllIllIlIIllllIllIIlIII) {
                return llllllllllllIllIlIIllllIllIIlIII != 0;
            }
            
            private static void lIIlIlIIllIlIlIl() {
                (llIlIlIlllllll = new String[ChunkedWriteHandler$1.llIlIllIIIIIII[1]])[ChunkedWriteHandler$1.llIlIllIIIIIII[0]] = lIIlIlIIllIlIlII("vC+JaUUeZvihM8bunbAr+2dhMzsd2YRS2jTpzbP/dStNZJxLKQlKarzdrWZ69CeV", "CdooV");
            }
            
            static {
                lIIlIlIIllIlIllI();
                lIIlIlIIllIlIlIl();
            }
            
            private static void lIIlIlIIllIlIllI() {
                (llIlIllIIIIIII = new int[3])[0] = ((0x81 ^ 0xB8) & ~(0x9F ^ 0xA6) & ~((0x74 ^ 0x20) & ~(0x7D ^ 0x29)));
                ChunkedWriteHandler$1.llIlIllIIIIIII[1] = " ".length();
                ChunkedWriteHandler$1.llIlIllIIIIIII[2] = "  ".length();
            }
            
            @Override
            public void run() {
                try {
                    ChunkedWriteHandler.this.doFlush(llllllllllllIlllIlIlIllIllIIIllI);
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return;
                    }
                }
                catch (Exception llllllllllllIllIlIIllllIllIllIlI) {
                    if (lIIlIlIIllIlIlll(ChunkedWriteHandler.logger.isWarnEnabled() ? 1 : 0)) {
                        ChunkedWriteHandler.logger.warn(ChunkedWriteHandler$1.llIlIlIlllllll[ChunkedWriteHandler$1.llIlIllIIIIIII[0]], llllllllllllIllIlIIllllIllIllIlI);
                    }
                }
            }
        });
    }
    
    private void discard(Throwable llllllllllllIlllIlIlIllIlIIlIllI) {
        do {
            PendingWrite llllllllllllIlllIlIlIllIlIIllIll = this.currentWrite;
            if (lIIIlIIllIIlIlll(this.currentWrite)) {
                llllllllllllIlllIlIlIllIlIIllIll = this.queue.poll();
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
            }
            else {
                this.currentWrite = null;
            }
            if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIlIIllIll)) {
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            else {
                final Object llllllllllllIlllIlIlIllIlIIllIlI = llllllllllllIlllIlIlIllIlIIllIll.msg;
                if (lIIIlIIllIIllIII((llllllllllllIlllIlIlIllIlIIllIlI instanceof ChunkedInput) ? 1 : 0)) {
                    final ChunkedInput<?> llllllllllllIlllIlIlIllIlIIlllII = (ChunkedInput<?>)llllllllllllIlllIlIlIllIlIIllIlI;
                    try {
                        if (lIIIlIIllIIllIIl(llllllllllllIlllIlIlIllIlIIlllII.isEndOfInput() ? 1 : 0)) {
                            if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIlIIlIllI)) {
                                llllllllllllIlllIlIlIllIlIIlIllI = new ClosedChannelException();
                            }
                            llllllllllllIlllIlIlIllIlIIllIll.fail(llllllllllllIlllIlIlIllIlIIlIllI);
                            "".length();
                            if ("  ".length() == " ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlIlIllIlIIllIll.success();
                        }
                        closeInput(llllllllllllIlllIlIlIllIlIIlllII);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    catch (Exception llllllllllllIlllIlIlIllIlIIlllIl) {
                        llllllllllllIlllIlIlIllIlIIllIll.fail(llllllllllllIlllIlIlIllIlIIlllIl);
                        ChunkedWriteHandler.logger.warn(String.valueOf(new StringBuilder().append(ChunkedInput.class.getSimpleName()).append(ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[3]])), llllllllllllIlllIlIlIllIlIIlllIl);
                        closeInput(llllllllllllIlllIlIlIllIlIIlllII);
                    }
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                }
                else {
                    if (lIIIlIIllIIlIlll(llllllllllllIlllIlIlIllIlIIlIllI)) {
                        llllllllllllIlllIlIlIllIlIIlIllI = new ClosedChannelException();
                    }
                    llllllllllllIlllIlIlIllIlIIllIll.fail(llllllllllllIlllIlIlIllIlIIlIllI);
                }
                "".length();
            }
        } while (((0x77 ^ 0x9 ^ (0x5F ^ 0x1B)) & (0xBB ^ 0xA1 ^ (0x1C ^ 0x3C) ^ -" ".length())) != (0xBE ^ 0xA8 ^ (0x9B ^ 0x89)));
    }
    
    private static boolean lIIIlIIllIIlIlll(final Object llllllllllllIlllIlIlIllIIIllIIll) {
        return llllllllllllIlllIlIlIllIIIllIIll == null;
    }
    
    public ChunkedWriteHandler() {
        this.queue = new ArrayDeque<PendingWrite>();
    }
    
    @Override
    public void channelWritabilityChanged(final ChannelHandlerContext llllllllllllIlllIlIlIllIlIlIIlII) throws Exception {
        if (lIIIlIIllIIllIII(llllllllllllIlllIlIlIllIlIlIIlII.channel().isWritable() ? 1 : 0)) {
            this.doFlush(llllllllllllIlllIlIlIllIlIlIIlII);
        }
        llllllllllllIlllIlIlIllIlIlIIlII.fireChannelWritabilityChanged();
        "".length();
    }
    
    private static void lIIIlIIllIIlIlIl() {
        (llIIIlIllIIlII = new int[7])[0] = ((0x8F ^ 0xC3 ^ (0x5A ^ 0x23)) & (0x4C ^ 0x27 ^ (0xE0 ^ 0xBE) ^ -" ".length()));
        ChunkedWriteHandler.llIIIlIllIIlII[1] = " ".length();
        ChunkedWriteHandler.llIIIlIllIIlII[2] = "  ".length();
        ChunkedWriteHandler.llIIIlIllIIlII[3] = "   ".length();
        ChunkedWriteHandler.llIIIlIllIIlII[4] = (0xC2 ^ 0xC6);
        ChunkedWriteHandler.llIIIlIllIIlII[5] = (0x92 ^ 0xB1 ^ (0x7D ^ 0x5B));
        ChunkedWriteHandler.llIIIlIllIIlII[6] = (70 + 5 + 54 + 55 ^ 169 + 116 - 138 + 29);
    }
    
    private static void lIIIlIIllIIIlIII() {
        (llIIIlIllIIIlI = new String[ChunkedWriteHandler.llIIIlIllIIlII[5]])[ChunkedWriteHandler.llIIIlIllIIlII[0]] = lIIIlIIllIIIIllI("LAIACAMvBxE2ARYRESwDMllY", "AcxXf");
        ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[1]] = lIIIlIIllIIIIlll("jG5MU1YJypjM4DdjvjihfWbfUk4BjETt", "Ezcfi");
        ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[2]] = lIIIlIIllIIIIlll("5Oj7a8xYZMrG9O5oURlhLXNhe1yLllCVv83ReYJaU4KPnrliLOtabhXD4V2fhZqP", "xpzea");
        ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[3]] = lIIIlIIllIIIIlll("Xa0cH/FdEbMsXcFEUp9O8fuvOQJJzJmr", "ZJlsH");
        ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[4]] = lIIIlIIllIIIIllI("Ey4YHC0xbwUfaDYjHgMtdS5REyAgIRoVLHUmHwA9IWE=", "UOqpH");
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlllIlIlIllIlIlIllII) throws Exception {
        this.doFlush(llllllllllllIlllIlIlIllIlIlIllII);
        super.channelInactive(llllllllllllIlllIlIlIllIlIlIllII);
    }
    
    static void closeInput(final ChunkedInput<?> llllllllllllIlllIlIlIllIIllIlIlI) {
        try {
            llllllllllllIlllIlIlIllIIllIlIlI.close();
            "".length();
            if (((0xDB ^ 0xB8) & ~(0x4A ^ 0x29)) == " ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIlIlIllIIllIllII) {
            if (lIIIlIIllIIllIII(ChunkedWriteHandler.logger.isWarnEnabled() ? 1 : 0)) {
                ChunkedWriteHandler.logger.warn(ChunkedWriteHandler.llIIIlIllIIIlI[ChunkedWriteHandler.llIIIlIllIIlII[4]], llllllllllllIlllIlIlIllIIllIllII);
            }
        }
    }
    
    private static boolean lIIIlIIllIIlIllI(final int llllllllllllIlllIlIlIllIIIlIllIl) {
        return llllllllllllIlllIlIlIllIIIlIllIl <= 0;
    }
    
    private static final class PendingWrite
    {
        final /* synthetic */ Object msg;
        final /* synthetic */ ChannelPromise promise;
        private /* synthetic */ long progress;
        
        void success() {
            if (lllllIIIIIIlIII(this.promise.isDone() ? 1 : 0)) {
                return;
            }
            if (lllllIIIIIIlIII((this.promise instanceof ChannelProgressivePromise) ? 1 : 0)) {
                ((ChannelProgressivePromise)this.promise).tryProgress(this.progress, this.progress);
                "".length();
            }
            this.promise.trySuccess();
            "".length();
        }
        
        private static boolean lllllIIIIIIlIII(final int lllllllllllllIIIIIllIIIlllllllll) {
            return lllllllllllllIIIIIllIIIlllllllll != 0;
        }
        
        void fail(final Throwable lllllllllllllIIIIIllIIlIIIIIllII) {
            ReferenceCountUtil.release(this.msg);
            "".length();
            this.promise.tryFailure(lllllllllllllIIIIIllIIlIIIIIllII);
            "".length();
        }
        
        void progress(final int lllllllllllllIIIIIllIIlIIIIIIIll) {
            this.progress += lllllllllllllIIIIIllIIlIIIIIIIll;
            if (lllllIIIIIIlIII((this.promise instanceof ChannelProgressivePromise) ? 1 : 0)) {
                ((ChannelProgressivePromise)this.promise).tryProgress(this.progress, -1L);
                "".length();
            }
        }
        
        PendingWrite(final Object lllllllllllllIIIIIllIIlIIIIlIlII, final ChannelPromise lllllllllllllIIIIIllIIlIIIIlIIII) {
            this.msg = lllllllllllllIIIIIllIIlIIIIlIlII;
            this.promise = lllllllllllllIIIIIllIIlIIIIlIIII;
        }
    }
}
