// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class SocksMessageEncoder extends MessageToByteEncoder<SocksMessage>
{
    private static final /* synthetic */ String[] lIlIIllIIlIlII;
    private static final /* synthetic */ int[] lIlIIllIIlIlIl;
    
    @Deprecated
    public static String getName() {
        return SocksMessageEncoder.lIlIIllIIlIlII[SocksMessageEncoder.lIlIIllIIlIlIl[0]];
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIIllIIlllIlllIIlII, final SocksMessage lllllllllllllIIIllIIlllIlllIIIIl, final ByteBuf lllllllllllllIIIllIIlllIlllIIIII) throws Exception {
        lllllllllllllIIIllIIlllIlllIIIIl.encodeAsByteBuf(lllllllllllllIIIllIIlllIlllIIIII);
    }
    
    private static void lllIIllllIllIII() {
        (lIlIIllIIlIlIl = new int[4])[0] = ((0x5 ^ 0x1) & ~(0x8A ^ 0x8E));
        SocksMessageEncoder.lIlIIllIIlIlIl[1] = " ".length();
        SocksMessageEncoder.lIlIIllIIlIlIl[2] = "  ".length();
        SocksMessageEncoder.lIlIIllIIlIlIl[3] = (0x46 ^ 0x13 ^ (0xC ^ 0x51));
    }
    
    static {
        lllIIllllIllIII();
        lllIIllllIlIlll();
        name = SocksMessageEncoder.lIlIIllIIlIlII[SocksMessageEncoder.lIlIIllIIlIlIl[1]];
    }
    
    private static String lllIIllllIlIlIl(String lllllllllllllIIIllIIlllIllIIIlII, final String lllllllllllllIIIllIIlllIllIIlIII) {
        lllllllllllllIIIllIIlllIllIIIlII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIlllIllIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlllIllIIIlll = new StringBuilder();
        final char[] lllllllllllllIIIllIIlllIllIIIllI = lllllllllllllIIIllIIlllIllIIlIII.toCharArray();
        int lllllllllllllIIIllIIlllIllIIIlIl = SocksMessageEncoder.lIlIIllIIlIlIl[0];
        final double lllllllllllllIIIllIIlllIlIllllll = (Object)((String)lllllllllllllIIIllIIlllIllIIIlII).toCharArray();
        final float lllllllllllllIIIllIIlllIlIlllllI = lllllllllllllIIIllIIlllIlIllllll.length;
        float lllllllllllllIIIllIIlllIlIllllIl = SocksMessageEncoder.lIlIIllIIlIlIl[0];
        while (lllIIllllIllIIl((int)lllllllllllllIIIllIIlllIlIllllIl, (int)lllllllllllllIIIllIIlllIlIlllllI)) {
            final char lllllllllllllIIIllIIlllIllIIlIlI = lllllllllllllIIIllIIlllIlIllllll[lllllllllllllIIIllIIlllIlIllllIl];
            lllllllllllllIIIllIIlllIllIIIlll.append((char)(lllllllllllllIIIllIIlllIllIIlIlI ^ lllllllllllllIIIllIIlllIllIIIllI[lllllllllllllIIIllIIlllIllIIIlIl % lllllllllllllIIIllIIlllIllIIIllI.length]));
            "".length();
            ++lllllllllllllIIIllIIlllIllIIIlIl;
            ++lllllllllllllIIIllIIlllIlIllllIl;
            "".length();
            if ((0x45 ^ 0xE ^ (0x69 ^ 0x26)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlllIllIIIlll);
    }
    
    private static boolean lllIIllllIllIIl(final int lllllllllllllIIIllIIlllIlIlIllII, final int lllllllllllllIIIllIIlllIlIlIlIll) {
        return lllllllllllllIIIllIIlllIlIlIllII < lllllllllllllIIIllIIlllIlIlIlIll;
    }
    
    private static String lllIIllllIlIllI(final String lllllllllllllIIIllIIlllIlIllIlII, final String lllllllllllllIIIllIIlllIlIllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlllIlIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlllIlIllIIll.getBytes(StandardCharsets.UTF_8)), SocksMessageEncoder.lIlIIllIIlIlIl[3]), "DES");
            final Cipher lllllllllllllIIIllIIlllIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlllIlIllIllI.init(SocksMessageEncoder.lIlIIllIIlIlIl[2], lllllllllllllIIIllIIlllIlIllIlll);
            return new String(lllllllllllllIIIllIIlllIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlllIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlllIlIllIlIl) {
            lllllllllllllIIIllIIlllIlIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIllllIlIlll() {
        (lIlIIllIIlIlII = new String[SocksMessageEncoder.lIlIIllIIlIlIl[2]])[SocksMessageEncoder.lIlIIllIIlIlIl[0]] = lllIIllllIlIlIl("CQ0kLyUFDyI3JRsFIjszFAEoIDMI", "ZBgdv");
        SocksMessageEncoder.lIlIIllIIlIlII[SocksMessageEncoder.lIlIIllIIlIlIl[1]] = lllIIllllIlIllI("t2JNR5pVJs0zlc10hdpFUv+ZD0sPCLpQ", "rsIak");
    }
}
