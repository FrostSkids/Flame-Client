// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

public class ColorizerFoliage
{
    private static final /* synthetic */ int[] lIllIIIIlIIlII;
    private static /* synthetic */ int[] foliageBuffer;
    
    public static void setFoliageBiomeColorizer(final int[] lllllllllllllIIIIlIIIlIIIIlllllI) {
        ColorizerFoliage.foliageBuffer = lllllllllllllIIIIlIIIlIIIIlllllI;
    }
    
    public static int getFoliageColorBirch() {
        return ColorizerFoliage.lIllIIIIlIIlII[3];
    }
    
    static {
        llllIllIIllIIIl();
        ColorizerFoliage.foliageBuffer = new int[ColorizerFoliage.lIllIIIIlIIlII[0]];
    }
    
    public static int getFoliageColor(final double lllllllllllllIIIIlIIIlIIIIllIlIl, double lllllllllllllIIIIlIIIlIIIIllIlII) {
        lllllllllllllIIIIlIIIlIIIIllIlII *= (long)lllllllllllllIIIIlIIIlIIIIllIlIl;
        final int lllllllllllllIIIIlIIIlIIIIllIlll = (int)((1.0 - lllllllllllllIIIIlIIIlIIIIllIlIl) * 255.0);
        final int lllllllllllllIIIIlIIIlIIIIllIllI = (int)((1.0 - lllllllllllllIIIIlIIIlIIIIllIlII) * 255.0);
        return ColorizerFoliage.foliageBuffer[lllllllllllllIIIIlIIIlIIIIllIllI << ColorizerFoliage.lIllIIIIlIIlII[1] | lllllllllllllIIIIlIIIlIIIIllIlll];
    }
    
    public static int getFoliageColorBasic() {
        return ColorizerFoliage.lIllIIIIlIIlII[4];
    }
    
    private static void llllIllIIllIIIl() {
        (lIllIIIIlIIlII = new int[5])[0] = (0xFFFFF47A & 0x10B85);
        ColorizerFoliage.lIllIIIIlIIlII[1] = (0x16 ^ 0x1E);
        ColorizerFoliage.lIllIIIIlIIlII[2] = (0xFFFFD9ED & 0x61BF73);
        ColorizerFoliage.lIllIIIIlIIlII[3] = (-(0xFFFFD95B & 0x7EAD) & (0xFFFFFF5F & 0x80FFFD));
        ColorizerFoliage.lIllIIIIlIIlII[4] = (-(0xFFFFDEF3 & 0x6BEE) & (0xFFFFFFF9 & 0x48FFFF));
    }
    
    public static int getFoliageColorPine() {
        return ColorizerFoliage.lIllIIIIlIIlII[2];
    }
}
