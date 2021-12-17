// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class NBTTagByte extends NBTPrimitive
{
    private static final /* synthetic */ int[] llIIIllIllIIIl;
    private /* synthetic */ byte data;
    private static final /* synthetic */ String[] llIIIllIIIIlIl;
    
    private static String lIIIlIIlllllIIll(final String llllllllllllIlllIlIIlIIIIlIlIIII, final String llllllllllllIlllIlIIlIIIIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlIIIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIlIIIIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIlIIIIlIlIlII.init(NBTTagByte.llIIIllIllIIIl[2], llllllllllllIlllIlIIlIIIIlIlIlIl);
            return new String(llllllllllllIlllIlIIlIIIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlIIIIlIlIIll) {
            llllllllllllIlllIlIIlIIIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data).append(NBTTagByte.llIIIllIIIIlIl[NBTTagByte.llIIIllIllIIIl[1]]));
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllIlIIlIIIIlllIIII) {
        if (!lIIIlIlIlIIIllII(super.equals(llllllllllllIlllIlIIlIIIIlllIIII) ? 1 : 0)) {
            return NBTTagByte.llIIIllIllIIIl[1] != 0;
        }
        final NBTTagByte llllllllllllIlllIlIIlIIIIlllIIlI = (NBTTagByte)llllllllllllIlllIlIIlIIIIlllIIII;
        if (lIIIlIlIlIIIllIl(this.data, llllllllllllIlllIlIIlIIIIlllIIlI.data)) {
            return NBTTagByte.llIIIllIllIIIl[0] != 0;
        }
        return NBTTagByte.llIIIllIllIIIl[1] != 0;
    }
    
    private static void lIIIlIlIlIIIlIll() {
        (llIIIllIllIIIl = new int[3])[0] = " ".length();
        NBTTagByte.llIIIllIllIIIl[1] = ((0x49 ^ 0x6F) & ~(0xB1 ^ 0x97));
        NBTTagByte.llIIIllIllIIIl[2] = "  ".length();
    }
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    @Override
    public int getInt() {
        return this.data;
    }
    
    private static boolean lIIIlIlIlIIIllII(final int llllllllllllIlllIlIIlIIIIlIIIlll) {
        return llllllllllllIlllIlIIlIIIIlIIIlll != 0;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagByte.llIIIllIllIIIl[0];
    }
    
    @Override
    void read(final DataInput llllllllllllIlllIlIIlIIIlIIIIlII, final int llllllllllllIlllIlIIlIIIlIIIIIll, final NBTSizeTracker llllllllllllIlllIlIIlIIIIlllllll) throws IOException {
        llllllllllllIlllIlIIlIIIIlllllll.read(72L);
        this.data = llllllllllllIlllIlIIlIIIlIIIIlII.readByte();
    }
    
    @Override
    void write(final DataOutput llllllllllllIlllIlIIlIIIlIIIlIll) throws IOException {
        llllllllllllIlllIlIIlIIIlIIIlIll.writeByte(this.data);
    }
    
    NBTTagByte() {
    }
    
    @Override
    public float getFloat() {
        return this.data;
    }
    
    @Override
    public byte getByte() {
        return this.data;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagByte(this.data);
    }
    
    static {
        lIIIlIlIlIIIlIll();
        lIIIlIIlllllIlII();
    }
    
    public NBTTagByte(final byte llllllllllllIlllIlIIlIIIlIIlIIIl) {
        this.data = llllllllllllIlllIlIIlIIIlIIlIIIl;
    }
    
    private static boolean lIIIlIlIlIIIllIl(final int llllllllllllIlllIlIIlIIIIlIIlIlI, final int llllllllllllIlllIlIIlIIIIlIIlIIl) {
        return llllllllllllIlllIlIIlIIIIlIIlIlI == llllllllllllIlllIlIIlIIIIlIIlIIl;
    }
    
    private static void lIIIlIIlllllIlII() {
        (llIIIllIIIIlIl = new String[NBTTagByte.llIIIllIllIIIl[0]])[NBTTagByte.llIIIllIllIIIl[1]] = lIIIlIIlllllIIll("KxuacL3A9h8=", "SpVTy");
    }
    
    @Override
    public short getShort() {
        return this.data;
    }
}
