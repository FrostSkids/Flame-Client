// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagList;

public class Rotations
{
    protected final /* synthetic */ float y;
    protected final /* synthetic */ float x;
    protected final /* synthetic */ float z;
    private static final /* synthetic */ int[] lIIllIllIlIIll;
    
    public NBTTagList writeToNBT() {
        final NBTTagList lllllllllllllIIlIlIIllIllIllIIll = new NBTTagList();
        lllllllllllllIIlIlIIllIllIllIIll.appendTag(new NBTTagFloat(this.x));
        lllllllllllllIIlIlIIllIllIllIIll.appendTag(new NBTTagFloat(this.y));
        lllllllllllllIIlIlIIllIllIllIIll.appendTag(new NBTTagFloat(this.z));
        return lllllllllllllIIlIlIIllIllIllIIll;
    }
    
    public float getZ() {
        return this.z;
    }
    
    public float getX() {
        return this.x;
    }
    
    private static int llIllIIlllIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Rotations(final float lllllllllllllIIlIlIIllIlllIlIIlI, final float lllllllllllllIIlIlIIllIlllIIlIIl, final float lllllllllllllIIlIlIIllIlllIIlllI) {
        this.x = lllllllllllllIIlIlIIllIlllIlIIlI;
        this.y = lllllllllllllIIlIlIIllIlllIIlIIl;
        this.z = lllllllllllllIIlIlIIllIlllIIlllI;
    }
    
    static {
        llIllIIlllIIllI();
    }
    
    private static void llIllIIlllIIllI() {
        (lIIllIllIlIIll = new int[3])[0] = ((0x52 ^ 0x24 ^ (0x35 ^ 0x5F)) & (170 + 102 - 209 + 154 ^ 60 + 121 - 46 + 62 ^ -" ".length()));
        Rotations.lIIllIllIlIIll[1] = " ".length();
        Rotations.lIIllIllIlIIll[2] = "  ".length();
    }
    
    public Rotations(final NBTTagList lllllllllllllIIlIlIIllIllIllllII) {
        this.x = lllllllllllllIIlIlIIllIllIllllII.getFloatAt(Rotations.lIIllIllIlIIll[0]);
        this.y = lllllllllllllIIlIlIIllIllIllllII.getFloatAt(Rotations.lIIllIllIlIIll[1]);
        this.z = lllllllllllllIIlIlIIllIllIllllII.getFloatAt(Rotations.lIIllIllIlIIll[2]);
    }
    
    private static boolean llIllIIlllIlIII(final int lllllllllllllIIlIlIIllIllIIIlIIl) {
        return lllllllllllllIIlIlIIllIllIIIlIIl == 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIlIIllIllIIllllI) {
        if (llIllIIlllIlIII((lllllllllllllIIlIlIIllIllIIllllI instanceof Rotations) ? 1 : 0)) {
            return Rotations.lIIllIllIlIIll[0] != 0;
        }
        final Rotations lllllllllllllIIlIlIIllIllIlIIIIl = (Rotations)lllllllllllllIIlIlIIllIllIIllllI;
        if (llIllIIlllIlIII(llIllIIlllIIlll(this.x, lllllllllllllIIlIlIIllIllIlIIIIl.x)) && llIllIIlllIlIII(llIllIIlllIIlll(this.y, lllllllllllllIIlIlIIllIllIlIIIIl.y)) && llIllIIlllIlIII(llIllIIlllIIlll(this.z, lllllllllllllIIlIlIIllIllIlIIIIl.z))) {
            return Rotations.lIIllIllIlIIll[1] != 0;
        }
        return Rotations.lIIllIllIlIIll[0] != 0;
    }
    
    public float getY() {
        return this.y;
    }
}
