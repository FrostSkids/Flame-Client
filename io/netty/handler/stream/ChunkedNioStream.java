// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import io.netty.buffer.ByteBuf;

public class ChunkedNioStream implements ChunkedInput<ByteBuf>
{
    private final /* synthetic */ ReadableByteChannel in;
    private static final /* synthetic */ String[] lllIIlIlIlIlII;
    private static final /* synthetic */ int[] lllIIlIlIllllI;
    private final /* synthetic */ ByteBuffer byteBuffer;
    private /* synthetic */ long offset;
    private final /* synthetic */ int chunkSize;
    
    public ChunkedNioStream(final ReadableByteChannel llllllllllllIlIllllIIllllIllIIlI) {
        this(llllllllllllIlIllllIIllllIllIIlI, ChunkedNioStream.lllIIlIlIllllI[0]);
    }
    
    private static boolean lIIllllllIllllII(final int llllllllllllIlIllllIIlllIIlIlIII, final int llllllllllllIlIllllIIlllIIlIIlll) {
        return llllllllllllIlIllllIIlllIIlIlIII == llllllllllllIlIllllIIlllIIlIIlll;
    }
    
    private static boolean lIIllllllIllIllI(final Object llllllllllllIlIllllIIlllIIlIIIIl) {
        return llllllllllllIlIllllIIlllIIlIIIIl == null;
    }
    
    private static String lIIllllllIlIIlII(final String llllllllllllIlIllllIIlllIIlIlllI, final String llllllllllllIlIllllIIlllIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIlllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlllIIlIllll.getBytes(StandardCharsets.UTF_8)), ChunkedNioStream.lllIIlIlIllllI[5]), "DES");
            final Cipher llllllllllllIlIllllIIlllIIllIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllllIIlllIIllIIlI.init(ChunkedNioStream.lllIIlIlIllllI[3], llllllllllllIlIllllIIlllIIllIIll);
            return new String(llllllllllllIlIllllIIlllIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlllIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIlllIIllIIIl) {
            llllllllllllIlIllllIIlllIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    public ChunkedNioStream(final ReadableByteChannel llllllllllllIlIllllIIllllIIlllIl, final int llllllllllllIlIllllIIllllIIllIll) {
        if (lIIllllllIllIllI(llllllllllllIlIllllIIllllIIlllIl)) {
            throw new NullPointerException(ChunkedNioStream.lllIIlIlIlIlII[ChunkedNioStream.lllIIlIlIllllI[1]]);
        }
        if (lIIllllllIllIlll(llllllllllllIlIllllIIllllIIllIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedNioStream.lllIIlIlIlIlII[ChunkedNioStream.lllIIlIlIllllI[2]]).append(llllllllllllIlIllllIIllllIIllIll).append(ChunkedNioStream.lllIIlIlIlIlII[ChunkedNioStream.lllIIlIlIllllI[3]])));
        }
        this.in = llllllllllllIlIllllIIllllIIlllIl;
        this.offset = 0L;
        this.chunkSize = llllllllllllIlIllllIIllllIIllIll;
        this.byteBuffer = ByteBuffer.allocate(llllllllllllIlIllllIIllllIIllIll);
    }
    
    private static boolean lIIllllllIlllIII(final int llllllllllllIlIllllIIlllIIIllIIl) {
        return llllllllllllIlIllllIIlllIIIllIIl > 0;
    }
    
    @Override
    public boolean isEndOfInput() throws Exception {
        if (lIIllllllIlllIII(this.byteBuffer.position())) {
            return ChunkedNioStream.lllIIlIlIllllI[1] != 0;
        }
        if (!lIIllllllIlllIIl(this.in.isOpen() ? 1 : 0)) {
            return ChunkedNioStream.lllIIlIlIllllI[2] != 0;
        }
        final int llllllllllllIlIllllIIllllIIlIIII = this.in.read(this.byteBuffer);
        if (lIIllllllIlllIlI(llllllllllllIlIllllIIllllIIlIIII)) {
            return ChunkedNioStream.lllIIlIlIllllI[2] != 0;
        }
        this.offset += llllllllllllIlIllllIIllllIIlIIII;
        return ChunkedNioStream.lllIIlIlIllllI[1] != 0;
    }
    
    public long transferredBytes() {
        return this.offset;
    }
    
    private static boolean lIIllllllIllIlll(final int llllllllllllIlIllllIIlllIIIllIll) {
        return llllllllllllIlIllllIIlllIIIllIll <= 0;
    }
    
    @Override
    public ByteBuf readChunk(final ChannelHandlerContext llllllllllllIlIllllIIlllIllIlIII) throws Exception {
        if (lIIllllllIlllIIl(this.isEndOfInput() ? 1 : 0)) {
            return null;
        }
        int llllllllllllIlIllllIIlllIllIlllI = this.byteBuffer.position();
        do {
            final int llllllllllllIlIllllIIlllIlllIIlI = this.in.read(this.byteBuffer);
            if (lIIllllllIlllIlI(llllllllllllIlIllllIIlllIlllIIlI)) {
                "".length();
                if (" ".length() > (0x4B ^ 0x4F)) {
                    return null;
                }
            }
            else {
                llllllllllllIlIllllIIlllIllIlllI += llllllllllllIlIllllIIlllIlllIIlI;
                this.offset += llllllllllllIlIllllIIlllIlllIIlI;
                if (!lIIllllllIllllII(llllllllllllIlIllllIIlllIllIlllI, this.chunkSize)) {
                    "".length();
                    continue;
                }
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
            }
            this.byteBuffer.flip();
            "".length();
            boolean llllllllllllIlIllllIIlllIllIllII = ChunkedNioStream.lllIIlIlIllllI[2] != 0;
            final ByteBuf llllllllllllIlIllllIIlllIllIlIll = llllllllllllIlIllllIIlllIllIlIII.alloc().buffer(this.byteBuffer.remaining());
            try {
                llllllllllllIlIllllIIlllIllIlIll.writeBytes(this.byteBuffer);
                "".length();
                this.byteBuffer.clear();
                "".length();
                llllllllllllIlIllllIIlllIllIllII = (ChunkedNioStream.lllIIlIlIllllI[1] != 0);
                final int llllllllllllIlIllllIIlllIllIIlII = (int)llllllllllllIlIllllIIlllIllIlIll;
                return (ByteBuf)llllllllllllIlIllllIIlllIllIIlII;
            }
            finally {
                if (lIIllllllIlllIIl(llllllllllllIlIllllIIlllIllIllII ? 1 : 0)) {
                    llllllllllllIlIllllIIlllIllIlIll.release();
                    "".length();
                }
            }
        } while (((0x63 ^ 0x6F ^ (0xE2 ^ 0xAE)) & (0xA9 ^ 0x9B ^ (0xD ^ 0x7F) ^ -" ".length())) != " ".length());
        return null;
    }
    
    private static void lIIllllllIllIlIl() {
        (lllIIlIlIllllI = new int[6])[0] = (0xFFFFABF2 & 0x740D);
        ChunkedNioStream.lllIIlIlIllllI[1] = ((0x8 ^ 0x35) & ~(0xF8 ^ 0xC5));
        ChunkedNioStream.lllIIlIlIllllI[2] = " ".length();
        ChunkedNioStream.lllIIlIlIllllI[3] = "  ".length();
        ChunkedNioStream.lllIIlIlIllllI[4] = "   ".length();
        ChunkedNioStream.lllIIlIlIllllI[5] = (87 + 57 - 134 + 123 ^ 70 + 3 + 34 + 34);
    }
    
    private static boolean lIIllllllIlllIIl(final int llllllllllllIlIllllIIlllIIIlllll) {
        return llllllllllllIlIllllIIlllIIIlllll != 0;
    }
    
    static {
        lIIllllllIllIlIl();
        lIIllllllIlIIllI();
    }
    
    private static String lIIllllllIlIIIll(final String llllllllllllIlIllllIIlllIIlllIll, final String llllllllllllIlIllllIIlllIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIlllIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlllIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIlllIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIlllIIllllll.init(ChunkedNioStream.lllIIlIlIllllI[3], llllllllllllIlIllllIIlllIlIIIIII);
            return new String(llllllllllllIlIllllIIlllIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIlllIIlllllI) {
            llllllllllllIlIllllIIlllIIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllllIlllIlI(final int llllllllllllIlIllllIIlllIIIlllIl) {
        return llllllllllllIlIllllIIlllIIIlllIl < 0;
    }
    
    @Override
    public void close() throws Exception {
        this.in.close();
    }
    
    private static void lIIllllllIlIIllI() {
        (lllIIlIlIlIlII = new String[ChunkedNioStream.lllIIlIlIllllI[4]])[ChunkedNioStream.lllIIlIlIllllI[1]] = lIIllllllIlIIIll("T3Bu/CFewmQ=", "FnoFp");
        ChunkedNioStream.lllIIlIlIlIlII[ChunkedNioStream.lllIIlIlIllllI[2]] = lIIllllllIlIIlII("N5uojg3dohfIfBdt4kvLVA==", "qBwVC");
        ChunkedNioStream.lllIIlIlIlIlII[ChunkedNioStream.lllIIlIlIllllI[3]] = lIIllllllIlIIlIl("cVsOLBk0EB8xDWtTCnQZPgACIAAnFks9ByUWDDEbeA==", "QskTi");
    }
    
    private static boolean lIIllllllIllllll(final int llllllllllllIlIllllIIlllIIlIIlII, final int llllllllllllIlIllllIIlllIIlIIIll) {
        return llllllllllllIlIllllIIlllIIlIIlII < llllllllllllIlIllllIIlllIIlIIIll;
    }
    
    private static String lIIllllllIlIIlIl(String llllllllllllIlIllllIIlllIlIIllIl, final String llllllllllllIlIllllIIlllIlIlIIIl) {
        llllllllllllIlIllllIIlllIlIIllIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIIlllIlIIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIlllIlIlIIII = new StringBuilder();
        final char[] llllllllllllIlIllllIIlllIlIIllll = llllllllllllIlIllllIIlllIlIlIIIl.toCharArray();
        int llllllllllllIlIllllIIlllIlIIlllI = ChunkedNioStream.lllIIlIlIllllI[1];
        final boolean llllllllllllIlIllllIIlllIlIIlIII = (Object)((String)llllllllllllIlIllllIIlllIlIIllIl).toCharArray();
        final double llllllllllllIlIllllIIlllIlIIIlll = llllllllllllIlIllllIIlllIlIIlIII.length;
        boolean llllllllllllIlIllllIIlllIlIIIllI = ChunkedNioStream.lllIIlIlIllllI[1] != 0;
        while (lIIllllllIllllll(llllllllllllIlIllllIIlllIlIIIllI ? 1 : 0, (int)llllllllllllIlIllllIIlllIlIIIlll)) {
            final char llllllllllllIlIllllIIlllIlIlIIll = llllllllllllIlIllllIIlllIlIIlIII[llllllllllllIlIllllIIlllIlIIIllI];
            llllllllllllIlIllllIIlllIlIlIIII.append((char)(llllllllllllIlIllllIIlllIlIlIIll ^ llllllllllllIlIllllIIlllIlIIllll[llllllllllllIlIllllIIlllIlIIlllI % llllllllllllIlIllllIIlllIlIIllll.length]));
            "".length();
            ++llllllllllllIlIllllIIlllIlIIlllI;
            ++llllllllllllIlIllllIIlllIlIIIllI;
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIlllIlIlIIII);
    }
}
