// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.DefaultByteBufHolder;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.ReferenceCounted;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.DecoderResult;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

public class HttpObjectAggregator extends MessageToMessageDecoder<HttpObject>
{
    private final /* synthetic */ int maxContentLength;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ FullHttpResponse CONTINUE;
    private /* synthetic */ ChannelHandlerContext ctx;
    private static final /* synthetic */ int[] lIlIIIllIlIIIl;
    private /* synthetic */ AggregatedFullHttpMessage currentMessage;
    private /* synthetic */ boolean tooLongFrameFound;
    private /* synthetic */ int maxCumulationBufferComponents;
    private static final /* synthetic */ String[] lIlIIIIllllIlI;
    
    private static boolean lllIIIlllIlllll(final Object lllllllllllllIIIllllIIIllIIlllIl) {
        return lllllllllllllIIIllllIIIllIIlllIl != null;
    }
    
    private static boolean lllIIIlllIllllI(final int lllllllllllllIIIllllIIIllIIlIlll) {
        return lllllllllllllIIIllllIIIllIIlIlll == 0;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIllllIIIlllllIIll, final HttpObject lllllllllllllIIIllllIIIllllIllIl, final List<Object> lllllllllllllIIIllllIIIllllIllII) throws Exception {
        AggregatedFullHttpMessage lllllllllllllIIIllllIIIlllllIIII = this.currentMessage;
        if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIllllIllIl instanceof HttpMessage) ? 1 : 0)) {
            this.tooLongFrameFound = (HttpObjectAggregator.lIlIIIllIlIIIl[1] != 0);
            if (lllIIIlllIllllI(HttpObjectAggregator.$assertionsDisabled ? 1 : 0) && lllIIIlllIlllll(lllllllllllllIIIllllIIIlllllIIII)) {
                throw new AssertionError();
            }
            final HttpMessage lllllllllllllIIIllllIIIllllllIlI = (HttpMessage)lllllllllllllIIIllllIIIllllIllIl;
            if (lllIIIlllIlllIl(HttpHeaders.is100ContinueExpected(lllllllllllllIIIllllIIIllllllIlI) ? 1 : 0)) {
                lllllllllllllIIIllllIIIlllllIIll.writeAndFlush(HttpObjectAggregator.CONTINUE).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    private static boolean lIIIIlllIlIIllll(final int llllllllllllIlllIlllIlllllIllllI) {
                        return llllllllllllIlllIlllIlllllIllllI == 0;
                    }
                    
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIlllIlllIllllllIIllI) throws Exception {
                        if (lIIIIlllIlIIllll(llllllllllllIlllIlllIllllllIIllI.isSuccess() ? 1 : 0)) {
                            lllllllllllllIIIllllIIIlllllIIll.fireExceptionCaught(llllllllllllIlllIlllIllllllIIllI.cause());
                            "".length();
                        }
                    }
                });
                "".length();
            }
            if (lllIIIlllIllllI(lllllllllllllIIIllllIIIllllllIlI.getDecoderResult().isSuccess() ? 1 : 0)) {
                HttpHeaders.removeTransferEncodingChunked(lllllllllllllIIIllllIIIllllllIlI);
                lllllllllllllIIIllllIIIllllIllII.add(toFullMessage(lllllllllllllIIIllllIIIllllllIlI));
                "".length();
                this.currentMessage = null;
                return;
            }
            if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIllllIllIl instanceof HttpRequest) ? 1 : 0)) {
                final HttpRequest lllllllllllllIIIllllIIIlllllllII = (HttpRequest)lllllllllllllIIIllllIIIllllIllIl;
                lllllllllllllIIIllllIIIlllllIIII = (this.currentMessage = new AggregatedFullHttpRequest(lllllllllllllIIIllllIIIlllllllII, (ByteBuf)lllllllllllllIIIllllIIIlllllIIll.alloc().compositeBuffer(this.maxCumulationBufferComponents), (HttpHeaders)null));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                if (!lllIIIlllIlllIl((lllllllllllllIIIllllIIIllllIllIl instanceof HttpResponse) ? 1 : 0)) {
                    throw new Error();
                }
                final HttpResponse lllllllllllllIIIllllIIIllllllIll = (HttpResponse)lllllllllllllIIIllllIIIllllIllIl;
                lllllllllllllIIIllllIIIlllllIIII = (this.currentMessage = new AggregatedFullHttpResponse(lllllllllllllIIIllllIIIllllllIll, (ByteBuf)Unpooled.compositeBuffer(this.maxCumulationBufferComponents), (HttpHeaders)null));
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            HttpHeaders.removeTransferEncodingChunked(lllllllllllllIIIllllIIIlllllIIII);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            if (!lllIIIlllIlllIl((lllllllllllllIIIllllIIIllllIllIl instanceof HttpContent) ? 1 : 0)) {
                throw new Error();
            }
            if (lllIIIlllIlllIl(this.tooLongFrameFound ? 1 : 0)) {
                if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIllllIllIl instanceof LastHttpContent) ? 1 : 0)) {
                    this.currentMessage = null;
                }
                return;
            }
            if (lllIIIlllIllllI(HttpObjectAggregator.$assertionsDisabled ? 1 : 0) && lllIIIlllIlllII(lllllllllllllIIIllllIIIlllllIIII)) {
                throw new AssertionError();
            }
            final HttpContent lllllllllllllIIIllllIIIlllllIlll = (HttpContent)lllllllllllllIIIllllIIIllllIllIl;
            final CompositeByteBuf lllllllllllllIIIllllIIIlllllIllI = (CompositeByteBuf)lllllllllllllIIIllllIIIlllllIIII.content();
            if (lllIIIllllIIIII(lllllllllllllIIIllllIIIlllllIllI.readableBytes(), this.maxContentLength - lllllllllllllIIIllllIIIlllllIlll.content().readableBytes())) {
                this.tooLongFrameFound = (HttpObjectAggregator.lIlIIIllIlIIIl[3] != 0);
                lllllllllllllIIIllllIIIlllllIIII.release();
                "".length();
                this.currentMessage = null;
                throw new TooLongFrameException(String.valueOf(new StringBuilder().append(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[5]]).append(this.maxContentLength).append(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[6]])));
            }
            if (lllIIIlllIlllIl(lllllllllllllIIIllllIIIlllllIlll.content().isReadable() ? 1 : 0)) {
                lllllllllllllIIIllllIIIlllllIlll.retain();
                "".length();
                lllllllllllllIIIllllIIIlllllIllI.addComponent(lllllllllllllIIIllllIIIlllllIlll.content());
                "".length();
                lllllllllllllIIIllllIIIlllllIllI.writerIndex(lllllllllllllIIIllllIIIlllllIllI.writerIndex() + lllllllllllllIIIllllIIIlllllIlll.content().readableBytes());
                "".length();
            }
            boolean lllllllllllllIIIllllIIIlllllIlIl = false;
            if (lllIIIlllIllllI(lllllllllllllIIIllllIIIlllllIlll.getDecoderResult().isSuccess() ? 1 : 0)) {
                lllllllllllllIIIllllIIIlllllIIII.setDecoderResult(DecoderResult.failure(lllllllllllllIIIllllIIIlllllIlll.getDecoderResult().cause()));
                final boolean lllllllllllllIIIllllIIIllllllIIl = HttpObjectAggregator.lIlIIIllIlIIIl[3] != 0;
                "".length();
                if (-(0x12 ^ 0x2C ^ (0x2 ^ 0x39)) >= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIllllIIIlllllIlIl = (lllllllllllllIIIllllIIIlllllIlll instanceof LastHttpContent);
            }
            if (lllIIIlllIlllIl(lllllllllllllIIIllllIIIlllllIlIl ? 1 : 0)) {
                this.currentMessage = null;
                if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIlllllIlll instanceof LastHttpContent) ? 1 : 0)) {
                    final LastHttpContent lllllllllllllIIIllllIIIllllllIII = (LastHttpContent)lllllllllllllIIIllllIIIlllllIlll;
                    lllllllllllllIIIllllIIIlllllIIII.setTrailingHeaders(lllllllllllllIIIllllIIIllllllIII.trailingHeaders());
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIllllIIIlllllIIII.setTrailingHeaders(new DefaultHttpHeaders());
                }
                lllllllllllllIIIllllIIIlllllIIII.headers().set(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[7]], String.valueOf(lllllllllllllIIIllllIIIlllllIllI.readableBytes()));
                "".length();
                lllllllllllllIIIllllIIIllllIllII.add(lllllllllllllIIIllllIIIlllllIIII);
                "".length();
            }
            "".length();
            if ("   ".length() > (0xAC ^ 0xA8)) {
                return;
            }
        }
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext lllllllllllllIIIllllIIIlllIlIlIl) throws Exception {
        super.handlerRemoved(lllllllllllllIIIllllIIIlllIlIlIl);
        if (lllIIIlllIlllll(this.currentMessage)) {
            this.currentMessage.release();
            "".length();
            this.currentMessage = null;
        }
    }
    
    static {
        lllIIIlllIllIIl();
        lllIIIlIIIlllII();
        DEFAULT_MAX_COMPOSITEBUFFER_COMPONENTS = HttpObjectAggregator.lIlIIIllIlIIIl[0];
        int $assertionsDisabled2;
        if (lllIIIlllIllllI(HttpObjectAggregator.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = HttpObjectAggregator.lIlIIIllIlIIIl[3];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = HttpObjectAggregator.lIlIIIllIlIIIl[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        CONTINUE = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CONTINUE, Unpooled.EMPTY_BUFFER);
    }
    
    private static String lllIIIlIIIllIIl(final String lllllllllllllIIIllllIIIllIlIllII, final String lllllllllllllIIIllllIIIllIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIIllIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIIllIlIlllI.init(HttpObjectAggregator.lIlIIIllIlIIIl[2], lllllllllllllIIIllllIIIllIlIllll);
            return new String(lllllllllllllIIIllllIIIllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIllIlIllIl) {
            lllllllllllllIIIllllIIIllIlIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlIIIllIII(final String lllllllllllllIIIllllIIIllIllIlll, final String lllllllllllllIIIllllIIIllIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIIllIlllIII.getBytes(StandardCharsets.UTF_8)), HttpObjectAggregator.lIlIIIllIlIIIl[9]), "DES");
            final Cipher lllllllllllllIIIllllIIIllIlllIll = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIIllIlllIll.init(HttpObjectAggregator.lIlIIIllIlIIIl[2], lllllllllllllIIIllllIIIllIllllII);
            return new String(lllllllllllllIIIllllIIIllIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIIllIlllIlI) {
            lllllllllllllIIIllllIIIllIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIlllIlllII(final Object lllllllllllllIIIllllIIIllIIllIll) {
        return lllllllllllllIIIllllIIIllIIllIll == null;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIIIllllIIIllllIIIIl) throws Exception {
        super.channelInactive(lllllllllllllIIIllllIIIllllIIIIl);
        if (lllIIIlllIlllll(this.currentMessage)) {
            this.currentMessage.release();
            "".length();
            this.currentMessage = null;
        }
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIIIllllIIIlllIlllIl) throws Exception {
        this.ctx = lllllllllllllIIIllllIIIlllIlllIl;
    }
    
    private static boolean lllIIIllllIIIII(final int lllllllllllllIIIllllIIIllIlIIIII, final int lllllllllllllIIIllllIIIllIIlllll) {
        return lllllllllllllIIIllllIIIllIlIIIII > lllllllllllllIIIllllIIIllIIlllll;
    }
    
    private static void lllIIIlIIIlllII() {
        (lIlIIIIllllIlI = new String[HttpObjectAggregator.lIlIIIllIlIIIl[8]])[HttpObjectAggregator.lIlIIIllIlIIIl[1]] = lllIIIlIIIllIII("qTGwktW6JDd3jnAVX9MZ3AJZfD+OCd7k3bMviwySpOxliuE5Ne8VsQ8zCb3rA1n4", "QitHX");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[3]] = lllIIIlIIIllIIl("zOwVujU3/7cFKo1DvYV93YGk+lExXlfNbx4JdoIklRk=", "WMWHb");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[2]] = lllIIIlIIIllIIl("6zZQCgfw8nAePEqa/Z9LK4z7TR6ktLNR", "PpFoT");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[4]] = lllIIIlIIIllIII("BvAnTWPI22SVtO0PdwLFJ5pa3BJjleWKVX28aTtSUatk2LjXqaMgVVNEu0FgNTzHRCCBUD0jGg/VNx3GW1AK8uWyQe+4/nKSwGD6w9ecQAQ=", "SSwai");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[5]] = lllIIIlIIIllIII("ZtDUvyrl7YgwMS1TP6cXtAxrJEezv6fxindWF+QnXEE=", "cFQFU");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[6]] = lllIIIlIIIllIII("yxPi9pbCSsM=", "IboYU");
        HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[7]] = lllIIIlIIIllIIl("7FdqK3EmBleErVIOoicohA==", "gfvmr");
    }
    
    private static boolean lllIIIlllIlllIl(final int lllllllllllllIIIllllIIIllIIllIIl) {
        return lllllllllllllIIIllllIIIllIIllIIl != 0;
    }
    
    public HttpObjectAggregator(final int lllllllllllllIIIllllIIlIIIIIllll) {
        this.maxCumulationBufferComponents = HttpObjectAggregator.lIlIIIllIlIIIl[0];
        if (lllIIIlllIllIlI(lllllllllllllIIIllllIIlIIIIIllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[1]]).append(lllllllllllllIIIllllIIlIIIIIllll)));
        }
        this.maxContentLength = lllllllllllllIIIllllIIlIIIIIllll;
    }
    
    private static boolean lllIIIlllIllIlI(final int lllllllllllllIIIllllIIIllIIlIlIl) {
        return lllllllllllllIIIllllIIIllIIlIlIl <= 0;
    }
    
    public final void setMaxCumulationBufferComponents(final int lllllllllllllIIIllllIIlIIIIIIllI) {
        if (lllIIIlllIllIll(lllllllllllllIIIllllIIlIIIIIIllI, HttpObjectAggregator.lIlIIIllIlIIIl[2])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[3]]).append(lllllllllllllIIIllllIIlIIIIIIllI).append(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[2]])));
        }
        if (!lllIIIlllIlllII(this.ctx)) {
            throw new IllegalStateException(HttpObjectAggregator.lIlIIIIllllIlI[HttpObjectAggregator.lIlIIIllIlIIIl[4]]);
        }
        this.maxCumulationBufferComponents = lllllllllllllIIIllllIIlIIIIIIllI;
        "".length();
        if (" ".length() < 0) {
            return;
        }
    }
    
    private static boolean lllIIIlllIllIll(final int lllllllllllllIIIllllIIIllIlIIlII, final int lllllllllllllIIIllllIIIllIlIIIll) {
        return lllllllllllllIIIllllIIIllIlIIlII < lllllllllllllIIIllllIIIllIlIIIll;
    }
    
    private static FullHttpMessage toFullMessage(final HttpMessage lllllllllllllIIIllllIIIlllIIlllI) {
        if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIlllIIlllI instanceof FullHttpMessage) ? 1 : 0)) {
            return ((FullHttpMessage)lllllllllllllIIIllllIIIlllIIlllI).retain();
        }
        if (lllIIIlllIlllIl((lllllllllllllIIIllllIIIlllIIlllI instanceof HttpRequest) ? 1 : 0)) {
            final FullHttpMessage lllllllllllllIIIllllIIIlllIlIIlI = new AggregatedFullHttpRequest((HttpRequest)lllllllllllllIIIllllIIIlllIIlllI, Unpooled.EMPTY_BUFFER, (HttpHeaders)new DefaultHttpHeaders());
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            if (!lllIIIlllIlllIl((lllllllllllllIIIllllIIIlllIIlllI instanceof HttpResponse) ? 1 : 0)) {
                throw new IllegalStateException();
            }
            final FullHttpMessage lllllllllllllIIIllllIIIlllIlIIIl = new AggregatedFullHttpResponse((HttpResponse)lllllllllllllIIIllllIIIlllIIlllI, Unpooled.EMPTY_BUFFER, (HttpHeaders)new DefaultHttpHeaders());
            "".length();
            if (null != null) {
                return null;
            }
        }
        final FullHttpMessage lllllllllllllIIIllllIIIlllIIllll;
        return lllllllllllllIIIllllIIIlllIIllll;
    }
    
    public final int getMaxCumulationBufferComponents() {
        return this.maxCumulationBufferComponents;
    }
    
    private static void lllIIIlllIllIIl() {
        (lIlIIIllIlIIIl = new int[10])[0] = (-(0xFFFFEFEF & 0x70DB) & (0xFFFFF4DF & 0x6FEA));
        HttpObjectAggregator.lIlIIIllIlIIIl[1] = ((0x22 ^ 0x28) & ~(0xCF ^ 0xC5));
        HttpObjectAggregator.lIlIIIllIlIIIl[2] = "  ".length();
        HttpObjectAggregator.lIlIIIllIlIIIl[3] = " ".length();
        HttpObjectAggregator.lIlIIIllIlIIIl[4] = "   ".length();
        HttpObjectAggregator.lIlIIIllIlIIIl[5] = (0xD ^ 0x73 ^ (0x61 ^ 0x1B));
        HttpObjectAggregator.lIlIIIllIlIIIl[6] = (0x3E ^ 0x3B);
        HttpObjectAggregator.lIlIIIllIlIIIl[7] = (0xB1 ^ 0xB7);
        HttpObjectAggregator.lIlIIIllIlIIIl[8] = (0x7B ^ 0x58 ^ (0xBF ^ 0x9B));
        HttpObjectAggregator.lIlIIIllIlIIIl[9] = (0x24 ^ 0x21 ^ (0x5F ^ 0x52));
    }
    
    private static final class AggregatedFullHttpResponse extends AggregatedFullHttpMessage implements FullHttpResponse
    {
        @Override
        public FullHttpResponse retain(final int llllllllllllIlIlIlllllIlIIlIllIl) {
            super.retain(llllllllllllIlIlIlllllIlIIlIllIl);
            "".length();
            return this;
        }
        
        @Override
        public FullHttpResponse retain() {
            super.retain();
            "".length();
            return this;
        }
        
        @Override
        public FullHttpResponse copy() {
            final DefaultFullHttpResponse llllllllllllIlIlIlllllIlIlIIlIlI = new DefaultFullHttpResponse(this.getProtocolVersion(), this.getStatus(), this.content().copy());
            llllllllllllIlIlIlllllIlIlIIlIlI.headers().set(this.headers());
            "".length();
            llllllllllllIlIlIlllllIlIlIIlIlI.trailingHeaders().set(this.trailingHeaders());
            "".length();
            return llllllllllllIlIlIlllllIlIlIIlIlI;
        }
        
        @Override
        public HttpResponseStatus getStatus() {
            return ((HttpResponse)this.message).getStatus();
        }
        
        @Override
        public FullHttpResponse setStatus(final HttpResponseStatus llllllllllllIlIlIlllllIlIIlllllI) {
            ((HttpResponse)this.message).setStatus(llllllllllllIlIlIlllllIlIIlllllI);
            "".length();
            return this;
        }
        
        @Override
        public FullHttpResponse setProtocolVersion(final HttpVersion llllllllllllIlIlIlllllIlIIllIlIl) {
            super.setProtocolVersion(llllllllllllIlIlIlllllIlIIllIlIl);
            "".length();
            return this;
        }
        
        @Override
        public FullHttpResponse duplicate() {
            final DefaultFullHttpResponse llllllllllllIlIlIlllllIlIlIIIlII = new DefaultFullHttpResponse(this.getProtocolVersion(), this.getStatus(), this.content().duplicate());
            llllllllllllIlIlIlllllIlIlIIIlII.headers().set(this.headers());
            "".length();
            llllllllllllIlIlIlllllIlIlIIIlII.trailingHeaders().set(this.trailingHeaders());
            "".length();
            return llllllllllllIlIlIlllllIlIlIIIlII;
        }
        
        private AggregatedFullHttpResponse(final HttpResponse llllllllllllIlIlIlllllIlIlIlIlII, final ByteBuf llllllllllllIlIlIlllllIlIlIlIIll, final HttpHeaders llllllllllllIlIlIlllllIlIlIlIIlI) {
            super((HttpMessage)llllllllllllIlIlIlllllIlIlIlIlII, llllllllllllIlIlIlllllIlIlIlIIll, llllllllllllIlIlIlllllIlIlIlIIlI);
        }
    }
    
    private abstract static class AggregatedFullHttpMessage extends DefaultByteBufHolder implements FullHttpMessage
    {
        protected final /* synthetic */ HttpMessage message;
        private /* synthetic */ HttpHeaders trailingHeaders;
        
        @Override
        public FullHttpMessage retain() {
            super.retain();
            "".length();
            return this;
        }
        
        @Override
        public abstract FullHttpMessage copy();
        
        @Override
        public HttpHeaders headers() {
            return this.message.headers();
        }
        
        private AggregatedFullHttpMessage(final HttpMessage lllllllllllllIIlIIIIllIIlllIlIII, final ByteBuf lllllllllllllIIlIIIIllIIlllIIlll, final HttpHeaders lllllllllllllIIlIIIIllIIlllIIIlI) {
            super(lllllllllllllIIlIIIIllIIlllIIlll);
            this.message = lllllllllllllIIlIIIIllIIlllIlIII;
            this.trailingHeaders = lllllllllllllIIlIIIIllIIlllIIIlI;
        }
        
        @Override
        public HttpHeaders trailingHeaders() {
            return this.trailingHeaders;
        }
        
        @Override
        public abstract FullHttpMessage duplicate();
        
        @Override
        public HttpVersion getProtocolVersion() {
            return this.message.getProtocolVersion();
        }
        
        @Override
        public DecoderResult getDecoderResult() {
            return this.message.getDecoderResult();
        }
        
        @Override
        public FullHttpMessage setProtocolVersion(final HttpVersion lllllllllllllIIlIIIIllIIllIlIIII) {
            this.message.setProtocolVersion(lllllllllllllIIlIIIIllIIllIlIIII);
            "".length();
            return this;
        }
        
        @Override
        public void setDecoderResult(final DecoderResult lllllllllllllIIlIIIIllIIllIIIllI) {
            this.message.setDecoderResult(lllllllllllllIIlIIIIllIIllIIIllI);
        }
        
        public void setTrailingHeaders(final HttpHeaders lllllllllllllIIlIIIIllIIllIllIIl) {
            this.trailingHeaders = lllllllllllllIIlIIIIllIIllIllIIl;
        }
        
        @Override
        public FullHttpMessage retain(final int lllllllllllllIIlIIIIllIIlIlllllI) {
            super.retain(lllllllllllllIIlIIIIllIIlIlllllI);
            "".length();
            return this;
        }
    }
    
    private static final class AggregatedFullHttpRequest extends AggregatedFullHttpMessage implements FullHttpRequest
    {
        private AggregatedFullHttpRequest(final HttpRequest lllllllllllllIIlIlIIIIlIlIllllll, final ByteBuf lllllllllllllIIlIlIIIIlIlIlllIlI, final HttpHeaders lllllllllllllIIlIlIIIIlIlIlllIIl) {
            super((HttpMessage)lllllllllllllIIlIlIIIIlIlIllllll, lllllllllllllIIlIlIIIIlIlIlllIlI, lllllllllllllIIlIlIIIIlIlIlllIIl);
        }
        
        @Override
        public FullHttpRequest setProtocolVersion(final HttpVersion lllllllllllllIIlIlIIIIlIlIIIllII) {
            super.setProtocolVersion(lllllllllllllIIlIlIIIIlIlIIIllII);
            "".length();
            return this;
        }
        
        @Override
        public FullHttpRequest retain(final int lllllllllllllIIlIlIIIIlIlIlIIlll) {
            super.retain(lllllllllllllIIlIlIIIIlIlIlIIlll);
            "".length();
            return this;
        }
        
        @Override
        public String getUri() {
            return ((HttpRequest)this.message).getUri();
        }
        
        @Override
        public FullHttpRequest retain() {
            super.retain();
            "".length();
            return this;
        }
        
        @Override
        public FullHttpRequest setUri(final String lllllllllllllIIlIlIIIIlIlIIllIlI) {
            ((HttpRequest)this.message).setUri(lllllllllllllIIlIlIIIIlIlIIllIlI);
            "".length();
            return this;
        }
        
        @Override
        public FullHttpRequest duplicate() {
            final DefaultFullHttpRequest lllllllllllllIIlIlIIIIlIlIlIllll = new DefaultFullHttpRequest(this.getProtocolVersion(), this.getMethod(), this.getUri(), this.content().duplicate());
            lllllllllllllIIlIlIIIIlIlIlIllll.headers().set(this.headers());
            "".length();
            lllllllllllllIIlIlIIIIlIlIlIllll.trailingHeaders().set(this.trailingHeaders());
            "".length();
            return lllllllllllllIIlIlIIIIlIlIlIllll;
        }
        
        @Override
        public HttpMethod getMethod() {
            return ((HttpRequest)this.message).getMethod();
        }
        
        @Override
        public FullHttpRequest copy() {
            final DefaultFullHttpRequest lllllllllllllIIlIlIIIIlIlIllIlIl = new DefaultFullHttpRequest(this.getProtocolVersion(), this.getMethod(), this.getUri(), this.content().copy());
            lllllllllllllIIlIlIIIIlIlIllIlIl.headers().set(this.headers());
            "".length();
            lllllllllllllIIlIlIIIIlIlIllIlIl.trailingHeaders().set(this.trailingHeaders());
            "".length();
            return lllllllllllllIIlIlIIIIlIlIllIlIl;
        }
        
        @Override
        public FullHttpRequest setMethod(final HttpMethod lllllllllllllIIlIlIIIIlIlIIllllI) {
            ((HttpRequest)this.message).setMethod(lllllllllllllIIlIlIIIIlIlIIllllI);
            "".length();
            return this;
        }
    }
}
