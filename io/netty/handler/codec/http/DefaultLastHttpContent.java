// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import java.util.Iterator;
import io.netty.util.internal.StringUtil;
import java.util.Map;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBufHolder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBuf;

public class DefaultLastHttpContent extends DefaultHttpContent implements LastHttpContent
{
    private static final /* synthetic */ String[] lIIIIlllIIlIIl;
    private final /* synthetic */ boolean validateHeaders;
    private static final /* synthetic */ int[] lIIIIlllIIlIll;
    private final /* synthetic */ HttpHeaders trailingHeaders;
    
    private static boolean lIllllIIlIIlIIl(final int lllllllllllllIlIIlIIIIIlIIlllllI, final int lllllllllllllIlIIlIIIIIlIIllllIl) {
        return lllllllllllllIlIIlIIIIIlIIlllllI < lllllllllllllIlIIlIIIIIlIIllllIl;
    }
    
    public DefaultLastHttpContent(final ByteBuf lllllllllllllIlIIlIIIIIllIlIlIll, final boolean lllllllllllllIlIIlIIIIIllIlIllIl) {
        super(lllllllllllllIlIIlIIIIIllIlIlIll);
        this.trailingHeaders = new TrailingHeaders(lllllllllllllIlIIlIIIIIllIlIllIl);
        this.validateHeaders = lllllllllllllIlIIlIIIIIllIlIllIl;
    }
    
    private static String lIllllIIlIIIIll(String lllllllllllllIlIIlIIIIIlIlIIlIIl, final String lllllllllllllIlIIlIIIIIlIlIIllIl) {
        lllllllllllllIlIIlIIIIIlIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIIIlIlIIllII = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIIIlIlIIlIll = lllllllllllllIlIIlIIIIIlIlIIllIl.toCharArray();
        int lllllllllllllIlIIlIIIIIlIlIIlIlI = DefaultLastHttpContent.lIIIIlllIIlIll[0];
        final boolean lllllllllllllIlIIlIIIIIlIlIIIlII = (Object)lllllllllllllIlIIlIIIIIlIlIIlIIl.toCharArray();
        final byte lllllllllllllIlIIlIIIIIlIlIIIIll = (byte)lllllllllllllIlIIlIIIIIlIlIIIlII.length;
        char lllllllllllllIlIIlIIIIIlIlIIIIlI = (char)DefaultLastHttpContent.lIIIIlllIIlIll[0];
        while (lIllllIIlIIlIIl(lllllllllllllIlIIlIIIIIlIlIIIIlI, lllllllllllllIlIIlIIIIIlIlIIIIll)) {
            final char lllllllllllllIlIIlIIIIIlIlIIllll = lllllllllllllIlIIlIIIIIlIlIIIlII[lllllllllllllIlIIlIIIIIlIlIIIIlI];
            lllllllllllllIlIIlIIIIIlIlIIllII.append((char)(lllllllllllllIlIIlIIIIIlIlIIllll ^ lllllllllllllIlIIlIIIIIlIlIIlIll[lllllllllllllIlIIlIIIIIlIlIIlIlI % lllllllllllllIlIIlIIIIIlIlIIlIll.length]));
            "".length();
            ++lllllllllllllIlIIlIIIIIlIlIIlIlI;
            ++lllllllllllllIlIIlIIIIIlIlIIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIIIlIlIIllII);
    }
    
    private static void lIllllIIlIIIlll() {
        (lIIIIlllIIlIll = new int[2])[0] = ((0x9F ^ 0xA4 ^ (0x34 ^ 0x28)) & (0xE5 ^ 0xA9 ^ (0x52 ^ 0x39) ^ -" ".length()));
        DefaultLastHttpContent.lIIIIlllIIlIll[1] = " ".length();
    }
    
    private static void lIllllIIlIIIlII() {
        (lIIIIlllIIlIIl = new String[DefaultLastHttpContent.lIIIIlllIIlIll[1]])[DefaultLastHttpContent.lIIIIlllIIlIll[0]] = lIllllIIlIIIIll("T3k=", "uYHjl");
    }
    
    @Override
    public LastHttpContent retain(final int lllllllllllllIlIIlIIIIIllIIllIII) {
        super.retain(lllllllllllllIlIIlIIIIIllIIllIII);
        "".length();
        return this;
    }
    
    @Override
    public HttpHeaders trailingHeaders() {
        return this.trailingHeaders;
    }
    
    public DefaultLastHttpContent() {
        this(Unpooled.buffer(DefaultLastHttpContent.lIIIIlllIIlIll[0]));
    }
    
    private static boolean lIllllIIlIIlIII(final int lllllllllllllIlIIlIIIIIlIIlllIll) {
        return lllllllllllllIlIIlIIIIIlIIlllIll != 0;
    }
    
    private void appendHeaders(final StringBuilder lllllllllllllIlIIlIIIIIllIIIIIlI) {
        final Iterator lllllllllllllIlIIlIIIIIllIIIIllI = this.trailingHeaders().iterator();
        while (lIllllIIlIIlIII(lllllllllllllIlIIlIIIIIllIIIIllI.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> lllllllllllllIlIIlIIIIIllIIIIlll = lllllllllllllIlIIlIIIIIllIIIIllI.next();
            lllllllllllllIlIIlIIIIIllIIIIIlI.append(lllllllllllllIlIIlIIIIIllIIIIlll.getKey());
            "".length();
            lllllllllllllIlIIlIIIIIllIIIIIlI.append(DefaultLastHttpContent.lIIIIlllIIlIIl[DefaultLastHttpContent.lIIIIlllIIlIll[0]]);
            "".length();
            lllllllllllllIlIIlIIIIIllIIIIIlI.append(lllllllllllllIlIIlIIIIIllIIIIlll.getValue());
            "".length();
            lllllllllllllIlIIlIIIIIllIIIIIlI.append(StringUtil.NEWLINE);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
    }
    
    public DefaultLastHttpContent(final ByteBuf lllllllllllllIlIIlIIIIIllIllIlIl) {
        this(lllllllllllllIlIIlIIIIIllIllIlIl, (boolean)(DefaultLastHttpContent.lIIIIlllIIlIll[1] != 0));
    }
    
    @Override
    public LastHttpContent duplicate() {
        final DefaultLastHttpContent lllllllllllllIlIIlIIIIIllIlIIIII = new DefaultLastHttpContent(this.content().duplicate(), this.validateHeaders);
        lllllllllllllIlIIlIIIIIllIlIIIII.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIlIIlIIIIIllIlIIIII;
    }
    
    @Override
    public LastHttpContent copy() {
        final DefaultLastHttpContent lllllllllllllIlIIlIIIIIllIlIIllI = new DefaultLastHttpContent(this.content().copy(), this.validateHeaders);
        lllllllllllllIlIIlIIIIIllIlIIllI.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIlIIlIIIIIllIlIIllI;
    }
    
    static {
        lIllllIIlIIIlll();
        lIllllIIlIIIlII();
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIlIIlIIIIIllIIIlllI = new StringBuilder(super.toString());
        lllllllllllllIlIIlIIIIIllIIIlllI.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(lllllllllllllIlIIlIIIIIllIIIlllI);
        lllllllllllllIlIIlIIIIIllIIIlllI.setLength(lllllllllllllIlIIlIIIIIllIIIlllI.length() - StringUtil.NEWLINE.length());
        return String.valueOf(lllllllllllllIlIIlIIIIIllIIIlllI);
    }
    
    @Override
    public LastHttpContent retain() {
        super.retain();
        "".length();
        return this;
    }
    
    private static final class TrailingHeaders extends DefaultHttpHeaders
    {
        private static final /* synthetic */ String[] llllIIIIllIIl;
        private static final /* synthetic */ int[] llllIIIIllIlI;
        
        private static void lIlIIlllIlIIIlI() {
            (llllIIIIllIIl = new String[TrailingHeaders.llllIIIIllIlI[4]])[TrailingHeaders.llllIIIIllIlI[0]] = lIlIIlllIIlllIl("XCdWkOTbiB8bCdT1udoNFg==", "iQSSy");
            TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[1]] = lIlIIlllIIlllIl("6HD+3QDbsWWbC9M2rkxlAqZ7PfCCcVb4", "hgOxC");
            TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[2]] = lIlIIlllIlIIIIl("MxsXCjUCGw==", "givcY");
            TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[3]] = lIlIIlllIIlllIl("9d+U7EJyr9++yhpc4oo5dpPHchY+IfuAQD/Y0kNfQ44=", "oXRUf");
        }
        
        private static String lIlIIlllIIlllIl(final String lllllllllllllIlIllllIIllIlIIIlll, final String lllllllllllllIlIllllIIllIlIIlIII) {
            try {
                final SecretKeySpec lllllllllllllIlIllllIIllIlIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), TrailingHeaders.llllIIIIllIlI[5]), "DES");
                final Cipher lllllllllllllIlIllllIIllIlIIlIll = Cipher.getInstance("DES");
                lllllllllllllIlIllllIIllIlIIlIll.init(TrailingHeaders.llllIIIIllIlI[2], lllllllllllllIlIllllIIllIlIIllII);
                return new String(lllllllllllllIlIllllIIllIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIllIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllllIIllIlIIlIlI) {
                lllllllllllllIlIllllIIllIlIIlIlI.printStackTrace();
                return null;
            }
        }
        
        TrailingHeaders(final boolean lllllllllllllIlIllllIIllIllIllll) {
            super(lllllllllllllIlIllllIIllIllIllll);
        }
        
        static {
            lIlIIlllIlIIIll();
            lIlIIlllIlIIIlI();
        }
        
        private static void lIlIIlllIlIIIll() {
            (llllIIIIllIlI = new int[6])[0] = ((0x3A ^ 0x63) & ~(0x5 ^ 0x5C));
            TrailingHeaders.llllIIIIllIlI[1] = " ".length();
            TrailingHeaders.llllIIIIllIlI[2] = "  ".length();
            TrailingHeaders.llllIIIIllIlI[3] = "   ".length();
            TrailingHeaders.llllIIIIllIlI[4] = (47 + 55 - 16 + 48 ^ 64 + 64 - 49 + 51);
            TrailingHeaders.llllIIIIllIlI[5] = (0x10 ^ 0x18);
        }
        
        @Override
        void validateHeaderName0(final CharSequence lllllllllllllIlIllllIIllIllIlIll) {
            super.validateHeaderName0(lllllllllllllIlIllllIIllIllIlIll);
            if (!lIlIIlllIlIIlII(HttpHeaders.equalsIgnoreCase(TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[0]], lllllllllllllIlIllllIIllIllIlIll) ? 1 : 0) || !lIlIIlllIlIIlII(HttpHeaders.equalsIgnoreCase(TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[1]], lllllllllllllIlIllllIIllIllIlIll) ? 1 : 0) || lIlIIlllIlIIlIl(HttpHeaders.equalsIgnoreCase(TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[2]], lllllllllllllIlIllllIIllIllIlIll) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(TrailingHeaders.llllIIIIllIIl[TrailingHeaders.llllIIIIllIlI[3]]).append((Object)lllllllllllllIlIllllIIllIllIlIll)));
            }
        }
        
        private static String lIlIIlllIlIIIIl(String lllllllllllllIlIllllIIllIlIllIIl, final String lllllllllllllIlIllllIIllIlIlllIl) {
            lllllllllllllIlIllllIIllIlIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllllIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIllllIIllIlIlllII = new StringBuilder();
            final char[] lllllllllllllIlIllllIIllIlIllIll = lllllllllllllIlIllllIIllIlIlllIl.toCharArray();
            int lllllllllllllIlIllllIIllIlIllIlI = TrailingHeaders.llllIIIIllIlI[0];
            final String lllllllllllllIlIllllIIllIlIlIlII = (Object)lllllllllllllIlIllllIIllIlIllIIl.toCharArray();
            final String lllllllllllllIlIllllIIllIlIlIIll = (String)lllllllllllllIlIllllIIllIlIlIlII.length;
            short lllllllllllllIlIllllIIllIlIlIIlI = (short)TrailingHeaders.llllIIIIllIlI[0];
            while (lIlIIlllIlIIllI(lllllllllllllIlIllllIIllIlIlIIlI, (int)lllllllllllllIlIllllIIllIlIlIIll)) {
                final char lllllllllllllIlIllllIIllIlIlllll = lllllllllllllIlIllllIIllIlIlIlII[lllllllllllllIlIllllIIllIlIlIIlI];
                lllllllllllllIlIllllIIllIlIlllII.append((char)(lllllllllllllIlIllllIIllIlIlllll ^ lllllllllllllIlIllllIIllIlIllIll[lllllllllllllIlIllllIIllIlIllIlI % lllllllllllllIlIllllIIllIlIllIll.length]));
                "".length();
                ++lllllllllllllIlIllllIIllIlIllIlI;
                ++lllllllllllllIlIllllIIllIlIlIIlI;
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIllllIIllIlIlllII);
        }
        
        private static boolean lIlIIlllIlIIlII(final int lllllllllllllIlIllllIIllIIllllII) {
            return lllllllllllllIlIllllIIllIIllllII == 0;
        }
        
        private static boolean lIlIIlllIlIIlIl(final int lllllllllllllIlIllllIIllIIlllllI) {
            return lllllllllllllIlIllllIIllIIlllllI != 0;
        }
        
        private static boolean lIlIIlllIlIIllI(final int lllllllllllllIlIllllIIllIlIIIIIl, final int lllllllllllllIlIllllIIllIlIIIIII) {
            return lllllllllllllIlIllllIIllIlIIIIIl < lllllllllllllIlIllllIIllIlIIIIII;
        }
    }
}
