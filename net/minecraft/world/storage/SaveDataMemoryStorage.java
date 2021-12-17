// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.world.WorldSavedData;

public class SaveDataMemoryStorage extends MapStorage
{
    private static final /* synthetic */ int[] llIIIIlIllIlII;
    
    public SaveDataMemoryStorage() {
        super(null);
    }
    
    @Override
    public WorldSavedData loadData(final Class<? extends WorldSavedData> llllllllllllIlllIllIlllIlIlIIlll, final String llllllllllllIlllIllIlllIlIlIIlII) {
        return this.loadedDataMap.get(llllllllllllIlllIllIlllIlIlIIlII);
    }
    
    static {
        lIIIIllllllllIlI();
    }
    
    @Override
    public void setData(final String llllllllllllIlllIllIlllIlIIlllII, final WorldSavedData llllllllllllIlllIllIlllIlIIllllI) {
        this.loadedDataMap.put(llllllllllllIlllIllIlllIlIIlllII, llllllllllllIlllIllIlllIlIIllllI);
        "".length();
    }
    
    private static void lIIIIllllllllIlI() {
        (llIIIIlIllIlII = new int[1])[0] = ((0x73 ^ 0x7B ^ (0x64 ^ 0x4C)) & (0x24 ^ 0x43 ^ (0x14 ^ 0x53) ^ -" ".length()));
    }
    
    @Override
    public void saveAllData() {
    }
    
    @Override
    public int getUniqueDataId(final String llllllllllllIlllIllIlllIlIIllIII) {
        return SaveDataMemoryStorage.llIIIIlIllIlII[0];
    }
}
