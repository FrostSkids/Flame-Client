// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.UnsupportedMessageTypeException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import java.net.SocketAddress;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.handler.codec.ByteToMessageDecoder;

public class SpdyFrameCodec extends ByteToMessageDecoder implements SpdyFrameDecoderDelegate, ChannelOutboundHandler
{
    private /* synthetic */ SpdySettingsFrame spdySettingsFrame;
    private static final /* synthetic */ SpdyProtocolException INVALID_FRAME;
    private final /* synthetic */ SpdyHeaderBlockDecoder spdyHeaderBlockDecoder;
    private static final /* synthetic */ String[] lIIllIlIllIlIl;
    private final /* synthetic */ SpdyFrameDecoder spdyFrameDecoder;
    private /* synthetic */ SpdyHeadersFrame spdyHeadersFrame;
    private final /* synthetic */ SpdyHeaderBlockEncoder spdyHeaderBlockEncoder;
    private static final /* synthetic */ int[] lIIllIlIllIllI;
    private /* synthetic */ ChannelHandlerContext ctx;
    private final /* synthetic */ SpdyFrameEncoder spdyFrameEncoder;
    
    @Override
    public void readGoAwayFrame(final int lllllllllllllIIlIIllIlllllllIllI, final int lllllllllllllIIlIIllIlllllllIlIl) {
        final SpdyGoAwayFrame lllllllllllllIIlIIllIllllllllIII = new DefaultSpdyGoAwayFrame(lllllllllllllIIlIIllIlllllllIllI, lllllllllllllIIlIIllIlllllllIlIl);
        this.ctx.fireChannelRead(lllllllllllllIIlIIllIllllllllIII);
        "".length();
    }
    
    @Override
    public void readSetting(final int lllllllllllllIIlIIlllIIIIIIlIIlI, final int lllllllllllllIIlIIlllIIIIIIlIIIl, final boolean lllllllllllllIIlIlIlIIIllIllllll, final boolean lllllllllllllIIlIIlllIIIIIIlIlII) {
        this.spdySettingsFrame.setValue(lllllllllllllIIlIIlllIIIIIIlIIlI, lllllllllllllIIlIIlllIIIIIIlIIIl, lllllllllllllIIlIlIlIIIllIllllll, lllllllllllllIIlIIlllIIIIIIlIlII);
        "".length();
    }
    
    @Override
    public void readHeaderBlockEnd() {
        Object lllllllllllllIIlIIllIlllllIIlllI = null;
        try {
            this.spdyHeaderBlockDecoder.endHeaderBlock(this.spdyHeadersFrame);
            lllllllllllllIIlIIllIlllllIIlllI = this.spdyHeadersFrame;
            this.spdyHeadersFrame = null;
            "".length();
            if ((0xB7 ^ 0xB3) == -" ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIlIIllIlllllIlIIII) {
            this.ctx.fireExceptionCaught(lllllllllllllIIlIIllIlllllIlIIII);
            "".length();
        }
        if (llIllIIlIlIIIII(lllllllllllllIIlIIllIlllllIIlllI)) {
            this.ctx.fireChannelRead(lllllllllllllIIlIIllIlllllIIlllI);
            "".length();
        }
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlllllll) throws Exception {
        super.handlerAdded(lllllllllllllIIlIlIlIIlIIlllllll);
        this.ctx = lllllllllllllIIlIlIlIIlIIlllllll;
        lllllllllllllIIlIlIlIIlIIlllllll.channel().closeFuture().addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            @Override
            public void operationComplete(final ChannelFuture llllllllllllIlllIIIIIlIlIIlllllI) throws Exception {
                SpdyFrameCodec.this.spdyHeaderBlockDecoder.end();
                SpdyFrameCodec.this.spdyHeaderBlockEncoder.end();
            }
        });
        "".length();
    }
    
    @Override
    public void flush(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlIIIIIl) throws Exception {
        lllllllllllllIIlIlIlIIlIIlIIIIIl.flush();
        "".length();
    }
    
    @Override
    public void readSettingsEnd() {
        final Object lllllllllllllIIlIIlllIIIIIIIlIll = this.spdySettingsFrame;
        this.spdySettingsFrame = null;
        this.ctx.fireChannelRead(lllllllllllllIIlIIlllIIIIIIIlIll);
        "".length();
    }
    
    @Override
    public void readFrameError(final String lllllllllllllIIlIIllIlllllIIlIII) {
        this.ctx.fireExceptionCaught(SpdyFrameCodec.INVALID_FRAME);
        "".length();
    }
    
    @Override
    public void read(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlIIIlIl) throws Exception {
        lllllllllllllIIlIlIlIIlIIlIIIlIl.read();
        "".length();
    }
    
    @Override
    public void close(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlIlIIIl, final ChannelPromise lllllllllllllIIlIlIlIIlIIlIlIIlI) throws Exception {
        lllllllllllllIIlIlIlIIlIIlIlIIIl.close(lllllllllllllIIlIlIlIIlIIlIlIIlI);
        "".length();
    }
    
    static {
        llIllIIlIIllllI();
        llIllIIlIIlllIl();
        INVALID_FRAME = new SpdyProtocolException(SpdyFrameCodec.lIIllIlIllIlIl[SpdyFrameCodec.lIIllIlIllIllI[5]]);
    }
    
    @Override
    public void readSettingsFrame(final boolean lllllllllllllIIlIlIlIIIlllIIlIII) {
        this.spdySettingsFrame = new DefaultSpdySettingsFrame();
        this.spdySettingsFrame.setClearPreviouslyPersistedSettings(lllllllllllllIIlIlIlIIIlllIIlIII);
        "".length();
    }
    
    private static void llIllIIlIIlllIl() {
        (lIIllIlIllIlIl = new String[SpdyFrameCodec.lIIllIlIllIllI[6]])[SpdyFrameCodec.lIIllIlIllIllI[5]] = llIllIIlIIllIlI("k+XbSp8ZxD4G4dZ4dX5A1vN/ogyoecAi", "XAImI");
    }
    
    @Override
    public void readRstStreamFrame(final int lllllllllllllIIlIlIlIIIlllIlIllI, final int lllllllllllllIIlIlIlIIIlllIllIlI) {
        final SpdyRstStreamFrame lllllllllllllIIlIlIlIIIlllIllIIl = new DefaultSpdyRstStreamFrame(lllllllllllllIIlIlIlIIIlllIlIllI, lllllllllllllIIlIlIlIIIlllIllIlI);
        this.ctx.fireChannelRead(lllllllllllllIIlIlIlIIIlllIllIIl);
        "".length();
    }
    
    @Override
    public void readSynReplyFrame(final int lllllllllllllIIlIlIlIIIllllIlIIl, final boolean lllllllllllllIIlIlIlIIIllllIIlII) {
        final SpdySynReplyFrame lllllllllllllIIlIlIlIIIllllIIlll = new DefaultSpdySynReplyFrame(lllllllllllllIIlIlIlIIIllllIlIIl);
        lllllllllllllIIlIlIlIIIllllIIlll.setLast(lllllllllllllIIlIlIlIIIllllIIlII);
        "".length();
        this.spdyHeadersFrame = lllllllllllllIIlIlIlIIIllllIIlll;
    }
    
    @Override
    public void connect(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIllIIIIl, final SocketAddress lllllllllllllIIlIlIlIIlIIllIIlII, final SocketAddress lllllllllllllIIlIlIlIIlIIlIlllll, final ChannelPromise lllllllllllllIIlIlIlIIlIIllIIIlI) throws Exception {
        lllllllllllllIIlIlIlIIlIIllIIIIl.connect(lllllllllllllIIlIlIlIIlIIllIIlII, lllllllllllllIIlIlIlIIlIIlIlllll, lllllllllllllIIlIlIlIIlIIllIIIlI);
        "".length();
    }
    
    @Override
    public void readDataFrame(final int lllllllllllllIIlIlIlIIlIIIIIllII, final boolean lllllllllllllIIlIlIlIIlIIIIIIllI, final ByteBuf lllllllllllllIIlIlIlIIlIIIIIIlIl) {
        final SpdyDataFrame lllllllllllllIIlIlIlIIlIIIIIlIIl = new DefaultSpdyDataFrame(lllllllllllllIIlIlIlIIlIIIIIllII, lllllllllllllIIlIlIlIIlIIIIIIlIl);
        lllllllllllllIIlIlIlIIlIIIIIlIIl.setLast(lllllllllllllIIlIlIlIIlIIIIIIllI);
        "".length();
        this.ctx.fireChannelRead(lllllllllllllIIlIlIlIIlIIIIIlIIl);
        "".length();
    }
    
    @Override
    public void readHeadersFrame(final int lllllllllllllIIlIIllIllllllIllll, final boolean lllllllllllllIIlIIllIllllllIlllI) {
        this.spdyHeadersFrame = new DefaultSpdyHeadersFrame(lllllllllllllIIlIIllIllllllIllll);
        this.spdyHeadersFrame.setLast(lllllllllllllIIlIIllIllllllIlllI);
        "".length();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIllllIIl, final ByteBuf lllllllllllllIIlIlIlIIlIIllllIII, final List<Object> lllllllllllllIIlIlIlIIlIIlllIlll) throws Exception {
        this.spdyFrameDecoder.decode(lllllllllllllIIlIlIlIIlIIllllIII);
    }
    
    public SpdyFrameCodec(final SpdyVersion lllllllllllllIIlIlIlIIlIlIlIIlll) {
        this(lllllllllllllIIlIlIlIIlIlIlIIlll, SpdyFrameCodec.lIIllIlIllIllI[0], SpdyFrameCodec.lIIllIlIllIllI[1], SpdyFrameCodec.lIIllIlIllIllI[2], SpdyFrameCodec.lIIllIlIllIllI[3], SpdyFrameCodec.lIIllIlIllIllI[4]);
    }
    
    protected SpdyFrameCodec(final SpdyVersion lllllllllllllIIlIlIlIIlIlIIIlIll, final int lllllllllllllIIlIlIlIIlIlIIIlIlI, final SpdyHeaderBlockDecoder lllllllllllllIIlIlIlIIlIlIIIlIIl, final SpdyHeaderBlockEncoder lllllllllllllIIlIlIlIIlIlIIIIIll) {
        this.spdyFrameDecoder = new SpdyFrameDecoder(lllllllllllllIIlIlIlIIlIlIIIlIll, this, lllllllllllllIIlIlIlIIlIlIIIlIlI);
        this.spdyFrameEncoder = new SpdyFrameEncoder(lllllllllllllIIlIlIlIIlIlIIIlIll);
        this.spdyHeaderBlockDecoder = lllllllllllllIIlIlIlIIlIlIIIlIIl;
        this.spdyHeaderBlockEncoder = lllllllllllllIIlIlIlIIlIlIIIIIll;
    }
    
    @Override
    public void disconnect(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlIllIII, final ChannelPromise lllllllllllllIIlIlIlIIlIIlIllIIl) throws Exception {
        lllllllllllllIIlIlIlIIlIIlIllIII.disconnect(lllllllllllllIIlIlIlIIlIIlIllIIl);
        "".length();
    }
    
    public SpdyFrameCodec(final SpdyVersion lllllllllllllIIlIlIlIIlIlIIlIlll, final int lllllllllllllIIlIlIlIIlIlIIlllIl, final int lllllllllllllIIlIlIlIIlIlIIlIlIl, final int lllllllllllllIIlIlIlIIlIlIIlIlII, final int lllllllllllllIIlIlIlIIlIlIIllIlI, final int lllllllllllllIIlIlIlIIlIlIIllIIl) {
        this(lllllllllllllIIlIlIlIIlIlIIlIlll, lllllllllllllIIlIlIlIIlIlIIlllIl, SpdyHeaderBlockDecoder.newInstance(lllllllllllllIIlIlIlIIlIlIIlIlll, lllllllllllllIIlIlIlIIlIlIIlIlIl), SpdyHeaderBlockEncoder.newInstance(lllllllllllllIIlIlIlIIlIlIIlIlll, lllllllllllllIIlIlIlIIlIlIIlIlII, lllllllllllllIIlIlIlIIlIlIIllIlI, lllllllllllllIIlIlIlIIlIlIIllIIl));
    }
    
    @Override
    public void readWindowUpdateFrame(final int lllllllllllllIIlIIllIllllllIIIIl, final int lllllllllllllIIlIIllIllllllIIIII) {
        final SpdyWindowUpdateFrame lllllllllllllIIlIIllIllllllIIIll = new DefaultSpdyWindowUpdateFrame(lllllllllllllIIlIIllIllllllIIIIl, lllllllllllllIIlIIllIllllllIIIII);
        this.ctx.fireChannelRead(lllllllllllllIIlIIllIllllllIIIll);
        "".length();
    }
    
    @Override
    public void readHeaderBlock(final ByteBuf lllllllllllllIIlIIllIlllllIllIII) {
        try {
            this.spdyHeaderBlockDecoder.decode(lllllllllllllIIlIIllIlllllIllIII, this.spdyHeadersFrame);
            lllllllllllllIIlIIllIlllllIllIII.release();
            "".length();
            "".length();
            if (((0x59 ^ 0x2D ^ (0x60 ^ 0x8)) & (0x37 ^ 0x10 ^ (0x8A ^ 0xB1) ^ -" ".length())) < 0) {
                return;
            }
        }
        catch (Exception lllllllllllllIIlIIllIlllllIllIlI) {
            this.ctx.fireExceptionCaught(lllllllllllllIIlIIllIlllllIllIlI);
            "".length();
            lllllllllllllIIlIIllIlllllIllIII.release();
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        finally {
            lllllllllllllIIlIIllIlllllIllIII.release();
            "".length();
        }
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIIlIIIII, final Object lllllllllllllIIlIlIlIIlIIIIllIlI, final ChannelPromise lllllllllllllIIlIlIlIIlIIIIllIIl) throws Exception {
        if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyDataFrame) ? 1 : 0)) {
            final SpdyDataFrame lllllllllllllIIlIlIlIIlIIIllIllI = (SpdyDataFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIllIlIl = this.spdyFrameEncoder.encodeDataFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIllIllI.streamId(), lllllllllllllIIlIlIlIIlIIIllIllI.isLast(), lllllllllllllIIlIlIlIIlIIIllIllI.content());
            lllllllllllllIIlIlIlIIlIIIllIllI.release();
            "".length();
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIllIlIl, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if ("   ".length() == ((0x5D ^ 0x58) & ~(0x2D ^ 0x28))) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdySynStreamFrame) ? 1 : 0)) {
            final SpdySynStreamFrame lllllllllllllIIlIlIlIIlIIIllIlII = (SpdySynStreamFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIllIIll = this.spdyHeaderBlockEncoder.encode(lllllllllllllIIlIlIlIIlIIIllIlII);
            ByteBuf lllllllllllllIIlIlIlIIlIIIllIIlI;
            try {
                lllllllllllllIIlIlIlIIlIIIllIIlI = this.spdyFrameEncoder.encodeSynStreamFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIllIlII.streamId(), lllllllllllllIIlIlIlIIlIIIllIlII.associatedStreamId(), lllllllllllllIIlIlIlIIlIIIllIlII.priority(), lllllllllllllIIlIlIlIIlIIIllIlII.isLast(), lllllllllllllIIlIlIlIIlIIIllIlII.isUnidirectional(), lllllllllllllIIlIlIlIIlIIIllIIll);
                lllllllllllllIIlIlIlIIlIIIllIIll.release();
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            finally {
                lllllllllllllIIlIlIlIIlIIIllIIll.release();
                "".length();
            }
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIllIIlI, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdySynReplyFrame) ? 1 : 0)) {
            final SpdySynReplyFrame lllllllllllllIIlIlIlIIlIIIllIIIl = (SpdySynReplyFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIllIIII = this.spdyHeaderBlockEncoder.encode(lllllllllllllIIlIlIlIIlIIIllIIIl);
            ByteBuf lllllllllllllIIlIlIlIIlIIIlIllll;
            try {
                lllllllllllllIIlIlIlIIlIIIlIllll = this.spdyFrameEncoder.encodeSynReplyFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIllIIIl.streamId(), lllllllllllllIIlIlIlIIlIIIllIIIl.isLast(), lllllllllllllIIlIlIlIIlIIIllIIII);
                lllllllllllllIIlIlIlIIlIIIllIIII.release();
                "".length();
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            finally {
                lllllllllllllIIlIlIlIIlIIIllIIII.release();
                "".length();
            }
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIllll, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (((0x22 ^ 0x39 ^ (0x3A ^ 0x73)) & (0x44 ^ 0x7E ^ (0xAD ^ 0xC5) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyRstStreamFrame) ? 1 : 0)) {
            final SpdyRstStreamFrame lllllllllllllIIlIlIlIIlIIIlIlllI = (SpdyRstStreamFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIllIl = this.spdyFrameEncoder.encodeRstStreamFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIlllI.streamId(), lllllllllllllIIlIlIlIIlIIIlIlllI.status().code());
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIllIl, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdySettingsFrame) ? 1 : 0)) {
            final SpdySettingsFrame lllllllllllllIIlIlIlIIlIIIlIllII = (SpdySettingsFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIlIll = this.spdyFrameEncoder.encodeSettingsFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIllII);
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIlIll, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (" ".length() <= ((0x57 ^ 0x0) & ~(0xF9 ^ 0xAE))) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyPingFrame) ? 1 : 0)) {
            final SpdyPingFrame lllllllllllllIIlIlIlIIlIIIlIlIlI = (SpdyPingFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIlIIl = this.spdyFrameEncoder.encodePingFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIlIlI.id());
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIlIIl, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyGoAwayFrame) ? 1 : 0)) {
            final SpdyGoAwayFrame lllllllllllllIIlIlIlIIlIIIlIlIII = (SpdyGoAwayFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIIlll = this.spdyFrameEncoder.encodeGoAwayFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIlIII.lastGoodStreamId(), lllllllllllllIIlIlIlIIlIIIlIlIII.status().code());
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIIlll, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (((0x27 ^ 0x70) & ~(0x95 ^ 0xC2)) > ((0x1B ^ 0x4A) & ~(0x24 ^ 0x75))) {
                return;
            }
        }
        else if (llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyHeadersFrame) ? 1 : 0)) {
            final SpdyHeadersFrame lllllllllllllIIlIlIlIIlIIIlIIllI = (SpdyHeadersFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIIlIl = this.spdyHeaderBlockEncoder.encode(lllllllllllllIIlIlIlIIlIIIlIIllI);
            ByteBuf lllllllllllllIIlIlIlIIlIIIlIIlII;
            try {
                lllllllllllllIIlIlIlIIlIIIlIIlII = this.spdyFrameEncoder.encodeHeadersFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIIllI.streamId(), lllllllllllllIIlIlIlIIlIIIlIIllI.isLast(), lllllllllllllIIlIlIlIIlIIIlIIlIl);
                lllllllllllllIIlIlIlIIlIIIlIIlIl.release();
                "".length();
                "".length();
                if ((0xC ^ 0x8) == "  ".length()) {
                    return;
                }
            }
            finally {
                lllllllllllllIIlIlIlIIlIIIlIIlIl.release();
                "".length();
            }
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIIlII, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if (((0x75 ^ 0x40) & ~(0x6A ^ 0x5F)) >= "   ".length()) {
                return;
            }
        }
        else {
            if (!llIllIIlIIlllll((lllllllllllllIIlIlIlIIlIIIIllIlI instanceof SpdyWindowUpdateFrame) ? 1 : 0)) {
                throw new UnsupportedMessageTypeException(lllllllllllllIIlIlIlIIlIIIIllIlI, (Class<?>[])new Class[SpdyFrameCodec.lIIllIlIllIllI[5]]);
            }
            final SpdyWindowUpdateFrame lllllllllllllIIlIlIlIIlIIIlIIIll = (SpdyWindowUpdateFrame)lllllllllllllIIlIlIlIIlIIIIllIlI;
            final ByteBuf lllllllllllllIIlIlIlIIlIIIlIIIlI = this.spdyFrameEncoder.encodeWindowUpdateFrame(lllllllllllllIIlIlIlIIlIIIlIIIII.alloc(), lllllllllllllIIlIlIlIIlIIIlIIIll.streamId(), lllllllllllllIIlIlIlIIlIIIlIIIll.deltaWindowSize());
            lllllllllllllIIlIlIlIIlIIIlIIIII.write(lllllllllllllIIlIlIlIIlIIIlIIIlI, lllllllllllllIIlIlIlIIlIIIIllIIl);
            "".length();
            "".length();
            if ((0x16 ^ 0x12) < 0) {
                return;
            }
        }
    }
    
    private static void llIllIIlIIllllI() {
        (lIIllIlIllIllI = new int[8])[0] = (-(0xFFFFD72D & 0x2FD3) & (0xFFFFBF5B & 0x67A4));
        SpdyFrameCodec.lIIllIlIllIllI[1] = (0xFFFFD713 & 0x68EC);
        SpdyFrameCodec.lIIllIlIllIllI[2] = (0x49 ^ 0x4F);
        SpdyFrameCodec.lIIllIlIllIllI[3] = (0xB1 ^ 0xBE);
        SpdyFrameCodec.lIIllIlIllIllI[4] = (0x9E ^ 0x96);
        SpdyFrameCodec.lIIllIlIllIllI[5] = ((0x41 ^ 0x5B) & ~(0xA3 ^ 0xB9));
        SpdyFrameCodec.lIIllIlIllIllI[6] = " ".length();
        SpdyFrameCodec.lIIllIlIllIllI[7] = "  ".length();
    }
    
    @Override
    public void deregister(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIlIIllII, final ChannelPromise lllllllllllllIIlIlIlIIlIIlIIlIIl) throws Exception {
        lllllllllllllIIlIlIlIIlIIlIIllII.deregister(lllllllllllllIIlIlIlIIlIIlIIlIIl);
        "".length();
    }
    
    private static boolean llIllIIlIIlllll(final int lllllllllllllIIlIIllIllllIllIIII) {
        return lllllllllllllIIlIIllIllllIllIIII != 0;
    }
    
    @Override
    public void bind(final ChannelHandlerContext lllllllllllllIIlIlIlIIlIIllIllIl, final SocketAddress lllllllllllllIIlIlIlIIlIIllIllll, final ChannelPromise lllllllllllllIIlIlIlIIlIIllIlIll) throws Exception {
        lllllllllllllIIlIlIlIIlIIllIllIl.bind(lllllllllllllIIlIlIlIIlIIllIllll, lllllllllllllIIlIlIlIIlIIllIlIll);
        "".length();
    }
    
    @Override
    public void readPingFrame(final int lllllllllllllIIlIIlllIIIIIIIIlII) {
        final SpdyPingFrame lllllllllllllIIlIIlllIIIIIIIIIll = new DefaultSpdyPingFrame(lllllllllllllIIlIIlllIIIIIIIIlII);
        this.ctx.fireChannelRead(lllllllllllllIIlIIlllIIIIIIIIIll);
        "".length();
    }
    
    private static String llIllIIlIIllIlI(final String lllllllllllllIIlIIllIllllIlllIIl, final String lllllllllllllIIlIIllIllllIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllIllllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllIllllIlllIII.getBytes(StandardCharsets.UTF_8)), SpdyFrameCodec.lIIllIlIllIllI[4]), "DES");
            final Cipher lllllllllllllIIlIIllIllllIlllIll = Cipher.getInstance("DES");
            lllllllllllllIIlIIllIllllIlllIll.init(SpdyFrameCodec.lIIllIlIllIllI[7], lllllllllllllIIlIIllIllllIllllII);
            return new String(lllllllllllllIIlIIllIllllIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllIllllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllIllllIlllIlI) {
            lllllllllllllIIlIIllIllllIlllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readSynStreamFrame(final int lllllllllllllIIlIlIlIIIllllllIll, final int lllllllllllllIIlIlIlIIIlllllIIll, final byte lllllllllllllIIlIlIlIIIllllllIIl, final boolean lllllllllllllIIlIlIlIIIlllllIIIl, final boolean lllllllllllllIIlIlIlIIIlllllIlll) {
        final SpdySynStreamFrame lllllllllllllIIlIlIlIIIlllllIllI = new DefaultSpdySynStreamFrame(lllllllllllllIIlIlIlIIIllllllIll, lllllllllllllIIlIlIlIIIlllllIIll, lllllllllllllIIlIlIlIIIllllllIIl);
        lllllllllllllIIlIlIlIIIlllllIllI.setLast(lllllllllllllIIlIlIlIIIlllllIIIl);
        "".length();
        lllllllllllllIIlIlIlIIIlllllIllI.setUnidirectional(lllllllllllllIIlIlIlIIIlllllIlll);
        "".length();
        this.spdyHeadersFrame = lllllllllllllIIlIlIlIIIlllllIllI;
    }
    
    private static boolean llIllIIlIlIIIII(final Object lllllllllllllIIlIIllIllllIllIIlI) {
        return lllllllllllllIIlIIllIllllIllIIlI != null;
    }
}
