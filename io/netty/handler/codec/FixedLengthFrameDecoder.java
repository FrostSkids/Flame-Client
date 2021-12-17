// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class FixedLengthFrameDecoder extends ByteToMessageDecoder
{
    private static final /* synthetic */ int[] llIlllIIIlIIIl;
    private static final /* synthetic */ String[] llIlllIIIIllll;
    private final /* synthetic */ int frameLength;
    
    private static void lIIllIIlIIIlIllI() {
        (llIlllIIIlIIIl = new int[3])[0] = ((0x40 ^ 0x18) & ~(0x38 ^ 0x60));
        FixedLengthFrameDecoder.llIlllIIIlIIIl[1] = " ".length();
        FixedLengthFrameDecoder.llIlllIIIlIIIl[2] = "  ".length();
    }
    
    private static boolean lIIllIIlIIIlIlll(final int llllllllllllIllIIlIlIlIlIIlIlIII) {
        return llllllllllllIllIIlIlIlIlIIlIlIII <= 0;
    }
    
    @Override
    protected final void decode(final ChannelHandlerContext llllllllllllIllIIlIlIlIlIlIIllII, final ByteBuf llllllllllllIllIIlIlIlIlIlIIlIll, final List<Object> llllllllllllIllIIlIlIlIlIlIIIlIl) throws Exception {
        final Object llllllllllllIllIIlIlIlIlIlIIlIIl = this.decode(llllllllllllIllIIlIlIlIlIlIIllII, llllllllllllIllIIlIlIlIlIlIIlIll);
        if (lIIllIIlIIIllIII(llllllllllllIllIIlIlIlIlIlIIlIIl)) {
            llllllllllllIllIIlIlIlIlIlIIIlIl.add(llllllllllllIllIIlIlIlIlIlIIlIIl);
            "".length();
        }
    }
    
    private static String lIIllIIlIIIlIlII(final String llllllllllllIllIIlIlIlIlIIllIIll, final String llllllllllllIllIIlIlIlIlIIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIlIlIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIlIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIlIlIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIlIlIIllIlll.init(FixedLengthFrameDecoder.llIlllIIIlIIIl[2], llllllllllllIllIIlIlIlIlIIlllIII);
            return new String(llllllllllllIllIIlIlIlIlIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIlIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIlIlIIllIllI) {
            llllllllllllIllIIlIlIlIlIIllIllI.printStackTrace();
            return null;
        }
    }
    
    protected Object decode(final ChannelHandlerContext llllllllllllIllIIlIlIlIlIlIIIIII, final ByteBuf llllllllllllIllIIlIlIlIlIIllllll) throws Exception {
        if (lIIllIIlIIIllIIl(llllllllllllIllIIlIlIlIlIIllllll.readableBytes(), this.frameLength)) {
            return null;
        }
        return llllllllllllIllIIlIlIlIlIIllllll.readSlice(this.frameLength).retain();
    }
    
    public FixedLengthFrameDecoder(final int llllllllllllIllIIlIlIlIlIlIlIlIl) {
        if (lIIllIIlIIIlIlll(llllllllllllIllIIlIlIlIlIlIlIlIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(FixedLengthFrameDecoder.llIlllIIIIllll[FixedLengthFrameDecoder.llIlllIIIlIIIl[0]]).append(llllllllllllIllIIlIlIlIlIlIlIlIl)));
        }
        this.frameLength = llllllllllllIllIIlIlIlIlIlIlIlIl;
    }
    
    private static void lIIllIIlIIIlIlIl() {
        (llIlllIIIIllll = new String[FixedLengthFrameDecoder.llIlllIIIlIIIl[1]])[FixedLengthFrameDecoder.llIlllIIIlIIIl[0]] = lIIllIIlIIIlIlII("qcdlR/mjxT+nvyTGcSNGNlKCmWG6nJQy13GEAAWxsroPgqjvCpfBKpIy9qVd/9gL", "mpsua");
    }
    
    private static boolean lIIllIIlIIIllIIl(final int llllllllllllIllIIlIlIlIlIIlIllIl, final int llllllllllllIllIIlIlIlIlIIlIllII) {
        return llllllllllllIllIIlIlIlIlIIlIllIl < llllllllllllIllIIlIlIlIlIIlIllII;
    }
    
    private static boolean lIIllIIlIIIllIII(final Object llllllllllllIllIIlIlIlIlIIlIlIlI) {
        return llllllllllllIllIIlIlIlIlIIlIlIlI != null;
    }
    
    static {
        lIIllIIlIIIlIllI();
        lIIllIIlIIIlIlIl();
    }
}
