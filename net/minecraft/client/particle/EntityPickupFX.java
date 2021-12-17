// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;

public class EntityPickupFX extends EntityFX
{
    private /* synthetic */ float field_174841_aA;
    private /* synthetic */ Entity field_174843_ax;
    private /* synthetic */ int maxAge;
    private /* synthetic */ Entity field_174840_a;
    private static final /* synthetic */ int[] llIlIIllIlIIlI;
    private /* synthetic */ RenderManager field_174842_aB;
    private /* synthetic */ int age;
    
    private static boolean lIIlIIlIllllIIIl(final int llllllllllllIllIlIlllllIIllllIIl, final int llllllllllllIllIlIlllllIIllllIII) {
        return llllllllllllIllIlIlllllIIllllIIl == llllllllllllIllIlIlllllIIllllIII;
    }
    
    @Override
    public void onUpdate() {
        this.age += EntityPickupFX.llIlIIllIlIIlI[2];
        if (lIIlIIlIllllIIIl(this.age, this.maxAge)) {
            this.setDead();
        }
    }
    
    @Override
    public int getFXLayer() {
        return EntityPickupFX.llIlIIllIlIIlI[0];
    }
    
    static {
        lIIlIIlIllllIIII();
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllIlIlllllIlIlIIIll, final Entity llllllllllllIllIlIlllllIlIlIIIlI, final float llllllllllllIllIlIlllllIlIlIIIIl, final float llllllllllllIllIlIlllllIlIlIIIII, final float llllllllllllIllIlIlllllIlIIlllll, final float llllllllllllIllIlIlllllIlIIllllI, final float llllllllllllIllIlIlllllIlIIlllIl, final float llllllllllllIllIlIlllllIlIIlllII) {
        float llllllllllllIllIlIlllllIlIIllIll = (this.age + llllllllllllIllIlIlllllIlIlIIIIl) / this.maxAge;
        llllllllllllIllIlIlllllIlIIllIll *= llllllllllllIllIlIlllllIlIIllIll;
        final double llllllllllllIllIlIlllllIlIIllIlI = this.field_174840_a.posX;
        final double llllllllllllIllIlIlllllIlIIllIIl = this.field_174840_a.posY;
        final double llllllllllllIllIlIlllllIlIIllIII = this.field_174840_a.posZ;
        final double llllllllllllIllIlIlllllIlIIlIlll = this.field_174843_ax.lastTickPosX + (this.field_174843_ax.posX - this.field_174843_ax.lastTickPosX) * llllllllllllIllIlIlllllIlIlIIIIl;
        final double llllllllllllIllIlIlllllIlIIlIllI = this.field_174843_ax.lastTickPosY + (this.field_174843_ax.posY - this.field_174843_ax.lastTickPosY) * llllllllllllIllIlIlllllIlIlIIIIl + this.field_174841_aA;
        final double llllllllllllIllIlIlllllIlIIlIlIl = this.field_174843_ax.lastTickPosZ + (this.field_174843_ax.posZ - this.field_174843_ax.lastTickPosZ) * llllllllllllIllIlIlllllIlIlIIIIl;
        double llllllllllllIllIlIlllllIlIIlIlII = llllllllllllIllIlIlllllIlIIllIlI + (llllllllllllIllIlIlllllIlIIlIlll - llllllllllllIllIlIlllllIlIIllIlI) * llllllllllllIllIlIlllllIlIIllIll;
        double llllllllllllIllIlIlllllIlIIlIIll = llllllllllllIllIlIlllllIlIIllIIl + (llllllllllllIllIlIlllllIlIIlIllI - llllllllllllIllIlIlllllIlIIllIIl) * llllllllllllIllIlIlllllIlIIllIll;
        double llllllllllllIllIlIlllllIlIIlIIlI = llllllllllllIllIlIlllllIlIIllIII + (llllllllllllIllIlIlllllIlIIlIlIl - llllllllllllIllIlIlllllIlIIllIII) * llllllllllllIllIlIlllllIlIIllIll;
        final int llllllllllllIllIlIlllllIlIIlIIIl = this.getBrightnessForRender(llllllllllllIllIlIlllllIlIlIIIIl);
        final int llllllllllllIllIlIlllllIlIIlIIII = llllllllllllIllIlIlllllIlIIlIIIl % EntityPickupFX.llIlIIllIlIIlI[1];
        final int llllllllllllIllIlIlllllIlIIIllll = llllllllllllIllIlIlllllIlIIlIIIl / EntityPickupFX.llIlIIllIlIIlI[1];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIllIlIlllllIlIIlIIII / 1.0f, llllllllllllIllIlIlllllIlIIIllll / 1.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        llllllllllllIllIlIlllllIlIIlIlII -= EntityPickupFX.interpPosX;
        llllllllllllIllIlIlllllIlIIlIIll -= EntityPickupFX.interpPosY;
        llllllllllllIllIlIlllllIlIIlIIlI -= EntityPickupFX.interpPosZ;
        this.field_174842_aB.renderEntityWithPosYaw(this.field_174840_a, (float)llllllllllllIllIlIlllllIlIIlIlII, (float)llllllllllllIllIlIlllllIlIIlIIll, (float)llllllllllllIllIlIlllllIlIIlIIlI, this.field_174840_a.rotationYaw, llllllllllllIllIlIlllllIlIlIIIIl);
        "".length();
    }
    
    public EntityPickupFX(final World llllllllllllIllIlIlllllIlIllllII, final Entity llllllllllllIllIlIlllllIlIllIllI, final Entity llllllllllllIllIlIlllllIlIllIlIl, final float llllllllllllIllIlIlllllIlIllIlII) {
        super(llllllllllllIllIlIlllllIlIllllII, llllllllllllIllIlIlllllIlIllIllI.posX, llllllllllllIllIlIlllllIlIllIllI.posY, llllllllllllIllIlIlllllIlIllIllI.posZ, llllllllllllIllIlIlllllIlIllIllI.motionX, llllllllllllIllIlIlllllIlIllIllI.motionY, llllllllllllIllIlIlllllIlIllIllI.motionZ);
        this.field_174842_aB = Minecraft.getMinecraft().getRenderManager();
        this.field_174840_a = llllllllllllIllIlIlllllIlIllIllI;
        this.field_174843_ax = llllllllllllIllIlIlllllIlIllIlIl;
        this.maxAge = EntityPickupFX.llIlIIllIlIIlI[0];
        this.field_174841_aA = llllllllllllIllIlIlllllIlIllIlII;
    }
    
    private static void lIIlIIlIllllIIII() {
        (llIlIIllIlIIlI = new int[3])[0] = "   ".length();
        EntityPickupFX.llIlIIllIlIIlI[1] = (0xFFFFB91B & 0x146E4);
        EntityPickupFX.llIlIIllIlIIlI[2] = " ".length();
    }
}
