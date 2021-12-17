// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;

@ChannelHandler.Sharable
public class LengthFieldPrepender extends MessageToByteEncoder<ByteBuf>
{
    private static final /* synthetic */ int[] lIIlIllIlIIlII;
    private final /* synthetic */ int lengthFieldLength;
    private final /* synthetic */ boolean lengthIncludesLengthFieldLength;
    private final /* synthetic */ int lengthAdjustment;
    private static final /* synthetic */ String[] lIIlIllIIlllll;
    
    private static String llIlIIlIIllIIll(String lllllllllllllIIllIIlIIIIlIlIIIIl, final String lllllllllllllIIllIIlIIIIlIlIIlIl) {
        lllllllllllllIIllIIlIIIIlIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIIIIlIlIIlII = new StringBuilder();
        final char[] lllllllllllllIIllIIlIIIIlIlIIIll = lllllllllllllIIllIIlIIIIlIlIIlIl.toCharArray();
        int lllllllllllllIIllIIlIIIIlIlIIIlI = LengthFieldPrepender.lIIlIllIlIIlII[0];
        final short lllllllllllllIIllIIlIIIIlIIlllII = (Object)lllllllllllllIIllIIlIIIIlIlIIIIl.toCharArray();
        final byte lllllllllllllIIllIIlIIIIlIIllIll = (byte)lllllllllllllIIllIIlIIIIlIIlllII.length;
        Exception lllllllllllllIIllIIlIIIIlIIllIlI = (Exception)LengthFieldPrepender.lIIlIllIlIIlII[0];
        while (llIlIIlIlIIIllI((int)lllllllllllllIIllIIlIIIIlIIllIlI, lllllllllllllIIllIIlIIIIlIIllIll)) {
            final char lllllllllllllIIllIIlIIIIlIlIIlll = lllllllllllllIIllIIlIIIIlIIlllII[lllllllllllllIIllIIlIIIIlIIllIlI];
            lllllllllllllIIllIIlIIIIlIlIIlII.append((char)(lllllllllllllIIllIIlIIIIlIlIIlll ^ lllllllllllllIIllIIlIIIIlIlIIIll[lllllllllllllIIllIIlIIIIlIlIIIlI % lllllllllllllIIllIIlIIIIlIlIIIll.length]));
            "".length();
            ++lllllllllllllIIllIIlIIIIlIlIIIlI;
            ++lllllllllllllIIllIIlIIIIlIIllIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIIIIlIlIIlII);
    }
    
    private static void llIlIIlIIllllll() {
        (lIIlIllIIlllll = new String[LengthFieldPrepender.lIIlIllIlIIlII[11]])[LengthFieldPrepender.lIIlIllIlIIlII[0]] = llIlIIlIIllIIll("CQMYDAUNIB8OHQEqEwUWEQ5WBgQWElYJFEUDHx8ZABRWWl1FVFpLQklGQkdRChRWU0tF", "efvkq");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[1]] = llIlIIlIIllIlII("yfpbCILNVDavVGhnK/hvVwRgb5xBPXIO", "ZtTli");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[2]] = llIlIIlIIllIlII("XVyLZ5zztOKBcCWjS1N8jU2o+0gUpwB0", "hZYxD");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[3]] = llIlIIlIIllIlII("lPIPj3bvahstmFU9lzDnho3xHDdkCAnpsuL3LAbd+r2tzsKBjcoOpw==", "VJctQ");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[4]] = llIlIIlIIllIlIl("+DMdg3AGiSA9IvRSugXXzeAMkUK7Az3phRSF58Moxo9eJLVfpQoa/ukhGqhXFSLX", "YsQZQ");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[9]] = llIlIIlIIllIlIl("8BMasx+XzZV5jOwQGJt8i6zvsMzpATNcYaWjU0ZoytuyPiMEb/EZO+IMpteJXGqj", "dHJqc");
        LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[10]] = llIlIIlIIllIlIl("1O1i8dCBHaXzDqnRWEVJ/5oYBwhy1C6W", "CNkHi");
    }
    
    public LengthFieldPrepender(final int lllllllllllllIIllIIlIIIIllllIlII, final int lllllllllllllIIllIIlIIIIllllIIll) {
        this(lllllllllllllIIllIIlIIIIllllIlII, lllllllllllllIIllIIlIIIIllllIIll, (boolean)(LengthFieldPrepender.lIIlIllIlIIlII[0] != 0));
    }
    
    public LengthFieldPrepender(final int lllllllllllllIIllIIlIIIIlllllIlI, final boolean lllllllllllllIIllIIlIIIIlllllIIl) {
        this(lllllllllllllIIllIIlIIIIlllllIlI, LengthFieldPrepender.lIIlIllIlIIlII[0], lllllllllllllIIllIIlIIIIlllllIIl);
    }
    
    private static boolean llIlIIlIlIIIIlI(final int lllllllllllllIIllIIlIIIIlIIIlIlI, final int lllllllllllllIIllIIlIIIIlIIIlIIl) {
        return lllllllllllllIIllIIlIIIIlIIIlIlI != lllllllllllllIIllIIlIIIIlIIIlIIl;
    }
    
    static {
        llIlIIlIlIIIIIl();
        llIlIIlIIllllll();
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIllIIlIIIIllIllllI, final ByteBuf lllllllllllllIIllIIlIIIIllIllIIl, final ByteBuf lllllllllllllIIllIIlIIIIllIlllII) throws Exception {
        int lllllllllllllIIllIIlIIIIllIllIll = lllllllllllllIIllIIlIIIIllIllIIl.readableBytes() + this.lengthAdjustment;
        if (llIlIIlIlIIIIll(this.lengthIncludesLengthFieldLength ? 1 : 0)) {
            lllllllllllllIIllIIlIIIIllIllIll += this.lengthFieldLength;
        }
        if (llIlIIlIlIIIlII(lllllllllllllIIllIIlIIIIllIllIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[1]]).append(lllllllllllllIIllIIlIIIIllIllIll).append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[2]])));
        }
        switch (this.lengthFieldLength) {
            case 1: {
                if (llIlIIlIlIIIlIl(lllllllllllllIIllIIlIIIIllIllIll, LengthFieldPrepender.lIIlIllIlIIlII[6])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[3]]).append(lllllllllllllIIllIIlIIIIllIllIll)));
                }
                lllllllllllllIIllIIlIIIIllIlllII.writeByte((byte)lllllllllllllIIllIIlIIIIllIllIll);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 2: {
                if (llIlIIlIlIIIlIl(lllllllllllllIIllIIlIIIIllIllIll, LengthFieldPrepender.lIIlIllIlIIlII[7])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[4]]).append(lllllllllllllIIllIIlIIIIllIllIll)));
                }
                lllllllllllllIIllIIlIIIIllIlllII.writeShort((short)lllllllllllllIIllIIlIIIIllIllIll);
                "".length();
                "".length();
                if ("   ".length() == ((0xA9 ^ 0x8A) & ~(0x61 ^ 0x42))) {
                    return;
                }
                break;
            }
            case 3: {
                if (llIlIIlIlIIIlIl(lllllllllllllIIllIIlIIIIllIllIll, LengthFieldPrepender.lIIlIllIlIIlII[8])) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[9]]).append(lllllllllllllIIllIIlIIIIllIllIll)));
                }
                lllllllllllllIIllIIlIIIIllIlllII.writeMedium(lllllllllllllIIllIIlIIIIllIllIll);
                "".length();
                "".length();
                if (-(0xA1 ^ 0xA5) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                lllllllllllllIIllIIlIIIIllIlllII.writeInt(lllllllllllllIIllIIlIIIIllIllIll);
                "".length();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                break;
            }
            case 8: {
                lllllllllllllIIllIIlIIIIllIlllII.writeLong(lllllllllllllIIllIIlIIIIllIllIll);
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            default: {
                throw new Error(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[10]]);
            }
        }
        lllllllllllllIIllIIlIIIIllIlllII.writeBytes(lllllllllllllIIllIIlIIIIllIllIIl, lllllllllllllIIllIIlIIIIllIllIIl.readerIndex(), lllllllllllllIIllIIlIIIIllIllIIl.readableBytes());
        "".length();
    }
    
    private static void llIlIIlIlIIIIIl() {
        (lIIlIllIlIIlII = new int[12])[0] = ((96 + 105 - 149 + 92 ^ 17 + 98 + 18 + 1) & (130 + 2 - 74 + 99 ^ 103 + 72 - 115 + 79 ^ -" ".length()));
        LengthFieldPrepender.lIIlIllIlIIlII[1] = " ".length();
        LengthFieldPrepender.lIIlIllIlIIlII[2] = "  ".length();
        LengthFieldPrepender.lIIlIllIlIIlII[3] = "   ".length();
        LengthFieldPrepender.lIIlIllIlIIlII[4] = (0x1B ^ 0x1F);
        LengthFieldPrepender.lIIlIllIlIIlII[5] = (91 + 56 - 98 + 110 ^ 112 + 147 - 122 + 14);
        LengthFieldPrepender.lIIlIllIlIIlII[6] = (-(0xFFFFBFF4 & 0x68DF) & (0xFFFFFBF3 & 0x2DDF));
        LengthFieldPrepender.lIIlIllIlIIlII[7] = (0xFFFFB0B3 & 0x14F4C);
        LengthFieldPrepender.lIIlIllIlIIlII[8] = (0xFFFFD72E & 0x10028D1);
        LengthFieldPrepender.lIIlIllIlIIlII[9] = (0x97 ^ 0x92);
        LengthFieldPrepender.lIIlIllIlIIlII[10] = (0x32 ^ 0x46 ^ (0x74 ^ 0x6));
        LengthFieldPrepender.lIIlIllIlIIlII[11] = (0x9 ^ 0xE);
    }
    
    private static String llIlIIlIIllIlII(final String lllllllllllllIIllIIlIIIIllIIIIll, final String lllllllllllllIIllIIlIIIIllIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), LengthFieldPrepender.lIIlIllIlIIlII[5]), "DES");
            final Cipher lllllllllllllIIllIIlIIIIllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIIIIllIIIlIl.init(LengthFieldPrepender.lIIlIllIlIIlII[2], lllllllllllllIIllIIlIIIIllIIIllI);
            return new String(lllllllllllllIIllIIlIIIIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIIIllIIIlII) {
            lllllllllllllIIllIIlIIIIllIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIlIIIlII(final int lllllllllllllIIllIIlIIIIlIIIllIl) {
        return lllllllllllllIIllIIlIIIIlIIIllIl < 0;
    }
    
    public LengthFieldPrepender(final int lllllllllllllIIllIIlIIIIlllIIllI, final int lllllllllllllIIllIIlIIIIlllIlIIl, final boolean lllllllllllllIIllIIlIIIIlllIIlII) {
        if (llIlIIlIlIIIIlI(lllllllllllllIIllIIlIIIIlllIIllI, LengthFieldPrepender.lIIlIllIlIIlII[1]) && llIlIIlIlIIIIlI(lllllllllllllIIllIIlIIIIlllIIllI, LengthFieldPrepender.lIIlIllIlIIlII[2]) && llIlIIlIlIIIIlI(lllllllllllllIIllIIlIIIIlllIIllI, LengthFieldPrepender.lIIlIllIlIIlII[3]) && llIlIIlIlIIIIlI(lllllllllllllIIllIIlIIIIlllIIllI, LengthFieldPrepender.lIIlIllIlIIlII[4]) && llIlIIlIlIIIIlI(lllllllllllllIIllIIlIIIIlllIIllI, LengthFieldPrepender.lIIlIllIlIIlII[5])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(LengthFieldPrepender.lIIlIllIIlllll[LengthFieldPrepender.lIIlIllIlIIlII[0]]).append(lllllllllllllIIllIIlIIIIlllIIllI)));
        }
        this.lengthFieldLength = lllllllllllllIIllIIlIIIIlllIIllI;
        this.lengthIncludesLengthFieldLength = lllllllllllllIIllIIlIIIIlllIIlII;
        this.lengthAdjustment = lllllllllllllIIllIIlIIIIlllIlIIl;
    }
    
    private static boolean llIlIIlIlIIIllI(final int lllllllllllllIIllIIlIIIIlIIlIIlI, final int lllllllllllllIIllIIlIIIIlIIlIIIl) {
        return lllllllllllllIIllIIlIIIIlIIlIIlI < lllllllllllllIIllIIlIIIIlIIlIIIl;
    }
    
    private static boolean llIlIIlIlIIIlIl(final int lllllllllllllIIllIIlIIIIlIIlIllI, final int lllllllllllllIIllIIlIIIIlIIlIlIl) {
        return lllllllllllllIIllIIlIIIIlIIlIllI >= lllllllllllllIIllIIlIIIIlIIlIlIl;
    }
    
    private static boolean llIlIIlIlIIIIll(final int lllllllllllllIIllIIlIIIIlIIIllll) {
        return lllllllllllllIIllIIlIIIIlIIIllll != 0;
    }
    
    public LengthFieldPrepender(final int lllllllllllllIIllIIlIIIlIIIIIIlI) {
        this(lllllllllllllIIllIIlIIIlIIIIIIlI, (boolean)(LengthFieldPrepender.lIIlIllIlIIlII[0] != 0));
    }
    
    private static String llIlIIlIIllIlIl(final String lllllllllllllIIllIIlIIIIlIllIlII, final String lllllllllllllIIllIIlIIIIlIllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIIIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIIIIlIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIIIIlIlllIII.init(LengthFieldPrepender.lIIlIllIlIIlII[2], lllllllllllllIIllIIlIIIIlIlllIIl);
            return new String(lllllllllllllIIllIIlIIIIlIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIIIlIllIlll) {
            lllllllllllllIIllIIlIIIIlIllIlll.printStackTrace();
            return null;
        }
    }
}
