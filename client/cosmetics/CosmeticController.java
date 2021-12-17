// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics;

import net.minecraft.client.entity.AbstractClientPlayer;

public class CosmeticController
{
    private static final /* synthetic */ int[] lIIlllIIIIIllI;
    
    static {
        llIllIlIlIIIlIl();
    }
    
    public static float[] getTopHatColor(final AbstractClientPlayer lllllllllllllIIlIlIIlIIIIIlllIll) {
        final float[] array = new float[CosmeticController.lIIlllIIIIIllI[1]];
        array[CosmeticController.lIIlllIIIIIllI[2]] = 0.0f;
        array[CosmeticController.lIIlllIIIIIllI[0]] = 0.0f;
        array[CosmeticController.lIIlllIIIIIllI[3]] = 0.0f;
        return array;
    }
    
    public static boolean shouldRenderTopHat(final AbstractClientPlayer lllllllllllllIIlIlIIlIIIIIllllII) {
        return CosmeticController.lIIlllIIIIIllI[0] != 0;
    }
    
    private static void llIllIlIlIIIlIl() {
        (lIIlllIIIIIllI = new int[4])[0] = " ".length();
        CosmeticController.lIIlllIIIIIllI[1] = "   ".length();
        CosmeticController.lIIlllIIIIIllI[2] = ((0x46 ^ 0x54) & ~(0x8B ^ 0x99));
        CosmeticController.lIIlllIIIIIllI[3] = "  ".length();
    }
}
