// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderMooshroom;
import net.minecraft.entity.passive.EntityMooshroom;

public class LayerMooshroomMushroom implements LayerRenderer<EntityMooshroom>
{
    private final /* synthetic */ RenderMooshroom mooshroomRenderer;
    private static final /* synthetic */ int[] llllIllIIllIl;
    
    @Override
    public void doRenderLayer(final EntityMooshroom lllllllllllllIlIllIlIIlIIllIIlll, final float lllllllllllllIlIllIlIIlIIllIIllI, final float lllllllllllllIlIllIlIIlIIllIIlIl, final float lllllllllllllIlIllIlIIlIIllIIlII, final float lllllllllllllIlIllIlIIlIIllIIIll, final float lllllllllllllIlIllIlIIlIIllIIIlI, final float lllllllllllllIlIllIlIIlIIllIIIIl, final float lllllllllllllIlIllIlIIlIIllIIIII) {
        if (lIlIlIllIIIllll(lllllllllllllIlIllIlIIlIIllIIlll.isChild() ? 1 : 0) && lIlIlIllIIIllll(lllllllllllllIlIllIlIIlIIllIIlll.isInvisible() ? 1 : 0)) {
            final BlockRendererDispatcher lllllllllllllIlIllIlIIlIIlIlllll = Minecraft.getMinecraft().getBlockRendererDispatcher();
            this.mooshroomRenderer.bindTexture(TextureMap.locationBlocksTexture);
            GlStateManager.enableCull();
            GlStateManager.cullFace(LayerMooshroomMushroom.llllIllIIllIl[0]);
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f, -1.0f, 1.0f);
            GlStateManager.translate(0.2f, 0.35f, 0.5f);
            GlStateManager.rotate(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.pushMatrix();
            GlStateManager.translate(-0.5f, -0.5f, 0.5f);
            lllllllllllllIlIllIlIIlIIlIlllll.renderBlockBrightness(Blocks.red_mushroom.getDefaultState(), 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.1f, 0.0f, -0.6f);
            GlStateManager.rotate(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(-0.5f, -0.5f, 0.5f);
            lllllllllllllIlIllIlIIlIIlIlllll.renderBlockBrightness(Blocks.red_mushroom.getDefaultState(), 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            ((ModelQuadruped)this.mooshroomRenderer.getMainModel()).head.postRender(0.0625f);
            GlStateManager.scale(1.0f, -1.0f, 1.0f);
            GlStateManager.translate(0.0f, 0.7f, -0.2f);
            GlStateManager.rotate(12.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(-0.5f, -0.5f, 0.5f);
            lllllllllllllIlIllIlIIlIIlIlllll.renderBlockBrightness(Blocks.red_mushroom.getDefaultState(), 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.cullFace(LayerMooshroomMushroom.llllIllIIllIl[1]);
            GlStateManager.disableCull();
        }
    }
    
    private static boolean lIlIlIllIIIllll(final int lllllllllllllIlIllIlIIlIIlIIIlll) {
        return lllllllllllllIlIllIlIIlIIlIIIlll == 0;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerMooshroomMushroom.llllIllIIllIl[2] != 0;
    }
    
    static {
        lIlIlIllIIIlllI();
    }
    
    private static void lIlIlIllIIIlllI() {
        (llllIllIIllIl = new int[3])[0] = (-(0xFFFFBF95 & 0x7B7E) & (0xFFFFBF57 & 0x7FBF));
        LayerMooshroomMushroom.llllIllIIllIl[1] = (-(0xFFFFE339 & 0x5CEF) & (0xFFFFDEFD & 0x652F));
        LayerMooshroomMushroom.llllIllIIllIl[2] = " ".length();
    }
    
    public LayerMooshroomMushroom(final RenderMooshroom lllllllllllllIlIllIlIIlIIllIlllI) {
        this.mooshroomRenderer = lllllllllllllIlIllIlIIlIIllIlllI;
    }
}
