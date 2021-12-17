// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import io.netty.util.concurrent.EventExecutor;
import io.netty.channel.ChannelPromiseNotifier;
import java.util.concurrent.TimeUnit;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import com.jcraft.jzlib.JZlib;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.internal.EmptyArrays;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.jcraft.jzlib.Deflater;
import io.netty.channel.ChannelHandlerContext;

public class JZlibEncoder extends ZlibEncoder
{
    private volatile /* synthetic */ boolean finished;
    private static final /* synthetic */ int[] lIIlIIIlIlllIl;
    private static final /* synthetic */ String[] lIIlIIIlIllIlI;
    private volatile /* synthetic */ ChannelHandlerContext ctx;
    private final /* synthetic */ Deflater z;
    private final /* synthetic */ int wrapperOverhead;
    
    private static String llIIlIllIIIIIIl(final String lllllllllllllIIlllIIlIlIlIIlIllI, final String lllllllllllllIIlllIIlIlIlIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), JZlibEncoder.lIIlIIIlIlllIl[2]), "DES");
            final Cipher lllllllllllllIIlllIIlIlIlIIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIlllIIlIlIlIIllIlI.init(JZlibEncoder.lIIlIIIlIlllIl[6], lllllllllllllIIlllIIlIlIlIIllIll);
            return new String(lllllllllllllIIlllIIlIlIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIlIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIlIlIIllIIl) {
            lllllllllllllIIlllIIlIlIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIllIIIllIl();
        llIIlIllIIIlIII();
    }
    
    private ChannelFuture finishEncode(final ChannelHandlerContext lllllllllllllIIlllIIlIlIlllIlIIl, final ChannelPromise lllllllllllllIIlllIIlIlIlllIlIII) {
        if (llIIlIllIIlIIll(this.finished ? 1 : 0)) {
            lllllllllllllIIlllIIlIlIlllIlIII.setSuccess();
            "".length();
            return lllllllllllllIIlllIIlIlIlllIlIII;
        }
        this.finished = (JZlibEncoder.lIIlIIIlIlllIl[5] != 0);
        ByteBuf lllllllllllllIIlllIIlIlIlllIlIll;
        try {
            this.z.next_in = EmptyArrays.EMPTY_BYTES;
            this.z.next_in_index = JZlibEncoder.lIIlIIIlIlllIl[4];
            this.z.avail_in = JZlibEncoder.lIIlIIIlIlllIl[4];
            final byte[] lllllllllllllIIlllIIlIlIllllIIII = new byte[JZlibEncoder.lIIlIIIlIlllIl[22]];
            this.z.next_out = lllllllllllllIIlllIIlIlIllllIIII;
            this.z.next_out_index = JZlibEncoder.lIIlIIIlIlllIl[4];
            this.z.avail_out = lllllllllllllIIlllIIlIlIllllIIII.length;
            final int lllllllllllllIIlllIIlIlIlllIllll = this.z.deflate(JZlibEncoder.lIIlIIIlIlllIl[8]);
            if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIlIlllIllll) && llIIlIllIIlIllI(lllllllllllllIIlllIIlIlIlllIllll, JZlibEncoder.lIIlIIIlIlllIl[5])) {
                lllllllllllllIIlllIIlIlIlllIlIII.setFailure((Throwable)ZlibUtil.deflaterException(this.z, JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[23]], lllllllllllllIIlllIIlIlIlllIllll));
                "".length();
                final short lllllllllllllIIlllIIlIlIlllIIlII = (short)lllllllllllllIIlllIIlIlIlllIlIII;
                return (ChannelFuture)lllllllllllllIIlllIIlIlIlllIIlII;
            }
            if (llIIlIllIIlIIll(this.z.next_out_index)) {
                final ByteBuf lllllllllllllIIlllIIlIlIllllIIIl = Unpooled.wrappedBuffer(lllllllllllllIIlllIIlIlIllllIIII, JZlibEncoder.lIIlIIIlIlllIl[4], this.z.next_out_index);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllIIlIlIlllIlIll = Unpooled.EMPTY_BUFFER;
            }
            this.z.deflateEnd();
            "".length();
            this.z.next_in = null;
            this.z.next_out = null;
            "".length();
            if ((0xA1 ^ 0x8A ^ (0x4A ^ 0x65)) < 0) {
                return null;
            }
        }
        finally {
            this.z.deflateEnd();
            "".length();
            this.z.next_in = null;
            this.z.next_out = null;
        }
        return lllllllllllllIIlllIIlIlIlllIlIIl.writeAndFlush(lllllllllllllIIlllIIlIlIlllIlIll, lllllllllllllIIlllIIlIlIlllIlIII);
    }
    
    @Override
    public ChannelFuture close() {
        return this.close(this.ctx().channel().newPromise());
    }
    
    private static boolean llIIlIllIIIllll(final int lllllllllllllIIlllIIlIlIlIIIlIII, final int lllllllllllllIIlllIIlIlIlIIIIlll) {
        return lllllllllllllIIlllIIlIlIlIIIlIII > lllllllllllllIIlllIIlIlIlIIIIlll;
    }
    
    public JZlibEncoder(final int lllllllllllllIIlllIIlIllIlIIllIl, final int lllllllllllllIIlllIIlIllIlIIIllI, final int lllllllllllllIIlllIIlIllIlIIIlIl, final byte[] lllllllllllllIIlllIIlIllIlIIlIlI) {
        this.z = new Deflater();
        if (!llIIlIllIIIlllI(lllllllllllllIIlllIIlIllIlIIllIl) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIlIIllIl, JZlibEncoder.lIIlIIIlIlllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[12]]).append(lllllllllllllIIlllIIlIllIlIIllIl).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[13]])));
        }
        if (!llIIlIllIIlIIII(lllllllllllllIIlllIIlIllIlIIIllI, JZlibEncoder.lIIlIIIlIlllIl[3]) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIlIIIllI, JZlibEncoder.lIIlIIIlIlllIl[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[14]]).append(lllllllllllllIIlllIIlIllIlIIIllI).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[15]])));
        }
        if (!llIIlIllIIlIIII(lllllllllllllIIlllIIlIllIlIIIlIl, JZlibEncoder.lIIlIIIlIlllIl[5]) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIlIIIlIl, JZlibEncoder.lIIlIIIlIlllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[1]]).append(lllllllllllllIIlllIIlIllIlIIIlIl).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[16]])));
        }
        if (llIIlIllIIlIIIl(lllllllllllllIIlllIIlIllIlIIlIlI)) {
            throw new NullPointerException(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[17]]);
        }
        int lllllllllllllIIlllIIlIllIlIIlIIl = this.z.deflateInit(lllllllllllllIIlllIIlIllIlIIllIl, lllllllllllllIIlllIIlIllIlIIIllI, lllllllllllllIIlllIIlIllIlIIIlIl, JZlib.W_ZLIB);
        if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIlIIlIIl)) {
            ZlibUtil.fail(this.z, JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[18]], lllllllllllllIIlllIIlIllIlIIlIIl);
            "".length();
            if ("   ".length() < 0) {
                throw null;
            }
        }
        else {
            lllllllllllllIIlllIIlIllIlIIlIIl = this.z.deflateSetDictionary(lllllllllllllIIlllIIlIllIlIIlIlI, lllllllllllllIIlllIIlIllIlIIlIlI.length);
            if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIlIIlIIl)) {
                ZlibUtil.fail(this.z, JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[19]], lllllllllllllIIlllIIlIllIlIIlIIl);
            }
        }
        this.wrapperOverhead = ZlibUtil.wrapperOverhead(ZlibWrapper.ZLIB);
    }
    
    private static boolean llIIlIllIIlIllI(final int lllllllllllllIIlllIIlIlIIlllIllI, final int lllllllllllllIIlllIIlIlIIlllIlIl) {
        return lllllllllllllIIlllIIlIlIIlllIllI != lllllllllllllIIlllIIlIlIIlllIlIl;
    }
    
    public JZlibEncoder(final ZlibWrapper lllllllllllllIIlllIIlIllIllIlIII, final int lllllllllllllIIlllIIlIllIllIIlll, final int lllllllllllllIIlllIIlIllIllIIllI, final int lllllllllllllIIlllIIlIllIllIlIll) {
        this.z = new Deflater();
        if (!llIIlIllIIIlllI(lllllllllllllIIlllIIlIllIllIIlll) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIllIIlll, JZlibEncoder.lIIlIIIlIlllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[4]]).append(lllllllllllllIIlllIIlIllIllIIlll).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[5]])));
        }
        if (!llIIlIllIIlIIII(lllllllllllllIIlllIIlIllIllIIllI, JZlibEncoder.lIIlIIIlIlllIl[3]) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIllIIllI, JZlibEncoder.lIIlIIIlIlllIl[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[6]]).append(lllllllllllllIIlllIIlIllIllIIllI).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[7]])));
        }
        if (!llIIlIllIIlIIII(lllllllllllllIIlllIIlIllIllIlIll, JZlibEncoder.lIIlIIIlIlllIl[5]) || llIIlIllIIIllll(lllllllllllllIIlllIIlIllIllIlIll, JZlibEncoder.lIIlIIIlIlllIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[8]]).append(lllllllllllllIIlllIIlIllIllIlIll).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[9]])));
        }
        if (llIIlIllIIlIIIl(lllllllllllllIIlllIIlIllIllIlIII)) {
            throw new NullPointerException(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[0]]);
        }
        if (llIIlIllIIlIIlI(lllllllllllllIIlllIIlIllIllIlIII, ZlibWrapper.ZLIB_OR_NONE)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[10]]).append(ZlibWrapper.ZLIB_OR_NONE).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[2]]).append(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[3]])));
        }
        final int lllllllllllllIIlllIIlIllIllIlIlI = this.z.init(lllllllllllllIIlllIIlIllIllIIlll, lllllllllllllIIlllIIlIllIllIIllI, lllllllllllllIIlllIIlIllIllIlIll, ZlibUtil.convertWrapperType(lllllllllllllIIlllIIlIllIllIlIII));
        if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIllIlIlI)) {
            ZlibUtil.fail(this.z, JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[11]], lllllllllllllIIlllIIlIllIllIlIlI);
        }
        this.wrapperOverhead = ZlibUtil.wrapperOverhead(lllllllllllllIIlllIIlIllIllIlIII);
    }
    
    @Override
    public void close(final ChannelHandlerContext lllllllllllllIIlllIIlIlIllllllII, final ChannelPromise lllllllllllllIIlllIIlIlIllllllll) {
        final ChannelFuture lllllllllllllIIlllIIlIlIlllllllI = this.finishEncode(lllllllllllllIIlllIIlIlIllllllII, lllllllllllllIIlllIIlIlIllllllII.newPromise());
        lllllllllllllIIlllIIlIlIlllllllI.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIlIIllllllIIIlIIllI) throws Exception {
                lllllllllllllIIlllIIlIlIllllllII.close(lllllllllllllIIlllIIlIlIllllllll);
                "".length();
            }
        });
        "".length();
        if (llIIlIllIIlIlIl(lllllllllllllIIlllIIlIlIlllllllI.isDone() ? 1 : 0)) {
            lllllllllllllIIlllIIlIlIllllllII.executor().schedule((Runnable)new Runnable() {
                @Override
                public void run() {
                    lllllllllllllIIlllIIlIlIllllllII.close(lllllllllllllIIlllIIlIlIllllllll);
                    "".length();
                }
            }, 10L, TimeUnit.SECONDS);
            "".length();
        }
    }
    
    public JZlibEncoder(final int lllllllllllllIIlllIIlIllIlIllIIl, final byte[] lllllllllllllIIlllIIlIllIlIlIlIl) {
        this(lllllllllllllIIlllIIlIllIlIllIIl, JZlibEncoder.lIIlIIIlIlllIl[1], JZlibEncoder.lIIlIIIlIlllIl[2], lllllllllllllIIlllIIlIllIlIlIlIl);
    }
    
    private static boolean llIIlIllIIlIIll(final int lllllllllllllIIlllIIlIlIIlllllll) {
        return lllllllllllllIIlllIIlIlIIlllllll != 0;
    }
    
    private static boolean llIIlIllIIlIlIl(final int lllllllllllllIIlllIIlIlIIlllllIl) {
        return lllllllllllllIIlllIIlIlIIlllllIl == 0;
    }
    
    @Override
    public boolean isClosed() {
        return this.finished;
    }
    
    public JZlibEncoder(final ZlibWrapper lllllllllllllIIlllIIlIlllIIIIIIl) {
        this(lllllllllllllIIlllIIlIlllIIIIIIl, JZlibEncoder.lIIlIIIlIlllIl[0]);
    }
    
    private static boolean llIIlIllIIlIIII(final int lllllllllllllIIlllIIlIlIlIIlIIII, final int lllllllllllllIIlllIIlIlIlIIIllll) {
        return lllllllllllllIIlllIIlIlIlIIlIIII >= lllllllllllllIIlllIIlIlIlIIIllll;
    }
    
    public JZlibEncoder(final int lllllllllllllIIlllIIlIlllIIIIlIl) {
        this(ZlibWrapper.ZLIB, lllllllllllllIIlllIIlIlllIIIIlIl);
    }
    
    private static String llIIlIllIIIIIII(final String lllllllllllllIIlllIIlIlIlIlllIll, final String lllllllllllllIIlllIIlIlIlIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIlIllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIlIlIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIlIlIlIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIlIlIlIllllll.init(JZlibEncoder.lIIlIIIlIlllIl[6], lllllllllllllIIlllIIlIlIllIIIIII);
            return new String(lllllllllllllIIlllIIlIlIlIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIlIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIlIlIlllllI) {
            lllllllllllllIIlllIIlIlIlIlllllI.printStackTrace();
            return null;
        }
    }
    
    public JZlibEncoder(final byte[] lllllllllllllIIlllIIlIllIllIIIII) {
        this(JZlibEncoder.lIIlIIIlIlllIl[0], lllllllllllllIIlllIIlIllIllIIIII);
    }
    
    private static String llIIlIllIIIIIlI(String lllllllllllllIIlllIIlIlIlIlIlIII, final String lllllllllllllIIlllIIlIlIlIlIIlll) {
        lllllllllllllIIlllIIlIlIlIlIlIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIIlIlIlIlIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIlIlIlIlIlIll = new StringBuilder();
        final char[] lllllllllllllIIlllIIlIlIlIlIlIlI = lllllllllllllIIlllIIlIlIlIlIIlll.toCharArray();
        int lllllllllllllIIlllIIlIlIlIlIlIIl = JZlibEncoder.lIIlIIIlIlllIl[4];
        final boolean lllllllllllllIIlllIIlIlIlIlIIIll = (Object)((String)lllllllllllllIIlllIIlIlIlIlIlIII).toCharArray();
        final boolean lllllllllllllIIlllIIlIlIlIlIIIlI = lllllllllllllIIlllIIlIlIlIlIIIll.length != 0;
        Exception lllllllllllllIIlllIIlIlIlIlIIIIl = (Exception)JZlibEncoder.lIIlIIIlIlllIl[4];
        while (llIIlIllIIlIlll((int)lllllllllllllIIlllIIlIlIlIlIIIIl, lllllllllllllIIlllIIlIlIlIlIIIlI ? 1 : 0)) {
            final char lllllllllllllIIlllIIlIlIlIlIlllI = lllllllllllllIIlllIIlIlIlIlIIIll[lllllllllllllIIlllIIlIlIlIlIIIIl];
            lllllllllllllIIlllIIlIlIlIlIlIll.append((char)(lllllllllllllIIlllIIlIlIlIlIlllI ^ lllllllllllllIIlllIIlIlIlIlIlIlI[lllllllllllllIIlllIIlIlIlIlIlIIl % lllllllllllllIIlllIIlIlIlIlIlIlI.length]));
            "".length();
            ++lllllllllllllIIlllIIlIlIlIlIlIIl;
            ++lllllllllllllIIlllIIlIlIlIlIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIlIlIlIlIlIll);
    }
    
    private static boolean llIIlIllIIlIlII(final int lllllllllllllIIlllIIlIlIIllllIIl) {
        return lllllllllllllIIlllIIlIlIIllllIIl > 0;
    }
    
    private static boolean llIIlIllIIIlllI(final int lllllllllllllIIlllIIlIlIIllllIll) {
        return lllllllllllllIIlllIIlIlIIllllIll >= 0;
    }
    
    private static boolean llIIlIllIIlIIlI(final Object lllllllllllllIIlllIIlIlIlIIIIlII, final Object lllllllllllllIIlllIIlIlIlIIIIIll) {
        return lllllllllllllIIlllIIlIlIlIIIIlII == lllllllllllllIIlllIIlIlIlIIIIIll;
    }
    
    public JZlibEncoder(final ZlibWrapper lllllllllllllIIlllIIlIllIllllIlI, final int lllllllllllllIIlllIIlIllIlllIllI) {
        this(lllllllllllllIIlllIIlIllIllllIlI, lllllllllllllIIlllIIlIllIlllIllI, JZlibEncoder.lIIlIIIlIlllIl[1], JZlibEncoder.lIIlIIIlIlllIl[2]);
    }
    
    private static void llIIlIllIIIlIII() {
        (lIIlIIIlIllIlI = new String[JZlibEncoder.lIIlIIIlIlllIl[24]])[JZlibEncoder.lIIlIIIlIlllIl[4]] = llIIlIllIIIIIII("mXkn9ghpfO78GnjjzhAu86y97s2chabc", "OgwsQ");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[5]] = llIIlIllIIIIIIl("ZdFZ7+xSYm+Y4nlTEn0IdIwdY8zCuRUn", "nRMrp");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[6]] = llIIlIllIIIIIlI("LQoGAgEtIQESHWBD", "Zchfn");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[7]] = llIIlIllIIIIIlI("cEULOgo1DhonHmpNV29LZUQ=", "PmnBz");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[8]] = llIIlIllIIIIIIl("wXGFWGh47fx4ZX1VFp6BWQ==", "xXZun");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[9]] = llIIlIllIIIIIlI("QUEGGjMEChcHJ1tJUk96SA==", "aicbC");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[0]] = llIIlIllIIIIIIl("2RVNS4LIX+E=", "oEDVe");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[10]] = llIIlIllIIIIIII("5z+kynh2UfPM8VUO84XbJA==", "NMxsf");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[2]] = llIIlIllIIIIIIl("noHRk6ReVUc3A/7B06xIuw==", "gmVXx");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[3]] = llIIlIllIIIIIII("fN62ylilewhAZcle1s1Fg4u19IVysjW9qgDFMOddthk=", "wRUnr");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[11]] = llIIlIllIIIIIIl("i4apyDlMcQ82k3v7jefn2AwIlcLVCeYa", "wQgAC");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[12]] = llIIlIllIIIIIII("ijSYXSyxs/bBv4lCGrQoRapa5p0v92zF", "HYVgG");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[13]] = llIIlIllIIIIIII("xT5vP+ZAfSZxMcYubhbekexjrzy5ACg8", "DwCxf");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[14]] = llIIlIllIIIIIlI("Ih8EMAoiNAMgFm9W", "UvjTe");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[15]] = llIIlIllIIIIIII("TSWxM+MoEUz7HkKzBxUxwl7JCFAOWxYH", "xLuMm");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[1]] = llIIlIllIIIIIlI("Hhc4HCsFFzlqbg==", "srUPN");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[16]] = llIIlIllIIIIIIl("9d9QUKt6Mj1ZqGwpwQvt/pQvLEB1CIUD", "BsZEK");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[17]] = llIIlIllIIIIIII("w7fAjTk5qdEo6qxHgWO81Q==", "hGucW");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[18]] = llIIlIllIIIIIlI("PwIbEhg3ABscECIFHQhRMA0bCgQkCQ==", "Vlrfq");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[19]] = llIIlIllIIIIIlI("ETAxGwMTcSwYRgQ0LFcSHzR4Ew8UJTEYCBYjIQ==", "wQXwf");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[20]] = llIIlIllIIIIIIl("5VCuAH7nbLlWseY6e3zUQiNdFXwydYtD", "kQLbu");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[21]] = llIIlIllIIIIIlI("EgorFSoUFjUMNx9FIAQxHRA0AA==", "qeFeX");
        JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[23]] = llIIlIllIIIIIIl("6LjORpqcfgJzfPSdiUCwbGL/E5apn/LL", "mkJmS");
    }
    
    public JZlibEncoder() {
        this(JZlibEncoder.lIIlIIIlIlllIl[0]);
    }
    
    private static void llIIlIllIIIllIl() {
        (lIIlIIIlIlllIl = new int[25])[0] = (0x90 ^ 0x96);
        JZlibEncoder.lIIlIIIlIlllIl[1] = (0xA3 ^ 0xAC);
        JZlibEncoder.lIIlIIIlIlllIl[2] = (0x59 ^ 0x5D ^ (0x8E ^ 0x82));
        JZlibEncoder.lIIlIIIlIlllIl[3] = (0x61 ^ 0x68);
        JZlibEncoder.lIIlIIIlIlllIl[4] = ((0xDF ^ 0x9A ^ "  ".length()) & (0xBF ^ 0x9D ^ (0x38 ^ 0x5D) ^ -" ".length()));
        JZlibEncoder.lIIlIIIlIlllIl[5] = " ".length();
        JZlibEncoder.lIIlIIIlIlllIl[6] = "  ".length();
        JZlibEncoder.lIIlIIIlIlllIl[7] = "   ".length();
        JZlibEncoder.lIIlIIIlIlllIl[8] = (64 + 53 - 7 + 84 ^ 31 + 172 - 187 + 182);
        JZlibEncoder.lIIlIIIlIlllIl[9] = (0xBD ^ 0x80 ^ (0x5A ^ 0x62));
        JZlibEncoder.lIIlIIIlIlllIl[10] = (0x63 ^ 0x64);
        JZlibEncoder.lIIlIIIlIlllIl[11] = (0x70 ^ 0x7A);
        JZlibEncoder.lIIlIIIlIlllIl[12] = (0x6F ^ 0x64);
        JZlibEncoder.lIIlIIIlIlllIl[13] = (71 + 122 - 54 + 46 ^ 117 + 178 - 135 + 21);
        JZlibEncoder.lIIlIIIlIlllIl[14] = (0x1 ^ 0xC);
        JZlibEncoder.lIIlIIIlIlllIl[15] = (0x13 ^ 0x6B ^ (0x2F ^ 0x59));
        JZlibEncoder.lIIlIIIlIlllIl[16] = (27 + 26 + 79 + 4 ^ 150 + 116 - 161 + 47);
        JZlibEncoder.lIIlIIIlIlllIl[17] = (0xB4 ^ 0xA5);
        JZlibEncoder.lIIlIIIlIlllIl[18] = (0x8B ^ 0x99);
        JZlibEncoder.lIIlIIIlIlllIl[19] = (0x5E ^ 0x4D);
        JZlibEncoder.lIIlIIIlIlllIl[20] = (0xB6 ^ 0x97 ^ (0x88 ^ 0xBD));
        JZlibEncoder.lIIlIIIlIlllIl[21] = (0x14 ^ 0x1);
        JZlibEncoder.lIIlIIIlIlllIl[22] = (0x62 ^ 0x42);
        JZlibEncoder.lIIlIIIlIlllIl[23] = (0x16 ^ 0x1A ^ (0x39 ^ 0x23));
        JZlibEncoder.lIIlIIIlIlllIl[24] = (0x9C ^ 0x8C ^ (0x63 ^ 0x64));
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext lllllllllllllIIlllIIlIlIllIlllll) throws Exception {
        this.ctx = lllllllllllllIIlllIIlIlIllIlllll;
    }
    
    private static boolean llIIlIllIIlIlll(final int lllllllllllllIIlllIIlIlIlIIIllII, final int lllllllllllllIIlllIIlIlIlIIIlIll) {
        return lllllllllllllIIlllIIlIlIlIIIllII < lllllllllllllIIlllIIlIlIlIIIlIll;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIlllIIlIllIIIlIIll, final ByteBuf lllllllllllllIIlllIIlIllIIIIllll, final ByteBuf lllllllllllllIIlllIIlIllIIIlIIIl) throws Exception {
        if (llIIlIllIIlIIll(this.finished ? 1 : 0)) {
            return;
        }
        try {
            final int lllllllllllllIIlllIIlIllIIIllIll = lllllllllllllIIlllIIlIllIIIIllll.readableBytes();
            final boolean lllllllllllllIIlllIIlIllIIIllIlI = lllllllllllllIIlllIIlIllIIIIllll.hasArray();
            this.z.avail_in = lllllllllllllIIlllIIlIllIIIllIll;
            if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIIIllIlI ? 1 : 0)) {
                this.z.next_in = lllllllllllllIIlllIIlIllIIIIllll.array();
                this.z.next_in_index = lllllllllllllIIlllIIlIllIIIIllll.arrayOffset() + lllllllllllllIIlllIIlIllIIIIllll.readerIndex();
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                final byte[] lllllllllllllIIlllIIlIllIIIlllII = new byte[lllllllllllllIIlllIIlIllIIIllIll];
                lllllllllllllIIlllIIlIllIIIIllll.getBytes(lllllllllllllIIlllIIlIllIIIIllll.readerIndex(), lllllllllllllIIlllIIlIllIIIlllII);
                "".length();
                this.z.next_in = lllllllllllllIIlllIIlIllIIIlllII;
                this.z.next_in_index = JZlibEncoder.lIIlIIIlIlllIl[4];
            }
            final int lllllllllllllIIlllIIlIllIIIllIIl = this.z.next_in_index;
            final int lllllllllllllIIlllIIlIllIIIllIII = (int)Math.ceil(lllllllllllllIIlllIIlIllIIIllIll * 1.001) + JZlibEncoder.lIIlIIIlIlllIl[13] + this.wrapperOverhead;
            lllllllllllllIIlllIIlIllIIIlIIIl.ensureWritable(lllllllllllllIIlllIIlIllIIIllIII);
            "".length();
            this.z.avail_out = lllllllllllllIIlllIIlIllIIIllIII;
            this.z.next_out = lllllllllllllIIlllIIlIllIIIlIIIl.array();
            this.z.next_out_index = lllllllllllllIIlllIIlIllIIIlIIIl.arrayOffset() + lllllllllllllIIlllIIlIllIIIlIIIl.writerIndex();
            final int lllllllllllllIIlllIIlIllIIIlIlll = this.z.next_out_index;
            int lllllllllllllIIlllIIlIllIIIlIllI;
            try {
                lllllllllllllIIlllIIlIllIIIlIllI = this.z.deflate(JZlibEncoder.lIIlIIIlIlllIl[6]);
                lllllllllllllIIlllIIlIllIIIIllll.skipBytes(this.z.next_in_index - lllllllllllllIIlllIIlIllIIIllIIl);
                "".length();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            finally {
                lllllllllllllIIlllIIlIllIIIIllll.skipBytes(this.z.next_in_index - lllllllllllllIIlllIIlIllIIIllIIl);
                "".length();
            }
            if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIIIlIllI)) {
                ZlibUtil.fail(this.z, JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[21]], lllllllllllllIIlllIIlIllIIIlIllI);
            }
            final int lllllllllllllIIlllIIlIllIIIlIlIl = this.z.next_out_index - lllllllllllllIIlllIIlIllIIIlIlll;
            if (llIIlIllIIlIlII(lllllllllllllIIlllIIlIllIIIlIlIl)) {
                lllllllllllllIIlllIIlIllIIIlIIIl.writerIndex(lllllllllllllIIlllIIlIllIIIlIIIl.writerIndex() + lllllllllllllIIlllIIlIllIIIlIlIl);
                "".length();
            }
            this.z.next_in = null;
            this.z.next_out = null;
            "".length();
            if ((94 + 41 - 38 + 89 ^ 160 + 120 - 205 + 116) <= 0) {
                return;
            }
        }
        finally {
            this.z.next_in = null;
            this.z.next_out = null;
        }
    }
    
    private ChannelHandlerContext ctx() {
        final ChannelHandlerContext lllllllllllllIIlllIIlIllIIlIllIl = this.ctx;
        if (llIIlIllIIlIIIl(lllllllllllllIIlllIIlIllIIlIllIl)) {
            throw new IllegalStateException(JZlibEncoder.lIIlIIIlIllIlI[JZlibEncoder.lIIlIIIlIlllIl[20]]);
        }
        return lllllllllllllIIlllIIlIllIIlIllIl;
    }
    
    @Override
    public ChannelFuture close(final ChannelPromise lllllllllllllIIlllIIlIllIIlllIII) {
        final ChannelHandlerContext lllllllllllllIIlllIIlIllIIllIlll = this.ctx();
        final EventExecutor lllllllllllllIIlllIIlIllIIllIllI = lllllllllllllIIlllIIlIllIIllIlll.executor();
        if (llIIlIllIIlIIll(lllllllllllllIIlllIIlIllIIllIllI.inEventLoop() ? 1 : 0)) {
            return this.finishEncode(lllllllllllllIIlllIIlIllIIllIlll, lllllllllllllIIlllIIlIllIIlllIII);
        }
        final ChannelPromise lllllllllllllIIlllIIlIllIIlllIlI = lllllllllllllIIlllIIlIllIIllIlll.newPromise();
        lllllllllllllIIlllIIlIllIIllIllI.execute(new Runnable() {
            private static final /* synthetic */ int[] lIIllIIlIlIlIl;
            
            static {
                llIlIlllIlIIIlI();
            }
            
            @Override
            public void run() {
                final ChannelFuture access$100;
                final ChannelFuture lllllllllllllIIlIllIIIIlIllIIIII = access$100 = JZlibEncoder.this.finishEncode(JZlibEncoder.this.ctx(), lllllllllllllIIlllIIlIllIIlllIlI);
                final ChannelPromise[] llllllllllllIlllIllIlIIIIIlIIIlI = new ChannelPromise[JZlibEncoder$1.lIIllIIlIlIlIl[0]];
                llllllllllllIlllIllIlIIIIIlIIIlI[JZlibEncoder$1.lIIllIIlIlIlIl[1]] = lllllllllllllIIlllIIlIllIIlllIII;
                access$100.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelPromiseNotifier(llllllllllllIlllIllIlIIIIIlIIIlI));
                "".length();
            }
            
            private static void llIlIlllIlIIIlI() {
                (lIIllIIlIlIlIl = new int[2])[0] = " ".length();
                JZlibEncoder$1.lIIllIIlIlIlIl[1] = ((0x8C ^ 0x98) & ~(0x7F ^ 0x6B));
            }
        });
        return lllllllllllllIIlllIIlIllIIlllIlI;
    }
    
    private static boolean llIIlIllIIlIIIl(final Object lllllllllllllIIlllIIlIlIlIIIIIIl) {
        return lllllllllllllIIlllIIlIlIlIIIIIIl == null;
    }
}
