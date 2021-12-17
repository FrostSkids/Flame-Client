// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.projectile.EntityFireball;

public class RenderFireball extends Render<EntityFireball>
{
    private /* synthetic */ float scale;
    private static final /* synthetic */ int[] lIllIIlIlIIIlI;
    
    public RenderFireball(final RenderManager lllllllllllllIIIIIlIIIIIIIIlIlIl, final float lllllllllllllIIIIIlIIIIIIIIlIIIl) {
        super(lllllllllllllIIIIIlIIIIIIIIlIlIl);
        this.scale = lllllllllllllIIIIIlIIIIIIIIlIIIl;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityFireball lllllllllllllIIIIIIlllllllIlllII) {
        return TextureMap.locationBlocksTexture;
    }
    
    @Override
    public void doRender(final EntityFireball lllllllllllllIIIIIIllllllllllllI, final double lllllllllllllIIIIIIlllllllllllIl, final double lllllllllllllIIIIIIlllllllllllII, final double lllllllllllllIIIIIIllllllllIlIlI, final float lllllllllllllIIIIIIllllllllllIlI, final float lllllllllllllIIIIIIllllllllllIIl) {
        GlStateManager.pushMatrix();
        this.bindEntityTexture(lllllllllllllIIIIIIllllllllllllI);
        "".length();
        GlStateManager.translate((float)lllllllllllllIIIIIIlllllllllllIl, (float)lllllllllllllIIIIIIlllllllllllII, (float)lllllllllllllIIIIIIllllllllIlIlI);
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(this.scale, this.scale, this.scale);
        final TextureAtlasSprite lllllllllllllIIIIIIllllllllllIII = Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getParticleIcon(Items.fire_charge);
        final Tessellator lllllllllllllIIIIIIlllllllllIlll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIIIIlllllllllIllI = lllllllllllllIIIIIIlllllllllIlll.getWorldRenderer();
        final float lllllllllllllIIIIIIlllllllllIlIl = lllllllllllllIIIIIIllllllllllIII.getMinU();
        final float lllllllllllllIIIIIIlllllllllIlII = lllllllllllllIIIIIIllllllllllIII.getMaxU();
        final float lllllllllllllIIIIIIlllllllllIIll = lllllllllllllIIIIIIllllllllllIII.getMinV();
        final float lllllllllllllIIIIIIlllllllllIIlI = lllllllllllllIIIIIIllllllllllIII.getMaxV();
        final float lllllllllllllIIIIIIlllllllllIIIl = 1.0f;
        final float lllllllllllllIIIIIIlllllllllIIII = 0.5f;
        final float lllllllllllllIIIIIIllllllllIllll = 0.25f;
        GlStateManager.rotate(180.0f - this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        lllllllllllllIIIIIIlllllllllIllI.begin(RenderFireball.lIllIIlIlIIIlI[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        lllllllllllllIIIIIIlllllllllIllI.pos(-0.5, -0.25, 0.0).tex(lllllllllllllIIIIIIlllllllllIlIl, lllllllllllllIIIIIIlllllllllIIlI).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIIIIlllllllllIllI.pos(0.5, -0.25, 0.0).tex(lllllllllllllIIIIIIlllllllllIlII, lllllllllllllIIIIIIlllllllllIIlI).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIIIIlllllllllIllI.pos(0.5, 0.75, 0.0).tex(lllllllllllllIIIIIIlllllllllIlII, lllllllllllllIIIIIIlllllllllIIll).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIIIIlllllllllIllI.pos(-0.5, 0.75, 0.0).tex(lllllllllllllIIIIIIlllllllllIlIl, lllllllllllllIIIIIIlllllllllIIll).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIIIIIlllllllllIlll.draw();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIIIIIIllllllllllllI, lllllllllllllIIIIIIlllllllllllIl, lllllllllllllIIIIIIlllllllllllII, lllllllllllllIIIIIIllllllllIlIlI, lllllllllllllIIIIIIllllllllllIlI, lllllllllllllIIIIIIllllllllllIIl);
    }
    
    private static void lllllIIlllIIIll() {
        (lIllIIlIlIIIlI = new int[1])[0] = (0xA9 ^ 0xAE);
    }
    
    static {
        lllllIIlllIIIll();
    }
}
