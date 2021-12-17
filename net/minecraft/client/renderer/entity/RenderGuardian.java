// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.util.AxisAlignedBB;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelGuardian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityGuardian;

public class RenderGuardian extends RenderLiving<EntityGuardian>
{
    private static final /* synthetic */ String[] lllIIlllllllIl;
    /* synthetic */ int field_177115_a;
    private static final /* synthetic */ ResourceLocation GUARDIAN_ELDER_TEXTURE;
    private static final /* synthetic */ ResourceLocation GUARDIAN_BEAM_TEXTURE;
    private static final /* synthetic */ ResourceLocation GUARDIAN_TEXTURE;
    private static final /* synthetic */ int[] lllIIllllllllI;
    
    private static void lIlIIIIlIIllIlII() {
        (lllIIllllllllI = new int[13])[0] = ((0x14 ^ 0x3C) & ~(0x3 ^ 0x2B));
        RenderGuardian.lllIIllllllllI[1] = " ".length();
        RenderGuardian.lllIIllllllllI[2] = "  ".length();
        RenderGuardian.lllIIllllllllI[3] = (0xFFFFEFFB & 0x1DE5);
        RenderGuardian.lllIIllllllllI[4] = (-(0xFFFFDB77 & 0x759A) & (0xFFFFFF17 & 0x79FB));
        RenderGuardian.lllIIllllllllI[5] = (-(0xFFFFD75B & 0x7ABD) & (0xFFFFFF7B & 0x7A9F));
        RenderGuardian.lllIIllllllllI[6] = (-(0xFFFFD4FF & 0x6FB9) & (0xFFFFD7FA & 0x6FBF));
        RenderGuardian.lllIIllllllllI[7] = (0x67 ^ 0x74 ^ (0x19 ^ 0xD));
        RenderGuardian.lllIIllllllllI[8] = (0xE4 ^ 0xA4);
        RenderGuardian.lllIIllllllllI[9] = (0xAB ^ 0x8B);
        RenderGuardian.lllIIllllllllI[10] = 103 + 111 - 148 + 62;
        RenderGuardian.lllIIllllllllI[11] = 159 + 44 - 138 + 190;
        RenderGuardian.lllIIllllllllI[12] = "   ".length();
    }
    
    public RenderGuardian(final RenderManager llllllllllllIlIlllIlIIIlIllIlIll) {
        super(llllllllllllIlIlllIlIIIlIllIlIll, new ModelGuardian(), 0.5f);
        this.field_177115_a = ((ModelGuardian)this.mainModel).func_178706_a();
    }
    
    private Vec3 func_177110_a(final EntityLivingBase llllllllllllIlIlllIlIIIlIlIIIIlI, final double llllllllllllIlIlllIlIIIlIlIIIIIl, final float llllllllllllIlIlllIlIIIlIlIIIIII) {
        final double llllllllllllIlIlllIlIIIlIlIIIlIl = llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosX + (llllllllllllIlIlllIlIIIlIlIIIIlI.posX - llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosX) * llllllllllllIlIlllIlIIIlIlIIIIII;
        final double llllllllllllIlIlllIlIIIlIlIIIlII = llllllllllllIlIlllIlIIIlIlIIIIIl + llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosY + (llllllllllllIlIlllIlIIIlIlIIIIlI.posY - llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosY) * llllllllllllIlIlllIlIIIlIlIIIIII;
        final double llllllllllllIlIlllIlIIIlIlIIIIll = llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosZ + (llllllllllllIlIlllIlIIIlIlIIIIlI.posZ - llllllllllllIlIlllIlIIIlIlIIIIlI.lastTickPosZ) * llllllllllllIlIlllIlIIIlIlIIIIII;
        return new Vec3(llllllllllllIlIlllIlIIIlIlIIIlIl, llllllllllllIlIlllIlIIIlIlIIIlII, llllllllllllIlIlllIlIIIlIlIIIIll);
    }
    
    @Override
    public void doRender(final EntityGuardian llllllllllllIlIlllIlIIIIllIlIlll, final double llllllllllllIlIlllIlIIIlIIIIlIII, final double llllllllllllIlIlllIlIIIIllIlIlIl, final double llllllllllllIlIlllIlIIIlIIIIIllI, final float llllllllllllIlIlllIlIIIIllIlIIll, final float llllllllllllIlIlllIlIIIlIIIIIlII) {
        if (lIlIIIIlIIllIlll(this.field_177115_a, ((ModelGuardian)this.mainModel).func_178706_a())) {
            this.mainModel = new ModelGuardian();
            this.field_177115_a = ((ModelGuardian)this.mainModel).func_178706_a();
        }
        super.doRender(llllllllllllIlIlllIlIIIIllIlIlll, llllllllllllIlIlllIlIIIlIIIIlIII, llllllllllllIlIlllIlIIIIllIlIlIl, llllllllllllIlIlllIlIIIlIIIIIllI, llllllllllllIlIlllIlIIIIllIlIIll, llllllllllllIlIlllIlIIIlIIIIIlII);
        final EntityLivingBase llllllllllllIlIlllIlIIIlIIIIIIll = llllllllllllIlIlllIlIIIIllIlIlll.getTargetedEntity();
        if (lIlIIIIlIIllIllI(llllllllllllIlIlllIlIIIlIIIIIIll)) {
            final float llllllllllllIlIlllIlIIIlIIIIIIlI = llllllllllllIlIlllIlIIIIllIlIlll.func_175477_p(llllllllllllIlIlllIlIIIlIIIIIlII);
            final Tessellator llllllllllllIlIlllIlIIIlIIIIIIIl = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlIlllIlIIIlIIIIIIII = llllllllllllIlIlllIlIIIlIIIIIIIl.getWorldRenderer();
            this.bindTexture(RenderGuardian.GUARDIAN_BEAM_TEXTURE);
            GL11.glTexParameterf(RenderGuardian.lllIIllllllllI[3], RenderGuardian.lllIIllllllllI[4], 10497.0f);
            GL11.glTexParameterf(RenderGuardian.lllIIllllllllI[3], RenderGuardian.lllIIllllllllI[5], 10497.0f);
            GlStateManager.disableLighting();
            GlStateManager.disableCull();
            GlStateManager.disableBlend();
            GlStateManager.depthMask((boolean)(RenderGuardian.lllIIllllllllI[1] != 0));
            final float llllllllllllIlIlllIlIIIIllllllll = 240.0f;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIlIlllIlIIIIllllllll, llllllllllllIlIlllIlIIIIllllllll);
            GlStateManager.tryBlendFuncSeparate(RenderGuardian.lllIIllllllllI[6], RenderGuardian.lllIIllllllllI[1], RenderGuardian.lllIIllllllllI[1], RenderGuardian.lllIIllllllllI[0]);
            final float llllllllllllIlIlllIlIIIIlllllllI = llllllllllllIlIlllIlIIIIllIlIlll.worldObj.getTotalWorldTime() + llllllllllllIlIlllIlIIIlIIIIIlII;
            final float llllllllllllIlIlllIlIIIIllllllIl = llllllllllllIlIlllIlIIIIlllllllI * 0.5f % 1.0f;
            final float llllllllllllIlIlllIlIIIIllllllII = llllllllllllIlIlllIlIIIIllIlIlll.getEyeHeight();
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)llllllllllllIlIlllIlIIIlIIIIlIII, (float)llllllllllllIlIlllIlIIIIllIlIlIl + llllllllllllIlIlllIlIIIIllllllII, (float)llllllllllllIlIlllIlIIIlIIIIIllI);
            final Vec3 llllllllllllIlIlllIlIIIIlllllIll = this.func_177110_a(llllllllllllIlIlllIlIIIlIIIIIIll, llllllllllllIlIlllIlIIIlIIIIIIll.height * 0.5, llllllllllllIlIlllIlIIIlIIIIIlII);
            final Vec3 llllllllllllIlIlllIlIIIIlllllIlI = this.func_177110_a(llllllllllllIlIlllIlIIIIllIlIlll, llllllllllllIlIlllIlIIIIllllllII, llllllllllllIlIlllIlIIIlIIIIIlII);
            Vec3 llllllllllllIlIlllIlIIIIlllllIIl = llllllllllllIlIlllIlIIIIlllllIll.subtract(llllllllllllIlIlllIlIIIIlllllIlI);
            final double llllllllllllIlIlllIlIIIIlllllIII = llllllllllllIlIlllIlIIIIlllllIIl.lengthVector() + 1.0;
            llllllllllllIlIlllIlIIIIlllllIIl = llllllllllllIlIlllIlIIIIlllllIIl.normalize();
            final float llllllllllllIlIlllIlIIIIllllIlll = (float)Math.acos(llllllllllllIlIlllIlIIIIlllllIIl.yCoord);
            final float llllllllllllIlIlllIlIIIIllllIllI = (float)Math.atan2(llllllllllllIlIlllIlIIIIlllllIIl.zCoord, llllllllllllIlIlllIlIIIIlllllIIl.xCoord);
            GlStateManager.rotate((1.5707964f + -llllllllllllIlIlllIlIIIIllllIllI) * 57.295776f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(llllllllllllIlIlllIlIIIIllllIlll * 57.295776f, 1.0f, 0.0f, 0.0f);
            final int llllllllllllIlIlllIlIIIIllllIlIl = RenderGuardian.lllIIllllllllI[1];
            final double llllllllllllIlIlllIlIIIIllllIlII = llllllllllllIlIlllIlIIIIlllllllI * 0.05 * (1.0 - (llllllllllllIlIlllIlIIIIllllIlIl & RenderGuardian.lllIIllllllllI[1]) * 2.5);
            llllllllllllIlIlllIlIIIlIIIIIIII.begin(RenderGuardian.lllIIllllllllI[7], DefaultVertexFormats.POSITION_TEX_COLOR);
            final float llllllllllllIlIlllIlIIIIllllIIll = llllllllllllIlIlllIlIIIlIIIIIIlI * llllllllllllIlIlllIlIIIlIIIIIIlI;
            final int llllllllllllIlIlllIlIIIIllllIIlI = RenderGuardian.lllIIllllllllI[8] + (int)(llllllllllllIlIlllIlIIIIllllIIll * 240.0f);
            final int llllllllllllIlIlllIlIIIIllllIIIl = RenderGuardian.lllIIllllllllI[9] + (int)(llllllllllllIlIlllIlIIIIllllIIll * 192.0f);
            final int llllllllllllIlIlllIlIIIIllllIIII = RenderGuardian.lllIIllllllllI[10] - (int)(llllllllllllIlIlllIlIIIIllllIIll * 64.0f);
            final double llllllllllllIlIlllIlIIIIlllIllll = llllllllllllIlIlllIlIIIIllllIlIl * 0.2;
            final double llllllllllllIlIlllIlIIIIlllIlllI = llllllllllllIlIlllIlIIIIlllIllll * 1.41;
            final double llllllllllllIlIlllIlIIIIlllIllIl = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 2.356194490192345) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIllII = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 2.356194490192345) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIlIll = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 0.7853981633974483) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIlIlI = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 0.7853981633974483) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIlIIl = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 3.9269908169872414) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIlIII = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 3.9269908169872414) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIIlll = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 5.497787143782138) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIIllI = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 5.497787143782138) * llllllllllllIlIlllIlIIIIlllIlllI;
            final double llllllllllllIlIlllIlIIIIlllIIlIl = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 3.141592653589793) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIlllIIlII = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 3.141592653589793) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIlllIIIll = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 0.0) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIlllIIIlI = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 0.0) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIlllIIIIl = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 1.5707963267948966) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIlllIIIII = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 1.5707963267948966) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIllIlllll = 0.0 + Math.cos(llllllllllllIlIlllIlIIIIllllIlII + 4.71238898038469) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIllIllllI = 0.0 + Math.sin(llllllllllllIlIlllIlIIIIllllIlII + 4.71238898038469) * llllllllllllIlIlllIlIIIIlllIllll;
            final double llllllllllllIlIlllIlIIIIllIlllIl = 0.0;
            final double llllllllllllIlIlllIlIIIIllIlllII = 0.4999;
            final double llllllllllllIlIlllIlIIIIllIllIll = -1.0f + llllllllllllIlIlllIlIIIIllllllIl;
            final double llllllllllllIlIlllIlIIIIllIllIlI = llllllllllllIlIlllIlIIIIlllllIII * (0.5 / llllllllllllIlIlllIlIIIIlllIllll) + llllllllllllIlIlllIlIIIIllIllIll;
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIlIl, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIIlII).tex(0.4999, llllllllllllIlIlllIlIIIIllIllIlI).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIlIl, 0.0, llllllllllllIlIlllIlIIIIlllIIlII).tex(0.4999, llllllllllllIlIlllIlIIIIllIllIll).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIIll, 0.0, llllllllllllIlIlllIlIIIIlllIIIlI).tex(0.0, llllllllllllIlIlllIlIIIIllIllIll).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIIll, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIIIlI).tex(0.0, llllllllllllIlIlllIlIIIIllIllIlI).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIIIl, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIIIII).tex(0.4999, llllllllllllIlIlllIlIIIIllIllIlI).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIIIl, 0.0, llllllllllllIlIlllIlIIIIlllIIIII).tex(0.4999, llllllllllllIlIlllIlIIIIllIllIll).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIllIlllll, 0.0, llllllllllllIlIlllIlIIIIllIllllI).tex(0.0, llllllllllllIlIlllIlIIIIllIllIll).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIllIlllll, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIllIllllI).tex(0.0, llllllllllllIlIlllIlIIIIllIllIlI).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            double llllllllllllIlIlllIlIIIIllIllIIl = 0.0;
            if (lIlIIIIlIIlllIII(llllllllllllIlIlllIlIIIIllIlIlll.ticksExisted % RenderGuardian.lllIIllllllllI[2])) {
                llllllllllllIlIlllIlIIIIllIllIIl = 0.5;
            }
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIllIl, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIllII).tex(0.5, llllllllllllIlIlllIlIIIIllIllIIl + 0.5).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIlIll, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIlIlI).tex(1.0, llllllllllllIlIlllIlIIIIllIllIIl + 0.5).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIIlll, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIIllI).tex(1.0, llllllllllllIlIlllIlIIIIllIllIIl).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIII.pos(llllllllllllIlIlllIlIIIIlllIlIIl, llllllllllllIlIlllIlIIIIlllllIII, llllllllllllIlIlllIlIIIIlllIlIII).tex(0.5, llllllllllllIlIlllIlIIIIllIllIIl).color(llllllllllllIlIlllIlIIIIllllIIlI, llllllllllllIlIlllIlIIIIllllIIIl, llllllllllllIlIlllIlIIIIllllIIII, RenderGuardian.lllIIllllllllI[11]).endVertex();
            llllllllllllIlIlllIlIIIlIIIIIIIl.draw();
            GlStateManager.popMatrix();
        }
    }
    
    private static boolean lIlIIIIlIIlllIIl(final int llllllllllllIlIlllIlIIIIIlIlIIlI, final int llllllllllllIlIlllIlIIIIIlIlIIIl) {
        return llllllllllllIlIlllIlIIIIIlIlIIlI < llllllllllllIlIlllIlIIIIIlIlIIIl;
    }
    
    private static boolean lIlIIIIlIIlllIII(final int llllllllllllIlIlllIIllllIIllIlII) {
        return llllllllllllIlIlllIIllllIIllIlII == 0;
    }
    
    @Override
    protected void preRenderCallback(final EntityGuardian llllllllllllIlIlllIlIIIIlIlIIlII, final float llllllllllllIlIlllIlIIIIlIlIIIll) {
        if (lIlIIIIlIIllIlIl(llllllllllllIlIlllIlIIIIlIlIIlII.isElder() ? 1 : 0)) {
            GlStateManager.scale(2.35f, 2.35f, 2.35f);
        }
    }
    
    static {
        lIlIIIIlIIllIlII();
        lIlIIIIlIIllIIll();
        GUARDIAN_TEXTURE = new ResourceLocation(RenderGuardian.lllIIlllllllIl[RenderGuardian.lllIIllllllllI[0]]);
        GUARDIAN_ELDER_TEXTURE = new ResourceLocation(RenderGuardian.lllIIlllllllIl[RenderGuardian.lllIIllllllllI[1]]);
        GUARDIAN_BEAM_TEXTURE = new ResourceLocation(RenderGuardian.lllIIlllllllIl[RenderGuardian.lllIIllllllllI[2]]);
    }
    
    private static void lIlIIIIlIIllIIll() {
        (lllIIlllllllIl = new String[RenderGuardian.lllIIllllllllI[12]])[RenderGuardian.lllIIllllllllI[0]] = lIlIIIIlIIllIIIl("BxQcFxsBFBdMCx0FDRcXXBYRAhwXGAUNQAMfAw==", "sqdcn");
        RenderGuardian.lllIIlllllllIl[RenderGuardian.lllIIllllllllI[1]] = lIlIIIIlIIllIIlI("Q1yH63GJNqqhUPU3ymiLkwywO49DoLUvuMOSZtUYU/F09yC51YYTpQ==", "sHlWn");
        RenderGuardian.lllIIlllllllIl[RenderGuardian.lllIIllllllllI[2]] = lIlIIIIlIIllIIIl("OAcWFTk+Bx1OKSIWBxU1YwUbAD4oCw8PEy4HDwxiPAwJ", "LbnaL");
    }
    
    private static boolean lIlIIIIlIIllIlll(final int llllllllllllIlIlllIIllllIIllIIIl, final int llllllllllllIlIlllIIllllIIllIIII) {
        return llllllllllllIlIlllIIllllIIllIIIl != llllllllllllIlIlllIIllllIIllIIII;
    }
    
    private static String lIlIIIIlIIllIIIl(String llllllllllllIlIlllIlIIIIIlIlllIl, final String llllllllllllIlIlllIlIIIIIlIlllII) {
        llllllllllllIlIlllIlIIIIIlIlllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIlIIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIlIIIIIllIIIII = new StringBuilder();
        final char[] llllllllllllIlIlllIlIIIIIlIlllll = llllllllllllIlIlllIlIIIIIlIlllII.toCharArray();
        int llllllllllllIlIlllIlIIIIIlIllllI = RenderGuardian.lllIIllllllllI[0];
        final boolean llllllllllllIlIlllIlIIIIIlIllIII = (Object)llllllllllllIlIlllIlIIIIIlIlllIl.toCharArray();
        final long llllllllllllIlIlllIlIIIIIlIlIlll = llllllllllllIlIlllIlIIIIIlIllIII.length;
        Exception llllllllllllIlIlllIlIIIIIlIlIllI = (Exception)RenderGuardian.lllIIllllllllI[0];
        while (lIlIIIIlIIlllIIl((int)llllllllllllIlIlllIlIIIIIlIlIllI, (int)llllllllllllIlIlllIlIIIIIlIlIlll)) {
            final char llllllllllllIlIlllIlIIIIIllIIIll = llllllllllllIlIlllIlIIIIIlIllIII[llllllllllllIlIlllIlIIIIIlIlIllI];
            llllllllllllIlIlllIlIIIIIllIIIII.append((char)(llllllllllllIlIlllIlIIIIIllIIIll ^ llllllllllllIlIlllIlIIIIIlIlllll[llllllllllllIlIlllIlIIIIIlIllllI % llllllllllllIlIlllIlIIIIIlIlllll.length]));
            "".length();
            ++llllllllllllIlIlllIlIIIIIlIllllI;
            ++llllllllllllIlIlllIlIIIIIlIlIllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIlIIIIIllIIIII);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityGuardian llllllllllllIlIlllIlIIIIlIIlllll) {
        ResourceLocation resourceLocation;
        if (lIlIIIIlIIllIlIl(llllllllllllIlIlllIlIIIIlIIlllll.isElder() ? 1 : 0)) {
            resourceLocation = RenderGuardian.GUARDIAN_ELDER_TEXTURE;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            resourceLocation = RenderGuardian.GUARDIAN_TEXTURE;
        }
        return resourceLocation;
    }
    
    private static boolean lIlIIIIlIIllIllI(final Object llllllllllllIlIlllIlIIIIIlIIllll) {
        return llllllllllllIlIlllIlIIIIIlIIllll != null;
    }
    
    private static String lIlIIIIlIIllIIlI(final String llllllllllllIlIlllIlIIIIIlllIIII, final String llllllllllllIlIlllIlIIIIIllIllll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIIIIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIIIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlIIIIIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlIIIIIlllIlII.init(RenderGuardian.lllIIllllllllI[2], llllllllllllIlIlllIlIIIIIlllIlIl);
            return new String(llllllllllllIlIlllIlIIIIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIIIIIlllIIll) {
            llllllllllllIlIlllIlIIIIIlllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean shouldRender(final EntityGuardian llllllllllllIlIlllIlIIIlIlIlIlll, final ICamera llllllllllllIlIlllIlIIIlIlIlllll, final double llllllllllllIlIlllIlIIIlIlIlIlIl, final double llllllllllllIlIlllIlIIIlIlIlllIl, final double llllllllllllIlIlllIlIIIlIlIlllII) {
        if (lIlIIIIlIIllIlIl(super.shouldRender(llllllllllllIlIlllIlIIIlIlIlIlll, llllllllllllIlIlllIlIIIlIlIlllll, llllllllllllIlIlllIlIIIlIlIlIlIl, llllllllllllIlIlllIlIIIlIlIlllIl, llllllllllllIlIlllIlIIIlIlIlllII) ? 1 : 0)) {
            return RenderGuardian.lllIIllllllllI[1] != 0;
        }
        if (lIlIIIIlIIllIlIl(llllllllllllIlIlllIlIIIlIlIlIlll.hasTargetedEntity() ? 1 : 0)) {
            final EntityLivingBase llllllllllllIlIlllIlIIIlIlIllIll = llllllllllllIlIlllIlIIIlIlIlIlll.getTargetedEntity();
            if (lIlIIIIlIIllIllI(llllllllllllIlIlllIlIIIlIlIllIll)) {
                final Vec3 llllllllllllIlIlllIlIIIlIlIllIlI = this.func_177110_a(llllllllllllIlIlllIlIIIlIlIllIll, llllllllllllIlIlllIlIIIlIlIllIll.height * 0.5, 1.0f);
                final Vec3 llllllllllllIlIlllIlIIIlIlIllIIl = this.func_177110_a(llllllllllllIlIlllIlIIIlIlIlIlll, llllllllllllIlIlllIlIIIlIlIlIlll.getEyeHeight(), 1.0f);
                if (lIlIIIIlIIllIlIl(llllllllllllIlIlllIlIIIlIlIlllll.isBoundingBoxInFrustum(AxisAlignedBB.fromBounds(llllllllllllIlIlllIlIIIlIlIllIIl.xCoord, llllllllllllIlIlllIlIIIlIlIllIIl.yCoord, llllllllllllIlIlllIlIIIlIlIllIIl.zCoord, llllllllllllIlIlllIlIIIlIlIllIlI.xCoord, llllllllllllIlIlllIlIIIlIlIllIlI.yCoord, llllllllllllIlIlllIlIIIlIlIllIlI.zCoord)) ? 1 : 0)) {
                    return RenderGuardian.lllIIllllllllI[1] != 0;
                }
            }
        }
        return RenderGuardian.lllIIllllllllI[0] != 0;
    }
    
    private static boolean lIlIIIIlIIllIlIl(final int llllllllllllIlIlllIlIIIIIlIIllIl) {
        return llllllllllllIlIlllIlIIIIIlIIllIl != 0;
    }
}
