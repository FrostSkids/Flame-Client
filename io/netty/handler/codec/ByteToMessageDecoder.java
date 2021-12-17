// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Arrays;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.Unpooled;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.util.internal.RecyclableArrayList;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelInboundHandlerAdapter;

public abstract class ByteToMessageDecoder extends ChannelInboundHandlerAdapter
{
    private /* synthetic */ boolean decodeWasNull;
    private static final /* synthetic */ int[] llIlIlIlllllII;
    private static final /* synthetic */ String[] llIlIlIllllIll;
    private /* synthetic */ boolean first;
    private /* synthetic */ boolean singleDecode;
    /* synthetic */ ByteBuf cumulation;
    
    @Override
    public final void handlerRemoved(final ChannelHandlerContext llllllllllllIllIlIIlllllllIllllI) throws Exception {
        final ByteBuf llllllllllllIllIlIIllllllllIIIIl = this.internalBuffer();
        final int llllllllllllIllIlIIllllllllIIIII = llllllllllllIllIlIIllllllllIIIIl.readableBytes();
        if (lIIlIlIIllIIIlIl(llllllllllllIllIlIIllllllllIIIIl.isReadable() ? 1 : 0)) {
            final ByteBuf llllllllllllIllIlIIllllllllIIlII = llllllllllllIllIlIIllllllllIIIIl.readBytes(llllllllllllIllIlIIllllllllIIIII);
            llllllllllllIllIlIIllllllllIIIIl.release();
            "".length();
            llllllllllllIllIlIIlllllllIllllI.fireChannelRead(llllllllllllIllIlIIllllllllIIlII);
            "".length();
            "".length();
            if ((0xC5 ^ 0xC1) <= "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIllllllllIIIIl.release();
            "".length();
        }
        this.cumulation = null;
        llllllllllllIllIlIIlllllllIllllI.fireChannelReadComplete();
        "".length();
        this.handlerRemoved0(llllllllllllIllIlIIlllllllIllllI);
    }
    
    protected int actualReadableBytes() {
        return this.internalBuffer().readableBytes();
    }
    
    private static boolean lIIlIlIIllIIllII(final int llllllllllllIllIlIIlllllIlIlIIII, final int llllllllllllIllIlIIlllllIlIIllll) {
        return llllllllllllIllIlIIlllllIlIlIIII == llllllllllllIllIlIIlllllIlIIllll;
    }
    
    private static boolean lIIlIlIIllIIIllI(final Object llllllllllllIllIlIIlllllIlIIIIIl) {
        return llllllllllllIllIlIIlllllIlIIIIIl != null;
    }
    
    protected void handlerRemoved0(final ChannelHandlerContext llllllllllllIllIlIIlllllllIllIIl) throws Exception {
    }
    
    private static void lIIlIlIIllIIIIll() {
        (llIlIlIllllIll = new String[ByteToMessageDecoder.llIlIlIlllllII[2]])[ByteToMessageDecoder.llIlIlIlllllII[0]] = lIIlIlIIllIIIIII("DieDAT/rjWbhQA5ItagXOAbtsNhs1iITek6mAMsKFxiz0W6tRTA2Ew==", "yXTcE");
        ByteToMessageDecoder.llIlIlIllllIll[ByteToMessageDecoder.llIlIlIlllllII[1]] = lIIlIlIIllIIIIlI("eLsYDJVgFiOR5iOj74BSQjCzQr40SXegbK7bGHwqLf50eSZgm3oEtvBgLGJtpMSAnAhcwyt9Yrc=", "sYAhZ");
    }
    
    private static boolean lIIlIlIIllIIlIIl(final int llllllllllllIllIlIIlllllIlIIIlII, final int llllllllllllIllIlIIlllllIlIIIIll) {
        return llllllllllllIllIlIIlllllIlIIIlII > llllllllllllIllIlIIlllllIlIIIIll;
    }
    
    @Override
    public void channelReadComplete(final ChannelHandlerContext llllllllllllIllIlIIllllllIlIllII) throws Exception {
        if (lIIlIlIIllIIIllI(this.cumulation) && lIIlIlIIllIIlIlI(this.first ? 1 : 0) && lIIlIlIIllIIllII(this.cumulation.refCnt(), ByteToMessageDecoder.llIlIlIlllllII[1])) {
            this.cumulation.discardSomeReadBytes();
            "".length();
        }
        if (lIIlIlIIllIIIlIl(this.decodeWasNull ? 1 : 0)) {
            this.decodeWasNull = (ByteToMessageDecoder.llIlIlIlllllII[0] != 0);
            if (lIIlIlIIllIIlIlI(llllllllllllIllIlIIllllllIlIllII.channel().config().isAutoRead() ? 1 : 0)) {
                llllllllllllIllIlIIllllllIlIllII.read();
                "".length();
            }
        }
        llllllllllllIllIlIIllllllIlIllII.fireChannelReadComplete();
        "".length();
    }
    
    private static boolean lIIlIlIIllIIlIII(final int llllllllllllIllIlIIlllllIlIIlIII, final int llllllllllllIllIlIIlllllIlIIIlll) {
        return llllllllllllIllIlIIlllllIlIIlIII <= llllllllllllIllIlIIlllllIlIIIlll;
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIllIlIIlllllllIIIllI, final Object llllllllllllIllIlIIlllllllIIIlIl) throws Exception {
        if (lIIlIlIIllIIIlIl((llllllllllllIllIlIIlllllllIIIlIl instanceof ByteBuf) ? 1 : 0)) {
            final RecyclableArrayList llllllllllllIllIlIIlllllllIIlIII = RecyclableArrayList.newInstance();
            try {
                final ByteBuf llllllllllllIllIlIIlllllllIIllll = (ByteBuf)llllllllllllIllIlIIlllllllIIIlIl;
                int first;
                if (lIIlIlIIllIIIlll(this.cumulation)) {
                    first = ByteToMessageDecoder.llIlIlIlllllII[1];
                    "".length();
                    if (((0xCA ^ 0xC6) & ~(0x9E ^ 0x92)) != 0x0) {
                        return;
                    }
                }
                else {
                    first = ByteToMessageDecoder.llIlIlIlllllII[0];
                }
                this.first = (first != 0);
                if (lIIlIlIIllIIIlIl(this.first ? 1 : 0)) {
                    this.cumulation = llllllllllllIllIlIIlllllllIIllll;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    if (!lIIlIlIIllIIlIII(this.cumulation.writerIndex(), this.cumulation.maxCapacity() - llllllllllllIllIlIIlllllllIIllll.readableBytes()) || lIIlIlIIllIIlIIl(this.cumulation.refCnt(), ByteToMessageDecoder.llIlIlIlllllII[1])) {
                        this.expandCumulation(llllllllllllIllIlIIlllllllIIIllI, llllllllllllIllIlIIlllllllIIllll.readableBytes());
                    }
                    this.cumulation.writeBytes(llllllllllllIllIlIIlllllllIIllll);
                    "".length();
                    llllllllllllIllIlIIlllllllIIllll.release();
                    "".length();
                }
                this.callDecode(llllllllllllIllIlIIlllllllIIIllI, this.cumulation, llllllllllllIllIlIIlllllllIIlIII);
                if (lIIlIlIIllIIIllI(this.cumulation) && lIIlIlIIllIIlIlI(this.cumulation.isReadable() ? 1 : 0)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int llllllllllllIllIlIIlllllllIIllIl = llllllllllllIllIlIIlllllllIIlIII.size();
                int decodeWasNull;
                if (lIIlIlIIllIIlIlI(llllllllllllIllIlIIlllllllIIllIl)) {
                    decodeWasNull = ByteToMessageDecoder.llIlIlIlllllII[1];
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else {
                    decodeWasNull = ByteToMessageDecoder.llIlIlIlllllII[0];
                }
                this.decodeWasNull = (decodeWasNull != 0);
                int llllllllllllIllIlIIlllllllIIlllI = ByteToMessageDecoder.llIlIlIlllllII[0];
                while (lIIlIlIIllIIlIll(llllllllllllIllIlIIlllllllIIlllI, llllllllllllIllIlIIlllllllIIllIl)) {
                    llllllllllllIllIlIIlllllllIIIllI.fireChannelRead(llllllllllllIllIlIIlllllllIIlIII.get(llllllllllllIllIlIIlllllllIIlllI));
                    "".length();
                    ++llllllllllllIllIlIIlllllllIIlllI;
                    "".length();
                    if (((0xEF ^ 0x9A ^ (0xD3 ^ 0x90)) & (0xE3 ^ 0x98 ^ (0xC0 ^ 0x8D) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                llllllllllllIllIlIIlllllllIIlIII.recycle();
                "".length();
                "".length();
                if (" ".length() == (0xA5 ^ 0xA1)) {
                    return;
                }
            }
            catch (DecoderException llllllllllllIllIlIIlllllllIIllII) {
                throw llllllllllllIllIlIIlllllllIIllII;
            }
            catch (Throwable llllllllllllIllIlIIlllllllIIlIll) {
                throw new DecoderException(llllllllllllIllIlIIlllllllIIlIll);
            }
            finally {
                if (lIIlIlIIllIIIllI(this.cumulation) && lIIlIlIIllIIlIlI(this.cumulation.isReadable() ? 1 : 0)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int llllllllllllIllIlIIlllllllIIlIIl = llllllllllllIllIlIIlllllllIIlIII.size();
                int decodeWasNull2;
                if (lIIlIlIIllIIlIlI(llllllllllllIllIlIIlllllllIIlIIl)) {
                    decodeWasNull2 = ByteToMessageDecoder.llIlIlIlllllII[1];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                else {
                    decodeWasNull2 = ByteToMessageDecoder.llIlIlIlllllII[0];
                }
                this.decodeWasNull = (decodeWasNull2 != 0);
                int llllllllllllIllIlIIlllllllIIlIlI = ByteToMessageDecoder.llIlIlIlllllII[0];
                while (lIIlIlIIllIIlIll(llllllllllllIllIlIIlllllllIIlIlI, llllllllllllIllIlIIlllllllIIlIIl)) {
                    llllllllllllIllIlIIlllllllIIIllI.fireChannelRead(llllllllllllIllIlIIlllllllIIlIII.get(llllllllllllIllIlIIlllllllIIlIlI));
                    "".length();
                    ++llllllllllllIllIlIIlllllllIIlIlI;
                    "".length();
                    if ((0x19 ^ 0x1C) == 0x0) {
                        return;
                    }
                }
                llllllllllllIllIlIIlllllllIIlIII.recycle();
                "".length();
            }
            "".length();
            if ("  ".length() >= (0xD ^ 0x9)) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIlllllllIIIllI.fireChannelRead(llllllllllllIllIlIIlllllllIIIlIl);
            "".length();
        }
    }
    
    private static boolean lIIlIlIIllIIlIll(final int llllllllllllIllIlIIlllllIlIIllII, final int llllllllllllIllIlIIlllllIlIIlIll) {
        return llllllllllllIllIlIIlllllIlIIllII < llllllllllllIllIlIIlllllIlIIlIll;
    }
    
    public void setSingleDecode(final boolean llllllllllllIllIlIIlllllllllIIll) {
        this.singleDecode = llllllllllllIllIlIIlllllllllIIll;
    }
    
    public boolean isSingleDecode() {
        return this.singleDecode;
    }
    
    private static String lIIlIlIIllIIIIlI(final String llllllllllllIllIlIIlllllIllIIIll, final String llllllllllllIllIlIIlllllIllIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlllllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlllllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlllllIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlllllIllIIlll.init(ByteToMessageDecoder.llIlIlIlllllII[2], llllllllllllIllIlIIlllllIllIlIII);
            return new String(llllllllllllIllIlIIlllllIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlllllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlllllIllIIllI) {
            llllllllllllIllIlIIlllllIllIIllI.printStackTrace();
            return null;
        }
    }
    
    protected abstract void decode(final ChannelHandlerContext p0, final ByteBuf p1, final List<Object> p2) throws Exception;
    
    private static void lIIlIlIIllIIIlII() {
        (llIlIlIlllllII = new int[4])[0] = ((0x71 ^ 0x39 ^ (0xC4 ^ 0x9D)) & (5 + 79 - 49 + 141 ^ 151 + 67 - 201 + 144 ^ -" ".length()));
        ByteToMessageDecoder.llIlIlIlllllII[1] = " ".length();
        ByteToMessageDecoder.llIlIlIlllllII[2] = "  ".length();
        ByteToMessageDecoder.llIlIlIlllllII[3] = (0xAA ^ 0xA2);
    }
    
    protected ByteBuf internalBuffer() {
        if (lIIlIlIIllIIIllI(this.cumulation)) {
            return this.cumulation;
        }
        return Unpooled.EMPTY_BUFFER;
    }
    
    protected ByteToMessageDecoder() {
        if (lIIlIlIIllIIIlIl(this.isSharable() ? 1 : 0)) {
            throw new IllegalStateException(ByteToMessageDecoder.llIlIlIllllIll[ByteToMessageDecoder.llIlIlIlllllII[0]]);
        }
    }
    
    protected void callDecode(final ChannelHandlerContext llllllllllllIllIlIIlllllIlllllIl, final ByteBuf llllllllllllIllIlIIllllllIIIIIII, final List<Object> llllllllllllIllIlIIlllllIlllllll) {
        try {
            while (lIIlIlIIllIIIlIl(llllllllllllIllIlIIllllllIIIIIII.isReadable() ? 1 : 0)) {
                final int llllllllllllIllIlIIllllllIIIIllI = llllllllllllIllIlIIlllllIlllllll.size();
                final int llllllllllllIllIlIIllllllIIIIlIl = llllllllllllIllIlIIllllllIIIIIII.readableBytes();
                this.decode(llllllllllllIllIlIIlllllIlllllIl, llllllllllllIllIlIIllllllIIIIIII, llllllllllllIllIlIIlllllIlllllll);
                if (lIIlIlIIllIIIlIl(llllllllllllIllIlIIlllllIlllllIl.isRemoved() ? 1 : 0)) {
                    "".length();
                    if (-(0x6A ^ 0x48 ^ (0x87 ^ 0xA1)) > 0) {
                        return;
                    }
                    break;
                }
                else if (lIIlIlIIllIIllII(llllllllllllIllIlIIllllllIIIIllI, llllllllllllIllIlIIlllllIlllllll.size())) {
                    if (!lIIlIlIIllIIllII(llllllllllllIllIlIIllllllIIIIlIl, llllllllllllIllIlIIllllllIIIIIII.readableBytes())) {
                        continue;
                    }
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                    break;
                }
                else {
                    if (lIIlIlIIllIIllII(llllllllllllIllIlIIllllllIIIIlIl, llllllllllllIllIlIIllllllIIIIIII.readableBytes())) {
                        throw new DecoderException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this.getClass())).append(ByteToMessageDecoder.llIlIlIllllIll[ByteToMessageDecoder.llIlIlIlllllII[1]])));
                    }
                    if (lIIlIlIIllIIIlIl(this.isSingleDecode() ? 1 : 0)) {
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        "".length();
                        if (((0x11 ^ 0x26) & ~(0x17 ^ 0x20)) != ((0x43 ^ 0x17) & ~(0x4A ^ 0x1E))) {
                            return;
                        }
                        continue;
                    }
                }
            }
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        catch (DecoderException llllllllllllIllIlIIllllllIIIIlII) {
            throw llllllllllllIllIlIIllllllIIIIlII;
        }
        catch (Throwable llllllllllllIllIlIIllllllIIIIIll) {
            throw new DecoderException(llllllllllllIllIlIIllllllIIIIIll);
        }
    }
    
    private void expandCumulation(final ChannelHandlerContext llllllllllllIllIlIIllllllIllIllI, final int llllllllllllIllIlIIllllllIllIIIl) {
        final ByteBuf llllllllllllIllIlIIllllllIllIlII = this.cumulation;
        this.cumulation = llllllllllllIllIlIIllllllIllIllI.alloc().buffer(llllllllllllIllIlIIllllllIllIlII.readableBytes() + llllllllllllIllIlIIllllllIllIIIl);
        this.cumulation.writeBytes(llllllllllllIllIlIIllllllIllIlII);
        "".length();
        llllllllllllIllIlIIllllllIllIlII.release();
        "".length();
    }
    
    private static boolean lIIlIlIIllIIIlll(final Object llllllllllllIllIlIIlllllIIllllll) {
        return llllllllllllIllIlIIlllllIIllllll == null;
    }
    
    protected void decodeLast(final ChannelHandlerContext llllllllllllIllIlIIlllllIlllIIll, final ByteBuf llllllllllllIllIlIIlllllIlllIIlI, final List<Object> llllllllllllIllIlIIlllllIlllIIIl) throws Exception {
        this.decode(llllllllllllIllIlIIlllllIlllIIll, llllllllllllIllIlIIlllllIlllIIlI, llllllllllllIllIlIIlllllIlllIIIl);
    }
    
    private static boolean lIIlIlIIllIIlIlI(final int llllllllllllIllIlIIlllllIIlllIll) {
        return llllllllllllIllIlIIlllllIIlllIll == 0;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext llllllllllllIllIlIIllllllIIllIII) throws Exception {
        final RecyclableArrayList llllllllllllIllIlIIllllllIIlIlll = RecyclableArrayList.newInstance();
        try {
            if (lIIlIlIIllIIIllI(this.cumulation)) {
                this.callDecode(llllllllllllIllIlIIllllllIIllIII, this.cumulation, llllllllllllIllIlIIllllllIIlIlll);
                this.decodeLast(llllllllllllIllIlIIllllllIIllIII, this.cumulation, llllllllllllIllIlIIllllllIIlIlll);
                "".length();
                if ((0x10 ^ 0x7F ^ (0xC6 ^ 0xAD)) > (137 + 74 - 62 + 39 ^ 81 + 40 - 72 + 135)) {
                    return;
                }
            }
            else {
                this.decodeLast(llllllllllllIllIlIIllllllIIllIII, Unpooled.EMPTY_BUFFER, llllllllllllIllIlIIllllllIIlIlll);
            }
            try {
                if (lIIlIlIIllIIIllI(this.cumulation)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int llllllllllllIllIlIIllllllIIllllI = llllllllllllIllIlIIllllllIIlIlll.size();
                int llllllllllllIllIlIIllllllIIlllll = ByteToMessageDecoder.llIlIlIlllllII[0];
                while (lIIlIlIIllIIlIll(llllllllllllIllIlIIllllllIIlllll, llllllllllllIllIlIIllllllIIllllI)) {
                    llllllllllllIllIlIIllllllIIllIII.fireChannelRead(llllllllllllIllIlIIllllllIIlIlll.get(llllllllllllIllIlIIllllllIIlllll));
                    "".length();
                    ++llllllllllllIllIlIIllllllIIlllll;
                    "".length();
                    if (((0xB5 ^ 0x80 ^ (0xC ^ 0x9)) & (54 + 31 + 25 + 55 ^ 96 + 59 - 66 + 60 ^ -" ".length())) >= "   ".length()) {
                        return;
                    }
                }
                if (lIIlIlIIllIIllIl(llllllllllllIllIlIIllllllIIllllI)) {
                    llllllllllllIllIlIIllllllIIllIII.fireChannelReadComplete();
                    "".length();
                }
                llllllllllllIllIlIIllllllIIllIII.fireChannelInactive();
                "".length();
                llllllllllllIllIlIIllllllIIlIlll.recycle();
                "".length();
                "".length();
                if (((0x63 ^ 0x17 ^ (0xF6 ^ 0xC7)) & (0x30 ^ 0x56 ^ (0x3 ^ 0x20) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            finally {
                llllllllllllIllIlIIllllllIIlIlll.recycle();
                "".length();
            }
            "".length();
            if (((0x5B ^ 0x6E) & ~(0x39 ^ 0xC)) != 0x0) {
                return;
            }
        }
        catch (DecoderException llllllllllllIllIlIIllllllIIlllIl) {
            throw llllllllllllIllIlIIllllllIIlllIl;
        }
        catch (Exception llllllllllllIllIlIIllllllIIlllII) {
            throw new DecoderException(llllllllllllIllIlIIllllllIIlllII);
        }
        finally {
            try {
                if (lIIlIlIIllIIIllI(this.cumulation)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int llllllllllllIllIlIIllllllIIllIlI = llllllllllllIllIlIIllllllIIlIlll.size();
                int llllllllllllIllIlIIllllllIIllIll = ByteToMessageDecoder.llIlIlIlllllII[0];
                while (lIIlIlIIllIIlIll(llllllllllllIllIlIIllllllIIllIll, llllllllllllIllIlIIllllllIIllIlI)) {
                    llllllllllllIllIlIIllllllIIllIII.fireChannelRead(llllllllllllIllIlIIllllllIIlIlll.get(llllllllllllIllIlIIllllllIIllIll));
                    "".length();
                    ++llllllllllllIllIlIIllllllIIllIll;
                    "".length();
                    if ((0xD ^ 0x9) < 0) {
                        return;
                    }
                }
                if (lIIlIlIIllIIllIl(llllllllllllIllIlIIllllllIIllIlI)) {
                    llllllllllllIllIlIIllllllIIllIII.fireChannelReadComplete();
                    "".length();
                }
                llllllllllllIllIlIIllllllIIllIII.fireChannelInactive();
                "".length();
                llllllllllllIllIlIIllllllIIlIlll.recycle();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            finally {
                llllllllllllIllIlIIllllllIIlIlll.recycle();
                "".length();
            }
        }
    }
    
    private static String lIIlIlIIllIIIIII(final String llllllllllllIllIlIIlllllIlIlIllI, final String llllllllllllIllIlIIlllllIlIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlllllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlllllIlIlIlll.getBytes(StandardCharsets.UTF_8)), ByteToMessageDecoder.llIlIlIlllllII[3]), "DES");
            final Cipher llllllllllllIllIlIIlllllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIlllllIlIllIlI.init(ByteToMessageDecoder.llIlIlIlllllII[2], llllllllllllIllIlIIlllllIlIllIll);
            return new String(llllllllllllIllIlIIlllllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlllllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlllllIlIllIIl) {
            llllllllllllIllIlIIlllllIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIllIIllIl(final int llllllllllllIllIlIIlllllIIlllIIl) {
        return llllllllllllIllIlIIlllllIIlllIIl > 0;
    }
    
    static {
        lIIlIlIIllIIIlII();
        lIIlIlIIllIIIIll();
    }
    
    private static boolean lIIlIlIIllIIIlIl(final int llllllllllllIllIlIIlllllIIllllIl) {
        return llllllllllllIllIlIIlllllIIllllIl != 0;
    }
}
