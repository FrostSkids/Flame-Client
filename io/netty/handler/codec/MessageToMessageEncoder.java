// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import io.netty.util.internal.StringUtil;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.internal.RecyclableArrayList;
import io.netty.channel.ChannelPromise;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.TypeParameterMatcher;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public abstract class MessageToMessageEncoder<I> extends ChannelOutboundHandlerAdapter
{
    private static final /* synthetic */ int[] lIIIllIllIIlll;
    private final /* synthetic */ TypeParameterMatcher matcher;
    private static final /* synthetic */ String[] lIIIllIllIIlIl;
    
    private static boolean llIIIlIlIIIllll(final Object lllllllllllllIIlllllllIIIllIllIl) {
        return lllllllllllllIIlllllllIIIllIllIl != null;
    }
    
    protected MessageToMessageEncoder(final Class<? extends I> lllllllllllllIIlllllllIIllIlIlII) {
        this.matcher = TypeParameterMatcher.get(lllllllllllllIIlllllllIIllIlIlII);
    }
    
    private static void llIIIlIlIIIllIl() {
        (lIIIllIllIIlll = new int[4])[0] = ((0xB5 ^ 0xAB ^ (0xED ^ 0xA8)) & (0x6F ^ 0x5E ^ (0x6A ^ 0x0) ^ -" ".length()));
        MessageToMessageEncoder.lIIIllIllIIlll[1] = " ".length();
        MessageToMessageEncoder.lIIIllIllIIlll[2] = "  ".length();
        MessageToMessageEncoder.lIIIllIllIIlll[3] = (50 + 75 - 49 + 76 ^ 49 + 131 - 179 + 143);
    }
    
    private static boolean llIIIlIlIIlIIII(final int lllllllllllllIIlllllllIIIllIIlIl) {
        return lllllllllllllIIlllllllIIIllIIlIl == 0;
    }
    
    private static boolean llIIIlIlIIIlllI(final int lllllllllllllIIlllllllIIIllIIlll) {
        return lllllllllllllIIlllllllIIIllIIlll != 0;
    }
    
    static {
        llIIIlIlIIIllIl();
        llIIIlIlIIIlIlI();
    }
    
    private static boolean llIIIlIlIIlIIll(final int lllllllllllllIIlllllllIIIlllIIII, final int lllllllllllllIIlllllllIIIllIllll) {
        return lllllllllllllIIlllllllIIIlllIIII < lllllllllllllIIlllllllIIIllIllll;
    }
    
    private static String llIIIlIlIIIlIIl(final String lllllllllllllIIlllllllIIIllllIII, final String lllllllllllllIIlllllllIIIlllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllllllIIIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIIIlllIlll.getBytes(StandardCharsets.UTF_8)), MessageToMessageEncoder.lIIIllIllIIlll[3]), "DES");
            final Cipher lllllllllllllIIlllllllIIIllllIlI = Cipher.getInstance("DES");
            lllllllllllllIIlllllllIIIllllIlI.init(MessageToMessageEncoder.lIIIllIllIIlll[2], lllllllllllllIIlllllllIIIllllIll);
            return new String(lllllllllllllIIlllllllIIIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllllIIIllllIIl) {
            lllllllllllllIIlllllllIIIllllIIl.printStackTrace();
            return null;
        }
    }
    
    public boolean acceptOutboundMessage(final Object lllllllllllllIIlllllllIIllIIllII) throws Exception {
        return this.matcher.match(lllllllllllllIIlllllllIIllIIllII);
    }
    
    private static void llIIIlIlIIIlIlI() {
        (lIIIllIllIIlIl = new String[MessageToMessageEncoder.lIIIllIllIIlll[2]])[MessageToMessageEncoder.lIIIllIllIIlll[0]] = llIIIlIlIIIlIII("Cw==", "BRdgt");
        MessageToMessageEncoder.lIIIllIllIIlIl[MessageToMessageEncoder.lIIIllIllIIlll[1]] = llIIIlIlIIIlIIl("Sk7rsi/OAi7g5+AC+fGORPzuvNBhDRDGk3BA3DeDfNFwdOw4AXG84A==", "THEqs");
    }
    
    private static boolean llIIIlIlIIlIIlI(final Object lllllllllllllIIlllllllIIIllIlIlI, final Object lllllllllllllIIlllllllIIIllIlIIl) {
        return lllllllllllllIIlllllllIIIllIlIlI == lllllllllllllIIlllllllIIIllIlIIl;
    }
    
    private static boolean llIIIlIlIIlIIIl(final int lllllllllllllIIlllllllIIIllIIIll) {
        return lllllllllllllIIlllllllIIIllIIIll > 0;
    }
    
    private static String llIIIlIlIIIlIII(String lllllllllllllIIlllllllIIlIIIlIII, final String lllllllllllllIIlllllllIIlIIIIlll) {
        lllllllllllllIIlllllllIIlIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIlllllllIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllllIIlIIIlIll = new StringBuilder();
        final char[] lllllllllllllIIlllllllIIlIIIlIlI = lllllllllllllIIlllllllIIlIIIIlll.toCharArray();
        int lllllllllllllIIlllllllIIlIIIlIIl = MessageToMessageEncoder.lIIIllIllIIlll[0];
        final double lllllllllllllIIlllllllIIlIIIIIll = (Object)lllllllllllllIIlllllllIIlIIIlIII.toCharArray();
        final short lllllllllllllIIlllllllIIlIIIIIlI = (short)lllllllllllllIIlllllllIIlIIIIIll.length;
        short lllllllllllllIIlllllllIIlIIIIIIl = (short)MessageToMessageEncoder.lIIIllIllIIlll[0];
        while (llIIIlIlIIlIIll(lllllllllllllIIlllllllIIlIIIIIIl, lllllllllllllIIlllllllIIlIIIIIlI)) {
            final char lllllllllllllIIlllllllIIlIIIlllI = lllllllllllllIIlllllllIIlIIIIIll[lllllllllllllIIlllllllIIlIIIIIIl];
            lllllllllllllIIlllllllIIlIIIlIll.append((char)(lllllllllllllIIlllllllIIlIIIlllI ^ lllllllllllllIIlllllllIIlIIIlIlI[lllllllllllllIIlllllllIIlIIIlIIl % lllllllllllllIIlllllllIIlIIIlIlI.length]));
            "".length();
            ++lllllllllllllIIlllllllIIlIIIlIIl;
            ++lllllllllllllIIlllllllIIlIIIIIIl;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllllIIlIIIlIll);
    }
    
    protected abstract void encode(final ChannelHandlerContext p0, final I p1, final List<Object> p2) throws Exception;
    
    protected MessageToMessageEncoder() {
        this.matcher = TypeParameterMatcher.find(this, MessageToMessageEncoder.class, MessageToMessageEncoder.lIIIllIllIIlIl[MessageToMessageEncoder.lIIIllIllIIlll[0]]);
    }
    
    @Override
    public void write(final ChannelHandlerContext lllllllllllllIIlllllllIIlIlIIllI, final Object lllllllllllllIIlllllllIIlIlIIlIl, final ChannelPromise lllllllllllllIIlllllllIIlIlIlIIl) throws Exception {
        RecyclableArrayList lllllllllllllIIlllllllIIlIlIlIII = null;
        try {
            if (llIIIlIlIIIlllI(this.acceptOutboundMessage(lllllllllllllIIlllllllIIlIlIIlIl) ? 1 : 0)) {
                lllllllllllllIIlllllllIIlIlIlIII = RecyclableArrayList.newInstance();
                final I lllllllllllllIIlllllllIIlIlllIll = (I)lllllllllllllIIlllllllIIlIlIIlIl;
                try {
                    this.encode(lllllllllllllIIlllllllIIlIlIIllI, lllllllllllllIIlllllllIIlIlllIll, lllllllllllllIIlllllllIIlIlIlIII);
                    ReferenceCountUtil.release(lllllllllllllIIlllllllIIlIlllIll);
                    "".length();
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return;
                    }
                }
                finally {
                    ReferenceCountUtil.release(lllllllllllllIIlllllllIIlIlllIll);
                    "".length();
                }
                if (llIIIlIlIIIlllI(lllllllllllllIIlllllllIIlIlIlIII.isEmpty() ? 1 : 0)) {
                    lllllllllllllIIlllllllIIlIlIlIII.recycle();
                    "".length();
                    lllllllllllllIIlllllllIIlIlIlIII = null;
                    throw new EncoderException(String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(MessageToMessageEncoder.lIIIllIllIIlIl[MessageToMessageEncoder.lIIIllIllIIlll[1]])));
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIIlIl, lllllllllllllIIlllllllIIlIlIlIIl);
                "".length();
            }
            if (!llIIIlIlIIIllll(lllllllllllllIIlllllllIIlIlIlIII)) {
                return;
            }
            final int lllllllllllllIIlllllllIIlIllIlIl = lllllllllllllIIlllllllIIlIlIlIII.size() - MessageToMessageEncoder.lIIIllIllIIlll[1];
            if (llIIIlIlIIlIIII(lllllllllllllIIlllllllIIlIllIlIl)) {
                lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(MessageToMessageEncoder.lIIIllIllIIlll[0]), lllllllllllllIIlllllllIIlIlIlIIl);
                "".length();
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else if (llIIIlIlIIlIIIl(lllllllllllllIIlllllllIIlIllIlIl)) {
                final ChannelPromise lllllllllllllIIlllllllIIlIllIlll = lllllllllllllIIlllllllIIlIlIIllI.voidPromise();
                int n;
                if (llIIIlIlIIlIIlI(lllllllllllllIIlllllllIIlIlIlIIl, lllllllllllllIIlllllllIIlIllIlll)) {
                    n = MessageToMessageEncoder.lIIIllIllIIlll[1];
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    n = MessageToMessageEncoder.lIIIllIllIIlll[0];
                }
                final boolean lllllllllllllIIlllllllIIlIllIllI = n != 0;
                int lllllllllllllIIlllllllIIlIlllIII = MessageToMessageEncoder.lIIIllIllIIlll[0];
                while (llIIIlIlIIlIIll(lllllllllllllIIlllllllIIlIlllIII, lllllllllllllIIlllllllIIlIllIlIl)) {
                    ChannelPromise lllllllllllllIIlllllllIIlIlllIIl = null;
                    if (llIIIlIlIIIlllI(lllllllllllllIIlllllllIIlIllIllI ? 1 : 0)) {
                        final ChannelPromise lllllllllllllIIlllllllIIlIlllIlI = lllllllllllllIIlllllllIIlIllIlll;
                        "".length();
                        if (" ".length() > "   ".length()) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlllllllIIlIlllIIl = lllllllllllllIIlllllllIIlIlIIllI.newPromise();
                    }
                    lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(lllllllllllllIIlllllllIIlIlllIII), lllllllllllllIIlllllllIIlIlllIIl);
                    "".length();
                    ++lllllllllllllIIlllllllIIlIlllIII;
                    "".length();
                    if ("  ".length() <= ((0x1C ^ 0x2C) & ~(0x18 ^ 0x28))) {
                        return;
                    }
                }
                lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(lllllllllllllIIlllllllIIlIllIlIl), lllllllllllllIIlllllllIIlIlIlIIl);
                "".length();
            }
            lllllllllllllIIlllllllIIlIlIlIII.recycle();
            "".length();
            "".length();
            if (((64 + 75 - 138 + 165 ^ 67 + 19 + 54 + 10) & (87 + 123 - 144 + 65 ^ 21 + 46 - 32 + 144 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (EncoderException lllllllllllllIIlllllllIIlIllIlII) {
            throw lllllllllllllIIlllllllIIlIllIlII;
        }
        catch (Throwable lllllllllllllIIlllllllIIlIllIIll) {
            throw new EncoderException(lllllllllllllIIlllllllIIlIllIIll);
        }
        finally {
            if (llIIIlIlIIIllll(lllllllllllllIIlllllllIIlIlIlIII)) {
                final int lllllllllllllIIlllllllIIlIlIllIl = lllllllllllllIIlllllllIIlIlIlIII.size() - MessageToMessageEncoder.lIIIllIllIIlll[1];
                if (llIIIlIlIIlIIII(lllllllllllllIIlllllllIIlIlIllIl)) {
                    lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(MessageToMessageEncoder.lIIIllIllIIlll[0]), lllllllllllllIIlllllllIIlIlIlIIl);
                    "".length();
                    "".length();
                    if (-(0x3 ^ 0x63 ^ (0x11 ^ 0x74)) >= 0) {
                        return;
                    }
                }
                else if (llIIIlIlIIlIIIl(lllllllllllllIIlllllllIIlIlIllIl)) {
                    final ChannelPromise lllllllllllllIIlllllllIIlIlIllll = lllllllllllllIIlllllllIIlIlIIllI.voidPromise();
                    int n2;
                    if (llIIIlIlIIlIIlI(lllllllllllllIIlllllllIIlIlIlIIl, lllllllllllllIIlllllllIIlIlIllll)) {
                        n2 = MessageToMessageEncoder.lIIIllIllIIlll[1];
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        n2 = MessageToMessageEncoder.lIIIllIllIIlll[0];
                    }
                    final boolean lllllllllllllIIlllllllIIlIlIlllI = n2 != 0;
                    int lllllllllllllIIlllllllIIlIllIIII = MessageToMessageEncoder.lIIIllIllIIlll[0];
                    while (llIIIlIlIIlIIll(lllllllllllllIIlllllllIIlIllIIII, lllllllllllllIIlllllllIIlIlIllIl)) {
                        ChannelPromise lllllllllllllIIlllllllIIlIllIIIl = null;
                        if (llIIIlIlIIIlllI(lllllllllllllIIlllllllIIlIlIlllI ? 1 : 0)) {
                            final ChannelPromise lllllllllllllIIlllllllIIlIllIIlI = lllllllllllllIIlllllllIIlIlIllll;
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIlllllllIIlIllIIIl = lllllllllllllIIlllllllIIlIlIIllI.newPromise();
                        }
                        lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(lllllllllllllIIlllllllIIlIllIIII), lllllllllllllIIlllllllIIlIllIIIl);
                        "".length();
                        ++lllllllllllllIIlllllllIIlIllIIII;
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                    }
                    lllllllllllllIIlllllllIIlIlIIllI.write(lllllllllllllIIlllllllIIlIlIlIII.get(lllllllllllllIIlllllllIIlIlIllIl), lllllllllllllIIlllllllIIlIlIlIIl);
                    "".length();
                }
                lllllllllllllIIlllllllIIlIlIlIII.recycle();
                "".length();
            }
        }
    }
}
