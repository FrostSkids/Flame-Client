// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;

public class TextureCompass extends TextureAtlasSprite
{
    public static /* synthetic */ String field_176608_l;
    private static final /* synthetic */ int[] llIIlIIllIIIll;
    public /* synthetic */ double angleDelta;
    public /* synthetic */ double currentAngle;
    
    public TextureCompass(final String llllllllllllIlllIIlIIlIlllIlIIll) {
        super(llllllllllllIlllIIlIIlIlllIlIIll);
        TextureCompass.field_176608_l = llllllllllllIlllIIlIIlIlllIlIIll;
    }
    
    static {
        lIIIllIIlIIlIIII();
    }
    
    private static int lIIIllIIlIIlIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIIIllIIlIIlIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIllIIlIIlIlIl(final int llllllllllllIlllIIlIIlIllIlIIlII) {
        return llllllllllllIlllIIlIIlIllIlIIlII != 0;
    }
    
    private static boolean lIIIllIIlIIlIlII(final int llllllllllllIlllIIlIIlIllIlIIIlI) {
        return llllllllllllIlllIIlIIlIllIlIIIlI == 0;
    }
    
    private static boolean lIIIllIIlIIllIII(final int llllllllllllIlllIIlIIlIllIIllIll, final int llllllllllllIlllIIlIIlIllIIllIlI) {
        return llllllllllllIlllIIlIIlIllIIllIll != llllllllllllIlllIIlIIlIllIIllIlI;
    }
    
    private static boolean lIIIllIIlIIlIlll(final int llllllllllllIlllIIlIIlIllIIllllI) {
        return llllllllllllIlllIIlIIlIllIIllllI < 0;
    }
    
    @Override
    public void updateAnimation() {
        final Minecraft llllllllllllIlllIIlIIlIlllIIllIl = Minecraft.getMinecraft();
        if (lIIIllIIlIIlIIIl(llllllllllllIlllIIlIIlIlllIIllIl.theWorld) && lIIIllIIlIIlIIIl(llllllllllllIlllIIlIIlIlllIIllIl.thePlayer)) {
            this.updateCompass(llllllllllllIlllIIlIIlIlllIIllIl.theWorld, llllllllllllIlllIIlIIlIlllIIllIl.thePlayer.posX, llllllllllllIlllIIlIIlIlllIIllIl.thePlayer.posZ, llllllllllllIlllIIlIIlIlllIIllIl.thePlayer.rotationYaw, (boolean)(TextureCompass.llIIlIIllIIIll[0] != 0), (boolean)(TextureCompass.llIIlIIllIIIll[0] != 0));
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            this.updateCompass(null, 0.0, 0.0, 0.0, (boolean)(TextureCompass.llIIlIIllIIIll[1] != 0), (boolean)(TextureCompass.llIIlIIllIIIll[0] != 0));
        }
    }
    
    private static boolean lIIIllIIlIIlIllI(final int llllllllllllIlllIIlIIlIllIlIIIII) {
        return llllllllllllIlllIIlIIlIllIlIIIII >= 0;
    }
    
    private static void lIIIllIIlIIlIIII() {
        (llIIlIIllIIIll = new int[2])[0] = ((232 + 55 - 191 + 137 ^ 129 + 123 - 250 + 165) & (0x12 ^ 0x79 ^ (0x73 ^ 0x56) ^ -" ".length()));
        TextureCompass.llIIlIIllIIIll[1] = " ".length();
    }
    
    public void updateCompass(final World llllllllllllIlllIIlIIlIllIlllllI, final double llllllllllllIlllIIlIIlIllIllllIl, final double llllllllllllIlllIIlIIlIllIllllII, double llllllllllllIlllIIlIIlIllIlIlllI, final boolean llllllllllllIlllIIlIIlIllIlIllIl, final boolean llllllllllllIlllIIlIIlIllIlllIIl) {
        if (lIIIllIIlIIlIlII(this.framesTextureData.isEmpty() ? 1 : 0)) {
            double llllllllllllIlllIIlIIlIllIlllIII = 0.0;
            if (lIIIllIIlIIlIIIl(llllllllllllIlllIIlIIlIllIlllllI) && lIIIllIIlIIlIlII(llllllllllllIlllIIlIIlIllIlIllIl ? 1 : 0)) {
                final BlockPos llllllllllllIlllIIlIIlIllIllIlll = llllllllllllIlllIIlIIlIllIlllllI.getSpawnPoint();
                final double llllllllllllIlllIIlIIlIllIllIllI = llllllllllllIlllIIlIIlIllIllIlll.getX() - llllllllllllIlllIIlIIlIllIllllIl;
                final double llllllllllllIlllIIlIIlIllIllIlIl = llllllllllllIlllIIlIIlIllIllIlll.getZ() - llllllllllllIlllIIlIIlIllIllllII;
                llllllllllllIlllIIlIIlIllIlIlllI %= (short)360.0;
                llllllllllllIlllIIlIIlIllIlllIII = -((llllllllllllIlllIIlIIlIllIlIlllI - 90.0) * 3.141592653589793 / 180.0 - Math.atan2(llllllllllllIlllIIlIIlIllIllIlIl, llllllllllllIlllIIlIIlIllIllIllI));
                if (lIIIllIIlIIlIlII(llllllllllllIlllIIlIIlIllIlllllI.provider.isSurfaceWorld() ? 1 : 0)) {
                    llllllllllllIlllIIlIIlIllIlllIII = Math.random() * 3.141592653589793 * 2.0;
                }
            }
            if (lIIIllIIlIIlIlIl(llllllllllllIlllIIlIIlIllIlllIIl ? 1 : 0)) {
                this.currentAngle = llllllllllllIlllIIlIIlIllIlllIII;
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                double llllllllllllIlllIIlIIlIllIllIlII = llllllllllllIlllIIlIIlIllIlllIII - this.currentAngle;
                "".length();
                if ((0x9 ^ 0x5B ^ (0x3B ^ 0x6D)) <= "   ".length()) {
                    return;
                }
                while (!lIIIllIIlIIlIllI(lIIIllIIlIIlIIlI(llllllllllllIlllIIlIIlIllIllIlII, -3.141592653589793))) {
                    llllllllllllIlllIIlIIlIllIllIlII += 6.283185307179586;
                }
                "".length();
                if (((154 + 69 - 213 + 150 ^ 99 + 125 - 103 + 17) & (0x7B ^ 0x0 ^ (0xE3 ^ 0xB2) ^ -" ".length())) > ((0xD ^ 0x6B ^ (0x52 ^ 0x13)) & (0x6C ^ 0x74 ^ (0x62 ^ 0x5D) ^ -" ".length()))) {
                    return;
                }
                while (!lIIIllIIlIIlIlll(lIIIllIIlIIlIIll(llllllllllllIlllIIlIIlIllIllIlII, 3.141592653589793))) {
                    llllllllllllIlllIIlIIlIllIllIlII -= 6.283185307179586;
                }
                llllllllllllIlllIIlIIlIllIllIlII = MathHelper.clamp_double(llllllllllllIlllIIlIIlIllIllIlII, -1.0, 1.0);
                this.angleDelta += llllllllllllIlllIIlIIlIllIllIlII * 0.1;
                this.angleDelta *= 0.8;
                this.currentAngle += this.angleDelta;
            }
            int llllllllllllIlllIIlIIlIllIllIIll = (int)((this.currentAngle / 6.283185307179586 + 1.0) * this.framesTextureData.size()) % this.framesTextureData.size();
            "".length();
            if (((0x3D ^ 0x75) & ~(0xD7 ^ 0x9F)) == " ".length()) {
                return;
            }
            while (!lIIIllIIlIIlIllI(llllllllllllIlllIIlIIlIllIllIIll)) {
                llllllllllllIlllIIlIIlIllIllIIll = (llllllllllllIlllIIlIIlIllIllIIll + this.framesTextureData.size()) % this.framesTextureData.size();
            }
            if (lIIIllIIlIIllIII(llllllllllllIlllIIlIIlIllIllIIll, this.frameCounter)) {
                this.frameCounter = llllllllllllIlllIIlIIlIllIllIIll;
                TextureUtil.uploadTextureMipmap(this.framesTextureData.get(this.frameCounter), this.width, this.height, this.originX, this.originY, (boolean)(TextureCompass.llIIlIIllIIIll[0] != 0), (boolean)(TextureCompass.llIIlIIllIIIll[0] != 0));
            }
        }
    }
    
    private static boolean lIIIllIIlIIlIIIl(final Object llllllllllllIlllIIlIIlIllIlIIllI) {
        return llllllllllllIlllIIlIIlIllIlIIllI != null;
    }
}
