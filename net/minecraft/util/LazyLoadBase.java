// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public abstract class LazyLoadBase<T>
{
    private /* synthetic */ T value;
    private static final /* synthetic */ int[] lIIlIIIIIlIIII;
    private /* synthetic */ boolean isLoaded;
    
    public T getValue() {
        if (llIIlIIlIIIlIll(this.isLoaded ? 1 : 0)) {
            this.isLoaded = (LazyLoadBase.lIIlIIIIIlIIII[1] != 0);
            this.value = this.load();
        }
        return this.value;
    }
    
    static {
        llIIlIIlIIIlIlI();
    }
    
    private static boolean llIIlIIlIIIlIll(final int lllllllllllllIIlllIllllIIIlllIll) {
        return lllllllllllllIIlllIllllIIIlllIll == 0;
    }
    
    protected abstract T load();
    
    private static void llIIlIIlIIIlIlI() {
        (lIIlIIIIIlIIII = new int[2])[0] = ((0xEB ^ 0xA1) & ~(0x62 ^ 0x28));
        LazyLoadBase.lIIlIIIIIlIIII[1] = " ".length();
    }
    
    public LazyLoadBase() {
        this.isLoaded = (LazyLoadBase.lIIlIIIIIlIIII[0] != 0);
    }
}
