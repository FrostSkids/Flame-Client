// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class NBTTagLong extends NBTPrimitive
{
    private static final /* synthetic */ int[] lIllIlIllIlIlI;
    private static final /* synthetic */ String[] lIllIlIllIlIIl;
    private /* synthetic */ long data;
    
    private static int lllllllIIIIIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    @Override
    public short getShort() {
        return (short)(this.data & 0xFFFFL);
    }
    
    private static void lllllllIIIIIIlI() {
        (lIllIlIllIlIlI = new int[4])[0] = (0x43 ^ 0x67 ^ (0x7D ^ 0x5D));
        NBTTagLong.lIllIlIllIlIlI[1] = ((0x73 ^ 0x6C) & ~(0x23 ^ 0x3C));
        NBTTagLong.lIllIlIllIlIlI[2] = " ".length();
        NBTTagLong.lIllIlIllIlIlI[3] = (0x45 ^ 0x67 ^ "  ".length());
    }
    
    private static String lllllllIIIIIIII(String llllllllllllIllllllllIllIlIlIlIl, final String llllllllllllIllllllllIllIlIlIlII) {
        llllllllllllIllllllllIllIlIlIlIl = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllllIllIlIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllllIllIlIllIII = new StringBuilder();
        final char[] llllllllllllIllllllllIllIlIlIlll = llllllllllllIllllllllIllIlIlIlII.toCharArray();
        int llllllllllllIllllllllIllIlIlIllI = NBTTagLong.lIllIlIllIlIlI[1];
        final String llllllllllllIllllllllIllIlIlIIII = (Object)((String)llllllllllllIllllllllIllIlIlIlIl).toCharArray();
        final byte llllllllllllIllllllllIllIlIIllll = (byte)llllllllllllIllllllllIllIlIlIIII.length;
        short llllllllllllIllllllllIllIlIIlllI = (short)NBTTagLong.lIllIlIllIlIlI[1];
        while (lllllllIIIIIllI(llllllllllllIllllllllIllIlIIlllI, llllllllllllIllllllllIllIlIIllll)) {
            final char llllllllllllIllllllllIllIlIllIll = llllllllllllIllllllllIllIlIlIIII[llllllllllllIllllllllIllIlIIlllI];
            llllllllllllIllllllllIllIlIllIII.append((char)(llllllllllllIllllllllIllIlIllIll ^ llllllllllllIllllllllIllIlIlIlll[llllllllllllIllllllllIllIlIlIllI % llllllllllllIllllllllIllIlIlIlll.length]));
            "".length();
            ++llllllllllllIllllllllIllIlIlIllI;
            ++llllllllllllIllllllllIllIlIIlllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllllIllIlIllIII);
    }
    
    private static void lllllllIIIIIIIl() {
        (lIllIlIllIlIIl = new String[NBTTagLong.lIllIlIllIlIlI[2]])[NBTTagLong.lIllIlIllIlIlI[1]] = lllllllIIIIIIII("NA==", "xPbpC");
    }
    
    public NBTTagLong(final long llllllllllllIllllllllIlllIIlllII) {
        this.data = llllllllllllIllllllllIlllIIlllII;
    }
    
    @Override
    public byte getByte() {
        return (byte)(this.data & 0xFFL);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.data ^ this.data >>> NBTTagLong.lIllIlIllIlIlI[3]);
    }
    
    private static boolean lllllllIIIIIllI(final int llllllllllllIllllllllIllIlIIlIlI, final int llllllllllllIllllllllIllIlIIlIIl) {
        return llllllllllllIllllllllIllIlIIlIlI < llllllllllllIllllllllIllIlIIlIIl;
    }
    
    @Override
    public float getFloat() {
        return (float)this.data;
    }
    
    private static boolean lllllllIIIIIlIl(final int llllllllllllIllllllllIllIlIIIlIl) {
        return llllllllllllIllllllllIllIlIIIlIl == 0;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllllllIllIllllIll) {
        if (!lllllllIIIIIlII(super.equals(llllllllllllIllllllllIllIllllIll) ? 1 : 0)) {
            return NBTTagLong.lIllIlIllIlIlI[1] != 0;
        }
        final NBTTagLong llllllllllllIllllllllIllIlllllIl = (NBTTagLong)llllllllllllIllllllllIllIllllIll;
        if (lllllllIIIIIlIl(lllllllIIIIIIll(this.data, llllllllllllIllllllllIllIlllllIl.data))) {
            return NBTTagLong.lIllIlIllIlIlI[2] != 0;
        }
        return NBTTagLong.lIllIlIllIlIlI[1] != 0;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagLong.lIllIlIllIlIlI[0];
    }
    
    NBTTagLong() {
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagLong(this.data);
    }
    
    @Override
    void read(final DataInput llllllllllllIllllllllIlllIIIlIll, final int llllllllllllIllllllllIlllIIIlllI, final NBTSizeTracker llllllllllllIllllllllIlllIIIllIl) throws IOException {
        llllllllllllIllllllllIlllIIIllIl.read(128L);
        this.data = llllllllllllIllllllllIlllIIIlIll.readLong();
    }
    
    private static boolean lllllllIIIIIlII(final int llllllllllllIllllllllIllIlIIIlll) {
        return llllllllllllIllllllllIllIlIIIlll != 0;
    }
    
    @Override
    public double getDouble() {
        return (double)this.data;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data).append(NBTTagLong.lIllIlIllIlIIl[NBTTagLong.lIllIlIllIlIlI[1]]));
    }
    
    static {
        lllllllIIIIIIlI();
        lllllllIIIIIIIl();
    }
    
    @Override
    public int getInt() {
        return (int)(this.data & -1L);
    }
    
    @Override
    void write(final DataOutput llllllllllllIllllllllIlllIIlIlII) throws IOException {
        llllllllllllIllllllllIlllIIlIlII.writeLong(this.data);
    }
}
