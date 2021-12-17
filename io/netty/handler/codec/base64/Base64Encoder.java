// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.base64;

import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler.Sharable
public class Base64Encoder extends MessageToMessageEncoder<ByteBuf>
{
    private static final /* synthetic */ String[] lIlIIIlIIlllll;
    private static final /* synthetic */ int[] lIlIIIlIlIIIlI;
    private final /* synthetic */ boolean breakLines;
    private final /* synthetic */ Base64Dialect dialect;
    
    private static boolean lllIIIlIlIllllI(final int lllllllllllllIIIlllllIlIIlIIllll, final int lllllllllllllIIIlllllIlIIlIIlllI) {
        return lllllllllllllIIIlllllIlIIlIIllll < lllllllllllllIIIlllllIlIIlIIlllI;
    }
    
    private static String lllIIIlIlIllIlI(String lllllllllllllIIIlllllIlIIlIllIlI, final String lllllllllllllIIIlllllIlIIlIllIIl) {
        lllllllllllllIIIlllllIlIIlIllIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllllIlIIlIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllllIlIIlIlllIl = new StringBuilder();
        final char[] lllllllllllllIIIlllllIlIIlIlllII = lllllllllllllIIIlllllIlIIlIllIIl.toCharArray();
        int lllllllllllllIIIlllllIlIIlIllIll = Base64Encoder.lIlIIIlIlIIIlI[1];
        final char lllllllllllllIIIlllllIlIIlIlIlIl = (Object)((String)lllllllllllllIIIlllllIlIIlIllIlI).toCharArray();
        final byte lllllllllllllIIIlllllIlIIlIlIlII = (byte)lllllllllllllIIIlllllIlIIlIlIlIl.length;
        float lllllllllllllIIIlllllIlIIlIlIIll = Base64Encoder.lIlIIIlIlIIIlI[1];
        while (lllIIIlIlIllllI((int)lllllllllllllIIIlllllIlIIlIlIIll, lllllllllllllIIIlllllIlIIlIlIlII)) {
            final char lllllllllllllIIIlllllIlIIllIIIII = lllllllllllllIIIlllllIlIIlIlIlIl[lllllllllllllIIIlllllIlIIlIlIIll];
            lllllllllllllIIIlllllIlIIlIlllIl.append((char)(lllllllllllllIIIlllllIlIIllIIIII ^ lllllllllllllIIIlllllIlIIlIlllII[lllllllllllllIIIlllllIlIIlIllIll % lllllllllllllIIIlllllIlIIlIlllII.length]));
            "".length();
            ++lllllllllllllIIIlllllIlIIlIllIll;
            ++lllllllllllllIIIlllllIlIIlIlIIll;
            "".length();
            if (((0xAD ^ 0xA5) & ~(0x14 ^ 0x1C)) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllllIlIIlIlllIl);
    }
    
    private static void lllIIIlIlIllIll() {
        (lIlIIIlIIlllll = new String[Base64Encoder.lIlIIIlIlIIIlI[0]])[Base64Encoder.lIlIIIlIlIIIlI[1]] = lllIIIlIlIllIlI("CiolJwANNw==", "nCDKe");
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIIlllllIlIIllllIll, final ByteBuf lllllllllllllIIIlllllIlIIllllIlI, final List<Object> lllllllllllllIIIlllllIlIIllllIIl) throws Exception {
        lllllllllllllIIIlllllIlIIllllIIl.add(io.netty.handler.codec.base64.Base64.encode(lllllllllllllIIIlllllIlIIllllIlI, lllllllllllllIIIlllllIlIIllllIlI.readerIndex(), lllllllllllllIIIlllllIlIIllllIlI.readableBytes(), this.breakLines, this.dialect));
        "".length();
    }
    
    public Base64Encoder(final boolean lllllllllllllIIIlllllIlIlIIIlIll) {
        this(lllllllllllllIIIlllllIlIlIIIlIll, Base64Dialect.STANDARD);
    }
    
    private static void lllIIIlIlIlllII() {
        (lIlIIIlIlIIIlI = new int[2])[0] = " ".length();
        Base64Encoder.lIlIIIlIlIIIlI[1] = ((0xB4 ^ 0xB8 ^ (0x89 ^ 0x92)) & (105 + 174 - 104 + 9 ^ 108 + 28 - 105 + 144 ^ -" ".length()));
    }
    
    static {
        lllIIIlIlIlllII();
        lllIIIlIlIllIll();
    }
    
    private static boolean lllIIIlIlIlllIl(final Object lllllllllllllIIIlllllIlIIlIIllII) {
        return lllllllllllllIIIlllllIlIIlIIllII == null;
    }
    
    public Base64Encoder() {
        this((boolean)(Base64Encoder.lIlIIIlIlIIIlI[0] != 0));
    }
    
    public Base64Encoder(final boolean lllllllllllllIIIlllllIlIlIIIIIIl, final Base64Dialect lllllllllllllIIIlllllIlIlIIIIIll) {
        if (lllIIIlIlIlllIl(lllllllllllllIIIlllllIlIlIIIIIll)) {
            throw new NullPointerException(Base64Encoder.lIlIIIlIIlllll[Base64Encoder.lIlIIIlIlIIIlI[1]]);
        }
        this.breakLines = lllllllllllllIIIlllllIlIlIIIIIIl;
        this.dialect = lllllllllllllIIIlllllIlIlIIIIIll;
    }
}
