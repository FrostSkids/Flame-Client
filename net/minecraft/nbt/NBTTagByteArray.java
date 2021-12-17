// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.util.Arrays;
import java.io.DataInput;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.DataOutput;

public class NBTTagByteArray extends NBTBase
{
    private static final /* synthetic */ int[] lIlIIlllIIlIII;
    private /* synthetic */ byte[] data;
    private static final /* synthetic */ String[] lIlIIlllIIIlll;
    
    private static void lllIlIIIllIllll() {
        (lIlIIlllIIIlll = new String[NBTTagByteArray.lIlIIlllIIlIII[4]])[NBTTagByteArray.lIlIIlllIIlIII[2]] = lllIlIIIllIllIl("EhaOgaLNimg=", "TNxtl");
        NBTTagByteArray.lIlIIlllIIIlll[NBTTagByteArray.lIlIIlllIIlIII[3]] = lllIlIIIllIlllI("TjYKMDQdCQ==", "nTsDQ");
    }
    
    @Override
    void write(final DataOutput lllllllllllllIIIllIIIIlIIlIlllII) throws IOException {
        lllllllllllllIIIllIIIIlIIlIlllII.writeInt(this.data.length);
        lllllllllllllIIIllIIIIlIIlIlllII.write(this.data);
    }
    
    private static String lllIlIIIllIllIl(final String lllllllllllllIIIllIIIIlIIIIlIlIl, final String lllllllllllllIIIllIIIIlIIIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIlIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIlIIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIIIlIIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIIIlIIIIllIIl.init(NBTTagByteArray.lIlIIlllIIlIII[4], lllllllllllllIIIllIIIIlIIIIllIlI);
            return new String(lllllllllllllIIIllIIIIlIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIlIIIIllIII) {
            lllllllllllllIIIllIIIIlIIIIllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIlIIIlllIIII();
        lllIlIIIllIllll();
    }
    
    private static void lllIlIIIlllIIII() {
        (lIlIIlllIIlIII = new int[5])[0] = (0x79 ^ 0x45 ^ (0x54 ^ 0x60));
        NBTTagByteArray.lIlIIlllIIlIII[1] = (133 + 158 - 204 + 110 ^ 11 + 18 + 83 + 82);
        NBTTagByteArray.lIlIIlllIIlIII[2] = ((76 + 128 - 144 + 83 ^ 109 + 34 - 138 + 126) & (0x7C ^ 0x19 ^ (0xC2 ^ 0xAB) ^ -" ".length()));
        NBTTagByteArray.lIlIIlllIIlIII[3] = " ".length();
        NBTTagByteArray.lIlIIlllIIlIII[4] = "  ".length();
    }
    
    public byte[] getByteArray() {
        return this.data;
    }
    
    @Override
    void read(final DataInput lllllllllllllIIIllIIIIlIIlIIllll, final int lllllllllllllIIIllIIIIlIIlIlIIll, final NBTSizeTracker lllllllllllllIIIllIIIIlIIlIIlllI) throws IOException {
        lllllllllllllIIIllIIIIlIIlIIlllI.read(192L);
        final int lllllllllllllIIIllIIIIlIIlIlIIIl = lllllllllllllIIIllIIIIlIIlIIllll.readInt();
        lllllllllllllIIIllIIIIlIIlIIlllI.read(NBTTagByteArray.lIlIIlllIIlIII[0] * lllllllllllllIIIllIIIIlIIlIlIIIl);
        this.data = new byte[lllllllllllllIIIllIIIIlIIlIlIIIl];
        lllllllllllllIIIllIIIIlIIlIIllll.readFully(this.data);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(NBTTagByteArray.lIlIIlllIIIlll[NBTTagByteArray.lIlIIlllIIlIII[2]]).append(this.data.length).append(NBTTagByteArray.lIlIIlllIIIlll[NBTTagByteArray.lIlIIlllIIlIII[3]]));
    }
    
    public NBTTagByteArray(final byte[] lllllllllllllIIIllIIIIlIIllIIIII) {
        this.data = lllllllllllllIIIllIIIIlIIllIIIII;
    }
    
    private static boolean lllIlIIIlllIIlI(final int lllllllllllllIIIllIIIIlIIIIIllll, final int lllllllllllllIIIllIIIIlIIIIIlllI) {
        return lllllllllllllIIIllIIIIlIIIIIllll < lllllllllllllIIIllIIIIlIIIIIlllI;
    }
    
    NBTTagByteArray() {
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagByteArray.lIlIIlllIIlIII[1];
    }
    
    private static String lllIlIIIllIlllI(String lllllllllllllIIIllIIIIlIIIlIIlll, final String lllllllllllllIIIllIIIIlIIIlIlIll) {
        lllllllllllllIIIllIIIIlIIIlIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIIIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIIlIIIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIllIIIIlIIIlIlIIl = lllllllllllllIIIllIIIIlIIIlIlIll.toCharArray();
        int lllllllllllllIIIllIIIIlIIIlIlIII = NBTTagByteArray.lIlIIlllIIlIII[2];
        final char lllllllllllllIIIllIIIIlIIIlIIIlI = (Object)lllllllllllllIIIllIIIIlIIIlIIlll.toCharArray();
        final float lllllllllllllIIIllIIIIlIIIlIIIIl = lllllllllllllIIIllIIIIlIIIlIIIlI.length;
        short lllllllllllllIIIllIIIIlIIIlIIIII = (short)NBTTagByteArray.lIlIIlllIIlIII[2];
        while (lllIlIIIlllIIlI(lllllllllllllIIIllIIIIlIIIlIIIII, (int)lllllllllllllIIIllIIIIlIIIlIIIIl)) {
            final char lllllllllllllIIIllIIIIlIIIlIllIl = lllllllllllllIIIllIIIIlIIIlIIIlI[lllllllllllllIIIllIIIIlIIIlIIIII];
            lllllllllllllIIIllIIIIlIIIlIlIlI.append((char)(lllllllllllllIIIllIIIIlIIIlIllIl ^ lllllllllllllIIIllIIIIlIIIlIlIIl[lllllllllllllIIIllIIIIlIIIlIlIII % lllllllllllllIIIllIIIIlIIIlIlIIl.length]));
            "".length();
            ++lllllllllllllIIIllIIIIlIIIlIlIII;
            ++lllllllllllllIIIllIIIIlIIIlIIIII;
            "".length();
            if ((0xE5 ^ 0x9D ^ (0x1D ^ 0x61)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIIlIIIlIlIlI);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.data);
    }
    
    private static boolean lllIlIIIlllIIIl(final int lllllllllllllIIIllIIIIlIIIIIllII) {
        return lllllllllllllIIIllIIIIlIIIIIllII != 0;
    }
    
    @Override
    public NBTBase copy() {
        final byte[] lllllllllllllIIIllIIIIlIIlIIIlIl = new byte[this.data.length];
        System.arraycopy(this.data, NBTTagByteArray.lIlIIlllIIlIII[2], lllllllllllllIIIllIIIIlIIlIIIlIl, NBTTagByteArray.lIlIIlllIIlIII[2], this.data.length);
        return new NBTTagByteArray(lllllllllllllIIIllIIIIlIIlIIIlIl);
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIllIIIIlIIIllllIl) {
        int equals;
        if (lllIlIIIlllIIIl(super.equals(lllllllllllllIIIllIIIIlIIIllllIl) ? 1 : 0)) {
            equals = (Arrays.equals(this.data, ((NBTTagByteArray)lllllllllllllIIIllIIIIlIIIllllIl).data) ? 1 : 0);
            "".length();
            if ((27 + 16 - 9 + 123 ^ 49 + 72 - 14 + 46) <= " ".length()) {
                return ((71 + 132 - 197 + 227 ^ 168 + 47 - 61 + 37) & (94 + 20 - 78 + 110 ^ 53 + 96 + 30 + 17 ^ -" ".length())) != 0x0;
            }
        }
        else {
            equals = NBTTagByteArray.lIlIIlllIIlIII[2];
        }
        return equals != 0;
    }
}
