// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;

public class ScaledResolution
{
    private /* synthetic */ int scaledHeight;
    private final /* synthetic */ double scaledWidthD;
    private /* synthetic */ int scaleFactor;
    private /* synthetic */ int scaledWidth;
    private final /* synthetic */ double scaledHeightD;
    private static final /* synthetic */ int[] lIIlIIIIlIIlII;
    
    public int getScaledWidth() {
        return this.scaledWidth;
    }
    
    public ScaledResolution(final Minecraft lllllllllllllIIlllIlllIIIIIIllIl) {
        this.scaledWidth = lllllllllllllIIlllIlllIIIIIIllIl.displayWidth;
        this.scaledHeight = lllllllllllllIIlllIlllIIIIIIllIl.displayHeight;
        this.scaleFactor = ScaledResolution.lIIlIIIIlIIlII[0];
        final boolean lllllllllllllIIlllIlllIIIIIlIIII = lllllllllllllIIlllIlllIIIIIIllIl.isUnicode();
        int lllllllllllllIIlllIlllIIIIIIllll = lllllllllllllIIlllIlllIIIIIIllIl.gameSettings.guiScale;
        if (llIIlIIlIlllIII(lllllllllllllIIlllIlllIIIIIIllll)) {
            lllllllllllllIIlllIlllIIIIIIllll = ScaledResolution.lIIlIIIIlIIlII[1];
            "".length();
            if ("  ".length() <= " ".length()) {
                throw null;
            }
        }
        while (llIIlIIlIlllIIl(this.scaleFactor, lllllllllllllIIlllIlllIIIIIIllll) && llIIlIIlIlllIlI(this.scaledWidth / (this.scaleFactor + ScaledResolution.lIIlIIIIlIIlII[0]), ScaledResolution.lIIlIIIIlIIlII[2]) && !llIIlIIlIlllIIl(this.scaledHeight / (this.scaleFactor + ScaledResolution.lIIlIIIIlIIlII[0]), ScaledResolution.lIIlIIIIlIIlII[3])) {
            this.scaleFactor += ScaledResolution.lIIlIIIIlIIlII[0];
        }
        if (llIIlIIlIlllIll(lllllllllllllIIlllIlllIIIIIlIIII ? 1 : 0) && llIIlIIlIlllIll(this.scaleFactor % ScaledResolution.lIIlIIIIlIIlII[4]) && llIIlIIlIllllII(this.scaleFactor, ScaledResolution.lIIlIIIIlIIlII[0])) {
            this.scaleFactor -= ScaledResolution.lIIlIIIIlIIlII[0];
        }
        this.scaledWidthD = this.scaledWidth / (double)this.scaleFactor;
        this.scaledHeightD = this.scaledHeight / (double)this.scaleFactor;
        this.scaledWidth = MathHelper.ceiling_double_int(this.scaledWidthD);
        this.scaledHeight = MathHelper.ceiling_double_int(this.scaledHeightD);
    }
    
    private static boolean llIIlIIlIlllIll(final int lllllllllllllIIlllIllIllllllIIlI) {
        return lllllllllllllIIlllIllIllllllIIlI != 0;
    }
    
    public int getScaledHeight() {
        return this.scaledHeight;
    }
    
    private static boolean llIIlIIlIlllIIl(final int lllllllllllllIIlllIllIllllllIlIl, final int lllllllllllllIIlllIllIllllllIlII) {
        return lllllllllllllIIlllIllIllllllIlIl < lllllllllllllIIlllIllIllllllIlII;
    }
    
    static {
        llIIlIIlIllIlll();
    }
    
    private static boolean llIIlIIlIlllIlI(final int lllllllllllllIIlllIllIlllllllIIl, final int lllllllllllllIIlllIllIlllllllIII) {
        return lllllllllllllIIlllIllIlllllllIIl >= lllllllllllllIIlllIllIlllllllIII;
    }
    
    private static void llIIlIIlIllIlll() {
        (lIIlIIIIlIIlII = new int[5])[0] = " ".length();
        ScaledResolution.lIIlIIIIlIIlII[1] = (-(0xFFFFEDFD & 0x1A17) & (0xFFFFEBFF & 0x1FFC));
        ScaledResolution.lIIlIIIIlIIlII[2] = (0xFFFFBB68 & 0x45D7);
        ScaledResolution.lIIlIIIIlIIlII[3] = (0x92 ^ 0x82) + (95 + 134 - 134 + 78) - (145 + 10 - 104 + 129) + (49 + 30 - 66 + 218);
        ScaledResolution.lIIlIIIIlIIlII[4] = "  ".length();
    }
    
    private static boolean llIIlIIlIlllIII(final int lllllllllllllIIlllIllIllllllIIII) {
        return lllllllllllllIIlllIllIllllllIIII == 0;
    }
    
    public double getScaledWidth_double() {
        return this.scaledWidthD;
    }
    
    public double getScaledHeight_double() {
        return this.scaledHeightD;
    }
    
    public int getScaleFactor() {
        return this.scaleFactor;
    }
    
    private static boolean llIIlIIlIllllII(final int lllllllllllllIIlllIllIlllllIllIl, final int lllllllllllllIIlllIllIlllllIllII) {
        return lllllllllllllIIlllIllIlllllIllIl != lllllllllllllIIlllIllIlllllIllII;
    }
}
