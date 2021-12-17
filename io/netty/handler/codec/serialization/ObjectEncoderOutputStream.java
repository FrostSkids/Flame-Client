// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import java.io.ObjectOutputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.ObjectOutput;
import java.io.OutputStream;

public class ObjectEncoderOutputStream extends OutputStream implements ObjectOutput
{
    private static final /* synthetic */ int[] lIllIIlllIIlIl;
    private final /* synthetic */ int estimatedLength;
    private final /* synthetic */ DataOutputStream out;
    private static final /* synthetic */ String[] lIllIIlllIIlII;
    
    public final int size() {
        return this.out.size();
    }
    
    @Override
    public final void writeFloat(final float lllllllllllllIIIIIIlIIllIIIIIIII) throws IOException {
        this.out.writeFloat(lllllllllllllIIIIIIlIIllIIIIIIII);
    }
    
    @Override
    public void writeObject(final Object lllllllllllllIIIIIIlIIllIlIlIlIl) throws IOException {
        final ByteBufOutputStream lllllllllllllIIIIIIlIIllIlIlIlII = new ByteBufOutputStream(Unpooled.buffer(this.estimatedLength));
        final ObjectOutputStream lllllllllllllIIIIIIlIIllIlIlIIll = new CompactObjectOutputStream(lllllllllllllIIIIIIlIIllIlIlIlII);
        lllllllllllllIIIIIIlIIllIlIlIIll.writeObject(lllllllllllllIIIIIIlIIllIlIlIlIl);
        lllllllllllllIIIIIIlIIllIlIlIIll.flush();
        lllllllllllllIIIIIIlIIllIlIlIIll.close();
        final ByteBuf lllllllllllllIIIIIIlIIllIlIlIIlI = lllllllllllllIIIIIIlIIllIlIlIlII.buffer();
        final int lllllllllllllIIIIIIlIIllIlIlIIIl = lllllllllllllIIIIIIlIIllIlIlIIlI.readableBytes();
        this.writeInt(lllllllllllllIIIIIIlIIllIlIlIIIl);
        lllllllllllllIIIIIIlIIllIlIlIIlI.getBytes(ObjectEncoderOutputStream.lIllIIlllIIlIl[1], this, lllllllllllllIIIIIIlIIllIlIlIIIl);
        "".length();
    }
    
    private static String lllllIllIIIIIIl(final String lllllllllllllIIIIIIlIIlIllIllllI, final String lllllllllllllIIIIIIlIIlIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlIIlIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIlIIlIlllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIlIIlIlllIIIlI.init(ObjectEncoderOutputStream.lIllIIlllIIlIl[3], lllllllllllllIIIIIIlIIlIlllIIIll);
            return new String(lllllllllllllIIIIIIlIIlIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIlIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlIIlIlllIIIIl) {
            lllllllllllllIIIIIIlIIlIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public final void writeDouble(final double lllllllllllllIIIIIIlIIllIIIIlIII) throws IOException {
        this.out.writeDouble(lllllllllllllIIIIIIlIIllIIIIlIII);
    }
    
    private static void lllllIllIIIIlII() {
        (lIllIIlllIIlIl = new int[5])[0] = (0xFFFFD759 & 0x2AA6);
        ObjectEncoderOutputStream.lIllIIlllIIlIl[1] = ((0x18 ^ 0x2) & ~(0x83 ^ 0x99));
        ObjectEncoderOutputStream.lIllIIlllIIlIl[2] = " ".length();
        ObjectEncoderOutputStream.lIllIIlllIIlIl[3] = "  ".length();
        ObjectEncoderOutputStream.lIllIIlllIIlIl[4] = (0x68 ^ 0x60);
    }
    
    @Override
    public void flush() throws IOException {
        this.out.flush();
    }
    
    @Override
    public final void writeShort(final int lllllllllllllIIIIIIlIIlIllllIIII) throws IOException {
        this.out.writeShort(lllllllllllllIIIIIIlIIlIllllIIII);
    }
    
    public ObjectEncoderOutputStream(final OutputStream lllllllllllllIIIIIIlIIllIllIIIIl, final int lllllllllllllIIIIIIlIIllIlIlllIl) {
        if (lllllIllIIIIlIl(lllllllllllllIIIIIIlIIllIllIIIIl)) {
            throw new NullPointerException(ObjectEncoderOutputStream.lIllIIlllIIlII[ObjectEncoderOutputStream.lIllIIlllIIlIl[1]]);
        }
        if (lllllIllIIIIllI(lllllllllllllIIIIIIlIIllIlIlllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ObjectEncoderOutputStream.lIllIIlllIIlII[ObjectEncoderOutputStream.lIllIIlllIIlIl[2]]).append(lllllllllllllIIIIIIlIIllIlIlllIl)));
        }
        if (lllllIllIIIIlll((lllllllllllllIIIIIIlIIllIllIIIIl instanceof DataOutputStream) ? 1 : 0)) {
            this.out = (DataOutputStream)lllllllllllllIIIIIIlIIllIllIIIIl;
            "".length();
            if ("   ".length() <= " ".length()) {
                throw null;
            }
        }
        else {
            this.out = new DataOutputStream(lllllllllllllIIIIIIlIIllIllIIIIl);
        }
        this.estimatedLength = lllllllllllllIIIIIIlIIllIlIlllIl;
    }
    
    @Override
    public final void writeBytes(final String lllllllllllllIIIIIIlIIllIIIllIlI) throws IOException {
        this.out.writeBytes(lllllllllllllIIIIIIlIIllIIIllIlI);
    }
    
    private static boolean lllllIllIIIIllI(final int lllllllllllllIIIIIIlIIlIllIIlIII) {
        return lllllllllllllIIIIIIlIIlIllIIlIII < 0;
    }
    
    @Override
    public final void writeByte(final int lllllllllllllIIIIIIlIIllIIIllllI) throws IOException {
        this.out.writeByte(lllllllllllllIIIIIIlIIllIIIllllI);
    }
    
    public ObjectEncoderOutputStream(final OutputStream lllllllllllllIIIIIIlIIllIllIIllI) {
        this(lllllllllllllIIIIIIlIIllIllIIllI, ObjectEncoderOutputStream.lIllIIlllIIlIl[0]);
    }
    
    private static void lllllIllIIIIIll() {
        (lIllIIlllIIlII = new String[ObjectEncoderOutputStream.lIllIIlllIIlIl[3]])[ObjectEncoderOutputStream.lIllIIlllIIlIl[1]] = lllllIllIIIIIIl("bwrbBUuySpk=", "aGkco");
        ObjectEncoderOutputStream.lIllIIlllIIlII[ObjectEncoderOutputStream.lIllIIlllIIlIl[2]] = lllllIllIIIIIlI("kDcjTkQd3mqp6ecHlIwqLzmWPMfcNelZ", "snpkA");
    }
    
    @Override
    public final void writeUTF(final String lllllllllllllIIIIIIlIIlIlllIlIlI) throws IOException {
        this.out.writeUTF(lllllllllllllIIIIIIlIIlIlllIlIlI);
    }
    
    @Override
    public final void writeBoolean(final boolean lllllllllllllIIIIIIlIIllIIlIIllI) throws IOException {
        this.out.writeBoolean(lllllllllllllIIIIIIlIIllIIlIIllI);
    }
    
    private static boolean lllllIllIIIIlIl(final Object lllllllllllllIIIIIIlIIlIllIIllII) {
        return lllllllllllllIIIIIIlIIlIllIIllII == null;
    }
    
    @Override
    public void write(final int lllllllllllllIIIIIIlIIllIlIIIlll) throws IOException {
        this.out.write(lllllllllllllIIIIIIlIIllIlIIIlll);
    }
    
    @Override
    public void write(final byte[] lllllllllllllIIIIIIlIIllIIlIlIlI) throws IOException {
        this.out.write(lllllllllllllIIIIIIlIIllIIlIlIlI);
    }
    
    @Override
    public final void writeInt(final int lllllllllllllIIIIIIlIIlIlllllIlI) throws IOException {
        this.out.writeInt(lllllllllllllIIIIIIlIIlIlllllIlI);
    }
    
    @Override
    public void write(final byte[] lllllllllllllIIIIIIlIIllIIllIIlI, final int lllllllllllllIIIIIIlIIllIIllIIIl, final int lllllllllllllIIIIIIlIIllIIllIIII) throws IOException {
        this.out.write(lllllllllllllIIIIIIlIIllIIllIIlI, lllllllllllllIIIIIIlIIllIIllIIIl, lllllllllllllIIIIIIlIIllIIllIIII);
    }
    
    @Override
    public final void writeChar(final int lllllllllllllIIIIIIlIIllIIIlIIlI) throws IOException {
        this.out.writeChar(lllllllllllllIIIIIIlIIllIIIlIIlI);
    }
    
    private static boolean lllllIllIIIIlll(final int lllllllllllllIIIIIIlIIlIllIIlIlI) {
        return lllllllllllllIIIIIIlIIlIllIIlIlI != 0;
    }
    
    private static String lllllIllIIIIIlI(final String lllllllllllllIIIIIIlIIlIllIlIIll, final String lllllllllllllIIIIIIlIIlIllIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlIIlIllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlIIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), ObjectEncoderOutputStream.lIllIIlllIIlIl[4]), "DES");
            final Cipher lllllllllllllIIIIIIlIIlIllIlIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlIIlIllIlIlIl.init(ObjectEncoderOutputStream.lIllIIlllIIlIl[3], lllllllllllllIIIIIIlIIlIllIlIllI);
            return new String(lllllllllllllIIIIIIlIIlIllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlIIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlIIlIllIlIlII) {
            lllllllllllllIIIIIIlIIlIllIlIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllllIllIIIIlII();
        lllllIllIIIIIll();
    }
    
    @Override
    public final void writeChars(final String lllllllllllllIIIIIIlIIllIIIIlllI) throws IOException {
        this.out.writeChars(lllllllllllllIIIIIIlIIllIIIIlllI);
    }
    
    @Override
    public final void writeLong(final long lllllllllllllIIIIIIlIIlIllllIlII) throws IOException {
        this.out.writeLong(lllllllllllllIIIIIIlIIlIllllIlII);
    }
    
    @Override
    public void close() throws IOException {
        this.out.close();
    }
}
