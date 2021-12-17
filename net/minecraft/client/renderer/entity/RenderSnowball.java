// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;

public class RenderSnowball<T extends Entity> extends Render<T>
{
    private static final /* synthetic */ int[] lIllIIIlllllIl;
    protected final /* synthetic */ Item field_177084_a;
    private final /* synthetic */ RenderItem field_177083_e;
    
    @Override
    protected ResourceLocation getEntityTexture(final Entity lllllllllllllIIIIIlIIlllIllIIllI) {
        return TextureMap.locationBlocksTexture;
    }
    
    private static void lllllIIlIIllIII() {
        (lIllIIIlllllIl = new int[2])[0] = " ".length();
        RenderSnowball.lIllIIIlllllIl[1] = ((0x7E ^ 0x23 ^ (0x9C ^ 0x95)) & (0xE8 ^ 0x86 ^ (0x2D ^ 0x17) ^ -" ".length()));
    }
    
    public ItemStack func_177082_d(final T lllllllllllllIIIIIlIIlllIllIlIIl) {
        return new ItemStack(this.field_177084_a, RenderSnowball.lIllIIIlllllIl[0], RenderSnowball.lIllIIIlllllIl[1]);
    }
    
    public RenderSnowball(final RenderManager lllllllllllllIIIIIlIIllllIIIIlll, final Item lllllllllllllIIIIIlIIllllIIIIIlI, final RenderItem lllllllllllllIIIIIlIIllllIIIIlIl) {
        super(lllllllllllllIIIIIlIIllllIIIIlll);
        this.field_177084_a = lllllllllllllIIIIIlIIllllIIIIIlI;
        this.field_177083_e = lllllllllllllIIIIIlIIllllIIIIlIl;
    }
    
    @Override
    public void doRender(final T lllllllllllllIIIIIlIIlllIllllIII, final double lllllllllllllIIIIIlIIlllIlllIlll, final double lllllllllllllIIIIIlIIlllIlllIllI, final double lllllllllllllIIIIIlIIlllIlllIlIl, final float lllllllllllllIIIIIlIIlllIllIllIl, final float lllllllllllllIIIIIlIIlllIllIllII) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIIIIlIIlllIlllIlll, (float)lllllllllllllIIIIIlIIlllIlllIllI, (float)lllllllllllllIIIIIlIIlllIlllIlIl);
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(0.5f, 0.5f, 0.5f);
        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        this.bindTexture(TextureMap.locationBlocksTexture);
        this.field_177083_e.func_181564_a(this.func_177082_d(lllllllllllllIIIIIlIIlllIllllIII), ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIIIIIlIIlllIllllIII, lllllllllllllIIIIIlIIlllIlllIlll, lllllllllllllIIIIIlIIlllIlllIllI, lllllllllllllIIIIIlIIlllIlllIlIl, lllllllllllllIIIIIlIIlllIllIllIl, lllllllllllllIIIIIlIIlllIllIllII);
    }
    
    static {
        lllllIIlIIllIII();
    }
}
