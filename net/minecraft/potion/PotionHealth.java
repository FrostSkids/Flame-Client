// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import net.minecraft.util.ResourceLocation;

public class PotionHealth extends Potion
{
    private static final /* synthetic */ int[] lIlIlIIllIllIl;
    
    @Override
    public boolean isReady(final int lllllllllllllIIIlIIlIIllIIlllIIl, final int lllllllllllllIIIlIIlIIllIIlllIII) {
        if (lllIllIlIIllIII(lllllllllllllIIIlIIlIIllIIlllIIl, PotionHealth.lIlIlIIllIllIl[0])) {
            return PotionHealth.lIlIlIIllIllIl[0] != 0;
        }
        return PotionHealth.lIlIlIIllIllIl[1] != 0;
    }
    
    private static void lllIllIlIIlIlll() {
        (lIlIlIIllIllIl = new int[2])[0] = " ".length();
        PotionHealth.lIlIlIIllIllIl[1] = ((0x77 ^ 0x71) & ~(0x66 ^ 0x60));
    }
    
    public PotionHealth(final int lllllllllllllIIIlIIlIIllIlIIIIII, final ResourceLocation lllllllllllllIIIlIIlIIllIIllllll, final boolean lllllllllllllIIIlIIlIIllIIlllllI, final int lllllllllllllIIIlIIlIIllIIllllIl) {
        super(lllllllllllllIIIlIIlIIllIlIIIIII, lllllllllllllIIIlIIlIIllIIllllll, lllllllllllllIIIlIIlIIllIIlllllI, lllllllllllllIIIlIIlIIllIIllllIl);
    }
    
    @Override
    public boolean isInstant() {
        return PotionHealth.lIlIlIIllIllIl[0] != 0;
    }
    
    private static boolean lllIllIlIIllIII(final int lllllllllllllIIIlIIlIIllIIllIlII, final int lllllllllllllIIIlIIlIIllIIllIIll) {
        return lllllllllllllIIIlIIlIIllIIllIlII >= lllllllllllllIIIlIIlIIllIIllIIll;
    }
    
    static {
        lllIllIlIIlIlll();
    }
}
