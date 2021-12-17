// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.init.Items;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderWitch;
import net.minecraft.entity.monster.EntityWitch;

public class LayerHeldItemWitch implements LayerRenderer<EntityWitch>
{
    private static final /* synthetic */ int[] lIIIIlIIIIIIII;
    private final /* synthetic */ RenderWitch witchRenderer;
    
    @Override
    public void doRenderLayer(final EntityWitch lllllllllllllIlIIllIlIlIlIIIIlIl, final float lllllllllllllIlIIllIlIlIlIIlIlIl, final float lllllllllllllIlIIllIlIlIlIIlIlII, final float lllllllllllllIlIIllIlIlIlIIlIIll, final float lllllllllllllIlIIllIlIlIlIIlIIlI, final float lllllllllllllIlIIllIlIlIlIIlIIIl, final float lllllllllllllIlIIllIlIlIlIIlIIII, final float lllllllllllllIlIIllIlIlIlIIIllll) {
        final ItemStack lllllllllllllIlIIllIlIlIlIIIlllI = lllllllllllllIlIIllIlIlIlIIIIlIl.getHeldItem();
        if (lIllIlllllIIlIl(lllllllllllllIlIIllIlIlIlIIIlllI)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f);
            GlStateManager.pushMatrix();
            if (lIllIlllllIIllI(this.witchRenderer.getMainModel().isChild ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.625f, 0.0f);
                GlStateManager.rotate(-20.0f, -1.0f, 0.0f, 0.0f);
                final float lllllllllllllIlIIllIlIlIlIIIllIl = 0.5f;
                GlStateManager.scale(lllllllllllllIlIIllIlIlIlIIIllIl, lllllllllllllIlIIllIlIlIlIIIllIl, lllllllllllllIlIIllIlIlIlIIIllIl);
            }
            ((ModelWitch)this.witchRenderer.getMainModel()).villagerNose.postRender(0.0625f);
            GlStateManager.translate(-0.0625f, 0.53125f, 0.21875f);
            final Item lllllllllllllIlIIllIlIlIlIIIllII = lllllllllllllIlIIllIlIlIlIIIlllI.getItem();
            final Minecraft lllllllllllllIlIIllIlIlIlIIIlIll = Minecraft.getMinecraft();
            if (lIllIlllllIIllI((lllllllllllllIlIIllIlIlIlIIIllII instanceof ItemBlock) ? 1 : 0) && lIllIlllllIIllI(lllllllllllllIlIIllIlIlIlIIIlIll.getBlockRendererDispatcher().isRenderTypeChest(Block.getBlockFromItem(lllllllllllllIlIIllIlIlIlIIIllII), lllllllllllllIlIIllIlIlIlIIIlllI.getMetadata()) ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.0625f, -0.25f);
                GlStateManager.rotate(30.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(-5.0f, 0.0f, 1.0f, 0.0f);
                final float lllllllllllllIlIIllIlIlIlIIIlIlI = 0.375f;
                GlStateManager.scale(lllllllllllllIlIIllIlIlIlIIIlIlI, -lllllllllllllIlIIllIlIlIlIIIlIlI, lllllllllllllIlIIllIlIlIlIIIlIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIllIlllllIIlll(lllllllllllllIlIIllIlIlIlIIIllII, Items.bow)) {
                GlStateManager.translate(0.0f, 0.125f, -0.125f);
                GlStateManager.rotate(-45.0f, 0.0f, 1.0f, 0.0f);
                final float lllllllllllllIlIIllIlIlIlIIIlIIl = 0.625f;
                GlStateManager.scale(lllllllllllllIlIIllIlIlIlIIIlIIl, -lllllllllllllIlIIllIlIlIlIIIlIIl, lllllllllllllIlIIllIlIlIlIIIlIIl);
                GlStateManager.rotate(-100.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(-20.0f, 0.0f, 1.0f, 0.0f);
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
            }
            else if (lIllIlllllIIllI(lllllllllllllIlIIllIlIlIlIIIllII.isFull3D() ? 1 : 0)) {
                if (lIllIlllllIIllI(lllllllllllllIlIIllIlIlIlIIIllII.shouldRotateAroundWhenRendering() ? 1 : 0)) {
                    GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
                    GlStateManager.translate(0.0f, -0.0625f, 0.0f);
                }
                this.witchRenderer.transformHeldFull3DItemLayer();
                GlStateManager.translate(0.0625f, -0.125f, 0.0f);
                final float lllllllllllllIlIIllIlIlIlIIIlIII = 0.625f;
                GlStateManager.scale(lllllllllllllIlIIllIlIlIlIIIlIII, -lllllllllllllIlIIllIlIlIlIIIlIII, lllllllllllllIlIIllIlIlIlIIIlIII);
                GlStateManager.rotate(0.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(0.0f, 0.0f, 1.0f, 0.0f);
                "".length();
                if (((85 + 17 + 2 + 54 ^ 49 + 130 - 33 + 2) & (0x35 ^ 0x22 ^ (0x4F ^ 0x52) ^ -" ".length())) < -" ".length()) {
                    return;
                }
            }
            else {
                GlStateManager.translate(0.1875f, 0.1875f, 0.0f);
                final float lllllllllllllIlIIllIlIlIlIIIIlll = 0.875f;
                GlStateManager.scale(lllllllllllllIlIIllIlIlIlIIIIlll, lllllllllllllIlIIllIlIlIlIIIIlll, lllllllllllllIlIIllIlIlIlIIIIlll);
                GlStateManager.rotate(-20.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.rotate(-60.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(-30.0f, 0.0f, 0.0f, 1.0f);
            }
            GlStateManager.rotate(-15.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(40.0f, 0.0f, 0.0f, 1.0f);
            lllllllllllllIlIIllIlIlIlIIIlIll.getItemRenderer().renderItem(lllllllllllllIlIIllIlIlIlIIIIlIl, lllllllllllllIlIIllIlIlIlIIIlllI, ItemCameraTransforms.TransformType.THIRD_PERSON);
            GlStateManager.popMatrix();
        }
    }
    
    private static boolean lIllIlllllIIllI(final int lllllllllllllIlIIllIlIlIIllIIllI) {
        return lllllllllllllIlIIllIlIlIIllIIllI != 0;
    }
    
    private static boolean lIllIlllllIIlll(final Object lllllllllllllIlIIllIlIlIIllIlIIl, final Object lllllllllllllIlIIllIlIlIIllIlIII) {
        return lllllllllllllIlIIllIlIlIIllIlIIl == lllllllllllllIlIIllIlIlIIllIlIII;
    }
    
    private static boolean lIllIlllllIIlIl(final Object lllllllllllllIlIIllIlIlIIllIllII) {
        return lllllllllllllIlIIllIlIlIIllIllII != null;
    }
    
    public LayerHeldItemWitch(final RenderWitch lllllllllllllIlIIllIlIlIlIlIIIII) {
        this.witchRenderer = lllllllllllllIlIIllIlIlIlIlIIIII;
    }
    
    private static void lIllIlllllIIlII() {
        (lIIIIlIIIIIIII = new int[1])[0] = ((0x9B ^ 0xAB ^ (0x51 ^ 0x6F)) & (0x42 ^ 0x3 ^ (0xE1 ^ 0xAE) ^ -" ".length()));
    }
    
    static {
        lIllIlllllIIlII();
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerHeldItemWitch.lIIIIlIIIIIIII[0] != 0;
    }
}
