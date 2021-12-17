// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import io.netty.channel.ChannelPromise;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public abstract class MessageToByteEncoder<I> extends ChannelOutboundHandlerAdapter
{
    private static final /* synthetic */ int[] lIlIIIllllllII;
    private final /* synthetic */ TypeParameterMatcher matcher;
    private static final /* synthetic */ String[] lIlIIIlllllIll;
    private final /* synthetic */ boolean preferDirect;
    
    private static void lllIIlIIIllIIII() {
        (lIlIIIlllllIll = new String[MessageToByteEncoder.lIlIIIllllllII[0]])[MessageToByteEncoder.lIlIIIllllllII[1]] = lllIIlIIIlIllll("cw+zdgQwwlI=", "PNZPQ");
    }
    
    public boolean acceptOutboundMessage(final Object lllllllllllllIIIlllIllIIlllIIlII) throws Exception {
        return this.matcher.match(lllllllllllllIIIlllIllIIlllIIlII);
    }
    
    private static boolean lllIIlIIIllIlII(final Object lllllllllllllIIIlllIllIIlIllIlIl) {
        return lllllllllllllIIIlllIllIIlIllIlIl != null;
    }
    
    protected ByteBuf allocateBuffer(final ChannelHandlerContext lllllllllllllIIIlllIllIIllIIlIII, final I lllllllllllllIIIlllIllIIllIIIlll, final boolean lllllllllllllIIIlllIllIIllIIIllI) throws Exception {
        if (lllIIlIIIllIIll(lllllllllllllIIIlllIllIIllIIIllI ? 1 : 0)) {
            return lllllllllllllIIIlllIllIIllIIlIII.alloc().ioBuffer();
        }
        return lllllllllllllIIIlllIllIIllIIlIII.alloc().heapBuffer();
    }
    
    protected MessageToByteEncoder(final boolean lllllllllllllIIIlllIllIIllllIIll) {
        this.matcher = TypeParameterMatcher.find(this, MessageToByteEncoder.class, MessageToByteEncoder.lIlIIIlllllIll[MessageToByteEncoder.lIlIIIllllllII[1]]);
        this.preferDirect = lllllllllllllIIIlllIllIIllllIIll;
    }
    
    protected MessageToByteEncoder(final Class<? extends I> lllllllllllllIIIlllIllIIlllllIll) {
        this(lllllllllllllIIIlllIllIIlllllIll, (boolean)(MessageToByteEncoder.lIlIIIllllllII[0] != 0));
    }
    
    static {
        lllIIlIIIllIIlI();
        lllIIlIIIllIIII();
    }
    
    protected MessageToByteEncoder() {
        this((boolean)(MessageToByteEncoder.lIlIIIllllllII[0] != 0));
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIIlllIllIIllIlIlll, final Object lllllllllllllIIIlllIllIIllIlIIIl, final ChannelPromise lllllllllllllIIIlllIllIIllIlIlIl) throws Exception {
        ByteBuf lllllllllllllIIIlllIllIIllIlIlII = null;
        try {
            if (lllIIlIIIllIIll(this.acceptOutboundMessage(lllllllllllllIIIlllIllIIllIlIIIl) ? 1 : 0)) {
                final I lllllllllllllIIIlllIllIIllIllIll = (I)lllllllllllllIIIlllIllIIllIlIIIl;
                lllllllllllllIIIlllIllIIllIlIlII = this.allocateBuffer(lllllllllllllIIIlllIllIIllIlIlll, lllllllllllllIIIlllIllIIllIllIll, this.preferDirect);
                try {
                    this.encode(lllllllllllllIIIlllIllIIllIlIlll, lllllllllllllIIIlllIllIIllIllIll, lllllllllllllIIIlllIllIIllIlIlII);
                    ReferenceCountUtil.release(lllllllllllllIIIlllIllIIllIllIll);
                    "".length();
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
                finally {
                    ReferenceCountUtil.release(lllllllllllllIIIlllIllIIllIllIll);
                    "".length();
                }
                if (lllIIlIIIllIIll(lllllllllllllIIIlllIllIIllIlIlII.isReadable() ? 1 : 0)) {
                    lllllllllllllIIIlllIllIIllIlIlll.write(lllllllllllllIIIlllIllIIllIlIlII, lllllllllllllIIIlllIllIIllIlIlIl);
                    "".length();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlllIllIIllIlIlII.release();
                    "".length();
                    lllllllllllllIIIlllIllIIllIlIlll.write(Unpooled.EMPTY_BUFFER, lllllllllllllIIIlllIllIIllIlIlIl);
                    "".length();
                }
                lllllllllllllIIIlllIllIIllIlIlII = null;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIllIIllIlIlll.write(lllllllllllllIIIlllIllIIllIlIIIl, lllllllllllllIIIlllIllIIllIlIlIl);
                "".length();
            }
            if (!lllIIlIIIllIlII(lllllllllllllIIIlllIllIIllIlIlII)) {
                return;
            }
            lllllllllllllIIIlllIllIIllIlIlII.release();
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (EncoderException lllllllllllllIIIlllIllIIllIllIlI) {
            throw lllllllllllllIIIlllIllIIllIllIlI;
        }
        catch (Throwable lllllllllllllIIIlllIllIIllIllIIl) {
            throw new EncoderException(lllllllllllllIIIlllIllIIllIllIIl);
        }
        finally {
            if (lllIIlIIIllIlII(lllllllllllllIIIlllIllIIllIlIlII)) {
                lllllllllllllIIIlllIllIIllIlIlII.release();
                "".length();
            }
        }
    }
    
    private static boolean lllIIlIIIllIIll(final int lllllllllllllIIIlllIllIIlIllIIll) {
        return lllllllllllllIIIlllIllIIlIllIIll != 0;
    }
    
    private static void lllIIlIIIllIIlI() {
        (lIlIIIllllllII = new int[4])[0] = " ".length();
        MessageToByteEncoder.lIlIIIllllllII[1] = ((0x6A ^ 0x42 ^ (0xEA ^ 0x9F)) & (0x3C ^ 0x64 ^ (0xAA ^ 0xAF) ^ -" ".length()));
        MessageToByteEncoder.lIlIIIllllllII[2] = (0xF ^ 0x7);
        MessageToByteEncoder.lIlIIIllllllII[3] = "  ".length();
    }
    
    private static String lllIIlIIIlIllll(final String lllllllllllllIIIlllIllIIlIllllII, final String lllllllllllllIIIlllIllIIlIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllIIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllIIlIlllIll.getBytes(StandardCharsets.UTF_8)), MessageToByteEncoder.lIlIIIllllllII[2]), "DES");
            final Cipher lllllllllllllIIIlllIllIIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllIIlIlllllI.init(MessageToByteEncoder.lIlIIIllllllII[3], lllllllllllllIIIlllIllIIlIllllll);
            return new String(lllllllllllllIIIlllIllIIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllIIlIllllIl) {
            lllllllllllllIIIlllIllIIlIllllIl.printStackTrace();
            return null;
        }
    }
    
    protected abstract void encode(final ChannelHandlerContext p0, final I p1, final ByteBuf p2) throws Exception;
    
    protected MessageToByteEncoder(final Class<? extends I> lllllllllllllIIIlllIllIIlllIlIll, final boolean lllllllllllllIIIlllIllIIlllIlIlI) {
        this.matcher = TypeParameterMatcher.get(lllllllllllllIIIlllIllIIlllIlIll);
        this.preferDirect = lllllllllllllIIIlllIllIIlllIlIlI;
    }
}
