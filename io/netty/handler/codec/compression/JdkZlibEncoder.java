// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelPromiseNotifier;
import java.util.Arrays;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Deflater;

public class JdkZlibEncoder extends ZlibEncoder
{
    private final /* synthetic */ Deflater deflater;
    private /* synthetic */ boolean writeHeader;
    private static final /* synthetic */ byte[] gzipHeader;
    private volatile /* synthetic */ boolean finished;
    private volatile /* synthetic */ ChannelHandlerContext ctx;
    private static final /* synthetic */ String[] lIIllIIlIIIllI;
    private final /* synthetic */ ZlibWrapper wrapper;
    private final /* synthetic */ CRC32 crc;
    private static final /* synthetic */ int[] lIIllIIlIlIIII;
    
    private static boolean llIlIlllIIlIIlI(final Object lllllllllllllIIlIllIIIIllllIlIlI, final Object lllllllllllllIIlIllIIIIllllIlIIl) {
        return lllllllllllllIIlIllIIIIllllIlIlI != lllllllllllllIIlIllIIIIllllIlIIl;
    }
    
    private static boolean llIlIlllIIlIlII(final int lllllllllllllIIlIllIIIIlllIlllll) {
        return lllllllllllllIIlIllIIIIlllIlllll == 0;
    }
    
    @Override
    public boolean isClosed() {
        return this.finished;
    }
    
    public JdkZlibEncoder(final int lllllllllllllIIlIllIIIlIlIlllIlI) {
        this(ZlibWrapper.ZLIB, lllllllllllllIIlIllIIIlIlIlllIlI);
    }
    
    private static String llIlIlllIIIIIll(final String lllllllllllllIIlIllIIIlIIIIIIIIl, final String lllllllllllllIIlIllIIIlIIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIlIIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIIlIIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIIlIIIIIIlIl.init(JdkZlibEncoder.lIIllIIlIlIIII[4], lllllllllllllIIlIllIIIlIIIIIIllI);
            return new String(lllllllllllllIIlIllIIIlIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIlIIIIIIlII) {
            lllllllllllllIIlIllIIIlIIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlllIIlIIII(final Object lllllllllllllIIlIllIIIIllllIIIll) {
        return lllllllllllllIIlIllIIIIllllIIIll == null;
    }
    
    public JdkZlibEncoder(final ZlibWrapper lllllllllllllIIlIllIIIlIlIllIllI) {
        this(lllllllllllllIIlIllIIIlIlIllIllI, JdkZlibEncoder.lIIllIIlIlIIII[0]);
    }
    
    private void deflate(final ByteBuf lllllllllllllIIlIllIIIlIIIllIlll) {
        int lllllllllllllIIlIllIIIlIIIlllIIl;
        do {
            final int lllllllllllllIIlIllIIIlIIIllllII = lllllllllllllIIlIllIIIlIIIllIlll.writerIndex();
            lllllllllllllIIlIllIIIlIIIlllIIl = this.deflater.deflate(lllllllllllllIIlIllIIIlIIIllIlll.array(), lllllllllllllIIlIllIIIlIIIllIlll.arrayOffset() + lllllllllllllIIlIllIIIlIIIllllII, lllllllllllllIIlIllIIIlIIIllIlll.writableBytes(), JdkZlibEncoder.lIIllIIlIlIIII[4]);
            lllllllllllllIIlIllIIIlIIIllIlll.writerIndex(lllllllllllllIIlIllIIIlIIIllllII + lllllllllllllIIlIllIIIlIIIlllIIl);
            "".length();
        } while (!llIlIlllIIlIlIl(lllllllllllllIIlIllIIIlIIIlllIIl));
    }
    
    private ChannelFuture finishEncode(final ChannelHandlerContext lllllllllllllIIlIllIIIlIIlIIIlIl, final ChannelPromise lllllllllllllIIlIllIIIlIIlIIIlII) {
        if (llIlIlllIIlIIll(this.finished ? 1 : 0)) {
            lllllllllllllIIlIllIIIlIIlIIIlII.setSuccess();
            "".length();
            return lllllllllllllIIlIllIIIlIIlIIIlII;
        }
        this.finished = (JdkZlibEncoder.lIIllIIlIlIIII[1] != 0);
        ByteBuf lllllllllllllIIlIllIIIlIIlIIIlll = lllllllllllllIIlIllIIIlIIlIIIlIl.alloc().heapBuffer();
        if (llIlIlllIIlIIll(this.writeHeader ? 1 : 0) && llIlIlllIIlIIIl(this.wrapper, ZlibWrapper.GZIP)) {
            this.writeHeader = (JdkZlibEncoder.lIIllIIlIlIIII[3] != 0);
            lllllllllllllIIlIllIIIlIIlIIIlll.writeBytes(JdkZlibEncoder.gzipHeader);
            "".length();
        }
        this.deflater.finish();
        while (llIlIlllIIlIlII(this.deflater.finished() ? 1 : 0)) {
            this.deflate(lllllllllllllIIlIllIIIlIIlIIIlll);
            if (llIlIlllIIlIlII(lllllllllllllIIlIllIIIlIIlIIIlll.isWritable() ? 1 : 0)) {
                lllllllllllllIIlIllIIIlIIlIIIlIl.write(lllllllllllllIIlIllIIIlIIlIIIlll);
                "".length();
                lllllllllllllIIlIllIIIlIIlIIIlll = lllllllllllllIIlIllIIIlIIlIIIlIl.alloc().heapBuffer();
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        if (llIlIlllIIlIIIl(this.wrapper, ZlibWrapper.GZIP)) {
            final int lllllllllllllIIlIllIIIlIIlIIllII = (int)this.crc.getValue();
            final int lllllllllllllIIlIllIIIlIIlIIlIll = this.deflater.getTotalIn();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIllII);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIllII >>> JdkZlibEncoder.lIIllIIlIlIIII[9]);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIllII >>> JdkZlibEncoder.lIIllIIlIlIIII[11]);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIllII >>> JdkZlibEncoder.lIIllIIlIlIIII[12]);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIlIll);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIlIll >>> JdkZlibEncoder.lIIllIIlIlIIII[9]);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIlIll >>> JdkZlibEncoder.lIIllIIlIlIIII[11]);
            "".length();
            lllllllllllllIIlIllIIIlIIlIIIlll.writeByte(lllllllllllllIIlIllIIIlIIlIIlIll >>> JdkZlibEncoder.lIIllIIlIlIIII[12]);
            "".length();
        }
        this.deflater.end();
        return lllllllllllllIIlIllIIIlIIlIIIlIl.writeAndFlush(lllllllllllllIIlIllIIIlIIlIIIlll, lllllllllllllIIlIllIIIlIIlIIIlII);
    }
    
    public JdkZlibEncoder(final byte[] lllllllllllllIIlIllIIIlIlIlIIlll) {
        this(JdkZlibEncoder.lIIllIIlIlIIII[0], lllllllllllllIIlIllIIIlIlIlIIlll);
    }
    
    private static boolean llIlIlllIIlIIll(final int lllllllllllllIIlIllIIIIllllIIIIl) {
        return lllllllllllllIIlIllIIIIllllIIIIl != 0;
    }
    
    public JdkZlibEncoder(final int lllllllllllllIIlIllIIIlIlIIlllIl, final byte[] lllllllllllllIIlIllIIIlIlIIlllll) {
        this.crc = new CRC32();
        this.writeHeader = (JdkZlibEncoder.lIIllIIlIlIIII[1] != 0);
        if (!llIlIlllIIIlllI(lllllllllllllIIlIllIIIlIlIIlllIl) || llIlIlllIIIllll(lllllllllllllIIlIllIIIlIlIIlllIl, JdkZlibEncoder.lIIllIIlIlIIII[2])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[0]]).append(lllllllllllllIIlIllIIIlIlIIlllIl).append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[8]])));
        }
        if (llIlIlllIIlIIII(lllllllllllllIIlIllIIIlIlIIlllll)) {
            throw new NullPointerException(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[9]]);
        }
        this.wrapper = ZlibWrapper.ZLIB;
        this.deflater = new Deflater(lllllllllllllIIlIllIIIlIlIIlllIl);
        this.deflater.setDictionary(lllllllllllllIIlIllIIIlIlIIlllll);
    }
    
    private static boolean llIlIlllIIlIIIl(final Object lllllllllllllIIlIllIIIIllllIIllI, final Object lllllllllllllIIlIllIIIIllllIIlIl) {
        return lllllllllllllIIlIllIIIIllllIIllI == lllllllllllllIIlIllIIIIllllIIlIl;
    }
    
    public JdkZlibEncoder(final ZlibWrapper lllllllllllllIIlIllIIIlIlIlIllII, final int lllllllllllllIIlIllIIIlIlIlIlllI) {
        this.crc = new CRC32();
        this.writeHeader = (JdkZlibEncoder.lIIllIIlIlIIII[1] != 0);
        if (!llIlIlllIIIlllI(lllllllllllllIIlIllIIIlIlIlIlllI) || llIlIlllIIIllll(lllllllllllllIIlIllIIIlIlIlIlllI, JdkZlibEncoder.lIIllIIlIlIIII[2])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[3]]).append(lllllllllllllIIlIllIIIlIlIlIlllI).append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[1]])));
        }
        if (llIlIlllIIlIIII(lllllllllllllIIlIllIIIlIlIlIllII)) {
            throw new NullPointerException(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[4]]);
        }
        if (llIlIlllIIlIIIl(lllllllllllllIIlIllIIIlIlIlIllII, ZlibWrapper.ZLIB_OR_NONE)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[5]]).append(ZlibWrapper.ZLIB_OR_NONE).append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[6]]).append(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[7]])));
        }
        this.wrapper = lllllllllllllIIlIllIIIlIlIlIllII;
        int nowrap;
        if (llIlIlllIIlIIlI(lllllllllllllIIlIllIIIlIlIlIllII, ZlibWrapper.ZLIB)) {
            nowrap = JdkZlibEncoder.lIIllIIlIlIIII[1];
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            nowrap = JdkZlibEncoder.lIIllIIlIlIIII[3];
        }
        this.deflater = new Deflater(lllllllllllllIIlIllIIIlIlIlIlllI, (boolean)(nowrap != 0));
    }
    
    @Override
    protected final ByteBuf allocateBuffer(final ChannelHandlerContext lllllllllllllIIlIllIIIlIIllIIllI, final ByteBuf lllllllllllllIIlIllIIIlIIllIIlIl, final boolean lllllllllllllIIlIllIIIlIIllIIlII) throws Exception {
        int lllllllllllllIIlIllIIIlIIllIIIll = (int)Math.ceil(lllllllllllllIIlIllIIIlIIllIIlIl.readableBytes() * 1.001) + JdkZlibEncoder.lIIllIIlIlIIII[10];
        if (llIlIlllIIlIIll(this.writeHeader ? 1 : 0)) {
            switch (JdkZlibEncoder$4.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[this.wrapper.ordinal()]) {
                case 1: {
                    lllllllllllllIIlIllIIIlIIllIIIll += JdkZlibEncoder.gzipHeader.length;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 2: {
                    lllllllllllllIIlIllIIIlIIllIIIll += 2;
                    break;
                }
            }
        }
        return lllllllllllllIIlIllIIIlIIllIIllI.alloc().heapBuffer(lllllllllllllIIlIllIIIlIIllIIIll);
    }
    
    private static String llIlIlllIIIIlIl(final String lllllllllllllIIlIllIIIIlllllIllI, final String lllllllllllllIIlIllIIIIlllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIllllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), JdkZlibEncoder.lIIllIIlIlIIII[9]), "DES");
            final Cipher lllllllllllllIIlIllIIIIllllllIII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIIllllllIII.init(JdkZlibEncoder.lIIllIIlIlIIII[4], lllllllllllllIIlIllIIIIllllllIIl);
            return new String(lllllllllllllIIlIllIIIIllllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIlllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIlllllIlll) {
            lllllllllllllIIlIllIIIIlllllIlll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlIlllIIIlIII() {
        (lIIllIIlIIIllI = new String[JdkZlibEncoder.lIIllIIlIlIIII[13]])[JdkZlibEncoder.lIIllIIlIlIIII[3]] = llIlIlllIIIIIll("uUFCGMCp7z814T049HnVSGNX7AXmjj76", "rGlGG");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[1]] = llIlIlllIIIIIll("N7lVX1sxTUMGqL6x4rjCiUDA1duyvgQk", "NiDBk");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[4]] = llIlIlllIIIIlIl("sJYRhed5yIs=", "LVpCN");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[5]] = llIlIlllIIIIlIl("xVNAPZJozLzGHOWxbEnq3w==", "LzgDR");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[6]] = llIlIlllIIIIIll("A4BoLNQfmZVueP8RdxoMbg==", "Uctib");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[7]] = llIlIlllIIIIlIl("Genes7yq8OZGyg/eeWIoSy+i7D3J6oQD4h2MUd/F+6Y=", "ltEcD");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[0]] = llIlIlllIIIIIll("KrmGYFlZUIgHBm8vRL36JDmdUq17Z0P9", "zhOHH");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[8]] = llIlIlllIIIIIll("lQgesdv++naiGernSZyYCaAKfHyIst8s", "WVJYq");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[9]] = llIlIlllIIIIlIl("5kYop5HoAKa4iNa+iWUK4A==", "psLaG");
        JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[2]] = llIlIlllIIIIlIl("koXtp44EtTU2H3dDYxSLYRXTgUpWt/ft", "blmIe");
    }
    
    @Override
    public ChannelFuture close(final ChannelPromise lllllllllllllIIlIllIIIlIlIIlIIIl) {
        final ChannelHandlerContext lllllllllllllIIlIllIIIlIlIIlIIII = this.ctx();
        final EventExecutor lllllllllllllIIlIllIIIlIlIIIllll = lllllllllllllIIlIllIIIlIlIIlIIII.executor();
        if (llIlIlllIIlIIll(lllllllllllllIIlIllIIIlIlIIIllll.inEventLoop() ? 1 : 0)) {
            return this.finishEncode(lllllllllllllIIlIllIIIlIlIIlIIII, lllllllllllllIIlIllIIIlIlIIlIIIl);
        }
        final ChannelPromise lllllllllllllIIlIllIIIlIlIIlIIll = lllllllllllllIIlIllIIIlIlIIlIIII.newPromise();
        lllllllllllllIIlIllIIIlIlIIIllll.execute(new Runnable() {
            private static final /* synthetic */ int[] llIlIIlIIIllIl;
            
            @Override
            public void run() {
                final ChannelFuture access$100;
                final ChannelFuture llllllllllllIllIllIIIlllIllIIllI = access$100 = JdkZlibEncoder.this.finishEncode(JdkZlibEncoder.this.ctx(), lllllllllllllIIlIllIIIlIlIIlIIll);
                final ChannelPromise[] llllllllllllIlllIllIlIIIIIlIIIlI = new ChannelPromise[JdkZlibEncoder$1.llIlIIlIIIllIl[0]];
                llllllllllllIlllIllIlIIIIIlIIIlI[JdkZlibEncoder$1.llIlIIlIIIllIl[1]] = lllllllllllllIIlIllIIIlIlIIlIIIl;
                access$100.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelPromiseNotifier(llllllllllllIlllIllIlIIIIIlIIIlI));
                "".length();
            }
            
            static {
                lIIlIIlIIlIlIIll();
            }
            
            private static void lIIlIIlIIlIlIIll() {
                (llIlIIlIIIllIl = new int[2])[0] = " ".length();
                JdkZlibEncoder$1.llIlIIlIIIllIl[1] = ((0x42 ^ 0x4B) & ~(0xBC ^ 0xB5));
            }
        });
        return lllllllllllllIIlIllIIIlIlIIlIIll;
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIIlIllIIIlIIIllIIIl) throws Exception {
        this.ctx = lllllllllllllIIlIllIIIlIIIllIIIl;
    }
    
    private static boolean llIlIlllIIIllll(final int lllllllllllllIIlIllIIIIllllIlllI, final int lllllllllllllIIlIllIIIIllllIllIl) {
        return lllllllllllllIIlIllIIIIllllIlllI > lllllllllllllIIlIllIIIIllllIllIl;
    }
    
    static {
        llIlIlllIIIllIl();
        llIlIlllIIIlIII();
        final byte[] gzipHeader2 = new byte[JdkZlibEncoder.lIIllIIlIlIIII[13]];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[3]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[14];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[1]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[15];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[4]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[9];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[5]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[6]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[7]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[0]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[8]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[9]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader2[JdkZlibEncoder.lIIllIIlIlIIII[2]] = (byte)JdkZlibEncoder.lIIllIIlIlIIII[3];
        gzipHeader = gzipHeader2;
    }
    
    @Override
    public ChannelFuture close() {
        return this.close(this.ctx().newPromise());
    }
    
    private ChannelHandlerContext ctx() {
        final ChannelHandlerContext lllllllllllllIIlIllIIIlIlIIIIllI = this.ctx;
        if (llIlIlllIIlIIII(lllllllllllllIIlIllIIIlIlIIIIllI)) {
            throw new IllegalStateException(JdkZlibEncoder.lIIllIIlIIIllI[JdkZlibEncoder.lIIllIIlIlIIII[2]]);
        }
        return lllllllllllllIIlIllIIIlIlIIIIllI;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIlIllIIIlIIlllIlll, final ByteBuf lllllllllllllIIlIllIIIlIIlllIIII, final ByteBuf lllllllllllllIIlIllIIIlIIllIllll) throws Exception {
        if (llIlIlllIIlIIll(this.finished ? 1 : 0)) {
            lllllllllllllIIlIllIIIlIIllIllll.writeBytes(lllllllllllllIIlIllIIIlIIlllIIII);
            "".length();
            return;
        }
        final int lllllllllllllIIlIllIIIlIIlllIlII = lllllllllllllIIlIllIIIlIIlllIIII.readableBytes();
        byte[] lllllllllllllIIlIllIIIlIIlllIIlI;
        int lllllllllllllIIlIllIIIlIIlllIIll;
        if (llIlIlllIIlIIll(lllllllllllllIIlIllIIIlIIlllIIII.hasArray() ? 1 : 0)) {
            final byte[] lllllllllllllIIlIllIIIlIIllllIIl = lllllllllllllIIlIllIIIlIIlllIIII.array();
            final int lllllllllllllIIlIllIIIlIIllllIlI = lllllllllllllIIlIllIIIlIIlllIIII.arrayOffset() + lllllllllllllIIlIllIIIlIIlllIIII.readerIndex();
            lllllllllllllIIlIllIIIlIIlllIIII.skipBytes(lllllllllllllIIlIllIIIlIIlllIlII);
            "".length();
            "".length();
            if (((0x27 ^ 0x73) & ~(0x9 ^ 0x5D)) != 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIllIIIlIIlllIIlI = new byte[lllllllllllllIIlIllIIIlIIlllIlII];
            lllllllllllllIIlIllIIIlIIlllIIII.readBytes(lllllllllllllIIlIllIIIlIIlllIIlI);
            "".length();
            lllllllllllllIIlIllIIIlIIlllIIll = JdkZlibEncoder.lIIllIIlIlIIII[3];
        }
        if (llIlIlllIIlIIll(this.writeHeader ? 1 : 0)) {
            this.writeHeader = (JdkZlibEncoder.lIIllIIlIlIIII[3] != 0);
            if (llIlIlllIIlIIIl(this.wrapper, ZlibWrapper.GZIP)) {
                lllllllllllllIIlIllIIIlIIllIllll.writeBytes(JdkZlibEncoder.gzipHeader);
                "".length();
            }
        }
        if (llIlIlllIIlIIIl(this.wrapper, ZlibWrapper.GZIP)) {
            this.crc.update(lllllllllllllIIlIllIIIlIIlllIIlI, lllllllllllllIIlIllIIIlIIlllIIll, lllllllllllllIIlIllIIIlIIlllIlII);
        }
        this.deflater.setInput(lllllllllllllIIlIllIIIlIIlllIIlI, lllllllllllllIIlIllIIIlIIlllIIll, lllllllllllllIIlIllIIIlIIlllIlII);
        while (llIlIlllIIlIlII(this.deflater.needsInput() ? 1 : 0)) {
            this.deflate(lllllllllllllIIlIllIIIlIIllIllll);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
    }
    
    public JdkZlibEncoder() {
        this(JdkZlibEncoder.lIIllIIlIlIIII[0]);
    }
    
    private static boolean llIlIlllIIlIlIl(final int lllllllllllllIIlIllIIIIlllIllIll) {
        return lllllllllllllIIlIllIIIIlllIllIll <= 0;
    }
    
    private static void llIlIlllIIIllIl() {
        (lIIllIIlIlIIII = new int[16])[0] = (0x64 ^ 0xB ^ (0x3F ^ 0x56));
        JdkZlibEncoder.lIIllIIlIlIIII[1] = " ".length();
        JdkZlibEncoder.lIIllIIlIlIIII[2] = (0x30 ^ 0x14 ^ (0x90 ^ 0xBD));
        JdkZlibEncoder.lIIllIIlIlIIII[3] = ((0x93 ^ 0x95) & ~(0x74 ^ 0x72));
        JdkZlibEncoder.lIIllIIlIlIIII[4] = "  ".length();
        JdkZlibEncoder.lIIllIIlIlIIII[5] = "   ".length();
        JdkZlibEncoder.lIIllIIlIlIIII[6] = (0xA2 ^ 0xA6);
        JdkZlibEncoder.lIIllIIlIlIIII[7] = (0x23 ^ 0x26);
        JdkZlibEncoder.lIIllIIlIlIIII[8] = (0x1D ^ 0x1A);
        JdkZlibEncoder.lIIllIIlIlIIII[9] = (0x4A ^ 0x42);
        JdkZlibEncoder.lIIllIIlIlIIII[10] = (0x3A ^ 0x43 ^ (0xF ^ 0x7A));
        JdkZlibEncoder.lIIllIIlIlIIII[11] = (28 + 132 - 133 + 145 ^ 54 + 113 - 15 + 36);
        JdkZlibEncoder.lIIllIIlIlIIII[12] = (0xA5 ^ 0x91 ^ (0x7C ^ 0x50));
        JdkZlibEncoder.lIIllIIlIlIIII[13] = (0x16 ^ 0x1C);
        JdkZlibEncoder.lIIllIIlIlIIII[14] = (0x5D ^ 0x53 ^ (0x6 ^ 0x17));
        JdkZlibEncoder.lIIllIIlIlIIII[15] = -(174 + 17 - 178 + 166 ^ 166 + 93 - 224 + 163);
    }
    
    @Override
    public void close(final ChannelHandlerContext lllllllllllllIIlIllIIIlIIlIllIIl, final ChannelPromise lllllllllllllIIlIllIIIlIIlIllIII) throws Exception {
        final ChannelFuture lllllllllllllIIlIllIIIlIIlIlIlll = this.finishEncode(lllllllllllllIIlIllIIIlIIlIllIIl, lllllllllllllIIlIllIIIlIIlIllIIl.newPromise());
        lllllllllllllIIlIllIIIlIIlIlIlll.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIIllIIllIIIIllIIlIl) throws Exception {
                lllllllllllllIIlIllIIIlIIlIllIIl.close(lllllllllllllIIlIllIIIlIIlIllIII);
                "".length();
            }
        });
        "".length();
        if (llIlIlllIIlIlII(lllllllllllllIIlIllIIIlIIlIlIlll.isDone() ? 1 : 0)) {
            lllllllllllllIIlIllIIIlIIlIllIIl.executor().schedule((Runnable)new Runnable() {
                @Override
                public void run() {
                    lllllllllllllIIlIllIIIlIIlIllIIl.close(lllllllllllllIIlIllIIIlIIlIllIII);
                    "".length();
                }
            }, 10L, TimeUnit.SECONDS);
            "".length();
        }
    }
    
    private static boolean llIlIlllIIIlllI(final int lllllllllllllIIlIllIIIIlllIlllIl) {
        return lllllllllllllIIlIllIIIIlllIlllIl >= 0;
    }
}
