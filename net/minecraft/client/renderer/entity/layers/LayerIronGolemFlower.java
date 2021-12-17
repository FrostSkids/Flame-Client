// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderIronGolem;
import net.minecraft.entity.monster.EntityIronGolem;

public class LayerIronGolemFlower implements LayerRenderer<EntityIronGolem>
{
    private static final /* synthetic */ int[] lIlIIlIIlllllI;
    private final /* synthetic */ RenderIronGolem ironGolemRenderer;
    
    private static void lllIIlIllllIIll() {
        (lIlIIlIIlllllI = new int[2])[0] = (0xFFFFA345 & 0x15CBA);
        LayerIronGolemFlower.lIlIIlIIlllllI[1] = ((0x30 ^ 0x65) & ~(0xE1 ^ 0xB4));
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerIronGolemFlower.lIlIIlIIlllllI[1] != 0;
    }
    
    public LayerIronGolemFlower(final RenderIronGolem lllllllllllllIIIllIlllllllIIIIIl) {
        this.ironGolemRenderer = lllllllllllllIIIllIlllllllIIIIIl;
    }
    
    @Override
    public void doRenderLayer(final EntityIronGolem lllllllllllllIIIllIllllllIlIIllI, final float lllllllllllllIIIllIllllllIlIIlII, final float lllllllllllllIIIllIllllllIlIIIlI, final float lllllllllllllIIIllIllllllIIIllII, final float lllllllllllllIIIllIllllllIIllllI, final float lllllllllllllIIIllIllllllIIlllIl, final float lllllllllllllIIIllIllllllIIlllII, final float lllllllllllllIIIllIllllllIIllIll) {
        if (lllIIlIllllIlII(lllllllllllllIIIllIllllllIlIIllI.getHoldRoseTick())) {
            final BlockRendererDispatcher lllllllllllllIIIllIllllllIIllIIl = Minecraft.getMinecraft().getBlockRendererDispatcher();
            GlStateManager.enableRescaleNormal();
            GlStateManager.pushMatrix();
            GlStateManager.rotate(5.0f + 180.0f * ((ModelIronGolem)this.ironGolemRenderer.getMainModel()).ironGolemRightArm.rotateAngleX / 3.1415927f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.translate(-0.9375f, -0.625f, -0.9375f);
            final float lllllllllllllIIIllIllllllIIlIlll = 0.5f;
            GlStateManager.scale(lllllllllllllIIIllIllllllIIlIlll, -lllllllllllllIIIllIllllllIIlIlll, lllllllllllllIIIllIllllllIIlIlll);
            final int lllllllllllllIIIllIllllllIIlIlIl = lllllllllllllIIIllIllllllIlIIllI.getBrightnessForRender(lllllllllllllIIIllIllllllIIIllII);
            final int lllllllllllllIIIllIllllllIIlIIll = lllllllllllllIIIllIllllllIIlIlIl % LayerIronGolemFlower.lIlIIlIIlllllI[0];
            final int lllllllllllllIIIllIllllllIIlIIIl = lllllllllllllIIIllIllllllIIlIlIl / LayerIronGolemFlower.lIlIIlIIlllllI[0];
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIIIllIllllllIIlIIll / 1.0f, lllllllllllllIIIllIllllllIIlIIIl / 1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.ironGolemRenderer.bindTexture(TextureMap.locationBlocksTexture);
            lllllllllllllIIIllIllllllIIllIIl.renderBlockBrightness(Blocks.red_flower.getDefaultState(), 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
        }
    }
    
    static {
        lllIIlIllllIIll();
    }
    
    private static boolean lllIIlIllllIlII(final int lllllllllllllIIIllIlllllIllIIIII) {
        return lllllllllllllIIIllIlllllIllIIIII != 0;
    }
}
