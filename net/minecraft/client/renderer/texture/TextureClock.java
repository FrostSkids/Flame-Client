// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;

public class TextureClock extends TextureAtlasSprite
{
    private static final /* synthetic */ int[] lIlIlIIllIllll;
    private /* synthetic */ double field_94239_h;
    private /* synthetic */ double field_94240_i;
    
    @Override
    public void updateAnimation() {
        if (lllIllIlIIlllII(this.framesTextureData.isEmpty() ? 1 : 0)) {
            final Minecraft lllllllllllllIIIlIIlIIllIIlIIllI = Minecraft.getMinecraft();
            double lllllllllllllIIIlIIlIIllIIlIIlIl = 0.0;
            if (lllIllIlIIlllIl(lllllllllllllIIIlIIlIIllIIlIIllI.theWorld) && lllIllIlIIlllIl(lllllllllllllIIIlIIlIIllIIlIIllI.thePlayer)) {
                lllllllllllllIIIlIIlIIllIIlIIlIl = lllllllllllllIIIlIIlIIllIIlIIllI.theWorld.getCelestialAngle(1.0f);
                if (lllIllIlIIlllII(lllllllllllllIIIlIIlIIllIIlIIllI.theWorld.provider.isSurfaceWorld() ? 1 : 0)) {
                    lllllllllllllIIIlIIlIIllIIlIIlIl = Math.random();
                }
            }
            double lllllllllllllIIIlIIlIIllIIlIIlII = lllllllllllllIIIlIIlIIllIIlIIlIl - this.field_94239_h;
            "".length();
            if (-(0x7 ^ 0x5B ^ (0x47 ^ 0x1F)) > 0) {
                return;
            }
            while (!lllIllIlIIllllI(lllIllIlIIllIlI(lllllllllllllIIIlIIlIIllIIlIIlII, -0.5))) {
                ++lllllllllllllIIIlIIlIIllIIlIIlII;
            }
            "".length();
            if (-(0x58 ^ 0x5D) >= 0) {
                return;
            }
            while (!lllIllIlIIlllll(lllIllIlIIllIll(lllllllllllllIIIlIIlIIllIIlIIlII, 0.5))) {
                --lllllllllllllIIIlIIlIIllIIlIIlII;
            }
            lllllllllllllIIIlIIlIIllIIlIIlII = MathHelper.clamp_double(lllllllllllllIIIlIIlIIllIIlIIlII, -1.0, 1.0);
            this.field_94240_i += lllllllllllllIIIlIIlIIllIIlIIlII * 0.1;
            this.field_94240_i *= 0.8;
            this.field_94239_h += this.field_94240_i;
            int lllllllllllllIIIlIIlIIllIIlIIIll = (int)((this.field_94239_h + 1.0) * this.framesTextureData.size()) % this.framesTextureData.size();
            "".length();
            if (((0x8B ^ 0x8C ^ (0x16 ^ 0x20)) & (0xD1 ^ 0x80 ^ (0x68 ^ 0x8) ^ -" ".length())) >= (0x22 ^ 0x9 ^ (0x4D ^ 0x62))) {
                return;
            }
            while (!lllIllIlIIllllI(lllllllllllllIIIlIIlIIllIIlIIIll)) {
                lllllllllllllIIIlIIlIIllIIlIIIll = (lllllllllllllIIIlIIlIIllIIlIIIll + this.framesTextureData.size()) % this.framesTextureData.size();
            }
            if (lllIllIlIlIIIII(lllllllllllllIIIlIIlIIllIIlIIIll, this.frameCounter)) {
                this.frameCounter = lllllllllllllIIIlIIlIIllIIlIIIll;
                TextureUtil.uploadTextureMipmap(this.framesTextureData.get(this.frameCounter), this.width, this.height, this.originX, this.originY, (boolean)(TextureClock.lIlIlIIllIllll[0] != 0), (boolean)(TextureClock.lIlIlIIllIllll[0] != 0));
            }
        }
    }
    
    static {
        lllIllIlIIllIIl();
    }
    
    private static boolean lllIllIlIlIIIII(final int lllllllllllllIIIlIIlIIllIIIlIIll, final int lllllllllllllIIIlIIlIIllIIIlIIlI) {
        return lllllllllllllIIIlIIlIIllIIIlIIll != lllllllllllllIIIlIIlIIllIIIlIIlI;
    }
    
    public TextureClock(final String lllllllllllllIIIlIIlIIllIIlIllIl) {
        super(lllllllllllllIIIlIIlIIllIIlIllIl);
    }
    
    private static int lllIllIlIIllIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllIllIlIIllllI(final int lllllllllllllIIIlIIlIIllIIIllIII) {
        return lllllllllllllIIIlIIlIIllIIIllIII >= 0;
    }
    
    private static boolean lllIllIlIIlllIl(final Object lllllllllllllIIIlIIlIIllIIIlllII) {
        return lllllllllllllIIIlIIlIIllIIIlllII != null;
    }
    
    private static boolean lllIllIlIIlllll(final int lllllllllllllIIIlIIlIIllIIIlIllI) {
        return lllllllllllllIIIlIIlIIllIIIlIllI < 0;
    }
    
    private static void lllIllIlIIllIIl() {
        (lIlIlIIllIllll = new int[1])[0] = ((131 + 31 - 19 + 61 ^ 157 + 97 - 138 + 43) & (0x31 ^ 0x36 ^ (0x7 ^ 0x53) ^ -" ".length()));
    }
    
    private static boolean lllIllIlIIlllII(final int lllllllllllllIIIlIIlIIllIIIllIlI) {
        return lllllllllllllIIIlIIlIIllIIIllIlI == 0;
    }
    
    private static int lllIllIlIIllIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
