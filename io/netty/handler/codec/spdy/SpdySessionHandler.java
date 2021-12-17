// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import java.util.Iterator;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelDuplexHandler;

public class SpdySessionHandler extends ChannelDuplexHandler
{
    private static final /* synthetic */ SpdyProtocolException PROTOCOL_EXCEPTION;
    private /* synthetic */ int initialReceiveWindowSize;
    private final /* synthetic */ boolean server;
    private /* synthetic */ boolean receivedGoAwayFrame;
    private /* synthetic */ int initialSendWindowSize;
    private /* synthetic */ int localConcurrentStreams;
    private final /* synthetic */ int minorVersion;
    private volatile /* synthetic */ int initialSessionReceiveWindowSize;
    private static final /* synthetic */ String[] lllIlllllIlllI;
    private /* synthetic */ ChannelFutureListener closeSessionFutureListener;
    private final /* synthetic */ AtomicInteger pings;
    private /* synthetic */ boolean sentGoAwayFrame;
    private static final /* synthetic */ SpdyProtocolException STREAM_CLOSED;
    private /* synthetic */ int remoteConcurrentStreams;
    private static final /* synthetic */ int[] lllIllllllIlIl;
    private final /* synthetic */ SpdySession spdySession;
    private /* synthetic */ int lastGoodStreamId;
    
    private static boolean lIlIIllIIlIIlIll(final int llllllllllllIlIlIllllIlIIIIIllIl) {
        return llllllllllllIlIlIllllIlIIIIIllIl <= 0;
    }
    
    private synchronized void updateInitialSendWindowSize(final int llllllllllllIlIlIllllIlIlllIlllI) {
        final int llllllllllllIlIlIllllIlIlllIllIl = llllllllllllIlIlIllllIlIlllIlllI - this.initialSendWindowSize;
        this.initialSendWindowSize = llllllllllllIlIlIllllIlIlllIlllI;
        this.spdySession.updateAllSendWindowSizes(llllllllllllIlIlIllllIlIlllIllIl);
    }
    
    private void issueStreamError(final ChannelHandlerContext llllllllllllIlIlIllllIllIIIIlIII, final int llllllllllllIlIlIllllIllIIIIIlll, final SpdyStreamStatus llllllllllllIlIlIllllIllIIIIIllI) {
        int n;
        if (lIlIIllIIlIIIllI(this.spdySession.isRemoteSideClosed(llllllllllllIlIlIllllIllIIIIIlll) ? 1 : 0)) {
            n = SpdySessionHandler.lllIllllllIlIl[3];
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        }
        else {
            n = SpdySessionHandler.lllIllllllIlIl[2];
        }
        final boolean llllllllllllIlIlIllllIllIIIIIlIl = n != 0;
        final ChannelPromise llllllllllllIlIlIllllIllIIIIIlII = llllllllllllIlIlIllllIllIIIIlIII.newPromise();
        this.removeStream(llllllllllllIlIlIllllIllIIIIIlll, llllllllllllIlIlIllllIllIIIIIlII);
        final SpdyRstStreamFrame llllllllllllIlIlIllllIllIIIIIIll = new DefaultSpdyRstStreamFrame(llllllllllllIlIlIllllIllIIIIIlll, llllllllllllIlIlIllllIllIIIIIllI);
        llllllllllllIlIlIllllIllIIIIlIII.writeAndFlush(llllllllllllIlIlIllllIllIIIIIIll, llllllllllllIlIlIllllIllIIIIIlII);
        "".length();
        if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIIIIIlIl ? 1 : 0)) {
            llllllllllllIlIlIllllIllIIIIlIII.fireChannelRead(llllllllllllIlIlIllllIllIIIIIIll);
            "".length();
        }
    }
    
    private static boolean lIlIIllIIlIIIlIl(final int llllllllllllIlIlIllllIlIIIlIIIII, final int llllllllllllIlIlIllllIlIIIIlllll) {
        return llllllllllllIlIlIllllIlIIIlIIIII <= llllllllllllIlIlIllllIlIIIIlllll;
    }
    
    private static String lIlIIllIIIllIIII(final String llllllllllllIlIlIllllIlIIlIIIllI, final String llllllllllllIlIlIllllIlIIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllIlIIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIllllIlIIlIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIllllIlIIlIIlIlI.init(SpdySessionHandler.lllIllllllIlIl[5], llllllllllllIlIlIllllIlIIlIIlIll);
            return new String(llllllllllllIlIlIllllIlIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllIlIIlIIlIIl) {
            llllllllllllIlIlIllllIlIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private void handleOutboundMessage(final ChannelHandlerContext llllllllllllIlIlIllllIllIIlIIlll, final Object llllllllllllIlIlIllllIllIIlIIIlI, final ChannelPromise llllllllllllIlIlIllllIllIIlIIIIl) throws Exception {
        if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyDataFrame) ? 1 : 0)) {
            final SpdyDataFrame llllllllllllIlIlIllllIllIIllllII = (SpdyDataFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            final int llllllllllllIlIlIllllIllIIlllIll = llllllllllllIlIlIllllIllIIllllII.streamId();
            if (lIlIIllIIlIIIlII(this.spdySession.isLocalSideClosed(llllllllllllIlIlIllllIllIIlllIll) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIllllII.release();
                "".length();
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            final int llllllllllllIlIlIllllIllIIlllIlI = llllllllllllIlIlIllllIllIIllllII.content().readableBytes();
            int llllllllllllIlIlIllllIllIIlllIIl = this.spdySession.getSendWindowSize(llllllllllllIlIlIllllIllIIlllIll);
            final int llllllllllllIlIlIllllIllIIlllIII = this.spdySession.getSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2]);
            llllllllllllIlIlIllllIllIIlllIIl = Math.min(llllllllllllIlIlIllllIllIIlllIIl, llllllllllllIlIlIllllIllIIlllIII);
            if (lIlIIllIIlIIlIll(llllllllllllIlIlIllllIllIIlllIIl)) {
                this.spdySession.putPendingWrite(llllllllllllIlIlIllllIllIIlllIll, new SpdySession.PendingWrite(llllllllllllIlIlIllllIllIIllllII, llllllllllllIlIlIllllIllIIlIIIIl));
                "".length();
                return;
            }
            if (lIlIIllIIlIIIlll(llllllllllllIlIlIllllIllIIlllIIl, llllllllllllIlIlIllllIllIIlllIlI)) {
                this.spdySession.updateSendWindowSize(llllllllllllIlIlIllllIllIIlllIll, SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIllIIlllIIl);
                "".length();
                this.spdySession.updateSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2], SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIllIIlllIIl);
                "".length();
                final SpdyDataFrame llllllllllllIlIlIllllIllIIllllll = new DefaultSpdyDataFrame(llllllllllllIlIlIllllIllIIlllIll, llllllllllllIlIlIllllIllIIllllII.content().readSlice(llllllllllllIlIlIllllIllIIlllIIl).retain());
                this.spdySession.putPendingWrite(llllllllllllIlIlIllllIllIIlllIll, new SpdySession.PendingWrite(llllllllllllIlIlIllllIllIIllllII, llllllllllllIlIlIllllIllIIlIIIIl));
                "".length();
                final ChannelHandlerContext llllllllllllIlIlIllllIllIIlllllI = llllllllllllIlIlIllllIllIIlIIlll;
                llllllllllllIlIlIllllIllIIlIIlll.write(llllllllllllIlIlIllllIllIIllllll).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    private static boolean lIIlllIIIIIlllII(final int llllllllllllIllIIIIlllllIIIIllIl) {
                        return llllllllllllIllIIIIlllllIIIIllIl == 0;
                    }
                    
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIllIIIIlllllIIIlIlIl) throws Exception {
                        if (lIIlllIIIIIlllII(llllllllllllIllIIIIlllllIIIlIlIl.isSuccess() ? 1 : 0)) {
                            SpdySessionHandler.this.issueSessionError(llllllllllllIlIlIllllIllIIlllllI, SpdySessionStatus.INTERNAL_ERROR);
                        }
                    }
                });
                "".length();
                return;
            }
            this.spdySession.updateSendWindowSize(llllllllllllIlIlIllllIllIIlllIll, SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIllIIlllIlI);
            "".length();
            this.spdySession.updateSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2], SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIllIIlllIlI);
            "".length();
            final ChannelHandlerContext llllllllllllIlIlIllllIllIIllllIl = llllllllllllIlIlIllllIllIIlIIlll;
            llllllllllllIlIlIllllIllIIlIIIIl.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                @Override
                public void operationComplete(final ChannelFuture llllllllllllIllllIlIllIIlIIIllIl) throws Exception {
                    if (lIIIIlIIIIIlIlII(llllllllllllIllllIlIllIIlIIIllIl.isSuccess() ? 1 : 0)) {
                        SpdySessionHandler.this.issueSessionError(llllllllllllIlIlIllllIllIIllllIl, SpdySessionStatus.INTERNAL_ERROR);
                    }
                }
                
                private static boolean lIIIIlIIIIIlIlII(final int llllllllllllIllllIlIllIIlIIIIlIl) {
                    return llllllllllllIllllIlIllIIlIIIIlIl == 0;
                }
            });
            "".length();
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIIllllII.isLast() ? 1 : 0)) {
                this.halfCloseStream(llllllllllllIlIlIllllIllIIlllIll, (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0), llllllllllllIlIlIllllIllIIlIIIIl);
            }
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdySynStreamFrame) ? 1 : 0)) {
            final SpdySynStreamFrame llllllllllllIlIlIllllIllIIllIlll = (SpdySynStreamFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            final int llllllllllllIlIlIllllIllIIllIllI = llllllllllllIlIlIllllIllIIllIlll.streamId();
            if (lIlIIllIIlIIIlII(this.isRemoteInitiatedId(llllllllllllIlIlIllllIllIIllIllI) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            final byte llllllllllllIlIlIllllIllIIllIlIl = llllllllllllIlIlIllllIllIIllIlll.priority();
            final boolean llllllllllllIlIlIllllIllIIllIlII = llllllllllllIlIlIllllIllIIllIlll.isUnidirectional();
            final boolean llllllllllllIlIlIllllIllIIllIIll = llllllllllllIlIlIllllIllIIllIlll.isLast();
            if (lIlIIllIIlIIIllI(this.acceptStream(llllllllllllIlIlIllllIllIIllIllI, llllllllllllIlIlIllllIllIIllIlIl, llllllllllllIlIlIllllIllIIllIlII, llllllllllllIlIlIllllIllIIllIIll) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdySynReplyFrame) ? 1 : 0)) {
            final SpdySynReplyFrame llllllllllllIlIlIllllIllIIllIIlI = (SpdySynReplyFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            final int llllllllllllIlIlIllllIllIIllIIIl = llllllllllllIlIlIllllIllIIllIIlI.streamId();
            if (!lIlIIllIIlIIIlII(this.isRemoteInitiatedId(llllllllllllIlIlIllllIllIIllIIIl) ? 1 : 0) || lIlIIllIIlIIIlII(this.spdySession.isLocalSideClosed(llllllllllllIlIlIllllIllIIllIIIl) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIIllIIlI.isLast() ? 1 : 0)) {
                this.halfCloseStream(llllllllllllIlIlIllllIllIIllIIIl, (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0), llllllllllllIlIlIllllIllIIlIIIIl);
            }
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyRstStreamFrame) ? 1 : 0)) {
            final SpdyRstStreamFrame llllllllllllIlIlIllllIllIIllIIII = (SpdyRstStreamFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            this.removeStream(llllllllllllIlIlIllllIllIIllIIII.streamId(), llllllllllllIlIlIllllIllIIlIIIIl);
            "".length();
            if ((0x1E ^ 0x2C ^ (0x84 ^ 0xB3)) == 0x0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdySettingsFrame) ? 1 : 0)) {
            final SpdySettingsFrame llllllllllllIlIlIllllIllIIlIllll = (SpdySettingsFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            final int llllllllllllIlIlIllllIllIIlIlllI = llllllllllllIlIlIllllIllIIlIllll.getValue(SpdySessionHandler.lllIllllllIlIl[2]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIllIIlIlllI) && lIlIIllIIlIIlIlI(llllllllllllIlIlIllllIllIIlIlllI, this.minorVersion)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            final int llllllllllllIlIlIllllIllIIlIllIl = llllllllllllIlIlIllllIllIIlIllll.getValue(SpdySessionHandler.lllIllllllIlIl[6]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIllIIlIllIl)) {
                this.localConcurrentStreams = llllllllllllIlIlIllllIllIIlIllIl;
            }
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIIlIllll.isPersisted(SpdySessionHandler.lllIllllllIlIl[7]) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIllll.removeValue(SpdySessionHandler.lllIllllllIlIl[7]);
                "".length();
            }
            llllllllllllIlIlIllllIllIIlIllll.setPersistValue(SpdySessionHandler.lllIllllllIlIl[7], (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0));
            "".length();
            final int llllllllllllIlIlIllllIllIIlIllII = llllllllllllIlIlIllllIllIIlIllll.getValue(SpdySessionHandler.lllIllllllIlIl[7]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIllIIlIllII)) {
                this.updateInitialReceiveWindowSize(llllllllllllIlIlIllllIllIIlIllII);
            }
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyPingFrame) ? 1 : 0)) {
            final SpdyPingFrame llllllllllllIlIlIllllIllIIlIlIll = (SpdyPingFrame)llllllllllllIlIlIllllIllIIlIIIlI;
            if (lIlIIllIIlIIIlII(this.isRemoteInitiatedId(llllllllllllIlIlIllllIllIIlIlIll.id()) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIlll.fireExceptionCaught(new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[5]]).append(llllllllllllIlIlIllllIllIIlIlIll.id()))));
                "".length();
                return;
            }
            this.pings.getAndIncrement();
            "".length();
            "".length();
            if (-(0x30 ^ 0x35) >= 0) {
                return;
            }
        }
        else {
            if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyGoAwayFrame) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
            if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyHeadersFrame) ? 1 : 0)) {
                final SpdyHeadersFrame llllllllllllIlIlIllllIllIIlIlIlI = (SpdyHeadersFrame)llllllllllllIlIlIllllIllIIlIIIlI;
                final int llllllllllllIlIlIllllIllIIlIlIIl = llllllllllllIlIlIllllIllIIlIlIlI.streamId();
                if (lIlIIllIIlIIIlII(this.spdySession.isLocalSideClosed(llllllllllllIlIlIllllIllIIlIlIIl) ? 1 : 0)) {
                    llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                    "".length();
                    return;
                }
                if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIIlIlIlI.isLast() ? 1 : 0)) {
                    this.halfCloseStream(llllllllllllIlIlIllllIllIIlIlIIl, (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0), llllllllllllIlIlIllllIllIIlIIIIl);
                }
                "".length();
                if (((0x52 ^ 0x6E ^ (0xA ^ 0x17)) & (20 + 93 + 8 + 15 ^ 136 + 67 - 37 + 3 ^ -" ".length())) > 0) {
                    return;
                }
            }
            else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIIlIIIlI instanceof SpdyWindowUpdateFrame) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIIlIIIIl.setFailure((Throwable)SpdySessionHandler.PROTOCOL_EXCEPTION);
                "".length();
                return;
            }
        }
        llllllllllllIlIlIllllIllIIlIIlll.write(llllllllllllIlIlIllllIllIIlIIIlI, llllllllllllIlIlIllllIllIIlIIIIl);
        "".length();
    }
    
    private static boolean lIlIIllIIlIIlllI(final Object llllllllllllIlIlIllllIlIIIIllIIl) {
        return llllllllllllIlIlIllllIlIIIIllIIl != null;
    }
    
    private synchronized void updateInitialReceiveWindowSize(final int llllllllllllIlIlIllllIlIlllIIIlI) {
        final int llllllllllllIlIlIllllIlIlllIIlII = llllllllllllIlIlIllllIlIlllIIIlI - this.initialReceiveWindowSize;
        this.initialReceiveWindowSize = llllllllllllIlIlIllllIlIlllIIIlI;
        this.spdySession.updateAllReceiveWindowSizes(llllllllllllIlIlIllllIlIlllIIlII);
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIlIlIllllIllIllIIlII, final Throwable llllllllllllIlIlIllllIllIllIIIII) throws Exception {
        if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIllIIIII instanceof SpdyProtocolException) ? 1 : 0)) {
            this.issueSessionError(llllllllllllIlIlIllllIllIllIIlII, SpdySessionStatus.PROTOCOL_ERROR);
        }
        llllllllllllIlIlIllllIllIllIIlII.fireExceptionCaught(llllllllllllIlIlIllllIllIllIIIII);
        "".length();
    }
    
    static {
        lIlIIllIIlIIIIIl();
        lIlIIllIIIllIlII();
        DEFAULT_WINDOW_SIZE = SpdySessionHandler.lllIllllllIlIl[0];
        DEFAULT_MAX_CONCURRENT_STREAMS = SpdySessionHandler.lllIllllllIlIl[1];
        PROTOCOL_EXCEPTION = new SpdyProtocolException();
        STREAM_CLOSED = new SpdyProtocolException(SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[8]]);
        SpdySessionHandler.PROTOCOL_EXCEPTION.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
        SpdySessionHandler.STREAM_CLOSED.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
    }
    
    public void setSessionReceiveWindowSize(final int llllllllllllIlIlIllllIlllIlIlIlI) {
        if (lIlIIllIIlIIIIll(llllllllllllIlIlIllllIlllIlIlIlI)) {
            throw new IllegalArgumentException(SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[3]]);
        }
        this.initialSessionReceiveWindowSize = llllllllllllIlIlIllllIlllIlIlIlI;
    }
    
    private static boolean lIlIIllIIlIIlIII(final int llllllllllllIlIlIllllIlIIIIlllII, final int llllllllllllIlIlIllllIlIIIIllIll) {
        return llllllllllllIlIlIllllIlIIIIlllII > llllllllllllIlIlIllllIlIIIIllIll;
    }
    
    private static boolean lIlIIllIIlIIIIll(final int llllllllllllIlIlIllllIlIIIIIllll) {
        return llllllllllllIlIlIllllIlIIIIIllll < 0;
    }
    
    private static String lIlIIllIIIllIIlI(String llllllllllllIlIlIllllIlIIIllIIll, final String llllllllllllIlIlIllllIlIIIllIIlI) {
        llllllllllllIlIlIllllIlIIIllIIll = new String(Base64.getDecoder().decode(llllllllllllIlIlIllllIlIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlIllllIlIIIllIllI = new StringBuilder();
        final char[] llllllllllllIlIlIllllIlIIIllIlIl = llllllllllllIlIlIllllIlIIIllIIlI.toCharArray();
        int llllllllllllIlIlIllllIlIIIllIlII = SpdySessionHandler.lllIllllllIlIl[2];
        final boolean llllllllllllIlIlIllllIlIIIlIlllI = (Object)llllllllllllIlIlIllllIlIIIllIIll.toCharArray();
        final float llllllllllllIlIlIllllIlIIIlIllIl = llllllllllllIlIlIllllIlIIIlIlllI.length;
        double llllllllllllIlIlIllllIlIIIlIllII = SpdySessionHandler.lllIllllllIlIl[2];
        while (lIlIIllIIlIIIlll((int)llllllllllllIlIlIllllIlIIIlIllII, (int)llllllllllllIlIlIllllIlIIIlIllIl)) {
            final char llllllllllllIlIlIllllIlIIIlllIIl = llllllllllllIlIlIllllIlIIIlIlllI[llllllllllllIlIlIllllIlIIIlIllII];
            llllllllllllIlIlIllllIlIIIllIllI.append((char)(llllllllllllIlIlIllllIlIIIlllIIl ^ llllllllllllIlIlIllllIlIIIllIlIl[llllllllllllIlIlIllllIlIIIllIlII % llllllllllllIlIlIllllIlIIIllIlIl.length]));
            "".length();
            ++llllllllllllIlIlIllllIlIIIllIlII;
            ++llllllllllllIlIlIllllIlIIIlIllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlIllllIlIIIllIllI);
    }
    
    private static boolean lIlIIllIIlIIIllI(final int llllllllllllIlIlIllllIlIIIIlIIll) {
        return llllllllllllIlIlIllllIlIIIIlIIll == 0;
    }
    
    private void sendGoAwayFrame(final ChannelHandlerContext llllllllllllIlIlIllllIlIlIIIlIIl, final ChannelPromise llllllllllllIlIlIllllIlIlIIIlIII) {
        if (lIlIIllIIlIIIllI(llllllllllllIlIlIllllIlIlIIIlIIl.channel().isActive() ? 1 : 0)) {
            llllllllllllIlIlIllllIlIlIIIlIIl.close(llllllllllllIlIlIllllIlIlIIIlIII);
            "".length();
            return;
        }
        final ChannelFuture llllllllllllIlIlIllllIlIlIIIIllI = this.sendGoAwayFrame(llllllllllllIlIlIllllIlIlIIIlIIl, SpdySessionStatus.OK);
        if (lIlIIllIIlIIIlII(this.spdySession.noActiveStreams() ? 1 : 0)) {
            llllllllllllIlIlIllllIlIlIIIIllI.addListener((GenericFutureListener<? extends Future<? super Void>>)new ClosingChannelFutureListener(llllllllllllIlIlIllllIlIlIIIlIIl, llllllllllllIlIlIllllIlIlIIIlIII));
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            this.closeSessionFutureListener = new ClosingChannelFutureListener(llllllllllllIlIlIllllIlIlIIIlIIl, llllllllllllIlIlIllllIlIlIIIlIII);
        }
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIlIlIllllIllIllIlIll) throws Exception {
        final Iterator llllllllllllIlIlIllllIllIllIllll = this.spdySession.activeStreams().keySet().iterator();
        while (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIllIllIllll.hasNext() ? 1 : 0)) {
            final Integer llllllllllllIlIlIllllIllIlllIIII = llllllllllllIlIlIllllIllIllIllll.next();
            this.removeStream(llllllllllllIlIlIllllIllIlllIIII, llllllllllllIlIlIllllIllIllIlIll.newSucceededFuture());
            "".length();
            if (null != null) {
                return;
            }
        }
        llllllllllllIlIlIllllIllIllIlIll.fireChannelInactive();
        "".length();
    }
    
    private void halfCloseStream(final int llllllllllllIlIlIllllIlIllIIIllI, final boolean llllllllllllIlIlIllllIlIllIIIlIl, final ChannelFuture llllllllllllIlIlIllllIlIllIIIlII) {
        if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIllIIIlIl ? 1 : 0)) {
            this.spdySession.closeRemoteSide(llllllllllllIlIlIllllIlIllIIIllI, this.isRemoteInitiatedId(llllllllllllIlIlIllllIlIllIIIllI));
            "".length();
            if ("  ".length() >= (25 + 77 - 41 + 138 ^ 112 + 48 + 4 + 31)) {
                return;
            }
        }
        else {
            this.spdySession.closeLocalSide(llllllllllllIlIlIllllIlIllIIIllI, this.isRemoteInitiatedId(llllllllllllIlIlIllllIlIllIIIllI));
        }
        if (lIlIIllIIlIIlllI(this.closeSessionFutureListener) && lIlIIllIIlIIIlII(this.spdySession.noActiveStreams() ? 1 : 0)) {
            llllllllllllIlIlIllllIlIllIIIlII.addListener((GenericFutureListener<? extends Future<? super Void>>)this.closeSessionFutureListener);
            "".length();
        }
    }
    
    private static void lIlIIllIIlIIIIIl() {
        (lllIllllllIlIl = new int[10])[0] = (0xFFFFA0E6 & 0x15F19);
        SpdySessionHandler.lllIllllllIlIl[1] = (-1 & Integer.MAX_VALUE);
        SpdySessionHandler.lllIllllllIlIl[2] = ((0x17 ^ 0x1F) & ~(0x68 ^ 0x60));
        SpdySessionHandler.lllIllllllIlIl[3] = " ".length();
        SpdySessionHandler.lllIllllllIlIl[4] = -" ".length();
        SpdySessionHandler.lllIllllllIlIl[5] = "  ".length();
        SpdySessionHandler.lllIllllllIlIl[6] = (38 + 13 + 80 + 29 ^ 80 + 61 - 110 + 133);
        SpdySessionHandler.lllIllllllIlIl[7] = (0x1E ^ 0x19);
        SpdySessionHandler.lllIllllllIlIl[8] = "   ".length();
        SpdySessionHandler.lllIllllllIlIl[9] = (0xC6 ^ 0x92 ^ (0x1C ^ 0x40));
    }
    
    private static boolean lIlIIllIIlIIlIlI(final int llllllllllllIlIlIllllIlIIIIIlIlI, final int llllllllllllIlIlIllllIlIIIIIlIIl) {
        return llllllllllllIlIlIllllIlIIIIIlIlI != llllllllllllIlIlIllllIlIIIIIlIIl;
    }
    
    private synchronized ChannelFuture sendGoAwayFrame(final ChannelHandlerContext llllllllllllIlIlIllllIlIIlllIIIl, final SpdySessionStatus llllllllllllIlIlIllllIlIIlllIlII) {
        if (lIlIIllIIlIIIllI(this.sentGoAwayFrame ? 1 : 0)) {
            this.sentGoAwayFrame = (SpdySessionHandler.lllIllllllIlIl[3] != 0);
            final SpdyGoAwayFrame llllllllllllIlIlIllllIlIIllllIIl = new DefaultSpdyGoAwayFrame(this.lastGoodStreamId, llllllllllllIlIlIllllIlIIlllIlII);
            return llllllllllllIlIlIllllIlIIlllIIIl.writeAndFlush(llllllllllllIlIlIllllIlIIllllIIl);
        }
        return llllllllllllIlIlIllllIlIIlllIIIl.newSucceededFuture();
    }
    
    private static String lIlIIllIIIllIIll(final String llllllllllllIlIlIllllIlIIlIlIlIl, final String llllllllllllIlIlIllllIlIIlIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllIlIIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), SpdySessionHandler.lllIllllllIlIl[9]), "DES");
            final Cipher llllllllllllIlIlIllllIlIIlIlIlll = Cipher.getInstance("DES");
            llllllllllllIlIlIllllIlIIlIlIlll.init(SpdySessionHandler.lllIllllllIlIl[5], llllllllllllIlIlIllllIlIIlIllIII);
            return new String(llllllllllllIlIlIllllIlIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllIlIIlIlIllI) {
            llllllllllllIlIlIllllIlIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void close(final ChannelHandlerContext llllllllllllIlIlIllllIllIlIllIll, final ChannelPromise llllllllllllIlIlIllllIllIlIllIlI) throws Exception {
        this.sendGoAwayFrame(llllllllllllIlIlIllllIllIlIllIll, llllllllllllIlIlIllllIllIlIllIlI);
    }
    
    private static void lIlIIllIIIllIlII() {
        (lllIlllllIlllI = new String[SpdySessionHandler.lllIllllllIlIl[6]])[SpdySessionHandler.lllIllllllIlIl[2]] = lIlIIllIIIllIIII("m3jfvI+8VAk=", "GqoGy");
        SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[3]] = lIlIIllIIIllIIlI("KRQWHR81HzcLFT8YEwshMx8BAQEJGB8L", "Zqenv");
        SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[5]] = lIlIIllIIIllIIlI("EwQQCxUTDkY6MDQtRiM9QEo=", "zjfjy");
        SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[8]] = lIlIIllIIIllIIll("fzrytMtEIsE3dHd/Hjg4Vw==", "qajuM");
    }
    
    private static boolean lIlIIllIIlIIIIlI(final Object llllllllllllIlIlIllllIlIIIIlIlll) {
        return llllllllllllIlIlIllllIlIIIIlIlll == null;
    }
    
    private static boolean lIlIIllIIlIIIlII(final int llllllllllllIlIlIllllIlIIIIlIlIl) {
        return llllllllllllIlIlIllllIlIIIIlIlIl != 0;
    }
    
    @Override
    public void write(final ChannelHandlerContext llllllllllllIlIlIllllIllIlIIllIl, final Object llllllllllllIlIlIllllIllIlIlIIII, final ChannelPromise llllllllllllIlIlIllllIllIlIIlIll) throws Exception {
        if (!lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyDataFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdySynStreamFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdySynReplyFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyRstStreamFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdySettingsFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyPingFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyGoAwayFrame) ? 1 : 0) || !lIlIIllIIlIIIllI((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyHeadersFrame) ? 1 : 0) || lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlIlIIII instanceof SpdyWindowUpdateFrame) ? 1 : 0)) {
            this.handleOutboundMessage(llllllllllllIlIlIllllIllIlIIllIl, llllllllllllIlIlIllllIllIlIlIIII, llllllllllllIlIlIllllIllIlIIlIll);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIlIlIllllIllIlIIllIl.write(llllllllllllIlIlIllllIllIlIlIIII, llllllllllllIlIlIllllIllIlIIlIll);
            "".length();
        }
    }
    
    private static boolean lIlIIllIIlIIlIIl(final int llllllllllllIlIlIllllIlIIIIlIIIl) {
        return llllllllllllIlIlIllllIlIIIIlIIIl >= 0;
    }
    
    private void removeStream(final int llllllllllllIlIlIllllIlIlIlllIll, final ChannelFuture llllllllllllIlIlIllllIlIlIlllIlI) {
        this.spdySession.removeStream(llllllllllllIlIlIllllIlIlIlllIll, SpdySessionHandler.STREAM_CLOSED, this.isRemoteInitiatedId(llllllllllllIlIlIllllIlIlIlllIll));
        if (lIlIIllIIlIIlllI(this.closeSessionFutureListener) && lIlIIllIIlIIIlII(this.spdySession.noActiveStreams() ? 1 : 0)) {
            llllllllllllIlIlIllllIlIlIlllIlI.addListener((GenericFutureListener<? extends Future<? super Void>>)this.closeSessionFutureListener);
            "".length();
        }
    }
    
    private boolean isRemoteInitiatedId(final int llllllllllllIlIlIllllIlIllllIlII) {
        final boolean llllllllllllIlIlIllllIlIllllIllI = SpdyCodecUtil.isServerId(llllllllllllIlIlIllllIlIllllIlII);
        int n;
        if ((lIlIIllIIlIIIlII(this.server ? 1 : 0) && !lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIllllIllI ? 1 : 0)) || (lIlIIllIIlIIIllI(this.server ? 1 : 0) && lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIllllIllI ? 1 : 0))) {
            n = SpdySessionHandler.lllIllllllIlIl[3];
            "".length();
            if (null != null) {
                return ((0x77 ^ 0x57 ^ (0xE6 ^ 0x8A)) & (0xE7 ^ 0xAB ^ ((0x19 ^ 0x6) & ~(0x27 ^ 0x38)) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdySessionHandler.lllIllllllIlIl[2];
        }
        return n != 0;
    }
    
    private void updateSendWindowSize(final ChannelHandlerContext llllllllllllIlIlIllllIlIlIIlllll, final int llllllllllllIlIlIllllIlIlIlIIIlI, final int llllllllllllIlIlIllllIlIlIlIIIIl) {
        this.spdySession.updateSendWindowSize(llllllllllllIlIlIllllIlIlIlIIIlI, llllllllllllIlIlIllllIlIlIlIIIIl);
        "".length();
        do {
            final SpdySession.PendingWrite llllllllllllIlIlIllllIlIlIlIlIlI = this.spdySession.getPendingWrite(llllllllllllIlIlIllllIlIlIlIIIlI);
            if (lIlIIllIIlIIIIlI(llllllllllllIlIlIllllIlIlIlIlIlI)) {
                return;
            }
            final SpdyDataFrame llllllllllllIlIlIllllIlIlIlIlIIl = llllllllllllIlIlIllllIlIlIlIlIlI.spdyDataFrame;
            final int llllllllllllIlIlIllllIlIlIlIlIII = llllllllllllIlIlIllllIlIlIlIlIIl.content().readableBytes();
            final int llllllllllllIlIlIllllIlIlIlIIlll = llllllllllllIlIlIllllIlIlIlIlIIl.streamId();
            int llllllllllllIlIlIllllIlIlIlIIllI = this.spdySession.getSendWindowSize(llllllllllllIlIlIllllIlIlIlIIlll);
            final int llllllllllllIlIlIllllIlIlIlIIlIl = this.spdySession.getSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2]);
            llllllllllllIlIlIllllIlIlIlIIllI = Math.min(llllllllllllIlIlIllllIlIlIlIIllI, llllllllllllIlIlIllllIlIlIlIIlIl);
            if (lIlIIllIIlIIlIll(llllllllllllIlIlIllllIlIlIlIIllI)) {
                return;
            }
            if (lIlIIllIIlIIIlll(llllllllllllIlIlIllllIlIlIlIIllI, llllllllllllIlIlIllllIlIlIlIlIII)) {
                this.spdySession.updateSendWindowSize(llllllllllllIlIlIllllIlIlIlIIlll, SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIlIlIlIIllI);
                "".length();
                this.spdySession.updateSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2], SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIlIlIlIIllI);
                "".length();
                final SpdyDataFrame llllllllllllIlIlIllllIlIlIlIlIll = new DefaultSpdyDataFrame(llllllllllllIlIlIllllIlIlIlIIlll, llllllllllllIlIlIllllIlIlIlIlIIl.content().readSlice(llllllllllllIlIlIllllIlIlIlIIllI).retain());
                llllllllllllIlIlIllllIlIlIIlllll.writeAndFlush(llllllllllllIlIlIllllIlIlIlIlIll).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIlllIlIllllIllIlIlll) throws Exception {
                        if (lIIIlIIlIIIllIlI(llllllllllllIlllIlIllllIllIlIlll.isSuccess() ? 1 : 0)) {
                            SpdySessionHandler.this.issueSessionError(llllllllllllIlIlIllllIlIlIIlllll, SpdySessionStatus.INTERNAL_ERROR);
                        }
                    }
                    
                    private static boolean lIIIlIIlIIIllIlI(final int llllllllllllIlllIlIllllIllIIllll) {
                        return llllllllllllIlllIlIllllIllIIllll == 0;
                    }
                });
                "".length();
                "".length();
                if (((199 + 188 - 364 + 221 ^ 45 + 32 - 71 + 177) & (0x3B ^ 0x47 ^ (0x37 ^ 0x8) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                this.spdySession.removePendingWrite(llllllllllllIlIlIllllIlIlIlIIlll);
                "".length();
                this.spdySession.updateSendWindowSize(llllllllllllIlIlIllllIlIlIlIIlll, SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIlIlIlIlIII);
                "".length();
                this.spdySession.updateSendWindowSize(SpdySessionHandler.lllIllllllIlIl[2], SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIlIlIlIlIII);
                "".length();
                if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIlIlIlIIl.isLast() ? 1 : 0)) {
                    this.halfCloseStream(llllllllllllIlIlIllllIlIlIlIIlll, (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0), llllllllllllIlIlIllllIlIlIlIlIlI.promise);
                }
                llllllllllllIlIlIllllIlIlIIlllll.writeAndFlush(llllllllllllIlIlIllllIlIlIlIlIIl, llllllllllllIlIlIllllIlIlIlIlIlI.promise).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    private static boolean lllIIIIIlIlIlll(final int lllllllllllllIIlIIIIllllIlIIIllI) {
                        return lllllllllllllIIlIIIIllllIlIIIllI == 0;
                    }
                    
                    @Override
                    public void operationComplete(final ChannelFuture lllllllllllllIIlIIIIllllIlIlIIII) throws Exception {
                        if (lllIIIIIlIlIlll(lllllllllllllIIlIIIIllllIlIlIIII.isSuccess() ? 1 : 0)) {
                            SpdySessionHandler.this.issueSessionError(llllllllllllIlIlIllllIlIlIIlllll, SpdySessionStatus.INTERNAL_ERROR);
                        }
                    }
                });
                "".length();
            }
            "".length();
        } while ((0x1 ^ 0x45 ^ (0x86 ^ 0xC6)) > ((44 + 100 - 125 + 119 ^ 66 + 53 - 101 + 179) & (0x51 ^ 0x1C ^ "  ".length() ^ -" ".length())));
    }
    
    private synchronized boolean acceptStream(final int llllllllllllIlIlIllllIlIllIllIII, final byte llllllllllllIlIlIllllIlIllIlIlll, final boolean llllllllllllIlIlIllllIlIllIIllll, final boolean llllllllllllIlIlIllllIlIllIIlllI) {
        if (!lIlIIllIIlIIIllI(this.receivedGoAwayFrame ? 1 : 0) || lIlIIllIIlIIIlII(this.sentGoAwayFrame ? 1 : 0)) {
            return SpdySessionHandler.lllIllllllIlIl[2] != 0;
        }
        final boolean llllllllllllIlIlIllllIlIllIlIlII = this.isRemoteInitiatedId(llllllllllllIlIlIllllIlIllIllIII);
        int n;
        if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIllIlIlII ? 1 : 0)) {
            n = this.localConcurrentStreams;
            "".length();
            if (null != null) {
                return ((0xBC ^ 0x9C ^ (0x5B ^ 0x2A)) & (0x60 ^ 0x37 ^ (0xA1 ^ 0xA7) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = this.remoteConcurrentStreams;
        }
        final int llllllllllllIlIlIllllIlIllIlIIll = n;
        if (lIlIIllIIlIIllII(this.spdySession.numActiveStreams(llllllllllllIlIlIllllIlIllIlIlII), llllllllllllIlIlIllllIlIllIlIIll)) {
            return SpdySessionHandler.lllIllllllIlIl[2] != 0;
        }
        this.spdySession.acceptStream(llllllllllllIlIlIllllIlIllIllIII, llllllllllllIlIlIllllIlIllIlIlll, llllllllllllIlIlIllllIlIllIIllll, llllllllllllIlIlIllllIlIllIIlllI, this.initialSendWindowSize, this.initialReceiveWindowSize, llllllllllllIlIlIllllIlIllIlIlII);
        if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlIllIlIlII ? 1 : 0)) {
            this.lastGoodStreamId = llllllllllllIlIlIllllIlIllIllIII;
        }
        return SpdySessionHandler.lllIllllllIlIl[3] != 0;
    }
    
    public SpdySessionHandler(final SpdyVersion llllllllllllIlIlIllllIlllIllIIlI, final boolean llllllllllllIlIlIllllIlllIllIIIl) {
        this.initialSendWindowSize = SpdySessionHandler.lllIllllllIlIl[0];
        this.initialReceiveWindowSize = SpdySessionHandler.lllIllllllIlIl[0];
        this.initialSessionReceiveWindowSize = SpdySessionHandler.lllIllllllIlIl[0];
        this.spdySession = new SpdySession(this.initialSendWindowSize, this.initialReceiveWindowSize);
        this.remoteConcurrentStreams = SpdySessionHandler.lllIllllllIlIl[1];
        this.localConcurrentStreams = SpdySessionHandler.lllIllllllIlIl[1];
        this.pings = new AtomicInteger();
        if (lIlIIllIIlIIIIlI(llllllllllllIlIlIllllIlllIllIIlI)) {
            throw new NullPointerException(SpdySessionHandler.lllIlllllIlllI[SpdySessionHandler.lllIllllllIlIl[2]]);
        }
        this.server = llllllllllllIlIlIllllIlllIllIIIl;
        this.minorVersion = llllllllllllIlIlIllllIlllIllIIlI.getMinorVersion();
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIlIlIllllIllIlllllIl, final Object llllllllllllIlIlIllllIllIlllllll) throws Exception {
        if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyDataFrame) ? 1 : 0)) {
            final SpdyDataFrame llllllllllllIlIlIllllIlllIIllIII = (SpdyDataFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIlIlll = llllllllllllIlIlIllllIlllIIllIII.streamId();
            final int llllllllllllIlIlIllllIlllIIlIllI = SpdySessionHandler.lllIllllllIlIl[4] * llllllllllllIlIlIllllIlllIIllIII.content().readableBytes();
            final int llllllllllllIlIlIllllIlllIIlIlIl = this.spdySession.updateReceiveWindowSize(SpdySessionHandler.lllIllllllIlIl[2], llllllllllllIlIlIllllIlllIIlIllI);
            if (lIlIIllIIlIIIIll(llllllllllllIlIlIllllIlllIIlIlIl)) {
                this.issueSessionError(llllllllllllIlIlIllllIllIlllllIl, SpdySessionStatus.PROTOCOL_ERROR);
                return;
            }
            if (lIlIIllIIlIIIlIl(llllllllllllIlIlIllllIlllIIlIlIl, this.initialSessionReceiveWindowSize / SpdySessionHandler.lllIllllllIlIl[5])) {
                final int llllllllllllIlIlIllllIlllIIlllIl = this.initialSessionReceiveWindowSize - llllllllllllIlIlIllllIlllIIlIlIl;
                this.spdySession.updateReceiveWindowSize(SpdySessionHandler.lllIllllllIlIl[2], llllllllllllIlIlIllllIlllIIlllIl);
                "".length();
                final SpdyWindowUpdateFrame llllllllllllIlIlIllllIlllIIlllII = new DefaultSpdyWindowUpdateFrame(SpdySessionHandler.lllIllllllIlIl[2], llllllllllllIlIlIllllIlllIIlllIl);
                llllllllllllIlIlIllllIllIlllllIl.writeAndFlush(llllllllllllIlIlIllllIlllIIlllII);
                "".length();
            }
            if (lIlIIllIIlIIIllI(this.spdySession.isActiveStream(llllllllllllIlIlIllllIlllIIlIlll) ? 1 : 0)) {
                llllllllllllIlIlIllllIlllIIllIII.release();
                "".length();
                if (lIlIIllIIlIIIlIl(llllllllllllIlIlIllllIlllIIlIlll, this.lastGoodStreamId)) {
                    this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIlll, SpdyStreamStatus.PROTOCOL_ERROR);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIlIIllIIlIIIllI(this.sentGoAwayFrame ? 1 : 0)) {
                    this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIlll, SpdyStreamStatus.INVALID_STREAM);
                }
                return;
            }
            if (lIlIIllIIlIIIlII(this.spdySession.isRemoteSideClosed(llllllllllllIlIlIllllIlllIIlIlll) ? 1 : 0)) {
                llllllllllllIlIlIllllIlllIIllIII.release();
                "".length();
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIlll, SpdyStreamStatus.STREAM_ALREADY_CLOSED);
                return;
            }
            if (lIlIIllIIlIIIllI(this.isRemoteInitiatedId(llllllllllllIlIlIllllIlllIIlIlll) ? 1 : 0) && lIlIIllIIlIIIllI(this.spdySession.hasReceivedReply(llllllllllllIlIlIllllIlllIIlIlll) ? 1 : 0)) {
                llllllllllllIlIlIllllIlllIIllIII.release();
                "".length();
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIlll, SpdyStreamStatus.PROTOCOL_ERROR);
                return;
            }
            final int llllllllllllIlIlIllllIlllIIlIlII = this.spdySession.updateReceiveWindowSize(llllllllllllIlIlIllllIlllIIlIlll, llllllllllllIlIlIllllIlllIIlIllI);
            if (lIlIIllIIlIIIlll(llllllllllllIlIlIllllIlllIIlIlII, this.spdySession.getReceiveWindowSizeLowerBound(llllllllllllIlIlIllllIlllIIlIlll))) {
                llllllllllllIlIlIllllIlllIIllIII.release();
                "".length();
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIlll, SpdyStreamStatus.FLOW_CONTROL_ERROR);
                return;
            }
            if (lIlIIllIIlIIIIll(llllllllllllIlIlIllllIlllIIlIlII)) {
                while (lIlIIllIIlIIlIII(llllllllllllIlIlIllllIlllIIllIII.content().readableBytes(), this.initialReceiveWindowSize)) {
                    final SpdyDataFrame llllllllllllIlIlIllllIlllIIllIll = new DefaultSpdyDataFrame(llllllllllllIlIlIllllIlllIIlIlll, llllllllllllIlIlIllllIlllIIllIII.content().readSlice(this.initialReceiveWindowSize).retain());
                    llllllllllllIlIlIllllIllIlllllIl.writeAndFlush(llllllllllllIlIlIllllIlllIIllIll);
                    "".length();
                    "".length();
                    if (((0x5D ^ 0x3A ^ (0x21 ^ 0x6)) & (0xB6 ^ 0xC4 ^ (0x65 ^ 0x57) ^ -" ".length())) < ((0xC ^ 0x39 ^ (0x37 ^ 0x19)) & (103 + 81 - 82 + 70 ^ 86 + 16 + 35 + 46 ^ -" ".length()))) {
                        return;
                    }
                }
            }
            if (lIlIIllIIlIIIlIl(llllllllllllIlIlIllllIlllIIlIlII, this.initialReceiveWindowSize / SpdySessionHandler.lllIllllllIlIl[5]) && lIlIIllIIlIIIllI(llllllllllllIlIlIllllIlllIIllIII.isLast() ? 1 : 0)) {
                final int llllllllllllIlIlIllllIlllIIllIlI = this.initialReceiveWindowSize - llllllllllllIlIlIllllIlllIIlIlII;
                this.spdySession.updateReceiveWindowSize(llllllllllllIlIlIllllIlllIIlIlll, llllllllllllIlIlIllllIlllIIllIlI);
                "".length();
                final SpdyWindowUpdateFrame llllllllllllIlIlIllllIlllIIllIIl = new DefaultSpdyWindowUpdateFrame(llllllllllllIlIlIllllIlllIIlIlll, llllllllllllIlIlIllllIlllIIllIlI);
                llllllllllllIlIlIllllIllIlllllIl.writeAndFlush(llllllllllllIlIlIllllIlllIIllIIl);
                "".length();
            }
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIllIII.isLast() ? 1 : 0)) {
                this.halfCloseStream(llllllllllllIlIlIllllIlllIIlIlll, (boolean)(SpdySessionHandler.lllIllllllIlIl[3] != 0), llllllllllllIlIlIllllIllIlllllIl.newSucceededFuture());
            }
            "".length();
            if (" ".length() == ((0x42 ^ 0x1D ^ (0x6A ^ 0x25)) & (0x2B ^ 0x11 ^ (0x1A ^ 0x30) ^ -" ".length()))) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdySynStreamFrame) ? 1 : 0)) {
            final SpdySynStreamFrame llllllllllllIlIlIllllIlllIIlIIll = (SpdySynStreamFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIlIIlI = llllllllllllIlIlIllllIlllIIlIIll.streamId();
            if (!lIlIIllIIlIIIllI(llllllllllllIlIlIllllIlllIIlIIll.isInvalid() ? 1 : 0) || !lIlIIllIIlIIIlII(this.isRemoteInitiatedId(llllllllllllIlIlIllllIlllIIlIIlI) ? 1 : 0) || lIlIIllIIlIIIlII(this.spdySession.isActiveStream(llllllllllllIlIlIllllIlllIIlIIlI) ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIIlI, SpdyStreamStatus.PROTOCOL_ERROR);
                return;
            }
            if (lIlIIllIIlIIIlIl(llllllllllllIlIlIllllIlllIIlIIlI, this.lastGoodStreamId)) {
                this.issueSessionError(llllllllllllIlIlIllllIllIlllllIl, SpdySessionStatus.PROTOCOL_ERROR);
                return;
            }
            final byte llllllllllllIlIlIllllIlllIIlIIIl = llllllllllllIlIlIllllIlllIIlIIll.priority();
            final boolean llllllllllllIlIlIllllIlllIIlIIII = llllllllllllIlIlIllllIlllIIlIIll.isLast();
            final boolean llllllllllllIlIlIllllIlllIIIllll = llllllllllllIlIlIllllIlllIIlIIll.isUnidirectional();
            if (lIlIIllIIlIIIllI(this.acceptStream(llllllllllllIlIlIllllIlllIIlIIlI, llllllllllllIlIlIllllIlllIIlIIIl, llllllllllllIlIlIllllIlllIIlIIII, llllllllllllIlIlIllllIlllIIIllll) ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIlIIlI, SpdyStreamStatus.REFUSED_STREAM);
                return;
            }
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdySynReplyFrame) ? 1 : 0)) {
            final SpdySynReplyFrame llllllllllllIlIlIllllIlllIIIlllI = (SpdySynReplyFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIIllIl = llllllllllllIlIlIllllIlllIIIlllI.streamId();
            if (!lIlIIllIIlIIIllI(llllllllllllIlIlIllllIlllIIIlllI.isInvalid() ? 1 : 0) || !lIlIIllIIlIIIllI(this.isRemoteInitiatedId(llllllllllllIlIlIllllIlllIIIllIl) ? 1 : 0) || lIlIIllIIlIIIlII(this.spdySession.isRemoteSideClosed(llllllllllllIlIlIllllIlllIIIllIl) ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIllIl, SpdyStreamStatus.INVALID_STREAM);
                return;
            }
            if (lIlIIllIIlIIIlII(this.spdySession.hasReceivedReply(llllllllllllIlIlIllllIlllIIIllIl) ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIllIl, SpdyStreamStatus.STREAM_IN_USE);
                return;
            }
            this.spdySession.receivedReply(llllllllllllIlIlIllllIlllIIIllIl);
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIIlllI.isLast() ? 1 : 0)) {
                this.halfCloseStream(llllllllllllIlIlIllllIlllIIIllIl, (boolean)(SpdySessionHandler.lllIllllllIlIl[3] != 0), llllllllllllIlIlIllllIllIlllllIl.newSucceededFuture());
            }
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyRstStreamFrame) ? 1 : 0)) {
            final SpdyRstStreamFrame llllllllllllIlIlIllllIlllIIIllII = (SpdyRstStreamFrame)llllllllllllIlIlIllllIllIlllllll;
            this.removeStream(llllllllllllIlIlIllllIlllIIIllII.streamId(), llllllllllllIlIlIllllIllIlllllIl.newSucceededFuture());
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdySettingsFrame) ? 1 : 0)) {
            final SpdySettingsFrame llllllllllllIlIlIllllIlllIIIlIll = (SpdySettingsFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIIlIlI = llllllllllllIlIlIllllIlllIIIlIll.getValue(SpdySessionHandler.lllIllllllIlIl[2]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIlllIIIlIlI) && lIlIIllIIlIIlIlI(llllllllllllIlIlIllllIlllIIIlIlI, this.minorVersion)) {
                this.issueSessionError(llllllllllllIlIlIllllIllIlllllIl, SpdySessionStatus.PROTOCOL_ERROR);
                return;
            }
            final int llllllllllllIlIlIllllIlllIIIlIIl = llllllllllllIlIlIllllIlllIIIlIll.getValue(SpdySessionHandler.lllIllllllIlIl[6]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIlllIIIlIIl)) {
                this.remoteConcurrentStreams = llllllllllllIlIlIllllIlllIIIlIIl;
            }
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIIlIll.isPersisted(SpdySessionHandler.lllIllllllIlIl[7]) ? 1 : 0)) {
                llllllllllllIlIlIllllIlllIIIlIll.removeValue(SpdySessionHandler.lllIllllllIlIl[7]);
                "".length();
            }
            llllllllllllIlIlIllllIlllIIIlIll.setPersistValue(SpdySessionHandler.lllIllllllIlIl[7], (boolean)(SpdySessionHandler.lllIllllllIlIl[2] != 0));
            "".length();
            final int llllllllllllIlIlIllllIlllIIIlIII = llllllllllllIlIlIllllIlllIIIlIll.getValue(SpdySessionHandler.lllIllllllIlIl[7]);
            if (lIlIIllIIlIIlIIl(llllllllllllIlIlIllllIlllIIIlIII)) {
                this.updateInitialSendWindowSize(llllllllllllIlIlIllllIlllIIIlIII);
            }
            "".length();
            if (((0x4B ^ 0x71 ^ (0x54 ^ 0x29)) & (0xDE ^ 0xC3 ^ (0xF9 ^ 0xA3) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyPingFrame) ? 1 : 0)) {
            final SpdyPingFrame llllllllllllIlIlIllllIlllIIIIlll = (SpdyPingFrame)llllllllllllIlIlIllllIllIlllllll;
            if (lIlIIllIIlIIIlII(this.isRemoteInitiatedId(llllllllllllIlIlIllllIlllIIIIlll.id()) ? 1 : 0)) {
                llllllllllllIlIlIllllIllIlllllIl.writeAndFlush(llllllllllllIlIlIllllIlllIIIIlll);
                "".length();
                return;
            }
            if (lIlIIllIIlIIIllI(this.pings.get())) {
                return;
            }
            this.pings.getAndDecrement();
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyGoAwayFrame) ? 1 : 0)) {
            this.receivedGoAwayFrame = (SpdySessionHandler.lllIllllllIlIl[3] != 0);
            "".length();
            if (((0x74 ^ 0x39) & ~(0x75 ^ 0x38)) != 0x0) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyHeadersFrame) ? 1 : 0)) {
            final SpdyHeadersFrame llllllllllllIlIlIllllIlllIIIIllI = (SpdyHeadersFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIIIlIl = llllllllllllIlIlIllllIlllIIIIllI.streamId();
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIIIllI.isInvalid() ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIIlIl, SpdyStreamStatus.PROTOCOL_ERROR);
                return;
            }
            if (lIlIIllIIlIIIlII(this.spdySession.isRemoteSideClosed(llllllllllllIlIlIllllIlllIIIIlIl) ? 1 : 0)) {
                this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIIlIl, SpdyStreamStatus.INVALID_STREAM);
                return;
            }
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIIIllI.isLast() ? 1 : 0)) {
                this.halfCloseStream(llllllllllllIlIlIllllIlllIIIIlIl, (boolean)(SpdySessionHandler.lllIllllllIlIl[3] != 0), llllllllllllIlIlIllllIllIlllllIl.newSucceededFuture());
            }
            "".length();
            if ((0x23 ^ 0x27) < " ".length()) {
                return;
            }
        }
        else if (lIlIIllIIlIIIlII((llllllllllllIlIlIllllIllIlllllll instanceof SpdyWindowUpdateFrame) ? 1 : 0)) {
            final SpdyWindowUpdateFrame llllllllllllIlIlIllllIlllIIIIlII = (SpdyWindowUpdateFrame)llllllllllllIlIlIllllIllIlllllll;
            final int llllllllllllIlIlIllllIlllIIIIIll = llllllllllllIlIlIllllIlllIIIIlII.streamId();
            final int llllllllllllIlIlIllllIlllIIIIIlI = llllllllllllIlIlIllllIlllIIIIlII.deltaWindowSize();
            if (lIlIIllIIlIIIlII(llllllllllllIlIlIllllIlllIIIIIll) && lIlIIllIIlIIIlII(this.spdySession.isLocalSideClosed(llllllllllllIlIlIllllIlllIIIIIll) ? 1 : 0)) {
                return;
            }
            if (lIlIIllIIlIIlIII(this.spdySession.getSendWindowSize(llllllllllllIlIlIllllIlllIIIIIll), SpdySessionHandler.lllIllllllIlIl[1] - llllllllllllIlIlIllllIlllIIIIIlI)) {
                if (lIlIIllIIlIIIllI(llllllllllllIlIlIllllIlllIIIIIll)) {
                    this.issueSessionError(llllllllllllIlIlIllllIllIlllllIl, SpdySessionStatus.PROTOCOL_ERROR);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    this.issueStreamError(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIIIll, SpdyStreamStatus.FLOW_CONTROL_ERROR);
                }
                return;
            }
            this.updateSendWindowSize(llllllllllllIlIlIllllIllIlllllIl, llllllllllllIlIlIllllIlllIIIIIll, llllllllllllIlIlIllllIlllIIIIIlI);
        }
        llllllllllllIlIlIllllIllIlllllIl.fireChannelRead(llllllllllllIlIlIllllIllIlllllll);
        "".length();
    }
    
    private static boolean lIlIIllIIlIIIlll(final int llllllllllllIlIlIllllIlIIIlIIlII, final int llllllllllllIlIlIllllIlIIIlIIIll) {
        return llllllllllllIlIlIllllIlIIIlIIlII < llllllllllllIlIlIllllIlIIIlIIIll;
    }
    
    private void issueSessionError(final ChannelHandlerContext llllllllllllIlIlIllllIllIIIlIIlI, final SpdySessionStatus llllllllllllIlIlIllllIllIIIlIlII) {
        this.sendGoAwayFrame(llllllllllllIlIlIllllIllIIIlIIlI, llllllllllllIlIlIllllIllIIIlIlII).addListener((GenericFutureListener<? extends Future<? super Void>>)new ClosingChannelFutureListener(llllllllllllIlIlIllllIllIIIlIIlI, llllllllllllIlIlIllllIllIIIlIIlI.newPromise()));
        "".length();
    }
    
    private static boolean lIlIIllIIlIIllII(final int llllllllllllIlIlIllllIlIIIlIlIII, final int llllllllllllIlIlIllllIlIIIlIIlll) {
        return llllllllllllIlIlIllllIlIIIlIlIII >= llllllllllllIlIlIllllIlIIIlIIlll;
    }
    
    private static final class ClosingChannelFutureListener implements ChannelFutureListener
    {
        private final /* synthetic */ ChannelHandlerContext ctx;
        private final /* synthetic */ ChannelPromise promise;
        
        @Override
        public void operationComplete(final ChannelFuture lllllllllllllIIlIIIlIlIlIlIllIIl) throws Exception {
            this.ctx.close(this.promise);
            "".length();
        }
        
        ClosingChannelFutureListener(final ChannelHandlerContext lllllllllllllIIlIIIlIlIlIllIIIII, final ChannelPromise lllllllllllllIIlIIIlIlIlIlIlllII) {
            this.ctx = lllllllllllllIIlIIIlIlIlIllIIIII;
            this.promise = lllllllllllllIIlIIIlIlIlIlIlllII;
        }
    }
}
