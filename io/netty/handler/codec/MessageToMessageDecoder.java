// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import io.netty.util.ReferenceCountUtil;
import java.util.List;
import io.netty.util.internal.RecyclableArrayList;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.channel.ChannelInboundHandlerAdapter;

public abstract class MessageToMessageDecoder<I> extends ChannelInboundHandlerAdapter
{
    private final /* synthetic */ TypeParameterMatcher matcher;
    private static final /* synthetic */ int[] lllIllllIIllll;
    private static final /* synthetic */ String[] lllIllllIIlIIl;
    
    protected MessageToMessageDecoder() {
        this.matcher = TypeParameterMatcher.find(this, MessageToMessageDecoder.class, MessageToMessageDecoder.lllIllllIIlIIl[MessageToMessageDecoder.lllIllllIIllll[0]]);
    }
    
    protected MessageToMessageDecoder(final Class<? extends I> llllllllllllIlIlIllllllllllllIII) {
        this.matcher = TypeParameterMatcher.get(llllllllllllIlIlIllllllllllllIII);
    }
    
    static {
        lIlIIlIlllllllIl();
        lIlIIlIllllllIIl();
    }
    
    private static String lIlIIlIlllllIIll(final String llllllllllllIlIlIlllllllllIIlIll, final String llllllllllllIlIlIlllllllllIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlIlllllllllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIlllllllllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIlllllllllIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIlllllllllIIllIl.init(MessageToMessageDecoder.lllIllllIIllll[2], llllllllllllIlIlIlllllllllIIlllI);
            return new String(llllllllllllIlIlIlllllllllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIlllllllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIlllllllllIIllII) {
            llllllllllllIlIlIlllllllllIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIlllllllll(final int llllllllllllIlIlIlllllllllIIIIll, final int llllllllllllIlIlIlllllllllIIIIlI) {
        return llllllllllllIlIlIlllllllllIIIIll < llllllllllllIlIlIlllllllllIIIIlI;
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIlIlIlllllllllIllllI, final Object llllllllllllIlIlIlllllllllIllIIl) throws Exception {
        final RecyclableArrayList llllllllllllIlIlIlllllllllIlllII = RecyclableArrayList.newInstance();
        try {
            if (lIlIIlIllllllllI(this.acceptInboundMessage(llllllllllllIlIlIlllllllllIllIIl) ? 1 : 0)) {
                final I llllllllllllIlIlIllllllllllIIllI = (I)llllllllllllIlIlIlllllllllIllIIl;
                try {
                    this.decode(llllllllllllIlIlIlllllllllIllllI, llllllllllllIlIlIllllllllllIIllI, llllllllllllIlIlIlllllllllIlllII);
                    ReferenceCountUtil.release(llllllllllllIlIlIllllllllllIIllI);
                    "".length();
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
                finally {
                    ReferenceCountUtil.release(llllllllllllIlIlIllllllllllIIllI);
                    "".length();
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlIlIlllllllllIlllII.add(llllllllllllIlIlIlllllllllIllIIl);
                "".length();
            }
            final int llllllllllllIlIlIllllllllllIIlII = llllllllllllIlIlIlllllllllIlllII.size();
            int llllllllllllIlIlIllllllllllIIlIl = MessageToMessageDecoder.lllIllllIIllll[0];
            while (lIlIIlIlllllllll(llllllllllllIlIlIllllllllllIIlIl, llllllllllllIlIlIllllllllllIIlII)) {
                llllllllllllIlIlIlllllllllIllllI.fireChannelRead(llllllllllllIlIlIlllllllllIlllII.get(llllllllllllIlIlIllllllllllIIlIl));
                "".length();
                ++llllllllllllIlIlIllllllllllIIlIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
            llllllllllllIlIlIlllllllllIlllII.recycle();
            "".length();
            "".length();
            if (((0x75 ^ 0x0 ^ (0xD4 ^ 0x8E)) & (0x1D ^ 0x76 ^ (0xD ^ 0x49) ^ -" ".length())) >= " ".length()) {
                return;
            }
        }
        catch (DecoderException llllllllllllIlIlIllllllllllIIIll) {
            throw llllllllllllIlIlIllllllllllIIIll;
        }
        catch (Exception llllllllllllIlIlIllllllllllIIIlI) {
            throw new DecoderException(llllllllllllIlIlIllllllllllIIIlI);
        }
        finally {
            final int llllllllllllIlIlIllllllllllIIIII = llllllllllllIlIlIlllllllllIlllII.size();
            int llllllllllllIlIlIllllllllllIIIIl = MessageToMessageDecoder.lllIllllIIllll[0];
            while (lIlIIlIlllllllll(llllllllllllIlIlIllllllllllIIIIl, llllllllllllIlIlIllllllllllIIIII)) {
                llllllllllllIlIlIlllllllllIllllI.fireChannelRead(llllllllllllIlIlIlllllllllIlllII.get(llllllllllllIlIlIllllllllllIIIIl));
                "".length();
                ++llllllllllllIlIlIllllllllllIIIIl;
                "".length();
                if (((0x4F ^ 0x69) & ~(0x48 ^ 0x6E)) != 0x0) {
                    return;
                }
            }
            llllllllllllIlIlIlllllllllIlllII.recycle();
            "".length();
        }
    }
    
    protected abstract void decode(final ChannelHandlerContext p0, final I p1, final List<Object> p2) throws Exception;
    
    private static void lIlIIlIllllllIIl() {
        (lllIllllIIlIIl = new String[MessageToMessageDecoder.lllIllllIIllll[1]])[MessageToMessageDecoder.lllIllllIIllll[0]] = lIlIIlIlllllIIll("jlhAlbfX9kw=", "SHeOm");
    }
    
    private static void lIlIIlIlllllllIl() {
        (lllIllllIIllll = new int[3])[0] = ((0x46 ^ 0x61) & ~(0x8C ^ 0xAB));
        MessageToMessageDecoder.lllIllllIIllll[1] = " ".length();
        MessageToMessageDecoder.lllIllllIIllll[2] = "  ".length();
    }
    
    private static boolean lIlIIlIllllllllI(final int llllllllllllIlIlIlllllllllIIIIII) {
        return llllllllllllIlIlIlllllllllIIIIII != 0;
    }
    
    public boolean acceptInboundMessage(final Object llllllllllllIlIlIlllllllllllIIlI) throws Exception {
        return this.matcher.match(llllllllllllIlIlIlllllllllllIIlI);
    }
}
