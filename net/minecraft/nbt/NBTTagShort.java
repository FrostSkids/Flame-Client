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
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class NBTTagShort extends NBTPrimitive
{
    private static final /* synthetic */ String[] llIIIlllIlllII;
    private /* synthetic */ short data;
    private static final /* synthetic */ int[] llIIIlllIlllll;
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagShort.llIIIlllIlllll[0];
    }
    
    private static void lIIIlIllIIIIIIII() {
        (llIIIlllIlllII = new String[NBTTagShort.llIIIlllIlllll[2]])[NBTTagShort.llIIIlllIlllll[1]] = lIIIlIlIllllllll("kjMFI+L+0WE=", "KTZnR");
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    private static boolean lIIIlIllIIIIllII(final int llllllllllllIlllIIllllllIllIIlII, final int llllllllllllIlllIIllllllIllIIIll) {
        return llllllllllllIlllIIllllllIllIIlII == llllllllllllIlllIIllllllIllIIIll;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagShort(this.data);
    }
    
    private static String lIIIlIlIllllllll(final String llllllllllllIlllIIllllllIllIllII, final String llllllllllllIlllIIllllllIllIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIllllllIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllllllIllIlIll.getBytes(StandardCharsets.UTF_8)), NBTTagShort.llIIIlllIlllll[4]), "DES");
            final Cipher llllllllllllIlllIIllllllIllIlllI = Cipher.getInstance("DES");
            llllllllllllIlllIIllllllIllIlllI.init(NBTTagShort.llIIIlllIlllll[0], llllllllllllIlllIIllllllIllIllll);
            return new String(llllllllllllIlllIIllllllIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllllllIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllllllIllIllIl) {
            llllllllllllIlllIIllllllIllIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public byte getByte() {
        return (byte)(this.data & NBTTagShort.llIIIlllIlllll[3]);
    }
    
    private static boolean lIIIlIllIIIIlIlI(final int llllllllllllIlllIIllllllIllIIIIl) {
        return llllllllllllIlllIIllllllIllIIIIl != 0;
    }
    
    private static void lIIIlIllIIIIlIIl() {
        (llIIIlllIlllll = new int[5])[0] = "  ".length();
        NBTTagShort.llIIIlllIlllll[1] = ((0xD4 ^ 0x9B) & ~(0x56 ^ 0x19));
        NBTTagShort.llIIIlllIlllll[2] = " ".length();
        NBTTagShort.llIIIlllIlllll[3] = 83 + 132 - 161 + 201;
        NBTTagShort.llIIIlllIlllll[4] = (0x8E ^ 0x86);
    }
    
    @Override
    void read(final DataInput llllllllllllIlllIIlllllllIIllIlI, final int llllllllllllIlllIIlllllllIIlllIl, final NBTSizeTracker llllllllllllIlllIIlllllllIIllIIl) throws IOException {
        llllllllllllIlllIIlllllllIIllIIl.read(80L);
        this.data = llllllllllllIlllIIlllllllIIllIlI.readShort();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data;
    }
    
    @Override
    public int getInt() {
        return this.data;
    }
    
    public NBTTagShort() {
    }
    
    public NBTTagShort(final short llllllllllllIlllIIlllllllIlIlIll) {
        this.data = llllllllllllIlllIIlllllllIlIlIll;
    }
    
    @Override
    public short getShort() {
        return this.data;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllIIlllllllIIIlIlI) {
        if (!lIIIlIllIIIIlIlI(super.equals(llllllllllllIlllIIlllllllIIIlIlI) ? 1 : 0)) {
            return NBTTagShort.llIIIlllIlllll[1] != 0;
        }
        final NBTTagShort llllllllllllIlllIIlllllllIIIllII = (NBTTagShort)llllllllllllIlllIIlllllllIIIlIlI;
        if (lIIIlIllIIIIllII(this.data, llllllllllllIlllIIlllllllIIIllII.data)) {
            return NBTTagShort.llIIIlllIlllll[2] != 0;
        }
        return NBTTagShort.llIIIlllIlllll[1] != 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data).append(NBTTagShort.llIIIlllIlllII[NBTTagShort.llIIIlllIlllll[1]]));
    }
    
    @Override
    public float getFloat() {
        return this.data;
    }
    
    @Override
    void write(final DataOutput llllllllllllIlllIIlllllllIlIIlIl) throws IOException {
        llllllllllllIlllIIlllllllIlIIlIl.writeShort(this.data);
    }
    
    static {
        lIIIlIllIIIIlIIl();
        lIIIlIllIIIIIIII();
    }
}
