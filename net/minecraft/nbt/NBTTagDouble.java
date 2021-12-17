// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import net.minecraft.util.MathHelper;
import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class NBTTagDouble extends NBTPrimitive
{
    private static final /* synthetic */ String[] lIIIlllIlIIlll;
    private /* synthetic */ double data;
    private static final /* synthetic */ int[] lIIIlllIlIlIIl;
    
    @Override
    public float getFloat() {
        return (float)this.data;
    }
    
    private static void llIIIllIlIIlIII() {
        (lIIIlllIlIIlll = new String[NBTTagDouble.lIIIlllIlIlIIl[2]])[NBTTagDouble.lIIIlllIlIlIIl[1]] = llIIIllIlIIIlll("R7ofHoprnHc=", "uZDBx");
    }
    
    static {
        llIIIllIlIIlIll();
        llIIIllIlIIlIII();
    }
    
    @Override
    public long getLong() {
        return (long)Math.floor(this.data);
    }
    
    private static String llIIIllIlIIIlll(final String lllllllllllllIIlllllIIIlIllllllI, final String lllllllllllllIIlllllIIIlIlllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIIIllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIIlIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllIIIllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllIIIllIIIIIII.init(NBTTagDouble.lIIIlllIlIlIIl[6], lllllllllllllIIlllllIIIllIIIIIIl);
            return new String(lllllllllllllIIlllllIIIllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIIIlIlllllll) {
            lllllllllllllIIlllllIIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    void write(final DataOutput lllllllllllllIIlllllIIIllIlllIII) throws IOException {
        lllllllllllllIIlllllIIIllIlllIII.writeDouble(this.data);
    }
    
    private static void llIIIllIlIIlIll() {
        (lIIIlllIlIlIIl = new int[7])[0] = (0x1C ^ 0x1A);
        NBTTagDouble.lIIIlllIlIlIIl[1] = ((0x19 ^ 0x5) & ~(0x79 ^ 0x65));
        NBTTagDouble.lIIIlllIlIlIIl[2] = " ".length();
        NBTTagDouble.lIIIlllIlIlIIl[3] = (0xF2 ^ 0x9C ^ (0x7D ^ 0x33));
        NBTTagDouble.lIIIlllIlIlIIl[4] = (-" ".length() & (-1 & 0xFFFF));
        NBTTagDouble.lIIIlllIlIlIIl[5] = 241 + 19 - 227 + 222;
        NBTTagDouble.lIIIlllIlIlIIl[6] = "  ".length();
    }
    
    private static boolean llIIIllIlIIllIl(final int lllllllllllllIIlllllIIIlIlllIlll) {
        return lllllllllllllIIlllllIIIlIlllIlll != 0;
    }
    
    @Override
    void read(final DataInput lllllllllllllIIlllllIIIllIlIllll, final int lllllllllllllIIlllllIIIllIllIIlI, final NBTSizeTracker lllllllllllllIIlllllIIIllIllIIIl) throws IOException {
        lllllllllllllIIlllllIIIllIllIIIl.read(128L);
        this.data = lllllllllllllIIlllllIIIllIlIllll.readDouble();
    }
    
    @Override
    public int getInt() {
        return MathHelper.floor_double(this.data);
    }
    
    @Override
    public short getShort() {
        return (short)(MathHelper.floor_double(this.data) & NBTTagDouble.lIIIlllIlIlIIl[4]);
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    private static int llIIIllIlIIllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data).append(NBTTagDouble.lIIIlllIlIIlll[NBTTagDouble.lIIIlllIlIlIIl[1]]));
    }
    
    @Override
    public byte getByte() {
        return (byte)(MathHelper.floor_double(this.data) & NBTTagDouble.lIIIlllIlIlIIl[5]);
    }
    
    public NBTTagDouble(final double lllllllllllllIIlllllIIIllIlllllI) {
        this.data = lllllllllllllIIlllllIIIllIlllllI;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagDouble(this.data);
    }
    
    @Override
    public int hashCode() {
        final long lllllllllllllIIlllllIIIllIIllIlI = Double.doubleToLongBits(this.data);
        return super.hashCode() ^ (int)(lllllllllllllIIlllllIIIllIIllIlI ^ lllllllllllllIIlllllIIIllIIllIlI >>> NBTTagDouble.lIIIlllIlIlIIl[3]);
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlllllIIIllIlIIIlI) {
        if (!llIIIllIlIIllIl(super.equals(lllllllllllllIIlllllIIIllIlIIIlI) ? 1 : 0)) {
            return NBTTagDouble.lIIIlllIlIlIIl[1] != 0;
        }
        final NBTTagDouble lllllllllllllIIlllllIIIllIlIIIIl = (NBTTagDouble)lllllllllllllIIlllllIIIllIlIIIlI;
        if (llIIIllIlIIlllI(llIIIllIlIIllII(this.data, lllllllllllllIIlllllIIIllIlIIIIl.data))) {
            return NBTTagDouble.lIIIlllIlIlIIl[2] != 0;
        }
        return NBTTagDouble.lIIIlllIlIlIIl[1] != 0;
    }
    
    private static boolean llIIIllIlIIlllI(final int lllllllllllllIIlllllIIIlIlllIlIl) {
        return lllllllllllllIIlllllIIIlIlllIlIl == 0;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagDouble.lIIIlllIlIlIIl[0];
    }
    
    NBTTagDouble() {
    }
}
