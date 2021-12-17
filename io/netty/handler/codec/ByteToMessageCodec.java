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
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.channel.ChannelDuplexHandler;

public abstract class ByteToMessageCodec<I> extends ChannelDuplexHandler
{
    private static final /* synthetic */ int[] lIIllIlIllIlll;
    private final /* synthetic */ ByteToMessageDecoder decoder;
    private final /* synthetic */ TypeParameterMatcher outboundMsgMatcher;
    private final /* synthetic */ MessageToByteEncoder<I> encoder;
    private static final /* synthetic */ String[] lIIllIlIIlllll;
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIlIlIlIIIllIIlIlII, final Object lllllllllllllIIlIlIlIIIllIIlIlll, final ChannelPromise lllllllllllllIIlIlIlIIIllIIlIIlI) throws Exception {
        this.encoder.write(lllllllllllllIIlIlIlIIIllIIlIlII, lllllllllllllIIlIlIlIIIllIIlIlll, lllllllllllllIIlIlIlIIIllIIlIIlI);
    }
    
    protected void decodeLast(final ChannelHandlerContext lllllllllllllIIlIlIlIIIllIIIllII, final ByteBuf lllllllllllllIIlIlIlIIIllIIIIlll, final List<Object> lllllllllllllIIlIlIlIIIllIIIlIlI) throws Exception {
        this.decode(lllllllllllllIIlIlIlIIIllIIIllII, lllllllllllllIIlIlIlIIIllIIIIlll, lllllllllllllIIlIlIlIIIllIIIlIlI);
    }
    
    protected abstract void decode(final ChannelHandlerContext p0, final ByteBuf p1, final List<Object> p2) throws Exception;
    
    public boolean acceptOutboundMessage(final Object lllllllllllllIIlIlIlIIIllIlIlIIl) throws Exception {
        return this.outboundMsgMatcher.match(lllllllllllllIIlIlIlIIIllIlIlIIl);
    }
    
    protected ByteToMessageCodec(final Class<? extends I> lllllllllllllIIlIlIlIIIlllIIllII) {
        this(lllllllllllllIIlIlIlIIIlllIIllII, (boolean)(ByteToMessageCodec.lIIllIlIllIlll[0] != 0));
    }
    
    private static void llIllIIlIlIIIIl() {
        (lIIllIlIllIlll = new int[4])[0] = " ".length();
        ByteToMessageCodec.lIIllIlIllIlll[1] = ((115 + 151 - 250 + 149 ^ 28 + 179 - 79 + 63) & (0x3E ^ 0x11 ^ (0xF6 ^ 0xC3) ^ -" ".length()));
        ByteToMessageCodec.lIIllIlIllIlll[2] = "  ".length();
        ByteToMessageCodec.lIIllIlIllIlll[3] = (0x6A ^ 0x25 ^ (0xE5 ^ 0xA2));
    }
    
    private static boolean llIllIIlIlIIIll(final int lllllllllllllIIlIlIlIIIlIlIllllI, final int lllllllllllllIIlIlIlIIIlIlIlllIl) {
        return lllllllllllllIIlIlIlIIIlIlIllllI < lllllllllllllIIlIlIlIIIlIlIlllIl;
    }
    
    private static boolean llIllIIlIlIIIlI(final int lllllllllllllIIlIlIlIIIlIlIllIll) {
        return lllllllllllllIIlIlIlIIIlIlIllIll != 0;
    }
    
    static {
        llIllIIlIlIIIIl();
        llIllIIIlIlllII();
    }
    
    private void checkForSharableAnnotation() {
        if (llIllIIlIlIIIlI(this.isSharable() ? 1 : 0)) {
            throw new IllegalStateException(ByteToMessageCodec.lIIllIlIIlllll[ByteToMessageCodec.lIIllIlIllIlll[0]]);
        }
    }
    
    protected ByteToMessageCodec(final Class<? extends I> lllllllllllllIIlIlIlIIIllIllIlII, final boolean lllllllllllllIIlIlIlIIIllIllIIll) {
        this.decoder = new ByteToMessageDecoder() {
            public void decode(final ChannelHandlerContext llllllllllllIllIIIIllIIllllIIlll, final ByteBuf llllllllllllIllIIIIllIIllllIIllI, final List<Object> llllllllllllIllIIIIllIIllllIlIIl) throws Exception {
                ByteToMessageCodec.this.decode(llllllllllllIllIIIIllIIllllIIlll, llllllllllllIllIIIIllIIllllIIllI, llllllllllllIllIIIIllIIllllIlIIl);
            }
            
            @Override
            protected void decodeLast(final ChannelHandlerContext llllllllllllIllIIIIllIIlllIllIll, final ByteBuf llllllllllllIllIIIIllIIlllIllllI, final List<Object> llllllllllllIllIIIIllIIlllIlllIl) throws Exception {
                ByteToMessageCodec.this.decodeLast(llllllllllllIllIIIIllIIlllIllIll, llllllllllllIllIIIIllIIlllIllllI, llllllllllllIllIIIIllIIlllIlllIl);
            }
        };
        this.checkForSharableAnnotation();
        this.outboundMsgMatcher = TypeParameterMatcher.get(lllllllllllllIIlIlIlIIIllIllIlII);
        this.encoder = new Encoder(lllllllllllllIIlIlIlIIIllIllIIll);
    }
    
    protected ByteToMessageCodec() {
        this((boolean)(ByteToMessageCodec.lIIllIlIllIlll[0] != 0));
    }
    
    protected ByteToMessageCodec(final boolean lllllllllllllIIlIlIlIIIllIlllIIl) {
        this.decoder = new ByteToMessageDecoder() {
            public void decode(final ChannelHandlerContext llllllllllllIllIIIIllIIllllIIlll, final ByteBuf llllllllllllIllIIIIllIIllllIIllI, final List<Object> llllllllllllIllIIIIllIIllllIlIIl) throws Exception {
                ByteToMessageCodec.this.decode(llllllllllllIllIIIIllIIllllIIlll, llllllllllllIllIIIIllIIllllIIllI, llllllllllllIllIIIIllIIllllIlIIl);
            }
            
            @Override
            protected void decodeLast(final ChannelHandlerContext llllllllllllIllIIIIllIIlllIllIll, final ByteBuf llllllllllllIllIIIIllIIlllIllllI, final List<Object> llllllllllllIllIIIIllIIlllIlllIl) throws Exception {
                ByteToMessageCodec.this.decodeLast(llllllllllllIllIIIIllIIlllIllIll, llllllllllllIllIIIIllIIlllIllllI, llllllllllllIllIIIIllIIlllIlllIl);
            }
        };
        this.outboundMsgMatcher = TypeParameterMatcher.find(this, ByteToMessageCodec.class, ByteToMessageCodec.lIIllIlIIlllll[ByteToMessageCodec.lIIllIlIllIlll[1]]);
        this.encoder = new Encoder(lllllllllllllIIlIlIlIIIllIlllIIl);
    }
    
    private static String llIllIIIlIllIlI(final String lllllllllllllIIlIlIlIIIlIlllllII, final String lllllllllllllIIlIlIlIIIlIllllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIIllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIIlIllllIll.getBytes(StandardCharsets.UTF_8)), ByteToMessageCodec.lIIllIlIllIlll[3]), "DES");
            final Cipher lllllllllllllIIlIlIlIIIllIIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlIIIllIIIIIII.init(ByteToMessageCodec.lIIllIlIllIlll[2], lllllllllllllIIlIlIlIIIllIIIIIIl);
            return new String(lllllllllllllIIlIlIlIIIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIIlIlllllll) {
            lllllllllllllIIlIlIlIIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIIlIlIlIIIllIIlllll, final Object lllllllllllllIIlIlIlIIIllIIllllI) throws Exception {
        this.decoder.channelRead(lllllllllllllIIlIlIlIIIllIIlllll, lllllllllllllIIlIlIlIIIllIIllllI);
    }
    
    protected abstract void encode(final ChannelHandlerContext p0, final I p1, final ByteBuf p2) throws Exception;
    
    private static String llIllIIIlIllIll(String lllllllllllllIIlIlIlIIIlIllIlIIl, final String lllllllllllllIIlIlIlIIIlIllIlIII) {
        lllllllllllllIIlIlIlIIIlIllIlIIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlIIIlIllIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIIIlIllIllII = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIIIlIllIlIll = lllllllllllllIIlIlIlIIIlIllIlIII.toCharArray();
        int lllllllllllllIIlIlIlIIIlIllIlIlI = ByteToMessageCodec.lIIllIlIllIlll[1];
        final byte lllllllllllllIIlIlIlIIIlIllIIlII = (Object)((String)lllllllllllllIIlIlIlIIIlIllIlIIl).toCharArray();
        final double lllllllllllllIIlIlIlIIIlIllIIIll = lllllllllllllIIlIlIlIIIlIllIIlII.length;
        long lllllllllllllIIlIlIlIIIlIllIIIlI = ByteToMessageCodec.lIIllIlIllIlll[1];
        while (llIllIIlIlIIIll((int)lllllllllllllIIlIlIlIIIlIllIIIlI, (int)lllllllllllllIIlIlIlIIIlIllIIIll)) {
            final char lllllllllllllIIlIlIlIIIlIllIllll = lllllllllllllIIlIlIlIIIlIllIIlII[lllllllllllllIIlIlIlIIIlIllIIIlI];
            lllllllllllllIIlIlIlIIIlIllIllII.append((char)(lllllllllllllIIlIlIlIIIlIllIllll ^ lllllllllllllIIlIlIlIIIlIllIlIll[lllllllllllllIIlIlIlIIIlIllIlIlI % lllllllllllllIIlIlIlIIIlIllIlIll.length]));
            "".length();
            ++lllllllllllllIIlIlIlIIIlIllIlIlI;
            ++lllllllllllllIIlIlIlIIIlIllIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIIIlIllIllII);
    }
    
    private static void llIllIIIlIlllII() {
        (lIIllIlIIlllll = new String[ByteToMessageCodec.lIIllIlIllIlll[2]])[ByteToMessageCodec.lIIllIlIllIlll[1]] = llIllIIIlIllIlI("lAL5MpSroyg=", "msGcr");
        ByteToMessageCodec.lIIllIlIIlllll[ByteToMessageCodec.lIIllIlIllIlll[0]] = llIllIIIlIllIll("CiYvOAIrFys8UCsbKTYEKwEuNh5qHDR5HiUBZzgcJhowPBQ=", "JuGYp");
    }
    
    private final class Encoder extends MessageToByteEncoder<I>
    {
        @Override
        protected void encode(final ChannelHandlerContext llllllllllllIllIIlIIIIIlIIIIllII, final I llllllllllllIllIIlIIIIIlIIIIllll, final ByteBuf llllllllllllIllIIlIIIIIlIIIIlllI) throws Exception {
            ByteToMessageCodec.this.encode(llllllllllllIllIIlIIIIIlIIIIllII, llllllllllllIllIIlIIIIIlIIIIllll, llllllllllllIllIIlIIIIIlIIIIlllI);
        }
        
        Encoder(final boolean llllllllllllIllIIlIIIIIlIIIlllll) {
            super(llllllllllllIllIIlIIIIIlIIIlllll);
        }
        
        @Override
        public boolean acceptOutboundMessage(final Object llllllllllllIllIIlIIIIIlIIIllIII) throws Exception {
            return ByteToMessageCodec.this.acceptOutboundMessage(llllllllllllIllIIlIIIIIlIIIllIII);
        }
    }
}
