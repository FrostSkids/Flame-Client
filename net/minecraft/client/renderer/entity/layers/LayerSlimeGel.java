// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.entity.monster.EntitySlime;

public class LayerSlimeGel implements LayerRenderer<EntitySlime>
{
    private static final /* synthetic */ int[] lIllIIIIlIIllI;
    private final /* synthetic */ RenderSlime slimeRenderer;
    private final /* synthetic */ ModelBase slimeModel;
    
    private static boolean llllIllIIllIIll(final int lllllllllllllIIIIlIIIIlllllllllI) {
        return lllllllllllllIIIIlIIIIlllllllllI == 0;
    }
    
    static {
        llllIllIIllIIlI();
    }
    
    public LayerSlimeGel(final RenderSlime lllllllllllllIIIIlIIIlIIIIlIlllI) {
        this.slimeModel = new ModelSlime(LayerSlimeGel.lIllIIIIlIIllI[0]);
        this.slimeRenderer = lllllllllllllIIIIlIIIlIIIIlIlllI;
    }
    
    private static void llllIllIIllIIlI() {
        (lIllIIIIlIIllI = new int[4])[0] = ((0x1 ^ 0xB ^ (0xBC ^ 0x92)) & (0x85 ^ 0x98 ^ (0x4A ^ 0x73) ^ -" ".length()));
        LayerSlimeGel.lIllIIIIlIIllI[1] = (0xFFFFEB9F & 0x1762);
        LayerSlimeGel.lIllIIIIlIIllI[2] = (-(0xFFFFF8F5 & 0x4FAF) & (0xFFFFFFB7 & 0x4BEF));
        LayerSlimeGel.lIllIIIIlIIllI[3] = " ".length();
    }
    
    @Override
    public void doRenderLayer(final EntitySlime lllllllllllllIIIIlIIIlIIIIIllIIl, final float lllllllllllllIIIIlIIIlIIIIIllIII, final float lllllllllllllIIIIlIIIlIIIIlIIIII, final float lllllllllllllIIIIlIIIlIIIIIlllll, final float lllllllllllllIIIIlIIIlIIIIIllllI, final float lllllllllllllIIIIlIIIlIIIIIlllIl, final float lllllllllllllIIIIlIIIlIIIIIlllII, final float lllllllllllllIIIIlIIIlIIIIIlIIll) {
        if (llllIllIIllIIll(lllllllllllllIIIIlIIIlIIIIIllIIl.isInvisible() ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(LayerSlimeGel.lIllIIIIlIIllI[1], LayerSlimeGel.lIllIIIIlIIllI[2]);
            this.slimeModel.setModelAttributes(this.slimeRenderer.getMainModel());
            this.slimeModel.render(lllllllllllllIIIIlIIIlIIIIIllIIl, lllllllllllllIIIIlIIIlIIIIIllIII, lllllllllllllIIIIlIIIlIIIIlIIIII, lllllllllllllIIIIlIIIlIIIIIllllI, lllllllllllllIIIIlIIIlIIIIIlllIl, lllllllllllllIIIIlIIIlIIIIIlllII, lllllllllllllIIIIlIIIlIIIIIlIIll);
            GlStateManager.disableBlend();
            GlStateManager.disableNormalize();
        }
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerSlimeGel.lIllIIIIlIIllI[3] != 0;
    }
}
