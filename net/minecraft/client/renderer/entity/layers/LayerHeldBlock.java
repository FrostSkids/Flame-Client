// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.entity.monster.EntityEnderman;

public class LayerHeldBlock implements LayerRenderer<EntityEnderman>
{
    private final /* synthetic */ RenderEnderman endermanRenderer;
    private static final /* synthetic */ int[] lIllIIIIIlllII;
    
    static {
        llllIllIIlIIIlI();
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerHeldBlock.lIllIIIIIlllII[1] != 0;
    }
    
    private static void llllIllIIlIIIlI() {
        (lIllIIIIIlllII = new int[2])[0] = (0xFFFFCC89 & 0x13376);
        LayerHeldBlock.lIllIIIIIlllII[1] = ((0x86 ^ 0xAD) & ~(0x38 ^ 0x13));
    }
    
    @Override
    public void doRenderLayer(final EntityEnderman lllllllllllllIIIIlIIIlIlllIllIIl, final float lllllllllllllIIIIlIIIlIlllIllIII, final float lllllllllllllIIIIlIIIlIlllIlIlll, final float lllllllllllllIIIIlIIIlIlllIIlIIl, final float lllllllllllllIIIIlIIIlIlllIlIlIl, final float lllllllllllllIIIIlIIIlIlllIlIlII, final float lllllllllllllIIIIlIIIlIlllIlIIll, final float lllllllllllllIIIIlIIIlIlllIlIIlI) {
        final IBlockState lllllllllllllIIIIlIIIlIlllIlIIIl = lllllllllllllIIIIlIIIlIlllIllIIl.getHeldBlockState();
        if (llllIllIIlIIIll(lllllllllllllIIIIlIIIlIlllIlIIIl.getBlock().getMaterial(), Material.air)) {
            final BlockRendererDispatcher lllllllllllllIIIIlIIIlIlllIlIIII = Minecraft.getMinecraft().getBlockRendererDispatcher();
            GlStateManager.enableRescaleNormal();
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 0.6875f, -0.75f);
            GlStateManager.rotate(20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(45.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.25f, 0.1875f, 0.25f);
            final float lllllllllllllIIIIlIIIlIlllIIllll = 0.5f;
            GlStateManager.scale(-lllllllllllllIIIIlIIIlIlllIIllll, -lllllllllllllIIIIlIIIlIlllIIllll, lllllllllllllIIIIlIIIlIlllIIllll);
            final int lllllllllllllIIIIlIIIlIlllIIlllI = lllllllllllllIIIIlIIIlIlllIllIIl.getBrightnessForRender(lllllllllllllIIIIlIIIlIlllIIlIIl);
            final int lllllllllllllIIIIlIIIlIlllIIllIl = lllllllllllllIIIIlIIIlIlllIIlllI % LayerHeldBlock.lIllIIIIIlllII[0];
            final int lllllllllllllIIIIlIIIlIlllIIllII = lllllllllllllIIIIlIIIlIlllIIlllI / LayerHeldBlock.lIllIIIIIlllII[0];
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIIIIlIIIlIlllIIllIl / 1.0f, lllllllllllllIIIIlIIIlIlllIIllII / 1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.endermanRenderer.bindTexture(TextureMap.locationBlocksTexture);
            lllllllllllllIIIIlIIIlIlllIlIIII.renderBlockBrightness(lllllllllllllIIIIlIIIlIlllIlIIIl, 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
        }
    }
    
    public LayerHeldBlock(final RenderEnderman lllllllllllllIIIIlIIIlIllllIIlII) {
        this.endermanRenderer = lllllllllllllIIIIlIIIlIllllIIlII;
    }
    
    private static boolean llllIllIIlIIIll(final Object lllllllllllllIIIIlIIIlIllIlIllIl, final Object lllllllllllllIIIIlIIIlIllIlIllII) {
        return lllllllllllllIIIIlIIIlIllIlIllIl != lllllllllllllIIIIlIIIlIllIlIllII;
    }
}
