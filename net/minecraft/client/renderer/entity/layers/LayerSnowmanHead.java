// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderSnowMan;
import net.minecraft.entity.monster.EntitySnowman;

public class LayerSnowmanHead implements LayerRenderer<EntitySnowman>
{
    private static final /* synthetic */ int[] lllIlIlIIllIll;
    private final /* synthetic */ RenderSnowMan snowManRenderer;
    
    private static void lIlIIIlIlllIllIl() {
        (lllIlIlIIllIll = new int[1])[0] = " ".length();
    }
    
    @Override
    public void doRenderLayer(final EntitySnowman llllllllllllIlIllIllIlIIIllIllll, final float llllllllllllIlIllIllIlIIIllIllIl, final float llllllllllllIlIllIllIlIIIllIlIll, final float llllllllllllIlIllIllIlIIIllIlIIl, final float llllllllllllIlIllIllIlIIIllIlIII, final float llllllllllllIlIllIllIlIIIllIIlll, final float llllllllllllIlIllIllIlIIIllIIllI, final float llllllllllllIlIllIllIlIIIllIIlIl) {
        if (lIlIIIlIlllIlllI(llllllllllllIlIllIllIlIIIllIllll.isInvisible() ? 1 : 0)) {
            GlStateManager.pushMatrix();
            this.snowManRenderer.getMainModel().head.postRender(0.0625f);
            final float llllllllllllIlIllIllIlIIIllIIlII = 0.625f;
            GlStateManager.translate(0.0f, -0.34375f, 0.0f);
            GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.scale(llllllllllllIlIllIllIlIIIllIIlII, -llllllllllllIlIllIllIlIIIllIIlII, -llllllllllllIlIllIllIlIIIllIIlII);
            Minecraft.getMinecraft().getItemRenderer().renderItem(llllllllllllIlIllIllIlIIIllIllll, new ItemStack(Blocks.pumpkin, LayerSnowmanHead.lllIlIlIIllIll[0]), ItemCameraTransforms.TransformType.HEAD);
            GlStateManager.popMatrix();
        }
    }
    
    public LayerSnowmanHead(final RenderSnowMan llllllllllllIlIllIllIlIIIlllllIl) {
        this.snowManRenderer = llllllllllllIlIllIllIlIIIlllllIl;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerSnowmanHead.lllIlIlIIllIll[0] != 0;
    }
    
    private static boolean lIlIIIlIlllIlllI(final int llllllllllllIlIllIllIlIIIIlllIIl) {
        return llllllllllllIlIllIllIlIIIIlllIIl == 0;
    }
    
    static {
        lIlIIIlIlllIllIl();
    }
}
