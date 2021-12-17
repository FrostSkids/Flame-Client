// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import java.io.InputStream;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.PushbackInputStream;
import io.netty.buffer.ByteBuf;

public class ChunkedStream implements ChunkedInput<ByteBuf>
{
    private static final /* synthetic */ int[] lIlIIIlIllIIlI;
    private static final /* synthetic */ String[] lIlIIIlIlIlllI;
    private /* synthetic */ long offset;
    private final /* synthetic */ PushbackInputStream in;
    private final /* synthetic */ int chunkSize;
    
    private static boolean lllIIIlIlllIlII(final int lllllllllllllIIIlllllIIlIIlIlIII) {
        return lllllllllllllIIIlllllIIlIIlIlIII <= 0;
    }
    
    private static boolean lllIIIlIlllIlll(final int lllllllllllllIIIlllllIIlIIllIIIl, final int lllllllllllllIIIlllllIIlIIllIIII) {
        return lllllllllllllIIIlllllIIlIIllIIIl < lllllllllllllIIIlllllIIlIIllIIII;
    }
    
    private static String lllIIIlIllIIlIl(final String lllllllllllllIIIlllllIIlIIlllIIl, final String lllllllllllllIIIlllllIIlIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllllIIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllllIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllllIIlIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllllIIlIIlllIll.init(ChunkedStream.lIlIIIlIllIIlI[3], lllllllllllllIIIlllllIIlIIllllII);
            return new String(lllllllllllllIIIlllllIIlIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllllIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllllIIlIIlllIlI) {
            lllllllllllllIIIlllllIIlIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isEndOfInput() throws Exception {
        final int lllllllllllllIIIlllllIIlIllllIll = this.in.read();
        if (lllIIIlIlllIllI(lllllllllllllIIIlllllIIlIllllIll)) {
            return ChunkedStream.lIlIIIlIllIIlI[2] != 0;
        }
        this.in.unread(lllllllllllllIIIlllllIIlIllllIll);
        return ChunkedStream.lIlIIIlIllIIlI[1] != 0;
    }
    
    public ChunkedStream(final InputStream lllllllllllllIIIlllllIIllIIIlIll) {
        this(lllllllllllllIIIlllllIIllIIIlIll, ChunkedStream.lIlIIIlIllIIlI[0]);
    }
    
    public ChunkedStream(final InputStream lllllllllllllIIIlllllIIllIIIIllI, final int lllllllllllllIIIlllllIIllIIIIlIl) {
        if (lllIIIlIlllIIll(lllllllllllllIIIlllllIIllIIIIllI)) {
            throw new NullPointerException(ChunkedStream.lIlIIIlIlIlllI[ChunkedStream.lIlIIIlIllIIlI[1]]);
        }
        if (lllIIIlIlllIlII(lllllllllllllIIIlllllIIllIIIIlIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedStream.lIlIIIlIlIlllI[ChunkedStream.lIlIIIlIllIIlI[2]]).append(lllllllllllllIIIlllllIIllIIIIlIl).append(ChunkedStream.lIlIIIlIlIlllI[ChunkedStream.lIlIIIlIllIIlI[3]])));
        }
        if (lllIIIlIlllIlIl((lllllllllllllIIIlllllIIllIIIIllI instanceof PushbackInputStream) ? 1 : 0)) {
            this.in = (PushbackInputStream)lllllllllllllIIIlllllIIllIIIIllI;
            "".length();
            if ("   ".length() < " ".length()) {
                throw null;
            }
        }
        else {
            this.in = new PushbackInputStream(lllllllllllllIIIlllllIIllIIIIllI);
        }
        this.chunkSize = lllllllllllllIIIlllllIIllIIIIlIl;
    }
    
    public long transferredBytes() {
        return this.offset;
    }
    
    private static void lllIIIlIllIllIl() {
        (lIlIIIlIlIlllI = new String[ChunkedStream.lIlIIIlIllIIlI[4]])[ChunkedStream.lIlIIIlIllIIlI[1]] = lllIIIlIllIIlII("BwA=", "nnYSi");
        ChunkedStream.lIlIIIlIlIlllI[ChunkedStream.lIlIIIlIllIIlI[2]] = lllIIIlIllIIlIl("XJubBFiCWnCj4QbV9o2Apg==", "cqnVP");
        ChunkedStream.lIlIIIlIlIlllI[ChunkedStream.lIlIIIlIllIIlI[3]] = lllIIIlIllIIlIl("ZVRseV7+YDTgm+3QAlpwZhGS33ZTn30HJTKqrIIHS2M=", "qpLWu");
    }
    
    @Override
    public void close() throws Exception {
        this.in.close();
    }
    
    static {
        lllIIIlIlllIIlI();
        lllIIIlIllIllIl();
        DEFAULT_CHUNK_SIZE = ChunkedStream.lIlIIIlIllIIlI[0];
    }
    
    private static boolean lllIIIlIlllIlIl(final int lllllllllllllIIIlllllIIlIIlIllII) {
        return lllllllllllllIIIlllllIIlIIlIllII != 0;
    }
    
    private static void lllIIIlIlllIIlI() {
        (lIlIIIlIllIIlI = new int[5])[0] = (0xFFFFAB6C & 0x7493);
        ChunkedStream.lIlIIIlIllIIlI[1] = ((0x3E ^ 0x42 ^ (0x7D ^ 0x62)) & (0xEC ^ 0xB6 ^ (0x68 ^ 0x51) ^ -" ".length()) & (((72 + 96 + 30 + 27 ^ 146 + 120 - 197 + 91) & (0xB ^ 0x7E ^ (0x49 ^ 0x7D) ^ -" ".length())) ^ -" ".length()));
        ChunkedStream.lIlIIIlIllIIlI[2] = " ".length();
        ChunkedStream.lIlIIIlIllIIlI[3] = "  ".length();
        ChunkedStream.lIlIIIlIllIIlI[4] = "   ".length();
    }
    
    private static boolean lllIIIlIlllIIll(final Object lllllllllllllIIIlllllIIlIIlIlllI) {
        return lllllllllllllIIIlllllIIlIIlIlllI == null;
    }
    
    @Override
    public ByteBuf readChunk(final ChannelHandlerContext lllllllllllllIIIlllllIIlIllIlIll) throws Exception {
        if (lllIIIlIlllIlIl(this.isEndOfInput() ? 1 : 0)) {
            return null;
        }
        final int lllllllllllllIIIlllllIIlIllIlIlI = this.in.available();
        int lllllllllllllIIIlllllIIlIllIlIIl;
        if (lllIIIlIlllIlII(lllllllllllllIIIlllllIIlIllIlIlI)) {
            final int lllllllllllllIIIlllllIIlIllIllIl = this.chunkSize;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlllllIIlIllIlIIl = Math.min(this.chunkSize, this.in.available());
        }
        boolean lllllllllllllIIIlllllIIlIllIlIII = ChunkedStream.lIlIIIlIllIIlI[2] != 0;
        final ByteBuf lllllllllllllIIIlllllIIlIllIIlll = lllllllllllllIIIlllllIIlIllIlIll.alloc().buffer(lllllllllllllIIIlllllIIlIllIlIIl);
        try {
            this.offset += lllllllllllllIIIlllllIIlIllIIlll.writeBytes(this.in, lllllllllllllIIIlllllIIlIllIlIIl);
            lllllllllllllIIIlllllIIlIllIlIII = (ChunkedStream.lIlIIIlIllIIlI[1] != 0);
            final short lllllllllllllIIIlllllIIlIllIIIII = (short)lllllllllllllIIIlllllIIlIllIIlll;
            return (ByteBuf)lllllllllllllIIIlllllIIlIllIIIII;
        }
        finally {
            if (lllIIIlIlllIlIl(lllllllllllllIIIlllllIIlIllIlIII ? 1 : 0)) {
                lllllllllllllIIIlllllIIlIllIIlll.release();
                "".length();
            }
        }
    }
    
    private static boolean lllIIIlIlllIllI(final int lllllllllllllIIIlllllIIlIIlIlIlI) {
        return lllllllllllllIIIlllllIIlIIlIlIlI < 0;
    }
    
    private static String lllIIIlIllIIlII(String lllllllllllllIIIlllllIIlIlIIlIIl, final String lllllllllllllIIIlllllIIlIlIIlIII) {
        lllllllllllllIIIlllllIIlIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlllllIIlIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllllIIlIlIIllII = new StringBuilder();
        final char[] lllllllllllllIIIlllllIIlIlIIlIll = lllllllllllllIIIlllllIIlIlIIlIII.toCharArray();
        int lllllllllllllIIIlllllIIlIlIIlIlI = ChunkedStream.lIlIIIlIllIIlI[1];
        final char lllllllllllllIIIlllllIIlIlIIIlII = (Object)lllllllllllllIIIlllllIIlIlIIlIIl.toCharArray();
        final long lllllllllllllIIIlllllIIlIlIIIIll = lllllllllllllIIIlllllIIlIlIIIlII.length;
        boolean lllllllllllllIIIlllllIIlIlIIIIlI = ChunkedStream.lIlIIIlIllIIlI[1] != 0;
        while (lllIIIlIlllIlll(lllllllllllllIIIlllllIIlIlIIIIlI ? 1 : 0, (int)lllllllllllllIIIlllllIIlIlIIIIll)) {
            final char lllllllllllllIIIlllllIIlIlIIllll = lllllllllllllIIIlllllIIlIlIIIlII[lllllllllllllIIIlllllIIlIlIIIIlI];
            lllllllllllllIIIlllllIIlIlIIllII.append((char)(lllllllllllllIIIlllllIIlIlIIllll ^ lllllllllllllIIIlllllIIlIlIIlIll[lllllllllllllIIIlllllIIlIlIIlIlI % lllllllllllllIIIlllllIIlIlIIlIll.length]));
            "".length();
            ++lllllllllllllIIIlllllIIlIlIIlIlI;
            ++lllllllllllllIIIlllllIIlIlIIIIlI;
            "".length();
            if (((0x41 ^ 0x59) & ~(0x80 ^ 0x98)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllllIIlIlIIllII);
    }
}
