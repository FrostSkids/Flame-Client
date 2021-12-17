// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import java.util.Random;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;

public class LayerArrow implements LayerRenderer<EntityLivingBase>
{
    private static final /* synthetic */ int[] llIlIIlIIlllll;
    private final /* synthetic */ RendererLivingEntity field_177168_a;
    
    private static boolean lIIlIIlIlIIIlIII(final int llllllllllllIllIllIIIlIIIlIllIlI, final int llllllllllllIllIllIIIlIIIlIllIIl) {
        return llllllllllllIllIllIIIlIIIlIllIlI >= llllllllllllIllIllIIIlIIIlIllIIl;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerArrow.llIlIIlIIlllll[0] != 0;
    }
    
    @Override
    public void doRenderLayer(final EntityLivingBase llllllllllllIllIllIIIlIIlIIIlIII, final float llllllllllllIllIllIIIlIIlIIIIlll, final float llllllllllllIllIllIIIlIIlIIIIllI, final float llllllllllllIllIllIIIlIIlIIIIlIl, final float llllllllllllIllIllIIIlIIlIIIIlII, final float llllllllllllIllIllIIIlIIlIIIIIll, final float llllllllllllIllIllIIIlIIlIIIIIlI, final float llllllllllllIllIllIIIlIIlIIIIIIl) {
        final int llllllllllllIllIllIIIlIIlIIIIIII = llllllllllllIllIllIIIlIIlIIIlIII.getArrowCountInEntity();
        if (lIIlIIlIlIIIIlll(llllllllllllIllIllIIIlIIlIIIIIII)) {
            final Entity llllllllllllIllIllIIIlIIIlllllll = new EntityArrow(llllllllllllIllIllIIIlIIlIIIlIII.worldObj, llllllllllllIllIllIIIlIIlIIIlIII.posX, llllllllllllIllIllIIIlIIlIIIlIII.posY, llllllllllllIllIllIIIlIIlIIIlIII.posZ);
            final Random llllllllllllIllIllIIIlIIIllllllI = new Random(llllllllllllIllIllIIIlIIlIIIlIII.getEntityId());
            RenderHelper.disableStandardItemLighting();
            int llllllllllllIllIllIIIlIIIlllllIl = LayerArrow.llIlIIlIIlllll[0];
            "".length();
            if (((0x83 ^ 0x9E ^ (0x66 ^ 0x20)) & (0x5F ^ 0x51 ^ (0xEB ^ 0xBE) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIIlIlIIIlIII(llllllllllllIllIllIIIlIIIlllllIl, llllllllllllIllIllIIIlIIlIIIIIII)) {
                GlStateManager.pushMatrix();
                final ModelRenderer llllllllllllIllIllIIIlIIIlllllII = this.field_177168_a.getMainModel().getRandomModelBox(llllllllllllIllIllIIIlIIIllllllI);
                final ModelBox llllllllllllIllIllIIIlIIIllllIll = llllllllllllIllIllIIIlIIIlllllII.cubeList.get(llllllllllllIllIllIIIlIIIllllllI.nextInt(llllllllllllIllIllIIIlIIIlllllII.cubeList.size()));
                llllllllllllIllIllIIIlIIIlllllII.postRender(0.0625f);
                float llllllllllllIllIllIIIlIIIllllIlI = llllllllllllIllIllIIIlIIIllllllI.nextFloat();
                float llllllllllllIllIllIIIlIIIllllIIl = llllllllllllIllIllIIIlIIIllllllI.nextFloat();
                float llllllllllllIllIllIIIlIIIllllIII = llllllllllllIllIllIIIlIIIllllllI.nextFloat();
                final float llllllllllllIllIllIIIlIIIlllIlll = (llllllllllllIllIllIIIlIIIllllIll.posX1 + (llllllllllllIllIllIIIlIIIllllIll.posX2 - llllllllllllIllIllIIIlIIIllllIll.posX1) * llllllllllllIllIllIIIlIIIllllIlI) / 16.0f;
                final float llllllllllllIllIllIIIlIIIlllIllI = (llllllllllllIllIllIIIlIIIllllIll.posY1 + (llllllllllllIllIllIIIlIIIllllIll.posY2 - llllllllllllIllIllIIIlIIIllllIll.posY1) * llllllllllllIllIllIIIlIIIllllIIl) / 16.0f;
                final float llllllllllllIllIllIIIlIIIlllIlIl = (llllllllllllIllIllIIIlIIIllllIll.posZ1 + (llllllllllllIllIllIIIlIIIllllIll.posZ2 - llllllllllllIllIllIIIlIIIllllIll.posZ1) * llllllllllllIllIllIIIlIIIllllIII) / 16.0f;
                GlStateManager.translate(llllllllllllIllIllIIIlIIIlllIlll, llllllllllllIllIllIIIlIIIlllIllI, llllllllllllIllIllIIIlIIIlllIlIl);
                llllllllllllIllIllIIIlIIIllllIlI = llllllllllllIllIllIIIlIIIllllIlI * 2.0f - 1.0f;
                llllllllllllIllIllIIIlIIIllllIIl = llllllllllllIllIllIIIlIIIllllIIl * 2.0f - 1.0f;
                llllllllllllIllIllIIIlIIIllllIII = llllllllllllIllIllIIIlIIIllllIII * 2.0f - 1.0f;
                llllllllllllIllIllIIIlIIIllllIlI *= -1.0f;
                llllllllllllIllIllIIIlIIIllllIIl *= -1.0f;
                llllllllllllIllIllIIIlIIIllllIII *= -1.0f;
                final float llllllllllllIllIllIIIlIIIlllIlII = MathHelper.sqrt_float(llllllllllllIllIllIIIlIIIllllIlI * llllllllllllIllIllIIIlIIIllllIlI + llllllllllllIllIllIIIlIIIllllIII * llllllllllllIllIllIIIlIIIllllIII);
                final Entity entity = llllllllllllIllIllIIIlIIIlllllll;
                final Entity entity2 = llllllllllllIllIllIIIlIIIlllllll;
                final float n = (float)(Math.atan2(llllllllllllIllIllIIIlIIIllllIlI, llllllllllllIllIllIIIlIIIllllIII) * 180.0 / 3.141592653589793);
                entity2.rotationYaw = n;
                entity.prevRotationYaw = n;
                final Entity entity3 = llllllllllllIllIllIIIlIIIlllllll;
                final Entity entity4 = llllllllllllIllIllIIIlIIIlllllll;
                final float n2 = (float)(Math.atan2(llllllllllllIllIllIIIlIIIllllIIl, llllllllllllIllIllIIIlIIIlllIlII) * 180.0 / 3.141592653589793);
                entity4.rotationPitch = n2;
                entity3.prevRotationPitch = n2;
                final double llllllllllllIllIllIIIlIIIlllIIll = 0.0;
                final double llllllllllllIllIllIIIlIIIlllIIlI = 0.0;
                final double llllllllllllIllIllIIIlIIIlllIIIl = 0.0;
                this.field_177168_a.getRenderManager().renderEntityWithPosYaw(llllllllllllIllIllIIIlIIIlllllll, llllllllllllIllIllIIIlIIIlllIIll, llllllllllllIllIllIIIlIIIlllIIlI, llllllllllllIllIllIIIlIIIlllIIIl, 0.0f, llllllllllllIllIllIIIlIIlIIIIlIl);
                "".length();
                GlStateManager.popMatrix();
                ++llllllllllllIllIllIIIlIIIlllllIl;
            }
            RenderHelper.enableStandardItemLighting();
        }
    }
    
    private static void lIIlIIlIlIIIIllI() {
        (llIlIIlIIlllll = new int[1])[0] = (" ".length() & ~" ".length());
    }
    
    static {
        lIIlIIlIlIIIIllI();
    }
    
    public LayerArrow(final RendererLivingEntity llllllllllllIllIllIIIlIIlIIlllIl) {
        this.field_177168_a = llllllllllllIllIllIIIlIIlIIlllIl;
    }
    
    private static boolean lIIlIIlIlIIIIlll(final int llllllllllllIllIllIIIlIIIlIlIlll) {
        return llllllllllllIllIllIIIlIIIlIlIlll > 0;
    }
}
