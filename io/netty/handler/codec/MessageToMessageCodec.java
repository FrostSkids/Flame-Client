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
import io.netty.channel.ChannelPromise;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.channel.ChannelDuplexHandler;

public abstract class MessageToMessageCodec<INBOUND_IN, OUTBOUND_IN> extends ChannelDuplexHandler
{
    private final /* synthetic */ MessageToMessageEncoder<Object> encoder;
    private static final /* synthetic */ int[] lIlIlIllIIlIll;
    private static final /* synthetic */ String[] lIlIlIllIIlIlI;
    private final /* synthetic */ TypeParameterMatcher outboundMsgMatcher;
    private final /* synthetic */ MessageToMessageDecoder<Object> decoder;
    private final /* synthetic */ TypeParameterMatcher inboundMsgMatcher;
    
    private static void lllIllllIIIIIIl() {
        (lIlIlIllIIlIlI = new String[MessageToMessageCodec.lIlIlIllIIlIll[2]])[MessageToMessageCodec.lIlIlIllIIlIll[0]] = lllIllllIIIIIII("7jXpJlbflnt7l2kgQUWCEg==", "bqrOU");
        MessageToMessageCodec.lIlIlIllIIlIlI[MessageToMessageCodec.lIlIlIllIIlIll[1]] = lllIllllIIIIIII("CYL9N2AwinlmNByZkTtAMg==", "UkGOm");
    }
    
    protected MessageToMessageCodec(final Class<? extends INBOUND_IN> lllllllllllllIIIlIIIIIIIlIlIlIII, final Class<? extends OUTBOUND_IN> lllllllllllllIIIlIIIIIIIlIlIIlII) {
        this.encoder = new MessageToMessageEncoder<Object>() {
            @Override
            public boolean acceptOutboundMessage(final Object llllllllllllIllIIlIlllIlIIlIlIII) throws Exception {
                return MessageToMessageCodec.this.acceptOutboundMessage(llllllllllllIllIIlIlllIlIIlIlIII);
            }
            
            @Override
            protected void encode(final ChannelHandlerContext llllllllllllIllIIlIlllIlIIIllllI, final Object llllllllllllIllIIlIlllIlIIIlllIl, final List<Object> llllllllllllIllIIlIlllIlIIIlllII) throws Exception {
                MessageToMessageCodec.this.encode(llllllllllllIllIIlIlllIlIIIllllI, llllllllllllIllIIlIlllIlIIIlllIl, llllllllllllIllIIlIlllIlIIIlllII);
            }
        };
        this.decoder = new MessageToMessageDecoder<Object>() {
            @Override
            protected void decode(final ChannelHandlerContext llllllllllllIllllllIIlIllIIlIIlI, final Object llllllllllllIllllllIIlIllIIlIlIl, final List<Object> llllllllllllIllllllIIlIllIIlIIII) throws Exception {
                MessageToMessageCodec.this.decode(llllllllllllIllllllIIlIllIIlIIlI, llllllllllllIllllllIIlIllIIlIlIl, llllllllllllIllllllIIlIllIIlIIII);
            }
            
            @Override
            public boolean acceptInboundMessage(final Object llllllllllllIllllllIIlIllIIllllI) throws Exception {
                return MessageToMessageCodec.this.acceptInboundMessage(llllllllllllIllllllIIlIllIIllllI);
            }
        };
        this.inboundMsgMatcher = TypeParameterMatcher.get(lllllllllllllIIIlIIIIIIIlIlIlIII);
        this.outboundMsgMatcher = TypeParameterMatcher.get(lllllllllllllIIIlIIIIIIIlIlIIlII);
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIIlIIIIIIIlIIlIIIl, final Object lllllllllllllIIIlIIIIIIIlIIlIlII, final ChannelPromise lllllllllllllIIIlIIIIIIIlIIlIIll) throws Exception {
        this.encoder.write(lllllllllllllIIIlIIIIIIIlIIlIIIl, lllllllllllllIIIlIIIIIIIlIIlIlII, lllllllllllllIIIlIIIIIIIlIIlIIll);
    }
    
    protected abstract void decode(final ChannelHandlerContext p0, final INBOUND_IN p1, final List<Object> p2) throws Exception;
    
    private static String lllIllllIIIIIII(final String lllllllllllllIIIlIIIIIIIIllllIIl, final String lllllllllllllIIIlIIIIIIIIllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIIIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), MessageToMessageCodec.lIlIlIllIIlIll[3]), "DES");
            final Cipher lllllllllllllIIIlIIIIIIIIlllllIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIIIIlllllIl.init(MessageToMessageCodec.lIlIlIllIIlIll[2], lllllllllllllIIIlIIIIIIIIllllllI);
            return new String(lllllllllllllIIIlIIIIIIIIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIIIlllllII) {
            lllllllllllllIIIlIIIIIIIIlllllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllllIIIIIlI() {
        (lIlIlIllIIlIll = new int[4])[0] = ((0xFF ^ 0xC5 ^ ((0x46 ^ 0x26) & ~(0x3 ^ 0x63))) & (0xCD ^ 0xB8 ^ (0xE8 ^ 0xA7) ^ -" ".length()));
        MessageToMessageCodec.lIlIlIllIIlIll[1] = " ".length();
        MessageToMessageCodec.lIlIlIllIIlIll[2] = "  ".length();
        MessageToMessageCodec.lIlIlIllIIlIll[3] = (67 + 86 - 127 + 177 ^ 167 + 170 - 219 + 77);
    }
    
    protected MessageToMessageCodec() {
        this.encoder = new MessageToMessageEncoder<Object>() {
            @Override
            public boolean acceptOutboundMessage(final Object llllllllllllIllIIlIlllIlIIlIlIII) throws Exception {
                return MessageToMessageCodec.this.acceptOutboundMessage(llllllllllllIllIIlIlllIlIIlIlIII);
            }
            
            @Override
            protected void encode(final ChannelHandlerContext llllllllllllIllIIlIlllIlIIIllllI, final Object llllllllllllIllIIlIlllIlIIIlllIl, final List<Object> llllllllllllIllIIlIlllIlIIIlllII) throws Exception {
                MessageToMessageCodec.this.encode(llllllllllllIllIIlIlllIlIIIllllI, llllllllllllIllIIlIlllIlIIIlllIl, llllllllllllIllIIlIlllIlIIIlllII);
            }
        };
        this.decoder = new MessageToMessageDecoder<Object>() {
            @Override
            protected void decode(final ChannelHandlerContext llllllllllllIllllllIIlIllIIlIIlI, final Object llllllllllllIllllllIIlIllIIlIlIl, final List<Object> llllllllllllIllllllIIlIllIIlIIII) throws Exception {
                MessageToMessageCodec.this.decode(llllllllllllIllllllIIlIllIIlIIlI, llllllllllllIllllllIIlIllIIlIlIl, llllllllllllIllllllIIlIllIIlIIII);
            }
            
            @Override
            public boolean acceptInboundMessage(final Object llllllllllllIllllllIIlIllIIllllI) throws Exception {
                return MessageToMessageCodec.this.acceptInboundMessage(llllllllllllIllllllIIlIllIIllllI);
            }
        };
        this.inboundMsgMatcher = TypeParameterMatcher.find(this, MessageToMessageCodec.class, MessageToMessageCodec.lIlIlIllIIlIlI[MessageToMessageCodec.lIlIlIllIIlIll[0]]);
        this.outboundMsgMatcher = TypeParameterMatcher.find(this, MessageToMessageCodec.class, MessageToMessageCodec.lIlIlIllIIlIlI[MessageToMessageCodec.lIlIlIllIIlIll[1]]);
    }
    
    public boolean acceptInboundMessage(final Object lllllllllllllIIIlIIIIIIIlIIIlIIl) throws Exception {
        return this.inboundMsgMatcher.match(lllllllllllllIIIlIIIIIIIlIIIlIIl);
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIIIlIIIIIIIlIIlllll, final Object lllllllllllllIIIlIIIIIIIlIIllIll) throws Exception {
        this.decoder.channelRead(lllllllllllllIIIlIIIIIIIlIIlllll, lllllllllllllIIIlIIIIIIIlIIllIll);
    }
    
    public boolean acceptOutboundMessage(final Object lllllllllllllIIIlIIIIIIIlIIIIIll) throws Exception {
        return this.outboundMsgMatcher.match(lllllllllllllIIIlIIIIIIIlIIIIIll);
    }
    
    protected abstract void encode(final ChannelHandlerContext p0, final OUTBOUND_IN p1, final List<Object> p2) throws Exception;
    
    static {
        lllIllllIIIIIlI();
        lllIllllIIIIIIl();
    }
}
