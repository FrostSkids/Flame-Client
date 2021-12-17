// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.handler.codec.compression.ZlibCodecFactory;
import io.netty.handler.codec.compression.ZlibWrapper;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HttpContentDecompressor extends HttpContentDecoder
{
    private static final /* synthetic */ String[] lIIlIIlIIIlIlI;
    private static final /* synthetic */ int[] lIIlIIlIIIlIll;
    private final /* synthetic */ boolean strict;
    
    private static String llIIllIIIIIIlIl(final String lllllllllllllIIlllIIIIlllIIlIlll, final String lllllllllllllIIlllIIIIlllIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIlllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8)), HttpContentDecompressor.lIIlIIlIIIlIll[5]), "DES");
            final Cipher lllllllllllllIIlllIIIIlllIIllIll = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIIlllIIllIll.init(HttpContentDecompressor.lIIlIIlIIIlIll[2], lllllllllllllIIlllIIIIlllIIlllII);
            return new String(lllllllllllllIIlllIIIIlllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIlllIIllIlI) {
            lllllllllllllIIlllIIIIlllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllIIIIIllII(final int lllllllllllllIIlllIIIIlllIIlIIlI) {
        return lllllllllllllIIlllIIIIlllIIlIIlI != 0;
    }
    
    private static String llIIllIIIIIIllI(final String lllllllllllllIIlllIIIIlllIlIIllI, final String lllllllllllllIIlllIIIIlllIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIlllIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIlllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIIlllIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIIlllIlIlIII.init(HttpContentDecompressor.lIIlIIlIIIlIll[2], lllllllllllllIIlllIIIIlllIlIlIIl);
            return new String(lllllllllllllIIlllIIIIlllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIlllIlIIlll) {
            lllllllllllllIIlllIIIIlllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    public HttpContentDecompressor() {
        this((boolean)(HttpContentDecompressor.lIIlIIlIIIlIll[0] != 0));
    }
    
    public HttpContentDecompressor(final boolean lllllllllllllIIlllIIIIlllIlllIII) {
        this.strict = lllllllllllllIIlllIIIIlllIlllIII;
    }
    
    private static boolean llIIllIIIIIlIll(final int lllllllllllllIIlllIIIIlllIIlIIII) {
        return lllllllllllllIIlllIIIIlllIIlIIII == 0;
    }
    
    private static void llIIllIIIIIlIIl() {
        (lIIlIIlIIIlIlI = new String[HttpContentDecompressor.lIIlIIlIIIlIll[4]])[HttpContentDecompressor.lIIlIIlIIIlIll[0]] = llIIllIIIIIIlIl("erpF70lE0z8=", "lyDuO");
        HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[1]] = llIIllIIIIIIllI("KONWq8NNPKM=", "LtoNg");
        HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[2]] = llIIllIIIIIIlIl("702H8ejh5ag=", "UDykw");
        HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[3]] = llIIllIIIIIIlIl("Fz2hBVZHe1UsJryYyvONAQ==", "NITxp");
    }
    
    @Override
    protected EmbeddedChannel newContentDecoder(final String lllllllllllllIIlllIIIIlllIllIIIl) throws Exception {
        if (!llIIllIIIIIlIll(HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[0]].equalsIgnoreCase(lllllllllllllIIlllIIIIlllIllIIIl) ? 1 : 0) || llIIllIIIIIllII(HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[1]].equalsIgnoreCase(lllllllllllllIIlllIIIIlllIllIIIl) ? 1 : 0)) {
            final ChannelHandler[] lllllllllllllIIllIIIlIIlllIllIII = new ChannelHandler[HttpContentDecompressor.lIIlIIlIIIlIll[1]];
            lllllllllllllIIllIIIlIIlllIllIII[HttpContentDecompressor.lIIlIIlIIIlIll[0]] = ZlibCodecFactory.newZlibDecoder(ZlibWrapper.GZIP);
            return new EmbeddedChannel(lllllllllllllIIllIIIlIIlllIllIII);
        }
        if (!llIIllIIIIIlIll(HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[2]].equalsIgnoreCase(lllllllllllllIIlllIIIIlllIllIIIl) ? 1 : 0) || llIIllIIIIIllII(HttpContentDecompressor.lIIlIIlIIIlIlI[HttpContentDecompressor.lIIlIIlIIIlIll[3]].equalsIgnoreCase(lllllllllllllIIlllIIIIlllIllIIIl) ? 1 : 0)) {
            ZlibWrapper lllllllllllllIIlllIIIIlllIllIIll;
            if (llIIllIIIIIllII(this.strict ? 1 : 0)) {
                final ZlibWrapper lllllllllllllIIlllIIIIlllIllIlII = ZlibWrapper.ZLIB;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllIIIIlllIllIIll = ZlibWrapper.ZLIB_OR_NONE;
            }
            final ChannelHandler[] lllllllllllllIIllIIIlIIlllIllIII2 = new ChannelHandler[HttpContentDecompressor.lIIlIIlIIIlIll[1]];
            lllllllllllllIIllIIIlIIlllIllIII2[HttpContentDecompressor.lIIlIIlIIIlIll[0]] = ZlibCodecFactory.newZlibDecoder(lllllllllllllIIlllIIIIlllIllIIll);
            return new EmbeddedChannel(lllllllllllllIIllIIIlIIlllIllIII2);
        }
        return null;
    }
    
    static {
        llIIllIIIIIlIlI();
        llIIllIIIIIlIIl();
    }
    
    private static void llIIllIIIIIlIlI() {
        (lIIlIIlIIIlIll = new int[6])[0] = ((7 + 130 - 135 + 133 ^ 86 + 91 - 134 + 94) & (0xA4 ^ 0xC3 ^ (0xF4 ^ 0x9D) ^ -" ".length()));
        HttpContentDecompressor.lIIlIIlIIIlIll[1] = " ".length();
        HttpContentDecompressor.lIIlIIlIIIlIll[2] = "  ".length();
        HttpContentDecompressor.lIIlIIlIIIlIll[3] = "   ".length();
        HttpContentDecompressor.lIIlIIlIIIlIll[4] = (0x78 ^ 0x7C);
        HttpContentDecompressor.lIIlIIlIIIlIll[5] = (113 + 146 - 228 + 117 ^ 78 + 100 - 59 + 37);
    }
}
