// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.projectile.EntityFishHook;

public class RenderFish extends Render<EntityFishHook>
{
    private static final /* synthetic */ int[] lIIlIlllIllIlI;
    private static final /* synthetic */ ResourceLocation FISH_PARTICLES;
    private static final /* synthetic */ String[] lIIlIlllIlIlll;
    
    private static boolean llIlIlIIIIIllIl(final int lllllllllllllIIllIIIIIIllIlIllll) {
        return lllllllllllllIIllIIIIIIllIlIllll != 0;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityFishHook lllllllllllllIIllIIIIIIlllIllIlI) {
        return RenderFish.FISH_PARTICLES;
    }
    
    private static boolean llIlIlIIIIIlIll(final int lllllllllllllIIllIIIIIIllIlIllIl) {
        return lllllllllllllIIllIIIIIIllIlIllIl <= 0;
    }
    
    private static void llIlIlIIIIIIlll() {
        (lIIlIlllIlIlll = new String[RenderFish.lIIlIlllIllIlI[1]])[RenderFish.lIIlIlllIllIlI[0]] = llIlIlIIIIIIllI("Biq81/qC6eIK9R0QkkdWTt1RWNHQTTKivEbVjIW9SQY=", "XkxRk");
    }
    
    private static void llIlIlIIIIIlIIl() {
        (lIIlIlllIllIlI = new int[8])[0] = ((112 + 81 - 84 + 49 ^ 174 + 59 - 164 + 121) & (81 + 166 - 203 + 126 ^ 134 + 13 - 45 + 36 ^ -" ".length()));
        RenderFish.lIIlIlllIllIlI[1] = " ".length();
        RenderFish.lIIlIlllIllIlI[2] = "  ".length();
        RenderFish.lIIlIlllIllIlI[3] = (0x7C ^ 0x56 ^ (0x54 ^ 0x79));
        RenderFish.lIIlIlllIllIlI[4] = "   ".length();
        RenderFish.lIIlIlllIllIlI[5] = (0x64 ^ 0x74);
        RenderFish.lIIlIlllIllIlI[6] = 18 + 63 + 67 + 107;
        RenderFish.lIIlIlllIllIlI[7] = (0xEC ^ 0x98 ^ (0x8 ^ 0x74));
    }
    
    private static boolean llIlIlIIIIIlIlI(final Object lllllllllllllIIllIIIIIIllIllIIIl) {
        return lllllllllllllIIllIIIIIIllIllIIIl != null;
    }
    
    private static String llIlIlIIIIIIllI(final String lllllllllllllIIllIIIIIIllIlllllI, final String lllllllllllllIIllIIIIIIllIllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIIIIlllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), RenderFish.lIIlIlllIllIlI[7]), "DES");
            final Cipher lllllllllllllIIllIIIIIIlllIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIllIIIIIIlllIIIIlI.init(RenderFish.lIIlIlllIllIlI[2], lllllllllllllIIllIIIIIIlllIIIIll);
            return new String(lllllllllllllIIllIIIIIIlllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIIllIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIIIIlllIIIIIl) {
            lllllllllllllIIllIIIIIIlllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    public RenderFish(final RenderManager lllllllllllllIIllIIIIIlIIllIlIII) {
        super(lllllllllllllIIllIIIIIlIIllIlIII);
    }
    
    static {
        llIlIlIIIIIlIIl();
        llIlIlIIIIIIlll();
        FISH_PARTICLES = new ResourceLocation(RenderFish.lIIlIlllIlIlll[RenderFish.lIIlIlllIllIlI[0]]);
    }
    
    @Override
    public void doRender(final EntityFishHook lllllllllllllIIllIIIIIlIIIIIIIII, final double lllllllllllllIIllIIIIIlIIIlIIllI, final double lllllllllllllIIllIIIIIIllllllllI, final double lllllllllllllIIllIIIIIlIIIlIIlII, final float lllllllllllllIIllIIIIIIlllllllII, final float lllllllllllllIIllIIIIIIllllllIll) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIllIIIIIlIIIlIIllI, (float)lllllllllllllIIllIIIIIIllllllllI, (float)lllllllllllllIIllIIIIIlIIIlIIlII);
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(0.5f, 0.5f, 0.5f);
        this.bindEntityTexture(lllllllllllllIIllIIIIIlIIIIIIIII);
        "".length();
        final Tessellator lllllllllllllIIllIIIIIlIIIlIIIIl = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIllIIIIIlIIIlIIIII = lllllllllllllIIllIIIIIlIIIlIIIIl.getWorldRenderer();
        final int lllllllllllllIIllIIIIIlIIIIlllll = RenderFish.lIIlIlllIllIlI[1];
        final int lllllllllllllIIllIIIIIlIIIIllllI = RenderFish.lIIlIlllIllIlI[2];
        final float lllllllllllllIIllIIIIIlIIIIlllIl = 0.0625f;
        final float lllllllllllllIIllIIIIIlIIIIlllII = 0.125f;
        final float lllllllllllllIIllIIIIIlIIIIllIll = 0.125f;
        final float lllllllllllllIIllIIIIIlIIIIllIlI = 0.1875f;
        final float lllllllllllllIIllIIIIIlIIIIllIIl = 1.0f;
        final float lllllllllllllIIllIIIIIlIIIIllIII = 0.5f;
        final float lllllllllllllIIllIIIIIlIIIIlIlll = 0.5f;
        GlStateManager.rotate(180.0f - this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        lllllllllllllIIllIIIIIlIIIlIIIII.begin(RenderFish.lIIlIlllIllIlI[3], DefaultVertexFormats.POSITION_TEX_NORMAL);
        lllllllllllllIIllIIIIIlIIIlIIIII.pos(-0.5, -0.5, 0.0).tex(0.0625, 0.1875).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIllIIIIIlIIIlIIIII.pos(0.5, -0.5, 0.0).tex(0.125, 0.1875).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIllIIIIIlIIIlIIIII.pos(0.5, 0.5, 0.0).tex(0.125, 0.125).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIllIIIIIlIIIlIIIII.pos(-0.5, 0.5, 0.0).tex(0.0625, 0.125).normal(0.0f, 1.0f, 0.0f).endVertex();
        lllllllllllllIIllIIIIIlIIIlIIIIl.draw();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        if (llIlIlIIIIIlIlI(lllllllllllllIIllIIIIIlIIIIIIIII.angler)) {
            final float lllllllllllllIIllIIIIIlIIIIlIllI = lllllllllllllIIllIIIIIlIIIIIIIII.angler.getSwingProgress(lllllllllllllIIllIIIIIIllllllIll);
            final float lllllllllllllIIllIIIIIlIIIIlIlIl = MathHelper.sin(MathHelper.sqrt_float(lllllllllllllIIllIIIIIlIIIIlIllI) * 3.1415927f);
            Vec3 lllllllllllllIIllIIIIIlIIIIlIlII = new Vec3(-0.36, 0.03, 0.35);
            lllllllllllllIIllIIIIIlIIIIlIlII = lllllllllllllIIllIIIIIlIIIIlIlII.rotatePitch(-(lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRotationPitch + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.rotationPitch - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRotationPitch) * lllllllllllllIIllIIIIIIllllllIll) * 3.1415927f / 180.0f);
            lllllllllllllIIllIIIIIlIIIIlIlII = lllllllllllllIIllIIIIIlIIIIlIlII.rotateYaw(-(lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRotationYaw + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.rotationYaw - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRotationYaw) * lllllllllllllIIllIIIIIIllllllIll) * 3.1415927f / 180.0f);
            lllllllllllllIIllIIIIIlIIIIlIlII = lllllllllllllIIllIIIIIlIIIIlIlII.rotateYaw(lllllllllllllIIllIIIIIlIIIIlIlIl * 0.5f);
            lllllllllllllIIllIIIIIlIIIIlIlII = lllllllllllllIIllIIIIIlIIIIlIlII.rotatePitch(-lllllllllllllIIllIIIIIlIIIIlIlIl * 0.7f);
            double lllllllllllllIIllIIIIIlIIIIlIIll = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosX + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posX - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosX) * lllllllllllllIIllIIIIIIllllllIll + lllllllllllllIIllIIIIIlIIIIlIlII.xCoord;
            double lllllllllllllIIllIIIIIlIIIIlIIlI = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosY + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posY - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosY) * lllllllllllllIIllIIIIIIllllllIll + lllllllllllllIIllIIIIIlIIIIlIlII.yCoord;
            double lllllllllllllIIllIIIIIlIIIIlIIIl = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosZ + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posZ - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosZ) * lllllllllllllIIllIIIIIIllllllIll + lllllllllllllIIllIIIIIlIIIIlIlII.zCoord;
            double lllllllllllllIIllIIIIIlIIIIlIIII = lllllllllllllIIllIIIIIlIIIIIIIII.angler.getEyeHeight();
            if ((llIlIlIIIIIlIlI(this.renderManager.options) && !llIlIlIIIIIlIll(this.renderManager.options.thirdPersonView)) || llIlIlIIIIIllII(lllllllllllllIIllIIIIIlIIIIIIIII.angler, Minecraft.getMinecraft().thePlayer)) {
                final float lllllllllllllIIllIIIIIlIIIIIllll = (lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRenderYawOffset + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.renderYawOffset - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevRenderYawOffset) * lllllllllllllIIllIIIIIIllllllIll) * 3.1415927f / 180.0f;
                final double lllllllllllllIIllIIIIIlIIIIIlllI = MathHelper.sin(lllllllllllllIIllIIIIIlIIIIIllll);
                final double lllllllllllllIIllIIIIIlIIIIIllIl = MathHelper.cos(lllllllllllllIIllIIIIIlIIIIIllll);
                final double lllllllllllllIIllIIIIIlIIIIIllII = 0.35;
                final double lllllllllllllIIllIIIIIlIIIIIlIll = 0.8;
                lllllllllllllIIllIIIIIlIIIIlIIll = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosX + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posX - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosX) * lllllllllllllIIllIIIIIIllllllIll - lllllllllllllIIllIIIIIlIIIIIllIl * 0.35 - lllllllllllllIIllIIIIIlIIIIIlllI * 0.8;
                lllllllllllllIIllIIIIIlIIIIlIIlI = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosY + lllllllllllllIIllIIIIIlIIIIlIIII + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posY - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosY) * lllllllllllllIIllIIIIIIllllllIll - 0.45;
                lllllllllllllIIllIIIIIlIIIIlIIIl = lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosZ + (lllllllllllllIIllIIIIIlIIIIIIIII.angler.posZ - lllllllllllllIIllIIIIIlIIIIIIIII.angler.prevPosZ) * lllllllllllllIIllIIIIIIllllllIll - lllllllllllllIIllIIIIIlIIIIIlllI * 0.35 + lllllllllllllIIllIIIIIlIIIIIllIl * 0.8;
                double n;
                if (llIlIlIIIIIllIl(lllllllllllllIIllIIIIIlIIIIIIIII.angler.isSneaking() ? 1 : 0)) {
                    n = -0.1875;
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else {
                    n = 0.0;
                }
                lllllllllllllIIllIIIIIlIIIIlIIII = n;
            }
            final double lllllllllllllIIllIIIIIlIIIIIlIlI = lllllllllllllIIllIIIIIlIIIIIIIII.prevPosX + (lllllllllllllIIllIIIIIlIIIIIIIII.posX - lllllllllllllIIllIIIIIlIIIIIIIII.prevPosX) * lllllllllllllIIllIIIIIIllllllIll;
            final double lllllllllllllIIllIIIIIlIIIIIlIIl = lllllllllllllIIllIIIIIlIIIIIIIII.prevPosY + (lllllllllllllIIllIIIIIlIIIIIIIII.posY - lllllllllllllIIllIIIIIlIIIIIIIII.prevPosY) * lllllllllllllIIllIIIIIIllllllIll + 0.25;
            final double lllllllllllllIIllIIIIIlIIIIIlIII = lllllllllllllIIllIIIIIlIIIIIIIII.prevPosZ + (lllllllllllllIIllIIIIIlIIIIIIIII.posZ - lllllllllllllIIllIIIIIlIIIIIIIII.prevPosZ) * lllllllllllllIIllIIIIIIllllllIll;
            final double lllllllllllllIIllIIIIIlIIIIIIlll = (float)(lllllllllllllIIllIIIIIlIIIIlIIll - lllllllllllllIIllIIIIIlIIIIIlIlI);
            final double lllllllllllllIIllIIIIIlIIIIIIllI = (float)(lllllllllllllIIllIIIIIlIIIIlIIlI - lllllllllllllIIllIIIIIlIIIIIlIIl) + lllllllllllllIIllIIIIIlIIIIlIIII;
            final double lllllllllllllIIllIIIIIlIIIIIIlIl = (float)(lllllllllllllIIllIIIIIlIIIIlIIIl - lllllllllllllIIllIIIIIlIIIIIlIII);
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            lllllllllllllIIllIIIIIlIIIlIIIII.begin(RenderFish.lIIlIlllIllIlI[4], DefaultVertexFormats.POSITION_COLOR);
            final int lllllllllllllIIllIIIIIlIIIIIIlII = RenderFish.lIIlIlllIllIlI[5];
            int lllllllllllllIIllIIIIIlIIIIIIIll = RenderFish.lIIlIlllIllIlI[0];
            "".length();
            if ((66 + 107 - 41 + 24 ^ 11 + 119 + 22 + 1) <= 0) {
                return;
            }
            while (!llIlIlIIIIIlllI(lllllllllllllIIllIIIIIlIIIIIIIll, RenderFish.lIIlIlllIllIlI[5])) {
                final float lllllllllllllIIllIIIIIlIIIIIIIlI = lllllllllllllIIllIIIIIlIIIIIIIll / 16.0f;
                lllllllllllllIIllIIIIIlIIIlIIIII.pos(lllllllllllllIIllIIIIIlIIIlIIllI + lllllllllllllIIllIIIIIlIIIIIIlll * lllllllllllllIIllIIIIIlIIIIIIIlI, lllllllllllllIIllIIIIIIllllllllI + lllllllllllllIIllIIIIIlIIIIIIllI * (lllllllllllllIIllIIIIIlIIIIIIIlI * lllllllllllllIIllIIIIIlIIIIIIIlI + lllllllllllllIIllIIIIIlIIIIIIIlI) * 0.5 + 0.25, lllllllllllllIIllIIIIIlIIIlIIlII + lllllllllllllIIllIIIIIlIIIIIIlIl * lllllllllllllIIllIIIIIlIIIIIIIlI).color(RenderFish.lIIlIlllIllIlI[0], RenderFish.lIIlIlllIllIlI[0], RenderFish.lIIlIlllIllIlI[0], RenderFish.lIIlIlllIllIlI[6]).endVertex();
                ++lllllllllllllIIllIIIIIlIIIIIIIll;
            }
            lllllllllllllIIllIIIIIlIIIlIIIIl.draw();
            GlStateManager.enableLighting();
            GlStateManager.enableTexture2D();
            super.doRender(lllllllllllllIIllIIIIIlIIIIIIIII, lllllllllllllIIllIIIIIlIIIlIIllI, lllllllllllllIIllIIIIIIllllllllI, lllllllllllllIIllIIIIIlIIIlIIlII, lllllllllllllIIllIIIIIIlllllllII, lllllllllllllIIllIIIIIIllllllIll);
        }
    }
    
    private static boolean llIlIlIIIIIllII(final Object lllllllllllllIIllIIIIIIllIllIlII, final Object lllllllllllllIIllIIIIIIllIllIIll) {
        return lllllllllllllIIllIIIIIIllIllIlII != lllllllllllllIIllIIIIIIllIllIIll;
    }
    
    private static boolean llIlIlIIIIIlllI(final int lllllllllllllIIllIIIIIIllIlllIII, final int lllllllllllllIIllIIIIIIllIllIlll) {
        return lllllllllllllIIllIIIIIIllIlllIII > lllllllllllllIIllIIIIIIllIllIlll;
    }
}
