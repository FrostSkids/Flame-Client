// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.EOFException;
import java.io.DataInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.DataInput;
import java.io.InputStream;

public class ByteBufInputStream extends InputStream implements DataInput
{
    private static final /* synthetic */ int[] llIllIIllIIIII;
    private final /* synthetic */ ByteBuf buffer;
    private static final /* synthetic */ String[] llIllIIlIIlIIl;
    private final /* synthetic */ int endIndex;
    private final /* synthetic */ int startIndex;
    private final /* synthetic */ StringBuilder lineBuf;
    
    @Override
    public long skip(final long llllllllllllIllIIllllIIllIIIllll) throws IOException {
        if (lIIlIlllIIIlIlIl(lIIlIlllIIIlIlII(llllllllllllIllIIllllIIllIIIllll, 2147483647L))) {
            return this.skipBytes(ByteBufInputStream.llIllIIllIIIII[6]);
        }
        return this.skipBytes((int)llllllllllllIllIIllllIIllIIIllll);
    }
    
    private static boolean lIIlIlllIIIlIlll(final int llllllllllllIllIIllllIIlIIIlIIlI, final int llllllllllllIllIIllllIIlIIIlIIIl) {
        return llllllllllllIllIIllllIIlIIIlIIlI == llllllllllllIllIIllllIIlIIIlIIIl;
    }
    
    @Override
    public void reset() throws IOException {
        this.buffer.resetReaderIndex();
        "".length();
    }
    
    private static void lIIlIllIllIIlIll() {
        (llIllIIlIIlIIl = new String[ByteBufInputStream.llIllIIllIIIII[13]])[ByteBufInputStream.llIllIIllIIIII[0]] = lIIlIllIllIIlIII("wd1d3R9tFV4=", "ucEnf");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[1]] = lIIlIllIllIIlIIl("OA0jIS48Um0=", "ThMFZ");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[2]] = lIIlIllIllIIlIII("Bc/iTR44xQP+noRt3OadZBPHFJkh2PorGxTVoMaZTVOnxliIFf3ZZA==", "SosKn");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[3]] = lIIlIllIllIIlIII("YwmIrTG+E1FyuLukIAgdKw==", "sSJtI");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[7]] = lIIlIllIllIIlIlI("dGVov/e/+th6s9yE2Fk4DLHXNFyjtJkpVpmobOQfzpIhaZSqB2KhLQ==", "hAaWc");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[11]] = lIIlIllIllIIlIlI("sGmEbZn7iK63xvCB/kN3sfxL97tY8drypYxUHZQJPkJk9dorNEtdiA==", "Yuzey");
        ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[12]] = lIIlIllIllIIlIII("FREipl4J3lyhilsh84HG+vUBwEXmsiyC", "wXiEj");
    }
    
    private static String lIIlIllIllIIlIII(final String llllllllllllIllIIllllIIlIIlIIlIl, final String llllllllllllIllIIllllIIlIIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIlIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), ByteBufInputStream.llIllIIllIIIII[9]), "DES");
            final Cipher llllllllllllIllIIllllIIlIIlIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIIllllIIlIIlIlIIl.init(ByteBufInputStream.llIllIIllIIIII[2], llllllllllllIllIIllllIIlIIlIlIlI);
            return new String(llllllllllllIllIIllllIIlIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIlIIlIlIII) {
            llllllllllllIllIIllllIIlIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readFully(final byte[] llllllllllllIllIIllllIIlIlllIIII, final int llllllllllllIllIIllllIIlIllIllll, final int llllllllllllIllIIllllIIlIlllIIlI) throws IOException {
        this.checkAvailable(llllllllllllIllIIllllIIlIlllIIlI);
        this.buffer.readBytes(llllllllllllIllIIllllIIlIlllIIII, llllllllllllIllIIllllIIlIllIllll, llllllllllllIllIIllllIIlIlllIIlI);
        "".length();
    }
    
    @Override
    public char readChar() throws IOException {
        return (char)this.readShort();
    }
    
    @Override
    public int readInt() throws IOException {
        this.checkAvailable(ByteBufInputStream.llIllIIllIIIII[7]);
        return this.buffer.readInt();
    }
    
    @Override
    public boolean readBoolean() throws IOException {
        this.checkAvailable(ByteBufInputStream.llIllIIllIIIII[1]);
        int n;
        if (lIIlIlllIIIlIllI(this.read())) {
            n = ByteBufInputStream.llIllIIllIIIII[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0x53 ^ 0x12) & ~(0x1B ^ 0x5A)) != 0x0;
            }
        }
        else {
            n = ByteBufInputStream.llIllIIllIIIII[0];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlllIIIlIlIl(final int llllllllllllIllIIllllIIIllllllll) {
        return llllllllllllIllIIllllIIIllllllll > 0;
    }
    
    private static String lIIlIllIllIIlIlI(final String llllllllllllIllIIllllIIlIIIllIlI, final String llllllllllllIllIIllllIIlIIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIlIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllllIIlIIIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllllIIlIIIlllII.init(ByteBufInputStream.llIllIIllIIIII[2], llllllllllllIllIIllllIIlIIIlllIl);
            return new String(llllllllllllIllIIllllIIlIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIlIIIllIll) {
            llllllllllllIllIIllllIIlIIIllIll.printStackTrace();
            return null;
        }
    }
    
    public ByteBufInputStream(final ByteBuf llllllllllllIllIIllllIIllIllIllI, final int llllllllllllIllIIllllIIllIllIlIl) {
        this.lineBuf = new StringBuilder();
        if (lIIlIlllIIIlIIII(llllllllllllIllIIllllIIllIllIllI)) {
            throw new NullPointerException(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[0]]);
        }
        if (lIIlIlllIIIlIIIl(llllllllllllIllIIllllIIllIllIlIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[1]]).append(llllllllllllIllIIllllIIllIllIlIl)));
        }
        if (lIIlIlllIIIlIIlI(llllllllllllIllIIllllIIllIllIlIl, llllllllllllIllIIllllIIllIllIllI.readableBytes())) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[2]]).append(llllllllllllIllIIllllIIllIllIlIl).append(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[3]]).append(llllllllllllIllIIllllIIllIllIllI.readableBytes())));
        }
        this.buffer = llllllllllllIllIIllllIIllIllIllI;
        this.startIndex = llllllllllllIllIIllllIIllIllIllI.readerIndex();
        this.endIndex = this.startIndex + llllllllllllIllIIllllIIllIllIlIl;
        llllllllllllIllIIllllIIllIllIllI.markReaderIndex();
        "".length();
    }
    
    private static String lIIlIllIllIIlIIl(String llllllllllllIllIIllllIIlIIllIlll, final String llllllllllllIllIIllllIIlIIllIllI) {
        llllllllllllIllIIllllIIlIIllIlll = new String(Base64.getDecoder().decode(llllllllllllIllIIllllIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllIIlIIlllIlI = new StringBuilder();
        final char[] llllllllllllIllIIllllIIlIIlllIIl = llllllllllllIllIIllllIIlIIllIllI.toCharArray();
        int llllllllllllIllIIllllIIlIIlllIII = ByteBufInputStream.llIllIIllIIIII[0];
        final String llllllllllllIllIIllllIIlIIllIIlI = (Object)llllllllllllIllIIllllIIlIIllIlll.toCharArray();
        final char llllllllllllIllIIllllIIlIIllIIIl = (char)llllllllllllIllIIllllIIlIIllIIlI.length;
        short llllllllllllIllIIllllIIlIIllIIII = (short)ByteBufInputStream.llIllIIllIIIII[0];
        while (lIIlIlllIIIllIII(llllllllllllIllIIllllIIlIIllIIII, llllllllllllIllIIllllIIlIIllIIIl)) {
            final char llllllllllllIllIIllllIIlIIllllIl = llllllllllllIllIIllllIIlIIllIIlI[llllllllllllIllIIllllIIlIIllIIII];
            llllllllllllIllIIllllIIlIIlllIlI.append((char)(llllllllllllIllIIllllIIlIIllllIl ^ llllllllllllIllIIllllIIlIIlllIIl[llllllllllllIllIIllllIIlIIlllIII % llllllllllllIllIIllllIIlIIlllIIl.length]));
            "".length();
            ++llllllllllllIllIIllllIIlIIlllIII;
            ++llllllllllllIllIIllllIIlIIllIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllIIlIIlllIlI);
    }
    
    @Override
    public long readLong() throws IOException {
        this.checkAvailable(ByteBufInputStream.llIllIIllIIIII[9]);
        return this.buffer.readLong();
    }
    
    private static boolean lIIlIlllIIIlIIlI(final int llllllllllllIllIIllllIIlIIIIlIlI, final int llllllllllllIllIIllllIIlIIIIlIIl) {
        return llllllllllllIllIIllllIIlIIIIlIlI > llllllllllllIllIIllllIIlIIIIlIIl;
    }
    
    @Override
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public int readUnsignedByte() throws IOException {
        return this.readByte() & ByteBufInputStream.llIllIIllIIIII[5];
    }
    
    @Override
    public String readUTF() throws IOException {
        return DataInputStream.readUTF(this);
    }
    
    private static void lIIlIlllIIIIllll() {
        (llIllIIllIIIII = new int[14])[0] = ((123 + 217 - 161 + 63 ^ 50 + 154 - 163 + 119) & (0x67 ^ 0xF ^ (0xA1 ^ 0x9B) ^ -" ".length()));
        ByteBufInputStream.llIllIIllIIIII[1] = " ".length();
        ByteBufInputStream.llIllIIllIIIII[2] = "  ".length();
        ByteBufInputStream.llIllIIllIIIII[3] = "   ".length();
        ByteBufInputStream.llIllIIllIIIII[4] = -" ".length();
        ByteBufInputStream.llIllIIllIIIII[5] = 83 + 68 - 105 + 208 + (0xF2 ^ 0xAF) - (47 + 232 - 130 + 91) + (26 + 39 - 33 + 116);
        ByteBufInputStream.llIllIIllIIIII[6] = (-1 & Integer.MAX_VALUE);
        ByteBufInputStream.llIllIIllIIIII[7] = (64 + 61 - 51 + 55 ^ 31 + 45 + 17 + 40);
        ByteBufInputStream.llIllIIllIIIII[8] = (38 + 136 - 67 + 76 ^ 93 + 22 + 15 + 59);
        ByteBufInputStream.llIllIIllIIIII[9] = (46 + 137 - 117 + 86 ^ 6 + 17 + 55 + 66);
        ByteBufInputStream.llIllIIllIIIII[10] = (-1 & 0xFFFF);
        ByteBufInputStream.llIllIIllIIIII[11] = (129 + 25 - 102 + 79 ^ 15 + 2 + 114 + 3);
        ByteBufInputStream.llIllIIllIIIII[12] = (0x2A ^ 0x2C);
        ByteBufInputStream.llIllIIllIIIII[13] = (0x6A ^ 0x3C ^ (0x94 ^ 0xC5));
    }
    
    private static boolean lIIlIlllIIIllIII(final int llllllllllllIllIIllllIIlIIIIlllI, final int llllllllllllIllIIllllIIlIIIIllIl) {
        return llllllllllllIllIIllllIIlIIIIlllI < llllllllllllIllIIllllIIlIIIIllIl;
    }
    
    @Override
    public int readUnsignedShort() throws IOException {
        return this.readShort() & ByteBufInputStream.llIllIIllIIIII[10];
    }
    
    @Override
    public int available() throws IOException {
        return this.endIndex - this.buffer.readerIndex();
    }
    
    private static boolean lIIlIlllIIIlIIIl(final int llllllllllllIllIIllllIIlIIIIIIIl) {
        return llllllllllllIllIIllllIIlIIIIIIIl < 0;
    }
    
    @Override
    public int read(final byte[] llllllllllllIllIIllllIIllIIllIll, final int llllllllllllIllIIllllIIllIIllIlI, int llllllllllllIllIIllllIIllIIllIIl) throws IOException {
        final int llllllllllllIllIIllllIIllIIlllIl = this.available();
        if (lIIlIlllIIIlIIll(llllllllllllIllIIllllIIllIIlllIl)) {
            return ByteBufInputStream.llIllIIllIIIII[4];
        }
        llllllllllllIllIIllllIIllIIllIIl = (Exception)Math.min(llllllllllllIllIIllllIIllIIlllIl, (int)llllllllllllIllIIllllIIllIIllIIl);
        this.buffer.readBytes(llllllllllllIllIIllllIIllIIllIll, llllllllllllIllIIllllIIllIIllIlI, (int)llllllllllllIllIIllllIIllIIllIIl);
        "".length();
        return (int)llllllllllllIllIIllllIIllIIllIIl;
    }
    
    @Override
    public void mark(final int llllllllllllIllIIllllIIllIlIllII) {
        this.buffer.markReaderIndex();
        "".length();
    }
    
    @Override
    public byte readByte() throws IOException {
        if (lIIlIlllIIIlIIll(this.buffer.isReadable() ? 1 : 0)) {
            throw new EOFException();
        }
        return this.buffer.readByte();
    }
    
    @Override
    public int skipBytes(final int llllllllllllIllIIllllIIlIlIlIIIl) throws IOException {
        final int llllllllllllIllIIllllIIlIlIlIIII = Math.min(this.available(), llllllllllllIllIIllllIIlIlIlIIIl);
        this.buffer.skipBytes(llllllllllllIllIIllllIIlIlIlIIII);
        "".length();
        return llllllllllllIllIIllllIIlIlIlIIII;
    }
    
    private static boolean lIIlIlllIIIlIIII(final Object llllllllllllIllIIllllIIlIIIIIlll) {
        return llllllllllllIllIIllllIIlIIIIIlll == null;
    }
    
    static {
        lIIlIlllIIIIllll();
        lIIlIllIllIIlIll();
    }
    
    @Override
    public String readLine() throws IOException {
        this.lineBuf.setLength(ByteBufInputStream.llIllIIllIIIII[0]);
        while (!lIIlIlllIIIlIIll(this.buffer.isReadable() ? 1 : 0)) {
            final int llllllllllllIllIIllllIIlIllIlIII = this.buffer.readUnsignedByte();
            switch (llllllllllllIllIIllllIIlIllIlIII) {
                case 10: {
                    "".length();
                    if ((96 + 30 - 30 + 75 ^ 113 + 121 - 77 + 18) <= 0) {
                        return null;
                    }
                    break;
                }
                case 13: {
                    if (!lIIlIlllIIIlIllI(this.buffer.isReadable() ? 1 : 0) || !lIIlIlllIIIlIlll((char)this.buffer.getUnsignedByte(this.buffer.readerIndex()), ByteBufInputStream.llIllIIllIIIII[8])) {
                        break;
                    }
                    this.buffer.skipBytes(ByteBufInputStream.llIllIIllIIIII[1]);
                    "".length();
                    "".length();
                    if ((160 + 51 - 134 + 102 ^ 43 + 37 - 29 + 132) == 0x0) {
                        return null;
                    }
                    break;
                }
                default: {
                    this.lineBuf.append((char)llllllllllllIllIIllllIIlIllIlIII);
                    "".length();
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return null;
                    }
                    continue;
                }
            }
            return String.valueOf(this.lineBuf);
        }
        String value;
        if (lIIlIlllIIIlIlIl(this.lineBuf.length())) {
            value = String.valueOf(this.lineBuf);
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            value = null;
        }
        return value;
    }
    
    private static boolean lIIlIlllIIIlIIll(final int llllllllllllIllIIllllIIlIIIIIIll) {
        return llllllllllllIllIIllllIIlIIIIIIll == 0;
    }
    
    @Override
    public boolean markSupported() {
        return ByteBufInputStream.llIllIIllIIIII[1] != 0;
    }
    
    @Override
    public int read() throws IOException {
        if (lIIlIlllIIIlIIll(this.buffer.isReadable() ? 1 : 0)) {
            return ByteBufInputStream.llIllIIllIIIII[4];
        }
        return this.buffer.readByte() & ByteBufInputStream.llIllIIllIIIII[5];
    }
    
    private static boolean lIIlIlllIIIlIllI(final int llllllllllllIllIIllllIIlIIIIIlIl) {
        return llllllllllllIllIIllllIIlIIIIIlIl != 0;
    }
    
    public int readBytes() {
        return this.buffer.readerIndex() - this.startIndex;
    }
    
    @Override
    public short readShort() throws IOException {
        this.checkAvailable(ByteBufInputStream.llIllIIllIIIII[2]);
        return this.buffer.readShort();
    }
    
    @Override
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readLong());
    }
    
    private void checkAvailable(final int llllllllllllIllIIllllIIlIlIIIlll) throws IOException {
        if (lIIlIlllIIIlIIIl(llllllllllllIllIIllllIIlIlIIIlll)) {
            throw new IndexOutOfBoundsException(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[7]]);
        }
        if (lIIlIlllIIIlIIlI(llllllllllllIllIIllllIIlIlIIIlll, this.available())) {
            throw new EOFException(String.valueOf(new StringBuilder().append(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[11]]).append(llllllllllllIllIIllllIIlIlIIIlll).append(ByteBufInputStream.llIllIIlIIlIIl[ByteBufInputStream.llIllIIllIIIII[12]]).append(this.available())));
        }
    }
    
    public ByteBufInputStream(final ByteBuf llllllllllllIllIIllllIIllIlllllI) {
        this(llllllllllllIllIIllllIIllIlllllI, llllllllllllIllIIllllIIllIlllllI.readableBytes());
    }
    
    private static int lIIlIlllIIIlIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void readFully(final byte[] llllllllllllIllIIllllIIlIlllllII) throws IOException {
        this.readFully(llllllllllllIllIIllllIIlIlllllII, ByteBufInputStream.llIllIIllIIIII[0], llllllllllllIllIIllllIIlIlllllII.length);
    }
}
