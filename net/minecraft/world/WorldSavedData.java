// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.nbt.NBTTagCompound;

public abstract class WorldSavedData
{
    private /* synthetic */ boolean dirty;
    private static final /* synthetic */ int[] lIIIllllIlllll;
    public final /* synthetic */ String mapName;
    
    public void setDirty(final boolean lllllllllllllIIllllIIlIlIIlllIIl) {
        this.dirty = lllllllllllllIIllllIIlIlIIlllIIl;
    }
    
    static {
        llIIlIIIIIlIIll();
    }
    
    public void markDirty() {
        this.setDirty((boolean)(WorldSavedData.lIIIllllIlllll[0] != 0));
    }
    
    public abstract void writeToNBT(final NBTTagCompound p0);
    
    public WorldSavedData(final String lllllllllllllIIllllIIlIlIlIIIlII) {
        this.mapName = lllllllllllllIIllllIIlIlIlIIIlII;
    }
    
    public abstract void readFromNBT(final NBTTagCompound p0);
    
    private static void llIIlIIIIIlIIll() {
        (lIIIllllIlllll = new int[1])[0] = " ".length();
    }
    
    public boolean isDirty() {
        return this.dirty;
    }
}
