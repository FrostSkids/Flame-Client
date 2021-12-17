// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import java.nio.channels.ScatteringByteChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.io.File;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.channels.FileChannel;
import io.netty.buffer.ByteBuf;

public class ChunkedNioFile implements ChunkedInput<ByteBuf>
{
    private final /* synthetic */ long endOffset;
    private static final /* synthetic */ int[] lllIIlIIIIlIIl;
    private final /* synthetic */ int chunkSize;
    private final /* synthetic */ FileChannel in;
    private final /* synthetic */ long startOffset;
    private /* synthetic */ long offset;
    private static final /* synthetic */ String[] lllIIlIIIIlIII;
    
    public long currentOffset() {
        return this.offset;
    }
    
    public ChunkedNioFile(final FileChannel llllllllllllIlIlllllIllIIlIIlIII, final int llllllllllllIlIlllllIllIIlIIIlII) throws IOException {
        this(llllllllllllIlIlllllIllIIlIIlIII, 0L, llllllllllllIlIlllllIllIIlIIlIII.size(), llllllllllllIlIlllllIllIIlIIIlII);
    }
    
    private static boolean lIIllllIlIlIllII(final int llllllllllllIlIlllllIlIlllIIIIII) {
        return llllllllllllIlIlllllIlIlllIIIIII <= 0;
    }
    
    private static boolean lIIllllIlIlIllll(final int llllllllllllIlIlllllIlIlllIIIllI) {
        return llllllllllllIlIlllllIlIlllIIIllI == 0;
    }
    
    private static boolean lIIllllIlIllIIll(final int llllllllllllIlIlllllIlIlllIIllIl, final int llllllllllllIlIlllllIlIlllIIllII) {
        return llllllllllllIlIlllllIlIlllIIllIl < llllllllllllIlIlllllIlIlllIIllII;
    }
    
    private static void lIIllllIlIlIIlll() {
        (lllIIlIIIIlIII = new String[ChunkedNioFile.lllIIlIIIIlIIl[8]])[ChunkedNioFile.lllIIlIIIIlIIl[1]] = lIIllllIlIlIIlII("DAhXkDXFW1g=", "yZkDO");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[2]] = lIIllllIlIlIIlIl("CgkLOTwRVU0=", "eomJY");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[3]] = lIIllllIlIlIIlII("isDKCWOld+jwLy7ZeB9fXzOEhuBs5U/rUu5tTFTOhDI=", "FfIZv");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[4]] = lIIllllIlIlIIlIl("KjEPAAwubkE=", "FTagx");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[5]] = lIIllllIlIlIIllI("dsNoJQTXZNwTQLDSWmVz8WGa896poyGtLwjhmtovkkc=", "TKjTQ");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[6]] = lIIllllIlIlIIlII("tWZcokafmnsXTLEEP9hzhQ==", "PSfOo");
        ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[7]] = lIIllllIlIlIIlII("E/Mwkdckupd6FnQsL8Zr3XRQF3ccl2zhaZ9UyVfknGg=", "tKolQ");
    }
    
    private static boolean lIIllllIlIlIlIlI(final Object llllllllllllIlIlllllIlIlllIIlIlI) {
        return llllllllllllIlIlllllIlIlllIIlIlI == null;
    }
    
    private static boolean lIIllllIlIllIIlI(final int llllllllllllIlIlllllIlIlllIlIIIl, final int llllllllllllIlIlllllIlIlllIlIIII) {
        return llllllllllllIlIlllllIlIlllIlIIIl == llllllllllllIlIlllllIlIlllIlIIII;
    }
    
    static {
        lIIllllIlIlIlIII();
        lIIllllIlIlIIlll();
    }
    
    public ChunkedNioFile(final File llllllllllllIlIlllllIllIIlIlIlII, final int llllllllllllIlIlllllIllIIlIlIllI) throws IOException {
        this(new FileInputStream(llllllllllllIlIlllllIllIIlIlIlII).getChannel(), llllllllllllIlIlllllIllIIlIlIllI);
    }
    
    private static boolean lIIllllIlIlIllIl(final int llllllllllllIlIlllllIlIlllIIlIII) {
        return llllllllllllIlIlllllIlIlllIIlIII != 0;
    }
    
    private static int lIIllllIlIllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIIllllIlIlIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIllllIlIlIIlII(final String llllllllllllIlIlllllIlIlllIlIlll, final String llllllllllllIlIlllllIlIlllIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIlIlllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIlIlllIllIII.getBytes(StandardCharsets.UTF_8)), ChunkedNioFile.lllIIlIIIIlIIl[9]), "DES");
            final Cipher llllllllllllIlIlllllIlIlllIllIll = Cipher.getInstance("DES");
            llllllllllllIlIlllllIlIlllIllIll.init(ChunkedNioFile.lllIIlIIIIlIIl[3], llllllllllllIlIlllllIlIlllIlllII);
            return new String(llllllllllllIlIlllllIlIlllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIlIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIlIlllIllIlI) {
            llllllllllllIlIlllllIlIlllIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllllIlIllIIIl(final int llllllllllllIlIlllllIlIlllIIIlII) {
        return llllllllllllIlIlllllIlIlllIIIlII >= 0;
    }
    
    private static String lIIllllIlIlIIlIl(String llllllllllllIlIlllllIlIlllllIllI, final String llllllllllllIlIlllllIlIllllllIlI) {
        llllllllllllIlIlllllIlIlllllIllI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIlIlllllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIlIllllllIIl = new StringBuilder();
        final char[] llllllllllllIlIlllllIlIllllllIII = llllllllllllIlIlllllIlIllllllIlI.toCharArray();
        int llllllllllllIlIlllllIlIlllllIlll = ChunkedNioFile.lllIIlIIIIlIIl[1];
        final short llllllllllllIlIlllllIlIlllllIIIl = (Object)((String)llllllllllllIlIlllllIlIlllllIllI).toCharArray();
        final long llllllllllllIlIlllllIlIlllllIIII = llllllllllllIlIlllllIlIlllllIIIl.length;
        float llllllllllllIlIlllllIlIllllIllll = ChunkedNioFile.lllIIlIIIIlIIl[1];
        while (lIIllllIlIllIIll((int)llllllllllllIlIlllllIlIllllIllll, (int)llllllllllllIlIlllllIlIlllllIIII)) {
            final char llllllllllllIlIlllllIlIlllllllII = llllllllllllIlIlllllIlIlllllIIIl[llllllllllllIlIlllllIlIllllIllll];
            llllllllllllIlIlllllIlIllllllIIl.append((char)(llllllllllllIlIlllllIlIlllllllII ^ llllllllllllIlIlllllIlIllllllIII[llllllllllllIlIlllllIlIlllllIlll % llllllllllllIlIlllllIlIllllllIII.length]));
            "".length();
            ++llllllllllllIlIlllllIlIlllllIlll;
            ++llllllllllllIlIlllllIlIllllIllll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIlIllllllIIl);
    }
    
    public long startOffset() {
        return this.startOffset;
    }
    
    private static boolean lIIllllIlIlIlIll(final int llllllllllllIlIlllllIlIlllIIIIlI) {
        return llllllllllllIlIlllllIlIlllIIIIlI < 0;
    }
    
    @Override
    public void close() throws Exception {
        this.in.close();
    }
    
    @Override
    public boolean isEndOfInput() throws Exception {
        int n;
        if (!lIIllllIlIlIlIll(lIIllllIlIlIlllI(this.offset, this.endOffset)) || lIIllllIlIlIllll(this.in.isOpen() ? 1 : 0)) {
            n = ChunkedNioFile.lllIIlIIIIlIIl[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((12 + 87 + 42 + 73 ^ 1 + 85 - 23 + 78) & (0x63 ^ 0x5E ^ (0x1A ^ 0x7C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ChunkedNioFile.lllIIlIIIIlIIl[1];
        }
        return n != 0;
    }
    
    public ChunkedNioFile(final FileChannel llllllllllllIlIlllllIllIIIlllIII, final long llllllllllllIlIlllllIllIIIllIlll, final long llllllllllllIlIlllllIllIIIllIllI, final int llllllllllllIlIlllllIllIIIlllIlI) throws IOException {
        if (lIIllllIlIlIlIlI(llllllllllllIlIlllllIllIIIlllIII)) {
            throw new NullPointerException(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[1]]);
        }
        if (lIIllllIlIlIlIll(lIIllllIlIlIlIIl(llllllllllllIlIlllllIllIIIllIlll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[2]]).append(llllllllllllIlIlllllIllIIIllIlll).append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[3]])));
        }
        if (lIIllllIlIlIlIll(lIIllllIlIlIlIIl(llllllllllllIlIlllllIllIIIllIllI, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[4]]).append(llllllllllllIlIlllllIllIIIllIllI).append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[5]])));
        }
        if (lIIllllIlIlIllII(llllllllllllIlIlllllIllIIIlllIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[6]]).append(llllllllllllIlIlllllIllIIIlllIlI).append(ChunkedNioFile.lllIIlIIIIlIII[ChunkedNioFile.lllIIlIIIIlIIl[7]])));
        }
        if (lIIllllIlIlIllIl(lIIllllIlIlIlIIl(llllllllllllIlIlllllIllIIIllIlll, 0L))) {
            llllllllllllIlIlllllIllIIIlllIII.position(llllllllllllIlIlllllIllIIIllIlll);
            "".length();
        }
        this.in = llllllllllllIlIlllllIllIIIlllIII;
        this.chunkSize = llllllllllllIlIlllllIllIIIlllIlI;
        this.startOffset = llllllllllllIlIlllllIllIIIllIlll;
        this.offset = llllllllllllIlIlllllIllIIIllIlll;
        this.endOffset = llllllllllllIlIlllllIllIIIllIlll + llllllllllllIlIlllllIllIIIllIllI;
    }
    
    public ChunkedNioFile(final File llllllllllllIlIlllllIllIIlIllllI) throws IOException {
        this(new FileInputStream(llllllllllllIlIlllllIllIIlIllllI).getChannel());
    }
    
    public long endOffset() {
        return this.endOffset;
    }
    
    @Override
    public ByteBuf readChunk(final ChannelHandlerContext llllllllllllIlIlllllIllIIIIllIIl) throws Exception {
        final long llllllllllllIlIlllllIllIIIIllIII = this.offset;
        if (lIIllllIlIllIIIl(lIIllllIlIllIIII(llllllllllllIlIlllllIllIIIIllIII, this.endOffset))) {
            return null;
        }
        final int llllllllllllIlIlllllIllIIIIlIlll = (int)Math.min(this.chunkSize, this.endOffset - llllllllllllIlIlllllIllIIIIllIII);
        final ByteBuf llllllllllllIlIlllllIllIIIIlIllI = llllllllllllIlIlllllIllIIIIllIIl.alloc().buffer(llllllllllllIlIlllllIllIIIIlIlll);
        boolean llllllllllllIlIlllllIllIIIIlIlIl = ChunkedNioFile.lllIIlIIIIlIIl[2] != 0;
        try {
            int llllllllllllIlIlllllIllIIIIllIll = ChunkedNioFile.lllIIlIIIIlIIl[1];
            do {
                final int llllllllllllIlIlllllIllIIIIlllII = llllllllllllIlIlllllIllIIIIlIllI.writeBytes(this.in, llllllllllllIlIlllllIllIIIIlIlll - llllllllllllIlIlllllIllIIIIllIll);
                if (lIIllllIlIlIlIll(llllllllllllIlIlllllIllIIIIlllII)) {
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlIlllllIllIIIIllIll += llllllllllllIlIlllllIllIIIIlllII;
                    if (!lIIllllIlIllIIlI(llllllllllllIlIlllllIllIIIIllIll, llllllllllllIlIlllllIllIIIIlIlll)) {
                        "".length();
                        continue;
                    }
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return null;
                    }
                }
                this.offset += llllllllllllIlIlllllIllIIIIllIll;
                llllllllllllIlIlllllIllIIIIlIlIl = (ChunkedNioFile.lllIIlIIIIlIIl[1] != 0);
                final double llllllllllllIlIlllllIllIIIIIllIl = (double)llllllllllllIlIlllllIllIIIIlIllI;
                return (ByteBuf)llllllllllllIlIlllllIllIIIIIllIl;
            } while ((0xC0 ^ 0xC4) != " ".length());
            return null;
        }
        finally {
            if (lIIllllIlIlIllIl(llllllllllllIlIlllllIllIIIIlIlIl ? 1 : 0)) {
                llllllllllllIlIlllllIllIIIIlIllI.release();
                "".length();
            }
        }
    }
    
    private static String lIIllllIlIlIIllI(final String llllllllllllIlIlllllIlIllllIIlII, final String llllllllllllIlIlllllIlIllllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIlIllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIlIllllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIlIllllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIlIllllIlIII.init(ChunkedNioFile.lllIIlIIIIlIIl[3], llllllllllllIlIlllllIlIllllIlIIl);
            return new String(llllllllllllIlIlllllIlIllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIlIllllIIlll) {
            llllllllllllIlIlllllIlIllllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static int lIIllllIlIlIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIllllIlIlIlIII() {
        (lllIIlIIIIlIIl = new int[10])[0] = (0xFFFFAEC9 & 0x7136);
        ChunkedNioFile.lllIIlIIIIlIIl[1] = ((0xCC ^ 0xC4 ^ (0xEA ^ 0xB6)) & (144 + 178 - 152 + 48 ^ 32 + 56 + 1 + 53 ^ -" ".length()));
        ChunkedNioFile.lllIIlIIIIlIIl[2] = " ".length();
        ChunkedNioFile.lllIIlIIIIlIIl[3] = "  ".length();
        ChunkedNioFile.lllIIlIIIIlIIl[4] = "   ".length();
        ChunkedNioFile.lllIIlIIIIlIIl[5] = (0x46 ^ 0x42);
        ChunkedNioFile.lllIIlIIIIlIIl[6] = (0xFF ^ 0xC1 ^ (0xBA ^ 0x81));
        ChunkedNioFile.lllIIlIIIIlIIl[7] = (96 + 120 - 118 + 89 ^ 165 + 173 - 183 + 34);
        ChunkedNioFile.lllIIlIIIIlIIl[8] = (" ".length() ^ (0x61 ^ 0x67));
        ChunkedNioFile.lllIIlIIIIlIIl[9] = (0x2D ^ 0x25);
    }
    
    public ChunkedNioFile(final FileChannel llllllllllllIlIlllllIllIIlIIllll) throws IOException {
        this(llllllllllllIlIlllllIllIIlIIllll, ChunkedNioFile.lllIIlIIIIlIIl[0]);
    }
}
