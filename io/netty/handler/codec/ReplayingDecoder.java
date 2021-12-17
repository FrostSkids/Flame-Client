// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import io.netty.util.internal.RecyclableArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.Signal;

public abstract class ReplayingDecoder<S> extends ByteToMessageDecoder
{
    private static final /* synthetic */ int[] lllllllIlIllI;
    private static final /* synthetic */ String[] lllllllIlIlIl;
    static final /* synthetic */ Signal REPLAY;
    private /* synthetic */ S state;
    private final /* synthetic */ ReplayingDecoderBuffer replayable;
    private /* synthetic */ int checkpoint;
    
    private static void lIllIIIlIlIIlII() {
        (lllllllIlIllI = new int[8])[0] = -" ".length();
        ReplayingDecoder.lllllllIlIllI[1] = ((0x43 ^ 0x54) & ~(0x3A ^ 0x2D));
        ReplayingDecoder.lllllllIlIllI[2] = " ".length();
        ReplayingDecoder.lllllllIlIllI[3] = "  ".length();
        ReplayingDecoder.lllllllIlIllI[4] = "   ".length();
        ReplayingDecoder.lllllllIlIllI[5] = (0xF ^ 0xB);
        ReplayingDecoder.lllllllIlIllI[6] = (0x8E ^ 0x8B);
        ReplayingDecoder.lllllllIlIllI[7] = (173 + 100 - 105 + 18 ^ 145 + 132 - 178 + 79);
    }
    
    @Override
    protected void callDecode(final ChannelHandlerContext lllllllllllllIlIlIIlllIlllllIlll, final ByteBuf lllllllllllllIlIlIIlllIllllllIlI, final List<Object> lllllllllllllIlIlIIlllIlllllIlIl) {
        this.replayable.setCumulation(lllllllllllllIlIlIIlllIllllllIlI);
        try {
            while (lIllIIIlIlIlIII(lllllllllllllIlIlIIlllIllllllIlI.isReadable() ? 1 : 0)) {
                final int readerIndex = lllllllllllllIlIlIIlllIllllllIlI.readerIndex();
                this.checkpoint = readerIndex;
                final int lllllllllllllIlIlIIllllIIIIIIIlI = readerIndex;
                final int lllllllllllllIlIlIIllllIIIIIIIIl = lllllllllllllIlIlIIlllIlllllIlIl.size();
                final S lllllllllllllIlIlIIllllIIIIIIIII = this.state;
                final int lllllllllllllIlIlIIlllIlllllllll = lllllllllllllIlIlIIlllIllllllIlI.readableBytes();
                try {
                    this.decode(lllllllllllllIlIlIIlllIlllllIlll, this.replayable, lllllllllllllIlIlIIlllIlllllIlIl);
                    if (lIllIIIlIlIlIII(lllllllllllllIlIlIIlllIlllllIlll.isRemoved() ? 1 : 0)) {
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else if (lIllIIIlIlIlIIl(lllllllllllllIlIlIIllllIIIIIIIIl, lllllllllllllIlIlIIlllIlllllIlIl.size())) {
                        if (lIllIIIlIlIlIIl(lllllllllllllIlIlIIlllIlllllllll, lllllllllllllIlIlIIlllIllllllIlI.readableBytes()) && lIllIIIlIlIlIlI(lllllllllllllIlIlIIllllIIIIIIIII, this.state)) {
                            throw new DecoderException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this.getClass())).append(ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[1]]).append(ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[2]])));
                        }
                        "".length();
                        if (-(0x60 ^ 0x58 ^ (0xB ^ 0x37)) > 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        "".length();
                        if (((0xC8 ^ 0xB8 ^ (0x33 ^ 0x16)) & (63 + 85 - 35 + 99 ^ 62 + 68 - 14 + 13 ^ -" ".length())) > 0) {
                            return;
                        }
                    }
                }
                catch (Signal lllllllllllllIlIlIIllllIIIIIIIll) {
                    lllllllllllllIlIlIIllllIIIIIIIll.expect(ReplayingDecoder.REPLAY);
                    if (lIllIIIlIlIlIII(lllllllllllllIlIlIIlllIlllllIlll.isRemoved() ? 1 : 0)) {
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        break;
                    }
                    else {
                        final int lllllllllllllIlIlIIllllIIIIIIlII = this.checkpoint;
                        if (lIllIIIlIlIlIll(lllllllllllllIlIlIIllllIIIIIIlII)) {
                            lllllllllllllIlIlIIlllIllllllIlI.readerIndex(lllllllllllllIlIlIIllllIIIIIIlII);
                            "".length();
                        }
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                }
                if (lIllIIIlIlIlIIl(lllllllllllllIlIlIIllllIIIIIIIlI, lllllllllllllIlIlIIlllIllllllIlI.readerIndex()) && lIllIIIlIlIlIlI(lllllllllllllIlIlIIllllIIIIIIIII, this.state)) {
                    throw new DecoderException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this.getClass())).append(ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[3]]).append(ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[4]])));
                }
                if (lIllIIIlIlIlIII(this.isSingleDecode() ? 1 : 0)) {
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
            }
            "".length();
            if ("   ".length() >= (0x6 ^ 0x2)) {
                return;
            }
        }
        catch (DecoderException lllllllllllllIlIlIIlllIllllllllI) {
            throw lllllllllllllIlIlIIlllIllllllllI;
        }
        catch (Throwable lllllllllllllIlIlIIlllIlllllllIl) {
            throw new DecoderException(lllllllllllllIlIlIIlllIlllllllIl);
        }
    }
    
    protected ReplayingDecoder() {
        this(null);
    }
    
    protected ReplayingDecoder(final S lllllllllllllIlIlIIllllIIlIIlIII) {
        this.replayable = new ReplayingDecoderBuffer();
        this.checkpoint = ReplayingDecoder.lllllllIlIllI[0];
        this.state = lllllllllllllIlIlIIllllIIlIIlIII;
    }
    
    protected void checkpoint(final S lllllllllllllIlIlIIllllIIIllllll) {
        this.checkpoint();
        this.state(lllllllllllllIlIlIIllllIIIllllll);
        "".length();
    }
    
    private static boolean lIllIIIlIlIlIll(final int lllllllllllllIlIlIIlllIllIlIlIll) {
        return lllllllllllllIlIlIIlllIllIlIlIll >= 0;
    }
    
    private static String lIllIIIlIlIIIIl(final String lllllllllllllIlIlIIlllIlllIIIIlI, final String lllllllllllllIlIlIIlllIllIllllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlllIlllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlllIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlllIlllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlllIlllIIIlII.init(ReplayingDecoder.lllllllIlIllI[3], lllllllllllllIlIlIIlllIlllIIIlIl);
            return new String(lllllllllllllIlIlIIlllIlllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlllIlllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlllIlllIIIIll) {
            lllllllllllllIlIlIIlllIlllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIlIlIlIlI(final Object lllllllllllllIlIlIIlllIllIllIIII, final Object lllllllllllllIlIlIIlllIllIlIllll) {
        return lllllllllllllIlIlIIlllIllIllIIII == lllllllllllllIlIlIIlllIllIlIllll;
    }
    
    private static boolean lIllIIIlIlIlIIl(final int lllllllllllllIlIlIIlllIllIlllIlI, final int lllllllllllllIlIlIIlllIllIlllIIl) {
        return lllllllllllllIlIlIIlllIllIlllIlI == lllllllllllllIlIlIIlllIllIlllIIl;
    }
    
    protected void checkpoint() {
        this.checkpoint = this.internalBuffer().readerIndex();
    }
    
    private static boolean lIllIIIlIlIIllI(final int lllllllllllllIlIlIIlllIllIllIllI, final int lllllllllllllIlIlIIlllIllIllIlIl) {
        return lllllllllllllIlIlIIlllIllIllIllI < lllllllllllllIlIlIIlllIllIllIlIl;
    }
    
    private static boolean lIllIIIlIlIIlll(final int lllllllllllllIlIlIIlllIllIlIlIIl) {
        return lllllllllllllIlIlIIlllIllIlIlIIl > 0;
    }
    
    private static boolean lIllIIIlIlIlIII(final int lllllllllllllIlIlIIlllIllIlIllIl) {
        return lllllllllllllIlIlIIlllIllIlIllIl != 0;
    }
    
    private static String lIllIIIlIlIIIlI(String lllllllllllllIlIlIIlllIlllIlllll, final String lllllllllllllIlIlIIlllIlllIllllI) {
        lllllllllllllIlIlIIlllIlllIlllll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlllIlllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlllIllllIIIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIIlllIllllIIIIl = lllllllllllllIlIlIIlllIlllIllllI.toCharArray();
        int lllllllllllllIlIlIIlllIllllIIIII = ReplayingDecoder.lllllllIlIllI[1];
        final byte lllllllllllllIlIlIIlllIlllIllIlI = (Object)((String)lllllllllllllIlIlIIlllIlllIlllll).toCharArray();
        final int lllllllllllllIlIlIIlllIlllIllIIl = lllllllllllllIlIlIIlllIlllIllIlI.length;
        double lllllllllllllIlIlIIlllIlllIllIII = ReplayingDecoder.lllllllIlIllI[1];
        while (lIllIIIlIlIIllI((int)lllllllllllllIlIlIIlllIlllIllIII, lllllllllllllIlIlIIlllIlllIllIIl)) {
            final char lllllllllllllIlIlIIlllIllllIIlIl = lllllllllllllIlIlIIlllIlllIllIlI[lllllllllllllIlIlIIlllIlllIllIII];
            lllllllllllllIlIlIIlllIllllIIIlI.append((char)(lllllllllllllIlIlIIlllIllllIIlIl ^ lllllllllllllIlIlIIlllIllllIIIIl[lllllllllllllIlIlIIlllIllllIIIII % lllllllllllllIlIlIIlllIllllIIIIl.length]));
            "".length();
            ++lllllllllllllIlIlIIlllIllllIIIII;
            ++lllllllllllllIlIlIIlllIlllIllIII;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlllIllllIIIlI);
    }
    
    private static void lIllIIIlIlIIIll() {
        (lllllllIlIlIl = new String[ReplayingDecoder.lllllllIlIllI[6]])[ReplayingDecoder.lllllllIlIllI[1]] = lIllIIIlIIllIll("6b+kALDjdpSFxR5IAWh18bHDze/KI2xwfuukgK298WOuxPxXsPhOzg==", "jTIZp");
        ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[2]] = lIllIIIlIlIIIIl("weJWZqUuC7T5pNwZF+cZ/KhbfHSbAswKMxtjmFShoz/+vk78jw/GoN3Ihps6vJC99Ut6IYuoqcY=", "DxBiT");
        ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[3]] = lIllIIIlIlIIIlI("XBIwCDgWE31Cdx8TIQM4FlY4HiQGVjYEOQEDOA53Bh4wSz4cFDoeORZWMQojE1Y=", "rvUkW");
        ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[4]] = lIllIIIlIlIIIIl("MJuUQapJCDfF98OlSTZd+M3aSYK9hKyNIZcqcBOmZrpxydwWjJiTT1cxed/uVXzP", "zAPkg");
        ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[5]] = lIllIIIlIlIIIlI("dwsSJw0YAA==", "YYWwA");
    }
    
    private static String lIllIIIlIIllIll(final String lllllllllllllIlIlIIlllIlllIIllll, final String lllllllllllllIlIlIIlllIlllIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlllIlllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlllIlllIIllII.getBytes(StandardCharsets.UTF_8)), ReplayingDecoder.lllllllIlIllI[7]), "DES");
            final Cipher lllllllllllllIlIlIIlllIlllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlllIlllIlIIIl.init(ReplayingDecoder.lllllllIlIllI[3], lllllllllllllIlIlIIlllIlllIlIIlI);
            return new String(lllllllllllllIlIlIIlllIlllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlllIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlllIlllIlIIII) {
            lllllllllllllIlIlIIlllIlllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIlIlIIlIl(final Object lllllllllllllIlIlIIlllIllIllIIll) {
        return lllllllllllllIlIlIIlllIllIllIIll != null;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIlIlIIllllIIIIllIII) throws Exception {
        final RecyclableArrayList lllllllllllllIlIlIIllllIIIIllIlI = RecyclableArrayList.newInstance();
        try {
            this.replayable.terminate();
            this.callDecode(lllllllllllllIlIlIIllllIIIIllIII, this.internalBuffer(), lllllllllllllIlIlIIllllIIIIllIlI);
            this.decodeLast(lllllllllllllIlIlIIllllIIIIllIII, this.replayable, lllllllllllllIlIlIIllllIIIIllIlI);
            try {
                if (lIllIIIlIlIIlIl(this.cumulation)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int lllllllllllllIlIlIIllllIIIlIIlII = lllllllllllllIlIlIIllllIIIIllIlI.size();
                int lllllllllllllIlIlIIllllIIIlIIlIl = ReplayingDecoder.lllllllIlIllI[1];
                while (lIllIIIlIlIIllI(lllllllllllllIlIlIIllllIIIlIIlIl, lllllllllllllIlIlIIllllIIIlIIlII)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelRead(lllllllllllllIlIlIIllllIIIIllIlI.get(lllllllllllllIlIlIIllllIIIlIIlIl));
                    "".length();
                    ++lllllllllllllIlIlIIllllIIIlIIlIl;
                    "".length();
                    if (((49 + 100 + 72 + 14 ^ 103 + 9 - 75 + 161) & (0xF5 ^ 0xB8 ^ (0x27 ^ 0x47) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                }
                if (lIllIIIlIlIIlll(lllllllllllllIlIlIIllllIIIlIIlII)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelReadComplete();
                    "".length();
                }
                lllllllllllllIlIlIIllllIIIIllIII.fireChannelInactive();
                "".length();
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
                "".length();
                if (((20 + 106 + 89 + 9 ^ 81 + 63 - 63 + 48) & (0x2E ^ 0x22 ^ (0x59 ^ 0x34) ^ -" ".length())) < 0) {
                    return;
                }
            }
            finally {
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
            }
            "".length();
            if (((0x97 ^ 0xA3) & ~(0x6F ^ 0x5B)) < 0) {
                return;
            }
        }
        catch (Signal lllllllllllllIlIlIIllllIIIlIIIll) {
            lllllllllllllIlIlIIllllIIIlIIIll.expect(ReplayingDecoder.REPLAY);
            try {
                if (lIllIIIlIlIIlIl(this.cumulation)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int lllllllllllllIlIlIIllllIIIlIIIIl = lllllllllllllIlIlIIllllIIIIllIlI.size();
                int lllllllllllllIlIlIIllllIIIlIIIlI = ReplayingDecoder.lllllllIlIllI[1];
                while (lIllIIIlIlIIllI(lllllllllllllIlIlIIllllIIIlIIIlI, lllllllllllllIlIlIIllllIIIlIIIIl)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelRead(lllllllllllllIlIlIIllllIIIIllIlI.get(lllllllllllllIlIlIIllllIIIlIIIlI));
                    "".length();
                    ++lllllllllllllIlIlIIllllIIIlIIIlI;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                if (lIllIIIlIlIIlll(lllllllllllllIlIlIIllllIIIlIIIIl)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelReadComplete();
                    "".length();
                }
                lllllllllllllIlIlIIllllIIIIllIII.fireChannelInactive();
                "".length();
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            finally {
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
            }
            "".length();
            if (" ".length() > (0xF8 ^ 0xA6 ^ (0x20 ^ 0x7A))) {
                return;
            }
        }
        catch (DecoderException lllllllllllllIlIlIIllllIIIlIIIII) {
            throw lllllllllllllIlIlIIllllIIIlIIIII;
        }
        catch (Exception lllllllllllllIlIlIIllllIIIIlllll) {
            throw new DecoderException(lllllllllllllIlIlIIllllIIIIlllll);
        }
        finally {
            try {
                if (lIllIIIlIlIIlIl(this.cumulation)) {
                    this.cumulation.release();
                    "".length();
                    this.cumulation = null;
                }
                final int lllllllllllllIlIlIIllllIIIIlllIl = lllllllllllllIlIlIIllllIIIIllIlI.size();
                int lllllllllllllIlIlIIllllIIIIllllI = ReplayingDecoder.lllllllIlIllI[1];
                while (lIllIIIlIlIIllI(lllllllllllllIlIlIIllllIIIIllllI, lllllllllllllIlIlIIllllIIIIlllIl)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelRead(lllllllllllllIlIlIIllllIIIIllIlI.get(lllllllllllllIlIlIIllllIIIIllllI));
                    "".length();
                    ++lllllllllllllIlIlIIllllIIIIllllI;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                if (lIllIIIlIlIIlll(lllllllllllllIlIlIIllllIIIIlllIl)) {
                    lllllllllllllIlIlIIllllIIIIllIII.fireChannelReadComplete();
                    "".length();
                }
                lllllllllllllIlIlIIllllIIIIllIII.fireChannelInactive();
                "".length();
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
                "".length();
                if (-" ".length() >= ((0x3F ^ 0x5C) & ~(0x58 ^ 0x3B))) {
                    return;
                }
            }
            finally {
                lllllllllllllIlIlIIllllIIIIllIlI.recycle();
                "".length();
            }
        }
    }
    
    protected S state(final S lllllllllllllIlIlIIllllIIIllIIlI) {
        final S lllllllllllllIlIlIIllllIIIllIlII = this.state;
        this.state = lllllllllllllIlIlIIllllIIIllIIlI;
        return lllllllllllllIlIlIIllllIIIllIlII;
    }
    
    static {
        lIllIIIlIlIIlII();
        lIllIIIlIlIIIll();
        REPLAY = Signal.valueOf(String.valueOf(new StringBuilder().append(ReplayingDecoder.class.getName()).append(ReplayingDecoder.lllllllIlIlIl[ReplayingDecoder.lllllllIlIllI[5]])));
    }
    
    protected S state() {
        return this.state;
    }
}
