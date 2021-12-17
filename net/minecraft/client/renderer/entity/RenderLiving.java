// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityHanging;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public abstract class RenderLiving<T extends EntityLiving> extends RendererLivingEntity<T>
{
    private static final /* synthetic */ int[] llIlIllIIIllll;
    
    private static void lIIlIlIlIIIIIllI() {
        (llIlIllIIIllll = new int[6])[0] = " ".length();
        RenderLiving.llIlIllIIIllll[1] = ((0x96 ^ 0xC5 ^ (0x64 ^ 0x38)) & (144 + 26 - 130 + 125 ^ 126 + 14 - 19 + 49 ^ -" ".length()));
        RenderLiving.llIlIllIIIllll[2] = (0xFFFFB1F7 & 0x14E08);
        RenderLiving.llIlIllIIIllll[3] = (0x61 ^ 0x79);
        RenderLiving.llIlIllIIIllll[4] = (0xA3 ^ 0xA6);
        RenderLiving.llIlIllIIIllll[5] = "  ".length();
    }
    
    private static boolean lIIlIlIlIIIIlIlI(final Object llllllllllllIllIlIIllIllIIIIIIIl) {
        return llllllllllllIllIlIIllIllIIIIIIIl != null;
    }
    
    private static boolean lIIlIlIlIIIIlIIl(final Object llllllllllllIllIlIIllIllIIIIIlII, final Object llllllllllllIllIlIIllIllIIIIIIll) {
        return llllllllllllIllIlIIllIllIIIIIlII == llllllllllllIllIlIIllIllIIIIIIll;
    }
    
    static {
        lIIlIlIlIIIIIllI();
    }
    
    protected void renderLeash(final T llllllllllllIllIlIIllIllIlIIIlll, double llllllllllllIllIlIIllIllIlIIIllI, double llllllllllllIllIlIIllIllIlIIIlIl, double llllllllllllIllIlIIllIllIlIIIlII, final float llllllllllllIllIlIIllIllIllIlIIl, final float llllllllllllIllIlIIllIllIllIlIII) {
        final Entity llllllllllllIllIlIIllIllIllIIlll = llllllllllllIllIlIIllIllIlIIIlll.getLeashedToEntity();
        if (lIIlIlIlIIIIlIlI(llllllllllllIllIlIIllIllIllIIlll)) {
            llllllllllllIllIlIIllIllIlIIIlIl -= (1.6 - llllllllllllIllIlIIllIllIlIIIlll.height) * 0.5;
            final Tessellator llllllllllllIllIlIIllIllIllIIllI = Tessellator.getInstance();
            final WorldRenderer llllllllllllIllIlIIllIllIllIIlIl = llllllllllllIllIlIIllIllIllIIllI.getWorldRenderer();
            final double llllllllllllIllIlIIllIllIllIIlII = this.interpolateValue(llllllllllllIllIlIIllIllIllIIlll.prevRotationYaw, llllllllllllIllIlIIllIllIllIIlll.rotationYaw, llllllllllllIllIlIIllIllIllIlIII * 0.5f) * 0.01745329238474369;
            final double llllllllllllIllIlIIllIllIllIIIll = this.interpolateValue(llllllllllllIllIlIIllIllIllIIlll.prevRotationPitch, llllllllllllIllIlIIllIllIllIIlll.rotationPitch, llllllllllllIllIlIIllIllIllIlIII * 0.5f) * 0.01745329238474369;
            double llllllllllllIllIlIIllIllIllIIIlI = Math.cos(llllllllllllIllIlIIllIllIllIIlII);
            double llllllllllllIllIlIIllIllIllIIIIl = Math.sin(llllllllllllIllIlIIllIllIllIIlII);
            double llllllllllllIllIlIIllIllIllIIIII = Math.sin(llllllllllllIllIlIIllIllIllIIIll);
            if (lIIlIlIlIIIIIlll((llllllllllllIllIlIIllIllIllIIlll instanceof EntityHanging) ? 1 : 0)) {
                llllllllllllIllIlIIllIllIllIIIlI = 0.0;
                llllllllllllIllIlIIllIllIllIIIIl = 0.0;
                llllllllllllIllIlIIllIllIllIIIII = -1.0;
            }
            final double llllllllllllIllIlIIllIllIlIlllll = Math.cos(llllllllllllIllIlIIllIllIllIIIll);
            final double llllllllllllIllIlIIllIllIlIllllI = this.interpolateValue(llllllllllllIllIlIIllIllIllIIlll.prevPosX, llllllllllllIllIlIIllIllIllIIlll.posX, llllllllllllIllIlIIllIllIllIlIII) - llllllllllllIllIlIIllIllIllIIIlI * 0.7 - llllllllllllIllIlIIllIllIllIIIIl * 0.5 * llllllllllllIllIlIIllIllIlIlllll;
            final double llllllllllllIllIlIIllIllIlIlllIl = this.interpolateValue(llllllllllllIllIlIIllIllIllIIlll.prevPosY + llllllllllllIllIlIIllIllIllIIlll.getEyeHeight() * 0.7, llllllllllllIllIlIIllIllIllIIlll.posY + llllllllllllIllIlIIllIllIllIIlll.getEyeHeight() * 0.7, llllllllllllIllIlIIllIllIllIlIII) - llllllllllllIllIlIIllIllIllIIIII * 0.5 - 0.25;
            final double llllllllllllIllIlIIllIllIlIlllII = this.interpolateValue(llllllllllllIllIlIIllIllIllIIlll.prevPosZ, llllllllllllIllIlIIllIllIllIIlll.posZ, llllllllllllIllIlIIllIllIllIlIII) - llllllllllllIllIlIIllIllIllIIIIl * 0.7 + llllllllllllIllIlIIllIllIllIIIlI * 0.5 * llllllllllllIllIlIIllIllIlIlllll;
            final double llllllllllllIllIlIIllIllIlIllIll = this.interpolateValue(llllllllllllIllIlIIllIllIlIIIlll.prevRenderYawOffset, llllllllllllIllIlIIllIllIlIIIlll.renderYawOffset, llllllllllllIllIlIIllIllIllIlIII) * 0.01745329238474369 + 1.5707963267948966;
            llllllllllllIllIlIIllIllIllIIIlI = Math.cos(llllllllllllIllIlIIllIllIlIllIll) * llllllllllllIllIlIIllIllIlIIIlll.width * 0.4;
            llllllllllllIllIlIIllIllIllIIIIl = Math.sin(llllllllllllIllIlIIllIllIlIllIll) * llllllllllllIllIlIIllIllIlIIIlll.width * 0.4;
            final double llllllllllllIllIlIIllIllIlIllIlI = this.interpolateValue(llllllllllllIllIlIIllIllIlIIIlll.prevPosX, llllllllllllIllIlIIllIllIlIIIlll.posX, llllllllllllIllIlIIllIllIllIlIII) + llllllllllllIllIlIIllIllIllIIIlI;
            final double llllllllllllIllIlIIllIllIlIllIIl = this.interpolateValue(llllllllllllIllIlIIllIllIlIIIlll.prevPosY, llllllllllllIllIlIIllIllIlIIIlll.posY, llllllllllllIllIlIIllIllIllIlIII);
            final double llllllllllllIllIlIIllIllIlIllIII = this.interpolateValue(llllllllllllIllIlIIllIllIlIIIlll.prevPosZ, llllllllllllIllIlIIllIllIlIIIlll.posZ, llllllllllllIllIlIIllIllIllIlIII) + llllllllllllIllIlIIllIllIllIIIIl;
            llllllllllllIllIlIIllIllIlIIIllI += (char)llllllllllllIllIlIIllIllIllIIIlI;
            llllllllllllIllIlIIllIllIlIIIlII += llllllllllllIllIlIIllIllIllIIIIl;
            final double llllllllllllIllIlIIllIllIlIlIlll = (float)(llllllllllllIllIlIIllIllIlIllllI - llllllllllllIllIlIIllIllIlIllIlI);
            final double llllllllllllIllIlIIllIllIlIlIllI = (float)(llllllllllllIllIlIIllIllIlIlllIl - llllllllllllIllIlIIllIllIlIllIIl);
            final double llllllllllllIllIlIIllIllIlIlIlIl = (float)(llllllllllllIllIlIIllIllIlIlllII - llllllllllllIllIlIIllIllIlIllIII);
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableCull();
            final int llllllllllllIllIlIIllIllIlIlIlII = RenderLiving.llIlIllIIIllll[3];
            final double llllllllllllIllIlIIllIllIlIlIIll = 0.025;
            llllllllllllIllIlIIllIllIllIIlIl.begin(RenderLiving.llIlIllIIIllll[4], DefaultVertexFormats.POSITION_COLOR);
            int llllllllllllIllIlIIllIllIlIlIIlI = RenderLiving.llIlIllIIIllll[1];
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
            while (!lIIlIlIlIIIIlIll(llllllllllllIllIlIIllIllIlIlIIlI, RenderLiving.llIlIllIIIllll[3])) {
                float llllllllllllIllIlIIllIllIlIlIIIl = 0.5f;
                float llllllllllllIllIlIIllIllIlIlIIII = 0.4f;
                float llllllllllllIllIlIIllIllIlIIllll = 0.3f;
                if (lIIlIlIlIIIIlIII(llllllllllllIllIlIIllIllIlIlIIlI % RenderLiving.llIlIllIIIllll[5])) {
                    llllllllllllIllIlIIllIllIlIlIIIl *= 0.7f;
                    llllllllllllIllIlIIllIllIlIlIIII *= 0.7f;
                    llllllllllllIllIlIIllIllIlIIllll *= 0.7f;
                }
                final float llllllllllllIllIlIIllIllIlIIlllI = llllllllllllIllIlIIllIllIlIlIIlI / 24.0f;
                llllllllllllIllIlIIllIllIllIIlIl.pos(llllllllllllIllIlIIllIllIlIIIllI + llllllllllllIllIlIIllIllIlIlIlll * llllllllllllIllIlIIllIllIlIIlllI + 0.0, llllllllllllIllIlIIllIllIlIIIlIl + llllllllllllIllIlIIllIllIlIlIllI * (llllllllllllIllIlIIllIllIlIIlllI * llllllllllllIllIlIIllIllIlIIlllI + llllllllllllIllIlIIllIllIlIIlllI) * 0.5 + ((24.0f - llllllllllllIllIlIIllIllIlIlIIlI) / 18.0f + 0.125f), llllllllllllIllIlIIllIllIlIIIlII + llllllllllllIllIlIIllIllIlIlIlIl * llllllllllllIllIlIIllIllIlIIlllI).color(llllllllllllIllIlIIllIllIlIlIIIl, llllllllllllIllIlIIllIllIlIlIIII, llllllllllllIllIlIIllIllIlIIllll, 1.0f).endVertex();
                llllllllllllIllIlIIllIllIllIIlIl.pos(llllllllllllIllIlIIllIllIlIIIllI + llllllllllllIllIlIIllIllIlIlIlll * llllllllllllIllIlIIllIllIlIIlllI + 0.025, llllllllllllIllIlIIllIllIlIIIlIl + llllllllllllIllIlIIllIllIlIlIllI * (llllllllllllIllIlIIllIllIlIIlllI * llllllllllllIllIlIIllIllIlIIlllI + llllllllllllIllIlIIllIllIlIIlllI) * 0.5 + ((24.0f - llllllllllllIllIlIIllIllIlIlIIlI) / 18.0f + 0.125f) + 0.025, llllllllllllIllIlIIllIllIlIIIlII + llllllllllllIllIlIIllIllIlIlIlIl * llllllllllllIllIlIIllIllIlIIlllI).color(llllllllllllIllIlIIllIllIlIlIIIl, llllllllllllIllIlIIllIllIlIlIIII, llllllllllllIllIlIIllIllIlIIllll, 1.0f).endVertex();
                ++llllllllllllIllIlIIllIllIlIlIIlI;
            }
            llllllllllllIllIlIIllIllIllIIllI.draw();
            llllllllllllIllIlIIllIllIllIIlIl.begin(RenderLiving.llIlIllIIIllll[4], DefaultVertexFormats.POSITION_COLOR);
            int llllllllllllIllIlIIllIllIlIIllIl = RenderLiving.llIlIllIIIllll[1];
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
            while (!lIIlIlIlIIIIlIll(llllllllllllIllIlIIllIllIlIIllIl, RenderLiving.llIlIllIIIllll[3])) {
                float llllllllllllIllIlIIllIllIlIIllII = 0.5f;
                float llllllllllllIllIlIIllIllIlIIlIll = 0.4f;
                float llllllllllllIllIlIIllIllIlIIlIlI = 0.3f;
                if (lIIlIlIlIIIIlIII(llllllllllllIllIlIIllIllIlIIllIl % RenderLiving.llIlIllIIIllll[5])) {
                    llllllllllllIllIlIIllIllIlIIllII *= 0.7f;
                    llllllllllllIllIlIIllIllIlIIlIll *= 0.7f;
                    llllllllllllIllIlIIllIllIlIIlIlI *= 0.7f;
                }
                final float llllllllllllIllIlIIllIllIlIIlIIl = llllllllllllIllIlIIllIllIlIIllIl / 24.0f;
                llllllllllllIllIlIIllIllIllIIlIl.pos(llllllllllllIllIlIIllIllIlIIIllI + llllllllllllIllIlIIllIllIlIlIlll * llllllllllllIllIlIIllIllIlIIlIIl + 0.0, llllllllllllIllIlIIllIllIlIIIlIl + llllllllllllIllIlIIllIllIlIlIllI * (llllllllllllIllIlIIllIllIlIIlIIl * llllllllllllIllIlIIllIllIlIIlIIl + llllllllllllIllIlIIllIllIlIIlIIl) * 0.5 + ((24.0f - llllllllllllIllIlIIllIllIlIIllIl) / 18.0f + 0.125f) + 0.025, llllllllllllIllIlIIllIllIlIIIlII + llllllllllllIllIlIIllIllIlIlIlIl * llllllllllllIllIlIIllIllIlIIlIIl).color(llllllllllllIllIlIIllIllIlIIllII, llllllllllllIllIlIIllIllIlIIlIll, llllllllllllIllIlIIllIllIlIIlIlI, 1.0f).endVertex();
                llllllllllllIllIlIIllIllIllIIlIl.pos(llllllllllllIllIlIIllIllIlIIIllI + llllllllllllIllIlIIllIllIlIlIlll * llllllllllllIllIlIIllIllIlIIlIIl + 0.025, llllllllllllIllIlIIllIllIlIIIlIl + llllllllllllIllIlIIllIllIlIlIllI * (llllllllllllIllIlIIllIllIlIIlIIl * llllllllllllIllIlIIllIllIlIIlIIl + llllllllllllIllIlIIllIllIlIIlIIl) * 0.5 + ((24.0f - llllllllllllIllIlIIllIllIlIIllIl) / 18.0f + 0.125f), llllllllllllIllIlIIllIllIlIIIlII + llllllllllllIllIlIIllIllIlIlIlIl * llllllllllllIllIlIIllIllIlIIlIIl + 0.025).color(llllllllllllIllIlIIllIllIlIIllII, llllllllllllIllIlIIllIllIlIIlIll, llllllllllllIllIlIIllIllIlIIlIlI, 1.0f).endVertex();
                ++llllllllllllIllIlIIllIllIlIIllIl;
            }
            llllllllllllIllIlIIllIllIllIIllI.draw();
            GlStateManager.enableLighting();
            GlStateManager.enableTexture2D();
            GlStateManager.enableCull();
        }
    }
    
    private static boolean lIIlIlIlIIIIlIll(final int llllllllllllIllIlIIllIllIIIIlIII, final int llllllllllllIllIlIIllIllIIIIIlll) {
        return llllllllllllIllIlIIllIllIIIIlIII > llllllllllllIllIlIIllIllIIIIIlll;
    }
    
    private static boolean lIIlIlIlIIIIlIII(final int llllllllllllIllIlIIllIlIllllllIl) {
        return llllllllllllIllIlIIllIlIllllllIl == 0;
    }
    
    private static boolean lIIlIlIlIIIIIlll(final int llllllllllllIllIlIIllIlIllllllll) {
        return llllllllllllIllIlIIllIlIllllllll != 0;
    }
    
    private double interpolateValue(final double llllllllllllIllIlIIllIlllIIlIIIl, final double llllllllllllIllIlIIllIlllIIlIIll, final double llllllllllllIllIlIIllIlllIIIllll) {
        return llllllllllllIllIlIIllIlllIIlIIIl + (llllllllllllIllIlIIllIlllIIlIIll - llllllllllllIllIlIIllIlllIIlIIIl) * llllllllllllIllIlIIllIlllIIIllll;
    }
    
    public RenderLiving(final RenderManager llllllllllllIllIlIIllIllllIllIll, final ModelBase llllllllllllIllIlIIllIllllIllIlI, final float llllllllllllIllIlIIllIllllIlllIl) {
        super(llllllllllllIllIlIIllIllllIllIll, llllllllllllIllIlIIllIllllIllIlI, llllllllllllIllIlIIllIllllIlllIl);
    }
    
    @Override
    public boolean shouldRender(final T llllllllllllIllIlIIllIllllIIIIll, final ICamera llllllllllllIllIlIIllIllllIIIIlI, final double llllllllllllIllIlIIllIllllIIlIII, final double llllllllllllIllIlIIllIllllIIIIII, final double llllllllllllIllIlIIllIlllIllllll) {
        if (lIIlIlIlIIIIIlll(super.shouldRender(llllllllllllIllIlIIllIllllIIIIll, llllllllllllIllIlIIllIllllIIIIlI, llllllllllllIllIlIIllIllllIIlIII, llllllllllllIllIlIIllIllllIIIIII, llllllllllllIllIlIIllIlllIllllll) ? 1 : 0)) {
            return RenderLiving.llIlIllIIIllll[0] != 0;
        }
        if (lIIlIlIlIIIIIlll(llllllllllllIllIlIIllIllllIIIIll.getLeashed() ? 1 : 0) && lIIlIlIlIIIIlIlI(llllllllllllIllIlIIllIllllIIIIll.getLeashedToEntity())) {
            final Entity llllllllllllIllIlIIllIllllIIIlIl = llllllllllllIllIlIIllIllllIIIIll.getLeashedToEntity();
            return llllllllllllIllIlIIllIllllIIIIlI.isBoundingBoxInFrustum(llllllllllllIllIlIIllIllllIIIlIl.getEntityBoundingBox());
        }
        return RenderLiving.llIlIllIIIllll[1] != 0;
    }
    
    @Override
    public void doRender(final T llllllllllllIllIlIIllIlllIllIlIl, final double llllllllllllIllIlIIllIlllIlIllIl, final double llllllllllllIllIlIIllIlllIllIIll, final double llllllllllllIllIlIIllIlllIllIIlI, final float llllllllllllIllIlIIllIlllIlIlIlI, final float llllllllllllIllIlIIllIlllIlIlIIl) {
        super.doRender(llllllllllllIllIlIIllIlllIllIlIl, llllllllllllIllIlIIllIlllIlIllIl, llllllllllllIllIlIIllIlllIllIIll, llllllllllllIllIlIIllIlllIllIIlI, llllllllllllIllIlIIllIlllIlIlIlI, llllllllllllIllIlIIllIlllIlIlIIl);
        this.renderLeash(llllllllllllIllIlIIllIlllIllIlIl, llllllllllllIllIlIIllIlllIlIllIl, llllllllllllIllIlIIllIlllIllIIll, llllllllllllIllIlIIllIlllIllIIlI, llllllllllllIllIlIIllIlllIlIlIlI, llllllllllllIllIlIIllIlllIlIlIIl);
    }
    
    @Override
    protected boolean canRenderName(final T llllllllllllIllIlIIllIllllIlIlIl) {
        if (lIIlIlIlIIIIIlll(super.canRenderName(llllllllllllIllIlIIllIllllIlIlIl) ? 1 : 0) && (!lIIlIlIlIIIIlIII(llllllllllllIllIlIIllIllllIlIlIl.getAlwaysRenderNameTagForRender() ? 1 : 0) || (lIIlIlIlIIIIIlll(llllllllllllIllIlIIllIllllIlIlIl.hasCustomName() ? 1 : 0) && lIIlIlIlIIIIlIIl(llllllllllllIllIlIIllIllllIlIlIl, this.renderManager.pointedEntity)))) {
            return RenderLiving.llIlIllIIIllll[0] != 0;
        }
        return RenderLiving.llIlIllIIIllll[1] != 0;
    }
    
    public void func_177105_a(final T llllllllllllIllIlIIllIlllIlIIIlI, final float llllllllllllIllIlIIllIlllIlIIIIl) {
        final int llllllllllllIllIlIIllIlllIlIIIII = llllllllllllIllIlIIllIlllIlIIIlI.getBrightnessForRender(llllllllllllIllIlIIllIlllIlIIIIl);
        final int llllllllllllIllIlIIllIlllIIlllll = llllllllllllIllIlIIllIlllIlIIIII % RenderLiving.llIlIllIIIllll[2];
        final int llllllllllllIllIlIIllIlllIIllllI = llllllllllllIllIlIIllIlllIlIIIII / RenderLiving.llIlIllIIIllll[2];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIllIlIIllIlllIIlllll / 1.0f, llllllllllllIllIlIIllIlllIIllllI / 1.0f);
    }
}
