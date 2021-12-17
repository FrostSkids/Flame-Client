// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.io.DataInputStream;
import java.io.ObjectInput;
import java.io.InputStream;

public class ObjectDecoderInputStream extends InputStream implements ObjectInput
{
    private final /* synthetic */ ClassResolver classResolver;
    private final /* synthetic */ int maxObjectSize;
    private static final /* synthetic */ String[] lIIIllllIllIII;
    private final /* synthetic */ DataInputStream in;
    private static final /* synthetic */ int[] lIIlIIIlIllIIl;
    
    @Override
    public Object readObject() throws IOException, ClassNotFoundException {
        final int lllllllllllllIIlllIIllIIlIlIIllI = this.readInt();
        if (llIIlIlIllllIIl(lllllllllllllIIlllIIllIIlIlIIllI)) {
            throw new StreamCorruptedException(String.valueOf(new StringBuilder().append(ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[3]]).append(lllllllllllllIIlllIIllIIlIlIIllI)));
        }
        if (llIIlIlIllllIll(lllllllllllllIIlllIIllIIlIlIIllI, this.maxObjectSize)) {
            throw new StreamCorruptedException(String.valueOf(new StringBuilder().append(ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[4]]).append(lllllllllllllIIlllIIllIIlIlIIllI).append(ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[5]]).append(this.maxObjectSize).append((char)ObjectDecoderInputStream.lIIlIIIlIllIIl[6])));
        }
        return new CompactObjectInputStream(this.in, this.classResolver).readObject();
    }
    
    public ObjectDecoderInputStream(final InputStream lllllllllllllIIlllIIllIIlIlIllII, final ClassLoader lllllllllllllIIlllIIllIIlIlIllll, final int lllllllllllllIIlllIIllIIlIlIlIlI) {
        if (llIIlIlIllllIII(lllllllllllllIIlllIIllIIlIlIllII)) {
            throw new NullPointerException(ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[1]]);
        }
        if (llIIlIlIllllIIl(lllllllllllllIIlllIIllIIlIlIlIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[2]]).append(lllllllllllllIIlllIIllIIlIlIlIlI)));
        }
        if (llIIlIlIllllIlI((lllllllllllllIIlllIIllIIlIlIllII instanceof DataInputStream) ? 1 : 0)) {
            this.in = (DataInputStream)lllllllllllllIIlllIIllIIlIlIllII;
            "".length();
            if (((0xE7 ^ 0x85) & ~(0x16 ^ 0x74)) != 0x0) {
                throw null;
            }
        }
        else {
            this.in = new DataInputStream(lllllllllllllIIlllIIllIIlIlIllII);
        }
        this.classResolver = ClassResolvers.weakCachingResolver(lllllllllllllIIlllIIllIIlIlIllll);
        this.maxObjectSize = lllllllllllllIIlllIIllIIlIlIlIlI;
    }
    
    @Override
    public int read() throws IOException {
        return this.in.read();
    }
    
    private static boolean llIIlIlIllllIIl(final int lllllllllllllIIlllIIlIlllllllIll) {
        return lllllllllllllIIlllIIlIlllllllIll <= 0;
    }
    
    private static void llIIlIlIlllIlll() {
        (lIIlIIIlIllIIl = new int[9])[0] = (0xFFFFB1DC & 0x104E23);
        ObjectDecoderInputStream.lIIlIIIlIllIIl[1] = ((81 + 95 - 91 + 51 ^ 50 + 90 - 108 + 103) & (0x1C ^ 0x7 ^ (0x8B ^ 0x9F) ^ -" ".length()));
        ObjectDecoderInputStream.lIIlIIIlIllIIl[2] = " ".length();
        ObjectDecoderInputStream.lIIlIIIlIllIIl[3] = "  ".length();
        ObjectDecoderInputStream.lIIlIIIlIllIIl[4] = "   ".length();
        ObjectDecoderInputStream.lIIlIIIlIllIIl[5] = (0x73 ^ 0x77);
        ObjectDecoderInputStream.lIIlIIIlIllIIl[6] = (0x5B ^ 0x72);
        ObjectDecoderInputStream.lIIlIIIlIllIIl[7] = (0x23 ^ 0x67 ^ (0x50 ^ 0x11));
        ObjectDecoderInputStream.lIIlIIIlIllIIl[8] = (0xCE ^ 0x94 ^ (0xE4 ^ 0xB6));
    }
    
    @Override
    public final String readUTF() throws IOException {
        return this.in.readUTF();
    }
    
    public ObjectDecoderInputStream(final InputStream lllllllllllllIIlllIIllIIllIIlIII) {
        this(lllllllllllllIIlllIIllIIllIIlIII, null);
    }
    
    public ObjectDecoderInputStream(final InputStream lllllllllllllIIlllIIllIIllIIIIll, final ClassLoader lllllllllllllIIlllIIllIIlIllllll) {
        this(lllllllllllllIIlllIIllIIllIIIIll, lllllllllllllIIlllIIllIIlIllllll, ObjectDecoderInputStream.lIIlIIIlIllIIl[0]);
    }
    
    static {
        llIIlIlIlllIlll();
        llIIIllllllIlll();
    }
    
    @Override
    public final short readShort() throws IOException {
        return this.in.readShort();
    }
    
    private static String llIIIllllllIIll(String lllllllllllllIIlllIIllIIIIlIlIll, final String lllllllllllllIIlllIIllIIIIlIlIlI) {
        lllllllllllllIIlllIIllIIIIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIllIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIllIIIIlIlllI = new StringBuilder();
        final char[] lllllllllllllIIlllIIllIIIIlIllIl = lllllllllllllIIlllIIllIIIIlIlIlI.toCharArray();
        int lllllllllllllIIlllIIllIIIIlIllII = ObjectDecoderInputStream.lIIlIIIlIllIIl[1];
        final boolean lllllllllllllIIlllIIllIIIIlIIllI = (Object)lllllllllllllIIlllIIllIIIIlIlIll.toCharArray();
        final byte lllllllllllllIIlllIIllIIIIlIIlIl = (byte)lllllllllllllIIlllIIllIIIIlIIllI.length;
        byte lllllllllllllIIlllIIllIIIIlIIlII = (byte)ObjectDecoderInputStream.lIIlIIIlIllIIl[1];
        while (llIIlIlIlllllII(lllllllllllllIIlllIIllIIIIlIIlII, lllllllllllllIIlllIIllIIIIlIIlIl)) {
            final char lllllllllllllIIlllIIllIIIIllIIIl = lllllllllllllIIlllIIllIIIIlIIllI[lllllllllllllIIlllIIllIIIIlIIlII];
            lllllllllllllIIlllIIllIIIIlIlllI.append((char)(lllllllllllllIIlllIIllIIIIllIIIl ^ lllllllllllllIIlllIIllIIIIlIllIl[lllllllllllllIIlllIIllIIIIlIllII % lllllllllllllIIlllIIllIIIIlIllIl.length]));
            "".length();
            ++lllllllllllllIIlllIIllIIIIlIllII;
            ++lllllllllllllIIlllIIllIIIIlIIlII;
            "".length();
            if (((0xC6 ^ 0xAF ^ (0xF ^ 0x7C)) & (0x5B ^ 0x56 ^ (0x6F ^ 0x78) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIllIIIIlIlllI);
    }
    
    @Override
    public void mark(final int lllllllllllllIIlllIIllIIlIIllIII) {
        this.in.mark(lllllllllllllIIlllIIllIIlIIllIII);
    }
    
    @Override
    public void reset() throws IOException {
        this.in.reset();
    }
    
    @Override
    public final int readUnsignedByte() throws IOException {
        return this.in.readUnsignedByte();
    }
    
    @Override
    public int available() throws IOException {
        return this.in.available();
    }
    
    @Override
    public final byte readByte() throws IOException {
        return this.in.readByte();
    }
    
    @Override
    public final int read(final byte[] lllllllllllllIIlllIIllIIlIIIIIlI) throws IOException {
        return this.in.read(lllllllllllllIIlllIIllIIlIIIIIlI);
    }
    
    private static boolean llIIlIlIllllIlI(final int lllllllllllllIIlllIIlIllllllllIl) {
        return lllllllllllllIIlllIIlIllllllllIl != 0;
    }
    
    private static String llIIIllllllIllI(final String lllllllllllllIIlllIIllIIIIIIllII, final String lllllllllllllIIlllIIllIIIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIllIIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIllIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), ObjectDecoderInputStream.lIIlIIIlIllIIl[8]), "DES");
            final Cipher lllllllllllllIIlllIIllIIIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIllIIIIIlIIII.init(ObjectDecoderInputStream.lIIlIIIlIllIIl[3], lllllllllllllIIlllIIllIIIIIlIIIl);
            return new String(lllllllllllllIIlllIIllIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIllIIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIllIIIIIIllll) {
            lllllllllllllIIlllIIllIIIIIIllll.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    @Override
    public final String readLine() throws IOException {
        return this.in.readLine();
    }
    
    @Override
    public final long readLong() throws IOException {
        return this.in.readLong();
    }
    
    @Override
    public final int skipBytes(final int lllllllllllllIIlllIIllIIIIllllIl) throws IOException {
        return this.in.skipBytes(lllllllllllllIIlllIIllIIIIllllIl);
    }
    
    @Override
    public final int readUnsignedShort() throws IOException {
        return this.in.readUnsignedShort();
    }
    
    @Override
    public final int read(final byte[] lllllllllllllIIlllIIllIIlIIIllII, final int lllllllllllllIIlllIIllIIlIIIIlll, final int lllllllllllllIIlllIIllIIlIIIIllI) throws IOException {
        return this.in.read(lllllllllllllIIlllIIllIIlIIIllII, lllllllllllllIIlllIIllIIlIIIIlll, lllllllllllllIIlllIIllIIlIIIIllI);
    }
    
    @Override
    public long skip(final long lllllllllllllIIlllIIllIIIlIIIIll) throws IOException {
        return this.in.skip(lllllllllllllIIlllIIllIIIlIIIIll);
    }
    
    private static boolean llIIlIlIlllllII(final int lllllllllllllIIlllIIllIIIIIIIllI, final int lllllllllllllIIlllIIllIIIIIIIlIl) {
        return lllllllllllllIIlllIIllIIIIIIIllI < lllllllllllllIIlllIIllIIIIIIIlIl;
    }
    
    @Override
    public final int readInt() throws IOException {
        return this.in.readInt();
    }
    
    private static String llIIIllllllIlIl(final String lllllllllllllIIlllIIllIIIIIllIIl, final String lllllllllllllIIlllIIllIIIIIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIllIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIllIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIllIIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIllIIIIIlllIl.init(ObjectDecoderInputStream.lIIlIIIlIllIIl[3], lllllllllllllIIlllIIllIIIIIllllI);
            return new String(lllllllllllllIIlllIIllIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIllIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIllIIIIIlllII) {
            lllllllllllllIIlllIIllIIIIIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean markSupported() {
        return this.in.markSupported();
    }
    
    @Override
    public final double readDouble() throws IOException {
        return this.in.readDouble();
    }
    
    @Override
    public final float readFloat() throws IOException {
        return this.in.readFloat();
    }
    
    private static void llIIIllllllIlll() {
        (lIIIllllIllIII = new String[ObjectDecoderInputStream.lIIlIIIlIllIIl[7]])[ObjectDecoderInputStream.lIIlIIIlIllIIl[1]] = llIIIllllllIIll("DQg=", "dfchK");
        ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[2]] = llIIIllllllIlIl("j33BSz24Fa2I4MXZxQpsxQ==", "WgTHf");
        ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[3]] = llIIIllllllIIll("PDwZLAU8Nk8pCCEzTyEMOzUbJVN1", "URoMi");
        ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[4]] = llIIIllllllIIll("IDM+FWIoNyQTNixyPhstZDAjE3hk", "DRJtB");
        ObjectDecoderInputStream.lIIIllllIllIII[ObjectDecoderInputStream.lIIlIIIlIllIIl[5]] = llIIIllllllIllI("Pm39nz+LleQ=", "lxVJT");
    }
    
    public ObjectDecoderInputStream(final InputStream lllllllllllllIIlllIIllIIlIlllIlI, final int lllllllllllllIIlllIIllIIlIlllIIl) {
        this(lllllllllllllIIlllIIllIIlIlllIlI, null, lllllllllllllIIlllIIllIIlIlllIIl);
    }
    
    @Override
    public final char readChar() throws IOException {
        return this.in.readChar();
    }
    
    private static boolean llIIlIlIllllIII(final Object lllllllllllllIIlllIIlIllllllllll) {
        return lllllllllllllIIlllIIlIllllllllll == null;
    }
    
    @Override
    public final void readFully(final byte[] lllllllllllllIIlllIIllIIIllIIlll, final int lllllllllllllIIlllIIllIIIllIIllI, final int lllllllllllllIIlllIIllIIIllIIlIl) throws IOException {
        this.in.readFully(lllllllllllllIIlllIIllIIIllIIlll, lllllllllllllIIlllIIllIIIllIIllI, lllllllllllllIIlllIIllIIIllIIlIl);
    }
    
    @Override
    public final void readFully(final byte[] lllllllllllllIIlllIIllIIIllIIIIl) throws IOException {
        this.in.readFully(lllllllllllllIIlllIIllIIIllIIIIl);
    }
    
    @Override
    public final boolean readBoolean() throws IOException {
        return this.in.readBoolean();
    }
    
    @Override
    public void close() throws IOException {
        this.in.close();
    }
    
    private static boolean llIIlIlIllllIll(final int lllllllllllllIIlllIIllIIIIIIIIlI, final int lllllllllllllIIlllIIllIIIIIIIIIl) {
        return lllllllllllllIIlllIIllIIIIIIIIlI > lllllllllllllIIlllIIllIIIIIIIIIl;
    }
}
