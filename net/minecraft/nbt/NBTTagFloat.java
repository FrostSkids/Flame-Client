// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import net.minecraft.util.MathHelper;

public class NBTTagFloat extends NBTPrimitive
{
    private /* synthetic */ float data;
    private static final /* synthetic */ int[] llIIllIllllIIl;
    private static final /* synthetic */ String[] llIIllIllllIII;
    
    public NBTTagFloat(final float llllllllllllIllIllllllIIllllllIl) {
        this.data = llllllllllllIllIllllllIIllllllIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data).append(NBTTagFloat.llIIllIllllIII[NBTTagFloat.llIIllIllllIIl[1]]));
    }
    
    @Override
    public int getInt() {
        return MathHelper.floor_float(this.data);
    }
    
    private static boolean lIIIllllIIlllIlI(final int llllllllllllIllIllllllIIlIllIlIl) {
        return llllllllllllIllIllllllIIlIllIlIl == 0;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagFloat(this.data);
    }
    
    private static void lIIIllllIIllIlll() {
        (llIIllIllllIIl = new int[6])[0] = (0x67 ^ 0x62);
        NBTTagFloat.llIIllIllllIIl[1] = (("   ".length() ^ (0xD8 ^ 0xBB)) & (0x78 ^ 0x35 ^ (0x5D ^ 0x70) ^ -" ".length()));
        NBTTagFloat.llIIllIllllIIl[2] = " ".length();
        NBTTagFloat.llIIllIllllIIl[3] = (-" ".length() & (-1 & 0xFFFF));
        NBTTagFloat.llIIllIllllIIl[4] = (0xFE ^ 0x98) + (144 + 85 - 90 + 53) - (189 + 181 - 256 + 96) + (24 + 160 - 80 + 67);
        NBTTagFloat.llIIllIllllIIl[5] = "  ".length();
    }
    
    private static boolean lIIIllllIIlllIIl(final int llllllllllllIllIllllllIIlIllIlll) {
        return llllllllllllIllIllllllIIlIllIlll != 0;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagFloat.llIIllIllllIIl[0];
    }
    
    @Override
    public long getLong() {
        return (long)this.data;
    }
    
    private static int lIIIllllIIlllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.data);
    }
    
    @Override
    public byte getByte() {
        return (byte)(MathHelper.floor_float(this.data) & NBTTagFloat.llIIllIllllIIl[4]);
    }
    
    private static void lIIIllllIIllIllI() {
        (llIIllIllllIII = new String[NBTTagFloat.llIIllIllllIIl[2]])[NBTTagFloat.llIIllIllllIIl[1]] = lIIIllllIIllIlIl("N1CL/FnoiE4=", "fjCLV");
    }
    
    @Override
    void read(final DataInput llllllllllllIllIllllllIIllllIIII, final int llllllllllllIllIllllllIIlllIllll, final NBTSizeTracker llllllllllllIllIllllllIIlllIlIll) throws IOException {
        llllllllllllIllIllllllIIlllIlIll.read(96L);
        this.data = llllllllllllIllIllllllIIllllIIII.readFloat();
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllllllIIllIlllII) {
        if (!lIIIllllIIlllIIl(super.equals(llllllllllllIllIllllllIIllIlllII) ? 1 : 0)) {
            return NBTTagFloat.llIIllIllllIIl[1] != 0;
        }
        final NBTTagFloat llllllllllllIllIllllllIIllIllllI = (NBTTagFloat)llllllllllllIllIllllllIIllIlllII;
        if (lIIIllllIIlllIlI(lIIIllllIIlllIII(this.data, llllllllllllIllIllllllIIllIllllI.data))) {
            return NBTTagFloat.llIIllIllllIIl[2] != 0;
        }
        return NBTTagFloat.llIIllIllllIIl[1] != 0;
    }
    
    @Override
    public float getFloat() {
        return this.data;
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    @Override
    void write(final DataOutput llllllllllllIllIllllllIIllllIlll) throws IOException {
        llllllllllllIllIllllllIIllllIlll.writeFloat(this.data);
    }
    
    private static String lIIIllllIIllIlIl(final String llllllllllllIllIllllllIIlIllllII, final String llllllllllllIllIllllllIIlIllllIl) {
        try {
            final SecretKeySpec llllllllllllIllIllllllIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllllIIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllllIIllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllllIIllIIIIII.init(NBTTagFloat.llIIllIllllIIl[5], llllllllllllIllIllllllIIllIIIIIl);
            return new String(llllllllllllIllIllllllIIllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllllIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllllIIlIllllll) {
            llllllllllllIllIllllllIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    NBTTagFloat() {
    }
    
    static {
        lIIIllllIIllIlll();
        lIIIllllIIllIllI();
    }
    
    @Override
    public short getShort() {
        return (short)(MathHelper.floor_float(this.data) & NBTTagFloat.llIIllIllllIIl[3]);
    }
}
