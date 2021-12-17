// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.File;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.RandomAccessFile;
import io.netty.buffer.ByteBuf;

public class ChunkedFile implements ChunkedInput<ByteBuf>
{
    private /* synthetic */ long offset;
    private static final /* synthetic */ String[] lIIlIIIIllllII;
    private final /* synthetic */ RandomAccessFile file;
    private final /* synthetic */ long endOffset;
    private final /* synthetic */ long startOffset;
    private static final /* synthetic */ int[] lIIlIIIlIIIIlI;
    private final /* synthetic */ int chunkSize;
    
    private static boolean llIIlIlIIlIllIl(final Object lllllllllllllIIlllIlIlIIIIIIIllI) {
        return lllllllllllllIIlllIlIlIIIIIIIllI == null;
    }
    
    private static void llIIlIlIIlIlIll() {
        (lIIlIIIlIIIIlI = new int[10])[0] = (0xFFFFF517 & 0x2AE8);
        ChunkedFile.lIIlIIIlIIIIlI[1] = ((0x89 ^ 0x9E ^ (0x59 ^ 0x64)) & (0x77 ^ 0x6E ^ (0x65 ^ 0x56) ^ -" ".length()));
        ChunkedFile.lIIlIIIlIIIIlI[2] = " ".length();
        ChunkedFile.lIIlIIIlIIIIlI[3] = "  ".length();
        ChunkedFile.lIIlIIIlIIIIlI[4] = "   ".length();
        ChunkedFile.lIIlIIIlIIIIlI[5] = (0x45 ^ 0x41);
        ChunkedFile.lIIlIIIlIIIIlI[6] = (0x6E ^ 0x76 ^ (0x4B ^ 0x56));
        ChunkedFile.lIIlIIIlIIIIlI[7] = (114 + 12 - 104 + 157 ^ 7 + 71 + 87 + 16);
        ChunkedFile.lIIlIIIlIIIIlI[8] = (0xC5 ^ 0xC2);
        ChunkedFile.lIIlIIIlIIIIlI[9] = (0x57 ^ 0x9 ^ (0x18 ^ 0x4E));
    }
    
    private static int llIIlIlIIllIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIIlIlIIllIlIl(final int lllllllllllllIIlllIlIlIIIIIIlIIl, final int lllllllllllllIIlllIlIlIIIIIIlIII) {
        return lllllllllllllIIlllIlIlIIIIIIlIIl < lllllllllllllIIlllIlIlIIIIIIlIII;
    }
    
    private static boolean llIIlIlIIllIIIl(final int lllllllllllllIIlllIlIlIIIIIIIIlI) {
        return lllllllllllllIIlllIlIlIIIIIIIIlI == 0;
    }
    
    private static int llIIlIlIIlIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String llIIlIlIIlIIIlI(String lllllllllllllIIlllIlIlIIIIIlIlII, final String lllllllllllllIIlllIlIlIIIIIlIIll) {
        lllllllllllllIIlllIlIlIIIIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlIlIIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlIlIIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIIlllIlIlIIIIIlIllI = lllllllllllllIIlllIlIlIIIIIlIIll.toCharArray();
        int lllllllllllllIIlllIlIlIIIIIlIlIl = ChunkedFile.lIIlIIIlIIIIlI[1];
        final boolean lllllllllllllIIlllIlIlIIIIIIllll = (Object)lllllllllllllIIlllIlIlIIIIIlIlII.toCharArray();
        final float lllllllllllllIIlllIlIlIIIIIIlllI = lllllllllllllIIlllIlIlIIIIIIllll.length;
        float lllllllllllllIIlllIlIlIIIIIIllIl = ChunkedFile.lIIlIIIlIIIIlI[1];
        while (llIIlIlIIllIlIl((int)lllllllllllllIIlllIlIlIIIIIIllIl, (int)lllllllllllllIIlllIlIlIIIIIIlllI)) {
            final char lllllllllllllIIlllIlIlIIIIIllIlI = lllllllllllllIIlllIlIlIIIIIIllll[lllllllllllllIIlllIlIlIIIIIIllIl];
            lllllllllllllIIlllIlIlIIIIIlIlll.append((char)(lllllllllllllIIlllIlIlIIIIIllIlI ^ lllllllllllllIIlllIlIlIIIIIlIllI[lllllllllllllIIlllIlIlIIIIIlIlIl % lllllllllllllIIlllIlIlIIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIIlllIlIlIIIIIlIlIl;
            ++lllllllllllllIIlllIlIlIIIIIIllIl;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlIlIIIIIlIlll);
    }
    
    @Override
    public ByteBuf readChunk(final ChannelHandlerContext lllllllllllllIIlllIlIlIIIIllllIl) throws Exception {
        final long lllllllllllllIIlllIlIlIIIlIIIIlI = this.offset;
        if (llIIlIlIIllIIll(llIIlIlIIllIIlI(lllllllllllllIIlllIlIlIIIlIIIIlI, this.endOffset))) {
            return null;
        }
        final int lllllllllllllIIlllIlIlIIIlIIIIIl = (int)Math.min(this.chunkSize, this.endOffset - lllllllllllllIIlllIlIlIIIlIIIIlI);
        final ByteBuf lllllllllllllIIlllIlIlIIIlIIIIII = lllllllllllllIIlllIlIlIIIIllllIl.alloc().heapBuffer(lllllllllllllIIlllIlIlIIIlIIIIIl);
        boolean lllllllllllllIIlllIlIlIIIIllllll = ChunkedFile.lIIlIIIlIIIIlI[2] != 0;
        try {
            this.file.readFully(lllllllllllllIIlllIlIlIIIlIIIIII.array(), lllllllllllllIIlllIlIlIIIlIIIIII.arrayOffset(), lllllllllllllIIlllIlIlIIIlIIIIIl);
            lllllllllllllIIlllIlIlIIIlIIIIII.writerIndex(lllllllllllllIIlllIlIlIIIlIIIIIl);
            "".length();
            this.offset = lllllllllllllIIlllIlIlIIIlIIIIlI + lllllllllllllIIlllIlIlIIIlIIIIIl;
            lllllllllllllIIlllIlIlIIIIllllll = (ChunkedFile.lIIlIIIlIIIIlI[1] != 0);
            final long lllllllllllllIIlllIlIlIIIIlllIII = (long)lllllllllllllIIlllIlIlIIIlIIIIII;
            return (ByteBuf)lllllllllllllIIlllIlIlIIIIlllIII;
        }
        finally {
            if (llIIlIlIIllIlII(lllllllllllllIIlllIlIlIIIIllllll ? 1 : 0)) {
                lllllllllllllIIlllIlIlIIIlIIIIII.release();
                "".length();
            }
        }
    }
    
    public ChunkedFile(final File lllllllllllllIIlllIlIlIIIllllIll, final int lllllllllllllIIlllIlIlIIIllllIlI) throws IOException {
        this(new RandomAccessFile(lllllllllllllIIlllIlIlIIIllllIll, ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[1]]), lllllllllllllIIlllIlIlIIIllllIlI);
    }
    
    public ChunkedFile(final RandomAccessFile lllllllllllllIIlllIlIlIIIllIllII, final int lllllllllllllIIlllIlIlIIIllIlllI) throws IOException {
        this(lllllllllllllIIlllIlIlIIIllIllII, 0L, lllllllllllllIIlllIlIlIIIllIllII.length(), lllllllllllllIIlllIlIlIIIllIlllI);
    }
    
    public ChunkedFile(final File lllllllllllllIIlllIlIlIIlIIIIIll) throws IOException {
        this(lllllllllllllIIlllIlIlIIlIIIIIll, ChunkedFile.lIIlIIIlIIIIlI[0]);
    }
    
    private static void llIIlIlIIlIIlll() {
        (lIIlIIIIllllII = new String[ChunkedFile.lIIlIIIlIIIIlI[9]])[ChunkedFile.lIIlIIIlIIIIlI[1]] = llIIlIlIIlIIIIl("2snoVu1F+fk=", "GRomB");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[2]] = llIIlIlIIlIIIlI("LBsLHw==", "Jrgzb");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[3]] = llIIlIlIIlIIIlI("DiM0IhYVf3I=", "aERQs");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[4]] = llIIlIlIIlIIIlI("ZHo9MRQhMSwsAH5yaGkLNnI/OwElJj07TQ==", "DRXId");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[5]] = llIIlIlIIlIIIIl("kQndFtf/Ag6bAEeyIa2lPA==", "OtRYg");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[6]] = llIIlIlIIlIIIlI("ZmMfFBIjKA4JBnxrSkwNNGsdHgcnPx8eSw==", "FKzlb");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[7]] = llIIlIlIIlIIIlI("JQUiOgYVBC0xV2Y=", "FmWTm");
        ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[8]] = llIIlIlIIlIIIIl("iELtHk6cqLNfRhwBmGC2Urr+5l6vMFNqnAg5JYEKlz4=", "TEpdz");
    }
    
    private static boolean llIIlIlIIlIlllI(final int lllllllllllllIIlllIlIIlllllllllI) {
        return lllllllllllllIIlllIlIIlllllllllI < 0;
    }
    
    private static String llIIlIlIIlIIIIl(final String lllllllllllllIIlllIlIlIIIIlIIlll, final String lllllllllllllIIlllIlIlIIIIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIlIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlIlIIIIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlIlIIIIlIlIll.init(ChunkedFile.lIIlIIIlIIIIlI[3], lllllllllllllIIlllIlIlIIIIlIllII);
            return new String(lllllllllllllIIlllIlIlIIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIlIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIlIIIIlIlIlI) {
            lllllllllllllIIlllIlIlIIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIlIlIIlIlIll();
        llIIlIlIIlIIlll();
    }
    
    private static boolean llIIlIlIIllIIll(final int lllllllllllllIIlllIlIlIIIIIIIIII) {
        return lllllllllllllIIlllIlIlIIIIIIIIII >= 0;
    }
    
    private static boolean llIIlIlIIlIllll(final int lllllllllllllIIlllIlIIllllllllII) {
        return lllllllllllllIIlllIlIIllllllllII <= 0;
    }
    
    public long endOffset() {
        return this.endOffset;
    }
    
    public long currentOffset() {
        return this.offset;
    }
    
    public long startOffset() {
        return this.startOffset;
    }
    
    private static boolean llIIlIlIIllIlII(final int lllllllllllllIIlllIlIlIIIIIIIlII) {
        return lllllllllllllIIlllIlIlIIIIIIIlII != 0;
    }
    
    @Override
    public boolean isEndOfInput() throws Exception {
        int n;
        if (!llIIlIlIIlIlllI(llIIlIlIIllIIII(this.offset, this.endOffset)) || llIIlIlIIllIIIl(this.file.getChannel().isOpen() ? 1 : 0)) {
            n = ChunkedFile.lIIlIIIlIIIIlI[2];
            "".length();
            if (null != null) {
                return ((0x89 ^ 0xB2) & ~(0x90 ^ 0xAB)) != 0x0;
            }
        }
        else {
            n = ChunkedFile.lIIlIIIlIIIIlI[1];
        }
        return n != 0;
    }
    
    public ChunkedFile(final RandomAccessFile lllllllllllllIIlllIlIlIIIlIlllll, final long lllllllllllllIIlllIlIlIIIllIIIll, final long lllllllllllllIIlllIlIlIIIllIIIlI, final int lllllllllllllIIlllIlIlIIIlIlllII) throws IOException {
        if (llIIlIlIIlIllIl(lllllllllllllIIlllIlIlIIIlIlllll)) {
            throw new NullPointerException(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[2]]);
        }
        if (llIIlIlIIlIlllI(llIIlIlIIlIllII(lllllllllllllIIlllIlIlIIIllIIIll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[3]]).append(lllllllllllllIIlllIlIlIIIllIIIll).append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[4]])));
        }
        if (llIIlIlIIlIlllI(llIIlIlIIlIllII(lllllllllllllIIlllIlIlIIIllIIIlI, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[5]]).append(lllllllllllllIIlllIlIlIIIllIIIlI).append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[6]])));
        }
        if (llIIlIlIIlIllll(lllllllllllllIIlllIlIlIIIlIlllII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[7]]).append(lllllllllllllIIlllIlIlIIIlIlllII).append(ChunkedFile.lIIlIIIIllllII[ChunkedFile.lIIlIIIlIIIIlI[8]])));
        }
        this.file = lllllllllllllIIlllIlIlIIIlIlllll;
        this.startOffset = lllllllllllllIIlllIlIlIIIllIIIll;
        this.offset = lllllllllllllIIlllIlIlIIIllIIIll;
        this.endOffset = lllllllllllllIIlllIlIlIIIllIIIll + lllllllllllllIIlllIlIlIIIllIIIlI;
        this.chunkSize = lllllllllllllIIlllIlIlIIIlIlllII;
        lllllllllllllIIlllIlIlIIIlIlllll.seek(lllllllllllllIIlllIlIlIIIllIIIll);
    }
    
    @Override
    public void close() throws Exception {
        this.file.close();
    }
    
    public ChunkedFile(final RandomAccessFile lllllllllllllIIlllIlIlIIIlllIllI) throws IOException {
        this(lllllllllllllIIlllIlIlIIIlllIllI, ChunkedFile.lIIlIIIlIIIIlI[0]);
    }
    
    private static int llIIlIlIIllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
