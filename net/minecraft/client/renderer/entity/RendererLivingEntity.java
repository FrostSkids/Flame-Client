// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.scoreboard.Team;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import java.util.List;
import java.nio.FloatBuffer;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;

public abstract class RendererLivingEntity<T extends EntityLivingBase> extends Render<T>
{
    protected /* synthetic */ ModelBase mainModel;
    protected /* synthetic */ boolean renderOutlines;
    private static final /* synthetic */ Logger logger;
    protected /* synthetic */ FloatBuffer brightnessBuffer;
    protected /* synthetic */ List<LayerRenderer<T>> layerRenderers;
    private static final /* synthetic */ String[] lIIlIIllIlllll;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$scoreboard$Team$EnumVisible;
    private static final /* synthetic */ int[] lIIlIIllllIlll;
    private static final /* synthetic */ DynamicTexture field_177096_e;
    
    private static boolean llIIllllIIIllII(final int lllllllllllllIIllIlIlIIlIIIllIIl) {
        return lllllllllllllIIllIlIlIIlIIIllIIl <= 0;
    }
    
    static {
        llIIlllIlllllll();
        llIIlllIIlIIlII();
        logger = LogManager.getLogger();
        field_177096_e = new DynamicTexture(RendererLivingEntity.lIIlIIllllIlll[0], RendererLivingEntity.lIIlIIllllIlll[0]);
        final int[] lllllllllllllIIllIlIlIlIllIllIIl = RendererLivingEntity.field_177096_e.getTextureData();
        int lllllllllllllIIllIlIlIlIllIllIII = RendererLivingEntity.lIIlIIllllIlll[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIllllIIIIIIl(lllllllllllllIIllIlIlIlIllIllIII, RendererLivingEntity.lIIlIIllllIlll[3])) {
            lllllllllllllIIllIlIlIlIllIllIIl[lllllllllllllIIllIlIlIlIllIllIII] = RendererLivingEntity.lIIlIIllllIlll[2];
            ++lllllllllllllIIllIlIlIlIllIllIII;
        }
        RendererLivingEntity.field_177096_e.updateDynamicTexture();
    }
    
    protected boolean setDoRenderBrightness(final T lllllllllllllIIllIlIlIlIIlIIIIIl, final float lllllllllllllIIllIlIlIlIIlIIIIII) {
        return this.setBrightness(lllllllllllllIIllIlIlIlIIlIIIIIl, lllllllllllllIIllIlIlIlIIlIIIIII, (boolean)(RendererLivingEntity.lIIlIIllllIlll[5] != 0));
    }
    
    private static boolean llIIllllIIIlIIl(final int lllllllllllllIIllIlIlIIlIIIlIlll) {
        return lllllllllllllIIllIlIlIIlIIIlIlll > 0;
    }
    
    protected float handleRotationFloat(final T lllllllllllllIIllIlIlIIlllllIIIl, final float lllllllllllllIIllIlIlIIllllIlllI) {
        return lllllllllllllIIllIlIlIIlllllIIIl.ticksExisted + lllllllllllllIIllIlIlIIllllIlllI;
    }
    
    private static boolean llIIllllIIIIlIl(final int lllllllllllllIIllIlIlIIlIIIllIll) {
        return lllllllllllllIIllIlIlIIlIIIllIll < 0;
    }
    
    @Override
    public void doRender(final T lllllllllllllIIllIlIlIlIlIIIIlll, final double lllllllllllllIIllIlIlIlIlIIllIlI, final double lllllllllllllIIllIlIlIlIlIIllIIl, final double lllllllllllllIIllIlIlIlIlIIIIlII, final float lllllllllllllIIllIlIlIlIlIIIIIll, final float lllllllllllllIIllIlIlIlIlIIIIIlI) {
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        this.mainModel.swingProgress = this.getSwingProgress(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIIIlI);
        this.mainModel.isRiding = lllllllllllllIIllIlIlIlIlIIIIlll.isRiding();
        this.mainModel.isChild = lllllllllllllIIllIlIlIlIlIIIIlll.isChild();
        try {
            float lllllllllllllIIllIlIlIlIlIIlIlIl = this.interpolateRotation(lllllllllllllIIllIlIlIlIlIIIIlll.prevRenderYawOffset, lllllllllllllIIllIlIlIlIlIIIIlll.renderYawOffset, lllllllllllllIIllIlIlIlIlIIIIIlI);
            final float lllllllllllllIIllIlIlIlIlIIlIlII = this.interpolateRotation(lllllllllllllIIllIlIlIlIlIIIIlll.prevRotationYawHead, lllllllllllllIIllIlIlIlIlIIIIlll.rotationYawHead, lllllllllllllIIllIlIlIlIlIIIIIlI);
            float lllllllllllllIIllIlIlIlIlIIlIIll = lllllllllllllIIllIlIlIlIlIIlIlII - lllllllllllllIIllIlIlIlIlIIlIlIl;
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIlIIIIlll.isRiding() ? 1 : 0) && llIIllllIIIlIII((lllllllllllllIIllIlIlIlIlIIIIlll.ridingEntity instanceof EntityLivingBase) ? 1 : 0)) {
                final EntityLivingBase lllllllllllllIIllIlIlIlIlIIlIIlI = (EntityLivingBase)lllllllllllllIIllIlIlIlIlIIIIlll.ridingEntity;
                lllllllllllllIIllIlIlIlIlIIlIlIl = this.interpolateRotation(lllllllllllllIIllIlIlIlIlIIlIIlI.prevRenderYawOffset, lllllllllllllIIllIlIlIlIlIIlIIlI.renderYawOffset, lllllllllllllIIllIlIlIlIlIIIIIlI);
                lllllllllllllIIllIlIlIlIlIIlIIll = lllllllllllllIIllIlIlIlIlIIlIlII - lllllllllllllIIllIlIlIlIlIIlIlIl;
                float lllllllllllllIIllIlIlIlIlIIlIIIl = MathHelper.wrapAngleTo180_float(lllllllllllllIIllIlIlIlIlIIlIIll);
                if (llIIllllIIIIlIl(llIIllllIIIIllI(lllllllllllllIIllIlIlIlIlIIlIIIl, -85.0f))) {
                    lllllllllllllIIllIlIlIlIlIIlIIIl = -85.0f;
                }
                if (llIIllllIIIIlII(llIIllllIIIIlll(lllllllllllllIIllIlIlIlIlIIlIIIl, 85.0f))) {
                    lllllllllllllIIllIlIlIlIlIIlIIIl = 85.0f;
                }
                lllllllllllllIIllIlIlIlIlIIlIlIl = lllllllllllllIIllIlIlIlIlIIlIlII - lllllllllllllIIllIlIlIlIlIIlIIIl;
                if (llIIllllIIIlIIl(llIIllllIIIIlll(lllllllllllllIIllIlIlIlIlIIlIIIl * lllllllllllllIIllIlIlIlIlIIlIIIl, 2500.0f))) {
                    lllllllllllllIIllIlIlIlIlIIlIlIl += lllllllllllllIIllIlIlIlIlIIlIIIl * 0.2f;
                }
            }
            final float lllllllllllllIIllIlIlIlIlIIlIIII = lllllllllllllIIllIlIlIlIlIIIIlll.prevRotationPitch + (lllllllllllllIIllIlIlIlIlIIIIlll.rotationPitch - lllllllllllllIIllIlIlIlIlIIIIlll.prevRotationPitch) * lllllllllllllIIllIlIlIlIlIIIIIlI;
            this.renderLivingAt(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIllIlI, lllllllllllllIIllIlIlIlIlIIllIIl, lllllllllllllIIllIlIlIlIlIIIIlII);
            final float lllllllllllllIIllIlIlIlIlIIIllll = this.handleRotationFloat(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIIIlI);
            this.rotateCorpse(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIllll, lllllllllllllIIllIlIlIlIlIIlIlIl, lllllllllllllIIllIlIlIlIlIIIIIlI);
            GlStateManager.enableRescaleNormal();
            GlStateManager.scale(-1.0f, -1.0f, 1.0f);
            this.preRenderCallback(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIIIlI);
            final float lllllllllllllIIllIlIlIlIlIIIlllI = 0.0625f;
            GlStateManager.translate(0.0f, -1.5078125f, 0.0f);
            float lllllllllllllIIllIlIlIlIlIIIllIl = lllllllllllllIIllIlIlIlIlIIIIlll.prevLimbSwingAmount + (lllllllllllllIIllIlIlIlIlIIIIlll.limbSwingAmount - lllllllllllllIIllIlIlIlIlIIIIlll.prevLimbSwingAmount) * lllllllllllllIIllIlIlIlIlIIIIIlI;
            float lllllllllllllIIllIlIlIlIlIIIllII = lllllllllllllIIllIlIlIlIlIIIIlll.limbSwing - lllllllllllllIIllIlIlIlIlIIIIlll.limbSwingAmount * (1.0f - lllllllllllllIIllIlIlIlIlIIIIIlI);
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIlIIIIlll.isChild() ? 1 : 0)) {
                lllllllllllllIIllIlIlIlIlIIIllII *= 3.0f;
            }
            if (llIIllllIIIlIIl(llIIllllIIIIlll(lllllllllllllIIllIlIlIlIlIIIllIl, 1.0f))) {
                lllllllllllllIIllIlIlIlIlIIIllIl = 1.0f;
            }
            GlStateManager.enableAlpha();
            this.mainModel.setLivingAnimations(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIllII, lllllllllllllIIllIlIlIlIlIIIllIl, lllllllllllllIIllIlIlIlIlIIIIIlI);
            this.mainModel.setRotationAngles(lllllllllllllIIllIlIlIlIlIIIllII, lllllllllllllIIllIlIlIlIlIIIllIl, lllllllllllllIIllIlIlIlIlIIIllll, lllllllllllllIIllIlIlIlIlIIlIIll, lllllllllllllIIllIlIlIlIlIIlIIII, 0.0625f, lllllllllllllIIllIlIlIlIlIIIIlll);
            if (llIIllllIIIlIII(this.renderOutlines ? 1 : 0)) {
                final boolean lllllllllllllIIllIlIlIlIlIIIlIll = this.setScoreTeamColor(lllllllllllllIIllIlIlIlIlIIIIlll);
                this.renderModel(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIllII, lllllllllllllIIllIlIlIlIlIIIllIl, lllllllllllllIIllIlIlIlIlIIIllll, lllllllllllllIIllIlIlIlIlIIlIIll, lllllllllllllIIllIlIlIlIlIIlIIII, 0.0625f);
                if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIlIIIlIll ? 1 : 0)) {
                    this.unsetScoreTeamColor();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            }
            else {
                final boolean lllllllllllllIIllIlIlIlIlIIIlIlI = this.setDoRenderBrightness(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIIIlI);
                this.renderModel(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIllII, lllllllllllllIIllIlIlIlIlIIIllIl, lllllllllllllIIllIlIlIlIlIIIllll, lllllllllllllIIllIlIlIlIlIIlIIll, lllllllllllllIIllIlIlIlIlIIlIIII, 0.0625f);
                if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIlIIIlIlI ? 1 : 0)) {
                    this.unsetBrightness();
                }
                GlStateManager.depthMask((boolean)(RendererLivingEntity.lIIlIIllllIlll[5] != 0));
                if (!llIIllllIIIlIII((lllllllllllllIIllIlIlIlIlIIIIlll instanceof EntityPlayer) ? 1 : 0) || llIIllllIIIlIlI(((EntityPlayer)lllllllllllllIIllIlIlIlIlIIIIlll).isSpectator() ? 1 : 0)) {
                    this.renderLayers(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIIllII, lllllllllllllIIllIlIlIlIlIIIllIl, lllllllllllllIIllIlIlIlIlIIIIIlI, lllllllllllllIIllIlIlIlIlIIIllll, lllllllllllllIIllIlIlIlIlIIlIIll, lllllllllllllIIllIlIlIlIlIIlIIII, 0.0625f);
                }
            }
            GlStateManager.disableRescaleNormal();
            "".length();
            if ((0x21 ^ 0x25) > (0x74 ^ 0x70)) {
                return;
            }
        }
        catch (Exception lllllllllllllIIllIlIlIlIlIIIlIIl) {
            RendererLivingEntity.logger.error(RendererLivingEntity.lIIlIIllIlllll[RendererLivingEntity.lIIlIIllllIlll[1]], (Throwable)lllllllllllllIIllIlIlIlIlIIIlIIl);
        }
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        if (llIIllllIIIlIlI(this.renderOutlines ? 1 : 0)) {
            super.doRender(lllllllllllllIIllIlIlIlIlIIIIlll, lllllllllllllIIllIlIlIlIlIIllIlI, lllllllllllllIIllIlIlIlIlIIllIIl, lllllllllllllIIllIlIlIlIlIIIIlII, lllllllllllllIIllIlIlIlIlIIIIIll, lllllllllllllIIllIlIlIlIlIIIIIlI);
        }
    }
    
    private static boolean llIIllllIIlIIlI(final int lllllllllllllIIllIlIlIIlIIlIllII, final int lllllllllllllIIllIlIlIIlIIlIlIll) {
        return lllllllllllllIIllIlIlIIlIIlIllII < lllllllllllllIIllIlIlIIlIIlIlIll;
    }
    
    private static int llIIllllIIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int llIIllllIIIIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public ModelBase getMainModel() {
        return this.mainModel;
    }
    
    private static boolean llIIllllIIIlIII(final int lllllllllllllIIllIlIlIIlIIlIIIIl) {
        return lllllllllllllIIllIlIlIIlIIlIIIIl != 0;
    }
    
    private static boolean llIIllllIIIlIlI(final int lllllllllllllIIllIlIlIIlIIIlllll) {
        return lllllllllllllIIllIlIlIIlIIIlllll == 0;
    }
    
    protected boolean setBrightness(final T lllllllllllllIIllIlIlIlIIIlIllll, final float lllllllllllllIIllIlIlIlIIIlIlllI, final boolean lllllllllllllIIllIlIlIlIIIlIIIIl) {
        final float lllllllllllllIIllIlIlIlIIIlIllII = lllllllllllllIIllIlIlIlIIIlIllll.getBrightness(lllllllllllllIIllIlIlIlIIIlIlllI);
        final int lllllllllllllIIllIlIlIlIIIlIlIll = this.getColorMultiplier(lllllllllllllIIllIlIlIlIIIlIllll, lllllllllllllIIllIlIlIlIIIlIllII, lllllllllllllIIllIlIlIlIIIlIlllI);
        int n;
        if (llIIllllIIIlIIl(lllllllllllllIIllIlIlIlIIIlIlIll >> RendererLivingEntity.lIIlIIllllIlll[13] & RendererLivingEntity.lIIlIIllllIlll[8])) {
            n = RendererLivingEntity.lIIlIIllllIlll[5];
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((0x62 ^ 0x5E ^ (0xFA ^ 0xC0)) & (0xB4 ^ 0x8F ^ (0x51 ^ 0x6C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = RendererLivingEntity.lIIlIIllllIlll[1];
        }
        final boolean lllllllllllllIIllIlIlIlIIIlIlIlI = n != 0;
        int n2;
        if (llIIllllIIIllII(lllllllllllllIIllIlIlIlIIIlIllll.hurtTime) && llIIllllIIIllII(lllllllllllllIIllIlIlIlIIIlIllll.deathTime)) {
            n2 = RendererLivingEntity.lIIlIIllllIlll[1];
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x8B ^ 0xB4) & ~(0x66 ^ 0x59)) != 0x0;
            }
        }
        else {
            n2 = RendererLivingEntity.lIIlIIllllIlll[5];
        }
        final boolean lllllllllllllIIllIlIlIlIIIlIlIIl = n2 != 0;
        if (llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIIlIlIlI ? 1 : 0) && llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIIlIlIIl ? 1 : 0)) {
            return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
        }
        if (llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIIlIlIlI ? 1 : 0) && llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIIlIIIIl ? 1 : 0)) {
            return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
        }
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableTexture2D();
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.GL_PRIMARY_COLOR);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[18]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, OpenGlHelper.GL_INTERPOLATE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, OpenGlHelper.GL_CONSTANT);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE2_RGB, OpenGlHelper.GL_CONSTANT);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND2_RGB, RendererLivingEntity.lIIlIIllllIlll[10]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[18]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        this.brightnessBuffer.position(RendererLivingEntity.lIIlIIllllIlll[1]);
        "".length();
        if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIIlIlIIl ? 1 : 0)) {
            this.brightnessBuffer.put(1.0f);
            "".length();
            this.brightnessBuffer.put(0.0f);
            "".length();
            this.brightnessBuffer.put(0.0f);
            "".length();
            this.brightnessBuffer.put(0.3f);
            "".length();
            "".length();
            if ((36 + 34 + 66 + 32 ^ 2 + 66 + 26 + 78) < "  ".length()) {
                return ((0xDF ^ 0x9A ^ (0x3D ^ 0x44)) & (0x22 ^ 0x62 ^ (0xD4 ^ 0xA8) ^ -" ".length())) != 0x0;
            }
        }
        else {
            final float lllllllllllllIIllIlIlIlIIIlIlIII = (lllllllllllllIIllIlIlIlIIIlIlIll >> RendererLivingEntity.lIIlIIllllIlll[13] & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
            final float lllllllllllllIIllIlIlIlIIIlIIlll = (lllllllllllllIIllIlIlIlIIIlIlIll >> RendererLivingEntity.lIIlIIllllIlll[0] & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
            final float lllllllllllllIIllIlIlIlIIIlIIllI = (lllllllllllllIIllIlIlIlIIIlIlIll >> RendererLivingEntity.lIIlIIllllIlll[9] & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
            final float lllllllllllllIIllIlIlIlIIIlIIlIl = (lllllllllllllIIllIlIlIlIIIlIlIll & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
            this.brightnessBuffer.put(lllllllllllllIIllIlIlIlIIIlIIlll);
            "".length();
            this.brightnessBuffer.put(lllllllllllllIIllIlIlIlIIIlIIllI);
            "".length();
            this.brightnessBuffer.put(lllllllllllllIIllIlIlIlIIIlIIlIl);
            "".length();
            this.brightnessBuffer.put(1.0f - lllllllllllllIIllIlIlIlIIIlIlIII);
            "".length();
        }
        this.brightnessBuffer.flip();
        "".length();
        GL11.glTexEnv(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[19], this.brightnessBuffer);
        GlStateManager.setActiveTexture(OpenGlHelper.GL_TEXTURE2);
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(RendererLivingEntity.field_177096_e.getGlTextureId());
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.lightmapTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[18]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
    }
    
    protected void renderLayers(final T lllllllllllllIIllIlIlIIlllIlIlIl, final float lllllllllllllIIllIlIlIIlllIlIlII, final float lllllllllllllIIllIlIlIIlllIllllI, final float lllllllllllllIIllIlIlIIlllIlIIlI, final float lllllllllllllIIllIlIlIIlllIlllII, final float lllllllllllllIIllIlIlIIlllIllIll, final float lllllllllllllIIllIlIlIIlllIIllll, final float lllllllllllllIIllIlIlIIlllIIlllI) {
        final String lllllllllllllIIllIlIlIIlllIIllII = (String)this.layerRenderers.iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!llIIllllIIIlIlI(((Iterator)lllllllllllllIIllIlIlIIlllIIllII).hasNext() ? 1 : 0)) {
            final LayerRenderer<T> lllllllllllllIIllIlIlIIlllIllIII = ((Iterator<LayerRenderer<T>>)lllllllllllllIIllIlIlIIlllIIllII).next();
            final boolean lllllllllllllIIllIlIlIIlllIlIlll = this.setBrightness(lllllllllllllIIllIlIlIIlllIlIlIl, lllllllllllllIIllIlIlIIlllIlIIlI, lllllllllllllIIllIlIlIIlllIllIII.shouldCombineTextures());
            lllllllllllllIIllIlIlIIlllIllIII.doRenderLayer(lllllllllllllIIllIlIlIIlllIlIlIl, lllllllllllllIIllIlIlIIlllIlIlII, lllllllllllllIIllIlIlIIlllIllllI, lllllllllllllIIllIlIlIIlllIlIIlI, lllllllllllllIIllIlIlIIlllIlllII, lllllllllllllIIllIlIlIIlllIllIll, lllllllllllllIIllIlIlIIlllIIllll, lllllllllllllIIllIlIlIIlllIIlllI);
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIIlllIlIlll ? 1 : 0)) {
                this.unsetBrightness();
            }
        }
    }
    
    private static String llIIlllIIlIIIll(final String lllllllllllllIIllIlIlIIlIlIllIll, final String lllllllllllllIIllIlIlIIlIlIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIlIIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIlIIlIlIlllII.getBytes(StandardCharsets.UTF_8)), RendererLivingEntity.lIIlIIllllIlll[9]), "DES");
            final Cipher lllllllllllllIIllIlIlIIlIlIlllll = Cipher.getInstance("DES");
            lllllllllllllIIllIlIlIIlIlIlllll.init(RendererLivingEntity.lIIlIIllllIlll[7], lllllllllllllIIllIlIlIIlIllIIIII);
            return new String(lllllllllllllIIllIlIlIIlIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIlIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIlIIlIlIllllI) {
            lllllllllllllIIllIlIlIIlIlIllllI.printStackTrace();
            return null;
        }
    }
    
    private static int llIIllllIIIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected boolean canRenderName(final T lllllllllllllIIllIlIlIIllIIlIIll) {
        final EntityPlayerSP lllllllllllllIIllIlIlIIllIIlIIlI = Minecraft.getMinecraft().thePlayer;
        if (llIIllllIIIlIII((lllllllllllllIIllIlIlIIllIIlIIll instanceof EntityPlayer) ? 1 : 0) && llIIllllIIlIIII(lllllllllllllIIllIlIlIIllIIlIIll, lllllllllllllIIllIlIlIIllIIlIIlI)) {
            final Team lllllllllllllIIllIlIlIIllIIlIIIl = lllllllllllllIIllIlIlIIllIIlIIll.getTeam();
            final Team lllllllllllllIIllIlIlIIllIIlIIII = lllllllllllllIIllIlIlIIllIIlIIlI.getTeam();
            if (llIIllllIIIlIll(lllllllllllllIIllIlIlIIllIIlIIIl)) {
                final Team.EnumVisible lllllllllllllIIllIlIlIIllIIIllll = lllllllllllllIIllIlIlIIllIIlIIIl.getNameTagVisibility();
                switch ($SWITCH_TABLE$net$minecraft$scoreboard$Team$EnumVisible()[lllllllllllllIIllIlIlIIllIIIllll.ordinal()]) {
                    case 1: {
                        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
                    }
                    case 2: {
                        return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
                    }
                    case 3: {
                        if (llIIllllIIIlIll(lllllllllllllIIllIlIlIIllIIlIIII) && llIIllllIIIlIlI(lllllllllllllIIllIlIlIIllIIlIIIl.isSameTeam(lllllllllllllIIllIlIlIIllIIlIIII) ? 1 : 0)) {
                            return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
                        }
                        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
                    }
                    case 4: {
                        if (llIIllllIIIlIll(lllllllllllllIIllIlIlIIllIIlIIII) && llIIllllIIIlIII(lllllllllllllIIllIlIlIIllIIlIIIl.isSameTeam(lllllllllllllIIllIlIlIIllIIlIIII) ? 1 : 0)) {
                            return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
                        }
                        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
                    }
                    default: {
                        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
                    }
                }
            }
        }
        if (llIIllllIIIlIII(Minecraft.isGuiEnabled() ? 1 : 0) && llIIllllIIlIIII(lllllllllllllIIllIlIlIIllIIlIIll, this.renderManager.livingPlayer) && llIIllllIIIlIlI(lllllllllllllIIllIlIlIIllIIlIIll.isInvisibleToPlayer(lllllllllllllIIllIlIlIIllIIlIIlI) ? 1 : 0) && llIIllllIIlIIIl(lllllllllllllIIllIlIlIIllIIlIIll.riddenByEntity)) {
            return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
        }
        return RendererLivingEntity.lIIlIIllllIlll[1] != 0;
    }
    
    protected void unsetBrightness() {
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableTexture2D();
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.GL_PRIMARY_COLOR);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, OpenGlHelper.defaultTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_ALPHA, OpenGlHelper.GL_PRIMARY_COLOR);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, RendererLivingEntity.lIIlIIllllIlll[20]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[20]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.setActiveTexture(OpenGlHelper.GL_TEXTURE2);
        GlStateManager.disableTexture2D();
        GlStateManager.bindTexture(RendererLivingEntity.lIIlIIllllIlll[1]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], RendererLivingEntity.lIIlIIllllIlll[15], OpenGlHelper.GL_COMBINE);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_RGB, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND1_RGB, RendererLivingEntity.lIIlIIllllIlll[17]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_RGB, RendererLivingEntity.lIIlIIllllIlll[20]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE1_RGB, OpenGlHelper.GL_PREVIOUS);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_COMBINE_ALPHA, RendererLivingEntity.lIIlIIllllIlll[16]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_OPERAND0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[10]);
        GL11.glTexEnvi(RendererLivingEntity.lIIlIIllllIlll[14], OpenGlHelper.GL_SOURCE0_ALPHA, RendererLivingEntity.lIIlIIllllIlll[20]);
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static void llIIlllIlllllll() {
        (lIIlIIllllIlll = new int[24])[0] = (0x48 ^ 0x1E ^ (0x51 ^ 0x17));
        RendererLivingEntity.lIIlIIllllIlll[1] = ((136 + 87 - 166 + 96 ^ 75 + 24 + 7 + 78) & (155 + 41 - 170 + 153 ^ 87 + 4 - 57 + 112 ^ -" ".length()));
        RendererLivingEntity.lIIlIIllllIlll[2] = -" ".length();
        RendererLivingEntity.lIIlIIllllIlll[3] = (0xFFFFFFEF & 0x110);
        RendererLivingEntity.lIIlIIllllIlll[4] = (0xF3 ^ 0xB4 ^ (0xC4 ^ 0x87));
        RendererLivingEntity.lIIlIIllllIlll[5] = " ".length();
        RendererLivingEntity.lIIlIIllllIlll[6] = (-1 & 0xFFFFFF);
        RendererLivingEntity.lIIlIIllllIlll[7] = "  ".length();
        RendererLivingEntity.lIIlIIllllIlll[8] = 18 + 109 - 126 + 254;
        RendererLivingEntity.lIIlIIllllIlll[9] = (0x32 ^ 0x0 ^ (0x8 ^ 0x32));
        RendererLivingEntity.lIIlIIllllIlll[10] = (-(0x4 ^ 0x62) & (0xFFFFBFFF & 0x4367));
        RendererLivingEntity.lIIlIIllllIlll[11] = (-(0xFFFFF46D & 0x7B9B) & (0xFFFFFF8F & 0x737B));
        RendererLivingEntity.lIIlIIllllIlll[12] = (-(0xFFFFFEFD & 0x219B) & (0xFFFFE2BD & 0x3FDE));
        RendererLivingEntity.lIIlIIllllIlll[13] = (0xA6 ^ 0x9E ^ (0x6B ^ 0x4B));
        RendererLivingEntity.lIIlIIllllIlll[14] = (0xFFFFE3E6 & 0x3F19);
        RendererLivingEntity.lIIlIIllllIlll[15] = (-(0xFFFFCCE7 & 0x3BF9) & (0xFFFFEAF5 & 0x3FEA));
        RendererLivingEntity.lIIlIIllllIlll[16] = (-(0xFFFFDCDD & 0x3BE7) & (0xFFFFFDC4 & 0x3BFF));
        RendererLivingEntity.lIIlIIllllIlll[17] = (0xFFFFDB2A & 0x27D5);
        RendererLivingEntity.lIIlIIllllIlll[18] = (-(0xFFFFD177 & 0x6EED) & (0xFFFFFE75 & 0x5FEF));
        RendererLivingEntity.lIIlIIllllIlll[19] = (0xFFFFA6AF & 0x7B51);
        RendererLivingEntity.lIIlIIllllIlll[20] = (-(0xFFFFD14F & 0x6EF9) & (0xFFFFD7DB & 0x7F6E));
        RendererLivingEntity.lIIlIIllllIlll[21] = (0xB1 ^ 0xB6);
        RendererLivingEntity.lIIlIIllllIlll[22] = (-" ".length() & (-1 & 0x20FFFFFF));
        RendererLivingEntity.lIIlIIllllIlll[23] = "   ".length();
    }
    
    protected void rotateCorpse(final T lllllllllllllIIllIlIlIIlllllllll, final float lllllllllllllIIllIlIlIlIIIIIIlIl, final float lllllllllllllIIllIlIlIIllllllllI, final float lllllllllllllIIllIlIlIlIIIIIIIll) {
        GlStateManager.rotate(180.0f - lllllllllllllIIllIlIlIIllllllllI, 0.0f, 1.0f, 0.0f);
        if (llIIllllIIIlIIl(lllllllllllllIIllIlIlIIlllllllll.deathTime)) {
            float lllllllllllllIIllIlIlIlIIIIIIIlI = (lllllllllllllIIllIlIlIIlllllllll.deathTime + lllllllllllllIIllIlIlIlIIIIIIIll - 1.0f) / 20.0f * 1.6f;
            lllllllllllllIIllIlIlIlIIIIIIIlI = MathHelper.sqrt_float(lllllllllllllIIllIlIlIlIIIIIIIlI);
            if (llIIllllIIIlIIl(llIIllllIIIlllI(lllllllllllllIIllIlIlIlIIIIIIIlI, 1.0f))) {
                lllllllllllllIIllIlIlIlIIIIIIIlI = 1.0f;
            }
            GlStateManager.rotate(lllllllllllllIIllIlIlIlIIIIIIIlI * this.getDeathMaxRotation(lllllllllllllIIllIlIlIIlllllllll), 0.0f, 0.0f, 1.0f);
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else {
            final String lllllllllllllIIllIlIlIlIIIIIIIIl = EnumChatFormatting.getTextWithoutFormattingCodes(lllllllllllllIIllIlIlIIlllllllll.getName());
            if (llIIllllIIIlIll(lllllllllllllIIllIlIlIlIIIIIIIIl) && (!llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIIIIIIIl.equals(RendererLivingEntity.lIIlIIllIlllll[RendererLivingEntity.lIIlIIllllIlll[5]]) ? 1 : 0) || llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIIIIIIIl.equals(RendererLivingEntity.lIIlIIllIlllll[RendererLivingEntity.lIIlIIllllIlll[7]]) ? 1 : 0)) && (!llIIllllIIIlIII((lllllllllllllIIllIlIlIIlllllllll instanceof EntityPlayer) ? 1 : 0) || llIIllllIIIlIII(((EntityPlayer)lllllllllllllIIllIlIlIIlllllllll).isWearing(EnumPlayerModelParts.CAPE) ? 1 : 0))) {
                GlStateManager.translate(0.0f, lllllllllllllIIllIlIlIIlllllllll.height + 0.1f, 0.0f);
                GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }
    
    private static boolean llIIllllIIlIIIl(final Object lllllllllllllIIllIlIlIIlIIlIIIll) {
        return lllllllllllllIIllIlIlIIlIIlIIIll == null;
    }
    
    protected float interpolateRotation(final float lllllllllllllIIllIlIlIlIlIllIIIl, final float lllllllllllllIIllIlIlIlIlIllIlII, final float lllllllllllllIIllIlIlIlIlIllIIll) {
        float lllllllllllllIIllIlIlIlIlIllIIlI = lllllllllllllIIllIlIlIlIlIllIlII - lllllllllllllIIllIlIlIlIlIllIIIl;
        "".length();
        if ("   ".length() <= 0) {
            return 0.0f;
        }
        while (!llIIllllIIIIlII(llIIllllIIIIIlI(lllllllllllllIIllIlIlIlIlIllIIlI, -180.0f))) {
            lllllllllllllIIllIlIlIlIlIllIIlI += 360.0f;
        }
        "".length();
        if (-(0x2E ^ 0x2A) >= 0) {
            return 0.0f;
        }
        while (!llIIllllIIIIlIl(llIIllllIIIIIll(lllllllllllllIIllIlIlIlIlIllIIlI, 180.0f))) {
            lllllllllllllIIllIlIlIlIlIllIIlI -= 360.0f;
        }
        return lllllllllllllIIllIlIlIlIlIllIIIl + lllllllllllllIIllIlIlIlIlIllIIll * lllllllllllllIIllIlIlIlIlIllIIlI;
    }
    
    protected void renderModel(final T lllllllllllllIIllIlIlIlIIlIIlllI, final float lllllllllllllIIllIlIlIlIIlIlIlll, final float lllllllllllllIIllIlIlIlIIlIlIllI, final float lllllllllllllIIllIlIlIlIIlIlIlIl, final float lllllllllllllIIllIlIlIlIIlIlIlII, final float lllllllllllllIIllIlIlIlIIlIIlIIl, final float lllllllllllllIIllIlIlIlIIlIIlIII) {
        int n;
        if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIlIIlllI.isInvisible() ? 1 : 0)) {
            n = RendererLivingEntity.lIIlIIllllIlll[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            n = RendererLivingEntity.lIIlIIllllIlll[5];
        }
        final boolean lllllllllllllIIllIlIlIlIIlIlIIIl = n != 0;
        int n2;
        if (llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIlIlIIIl ? 1 : 0) && llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIlIIlllI.isInvisibleToPlayer(Minecraft.getMinecraft().thePlayer) ? 1 : 0)) {
            n2 = RendererLivingEntity.lIIlIIllllIlll[5];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            n2 = RendererLivingEntity.lIIlIIllllIlll[1];
        }
        final boolean lllllllllllllIIllIlIlIlIIlIlIIII = n2 != 0;
        if (!llIIllllIIIlIlI(lllllllllllllIIllIlIlIlIIlIlIIIl ? 1 : 0) || llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIlIlIIII ? 1 : 0)) {
            if (llIIllllIIIlIlI(this.bindEntityTexture(lllllllllllllIIllIlIlIlIIlIIlllI) ? 1 : 0)) {
                return;
            }
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIlIlIIII ? 1 : 0)) {
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0f, 1.0f, 1.0f, 0.15f);
                GlStateManager.depthMask((boolean)(RendererLivingEntity.lIIlIIllllIlll[1] != 0));
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(RendererLivingEntity.lIIlIIllllIlll[10], RendererLivingEntity.lIIlIIllllIlll[11]);
                GlStateManager.alphaFunc(RendererLivingEntity.lIIlIIllllIlll[12], 0.003921569f);
            }
            this.mainModel.render(lllllllllllllIIllIlIlIlIIlIIlllI, lllllllllllllIIllIlIlIlIIlIlIlll, lllllllllllllIIllIlIlIlIIlIlIllI, lllllllllllllIIllIlIlIlIIlIlIlIl, lllllllllllllIIllIlIlIlIIlIlIlII, lllllllllllllIIllIlIlIlIIlIIlIIl, lllllllllllllIIllIlIlIlIIlIIlIII);
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIlIIlIlIIII ? 1 : 0)) {
                GlStateManager.disableBlend();
                GlStateManager.alphaFunc(RendererLivingEntity.lIIlIIllllIlll[12], 0.1f);
                GlStateManager.popMatrix();
                GlStateManager.depthMask((boolean)(RendererLivingEntity.lIIlIIllllIlll[5] != 0));
            }
        }
    }
    
    protected boolean setScoreTeamColor(final T lllllllllllllIIllIlIlIlIIlllIIIl) {
        int lllllllllllllIIllIlIlIlIIlllIIII = RendererLivingEntity.lIIlIIllllIlll[6];
        if (llIIllllIIIlIII((lllllllllllllIIllIlIlIlIIlllIIIl instanceof EntityPlayer) ? 1 : 0)) {
            final ScorePlayerTeam lllllllllllllIIllIlIlIlIIllIllll = (ScorePlayerTeam)lllllllllllllIIllIlIlIlIIlllIIIl.getTeam();
            if (llIIllllIIIlIll(lllllllllllllIIllIlIlIlIIllIllll)) {
                final String lllllllllllllIIllIlIlIlIIllIlllI = FontRenderer.getFormatFromString(lllllllllllllIIllIlIlIlIIllIllll.getColorPrefix());
                if (llIIllllIIIIIIl(lllllllllllllIIllIlIlIlIIllIlllI.length(), RendererLivingEntity.lIIlIIllllIlll[7])) {
                    lllllllllllllIIllIlIlIlIIlllIIII = this.getFontRendererFromRenderManager().getColorCode(lllllllllllllIIllIlIlIlIIllIlllI.charAt(RendererLivingEntity.lIIlIIllllIlll[5]));
                }
            }
        }
        final float lllllllllllllIIllIlIlIlIIllIllIl = (lllllllllllllIIllIlIlIlIIlllIIII >> RendererLivingEntity.lIIlIIllllIlll[0] & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
        final float lllllllllllllIIllIlIlIlIIllIllII = (lllllllllllllIIllIlIlIlIIlllIIII >> RendererLivingEntity.lIIlIIllllIlll[9] & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
        final float lllllllllllllIIllIlIlIlIIllIlIll = (lllllllllllllIIllIlIlIlIIlllIIII & RendererLivingEntity.lIIlIIllllIlll[8]) / 255.0f;
        GlStateManager.disableLighting();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.color(lllllllllllllIIllIlIlIlIIllIllIl, lllllllllllllIIllIlIlIlIIllIllII, lllllllllllllIIllIlIlIlIIllIlIll, 1.0f);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        return RendererLivingEntity.lIIlIIllllIlll[5] != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$scoreboard$Team$EnumVisible() {
        final int[] $switch_TABLE$net$minecraft$scoreboard$Team$EnumVisible = RendererLivingEntity.$SWITCH_TABLE$net$minecraft$scoreboard$Team$EnumVisible;
        if (llIIllllIIIlIll($switch_TABLE$net$minecraft$scoreboard$Team$EnumVisible)) {
            return $switch_TABLE$net$minecraft$scoreboard$Team$EnumVisible;
        }
        "".length();
        final byte lllllllllllllIIllIlIlIIlIllIIlIl = (Object)new int[Team.EnumVisible.values().length];
        try {
            lllllllllllllIIllIlIlIIlIllIIlIl[Team.EnumVisible.ALWAYS.ordinal()] = RendererLivingEntity.lIIlIIllllIlll[5];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlIIlIllIIlIl[Team.EnumVisible.HIDE_FOR_OTHER_TEAMS.ordinal()] = RendererLivingEntity.lIIlIIllllIlll[23];
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlIIlIllIIlIl[Team.EnumVisible.HIDE_FOR_OWN_TEAM.ordinal()] = RendererLivingEntity.lIIlIIllllIlll[4];
            "".length();
            if ((0x97 ^ 0xC6 ^ (0x2A ^ 0x7F)) == " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIllIlIlIIlIllIIlIl[Team.EnumVisible.NEVER.ordinal()] = RendererLivingEntity.lIIlIIllllIlll[7];
            "".length();
            if (-(0x3B ^ 0x3F) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return RendererLivingEntity.$SWITCH_TABLE$net$minecraft$scoreboard$Team$EnumVisible = (int[])(Object)lllllllllllllIIllIlIlIIlIllIIlIl;
    }
    
    protected int getColorMultiplier(final T lllllllllllllIIllIlIlIIlllIIIlll, final float lllllllllllllIIllIlIlIIlllIIIllI, final float lllllllllllllIIllIlIlIIlllIIIlIl) {
        return RendererLivingEntity.lIIlIIllllIlll[1];
    }
    
    private static boolean llIIllllIIIIIIl(final int lllllllllllllIIllIlIlIIlIIllIIII, final int lllllllllllllIIllIlIlIIlIIlIllll) {
        return lllllllllllllIIllIlIlIIlIIllIIII >= lllllllllllllIIllIlIlIIlIIlIllll;
    }
    
    private static int llIIllllIIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void renderName(final T lllllllllllllIIllIlIlIIllIllIIll, final double lllllllllllllIIllIlIlIIllIlIIlIl, final double lllllllllllllIIllIlIlIIllIlIIlII, final double lllllllllllllIIllIlIlIIllIllIIII) {
        if (llIIllllIIIlIII(this.canRenderName(lllllllllllllIIllIlIlIIllIllIIll) ? 1 : 0)) {
            final double lllllllllllllIIllIlIlIIllIlIllll = lllllllllllllIIllIlIlIIllIllIIll.getDistanceSqToEntity(this.renderManager.livingPlayer);
            float n;
            if (llIIllllIIIlIII(lllllllllllllIIllIlIlIIllIllIIll.isSneaking() ? 1 : 0)) {
                n = 32.0f;
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            }
            else {
                n = 64.0f;
            }
            final float lllllllllllllIIllIlIlIIllIlIlllI = n;
            if (llIIllllIIIIlIl(llIIllllIIIllll(lllllllllllllIIllIlIlIIllIlIllll, lllllllllllllIIllIlIlIIllIlIlllI * lllllllllllllIIllIlIlIIllIlIlllI))) {
                final String lllllllllllllIIllIlIlIIllIlIllIl = lllllllllllllIIllIlIlIIllIllIIll.getDisplayName().getFormattedText();
                final float lllllllllllllIIllIlIlIIllIlIllII = 0.02666667f;
                GlStateManager.alphaFunc(RendererLivingEntity.lIIlIIllllIlll[12], 0.1f);
                if (llIIllllIIIlIII(lllllllllllllIIllIlIlIIllIllIIll.isSneaking() ? 1 : 0)) {
                    final FontRenderer lllllllllllllIIllIlIlIIllIlIlIll = this.getFontRendererFromRenderManager();
                    GlStateManager.pushMatrix();
                    final float lllllllllllllIIlIlIIllIlIIIlIlll = (float)lllllllllllllIIllIlIlIIllIlIIlIl;
                    final float n2 = (float)lllllllllllllIIllIlIlIIllIlIIlII + lllllllllllllIIllIlIlIIllIllIIll.height + 0.5f;
                    float n3;
                    if (llIIllllIIIlIII(lllllllllllllIIllIlIlIIllIllIIll.isChild() ? 1 : 0)) {
                        n3 = lllllllllllllIIllIlIlIIllIllIIll.height / 2.0f;
                        "".length();
                        if (-(0x42 ^ 0x46) > 0) {
                            return;
                        }
                    }
                    else {
                        n3 = 0.0f;
                    }
                    GlStateManager.translate(lllllllllllllIIlIlIIllIlIIIlIlll, n2 - n3, (float)lllllllllllllIIllIlIlIIllIllIIII);
                    GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                    GlStateManager.rotate(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
                    GlStateManager.rotate(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
                    GlStateManager.scale(-0.02666667f, -0.02666667f, 0.02666667f);
                    GlStateManager.translate(0.0f, 9.374999f, 0.0f);
                    GlStateManager.disableLighting();
                    GlStateManager.depthMask((boolean)(RendererLivingEntity.lIIlIIllllIlll[1] != 0));
                    GlStateManager.enableBlend();
                    GlStateManager.disableTexture2D();
                    GlStateManager.tryBlendFuncSeparate(RendererLivingEntity.lIIlIIllllIlll[10], RendererLivingEntity.lIIlIIllllIlll[11], RendererLivingEntity.lIIlIIllllIlll[5], RendererLivingEntity.lIIlIIllllIlll[1]);
                    final int lllllllllllllIIllIlIlIIllIlIlIlI = lllllllllllllIIllIlIlIIllIlIlIll.getStringWidth(lllllllllllllIIllIlIlIIllIlIllIl) / RendererLivingEntity.lIIlIIllllIlll[7];
                    final Tessellator lllllllllllllIIllIlIlIIllIlIlIIl = Tessellator.getInstance();
                    final WorldRenderer lllllllllllllIIllIlIlIIllIlIlIII = lllllllllllllIIllIlIlIIllIlIlIIl.getWorldRenderer();
                    lllllllllllllIIllIlIlIIllIlIlIII.begin(RendererLivingEntity.lIIlIIllllIlll[21], DefaultVertexFormats.POSITION_COLOR);
                    lllllllllllllIIllIlIlIIllIlIlIII.pos(-lllllllllllllIIllIlIlIIllIlIlIlI - RendererLivingEntity.lIIlIIllllIlll[5], -1.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    lllllllllllllIIllIlIlIIllIlIlIII.pos(-lllllllllllllIIllIlIlIIllIlIlIlI - RendererLivingEntity.lIIlIIllllIlll[5], 8.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    lllllllllllllIIllIlIlIIllIlIlIII.pos(lllllllllllllIIllIlIlIIllIlIlIlI + RendererLivingEntity.lIIlIIllllIlll[5], 8.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    lllllllllllllIIllIlIlIIllIlIlIII.pos(lllllllllllllIIllIlIlIIllIlIlIlI + RendererLivingEntity.lIIlIIllllIlll[5], -1.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    lllllllllllllIIllIlIlIIllIlIlIIl.draw();
                    GlStateManager.enableTexture2D();
                    GlStateManager.depthMask((boolean)(RendererLivingEntity.lIIlIIllllIlll[5] != 0));
                    lllllllllllllIIllIlIlIIllIlIlIll.drawString(lllllllllllllIIllIlIlIIllIlIllIl, -lllllllllllllIIllIlIlIIllIlIlIll.getStringWidth(lllllllllllllIIllIlIlIIllIlIllIl) / RendererLivingEntity.lIIlIIllllIlll[7], RendererLivingEntity.lIIlIIllllIlll[1], RendererLivingEntity.lIIlIIllllIlll[22]);
                    "".length();
                    GlStateManager.enableLighting();
                    GlStateManager.disableBlend();
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.popMatrix();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else {
                    double n4;
                    if (llIIllllIIIlIII(lllllllllllllIIllIlIlIIllIllIIll.isChild() ? 1 : 0)) {
                        n4 = lllllllllllllIIllIlIlIIllIllIIll.height / 2.0f;
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                    }
                    else {
                        n4 = 0.0;
                    }
                    this.renderOffsetLivingLabel(lllllllllllllIIllIlIlIIllIllIIll, lllllllllllllIIllIlIlIIllIlIIlIl, lllllllllllllIIllIlIlIIllIlIIlII - n4, lllllllllllllIIllIlIlIIllIllIIII, lllllllllllllIIllIlIlIIllIlIllIl, 0.02666667f, lllllllllllllIIllIlIlIIllIlIllll);
                }
            }
        }
    }
    
    private static String llIIlllIIlIIIlI(final String lllllllllllllIIllIlIlIIlIlIIlllI, final String lllllllllllllIIllIlIlIIlIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIlIIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIlIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIlIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIlIIlIlIlIIlI.init(RendererLivingEntity.lIIlIIllllIlll[7], lllllllllllllIIllIlIlIIlIlIlIIll);
            return new String(lllllllllllllIIllIlIlIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIlIIlIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIlIIlIlIlIIIl) {
            lllllllllllllIIllIlIlIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllllIIIIlII(final int lllllllllllllIIllIlIlIIlIIIlllIl) {
        return lllllllllllllIIllIlIlIIlIIIlllIl >= 0;
    }
    
    public void setRenderOutlines(final boolean lllllllllllllIIllIlIlIIllIIIIIll) {
        this.renderOutlines = lllllllllllllIIllIlIlIIllIIIIIll;
    }
    
    protected float getSwingProgress(final T lllllllllllllIIllIlIlIIllllllIII, final float lllllllllllllIIllIlIlIIlllllIlIl) {
        return lllllllllllllIIllIlIlIIllllllIII.getSwingProgress(lllllllllllllIIllIlIlIIlllllIlIl);
    }
    
    private static int llIIllllIIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public RendererLivingEntity(final RenderManager lllllllllllllIIllIlIlIlIllIIllII, final ModelBase lllllllllllllIIllIlIlIlIllIIllll, final float lllllllllllllIIllIlIlIlIllIIlllI) {
        super(lllllllllllllIIllIlIlIlIllIIllII);
        this.brightnessBuffer = GLAllocation.createDirectFloatBuffer(RendererLivingEntity.lIIlIIllllIlll[4]);
        this.layerRenderers = (List<LayerRenderer<T>>)Lists.newArrayList();
        this.renderOutlines = (RendererLivingEntity.lIIlIIllllIlll[1] != 0);
        this.mainModel = lllllllllllllIIllIlIlIlIllIIllll;
        this.shadowSize = lllllllllllllIIllIlIlIlIllIIlllI;
    }
    
    protected void unsetScoreTeamColor() {
        GlStateManager.enableLighting();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static void llIIlllIIlIIlII() {
        (lIIlIIllIlllll = new String[RendererLivingEntity.lIIlIIllllIlll[23]])[RendererLivingEntity.lIIlIIllllIlll[1]] = llIIlllIIlIIIIl("Ehg3IDQ/UDZsIjQZJikicRIsODklDg==", "QwBLP");
        RendererLivingEntity.lIIlIIllIlllll[RendererLivingEntity.lIIlIIllllIlll[5]] = llIIlllIIlIIIlI("wOk1VjNlYGlLZ5Qocstzyw==", "uezhI");
        RendererLivingEntity.lIIlIIllIlllll[RendererLivingEntity.lIIlIIllllIlll[7]] = llIIlllIIlIIIll("MQefmiKqKCc=", "SjOTg");
    }
    
    private static boolean llIIllllIIlIIII(final Object lllllllllllllIIllIlIlIIlIIlIlIII, final Object lllllllllllllIIllIlIlIIlIIlIIlll) {
        return lllllllllllllIIllIlIlIIlIIlIlIII != lllllllllllllIIllIlIlIIlIIlIIlll;
    }
    
    protected void preRenderCallback(final T lllllllllllllIIllIlIlIIlllIIIIll, final float lllllllllllllIIllIlIlIIlllIIIIlI) {
    }
    
    protected <V extends EntityLivingBase, U extends LayerRenderer<V>> boolean addLayer(final U lllllllllllllIIllIlIlIlIllIIIlII) {
        return this.layerRenderers.add((LayerRenderer<T>)lllllllllllllIIllIlIlIlIllIIIlII);
    }
    
    private static boolean llIIllllIIIlIll(final Object lllllllllllllIIllIlIlIIlIIlIIlIl) {
        return lllllllllllllIIllIlIlIIlIIlIIlIl != null;
    }
    
    public void transformHeldFull3DItemLayer() {
    }
    
    protected void renderLivingAt(final T lllllllllllllIIllIlIlIlIIIIlIIll, final double lllllllllllllIIllIlIlIlIIIIlIIlI, final double lllllllllllllIIllIlIlIlIIIIIlllI, final double lllllllllllllIIllIlIlIlIIIIlIIII) {
        GlStateManager.translate((float)lllllllllllllIIllIlIlIlIIIIlIIlI, (float)lllllllllllllIIllIlIlIlIIIIIlllI, (float)lllllllllllllIIllIlIlIlIIIIlIIII);
    }
    
    private static int llIIllllIIIIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected float getDeathMaxRotation(final T lllllllllllllIIllIlIlIIlllIIlIIl) {
        return 90.0f;
    }
    
    protected <V extends EntityLivingBase, U extends LayerRenderer<V>> boolean removeLayer(final U lllllllllllllIIllIlIlIlIllIIIIII) {
        return this.layerRenderers.remove(lllllllllllllIIllIlIlIlIllIIIIII);
    }
    
    private static String llIIlllIIlIIIIl(String lllllllllllllIIllIlIlIIlIIlllIll, final String lllllllllllllIIllIlIlIIlIIlllIlI) {
        lllllllllllllIIllIlIlIIlIIlllIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIlIIlIIlllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIlIIlIIlllllI = new StringBuilder();
        final char[] lllllllllllllIIllIlIlIIlIIllllIl = lllllllllllllIIllIlIlIIlIIlllIlI.toCharArray();
        int lllllllllllllIIllIlIlIIlIIllllII = RendererLivingEntity.lIIlIIllllIlll[1];
        final String lllllllllllllIIllIlIlIIlIIllIllI = (Object)((String)lllllllllllllIIllIlIlIIlIIlllIll).toCharArray();
        final String lllllllllllllIIllIlIlIIlIIllIlIl = (String)lllllllllllllIIllIlIlIIlIIllIllI.length;
        boolean lllllllllllllIIllIlIlIIlIIllIlII = RendererLivingEntity.lIIlIIllllIlll[1] != 0;
        while (llIIllllIIlIIlI(lllllllllllllIIllIlIlIIlIIllIlII ? 1 : 0, (int)lllllllllllllIIllIlIlIIlIIllIlIl)) {
            final char lllllllllllllIIllIlIlIIlIlIIIIIl = lllllllllllllIIllIlIlIIlIIllIllI[lllllllllllllIIllIlIlIIlIIllIlII];
            lllllllllllllIIllIlIlIIlIIlllllI.append((char)(lllllllllllllIIllIlIlIIlIlIIIIIl ^ lllllllllllllIIllIlIlIIlIIllllIl[lllllllllllllIIllIlIlIIlIIllllII % lllllllllllllIIllIlIlIIlIIllllIl.length]));
            "".length();
            ++lllllllllllllIIllIlIlIIlIIllllII;
            ++lllllllllllllIIllIlIlIIlIIllIlII;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIlIIlIIlllllI);
    }
}
