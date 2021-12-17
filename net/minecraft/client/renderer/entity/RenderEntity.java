// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

public class RenderEntity extends Render<Entity>
{
    public RenderEntity(final RenderManager llllllllllllIlIlllIlIlIIIIIIlIIl) {
        super(llllllllllllIlIlllIlIlIIIIIIlIIl);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final Entity llllllllllllIlIlllIlIIllllllIIlI) {
        return null;
    }
    
    @Override
    public void doRender(final Entity llllllllllllIlIlllIlIIlllllllIIl, final double llllllllllllIlIlllIlIIllllllllll, final double llllllllllllIlIlllIlIIllllllIlll, final double llllllllllllIlIlllIlIIllllllIllI, final float llllllllllllIlIlllIlIIllllllllII, final float llllllllllllIlIlllIlIIllllllIlII) {
        GlStateManager.pushMatrix();
        Render.renderOffsetAABB(llllllllllllIlIlllIlIIlllllllIIl.getEntityBoundingBox(), llllllllllllIlIlllIlIIllllllllll - llllllllllllIlIlllIlIIlllllllIIl.lastTickPosX, llllllllllllIlIlllIlIIllllllIlll - llllllllllllIlIlllIlIIlllllllIIl.lastTickPosY, llllllllllllIlIlllIlIIllllllIllI - llllllllllllIlIlllIlIIlllllllIIl.lastTickPosZ);
        GlStateManager.popMatrix();
        super.doRender(llllllllllllIlIlllIlIIlllllllIIl, llllllllllllIlIlllIlIIllllllllll, llllllllllllIlIlllIlIIllllllIlll, llllllllllllIlIlllIlIIllllllIllI, llllllllllllIlIlllIlIIllllllllII, llllllllllllIlIlllIlIIllllllIlII);
    }
}
