// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

public class NBTTagInt extends NBTPrimitive
{
    private /* synthetic */ int data;
    private static final /* synthetic */ int[] llIIlIIIlllllI;
    
    @Override
    public byte getByte() {
        return (byte)(this.data & NBTTagInt.llIIlIIIlllllI[4]);
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagInt(this.data);
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagInt.llIIlIIIlllllI[0];
    }
    
    @Override
    public short getShort() {
        return (short)(this.data & NBTTagInt.llIIlIIIlllllI[3]);
    }
    
    @Override
    void write(final DataOutput llllllllllllIlllIIlIllIlllIlIIlI) throws IOException {
        llllllllllllIlllIIlIllIlllIlIIlI.writeInt(this.data);
    }
    
    @Override
    public int getInt() {
        return this.data;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllIIlIllIllIllllII) {
        if (!lIIIllIIIIlIIIIl(super.equals(llllllllllllIlllIIlIllIllIllllII) ? 1 : 0)) {
            return NBTTagInt.llIIlIIIlllllI[2] != 0;
        }
        final NBTTagInt llllllllllllIlllIIlIllIllIlllIll = (NBTTagInt)llllllllllllIlllIIlIllIllIllllII;
        if (lIIIllIIIIlIIIlI(this.data, llllllllllllIlllIIlIllIllIlllIll.data)) {
            return NBTTagInt.llIIlIIIlllllI[1] != 0;
        }
        return NBTTagInt.llIIlIIIlllllI[2] != 0;
    }
    
    private static boolean lIIIllIIIIlIIIlI(final int llllllllllllIlllIIlIllIllIlIIIII, final int llllllllllllIlllIIlIllIllIIlllll) {
        return llllllllllllIlllIIlIllIllIlIIIII == llllllllllllIlllIIlIllIllIIlllll;
    }
    
    private static void lIIIllIIIIlIIIII() {
        (llIIlIIIlllllI = new int[5])[0] = "   ".length();
        NBTTagInt.llIIlIIIlllllI[1] = " ".length();
        NBTTagInt.llIIlIIIlllllI[2] = ((0xBA ^ 0x81) & ~(0xAC ^ 0x97));
        NBTTagInt.llIIlIIIlllllI[3] = (-" ".length() & (-1 & 0xFFFF));
        NBTTagInt.llIIlIIIlllllI[4] = (0x35 ^ 0x68) + (0x67 ^ 0x6B) - -(0x2D ^ 0x68) + (0x9 ^ 0x58);
    }
    
    @Override
    void read(final DataInput llllllllllllIlllIIlIllIlllIIlIIl, final int llllllllllllIlllIIlIllIlllIIllII, final NBTSizeTracker llllllllllllIlllIIlIllIlllIIlIll) throws IOException {
        llllllllllllIlllIIlIllIlllIIlIll.read(96L);
        this.data = llllllllllllIlllIIlIllIlllIIlIIl.readInt();
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data;
    }
    
    @Override
    public float getFloat() {
        return (float)this.data;
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    private static boolean lIIIllIIIIlIIIIl(final int llllllllllllIlllIIlIllIllIIlllIl) {
        return llllllllllllIlllIIlIllIllIIlllIl != 0;
    }
    
    static {
        lIIIllIIIIlIIIII();
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(this.data));
    }
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    NBTTagInt() {
    }
    
    public NBTTagInt(final int llllllllllllIlllIIlIllIlllIllIlI) {
        this.data = llllllllllllIlllIIlIllIlllIllIlI;
    }
}
